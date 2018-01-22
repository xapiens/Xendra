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
/** Generated Model for W_Click
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_W_Click extends PO
{
/** Standard Constructor
@param ctx context
@param W_Click_ID id
@param trxName transaction
*/
public X_W_Click (Properties ctx, int W_Click_ID, String trxName)
{
super (ctx, W_Click_ID, trxName);
/** if (W_Click_ID == 0)
{
setProcessed (false);	
// N
setW_Click_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_W_Click (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=550 */
public static int Table_ID=MTable.getTable_ID("W_Click");

@XendraTrl(Identifier="820165f9-d9de-d767-4108-6671371a4ae6")
public static String es_PE_TAB_IndividualClick_Name="Clic Individual";

@XendraTab(Name="Individual Click",Description="Details of someone clicking on the link",Help="",
AD_Window_ID="03db8034-9fa0-fcc4-bab8-b9e48ee18661",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="820165f9-d9de-d767-4108-6671371a4ae6",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_IndividualClick="820165f9-d9de-d767-4108-6671371a4ae6";

@XendraTrl(Identifier="1a13df36-1289-dadb-297d-ccf16433befa")
public static String es_PE_TABLE_W_Click_Name="Web Click";

@XendraTable(Name="Web Click",Description="Individual Web Click",Help="",TableName="W_Click",
AccessLevel="3",AD_Window_ID="03db8034-9fa0-fcc4-bab8-b9e48ee18661",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="1a13df36-1289-dadb-297d-ccf16433befa",Synchronized="2017-08-16 11:44:28.0")
/** TableName=W_Click */
public static final String Table_Name="W_Click";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"W_Click");

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
    Table_ID = MTable.getTable_ID("W_Click");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_W_Click[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Accept Language.
@param AcceptLanguage Language accepted based on browser information */
public void setAcceptLanguage (String AcceptLanguage)
{
if (AcceptLanguage != null && AcceptLanguage.length() > 60)
{
log.warning("Length > 60 - truncated");
AcceptLanguage = AcceptLanguage.substring(0,59);
}
set_Value (COLUMNNAME_AcceptLanguage, AcceptLanguage);
}
/** Get Accept Language.
@return Language accepted based on browser information */
public String getAcceptLanguage() 
{
String value = (String)get_Value(COLUMNNAME_AcceptLanguage);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="efb72f03-beb8-001d-7aeb-ed867d033e51")
public static String es_PE_FIELD_IndividualClick_AcceptLanguage_Description="Lenguaje aceptado en información de paginadores";

@XendraTrl(Identifier="efb72f03-beb8-001d-7aeb-ed867d033e51")
public static String es_PE_FIELD_IndividualClick_AcceptLanguage_Help="Indica si acepta el lenguaje en información de paginadores.";

@XendraTrl(Identifier="efb72f03-beb8-001d-7aeb-ed867d033e51")
public static String es_PE_FIELD_IndividualClick_AcceptLanguage_Name="Aceptar Lenguaje";

@XendraField(AD_Column_ID="AcceptLanguage",IsCentrallyMaintained=true,
AD_Tab_ID="820165f9-d9de-d767-4108-6671371a4ae6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="efb72f03-beb8-001d-7aeb-ed867d033e51")
public static final String FIELDNAME_IndividualClick_AcceptLanguage="efb72f03-beb8-001d-7aeb-ed867d033e51";

@XendraTrl(Identifier="ed14ddc7-8075-3acc-88bc-b72d34b9fff8")
public static String es_PE_COLUMN_AcceptLanguage_Name="Aceptar Lenguaje";

@XendraColumn(AD_Element_ID="b5a6a8c8-e3ab-7bc5-a9c1-82035b78da62",ColumnName="AcceptLanguage",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ed14ddc7-8075-3acc-88bc-b72d34b9fff8",
Synchronized="2017-08-05 16:56:31.0")
/** Column name AcceptLanguage */
public static final String COLUMNNAME_AcceptLanguage = "AcceptLanguage";
/** Set User/Contact.
@param AD_User_ID User within the system - Internal or Business Partner Contact */
public void setAD_User_ID (int AD_User_ID)
{
if (AD_User_ID <= 0) set_Value (COLUMNNAME_AD_User_ID, null);
 else 
set_Value (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
}
/** Get User/Contact.
@return User within the system - Internal or Business Partner Contact */
public int getAD_User_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="46ef8f3f-e4d6-1c4e-7fad-a93575f6ca31")
public static String es_PE_FIELD_IndividualClick_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="46ef8f3f-e4d6-1c4e-7fad-a93575f6ca31")
public static String es_PE_FIELD_IndividualClick_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="46ef8f3f-e4d6-1c4e-7fad-a93575f6ca31")
public static String es_PE_FIELD_IndividualClick_UserContact_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="820165f9-d9de-d767-4108-6671371a4ae6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="46ef8f3f-e4d6-1c4e-7fad-a93575f6ca31")
public static final String FIELDNAME_IndividualClick_UserContact="46ef8f3f-e4d6-1c4e-7fad-a93575f6ca31";

@XendraTrl(Identifier="a7ecd157-7757-df83-2509-2df99088cb83")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=13,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a7ecd157-7757-df83-2509-2df99088cb83",
Synchronized="2017-08-05 16:56:31.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set EMail Address.
@param EMail Electronic Mail Address */
public void setEMail (String EMail)
{
if (EMail != null && EMail.length() > 60)
{
log.warning("Length > 60 - truncated");
EMail = EMail.substring(0,59);
}
set_Value (COLUMNNAME_EMail, EMail);
}
/** Get EMail Address.
@return Electronic Mail Address */
public String getEMail() 
{
String value = (String)get_Value(COLUMNNAME_EMail);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c6a0052b-06d1-359e-5224-b89a9999f0a1")
public static String es_PE_FIELD_IndividualClick_EMailAddress_Description="ID de correo electrónico";

@XendraTrl(Identifier="c6a0052b-06d1-359e-5224-b89a9999f0a1")
public static String es_PE_FIELD_IndividualClick_EMailAddress_Help="El Email indica la ID de correo electrónico para este usuario";

@XendraTrl(Identifier="c6a0052b-06d1-359e-5224-b89a9999f0a1")
public static String es_PE_FIELD_IndividualClick_EMailAddress_Name="Email";

@XendraField(AD_Column_ID="EMail",IsCentrallyMaintained=true,
AD_Tab_ID="820165f9-d9de-d767-4108-6671371a4ae6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c6a0052b-06d1-359e-5224-b89a9999f0a1")
public static final String FIELDNAME_IndividualClick_EMailAddress="c6a0052b-06d1-359e-5224-b89a9999f0a1";

@XendraTrl(Identifier="61019083-2815-aeb4-8ee8-5fe6237a6cf8")
public static String es_PE_COLUMN_EMail_Name="Email";

@XendraColumn(AD_Element_ID="d18b300c-9ad6-2dd2-36d3-b65969743158",ColumnName="EMail",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="61019083-2815-aeb4-8ee8-5fe6237a6cf8",
Synchronized="2017-08-05 16:56:31.0")
/** Column name EMail */
public static final String COLUMNNAME_EMail = "EMail";
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
@XendraTrl(Identifier="6ad10e87-722d-465b-8f1e-b95d7989ed41")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6ad10e87-722d-465b-8f1e-b95d7989ed41",
Synchronized="2017-08-05 16:56:31.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Processed.
@param Processed The document has been processed */
public void setProcessed (boolean Processed)
{
set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
}
/** Get Processed.
@return The document has been processed */
public boolean isProcessed() 
{
Object oo = get_Value(COLUMNNAME_Processed);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="53689287-a5f7-8f41-bd26-c3ce83828cbe")
public static String es_PE_FIELD_IndividualClick_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="53689287-a5f7-8f41-bd26-c3ce83828cbe")
public static String es_PE_FIELD_IndividualClick_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="53689287-a5f7-8f41-bd26-c3ce83828cbe")
public static String es_PE_FIELD_IndividualClick_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="820165f9-d9de-d767-4108-6671371a4ae6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="53689287-a5f7-8f41-bd26-c3ce83828cbe")
public static final String FIELDNAME_IndividualClick_Processed="53689287-a5f7-8f41-bd26-c3ce83828cbe";

