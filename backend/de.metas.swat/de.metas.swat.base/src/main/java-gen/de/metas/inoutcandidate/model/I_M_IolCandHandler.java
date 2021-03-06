package de.metas.inoutcandidate.model;

import org.adempiere.model.ModelColumn;

/** Generated Interface for M_IolCandHandler
 *  @author metasfresh (generated) 
 */
@SuppressWarnings("unused")
public interface I_M_IolCandHandler 
{

	String Table_Name = "M_IolCandHandler";

//	/** AD_Table_ID=540385 */
//	int Table_ID = org.compiere.model.MTable.getTable_ID(Table_Name);


	/**
	 * Get Client.
	 * Client/Tenant for this installation.
	 *
	 * <br>Type: TableDir
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	int getAD_Client_ID();

	String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/**
	 * Set Organisation.
	 * Organisational entity within client
	 *
	 * <br>Type: Search
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setAD_Org_ID (int AD_Org_ID);

	/**
	 * Get Organisation.
	 * Organisational entity within client
	 *
	 * <br>Type: Search
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	int getAD_Org_ID();

	String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/**
	 * Set Java-Klasse.
	 *
	 * <br>Type: String
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setClassname (java.lang.String Classname);

	/**
	 * Get Java-Klasse.
	 *
	 * <br>Type: String
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	java.lang.String getClassname();

	ModelColumn<I_M_IolCandHandler, Object> COLUMN_Classname = new ModelColumn<>(I_M_IolCandHandler.class, "Classname", null);
	String COLUMNNAME_Classname = "Classname";

	/**
	 * Get Created.
	 * Date this record was created
	 *
	 * <br>Type: DateTime
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	java.sql.Timestamp getCreated();

	ModelColumn<I_M_IolCandHandler, Object> COLUMN_Created = new ModelColumn<>(I_M_IolCandHandler.class, "Created", null);
	String COLUMNNAME_Created = "Created";

	/**
	 * Get Created By.
	 * User who created this records
	 *
	 * <br>Type: Table
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	int getCreatedBy();

	String COLUMNNAME_CreatedBy = "CreatedBy";

	/**
	 * Set Active.
	 * The record is active in the system
	 *
	 * <br>Type: YesNo
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setIsActive (boolean IsActive);

	/**
	 * Get Active.
	 * The record is active in the system
	 *
	 * <br>Type: YesNo
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	boolean isActive();

	ModelColumn<I_M_IolCandHandler, Object> COLUMN_IsActive = new ModelColumn<>(I_M_IolCandHandler.class, "IsActive", null);
	String COLUMNNAME_IsActive = "IsActive";

	/**
	 * Set M_IolCandHandler.
	 *
	 * <br>Type: ID
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setM_IolCandHandler_ID (int M_IolCandHandler_ID);

	/**
	 * Get M_IolCandHandler.
	 *
	 * <br>Type: ID
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	int getM_IolCandHandler_ID();

	ModelColumn<I_M_IolCandHandler, Object> COLUMN_M_IolCandHandler_ID = new ModelColumn<>(I_M_IolCandHandler.class, "M_IolCandHandler_ID", null);
	String COLUMNNAME_M_IolCandHandler_ID = "M_IolCandHandler_ID";

	/**
	 * Set Name der DB-Tabelle.
	 *
	 * <br>Type: String
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setTableName (java.lang.String TableName);

	/**
	 * Get Name der DB-Tabelle.
	 *
	 * <br>Type: String
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	java.lang.String getTableName();

	ModelColumn<I_M_IolCandHandler, Object> COLUMN_TableName = new ModelColumn<>(I_M_IolCandHandler.class, "TableName", null);
	String COLUMNNAME_TableName = "TableName";

	/**
	 * Get Updated.
	 * Date this record was updated
	 *
	 * <br>Type: DateTime
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	java.sql.Timestamp getUpdated();

	ModelColumn<I_M_IolCandHandler, Object> COLUMN_Updated = new ModelColumn<>(I_M_IolCandHandler.class, "Updated", null);
	String COLUMNNAME_Updated = "Updated";

	/**
	 * Get Updated By.
	 * User who updated this records
	 *
	 * <br>Type: Table
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	int getUpdatedBy();

	String COLUMNNAME_UpdatedBy = "UpdatedBy";
}
