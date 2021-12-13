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
/** Generated Model for W_MailMsg
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_W_MailMsg extends PO
{
/** Standard Constructor
@param ctx context
@param W_MailMsg_ID id
@param trxName transaction
*/
public X_W_MailMsg (Properties ctx, int W_MailMsg_ID, String trxName)
{
super (ctx, W_MailMsg_ID, trxName);
/** if (W_MailMsg_ID == 0)
{
setMailMsgType (null);
setMessage (null);
setName (null);
setSubject (null);
setW_MailMsg_ID (0);
setW_Store_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_W_MailMsg (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=780 */
public static int Table_ID=MTable.getTable_ID("W_MailMsg");

@XendraTrl(Identifier="ebe3c8b3-8a94-1a4a-d39e-3cd3bcc6a3bd")
public static String es_PE_TAB_WebStoreMessage_Name="Mensaje de Tienda Web";

@XendraTab(Name="Web Store Message",Description="Definine Web Store Messages",Help="",
AD_Window_ID="786c7197-5b64-f3eb-5d2b-a3422ae70868",SeqNo=30,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="f9ed5511-d203-28b1-1cc4-a5a19318bc8e",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="ebe3c8b3-8a94-1a4a-d39e-3cd3bcc6a3bd",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_WebStoreMessage="ebe3c8b3-8a94-1a4a-d39e-3cd3bcc6a3bd";

@XendraTrl(Identifier="01d66223-b161-240e-72b4-e2f039cd5835")
public static String es_PE_TABLE_W_MailMsg_Name="Mensaje de Correo";

@XendraTable(Name="Mail Message",AD_Package_ID="1b3656e5-71c7-1296-994e-9b2c4549c7fd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Web Store Mail Message Template",
Help="",TableName="W_MailMsg",AccessLevel="2",AD_Window_ID="786c7197-5b64-f3eb-5d2b-a3422ae70868",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="01d66223-b161-240e-72b4-e2f039cd5835",Synchronized="2020-03-03 21:40:33.0")
/** TableName=W_MailMsg */
public static final String Table_Name="W_MailMsg";


@XendraIndex(Name="w_mailmsg_wstore",Identifier="0673a4c0-7d2f-a380-f2fa-b89da64f1a1d",
Column_Names="w_store_id, mailmsgtype",IsUnique="true",
TableIdentifier="0673a4c0-7d2f-a380-f2fa-b89da64f1a1d",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_w_mailmsg_wstore = "0673a4c0-7d2f-a380-f2fa-b89da64f1a1d";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"W_MailMsg");

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
    Table_ID = MTable.getTable_ID("W_MailMsg");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_W_MailMsg[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="ba5fb765-570a-e901-ae9f-efa9f700d098")
public static String es_PE_FIELD_WebStoreMessage_Description_Name="Observación";

@XendraTrl(Identifier="ba5fb765-570a-e901-ae9f-efa9f700d098")
public static String es_PE_FIELD_WebStoreMessage_Description_Description="Observación";

@XendraTrl(Identifier="ba5fb765-570a-e901-ae9f-efa9f700d098")
public static String es_PE_FIELD_WebStoreMessage_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="ebe3c8b3-8a94-1a4a-d39e-3cd3bcc6a3bd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ba5fb765-570a-e901-ae9f-efa9f700d098")
public static final String FIELDNAME_WebStoreMessage_Description="ba5fb765-570a-e901-ae9f-efa9f700d098";

@XendraTrl(Identifier="7425a6bb-1d72-8645-587e-9ce0a90eb2ba")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7425a6bb-1d72-8645-587e-9ce0a90eb2ba",
Synchronized="2019-08-30 22:24:31.0")
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
@XendraTrl(Identifier="779cc00d-94c6-40c7-8728-a77393d2e5f0")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="779cc00d-94c6-40c7-8728-a77393d2e5f0",
Synchronized="2019-08-30 22:24:31.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Message Type.
@param MailMsgType Mail Message Type */
public void setMailMsgType (String MailMsgType)
{
if (MailMsgType.length() > 2)
{
log.warning("Length > 2 - truncated");
MailMsgType = MailMsgType.substring(0,1);
}
set_Value (COLUMNNAME_MailMsgType, MailMsgType);
}
/** Get Message Type.
@return Mail Message Type */
public String getMailMsgType() 
{
return (String)get_Value(COLUMNNAME_MailMsgType);
}

