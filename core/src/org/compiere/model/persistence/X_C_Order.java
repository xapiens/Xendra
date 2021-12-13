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
/** Generated Model for C_Order
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Order extends PO
{
/** Standard Constructor
@param ctx context
@param C_Order_ID id
@param trxName transaction
*/
public X_C_Order (Properties ctx, int C_Order_ID, String trxName)
{
super (ctx, C_Order_ID, trxName);
/** if (C_Order_ID == 0)
{
setC_BPartner_ID (0);
setC_BPartner_Location_ID (0);
setC_Currency_ID (0);	
// @C_Currency_ID@
setC_DocType_ID (0);	
// 0
setC_DocTypeTarget_ID (0);
setC_Order_ID (0);
setC_PaymentTerm_ID (0);
setDateAcct (new Timestamp(System.currentTimeMillis()));	
// @SysDate@
setDateOrdered (new Timestamp(System.currentTimeMillis()));	
// @SysDate@
setDatePromised (new Timestamp(System.currentTimeMillis()));	
// @#Date@
setDeliveryRule (null);	
// A
setDeliveryViaRule (null);	
// P
setDocAction (null);	
// CO
setDocStatus (null);	
// DR
setDocumentNo (null);
setFreightAmt (Env.ZERO);	
// 0
setFreightCostRule (null);	
// I
setGrandTotal (Env.ZERO);	
// 0
setInvoiceRule (null);	
// I
setIsApproved (false);	
// @IsApproved@
setIsCreditApproved (false);	
// N
setIsDelivered (false);	
// N
setIsDiscountPrinted (false);	
// N
setIsDropShip (false);	
// N
setIsInvoiced (false);	
// N
setIsPrinted (false);	
// N
setIsSelected (false);	
// N
setIsSelfService (false);	
// N
setIsSOTrx (false);	
// @IsSOTrx@
setIsTaxIncluded (false);	
// N
setIsTransferred (false);	
// N
setM_PriceList_ID (0);
setM_Warehouse_ID (0);
setPaymentRule (null);	
// B
setPosted (false);	
// N
setPriorityRule (null);	
// 5
setProcessed (false);	
// N
setSalesRep_ID (0);
setSendEMail (false);	
// N
setTotalLines (Env.ZERO);	
// 0
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_Order (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=259 */
public static int Table_ID=MTable.getTable_ID("C_Order");

@XendraTrl(Identifier="013ae09d-8d2e-c8ec-a214-bca4be07c994")
public static String es_PE_TAB_Order_Description="Encabezamiento de la Orden";

@XendraTrl(Identifier="013ae09d-8d2e-c8ec-a214-bca4be07c994")
public static String es_PE_TAB_Order_Help="La pestaña del encabezamiento de la orden define los parámetros de una orden.";

@XendraTrl(Identifier="013ae09d-8d2e-c8ec-a214-bca4be07c994")
public static String es_PE_TAB_Order_Name="Orden";
@XendraTab(Name="Order",
Description="Order Header",
Help="The Order Header Tab defines the parameters of an Order. Changing the Organization, Business Partner, Warehouse, Date Promised, etc. changes these values on all the lines. ",
AD_Window_ID="c6b21e03-9b7e-a7c6-27ff-50703fd13562",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="IsSOTrx='Y'",OrderByClause="",CommitWarning="",
AD_Process_ID="a41dec1a-5066-61fc-7ca5-06cf4feb57b0",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="013ae09d-8d2e-c8ec-a214-bca4be07c994",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Order="013ae09d-8d2e-c8ec-a214-bca4be07c994";

@XendraTrl(Identifier="848e4431-1f94-ec97-b669-c940a941b8e2")
public static String es_PE_TAB_PurchaseOrder_Description="Encabezamiento de la Orden";

@XendraTrl(Identifier="848e4431-1f94-ec97-b669-c940a941b8e2")
public static String es_PE_TAB_PurchaseOrder_Help="La pestaña Encabezamiento de la Orden define los parámetros de una orden. Los valores de los campos determinarán como serán procesadas las líneas de la orden.";

@XendraTrl(Identifier="848e4431-1f94-ec97-b669-c940a941b8e2")
public static String es_PE_TAB_PurchaseOrder_Name="Orden de Compra";

@XendraTab(Name="Purchase Order",Description="Order Header",
Help="The Order Header Tab defines the parameters of an order.  The field values defined will determine how the Order Lines are processed.",
AD_Window_ID="041b9539-24f3-7494-c2fa-c360634d60b2",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="IsSOTrx='N'",OrderByClause="",CommitWarning="",
AD_Process_ID="a41dec1a-5066-61fc-7ca5-06cf4feb57b0",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="848e4431-1f94-ec97-b669-c940a941b8e2",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_PurchaseOrder="848e4431-1f94-ec97-b669-c940a941b8e2";

@XendraTrl(Identifier="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243")
public static String es_PE_TAB_Orders_Description="Toda la línea de orden donde el agente \"Posee\" la orden, el socio de negocio ó el producto";

@XendraTrl(Identifier="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243")
public static String es_PE_TAB_Orders_Name="Órdenes";
@XendraTab(Name="Orders",
Description="All Orders where the Agent 'owns' the Order, the Business Partner or the Product",
Help="",AD_Window_ID="a9894ddd-fe3c-1c33-44c9-6f79a11cde9e",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="b0159d23-ea3b-5c7b-2bdc-6905ce5bb43a",HasTree=false,
WhereClause="(C_Order.SalesRep_ID=@AD_User_ID@ OR EXISTS (SELECT * FROM C_BPartner bp WHERE  C_Order.C_BPartner_ID=bp.C_BPartner_ID  AND bp.SalesRep_ID=@AD_User_ID@) OR EXISTS (SELECT * FROM C_OrderLine ol INNER JOIN M_Product p ON (ol.M_Product_ID=p.M_Product_ID) WHERE C_Order.C_Order_ID=ol.C_Order_ID AND  p.SalesRep_ID=@AD_User_ID@))",
OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Orders="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243";

@XendraTrl(Identifier="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37")
public static String es_PE_TAB_PartnerOrders_Description="Órdenes de socio de negocio";

@XendraTrl(Identifier="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37")
public static String es_PE_TAB_PartnerOrders_Name="Órdenes Socios de Negocio";

@XendraTab(Name="Partner Orders",Description="Business Partner Orders",Help="",
AD_Window_ID="57133321-6993-bd92-eb4e-d35c10b15e95",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,
WhereClause="C_Order.C_BPartner_ID=@C_BPartner_ID@",OrderByClause="",CommitWarning="",
AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,
Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,IsAdvancedTab=false,
Parent_Column_ID="",Identifier="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_PartnerOrders="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37";

@XendraTrl(Identifier="404bcd8b-f40d-6c46-08aa-9636e05195b5")
public static String es_PE_TABLE_C_Order_Name="Orden";

@XendraTable(Name="Order",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Order",Help="",
TableName="C_Order",AccessLevel="1",AD_Window_ID="c6b21e03-9b7e-a7c6-27ff-50703fd13562",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=110,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,
IsChangeLog=false,IsView=false,PO_Window_ID="041b9539-24f3-7494-c2fa-c360634d60b2",
ID="org.xendra.commercial",Identifier="404bcd8b-f40d-6c46-08aa-9636e05195b5",
Synchronized="2020-11-02 17:47:00.0")
/** TableName=C_Order */
public static final String Table_Name="C_Order";


@XendraIndex(Name="c_order_documentno",Identifier="36b92334-bd08-9363-19ac-5ac6e33335e3",
Column_Names="documentno, c_doctype_id, c_bpartner_id",IsUnique="true",
TableIdentifier="36b92334-bd08-9363-19ac-5ac6e33335e3",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_order_documentno = "36b92334-bd08-9363-19ac-5ac6e33335e3";


@XendraIndex(Name="c_order_bpartner",Identifier="f5e6337a-e7bd-be04-7e36-ec15008c0e1a",
Column_Names="c_bpartner_id",IsUnique="false",
TableIdentifier="f5e6337a-e7bd-be04-7e36-ec15008c0e1a",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_order_bpartner = "f5e6337a-e7bd-be04-7e36-ec15008c0e1a";


@XendraIndex(Name="c_order_processed",Identifier="f0ec8314-5d7f-3262-6fc5-5b4c5681b06a",
Column_Names="ad_client_id, processed",IsUnique="false",
TableIdentifier="f0ec8314-5d7f-3262-6fc5-5b4c5681b06a",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_order_processed = "f0ec8314-5d7f-3262-6fc5-5b4c5681b06a";


@XendraIndex(Name="c_order_identifier",Identifier="dee46183-05bd-411d-9b71-0a5096fbb35b",
Column_Names="identifier",IsUnique="false",TableIdentifier="dee46183-05bd-411d-9b71-0a5096fbb35b",
Synchronized="2020-11-02 17:47:00.0")
public static final String INDEXNAME_c_order_identifier = "dee46183-05bd-411d-9b71-0a5096fbb35b";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Order");

protected BigDecimal accessLevel = BigDecimal.valueOf(1);
/** AccessLevel
@return 1 - Org 
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
    Table_ID = MTable.getTable_ID("C_Order");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Order[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Trx Organization.
@param AD_OrgTrx_ID Performing or initiating organization */
public void setAD_OrgTrx_ID (int AD_OrgTrx_ID)
{
if (AD_OrgTrx_ID <= 0) set_Value (COLUMNNAME_AD_OrgTrx_ID, null);
 else 
set_Value (COLUMNNAME_AD_OrgTrx_ID, Integer.valueOf(AD_OrgTrx_ID));
}
/** Get Trx Organization.
@return Performing or initiating organization */
public int getAD_OrgTrx_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_OrgTrx_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="94254464-a4e4-8515-7c1b-da98c026c9e8")
public static String es_PE_FIELD_Order_TrxOrganization_Name="Organización de la Trans.";

@XendraTrl(Identifier="94254464-a4e4-8515-7c1b-da98c026c9e8")
public static String es_PE_FIELD_Order_TrxOrganization_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="94254464-a4e4-8515-7c1b-da98c026c9e8")
public static String es_PE_FIELD_Order_TrxOrganization_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_OT@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=300,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="94254464-a4e4-8515-7c1b-da98c026c9e8")
public static final String FIELDNAME_Order_TrxOrganization="94254464-a4e4-8515-7c1b-da98c026c9e8";

@XendraTrl(Identifier="84699d82-f49e-cefd-2d53-d487e4d2ac5a")
public static String es_PE_FIELD_PurchaseOrder_TrxOrganization_Name="Organización de la Trans.";

@XendraTrl(Identifier="84699d82-f49e-cefd-2d53-d487e4d2ac5a")
public static String es_PE_FIELD_PurchaseOrder_TrxOrganization_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="84699d82-f49e-cefd-2d53-d487e4d2ac5a")
public static String es_PE_FIELD_PurchaseOrder_TrxOrganization_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_OT@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=280,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="84699d82-f49e-cefd-2d53-d487e4d2ac5a")
public static final String FIELDNAME_PurchaseOrder_TrxOrganization="84699d82-f49e-cefd-2d53-d487e4d2ac5a";

@XendraTrl(Identifier="7162fec0-32f5-6b18-1fcd-e6d85a24003d")
public static String es_PE_FIELD_PartnerOrders_TrxOrganization_Name="Organización de la Trans.";

@XendraTrl(Identifier="7162fec0-32f5-6b18-1fcd-e6d85a24003d")
public static String es_PE_FIELD_PartnerOrders_TrxOrganization_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="7162fec0-32f5-6b18-1fcd-e6d85a24003d")
public static String es_PE_FIELD_PartnerOrders_TrxOrganization_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=340,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7162fec0-32f5-6b18-1fcd-e6d85a24003d")
public static final String FIELDNAME_PartnerOrders_TrxOrganization="7162fec0-32f5-6b18-1fcd-e6d85a24003d";

@XendraTrl(Identifier="907732a5-4966-d90f-ad3b-582bfe7d5278")
public static String es_PE_FIELD_Orders_TrxOrganization_Name="Organización de la Trans.";

@XendraTrl(Identifier="907732a5-4966-d90f-ad3b-582bfe7d5278")
public static String es_PE_FIELD_Orders_TrxOrganization_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="907732a5-4966-d90f-ad3b-582bfe7d5278")
public static String es_PE_FIELD_Orders_TrxOrganization_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="907732a5-4966-d90f-ad3b-582bfe7d5278")
public static final String FIELDNAME_Orders_TrxOrganization="907732a5-4966-d90f-ad3b-582bfe7d5278";

@XendraTrl(Identifier="da786c99-3e54-248b-2664-7505564c0c52")
public static String es_PE_COLUMN_AD_OrgTrx_ID_Name="Organización de la Trans.";

@XendraColumn(AD_Element_ID="b4180358-67aa-fe55-0409-6367a60e0a2e",ColumnName="AD_OrgTrx_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="54e78591-f7f4-c613-ea27-e64b3dac5198",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="da786c99-3e54-248b-2664-7505564c0c52",Synchronized="2020-03-03 21:37:10.0")
/** Column name AD_OrgTrx_ID */
public static final String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
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

@XendraTrl(Identifier="b3fbce79-ca84-ec61-7eb5-1d816e78833e")
public static String es_PE_FIELD_Order_UserContact_Name="Contacto";

@XendraTrl(Identifier="b3fbce79-ca84-ec61-7eb5-1d816e78833e")
public static String es_PE_FIELD_Order_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="b3fbce79-ca84-ec61-7eb5-1d816e78833e")
public static String es_PE_FIELD_Order_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b3fbce79-ca84-ec61-7eb5-1d816e78833e")
public static final String FIELDNAME_Order_UserContact="b3fbce79-ca84-ec61-7eb5-1d816e78833e";

@XendraTrl(Identifier="0e4005b6-0092-d7c7-0a26-dc1eeef615e9")
public static String es_PE_FIELD_PurchaseOrder_UserContact_Name="Contacto";

@XendraTrl(Identifier="0e4005b6-0092-d7c7-0a26-dc1eeef615e9")
public static String es_PE_FIELD_PurchaseOrder_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="0e4005b6-0092-d7c7-0a26-dc1eeef615e9")
public static String es_PE_FIELD_PurchaseOrder_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0e4005b6-0092-d7c7-0a26-dc1eeef615e9")
public static final String FIELDNAME_PurchaseOrder_UserContact="0e4005b6-0092-d7c7-0a26-dc1eeef615e9";

@XendraTrl(Identifier="2e758aa5-f1f0-5677-43fa-57cfa080e1e3")
public static String es_PE_FIELD_PartnerOrders_UserContact_Name="Usuario";

@XendraTrl(Identifier="2e758aa5-f1f0-5677-43fa-57cfa080e1e3")
public static String es_PE_FIELD_PartnerOrders_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="2e758aa5-f1f0-5677-43fa-57cfa080e1e3")
public static String es_PE_FIELD_PartnerOrders_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2e758aa5-f1f0-5677-43fa-57cfa080e1e3")
public static final String FIELDNAME_PartnerOrders_UserContact="2e758aa5-f1f0-5677-43fa-57cfa080e1e3";

@XendraTrl(Identifier="07583a6a-7543-8c0f-d4bb-c8f2bc4b1292")
public static String es_PE_FIELD_Orders_UserContact_Name="Usuario";

@XendraTrl(Identifier="07583a6a-7543-8c0f-d4bb-c8f2bc4b1292")
public static String es_PE_FIELD_Orders_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="07583a6a-7543-8c0f-d4bb-c8f2bc4b1292")
public static String es_PE_FIELD_Orders_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=290,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="07583a6a-7543-8c0f-d4bb-c8f2bc4b1292")
public static final String FIELDNAME_Orders_UserContact="07583a6a-7543-8c0f-d4bb-c8f2bc4b1292";

@XendraTrl(Identifier="cfa0a993-f146-f08d-4a44-e717097e1f65")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="f4ac36a1-4200-1386-677e-14ac90afb4fe",
FieldLength=22,DefaultValue="-1",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="cfa0a993-f146-f08d-4a44-e717097e1f65",Synchronized="2020-03-03 21:37:10.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set Invoice Partner.
@param Bill_BPartner_ID Business Partner to be invoiced */
public void setBill_BPartner_ID (int Bill_BPartner_ID)
{
if (Bill_BPartner_ID <= 0) set_Value (COLUMNNAME_Bill_BPartner_ID, null);
 else 
set_Value (COLUMNNAME_Bill_BPartner_ID, Integer.valueOf(Bill_BPartner_ID));
}
/** Get Invoice Partner.
@return Business Partner to be invoiced */
public int getBill_BPartner_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Bill_BPartner_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="37b377b0-4b6b-b98f-8038-050aab8f52a6")
public static String es_PE_FIELD_Order_InvoicePartner_Name="S.N a quien se factura";

@XendraTrl(Identifier="37b377b0-4b6b-b98f-8038-050aab8f52a6")
public static String es_PE_FIELD_Order_InvoicePartner_Description="Socio de negocio a quien se efectuara la factura";

@XendraField(AD_Column_ID="Bill_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="37b377b0-4b6b-b98f-8038-050aab8f52a6")
public static final String FIELDNAME_Order_InvoicePartner="37b377b0-4b6b-b98f-8038-050aab8f52a6";

@XendraTrl(Identifier="8ab6758f-986d-470b-67fe-e4919b5dee7a")
public static String es_PE_FIELD_PurchaseOrder_InvoicePartner_Name="S.N. que emite la factura ";

@XendraTrl(Identifier="8ab6758f-986d-470b-67fe-e4919b5dee7a")
public static String es_PE_FIELD_PurchaseOrder_InvoicePartner_Description="S.N. que emite la factura ";

@XendraField(AD_Column_ID="Bill_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8ab6758f-986d-470b-67fe-e4919b5dee7a")
public static final String FIELDNAME_PurchaseOrder_InvoicePartner="8ab6758f-986d-470b-67fe-e4919b5dee7a";

@XendraTrl(Identifier="656efd1f-1334-758e-00f9-c81aa5b0eae7")
public static String es_PE_FIELD_PartnerOrders_InvoicePartner_Name="Socio Entrega Directa";

@XendraTrl(Identifier="656efd1f-1334-758e-00f9-c81aa5b0eae7")
public static String es_PE_FIELD_PartnerOrders_InvoicePartner_Description="Socio de negocio para envio de la nota.";

@XendraField(AD_Column_ID="Bill_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=480,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="656efd1f-1334-758e-00f9-c81aa5b0eae7")
public static final String FIELDNAME_PartnerOrders_InvoicePartner="656efd1f-1334-758e-00f9-c81aa5b0eae7";

@XendraTrl(Identifier="838895b8-477f-6a02-4fe7-fa795ef18fdd")
public static String es_PE_FIELD_Orders_InvoicePartner_Name="Socio Entrega Directa";

@XendraTrl(Identifier="838895b8-477f-6a02-4fe7-fa795ef18fdd")
public static String es_PE_FIELD_Orders_InvoicePartner_Description="Socio de negocio para envio de la nota.";

@XendraField(AD_Column_ID="Bill_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=470,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="838895b8-477f-6a02-4fe7-fa795ef18fdd")
public static final String FIELDNAME_Orders_InvoicePartner="838895b8-477f-6a02-4fe7-fa795ef18fdd";

@XendraTrl(Identifier="a8bc0ff8-8e9d-4588-c30d-7132cdeba6fe")
public static String es_PE_COLUMN_Bill_BPartner_ID_Name="Socio Entrega Directa";

@XendraColumn(AD_Element_ID="6bb694d0-35a5-91a6-d40f-a5f7783f3caf",ColumnName="Bill_BPartner_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="ed87c3fe-720d-c26d-0166-b5178b65db41",
AD_Val_Rule_ID="415cb456-38aa-1ff7-d8b8-e6d00b4a73ae",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutOrder.bPartnerBill",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a8bc0ff8-8e9d-4588-c30d-7132cdeba6fe",
Synchronized="2020-03-03 21:37:10.0")
/** Column name Bill_BPartner_ID */
public static final String COLUMNNAME_Bill_BPartner_ID = "Bill_BPartner_ID";
/** Set Invoice Location.
@param Bill_Location_ID Business Partner Location for invoicing */
public void setBill_Location_ID (int Bill_Location_ID)
{
if (Bill_Location_ID <= 0) set_Value (COLUMNNAME_Bill_Location_ID, null);
 else 
set_Value (COLUMNNAME_Bill_Location_ID, Integer.valueOf(Bill_Location_ID));
}
/** Get Invoice Location.
@return Business Partner Location for invoicing */
public int getBill_Location_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Bill_Location_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="19348725-ca9c-98c1-df2a-442352724002")
public static String es_PE_FIELD_Order_InvoiceLocation_Name="Direccion a la que se factura";

@XendraTrl(Identifier="19348725-ca9c-98c1-df2a-442352724002")
public static String es_PE_FIELD_Order_InvoiceLocation_Description="Direccion a la cual se envia la factura";

@XendraField(AD_Column_ID="Bill_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="19348725-ca9c-98c1-df2a-442352724002")
public static final String FIELDNAME_Order_InvoiceLocation="19348725-ca9c-98c1-df2a-442352724002";

@XendraTrl(Identifier="2e367b3e-6037-36e8-f271-cd016f577410")
public static String es_PE_FIELD_PurchaseOrder_InvoiceLocation_Name="Direccion desde donde se factura";

@XendraTrl(Identifier="2e367b3e-6037-36e8-f271-cd016f577410")
public static String es_PE_FIELD_PurchaseOrder_InvoiceLocation_Description="Localización de socio de negocio para el envío de la nota.";

@XendraField(AD_Column_ID="Bill_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2e367b3e-6037-36e8-f271-cd016f577410")
public static final String FIELDNAME_PurchaseOrder_InvoiceLocation="2e367b3e-6037-36e8-f271-cd016f577410";

@XendraTrl(Identifier="02a9fdbc-b618-671b-ab3c-b703dc9f7123")
public static String es_PE_FIELD_PartnerOrders_InvoiceLocation_Name="Localización Entrega Directa";

@XendraTrl(Identifier="02a9fdbc-b618-671b-ab3c-b703dc9f7123")
public static String es_PE_FIELD_PartnerOrders_InvoiceLocation_Description="Localización de socio de negocio para el envío de la nota.";

@XendraField(AD_Column_ID="Bill_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=500,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="02a9fdbc-b618-671b-ab3c-b703dc9f7123")
public static final String FIELDNAME_PartnerOrders_InvoiceLocation="02a9fdbc-b618-671b-ab3c-b703dc9f7123";

@XendraTrl(Identifier="a02ab8db-490f-a990-8dbb-afd3fa39e264")
public static String es_PE_FIELD_Orders_InvoiceLocation_Name="Localización Entrega Directa";

@XendraTrl(Identifier="a02ab8db-490f-a990-8dbb-afd3fa39e264")
public static String es_PE_FIELD_Orders_InvoiceLocation_Description="Localización de socio de negocio para el envío de la nota.";

@XendraField(AD_Column_ID="Bill_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=490,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a02ab8db-490f-a990-8dbb-afd3fa39e264")
public static final String FIELDNAME_Orders_InvoiceLocation="a02ab8db-490f-a990-8dbb-afd3fa39e264";

@XendraTrl(Identifier="04f971b4-5283-8663-62d9-491eee9b37c4")
public static String es_PE_COLUMN_Bill_Location_ID_Name="Localización Entrega Directa";

@XendraColumn(AD_Element_ID="deff9b41-6db9-9821-f92f-63fa1ad65b44",ColumnName="Bill_Location_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="8d01ccac-6606-99a5-ebc2-5a6e01980b37",
AD_Val_Rule_ID="95b6bac7-edb5-4d38-557a-1052567bd5c9",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="04f971b4-5283-8663-62d9-491eee9b37c4",
Synchronized="2020-03-03 21:37:10.0")
/** Column name Bill_Location_ID */
public static final String COLUMNNAME_Bill_Location_ID = "Bill_Location_ID";
/** Set Invoice Contact.
@param Bill_User_ID Business Partner Contact for invoicing */
public void setBill_User_ID (int Bill_User_ID)
{
if (Bill_User_ID <= 0) set_Value (COLUMNNAME_Bill_User_ID, null);
 else 
set_Value (COLUMNNAME_Bill_User_ID, Integer.valueOf(Bill_User_ID));
}
/** Get Invoice Contact.
@return Business Partner Contact for invoicing */
public int getBill_User_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Bill_User_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8033403b-2613-1cef-f36f-61de8dfa5e52")
public static String es_PE_FIELD_Order_InvoiceContact_Name="Contacto para la facturacion";

@XendraTrl(Identifier="8033403b-2613-1cef-f36f-61de8dfa5e52")
public static String es_PE_FIELD_Order_InvoiceContact_Description="Contacto del socio de negocio para el envío de la factura";

@XendraField(AD_Column_ID="Bill_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8033403b-2613-1cef-f36f-61de8dfa5e52")
public static final String FIELDNAME_Order_InvoiceContact="8033403b-2613-1cef-f36f-61de8dfa5e52";

@XendraTrl(Identifier="a69cca02-c3d1-789e-1a03-e5cf2521fe18")
public static String es_PE_FIELD_PurchaseOrder_InvoiceContact_Name="Contacto que entrega la factura";

@XendraTrl(Identifier="a69cca02-c3d1-789e-1a03-e5cf2521fe18")
public static String es_PE_FIELD_PurchaseOrder_InvoiceContact_Description="Contacto del socio de negocio para el envío de la nota";

@XendraField(AD_Column_ID="Bill_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a69cca02-c3d1-789e-1a03-e5cf2521fe18")
public static final String FIELDNAME_PurchaseOrder_InvoiceContact="a69cca02-c3d1-789e-1a03-e5cf2521fe18";

@XendraTrl(Identifier="9f804911-85b5-16cd-ba39-9d1b86761d56")
public static String es_PE_FIELD_PartnerOrders_InvoiceContact_Name="Contacto Entrega Directa";

@XendraTrl(Identifier="9f804911-85b5-16cd-ba39-9d1b86761d56")
public static String es_PE_FIELD_PartnerOrders_InvoiceContact_Description="Contacto del socio de negocio para el envío de la nota";

@XendraField(AD_Column_ID="Bill_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9f804911-85b5-16cd-ba39-9d1b86761d56")
public static final String FIELDNAME_PartnerOrders_InvoiceContact="9f804911-85b5-16cd-ba39-9d1b86761d56";

@XendraTrl(Identifier="8dacec43-47de-6512-ad31-c5c3a78ed396")
public static String es_PE_FIELD_Orders_InvoiceContact_Name="Contacto Entrega Directa";

@XendraTrl(Identifier="8dacec43-47de-6512-ad31-c5c3a78ed396")
public static String es_PE_FIELD_Orders_InvoiceContact_Description="Contacto del socio de negocio para el envío de la nota";

@XendraField(AD_Column_ID="Bill_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=270,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8dacec43-47de-6512-ad31-c5c3a78ed396")
public static final String FIELDNAME_Orders_InvoiceContact="8dacec43-47de-6512-ad31-c5c3a78ed396";

@XendraTrl(Identifier="38b487a5-9bd5-dee5-59fc-b91ccaec1fce")
public static String es_PE_COLUMN_Bill_User_ID_Name="Contacto Entrega Directa";

@XendraColumn(AD_Element_ID="67bd5da7-9ba6-436a-c188-05b452d0093f",ColumnName="Bill_User_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="606fce88-e8f3-4df6-0617-746fb6a85b2b",
AD_Val_Rule_ID="abad3cac-0869-b6d0-4b37-c9c74f3243b8",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="38b487a5-9bd5-dee5-59fc-b91ccaec1fce",
Synchronized="2020-03-03 21:37:10.0")
/** Column name Bill_User_ID */
public static final String COLUMNNAME_Bill_User_ID = "Bill_User_ID";
/** Set Activity.
@param C_Activity_ID Business Activity */
public void setC_Activity_ID (int C_Activity_ID)
{
if (C_Activity_ID <= 0) set_Value (COLUMNNAME_C_Activity_ID, null);
 else 
set_Value (COLUMNNAME_C_Activity_ID, Integer.valueOf(C_Activity_ID));
}
/** Get Activity.
@return Business Activity */
public int getC_Activity_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Activity_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6ce08525-7760-df63-1e4e-8f8eb374f5e9")
public static String es_PE_FIELD_Order_Activity_Name="Tipo de Gasto";

@XendraTrl(Identifier="6ce08525-7760-df63-1e4e-8f8eb374f5e9")
public static String es_PE_FIELD_Order_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="6ce08525-7760-df63-1e4e-8f8eb374f5e9")
public static String es_PE_FIELD_Order_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_AY@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=290,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="6ce08525-7760-df63-1e4e-8f8eb374f5e9")
public static final String FIELDNAME_Order_Activity="6ce08525-7760-df63-1e4e-8f8eb374f5e9";

@XendraTrl(Identifier="d0b923d2-1699-cb48-455f-ad17efbf82ce")
public static String es_PE_FIELD_PurchaseOrder_Activity_Name="Tipo de Gasto";

@XendraTrl(Identifier="d0b923d2-1699-cb48-455f-ad17efbf82ce")
public static String es_PE_FIELD_PurchaseOrder_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="d0b923d2-1699-cb48-455f-ad17efbf82ce")
public static String es_PE_FIELD_PurchaseOrder_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_AY@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=270,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d0b923d2-1699-cb48-455f-ad17efbf82ce")
public static final String FIELDNAME_PurchaseOrder_Activity="d0b923d2-1699-cb48-455f-ad17efbf82ce";

@XendraTrl(Identifier="3c1d7c46-3ced-b62d-b205-25b857935e3a")
public static String es_PE_FIELD_PartnerOrders_Activity_Name="Tipo de Gasto";

@XendraTrl(Identifier="3c1d7c46-3ced-b62d-b205-25b857935e3a")
public static String es_PE_FIELD_PartnerOrders_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="3c1d7c46-3ced-b62d-b205-25b857935e3a")
public static String es_PE_FIELD_PartnerOrders_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3c1d7c46-3ced-b62d-b205-25b857935e3a")
public static final String FIELDNAME_PartnerOrders_Activity="3c1d7c46-3ced-b62d-b205-25b857935e3a";

@XendraTrl(Identifier="4a9b91a1-d2e0-353e-d832-9bdda530d317")
public static String es_PE_FIELD_Orders_Activity_Name="Tipo de Gasto";

@XendraTrl(Identifier="4a9b91a1-d2e0-353e-d832-9bdda530d317")
public static String es_PE_FIELD_Orders_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="4a9b91a1-d2e0-353e-d832-9bdda530d317")
public static String es_PE_FIELD_Orders_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4a9b91a1-d2e0-353e-d832-9bdda530d317")
public static final String FIELDNAME_Orders_Activity="4a9b91a1-d2e0-353e-d832-9bdda530d317";

@XendraTrl(Identifier="db9bc5fb-754d-7c29-1340-270df725d295")
public static String es_PE_COLUMN_C_Activity_ID_Name="Tipo de Gasto";

@XendraColumn(AD_Element_ID="bfeadbb3-d866-26e3-8eee-3e2fdf0ff753",ColumnName="C_Activity_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="079b2687-77a7-3004-9b77-18ca68ffe4fc",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="db9bc5fb-754d-7c29-1340-270df725d295",Synchronized="2020-03-03 21:37:10.0")
/** Column name C_Activity_ID */
public static final String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID < 1) throw new IllegalArgumentException ("C_BPartner_ID is mandatory.");
set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
}
/** Get Business Partner .
@return Identifies a Business Partner */
public int getC_BPartner_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6466ed4e-28a8-8e48-47ef-78aa7fb4078d")
public static String es_PE_FIELD_Order_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="6466ed4e-28a8-8e48-47ef-78aa7fb4078d")
public static String es_PE_FIELD_Order_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="6466ed4e-28a8-8e48-47ef-78aa7fb4078d")
public static String es_PE_FIELD_Order_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6466ed4e-28a8-8e48-47ef-78aa7fb4078d")
public static final String FIELDNAME_Order_BusinessPartner="6466ed4e-28a8-8e48-47ef-78aa7fb4078d";

@XendraTrl(Identifier="5b62fb85-92cd-882a-0cda-1fc077a2c5ad")
public static String es_PE_FIELD_PurchaseOrder_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="5b62fb85-92cd-882a-0cda-1fc077a2c5ad")
public static String es_PE_FIELD_PurchaseOrder_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="5b62fb85-92cd-882a-0cda-1fc077a2c5ad")
public static String es_PE_FIELD_PurchaseOrder_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5b62fb85-92cd-882a-0cda-1fc077a2c5ad")
public static final String FIELDNAME_PurchaseOrder_BusinessPartner="5b62fb85-92cd-882a-0cda-1fc077a2c5ad";

@XendraTrl(Identifier="d70525e3-f802-d67f-853d-6e22161552fa")
public static String es_PE_FIELD_PartnerOrders_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="d70525e3-f802-d67f-853d-6e22161552fa")
public static String es_PE_FIELD_PartnerOrders_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="d70525e3-f802-d67f-853d-6e22161552fa")
public static String es_PE_FIELD_PartnerOrders_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=470,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d70525e3-f802-d67f-853d-6e22161552fa")
public static final String FIELDNAME_PartnerOrders_BusinessPartner="d70525e3-f802-d67f-853d-6e22161552fa";

@XendraTrl(Identifier="af1f98c0-210d-9950-dce4-567e9a22efd1")
public static String es_PE_FIELD_Orders_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="af1f98c0-210d-9950-dce4-567e9a22efd1")
public static String es_PE_FIELD_Orders_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="af1f98c0-210d-9950-dce4-567e9a22efd1")
public static String es_PE_FIELD_Orders_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=460,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="af1f98c0-210d-9950-dce4-567e9a22efd1")
public static final String FIELDNAME_Orders_BusinessPartner="af1f98c0-210d-9950-dce4-567e9a22efd1";

@XendraTrl(Identifier="a88f41e5-b858-bcc1-92bc-0e76d6da6670")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="06fdbbe9-e1c4-3ee4-4a9d-73d1a990cc42",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutOrder.bPartner",VFormat="",ValueMin="",ValueMax="",Version="0",
IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a88f41e5-b858-bcc1-92bc-0e76d6da6670",Synchronized="2020-03-03 21:37:10.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Partner Location.
@param C_BPartner_Location_ID Identifies the (ship to) address for this Business Partner */
public void setC_BPartner_Location_ID (int C_BPartner_Location_ID)
{
if (C_BPartner_Location_ID < 1) throw new IllegalArgumentException ("C_BPartner_Location_ID is mandatory.");
set_Value (COLUMNNAME_C_BPartner_Location_ID, Integer.valueOf(C_BPartner_Location_ID));
}
/** Get Partner Location.
@return Identifies the (ship to) address for this Business Partner */
public int getC_BPartner_Location_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_Location_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2199634c-5a93-acb4-1a31-6a9ddcebc49d")
public static String es_PE_FIELD_Order_PartnerLocation_Name="Dirección";

@XendraTrl(Identifier="2199634c-5a93-acb4-1a31-6a9ddcebc49d")
public static String es_PE_FIELD_Order_PartnerLocation_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="2199634c-5a93-acb4-1a31-6a9ddcebc49d")
public static String es_PE_FIELD_Order_PartnerLocation_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2199634c-5a93-acb4-1a31-6a9ddcebc49d")
public static final String FIELDNAME_Order_PartnerLocation="2199634c-5a93-acb4-1a31-6a9ddcebc49d";

@XendraTrl(Identifier="b52ebd83-eb01-7ce4-a84a-791d251c03ff")
public static String es_PE_FIELD_PurchaseOrder_PartnerLocation_Name="Dirección del Socio del Negocio";

@XendraTrl(Identifier="b52ebd83-eb01-7ce4-a84a-791d251c03ff")
public static String es_PE_FIELD_PurchaseOrder_PartnerLocation_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="b52ebd83-eb01-7ce4-a84a-791d251c03ff")
public static String es_PE_FIELD_PurchaseOrder_PartnerLocation_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b52ebd83-eb01-7ce4-a84a-791d251c03ff")
public static final String FIELDNAME_PurchaseOrder_PartnerLocation="b52ebd83-eb01-7ce4-a84a-791d251c03ff";

@XendraTrl(Identifier="e8889b6f-a3f0-6aed-232d-ed8f734734d2")
public static String es_PE_FIELD_PartnerOrders_PartnerLocation_Name="Dirección del Socio del Negocio";

@XendraTrl(Identifier="e8889b6f-a3f0-6aed-232d-ed8f734734d2")
public static String es_PE_FIELD_PartnerOrders_PartnerLocation_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="e8889b6f-a3f0-6aed-232d-ed8f734734d2")
public static String es_PE_FIELD_PartnerOrders_PartnerLocation_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=490,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e8889b6f-a3f0-6aed-232d-ed8f734734d2")
public static final String FIELDNAME_PartnerOrders_PartnerLocation="e8889b6f-a3f0-6aed-232d-ed8f734734d2";

@XendraTrl(Identifier="9bda6167-a55b-b488-95a9-350af335ea28")
public static String es_PE_FIELD_Orders_PartnerLocation_Name="Dirección del Socio del Negocio";

@XendraTrl(Identifier="9bda6167-a55b-b488-95a9-350af335ea28")
public static String es_PE_FIELD_Orders_PartnerLocation_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="9bda6167-a55b-b488-95a9-350af335ea28")
public static String es_PE_FIELD_Orders_PartnerLocation_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=480,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9bda6167-a55b-b488-95a9-350af335ea28")
public static final String FIELDNAME_Orders_PartnerLocation="9bda6167-a55b-b488-95a9-350af335ea28";

@XendraTrl(Identifier="5ac59b58-1dd2-b3fd-f93b-9a7cfedd6816")
public static String es_PE_COLUMN_C_BPartner_Location_ID_Name="Dirección del Socio del Negocio";

@XendraColumn(AD_Element_ID="0dab7dc6-2832-26dc-2462-cba2d40235f2",
ColumnName="C_BPartner_Location_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",
AD_Val_Rule_ID="94403aa1-55e7-94fb-41a3-ae8d99e809ba",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5ac59b58-1dd2-b3fd-f93b-9a7cfedd6816",
Synchronized="2020-03-03 21:37:10.0")
/** Column name C_BPartner_Location_ID */
public static final String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
/** Set C_BPartner_Points.
@param C_BPartner_Points_ID C_BPartner_Points */
public void setC_BPartner_Points_ID (int C_BPartner_Points_ID)
{
if (C_BPartner_Points_ID <= 0) set_Value (COLUMNNAME_C_BPartner_Points_ID, null);
 else 
set_Value (COLUMNNAME_C_BPartner_Points_ID, Integer.valueOf(C_BPartner_Points_ID));
}
/** Get C_BPartner_Points.
@return C_BPartner_Points */
public int getC_BPartner_Points_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_Points_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="56879dd4-e6dc-453c-9d06-3327304912ed")
public static String es_PE_FIELD_Order_C_BPartner_Points_Name="C_BPartner_Points";

@XendraField(AD_Column_ID="C_BPartner_Points_ID",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-06 10:29:34.0",
Identifier="56879dd4-e6dc-453c-9d06-3327304912ed")
public static final String FIELDNAME_Order_C_BPartner_Points="56879dd4-e6dc-453c-9d06-3327304912ed";

@XendraTrl(Identifier="76bdffac-b2b7-f267-fa98-3a01aafe61a2")
public static String es_PE_COLUMN_C_BPartner_Points_ID_Name="c_bpartner_points_id";

