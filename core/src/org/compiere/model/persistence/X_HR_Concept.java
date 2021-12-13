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
/** Generated Model for HR_Concept
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_HR_Concept extends PO
{
/** Standard Constructor
@param ctx context
@param HR_Concept_ID id
@param trxName transaction
*/
public X_HR_Concept (Properties ctx, int HR_Concept_ID, String trxName)
{
super (ctx, HR_Concept_ID, trxName);
/** if (HR_Concept_ID == 0)
{
setColumnType (null);
setHR_Concept_ID (0);
setName (null);
setType (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_HR_Concept (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000256 */
public static int Table_ID=MTable.getTable_ID("HR_Concept");

@XendraTrl(Identifier="97f50f30-ab00-427a-b9e3-67cbc3ab9b51")
public static String es_PE_TABLE_HR_Concept_Name="hr_concept";

@XendraTable(Name="HR_Concept",AD_Package_ID="95f9a029-eaee-0747-b1a5-58cfdd8f8ae5",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="HR_Concept",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=false,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.humanresource",Identifier="97f50f30-ab00-427a-b9e3-67cbc3ab9b51",
Synchronized="2020-03-03 21:38:00.0")
/** TableName=HR_Concept */
public static final String Table_Name="HR_Concept";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"HR_Concept");

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
    Table_ID = MTable.getTable_ID("HR_Concept");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_HR_Concept[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="ea1ed8dc-e973-476b-bde8-05e08274c638")
public static String es_PE_COLUMN_AccountSign_Name="Account Sign";

@XendraColumn(AD_Element_ID="bec935a6-86d9-7793-51fb-4ce378612a32",ColumnName="AccountSign",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ea1ed8dc-e973-476b-bde8-05e08274c638",
Synchronized="2019-08-30 22:22:39.0")
/** Column name AccountSign */
public static final String COLUMNNAME_AccountSign = "AccountSign";
/** Set Reference.
@param AD_Reference_ID System Reference and Validation */
public void setAD_Reference_ID (int AD_Reference_ID)
{
if (AD_Reference_ID <= 0) set_Value (COLUMNNAME_AD_Reference_ID, null);
 else 
set_Value (COLUMNNAME_AD_Reference_ID, Integer.valueOf(AD_Reference_ID));
}
/** Get Reference.
@return System Reference and Validation */
public int getAD_Reference_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Reference_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="685e0ee2-f82d-42c1-ad89-f85a088dc0cf")
public static String es_PE_COLUMN_AD_Reference_ID_Name="Reference";

@XendraColumn(AD_Element_ID="bf1912e9-a75f-4e1b-99b4-d04633e7777b",ColumnName="AD_Reference_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="685e0ee2-f82d-42c1-ad89-f85a088dc0cf",
Synchronized="2019-08-30 22:22:39.0")
/** Column name AD_Reference_ID */
public static final String COLUMNNAME_AD_Reference_ID = "AD_Reference_ID";
/** Set Column Type.
@param ColumnType Column Type */
public void setColumnType (String ColumnType)
{
if (ColumnType.length() > 1)
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

@XendraTrl(Identifier="546b290f-b2d2-4e8d-904c-c2b2209190f6")
public static String es_PE_COLUMN_ColumnType_Name="Column Type";

@XendraColumn(AD_Element_ID="0b8552b6-c46e-65ec-4406-e850f56b5e7e",ColumnName="ColumnType",
AD_Reference_ID=17,AD_Reference_Value_ID="6e4d9dd9-97aa-44da-95df-a5b65ec2a3e0",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="546b290f-b2d2-4e8d-904c-c2b2209190f6",Synchronized="2019-08-30 22:22:39.0")
/** Column name ColumnType */
public static final String COLUMNNAME_ColumnType = "ColumnType";
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

@XendraTrl(Identifier="8da8096d-135a-4e54-8012-ddd870a1f2b4")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8da8096d-135a-4e54-8012-ddd870a1f2b4",
Synchronized="2019-08-30 22:22:40.0")
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

