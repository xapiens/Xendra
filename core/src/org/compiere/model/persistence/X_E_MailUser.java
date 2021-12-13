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
/** Generated Model for E_MailUser
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_E_MailUser extends PO
{
/** Standard Constructor
@param ctx context
@param E_MailUser_ID id
@param trxName transaction
*/
public X_E_MailUser (Properties ctx, int E_MailUser_ID, String trxName)
{
super (ctx, E_MailUser_ID, trxName);
/** if (E_MailUser_ID == 0)
{
setE_MailUser_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_E_MailUser (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000298 */
public static int Table_ID=MTable.getTable_ID("E_MailUser");

@XendraTrl(Identifier="b6bcc5c3-64ae-4736-924c-79beb9871234")
public static String es_PE_TABLE_E_MailUser_Name="E_MailUser";

@XendraTable(Name="E_MailUser",AD_Package_ID="5a4baeee-43d7-eba9-9b5a-4ab05cfda2bd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="E_MailUser",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=false,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.communication",Identifier="b6bcc5c3-64ae-4736-924c-79beb9871234",
Synchronized="2020-03-03 21:37:48.0")
/** TableName=E_MailUser */
public static final String Table_Name="E_MailUser";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"E_MailUser");

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
    Table_ID = MTable.getTable_ID("E_MailUser");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_E_MailUser[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="0f069d6c-95dc-4246-aaa8-88e00330d3a1")
