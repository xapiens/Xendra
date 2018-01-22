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
/** Generated Model for C_CashFlowProcessorLog
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_CashFlowProcessorLog extends PO
{
/** Standard Constructor
@param ctx context
@param C_CashFlowProcessorLog_ID id
@param trxName transaction
*/
public X_C_CashFlowProcessorLog (Properties ctx, int C_CashFlowProcessorLog_ID, String trxName)
{
super (ctx, C_CashFlowProcessorLog_ID, trxName);
/** if (C_CashFlowProcessorLog_ID == 0)
{
setC_CashFlowProcessor_ID (0);
setC_CashFlowProcessorLog_ID (0);
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
public X_C_CashFlowProcessorLog (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000031 */
public static int Table_ID=MTable.getTable_ID("C_CashFlowProcessorLog");

@XendraTrl(Identifier="c1b59dfb-9d7a-e001-5239-3567be1c95c6")
public static String es_PE_TAB_Log_Name="Log";
@XendraTab(Name="Log",Description="",Help="",
AD_Window_ID="2dbf21fc-a923-fdd6-65f3-282445376a90",SeqNo=20,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="c1b59dfb-9d7a-e001-5239-3567be1c95c6",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Log="c1b59dfb-9d7a-e001-5239-3567be1c95c6";

@XendraTrl(Identifier="fa7ff0db-c91c-7ec8-f2bb-3f2ffd5658cf")
public static String es_PE_TABLE_C_CashFlowProcessorLog_Name="C_CashFlowProcessorLog_ID";


@XendraTable(Name="Cash Flow Processor Log",
Description="Result of execution of the Cash Flow Processor",Help="",
TableName="C_CashFlowProcessorLog",AccessLevel="2",
AD_Window_ID="2dbf21fc-a923-fdd6-65f3-282445376a90",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="fa7ff0db-c91c-7ec8-f2bb-3f2ffd5658cf",
Synchronized="2017-08-16 11:41:36.0")
/** TableName=C_CashFlowProcessorLog */
public static final String Table_Name="C_CashFlowProcessorLog";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_CashFlowProcessorLog");

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
    Table_ID = MTable.getTable_ID("C_CashFlowProcessorLog");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_CashFlowProcessorLog[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Cash Flow Processor.
@param C_CashFlowProcessor_ID Cash Flow Processor / Server parameters */
public void setC_CashFlowProcessor_ID (int C_CashFlowProcessor_ID)
{
if (C_CashFlowProcessor_ID < 1) throw new IllegalArgumentException ("C_CashFlowProcessor_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_CashFlowProcessor_ID, Integer.valueOf(C_CashFlowProcessor_ID));
}
/** Get Cash Flow Processor.
@return Cash Flow Processor / Server parameters */
public int getC_CashFlowProcessor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_CashFlowProcessor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="46e77726-7cfe-6d7e-0cba-edc1d9439d8e")
public static String es_PE_FIELD_Log_CashFlowProcessor_Description="Cash Flow Processor / Server parameters";

@XendraTrl(Identifier="46e77726-7cfe-6d7e-0cba-edc1d9439d8e")
public static String es_PE_FIELD_Log_CashFlowProcessor_Help="Cash Flow Processor / Server parameters";

@XendraTrl(Identifier="46e77726-7cfe-6d7e-0cba-edc1d9439d8e")
public static String es_PE_FIELD_Log_CashFlowProcessor_Name="Cash Flow Processor";

@XendraField(AD_Column_ID="C_CashFlowProcessor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c1b59dfb-9d7a-e001-5239-3567be1c95c6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="46e77726-7cfe-6d7e-0cba-edc1d9439d8e")
public static final String FIELDNAME_Log_CashFlowProcessor="46e77726-7cfe-6d7e-0cba-edc1d9439d8e";

@XendraTrl(Identifier="38c5d9a6-a466-d052-efdc-c837d2ad4b24")
public static String es_PE_COLUMN_C_CashFlowProcessor_ID_Name="Cash Flow Processor";

@XendraColumn(AD_Element_ID="9fa54c3e-e3ac-0246-b333-47054d74026f",
ColumnName="C_CashFlowProcessor_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="38c5d9a6-a466-d052-efdc-c837d2ad4b24",Synchronized="2017-08-05 16:53:28.0")
/** Column name C_CashFlowProcessor_ID */
public static final String COLUMNNAME_C_CashFlowProcessor_ID = "C_CashFlowProcessor_ID";
/** Set Cash Flow Processor Log.
@param C_CashFlowProcessorLog_ID Cash Flow Processor Log */
public void setC_CashFlowProcessorLog_ID (int C_CashFlowProcessorLog_ID)
{
if (C_CashFlowProcessorLog_ID < 1) throw new IllegalArgumentException ("C_CashFlowProcessorLog_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_CashFlowProcessorLog_ID, Integer.valueOf(C_CashFlowProcessorLog_ID));
}
/** Get Cash Flow Processor Log.
@return Cash Flow Processor Log */
public int getC_CashFlowProcessorLog_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_CashFlowProcessorLog_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c3bf2952-ee96-7f48-cf43-97f00ac963fe")
public static String es_PE_FIELD_Log_CashFlowProcessorLog_Name="C_CashFlowProcessorLog_ID";

@XendraField(AD_Column_ID="C_CashFlowProcessorLog_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c1b59dfb-9d7a-e001-5239-3567be1c95c6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c3bf2952-ee96-7f48-cf43-97f00ac963fe")
public static final String FIELDNAME_Log_CashFlowProcessorLog="c3bf2952-ee96-7f48-cf43-97f00ac963fe";
/** Column name C_CashFlowProcessorLog_ID */
public static final String COLUMNNAME_C_CashFlowProcessorLog_ID = "C_CashFlowProcessorLog_ID";
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

@XendraTrl(Identifier="9255897a-0865-04fe-924b-adc3ebeae063")
public static String es_PE_FIELD_Log_Description_Description="Observación";

@XendraTrl(Identifier="9255897a-0865-04fe-924b-adc3ebeae063")
public static String es_PE_FIELD_Log_Description_Help="Observación";

@XendraTrl(Identifier="9255897a-0865-04fe-924b-adc3ebeae063")
public static String es_PE_FIELD_Log_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="c1b59dfb-9d7a-e001-5239-3567be1c95c6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9255897a-0865-04fe-924b-adc3ebeae063")
public static final String FIELDNAME_Log_Description="9255897a-0865-04fe-924b-adc3ebeae063";

@XendraTrl(Identifier="d254ac93-1723-d3ef-9b9e-a42299f5066b")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d254ac93-1723-d3ef-9b9e-a42299f5066b",
Synchronized="2017-08-05 16:53:28.0")
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
@XendraTrl(Identifier="66079d97-0dd6-4ea9-b11f-f7fe3c0471a4")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="66079d97-0dd6-4ea9-b11f-f7fe3c0471a4",
Synchronized="2017-08-05 16:53:28.0")
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

@XendraTrl(Identifier="a812c557-9ced-9284-d280-4a2459cc6415")
public static String es_PE_FIELD_Log_Error_Description="Un error ocurrío en la ejecución.";

@XendraTrl(Identifier="a812c557-9ced-9284-d280-4a2459cc6415")
public static String es_PE_FIELD_Log_Error_Name="Error";
@XendraField(AD_Column_ID="IsError",
IsCentrallyMaintained=true,AD_Tab_ID="c1b59dfb-9d7a-e001-5239-3567be1c95c6",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="a812c557-9ced-9284-d280-4a2459cc6415")
public static final String FIELDNAME_Log_Error="a812c557-9ced-9284-d280-4a2459cc6415";

@XendraTrl(Identifier="d3bd0df8-e2f2-260d-bdda-261ef48d114e")
public static String es_PE_COLUMN_IsError_Name="Error";

@XendraColumn(AD_Element_ID="7a82e2b2-c09d-83e6-f469-1f1d9bae65a7",ColumnName="IsError",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d3bd0df8-e2f2-260d-bdda-261ef48d114e",
Synchronized="2017-08-05 16:53:28.0")
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
@XendraTrl(Identifier="6e5069b4-e08b-d965-665d-8542cf444cbe")
public static String es_PE_FIELD_Log_Reference_Description="Referencia para este registro";

@XendraTrl(Identifier="6e5069b4-e08b-d965-665d-8542cf444cbe")
public static String es_PE_FIELD_Log_Reference_Help="La referencia despliega el número del documento fuente";

@XendraTrl(Identifier="6e5069b4-e08b-d965-665d-8542cf444cbe")
public static String es_PE_FIELD_Log_Reference_Name="Referencia";

@XendraField(AD_Column_ID="Reference",IsCentrallyMaintained=true,
AD_Tab_ID="c1b59dfb-9d7a-e001-5239-3567be1c95c6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6e5069b4-e08b-d965-665d-8542cf444cbe")
public static final String FIELDNAME_Log_Reference="6e5069b4-e08b-d965-665d-8542cf444cbe";

@XendraTrl(Identifier="2940f1fb-0228-dd4d-6e1e-c2223263dc71")
public static String es_PE_COLUMN_Reference_Name="Referencia";

@XendraColumn(AD_Element_ID="eba276ea-db21-0cfa-29e6-6e0d45ebff99",ColumnName="Reference",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2940f1fb-0228-dd4d-6e1e-c2223263dc71",
Synchronized="2017-08-05 16:53:28.0")
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
@XendraTrl(Identifier="e6e2017a-8de7-f123-384d-094db2734b62")
public static String es_PE_FIELD_Log_Summary_Description="Resúmen textual de esta solicitud";

@XendraTrl(Identifier="e6e2017a-8de7-f123-384d-094db2734b62")
public static String es_PE_FIELD_Log_Summary_Help="El resúmen permite texto en formato libre sobre esta solicitud.";

@XendraTrl(Identifier="e6e2017a-8de7-f123-384d-094db2734b62")
public static String es_PE_FIELD_Log_Summary_Name="Resúmen";
@XendraField(AD_Column_ID="Summary",
IsCentrallyMaintained=true,AD_Tab_ID="c1b59dfb-9d7a-e001-5239-3567be1c95c6",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="e6e2017a-8de7-f123-384d-094db2734b62")
public static final String FIELDNAME_Log_Summary="e6e2017a-8de7-f123-384d-094db2734b62";

@XendraTrl(Identifier="ddd82a94-f5f6-ccdd-daff-fd35b891ce18")
public static String es_PE_COLUMN_Summary_Name="Resúmen";

@XendraColumn(AD_Element_ID="94fe105c-8853-7c06-a32a-9ad75a452917",ColumnName="Summary",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ddd82a94-f5f6-ccdd-daff-fd35b891ce18",
Synchronized="2017-08-05 16:53:28.0")
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
@XendraTrl(Identifier="755eff30-1143-84e4-bf7c-08aee7009cd5")
public static String es_PE_FIELD_Log_TextMessage_Description="Mensaje de texto";

@XendraTrl(Identifier="755eff30-1143-84e4-bf7c-08aee7009cd5")
public static String es_PE_FIELD_Log_TextMessage_Name="Mensaje de texto";

@XendraField(AD_Column_ID="TextMsg",IsCentrallyMaintained=true,
AD_Tab_ID="c1b59dfb-9d7a-e001-5239-3567be1c95c6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="755eff30-1143-84e4-bf7c-08aee7009cd5")
public static final String FIELDNAME_Log_TextMessage="755eff30-1143-84e4-bf7c-08aee7009cd5";

@XendraTrl(Identifier="740bbc19-216a-54df-a1d1-6bff9d25c05e")
public static String es_PE_COLUMN_TextMsg_Name="Mensaje de texto";

@XendraColumn(AD_Element_ID="377bebfe-238a-1c79-c1a9-13afa4448222",ColumnName="TextMsg",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="740bbc19-216a-54df-a1d1-6bff9d25c05e",
Synchronized="2017-08-05 16:53:28.0")
/** Column name TextMsg */
public static final String COLUMNNAME_TextMsg = "TextMsg";
}