@XendraTrl(Identifier="727a09a7-65d4-4765-a5fc-3d91c0ef7302")
public static String es_PE_COLUMN_HR_Concept_Category_ID_Name="hr_concept_category_id";

@XendraColumn(AD_Element_ID="51f39c06-c565-4ea4-bb59-25a22d0e4024",
ColumnName="HR_Concept_Category_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="727a09a7-65d4-4765-a5fc-3d91c0ef7302",Synchronized="2019-08-30 22:22:40.0")
/** Column name HR_Concept_Category_ID */
public static final String COLUMNNAME_HR_Concept_Category_ID = "HR_Concept_Category_ID";
/** Set HR_Concept_ID.
@param HR_Concept_ID HR_Concept_ID */
public void setHR_Concept_ID (int HR_Concept_ID)
{
if (HR_Concept_ID < 1) throw new IllegalArgumentException ("HR_Concept_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_HR_Concept_ID, Integer.valueOf(HR_Concept_ID));
}
/** Get HR_Concept_ID.
@return HR_Concept_ID */
public int getHR_Concept_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_Concept_ID);
if (ii == null) return 0;
return ii.intValue();
}
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

@XendraTrl(Identifier="fbb3fa8c-1f85-41f5-b0ee-ca03d7307201")
public static String es_PE_COLUMN_HR_Department_ID_Name="hr_department_id";

@XendraColumn(AD_Element_ID="9840f276-88b2-4bd2-accd-1d0a1a1dcf1f",ColumnName="HR_Department_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fbb3fa8c-1f85-41f5-b0ee-ca03d7307201",
Synchronized="2019-08-30 22:22:40.0")
/** Column name HR_Department_ID */
public static final String COLUMNNAME_HR_Department_ID = "HR_Department_ID";
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

@XendraTrl(Identifier="1dd54bf0-e60a-4aa9-ad66-d942c0aa8978")
public static String es_PE_COLUMN_HR_Job_ID_Name="hr_job_id";

@XendraColumn(AD_Element_ID="1c2e67d4-c857-4514-908a-4b5c69d29cb0",ColumnName="HR_Job_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1dd54bf0-e60a-4aa9-ad66-d942c0aa8978",
Synchronized="2019-08-30 22:22:40.0")
/** Column name HR_Job_ID */
public static final String COLUMNNAME_HR_Job_ID = "HR_Job_ID";
/** Set HR_Payroll_ID.
@param HR_Payroll_ID HR_Payroll_ID */
public void setHR_Payroll_ID (int HR_Payroll_ID)
{
if (HR_Payroll_ID <= 0) set_Value (COLUMNNAME_HR_Payroll_ID, null);
 else 
set_Value (COLUMNNAME_HR_Payroll_ID, Integer.valueOf(HR_Payroll_ID));
}
/** Get HR_Payroll_ID.
@return HR_Payroll_ID */
public int getHR_Payroll_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_Payroll_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2dafd98d-f740-4141-a488-efa1d3b3eb27")
public static String es_PE_COLUMN_HR_Payroll_ID_Name="hr_payroll_id";

