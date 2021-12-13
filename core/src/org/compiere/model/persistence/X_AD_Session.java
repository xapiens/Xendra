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
/** Generated Model for AD_Session
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Session extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Session_ID id
@param trxName transaction
*/
public X_AD_Session (Properties ctx, int AD_Session_ID, String trxName)
{
super (ctx, AD_Session_ID, trxName);
/** if (AD_Session_ID == 0)
{
setAD_Session_ID (0);
setProcessed (false);	
// N
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Session (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=566 */
public static int Table_ID=MTable.getTable_ID("AD_Session");

@XendraTrl(Identifier="ea05a430-3987-f6b1-5746-b3fe12b1e1df")
public static String es_PE_TAB_SessionAudit_Description="Lista de sesiones de usuario";

@XendraTrl(Identifier="ea05a430-3987-f6b1-5746-b3fe12b1e1df")
public static String es_PE_TAB_SessionAudit_Help="Historia de la línea ó sesiones de la Web";

@XendraTrl(Identifier="ea05a430-3987-f6b1-5746-b3fe12b1e1df")
public static String es_PE_TAB_SessionAudit_Name="Sesión";
@XendraTab(Name="Session Audit",
Description="List of User Sessions",Help="History of Online or Web Sessions",
AD_Window_ID="2d54fdd9-1f23-a280-9f41-33238a31aa47",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="ea05a430-3987-f6b1-5746-b3fe12b1e1df",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_SessionAudit="ea05a430-3987-f6b1-5746-b3fe12b1e1df";

@XendraTrl(Identifier="8f07356a-3b02-0e7e-b51c-bc57dbf0bcab")
public static String es_PE_TABLE_AD_Session_Name="Sesión";

@XendraTable(Name="Session",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="User Session Online or Web",
Help="",TableName="AD_Session",AccessLevel="6",AD_Window_ID="2d54fdd9-1f23-a280-9f41-33238a31aa47",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=135,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="8f07356a-3b02-0e7e-b51c-bc57dbf0bcab",Synchronized="2020-03-03 21:35:56.0")
/** TableName=AD_Session */
public static final String Table_Name="AD_Session";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Session");

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
    Table_ID = MTable.getTable_ID("AD_Session");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Session[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Role.
@param AD_Role_ID Responsibility Role */
public void setAD_Role_ID (int AD_Role_ID)
{
if (AD_Role_ID <= 0) set_Value (COLUMNNAME_AD_Role_ID, null);
 else 
set_Value (COLUMNNAME_AD_Role_ID, Integer.valueOf(AD_Role_ID));
}
/** Get Role.
@return Responsibility Role */
public int getAD_Role_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Role_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="cee80ecb-04e9-8074-2014-8d724e889376")
public static String es_PE_COLUMN_AD_Role_ID_Name="Rol";

@XendraColumn(AD_Element_ID="08ffb725-ea75-e55f-f4c5-67ac26f40e2b",ColumnName="AD_Role_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cee80ecb-04e9-8074-2014-8d724e889376",
Synchronized="2019-08-30 22:20:41.0")
/** Column name AD_Role_ID */
public static final String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
/** Set Session.
@param AD_Session_ID User Session Online or Web */
public void setAD_Session_ID (int AD_Session_ID)
{
if (AD_Session_ID < 1) throw new IllegalArgumentException ("AD_Session_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Session_ID, Integer.valueOf(AD_Session_ID));
}
/** Get Session.
@return User Session Online or Web */
public int getAD_Session_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Session_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getAD_Session_ID()));
}

@XendraTrl(Identifier="bf0be0f6-000c-c58f-a849-5cef769897bf")
public static String es_PE_FIELD_SessionAudit_Session_Name="Sesión";

@XendraTrl(Identifier="bf0be0f6-000c-c58f-a849-5cef769897bf")
public static String es_PE_FIELD_SessionAudit_Session_Description="Usar sesión el línea ó Web";

