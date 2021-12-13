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
/** Generated Model for AD_WorkflowProcessorLog
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_WorkflowProcessorLog extends PO
{
/** Standard Constructor
@param ctx context
@param AD_WorkflowProcessorLog_ID id
@param trxName transaction
*/
public X_AD_WorkflowProcessorLog (Properties ctx, int AD_WorkflowProcessorLog_ID, String trxName)
{
super (ctx, AD_WorkflowProcessorLog_ID, trxName);
/** if (AD_WorkflowProcessorLog_ID == 0)
{
setAD_WorkflowProcessor_ID (0);
setAD_WorkflowProcessorLog_ID (0);
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
public X_AD_WorkflowProcessorLog (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=696 */
public static int Table_ID=MTable.getTable_ID("AD_WorkflowProcessorLog");

@XendraTrl(Identifier="d78971e9-7cfd-dc78-e986-a8a983bca413")
public static String es_PE_TAB_Log_Description="Procesador de Log de flujo de trabajo";

@XendraTrl(Identifier="d78971e9-7cfd-dc78-e986-a8a983bca413")
public static String es_PE_TAB_Log_Help="Resultado de la ejecución de el procesador de flujo de trabajo";

@XendraTrl(Identifier="d78971e9-7cfd-dc78-e986-a8a983bca413")
public static String es_PE_TAB_Log_Name="Log";
@XendraTab(Name="Log",
Description="Workflow Processor Log",Help="Result of the execution of the Workflow Processor",
AD_Window_ID="87bf7f4e-6805-23e6-bf70-d864ee5329a0",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="d78971e9-7cfd-dc78-e986-a8a983bca413",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Log="d78971e9-7cfd-dc78-e986-a8a983bca413";

@XendraTrl(Identifier="e81a820e-6617-1682-fa7c-ae09eb9e6dfa")
public static String es_PE_TABLE_AD_WorkflowProcessorLog_Name="Log Procesador de Flujo de Trabajo";


@XendraTable(Name="Workflow Processorl Log",AD_Package_ID="9df191d4-b8da-879a-276b-6e16b286e868",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="Result of the execution of the Workflow Processor",Help="",
TableName="AD_WorkflowProcessorLog",AccessLevel="4",
AD_Window_ID="87bf7f4e-6805-23e6-bf70-d864ee5329a0",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.workflow",Identifier="e81a820e-6617-1682-fa7c-ae09eb9e6dfa",
Synchronized="2020-03-03 21:36:14.0")
/** TableName=AD_WorkflowProcessorLog */
public static final String Table_Name="AD_WorkflowProcessorLog";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_WorkflowProcessorLog");

protected BigDecimal accessLevel = BigDecimal.valueOf(4);
/** AccessLevel
@return 4 - System 
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
    Table_ID = MTable.getTable_ID("AD_WorkflowProcessorLog");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_WorkflowProcessorLog[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Workflow Processor.
@param AD_WorkflowProcessor_ID Workflow Processor Server */
public void setAD_WorkflowProcessor_ID (int AD_WorkflowProcessor_ID)
{
if (AD_WorkflowProcessor_ID < 1) throw new IllegalArgumentException ("AD_WorkflowProcessor_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_WorkflowProcessor_ID, Integer.valueOf(AD_WorkflowProcessor_ID));
}
/** Get Workflow Processor.
@return Workflow Processor Server */
public int getAD_WorkflowProcessor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_WorkflowProcessor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6415b6b1-e58b-9086-bc36-7e66dd4aa93d")
public static String es_PE_FIELD_Log_WorkflowProcessor_Name="Procesador FT";

@XendraTrl(Identifier="6415b6b1-e58b-9086-bc36-7e66dd4aa93d")
public static String es_PE_FIELD_Log_WorkflowProcessor_Description="Servidor del procesador del flujo de trabajo";

@XendraTrl(Identifier="6415b6b1-e58b-9086-bc36-7e66dd4aa93d")
public static String es_PE_FIELD_Log_WorkflowProcessor_Help="Servidor del procesador del flujo de trabajo";

@XendraField(AD_Column_ID="AD_WorkflowProcessor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d78971e9-7cfd-dc78-e986-a8a983bca413",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6415b6b1-e58b-9086-bc36-7e66dd4aa93d")
public static final String FIELDNAME_Log_WorkflowProcessor="6415b6b1-e58b-9086-bc36-7e66dd4aa93d";

@XendraTrl(Identifier="aa3540b5-e19b-03f9-7316-08974b982c7e")
public static String es_PE_COLUMN_AD_WorkflowProcessor_ID_Name="Procesador FT";

@XendraColumn(AD_Element_ID="e48d9da3-c5e9-e016-867d-c04769b1b3b2",
ColumnName="AD_WorkflowProcessor_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="aa3540b5-e19b-03f9-7316-08974b982c7e",Synchronized="2019-08-30 22:20:55.0")
/** Column name AD_WorkflowProcessor_ID */
public static final String COLUMNNAME_AD_WorkflowProcessor_ID = "AD_WorkflowProcessor_ID";
/** Set Workflow Processorl Log.
@param AD_WorkflowProcessorLog_ID Result of the execution of the Workflow Processor */
public void setAD_WorkflowProcessorLog_ID (int AD_WorkflowProcessorLog_ID)
{
if (AD_WorkflowProcessorLog_ID < 1) throw new IllegalArgumentException ("AD_WorkflowProcessorLog_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_WorkflowProcessorLog_ID, Integer.valueOf(AD_WorkflowProcessorLog_ID));
}
/** Get Workflow Processorl Log.
@return Result of the execution of the Workflow Processor */
public int getAD_WorkflowProcessorLog_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_WorkflowProcessorLog_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3853aa81-1e1d-c03d-84db-bea654b6c8e0")
public static String es_PE_FIELD_Log_WorkflowProcessorlLog_Name="Log Procesador de Flujo de Trabajo";

@XendraTrl(Identifier="3853aa81-1e1d-c03d-84db-bea654b6c8e0")
public static String es_PE_FIELD_Log_WorkflowProcessorlLog_Description="Resultado de la ejecución de el procesador de flujo de trabajo. ";

@XendraTrl(Identifier="3853aa81-1e1d-c03d-84db-bea654b6c8e0")
public static String es_PE_FIELD_Log_WorkflowProcessorlLog_Help="Resultado de la ejecución de el procesador de flujo de trabajo.";

@XendraField(AD_Column_ID="AD_WorkflowProcessorLog_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d78971e9-7cfd-dc78-e986-a8a983bca413",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=0,SortNo=1,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3853aa81-1e1d-c03d-84db-bea654b6c8e0")
public static final String FIELDNAME_Log_WorkflowProcessorlLog="3853aa81-1e1d-c03d-84db-bea654b6c8e0";
/** Column name AD_WorkflowProcessorLog_ID */
public static final String COLUMNNAME_AD_WorkflowProcessorLog_ID = "AD_WorkflowProcessorLog_ID";
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

@XendraTrl(Identifier="1a00967d-836c-842f-8162-e99039c60d0c")
public static String es_PE_FIELD_Log_Description_Name="Observación";

@XendraTrl(Identifier="1a00967d-836c-842f-8162-e99039c60d0c")
public static String es_PE_FIELD_Log_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="1a00967d-836c-842f-8162-e99039c60d0c")
public static String es_PE_FIELD_Log_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="d78971e9-7cfd-dc78-e986-a8a983bca413",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1a00967d-836c-842f-8162-e99039c60d0c")
public static final String FIELDNAME_Log_Description="1a00967d-836c-842f-8162-e99039c60d0c";

@XendraTrl(Identifier="23dea3ae-2d14-8293-f5ec-1c05ce7e05fe")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="23dea3ae-2d14-8293-f5ec-1c05ce7e05fe",
Synchronized="2019-08-30 22:20:55.0")
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
@XendraTrl(Identifier="0a2fddd5-df00-4366-8061-8a37ca8c6662")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0a2fddd5-df00-4366-8061-8a37ca8c6662",
Synchronized="2019-08-30 22:20:55.0")
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

@XendraTrl(Identifier="ba3a7f82-0f51-9a05-d2ab-664ca937553c")
public static String es_PE_FIELD_Log_Error_Name="Error";

@XendraTrl(Identifier="ba3a7f82-0f51-9a05-d2ab-664ca937553c")
public static String es_PE_FIELD_Log_Error_Description="Un error ocurrío en la ejecución.";

@XendraField(AD_Column_ID="IsError",IsCentrallyMaintained=true,
AD_Tab_ID="d78971e9-7cfd-dc78-e986-a8a983bca413",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ba3a7f82-0f51-9a05-d2ab-664ca937553c")
public static final String FIELDNAME_Log_Error="ba3a7f82-0f51-9a05-d2ab-664ca937553c";

@XendraTrl(Identifier="ee0f16e0-1663-bcf4-8791-6a605d782ec9")
public static String es_PE_COLUMN_IsError_Name="Error";

@XendraColumn(AD_Element_ID="7a82e2b2-c09d-83e6-f469-1f1d9bae65a7",ColumnName="IsError",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ee0f16e0-1663-bcf4-8791-6a605d782ec9",
Synchronized="2019-08-30 22:20:55.0")
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
@XendraTrl(Identifier="ca56197b-564a-e255-f8b1-4e0a1e720e17")
public static String es_PE_FIELD_Log_Reference_Name="Referencia";

@XendraTrl(Identifier="ca56197b-564a-e255-f8b1-4e0a1e720e17")
public static String es_PE_FIELD_Log_Reference_Description="Referencia para este registro";

@XendraTrl(Identifier="ca56197b-564a-e255-f8b1-4e0a1e720e17")
public static String es_PE_FIELD_Log_Reference_Help="La referencia despliega el número del documento fuente";

@XendraField(AD_Column_ID="Reference",IsCentrallyMaintained=true,
AD_Tab_ID="d78971e9-7cfd-dc78-e986-a8a983bca413",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ca56197b-564a-e255-f8b1-4e0a1e720e17")
public static final String FIELDNAME_Log_Reference="ca56197b-564a-e255-f8b1-4e0a1e720e17";

@XendraTrl(Identifier="45e536d3-2cd7-5750-c584-953d8c52e8dc")
public static String es_PE_COLUMN_Reference_Name="Referencia";

@XendraColumn(AD_Element_ID="eba276ea-db21-0cfa-29e6-6e0d45ebff99",ColumnName="Reference",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="45e536d3-2cd7-5750-c584-953d8c52e8dc",
Synchronized="2019-08-30 22:20:55.0")
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
@XendraTrl(Identifier="cdf387c6-8fdf-1b3e-8d99-71f45a6c22fe")
public static String es_PE_FIELD_Log_Summary_Name="Resúmen";

@XendraTrl(Identifier="cdf387c6-8fdf-1b3e-8d99-71f45a6c22fe")
public static String es_PE_FIELD_Log_Summary_Description="Resúmen textual de esta solicitud";

@XendraTrl(Identifier="cdf387c6-8fdf-1b3e-8d99-71f45a6c22fe")
public static String es_PE_FIELD_Log_Summary_Help="El resúmen permite texto en formato libre sobre esta solicitud.";

@XendraField(AD_Column_ID="Summary",IsCentrallyMaintained=true,
AD_Tab_ID="d78971e9-7cfd-dc78-e986-a8a983bca413",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cdf387c6-8fdf-1b3e-8d99-71f45a6c22fe")
public static final String FIELDNAME_Log_Summary="cdf387c6-8fdf-1b3e-8d99-71f45a6c22fe";

@XendraTrl(Identifier="681a8f7f-9a60-1b83-4336-aaef86725139")
public static String es_PE_COLUMN_Summary_Name="Resúmen";

@XendraColumn(AD_Element_ID="94fe105c-8853-7c06-a32a-9ad75a452917",ColumnName="Summary",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="681a8f7f-9a60-1b83-4336-aaef86725139",
Synchronized="2019-08-30 22:20:55.0")
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
@XendraTrl(Identifier="03759e68-91cb-8d95-e8f9-a1a375ea3712")
public static String es_PE_FIELD_Log_TextMessage_Name="Mensaje de texto";

@XendraTrl(Identifier="03759e68-91cb-8d95-e8f9-a1a375ea3712")
public static String es_PE_FIELD_Log_TextMessage_Description="Mensaje de texto";

@XendraField(AD_Column_ID="TextMsg",IsCentrallyMaintained=true,
AD_Tab_ID="d78971e9-7cfd-dc78-e986-a8a983bca413",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="03759e68-91cb-8d95-e8f9-a1a375ea3712")
public static final String FIELDNAME_Log_TextMessage="03759e68-91cb-8d95-e8f9-a1a375ea3712";

@XendraTrl(Identifier="d561a484-216b-a583-4e3c-9fab662631bc")
public static String es_PE_COLUMN_TextMsg_Name="Mensaje de texto";

@XendraColumn(AD_Element_ID="377bebfe-238a-1c79-c1a9-13afa4448222",ColumnName="TextMsg",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d561a484-216b-a583-4e3c-9fab662631bc",
Synchronized="2019-08-30 22:20:55.0")
/** Column name TextMsg */
public static final String COLUMNNAME_TextMsg = "TextMsg";
}
