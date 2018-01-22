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
/** Generated Model for HR_Job
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_HR_Job extends PO
{
/** Standard Constructor
@param ctx context
@param HR_Job_ID id
@param trxName transaction
*/
public X_HR_Job (Properties ctx, int HR_Job_ID, String trxName)
{
super (ctx, HR_Job_ID, trxName);
/** if (HR_Job_ID == 0)
{
setHR_Job_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_HR_Job (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000260 */
public static int Table_ID=MTable.getTable_ID("HR_Job");

@XendraTrl(Identifier="2e35de14-df39-43b3-a36e-13ceec7db3f0")
public static String es_PE_TABLE_HR_Job_Name="hr_job";

@XendraTable(Name="HR_Job",Description="",Help="",TableName="HR_Job",AccessLevel="3",
AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=false,
IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.humanresource",
Identifier="2e35de14-df39-43b3-a36e-13ceec7db3f0",Synchronized="2017-08-16 11:42:48.0")
/** TableName=HR_Job */
public static final String Table_Name="HR_Job";


@XendraIndex(Name="hr_job_value",Identifier="5d525d7d-5127-e456-5f5e-bfe0bc293fe9",
Column_Names="ad_client_id, value",IsUnique="true",
TableIdentifier="5d525d7d-5127-e456-5f5e-bfe0bc293fe9",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_hr_job_value = "5d525d7d-5127-e456-5f5e-bfe0bc293fe9";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"HR_Job");

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
    Table_ID = MTable.getTable_ID("HR_Job");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_HR_Job[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="efe60803-cf52-4950-91f5-af6356e20b22")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="efe60803-cf52-4950-91f5-af6356e20b22",
Synchronized="2017-08-05 16:54:46.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
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

@XendraTrl(Identifier="3dad6ee4-7a63-4ddb-a66c-815a8d17a30b")
public static String es_PE_COLUMN_HR_Department_ID_Name="hr_department_id";

@XendraColumn(AD_Element_ID="9840f276-88b2-4bd2-accd-1d0a1a1dcf1f",ColumnName="HR_Department_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3dad6ee4-7a63-4ddb-a66c-815a8d17a30b",
Synchronized="2017-08-05 16:54:46.0")
/** Column name HR_Department_ID */
public static final String COLUMNNAME_HR_Department_ID = "HR_Department_ID";
/** Set HR_Job_ID.
@param HR_Job_ID HR_Job_ID */
public void setHR_Job_ID (int HR_Job_ID)
{
if (HR_Job_ID < 1) throw new IllegalArgumentException ("HR_Job_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_HR_Job_ID, Integer.valueOf(HR_Job_ID));
}
/** Get HR_Job_ID.
@return HR_Job_ID */
public int getHR_Job_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_Job_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name HR_Job_ID */
public static final String COLUMNNAME_HR_Job_ID = "HR_Job_ID";
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
@XendraTrl(Identifier="483b538d-3d80-47df-9961-7e4ff0c9f224")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="483b538d-3d80-47df-9961-7e4ff0c9f224",
Synchronized="2017-08-05 16:54:46.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Parent link column.
@param IsParent This column is a link to the parent table (e.g. header from lines) - incl. Association key columns */
public void setIsParent (boolean IsParent)
{
set_Value (COLUMNNAME_IsParent, Boolean.valueOf(IsParent));
}
/** Get Parent link column.
@return This column is a link to the parent table (e.g. header from lines) - incl. Association key columns */
public boolean isParent() 
{
Object oo = get_Value(COLUMNNAME_IsParent);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="4a7fde49-ffed-4043-a89f-f1666545088a")
public static String es_PE_COLUMN_IsParent_Name="Parent link column";

@XendraColumn(AD_Element_ID="9eeefe36-95e5-2218-179f-a4d553c8e65a",ColumnName="IsParent",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4a7fde49-ffed-4043-a89f-f1666545088a",
Synchronized="2017-08-05 16:54:46.0")
/** Column name IsParent */
public static final String COLUMNNAME_IsParent = "IsParent";
/** Set JobCant.
@param JobCant JobCant */
public void setJobCant (int JobCant)
{
set_Value (COLUMNNAME_JobCant, Integer.valueOf(JobCant));
}
/** Get JobCant.
@return JobCant */
public int getJobCant() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_JobCant);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a17c786e-5552-4bde-9909-af9eea00b72b")
public static String es_PE_COLUMN_JobCant_Name="jobcant";

@XendraColumn(AD_Element_ID="99bb8825-e543-4bdd-a4c8-ce6f46e57c12",ColumnName="jobcant",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a17c786e-5552-4bde-9909-af9eea00b72b",
Synchronized="2017-08-05 16:54:46.0")
/** Column name JobCant */
public static final String COLUMNNAME_JobCant = "JobCant";
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

@XendraTrl(Identifier="6765832e-485d-415a-9b60-46212ea3cd73")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6765832e-485d-415a-9b60-46212ea3cd73",
Synchronized="2017-08-05 16:54:46.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Next_Job_ID.
@param Next_Job_ID Next_Job_ID */
public void setNext_Job_ID (int Next_Job_ID)
{
if (Next_Job_ID <= 0) set_Value (COLUMNNAME_Next_Job_ID, null);
 else 
set_Value (COLUMNNAME_Next_Job_ID, Integer.valueOf(Next_Job_ID));
}
/** Get Next_Job_ID.
@return Next_Job_ID */
public int getNext_Job_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Next_Job_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6056d893-875d-4a52-9b67-e6e13600e7c1")
public static String es_PE_COLUMN_Next_Job_ID_Name="next_job_id";

@XendraColumn(AD_Element_ID="12a37f2b-91ea-4c70-9056-029c888960df",ColumnName="Next_Job_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6056d893-875d-4a52-9b67-e6e13600e7c1",
Synchronized="2017-08-05 16:54:46.0")
/** Column name Next_Job_ID */
public static final String COLUMNNAME_Next_Job_ID = "Next_Job_ID";
/** Set Supervisor.
@param Supervisor_ID Supervisor for this user/organization - used for escalation and approval */
public void setSupervisor_ID (int Supervisor_ID)
{
if (Supervisor_ID <= 0) set_Value (COLUMNNAME_Supervisor_ID, null);
 else 
set_Value (COLUMNNAME_Supervisor_ID, Integer.valueOf(Supervisor_ID));
}
/** Get Supervisor.
@return Supervisor for this user/organization - used for escalation and approval */
public int getSupervisor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Supervisor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1da2e29b-23ce-4ebb-b7b6-9a70a493197a")
public static String es_PE_COLUMN_Supervisor_ID_Name="Supervisor";

@XendraColumn(AD_Element_ID="cb6ad258-6bb2-80b2-a90f-63c4d947479b",ColumnName="Supervisor_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1da2e29b-23ce-4ebb-b7b6-9a70a493197a",
Synchronized="2017-08-05 16:54:46.0")
/** Column name Supervisor_ID */
public static final String COLUMNNAME_Supervisor_ID = "Supervisor_ID";
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
@XendraTrl(Identifier="e7c82b25-089d-4322-9535-bf33cba5ff4a")
public static String es_PE_COLUMN_Value_Name="Search Key";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e7c82b25-089d-4322-9535-bf33cba5ff4a",
Synchronized="2017-08-05 16:54:46.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
