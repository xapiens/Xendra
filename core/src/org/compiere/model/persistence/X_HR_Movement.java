/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software. you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY  without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.compiere.model.persistence;

/** Generated Model - DO NOT CHANGE */
import org.compiere.model.*;
import java.util.*;
import java.sql.*;
import java.math.*;
import org.xendra.annotations.*;
import org.compiere.util.*;
/** Generated Model for HR_Movement
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_HR_Movement extends PO
{
/** Standard Constructor
@param ctx context
@param HR_Movement_ID id
@param trxName transaction
*/
public X_HR_Movement (Properties ctx, int HR_Movement_ID, String trxName)
{
super (ctx, HR_Movement_ID, trxName);
/** if (HR_Movement_ID == 0)
{
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_HR_Movement (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000379 */
public static int Table_ID=MTable.getTable_ID("HR_Movement");

@XendraTrl(Identifier="e40ff51c-bd4b-4637-a2a0-38bdc4fe55ff")
public static String es_PE_TABLE_HR_Movement_Name="Payroll Movement";

@XendraTable(Name="Payroll Movement",AD_Package_ID="95f9a029-eaee-0747-b1a5-58cfdd8f8ae5",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="HR_Movement",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.humanresource",Identifier="e40ff51c-bd4b-4637-a2a0-38bdc4fe55ff",
Synchronized="2020-03-03 21:38:01.0")
/** TableName=HR_Movement */
public static final String Table_Name="HR_Movement";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"HR_Movement");

protected BigDecimal accessLevel = BigDecimal.valueOf(3);
/** AccessLevel
@return 3 - Client - Org 
*/
protected int get_AccessLevel()
{
return accessLevel.intValue();
}
/** Load Meta Data
@param ctx context
@return PO Info
*/
protected POInfo initPO (Properties ctx)
{
  if (Table_ID == 0)
    Table_ID = MTable.getTable_ID("HR_Movement");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_HR_Movement[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Account Sign.
@param AccountSign Indicates the Natural Sign of the Account as a Debit or Credit */
public void setAccountSign (boolean AccountSign)
{
set_Value (COLUMNNAME_AccountSign, Boolean.valueOf(AccountSign));
}
/** Get Account Sign.
@return Indicates the Natural Sign of the Account as a Debit or Credit */
public boolean isAccountSign() 
{
Object oo = get_Value(COLUMNNAME_AccountSign);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="71c8a348-5f5f-49f2-a992-f3322741173e")
public static String es_PE_COLUMN_AccountSign_Name="Account Sign";

@XendraColumn(AD_Element_ID="bec935a6-86d9-7793-51fb-4ce378612a32",ColumnName="AccountSign",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="71c8a348-5f5f-49f2-a992-f3322741173e",
Synchronized="2019-08-30 22:22:41.0")
/** Column name AccountSign */
public static final String COLUMNNAME_AccountSign = "AccountSign";
/** Set Trx Organization.
@param AD_OrgTrx_ID Performing or initiating organization */
public void setAD_OrgTrx_ID (int AD_OrgTrx_ID)
{
if (AD_OrgTrx_ID <= 0) set_Value (COLUMNNAME_AD_OrgTrx_ID, null);
 else 
set_Value (COLUMNNAME_AD_OrgTrx_ID, Integer.valueOf(AD_OrgTrx_ID));
}
/** Get Trx Organization.
@return Performing or initiating organization */
public int getAD_OrgTrx_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_OrgTrx_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5b7c821e-3cfa-4093-b0c7-d8f1f8834e02")
public static String es_PE_COLUMN_AD_OrgTrx_ID_Name="Trx Organization";

@XendraColumn(AD_Element_ID="b4180358-67aa-fe55-0409-6367a60e0a2e",ColumnName="AD_OrgTrx_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5b7c821e-3cfa-4093-b0c7-d8f1f8834e02",
Synchronized="2019-08-30 22:22:41.0")
/** Column name AD_OrgTrx_ID */
public static final String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
/** Set AD_Rule_ID.
@param AD_Rule_ID AD_Rule_ID */
public void setAD_Rule_ID (int AD_Rule_ID)
{
if (AD_Rule_ID <= 0) set_Value (COLUMNNAME_AD_Rule_ID, null);
 else 
set_Value (COLUMNNAME_AD_Rule_ID, Integer.valueOf(AD_Rule_ID));
}
/** Get AD_Rule_ID.
@return AD_Rule_ID */
public int getAD_Rule_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Rule_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="13e108e3-3a45-4de1-9a2f-6a94a4467e0f")
public static String es_PE_COLUMN_AD_Rule_ID_Name="AD_Rule_ID";

@XendraColumn(AD_Element_ID="4b4afdeb-6aca-d182-6e3a-83f0f6d29f7d",ColumnName="AD_Rule_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="13e108e3-3a45-4de1-9a2f-6a94a4467e0f",
Synchronized="2019-08-30 22:22:41.0")
/** Column name AD_Rule_ID */
public static final String COLUMNNAME_AD_Rule_ID = "AD_Rule_ID";
/** Set Amount.
@param Amount Amount in a defined currency */
public void setAmount (BigDecimal Amount)
{
set_Value (COLUMNNAME_Amount, Amount);
}
/** Get Amount.
@return Amount in a defined currency */
public BigDecimal getAmount() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amount);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="fa8b4f83-0c04-4b74-817b-9da6a31fb0d2")
public static String es_PE_COLUMN_Amount_Name="Amount";

