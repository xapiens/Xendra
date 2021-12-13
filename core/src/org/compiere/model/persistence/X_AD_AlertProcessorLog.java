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
/** Generated Model for AD_AlertProcessorLog
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_AlertProcessorLog extends PO
{
/** Standard Constructor
@param ctx context
@param AD_AlertProcessorLog_ID id
@param trxName transaction
*/
public X_AD_AlertProcessorLog (Properties ctx, int AD_AlertProcessorLog_ID, String trxName)
{
super (ctx, AD_AlertProcessorLog_ID, trxName);
/** if (AD_AlertProcessorLog_ID == 0)
{
setAD_AlertProcessor_ID (0);
setAD_AlertProcessorLog_ID (0);
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
public X_AD_AlertProcessorLog (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=699 */
public static int Table_ID=MTable.getTable_ID("AD_AlertProcessorLog");

@XendraTrl(Identifier="77b94918-283a-778c-b60a-37ce45f4abb8")
public static String es_PE_TAB_Log_Description="Log de Procesador de alertas";

@XendraTrl(Identifier="77b94918-283a-778c-b60a-37ce45f4abb8")
public static String es_PE_TAB_Log_Name="Log";
@XendraTab(Name="Log",
Description="Alert Processor Log",Help="",AD_Window_ID="859d189f-b63b-7afe-bad1-f24109c558c0",
SeqNo=20,TabLevel=1,IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="",HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="77b94918-283a-778c-b60a-37ce45f4abb8",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Log="77b94918-283a-778c-b60a-37ce45f4abb8";

@XendraTrl(Identifier="8d971ad1-a903-c261-9b27-e142ae32e03f")
public static String es_PE_TABLE_AD_AlertProcessorLog_Name="Log Procesador de Alertas";


@XendraTable(Name="Alert Processor Log",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="Result of the execution of the Alert Processor",Help="",
TableName="AD_AlertProcessorLog",AccessLevel="6",
AD_Window_ID="859d189f-b63b-7afe-bad1-f24109c558c0",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.dictionary",Identifier="8d971ad1-a903-c261-9b27-e142ae32e03f",
Synchronized="2020-03-03 21:34:51.0")
/** TableName=AD_AlertProcessorLog */
public static final String Table_Name="AD_AlertProcessorLog";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_AlertProcessorLog");

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
    Table_ID = MTable.getTable_ID("AD_AlertProcessorLog");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_AlertProcessorLog[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Alert Processor.
@param AD_AlertProcessor_ID Alert Processor/Server Parameter */
public void setAD_AlertProcessor_ID (int AD_AlertProcessor_ID)
{
if (AD_AlertProcessor_ID < 1) throw new IllegalArgumentException ("AD_AlertProcessor_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_AlertProcessor_ID, Integer.valueOf(AD_AlertProcessor_ID));
}
/** Get Alert Processor.
@return Alert Processor/Server Parameter */
public int getAD_AlertProcessor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_AlertProcessor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="aac12203-6ead-7f38-1104-799e126e306e")
public static String es_PE_FIELD_Log_AlertProcessor_Name="Procesador de Alertas";

@XendraTrl(Identifier="aac12203-6ead-7f38-1104-799e126e306e")
public static String es_PE_FIELD_Log_AlertProcessor_Description="Procesador de alertas / Parámetros del servidor.";

@XendraTrl(Identifier="aac12203-6ead-7f38-1104-799e126e306e")
public static String es_PE_FIELD_Log_AlertProcessor_Help="Procesador de alertas / Parámetros del servidor.";

@XendraField(AD_Column_ID="AD_AlertProcessor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="77b94918-283a-778c-b60a-37ce45f4abb8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aac12203-6ead-7f38-1104-799e126e306e")
public static final String FIELDNAME_Log_AlertProcessor="aac12203-6ead-7f38-1104-799e126e306e";

@XendraTrl(Identifier="59406e4b-904a-9608-4868-89170ad81c2c")
public static String es_PE_COLUMN_AD_AlertProcessor_ID_Name="Procesador de Alertas";

@XendraColumn(AD_Element_ID="aedb6236-a004-ab2b-7a1e-e0ed29e6d502",
ColumnName="AD_AlertProcessor_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="59406e4b-904a-9608-4868-89170ad81c2c",Synchronized="2020-03-03 21:34:19.0")
/** Column name AD_AlertProcessor_ID */
public static final String COLUMNNAME_AD_AlertProcessor_ID = "AD_AlertProcessor_ID";
/** Set Alert Processor Log.
@param AD_AlertProcessorLog_ID Result of the execution of the Alert Processor */
public void setAD_AlertProcessorLog_ID (int AD_AlertProcessorLog_ID)
{
if (AD_AlertProcessorLog_ID < 1) throw new IllegalArgumentException ("AD_AlertProcessorLog_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_AlertProcessorLog_ID, Integer.valueOf(AD_AlertProcessorLog_ID));
}
/** Get Alert Processor Log.
@return Result of the execution of the Alert Processor */
public int getAD_AlertProcessorLog_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_AlertProcessorLog_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d6345b1e-a867-5dbd-95bd-fcc3fc20303d")
public static String es_PE_FIELD_Log_AlertProcessorLog_Name="Log Procesador de Alertas";

@XendraTrl(Identifier="d6345b1e-a867-5dbd-95bd-fcc3fc20303d")
public static String es_PE_FIELD_Log_AlertProcessorLog_Description="Resultado de la ejecución de el procesador de alertas.";

@XendraTrl(Identifier="d6345b1e-a867-5dbd-95bd-fcc3fc20303d")
public static String es_PE_FIELD_Log_AlertProcessorLog_Help="Resultado de la ejecución de el procesador de alertas.";

@XendraField(AD_Column_ID="AD_AlertProcessorLog_ID",IsCentrallyMaintained=true,
AD_Tab_ID="77b94918-283a-778c-b60a-37ce45f4abb8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=0,SortNo=1,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d6345b1e-a867-5dbd-95bd-fcc3fc20303d")
public static final String FIELDNAME_Log_AlertProcessorLog="d6345b1e-a867-5dbd-95bd-fcc3fc20303d";
/** Column name AD_AlertProcessorLog_ID */
public static final String COLUMNNAME_AD_AlertProcessorLog_ID = "AD_AlertProcessorLog_ID";
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

@XendraTrl(Identifier="dd33dfe8-a0f6-53c4-0a22-66ed08c8fede")
public static String es_PE_FIELD_Log_Description_Name="Observación";

@XendraTrl(Identifier="dd33dfe8-a0f6-53c4-0a22-66ed08c8fede")
public static String es_PE_FIELD_Log_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="dd33dfe8-a0f6-53c4-0a22-66ed08c8fede")
public static String es_PE_FIELD_Log_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="77b94918-283a-778c-b60a-37ce45f4abb8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dd33dfe8-a0f6-53c4-0a22-66ed08c8fede")
public static final String FIELDNAME_Log_Description="dd33dfe8-a0f6-53c4-0a22-66ed08c8fede";

@XendraTrl(Identifier="0830f64d-b36e-1c36-58eb-f098c020e0f7")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0830f64d-b36e-1c36-58eb-f098c020e0f7",
Synchronized="2020-03-03 21:34:20.0")
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
@XendraTrl(Identifier="be0b981f-84f7-4f49-b96f-57514072217a")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="be0b981f-84f7-4f49-b96f-57514072217a",
Synchronized="2020-03-03 21:34:20.0")
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

@XendraTrl(Identifier="b823889f-a646-fb17-ef75-57f8a4d1b07f")
public static String es_PE_FIELD_Log_Error_Name="Error";

@XendraTrl(Identifier="b823889f-a646-fb17-ef75-57f8a4d1b07f")
public static String es_PE_FIELD_Log_Error_Description="Un error ocurrío en la ejecución.";

@XendraField(AD_Column_ID="IsError",IsCentrallyMaintained=true,
AD_Tab_ID="77b94918-283a-778c-b60a-37ce45f4abb8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b823889f-a646-fb17-ef75-57f8a4d1b07f")
public static final String FIELDNAME_Log_Error="b823889f-a646-fb17-ef75-57f8a4d1b07f";

@XendraTrl(Identifier="8c6fbe60-b417-035d-260c-37a81306e693")
public static String es_PE_COLUMN_IsError_Name="Error";

@XendraColumn(AD_Element_ID="7a82e2b2-c09d-83e6-f469-1f1d9bae65a7",ColumnName="IsError",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8c6fbe60-b417-035d-260c-37a81306e693",
Synchronized="2020-03-03 21:34:20.0")
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
@XendraTrl(Identifier="e4bcf7b7-1860-1b20-be8b-b1af08a1381e")
public static String es_PE_FIELD_Log_Reference_Name="Referencia";

@XendraTrl(Identifier="e4bcf7b7-1860-1b20-be8b-b1af08a1381e")
public static String es_PE_FIELD_Log_Reference_Description="Referencia para este registro";

@XendraTrl(Identifier="e4bcf7b7-1860-1b20-be8b-b1af08a1381e")
public static String es_PE_FIELD_Log_Reference_Help="La referencia despliega el número del documento fuente";

@XendraField(AD_Column_ID="Reference",IsCentrallyMaintained=true,
AD_Tab_ID="77b94918-283a-778c-b60a-37ce45f4abb8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e4bcf7b7-1860-1b20-be8b-b1af08a1381e")
public static final String FIELDNAME_Log_Reference="e4bcf7b7-1860-1b20-be8b-b1af08a1381e";

@XendraTrl(Identifier="ba7a9791-5bf7-eec6-13a4-652d1b36c7ca")
public static String es_PE_COLUMN_Reference_Name="Referencia";

@XendraColumn(AD_Element_ID="eba276ea-db21-0cfa-29e6-6e0d45ebff99",ColumnName="Reference",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ba7a9791-5bf7-eec6-13a4-652d1b36c7ca",
Synchronized="2020-03-03 21:34:20.0")
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
@XendraTrl(Identifier="42ac3a74-6b5a-1693-d1bc-91490aea1229")
public static String es_PE_FIELD_Log_Summary_Name="Resúmen";

@XendraTrl(Identifier="42ac3a74-6b5a-1693-d1bc-91490aea1229")
public static String es_PE_FIELD_Log_Summary_Description="Resúmen textual de esta solicitud";

@XendraTrl(Identifier="42ac3a74-6b5a-1693-d1bc-91490aea1229")
public static String es_PE_FIELD_Log_Summary_Help="El resúmen permite texto en formato libre sobre esta solicitud.";

@XendraField(AD_Column_ID="Summary",IsCentrallyMaintained=true,
AD_Tab_ID="77b94918-283a-778c-b60a-37ce45f4abb8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="42ac3a74-6b5a-1693-d1bc-91490aea1229")
public static final String FIELDNAME_Log_Summary="42ac3a74-6b5a-1693-d1bc-91490aea1229";

@XendraTrl(Identifier="38274ebb-08e0-26bf-b00f-2ea37b53b9fa")
public static String es_PE_COLUMN_Summary_Name="Resúmen";

@XendraColumn(AD_Element_ID="94fe105c-8853-7c06-a32a-9ad75a452917",ColumnName="Summary",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="38274ebb-08e0-26bf-b00f-2ea37b53b9fa",
Synchronized="2020-03-03 21:34:20.0")
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
@XendraTrl(Identifier="756f0f9a-2a34-15e3-326f-8066e1f89006")
public static String es_PE_FIELD_Log_TextMessage_Name="Mensaje de texto";

@XendraTrl(Identifier="756f0f9a-2a34-15e3-326f-8066e1f89006")
public static String es_PE_FIELD_Log_TextMessage_Description="Mensaje de texto";

@XendraField(AD_Column_ID="TextMsg",IsCentrallyMaintained=true,
AD_Tab_ID="77b94918-283a-778c-b60a-37ce45f4abb8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="756f0f9a-2a34-15e3-326f-8066e1f89006")
public static final String FIELDNAME_Log_TextMessage="756f0f9a-2a34-15e3-326f-8066e1f89006";

@XendraTrl(Identifier="ac95bee8-a5f3-a793-784a-977909bd3e16")
public static String es_PE_COLUMN_TextMsg_Name="Mensaje de texto";

@XendraColumn(AD_Element_ID="377bebfe-238a-1c79-c1a9-13afa4448222",ColumnName="TextMsg",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ac95bee8-a5f3-a793-784a-977909bd3e16",
Synchronized="2020-03-03 21:34:20.0")
/** Column name TextMsg */
public static final String COLUMNNAME_TextMsg = "TextMsg";
}
