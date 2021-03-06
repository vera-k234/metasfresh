/** Generated Model - DO NOT CHANGE */
package de.metas.shipper.gateway.dhl.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;

/** Generated Model for DHL_ShipmentOrder
 *  @author Adempiere (generated) 
 */
@SuppressWarnings("javadoc")
public class X_DHL_ShipmentOrder extends org.compiere.model.PO implements I_DHL_ShipmentOrder, org.compiere.model.I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 974109082L;

    /** Standard Constructor */
    public X_DHL_ShipmentOrder (Properties ctx, int DHL_ShipmentOrder_ID, String trxName)
    {
      super (ctx, DHL_ShipmentOrder_ID, trxName);
      /** if (DHL_ShipmentOrder_ID == 0)
        {
			setCustomsAmount (0); // 0
			setDHL_HeightInCm (0); // 0
			setDHL_LengthInCm (0); // 0
			setDHL_ShipmentOrder_ID (0);
			setDHL_WeightInKg (BigDecimal.ZERO); // 0
			setDHL_WidthInCm (0); // 0
			setInternationalDelivery (false); // N
			setPackageId (0); // 0
        } */
    }

    /** Load Constructor */
    public X_DHL_ShipmentOrder (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }


    /** Load Meta Data */
    @Override
    protected org.compiere.model.POInfo initPO (Properties ctx)
    {
      org.compiere.model.POInfo poi = org.compiere.model.POInfo.getPOInfo (ctx, Table_Name, get_TrxName());
      return poi;
    }

	/** Set Additional Fee.
		@param AdditionalFee Additional Fee	  */
	@Override
	public void setAdditionalFee (java.math.BigDecimal AdditionalFee)
	{
		set_Value (COLUMNNAME_AdditionalFee, AdditionalFee);
	}

	/** Get Additional Fee.
		@return Additional Fee	  */
	@Override
	public java.math.BigDecimal getAdditionalFee () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AdditionalFee);
		if (bd == null)
			 return BigDecimal.ZERO;
		return bd;
	}

	/** Set Luftfrachtbrief.
		@param awb Luftfrachtbrief	  */
	@Override
	public void setawb (java.lang.String awb)
	{
		set_Value (COLUMNNAME_awb, awb);
	}

	/** Get Luftfrachtbrief.
		@return Luftfrachtbrief	  */
	@Override
	public java.lang.String getawb () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_awb);
	}

	/** Set Gesch??ftspartner.
		@param C_BPartner_ID 
		Bezeichnet einen Gesch??ftspartner
	  */
	@Override
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		if (C_BPartner_ID < 1) 
			set_Value (COLUMNNAME_C_BPartner_ID, null);
		else 
			set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
	}

	/** Get Gesch??ftspartner.
		@return Bezeichnet einen Gesch??ftspartner
	  */
	@Override
	public int getC_BPartner_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Standort.
		@param C_BPartner_Location_ID 
		Identifiziert die (Liefer-) Adresse des Gesch??ftspartners
	  */
	@Override
	public void setC_BPartner_Location_ID (int C_BPartner_Location_ID)
	{
		if (C_BPartner_Location_ID < 1) 
			set_Value (COLUMNNAME_C_BPartner_Location_ID, null);
		else 
			set_Value (COLUMNNAME_C_BPartner_Location_ID, Integer.valueOf(C_BPartner_Location_ID));
	}

	/** Get Standort.
		@return Identifiziert die (Liefer-) Adresse des Gesch??ftspartners
	  */
	@Override
	public int getC_BPartner_Location_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_Location_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	@Override
	public org.compiere.model.I_C_Customs_Invoice getC_Customs_Invoice()
	{
		return get_ValueAsPO(COLUMNNAME_C_Customs_Invoice_ID, org.compiere.model.I_C_Customs_Invoice.class);
	}

	@Override
	public void setC_Customs_Invoice(org.compiere.model.I_C_Customs_Invoice C_Customs_Invoice)
	{
		set_ValueFromPO(COLUMNNAME_C_Customs_Invoice_ID, org.compiere.model.I_C_Customs_Invoice.class, C_Customs_Invoice);
	}

	/** Set Zollrechnung.
		@param C_Customs_Invoice_ID Zollrechnung	  */
	@Override
	public void setC_Customs_Invoice_ID (int C_Customs_Invoice_ID)
	{
		if (C_Customs_Invoice_ID < 1) 
			set_Value (COLUMNNAME_C_Customs_Invoice_ID, null);
		else 
			set_Value (COLUMNNAME_C_Customs_Invoice_ID, Integer.valueOf(C_Customs_Invoice_ID));
	}

	/** Get Zollrechnung.
		@return Zollrechnung	  */
	@Override
	public int getC_Customs_Invoice_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Customs_Invoice_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	@Override
	public org.compiere.model.I_C_Customs_Invoice_Line getC_Customs_Invoice_Line()
	{
		return get_ValueAsPO(COLUMNNAME_C_Customs_Invoice_Line_ID, org.compiere.model.I_C_Customs_Invoice_Line.class);
	}

	@Override
	public void setC_Customs_Invoice_Line(org.compiere.model.I_C_Customs_Invoice_Line C_Customs_Invoice_Line)
	{
		set_ValueFromPO(COLUMNNAME_C_Customs_Invoice_Line_ID, org.compiere.model.I_C_Customs_Invoice_Line.class, C_Customs_Invoice_Line);
	}

	/** Set Customs Invoice Line.
		@param C_Customs_Invoice_Line_ID Customs Invoice Line	  */
	@Override
	public void setC_Customs_Invoice_Line_ID (int C_Customs_Invoice_Line_ID)
	{
		if (C_Customs_Invoice_Line_ID < 1) 
			set_Value (COLUMNNAME_C_Customs_Invoice_Line_ID, null);
		else 
			set_Value (COLUMNNAME_C_Customs_Invoice_Line_ID, Integer.valueOf(C_Customs_Invoice_Line_ID));
	}

	/** Get Customs Invoice Line.
		@return Customs Invoice Line	  */
	@Override
	public int getC_Customs_Invoice_Line_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Customs_Invoice_Line_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Kundenreferenz.
		@param CustomerReference Kundenreferenz	  */
	@Override
	public void setCustomerReference (java.lang.String CustomerReference)
	{
		set_Value (COLUMNNAME_CustomerReference, CustomerReference);
	}

	/** Get Kundenreferenz.
		@return Kundenreferenz	  */
	@Override
	public java.lang.String getCustomerReference () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_CustomerReference);
	}

	/** Set Customs Amount.
		@param CustomsAmount Customs Amount	  */
	@Override
	public void setCustomsAmount (int CustomsAmount)
	{
		set_Value (COLUMNNAME_CustomsAmount, Integer.valueOf(CustomsAmount));
	}

	/** Get Customs Amount.
		@return Customs Amount	  */
	@Override
	public int getCustomsAmount () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CustomsAmount);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Customs Tariff Number.
		@param CustomsTariffNumber Customs Tariff Number	  */
	@Override
	public void setCustomsTariffNumber (java.lang.String CustomsTariffNumber)
	{
		set_Value (COLUMNNAME_CustomsTariffNumber, CustomsTariffNumber);
	}

	/** Get Customs Tariff Number.
		@return Customs Tariff Number	  */
	@Override
	public java.lang.String getCustomsTariffNumber () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_CustomsTariffNumber);
	}

	/** Set Customs Value.
		@param CustomsValue Customs Value	  */
	@Override
	public void setCustomsValue (java.math.BigDecimal CustomsValue)
	{
		set_Value (COLUMNNAME_CustomsValue, CustomsValue);
	}

	/** Get Customs Value.
		@return Customs Value	  */
	@Override
	public java.math.BigDecimal getCustomsValue () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CustomsValue);
		if (bd == null)
			 return BigDecimal.ZERO;
		return bd;
	}

	/** Set H??he in cm.
		@param DHL_HeightInCm H??he in cm	  */
	@Override
	public void setDHL_HeightInCm (int DHL_HeightInCm)
	{
		set_Value (COLUMNNAME_DHL_HeightInCm, Integer.valueOf(DHL_HeightInCm));
	}

	/** Get H??he in cm.
		@return H??he in cm	  */
	@Override
	public int getDHL_HeightInCm () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_DHL_HeightInCm);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set L??nge in cm.
		@param DHL_LengthInCm L??nge in cm	  */
	@Override
	public void setDHL_LengthInCm (int DHL_LengthInCm)
	{
		set_Value (COLUMNNAME_DHL_LengthInCm, Integer.valueOf(DHL_LengthInCm));
	}

	/** Get L??nge in cm.
		@return L??nge in cm	  */
	@Override
	public int getDHL_LengthInCm () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_DHL_LengthInCm);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Produkt.
		@param DHL_Product Produkt	  */
	@Override
	public void setDHL_Product (java.lang.String DHL_Product)
	{
		set_Value (COLUMNNAME_DHL_Product, DHL_Product);
	}

	/** Get Produkt.
		@return Produkt	  */
	@Override
	public java.lang.String getDHL_Product () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_DHL_Product);
	}

	/** Set Empf??ngerort.
		@param DHL_Receiver_City Empf??ngerort	  */
	@Override
	public void setDHL_Receiver_City (java.lang.String DHL_Receiver_City)
	{
		set_Value (COLUMNNAME_DHL_Receiver_City, DHL_Receiver_City);
	}

	/** Get Empf??ngerort.
		@return Empf??ngerort	  */
	@Override
	public java.lang.String getDHL_Receiver_City () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_DHL_Receiver_City);
	}

	/** Set Empf??nger L??ndercode (ISO-2).
		@param DHL_Receiver_CountryISO2Code Empf??nger L??ndercode (ISO-2)	  */
	@Override
	public void setDHL_Receiver_CountryISO2Code (java.lang.String DHL_Receiver_CountryISO2Code)
	{
		set_Value (COLUMNNAME_DHL_Receiver_CountryISO2Code, DHL_Receiver_CountryISO2Code);
	}

	/** Get Empf??nger L??ndercode (ISO-2).
		@return Empf??nger L??ndercode (ISO-2)	  */
	@Override
	public java.lang.String getDHL_Receiver_CountryISO2Code () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_DHL_Receiver_CountryISO2Code);
	}

	/** Set Empf??nger L??ndercode (ISO-3).
		@param DHL_Receiver_CountryISO3Code Empf??nger L??ndercode (ISO-3)	  */
	@Override
	public void setDHL_Receiver_CountryISO3Code (java.lang.String DHL_Receiver_CountryISO3Code)
	{
		set_Value (COLUMNNAME_DHL_Receiver_CountryISO3Code, DHL_Receiver_CountryISO3Code);
	}

	/** Get Empf??nger L??ndercode (ISO-3).
		@return Empf??nger L??ndercode (ISO-3)	  */
	@Override
	public java.lang.String getDHL_Receiver_CountryISO3Code () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_DHL_Receiver_CountryISO3Code);
	}

	/** Set E-Mail Empf??nger.
		@param DHL_Receiver_Email E-Mail Empf??nger	  */
	@Override
	public void setDHL_Receiver_Email (java.lang.String DHL_Receiver_Email)
	{
		set_Value (COLUMNNAME_DHL_Receiver_Email, DHL_Receiver_Email);
	}

	/** Get E-Mail Empf??nger.
		@return E-Mail Empf??nger	  */
	@Override
	public java.lang.String getDHL_Receiver_Email () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_DHL_Receiver_Email);
	}

	/** Set Name 1 Empf??nger.
		@param DHL_Receiver_Name1 Name 1 Empf??nger	  */
	@Override
	public void setDHL_Receiver_Name1 (java.lang.String DHL_Receiver_Name1)
	{
		set_Value (COLUMNNAME_DHL_Receiver_Name1, DHL_Receiver_Name1);
	}

	/** Get Name 1 Empf??nger.
		@return Name 1 Empf??nger	  */
	@Override
	public java.lang.String getDHL_Receiver_Name1 () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_DHL_Receiver_Name1);
	}

	/** Set Name 2 Empf??nger.
		@param DHL_Receiver_Name2 Name 2 Empf??nger	  */
	@Override
	public void setDHL_Receiver_Name2 (java.lang.String DHL_Receiver_Name2)
	{
		set_Value (COLUMNNAME_DHL_Receiver_Name2, DHL_Receiver_Name2);
	}

	/** Get Name 2 Empf??nger.
		@return Name 2 Empf??nger	  */
	@Override
	public java.lang.String getDHL_Receiver_Name2 () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_DHL_Receiver_Name2);
	}

	/** Set Telefon Empf??nger.
		@param DHL_Receiver_Phone Telefon Empf??nger	  */
	@Override
	public void setDHL_Receiver_Phone (java.lang.String DHL_Receiver_Phone)
	{
		set_Value (COLUMNNAME_DHL_Receiver_Phone, DHL_Receiver_Phone);
	}

	/** Get Telefon Empf??nger.
		@return Telefon Empf??nger	  */
	@Override
	public java.lang.String getDHL_Receiver_Phone () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_DHL_Receiver_Phone);
	}

	/** Set Stra??e 1 Empf??nger.
		@param DHL_Receiver_StreetName1 Stra??e 1 Empf??nger	  */
	@Override
	public void setDHL_Receiver_StreetName1 (java.lang.String DHL_Receiver_StreetName1)
	{
		set_Value (COLUMNNAME_DHL_Receiver_StreetName1, DHL_Receiver_StreetName1);
	}

	/** Get Stra??e 1 Empf??nger.
		@return Stra??e 1 Empf??nger	  */
	@Override
	public java.lang.String getDHL_Receiver_StreetName1 () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_DHL_Receiver_StreetName1);
	}

	/** Set Stra??e 2 Empf??nger.
		@param DHL_Receiver_StreetName2 Stra??e 2 Empf??nger	  */
	@Override
	public void setDHL_Receiver_StreetName2 (java.lang.String DHL_Receiver_StreetName2)
	{
		set_Value (COLUMNNAME_DHL_Receiver_StreetName2, DHL_Receiver_StreetName2);
	}

	/** Get Stra??e 2 Empf??nger.
		@return Stra??e 2 Empf??nger	  */
	@Override
	public java.lang.String getDHL_Receiver_StreetName2 () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_DHL_Receiver_StreetName2);
	}

	/** Set Hausnummer Empf??nger.
		@param DHL_Receiver_StreetNumber Hausnummer Empf??nger	  */
	@Override
	public void setDHL_Receiver_StreetNumber (java.lang.String DHL_Receiver_StreetNumber)
	{
		set_Value (COLUMNNAME_DHL_Receiver_StreetNumber, DHL_Receiver_StreetNumber);
	}

	/** Get Hausnummer Empf??nger.
		@return Hausnummer Empf??nger	  */
	@Override
	public java.lang.String getDHL_Receiver_StreetNumber () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_DHL_Receiver_StreetNumber);
	}

	/** Set PLZ Empf??nger.
		@param DHL_Receiver_ZipCode PLZ Empf??nger	  */
	@Override
	public void setDHL_Receiver_ZipCode (java.lang.String DHL_Receiver_ZipCode)
	{
		set_Value (COLUMNNAME_DHL_Receiver_ZipCode, DHL_Receiver_ZipCode);
	}

	/** Get PLZ Empf??nger.
		@return PLZ Empf??nger	  */
	@Override
	public java.lang.String getDHL_Receiver_ZipCode () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_DHL_Receiver_ZipCode);
	}

	/** Set DHL_RecipientEmailAddress.
		@param DHL_RecipientEmailAddress DHL_RecipientEmailAddress	  */
	@Override
	public void setDHL_RecipientEmailAddress (java.lang.String DHL_RecipientEmailAddress)
	{
		set_Value (COLUMNNAME_DHL_RecipientEmailAddress, DHL_RecipientEmailAddress);
	}

	/** Get DHL_RecipientEmailAddress.
		@return DHL_RecipientEmailAddress	  */
	@Override
	public java.lang.String getDHL_RecipientEmailAddress () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_DHL_RecipientEmailAddress);
	}

	/** Set Lieferdatum.
		@param DHL_ShipmentDate Lieferdatum	  */
	@Override
	public void setDHL_ShipmentDate (java.lang.String DHL_ShipmentDate)
	{
		set_Value (COLUMNNAME_DHL_ShipmentDate, DHL_ShipmentDate);
	}

	/** Get Lieferdatum.
		@return Lieferdatum	  */
	@Override
	public java.lang.String getDHL_ShipmentDate () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_DHL_ShipmentDate);
	}

	/** Set DHL_ShipmentOrder.
		@param DHL_ShipmentOrder_ID DHL_ShipmentOrder	  */
	@Override
	public void setDHL_ShipmentOrder_ID (int DHL_ShipmentOrder_ID)
	{
		if (DHL_ShipmentOrder_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_DHL_ShipmentOrder_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_DHL_ShipmentOrder_ID, Integer.valueOf(DHL_ShipmentOrder_ID));
	}

	/** Get DHL_ShipmentOrder.
		@return DHL_ShipmentOrder	  */
	@Override
	public int getDHL_ShipmentOrder_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_DHL_ShipmentOrder_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	@Override
	public de.metas.shipper.gateway.dhl.model.I_DHL_ShipmentOrderRequest getDHL_ShipmentOrderRequest()
	{
		return get_ValueAsPO(COLUMNNAME_DHL_ShipmentOrderRequest_ID, de.metas.shipper.gateway.dhl.model.I_DHL_ShipmentOrderRequest.class);
	}

	@Override
	public void setDHL_ShipmentOrderRequest(de.metas.shipper.gateway.dhl.model.I_DHL_ShipmentOrderRequest DHL_ShipmentOrderRequest)
	{
		set_ValueFromPO(COLUMNNAME_DHL_ShipmentOrderRequest_ID, de.metas.shipper.gateway.dhl.model.I_DHL_ShipmentOrderRequest.class, DHL_ShipmentOrderRequest);
	}

	/** Set DHL Shipment Order Request.
		@param DHL_ShipmentOrderRequest_ID DHL Shipment Order Request	  */
	@Override
	public void setDHL_ShipmentOrderRequest_ID (int DHL_ShipmentOrderRequest_ID)
	{
		if (DHL_ShipmentOrderRequest_ID < 1) 
			set_Value (COLUMNNAME_DHL_ShipmentOrderRequest_ID, null);
		else 
			set_Value (COLUMNNAME_DHL_ShipmentOrderRequest_ID, Integer.valueOf(DHL_ShipmentOrderRequest_ID));
	}

	/** Get DHL Shipment Order Request.
		@return DHL Shipment Order Request	  */
	@Override
	public int getDHL_ShipmentOrderRequest_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_DHL_ShipmentOrderRequest_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Lieferort.
		@param DHL_Shipper_City Lieferort	  */
	@Override
	public void setDHL_Shipper_City (java.lang.String DHL_Shipper_City)
	{
		set_Value (COLUMNNAME_DHL_Shipper_City, DHL_Shipper_City);
	}

	/** Get Lieferort.
		@return Lieferort	  */
	@Override
	public java.lang.String getDHL_Shipper_City () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_DHL_Shipper_City);
	}

	/** Set Lieferant L??ndercode (ISO-2).
		@param DHL_Shipper_CountryISO2Code Lieferant L??ndercode (ISO-2)	  */
	@Override
	public void setDHL_Shipper_CountryISO2Code (java.lang.String DHL_Shipper_CountryISO2Code)
	{
		set_Value (COLUMNNAME_DHL_Shipper_CountryISO2Code, DHL_Shipper_CountryISO2Code);
	}

	/** Get Lieferant L??ndercode (ISO-2).
		@return Lieferant L??ndercode (ISO-2)	  */
	@Override
	public java.lang.String getDHL_Shipper_CountryISO2Code () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_DHL_Shipper_CountryISO2Code);
	}

	/** Set Lieferant L??ndercode (ISO-3).
		@param DHL_Shipper_CountryISO3Code Lieferant L??ndercode (ISO-3)	  */
	@Override
	public void setDHL_Shipper_CountryISO3Code (java.lang.String DHL_Shipper_CountryISO3Code)
	{
		set_Value (COLUMNNAME_DHL_Shipper_CountryISO3Code, DHL_Shipper_CountryISO3Code);
	}

	/** Get Lieferant L??ndercode (ISO-3).
		@return Lieferant L??ndercode (ISO-3)	  */
	@Override
	public java.lang.String getDHL_Shipper_CountryISO3Code () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_DHL_Shipper_CountryISO3Code);
	}

	/** Set Lieferant Name 1.
		@param DHL_Shipper_Name1 Lieferant Name 1	  */
	@Override
	public void setDHL_Shipper_Name1 (java.lang.String DHL_Shipper_Name1)
	{
		set_Value (COLUMNNAME_DHL_Shipper_Name1, DHL_Shipper_Name1);
	}

	/** Get Lieferant Name 1.
		@return Lieferant Name 1	  */
	@Override
	public java.lang.String getDHL_Shipper_Name1 () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_DHL_Shipper_Name1);
	}

	/** Set  Lieferant Name 2.
		@param DHL_Shipper_Name2  Lieferant Name 2	  */
	@Override
	public void setDHL_Shipper_Name2 (java.lang.String DHL_Shipper_Name2)
	{
		set_Value (COLUMNNAME_DHL_Shipper_Name2, DHL_Shipper_Name2);
	}

	/** Get  Lieferant Name 2.
		@return  Lieferant Name 2	  */
	@Override
	public java.lang.String getDHL_Shipper_Name2 () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_DHL_Shipper_Name2);
	}

	/** Set Stra??e 1 Lieferant.
		@param DHL_Shipper_StreetName1 Stra??e 1 Lieferant	  */
	@Override
	public void setDHL_Shipper_StreetName1 (java.lang.String DHL_Shipper_StreetName1)
	{
		set_Value (COLUMNNAME_DHL_Shipper_StreetName1, DHL_Shipper_StreetName1);
	}

	/** Get Stra??e 1 Lieferant.
		@return Stra??e 1 Lieferant	  */
	@Override
	public java.lang.String getDHL_Shipper_StreetName1 () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_DHL_Shipper_StreetName1);
	}

	/** Set Stra??e 2 Lieferant.
		@param DHL_Shipper_StreetName2 Stra??e 2 Lieferant	  */
	@Override
	public void setDHL_Shipper_StreetName2 (java.lang.String DHL_Shipper_StreetName2)
	{
		set_Value (COLUMNNAME_DHL_Shipper_StreetName2, DHL_Shipper_StreetName2);
	}

	/** Get Stra??e 2 Lieferant.
		@return Stra??e 2 Lieferant	  */
	@Override
	public java.lang.String getDHL_Shipper_StreetName2 () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_DHL_Shipper_StreetName2);
	}

	/** Set Hausnummer Lieferant.
		@param DHL_Shipper_StreetNumber Hausnummer Lieferant	  */
	@Override
	public void setDHL_Shipper_StreetNumber (java.lang.String DHL_Shipper_StreetNumber)
	{
		set_Value (COLUMNNAME_DHL_Shipper_StreetNumber, DHL_Shipper_StreetNumber);
	}

	/** Get Hausnummer Lieferant.
		@return Hausnummer Lieferant	  */
	@Override
	public java.lang.String getDHL_Shipper_StreetNumber () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_DHL_Shipper_StreetNumber);
	}

	/** Set PLZ Lieferant.
		@param DHL_Shipper_ZipCode PLZ Lieferant	  */
	@Override
	public void setDHL_Shipper_ZipCode (java.lang.String DHL_Shipper_ZipCode)
	{
		set_Value (COLUMNNAME_DHL_Shipper_ZipCode, DHL_Shipper_ZipCode);
	}

	/** Get PLZ Lieferant.
		@return PLZ Lieferant	  */
	@Override
	public java.lang.String getDHL_Shipper_ZipCode () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_DHL_Shipper_ZipCode);
	}

	/** Set Gewicht in kg.
		@param DHL_WeightInKg Gewicht in kg	  */
	@Override
	public void setDHL_WeightInKg (java.math.BigDecimal DHL_WeightInKg)
	{
		set_Value (COLUMNNAME_DHL_WeightInKg, DHL_WeightInKg);
	}

	/** Get Gewicht in kg.
		@return Gewicht in kg	  */
	@Override
	public java.math.BigDecimal getDHL_WeightInKg () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_DHL_WeightInKg);
		if (bd == null)
			 return BigDecimal.ZERO;
		return bd;
	}

	/** Set Breite in cm.
		@param DHL_WidthInCm Breite in cm	  */
	@Override
	public void setDHL_WidthInCm (int DHL_WidthInCm)
	{
		set_Value (COLUMNNAME_DHL_WidthInCm, Integer.valueOf(DHL_WidthInCm));
	}

	/** Get Breite in cm.
		@return Breite in cm	  */
	@Override
	public int getDHL_WidthInCm () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_DHL_WidthInCm);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Electronic Export Notification.
		@param ElectronicExportNotification Electronic Export Notification	  */
	@Override
	public void setElectronicExportNotification (java.lang.String ElectronicExportNotification)
	{
		set_Value (COLUMNNAME_ElectronicExportNotification, ElectronicExportNotification);
	}

	/** Get Electronic Export Notification.
		@return Electronic Export Notification	  */
	@Override
	public java.lang.String getElectronicExportNotification () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_ElectronicExportNotification);
	}

	/** Set Export Type.
		@param ExportType Export Type	  */
	@Override
	public void setExportType (java.lang.String ExportType)
	{
		set_Value (COLUMNNAME_ExportType, ExportType);
	}

	/** Get Export Type.
		@return Export Type	  */
	@Override
	public java.lang.String getExportType () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_ExportType);
	}

	/** Set Export Type Description.
		@param ExportTypeDescription Export Type Description	  */
	@Override
	public void setExportTypeDescription (java.lang.String ExportTypeDescription)
	{
		set_Value (COLUMNNAME_ExportTypeDescription, ExportTypeDescription);
	}

	/** Get Export Type Description.
		@return Export Type Description	  */
	@Override
	public java.lang.String getExportTypeDescription () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_ExportTypeDescription);
	}

	/** Set International Delivery.
		@param InternationalDelivery International Delivery	  */
	@Override
	public void setInternationalDelivery (boolean InternationalDelivery)
	{
		set_Value (COLUMNNAME_InternationalDelivery, Boolean.valueOf(InternationalDelivery));
	}

	/** Get International Delivery.
		@return International Delivery	  */
	@Override
	public boolean isInternationalDelivery () 
	{
		Object oo = get_Value(COLUMNNAME_InternationalDelivery);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	@Override
	public org.compiere.model.I_M_Shipper getM_Shipper()
	{
		return get_ValueAsPO(COLUMNNAME_M_Shipper_ID, org.compiere.model.I_M_Shipper.class);
	}

	@Override
	public void setM_Shipper(org.compiere.model.I_M_Shipper M_Shipper)
	{
		set_ValueFromPO(COLUMNNAME_M_Shipper_ID, org.compiere.model.I_M_Shipper.class, M_Shipper);
	}

	/** Set Lieferweg.
		@param M_Shipper_ID 
		Methode oder Art der Warenlieferung
	  */
	@Override
	public void setM_Shipper_ID (int M_Shipper_ID)
	{
		if (M_Shipper_ID < 1) 
			set_Value (COLUMNNAME_M_Shipper_ID, null);
		else 
			set_Value (COLUMNNAME_M_Shipper_ID, Integer.valueOf(M_Shipper_ID));
	}

	/** Get Lieferweg.
		@return Methode oder Art der Warenlieferung
	  */
	@Override
	public int getM_Shipper_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Shipper_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Transport Auftrag.
		@param M_ShipperTransportation_ID Transport Auftrag	  */
	@Override
	public void setM_ShipperTransportation_ID (int M_ShipperTransportation_ID)
	{
		if (M_ShipperTransportation_ID < 1) 
			set_Value (COLUMNNAME_M_ShipperTransportation_ID, null);
		else 
			set_Value (COLUMNNAME_M_ShipperTransportation_ID, Integer.valueOf(M_ShipperTransportation_ID));
	}

	/** Get Transport Auftrag.
		@return Transport Auftrag	  */
	@Override
	public int getM_ShipperTransportation_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_ShipperTransportation_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Net Weight (Kg).
		@param NetWeightKg Net Weight (Kg)	  */
	@Override
	public void setNetWeightKg (java.math.BigDecimal NetWeightKg)
	{
		set_Value (COLUMNNAME_NetWeightKg, NetWeightKg);
	}

	/** Get Net Weight (Kg).
		@return Net Weight (Kg)	  */
	@Override
	public java.math.BigDecimal getNetWeightKg () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_NetWeightKg);
		if (bd == null)
			 return BigDecimal.ZERO;
		return bd;
	}

	/** Set Package Description.
		@param PackageDescription Package Description	  */
	@Override
	public void setPackageDescription (java.lang.String PackageDescription)
	{
		set_Value (COLUMNNAME_PackageDescription, PackageDescription);
	}

	/** Get Package Description.
		@return Package Description	  */
	@Override
	public java.lang.String getPackageDescription () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_PackageDescription);
	}

	/** Set Paket-ID.
		@param PackageId Paket-ID	  */
	@Override
	public void setPackageId (int PackageId)
	{
		set_Value (COLUMNNAME_PackageId, Integer.valueOf(PackageId));
	}

	/** Get Paket-ID.
		@return Paket-ID	  */
	@Override
	public int getPackageId () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PackageId);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set PdfLabelData.
		@param PdfLabelData PdfLabelData	  */
	@Override
	public void setPdfLabelData (byte[] PdfLabelData)
	{
		set_Value (COLUMNNAME_PdfLabelData, PdfLabelData);
	}

	/** Get PdfLabelData.
		@return PdfLabelData	  */
	@Override
	public byte[] getPdfLabelData () 
	{
		return (byte[])get_Value(COLUMNNAME_PdfLabelData);
	}

	/** Set Nachverfolgungs-URL.
		@param TrackingURL 
		URL des Spediteurs um Sendungen zu verfolgen
	  */
	@Override
	public void setTrackingURL (java.lang.String TrackingURL)
	{
		set_Value (COLUMNNAME_TrackingURL, TrackingURL);
	}

	/** Get Nachverfolgungs-URL.
		@return URL des Spediteurs um Sendungen zu verfolgen
	  */
	@Override
	public java.lang.String getTrackingURL () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_TrackingURL);
	}
}