@XendraColumn(AD_Element_ID="d89b3a02-29fd-e2e3-2d01-dbda08fb2454",ColumnName="Amount",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fa8b4f83-0c04-4b74-817b-9da6a31fb0d2",
Synchronized="2019-08-30 22:22:41.0")
/** Column name Amount */
public static final String COLUMNNAME_Amount = "Amount";
/** Set Activity.
@param C_Activity_ID Business Activity */
public void setC_Activity_ID (int C_Activity_ID)
{
if (C_Activity_ID <= 0) set_Value (COLUMNNAME_C_Activity_ID, null);
 else 
set_Value (COLUMNNAME_C_Activity_ID, Integer.valueOf(C_Activity_ID));
}
/** Get Activity.
@return Business Activity */
public int getC_Activity_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Activity_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1250505a-1d1e-436a-bb74-0aea38191433")
public static String es_PE_COLUMN_C_Activity_ID_Name="Activity";

@XendraColumn(AD_Element_ID="bfeadbb3-d866-26e3-8eee-3e2fdf0ff753",ColumnName="C_Activity_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1250505a-1d1e-436a-bb74-0aea38191433",
Synchronized="2019-08-30 22:22:41.0")
/** Column name C_Activity_ID */
public static final String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID <= 0) set_Value (COLUMNNAME_C_BPartner_ID, null);
 else 
set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
}
/** Get Business Partner .
@return Identifies a Business Partner */
public int getC_BPartner_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="99055832-1574-43a5-8da2-e25ca61ceb04")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Business Partner ";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="99055832-1574-43a5-8da2-e25ca61ceb04",
Synchronized="2019-08-30 22:22:41.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Partner Bank Account.
@param C_BP_BankAccount_ID Bank Account of the Business Partner */
public void setC_BP_BankAccount_ID (int C_BP_BankAccount_ID)
{
if (C_BP_BankAccount_ID <= 0) set_Value (COLUMNNAME_C_BP_BankAccount_ID, null);
 else 
set_Value (COLUMNNAME_C_BP_BankAccount_ID, Integer.valueOf(C_BP_BankAccount_ID));
}
/** Get Partner Bank Account.
@return Bank Account of the Business Partner */
public int getC_BP_BankAccount_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BP_BankAccount_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="107e36fc-1534-4dca-b5de-04eefd4eb2c3")
public static String es_PE_COLUMN_C_BP_BankAccount_ID_Name="Partner Bank Account";