@XendraTrl(Identifier="bf0be0f6-000c-c58f-a849-5cef769897bf")
public static String es_PE_FIELD_SessionAudit_Session_Help="Información de sesión en línea ó Web.";

@XendraField(AD_Column_ID="AD_Session_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ea05a430-3987-f6b1-5746-b3fe12b1e1df",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bf0be0f6-000c-c58f-a849-5cef769897bf")
public static final String FIELDNAME_SessionAudit_Session="bf0be0f6-000c-c58f-a849-5cef769897bf";
/** Column name AD_Session_ID */
public static final String COLUMNNAME_AD_Session_ID = "AD_Session_ID";
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

@XendraTrl(Identifier="7e5fe8bb-61a6-f7ce-2528-f9f707463fc0")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7e5fe8bb-61a6-f7ce-2528-f9f707463fc0",
Synchronized="2019-08-30 22:20:41.0")
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
@XendraTrl(Identifier="619242e6-74fe-4098-b886-3d80fc49228b")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="619242e6-74fe-4098-b886-3d80fc49228b",
Synchronized="2019-08-30 22:20:41.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set LoginDate.
@param LoginDate LoginDate */
public void setLoginDate (Timestamp LoginDate)
{
set_Value (COLUMNNAME_LoginDate, LoginDate);
}
/** Get LoginDate.
@return LoginDate */
public Timestamp getLoginDate() 
{
return (Timestamp)get_Value(COLUMNNAME_LoginDate);
}

@XendraTrl(Identifier="a81a0f6b-26ea-89f3-b762-9a95bad57587")
public static String es_PE_COLUMN_LoginDate_Name="logindate";

@XendraColumn(AD_Element_ID="98a89fc0-6b48-1e93-e52a-b2c99b1222e6",ColumnName="LoginDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a81a0f6b-26ea-89f3-b762-9a95bad57587",
Synchronized="2019-08-30 22:20:41.0")
/** Column name LoginDate */
public static final String COLUMNNAME_LoginDate = "LoginDate";
/** Set Processed.
@param Processed The document has been processed */
public void setProcessed (boolean Processed)
{
set_ValueNoCheck (COLUMNNAME_Processed, Boolean.valueOf(Processed));
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

@XendraTrl(Identifier="3e508e2b-539d-77d4-9711-9af26e35b21b")
public static String es_PE_FIELD_SessionAudit_Processed_Name="Procesado";

@XendraTrl(Identifier="3e508e2b-539d-77d4-9711-9af26e35b21b")
public static String es_PE_FIELD_SessionAudit_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="3e508e2b-539d-77d4-9711-9af26e35b21b")
public static String es_PE_FIELD_SessionAudit_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="ea05a430-3987-f6b1-5746-b3fe12b1e1df",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3e508e2b-539d-77d4-9711-9af26e35b21b")
public static final String FIELDNAME_SessionAudit_Processed="3e508e2b-539d-77d4-9711-9af26e35b21b";

