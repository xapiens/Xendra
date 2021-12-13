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
/** Generated Model for R_IssueKnown
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_R_IssueKnown extends PO
{
/** Standard Constructor
@param ctx context
@param R_IssueKnown_ID id
@param trxName transaction
*/
public X_R_IssueKnown (Properties ctx, int R_IssueKnown_ID, String trxName)
{
super (ctx, R_IssueKnown_ID, trxName);
/** if (R_IssueKnown_ID == 0)
{
setIssueSummary (null);
setReleaseNo (null);
setR_IssueKnown_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_R_IssueKnown (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=839 */
public static int Table_ID=MTable.getTable_ID("R_IssueKnown");

@XendraTrl(Identifier="2399e744-3089-98bc-cd7a-8407b2d26d9f")
public static String es_PE_TAB_KnownIssue_Description="Mantener Surtimiento Conocido";

@XendraTrl(Identifier="2399e744-3089-98bc-cd7a-8407b2d26d9f")
public static String es_PE_TAB_KnownIssue_Name="Surtimiento Conocido";

@XendraTab(Name="Known Issue",Description="Maintain Known Issue",Help="",
AD_Window_ID="f58354d4-7c55-05de-c069-83657a854014",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="2399e744-3089-98bc-cd7a-8407b2d26d9f",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_KnownIssue="2399e744-3089-98bc-cd7a-8407b2d26d9f";

@XendraTrl(Identifier="26319925-5cc6-3827-4b28-d1fd844591c3")
public static String es_PE_TABLE_R_IssueKnown_Name="Edición Conocida";

@XendraTable(Name="Known Issue",AD_Package_ID="1b3656e5-71c7-1296-994e-9b2c4549c7fd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Known Issue",Help="",
TableName="R_IssueKnown",AccessLevel="6",AD_Window_ID="f58354d4-7c55-05de-c069-83657a854014",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="26319925-5cc6-3827-4b28-d1fd844591c3",Synchronized="2020-03-03 21:39:31.0")
/** TableName=R_IssueKnown */
public static final String Table_Name="R_IssueKnown";


@XendraIndex(Name="r_knownissue_alt",Identifier="f9e70848-9480-a7c1-0eae-f8d174d5e6ec",
Column_Names="issuesummary, releaseno, sourceclassname, sourcemethodname, loggername, lineno",
IsUnique="true",TableIdentifier="f9e70848-9480-a7c1-0eae-f8d174d5e6ec",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_r_knownissue_alt = "f9e70848-9480-a7c1-0eae-f8d174d5e6ec";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"R_IssueKnown");

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
    Table_ID = MTable.getTable_ID("R_IssueKnown");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_R_IssueKnown[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="7f413881-42e5-6f82-dbc2-36f559fa81aa")
public static String es_PE_FIELD_KnownIssue_Description_Name="Observación";

@XendraTrl(Identifier="7f413881-42e5-6f82-dbc2-36f559fa81aa")
public static String es_PE_FIELD_KnownIssue_Description_Description="Observación";

@XendraTrl(Identifier="7f413881-42e5-6f82-dbc2-36f559fa81aa")
public static String es_PE_FIELD_KnownIssue_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="2399e744-3089-98bc-cd7a-8407b2d26d9f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7f413881-42e5-6f82-dbc2-36f559fa81aa")
public static final String FIELDNAME_KnownIssue_Description="7f413881-42e5-6f82-dbc2-36f559fa81aa";

@XendraTrl(Identifier="db34b5df-d3c8-0478-634b-6ab57b6abe52")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="db34b5df-d3c8-0478-634b-6ab57b6abe52",
Synchronized="2019-08-30 22:23:45.0")
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
@XendraTrl(Identifier="30c25bf5-161c-4514-97bd-ef27d837197e")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="30c25bf5-161c-4514-97bd-ef27d837197e",
Synchronized="2019-08-30 22:23:45.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Issue Status.
@param IssueStatus Current Status of the Issue */
public void setIssueStatus (String IssueStatus)
{
set_Value (COLUMNNAME_IssueStatus, IssueStatus);
}
/** Get Issue Status.
@return Current Status of the Issue */
public String getIssueStatus() 
{
String value = (String)get_Value(COLUMNNAME_IssueStatus);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="6e1a5964-3ebf-c972-fb80-74d3f54bdab4")
public static String es_PE_FIELD_KnownIssue_IssueStatus_Name="Estado de Edición ";

