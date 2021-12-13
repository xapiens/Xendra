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

@XendraTable(Name="Payroll Period",AD_Package_ID="95f9a029-eaee-0747-b1a5-58cfdd8f8ae5",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="HR_Period",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.humanresource",Identifier="d5098cff-74dc-4eb1-8928-de4afc076eaa",
Synchronized="2020-03-03 21:38:02.0")
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
Synchronized="2019-08-30 22:22:42.0")
/** Column name C_Period_ID */
public static final String COLUMNNAME_C_Period_ID = "C_Period_ID";
/** Set DateAcct.
@param DateAcct DateAcct */
public void setDateAcct (Timestamp DateAcct)
{
set_Value (COLUMNNAME_DateAcct, DateAcct);
}
/** Get DateAcct.
@return DateAcct */
public Timestamp getDateAcct() 
{
return (Timestamp)get_Value(COLUMNNAME_DateAcct);
}

@XendraTrl(Identifier="020c6dbd-8519-4c1f-92d0-61394e48e187")
public static String es_PE_COLUMN_DateAcct_Name="DateAcct";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="020c6dbd-8519-4c1f-92d0-61394e48e187",
Synchronized="2019-08-30 22:22:42.0")
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
Synchronized="2019-08-30 22:22:42.0")
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
Synchronized="2019-08-30 22:22:42.0")
/** Column name EndDate */
public static final String COLUMNNAME_EndDate = "EndDate";
/** Set HR_Calendar_ID.
@param HR_Calendar_ID HR_Calendar_ID */
public void setHR_Calendar_ID (int HR_Calendar_ID)
{
if (HR_Calendar_ID <= 0) set_Value (COLUMNNAME_HR_Calendar_ID, null);
 else 
set_Value (COLUMNNAME_HR_Calendar_ID, Integer.valueOf(HR_Calendar_ID));
}
/** Get HR_Calendar_ID.
@return HR_Calendar_ID */
public int getHR_Calendar_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_Calendar_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="087a2135-887b-4973-99b6-ac515b7fc782")
public static String es_PE_COLUMN_HR_Calendar_ID_Name="HR_Calendar_ID";

@XendraColumn(AD_Element_ID="f8553d61-7122-4d84-b3d9-0953da6a8c80",ColumnName="HR_Calendar_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="087a2135-887b-4973-99b6-ac515b7fc782",
Synchronized="2019-08-30 22:22:42.0")
/** Column name HR_Calendar_ID */
public static final String COLUMNNAME_HR_Calendar_ID = "HR_Calendar_ID";
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
Synchronized="2019-08-30 22:22:42.0")
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
Synchronized="2019-08-30 22:22:42.0")
/** Column name StartDate */
public static final String COLUMNNAME_StartDate = "StartDate";
}
