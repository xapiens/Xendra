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
import org.compiere.model.reference.REF__YesNo;
/** Generated Model for AD_UserMail
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_UserMail extends PO
{
/** Standard Constructor
@param ctx context
@param AD_UserMail_ID id
@param trxName transaction
*/
public X_AD_UserMail (Properties ctx, int AD_UserMail_ID, String trxName)
{
super (ctx, AD_UserMail_ID, trxName);
/** if (AD_UserMail_ID == 0)
{
setAD_User_ID (0);
setAD_UserMail_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_UserMail (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=782 */
public static int Table_ID=MTable.getTable_ID("AD_UserMail");

@XendraTrl(Identifier="fae19742-c3d2-8d4f-af2a-f7944346d11f")
public static String es_PE_TAB_UserMail_Description="Mail enviado al usario";

@XendraTrl(Identifier="fae19742-c3d2-8d4f-af2a-f7944346d11f")
public static String es_PE_TAB_UserMail_Name="Usuario de Mail";
@XendraTab(Name="User Mail",
Description="Mail sent to the user",Help="",AD_Window_ID="ea9f92ec-2db4-81ea-5d61-b74093404bad",
SeqNo=30,TabLevel=1,IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="40c4d38e-d885-9bb9-c747-c4fbb36a322c",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="fae19742-c3d2-8d4f-af2a-f7944346d11f",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_UserMail="fae19742-c3d2-8d4f-af2a-f7944346d11f";

@XendraTrl(Identifier="3777fd79-705a-ae18-7f4b-c68790b5470e")
public static String es_PE_TAB_UserMail2_Description="Mail enviado para el usuario";

@XendraTrl(Identifier="3777fd79-705a-ae18-7f4b-c68790b5470e")
public static String es_PE_TAB_UserMail2_Name="Usuario de Mail";

@XendraTrl(Identifier="3777fd79-705a-ae18-7f4b-c68790b5470e")
public static String es_PE_TAB_UserMail2_Help="Archivos de mails enviados para usuarios";

@XendraTab(Name="User Mail",Description="Mail sent to the user",
Help="Archive of mails sent to users",AD_Window_ID="9f3c1c3a-ab4f-0018-8a1e-b6cfbdbe8e7b",SeqNo=60,
TabLevel=1,IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="",HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,IsAdvancedTab=true,Parent_Column_ID="",
Identifier="3777fd79-705a-ae18-7f4b-c68790b5470e",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_UserMail2="3777fd79-705a-ae18-7f4b-c68790b5470e";

@XendraTrl(Identifier="24fd7b26-d24d-720e-7679-56aa76355283")
public static String es_PE_TABLE_AD_UserMail_Name="Mail para Usuario";

@XendraTable(Name="User Mail",Description="Mail sent to the user",Help="",TableName="AD_UserMail",
AccessLevel="7",AD_Window_ID="9f3c1c3a-ab4f-0018-8a1e-b6cfbdbe8e7b",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="24fd7b26-d24d-720e-7679-56aa76355283",Synchronized="2017-08-16 11:41:07.0")
/** TableName=AD_UserMail */
public static final String Table_Name="AD_UserMail";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_UserMail");

protected BigDecimal accessLevel = BigDecimal.valueOf(7);
/** AccessLevel
@return 7 - System - Client - Org 
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
    Table_ID = MTable.getTable_ID("AD_UserMail");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_UserMail[").append(get_ID()).append("]");
return sb.toString();
}
/** Set User/Contact.
@param AD_User_ID User within the system - Internal or Business Partner Contact */
public void setAD_User_ID (int AD_User_ID)
{
if (AD_User_ID < 1) throw new IllegalArgumentException ("AD_User_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
}
/** Get User/Contact.
@return User within the system - Internal or Business Partner Contact */
public int getAD_User_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getAD_User_ID()));
}

@XendraTrl(Identifier="07e92d9f-a977-d118-9fd8-ecee2d6d64c2")
public static String es_PE_FIELD_UserMail_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="07e92d9f-a977-d118-9fd8-ecee2d6d64c2")
public static String es_PE_FIELD_UserMail_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="07e92d9f-a977-d118-9fd8-ecee2d6d64c2")
public static String es_PE_FIELD_UserMail_UserContact_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fae19742-c3d2-8d4f-af2a-f7944346d11f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=50,SortNo=1,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="07e92d9f-a977-d118-9fd8-ecee2d6d64c2")
public static final String FIELDNAME_UserMail_UserContact="07e92d9f-a977-d118-9fd8-ecee2d6d64c2";