@XendraColumn(AD_Element_ID="3c4f5cea-368f-2a75-7414-a8d02110104b",
ColumnName="C_BP_BankAccount_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="107e36fc-1534-4dca-b5de-04eefd4eb2c3",Synchronized="2019-08-30 22:22:41.0")
/** Column name C_BP_BankAccount_ID */
public static final String COLUMNNAME_C_BP_BankAccount_ID = "C_BP_BankAccount_ID";
/** Set Business Partner Group.
@param C_BP_Group_ID Business Partner Group */
public void setC_BP_Group_ID (int C_BP_Group_ID)
{
if (C_BP_Group_ID <= 0) set_Value (COLUMNNAME_C_BP_Group_ID, null);
 else 
set_Value (COLUMNNAME_C_BP_Group_ID, Integer.valueOf(C_BP_Group_ID));
}
/** Get Business Partner Group.
@return Business Partner Group */
public int getC_BP_Group_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BP_Group_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="71e6f6e7-eb1e-4893-bc4e-4bbeef7d9f62")
public static String es_PE_COLUMN_C_BP_Group_ID_Name="Business Partner Group";

@XendraColumn(AD_Element_ID="e4bea975-0a3a-c828-703f-724f29c7518a",ColumnName="C_BP_Group_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="71e6f6e7-eb1e-4893-bc4e-4bbeef7d9f62",
Synchronized="2019-08-30 22:22:41.0")
/** Column name C_BP_Group_ID */
public static final String COLUMNNAME_C_BP_Group_ID = "C_BP_Group_ID";
/** Set Campaign.
@param C_Campaign_ID Marketing Campaign */
public void setC_Campaign_ID (int C_Campaign_ID)
{
if (C_Campaign_ID <= 0) set_Value (COLUMNNAME_C_Campaign_ID, null);
 else 
set_Value (COLUMNNAME_C_Campaign_ID, Integer.valueOf(C_Campaign_ID));
}
/** Get Campaign.
@return Marketing Campaign */
public int getC_Campaign_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Campaign_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b4967171-3608-4627-a39a-5e49f0dcd341")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaign";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b4967171-3608-4627-a39a-5e49f0dcd341",
Synchronized="2019-08-30 22:22:41.0")
/** Column name C_Campaign_ID */
public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
/** Set Column Type.
@param ColumnType Column Type */
public void setColumnType (String ColumnType)
{
if (ColumnType != null && ColumnType.length() > 1)
{
log.warning("Length > 1 - truncated");
ColumnType = ColumnType.substring(0,0);
}
set_Value (COLUMNNAME_ColumnType, ColumnType);
}
/** Get Column Type.
@return Column Type */
public String getColumnType() 
{
return (String)get_Value(COLUMNNAME_ColumnType);
}

@XendraTrl(Identifier="885b5eeb-96a0-49ec-a202-9e266ab600ac")
public static String es_PE_COLUMN_ColumnType_Name="Column Type";

