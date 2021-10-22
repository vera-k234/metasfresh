package de.metas.handlingunits.ddorder.picking;

import com.google.common.collect.ImmutableList;
import de.metas.handlingunits.HuId;
import de.metas.handlingunits.model.I_DD_OrderLine_HU_Candidate;
import de.metas.handlingunits.model.I_M_HU;
import de.metas.quantity.Quantitys;
import de.metas.uom.UomId;
import de.metas.util.Services;
import lombok.NonNull;
import org.adempiere.ad.dao.ICompositeQueryFilter;
import org.adempiere.ad.dao.IQueryBL;
import org.adempiere.ad.dao.IQueryFilter;
import org.adempiere.model.InterfaceWrapperHelper;
import org.compiere.model.IQuery;
import org.eevolution.api.DDOrderId;
import org.eevolution.api.DDOrderLineId;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@Repository
public class DDOrderPickFromRepository
{
	private static final IQueryBL queryBL = Services.get(IQueryBL.class);

	public IQueryFilter<I_M_HU> getHUsNotAlreadyScheduledToPickFilter()
	{
		final ICompositeQueryFilter<I_M_HU> filter = queryBL.createCompositeQueryFilter(I_M_HU.class);

		// HU Filter: only those which were not already assigned to a DD_OrderLine
		{
			final IQuery<I_DD_OrderLine_HU_Candidate> ddOrderLineHUCandidatesQuery = queryBL.createQueryBuilder(I_DD_OrderLine_HU_Candidate.class)
					.addOnlyActiveRecordsFilter()
					// TODO: only draft ones!
					.create();
			filter.addNotInSubQueryFilter(I_M_HU.COLUMN_M_HU_ID, I_DD_OrderLine_HU_Candidate.COLUMN_M_HU_ID, ddOrderLineHUCandidatesQuery);
		}

		return filter;
	}

	public ImmutableList<DDOrderPickSchedule> addScheduleToPickBulk(@NonNull final List<ScheduleToPickRequest> requests)
	{
		return requests.stream()
				.map(this::addScheduleToPick)
				.collect(ImmutableList.toImmutableList());
	}

	public DDOrderPickSchedule addScheduleToPick(@NonNull final ScheduleToPickRequest request)
	{
		final I_DD_OrderLine_HU_Candidate record = InterfaceWrapperHelper.newInstance(I_DD_OrderLine_HU_Candidate.class);
		//record.setAD_Org_ID(ddOrderline.getAD_Org_ID());
		record.setDD_Order_ID(request.getDdOrderId().getRepoId());
		record.setDD_OrderLine_ID(request.getDdOrderLineId().getRepoId());
		record.setPickFrom_HU_ID(request.getPickFromHUId().getRepoId());
		record.setC_UOM_ID(request.getQtyToPick().getUomId().getRepoId());
		record.setQtyToPick(request.getQtyToPick().toBigDecimal());
		record.setQtyPicked(BigDecimal.ZERO);
		record.setIsPickWholeHU(request.isPickWholeHU());

		InterfaceWrapperHelper.save(record);

		return toDDOrderPickSchedule(record);
	}

	private static DDOrderPickSchedule toDDOrderPickSchedule(final I_DD_OrderLine_HU_Candidate record)
	{
		final UomId uomId = UomId.ofRepoId(record.getC_UOM_ID());

		return DDOrderPickSchedule.builder()
				.id(DDOrderPickScheduleId.ofRepoId(record.getDD_OrderLine_HU_Candidate_ID()))
				.ddOrderId(DDOrderId.ofRepoId(record.getDD_Order_ID()))
				.ddOrderLineId(DDOrderLineId.ofRepoId(record.getDD_OrderLine_ID()))
				.pickFromHUId(HuId.ofRepoId(record.getPickFrom_HU_ID()))
				.actualHUIdPicked(HuId.ofRepoIdOrNull(record.getM_HU_ID()))
				.qtyToPick(Quantitys.create(record.getQtyToPick(), uomId))
				.isPickWholeHU(record.isPickWholeHU())
				.build();
	}

