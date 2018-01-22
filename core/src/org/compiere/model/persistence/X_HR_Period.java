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
/** Generated Model for HR_Period
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_HR_Period extends PO
{
/** Standard Constructor
@param ctx context
@param HR_Period_ID id
@param trxName transaction
*/
public X_HR_Period (Properties ctx, int HR_Period_ID, String trxName)
{
super (ctx, HR_Period_ID, trxName);
/** if (HR_Period_ID == 0)
{
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_HR_Period (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000377 */
public static int Table_ID=MTable.getTable_ID("HR_Period");

@XendraTrl(Identifier="d5098cff-74dc-4eb1-8928-de4afc076eaa")
public static String es_PE_TABLE_HR_Period_Name="Payroll Period";

@XendraTable(Name="Payroll Period",Description="",Help="",TableName="HR_Period",AccessLevel="3",
AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,
IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.humanresource",
Identifier="d5098cff-74dc-4eb1-8928-de4afc076eaa",Synchronized="2017-08-16 11:42:49.0")
/** TableName=HR_Period */
public static final String Table_Name="HR_Period";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"HR_Period");

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
    Table_ID = MTable.getTable_ID("HR_Period");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_HR_Period[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Period.
@param C_Period_ID Period of the Calendar */
public void setC_Period_ID (int C_Period_ID)
{
if (C_Period_ID <= 0) set_Value (COLUMNNAME_C_Period_ID, null);
 else 
set_Value (COLUMNNAME_C_Period_ID, Integer.valueOf(C_Period_ID));
}
/** Get Period.
@return Period of the Calendar */
public int getC_Period_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Period_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="658b3341-ba52-4194-9ad0-665ed9bb3c1a")
public static String es_PE_COLUMN_C_Period_ID_Name="Period";

@XendraColumn(AD_Element_ID="8f295c04-0eb4-a8f3-829f-cc6a6bd1df1e",ColumnName="C_Period_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="658b3341-ba52-4194-9ad0-665ed9bb3c1a",
Synchronized="2017-08-05 16:54:47.0")
/** Column name C_Period_ID */
public static final String COLUMNNAME_C_Period_ID = "C_Period_ID";
/** Set Year.
@param C_Year_ID Calendar Year */
public void setC_Year_ID (int C_Year_ID)
{
if (C_Year_ID <= 0) set_Value (COLUMNNAME_C_Year_ID, null);
 else 
set_Value (COLUMNNAME_C_Year_ID, Integer.valueOf(C_Year_ID));
}
/** Get Year.
@return Calendar Year */
public int getC_Year_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Year_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="74a54a8e-a486-41e7-a589-a9f8142c7bb8")
public static String es_PE_COLUMN_C_Year_ID_Name="Year";

@XendraColumn(AD_Element_ID="c7021f96-c6b3-e088-ab83-e25c3e111170",ColumnName="C_Year_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="74a54a8e-a486-41e7-a589-a9f8142c7bb8",
Synchronized="2017-08-05 16:54:47.0")
/** Column name C_Year_ID */
public static final String COLUMNNAME_C_Year_ID = "C_Year_ID";
/** Set Account Date.
@param DateAcct Accounting Date */
public void setDateAcct (Timestamp DateAcct)
{
set_Value (COLUMNNAME_DateAcct, DateAcct);
}
/** Get Account Date.
@return Accounting Date */
public Timestamp getDateAcct() 
{
return (Timestamp)get_Value(COLUMNNAME_DateAcct);
}

@XendraTrl(Identifier="7c23eaff-4d59-40e8-8caf-ae101b2ef9cc")
public static String es_PE_COLUMN_DateAcct_Name="Account Date";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7c23eaff-4d59-40e8-8caf-ae101b2ef9cc",
Synchronized="2017-08-05 16:54:47.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";
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

@XendraTrl(Identifier="0aec6f7c-d8c6-4edd-89ac-6be0a7645229")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0aec6f7c-d8c6-4edd-89ac-6be0a7645229",
Synchronized="2017-08-05 16:54:47.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set End Date.
@param EndDate Last effective date (inclusive) */
public void setEndDate (Timestamp EndDate)
{
set_Value (COLUMNNAME_EndDate, EndDate);
}
/** Get End Date.
@return Last effective date (inclusive) */
public Timestamp getEndDate() 
{
return (Timestamp)get_Value(COLUMNNAME_EndDate);
}