@XendraColumn(AD_Element_ID="0b8552b6-c46e-65ec-4406-e850f56b5e7e",ColumnName="ColumnType",
AD_Reference_ID=17,AD_Reference_Value_ID="6e4d9dd9-97aa-44da-95df-a5b65ec2a3e0",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="885b5eeb-96a0-49ec-a202-9e266ab600ac",Synchronized="2019-08-30 22:22:41.0")
/** Column name ColumnType */
public static final String COLUMNNAME_ColumnType = "ColumnType";
/** Set Project.
@param C_Project_ID Financial Project */
public void setC_Project_ID (int C_Project_ID)
{
if (C_Project_ID <= 0) set_Value (COLUMNNAME_C_Project_ID, null);
 else 
set_Value (COLUMNNAME_C_Project_ID, Integer.valueOf(C_Project_ID));
}
/** Get Project.
@return Financial Project */
public int getC_Project_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Project_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3a3c0a09-5e9f-441a-a639-461663420c42")
public static String es_PE_COLUMN_C_Project_ID_Name="Project";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3a3c0a09-5e9f-441a-a639-461663420c42",
Synchronized="2019-08-30 22:22:41.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
/** Set Project Phase.
@param C_ProjectPhase_ID Phase of a Project */
public void setC_ProjectPhase_ID (int C_ProjectPhase_ID)
{
if (C_ProjectPhase_ID <= 0) set_Value (COLUMNNAME_C_ProjectPhase_ID, null);
 else 
set_Value (COLUMNNAME_C_ProjectPhase_ID, Integer.valueOf(C_ProjectPhase_ID));
}
/** Get Project Phase.
@return Phase of a Project */
public int getC_ProjectPhase_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ProjectPhase_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b9bcdc28-bf08-4976-8ac4-6ee91eb89746")
public static String es_PE_COLUMN_C_ProjectPhase_ID_Name="Project Phase";

@XendraColumn(AD_Element_ID="ba6e5aab-8337-208a-03da-5712e50d4da9",ColumnName="C_ProjectPhase_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b9bcdc28-bf08-4976-8ac4-6ee91eb89746",
Synchronized="2019-08-30 22:22:41.0")
/** Column name C_ProjectPhase_ID */
public static final String COLUMNNAME_C_ProjectPhase_ID = "C_ProjectPhase_ID";
/** Set Project Task.
@param C_ProjectTask_ID Actual Project Task in a Phase */
public void setC_ProjectTask_ID (int C_ProjectTask_ID)
{
if (C_ProjectTask_ID <= 0) set_Value (COLUMNNAME_C_ProjectTask_ID, null);
 else 
set_Value (COLUMNNAME_C_ProjectTask_ID, Integer.valueOf(C_ProjectTask_ID));
}
/** Get Project Task.
@return Actual Project Task in a Phase */
public int getC_ProjectTask_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ProjectTask_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0de9f169-e292-43eb-aa25-75e439eccde9")
public static String es_PE_COLUMN_C_ProjectTask_ID_Name="Project Task";

@XendraColumn(AD_Element_ID="1b2d7a20-215c-4f56-6077-83adcead0920",ColumnName="C_ProjectTask_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0de9f169-e292-43eb-aa25-75e439eccde9",
Synchronized="2019-08-30 22:22:41.0")
/** Column name C_ProjectTask_ID */
public static final String COLUMNNAME_C_ProjectTask_ID = "C_ProjectTask_ID";
/** Set Description.
@param Description Optional short DESCRIPTION of the record */
public void setDescription (String Description)
{
if (Description != null && Description.length() > 255)
{
log.warning("Length > 255 - truncated");
Description = Description.substring(0,254);
}
set_Value (COLUMNNAME_Description, Description);
}
/** Get Description.
@return Optional short DESCRIPTION of the record */
public String getDescription() 
{
String value = (String)get_Value(COLUMNNAME_Description);
if (value == null)
  return "";
if (value.contains("\""))
  value = value.replaceAll("\"","'");
if (value.contains("\n"))
  value = value.replaceAll("\n"," ");
if (value.contains(";"))
  value = value.replaceAll(";",":");
return value;
}