@XendraTrl(Identifier="6e1a5964-3ebf-c972-fb80-74d3f54bdab4")
public static String es_PE_FIELD_KnownIssue_IssueStatus_Description="Estado actual de la Edición";

@XendraTrl(Identifier="6e1a5964-3ebf-c972-fb80-74d3f54bdab4")
public static String es_PE_FIELD_KnownIssue_IssueStatus_Help="Descrpción del Estado Actual de la Edición";

@XendraField(AD_Column_ID="IssueStatus",IsCentrallyMaintained=true,
AD_Tab_ID="2399e744-3089-98bc-cd7a-8407b2d26d9f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6e1a5964-3ebf-c972-fb80-74d3f54bdab4")
public static final String FIELDNAME_KnownIssue_IssueStatus="6e1a5964-3ebf-c972-fb80-74d3f54bdab4";

@XendraTrl(Identifier="dfebf9ac-c57f-f253-918f-8845b1f0a9a5")
public static String es_PE_COLUMN_IssueStatus_Name="Estado de Edición ";

@XendraColumn(AD_Element_ID="473a4da8-9f25-60a0-1320-3517f340f54d",ColumnName="IssueStatus",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dfebf9ac-c57f-f253-918f-8845b1f0a9a5",
Synchronized="2019-08-30 22:23:45.0")
/** Column name IssueStatus */
public static final String COLUMNNAME_IssueStatus = "IssueStatus";
/** Set Issue Summary.
@param IssueSummary Issue Summary */
public void setIssueSummary (String IssueSummary)
{
if (IssueSummary == null) throw new IllegalArgumentException ("IssueSummary is mandatory.");
if (IssueSummary.length() > 255)
{
log.warning("Length > 255 - truncated");
IssueSummary = IssueSummary.substring(0,254);
}
set_Value (COLUMNNAME_IssueSummary, IssueSummary);
}
/** Get Issue Summary.
@return Issue Summary */
public String getIssueSummary() 
{
String value = (String)get_Value(COLUMNNAME_IssueSummary);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d63b0feb-a66e-d35e-fd93-417c905b42ed")
public static String es_PE_FIELD_KnownIssue_IssueSummary_Name="Edición Sumario ";

@XendraTrl(Identifier="d63b0feb-a66e-d35e-fd93-417c905b42ed")
public static String es_PE_FIELD_KnownIssue_IssueSummary_Description="Edición Sumario ";

@XendraField(AD_Column_ID="IssueSummary",IsCentrallyMaintained=true,
AD_Tab_ID="2399e744-3089-98bc-cd7a-8407b2d26d9f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d63b0feb-a66e-d35e-fd93-417c905b42ed")
public static final String FIELDNAME_KnownIssue_IssueSummary="d63b0feb-a66e-d35e-fd93-417c905b42ed";

@XendraTrl(Identifier="391ae6d6-7b63-75c9-9162-3a1d8523d791")
public static String es_PE_COLUMN_IssueSummary_Name="Edición Sumario ";

@XendraColumn(AD_Element_ID="ab895f6f-cac4-a3bd-68cf-26edc358e728",ColumnName="IssueSummary",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="391ae6d6-7b63-75c9-9162-3a1d8523d791",
Synchronized="2019-08-30 22:23:45.0")
/** Column name IssueSummary */
public static final String COLUMNNAME_IssueSummary = "IssueSummary";
/** Set Line.
@param LineNo Line No */
public void setLineNo (int LineNo)
{
set_Value (COLUMNNAME_LineNo, Integer.valueOf(LineNo));
}
/** Get Line.
@return Line No */
public int getLineNo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_LineNo);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="99e83608-f85f-ce6d-4030-6ff0ef19ffb3")
public static String es_PE_FIELD_KnownIssue_Line_Name="Item";

@XendraTrl(Identifier="99e83608-f85f-ce6d-4030-6ff0ef19ffb3")
public static String es_PE_FIELD_KnownIssue_Line_Description="No Item";