public static String es_PE_COLUMN_AD_User_ID_Name="User/Contact";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0f069d6c-95dc-4246-aaa8-88e00330d3a1",
Synchronized="2019-08-30 22:22:25.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set Authentication_Methods.
@param Authentication_Methods Authentication_Methods */
public void setAuthentication_Methods (String Authentication_Methods)
{
if (Authentication_Methods != null && Authentication_Methods.length() > 20)
{
log.warning("Length > 20 - truncated");
Authentication_Methods = Authentication_Methods.substring(0,19);
}
set_Value (COLUMNNAME_Authentication_Methods, Authentication_Methods);
}
/** Get Authentication_Methods.
@return Authentication_Methods */
public String getAuthentication_Methods() 
{
String value = (String)get_Value(COLUMNNAME_Authentication_Methods);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c5b19d7a-1ec1-4bf9-8b26-a2ae65769059")
public static String es_PE_COLUMN_Authentication_Methods_Name="Authentication_Methods";

@XendraColumn(AD_Element_ID="a19aab75-3634-4ae9-bd06-0d46509e8de6",
ColumnName="Authentication_Methods",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=20,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c5b19d7a-1ec1-4bf9-8b26-a2ae65769059",Synchronized="2019-08-30 22:22:25.0")
/** Column name Authentication_Methods */
public static final String COLUMNNAME_Authentication_Methods = "Authentication_Methods";
/** Set Download_Limit.
@param Download_Limit Download_Limit */
public void setDownload_Limit (int Download_Limit)
{
set_Value (COLUMNNAME_Download_Limit, Integer.valueOf(Download_Limit));
}
/** Get Download_Limit.
@return Download_Limit */
public int getDownload_Limit() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Download_Limit);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b17dc9f4-cc1e-499e-acd5-b3066355e49e")
public static String es_PE_COLUMN_Download_Limit_Name="Download_Limit";

@XendraColumn(AD_Element_ID="74661fa2-5023-4dcb-9f34-3d4f271795c3",ColumnName="Download_Limit",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b17dc9f4-cc1e-499e-acd5-b3066355e49e",
Synchronized="2019-08-30 22:22:25.0")
/** Column name Download_Limit */
public static final String COLUMNNAME_Download_Limit = "Download_Limit";
/** Set EMail User ID.
@param EMailUser User Name (ID) in the Mail System */
public void setEMailUser (String EMailUser)
{
if (EMailUser != null && EMailUser.length() > 50)
{
log.warning("Length > 50 - truncated");
EMailUser = EMailUser.substring(0,49);
}
set_Value (COLUMNNAME_EMailUser, EMailUser);
}
/** Get EMail User ID.
@return User Name (ID) in the Mail System */
public String getEMailUser() 
{
String value = (String)get_Value(COLUMNNAME_EMailUser);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="56922a36-c4a0-44ef-a91d-6209ec75f714")
public static String es_PE_COLUMN_EMailUser_Name="EMail User ID";

@XendraColumn(AD_Element_ID="1349ac59-56ac-8a73-6587-105fdd40bd24",ColumnName="EMailUser",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=50,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="56922a36-c4a0-44ef-a91d-6209ec75f714",
Synchronized="2019-08-30 22:22:25.0")
/** Column name EMailUser */
public static final String COLUMNNAME_EMailUser = "EMailUser";
/** Set E_MailUser_ID.
@param E_MailUser_ID E_MailUser_ID */
public void setE_MailUser_ID (int E_MailUser_ID)
{
if (E_MailUser_ID < 1) throw new IllegalArgumentException ("E_MailUser_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_E_MailUser_ID, Integer.valueOf(E_MailUser_ID));
}
/** Get E_MailUser_ID.
@return E_MailUser_ID */
public int getE_MailUser_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_E_MailUser_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name E_MailUser_ID */
public static final String COLUMNNAME_E_MailUser_ID = "E_MailUser_ID";
/** Set Host Address.
@param HostAddress Host Address URL or DNS */
public void setHostAddress (String HostAddress)
{
if (HostAddress != null && HostAddress.length() > 30)
{
log.warning("Length > 30 - truncated");
HostAddress = HostAddress.substring(0,29);
}
set_Value (COLUMNNAME_HostAddress, HostAddress);
}
/** Get Host Address.
@return Host Address URL or DNS */
public String getHostAddress() 
{
String value = (String)get_Value(COLUMNNAME_HostAddress);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="6173dca3-a3bf-4f1f-9c05-249d89131949")
public static String es_PE_COLUMN_HostAddress_Name="Host Address";

@XendraColumn(AD_Element_ID="360f9086-02d8-c014-bb85-dbcfac9c3e1d",ColumnName="HostAddress",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6173dca3-a3bf-4f1f-9c05-249d89131949",
Synchronized="2019-08-30 22:22:25.0")
/** Column name HostAddress */
public static final String COLUMNNAME_HostAddress = "HostAddress";
/** Set Host port.
@param HostPort Host Communication Port */
public void setHostPort (int HostPort)
{
set_Value (COLUMNNAME_HostPort, Integer.valueOf(HostPort));
}
/** Get Host port.
@return Host Communication Port */
public int getHostPort() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HostPort);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fae707ca-2704-4a83-aa90-1a266af05182")
public static String es_PE_COLUMN_HostPort_Name="Host port";

@XendraColumn(AD_Element_ID="6082bb2b-fdc8-34b4-ba72-e7b1c6b69316",ColumnName="HostPort",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fae707ca-2704-4a83-aa90-1a266af05182",
Synchronized="2019-08-30 22:22:25.0")
/** Column name HostPort */
public static final String COLUMNNAME_HostPort = "HostPort";
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
@XendraTrl(Identifier="2677cf0e-23bb-41ca-9ea9-8664f782f4f0")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2677cf0e-23bb-41ca-9ea9-8664f782f4f0",
Synchronized="2019-08-30 22:22:25.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set IsApplyFilter.
@param IsApplyFilter IsApplyFilter */
public void setIsApplyFilter (boolean IsApplyFilter)
{
set_Value (COLUMNNAME_IsApplyFilter, Boolean.valueOf(IsApplyFilter));
}
/** Get IsApplyFilter.
@return IsApplyFilter */
public boolean isApplyFilter() 
{
Object oo = get_Value(COLUMNNAME_IsApplyFilter);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="2ec49a29-ea87-4214-b9e6-22ea4e8e5e0e")
public static String es_PE_COLUMN_IsApplyFilter_Name="IsApplyFilter";

@XendraColumn(AD_Element_ID="cb57d6b3-2c5f-43d3-a0c5-1107581b9ea6",ColumnName="IsApplyFilter",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2ec49a29-ea87-4214-b9e6-22ea4e8e5e0e",
Synchronized="2019-08-30 22:22:25.0")
/** Column name IsApplyFilter */
public static final String COLUMNNAME_IsApplyFilter = "IsApplyFilter";
/** Set IsAutomatically_Download_New_Messages.
@param IsAutomatically_Download_New_Messages IsAutomatically_Download_New_Messages */
public void setIsAutomatically_Download_New_Messages (boolean IsAutomatically_Download_New_Messages)
{
set_Value (COLUMNNAME_IsAutomatically_Download_New_Messages, Boolean.valueOf(IsAutomatically_Download_New_Messages));
}
/** Get IsAutomatically_Download_New_Messages.
@return IsAutomatically_Download_New_Messages */
public boolean isAutomatically_Download_New_Messages() 
{
Object oo = get_Value(COLUMNNAME_IsAutomatically_Download_New_Messages);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="2bce8081-97ab-432c-8c07-416cf24d809e")
public static String es_PE_COLUMN_IsAutomatically_Download_New_Messages_Name="IsAutomatically_Download_New_Messages";

@XendraColumn(AD_Element_ID="55be09db-78b5-4358-83ea-24a8547d42e2",
ColumnName="IsAutomatically_Download_New_Messages",AD_Reference_ID=20,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2bce8081-97ab-432c-8c07-416cf24d809e",Synchronized="2019-08-30 22:22:25.0")
/** Column name IsAutomatically_Download_New_Messages */
public static final String COLUMNNAME_IsAutomatically_Download_New_Messages = "IsAutomatically_Download_New_Messages";
/** Set Default.
@param IsDefault Default value */
public void setIsDefault (boolean IsDefault)
{
set_Value (COLUMNNAME_IsDefault, Boolean.valueOf(IsDefault));
}
/** Get Default.
@return Default value */
public boolean isDefault() 
{
Object oo = get_Value(COLUMNNAME_IsDefault);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="743def0e-46ad-4df8-bfef-fee80182b61d")
public static String es_PE_COLUMN_IsDefault_Name="Default";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="743def0e-46ad-4df8-bfef-fee80182b61d",
Synchronized="2019-08-30 22:22:25.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
/** Set IsEnabledDownloadLimit.
@param IsEnabledDownloadLimit IsEnabledDownloadLimit */
public void setIsEnabledDownloadLimit (boolean IsEnabledDownloadLimit)
{
set_Value (COLUMNNAME_IsEnabledDownloadLimit, Boolean.valueOf(IsEnabledDownloadLimit));
}
/** Get IsEnabledDownloadLimit.
@return IsEnabledDownloadLimit */
public boolean isEnabledDownloadLimit() 
{
Object oo = get_Value(COLUMNNAME_IsEnabledDownloadLimit);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="fd126e4a-7e7b-4c19-958c-470f6d46aeb5")
public static String es_PE_COLUMN_IsEnabledDownloadLimit_Name="IsEnabledDownloadLimit";

@XendraColumn(AD_Element_ID="05032303-d203-4b2d-8d81-f30143292d82",
ColumnName="IsEnabledDownloadLimit",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="fd126e4a-7e7b-4c19-958c-470f6d46aeb5",Synchronized="2019-08-30 22:22:26.0")
/** Column name IsEnabledDownloadLimit */
public static final String COLUMNNAME_IsEnabledDownloadLimit = "IsEnabledDownloadLimit";
/** Set IsEnableSSL.
@param IsEnableSSL IsEnableSSL */
public void setIsEnableSSL (boolean IsEnableSSL)
{
set_Value (COLUMNNAME_IsEnableSSL, Boolean.valueOf(IsEnableSSL));
}
/** Get IsEnableSSL.
@return IsEnableSSL */
public boolean isEnableSSL() 
{
Object oo = get_Value(COLUMNNAME_IsEnableSSL);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="cf0a8952-83f8-4eef-a5f6-13ce94f7098b")
public static String es_PE_COLUMN_IsEnableSSL_Name="IsEnableSSL";

@XendraColumn(AD_Element_ID="6eb03579-7e56-4751-a286-90e9b995cc02",ColumnName="IsEnableSSL",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cf0a8952-83f8-4eef-a5f6-13ce94f7098b",
Synchronized="2019-08-30 22:22:26.0")
/** Column name IsEnableSSL */
public static final String COLUMNNAME_IsEnableSSL = "IsEnableSSL";
/** Set IsExcludeFromCheckAll.
@param IsExcludeFromCheckAll IsExcludeFromCheckAll */
public void setIsExcludeFromCheckAll (boolean IsExcludeFromCheckAll)
{
set_Value (COLUMNNAME_IsExcludeFromCheckAll, Boolean.valueOf(IsExcludeFromCheckAll));
}
/** Get IsExcludeFromCheckAll.
@return IsExcludeFromCheckAll */
public boolean isExcludeFromCheckAll() 
{
Object oo = get_Value(COLUMNNAME_IsExcludeFromCheckAll);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="484e0fe3-1027-4b70-b10f-9ebb91c610f9")
public static String es_PE_COLUMN_IsExcludeFromCheckAll_Name="IsExcludeFromCheckAll";

@XendraColumn(AD_Element_ID="fea01ea0-1f4d-42c3-85b9-e3eb6c21a706",
ColumnName="IsExcludeFromCheckAll",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="484e0fe3-1027-4b70-b10f-9ebb91c610f9",Synchronized="2019-08-30 22:22:26.0")
/** Column name IsExcludeFromCheckAll */
public static final String COLUMNNAME_IsExcludeFromCheckAll = "IsExcludeFromCheckAll";
/** Set IsIncoming.
@param IsIncoming IsIncoming */
public void setIsIncoming (boolean IsIncoming)
{
set_Value (COLUMNNAME_IsIncoming, Boolean.valueOf(IsIncoming));
}
/** Get IsIncoming.
@return IsIncoming */
public boolean isIncoming() 
{
Object oo = get_Value(COLUMNNAME_IsIncoming);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="4bafb90c-fe54-4151-8092-6fbc931a37ce")
public static String es_PE_COLUMN_IsIncoming_Name="IsIncoming";

@XendraColumn(AD_Element_ID="ccf73958-230a-4467-b7ed-b975e9e0874d",ColumnName="IsIncoming",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4bafb90c-fe54-4151-8092-6fbc931a37ce",
Synchronized="2019-08-30 22:22:26.0")
/** Column name IsIncoming */
public static final String COLUMNNAME_IsIncoming = "IsIncoming";
/** Set IsLeave_Messages_On_Server.
@param IsLeave_Messages_On_Server IsLeave_Messages_On_Server */
public void setIsLeave_Messages_On_Server (boolean IsLeave_Messages_On_Server)
{
set_Value (COLUMNNAME_IsLeave_Messages_On_Server, Boolean.valueOf(IsLeave_Messages_On_Server));
}
/** Get IsLeave_Messages_On_Server.
@return IsLeave_Messages_On_Server */
public boolean isLeave_Messages_On_Server() 
{
Object oo = get_Value(COLUMNNAME_IsLeave_Messages_On_Server);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f0a2c7b4-7c2f-4d26-8210-2cbd061fb9c9")
public static String es_PE_COLUMN_IsLeave_Messages_On_Server_Name="IsLeave_Messages_On_Server";

@XendraColumn(AD_Element_ID="86f665a3-ccc9-45af-8521-4cfc4d98ac5e",
ColumnName="IsLeave_Messages_On_Server",AD_Reference_ID=20,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f0a2c7b4-7c2f-4d26-8210-2cbd061fb9c9",Synchronized="2019-08-30 22:22:26.0")
/** Column name IsLeave_Messages_On_Server */
public static final String COLUMNNAME_IsLeave_Messages_On_Server = "IsLeave_Messages_On_Server";
/** Set IsMailCheck.
@param IsMailCheck IsMailCheck */
public void setIsMailCheck (boolean IsMailCheck)
{
set_Value (COLUMNNAME_IsMailCheck, Boolean.valueOf(IsMailCheck));
}
/** Get IsMailCheck.
@return IsMailCheck */
public boolean isMailCheck() 
{
Object oo = get_Value(COLUMNNAME_IsMailCheck);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="57899eae-27f8-49af-9e18-faa61d32f0f2")
public static String es_PE_COLUMN_IsMailCheck_Name="IsMailCheck";

@XendraColumn(AD_Element_ID="91fed0a9-41d3-48ea-acd2-3ebe15991080",ColumnName="IsMailCheck",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="57899eae-27f8-49af-9e18-faa61d32f0f2",
Synchronized="2019-08-30 22:22:26.0")
/** Column name IsMailCheck */
public static final String COLUMNNAME_IsMailCheck = "IsMailCheck";
/** Set IsRemove_Old_From_Server.
@param IsRemove_Old_From_Server IsRemove_Old_From_Server */
public void setIsRemove_Old_From_Server (boolean IsRemove_Old_From_Server)
{
set_Value (COLUMNNAME_IsRemove_Old_From_Server, Boolean.valueOf(IsRemove_Old_From_Server));
}
/** Get IsRemove_Old_From_Server.
@return IsRemove_Old_From_Server */
public boolean isRemove_Old_From_Server() 
{
Object oo = get_Value(COLUMNNAME_IsRemove_Old_From_Server);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="58a70dd9-6ccf-4eca-a4c6-1ea4685a7c47")
public static String es_PE_COLUMN_IsRemove_Old_From_Server_Name="IsRemove_Old_From_Server";

@XendraColumn(AD_Element_ID="df038e55-16b8-442e-ac8e-343d27e9866e",
ColumnName="IsRemove_Old_From_Server",AD_Reference_ID=20,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="58a70dd9-6ccf-4eca-a4c6-1ea4685a7c47",Synchronized="2019-08-30 22:22:26.0")
/** Column name IsRemove_Old_From_Server */
public static final String COLUMNNAME_IsRemove_Old_From_Server = "IsRemove_Old_From_Server";
/** Set IsSavePassword.
@param IsSavePassword IsSavePassword */
public void setIsSavePassword (boolean IsSavePassword)
{
set_Value (COLUMNNAME_IsSavePassword, Boolean.valueOf(IsSavePassword));
}
/** Get IsSavePassword.
@return IsSavePassword */
public boolean isSavePassword() 
{
Object oo = get_Value(COLUMNNAME_IsSavePassword);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="6802f5fa-9114-4d57-bd65-493988af3568")
public static String es_PE_COLUMN_IsSavePassword_Name="IsSavePassword";

@XendraColumn(AD_Element_ID="29b062e4-4fba-41de-a70a-98fb2c9a028c",ColumnName="IsSavePassword",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6802f5fa-9114-4d57-bd65-493988af3568",
Synchronized="2019-08-30 22:22:26.0")
/** Column name IsSavePassword */
public static final String COLUMNNAME_IsSavePassword = "IsSavePassword";
/** Set IsSound.
@param IsSound IsSound */
public void setIsSound (boolean IsSound)
{
set_Value (COLUMNNAME_IsSound, Boolean.valueOf(IsSound));
}
/** Get IsSound.
@return IsSound */
public boolean isSound() 
{
Object oo = get_Value(COLUMNNAME_IsSound);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="bcdbd049-2088-4f3c-9725-41556aefe847")
public static String es_PE_COLUMN_IsSound_Name="IsSound";

@XendraColumn(AD_Element_ID="52ca57f8-ca5c-4c4d-9322-0fe716f6fda1",ColumnName="IsSound",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bcdbd049-2088-4f3c-9725-41556aefe847",
Synchronized="2019-08-30 22:22:26.0")
/** Column name IsSound */
public static final String COLUMNNAME_IsSound = "IsSound";
/** Set LoginMethod.
@param LoginMethod LoginMethod */
public void setLoginMethod (int LoginMethod)
{
set_Value (COLUMNNAME_LoginMethod, Integer.valueOf(LoginMethod));
}
/** Get LoginMethod.
@return LoginMethod */
public int getLoginMethod() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_LoginMethod);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="85b8018b-74fc-4e05-851c-b4d6e092f994")
public static String es_PE_COLUMN_LoginMethod_Name="LoginMethod";

@XendraColumn(AD_Element_ID="c02ba18a-fad2-4def-b1f6-81c651051ac7",ColumnName="LoginMethod",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="85b8018b-74fc-4e05-851c-b4d6e092f994",
Synchronized="2019-08-30 22:22:26.0")
/** Column name LoginMethod */
public static final String COLUMNNAME_LoginMethod = "LoginMethod";
/** Set MailCheck_Interval.
@param MailCheck_Interval MailCheck_Interval */
public void setMailCheck_Interval (int MailCheck_Interval)
{
set_Value (COLUMNNAME_MailCheck_Interval, Integer.valueOf(MailCheck_Interval));
}
/** Get MailCheck_Interval.
@return MailCheck_Interval */
public int getMailCheck_Interval() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_MailCheck_Interval);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7b914bf9-de20-472c-98c3-a629917a8b52")
public static String es_PE_COLUMN_MailCheck_Interval_Name="MailCheck_Interval";

@XendraColumn(AD_Element_ID="e6bd08b0-5098-445f-85fc-8fef636d5af6",ColumnName="MailCheck_Interval",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7b914bf9-de20-472c-98c3-a629917a8b52",
Synchronized="2019-08-30 22:22:26.0")
/** Column name MailCheck_Interval */
public static final String COLUMNNAME_MailCheck_Interval = "MailCheck_Interval";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name != null && Name.length() > 30)
{
log.warning("Length > 30 - truncated");
Name = Name.substring(0,29);
}
set_Value (COLUMNNAME_Name, Name);
}
/** Get Name.
@return Alphanumeric identifier of the entity */
public String getName() 
{
String value = (String)get_Value(COLUMNNAME_Name);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="dd40ed6d-f58a-4970-982b-5a2486fdd654")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dd40ed6d-f58a-4970-982b-5a2486fdd654",
Synchronized="2019-08-30 22:22:26.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Older_Than.
@param Older_Than Older_Than */
public void setOlder_Than (int Older_Than)
{
set_Value (COLUMNNAME_Older_Than, Integer.valueOf(Older_Than));
}
/** Get Older_Than.
@return Older_Than */
public int getOlder_Than() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Older_Than);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b4ca868d-3069-44ef-ba7d-b5cd43156c79")
public static String es_PE_COLUMN_Older_Than_Name="Older_Than";