@XendraTrl(Identifier="f06e3fd8-7f7f-cd18-5141-d24e05e81f42")
public static String es_PE_FIELD_WebStoreMessage_MessageType_Name="Tipo de Mensaje";

@XendraTrl(Identifier="f06e3fd8-7f7f-cd18-5141-d24e05e81f42")
public static String es_PE_FIELD_WebStoreMessage_MessageType_Description="Tipo de Mensaje de Email";

@XendraField(AD_Column_ID="MailMsgType",IsCentrallyMaintained=true,
AD_Tab_ID="ebe3c8b3-8a94-1a4a-d39e-3cd3bcc6a3bd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f06e3fd8-7f7f-cd18-5141-d24e05e81f42")
public static final String FIELDNAME_WebStoreMessage_MessageType="f06e3fd8-7f7f-cd18-5141-d24e05e81f42";

@XendraTrl(Identifier="eee73e93-2975-3d30-d620-4e36b0d6997d")
public static String es_PE_COLUMN_MailMsgType_Name="Tipo de Mensaje";

@XendraColumn(AD_Element_ID="f05ec27b-e9e8-9be0-af96-bf656fda002a",ColumnName="MailMsgType",
AD_Reference_ID=17,AD_Reference_Value_ID="738f4b78-ea64-b3f0-1d8f-e975090d8848",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="eee73e93-2975-3d30-d620-4e36b0d6997d",Synchronized="2019-08-30 22:24:31.0")
/** Column name MailMsgType */
public static final String COLUMNNAME_MailMsgType = "MailMsgType";
/** Set Message.
@param Message EMail Message */
public void setMessage (String Message)
{
if (Message == null) throw new IllegalArgumentException ("Message is mandatory.");
set_Value (COLUMNNAME_Message, Message);
}
/** Get Message.
@return EMail Message */
public String getMessage() 
{
String value = (String)get_Value(COLUMNNAME_Message);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="0fe9de72-2edf-e9b7-9f9e-a7befb7e0314")
public static String es_PE_FIELD_WebStoreMessage_Message_Name="Mensaje";

@XendraTrl(Identifier="0fe9de72-2edf-e9b7-9f9e-a7befb7e0314")
public static String es_PE_FIELD_WebStoreMessage_Message_Description="Mensaje email";

@XendraTrl(Identifier="0fe9de72-2edf-e9b7-9f9e-a7befb7e0314")
public static String es_PE_FIELD_WebStoreMessage_Message_Help="Mensaje de email";

@XendraField(AD_Column_ID="Message",IsCentrallyMaintained=true,
AD_Tab_ID="ebe3c8b3-8a94-1a4a-d39e-3cd3bcc6a3bd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0fe9de72-2edf-e9b7-9f9e-a7befb7e0314")
public static final String FIELDNAME_WebStoreMessage_Message="0fe9de72-2edf-e9b7-9f9e-a7befb7e0314";

@XendraTrl(Identifier="1d918f2b-92bf-0e3c-a8c1-b68af5e80c49")
public static String es_PE_COLUMN_Message_Name="Mensaje";

@XendraColumn(AD_Element_ID="2bb1f4e6-4970-9212-47bb-51c6eb788a65",ColumnName="Message",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1d918f2b-92bf-0e3c-a8c1-b68af5e80c49",
Synchronized="2019-08-30 22:24:31.0")
/** Column name Message */
public static final String COLUMNNAME_Message = "Message";
/** Set Message 2.
@param Message2 Optional second part of the EMail Message */
public void setMessage2 (String Message2)
{
set_Value (COLUMNNAME_Message2, Message2);
}
/** Get Message 2.
@return Optional second part of the EMail Message */
public String getMessage2() 
{
String value = (String)get_Value(COLUMNNAME_Message2);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="66873e98-7cbe-80ff-28fa-216e68b1eab7")
public static String es_PE_FIELD_WebStoreMessage_Message22_Name="Mensaje 2";

@XendraTrl(Identifier="66873e98-7cbe-80ff-28fa-216e68b1eab7")
public static String es_PE_FIELD_WebStoreMessage_Message22_Description="Segunda parte opcional para mensaje de email";

@XendraTrl(Identifier="66873e98-7cbe-80ff-28fa-216e68b1eab7")
public static String es_PE_FIELD_WebStoreMessage_Message22_Help="Segunda parte opcional para mensaje de email";