@XendraColumn(AD_Element_ID="7e583833-168b-49d6-84d9-137ec0c40d00",ColumnName="HR_Payroll_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2dafd98d-f740-4141-a488-efa1d3b3eb27",
Synchronized="2019-08-30 22:22:40.0")
/** Column name HR_Payroll_ID */
public static final String COLUMNNAME_HR_Payroll_ID = "HR_Payroll_ID";
/** Set Identifier.
@param Identifier Identifier */
public void setIdentifier (String Identifier)
{
if (Identifier != null && Identifier.length() > 36)
{
log.warning("Length > 36 - truncated");
Identifier = Identifier.substring(0,35);
}
set_Value (COLUMNNAME_Identifier, Identifier);
}
/** Get Identifier.
@return Identifier */
public String getIdentifier() 
{
String value = (String)get_Value(COLUMNNAME_Identifier);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="7fe57c4b-5eab-40c1-a9b6-d9260d5e0fdf")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7fe57c4b-5eab-40c1-a9b6-d9260d5e0fdf",
Synchronized="2019-08-30 22:22:40.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Default.
@param IsDefault Default value */
public void setIsDefault (boolean IsDefault)
{
set_Value (COLUMNNAME_IsDefault, Boolean.valueOf(IsDefault));
}
/** Get Default.
@return Default value */
public boolean isDefault() 
{
Object oo = get_Value(COLUMNNAME_IsDefault);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="388f19ef-7015-4541-8c28-6b05ae9b8498")
public static String es_PE_COLUMN_IsDefault_Name="Default";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="388f19ef-7015-4541-8c28-6b05ae9b8498",
Synchronized="2019-08-30 22:22:40.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
/** Set Employee.
@param IsEmployee Indicates if  this Business Partner is an employee */
public void setIsEmployee (boolean IsEmployee)
{
set_Value (COLUMNNAME_IsEmployee, Boolean.valueOf(IsEmployee));
}
/** Get Employee.
@return Indicates if  this Business Partner is an employee */
public boolean isEmployee() 
{
Object oo = get_Value(COLUMNNAME_IsEmployee);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="ce4da2aa-c2dd-49ef-9d29-6f82bdff0d2e")
public static String es_PE_COLUMN_IsEmployee_Name="Employee";

@XendraColumn(AD_Element_ID="84da5ee0-801e-eb21-908e-8114648ff2ec",ColumnName="IsEmployee",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ce4da2aa-c2dd-49ef-9d29-6f82bdff0d2e",
Synchronized="2019-08-30 22:22:40.0")
/** Column name IsEmployee */
public static final String COLUMNNAME_IsEmployee = "IsEmployee";
/** Set Invoiced.
@param IsInvoiced Is this invoiced? */
public void setIsInvoiced (boolean IsInvoiced)
{
set_Value (COLUMNNAME_IsInvoiced, Boolean.valueOf(IsInvoiced));
}
/** Get Invoiced.
@return Is this invoiced? */
public boolean isInvoiced() 
{
Object oo = get_Value(COLUMNNAME_IsInvoiced);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="c9ec9214-3467-41c9-ba1c-6427fa3ce6e9")
public static String es_PE_COLUMN_IsInvoiced_Name="Invoiced";

@XendraColumn(AD_Element_ID="a685c688-064e-aa25-7a8b-2b0273e958c1",ColumnName="IsInvoiced",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c9ec9214-3467-41c9-ba1c-6427fa3ce6e9",
Synchronized="2019-08-30 22:22:40.0")
/** Column name IsInvoiced */
public static final String COLUMNNAME_IsInvoiced = "IsInvoiced";
/** Set Manual.
@param IsManual This is a manual process */
public void setIsManual (boolean IsManual)
{
set_Value (COLUMNNAME_IsManual, Boolean.valueOf(IsManual));
}
/** Get Manual.
@return This is a manual process */
public boolean isManual() 
{
Object oo = get_Value(COLUMNNAME_IsManual);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="5a560007-f9fb-489f-a4bf-af27e960ae87")
public static String es_PE_COLUMN_IsManual_Name="Manual";

@XendraColumn(AD_Element_ID="064afee2-bc1c-12d9-20dc-97a2318dc359",ColumnName="IsManual",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5a560007-f9fb-489f-a4bf-af27e960ae87",
Synchronized="2019-08-30 22:22:40.0")
/** Column name IsManual */
public static final String COLUMNNAME_IsManual = "IsManual";
/** Set Paid.
@param IsPaid The document is paid */
public void setIsPaid (boolean IsPaid)
{
set_Value (COLUMNNAME_IsPaid, Boolean.valueOf(IsPaid));
}
/** Get Paid.
@return The document is paid */
public boolean isPaid() 
{
Object oo = get_Value(COLUMNNAME_IsPaid);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="72cf80d7-b353-4732-8a16-5d1907f5a1af")
public static String es_PE_COLUMN_IsPaid_Name="Paid";