@XendraTrl(Identifier="3bab1f7f-7691-4ef8-86e9-7bdd7d496640")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3bab1f7f-7691-4ef8-86e9-7bdd7d496640",
Synchronized="2019-08-30 22:22:41.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set HR_Concept_Category_ID.
@param HR_Concept_Category_ID HR_Concept_Category_ID */
public void setHR_Concept_Category_ID (int HR_Concept_Category_ID)
{
if (HR_Concept_Category_ID <= 0) set_Value (COLUMNNAME_HR_Concept_Category_ID, null);
 else 
set_Value (COLUMNNAME_HR_Concept_Category_ID, Integer.valueOf(HR_Concept_Category_ID));
}
/** Get HR_Concept_Category_ID.
@return HR_Concept_Category_ID */
public int getHR_Concept_Category_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_Concept_Category_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="71285a9a-aad0-469d-a49f-a02e493951fe")
public static String es_PE_COLUMN_HR_Concept_Category_ID_Name="HR_Concept_Category_ID";

@XendraColumn(AD_Element_ID="51f39c06-c565-4ea4-bb59-25a22d0e4024",
ColumnName="HR_Concept_Category_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="71285a9a-aad0-469d-a49f-a02e493951fe",Synchronized="2019-08-30 22:22:41.0")
/** Column name HR_Concept_Category_ID */
public static final String COLUMNNAME_HR_Concept_Category_ID = "HR_Concept_Category_ID";
/** Set HR_Concept_ID.
@param HR_Concept_ID HR_Concept_ID */
public void setHR_Concept_ID (int HR_Concept_ID)
{
if (HR_Concept_ID <= 0) set_Value (COLUMNNAME_HR_Concept_ID, null);
 else 
set_Value (COLUMNNAME_HR_Concept_ID, Integer.valueOf(HR_Concept_ID));
}
/** Get HR_Concept_ID.
@return HR_Concept_ID */
public int getHR_Concept_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_Concept_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4830e250-d649-4f60-be76-6581c3fb741f")
public static String es_PE_COLUMN_HR_Concept_ID_Name="HR_Concept_ID";

@XendraColumn(AD_Element_ID="9f5a2e6a-1245-463f-ae5e-e1543a9bd3b1",ColumnName="HR_Concept_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4830e250-d649-4f60-be76-6581c3fb741f",
Synchronized="2019-08-30 22:22:41.0")
/** Column name HR_Concept_ID */
public static final String COLUMNNAME_HR_Concept_ID = "HR_Concept_ID";
/** Set Payroll Department.
@param HR_Department_ID Payroll Department */
public void setHR_Department_ID (int HR_Department_ID)
{
if (HR_Department_ID <= 0) set_Value (COLUMNNAME_HR_Department_ID, null);
 else 
set_Value (COLUMNNAME_HR_Department_ID, Integer.valueOf(HR_Department_ID));
}
/** Get Payroll Department.
@return Payroll Department */
public int getHR_Department_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_Department_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="264779ea-9d40-4472-8aab-091d3c4f955c")
public static String es_PE_COLUMN_HR_Department_ID_Name="Payroll Department";

@XendraColumn(AD_Element_ID="9840f276-88b2-4bd2-accd-1d0a1a1dcf1f",ColumnName="HR_Department_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="264779ea-9d40-4472-8aab-091d3c4f955c",
Synchronized="2019-08-30 22:22:41.0")
/** Column name HR_Department_ID */
public static final String COLUMNNAME_HR_Department_ID = "HR_Department_ID";
/** Set HR_Incidence_ID.
@param HR_Incidence_ID HR_Incidence_ID */
public void setHR_Incidence_ID (int HR_Incidence_ID)
{
if (HR_Incidence_ID <= 0) set_Value (COLUMNNAME_HR_Incidence_ID, null);
 else 
set_Value (COLUMNNAME_HR_Incidence_ID, Integer.valueOf(HR_Incidence_ID));
}
/** Get HR_Incidence_ID.
@return HR_Incidence_ID */
public int getHR_Incidence_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_Incidence_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b7b9969c-9821-451b-ad74-decd191528f1")
public static String es_PE_COLUMN_HR_Incidence_ID_Name="HR_Incidence_ID";

