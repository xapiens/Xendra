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
/** Generated Model for r_issuekcurrent_timestampn
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_r_issuekcurrent_timestampn extends PO
{
/** Standard Constructor
@param ctx context
@param r_issuekcurrent_timestampn_ID id
@param trxName transaction
*/
public X_r_issuekcurrent_timestampn (Properties ctx, int r_issuekcurrent_timestampn_ID, String trxName)
{
super (ctx, r_issuekcurrent_timestampn_ID, trxName);
/** if (r_issuekcurrent_timestampn_ID == 0)
{
setIssueSummary (null);
setReleaseNo (null);
setr_issuekcurrent_timestampn_id (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_r_issuekcurrent_timestampn (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000235 */
public static int Table_ID=MTable.getTable_ID("r_issuekcurrent_timestampn");

@XendraTrl(Identifier="fa942815-c033-c4a4-496a-b6e27a7733bb")
public static String es_PE_TABLE_r_issuekcurrent_timestampn_Name="r_issuekcurrent_timestampn";


@XendraTable(Name="r_issuekcurrent_timestampn",Description="",Help="",
TableName="r_issuekcurrent_timestampn",AccessLevel="4",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=false,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="fa942815-c033-c4a4-496a-b6e27a7733bb",Synchronized="2017-08-16 11:43:48.0")
/** TableName=r_issuekcurrent_timestampn */
public static final String Table_Name="r_issuekcurrent_timestampn";


@XendraIndex(Name="r_kcurrent_timestampnissue_alt",
Identifier="cc6e3186-dbe4-86e7-1e61-1c7ed274d173",
Column_Names="issuesummary, releaseno, sourceclassname, sourcemethodname, loggername, lineno",
IsUnique="true",TableIdentifier="cc6e3186-dbe4-86e7-1e61-1c7ed274d173",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_r_kcurrent_timestampnissue_alt = "cc6e3186-dbe4-86e7-1e61-1c7ed274d173";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"r_issuekcurrent_timestampn");

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
    Table_ID = MTable.getTable_ID("r_issuekcurrent_timestampn");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_r_issuekcurrent_timestampn[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="b6f29075-52b0-7460-0bc7-b5e50cb56a69")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b6f29075-52b0-7460-0bc7-b5e50cb56a69",
Synchronized="2017-08-05 16:55:49.0")
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
@XendraTrl(Identifier="1cdc6055-ae0c-4834-aff8-e45ee4feeb20")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1cdc6055-ae0c-4834-aff8-e45ee4feeb20",
Synchronized="2017-08-05 16:55:49.0")
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
@XendraTrl(Identifier="55058f50-b5e9-56c1-85f8-5fa00270740d")
public static String es_PE_COLUMN_IssueStatus_Name="Issue Status";

@XendraColumn(AD_Element_ID="473a4da8-9f25-60a0-1320-3517f340f54d",ColumnName="IssueStatus",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="55058f50-b5e9-56c1-85f8-5fa00270740d",
Synchronized="2017-08-05 16:55:49.0")
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
@XendraTrl(Identifier="5958f8b9-1519-e9d9-86d3-32c9d67e2fa0")
public static String es_PE_COLUMN_IssueSummary_Name="Issue Summary";

@XendraColumn(AD_Element_ID="ab895f6f-cac4-a3bd-68cf-26edc358e728",ColumnName="IssueSummary",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5958f8b9-1519-e9d9-86d3-32c9d67e2fa0",
Synchronized="2017-08-05 16:55:49.0")
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

@XendraTrl(Identifier="7a5166d2-69ae-8934-a8f3-20525df37c69")
public static String es_PE_COLUMN_LineNo_Name="Line";

@XendraColumn(AD_Element_ID="d65a0cd1-ddc9-8ae6-6fdc-2d7a54968ace",ColumnName="LineNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7a5166d2-69ae-8934-a8f3-20525df37c69",
Synchronized="2017-08-05 16:55:49.0")
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
@XendraTrl(Identifier="aea3c381-56d5-209f-7f42-576439adc46e")
public static String es_PE_COLUMN_LoggerName_Name="Logger";

@XendraColumn(AD_Element_ID="b6d593de-40e4-d9f9-2f4c-efb1f0ccb212",ColumnName="LoggerName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aea3c381-56d5-209f-7f42-576439adc46e",
Synchronized="2017-08-05 16:55:49.0")
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