@XendraTrl(Identifier="251ac65e-8647-1f94-5865-38142ca64413")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="251ac65e-8647-1f94-5865-38142ca64413",
Synchronized="2017-08-05 16:56:31.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set Referrer.
@param Referrer Referring web address */
public void setReferrer (String Referrer)
{
if (Referrer != null && Referrer.length() > 120)
{
log.warning("Length > 120 - truncated");
Referrer = Referrer.substring(0,119);
}
set_Value (COLUMNNAME_Referrer, Referrer);
}
/** Get Referrer.
@return Referring web address */
public String getReferrer() 
{
String value = (String)get_Value(COLUMNNAME_Referrer);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="550ec324-3b4c-13b4-d40d-7d1092d8cc76")
public static String es_PE_FIELD_IndividualClick_Referrer_Description="Dirección web de referencia";

@XendraTrl(Identifier="550ec324-3b4c-13b4-d40d-7d1092d8cc76")
public static String es_PE_FIELD_IndividualClick_Referrer_Name="Referencia";

@XendraField(AD_Column_ID="Referrer",IsCentrallyMaintained=true,
AD_Tab_ID="820165f9-d9de-d767-4108-6671371a4ae6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="550ec324-3b4c-13b4-d40d-7d1092d8cc76")
public static final String FIELDNAME_IndividualClick_Referrer="550ec324-3b4c-13b4-d40d-7d1092d8cc76";

@XendraTrl(Identifier="767e865c-1308-f971-4659-4f1642f7926d")
public static String es_PE_COLUMN_Referrer_Name="Referencia";

@XendraColumn(AD_Element_ID="f47f85cc-8a02-b91f-3a82-fb6f10d6169e",ColumnName="Referrer",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="767e865c-1308-f971-4659-4f1642f7926d",
Synchronized="2017-08-05 16:56:31.0")
/** Column name Referrer */
public static final String COLUMNNAME_Referrer = "Referrer";
/** Set Remote Addr.
@param Remote_Addr Remote Address */
public void setRemote_Addr (String Remote_Addr)
{
if (Remote_Addr != null && Remote_Addr.length() > 60)
{
log.warning("Length > 60 - truncated");
Remote_Addr = Remote_Addr.substring(0,59);
}
set_Value (COLUMNNAME_Remote_Addr, Remote_Addr);
}
/** Get Remote Addr.
@return Remote Address */
public String getRemote_Addr() 
{
String value = (String)get_Value(COLUMNNAME_Remote_Addr);
if (value == null)
  return "";
return value;
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getRemote_Addr());
}

