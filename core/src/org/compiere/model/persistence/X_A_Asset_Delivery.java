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
/** Generated Model for A_Asset_Delivery
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_A_Asset_Delivery extends PO
{
/** Standard Constructor
@param ctx context
@param A_Asset_Delivery_ID id
@param trxName transaction
*/
public X_A_Asset_Delivery (Properties ctx, int A_Asset_Delivery_ID, String trxName)
{
super (ctx, A_Asset_Delivery_ID, trxName);
/** if (A_Asset_Delivery_ID == 0)
{
setA_Asset_Delivery_ID (0);
setA_Asset_ID (0);
setMovementDate (new Timestamp(System.currentTimeMillis()));
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_A_Asset_Delivery (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=541 */
public static int Table_ID=MTable.getTable_ID("A_Asset_Delivery");

@XendraTrl(Identifier="5fc15ccb-bcab-359e-3910-2392fcb4e75d")
public static String es_PE_TAB_Delivery_Description="Entrega ó disponibilidad";

@XendraTrl(Identifier="5fc15ccb-bcab-359e-3910-2392fcb4e75d")
public static String es_PE_TAB_Delivery_Name="Entrega";

@XendraTrl(Identifier="5fc15ccb-bcab-359e-3910-2392fcb4e75d")
public static String es_PE_TAB_Delivery_Help="Registro de la entrega ó disponibilidad";

@XendraTab(Name="Delivery",Description="Delivery or availability",
Help="Record of delivery or availability",AD_Window_ID="53561d65-4ae5-81a3-c14b-9b09382be0fe",
SeqNo=20,TabLevel=1,IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="",HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="5fc15ccb-bcab-359e-3910-2392fcb4e75d",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Delivery="5fc15ccb-bcab-359e-3910-2392fcb4e75d";

@XendraTrl(Identifier="ef866b7e-9066-c7b7-e87e-08370bb5903e")
public static String es_PE_TABLE_A_Asset_Delivery_Name="Entrega de Activo";

@XendraTable(Name="Asset Delivery",Description="Delivery of Asset",Help="",
TableName="A_Asset_Delivery",AccessLevel="3",AD_Window_ID="53561d65-4ae5-81a3-c14b-9b09382be0fe",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.asset",
Identifier="ef866b7e-9066-c7b7-e87e-08370bb5903e",Synchronized="2017-08-16 11:39:56.0")
/** TableName=A_Asset_Delivery */
public static final String Table_Name="A_Asset_Delivery";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"A_Asset_Delivery");

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
    Table_ID = MTable.getTable_ID("A_Asset_Delivery");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_A_Asset_Delivery[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Asset Delivery.
@param A_Asset_Delivery_ID Delivery of Asset */
public void setA_Asset_Delivery_ID (int A_Asset_Delivery_ID)
{
if (A_Asset_Delivery_ID < 1) throw new IllegalArgumentException ("A_Asset_Delivery_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_A_Asset_Delivery_ID, Integer.valueOf(A_Asset_Delivery_ID));
}
/** Get Asset Delivery.
@return Delivery of Asset */
public int getA_Asset_Delivery_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_Delivery_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="679a8afe-6785-24c6-0cef-eb3190b29612")
public static String es_PE_FIELD_Delivery_AssetDelivery_Description="Entrega de Activo";

@XendraTrl(Identifier="679a8afe-6785-24c6-0cef-eb3190b29612")
public static String es_PE_FIELD_Delivery_AssetDelivery_Help="La disponibilidad del activo para el socio de negocio (cliente).";

@XendraTrl(Identifier="679a8afe-6785-24c6-0cef-eb3190b29612")
public static String es_PE_FIELD_Delivery_AssetDelivery_Name="Entrega de Activo";

@XendraField(AD_Column_ID="A_Asset_Delivery_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5fc15ccb-bcab-359e-3910-2392fcb4e75d",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="679a8afe-6785-24c6-0cef-eb3190b29612")
public static final String FIELDNAME_Delivery_AssetDelivery="679a8afe-6785-24c6-0cef-eb3190b29612";
/** Column name A_Asset_Delivery_ID */
public static final String COLUMNNAME_A_Asset_Delivery_ID = "A_Asset_Delivery_ID";
/** Set Asset.
@param A_Asset_ID Asset used internally or by customers */
public void setA_Asset_ID (int A_Asset_ID)
{
if (A_Asset_ID < 1) throw new IllegalArgumentException ("A_Asset_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_A_Asset_ID, Integer.valueOf(A_Asset_ID));
}
/** Get Asset.
@return Asset used internally or by customers */
public int getA_Asset_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b57021bf-7981-48a0-9cd0-1d5c2ef86c3b")
public static String es_PE_FIELD_Delivery_Asset_Description="Activo usado por la compañía o sus clientes";

@XendraTrl(Identifier="b57021bf-7981-48a0-9cd0-1d5c2ef86c3b")
public static String es_PE_FIELD_Delivery_Asset_Help="Indica si es usado por la compañia o sus clientes";

@XendraTrl(Identifier="b57021bf-7981-48a0-9cd0-1d5c2ef86c3b")
public static String es_PE_FIELD_Delivery_Asset_Name="Activo";

@XendraField(AD_Column_ID="A_Asset_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5fc15ccb-bcab-359e-3910-2392fcb4e75d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b57021bf-7981-48a0-9cd0-1d5c2ef86c3b")
public static final String FIELDNAME_Delivery_Asset="b57021bf-7981-48a0-9cd0-1d5c2ef86c3b";

@XendraTrl(Identifier="1aa5ba32-a80a-6473-ba55-69277e435a5e")
public static String es_PE_COLUMN_A_Asset_ID_Name="Activo";

@XendraColumn(AD_Element_ID="3cd84c49-e25b-9ecc-5637-ed9a07d76bee",ColumnName="A_Asset_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1aa5ba32-a80a-6473-ba55-69277e435a5e",
Synchronized="2017-08-05 16:52:18.0")
/** Column name A_Asset_ID */
public static final String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
/** Set User/Contact.
@param AD_User_ID User within the system - Internal or Business Partner Contact */
public void setAD_User_ID (int AD_User_ID)
{
if (AD_User_ID <= 0) set_ValueNoCheck (COLUMNNAME_AD_User_ID, null);
 else 
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

@XendraTrl(Identifier="e235f988-027c-90ff-f15d-ea1b5d8f3ba9")
public static String es_PE_FIELD_Delivery_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="e235f988-027c-90ff-f15d-ea1b5d8f3ba9")
public static String es_PE_FIELD_Delivery_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="e235f988-027c-90ff-f15d-ea1b5d8f3ba9")
public static String es_PE_FIELD_Delivery_UserContact_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5fc15ccb-bcab-359e-3910-2392fcb4e75d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e235f988-027c-90ff-f15d-ea1b5d8f3ba9")
public static final String FIELDNAME_Delivery_UserContact="e235f988-027c-90ff-f15d-ea1b5d8f3ba9";

@XendraTrl(Identifier="69463ee3-4558-fb43-4b80-d5a04250f3bf")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="69463ee3-4558-fb43-4b80-d5a04250f3bf",
Synchronized="2017-08-05 16:52:18.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set Delivery Confirmation.
@param DeliveryConfirmation EMail Delivery confirmation */
public void setDeliveryConfirmation (String DeliveryConfirmation)
{
if (DeliveryConfirmation != null && DeliveryConfirmation.length() > 120)
{
log.warning("Length > 120 - truncated");
DeliveryConfirmation = DeliveryConfirmation.substring(0,119);
}
set_Value (COLUMNNAME_DeliveryConfirmation, DeliveryConfirmation);
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
@XendraTrl(Identifier="017fddab-31ae-85fd-f956-75ed037440de")
public static String es_PE_FIELD_Delivery_DeliveryConfirmation_Description="Confirmación de Entrega de Email";

@XendraTrl(Identifier="017fddab-31ae-85fd-f956-75ed037440de")
public static String es_PE_FIELD_Delivery_DeliveryConfirmation_Name="Confirmación de Entrega";

@XendraField(AD_Column_ID="DeliveryConfirmation",IsCentrallyMaintained=true,
AD_Tab_ID="5fc15ccb-bcab-359e-3910-2392fcb4e75d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="017fddab-31ae-85fd-f956-75ed037440de")
public static final String FIELDNAME_Delivery_DeliveryConfirmation="017fddab-31ae-85fd-f956-75ed037440de";

@XendraTrl(Identifier="66108043-7ac5-37fb-96cf-fd3abad4a9e9")
public static String es_PE_COLUMN_DeliveryConfirmation_Name="Confirmación de Entrega";

@XendraColumn(AD_Element_ID="38673076-a40a-4a66-5f92-24969847c375",
ColumnName="DeliveryConfirmation",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=120,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="66108043-7ac5-37fb-96cf-fd3abad4a9e9",Synchronized="2017-08-05 16:52:18.0")
/** Column name DeliveryConfirmation */
public static final String COLUMNNAME_DeliveryConfirmation = "DeliveryConfirmation";
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

@XendraTrl(Identifier="b88a3711-0124-2cd1-d4e8-4488adbfc508")
public static String es_PE_FIELD_Delivery_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="b88a3711-0124-2cd1-d4e8-4488adbfc508")
public static String es_PE_FIELD_Delivery_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="b88a3711-0124-2cd1-d4e8-4488adbfc508")
public static String es_PE_FIELD_Delivery_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="5fc15ccb-bcab-359e-3910-2392fcb4e75d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b88a3711-0124-2cd1-d4e8-4488adbfc508")
public static final String FIELDNAME_Delivery_Description="b88a3711-0124-2cd1-d4e8-4488adbfc508";

@XendraTrl(Identifier="ebf7f2bf-1755-e785-70df-cada53339fc2")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ebf7f2bf-1755-e785-70df-cada53339fc2",
Synchronized="2017-08-05 16:52:18.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set EMail Address.
@param EMail Electronic Mail Address */
public void setEMail (String EMail)
{
if (EMail != null && EMail.length() > 60)
{
log.warning("Length > 60 - truncated");
EMail = EMail.substring(0,59);
}
set_ValueNoCheck (COLUMNNAME_EMail, EMail);
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
@XendraTrl(Identifier="129c36bb-d89e-992a-e3cb-56540bf2090c")
public static String es_PE_FIELD_Delivery_EMailAddress_Description="ID de correo electrónico";

@XendraTrl(Identifier="129c36bb-d89e-992a-e3cb-56540bf2090c")
public static String es_PE_FIELD_Delivery_EMailAddress_Help="El Email indica la ID de correo electrónico para este usuario";

@XendraTrl(Identifier="129c36bb-d89e-992a-e3cb-56540bf2090c")
public static String es_PE_FIELD_Delivery_EMailAddress_Name="Email";

@XendraField(AD_Column_ID="EMail",IsCentrallyMaintained=true,
AD_Tab_ID="5fc15ccb-bcab-359e-3910-2392fcb4e75d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="129c36bb-d89e-992a-e3cb-56540bf2090c")
public static final String FIELDNAME_Delivery_EMailAddress="129c36bb-d89e-992a-e3cb-56540bf2090c";

@XendraTrl(Identifier="22680069-a4f6-9881-6a7f-3cc2d1522626")
public static String es_PE_COLUMN_EMail_Name="Email";

@XendraColumn(AD_Element_ID="d18b300c-9ad6-2dd2-36d3-b65969743158",ColumnName="EMail",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="22680069-a4f6-9881-6a7f-3cc2d1522626",
Synchronized="2017-08-05 16:52:18.0")
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
@XendraTrl(Identifier="616e4883-cde7-4693-aa15-47fba72c2016")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="616e4883-cde7-4693-aa15-47fba72c2016",
Synchronized="2017-08-05 16:52:18.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Lot No.
@param Lot Lot number (alphanumeric) */
public void setLot (String Lot)
{
if (Lot != null && Lot.length() > 40)
{
log.warning("Length > 40 - truncated");
Lot = Lot.substring(0,39);
}
set_ValueNoCheck (COLUMNNAME_Lot, Lot);
}
/** Get Lot No.
@return Lot number (alphanumeric) */
public String getLot() 
{
String value = (String)get_Value(COLUMNNAME_Lot);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="faf6ec82-3765-2bd6-0fbb-a831c61d73f8")
public static String es_PE_FIELD_Delivery_LotNo_Description="Número de Lote";

@XendraTrl(Identifier="faf6ec82-3765-2bd6-0fbb-a831c61d73f8")
public static String es_PE_FIELD_Delivery_LotNo_Help="Indica el número de lote específico del que un producto fue parte.";

@XendraTrl(Identifier="faf6ec82-3765-2bd6-0fbb-a831c61d73f8")
public static String es_PE_FIELD_Delivery_LotNo_Name="No. Lote";
@XendraField(AD_Column_ID="Lot",
IsCentrallyMaintained=true,AD_Tab_ID="5fc15ccb-bcab-359e-3910-2392fcb4e75d",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=90,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="faf6ec82-3765-2bd6-0fbb-a831c61d73f8")
public static final String FIELDNAME_Delivery_LotNo="faf6ec82-3765-2bd6-0fbb-a831c61d73f8";

@XendraTrl(Identifier="8de628a4-cb11-824a-6899-49f93e9d9a2f")
public static String es_PE_COLUMN_Lot_Name="No. Lote";

@XendraColumn(AD_Element_ID="e8a3022e-4a91-6f2a-e27c-3739825075c7",ColumnName="Lot",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8de628a4-cb11-824a-6899-49f93e9d9a2f",
Synchronized="2017-08-05 16:52:18.0")
/** Column name Lot */
public static final String COLUMNNAME_Lot = "Lot";
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
@XendraTrl(Identifier="4a756d79-f881-5a90-7a52-0d170a9a2364")
public static String es_PE_FIELD_Delivery_MessageID_Description="ID del mensaje de Email";

@XendraTrl(Identifier="4a756d79-f881-5a90-7a52-0d170a9a2364")
public static String es_PE_FIELD_Delivery_MessageID_Help="SMTP de ID del mensaje para los propósitos siguientes.";

@XendraTrl(Identifier="4a756d79-f881-5a90-7a52-0d170a9a2364")
public static String es_PE_FIELD_Delivery_MessageID_Name="ID Mensaje";

@XendraField(AD_Column_ID="MessageID",IsCentrallyMaintained=true,
AD_Tab_ID="5fc15ccb-bcab-359e-3910-2392fcb4e75d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4a756d79-f881-5a90-7a52-0d170a9a2364")
public static final String FIELDNAME_Delivery_MessageID="4a756d79-f881-5a90-7a52-0d170a9a2364";

@XendraTrl(Identifier="24493c29-f29a-cd9d-8944-cbd96509accf")
public static String es_PE_COLUMN_MessageID_Name="ID Mensaje";

@XendraColumn(AD_Element_ID="6459ca78-93e4-8f39-38ea-8984599e606b",ColumnName="MessageID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="24493c29-f29a-cd9d-8944-cbd96509accf",
Synchronized="2017-08-05 16:52:18.0")
/** Column name MessageID */
public static final String COLUMNNAME_MessageID = "MessageID";
/** Set Shipment/Receipt Line.
@param M_InOutLine_ID Line on Shipment or Receipt document */
public void setM_InOutLine_ID (int M_InOutLine_ID)
{
if (M_InOutLine_ID <= 0) set_ValueNoCheck (COLUMNNAME_M_InOutLine_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_M_InOutLine_ID, Integer.valueOf(M_InOutLine_ID));
}
/** Get Shipment/Receipt Line.
@return Line on Shipment or Receipt document */
public int getM_InOutLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_InOutLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="46b83383-70de-1add-665d-ffa12f575905")
public static String es_PE_FIELD_Delivery_ShipmentReceiptLine_Description="Item de entrega ó documento de recibo.";

@XendraTrl(Identifier="46b83383-70de-1add-665d-ffa12f575905")
public static String es_PE_FIELD_Delivery_ShipmentReceiptLine_Help="Indica un Item único en un documento de entrega / recibo";

@XendraTrl(Identifier="46b83383-70de-1add-665d-ffa12f575905")
public static String es_PE_FIELD_Delivery_ShipmentReceiptLine_Name="Item Entrega / Recibo";

@XendraField(AD_Column_ID="M_InOutLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5fc15ccb-bcab-359e-3910-2392fcb4e75d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="46b83383-70de-1add-665d-ffa12f575905")
public static final String FIELDNAME_Delivery_ShipmentReceiptLine="46b83383-70de-1add-665d-ffa12f575905";

@XendraTrl(Identifier="688aaf7b-e696-5b86-2115-07f75cd5243f")
public static String es_PE_COLUMN_M_InOutLine_ID_Name="Línea Entrega / Recibo";

@XendraColumn(AD_Element_ID="a4d9928e-fbec-fd6c-b061-d3dbbd7de02c",ColumnName="M_InOutLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="688aaf7b-e696-5b86-2115-07f75cd5243f",
Synchronized="2017-08-05 16:52:18.0")
/** Column name M_InOutLine_ID */
public static final String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";
/** Set Movement Date.
@param MovementDate Date a product was moved in or out of inventory */
public void setMovementDate (Timestamp MovementDate)
{
if (MovementDate == null) throw new IllegalArgumentException ("MovementDate is mandatory.");
set_ValueNoCheck (COLUMNNAME_MovementDate, MovementDate);
}
/** Get Movement Date.
@return Date a product was moved in or out of inventory */
public Timestamp getMovementDate() 
{
return (Timestamp)get_Value(COLUMNNAME_MovementDate);
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getMovementDate()));
}

@XendraTrl(Identifier="01f136bc-5630-61ba-4e4a-0c85ce855bd0")
public static String es_PE_FIELD_Delivery_MovementDate_Description="Fecha en que un producto fue movido (dentro ó fuera) del inventario";

@XendraTrl(Identifier="01f136bc-5630-61ba-4e4a-0c85ce855bd0")
public static String es_PE_FIELD_Delivery_MovementDate_Help="La fecha del movimiento indica la fecha en que el producto es movido. Éste es el resultado de un embarque; recibo ó movimiento de inventario.";

@XendraTrl(Identifier="01f136bc-5630-61ba-4e4a-0c85ce855bd0")
public static String es_PE_FIELD_Delivery_MovementDate_Name="Fecha de Movimiento";

@XendraField(AD_Column_ID="MovementDate",IsCentrallyMaintained=true,
AD_Tab_ID="5fc15ccb-bcab-359e-3910-2392fcb4e75d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=50,SortNo=-1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="01f136bc-5630-61ba-4e4a-0c85ce855bd0")
public static final String FIELDNAME_Delivery_MovementDate="01f136bc-5630-61ba-4e4a-0c85ce855bd0";

@XendraTrl(Identifier="a3395ed3-c573-a0eb-a9b2-0e8524e1f59f")
public static String es_PE_COLUMN_MovementDate_Name="Fecha de Movimiento";

@XendraColumn(AD_Element_ID="7a907f01-8525-820d-22d4-98b06d4b902b",ColumnName="MovementDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a3395ed3-c573-a0eb-a9b2-0e8524e1f59f",
Synchronized="2017-08-05 16:52:18.0")
/** Column name MovementDate */
public static final String COLUMNNAME_MovementDate = "MovementDate";
/** Set Product Download.
@param M_ProductDownload_ID Product downloads */
public void setM_ProductDownload_ID (int M_ProductDownload_ID)
{
if (M_ProductDownload_ID <= 0) set_Value (COLUMNNAME_M_ProductDownload_ID, null);
 else 
set_Value (COLUMNNAME_M_ProductDownload_ID, Integer.valueOf(M_ProductDownload_ID));
}
/** Get Product Download.
@return Product downloads */
public int getM_ProductDownload_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_ProductDownload_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7e4e90ba-4845-3cbe-55ab-0fcf557f6360")
public static String es_PE_FIELD_Delivery_ProductDownload_Description="Productos Descargados";

@XendraTrl(Identifier="7e4e90ba-4845-3cbe-55ab-0fcf557f6360")
public static String es_PE_FIELD_Delivery_ProductDownload_Help="Defina la transferencia directa para un producto. Si el producto es un activo, el usuario puede descargar los datos.";

@XendraTrl(Identifier="7e4e90ba-4845-3cbe-55ab-0fcf557f6360")
public static String es_PE_FIELD_Delivery_ProductDownload_Name="Productos Descargados";

@XendraField(AD_Column_ID="M_ProductDownload_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5fc15ccb-bcab-359e-3910-2392fcb4e75d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7e4e90ba-4845-3cbe-55ab-0fcf557f6360")
public static final String FIELDNAME_Delivery_ProductDownload="7e4e90ba-4845-3cbe-55ab-0fcf557f6360";

@XendraTrl(Identifier="9bce760e-9267-c8f4-818d-fbeaa32bd268")
public static String es_PE_COLUMN_M_ProductDownload_ID_Name="Productos Descargados";

@XendraColumn(AD_Element_ID="0af3fd04-a93e-e6ad-ca53-89ca3955bd0b",
ColumnName="M_ProductDownload_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9bce760e-9267-c8f4-818d-fbeaa32bd268",Synchronized="2017-08-05 16:52:18.0")
/** Column name M_ProductDownload_ID */
public static final String COLUMNNAME_M_ProductDownload_ID = "M_ProductDownload_ID";
/** Set Referrer.
@param Referrer Referring web address */
public void setReferrer (String Referrer)
{
if (Referrer != null && Referrer.length() > 255)
{
log.warning("Length > 255 - truncated");
Referrer = Referrer.substring(0,254);
}
set_ValueNoCheck (COLUMNNAME_Referrer, Referrer);
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
@XendraTrl(Identifier="80612394-bf5f-853f-f7b5-d319871b9703")
public static String es_PE_FIELD_Delivery_Referrer_Description="Dirección web de referencia";

@XendraTrl(Identifier="80612394-bf5f-853f-f7b5-d319871b9703")
public static String es_PE_FIELD_Delivery_Referrer_Name="Referencia";

@XendraField(AD_Column_ID="Referrer",IsCentrallyMaintained=true,
AD_Tab_ID="5fc15ccb-bcab-359e-3910-2392fcb4e75d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="80612394-bf5f-853f-f7b5-d319871b9703")
public static final String FIELDNAME_Delivery_Referrer="80612394-bf5f-853f-f7b5-d319871b9703";

@XendraTrl(Identifier="f8c41445-4531-ffc6-623b-618d40edf316")
public static String es_PE_COLUMN_Referrer_Name="Referencia";

@XendraColumn(AD_Element_ID="f47f85cc-8a02-b91f-3a82-fb6f10d6169e",ColumnName="Referrer",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f8c41445-4531-ffc6-623b-618d40edf316",
Synchronized="2017-08-05 16:52:18.0")
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
@XendraTrl(Identifier="f17a3439-0b56-78f4-67e3-549558a94230")
public static String es_PE_FIELD_Delivery_RemoteAddr_Description="Dirección remota";

@XendraTrl(Identifier="f17a3439-0b56-78f4-67e3-549558a94230")
public static String es_PE_FIELD_Delivery_RemoteAddr_Help="La dirección remota indica una dirección alternativa ó externa";

@XendraTrl(Identifier="f17a3439-0b56-78f4-67e3-549558a94230")
public static String es_PE_FIELD_Delivery_RemoteAddr_Name="Dirección Remota";

@XendraField(AD_Column_ID="Remote_Addr",IsCentrallyMaintained=true,
AD_Tab_ID="5fc15ccb-bcab-359e-3910-2392fcb4e75d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f17a3439-0b56-78f4-67e3-549558a94230")
public static final String FIELDNAME_Delivery_RemoteAddr="f17a3439-0b56-78f4-67e3-549558a94230";

@XendraTrl(Identifier="ee1e00e9-e169-e35f-3a10-bd6cf0ae973d")
public static String es_PE_COLUMN_Remote_Addr_Name="Dirección Remota";

@XendraColumn(AD_Element_ID="b1551fd7-ca8d-4a87-8302-e41caf5553d6",ColumnName="Remote_Addr",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ee1e00e9-e169-e35f-3a10-bd6cf0ae973d",
Synchronized="2017-08-05 16:52:18.0")
/** Column name Remote_Addr */
public static final String COLUMNNAME_Remote_Addr = "Remote_Addr";
/** Set Remote Host.
@param Remote_Host Remote host Info */
public void setRemote_Host (String Remote_Host)
{
if (Remote_Host != null && Remote_Host.length() > 60)
{
log.warning("Length > 60 - truncated");
Remote_Host = Remote_Host.substring(0,59);
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
@XendraTrl(Identifier="a97759c3-c7b2-3b20-9aea-a0bea7b0179d")
public static String es_PE_FIELD_Delivery_RemoteHost_Name="Host Remoto";

@XendraField(AD_Column_ID="Remote_Host",IsCentrallyMaintained=true,
AD_Tab_ID="5fc15ccb-bcab-359e-3910-2392fcb4e75d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a97759c3-c7b2-3b20-9aea-a0bea7b0179d")
public static final String FIELDNAME_Delivery_RemoteHost="a97759c3-c7b2-3b20-9aea-a0bea7b0179d";

@XendraTrl(Identifier="87edd2a6-47f7-af39-804a-569c4d6f9fa3")
public static String es_PE_COLUMN_Remote_Host_Name="Host Remoto";

@XendraColumn(AD_Element_ID="eb636ff7-fd5e-fa57-d640-f766bf4e52b2",ColumnName="Remote_Host",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="87edd2a6-47f7-af39-804a-569c4d6f9fa3",
Synchronized="2017-08-05 16:52:18.0")
/** Column name Remote_Host */
public static final String COLUMNNAME_Remote_Host = "Remote_Host";
/** Set Serial No.
@param SerNo Product Serial Number  */
public void setSerNo (String SerNo)
{
if (SerNo != null && SerNo.length() > 40)
{
log.warning("Length > 40 - truncated");
SerNo = SerNo.substring(0,39);
}
set_ValueNoCheck (COLUMNNAME_SerNo, SerNo);
}
/** Get Serial No.
@return Product Serial Number  */
public String getSerNo() 
{
String value = (String)get_Value(COLUMNNAME_SerNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="3f1b2d99-6a15-33d3-bf6b-399acae22087")
public static String es_PE_FIELD_Delivery_SerialNo_Description="Número de serie del producto";

@XendraTrl(Identifier="3f1b2d99-6a15-33d3-bf6b-399acae22087")
public static String es_PE_FIELD_Delivery_SerialNo_Help="El número de serie identifica un producto garantizado; monitoreado. Puede solamente ser usado cuando la cantidad es 1.";

@XendraTrl(Identifier="3f1b2d99-6a15-33d3-bf6b-399acae22087")
public static String es_PE_FIELD_Delivery_SerialNo_Name="No. de Serie";

@XendraField(AD_Column_ID="SerNo",IsCentrallyMaintained=true,
AD_Tab_ID="5fc15ccb-bcab-359e-3910-2392fcb4e75d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3f1b2d99-6a15-33d3-bf6b-399acae22087")
public static final String FIELDNAME_Delivery_SerialNo="3f1b2d99-6a15-33d3-bf6b-399acae22087";

@XendraTrl(Identifier="6a85c3fa-8047-684b-c94e-8878c5ec45e0")
public static String es_PE_COLUMN_SerNo_Name="No. de Serie";

@XendraColumn(AD_Element_ID="9aac6ac8-a553-7ad4-9bc7-40f85e011f4b",ColumnName="SerNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6a85c3fa-8047-684b-c94e-8878c5ec45e0",
Synchronized="2017-08-05 16:52:18.0")
/** Column name SerNo */
public static final String COLUMNNAME_SerNo = "SerNo";
/** Set URL.
@param URL Full URL address - e.g. http://www.adempiere.org */
public void setURL (String URL)
{
if (URL != null && URL.length() > 120)
{
log.warning("Length > 120 - truncated");
URL = URL.substring(0,119);
}
set_ValueNoCheck (COLUMNNAME_URL, URL);
}
/** Get URL.
@return Full URL address - e.g. http://www.adempiere.org */
public String getURL() 
{
String value = (String)get_Value(COLUMNNAME_URL);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="30b35448-af52-6a28-a043-10c7c66876bf")
public static String es_PE_FIELD_Delivery_URL_Description="URL";

@XendraTrl(Identifier="30b35448-af52-6a28-a043-10c7c66876bf")
public static String es_PE_FIELD_Delivery_URL_Help="El URL define una dirección en línea para este Socio de Negocio";

@XendraTrl(Identifier="30b35448-af52-6a28-a043-10c7c66876bf")
public static String es_PE_FIELD_Delivery_URL_Name="URL";
@XendraField(AD_Column_ID="URL",
IsCentrallyMaintained=true,AD_Tab_ID="5fc15ccb-bcab-359e-3910-2392fcb4e75d",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=150,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="30b35448-af52-6a28-a043-10c7c66876bf")
public static final String FIELDNAME_Delivery_URL="30b35448-af52-6a28-a043-10c7c66876bf";

@XendraTrl(Identifier="ab126a2f-1176-fba5-552e-3544c7b25bbd")
public static String es_PE_COLUMN_URL_Name="URL";

@XendraColumn(AD_Element_ID="28e2c006-3aca-a761-94d4-14eac9cc634c",ColumnName="URL",
AD_Reference_ID=40,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ab126a2f-1176-fba5-552e-3544c7b25bbd",
Synchronized="2017-08-05 16:52:18.0")
/** Column name URL */
public static final String COLUMNNAME_URL = "URL";
/** Set Version No.
@param VersionNo Version Number */
public void setVersionNo (String VersionNo)
{
if (VersionNo != null && VersionNo.length() > 20)
{
log.warning("Length > 20 - truncated");
VersionNo = VersionNo.substring(0,19);
}
set_ValueNoCheck (COLUMNNAME_VersionNo, VersionNo);
}
/** Get Version No.
@return Version Number */
public String getVersionNo() 
{
String value = (String)get_Value(COLUMNNAME_VersionNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d3526c08-9fc4-837f-8560-54e5315f6a3f")
public static String es_PE_FIELD_Delivery_VersionNo_Description="Número de versión";

@XendraTrl(Identifier="d3526c08-9fc4-837f-8560-54e5315f6a3f")
public static String es_PE_FIELD_Delivery_VersionNo_Name="No. de Versión";

@XendraField(AD_Column_ID="VersionNo",IsCentrallyMaintained=true,
AD_Tab_ID="5fc15ccb-bcab-359e-3910-2392fcb4e75d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d3526c08-9fc4-837f-8560-54e5315f6a3f")
public static final String FIELDNAME_Delivery_VersionNo="d3526c08-9fc4-837f-8560-54e5315f6a3f";

@XendraTrl(Identifier="ae7f954f-f26e-2c09-0297-8b61d68072db")
public static String es_PE_COLUMN_VersionNo_Name="No. de Versión";

@XendraColumn(AD_Element_ID="be2c9d9c-6f4c-295d-d62f-5aaf587fb5a0",ColumnName="VersionNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ae7f954f-f26e-2c09-0297-8b61d68072db",
Synchronized="2017-08-05 16:52:18.0")
/** Column name VersionNo */
public static final String COLUMNNAME_VersionNo = "VersionNo";
}
