/** Generated Model - DO NOT CHANGE */
package de.metas.tourplanning.model;

import java.sql.ResultSet;
import java.util.Properties;

/** Generated Model for M_TourVersion
 *  @author Adempiere (generated) 
 */
@SuppressWarnings("javadoc")
public class X_M_TourVersion extends org.compiere.model.PO implements I_M_TourVersion, org.compiere.model.I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = -497148905L;

    /** Standard Constructor */
    public X_M_TourVersion (Properties ctx, int M_TourVersion_ID, String trxName)
    {
      super (ctx, M_TourVersion_ID, trxName);
      /** if (M_TourVersion_ID == 0)
        {
			setM_Tour_ID (0);
			setM_TourVersion_ID (0);
			setName (null);
			setValidFrom (new Timestamp( System.currentTimeMillis() ));
        } */
    }

    /** Load Constructor */
    public X_M_TourVersion (Properties ctx, ResultSet rs, String trxName)
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

	/** Set Intervall (in Monaten).
		@param EveryMonth 
		Alle X Monate
	  */
	@Override
	public void setEveryMonth (int EveryMonth)
	{
		set_Value (COLUMNNAME_EveryMonth, Integer.valueOf(EveryMonth));
	}

	/** Get Intervall (in Monaten).
		@return Alle X Monate
	  */
	@Override
	public int getEveryMonth () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_EveryMonth);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Intervall (in Wochen).
		@param EveryWeek 
		Alle X Wochen
	  */
	@Override
	public void setEveryWeek (int EveryWeek)
	{
		set_Value (COLUMNNAME_EveryWeek, Integer.valueOf(EveryWeek));
	}

	/** Get Intervall (in Wochen).
		@return Alle X Wochen
	  */
	@Override
	public int getEveryWeek () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_EveryWeek);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Liefertage verwerfen.
		@param IsCancelDeliveryDay 
		Liefertage, die nicht auf einen Werktag fallen, werden verworfen.
	  */
	@Override
	public void setIsCancelDeliveryDay (boolean IsCancelDeliveryDay)
	{
		set_Value (COLUMNNAME_IsCancelDeliveryDay, Boolean.valueOf(IsCancelDeliveryDay));
	}

	/** Get Liefertage verwerfen.
		@return Liefertage, die nicht auf einen Werktag fallen, werden verworfen.
	  */
	@Override
	public boolean isCancelDeliveryDay () 
	{
		Object oo = get_Value(COLUMNNAME_IsCancelDeliveryDay);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Monatlich.
		@param IsMonthly Monatlich	  */
	@Override
	public void setIsMonthly (boolean IsMonthly)
	{
		set_Value (COLUMNNAME_IsMonthly, Boolean.valueOf(IsMonthly));
	}

	/** Get Monatlich.
		@return Monatlich	  */
	@Override
	public boolean isMonthly () 
	{
		Object oo = get_Value(COLUMNNAME_IsMonthly);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Liefertage verschieben.
		@param IsMoveDeliveryDay 
		Liefertage, Die nicht auf einen Werktag fallen, werden auf den n??chsten Werktag verschoben
	  */
	@Override
	public void setIsMoveDeliveryDay (boolean IsMoveDeliveryDay)
	{
		set_Value (COLUMNNAME_IsMoveDeliveryDay, Boolean.valueOf(IsMoveDeliveryDay));
	}

	/** Get Liefertage verschieben.
		@return Liefertage, Die nicht auf einen Werktag fallen, werden auf den n??chsten Werktag verschoben
	  */
	@Override
	public boolean isMoveDeliveryDay () 
	{
		Object oo = get_Value(COLUMNNAME_IsMoveDeliveryDay);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set W??chentlich.
		@param IsWeekly W??chentlich	  */
	@Override
	public void setIsWeekly (boolean IsWeekly)
	{
		set_Value (COLUMNNAME_IsWeekly, Boolean.valueOf(IsWeekly));
	}

	/** Get W??chentlich.
		@return W??chentlich	  */
	@Override
	public boolean isWeekly () 
	{
		Object oo = get_Value(COLUMNNAME_IsWeekly);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	@Override
	public de.metas.tourplanning.model.I_M_Tour getM_Tour() throws RuntimeException
	{
		return get_ValueAsPO(COLUMNNAME_M_Tour_ID, de.metas.tourplanning.model.I_M_Tour.class);
	}

	@Override
	public void setM_Tour(de.metas.tourplanning.model.I_M_Tour M_Tour)
	{
		set_ValueFromPO(COLUMNNAME_M_Tour_ID, de.metas.tourplanning.model.I_M_Tour.class, M_Tour);
	}

	/** Set Tour.
		@param M_Tour_ID Tour	  */
	@Override
	public void setM_Tour_ID (int M_Tour_ID)
	{
		if (M_Tour_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_M_Tour_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_M_Tour_ID, Integer.valueOf(M_Tour_ID));
	}

	/** Get Tour.
		@return Tour	  */
	@Override
	public int getM_Tour_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Tour_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Tour Version.
		@param M_TourVersion_ID Tour Version	  */
	@Override
	public void setM_TourVersion_ID (int M_TourVersion_ID)
	{
		if (M_TourVersion_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_M_TourVersion_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_M_TourVersion_ID, Integer.valueOf(M_TourVersion_ID));
	}

	/** Get Tour Version.
		@return Tour Version	  */
	@Override
	public int getM_TourVersion_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_TourVersion_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Tag des Monats.
		@param MonthDay 
		Tag des Monats 1 bis 28/29/30/31
	  */
	@Override
	public void setMonthDay (int MonthDay)
	{
		set_Value (COLUMNNAME_MonthDay, Integer.valueOf(MonthDay));
	}

	/** Get Tag des Monats.
		@return Tag des Monats 1 bis 28/29/30/31
	  */
	@Override
	public int getMonthDay () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_MonthDay);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Name.
		@param Name 
		Alphanumeric identifier of the entity
	  */
	@Override
	public void setName (java.lang.String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	@Override
	public java.lang.String getName () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_Name);
	}

	/** Set Freitag.
		@param OnFriday 
		Freitags verf??gbar
	  */
	@Override
	public void setOnFriday (boolean OnFriday)
	{
		set_Value (COLUMNNAME_OnFriday, Boolean.valueOf(OnFriday));
	}

	/** Get Freitag.
		@return Freitags verf??gbar
	  */
	@Override
	public boolean isOnFriday () 
	{
		Object oo = get_Value(COLUMNNAME_OnFriday);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Montag.
		@param OnMonday 
		Montags verf??gbar
	  */
	@Override
	public void setOnMonday (boolean OnMonday)
	{
		set_Value (COLUMNNAME_OnMonday, Boolean.valueOf(OnMonday));
	}

	/** Get Montag.
		@return Montags verf??gbar
	  */
	@Override
	public boolean isOnMonday () 
	{
		Object oo = get_Value(COLUMNNAME_OnMonday);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Samstag.
		@param OnSaturday 
		Samstags verf??gbar
	  */
	@Override
	public void setOnSaturday (boolean OnSaturday)
	{
		set_Value (COLUMNNAME_OnSaturday, Boolean.valueOf(OnSaturday));
	}

	/** Get Samstag.
		@return Samstags verf??gbar
	  */
	@Override
	public boolean isOnSaturday () 
	{
		Object oo = get_Value(COLUMNNAME_OnSaturday);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Sonntag.
		@param OnSunday 
		Sonntags verf??gbar
	  */
	@Override
	public void setOnSunday (boolean OnSunday)
	{
		set_Value (COLUMNNAME_OnSunday, Boolean.valueOf(OnSunday));
	}

	/** Get Sonntag.
		@return Sonntags verf??gbar
	  */
	@Override
	public boolean isOnSunday () 
	{
		Object oo = get_Value(COLUMNNAME_OnSunday);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Donnerstag.
		@param OnThursday 
		Donnerstags verf??gbar
	  */
	@Override
	public void setOnThursday (boolean OnThursday)
	{
		set_Value (COLUMNNAME_OnThursday, Boolean.valueOf(OnThursday));
	}

	/** Get Donnerstag.
		@return Donnerstags verf??gbar
	  */
	@Override
	public boolean isOnThursday () 
	{
		Object oo = get_Value(COLUMNNAME_OnThursday);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Dienstag.
		@param OnTuesday 
		Dienstags verf??gbar
	  */
	@Override
	public void setOnTuesday (boolean OnTuesday)
	{
		set_Value (COLUMNNAME_OnTuesday, Boolean.valueOf(OnTuesday));
	}

	/** Get Dienstag.
		@return Dienstags verf??gbar
	  */
	@Override
	public boolean isOnTuesday () 
	{
		Object oo = get_Value(COLUMNNAME_OnTuesday);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Mittwoch.
		@param OnWednesday 
		Mittwochs verf??gbar
	  */
	@Override
	public void setOnWednesday (boolean OnWednesday)
	{
		set_Value (COLUMNNAME_OnWednesday, Boolean.valueOf(OnWednesday));
	}

	/** Get Mittwoch.
		@return Mittwochs verf??gbar
	  */
	@Override
	public boolean isOnWednesday () 
	{
		Object oo = get_Value(COLUMNNAME_OnWednesday);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Bereitstellungszeit Mo.
		@param PreparationTime_1 
		Preparation time for monday
	  */
	@Override
	public void setPreparationTime_1 (java.sql.Timestamp PreparationTime_1)
	{
		set_Value (COLUMNNAME_PreparationTime_1, PreparationTime_1);
	}

	/** Get Bereitstellungszeit Mo.
		@return Preparation time for monday
	  */
	@Override
	public java.sql.Timestamp getPreparationTime_1 () 
	{
		return (java.sql.Timestamp)get_Value(COLUMNNAME_PreparationTime_1);
	}

	/** Set Bereitstellungszeit Di.
		@param PreparationTime_2 
		Preparation time for tuesday
	  */
	@Override
	public void setPreparationTime_2 (java.sql.Timestamp PreparationTime_2)
	{
		set_Value (COLUMNNAME_PreparationTime_2, PreparationTime_2);
	}

	/** Get Bereitstellungszeit Di.
		@return Preparation time for tuesday
	  */
	@Override
	public java.sql.Timestamp getPreparationTime_2 () 
	{
		return (java.sql.Timestamp)get_Value(COLUMNNAME_PreparationTime_2);
	}

	/** Set Bereitstellungszeit Mi.
		@param PreparationTime_3 
		Preparation time for wednesday
	  */
	@Override
	public void setPreparationTime_3 (java.sql.Timestamp PreparationTime_3)
	{
		set_Value (COLUMNNAME_PreparationTime_3, PreparationTime_3);
	}

	/** Get Bereitstellungszeit Mi.
		@return Preparation time for wednesday
	  */
	@Override
	public java.sql.Timestamp getPreparationTime_3 () 
	{
		return (java.sql.Timestamp)get_Value(COLUMNNAME_PreparationTime_3);
	}

	/** Set Bereitstellungszeit Do.
		@param PreparationTime_4 
		Preparation time for thursday
	  */
	@Override
	public void setPreparationTime_4 (java.sql.Timestamp PreparationTime_4)
	{
		set_Value (COLUMNNAME_PreparationTime_4, PreparationTime_4);
	}

	/** Get Bereitstellungszeit Do.
		@return Preparation time for thursday
	  */
	@Override
	public java.sql.Timestamp getPreparationTime_4 () 
	{
		return (java.sql.Timestamp)get_Value(COLUMNNAME_PreparationTime_4);
	}

	/** Set Bereitstellungszeit Fr.
		@param PreparationTime_5 
		Preparation time for Friday
	  */
	@Override
	public void setPreparationTime_5 (java.sql.Timestamp PreparationTime_5)
	{
		set_Value (COLUMNNAME_PreparationTime_5, PreparationTime_5);
	}

	/** Get Bereitstellungszeit Fr.
		@return Preparation time for Friday
	  */
	@Override
	public java.sql.Timestamp getPreparationTime_5 () 
	{
		return (java.sql.Timestamp)get_Value(COLUMNNAME_PreparationTime_5);
	}

	/** Set Bereitstellungszeit Sa.
		@param PreparationTime_6 
		Preparation time for Saturday
	  */
	@Override
	public void setPreparationTime_6 (java.sql.Timestamp PreparationTime_6)
	{
		set_Value (COLUMNNAME_PreparationTime_6, PreparationTime_6);
	}

	/** Get Bereitstellungszeit Sa.
		@return Preparation time for Saturday
	  */
	@Override
	public java.sql.Timestamp getPreparationTime_6 () 
	{
		return (java.sql.Timestamp)get_Value(COLUMNNAME_PreparationTime_6);
	}

	/** Set Bereitstellungszeit So.
		@param PreparationTime_7 
		Preparation time for Sunday
	  */
	@Override
	public void setPreparationTime_7 (java.sql.Timestamp PreparationTime_7)
	{
		set_Value (COLUMNNAME_PreparationTime_7, PreparationTime_7);
	}

	/** Get Bereitstellungszeit So.
		@return Preparation time for Sunday
	  */
	@Override
	public java.sql.Timestamp getPreparationTime_7 () 
	{
		return (java.sql.Timestamp)get_Value(COLUMNNAME_PreparationTime_7);
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
}