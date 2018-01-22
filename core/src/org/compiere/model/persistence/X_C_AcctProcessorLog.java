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
/** Generated Model for C_AcctProcessorLog
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_AcctProcessorLog extends PO
{
/** Standard Constructor
@param ctx context
@param C_AcctProcessorLog_ID id
@param trxName transaction
*/
public X_C_AcctProcessorLog (Properties ctx, int C_AcctProcessorLog_ID, String trxName)
{
super (ctx, C_AcctProcessorLog_ID, trxName);
/** if (C_AcctProcessorLog_ID == 0)
{
setC_AcctProcessor_ID (0);
setC_AcctProcessorLog_ID (0);
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
public X_C_AcctProcessorLog (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=694 */
public static int Table_ID=MTable.getTable_ID("C_AcctProcessorLog");

@XendraTrl(Identifier="65846023-6f0e-b5e7-5e2a-7554e2416048")
public static String es_PE_TAB_Log_Description="Resultados de la ejecución de el procesador de contabilidad";

@XendraTrl(Identifier="65846023-6f0e-b5e7-5e2a-7554e2416048")
public static String es_PE_TAB_Log_Name="Log";

@XendraTrl(Identifier="65846023-6f0e-b5e7-5e2a-7554e2416048")
public static String es_PE_TAB_Log_Help="Resultados de la ejecución de el procesador de contabilidad";

@XendraTab(Name="Log",Description="Result of the execution of the Accounting Processor",
Help="Result of the execution of the Accounting Processor",
AD_Window_ID="e1ecf009-9f38-cb92-e627-1b55afb20cc9",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="65846023-6f0e-b5e7-5e2a-7554e2416048",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Log="65846023-6f0e-b5e7-5e2a-7554e2416048";

@XendraTrl(Identifier="74cabaa5-f355-c3ce-3202-efe80521ad41")
public static String es_PE_TABLE_C_AcctProcessorLog_Name="Log de Procesador Contable";


@XendraTable(Name="Accounting Processor Log",
Description="Result of the execution of the Accounting Processor",Help="",
TableName="C_AcctProcessorLog",AccessLevel="2",AD_Window_ID="e1ecf009-9f38-cb92-e627-1b55afb20cc9",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="74cabaa5-f355-c3ce-3202-efe80521ad41",Synchronized="2017-08-16 11:41:18.0")
/** TableName=C_AcctProcessorLog */
public static final String Table_Name="C_AcctProcessorLog";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_AcctProcessorLog");

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
    Table_ID = MTable.getTable_ID("C_AcctProcessorLog");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_AcctProcessorLog[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Accounting Processor.
@param C_AcctProcessor_ID Accounting Processor/Server Parameters */
public void setC_AcctProcessor_ID (int C_AcctProcessor_ID)
{
if (C_AcctProcessor_ID < 1) throw new IllegalArgumentException ("C_AcctProcessor_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_AcctProcessor_ID, Integer.valueOf(C_AcctProcessor_ID));
}
/** Get Accounting Processor.
@return Accounting Processor/Server Parameters */
public int getC_AcctProcessor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_AcctProcessor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d09fdcb8-3c03-1c60-c4e3-0e27b64a3908")
public static String es_PE_FIELD_Log_AccountingProcessor_Description="Procesador contable / Parámetros del servidor.";

@XendraTrl(Identifier="d09fdcb8-3c03-1c60-c4e3-0e27b64a3908")
public static String es_PE_FIELD_Log_AccountingProcessor_Help="Procesador contable / Servidor.";

@XendraTrl(Identifier="d09fdcb8-3c03-1c60-c4e3-0e27b64a3908")
public static String es_PE_FIELD_Log_AccountingProcessor_Name="Procesador Contable";

@XendraField(AD_Column_ID="C_AcctProcessor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="65846023-6f0e-b5e7-5e2a-7554e2416048",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d09fdcb8-3c03-1c60-c4e3-0e27b64a3908")
public static final String FIELDNAME_Log_AccountingProcessor="d09fdcb8-3c03-1c60-c4e3-0e27b64a3908";

@XendraTrl(Identifier="c4f434bc-2d6d-52a3-acda-6f9af2d3476b")
public static String es_PE_COLUMN_C_AcctProcessor_ID_Name="Procesador Contable";

@XendraColumn(AD_Element_ID="b507c861-11be-32ab-e0c6-90c472ac3ed9",ColumnName="C_AcctProcessor_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c4f434bc-2d6d-52a3-acda-6f9af2d3476b",
Synchronized="2017-08-05 16:53:08.0")
/** Column name C_AcctProcessor_ID */
public static final String COLUMNNAME_C_AcctProcessor_ID = "C_AcctProcessor_ID";
/** Set Accounting Processor Log.
@param C_AcctProcessorLog_ID Result of the execution of the Accounting Processor */
public void setC_AcctProcessorLog_ID (int C_AcctProcessorLog_ID)
{
if (C_AcctProcessorLog_ID < 1) throw new IllegalArgumentException ("C_AcctProcessorLog_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_AcctProcessorLog_ID, Integer.valueOf(C_AcctProcessorLog_ID));
}
/** Get Accounting Processor Log.
@return Result of the execution of the Accounting Processor */
public int getC_AcctProcessorLog_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_AcctProcessorLog_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0eebe8b8-602f-263a-0afe-1260163603f4")
public static String es_PE_FIELD_Log_AccountingProcessorLog_Description="Resultado de la ejecución del procesador de contabilidad.";

@XendraTrl(Identifier="0eebe8b8-602f-263a-0afe-1260163603f4")
public static String es_PE_FIELD_Log_AccountingProcessorLog_Help="Resultado de la ejecución del procesador de contabilidad.";

@XendraTrl(Identifier="0eebe8b8-602f-263a-0afe-1260163603f4")
public static String es_PE_FIELD_Log_AccountingProcessorLog_Name="Log de Procesador Contable";

@XendraField(AD_Column_ID="C_AcctProcessorLog_ID",IsCentrallyMaintained=true,
AD_Tab_ID="65846023-6f0e-b5e7-5e2a-7554e2416048",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=0,SortNo=1,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0eebe8b8-602f-263a-0afe-1260163603f4")
public static final String FIELDNAME_Log_AccountingProcessorLog="0eebe8b8-602f-263a-0afe-1260163603f4";
/** Column name C_AcctProcessorLog_ID */
public static final String COLUMNNAME_C_AcctProcessorLog_ID = "C_AcctProcessorLog_ID";
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

@XendraTrl(Identifier="80a4231d-d28f-2115-3825-f3076463635d")
public static String es_PE_FIELD_Log_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="80a4231d-d28f-2115-3825-f3076463635d")
public static String es_PE_FIELD_Log_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="80a4231d-d28f-2115-3825-f3076463635d")
public static String es_PE_FIELD_Log_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="65846023-6f0e-b5e7-5e2a-7554e2416048",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="80a4231d-d28f-2115-3825-f3076463635d")
public static final String FIELDNAME_Log_Description="80a4231d-d28f-2115-3825-f3076463635d";

@XendraTrl(Identifier="3f931986-8ad6-0664-ef48-52bc448cea98")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3f931986-8ad6-0664-ef48-52bc448cea98",
Synchronized="2017-08-05 16:53:08.0")
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
@XendraTrl(Identifier="26c40eac-d7fa-44ac-b386-0f4c3e146996")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="26c40eac-d7fa-44ac-b386-0f4c3e146996",
Synchronized="2017-08-05 16:53:09.0")
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

@XendraTrl(Identifier="25fd3837-ff13-9454-254a-ebe77cc623aa")
public static String es_PE_FIELD_Log_Error_Description="Un error ocurrío en la ejecución.";

@XendraTrl(Identifier="25fd3837-ff13-9454-254a-ebe77cc623aa")
public static String es_PE_FIELD_Log_Error_Name="Error";
@XendraField(AD_Column_ID="IsError",
IsCentrallyMaintained=true,AD_Tab_ID="65846023-6f0e-b5e7-5e2a-7554e2416048",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=60,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="25fd3837-ff13-9454-254a-ebe77cc623aa")
public static final String FIELDNAME_Log_Error="25fd3837-ff13-9454-254a-ebe77cc623aa";

@XendraTrl(Identifier="7fefa05a-c5fe-7e9f-877a-f9fc390cce6d")
public static String es_PE_COLUMN_IsError_Name="Error";

@XendraColumn(AD_Element_ID="7a82e2b2-c09d-83e6-f469-1f1d9bae65a7",ColumnName="IsError",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7fefa05a-c5fe-7e9f-877a-f9fc390cce6d",
Synchronized="2017-08-05 16:53:09.0")
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
@XendraTrl(Identifier="13ea5bd1-a498-dbcc-3d29-e4a699cfc0f1")
public static String es_PE_FIELD_Log_Reference_Description="Referencia para este registro";

@XendraTrl(Identifier="13ea5bd1-a498-dbcc-3d29-e4a699cfc0f1")
public static String es_PE_FIELD_Log_Reference_Help="La referencia despliega el número del documento fuente";

@XendraTrl(Identifier="13ea5bd1-a498-dbcc-3d29-e4a699cfc0f1")
public static String es_PE_FIELD_Log_Reference_Name="Referencia";

@XendraField(AD_Column_ID="Reference",IsCentrallyMaintained=true,
AD_Tab_ID="65846023-6f0e-b5e7-5e2a-7554e2416048",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="13ea5bd1-a498-dbcc-3d29-e4a699cfc0f1")
public static final String FIELDNAME_Log_Reference="13ea5bd1-a498-dbcc-3d29-e4a699cfc0f1";

@XendraTrl(Identifier="2dc08c56-9dac-2fca-1711-d477b27e5a3d")
public static String es_PE_COLUMN_Reference_Name="Referencia";

@XendraColumn(AD_Element_ID="eba276ea-db21-0cfa-29e6-6e0d45ebff99",ColumnName="Reference",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2dc08c56-9dac-2fca-1711-d477b27e5a3d",
Synchronized="2017-08-05 16:53:09.0")
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
@XendraTrl(Identifier="74954488-8184-2a5d-2d16-59958d5593f9")
public static String es_PE_FIELD_Log_Summary_Description="Resúmen textual de esta solicitud";

@XendraTrl(Identifier="74954488-8184-2a5d-2d16-59958d5593f9")
public static String es_PE_FIELD_Log_Summary_Help="El resúmen permite texto en formato libre sobre esta solicitud.";

@XendraTrl(Identifier="74954488-8184-2a5d-2d16-59958d5593f9")
public static String es_PE_FIELD_Log_Summary_Name="Resúmen";
@XendraField(AD_Column_ID="Summary",
IsCentrallyMaintained=true,AD_Tab_ID="65846023-6f0e-b5e7-5e2a-7554e2416048",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=50,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="74954488-8184-2a5d-2d16-59958d5593f9")
public static final String FIELDNAME_Log_Summary="74954488-8184-2a5d-2d16-59958d5593f9";

@XendraTrl(Identifier="b3124c80-fc0d-c7b8-12be-4c265a7a7792")
public static String es_PE_COLUMN_Summary_Name="Resúmen";

@XendraColumn(AD_Element_ID="94fe105c-8853-7c06-a32a-9ad75a452917",ColumnName="Summary",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b3124c80-fc0d-c7b8-12be-4c265a7a7792",
Synchronized="2017-08-05 16:53:09.0")
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
@XendraTrl(Identifier="ac656a83-79e2-6afb-c9a7-0f675ff2a010")
public static String es_PE_FIELD_Log_TextMessage_Description="Mensaje de texto";

@XendraTrl(Identifier="ac656a83-79e2-6afb-c9a7-0f675ff2a010")
public static String es_PE_FIELD_Log_TextMessage_Name="Mensaje de texto";

@XendraField(AD_Column_ID="TextMsg",IsCentrallyMaintained=true,
AD_Tab_ID="65846023-6f0e-b5e7-5e2a-7554e2416048",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ac656a83-79e2-6afb-c9a7-0f675ff2a010")
public static final String FIELDNAME_Log_TextMessage="ac656a83-79e2-6afb-c9a7-0f675ff2a010";

@XendraTrl(Identifier="b8c67af4-f6ca-e0eb-ae06-b5de6af5eea2")
public static String es_PE_COLUMN_TextMsg_Name="Mensaje de texto";

@XendraColumn(AD_Element_ID="377bebfe-238a-1c79-c1a9-13afa4448222",ColumnName="TextMsg",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b8c67af4-f6ca-e0eb-ae06-b5de6af5eea2",
Synchronized="2017-08-05 16:53:09.0")
/** Column name TextMsg */
public static final String COLUMNNAME_TextMsg = "TextMsg";
}
