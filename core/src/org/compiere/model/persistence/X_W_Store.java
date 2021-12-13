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
/** Generated Model for W_Store
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_W_Store extends PO
{
/** Standard Constructor
@param ctx context
@param W_Store_ID id
@param trxName transaction
*/
public X_W_Store (Properties ctx, int W_Store_ID, String trxName)
{
super (ctx, W_Store_ID, trxName);
/** if (W_Store_ID == 0)
{
setC_PaymentTerm_ID (0);
setIsDefault (false);	
// N
setIsMenuAssets (true);	
// Y
setIsMenuContact (true);	
// Y
setIsMenuInterests (true);	
// Y
setIsMenuInvoices (true);	
// Y
setIsMenuOrders (true);	
// Y
setIsMenuPayments (true);	
// Y
setIsMenuRegistrations (true);	
// Y
setIsMenuRequests (true);	
// Y
setIsMenuRfQs (true);	
// Y
setIsMenuShipments (true);	
// Y
setM_PriceList_ID (0);
setM_Warehouse_ID (0);
setName (null);
setSalesRep_ID (0);
setURL (null);
setWebContext (null);
setW_Store_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_W_Store (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=778 */
public static int Table_ID=MTable.getTable_ID("W_Store");

@XendraTrl(Identifier="353fe41b-cfa9-3994-2953-7c4190d37d9a")
public static String es_PE_TAB_WebStore_Description="Define Almacen de Web ";

@XendraTrl(Identifier="353fe41b-cfa9-3994-2953-7c4190d37d9a")
public static String es_PE_TAB_WebStore_Name="Tienda Web";
@XendraTab(Name="Web Store",
Description="Define Web Store",
Help="Define the web store settings. The web server context must be unique and determines the settings used in the actual transaction. The selected warehouse determines the organization.  The email settings are tested with the client email settings. ",
AD_Window_ID="786c7197-5b64-f3eb-5d2b-a3422ae70868",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="353fe41b-cfa9-3994-2953-7c4190d37d9a",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_WebStore="353fe41b-cfa9-3994-2953-7c4190d37d9a";

@XendraTrl(Identifier="2254919f-019a-7fdd-16c1-a4ec8e18e5ed")
public static String es_PE_TABLE_W_Store_Name="Tienda Web";

@XendraTable(Name="Web Store",AD_Package_ID="1b3656e5-71c7-1296-994e-9b2c4549c7fd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="A Web Store of the Client",
Help="",TableName="W_Store",AccessLevel="2",AD_Window_ID="786c7197-5b64-f3eb-5d2b-a3422ae70868",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=135,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="2254919f-019a-7fdd-16c1-a4ec8e18e5ed",Synchronized="2020-03-03 21:40:34.0")
/** TableName=W_Store */
public static final String Table_Name="W_Store";


@XendraIndex(Name="w_store_webcontext",Identifier="51260009-12f9-88d4-efb8-510dfbd37a5c",
Column_Names="webcontext",IsUnique="true",TableIdentifier="51260009-12f9-88d4-efb8-510dfbd37a5c",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_w_store_webcontext = "51260009-12f9-88d4-efb8-510dfbd37a5c";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"W_Store");

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
    Table_ID = MTable.getTable_ID("W_Store");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_W_Store[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Payment Term.
@param C_PaymentTerm_ID The terms of Payment (timing, discount) */
public void setC_PaymentTerm_ID (int C_PaymentTerm_ID)
{
if (C_PaymentTerm_ID < 1) throw new IllegalArgumentException ("C_PaymentTerm_ID is mandatory.");
set_Value (COLUMNNAME_C_PaymentTerm_ID, Integer.valueOf(C_PaymentTerm_ID));
}
/** Get Payment Term.
@return The terms of Payment (timing, discount) */
public int getC_PaymentTerm_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_PaymentTerm_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c3833433-44f0-1bee-82c8-d40849e45467")
public static String es_PE_FIELD_WebStore_PaymentTerm_Name="Término de Pago";

@XendraTrl(Identifier="c3833433-44f0-1bee-82c8-d40849e45467")
public static String es_PE_FIELD_WebStore_PaymentTerm_Description="Condiciones de pago de esta transacción";

@XendraTrl(Identifier="c3833433-44f0-1bee-82c8-d40849e45467")
public static String es_PE_FIELD_WebStore_PaymentTerm_Help="Las condiciones de pago indican el método y tiempo de pago para esta transacción.";

@XendraField(AD_Column_ID="C_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="353fe41b-cfa9-3994-2953-7c4190d37d9a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c3833433-44f0-1bee-82c8-d40849e45467")
public static final String FIELDNAME_WebStore_PaymentTerm="c3833433-44f0-1bee-82c8-d40849e45467";

@XendraTrl(Identifier="364b4e0b-2de4-f83c-1504-1edc3bc611aa")
public static String es_PE_COLUMN_C_PaymentTerm_ID_Name="Término de Pago";

@XendraColumn(AD_Element_ID="9b2224b8-8020-a83c-2d1e-ea35741c781a",ColumnName="C_PaymentTerm_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="364b4e0b-2de4-f83c-1504-1edc3bc611aa",
Synchronized="2019-08-30 22:24:31.0")
/** Column name C_PaymentTerm_ID */
public static final String COLUMNNAME_C_PaymentTerm_ID = "C_PaymentTerm_ID";
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

@XendraTrl(Identifier="889a4563-d902-a065-0227-64e6f820609d")
public static String es_PE_FIELD_WebStore_Description_Name="Observación";

@XendraTrl(Identifier="889a4563-d902-a065-0227-64e6f820609d")
public static String es_PE_FIELD_WebStore_Description_Description="Observación";

@XendraTrl(Identifier="889a4563-d902-a065-0227-64e6f820609d")
public static String es_PE_FIELD_WebStore_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="353fe41b-cfa9-3994-2953-7c4190d37d9a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="889a4563-d902-a065-0227-64e6f820609d")
public static final String FIELDNAME_WebStore_Description="889a4563-d902-a065-0227-64e6f820609d";

@XendraTrl(Identifier="3b69ff9e-5bd6-8c75-b0c1-7fe0bf2d2b79")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3b69ff9e-5bd6-8c75-b0c1-7fe0bf2d2b79",
Synchronized="2019-08-30 22:24:31.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set EMail Footer.
@param EMailFooter Footer added to EMails */
public void setEMailFooter (String EMailFooter)
{
set_Value (COLUMNNAME_EMailFooter, EMailFooter);
}
/** Get EMail Footer.
@return Footer added to EMails */
public String getEMailFooter() 
{
String value = (String)get_Value(COLUMNNAME_EMailFooter);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="b04e7743-c81b-08c8-80f1-bdd5e57efc52")
public static String es_PE_FIELD_WebStore_EMailFooter_Name="Pie de Email";

@XendraTrl(Identifier="b04e7743-c81b-08c8-80f1-bdd5e57efc52")
public static String es_PE_FIELD_WebStore_EMailFooter_Description="Pie agregado a los Emails";

@XendraTrl(Identifier="b04e7743-c81b-08c8-80f1-bdd5e57efc52")
public static String es_PE_FIELD_WebStore_EMailFooter_Help="El pie es agregado para cada email.";

@XendraField(AD_Column_ID="EMailFooter",IsCentrallyMaintained=true,
AD_Tab_ID="353fe41b-cfa9-3994-2953-7c4190d37d9a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b04e7743-c81b-08c8-80f1-bdd5e57efc52")
public static final String FIELDNAME_WebStore_EMailFooter="b04e7743-c81b-08c8-80f1-bdd5e57efc52";

@XendraTrl(Identifier="36489760-7d9f-f835-ba2f-10f29e598d79")
public static String es_PE_COLUMN_EMailFooter_Name="Pie de Email";

@XendraColumn(AD_Element_ID="0f6b2d92-431b-fa20-cb63-0b19691261d0",ColumnName="EMailFooter",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="36489760-7d9f-f835-ba2f-10f29e598d79",
Synchronized="2019-08-30 22:24:31.0")
/** Column name EMailFooter */
public static final String COLUMNNAME_EMailFooter = "EMailFooter";
/** Set EMail Header.
@param EMailHeader Header added to EMails */
public void setEMailHeader (String EMailHeader)
{
set_Value (COLUMNNAME_EMailHeader, EMailHeader);
}
/** Get EMail Header.
@return Header added to EMails */
public String getEMailHeader() 
{
String value = (String)get_Value(COLUMNNAME_EMailHeader);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a3435cb0-84f6-b180-14ce-7752f0ef0db4")
public static String es_PE_FIELD_WebStore_EMailHeader_Name="Encabezado de Email";

@XendraTrl(Identifier="a3435cb0-84f6-b180-14ce-7752f0ef0db4")
public static String es_PE_FIELD_WebStore_EMailHeader_Description="Encabezado agregado a los email.";

@XendraTrl(Identifier="a3435cb0-84f6-b180-14ce-7752f0ef0db4")
public static String es_PE_FIELD_WebStore_EMailHeader_Help="El encabezado se agrega a cada email.";

@XendraField(AD_Column_ID="EMailHeader",IsCentrallyMaintained=true,
AD_Tab_ID="353fe41b-cfa9-3994-2953-7c4190d37d9a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a3435cb0-84f6-b180-14ce-7752f0ef0db4")
public static final String FIELDNAME_WebStore_EMailHeader="a3435cb0-84f6-b180-14ce-7752f0ef0db4";

@XendraTrl(Identifier="8e7bb360-f0a6-38d8-1e21-04626ca230bc")
public static String es_PE_COLUMN_EMailHeader_Name="Encabezado de Email";

@XendraColumn(AD_Element_ID="d1506608-cbdb-3305-b039-56bdcdd30bc0",ColumnName="EMailHeader",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8e7bb360-f0a6-38d8-1e21-04626ca230bc",
Synchronized="2019-08-30 22:24:31.0")
/** Column name EMailHeader */
public static final String COLUMNNAME_EMailHeader = "EMailHeader";
/** Set Comment/Help.
@param Help Comment or Hint */
public void setHelp (String Help)
{
set_Value (COLUMNNAME_Help, Help);
}
/** Get Comment/Help.
@return Comment or Hint */
public String getHelp() 
{
String value = (String)get_Value(COLUMNNAME_Help);
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

@XendraTrl(Identifier="96313d37-65a5-f5cc-b25e-1c42d28d090b")
public static String es_PE_FIELD_WebStore_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="96313d37-65a5-f5cc-b25e-1c42d28d090b")
public static String es_PE_FIELD_WebStore_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="96313d37-65a5-f5cc-b25e-1c42d28d090b")
public static String es_PE_FIELD_WebStore_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="353fe41b-cfa9-3994-2953-7c4190d37d9a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="96313d37-65a5-f5cc-b25e-1c42d28d090b")
public static final String FIELDNAME_WebStore_CommentHelp="96313d37-65a5-f5cc-b25e-1c42d28d090b";

@XendraTrl(Identifier="4f98ffbf-18c2-0acd-d37f-0c722bab093d")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4f98ffbf-18c2-0acd-d37f-0c722bab093d",
Synchronized="2019-08-30 22:24:31.0")
/** Column name Help */
public static final String COLUMNNAME_Help = "Help";
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
@XendraTrl(Identifier="f08b126f-47ba-4569-a65f-f6bbcaaa5b46")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f08b126f-47ba-4569-a65f-f6bbcaaa5b46",
Synchronized="2019-08-30 22:24:31.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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

@XendraTrl(Identifier="124a8513-388e-8859-6975-f1cbf9584ebd")
public static String es_PE_FIELD_WebStore_Default_Name="Predeterminado";

@XendraTrl(Identifier="124a8513-388e-8859-6975-f1cbf9584ebd")
public static String es_PE_FIELD_WebStore_Default_Description="Valor Predeterminado";

@XendraTrl(Identifier="124a8513-388e-8859-6975-f1cbf9584ebd")
public static String es_PE_FIELD_WebStore_Default_Help="El cuadro de verificación indica si este registro será usado como un valor predeterminado";

@XendraField(AD_Column_ID="IsDefault",IsCentrallyMaintained=true,
AD_Tab_ID="353fe41b-cfa9-3994-2953-7c4190d37d9a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="124a8513-388e-8859-6975-f1cbf9584ebd")
public static final String FIELDNAME_WebStore_Default="124a8513-388e-8859-6975-f1cbf9584ebd";

@XendraTrl(Identifier="41590e66-a489-7d96-1b10-58c95f0f39f7")
public static String es_PE_COLUMN_IsDefault_Name="Predeterminado";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="41590e66-a489-7d96-1b10-58c95f0f39f7",
Synchronized="2019-08-30 22:24:31.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
/** Set Menu Assets.
@param IsMenuAssets Show Menu Assets */
public void setIsMenuAssets (boolean IsMenuAssets)
{
set_Value (COLUMNNAME_IsMenuAssets, Boolean.valueOf(IsMenuAssets));
}
/** Get Menu Assets.
@return Show Menu Assets */
public boolean isMenuAssets() 
{
Object oo = get_Value(COLUMNNAME_IsMenuAssets);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="3ef8f73e-8174-c6ea-8ac6-b0b48699432c")
public static String es_PE_FIELD_WebStore_MenuAssets_Name="Menú de Activos";

@XendraTrl(Identifier="3ef8f73e-8174-c6ea-8ac6-b0b48699432c")
public static String es_PE_FIELD_WebStore_MenuAssets_Description="Muestra menú de activos";

@XendraField(AD_Column_ID="IsMenuAssets",IsCentrallyMaintained=true,
AD_Tab_ID="353fe41b-cfa9-3994-2953-7c4190d37d9a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3ef8f73e-8174-c6ea-8ac6-b0b48699432c")
public static final String FIELDNAME_WebStore_MenuAssets="3ef8f73e-8174-c6ea-8ac6-b0b48699432c";

@XendraTrl(Identifier="dcdb766d-ea9b-70ec-fbcd-413331dcc928")
public static String es_PE_COLUMN_IsMenuAssets_Name="Menú de Activos";

@XendraColumn(AD_Element_ID="840be350-f858-5123-04cf-aa80ae979a5e",ColumnName="IsMenuAssets",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dcdb766d-ea9b-70ec-fbcd-413331dcc928",
Synchronized="2019-08-30 22:24:31.0")
/** Column name IsMenuAssets */
public static final String COLUMNNAME_IsMenuAssets = "IsMenuAssets";
/** Set Menu Contact.
@param IsMenuContact Show Menu Contact */
public void setIsMenuContact (boolean IsMenuContact)
{
set_Value (COLUMNNAME_IsMenuContact, Boolean.valueOf(IsMenuContact));
}
/** Get Menu Contact.
@return Show Menu Contact */
public boolean isMenuContact() 
{
Object oo = get_Value(COLUMNNAME_IsMenuContact);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="c436437b-9bc1-e33b-5542-1214fb927f11")
public static String es_PE_FIELD_WebStore_MenuContact_Name="Cantacto del menú";

@XendraTrl(Identifier="c436437b-9bc1-e33b-5542-1214fb927f11")
public static String es_PE_FIELD_WebStore_MenuContact_Description="Mostrar el contacto del menú";

@XendraField(AD_Column_ID="IsMenuContact",IsCentrallyMaintained=true,
AD_Tab_ID="353fe41b-cfa9-3994-2953-7c4190d37d9a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=310,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c436437b-9bc1-e33b-5542-1214fb927f11")
public static final String FIELDNAME_WebStore_MenuContact="c436437b-9bc1-e33b-5542-1214fb927f11";

@XendraTrl(Identifier="9713dcd8-32f2-7549-4d0a-2de576357586")
public static String es_PE_COLUMN_IsMenuContact_Name="Cantacto del menú";

@XendraColumn(AD_Element_ID="36d353a8-b61f-bc8e-0655-a31a231690ba",ColumnName="IsMenuContact",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9713dcd8-32f2-7549-4d0a-2de576357586",
Synchronized="2019-08-30 22:24:31.0")
/** Column name IsMenuContact */
public static final String COLUMNNAME_IsMenuContact = "IsMenuContact";
/** Set Menu Interests.
@param IsMenuInterests Show Menu Interests */
public void setIsMenuInterests (boolean IsMenuInterests)
{
set_Value (COLUMNNAME_IsMenuInterests, Boolean.valueOf(IsMenuInterests));
}
/** Get Menu Interests.
@return Show Menu Interests */
public boolean isMenuInterests() 
{
Object oo = get_Value(COLUMNNAME_IsMenuInterests);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="a8b8c8b5-e9e1-d200-bcd4-d2e0c7164e46")
public static String es_PE_FIELD_WebStore_MenuInterests_Name="Interes del menú";

@XendraTrl(Identifier="a8b8c8b5-e9e1-d200-bcd4-d2e0c7164e46")
public static String es_PE_FIELD_WebStore_MenuInterests_Description="Muestra menú de interes";

@XendraField(AD_Column_ID="IsMenuInterests",IsCentrallyMaintained=true,
AD_Tab_ID="353fe41b-cfa9-3994-2953-7c4190d37d9a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=300,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a8b8c8b5-e9e1-d200-bcd4-d2e0c7164e46")
public static final String FIELDNAME_WebStore_MenuInterests="a8b8c8b5-e9e1-d200-bcd4-d2e0c7164e46";

@XendraTrl(Identifier="5bff869e-985f-1f23-143a-a61cf6038ed5")
public static String es_PE_COLUMN_IsMenuInterests_Name="Interes del menú";

@XendraColumn(AD_Element_ID="16952ef0-285a-fe65-4961-8202424fda1d",ColumnName="IsMenuInterests",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5bff869e-985f-1f23-143a-a61cf6038ed5",
Synchronized="2019-08-30 22:24:31.0")
/** Column name IsMenuInterests */
public static final String COLUMNNAME_IsMenuInterests = "IsMenuInterests";
/** Set Menu Invoices.
@param IsMenuInvoices Show Menu Invoices */
public void setIsMenuInvoices (boolean IsMenuInvoices)
{
set_Value (COLUMNNAME_IsMenuInvoices, Boolean.valueOf(IsMenuInvoices));
}
/** Get Menu Invoices.
@return Show Menu Invoices */
public boolean isMenuInvoices() 
{
Object oo = get_Value(COLUMNNAME_IsMenuInvoices);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="1c0deca7-40dd-f240-6cf2-c3bcc1866652")
public static String es_PE_FIELD_WebStore_MenuInvoices_Name="Menú de Facturas";

@XendraTrl(Identifier="1c0deca7-40dd-f240-6cf2-c3bcc1866652")
public static String es_PE_FIELD_WebStore_MenuInvoices_Description="Muestra menu de facturas";

@XendraField(AD_Column_ID="IsMenuInvoices",IsCentrallyMaintained=true,
AD_Tab_ID="353fe41b-cfa9-3994-2953-7c4190d37d9a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1c0deca7-40dd-f240-6cf2-c3bcc1866652")
public static final String FIELDNAME_WebStore_MenuInvoices="1c0deca7-40dd-f240-6cf2-c3bcc1866652";

@XendraTrl(Identifier="3ff20e4b-9b84-942d-fb6a-1c86cb8ff134")
public static String es_PE_COLUMN_IsMenuInvoices_Name="Menú de Facturas";

@XendraColumn(AD_Element_ID="8d948c6a-1d01-e7f1-0b6e-bb3ca00af293",ColumnName="IsMenuInvoices",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3ff20e4b-9b84-942d-fb6a-1c86cb8ff134",
Synchronized="2019-08-30 22:24:32.0")
/** Column name IsMenuInvoices */
public static final String COLUMNNAME_IsMenuInvoices = "IsMenuInvoices";
/** Set Menu Orders.
@param IsMenuOrders Show Menu Orders */
public void setIsMenuOrders (boolean IsMenuOrders)
{
set_Value (COLUMNNAME_IsMenuOrders, Boolean.valueOf(IsMenuOrders));
}
/** Get Menu Orders.
@return Show Menu Orders */
public boolean isMenuOrders() 
{
Object oo = get_Value(COLUMNNAME_IsMenuOrders);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="ffe8fda6-2f46-1cd9-eef5-e81623dee0fe")
public static String es_PE_FIELD_WebStore_MenuOrders_Name="Menú de Órdenes";

@XendraTrl(Identifier="ffe8fda6-2f46-1cd9-eef5-e81623dee0fe")
public static String es_PE_FIELD_WebStore_MenuOrders_Description="Muestra menú de órdenes";

@XendraField(AD_Column_ID="IsMenuOrders",IsCentrallyMaintained=true,
AD_Tab_ID="353fe41b-cfa9-3994-2953-7c4190d37d9a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ffe8fda6-2f46-1cd9-eef5-e81623dee0fe")
public static final String FIELDNAME_WebStore_MenuOrders="ffe8fda6-2f46-1cd9-eef5-e81623dee0fe";

@XendraTrl(Identifier="c5a2b57a-ec8d-6d5e-eef0-be832a96e68f")
public static String es_PE_COLUMN_IsMenuOrders_Name="Menú de Órdenes";

@XendraColumn(AD_Element_ID="e149c921-3dbb-852b-1bc7-6f274d638bc5",ColumnName="IsMenuOrders",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c5a2b57a-ec8d-6d5e-eef0-be832a96e68f",
Synchronized="2019-08-30 22:24:32.0")
/** Column name IsMenuOrders */
public static final String COLUMNNAME_IsMenuOrders = "IsMenuOrders";
/** Set Menu Payments.
@param IsMenuPayments Show Menu Payments */
public void setIsMenuPayments (boolean IsMenuPayments)
{
set_Value (COLUMNNAME_IsMenuPayments, Boolean.valueOf(IsMenuPayments));
}
/** Get Menu Payments.
@return Show Menu Payments */
public boolean isMenuPayments() 
{
Object oo = get_Value(COLUMNNAME_IsMenuPayments);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="eb071a8b-1822-b248-7948-08a74527be10")
public static String es_PE_FIELD_WebStore_MenuPayments_Name="Menú de Pagos";

@XendraTrl(Identifier="eb071a8b-1822-b248-7948-08a74527be10")
public static String es_PE_FIELD_WebStore_MenuPayments_Description="Muestra menú de pagos";

@XendraField(AD_Column_ID="IsMenuPayments",IsCentrallyMaintained=true,
AD_Tab_ID="353fe41b-cfa9-3994-2953-7c4190d37d9a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eb071a8b-1822-b248-7948-08a74527be10")
public static final String FIELDNAME_WebStore_MenuPayments="eb071a8b-1822-b248-7948-08a74527be10";

@XendraTrl(Identifier="0a485337-c208-833c-7293-d849317ee29f")
public static String es_PE_COLUMN_IsMenuPayments_Name="Menú de Pagos";

@XendraColumn(AD_Element_ID="8b5082e0-7562-867f-b41a-6e973b502e68",ColumnName="IsMenuPayments",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0a485337-c208-833c-7293-d849317ee29f",
Synchronized="2019-08-30 22:24:32.0")
/** Column name IsMenuPayments */
public static final String COLUMNNAME_IsMenuPayments = "IsMenuPayments";
/** Set Menu Registrations.
@param IsMenuRegistrations Show Menu Registrations */
public void setIsMenuRegistrations (boolean IsMenuRegistrations)
{
set_Value (COLUMNNAME_IsMenuRegistrations, Boolean.valueOf(IsMenuRegistrations));
}
/** Get Menu Registrations.
@return Show Menu Registrations */
public boolean isMenuRegistrations() 
{
Object oo = get_Value(COLUMNNAME_IsMenuRegistrations);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="8dc68615-2645-7057-1c58-67f919f3d986")
public static String es_PE_FIELD_WebStore_MenuRegistrations_Name="Menú de Registros";

@XendraTrl(Identifier="8dc68615-2645-7057-1c58-67f919f3d986")
public static String es_PE_FIELD_WebStore_MenuRegistrations_Description="Muestra menú de registros";

@XendraField(AD_Column_ID="IsMenuRegistrations",IsCentrallyMaintained=true,
AD_Tab_ID="353fe41b-cfa9-3994-2953-7c4190d37d9a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=290,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8dc68615-2645-7057-1c58-67f919f3d986")
public static final String FIELDNAME_WebStore_MenuRegistrations="8dc68615-2645-7057-1c58-67f919f3d986";

@XendraTrl(Identifier="4334ec5b-1a81-ac92-e4d2-ea9ff8bacc7e")
public static String es_PE_COLUMN_IsMenuRegistrations_Name="Menú de Registros";

@XendraColumn(AD_Element_ID="7cc5167b-3363-9ac5-2042-53cd5707805f",
ColumnName="IsMenuRegistrations",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="Y",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4334ec5b-1a81-ac92-e4d2-ea9ff8bacc7e",Synchronized="2019-08-30 22:24:32.0")
/** Column name IsMenuRegistrations */
public static final String COLUMNNAME_IsMenuRegistrations = "IsMenuRegistrations";
/** Set Menu Requests.
@param IsMenuRequests Show Menu Requests */
public void setIsMenuRequests (boolean IsMenuRequests)
{
set_Value (COLUMNNAME_IsMenuRequests, Boolean.valueOf(IsMenuRequests));
}
/** Get Menu Requests.
@return Show Menu Requests */
public boolean isMenuRequests() 
{
Object oo = get_Value(COLUMNNAME_IsMenuRequests);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="01042218-3626-d56c-fa7a-bc4eff339edc")
public static String es_PE_FIELD_WebStore_MenuRequests_Name="Menú de Solicitudes";

@XendraTrl(Identifier="01042218-3626-d56c-fa7a-bc4eff339edc")
public static String es_PE_FIELD_WebStore_MenuRequests_Description="Muestra menú de solicitudes";

@XendraField(AD_Column_ID="IsMenuRequests",IsCentrallyMaintained=true,
AD_Tab_ID="353fe41b-cfa9-3994-2953-7c4190d37d9a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=280,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="01042218-3626-d56c-fa7a-bc4eff339edc")
public static final String FIELDNAME_WebStore_MenuRequests="01042218-3626-d56c-fa7a-bc4eff339edc";

@XendraTrl(Identifier="a8bbcb38-90bc-0401-9930-ac12327e3613")
public static String es_PE_COLUMN_IsMenuRequests_Name="Menú de Solicitudes";

@XendraColumn(AD_Element_ID="5e28c328-3401-ab95-2eb1-f4f1d5dace0e",ColumnName="IsMenuRequests",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a8bbcb38-90bc-0401-9930-ac12327e3613",
Synchronized="2019-08-30 22:24:32.0")
/** Column name IsMenuRequests */
public static final String COLUMNNAME_IsMenuRequests = "IsMenuRequests";
/** Set Menu RfQs.
@param IsMenuRfQs Show Menu RfQs */
public void setIsMenuRfQs (boolean IsMenuRfQs)
{
set_Value (COLUMNNAME_IsMenuRfQs, Boolean.valueOf(IsMenuRfQs));
}
/** Get Menu RfQs.
@return Show Menu RfQs */
public boolean isMenuRfQs() 
{
Object oo = get_Value(COLUMNNAME_IsMenuRfQs);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="9057a950-0be2-2581-a66a-bc3ff0f0060d")
public static String es_PE_FIELD_WebStore_MenuRfQs_Name="Menú SPC (RfQ)";

@XendraTrl(Identifier="9057a950-0be2-2581-a66a-bc3ff0f0060d")
public static String es_PE_FIELD_WebStore_MenuRfQs_Description="Muestra menú SPC (RfQ)";

@XendraField(AD_Column_ID="IsMenuRfQs",IsCentrallyMaintained=true,
AD_Tab_ID="353fe41b-cfa9-3994-2953-7c4190d37d9a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=270,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9057a950-0be2-2581-a66a-bc3ff0f0060d")
public static final String FIELDNAME_WebStore_MenuRfQs="9057a950-0be2-2581-a66a-bc3ff0f0060d";

@XendraTrl(Identifier="c377deeb-5a29-eb3a-4336-0993ddfb6b27")
public static String es_PE_COLUMN_IsMenuRfQs_Name="Menú SPC (RfQ)";

@XendraColumn(AD_Element_ID="1c1ae1dc-6ced-b1fa-7a69-a54169e80ced",ColumnName="IsMenuRfQs",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c377deeb-5a29-eb3a-4336-0993ddfb6b27",
Synchronized="2019-08-30 22:24:32.0")
/** Column name IsMenuRfQs */
public static final String COLUMNNAME_IsMenuRfQs = "IsMenuRfQs";
/** Set Menu Shipments.
@param IsMenuShipments Show Menu Shipments */
public void setIsMenuShipments (boolean IsMenuShipments)
{
set_Value (COLUMNNAME_IsMenuShipments, Boolean.valueOf(IsMenuShipments));
}
/** Get Menu Shipments.
@return Show Menu Shipments */
public boolean isMenuShipments() 
{
Object oo = get_Value(COLUMNNAME_IsMenuShipments);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="012f6932-89a0-ed8c-e417-37c70d90dd92")
public static String es_PE_FIELD_WebStore_MenuShipments_Name="Menú de Entregas";

@XendraTrl(Identifier="012f6932-89a0-ed8c-e417-37c70d90dd92")
public static String es_PE_FIELD_WebStore_MenuShipments_Description="Muestra menú de entregas";

@XendraField(AD_Column_ID="IsMenuShipments",IsCentrallyMaintained=true,
AD_Tab_ID="353fe41b-cfa9-3994-2953-7c4190d37d9a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="012f6932-89a0-ed8c-e417-37c70d90dd92")
public static final String FIELDNAME_WebStore_MenuShipments="012f6932-89a0-ed8c-e417-37c70d90dd92";

@XendraTrl(Identifier="3987928d-1115-0ba5-b07f-49ca2772ba9d")
public static String es_PE_COLUMN_IsMenuShipments_Name="Menú de Entregas";

@XendraColumn(AD_Element_ID="290ad114-750a-fce5-4e89-46af95acb003",ColumnName="IsMenuShipments",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3987928d-1115-0ba5-b07f-49ca2772ba9d",
Synchronized="2019-08-30 22:24:32.0")
/** Column name IsMenuShipments */
public static final String COLUMNNAME_IsMenuShipments = "IsMenuShipments";
/** Set M_PriceList_ID.
@param M_PriceList_ID Unique identifier of a Price List */
public void setM_PriceList_ID (int M_PriceList_ID)
{
if (M_PriceList_ID < 1) throw new IllegalArgumentException ("M_PriceList_ID is mandatory.");
set_Value (COLUMNNAME_M_PriceList_ID, Integer.valueOf(M_PriceList_ID));
}
/** Get M_PriceList_ID.
@return Unique identifier of a Price List */
public int getM_PriceList_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_PriceList_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b464d700-f0d0-ec30-55ed-3a9bbf60a70b")
public static String es_PE_FIELD_WebStore_M_PriceList_ID_Name="Lista de Precios";

@XendraTrl(Identifier="b464d700-f0d0-ec30-55ed-3a9bbf60a70b")
public static String es_PE_FIELD_WebStore_M_PriceList_ID_Description="Identificador único de mi lista de precios";

@XendraTrl(Identifier="b464d700-f0d0-ec30-55ed-3a9bbf60a70b")
public static String es_PE_FIELD_WebStore_M_PriceList_ID_Help="Listas de precios son usadas para determinar el precio; margen y costo de artículos comprados ó vendidos.";

@XendraField(AD_Column_ID="M_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="353fe41b-cfa9-3994-2953-7c4190d37d9a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b464d700-f0d0-ec30-55ed-3a9bbf60a70b")
public static final String FIELDNAME_WebStore_M_PriceList_ID="b464d700-f0d0-ec30-55ed-3a9bbf60a70b";

@XendraTrl(Identifier="88845529-7b82-a29e-3050-df4706910f1e")
public static String es_PE_COLUMN_M_PriceList_ID_Name="Lista de Precios";

@XendraColumn(AD_Element_ID="652afdd3-9ff1-082d-5831-6aad828e0e09",ColumnName="M_PriceList_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="88845529-7b82-a29e-3050-df4706910f1e",
Synchronized="2019-08-30 22:24:32.0")
/** Column name M_PriceList_ID */
public static final String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";
/** Set Warehouse.
@param M_Warehouse_ID Storage Warehouse and Service Point */
public void setM_Warehouse_ID (int M_Warehouse_ID)
{
if (M_Warehouse_ID < 1) throw new IllegalArgumentException ("M_Warehouse_ID is mandatory.");
set_Value (COLUMNNAME_M_Warehouse_ID, Integer.valueOf(M_Warehouse_ID));
}
/** Get Warehouse.
@return Storage Warehouse and Service Point */
public int getM_Warehouse_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Warehouse_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="08dcb6d9-c3b5-12f8-bc0a-0a0866495c13")
public static String es_PE_FIELD_WebStore_Warehouse_Name="Almacén";

@XendraTrl(Identifier="08dcb6d9-c3b5-12f8-bc0a-0a0866495c13")
public static String es_PE_FIELD_WebStore_Warehouse_Description="Almacén";

@XendraTrl(Identifier="08dcb6d9-c3b5-12f8-bc0a-0a0866495c13")
public static String es_PE_FIELD_WebStore_Warehouse_Help="El Almacén indica un Almacén único donde los productos son almacenados";

@XendraField(AD_Column_ID="M_Warehouse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="353fe41b-cfa9-3994-2953-7c4190d37d9a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="08dcb6d9-c3b5-12f8-bc0a-0a0866495c13")
public static final String FIELDNAME_WebStore_Warehouse="08dcb6d9-c3b5-12f8-bc0a-0a0866495c13";

@XendraTrl(Identifier="a3ed4105-acf0-b362-129b-7eec4f0855bb")
public static String es_PE_COLUMN_M_Warehouse_ID_Name="Almacén";

@XendraColumn(AD_Element_ID="402045cd-baa5-aeaf-b148-a921dffb7821",ColumnName="M_Warehouse_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a3ed4105-acf0-b362-129b-7eec4f0855bb",
Synchronized="2019-08-30 22:24:32.0")
/** Column name M_Warehouse_ID */
public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
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

@XendraTrl(Identifier="d5019367-9722-f503-d136-43886de3bfd2")
public static String es_PE_FIELD_WebStore_Name_Name="Nombre";

@XendraTrl(Identifier="d5019367-9722-f503-d136-43886de3bfd2")
public static String es_PE_FIELD_WebStore_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="d5019367-9722-f503-d136-43886de3bfd2")
public static String es_PE_FIELD_WebStore_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="353fe41b-cfa9-3994-2953-7c4190d37d9a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d5019367-9722-f503-d136-43886de3bfd2")
public static final String FIELDNAME_WebStore_Name="d5019367-9722-f503-d136-43886de3bfd2";

@XendraTrl(Identifier="ae23ed9b-1df6-96a3-0282-cba568c096d6")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ae23ed9b-1df6-96a3-0282-cba568c096d6",
Synchronized="2019-08-30 22:24:32.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Sales Representative.
@param SalesRep_ID Sales Representative or Company Agent */
public void setSalesRep_ID (int SalesRep_ID)
{
if (SalesRep_ID < 1) throw new IllegalArgumentException ("SalesRep_ID is mandatory.");
set_Value (COLUMNNAME_SalesRep_ID, Integer.valueOf(SalesRep_ID));
}
/** Get Sales Representative.
@return Sales Representative or Company Agent */
public int getSalesRep_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SalesRep_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fc0a2a73-aedd-3e01-4be9-eacea0b40698")
public static String es_PE_FIELD_WebStore_SalesRepresentative_Name="Agente Cía";

@XendraTrl(Identifier="fc0a2a73-aedd-3e01-4be9-eacea0b40698")
public static String es_PE_FIELD_WebStore_SalesRepresentative_Description="Representante de Ventas";

@XendraTrl(Identifier="fc0a2a73-aedd-3e01-4be9-eacea0b40698")
public static String es_PE_FIELD_WebStore_SalesRepresentative_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="353fe41b-cfa9-3994-2953-7c4190d37d9a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fc0a2a73-aedd-3e01-4be9-eacea0b40698")
public static final String FIELDNAME_WebStore_SalesRepresentative="fc0a2a73-aedd-3e01-4be9-eacea0b40698";

@XendraTrl(Identifier="6c842d1c-702c-3f83-11d7-421b96eaba06")
public static String es_PE_COLUMN_SalesRep_ID_Name="Agente Cía";

@XendraColumn(AD_Element_ID="197a9c3a-ff10-c291-d65f-5e05a36d3710",ColumnName="SalesRep_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="15251147-a1b6-4a83-a3a5-2d3ae7db69d9",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6c842d1c-702c-3f83-11d7-421b96eaba06",Synchronized="2019-08-30 22:24:32.0")
/** Column name SalesRep_ID */
public static final String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
/** Set Stylesheet.
@param Stylesheet CSS (Stylesheet) used */
public void setStylesheet (String Stylesheet)
{
if (Stylesheet != null && Stylesheet.length() > 60)
{
log.warning("Length > 60 - truncated");
Stylesheet = Stylesheet.substring(0,59);
}
set_Value (COLUMNNAME_Stylesheet, Stylesheet);
}
/** Get Stylesheet.
@return CSS (Stylesheet) used */
public String getStylesheet() 
{
String value = (String)get_Value(COLUMNNAME_Stylesheet);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="4f40564c-ea82-47d4-2965-b6c0623686ac")
public static String es_PE_FIELD_WebStore_Stylesheet_Name="Stylesheet";

@XendraTrl(Identifier="4f40564c-ea82-47d4-2965-b6c0623686ac")
public static String es_PE_FIELD_WebStore_Stylesheet_Description="CSS (Stylesheet) used";

@XendraTrl(Identifier="4f40564c-ea82-47d4-2965-b6c0623686ac")
public static String es_PE_FIELD_WebStore_Stylesheet_Help="Base Stylesheet (.css file) to use - if empty, the default (standard.css) is used. The Style sheet can be a URL.";

@XendraField(AD_Column_ID="Stylesheet",IsCentrallyMaintained=true,
AD_Tab_ID="353fe41b-cfa9-3994-2953-7c4190d37d9a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4f40564c-ea82-47d4-2965-b6c0623686ac")
public static final String FIELDNAME_WebStore_Stylesheet="4f40564c-ea82-47d4-2965-b6c0623686ac";

@XendraTrl(Identifier="3f815a09-90c3-3b5f-6d01-41bbf5a4816f")
public static String es_PE_COLUMN_Stylesheet_Name="Stylesheet";

@XendraColumn(AD_Element_ID="8f26e92e-fb74-e562-78ad-afaee9bd5ca1",ColumnName="Stylesheet",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3f815a09-90c3-3b5f-6d01-41bbf5a4816f",
Synchronized="2019-08-30 22:24:32.0")
/** Column name Stylesheet */
public static final String COLUMNNAME_Stylesheet = "Stylesheet";
/** Set URL.
@param URL Full URL address - e.g. http://www.adempiere.org */
public void setURL (String URL)
{
if (URL == null) throw new IllegalArgumentException ("URL is mandatory.");
if (URL.length() > 120)
{
log.warning("Length > 120 - truncated");
URL = URL.substring(0,119);
}
set_Value (COLUMNNAME_URL, URL);
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
@XendraTrl(Identifier="9eb236fb-b7c1-af8c-ae7d-07c949ac847d")
public static String es_PE_FIELD_WebStore_URL_Name="URL";

@XendraTrl(Identifier="9eb236fb-b7c1-af8c-ae7d-07c949ac847d")
public static String es_PE_FIELD_WebStore_URL_Description="URL";

@XendraTrl(Identifier="9eb236fb-b7c1-af8c-ae7d-07c949ac847d")
public static String es_PE_FIELD_WebStore_URL_Help="El URL define una dirección en línea para este Socio de Negocio";

@XendraField(AD_Column_ID="URL",IsCentrallyMaintained=true,
AD_Tab_ID="353fe41b-cfa9-3994-2953-7c4190d37d9a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=25,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9eb236fb-b7c1-af8c-ae7d-07c949ac847d")
public static final String FIELDNAME_WebStore_URL="9eb236fb-b7c1-af8c-ae7d-07c949ac847d";

@XendraTrl(Identifier="42bd72ed-4780-4643-8236-3073c5afab7d")
public static String es_PE_COLUMN_URL_Name="URL";

@XendraColumn(AD_Element_ID="28e2c006-3aca-a761-94d4-14eac9cc634c",ColumnName="URL",
AD_Reference_ID=40,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="42bd72ed-4780-4643-8236-3073c5afab7d",
Synchronized="2019-08-30 22:24:32.0")
/** Column name URL */
public static final String COLUMNNAME_URL = "URL";
/** Set Web Context.
@param WebContext Web Server Context - e.g. /wstore */
public void setWebContext (String WebContext)
{
if (WebContext == null) throw new IllegalArgumentException ("WebContext is mandatory.");
if (WebContext.length() > 20)
{
log.warning("Length > 20 - truncated");
WebContext = WebContext.substring(0,19);
}
set_Value (COLUMNNAME_WebContext, WebContext);
}
/** Get Web Context.
@return Web Server Context - e.g. /wstore */
public String getWebContext() 
{
String value = (String)get_Value(COLUMNNAME_WebContext);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="9dd17559-c633-eabb-d9d2-64bae823415a")
public static String es_PE_FIELD_WebStore_WebContext_Name="Contexto Web";

@XendraTrl(Identifier="9dd17559-c633-eabb-d9d2-64bae823415a")
public static String es_PE_FIELD_WebStore_WebContext_Description="Servidor Contexto Web - e.j. /wstore";

@XendraTrl(Identifier="9dd17559-c633-eabb-d9d2-64bae823415a")
public static String es_PE_FIELD_WebStore_WebContext_Help="Contexto Único Servidor Web para esta Tienda Web - ajustará contexto -rooten application.xml. El Contexto Web Usualmente inicia con / y debe ser un nombre de contexto válido (NO verificado).";

@XendraField(AD_Column_ID="WebContext",IsCentrallyMaintained=true,
AD_Tab_ID="353fe41b-cfa9-3994-2953-7c4190d37d9a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9dd17559-c633-eabb-d9d2-64bae823415a")
public static final String FIELDNAME_WebStore_WebContext="9dd17559-c633-eabb-d9d2-64bae823415a";

@XendraTrl(Identifier="f547a9c4-e2c6-7400-1329-443180dc731f")
public static String es_PE_COLUMN_WebContext_Name="Contexto Web";

@XendraColumn(AD_Element_ID="8ce248ce-d3c3-ff7a-7636-08caf0aa8f9b",ColumnName="WebContext",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f547a9c4-e2c6-7400-1329-443180dc731f",
Synchronized="2019-08-30 22:24:32.0")
/** Column name WebContext */
public static final String COLUMNNAME_WebContext = "WebContext";
/** Set Web Store Info.
@param WebInfo Web Store Header Information */
public void setWebInfo (String WebInfo)
{
set_Value (COLUMNNAME_WebInfo, WebInfo);
}
/** Get Web Store Info.
@return Web Store Header Information */
public String getWebInfo() 
{
String value = (String)get_Value(COLUMNNAME_WebInfo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="1e169e02-3e9a-8c36-1eec-888d53112230")
public static String es_PE_FIELD_WebStore_WebStoreInfo_Name="Info Tienda Web ";

@XendraTrl(Identifier="1e169e02-3e9a-8c36-1eec-888d53112230")
public static String es_PE_FIELD_WebStore_WebStoreInfo_Description="Información del jefe de almacen de la Web";

@XendraTrl(Identifier="1e169e02-3e9a-8c36-1eec-888d53112230")
public static String es_PE_FIELD_WebStore_WebStoreInfo_Help="Exhibición de información HTML en el almacén de la Web.";

@XendraField(AD_Column_ID="WebInfo",IsCentrallyMaintained=true,
AD_Tab_ID="353fe41b-cfa9-3994-2953-7c4190d37d9a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1e169e02-3e9a-8c36-1eec-888d53112230")
public static final String FIELDNAME_WebStore_WebStoreInfo="1e169e02-3e9a-8c36-1eec-888d53112230";

@XendraTrl(Identifier="63d120d9-c907-7171-c395-2f1f3c294795")
public static String es_PE_COLUMN_WebInfo_Name="Info Tienda Web ";

@XendraColumn(AD_Element_ID="3b022d12-0917-3783-97c3-dfa09ad88fa7",ColumnName="WebInfo",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="63d120d9-c907-7171-c395-2f1f3c294795",
Synchronized="2019-08-30 22:24:32.0")
/** Column name WebInfo */
public static final String COLUMNNAME_WebInfo = "WebInfo";
/** Set Web Order EMail.
@param WebOrderEMail EMail address to receive notifications when web orders were processed */
public void setWebOrderEMail (String WebOrderEMail)
{
if (WebOrderEMail != null && WebOrderEMail.length() > 60)
{
log.warning("Length > 60 - truncated");
WebOrderEMail = WebOrderEMail.substring(0,59);
}
set_Value (COLUMNNAME_WebOrderEMail, WebOrderEMail);
}
/** Get Web Order EMail.
@return EMail address to receive notifications when web orders were processed */
public String getWebOrderEMail() 
{
String value = (String)get_Value(COLUMNNAME_WebOrderEMail);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="b6263518-cfd8-360f-f1a6-2f0c16b5738b")
public static String es_PE_FIELD_WebStore_WebOrderEMail_Name="Email de la orden de Web";

@XendraTrl(Identifier="b6263518-cfd8-360f-f1a6-2f0c16b5738b")
public static String es_PE_FIELD_WebStore_WebOrderEMail_Description="Dirección de email para recibir notificaciones cuando las órdenes de la Web fuerón procesadasa.";

@XendraTrl(Identifier="b6263518-cfd8-360f-f1a6-2f0c16b5738b")
public static String es_PE_FIELD_WebStore_WebOrderEMail_Help="Cuando procesan una orden de la Web, una confirmación se envía a las direcciones del email del cliente de la dirección del email de la petición que copia este email dirección cuando está entrado.";

@XendraField(AD_Column_ID="WebOrderEMail",IsCentrallyMaintained=true,
AD_Tab_ID="353fe41b-cfa9-3994-2953-7c4190d37d9a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b6263518-cfd8-360f-f1a6-2f0c16b5738b")
public static final String FIELDNAME_WebStore_WebOrderEMail="b6263518-cfd8-360f-f1a6-2f0c16b5738b";

@XendraTrl(Identifier="2b8cd125-5997-c1bb-eafe-1ca6b3682528")
public static String es_PE_COLUMN_WebOrderEMail_Name="Email de la orden de Web";

@XendraColumn(AD_Element_ID="718c0692-faf2-e885-ec52-1690e4a7bf77",ColumnName="WebOrderEMail",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2b8cd125-5997-c1bb-eafe-1ca6b3682528",
Synchronized="2019-08-30 22:24:32.0")
/** Column name WebOrderEMail */
public static final String COLUMNNAME_WebOrderEMail = "WebOrderEMail";
/** Set Web Parameter 1.
@param WebParam1 Web Site Parameter 1 (default: header image) */
public void setWebParam1 (String WebParam1)
{
set_Value (COLUMNNAME_WebParam1, WebParam1);
}
/** Get Web Parameter 1.
@return Web Site Parameter 1 (default: header image) */
public String getWebParam1() 
{
String value = (String)get_Value(COLUMNNAME_WebParam1);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="f83a520e-c8b0-88ca-d611-ec2165c07600")
public static String es_PE_FIELD_WebStore_WebParameter_Name="Web Socio 1";

@XendraTrl(Identifier="f83a520e-c8b0-88ca-d611-ec2165c07600")
public static String es_PE_FIELD_WebStore_WebParameter_Description="Sitio Web Parametro 1";

@XendraTrl(Identifier="f83a520e-c8b0-88ca-d611-ec2165c07600")
public static String es_PE_FIELD_WebStore_WebParameter_Help="El parámetro se podía utilizar en la página de JSP para las variables como insignias, contraseñas, URLs ó bloques enteros de hotmail. El acceso está vía ctx.webParam1";

@XendraField(AD_Column_ID="WebParam1",IsCentrallyMaintained=true,
AD_Tab_ID="353fe41b-cfa9-3994-2953-7c4190d37d9a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=320,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f83a520e-c8b0-88ca-d611-ec2165c07600")
public static final String FIELDNAME_WebStore_WebParameter="f83a520e-c8b0-88ca-d611-ec2165c07600";

@XendraTrl(Identifier="8435f973-c0a0-24a0-d2b4-f0b209e982c7")
public static String es_PE_COLUMN_WebParam1_Name="Web Socio 1";

@XendraColumn(AD_Element_ID="f55d289a-d177-3e1f-4081-c72369bb0e35",ColumnName="WebParam1",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8435f973-c0a0-24a0-d2b4-f0b209e982c7",
Synchronized="2019-08-30 22:24:32.0")
/** Column name WebParam1 */
public static final String COLUMNNAME_WebParam1 = "WebParam1";
/** Set Web Parameter 2.
@param WebParam2 Web Site Parameter 2 (default index page) */
public void setWebParam2 (String WebParam2)
{
set_Value (COLUMNNAME_WebParam2, WebParam2);
}
/** Get Web Parameter 2.
@return Web Site Parameter 2 (default index page) */
public String getWebParam2() 
{
String value = (String)get_Value(COLUMNNAME_WebParam2);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="b3432a61-0a44-b070-053f-02d9013fab48")
public static String es_PE_FIELD_WebStore_WebParameter22_Name="Web Socio 2";

@XendraTrl(Identifier="b3432a61-0a44-b070-053f-02d9013fab48")
public static String es_PE_FIELD_WebStore_WebParameter22_Description="Sitio Web parametro 2";

@XendraTrl(Identifier="b3432a61-0a44-b070-053f-02d9013fab48")
public static String es_PE_FIELD_WebStore_WebParameter22_Help="El parámetro se podía utilizar en la página de JSP para las variables como insignias, contraseñas, URLs ó bloques enteros de hotmail. El acceso está vía ctx.webParam2";

@XendraField(AD_Column_ID="WebParam2",IsCentrallyMaintained=true,
AD_Tab_ID="353fe41b-cfa9-3994-2953-7c4190d37d9a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=330,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b3432a61-0a44-b070-053f-02d9013fab48")
public static final String FIELDNAME_WebStore_WebParameter22="b3432a61-0a44-b070-053f-02d9013fab48";

@XendraTrl(Identifier="42c08f0e-18cd-837b-46ec-ebbef5e69d9d")
public static String es_PE_COLUMN_WebParam2_Name="Web Socio 2";

@XendraColumn(AD_Element_ID="a77cbc18-6000-9c67-27e5-5a09e4335fc1",ColumnName="WebParam2",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="42c08f0e-18cd-837b-46ec-ebbef5e69d9d",
Synchronized="2019-08-30 22:24:32.0")
/** Column name WebParam2 */
public static final String COLUMNNAME_WebParam2 = "WebParam2";
/** Set Web Parameter 3.
@param WebParam3 Web Site Parameter 3 (default left - menu) */
public void setWebParam3 (String WebParam3)
{
set_Value (COLUMNNAME_WebParam3, WebParam3);
}
/** Get Web Parameter 3.
@return Web Site Parameter 3 (default left - menu) */
public String getWebParam3() 
{
String value = (String)get_Value(COLUMNNAME_WebParam3);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="fb09b3c7-9378-db18-43a0-f25a977d811a")
public static String es_PE_FIELD_WebStore_WebParameter33_Name="Web Socio 3";

@XendraTrl(Identifier="fb09b3c7-9378-db18-43a0-f25a977d811a")
public static String es_PE_FIELD_WebStore_WebParameter33_Description="Sitio Web parametro 3";

@XendraTrl(Identifier="fb09b3c7-9378-db18-43a0-f25a977d811a")
public static String es_PE_FIELD_WebStore_WebParameter33_Help="El parámetro se podía utilizar en la página de JSP para las variables como insignias, contraseñas, URLs ó bloques enteros de hotmail. El acceso está vía ctx.webParam3";

@XendraField(AD_Column_ID="WebParam3",IsCentrallyMaintained=true,
AD_Tab_ID="353fe41b-cfa9-3994-2953-7c4190d37d9a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=340,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fb09b3c7-9378-db18-43a0-f25a977d811a")
public static final String FIELDNAME_WebStore_WebParameter33="fb09b3c7-9378-db18-43a0-f25a977d811a";

@XendraTrl(Identifier="468b4113-536f-c0d6-c61f-e083cdcd5969")
public static String es_PE_COLUMN_WebParam3_Name="Web Socio 3";

@XendraColumn(AD_Element_ID="9fd8e236-b3d0-fa8b-8922-15928708a71e",ColumnName="WebParam3",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="468b4113-536f-c0d6-c61f-e083cdcd5969",
Synchronized="2019-08-30 22:24:32.0")
/** Column name WebParam3 */
public static final String COLUMNNAME_WebParam3 = "WebParam3";
/** Set Web Parameter 4.
@param WebParam4 Web Site Parameter 4 (default footer left) */
public void setWebParam4 (String WebParam4)
{
set_Value (COLUMNNAME_WebParam4, WebParam4);
}
/** Get Web Parameter 4.
@return Web Site Parameter 4 (default footer left) */
public String getWebParam4() 
{
String value = (String)get_Value(COLUMNNAME_WebParam4);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="62af9b2b-deeb-ff6d-1add-74cbc6a58030")
public static String es_PE_FIELD_WebStore_WebParameter44_Name="Web Socio 4";

@XendraTrl(Identifier="62af9b2b-deeb-ff6d-1add-74cbc6a58030")
public static String es_PE_FIELD_WebStore_WebParameter44_Description="Sitio Web parametro 4";

@XendraTrl(Identifier="62af9b2b-deeb-ff6d-1add-74cbc6a58030")
public static String es_PE_FIELD_WebStore_WebParameter44_Help="El parámetro se podía utilizar en la página de JSP para las variables como insignias, contraseñas, URLs ó bloques enteros de hotmail. El acceso está vía ctx.webParam4";

@XendraField(AD_Column_ID="WebParam4",IsCentrallyMaintained=true,
AD_Tab_ID="353fe41b-cfa9-3994-2953-7c4190d37d9a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=350,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="62af9b2b-deeb-ff6d-1add-74cbc6a58030")
public static final String FIELDNAME_WebStore_WebParameter44="62af9b2b-deeb-ff6d-1add-74cbc6a58030";

@XendraTrl(Identifier="083eb2f8-33fd-baa6-055f-6e71506d334e")
public static String es_PE_COLUMN_WebParam4_Name="Web Socio 4";

@XendraColumn(AD_Element_ID="8dc7a841-f5c6-5982-1443-d3eb2247a696",ColumnName="WebParam4",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="083eb2f8-33fd-baa6-055f-6e71506d334e",
Synchronized="2019-08-30 22:24:32.0")
/** Column name WebParam4 */
public static final String COLUMNNAME_WebParam4 = "WebParam4";
/** Set Web Parameter 5.
@param WebParam5 Web Site Parameter 5 (default footer center) */
public void setWebParam5 (String WebParam5)
{
set_Value (COLUMNNAME_WebParam5, WebParam5);
}
/** Get Web Parameter 5.
@return Web Site Parameter 5 (default footer center) */
public String getWebParam5() 
{
String value = (String)get_Value(COLUMNNAME_WebParam5);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ce410a58-ed99-2fd8-377d-9f69bd6421a9")
public static String es_PE_FIELD_WebStore_WebParameter55_Name="Web Socio 5";

@XendraTrl(Identifier="ce410a58-ed99-2fd8-377d-9f69bd6421a9")
public static String es_PE_FIELD_WebStore_WebParameter55_Description="Sitio Web parametro 5";

@XendraTrl(Identifier="ce410a58-ed99-2fd8-377d-9f69bd6421a9")
public static String es_PE_FIELD_WebStore_WebParameter55_Help="El parámetro se podía utilizar en la página de JSP para las variables como insignias, contraseñas, URLs ó bloques enteros de hotmail. El acceso está vía ctx.webParam5";

@XendraField(AD_Column_ID="WebParam5",IsCentrallyMaintained=true,
AD_Tab_ID="353fe41b-cfa9-3994-2953-7c4190d37d9a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=360,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ce410a58-ed99-2fd8-377d-9f69bd6421a9")
public static final String FIELDNAME_WebStore_WebParameter55="ce410a58-ed99-2fd8-377d-9f69bd6421a9";

@XendraTrl(Identifier="84b8a121-dca0-674e-68b4-c0afc94760a1")
public static String es_PE_COLUMN_WebParam5_Name="Web Socio 5";

@XendraColumn(AD_Element_ID="21c3b095-8d5f-84b5-c543-df56f38c9598",ColumnName="WebParam5",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="84b8a121-dca0-674e-68b4-c0afc94760a1",
Synchronized="2019-08-30 22:24:32.0")
/** Column name WebParam5 */
public static final String COLUMNNAME_WebParam5 = "WebParam5";
/** Set Web Parameter 6.
@param WebParam6 Web Site Parameter 6 (default footer right) */
public void setWebParam6 (String WebParam6)
{
set_Value (COLUMNNAME_WebParam6, WebParam6);
}
/** Get Web Parameter 6.
@return Web Site Parameter 6 (default footer right) */
public String getWebParam6() 
{
String value = (String)get_Value(COLUMNNAME_WebParam6);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="443ccbf5-9ec2-770e-edf5-c70e3bfaa8ad")
public static String es_PE_FIELD_WebStore_WebParameter66_Name="Web Socio 6";

@XendraTrl(Identifier="443ccbf5-9ec2-770e-edf5-c70e3bfaa8ad")
public static String es_PE_FIELD_WebStore_WebParameter66_Description="Sitio Web parametro 6";

@XendraTrl(Identifier="443ccbf5-9ec2-770e-edf5-c70e3bfaa8ad")
public static String es_PE_FIELD_WebStore_WebParameter66_Help="El parámetro se podía utilizar en la página de JSP para las variables como insignias, contraseñas, URLs ó bloques enteros de hotmail. El acceso está vía ctx.webParam6";

@XendraField(AD_Column_ID="WebParam6",IsCentrallyMaintained=true,
AD_Tab_ID="353fe41b-cfa9-3994-2953-7c4190d37d9a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=370,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="443ccbf5-9ec2-770e-edf5-c70e3bfaa8ad")
public static final String FIELDNAME_WebStore_WebParameter66="443ccbf5-9ec2-770e-edf5-c70e3bfaa8ad";

@XendraTrl(Identifier="af005be2-bd1a-1227-a32a-0ba9610618e1")
public static String es_PE_COLUMN_WebParam6_Name="Web Socio 6";

@XendraColumn(AD_Element_ID="0f333d6a-32bd-aeb9-e9b0-eba6444b5908",ColumnName="WebParam6",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="af005be2-bd1a-1227-a32a-0ba9610618e1",
Synchronized="2019-08-30 22:24:32.0")
/** Column name WebParam6 */
public static final String COLUMNNAME_WebParam6 = "WebParam6";
/** Set Web Store EMail.
@param WStoreEMail EMail address used as the sender (From) */
public void setWStoreEMail (String WStoreEMail)
{
if (WStoreEMail != null && WStoreEMail.length() > 60)
{
log.warning("Length > 60 - truncated");
WStoreEMail = WStoreEMail.substring(0,59);
}
set_Value (COLUMNNAME_WStoreEMail, WStoreEMail);
}
/** Get Web Store EMail.
@return EMail address used as the sender (From) */
public String getWStoreEMail() 
{
String value = (String)get_Value(COLUMNNAME_WStoreEMail);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ce731c99-373b-4e99-00c6-57069d77dbe8")
public static String es_PE_FIELD_WebStore_WebStoreEMail_Name="Email para Tienda Web";

@XendraTrl(Identifier="ce731c99-373b-4e99-00c6-57069d77dbe8")
public static String es_PE_FIELD_WebStore_WebStoreEMail_Description="Dirección del email usada como el remitente (de)";

@XendraTrl(Identifier="ce731c99-373b-4e99-00c6-57069d77dbe8")
public static String es_PE_FIELD_WebStore_WebStoreEMail_Help="La dirección del email se utiliza para enviar correos a los usuarios del almacén de la tienda";

@XendraField(AD_Column_ID="WStoreEMail",IsCentrallyMaintained=true,
AD_Tab_ID="353fe41b-cfa9-3994-2953-7c4190d37d9a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ce731c99-373b-4e99-00c6-57069d77dbe8")
public static final String FIELDNAME_WebStore_WebStoreEMail="ce731c99-373b-4e99-00c6-57069d77dbe8";

@XendraTrl(Identifier="c55a653e-c87c-86b5-a70b-59f9429da518")
public static String es_PE_COLUMN_WStoreEMail_Name="Email para Tienda Web";

@XendraColumn(AD_Element_ID="a97b1a4e-f316-a8f2-f6d7-3d6a566698be",ColumnName="WStoreEMail",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c55a653e-c87c-86b5-a70b-59f9429da518",
Synchronized="2019-08-30 22:24:32.0")
/** Column name WStoreEMail */
public static final String COLUMNNAME_WStoreEMail = "WStoreEMail";
/** Set Web Store.
@param W_Store_ID A Web Store of the Client */
public void setW_Store_ID (int W_Store_ID)
{
if (W_Store_ID < 1) throw new IllegalArgumentException ("W_Store_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_W_Store_ID, Integer.valueOf(W_Store_ID));
}
/** Get Web Store.
@return A Web Store of the Client */
public int getW_Store_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_W_Store_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e7179beb-58e7-66a4-6929-5a5b70d00d1f")
public static String es_PE_FIELD_WebStore_WebStore_Name="Tienda Web";

@XendraTrl(Identifier="e7179beb-58e7-66a4-6929-5a5b70d00d1f")
public static String es_PE_FIELD_WebStore_WebStore_Description="Una tienda Web del cliente.";

@XendraField(AD_Column_ID="W_Store_ID",IsCentrallyMaintained=true,
AD_Tab_ID="353fe41b-cfa9-3994-2953-7c4190d37d9a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e7179beb-58e7-66a4-6929-5a5b70d00d1f")
public static final String FIELDNAME_WebStore_WebStore="e7179beb-58e7-66a4-6929-5a5b70d00d1f";
/** Column name W_Store_ID */
public static final String COLUMNNAME_W_Store_ID = "W_Store_ID";
/** Set WebStore User.
@param WStoreUser User ID of the Web Store EMail address */
public void setWStoreUser (String WStoreUser)
{
if (WStoreUser != null && WStoreUser.length() > 60)
{
log.warning("Length > 60 - truncated");
WStoreUser = WStoreUser.substring(0,59);
}
set_Value (COLUMNNAME_WStoreUser, WStoreUser);
}
/** Get WebStore User.
@return User ID of the Web Store EMail address */
public String getWStoreUser() 
{
String value = (String)get_Value(COLUMNNAME_WStoreUser);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="eb126bd9-8194-0648-557d-1d17bc13e9df")
public static String es_PE_FIELD_WebStore_WebStoreUser_Name="Usuario Tienda Web";

@XendraTrl(Identifier="eb126bd9-8194-0648-557d-1d17bc13e9df")
public static String es_PE_FIELD_WebStore_WebStoreUser_Description="ID del usuario de la dirección del email del almacén de la tienda";

@XendraTrl(Identifier="eb126bd9-8194-0648-557d-1d17bc13e9df")
public static String es_PE_FIELD_WebStore_WebStoreUser_Help="Identificación del usuario a conectar con el servidor del email";

@XendraField(AD_Column_ID="WStoreUser",IsCentrallyMaintained=true,
AD_Tab_ID="353fe41b-cfa9-3994-2953-7c4190d37d9a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eb126bd9-8194-0648-557d-1d17bc13e9df")
public static final String FIELDNAME_WebStore_WebStoreUser="eb126bd9-8194-0648-557d-1d17bc13e9df";

@XendraTrl(Identifier="b519568d-470f-0cd6-3d92-e115dec6d435")
public static String es_PE_COLUMN_WStoreUser_Name="Usuario Tienda Web";

@XendraColumn(AD_Element_ID="8c7e3476-bb6e-99c2-912f-b1e42853889b",ColumnName="WStoreUser",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b519568d-470f-0cd6-3d92-e115dec6d435",
Synchronized="2019-08-30 22:24:32.0")
/** Column name WStoreUser */
public static final String COLUMNNAME_WStoreUser = "WStoreUser";
/** Set WebStore Password.
@param WStoreUserPW Password of the Web Store EMail address */
public void setWStoreUserPW (String WStoreUserPW)
{
if (WStoreUserPW != null && WStoreUserPW.length() > 20)
{
log.warning("Length > 20 - truncated");
WStoreUserPW = WStoreUserPW.substring(0,19);
}
set_Value (COLUMNNAME_WStoreUserPW, WStoreUserPW);
}
/** Get WebStore Password.
@return Password of the Web Store EMail address */
public String getWStoreUserPW() 
{
String value = (String)get_Value(COLUMNNAME_WStoreUserPW);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="7b753646-10ea-7bff-c5c9-287b37035363")
public static String es_PE_FIELD_WebStore_WebStorePassword_Name="Contraseña Tienda Web";

@XendraTrl(Identifier="7b753646-10ea-7bff-c5c9-287b37035363")
public static String es_PE_FIELD_WebStore_WebStorePassword_Description="Contraseña de la dirección del Email de la tienda Web del almacén";

@XendraTrl(Identifier="7b753646-10ea-7bff-c5c9-287b37035363")
public static String es_PE_FIELD_WebStore_WebStorePassword_Help="Contraseña para conectar con el mail servidor";

@XendraField(AD_Column_ID="WStoreUserPW",IsCentrallyMaintained=true,
AD_Tab_ID="353fe41b-cfa9-3994-2953-7c4190d37d9a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7b753646-10ea-7bff-c5c9-287b37035363")
public static final String FIELDNAME_WebStore_WebStorePassword="7b753646-10ea-7bff-c5c9-287b37035363";

@XendraTrl(Identifier="6be9b5b5-5f30-0815-1744-4ef0d3e53b19")
public static String es_PE_COLUMN_WStoreUserPW_Name="Contraseña Tienda Web";

@XendraColumn(AD_Element_ID="54ad232c-6183-f148-1133-18dd2bdab739",ColumnName="WStoreUserPW",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6be9b5b5-5f30-0815-1744-4ef0d3e53b19",
Synchronized="2019-08-30 22:24:32.0")
/** Column name WStoreUserPW */
public static final String COLUMNNAME_WStoreUserPW = "WStoreUserPW";
}