@XendraColumn(AD_Element_ID="ca7c2046-e4af-41cd-879d-d9e483294333",ColumnName="HR_Incidence_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b7b9969c-9821-451b-ad74-decd191528f1",
Synchronized="2019-08-30 22:22:41.0")
/** Column name HR_Incidence_ID */
public static final String COLUMNNAME_HR_Incidence_ID = "HR_Incidence_ID";
/** Set HR_Job_ID.
@param HR_Job_ID HR_Job_ID */
public void setHR_Job_ID (int HR_Job_ID)
{
if (HR_Job_ID <= 0) set_Value (COLUMNNAME_HR_Job_ID, null);
 else 
set_Value (COLUMNNAME_HR_Job_ID, Integer.valueOf(HR_Job_ID));
}
/** Get HR_Job_ID.
@return HR_Job_ID */
public int getHR_Job_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_Job_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="dd0fcd30-3ac3-4edb-89d2-4a3f6e888ef0")
public static String es_PE_COLUMN_HR_Job_ID_Name="HR_Job_ID";

@XendraColumn(AD_Element_ID="1c2e67d4-c857-4514-908a-4b5c69d29cb0",ColumnName="HR_Job_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dd0fcd30-3ac3-4edb-89d2-4a3f6e888ef0",
Synchronized="2019-08-30 22:22:41.0")
/** Column name HR_Job_ID */
public static final String COLUMNNAME_HR_Job_ID = "HR_Job_ID";
/** Set Payroll Movement.
@param HR_Movement_ID Payroll Movement */
public void setHR_Movement_ID (int HR_Movement_ID)
{
if (HR_Movement_ID <= 0) set_ValueNoCheck (COLUMNNAME_HR_Movement_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_HR_Movement_ID, Integer.valueOf(HR_Movement_ID));
}
/** Get Payroll Movement.
@return Payroll Movement */
public int getHR_Movement_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_Movement_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name HR_Movement_ID */
public static final String COLUMNNAME_HR_Movement_ID = "HR_Movement_ID";
/** Set HR_Process_ID.
@param HR_Process_ID HR_Process_ID */
public void setHR_Process_ID (int HR_Process_ID)
{
if (HR_Process_ID <= 0) set_Value (COLUMNNAME_HR_Process_ID, null);
 else 
set_Value (COLUMNNAME_HR_Process_ID, Integer.valueOf(HR_Process_ID));
}
/** Get HR_Process_ID.
@return HR_Process_ID */
public int getHR_Process_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_Process_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="48f4ab4d-52bd-41a2-a62e-5eaa919ed9ab")
public static String es_PE_COLUMN_HR_Process_ID_Name="HR_Process_ID";

@XendraColumn(AD_Element_ID="114b5b74-200c-4ddd-b2ca-48b8cf7ff0e6",ColumnName="HR_Process_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="48f4ab4d-52bd-41a2-a62e-5eaa919ed9ab",
Synchronized="2019-08-30 22:22:41.0")
/** Column name HR_Process_ID */
public static final String COLUMNNAME_HR_Process_ID = "HR_Process_ID";
/** Set Printed.
@param IsPrinted Indicates if this document / line is printed */
public void setIsPrinted (boolean IsPrinted)
{
set_Value (COLUMNNAME_IsPrinted, Boolean.valueOf(IsPrinted));
}
/** Get Printed.
@return Indicates if this document / line is printed */
public boolean isPrinted() 
{
Object oo = get_Value(COLUMNNAME_IsPrinted);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="718412c9-76af-47fa-b288-c079afacbbb8")
public static String es_PE_COLUMN_IsPrinted_Name="Printed";

