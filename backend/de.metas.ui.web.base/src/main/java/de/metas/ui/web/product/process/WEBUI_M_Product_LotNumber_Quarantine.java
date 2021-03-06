package de.metas.ui.web.product.process;

import com.google.common.collect.ImmutableList;
import de.metas.bpartner.BPartnerLocationId;
import de.metas.handlingunits.HuId;
import de.metas.handlingunits.IHUQueryBuilder;
import de.metas.handlingunits.IHandlingUnitsDAO;
import de.metas.distribution.ddorder.DDOrderService;
import de.metas.distribution.ddorder.movement.schedule.DDOrderMoveScheduleService;
import de.metas.distribution.ddorder.producer.HUToDistribute;
import de.metas.handlingunits.inout.IHUInOutDAO;
import de.metas.handlingunits.model.I_M_HU;
import de.metas.handlingunits.model.X_M_HU;
import de.metas.handlingunits.quarantine.HULotNumberQuarantineService;
import de.metas.invoicecandidate.api.IInvoiceCandBL;
import de.metas.process.IProcessPrecondition;
import de.metas.process.ProcessPreconditionsResolution;
import de.metas.product.LotNumberQuarantine;
import de.metas.product.LotNumberQuarantineRepository;
import de.metas.product.ProductId;
import de.metas.ui.web.process.adprocess.ViewBasedProcessTemplate;
import de.metas.ui.web.window.datatypes.DocumentIdsSelection;
import de.metas.util.Check;
import de.metas.util.Services;
import org.adempiere.exceptions.AdempiereException;
import org.adempiere.mm.attributes.api.ILotNumberDateAttributeDAO;
import org.compiere.SpringContextHolder;
import org.compiere.model.I_M_Attribute;
import org.compiere.model.I_M_InOut;

import java.util.ArrayList;
import java.util.List;

/*
 * #%L
 * metasfresh-webui-api
 * %%
 * Copyright (C) 2018 metas GmbH
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program. If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */

/**
 * https://github.com/metasfresh/metasfresh/issues/3693 This process will search
 * for HUs containing products with LotNo attributes that fit the pairs in the
 * selected I_M_Product_LotNumber_Quarantine entries. If such HUs are found, they will
 * all be put in a DD_Order and sent to the Quarantine warehouse.
 *
 * @author metas-dev <dev@metasfresh.com>
 */
public class WEBUI_M_Product_LotNumber_Quarantine extends ViewBasedProcessTemplate
		implements
		IProcessPrecondition
{
	private final LotNumberQuarantineRepository lotNoQuarantineRepo = SpringContextHolder.instance.getBean(LotNumberQuarantineRepository.class);
	private final HULotNumberQuarantineService huLotNoQuarantineService = SpringContextHolder.instance.getBean(HULotNumberQuarantineService.class);

	private final IInvoiceCandBL invoiceCandBL = Services.get(IInvoiceCandBL.class);
	private final IHUInOutDAO huInOutDAO = Services.get(IHUInOutDAO.class);
	private final ILotNumberDateAttributeDAO lotNumberDateAttributeDAO = Services.get(ILotNumberDateAttributeDAO.class);
	private final DDOrderService ddOrderService = SpringContextHolder.instance.getBean(DDOrderService.class);
	private final DDOrderMoveScheduleService ddOrderMoveScheduleService = SpringContextHolder.instance.getBean(DDOrderMoveScheduleService.class);

	private final ArrayList<HUToDistribute> husToQuarantine = new ArrayList<>();

	@Override
	protected String doIt()
	{
		getView().streamByIds(getSelectedRowIds())
				.map(row -> row.getId().toInt())
				.distinct()
				.forEach(this::createQuarantineHUsByLotNoQuarantineId);

		ddOrderService.createQuarantineDDOrderForHUs(husToQuarantine);

		setInvoiceCandsInDispute();

		return MSG_OK;
	}

	private void setInvoiceCandsInDispute()
	{
		husToQuarantine.stream().map(HUToDistribute::getHu)
				.flatMap(hu -> huInOutDAO.retrieveInOutLinesForHU(hu).stream())
				.forEach(invoiceCandBL::markInvoiceCandInDisputeForReceiptLine);
	}

	@Override
	protected ProcessPreconditionsResolution checkPreconditionsApplicable()
	{
		final DocumentIdsSelection selectedRowIds = getSelectedRowIds();
		if (selectedRowIds.isEmpty())
		{
			return ProcessPreconditionsResolution.rejectBecauseNoSelection();
		}

		return ProcessPreconditionsResolution.accept();
	}

	private void createQuarantineHUsByLotNoQuarantineId(final int lotNoQuarantineId)
	{
		final LotNumberQuarantine lotNoQuarantine = lotNoQuarantineRepo.getById(lotNoQuarantineId);

		final I_M_Attribute lotNoAttribute = lotNumberDateAttributeDAO.getLotNumberAttribute();
		if (lotNoAttribute == null)
		{
			throw new AdempiereException("Not lotNo attribute found.");
		}

		final List<I_M_HU> husForAttributeStringValue = retrieveHUsForAttributeStringValue(
				lotNoQuarantine.getProductId(),
				lotNoAttribute,
				lotNoQuarantine.getLotNo());

		for (final I_M_HU hu : husForAttributeStringValue)
		{
			final HuId huId = HuId.ofRepoId(hu.getM_HU_ID());
			if (ddOrderMoveScheduleService.isScheduledToMove(huId))
			{
				// the HU is already quarantined
				continue;
			}
			final List<de.metas.handlingunits.model.I_M_InOutLine> inOutLinesForHU = huInOutDAO.retrieveInOutLinesForHU(hu);
			if (Check.isEmpty(inOutLinesForHU))
			{
				continue;
			}

			huLotNoQuarantineService.markHUAsQuarantine(hu);

			final I_M_InOut firstReceipt = inOutLinesForHU.get(0).getM_InOut();
			final BPartnerLocationId bpLocationId = BPartnerLocationId.ofRepoId(firstReceipt.getC_BPartner_ID(), firstReceipt.getC_BPartner_Location_ID());

			husToQuarantine.add(HUToDistribute.builder()
					.hu(hu)
					.quarantineLotNo(lotNoQuarantine)
					.bpartnerLocationId(bpLocationId)
					.build());
		}

	}

	private List<I_M_HU> retrieveHUsForAttributeStringValue(
			final int productId,
			final I_M_Attribute attribute,
			final String value)
	{
		final IHUQueryBuilder huQueryBuilder = Services.get(IHandlingUnitsDAO.class)
				.createHUQueryBuilder()
				.addOnlyWithAttribute(attribute, value)
				.addHUStatusesToInclude(ImmutableList.of(X_M_HU.HUSTATUS_Picked, X_M_HU.HUSTATUS_Active));

		if (productId > 0)
		{
			huQueryBuilder.addOnlyWithProductId(ProductId.ofRepoId(productId));
		}

		return huQueryBuilder.list();
	}

}