@XendraTrl(Identifier="632a60e3-8a40-f456-28c2-6ca0ef1b0402")
public static String es_PE_FIELD_UserMail_UserContact2_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="632a60e3-8a40-f456-28c2-6ca0ef1b0402")
public static String es_PE_FIELD_UserMail_UserContact2_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="632a60e3-8a40-f456-28c2-6ca0ef1b0402")
public static String es_PE_FIELD_UserMail_UserContact2_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3777fd79-705a-ae18-7f4b-c68790b5470e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="632a60e3-8a40-f456-28c2-6ca0ef1b0402")
public static final String FIELDNAME_UserMail_UserContact2="632a60e3-8a40-f456-28c2-6ca0ef1b0402";

@XendraTrl(Identifier="9704fcad-8e19-c901-bc04-40bcbbcf3793")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9704fcad-8e19-c901-bc04-40bcbbcf3793",
Synchronized="2017-08-05 16:52:57.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set User Mail.
@param AD_UserMail_ID Mail sent to the user */
public void setAD_UserMail_ID (int AD_UserMail_ID)
{
if (AD_UserMail_ID < 1) throw new IllegalArgumentException ("AD_UserMail_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_UserMail_ID, Integer.valueOf(AD_UserMail_ID));
}
/** Get User Mail.
@return Mail sent to the user */
public int getAD_UserMail_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_UserMail_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="cc9b76c4-1087-1479-5e88-794f1cffaf2e")
public static String es_PE_FIELD_UserMail_UserMail_Description="Mail enviado a usuario";

@XendraTrl(Identifier="cc9b76c4-1087-1479-5e88-794f1cffaf2e")
public static String es_PE_FIELD_UserMail_UserMail_Help="Control de mails enviados a usuarios";

@XendraTrl(Identifier="cc9b76c4-1087-1479-5e88-794f1cffaf2e")
public static String es_PE_FIELD_UserMail_UserMail_Name="Mail para Usuario";

@XendraField(AD_Column_ID="AD_UserMail_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fae19742-c3d2-8d4f-af2a-f7944346d11f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cc9b76c4-1087-1479-5e88-794f1cffaf2e")
public static final String FIELDNAME_UserMail_UserMail="cc9b76c4-1087-1479-5e88-794f1cffaf2e";

@XendraTrl(Identifier="642367d9-5ddd-eb31-8097-52b91bf90c4f")
public static String es_PE_FIELD_UserMail_UserMail2_Description="Mail enviado a usuario";

@XendraTrl(Identifier="642367d9-5ddd-eb31-8097-52b91bf90c4f")
public static String es_PE_FIELD_UserMail_UserMail2_Help="Control de mails enviados a usuarios";

@XendraTrl(Identifier="642367d9-5ddd-eb31-8097-52b91bf90c4f")
public static String es_PE_FIELD_UserMail_UserMail2_Name="Mail para Usuario";