@XendraColumn(AD_Element_ID="39cfb606-316a-6599-66d3-370ec34b7098",
ColumnName="C_BPartner_Points_ID",AD_Reference_ID=30,AD_Reference_Value_ID="",
AD_Val_Rule_ID="06fdbbe9-e1c4-3ee4-4a9d-73d1a990cc42",FieldLength=10,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="76bdffac-b2b7-f267-fa98-3a01aafe61a2",
Synchronized="2020-03-03 21:37:10.0")
/** Column name C_BPartner_Points_ID */
public static final String COLUMNNAME_C_BPartner_Points_ID = "C_BPartner_Points_ID";
/** Set Campaign.
@param C_Campaign_ID Marketing Campaign */
public void setC_Campaign_ID (int C_Campaign_ID)
{
if (C_Campaign_ID <= 0) set_Value (COLUMNNAME_C_Campaign_ID, null);
 else 
set_Value (COLUMNNAME_C_Campaign_ID, Integer.valueOf(C_Campaign_ID));
}
/** Get Campaign.
@return Marketing Campaign */
public int getC_Campaign_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Campaign_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="678382be-04a1-65c7-e251-a250228c47a0")
public static String es_PE_FIELD_Order_Campaign_Name="Campaña";

@XendraTrl(Identifier="678382be-04a1-65c7-e251-a250228c47a0")
public static String es_PE_FIELD_Order_Campaign_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="678382be-04a1-65c7-e251-a250228c47a0")
public static String es_PE_FIELD_Order_Campaign_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_MC@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="678382be-04a1-65c7-e251-a250228c47a0")
public static final String FIELDNAME_Order_Campaign="678382be-04a1-65c7-e251-a250228c47a0";

@XendraTrl(Identifier="6e7fbfd0-45b3-fcac-e499-b1fee26ce6b6")
public static String es_PE_FIELD_PurchaseOrder_Campaign_Name="Centro de Costo";

@XendraTrl(Identifier="6e7fbfd0-45b3-fcac-e499-b1fee26ce6b6")
public static String es_PE_FIELD_PurchaseOrder_Campaign_Description="Campaña de Mercadeo OJO ------ para pruebas se esta cambiando a centro de costo----------------";

@XendraTrl(Identifier="6e7fbfd0-45b3-fcac-e499-b1fee26ce6b6")
public static String es_PE_FIELD_PurchaseOrder_Campaign_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_MC@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="6e7fbfd0-45b3-fcac-e499-b1fee26ce6b6")
public static final String FIELDNAME_PurchaseOrder_Campaign="6e7fbfd0-45b3-fcac-e499-b1fee26ce6b6";

@XendraTrl(Identifier="c8b58b13-16d4-1539-d5e5-313928dd7b82")
public static String es_PE_FIELD_PartnerOrders_Campaign_Name="Campaña";

@XendraTrl(Identifier="c8b58b13-16d4-1539-d5e5-313928dd7b82")
public static String es_PE_FIELD_PartnerOrders_Campaign_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="c8b58b13-16d4-1539-d5e5-313928dd7b82")
public static String es_PE_FIELD_PartnerOrders_Campaign_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=640,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c8b58b13-16d4-1539-d5e5-313928dd7b82")
public static final String FIELDNAME_PartnerOrders_Campaign="c8b58b13-16d4-1539-d5e5-313928dd7b82";

@XendraTrl(Identifier="52e5c130-d532-4dc2-ca18-f46601e9974f")
public static String es_PE_FIELD_Orders_Campaign_Name="Campaña";

@XendraTrl(Identifier="52e5c130-d532-4dc2-ca18-f46601e9974f")
public static String es_PE_FIELD_Orders_Campaign_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="52e5c130-d532-4dc2-ca18-f46601e9974f")
public static String es_PE_FIELD_Orders_Campaign_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=630,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="52e5c130-d532-4dc2-ca18-f46601e9974f")
public static final String FIELDNAME_Orders_Campaign="52e5c130-d532-4dc2-ca18-f46601e9974f";

@XendraTrl(Identifier="42a97737-c683-b7c6-06a4-9741d2e5fcb5")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaña";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="8e0d532d-2e55-9877-ef0b-a5950455e031",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="42a97737-c683-b7c6-06a4-9741d2e5fcb5",Synchronized="2020-03-03 21:37:10.0")
/** Column name C_Campaign_ID */
public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
/** Set Cash Journal Line.
@param C_CashLine_ID Cash Journal Line */
public void setC_CashLine_ID (int C_CashLine_ID)
{
if (C_CashLine_ID <= 0) set_Value (COLUMNNAME_C_CashLine_ID, null);
 else 
set_Value (COLUMNNAME_C_CashLine_ID, Integer.valueOf(C_CashLine_ID));
}
/** Get Cash Journal Line.
@return Cash Journal Line */
public int getC_CashLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_CashLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="29087da7-2d45-9603-cfd2-74c4f1c84a0c")
public static String es_PE_FIELD_Order_CashJournalLine_Name="Item del Diario de Efectivo";

@XendraTrl(Identifier="29087da7-2d45-9603-cfd2-74c4f1c84a0c")
public static String es_PE_FIELD_Order_CashJournalLine_Description="Item del diario de efectivo";

@XendraTrl(Identifier="29087da7-2d45-9603-cfd2-74c4f1c84a0c")
public static String es_PE_FIELD_Order_CashJournalLine_Help="Identifica un Item único en un diario de efectivo.";

@XendraField(AD_Column_ID="C_CashLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="29087da7-2d45-9603-cfd2-74c4f1c84a0c")
public static final String FIELDNAME_Order_CashJournalLine="29087da7-2d45-9603-cfd2-74c4f1c84a0c";

@XendraTrl(Identifier="744f6bdc-30c9-7dd5-e1fc-f4a0b08bf56f")
public static String es_PE_FIELD_PurchaseOrder_CashJournalLine_Name="Item del Diario de Efectivo";

@XendraTrl(Identifier="744f6bdc-30c9-7dd5-e1fc-f4a0b08bf56f")
public static String es_PE_FIELD_PurchaseOrder_CashJournalLine_Description="Item del diario de efectivo";

@XendraTrl(Identifier="744f6bdc-30c9-7dd5-e1fc-f4a0b08bf56f")
public static String es_PE_FIELD_PurchaseOrder_CashJournalLine_Help="Identifica un Item único en un diario de efectivo.";

@XendraField(AD_Column_ID="C_CashLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="744f6bdc-30c9-7dd5-e1fc-f4a0b08bf56f")
public static final String FIELDNAME_PurchaseOrder_CashJournalLine="744f6bdc-30c9-7dd5-e1fc-f4a0b08bf56f";

@XendraTrl(Identifier="4f2d6ec4-6fee-6d26-74e5-62189b263d3a")
public static String es_PE_FIELD_PartnerOrders_CashJournalLine_Name="Item del Diario de Efectivo";

@XendraTrl(Identifier="4f2d6ec4-6fee-6d26-74e5-62189b263d3a")
public static String es_PE_FIELD_PartnerOrders_CashJournalLine_Description="Item del diario de efectivo";

@XendraTrl(Identifier="4f2d6ec4-6fee-6d26-74e5-62189b263d3a")
public static String es_PE_FIELD_PartnerOrders_CashJournalLine_Help="Identifica un Item único en un diario de efectivo.";

@XendraField(AD_Column_ID="C_CashLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4f2d6ec4-6fee-6d26-74e5-62189b263d3a")
public static final String FIELDNAME_PartnerOrders_CashJournalLine="4f2d6ec4-6fee-6d26-74e5-62189b263d3a";

@XendraTrl(Identifier="be3b3a4f-2a1a-7d91-b361-e1c5cdee2b3c")
public static String es_PE_FIELD_Orders_CashJournalLine_Name="Item del Diario de Efectivo";

@XendraTrl(Identifier="be3b3a4f-2a1a-7d91-b361-e1c5cdee2b3c")
public static String es_PE_FIELD_Orders_CashJournalLine_Description="Item del diario de efectivo";

@XendraTrl(Identifier="be3b3a4f-2a1a-7d91-b361-e1c5cdee2b3c")
public static String es_PE_FIELD_Orders_CashJournalLine_Help="Identifica un Item único en un diario de efectivo.";

@XendraField(AD_Column_ID="C_CashLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="be3b3a4f-2a1a-7d91-b361-e1c5cdee2b3c")
public static final String FIELDNAME_Orders_CashJournalLine="be3b3a4f-2a1a-7d91-b361-e1c5cdee2b3c";

@XendraTrl(Identifier="a07eee8a-c463-7d22-95f9-b636c1b58976")
public static String es_PE_COLUMN_C_CashLine_ID_Name="Línea del Diario de Efectivo";

@XendraColumn(AD_Element_ID="51d71f75-4ff8-51c4-df6f-191def6be399",ColumnName="C_CashLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a07eee8a-c463-7d22-95f9-b636c1b58976",
Synchronized="2020-03-03 21:37:10.0")
/** Column name C_CashLine_ID */
public static final String COLUMNNAME_C_CashLine_ID = "C_CashLine_ID";
/** Set Charge.
@param C_Charge_ID Additional document charges */
public void setC_Charge_ID (int C_Charge_ID)
{
if (C_Charge_ID <= 0) set_Value (COLUMNNAME_C_Charge_ID, null);
 else 
set_Value (COLUMNNAME_C_Charge_ID, Integer.valueOf(C_Charge_ID));
}
/** Get Charge.
@return Additional document charges */
public int getC_Charge_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Charge_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8ad72a78-7bfa-a2d8-8966-4c60e76909dd")
public static String es_PE_FIELD_Order_Charge_Name="Cargo";

@XendraTrl(Identifier="8ad72a78-7bfa-a2d8-8966-4c60e76909dd")
public static String es_PE_FIELD_Order_Charge_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="8ad72a78-7bfa-a2d8-8966-4c60e76909dd")
public static String es_PE_FIELD_Order_Charge_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@HasCharges@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=250,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="8ad72a78-7bfa-a2d8-8966-4c60e76909dd")
public static final String FIELDNAME_Order_Charge="8ad72a78-7bfa-a2d8-8966-4c60e76909dd";

@XendraTrl(Identifier="d702b605-e714-0f63-dad6-eb0743cac3e3")
public static String es_PE_FIELD_PurchaseOrder_Charge_Name="Cargo";

@XendraTrl(Identifier="d702b605-e714-0f63-dad6-eb0743cac3e3")
public static String es_PE_FIELD_PurchaseOrder_Charge_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="d702b605-e714-0f63-dad6-eb0743cac3e3")
public static String es_PE_FIELD_PurchaseOrder_Charge_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@HasCharges@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=230,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d702b605-e714-0f63-dad6-eb0743cac3e3")
public static final String FIELDNAME_PurchaseOrder_Charge="d702b605-e714-0f63-dad6-eb0743cac3e3";

@XendraTrl(Identifier="fe139b84-70ec-2213-268c-25324d40d705")
public static String es_PE_FIELD_PartnerOrders_Charge_Name="Cargo";

@XendraTrl(Identifier="fe139b84-70ec-2213-268c-25324d40d705")
public static String es_PE_FIELD_PartnerOrders_Charge_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="fe139b84-70ec-2213-268c-25324d40d705")
public static String es_PE_FIELD_PartnerOrders_Charge_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fe139b84-70ec-2213-268c-25324d40d705")
public static final String FIELDNAME_PartnerOrders_Charge="fe139b84-70ec-2213-268c-25324d40d705";

@XendraTrl(Identifier="1a766213-a39e-280f-7422-3a3f49de2298")
public static String es_PE_FIELD_Orders_Charge_Name="Cargo";

@XendraTrl(Identifier="1a766213-a39e-280f-7422-3a3f49de2298")
public static String es_PE_FIELD_Orders_Charge_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="1a766213-a39e-280f-7422-3a3f49de2298")
public static String es_PE_FIELD_Orders_Charge_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1a766213-a39e-280f-7422-3a3f49de2298")
public static final String FIELDNAME_Orders_Charge="1a766213-a39e-280f-7422-3a3f49de2298";

@XendraTrl(Identifier="a27ac043-6049-6cd2-c5ed-18cbd4a483bd")
public static String es_PE_COLUMN_C_Charge_ID_Name="Cargo";

@XendraColumn(AD_Element_ID="d7e2fc48-a26e-4ded-ea44-fe15849a7883",ColumnName="C_Charge_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="f1c5fd9e-f506-616a-8e72-371fc1171092",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a27ac043-6049-6cd2-c5ed-18cbd4a483bd",Synchronized="2020-03-03 21:37:10.0")
/** Column name C_Charge_ID */
public static final String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
/** Set C_Contact.
@param C_Contact_ID C_Contact */
public void setC_Contact_ID (int C_Contact_ID)
{
if (C_Contact_ID <= 0) set_Value (COLUMNNAME_C_Contact_ID, null);
 else 
set_Value (COLUMNNAME_C_Contact_ID, Integer.valueOf(C_Contact_ID));
}
/** Get C_Contact.
@return C_Contact */
public int getC_Contact_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Contact_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="13306a76-b94c-42f1-959b-7fff20d8de07")
public static String es_PE_FIELD_Order_C_Contact_Name="C_Contact";

@XendraField(AD_Column_ID="C_Contact_ID",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-06 10:29:35.0",
Identifier="13306a76-b94c-42f1-959b-7fff20d8de07")
public static final String FIELDNAME_Order_C_Contact="13306a76-b94c-42f1-959b-7fff20d8de07";

@XendraTrl(Identifier="42bf82e9-9411-482e-a3d8-4eb73c7bf0a7")
public static String es_PE_COLUMN_C_Contact_ID_Name="C_Contact";

@XendraColumn(AD_Element_ID="bb15e679-fe21-467e-83f5-3dbf31590903",ColumnName="C_Contact_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="42bf82e9-9411-482e-a3d8-4eb73c7bf0a7",
Synchronized="2020-03-03 21:37:10.0")
/** Column name C_Contact_ID */
public static final String COLUMNNAME_C_Contact_ID = "C_Contact_ID";
/** Set ControlActivity.
@param C_ControlActivity_ID Control Activity */
public void setC_ControlActivity_ID (int C_ControlActivity_ID)
{
if (C_ControlActivity_ID <= 0) set_Value (COLUMNNAME_C_ControlActivity_ID, null);
 else 
set_Value (COLUMNNAME_C_ControlActivity_ID, Integer.valueOf(C_ControlActivity_ID));
}
/** Get ControlActivity.
@return Control Activity */
public int getC_ControlActivity_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ControlActivity_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="aff1394c-5df5-2781-47de-c4a50d770a8a")
public static String es_PE_FIELD_Order_ControlActivity_Name="Actividad de Control";

@XendraTrl(Identifier="aff1394c-5df5-2781-47de-c4a50d770a8a")
public static String es_PE_FIELD_Order_ControlActivity_Description="Actividad de Control";

@XendraField(AD_Column_ID="C_ControlActivity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aff1394c-5df5-2781-47de-c4a50d770a8a")
public static final String FIELDNAME_Order_ControlActivity="aff1394c-5df5-2781-47de-c4a50d770a8a";

@XendraTrl(Identifier="2bede58f-0a64-1500-2565-608e43c3acaf")
public static String es_PE_FIELD_PurchaseOrder_ControlActivity_Name="Actividad de Control";

@XendraTrl(Identifier="2bede58f-0a64-1500-2565-608e43c3acaf")
public static String es_PE_FIELD_PurchaseOrder_ControlActivity_Description="Actividad de Control";

@XendraField(AD_Column_ID="C_ControlActivity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="Reference",IsDisplayed=false,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2bede58f-0a64-1500-2565-608e43c3acaf")
public static final String FIELDNAME_PurchaseOrder_ControlActivity="2bede58f-0a64-1500-2565-608e43c3acaf";

@XendraTrl(Identifier="9845c523-70dc-9378-c1c3-eb64ceabe39d")
public static String es_PE_COLUMN_C_ControlActivity_ID_Name="Actividad de Control";

@XendraColumn(AD_Element_ID="93cc21ee-0269-d42b-9bdf-df9462976ca0",
ColumnName="C_ControlActivity_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9845c523-70dc-9378-c1c3-eb64ceabe39d",Synchronized="2020-03-03 21:37:10.0")
/** Column name C_ControlActivity_ID */
public static final String COLUMNNAME_C_ControlActivity_ID = "C_ControlActivity_ID";
/** Set Currency Type.
@param C_ConversionType_ID Currency Conversion Rate Type */
public void setC_ConversionType_ID (int C_ConversionType_ID)
{
if (C_ConversionType_ID <= 0) set_Value (COLUMNNAME_C_ConversionType_ID, null);
 else 
set_Value (COLUMNNAME_C_ConversionType_ID, Integer.valueOf(C_ConversionType_ID));
}
/** Get Currency Type.
@return Currency Conversion Rate Type */
public int getC_ConversionType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ConversionType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4826641f-e5d2-b3f4-f084-001121cba0b1")
public static String es_PE_FIELD_Order_CurrencyType_Name="Tipo de Moneda";

@XendraTrl(Identifier="4826641f-e5d2-b3f4-f084-001121cba0b1")
public static String es_PE_FIELD_Order_CurrencyType_Description="Tipo de índice de conversión de moneda ";

@XendraTrl(Identifier="4826641f-e5d2-b3f4-f084-001121cba0b1")
public static String es_PE_FIELD_Order_CurrencyType_Help="El tipo del índice de conversión de monedas le deja definir diversos tipos de tarifas, tarifas ej. del punto, corporativas y/o de Ventas/Compras.";

@XendraField(AD_Column_ID="C_ConversionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="Invoicing",IsDisplayed=true,
DisplayLogic="@C_Currency_ID@!@$C_Currency_ID@",DisplayLength=14,IsReadOnly=false,SeqNo=220,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4826641f-e5d2-b3f4-f084-001121cba0b1")
public static final String FIELDNAME_Order_CurrencyType="4826641f-e5d2-b3f4-f084-001121cba0b1";

@XendraTrl(Identifier="132179dd-5e9b-2a98-1548-cb5fcde45f61")
public static String es_PE_FIELD_PurchaseOrder_CurrencyType_Name="Tipo de Moneda";

@XendraTrl(Identifier="132179dd-5e9b-2a98-1548-cb5fcde45f61")
public static String es_PE_FIELD_PurchaseOrder_CurrencyType_Description="Tipo de índice de conversión de moneda ";

@XendraTrl(Identifier="132179dd-5e9b-2a98-1548-cb5fcde45f61")
public static String es_PE_FIELD_PurchaseOrder_CurrencyType_Help="El tipo del índice de conversión de monedas le deja definir diversos tipos de tarifas, tarifas ej. del punto, corporativas y/o de Ventas/Compras.";

@XendraField(AD_Column_ID="C_ConversionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="Invoicing",IsDisplayed=true,
DisplayLogic="@C_Currency_ID@!@$C_Currency_ID@",DisplayLength=14,IsReadOnly=false,SeqNo=200,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="132179dd-5e9b-2a98-1548-cb5fcde45f61")
public static final String FIELDNAME_PurchaseOrder_CurrencyType="132179dd-5e9b-2a98-1548-cb5fcde45f61";

@XendraTrl(Identifier="03cba101-333f-7449-f1b9-0eefafadcc6f")
public static String es_PE_FIELD_PartnerOrders_CurrencyType_Name="Tipo de Moneda";

@XendraTrl(Identifier="03cba101-333f-7449-f1b9-0eefafadcc6f")
public static String es_PE_FIELD_PartnerOrders_CurrencyType_Description="Tipo de índice de conversión de moneda ";

@XendraTrl(Identifier="03cba101-333f-7449-f1b9-0eefafadcc6f")
public static String es_PE_FIELD_PartnerOrders_CurrencyType_Help="El tipo del índice de conversión de monedas le deja definir diversos tipos de tarifas, tarifas ej. del punto, corporativas y/o de Ventas/Compras.";

@XendraField(AD_Column_ID="C_ConversionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=310,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="03cba101-333f-7449-f1b9-0eefafadcc6f")
public static final String FIELDNAME_PartnerOrders_CurrencyType="03cba101-333f-7449-f1b9-0eefafadcc6f";

@XendraTrl(Identifier="05e3c374-da22-b169-40ec-c7df86d6e586")
public static String es_PE_FIELD_Orders_CurrencyType_Name="Tipo de Moneda";

@XendraTrl(Identifier="05e3c374-da22-b169-40ec-c7df86d6e586")
public static String es_PE_FIELD_Orders_CurrencyType_Description="Tipo de índice de conversión de moneda ";

@XendraTrl(Identifier="05e3c374-da22-b169-40ec-c7df86d6e586")
public static String es_PE_FIELD_Orders_CurrencyType_Help="El tipo del índice de conversión de monedas le deja definir diversos tipos de tarifas, tarifas ej. del punto, corporativas y/o de Ventas/Compras.";

@XendraField(AD_Column_ID="C_ConversionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="05e3c374-da22-b169-40ec-c7df86d6e586")
public static final String FIELDNAME_Orders_CurrencyType="05e3c374-da22-b169-40ec-c7df86d6e586";

@XendraTrl(Identifier="4c0cebd4-c771-2b1e-dfdc-4930e0edc3cd")
public static String es_PE_COLUMN_C_ConversionType_ID_Name="Tipo de Moneda";

@XendraColumn(AD_Element_ID="66f5d039-c94d-0957-487b-eb3118bd7719",
ColumnName="C_ConversionType_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4c0cebd4-c771-2b1e-dfdc-4930e0edc3cd",Synchronized="2020-03-03 21:37:10.0")
/** Column name C_ConversionType_ID */
public static final String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID < 1) throw new IllegalArgumentException ("C_Currency_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
}
/** Get Currency.
@return The Currency for this record */
public int getC_Currency_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="00c33db7-629d-5921-abee-16245e684a10")
public static String es_PE_FIELD_Order_Currency_Name="Moneda";

@XendraTrl(Identifier="00c33db7-629d-5921-abee-16245e684a10")
public static String es_PE_FIELD_Order_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="00c33db7-629d-5921-abee-16245e684a10")
public static String es_PE_FIELD_Order_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="Invoicing",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=210,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="00c33db7-629d-5921-abee-16245e684a10")
public static final String FIELDNAME_Order_Currency="00c33db7-629d-5921-abee-16245e684a10";

@XendraTrl(Identifier="70a4b1d7-8e41-0fbb-7304-1ba7e5fb75db")
public static String es_PE_FIELD_PurchaseOrder_Currency_Name="Moneda";

@XendraTrl(Identifier="70a4b1d7-8e41-0fbb-7304-1ba7e5fb75db")
public static String es_PE_FIELD_PurchaseOrder_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="70a4b1d7-8e41-0fbb-7304-1ba7e5fb75db")
public static String es_PE_FIELD_PurchaseOrder_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="Invoicing",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=190,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="70a4b1d7-8e41-0fbb-7304-1ba7e5fb75db")
public static final String FIELDNAME_PurchaseOrder_Currency="70a4b1d7-8e41-0fbb-7304-1ba7e5fb75db";

@XendraTrl(Identifier="2b63a280-0cf4-a25e-fe5d-0debbfbf2c30")
public static String es_PE_FIELD_PartnerOrders_Currency_Name="Moneda";

@XendraTrl(Identifier="2b63a280-0cf4-a25e-fe5d-0debbfbf2c30")
public static String es_PE_FIELD_PartnerOrders_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="2b63a280-0cf4-a25e-fe5d-0debbfbf2c30")
public static String es_PE_FIELD_PartnerOrders_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=580,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2b63a280-0cf4-a25e-fe5d-0debbfbf2c30")
public static final String FIELDNAME_PartnerOrders_Currency="2b63a280-0cf4-a25e-fe5d-0debbfbf2c30";

@XendraTrl(Identifier="6c5485e4-9a81-36e6-1f0f-77dbc2d331f0")
public static String es_PE_FIELD_Orders_Currency_Name="Moneda";

@XendraTrl(Identifier="6c5485e4-9a81-36e6-1f0f-77dbc2d331f0")
public static String es_PE_FIELD_Orders_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="6c5485e4-9a81-36e6-1f0f-77dbc2d331f0")
public static String es_PE_FIELD_Orders_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=570,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6c5485e4-9a81-36e6-1f0f-77dbc2d331f0")
public static final String FIELDNAME_Orders_Currency="6c5485e4-9a81-36e6-1f0f-77dbc2d331f0";

@XendraTrl(Identifier="3edcd57b-bd96-70c9-b2bf-d5920d6a3fc6")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@C_Currency_ID@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3edcd57b-bd96-70c9-b2bf-d5920d6a3fc6",Synchronized="2020-03-03 21:37:10.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Document Type.
@param C_DocType_ID Document type or rules */
public void setC_DocType_ID (int C_DocType_ID)
{
if (C_DocType_ID < 0) throw new IllegalArgumentException ("C_DocType_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_DocType_ID, Integer.valueOf(C_DocType_ID));
}
/** Get Document Type.
@return Document type or rules */
public int getC_DocType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DocType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ca8b422f-4cb8-4336-eb19-25c96d9038b4")
public static String es_PE_FIELD_Order_DocumentType_Name="Tipo de Documento";

@XendraTrl(Identifier="ca8b422f-4cb8-4336-eb19-25c96d9038b4")
public static String es_PE_FIELD_Order_DocumentType_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="ca8b422f-4cb8-4336-eb19-25c96d9038b4")
public static String es_PE_FIELD_Order_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=360,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ca8b422f-4cb8-4336-eb19-25c96d9038b4")
public static final String FIELDNAME_Order_DocumentType="ca8b422f-4cb8-4336-eb19-25c96d9038b4";

@XendraTrl(Identifier="3184ae9d-7b21-8abd-e6f2-3a5009ce4cd2")
public static String es_PE_FIELD_PurchaseOrder_DocumentType_Name="Tipo de Documento";

@XendraTrl(Identifier="3184ae9d-7b21-8abd-e6f2-3a5009ce4cd2")
public static String es_PE_FIELD_PurchaseOrder_DocumentType_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="3184ae9d-7b21-8abd-e6f2-3a5009ce4cd2")
public static String es_PE_FIELD_PurchaseOrder_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=320,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3184ae9d-7b21-8abd-e6f2-3a5009ce4cd2")
public static final String FIELDNAME_PurchaseOrder_DocumentType="3184ae9d-7b21-8abd-e6f2-3a5009ce4cd2";

@XendraTrl(Identifier="82ffc1b2-7a01-d5a3-1310-620a1f7c2a61")
public static String es_PE_FIELD_PartnerOrders_DocumentType_Name="Tipo de Documento";

@XendraTrl(Identifier="82ffc1b2-7a01-d5a3-1310-620a1f7c2a61")
public static String es_PE_FIELD_PartnerOrders_DocumentType_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="82ffc1b2-7a01-d5a3-1310-620a1f7c2a61")
public static String es_PE_FIELD_PartnerOrders_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=410,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="82ffc1b2-7a01-d5a3-1310-620a1f7c2a61")
public static final String FIELDNAME_PartnerOrders_DocumentType="82ffc1b2-7a01-d5a3-1310-620a1f7c2a61";

@XendraTrl(Identifier="e8e7d330-578c-edda-c14b-16323dd66a56")
public static String es_PE_FIELD_Orders_DocumentType_Name="Tipo de Documento";

@XendraTrl(Identifier="e8e7d330-578c-edda-c14b-16323dd66a56")
public static String es_PE_FIELD_Orders_DocumentType_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="e8e7d330-578c-edda-c14b-16323dd66a56")
public static String es_PE_FIELD_Orders_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=400,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e8e7d330-578c-edda-c14b-16323dd66a56")
public static final String FIELDNAME_Orders_DocumentType="e8e7d330-578c-edda-c14b-16323dd66a56";

@XendraTrl(Identifier="3cd2b377-2bd2-d3d0-9e6d-cbbb815519fd")
public static String es_PE_COLUMN_C_DocType_ID_Name="Tipo de Documento";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="f06eaf85-a231-e1cf-ebf8-59d002c13ab4",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="0",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3cd2b377-2bd2-d3d0-9e6d-cbbb815519fd",Synchronized="2020-03-03 21:37:10.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
/** Set Target Document Type.
@param C_DocTypeTarget_ID Target document type for conversing documents */
public void setC_DocTypeTarget_ID (int C_DocTypeTarget_ID)
{
if (C_DocTypeTarget_ID < 1) throw new IllegalArgumentException ("C_DocTypeTarget_ID is mandatory.");
set_Value (COLUMNNAME_C_DocTypeTarget_ID, Integer.valueOf(C_DocTypeTarget_ID));
}
/** Get Target Document Type.
@return Target document type for conversing documents */
public int getC_DocTypeTarget_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DocTypeTarget_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="943a9c37-fa28-f19f-ba04-a32b5b91ca01")
public static String es_PE_FIELD_Order_TargetDocumentType_Name="Tipo Documento";

@XendraTrl(Identifier="943a9c37-fa28-f19f-ba04-a32b5b91ca01")
public static String es_PE_FIELD_Order_TargetDocumentType_Description="Tipo de documento destino para convertir documentos";

@XendraTrl(Identifier="943a9c37-fa28-f19f-ba04-a32b5b91ca01")
public static String es_PE_FIELD_Order_TargetDocumentType_Help="Usted puede convertir tipos de documento (Ej. Desde ofertas hasta órdenes ó facturas). La conversión es entonces reflejada en el tipo actual. Este proceso es iniciado a través de seleccionar la acción apropiada del documento.";

@XendraField(AD_Column_ID="C_DocTypeTarget_ID",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="943a9c37-fa28-f19f-ba04-a32b5b91ca01")
public static final String FIELDNAME_Order_TargetDocumentType="943a9c37-fa28-f19f-ba04-a32b5b91ca01";

@XendraTrl(Identifier="1e36c06f-9dd1-7e03-8d91-319d9e9523e0")
public static String es_PE_FIELD_PurchaseOrder_TargetDocumentType_Name="Tipo de Documento";

@XendraTrl(Identifier="1e36c06f-9dd1-7e03-8d91-319d9e9523e0")
public static String es_PE_FIELD_PurchaseOrder_TargetDocumentType_Description="Tipo de documento destino para convertir documentos";

@XendraTrl(Identifier="1e36c06f-9dd1-7e03-8d91-319d9e9523e0")
public static String es_PE_FIELD_PurchaseOrder_TargetDocumentType_Help="Usted puede convertir tipos de documento (Ej. Desde ofertas hasta órdenes ó facturas). La conversión es entonces reflejada en el tipo actual. Este proceso es iniciado a través de seleccionar la acción apropiada del documento.";

