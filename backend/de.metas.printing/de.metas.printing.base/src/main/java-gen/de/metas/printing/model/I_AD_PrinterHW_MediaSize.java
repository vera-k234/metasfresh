package de.metas.printing.model;


/** Generated Interface for AD_PrinterHW_MediaSize
 *  @author metasfresh (generated) 
 */
@SuppressWarnings("javadoc")
public interface I_AD_PrinterHW_MediaSize 
{

    /** TableName=AD_PrinterHW_MediaSize */
    public static final String Table_Name = "AD_PrinterHW_MediaSize";

    /** AD_Table_ID=540446 */
//    public static final int Table_ID = org.compiere.model.MTable.getTable_ID(Table_Name);


	/**
	 * Get Client.
	 * Client/Tenant for this installation.
	 *
	 * <br>Type: TableDir
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public int getAD_Client_ID();

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/**
	 * Set Organisation.
	 * Organisational entity within client
	 *
	 * <br>Type: Search
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public void setAD_Org_ID (int AD_Org_ID);

	/**
	 * Get Organisation.
	 * Organisational entity within client
	 *
	 * <br>Type: Search
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public int getAD_Org_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/**
	 * Set Hardware-Drucker.
	 *
	 * <br>Type: TableDir
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public void setAD_PrinterHW_ID (int AD_PrinterHW_ID);

	/**
	 * Get Hardware-Drucker.
	 *
	 * <br>Type: TableDir
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public int getAD_PrinterHW_ID();

	public de.metas.printing.model.I_AD_PrinterHW getAD_PrinterHW();

	public void setAD_PrinterHW(de.metas.printing.model.I_AD_PrinterHW AD_PrinterHW);

    /** Column definition for AD_PrinterHW_ID */
    public static final org.adempiere.model.ModelColumn<I_AD_PrinterHW_MediaSize, de.metas.printing.model.I_AD_PrinterHW> COLUMN_AD_PrinterHW_ID = new org.adempiere.model.ModelColumn<I_AD_PrinterHW_MediaSize, de.metas.printing.model.I_AD_PrinterHW>(I_AD_PrinterHW_MediaSize.class, "AD_PrinterHW_ID", de.metas.printing.model.I_AD_PrinterHW.class);
    /** Column name AD_PrinterHW_ID */
    public static final String COLUMNNAME_AD_PrinterHW_ID = "AD_PrinterHW_ID";

	/**
	 * Set Papiergr????e.
	 *
	 * <br>Type: ID
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public void setAD_PrinterHW_MediaSize_ID (int AD_PrinterHW_MediaSize_ID);

	/**
	 * Get Papiergr????e.
	 *
	 * <br>Type: ID
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public int getAD_PrinterHW_MediaSize_ID();

    /** Column definition for AD_PrinterHW_MediaSize_ID */
    public static final org.adempiere.model.ModelColumn<I_AD_PrinterHW_MediaSize, Object> COLUMN_AD_PrinterHW_MediaSize_ID = new org.adempiere.model.ModelColumn<I_AD_PrinterHW_MediaSize, Object>(I_AD_PrinterHW_MediaSize.class, "AD_PrinterHW_MediaSize_ID", null);
    /** Column name AD_PrinterHW_MediaSize_ID */
    public static final String COLUMNNAME_AD_PrinterHW_MediaSize_ID = "AD_PrinterHW_MediaSize_ID";

	/**
	 * Get Created.
	 * Date this record was created
	 *
	 * <br>Type: DateTime
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public java.sql.Timestamp getCreated();

    /** Column definition for Created */
    public static final org.adempiere.model.ModelColumn<I_AD_PrinterHW_MediaSize, Object> COLUMN_Created = new org.adempiere.model.ModelColumn<I_AD_PrinterHW_MediaSize, Object>(I_AD_PrinterHW_MediaSize.class, "Created", null);
    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/**
	 * Get Created By.
	 * User who created this records
	 *
	 * <br>Type: Table
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public int getCreatedBy();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/**
	 * Set Active.
	 * The record is active in the system
	 *
	 * <br>Type: YesNo
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public void setIsActive (boolean IsActive);

	/**
	 * Get Active.
	 * The record is active in the system
	 *
	 * <br>Type: YesNo
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public boolean isActive();

    /** Column definition for IsActive */
    public static final org.adempiere.model.ModelColumn<I_AD_PrinterHW_MediaSize, Object> COLUMN_IsActive = new org.adempiere.model.ModelColumn<I_AD_PrinterHW_MediaSize, Object>(I_AD_PrinterHW_MediaSize.class, "IsActive", null);
    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/**
	 * Set Name.
	 *
	 * <br>Type: String
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public void setName (java.lang.String Name);

	/**
	 * Get Name.
	 *
	 * <br>Type: String
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public java.lang.String getName();

    /** Column definition for Name */
    public static final org.adempiere.model.ModelColumn<I_AD_PrinterHW_MediaSize, Object> COLUMN_Name = new org.adempiere.model.ModelColumn<I_AD_PrinterHW_MediaSize, Object>(I_AD_PrinterHW_MediaSize.class, "Name", null);
    /** Column name Name */
    public static final String COLUMNNAME_Name = "Name";

	/**
	 * Get Updated.
	 * Date this record was updated
	 *
	 * <br>Type: DateTime
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public java.sql.Timestamp getUpdated();

    /** Column definition for Updated */
    public static final org.adempiere.model.ModelColumn<I_AD_PrinterHW_MediaSize, Object> COLUMN_Updated = new org.adempiere.model.ModelColumn<I_AD_PrinterHW_MediaSize, Object>(I_AD_PrinterHW_MediaSize.class, "Updated", null);
    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/**
	 * Get Updated By.
	 * User who updated this records
	 *
	 * <br>Type: Table
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public int getUpdatedBy();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";
}