@XendraTrl(Identifier="caaffe43-d1b8-e65d-3ce5-9407c25333ff")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="caaffe43-d1b8-e65d-3ce5-9407c25333ff",
Synchronized="2019-08-30 22:20:41.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set Remote Addr.
@param Remote_Addr Remote Address */
public void setRemote_Addr (String Remote_Addr)
{
if (Remote_Addr != null && Remote_Addr.length() > 60)
{
log.warning("Length > 60 - truncated");
Remote_Addr = Remote_Addr.substring(0,59);
}
set_ValueNoCheck (COLUMNNAME_Remote_Addr, Remote_Addr);
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
@XendraTrl(Identifier="2c866867-30c0-a28d-389b-75bce4153ea5")
public static String es_PE_FIELD_SessionAudit_RemoteAddr_Name="Dirección Remota";

@XendraTrl(Identifier="2c866867-30c0-a28d-389b-75bce4153ea5")
public static String es_PE_FIELD_SessionAudit_RemoteAddr_Description="Dirección remota";

@XendraTrl(Identifier="2c866867-30c0-a28d-389b-75bce4153ea5")
public static String es_PE_FIELD_SessionAudit_RemoteAddr_Help="La dirección remota indica una dirección alternativa ó externa";

@XendraField(AD_Column_ID="Remote_Addr",IsCentrallyMaintained=true,
AD_Tab_ID="ea05a430-3987-f6b1-5746-b3fe12b1e1df",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2c866867-30c0-a28d-389b-75bce4153ea5")
public static final String FIELDNAME_SessionAudit_RemoteAddr="2c866867-30c0-a28d-389b-75bce4153ea5";

@XendraTrl(Identifier="4326aa8e-6fbe-ffa1-db75-4d36bc84842c")
public static String es_PE_COLUMN_Remote_Addr_Name="Dirección Remota";

@XendraColumn(AD_Element_ID="b1551fd7-ca8d-4a87-8302-e41caf5553d6",ColumnName="Remote_Addr",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4326aa8e-6fbe-ffa1-db75-4d36bc84842c",
Synchronized="2019-08-30 22:20:41.0")
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
set_ValueNoCheck (COLUMNNAME_Remote_Host, Remote_Host);
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
@XendraTrl(Identifier="dd21d721-9cab-5055-9e00-97b8302dec4a")
public static String es_PE_FIELD_SessionAudit_RemoteHost_Name="Host Remoto";

@XendraField(AD_Column_ID="Remote_Host",IsCentrallyMaintained=true,
AD_Tab_ID="ea05a430-3987-f6b1-5746-b3fe12b1e1df",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dd21d721-9cab-5055-9e00-97b8302dec4a")
public static final String FIELDNAME_SessionAudit_RemoteHost="dd21d721-9cab-5055-9e00-97b8302dec4a";

@XendraTrl(Identifier="a0b7fd9a-f23d-675d-1397-55abe768a2d0")
public static String es_PE_COLUMN_Remote_Host_Name="Host Remoto";

@XendraColumn(AD_Element_ID="eb636ff7-fd5e-fa57-d640-f766bf4e52b2",ColumnName="Remote_Host",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a0b7fd9a-f23d-675d-1397-55abe768a2d0",
Synchronized="2019-08-30 22:20:41.0")
/** Column name Remote_Host */
public static final String COLUMNNAME_Remote_Host = "Remote_Host";
/** Set Web Session.
@param WebSession Web Session ID */
public void setWebSession (String WebSession)
{
if (WebSession != null && WebSession.length() > 40)
{
log.warning("Length > 40 - truncated");
WebSession = WebSession.substring(0,39);
}
set_ValueNoCheck (COLUMNNAME_WebSession, WebSession);
}
/** Get Web Session.
@return Web Session ID */
public String getWebSession() 
{
String value = (String)get_Value(COLUMNNAME_WebSession);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="5e5a28ef-2949-b244-6cdd-c9bdbf482007")
public static String es_PE_FIELD_SessionAudit_WebSession_Name="Sesión Web";

@XendraTrl(Identifier="5e5a28ef-2949-b244-6cdd-c9bdbf482007")
public static String es_PE_FIELD_SessionAudit_WebSession_Description="ID sesión Web.";

@XendraField(AD_Column_ID="WebSession",IsCentrallyMaintained=true,
AD_Tab_ID="ea05a430-3987-f6b1-5746-b3fe12b1e1df",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5e5a28ef-2949-b244-6cdd-c9bdbf482007")
public static final String FIELDNAME_SessionAudit_WebSession="5e5a28ef-2949-b244-6cdd-c9bdbf482007";

@XendraTrl(Identifier="492e3a2d-52f5-8372-a30f-066d6f1dddf5")
public static String es_PE_COLUMN_WebSession_Name="Sesión Web";

@XendraColumn(AD_Element_ID="8a1dbcf3-b770-e48f-e233-446118718bd4",ColumnName="WebSession",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="492e3a2d-52f5-8372-a30f-066d6f1dddf5",
Synchronized="2019-08-30 22:20:41.0")
/** Column name WebSession */
public static final String COLUMNNAME_WebSession = "WebSession";
}