	public void save(final DDOrderPickSchedule schedule)
	{
		final I_DD_OrderLine_HU_Candidate record = InterfaceWrapperHelper.load(schedule.getId(), I_DD_OrderLine_HU_Candidate.class);
		record.setM_HU_ID(HuId.toRepoId(schedule.getActualHUIdPicked()));
		InterfaceWrapperHelper.save(record);
	}

	public final List<HuId> retrieveHUIdsScheduledToPick(@NonNull final DDOrderLineId ddOrderLineId)
	{
		return queryBL.createQueryBuilder(I_DD_OrderLine_HU_Candidate.class)
				.addOnlyActiveRecordsFilter()
				.addEqualsFilter(I_DD_OrderLine_HU_Candidate.COLUMNNAME_DD_OrderLine_ID, ddOrderLineId)
				.orderBy(I_DD_OrderLine_HU_Candidate.COLUMNNAME_DD_OrderLine_HU_Candidate_ID)
				.create()
				.listDistinct(I_DD_OrderLine_HU_Candidate.COLUMNNAME_M_HU_ID, HuId.class);
	}

	public void removeAllSchedulesForLine(@NonNull final DDOrderLineId ddOrderLineId)
	{
		queryBL.createQueryBuilder(I_DD_OrderLine_HU_Candidate.class)
				.addEqualsFilter(I_DD_OrderLine_HU_Candidate.COLUMNNAME_DD_OrderLine_ID, ddOrderLineId)
				.create()
				.delete();
	}

	public void removeAllSchedulesForOrder(@NonNull final DDOrderId ddOrderId)
	{
		queryBL.createQueryBuilder(I_DD_OrderLine_HU_Candidate.class)
				.addEqualsFilter(I_DD_OrderLine_HU_Candidate.COLUMNNAME_DD_Order_ID, ddOrderId)
				.create()
				.delete();
	}

	public void removeFromHUsScheduledToPickList(@NonNull final DDOrderLineId ddOrderLineId, @NonNull final Set<HuId> huIds)
	{
		if (huIds.isEmpty())
		{
			return;
		}

		//
		// Create the query to select the lines we want to remove
		queryBL.createQueryBuilder(I_DD_OrderLine_HU_Candidate.class)
				.addOnlyActiveRecordsFilter()
				.addEqualsFilter(I_DD_OrderLine_HU_Candidate.COLUMNNAME_DD_OrderLine_ID, ddOrderLineId)
				.addInArrayFilter(I_DD_OrderLine_HU_Candidate.COLUMNNAME_M_HU_ID, huIds)
				.create()
				.delete();
	}

	public boolean isScheduledToPick(@NonNull final HuId huId)
	{
		// TODO: only not processed ones

		return queryBL.createQueryBuilder(I_DD_OrderLine_HU_Candidate.class)
				.addEqualsFilter(I_DD_OrderLine_HU_Candidate.COLUMNNAME_M_HU_ID, huId)
				.create()
				.anyMatch();
	}

	public ImmutableList<DDOrderPickSchedule> getSchedules(final DDOrderId ddOrderId)
	{
		return queryBL.createQueryBuilder(I_DD_OrderLine_HU_Candidate.class)
				.addEqualsFilter(I_DD_OrderLine_HU_Candidate.COLUMNNAME_DD_Order_ID, ddOrderId)
				.orderBy(I_DD_OrderLine_HU_Candidate.COLUMNNAME_DD_OrderLine_ID)
				.orderBy(I_DD_OrderLine_HU_Candidate.COLUMNNAME_DD_OrderLine_HU_Candidate_ID)
				.create()
				.stream()
				.map(DDOrderPickFromRepository::toDDOrderPickSchedule)
				.collect(ImmutableList.toImmutableList());
	}
}