@XendraColumn(AD_Element_ID="a4a2359a-ebb8-dca1-8077-df35f747271c",ColumnName="IsPaid",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="72cf80d7-b353-4732-8a16-5d1907f5a1af",
Synchronized="2019-08-30 22:22:40.0")
/** Column name IsPaid */
public static final String COLUMNNAME_IsPaid = "IsPaid";
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

@XendraTrl(Identifier="5ac9dfe1-85f2-4c5c-8a84-170b0eb23cc3")
public static String es_PE_COLUMN_IsPrinted_Name="Printed";

@XendraColumn(AD_Element_ID="66795cb3-a608-19bb-8cde-40abe30a0130",ColumnName="IsPrinted",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5ac9dfe1-85f2-4c5c-8a84-170b0eb23cc3",
Synchronized="2019-08-30 22:22:40.0")
/** Column name IsPrinted */
public static final String COLUMNNAME_IsPrinted = "IsPrinted";
/** Set Receipt.
@param IsReceipt This is a sales transaction (receipt) */
public void setIsReceipt (boolean IsReceipt)
{
set_Value (COLUMNNAME_IsReceipt, Boolean.valueOf(IsReceipt));
}
/** Get Receipt.
@return This is a sales transaction (receipt) */
public boolean isReceipt() 
{
Object oo = get_Value(COLUMNNAME_IsReceipt);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="67b0d710-34af-4dca-94fe-34117fff63e6")
public static String es_PE_COLUMN_IsReceipt_Name="Receipt";

@XendraColumn(AD_Element_ID="68c0f386-4097-c612-05c3-316e89cb3692",ColumnName="IsReceipt",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="67b0d710-34af-4dca-94fe-34117fff63e6",
Synchronized="2019-08-30 22:22:40.0")
/** Column name IsReceipt */
public static final String COLUMNNAME_IsReceipt = "IsReceipt";
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

@XendraTrl(Identifier="af098e19-9b10-494c-bcd3-fce15ff17376")
public static String es_PE_COLUMN_IsRegistered_Name="Registered";

@XendraColumn(AD_Element_ID="723a813c-2ec8-705a-a3d8-de4c5c70d97c",ColumnName="IsRegistered",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="af098e19-9b10-494c-bcd3-fce15ff17376",
Synchronized="2019-08-30 22:22:40.0")
/** Column name IsRegistered */
public static final String COLUMNNAME_IsRegistered = "IsRegistered";
/** Set IsSaveInHistoric.
@param IsSaveInHistoric IsSaveInHistoric */
public void setIsSaveInHistoric (boolean IsSaveInHistoric)
{
set_Value (COLUMNNAME_IsSaveInHistoric, Boolean.valueOf(IsSaveInHistoric));
}
/** Get IsSaveInHistoric.
@return IsSaveInHistoric */
public boolean isSaveInHistoric() 
{
Object oo = get_Value(COLUMNNAME_IsSaveInHistoric);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="94596452-24a7-4e93-a448-ee706e302212")
public static String es_PE_COLUMN_IsSaveInHistoric_Name="issaveinhistoric";

@XendraColumn(AD_Element_ID="32d0bbd4-a7cb-4461-a33a-c33be7615e5a",ColumnName="IsSaveInHistoric",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="94596452-24a7-4e93-a448-ee706e302212",
Synchronized="2019-08-30 22:22:40.0")
/** Column name IsSaveInHistoric */
public static final String COLUMNNAME_IsSaveInHistoric = "IsSaveInHistoric";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name == null) throw new IllegalArgumentException ("Name is mandatory.");
if (Name.length() > 60)
{
log.warning("Length > 60 - truncated");
Name = Name.substring(0,59);
}
set_Value (COLUMNNAME_Name, Name);
}
/** Get Name.
@return Alphanumeric identifier of the entity */
public String getName() 
{
String value = (String)get_Value(COLUMNNAME_Name);
if (value == null)
  return "";
return value;
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getName());
}