@XendraTrl(Identifier="c89297c4-dfe7-4c24-a366-e6cd2e4a5bf9")
public static String es_PE_COLUMN_EndDate_Name="End Date";

@XendraColumn(AD_Element_ID="16fae692-c943-4a1f-732e-bfce5aecb4b3",ColumnName="EndDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c89297c4-dfe7-4c24-a366-e6cd2e4a5bf9",
Synchronized="2017-08-05 16:54:47.0")
/** Column name EndDate */
public static final String COLUMNNAME_EndDate = "EndDate";
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

@XendraTrl(Identifier="aa817c2b-6e0f-4b87-abd4-7c3ee595fc83")
public static String es_PE_COLUMN_HR_Payroll_ID_Name="HR_Payroll_ID";

@XendraColumn(AD_Element_ID="7e583833-168b-49d6-84d9-137ec0c40d00",ColumnName="HR_Payroll_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aa817c2b-6e0f-4b87-abd4-7c3ee595fc83",
Synchronized="2017-08-05 16:54:47.0")
/** Column name HR_Payroll_ID */
public static final String COLUMNNAME_HR_Payroll_ID = "HR_Payroll_ID";
/** Set Payroll Period.
@param HR_Period_ID Payroll Period */
public void setHR_Period_ID (int HR_Period_ID)
{
if (HR_Period_ID <= 0) set_ValueNoCheck (COLUMNNAME_HR_Period_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_HR_Period_ID, Integer.valueOf(HR_Period_ID));
}
/** Get Payroll Period.
@return Payroll Period */
public int getHR_Period_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_Period_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name HR_Period_ID */
public static final String COLUMNNAME_HR_Period_ID = "HR_Period_ID";
/** Set hr_period_uu.
@param hr_period_uu hr_period_uu */
public void sethr_period_uu (String hr_period_uu)
{
if (hr_period_uu != null && hr_period_uu.length() > 36)
{
log.warning("Length > 36 - truncated");
hr_period_uu = hr_period_uu.substring(0,35);
}
set_Value (COLUMNNAME_hr_period_uu, hr_period_uu);
}
/** Get hr_period_uu.
@return hr_period_uu */
public String gethr_period_uu() 
{
String value = (String)get_Value(COLUMNNAME_hr_period_uu);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="cc4727b3-dfc2-4104-a0c5-8f18c58404a3")
public static String es_PE_COLUMN_hr_period_uu_Name="hr_period_uu";

@XendraColumn(AD_Element_ID="aeaccc0b-0d1d-4193-b73d-9fec00c4aeea",ColumnName="hr_period_uu",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cc4727b3-dfc2-4104-a0c5-8f18c58404a3",
Synchronized="2017-08-05 16:54:47.0")
/** Column name hr_period_uu */
public static final String COLUMNNAME_hr_period_uu = "hr_period_uu";
/** Set Payroll Year.
@param HR_Year_ID Payroll Year */
public void setHR_Year_ID (int HR_Year_ID)
{
if (HR_Year_ID <= 0) set_Value (COLUMNNAME_HR_Year_ID, null);
 else 
set_Value (COLUMNNAME_HR_Year_ID, Integer.valueOf(HR_Year_ID));
}
/** Get Payroll Year.
@return Payroll Year */
public int getHR_Year_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_Year_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="617e21c6-06b8-442d-9aef-444055980586")
public static String es_PE_COLUMN_HR_Year_ID_Name="Payroll Year";