@XendraTrl(Identifier="7090f9b8-4b8c-f6df-2d8e-3c7ece492548")
public static String es_PE_FIELD_IndividualClick_RemoteAddr_Description="Dirección remota";

@XendraTrl(Identifier="7090f9b8-4b8c-f6df-2d8e-3c7ece492548")
public static String es_PE_FIELD_IndividualClick_RemoteAddr_Help="La dirección remota indica una dirección alternativa ó externa";

@XendraTrl(Identifier="7090f9b8-4b8c-f6df-2d8e-3c7ece492548")
public static String es_PE_FIELD_IndividualClick_RemoteAddr_Name="Dirección Remota";

@XendraField(AD_Column_ID="Remote_Addr",IsCentrallyMaintained=true,
AD_Tab_ID="820165f9-d9de-d767-4108-6671371a4ae6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7090f9b8-4b8c-f6df-2d8e-3c7ece492548")
public static final String FIELDNAME_IndividualClick_RemoteAddr="7090f9b8-4b8c-f6df-2d8e-3c7ece492548";

@XendraTrl(Identifier="d5298537-1d79-0af2-f276-dc079a535193")
public static String es_PE_COLUMN_Remote_Addr_Name="Dirección Remota";

@XendraColumn(AD_Element_ID="b1551fd7-ca8d-4a87-8302-e41caf5553d6",ColumnName="Remote_Addr",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d5298537-1d79-0af2-f276-dc079a535193",
Synchronized="2017-08-05 16:56:32.0")
/** Column name Remote_Addr */
public static final String COLUMNNAME_Remote_Addr = "Remote_Addr";
/** Set Remote Host.
@param Remote_Host Remote host Info */
public void setRemote_Host (String Remote_Host)
{
if (Remote_Host != null && Remote_Host.length() > 120)
{
log.warning("Length > 120 - truncated");
Remote_Host = Remote_Host.substring(0,119);
}
set_Value (COLUMNNAME_Remote_Host, Remote_Host);
}
/** Get Remote Host.
@return Remote host Info */
public String getRemote_Host() 
{
String value = (String)get_Value(COLUMNNAME_Remote_Host);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a29b7485-806d-3cf4-e2fc-1dc5f93f142d")
public static String es_PE_FIELD_IndividualClick_RemoteHost_Name="Host Remoto";

@XendraField(AD_Column_ID="Remote_Host",IsCentrallyMaintained=true,
AD_Tab_ID="820165f9-d9de-d767-4108-6671371a4ae6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a29b7485-806d-3cf4-e2fc-1dc5f93f142d")
public static final String FIELDNAME_IndividualClick_RemoteHost="a29b7485-806d-3cf4-e2fc-1dc5f93f142d";

@XendraTrl(Identifier="a7e8ef3e-1b01-2e88-e30a-996ba3c12d52")
public static String es_PE_COLUMN_Remote_Host_Name="Host Remoto";

@XendraColumn(AD_Element_ID="eb636ff7-fd5e-fa57-d640-f766bf4e52b2",ColumnName="Remote_Host",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a7e8ef3e-1b01-2e88-e30a-996ba3c12d52",
Synchronized="2017-08-05 16:56:32.0")
/** Column name Remote_Host */
public static final String COLUMNNAME_Remote_Host = "Remote_Host";
/** Set Target URL.
@param TargetURL URL for the Target */
public void setTargetURL (String TargetURL)
{
if (TargetURL != null && TargetURL.length() > 120)
{
log.warning("Length > 120 - truncated");
TargetURL = TargetURL.substring(0,119);
}
set_Value (COLUMNNAME_TargetURL, TargetURL);
}
/** Get Target URL.
@return URL for the Target */
public String getTargetURL() 
{
String value = (String)get_Value(COLUMNNAME_TargetURL);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="4b2916da-b58e-c016-d006-3d7f295128e9")
public static String es_PE_FIELD_IndividualClick_TargetURL_Description="URL para la tarjeta";

@XendraTrl(Identifier="4b2916da-b58e-c016-d006-3d7f295128e9")
public static String es_PE_FIELD_IndividualClick_TargetURL_Help="URL de el sitio de la tarjeta";

@XendraTrl(Identifier="4b2916da-b58e-c016-d006-3d7f295128e9")
public static String es_PE_FIELD_IndividualClick_TargetURL_Name="Destino URL";

@XendraField(AD_Column_ID="TargetURL",IsCentrallyMaintained=true,
AD_Tab_ID="820165f9-d9de-d767-4108-6671371a4ae6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4b2916da-b58e-c016-d006-3d7f295128e9")
public static final String FIELDNAME_IndividualClick_TargetURL="4b2916da-b58e-c016-d006-3d7f295128e9";

@XendraTrl(Identifier="efe74a24-517f-3918-c7c6-f94945e79f8a")
public static String es_PE_COLUMN_TargetURL_Name="Destino URL";

@XendraColumn(AD_Element_ID="431635a1-2839-94c8-aba8-c0e8e38fc288",ColumnName="TargetURL",
AD_Reference_ID=40,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="efe74a24-517f-3918-c7c6-f94945e79f8a",
Synchronized="2017-08-05 16:56:32.0")
/** Column name TargetURL */
public static final String COLUMNNAME_TargetURL = "TargetURL";
/** Set User Agent.
@param UserAgent Browser Used */
public void setUserAgent (String UserAgent)
{
if (UserAgent != null && UserAgent.length() > 255)
{
log.warning("Length > 255 - truncated");
UserAgent = UserAgent.substring(0,254);
}
set_Value (COLUMNNAME_UserAgent, UserAgent);
}
/** Get User Agent.
@return Browser Used */
public String getUserAgent() 
{
String value = (String)get_Value(COLUMNNAME_UserAgent);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="19727784-1515-7e8f-fc8b-a6caa7989461")
public static String es_PE_FIELD_IndividualClick_UserAgent_Description="Paginador usado";

@XendraTrl(Identifier="19727784-1515-7e8f-fc8b-a6caa7989461")
public static String es_PE_FIELD_IndividualClick_UserAgent_Name="Agente del Usuario";

@XendraField(AD_Column_ID="UserAgent",IsCentrallyMaintained=true,
AD_Tab_ID="820165f9-d9de-d767-4108-6671371a4ae6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="19727784-1515-7e8f-fc8b-a6caa7989461")
public static final String FIELDNAME_IndividualClick_UserAgent="19727784-1515-7e8f-fc8b-a6caa7989461";

@XendraTrl(Identifier="9047ca8e-6cae-e95c-7d9d-7eb111c8ec62")
public static String es_PE_COLUMN_UserAgent_Name="Agente del Usuario";

@XendraColumn(AD_Element_ID="4a9fba4b-1174-5e1a-566b-fb1bed555e3e",ColumnName="UserAgent",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9047ca8e-6cae-e95c-7d9d-7eb111c8ec62",
Synchronized="2017-08-05 16:56:32.0")
/** Column name UserAgent */
public static final String COLUMNNAME_UserAgent = "UserAgent";
/** Set Click Count.
@param W_ClickCount_ID Web Click Management */
public void setW_ClickCount_ID (int W_ClickCount_ID)
{
if (W_ClickCount_ID <= 0) set_ValueNoCheck (COLUMNNAME_W_ClickCount_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_W_ClickCount_ID, Integer.valueOf(W_ClickCount_ID));
}
/** Get Click Count.
@return Web Click Management */
public int getW_ClickCount_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_W_ClickCount_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a0836086-a3fa-ba2d-ac42-d5e5f5aa6cea")
public static String es_PE_FIELD_IndividualClick_ClickCount_Description="Gerencia de tecleo Web";

@XendraTrl(Identifier="a0836086-a3fa-ba2d-ac42-d5e5f5aa6cea")
public static String es_PE_FIELD_IndividualClick_ClickCount_Help="Gerencia de tecleo Web";

@XendraTrl(Identifier="a0836086-a3fa-ba2d-ac42-d5e5f5aa6cea")
public static String es_PE_FIELD_IndividualClick_ClickCount_Name="Contador Clic";

@XendraField(AD_Column_ID="W_ClickCount_ID",IsCentrallyMaintained=true,
AD_Tab_ID="820165f9-d9de-d767-4108-6671371a4ae6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a0836086-a3fa-ba2d-ac42-d5e5f5aa6cea")
public static final String FIELDNAME_IndividualClick_ClickCount="a0836086-a3fa-ba2d-ac42-d5e5f5aa6cea";

@XendraTrl(Identifier="6ae143ab-40d4-904b-2c69-6de8001e2aed")
public static String es_PE_COLUMN_W_ClickCount_ID_Name="Contador Clic";

@XendraColumn(AD_Element_ID="ad2d625c-b752-7a9d-82b0-61c2aea4dc5a",ColumnName="W_ClickCount_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6ae143ab-40d4-904b-2c69-6de8001e2aed",
Synchronized="2017-08-05 16:56:32.0")
/** Column name W_ClickCount_ID */
public static final String COLUMNNAME_W_ClickCount_ID = "W_ClickCount_ID";
/** Set Web Click.
@param W_Click_ID Individual Web Click */
public void setW_Click_ID (int W_Click_ID)
{
if (W_Click_ID < 1) throw new IllegalArgumentException ("W_Click_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_W_Click_ID, Integer.valueOf(W_Click_ID));
}
/** Get Web Click.
@return Individual Web Click */
public int getW_Click_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_W_Click_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="aef9185b-b248-3e05-6369-16dbb24bae7c")
public static String es_PE_FIELD_IndividualClick_WebClick_Description="Individual Web Click";

@XendraTrl(Identifier="aef9185b-b248-3e05-6369-16dbb24bae7c")
public static String es_PE_FIELD_IndividualClick_WebClick_Help="Detalles de Web Click";

@XendraTrl(Identifier="aef9185b-b248-3e05-6369-16dbb24bae7c")
public static String es_PE_FIELD_IndividualClick_WebClick_Name="Web Click";

@XendraField(AD_Column_ID="W_Click_ID",IsCentrallyMaintained=true,
AD_Tab_ID="820165f9-d9de-d767-4108-6671371a4ae6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aef9185b-b248-3e05-6369-16dbb24bae7c")
public static final String FIELDNAME_IndividualClick_WebClick="aef9185b-b248-3e05-6369-16dbb24bae7c";
/** Column name W_Click_ID */
public static final String COLUMNNAME_W_Click_ID = "W_Click_ID";
}