@XendraField(AD_Column_ID="Message2",IsCentrallyMaintained=true,
AD_Tab_ID="ebe3c8b3-8a94-1a4a-d39e-3cd3bcc6a3bd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="66873e98-7cbe-80ff-28fa-216e68b1eab7")
public static final String FIELDNAME_WebStoreMessage_Message22="66873e98-7cbe-80ff-28fa-216e68b1eab7";

@XendraTrl(Identifier="82efa131-3df6-5077-f66a-8f54f79c5f3b")
public static String es_PE_COLUMN_Message2_Name="Mensaje 2";

@XendraColumn(AD_Element_ID="2695dc9e-0d7f-e8bc-c1df-2b5c9a5a28b0",ColumnName="Message2",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="82efa131-3df6-5077-f66a-8f54f79c5f3b",
Synchronized="2019-08-30 22:24:31.0")
/** Column name Message2 */
public static final String COLUMNNAME_Message2 = "Message2";
/** Set Message 3.
@param Message3 Optional third part of the EMail Message */
public void setMessage3 (String Message3)
{
set_Value (COLUMNNAME_Message3, Message3);
}
/** Get Message 3.
@return Optional third part of the EMail Message */
public String getMessage3() 
{
String value = (String)get_Value(COLUMNNAME_Message3);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="61490701-890b-c0de-3317-d83ac5a9d9ee")
public static String es_PE_FIELD_WebStoreMessage_Message33_Name="Mensaje 3";

@XendraTrl(Identifier="61490701-890b-c0de-3317-d83ac5a9d9ee")
public static String es_PE_FIELD_WebStoreMessage_Message33_Description="Tercera parte opcional para mensaje de email";

@XendraTrl(Identifier="61490701-890b-c0de-3317-d83ac5a9d9ee")
public static String es_PE_FIELD_WebStoreMessage_Message33_Help="Tercera parte opcional para mensaje de email";

@XendraField(AD_Column_ID="Message3",IsCentrallyMaintained=true,
AD_Tab_ID="ebe3c8b3-8a94-1a4a-d39e-3cd3bcc6a3bd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="61490701-890b-c0de-3317-d83ac5a9d9ee")
public static final String FIELDNAME_WebStoreMessage_Message33="61490701-890b-c0de-3317-d83ac5a9d9ee";

@XendraTrl(Identifier="d64d6070-f814-2225-1c6e-f19d738831ce")
public static String es_PE_COLUMN_Message3_Name="Mensaje 3";

@XendraColumn(AD_Element_ID="eb1c44e1-41ff-5975-7622-ac076283dbf6",ColumnName="Message3",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d64d6070-f814-2225-1c6e-f19d738831ce",
Synchronized="2019-08-30 22:24:31.0")
/** Column name Message3 */
public static final String COLUMNNAME_Message3 = "Message3";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name == null) throw new IllegalArgumentException ("Name is mandatory.");
if (Name.length() > 60)
{
log.warning("Length > 60 - truncated");
Name = Name.substring(0,59);
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getName());
}

@XendraTrl(Identifier="b37c006f-615f-66de-aa4d-e9354789f1f1")
public static String es_PE_FIELD_WebStoreMessage_Name_Name="Nombre";

@XendraTrl(Identifier="b37c006f-615f-66de-aa4d-e9354789f1f1")
public static String es_PE_FIELD_WebStoreMessage_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="b37c006f-615f-66de-aa4d-e9354789f1f1")
public static String es_PE_FIELD_WebStoreMessage_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="ebe3c8b3-8a94-1a4a-d39e-3cd3bcc6a3bd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b37c006f-615f-66de-aa4d-e9354789f1f1")
public static final String FIELDNAME_WebStoreMessage_Name="b37c006f-615f-66de-aa4d-e9354789f1f1";

@XendraTrl(Identifier="27fc724e-2879-fb4d-1443-e9dabbd20a00")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="27fc724e-2879-fb4d-1443-e9dabbd20a00",
Synchronized="2019-08-30 22:24:31.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Subject.
@param Subject Email Message Subject */
public void setSubject (String Subject)
{
if (Subject == null) throw new IllegalArgumentException ("Subject is mandatory.");
set_Value (COLUMNNAME_Subject, Subject);
}
/** Get Subject.
@return Email Message Subject */
public String getSubject() 
{
String value = (String)get_Value(COLUMNNAME_Subject);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="aa9170d6-4824-76f4-ead8-aa2f2ceb91ef")
public static String es_PE_FIELD_WebStoreMessage_Subject_Name="Asunto";