@XendraColumn(AD_Element_ID="66795cb3-a608-19bb-8cde-40abe30a0130",ColumnName="IsPrinted",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="718412c9-76af-47fa-b288-c079afacbbb8",
Synchronized="2019-08-30 22:22:41.0")
/** Column name IsPrinted */
public static final String COLUMNNAME_IsPrinted = "IsPrinted";
/** Set Registered.
@param IsRegistered The application is registered. */
public void setIsRegistered (boolean IsRegistered)
{
set_Value (COLUMNNAME_IsRegistered, Boolean.valueOf(IsRegistered));
}
/** Get Registered.
@return The application is registered. */
public boolean isRegistered() 
{
Object oo = get_Value(COLUMNNAME_IsRegistered);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="0925d0c8-acb6-4144-bb98-ede112b00ed5")
public static String es_PE_COLUMN_IsRegistered_Name="Registered";

@XendraColumn(AD_Element_ID="723a813c-2ec8-705a-a3d8-de4c5c70d97c",ColumnName="IsRegistered",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0925d0c8-acb6-4144-bb98-ede112b00ed5",
Synchronized="2019-08-30 22:22:41.0")
/** Column name IsRegistered */
public static final String COLUMNNAME_IsRegistered = "IsRegistered";
/** Set Processed.
@param Processed The document has been processed */
public void setProcessed (boolean Processed)
{
set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
}
/** Get Processed.
@return The document has been processed */
public boolean isProcessed() 
{
Object oo = get_Value(COLUMNNAME_Processed);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="40d855ca-be8a-4977-83bd-b03ff22ef236")
public static String es_PE_COLUMN_Processed_Name="Processed";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="40d855ca-be8a-4977-83bd-b03ff22ef236",
Synchronized="2019-08-30 22:22:41.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set Quantity.
@param Qty Quantity */
public void setQty (BigDecimal Qty)
{
set_Value (COLUMNNAME_Qty, Qty);
}
/** Get Quantity.
@return Quantity */
public BigDecimal getQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Qty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="e5777bc8-2a47-433f-a982-a62b76c4929f")
public static String es_PE_COLUMN_Qty_Name="Quantity";

@XendraColumn(AD_Element_ID="c9d74a25-87c5-9592-5660-4f397607dad3",ColumnName="Qty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e5777bc8-2a47-433f-a982-a62b76c4929f",
Synchronized="2019-08-30 22:22:41.0")
/** Column name Qty */
public static final String COLUMNNAME_Qty = "Qty";
/** Set Service date.
@param ServiceDate Date service was provided */
public void setServiceDate (Timestamp ServiceDate)
{
set_Value (COLUMNNAME_ServiceDate, ServiceDate);
}
/** Get Service date.
@return Date service was provided */
public Timestamp getServiceDate() 
{
return (Timestamp)get_Value(COLUMNNAME_ServiceDate);
}

@XendraTrl(Identifier="578e7b60-b9e7-47bd-a2c8-8d630e66984f")
public static String es_PE_COLUMN_ServiceDate_Name="Service date";

