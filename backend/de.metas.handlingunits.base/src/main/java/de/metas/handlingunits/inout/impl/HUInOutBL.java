package de.metas.handlingunits.inout.impl;

/*
 * #%L
 * de.metas.handlingunits.base
 * %%
 * Copyright (C) 2015 metas GmbH
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

import de.metas.document.DocTypeQuery;
import de.metas.document.DocTypeQuery.DocTypeQueryBuilder;
import de.metas.document.IDocTypeDAO;
import de.metas.handlingunits.CompositeDocumentLUTUConfigurationHandler;
import de.metas.handlingunits.IDocumentLUTUConfigurationHandler;
import de.metas.handlingunits.IHUAssignmentBL;
import de.metas.handlingunits.IHUContext;
import de.metas.handlingunits.IHUContextFactory;
import de.metas.handlingunits.IHUWarehouseDAO;
import de.metas.handlingunits.IHandlingUnitsBL;
import de.metas.handlingunits.impl.DocumentLUTUConfigurationManager;
import de.metas.handlingunits.impl.IDocumentLUTUConfigurationManager;
import de.metas.handlingunits.inout.IHUInOutBL;
import de.metas.handlingunits.inout.IHUInOutDAO;
import de.metas.handlingunits.inout.returns.customer.CustomerReturnLUTUConfigurationHandler;
import de.metas.handlingunits.model.I_C_OrderLine;
import de.metas.handlingunits.model.I_M_HU;
import de.metas.handlingunits.model.I_M_HU_PI;
import de.metas.handlingunits.model.I_M_HU_PI_Item_Product;
import de.metas.handlingunits.model.I_M_InOutLine;
import de.metas.handlingunits.model.I_M_Warehouse;
import de.metas.handlingunits.movement.api.IHUMovementBL;
import de.metas.handlingunits.spi.impl.HUPackingMaterialDocumentLineCandidate;
import de.metas.inout.IInOutDAO;
import de.metas.inout.InOutId;
import de.metas.logging.LogManager;
import de.metas.materialtracking.IMaterialTrackingAttributeBL;
import de.metas.materialtracking.model.I_M_Material_Tracking;
import de.metas.util.Check;
import de.metas.util.Services;
import lombok.NonNull;
import org.adempiere.model.InterfaceWrapperHelper;
import org.adempiere.util.lang.IContextAware;
import org.compiere.model.I_C_UOM;
import org.compiere.model.I_M_InOut;
import org.compiere.model.I_M_Product;
import org.compiere.model.X_C_DocType;
import org.slf4j.Logger;

import java.math.BigDecimal;
import java.util.List;

public class HUInOutBL implements IHUInOutBL
{
	private static final Logger logger = LogManager.getLogger(HUInOutBL.class);

	private final IInOutDAO inOutDAO = Services.get(IInOutDAO.class);
	private final IHUAssignmentBL huAssignmentBL = Services.get(IHUAssignmentBL.class);
	private final IHUWarehouseDAO huWarehouseDAO = Services.get(IHUWarehouseDAO.class);
	private final IHUMovementBL huMovementBL = Services.get(IHUMovementBL.class);

	@Override
	public I_M_InOut getById(@NonNull final InOutId inoutId)
	{
		return inOutDAO.getById(inoutId);
	}

	@Override
	public <T extends I_M_InOut> T getById(@NonNull final InOutId inoutId, @NonNull final Class<T> type)
	{
		return inOutDAO.getById(inoutId, type);
	}

	@Override
	public <T extends org.compiere.model.I_M_InOutLine> List<T> retrieveLines(final I_M_InOut inOut, final Class<T> inoutLineClass)
	{
		return inOutDAO.retrieveLines(inOut, inoutLineClass);
	}

	@Override
	public void updatePackingMaterialInOutLine(
			@NonNull final de.metas.inout.model.I_M_InOutLine inoutLine,
			@NonNull final HUPackingMaterialDocumentLineCandidate candidate)
	{
		final I_M_InOutLine inoutLineHU = InterfaceWrapperHelper.create(inoutLine, I_M_InOutLine.class);

		final I_M_Product product = candidate.getM_Product();
		final int productId = product.getM_Product_ID();
		final I_C_UOM uom = candidate.getC_UOM();
		final BigDecimal qtyEntered = candidate.getQty();
		final BigDecimal qty = candidate.getQtyInStockingUOM();
		final I_M_Material_Tracking materialTracking = candidate.getM_MaterialTracking();

		inoutLineHU.setM_Material_Tracking(materialTracking); // task 07734
		inoutLineHU.setM_Product_ID(productId);
		inoutLineHU.setC_UOM_ID(uom.getC_UOM_ID());
		inoutLineHU.setQtyEntered(qtyEntered);
		inoutLineHU.setMovementQty(qty);
		inoutLineHU.setIsPackagingMaterial(true);

		// task 09502: we set the M_Material_Tracking_ID, so let's also update the ASI, to have it all consistent.
		final IMaterialTrackingAttributeBL materialTrackingAttributeBL = Services.get(IMaterialTrackingAttributeBL.class);
		materialTrackingAttributeBL.createOrUpdateMaterialTrackingASI(inoutLineHU, materialTracking);

		// NOTE: packing material lines shall have no order line set (07969). This will prevent generating ICs.
		inoutLineHU.setC_OrderLine(null);

		InterfaceWrapperHelper.save(inoutLineHU);
	}

	@Override
	public void recreatePackingMaterialLines(final org.compiere.model.I_M_InOut inout)
	{
		final HUShipmentPackingMaterialLinesBuilder packingMaterialLinesBuilder = createHUShipmentPackingMaterialLinesBuilder(inout);

		final boolean deleteExistingPackingLines = true; // delete existing packing material lines, if any
		packingMaterialLinesBuilder.setOverrideExistingPackingMaterialLines(deleteExistingPackingLines);
		packingMaterialLinesBuilder.build();
	}

	@Override
	public void createPackingMaterialLines(final org.compiere.model.I_M_InOut inout)
	{
		final HUShipmentPackingMaterialLinesBuilder packingMaterialLinesBuilder = createHUShipmentPackingMaterialLinesBuilder(inout);
		packingMaterialLinesBuilder.setOverrideExistingPackingMaterialLines(false);
		packingMaterialLinesBuilder.build();
	}

	@Override
	public final HUShipmentPackingMaterialLinesBuilder createHUShipmentPackingMaterialLinesBuilder(final org.compiere.model.I_M_InOut shipment)
	{
		final HUShipmentPackingMaterialLinesBuilder packingMaterialLinesBuilder = new HUShipmentPackingMaterialLinesBuilder();
		packingMaterialLinesBuilder.setM_InOut(shipment);
		return packingMaterialLinesBuilder;
	}

	@Override
	public I_M_HU_PI getTU_HU_PI(final I_M_InOutLine inoutLine)
	{
		//
		// Get TU PI to use
		final I_M_HU_PI_Item_Product piItemProduct;
		if (inoutLine.getM_HU_PI_Item_Product_ID() > 0)
		{
			piItemProduct = inoutLine.getM_HU_PI_Item_Product();
		}
		else
		{
			// fallback
			// FIXME: this is a nasty workaround
			// Ideally would by to have M_HU_PI_Item_Product in receipt line
			final I_C_OrderLine orderLine = InterfaceWrapperHelper.create(inoutLine.getC_OrderLine(), I_C_OrderLine.class);
			if (orderLine == null)
			{
				logger.warn("Cannot get orderline from inout line: {}", inoutLine);
				return null;
			}
			piItemProduct = orderLine.getM_HU_PI_Item_Product();
		}
		if (piItemProduct == null)
		{
			logger.warn("Cannot get PI Item Product from inout line: {}", inoutLine);
			return null;
		}

		return piItemProduct.getM_HU_PI_Item().getM_HU_PI_Version().getM_HU_PI();
	}

	@Override
	public void destroyHUs(@NonNull final org.compiere.model.I_M_InOut inout)
	{
		// services
		final IHUInOutDAO huInOutDAO = Services.get(IHUInOutDAO.class);
		final IHandlingUnitsBL handlingUnitsBL = Services.get(IHandlingUnitsBL.class);
		final IHUContextFactory huContextFactory = Services.get(IHUContextFactory.class);

		//
		// Get inout's assigned HUs
		final List<I_M_HU> hus = huInOutDAO.retrieveHandlingUnits(inout);
		if (hus.isEmpty())
		{
			return;
		}

		// TODO: make sure HUs were not touched! i.e. nobody took out some quantity, split, joined etc

		//
		// Create and configure the huContext for destroying the HUs
		final IContextAware context = InterfaceWrapperHelper.getContextAware(inout);
		final IHUContext huContext = huContextFactory.createMutableHUContextForProcessing(context);
		// If we deal with a receipt, we shall collect (and move back to Gebinde lager), only those packing materials that we own.
		if (!inout.isSOTrx())
		{
			huContext.getHUPackingMaterialsCollector().setCollectIfOwnPackingMaterialsOnly(true);
		}

		//
		// Mark assigned HUs as destroyed
		handlingUnitsBL.markDestroyed(huContext, hus);
	}

	@Override
	public void updateEffectiveValues(final I_M_InOutLine shipmentLine)
	{
		// avoid a huge development mistake
		Check.assume(shipmentLine.getM_InOut().isSOTrx(), "{} is a shipment line and not a receipt line", shipmentLine);

		// Skip packing materials line
		if (shipmentLine.isPackagingMaterial())
		{
			return;
		}

		final BigDecimal qtyCU_Effective;
		final BigDecimal qtyTU_Effective;
		final I_M_HU_PI_Item_Product piItemProduct_Effective;
		if (shipmentLine.isManualPackingMaterial())
		{
			qtyCU_Effective = shipmentLine.getQtyEntered(); // keep it as it is
			qtyTU_Effective = shipmentLine.getQtyTU_Override();
			piItemProduct_Effective = shipmentLine.getM_HU_PI_Item_Product_Override();
		}
		else
		{
			qtyCU_Effective = shipmentLine.getQtyCU_Calculated();
			qtyTU_Effective = shipmentLine.getQtyTU_Calculated();
			piItemProduct_Effective = shipmentLine.getM_HU_PI_Item_Product_Calculated();
		}

		shipmentLine.setQtyEntered(qtyCU_Effective);
		shipmentLine.setQtyEnteredTU(qtyTU_Effective);
		shipmentLine.setM_HU_PI_Item_Product(piItemProduct_Effective);
	}

	@Override
	public IDocumentLUTUConfigurationManager createLUTUConfigurationManager(final List<I_M_InOutLine> inOutLines)
	{
		Check.assumeNotEmpty(inOutLines, "inOutLines not empty");

		final CustomerReturnLUTUConfigurationHandler lutuConfigurationHandler = new CustomerReturnLUTUConfigurationHandler();

		if (inOutLines.size() == 1)
		{
			final I_M_InOutLine inOutLine = inOutLines.get(0);
			return new DocumentLUTUConfigurationManager<>(inOutLine, lutuConfigurationHandler);
		}
		else
		{
			final IDocumentLUTUConfigurationHandler<List<I_M_InOutLine>> lutuConfigurationListHandler = CompositeDocumentLUTUConfigurationHandler.of(lutuConfigurationHandler);
			return new DocumentLUTUConfigurationManager<>(inOutLines, lutuConfigurationListHandler);
		}
	}

	@Override
	public boolean isCustomerReturn(@NonNull final org.compiere.model.I_M_InOut inOut)
	{
		final DocTypeQuery docTypeQuery = createDocTypeQueryBuilder(inOut)
				.docBaseType(X_C_DocType.DOCBASETYPE_MaterialReceipt)
				.docSubTypeAny()
				.isSOTrx(true)
				.build();

		return Services.get(IDocTypeDAO.class).queryMatchesDocTypeId(docTypeQuery, inOut.getC_DocType_ID());
	}

	@Override
	public boolean isVendorReturn(@NonNull final org.compiere.model.I_M_InOut inOut)
	{
		final DocTypeQuery docTypeQuery = createDocTypeQueryBuilder(inOut)
				.docBaseType(X_C_DocType.DOCBASETYPE_MaterialDelivery)
				.isSOTrx(false)
				.build();

		return Services.get(IDocTypeDAO.class).queryMatchesDocTypeId(docTypeQuery, inOut.getC_DocType_ID());
	}

	private DocTypeQueryBuilder createDocTypeQueryBuilder(@NonNull final org.compiere.model.I_M_InOut inOut)
	{
		return DocTypeQuery.builder()
				.docSubType(DocTypeQuery.DOCSUBTYPE_NONE) // in the case of returns the docSubType is null
				.adClientId(inOut.getAD_Client_ID())
				.adOrgId(inOut.getAD_Org_ID());
	}

	@Override
	public void moveHUsToQualityReturnWarehouse(final List<I_M_HU> husToReturn)
	{
		final List<I_M_Warehouse> warehouses = huWarehouseDAO.retrieveQualityReturnWarehouses();
		final I_M_Warehouse qualityReturnWarehouse = warehouses.get(0);

		huMovementBL.moveHUsToWarehouse(husToReturn, qualityReturnWarehouse);
	}

	@Override
	public void setAssignedHandlingUnits(final org.compiere.model.I_M_InOut inout, final List<I_M_HU> hus)
	{
		huAssignmentBL.setAssignedHandlingUnits(inout, hus);
	}

	@Override
	public void addAssignedHandlingUnits(final I_M_InOut inout, final List<I_M_HU> hus)
	{
		huAssignmentBL.addAssignedHandlingUnits(inout, hus);
	}

	@Override
	public void setAssignedHandlingUnits(final org.compiere.model.I_M_InOutLine inoutLine, final List<I_M_HU> hus)
	{
		huAssignmentBL.setAssignedHandlingUnits(inoutLine, hus);
	}

	@Override
	public void copyAssignmentsToReversal(@NonNull final org.compiere.model.I_M_InOut inOutRecord)
	{
		final List<I_M_InOutLine> lineRecords = inOutDAO.retrieveLines(inOutRecord, I_M_InOutLine.class);
		for (final I_M_InOutLine lineRecord : lineRecords)
		{
			Check.errorIf(lineRecord.getReversalLine_ID() <= 0,
					"copyAssignmentsToReversal - current M_InOutLine_ID={} has no reversal line; M_InOut={}",
					lineRecord.getM_InOutLine_ID(), inOutRecord);

			huAssignmentBL.copyHUAssignments(lineRecord, lineRecord.getReversalLine());
		}
	}
}
