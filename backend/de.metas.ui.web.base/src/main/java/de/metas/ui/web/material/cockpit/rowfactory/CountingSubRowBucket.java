package de.metas.ui.web.material.cockpit.rowfactory;

import de.metas.material.cockpit.model.I_MD_Cockpit;
import de.metas.material.cockpit.model.I_MD_Stock;
import de.metas.product.IProductBL;
import de.metas.quantity.Quantity;
import de.metas.ui.web.material.cockpit.MaterialCockpitRow;
import de.metas.uom.IUOMDAO;
import de.metas.util.Services;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.ToString;
import org.adempiere.warehouse.WarehouseId;
import org.compiere.model.I_C_UOM;
import org.compiere.util.TimeUtil;

import javax.annotation.Nullable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import static de.metas.quantity.Quantity.addToNullable;
import static de.metas.util.Check.assumeNotNull;

/*
 * #%L
 * metasfresh-webui-api
 * %%
 * Copyright (C) 2017 metas GmbH
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
 * Mutable row representation that is used during the rows' loading
 *
 * @author metas-dev <dev@metasfresh.com>
 *
 */
@EqualsAndHashCode(of = "warehouseId")
@ToString
public class CountingSubRowBucket
{
	public static CountingSubRowBucket create(@Nullable final WarehouseId warehouseId)
	{
		return new CountingSubRowBucket(warehouseId);
	}

	private final WarehouseId warehouseId;

	// Zaehlbestand
	private Quantity qtyStockEstimateCount;

	@Nullable
	private Instant qtyStockEstimateTime;

	private Quantity qtyInventoryCount;

	@Nullable
	private Instant qtyInventoryTime;

	private Quantity qtyStockCurrent;

	private Quantity qtyOnHandStock;

	private final Set<Integer> cockpitRecordIds = new HashSet<>();

	private final Set<Integer> stockRecordIds = new HashSet<>();

	public CountingSubRowBucket(@Nullable final WarehouseId warehouseId)
	{
		this.warehouseId = warehouseId;
	}

	public void addCockpitRecord(@NonNull final I_MD_Cockpit cockpitRecord)
	{
		final IProductBL productBL = Services.get(IProductBL.class);

		final I_C_UOM uom = productBL.getStockUOM(cockpitRecord.getM_Product_ID());

		qtyStockEstimateCount = addToNullable(qtyStockEstimateCount, cockpitRecord.getQtyStockEstimateCount(), uom);
		qtyStockEstimateTime = TimeUtil.max(qtyStockEstimateTime, TimeUtil.asInstant(cockpitRecord.getQtyStockEstimateTime()));

		qtyInventoryCount = addToNullable(qtyInventoryCount, cockpitRecord.getQtyInventoryCount(), uom);
		qtyInventoryTime = TimeUtil.max(qtyInventoryTime, TimeUtil.asInstant(cockpitRecord.getQtyInventoryTime()));

		qtyStockCurrent = addToNullable(qtyStockCurrent, cockpitRecord.getQtyStockCurrent(), uom);

		cockpitRecordIds.add(cockpitRecord.getMD_Cockpit_ID());
	}

	public void addStockRecord(@NonNull final I_MD_Stock stockRecord)
	{
		final IUOMDAO uomDAO = Services.get(IUOMDAO.class);

		final I_C_UOM uom = uomDAO.getById(stockRecord.getM_Product().getC_UOM_ID());

		qtyOnHandStock = addToNullable(qtyOnHandStock, stockRecord.getQtyOnHand(), uom);

		stockRecordIds.add(stockRecord.getMD_Stock_ID());
	}

	@NonNull
	public MaterialCockpitRow createIncludedRow(@NonNull final MainRowWithSubRows mainRowBucket)
	{
		final MainRowBucketId productIdAndDate = assumeNotNull(
				mainRowBucket.getProductIdAndDate(),
				"productIdAndDate may not be null; mainRowBucket={}", mainRowBucket);

		return MaterialCockpitRow.countingSubRowBuilder()
				.date(productIdAndDate.getDate())
				.productId(productIdAndDate.getProductId().getRepoId())
				.warehouseId(warehouseId)
				.qtyStockEstimateCount(qtyStockEstimateCount)
				.qtyStockEstimateTime(qtyStockEstimateTime)
				.qtyInventoryCount(qtyInventoryCount)
				.qtyInventoryTime(qtyInventoryTime)
				.qtyStockCurrent(qtyStockCurrent)
				.qtyOnHandStock(qtyOnHandStock)
				.allIncludedCockpitRecordIds(cockpitRecordIds)
				.allIncludedStockRecordIds(stockRecordIds)
				.build();
	}
}