@XendraTrl(Identifier="1df5a6ce-088d-4987-86d7-18b8931cd6de")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1df5a6ce-088d-4987-86d7-18b8931cd6de",
Synchronized="2019-08-30 22:22:40.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Sequence.
@param SeqNo Method of ordering records: lowest number comes first */
public void setSeqNo (int SeqNo)
{
set_Value (COLUMNNAME_SeqNo, Integer.valueOf(SeqNo));
}
/** Get Sequence.
@return Method of ordering records: lowest number comes first */
public int getSeqNo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SeqNo);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6a99ff4f-ff92-4232-8cee-f8c5c1eecbc0")
public static String es_PE_COLUMN_SeqNo_Name="Sequence";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6a99ff4f-ff92-4232-8cee-f8c5c1eecbc0",
Synchronized="2019-08-30 22:22:40.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
/** Set Type.
@param Type Type of Validation (SQL, Java Script, Java Language) */
public void setType (String Type)
{
if (Type.length() > 1)
{
log.warning("Length > 1 - truncated");
Type = Type.substring(0,0);
}
set_Value (COLUMNNAME_Type, Type);
}
/** Get Type.
@return Type of Validation (SQL, Java Script, Java Language) */
public String getType() 
{
return (String)get_Value(COLUMNNAME_Type);
}

@XendraTrl(Identifier="ac31e5ed-81f3-46ec-9152-55d7d8ef78a4")
public static String es_PE_COLUMN_Type_Name="Type";

@XendraColumn(AD_Element_ID="25f95bd2-be42-03fc-c8d2-a7103835133c",ColumnName="Type",
AD_Reference_ID=17,AD_Reference_Value_ID="fbb0caf4-6137-4a91-b634-f67caf825eb0",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ac31e5ed-81f3-46ec-9152-55d7d8ef78a4",Synchronized="2019-08-30 22:22:40.0")
/** Column name Type */
public static final String COLUMNNAME_Type = "Type";
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

@XendraTrl(Identifier="7265457c-efa2-4aa9-93aa-cdc5bd9f39b5")
public static String es_PE_COLUMN_ValidFrom_Name="Valid from";

@XendraColumn(AD_Element_ID="86b1171a-a6c6-0da5-1aea-3f3106450d07",ColumnName="ValidFrom",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7265457c-efa2-4aa9-93aa-cdc5bd9f39b5",
Synchronized="2019-08-30 22:22:40.0")
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

@XendraTrl(Identifier="fe23d01c-30dc-4129-a455-fca0a0b69e31")
public static String es_PE_COLUMN_ValidTo_Name="Valid to";

@XendraColumn(AD_Element_ID="0fbe43c3-c76d-0505-0043-63adb568a68f",ColumnName="ValidTo",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fe23d01c-30dc-4129-a455-fca0a0b69e31",
Synchronized="2019-08-30 22:22:40.0")
/** Column name ValidTo */
public static final String COLUMNNAME_ValidTo = "ValidTo";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value != null && Value.length() > 40)
{
log.warning("Length > 40 - truncated");
Value = Value.substring(0,39);
}
set_Value (COLUMNNAME_Value, Value);
}
/** Get Search Key.
@return Search key for the record in the format required - must be unique */
public String getValue() 
{
String value = (String)get_Value(COLUMNNAME_Value);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="312405e9-d29f-4a22-bfb9-a59be7fde97f")
public static String es_PE_COLUMN_Value_Name="Search Key";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="312405e9-d29f-4a22-bfb9-a59be7fde97f",
Synchronized="2019-08-30 22:22:40.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