@XendraColumn(AD_Element_ID="99e6be5a-1737-5ca4-7cf9-74454571eafc",ColumnName="ServiceDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="578e7b60-b9e7-47bd-a2c8-8d630e66984f",
Synchronized="2019-08-30 22:22:41.0")
/** Column name ServiceDate */
public static final String COLUMNNAME_ServiceDate = "ServiceDate";
/** Set Text Message.
@param TextMsg Text Message */
public void setTextMsg (String TextMsg)
{
if (TextMsg != null && TextMsg.length() > 255)
{
log.warning("Length > 255 - truncated");
TextMsg = TextMsg.substring(0,254);
}
set_Value (COLUMNNAME_TextMsg, TextMsg);
}
/** Get Text Message.
@return Text Message */
public String getTextMsg() 
{
String value = (String)get_Value(COLUMNNAME_TextMsg);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c8dce919-d31e-4298-9b6f-4a47047c9308")
public static String es_PE_COLUMN_TextMsg_Name="Text Message";

@XendraColumn(AD_Element_ID="377bebfe-238a-1c79-c1a9-13afa4448222",ColumnName="TextMsg",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c8dce919-d31e-4298-9b6f-4a47047c9308",
Synchronized="2019-08-30 22:22:41.0")
/** Column name TextMsg */
public static final String COLUMNNAME_TextMsg = "TextMsg";
/** Set User List 1.
@param User1_ID User defined list element #1 */
public void setUser1_ID (int User1_ID)
{
if (User1_ID <= 0) set_Value (COLUMNNAME_User1_ID, null);
 else 
set_Value (COLUMNNAME_User1_ID, Integer.valueOf(User1_ID));
}
/** Get User List 1.
@return User defined list element #1 */
public int getUser1_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_User1_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ec3dcfff-14b5-4317-801b-bc68b9aa7468")
public static String es_PE_COLUMN_User1_ID_Name="User List 1";

@XendraColumn(AD_Element_ID="07453e74-aadd-d9c9-e543-837a6fdb3094",ColumnName="User1_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ec3dcfff-14b5-4317-801b-bc68b9aa7468",
Synchronized="2019-08-30 22:22:41.0")
/** Column name User1_ID */
public static final String COLUMNNAME_User1_ID = "User1_ID";
/** Set User List 2.
@param User2_ID User defined list element #2 */
public void setUser2_ID (int User2_ID)
{
if (User2_ID <= 0) set_Value (COLUMNNAME_User2_ID, null);
 else 
set_Value (COLUMNNAME_User2_ID, Integer.valueOf(User2_ID));
}
/** Get User List 2.
@return User defined list element #2 */
public int getUser2_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_User2_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f68074d8-4221-467c-a2ac-af79d9ae992a")
public static String es_PE_COLUMN_User2_ID_Name="User List 2";

@XendraColumn(AD_Element_ID="1b668c90-6743-20a2-df62-576857d72c06",ColumnName="User2_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f68074d8-4221-467c-a2ac-af79d9ae992a",
Synchronized="2019-08-30 22:22:41.0")
/** Column name User2_ID */
public static final String COLUMNNAME_User2_ID = "User2_ID";
/** Set Valid from.
@param ValidFrom Valid from including this date (first day) */
public void setValidFrom (Timestamp ValidFrom)
{
set_Value (COLUMNNAME_ValidFrom, ValidFrom);
}
/** Get Valid from.
@return Valid from including this date (first day) */
public Timestamp getValidFrom() 
{
return (Timestamp)get_Value(COLUMNNAME_ValidFrom);
}

@XendraTrl(Identifier="c85fbb85-fbea-4399-b61e-f462265fab22")
public static String es_PE_COLUMN_ValidFrom_Name="Valid from";

@XendraColumn(AD_Element_ID="86b1171a-a6c6-0da5-1aea-3f3106450d07",ColumnName="ValidFrom",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c85fbb85-fbea-4399-b61e-f462265fab22",
Synchronized="2019-08-30 22:22:41.0")
/** Column name ValidFrom */
public static final String COLUMNNAME_ValidFrom = "ValidFrom";
/** Set Valid to.
@param ValidTo Valid to including this date (last day) */
public void setValidTo (Timestamp ValidTo)
{
set_Value (COLUMNNAME_ValidTo, ValidTo);
}
/** Get Valid to.
@return Valid to including this date (last day) */
public Timestamp getValidTo() 
{
return (Timestamp)get_Value(COLUMNNAME_ValidTo);
}

@XendraTrl(Identifier="55ea074e-be21-47fe-8ccd-ebea06152b76")
public static String es_PE_COLUMN_ValidTo_Name="Valid to";

@XendraColumn(AD_Element_ID="0fbe43c3-c76d-0505-0043-63adb568a68f",ColumnName="ValidTo",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="55ea074e-be21-47fe-8ccd-ebea06152b76",
Synchronized="2019-08-30 22:22:41.0")
/** Column name ValidTo */
public static final String COLUMNNAME_ValidTo = "ValidTo";
}
