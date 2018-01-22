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
/** Generated Model for R_RequestProcessorLog
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_R_RequestProcessorLog extends PO
{
/** Standard Constructor
@param ctx context
@param R_RequestProcessorLog_ID id
@param trxName transaction
*/
public X_R_RequestProcessorLog (Properties ctx, int R_RequestProcessorLog_ID, String trxName)
{
super (ctx, R_RequestProcessorLog_ID, trxName);
/** if (R_RequestProcessorLog_ID == 0)
{
setIsError (false);	
// N
setR_RequestProcessor_ID (0);
setR_RequestProcessorLog_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_R_RequestProcessorLog (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=659 */
public static int Table_ID=MTable.getTable_ID("R_RequestProcessorLog");

@XendraTrl(Identifier="7996dae8-cd36-eb34-2d13-fb53b3ae2f2c")
public static String es_PE_TAB_Log_Name="Log";
@XendraTab(Name="Log",Description="",Help="",
AD_Window_ID="33d28bbc-a670-970b-7b9c-ecf75fc3740d",SeqNo=30,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="7996dae8-cd36-eb34-2d13-fb53b3ae2f2c",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Log="7996dae8-cd36-eb34-2d13-fb53b3ae2f2c";

@XendraTrl(Identifier="38cca70f-15bc-c064-8b1d-ad535b6cf5d3")
public static String es_PE_TABLE_R_RequestProcessorLog_Name="Log de Procesador de Solicitudes";


@XendraTable(Name="Request Processor Log",Description="",Help="",TableName="R_RequestProcessorLog",
AccessLevel="2",AD_Window_ID="33d28bbc-a670-970b-7b9c-ecf75fc3740d",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="38cca70f-15bc-c064-8b1d-ad535b6cf5d3",Synchronized="2017-08-16 11:43:52.0")
/** TableName=R_RequestProcessorLog */
public static final String Table_Name="R_RequestProcessorLog";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"R_RequestProcessorLog");

protected BigDecimal accessLevel = BigDecimal.valueOf(2);
/** AccessLevel
@return 2 - Client 
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
    Table_ID = MTable.getTable_ID("R_RequestProcessorLog");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_R_RequestProcessorLog[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="37a35124-bd0e-4cea-27bf-3fdf67f36332")
public static String es_PE_FIELD_Log_Description_Description="Observación";

@XendraTrl(Identifier="37a35124-bd0e-4cea-27bf-3fdf67f36332")
public static String es_PE_FIELD_Log_Description_Help="Observación";

@XendraTrl(Identifier="37a35124-bd0e-4cea-27bf-3fdf67f36332")
public static String es_PE_FIELD_Log_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="7996dae8-cd36-eb34-2d13-fb53b3ae2f2c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="37a35124-bd0e-4cea-27bf-3fdf67f36332")
public static final String FIELDNAME_Log_Description="37a35124-bd0e-4cea-27bf-3fdf67f36332";

@XendraTrl(Identifier="ffe552da-ef97-0fb3-25ea-170abeea0349")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ffe552da-ef97-0fb3-25ea-170abeea0349",
Synchronized="2017-08-05 16:55:54.0")
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
@XendraTrl(Identifier="4b5f6b1d-8979-4fa3-800f-4472ad5bf11f")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4b5f6b1d-8979-4fa3-800f-4472ad5bf11f",
Synchronized="2017-08-05 16:55:54.0")
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

@XendraTrl(Identifier="e463fbc6-4c73-c732-7b75-70865bf03c97")
public static String es_PE_FIELD_Log_Error_Description="Un error ocurrío en la ejecución.";

@XendraTrl(Identifier="e463fbc6-4c73-c732-7b75-70865bf03c97")
public static String es_PE_FIELD_Log_Error_Name="Error";
@XendraField(AD_Column_ID="IsError",
IsCentrallyMaintained=true,AD_Tab_ID="7996dae8-cd36-eb34-2d13-fb53b3ae2f2c",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=60,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="e463fbc6-4c73-c732-7b75-70865bf03c97")
public static final String FIELDNAME_Log_Error="e463fbc6-4c73-c732-7b75-70865bf03c97";

@XendraTrl(Identifier="35ddeb14-194c-aa7e-0ca7-0935a5fdd73f")
public static String es_PE_COLUMN_IsError_Name="Error";

@XendraColumn(AD_Element_ID="7a82e2b2-c09d-83e6-f469-1f1d9bae65a7",ColumnName="IsError",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="35ddeb14-194c-aa7e-0ca7-0935a5fdd73f",
Synchronized="2017-08-05 16:55:54.0")
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
@XendraTrl(Identifier="98e15301-8fac-dea9-e1f5-0eeedd6d00fc")
public static String es_PE_FIELD_Log_Reference_Description="Referencia para este registro";

@XendraTrl(Identifier="98e15301-8fac-dea9-e1f5-0eeedd6d00fc")
public static String es_PE_FIELD_Log_Reference_Help="La referencia despliega el número del documento fuente";

@XendraTrl(Identifier="98e15301-8fac-dea9-e1f5-0eeedd6d00fc")
public static String es_PE_FIELD_Log_Reference_Name="Referencia";

@XendraField(AD_Column_ID="Reference",IsCentrallyMaintained=true,
AD_Tab_ID="7996dae8-cd36-eb34-2d13-fb53b3ae2f2c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="98e15301-8fac-dea9-e1f5-0eeedd6d00fc")
public static final String FIELDNAME_Log_Reference="98e15301-8fac-dea9-e1f5-0eeedd6d00fc";

@XendraTrl(Identifier="761193a3-4873-8dd5-6ca0-a977ca7498db")
public static String es_PE_COLUMN_Reference_Name="Referencia";

@XendraColumn(AD_Element_ID="eba276ea-db21-0cfa-29e6-6e0d45ebff99",ColumnName="Reference",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="761193a3-4873-8dd5-6ca0-a977ca7498db",
Synchronized="2017-08-05 16:55:54.0")
/** Column name Reference */
public static final String COLUMNNAME_Reference = "Reference";
/** Set Request Processor.
@param R_RequestProcessor_ID Processor for Requests */
public void setR_RequestProcessor_ID (int R_RequestProcessor_ID)
{
if (R_RequestProcessor_ID < 1) throw new IllegalArgumentException ("R_RequestProcessor_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_R_RequestProcessor_ID, Integer.valueOf(R_RequestProcessor_ID));
}
/** Get Request Processor.
@return Processor for Requests */
public int getR_RequestProcessor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_RequestProcessor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fc8b1ac8-3dc9-23a8-7adf-360893b63fe2")
public static String es_PE_FIELD_Log_RequestProcessor_Name="Procesador de Solicitudes";

@XendraField(AD_Column_ID="R_RequestProcessor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7996dae8-cd36-eb34-2d13-fb53b3ae2f2c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fc8b1ac8-3dc9-23a8-7adf-360893b63fe2")
public static final String FIELDNAME_Log_RequestProcessor="fc8b1ac8-3dc9-23a8-7adf-360893b63fe2";

@XendraTrl(Identifier="95a438ee-86a1-53bb-01a7-6baa5ec909a4")
public static String es_PE_COLUMN_R_RequestProcessor_ID_Name="Procesador de Solicitudes";

@XendraColumn(AD_Element_ID="46933b36-2a16-058b-35d6-decb281596a9",
ColumnName="R_RequestProcessor_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="95a438ee-86a1-53bb-01a7-6baa5ec909a4",Synchronized="2017-08-05 16:55:54.0")
/** Column name R_RequestProcessor_ID */
public static final String COLUMNNAME_R_RequestProcessor_ID = "R_RequestProcessor_ID";
/** Set Request Processor Log.
@param R_RequestProcessorLog_ID Result of the execution of the Request Processor */
public void setR_RequestProcessorLog_ID (int R_RequestProcessorLog_ID)
{
if (R_RequestProcessorLog_ID < 1) throw new IllegalArgumentException ("R_RequestProcessorLog_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_R_RequestProcessorLog_ID, Integer.valueOf(R_RequestProcessorLog_ID));
}
/** Get Request Processor Log.
@return Result of the execution of the Request Processor */
public int getR_RequestProcessorLog_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_RequestProcessorLog_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c86cd7d0-7d0b-32f5-aa49-a905cb730c9b")
public static String es_PE_FIELD_Log_RequestProcessorLog_Name="Log de Procesador de Solicitudes";

@XendraField(AD_Column_ID="R_RequestProcessorLog_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7996dae8-cd36-eb34-2d13-fb53b3ae2f2c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="1=2",DisplayLength=14,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c86cd7d0-7d0b-32f5-aa49-a905cb730c9b")
public static final String FIELDNAME_Log_RequestProcessorLog="c86cd7d0-7d0b-32f5-aa49-a905cb730c9b";
/** Column name R_RequestProcessorLog_ID */
public static final String COLUMNNAME_R_RequestProcessorLog_ID = "R_RequestProcessorLog_ID";
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
@XendraTrl(Identifier="928e8559-a70b-889f-4e76-f7d631e2c5fc")
public static String es_PE_FIELD_Log_Summary_Description="Resúmen textual de esta solicitud";

@XendraTrl(Identifier="928e8559-a70b-889f-4e76-f7d631e2c5fc")
public static String es_PE_FIELD_Log_Summary_Help="El resúmen permite texto en formato libre sobre esta solicitud.";

@XendraTrl(Identifier="928e8559-a70b-889f-4e76-f7d631e2c5fc")
public static String es_PE_FIELD_Log_Summary_Name="Resúmen";
@XendraField(AD_Column_ID="Summary",
IsCentrallyMaintained=true,AD_Tab_ID="7996dae8-cd36-eb34-2d13-fb53b3ae2f2c",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=50,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="928e8559-a70b-889f-4e76-f7d631e2c5fc")
public static final String FIELDNAME_Log_Summary="928e8559-a70b-889f-4e76-f7d631e2c5fc";

@XendraTrl(Identifier="31db639e-d9bb-3521-61bb-463bf3244b04")
public static String es_PE_COLUMN_Summary_Name="Resúmen";

@XendraColumn(AD_Element_ID="94fe105c-8853-7c06-a32a-9ad75a452917",ColumnName="Summary",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="31db639e-d9bb-3521-61bb-463bf3244b04",
Synchronized="2017-08-05 16:55:56.0")
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
@XendraTrl(Identifier="ab3b45ce-1223-7caf-caab-442e9d4cd25c")
public static String es_PE_FIELD_Log_TextMessage_Description="Mensaje de texto";

@XendraTrl(Identifier="ab3b45ce-1223-7caf-caab-442e9d4cd25c")
public static String es_PE_FIELD_Log_TextMessage_Name="Mensaje de texto";

@XendraField(AD_Column_ID="TextMsg",IsCentrallyMaintained=true,
AD_Tab_ID="7996dae8-cd36-eb34-2d13-fb53b3ae2f2c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ab3b45ce-1223-7caf-caab-442e9d4cd25c")
public static final String FIELDNAME_Log_TextMessage="ab3b45ce-1223-7caf-caab-442e9d4cd25c";

@XendraTrl(Identifier="144bc282-cdc9-f3ca-00cc-731e88855166")
public static String es_PE_COLUMN_TextMsg_Name="Mensaje de texto";

@XendraColumn(AD_Element_ID="377bebfe-238a-1c79-c1a9-13afa4448222",ColumnName="TextMsg",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="144bc282-cdc9-f3ca-00cc-731e88855166",
Synchronized="2017-08-05 16:55:56.0")
/** Column name TextMsg */
public static final String COLUMNNAME_TextMsg = "TextMsg";
}
