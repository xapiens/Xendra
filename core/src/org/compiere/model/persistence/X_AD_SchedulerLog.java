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
/** Generated Model for AD_SchedulerLog
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_SchedulerLog extends PO
{
/** Standard Constructor
@param ctx context
@param AD_SchedulerLog_ID id
@param trxName transaction
*/
public X_AD_SchedulerLog (Properties ctx, int AD_SchedulerLog_ID, String trxName)
{
super (ctx, AD_SchedulerLog_ID, trxName);
/** if (AD_SchedulerLog_ID == 0)
{
setAD_Scheduler_ID (0);
setAD_SchedulerLog_ID (0);
setIsError (false);	
// N
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_SchedulerLog (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=687 */
public static int Table_ID=MTable.getTable_ID("AD_SchedulerLog");

@XendraTrl(Identifier="bb248a39-d3d8-88f0-0390-b45d4d8e9c8a")
public static String es_PE_TAB_Log_Description="Planificador de Log";

@XendraTrl(Identifier="bb248a39-d3d8-88f0-0390-b45d4d8e9c8a")
public static String es_PE_TAB_Log_Name="Log";

@XendraTrl(Identifier="bb248a39-d3d8-88f0-0390-b45d4d8e9c8a")
public static String es_PE_TAB_Log_Help="Resultado de la ejecución de el planificador";

@XendraTab(Name="Log",Description="Scheduler Log",Help="Result of the execution of the Scheduler",
AD_Window_ID="2d2f8ce7-abbe-ad81-0373-06f27fbe1596",SeqNo=50,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="bb248a39-d3d8-88f0-0390-b45d4d8e9c8a",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Log="bb248a39-d3d8-88f0-0390-b45d4d8e9c8a";

@XendraTrl(Identifier="5b7b4f05-0c40-3963-b8c6-1aaf00a7ab16")
public static String es_PE_TABLE_AD_SchedulerLog_Name="Log Programación";

@XendraTable(Name="Scheduler Log",Description="Result of the execution of the Scheduler",Help="",
TableName="AD_SchedulerLog",AccessLevel="6",AD_Window_ID="2d2f8ce7-abbe-ad81-0373-06f27fbe1596",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="5b7b4f05-0c40-3963-b8c6-1aaf00a7ab16",Synchronized="2017-08-16 11:40:58.0")
/** TableName=AD_SchedulerLog */
public static final String Table_Name="AD_SchedulerLog";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_SchedulerLog");

protected BigDecimal accessLevel = BigDecimal.valueOf(6);
/** AccessLevel
@return 6 - System - Client 
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
    Table_ID = MTable.getTable_ID("AD_SchedulerLog");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_SchedulerLog[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Scheduler.
@param AD_Scheduler_ID Schedule Processes */
public void setAD_Scheduler_ID (int AD_Scheduler_ID)
{
if (AD_Scheduler_ID < 1) throw new IllegalArgumentException ("AD_Scheduler_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Scheduler_ID, Integer.valueOf(AD_Scheduler_ID));
}
/** Get Scheduler.
@return Schedule Processes */
public int getAD_Scheduler_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Scheduler_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d436a2c6-deff-2e0e-3d4b-f7dddc0328b2")
public static String es_PE_FIELD_Log_Scheduler_Description="Programación de procesos";

@XendraTrl(Identifier="d436a2c6-deff-2e0e-3d4b-f7dddc0328b2")
public static String es_PE_FIELD_Log_Scheduler_Help="Programación de procesos para ser ejecutada la sincronización.";

@XendraTrl(Identifier="d436a2c6-deff-2e0e-3d4b-f7dddc0328b2")
public static String es_PE_FIELD_Log_Scheduler_Name="Programación";

@XendraField(AD_Column_ID="AD_Scheduler_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bb248a39-d3d8-88f0-0390-b45d4d8e9c8a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d436a2c6-deff-2e0e-3d4b-f7dddc0328b2")
public static final String FIELDNAME_Log_Scheduler="d436a2c6-deff-2e0e-3d4b-f7dddc0328b2";

@XendraTrl(Identifier="3d4250c2-d1a6-1aaa-653d-916a7d86a08f")
public static String es_PE_COLUMN_AD_Scheduler_ID_Name="Programación";

@XendraColumn(AD_Element_ID="7c943646-ecd0-4485-0c20-0616c91ca579",ColumnName="AD_Scheduler_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3d4250c2-d1a6-1aaa-653d-916a7d86a08f",
Synchronized="2017-08-05 16:52:49.0")
/** Column name AD_Scheduler_ID */
public static final String COLUMNNAME_AD_Scheduler_ID = "AD_Scheduler_ID";
/** Set Scheduler Log.
@param AD_SchedulerLog_ID Result of the execution of the Scheduler */
public void setAD_SchedulerLog_ID (int AD_SchedulerLog_ID)
{
if (AD_SchedulerLog_ID < 1) throw new IllegalArgumentException ("AD_SchedulerLog_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_SchedulerLog_ID, Integer.valueOf(AD_SchedulerLog_ID));
}
/** Get Scheduler Log.
@return Result of the execution of the Scheduler */
public int getAD_SchedulerLog_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_SchedulerLog_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="174c1783-b7ac-3ae5-aa4a-305bbb241f06")
public static String es_PE_FIELD_Log_SchedulerLog_Description="Resultado de la ejecución de la programación.";

@XendraTrl(Identifier="174c1783-b7ac-3ae5-aa4a-305bbb241f06")
public static String es_PE_FIELD_Log_SchedulerLog_Help="Resultado de la ejecución de la programación.";

@XendraTrl(Identifier="174c1783-b7ac-3ae5-aa4a-305bbb241f06")
public static String es_PE_FIELD_Log_SchedulerLog_Name="Log Programación";

@XendraField(AD_Column_ID="AD_SchedulerLog_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bb248a39-d3d8-88f0-0390-b45d4d8e9c8a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=0,SortNo=1,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="174c1783-b7ac-3ae5-aa4a-305bbb241f06")
public static final String FIELDNAME_Log_SchedulerLog="174c1783-b7ac-3ae5-aa4a-305bbb241f06";
/** Column name AD_SchedulerLog_ID */
public static final String COLUMNNAME_AD_SchedulerLog_ID = "AD_SchedulerLog_ID";
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

@XendraTrl(Identifier="22910761-e7b2-e69d-b4f9-242037a2eb93")
public static String es_PE_FIELD_Log_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="22910761-e7b2-e69d-b4f9-242037a2eb93")
public static String es_PE_FIELD_Log_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="22910761-e7b2-e69d-b4f9-242037a2eb93")
public static String es_PE_FIELD_Log_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="bb248a39-d3d8-88f0-0390-b45d4d8e9c8a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="22910761-e7b2-e69d-b4f9-242037a2eb93")
public static final String FIELDNAME_Log_Description="22910761-e7b2-e69d-b4f9-242037a2eb93";

@XendraTrl(Identifier="42074916-4ccf-6ade-8662-86e3948da450")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="42074916-4ccf-6ade-8662-86e3948da450",
Synchronized="2017-08-05 16:52:49.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
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
@XendraTrl(Identifier="a6a4a3d4-e3b3-4b99-b88b-3c2fbf826879")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a6a4a3d4-e3b3-4b99-b88b-3c2fbf826879",
Synchronized="2017-08-05 16:52:49.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Error.
@param IsError An Error occured in the execution */
public void setIsError (boolean IsError)
{
set_Value (COLUMNNAME_IsError, Boolean.valueOf(IsError));
}
/** Get Error.
@return An Error occured in the execution */
public boolean isError() 
{
Object oo = get_Value(COLUMNNAME_IsError);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="86ab67ab-be25-e173-ee7a-694a0b756616")
public static String es_PE_FIELD_Log_Error_Description="Un error ocurrío en la ejecución.";

@XendraTrl(Identifier="86ab67ab-be25-e173-ee7a-694a0b756616")
public static String es_PE_FIELD_Log_Error_Name="Error";
@XendraField(AD_Column_ID="IsError",
IsCentrallyMaintained=true,AD_Tab_ID="bb248a39-d3d8-88f0-0390-b45d4d8e9c8a",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=60,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="86ab67ab-be25-e173-ee7a-694a0b756616")
public static final String FIELDNAME_Log_Error="86ab67ab-be25-e173-ee7a-694a0b756616";

@XendraTrl(Identifier="4a505033-50aa-e46d-c4d8-c6582420b633")
public static String es_PE_COLUMN_IsError_Name="Error";

@XendraColumn(AD_Element_ID="7a82e2b2-c09d-83e6-f469-1f1d9bae65a7",ColumnName="IsError",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4a505033-50aa-e46d-c4d8-c6582420b633",
Synchronized="2017-08-05 16:52:49.0")
/** Column name IsError */
public static final String COLUMNNAME_IsError = "IsError";
/** Set Reference.
@param Reference Reference for this record */
public void setReference (String Reference)
{
if (Reference != null && Reference.length() > 60)
{
log.warning("Length > 60 - truncated");
Reference = Reference.substring(0,59);
}
set_Value (COLUMNNAME_Reference, Reference);
}
/** Get Reference.
@return Reference for this record */
public String getReference() 
{
String value = (String)get_Value(COLUMNNAME_Reference);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="373c38df-c8b4-d721-71a6-2b3a3ba96e26")
public static String es_PE_FIELD_Log_Reference_Description="Referencia para este registro";

@XendraTrl(Identifier="373c38df-c8b4-d721-71a6-2b3a3ba96e26")
public static String es_PE_FIELD_Log_Reference_Help="La referencia despliega el número del documento fuente";

@XendraTrl(Identifier="373c38df-c8b4-d721-71a6-2b3a3ba96e26")
public static String es_PE_FIELD_Log_Reference_Name="Referencia";

@XendraField(AD_Column_ID="Reference",IsCentrallyMaintained=true,
AD_Tab_ID="bb248a39-d3d8-88f0-0390-b45d4d8e9c8a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="373c38df-c8b4-d721-71a6-2b3a3ba96e26")
public static final String FIELDNAME_Log_Reference="373c38df-c8b4-d721-71a6-2b3a3ba96e26";

@XendraTrl(Identifier="59710d25-d1e7-de35-8a77-e863beecd989")
public static String es_PE_COLUMN_Reference_Name="Referencia";

@XendraColumn(AD_Element_ID="eba276ea-db21-0cfa-29e6-6e0d45ebff99",ColumnName="Reference",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="59710d25-d1e7-de35-8a77-e863beecd989",
Synchronized="2017-08-05 16:52:49.0")
/** Column name Reference */
public static final String COLUMNNAME_Reference = "Reference";
/** Set Summary.
@param Summary Textual summary of this request */
public void setSummary (String Summary)
{
set_Value (COLUMNNAME_Summary, Summary);
}
/** Get Summary.
@return Textual summary of this request */
public String getSummary() 
{
String value = (String)get_Value(COLUMNNAME_Summary);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="078cf96d-b71b-614e-6404-4238b77a9c69")
public static String es_PE_FIELD_Log_Summary_Description="Resúmen textual de esta solicitud";

@XendraTrl(Identifier="078cf96d-b71b-614e-6404-4238b77a9c69")
public static String es_PE_FIELD_Log_Summary_Help="El resúmen permite texto en formato libre sobre esta solicitud.";

@XendraTrl(Identifier="078cf96d-b71b-614e-6404-4238b77a9c69")
public static String es_PE_FIELD_Log_Summary_Name="Resúmen";
@XendraField(AD_Column_ID="Summary",
IsCentrallyMaintained=true,AD_Tab_ID="bb248a39-d3d8-88f0-0390-b45d4d8e9c8a",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=50,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="078cf96d-b71b-614e-6404-4238b77a9c69")
public static final String FIELDNAME_Log_Summary="078cf96d-b71b-614e-6404-4238b77a9c69";

@XendraTrl(Identifier="9e1f479e-7e1b-5a77-32c9-eecb4fdd60ca")
public static String es_PE_COLUMN_Summary_Name="Resúmen";

@XendraColumn(AD_Element_ID="94fe105c-8853-7c06-a32a-9ad75a452917",ColumnName="Summary",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9e1f479e-7e1b-5a77-32c9-eecb4fdd60ca",
Synchronized="2017-08-05 16:52:49.0")
/** Column name Summary */
public static final String COLUMNNAME_Summary = "Summary";
/** Set Text Message.
@param TextMsg Text Message */
public void setTextMsg (String TextMsg)
{
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
@XendraTrl(Identifier="6dfdaaf6-5e61-8268-ad72-c2488262173c")
public static String es_PE_FIELD_Log_TextMessage_Description="Mensaje de texto";

@XendraTrl(Identifier="6dfdaaf6-5e61-8268-ad72-c2488262173c")
public static String es_PE_FIELD_Log_TextMessage_Name="Mensaje de texto";

@XendraField(AD_Column_ID="TextMsg",IsCentrallyMaintained=true,
AD_Tab_ID="bb248a39-d3d8-88f0-0390-b45d4d8e9c8a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6dfdaaf6-5e61-8268-ad72-c2488262173c")
public static final String FIELDNAME_Log_TextMessage="6dfdaaf6-5e61-8268-ad72-c2488262173c";

@XendraTrl(Identifier="a8259b9a-f8f1-4fa4-5e9e-72fec7912b4c")
public static String es_PE_COLUMN_TextMsg_Name="Mensaje de texto";

@XendraColumn(AD_Element_ID="377bebfe-238a-1c79-c1a9-13afa4448222",ColumnName="TextMsg",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a8259b9a-f8f1-4fa4-5e9e-72fec7912b4c",
Synchronized="2017-08-05 16:52:49.0")
/** Column name TextMsg */
public static final String COLUMNNAME_TextMsg = "TextMsg";
}
