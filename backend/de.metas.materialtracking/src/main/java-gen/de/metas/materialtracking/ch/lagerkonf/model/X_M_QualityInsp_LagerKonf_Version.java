/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package de.metas.materialtracking.ch.lagerkonf.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.util.Env;

/** Generated Model for M_QualityInsp_LagerKonf_Version
 *  @author Adempiere (generated) 
 */
@SuppressWarnings("javadoc")
public class X_M_QualityInsp_LagerKonf_Version extends org.compiere.model.PO implements I_M_QualityInsp_LagerKonf_Version, org.compiere.model.I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1966041030L;

    /** Standard Constructor */
    public X_M_QualityInsp_LagerKonf_Version (Properties ctx, int M_QualityInsp_LagerKonf_Version_ID, String trxName)
    {
      super (ctx, M_QualityInsp_LagerKonf_Version_ID, trxName);
      /** if (M_QualityInsp_LagerKonf_Version_ID == 0)
        {
			setC_Currency_ID (0);
			setM_Product_ProcessingFee_ID (0);
			setM_Product_RegularPPOrder_ID (0);
			setM_Product_Scrap_ID (0);
			setM_Product_Witholding_ID (0);
			setM_QualityInsp_LagerKonf_ID (0);
			setM_QualityInsp_LagerKonf_Version_ID (0);
			setNumberOfQualityInspections (0);
// 2
			setPercentage_Scrap_Treshhold (Env.ZERO);
			setScrap_Fee_Amt_Per_UOM (Env.ZERO);
			setValidFrom (new Timestamp( System.currentTimeMillis() ));
			setValidTo (new Timestamp( System.currentTimeMillis() ));
        } */
    }

    /** Load Constructor */
    public X_M_QualityInsp_LagerKonf_Version (Properties ctx, ResultSet rs, String trxName)
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

	@Override
	public org.compiere.model.I_C_Currency getC_Currency() throws RuntimeException
	{
		return get_ValueAsPO(COLUMNNAME_C_Currency_ID, org.compiere.model.I_C_Currency.class);
	}

	@Override
	public void setC_Currency(org.compiere.model.I_C_Currency C_Currency)
	{
		set_ValueFromPO(COLUMNNAME_C_Currency_ID, org.compiere.model.I_C_Currency.class, C_Currency);
	}

	/** Set W??hrung.
		@param C_Currency_ID 
		Die W??hrung f??r diesen Eintrag
	  */
	@Override
	public void setC_Currency_ID (int C_Currency_ID)
	{
		if (C_Currency_ID < 1) 
			set_Value (COLUMNNAME_C_Currency_ID, null);
		else 
			set_Value (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
	}

	/** Get W??hrung.
		@return Die W??hrung f??r diesen Eintrag
	  */
	@Override
	public int getC_Currency_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	@Override
	public org.compiere.model.I_C_UOM getC_UOM_Scrap() throws RuntimeException
	{
		return get_ValueAsPO(COLUMNNAME_C_UOM_Scrap_ID, org.compiere.model.I_C_UOM.class);
	}

	@Override
	public void setC_UOM_Scrap(org.compiere.model.I_C_UOM C_UOM_Scrap)
	{
		set_ValueFromPO(COLUMNNAME_C_UOM_Scrap_ID, org.compiere.model.I_C_UOM.class, C_UOM_Scrap);
	}

	/** Set Einheit f??r Entsorgungskosten.
		@param C_UOM_Scrap_ID Einheit f??r Entsorgungskosten	  */
	@Override
	public void setC_UOM_Scrap_ID (int C_UOM_Scrap_ID)
	{
		if (C_UOM_Scrap_ID < 1) 
			set_Value (COLUMNNAME_C_UOM_Scrap_ID, null);
		else 
			set_Value (COLUMNNAME_C_UOM_Scrap_ID, Integer.valueOf(C_UOM_Scrap_ID));
	}

	/** Get Einheit f??r Entsorgungskosten.
		@return Einheit f??r Entsorgungskosten	  */
	@Override
	public int getC_UOM_Scrap_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_UOM_Scrap_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	@Override
	public org.compiere.model.I_M_Product getM_Product_ProcessingFee() throws RuntimeException
	{
		return get_ValueAsPO(COLUMNNAME_M_Product_ProcessingFee_ID, org.compiere.model.I_M_Product.class);
	}

	@Override
	public void setM_Product_ProcessingFee(org.compiere.model.I_M_Product M_Product_ProcessingFee)
	{
		set_ValueFromPO(COLUMNNAME_M_Product_ProcessingFee_ID, org.compiere.model.I_M_Product.class, M_Product_ProcessingFee);
	}

	/** Set Produkt f??r Sortierkosten.
		@param M_Product_ProcessingFee_ID Produkt f??r Sortierkosten	  */
	@Override
	public void setM_Product_ProcessingFee_ID (int M_Product_ProcessingFee_ID)
	{
		if (M_Product_ProcessingFee_ID < 1) 
			set_Value (COLUMNNAME_M_Product_ProcessingFee_ID, null);
		else 
			set_Value (COLUMNNAME_M_Product_ProcessingFee_ID, Integer.valueOf(M_Product_ProcessingFee_ID));
	}

	/** Get Produkt f??r Sortierkosten.
		@return Produkt f??r Sortierkosten	  */
	@Override
	public int getM_Product_ProcessingFee_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ProcessingFee_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	@Override
	public org.compiere.model.I_M_Product getM_Product_RegularPPOrder() throws RuntimeException
	{
		return get_ValueAsPO(COLUMNNAME_M_Product_RegularPPOrder_ID, org.compiere.model.I_M_Product.class);
	}

	@Override
	public void setM_Product_RegularPPOrder(org.compiere.model.I_M_Product M_Product_RegularPPOrder)
	{
		set_ValueFromPO(COLUMNNAME_M_Product_RegularPPOrder_ID, org.compiere.model.I_M_Product.class, M_Product_RegularPPOrder);
	}

	/** Set Produkt f??r Auslagerung.
		@param M_Product_RegularPPOrder_ID Produkt f??r Auslagerung	  */
	@Override
	public void setM_Product_RegularPPOrder_ID (int M_Product_RegularPPOrder_ID)
	{
		if (M_Product_RegularPPOrder_ID < 1) 
			set_Value (COLUMNNAME_M_Product_RegularPPOrder_ID, null);
		else 
			set_Value (COLUMNNAME_M_Product_RegularPPOrder_ID, Integer.valueOf(M_Product_RegularPPOrder_ID));
	}

	/** Get Produkt f??r Auslagerung.
		@return Produkt f??r Auslagerung	  */
	@Override
	public int getM_Product_RegularPPOrder_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_RegularPPOrder_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	@Override
	public org.compiere.model.I_M_Product getM_Product_Scrap() throws RuntimeException
	{
		return get_ValueAsPO(COLUMNNAME_M_Product_Scrap_ID, org.compiere.model.I_M_Product.class);
	}

	@Override
	public void setM_Product_Scrap(org.compiere.model.I_M_Product M_Product_Scrap)
	{
		set_ValueFromPO(COLUMNNAME_M_Product_Scrap_ID, org.compiere.model.I_M_Product.class, M_Product_Scrap);
	}

	/** Set Produkt f??r Entsorgungskosten.
		@param M_Product_Scrap_ID Produkt f??r Entsorgungskosten	  */
	@Override
	public void setM_Product_Scrap_ID (int M_Product_Scrap_ID)
	{
		if (M_Product_Scrap_ID < 1) 
			set_Value (COLUMNNAME_M_Product_Scrap_ID, null);
		else 
			set_Value (COLUMNNAME_M_Product_Scrap_ID, Integer.valueOf(M_Product_Scrap_ID));
	}

	/** Get Produkt f??r Entsorgungskosten.
		@return Produkt f??r Entsorgungskosten	  */
	@Override
	public int getM_Product_Scrap_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_Scrap_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	@Override
	public org.compiere.model.I_M_Product getM_Product_Witholding() throws RuntimeException
	{
		return get_ValueAsPO(COLUMNNAME_M_Product_Witholding_ID, org.compiere.model.I_M_Product.class);
	}

	@Override
	public void setM_Product_Witholding(org.compiere.model.I_M_Product M_Product_Witholding)
	{
		set_ValueFromPO(COLUMNNAME_M_Product_Witholding_ID, org.compiere.model.I_M_Product.class, M_Product_Witholding);
	}

	/** Set Produkt f??r Einbehalt.
		@param M_Product_Witholding_ID Produkt f??r Einbehalt	  */
	@Override
	public void setM_Product_Witholding_ID (int M_Product_Witholding_ID)
	{
		if (M_Product_Witholding_ID < 1) 
			set_Value (COLUMNNAME_M_Product_Witholding_ID, null);
		else 
			set_Value (COLUMNNAME_M_Product_Witholding_ID, Integer.valueOf(M_Product_Witholding_ID));
	}

	/** Get Produkt f??r Einbehalt.
		@return Produkt f??r Einbehalt	  */
	@Override
	public int getM_Product_Witholding_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_Witholding_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	@Override
	public I_M_QualityInsp_LagerKonf getM_QualityInsp_LagerKonf() throws RuntimeException
	{
		return get_ValueAsPO(COLUMNNAME_M_QualityInsp_LagerKonf_ID, I_M_QualityInsp_LagerKonf.class);
	}

	@Override
	public void setM_QualityInsp_LagerKonf(I_M_QualityInsp_LagerKonf M_QualityInsp_LagerKonf)
	{
		set_ValueFromPO(COLUMNNAME_M_QualityInsp_LagerKonf_ID, I_M_QualityInsp_LagerKonf.class, M_QualityInsp_LagerKonf);
	}

	/** Set Lagerkonferenz.
		@param M_QualityInsp_LagerKonf_ID Lagerkonferenz	  */
	@Override
	public void setM_QualityInsp_LagerKonf_ID (int M_QualityInsp_LagerKonf_ID)
	{
		if (M_QualityInsp_LagerKonf_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_M_QualityInsp_LagerKonf_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_M_QualityInsp_LagerKonf_ID, Integer.valueOf(M_QualityInsp_LagerKonf_ID));
	}

	/** Get Lagerkonferenz.
		@return Lagerkonferenz	  */
	@Override
	public int getM_QualityInsp_LagerKonf_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_QualityInsp_LagerKonf_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Lagerkonferenz-Version.
		@param M_QualityInsp_LagerKonf_Version_ID Lagerkonferenz-Version	  */
	@Override
	public void setM_QualityInsp_LagerKonf_Version_ID (int M_QualityInsp_LagerKonf_Version_ID)
	{
		if (M_QualityInsp_LagerKonf_Version_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_M_QualityInsp_LagerKonf_Version_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_M_QualityInsp_LagerKonf_Version_ID, Integer.valueOf(M_QualityInsp_LagerKonf_Version_ID));
	}

	/** Get Lagerkonferenz-Version.
		@return Lagerkonferenz-Version	  */
	@Override
	public int getM_QualityInsp_LagerKonf_Version_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_QualityInsp_LagerKonf_Version_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Anzahl Waschproben.
		@param NumberOfQualityInspections 
		Aus der hier festgelegte Anzahl an Waschproben ergibt sich der Akonto-Prozentsatz pro einzelner Waschprobe
	  */
	@Override
	public void setNumberOfQualityInspections (int NumberOfQualityInspections)
	{
		set_Value (COLUMNNAME_NumberOfQualityInspections, Integer.valueOf(NumberOfQualityInspections));
	}

	/** Get Anzahl Waschproben.
		@return Aus der hier festgelegte Anzahl an Waschproben ergibt sich der Akonto-Prozentsatz pro einzelner Waschprobe
	  */
	@Override
	public int getNumberOfQualityInspections () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_NumberOfQualityInspections);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Schwelle % f??r Entsorgungskosten.
		@param Percentage_Scrap_Treshhold Schwelle % f??r Entsorgungskosten	  */
	@Override
	public void setPercentage_Scrap_Treshhold (java.math.BigDecimal Percentage_Scrap_Treshhold)
	{
		set_Value (COLUMNNAME_Percentage_Scrap_Treshhold, Percentage_Scrap_Treshhold);
	}

	/** Get Schwelle % f??r Entsorgungskosten.
		@return Schwelle % f??r Entsorgungskosten	  */
	@Override
	public java.math.BigDecimal getPercentage_Scrap_Treshhold () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Percentage_Scrap_Treshhold);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Entsorgungskosten pro Einheit.
		@param Scrap_Fee_Amt_Per_UOM Entsorgungskosten pro Einheit	  */
	@Override
	public void setScrap_Fee_Amt_Per_UOM (java.math.BigDecimal Scrap_Fee_Amt_Per_UOM)
	{
		set_Value (COLUMNNAME_Scrap_Fee_Amt_Per_UOM, Scrap_Fee_Amt_Per_UOM);
	}

	/** Get Entsorgungskosten pro Einheit.
		@return Entsorgungskosten pro Einheit	  */
	@Override
	public java.math.BigDecimal getScrap_Fee_Amt_Per_UOM () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Scrap_Fee_Amt_Per_UOM);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set G??ltig ab.
		@param ValidFrom 
		G??ltig ab inklusiv (erster Tag)
	  */
	@Override
	public void setValidFrom (java.sql.Timestamp ValidFrom)
	{
		set_Value (COLUMNNAME_ValidFrom, ValidFrom);
	}

	/** Get G??ltig ab.
		@return G??ltig ab inklusiv (erster Tag)
	  */
	@Override
	public java.sql.Timestamp getValidFrom () 
	{
		return (java.sql.Timestamp)get_Value(COLUMNNAME_ValidFrom);
	}

	/** Set G??ltig bis.
		@param ValidTo 
		G??ltig bis inklusiv (letzter Tag)
	  */
	@Override
	public void setValidTo (java.sql.Timestamp ValidTo)
	{
		set_Value (COLUMNNAME_ValidTo, ValidTo);
	}

	/** Get G??ltig bis.
		@return G??ltig bis inklusiv (letzter Tag)
	  */
	@Override
	public java.sql.Timestamp getValidTo () 
	{
		return (java.sql.Timestamp)get_Value(COLUMNNAME_ValidTo);
	}
}