@XendraField(AD_Column_ID="AD_UserMail_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3777fd79-705a-ae18-7f4b-c68790b5470e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="642367d9-5ddd-eb31-8097-52b91bf90c4f")
public static final String FIELDNAME_UserMail_UserMail2="642367d9-5ddd-eb31-8097-52b91bf90c4f";
/** Column name AD_UserMail_ID */
public static final String COLUMNNAME_AD_UserMail_ID = "AD_UserMail_ID";
/** Set Delivery Confirmation.
@param DeliveryConfirmation EMail Delivery confirmation */
public void setDeliveryConfirmation (String DeliveryConfirmation)
{
if (DeliveryConfirmation != null && DeliveryConfirmation.length() > 120)
{
log.warning("Length > 120 - truncated");
DeliveryConfirmation = DeliveryConfirmation.substring(0,119);
}
set_ValueNoCheck (COLUMNNAME_DeliveryConfirmation, DeliveryConfirmation);
}
/** Get Delivery Confirmation.
@return EMail Delivery confirmation */
public String getDeliveryConfirmation() 
{
String value = (String)get_Value(COLUMNNAME_DeliveryConfirmation);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c5be66a2-35ac-11aa-9099-2b551fc9c8ec")
public static String es_PE_FIELD_UserMail_DeliveryConfirmation_Description="Confirmación de Entrega de Email";

@XendraTrl(Identifier="c5be66a2-35ac-11aa-9099-2b551fc9c8ec")
public static String es_PE_FIELD_UserMail_DeliveryConfirmation_Name="Confirmación de Entrega";

@XendraField(AD_Column_ID="DeliveryConfirmation",IsCentrallyMaintained=true,
AD_Tab_ID="fae19742-c3d2-8d4f-af2a-f7944346d11f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c5be66a2-35ac-11aa-9099-2b551fc9c8ec")
public static final String FIELDNAME_UserMail_DeliveryConfirmation="c5be66a2-35ac-11aa-9099-2b551fc9c8ec";

@XendraTrl(Identifier="65628b06-b7b4-9214-bb7e-3179bb37874a")
public static String es_PE_FIELD_UserMail_DeliveryConfirmation2_Description="Confirmación de Entrega de Email";

@XendraTrl(Identifier="65628b06-b7b4-9214-bb7e-3179bb37874a")
public static String es_PE_FIELD_UserMail_DeliveryConfirmation2_Name="Confirmación de Entrega";

@XendraField(AD_Column_ID="DeliveryConfirmation",IsCentrallyMaintained=true,
AD_Tab_ID="3777fd79-705a-ae18-7f4b-c68790b5470e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="65628b06-b7b4-9214-bb7e-3179bb37874a")
public static final String FIELDNAME_UserMail_DeliveryConfirmation2="65628b06-b7b4-9214-bb7e-3179bb37874a";

@XendraTrl(Identifier="49b193e1-4aa9-a2d6-2771-128498413b4a")
public static String es_PE_COLUMN_DeliveryConfirmation_Name="Confirmación de Entrega";

@XendraColumn(AD_Element_ID="38673076-a40a-4a66-5f92-24969847c375",
ColumnName="DeliveryConfirmation",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=120,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="49b193e1-4aa9-a2d6-2771-128498413b4a",Synchronized="2017-08-05 16:52:57.0")
/** Column name DeliveryConfirmation */
public static final String COLUMNNAME_DeliveryConfirmation = "DeliveryConfirmation";
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
@XendraTrl(Identifier="2f29d270-dda8-46b6-8036-b0a90f7f8d9c")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2f29d270-dda8-46b6-8036-b0a90f7f8d9c",
Synchronized="2017-08-05 16:52:58.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";

/** IsDelivered AD_Reference=9d5d423d-1f38-e653-2094-21cc989d1234 */
public static final int ISDELIVERED_AD_Reference_ID=319;
/** Set Delivered.
@param IsDelivered Delivered */
public void setIsDelivered (String IsDelivered)
{
if (IsDelivered == null || IsDelivered.equals(REF__YesNo.Yes) || IsDelivered.equals(REF__YesNo.No));
 else throw new IllegalArgumentException ("IsDelivered Invalid value - " + IsDelivered + " - Reference_ID=319 - Y - N");
if (IsDelivered != null && IsDelivered.length() > 1)
{
log.warning("Length > 1 - truncated");
IsDelivered = IsDelivered.substring(0,0);
}
set_ValueNoCheck (COLUMNNAME_IsDelivered, IsDelivered);
}
/** Get Delivered.
@return Delivered */
public String getIsDelivered() 
{
return (String)get_Value(COLUMNNAME_IsDelivered);
}

@XendraTrl(Identifier="36093710-ea31-3cd4-4ac2-aad4e235ebe4")
public static String es_PE_FIELD_UserMail_Delivered_Name="Entregado";

@XendraField(AD_Column_ID="IsDelivered",IsCentrallyMaintained=true,
AD_Tab_ID="fae19742-c3d2-8d4f-af2a-f7944346d11f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="36093710-ea31-3cd4-4ac2-aad4e235ebe4")
public static final String FIELDNAME_UserMail_Delivered="36093710-ea31-3cd4-4ac2-aad4e235ebe4";

@XendraTrl(Identifier="f38506c2-810a-f349-fb09-3bf2b098b3dc")
public static String es_PE_FIELD_UserMail_Delivered2_Name="Entregado";

@XendraField(AD_Column_ID="IsDelivered",IsCentrallyMaintained=true,
AD_Tab_ID="3777fd79-705a-ae18-7f4b-c68790b5470e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f38506c2-810a-f349-fb09-3bf2b098b3dc")
public static final String FIELDNAME_UserMail_Delivered2="f38506c2-810a-f349-fb09-3bf2b098b3dc";

@XendraTrl(Identifier="9b785079-67f1-d37f-9667-be0cb1bbaee3")
public static String es_PE_COLUMN_IsDelivered_Name="Entregado";

@XendraColumn(AD_Element_ID="2ff67353-25ec-8625-2649-c1fb3daa06b7",ColumnName="IsDelivered",
AD_Reference_ID=17,AD_Reference_Value_ID="9d5d423d-1f38-e653-2094-21cc989d1234",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9b785079-67f1-d37f-9667-be0cb1bbaee3",Synchronized="2017-08-05 16:52:58.0")
/** Column name IsDelivered */
public static final String COLUMNNAME_IsDelivered = "IsDelivered";
/** Set Mail Text.
@param MailText Text used for Mail message */
public void setMailText (String MailText)
{
set_Value (COLUMNNAME_MailText, MailText);
}
/** Get Mail Text.
@return Text used for Mail message */
public String getMailText() 
{
String value = (String)get_Value(COLUMNNAME_MailText);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="623c3bfe-9113-b41d-ef09-58ad83081fd1")
public static String es_PE_FIELD_UserMail_MailText_Description="Texto usado para mensajes de correo";

@XendraTrl(Identifier="623c3bfe-9113-b41d-ef09-58ad83081fd1")
public static String es_PE_FIELD_UserMail_MailText_Help="El texto de correo indica el texto usado para mensajes de correo.";

@XendraTrl(Identifier="623c3bfe-9113-b41d-ef09-58ad83081fd1")
public static String es_PE_FIELD_UserMail_MailText_Name="Texto del Correo";

@XendraField(AD_Column_ID="MailText",IsCentrallyMaintained=true,
AD_Tab_ID="3777fd79-705a-ae18-7f4b-c68790b5470e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@R_MailText_ID@=0 & @W_MailMsg_ID@=0",DisplayLength=2000,IsReadOnly=false,SeqNo=90,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="623c3bfe-9113-b41d-ef09-58ad83081fd1")
public static final String FIELDNAME_UserMail_MailText="623c3bfe-9113-b41d-ef09-58ad83081fd1";

@XendraTrl(Identifier="a4479d77-dde2-b340-678d-5f6a829388aa")
public static String es_PE_COLUMN_MailText_Name="Texto del Correo";

@XendraColumn(AD_Element_ID="d5e995a9-c611-6ca1-fa1e-2f71ea10cf48",ColumnName="MailText",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a4479d77-dde2-b340-678d-5f6a829388aa",
Synchronized="2017-08-05 16:52:58.0")
/** Column name MailText */
public static final String COLUMNNAME_MailText = "MailText";
/** Set Message ID.
@param MessageID EMail Message ID */
public void setMessageID (String MessageID)
{
if (MessageID != null && MessageID.length() > 120)
{
log.warning("Length > 120 - truncated");
MessageID = MessageID.substring(0,119);
}
set_ValueNoCheck (COLUMNNAME_MessageID, MessageID);
}
/** Get Message ID.
@return EMail Message ID */
public String getMessageID() 
{
String value = (String)get_Value(COLUMNNAME_MessageID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="2b6643af-8206-9639-decf-9169ead0f3ee")
public static String es_PE_FIELD_UserMail_MessageID_Description="ID del mensaje de Email";

@XendraTrl(Identifier="2b6643af-8206-9639-decf-9169ead0f3ee")
public static String es_PE_FIELD_UserMail_MessageID_Help="SMTP de ID del mensaje para los propósitos siguientes.";

@XendraTrl(Identifier="2b6643af-8206-9639-decf-9169ead0f3ee")
public static String es_PE_FIELD_UserMail_MessageID_Name="ID Mensaje";

@XendraField(AD_Column_ID="MessageID",IsCentrallyMaintained=true,
AD_Tab_ID="fae19742-c3d2-8d4f-af2a-f7944346d11f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2b6643af-8206-9639-decf-9169ead0f3ee")
public static final String FIELDNAME_UserMail_MessageID="2b6643af-8206-9639-decf-9169ead0f3ee";

@XendraTrl(Identifier="0224e371-b61e-aec8-d61e-38f6d3994b0f")
public static String es_PE_FIELD_UserMail_MessageID2_Description="ID del mensaje de Email";

@XendraTrl(Identifier="0224e371-b61e-aec8-d61e-38f6d3994b0f")
public static String es_PE_FIELD_UserMail_MessageID2_Help="SMTP de ID del mensaje para los propósitos siguientes.";

@XendraTrl(Identifier="0224e371-b61e-aec8-d61e-38f6d3994b0f")
public static String es_PE_FIELD_UserMail_MessageID2_Name="ID Mensaje";

@XendraField(AD_Column_ID="MessageID",IsCentrallyMaintained=true,
AD_Tab_ID="3777fd79-705a-ae18-7f4b-c68790b5470e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0224e371-b61e-aec8-d61e-38f6d3994b0f")
public static final String FIELDNAME_UserMail_MessageID2="0224e371-b61e-aec8-d61e-38f6d3994b0f";

@XendraTrl(Identifier="b3a592f1-d1d2-0fab-df92-ecbbe4f8ff82")
public static String es_PE_COLUMN_MessageID_Name="ID Mensaje";

@XendraColumn(AD_Element_ID="6459ca78-93e4-8f39-38ea-8984599e606b",ColumnName="MessageID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b3a592f1-d1d2-0fab-df92-ecbbe4f8ff82",
Synchronized="2017-08-05 16:52:58.0")
/** Column name MessageID */
public static final String COLUMNNAME_MessageID = "MessageID";
/** Set Mail Template.
@param R_MailText_ID Text templates for mailings */
public void setR_MailText_ID (int R_MailText_ID)
{
if (R_MailText_ID <= 0) set_ValueNoCheck (COLUMNNAME_R_MailText_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_R_MailText_ID, Integer.valueOf(R_MailText_ID));
}
/** Get Mail Template.
@return Text templates for mailings */
public int getR_MailText_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_MailText_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e8e571ae-28c4-0a4f-aa4c-11898cbc1698")
public static String es_PE_FIELD_UserMail_MailTemplate_Description="Patrón de texto para correos.";

@XendraTrl(Identifier="e8e571ae-28c4-0a4f-aa4c-11898cbc1698")
public static String es_PE_FIELD_UserMail_MailTemplate_Help="El patrón de correo indica el patrón de correo para mensajes de retorno.";

@XendraTrl(Identifier="e8e571ae-28c4-0a4f-aa4c-11898cbc1698")
public static String es_PE_FIELD_UserMail_MailTemplate_Name="Patrón de Correo";

@XendraField(AD_Column_ID="R_MailText_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fae19742-c3d2-8d4f-af2a-f7944346d11f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e8e571ae-28c4-0a4f-aa4c-11898cbc1698")
public static final String FIELDNAME_UserMail_MailTemplate="e8e571ae-28c4-0a4f-aa4c-11898cbc1698";

@XendraTrl(Identifier="ed9481bd-e0e3-7dfc-ffc9-613c4b1c5cb4")
public static String es_PE_FIELD_UserMail_MailTemplate2_Description="Patrón de texto para correos.";

@XendraTrl(Identifier="ed9481bd-e0e3-7dfc-ffc9-613c4b1c5cb4")
public static String es_PE_FIELD_UserMail_MailTemplate2_Help="El patrón de correo indica el patrón de correo para mensajes de retorno.";

@XendraTrl(Identifier="ed9481bd-e0e3-7dfc-ffc9-613c4b1c5cb4")
public static String es_PE_FIELD_UserMail_MailTemplate2_Name="Patrón de Correo";

@XendraField(AD_Column_ID="R_MailText_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3777fd79-705a-ae18-7f4b-c68790b5470e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ed9481bd-e0e3-7dfc-ffc9-613c4b1c5cb4")
public static final String FIELDNAME_UserMail_MailTemplate2="ed9481bd-e0e3-7dfc-ffc9-613c4b1c5cb4";

@XendraTrl(Identifier="40c4d38e-d885-9bb9-c747-c4fbb36a322c")
public static String es_PE_COLUMN_R_MailText_ID_Name="Patrón de Correo";

@XendraColumn(AD_Element_ID="02b75e55-f80b-d8c7-5f34-dfc8b6205e3e",ColumnName="R_MailText_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="40c4d38e-d885-9bb9-c747-c4fbb36a322c",
Synchronized="2017-08-05 16:52:58.0")
/** Column name R_MailText_ID */
public static final String COLUMNNAME_R_MailText_ID = "R_MailText_ID";
/** Set Subject.
@param Subject Email Message Subject */
public void setSubject (String Subject)
{
if (Subject != null && Subject.length() > 255)
{
log.warning("Length > 255 - truncated");
Subject = Subject.substring(0,254);
}
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
@XendraTrl(Identifier="7ee69da2-3640-5981-139d-c044ccc8a509")
public static String es_PE_FIELD_UserMail_Subject_Description="Asunto del mensaje de Email";

@XendraTrl(Identifier="7ee69da2-3640-5981-139d-c044ccc8a509")
public static String es_PE_FIELD_UserMail_Subject_Help="Asunto del mensaje de Email";

@XendraTrl(Identifier="7ee69da2-3640-5981-139d-c044ccc8a509")
public static String es_PE_FIELD_UserMail_Subject_Name="Asunto";

@XendraField(AD_Column_ID="Subject",IsCentrallyMaintained=true,
AD_Tab_ID="3777fd79-705a-ae18-7f4b-c68790b5470e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@R_MailText_ID@=0 & @W_MailMsg_ID@=0",DisplayLength=60,IsReadOnly=false,SeqNo=80,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="7ee69da2-3640-5981-139d-c044ccc8a509")
public static final String FIELDNAME_UserMail_Subject="7ee69da2-3640-5981-139d-c044ccc8a509";

@XendraTrl(Identifier="912d4d78-6968-3fb7-aa75-b5767fe9d8b0")
public static String es_PE_COLUMN_Subject_Name="Asunto";

@XendraColumn(AD_Element_ID="63bfabf2-dc90-74a1-d263-1c960c7a71bd",ColumnName="Subject",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="912d4d78-6968-3fb7-aa75-b5767fe9d8b0",
Synchronized="2017-08-05 16:52:58.0")
/** Column name Subject */
public static final String COLUMNNAME_Subject = "Subject";
/** Set Mail Message.
@param W_MailMsg_ID Web Store Mail Message Template */
public void setW_MailMsg_ID (int W_MailMsg_ID)
{
if (W_MailMsg_ID <= 0) set_ValueNoCheck (COLUMNNAME_W_MailMsg_ID, null);
 else 
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

@XendraTrl(Identifier="c1142881-381c-d3ef-6a95-dc7190faab78")
public static String es_PE_FIELD_UserMail_MailMessage_Description="Almacen de la Web plantilla del mensaje del mail";

@XendraTrl(Identifier="c1142881-381c-d3ef-6a95-dc7190faab78")
public static String es_PE_FIELD_UserMail_MailMessage_Name="Mensaje de Correo";

@XendraField(AD_Column_ID="W_MailMsg_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fae19742-c3d2-8d4f-af2a-f7944346d11f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c1142881-381c-d3ef-6a95-dc7190faab78")
public static final String FIELDNAME_UserMail_MailMessage="c1142881-381c-d3ef-6a95-dc7190faab78";

@XendraTrl(Identifier="a3644e5f-7f87-7378-2410-81bc859a5bdf")
public static String es_PE_FIELD_UserMail_MailMessage2_Description="Almacen de la Web plantilla del mensaje del mail";

@XendraTrl(Identifier="a3644e5f-7f87-7378-2410-81bc859a5bdf")
public static String es_PE_FIELD_UserMail_MailMessage2_Name="Mensaje de Correo";

@XendraField(AD_Column_ID="W_MailMsg_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3777fd79-705a-ae18-7f4b-c68790b5470e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=50,SortNo=2,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a3644e5f-7f87-7378-2410-81bc859a5bdf")
public static final String FIELDNAME_UserMail_MailMessage2="a3644e5f-7f87-7378-2410-81bc859a5bdf";

@XendraTrl(Identifier="6a04e2fd-a540-e611-d26f-2d00e4f4877b")
public static String es_PE_COLUMN_W_MailMsg_ID_Name="Mensaje de Correo";

@XendraColumn(AD_Element_ID="96e61b22-0d18-90f6-8a0f-ff6c13fb1c1d",ColumnName="W_MailMsg_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6a04e2fd-a540-e611-d26f-2d00e4f4877b",
Synchronized="2017-08-05 16:52:58.0")
/** Column name W_MailMsg_ID */
public static final String COLUMNNAME_W_MailMsg_ID = "W_MailMsg_ID";
}
