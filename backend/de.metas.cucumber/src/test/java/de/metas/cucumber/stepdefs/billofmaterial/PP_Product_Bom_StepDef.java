/*
 * #%L
 * de.metas.cucumber
 * %%
 * Copyright (C) 2021 metas GmbH
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

package de.metas.cucumber.stepdefs.billofmaterial;

import de.metas.cucumber.stepdefs.DataTableUtil;
import de.metas.cucumber.stepdefs.StepDefConstants;
import de.metas.cucumber.stepdefs.StepDefData;
import de.metas.util.Check;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import lombok.NonNull;
import org.adempiere.model.InterfaceWrapperHelper;
import org.compiere.model.I_M_AttributeSetInstance;
import org.compiere.model.I_M_Product;
import org.eevolution.api.BOMComponentType;
import org.eevolution.api.BOMType;
import org.eevolution.api.BOMUse;
import org.eevolution.model.I_PP_Product_BOM;
import org.eevolution.model.I_PP_Product_BOMLine;
import org.eevolution.model.I_PP_Product_BOMVersions;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import static de.metas.cucumber.stepdefs.StepDefConstants.TABLECOLUMN_IDENTIFIER;
import static org.adempiere.model.InterfaceWrapperHelper.newInstance;
import static org.adempiere.model.InterfaceWrapperHelper.saveRecord;
import static org.assertj.core.api.Assertions.*;
import static org.eevolution.model.I_PP_Product_Planning.COLUMNNAME_M_AttributeSetInstance_ID;

public class PP_Product_Bom_StepDef
{
	private final StepDefData<I_M_Product> productTable;
	private final StepDefData<I_PP_Product_BOM> productBOMTable;
	private final StepDefData<I_PP_Product_BOMVersions> productBomVersionsTable;
	private final StepDefData<I_PP_Product_BOMLine> productBOMLineTable;
	private final StepDefData<I_M_AttributeSetInstance> attributeSetInstanceTable;

	public PP_Product_Bom_StepDef(
			@NonNull final StepDefData<I_M_Product> productTable,
			@NonNull final StepDefData<I_PP_Product_BOM> productBOMTable,
			@NonNull final StepDefData<I_PP_Product_BOMVersions> productBomVersionsTable,
			@NonNull final StepDefData<I_PP_Product_BOMLine> productBOMLineTable,
			@NonNull final StepDefData<I_M_AttributeSetInstance> attributeSetInstanceTable)
	{
		this.productTable = productTable;
		this.productBOMTable = productBOMTable;
		this.productBomVersionsTable = productBomVersionsTable;
		this.productBOMLineTable = productBOMLineTable;
		this.attributeSetInstanceTable = attributeSetInstanceTable;
	}

	@Given("metasfresh contains PP_Product_BOM")
	public void add_PP_Product_Bom(@NonNull final DataTable dataTable)
	{
		final List<Map<String, String>> tableRows = dataTable.asMaps();
		for (final Map<String, String> tableRow : tableRows)
		{
			createPP_Product_BOM(tableRow);
		}
	}

	@Given("metasfresh contains PP_Product_BOMLines")
	public void add_PP_Product_BOMLine(@NonNull final DataTable dataTable)
	{
		final List<Map<String, String>> tableRows = dataTable.asMaps();
		for (final Map<String, String> tableRow : tableRows)
		{
			createPP_Product_BOMLine(tableRow);
		}
	}

	private void createPP_Product_BOMLine(@NonNull final Map<String, String> tableRow)
	{
		final String bomIdentifier = DataTableUtil.extractStringForColumnName(tableRow, I_PP_Product_BOM.COLUMNNAME_PP_Product_BOM_ID + "." + StepDefConstants.TABLECOLUMN_IDENTIFIER);
		final I_PP_Product_BOM productBOMRecord = productBOMTable.get(bomIdentifier);

		final String productIdentifier = DataTableUtil.extractStringForColumnName(tableRow, I_M_Product.COLUMNNAME_M_Product_ID + "." + StepDefConstants.TABLECOLUMN_IDENTIFIER);
		final I_M_Product productRecord = productTable.get(productIdentifier);

		final I_PP_Product_BOMLine bomLine = InterfaceWrapperHelper.newInstance(I_PP_Product_BOMLine.class);
		bomLine.setPP_Product_BOM_ID(productBOMRecord.getPP_Product_BOM_ID());
		bomLine.setM_Product_ID(productRecord.getM_Product_ID());
		bomLine.setC_UOM_ID(productRecord.getC_UOM_ID());

		bomLine.setComponentType(BOMComponentType.Component.getCode());

		final Timestamp validFrom = DataTableUtil.extractDateTimestampForColumnName(tableRow, I_PP_Product_BOMLine.COLUMNNAME_ValidFrom);
		final BigDecimal qtyBatch = DataTableUtil.extractBigDecimalForColumnName(tableRow, I_PP_Product_BOMLine.COLUMNNAME_QtyBatch);
		bomLine.setQtyBatch(qtyBatch);
		bomLine.setQtyBOM(qtyBatch);
		bomLine.setValidFrom(validFrom);

		final String asiIdentifier = DataTableUtil.extractStringOrNullForColumnName(tableRow, "OPT." + COLUMNNAME_M_AttributeSetInstance_ID + "." + TABLECOLUMN_IDENTIFIER);
		if (Check.isNotBlank(asiIdentifier))
		{
			final I_M_AttributeSetInstance asiRecord = attributeSetInstanceTable.get(asiIdentifier);
			assertThat(asiRecord).isNotNull();

			bomLine.setM_AttributeSetInstance_ID(asiRecord.getM_AttributeSetInstance_ID());
		}

		saveRecord(bomLine);

		final String recordIdentifier = DataTableUtil.extractRecordIdentifier(tableRow, "PP_Product_BOMLine");
		productBOMLineTable.putOrReplace(recordIdentifier, bomLine);
	}

	private void createPP_Product_BOM(@NonNull final Map<String, String> tableRow)
	{
		final I_PP_Product_BOMVersions bomVersions = createBOMVersions(tableRow);

		final String productIdentifier = DataTableUtil.extractStringForColumnName(tableRow, I_M_Product.COLUMNNAME_M_Product_ID + "." + StepDefConstants.TABLECOLUMN_IDENTIFIER);
		final I_M_Product productRecord = productTable.get(productIdentifier);

		final Timestamp validFrom = DataTableUtil.extractDateTimestampForColumnName(tableRow, I_PP_Product_BOM.COLUMNNAME_ValidFrom);

		final I_PP_Product_BOM productBOMRecord = InterfaceWrapperHelper.newInstance(I_PP_Product_BOM.class);
		productBOMRecord.setM_Product_ID(productRecord.getM_Product_ID());
		productBOMRecord.setC_UOM_ID(productRecord.getC_UOM_ID());
		productBOMRecord.setValue(productRecord.getValue());
		productBOMRecord.setName(productRecord.getName());
		productBOMRecord.setBOMType(BOMType.CurrentActive.getCode());
		productBOMRecord.setBOMUse(BOMUse.Manufacturing.getCode());
		productBOMRecord.setValidFrom(validFrom);
		productBOMRecord.setPP_Product_BOMVersions_ID(bomVersions.getPP_Product_BOMVersions_ID());

		final String asiIdentifier = DataTableUtil.extractStringOrNullForColumnName(tableRow, "OPT." + COLUMNNAME_M_AttributeSetInstance_ID + "." + TABLECOLUMN_IDENTIFIER);
		if (Check.isNotBlank(asiIdentifier))
		{
			final I_M_AttributeSetInstance asiRecord = attributeSetInstanceTable.get(asiIdentifier);
			assertThat(asiRecord).isNotNull();

			productBOMRecord.setM_AttributeSetInstance_ID(asiRecord.getM_AttributeSetInstance_ID());
		}

		saveRecord(productBOMRecord);

		productRecord.setIsBOM(true);
		productRecord.setIsVerified(true);
		saveRecord(productRecord);

		final String recordIdentifier = DataTableUtil.extractRecordIdentifier(tableRow, "PP_Product_BOM");
		productBOMTable.putOrReplace(recordIdentifier, productBOMRecord);
	}

	private I_PP_Product_BOMVersions createBOMVersions(@NonNull final Map<String, String> tableRow)
	{
		final String productIdentifier = DataTableUtil.extractStringForColumnName(tableRow, I_M_Product.COLUMNNAME_M_Product_ID + "." + StepDefConstants.TABLECOLUMN_IDENTIFIER);
		final I_M_Product productRecord = productTable.get(productIdentifier);

		final I_PP_Product_BOMVersions bomVersionsRecord = newInstance(I_PP_Product_BOMVersions.class);
		bomVersionsRecord.setM_Product_ID(productRecord.getM_Product_ID());
		bomVersionsRecord.setName(productRecord.getName());

		saveRecord(bomVersionsRecord);

		final String bomVersionsIdentifier = DataTableUtil.extractStringForColumnName(tableRow, I_PP_Product_BOMVersions.COLUMNNAME_PP_Product_BOMVersions_ID + "." + StepDefConstants.TABLECOLUMN_IDENTIFIER);
		productBomVersionsTable.putOrReplace(bomVersionsIdentifier, bomVersionsRecord);

		return bomVersionsRecord;
	}
}