@XendraColumn(AD_Element_ID="2a89247d-3956-4ade-8051-061cadd2aa74",ColumnName="HR_Year_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="617e21c6-06b8-442d-9aef-444055980586",
Synchronized="2017-08-05 16:54:47.0")
/** Column name HR_Year_ID */
public static final String COLUMNNAME_HR_Year_ID = "HR_Year_ID";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name != null && Name.length() > 40)
{
log.warning("Length > 40 - truncated");
Name = Name.substring(0,39);
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

@XendraTrl(Identifier="2dfba5bd-ac3a-4014-9672-f4ebb96d3eac")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2dfba5bd-ac3a-4014-9672-f4ebb96d3eac",
Synchronized="2017-08-05 16:54:47.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Period Action.
@param PeriodAction Action taken for this period */
public void setPeriodAction (boolean PeriodAction)
{
set_Value (COLUMNNAME_PeriodAction, Boolean.valueOf(PeriodAction));
}
/** Get Period Action.
@return Action taken for this period */
public boolean isPeriodAction() 
{
Object oo = get_Value(COLUMNNAME_PeriodAction);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="2318bf3d-c531-48bb-82a8-49f9d46e3cfd")
public static String es_PE_COLUMN_PeriodAction_Name="Period Action";

@XendraColumn(AD_Element_ID="ceb432f9-6bd6-847d-ce46-55f3b47c1b15",ColumnName="PeriodAction",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2318bf3d-c531-48bb-82a8-49f9d46e3cfd",
Synchronized="2017-08-05 16:54:47.0")
/** Column name PeriodAction */
public static final String COLUMNNAME_PeriodAction = "PeriodAction";
/** Set Period No.
@param PeriodNo Unique Period Number */
public void setPeriodNo (int PeriodNo)
{
set_Value (COLUMNNAME_PeriodNo, Integer.valueOf(PeriodNo));
}
/** Get Period No.
@return Unique Period Number */
public int getPeriodNo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PeriodNo);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="636642d0-fecd-4f77-a566-c2cba889f233")
public static String es_PE_COLUMN_PeriodNo_Name="Period No";

@XendraColumn(AD_Element_ID="c3b1b3eb-a9b0-25c6-0c8b-86bb7d76de0e",ColumnName="PeriodNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="636642d0-fecd-4f77-a566-c2cba889f233",
Synchronized="2017-08-05 16:54:47.0")
/** Column name PeriodNo */
public static final String COLUMNNAME_PeriodNo = "PeriodNo";
/** Set Period Status.
@param PeriodStatus Current state of this period */
public void setPeriodStatus (boolean PeriodStatus)
{
set_Value (COLUMNNAME_PeriodStatus, Boolean.valueOf(PeriodStatus));
}
/** Get Period Status.
@return Current state of this period */
public boolean isPeriodStatus() 
{
Object oo = get_Value(COLUMNNAME_PeriodStatus);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="165f50a2-cce8-498d-a5c5-97ecfef4936f")
public static String es_PE_COLUMN_PeriodStatus_Name="Period Status";

@XendraColumn(AD_Element_ID="997746cb-4365-dfc8-9ef2-410a20913d14",ColumnName="PeriodStatus",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="165f50a2-cce8-498d-a5c5-97ecfef4936f",
Synchronized="2017-08-05 16:54:47.0")
/** Column name PeriodStatus */
public static final String COLUMNNAME_PeriodStatus = "PeriodStatus";
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

@XendraTrl(Identifier="93d4bcb3-8279-4fc2-a9bd-c41685b7eae1")
public static String es_PE_COLUMN_Processed_Name="Processed";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="93d4bcb3-8279-4fc2-a9bd-c41685b7eae1",
Synchronized="2017-08-05 16:54:47.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set Process Now.
@param Processing Process Now */
public void setProcessing (boolean Processing)
{
set_Value (COLUMNNAME_Processing, Boolean.valueOf(Processing));
}
/** Get Process Now.
@return Process Now */
public boolean isProcessing() 
{
Object oo = get_Value(COLUMNNAME_Processing);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="c164e2bf-9587-451a-82bf-fcca039e23da")
public static String es_PE_COLUMN_Processing_Name="Process Now";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c164e2bf-9587-451a-82bf-fcca039e23da",
Synchronized="2017-08-05 16:54:47.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Start Date.
@param StartDate First effective day (inclusive) */
public void setStartDate (Timestamp StartDate)
{
set_Value (COLUMNNAME_StartDate, StartDate);
}
/** Get Start Date.
@return First effective day (inclusive) */
public Timestamp getStartDate() 
{
return (Timestamp)get_Value(COLUMNNAME_StartDate);
}

@XendraTrl(Identifier="baf4c70f-1fac-4f6f-b656-c327c4d7f74d")
public static String es_PE_COLUMN_StartDate_Name="Start Date";

@XendraColumn(AD_Element_ID="3fe42406-cab3-a569-bf0b-3614f5d95711",ColumnName="StartDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="baf4c70f-1fac-4f6f-b656-c327c4d7f74d",
Synchronized="2017-08-05 16:54:47.0")
/** Column name StartDate */
public static final String COLUMNNAME_StartDate = "StartDate";
}