@XendraField(AD_Column_ID="C_DocTypeTarget_ID",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1e36c06f-9dd1-7e03-8d91-319d9e9523e0")
public static final String FIELDNAME_PurchaseOrder_TargetDocumentType="1e36c06f-9dd1-7e03-8d91-319d9e9523e0";

@XendraTrl(Identifier="7b788c27-1e3a-eaf6-2397-73f5908fb577")
public static String es_PE_FIELD_PartnerOrders_TargetDocumentType_Name="Tipo Documento Destino";

@XendraTrl(Identifier="7b788c27-1e3a-eaf6-2397-73f5908fb577")
public static String es_PE_FIELD_PartnerOrders_TargetDocumentType_Description="Tipo de documento destino para convertir documentos";

@XendraTrl(Identifier="7b788c27-1e3a-eaf6-2397-73f5908fb577")
public static String es_PE_FIELD_PartnerOrders_TargetDocumentType_Help="Usted puede convertir tipos de documento (Ej. Desde ofertas hasta órdenes ó facturas). La conversión es entonces reflejada en el tipo actual. Este proceso es iniciado a través de seleccionar la acción apropiada del documento.";

@XendraField(AD_Column_ID="C_DocTypeTarget_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7b788c27-1e3a-eaf6-2397-73f5908fb577")
public static final String FIELDNAME_PartnerOrders_TargetDocumentType="7b788c27-1e3a-eaf6-2397-73f5908fb577";

@XendraTrl(Identifier="77347637-df73-4757-d3ac-8f934cfede9d")
public static String es_PE_FIELD_Orders_TargetDocumentType_Name="Tipo Documento Destino";

@XendraTrl(Identifier="77347637-df73-4757-d3ac-8f934cfede9d")
public static String es_PE_FIELD_Orders_TargetDocumentType_Description="Tipo de documento destino para convertir documentos";

@XendraTrl(Identifier="77347637-df73-4757-d3ac-8f934cfede9d")
public static String es_PE_FIELD_Orders_TargetDocumentType_Help="Usted puede convertir tipos de documento (Ej. Desde ofertas hasta órdenes ó facturas). La conversión es entonces reflejada en el tipo actual. Este proceso es iniciado a través de seleccionar la acción apropiada del documento.";

@XendraField(AD_Column_ID="C_DocTypeTarget_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=340,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="77347637-df73-4757-d3ac-8f934cfede9d")
public static final String FIELDNAME_Orders_TargetDocumentType="77347637-df73-4757-d3ac-8f934cfede9d";

@XendraTrl(Identifier="16e74fc3-6e2b-d165-cbbd-9708e66a7a9c")
public static String es_PE_COLUMN_C_DocTypeTarget_ID_Name="Tipo Documento Destino";

@XendraColumn(AD_Element_ID="6dee1e94-d5bf-ba0d-a64a-25cdb5fd9515",ColumnName="C_DocTypeTarget_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="f06eaf85-a231-e1cf-ebf8-59d002c13ab4",
AD_Val_Rule_ID="7f96faec-0030-579b-d3ba-81411d3e1924",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutOrder.docType",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="16e74fc3-6e2b-d165-cbbd-9708e66a7a9c",Synchronized="2020-03-03 21:37:10.0")
/** Column name C_DocTypeTarget_ID */
public static final String COLUMNNAME_C_DocTypeTarget_ID = "C_DocTypeTarget_ID";
/** Set Charge amount.
@param ChargeAmt Charge Amount */
public void setChargeAmt (BigDecimal ChargeAmt)
{
set_Value (COLUMNNAME_ChargeAmt, ChargeAmt);
}
/** Get Charge amount.
@return Charge Amount */
public BigDecimal getChargeAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ChargeAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="12f63fd4-3e40-af24-306c-6132a0fa294d")
public static String es_PE_FIELD_Order_ChargeAmount_Name="Total de Cargo";

@XendraTrl(Identifier="12f63fd4-3e40-af24-306c-6132a0fa294d")
public static String es_PE_FIELD_Order_ChargeAmount_Description="Total del Cargo";

@XendraTrl(Identifier="12f63fd4-3e40-af24-306c-6132a0fa294d")
public static String es_PE_FIELD_Order_ChargeAmount_Help="El Total Cargo indica el total para un cargo adicional";

@XendraField(AD_Column_ID="ChargeAmt",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@HasCharges@='Y'",DisplayLength=26,IsReadOnly=false,SeqNo=260,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="12f63fd4-3e40-af24-306c-6132a0fa294d")
public static final String FIELDNAME_Order_ChargeAmount="12f63fd4-3e40-af24-306c-6132a0fa294d";

@XendraTrl(Identifier="b527411b-01ed-4b74-8f5f-96938dbb4eab")
public static String es_PE_FIELD_PurchaseOrder_ChargeAmount_Name="Total de Cargo";

@XendraTrl(Identifier="b527411b-01ed-4b74-8f5f-96938dbb4eab")
public static String es_PE_FIELD_PurchaseOrder_ChargeAmount_Description="Total del Cargo";

@XendraTrl(Identifier="b527411b-01ed-4b74-8f5f-96938dbb4eab")
public static String es_PE_FIELD_PurchaseOrder_ChargeAmount_Help="El Total Cargo indica el total para un cargo adicional";

@XendraField(AD_Column_ID="ChargeAmt",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@HasCharges@='Y'",DisplayLength=26,IsReadOnly=false,SeqNo=240,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b527411b-01ed-4b74-8f5f-96938dbb4eab")
public static final String FIELDNAME_PurchaseOrder_ChargeAmount="b527411b-01ed-4b74-8f5f-96938dbb4eab";

@XendraTrl(Identifier="a0704397-6fbc-58dd-76ab-5195640deee4")
public static String es_PE_FIELD_PartnerOrders_ChargeAmount_Name="Total de Cargo";

@XendraTrl(Identifier="a0704397-6fbc-58dd-76ab-5195640deee4")
public static String es_PE_FIELD_PartnerOrders_ChargeAmount_Description="Total del Cargo";

@XendraTrl(Identifier="a0704397-6fbc-58dd-76ab-5195640deee4")
public static String es_PE_FIELD_PartnerOrders_ChargeAmount_Help="El Total Cargo indica el total para un cargo adicional";

@XendraField(AD_Column_ID="ChargeAmt",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a0704397-6fbc-58dd-76ab-5195640deee4")
public static final String FIELDNAME_PartnerOrders_ChargeAmount="a0704397-6fbc-58dd-76ab-5195640deee4";

@XendraTrl(Identifier="bf0d0730-ed36-1bf9-649b-127b83f1b6a7")
public static String es_PE_FIELD_Orders_ChargeAmount_Name="Total de Cargo";

@XendraTrl(Identifier="bf0d0730-ed36-1bf9-649b-127b83f1b6a7")
public static String es_PE_FIELD_Orders_ChargeAmount_Description="Total del Cargo";

@XendraTrl(Identifier="bf0d0730-ed36-1bf9-649b-127b83f1b6a7")
public static String es_PE_FIELD_Orders_ChargeAmount_Help="El Total Cargo indica el total para un cargo adicional";

@XendraField(AD_Column_ID="ChargeAmt",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=280,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bf0d0730-ed36-1bf9-649b-127b83f1b6a7")
public static final String FIELDNAME_Orders_ChargeAmount="bf0d0730-ed36-1bf9-649b-127b83f1b6a7";

@XendraTrl(Identifier="ca58d14f-b8af-0a3e-62b7-26f4154907d5")
public static String es_PE_COLUMN_ChargeAmt_Name="Total de Cargo";

@XendraColumn(AD_Element_ID="0700d401-01bb-8f19-a508-aa47155ba852",ColumnName="ChargeAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ca58d14f-b8af-0a3e-62b7-26f4154907d5",
Synchronized="2020-03-03 21:37:10.0")
/** Column name ChargeAmt */
public static final String COLUMNNAME_ChargeAmt = "ChargeAmt";
/** Set Copy From.
@param CopyFrom Copy From Record */
public void setCopyFrom (String CopyFrom)
{
if (CopyFrom != null && CopyFrom.length() > 1)
{
log.warning("Length > 1 - truncated");
CopyFrom = CopyFrom.substring(0,0);
}
set_Value (COLUMNNAME_CopyFrom, CopyFrom);
}
/** Get Copy From.
@return Copy From Record */
public String getCopyFrom() 
{
return (String)get_Value(COLUMNNAME_CopyFrom);
}

@XendraTrl(Identifier="fd146f66-9002-52d3-dfdd-60df3335582c")
public static String es_PE_FIELD_Order_CopyLines_Name="Copiar Ítems";

@XendraTrl(Identifier="fd146f66-9002-52d3-dfdd-60df3335582c")
public static String es_PE_FIELD_Order_CopyLines_Description="Copiar Lineas Desde otra Factura";

@XendraField(AD_Column_ID="CopyFrom",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=370,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fd146f66-9002-52d3-dfdd-60df3335582c")
public static final String FIELDNAME_Order_CopyLines="fd146f66-9002-52d3-dfdd-60df3335582c";

@XendraTrl(Identifier="00c814b4-3462-0df6-1020-4769de0b8499")
public static String es_PE_FIELD_PurchaseOrder_CopyLines_Name="Copiar Lineas";

@XendraTrl(Identifier="00c814b4-3462-0df6-1020-4769de0b8499")
public static String es_PE_FIELD_PurchaseOrder_CopyLines_Description="Copiar Lineas Desde otra Factura";

@XendraField(AD_Column_ID="CopyFrom",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=350,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="00c814b4-3462-0df6-1020-4769de0b8499")
public static final String FIELDNAME_PurchaseOrder_CopyLines="00c814b4-3462-0df6-1020-4769de0b8499";

@XendraTrl(Identifier="669067b4-02d3-b65f-760c-1b157476aca7")
public static String es_PE_FIELD_PartnerOrders_CopyLines_Name="Copiar Lineas";

@XendraTrl(Identifier="669067b4-02d3-b65f-760c-1b157476aca7")
public static String es_PE_FIELD_PartnerOrders_CopyLines_Description="Copiar Lineas Desde otra Factura";

@XendraField(AD_Column_ID="CopyFrom",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=350,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="669067b4-02d3-b65f-760c-1b157476aca7")
public static final String FIELDNAME_PartnerOrders_CopyLines="669067b4-02d3-b65f-760c-1b157476aca7";

@XendraTrl(Identifier="c994f718-befe-f451-8006-8e0b8da27c24")
public static String es_PE_FIELD_Orders_CopyLines_Name="Copiar Lineas";

@XendraTrl(Identifier="c994f718-befe-f451-8006-8e0b8da27c24")
public static String es_PE_FIELD_Orders_CopyLines_Description="Copiar Lineas Desde otra Factura";

@XendraField(AD_Column_ID="CopyFrom",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c994f718-befe-f451-8006-8e0b8da27c24")
public static final String FIELDNAME_Orders_CopyLines="c994f718-befe-f451-8006-8e0b8da27c24";

@XendraTrl(Identifier="c65669cc-14df-b744-a017-058bca49f489")
public static String es_PE_COLUMN_CopyFrom_Name="Copiar Desde";

@XendraColumn(AD_Element_ID="2d763fac-73d8-32e6-3aa1-e987486f2022",ColumnName="CopyFrom",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="de7e22a0-8b97-ad4e-8439-593479632e55",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c65669cc-14df-b744-a017-058bca49f489",Synchronized="2020-03-03 21:37:10.0")
/** Column name CopyFrom */
public static final String COLUMNNAME_CopyFrom = "CopyFrom";
/** Set Order.
@param C_Order_ID Order */
public void setC_Order_ID (int C_Order_ID)
{
if (C_Order_ID < 1) throw new IllegalArgumentException ("C_Order_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Order_ID, Integer.valueOf(C_Order_ID));
}
/** Get Order.
@return Order */
public int getC_Order_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Order_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b005afdd-e2dd-db36-ee96-9cc90713d11d")
public static String es_PE_FIELD_Order_Order_Name="Orden de Venta";

@XendraTrl(Identifier="b005afdd-e2dd-db36-ee96-9cc90713d11d")
public static String es_PE_FIELD_Order_Order_Description="Orden de Venta";

@XendraTrl(Identifier="b005afdd-e2dd-db36-ee96-9cc90713d11d")
public static String es_PE_FIELD_Order_Order_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b005afdd-e2dd-db36-ee96-9cc90713d11d")
public static final String FIELDNAME_Order_Order="b005afdd-e2dd-db36-ee96-9cc90713d11d";

@XendraTrl(Identifier="d8118420-86b2-8e81-77d2-391766d8f010")
public static String es_PE_FIELD_PurchaseOrder_PurchaseOrder_Name="Orden de compra";

@XendraTrl(Identifier="d8118420-86b2-8e81-77d2-391766d8f010")
public static String es_PE_FIELD_PurchaseOrder_PurchaseOrder_Description="Orden de compra";

@XendraTrl(Identifier="d8118420-86b2-8e81-77d2-391766d8f010")
public static String es_PE_FIELD_PurchaseOrder_PurchaseOrder_Help="La compra es Identificada con un ID único de orden de compra. Esta controlado por la secuencia de este tipo de documento.";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d8118420-86b2-8e81-77d2-391766d8f010")
public static final String FIELDNAME_PurchaseOrder_PurchaseOrder="d8118420-86b2-8e81-77d2-391766d8f010";

@XendraTrl(Identifier="99ca4f36-7424-f0fa-62d3-f99bf5f25c4f")
public static String es_PE_FIELD_PartnerOrders_Order_Name="Orden de Venta";

@XendraTrl(Identifier="99ca4f36-7424-f0fa-62d3-f99bf5f25c4f")
public static String es_PE_FIELD_PartnerOrders_Order_Description="Orden de Venta";

@XendraTrl(Identifier="99ca4f36-7424-f0fa-62d3-f99bf5f25c4f")
public static String es_PE_FIELD_PartnerOrders_Order_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="1=2",DisplayLength=14,IsReadOnly=false,SeqNo=670,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="99ca4f36-7424-f0fa-62d3-f99bf5f25c4f")
public static final String FIELDNAME_PartnerOrders_Order="99ca4f36-7424-f0fa-62d3-f99bf5f25c4f";

@XendraTrl(Identifier="2ce96e0a-55a3-e04f-e9e9-e081a20f4874")
public static String es_PE_FIELD_Orders_Order_Name="Orden de Venta";

@XendraTrl(Identifier="2ce96e0a-55a3-e04f-e9e9-e081a20f4874")
public static String es_PE_FIELD_Orders_Order_Description="Orden de Venta";

@XendraTrl(Identifier="2ce96e0a-55a3-e04f-e9e9-e081a20f4874")
public static String es_PE_FIELD_Orders_Order_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2ce96e0a-55a3-e04f-e9e9-e081a20f4874")
public static final String FIELDNAME_Orders_Order="2ce96e0a-55a3-e04f-e9e9-e081a20f4874";
/** Column name C_Order_ID */
public static final String COLUMNNAME_C_Order_ID = "C_Order_ID";
/** Set Payment.
@param C_Payment_ID Payment identifier */
public void setC_Payment_ID (int C_Payment_ID)
{
if (C_Payment_ID <= 0) set_Value (COLUMNNAME_C_Payment_ID, null);
 else 
set_Value (COLUMNNAME_C_Payment_ID, Integer.valueOf(C_Payment_ID));
}
/** Get Payment.
@return Payment identifier */
public int getC_Payment_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Payment_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f8e05c27-1b81-56ac-89c4-15437d87197b")
public static String es_PE_FIELD_Order_Payment_Name="Pago";

@XendraTrl(Identifier="f8e05c27-1b81-56ac-89c4-15437d87197b")
public static String es_PE_FIELD_Order_Payment_Description="Identificador del pago";

@XendraTrl(Identifier="f8e05c27-1b81-56ac-89c4-15437d87197b")
public static String es_PE_FIELD_Order_Payment_Help="El pago es un identificador único de este pago.";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f8e05c27-1b81-56ac-89c4-15437d87197b")
public static final String FIELDNAME_Order_Payment="f8e05c27-1b81-56ac-89c4-15437d87197b";

@XendraTrl(Identifier="f58b799c-6019-4f07-f185-af9fd47d0863")
public static String es_PE_FIELD_PurchaseOrder_Payment_Name="Pago";

@XendraTrl(Identifier="f58b799c-6019-4f07-f185-af9fd47d0863")
public static String es_PE_FIELD_PurchaseOrder_Payment_Description="Identificador del pago";

@XendraTrl(Identifier="f58b799c-6019-4f07-f185-af9fd47d0863")
public static String es_PE_FIELD_PurchaseOrder_Payment_Help="El pago es un identificador único de este pago.";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f58b799c-6019-4f07-f185-af9fd47d0863")
public static final String FIELDNAME_PurchaseOrder_Payment="f58b799c-6019-4f07-f185-af9fd47d0863";

@XendraTrl(Identifier="e32240ea-8410-9cf4-4d14-31e1622452db")
public static String es_PE_FIELD_PartnerOrders_Payment_Name="Pago";

@XendraTrl(Identifier="e32240ea-8410-9cf4-4d14-31e1622452db")
public static String es_PE_FIELD_PartnerOrders_Payment_Description="Identificador del pago";

@XendraTrl(Identifier="e32240ea-8410-9cf4-4d14-31e1622452db")
public static String es_PE_FIELD_PartnerOrders_Payment_Help="El pago es un identificador único de este pago.";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e32240ea-8410-9cf4-4d14-31e1622452db")
public static final String FIELDNAME_PartnerOrders_Payment="e32240ea-8410-9cf4-4d14-31e1622452db";

@XendraTrl(Identifier="dd3dde9d-2708-f562-ff6a-594583de28de")
public static String es_PE_FIELD_Orders_Payment_Name="Pago";

@XendraTrl(Identifier="dd3dde9d-2708-f562-ff6a-594583de28de")
public static String es_PE_FIELD_Orders_Payment_Description="Identificador del pago";

@XendraTrl(Identifier="dd3dde9d-2708-f562-ff6a-594583de28de")
public static String es_PE_FIELD_Orders_Payment_Help="El pago es un identificador único de este pago.";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dd3dde9d-2708-f562-ff6a-594583de28de")
public static final String FIELDNAME_Orders_Payment="dd3dde9d-2708-f562-ff6a-594583de28de";

@XendraTrl(Identifier="ec90464d-ed61-84e7-1dca-eda67324d6b8")
public static String es_PE_COLUMN_C_Payment_ID_Name="Pago";

@XendraColumn(AD_Element_ID="3ded5658-968e-94c5-207b-eed6f6a7bb43",ColumnName="C_Payment_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ec90464d-ed61-84e7-1dca-eda67324d6b8",
Synchronized="2020-03-03 21:37:10.0")
/** Column name C_Payment_ID */
public static final String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
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

@XendraTrl(Identifier="6cb75cac-639e-83b6-eb54-8f1256dc3afd")
public static String es_PE_FIELD_Order_PaymentTerm_Name="Término de Pago";

@XendraTrl(Identifier="6cb75cac-639e-83b6-eb54-8f1256dc3afd")
public static String es_PE_FIELD_Order_PaymentTerm_Description="Condiciones de pago de esta transacción";

@XendraTrl(Identifier="6cb75cac-639e-83b6-eb54-8f1256dc3afd")
public static String es_PE_FIELD_Order_PaymentTerm_Help="Las condiciones de pago indican el método y tiempo de pago para esta transacción.";

@XendraField(AD_Column_ID="C_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@PaymentRule@='P' | @PaymentRule@='D'",DisplayLength=14,IsReadOnly=false,SeqNo=280,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="6cb75cac-639e-83b6-eb54-8f1256dc3afd")
public static final String FIELDNAME_Order_PaymentTerm="6cb75cac-639e-83b6-eb54-8f1256dc3afd";

@XendraTrl(Identifier="71e0e2a4-8044-a06b-d037-f4b02b9e3106")
public static String es_PE_FIELD_PurchaseOrder_PaymentTerm_Name="Término de Pago";

@XendraTrl(Identifier="71e0e2a4-8044-a06b-d037-f4b02b9e3106")
public static String es_PE_FIELD_PurchaseOrder_PaymentTerm_Description="Condiciones de pago de esta transacción";

@XendraTrl(Identifier="71e0e2a4-8044-a06b-d037-f4b02b9e3106")
public static String es_PE_FIELD_PurchaseOrder_PaymentTerm_Help="Las condiciones de pago indican el método y tiempo de pago para esta transacción.";

@XendraField(AD_Column_ID="C_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@PaymentRule@='P'",DisplayLength=14,IsReadOnly=false,SeqNo=260,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="71e0e2a4-8044-a06b-d037-f4b02b9e3106")
public static final String FIELDNAME_PurchaseOrder_PaymentTerm="71e0e2a4-8044-a06b-d037-f4b02b9e3106";

@XendraTrl(Identifier="cfe22e63-bd36-cdd5-94ca-3e5206b1806d")
public static String es_PE_FIELD_PartnerOrders_PaymentTerm_Name="Término de Pago";

@XendraTrl(Identifier="cfe22e63-bd36-cdd5-94ca-3e5206b1806d")
public static String es_PE_FIELD_PartnerOrders_PaymentTerm_Description="Condiciones de pago de esta transacción";

@XendraTrl(Identifier="cfe22e63-bd36-cdd5-94ca-3e5206b1806d")
public static String es_PE_FIELD_PartnerOrders_PaymentTerm_Help="Las condiciones de pago indican el método y tiempo de pago para esta transacción.";

@XendraField(AD_Column_ID="C_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=620,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cfe22e63-bd36-cdd5-94ca-3e5206b1806d")
public static final String FIELDNAME_PartnerOrders_PaymentTerm="cfe22e63-bd36-cdd5-94ca-3e5206b1806d";

@XendraTrl(Identifier="59befd31-84f4-f09c-0193-481c3e817319")
public static String es_PE_FIELD_Orders_PaymentTerm_Name="Término de Pago";

@XendraTrl(Identifier="59befd31-84f4-f09c-0193-481c3e817319")
public static String es_PE_FIELD_Orders_PaymentTerm_Description="Condiciones de pago de esta transacción";

@XendraTrl(Identifier="59befd31-84f4-f09c-0193-481c3e817319")
public static String es_PE_FIELD_Orders_PaymentTerm_Help="Las condiciones de pago indican el método y tiempo de pago para esta transacción.";

@XendraField(AD_Column_ID="C_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=610,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="59befd31-84f4-f09c-0193-481c3e817319")
public static final String FIELDNAME_Orders_PaymentTerm="59befd31-84f4-f09c-0193-481c3e817319";

@XendraTrl(Identifier="41f3abf4-962a-8959-55c8-48197c2b44ca")
public static String es_PE_COLUMN_C_PaymentTerm_ID_Name="Término de Pago";

@XendraColumn(AD_Element_ID="9b2224b8-8020-a83c-2d1e-ea35741c781a",ColumnName="C_PaymentTerm_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="41f3abf4-962a-8959-55c8-48197c2b44ca",
Synchronized="2020-03-03 21:37:10.0")
/** Column name C_PaymentTerm_ID */
public static final String COLUMNNAME_C_PaymentTerm_ID = "C_PaymentTerm_ID";
/** Set POS Terminal.
@param C_POS_ID Point of Sales Terminal */
public void setC_POS_ID (int C_POS_ID)
{
if (C_POS_ID <= 0) set_Value (COLUMNNAME_C_POS_ID, null);
 else 
set_Value (COLUMNNAME_C_POS_ID, Integer.valueOf(C_POS_ID));
}
/** Get POS Terminal.
@return Point of Sales Terminal */
public int getC_POS_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_POS_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="bbc740dc-e57e-4197-81f5-97ddaeced791")
public static String es_PE_COLUMN_C_POS_ID_Name="POS Terminal";

@XendraColumn(AD_Element_ID="c2adeeab-8099-b658-0016-5d97a32be4a2",ColumnName="C_POS_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bbc740dc-e57e-4197-81f5-97ddaeced791",
Synchronized="2020-03-03 21:37:10.0")
/** Column name C_POS_ID */
public static final String COLUMNNAME_C_POS_ID = "C_POS_ID";
/** Set Project.
@param C_Project_ID Financial Project */
public void setC_Project_ID (int C_Project_ID)
{
if (C_Project_ID <= 0) set_Value (COLUMNNAME_C_Project_ID, null);
 else 
set_Value (COLUMNNAME_C_Project_ID, Integer.valueOf(C_Project_ID));
}
/** Get Project.
@return Financial Project */
public int getC_Project_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Project_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="14fdb204-00f3-d65d-2bf2-e4dece12e455")
public static String es_PE_FIELD_Order_Project_Name="Proyecto";

@XendraTrl(Identifier="14fdb204-00f3-d65d-2bf2-e4dece12e455")
public static String es_PE_FIELD_Order_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="14fdb204-00f3-d65d-2bf2-e4dece12e455")
public static String es_PE_FIELD_Order_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="Reference",IsDisplayed=false,
DisplayLogic="@$Element_PJ@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="14fdb204-00f3-d65d-2bf2-e4dece12e455")
public static final String FIELDNAME_Order_Project="14fdb204-00f3-d65d-2bf2-e4dece12e455";

@XendraTrl(Identifier="4047a55a-d0d8-9e82-ec24-4a188e39860b")
public static String es_PE_FIELD_PurchaseOrder_Project_Name="Proyecto";

@XendraTrl(Identifier="4047a55a-d0d8-9e82-ec24-4a188e39860b")
public static String es_PE_FIELD_PurchaseOrder_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="4047a55a-d0d8-9e82-ec24-4a188e39860b")
public static String es_PE_FIELD_PurchaseOrder_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="Reference",IsDisplayed=false,
DisplayLogic="@$Element_PJ@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4047a55a-d0d8-9e82-ec24-4a188e39860b")
public static final String FIELDNAME_PurchaseOrder_Project="4047a55a-d0d8-9e82-ec24-4a188e39860b";

@XendraTrl(Identifier="8ab27b90-6fa3-66bb-e0e8-52c52256fc2e")
public static String es_PE_FIELD_PartnerOrders_Project_Name="Proyecto";

@XendraTrl(Identifier="8ab27b90-6fa3-66bb-e0e8-52c52256fc2e")
public static String es_PE_FIELD_PartnerOrders_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="8ab27b90-6fa3-66bb-e0e8-52c52256fc2e")
public static String es_PE_FIELD_PartnerOrders_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=630,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8ab27b90-6fa3-66bb-e0e8-52c52256fc2e")
public static final String FIELDNAME_PartnerOrders_Project="8ab27b90-6fa3-66bb-e0e8-52c52256fc2e";

@XendraTrl(Identifier="3f017048-cb2a-0761-b886-cf32a30f3c16")
public static String es_PE_FIELD_Orders_Project_Name="Proyecto";

@XendraTrl(Identifier="3f017048-cb2a-0761-b886-cf32a30f3c16")
public static String es_PE_FIELD_Orders_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="3f017048-cb2a-0761-b886-cf32a30f3c16")
public static String es_PE_FIELD_Orders_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=620,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3f017048-cb2a-0761-b886-cf32a30f3c16")
public static final String FIELDNAME_Orders_Project="3f017048-cb2a-0761-b886-cf32a30f3c16";

@XendraTrl(Identifier="fcee04e0-fd90-f3fd-6341-d5dc3ea49e3b")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="961cbc99-cc24-46df-b94e-37fe139285bf",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="fcee04e0-fd90-f3fd-6341-d5dc3ea49e3b",Synchronized="2020-03-03 21:37:10.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
/** Set UnitApplication.
@param C_UnitApplication_ID UnitApplication */
public void setC_UnitApplication_ID (int C_UnitApplication_ID)
{
if (C_UnitApplication_ID <= 0) set_Value (COLUMNNAME_C_UnitApplication_ID, null);
 else 
set_Value (COLUMNNAME_C_UnitApplication_ID, Integer.valueOf(C_UnitApplication_ID));
}
/** Get UnitApplication.
@return UnitApplication */
public int getC_UnitApplication_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_UnitApplication_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5b1c7626-ba70-d6a0-3f4f-202cd3ab7651")
public static String es_PE_FIELD_Order_UnitApplication_Name="UnitApplication";

@XendraField(AD_Column_ID="C_UnitApplication_ID",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5b1c7626-ba70-d6a0-3f4f-202cd3ab7651")
public static final String FIELDNAME_Order_UnitApplication="5b1c7626-ba70-d6a0-3f4f-202cd3ab7651";

@XendraTrl(Identifier="b3af1386-9c76-e043-53c8-a01162bdfbf7")
public static String es_PE_FIELD_PurchaseOrder_UnitApplication_Name="UnitApplication";

@XendraField(AD_Column_ID="C_UnitApplication_ID",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b3af1386-9c76-e043-53c8-a01162bdfbf7")
public static final String FIELDNAME_PurchaseOrder_UnitApplication="b3af1386-9c76-e043-53c8-a01162bdfbf7";

@XendraTrl(Identifier="67ae4cfc-2140-c35d-08ec-5252cdce7cdf")
public static String es_PE_COLUMN_C_UnitApplication_ID_Name="UnitApplication";

@XendraColumn(AD_Element_ID="f5c81a47-6e91-7f96-fb33-6da9a07a172f",
ColumnName="C_UnitApplication_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="67ae4cfc-2140-c35d-08ec-5252cdce7cdf",Synchronized="2020-03-03 21:37:10.0")
/** Column name C_UnitApplication_ID */
public static final String COLUMNNAME_C_UnitApplication_ID = "C_UnitApplication_ID";
/** Set Account Date.
@param DateAcct Accounting Date */
public void setDateAcct (Timestamp DateAcct)
{
if (DateAcct == null) throw new IllegalArgumentException ("DateAcct is mandatory.");
set_Value (COLUMNNAME_DateAcct, DateAcct);
}
/** Get Account Date.
@return Accounting Date */
public Timestamp getDateAcct() 
{
return (Timestamp)get_Value(COLUMNNAME_DateAcct);
}

@XendraTrl(Identifier="704f31d6-a38e-6807-1bff-8c08105cf11b")
public static String es_PE_FIELD_Order_AccountDate_Name="Fecha de Aplicación CG";

@XendraTrl(Identifier="704f31d6-a38e-6807-1bff-8c08105cf11b")
public static String es_PE_FIELD_Order_AccountDate_Description="Fecha contable";

@XendraTrl(Identifier="704f31d6-a38e-6807-1bff-8c08105cf11b")
public static String es_PE_FIELD_Order_AccountDate_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="704f31d6-a38e-6807-1bff-8c08105cf11b")
public static final String FIELDNAME_Order_AccountDate="704f31d6-a38e-6807-1bff-8c08105cf11b";

@XendraTrl(Identifier="2558f1a8-0c7f-7f8a-90da-67167a867c73")
public static String es_PE_FIELD_PurchaseOrder_AccountDate_Name="Fecha de Aplicación CG";

@XendraTrl(Identifier="2558f1a8-0c7f-7f8a-90da-67167a867c73")
public static String es_PE_FIELD_PurchaseOrder_AccountDate_Description="Fecha contable";

@XendraTrl(Identifier="2558f1a8-0c7f-7f8a-90da-67167a867c73")
public static String es_PE_FIELD_PurchaseOrder_AccountDate_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2558f1a8-0c7f-7f8a-90da-67167a867c73")
public static final String FIELDNAME_PurchaseOrder_AccountDate="2558f1a8-0c7f-7f8a-90da-67167a867c73";

@XendraTrl(Identifier="a8d0de3c-96d0-ed5d-055c-20779f7ac917")
public static String es_PE_FIELD_PartnerOrders_AccountDate_Name="Fecha de Aplicación CG";

@XendraTrl(Identifier="a8d0de3c-96d0-ed5d-055c-20779f7ac917")
public static String es_PE_FIELD_PartnerOrders_AccountDate_Description="Fecha contable";

@XendraTrl(Identifier="a8d0de3c-96d0-ed5d-055c-20779f7ac917")
public static String es_PE_FIELD_PartnerOrders_AccountDate_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=440,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a8d0de3c-96d0-ed5d-055c-20779f7ac917")
public static final String FIELDNAME_PartnerOrders_AccountDate="a8d0de3c-96d0-ed5d-055c-20779f7ac917";

@XendraTrl(Identifier="23225cbc-77ba-4a54-fb9a-4c657536b0bc")
public static String es_PE_FIELD_Orders_AccountDate_Name="Fecha de Aplicación CG";

@XendraTrl(Identifier="23225cbc-77ba-4a54-fb9a-4c657536b0bc")
public static String es_PE_FIELD_Orders_AccountDate_Description="Fecha contable";

@XendraTrl(Identifier="23225cbc-77ba-4a54-fb9a-4c657536b0bc")
public static String es_PE_FIELD_Orders_AccountDate_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=430,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="23225cbc-77ba-4a54-fb9a-4c657536b0bc")
public static final String FIELDNAME_Orders_AccountDate="23225cbc-77ba-4a54-fb9a-4c657536b0bc";

@XendraTrl(Identifier="9ed4b38a-fc46-9f69-1a18-f5a3bebfa032")
public static String es_PE_COLUMN_DateAcct_Name="Fecha de Aplicación CG";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,
DefaultValue="@SysDate@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9ed4b38a-fc46-9f69-1a18-f5a3bebfa032",Synchronized="2020-03-03 21:37:10.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";
/** Set Date Invoiced.
@param DateInvoiced Date printed on Invoice */
public void setDateInvoiced (Timestamp DateInvoiced)
{
set_Value (COLUMNNAME_DateInvoiced, DateInvoiced);
}
/** Get Date Invoiced.
@return Date printed on Invoice */
public Timestamp getDateInvoiced() 
{
return (Timestamp)get_Value(COLUMNNAME_DateInvoiced);
}

@XendraTrl(Identifier="a3a283fb-7074-4d80-b126-ec71cfe65e9f")
public static String es_PE_COLUMN_DateInvoiced_Name="Date Invoiced";

@XendraColumn(AD_Element_ID="5e3c1a65-f97d-82ed-a21c-bc730ca3c080",ColumnName="DateInvoiced",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a3a283fb-7074-4d80-b126-ec71cfe65e9f",
Synchronized="2020-03-03 21:37:10.0")
/** Column name DateInvoiced */
public static final String COLUMNNAME_DateInvoiced = "DateInvoiced";
/** Set Date Ordered.
@param DateOrdered Date of Order */
public void setDateOrdered (Timestamp DateOrdered)
{
if (DateOrdered == null) throw new IllegalArgumentException ("DateOrdered is mandatory.");
set_Value (COLUMNNAME_DateOrdered, DateOrdered);
}
/** Get Date Ordered.
@return Date of Order */
public Timestamp getDateOrdered() 
{
return (Timestamp)get_Value(COLUMNNAME_DateOrdered);
}

@XendraTrl(Identifier="cd1c7ae2-dc76-5d60-16b1-1d35c69d81f7")
public static String es_PE_FIELD_Order_DateOrdered_Name="Fecha de la Orden";

@XendraTrl(Identifier="cd1c7ae2-dc76-5d60-16b1-1d35c69d81f7")
public static String es_PE_FIELD_Order_DateOrdered_Description="Fecha de la orden";

@XendraTrl(Identifier="cd1c7ae2-dc76-5d60-16b1-1d35c69d81f7")
public static String es_PE_FIELD_Order_DateOrdered_Help="Indica la fecha en que un artículo fue ordenada";

@XendraField(AD_Column_ID="DateOrdered",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cd1c7ae2-dc76-5d60-16b1-1d35c69d81f7")
public static final String FIELDNAME_Order_DateOrdered="cd1c7ae2-dc76-5d60-16b1-1d35c69d81f7";

@XendraTrl(Identifier="5f3906ca-943a-2e01-9d6d-77b3ee76e302")
public static String es_PE_FIELD_PurchaseOrder_DateOrdered_Name="Fecha de la Orden";

@XendraTrl(Identifier="5f3906ca-943a-2e01-9d6d-77b3ee76e302")
public static String es_PE_FIELD_PurchaseOrder_DateOrdered_Description="Fecha de la orden";

@XendraTrl(Identifier="5f3906ca-943a-2e01-9d6d-77b3ee76e302")
public static String es_PE_FIELD_PurchaseOrder_DateOrdered_Help="Indica la fecha en que un artículo fue ordenada";

@XendraField(AD_Column_ID="DateOrdered",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5f3906ca-943a-2e01-9d6d-77b3ee76e302")
public static final String FIELDNAME_PurchaseOrder_DateOrdered="5f3906ca-943a-2e01-9d6d-77b3ee76e302";

@XendraTrl(Identifier="7a719afc-5327-7fd1-47df-14cfe1c237ac")
public static String es_PE_FIELD_PartnerOrders_DateOrdered_Name="Fecha de la Orden";

@XendraTrl(Identifier="7a719afc-5327-7fd1-47df-14cfe1c237ac")
public static String es_PE_FIELD_PartnerOrders_DateOrdered_Description="Fecha de la orden";

@XendraTrl(Identifier="7a719afc-5327-7fd1-47df-14cfe1c237ac")
public static String es_PE_FIELD_PartnerOrders_DateOrdered_Help="Indica la fecha en que un artículo fue ordenada";

@XendraField(AD_Column_ID="DateOrdered",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=430,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7a719afc-5327-7fd1-47df-14cfe1c237ac")
public static final String FIELDNAME_PartnerOrders_DateOrdered="7a719afc-5327-7fd1-47df-14cfe1c237ac";

@XendraTrl(Identifier="0e4e70d6-e3be-4b33-97ba-289226c1bb50")
public static String es_PE_FIELD_Orders_DateOrdered_Name="Fecha de la Orden";

@XendraTrl(Identifier="0e4e70d6-e3be-4b33-97ba-289226c1bb50")
public static String es_PE_FIELD_Orders_DateOrdered_Description="Fecha de la orden";

@XendraTrl(Identifier="0e4e70d6-e3be-4b33-97ba-289226c1bb50")
public static String es_PE_FIELD_Orders_DateOrdered_Help="Indica la fecha en que un artículo fue ordenada";

@XendraField(AD_Column_ID="DateOrdered",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=420,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0e4e70d6-e3be-4b33-97ba-289226c1bb50")
public static final String FIELDNAME_Orders_DateOrdered="0e4e70d6-e3be-4b33-97ba-289226c1bb50";

@XendraTrl(Identifier="464e2a7d-283e-0cc4-e0b4-d199602647f0")
public static String es_PE_COLUMN_DateOrdered_Name="Fecha de la Orden";

@XendraColumn(AD_Element_ID="c265ae59-eec5-5c6b-26ee-1090bf37ce26",ColumnName="DateOrdered",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,
DefaultValue="@SysDate@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=true,SeqNo=2,IsTranslated=false,
Callout="org.compiere.model.CalloutEngine.dateAcct",VFormat="",ValueMin="",ValueMax="",Version="1",
IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="464e2a7d-283e-0cc4-e0b4-d199602647f0",Synchronized="2020-03-03 21:37:10.0")
/** Column name DateOrdered */
public static final String COLUMNNAME_DateOrdered = "DateOrdered";
/** Set Date printed.
@param DatePrinted Date the document was printed. */
public void setDatePrinted (Timestamp DatePrinted)
{
set_Value (COLUMNNAME_DatePrinted, DatePrinted);
}
/** Get Date printed.
@return Date the document was printed. */
public Timestamp getDatePrinted() 
{
return (Timestamp)get_Value(COLUMNNAME_DatePrinted);
}

@XendraTrl(Identifier="0e6b5ee6-c362-75f5-baf1-cfe41c194e29")
public static String es_PE_FIELD_Order_DatePrinted_Name="Fecha de Impresión";

@XendraTrl(Identifier="0e6b5ee6-c362-75f5-baf1-cfe41c194e29")
public static String es_PE_FIELD_Order_DatePrinted_Description="Fecha en que el documento fue impreso";

@XendraTrl(Identifier="0e6b5ee6-c362-75f5-baf1-cfe41c194e29")
public static String es_PE_FIELD_Order_DatePrinted_Help="Indica la fecha en que este documento se imprimió.";

@XendraField(AD_Column_ID="DatePrinted",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0e6b5ee6-c362-75f5-baf1-cfe41c194e29")
public static final String FIELDNAME_Order_DatePrinted="0e6b5ee6-c362-75f5-baf1-cfe41c194e29";

@XendraTrl(Identifier="658820e2-56f7-c6a1-b159-93779e136ba6")
public static String es_PE_FIELD_PurchaseOrder_DatePrinted_Name="Fecha de Impresión";

@XendraTrl(Identifier="658820e2-56f7-c6a1-b159-93779e136ba6")
public static String es_PE_FIELD_PurchaseOrder_DatePrinted_Description="Fecha en que el documento fue impreso";

@XendraTrl(Identifier="658820e2-56f7-c6a1-b159-93779e136ba6")
public static String es_PE_FIELD_PurchaseOrder_DatePrinted_Help="Indica la fecha en que este documento se imprimió.";

@XendraField(AD_Column_ID="DatePrinted",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="658820e2-56f7-c6a1-b159-93779e136ba6")
public static final String FIELDNAME_PurchaseOrder_DatePrinted="658820e2-56f7-c6a1-b159-93779e136ba6";

@XendraTrl(Identifier="d99ee19e-b67c-8419-05c1-246e2561af59")
public static String es_PE_FIELD_PartnerOrders_DatePrinted_Name="Fecha de Impresión";

@XendraTrl(Identifier="d99ee19e-b67c-8419-05c1-246e2561af59")
public static String es_PE_FIELD_PartnerOrders_DatePrinted_Description="Fecha en que el documento fue impreso";

@XendraTrl(Identifier="d99ee19e-b67c-8419-05c1-246e2561af59")
public static String es_PE_FIELD_PartnerOrders_DatePrinted_Help="Indica la fecha en que este documento se imprimió.";

@XendraField(AD_Column_ID="DatePrinted",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=460,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d99ee19e-b67c-8419-05c1-246e2561af59")
public static final String FIELDNAME_PartnerOrders_DatePrinted="d99ee19e-b67c-8419-05c1-246e2561af59";

@XendraTrl(Identifier="9e7dd81c-b2ed-50d5-1b56-c528f599e4e7")
public static String es_PE_FIELD_Orders_DatePrinted_Name="Fecha de Impresión";

@XendraTrl(Identifier="9e7dd81c-b2ed-50d5-1b56-c528f599e4e7")
public static String es_PE_FIELD_Orders_DatePrinted_Description="Fecha en que el documento fue impreso";

@XendraTrl(Identifier="9e7dd81c-b2ed-50d5-1b56-c528f599e4e7")
public static String es_PE_FIELD_Orders_DatePrinted_Help="Indica la fecha en que este documento se imprimió.";

@XendraField(AD_Column_ID="DatePrinted",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=450,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9e7dd81c-b2ed-50d5-1b56-c528f599e4e7")
public static final String FIELDNAME_Orders_DatePrinted="9e7dd81c-b2ed-50d5-1b56-c528f599e4e7";

@XendraTrl(Identifier="3ade7407-916b-9cdd-1ced-63398cdf6f5e")
public static String es_PE_COLUMN_DatePrinted_Name="Fecha de Impresión";

@XendraColumn(AD_Element_ID="0b68d937-f4a8-8b9d-aeeb-b029c126580d",ColumnName="DatePrinted",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3ade7407-916b-9cdd-1ced-63398cdf6f5e",
Synchronized="2020-03-03 21:37:10.0")
/** Column name DatePrinted */
public static final String COLUMNNAME_DatePrinted = "DatePrinted";
/** Set Date Promised.
@param DatePromised Date Order was promised */
public void setDatePromised (Timestamp DatePromised)
{
if (DatePromised == null) throw new IllegalArgumentException ("DatePromised is mandatory.");
set_Value (COLUMNNAME_DatePromised, DatePromised);
}
/** Get Date Promised.
@return Date Order was promised */
public Timestamp getDatePromised() 
{
return (Timestamp)get_Value(COLUMNNAME_DatePromised);
}

@XendraTrl(Identifier="4d39b9c3-962b-822f-bc6c-593d14335df5")
public static String es_PE_FIELD_Order_DatePromised_Name="Fecha Prometida";

@XendraTrl(Identifier="4d39b9c3-962b-822f-bc6c-593d14335df5")
public static String es_PE_FIELD_Order_DatePromised_Description="Fecha de promesa de la orden.";

@XendraTrl(Identifier="4d39b9c3-962b-822f-bc6c-593d14335df5")
public static String es_PE_FIELD_Order_DatePromised_Help="La fecha prometida indica la fecha; si hay alguna; en que la orden fue prometida al cliente.";

@XendraField(AD_Column_ID="DatePromised",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@OrderType@='OB' | @OrderType@='SO'",DisplayLength=14,IsReadOnly=false,SeqNo=90,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4d39b9c3-962b-822f-bc6c-593d14335df5")
public static final String FIELDNAME_Order_DatePromised="4d39b9c3-962b-822f-bc6c-593d14335df5";

@XendraTrl(Identifier="9946aa70-a701-bc1f-6a3d-0df7d2ff3bb2")
public static String es_PE_FIELD_PurchaseOrder_DatePromised_Name="Fecha Prometida";

@XendraTrl(Identifier="9946aa70-a701-bc1f-6a3d-0df7d2ff3bb2")
public static String es_PE_FIELD_PurchaseOrder_DatePromised_Description="Fecha de promesa de la orden.";

@XendraTrl(Identifier="9946aa70-a701-bc1f-6a3d-0df7d2ff3bb2")
public static String es_PE_FIELD_PurchaseOrder_DatePromised_Help="La fecha prometida indica la fecha; si hay alguna; en que la orden fue prometida al cliente.";

@XendraField(AD_Column_ID="DatePromised",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9946aa70-a701-bc1f-6a3d-0df7d2ff3bb2")
public static final String FIELDNAME_PurchaseOrder_DatePromised="9946aa70-a701-bc1f-6a3d-0df7d2ff3bb2";

@XendraTrl(Identifier="2df5e602-b3e7-2031-0974-d526a1fa1495")
public static String es_PE_FIELD_PartnerOrders_DatePromised_Name="Fecha Prometida";

@XendraTrl(Identifier="2df5e602-b3e7-2031-0974-d526a1fa1495")
public static String es_PE_FIELD_PartnerOrders_DatePromised_Description="Fecha de promesa de la orden.";

@XendraTrl(Identifier="2df5e602-b3e7-2031-0974-d526a1fa1495")
public static String es_PE_FIELD_PartnerOrders_DatePromised_Help="La fecha prometida indica la fecha; si hay alguna; en que la orden fue prometida al cliente.";

@XendraField(AD_Column_ID="DatePromised",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=450,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2df5e602-b3e7-2031-0974-d526a1fa1495")
public static final String FIELDNAME_PartnerOrders_DatePromised="2df5e602-b3e7-2031-0974-d526a1fa1495";

@XendraTrl(Identifier="617d1910-24a4-5259-2083-e8ec43f86817")
public static String es_PE_FIELD_Orders_DatePromised_Name="Fecha Prometida";

@XendraTrl(Identifier="617d1910-24a4-5259-2083-e8ec43f86817")
public static String es_PE_FIELD_Orders_DatePromised_Description="Fecha de promesa de la orden.";

@XendraTrl(Identifier="617d1910-24a4-5259-2083-e8ec43f86817")
public static String es_PE_FIELD_Orders_DatePromised_Help="La fecha prometida indica la fecha; si hay alguna; en que la orden fue prometida al cliente.";

@XendraField(AD_Column_ID="DatePromised",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=440,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="617d1910-24a4-5259-2083-e8ec43f86817")
public static final String FIELDNAME_Orders_DatePromised="617d1910-24a4-5259-2083-e8ec43f86817";

@XendraTrl(Identifier="f4c65f3b-0b89-6f6f-8a55-fd59c38e0b40")
public static String es_PE_COLUMN_DatePromised_Name="Fecha Prometida";

@XendraColumn(AD_Element_ID="d2ffe555-d546-1a8a-bb07-b98f3ba547cf",ColumnName="DatePromised",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="@#Date@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f4c65f3b-0b89-6f6f-8a55-fd59c38e0b40",
Synchronized="2020-03-03 21:37:10.0")
/** Column name DatePromised */
public static final String COLUMNNAME_DatePromised = "DatePromised";
/** Set DebtAmt.
@param DebtAmt DebtAmt */
public void setDebtAmt (BigDecimal DebtAmt)
{
set_Value (COLUMNNAME_DebtAmt, DebtAmt);
}
/** Get DebtAmt.
@return DebtAmt */
public BigDecimal getDebtAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_DebtAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="ea1d9e2f-b064-462f-9a2a-69484a9905b2")
public static String es_PE_FIELD_Order_DebtAmt_Name="DebtAmt";
@XendraField(AD_Column_ID="DebtAmt",
IsCentrallyMaintained=true,AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",
IsDisplayed=false,DisplayLogic="",DisplayLength=131089,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2016-10-06 10:29:35.0",Identifier="ea1d9e2f-b064-462f-9a2a-69484a9905b2")
public static final String FIELDNAME_Order_DebtAmt="ea1d9e2f-b064-462f-9a2a-69484a9905b2";

@XendraTrl(Identifier="3cc9eae4-3217-4a4a-95aa-e26e19ec642e")
public static String es_PE_COLUMN_DebtAmt_Name="DebtAmt";

@XendraColumn(AD_Element_ID="1b6b41c5-29d8-fdb3-fc2b-e4d5423fec46",ColumnName="DebtAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3cc9eae4-3217-4a4a-95aa-e26e19ec642e",
Synchronized="2020-03-03 21:37:10.0")
/** Column name DebtAmt */
public static final String COLUMNNAME_DebtAmt = "DebtAmt";
/** Set Delivery Rule.
@param DeliveryRule Defines the timing of Delivery */
public void setDeliveryRule (String DeliveryRule)
{
if (DeliveryRule.length() > 1)
{
log.warning("Length > 1 - truncated");
DeliveryRule = DeliveryRule.substring(0,0);
}
set_Value (COLUMNNAME_DeliveryRule, DeliveryRule);
}
/** Get Delivery Rule.
@return Defines the timing of Delivery */
public String getDeliveryRule() 
{
return (String)get_Value(COLUMNNAME_DeliveryRule);
}

@XendraTrl(Identifier="d3c92bb6-3485-9d94-e4e3-6fb2c25c400b")
public static String es_PE_FIELD_Order_DeliveryRule_Name="Regla de Entrega";

@XendraTrl(Identifier="d3c92bb6-3485-9d94-e4e3-6fb2c25c400b")
public static String es_PE_FIELD_Order_DeliveryRule_Description="Define los tiempos de entrega";

@XendraTrl(Identifier="d3c92bb6-3485-9d94-e4e3-6fb2c25c400b")
public static String es_PE_FIELD_Order_DeliveryRule_Help="La Regla de Entrega indica cuando una orden debe ser entregada. Por Ej. Si la orden debiera entregarse cuando  esta completa; cuando una partida esta completa ó cuando el producto llega a estar disponible.";

@XendraField(AD_Column_ID="DeliveryRule",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="Delivery",IsDisplayed=true,
DisplayLogic="@OrderType@='SO'",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d3c92bb6-3485-9d94-e4e3-6fb2c25c400b")
public static final String FIELDNAME_Order_DeliveryRule="d3c92bb6-3485-9d94-e4e3-6fb2c25c400b";

@XendraTrl(Identifier="d1b64e38-41b5-d4fb-b13e-9403b66e52df")
public static String es_PE_FIELD_PurchaseOrder_DeliveryRule_Name="Regla de Entrega";

@XendraTrl(Identifier="d1b64e38-41b5-d4fb-b13e-9403b66e52df")
public static String es_PE_FIELD_PurchaseOrder_DeliveryRule_Description="Define los tiempos de entrega";

@XendraTrl(Identifier="d1b64e38-41b5-d4fb-b13e-9403b66e52df")
public static String es_PE_FIELD_PurchaseOrder_DeliveryRule_Help="La Regla de Entrega indica cuando una orden debe ser entregada. Por Ej. Si la orden debiera entregarse cuando  esta completa; cuando una partida esta completa ó cuando el producto llega a estar disponible.";

@XendraField(AD_Column_ID="DeliveryRule",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d1b64e38-41b5-d4fb-b13e-9403b66e52df")
public static final String FIELDNAME_PurchaseOrder_DeliveryRule="d1b64e38-41b5-d4fb-b13e-9403b66e52df";

@XendraTrl(Identifier="6bd21c10-8555-556c-8fbe-a2afe9bb3528")
public static String es_PE_FIELD_PartnerOrders_DeliveryRule_Name="Regla de Entrega";

@XendraTrl(Identifier="6bd21c10-8555-556c-8fbe-a2afe9bb3528")
public static String es_PE_FIELD_PartnerOrders_DeliveryRule_Description="Define los tiempos de entrega";

@XendraTrl(Identifier="6bd21c10-8555-556c-8fbe-a2afe9bb3528")
public static String es_PE_FIELD_PartnerOrders_DeliveryRule_Help="La Regla de Entrega indica cuando una orden debe ser entregada. Por Ej. Si la orden debiera entregarse cuando  esta completa; cuando una partida esta completa ó cuando el producto llega a estar disponible.";

@XendraField(AD_Column_ID="DeliveryRule",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="Delivery",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=510,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6bd21c10-8555-556c-8fbe-a2afe9bb3528")
public static final String FIELDNAME_PartnerOrders_DeliveryRule="6bd21c10-8555-556c-8fbe-a2afe9bb3528";

@XendraTrl(Identifier="60a2e32e-e591-1909-6090-99c1b2ef53f3")
public static String es_PE_FIELD_Orders_DeliveryRule_Name="Regla de Entrega";

@XendraTrl(Identifier="60a2e32e-e591-1909-6090-99c1b2ef53f3")
public static String es_PE_FIELD_Orders_DeliveryRule_Description="Define los tiempos de entrega";

@XendraTrl(Identifier="60a2e32e-e591-1909-6090-99c1b2ef53f3")
public static String es_PE_FIELD_Orders_DeliveryRule_Help="La Regla de Entrega indica cuando una orden debe ser entregada. Por Ej. Si la orden debiera entregarse cuando  esta completa; cuando una partida esta completa ó cuando el producto llega a estar disponible.";

@XendraField(AD_Column_ID="DeliveryRule",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="Delivery",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=500,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="60a2e32e-e591-1909-6090-99c1b2ef53f3")
public static final String FIELDNAME_Orders_DeliveryRule="60a2e32e-e591-1909-6090-99c1b2ef53f3";

@XendraTrl(Identifier="c6de551e-6ca2-e079-afa5-0b77952fe7b8")
public static String es_PE_COLUMN_DeliveryRule_Name="Regla de Entrega";

@XendraColumn(AD_Element_ID="bfc0b304-42d5-bfa2-4997-a3024ea284f9",ColumnName="DeliveryRule",
AD_Reference_ID=17,AD_Reference_Value_ID="dd6ca989-f822-5b38-ea47-5420e7ccb16b",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="A",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c6de551e-6ca2-e079-afa5-0b77952fe7b8",Synchronized="2020-03-03 21:37:10.0")
/** Column name DeliveryRule */
public static final String COLUMNNAME_DeliveryRule = "DeliveryRule";
/** Set Delivery Via.
@param DeliveryViaRule How the order will be delivered */
public void setDeliveryViaRule (String DeliveryViaRule)
{
if (DeliveryViaRule.length() > 1)
{
log.warning("Length > 1 - truncated");
DeliveryViaRule = DeliveryViaRule.substring(0,0);
}
set_Value (COLUMNNAME_DeliveryViaRule, DeliveryViaRule);
}
/** Get Delivery Via.
@return How the order will be delivered */
public String getDeliveryViaRule() 
{
return (String)get_Value(COLUMNNAME_DeliveryViaRule);
}

@XendraTrl(Identifier="7f134916-6d3a-bd78-ca5f-6cec0a19a79a")
public static String es_PE_FIELD_Order_DeliveryVia_Name="Vía de Entrega";

@XendraTrl(Identifier="7f134916-6d3a-bd78-ca5f-6cec0a19a79a")
public static String es_PE_FIELD_Order_DeliveryVia_Description="Como será entregada la orden";

@XendraTrl(Identifier="7f134916-6d3a-bd78-ca5f-6cec0a19a79a")
public static String es_PE_FIELD_Order_DeliveryVia_Help="La vía de entrega indica como el producto debería ser entregado. Por Ej. Si la orden será recogida ó embarcada.";

@XendraField(AD_Column_ID="DeliveryViaRule",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="Delivery",IsDisplayed=true,
DisplayLogic="@OrderType@='SO'",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="7f134916-6d3a-bd78-ca5f-6cec0a19a79a")
public static final String FIELDNAME_Order_DeliveryVia="7f134916-6d3a-bd78-ca5f-6cec0a19a79a";

@XendraTrl(Identifier="0a72f577-b227-80be-e837-41c4f5804f8f")
public static String es_PE_FIELD_PurchaseOrder_DeliveryVia_Name="Vía de Entrega";

@XendraTrl(Identifier="0a72f577-b227-80be-e837-41c4f5804f8f")
public static String es_PE_FIELD_PurchaseOrder_DeliveryVia_Description="Como será entregada la orden";

@XendraTrl(Identifier="0a72f577-b227-80be-e837-41c4f5804f8f")
public static String es_PE_FIELD_PurchaseOrder_DeliveryVia_Help="La vía de entrega indica como el producto debería ser entregado. Por Ej. Si la orden será recogida ó embarcada.";

@XendraField(AD_Column_ID="DeliveryViaRule",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="Delivery",IsDisplayed=true,
DisplayLogic="@OrderType@='SO' | @OrderType@='PO'",DisplayLength=14,IsReadOnly=false,SeqNo=130,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="0a72f577-b227-80be-e837-41c4f5804f8f")
public static final String FIELDNAME_PurchaseOrder_DeliveryVia="0a72f577-b227-80be-e837-41c4f5804f8f";

@XendraTrl(Identifier="a7d13c6e-3401-bed5-2ba6-0290f37d32f8")
public static String es_PE_FIELD_PartnerOrders_DeliveryVia_Name="Vía de Entrega";

@XendraTrl(Identifier="a7d13c6e-3401-bed5-2ba6-0290f37d32f8")
public static String es_PE_FIELD_PartnerOrders_DeliveryVia_Description="Como será entregada la orden";

@XendraTrl(Identifier="a7d13c6e-3401-bed5-2ba6-0290f37d32f8")
public static String es_PE_FIELD_PartnerOrders_DeliveryVia_Help="La vía de entrega indica como el producto debería ser entregado. Por Ej. Si la orden será recogida ó embarcada.";

@XendraField(AD_Column_ID="DeliveryViaRule",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a7d13c6e-3401-bed5-2ba6-0290f37d32f8")
public static final String FIELDNAME_PartnerOrders_DeliveryVia="a7d13c6e-3401-bed5-2ba6-0290f37d32f8";

@XendraTrl(Identifier="8f812493-be6c-87dc-63b8-910fea750360")
public static String es_PE_FIELD_Orders_DeliveryVia_Name="Vía de Entrega";

@XendraTrl(Identifier="8f812493-be6c-87dc-63b8-910fea750360")
public static String es_PE_FIELD_Orders_DeliveryVia_Description="Como será entregada la orden";

@XendraTrl(Identifier="8f812493-be6c-87dc-63b8-910fea750360")
public static String es_PE_FIELD_Orders_DeliveryVia_Help="La vía de entrega indica como el producto debería ser entregado. Por Ej. Si la orden será recogida ó embarcada.";

@XendraField(AD_Column_ID="DeliveryViaRule",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8f812493-be6c-87dc-63b8-910fea750360")
public static final String FIELDNAME_Orders_DeliveryVia="8f812493-be6c-87dc-63b8-910fea750360";

@XendraTrl(Identifier="462347e4-d9e8-2d33-4143-f4544f54ecde")
public static String es_PE_COLUMN_DeliveryViaRule_Name="Vía de Entrega";

@XendraColumn(AD_Element_ID="47ae2232-6c73-dfb6-aa97-18fb2cc876a7",ColumnName="DeliveryViaRule",
AD_Reference_ID=17,AD_Reference_Value_ID="e0d8ddbc-d567-6f32-8ce6-274924c5926f",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="P",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="462347e4-d9e8-2d33-4143-f4544f54ecde",Synchronized="2020-03-03 21:37:10.0")
/** Column name DeliveryViaRule */
public static final String COLUMNNAME_DeliveryViaRule = "DeliveryViaRule";
/** Set Description.
@param Description Optional short DESCRIPTION of the record */
public void setDescription (String Description)
{
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

@XendraTrl(Identifier="d4e0e832-c75d-0c8a-9d95-615365af8955")
public static String es_PE_FIELD_Order_Description_Name="Observación";

@XendraTrl(Identifier="d4e0e832-c75d-0c8a-9d95-615365af8955")
public static String es_PE_FIELD_Order_Description_Description="Descripción corta opcional del registro";

@XendraTrl(Identifier="d4e0e832-c75d-0c8a-9d95-615365af8955")
public static String es_PE_FIELD_Order_Description_Help="Una descripción esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d4e0e832-c75d-0c8a-9d95-615365af8955")
public static final String FIELDNAME_Order_Description="d4e0e832-c75d-0c8a-9d95-615365af8955";

@XendraTrl(Identifier="e248b2dc-0362-5715-db4c-e8bd44069aec")
public static String es_PE_FIELD_PurchaseOrder_Description_Name="Observación";

@XendraTrl(Identifier="e248b2dc-0362-5715-db4c-e8bd44069aec")
public static String es_PE_FIELD_PurchaseOrder_Description_Description="Descripción corta opcional del registro";

@XendraTrl(Identifier="e248b2dc-0362-5715-db4c-e8bd44069aec")
public static String es_PE_FIELD_PurchaseOrder_Description_Help="Una descripción esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e248b2dc-0362-5715-db4c-e8bd44069aec")
public static final String FIELDNAME_PurchaseOrder_Description="e248b2dc-0362-5715-db4c-e8bd44069aec";

@XendraTrl(Identifier="c1126ea8-14a9-bc1d-7ec4-28383913206b")
public static String es_PE_FIELD_PartnerOrders_Description_Name="Observación";

@XendraTrl(Identifier="c1126ea8-14a9-bc1d-7ec4-28383913206b")
public static String es_PE_FIELD_PartnerOrders_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="c1126ea8-14a9-bc1d-7ec4-28383913206b")
public static String es_PE_FIELD_PartnerOrders_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=400,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c1126ea8-14a9-bc1d-7ec4-28383913206b")
public static final String FIELDNAME_PartnerOrders_Description="c1126ea8-14a9-bc1d-7ec4-28383913206b";

@XendraTrl(Identifier="9f6555c2-3e7e-5e71-9019-6207516b2d68")
public static String es_PE_FIELD_Orders_Description_Name="Observación";

@XendraTrl(Identifier="9f6555c2-3e7e-5e71-9019-6207516b2d68")
public static String es_PE_FIELD_Orders_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="9f6555c2-3e7e-5e71-9019-6207516b2d68")
public static String es_PE_FIELD_Orders_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=390,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9f6555c2-3e7e-5e71-9019-6207516b2d68")
public static final String FIELDNAME_Orders_Description="9f6555c2-3e7e-5e71-9019-6207516b2d68";

@XendraTrl(Identifier="18006e0c-4a24-2be9-efbe-97031cdb8d0e")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="18006e0c-4a24-2be9-efbe-97031cdb8d0e",
Synchronized="2020-03-03 21:37:10.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Difference.
@param DifferenceAmt Difference Amount */
public void setDifferenceAmt (BigDecimal DifferenceAmt)
{
set_Value (COLUMNNAME_DifferenceAmt, DifferenceAmt);
}
/** Get Difference.
@return Difference Amount */
public BigDecimal getDifferenceAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_DifferenceAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="a398f54c-1250-494f-a03b-98844e39ac90")
public static String es_PE_FIELD_Order_Difference_Name="Diferencia monto";

@XendraField(AD_Column_ID="DifferenceAmt",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=131089,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-06 10:29:35.0",
Identifier="a398f54c-1250-494f-a03b-98844e39ac90")
public static final String FIELDNAME_Order_Difference="a398f54c-1250-494f-a03b-98844e39ac90";

@XendraTrl(Identifier="74b2b339-890a-400d-8e31-824e176e8ff5")
public static String es_PE_COLUMN_DifferenceAmt_Name="Difference";

@XendraColumn(AD_Element_ID="62840044-943e-7971-69a5-7954e25dfe29",ColumnName="DifferenceAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="74b2b339-890a-400d-8e31-824e176e8ff5",
Synchronized="2020-03-03 21:37:10.0")
/** Column name DifferenceAmt */
public static final String COLUMNNAME_DifferenceAmt = "DifferenceAmt";
/** Set Document Action.
@param DocAction The targeted status of the document */
public void setDocAction (String DocAction)
{
if (DocAction.length() > 2)
{
log.warning("Length > 2 - truncated");
DocAction = DocAction.substring(0,1);
}
set_Value (COLUMNNAME_DocAction, DocAction);
}
/** Get Document Action.
@return The targeted status of the document */
public String getDocAction() 
{
return (String)get_Value(COLUMNNAME_DocAction);
}

@XendraTrl(Identifier="650a02b5-2486-f74f-097e-00419c893c46")
public static String es_PE_FIELD_Order_ProcessOrder_Name="Procesar Orden";

@XendraField(AD_Column_ID="DocAction",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=380,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="650a02b5-2486-f74f-097e-00419c893c46")
public static final String FIELDNAME_Order_ProcessOrder="650a02b5-2486-f74f-097e-00419c893c46";

@XendraTrl(Identifier="d3578dc6-90a0-8f03-4daf-a9f62f414361")
public static String es_PE_FIELD_PurchaseOrder_ProcessOrder_Name="Procesar Orden";

@XendraField(AD_Column_ID="DocAction",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=360,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d3578dc6-90a0-8f03-4daf-a9f62f414361")
public static final String FIELDNAME_PurchaseOrder_ProcessOrder="d3578dc6-90a0-8f03-4daf-a9f62f414361";

@XendraTrl(Identifier="b9022e9d-1354-6a67-75d4-4e11a11c7e67")
public static String es_PE_FIELD_PartnerOrders_ProcessOrder_Name="Procesar Orden";

@XendraField(AD_Column_ID="DocAction",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=20,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b9022e9d-1354-6a67-75d4-4e11a11c7e67")
public static final String FIELDNAME_PartnerOrders_ProcessOrder="b9022e9d-1354-6a67-75d4-4e11a11c7e67";

@XendraTrl(Identifier="825be929-6046-6d40-cae3-9a40ed6816fb")
public static String es_PE_FIELD_Orders_ProcessOrder_Name="Procesar Orden";

@XendraField(AD_Column_ID="DocAction",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="825be929-6046-6d40-cae3-9a40ed6816fb")
public static final String FIELDNAME_Orders_ProcessOrder="825be929-6046-6d40-cae3-9a40ed6816fb";

@XendraTrl(Identifier="e5599020-b7bd-36a1-e4ca-ce7d61a29f5e")
public static String es_PE_COLUMN_DocAction_Name="Acción en el Documento";

@XendraColumn(AD_Element_ID="d4b9075b-18e5-ebbb-5565-d217a7e531cb",ColumnName="DocAction",
AD_Reference_ID=28,AD_Reference_Value_ID="e397c9b0-c643-d1cd-8380-20bee13b2a6e",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="CO",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="2.1",IsSelectionColumn=false,
AD_Process_ID="9eb1bbd4-415d-f589-3524-03d442fd323c",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e5599020-b7bd-36a1-e4ca-ce7d61a29f5e",
Synchronized="2020-03-03 21:37:10.0")
/** Column name DocAction */
public static final String COLUMNNAME_DocAction = "DocAction";
/** Set Document Status.
@param DocStatus The current status of the document */
public void setDocStatus (String DocStatus)
{
if (DocStatus.length() > 2)
{
log.warning("Length > 2 - truncated");
DocStatus = DocStatus.substring(0,1);
}
set_Value (COLUMNNAME_DocStatus, DocStatus);
}
/** Get Document Status.
@return The current status of the document */
public String getDocStatus() 
{
return (String)get_Value(COLUMNNAME_DocStatus);
}

@XendraTrl(Identifier="c182dff6-1905-fc44-3703-3e9bd8b427cf")
public static String es_PE_FIELD_Order_DocumentStatus_Name="Estado del Documento";

@XendraTrl(Identifier="c182dff6-1905-fc44-3703-3e9bd8b427cf")
public static String es_PE_FIELD_Order_DocumentStatus_Description="El estado actual del documento";

@XendraTrl(Identifier="c182dff6-1905-fc44-3703-3e9bd8b427cf")
public static String es_PE_FIELD_Order_DocumentStatus_Help="El estado del documento indica el estado del documento en este momento. Si usted quiere cambiar el estado de Documento; use el campo acción de documento";

@XendraField(AD_Column_ID="DocStatus",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=350,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c182dff6-1905-fc44-3703-3e9bd8b427cf")
public static final String FIELDNAME_Order_DocumentStatus="c182dff6-1905-fc44-3703-3e9bd8b427cf";

@XendraTrl(Identifier="23c0a169-31af-a182-8766-7b66cfa108cc")
public static String es_PE_FIELD_PurchaseOrder_DocumentStatus_Name="Estado del Documento";

@XendraTrl(Identifier="23c0a169-31af-a182-8766-7b66cfa108cc")
public static String es_PE_FIELD_PurchaseOrder_DocumentStatus_Description="El estado actual del documento";

@XendraTrl(Identifier="23c0a169-31af-a182-8766-7b66cfa108cc")
public static String es_PE_FIELD_PurchaseOrder_DocumentStatus_Help="El estado del documento indica el estado del documento en este momento. Si usted quiere cambiar el estado de Documento; use el campo acción de documento";

@XendraField(AD_Column_ID="DocStatus",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=310,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="23c0a169-31af-a182-8766-7b66cfa108cc")
public static final String FIELDNAME_PurchaseOrder_DocumentStatus="23c0a169-31af-a182-8766-7b66cfa108cc";

@XendraTrl(Identifier="07ea0008-b341-17e2-12e1-44be5d94628c")
public static String es_PE_FIELD_PartnerOrders_DocumentStatus_Name="Estado del Documento";

@XendraTrl(Identifier="07ea0008-b341-17e2-12e1-44be5d94628c")
public static String es_PE_FIELD_PartnerOrders_DocumentStatus_Description="El estado actual del documento";

@XendraTrl(Identifier="07ea0008-b341-17e2-12e1-44be5d94628c")
public static String es_PE_FIELD_PartnerOrders_DocumentStatus_Help="El estado del documento indica el estado del documento en este momento. Si usted quiere cambiar el estado de Documento; use el campo acción de documento";

@XendraField(AD_Column_ID="DocStatus",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=420,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="07ea0008-b341-17e2-12e1-44be5d94628c")
public static final String FIELDNAME_PartnerOrders_DocumentStatus="07ea0008-b341-17e2-12e1-44be5d94628c";

@XendraTrl(Identifier="a47ed046-da5e-2eec-6670-7642f68d085e")
public static String es_PE_FIELD_Orders_DocumentStatus_Name="Estado del Documento";

@XendraTrl(Identifier="a47ed046-da5e-2eec-6670-7642f68d085e")
public static String es_PE_FIELD_Orders_DocumentStatus_Description="El estado actual del documento";

@XendraTrl(Identifier="a47ed046-da5e-2eec-6670-7642f68d085e")
public static String es_PE_FIELD_Orders_DocumentStatus_Help="El estado del documento indica el estado del documento en este momento. Si usted quiere cambiar el estado de Documento; use el campo acción de documento";

@XendraField(AD_Column_ID="DocStatus",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=410,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a47ed046-da5e-2eec-6670-7642f68d085e")
public static final String FIELDNAME_Orders_DocumentStatus="a47ed046-da5e-2eec-6670-7642f68d085e";

@XendraTrl(Identifier="2924b4de-fd9d-6977-0cfe-302ea92bebf8")
public static String es_PE_COLUMN_DocStatus_Name="Estado del Documento";

@XendraColumn(AD_Element_ID="e73fa537-3438-bd01-dfd4-f0f080a28c55",ColumnName="DocStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="7627125d-fefe-e6bc-bb7d-4a6c772172dc",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="DR",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2924b4de-fd9d-6977-0cfe-302ea92bebf8",Synchronized="2020-03-03 21:37:11.0")
/** Column name DocStatus */
public static final String COLUMNNAME_DocStatus = "DocStatus";
/** Set Document No.
@param DocumentNo Document sequence number of the document */
public void setDocumentNo (String DocumentNo)
{
if (DocumentNo == null) throw new IllegalArgumentException ("DocumentNo is mandatory.");
if (DocumentNo.length() > 30)
{
log.warning("Length > 30 - truncated");
DocumentNo = DocumentNo.substring(0,29);
}
set_ValueNoCheck (COLUMNNAME_DocumentNo, DocumentNo);
}
/** Get Document No.
@return Document sequence number of the document */
public String getDocumentNo() 
{
String value = (String)get_Value(COLUMNNAME_DocumentNo);
if (value == null)
  return "";
return value;
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getDocumentNo());
}

@XendraTrl(Identifier="d8392e7d-0129-46bb-1be2-98cdcf0ffb95")
public static String es_PE_FIELD_Order_DocumentNo_Name="No. del Documento";

@XendraTrl(Identifier="d8392e7d-0129-46bb-1be2-98cdcf0ffb95")
public static String es_PE_FIELD_Order_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="d8392e7d-0129-46bb-1be2-98cdcf0ffb95")
public static String es_PE_FIELD_Order_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=30,SortNo=-1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d8392e7d-0129-46bb-1be2-98cdcf0ffb95")
public static final String FIELDNAME_Order_DocumentNo="d8392e7d-0129-46bb-1be2-98cdcf0ffb95";

@XendraTrl(Identifier="cd0557fa-7f01-4969-7098-d944d69d8bd5")
public static String es_PE_FIELD_PurchaseOrder_DocumentNo_Name="No. del Documento";

@XendraTrl(Identifier="cd0557fa-7f01-4969-7098-d944d69d8bd5")
public static String es_PE_FIELD_PurchaseOrder_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="cd0557fa-7f01-4969-7098-d944d69d8bd5")
public static String es_PE_FIELD_PurchaseOrder_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=30,SortNo=-1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cd0557fa-7f01-4969-7098-d944d69d8bd5")
public static final String FIELDNAME_PurchaseOrder_DocumentNo="cd0557fa-7f01-4969-7098-d944d69d8bd5";

@XendraTrl(Identifier="3f115a0b-2c31-5d26-08c8-702006692c0e")
public static String es_PE_FIELD_PartnerOrders_DocumentNo_Name="No. del Documento";

@XendraTrl(Identifier="3f115a0b-2c31-5d26-08c8-702006692c0e")
public static String es_PE_FIELD_PartnerOrders_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="3f115a0b-2c31-5d26-08c8-702006692c0e")
public static String es_PE_FIELD_PartnerOrders_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=390,SortNo=2,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3f115a0b-2c31-5d26-08c8-702006692c0e")
public static final String FIELDNAME_PartnerOrders_DocumentNo="3f115a0b-2c31-5d26-08c8-702006692c0e";

@XendraTrl(Identifier="ce3c16d6-880a-ed5c-38c7-7c38f7c40d6a")
public static String es_PE_FIELD_Orders_DocumentNo_Name="No. del Documento";

@XendraTrl(Identifier="ce3c16d6-880a-ed5c-38c7-7c38f7c40d6a")
public static String es_PE_FIELD_Orders_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="ce3c16d6-880a-ed5c-38c7-7c38f7c40d6a")
public static String es_PE_FIELD_Orders_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=370,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ce3c16d6-880a-ed5c-38c7-7c38f7c40d6a")
public static final String FIELDNAME_Orders_DocumentNo="ce3c16d6-880a-ed5c-38c7-7c38f7c40d6a";

@XendraTrl(Identifier="f89872e3-c385-720c-f464-15d991d3e4d5")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f89872e3-c385-720c-f464-15d991d3e4d5",
Synchronized="2020-03-03 21:37:11.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";
/** Set DocumentNoToInvoice.
@param DocumentNoToInvoice DocumentNoToInvoice */
public void setDocumentNoToInvoice (String DocumentNoToInvoice)
{
if (DocumentNoToInvoice != null && DocumentNoToInvoice.length() > 30)
{
log.warning("Length > 30 - truncated");
DocumentNoToInvoice = DocumentNoToInvoice.substring(0,29);
}
set_Value (COLUMNNAME_DocumentNoToInvoice, DocumentNoToInvoice);
}
/** Get DocumentNoToInvoice.
@return DocumentNoToInvoice */
public String getDocumentNoToInvoice() 
{
String value = (String)get_Value(COLUMNNAME_DocumentNoToInvoice);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a4275582-6654-4563-a136-6f1c9fcdd7a7")
public static String es_PE_FIELD_Order_DocumentNoToInvoice_Name="DocumentNoToInvoice";

@XendraField(AD_Column_ID="DocumentNoToInvoice",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=30,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-06 10:29:36.0",
Identifier="a4275582-6654-4563-a136-6f1c9fcdd7a7")
public static final String FIELDNAME_Order_DocumentNoToInvoice="a4275582-6654-4563-a136-6f1c9fcdd7a7";

@XendraTrl(Identifier="0baafe12-48eb-40b1-9b2e-10964fadbd71")
public static String es_PE_COLUMN_DocumentNoToInvoice_Name="DocumentNoToInvoice";

@XendraColumn(AD_Element_ID="d21226cd-6363-4d22-99e1-a2f42eaed746",
ColumnName="DocumentNoToInvoice",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=30,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0baafe12-48eb-40b1-9b2e-10964fadbd71",Synchronized="2020-03-03 21:37:11.0")
/** Column name DocumentNoToInvoice */
public static final String COLUMNNAME_DocumentNoToInvoice = "DocumentNoToInvoice";
/** Set DropShip_BPartner_ID.
@param DropShip_BPartner_ID DropShip_BPartner_ID */
public void setDropShip_BPartner_ID (int DropShip_BPartner_ID)
{
if (DropShip_BPartner_ID <= 0) set_Value (COLUMNNAME_DropShip_BPartner_ID, null);
 else 
set_Value (COLUMNNAME_DropShip_BPartner_ID, Integer.valueOf(DropShip_BPartner_ID));
}
/** Get DropShip_BPartner_ID.
@return DropShip_BPartner_ID */
public int getDropShip_BPartner_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_DropShip_BPartner_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="603d98fa-404d-c2a0-eb14-6c00c884dfae")
public static String es_PE_FIELD_Order_DropShip_BPartner_ID_Name="dropship_bpartner_id";

@XendraField(AD_Column_ID="DropShip_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="603d98fa-404d-c2a0-eb14-6c00c884dfae")
public static final String FIELDNAME_Order_DropShip_BPartner_ID="603d98fa-404d-c2a0-eb14-6c00c884dfae";

@XendraTrl(Identifier="4d8933fe-96ca-7b39-3622-d91a15038c32")
public static String es_PE_FIELD_PurchaseOrder_DropShip_BPartner_ID_Name="dropship_bpartner_id";

@XendraField(AD_Column_ID="DropShip_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4d8933fe-96ca-7b39-3622-d91a15038c32")
public static final String FIELDNAME_PurchaseOrder_DropShip_BPartner_ID="4d8933fe-96ca-7b39-3622-d91a15038c32";

@XendraTrl(Identifier="c56e14f9-011b-1cba-7675-e157a2a0cd3b")
public static String es_PE_COLUMN_DropShip_BPartner_ID_Name="dropship_bpartner_id";

@XendraColumn(AD_Element_ID="edd42966-36ea-b55e-b7e8-20de61228852",
ColumnName="DropShip_BPartner_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="ed87c3fe-720d-c26d-0166-b5178b65db41",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="c56e14f9-011b-1cba-7675-e157a2a0cd3b",
Synchronized="2020-03-03 21:37:11.0")
/** Column name DropShip_BPartner_ID */
public static final String COLUMNNAME_DropShip_BPartner_ID = "DropShip_BPartner_ID";
/** Set DropShip_Location_ID.
@param DropShip_Location_ID DropShip_Location_ID */
public void setDropShip_Location_ID (int DropShip_Location_ID)
{
if (DropShip_Location_ID <= 0) set_Value (COLUMNNAME_DropShip_Location_ID, null);
 else 
set_Value (COLUMNNAME_DropShip_Location_ID, Integer.valueOf(DropShip_Location_ID));
}
/** Get DropShip_Location_ID.
@return DropShip_Location_ID */
public int getDropShip_Location_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_DropShip_Location_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fae11c2e-329b-d172-eca8-26f4824ea676")
public static String es_PE_FIELD_Order_DropShip_Location_ID_Name="dropship_location_id";

@XendraField(AD_Column_ID="DropShip_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fae11c2e-329b-d172-eca8-26f4824ea676")
public static final String FIELDNAME_Order_DropShip_Location_ID="fae11c2e-329b-d172-eca8-26f4824ea676";

@XendraTrl(Identifier="2de331d1-857e-1843-d435-16e93d6fe7be")
public static String es_PE_FIELD_PurchaseOrder_DropShip_Location_ID_Name="dropship_location_id";

@XendraField(AD_Column_ID="DropShip_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2de331d1-857e-1843-d435-16e93d6fe7be")
public static final String FIELDNAME_PurchaseOrder_DropShip_Location_ID="2de331d1-857e-1843-d435-16e93d6fe7be";

@XendraTrl(Identifier="fadea6cc-561c-748c-ba05-ba36f21d052c")
public static String es_PE_COLUMN_DropShip_Location_ID_Name="dropship_location_id";

@XendraColumn(AD_Element_ID="fe09ceec-0c03-5673-c459-9e0f706ad1b8",
ColumnName="DropShip_Location_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="8d01ccac-6606-99a5-ebc2-5a6e01980b37",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="fadea6cc-561c-748c-ba05-ba36f21d052c",
Synchronized="2020-03-03 21:37:11.0")
/** Column name DropShip_Location_ID */
public static final String COLUMNNAME_DropShip_Location_ID = "DropShip_Location_ID";
/** Set DropShip_User_ID.
@param DropShip_User_ID DropShip_User_ID */
public void setDropShip_User_ID (int DropShip_User_ID)
{
if (DropShip_User_ID <= 0) set_Value (COLUMNNAME_DropShip_User_ID, null);
 else 
set_Value (COLUMNNAME_DropShip_User_ID, Integer.valueOf(DropShip_User_ID));
}
/** Get DropShip_User_ID.
@return DropShip_User_ID */
public int getDropShip_User_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_DropShip_User_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="26efcece-301c-17a2-0fb6-fe7a378b65fe")
public static String es_PE_FIELD_Order_DropShip_User_ID_Name="dropship_user_id";

@XendraField(AD_Column_ID="DropShip_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="26efcece-301c-17a2-0fb6-fe7a378b65fe")
public static final String FIELDNAME_Order_DropShip_User_ID="26efcece-301c-17a2-0fb6-fe7a378b65fe";

@XendraTrl(Identifier="d51139d3-6bda-401e-a6c1-420dabc8166a")
public static String es_PE_FIELD_PurchaseOrder_DropShip_User_ID_Name="dropship_user_id";

@XendraField(AD_Column_ID="DropShip_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d51139d3-6bda-401e-a6c1-420dabc8166a")
public static final String FIELDNAME_PurchaseOrder_DropShip_User_ID="d51139d3-6bda-401e-a6c1-420dabc8166a";

@XendraTrl(Identifier="0013b4f0-0285-7429-b212-4285c8fbab9b")
public static String es_PE_COLUMN_DropShip_User_ID_Name="dropship_user_id";

@XendraColumn(AD_Element_ID="6668bd43-4776-af2e-dc93-f47077c66f43",ColumnName="DropShip_User_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="606fce88-e8f3-4df6-0617-746fb6a85b2b",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0013b4f0-0285-7429-b212-4285c8fbab9b",Synchronized="2020-03-03 21:37:11.0")
/** Column name DropShip_User_ID */
public static final String COLUMNNAME_DropShip_User_ID = "DropShip_User_ID";
/** Set Freight Amount.
@param FreightAmt Freight Amount  */
public void setFreightAmt (BigDecimal FreightAmt)
{
if (FreightAmt == null) throw new IllegalArgumentException ("FreightAmt is mandatory.");
set_Value (COLUMNNAME_FreightAmt, FreightAmt);
}
/** Get Freight Amount.
@return Freight Amount  */
public BigDecimal getFreightAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FreightAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="7c91f5c7-4eeb-ae6b-57af-a2111ecfca5d")
public static String es_PE_FIELD_Order_FreightAmount_Name="Total de Flete";

@XendraTrl(Identifier="7c91f5c7-4eeb-ae6b-57af-a2111ecfca5d")
public static String es_PE_FIELD_Order_FreightAmount_Description="Total de la entrega";

@XendraTrl(Identifier="7c91f5c7-4eeb-ae6b-57af-a2111ecfca5d")
public static String es_PE_FIELD_Order_FreightAmount_Help="El Total del Flete indica el total cargado por flete en la moneda del documento";

@XendraField(AD_Column_ID="FreightAmt",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="Delivery",IsDisplayed=true,
DisplayLogic="@OrderType@='SO' & @FreightCostRule@='F'",DisplayLength=26,IsReadOnly=false,
SeqNo=190,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="7c91f5c7-4eeb-ae6b-57af-a2111ecfca5d")
public static final String FIELDNAME_Order_FreightAmount="7c91f5c7-4eeb-ae6b-57af-a2111ecfca5d";

@XendraTrl(Identifier="45572443-8dbb-bd8c-94e4-ef494f6dcdd2")
public static String es_PE_FIELD_PurchaseOrder_FreightAmount_Name="Total de Flete";

@XendraTrl(Identifier="45572443-8dbb-bd8c-94e4-ef494f6dcdd2")
public static String es_PE_FIELD_PurchaseOrder_FreightAmount_Description="Total de la entrega";

@XendraTrl(Identifier="45572443-8dbb-bd8c-94e4-ef494f6dcdd2")
public static String es_PE_FIELD_PurchaseOrder_FreightAmount_Help="El Total del Flete indica el total cargado por flete en la moneda del documento";

@XendraField(AD_Column_ID="FreightAmt",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="Delivery",IsDisplayed=true,
DisplayLogic="@OrderType@='SO' | @OrderType@='PO' & @FreightCostRule@='F'",DisplayLength=26,
IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,
Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="45572443-8dbb-bd8c-94e4-ef494f6dcdd2")
public static final String FIELDNAME_PurchaseOrder_FreightAmount="45572443-8dbb-bd8c-94e4-ef494f6dcdd2";

@XendraTrl(Identifier="2788659e-a5bd-d0f9-8232-fd4a92f411d1")
public static String es_PE_FIELD_PartnerOrders_FreightAmount_Name="Total de Flete";

@XendraTrl(Identifier="2788659e-a5bd-d0f9-8232-fd4a92f411d1")
public static String es_PE_FIELD_PartnerOrders_FreightAmount_Description="Total de la entrega";

@XendraTrl(Identifier="2788659e-a5bd-d0f9-8232-fd4a92f411d1")
public static String es_PE_FIELD_PartnerOrders_FreightAmount_Help="El Total del Flete indica el total cargado por flete en la moneda del documento";

@XendraField(AD_Column_ID="FreightAmt",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=360,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2788659e-a5bd-d0f9-8232-fd4a92f411d1")
public static final String FIELDNAME_PartnerOrders_FreightAmount="2788659e-a5bd-d0f9-8232-fd4a92f411d1";

@XendraTrl(Identifier="1ae68381-3c0e-7ab5-6b0c-7eaf77138476")
public static String es_PE_FIELD_Orders_FreightAmount_Name="Total de Flete";

@XendraTrl(Identifier="1ae68381-3c0e-7ab5-6b0c-7eaf77138476")
public static String es_PE_FIELD_Orders_FreightAmount_Description="Total de la entrega";

@XendraTrl(Identifier="1ae68381-3c0e-7ab5-6b0c-7eaf77138476")
public static String es_PE_FIELD_Orders_FreightAmount_Help="El Total del Flete indica el total cargado por flete en la moneda del documento";

@XendraField(AD_Column_ID="FreightAmt",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=310,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1ae68381-3c0e-7ab5-6b0c-7eaf77138476")
public static final String FIELDNAME_Orders_FreightAmount="1ae68381-3c0e-7ab5-6b0c-7eaf77138476";

@XendraTrl(Identifier="fd82784c-8417-74ee-9c4d-39f02a3c3637")
public static String es_PE_COLUMN_FreightAmt_Name="Total de Flete";

@XendraColumn(AD_Element_ID="b2162c75-bbbe-b49a-7ffe-6020ce78c453",ColumnName="FreightAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fd82784c-8417-74ee-9c4d-39f02a3c3637",
Synchronized="2020-03-03 21:37:11.0")
/** Column name FreightAmt */
public static final String COLUMNNAME_FreightAmt = "FreightAmt";
/** Set Freight Cost Rule.
@param FreightCostRule Method for charging Freight */
public void setFreightCostRule (String FreightCostRule)
{
if (FreightCostRule.length() > 1)
{
log.warning("Length > 1 - truncated");
FreightCostRule = FreightCostRule.substring(0,0);
}
set_Value (COLUMNNAME_FreightCostRule, FreightCostRule);
}
/** Get Freight Cost Rule.
@return Method for charging Freight */
public String getFreightCostRule() 
{
return (String)get_Value(COLUMNNAME_FreightCostRule);
}

@XendraTrl(Identifier="1ca421dc-9efc-bcd3-eca2-0043d8d96427")
public static String es_PE_FIELD_Order_FreightCostRule_Name="Regla de Costo de Flete";

@XendraTrl(Identifier="1ca421dc-9efc-bcd3-eca2-0043d8d96427")
public static String es_PE_FIELD_Order_FreightCostRule_Description="Método para cargar el flete";

@XendraTrl(Identifier="1ca421dc-9efc-bcd3-eca2-0043d8d96427")
public static String es_PE_FIELD_Order_FreightCostRule_Help="La regla de costo de flete indica el método usado para cargar los fletes.";

@XendraField(AD_Column_ID="FreightCostRule",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="Delivery",IsDisplayed=true,
DisplayLogic="@OrderType@='SO'",DisplayLength=14,IsReadOnly=false,SeqNo=180,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="1ca421dc-9efc-bcd3-eca2-0043d8d96427")
public static final String FIELDNAME_Order_FreightCostRule="1ca421dc-9efc-bcd3-eca2-0043d8d96427";

@XendraTrl(Identifier="ae4673ae-e578-c195-0e16-0b70530e4bf4")
public static String es_PE_FIELD_PurchaseOrder_FreightCostRule_Name="Regla de Costo de Flete";

@XendraTrl(Identifier="ae4673ae-e578-c195-0e16-0b70530e4bf4")
public static String es_PE_FIELD_PurchaseOrder_FreightCostRule_Description="Método para cargar el flete";

@XendraTrl(Identifier="ae4673ae-e578-c195-0e16-0b70530e4bf4")
public static String es_PE_FIELD_PurchaseOrder_FreightCostRule_Help="La regla de costo de flete indica el método usado para cargar los fletes.";

@XendraField(AD_Column_ID="FreightCostRule",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="Delivery",IsDisplayed=true,
DisplayLogic="@OrderType@='SO' | @OrderType@='PO'",DisplayLength=14,IsReadOnly=false,SeqNo=150,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="ae4673ae-e578-c195-0e16-0b70530e4bf4")
public static final String FIELDNAME_PurchaseOrder_FreightCostRule="ae4673ae-e578-c195-0e16-0b70530e4bf4";

@XendraTrl(Identifier="35549a44-39ac-9850-bcf0-780c4b476764")
public static String es_PE_FIELD_PartnerOrders_FreightCostRule_Name="Regla de Costo de Flete";

@XendraTrl(Identifier="35549a44-39ac-9850-bcf0-780c4b476764")
public static String es_PE_FIELD_PartnerOrders_FreightCostRule_Description="Método para cargar el flete";

@XendraTrl(Identifier="35549a44-39ac-9850-bcf0-780c4b476764")
public static String es_PE_FIELD_PartnerOrders_FreightCostRule_Help="La regla de costo de flete indica el método usado para cargar los fletes.";

@XendraField(AD_Column_ID="FreightCostRule",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=270,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="35549a44-39ac-9850-bcf0-780c4b476764")
public static final String FIELDNAME_PartnerOrders_FreightCostRule="35549a44-39ac-9850-bcf0-780c4b476764";

@XendraTrl(Identifier="4c27421d-4c06-6ceb-0860-11316a420258")
public static String es_PE_FIELD_Orders_FreightCostRule_Name="Regla de Costo de Flete";

@XendraTrl(Identifier="4c27421d-4c06-6ceb-0860-11316a420258")
public static String es_PE_FIELD_Orders_FreightCostRule_Description="Método para cargar el flete";

@XendraTrl(Identifier="4c27421d-4c06-6ceb-0860-11316a420258")
public static String es_PE_FIELD_Orders_FreightCostRule_Help="La regla de costo de flete indica el método usado para cargar los fletes.";

@XendraField(AD_Column_ID="FreightCostRule",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4c27421d-4c06-6ceb-0860-11316a420258")
public static final String FIELDNAME_Orders_FreightCostRule="4c27421d-4c06-6ceb-0860-11316a420258";

@XendraTrl(Identifier="9c436ea1-07a7-fb1d-8e92-ea314a57a5d0")
public static String es_PE_COLUMN_FreightCostRule_Name="Regla de Costo de Flete";

@XendraColumn(AD_Element_ID="b5da4c11-198a-5ff2-38f2-d0d7dbad053e",ColumnName="FreightCostRule",
AD_Reference_ID=17,AD_Reference_Value_ID="991b4512-0e0d-3494-3835-cc8ecaf3ab12",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="I",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9c436ea1-07a7-fb1d-8e92-ea314a57a5d0",Synchronized="2020-03-03 21:37:11.0")
/** Column name FreightCostRule */
public static final String COLUMNNAME_FreightCostRule = "FreightCostRule";
/** Set Grand Total.
@param GrandTotal Total amount of document */
public void setGrandTotal (BigDecimal GrandTotal)
{
if (GrandTotal == null) throw new IllegalArgumentException ("GrandTotal is mandatory.");
set_ValueNoCheck (COLUMNNAME_GrandTotal, GrandTotal);
}
/** Get Grand Total.
@return Total amount of document */
public BigDecimal getGrandTotal() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_GrandTotal);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="f8565dd7-b5f6-4cbc-496a-6b41f753811a")
public static String es_PE_FIELD_Order_GrandTotal_Name="Gran Total";

@XendraTrl(Identifier="f8565dd7-b5f6-4cbc-496a-6b41f753811a")
public static String es_PE_FIELD_Order_GrandTotal_Description="Total del documento";

@XendraTrl(Identifier="f8565dd7-b5f6-4cbc-496a-6b41f753811a")
public static String es_PE_FIELD_Order_GrandTotal_Help="El gran total identifica el total incluyendo impuestos y totales de fletes en la moneda del documento.";

@XendraField(AD_Column_ID="GrandTotal",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=340,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f8565dd7-b5f6-4cbc-496a-6b41f753811a")
public static final String FIELDNAME_Order_GrandTotal="f8565dd7-b5f6-4cbc-496a-6b41f753811a";

@XendraTrl(Identifier="108d8694-f051-ee3a-b0f6-318afdbf4471")
public static String es_PE_FIELD_PurchaseOrder_GrandTotal_Name="Gran Total";

@XendraTrl(Identifier="108d8694-f051-ee3a-b0f6-318afdbf4471")
public static String es_PE_FIELD_PurchaseOrder_GrandTotal_Description="Total del documento";

@XendraTrl(Identifier="108d8694-f051-ee3a-b0f6-318afdbf4471")
public static String es_PE_FIELD_PurchaseOrder_GrandTotal_Help="El gran total identifica el total incluyendo impuestos y totales de fletes en la moneda del documento.";

@XendraField(AD_Column_ID="GrandTotal",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=340,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="108d8694-f051-ee3a-b0f6-318afdbf4471")
public static final String FIELDNAME_PurchaseOrder_GrandTotal="108d8694-f051-ee3a-b0f6-318afdbf4471";

@XendraTrl(Identifier="cb515312-1d6c-03ac-0457-df98f40b4301")
public static String es_PE_FIELD_PartnerOrders_GrandTotal_Name="Gran Total";

@XendraTrl(Identifier="cb515312-1d6c-03ac-0457-df98f40b4301")
public static String es_PE_FIELD_PartnerOrders_GrandTotal_Description="Total del documento";

@XendraTrl(Identifier="cb515312-1d6c-03ac-0457-df98f40b4301")
public static String es_PE_FIELD_PartnerOrders_GrandTotal_Help="El gran total identifica el total incluyendo impuestos y totales de fletes en la moneda del documento.";

@XendraField(AD_Column_ID="GrandTotal",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=660,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cb515312-1d6c-03ac-0457-df98f40b4301")
public static final String FIELDNAME_PartnerOrders_GrandTotal="cb515312-1d6c-03ac-0457-df98f40b4301";

@XendraTrl(Identifier="1a87d9a3-1d8a-82e0-b046-a106eb23fb82")
public static String es_PE_FIELD_Orders_GrandTotal_Name="Gran Total";

@XendraTrl(Identifier="1a87d9a3-1d8a-82e0-b046-a106eb23fb82")
public static String es_PE_FIELD_Orders_GrandTotal_Description="Total del documento";

@XendraTrl(Identifier="1a87d9a3-1d8a-82e0-b046-a106eb23fb82")
public static String es_PE_FIELD_Orders_GrandTotal_Help="El gran total identifica el total incluyendo impuestos y totales de fletes en la moneda del documento.";

@XendraField(AD_Column_ID="GrandTotal",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=670,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1a87d9a3-1d8a-82e0-b046-a106eb23fb82")
public static final String FIELDNAME_Orders_GrandTotal="1a87d9a3-1d8a-82e0-b046-a106eb23fb82";

@XendraTrl(Identifier="7e629113-b830-b7dd-fbab-9fdea0bfda0a")
public static String es_PE_COLUMN_GrandTotal_Name="Gran Total";

@XendraColumn(AD_Element_ID="ffd614c2-6ff8-c9c6-71bf-44f369675711",ColumnName="GrandTotal",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7e629113-b830-b7dd-fbab-9fdea0bfda0a",
Synchronized="2020-03-03 21:37:11.0")
/** Column name GrandTotal */
public static final String COLUMNNAME_GrandTotal = "GrandTotal";
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
@XendraTrl(Identifier="de4f5229-a561-45d0-8725-3ca705bcbf13")
public static String es_PE_FIELD_Order_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-06 10:29:36.0",
Identifier="de4f5229-a561-45d0-8725-3ca705bcbf13")
public static final String FIELDNAME_Order_Identifier="de4f5229-a561-45d0-8725-3ca705bcbf13";

@XendraTrl(Identifier="ec46b27f-cb49-45ca-82c6-c993ba5e0857")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ec46b27f-cb49-45ca-82c6-c993ba5e0857",
Synchronized="2020-03-03 21:37:11.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Invoice Rule.
@param InvoiceRule Frequency and method of invoicing  */
public void setInvoiceRule (String InvoiceRule)
{
if (InvoiceRule.length() > 1)
{
log.warning("Length > 1 - truncated");
InvoiceRule = InvoiceRule.substring(0,0);
}
set_Value (COLUMNNAME_InvoiceRule, InvoiceRule);
}
/** Get Invoice Rule.
@return Frequency and method of invoicing  */
public String getInvoiceRule() 
{
return (String)get_Value(COLUMNNAME_InvoiceRule);
}

@XendraTrl(Identifier="0e7a8a95-6f25-7e7c-fa90-d255fc066bd0")
public static String es_PE_FIELD_Order_InvoiceRule_Name="Regla de Facturación";

@XendraTrl(Identifier="0e7a8a95-6f25-7e7c-fa90-d255fc066bd0")
public static String es_PE_FIELD_Order_InvoiceRule_Description="Frecuencia y métodos de facturación";

@XendraTrl(Identifier="0e7a8a95-6f25-7e7c-fa90-d255fc066bd0")
public static String es_PE_FIELD_Order_InvoiceRule_Help="La regla de facturación define cómo se le factura a un socio de negocio y la frecuencia de facturación.";

@XendraField(AD_Column_ID="InvoiceRule",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="Invoicing",IsDisplayed=false,
DisplayLogic="@OrderType@='SO' | @OrderType@='WP'",DisplayLength=14,IsReadOnly=false,SeqNo=0,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="0e7a8a95-6f25-7e7c-fa90-d255fc066bd0")
public static final String FIELDNAME_Order_InvoiceRule="0e7a8a95-6f25-7e7c-fa90-d255fc066bd0";

@XendraTrl(Identifier="ae9c50eb-bfab-fea4-3e05-4bf2dd2edd2c")
public static String es_PE_FIELD_PurchaseOrder_InvoiceRule_Name="Regla de Facturación";

@XendraTrl(Identifier="ae9c50eb-bfab-fea4-3e05-4bf2dd2edd2c")
public static String es_PE_FIELD_PurchaseOrder_InvoiceRule_Description="Frecuencia y métodos de facturación";

@XendraTrl(Identifier="ae9c50eb-bfab-fea4-3e05-4bf2dd2edd2c")
public static String es_PE_FIELD_PurchaseOrder_InvoiceRule_Help="La regla de facturación define cómo se le factura a un socio de negocio y la frecuencia de facturación.";

@XendraField(AD_Column_ID="InvoiceRule",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ae9c50eb-bfab-fea4-3e05-4bf2dd2edd2c")
public static final String FIELDNAME_PurchaseOrder_InvoiceRule="ae9c50eb-bfab-fea4-3e05-4bf2dd2edd2c";

@XendraTrl(Identifier="5744ffa9-73ff-733e-b485-a435b4613712")
public static String es_PE_FIELD_PartnerOrders_InvoiceRule_Name="Regla de Facturación";

@XendraTrl(Identifier="5744ffa9-73ff-733e-b485-a435b4613712")
public static String es_PE_FIELD_PartnerOrders_InvoiceRule_Description="Frecuencia y métodos de facturación";

@XendraTrl(Identifier="5744ffa9-73ff-733e-b485-a435b4613712")
public static String es_PE_FIELD_PartnerOrders_InvoiceRule_Help="La regla de facturación define cómo se le factura a un socio de negocio y la frecuencia de facturación.";

@XendraField(AD_Column_ID="InvoiceRule",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="Invoicing",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=550,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5744ffa9-73ff-733e-b485-a435b4613712")
public static final String FIELDNAME_PartnerOrders_InvoiceRule="5744ffa9-73ff-733e-b485-a435b4613712";

@XendraTrl(Identifier="b007dd25-d05b-8fd5-c564-0e85e4a8243b")
public static String es_PE_FIELD_Orders_InvoiceRule_Name="Regla de Facturación";

@XendraTrl(Identifier="b007dd25-d05b-8fd5-c564-0e85e4a8243b")
public static String es_PE_FIELD_Orders_InvoiceRule_Description="Frecuencia y métodos de facturación";

@XendraTrl(Identifier="b007dd25-d05b-8fd5-c564-0e85e4a8243b")
public static String es_PE_FIELD_Orders_InvoiceRule_Help="La regla de facturación define cómo se le factura a un socio de negocio y la frecuencia de facturación.";

@XendraField(AD_Column_ID="InvoiceRule",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="Invoicing",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=540,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b007dd25-d05b-8fd5-c564-0e85e4a8243b")
public static final String FIELDNAME_Orders_InvoiceRule="b007dd25-d05b-8fd5-c564-0e85e4a8243b";

@XendraTrl(Identifier="5cea51bc-d1d2-a4d4-1f71-cef1201f30a1")
public static String es_PE_COLUMN_InvoiceRule_Name="Regla de Facturación";

@XendraColumn(AD_Element_ID="4146a93f-e366-9714-9c96-963119f216aa",ColumnName="InvoiceRule",
AD_Reference_ID=17,AD_Reference_Value_ID="48d8ab23-89bf-db6f-7a12-1c4d2aa5604f",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="I",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5cea51bc-d1d2-a4d4-1f71-cef1201f30a1",Synchronized="2020-03-03 21:37:11.0")
/** Column name InvoiceRule */
public static final String COLUMNNAME_InvoiceRule = "InvoiceRule";
/** Set Approved.
@param IsApproved Indicates if this document requires approval */
public void setIsApproved (boolean IsApproved)
{
set_ValueNoCheck (COLUMNNAME_IsApproved, Boolean.valueOf(IsApproved));
}
/** Get Approved.
@return Indicates if this document requires approval */
public boolean isApproved() 
{
Object oo = get_Value(COLUMNNAME_IsApproved);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="79cc4bbd-395f-27e3-898d-3a57b6ec54df")
public static String es_PE_FIELD_Order_Approved_Name="Aprobación";

@XendraTrl(Identifier="79cc4bbd-395f-27e3-898d-3a57b6ec54df")
public static String es_PE_FIELD_Order_Approved_Description="Indica si este documento requiere aprobación";

@XendraTrl(Identifier="79cc4bbd-395f-27e3-898d-3a57b6ec54df")
public static String es_PE_FIELD_Order_Approved_Help="El Cuadro de Verificación  Aprobado indica si este documento requiere aprobación antes de que pueda ser procesado";

@XendraField(AD_Column_ID="IsApproved",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@OrderType@='SO' ",DisplayLength=1,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="79cc4bbd-395f-27e3-898d-3a57b6ec54df")
public static final String FIELDNAME_Order_Approved="79cc4bbd-395f-27e3-898d-3a57b6ec54df";

@XendraTrl(Identifier="6b6f1da4-e518-15c6-7102-e526c979089c")
public static String es_PE_FIELD_PurchaseOrder_Approved_Name="Aprobación";

@XendraTrl(Identifier="6b6f1da4-e518-15c6-7102-e526c979089c")
public static String es_PE_FIELD_PurchaseOrder_Approved_Description="Indica si este documento requiere aprobación";

@XendraTrl(Identifier="6b6f1da4-e518-15c6-7102-e526c979089c")
public static String es_PE_FIELD_PurchaseOrder_Approved_Help="El Cuadro de Verificación  Aprobado indica si este documento requiere aprobación antes de que pueda ser procesado";

@XendraField(AD_Column_ID="IsApproved",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6b6f1da4-e518-15c6-7102-e526c979089c")
public static final String FIELDNAME_PurchaseOrder_Approved="6b6f1da4-e518-15c6-7102-e526c979089c";

@XendraTrl(Identifier="69b19b36-18f1-ca48-d832-7f11d097e486")
public static String es_PE_FIELD_PartnerOrders_Approved_Name="Aprobación";

@XendraTrl(Identifier="69b19b36-18f1-ca48-d832-7f11d097e486")
public static String es_PE_FIELD_PartnerOrders_Approved_Description="Indica si este documento requiere aprobación";

@XendraTrl(Identifier="69b19b36-18f1-ca48-d832-7f11d097e486")
public static String es_PE_FIELD_PartnerOrders_Approved_Help="El Cuadro de Verificación  Aprobado indica si este documento requiere aprobación antes de que pueda ser procesado";

@XendraField(AD_Column_ID="IsApproved",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="69b19b36-18f1-ca48-d832-7f11d097e486")
public static final String FIELDNAME_PartnerOrders_Approved="69b19b36-18f1-ca48-d832-7f11d097e486";

@XendraTrl(Identifier="9178d5e7-ab71-630f-39ee-36c8f7281243")
public static String es_PE_FIELD_Orders_Approved_Name="Aprobación";

@XendraTrl(Identifier="9178d5e7-ab71-630f-39ee-36c8f7281243")
public static String es_PE_FIELD_Orders_Approved_Description="Indica si este documento requiere aprobación";

@XendraTrl(Identifier="9178d5e7-ab71-630f-39ee-36c8f7281243")
public static String es_PE_FIELD_Orders_Approved_Help="El Cuadro de Verificación  Aprobado indica si este documento requiere aprobación antes de que pueda ser procesado";

@XendraField(AD_Column_ID="IsApproved",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=330,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9178d5e7-ab71-630f-39ee-36c8f7281243")
public static final String FIELDNAME_Orders_Approved="9178d5e7-ab71-630f-39ee-36c8f7281243";

@XendraTrl(Identifier="936eee18-82b6-5133-d467-72dbd2a20f5d")
public static String es_PE_COLUMN_IsApproved_Name="Aprobación";

@XendraColumn(AD_Element_ID="44388d99-07b7-b005-9e16-78884800beff",ColumnName="IsApproved",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,
DefaultValue="@IsApproved@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="936eee18-82b6-5133-d467-72dbd2a20f5d",Synchronized="2020-03-03 21:37:11.0")
/** Column name IsApproved */
public static final String COLUMNNAME_IsApproved = "IsApproved";
/** Set Credit Approved.
@param IsCreditApproved Credit  has been approved */
public void setIsCreditApproved (boolean IsCreditApproved)
{
set_ValueNoCheck (COLUMNNAME_IsCreditApproved, Boolean.valueOf(IsCreditApproved));
}
/** Get Credit Approved.
@return Credit  has been approved */
public boolean isCreditApproved() 
{
Object oo = get_Value(COLUMNNAME_IsCreditApproved);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="49cd62a1-3381-dddd-375f-1777d55deb84")
public static String es_PE_FIELD_Order_CreditApproved_Name="Crédito Aprobado";

@XendraTrl(Identifier="49cd62a1-3381-dddd-375f-1777d55deb84")
public static String es_PE_FIELD_Order_CreditApproved_Description="El crédito ha sido aprobado";

@XendraTrl(Identifier="49cd62a1-3381-dddd-375f-1777d55deb84")
public static String es_PE_FIELD_Order_CreditApproved_Help="Crédito aprobado indica si la aprobación de crédito fue exitosa para esta orden";

@XendraField(AD_Column_ID="IsCreditApproved",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@OrderType@='SO'",DisplayLength=1,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="49cd62a1-3381-dddd-375f-1777d55deb84")
public static final String FIELDNAME_Order_CreditApproved="49cd62a1-3381-dddd-375f-1777d55deb84";

@XendraTrl(Identifier="46e0606c-a6ee-4865-9aa6-f303adb6634e")
public static String es_PE_FIELD_PurchaseOrder_CreditApproved_Name="Crédito Aprobado";

@XendraTrl(Identifier="46e0606c-a6ee-4865-9aa6-f303adb6634e")
public static String es_PE_FIELD_PurchaseOrder_CreditApproved_Description="El crédito ha sido aprobado";

@XendraTrl(Identifier="46e0606c-a6ee-4865-9aa6-f303adb6634e")
public static String es_PE_FIELD_PurchaseOrder_CreditApproved_Help="Crédito aprobado indica si la aprobación de crédito fue exitosa para esta orden";

@XendraField(AD_Column_ID="IsCreditApproved",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="46e0606c-a6ee-4865-9aa6-f303adb6634e")
public static final String FIELDNAME_PurchaseOrder_CreditApproved="46e0606c-a6ee-4865-9aa6-f303adb6634e";

@XendraTrl(Identifier="c1df3eb9-b904-d1a4-c999-08966aa47a66")
public static String es_PE_FIELD_PartnerOrders_CreditApproved_Name="Crédito Aprobado";

@XendraTrl(Identifier="c1df3eb9-b904-d1a4-c999-08966aa47a66")
public static String es_PE_FIELD_PartnerOrders_CreditApproved_Description="El crédito ha sido aprobado";

@XendraTrl(Identifier="c1df3eb9-b904-d1a4-c999-08966aa47a66")
public static String es_PE_FIELD_PartnerOrders_CreditApproved_Help="Crédito aprobado indica si la aprobación de crédito fue exitosa para esta orden";

@XendraField(AD_Column_ID="IsCreditApproved",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c1df3eb9-b904-d1a4-c999-08966aa47a66")
public static final String FIELDNAME_PartnerOrders_CreditApproved="c1df3eb9-b904-d1a4-c999-08966aa47a66";

@XendraTrl(Identifier="23ae790a-20dd-9d28-d1d1-0e31544242d6")
public static String es_PE_FIELD_Orders_CreditApproved_Name="Crédito Aprobado";

@XendraTrl(Identifier="23ae790a-20dd-9d28-d1d1-0e31544242d6")
public static String es_PE_FIELD_Orders_CreditApproved_Description="El crédito ha sido aprobado";

@XendraTrl(Identifier="23ae790a-20dd-9d28-d1d1-0e31544242d6")
public static String es_PE_FIELD_Orders_CreditApproved_Help="Crédito aprobado indica si la aprobación de crédito fue exitosa para esta orden";

@XendraField(AD_Column_ID="IsCreditApproved",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="23ae790a-20dd-9d28-d1d1-0e31544242d6")
public static final String FIELDNAME_Orders_CreditApproved="23ae790a-20dd-9d28-d1d1-0e31544242d6";

@XendraTrl(Identifier="a9915d8b-7802-005f-5c59-9cb9d5d4d437")
public static String es_PE_COLUMN_IsCreditApproved_Name="Crédito Aprobado";

@XendraColumn(AD_Element_ID="2c46a4e5-8700-2b61-b8f7-c2a71dcee4e2",ColumnName="IsCreditApproved",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a9915d8b-7802-005f-5c59-9cb9d5d4d437",
Synchronized="2020-03-03 21:37:11.0")
/** Column name IsCreditApproved */
public static final String COLUMNNAME_IsCreditApproved = "IsCreditApproved";
/** Set Delivered.
@param IsDelivered Delivered */
public void setIsDelivered (boolean IsDelivered)
{
set_ValueNoCheck (COLUMNNAME_IsDelivered, Boolean.valueOf(IsDelivered));
}
/** Get Delivered.
@return Delivered */
public boolean isDelivered() 
{
Object oo = get_Value(COLUMNNAME_IsDelivered);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="fb228b23-749f-c4a1-9527-af48b8760874")
public static String es_PE_FIELD_Order_Delivered_Name="Entregado";

@XendraField(AD_Column_ID="IsDelivered",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fb228b23-749f-c4a1-9527-af48b8760874")
public static final String FIELDNAME_Order_Delivered="fb228b23-749f-c4a1-9527-af48b8760874";

@XendraTrl(Identifier="629a5b67-6c1f-7ffc-6e97-e8a09de2dfa4")
public static String es_PE_FIELD_PurchaseOrder_Delivered_Name="Entregado";

@XendraField(AD_Column_ID="IsDelivered",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="629a5b67-6c1f-7ffc-6e97-e8a09de2dfa4")
public static final String FIELDNAME_PurchaseOrder_Delivered="629a5b67-6c1f-7ffc-6e97-e8a09de2dfa4";

@XendraTrl(Identifier="0d075225-fc4e-3285-e506-21356bacc46f")
public static String es_PE_FIELD_PartnerOrders_Delivered_Name="Entregado";

@XendraField(AD_Column_ID="IsDelivered",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0d075225-fc4e-3285-e506-21356bacc46f")
public static final String FIELDNAME_PartnerOrders_Delivered="0d075225-fc4e-3285-e506-21356bacc46f";

@XendraTrl(Identifier="b2b39617-a996-d23c-06af-0147398f6819")
public static String es_PE_FIELD_Orders_Delivered_Name="Entregado";

@XendraField(AD_Column_ID="IsDelivered",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=640,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b2b39617-a996-d23c-06af-0147398f6819")
public static final String FIELDNAME_Orders_Delivered="b2b39617-a996-d23c-06af-0147398f6819";

@XendraTrl(Identifier="1b664b4a-ab7e-9296-2175-2e0c8bcf27c5")
public static String es_PE_COLUMN_IsDelivered_Name="Entregado";

@XendraColumn(AD_Element_ID="2ff67353-25ec-8625-2649-c1fb3daa06b7",ColumnName="IsDelivered",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1b664b4a-ab7e-9296-2175-2e0c8bcf27c5",
Synchronized="2020-03-03 21:37:11.0")
/** Column name IsDelivered */
public static final String COLUMNNAME_IsDelivered = "IsDelivered";
/** Set Discount Printed.
@param IsDiscountPrinted Print Discount on Invoice and Order */
public void setIsDiscountPrinted (boolean IsDiscountPrinted)
{
set_Value (COLUMNNAME_IsDiscountPrinted, Boolean.valueOf(IsDiscountPrinted));
}
/** Get Discount Printed.
@return Print Discount on Invoice and Order */
public boolean isDiscountPrinted() 
{
Object oo = get_Value(COLUMNNAME_IsDiscountPrinted);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="47b6cc1e-a7f9-f018-26e8-625a7a43e7fb")
public static String es_PE_FIELD_Order_DiscountPrinted_Name="Imprimir Descuento";

@XendraTrl(Identifier="47b6cc1e-a7f9-f018-26e8-625a7a43e7fb")
public static String es_PE_FIELD_Order_DiscountPrinted_Description="Imprimir el descuento en la Factura y la orden";

@XendraTrl(Identifier="47b6cc1e-a7f9-f018-26e8-625a7a43e7fb")
public static String es_PE_FIELD_Order_DiscountPrinted_Help="El cuadro de verificación descuento Impreso indica si el descuento será impreso en el documento.";

@XendraField(AD_Column_ID="IsDiscountPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="47b6cc1e-a7f9-f018-26e8-625a7a43e7fb")
public static final String FIELDNAME_Order_DiscountPrinted="47b6cc1e-a7f9-f018-26e8-625a7a43e7fb";

@XendraTrl(Identifier="f64fe5c5-0562-3afb-9a03-b855d88a6a06")
public static String es_PE_FIELD_PurchaseOrder_DiscountPrinted_Name="Imprimir Descuento";

@XendraTrl(Identifier="f64fe5c5-0562-3afb-9a03-b855d88a6a06")
public static String es_PE_FIELD_PurchaseOrder_DiscountPrinted_Description="Imprimir el descuento en la Factura y la orden";

@XendraTrl(Identifier="f64fe5c5-0562-3afb-9a03-b855d88a6a06")
public static String es_PE_FIELD_PurchaseOrder_DiscountPrinted_Help="El cuadro de verificación descuento Impreso indica si el descuento será impreso en el documento.";

@XendraField(AD_Column_ID="IsDiscountPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f64fe5c5-0562-3afb-9a03-b855d88a6a06")
public static final String FIELDNAME_PurchaseOrder_DiscountPrinted="f64fe5c5-0562-3afb-9a03-b855d88a6a06";

@XendraTrl(Identifier="d0f71e48-f441-d2a1-e35e-23401aa2645b")
public static String es_PE_FIELD_PartnerOrders_DiscountPrinted_Name="Imprimir Descuento";

@XendraTrl(Identifier="d0f71e48-f441-d2a1-e35e-23401aa2645b")
public static String es_PE_FIELD_PartnerOrders_DiscountPrinted_Description="Imprimir el descuento en la Factura y la orden";

@XendraTrl(Identifier="d0f71e48-f441-d2a1-e35e-23401aa2645b")
public static String es_PE_FIELD_PartnerOrders_DiscountPrinted_Help="El cuadro de verificación descuento Impreso indica si el descuento será impreso en el documento.";

@XendraField(AD_Column_ID="IsDiscountPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d0f71e48-f441-d2a1-e35e-23401aa2645b")
public static final String FIELDNAME_PartnerOrders_DiscountPrinted="d0f71e48-f441-d2a1-e35e-23401aa2645b";

@XendraTrl(Identifier="a669b00a-a478-b3f8-62a1-4e31f5d614db")
public static String es_PE_FIELD_Orders_DiscountPrinted_Name="Imprimir Descuento";

@XendraTrl(Identifier="a669b00a-a478-b3f8-62a1-4e31f5d614db")
public static String es_PE_FIELD_Orders_DiscountPrinted_Description="Imprimir el descuento en la Factura y la orden";

@XendraTrl(Identifier="a669b00a-a478-b3f8-62a1-4e31f5d614db")
public static String es_PE_FIELD_Orders_DiscountPrinted_Help="El cuadro de verificación descuento Impreso indica si el descuento será impreso en el documento.";

@XendraField(AD_Column_ID="IsDiscountPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a669b00a-a478-b3f8-62a1-4e31f5d614db")
public static final String FIELDNAME_Orders_DiscountPrinted="a669b00a-a478-b3f8-62a1-4e31f5d614db";

@XendraTrl(Identifier="245b4849-76d4-7e94-d9b4-653172b47217")
public static String es_PE_COLUMN_IsDiscountPrinted_Name="Imprimir Descuento";

@XendraColumn(AD_Element_ID="b8c6a8c1-0f6b-470e-d3be-4bd106a17b8a",ColumnName="IsDiscountPrinted",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="245b4849-76d4-7e94-d9b4-653172b47217",
Synchronized="2020-03-03 21:37:11.0")
/** Column name IsDiscountPrinted */
public static final String COLUMNNAME_IsDiscountPrinted = "IsDiscountPrinted";
/** Set Drop Shipment.
@param IsDropShip Drop Shipments are sent from the Vendor directly to the Customer */
public void setIsDropShip (boolean IsDropShip)
{
set_ValueNoCheck (COLUMNNAME_IsDropShip, Boolean.valueOf(IsDropShip));
}
/** Get Drop Shipment.
@return Drop Shipments are sent from the Vendor directly to the Customer */
public boolean isDropShip() 
{
Object oo = get_Value(COLUMNNAME_IsDropShip);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="a906ea96-0328-025b-8fa9-5c2c7abd10b4")
public static String es_PE_FIELD_Order_DropShipment_Name="Entrega Directa";

@XendraTrl(Identifier="a906ea96-0328-025b-8fa9-5c2c7abd10b4")
public static String es_PE_FIELD_Order_DropShipment_Description="Los envíos de la nota se envían del vendedor directamente al cliente";

@XendraTrl(Identifier="a906ea96-0328-025b-8fa9-5c2c7abd10b4")
public static String es_PE_FIELD_Order_DropShipment_Help="Los envíos de la nota no causan ningunas reservaciones ó movimientos del inventario mientras que el envío es del inventario del vendedor. El envío del vendedor al cliente debe ser confirmado.";

@XendraField(AD_Column_ID="IsDropShip",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="Delivery",IsDisplayed=true,
DisplayLogic="@OrderType@='SO' ",DisplayLength=1,IsReadOnly=false,SeqNo=160,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="a906ea96-0328-025b-8fa9-5c2c7abd10b4")
public static final String FIELDNAME_Order_DropShipment="a906ea96-0328-025b-8fa9-5c2c7abd10b4";

@XendraTrl(Identifier="d01d89be-0124-2d66-220b-5a08484062a0")
public static String es_PE_FIELD_PurchaseOrder_DropShipment_Name="Entrega Directa";

@XendraTrl(Identifier="d01d89be-0124-2d66-220b-5a08484062a0")
public static String es_PE_FIELD_PurchaseOrder_DropShipment_Description="Los envíos de la nota se envían del vendedor directamente al cliente";

@XendraTrl(Identifier="d01d89be-0124-2d66-220b-5a08484062a0")
public static String es_PE_FIELD_PurchaseOrder_DropShipment_Help="Los envíos de la nota no causan ningunas reservaciones ó movimientos del inventario mientras que el envío es del inventario del vendedor. El envío del vendedor al cliente debe ser confirmado.";

@XendraField(AD_Column_ID="IsDropShip",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="Delivery",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=120,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d01d89be-0124-2d66-220b-5a08484062a0")
public static final String FIELDNAME_PurchaseOrder_DropShipment="d01d89be-0124-2d66-220b-5a08484062a0";

@XendraTrl(Identifier="de61f7a7-5271-4ed0-b281-cb6ba82f5985")
public static String es_PE_FIELD_PartnerOrders_DropShipment_Name="Entrega Directa";

@XendraTrl(Identifier="de61f7a7-5271-4ed0-b281-cb6ba82f5985")
public static String es_PE_FIELD_PartnerOrders_DropShipment_Description="Los envíos de la nota se envían del vendedor directamente al cliente";

@XendraTrl(Identifier="de61f7a7-5271-4ed0-b281-cb6ba82f5985")
public static String es_PE_FIELD_PartnerOrders_DropShipment_Help="Los envíos de la nota no causan ningunas reservaciones ó movimientos del inventario mientras que el envío es del inventario del vendedor. El envío del vendedor al cliente debe ser confirmado.";

@XendraField(AD_Column_ID="IsDropShip",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=540,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="de61f7a7-5271-4ed0-b281-cb6ba82f5985")
public static final String FIELDNAME_PartnerOrders_DropShipment="de61f7a7-5271-4ed0-b281-cb6ba82f5985";

@XendraTrl(Identifier="1ab38364-2037-1ddc-4d30-c749ce10370b")
public static String es_PE_FIELD_Orders_DropShipment_Name="Entrega Directa";

@XendraTrl(Identifier="1ab38364-2037-1ddc-4d30-c749ce10370b")
public static String es_PE_FIELD_Orders_DropShipment_Description="Los envíos de la nota se envían del vendedor directamente al cliente";

@XendraTrl(Identifier="1ab38364-2037-1ddc-4d30-c749ce10370b")
public static String es_PE_FIELD_Orders_DropShipment_Help="Los envíos de la nota no causan ningunas reservaciones ó movimientos del inventario mientras que el envío es del inventario del vendedor. El envío del vendedor al cliente debe ser confirmado.";

@XendraField(AD_Column_ID="IsDropShip",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="Delivery",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=530,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1ab38364-2037-1ddc-4d30-c749ce10370b")
public static final String FIELDNAME_Orders_DropShipment="1ab38364-2037-1ddc-4d30-c749ce10370b";

@XendraTrl(Identifier="27844b48-0a27-fdac-dd3b-8174dfb454df")
public static String es_PE_COLUMN_IsDropShip_Name="Entrega Directa";

@XendraColumn(AD_Element_ID="9169ec42-d87e-a73e-8ef5-81b97661ffb5",ColumnName="IsDropShip",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="27844b48-0a27-fdac-dd3b-8174dfb454df",
Synchronized="2020-03-03 21:37:11.0")
/** Column name IsDropShip */
public static final String COLUMNNAME_IsDropShip = "IsDropShip";
/** Set Invoiced.
@param IsInvoiced Is this invoiced? */
public void setIsInvoiced (boolean IsInvoiced)
{
set_ValueNoCheck (COLUMNNAME_IsInvoiced, Boolean.valueOf(IsInvoiced));
}
/** Get Invoiced.
@return Is this invoiced? */
public boolean isInvoiced() 
{
Object oo = get_Value(COLUMNNAME_IsInvoiced);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="fa907c97-0e68-969f-55e7-f181ef58c31e")
public static String es_PE_FIELD_Order_Invoiced_Name="Facturado";

@XendraField(AD_Column_ID="IsInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fa907c97-0e68-969f-55e7-f181ef58c31e")
public static final String FIELDNAME_Order_Invoiced="fa907c97-0e68-969f-55e7-f181ef58c31e";

@XendraTrl(Identifier="cbe98b07-01c9-afed-8bfb-629db1db5caf")
public static String es_PE_FIELD_PurchaseOrder_Invoiced_Name="Facturado";

@XendraField(AD_Column_ID="IsInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cbe98b07-01c9-afed-8bfb-629db1db5caf")
public static final String FIELDNAME_PurchaseOrder_Invoiced="cbe98b07-01c9-afed-8bfb-629db1db5caf";

@XendraTrl(Identifier="9d099636-6479-9761-d0ea-72ec404661e8")
public static String es_PE_FIELD_PartnerOrders_Invoiced_Name="Facturado";

@XendraField(AD_Column_ID="IsInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9d099636-6479-9761-d0ea-72ec404661e8")
public static final String FIELDNAME_PartnerOrders_Invoiced="9d099636-6479-9761-d0ea-72ec404661e8";

@XendraTrl(Identifier="cd0e7e05-4f28-363e-d2d0-0f8c6de21beb")
public static String es_PE_FIELD_Orders_Invoiced_Name="Facturado";

@XendraField(AD_Column_ID="IsInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=650,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cd0e7e05-4f28-363e-d2d0-0f8c6de21beb")
public static final String FIELDNAME_Orders_Invoiced="cd0e7e05-4f28-363e-d2d0-0f8c6de21beb";

@XendraTrl(Identifier="8348d529-390a-bdfd-450a-da3046e8dd7b")
public static String es_PE_COLUMN_IsInvoiced_Name="Facturado";

@XendraColumn(AD_Element_ID="a685c688-064e-aa25-7a8b-2b0273e958c1",ColumnName="IsInvoiced",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8348d529-390a-bdfd-450a-da3046e8dd7b",
Synchronized="2020-03-03 21:37:11.0")
/** Column name IsInvoiced */
public static final String COLUMNNAME_IsInvoiced = "IsInvoiced";
/** Set Printed.
@param IsPrinted Indicates if this document / line is printed */
public void setIsPrinted (boolean IsPrinted)
{
set_ValueNoCheck (COLUMNNAME_IsPrinted, Boolean.valueOf(IsPrinted));
}
/** Get Printed.
@return Indicates if this document / line is printed */
public boolean isPrinted() 
{
Object oo = get_Value(COLUMNNAME_IsPrinted);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="ec03e29b-101f-30d0-fb7e-d861829fea24")
public static String es_PE_FIELD_Order_Printed_Name="Impreso";

@XendraTrl(Identifier="ec03e29b-101f-30d0-fb7e-d861829fea24")
public static String es_PE_FIELD_Order_Printed_Description="Indica si este documento es impreso.";

@XendraTrl(Identifier="ec03e29b-101f-30d0-fb7e-d861829fea24")
public static String es_PE_FIELD_Order_Printed_Help="El cuadro de verificación impreso indica si este documento se imprimirá.";

@XendraField(AD_Column_ID="IsPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ec03e29b-101f-30d0-fb7e-d861829fea24")
public static final String FIELDNAME_Order_Printed="ec03e29b-101f-30d0-fb7e-d861829fea24";

@XendraTrl(Identifier="772861bb-f1c2-2385-96a5-de597aa74840")
public static String es_PE_FIELD_PurchaseOrder_Printed_Name="Impreso";

@XendraTrl(Identifier="772861bb-f1c2-2385-96a5-de597aa74840")
public static String es_PE_FIELD_PurchaseOrder_Printed_Description="Indica si este documento es impreso.";

@XendraTrl(Identifier="772861bb-f1c2-2385-96a5-de597aa74840")
public static String es_PE_FIELD_PurchaseOrder_Printed_Help="El cuadro de verificación impreso indica si este documento se imprimirá.";

@XendraField(AD_Column_ID="IsPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="772861bb-f1c2-2385-96a5-de597aa74840")
public static final String FIELDNAME_PurchaseOrder_Printed="772861bb-f1c2-2385-96a5-de597aa74840";

@XendraTrl(Identifier="7c5ba00b-e5e4-6995-56cd-315a55a5ae67")
public static String es_PE_FIELD_PartnerOrders_Printed_Name="Impreso";

@XendraTrl(Identifier="7c5ba00b-e5e4-6995-56cd-315a55a5ae67")
public static String es_PE_FIELD_PartnerOrders_Printed_Description="Indica si este documento es impreso.";

@XendraTrl(Identifier="7c5ba00b-e5e4-6995-56cd-315a55a5ae67")
public static String es_PE_FIELD_PartnerOrders_Printed_Help="El cuadro de verificación impreso indica si este documento se imprimirá.";

@XendraField(AD_Column_ID="IsPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7c5ba00b-e5e4-6995-56cd-315a55a5ae67")
public static final String FIELDNAME_PartnerOrders_Printed="7c5ba00b-e5e4-6995-56cd-315a55a5ae67";

@XendraTrl(Identifier="844f5c27-0c81-866b-b96f-3aa76b8fa66a")
public static String es_PE_FIELD_Orders_Printed_Name="Impreso";

@XendraTrl(Identifier="844f5c27-0c81-866b-b96f-3aa76b8fa66a")
public static String es_PE_FIELD_Orders_Printed_Description="Indica si este documento es impreso.";

@XendraTrl(Identifier="844f5c27-0c81-866b-b96f-3aa76b8fa66a")
public static String es_PE_FIELD_Orders_Printed_Help="El cuadro de verificación impreso indica si este documento se imprimirá.";

@XendraField(AD_Column_ID="IsPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=320,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="844f5c27-0c81-866b-b96f-3aa76b8fa66a")
public static final String FIELDNAME_Orders_Printed="844f5c27-0c81-866b-b96f-3aa76b8fa66a";

@XendraTrl(Identifier="e61953b7-d8a0-7d8b-71b5-8a430db0e16e")
public static String es_PE_COLUMN_IsPrinted_Name="Impreso";

@XendraColumn(AD_Element_ID="66795cb3-a608-19bb-8cde-40abe30a0130",ColumnName="IsPrinted",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e61953b7-d8a0-7d8b-71b5-8a430db0e16e",
Synchronized="2020-03-03 21:37:11.0")
/** Column name IsPrinted */
public static final String COLUMNNAME_IsPrinted = "IsPrinted";
/** Set IsRealtimePOS.
@param IsRealtimePOS IsRealtimePOS */
public void setIsRealtimePOS (boolean IsRealtimePOS)
{
set_Value (COLUMNNAME_IsRealtimePOS, Boolean.valueOf(IsRealtimePOS));
}
/** Get IsRealtimePOS.
@return IsRealtimePOS */
public boolean isRealtimePOS() 
{
Object oo = get_Value(COLUMNNAME_IsRealtimePOS);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="584092a8-95b2-4280-b0a2-b652c1447967")
public static String es_PE_FIELD_Order_IsRealtimePOS_Name="IsRealTimePOS";

@XendraField(AD_Column_ID="IsRealtimePOS",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-06 10:29:36.0",
Identifier="584092a8-95b2-4280-b0a2-b652c1447967")
public static final String FIELDNAME_Order_IsRealtimePOS="584092a8-95b2-4280-b0a2-b652c1447967";

@XendraTrl(Identifier="1875f77b-ce9f-9ec9-137b-6403a1f8dd38")
public static String es_PE_COLUMN_IsRealtimePOS_Name="isrealtimepos";

@XendraColumn(AD_Element_ID="d11eaa71-d549-2f36-a313-290a07febb00",ColumnName="IsRealtimePOS",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1875f77b-ce9f-9ec9-137b-6403a1f8dd38",
Synchronized="2020-03-03 21:37:11.0")
/** Column name IsRealtimePOS */
public static final String COLUMNNAME_IsRealtimePOS = "IsRealtimePOS";
/** Set Selected.
@param IsSelected Selected */
public void setIsSelected (boolean IsSelected)
{
set_Value (COLUMNNAME_IsSelected, Boolean.valueOf(IsSelected));
}
/** Get Selected.
@return Selected */
public boolean isSelected() 
{
Object oo = get_Value(COLUMNNAME_IsSelected);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="139d46a4-aa7d-02df-0dbf-15cb2cbb1afb")
public static String es_PE_FIELD_Order_Selected_Name="Seleccionado";

@XendraField(AD_Column_ID="IsSelected",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="139d46a4-aa7d-02df-0dbf-15cb2cbb1afb")
public static final String FIELDNAME_Order_Selected="139d46a4-aa7d-02df-0dbf-15cb2cbb1afb";

@XendraTrl(Identifier="b74d3e5c-dc54-3716-5571-cba139c7cd30")
public static String es_PE_FIELD_PurchaseOrder_Selected_Name="Seleccionado";

@XendraField(AD_Column_ID="IsSelected",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b74d3e5c-dc54-3716-5571-cba139c7cd30")
public static final String FIELDNAME_PurchaseOrder_Selected="b74d3e5c-dc54-3716-5571-cba139c7cd30";

@XendraTrl(Identifier="d0aeb3cd-8183-23da-77e5-b4bcab488880")
public static String es_PE_FIELD_PartnerOrders_Selected_Name="Seleccionado";

@XendraField(AD_Column_ID="IsSelected",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d0aeb3cd-8183-23da-77e5-b4bcab488880")
public static final String FIELDNAME_PartnerOrders_Selected="d0aeb3cd-8183-23da-77e5-b4bcab488880";

@XendraTrl(Identifier="575f5620-44aa-d6cf-56db-848e87372ef4")
public static String es_PE_FIELD_Orders_Selected_Name="Seleccionado";

@XendraField(AD_Column_ID="IsSelected",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="575f5620-44aa-d6cf-56db-848e87372ef4")
public static final String FIELDNAME_Orders_Selected="575f5620-44aa-d6cf-56db-848e87372ef4";

@XendraTrl(Identifier="d98a6537-0de4-d3bf-efc3-f1da20de64d6")
public static String es_PE_COLUMN_IsSelected_Name="Seleccionado";

@XendraColumn(AD_Element_ID="7e3ec6ae-4cbf-7dc9-73ce-9a24e9fb7f16",ColumnName="IsSelected",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d98a6537-0de4-d3bf-efc3-f1da20de64d6",
Synchronized="2020-03-03 21:37:11.0")
/** Column name IsSelected */
public static final String COLUMNNAME_IsSelected = "IsSelected";
/** Set Self-Service.
@param IsSelfService This is a Self-Service entry or this entry can be changed via Self-Service */
public void setIsSelfService (boolean IsSelfService)
{
set_Value (COLUMNNAME_IsSelfService, Boolean.valueOf(IsSelfService));
}
/** Get Self-Service.
@return This is a Self-Service entry or this entry can be changed via Self-Service */
public boolean isSelfService() 
{
Object oo = get_Value(COLUMNNAME_IsSelfService);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="6bf05f05-99e2-ea7d-e4ad-7f84eea1b0aa")
public static String es_PE_FIELD_Order_Self_Service_Name="Auto-Servicio";

@XendraTrl(Identifier="6bf05f05-99e2-ea7d-e4ad-7f84eea1b0aa")
public static String es_PE_FIELD_Order_Self_Service_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraTrl(Identifier="6bf05f05-99e2-ea7d-e4ad-7f84eea1b0aa")
public static String es_PE_FIELD_Order_Self_Service_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6bf05f05-99e2-ea7d-e4ad-7f84eea1b0aa")
public static final String FIELDNAME_Order_Self_Service="6bf05f05-99e2-ea7d-e4ad-7f84eea1b0aa";

@XendraTrl(Identifier="975a7fba-eaa0-71e0-ec2c-1881ac4f8166")
public static String es_PE_FIELD_PurchaseOrder_Self_Service_Name="Auto-Servicio";

@XendraTrl(Identifier="975a7fba-eaa0-71e0-ec2c-1881ac4f8166")
public static String es_PE_FIELD_PurchaseOrder_Self_Service_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraTrl(Identifier="975a7fba-eaa0-71e0-ec2c-1881ac4f8166")
public static String es_PE_FIELD_PurchaseOrder_Self_Service_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="975a7fba-eaa0-71e0-ec2c-1881ac4f8166")
public static final String FIELDNAME_PurchaseOrder_Self_Service="975a7fba-eaa0-71e0-ec2c-1881ac4f8166";

@XendraTrl(Identifier="4b830be5-37ec-5675-4663-543e97396647")
public static String es_PE_FIELD_PartnerOrders_Self_Service_Name="Auto-Servicio";

@XendraTrl(Identifier="4b830be5-37ec-5675-4663-543e97396647")
public static String es_PE_FIELD_PartnerOrders_Self_Service_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraTrl(Identifier="4b830be5-37ec-5675-4663-543e97396647")
public static String es_PE_FIELD_PartnerOrders_Self_Service_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=600,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4b830be5-37ec-5675-4663-543e97396647")
public static final String FIELDNAME_PartnerOrders_Self_Service="4b830be5-37ec-5675-4663-543e97396647";

@XendraTrl(Identifier="74962660-925c-926c-feb2-4408860588bf")
public static String es_PE_FIELD_Orders_Self_Service_Name="Auto-Servicio";

@XendraTrl(Identifier="74962660-925c-926c-feb2-4408860588bf")
public static String es_PE_FIELD_Orders_Self_Service_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraTrl(Identifier="74962660-925c-926c-feb2-4408860588bf")
public static String es_PE_FIELD_Orders_Self_Service_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=590,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="74962660-925c-926c-feb2-4408860588bf")
public static final String FIELDNAME_Orders_Self_Service="74962660-925c-926c-feb2-4408860588bf";

@XendraTrl(Identifier="58976a84-d60a-dcbc-bd37-8d672d5d52c5")
public static String es_PE_COLUMN_IsSelfService_Name="Auto-Servicio";

@XendraColumn(AD_Element_ID="8f201030-f9ab-66d2-f4de-7209f41f2af8",ColumnName="IsSelfService",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="58976a84-d60a-dcbc-bd37-8d672d5d52c5",
Synchronized="2020-03-03 21:37:11.0")
/** Column name IsSelfService */
public static final String COLUMNNAME_IsSelfService = "IsSelfService";
/** Set Sales Transaction.
@param IsSOTrx This is a Sales Transaction */
public void setIsSOTrx (boolean IsSOTrx)
{
set_Value (COLUMNNAME_IsSOTrx, Boolean.valueOf(IsSOTrx));
}
/** Get Sales Transaction.
@return This is a Sales Transaction */
public boolean isSOTrx() 
{
Object oo = get_Value(COLUMNNAME_IsSOTrx);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="36f0b80a-3ed3-88b4-9452-b4c1b62b2128")
public static String es_PE_FIELD_Order_SalesTransaction_Name="Transacción de Ventas";

@XendraTrl(Identifier="36f0b80a-3ed3-88b4-9452-b4c1b62b2128")
public static String es_PE_FIELD_Order_SalesTransaction_Description="Esta es una transacción de ventas";

@XendraTrl(Identifier="36f0b80a-3ed3-88b4-9452-b4c1b62b2128")
public static String es_PE_FIELD_Order_SalesTransaction_Help="El cuadro de verificación Transacción de Ventas indica si este ítem es una transacción de ventas";

@XendraField(AD_Column_ID="IsSOTrx",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="36f0b80a-3ed3-88b4-9452-b4c1b62b2128")
public static final String FIELDNAME_Order_SalesTransaction="36f0b80a-3ed3-88b4-9452-b4c1b62b2128";

@XendraTrl(Identifier="1f1e3f8d-9a4a-5b11-5ba5-68a1d1f03ca8")
public static String es_PE_FIELD_PurchaseOrder_SalesTransaction_Name="Transacción de Ventas";

@XendraTrl(Identifier="1f1e3f8d-9a4a-5b11-5ba5-68a1d1f03ca8")
public static String es_PE_FIELD_PurchaseOrder_SalesTransaction_Description="Esta es una transacción de ventas";

@XendraTrl(Identifier="1f1e3f8d-9a4a-5b11-5ba5-68a1d1f03ca8")
public static String es_PE_FIELD_PurchaseOrder_SalesTransaction_Help="El cuadro de verificación Transacción de Ventas indica si este ítem es una transacción de ventas";

@XendraField(AD_Column_ID="IsSOTrx",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1f1e3f8d-9a4a-5b11-5ba5-68a1d1f03ca8")
public static final String FIELDNAME_PurchaseOrder_SalesTransaction="1f1e3f8d-9a4a-5b11-5ba5-68a1d1f03ca8";

@XendraTrl(Identifier="788442ea-7d96-a873-a4a9-50abfee70b51")
public static String es_PE_FIELD_PartnerOrders_SalesTransaction_Name="Transacción de Ventas";

@XendraTrl(Identifier="788442ea-7d96-a873-a4a9-50abfee70b51")
public static String es_PE_FIELD_PartnerOrders_SalesTransaction_Description="Esta es una transacción de ventas";

@XendraTrl(Identifier="788442ea-7d96-a873-a4a9-50abfee70b51")
public static String es_PE_FIELD_PartnerOrders_SalesTransaction_Help="El cuadro de verificación Transacción de Ventas indica si este ítem es una transacción de ventas";

@XendraField(AD_Column_ID="IsSOTrx",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=560,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="788442ea-7d96-a873-a4a9-50abfee70b51")
public static final String FIELDNAME_PartnerOrders_SalesTransaction="788442ea-7d96-a873-a4a9-50abfee70b51";

@XendraTrl(Identifier="9c4795b2-301c-9bdf-2fc9-9d1aab184529")
public static String es_PE_FIELD_Orders_SalesTransaction_Name="Transacción de Ventas";

@XendraTrl(Identifier="9c4795b2-301c-9bdf-2fc9-9d1aab184529")
public static String es_PE_FIELD_Orders_SalesTransaction_Description="Esta es una transacción de ventas";

@XendraTrl(Identifier="9c4795b2-301c-9bdf-2fc9-9d1aab184529")
public static String es_PE_FIELD_Orders_SalesTransaction_Help="El cuadro de verificación Transacción de Ventas indica si este ítem es una transacción de ventas";

@XendraField(AD_Column_ID="IsSOTrx",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=550,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9c4795b2-301c-9bdf-2fc9-9d1aab184529")
public static final String FIELDNAME_Orders_SalesTransaction="9c4795b2-301c-9bdf-2fc9-9d1aab184529";

@XendraTrl(Identifier="80045d68-0415-6ef5-009e-cafdb852422f")
public static String es_PE_COLUMN_IsSOTrx_Name="Transacción de Ventas";

@XendraColumn(AD_Element_ID="4084b69f-a51d-5676-4d8c-395a13e6b2df",ColumnName="IsSOTrx",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,
DefaultValue="@IsSOTrx@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="80045d68-0415-6ef5-009e-cafdb852422f",Synchronized="2020-03-03 21:37:11.0")
/** Column name IsSOTrx */
public static final String COLUMNNAME_IsSOTrx = "IsSOTrx";
/** Set Price includes Tax.
@param IsTaxIncluded Tax is included in the price  */
public void setIsTaxIncluded (boolean IsTaxIncluded)
{
set_Value (COLUMNNAME_IsTaxIncluded, Boolean.valueOf(IsTaxIncluded));
}
/** Get Price includes Tax.
@return Tax is included in the price  */
public boolean isTaxIncluded() 
{
Object oo = get_Value(COLUMNNAME_IsTaxIncluded);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="c11364e1-55ba-80eb-7fc8-ba1cebb1a1a8")
public static String es_PE_FIELD_Order_PriceIncludesTax_Name="Impuesto Incluido en el Precio";

@XendraTrl(Identifier="c11364e1-55ba-80eb-7fc8-ba1cebb1a1a8")
public static String es_PE_FIELD_Order_PriceIncludesTax_Description="Impuesto incluido en el precio";

@XendraTrl(Identifier="c11364e1-55ba-80eb-7fc8-ba1cebb1a1a8")
public static String es_PE_FIELD_Order_PriceIncludesTax_Help="El cuadro de verificación Impuesto Incluido indica que el precio incluye impuestos. Esto es también conocido como el precio bruto";

@XendraField(AD_Column_ID="IsTaxIncluded",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c11364e1-55ba-80eb-7fc8-ba1cebb1a1a8")
public static final String FIELDNAME_Order_PriceIncludesTax="c11364e1-55ba-80eb-7fc8-ba1cebb1a1a8";

@XendraTrl(Identifier="542c3188-81d3-3edb-53d5-9375e8e72d32")
public static String es_PE_FIELD_PurchaseOrder_PriceIncludesTax_Name="Impuesto Incluido en el Precio";

@XendraTrl(Identifier="542c3188-81d3-3edb-53d5-9375e8e72d32")
public static String es_PE_FIELD_PurchaseOrder_PriceIncludesTax_Description="Impuesto incluido en el precio";

@XendraTrl(Identifier="542c3188-81d3-3edb-53d5-9375e8e72d32")
public static String es_PE_FIELD_PurchaseOrder_PriceIncludesTax_Help="El cuadro de verificación Impuesto Incluido indica que el precio incluye impuestos. Esto es también conocido como el precio bruto";

@XendraField(AD_Column_ID="IsTaxIncluded",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="542c3188-81d3-3edb-53d5-9375e8e72d32")
public static final String FIELDNAME_PurchaseOrder_PriceIncludesTax="542c3188-81d3-3edb-53d5-9375e8e72d32";

@XendraTrl(Identifier="702517fa-ccb9-7e5b-9938-8979b0e00b9e")
public static String es_PE_FIELD_PartnerOrders_PriceIncludesTax_Name="Impuesto Incluido en el Precio";

@XendraTrl(Identifier="702517fa-ccb9-7e5b-9938-8979b0e00b9e")
public static String es_PE_FIELD_PartnerOrders_PriceIncludesTax_Description="Impuesto incluido en el precio";

@XendraTrl(Identifier="702517fa-ccb9-7e5b-9938-8979b0e00b9e")
public static String es_PE_FIELD_PartnerOrders_PriceIncludesTax_Help="El cuadro de verificación Impuesto Incluido indica que el precio incluye impuestos. Esto es también conocido como el precio bruto";

@XendraField(AD_Column_ID="IsTaxIncluded",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="702517fa-ccb9-7e5b-9938-8979b0e00b9e")
public static final String FIELDNAME_PartnerOrders_PriceIncludesTax="702517fa-ccb9-7e5b-9938-8979b0e00b9e";

@XendraTrl(Identifier="8b8cc1e9-47e9-c966-6ac0-a85a2d2c22d0")
public static String es_PE_FIELD_Orders_PriceIncludesTax_Name="Impuesto Incluido en el Precio";

@XendraTrl(Identifier="8b8cc1e9-47e9-c966-6ac0-a85a2d2c22d0")
public static String es_PE_FIELD_Orders_PriceIncludesTax_Description="Impuesto incluido en el precio";

@XendraTrl(Identifier="8b8cc1e9-47e9-c966-6ac0-a85a2d2c22d0")
public static String es_PE_FIELD_Orders_PriceIncludesTax_Help="El cuadro de verificación Impuesto Incluido indica que el precio incluye impuestos. Esto es también conocido como el precio bruto";

@XendraField(AD_Column_ID="IsTaxIncluded",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8b8cc1e9-47e9-c966-6ac0-a85a2d2c22d0")
public static final String FIELDNAME_Orders_PriceIncludesTax="8b8cc1e9-47e9-c966-6ac0-a85a2d2c22d0";

@XendraTrl(Identifier="5ec41287-4033-a6f7-775d-823d14d9d5c3")
public static String es_PE_COLUMN_IsTaxIncluded_Name="Impuesto Incluido en el Precio";

@XendraColumn(AD_Element_ID="eb0a6d55-2fff-a462-20b8-744571a3fe60",ColumnName="IsTaxIncluded",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5ec41287-4033-a6f7-775d-823d14d9d5c3",
Synchronized="2020-03-03 21:37:11.0")
/** Column name IsTaxIncluded */
public static final String COLUMNNAME_IsTaxIncluded = "IsTaxIncluded";
/** Set Transferred.
@param IsTransferred Transferred to General Ledger (i.e. accounted) */
public void setIsTransferred (boolean IsTransferred)
{
set_ValueNoCheck (COLUMNNAME_IsTransferred, Boolean.valueOf(IsTransferred));
}
/** Get Transferred.
@return Transferred to General Ledger (i.e. accounted) */
public boolean isTransferred() 
{
Object oo = get_Value(COLUMNNAME_IsTransferred);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f6da0fa6-ab0a-9fb5-e744-36c3500473e7")
public static String es_PE_FIELD_Order_Transferred_Name="Transferido";

@XendraTrl(Identifier="f6da0fa6-ab0a-9fb5-e744-36c3500473e7")
public static String es_PE_FIELD_Order_Transferred_Description="Transferido a la Contabilidad General (Contabilizado)";

@XendraTrl(Identifier="f6da0fa6-ab0a-9fb5-e744-36c3500473e7")
public static String es_PE_FIELD_Order_Transferred_Help="El cuadro de verificación transferido indica si las transacciones asociadas con este documento deberían ser transferidas a la contabilidad general.";

@XendraField(AD_Column_ID="IsTransferred",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f6da0fa6-ab0a-9fb5-e744-36c3500473e7")
public static final String FIELDNAME_Order_Transferred="f6da0fa6-ab0a-9fb5-e744-36c3500473e7";

@XendraTrl(Identifier="9ca4f0ee-9005-7081-f9d9-ce4b6a9e8ed4")
public static String es_PE_FIELD_PurchaseOrder_Transferred_Name="Transferido";

@XendraTrl(Identifier="9ca4f0ee-9005-7081-f9d9-ce4b6a9e8ed4")
public static String es_PE_FIELD_PurchaseOrder_Transferred_Description="Transferido a la Contabilidad General (Contabilizado)";

@XendraTrl(Identifier="9ca4f0ee-9005-7081-f9d9-ce4b6a9e8ed4")
public static String es_PE_FIELD_PurchaseOrder_Transferred_Help="El cuadro de verificación transferido indica si las transacciones asociadas con este documento deberían ser transferidas a la contabilidad general.";

@XendraField(AD_Column_ID="IsTransferred",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9ca4f0ee-9005-7081-f9d9-ce4b6a9e8ed4")
public static final String FIELDNAME_PurchaseOrder_Transferred="9ca4f0ee-9005-7081-f9d9-ce4b6a9e8ed4";

@XendraTrl(Identifier="ff8ca7be-df96-2fb7-f406-04fc23f7a3af")
public static String es_PE_FIELD_PartnerOrders_Transferred_Name="Transferido";

@XendraTrl(Identifier="ff8ca7be-df96-2fb7-f406-04fc23f7a3af")
public static String es_PE_FIELD_PartnerOrders_Transferred_Description="Transferido a la Contabilidad General (Contabilizado)";

@XendraTrl(Identifier="ff8ca7be-df96-2fb7-f406-04fc23f7a3af")
public static String es_PE_FIELD_PartnerOrders_Transferred_Help="El cuadro de verificación transferido indica si las transacciones asociadas con este documento deberían ser transferidas a la contabilidad general.";

@XendraField(AD_Column_ID="IsTransferred",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ff8ca7be-df96-2fb7-f406-04fc23f7a3af")
public static final String FIELDNAME_PartnerOrders_Transferred="ff8ca7be-df96-2fb7-f406-04fc23f7a3af";

@XendraTrl(Identifier="0a14eea7-ca86-2e55-7e21-1673d2b7ea0c")
public static String es_PE_FIELD_Orders_Transferred_Name="Transferido";

@XendraTrl(Identifier="0a14eea7-ca86-2e55-7e21-1673d2b7ea0c")
public static String es_PE_FIELD_Orders_Transferred_Description="Transferido a la Contabilidad General (Contabilizado)";

@XendraTrl(Identifier="0a14eea7-ca86-2e55-7e21-1673d2b7ea0c")
public static String es_PE_FIELD_Orders_Transferred_Help="El cuadro de verificación transferido indica si las transacciones asociadas con este documento deberían ser transferidas a la contabilidad general.";

@XendraField(AD_Column_ID="IsTransferred",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0a14eea7-ca86-2e55-7e21-1673d2b7ea0c")
public static final String FIELDNAME_Orders_Transferred="0a14eea7-ca86-2e55-7e21-1673d2b7ea0c";

@XendraTrl(Identifier="9063a547-40ef-d5a5-c04c-d2008005a3c3")
public static String es_PE_COLUMN_IsTransferred_Name="Transferido";

@XendraColumn(AD_Element_ID="8ec244a7-8179-b3b7-2e19-f3a9a05cb009",ColumnName="IsTransferred",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9063a547-40ef-d5a5-c04c-d2008005a3c3",
Synchronized="2020-03-03 21:37:11.0")
/** Column name IsTransferred */
public static final String COLUMNNAME_IsTransferred = "IsTransferred";
/** Set MachineSerial.
@param MachineSerial MachineSerial */
public void setMachineSerial (String MachineSerial)
{
if (MachineSerial != null && MachineSerial.length() > 60)
{
log.warning("Length > 60 - truncated");
MachineSerial = MachineSerial.substring(0,59);
}
set_Value (COLUMNNAME_MachineSerial, MachineSerial);
}
/** Get MachineSerial.
@return MachineSerial */
public String getMachineSerial() 
{
String value = (String)get_Value(COLUMNNAME_MachineSerial);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="dc607de7-4679-4612-9406-c2d0d2354ad5")
public static String es_PE_FIELD_Order_MachineSerial_Name="machineserial";

@XendraField(AD_Column_ID="MachineSerial",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-06 10:29:36.0",
Identifier="dc607de7-4679-4612-9406-c2d0d2354ad5")
public static final String FIELDNAME_Order_MachineSerial="dc607de7-4679-4612-9406-c2d0d2354ad5";

@XendraTrl(Identifier="d9af17df-2df8-428d-8b87-1eebb41d8072")
public static String es_PE_COLUMN_MachineSerial_Name="MachineSerial";

@XendraColumn(AD_Element_ID="8435e473-af0f-eb91-9746-88d639a40879",ColumnName="MachineSerial",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d9af17df-2df8-428d-8b87-1eebb41d8072",
Synchronized="2020-03-03 21:37:11.0")
/** Column name MachineSerial */
public static final String COLUMNNAME_MachineSerial = "MachineSerial";
/** Set M_In_Out.
@param M_In_Out M_In_Out */
public void setM_In_Out (int M_In_Out)
{
set_Value (COLUMNNAME_M_In_Out, Integer.valueOf(M_In_Out));
}
/** Get M_In_Out.
@return M_In_Out */
public int getM_In_Out() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_In_Out);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8ef557b0-8fc7-f68f-34e1-48ef9dfb7d42")
public static String es_PE_FIELD_Order_M_In_Out_Name="m_in_out";

@XendraField(AD_Column_ID="M_In_Out",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8ef557b0-8fc7-f68f-34e1-48ef9dfb7d42")
public static final String FIELDNAME_Order_M_In_Out="8ef557b0-8fc7-f68f-34e1-48ef9dfb7d42";

@XendraTrl(Identifier="976b86a9-6bbd-149a-d254-5a84be40bc63")
public static String es_PE_FIELD_PurchaseOrder_M_In_Out_Name="m_in_out";

@XendraField(AD_Column_ID="M_In_Out",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="976b86a9-6bbd-149a-d254-5a84be40bc63")
public static final String FIELDNAME_PurchaseOrder_M_In_Out="976b86a9-6bbd-149a-d254-5a84be40bc63";

@XendraTrl(Identifier="73df93e4-8b18-590c-3e51-ae731459321f")
public static String es_PE_COLUMN_M_In_Out_Name="m_in_out";

@XendraColumn(AD_Element_ID="a1cd187e-d149-8cf2-244e-3a5aa590323d",ColumnName="M_In_Out",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="73df93e4-8b18-590c-3e51-ae731459321f",
Synchronized="2020-03-03 21:37:11.0")
/** Column name M_In_Out */
public static final String COLUMNNAME_M_In_Out = "M_In_Out";
/** Set Shipment/Receipt.
@param M_InOut_ID Material Shipment Document */
public void setM_InOut_ID (int M_InOut_ID)
{
if (M_InOut_ID <= 0) set_Value (COLUMNNAME_M_InOut_ID, null);
 else 
set_Value (COLUMNNAME_M_InOut_ID, Integer.valueOf(M_InOut_ID));
}
/** Get Shipment/Receipt.
@return Material Shipment Document */
public int getM_InOut_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_InOut_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="cf1c816b-8d93-41a5-59b5-644a59991a58")
public static String es_PE_FIELD_Order_ShipmentReceipt_Name="Entrega / Recibo";

@XendraTrl(Identifier="cf1c816b-8d93-41a5-59b5-644a59991a58")
public static String es_PE_FIELD_Order_ShipmentReceipt_Description="Entrega ó documento de recibo";

@XendraTrl(Identifier="cf1c816b-8d93-41a5-59b5-644a59991a58")
public static String es_PE_FIELD_Order_ShipmentReceipt_Help="La ID de Entrega / Recibo indica el documento único para esta entrega ó recibo";

@XendraField(AD_Column_ID="M_InOut_ID",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cf1c816b-8d93-41a5-59b5-644a59991a58")
public static final String FIELDNAME_Order_ShipmentReceipt="cf1c816b-8d93-41a5-59b5-644a59991a58";

@XendraTrl(Identifier="433a4586-3ccf-3a5c-1f92-dc2fb9825a9d")
public static String es_PE_FIELD_PurchaseOrder_ShipmentReceipt_Name="Entrega / Recibo";

@XendraTrl(Identifier="433a4586-3ccf-3a5c-1f92-dc2fb9825a9d")
public static String es_PE_FIELD_PurchaseOrder_ShipmentReceipt_Description="Entrega ó documento de recibo";

@XendraTrl(Identifier="433a4586-3ccf-3a5c-1f92-dc2fb9825a9d")
public static String es_PE_FIELD_PurchaseOrder_ShipmentReceipt_Help="La ID de Entrega / Recibo indica el documento único para esta entrega ó recibo";

@XendraField(AD_Column_ID="M_InOut_ID",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="433a4586-3ccf-3a5c-1f92-dc2fb9825a9d")
public static final String FIELDNAME_PurchaseOrder_ShipmentReceipt="433a4586-3ccf-3a5c-1f92-dc2fb9825a9d";

@XendraTrl(Identifier="3254350f-f37b-e70f-70e2-507cba9ac92e")
public static String es_PE_COLUMN_M_InOut_ID_Name="Entrega / Recibo";

@XendraColumn(AD_Element_ID="5c1a0edf-01a0-832e-098b-d49510db71db",ColumnName="M_InOut_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3254350f-f37b-e70f-70e2-507cba9ac92e",
Synchronized="2020-03-03 21:37:11.0")
/** Column name M_InOut_ID */
public static final String COLUMNNAME_M_InOut_ID = "M_InOut_ID";
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

@XendraTrl(Identifier="f9815e7f-d1e0-06c0-b51b-c33770441b96")
public static String es_PE_FIELD_Order_M_PriceList_ID_Name="Lista de Precios";

@XendraTrl(Identifier="f9815e7f-d1e0-06c0-b51b-c33770441b96")
public static String es_PE_FIELD_Order_M_PriceList_ID_Description="Identificador único de mi lista de precios";

@XendraTrl(Identifier="f9815e7f-d1e0-06c0-b51b-c33770441b96")
public static String es_PE_FIELD_Order_M_PriceList_ID_Help="Listas de precios son usadas para determinar el precio; margen y costo de artículos comprados ó vendidos.";

@XendraField(AD_Column_ID="M_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="Invoicing",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f9815e7f-d1e0-06c0-b51b-c33770441b96")
public static final String FIELDNAME_Order_M_PriceList_ID="f9815e7f-d1e0-06c0-b51b-c33770441b96";

@XendraTrl(Identifier="15717cfd-21bb-d1c3-0fda-3b6b54d66c2f")
public static String es_PE_FIELD_PurchaseOrder_M_PriceList_ID_Name="Lista de Precios";

@XendraTrl(Identifier="15717cfd-21bb-d1c3-0fda-3b6b54d66c2f")
public static String es_PE_FIELD_PurchaseOrder_M_PriceList_ID_Description="Identificador único de mi lista de precios";

@XendraTrl(Identifier="15717cfd-21bb-d1c3-0fda-3b6b54d66c2f")
public static String es_PE_FIELD_PurchaseOrder_M_PriceList_ID_Help="Listas de precios son usadas para determinar el precio; margen y costo de artículos comprados ó vendidos.";

@XendraField(AD_Column_ID="M_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="Invoicing",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="15717cfd-21bb-d1c3-0fda-3b6b54d66c2f")
public static final String FIELDNAME_PurchaseOrder_M_PriceList_ID="15717cfd-21bb-d1c3-0fda-3b6b54d66c2f";

@XendraTrl(Identifier="62d4a1be-4b61-c21e-0f12-6bd8307fa8cc")
public static String es_PE_FIELD_PartnerOrders_M_PriceList_ID_Name="Lista de Precios";

@XendraTrl(Identifier="62d4a1be-4b61-c21e-0f12-6bd8307fa8cc")
public static String es_PE_FIELD_PartnerOrders_M_PriceList_ID_Description="Identificador único de mi lista de precios";

@XendraTrl(Identifier="62d4a1be-4b61-c21e-0f12-6bd8307fa8cc")
public static String es_PE_FIELD_PartnerOrders_M_PriceList_ID_Help="Listas de precios son usadas para determinar el precio; margen y costo de artículos comprados ó vendidos.";

@XendraField(AD_Column_ID="M_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=570,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="62d4a1be-4b61-c21e-0f12-6bd8307fa8cc")
public static final String FIELDNAME_PartnerOrders_M_PriceList_ID="62d4a1be-4b61-c21e-0f12-6bd8307fa8cc";

@XendraTrl(Identifier="c4369e0b-9212-fc15-5bae-9707325ae7fc")
public static String es_PE_FIELD_Orders_M_PriceList_ID_Name="Lista de Precios";

@XendraTrl(Identifier="c4369e0b-9212-fc15-5bae-9707325ae7fc")
public static String es_PE_FIELD_Orders_M_PriceList_ID_Description="Identificador único de mi lista de precios";

@XendraTrl(Identifier="c4369e0b-9212-fc15-5bae-9707325ae7fc")
public static String es_PE_FIELD_Orders_M_PriceList_ID_Help="Listas de precios son usadas para determinar el precio; margen y costo de artículos comprados ó vendidos.";

@XendraField(AD_Column_ID="M_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="Invoicing",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=560,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c4369e0b-9212-fc15-5bae-9707325ae7fc")
public static final String FIELDNAME_Orders_M_PriceList_ID="c4369e0b-9212-fc15-5bae-9707325ae7fc";

@XendraTrl(Identifier="3823108b-33fb-aa99-cbbc-079dd0052e20")
public static String es_PE_COLUMN_M_PriceList_ID_Name="Lista de Precios";

@XendraColumn(AD_Element_ID="652afdd3-9ff1-082d-5831-6aad828e0e09",ColumnName="M_PriceList_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutOrder.priceList",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3823108b-33fb-aa99-cbbc-079dd0052e20",Synchronized="2020-03-03 21:37:11.0")
/** Column name M_PriceList_ID */
public static final String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";
/** Set Shipper.
@param M_Shipper_ID Method or manner of product delivery */
public void setM_Shipper_ID (int M_Shipper_ID)
{
if (M_Shipper_ID <= 0) set_Value (COLUMNNAME_M_Shipper_ID, null);
 else 
set_Value (COLUMNNAME_M_Shipper_ID, Integer.valueOf(M_Shipper_ID));
}
/** Get Shipper.
@return Method or manner of product delivery */
public int getM_Shipper_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Shipper_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="61802708-bdd2-cb4e-dbb5-b85baf5aa3ed")
public static String es_PE_FIELD_Order_Shipper_Name="Transportista";

@XendraTrl(Identifier="61802708-bdd2-cb4e-dbb5-b85baf5aa3ed")
public static String es_PE_FIELD_Order_Shipper_Description="Método ó manera de entrega del producto";

@XendraTrl(Identifier="61802708-bdd2-cb4e-dbb5-b85baf5aa3ed")
public static String es_PE_FIELD_Order_Shipper_Help="El transportista indica el responsable de entregar el producto";

@XendraField(AD_Column_ID="M_Shipper_ID",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="Delivery",IsDisplayed=true,
DisplayLogic="@DeliveryViaRule@='S' & @OrderType@='SO'",DisplayLength=14,IsReadOnly=false,
SeqNo=170,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="61802708-bdd2-cb4e-dbb5-b85baf5aa3ed")
public static final String FIELDNAME_Order_Shipper="61802708-bdd2-cb4e-dbb5-b85baf5aa3ed";

@XendraTrl(Identifier="5227e4e0-6d95-e40b-44f8-0dbfcfbebdfb")
public static String es_PE_FIELD_PurchaseOrder_Shipper_Name="Transportista";

@XendraTrl(Identifier="5227e4e0-6d95-e40b-44f8-0dbfcfbebdfb")
public static String es_PE_FIELD_PurchaseOrder_Shipper_Description="Método ó manera de entrega del producto";

@XendraTrl(Identifier="5227e4e0-6d95-e40b-44f8-0dbfcfbebdfb")
public static String es_PE_FIELD_PurchaseOrder_Shipper_Help="El transportista indica el responsable de entregar el producto";

@XendraField(AD_Column_ID="M_Shipper_ID",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="Delivery",IsDisplayed=true,
DisplayLogic="@DeliveryViaRule@='S'",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="5227e4e0-6d95-e40b-44f8-0dbfcfbebdfb")
public static final String FIELDNAME_PurchaseOrder_Shipper="5227e4e0-6d95-e40b-44f8-0dbfcfbebdfb";

@XendraTrl(Identifier="a92d4b9f-53b7-9263-9954-d1fd8e225651")
public static String es_PE_FIELD_PartnerOrders_Shipper_Name="Transportista";

@XendraTrl(Identifier="a92d4b9f-53b7-9263-9954-d1fd8e225651")
public static String es_PE_FIELD_PartnerOrders_Shipper_Description="Método ó manera de entrega del producto";

@XendraTrl(Identifier="a92d4b9f-53b7-9263-9954-d1fd8e225651")
public static String es_PE_FIELD_PartnerOrders_Shipper_Help="El transportista indica el responsable de entregar el producto";

@XendraField(AD_Column_ID="M_Shipper_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a92d4b9f-53b7-9263-9954-d1fd8e225651")
public static final String FIELDNAME_PartnerOrders_Shipper="a92d4b9f-53b7-9263-9954-d1fd8e225651";

@XendraTrl(Identifier="a2210b07-8976-23d4-5031-29df1fafee1d")
public static String es_PE_FIELD_Orders_Shipper_Name="Transportista";

@XendraTrl(Identifier="a2210b07-8976-23d4-5031-29df1fafee1d")
public static String es_PE_FIELD_Orders_Shipper_Description="Método ó manera de entrega del producto";

@XendraTrl(Identifier="a2210b07-8976-23d4-5031-29df1fafee1d")
public static String es_PE_FIELD_Orders_Shipper_Help="El transportista indica el responsable de entregar el producto";

@XendraField(AD_Column_ID="M_Shipper_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=300,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a2210b07-8976-23d4-5031-29df1fafee1d")
public static final String FIELDNAME_Orders_Shipper="a2210b07-8976-23d4-5031-29df1fafee1d";

@XendraTrl(Identifier="a3b73022-c342-1bb7-d2b7-b1dbc220aae8")
public static String es_PE_COLUMN_M_Shipper_ID_Name="Transportista";

@XendraColumn(AD_Element_ID="9aa20cfc-6f2b-2463-7be0-888a548ba3ad",ColumnName="M_Shipper_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a3b73022-c342-1bb7-d2b7-b1dbc220aae8",
Synchronized="2020-03-03 21:37:11.0")
/** Column name M_Shipper_ID */
public static final String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";
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

@XendraTrl(Identifier="95c29d1f-1220-9942-dda4-4e2d935b5f7b")
public static String es_PE_FIELD_Order_Warehouse_Name="Almacén";

@XendraTrl(Identifier="95c29d1f-1220-9942-dda4-4e2d935b5f7b")
public static String es_PE_FIELD_Order_Warehouse_Description="Almacén";

@XendraTrl(Identifier="95c29d1f-1220-9942-dda4-4e2d935b5f7b")
public static String es_PE_FIELD_Order_Warehouse_Help="El Almacén indica un Almacén único donde los productos son almacenados";

@XendraField(AD_Column_ID="M_Warehouse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="Delivery",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="95c29d1f-1220-9942-dda4-4e2d935b5f7b")
public static final String FIELDNAME_Order_Warehouse="95c29d1f-1220-9942-dda4-4e2d935b5f7b";

@XendraTrl(Identifier="3629a01d-6f2c-0477-682d-ff8809cf9fa8")
public static String es_PE_FIELD_PurchaseOrder_Warehouse_Name="Almacén";

@XendraTrl(Identifier="3629a01d-6f2c-0477-682d-ff8809cf9fa8")
public static String es_PE_FIELD_PurchaseOrder_Warehouse_Description="Almacén";

@XendraTrl(Identifier="3629a01d-6f2c-0477-682d-ff8809cf9fa8")
public static String es_PE_FIELD_PurchaseOrder_Warehouse_Help="El Almacén indica un Almacén único donde los productos son almacenados";

@XendraField(AD_Column_ID="M_Warehouse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="Delivery",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3629a01d-6f2c-0477-682d-ff8809cf9fa8")
public static final String FIELDNAME_PurchaseOrder_Warehouse="3629a01d-6f2c-0477-682d-ff8809cf9fa8";

@XendraTrl(Identifier="bbd9e88f-5e74-9d1c-4f82-7ce2b72aeadd")
public static String es_PE_FIELD_PartnerOrders_Warehouse_Name="Almacén";

@XendraTrl(Identifier="bbd9e88f-5e74-9d1c-4f82-7ce2b72aeadd")
public static String es_PE_FIELD_PartnerOrders_Warehouse_Description="Almacén";

@XendraTrl(Identifier="bbd9e88f-5e74-9d1c-4f82-7ce2b72aeadd")
public static String es_PE_FIELD_PartnerOrders_Warehouse_Help="El Almacén indica un Almacén único donde los productos son almacenados";

@XendraField(AD_Column_ID="M_Warehouse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=530,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bbd9e88f-5e74-9d1c-4f82-7ce2b72aeadd")
public static final String FIELDNAME_PartnerOrders_Warehouse="bbd9e88f-5e74-9d1c-4f82-7ce2b72aeadd";

@XendraTrl(Identifier="ccdd0b2c-7f62-5539-4713-74342a9ec2c9")
public static String es_PE_FIELD_Orders_Warehouse_Name="Almacén";

@XendraTrl(Identifier="ccdd0b2c-7f62-5539-4713-74342a9ec2c9")
public static String es_PE_FIELD_Orders_Warehouse_Description="Almacén";

@XendraTrl(Identifier="ccdd0b2c-7f62-5539-4713-74342a9ec2c9")
public static String es_PE_FIELD_Orders_Warehouse_Help="El Almacén indica un Almacén único donde los productos son almacenados";

@XendraField(AD_Column_ID="M_Warehouse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="Delivery",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=520,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ccdd0b2c-7f62-5539-4713-74342a9ec2c9")
public static final String FIELDNAME_Orders_Warehouse="ccdd0b2c-7f62-5539-4713-74342a9ec2c9";

@XendraTrl(Identifier="bc652af4-954e-e90e-6cd5-03b021e6c9f3")
public static String es_PE_COLUMN_M_Warehouse_ID_Name="Almacén";

@XendraColumn(AD_Element_ID="402045cd-baa5-aeaf-b148-a921dffb7821",ColumnName="M_Warehouse_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="04acc0b0-f57d-0e15-af5b-80249f6e7906",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="@IsDropShip@=Y",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="bc652af4-954e-e90e-6cd5-03b021e6c9f3",Synchronized="2020-03-03 21:37:11.0")
/** Column name M_Warehouse_ID */
public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
/** Set Payment BPartner.
@param Pay_BPartner_ID Business Partner responsible for the payment */
public void setPay_BPartner_ID (int Pay_BPartner_ID)
{
if (Pay_BPartner_ID <= 0) set_Value (COLUMNNAME_Pay_BPartner_ID, null);
 else 
set_Value (COLUMNNAME_Pay_BPartner_ID, Integer.valueOf(Pay_BPartner_ID));
}
/** Get Payment BPartner.
@return Business Partner responsible for the payment */
public int getPay_BPartner_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Pay_BPartner_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="30353fcd-713c-852b-057a-12cd9f5431b4")
public static String es_PE_FIELD_Order_PaymentBPartner_Name="Vendedor de la Linea";

@XendraTrl(Identifier="30353fcd-713c-852b-057a-12cd9f5431b4")
public static String es_PE_FIELD_Order_PaymentBPartner_Description="Socio de negocio responsable para el pago.";

@XendraField(AD_Column_ID="Pay_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=390,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="30353fcd-713c-852b-057a-12cd9f5431b4")
public static final String FIELDNAME_Order_PaymentBPartner="30353fcd-713c-852b-057a-12cd9f5431b4";

@XendraTrl(Identifier="65ea886c-4684-985c-752e-3b9284dc70ce")
public static String es_PE_FIELD_PurchaseOrder_PaymentBPartner_Name="Pagos S. Negocio";

@XendraTrl(Identifier="65ea886c-4684-985c-752e-3b9284dc70ce")
public static String es_PE_FIELD_PurchaseOrder_PaymentBPartner_Description="Socio de negocio responsable para el pago.";

@XendraField(AD_Column_ID="Pay_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="65ea886c-4684-985c-752e-3b9284dc70ce")
public static final String FIELDNAME_PurchaseOrder_PaymentBPartner="65ea886c-4684-985c-752e-3b9284dc70ce";

@XendraTrl(Identifier="223f48c8-b348-cd2b-8f6e-18700b35b1ba")
public static String es_PE_FIELD_PartnerOrders_PaymentBPartner_Name="Pagos S. Negocio";

@XendraTrl(Identifier="223f48c8-b348-cd2b-8f6e-18700b35b1ba")
public static String es_PE_FIELD_PartnerOrders_PaymentBPartner_Description="Socio de negocio responsable para el pago.";

@XendraField(AD_Column_ID="Pay_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=290,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="223f48c8-b348-cd2b-8f6e-18700b35b1ba")
public static final String FIELDNAME_PartnerOrders_PaymentBPartner="223f48c8-b348-cd2b-8f6e-18700b35b1ba";

@XendraTrl(Identifier="bbce0c6d-e718-fc85-77f4-4d489441a71b")
public static String es_PE_FIELD_Orders_PaymentBPartner_Name="Pagos S. Negocio";

@XendraTrl(Identifier="bbce0c6d-e718-fc85-77f4-4d489441a71b")
public static String es_PE_FIELD_Orders_PaymentBPartner_Description="Socio de negocio responsable para el pago.";

@XendraField(AD_Column_ID="Pay_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bbce0c6d-e718-fc85-77f4-4d489441a71b")
public static final String FIELDNAME_Orders_PaymentBPartner="bbce0c6d-e718-fc85-77f4-4d489441a71b";

@XendraTrl(Identifier="dec29d33-79e2-bc27-aaf6-facdf096383a")
public static String es_PE_COLUMN_Pay_BPartner_ID_Name="Pagos S. Negocio";

@XendraColumn(AD_Element_ID="59ce27f2-aa07-77f0-b15d-016dd8b4f243",ColumnName="Pay_BPartner_ID",
AD_Reference_ID=13,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dec29d33-79e2-bc27-aaf6-facdf096383a",
Synchronized="2020-03-03 21:37:11.0")
/** Column name Pay_BPartner_ID */
public static final String COLUMNNAME_Pay_BPartner_ID = "Pay_BPartner_ID";
/** Set Payment Location.
@param Pay_Location_ID Location of the Business Partner responsible for the payment */
public void setPay_Location_ID (int Pay_Location_ID)
{
if (Pay_Location_ID <= 0) set_Value (COLUMNNAME_Pay_Location_ID, null);
 else 
set_Value (COLUMNNAME_Pay_Location_ID, Integer.valueOf(Pay_Location_ID));
}
/** Get Payment Location.
@return Location of the Business Partner responsible for the payment */
public int getPay_Location_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Pay_Location_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c565af80-0014-2a13-4e15-728f152793ac")
public static String es_PE_FIELD_Order_PaymentLocation_Name="Localización Pago";

@XendraTrl(Identifier="c565af80-0014-2a13-4e15-728f152793ac")
public static String es_PE_FIELD_Order_PaymentLocation_Description="Localización de el socio de negocio responsable para el pago.";

@XendraField(AD_Column_ID="Pay_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c565af80-0014-2a13-4e15-728f152793ac")
public static final String FIELDNAME_Order_PaymentLocation="c565af80-0014-2a13-4e15-728f152793ac";

@XendraTrl(Identifier="00c6da59-6b3e-99c6-958d-f576f2b8017e")
public static String es_PE_FIELD_PurchaseOrder_PaymentLocation_Name="Localización Pago";

@XendraTrl(Identifier="00c6da59-6b3e-99c6-958d-f576f2b8017e")
public static String es_PE_FIELD_PurchaseOrder_PaymentLocation_Description="Localización de el socio de negocio responsable para el pago.";

@XendraField(AD_Column_ID="Pay_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="00c6da59-6b3e-99c6-958d-f576f2b8017e")
public static final String FIELDNAME_PurchaseOrder_PaymentLocation="00c6da59-6b3e-99c6-958d-f576f2b8017e";

@XendraTrl(Identifier="f7e950fa-d249-5e19-5ed0-3375aac27270")
public static String es_PE_FIELD_PartnerOrders_PaymentLocation_Name="Localización Pago";

@XendraTrl(Identifier="f7e950fa-d249-5e19-5ed0-3375aac27270")
public static String es_PE_FIELD_PartnerOrders_PaymentLocation_Description="Localización de el socio de negocio responsable para el pago.";

@XendraField(AD_Column_ID="Pay_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=300,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f7e950fa-d249-5e19-5ed0-3375aac27270")
public static final String FIELDNAME_PartnerOrders_PaymentLocation="f7e950fa-d249-5e19-5ed0-3375aac27270";

@XendraTrl(Identifier="94c15ddb-e9a1-4e6d-dc05-8351892c8216")
public static String es_PE_FIELD_Orders_PaymentLocation_Name="Localización Pago";

@XendraTrl(Identifier="94c15ddb-e9a1-4e6d-dc05-8351892c8216")
public static String es_PE_FIELD_Orders_PaymentLocation_Description="Localización de el socio de negocio responsable para el pago.";

@XendraField(AD_Column_ID="Pay_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="94c15ddb-e9a1-4e6d-dc05-8351892c8216")
public static final String FIELDNAME_Orders_PaymentLocation="94c15ddb-e9a1-4e6d-dc05-8351892c8216";

@XendraTrl(Identifier="6a1a94a4-682a-8e91-915a-18be43a1ff8e")
public static String es_PE_COLUMN_Pay_Location_ID_Name="Localización Pago";

@XendraColumn(AD_Element_ID="18e2b0ab-1213-5080-2eb3-a3689beb85be",ColumnName="Pay_Location_ID",
AD_Reference_ID=13,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6a1a94a4-682a-8e91-915a-18be43a1ff8e",
Synchronized="2020-03-03 21:37:11.0")
/** Column name Pay_Location_ID */
public static final String COLUMNNAME_Pay_Location_ID = "Pay_Location_ID";
/** Set Payment Rule.
@param PaymentRule How you pay the invoice */
public void setPaymentRule (String PaymentRule)
{
if (PaymentRule.length() > 1)
{
log.warning("Length > 1 - truncated");
PaymentRule = PaymentRule.substring(0,0);
}
set_Value (COLUMNNAME_PaymentRule, PaymentRule);
}
/** Get Payment Rule.
@return How you pay the invoice */
public String getPaymentRule() 
{
return (String)get_Value(COLUMNNAME_PaymentRule);
}

@XendraTrl(Identifier="9113ce25-91ed-765f-043b-8689f56ae220")
public static String es_PE_FIELD_Order_PaymentRule_Name="Regla de Pago";

@XendraTrl(Identifier="9113ce25-91ed-765f-043b-8689f56ae220")
public static String es_PE_FIELD_Order_PaymentRule_Description="Como se pagará la factura";

@XendraTrl(Identifier="9113ce25-91ed-765f-043b-8689f56ae220")
public static String es_PE_FIELD_Order_PaymentRule_Help="La Regla de Pagos indica el método de pago de la factura";

@XendraField(AD_Column_ID="PaymentRule",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=270,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9113ce25-91ed-765f-043b-8689f56ae220")
public static final String FIELDNAME_Order_PaymentRule="9113ce25-91ed-765f-043b-8689f56ae220";

@XendraTrl(Identifier="2e5c962a-86ef-0ca8-1513-72f4fc33415b")
public static String es_PE_FIELD_PurchaseOrder_PaymentRule_Name="Regla de Pago";

@XendraTrl(Identifier="2e5c962a-86ef-0ca8-1513-72f4fc33415b")
public static String es_PE_FIELD_PurchaseOrder_PaymentRule_Description="Como se pagará la factura";

@XendraTrl(Identifier="2e5c962a-86ef-0ca8-1513-72f4fc33415b")
public static String es_PE_FIELD_PurchaseOrder_PaymentRule_Help="La Regla de Pagos indica el método de pago de la factura";

@XendraField(AD_Column_ID="PaymentRule",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2e5c962a-86ef-0ca8-1513-72f4fc33415b")
public static final String FIELDNAME_PurchaseOrder_PaymentRule="2e5c962a-86ef-0ca8-1513-72f4fc33415b";

@XendraTrl(Identifier="8c119714-cd25-363a-6916-8b7d2c4c41f0")
public static String es_PE_FIELD_PartnerOrders_PaymentRule_Name="Regla de Pago";

@XendraTrl(Identifier="8c119714-cd25-363a-6916-8b7d2c4c41f0")
public static String es_PE_FIELD_PartnerOrders_PaymentRule_Description="Como se pagará la factura";

@XendraTrl(Identifier="8c119714-cd25-363a-6916-8b7d2c4c41f0")
public static String es_PE_FIELD_PartnerOrders_PaymentRule_Help="La Regla de Pagos indica el método de pago de la factura";

@XendraField(AD_Column_ID="PaymentRule",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=610,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8c119714-cd25-363a-6916-8b7d2c4c41f0")
public static final String FIELDNAME_PartnerOrders_PaymentRule="8c119714-cd25-363a-6916-8b7d2c4c41f0";

@XendraTrl(Identifier="1f0493cc-209e-6d78-c5ad-91628fffeca9")
public static String es_PE_FIELD_Orders_PaymentRule_Name="Regla de Pago";

@XendraTrl(Identifier="1f0493cc-209e-6d78-c5ad-91628fffeca9")
public static String es_PE_FIELD_Orders_PaymentRule_Description="Como se pagará la factura";

@XendraTrl(Identifier="1f0493cc-209e-6d78-c5ad-91628fffeca9")
public static String es_PE_FIELD_Orders_PaymentRule_Help="La Regla de Pagos indica el método de pago de la factura";

@XendraField(AD_Column_ID="PaymentRule",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=true,SeqNo=600,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1f0493cc-209e-6d78-c5ad-91628fffeca9")
public static final String FIELDNAME_Orders_PaymentRule="1f0493cc-209e-6d78-c5ad-91628fffeca9";

@XendraTrl(Identifier="701d2122-8d80-2378-2288-1745f12e77e6")
public static String es_PE_COLUMN_PaymentRule_Name="Regla de Pago";

@XendraColumn(AD_Element_ID="5074db21-c657-2d23-63dc-80f0c5f2d4cc",ColumnName="PaymentRule",
AD_Reference_ID=28,AD_Reference_Value_ID="ac003b85-a929-cc48-3def-1a8f7b1adc7b",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="B",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="@OrderType@='WP'",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="701d2122-8d80-2378-2288-1745f12e77e6",Synchronized="2020-03-03 21:37:11.0")
/** Column name PaymentRule */
public static final String COLUMNNAME_PaymentRule = "PaymentRule";
/** Set Points.
@param Points Points */
public void setPoints (BigDecimal Points)
{
set_Value (COLUMNNAME_Points, Points);
}
/** Get Points.
@return Points */
public BigDecimal getPoints() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Points);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="607ca3f3-177c-4ed4-9227-fe6d03b4cf62")
public static String es_PE_FIELD_Order_Points_Name="points";
@XendraField(AD_Column_ID="Points",
IsCentrallyMaintained=true,AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",
IsDisplayed=false,DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2016-10-06 10:29:37.0",Identifier="607ca3f3-177c-4ed4-9227-fe6d03b4cf62")
public static final String FIELDNAME_Order_Points="607ca3f3-177c-4ed4-9227-fe6d03b4cf62";

@XendraTrl(Identifier="bd75a499-cd26-a518-1297-eb75486ce5fa")
public static String es_PE_COLUMN_Points_Name="Points";

@XendraColumn(AD_Element_ID="b7851d60-f96e-369f-a20e-99a1cbd76360",ColumnName="Points",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bd75a499-cd26-a518-1297-eb75486ce5fa",
Synchronized="2020-03-03 21:37:11.0")
/** Column name Points */
public static final String COLUMNNAME_Points = "Points";
/** Set Order Reference.
@param POReference Transaction Reference Number (Sales Order, Purchase Order) of your Business Partner */
public void setPOReference (String POReference)
{
if (POReference != null && POReference.length() > 20)
{
log.warning("Length > 20 - truncated");
POReference = POReference.substring(0,19);
}
set_Value (COLUMNNAME_POReference, POReference);
}
/** Get Order Reference.
@return Transaction Reference Number (Sales Order, Purchase Order) of your Business Partner */
public String getPOReference() 
{
String value = (String)get_Value(COLUMNNAME_POReference);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="621fb777-a04f-2e07-92bb-7560dd95a158")
public static String es_PE_FIELD_Order_OrderReference_Name="Referencia de Orden de Socio";

@XendraTrl(Identifier="621fb777-a04f-2e07-92bb-7560dd95a158")
public static String es_PE_FIELD_Order_OrderReference_Description="Número de referencia de de la transacción (Orden de Venta; Orden de Compra) de su socio de negocio)";

@XendraTrl(Identifier="621fb777-a04f-2e07-92bb-7560dd95a158")
public static String es_PE_FIELD_Order_OrderReference_Help="La referencia de orden del socio de negocio es la referencia para esta transacción específica. Frecuentemente los números de orden de compras se dan para ser impresas en las facturas como una referencia más fácil. Un número estándar puede ser definido en la ventana socio de negocio (Cliente).";

@XendraField(AD_Column_ID="POReference",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="621fb777-a04f-2e07-92bb-7560dd95a158")
public static final String FIELDNAME_Order_OrderReference="621fb777-a04f-2e07-92bb-7560dd95a158";

@XendraTrl(Identifier="d9fd4ad9-0407-dbc3-5ac6-6bc515b25ae3")
public static String es_PE_FIELD_PurchaseOrder_OrderReference_Name="Referencia de Orden de Socio";

@XendraTrl(Identifier="d9fd4ad9-0407-dbc3-5ac6-6bc515b25ae3")
public static String es_PE_FIELD_PurchaseOrder_OrderReference_Description="Número de referencia de de la transacción (Orden de Venta; Orden de Compra) de su socio de negocio)";

@XendraTrl(Identifier="d9fd4ad9-0407-dbc3-5ac6-6bc515b25ae3")
public static String es_PE_FIELD_PurchaseOrder_OrderReference_Help="La referencia de orden del socio de negocio es la referencia para esta transacción específica. Frecuentemente los números de orden de compras se dan para ser impresas en las facturas como una referencia más fácil. Un número estándar puede ser definido en la ventana socio de negocio (Cliente).";

@XendraField(AD_Column_ID="POReference",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d9fd4ad9-0407-dbc3-5ac6-6bc515b25ae3")
public static final String FIELDNAME_PurchaseOrder_OrderReference="d9fd4ad9-0407-dbc3-5ac6-6bc515b25ae3";

@XendraTrl(Identifier="60d9e3e4-d5b3-159f-6260-a4b747f22715")
public static String es_PE_FIELD_PartnerOrders_OrderReference_Name="Referencia de Orden de Socio";

@XendraTrl(Identifier="60d9e3e4-d5b3-159f-6260-a4b747f22715")
public static String es_PE_FIELD_PartnerOrders_OrderReference_Description="Número de referencia de de la transacción (Orden de Venta; Orden de Compra) de su socio de negocio)";

@XendraTrl(Identifier="60d9e3e4-d5b3-159f-6260-a4b747f22715")
public static String es_PE_FIELD_PartnerOrders_OrderReference_Help="La referencia de orden del socio de negocio es la referencia para esta transacción específica. Frecuentemente los números de orden de compras se dan para ser impresas en las facturas como una referencia más fácil. Un número estándar puede ser definido en la ventana socio de negocio (Cliente).";

@XendraField(AD_Column_ID="POReference",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="60d9e3e4-d5b3-159f-6260-a4b747f22715")
public static final String FIELDNAME_PartnerOrders_OrderReference="60d9e3e4-d5b3-159f-6260-a4b747f22715";

@XendraTrl(Identifier="961941d6-8af7-c0f4-7e1d-bb48d96279b4")
public static String es_PE_FIELD_Orders_OrderReference_Name="Referencia de Orden de Socio";

@XendraTrl(Identifier="961941d6-8af7-c0f4-7e1d-bb48d96279b4")
public static String es_PE_FIELD_Orders_OrderReference_Description="Número de referencia de de la transacción (Orden de Venta; Orden de Compra) de su socio de negocio)";

@XendraTrl(Identifier="961941d6-8af7-c0f4-7e1d-bb48d96279b4")
public static String es_PE_FIELD_Orders_OrderReference_Help="La referencia de orden del socio de negocio es la referencia para esta transacción específica. Frecuentemente los números de orden de compras se dan para ser impresas en las facturas como una referencia más fácil. Un número estándar puede ser definido en la ventana socio de negocio (Cliente).";

@XendraField(AD_Column_ID="POReference",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=380,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="961941d6-8af7-c0f4-7e1d-bb48d96279b4")
public static final String FIELDNAME_Orders_OrderReference="961941d6-8af7-c0f4-7e1d-bb48d96279b4";

@XendraTrl(Identifier="bd472b12-a4ef-21a1-7fcc-7770cf3cbc87")
public static String es_PE_COLUMN_POReference_Name="Referencia de Orden de Socio";

@XendraColumn(AD_Element_ID="c3de7eea-53b7-a810-0260-1bcb037a2967",ColumnName="POReference",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="bd472b12-a4ef-21a1-7fcc-7770cf3cbc87",
Synchronized="2020-03-03 21:37:11.0")
/** Column name POReference */
public static final String COLUMNNAME_POReference = "POReference";
/** Set Posted.
@param Posted Posting status */
public void setPosted (boolean Posted)
{
set_Value (COLUMNNAME_Posted, Boolean.valueOf(Posted));
}
/** Get Posted.
@return Posting status */
public boolean isPosted() 
{
Object oo = get_Value(COLUMNNAME_Posted);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="b944ad86-5fa4-d55c-ad11-e4cc1d2783c9")
public static String es_PE_FIELD_Order_Posted_Name="Fijada";

@XendraTrl(Identifier="b944ad86-5fa4-d55c-ad11-e4cc1d2783c9")
public static String es_PE_FIELD_Order_Posted_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="b944ad86-5fa4-d55c-ad11-e4cc1d2783c9")
public static String es_PE_FIELD_Order_Posted_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraField(AD_Column_ID="Posted",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="Status",IsDisplayed=false,
DisplayLogic="@Processed@=Y & @#ShowAcct@=Y",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b944ad86-5fa4-d55c-ad11-e4cc1d2783c9")
public static final String FIELDNAME_Order_Posted="b944ad86-5fa4-d55c-ad11-e4cc1d2783c9";

@XendraTrl(Identifier="f34640ae-64f1-4d11-00f4-d2d881fa988d")
public static String es_PE_FIELD_PurchaseOrder_Posted_Name="Fijada";

@XendraTrl(Identifier="f34640ae-64f1-4d11-00f4-d2d881fa988d")
public static String es_PE_FIELD_PurchaseOrder_Posted_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="f34640ae-64f1-4d11-00f4-d2d881fa988d")
public static String es_PE_FIELD_PurchaseOrder_Posted_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraField(AD_Column_ID="Posted",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="Status",IsDisplayed=false,
DisplayLogic="@Processed@=Y & @#ShowAcct@=Y",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f34640ae-64f1-4d11-00f4-d2d881fa988d")
public static final String FIELDNAME_PurchaseOrder_Posted="f34640ae-64f1-4d11-00f4-d2d881fa988d";

@XendraTrl(Identifier="1b4696d5-c753-7639-4daa-ce54453f6b51")
public static String es_PE_FIELD_PartnerOrders_Posted_Name="Fijada";

@XendraTrl(Identifier="1b4696d5-c753-7639-4daa-ce54453f6b51")
public static String es_PE_FIELD_PartnerOrders_Posted_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="1b4696d5-c753-7639-4daa-ce54453f6b51")
public static String es_PE_FIELD_PartnerOrders_Posted_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraField(AD_Column_ID="Posted",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1b4696d5-c753-7639-4daa-ce54453f6b51")
public static final String FIELDNAME_PartnerOrders_Posted="1b4696d5-c753-7639-4daa-ce54453f6b51";

@XendraTrl(Identifier="7000a029-3a73-0c87-fe35-b088c033ae88")
public static String es_PE_FIELD_Orders_Posted_Name="Fijada";

@XendraTrl(Identifier="7000a029-3a73-0c87-fe35-b088c033ae88")
public static String es_PE_FIELD_Orders_Posted_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="7000a029-3a73-0c87-fe35-b088c033ae88")
public static String es_PE_FIELD_Orders_Posted_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraField(AD_Column_ID="Posted",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7000a029-3a73-0c87-fe35-b088c033ae88")
public static final String FIELDNAME_Orders_Posted="7000a029-3a73-0c87-fe35-b088c033ae88";

@XendraTrl(Identifier="298af9e4-a3e1-186e-7990-7fd166047c5f")
public static String es_PE_COLUMN_Posted_Name="Fijada";

@XendraColumn(AD_Element_ID="5eb52ebc-6992-12f5-b85a-e0a136df259b",ColumnName="Posted",
AD_Reference_ID=28,AD_Reference_Value_ID="d2b659dd-6c8c-baf3-fc71-0ee997273154",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="298af9e4-a3e1-186e-7990-7fd166047c5f",Synchronized="2020-03-03 21:37:11.0")
/** Column name Posted */
public static final String COLUMNNAME_Posted = "Posted";
/** Set PrinterSerial.
@param PrinterSerial PrinterSerial */
public void setPrinterSerial (String PrinterSerial)
{
if (PrinterSerial != null && PrinterSerial.length() > 60)
{
log.warning("Length > 60 - truncated");
PrinterSerial = PrinterSerial.substring(0,59);
}
set_Value (COLUMNNAME_PrinterSerial, PrinterSerial);
}
/** Get PrinterSerial.
@return PrinterSerial */
public String getPrinterSerial() 
{
String value = (String)get_Value(COLUMNNAME_PrinterSerial);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="4e8b4b64-a1c5-4824-8f15-c53203fe8ace")
public static String es_PE_FIELD_Order_PrinterSerial_Name="printerserial";

@XendraField(AD_Column_ID="PrinterSerial",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-06 10:29:37.0",
Identifier="4e8b4b64-a1c5-4824-8f15-c53203fe8ace")
public static final String FIELDNAME_Order_PrinterSerial="4e8b4b64-a1c5-4824-8f15-c53203fe8ace";

@XendraTrl(Identifier="770bcb9e-d9ed-42d6-87db-3ebf45a1f30d")
public static String es_PE_COLUMN_PrinterSerial_Name="PrinterSerial";

@XendraColumn(AD_Element_ID="04f9081d-8d9d-fc64-9b26-6f16718cae86",ColumnName="PrinterSerial",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="770bcb9e-d9ed-42d6-87db-3ebf45a1f30d",
Synchronized="2020-03-03 21:37:11.0")
/** Column name PrinterSerial */
public static final String COLUMNNAME_PrinterSerial = "PrinterSerial";
/** Set Priority.
@param PriorityRule Priority of a document */
public void setPriorityRule (String PriorityRule)
{
if (PriorityRule.length() > 1)
{
log.warning("Length > 1 - truncated");
PriorityRule = PriorityRule.substring(0,0);
}
set_Value (COLUMNNAME_PriorityRule, PriorityRule);
}
/** Get Priority.
@return Priority of a document */
public String getPriorityRule() 
{
return (String)get_Value(COLUMNNAME_PriorityRule);
}

@XendraTrl(Identifier="23d93124-2231-01fa-f7b5-d5e50cb6525e")
public static String es_PE_FIELD_Order_Priority_Name="Prioridad";

@XendraTrl(Identifier="23d93124-2231-01fa-f7b5-d5e50cb6525e")
public static String es_PE_FIELD_Order_Priority_Description="Prioridad de un documento";

@XendraTrl(Identifier="23d93124-2231-01fa-f7b5-d5e50cb6525e")
public static String es_PE_FIELD_Order_Priority_Help="La prioridad indica la importancia (alta; media; baja) de este documento";

@XendraField(AD_Column_ID="PriorityRule",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="Delivery",IsDisplayed=true,
DisplayLogic="@OrderType@='SO'",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="23d93124-2231-01fa-f7b5-d5e50cb6525e")
public static final String FIELDNAME_Order_Priority="23d93124-2231-01fa-f7b5-d5e50cb6525e";

@XendraTrl(Identifier="d22c6d8a-53b5-5cea-0d37-1ff6499f5fba")
public static String es_PE_FIELD_PurchaseOrder_Priority_Name="Prioridad";

@XendraTrl(Identifier="d22c6d8a-53b5-5cea-0d37-1ff6499f5fba")
public static String es_PE_FIELD_PurchaseOrder_Priority_Description="Prioridad de un documento";

@XendraTrl(Identifier="d22c6d8a-53b5-5cea-0d37-1ff6499f5fba")
public static String es_PE_FIELD_PurchaseOrder_Priority_Help="La prioridad indica la importancia (alta; media; baja) de este documento";

@XendraField(AD_Column_ID="PriorityRule",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="Delivery",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d22c6d8a-53b5-5cea-0d37-1ff6499f5fba")
public static final String FIELDNAME_PurchaseOrder_Priority="d22c6d8a-53b5-5cea-0d37-1ff6499f5fba";

@XendraTrl(Identifier="45a30a88-b2f2-de26-0e1f-13356640562f")
public static String es_PE_FIELD_PartnerOrders_Priority_Name="Prioridad";

@XendraTrl(Identifier="45a30a88-b2f2-de26-0e1f-13356640562f")
public static String es_PE_FIELD_PartnerOrders_Priority_Description="Prioridad de un documento";

@XendraTrl(Identifier="45a30a88-b2f2-de26-0e1f-13356640562f")
public static String es_PE_FIELD_PartnerOrders_Priority_Help="La prioridad indica la importancia (alta; media; baja) de este documento";

@XendraField(AD_Column_ID="PriorityRule",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="Delivery",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=520,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="45a30a88-b2f2-de26-0e1f-13356640562f")
public static final String FIELDNAME_PartnerOrders_Priority="45a30a88-b2f2-de26-0e1f-13356640562f";

@XendraTrl(Identifier="ba51ea14-78d2-0f33-5a53-fdafac4552de")
public static String es_PE_FIELD_Orders_Priority_Name="Prioridad";

@XendraTrl(Identifier="ba51ea14-78d2-0f33-5a53-fdafac4552de")
public static String es_PE_FIELD_Orders_Priority_Description="Prioridad de un documento";

@XendraTrl(Identifier="ba51ea14-78d2-0f33-5a53-fdafac4552de")
public static String es_PE_FIELD_Orders_Priority_Help="La prioridad indica la importancia (alta; media; baja) de este documento";

@XendraField(AD_Column_ID="PriorityRule",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=510,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ba51ea14-78d2-0f33-5a53-fdafac4552de")
public static final String FIELDNAME_Orders_Priority="ba51ea14-78d2-0f33-5a53-fdafac4552de";

@XendraTrl(Identifier="b8b67470-463d-0a63-e2ce-914896418e0f")
public static String es_PE_COLUMN_PriorityRule_Name="Prioridad";

@XendraColumn(AD_Element_ID="8ff1ec26-d036-3761-33be-8de919b0ed5c",ColumnName="PriorityRule",
AD_Reference_ID=17,AD_Reference_Value_ID="bfacaeda-bbb9-ba51-d726-52826206b4d7",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="5",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b8b67470-463d-0a63-e2ce-914896418e0f",Synchronized="2020-03-03 21:37:11.0")
/** Column name PriorityRule */
public static final String COLUMNNAME_PriorityRule = "PriorityRule";
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

@XendraTrl(Identifier="de8eb43a-b721-4cbe-7969-80ff7499bde6")
public static String es_PE_FIELD_Order_Processed_Name="Procesado";

@XendraTrl(Identifier="de8eb43a-b721-4cbe-7969-80ff7499bde6")
public static String es_PE_FIELD_Order_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="de8eb43a-b721-4cbe-7969-80ff7499bde6")
public static String es_PE_FIELD_Order_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="de8eb43a-b721-4cbe-7969-80ff7499bde6")
public static final String FIELDNAME_Order_Processed="de8eb43a-b721-4cbe-7969-80ff7499bde6";

@XendraTrl(Identifier="147d1e48-b954-03d1-972e-2ae23d29fb09")
public static String es_PE_FIELD_PurchaseOrder_Processed_Name="Procesado";

@XendraTrl(Identifier="147d1e48-b954-03d1-972e-2ae23d29fb09")
public static String es_PE_FIELD_PurchaseOrder_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="147d1e48-b954-03d1-972e-2ae23d29fb09")
public static String es_PE_FIELD_PurchaseOrder_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="147d1e48-b954-03d1-972e-2ae23d29fb09")
public static final String FIELDNAME_PurchaseOrder_Processed="147d1e48-b954-03d1-972e-2ae23d29fb09";

@XendraTrl(Identifier="01fbb24b-0b30-d153-8a8e-b2f52505ec41")
public static String es_PE_FIELD_PartnerOrders_Processed_Name="Procesado";

@XendraTrl(Identifier="01fbb24b-0b30-d153-8a8e-b2f52505ec41")
public static String es_PE_FIELD_PartnerOrders_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="01fbb24b-0b30-d153-8a8e-b2f52505ec41")
public static String es_PE_FIELD_PartnerOrders_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="01fbb24b-0b30-d153-8a8e-b2f52505ec41")
public static final String FIELDNAME_PartnerOrders_Processed="01fbb24b-0b30-d153-8a8e-b2f52505ec41";

@XendraTrl(Identifier="0e235199-f3d3-59a0-b799-400975a869dc")
public static String es_PE_FIELD_Orders_Processed_Name="Procesado";

@XendraTrl(Identifier="0e235199-f3d3-59a0-b799-400975a869dc")
public static String es_PE_FIELD_Orders_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="0e235199-f3d3-59a0-b799-400975a869dc")
public static String es_PE_FIELD_Orders_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0e235199-f3d3-59a0-b799-400975a869dc")
public static final String FIELDNAME_Orders_Processed="0e235199-f3d3-59a0-b799-400975a869dc";

@XendraTrl(Identifier="d817b472-0451-a710-ff2d-6ee0bbb66ae3")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d817b472-0451-a710-ff2d-6ee0bbb66ae3",
Synchronized="2020-03-03 21:37:11.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
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

@XendraTrl(Identifier="a87886d9-d693-e84a-5705-46012e63b422")
public static String es_PE_FIELD_Order_ProcessNow_Name="Procesar Orden";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a87886d9-d693-e84a-5705-46012e63b422")
public static final String FIELDNAME_Order_ProcessNow="a87886d9-d693-e84a-5705-46012e63b422";

@XendraTrl(Identifier="898eb61a-5d23-ba20-31b6-41d5a5e81b2a")
public static String es_PE_FIELD_PurchaseOrder_ProcessNow_Name="Procesar Orden";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="898eb61a-5d23-ba20-31b6-41d5a5e81b2a")
public static final String FIELDNAME_PurchaseOrder_ProcessNow="898eb61a-5d23-ba20-31b6-41d5a5e81b2a";

@XendraTrl(Identifier="b6a9e0f8-f842-2bb4-b70a-0c3b4784fd50")
public static String es_PE_FIELD_PartnerOrders_ProcessNow_Name="Procesar Orden";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b6a9e0f8-f842-2bb4-b70a-0c3b4784fd50")
public static final String FIELDNAME_PartnerOrders_ProcessNow="b6a9e0f8-f842-2bb4-b70a-0c3b4784fd50";

@XendraTrl(Identifier="f0502b52-726c-74d9-931d-ebdad26cfd7d")
public static String es_PE_FIELD_Orders_ProcessNow_Name="Procesar Orden";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f0502b52-726c-74d9-931d-ebdad26cfd7d")
public static final String FIELDNAME_Orders_ProcessNow="f0502b52-726c-74d9-931d-ebdad26cfd7d";

@XendraTrl(Identifier="8c7a1e7f-c3d0-9551-a124-e7ddd677a5bb")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="9eb1bbd4-415d-f589-3524-03d442fd323c",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8c7a1e7f-c3d0-9551-a124-e7ddd677a5bb",Synchronized="2020-03-03 21:37:11.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Ref_Invoice_ID.
@param Ref_Invoice_ID Ref_Invoice_ID */
public void setRef_Invoice_ID (int Ref_Invoice_ID)
{
if (Ref_Invoice_ID <= 0) set_Value (COLUMNNAME_Ref_Invoice_ID, null);
 else 
set_Value (COLUMNNAME_Ref_Invoice_ID, Integer.valueOf(Ref_Invoice_ID));
}
/** Get Ref_Invoice_ID.
@return Ref_Invoice_ID */
public int getRef_Invoice_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Ref_Invoice_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4f64dede-9405-4ce1-b600-e166443eb3f3")
public static String es_PE_FIELD_Order_Ref_Invoice_ID_Name="Referencia de Factura";

@XendraField(AD_Column_ID="Ref_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=400,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-06 10:29:37.0",
Identifier="4f64dede-9405-4ce1-b600-e166443eb3f3")
public static final String FIELDNAME_Order_Ref_Invoice_ID="4f64dede-9405-4ce1-b600-e166443eb3f3";

@XendraTrl(Identifier="45bfbebe-a26a-93d0-b22f-d4e08d1ab5cd")
public static String es_PE_COLUMN_Ref_Invoice_ID_Name="Referenced Invoice";

@XendraColumn(AD_Element_ID="e3ca474e-0bd4-06ea-5910-51930caa9bbc",ColumnName="Ref_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="7fd6a4ea-911e-151b-68bf-3a86cc5f06e3",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="45bfbebe-a26a-93d0-b22f-d4e08d1ab5cd",Synchronized="2020-03-03 21:37:11.0")
/** Column name Ref_Invoice_ID */
public static final String COLUMNNAME_Ref_Invoice_ID = "Ref_Invoice_ID";
/** Set Referenced Order.
@param Ref_Order_ID Reference to corresponding Sales/Purchase Order */
public void setRef_Order_ID (int Ref_Order_ID)
{
if (Ref_Order_ID <= 0) set_Value (COLUMNNAME_Ref_Order_ID, null);
 else 
set_Value (COLUMNNAME_Ref_Order_ID, Integer.valueOf(Ref_Order_ID));
}
/** Get Referenced Order.
@return Reference to corresponding Sales/Purchase Order */
public int getRef_Order_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Ref_Order_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e9260082-1e40-70d2-1f3b-7509aa138569")
public static String es_PE_FIELD_Order_ReferencedOrder_Name="Referencia de la Orden";

@XendraTrl(Identifier="e9260082-1e40-70d2-1f3b-7509aa138569")
public static String es_PE_FIELD_Order_ReferencedOrder_Description="Referencia para corresponder ventas/orden de compras.";

@XendraTrl(Identifier="e9260082-1e40-70d2-1f3b-7509aa138569")
public static String es_PE_FIELD_Order_ReferencedOrder_Help="La referencia de las ventas pide la línea a la línea correspondiente de la orden de compra ó viceversa.";

@XendraField(AD_Column_ID="Ref_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e9260082-1e40-70d2-1f3b-7509aa138569")
public static final String FIELDNAME_Order_ReferencedOrder="e9260082-1e40-70d2-1f3b-7509aa138569";

@XendraTrl(Identifier="712e303c-941d-fee2-fd05-2a4674d95e9a")
public static String es_PE_FIELD_PurchaseOrder_ReferencedOrder_Name="Referencia de la Orden";

@XendraTrl(Identifier="712e303c-941d-fee2-fd05-2a4674d95e9a")
public static String es_PE_FIELD_PurchaseOrder_ReferencedOrder_Description="Referencia para corresponder ventas/orden de compras.";

@XendraTrl(Identifier="712e303c-941d-fee2-fd05-2a4674d95e9a")
public static String es_PE_FIELD_PurchaseOrder_ReferencedOrder_Help="La referencia de las ventas pide la línea a la línea correspondiente de la orden de compra ó viceversa.";

@XendraField(AD_Column_ID="Ref_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="712e303c-941d-fee2-fd05-2a4674d95e9a")
public static final String FIELDNAME_PurchaseOrder_ReferencedOrder="712e303c-941d-fee2-fd05-2a4674d95e9a";

@XendraTrl(Identifier="bdb254c1-19f3-7094-501d-d73267d8f053")
public static String es_PE_FIELD_PartnerOrders_ReferencedOrder_Name="Referencia de la Orden";

@XendraTrl(Identifier="bdb254c1-19f3-7094-501d-d73267d8f053")
public static String es_PE_FIELD_PartnerOrders_ReferencedOrder_Description="Referencia para corresponder ventas/orden de compras.";

@XendraTrl(Identifier="bdb254c1-19f3-7094-501d-d73267d8f053")
public static String es_PE_FIELD_PartnerOrders_ReferencedOrder_Help="La referencia de las ventas pide la línea a la línea correspondiente de la orden de compra ó viceversa.";

@XendraField(AD_Column_ID="Ref_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=280,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bdb254c1-19f3-7094-501d-d73267d8f053")
public static final String FIELDNAME_PartnerOrders_ReferencedOrder="bdb254c1-19f3-7094-501d-d73267d8f053";

@XendraTrl(Identifier="7397fd0d-2dd9-6aa3-73e0-cc6d905e5d4d")
public static String es_PE_FIELD_Orders_ReferencedOrder_Name="Referencia de la Orden";

@XendraTrl(Identifier="7397fd0d-2dd9-6aa3-73e0-cc6d905e5d4d")
public static String es_PE_FIELD_Orders_ReferencedOrder_Description="Referencia para corresponder ventas/orden de compras.";

@XendraTrl(Identifier="7397fd0d-2dd9-6aa3-73e0-cc6d905e5d4d")
public static String es_PE_FIELD_Orders_ReferencedOrder_Help="La referencia de las ventas pide la línea a la línea correspondiente de la orden de compra ó viceversa.";

@XendraField(AD_Column_ID="Ref_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7397fd0d-2dd9-6aa3-73e0-cc6d905e5d4d")
public static final String FIELDNAME_Orders_ReferencedOrder="7397fd0d-2dd9-6aa3-73e0-cc6d905e5d4d";

@XendraTrl(Identifier="d858b766-b091-b83a-7fec-89bf1bd88d61")
public static String es_PE_COLUMN_Ref_Order_ID_Name="Referencia de la Orden";

@XendraColumn(AD_Element_ID="6de2dbe1-457b-3d85-e1ce-f56c66d2e57b",ColumnName="Ref_Order_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="0dbd9edb-94cc-bd5a-1824-0c6381e7976b",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d858b766-b091-b83a-7fec-89bf1bd88d61",Synchronized="2020-03-03 21:37:11.0")
/** Column name Ref_Order_ID */
public static final String COLUMNNAME_Ref_Order_ID = "Ref_Order_ID";
/** Set Sales Representative.
@param SalesRep_ID Sales Representative or Company Agent */
public void setSalesRep_ID (int SalesRep_ID)
{
if (SalesRep_ID < 1) throw new IllegalArgumentException ("SalesRep_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_SalesRep_ID, Integer.valueOf(SalesRep_ID));
}
/** Get Sales Representative.
@return Sales Representative or Company Agent */
public int getSalesRep_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SalesRep_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c6eef60e-9f85-839a-e869-1e4f603da5f3")
public static String es_PE_FIELD_Order_SalesRepresentative_Name="Agente Cía";

@XendraTrl(Identifier="c6eef60e-9f85-839a-e869-1e4f603da5f3")
public static String es_PE_FIELD_Order_SalesRepresentative_Description="Representante de Ventas";

@XendraTrl(Identifier="c6eef60e-9f85-839a-e869-1e4f603da5f3")
public static String es_PE_FIELD_Order_SalesRepresentative_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c6eef60e-9f85-839a-e869-1e4f603da5f3")
public static final String FIELDNAME_Order_SalesRepresentative="c6eef60e-9f85-839a-e869-1e4f603da5f3";

@XendraTrl(Identifier="00c2a5f1-af21-1250-7394-c379a0fc9da3")
public static String es_PE_FIELD_PurchaseOrder_SalesRepresentative_Name="Comprador";

@XendraTrl(Identifier="00c2a5f1-af21-1250-7394-c379a0fc9da3")
public static String es_PE_FIELD_PurchaseOrder_SalesRepresentative_Description="Comprador/ Agente";

@XendraTrl(Identifier="00c2a5f1-af21-1250-7394-c379a0fc9da3")
public static String es_PE_FIELD_PurchaseOrder_SalesRepresentative_Help="Agente de compras para el documento.";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="00c2a5f1-af21-1250-7394-c379a0fc9da3")
public static final String FIELDNAME_PurchaseOrder_SalesRepresentative="00c2a5f1-af21-1250-7394-c379a0fc9da3";

@XendraTrl(Identifier="d05602c6-50ed-3ffb-e64a-cc9f693be6d9")
public static String es_PE_FIELD_PartnerOrders_SalesRepresentative_Name="Agente Cía";

@XendraTrl(Identifier="d05602c6-50ed-3ffb-e64a-cc9f693be6d9")
public static String es_PE_FIELD_PartnerOrders_SalesRepresentative_Description="Representante de Ventas";

@XendraTrl(Identifier="d05602c6-50ed-3ffb-e64a-cc9f693be6d9")
public static String es_PE_FIELD_PartnerOrders_SalesRepresentative_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=590,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d05602c6-50ed-3ffb-e64a-cc9f693be6d9")
public static final String FIELDNAME_PartnerOrders_SalesRepresentative="d05602c6-50ed-3ffb-e64a-cc9f693be6d9";

@XendraTrl(Identifier="20e42ec9-a750-e7ca-298f-ba195040b22f")
public static String es_PE_FIELD_Orders_SalesRepresentative_Name="Agente Cía";

@XendraTrl(Identifier="20e42ec9-a750-e7ca-298f-ba195040b22f")
public static String es_PE_FIELD_Orders_SalesRepresentative_Description="Representante de Ventas";

@XendraTrl(Identifier="20e42ec9-a750-e7ca-298f-ba195040b22f")
public static String es_PE_FIELD_Orders_SalesRepresentative_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=580,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="20e42ec9-a750-e7ca-298f-ba195040b22f")
public static final String FIELDNAME_Orders_SalesRepresentative="20e42ec9-a750-e7ca-298f-ba195040b22f";

@XendraTrl(Identifier="efef7fb5-bf86-5b86-877e-2041221143cb")
public static String es_PE_COLUMN_SalesRep_ID_Name="Agente Cía";

@XendraColumn(AD_Element_ID="197a9c3a-ff10-c291-d65f-5e05a36d3710",ColumnName="SalesRep_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="15251147-a1b6-4a83-a3a5-2d3ae7db69d9",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="efef7fb5-bf86-5b86-877e-2041221143cb",Synchronized="2020-03-03 21:37:11.0")
/** Column name SalesRep_ID */
public static final String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
/** Set Send EMail.
@param SendEMail Enable sending Document EMail */
public void setSendEMail (boolean SendEMail)
{
set_Value (COLUMNNAME_SendEMail, Boolean.valueOf(SendEMail));
}
/** Get Send EMail.
@return Enable sending Document EMail */
public boolean isSendEMail() 
{
Object oo = get_Value(COLUMNNAME_SendEMail);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="c643c3c0-e609-7486-6f30-1e2b2bb6d51f")
public static String es_PE_FIELD_Order_SendEMail_Name="Envía Email";

@XendraTrl(Identifier="c643c3c0-e609-7486-6f30-1e2b2bb6d51f")
public static String es_PE_FIELD_Order_SendEMail_Description="Permite enviar el documento Email";

@XendraTrl(Identifier="c643c3c0-e609-7486-6f30-1e2b2bb6d51f")
public static String es_PE_FIELD_Order_SendEMail_Help="Envíe los email con el documento unido (ej. factura, nota de entrega, etc.)";

@XendraField(AD_Column_ID="SendEMail",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c643c3c0-e609-7486-6f30-1e2b2bb6d51f")
public static final String FIELDNAME_Order_SendEMail="c643c3c0-e609-7486-6f30-1e2b2bb6d51f";

@XendraTrl(Identifier="a1686106-3ecb-af66-6e43-fb7a325622dd")
public static String es_PE_FIELD_PurchaseOrder_SendEMail_Name="Envía Email";

@XendraTrl(Identifier="a1686106-3ecb-af66-6e43-fb7a325622dd")
public static String es_PE_FIELD_PurchaseOrder_SendEMail_Description="Permite enviar el documento Email";

@XendraTrl(Identifier="a1686106-3ecb-af66-6e43-fb7a325622dd")
public static String es_PE_FIELD_PurchaseOrder_SendEMail_Help="Envíe los email con el documento unido (ej. factura, nota de entrega, etc.)";

@XendraField(AD_Column_ID="SendEMail",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a1686106-3ecb-af66-6e43-fb7a325622dd")
public static final String FIELDNAME_PurchaseOrder_SendEMail="a1686106-3ecb-af66-6e43-fb7a325622dd";

@XendraTrl(Identifier="03bb985b-2389-110a-d526-5df25db0befb")
public static String es_PE_FIELD_PartnerOrders_SendEMail_Name="Envía Email";

@XendraTrl(Identifier="03bb985b-2389-110a-d526-5df25db0befb")
public static String es_PE_FIELD_PartnerOrders_SendEMail_Description="Permite enviar el documento Email";

@XendraTrl(Identifier="03bb985b-2389-110a-d526-5df25db0befb")
public static String es_PE_FIELD_PartnerOrders_SendEMail_Help="Envíe los email con el documento unido (ej. factura, nota de entrega, etc.)";

@XendraField(AD_Column_ID="SendEMail",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="03bb985b-2389-110a-d526-5df25db0befb")
public static final String FIELDNAME_PartnerOrders_SendEMail="03bb985b-2389-110a-d526-5df25db0befb";

@XendraTrl(Identifier="c21514ee-a829-8490-79a6-8d86cffec1b9")
public static String es_PE_FIELD_Orders_SendEMail_Name="Envía Email";

@XendraTrl(Identifier="c21514ee-a829-8490-79a6-8d86cffec1b9")
public static String es_PE_FIELD_Orders_SendEMail_Description="Permite enviar el documento Email";

@XendraTrl(Identifier="c21514ee-a829-8490-79a6-8d86cffec1b9")
public static String es_PE_FIELD_Orders_SendEMail_Help="Envíe los email con el documento unido (ej. factura, nota de entrega, etc.)";

@XendraField(AD_Column_ID="SendEMail",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c21514ee-a829-8490-79a6-8d86cffec1b9")
public static final String FIELDNAME_Orders_SendEMail="c21514ee-a829-8490-79a6-8d86cffec1b9";

@XendraTrl(Identifier="ee141399-14f5-778a-9ee9-7fa5cecb9c5d")
public static String es_PE_COLUMN_SendEMail_Name="Envía Email";

@XendraColumn(AD_Element_ID="88409dac-427a-2fc2-2bde-34430996bd43",ColumnName="SendEMail",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ee141399-14f5-778a-9ee9-7fa5cecb9c5d",
Synchronized="2020-03-03 21:37:12.0")
/** Column name SendEMail */
public static final String COLUMNNAME_SendEMail = "SendEMail";
/** Set SerialToInvoice.
@param SerialToInvoice SerialToInvoice */
public void setSerialToInvoice (String SerialToInvoice)
{
if (SerialToInvoice != null && SerialToInvoice.length() > 10)
{
log.warning("Length > 10 - truncated");
SerialToInvoice = SerialToInvoice.substring(0,9);
}
set_Value (COLUMNNAME_SerialToInvoice, SerialToInvoice);
}
/** Get SerialToInvoice.
@return SerialToInvoice */
public String getSerialToInvoice() 
{
String value = (String)get_Value(COLUMNNAME_SerialToInvoice);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="87a16040-b353-4a55-8478-1f84874a2553")
public static String es_PE_FIELD_Order_SerialToInvoice_Name="SerialToInvoice";

@XendraField(AD_Column_ID="SerialToInvoice",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-06 10:29:37.0",
Identifier="87a16040-b353-4a55-8478-1f84874a2553")
public static final String FIELDNAME_Order_SerialToInvoice="87a16040-b353-4a55-8478-1f84874a2553";

@XendraTrl(Identifier="0ae3d2f1-d9e0-442e-9f5c-402f4715551b")
public static String es_PE_COLUMN_SerialToInvoice_Name="SerialToInvoice";

@XendraColumn(AD_Element_ID="9a7d0312-31ab-4f31-8e20-2252cc062e2a",ColumnName="SerialToInvoice",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0ae3d2f1-d9e0-442e-9f5c-402f4715551b",
Synchronized="2020-03-03 21:37:12.0")
/** Column name SerialToInvoice */
public static final String COLUMNNAME_SerialToInvoice = "SerialToInvoice";
/** Set Total Lines.
@param TotalLines Total of all document lines */
public void setTotalLines (BigDecimal TotalLines)
{
if (TotalLines == null) throw new IllegalArgumentException ("TotalLines is mandatory.");
set_ValueNoCheck (COLUMNNAME_TotalLines, TotalLines);
}
/** Get Total Lines.
@return Total of all document lines */
public BigDecimal getTotalLines() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TotalLines);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="c376211b-5d0f-c864-9c53-00125eb3e2a7")
public static String es_PE_FIELD_Order_TotalLines_Name="Total de Ítems";

@XendraTrl(Identifier="c376211b-5d0f-c864-9c53-00125eb3e2a7")
public static String es_PE_FIELD_Order_TotalLines_Description="Total de todas las líneas del documento";

@XendraTrl(Identifier="c376211b-5d0f-c864-9c53-00125eb3e2a7")
public static String es_PE_FIELD_Order_TotalLines_Help="El Total total despliega el total de todas las líneas en la moneda del documento";

@XendraField(AD_Column_ID="TotalLines",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=330,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c376211b-5d0f-c864-9c53-00125eb3e2a7")
public static final String FIELDNAME_Order_TotalLines="c376211b-5d0f-c864-9c53-00125eb3e2a7";

@XendraTrl(Identifier="044a6341-6a39-0988-9cef-6e248678190b")
public static String es_PE_FIELD_PurchaseOrder_TotalLines_Name="Total de Ìtems";

@XendraTrl(Identifier="044a6341-6a39-0988-9cef-6e248678190b")
public static String es_PE_FIELD_PurchaseOrder_TotalLines_Description="Total de todas las líneas del documento";

@XendraTrl(Identifier="044a6341-6a39-0988-9cef-6e248678190b")
public static String es_PE_FIELD_PurchaseOrder_TotalLines_Help="El Total total despliega el total de todas las líneas en la moneda del documento";

@XendraField(AD_Column_ID="TotalLines",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=330,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="044a6341-6a39-0988-9cef-6e248678190b")
public static final String FIELDNAME_PurchaseOrder_TotalLines="044a6341-6a39-0988-9cef-6e248678190b";

@XendraTrl(Identifier="0034e740-952f-dbd5-1c9f-b28a8b2ffbe9")
public static String es_PE_FIELD_PartnerOrders_TotalLines_Name="Total de Líneas";

@XendraTrl(Identifier="0034e740-952f-dbd5-1c9f-b28a8b2ffbe9")
public static String es_PE_FIELD_PartnerOrders_TotalLines_Description="Total de todas las líneas del documento";

@XendraTrl(Identifier="0034e740-952f-dbd5-1c9f-b28a8b2ffbe9")
public static String es_PE_FIELD_PartnerOrders_TotalLines_Help="El Total total despliega el total de todas las líneas en la moneda del documento";

@XendraField(AD_Column_ID="TotalLines",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=650,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0034e740-952f-dbd5-1c9f-b28a8b2ffbe9")
public static final String FIELDNAME_PartnerOrders_TotalLines="0034e740-952f-dbd5-1c9f-b28a8b2ffbe9";

@XendraTrl(Identifier="5b2b7d4a-9b92-94ee-8a78-ebf346f6de8a")
public static String es_PE_FIELD_Orders_TotalLines_Name="Total de Líneas";

@XendraTrl(Identifier="5b2b7d4a-9b92-94ee-8a78-ebf346f6de8a")
public static String es_PE_FIELD_Orders_TotalLines_Description="Total de todas las líneas del documento";

@XendraTrl(Identifier="5b2b7d4a-9b92-94ee-8a78-ebf346f6de8a")
public static String es_PE_FIELD_Orders_TotalLines_Help="El Total total despliega el total de todas las líneas en la moneda del documento";

@XendraField(AD_Column_ID="TotalLines",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=660,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5b2b7d4a-9b92-94ee-8a78-ebf346f6de8a")
public static final String FIELDNAME_Orders_TotalLines="5b2b7d4a-9b92-94ee-8a78-ebf346f6de8a";

@XendraTrl(Identifier="e98c06e6-43b2-c442-5246-53bd25cf212d")
public static String es_PE_COLUMN_TotalLines_Name="Total de Líneas";

@XendraColumn(AD_Element_ID="b1a5a695-e900-bbfd-4380-df29c5444a9a",ColumnName="TotalLines",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e98c06e6-43b2-c442-5246-53bd25cf212d",
Synchronized="2020-03-03 21:37:12.0")
/** Column name TotalLines */
public static final String COLUMNNAME_TotalLines = "TotalLines";
/** Set User List 1.
@param User1_ID User defined list element #1 */
public void setUser1_ID (int User1_ID)
{
if (User1_ID <= 0) set_Value (COLUMNNAME_User1_ID, null);
 else 
set_Value (COLUMNNAME_User1_ID, Integer.valueOf(User1_ID));
}
/** Get User List 1.
@return User defined list element #1 */
public int getUser1_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_User1_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c0edcfb8-bdf3-526c-dda8-2ebb22ab8827")
public static String es_PE_FIELD_Order_UserList_Name="Usuario 1";

@XendraTrl(Identifier="c0edcfb8-bdf3-526c-dda8-2ebb22ab8827")
public static String es_PE_FIELD_Order_UserList_Description="El usuario definió el elemento # 1";

@XendraTrl(Identifier="c0edcfb8-bdf3-526c-dda8-2ebb22ab8827")
public static String es_PE_FIELD_Order_UserList_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_U1@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=310,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c0edcfb8-bdf3-526c-dda8-2ebb22ab8827")
public static final String FIELDNAME_Order_UserList="c0edcfb8-bdf3-526c-dda8-2ebb22ab8827";

@XendraTrl(Identifier="028f0e9c-6e60-eaf2-30a7-cbf8c0c5ab17")
public static String es_PE_FIELD_PurchaseOrder_UserList_Name="Usuario 1";

@XendraTrl(Identifier="028f0e9c-6e60-eaf2-30a7-cbf8c0c5ab17")
public static String es_PE_FIELD_PurchaseOrder_UserList_Description="El usuario definió el elemento # 1";

@XendraTrl(Identifier="028f0e9c-6e60-eaf2-30a7-cbf8c0c5ab17")
public static String es_PE_FIELD_PurchaseOrder_UserList_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_U1@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=290,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="028f0e9c-6e60-eaf2-30a7-cbf8c0c5ab17")
public static final String FIELDNAME_PurchaseOrder_UserList="028f0e9c-6e60-eaf2-30a7-cbf8c0c5ab17";

@XendraTrl(Identifier="f6510e10-b583-a8b1-2aac-5cd7e1027402")
public static String es_PE_FIELD_PartnerOrders_UserList_Name="Usuario 1";

@XendraTrl(Identifier="f6510e10-b583-a8b1-2aac-5cd7e1027402")
public static String es_PE_FIELD_PartnerOrders_UserList_Description="El usuario definió el elemento # 1";

@XendraTrl(Identifier="f6510e10-b583-a8b1-2aac-5cd7e1027402")
public static String es_PE_FIELD_PartnerOrders_UserList_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=320,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f6510e10-b583-a8b1-2aac-5cd7e1027402")
public static final String FIELDNAME_PartnerOrders_UserList="f6510e10-b583-a8b1-2aac-5cd7e1027402";

@XendraTrl(Identifier="9075e4ed-2787-f078-d85e-6de7af3b211a")
public static String es_PE_FIELD_Orders_UserList_Name="Usuario 1";

@XendraTrl(Identifier="9075e4ed-2787-f078-d85e-6de7af3b211a")
public static String es_PE_FIELD_Orders_UserList_Description="El usuario definió el elemento # 1";

@XendraTrl(Identifier="9075e4ed-2787-f078-d85e-6de7af3b211a")
public static String es_PE_FIELD_Orders_UserList_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9075e4ed-2787-f078-d85e-6de7af3b211a")
public static final String FIELDNAME_Orders_UserList="9075e4ed-2787-f078-d85e-6de7af3b211a";

@XendraTrl(Identifier="49f65fb2-7e19-df1c-a60b-c2c00793abc8")
public static String es_PE_COLUMN_User1_ID_Name="Usuario 1";

@XendraColumn(AD_Element_ID="07453e74-aadd-d9c9-e543-837a6fdb3094",ColumnName="User1_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="5a2fe161-044f-67cb-3791-6d615980cabb",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="49f65fb2-7e19-df1c-a60b-c2c00793abc8",Synchronized="2020-03-03 21:37:12.0")
/** Column name User1_ID */
public static final String COLUMNNAME_User1_ID = "User1_ID";
/** Set User List 2.
@param User2_ID User defined list element #2 */
public void setUser2_ID (int User2_ID)
{
if (User2_ID <= 0) set_Value (COLUMNNAME_User2_ID, null);
 else 
set_Value (COLUMNNAME_User2_ID, Integer.valueOf(User2_ID));
}
/** Get User List 2.
@return User defined list element #2 */
public int getUser2_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_User2_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="30f23189-6477-fa2d-4473-5e4e2920b06d")
public static String es_PE_FIELD_Order_UserList22_Name="Usuario 2";

@XendraTrl(Identifier="30f23189-6477-fa2d-4473-5e4e2920b06d")
public static String es_PE_FIELD_Order_UserList22_Description="El usuario definió el elemento # 2";

@XendraTrl(Identifier="30f23189-6477-fa2d-4473-5e4e2920b06d")
public static String es_PE_FIELD_Order_UserList22_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_U2@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=320,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="30f23189-6477-fa2d-4473-5e4e2920b06d")
public static final String FIELDNAME_Order_UserList22="30f23189-6477-fa2d-4473-5e4e2920b06d";

@XendraTrl(Identifier="464730e2-f4e6-195b-5f3b-0e5ad42f8ccc")
public static String es_PE_FIELD_PurchaseOrder_UserList22_Name="Usuario 2";

@XendraTrl(Identifier="464730e2-f4e6-195b-5f3b-0e5ad42f8ccc")
public static String es_PE_FIELD_PurchaseOrder_UserList22_Description="El usuario definió el elemento # 2";

@XendraTrl(Identifier="464730e2-f4e6-195b-5f3b-0e5ad42f8ccc")
public static String es_PE_FIELD_PurchaseOrder_UserList22_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_U2@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=300,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="464730e2-f4e6-195b-5f3b-0e5ad42f8ccc")
public static final String FIELDNAME_PurchaseOrder_UserList22="464730e2-f4e6-195b-5f3b-0e5ad42f8ccc";

@XendraTrl(Identifier="da744903-7e23-f32c-8a2a-c7085bc10535")
public static String es_PE_FIELD_PartnerOrders_UserList22_Name="Usuario 2";

@XendraTrl(Identifier="da744903-7e23-f32c-8a2a-c7085bc10535")
public static String es_PE_FIELD_PartnerOrders_UserList22_Description="El usuario definió el elemento # 2";

@XendraTrl(Identifier="da744903-7e23-f32c-8a2a-c7085bc10535")
public static String es_PE_FIELD_PartnerOrders_UserList22_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25507b-c18e-3f6e-d2fc-f76c0f70ae37",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=330,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="da744903-7e23-f32c-8a2a-c7085bc10535")
public static final String FIELDNAME_PartnerOrders_UserList22="da744903-7e23-f32c-8a2a-c7085bc10535";

@XendraTrl(Identifier="30286c55-678d-4f92-6170-9981896dc413")
public static String es_PE_FIELD_Orders_UserList22_Name="Usuario 2";

@XendraTrl(Identifier="30286c55-678d-4f92-6170-9981896dc413")
public static String es_PE_FIELD_Orders_UserList22_Description="El usuario definió el elemento # 2";

@XendraTrl(Identifier="30286c55-678d-4f92-6170-9981896dc413")
public static String es_PE_FIELD_Orders_UserList22_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5bc4c74c-aaca-97d3-85e9-2ffd6bbaa243",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="30286c55-678d-4f92-6170-9981896dc413")
public static final String FIELDNAME_Orders_UserList22="30286c55-678d-4f92-6170-9981896dc413";

@XendraTrl(Identifier="1c3d7894-393d-dac3-087e-fb6031a3cb2e")
public static String es_PE_COLUMN_User2_ID_Name="Usuario 2";

@XendraColumn(AD_Element_ID="1b668c90-6743-20a2-df62-576857d72c06",ColumnName="User2_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="6a357ab2-7bb6-fce4-ffee-8bdd855a77fc",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="1c3d7894-393d-dac3-087e-fb6031a3cb2e",Synchronized="2020-03-03 21:37:12.0")
/** Column name User2_ID */
public static final String COLUMNNAME_User2_ID = "User2_ID";
/** Set Volume.
@param Volume Volume of a product */
public void setVolume (BigDecimal Volume)
{
set_Value (COLUMNNAME_Volume, Volume);
}
/** Get Volume.
@return Volume of a product */
public BigDecimal getVolume() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Volume);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="c30a6fe2-c5a4-de77-ab88-1db668b089fa")
public static String es_PE_FIELD_Order_Volume_Name="Volúmen";

@XendraTrl(Identifier="c30a6fe2-c5a4-de77-ab88-1db668b089fa")
public static String es_PE_FIELD_Order_Volume_Description="Volúmen del producto";

@XendraTrl(Identifier="c30a6fe2-c5a4-de77-ab88-1db668b089fa")
public static String es_PE_FIELD_Order_Volume_Help="El Volumen indica el volumen del producto en la UM de volúmen del cliente";

@XendraField(AD_Column_ID="Volume",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c30a6fe2-c5a4-de77-ab88-1db668b089fa")
public static final String FIELDNAME_Order_Volume="c30a6fe2-c5a4-de77-ab88-1db668b089fa";

@XendraTrl(Identifier="0b21ac9c-d480-7229-1841-dba4f0903055")
public static String es_PE_FIELD_PurchaseOrder_Volume_Name="Volúmen";

@XendraTrl(Identifier="0b21ac9c-d480-7229-1841-dba4f0903055")
public static String es_PE_FIELD_PurchaseOrder_Volume_Description="Volúmen del producto";

@XendraTrl(Identifier="0b21ac9c-d480-7229-1841-dba4f0903055")
public static String es_PE_FIELD_PurchaseOrder_Volume_Help="El Volumen indica el volumen del producto en la UM de volúmen del cliente";

@XendraField(AD_Column_ID="Volume",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0b21ac9c-d480-7229-1841-dba4f0903055")
public static final String FIELDNAME_PurchaseOrder_Volume="0b21ac9c-d480-7229-1841-dba4f0903055";

@XendraTrl(Identifier="9328d19c-bb3f-6eae-4450-c9d28f8ce725")
public static String es_PE_COLUMN_Volume_Name="Volúmen";

@XendraColumn(AD_Element_ID="464c5f3e-92af-e641-7d3a-e7e5427af367",ColumnName="Volume",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9328d19c-bb3f-6eae-4450-c9d28f8ce725",
Synchronized="2020-03-03 21:37:12.0")
/** Column name Volume */
public static final String COLUMNNAME_Volume = "Volume";
/** Set Weight.
@param Weight Weight of a product */
public void setWeight (BigDecimal Weight)
{
set_Value (COLUMNNAME_Weight, Weight);
}
/** Get Weight.
@return Weight of a product */
public BigDecimal getWeight() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Weight);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="6e9b9a13-62fd-af70-b092-f3bbe02cdefd")
public static String es_PE_FIELD_Order_Weight_Name="Peso";

@XendraTrl(Identifier="6e9b9a13-62fd-af70-b092-f3bbe02cdefd")
public static String es_PE_FIELD_Order_Weight_Description="Peso del producto";

@XendraTrl(Identifier="6e9b9a13-62fd-af70-b092-f3bbe02cdefd")
public static String es_PE_FIELD_Order_Weight_Help="El peso indica el peso del producto en la UM de peso del cliente.";

@XendraField(AD_Column_ID="Weight",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6e9b9a13-62fd-af70-b092-f3bbe02cdefd")
public static final String FIELDNAME_Order_Weight="6e9b9a13-62fd-af70-b092-f3bbe02cdefd";

@XendraTrl(Identifier="00f70881-ebba-f042-7daa-4acbe98815f8")
public static String es_PE_FIELD_PurchaseOrder_Weight_Name="Peso";

@XendraTrl(Identifier="00f70881-ebba-f042-7daa-4acbe98815f8")
public static String es_PE_FIELD_PurchaseOrder_Weight_Description="Peso del producto";

@XendraTrl(Identifier="00f70881-ebba-f042-7daa-4acbe98815f8")
public static String es_PE_FIELD_PurchaseOrder_Weight_Help="El peso indica el peso del producto en la UM de peso del cliente.";

@XendraField(AD_Column_ID="Weight",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="00f70881-ebba-f042-7daa-4acbe98815f8")
public static final String FIELDNAME_PurchaseOrder_Weight="00f70881-ebba-f042-7daa-4acbe98815f8";

@XendraTrl(Identifier="9c767a64-cbef-0b4b-97e7-9b7436b3e983")
public static String es_PE_COLUMN_Weight_Name="Peso";

@XendraColumn(AD_Element_ID="712867f4-95e8-b3a8-b07b-f884a12efbb4",ColumnName="Weight",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9c767a64-cbef-0b4b-97e7-9b7436b3e983",
Synchronized="2020-03-03 21:37:12.0")
/** Column name Weight */
public static final String COLUMNNAME_Weight = "Weight";
/** Set Write-off Amount.
@param WriteOffAmt Amount to write-off */
public void setWriteOffAmt (BigDecimal WriteOffAmt)
{
set_Value (COLUMNNAME_WriteOffAmt, WriteOffAmt);
}
/** Get Write-off Amount.
@return Amount to write-off */
public BigDecimal getWriteOffAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_WriteOffAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="a251a8b4-7873-4c46-91ee-6f2d83b299d6")
public static String es_PE_FIELD_Order_Write_OffAmount_Name="Total del Ajuste";

@XendraTrl(Identifier="a251a8b4-7873-4c46-91ee-6f2d83b299d6")
public static String es_PE_FIELD_Order_Write_OffAmount_Description="Total por ajustar";

@XendraTrl(Identifier="a251a8b4-7873-4c46-91ee-6f2d83b299d6")
public static String es_PE_FIELD_Order_Write_OffAmount_Help="El Total de ajuste indica el total a ser ajustado como incobrable";

@XendraField(AD_Column_ID="WriteOffAmt",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=131089,IsReadOnly=false,SeqNo=410,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-06 10:29:37.0",
Identifier="a251a8b4-7873-4c46-91ee-6f2d83b299d6")
public static final String FIELDNAME_Order_Write_OffAmount="a251a8b4-7873-4c46-91ee-6f2d83b299d6";

@XendraTrl(Identifier="07bf2fce-3733-42ed-865c-a97cb5ba06d0")
public static String es_PE_COLUMN_WriteOffAmt_Name="Write-off Amount";

@XendraColumn(AD_Element_ID="5f70c6d6-fd9f-549c-363e-80eaef7df1c7",ColumnName="WriteOffAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="07bf2fce-3733-42ed-865c-a97cb5ba06d0",
Synchronized="2020-03-03 21:37:12.0")
/** Column name WriteOffAmt */
public static final String COLUMNNAME_WriteOffAmt = "WriteOffAmt";
/** Set WriteOffType.
@param WriteOffType WriteOffType */
public void setWriteOffType (String WriteOffType)
{
if (WriteOffType != null && WriteOffType.length() > 1)
{
log.warning("Length > 1 - truncated");
WriteOffType = WriteOffType.substring(0,0);
}
set_Value (COLUMNNAME_WriteOffType, WriteOffType);
}
/** Get WriteOffType.
@return WriteOffType */
public String getWriteOffType() 
{
return (String)get_Value(COLUMNNAME_WriteOffType);
}

@XendraTrl(Identifier="3936056b-5556-43db-84ea-d8eebbd39890")
public static String es_PE_FIELD_Order_WriteOffType_Name="writeofftype";

@XendraField(AD_Column_ID="WriteOffType",IsCentrallyMaintained=true,
AD_Tab_ID="013ae09d-8d2e-c8ec-a214-bca4be07c994",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=420,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-06 10:29:37.0",
Identifier="3936056b-5556-43db-84ea-d8eebbd39890")
public static final String FIELDNAME_Order_WriteOffType="3936056b-5556-43db-84ea-d8eebbd39890";

@XendraTrl(Identifier="d61604a7-9ea7-4aaf-a9b2-58b944ae832b")
public static String es_PE_COLUMN_WriteOffType_Name="writeofftype";

@XendraColumn(AD_Element_ID="a3610896-3017-4b8c-9f1f-e21361226f89",ColumnName="WriteOffType",
AD_Reference_ID=17,AD_Reference_Value_ID="c41b3d42-db96-44ab-af5b-5fac4c7465e6",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d61604a7-9ea7-4aaf-a9b2-58b944ae832b",Synchronized="2020-03-03 21:37:12.0")
/** Column name WriteOffType */
public static final String COLUMNNAME_WriteOffType = "WriteOffType";
}