@XendraTrl(Identifier="aa9170d6-4824-76f4-ead8-aa2f2ceb91ef")
public static String es_PE_FIELD_WebStoreMessage_Subject_Description="Asunto del mensaje de Email";

@XendraTrl(Identifier="aa9170d6-4824-76f4-ead8-aa2f2ceb91ef")
public static String es_PE_FIELD_WebStoreMessage_Subject_Help="Asunto del mensaje de Email";

@XendraField(AD_Column_ID="Subject",IsCentrallyMaintained=true,
AD_Tab_ID="ebe3c8b3-8a94-1a4a-d39e-3cd3bcc6a3bd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aa9170d6-4824-76f4-ead8-aa2f2ceb91ef")
public static final String FIELDNAME_WebStoreMessage_Subject="aa9170d6-4824-76f4-ead8-aa2f2ceb91ef";

@XendraTrl(Identifier="3d820280-8015-7547-d709-f73c39c1c064")
public static String es_PE_COLUMN_Subject_Name="Asunto";

@XendraColumn(AD_Element_ID="63bfabf2-dc90-74a1-d263-1c960c7a71bd",ColumnName="Subject",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3d820280-8015-7547-d709-f73c39c1c064",
Synchronized="2019-08-30 22:24:31.0")
/** Column name Subject */
public static final String COLUMNNAME_Subject = "Subject";
/** Set Mail Message.
@param W_MailMsg_ID Web Store Mail Message Template */
public void setW_MailMsg_ID (int W_MailMsg_ID)
{
if (W_MailMsg_ID < 1) throw new IllegalArgumentException ("W_MailMsg_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_W_MailMsg_ID, Integer.valueOf(W_MailMsg_ID));
}
/** Get Mail Message.
@return Web Store Mail Message Template */
public int getW_MailMsg_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_W_MailMsg_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6992373e-7fcd-6e39-41cc-63de3d636a72")
public static String es_PE_FIELD_WebStoreMessage_MailMessage_Name="Mensaje de Correo";

@XendraTrl(Identifier="6992373e-7fcd-6e39-41cc-63de3d636a72")
public static String es_PE_FIELD_WebStoreMessage_MailMessage_Description="Almacen de la Web plantilla del mensaje del mail";

@XendraField(AD_Column_ID="W_MailMsg_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ebe3c8b3-8a94-1a4a-d39e-3cd3bcc6a3bd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6992373e-7fcd-6e39-41cc-63de3d636a72")
public static final String FIELDNAME_WebStoreMessage_MailMessage="6992373e-7fcd-6e39-41cc-63de3d636a72";
/** Column name W_MailMsg_ID */
public static final String COLUMNNAME_W_MailMsg_ID = "W_MailMsg_ID";
/** Set Web Store.
@param W_Store_ID A Web Store of the Client */
public void setW_Store_ID (int W_Store_ID)
{
if (W_Store_ID < 1) throw new IllegalArgumentException ("W_Store_ID is mandatory.");
set_Value (COLUMNNAME_W_Store_ID, Integer.valueOf(W_Store_ID));
}
/** Get Web Store.
@return A Web Store of the Client */
public int getW_Store_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_W_Store_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5cfd1d01-e7db-c2c8-8757-edcfb0e1b78b")
public static String es_PE_FIELD_WebStoreMessage_WebStore_Name="Tienda Web";

@XendraTrl(Identifier="5cfd1d01-e7db-c2c8-8757-edcfb0e1b78b")
public static String es_PE_FIELD_WebStoreMessage_WebStore_Description="Una tienda Web del cliente.";

@XendraField(AD_Column_ID="W_Store_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ebe3c8b3-8a94-1a4a-d39e-3cd3bcc6a3bd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5cfd1d01-e7db-c2c8-8757-edcfb0e1b78b")
public static final String FIELDNAME_WebStoreMessage_WebStore="5cfd1d01-e7db-c2c8-8757-edcfb0e1b78b";

@XendraTrl(Identifier="f9ed5511-d203-28b1-1cc4-a5a19318bc8e")
public static String es_PE_COLUMN_W_Store_ID_Name="Tienda Web";

@XendraColumn(AD_Element_ID="42d75c27-e3e8-fa93-6e24-84b118ff8263",ColumnName="W_Store_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f9ed5511-d203-28b1-1cc4-a5a19318bc8e",
Synchronized="2019-08-30 22:24:31.0")
/** Column name W_Store_ID */
public static final String COLUMNNAME_W_Store_ID = "W_Store_ID";
}