@XendraColumn(AD_Element_ID="566a48fe-fecb-4601-b5ec-0b376b1fc004",ColumnName="Older_Than",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b4ca868d-3069-44ef-ba7d-b5cd43156c79",
Synchronized="2019-08-30 22:22:26.0")
/** Column name Older_Than */
public static final String COLUMNNAME_Older_Than = "Older_Than";
/** Set Password.
@param Password Password of any length (case sensitive) */
public void setPassword (String Password)
{
if (Password != null && Password.length() > 20)
{
log.warning("Length > 20 - truncated");
Password = Password.substring(0,19);
}
set_Value (COLUMNNAME_Password, Password);
}
/** Get Password.
@return Password of any length (case sensitive) */
public String getPassword() 
{
String value = (String)get_Value(COLUMNNAME_Password);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="03434509-5c63-485f-9a59-88ead85ae3d6")
public static String es_PE_COLUMN_Password_Name="Password";

@XendraColumn(AD_Element_ID="cd8ab187-f65c-a732-8e67-8675630874c3",ColumnName="Password",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="03434509-5c63-485f-9a59-88ead85ae3d6",
Synchronized="2019-08-30 22:22:26.0")
/** Column name Password */
public static final String COLUMNNAME_Password = "Password";
/** Set Protocol.
@param Protocol Protocol */
public void setProtocol (String Protocol)
{
if (Protocol != null && Protocol.length() > 5)
{
log.warning("Length > 5 - truncated");
Protocol = Protocol.substring(0,4);
}
set_Value (COLUMNNAME_Protocol, Protocol);
}
/** Get Protocol.
@return Protocol */
public String getProtocol() 
{
String value = (String)get_Value(COLUMNNAME_Protocol);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="38b4c869-7c35-4c30-ab14-ba0c49aaaabd")
public static String es_PE_COLUMN_Protocol_Name="Protocol";

@XendraColumn(AD_Element_ID="c899bafd-ce83-84c7-7bc5-77e23019b9b0",ColumnName="Protocol",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=5,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="38b4c869-7c35-4c30-ab14-ba0c49aaaabd",
Synchronized="2019-08-30 22:22:26.0")
/** Column name Protocol */
public static final String COLUMNNAME_Protocol = "Protocol";
/** Set SSLType.
@param SSLType SSLType */
public void setSSLType (int SSLType)
{
set_Value (COLUMNNAME_SSLType, Integer.valueOf(SSLType));
}
/** Get SSLType.
@return SSLType */
public int getSSLType() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SSLType);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="75970908-0fd1-4be3-be71-a46e8f3279e5")
public static String es_PE_COLUMN_SSLType_Name="SSLType";

@XendraColumn(AD_Element_ID="0f7228e6-e971-42b0-ad61-38b1879cfa0e",ColumnName="SSLType",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="75970908-0fd1-4be3-be71-a46e8f3279e5",
Synchronized="2019-08-30 22:22:26.0")
/** Column name SSLType */
public static final String COLUMNNAME_SSLType = "SSLType";
}