@XendraField(AD_Column_ID="LineNo",IsCentrallyMaintained=true,
AD_Tab_ID="2399e744-3089-98bc-cd7a-8407b2d26d9f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=80,SortNo=5,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="99e83608-f85f-ce6d-4030-6ff0ef19ffb3")
public static final String FIELDNAME_KnownIssue_Line="99e83608-f85f-ce6d-4030-6ff0ef19ffb3";

@XendraTrl(Identifier="03f90020-1358-d0c7-7514-22282b3f2f3f")
public static String es_PE_COLUMN_LineNo_Name="Línea";

@XendraColumn(AD_Element_ID="d65a0cd1-ddc9-8ae6-6fdc-2d7a54968ace",ColumnName="LineNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="03f90020-1358-d0c7-7514-22282b3f2f3f",
Synchronized="2019-08-30 22:23:45.0")
/** Column name LineNo */
public static final String COLUMNNAME_LineNo = "LineNo";
/** Set Logger.
@param LoggerName Logger Name */
public void setLoggerName (String LoggerName)
{
if (LoggerName != null && LoggerName.length() > 60)
{
log.warning("Length > 60 - truncated");
LoggerName = LoggerName.substring(0,59);
}
set_Value (COLUMNNAME_LoggerName, LoggerName);
}
/** Get Logger.
@return Logger Name */
public String getLoggerName() 
{
String value = (String)get_Value(COLUMNNAME_LoggerName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c9666943-58f8-b835-b36f-3a9e36be3966")
public static String es_PE_FIELD_KnownIssue_Logger_Name="Historial";

@XendraTrl(Identifier="c9666943-58f8-b835-b36f-3a9e36be3966")
public static String es_PE_FIELD_KnownIssue_Logger_Description="Nombre de Historial";

@XendraField(AD_Column_ID="LoggerName",IsCentrallyMaintained=true,
AD_Tab_ID="2399e744-3089-98bc-cd7a-8407b2d26d9f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=50,SortNo=2,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c9666943-58f8-b835-b36f-3a9e36be3966")
public static final String FIELDNAME_KnownIssue_Logger="c9666943-58f8-b835-b36f-3a9e36be3966";

@XendraTrl(Identifier="9165354a-1cc3-1aa2-9fbd-4bfbb32601c5")
public static String es_PE_COLUMN_LoggerName_Name="Historial";

@XendraColumn(AD_Element_ID="b6d593de-40e4-d9f9-2f4c-efb1f0ccb212",ColumnName="LoggerName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9165354a-1cc3-1aa2-9fbd-4bfbb32601c5",
Synchronized="2019-08-30 22:23:45.0")
/** Column name LoggerName */
public static final String COLUMNNAME_LoggerName = "LoggerName";
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

@XendraTrl(Identifier="34001aee-742f-bf2d-c101-39a9407cac3a")
public static String es_PE_FIELD_KnownIssue_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="2399e744-3089-98bc-cd7a-8407b2d26d9f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="34001aee-742f-bf2d-c101-39a9407cac3a")
public static final String FIELDNAME_KnownIssue_ProcessNow="34001aee-742f-bf2d-c101-39a9407cac3a";

@XendraTrl(Identifier="4ba3533b-dafd-7409-eb5b-320571d24145")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4ba3533b-dafd-7409-eb5b-320571d24145",
Synchronized="2019-08-30 22:23:45.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Release No.
@param ReleaseNo Internal Release Number */
public void setReleaseNo (String ReleaseNo)
{
if (ReleaseNo == null) throw new IllegalArgumentException ("ReleaseNo is mandatory.");
if (ReleaseNo.length() > 4)
{
log.warning("Length > 4 - truncated");
ReleaseNo = ReleaseNo.substring(0,3);
}
set_Value (COLUMNNAME_ReleaseNo, ReleaseNo);
}
/** Get Release No.
@return Internal Release Number */
public String getReleaseNo() 
{
String value = (String)get_Value(COLUMNNAME_ReleaseNo);
if (value == null)
  return "";
return value;
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getReleaseNo());
}

@XendraTrl(Identifier="3c240c15-1ea4-d7f1-ea5d-98908f26f4ad")
public static String es_PE_FIELD_KnownIssue_ReleaseNo_Name="No. Versión ";

@XendraTrl(Identifier="3c240c15-1ea4-d7f1-ea5d-98908f26f4ad")
public static String es_PE_FIELD_KnownIssue_ReleaseNo_Description="Número interno de versión";

@XendraField(AD_Column_ID="ReleaseNo",IsCentrallyMaintained=true,
AD_Tab_ID="2399e744-3089-98bc-cd7a-8407b2d26d9f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=4,IsReadOnly=true,SeqNo=30,SortNo=1,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3c240c15-1ea4-d7f1-ea5d-98908f26f4ad")
public static final String FIELDNAME_KnownIssue_ReleaseNo="3c240c15-1ea4-d7f1-ea5d-98908f26f4ad";

@XendraTrl(Identifier="e8485f01-c0e7-907b-a737-ee4312ffd3d0")
public static String es_PE_COLUMN_ReleaseNo_Name="No. Versión ";

@XendraColumn(AD_Element_ID="f8040f52-b90f-b045-60b4-9605538827a4",ColumnName="ReleaseNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=4,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e8485f01-c0e7-907b-a737-ee4312ffd3d0",
Synchronized="2019-08-30 22:23:45.0")
/** Column name ReleaseNo */
public static final String COLUMNNAME_ReleaseNo = "ReleaseNo";
/** Set Known Issue.
@param R_IssueKnown_ID Known Issue */
public void setR_IssueKnown_ID (int R_IssueKnown_ID)
{
if (R_IssueKnown_ID < 1) throw new IllegalArgumentException ("R_IssueKnown_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_R_IssueKnown_ID, Integer.valueOf(R_IssueKnown_ID));
}
/** Get Known Issue.
@return Known Issue */
public int getR_IssueKnown_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_IssueKnown_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="796965e0-4319-54e0-6b40-9b96ff0778c5")
public static String es_PE_FIELD_KnownIssue_KnownIssue_Name="Edición Conocida";

@XendraTrl(Identifier="796965e0-4319-54e0-6b40-9b96ff0778c5")
public static String es_PE_FIELD_KnownIssue_KnownIssue_Description="Edición Conocida";

@XendraField(AD_Column_ID="R_IssueKnown_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2399e744-3089-98bc-cd7a-8407b2d26d9f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="796965e0-4319-54e0-6b40-9b96ff0778c5")
public static final String FIELDNAME_KnownIssue_KnownIssue="796965e0-4319-54e0-6b40-9b96ff0778c5";
/** Column name R_IssueKnown_ID */
public static final String COLUMNNAME_R_IssueKnown_ID = "R_IssueKnown_ID";
/** Set Issue Recommendation.
@param R_IssueRecommendation_ID Recommendations how to fix an Issue */
public void setR_IssueRecommendation_ID (int R_IssueRecommendation_ID)
{
if (R_IssueRecommendation_ID <= 0) set_Value (COLUMNNAME_R_IssueRecommendation_ID, null);
 else 
set_Value (COLUMNNAME_R_IssueRecommendation_ID, Integer.valueOf(R_IssueRecommendation_ID));
}
/** Get Issue Recommendation.
@return Recommendations how to fix an Issue */
public int getR_IssueRecommendation_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_IssueRecommendation_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b95c7cbb-0d03-5842-1036-0bdc74ecf517")
public static String es_PE_FIELD_KnownIssue_IssueRecommendation_Name="Edición de Recomendación";

@XendraTrl(Identifier="b95c7cbb-0d03-5842-1036-0bdc74ecf517")
public static String es_PE_FIELD_KnownIssue_IssueRecommendation_Description="Recomendaciones cómo fijar una edición";

@XendraTrl(Identifier="b95c7cbb-0d03-5842-1036-0bdc74ecf517")
public static String es_PE_FIELD_KnownIssue_IssueRecommendation_Help="Recomendaciones cómo fijar una edición.";

@XendraField(AD_Column_ID="R_IssueRecommendation_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2399e744-3089-98bc-cd7a-8407b2d26d9f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b95c7cbb-0d03-5842-1036-0bdc74ecf517")
public static final String FIELDNAME_KnownIssue_IssueRecommendation="b95c7cbb-0d03-5842-1036-0bdc74ecf517";

@XendraTrl(Identifier="32699c9a-773f-bf84-6c14-e0f8c16e88d6")
public static String es_PE_COLUMN_R_IssueRecommendation_ID_Name="Edición de Recomendación";

@XendraColumn(AD_Element_ID="27399ffb-446f-2de9-84a6-15209d736bab",
ColumnName="R_IssueRecommendation_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="32699c9a-773f-bf84-6c14-e0f8c16e88d6",Synchronized="2019-08-30 22:23:45.0")
/** Column name R_IssueRecommendation_ID */
public static final String COLUMNNAME_R_IssueRecommendation_ID = "R_IssueRecommendation_ID";
/** Set Issue Status.
@param R_IssueStatus_ID Status of an Issue */
public void setR_IssueStatus_ID (int R_IssueStatus_ID)
{
if (R_IssueStatus_ID <= 0) set_Value (COLUMNNAME_R_IssueStatus_ID, null);
 else 
set_Value (COLUMNNAME_R_IssueStatus_ID, Integer.valueOf(R_IssueStatus_ID));
}
/** Get Issue Status.
@return Status of an Issue */
public int getR_IssueStatus_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_IssueStatus_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4aca4cef-bbba-eb2f-1012-2b43ef4c63f9")
public static String es_PE_FIELD_KnownIssue_IssueStatus2_Name="Estado de Edición ";

@XendraTrl(Identifier="4aca4cef-bbba-eb2f-1012-2b43ef4c63f9")
public static String es_PE_FIELD_KnownIssue_IssueStatus2_Description="Status of an Issue";

@XendraTrl(Identifier="4aca4cef-bbba-eb2f-1012-2b43ef4c63f9")
public static String es_PE_FIELD_KnownIssue_IssueStatus2_Help="Estado de una Edición.";

@XendraField(AD_Column_ID="R_IssueStatus_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2399e744-3089-98bc-cd7a-8407b2d26d9f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4aca4cef-bbba-eb2f-1012-2b43ef4c63f9")
public static final String FIELDNAME_KnownIssue_IssueStatus2="4aca4cef-bbba-eb2f-1012-2b43ef4c63f9";

@XendraTrl(Identifier="5522bd9e-e848-fc7c-8948-d419c4d24c8c")
public static String es_PE_COLUMN_R_IssueStatus_ID_Name="Estado de Edición ";

@XendraColumn(AD_Element_ID="74113aef-6126-d17e-60b9-bef9ed1eb6c4",ColumnName="R_IssueStatus_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5522bd9e-e848-fc7c-8948-d419c4d24c8c",
Synchronized="2019-08-30 22:23:45.0")
/** Column name R_IssueStatus_ID */
public static final String COLUMNNAME_R_IssueStatus_ID = "R_IssueStatus_ID";
/** Set Request.
@param R_Request_ID Request from a Business Partner or Prospect */
public void setR_Request_ID (int R_Request_ID)
{
if (R_Request_ID <= 0) set_Value (COLUMNNAME_R_Request_ID, null);
 else 
set_Value (COLUMNNAME_R_Request_ID, Integer.valueOf(R_Request_ID));
}
/** Get Request.
@return Request from a Business Partner or Prospect */
public int getR_Request_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_Request_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="616a3e02-77ee-727a-b1c6-da091b4584bc")
public static String es_PE_FIELD_KnownIssue_Request_Name="Solicitud";

@XendraTrl(Identifier="616a3e02-77ee-727a-b1c6-da091b4584bc")
public static String es_PE_FIELD_KnownIssue_Request_Description="Solicitud de un socio de negocio ó prospecto.";

@XendraTrl(Identifier="616a3e02-77ee-727a-b1c6-da091b4584bc")
public static String es_PE_FIELD_KnownIssue_Request_Help="La solicitud identifica un requerimiento único de un socio de negocio ó prospecto.";

@XendraField(AD_Column_ID="R_Request_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2399e744-3089-98bc-cd7a-8407b2d26d9f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="616a3e02-77ee-727a-b1c6-da091b4584bc")
public static final String FIELDNAME_KnownIssue_Request="616a3e02-77ee-727a-b1c6-da091b4584bc";

@XendraTrl(Identifier="7bb11d7c-c940-b70f-42ee-10c32db8bfb5")
public static String es_PE_COLUMN_R_Request_ID_Name="Solicitud";

@XendraColumn(AD_Element_ID="8f83a61c-3c9c-841b-466b-9700dd35c0de",ColumnName="R_Request_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7bb11d7c-c940-b70f-42ee-10c32db8bfb5",
Synchronized="2019-08-30 22:23:45.0")
/** Column name R_Request_ID */
public static final String COLUMNNAME_R_Request_ID = "R_Request_ID";
/** Set Source Class.
@param SourceClassName Source Class Name */
public void setSourceClassName (String SourceClassName)
{
if (SourceClassName != null && SourceClassName.length() > 60)
{
log.warning("Length > 60 - truncated");
SourceClassName = SourceClassName.substring(0,59);
}
set_Value (COLUMNNAME_SourceClassName, SourceClassName);
}
/** Get Source Class.
@return Source Class Name */
public String getSourceClassName() 
{
String value = (String)get_Value(COLUMNNAME_SourceClassName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="23360aea-d0b7-9211-8704-20339b624ef8")
public static String es_PE_FIELD_KnownIssue_SourceClass_Name="Clase de Fuente";

@XendraTrl(Identifier="23360aea-d0b7-9211-8704-20339b624ef8")
public static String es_PE_FIELD_KnownIssue_SourceClass_Description="Nombre De la Clase De la Fuente ";

@XendraField(AD_Column_ID="SourceClassName",IsCentrallyMaintained=true,
AD_Tab_ID="2399e744-3089-98bc-cd7a-8407b2d26d9f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=70,SortNo=4,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="23360aea-d0b7-9211-8704-20339b624ef8")
public static final String FIELDNAME_KnownIssue_SourceClass="23360aea-d0b7-9211-8704-20339b624ef8";

@XendraTrl(Identifier="a4f5b17b-8018-8b90-d593-bcb5d5b47351")
public static String es_PE_COLUMN_SourceClassName_Name="Clase de Fuente";

@XendraColumn(AD_Element_ID="ee682afd-0b76-1b81-864b-ef7254e532bd",ColumnName="SourceClassName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a4f5b17b-8018-8b90-d593-bcb5d5b47351",
Synchronized="2019-08-30 22:23:45.0")
/** Column name SourceClassName */
public static final String COLUMNNAME_SourceClassName = "SourceClassName";
/** Set Source Method.
@param SourceMethodName Source Method Name */
public void setSourceMethodName (String SourceMethodName)
{
if (SourceMethodName != null && SourceMethodName.length() > 60)
{
log.warning("Length > 60 - truncated");
SourceMethodName = SourceMethodName.substring(0,59);
}
set_Value (COLUMNNAME_SourceMethodName, SourceMethodName);
}
/** Get Source Method.
@return Source Method Name */
public String getSourceMethodName() 
{
String value = (String)get_Value(COLUMNNAME_SourceMethodName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="65c5455e-8a1f-8124-9014-b79c8445d3de")
public static String es_PE_FIELD_KnownIssue_SourceMethod_Name="Método de Fuente";

@XendraTrl(Identifier="65c5455e-8a1f-8124-9014-b79c8445d3de")
public static String es_PE_FIELD_KnownIssue_SourceMethod_Description="Nombre Método de Fuente";

@XendraField(AD_Column_ID="SourceMethodName",IsCentrallyMaintained=true,
AD_Tab_ID="2399e744-3089-98bc-cd7a-8407b2d26d9f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=60,SortNo=3,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="65c5455e-8a1f-8124-9014-b79c8445d3de")
public static final String FIELDNAME_KnownIssue_SourceMethod="65c5455e-8a1f-8124-9014-b79c8445d3de";

@XendraTrl(Identifier="d2b362fb-c4d1-e82b-5bbc-5492f0c33340")
public static String es_PE_COLUMN_SourceMethodName_Name="Método de Fuente";

@XendraColumn(AD_Element_ID="c8f923ba-42fd-65b8-bf15-8f7d5b2d78ca",ColumnName="SourceMethodName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d2b362fb-c4d1-e82b-5bbc-5492f0c33340",
Synchronized="2019-08-30 22:23:45.0")
/** Column name SourceMethodName */
public static final String COLUMNNAME_SourceMethodName = "SourceMethodName";
}