@XendraTrl(Identifier="e376e19d-5041-39d1-a892-0da56547fb57")
public static String es_PE_COLUMN_Processing_Name="Process Now";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e376e19d-5041-39d1-a892-0da56547fb57",
Synchronized="2017-08-05 16:55:49.0")
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
@XendraTrl(Identifier="34b2dba1-3ddc-b784-ca35-f0c0017e73ed")
public static String es_PE_COLUMN_ReleaseNo_Name="Release No";

@XendraColumn(AD_Element_ID="f8040f52-b90f-b045-60b4-9605538827a4",ColumnName="ReleaseNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=4,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="34b2dba1-3ddc-b784-ca35-f0c0017e73ed",
Synchronized="2017-08-05 16:55:49.0")
/** Column name ReleaseNo */
public static final String COLUMNNAME_ReleaseNo = "ReleaseNo";
/** Set r_issuekcurrent_timestampn_id.
@param r_issuekcurrent_timestampn_id r_issuekcurrent_timestampn_id */
public void setr_issuekcurrent_timestampn_id (int r_issuekcurrent_timestampn_id)
{
set_ValueNoCheck (COLUMNNAME_r_issuekcurrent_timestampn_id, Integer.valueOf(r_issuekcurrent_timestampn_id));
}
/** Get r_issuekcurrent_timestampn_id.
@return r_issuekcurrent_timestampn_id */
public int getr_issuekcurrent_timestampn_id() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_r_issuekcurrent_timestampn_id);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name r_issuekcurrent_timestampn_id */
public static final String COLUMNNAME_r_issuekcurrent_timestampn_id = "r_issuekcurrent_timestampn_id";
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

@XendraTrl(Identifier="4ecc84ba-dc44-292d-6e85-5079b94a2487")
public static String es_PE_COLUMN_R_IssueRecommendation_ID_Name="Issue Recommendation";

@XendraColumn(AD_Element_ID="27399ffb-446f-2de9-84a6-15209d736bab",
ColumnName="R_IssueRecommendation_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4ecc84ba-dc44-292d-6e85-5079b94a2487",Synchronized="2017-08-05 16:55:49.0")
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

@XendraTrl(Identifier="9c37edd7-23df-b6fa-9284-d43bb1d2815a")
public static String es_PE_COLUMN_R_IssueStatus_ID_Name="Issue Status";

@XendraColumn(AD_Element_ID="74113aef-6126-d17e-60b9-bef9ed1eb6c4",ColumnName="R_IssueStatus_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9c37edd7-23df-b6fa-9284-d43bb1d2815a",
Synchronized="2017-08-05 16:55:49.0")
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

@XendraTrl(Identifier="60356a2b-fde0-a35d-30bd-af3d3e4d2ff7")
public static String es_PE_COLUMN_R_Request_ID_Name="Request";

@XendraColumn(AD_Element_ID="8f83a61c-3c9c-841b-466b-9700dd35c0de",ColumnName="R_Request_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="60356a2b-fde0-a35d-30bd-af3d3e4d2ff7",
Synchronized="2017-08-05 16:55:49.0")
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
@XendraTrl(Identifier="27e03c4c-2f6b-d652-bba5-46f3608d2ffd")
public static String es_PE_COLUMN_SourceClassName_Name="Source Class";

@XendraColumn(AD_Element_ID="ee682afd-0b76-1b81-864b-ef7254e532bd",ColumnName="SourceClassName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="27e03c4c-2f6b-d652-bba5-46f3608d2ffd",
Synchronized="2017-08-05 16:55:49.0")
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
@XendraTrl(Identifier="8136fddf-aafd-cb17-2a8d-70ae887b18bd")
public static String es_PE_COLUMN_SourceMethodName_Name="Source Method";

@XendraColumn(AD_Element_ID="c8f923ba-42fd-65b8-bf15-8f7d5b2d78ca",ColumnName="SourceMethodName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8136fddf-aafd-cb17-2a8d-70ae887b18bd",
Synchronized="2017-08-05 16:55:49.0")
/** Column name SourceMethodName */
public static final String COLUMNNAME_SourceMethodName = "SourceMethodName";
}
