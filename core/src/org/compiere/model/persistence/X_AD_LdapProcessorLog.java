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
/** Generated Model for AD_LdapProcessorLog
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_LdapProcessorLog extends PO
{
/** Standard Constructor
@param ctx context
@param AD_LdapProcessorLog_ID id
@param trxName transaction
*/
public X_AD_LdapProcessorLog (Properties ctx, int AD_LdapProcessorLog_ID, String trxName)
{
super (ctx, AD_LdapProcessorLog_ID, trxName);
/** if (AD_LdapProcessorLog_ID == 0)
{
setAD_LdapProcessor_ID (0);
setAD_LdapProcessorLog_ID (0);
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
public X_AD_LdapProcessorLog (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=903 */
public static int Table_ID=MTable.getTable_ID("AD_LdapProcessorLog");

@XendraTrl(Identifier="c2988c72-9adf-6838-f47d-e40bf8c7e277")
public static String es_PE_TAB_LDAPServerLog_Description="Log of the LDAP Server";

@XendraTrl(Identifier="c2988c72-9adf-6838-f47d-e40bf8c7e277")
public static String es_PE_TAB_LDAPServerLog_Name="LDAP Server Log";

@XendraTab(Name="LDAP Server Log",Description="Log of the LDAP Server",Help="",
AD_Window_ID="b45775b7-8403-9bf8-5c4b-5c1f444c8e82",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="c2988c72-9adf-6838-f47d-e40bf8c7e277",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_LDAPServerLog="c2988c72-9adf-6838-f47d-e40bf8c7e277";

@XendraTrl(Identifier="ed8fb781-1359-16a6-d349-271901f358b9")
public static String es_PE_TABLE_AD_LdapProcessorLog_Name="Ldap Processor Log";

@XendraTable(Name="Ldap Processor Log",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="LDAP Server Log",Help="",
TableName="AD_LdapProcessorLog",AccessLevel="4",
AD_Window_ID="b45775b7-8403-9bf8-5c4b-5c1f444c8e82",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.dictionary",Identifier="ed8fb781-1359-16a6-d349-271901f358b9",
Synchronized="2020-03-03 21:35:07.0")
/** TableName=AD_LdapProcessorLog */
public static final String Table_Name="AD_LdapProcessorLog";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_LdapProcessorLog");

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
    Table_ID = MTable.getTable_ID("AD_LdapProcessorLog");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_LdapProcessorLog[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Ldap Processor.
@param AD_LdapProcessor_ID LDAP Server to authenticate and authorize external systems based on Adempiere */
public void setAD_LdapProcessor_ID (int AD_LdapProcessor_ID)
{
if (AD_LdapProcessor_ID < 1) throw new IllegalArgumentException ("AD_LdapProcessor_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_LdapProcessor_ID, Integer.valueOf(AD_LdapProcessor_ID));
}
/** Get Ldap Processor.
@return LDAP Server to authenticate and authorize external systems based on Adempiere */
public int getAD_LdapProcessor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_LdapProcessor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7fea9b5e-6211-e321-a514-3b01a6c74bde")
public static String es_PE_FIELD_LDAPServerLog_LdapProcessor_Name="Ldap Processor";

@XendraTrl(Identifier="7fea9b5e-6211-e321-a514-3b01a6c74bde")
public static String es_PE_FIELD_LDAPServerLog_LdapProcessor_Description="LDAP Server to authenticate and authorize external systems based on Adempiere";

@XendraTrl(Identifier="7fea9b5e-6211-e321-a514-3b01a6c74bde")
public static String es_PE_FIELD_LDAPServerLog_LdapProcessor_Help="The LDAP Server allows third party software (e.g. Apache) to use the users defined in the system to authentificate and authorize them.  There is only one server per Adempiere system.  The \"o\" is the Client key and the optional \"ou\" is the Interest Area key.";

@XendraField(AD_Column_ID="AD_LdapProcessor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2988c72-9adf-6838-f47d-e40bf8c7e277",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7fea9b5e-6211-e321-a514-3b01a6c74bde")
public static final String FIELDNAME_LDAPServerLog_LdapProcessor="7fea9b5e-6211-e321-a514-3b01a6c74bde";

@XendraTrl(Identifier="65affa37-f6ff-4301-aef1-b1172ae32b69")
public static String es_PE_COLUMN_AD_LdapProcessor_ID_Name="Ldap Processor";

@XendraColumn(AD_Element_ID="4bf30b73-bd3a-0b2d-0cae-9bd0ac299eb8",
ColumnName="AD_LdapProcessor_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="65affa37-f6ff-4301-aef1-b1172ae32b69",Synchronized="2019-08-30 22:20:26.0")
/** Column name AD_LdapProcessor_ID */
public static final String COLUMNNAME_AD_LdapProcessor_ID = "AD_LdapProcessor_ID";
/** Set Ldap Processor Log.
@param AD_LdapProcessorLog_ID LDAP Server Log */
public void setAD_LdapProcessorLog_ID (int AD_LdapProcessorLog_ID)
{
if (AD_LdapProcessorLog_ID < 1) throw new IllegalArgumentException ("AD_LdapProcessorLog_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_LdapProcessorLog_ID, Integer.valueOf(AD_LdapProcessorLog_ID));
}
/** Get Ldap Processor Log.
@return LDAP Server Log */
public int getAD_LdapProcessorLog_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_LdapProcessorLog_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="bea43497-524e-fc54-5f0f-0f5156b0a351")
public static String es_PE_FIELD_LDAPServerLog_LdapProcessorLog_Name="Ldap Processor Log";

@XendraTrl(Identifier="bea43497-524e-fc54-5f0f-0f5156b0a351")
public static String es_PE_FIELD_LDAPServerLog_LdapProcessorLog_Description="LDAP Server Log";

@XendraField(AD_Column_ID="AD_LdapProcessorLog_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2988c72-9adf-6838-f47d-e40bf8c7e277",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bea43497-524e-fc54-5f0f-0f5156b0a351")
public static final String FIELDNAME_LDAPServerLog_LdapProcessorLog="bea43497-524e-fc54-5f0f-0f5156b0a351";
/** Column name AD_LdapProcessorLog_ID */
public static final String COLUMNNAME_AD_LdapProcessorLog_ID = "AD_LdapProcessorLog_ID";
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

@XendraTrl(Identifier="2448fe8c-f9df-00a6-69eb-3cb085621d17")
public static String es_PE_FIELD_LDAPServerLog_Description_Name="Observación";

@XendraTrl(Identifier="2448fe8c-f9df-00a6-69eb-3cb085621d17")
public static String es_PE_FIELD_LDAPServerLog_Description_Description="Observación";

@XendraTrl(Identifier="2448fe8c-f9df-00a6-69eb-3cb085621d17")
public static String es_PE_FIELD_LDAPServerLog_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="c2988c72-9adf-6838-f47d-e40bf8c7e277",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2448fe8c-f9df-00a6-69eb-3cb085621d17")
public static final String FIELDNAME_LDAPServerLog_Description="2448fe8c-f9df-00a6-69eb-3cb085621d17";

@XendraTrl(Identifier="a8b7c85c-cf7a-5f2f-151f-5bd2e7fd5ce3")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a8b7c85c-cf7a-5f2f-151f-5bd2e7fd5ce3",
Synchronized="2019-08-30 22:20:26.0")
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
@XendraTrl(Identifier="109aecac-7ab3-4c4b-90f4-a626b39d78c8")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="109aecac-7ab3-4c4b-90f4-a626b39d78c8",
Synchronized="2019-08-30 22:20:26.0")
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

@XendraTrl(Identifier="012eedad-56ea-f461-eb9b-e951c551064c")
public static String es_PE_FIELD_LDAPServerLog_Error_Name="Error";

@XendraTrl(Identifier="012eedad-56ea-f461-eb9b-e951c551064c")
public static String es_PE_FIELD_LDAPServerLog_Error_Description="Un error ocurrío en la ejecución.";

@XendraField(AD_Column_ID="IsError",IsCentrallyMaintained=true,
AD_Tab_ID="c2988c72-9adf-6838-f47d-e40bf8c7e277",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="012eedad-56ea-f461-eb9b-e951c551064c")
public static final String FIELDNAME_LDAPServerLog_Error="012eedad-56ea-f461-eb9b-e951c551064c";

@XendraTrl(Identifier="1d37de66-1a41-3a73-e6f8-ba78d693576d")
public static String es_PE_COLUMN_IsError_Name="Error";

@XendraColumn(AD_Element_ID="7a82e2b2-c09d-83e6-f469-1f1d9bae65a7",ColumnName="IsError",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1d37de66-1a41-3a73-e6f8-ba78d693576d",
Synchronized="2019-08-30 22:20:26.0")
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
@XendraTrl(Identifier="6980394f-80d2-fe5c-cd51-8a22e4eb1667")
public static String es_PE_FIELD_LDAPServerLog_Reference_Name="Referencia";

@XendraTrl(Identifier="6980394f-80d2-fe5c-cd51-8a22e4eb1667")
public static String es_PE_FIELD_LDAPServerLog_Reference_Description="Referencia para este registro";

@XendraTrl(Identifier="6980394f-80d2-fe5c-cd51-8a22e4eb1667")
public static String es_PE_FIELD_LDAPServerLog_Reference_Help="La referencia despliega el número del documento fuente";

@XendraField(AD_Column_ID="Reference",IsCentrallyMaintained=true,
AD_Tab_ID="c2988c72-9adf-6838-f47d-e40bf8c7e277",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6980394f-80d2-fe5c-cd51-8a22e4eb1667")
public static final String FIELDNAME_LDAPServerLog_Reference="6980394f-80d2-fe5c-cd51-8a22e4eb1667";

@XendraTrl(Identifier="927bcc7e-ea2c-71cf-e6bc-ca4da8915e9c")
public static String es_PE_COLUMN_Reference_Name="Referencia";

@XendraColumn(AD_Element_ID="eba276ea-db21-0cfa-29e6-6e0d45ebff99",ColumnName="Reference",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="927bcc7e-ea2c-71cf-e6bc-ca4da8915e9c",
Synchronized="2019-08-30 22:20:26.0")
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
@XendraTrl(Identifier="fcd7556f-5eec-d90c-31d7-1babfa14f2ce")
public static String es_PE_FIELD_LDAPServerLog_Summary_Name="Resúmen";

@XendraTrl(Identifier="fcd7556f-5eec-d90c-31d7-1babfa14f2ce")
public static String es_PE_FIELD_LDAPServerLog_Summary_Description="Resúmen textual de esta solicitud";

@XendraTrl(Identifier="fcd7556f-5eec-d90c-31d7-1babfa14f2ce")
public static String es_PE_FIELD_LDAPServerLog_Summary_Help="El resúmen permite texto en formato libre sobre esta solicitud.";

@XendraField(AD_Column_ID="Summary",IsCentrallyMaintained=true,
AD_Tab_ID="c2988c72-9adf-6838-f47d-e40bf8c7e277",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fcd7556f-5eec-d90c-31d7-1babfa14f2ce")
public static final String FIELDNAME_LDAPServerLog_Summary="fcd7556f-5eec-d90c-31d7-1babfa14f2ce";

@XendraTrl(Identifier="f3c764ff-a5bc-8b36-e3d3-fb2a56be2432")
public static String es_PE_COLUMN_Summary_Name="Resúmen";

@XendraColumn(AD_Element_ID="94fe105c-8853-7c06-a32a-9ad75a452917",ColumnName="Summary",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f3c764ff-a5bc-8b36-e3d3-fb2a56be2432",
Synchronized="2019-08-30 22:20:26.0")
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
@XendraTrl(Identifier="098d5c7d-5a69-d56b-fe2e-3bc0ae9d7a25")
public static String es_PE_FIELD_LDAPServerLog_TextMessage_Name="Mensaje de texto";

@XendraTrl(Identifier="098d5c7d-5a69-d56b-fe2e-3bc0ae9d7a25")
public static String es_PE_FIELD_LDAPServerLog_TextMessage_Description="Mensaje de texto";

@XendraField(AD_Column_ID="TextMsg",IsCentrallyMaintained=true,
AD_Tab_ID="c2988c72-9adf-6838-f47d-e40bf8c7e277",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="098d5c7d-5a69-d56b-fe2e-3bc0ae9d7a25")
public static final String FIELDNAME_LDAPServerLog_TextMessage="098d5c7d-5a69-d56b-fe2e-3bc0ae9d7a25";

@XendraTrl(Identifier="37fe6fff-b09e-5571-8823-4ab84cf6a8c4")
public static String es_PE_COLUMN_TextMsg_Name="Mensaje de texto";

@XendraColumn(AD_Element_ID="377bebfe-238a-1c79-c1a9-13afa4448222",ColumnName="TextMsg",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="37fe6fff-b09e-5571-8823-4ab84cf6a8c4",
Synchronized="2019-08-30 22:20:26.0")
/** Column name TextMsg */
public static final String COLUMNNAME_TextMsg = "TextMsg";
}
