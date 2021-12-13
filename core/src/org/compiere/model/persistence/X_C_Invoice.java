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
/** Generated Model for C_Invoice
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Invoice extends PO
{
/** Standard Constructor
@param ctx context
@param C_Invoice_ID id
@param trxName transaction
*/
public X_C_Invoice (Properties ctx, int C_Invoice_ID, String trxName)
{
super (ctx, C_Invoice_ID, trxName);
/** if (C_Invoice_ID == 0)
{
setAdvanceBills (null);	
// N
setC_BPartner_ID (0);
setC_BPartner_Location_ID (0);
setC_Currency_ID (0);	
// @C_Currency_ID@
setC_DocType_ID (0);	
// 0
setC_DocTypeTarget_ID (0);
setC_Invoice_ID (0);
setC_PaymentTerm_ID (0);
setDateAcct (new Timestamp(System.currentTimeMillis()));	
// @SysDate@
setDateInvoiced (new Timestamp(System.currentTimeMillis()));	
// @SysDate@
setDocAction (null);	
// CO
setDocStatus (null);	
// DR
setDocumentNo (null);
setGrandTotal (Env.ZERO);	
// 0
setIsAdvance (false);	
// N
setIsApproved (false);	
// @IsApproved@
setIsDiscountPrinted (false);	
// N
setIsInDispute (false);	
// N
setIsPaid (false);	
// N
setIsPayScheduleValid (false);	
// N
setIsPrinted (false);	
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
setPaymentRule (null);	
// P
setPosted (false);	
// N
setProcessed (false);	
// N
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
public X_C_Invoice (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=318 */
public static int Table_ID=MTable.getTable_ID("C_Invoice");

@XendraTrl(Identifier="6319e76d-d14f-154d-cff7-1d12c4f3360b")
public static String es_PE_TAB_Invoice_Name="Factura";
@XendraTab(Name="Invoice",Description="",
Help="",AD_Window_ID="3732da1a-f391-e5ed-8be9-901924c85001",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="C_Invoice.IsSOTrx='N'",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="6319e76d-d14f-154d-cff7-1d12c4f3360b",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Invoice="6319e76d-d14f-154d-cff7-1d12c4f3360b";

@XendraTrl(Identifier="5f0495a2-4377-292a-4f0b-07515d2a2d73")
public static String es_PE_TAB_Invoices_Description="Todas las facturas donde el agente \"posee\" la factura, el socio de negocio ó el producto";

@XendraTrl(Identifier="5f0495a2-4377-292a-4f0b-07515d2a2d73")
public static String es_PE_TAB_Invoices_Name="Facturas";
@XendraTab(Name="Invoices",
Description="All Invoices where the Agent 'owns' the Invoice, the Business Partner or the Product",
Help="",AD_Window_ID="a9894ddd-fe3c-1c33-44c9-6f79a11cde9e",SeqNo=40,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="44660150-923b-cc7a-9555-e16f75f26498",HasTree=false,
WhereClause="(C_Invoice.SalesRep_ID=@AD_User_ID@  OR EXISTS (SELECT * FROM C_BPartner bp WHERE C_Invoice.C_BPartner_ID=bp.C_BPartner_ID   AND bp.SalesRep_ID=@AD_User_ID@) OR EXISTS  (SELECT * FROM C_InvoiceLine il INNER JOIN M_Product p ON (il.M_Product_ID=p.M_Product_ID)  WHERE C_Invoice.C_Invoice_ID=il.C_Invoice_ID AND p.SalesRep_ID=@AD_User_ID@))",
OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="5f0495a2-4377-292a-4f0b-07515d2a2d73",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Invoices="5f0495a2-4377-292a-4f0b-07515d2a2d73";

@XendraTrl(Identifier="9c7b6352-0248-15c4-ef20-aa491cc36df8")
public static String es_PE_TAB_Invoice2_Description="Factura del Cliente";

@XendraTrl(Identifier="9c7b6352-0248-15c4-ef20-aa491cc36df8")
public static String es_PE_TAB_Invoice2_Help="La pestaña Factura define los parámetros de una factura generada para un socio de negocio. Constituye una cuenta por recibir (CXR).";

@XendraTrl(Identifier="9c7b6352-0248-15c4-ef20-aa491cc36df8")
public static String es_PE_TAB_Invoice2_Name="Factura";
@XendraTab(Name="Invoice",
Description="Customer Invoice",
Help="The Invoice Tab defines the parameters of an Invoice generated for a Business Partner.  It constitutes an accounts receivable.",
AD_Window_ID="dc1a37c5-086c-c19e-c2ba-344555bfcf65",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="IsSOTrx='Y'",OrderByClause="",CommitWarning="",
AD_Process_ID="21d0d48b-fcf4-1f36-2f4b-18c62bd7b4a0",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="9c7b6352-0248-15c4-ef20-aa491cc36df8",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Invoice2="9c7b6352-0248-15c4-ef20-aa491cc36df8";

@XendraTrl(Identifier="fc809099-40cb-4b54-71a5-dfee300e0645")
public static String es_PE_TAB_Invoice3_Description="Factura del Proveedor";

@XendraTrl(Identifier="fc809099-40cb-4b54-71a5-dfee300e0645")
public static String es_PE_TAB_Invoice3_Help="La pestaña Factura define los parámetros de una factura generada por un socio de negocio. Constituye una cuenta por pagar (CXP).";

@XendraTrl(Identifier="fc809099-40cb-4b54-71a5-dfee300e0645")
public static String es_PE_TAB_Invoice3_Name="Factura";
@XendraTab(Name="Invoice",
Description="Vendor Invoice",
Help="The Invoice Tab defines the parameters of an Invoice generated by a Business Partner.  It constitutes an accounts payable.  When generating a Receipt, the receipt document type of the purchase is used - or if not used/defined the default Material Receipt Document type.",
AD_Window_ID="f7b55b8d-31bd-29ee-4626-2d3ad620dccb",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="IsSOTrx='N'",OrderByClause="",CommitWarning="",
AD_Process_ID="21d0d48b-fcf4-1f36-2f4b-18c62bd7b4a0",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="fc809099-40cb-4b54-71a5-dfee300e0645",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Invoice3="fc809099-40cb-4b54-71a5-dfee300e0645";

@XendraTrl(Identifier="29f3d906-790c-ebc8-d30e-8e67987e6645")
public static String es_PE_TAB_PartnerInvoices_Description="Facturas de Socios de Negocio";

@XendraTrl(Identifier="29f3d906-790c-ebc8-d30e-8e67987e6645")
public static String es_PE_TAB_PartnerInvoices_Name="Facturas Socios de Negocio";

@XendraTab(Name="Partner Invoices",Description="Business Partner Invoices",Help="",
AD_Window_ID="57133321-6993-bd92-eb4e-d35c10b15e95",SeqNo=40,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,
WhereClause="C_Invoice.C_BPartner_ID=@C_BPartner_ID@",OrderByClause="",CommitWarning="",
AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,
Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,IsAdvancedTab=false,
Parent_Column_ID="",Identifier="29f3d906-790c-ebc8-d30e-8e67987e6645",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_PartnerInvoices="29f3d906-790c-ebc8-d30e-8e67987e6645";

@XendraTrl(Identifier="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06")
public static String es_PE_TAB_Invoice4_Description="Selecciona Factura";

@XendraTrl(Identifier="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06")
public static String es_PE_TAB_Invoice4_Help="Selección de facturas no pagadas completamente.";

@XendraTrl(Identifier="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06")
public static String es_PE_TAB_Invoice4_Name="Factura";
@XendraTab(Name="Invoice",
Description="Select Invoice",Help="Select from invoices not fully paid.",
AD_Window_ID="bf8d2c99-7662-a183-f151-c2a2c0c2be33",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="C_Invoice.IsPaid='N' AND IsSOTrx='Y'",OrderByClause="",CommitWarning="",
AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,
Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,
Parent_Column_ID="",Identifier="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Invoice4="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06";

@XendraTrl(Identifier="25b4731f-e0c4-ebd1-8fee-a738eb684e39")
public static String es_PE_TABLE_C_Invoice_Name="Factura";

@XendraTable(Name="Invoice",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Invoice Identifier",Help="",
TableName="C_Invoice",AccessLevel="1",AD_Window_ID="dc1a37c5-086c-c19e-c2ba-344555bfcf65",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=120,IsSecurityEnabled=false,IsDeleteable=false,
IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="f7b55b8d-31bd-29ee-4626-2d3ad620dccb",ID="org.xendra.commercial",
Identifier="25b4731f-e0c4-ebd1-8fee-a738eb684e39",Synchronized="2020-11-02 17:47:29.0")
/** TableName=C_Invoice */
public static final String Table_Name="C_Invoice";


@XendraIndex(Name="c_invoice_order",Identifier="6c545302-02f9-fedb-80e1-85d3a3f0285f",
Column_Names="c_order_id",IsUnique="false",TableIdentifier="6c545302-02f9-fedb-80e1-85d3a3f0285f",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_invoice_order = "6c545302-02f9-fedb-80e1-85d3a3f0285f";


@XendraIndex(Name="c_invoice_identifier",Identifier="491241c5-e37f-47a6-830a-8aa0243d5ed6",
Column_Names="identifier",IsUnique="false",TableIdentifier="491241c5-e37f-47a6-830a-8aa0243d5ed6",
Synchronized="2020-11-02 17:47:29.0")
public static final String INDEXNAME_c_invoice_identifier = "491241c5-e37f-47a6-830a-8aa0243d5ed6";


@XendraIndex(Name="c_invoice_bpartner",Identifier="fe21d1d6-cc8e-96b7-7d56-9015fd3fb129",
Column_Names="c_bpartner_id",IsUnique="false",
TableIdentifier="fe21d1d6-cc8e-96b7-7d56-9015fd3fb129",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_invoice_bpartner = "fe21d1d6-cc8e-96b7-7d56-9015fd3fb129";


@XendraIndex(Name="c_invoice_paid",Identifier="bb657e88-1260-d71e-66ab-3a9fb6e004eb",
Column_Names="ad_client_id, ispaid",IsUnique="false",
TableIdentifier="bb657e88-1260-d71e-66ab-3a9fb6e004eb",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_invoice_paid = "bb657e88-1260-d71e-66ab-3a9fb6e004eb";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Invoice");

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
    Table_ID = MTable.getTable_ID("C_Invoice");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Invoice[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="b51cfac9-24f0-d1f9-bb5c-817d86914960")
public static String es_PE_FIELD_Invoice_TrxOrganization_Name="Organización de la Trans.";

@XendraTrl(Identifier="b51cfac9-24f0-d1f9-bb5c-817d86914960")
public static String es_PE_FIELD_Invoice_TrxOrganization_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="b51cfac9-24f0-d1f9-bb5c-817d86914960")
public static String es_PE_FIELD_Invoice_TrxOrganization_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="@$Element_OT@=Y",DisplayLength=10,IsReadOnly=false,SeqNo=400,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b51cfac9-24f0-d1f9-bb5c-817d86914960")
public static final String FIELDNAME_Invoice_TrxOrganization="b51cfac9-24f0-d1f9-bb5c-817d86914960";

@XendraTrl(Identifier="bae5c194-70cb-acb5-4c5c-3058430538db")
public static String es_PE_FIELD_Invoice_TrxOrganization2_Name="Organización de la Trans.";

@XendraTrl(Identifier="bae5c194-70cb-acb5-4c5c-3058430538db")
public static String es_PE_FIELD_Invoice_TrxOrganization2_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="bae5c194-70cb-acb5-4c5c-3058430538db")
public static String es_PE_FIELD_Invoice_TrxOrganization2_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="@$Element_OT@=Y",DisplayLength=10,IsReadOnly=false,SeqNo=380,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="bae5c194-70cb-acb5-4c5c-3058430538db")
public static final String FIELDNAME_Invoice_TrxOrganization2="bae5c194-70cb-acb5-4c5c-3058430538db";

@XendraTrl(Identifier="244b3182-bb7c-538f-10e5-be9b040d454e")
public static String es_PE_FIELD_Invoice_TrxOrganization3_Name="Organización de la Trans.";

@XendraTrl(Identifier="244b3182-bb7c-538f-10e5-be9b040d454e")
public static String es_PE_FIELD_Invoice_TrxOrganization3_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="244b3182-bb7c-538f-10e5-be9b040d454e")
public static String es_PE_FIELD_Invoice_TrxOrganization3_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_MC@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=200,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="244b3182-bb7c-538f-10e5-be9b040d454e")
public static final String FIELDNAME_Invoice_TrxOrganization3="244b3182-bb7c-538f-10e5-be9b040d454e";

@XendraTrl(Identifier="6d316f85-3802-57dd-eabb-24d1c7e55e73")
public static String es_PE_FIELD_Invoice_TrxOrganization4_Name="Organización de la Trans.";

@XendraTrl(Identifier="6d316f85-3802-57dd-eabb-24d1c7e55e73")
public static String es_PE_FIELD_Invoice_TrxOrganization4_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="6d316f85-3802-57dd-eabb-24d1c7e55e73")
public static String es_PE_FIELD_Invoice_TrxOrganization4_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6d316f85-3802-57dd-eabb-24d1c7e55e73")
public static final String FIELDNAME_Invoice_TrxOrganization4="6d316f85-3802-57dd-eabb-24d1c7e55e73";

@XendraTrl(Identifier="53f189e5-b704-e6db-4342-c1593e775838")
public static String es_PE_FIELD_PartnerInvoices_TrxOrganization_Name="Organización de la Trans.";

@XendraTrl(Identifier="53f189e5-b704-e6db-4342-c1593e775838")
public static String es_PE_FIELD_PartnerInvoices_TrxOrganization_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="53f189e5-b704-e6db-4342-c1593e775838")
public static String es_PE_FIELD_PartnerInvoices_TrxOrganization_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="53f189e5-b704-e6db-4342-c1593e775838")
public static final String FIELDNAME_PartnerInvoices_TrxOrganization="53f189e5-b704-e6db-4342-c1593e775838";

@XendraTrl(Identifier="ca646a1d-7463-94a1-6a37-12d6b238f387")
public static String es_PE_FIELD_Invoices_TrxOrganization_Name="Organización de la Trans.";

@XendraTrl(Identifier="ca646a1d-7463-94a1-6a37-12d6b238f387")
public static String es_PE_FIELD_Invoices_TrxOrganization_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="ca646a1d-7463-94a1-6a37-12d6b238f387")
public static String es_PE_FIELD_Invoices_TrxOrganization_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ca646a1d-7463-94a1-6a37-12d6b238f387")
public static final String FIELDNAME_Invoices_TrxOrganization="ca646a1d-7463-94a1-6a37-12d6b238f387";

@XendraTrl(Identifier="90047f7b-3c3b-5243-2f6a-5b6ab44b6ecf")
public static String es_PE_COLUMN_AD_OrgTrx_ID_Name="Organización de la Trans.";

@XendraColumn(AD_Element_ID="b4180358-67aa-fe55-0409-6367a60e0a2e",ColumnName="AD_OrgTrx_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="54e78591-f7f4-c613-ea27-e64b3dac5198",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="90047f7b-3c3b-5243-2f6a-5b6ab44b6ecf",Synchronized="2020-03-03 21:36:55.0")
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

@XendraTrl(Identifier="5fe7122b-157d-f83c-f422-cadd4d2107bd")
public static String es_PE_FIELD_Invoice_UserContact_Name="Usuario";

@XendraTrl(Identifier="5fe7122b-157d-f83c-f422-cadd4d2107bd")
public static String es_PE_FIELD_Invoice_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="5fe7122b-157d-f83c-f422-cadd4d2107bd")
public static String es_PE_FIELD_Invoice_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=480,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5fe7122b-157d-f83c-f422-cadd4d2107bd")
public static final String FIELDNAME_Invoice_UserContact="5fe7122b-157d-f83c-f422-cadd4d2107bd";

@XendraTrl(Identifier="03b3536c-80db-140d-8c98-3f8bc461faec")
public static String es_PE_FIELD_Invoice_UserContact2_Name="Contacto";

@XendraTrl(Identifier="03b3536c-80db-140d-8c98-3f8bc461faec")
public static String es_PE_FIELD_Invoice_UserContact2_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="03b3536c-80db-140d-8c98-3f8bc461faec")
public static String es_PE_FIELD_Invoice_UserContact2_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="03b3536c-80db-140d-8c98-3f8bc461faec")
public static final String FIELDNAME_Invoice_UserContact2="03b3536c-80db-140d-8c98-3f8bc461faec";

@XendraTrl(Identifier="5014f1ec-066d-6935-133c-808fa8a22548")
public static String es_PE_FIELD_Invoice_UserContact3_Name="Usuario";

@XendraTrl(Identifier="5014f1ec-066d-6935-133c-808fa8a22548")
public static String es_PE_FIELD_Invoice_UserContact3_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="5014f1ec-066d-6935-133c-808fa8a22548")
public static String es_PE_FIELD_Invoice_UserContact3_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5014f1ec-066d-6935-133c-808fa8a22548")
public static final String FIELDNAME_Invoice_UserContact3="5014f1ec-066d-6935-133c-808fa8a22548";

@XendraTrl(Identifier="a0352682-e7d2-a061-e3c8-c24625f62cb2")
public static String es_PE_FIELD_Invoice_UserContact4_Name="Usuario";

@XendraTrl(Identifier="a0352682-e7d2-a061-e3c8-c24625f62cb2")
public static String es_PE_FIELD_Invoice_UserContact4_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="a0352682-e7d2-a061-e3c8-c24625f62cb2")
public static String es_PE_FIELD_Invoice_UserContact4_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a0352682-e7d2-a061-e3c8-c24625f62cb2")
public static final String FIELDNAME_Invoice_UserContact4="a0352682-e7d2-a061-e3c8-c24625f62cb2";

@XendraTrl(Identifier="9b89e3a5-681f-674b-3e48-1a5d1898649f")
public static String es_PE_FIELD_PartnerInvoices_UserContact_Name="Usuario";

@XendraTrl(Identifier="9b89e3a5-681f-674b-3e48-1a5d1898649f")
public static String es_PE_FIELD_PartnerInvoices_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="9b89e3a5-681f-674b-3e48-1a5d1898649f")
public static String es_PE_FIELD_PartnerInvoices_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9b89e3a5-681f-674b-3e48-1a5d1898649f")
public static final String FIELDNAME_PartnerInvoices_UserContact="9b89e3a5-681f-674b-3e48-1a5d1898649f";

@XendraTrl(Identifier="9d26473f-9b15-1ed2-61c9-f0e43f9e569e")
public static String es_PE_FIELD_Invoices_UserContact_Name="Usuario";

@XendraTrl(Identifier="9d26473f-9b15-1ed2-61c9-f0e43f9e569e")
public static String es_PE_FIELD_Invoices_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="9d26473f-9b15-1ed2-61c9-f0e43f9e569e")
public static String es_PE_FIELD_Invoices_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9d26473f-9b15-1ed2-61c9-f0e43f9e569e")
public static final String FIELDNAME_Invoices_UserContact="9d26473f-9b15-1ed2-61c9-f0e43f9e569e";

@XendraTrl(Identifier="f365e9da-2e5c-86de-5451-75f4eb1d911d")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="f4ac36a1-4200-1386-677e-14ac90afb4fe",
FieldLength=22,DefaultValue="-1",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f365e9da-2e5c-86de-5451-75f4eb1d911d",Synchronized="2020-03-03 21:36:55.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set AdvanceBills.
@param AdvanceBills AdvanceBills */
public void setAdvanceBills (String AdvanceBills)
{
if (AdvanceBills == null) throw new IllegalArgumentException ("AdvanceBills is mandatory.");
if (AdvanceBills.length() > 1)
{
log.warning("Length > 1 - truncated");
AdvanceBills = AdvanceBills.substring(0,0);
}
set_Value (COLUMNNAME_AdvanceBills, AdvanceBills);
}
/** Get AdvanceBills.
@return AdvanceBills */
public String getAdvanceBills() 
{
return (String)get_Value(COLUMNNAME_AdvanceBills);
}

@XendraTrl(Identifier="f0b1b78a-f38d-6299-bead-3623080c9402")
public static String es_PE_FIELD_Invoice_AdvanceBills_Name="Facturas Adelanto";

@XendraField(AD_Column_ID="AdvanceBills",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f0b1b78a-f38d-6299-bead-3623080c9402")
public static final String FIELDNAME_Invoice_AdvanceBills="f0b1b78a-f38d-6299-bead-3623080c9402";

@XendraTrl(Identifier="6d972910-db0c-0faa-2208-de2900f71feb")
public static String es_PE_FIELD_Invoice_AdvanceBills2_Name="Factura Adelanto";

@XendraField(AD_Column_ID="AdvanceBills",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6d972910-db0c-0faa-2208-de2900f71feb")
public static final String FIELDNAME_Invoice_AdvanceBills2="6d972910-db0c-0faa-2208-de2900f71feb";

@XendraTrl(Identifier="f0900822-6f75-84d0-96a2-f3c1d75f3bbd")
public static String es_PE_COLUMN_AdvanceBills_Name="advancebills";

@XendraColumn(AD_Element_ID="96e62c91-1cfd-6819-e42d-fb42b24fd010",ColumnName="AdvanceBills",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="896e2298-481e-1e94-3802-d3cbf18f8194",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f0900822-6f75-84d0-96a2-f3c1d75f3bbd",Synchronized="2020-03-03 21:36:55.0")
/** Column name AdvanceBills */
public static final String COLUMNNAME_AdvanceBills = "AdvanceBills";
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

@XendraTrl(Identifier="02ac3f2f-9248-ef52-2ed7-a143c97baa26")
public static String es_PE_FIELD_Invoice_Activity_Name="Tipo de Gasto";

@XendraTrl(Identifier="02ac3f2f-9248-ef52-2ed7-a143c97baa26")
public static String es_PE_FIELD_Invoice_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="02ac3f2f-9248-ef52-2ed7-a143c97baa26")
public static String es_PE_FIELD_Invoice_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_AY@='Y'",DisplayLength=10,IsReadOnly=false,SeqNo=270,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="02ac3f2f-9248-ef52-2ed7-a143c97baa26")
public static final String FIELDNAME_Invoice_Activity="02ac3f2f-9248-ef52-2ed7-a143c97baa26";

@XendraTrl(Identifier="cea33cb7-faf5-da2a-a217-2f5bcc77c933")
public static String es_PE_FIELD_Invoice_Activity2_Name="Tipo de Gasto";

@XendraTrl(Identifier="cea33cb7-faf5-da2a-a217-2f5bcc77c933")
public static String es_PE_FIELD_Invoice_Activity2_Description="Actividad de Negocio";

@XendraTrl(Identifier="cea33cb7-faf5-da2a-a217-2f5bcc77c933")
public static String es_PE_FIELD_Invoice_Activity2_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_AY@='Y'",DisplayLength=10,IsReadOnly=false,SeqNo=270,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="cea33cb7-faf5-da2a-a217-2f5bcc77c933")
public static final String FIELDNAME_Invoice_Activity2="cea33cb7-faf5-da2a-a217-2f5bcc77c933";

@XendraTrl(Identifier="6dae76af-1344-e755-922a-8a9b8969a792")
public static String es_PE_FIELD_Invoice_Activity3_Name="Tipo de Gasto";

@XendraTrl(Identifier="6dae76af-1344-e755-922a-8a9b8969a792")
public static String es_PE_FIELD_Invoice_Activity3_Description="Actividad de Negocio";

@XendraTrl(Identifier="6dae76af-1344-e755-922a-8a9b8969a792")
public static String es_PE_FIELD_Invoice_Activity3_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_AY@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=180,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="6dae76af-1344-e755-922a-8a9b8969a792")
public static final String FIELDNAME_Invoice_Activity3="6dae76af-1344-e755-922a-8a9b8969a792";

@XendraTrl(Identifier="e65b98a1-5e14-7e86-0011-c20a10240de3")
public static String es_PE_FIELD_Invoice_Activity4_Name="Tipo de Gasto";

@XendraTrl(Identifier="e65b98a1-5e14-7e86-0011-c20a10240de3")
public static String es_PE_FIELD_Invoice_Activity4_Description="Actividad de Negocio";

@XendraTrl(Identifier="e65b98a1-5e14-7e86-0011-c20a10240de3")
public static String es_PE_FIELD_Invoice_Activity4_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e65b98a1-5e14-7e86-0011-c20a10240de3")
public static final String FIELDNAME_Invoice_Activity4="e65b98a1-5e14-7e86-0011-c20a10240de3";

@XendraTrl(Identifier="eee6d6f1-b0ac-7606-8fe0-9faf96fee0cf")
public static String es_PE_FIELD_PartnerInvoices_Activity_Name="Tipo de Gasto";

@XendraTrl(Identifier="eee6d6f1-b0ac-7606-8fe0-9faf96fee0cf")
public static String es_PE_FIELD_PartnerInvoices_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="eee6d6f1-b0ac-7606-8fe0-9faf96fee0cf")
public static String es_PE_FIELD_PartnerInvoices_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eee6d6f1-b0ac-7606-8fe0-9faf96fee0cf")
public static final String FIELDNAME_PartnerInvoices_Activity="eee6d6f1-b0ac-7606-8fe0-9faf96fee0cf";

@XendraTrl(Identifier="25e3654a-49d3-3d92-baa9-228c8f8a8d16")
public static String es_PE_FIELD_Invoices_Activity_Name="Tipo de Gasto";

@XendraTrl(Identifier="25e3654a-49d3-3d92-baa9-228c8f8a8d16")
public static String es_PE_FIELD_Invoices_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="25e3654a-49d3-3d92-baa9-228c8f8a8d16")
public static String es_PE_FIELD_Invoices_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="25e3654a-49d3-3d92-baa9-228c8f8a8d16")
public static final String FIELDNAME_Invoices_Activity="25e3654a-49d3-3d92-baa9-228c8f8a8d16";

@XendraTrl(Identifier="50fe9016-9df9-b91a-fe7d-0ad06c2a02b1")
public static String es_PE_COLUMN_C_Activity_ID_Name="Tipo de Gasto";

@XendraColumn(AD_Element_ID="bfeadbb3-d866-26e3-8eee-3e2fdf0ff753",ColumnName="C_Activity_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="079b2687-77a7-3004-9b77-18ca68ffe4fc",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="50fe9016-9df9-b91a-fe7d-0ad06c2a02b1",Synchronized="2020-03-03 21:36:55.0")
/** Column name C_Activity_ID */
public static final String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
/** Set Bill Of Exchange.
@param C_BOE_ID Bill Of Exchange Identifier */
public void setC_BOE_ID (int C_BOE_ID)
{
if (C_BOE_ID <= 0) set_Value (COLUMNNAME_C_BOE_ID, null);
 else 
set_Value (COLUMNNAME_C_BOE_ID, Integer.valueOf(C_BOE_ID));
}
/** Get Bill Of Exchange.
@return Bill Of Exchange Identifier */
public int getC_BOE_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BOE_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a067d922-8e62-52bd-effa-35b51bccba9c")
public static String es_PE_FIELD_Invoice_BillOfExchange_Name="Letra de Cambio";

@XendraTrl(Identifier="a067d922-8e62-52bd-effa-35b51bccba9c")
public static String es_PE_FIELD_Invoice_BillOfExchange_Description="Identificador de la Letra de Cambio ";

@XendraTrl(Identifier="a067d922-8e62-52bd-effa-35b51bccba9c")
public static String es_PE_FIELD_Invoice_BillOfExchange_Help="El docuemnto Letra de Cambio";

@XendraField(AD_Column_ID="C_BOE_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a067d922-8e62-52bd-effa-35b51bccba9c")
public static final String FIELDNAME_Invoice_BillOfExchange="a067d922-8e62-52bd-effa-35b51bccba9c";

@XendraTrl(Identifier="f18ba21a-e17f-b5ce-6a8b-03f3afdcfe78")
public static String es_PE_FIELD_Invoice_BillOfExchange2_Name="Letra de Cambio";

@XendraTrl(Identifier="f18ba21a-e17f-b5ce-6a8b-03f3afdcfe78")
public static String es_PE_FIELD_Invoice_BillOfExchange2_Description="Identificador de la Letra de Cambio ";

@XendraTrl(Identifier="f18ba21a-e17f-b5ce-6a8b-03f3afdcfe78")
public static String es_PE_FIELD_Invoice_BillOfExchange2_Help="El docuemnto Letra de Cambio";

@XendraField(AD_Column_ID="C_BOE_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f18ba21a-e17f-b5ce-6a8b-03f3afdcfe78")
public static final String FIELDNAME_Invoice_BillOfExchange2="f18ba21a-e17f-b5ce-6a8b-03f3afdcfe78";

@XendraTrl(Identifier="f9b735bc-98f2-e556-3fbe-234b2fd7b8bb")
public static String es_PE_COLUMN_C_BOE_ID_Name="Letra de Cambio";

@XendraColumn(AD_Element_ID="7dfa9e28-2055-cea9-fa94-b5ebdac44420",ColumnName="C_BOE_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f9b735bc-98f2-e556-3fbe-234b2fd7b8bb",
Synchronized="2020-03-03 21:36:56.0")
/** Column name C_BOE_ID */
public static final String COLUMNNAME_C_BOE_ID = "C_BOE_ID";
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

@XendraTrl(Identifier="dcefdd93-970a-e683-18fe-387b0c3ab355")
public static String es_PE_FIELD_Invoice_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="dcefdd93-970a-e683-18fe-387b0c3ab355")
public static String es_PE_FIELD_Invoice_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="dcefdd93-970a-e683-18fe-387b0c3ab355")
public static String es_PE_FIELD_Invoice_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="General",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dcefdd93-970a-e683-18fe-387b0c3ab355")
public static final String FIELDNAME_Invoice_BusinessPartner="dcefdd93-970a-e683-18fe-387b0c3ab355";

@XendraTrl(Identifier="f146b263-6e2f-a0ff-9659-7b842a197a63")
public static String es_PE_FIELD_Invoice_BusinessPartner2_Name="Socio de Negocio";

@XendraTrl(Identifier="f146b263-6e2f-a0ff-9659-7b842a197a63")
public static String es_PE_FIELD_Invoice_BusinessPartner2_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="f146b263-6e2f-a0ff-9659-7b842a197a63")
public static String es_PE_FIELD_Invoice_BusinessPartner2_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="General",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f146b263-6e2f-a0ff-9659-7b842a197a63")
public static final String FIELDNAME_Invoice_BusinessPartner2="f146b263-6e2f-a0ff-9659-7b842a197a63";

@XendraTrl(Identifier="0fa07509-f42a-d510-434b-1934d8054692")
public static String es_PE_FIELD_Invoice_BusinessPartner3_Name="Socio de Negocio";

@XendraTrl(Identifier="0fa07509-f42a-d510-434b-1934d8054692")
public static String es_PE_FIELD_Invoice_BusinessPartner3_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="0fa07509-f42a-d510-434b-1934d8054692")
public static String es_PE_FIELD_Invoice_BusinessPartner3_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0fa07509-f42a-d510-434b-1934d8054692")
public static final String FIELDNAME_Invoice_BusinessPartner3="0fa07509-f42a-d510-434b-1934d8054692";

@XendraTrl(Identifier="3631b564-96b1-8688-5788-022dd8f00e64")
public static String es_PE_FIELD_Invoice_BusinessPartner4_Name="Socio de Negocio";

@XendraTrl(Identifier="3631b564-96b1-8688-5788-022dd8f00e64")
public static String es_PE_FIELD_Invoice_BusinessPartner4_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="3631b564-96b1-8688-5788-022dd8f00e64")
public static String es_PE_FIELD_Invoice_BusinessPartner4_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3631b564-96b1-8688-5788-022dd8f00e64")
public static final String FIELDNAME_Invoice_BusinessPartner4="3631b564-96b1-8688-5788-022dd8f00e64";

@XendraTrl(Identifier="b78e9bd6-7f9b-ab69-53bf-3d26c6079ee9")
public static String es_PE_FIELD_PartnerInvoices_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="b78e9bd6-7f9b-ab69-53bf-3d26c6079ee9")
public static String es_PE_FIELD_PartnerInvoices_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="b78e9bd6-7f9b-ab69-53bf-3d26c6079ee9")
public static String es_PE_FIELD_PartnerInvoices_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b78e9bd6-7f9b-ab69-53bf-3d26c6079ee9")
public static final String FIELDNAME_PartnerInvoices_BusinessPartner="b78e9bd6-7f9b-ab69-53bf-3d26c6079ee9";

@XendraTrl(Identifier="ddd7196b-fbfd-a105-5cca-758bdb1eee8a")
public static String es_PE_FIELD_Invoices_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="ddd7196b-fbfd-a105-5cca-758bdb1eee8a")
public static String es_PE_FIELD_Invoices_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="ddd7196b-fbfd-a105-5cca-758bdb1eee8a")
public static String es_PE_FIELD_Invoices_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ddd7196b-fbfd-a105-5cca-758bdb1eee8a")
public static final String FIELDNAME_Invoices_BusinessPartner="ddd7196b-fbfd-a105-5cca-758bdb1eee8a";

@XendraTrl(Identifier="50aca6af-e889-5da3-d682-dad8a89b5e34")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="06fdbbe9-e1c4-3ee4-4a9d-73d1a990cc42",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutInvoice.bPartner",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="50aca6af-e889-5da3-d682-dad8a89b5e34",
Synchronized="2020-03-03 21:36:56.0")
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

@XendraTrl(Identifier="e5a90f78-7769-3ce7-f22d-ad7986064568")
public static String es_PE_FIELD_Invoice_PartnerLocation_Name="Dirección Socio del Negocio";

@XendraTrl(Identifier="e5a90f78-7769-3ce7-f22d-ad7986064568")
public static String es_PE_FIELD_Invoice_PartnerLocation_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="e5a90f78-7769-3ce7-f22d-ad7986064568")
public static String es_PE_FIELD_Invoice_PartnerLocation_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="General",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e5a90f78-7769-3ce7-f22d-ad7986064568")
public static final String FIELDNAME_Invoice_PartnerLocation="e5a90f78-7769-3ce7-f22d-ad7986064568";

@XendraTrl(Identifier="a66bacf9-13a3-f50d-f13e-042392f2f631")
public static String es_PE_FIELD_Invoice_PartnerLocation2_Name="Dirección Socio del Negocio";

@XendraTrl(Identifier="a66bacf9-13a3-f50d-f13e-042392f2f631")
public static String es_PE_FIELD_Invoice_PartnerLocation2_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="a66bacf9-13a3-f50d-f13e-042392f2f631")
public static String es_PE_FIELD_Invoice_PartnerLocation2_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="General",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a66bacf9-13a3-f50d-f13e-042392f2f631")
public static final String FIELDNAME_Invoice_PartnerLocation2="a66bacf9-13a3-f50d-f13e-042392f2f631";

@XendraTrl(Identifier="f0b63b8d-eca2-9bcf-942b-7feaee8633f4")
public static String es_PE_FIELD_Invoice_PartnerLocation3_Name="Dirección del Socio del Negocio";

@XendraTrl(Identifier="f0b63b8d-eca2-9bcf-942b-7feaee8633f4")
public static String es_PE_FIELD_Invoice_PartnerLocation3_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="f0b63b8d-eca2-9bcf-942b-7feaee8633f4")
public static String es_PE_FIELD_Invoice_PartnerLocation3_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f0b63b8d-eca2-9bcf-942b-7feaee8633f4")
public static final String FIELDNAME_Invoice_PartnerLocation3="f0b63b8d-eca2-9bcf-942b-7feaee8633f4";

@XendraTrl(Identifier="9358af5c-4c4b-6fb7-6079-7765c99798fc")
public static String es_PE_FIELD_Invoice_PartnerLocation4_Name="Dirección del Socio del Negocio";

@XendraTrl(Identifier="9358af5c-4c4b-6fb7-6079-7765c99798fc")
public static String es_PE_FIELD_Invoice_PartnerLocation4_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="9358af5c-4c4b-6fb7-6079-7765c99798fc")
public static String es_PE_FIELD_Invoice_PartnerLocation4_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9358af5c-4c4b-6fb7-6079-7765c99798fc")
public static final String FIELDNAME_Invoice_PartnerLocation4="9358af5c-4c4b-6fb7-6079-7765c99798fc";

@XendraTrl(Identifier="8a4eb3a2-7cdc-239e-0fcc-3d17264ae414")
public static String es_PE_FIELD_PartnerInvoices_PartnerLocation_Name="Dirección del Socio del Negocio";

@XendraTrl(Identifier="8a4eb3a2-7cdc-239e-0fcc-3d17264ae414")
public static String es_PE_FIELD_PartnerInvoices_PartnerLocation_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="8a4eb3a2-7cdc-239e-0fcc-3d17264ae414")
public static String es_PE_FIELD_PartnerInvoices_PartnerLocation_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8a4eb3a2-7cdc-239e-0fcc-3d17264ae414")
public static final String FIELDNAME_PartnerInvoices_PartnerLocation="8a4eb3a2-7cdc-239e-0fcc-3d17264ae414";

@XendraTrl(Identifier="fda7bd9f-c894-d201-dd32-22ac97ed9280")
public static String es_PE_FIELD_Invoices_PartnerLocation_Name="Dirección del Socio del Negocio";

@XendraTrl(Identifier="fda7bd9f-c894-d201-dd32-22ac97ed9280")
public static String es_PE_FIELD_Invoices_PartnerLocation_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="fda7bd9f-c894-d201-dd32-22ac97ed9280")
public static String es_PE_FIELD_Invoices_PartnerLocation_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fda7bd9f-c894-d201-dd32-22ac97ed9280")
public static final String FIELDNAME_Invoices_PartnerLocation="fda7bd9f-c894-d201-dd32-22ac97ed9280";

@XendraTrl(Identifier="c92d3fb8-0a4a-4f0b-89ab-df81a491eb5a")
public static String es_PE_COLUMN_C_BPartner_Location_ID_Name="Dirección del Socio del Negocio";

@XendraColumn(AD_Element_ID="0dab7dc6-2832-26dc-2462-cba2d40235f2",
ColumnName="C_BPartner_Location_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",
AD_Val_Rule_ID="3b3664f5-7792-d41b-d8c1-1ed3b015f0c1",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c92d3fb8-0a4a-4f0b-89ab-df81a491eb5a",
Synchronized="2020-03-03 21:36:56.0")
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

@XendraTrl(Identifier="348ad3cb-387a-41d6-85f3-0f2011a14811")
public static String es_PE_FIELD_Invoice_C_BPartner_Points_Name="C_BPartner_Points";

@XendraField(AD_Column_ID="C_BPartner_Points_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=490,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-06 14:47:14.0",
Identifier="348ad3cb-387a-41d6-85f3-0f2011a14811")
public static final String FIELDNAME_Invoice_C_BPartner_Points="348ad3cb-387a-41d6-85f3-0f2011a14811";

@XendraTrl(Identifier="47222a6f-7595-4f34-b136-aeadd202b17a")
public static String es_PE_FIELD_Invoice_C_BPartner_Points2_Name="C_BPartner_Points";

@XendraField(AD_Column_ID="C_BPartner_Points_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-08-30 18:45:38.0",
Identifier="47222a6f-7595-4f34-b136-aeadd202b17a")
public static final String FIELDNAME_Invoice_C_BPartner_Points2="47222a6f-7595-4f34-b136-aeadd202b17a";

@XendraTrl(Identifier="4a7d1615-e69b-bcb7-67b3-5445289b98a0")
public static String es_PE_COLUMN_C_BPartner_Points_ID_Name="C_BPartner_Points";

@XendraColumn(AD_Element_ID="39cfb606-316a-6599-66d3-370ec34b7098",
ColumnName="C_BPartner_Points_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="ed87c3fe-720d-c26d-0166-b5178b65db41",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="4a7d1615-e69b-bcb7-67b3-5445289b98a0",
Synchronized="2020-03-03 21:36:56.0")
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

@XendraTrl(Identifier="66781968-33e8-2ded-35bf-c2e77f095919")
public static String es_PE_FIELD_Invoice_Campaign_Name="Campaña";

@XendraTrl(Identifier="66781968-33e8-2ded-35bf-c2e77f095919")
public static String es_PE_FIELD_Invoice_Campaign_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="66781968-33e8-2ded-35bf-c2e77f095919")
public static String es_PE_FIELD_Invoice_Campaign_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="Reference",IsDisplayed=false,
DisplayLogic="@$Element_MC@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="66781968-33e8-2ded-35bf-c2e77f095919")
public static final String FIELDNAME_Invoice_Campaign="66781968-33e8-2ded-35bf-c2e77f095919";

@XendraTrl(Identifier="c0ee6d42-e5bc-947a-d200-1b43dc1d1a88")
public static String es_PE_FIELD_Invoice_Campaign2_Name="Centro de Costo";

@XendraTrl(Identifier="c0ee6d42-e5bc-947a-d200-1b43dc1d1a88")
public static String es_PE_FIELD_Invoice_Campaign2_Description="Campaña de Mercadeo OJO---------para prueba se esta cambiando a centro de costo--------";

@XendraTrl(Identifier="c0ee6d42-e5bc-947a-d200-1b43dc1d1a88")
public static String es_PE_FIELD_Invoice_Campaign2_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_MC@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c0ee6d42-e5bc-947a-d200-1b43dc1d1a88")
public static final String FIELDNAME_Invoice_Campaign2="c0ee6d42-e5bc-947a-d200-1b43dc1d1a88";

@XendraTrl(Identifier="f2c66e52-9b4a-0483-f515-3d0de7ebdb7e")
public static String es_PE_FIELD_Invoice_Campaign3_Name="Campaña";

@XendraTrl(Identifier="f2c66e52-9b4a-0483-f515-3d0de7ebdb7e")
public static String es_PE_FIELD_Invoice_Campaign3_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="f2c66e52-9b4a-0483-f515-3d0de7ebdb7e")
public static String es_PE_FIELD_Invoice_Campaign3_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_MC@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=190,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f2c66e52-9b4a-0483-f515-3d0de7ebdb7e")
public static final String FIELDNAME_Invoice_Campaign3="f2c66e52-9b4a-0483-f515-3d0de7ebdb7e";

@XendraTrl(Identifier="23059e8d-1151-9f15-c963-3c0591e5b8d2")
public static String es_PE_FIELD_Invoice_Campaign4_Name="Campaña";

@XendraTrl(Identifier="23059e8d-1151-9f15-c963-3c0591e5b8d2")
public static String es_PE_FIELD_Invoice_Campaign4_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="23059e8d-1151-9f15-c963-3c0591e5b8d2")
public static String es_PE_FIELD_Invoice_Campaign4_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="23059e8d-1151-9f15-c963-3c0591e5b8d2")
public static final String FIELDNAME_Invoice_Campaign4="23059e8d-1151-9f15-c963-3c0591e5b8d2";

@XendraTrl(Identifier="0d84dc7c-f854-5c07-b3d6-e56aafa2ca26")
public static String es_PE_FIELD_PartnerInvoices_Campaign_Name="Campaña";

@XendraTrl(Identifier="0d84dc7c-f854-5c07-b3d6-e56aafa2ca26")
public static String es_PE_FIELD_PartnerInvoices_Campaign_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="0d84dc7c-f854-5c07-b3d6-e56aafa2ca26")
public static String es_PE_FIELD_PartnerInvoices_Campaign_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0d84dc7c-f854-5c07-b3d6-e56aafa2ca26")
public static final String FIELDNAME_PartnerInvoices_Campaign="0d84dc7c-f854-5c07-b3d6-e56aafa2ca26";

@XendraTrl(Identifier="e5148102-7b5f-885c-50a0-b63c491b476f")
public static String es_PE_FIELD_Invoices_Campaign_Name="Campaña";

@XendraTrl(Identifier="e5148102-7b5f-885c-50a0-b63c491b476f")
public static String es_PE_FIELD_Invoices_Campaign_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="e5148102-7b5f-885c-50a0-b63c491b476f")
public static String es_PE_FIELD_Invoices_Campaign_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e5148102-7b5f-885c-50a0-b63c491b476f")
public static final String FIELDNAME_Invoices_Campaign="e5148102-7b5f-885c-50a0-b63c491b476f";

@XendraTrl(Identifier="7b24e10e-b422-3d73-f034-1326e96ef371")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaña";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="8e0d532d-2e55-9877-ef0b-a5950455e031",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7b24e10e-b422-3d73-f034-1326e96ef371",Synchronized="2020-03-03 21:36:56.0")
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

@XendraTrl(Identifier="7681a6f8-8886-b8ee-0ffe-391c5cbf4a09")
public static String es_PE_FIELD_Invoice_CashJournalLine_Name="Item del Diario de Efectivo";

@XendraTrl(Identifier="7681a6f8-8886-b8ee-0ffe-391c5cbf4a09")
public static String es_PE_FIELD_Invoice_CashJournalLine_Description="Item del diario de efectivo";

@XendraTrl(Identifier="7681a6f8-8886-b8ee-0ffe-391c5cbf4a09")
public static String es_PE_FIELD_Invoice_CashJournalLine_Help="Identifica un Item único en un diario de efectivo.";

@XendraField(AD_Column_ID="C_CashLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7681a6f8-8886-b8ee-0ffe-391c5cbf4a09")
public static final String FIELDNAME_Invoice_CashJournalLine="7681a6f8-8886-b8ee-0ffe-391c5cbf4a09";

@XendraTrl(Identifier="7023cb24-1551-4565-0cb7-9f0494fd616f")
public static String es_PE_FIELD_Invoice_CashJournalLine2_Name="Item del Diario de Efectivo";

@XendraTrl(Identifier="7023cb24-1551-4565-0cb7-9f0494fd616f")
public static String es_PE_FIELD_Invoice_CashJournalLine2_Description="Item del diario de efectivo";

@XendraTrl(Identifier="7023cb24-1551-4565-0cb7-9f0494fd616f")
public static String es_PE_FIELD_Invoice_CashJournalLine2_Help="Identifica un Item único en un diario de efectivo.";

@XendraField(AD_Column_ID="C_CashLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7023cb24-1551-4565-0cb7-9f0494fd616f")
public static final String FIELDNAME_Invoice_CashJournalLine2="7023cb24-1551-4565-0cb7-9f0494fd616f";

@XendraTrl(Identifier="2b9f1522-5253-c35f-b75b-028a3838e46f")
public static String es_PE_FIELD_Invoice_CashJournalLine3_Name="Item del Diario de Efectivo";

@XendraTrl(Identifier="2b9f1522-5253-c35f-b75b-028a3838e46f")
public static String es_PE_FIELD_Invoice_CashJournalLine3_Description="Item del diario de efectivo";

@XendraTrl(Identifier="2b9f1522-5253-c35f-b75b-028a3838e46f")
public static String es_PE_FIELD_Invoice_CashJournalLine3_Help="Identifica un Item único en un diario de efectivo.";

@XendraField(AD_Column_ID="C_CashLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2b9f1522-5253-c35f-b75b-028a3838e46f")
public static final String FIELDNAME_Invoice_CashJournalLine3="2b9f1522-5253-c35f-b75b-028a3838e46f";

@XendraTrl(Identifier="4c512e38-7fd9-c916-cc47-c308d7e7db5e")
public static String es_PE_FIELD_Invoice_CashJournalLine4_Name="Item del Diario de Efectivo";

@XendraTrl(Identifier="4c512e38-7fd9-c916-cc47-c308d7e7db5e")
public static String es_PE_FIELD_Invoice_CashJournalLine4_Description="Item del diario de efectivo";

@XendraTrl(Identifier="4c512e38-7fd9-c916-cc47-c308d7e7db5e")
public static String es_PE_FIELD_Invoice_CashJournalLine4_Help="Identifica un Item único en un diario de efectivo.";

@XendraField(AD_Column_ID="C_CashLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4c512e38-7fd9-c916-cc47-c308d7e7db5e")
public static final String FIELDNAME_Invoice_CashJournalLine4="4c512e38-7fd9-c916-cc47-c308d7e7db5e";

@XendraTrl(Identifier="42a2a65c-a16f-a437-5a84-ccc458f88a81")
public static String es_PE_FIELD_PartnerInvoices_CashJournalLine_Name="Item del Diario de Efectivo";

@XendraTrl(Identifier="42a2a65c-a16f-a437-5a84-ccc458f88a81")
public static String es_PE_FIELD_PartnerInvoices_CashJournalLine_Description="Item del diario de efectivo";

@XendraTrl(Identifier="42a2a65c-a16f-a437-5a84-ccc458f88a81")
public static String es_PE_FIELD_PartnerInvoices_CashJournalLine_Help="Identifica un Item único en un diario de efectivo.";

@XendraField(AD_Column_ID="C_CashLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="42a2a65c-a16f-a437-5a84-ccc458f88a81")
public static final String FIELDNAME_PartnerInvoices_CashJournalLine="42a2a65c-a16f-a437-5a84-ccc458f88a81";

@XendraTrl(Identifier="13e72862-a494-3866-582e-f54f0ad3df9d")
public static String es_PE_FIELD_Invoices_CashJournalLine_Name="Item del Diario de Efectivo";

@XendraTrl(Identifier="13e72862-a494-3866-582e-f54f0ad3df9d")
public static String es_PE_FIELD_Invoices_CashJournalLine_Description="Item del diario de efectivo";

@XendraTrl(Identifier="13e72862-a494-3866-582e-f54f0ad3df9d")
public static String es_PE_FIELD_Invoices_CashJournalLine_Help="Identifica un Item único en un diario de efectivo.";

@XendraField(AD_Column_ID="C_CashLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="13e72862-a494-3866-582e-f54f0ad3df9d")
public static final String FIELDNAME_Invoices_CashJournalLine="13e72862-a494-3866-582e-f54f0ad3df9d";

@XendraTrl(Identifier="6546283c-fd57-5f64-24db-36d98bfb17e0")
public static String es_PE_COLUMN_C_CashLine_ID_Name="Línea del Diario de Efectivo";

@XendraColumn(AD_Element_ID="51d71f75-4ff8-51c4-df6f-191def6be399",ColumnName="C_CashLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6546283c-fd57-5f64-24db-36d98bfb17e0",
Synchronized="2020-03-03 21:36:56.0")
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

@XendraTrl(Identifier="31a814a8-dc80-feae-0165-81e689f4c32a")
public static String es_PE_FIELD_Invoice_Charge_Name="Cargo";

@XendraTrl(Identifier="31a814a8-dc80-feae-0165-81e689f4c32a")
public static String es_PE_FIELD_Invoice_Charge_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="31a814a8-dc80-feae-0165-81e689f4c32a")
public static String es_PE_FIELD_Invoice_Charge_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@HasCharges@='Y'",DisplayLength=10,IsReadOnly=false,SeqNo=180,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="31a814a8-dc80-feae-0165-81e689f4c32a")
public static final String FIELDNAME_Invoice_Charge="31a814a8-dc80-feae-0165-81e689f4c32a";

@XendraTrl(Identifier="7d2c0f4f-08a9-0850-fba3-e3ba8a065285")
public static String es_PE_FIELD_Invoice_Charge2_Name="Cargo";

@XendraTrl(Identifier="7d2c0f4f-08a9-0850-fba3-e3ba8a065285")
public static String es_PE_FIELD_Invoice_Charge2_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="7d2c0f4f-08a9-0850-fba3-e3ba8a065285")
public static String es_PE_FIELD_Invoice_Charge2_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@HasCharges@='Y'",DisplayLength=10,IsReadOnly=false,SeqNo=180,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="7d2c0f4f-08a9-0850-fba3-e3ba8a065285")
public static final String FIELDNAME_Invoice_Charge2="7d2c0f4f-08a9-0850-fba3-e3ba8a065285";

@XendraTrl(Identifier="4c0dd640-c1cd-932a-f81c-53c3426ae1a2")
public static String es_PE_FIELD_Invoice_Charge3_Name="Cargo";

@XendraTrl(Identifier="4c0dd640-c1cd-932a-f81c-53c3426ae1a2")
public static String es_PE_FIELD_Invoice_Charge3_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="4c0dd640-c1cd-932a-f81c-53c3426ae1a2")
public static String es_PE_FIELD_Invoice_Charge3_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@HasCharges@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4c0dd640-c1cd-932a-f81c-53c3426ae1a2")
public static final String FIELDNAME_Invoice_Charge3="4c0dd640-c1cd-932a-f81c-53c3426ae1a2";

@XendraTrl(Identifier="0093b54f-e465-1e35-0a42-2ee40c6f0ce1")
public static String es_PE_FIELD_Invoice_Charge4_Name="Cargo";

@XendraTrl(Identifier="0093b54f-e465-1e35-0a42-2ee40c6f0ce1")
public static String es_PE_FIELD_Invoice_Charge4_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="0093b54f-e465-1e35-0a42-2ee40c6f0ce1")
public static String es_PE_FIELD_Invoice_Charge4_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0093b54f-e465-1e35-0a42-2ee40c6f0ce1")
public static final String FIELDNAME_Invoice_Charge4="0093b54f-e465-1e35-0a42-2ee40c6f0ce1";

@XendraTrl(Identifier="b8aa17b7-4854-7c96-c753-31c295aac312")
public static String es_PE_FIELD_PartnerInvoices_Charge_Name="Cargo";

@XendraTrl(Identifier="b8aa17b7-4854-7c96-c753-31c295aac312")
public static String es_PE_FIELD_PartnerInvoices_Charge_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="b8aa17b7-4854-7c96-c753-31c295aac312")
public static String es_PE_FIELD_PartnerInvoices_Charge_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b8aa17b7-4854-7c96-c753-31c295aac312")
public static final String FIELDNAME_PartnerInvoices_Charge="b8aa17b7-4854-7c96-c753-31c295aac312";

@XendraTrl(Identifier="df645ea8-02f5-0bae-a62e-a495ba1b2209")
public static String es_PE_FIELD_Invoices_Charge_Name="Cargo";

@XendraTrl(Identifier="df645ea8-02f5-0bae-a62e-a495ba1b2209")
public static String es_PE_FIELD_Invoices_Charge_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="df645ea8-02f5-0bae-a62e-a495ba1b2209")
public static String es_PE_FIELD_Invoices_Charge_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="df645ea8-02f5-0bae-a62e-a495ba1b2209")
public static final String FIELDNAME_Invoices_Charge="df645ea8-02f5-0bae-a62e-a495ba1b2209";

@XendraTrl(Identifier="c79e7966-693f-eaba-20df-23ac935b4f24")
public static String es_PE_COLUMN_C_Charge_ID_Name="Cargo";

@XendraColumn(AD_Element_ID="d7e2fc48-a26e-4ded-ea44-fe15849a7883",ColumnName="C_Charge_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="f1c5fd9e-f506-616a-8e72-371fc1171092",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c79e7966-693f-eaba-20df-23ac935b4f24",Synchronized="2020-03-03 21:36:56.0")
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

@XendraTrl(Identifier="02fb7006-46f9-40f6-9477-b8073b2573a6")
public static String es_PE_FIELD_Invoice_C_Contact_Name="C_Contact";

@XendraField(AD_Column_ID="C_Contact_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=500,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-06 14:47:14.0",
Identifier="02fb7006-46f9-40f6-9477-b8073b2573a6")
public static final String FIELDNAME_Invoice_C_Contact="02fb7006-46f9-40f6-9477-b8073b2573a6";

@XendraTrl(Identifier="94b31749-5760-4de0-bed0-6143e53a1e8c")
public static String es_PE_FIELD_Invoice_C_Contact2_Name="C_Contact";

@XendraField(AD_Column_ID="C_Contact_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-08-30 18:45:38.0",
Identifier="94b31749-5760-4de0-bed0-6143e53a1e8c")
public static final String FIELDNAME_Invoice_C_Contact2="94b31749-5760-4de0-bed0-6143e53a1e8c";

@XendraTrl(Identifier="1fb56368-d9ce-44c6-925f-90390d205913")
public static String es_PE_COLUMN_C_Contact_ID_Name="C_Contact";

@XendraColumn(AD_Element_ID="bb15e679-fe21-467e-83f5-3dbf31590903",ColumnName="C_Contact_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1fb56368-d9ce-44c6-925f-90390d205913",
Synchronized="2020-03-03 21:36:56.0")
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

@XendraTrl(Identifier="1c210871-a8a1-8b36-79da-1d45c390a699")
public static String es_PE_FIELD_Invoice_ControlActivity_Name="Actividad de Control";

@XendraTrl(Identifier="1c210871-a8a1-8b36-79da-1d45c390a699")
public static String es_PE_FIELD_Invoice_ControlActivity_Description="Actividad de Control";

@XendraField(AD_Column_ID="C_ControlActivity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1c210871-a8a1-8b36-79da-1d45c390a699")
public static final String FIELDNAME_Invoice_ControlActivity="1c210871-a8a1-8b36-79da-1d45c390a699";

@XendraTrl(Identifier="2bf28bc4-5c17-c4b7-8c2c-4b06eaecb952")
public static String es_PE_FIELD_Invoice_ControlActivity2_Name="Actividad de Control";

@XendraTrl(Identifier="2bf28bc4-5c17-c4b7-8c2c-4b06eaecb952")
public static String es_PE_FIELD_Invoice_ControlActivity2_Description="Actividad de Control";

@XendraField(AD_Column_ID="C_ControlActivity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2bf28bc4-5c17-c4b7-8c2c-4b06eaecb952")
public static final String FIELDNAME_Invoice_ControlActivity2="2bf28bc4-5c17-c4b7-8c2c-4b06eaecb952";

@XendraTrl(Identifier="f4fc81cb-f3bf-6fd3-a8a0-25881c154089")
public static String es_PE_COLUMN_C_ControlActivity_ID_Name="Actividad de Control";

@XendraColumn(AD_Element_ID="93cc21ee-0269-d42b-9bdf-df9462976ca0",
ColumnName="C_ControlActivity_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=20,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f4fc81cb-f3bf-6fd3-a8a0-25881c154089",Synchronized="2020-03-03 21:36:56.0")
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

@XendraTrl(Identifier="473b2668-882e-7c8c-5783-2de5a76e7888")
public static String es_PE_FIELD_Invoice_CurrencyType_Name="Tipo de Moneda";

@XendraTrl(Identifier="473b2668-882e-7c8c-5783-2de5a76e7888")
public static String es_PE_FIELD_Invoice_CurrencyType_Description="Tipo de índice de conversión de moneda ";

@XendraTrl(Identifier="473b2668-882e-7c8c-5783-2de5a76e7888")
public static String es_PE_FIELD_Invoice_CurrencyType_Help="El tipo del índice de conversión de monedas le deja definir diversos tipos de tarifas, tarifas ej. del punto, corporativas y/o de Ventas/Compras.";

@XendraField(AD_Column_ID="C_ConversionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@C_Currency_ID@!@$C_Currency_ID@",DisplayLength=10,IsReadOnly=false,SeqNo=130,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="473b2668-882e-7c8c-5783-2de5a76e7888")
public static final String FIELDNAME_Invoice_CurrencyType="473b2668-882e-7c8c-5783-2de5a76e7888";

@XendraTrl(Identifier="e0d8d8d6-1673-c0d1-49da-3fd1c649883b")
public static String es_PE_FIELD_Invoice_CurrencyType2_Name="Tipo de Moneda";

@XendraTrl(Identifier="e0d8d8d6-1673-c0d1-49da-3fd1c649883b")
public static String es_PE_FIELD_Invoice_CurrencyType2_Description="Tipo de índice de conversión de moneda ";

@XendraTrl(Identifier="e0d8d8d6-1673-c0d1-49da-3fd1c649883b")
public static String es_PE_FIELD_Invoice_CurrencyType2_Help="El tipo del índice de conversión de monedas le deja definir diversos tipos de tarifas, tarifas ej. del punto, corporativas y/o de Ventas/Compras.";

@XendraField(AD_Column_ID="C_ConversionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@C_Currency_ID@!@$C_Currency_ID@",DisplayLength=10,IsReadOnly=false,SeqNo=130,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="e0d8d8d6-1673-c0d1-49da-3fd1c649883b")
public static final String FIELDNAME_Invoice_CurrencyType2="e0d8d8d6-1673-c0d1-49da-3fd1c649883b";

@XendraTrl(Identifier="93019e17-d2e6-af0d-046d-c8a24a311388")
public static String es_PE_FIELD_Invoice_CurrencyType3_Name="Tipo de Moneda";

@XendraTrl(Identifier="93019e17-d2e6-af0d-046d-c8a24a311388")
public static String es_PE_FIELD_Invoice_CurrencyType3_Description="Tipo de índice de conversión de moneda ";

@XendraTrl(Identifier="93019e17-d2e6-af0d-046d-c8a24a311388")
public static String es_PE_FIELD_Invoice_CurrencyType3_Help="El tipo del índice de conversión de monedas le deja definir diversos tipos de tarifas, tarifas ej. del punto, corporativas y/o de Ventas/Compras.";

@XendraField(AD_Column_ID="C_ConversionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="93019e17-d2e6-af0d-046d-c8a24a311388")
public static final String FIELDNAME_Invoice_CurrencyType3="93019e17-d2e6-af0d-046d-c8a24a311388";

@XendraTrl(Identifier="06e3283f-18e7-a541-02de-064ccd6f87f3")
public static String es_PE_FIELD_Invoice_CurrencyType4_Name="Tipo de Moneda";

@XendraTrl(Identifier="06e3283f-18e7-a541-02de-064ccd6f87f3")
public static String es_PE_FIELD_Invoice_CurrencyType4_Description="Tipo de índice de conversión de moneda ";

@XendraTrl(Identifier="06e3283f-18e7-a541-02de-064ccd6f87f3")
public static String es_PE_FIELD_Invoice_CurrencyType4_Help="El tipo del índice de conversión de monedas le deja definir diversos tipos de tarifas, tarifas ej. del punto, corporativas y/o de Ventas/Compras.";

@XendraField(AD_Column_ID="C_ConversionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="06e3283f-18e7-a541-02de-064ccd6f87f3")
public static final String FIELDNAME_Invoice_CurrencyType4="06e3283f-18e7-a541-02de-064ccd6f87f3";

@XendraTrl(Identifier="6b19c5ef-695b-f9e0-fc04-78e95f2458e8")
public static String es_PE_FIELD_PartnerInvoices_CurrencyType_Name="Tipo de Moneda";

@XendraTrl(Identifier="6b19c5ef-695b-f9e0-fc04-78e95f2458e8")
public static String es_PE_FIELD_PartnerInvoices_CurrencyType_Description="Tipo de índice de conversión de moneda ";

@XendraTrl(Identifier="6b19c5ef-695b-f9e0-fc04-78e95f2458e8")
public static String es_PE_FIELD_PartnerInvoices_CurrencyType_Help="El tipo del índice de conversión de monedas le deja definir diversos tipos de tarifas, tarifas ej. del punto, corporativas y/o de Ventas/Compras.";

@XendraField(AD_Column_ID="C_ConversionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6b19c5ef-695b-f9e0-fc04-78e95f2458e8")
public static final String FIELDNAME_PartnerInvoices_CurrencyType="6b19c5ef-695b-f9e0-fc04-78e95f2458e8";

@XendraTrl(Identifier="104d0b8f-1626-f7d3-c54c-a06ec11a7e18")
public static String es_PE_FIELD_Invoices_CurrencyType_Name="Tipo de Moneda";

@XendraTrl(Identifier="104d0b8f-1626-f7d3-c54c-a06ec11a7e18")
public static String es_PE_FIELD_Invoices_CurrencyType_Description="Tipo de índice de conversión de moneda ";

@XendraTrl(Identifier="104d0b8f-1626-f7d3-c54c-a06ec11a7e18")
public static String es_PE_FIELD_Invoices_CurrencyType_Help="El tipo del índice de conversión de monedas le deja definir diversos tipos de tarifas, tarifas ej. del punto, corporativas y/o de Ventas/Compras.";

@XendraField(AD_Column_ID="C_ConversionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="104d0b8f-1626-f7d3-c54c-a06ec11a7e18")
public static final String FIELDNAME_Invoices_CurrencyType="104d0b8f-1626-f7d3-c54c-a06ec11a7e18";

@XendraTrl(Identifier="2be09485-777f-c748-2eff-24d513649611")
public static String es_PE_COLUMN_C_ConversionType_ID_Name="Tipo de Moneda";

@XendraColumn(AD_Element_ID="66f5d039-c94d-0957-487b-eb3118bd7719",
ColumnName="C_ConversionType_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2be09485-777f-c748-2eff-24d513649611",Synchronized="2020-03-03 21:36:56.0")
/** Column name C_ConversionType_ID */
public static final String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID < 1) throw new IllegalArgumentException ("C_Currency_ID is mandatory.");
set_Value (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
}
/** Get Currency.
@return The Currency for this record */
public int getC_Currency_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ebfd691f-0ee9-cb46-3410-ee348df11932")
public static String es_PE_FIELD_Invoice_Currency_Name="Moneda";

@XendraTrl(Identifier="ebfd691f-0ee9-cb46-3410-ee348df11932")
public static String es_PE_FIELD_Invoice_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="ebfd691f-0ee9-cb46-3410-ee348df11932")
public static String es_PE_FIELD_Invoice_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="General",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ebfd691f-0ee9-cb46-3410-ee348df11932")
public static final String FIELDNAME_Invoice_Currency="ebfd691f-0ee9-cb46-3410-ee348df11932";

@XendraTrl(Identifier="7fbb7990-87a8-1c97-b07a-e123a848a7ea")
public static String es_PE_FIELD_Invoice_Currency2_Name="Moneda";

@XendraTrl(Identifier="7fbb7990-87a8-1c97-b07a-e123a848a7ea")
public static String es_PE_FIELD_Invoice_Currency2_Description="Moneda para este registro";

@XendraTrl(Identifier="7fbb7990-87a8-1c97-b07a-e123a848a7ea")
public static String es_PE_FIELD_Invoice_Currency2_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="General",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7fbb7990-87a8-1c97-b07a-e123a848a7ea")
public static final String FIELDNAME_Invoice_Currency2="7fbb7990-87a8-1c97-b07a-e123a848a7ea";

@XendraTrl(Identifier="f25caf3f-12f7-6826-6538-269ec5d80838")
public static String es_PE_FIELD_Invoice_Currency3_Name="Moneda";

@XendraTrl(Identifier="f25caf3f-12f7-6826-6538-269ec5d80838")
public static String es_PE_FIELD_Invoice_Currency3_Description="Moneda para este registro";

@XendraTrl(Identifier="f25caf3f-12f7-6826-6538-269ec5d80838")
public static String es_PE_FIELD_Invoice_Currency3_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f25caf3f-12f7-6826-6538-269ec5d80838")
public static final String FIELDNAME_Invoice_Currency3="f25caf3f-12f7-6826-6538-269ec5d80838";

@XendraTrl(Identifier="1ad28cf5-19e9-5d33-a2a2-06db802142d4")
public static String es_PE_FIELD_Invoice_Currency4_Name="Moneda";

@XendraTrl(Identifier="1ad28cf5-19e9-5d33-a2a2-06db802142d4")
public static String es_PE_FIELD_Invoice_Currency4_Description="Moneda para este registro";

@XendraTrl(Identifier="1ad28cf5-19e9-5d33-a2a2-06db802142d4")
public static String es_PE_FIELD_Invoice_Currency4_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1ad28cf5-19e9-5d33-a2a2-06db802142d4")
public static final String FIELDNAME_Invoice_Currency4="1ad28cf5-19e9-5d33-a2a2-06db802142d4";

@XendraTrl(Identifier="a5e68e05-00d4-5413-ed20-c254c3485524")
public static String es_PE_FIELD_PartnerInvoices_Currency_Name="Moneda";

@XendraTrl(Identifier="a5e68e05-00d4-5413-ed20-c254c3485524")
public static String es_PE_FIELD_PartnerInvoices_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="a5e68e05-00d4-5413-ed20-c254c3485524")
public static String es_PE_FIELD_PartnerInvoices_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a5e68e05-00d4-5413-ed20-c254c3485524")
public static final String FIELDNAME_PartnerInvoices_Currency="a5e68e05-00d4-5413-ed20-c254c3485524";

@XendraTrl(Identifier="d4bdf37c-303c-bf91-dfa2-baaf2e3a39f4")
public static String es_PE_FIELD_Invoices_Currency_Name="Moneda";

@XendraTrl(Identifier="d4bdf37c-303c-bf91-dfa2-baaf2e3a39f4")
public static String es_PE_FIELD_Invoices_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="d4bdf37c-303c-bf91-dfa2-baaf2e3a39f4")
public static String es_PE_FIELD_Invoices_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d4bdf37c-303c-bf91-dfa2-baaf2e3a39f4")
public static final String FIELDNAME_Invoices_Currency="d4bdf37c-303c-bf91-dfa2-baaf2e3a39f4";

@XendraTrl(Identifier="c834025b-1e7c-a695-09b1-651951363ed1")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@C_Currency_ID@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c834025b-1e7c-a695-09b1-651951363ed1",Synchronized="2020-03-03 21:36:56.0")
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

@XendraTrl(Identifier="140e598c-10b7-c721-e1b1-325f47aeb706")
public static String es_PE_FIELD_Invoice_DocumentType_Name="Tipo de Documento";

@XendraTrl(Identifier="140e598c-10b7-c721-e1b1-325f47aeb706")
public static String es_PE_FIELD_Invoice_DocumentType_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="140e598c-10b7-c721-e1b1-325f47aeb706")
public static String es_PE_FIELD_Invoice_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=280,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="140e598c-10b7-c721-e1b1-325f47aeb706")
public static final String FIELDNAME_Invoice_DocumentType="140e598c-10b7-c721-e1b1-325f47aeb706";

@XendraTrl(Identifier="aafa7feb-ad39-9c84-d385-5dbffaf5dc4b")
public static String es_PE_FIELD_Invoice_DocumentType2_Name="Tipo de Documento";

@XendraTrl(Identifier="aafa7feb-ad39-9c84-d385-5dbffaf5dc4b")
public static String es_PE_FIELD_Invoice_DocumentType2_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="aafa7feb-ad39-9c84-d385-5dbffaf5dc4b")
public static String es_PE_FIELD_Invoice_DocumentType2_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=280,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aafa7feb-ad39-9c84-d385-5dbffaf5dc4b")
public static final String FIELDNAME_Invoice_DocumentType2="aafa7feb-ad39-9c84-d385-5dbffaf5dc4b";

@XendraTrl(Identifier="86a962e0-0c15-d3d1-c085-335f53674b6c")
public static String es_PE_FIELD_Invoice_DocumentType3_Name="Tipo de Documento";

@XendraTrl(Identifier="86a962e0-0c15-d3d1-c085-335f53674b6c")
public static String es_PE_FIELD_Invoice_DocumentType3_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="86a962e0-0c15-d3d1-c085-335f53674b6c")
public static String es_PE_FIELD_Invoice_DocumentType3_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=260,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="86a962e0-0c15-d3d1-c085-335f53674b6c")
public static final String FIELDNAME_Invoice_DocumentType3="86a962e0-0c15-d3d1-c085-335f53674b6c";

@XendraTrl(Identifier="13bfa2dc-e573-af4e-aa40-d699b71de0cf")
public static String es_PE_FIELD_Invoice_DocumentType4_Name="Tipo de Documento";

@XendraTrl(Identifier="13bfa2dc-e573-af4e-aa40-d699b71de0cf")
public static String es_PE_FIELD_Invoice_DocumentType4_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="13bfa2dc-e573-af4e-aa40-d699b71de0cf")
public static String es_PE_FIELD_Invoice_DocumentType4_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="13bfa2dc-e573-af4e-aa40-d699b71de0cf")
public static final String FIELDNAME_Invoice_DocumentType4="13bfa2dc-e573-af4e-aa40-d699b71de0cf";

@XendraTrl(Identifier="9bde55ec-60f3-7468-a8dc-7e6bdfda2336")
public static String es_PE_FIELD_PartnerInvoices_DocumentType_Name="Tipo de Documento";

@XendraTrl(Identifier="9bde55ec-60f3-7468-a8dc-7e6bdfda2336")
public static String es_PE_FIELD_PartnerInvoices_DocumentType_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="9bde55ec-60f3-7468-a8dc-7e6bdfda2336")
public static String es_PE_FIELD_PartnerInvoices_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9bde55ec-60f3-7468-a8dc-7e6bdfda2336")
public static final String FIELDNAME_PartnerInvoices_DocumentType="9bde55ec-60f3-7468-a8dc-7e6bdfda2336";

@XendraTrl(Identifier="65cd82f3-7311-545a-1e82-141df4cbe9ce")
public static String es_PE_FIELD_Invoices_DocumentType_Name="Tipo de Documento";

@XendraTrl(Identifier="65cd82f3-7311-545a-1e82-141df4cbe9ce")
public static String es_PE_FIELD_Invoices_DocumentType_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="65cd82f3-7311-545a-1e82-141df4cbe9ce")
public static String es_PE_FIELD_Invoices_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="65cd82f3-7311-545a-1e82-141df4cbe9ce")
public static final String FIELDNAME_Invoices_DocumentType="65cd82f3-7311-545a-1e82-141df4cbe9ce";

@XendraTrl(Identifier="1e62b852-2373-ff45-e209-fdbdcc4410de")
public static String es_PE_COLUMN_C_DocType_ID_Name="Tipo de Documento";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1e62b852-2373-ff45-e209-fdbdcc4410de",
Synchronized="2020-03-03 21:36:56.0")
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

@XendraTrl(Identifier="634843a9-bca3-a9de-2250-adcdf4972ee3")
public static String es_PE_FIELD_Invoice_TargetDocumentType_Name="Tipo Doc. Destino";

@XendraTrl(Identifier="634843a9-bca3-a9de-2250-adcdf4972ee3")
public static String es_PE_FIELD_Invoice_TargetDocumentType_Description="Tipo de documento destino para convertir documentos";

@XendraTrl(Identifier="634843a9-bca3-a9de-2250-adcdf4972ee3")
public static String es_PE_FIELD_Invoice_TargetDocumentType_Help="Usted puede convertir tipos de documento (Ej. Desde ofertas hasta órdenes ó facturas). La conversión es entonces reflejada en el tipo actual. Este proceso es iniciado a través de seleccionar la acción apropiada del documento.";

@XendraField(AD_Column_ID="C_DocTypeTarget_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="634843a9-bca3-a9de-2250-adcdf4972ee3")
public static final String FIELDNAME_Invoice_TargetDocumentType="634843a9-bca3-a9de-2250-adcdf4972ee3";

@XendraTrl(Identifier="6f38f031-3a42-aaa3-fec3-3f4a8cc81572")
public static String es_PE_FIELD_Invoice_TargetDocumentType2_Name="Tipo Doc. Destino";

@XendraTrl(Identifier="6f38f031-3a42-aaa3-fec3-3f4a8cc81572")
public static String es_PE_FIELD_Invoice_TargetDocumentType2_Description="Tipo de documento destino para convertir documentos";

@XendraTrl(Identifier="6f38f031-3a42-aaa3-fec3-3f4a8cc81572")
public static String es_PE_FIELD_Invoice_TargetDocumentType2_Help="Usted puede convertir tipos de documento (Ej. Desde ofertas hasta órdenes ó facturas). La conversión es entonces reflejada en el tipo actual. Este proceso es iniciado a través de seleccionar la acción apropiada del documento.";

@XendraField(AD_Column_ID="C_DocTypeTarget_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6f38f031-3a42-aaa3-fec3-3f4a8cc81572")
public static final String FIELDNAME_Invoice_TargetDocumentType2="6f38f031-3a42-aaa3-fec3-3f4a8cc81572";

@XendraTrl(Identifier="ed7d68e2-db2f-2544-77d1-a8f254039cbf")
public static String es_PE_FIELD_Invoice_TargetDocumentType3_Name="Tipo Documento Destino";

@XendraTrl(Identifier="ed7d68e2-db2f-2544-77d1-a8f254039cbf")
public static String es_PE_FIELD_Invoice_TargetDocumentType3_Description="Tipo de documento destino para convertir documentos";

@XendraTrl(Identifier="ed7d68e2-db2f-2544-77d1-a8f254039cbf")
public static String es_PE_FIELD_Invoice_TargetDocumentType3_Help="Usted puede convertir tipos de documento (Ej. Desde ofertas hasta órdenes ó facturas). La conversión es entonces reflejada en el tipo actual. Este proceso es iniciado a través de seleccionar la acción apropiada del documento.";

@XendraField(AD_Column_ID="C_DocTypeTarget_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ed7d68e2-db2f-2544-77d1-a8f254039cbf")
public static final String FIELDNAME_Invoice_TargetDocumentType3="ed7d68e2-db2f-2544-77d1-a8f254039cbf";

@XendraTrl(Identifier="cb956aa3-a379-c072-fac9-266c852032ef")
public static String es_PE_FIELD_Invoice_TargetDocumentType4_Name="Tipo Documento Destino";

@XendraTrl(Identifier="cb956aa3-a379-c072-fac9-266c852032ef")
public static String es_PE_FIELD_Invoice_TargetDocumentType4_Description="Tipo de documento destino para convertir documentos";

@XendraTrl(Identifier="cb956aa3-a379-c072-fac9-266c852032ef")
public static String es_PE_FIELD_Invoice_TargetDocumentType4_Help="Usted puede convertir tipos de documento (Ej. Desde ofertas hasta órdenes ó facturas). La conversión es entonces reflejada en el tipo actual. Este proceso es iniciado a través de seleccionar la acción apropiada del documento.";

@XendraField(AD_Column_ID="C_DocTypeTarget_ID",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cb956aa3-a379-c072-fac9-266c852032ef")
public static final String FIELDNAME_Invoice_TargetDocumentType4="cb956aa3-a379-c072-fac9-266c852032ef";

@XendraTrl(Identifier="8b29623e-deba-1074-7c09-1ff812800d32")
public static String es_PE_FIELD_PartnerInvoices_TargetDocumentType_Name="Tipo Documento Destino";

@XendraTrl(Identifier="8b29623e-deba-1074-7c09-1ff812800d32")
public static String es_PE_FIELD_PartnerInvoices_TargetDocumentType_Description="Tipo de documento destino para convertir documentos";

@XendraTrl(Identifier="8b29623e-deba-1074-7c09-1ff812800d32")
public static String es_PE_FIELD_PartnerInvoices_TargetDocumentType_Help="Usted puede convertir tipos de documento (Ej. Desde ofertas hasta órdenes ó facturas). La conversión es entonces reflejada en el tipo actual. Este proceso es iniciado a través de seleccionar la acción apropiada del documento.";

@XendraField(AD_Column_ID="C_DocTypeTarget_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8b29623e-deba-1074-7c09-1ff812800d32")
public static final String FIELDNAME_PartnerInvoices_TargetDocumentType="8b29623e-deba-1074-7c09-1ff812800d32";

@XendraTrl(Identifier="4490b7c6-a013-e5ac-e181-4d0646784f0d")
public static String es_PE_FIELD_Invoices_TargetDocumentType_Name="Tipo Documento Destino";

@XendraTrl(Identifier="4490b7c6-a013-e5ac-e181-4d0646784f0d")
public static String es_PE_FIELD_Invoices_TargetDocumentType_Description="Tipo de documento destino para convertir documentos";

@XendraTrl(Identifier="4490b7c6-a013-e5ac-e181-4d0646784f0d")
public static String es_PE_FIELD_Invoices_TargetDocumentType_Help="Usted puede convertir tipos de documento (Ej. Desde ofertas hasta órdenes ó facturas). La conversión es entonces reflejada en el tipo actual. Este proceso es iniciado a través de seleccionar la acción apropiada del documento.";

@XendraField(AD_Column_ID="C_DocTypeTarget_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4490b7c6-a013-e5ac-e181-4d0646784f0d")
public static final String FIELDNAME_Invoices_TargetDocumentType="4490b7c6-a013-e5ac-e181-4d0646784f0d";

@XendraTrl(Identifier="0ffcb8ad-5827-5daa-e512-de33535bd52d")
public static String es_PE_COLUMN_C_DocTypeTarget_ID_Name="Tipo Documento Destino";

@XendraColumn(AD_Element_ID="6dee1e94-d5bf-ba0d-a64a-25cdb5fd9515",ColumnName="C_DocTypeTarget_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="f06eaf85-a231-e1cf-ebf8-59d002c13ab4",
AD_Val_Rule_ID="3618c2e5-5c32-687f-83f6-d13e5296d9e4",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutInvoice.docType",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0ffcb8ad-5827-5daa-e512-de33535bd52d",Synchronized="2020-03-03 21:36:56.0")
/** Column name C_DocTypeTarget_ID */
public static final String COLUMNNAME_C_DocTypeTarget_ID = "C_DocTypeTarget_ID";
/** Set C_GroupDoc_ID.
@param C_GroupDoc_ID C_GroupDoc_ID */
public void setC_GroupDoc_ID (int C_GroupDoc_ID)
{
if (C_GroupDoc_ID <= 0) set_Value (COLUMNNAME_C_GroupDoc_ID, null);
 else 
set_Value (COLUMNNAME_C_GroupDoc_ID, Integer.valueOf(C_GroupDoc_ID));
}
/** Get C_GroupDoc_ID.
@return C_GroupDoc_ID */
public int getC_GroupDoc_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_GroupDoc_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6ddf15b1-36e1-9121-ceec-3455c067bbc1")
public static String es_PE_FIELD_Invoice_C_GroupDoc_ID_Name="Grupo de Documentos";

@XendraField(AD_Column_ID="C_GroupDoc_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=310,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6ddf15b1-36e1-9121-ceec-3455c067bbc1")
public static final String FIELDNAME_Invoice_C_GroupDoc_ID="6ddf15b1-36e1-9121-ceec-3455c067bbc1";

@XendraTrl(Identifier="a4130944-081c-5e9b-57f5-93690cdaf943")
public static String es_PE_FIELD_Invoice_C_GroupDoc_ID2_Name="Grupo de Documentos";

@XendraField(AD_Column_ID="C_GroupDoc_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=310,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a4130944-081c-5e9b-57f5-93690cdaf943")
public static final String FIELDNAME_Invoice_C_GroupDoc_ID2="a4130944-081c-5e9b-57f5-93690cdaf943";

@XendraTrl(Identifier="5c91df51-bb0c-1080-b553-7b1ac2481b83")
public static String es_PE_COLUMN_C_GroupDoc_ID_Name="C_GroupDoc_ID";

@XendraColumn(AD_Element_ID="6376cf94-c145-e9e0-11ce-5b020ca6bff7",ColumnName="C_GroupDoc_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5c91df51-bb0c-1080-b553-7b1ac2481b83",
Synchronized="2020-03-03 21:36:56.0")
/** Column name C_GroupDoc_ID */
public static final String COLUMNNAME_C_GroupDoc_ID = "C_GroupDoc_ID";
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

@XendraTrl(Identifier="9143234e-c6b2-1ed3-2340-cc544966d44d")
public static String es_PE_FIELD_Invoice_ChargeAmount_Name="Total de Cargo";

@XendraTrl(Identifier="9143234e-c6b2-1ed3-2340-cc544966d44d")
public static String es_PE_FIELD_Invoice_ChargeAmount_Description="Total del Cargo";

@XendraTrl(Identifier="9143234e-c6b2-1ed3-2340-cc544966d44d")
public static String es_PE_FIELD_Invoice_ChargeAmount_Help="El Total Cargo indica el total para un cargo adicional";

@XendraField(AD_Column_ID="ChargeAmt",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@HasCharges@='Y'",DisplayLength=20,IsReadOnly=false,SeqNo=190,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="9143234e-c6b2-1ed3-2340-cc544966d44d")
public static final String FIELDNAME_Invoice_ChargeAmount="9143234e-c6b2-1ed3-2340-cc544966d44d";

@XendraTrl(Identifier="847db37e-da95-1741-911e-fcfa909b42c1")
public static String es_PE_FIELD_Invoice_ChargeAmount2_Name="Total de Cargo";

@XendraTrl(Identifier="847db37e-da95-1741-911e-fcfa909b42c1")
public static String es_PE_FIELD_Invoice_ChargeAmount2_Description="Total del Cargo";

@XendraTrl(Identifier="847db37e-da95-1741-911e-fcfa909b42c1")
public static String es_PE_FIELD_Invoice_ChargeAmount2_Help="El Total Cargo indica el total para un cargo adicional";

@XendraField(AD_Column_ID="ChargeAmt",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@HasCharges@='Y'",DisplayLength=20,IsReadOnly=false,SeqNo=190,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="847db37e-da95-1741-911e-fcfa909b42c1")
public static final String FIELDNAME_Invoice_ChargeAmount2="847db37e-da95-1741-911e-fcfa909b42c1";

@XendraTrl(Identifier="a58ec045-ac6c-2417-0104-f5ca80a49543")
public static String es_PE_FIELD_Invoice_ChargeAmount3_Name="Total de Cargo";

@XendraTrl(Identifier="a58ec045-ac6c-2417-0104-f5ca80a49543")
public static String es_PE_FIELD_Invoice_ChargeAmount3_Description="Total del Cargo";

@XendraTrl(Identifier="a58ec045-ac6c-2417-0104-f5ca80a49543")
public static String es_PE_FIELD_Invoice_ChargeAmount3_Help="El Total Cargo indica el total para un cargo adicional";

@XendraField(AD_Column_ID="ChargeAmt",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@HasCharges@='Y'",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="a58ec045-ac6c-2417-0104-f5ca80a49543")
public static final String FIELDNAME_Invoice_ChargeAmount3="a58ec045-ac6c-2417-0104-f5ca80a49543";

@XendraTrl(Identifier="6fd0ec8c-8342-0cd0-985b-6e9c052ab2d7")
public static String es_PE_FIELD_Invoice_ChargeAmount4_Name="Total de Cargo";

@XendraTrl(Identifier="6fd0ec8c-8342-0cd0-985b-6e9c052ab2d7")
public static String es_PE_FIELD_Invoice_ChargeAmount4_Description="Total del Cargo";

@XendraTrl(Identifier="6fd0ec8c-8342-0cd0-985b-6e9c052ab2d7")
public static String es_PE_FIELD_Invoice_ChargeAmount4_Help="El Total Cargo indica el total para un cargo adicional";

@XendraField(AD_Column_ID="ChargeAmt",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6fd0ec8c-8342-0cd0-985b-6e9c052ab2d7")
public static final String FIELDNAME_Invoice_ChargeAmount4="6fd0ec8c-8342-0cd0-985b-6e9c052ab2d7";

@XendraTrl(Identifier="a0220d75-02d3-1096-ad0e-9baa925c2207")
public static String es_PE_FIELD_PartnerInvoices_ChargeAmount_Name="Total de Cargo";

@XendraTrl(Identifier="a0220d75-02d3-1096-ad0e-9baa925c2207")
public static String es_PE_FIELD_PartnerInvoices_ChargeAmount_Description="Total del Cargo";

@XendraTrl(Identifier="a0220d75-02d3-1096-ad0e-9baa925c2207")
public static String es_PE_FIELD_PartnerInvoices_ChargeAmount_Help="El Total Cargo indica el total para un cargo adicional";

@XendraField(AD_Column_ID="ChargeAmt",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a0220d75-02d3-1096-ad0e-9baa925c2207")
public static final String FIELDNAME_PartnerInvoices_ChargeAmount="a0220d75-02d3-1096-ad0e-9baa925c2207";

@XendraTrl(Identifier="3b3586e8-0314-11dc-545d-43027b8bce0d")
public static String es_PE_FIELD_Invoices_ChargeAmount_Name="Total de Cargo";

@XendraTrl(Identifier="3b3586e8-0314-11dc-545d-43027b8bce0d")
public static String es_PE_FIELD_Invoices_ChargeAmount_Description="Total del Cargo";

@XendraTrl(Identifier="3b3586e8-0314-11dc-545d-43027b8bce0d")
public static String es_PE_FIELD_Invoices_ChargeAmount_Help="El Total Cargo indica el total para un cargo adicional";

@XendraField(AD_Column_ID="ChargeAmt",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3b3586e8-0314-11dc-545d-43027b8bce0d")
public static final String FIELDNAME_Invoices_ChargeAmount="3b3586e8-0314-11dc-545d-43027b8bce0d";

@XendraTrl(Identifier="b1952aa7-64e8-46c9-89ff-33bf6e94d70c")
public static String es_PE_COLUMN_ChargeAmt_Name="Total de Cargo";

@XendraColumn(AD_Element_ID="0700d401-01bb-8f19-a508-aa47155ba852",ColumnName="ChargeAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b1952aa7-64e8-46c9-89ff-33bf6e94d70c",
Synchronized="2020-03-03 21:36:56.0")
/** Column name ChargeAmt */
public static final String COLUMNNAME_ChargeAmt = "ChargeAmt";
/** Set Invoice.
@param C_Invoice_ID Invoice Identifier */
public void setC_Invoice_ID (int C_Invoice_ID)
{
if (C_Invoice_ID < 1) throw new IllegalArgumentException ("C_Invoice_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Invoice_ID, Integer.valueOf(C_Invoice_ID));
}
/** Get Invoice.
@return Invoice Identifier */
public int getC_Invoice_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Invoice_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1287267a-bcf9-9ccb-7609-1a73c42abb15")
public static String es_PE_FIELD_Invoice_Invoice_Name="Factura";

@XendraTrl(Identifier="1287267a-bcf9-9ccb-7609-1a73c42abb15")
public static String es_PE_FIELD_Invoice_Invoice_Description="Identificador de la factura";

@XendraTrl(Identifier="1287267a-bcf9-9ccb-7609-1a73c42abb15")
public static String es_PE_FIELD_Invoice_Invoice_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1287267a-bcf9-9ccb-7609-1a73c42abb15")
public static final String FIELDNAME_Invoice_Invoice="1287267a-bcf9-9ccb-7609-1a73c42abb15";

@XendraTrl(Identifier="bbbdbc5c-fa76-eced-1cb0-e7cee22b460b")
public static String es_PE_FIELD_Invoice_Invoice2_Name="Factura";

@XendraTrl(Identifier="bbbdbc5c-fa76-eced-1cb0-e7cee22b460b")
public static String es_PE_FIELD_Invoice_Invoice2_Description="Identificador de la factura";

@XendraTrl(Identifier="bbbdbc5c-fa76-eced-1cb0-e7cee22b460b")
public static String es_PE_FIELD_Invoice_Invoice2_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bbbdbc5c-fa76-eced-1cb0-e7cee22b460b")
public static final String FIELDNAME_Invoice_Invoice2="bbbdbc5c-fa76-eced-1cb0-e7cee22b460b";

@XendraTrl(Identifier="2fcc951f-bbe8-df8e-e49a-7b7cdaaa3776")
public static String es_PE_FIELD_Invoice_Invoice3_Name="Factura";

@XendraTrl(Identifier="2fcc951f-bbe8-df8e-e49a-7b7cdaaa3776")
public static String es_PE_FIELD_Invoice_Invoice3_Description="Identificador de la factura";

@XendraTrl(Identifier="2fcc951f-bbe8-df8e-e49a-7b7cdaaa3776")
public static String es_PE_FIELD_Invoice_Invoice3_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2fcc951f-bbe8-df8e-e49a-7b7cdaaa3776")
public static final String FIELDNAME_Invoice_Invoice3="2fcc951f-bbe8-df8e-e49a-7b7cdaaa3776";

@XendraTrl(Identifier="b8b8bc11-8839-ed75-464a-2e321e1dac75")
public static String es_PE_FIELD_Invoice_Invoice4_Name="Factura";

@XendraTrl(Identifier="b8b8bc11-8839-ed75-464a-2e321e1dac75")
public static String es_PE_FIELD_Invoice_Invoice4_Description="Identificador de la factura";

@XendraTrl(Identifier="b8b8bc11-8839-ed75-464a-2e321e1dac75")
public static String es_PE_FIELD_Invoice_Invoice4_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b8b8bc11-8839-ed75-464a-2e321e1dac75")
public static final String FIELDNAME_Invoice_Invoice4="b8b8bc11-8839-ed75-464a-2e321e1dac75";

@XendraTrl(Identifier="de4c1aa3-29fa-4a3c-26f9-14d8686047ef")
public static String es_PE_FIELD_PartnerInvoices_Invoice_Name="Factura";

@XendraTrl(Identifier="de4c1aa3-29fa-4a3c-26f9-14d8686047ef")
public static String es_PE_FIELD_PartnerInvoices_Invoice_Description="Identificador de la factura";

@XendraTrl(Identifier="de4c1aa3-29fa-4a3c-26f9-14d8686047ef")
public static String es_PE_FIELD_PartnerInvoices_Invoice_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="1=2",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="de4c1aa3-29fa-4a3c-26f9-14d8686047ef")
public static final String FIELDNAME_PartnerInvoices_Invoice="de4c1aa3-29fa-4a3c-26f9-14d8686047ef";

@XendraTrl(Identifier="2235e8b3-3819-67b7-4a12-5e8dea7b350c")
public static String es_PE_FIELD_Invoices_Invoice_Name="Factura";

@XendraTrl(Identifier="2235e8b3-3819-67b7-4a12-5e8dea7b350c")
public static String es_PE_FIELD_Invoices_Invoice_Description="Identificador de la factura";

@XendraTrl(Identifier="2235e8b3-3819-67b7-4a12-5e8dea7b350c")
public static String es_PE_FIELD_Invoices_Invoice_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2235e8b3-3819-67b7-4a12-5e8dea7b350c")
public static final String FIELDNAME_Invoices_Invoice="2235e8b3-3819-67b7-4a12-5e8dea7b350c";
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
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

@XendraTrl(Identifier="3145b909-d6d5-71a7-1495-b9874aea77ab")
public static String es_PE_FIELD_Invoice_CopyLines_Name="Copiar Líneas";

@XendraTrl(Identifier="3145b909-d6d5-71a7-1495-b9874aea77ab")
public static String es_PE_FIELD_Invoice_CopyLines_Description="Copiar Lineas Desde otra Factura";

@XendraField(AD_Column_ID="CopyFrom",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=330,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3145b909-d6d5-71a7-1495-b9874aea77ab")
public static final String FIELDNAME_Invoice_CopyLines="3145b909-d6d5-71a7-1495-b9874aea77ab";

@XendraTrl(Identifier="b7d37438-4ac0-3efd-350e-ee7cfef046b2")
public static String es_PE_FIELD_Invoice_CopyLines2_Name="Copiar Lineas";

@XendraTrl(Identifier="b7d37438-4ac0-3efd-350e-ee7cfef046b2")
public static String es_PE_FIELD_Invoice_CopyLines2_Description="Copiar Lineas Desde otra Factura";

@XendraField(AD_Column_ID="CopyFrom",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=330,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b7d37438-4ac0-3efd-350e-ee7cfef046b2")
public static final String FIELDNAME_Invoice_CopyLines2="b7d37438-4ac0-3efd-350e-ee7cfef046b2";

@XendraTrl(Identifier="51bb1e0b-73b9-830d-8b04-acedc0a24afb")
public static String es_PE_FIELD_Invoice_CopyLines3_Name="Copiar Lineas";

@XendraTrl(Identifier="51bb1e0b-73b9-830d-8b04-acedc0a24afb")
public static String es_PE_FIELD_Invoice_CopyLines3_Description="Copiar Lineas Desde otra Factura";

@XendraField(AD_Column_ID="CopyFrom",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="51bb1e0b-73b9-830d-8b04-acedc0a24afb")
public static final String FIELDNAME_Invoice_CopyLines3="51bb1e0b-73b9-830d-8b04-acedc0a24afb";

@XendraTrl(Identifier="b8943cca-c889-3562-c1a0-d5a2f4ee7241")
public static String es_PE_FIELD_Invoice_CopyLines4_Name="Copiar Lineas";

@XendraTrl(Identifier="b8943cca-c889-3562-c1a0-d5a2f4ee7241")
public static String es_PE_FIELD_Invoice_CopyLines4_Description="Copiar Lineas Desde otra Factura";

@XendraField(AD_Column_ID="CopyFrom",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b8943cca-c889-3562-c1a0-d5a2f4ee7241")
public static final String FIELDNAME_Invoice_CopyLines4="b8943cca-c889-3562-c1a0-d5a2f4ee7241";

@XendraTrl(Identifier="5672393d-f6ce-0010-55d1-c5c6ea7780b8")
public static String es_PE_FIELD_PartnerInvoices_CopyLines_Name="Copiar Lineas";

@XendraTrl(Identifier="5672393d-f6ce-0010-55d1-c5c6ea7780b8")
public static String es_PE_FIELD_PartnerInvoices_CopyLines_Description="Copiar Lineas Desde otra Factura";

@XendraField(AD_Column_ID="CopyFrom",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5672393d-f6ce-0010-55d1-c5c6ea7780b8")
public static final String FIELDNAME_PartnerInvoices_CopyLines="5672393d-f6ce-0010-55d1-c5c6ea7780b8";

@XendraTrl(Identifier="cd606582-020d-d03d-6592-45ad2b030425")
public static String es_PE_FIELD_Invoices_CopyLines_Name="Copiar Lineas";

@XendraTrl(Identifier="cd606582-020d-d03d-6592-45ad2b030425")
public static String es_PE_FIELD_Invoices_CopyLines_Description="Copiar Lineas Desde otra Factura";

@XendraField(AD_Column_ID="CopyFrom",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cd606582-020d-d03d-6592-45ad2b030425")
public static final String FIELDNAME_Invoices_CopyLines="cd606582-020d-d03d-6592-45ad2b030425";

@XendraTrl(Identifier="8ad173c6-2659-ca9e-0d83-e2d24c5248a3")
public static String es_PE_COLUMN_CopyFrom_Name="Copiar Desde";

@XendraColumn(AD_Element_ID="2d763fac-73d8-32e6-3aa1-e987486f2022",ColumnName="CopyFrom",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="51c0d58d-737a-c75a-206a-1a9587f32ab7",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8ad173c6-2659-ca9e-0d83-e2d24c5248a3",Synchronized="2020-03-03 21:36:56.0")
/** Column name CopyFrom */
public static final String COLUMNNAME_CopyFrom = "CopyFrom";
/** Set Order.
@param C_Order_ID Order */
public void setC_Order_ID (int C_Order_ID)
{
if (C_Order_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_Order_ID, null);
 else 
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

@XendraTrl(Identifier="6dee4e5b-a96d-b6fa-38cb-ce956dad9383")
public static String es_PE_FIELD_Invoice_Order_Name="Orden de Venta";

@XendraTrl(Identifier="6dee4e5b-a96d-b6fa-38cb-ce956dad9383")
public static String es_PE_FIELD_Invoice_Order_Description="Orden de Venta";

@XendraTrl(Identifier="6dee4e5b-a96d-b6fa-38cb-ce956dad9383")
public static String es_PE_FIELD_Invoice_Order_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6dee4e5b-a96d-b6fa-38cb-ce956dad9383")
public static final String FIELDNAME_Invoice_Order="6dee4e5b-a96d-b6fa-38cb-ce956dad9383";

@XendraTrl(Identifier="b96a95a7-be97-0e24-1a32-ac12ce379206")
public static String es_PE_FIELD_Invoice_PurchaseOrder_Name="Orden de Compra";

@XendraTrl(Identifier="b96a95a7-be97-0e24-1a32-ac12ce379206")
public static String es_PE_FIELD_Invoice_PurchaseOrder_Description="Orden de Compra";

@XendraTrl(Identifier="b96a95a7-be97-0e24-1a32-ac12ce379206")
public static String es_PE_FIELD_Invoice_PurchaseOrder_Help="La compra es Identificada con un ID único de orden de compra. Esta controlado por la secuencia de este tipo de documento.";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b96a95a7-be97-0e24-1a32-ac12ce379206")
public static final String FIELDNAME_Invoice_PurchaseOrder="b96a95a7-be97-0e24-1a32-ac12ce379206";

@XendraTrl(Identifier="fd3b156a-2a34-eb55-ec4e-c6d6759e694a")
public static String es_PE_FIELD_Invoice_PurchaseOrder2_Name="Orden de compra";

@XendraTrl(Identifier="fd3b156a-2a34-eb55-ec4e-c6d6759e694a")
public static String es_PE_FIELD_Invoice_PurchaseOrder2_Description="Orden de compra";

@XendraTrl(Identifier="fd3b156a-2a34-eb55-ec4e-c6d6759e694a")
public static String es_PE_FIELD_Invoice_PurchaseOrder2_Help="La compra es Identificada con un ID único de orden de compra. Esta controlado por la secuencia de este tipo de documento.";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fd3b156a-2a34-eb55-ec4e-c6d6759e694a")
public static final String FIELDNAME_Invoice_PurchaseOrder2="fd3b156a-2a34-eb55-ec4e-c6d6759e694a";

@XendraTrl(Identifier="bf94d5c6-87d3-8c1f-2fe5-5d88cde3ca6d")
public static String es_PE_FIELD_Invoice_Order2_Name="Orden de Venta";

@XendraTrl(Identifier="bf94d5c6-87d3-8c1f-2fe5-5d88cde3ca6d")
public static String es_PE_FIELD_Invoice_Order2_Description="Orden de Venta";

@XendraTrl(Identifier="bf94d5c6-87d3-8c1f-2fe5-5d88cde3ca6d")
public static String es_PE_FIELD_Invoice_Order2_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bf94d5c6-87d3-8c1f-2fe5-5d88cde3ca6d")
public static final String FIELDNAME_Invoice_Order2="bf94d5c6-87d3-8c1f-2fe5-5d88cde3ca6d";

@XendraTrl(Identifier="660ccc7a-8ba0-f166-4762-b77d5f6e74de")
public static String es_PE_FIELD_PartnerInvoices_Order_Name="Orden de Venta";

@XendraTrl(Identifier="660ccc7a-8ba0-f166-4762-b77d5f6e74de")
public static String es_PE_FIELD_PartnerInvoices_Order_Description="Orden de Venta";

@XendraTrl(Identifier="660ccc7a-8ba0-f166-4762-b77d5f6e74de")
public static String es_PE_FIELD_PartnerInvoices_Order_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="660ccc7a-8ba0-f166-4762-b77d5f6e74de")
public static final String FIELDNAME_PartnerInvoices_Order="660ccc7a-8ba0-f166-4762-b77d5f6e74de";

@XendraTrl(Identifier="f55dcc7c-fae8-6649-5ea0-0be83900dbbd")
public static String es_PE_FIELD_Invoices_Order_Name="Orden de Venta";

@XendraTrl(Identifier="f55dcc7c-fae8-6649-5ea0-0be83900dbbd")
public static String es_PE_FIELD_Invoices_Order_Description="Orden de Venta";

@XendraTrl(Identifier="f55dcc7c-fae8-6649-5ea0-0be83900dbbd")
public static String es_PE_FIELD_Invoices_Order_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f55dcc7c-fae8-6649-5ea0-0be83900dbbd")
public static final String FIELDNAME_Invoices_Order="f55dcc7c-fae8-6649-5ea0-0be83900dbbd";

@XendraTrl(Identifier="0c65448d-8475-75de-7047-85aecbad9a77")
public static String es_PE_COLUMN_C_Order_ID_Name="Orden de Venta";

@XendraColumn(AD_Element_ID="cc846c60-90b8-6aad-9d07-b5d0c0328787",ColumnName="C_Order_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0c65448d-8475-75de-7047-85aecbad9a77",
Synchronized="2020-03-03 21:36:56.0")
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

@XendraTrl(Identifier="fe39553d-e4dd-c1b7-b8bf-5a0ca0efbc5d")
public static String es_PE_FIELD_Invoice_Payment_Name="Pago";

@XendraTrl(Identifier="fe39553d-e4dd-c1b7-b8bf-5a0ca0efbc5d")
public static String es_PE_FIELD_Invoice_Payment_Description="Identificador del pago";

@XendraTrl(Identifier="fe39553d-e4dd-c1b7-b8bf-5a0ca0efbc5d")
public static String es_PE_FIELD_Invoice_Payment_Help="El pago es un identificador único de este pago.";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fe39553d-e4dd-c1b7-b8bf-5a0ca0efbc5d")
public static final String FIELDNAME_Invoice_Payment="fe39553d-e4dd-c1b7-b8bf-5a0ca0efbc5d";

@XendraTrl(Identifier="172ddba4-a8c1-fa69-50f4-601351513cde")
public static String es_PE_FIELD_Invoice_Payment2_Name="Pago";

@XendraTrl(Identifier="172ddba4-a8c1-fa69-50f4-601351513cde")
public static String es_PE_FIELD_Invoice_Payment2_Description="Identificador del pago";

@XendraTrl(Identifier="172ddba4-a8c1-fa69-50f4-601351513cde")
public static String es_PE_FIELD_Invoice_Payment2_Help="El pago es un identificador único de este pago.";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="172ddba4-a8c1-fa69-50f4-601351513cde")
public static final String FIELDNAME_Invoice_Payment2="172ddba4-a8c1-fa69-50f4-601351513cde";

@XendraTrl(Identifier="69cc9c0a-16ff-065f-bb72-00401fceae8d")
public static String es_PE_FIELD_Invoice_Payment3_Name="Pago";

@XendraTrl(Identifier="69cc9c0a-16ff-065f-bb72-00401fceae8d")
public static String es_PE_FIELD_Invoice_Payment3_Description="Identificador del pago";

@XendraTrl(Identifier="69cc9c0a-16ff-065f-bb72-00401fceae8d")
public static String es_PE_FIELD_Invoice_Payment3_Help="El pago es un identificador único de este pago.";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="69cc9c0a-16ff-065f-bb72-00401fceae8d")
public static final String FIELDNAME_Invoice_Payment3="69cc9c0a-16ff-065f-bb72-00401fceae8d";

@XendraTrl(Identifier="24fabb3c-191a-b06c-db6e-339c4e86f987")
public static String es_PE_FIELD_Invoice_Payment4_Name="Pago";

@XendraTrl(Identifier="24fabb3c-191a-b06c-db6e-339c4e86f987")
public static String es_PE_FIELD_Invoice_Payment4_Description="Identificador del pago";

@XendraTrl(Identifier="24fabb3c-191a-b06c-db6e-339c4e86f987")
public static String es_PE_FIELD_Invoice_Payment4_Help="El pago es un identificador único de este pago.";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="24fabb3c-191a-b06c-db6e-339c4e86f987")
public static final String FIELDNAME_Invoice_Payment4="24fabb3c-191a-b06c-db6e-339c4e86f987";

@XendraTrl(Identifier="759d37f3-9d6a-3e82-c5aa-9648c8cb9883")
public static String es_PE_FIELD_PartnerInvoices_Payment_Name="Pago";

@XendraTrl(Identifier="759d37f3-9d6a-3e82-c5aa-9648c8cb9883")
public static String es_PE_FIELD_PartnerInvoices_Payment_Description="Identificador del pago";

@XendraTrl(Identifier="759d37f3-9d6a-3e82-c5aa-9648c8cb9883")
public static String es_PE_FIELD_PartnerInvoices_Payment_Help="El pago es un identificador único de este pago.";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="759d37f3-9d6a-3e82-c5aa-9648c8cb9883")
public static final String FIELDNAME_PartnerInvoices_Payment="759d37f3-9d6a-3e82-c5aa-9648c8cb9883";

@XendraTrl(Identifier="26c82b26-c245-071b-d79d-bcc91a3a12a9")
public static String es_PE_FIELD_Invoices_Payment_Name="Pago";

@XendraTrl(Identifier="26c82b26-c245-071b-d79d-bcc91a3a12a9")
public static String es_PE_FIELD_Invoices_Payment_Description="Identificador del pago";

@XendraTrl(Identifier="26c82b26-c245-071b-d79d-bcc91a3a12a9")
public static String es_PE_FIELD_Invoices_Payment_Help="El pago es un identificador único de este pago.";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="26c82b26-c245-071b-d79d-bcc91a3a12a9")
public static final String FIELDNAME_Invoices_Payment="26c82b26-c245-071b-d79d-bcc91a3a12a9";

@XendraTrl(Identifier="c44af1e1-2ec5-123d-3f44-0dcc6995a187")
public static String es_PE_COLUMN_C_Payment_ID_Name="Pago";

@XendraColumn(AD_Element_ID="3ded5658-968e-94c5-207b-eed6f6a7bb43",ColumnName="C_Payment_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c44af1e1-2ec5-123d-3f44-0dcc6995a187",
Synchronized="2020-03-03 21:36:56.0")
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

@XendraTrl(Identifier="98c40078-113b-d6f2-ccfe-adb31b300c0f")
public static String es_PE_FIELD_Invoice_PaymentTerm_Name="Término Pago";

@XendraTrl(Identifier="98c40078-113b-d6f2-ccfe-adb31b300c0f")
public static String es_PE_FIELD_Invoice_PaymentTerm_Description="Condiciones de pago de esta transacción";

@XendraTrl(Identifier="98c40078-113b-d6f2-ccfe-adb31b300c0f")
public static String es_PE_FIELD_Invoice_PaymentTerm_Help="Las condiciones de pago indican el método y tiempo de pago para esta transacción.";

@XendraField(AD_Column_ID="C_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@PaymentRule@='P' | @PaymentRule@='D'",DisplayLength=10,IsReadOnly=false,SeqNo=200,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="98c40078-113b-d6f2-ccfe-adb31b300c0f")
public static final String FIELDNAME_Invoice_PaymentTerm="98c40078-113b-d6f2-ccfe-adb31b300c0f";

@XendraTrl(Identifier="823c2894-daa9-d528-62f9-63d22b46aacc")
public static String es_PE_FIELD_Invoice_PaymentTerm2_Name="Término de Pago";

@XendraTrl(Identifier="823c2894-daa9-d528-62f9-63d22b46aacc")
public static String es_PE_FIELD_Invoice_PaymentTerm2_Description="Condiciones de pago de esta transacción";

@XendraTrl(Identifier="823c2894-daa9-d528-62f9-63d22b46aacc")
public static String es_PE_FIELD_Invoice_PaymentTerm2_Help="Las condiciones de pago indican el método y tiempo de pago para esta transacción.";

@XendraField(AD_Column_ID="C_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@PaymentRule@='P'",DisplayLength=10,IsReadOnly=false,SeqNo=200,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="823c2894-daa9-d528-62f9-63d22b46aacc")
public static final String FIELDNAME_Invoice_PaymentTerm2="823c2894-daa9-d528-62f9-63d22b46aacc";

@XendraTrl(Identifier="95d1cb4c-078b-8010-8fa7-e321c7dd8fd5")
public static String es_PE_FIELD_Invoice_PaymentTerm3_Name="Término de Pago";

@XendraTrl(Identifier="95d1cb4c-078b-8010-8fa7-e321c7dd8fd5")
public static String es_PE_FIELD_Invoice_PaymentTerm3_Description="Condiciones de pago de esta transacción";

@XendraTrl(Identifier="95d1cb4c-078b-8010-8fa7-e321c7dd8fd5")
public static String es_PE_FIELD_Invoice_PaymentTerm3_Help="Las condiciones de pago indican el método y tiempo de pago para esta transacción.";

@XendraField(AD_Column_ID="C_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@PaymentRule@='P'",DisplayLength=14,IsReadOnly=false,SeqNo=160,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="95d1cb4c-078b-8010-8fa7-e321c7dd8fd5")
public static final String FIELDNAME_Invoice_PaymentTerm3="95d1cb4c-078b-8010-8fa7-e321c7dd8fd5";

@XendraTrl(Identifier="efa2795d-1c96-b35e-fb81-d6fc4799abcb")
public static String es_PE_FIELD_Invoice_PaymentTerm4_Name="Término de Pago";

@XendraTrl(Identifier="efa2795d-1c96-b35e-fb81-d6fc4799abcb")
public static String es_PE_FIELD_Invoice_PaymentTerm4_Description="Condiciones de pago de esta transacción";

@XendraTrl(Identifier="efa2795d-1c96-b35e-fb81-d6fc4799abcb")
public static String es_PE_FIELD_Invoice_PaymentTerm4_Help="Las condiciones de pago indican el método y tiempo de pago para esta transacción.";

@XendraField(AD_Column_ID="C_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="efa2795d-1c96-b35e-fb81-d6fc4799abcb")
public static final String FIELDNAME_Invoice_PaymentTerm4="efa2795d-1c96-b35e-fb81-d6fc4799abcb";

@XendraTrl(Identifier="e70f4811-7cb2-feab-0c6a-1b9873fefc10")
public static String es_PE_FIELD_PartnerInvoices_PaymentTerm_Name="Término de Pago";

@XendraTrl(Identifier="e70f4811-7cb2-feab-0c6a-1b9873fefc10")
public static String es_PE_FIELD_PartnerInvoices_PaymentTerm_Description="Condiciones de pago de esta transacción";

@XendraTrl(Identifier="e70f4811-7cb2-feab-0c6a-1b9873fefc10")
public static String es_PE_FIELD_PartnerInvoices_PaymentTerm_Help="Las condiciones de pago indican el método y tiempo de pago para esta transacción.";

@XendraField(AD_Column_ID="C_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e70f4811-7cb2-feab-0c6a-1b9873fefc10")
public static final String FIELDNAME_PartnerInvoices_PaymentTerm="e70f4811-7cb2-feab-0c6a-1b9873fefc10";

@XendraTrl(Identifier="a3e952a3-f22d-61e1-825b-f50de95722c2")
public static String es_PE_FIELD_Invoices_PaymentTerm_Name="Término de Pago";

@XendraTrl(Identifier="a3e952a3-f22d-61e1-825b-f50de95722c2")
public static String es_PE_FIELD_Invoices_PaymentTerm_Description="Condiciones de pago de esta transacción";

@XendraTrl(Identifier="a3e952a3-f22d-61e1-825b-f50de95722c2")
public static String es_PE_FIELD_Invoices_PaymentTerm_Help="Las condiciones de pago indican el método y tiempo de pago para esta transacción.";

@XendraField(AD_Column_ID="C_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a3e952a3-f22d-61e1-825b-f50de95722c2")
public static final String FIELDNAME_Invoices_PaymentTerm="a3e952a3-f22d-61e1-825b-f50de95722c2";

@XendraTrl(Identifier="afe64023-1fc3-d62a-9f3e-906190d45e7e")
public static String es_PE_COLUMN_C_PaymentTerm_ID_Name="Término de Pago";

@XendraColumn(AD_Element_ID="9b2224b8-8020-a83c-2d1e-ea35741c781a",ColumnName="C_PaymentTerm_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutInvoice.paymentTerm",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="afe64023-1fc3-d62a-9f3e-906190d45e7e",
Synchronized="2020-03-03 21:36:56.0")
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

@XendraTrl(Identifier="c849d261-e53d-dcdf-9146-91c22bc761dc")
public static String es_PE_FIELD_Invoice_POSTerminal_Name="Terminal PDV";

@XendraTrl(Identifier="c849d261-e53d-dcdf-9146-91c22bc761dc")
public static String es_PE_FIELD_Invoice_POSTerminal_Description="Punto de las ventas terminales";

@XendraTrl(Identifier="c849d261-e53d-dcdf-9146-91c22bc761dc")
public static String es_PE_FIELD_Invoice_POSTerminal_Help="La Terminal de PDV define el default y las funciones de la forma de PV.";

@XendraField(AD_Column_ID="C_POS_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=470,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c849d261-e53d-dcdf-9146-91c22bc761dc")
public static final String FIELDNAME_Invoice_POSTerminal="c849d261-e53d-dcdf-9146-91c22bc761dc";

@XendraTrl(Identifier="c40d97a5-7735-49d0-99dd-9bb032fd3e0e")
public static String es_PE_FIELD_Invoice_POSTerminal2_Name="Terminal PDV";

@XendraTrl(Identifier="c40d97a5-7735-49d0-99dd-9bb032fd3e0e")
public static String es_PE_FIELD_Invoice_POSTerminal2_Description="Punto de las ventas terminales";

@XendraTrl(Identifier="c40d97a5-7735-49d0-99dd-9bb032fd3e0e")
public static String es_PE_FIELD_Invoice_POSTerminal2_Help="La Terminal de PDV define el default y las funciones de la forma de PV.";

@XendraField(AD_Column_ID="C_POS_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-08-30 18:45:38.0",
Identifier="c40d97a5-7735-49d0-99dd-9bb032fd3e0e")
public static final String FIELDNAME_Invoice_POSTerminal2="c40d97a5-7735-49d0-99dd-9bb032fd3e0e";

@XendraTrl(Identifier="dbbe6da5-b0c6-44c2-feea-c835b57064fb")
public static String es_PE_COLUMN_C_POS_ID_Name="POS Terminal";

@XendraColumn(AD_Element_ID="c2adeeab-8099-b658-0016-5d97a32be4a2",ColumnName="C_POS_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dbbe6da5-b0c6-44c2-feea-c835b57064fb",
Synchronized="2020-03-03 21:36:56.0")
/** Column name C_POS_ID */
public static final String COLUMNNAME_C_POS_ID = "C_POS_ID";
/** Set POS Log.
@param C_POSLog_ID POS Log */
public void setC_POSLog_ID (int C_POSLog_ID)
{
if (C_POSLog_ID <= 0) set_Value (COLUMNNAME_C_POSLog_ID, null);
 else 
set_Value (COLUMNNAME_C_POSLog_ID, Integer.valueOf(C_POSLog_ID));
}
/** Get POS Log.
@return POS Log */
public int getC_POSLog_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_POSLog_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="381bfe34-7940-4f4f-5ab8-a9ce56aaf145")
public static String es_PE_FIELD_Invoice_POSLog_Name="Registro del PDV";

@XendraField(AD_Column_ID="C_POSLog_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="381bfe34-7940-4f4f-5ab8-a9ce56aaf145")
public static final String FIELDNAME_Invoice_POSLog="381bfe34-7940-4f4f-5ab8-a9ce56aaf145";

@XendraTrl(Identifier="ba3e8ade-a528-4e31-b8d3-77ab43193d0d")
public static String es_PE_FIELD_Invoice_POSLog2_Name="Registro del PDV";

@XendraField(AD_Column_ID="C_POSLog_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-08-30 18:45:39.0",
Identifier="ba3e8ade-a528-4e31-b8d3-77ab43193d0d")
public static final String FIELDNAME_Invoice_POSLog2="ba3e8ade-a528-4e31-b8d3-77ab43193d0d";

@XendraTrl(Identifier="80db8490-a005-af7a-67de-71314c62f818")
public static String es_PE_COLUMN_C_POSLog_ID_Name="POS Log";

@XendraColumn(AD_Element_ID="6ca0b543-bed1-f146-e899-b13e2b257821",ColumnName="C_POSLog_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="80db8490-a005-af7a-67de-71314c62f818",
Synchronized="2020-03-03 21:36:56.0")
/** Column name C_POSLog_ID */
public static final String COLUMNNAME_C_POSLog_ID = "C_POSLog_ID";
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

@XendraTrl(Identifier="fe6b2b42-5717-927e-f1c6-34738d83d67a")
public static String es_PE_FIELD_Invoice_Project_Name="Proyecto";

@XendraTrl(Identifier="fe6b2b42-5717-927e-f1c6-34738d83d67a")
public static String es_PE_FIELD_Invoice_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="fe6b2b42-5717-927e-f1c6-34738d83d67a")
public static String es_PE_FIELD_Invoice_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="Reference",IsDisplayed=false,
DisplayLogic="@$Element_PJ@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="fe6b2b42-5717-927e-f1c6-34738d83d67a")
public static final String FIELDNAME_Invoice_Project="fe6b2b42-5717-927e-f1c6-34738d83d67a";

@XendraTrl(Identifier="52715883-25e3-3af2-0e70-0982b89ad8c3")
public static String es_PE_FIELD_Invoice_Project2_Name="Proyecto";

@XendraTrl(Identifier="52715883-25e3-3af2-0e70-0982b89ad8c3")
public static String es_PE_FIELD_Invoice_Project2_Description="Identifica un proyecto único";

@XendraTrl(Identifier="52715883-25e3-3af2-0e70-0982b89ad8c3")
public static String es_PE_FIELD_Invoice_Project2_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="Reference",IsDisplayed=false,
DisplayLogic="@$Element_PJ@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="52715883-25e3-3af2-0e70-0982b89ad8c3")
public static final String FIELDNAME_Invoice_Project2="52715883-25e3-3af2-0e70-0982b89ad8c3";

@XendraTrl(Identifier="51f66b2e-cec2-5256-1119-9d1b2f20b1fb")
public static String es_PE_FIELD_Invoice_Project3_Name="Proyecto";

@XendraTrl(Identifier="51f66b2e-cec2-5256-1119-9d1b2f20b1fb")
public static String es_PE_FIELD_Invoice_Project3_Description="Identifica un proyecto único";

@XendraTrl(Identifier="51f66b2e-cec2-5256-1119-9d1b2f20b1fb")
public static String es_PE_FIELD_Invoice_Project3_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_PJ@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="51f66b2e-cec2-5256-1119-9d1b2f20b1fb")
public static final String FIELDNAME_Invoice_Project3="51f66b2e-cec2-5256-1119-9d1b2f20b1fb";

@XendraTrl(Identifier="ce7535d4-0fa1-15fa-eca9-372c7fdd639b")
public static String es_PE_FIELD_Invoice_Project4_Name="Proyecto";

@XendraTrl(Identifier="ce7535d4-0fa1-15fa-eca9-372c7fdd639b")
public static String es_PE_FIELD_Invoice_Project4_Description="Identifica un proyecto único";

@XendraTrl(Identifier="ce7535d4-0fa1-15fa-eca9-372c7fdd639b")
public static String es_PE_FIELD_Invoice_Project4_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ce7535d4-0fa1-15fa-eca9-372c7fdd639b")
public static final String FIELDNAME_Invoice_Project4="ce7535d4-0fa1-15fa-eca9-372c7fdd639b";

@XendraTrl(Identifier="49aea7d7-daf6-ba4a-599d-5b1c5f5826e9")
public static String es_PE_FIELD_PartnerInvoices_Project_Name="Proyecto";

@XendraTrl(Identifier="49aea7d7-daf6-ba4a-599d-5b1c5f5826e9")
public static String es_PE_FIELD_PartnerInvoices_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="49aea7d7-daf6-ba4a-599d-5b1c5f5826e9")
public static String es_PE_FIELD_PartnerInvoices_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="49aea7d7-daf6-ba4a-599d-5b1c5f5826e9")
public static final String FIELDNAME_PartnerInvoices_Project="49aea7d7-daf6-ba4a-599d-5b1c5f5826e9";

@XendraTrl(Identifier="ee84ef93-4fdf-a8e3-cfd4-eeb2179ef1dc")
public static String es_PE_FIELD_Invoices_Project_Name="Proyecto";

@XendraTrl(Identifier="ee84ef93-4fdf-a8e3-cfd4-eeb2179ef1dc")
public static String es_PE_FIELD_Invoices_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="ee84ef93-4fdf-a8e3-cfd4-eeb2179ef1dc")
public static String es_PE_FIELD_Invoices_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ee84ef93-4fdf-a8e3-cfd4-eeb2179ef1dc")
public static final String FIELDNAME_Invoices_Project="ee84ef93-4fdf-a8e3-cfd4-eeb2179ef1dc";

@XendraTrl(Identifier="de0d902c-c7bb-4eca-3443-a6f26efe42ff")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="961cbc99-cc24-46df-b94e-37fe139285bf",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="de0d902c-c7bb-4eca-3443-a6f26efe42ff",Synchronized="2020-03-03 21:36:56.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
/** Set Create lines from.
@param CreateFrom Process which will generate a new document lines based on an existing document */
public void setCreateFrom (String CreateFrom)
{
if (CreateFrom != null && CreateFrom.length() > 1)
{
log.warning("Length > 1 - truncated");
CreateFrom = CreateFrom.substring(0,0);
}
set_Value (COLUMNNAME_CreateFrom, CreateFrom);
}
/** Get Create lines from.
@return Process which will generate a new document lines based on an existing document */
public String getCreateFrom() 
{
return (String)get_Value(COLUMNNAME_CreateFrom);
}

@XendraTrl(Identifier="36476786-1351-4b39-28cc-e1f8811d0b69")
public static String es_PE_FIELD_Invoice_CreateLinesFrom_Name="Crear Desde";

@XendraTrl(Identifier="36476786-1351-4b39-28cc-e1f8811d0b69")
public static String es_PE_FIELD_Invoice_CreateLinesFrom_Description="Proceso que generará un nuevo documento";

@XendraTrl(Identifier="36476786-1351-4b39-28cc-e1f8811d0b69")
public static String es_PE_FIELD_Invoice_CreateLinesFrom_Help="El proceso crear desde creará un nuevo documento basado en información de un documento existente seleccionado por el usuario";

@XendraField(AD_Column_ID="CreateFrom",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="Action",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="36476786-1351-4b39-28cc-e1f8811d0b69")
public static final String FIELDNAME_Invoice_CreateLinesFrom="36476786-1351-4b39-28cc-e1f8811d0b69";

@XendraTrl(Identifier="548caa58-d9aa-c1cd-9cb8-5742d5d1314d")
public static String es_PE_FIELD_Invoice_CreateLinesFrom2_Name="Crear Desde";

@XendraTrl(Identifier="548caa58-d9aa-c1cd-9cb8-5742d5d1314d")
public static String es_PE_FIELD_Invoice_CreateLinesFrom2_Description="Proceso que generará un nuevo documento";

@XendraTrl(Identifier="548caa58-d9aa-c1cd-9cb8-5742d5d1314d")
public static String es_PE_FIELD_Invoice_CreateLinesFrom2_Help="El proceso crear desde creará un nuevo documento basado en información de un documento existente seleccionado por el usuario";

@XendraField(AD_Column_ID="CreateFrom",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=350,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="548caa58-d9aa-c1cd-9cb8-5742d5d1314d")
public static final String FIELDNAME_Invoice_CreateLinesFrom2="548caa58-d9aa-c1cd-9cb8-5742d5d1314d";

@XendraTrl(Identifier="c93c6c13-94e4-4056-2187-d28728e702a9")
public static String es_PE_FIELD_Invoice_CreateLinesFrom3_Name="Crear Desde";

@XendraTrl(Identifier="c93c6c13-94e4-4056-2187-d28728e702a9")
public static String es_PE_FIELD_Invoice_CreateLinesFrom3_Description="Proceso que generará un nuevo documento";

@XendraTrl(Identifier="c93c6c13-94e4-4056-2187-d28728e702a9")
public static String es_PE_FIELD_Invoice_CreateLinesFrom3_Help="El proceso crear desde creará un nuevo documento basado en información de un documento existente seleccionado por el usuario";

@XendraField(AD_Column_ID="CreateFrom",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c93c6c13-94e4-4056-2187-d28728e702a9")
public static final String FIELDNAME_Invoice_CreateLinesFrom3="c93c6c13-94e4-4056-2187-d28728e702a9";

@XendraTrl(Identifier="a89359ee-4803-6123-cd46-bb565f7763bc")
public static String es_PE_FIELD_Invoice_CreateLinesFrom4_Name="Crear Desde";

@XendraTrl(Identifier="a89359ee-4803-6123-cd46-bb565f7763bc")
public static String es_PE_FIELD_Invoice_CreateLinesFrom4_Description="Proceso que generará un nuevo documento";

@XendraTrl(Identifier="a89359ee-4803-6123-cd46-bb565f7763bc")
public static String es_PE_FIELD_Invoice_CreateLinesFrom4_Help="El proceso crear desde creará un nuevo documento basado en información de un documento existente seleccionado por el usuario";

@XendraField(AD_Column_ID="CreateFrom",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a89359ee-4803-6123-cd46-bb565f7763bc")
public static final String FIELDNAME_Invoice_CreateLinesFrom4="a89359ee-4803-6123-cd46-bb565f7763bc";

@XendraTrl(Identifier="ce7e7526-6925-572e-7501-b924f6997f3b")
public static String es_PE_FIELD_PartnerInvoices_CreateLinesFrom_Name="Crear Desde";

@XendraTrl(Identifier="ce7e7526-6925-572e-7501-b924f6997f3b")
public static String es_PE_FIELD_PartnerInvoices_CreateLinesFrom_Description="Proceso que generará un nuevo documento";

@XendraTrl(Identifier="ce7e7526-6925-572e-7501-b924f6997f3b")
public static String es_PE_FIELD_PartnerInvoices_CreateLinesFrom_Help="El proceso crear desde creará un nuevo documento basado en información de un documento existente seleccionado por el usuario";

@XendraField(AD_Column_ID="CreateFrom",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ce7e7526-6925-572e-7501-b924f6997f3b")
public static final String FIELDNAME_PartnerInvoices_CreateLinesFrom="ce7e7526-6925-572e-7501-b924f6997f3b";

@XendraTrl(Identifier="81e1379f-12f4-252c-082d-3e8a35d1a2c2")
public static String es_PE_FIELD_Invoices_CreateLinesFrom_Name="Crear Desde";

@XendraTrl(Identifier="81e1379f-12f4-252c-082d-3e8a35d1a2c2")
public static String es_PE_FIELD_Invoices_CreateLinesFrom_Description="Proceso que generará un nuevo documento";

@XendraTrl(Identifier="81e1379f-12f4-252c-082d-3e8a35d1a2c2")
public static String es_PE_FIELD_Invoices_CreateLinesFrom_Help="El proceso crear desde creará un nuevo documento basado en información de un documento existente seleccionado por el usuario";

@XendraField(AD_Column_ID="CreateFrom",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="81e1379f-12f4-252c-082d-3e8a35d1a2c2")
public static final String FIELDNAME_Invoices_CreateLinesFrom="81e1379f-12f4-252c-082d-3e8a35d1a2c2";

@XendraTrl(Identifier="3a6120fc-8f5e-c4eb-a8f5-f30cf784c9e6")
public static String es_PE_COLUMN_CreateFrom_Name="Crear Desde";

@XendraColumn(AD_Element_ID="7fccccce-83dd-9c79-faa2-d4675bdb0e1c",ColumnName="CreateFrom",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3a6120fc-8f5e-c4eb-a8f5-f30cf784c9e6",
Synchronized="2020-03-03 21:36:56.0")
/** Column name CreateFrom */
public static final String COLUMNNAME_CreateFrom = "CreateFrom";
/** Set C_Retention_ID.
@param C_Retention_ID C_Retention_ID */
public void setC_Retention_ID (int C_Retention_ID)
{
if (C_Retention_ID <= 0) set_Value (COLUMNNAME_C_Retention_ID, null);
 else 
set_Value (COLUMNNAME_C_Retention_ID, Integer.valueOf(C_Retention_ID));
}
/** Get C_Retention_ID.
@return C_Retention_ID */
public int getC_Retention_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Retention_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="457ecb9c-89a4-8bdb-4fa0-3620ee8d4713")
public static String es_PE_FIELD_Invoice_C_Retention_ID_Name="Retención";

@XendraField(AD_Column_ID="C_Retention_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=320,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="457ecb9c-89a4-8bdb-4fa0-3620ee8d4713")
public static final String FIELDNAME_Invoice_C_Retention_ID="457ecb9c-89a4-8bdb-4fa0-3620ee8d4713";

@XendraTrl(Identifier="dc348809-3e95-a34e-5488-d4423c758a88")
public static String es_PE_FIELD_Invoice_C_Retention_ID2_Name="Retención";

@XendraField(AD_Column_ID="C_Retention_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=320,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dc348809-3e95-a34e-5488-d4423c758a88")
public static final String FIELDNAME_Invoice_C_Retention_ID2="dc348809-3e95-a34e-5488-d4423c758a88";

@XendraTrl(Identifier="d8cb703a-4857-b944-8fec-87898d94013c")
public static String es_PE_COLUMN_C_Retention_ID_Name="c_retention_id";

@XendraColumn(AD_Element_ID="34bf1c97-eb1f-e9f1-9f30-087410de5caf",ColumnName="C_Retention_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d8cb703a-4857-b944-8fec-87898d94013c",
Synchronized="2020-03-03 21:36:56.0")
/** Column name C_Retention_ID */
public static final String COLUMNNAME_C_Retention_ID = "C_Retention_ID";
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

@XendraTrl(Identifier="9341dcb7-9793-c7d8-880a-f5fd20914a4a")
public static String es_PE_FIELD_Invoice_UnitApplication_Name="UnitApplication";

@XendraField(AD_Column_ID="C_UnitApplication_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9341dcb7-9793-c7d8-880a-f5fd20914a4a")
public static final String FIELDNAME_Invoice_UnitApplication="9341dcb7-9793-c7d8-880a-f5fd20914a4a";

@XendraTrl(Identifier="46a9e107-3e99-ea07-c75c-6e75a85fde36")
public static String es_PE_FIELD_Invoice_UnitApplication2_Name="Unidad de Aplicacion";

@XendraField(AD_Column_ID="C_UnitApplication_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="Reference",IsDisplayed=false,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="46a9e107-3e99-ea07-c75c-6e75a85fde36")
public static final String FIELDNAME_Invoice_UnitApplication2="46a9e107-3e99-ea07-c75c-6e75a85fde36";

@XendraTrl(Identifier="badc17e3-77d0-81f5-6558-13d8c846fce2")
public static String es_PE_FIELD_PurchaseOrder_UnitApplication_Name="UnitApplication";

@XendraField(AD_Column_ID="C_UnitApplication_ID",IsCentrallyMaintained=true,
AD_Tab_ID="848e4431-1f94-ec97-b669-c940a941b8e2",AD_FieldGroup_ID="Reference",IsDisplayed=false,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="badc17e3-77d0-81f5-6558-13d8c846fce2")
public static final String FIELDNAME_PurchaseOrder_UnitApplication="badc17e3-77d0-81f5-6558-13d8c846fce2";

@XendraTrl(Identifier="903677c0-4b3f-68c4-4c23-5a5e2435fd30")
public static String es_PE_FIELD_MaterialReceipt_UnitApplication_Name="UnitApplication";

@XendraField(AD_Column_ID="C_UnitApplication_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="Reference",IsDisplayed=false,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="903677c0-4b3f-68c4-4c23-5a5e2435fd30")
public static final String FIELDNAME_MaterialReceipt_UnitApplication="903677c0-4b3f-68c4-4c23-5a5e2435fd30";

@XendraTrl(Identifier="3d3ab6d2-1bd8-8f04-2489-39a60dcb6a0a")
public static String es_PE_COLUMN_C_UnitApplication_ID_Name="Unidad de Aplicacion";

@XendraColumn(AD_Element_ID="f5c81a47-6e91-7f96-fb33-6da9a07a172f",
ColumnName="C_UnitApplication_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3d3ab6d2-1bd8-8f04-2489-39a60dcb6a0a",Synchronized="2020-03-03 21:36:56.0")
/** Column name C_UnitApplication_ID */
public static final String COLUMNNAME_C_UnitApplication_ID = "C_UnitApplication_ID";
/** Set Withholding.
@param C_Withholding_ID Withholding type defined */
public void setC_Withholding_ID (int C_Withholding_ID)
{
if (C_Withholding_ID <= 0) set_Value (COLUMNNAME_C_Withholding_ID, null);
 else 
set_Value (COLUMNNAME_C_Withholding_ID, Integer.valueOf(C_Withholding_ID));
}
/** Get Withholding.
@return Withholding type defined */
public int getC_Withholding_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Withholding_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="aa4bd65d-5326-422b-883e-b04b78a77c90")
public static String es_PE_FIELD_Invoice_Withholding_Name="Retención";

@XendraTrl(Identifier="aa4bd65d-5326-422b-883e-b04b78a77c90")
public static String es_PE_FIELD_Invoice_Withholding_Description="Tipo de retención definida";

@XendraTrl(Identifier="aa4bd65d-5326-422b-883e-b04b78a77c90")
public static String es_PE_FIELD_Invoice_Withholding_Help="La Retención indica el tipo de retención a ser calculada";

@XendraField(AD_Column_ID="C_Withholding_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-06 14:47:15.0",
Identifier="aa4bd65d-5326-422b-883e-b04b78a77c90")
public static final String FIELDNAME_Invoice_Withholding="aa4bd65d-5326-422b-883e-b04b78a77c90";

@XendraTrl(Identifier="8fb3ad54-017c-4268-8501-e1c7506a39f7")
public static String es_PE_FIELD_Invoice_Withholding2_Name="Tipo";

@XendraTrl(Identifier="8fb3ad54-017c-4268-8501-e1c7506a39f7")
public static String es_PE_FIELD_Invoice_Withholding2_Description="Tipo de retención definida";

@XendraTrl(Identifier="8fb3ad54-017c-4268-8501-e1c7506a39f7")
public static String es_PE_FIELD_Invoice_Withholding2_Help="La Retención indica el tipo de retención a ser calculada";

@XendraField(AD_Column_ID="C_Withholding_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=490,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-08-30 18:45:39.0",
Identifier="8fb3ad54-017c-4268-8501-e1c7506a39f7")
public static final String FIELDNAME_Invoice_Withholding2="8fb3ad54-017c-4268-8501-e1c7506a39f7";

@XendraTrl(Identifier="bc013196-e4c7-4d9f-a3b9-10c1f06c9bec")
public static String es_PE_COLUMN_C_Withholding_ID_Name="Withholding";

@XendraColumn(AD_Element_ID="518d5ae2-65ee-2bb8-8c37-13beaceecf15",ColumnName="C_Withholding_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="bc013196-e4c7-4d9f-a3b9-10c1f06c9bec",
Synchronized="2020-03-03 21:36:57.0")
/** Column name C_Withholding_ID */
public static final String COLUMNNAME_C_Withholding_ID = "C_Withholding_ID";
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

@XendraTrl(Identifier="88d43207-f1dc-4f48-5bdd-5b2b02d7cdcc")
public static String es_PE_FIELD_Invoice_AccountDate_Name="Fecha de Aplicación CG";

@XendraTrl(Identifier="88d43207-f1dc-4f48-5bdd-5b2b02d7cdcc")
public static String es_PE_FIELD_Invoice_AccountDate_Description="Fecha contable";

@XendraTrl(Identifier="88d43207-f1dc-4f48-5bdd-5b2b02d7cdcc")
public static String es_PE_FIELD_Invoice_AccountDate_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="88d43207-f1dc-4f48-5bdd-5b2b02d7cdcc")
public static final String FIELDNAME_Invoice_AccountDate="88d43207-f1dc-4f48-5bdd-5b2b02d7cdcc";

@XendraTrl(Identifier="dd2c178f-82d8-314e-8d6e-8c546d6dacd1")
public static String es_PE_FIELD_Invoice_AccountDate2_Name="Fecha de Aplicación CG";

@XendraTrl(Identifier="dd2c178f-82d8-314e-8d6e-8c546d6dacd1")
public static String es_PE_FIELD_Invoice_AccountDate2_Description="Fecha contable";

@XendraTrl(Identifier="dd2c178f-82d8-314e-8d6e-8c546d6dacd1")
public static String es_PE_FIELD_Invoice_AccountDate2_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dd2c178f-82d8-314e-8d6e-8c546d6dacd1")
public static final String FIELDNAME_Invoice_AccountDate2="dd2c178f-82d8-314e-8d6e-8c546d6dacd1";

@XendraTrl(Identifier="e9ccf2e3-975c-fd17-3b3a-1b1ef2c573e0")
public static String es_PE_FIELD_Invoice_AccountDate3_Name="Fecha de Aplicación CG";

@XendraTrl(Identifier="e9ccf2e3-975c-fd17-3b3a-1b1ef2c573e0")
public static String es_PE_FIELD_Invoice_AccountDate3_Description="Fecha contable";

@XendraTrl(Identifier="e9ccf2e3-975c-fd17-3b3a-1b1ef2c573e0")
public static String es_PE_FIELD_Invoice_AccountDate3_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e9ccf2e3-975c-fd17-3b3a-1b1ef2c573e0")
public static final String FIELDNAME_Invoice_AccountDate3="e9ccf2e3-975c-fd17-3b3a-1b1ef2c573e0";

@XendraTrl(Identifier="a991d848-ce9a-ebb0-607d-94468c32d534")
public static String es_PE_FIELD_Invoice_AccountDate4_Name="Fecha de Aplicación CG";

@XendraTrl(Identifier="a991d848-ce9a-ebb0-607d-94468c32d534")
public static String es_PE_FIELD_Invoice_AccountDate4_Description="Fecha contable";

@XendraTrl(Identifier="a991d848-ce9a-ebb0-607d-94468c32d534")
public static String es_PE_FIELD_Invoice_AccountDate4_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a991d848-ce9a-ebb0-607d-94468c32d534")
public static final String FIELDNAME_Invoice_AccountDate4="a991d848-ce9a-ebb0-607d-94468c32d534";

@XendraTrl(Identifier="1ef3019a-6356-12fc-6e30-b8065b800cbd")
public static String es_PE_FIELD_PartnerInvoices_AccountDate_Name="Fecha de Aplicación CG";

@XendraTrl(Identifier="1ef3019a-6356-12fc-6e30-b8065b800cbd")
public static String es_PE_FIELD_PartnerInvoices_AccountDate_Description="Fecha contable";

@XendraTrl(Identifier="1ef3019a-6356-12fc-6e30-b8065b800cbd")
public static String es_PE_FIELD_PartnerInvoices_AccountDate_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1ef3019a-6356-12fc-6e30-b8065b800cbd")
public static final String FIELDNAME_PartnerInvoices_AccountDate="1ef3019a-6356-12fc-6e30-b8065b800cbd";

@XendraTrl(Identifier="1ac07daa-01be-20f3-219a-a494d6372a31")
public static String es_PE_FIELD_Invoices_AccountDate_Name="Fecha de Aplicación CG";

@XendraTrl(Identifier="1ac07daa-01be-20f3-219a-a494d6372a31")
public static String es_PE_FIELD_Invoices_AccountDate_Description="Fecha contable";

@XendraTrl(Identifier="1ac07daa-01be-20f3-219a-a494d6372a31")
public static String es_PE_FIELD_Invoices_AccountDate_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1ac07daa-01be-20f3-219a-a494d6372a31")
public static final String FIELDNAME_Invoices_AccountDate="1ac07daa-01be-20f3-219a-a494d6372a31";

@XendraTrl(Identifier="d9174087-0a0d-4178-556e-186c6683df65")
public static String es_PE_COLUMN_DateAcct_Name="Fecha de Aplicación CG";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,
DefaultValue="@SysDate@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d9174087-0a0d-4178-556e-186c6683df65",Synchronized="2020-03-03 21:36:57.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";
/** Set DateDetraction.
@param DateDetraction DateDetraction */
public void setDateDetraction (Timestamp DateDetraction)
{
set_Value (COLUMNNAME_DateDetraction, DateDetraction);
}
/** Get DateDetraction.
@return DateDetraction */
public Timestamp getDateDetraction() 
{
return (Timestamp)get_Value(COLUMNNAME_DateDetraction);
}

@XendraTrl(Identifier="e9f5aa61-3cb0-41e6-a081-31ab28933a8d")
public static String es_PE_FIELD_Invoice_DateDetraction_Name="DateDetraction";

@XendraField(AD_Column_ID="DateDetraction",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=510,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-06 14:47:15.0",
Identifier="e9f5aa61-3cb0-41e6-a081-31ab28933a8d")
public static final String FIELDNAME_Invoice_DateDetraction="e9f5aa61-3cb0-41e6-a081-31ab28933a8d";

@XendraTrl(Identifier="8baf47ae-d642-4f01-972f-53caac649f00")
public static String es_PE_FIELD_Invoice_DateDetraction2_Name="FechaDet";

@XendraField(AD_Column_ID="DateDetraction",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsDetraction@=Y",DisplayLength=10,IsReadOnly=false,SeqNo=470,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2016-08-30 18:45:39.0",Identifier="8baf47ae-d642-4f01-972f-53caac649f00")
public static final String FIELDNAME_Invoice_DateDetraction2="8baf47ae-d642-4f01-972f-53caac649f00";

@XendraTrl(Identifier="1488c9fe-63bb-4cd7-8a80-caba5ede92e0")
public static String es_PE_COLUMN_DateDetraction_Name="DateDetraction";

@XendraColumn(AD_Element_ID="ea8f9071-6b6b-4a3b-a30c-74dbf3f7e922",ColumnName="DateDetraction",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="1488c9fe-63bb-4cd7-8a80-caba5ede92e0",
Synchronized="2020-03-03 21:36:57.0")
/** Column name DateDetraction */
public static final String COLUMNNAME_DateDetraction = "DateDetraction";
/** Set Date Invoiced.
@param DateInvoiced Date printed on Invoice */
public void setDateInvoiced (Timestamp DateInvoiced)
{
if (DateInvoiced == null) throw new IllegalArgumentException ("DateInvoiced is mandatory.");
set_Value (COLUMNNAME_DateInvoiced, DateInvoiced);
}
/** Get Date Invoiced.
@return Date printed on Invoice */
public Timestamp getDateInvoiced() 
{
return (Timestamp)get_Value(COLUMNNAME_DateInvoiced);
}

@XendraTrl(Identifier="e55b3ca2-6da3-936c-17c7-cec6d1778376")
public static String es_PE_FIELD_Invoice_DateInvoiced_Name="Fecha Facturación";

@XendraTrl(Identifier="e55b3ca2-6da3-936c-17c7-cec6d1778376")
public static String es_PE_FIELD_Invoice_DateInvoiced_Description="Fecha impresa en la factura";

@XendraTrl(Identifier="e55b3ca2-6da3-936c-17c7-cec6d1778376")
public static String es_PE_FIELD_Invoice_DateInvoiced_Help="La fecha de la factura indica la fecha impresa en la factura.";

@XendraField(AD_Column_ID="DateInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=20,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e55b3ca2-6da3-936c-17c7-cec6d1778376")
public static final String FIELDNAME_Invoice_DateInvoiced="e55b3ca2-6da3-936c-17c7-cec6d1778376";

@XendraTrl(Identifier="d4640648-a99d-48df-048c-cb060d8edf68")
public static String es_PE_FIELD_Invoice_DateInvoiced2_Name="Fecha de Facturación";

@XendraTrl(Identifier="d4640648-a99d-48df-048c-cb060d8edf68")
public static String es_PE_FIELD_Invoice_DateInvoiced2_Description="Fecha impresa en la factura";

@XendraTrl(Identifier="d4640648-a99d-48df-048c-cb060d8edf68")
public static String es_PE_FIELD_Invoice_DateInvoiced2_Help="La fecha de la factura indica la fecha impresa en la factura.";

@XendraField(AD_Column_ID="DateInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=20,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d4640648-a99d-48df-048c-cb060d8edf68")
public static final String FIELDNAME_Invoice_DateInvoiced2="d4640648-a99d-48df-048c-cb060d8edf68";

@XendraTrl(Identifier="d2177505-d470-e8e5-f01a-5211ebcb92a4")
public static String es_PE_FIELD_Invoice_DateInvoiced3_Name="Fecha de Facturación";

@XendraTrl(Identifier="d2177505-d470-e8e5-f01a-5211ebcb92a4")
public static String es_PE_FIELD_Invoice_DateInvoiced3_Description="Fecha impresa en la factura";

@XendraTrl(Identifier="d2177505-d470-e8e5-f01a-5211ebcb92a4")
public static String es_PE_FIELD_Invoice_DateInvoiced3_Help="La fecha de la factura indica la fecha impresa en la factura.";

@XendraField(AD_Column_ID="DateInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d2177505-d470-e8e5-f01a-5211ebcb92a4")
public static final String FIELDNAME_Invoice_DateInvoiced3="d2177505-d470-e8e5-f01a-5211ebcb92a4";

@XendraTrl(Identifier="a4fa5f0e-6d76-89c3-ffc1-eff24d2ad54e")
public static String es_PE_FIELD_Invoice_DateInvoiced4_Name="Fecha de Facturación";

@XendraTrl(Identifier="a4fa5f0e-6d76-89c3-ffc1-eff24d2ad54e")
public static String es_PE_FIELD_Invoice_DateInvoiced4_Description="Fecha impresa en la factura";

@XendraTrl(Identifier="a4fa5f0e-6d76-89c3-ffc1-eff24d2ad54e")
public static String es_PE_FIELD_Invoice_DateInvoiced4_Help="La fecha de la factura indica la fecha impresa en la factura.";

@XendraField(AD_Column_ID="DateInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a4fa5f0e-6d76-89c3-ffc1-eff24d2ad54e")
public static final String FIELDNAME_Invoice_DateInvoiced4="a4fa5f0e-6d76-89c3-ffc1-eff24d2ad54e";

@XendraTrl(Identifier="9795aad6-33ac-f7af-c449-9c2b31845712")
public static String es_PE_FIELD_PartnerInvoices_DateInvoiced_Name="Fecha de Facturación";

@XendraTrl(Identifier="9795aad6-33ac-f7af-c449-9c2b31845712")
public static String es_PE_FIELD_PartnerInvoices_DateInvoiced_Description="Fecha impresa en la factura";

@XendraTrl(Identifier="9795aad6-33ac-f7af-c449-9c2b31845712")
public static String es_PE_FIELD_PartnerInvoices_DateInvoiced_Help="La fecha de la factura indica la fecha impresa en la factura.";

@XendraField(AD_Column_ID="DateInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9795aad6-33ac-f7af-c449-9c2b31845712")
public static final String FIELDNAME_PartnerInvoices_DateInvoiced="9795aad6-33ac-f7af-c449-9c2b31845712";

@XendraTrl(Identifier="1ed5db2f-0ba7-7dc4-0ea6-eac648d26dfe")
public static String es_PE_FIELD_Invoices_DateInvoiced_Name="Fecha de Facturación";

@XendraTrl(Identifier="1ed5db2f-0ba7-7dc4-0ea6-eac648d26dfe")
public static String es_PE_FIELD_Invoices_DateInvoiced_Description="Fecha impresa en la factura";

@XendraTrl(Identifier="1ed5db2f-0ba7-7dc4-0ea6-eac648d26dfe")
public static String es_PE_FIELD_Invoices_DateInvoiced_Help="La fecha de la factura indica la fecha impresa en la factura.";

@XendraField(AD_Column_ID="DateInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1ed5db2f-0ba7-7dc4-0ea6-eac648d26dfe")
public static final String FIELDNAME_Invoices_DateInvoiced="1ed5db2f-0ba7-7dc4-0ea6-eac648d26dfe";

@XendraTrl(Identifier="fd6f3472-4972-5c31-bbc1-b2e8d63186f5")
public static String es_PE_COLUMN_DateInvoiced_Name="Fecha de Facturación";

@XendraColumn(AD_Element_ID="5e3c1a65-f97d-82ed-a21c-bc730ca3c080",ColumnName="DateInvoiced",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,
DefaultValue="@SysDate@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=true,SeqNo=2,IsTranslated=false,
Callout="org.compiere.model.CalloutEngine.dateAcct",VFormat="",ValueMin="",ValueMax="",Version="1",
IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="fd6f3472-4972-5c31-bbc1-b2e8d63186f5",Synchronized="2020-03-03 21:36:57.0")
/** Column name DateInvoiced */
public static final String COLUMNNAME_DateInvoiced = "DateInvoiced";
/** Set Date Ordered.
@param DateOrdered Date of Order */
public void setDateOrdered (Timestamp DateOrdered)
{
set_ValueNoCheck (COLUMNNAME_DateOrdered, DateOrdered);
}
/** Get Date Ordered.
@return Date of Order */
public Timestamp getDateOrdered() 
{
return (Timestamp)get_Value(COLUMNNAME_DateOrdered);
}

@XendraTrl(Identifier="3b940691-f959-7483-0d10-51c8d034e81c")
public static String es_PE_FIELD_Invoice_DateOrdered_Name="Fecha de la Orden";

@XendraTrl(Identifier="3b940691-f959-7483-0d10-51c8d034e81c")
public static String es_PE_FIELD_Invoice_DateOrdered_Description="Fecha de la orden";

@XendraTrl(Identifier="3b940691-f959-7483-0d10-51c8d034e81c")
public static String es_PE_FIELD_Invoice_DateOrdered_Help="Indica la fecha en que un artículo fue ordenada";

@XendraField(AD_Column_ID="DateOrdered",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3b940691-f959-7483-0d10-51c8d034e81c")
public static final String FIELDNAME_Invoice_DateOrdered="3b940691-f959-7483-0d10-51c8d034e81c";

@XendraTrl(Identifier="b4a3ed18-90f9-1e60-018d-4359f7a5ee9e")
public static String es_PE_FIELD_Invoice_DateOrdered2_Name="Fecha de la Orden";

@XendraTrl(Identifier="b4a3ed18-90f9-1e60-018d-4359f7a5ee9e")
public static String es_PE_FIELD_Invoice_DateOrdered2_Description="Fecha de la orden";

@XendraTrl(Identifier="b4a3ed18-90f9-1e60-018d-4359f7a5ee9e")
public static String es_PE_FIELD_Invoice_DateOrdered2_Help="Indica la fecha en que un artículo fue ordenada";

@XendraField(AD_Column_ID="DateOrdered",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b4a3ed18-90f9-1e60-018d-4359f7a5ee9e")
public static final String FIELDNAME_Invoice_DateOrdered2="b4a3ed18-90f9-1e60-018d-4359f7a5ee9e";

@XendraTrl(Identifier="ad3b269c-bf24-f835-d17b-099ca0861546")
public static String es_PE_FIELD_Invoice_DateOrdered3_Name="Fecha de la Orden";

@XendraTrl(Identifier="ad3b269c-bf24-f835-d17b-099ca0861546")
public static String es_PE_FIELD_Invoice_DateOrdered3_Description="Fecha de la orden";

@XendraTrl(Identifier="ad3b269c-bf24-f835-d17b-099ca0861546")
public static String es_PE_FIELD_Invoice_DateOrdered3_Help="Indica la fecha en que un artículo fue ordenada";

@XendraField(AD_Column_ID="DateOrdered",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ad3b269c-bf24-f835-d17b-099ca0861546")
public static final String FIELDNAME_Invoice_DateOrdered3="ad3b269c-bf24-f835-d17b-099ca0861546";

@XendraTrl(Identifier="52b01482-0e09-8b65-04cb-fedd5f3f90de")
public static String es_PE_FIELD_Invoice_DateOrdered4_Name="Fecha de la Orden";

@XendraTrl(Identifier="52b01482-0e09-8b65-04cb-fedd5f3f90de")
public static String es_PE_FIELD_Invoice_DateOrdered4_Description="Fecha de la orden";

@XendraTrl(Identifier="52b01482-0e09-8b65-04cb-fedd5f3f90de")
public static String es_PE_FIELD_Invoice_DateOrdered4_Help="Indica la fecha en que un artículo fue ordenada";

@XendraField(AD_Column_ID="DateOrdered",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="52b01482-0e09-8b65-04cb-fedd5f3f90de")
public static final String FIELDNAME_Invoice_DateOrdered4="52b01482-0e09-8b65-04cb-fedd5f3f90de";

@XendraTrl(Identifier="0be303f4-e877-4314-bea2-55876f19fd5f")
public static String es_PE_FIELD_PartnerInvoices_DateOrdered_Name="Fecha de la Orden";

@XendraTrl(Identifier="0be303f4-e877-4314-bea2-55876f19fd5f")
public static String es_PE_FIELD_PartnerInvoices_DateOrdered_Description="Fecha de la orden";

@XendraTrl(Identifier="0be303f4-e877-4314-bea2-55876f19fd5f")
public static String es_PE_FIELD_PartnerInvoices_DateOrdered_Help="Indica la fecha en que un artículo fue ordenada";

@XendraField(AD_Column_ID="DateOrdered",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0be303f4-e877-4314-bea2-55876f19fd5f")
public static final String FIELDNAME_PartnerInvoices_DateOrdered="0be303f4-e877-4314-bea2-55876f19fd5f";

@XendraTrl(Identifier="44ce8998-53fc-c4c8-5e3f-32950cdf81e3")
public static String es_PE_FIELD_Invoices_DateOrdered_Name="Fecha de la Orden";

@XendraTrl(Identifier="44ce8998-53fc-c4c8-5e3f-32950cdf81e3")
public static String es_PE_FIELD_Invoices_DateOrdered_Description="Fecha de la orden";

@XendraTrl(Identifier="44ce8998-53fc-c4c8-5e3f-32950cdf81e3")
public static String es_PE_FIELD_Invoices_DateOrdered_Help="Indica la fecha en que un artículo fue ordenada";

@XendraField(AD_Column_ID="DateOrdered",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="44ce8998-53fc-c4c8-5e3f-32950cdf81e3")
public static final String FIELDNAME_Invoices_DateOrdered="44ce8998-53fc-c4c8-5e3f-32950cdf81e3";

@XendraTrl(Identifier="9b2a91c2-0647-5069-2c95-ae20b6c9e7f5")
public static String es_PE_COLUMN_DateOrdered_Name="Fecha de la Orden";

@XendraColumn(AD_Element_ID="c265ae59-eec5-5c6b-26ee-1090bf37ce26",ColumnName="DateOrdered",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9b2a91c2-0647-5069-2c95-ae20b6c9e7f5",
Synchronized="2020-03-03 21:36:57.0")
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

@XendraTrl(Identifier="1531d28a-63e4-82df-1f60-314e110b291a")
public static String es_PE_FIELD_Invoice_DatePrinted_Name="Fecha de Impresión";

@XendraTrl(Identifier="1531d28a-63e4-82df-1f60-314e110b291a")
public static String es_PE_FIELD_Invoice_DatePrinted_Description="Fecha en que el documento fue impreso";

@XendraTrl(Identifier="1531d28a-63e4-82df-1f60-314e110b291a")
public static String es_PE_FIELD_Invoice_DatePrinted_Help="Indica la fecha en que este documento se imprimió.";

@XendraField(AD_Column_ID="DatePrinted",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1531d28a-63e4-82df-1f60-314e110b291a")
public static final String FIELDNAME_Invoice_DatePrinted="1531d28a-63e4-82df-1f60-314e110b291a";

@XendraTrl(Identifier="b8784302-b1b2-615d-94b1-4f3e52c2f9f9")
public static String es_PE_FIELD_Invoice_DatePrinted2_Name="Fecha de Impresión";

@XendraTrl(Identifier="b8784302-b1b2-615d-94b1-4f3e52c2f9f9")
public static String es_PE_FIELD_Invoice_DatePrinted2_Description="Fecha en que el documento fue impreso";

@XendraTrl(Identifier="b8784302-b1b2-615d-94b1-4f3e52c2f9f9")
public static String es_PE_FIELD_Invoice_DatePrinted2_Help="Indica la fecha en que este documento se imprimió.";

@XendraField(AD_Column_ID="DatePrinted",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b8784302-b1b2-615d-94b1-4f3e52c2f9f9")
public static final String FIELDNAME_Invoice_DatePrinted2="b8784302-b1b2-615d-94b1-4f3e52c2f9f9";

@XendraTrl(Identifier="6a77f89d-b471-8917-0e44-8ca5c5fca14e")
public static String es_PE_FIELD_Invoice_DatePrinted3_Name="Fecha de Impresión";

@XendraTrl(Identifier="6a77f89d-b471-8917-0e44-8ca5c5fca14e")
public static String es_PE_FIELD_Invoice_DatePrinted3_Description="Fecha en que el documento fue impreso";

@XendraTrl(Identifier="6a77f89d-b471-8917-0e44-8ca5c5fca14e")
public static String es_PE_FIELD_Invoice_DatePrinted3_Help="Indica la fecha en que este documento se imprimió.";

@XendraField(AD_Column_ID="DatePrinted",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6a77f89d-b471-8917-0e44-8ca5c5fca14e")
public static final String FIELDNAME_Invoice_DatePrinted3="6a77f89d-b471-8917-0e44-8ca5c5fca14e";

@XendraTrl(Identifier="34ffbb21-e681-a319-e6c0-dc1af7642ebe")
public static String es_PE_FIELD_Invoice_DatePrinted4_Name="Fecha de Impresión";

@XendraTrl(Identifier="34ffbb21-e681-a319-e6c0-dc1af7642ebe")
public static String es_PE_FIELD_Invoice_DatePrinted4_Description="Fecha en que el documento fue impreso";

@XendraTrl(Identifier="34ffbb21-e681-a319-e6c0-dc1af7642ebe")
public static String es_PE_FIELD_Invoice_DatePrinted4_Help="Indica la fecha en que este documento se imprimió.";

@XendraField(AD_Column_ID="DatePrinted",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="34ffbb21-e681-a319-e6c0-dc1af7642ebe")
public static final String FIELDNAME_Invoice_DatePrinted4="34ffbb21-e681-a319-e6c0-dc1af7642ebe";

@XendraTrl(Identifier="49ae8527-a1c3-e8a9-0ca1-ef41b60f27b1")
public static String es_PE_FIELD_PartnerInvoices_DatePrinted_Name="Fecha de Impresión";

@XendraTrl(Identifier="49ae8527-a1c3-e8a9-0ca1-ef41b60f27b1")
public static String es_PE_FIELD_PartnerInvoices_DatePrinted_Description="Fecha en que el documento fue impreso";

@XendraTrl(Identifier="49ae8527-a1c3-e8a9-0ca1-ef41b60f27b1")
public static String es_PE_FIELD_PartnerInvoices_DatePrinted_Help="Indica la fecha en que este documento se imprimió.";

@XendraField(AD_Column_ID="DatePrinted",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="49ae8527-a1c3-e8a9-0ca1-ef41b60f27b1")
public static final String FIELDNAME_PartnerInvoices_DatePrinted="49ae8527-a1c3-e8a9-0ca1-ef41b60f27b1";

@XendraTrl(Identifier="791b2843-ca0c-db74-c427-d942e27d5690")
public static String es_PE_FIELD_Invoices_DatePrinted_Name="Fecha de Impresión";

@XendraTrl(Identifier="791b2843-ca0c-db74-c427-d942e27d5690")
public static String es_PE_FIELD_Invoices_DatePrinted_Description="Fecha en que el documento fue impreso";

@XendraTrl(Identifier="791b2843-ca0c-db74-c427-d942e27d5690")
public static String es_PE_FIELD_Invoices_DatePrinted_Help="Indica la fecha en que este documento se imprimió.";

@XendraField(AD_Column_ID="DatePrinted",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="791b2843-ca0c-db74-c427-d942e27d5690")
public static final String FIELDNAME_Invoices_DatePrinted="791b2843-ca0c-db74-c427-d942e27d5690";

@XendraTrl(Identifier="389d30e8-dacc-821c-f1c3-d9194570f9fb")
public static String es_PE_COLUMN_DatePrinted_Name="Fecha de Impresión";

@XendraColumn(AD_Element_ID="0b68d937-f4a8-8b9d-aeeb-b029c126580d",ColumnName="DatePrinted",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="389d30e8-dacc-821c-f1c3-d9194570f9fb",
Synchronized="2020-03-03 21:36:57.0")
/** Column name DatePrinted */
public static final String COLUMNNAME_DatePrinted = "DatePrinted";
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

@XendraTrl(Identifier="34c67ad9-b69b-4d49-b4c2-61b7dcaec061")
public static String es_PE_FIELD_Invoice_DebtAmt_Name="DebtAmt";

@XendraField(AD_Column_ID="DebtAmt",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=131089,IsReadOnly=false,SeqNo=520,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-06 14:47:15.0",
Identifier="34c67ad9-b69b-4d49-b4c2-61b7dcaec061")
public static final String FIELDNAME_Invoice_DebtAmt="34c67ad9-b69b-4d49-b4c2-61b7dcaec061";

@XendraTrl(Identifier="5de418b2-618d-4734-87ab-99f45b901616")
public static String es_PE_FIELD_Invoice_DebtAmt2_Name="DebtAmt";

@XendraField(AD_Column_ID="DebtAmt",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=131089,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-08-30 18:45:39.0",
Identifier="5de418b2-618d-4734-87ab-99f45b901616")
public static final String FIELDNAME_Invoice_DebtAmt2="5de418b2-618d-4734-87ab-99f45b901616";

@XendraTrl(Identifier="892b7eda-c99f-4072-a548-1747f3d78c33")
public static String es_PE_COLUMN_DebtAmt_Name="DebtAmt";

@XendraColumn(AD_Element_ID="1b6b41c5-29d8-fdb3-fc2b-e4d5423fec46",ColumnName="DebtAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="892b7eda-c99f-4072-a548-1747f3d78c33",
Synchronized="2020-03-03 21:36:57.0")
/** Column name DebtAmt */
public static final String COLUMNNAME_DebtAmt = "DebtAmt";
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

@XendraTrl(Identifier="19f7e16a-5e9d-81a4-f14e-286d2f713f74")
public static String es_PE_FIELD_Invoice_Description_Name="Observación";

@XendraTrl(Identifier="19f7e16a-5e9d-81a4-f14e-286d2f713f74")
public static String es_PE_FIELD_Invoice_Description_Description="Descripción corta opcional del registro";

@XendraTrl(Identifier="19f7e16a-5e9d-81a4-f14e-286d2f713f74")
public static String es_PE_FIELD_Invoice_Description_Help="Una descripción esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=290,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="19f7e16a-5e9d-81a4-f14e-286d2f713f74")
public static final String FIELDNAME_Invoice_Description="19f7e16a-5e9d-81a4-f14e-286d2f713f74";

@XendraTrl(Identifier="f7f5ec18-e7ee-375d-2f42-c7da52b6b5aa")
public static String es_PE_FIELD_Invoice_Description2_Name="Observación";

@XendraTrl(Identifier="f7f5ec18-e7ee-375d-2f42-c7da52b6b5aa")
public static String es_PE_FIELD_Invoice_Description2_Description="Descripción corta opcional del registro";

@XendraTrl(Identifier="f7f5ec18-e7ee-375d-2f42-c7da52b6b5aa")
public static String es_PE_FIELD_Invoice_Description2_Help="Una descripción esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=290,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f7f5ec18-e7ee-375d-2f42-c7da52b6b5aa")
public static final String FIELDNAME_Invoice_Description2="f7f5ec18-e7ee-375d-2f42-c7da52b6b5aa";

@XendraTrl(Identifier="5903e3f4-7b70-ceb4-e402-a39314f102cb")
public static String es_PE_FIELD_Invoice_Description3_Name="Observación";

@XendraTrl(Identifier="5903e3f4-7b70-ceb4-e402-a39314f102cb")
public static String es_PE_FIELD_Invoice_Description3_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="5903e3f4-7b70-ceb4-e402-a39314f102cb")
public static String es_PE_FIELD_Invoice_Description3_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5903e3f4-7b70-ceb4-e402-a39314f102cb")
public static final String FIELDNAME_Invoice_Description3="5903e3f4-7b70-ceb4-e402-a39314f102cb";

@XendraTrl(Identifier="5fe26683-dbdc-c246-5c87-737a408fe480")
public static String es_PE_FIELD_Invoice_Description4_Name="Observación";

@XendraTrl(Identifier="5fe26683-dbdc-c246-5c87-737a408fe480")
public static String es_PE_FIELD_Invoice_Description4_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="5fe26683-dbdc-c246-5c87-737a408fe480")
public static String es_PE_FIELD_Invoice_Description4_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5fe26683-dbdc-c246-5c87-737a408fe480")
public static final String FIELDNAME_Invoice_Description4="5fe26683-dbdc-c246-5c87-737a408fe480";

@XendraTrl(Identifier="7cf58ef8-f960-65bf-3734-dd280d68bbe9")
public static String es_PE_FIELD_PartnerInvoices_Description_Name="Observación";

@XendraTrl(Identifier="7cf58ef8-f960-65bf-3734-dd280d68bbe9")
public static String es_PE_FIELD_PartnerInvoices_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="7cf58ef8-f960-65bf-3734-dd280d68bbe9")
public static String es_PE_FIELD_PartnerInvoices_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7cf58ef8-f960-65bf-3734-dd280d68bbe9")
public static final String FIELDNAME_PartnerInvoices_Description="7cf58ef8-f960-65bf-3734-dd280d68bbe9";

@XendraTrl(Identifier="e5db0f4d-250f-47b5-2bec-33bf1ef1a836")
public static String es_PE_FIELD_Invoices_Description_Name="Observación";

@XendraTrl(Identifier="e5db0f4d-250f-47b5-2bec-33bf1ef1a836")
public static String es_PE_FIELD_Invoices_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="e5db0f4d-250f-47b5-2bec-33bf1ef1a836")
public static String es_PE_FIELD_Invoices_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e5db0f4d-250f-47b5-2bec-33bf1ef1a836")
public static final String FIELDNAME_Invoices_Description="e5db0f4d-250f-47b5-2bec-33bf1ef1a836";

@XendraTrl(Identifier="e6292862-edfe-3ccf-3859-2dda35f7e5a2")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="e6292862-edfe-3ccf-3859-2dda35f7e5a2",
Synchronized="2020-03-03 21:36:57.0")
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

@XendraTrl(Identifier="0de0beea-46f9-4f75-9ac3-2fb8185b7f3a")
public static String es_PE_FIELD_Invoice_Difference_Name="Diferencia monto";

@XendraField(AD_Column_ID="DifferenceAmt",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=131089,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-06 14:47:16.0",
Identifier="0de0beea-46f9-4f75-9ac3-2fb8185b7f3a")
public static final String FIELDNAME_Invoice_Difference="0de0beea-46f9-4f75-9ac3-2fb8185b7f3a";

@XendraTrl(Identifier="9d60a1d3-01cf-4e40-930d-078885ebe495")
public static String es_PE_FIELD_Invoice_Difference2_Name="Diferencia monto";

@XendraField(AD_Column_ID="DifferenceAmt",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=131089,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-08-30 18:45:39.0",
Identifier="9d60a1d3-01cf-4e40-930d-078885ebe495")
public static final String FIELDNAME_Invoice_Difference2="9d60a1d3-01cf-4e40-930d-078885ebe495";

@XendraTrl(Identifier="9269967b-6b31-46cd-9294-fa8caeba6adf")
public static String es_PE_COLUMN_DifferenceAmt_Name="Difference";

@XendraColumn(AD_Element_ID="62840044-943e-7971-69a5-7954e25dfe29",ColumnName="DifferenceAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9269967b-6b31-46cd-9294-fa8caeba6adf",
Synchronized="2020-03-03 21:36:57.0")
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

@XendraTrl(Identifier="9cb94e60-0d4a-f076-7e75-38859f9e5d4d")
public static String es_PE_FIELD_Invoice_DocumentAction_Name="Procesar Factura";

@XendraField(AD_Column_ID="DocAction",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=350,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9cb94e60-0d4a-f076-7e75-38859f9e5d4d")
public static final String FIELDNAME_Invoice_DocumentAction="9cb94e60-0d4a-f076-7e75-38859f9e5d4d";

@XendraTrl(Identifier="5ad41a92-daf0-50e0-4df7-7914f34faebd")
public static String es_PE_FIELD_Invoice_DocumentAction2_Name="Procesar Factura";

@XendraField(AD_Column_ID="DocAction",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=360,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5ad41a92-daf0-50e0-4df7-7914f34faebd")
public static final String FIELDNAME_Invoice_DocumentAction2="5ad41a92-daf0-50e0-4df7-7914f34faebd";

@XendraTrl(Identifier="97e9f45d-b417-4866-ff10-df7122173e64")
public static String es_PE_FIELD_Invoice_DocumentAction3_Name="Procesar Factura";

@XendraField(AD_Column_ID="DocAction",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=270,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="97e9f45d-b417-4866-ff10-df7122173e64")
public static final String FIELDNAME_Invoice_DocumentAction3="97e9f45d-b417-4866-ff10-df7122173e64";

@XendraTrl(Identifier="22998024-f453-ff44-1f2f-e52431272ce7")
public static String es_PE_FIELD_Invoice_DocumentAction4_Name="Procesar Factura";

@XendraField(AD_Column_ID="DocAction",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="22998024-f453-ff44-1f2f-e52431272ce7")
public static final String FIELDNAME_Invoice_DocumentAction4="22998024-f453-ff44-1f2f-e52431272ce7";

@XendraTrl(Identifier="10e9f00e-dd99-fcbe-570f-56f04feb332e")
public static String es_PE_FIELD_PartnerInvoices_DocumentAction_Name="Procesar Factura";

@XendraField(AD_Column_ID="DocAction",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="10e9f00e-dd99-fcbe-570f-56f04feb332e")
public static final String FIELDNAME_PartnerInvoices_DocumentAction="10e9f00e-dd99-fcbe-570f-56f04feb332e";

@XendraTrl(Identifier="9568bdce-92b6-7a19-1bb1-f87e8d45f5cb")
public static String es_PE_FIELD_Invoices_DocumentAction_Name="Procesar Factura";

@XendraField(AD_Column_ID="DocAction",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9568bdce-92b6-7a19-1bb1-f87e8d45f5cb")
public static final String FIELDNAME_Invoices_DocumentAction="9568bdce-92b6-7a19-1bb1-f87e8d45f5cb";

@XendraTrl(Identifier="a9fac3f7-91ce-8227-4628-f5e3bc07019d")
public static String es_PE_COLUMN_DocAction_Name="Acción en el Documento";

@XendraColumn(AD_Element_ID="d4b9075b-18e5-ebbb-5565-d217a7e531cb",ColumnName="DocAction",
AD_Reference_ID=28,AD_Reference_Value_ID="e397c9b0-c643-d1cd-8380-20bee13b2a6e",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="CO",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,
AD_Process_ID="d2a0c97f-2078-edb6-9506-e4c2c9315366",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a9fac3f7-91ce-8227-4628-f5e3bc07019d",
Synchronized="2020-03-03 21:36:57.0")
/** Column name DocAction */
public static final String COLUMNNAME_DocAction = "DocAction";
/** Set DocDetraction.
@param DocDetraction DocDetraction */
public void setDocDetraction (String DocDetraction)
{
if (DocDetraction != null && DocDetraction.length() > 30)
{
log.warning("Length > 30 - truncated");
DocDetraction = DocDetraction.substring(0,29);
}
set_Value (COLUMNNAME_DocDetraction, DocDetraction);
}
/** Get DocDetraction.
@return DocDetraction */
public String getDocDetraction() 
{
String value = (String)get_Value(COLUMNNAME_DocDetraction);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="cc19ca79-51e4-41d9-afa6-43c992f3c3eb")
public static String es_PE_FIELD_Invoice_DocDetraction_Name="docdetraction";

@XendraField(AD_Column_ID="DocDetraction",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=30,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-06 14:47:16.0",
Identifier="cc19ca79-51e4-41d9-afa6-43c992f3c3eb")
public static final String FIELDNAME_Invoice_DocDetraction="cc19ca79-51e4-41d9-afa6-43c992f3c3eb";

@XendraTrl(Identifier="ad024342-cecc-4099-b33b-a95db06c140d")
public static String es_PE_FIELD_Invoice_DocDetraction2_Name="N-Doc.Det";

@XendraField(AD_Column_ID="DocDetraction",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsDetraction@=Y",DisplayLength=10,IsReadOnly=false,SeqNo=480,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2016-08-30 18:45:39.0",Identifier="ad024342-cecc-4099-b33b-a95db06c140d")
public static final String FIELDNAME_Invoice_DocDetraction2="ad024342-cecc-4099-b33b-a95db06c140d";

@XendraTrl(Identifier="8a12969b-29bc-4295-8fba-a436102d2ba7")
public static String es_PE_COLUMN_DocDetraction_Name="docdetraction";

@XendraColumn(AD_Element_ID="24fac7fd-9fb8-41ad-b005-5c127f56469d",ColumnName="DocDetraction",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="8a12969b-29bc-4295-8fba-a436102d2ba7",
Synchronized="2020-03-03 21:36:57.0")
/** Column name DocDetraction */
public static final String COLUMNNAME_DocDetraction = "DocDetraction";
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

@XendraTrl(Identifier="1a2bae7d-8d5b-eba6-450d-5007bb7178a4")
public static String es_PE_FIELD_Invoice_DocumentStatus_Name="Estado del Documento";

@XendraTrl(Identifier="1a2bae7d-8d5b-eba6-450d-5007bb7178a4")
public static String es_PE_FIELD_Invoice_DocumentStatus_Description="El estado actual del documento";

@XendraTrl(Identifier="1a2bae7d-8d5b-eba6-450d-5007bb7178a4")
public static String es_PE_FIELD_Invoice_DocumentStatus_Help="El estado del documento indica el estado del documento en este momento. Si usted quiere cambiar el estado de Documento; use el campo acción de documento";

@XendraField(AD_Column_ID="DocStatus",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=410,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1a2bae7d-8d5b-eba6-450d-5007bb7178a4")
public static final String FIELDNAME_Invoice_DocumentStatus="1a2bae7d-8d5b-eba6-450d-5007bb7178a4";

@XendraTrl(Identifier="e405a73a-b4ba-ade9-ad6a-36ac2b1e264a")
public static String es_PE_FIELD_Invoice_DocumentStatus2_Name="Estado del Documento";

@XendraTrl(Identifier="e405a73a-b4ba-ade9-ad6a-36ac2b1e264a")
public static String es_PE_FIELD_Invoice_DocumentStatus2_Description="El estado actual del documento";

@XendraTrl(Identifier="e405a73a-b4ba-ade9-ad6a-36ac2b1e264a")
public static String es_PE_FIELD_Invoice_DocumentStatus2_Help="El estado del documento indica el estado del documento en este momento. Si usted quiere cambiar el estado de Documento; use el campo acción de documento";

@XendraField(AD_Column_ID="DocStatus",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=400,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e405a73a-b4ba-ade9-ad6a-36ac2b1e264a")
public static final String FIELDNAME_Invoice_DocumentStatus2="e405a73a-b4ba-ade9-ad6a-36ac2b1e264a";

@XendraTrl(Identifier="b27f1487-b7af-7ced-f05f-f6891360370e")
public static String es_PE_FIELD_Invoice_DocumentStatus3_Name="Estado del Documento";

@XendraTrl(Identifier="b27f1487-b7af-7ced-f05f-f6891360370e")
public static String es_PE_FIELD_Invoice_DocumentStatus3_Description="El estado actual del documento";

@XendraTrl(Identifier="b27f1487-b7af-7ced-f05f-f6891360370e")
public static String es_PE_FIELD_Invoice_DocumentStatus3_Help="El estado del documento indica el estado del documento en este momento. Si usted quiere cambiar el estado de Documento; use el campo acción de documento";

@XendraField(AD_Column_ID="DocStatus",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=250,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b27f1487-b7af-7ced-f05f-f6891360370e")
public static final String FIELDNAME_Invoice_DocumentStatus3="b27f1487-b7af-7ced-f05f-f6891360370e";

@XendraTrl(Identifier="c8c75c1b-17bb-90ce-7f1b-c53771a50f82")
public static String es_PE_FIELD_Invoice_DocumentStatus4_Name="Estado del Documento";

@XendraTrl(Identifier="c8c75c1b-17bb-90ce-7f1b-c53771a50f82")
public static String es_PE_FIELD_Invoice_DocumentStatus4_Description="El estado actual del documento";

@XendraTrl(Identifier="c8c75c1b-17bb-90ce-7f1b-c53771a50f82")
public static String es_PE_FIELD_Invoice_DocumentStatus4_Help="El estado del documento indica el estado del documento en este momento. Si usted quiere cambiar el estado de Documento; use el campo acción de documento";

@XendraField(AD_Column_ID="DocStatus",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c8c75c1b-17bb-90ce-7f1b-c53771a50f82")
public static final String FIELDNAME_Invoice_DocumentStatus4="c8c75c1b-17bb-90ce-7f1b-c53771a50f82";

@XendraTrl(Identifier="51254140-cb43-6341-c5c4-ef0f2c02ebe8")
public static String es_PE_FIELD_PartnerInvoices_DocumentStatus_Name="Estado del Documento";

@XendraTrl(Identifier="51254140-cb43-6341-c5c4-ef0f2c02ebe8")
public static String es_PE_FIELD_PartnerInvoices_DocumentStatus_Description="El estado actual del documento";

@XendraTrl(Identifier="51254140-cb43-6341-c5c4-ef0f2c02ebe8")
public static String es_PE_FIELD_PartnerInvoices_DocumentStatus_Help="El estado del documento indica el estado del documento en este momento. Si usted quiere cambiar el estado de Documento; use el campo acción de documento";

@XendraField(AD_Column_ID="DocStatus",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="51254140-cb43-6341-c5c4-ef0f2c02ebe8")
public static final String FIELDNAME_PartnerInvoices_DocumentStatus="51254140-cb43-6341-c5c4-ef0f2c02ebe8";

@XendraTrl(Identifier="3212a4dd-0c08-afde-3583-d60e0e7b65fe")
public static String es_PE_FIELD_Invoices_DocumentStatus_Name="Estado del Documento";

@XendraTrl(Identifier="3212a4dd-0c08-afde-3583-d60e0e7b65fe")
public static String es_PE_FIELD_Invoices_DocumentStatus_Description="El estado actual del documento";

@XendraTrl(Identifier="3212a4dd-0c08-afde-3583-d60e0e7b65fe")
public static String es_PE_FIELD_Invoices_DocumentStatus_Help="El estado del documento indica el estado del documento en este momento. Si usted quiere cambiar el estado de Documento; use el campo acción de documento";

@XendraField(AD_Column_ID="DocStatus",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3212a4dd-0c08-afde-3583-d60e0e7b65fe")
public static final String FIELDNAME_Invoices_DocumentStatus="3212a4dd-0c08-afde-3583-d60e0e7b65fe";

@XendraTrl(Identifier="6de4c965-ecb9-9244-23b6-086a175860fd")
public static String es_PE_COLUMN_DocStatus_Name="Estado del Documento";

@XendraColumn(AD_Element_ID="e73fa537-3438-bd01-dfd4-f0f080a28c55",ColumnName="DocStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="7627125d-fefe-e6bc-bb7d-4a6c772172dc",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="DR",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6de4c965-ecb9-9244-23b6-086a175860fd",Synchronized="2020-03-03 21:36:57.0")
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

@XendraTrl(Identifier="a815cb3f-fd1d-bd52-a93d-2fdd23e7086b")
public static String es_PE_FIELD_Invoice_DocumentNo_Name="Nº Doc.";

@XendraTrl(Identifier="a815cb3f-fd1d-bd52-a93d-2fdd23e7086b")
public static String es_PE_FIELD_Invoice_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="a815cb3f-fd1d-bd52-a93d-2fdd23e7086b")
public static String es_PE_FIELD_Invoice_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=40,SortNo=-1,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a815cb3f-fd1d-bd52-a93d-2fdd23e7086b")
public static final String FIELDNAME_Invoice_DocumentNo="a815cb3f-fd1d-bd52-a93d-2fdd23e7086b";

@XendraTrl(Identifier="2d2455d1-3d53-bc5f-0abb-e3e024e32c6c")
public static String es_PE_FIELD_Invoice_DocumentNo2_Name="Nº Doc";

@XendraTrl(Identifier="2d2455d1-3d53-bc5f-0abb-e3e024e32c6c")
public static String es_PE_FIELD_Invoice_DocumentNo2_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="2d2455d1-3d53-bc5f-0abb-e3e024e32c6c")
public static String es_PE_FIELD_Invoice_DocumentNo2_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=40,SortNo=-1,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2d2455d1-3d53-bc5f-0abb-e3e024e32c6c")
public static final String FIELDNAME_Invoice_DocumentNo2="2d2455d1-3d53-bc5f-0abb-e3e024e32c6c";

@XendraTrl(Identifier="43b1aae4-228f-d8d3-6f14-08e1482501e8")
public static String es_PE_FIELD_Invoice_DocumentNo3_Name="No. del Documento";

@XendraTrl(Identifier="43b1aae4-228f-d8d3-6f14-08e1482501e8")
public static String es_PE_FIELD_Invoice_DocumentNo3_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="43b1aae4-228f-d8d3-6f14-08e1482501e8")
public static String es_PE_FIELD_Invoice_DocumentNo3_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=30,SortNo=-1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="43b1aae4-228f-d8d3-6f14-08e1482501e8")
public static final String FIELDNAME_Invoice_DocumentNo3="43b1aae4-228f-d8d3-6f14-08e1482501e8";

@XendraTrl(Identifier="cce0321a-2675-9a67-a0d6-ad77856c14ef")
public static String es_PE_FIELD_Invoice_DocumentNo4_Name="No. del Documento";

@XendraTrl(Identifier="cce0321a-2675-9a67-a0d6-ad77856c14ef")
public static String es_PE_FIELD_Invoice_DocumentNo4_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="cce0321a-2675-9a67-a0d6-ad77856c14ef")
public static String es_PE_FIELD_Invoice_DocumentNo4_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=50,SortNo=1,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cce0321a-2675-9a67-a0d6-ad77856c14ef")
public static final String FIELDNAME_Invoice_DocumentNo4="cce0321a-2675-9a67-a0d6-ad77856c14ef";

@XendraTrl(Identifier="6fe60b8b-e5f7-fcf6-948b-e398e6d3a9b6")
public static String es_PE_FIELD_PartnerInvoices_DocumentNo_Name="No. del Documento";

@XendraTrl(Identifier="6fe60b8b-e5f7-fcf6-948b-e398e6d3a9b6")
public static String es_PE_FIELD_PartnerInvoices_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="6fe60b8b-e5f7-fcf6-948b-e398e6d3a9b6")
public static String es_PE_FIELD_PartnerInvoices_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=40,SortNo=2,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6fe60b8b-e5f7-fcf6-948b-e398e6d3a9b6")
public static final String FIELDNAME_PartnerInvoices_DocumentNo="6fe60b8b-e5f7-fcf6-948b-e398e6d3a9b6";

@XendraTrl(Identifier="37506b9f-a80a-a1e6-5cea-103ac6cea8e2")
public static String es_PE_FIELD_Invoices_DocumentNo_Name="No. del Documento";

@XendraTrl(Identifier="37506b9f-a80a-a1e6-5cea-103ac6cea8e2")
public static String es_PE_FIELD_Invoices_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="37506b9f-a80a-a1e6-5cea-103ac6cea8e2")
public static String es_PE_FIELD_Invoices_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="37506b9f-a80a-a1e6-5cea-103ac6cea8e2")
public static final String FIELDNAME_Invoices_DocumentNo="37506b9f-a80a-a1e6-5cea-103ac6cea8e2";

@XendraTrl(Identifier="51c3f415-79fc-980e-b4a4-6e0e19c9cd3b")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="51c3f415-79fc-980e-b4a4-6e0e19c9cd3b",
Synchronized="2020-03-03 21:36:57.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";
/** Set documentto.
@param documentto documentto */
public void setdocumentto (String documentto)
{
if (documentto != null && documentto.length() > 30)
{
log.warning("Length > 30 - truncated");
documentto = documentto.substring(0,29);
}
set_Value (COLUMNNAME_documentto, documentto);
}
/** Get documentto.
@return documentto */
public String getdocumentto() 
{
String value = (String)get_Value(COLUMNNAME_documentto);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="dda8a35e-ac83-445d-9f7c-1f6e0e398efa")
public static String es_PE_COLUMN_documentto_Name="documentto";

@XendraColumn(AD_Element_ID="b80459d4-289c-4494-ae17-14ff2f072278",ColumnName="documentto",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dda8a35e-ac83-445d-9f7c-1f6e0e398efa",
Synchronized="2020-03-03 21:36:57.0")
/** Column name documentto */
public static final String COLUMNNAME_documentto = "documentto";
/** Set Accounting Fact ID (per document).
@param Fact_ID This ID is guaranteed to be unique per client per year per document (in the fact table). */
public void setFact_ID (String Fact_ID)
{
if (Fact_ID != null && Fact_ID.length() > 20)
{
log.warning("Length > 20 - truncated");
Fact_ID = Fact_ID.substring(0,19);
}
set_ValueNoCheck (COLUMNNAME_Fact_ID, Fact_ID);
}
/** Get Accounting Fact ID (per document).
@return This ID is guaranteed to be unique per client per year per document (in the fact table). */
public String getFact_ID() 
{
String value = (String)get_Value(COLUMNNAME_Fact_ID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="0abb322b-d2c8-79d1-90ce-3c67a5717948")
public static String es_PE_FIELD_Journal_AccountingFactIDPerDocument_Name="ID Asiento Contable (por documento)";

@XendraTrl(Identifier="0abb322b-d2c8-79d1-90ce-3c67a5717948")
public static String es_PE_FIELD_Journal_AccountingFactIDPerDocument_Description="Se garantiza que este ID sea unico por cada cliente/ano/documento (en la tabla de asientos).";

@XendraField(AD_Column_ID="Fact_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6ea6a282-e86b-3f24-4644-8a69df5e4ea1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0abb322b-d2c8-79d1-90ce-3c67a5717948")
public static final String FIELDNAME_Journal_AccountingFactIDPerDocument="0abb322b-d2c8-79d1-90ce-3c67a5717948";

@XendraTrl(Identifier="8d1e0f42-3e93-d099-6d02-87e9b2b6c093")
public static String es_PE_FIELD_Shipment_AccountingFactIDPerDocument_Name="ID Asiento Contable";

@XendraTrl(Identifier="8d1e0f42-3e93-d099-6d02-87e9b2b6c093")
public static String es_PE_FIELD_Shipment_AccountingFactIDPerDocument_Description="Se garantiza que este ID sea unico por cada cliente/ano/documento (en la tabla de asientos).";

@XendraField(AD_Column_ID="Fact_ID",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=true,SeqNo=410,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8d1e0f42-3e93-d099-6d02-87e9b2b6c093")
public static final String FIELDNAME_Shipment_AccountingFactIDPerDocument="8d1e0f42-3e93-d099-6d02-87e9b2b6c093";

@XendraTrl(Identifier="e22bacfa-99ba-165b-14f2-b4630f20f40e")
public static String es_PE_FIELD_Invoice_AccountingFactIDPerDocument_Name="ID Asiento Contable";

@XendraTrl(Identifier="e22bacfa-99ba-165b-14f2-b4630f20f40e")
public static String es_PE_FIELD_Invoice_AccountingFactIDPerDocument_Description="Se garantiza que este ID sea unico por cada cliente/ano/documento (en la tabla de asientos).";

@XendraField(AD_Column_ID="Fact_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=440,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e22bacfa-99ba-165b-14f2-b4630f20f40e")
public static final String FIELDNAME_Invoice_AccountingFactIDPerDocument="e22bacfa-99ba-165b-14f2-b4630f20f40e";

@XendraTrl(Identifier="399f84ea-9399-8c22-117b-08995e9c089d")
public static String es_PE_FIELD_Invoice_AccountingFactIDPerDocument2_Name="ID Asiento Contable";

@XendraTrl(Identifier="399f84ea-9399-8c22-117b-08995e9c089d")
public static String es_PE_FIELD_Invoice_AccountingFactIDPerDocument2_Description="Se garantiza que este ID sea unico por cada cliente/ano/documento (en la tabla de asientos).";

@XendraField(AD_Column_ID="Fact_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=420,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="399f84ea-9399-8c22-117b-08995e9c089d")
public static final String FIELDNAME_Invoice_AccountingFactIDPerDocument2="399f84ea-9399-8c22-117b-08995e9c089d";

@XendraTrl(Identifier="e6e946ac-f339-6d8c-842d-3e0c81c69dfe")
public static String es_PE_FIELD_MaterialReceipt_AccountingFactIDPerDocument_Name="ID Asiento Contable";

@XendraTrl(Identifier="e6e946ac-f339-6d8c-842d-3e0c81c69dfe")
public static String es_PE_FIELD_MaterialReceipt_AccountingFactIDPerDocument_Description="Se garantiza que este ID sea unico por cada cliente/ano/documento (en la tabla de asientos).";

@XendraField(AD_Column_ID="Fact_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=350,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e6e946ac-f339-6d8c-842d-3e0c81c69dfe")
public static final String FIELDNAME_MaterialReceipt_AccountingFactIDPerDocument="e6e946ac-f339-6d8c-842d-3e0c81c69dfe";

@XendraTrl(Identifier="509dfe16-5b12-e262-2c51-4be6cd5f3fe8")
public static String es_PE_FIELD_Allocation_AccountingFactIDPerDocument_Name="ID Asiento Contable (por documento)";

@XendraTrl(Identifier="509dfe16-5b12-e262-2c51-4be6cd5f3fe8")
public static String es_PE_FIELD_Allocation_AccountingFactIDPerDocument_Description="Se garantiza que este ID sea unico por cada cliente/ano/documento (en la tabla de asientos).";

@XendraField(AD_Column_ID="Fact_ID",IsCentrallyMaintained=true,
AD_Tab_ID="188fac8e-5839-9bec-38d7-9ed132ba9e81",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="509dfe16-5b12-e262-2c51-4be6cd5f3fe8")
public static final String FIELDNAME_Allocation_AccountingFactIDPerDocument="509dfe16-5b12-e262-2c51-4be6cd5f3fe8";

@XendraTrl(Identifier="164baeed-0b16-3bf4-be98-b69e5c632014")
public static String es_PE_COLUMN_Fact_ID_Name="ID Asiento Contable (por documento)";

@XendraColumn(AD_Element_ID="20f6c8ee-0151-735b-7a03-2006e09d8eb0",ColumnName="Fact_ID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="164baeed-0b16-3bf4-be98-b69e5c632014",
Synchronized="2020-03-03 21:36:57.0")
/** Column name Fact_ID */
public static final String COLUMNNAME_Fact_ID = "Fact_ID";
/** Set Generate To.
@param GenerateTo Generate To */
public void setGenerateTo (String GenerateTo)
{
if (GenerateTo != null && GenerateTo.length() > 1)
{
log.warning("Length > 1 - truncated");
GenerateTo = GenerateTo.substring(0,0);
}
set_Value (COLUMNNAME_GenerateTo, GenerateTo);
}
/** Get Generate To.
@return Generate To */
public String getGenerateTo() 
{
return (String)get_Value(COLUMNNAME_GenerateTo);
}

@XendraTrl(Identifier="5bd18eeb-a1e6-c412-f146-da8908809256")
public static String es_PE_FIELD_Invoice_GenerateTo_Name="Generar Recibos desde Facturas";

@XendraTrl(Identifier="5bd18eeb-a1e6-c412-f146-da8908809256")
public static String es_PE_FIELD_Invoice_GenerateTo_Description="Crear y procesar recibo de la Entrega desde esta factura. La factura debe estar correcta y completa";

@XendraField(AD_Column_ID="GenerateTo",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=340,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5bd18eeb-a1e6-c412-f146-da8908809256")
public static final String FIELDNAME_Invoice_GenerateTo="5bd18eeb-a1e6-c412-f146-da8908809256";

@XendraTrl(Identifier="7190040e-6391-e2b0-8822-bd486e95031e")
public static String es_PE_FIELD_Invoice_GenerateTo2_Name="Generar Recibos desde Facturas";

@XendraTrl(Identifier="7190040e-6391-e2b0-8822-bd486e95031e")
public static String es_PE_FIELD_Invoice_GenerateTo2_Description="Crear y procesar recibo de la Entrega desde esta factura. La factura debe estar correcta y completa";

@XendraField(AD_Column_ID="GenerateTo",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=340,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7190040e-6391-e2b0-8822-bd486e95031e")
public static final String FIELDNAME_Invoice_GenerateTo2="7190040e-6391-e2b0-8822-bd486e95031e";

@XendraTrl(Identifier="7638f59f-1766-0294-9283-10a647e47b0d")
public static String es_PE_FIELD_Invoice_GenerateTo3_Name="Generar Recibos desde Facturas";

@XendraTrl(Identifier="7638f59f-1766-0294-9283-10a647e47b0d")
public static String es_PE_FIELD_Invoice_GenerateTo3_Description="Crear y procesar recibo de la Entrega desde esta factura. La factura debe estar correcta y completa";

@XendraField(AD_Column_ID="GenerateTo",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7638f59f-1766-0294-9283-10a647e47b0d")
public static final String FIELDNAME_Invoice_GenerateTo3="7638f59f-1766-0294-9283-10a647e47b0d";

@XendraTrl(Identifier="9d56468b-e3ba-cd48-7e25-54f66067e15b")
public static String es_PE_FIELD_Invoice_GenerateTo4_Name="Generar Recibos desde Facturas";

@XendraTrl(Identifier="9d56468b-e3ba-cd48-7e25-54f66067e15b")
public static String es_PE_FIELD_Invoice_GenerateTo4_Description="Crear y procesar recibo de la Entrega desde esta factura. La factura debe estar correcta y completa";

@XendraField(AD_Column_ID="GenerateTo",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9d56468b-e3ba-cd48-7e25-54f66067e15b")
public static final String FIELDNAME_Invoice_GenerateTo4="9d56468b-e3ba-cd48-7e25-54f66067e15b";

@XendraTrl(Identifier="205e0774-3014-b002-801b-2083906a8cf4")
public static String es_PE_FIELD_PartnerInvoices_GenerateTo_Name="Generar Recibos desde Facturas";

@XendraTrl(Identifier="205e0774-3014-b002-801b-2083906a8cf4")
public static String es_PE_FIELD_PartnerInvoices_GenerateTo_Description="Crear y procesar recibo de la Entrega desde esta factura. La factura debe estar correcta y completa";

@XendraField(AD_Column_ID="GenerateTo",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="205e0774-3014-b002-801b-2083906a8cf4")
public static final String FIELDNAME_PartnerInvoices_GenerateTo="205e0774-3014-b002-801b-2083906a8cf4";

@XendraTrl(Identifier="df16500d-03d6-5599-84ec-bf23fc33417d")
public static String es_PE_FIELD_Invoices_GenerateTo_Name="Generar Recibos desde Facturas";

@XendraTrl(Identifier="df16500d-03d6-5599-84ec-bf23fc33417d")
public static String es_PE_FIELD_Invoices_GenerateTo_Description="Crear y procesar recibo de la Entrega desde esta factura. La factura debe estar correcta y completa";

@XendraField(AD_Column_ID="GenerateTo",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="df16500d-03d6-5599-84ec-bf23fc33417d")
public static final String FIELDNAME_Invoices_GenerateTo="df16500d-03d6-5599-84ec-bf23fc33417d";

@XendraTrl(Identifier="6ebd4a74-93c4-5ea3-89db-00b27634187e")
public static String es_PE_COLUMN_GenerateTo_Name="Generar A";

@XendraColumn(AD_Element_ID="f8860663-2a02-cf9f-e651-8fe92ff99c35",ColumnName="GenerateTo",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="a3ef4f51-c4b8-5ebc-aa39-b46492b777e3",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6ebd4a74-93c4-5ea3-89db-00b27634187e",Synchronized="2020-03-03 21:36:57.0")
/** Column name GenerateTo */
public static final String COLUMNNAME_GenerateTo = "GenerateTo";
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

@XendraTrl(Identifier="84494fea-d27e-d10d-7f6c-b5001517ae7a")
public static String es_PE_FIELD_Invoice_GrandTotal_Name="Gran Total";

@XendraTrl(Identifier="84494fea-d27e-d10d-7f6c-b5001517ae7a")
public static String es_PE_FIELD_Invoice_GrandTotal_Description="Total del documento";

@XendraTrl(Identifier="84494fea-d27e-d10d-7f6c-b5001517ae7a")
public static String es_PE_FIELD_Invoice_GrandTotal_Help="El gran total identifica el total incluyendo impuestos y totales de fletes en la moneda del documento.";

@XendraField(AD_Column_ID="GrandTotal",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="General",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="84494fea-d27e-d10d-7f6c-b5001517ae7a")
public static final String FIELDNAME_Invoice_GrandTotal="84494fea-d27e-d10d-7f6c-b5001517ae7a";

@XendraTrl(Identifier="2a372a20-c7ce-69dd-fde7-9754246b4b72")
public static String es_PE_FIELD_Invoice_GrandTotal2_Name="Gran Total";

@XendraTrl(Identifier="2a372a20-c7ce-69dd-fde7-9754246b4b72")
public static String es_PE_FIELD_Invoice_GrandTotal2_Description="Total del documento";

@XendraTrl(Identifier="2a372a20-c7ce-69dd-fde7-9754246b4b72")
public static String es_PE_FIELD_Invoice_GrandTotal2_Help="El gran total identifica el total incluyendo impuestos y totales de fletes en la moneda del documento.";

@XendraField(AD_Column_ID="GrandTotal",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="General",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2a372a20-c7ce-69dd-fde7-9754246b4b72")
public static final String FIELDNAME_Invoice_GrandTotal2="2a372a20-c7ce-69dd-fde7-9754246b4b72";

@XendraTrl(Identifier="ebe943dc-de11-28b0-3789-a587fca7c064")
public static String es_PE_FIELD_Invoice_GrandTotal3_Name="Gran Total";

@XendraTrl(Identifier="ebe943dc-de11-28b0-3789-a587fca7c064")
public static String es_PE_FIELD_Invoice_GrandTotal3_Description="Total del documento";

@XendraTrl(Identifier="ebe943dc-de11-28b0-3789-a587fca7c064")
public static String es_PE_FIELD_Invoice_GrandTotal3_Help="El gran total identifica el total incluyendo impuestos y totales de fletes en la moneda del documento.";

@XendraField(AD_Column_ID="GrandTotal",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=240,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ebe943dc-de11-28b0-3789-a587fca7c064")
public static final String FIELDNAME_Invoice_GrandTotal3="ebe943dc-de11-28b0-3789-a587fca7c064";

@XendraTrl(Identifier="7278bb47-c92d-e3b1-d94e-bed6e308e3a3")
public static String es_PE_FIELD_Invoice_GrandTotal4_Name="Gran Total";

@XendraTrl(Identifier="7278bb47-c92d-e3b1-d94e-bed6e308e3a3")
public static String es_PE_FIELD_Invoice_GrandTotal4_Description="Total del documento";

@XendraTrl(Identifier="7278bb47-c92d-e3b1-d94e-bed6e308e3a3")
public static String es_PE_FIELD_Invoice_GrandTotal4_Help="El gran total identifica el total incluyendo impuestos y totales de fletes en la moneda del documento.";

@XendraField(AD_Column_ID="GrandTotal",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7278bb47-c92d-e3b1-d94e-bed6e308e3a3")
public static final String FIELDNAME_Invoice_GrandTotal4="7278bb47-c92d-e3b1-d94e-bed6e308e3a3";

@XendraTrl(Identifier="ad6eb080-cb1a-8515-c06b-b30a6f556cfd")
public static String es_PE_FIELD_PartnerInvoices_GrandTotal_Name="Gran Total";

@XendraTrl(Identifier="ad6eb080-cb1a-8515-c06b-b30a6f556cfd")
public static String es_PE_FIELD_PartnerInvoices_GrandTotal_Description="Total del documento";

@XendraTrl(Identifier="ad6eb080-cb1a-8515-c06b-b30a6f556cfd")
public static String es_PE_FIELD_PartnerInvoices_GrandTotal_Help="El gran total identifica el total incluyendo impuestos y totales de fletes en la moneda del documento.";

@XendraField(AD_Column_ID="GrandTotal",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ad6eb080-cb1a-8515-c06b-b30a6f556cfd")
public static final String FIELDNAME_PartnerInvoices_GrandTotal="ad6eb080-cb1a-8515-c06b-b30a6f556cfd";

@XendraTrl(Identifier="257305fd-abe3-e33d-265a-ff67c38c2739")
public static String es_PE_FIELD_Invoices_GrandTotal_Name="Gran Total";

@XendraTrl(Identifier="257305fd-abe3-e33d-265a-ff67c38c2739")
public static String es_PE_FIELD_Invoices_GrandTotal_Description="Total del documento";

@XendraTrl(Identifier="257305fd-abe3-e33d-265a-ff67c38c2739")
public static String es_PE_FIELD_Invoices_GrandTotal_Help="El gran total identifica el total incluyendo impuestos y totales de fletes en la moneda del documento.";

@XendraField(AD_Column_ID="GrandTotal",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="257305fd-abe3-e33d-265a-ff67c38c2739")
public static final String FIELDNAME_Invoices_GrandTotal="257305fd-abe3-e33d-265a-ff67c38c2739";

@XendraTrl(Identifier="2cb7c8fd-1b57-1eda-564e-06aad7756204")
public static String es_PE_COLUMN_GrandTotal_Name="Gran Total";

@XendraColumn(AD_Element_ID="ffd614c2-6ff8-c9c6-71bf-44f369675711",ColumnName="GrandTotal",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=3,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2cb7c8fd-1b57-1eda-564e-06aad7756204",
Synchronized="2020-03-03 21:36:57.0")
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
@XendraTrl(Identifier="202ca97d-47ea-4fc0-858f-222f156a97f0")
public static String es_PE_FIELD_Invoice_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-06 14:47:16.0",
Identifier="202ca97d-47ea-4fc0-858f-222f156a97f0")
public static final String FIELDNAME_Invoice_Identifier="202ca97d-47ea-4fc0-858f-222f156a97f0";

@XendraTrl(Identifier="0d97fdd4-640e-4c58-b268-012171a21be8")
public static String es_PE_FIELD_Invoice_Identifier2_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-08-30 18:45:39.0",
Identifier="0d97fdd4-640e-4c58-b268-012171a21be8")
public static final String FIELDNAME_Invoice_Identifier2="0d97fdd4-640e-4c58-b268-012171a21be8";

@XendraTrl(Identifier="fca1c039-b1c3-4e00-a070-74f9ecd1da2f")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fca1c039-b1c3-4e00-a070-74f9ecd1da2f",
Synchronized="2020-03-03 21:36:57.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Collection Status.
@param InvoiceCollectionType Invoice Collection Status */
public void setInvoiceCollectionType (String InvoiceCollectionType)
{
if (InvoiceCollectionType != null && InvoiceCollectionType.length() > 1)
{
log.warning("Length > 1 - truncated");
InvoiceCollectionType = InvoiceCollectionType.substring(0,0);
}
set_Value (COLUMNNAME_InvoiceCollectionType, InvoiceCollectionType);
}
/** Get Collection Status.
@return Invoice Collection Status */
public String getInvoiceCollectionType() 
{
return (String)get_Value(COLUMNNAME_InvoiceCollectionType);
}

@XendraTrl(Identifier="14e65761-007f-07ce-3ee1-9395199e948e")
public static String es_PE_FIELD_Invoice_CollectionStatus_Name="Collection Status";

@XendraTrl(Identifier="14e65761-007f-07ce-3ee1-9395199e948e")
public static String es_PE_FIELD_Invoice_CollectionStatus_Description="Invoice Collection Status";

@XendraTrl(Identifier="14e65761-007f-07ce-3ee1-9395199e948e")
public static String es_PE_FIELD_Invoice_CollectionStatus_Help="Status of the invoice collection process";

@XendraField(AD_Column_ID="InvoiceCollectionType",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="@Processed@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=370,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="14e65761-007f-07ce-3ee1-9395199e948e")
public static final String FIELDNAME_Invoice_CollectionStatus="14e65761-007f-07ce-3ee1-9395199e948e";

@XendraTrl(Identifier="3c74dc99-2242-7355-bf8a-b95e5aa96814")
public static String es_PE_FIELD_Invoice_CollectionStatus2_Name="Collection Status";

@XendraTrl(Identifier="3c74dc99-2242-7355-bf8a-b95e5aa96814")
public static String es_PE_FIELD_Invoice_CollectionStatus2_Description="Invoice Collection Status";

@XendraTrl(Identifier="3c74dc99-2242-7355-bf8a-b95e5aa96814")
public static String es_PE_FIELD_Invoice_CollectionStatus2_Help="Status of the invoice collection process";

@XendraField(AD_Column_ID="InvoiceCollectionType",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="Action",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3c74dc99-2242-7355-bf8a-b95e5aa96814")
public static final String FIELDNAME_Invoice_CollectionStatus2="3c74dc99-2242-7355-bf8a-b95e5aa96814";

@XendraTrl(Identifier="f1d27b2c-518f-df78-f672-9473efae9cdb")
public static String es_PE_COLUMN_InvoiceCollectionType_Name="Collection Status";

@XendraColumn(AD_Element_ID="b451cd66-6f85-f8bf-1d9a-f297017efef8",
ColumnName="InvoiceCollectionType",AD_Reference_ID=17,
AD_Reference_Value_ID="8fe5b0dc-98b8-a097-8d98-f132c5681115",AD_Val_Rule_ID="",FieldLength=1,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=true,
ColumnSQL="",IsAllowLogging=false,Identifier="f1d27b2c-518f-df78-f672-9473efae9cdb",
Synchronized="2020-03-03 21:36:57.0")
/** Column name InvoiceCollectionType */
public static final String COLUMNNAME_InvoiceCollectionType = "InvoiceCollectionType";
/** Set IsAdvance.
@param IsAdvance IsAdvance */
public void setIsAdvance (boolean IsAdvance)
{
set_Value (COLUMNNAME_IsAdvance, Boolean.valueOf(IsAdvance));
}
/** Get IsAdvance.
@return IsAdvance */
public boolean isAdvance() 
{
Object oo = get_Value(COLUMNNAME_IsAdvance);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="998210ca-9fe8-3419-f458-b811393d7a08")
public static String es_PE_FIELD_Invoice_IsAdvance_Name="Adelanto";

@XendraField(AD_Column_ID="IsAdvance",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="998210ca-9fe8-3419-f458-b811393d7a08")
public static final String FIELDNAME_Invoice_IsAdvance="998210ca-9fe8-3419-f458-b811393d7a08";

@XendraTrl(Identifier="a81a74c9-6b12-b063-87f9-1685108a5b6f")
public static String es_PE_FIELD_Invoice_IsAdvance2_Name="Adelanto";

@XendraField(AD_Column_ID="IsAdvance",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a81a74c9-6b12-b063-87f9-1685108a5b6f")
public static final String FIELDNAME_Invoice_IsAdvance2="a81a74c9-6b12-b063-87f9-1685108a5b6f";

@XendraTrl(Identifier="5fad7d04-ced1-1f8a-c4ac-be930c956fc9")
public static String es_PE_COLUMN_IsAdvance_Name="isadvance";

@XendraColumn(AD_Element_ID="8281818b-c061-770d-070d-e1e625133ca7",ColumnName="IsAdvance",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5fad7d04-ced1-1f8a-c4ac-be930c956fc9",
Synchronized="2020-03-03 21:36:57.0")
/** Column name IsAdvance */
public static final String COLUMNNAME_IsAdvance = "IsAdvance";
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

@XendraTrl(Identifier="0e7c36ab-3e16-32ec-46c4-80024b360922")
public static String es_PE_FIELD_Invoice_Approved_Name="Aprobación";

@XendraTrl(Identifier="0e7c36ab-3e16-32ec-46c4-80024b360922")
public static String es_PE_FIELD_Invoice_Approved_Description="Indica si este documento requiere aprobación";

@XendraTrl(Identifier="0e7c36ab-3e16-32ec-46c4-80024b360922")
public static String es_PE_FIELD_Invoice_Approved_Help="El Cuadro de Verificación  Aprobado indica si este documento requiere aprobación antes de que pueda ser procesado";

@XendraField(AD_Column_ID="IsApproved",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0e7c36ab-3e16-32ec-46c4-80024b360922")
public static final String FIELDNAME_Invoice_Approved="0e7c36ab-3e16-32ec-46c4-80024b360922";

@XendraTrl(Identifier="0ad60cc3-2ce6-a5a7-ffd2-6694c6246b12")
public static String es_PE_FIELD_Invoice_Approved2_Name="Aprobación";

@XendraTrl(Identifier="0ad60cc3-2ce6-a5a7-ffd2-6694c6246b12")
public static String es_PE_FIELD_Invoice_Approved2_Description="Indica si este documento requiere aprobación";

@XendraTrl(Identifier="0ad60cc3-2ce6-a5a7-ffd2-6694c6246b12")
public static String es_PE_FIELD_Invoice_Approved2_Help="El Cuadro de Verificación  Aprobado indica si este documento requiere aprobación antes de que pueda ser procesado";

@XendraField(AD_Column_ID="IsApproved",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0ad60cc3-2ce6-a5a7-ffd2-6694c6246b12")
public static final String FIELDNAME_Invoice_Approved2="0ad60cc3-2ce6-a5a7-ffd2-6694c6246b12";

@XendraTrl(Identifier="00be9526-86d8-1405-da33-836664abde46")
public static String es_PE_FIELD_Invoice_Approved3_Name="Aprobación";

@XendraTrl(Identifier="00be9526-86d8-1405-da33-836664abde46")
public static String es_PE_FIELD_Invoice_Approved3_Description="Indica si este documento requiere aprobación";

@XendraTrl(Identifier="00be9526-86d8-1405-da33-836664abde46")
public static String es_PE_FIELD_Invoice_Approved3_Help="El Cuadro de Verificación  Aprobado indica si este documento requiere aprobación antes de que pueda ser procesado";

@XendraField(AD_Column_ID="IsApproved",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="00be9526-86d8-1405-da33-836664abde46")
public static final String FIELDNAME_Invoice_Approved3="00be9526-86d8-1405-da33-836664abde46";

@XendraTrl(Identifier="d2a2307e-aa3d-65e1-3219-9d6ef4dc0532")
public static String es_PE_FIELD_Invoice_Approved4_Name="Aprobación";

@XendraTrl(Identifier="d2a2307e-aa3d-65e1-3219-9d6ef4dc0532")
public static String es_PE_FIELD_Invoice_Approved4_Description="Indica si este documento requiere aprobación";

@XendraTrl(Identifier="d2a2307e-aa3d-65e1-3219-9d6ef4dc0532")
public static String es_PE_FIELD_Invoice_Approved4_Help="El Cuadro de Verificación  Aprobado indica si este documento requiere aprobación antes de que pueda ser procesado";

@XendraField(AD_Column_ID="IsApproved",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d2a2307e-aa3d-65e1-3219-9d6ef4dc0532")
public static final String FIELDNAME_Invoice_Approved4="d2a2307e-aa3d-65e1-3219-9d6ef4dc0532";

@XendraTrl(Identifier="55bb6c87-3e26-b13e-a65e-add9f8ff65f5")
public static String es_PE_FIELD_PartnerInvoices_Approved_Name="Aprobación";

@XendraTrl(Identifier="55bb6c87-3e26-b13e-a65e-add9f8ff65f5")
public static String es_PE_FIELD_PartnerInvoices_Approved_Description="Indica si este documento requiere aprobación";

@XendraTrl(Identifier="55bb6c87-3e26-b13e-a65e-add9f8ff65f5")
public static String es_PE_FIELD_PartnerInvoices_Approved_Help="El Cuadro de Verificación  Aprobado indica si este documento requiere aprobación antes de que pueda ser procesado";

@XendraField(AD_Column_ID="IsApproved",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="55bb6c87-3e26-b13e-a65e-add9f8ff65f5")
public static final String FIELDNAME_PartnerInvoices_Approved="55bb6c87-3e26-b13e-a65e-add9f8ff65f5";

@XendraTrl(Identifier="2a5e9faa-8331-5bc1-f064-fba8d2a269da")
public static String es_PE_FIELD_Invoices_Approved_Name="Aprobación";

@XendraTrl(Identifier="2a5e9faa-8331-5bc1-f064-fba8d2a269da")
public static String es_PE_FIELD_Invoices_Approved_Description="Indica si este documento requiere aprobación";

@XendraTrl(Identifier="2a5e9faa-8331-5bc1-f064-fba8d2a269da")
public static String es_PE_FIELD_Invoices_Approved_Help="El Cuadro de Verificación  Aprobado indica si este documento requiere aprobación antes de que pueda ser procesado";

@XendraField(AD_Column_ID="IsApproved",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2a5e9faa-8331-5bc1-f064-fba8d2a269da")
public static final String FIELDNAME_Invoices_Approved="2a5e9faa-8331-5bc1-f064-fba8d2a269da";

@XendraTrl(Identifier="1278c4ff-3c9b-88a0-0a09-f90f26c27ed9")
public static String es_PE_COLUMN_IsApproved_Name="Aprobación";

@XendraColumn(AD_Element_ID="44388d99-07b7-b005-9e16-78884800beff",ColumnName="IsApproved",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,
DefaultValue="@IsApproved@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="1278c4ff-3c9b-88a0-0a09-f90f26c27ed9",Synchronized="2020-03-03 21:36:57.0")
/** Column name IsApproved */
public static final String COLUMNNAME_IsApproved = "IsApproved";
/** Set IsCosted.
@param IsCosted IsCosted */
public void setIsCosted (boolean IsCosted)
{
set_Value (COLUMNNAME_IsCosted, Boolean.valueOf(IsCosted));
}
/** Get IsCosted.
@return IsCosted */
public boolean isCosted() 
{
Object oo = get_Value(COLUMNNAME_IsCosted);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="35b7c3a3-1d5d-4c3f-9227-c6077107e6b5")
public static String es_PE_FIELD_Invoice_IsCosted_Name="iscosted";

@XendraField(AD_Column_ID="IsCosted",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-06 14:47:16.0",
Identifier="35b7c3a3-1d5d-4c3f-9227-c6077107e6b5")
public static final String FIELDNAME_Invoice_IsCosted="35b7c3a3-1d5d-4c3f-9227-c6077107e6b5";

@XendraTrl(Identifier="4034d480-45b2-4bb2-9981-00cf5ba81191")
public static String es_PE_FIELD_Invoice_IsCosted2_Name="iscosted";

@XendraField(AD_Column_ID="IsCosted",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-08-30 18:45:39.0",
Identifier="4034d480-45b2-4bb2-9981-00cf5ba81191")
public static final String FIELDNAME_Invoice_IsCosted2="4034d480-45b2-4bb2-9981-00cf5ba81191";

@XendraTrl(Identifier="1adcd162-fa62-4018-998f-6bf834df7859")
public static String es_PE_COLUMN_IsCosted_Name="IsCosted";

@XendraColumn(AD_Element_ID="1d2cca33-7933-6933-e8cd-036ca4cb806e",ColumnName="IsCosted",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1adcd162-fa62-4018-998f-6bf834df7859",
Synchronized="2020-03-03 21:36:57.0")
/** Column name IsCosted */
public static final String COLUMNNAME_IsCosted = "IsCosted";
/** Set IsDetraction.
@param IsDetraction IsDetraction */
public void setIsDetraction (boolean IsDetraction)
{
set_Value (COLUMNNAME_IsDetraction, Boolean.valueOf(IsDetraction));
}
/** Get IsDetraction.
@return IsDetraction */
public boolean isDetraction() 
{
Object oo = get_Value(COLUMNNAME_IsDetraction);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="feacf797-9c83-44db-8c8f-39bebd83d301")
public static String es_PE_FIELD_Invoice_IsDetraction_Name="isdetraction";

@XendraField(AD_Column_ID="IsDetraction",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-06 14:47:16.0",
Identifier="feacf797-9c83-44db-8c8f-39bebd83d301")
public static final String FIELDNAME_Invoice_IsDetraction="feacf797-9c83-44db-8c8f-39bebd83d301";

@XendraTrl(Identifier="27436efd-9646-475b-a066-ae6530774290")
public static String es_PE_FIELD_Invoice_IsDetraction2_Name="Detraccion";

@XendraField(AD_Column_ID="IsDetraction",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=460,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-08-30 18:45:40.0",
Identifier="27436efd-9646-475b-a066-ae6530774290")
public static final String FIELDNAME_Invoice_IsDetraction2="27436efd-9646-475b-a066-ae6530774290";

@XendraTrl(Identifier="0c9e1043-cd55-6440-8e81-f4fe0b314a14")
public static String es_PE_COLUMN_IsDetraction_Name="isdetraction";

@XendraColumn(AD_Element_ID="69ebb09b-f64f-3908-3ccc-47718de9850f",ColumnName="IsDetraction",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="0c9e1043-cd55-6440-8e81-f4fe0b314a14",
Synchronized="2020-03-03 21:36:57.0")
/** Column name IsDetraction */
public static final String COLUMNNAME_IsDetraction = "IsDetraction";
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

@XendraTrl(Identifier="cc5d4d0f-e996-294b-2411-ed1eb84f4abd")
public static String es_PE_FIELD_Invoice_DiscountPrinted_Name="Imprimir Descuento";

@XendraTrl(Identifier="cc5d4d0f-e996-294b-2411-ed1eb84f4abd")
public static String es_PE_FIELD_Invoice_DiscountPrinted_Description="Imprimir el descuento en la Factura y la orden";

@XendraTrl(Identifier="cc5d4d0f-e996-294b-2411-ed1eb84f4abd")
public static String es_PE_FIELD_Invoice_DiscountPrinted_Help="El cuadro de verificación descuento Impreso indica si el descuento será impreso en el documento.";

@XendraField(AD_Column_ID="IsDiscountPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cc5d4d0f-e996-294b-2411-ed1eb84f4abd")
public static final String FIELDNAME_Invoice_DiscountPrinted="cc5d4d0f-e996-294b-2411-ed1eb84f4abd";

@XendraTrl(Identifier="2c21d6a4-27d8-30c6-8531-0c6d1f7a07b6")
public static String es_PE_FIELD_Invoice_DiscountPrinted2_Name="Imprimir Descuento";

@XendraTrl(Identifier="2c21d6a4-27d8-30c6-8531-0c6d1f7a07b6")
public static String es_PE_FIELD_Invoice_DiscountPrinted2_Description="Imprimir el descuento en la Factura y la orden";

@XendraTrl(Identifier="2c21d6a4-27d8-30c6-8531-0c6d1f7a07b6")
public static String es_PE_FIELD_Invoice_DiscountPrinted2_Help="El cuadro de verificación descuento Impreso indica si el descuento será impreso en el documento.";

@XendraField(AD_Column_ID="IsDiscountPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2c21d6a4-27d8-30c6-8531-0c6d1f7a07b6")
public static final String FIELDNAME_Invoice_DiscountPrinted2="2c21d6a4-27d8-30c6-8531-0c6d1f7a07b6";

@XendraTrl(Identifier="c1c1b3d7-2cc6-b0a1-c9f0-1b3d8ccfed1b")
public static String es_PE_FIELD_Invoice_DiscountPrinted3_Name="Imprimir Descuento";

@XendraTrl(Identifier="c1c1b3d7-2cc6-b0a1-c9f0-1b3d8ccfed1b")
public static String es_PE_FIELD_Invoice_DiscountPrinted3_Description="Imprimir el descuento en la Factura y la orden";

@XendraTrl(Identifier="c1c1b3d7-2cc6-b0a1-c9f0-1b3d8ccfed1b")
public static String es_PE_FIELD_Invoice_DiscountPrinted3_Help="El cuadro de verificación descuento Impreso indica si el descuento será impreso en el documento.";

@XendraField(AD_Column_ID="IsDiscountPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c1c1b3d7-2cc6-b0a1-c9f0-1b3d8ccfed1b")
public static final String FIELDNAME_Invoice_DiscountPrinted3="c1c1b3d7-2cc6-b0a1-c9f0-1b3d8ccfed1b";

@XendraTrl(Identifier="c5842fc2-0200-acab-2e56-4eac77aaf7ff")
public static String es_PE_FIELD_Invoice_DiscountPrinted4_Name="Imprimir Descuento";

@XendraTrl(Identifier="c5842fc2-0200-acab-2e56-4eac77aaf7ff")
public static String es_PE_FIELD_Invoice_DiscountPrinted4_Description="Imprimir el descuento en la Factura y la orden";

@XendraTrl(Identifier="c5842fc2-0200-acab-2e56-4eac77aaf7ff")
public static String es_PE_FIELD_Invoice_DiscountPrinted4_Help="El cuadro de verificación descuento Impreso indica si el descuento será impreso en el documento.";

@XendraField(AD_Column_ID="IsDiscountPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c5842fc2-0200-acab-2e56-4eac77aaf7ff")
public static final String FIELDNAME_Invoice_DiscountPrinted4="c5842fc2-0200-acab-2e56-4eac77aaf7ff";

@XendraTrl(Identifier="5d94446b-4825-0afb-c301-f386a70e4fc3")
public static String es_PE_FIELD_PartnerInvoices_DiscountPrinted_Name="Imprimir Descuento";

@XendraTrl(Identifier="5d94446b-4825-0afb-c301-f386a70e4fc3")
public static String es_PE_FIELD_PartnerInvoices_DiscountPrinted_Description="Imprimir el descuento en la Factura y la orden";

@XendraTrl(Identifier="5d94446b-4825-0afb-c301-f386a70e4fc3")
public static String es_PE_FIELD_PartnerInvoices_DiscountPrinted_Help="El cuadro de verificación descuento Impreso indica si el descuento será impreso en el documento.";

@XendraField(AD_Column_ID="IsDiscountPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5d94446b-4825-0afb-c301-f386a70e4fc3")
public static final String FIELDNAME_PartnerInvoices_DiscountPrinted="5d94446b-4825-0afb-c301-f386a70e4fc3";

@XendraTrl(Identifier="41077594-1041-90b5-6386-e54178437091")
public static String es_PE_FIELD_Invoices_DiscountPrinted_Name="Imprimir Descuento";

@XendraTrl(Identifier="41077594-1041-90b5-6386-e54178437091")
public static String es_PE_FIELD_Invoices_DiscountPrinted_Description="Imprimir el descuento en la Factura y la orden";

@XendraTrl(Identifier="41077594-1041-90b5-6386-e54178437091")
public static String es_PE_FIELD_Invoices_DiscountPrinted_Help="El cuadro de verificación descuento Impreso indica si el descuento será impreso en el documento.";

@XendraField(AD_Column_ID="IsDiscountPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="41077594-1041-90b5-6386-e54178437091")
public static final String FIELDNAME_Invoices_DiscountPrinted="41077594-1041-90b5-6386-e54178437091";

@XendraTrl(Identifier="af89bc67-7539-3f70-a425-f937e44bd381")
public static String es_PE_COLUMN_IsDiscountPrinted_Name="Imprimir Descuento";

@XendraColumn(AD_Element_ID="b8c6a8c1-0f6b-470e-d3be-4bd106a17b8a",ColumnName="IsDiscountPrinted",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="af89bc67-7539-3f70-a425-f937e44bd381",
Synchronized="2020-03-03 21:36:57.0")
/** Column name IsDiscountPrinted */
public static final String COLUMNNAME_IsDiscountPrinted = "IsDiscountPrinted";
/** Set In Dispute.
@param IsInDispute Document is in dispute */
public void setIsInDispute (boolean IsInDispute)
{
set_Value (COLUMNNAME_IsInDispute, Boolean.valueOf(IsInDispute));
}
/** Get In Dispute.
@return Document is in dispute */
public boolean isInDispute() 
{
Object oo = get_Value(COLUMNNAME_IsInDispute);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="564b9bd1-f093-4df1-1b85-004ff8391885")
public static String es_PE_FIELD_Invoice_InDispute_Name="En Negociación";

@XendraTrl(Identifier="564b9bd1-f093-4df1-1b85-004ff8391885")
public static String es_PE_FIELD_Invoice_InDispute_Description="Documento en negociación";

@XendraTrl(Identifier="564b9bd1-f093-4df1-1b85-004ff8391885")
public static String es_PE_FIELD_Invoice_InDispute_Help="Documento en negociación";

@XendraField(AD_Column_ID="IsInDispute",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="@Processed@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=390,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="564b9bd1-f093-4df1-1b85-004ff8391885")
public static final String FIELDNAME_Invoice_InDispute="564b9bd1-f093-4df1-1b85-004ff8391885";

@XendraTrl(Identifier="7abf411e-5d0a-3fa0-8dce-aa523937de02")
public static String es_PE_FIELD_Invoice_InDispute2_Name="En Negociación";

@XendraTrl(Identifier="7abf411e-5d0a-3fa0-8dce-aa523937de02")
public static String es_PE_FIELD_Invoice_InDispute2_Description="Documento en negociación";

@XendraTrl(Identifier="7abf411e-5d0a-3fa0-8dce-aa523937de02")
public static String es_PE_FIELD_Invoice_InDispute2_Help="Documento en negociación";

@XendraField(AD_Column_ID="IsInDispute",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="@Processed@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=390,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7abf411e-5d0a-3fa0-8dce-aa523937de02")
public static final String FIELDNAME_Invoice_InDispute2="7abf411e-5d0a-3fa0-8dce-aa523937de02";

@XendraTrl(Identifier="5ccdc817-b3b6-8d5e-2d4b-15cb64d8719d")
public static String es_PE_FIELD_Invoice_InDispute3_Name="En Negociación";

@XendraTrl(Identifier="5ccdc817-b3b6-8d5e-2d4b-15cb64d8719d")
public static String es_PE_FIELD_Invoice_InDispute3_Description="Documento en negociación";

@XendraTrl(Identifier="5ccdc817-b3b6-8d5e-2d4b-15cb64d8719d")
public static String es_PE_FIELD_Invoice_InDispute3_Help="Documento en negociación";

@XendraField(AD_Column_ID="IsInDispute",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5ccdc817-b3b6-8d5e-2d4b-15cb64d8719d")
public static final String FIELDNAME_Invoice_InDispute3="5ccdc817-b3b6-8d5e-2d4b-15cb64d8719d";

@XendraTrl(Identifier="a7d345c2-9604-8e13-ba41-01d1c0f2347a")
public static String es_PE_FIELD_Invoice_InDispute4_Name="En Negociación";

@XendraTrl(Identifier="a7d345c2-9604-8e13-ba41-01d1c0f2347a")
public static String es_PE_FIELD_Invoice_InDispute4_Description="Documento en negociación";

@XendraTrl(Identifier="a7d345c2-9604-8e13-ba41-01d1c0f2347a")
public static String es_PE_FIELD_Invoice_InDispute4_Help="Documento en negociación";

@XendraField(AD_Column_ID="IsInDispute",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a7d345c2-9604-8e13-ba41-01d1c0f2347a")
public static final String FIELDNAME_Invoice_InDispute4="a7d345c2-9604-8e13-ba41-01d1c0f2347a";

@XendraTrl(Identifier="14e3f17f-f3a9-817e-d28f-0fe901fe2d90")
public static String es_PE_FIELD_PartnerInvoices_InDispute_Name="En Negociación";

@XendraTrl(Identifier="14e3f17f-f3a9-817e-d28f-0fe901fe2d90")
public static String es_PE_FIELD_PartnerInvoices_InDispute_Description="Documento en negociación";

@XendraTrl(Identifier="14e3f17f-f3a9-817e-d28f-0fe901fe2d90")
public static String es_PE_FIELD_PartnerInvoices_InDispute_Help="Documento en negociación";

@XendraField(AD_Column_ID="IsInDispute",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="14e3f17f-f3a9-817e-d28f-0fe901fe2d90")
public static final String FIELDNAME_PartnerInvoices_InDispute="14e3f17f-f3a9-817e-d28f-0fe901fe2d90";

@XendraTrl(Identifier="9de90f0e-f9c4-5efa-45e1-e4771128b30e")
public static String es_PE_FIELD_Invoices_InDispute_Name="En Negociación";

@XendraTrl(Identifier="9de90f0e-f9c4-5efa-45e1-e4771128b30e")
public static String es_PE_FIELD_Invoices_InDispute_Description="Documento en negociación";

@XendraTrl(Identifier="9de90f0e-f9c4-5efa-45e1-e4771128b30e")
public static String es_PE_FIELD_Invoices_InDispute_Help="Documento en negociación";

@XendraField(AD_Column_ID="IsInDispute",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9de90f0e-f9c4-5efa-45e1-e4771128b30e")
public static final String FIELDNAME_Invoices_InDispute="9de90f0e-f9c4-5efa-45e1-e4771128b30e";

@XendraTrl(Identifier="6ba9fbab-7feb-1f31-7a48-a89fe163e7e7")
public static String es_PE_COLUMN_IsInDispute_Name="En Negociación";

@XendraColumn(AD_Element_ID="4d75c777-0a61-61e6-1a19-413ad176740e",ColumnName="IsInDispute",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="6ba9fbab-7feb-1f31-7a48-a89fe163e7e7",
Synchronized="2020-03-03 21:36:57.0")
/** Column name IsInDispute */
public static final String COLUMNNAME_IsInDispute = "IsInDispute";
/** Set Paid.
@param IsPaid The document is paid */
public void setIsPaid (boolean IsPaid)
{
set_Value (COLUMNNAME_IsPaid, Boolean.valueOf(IsPaid));
}
/** Get Paid.
@return The document is paid */
public boolean isPaid() 
{
Object oo = get_Value(COLUMNNAME_IsPaid);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="2d3f9faa-df30-8147-d4f1-02a462505516")
public static String es_PE_FIELD_Invoice_Paid_Name="Pagado";
@XendraField(AD_Column_ID="IsPaid",
IsCentrallyMaintained=true,AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",
AD_FieldGroup_ID="Reference",IsDisplayed=true,DisplayLogic="@Processed@=Y",DisplayLength=1,
IsReadOnly=true,SeqNo=210,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,
Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2d3f9faa-df30-8147-d4f1-02a462505516")
public static final String FIELDNAME_Invoice_Paid="2d3f9faa-df30-8147-d4f1-02a462505516";

@XendraTrl(Identifier="359571c4-1e3b-f243-dedd-98f5dfc1c710")
public static String es_PE_FIELD_Invoice_Paid2_Name="Pagado";
@XendraField(AD_Column_ID="IsPaid",
IsCentrallyMaintained=true,AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",
AD_FieldGroup_ID="Reference",IsDisplayed=true,DisplayLogic="@Processed@=Y",DisplayLength=1,
IsReadOnly=true,SeqNo=210,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,
Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="359571c4-1e3b-f243-dedd-98f5dfc1c710")
public static final String FIELDNAME_Invoice_Paid2="359571c4-1e3b-f243-dedd-98f5dfc1c710";

@XendraTrl(Identifier="48118477-474f-237f-3f4a-531d8072de3c")
public static String es_PE_FIELD_Invoice_Paid3_Name="Pagado";
@XendraField(AD_Column_ID="IsPaid",
IsCentrallyMaintained=true,AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",
IsDisplayed=false,DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="48118477-474f-237f-3f4a-531d8072de3c")
public static final String FIELDNAME_Invoice_Paid3="48118477-474f-237f-3f4a-531d8072de3c";

@XendraTrl(Identifier="aa471989-0a56-916a-4039-8cde34aa9f4e")
public static String es_PE_FIELD_Invoice_Paid4_Name="Pagado";
@XendraField(AD_Column_ID="IsPaid",
IsCentrallyMaintained=true,AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",
IsDisplayed=false,DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="aa471989-0a56-916a-4039-8cde34aa9f4e")
public static final String FIELDNAME_Invoice_Paid4="aa471989-0a56-916a-4039-8cde34aa9f4e";

@XendraTrl(Identifier="1c4981d2-92e4-a442-66c6-46b5713b4510")
public static String es_PE_FIELD_PartnerInvoices_Paid_Name="Pagado";

@XendraField(AD_Column_ID="IsPaid",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1c4981d2-92e4-a442-66c6-46b5713b4510")
public static final String FIELDNAME_PartnerInvoices_Paid="1c4981d2-92e4-a442-66c6-46b5713b4510";

@XendraTrl(Identifier="72b8cf0d-6c2a-8451-4855-cc967314f29d")
public static String es_PE_FIELD_Invoices_Paid_Name="Pagado";
@XendraField(AD_Column_ID="IsPaid",
IsCentrallyMaintained=true,AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=230,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="72b8cf0d-6c2a-8451-4855-cc967314f29d")
public static final String FIELDNAME_Invoices_Paid="72b8cf0d-6c2a-8451-4855-cc967314f29d";

@XendraTrl(Identifier="161b77a9-f579-43d0-218a-6e340d32d723")
public static String es_PE_COLUMN_IsPaid_Name="Pagado";

@XendraColumn(AD_Element_ID="a4a2359a-ebb8-dca1-8077-df35f747271c",ColumnName="IsPaid",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="161b77a9-f579-43d0-218a-6e340d32d723",
Synchronized="2020-03-03 21:36:57.0")
/** Column name IsPaid */
public static final String COLUMNNAME_IsPaid = "IsPaid";
/** Set Pay Schedule valid.
@param IsPayScheduleValid Is the Payment Schedule is valid */
public void setIsPayScheduleValid (boolean IsPayScheduleValid)
{
set_ValueNoCheck (COLUMNNAME_IsPayScheduleValid, Boolean.valueOf(IsPayScheduleValid));
}
/** Get Pay Schedule valid.
@return Is the Payment Schedule is valid */
public boolean isPayScheduleValid() 
{
Object oo = get_Value(COLUMNNAME_IsPayScheduleValid);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="84d78850-dcd4-f729-3e41-577c2058c7a6")
public static String es_PE_FIELD_Invoice_PayScheduleValid_Name="Programa de Pagos Validos";

@XendraTrl(Identifier="84d78850-dcd4-f729-3e41-577c2058c7a6")
public static String es_PE_FIELD_Invoice_PayScheduleValid_Description="Es el programa de pagos validos.";

@XendraTrl(Identifier="84d78850-dcd4-f729-3e41-577c2058c7a6")
public static String es_PE_FIELD_Invoice_PayScheduleValid_Help="Los programas de pago permiten tener multiples fechas debidas. ";

@XendraField(AD_Column_ID="IsPayScheduleValid",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=300,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="84d78850-dcd4-f729-3e41-577c2058c7a6")
public static final String FIELDNAME_Invoice_PayScheduleValid="84d78850-dcd4-f729-3e41-577c2058c7a6";

@XendraTrl(Identifier="82895f31-978c-4987-aeae-6d390cbbc1f2")
public static String es_PE_FIELD_Invoice_PayScheduleValid2_Name="Programa de Pagos Validos";

@XendraTrl(Identifier="82895f31-978c-4987-aeae-6d390cbbc1f2")
public static String es_PE_FIELD_Invoice_PayScheduleValid2_Description="Es el programa de pagos validos.";

@XendraTrl(Identifier="82895f31-978c-4987-aeae-6d390cbbc1f2")
public static String es_PE_FIELD_Invoice_PayScheduleValid2_Help="Los programas de pago permiten tener multiples fechas debidas. ";

@XendraField(AD_Column_ID="IsPayScheduleValid",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=300,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="82895f31-978c-4987-aeae-6d390cbbc1f2")
public static final String FIELDNAME_Invoice_PayScheduleValid2="82895f31-978c-4987-aeae-6d390cbbc1f2";

@XendraTrl(Identifier="020f6820-14b9-60c9-aa5c-4e21ed3dd0a3")
public static String es_PE_FIELD_Invoice_PayScheduleValid3_Name="Programa de Pagos Validos";

@XendraTrl(Identifier="020f6820-14b9-60c9-aa5c-4e21ed3dd0a3")
public static String es_PE_FIELD_Invoice_PayScheduleValid3_Description="Es el programa de pagos validos.";

@XendraTrl(Identifier="020f6820-14b9-60c9-aa5c-4e21ed3dd0a3")
public static String es_PE_FIELD_Invoice_PayScheduleValid3_Help="Los programas de pago permiten tener multiples fechas debidas. ";

@XendraField(AD_Column_ID="IsPayScheduleValid",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="020f6820-14b9-60c9-aa5c-4e21ed3dd0a3")
public static final String FIELDNAME_Invoice_PayScheduleValid3="020f6820-14b9-60c9-aa5c-4e21ed3dd0a3";

@XendraTrl(Identifier="3d0f2bb7-a4af-e2a3-383c-4c7af3eb9938")
public static String es_PE_FIELD_Invoice_PayScheduleValid4_Name="Programa de Pagos Validos";

@XendraTrl(Identifier="3d0f2bb7-a4af-e2a3-383c-4c7af3eb9938")
public static String es_PE_FIELD_Invoice_PayScheduleValid4_Description="Es el programa de pagos validos.";

@XendraTrl(Identifier="3d0f2bb7-a4af-e2a3-383c-4c7af3eb9938")
public static String es_PE_FIELD_Invoice_PayScheduleValid4_Help="Los programas de pago permiten tener multiples fechas debidas. ";

@XendraField(AD_Column_ID="IsPayScheduleValid",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3d0f2bb7-a4af-e2a3-383c-4c7af3eb9938")
public static final String FIELDNAME_Invoice_PayScheduleValid4="3d0f2bb7-a4af-e2a3-383c-4c7af3eb9938";

@XendraTrl(Identifier="83eaffb8-8fda-2f0a-7720-bb79c0ff1f42")
public static String es_PE_FIELD_PartnerInvoices_PayScheduleValid_Name="Programa de Pagos Validos";

@XendraTrl(Identifier="83eaffb8-8fda-2f0a-7720-bb79c0ff1f42")
public static String es_PE_FIELD_PartnerInvoices_PayScheduleValid_Description="Es el programa de pagos validos.";

@XendraTrl(Identifier="83eaffb8-8fda-2f0a-7720-bb79c0ff1f42")
public static String es_PE_FIELD_PartnerInvoices_PayScheduleValid_Help="Los programas de pago permiten tener multiples fechas debidas. ";

@XendraField(AD_Column_ID="IsPayScheduleValid",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="83eaffb8-8fda-2f0a-7720-bb79c0ff1f42")
public static final String FIELDNAME_PartnerInvoices_PayScheduleValid="83eaffb8-8fda-2f0a-7720-bb79c0ff1f42";

@XendraTrl(Identifier="32257f1f-89df-106b-c6af-c7befbc852b7")
public static String es_PE_FIELD_Invoices_PayScheduleValid_Name="Programa de Pagos Validos";

@XendraTrl(Identifier="32257f1f-89df-106b-c6af-c7befbc852b7")
public static String es_PE_FIELD_Invoices_PayScheduleValid_Description="Es el programa de pagos validos.";

@XendraTrl(Identifier="32257f1f-89df-106b-c6af-c7befbc852b7")
public static String es_PE_FIELD_Invoices_PayScheduleValid_Help="Los programas de pago permiten tener multiples fechas debidas. ";

@XendraField(AD_Column_ID="IsPayScheduleValid",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="32257f1f-89df-106b-c6af-c7befbc852b7")
public static final String FIELDNAME_Invoices_PayScheduleValid="32257f1f-89df-106b-c6af-c7befbc852b7";

@XendraTrl(Identifier="d12d2e52-1fb5-09b4-76a6-1ae98242ef9e")
public static String es_PE_COLUMN_IsPayScheduleValid_Name="Programa de Pagos Validos";

@XendraColumn(AD_Element_ID="0b362deb-3f55-b8d4-fb87-c2466512a43f",ColumnName="IsPayScheduleValid",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d12d2e52-1fb5-09b4-76a6-1ae98242ef9e",
Synchronized="2020-03-03 21:36:57.0")
/** Column name IsPayScheduleValid */
public static final String COLUMNNAME_IsPayScheduleValid = "IsPayScheduleValid";
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

@XendraTrl(Identifier="35f56fcf-0016-74da-40c5-8fc74a378de6")
public static String es_PE_FIELD_Invoice_Printed_Name="Impreso";

@XendraTrl(Identifier="35f56fcf-0016-74da-40c5-8fc74a378de6")
public static String es_PE_FIELD_Invoice_Printed_Description="Indica si este documento es impreso.";

@XendraTrl(Identifier="35f56fcf-0016-74da-40c5-8fc74a378de6")
public static String es_PE_FIELD_Invoice_Printed_Help="El cuadro de verificación impreso indica si este documento se imprimirá.";

@XendraField(AD_Column_ID="IsPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="35f56fcf-0016-74da-40c5-8fc74a378de6")
public static final String FIELDNAME_Invoice_Printed="35f56fcf-0016-74da-40c5-8fc74a378de6";

@XendraTrl(Identifier="3ead3a8d-6a87-885c-e67c-1ccd31169bd1")
public static String es_PE_FIELD_Invoice_Printed2_Name="Impreso";

@XendraTrl(Identifier="3ead3a8d-6a87-885c-e67c-1ccd31169bd1")
public static String es_PE_FIELD_Invoice_Printed2_Description="Indica si este documento es impreso.";

@XendraTrl(Identifier="3ead3a8d-6a87-885c-e67c-1ccd31169bd1")
public static String es_PE_FIELD_Invoice_Printed2_Help="El cuadro de verificación impreso indica si este documento se imprimirá.";

@XendraField(AD_Column_ID="IsPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3ead3a8d-6a87-885c-e67c-1ccd31169bd1")
public static final String FIELDNAME_Invoice_Printed2="3ead3a8d-6a87-885c-e67c-1ccd31169bd1";

@XendraTrl(Identifier="f1cfa41a-3848-41e2-f0c1-c19b97d1921a")
public static String es_PE_FIELD_Invoice_Printed3_Name="Impreso";

@XendraTrl(Identifier="f1cfa41a-3848-41e2-f0c1-c19b97d1921a")
public static String es_PE_FIELD_Invoice_Printed3_Description="Indica si este documento es impreso.";

@XendraTrl(Identifier="f1cfa41a-3848-41e2-f0c1-c19b97d1921a")
public static String es_PE_FIELD_Invoice_Printed3_Help="El cuadro de verificación impreso indica si este documento se imprimirá.";

@XendraField(AD_Column_ID="IsPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f1cfa41a-3848-41e2-f0c1-c19b97d1921a")
public static final String FIELDNAME_Invoice_Printed3="f1cfa41a-3848-41e2-f0c1-c19b97d1921a";

@XendraTrl(Identifier="1c10f831-a712-5e2f-6b28-c2db832ec1cb")
public static String es_PE_FIELD_Invoice_Printed4_Name="Impreso";

@XendraTrl(Identifier="1c10f831-a712-5e2f-6b28-c2db832ec1cb")
public static String es_PE_FIELD_Invoice_Printed4_Description="Indica si este documento es impreso.";

@XendraTrl(Identifier="1c10f831-a712-5e2f-6b28-c2db832ec1cb")
public static String es_PE_FIELD_Invoice_Printed4_Help="El cuadro de verificación impreso indica si este documento se imprimirá.";

@XendraField(AD_Column_ID="IsPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1c10f831-a712-5e2f-6b28-c2db832ec1cb")
public static final String FIELDNAME_Invoice_Printed4="1c10f831-a712-5e2f-6b28-c2db832ec1cb";

@XendraTrl(Identifier="d52c0820-d9b7-1b64-ed16-e49024e22c30")
public static String es_PE_FIELD_PartnerInvoices_Printed_Name="Impreso";

@XendraTrl(Identifier="d52c0820-d9b7-1b64-ed16-e49024e22c30")
public static String es_PE_FIELD_PartnerInvoices_Printed_Description="Indica si este documento es impreso.";

@XendraTrl(Identifier="d52c0820-d9b7-1b64-ed16-e49024e22c30")
public static String es_PE_FIELD_PartnerInvoices_Printed_Help="El cuadro de verificación impreso indica si este documento se imprimirá.";

@XendraField(AD_Column_ID="IsPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d52c0820-d9b7-1b64-ed16-e49024e22c30")
public static final String FIELDNAME_PartnerInvoices_Printed="d52c0820-d9b7-1b64-ed16-e49024e22c30";

@XendraTrl(Identifier="c6797028-1244-fa1f-d6b1-63e13b595664")
public static String es_PE_FIELD_Invoices_Printed_Name="Impreso";

@XendraTrl(Identifier="c6797028-1244-fa1f-d6b1-63e13b595664")
public static String es_PE_FIELD_Invoices_Printed_Description="Indica si este documento es impreso.";

@XendraTrl(Identifier="c6797028-1244-fa1f-d6b1-63e13b595664")
public static String es_PE_FIELD_Invoices_Printed_Help="El cuadro de verificación impreso indica si este documento se imprimirá.";

@XendraField(AD_Column_ID="IsPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c6797028-1244-fa1f-d6b1-63e13b595664")
public static final String FIELDNAME_Invoices_Printed="c6797028-1244-fa1f-d6b1-63e13b595664";

@XendraTrl(Identifier="a83f6e27-a669-30df-51e5-f04da1b1ee0f")
public static String es_PE_COLUMN_IsPrinted_Name="Impreso";

@XendraColumn(AD_Element_ID="66795cb3-a608-19bb-8cde-40abe30a0130",ColumnName="IsPrinted",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a83f6e27-a669-30df-51e5-f04da1b1ee0f",
Synchronized="2020-03-03 21:36:57.0")
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

@XendraTrl(Identifier="102dea74-e458-e387-9f3f-531eba54165c")
public static String es_PE_FIELD_Invoice_IsRealtimePOS_Name="IsRealTimePOS";

@XendraField(AD_Column_ID="IsRealtimePOS",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="102dea74-e458-e387-9f3f-531eba54165c")
public static final String FIELDNAME_Invoice_IsRealtimePOS="102dea74-e458-e387-9f3f-531eba54165c";

@XendraTrl(Identifier="ecbbac0d-cfc1-4c32-9d70-a3c8120117da")
public static String es_PE_FIELD_Invoice_IsRealtimePOS2_Name="IsRealTimePOS";

@XendraField(AD_Column_ID="IsRealtimePOS",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-08-30 18:45:40.0",
Identifier="ecbbac0d-cfc1-4c32-9d70-a3c8120117da")
public static final String FIELDNAME_Invoice_IsRealtimePOS2="ecbbac0d-cfc1-4c32-9d70-a3c8120117da";

@XendraTrl(Identifier="b97ee324-4940-fd66-c469-3f8e64a27d6b")
public static String es_PE_COLUMN_IsRealtimePOS_Name="IsRealTimePOS";

@XendraColumn(AD_Element_ID="d11eaa71-d549-2f36-a313-290a07febb00",ColumnName="IsRealtimePOS",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b97ee324-4940-fd66-c469-3f8e64a27d6b",
Synchronized="2020-03-03 21:36:57.0")
/** Column name IsRealtimePOS */
public static final String COLUMNNAME_IsRealtimePOS = "IsRealtimePOS";
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

@XendraTrl(Identifier="afbcf2e6-bbd9-6acf-2773-f0c8cb3cf40b")
public static String es_PE_FIELD_Invoice_Self_Service_Name="Auto-Servicio";

@XendraTrl(Identifier="afbcf2e6-bbd9-6acf-2773-f0c8cb3cf40b")
public static String es_PE_FIELD_Invoice_Self_Service_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraTrl(Identifier="afbcf2e6-bbd9-6acf-2773-f0c8cb3cf40b")
public static String es_PE_FIELD_Invoice_Self_Service_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=380,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="afbcf2e6-bbd9-6acf-2773-f0c8cb3cf40b")
public static final String FIELDNAME_Invoice_Self_Service="afbcf2e6-bbd9-6acf-2773-f0c8cb3cf40b";

@XendraTrl(Identifier="45425236-e64d-af59-1c14-55289b0c2b83")
public static String es_PE_FIELD_Invoice_Self_Service2_Name="Auto-Servicio";

@XendraTrl(Identifier="45425236-e64d-af59-1c14-55289b0c2b83")
public static String es_PE_FIELD_Invoice_Self_Service2_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraTrl(Identifier="45425236-e64d-af59-1c14-55289b0c2b83")
public static String es_PE_FIELD_Invoice_Self_Service2_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="Action",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="45425236-e64d-af59-1c14-55289b0c2b83")
public static final String FIELDNAME_Invoice_Self_Service2="45425236-e64d-af59-1c14-55289b0c2b83";

@XendraTrl(Identifier="e797b5c5-7e5c-bce1-6587-2921dd568248")
public static String es_PE_FIELD_Invoice_Self_Service3_Name="Auto-Servicio";

@XendraTrl(Identifier="e797b5c5-7e5c-bce1-6587-2921dd568248")
public static String es_PE_FIELD_Invoice_Self_Service3_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraTrl(Identifier="e797b5c5-7e5c-bce1-6587-2921dd568248")
public static String es_PE_FIELD_Invoice_Self_Service3_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e797b5c5-7e5c-bce1-6587-2921dd568248")
public static final String FIELDNAME_Invoice_Self_Service3="e797b5c5-7e5c-bce1-6587-2921dd568248";

@XendraTrl(Identifier="b387a13f-7130-69b0-28e6-f347b81d63ed")
public static String es_PE_FIELD_Invoice_Self_Service4_Name="Auto-Servicio";

@XendraTrl(Identifier="b387a13f-7130-69b0-28e6-f347b81d63ed")
public static String es_PE_FIELD_Invoice_Self_Service4_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraTrl(Identifier="b387a13f-7130-69b0-28e6-f347b81d63ed")
public static String es_PE_FIELD_Invoice_Self_Service4_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b387a13f-7130-69b0-28e6-f347b81d63ed")
public static final String FIELDNAME_Invoice_Self_Service4="b387a13f-7130-69b0-28e6-f347b81d63ed";

@XendraTrl(Identifier="a335f907-9e0e-22ad-0412-b503ce706bbe")
public static String es_PE_FIELD_PartnerInvoices_Self_Service_Name="Auto-Servicio";

@XendraTrl(Identifier="a335f907-9e0e-22ad-0412-b503ce706bbe")
public static String es_PE_FIELD_PartnerInvoices_Self_Service_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraTrl(Identifier="a335f907-9e0e-22ad-0412-b503ce706bbe")
public static String es_PE_FIELD_PartnerInvoices_Self_Service_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a335f907-9e0e-22ad-0412-b503ce706bbe")
public static final String FIELDNAME_PartnerInvoices_Self_Service="a335f907-9e0e-22ad-0412-b503ce706bbe";

@XendraTrl(Identifier="ae67cd32-c470-ddb5-b17c-239984ff842a")
public static String es_PE_FIELD_Invoices_Self_Service_Name="Auto-Servicio";

@XendraTrl(Identifier="ae67cd32-c470-ddb5-b17c-239984ff842a")
public static String es_PE_FIELD_Invoices_Self_Service_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraTrl(Identifier="ae67cd32-c470-ddb5-b17c-239984ff842a")
public static String es_PE_FIELD_Invoices_Self_Service_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ae67cd32-c470-ddb5-b17c-239984ff842a")
public static final String FIELDNAME_Invoices_Self_Service="ae67cd32-c470-ddb5-b17c-239984ff842a";

@XendraTrl(Identifier="69ee5c56-0e56-b874-12f0-c2ebd3c24843")
public static String es_PE_COLUMN_IsSelfService_Name="Auto-Servicio";

@XendraColumn(AD_Element_ID="8f201030-f9ab-66d2-f4de-7209f41f2af8",ColumnName="IsSelfService",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="69ee5c56-0e56-b874-12f0-c2ebd3c24843",
Synchronized="2020-03-03 21:36:57.0")
/** Column name IsSelfService */
public static final String COLUMNNAME_IsSelfService = "IsSelfService";
/** Set Sales Transaction.
@param IsSOTrx This is a Sales Transaction */
public void setIsSOTrx (boolean IsSOTrx)
{
set_ValueNoCheck (COLUMNNAME_IsSOTrx, Boolean.valueOf(IsSOTrx));
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

@XendraTrl(Identifier="9340e8a7-b175-6847-8394-84c7230bb829")
public static String es_PE_FIELD_Invoice_SalesTransaction_Name="Transacción de Ventas";

@XendraTrl(Identifier="9340e8a7-b175-6847-8394-84c7230bb829")
public static String es_PE_FIELD_Invoice_SalesTransaction_Description="Esta es una transacción de ventas";

@XendraTrl(Identifier="9340e8a7-b175-6847-8394-84c7230bb829")
public static String es_PE_FIELD_Invoice_SalesTransaction_Help="El cuadro de verificación Transacción de Ventas indica si este ítem es una transacción de ventas";

@XendraField(AD_Column_ID="IsSOTrx",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9340e8a7-b175-6847-8394-84c7230bb829")
public static final String FIELDNAME_Invoice_SalesTransaction="9340e8a7-b175-6847-8394-84c7230bb829";

@XendraTrl(Identifier="7f187268-6cfb-9c2e-bab9-746a780a6e51")
public static String es_PE_FIELD_Invoice_SalesTransaction2_Name="Transacción de Ventas";

@XendraTrl(Identifier="7f187268-6cfb-9c2e-bab9-746a780a6e51")
public static String es_PE_FIELD_Invoice_SalesTransaction2_Description="Esta es una transacción de ventas";

@XendraTrl(Identifier="7f187268-6cfb-9c2e-bab9-746a780a6e51")
public static String es_PE_FIELD_Invoice_SalesTransaction2_Help="El cuadro de verificación Transacción de Ventas indica si este ítem es una transacción de ventas";

@XendraField(AD_Column_ID="IsSOTrx",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7f187268-6cfb-9c2e-bab9-746a780a6e51")
public static final String FIELDNAME_Invoice_SalesTransaction2="7f187268-6cfb-9c2e-bab9-746a780a6e51";

@XendraTrl(Identifier="5c40ca6a-03fe-9159-4baf-19d282a8aa81")
public static String es_PE_FIELD_Invoice_SalesTransaction3_Name="Transacción de Ventas";

@XendraTrl(Identifier="5c40ca6a-03fe-9159-4baf-19d282a8aa81")
public static String es_PE_FIELD_Invoice_SalesTransaction3_Description="Esta es una transacción de ventas";

@XendraTrl(Identifier="5c40ca6a-03fe-9159-4baf-19d282a8aa81")
public static String es_PE_FIELD_Invoice_SalesTransaction3_Help="El cuadro de verificación Transacción de Ventas indica si este ítem es una transacción de ventas";

@XendraField(AD_Column_ID="IsSOTrx",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5c40ca6a-03fe-9159-4baf-19d282a8aa81")
public static final String FIELDNAME_Invoice_SalesTransaction3="5c40ca6a-03fe-9159-4baf-19d282a8aa81";

@XendraTrl(Identifier="766ec35d-63f2-73d7-fbd1-9862aee6e421")
public static String es_PE_FIELD_Invoice_SalesTransaction4_Name="Transacción de Ventas";

@XendraTrl(Identifier="766ec35d-63f2-73d7-fbd1-9862aee6e421")
public static String es_PE_FIELD_Invoice_SalesTransaction4_Description="Esta es una transacción de ventas";

@XendraTrl(Identifier="766ec35d-63f2-73d7-fbd1-9862aee6e421")
public static String es_PE_FIELD_Invoice_SalesTransaction4_Help="El cuadro de verificación Transacción de Ventas indica si este ítem es una transacción de ventas";

@XendraField(AD_Column_ID="IsSOTrx",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="766ec35d-63f2-73d7-fbd1-9862aee6e421")
public static final String FIELDNAME_Invoice_SalesTransaction4="766ec35d-63f2-73d7-fbd1-9862aee6e421";

@XendraTrl(Identifier="8318f9bc-f309-9ad5-c58f-67f058657184")
public static String es_PE_FIELD_PartnerInvoices_SalesTransaction_Name="Transacción de Ventas";

@XendraTrl(Identifier="8318f9bc-f309-9ad5-c58f-67f058657184")
public static String es_PE_FIELD_PartnerInvoices_SalesTransaction_Description="Esta es una transacción de ventas";

@XendraTrl(Identifier="8318f9bc-f309-9ad5-c58f-67f058657184")
public static String es_PE_FIELD_PartnerInvoices_SalesTransaction_Help="El cuadro de verificación Transacción de Ventas indica si este ítem es una transacción de ventas";

@XendraField(AD_Column_ID="IsSOTrx",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8318f9bc-f309-9ad5-c58f-67f058657184")
public static final String FIELDNAME_PartnerInvoices_SalesTransaction="8318f9bc-f309-9ad5-c58f-67f058657184";

@XendraTrl(Identifier="10a75d7c-679d-04f5-fb2c-b151c20631af")
public static String es_PE_FIELD_Invoices_SalesTransaction_Name="Transacción de Ventas";

@XendraTrl(Identifier="10a75d7c-679d-04f5-fb2c-b151c20631af")
public static String es_PE_FIELD_Invoices_SalesTransaction_Description="Esta es una transacción de ventas";

@XendraTrl(Identifier="10a75d7c-679d-04f5-fb2c-b151c20631af")
public static String es_PE_FIELD_Invoices_SalesTransaction_Help="El cuadro de verificación Transacción de Ventas indica si este ítem es una transacción de ventas";

@XendraField(AD_Column_ID="IsSOTrx",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="10a75d7c-679d-04f5-fb2c-b151c20631af")
public static final String FIELDNAME_Invoices_SalesTransaction="10a75d7c-679d-04f5-fb2c-b151c20631af";

@XendraTrl(Identifier="c2850fee-6e14-6c3f-3454-dcc3be3858d9")
public static String es_PE_COLUMN_IsSOTrx_Name="Transacción de Ventas";

@XendraColumn(AD_Element_ID="4084b69f-a51d-5676-4d8c-395a13e6b2df",ColumnName="IsSOTrx",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,
DefaultValue="@IsSOTrx@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c2850fee-6e14-6c3f-3454-dcc3be3858d9",Synchronized="2020-03-03 21:36:57.0")
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

@XendraTrl(Identifier="7f56be94-f445-3305-1054-47c773af62a4")
public static String es_PE_FIELD_Invoice_PriceIncludesTax_Name="Impuesto Incluido en el Precio";

@XendraTrl(Identifier="7f56be94-f445-3305-1054-47c773af62a4")
public static String es_PE_FIELD_Invoice_PriceIncludesTax_Description="Impuesto incluido en el precio";

@XendraTrl(Identifier="7f56be94-f445-3305-1054-47c773af62a4")
public static String es_PE_FIELD_Invoice_PriceIncludesTax_Help="El cuadro de verificación Impuesto Incluido indica que el precio incluye impuestos. Esto es también conocido como el precio bruto";

@XendraField(AD_Column_ID="IsTaxIncluded",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7f56be94-f445-3305-1054-47c773af62a4")
public static final String FIELDNAME_Invoice_PriceIncludesTax="7f56be94-f445-3305-1054-47c773af62a4";

@XendraTrl(Identifier="c2cb92d2-3a8c-a5f0-5883-6c6e80deed43")
public static String es_PE_FIELD_Invoice_PriceIncludesTax2_Name="Impuesto Incluido en el Precio";

@XendraTrl(Identifier="c2cb92d2-3a8c-a5f0-5883-6c6e80deed43")
public static String es_PE_FIELD_Invoice_PriceIncludesTax2_Description="Impuesto incluido en el precio";

@XendraTrl(Identifier="c2cb92d2-3a8c-a5f0-5883-6c6e80deed43")
public static String es_PE_FIELD_Invoice_PriceIncludesTax2_Help="El cuadro de verificación Impuesto Incluido indica que el precio incluye impuestos. Esto es también conocido como el precio bruto";

@XendraField(AD_Column_ID="IsTaxIncluded",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c2cb92d2-3a8c-a5f0-5883-6c6e80deed43")
public static final String FIELDNAME_Invoice_PriceIncludesTax2="c2cb92d2-3a8c-a5f0-5883-6c6e80deed43";

@XendraTrl(Identifier="15718b04-d9fa-1d72-a501-c7812c59d991")
public static String es_PE_FIELD_Invoice_PriceIncludesTax3_Name="Impuesto Incluido en el Precio";

@XendraTrl(Identifier="15718b04-d9fa-1d72-a501-c7812c59d991")
public static String es_PE_FIELD_Invoice_PriceIncludesTax3_Description="Impuesto incluido en el precio";

@XendraTrl(Identifier="15718b04-d9fa-1d72-a501-c7812c59d991")
public static String es_PE_FIELD_Invoice_PriceIncludesTax3_Help="El cuadro de verificación Impuesto Incluido indica que el precio incluye impuestos. Esto es también conocido como el precio bruto";

@XendraField(AD_Column_ID="IsTaxIncluded",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="15718b04-d9fa-1d72-a501-c7812c59d991")
public static final String FIELDNAME_Invoice_PriceIncludesTax3="15718b04-d9fa-1d72-a501-c7812c59d991";

@XendraTrl(Identifier="b4c41b11-a756-2e02-78b9-fab45a756af4")
public static String es_PE_FIELD_Invoice_PriceIncludesTax4_Name="Impuesto Incluido en el Precio";

@XendraTrl(Identifier="b4c41b11-a756-2e02-78b9-fab45a756af4")
public static String es_PE_FIELD_Invoice_PriceIncludesTax4_Description="Impuesto incluido en el precio";

@XendraTrl(Identifier="b4c41b11-a756-2e02-78b9-fab45a756af4")
public static String es_PE_FIELD_Invoice_PriceIncludesTax4_Help="El cuadro de verificación Impuesto Incluido indica que el precio incluye impuestos. Esto es también conocido como el precio bruto";

@XendraField(AD_Column_ID="IsTaxIncluded",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b4c41b11-a756-2e02-78b9-fab45a756af4")
public static final String FIELDNAME_Invoice_PriceIncludesTax4="b4c41b11-a756-2e02-78b9-fab45a756af4";

@XendraTrl(Identifier="65edbe5e-2b09-7fee-1115-a2449989ac26")
public static String es_PE_FIELD_PartnerInvoices_PriceIncludesTax_Name="Impuesto Incluido en el Precio";

@XendraTrl(Identifier="65edbe5e-2b09-7fee-1115-a2449989ac26")
public static String es_PE_FIELD_PartnerInvoices_PriceIncludesTax_Description="Impuesto incluido en el precio";

@XendraTrl(Identifier="65edbe5e-2b09-7fee-1115-a2449989ac26")
public static String es_PE_FIELD_PartnerInvoices_PriceIncludesTax_Help="El cuadro de verificación Impuesto Incluido indica que el precio incluye impuestos. Esto es también conocido como el precio bruto";

@XendraField(AD_Column_ID="IsTaxIncluded",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="65edbe5e-2b09-7fee-1115-a2449989ac26")
public static final String FIELDNAME_PartnerInvoices_PriceIncludesTax="65edbe5e-2b09-7fee-1115-a2449989ac26";

@XendraTrl(Identifier="8e5051fc-cfed-bc0d-4214-a9d26f72e541")
public static String es_PE_FIELD_Invoices_PriceIncludesTax_Name="Impuesto Incluido en el Precio";

@XendraTrl(Identifier="8e5051fc-cfed-bc0d-4214-a9d26f72e541")
public static String es_PE_FIELD_Invoices_PriceIncludesTax_Description="Impuesto incluido en el precio";

@XendraTrl(Identifier="8e5051fc-cfed-bc0d-4214-a9d26f72e541")
public static String es_PE_FIELD_Invoices_PriceIncludesTax_Help="El cuadro de verificación Impuesto Incluido indica que el precio incluye impuestos. Esto es también conocido como el precio bruto";

@XendraField(AD_Column_ID="IsTaxIncluded",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8e5051fc-cfed-bc0d-4214-a9d26f72e541")
public static final String FIELDNAME_Invoices_PriceIncludesTax="8e5051fc-cfed-bc0d-4214-a9d26f72e541";

@XendraTrl(Identifier="6f1d0fea-d18d-b208-3349-52c35e591060")
public static String es_PE_COLUMN_IsTaxIncluded_Name="Impuesto Incluido en el Precio";

@XendraColumn(AD_Element_ID="eb0a6d55-2fff-a462-20b8-744571a3fe60",ColumnName="IsTaxIncluded",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6f1d0fea-d18d-b208-3349-52c35e591060",
Synchronized="2020-03-03 21:36:57.0")
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

@XendraTrl(Identifier="c0f90cb8-2b48-c320-b605-c6bf0b5543b4")
public static String es_PE_FIELD_Invoice_Transferred_Name="Transferido";

@XendraTrl(Identifier="c0f90cb8-2b48-c320-b605-c6bf0b5543b4")
public static String es_PE_FIELD_Invoice_Transferred_Description="Transferido a la Contabilidad General (Contabilizado)";

@XendraTrl(Identifier="c0f90cb8-2b48-c320-b605-c6bf0b5543b4")
public static String es_PE_FIELD_Invoice_Transferred_Help="El cuadro de verificación transferido indica si las transacciones asociadas con este documento deberían ser transferidas a la contabilidad general.";

@XendraField(AD_Column_ID="IsTransferred",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c0f90cb8-2b48-c320-b605-c6bf0b5543b4")
public static final String FIELDNAME_Invoice_Transferred="c0f90cb8-2b48-c320-b605-c6bf0b5543b4";

@XendraTrl(Identifier="8861f291-adad-5a3b-df33-e5a042adeabb")
public static String es_PE_FIELD_Invoice_Transferred2_Name="Transferido";

@XendraTrl(Identifier="8861f291-adad-5a3b-df33-e5a042adeabb")
public static String es_PE_FIELD_Invoice_Transferred2_Description="Transferido a la Contabilidad General (Contabilizado)";

@XendraTrl(Identifier="8861f291-adad-5a3b-df33-e5a042adeabb")
public static String es_PE_FIELD_Invoice_Transferred2_Help="El cuadro de verificación transferido indica si las transacciones asociadas con este documento deberían ser transferidas a la contabilidad general.";

@XendraField(AD_Column_ID="IsTransferred",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8861f291-adad-5a3b-df33-e5a042adeabb")
public static final String FIELDNAME_Invoice_Transferred2="8861f291-adad-5a3b-df33-e5a042adeabb";

@XendraTrl(Identifier="aa39b73a-f38e-f064-c6c8-6c3b452a8e99")
public static String es_PE_FIELD_Invoice_Transferred3_Name="Transferido";

@XendraTrl(Identifier="aa39b73a-f38e-f064-c6c8-6c3b452a8e99")
public static String es_PE_FIELD_Invoice_Transferred3_Description="Transferido a la Contabilidad General (Contabilizado)";

@XendraTrl(Identifier="aa39b73a-f38e-f064-c6c8-6c3b452a8e99")
public static String es_PE_FIELD_Invoice_Transferred3_Help="El cuadro de verificación transferido indica si las transacciones asociadas con este documento deberían ser transferidas a la contabilidad general.";

@XendraField(AD_Column_ID="IsTransferred",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aa39b73a-f38e-f064-c6c8-6c3b452a8e99")
public static final String FIELDNAME_Invoice_Transferred3="aa39b73a-f38e-f064-c6c8-6c3b452a8e99";

@XendraTrl(Identifier="00b1bd2d-2ae4-3742-445a-f5d9a040f02f")
public static String es_PE_FIELD_Invoice_Transferred4_Name="Transferido";

@XendraTrl(Identifier="00b1bd2d-2ae4-3742-445a-f5d9a040f02f")
public static String es_PE_FIELD_Invoice_Transferred4_Description="Transferido a la Contabilidad General (Contabilizado)";

@XendraTrl(Identifier="00b1bd2d-2ae4-3742-445a-f5d9a040f02f")
public static String es_PE_FIELD_Invoice_Transferred4_Help="El cuadro de verificación transferido indica si las transacciones asociadas con este documento deberían ser transferidas a la contabilidad general.";

@XendraField(AD_Column_ID="IsTransferred",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="00b1bd2d-2ae4-3742-445a-f5d9a040f02f")
public static final String FIELDNAME_Invoice_Transferred4="00b1bd2d-2ae4-3742-445a-f5d9a040f02f";

@XendraTrl(Identifier="ef7f1bd9-adc0-7af2-b1d8-6e181d42dfb9")
public static String es_PE_FIELD_PartnerInvoices_Transferred_Name="Transferido";

@XendraTrl(Identifier="ef7f1bd9-adc0-7af2-b1d8-6e181d42dfb9")
public static String es_PE_FIELD_PartnerInvoices_Transferred_Description="Transferido a la Contabilidad General (Contabilizado)";

@XendraTrl(Identifier="ef7f1bd9-adc0-7af2-b1d8-6e181d42dfb9")
public static String es_PE_FIELD_PartnerInvoices_Transferred_Help="El cuadro de verificación transferido indica si las transacciones asociadas con este documento deberían ser transferidas a la contabilidad general.";

@XendraField(AD_Column_ID="IsTransferred",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ef7f1bd9-adc0-7af2-b1d8-6e181d42dfb9")
public static final String FIELDNAME_PartnerInvoices_Transferred="ef7f1bd9-adc0-7af2-b1d8-6e181d42dfb9";

@XendraTrl(Identifier="b8f2cdfd-5762-d879-6e58-7f707527cac4")
public static String es_PE_FIELD_Invoices_Transferred_Name="Transferido";

@XendraTrl(Identifier="b8f2cdfd-5762-d879-6e58-7f707527cac4")
public static String es_PE_FIELD_Invoices_Transferred_Description="Transferido a la Contabilidad General (Contabilizado)";

@XendraTrl(Identifier="b8f2cdfd-5762-d879-6e58-7f707527cac4")
public static String es_PE_FIELD_Invoices_Transferred_Help="El cuadro de verificación transferido indica si las transacciones asociadas con este documento deberían ser transferidas a la contabilidad general.";

@XendraField(AD_Column_ID="IsTransferred",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b8f2cdfd-5762-d879-6e58-7f707527cac4")
public static final String FIELDNAME_Invoices_Transferred="b8f2cdfd-5762-d879-6e58-7f707527cac4";

@XendraTrl(Identifier="3681ac8e-0c73-6920-ae0b-0c07002d6c5d")
public static String es_PE_COLUMN_IsTransferred_Name="Transferido";

@XendraColumn(AD_Element_ID="8ec244a7-8179-b3b7-2e19-f3a9a05cb009",ColumnName="IsTransferred",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3681ac8e-0c73-6920-ae0b-0c07002d6c5d",
Synchronized="2020-03-03 21:36:57.0")
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
@XendraTrl(Identifier="03c92e40-a9a2-49b2-9e68-cf38123539bb")
public static String es_PE_FIELD_Invoice_MachineSerial_Name="machineserial";

@XendraField(AD_Column_ID="MachineSerial",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-06 14:47:17.0",
Identifier="03c92e40-a9a2-49b2-9e68-cf38123539bb")
public static final String FIELDNAME_Invoice_MachineSerial="03c92e40-a9a2-49b2-9e68-cf38123539bb";

@XendraTrl(Identifier="8fe66ce1-7230-4ecb-91d4-99e7354e887c")
public static String es_PE_FIELD_Invoice_MachineSerial2_Name="machineserial";

@XendraField(AD_Column_ID="MachineSerial",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-08-30 18:45:40.0",
Identifier="8fe66ce1-7230-4ecb-91d4-99e7354e887c")
public static final String FIELDNAME_Invoice_MachineSerial2="8fe66ce1-7230-4ecb-91d4-99e7354e887c";

@XendraTrl(Identifier="c5b5891a-28a9-4148-a482-f32df71e0934")
public static String es_PE_COLUMN_MachineSerial_Name="MachineSerial";

@XendraColumn(AD_Element_ID="8435e473-af0f-eb91-9746-88d639a40879",ColumnName="MachineSerial",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c5b5891a-28a9-4148-a482-f32df71e0934",
Synchronized="2020-03-03 21:36:57.0")
/** Column name MachineSerial */
public static final String COLUMNNAME_MachineSerial = "MachineSerial";
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

@XendraTrl(Identifier="336042b8-0921-698f-0717-ec5a795f5ff8")
public static String es_PE_FIELD_Invoice_M_PriceList_ID_Name="Lista de Precios";

@XendraTrl(Identifier="336042b8-0921-698f-0717-ec5a795f5ff8")
public static String es_PE_FIELD_Invoice_M_PriceList_ID_Description="Identificador único de mi lista de precios";

@XendraTrl(Identifier="336042b8-0921-698f-0717-ec5a795f5ff8")
public static String es_PE_FIELD_Invoice_M_PriceList_ID_Help="Listas de precios son usadas para determinar el precio; margen y costo de artículos comprados ó vendidos.";

@XendraField(AD_Column_ID="M_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="336042b8-0921-698f-0717-ec5a795f5ff8")
public static final String FIELDNAME_Invoice_M_PriceList_ID="336042b8-0921-698f-0717-ec5a795f5ff8";

@XendraTrl(Identifier="3da2b451-9c8b-f0a4-a3a8-f5ec44e1644a")
public static String es_PE_FIELD_Invoice_M_PriceList_ID2_Name="Lista de Precios";

@XendraTrl(Identifier="3da2b451-9c8b-f0a4-a3a8-f5ec44e1644a")
public static String es_PE_FIELD_Invoice_M_PriceList_ID2_Description="Identificador único de mi lista de precios";

@XendraTrl(Identifier="3da2b451-9c8b-f0a4-a3a8-f5ec44e1644a")
public static String es_PE_FIELD_Invoice_M_PriceList_ID2_Help="Listas de precios son usadas para determinar el precio; margen y costo de artículos comprados ó vendidos.";

@XendraField(AD_Column_ID="M_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3da2b451-9c8b-f0a4-a3a8-f5ec44e1644a")
public static final String FIELDNAME_Invoice_M_PriceList_ID2="3da2b451-9c8b-f0a4-a3a8-f5ec44e1644a";

@XendraTrl(Identifier="05d56e07-5df8-cc54-397b-e8f0b297b64b")
public static String es_PE_FIELD_Invoice_M_PriceList_ID3_Name="Lista de Precios";

@XendraTrl(Identifier="05d56e07-5df8-cc54-397b-e8f0b297b64b")
public static String es_PE_FIELD_Invoice_M_PriceList_ID3_Description="Identificador único de mi lista de precios";

@XendraTrl(Identifier="05d56e07-5df8-cc54-397b-e8f0b297b64b")
public static String es_PE_FIELD_Invoice_M_PriceList_ID3_Help="Listas de precios son usadas para determinar el precio; margen y costo de artículos comprados ó vendidos.";

@XendraField(AD_Column_ID="M_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="05d56e07-5df8-cc54-397b-e8f0b297b64b")
public static final String FIELDNAME_Invoice_M_PriceList_ID3="05d56e07-5df8-cc54-397b-e8f0b297b64b";

@XendraTrl(Identifier="92e56da1-6528-dad9-12df-eaed84c571e9")
public static String es_PE_FIELD_Invoice_M_PriceList_ID4_Name="Lista de Precios";

@XendraTrl(Identifier="92e56da1-6528-dad9-12df-eaed84c571e9")
public static String es_PE_FIELD_Invoice_M_PriceList_ID4_Description="Identificador único de mi lista de precios";

@XendraTrl(Identifier="92e56da1-6528-dad9-12df-eaed84c571e9")
public static String es_PE_FIELD_Invoice_M_PriceList_ID4_Help="Listas de precios son usadas para determinar el precio; margen y costo de artículos comprados ó vendidos.";

@XendraField(AD_Column_ID="M_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="92e56da1-6528-dad9-12df-eaed84c571e9")
public static final String FIELDNAME_Invoice_M_PriceList_ID4="92e56da1-6528-dad9-12df-eaed84c571e9";

@XendraTrl(Identifier="877bacc5-2935-1a89-a8c3-59914bb03483")
public static String es_PE_FIELD_PartnerInvoices_M_PriceList_ID_Name="Lista de Precios";

@XendraTrl(Identifier="877bacc5-2935-1a89-a8c3-59914bb03483")
public static String es_PE_FIELD_PartnerInvoices_M_PriceList_ID_Description="Identificador único de mi lista de precios";

@XendraTrl(Identifier="877bacc5-2935-1a89-a8c3-59914bb03483")
public static String es_PE_FIELD_PartnerInvoices_M_PriceList_ID_Help="Listas de precios son usadas para determinar el precio; margen y costo de artículos comprados ó vendidos.";

@XendraField(AD_Column_ID="M_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="877bacc5-2935-1a89-a8c3-59914bb03483")
public static final String FIELDNAME_PartnerInvoices_M_PriceList_ID="877bacc5-2935-1a89-a8c3-59914bb03483";

@XendraTrl(Identifier="f0b569d6-032e-995e-25ee-08ace676342e")
public static String es_PE_FIELD_Invoices_M_PriceList_ID_Name="Lista de Precios";

@XendraTrl(Identifier="f0b569d6-032e-995e-25ee-08ace676342e")
public static String es_PE_FIELD_Invoices_M_PriceList_ID_Description="Identificador único de mi lista de precios";

@XendraTrl(Identifier="f0b569d6-032e-995e-25ee-08ace676342e")
public static String es_PE_FIELD_Invoices_M_PriceList_ID_Help="Listas de precios son usadas para determinar el precio; margen y costo de artículos comprados ó vendidos.";

@XendraField(AD_Column_ID="M_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f0b569d6-032e-995e-25ee-08ace676342e")
public static final String FIELDNAME_Invoices_M_PriceList_ID="f0b569d6-032e-995e-25ee-08ace676342e";

@XendraTrl(Identifier="153e66ce-135b-da46-d46d-ee061d057b27")
public static String es_PE_COLUMN_M_PriceList_ID_Name="Lista de Precios";

@XendraColumn(AD_Element_ID="652afdd3-9ff1-082d-5831-6aad828e0e09",ColumnName="M_PriceList_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutOrder.priceList",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="153e66ce-135b-da46-d46d-ee061d057b27",Synchronized="2020-03-03 21:36:57.0")
/** Column name M_PriceList_ID */
public static final String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";
/** Set RMA.
@param M_RMA_ID Return Material Authorization */
public void setM_RMA_ID (int M_RMA_ID)
{
if (M_RMA_ID <= 0) set_Value (COLUMNNAME_M_RMA_ID, null);
 else 
set_Value (COLUMNNAME_M_RMA_ID, Integer.valueOf(M_RMA_ID));
}
/** Get RMA.
@return Return Material Authorization */
public int getM_RMA_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_RMA_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="25183df0-c076-1186-cb99-ea71f9dfdd6c")
public static String es_PE_FIELD_Invoice_RMA_Name="ADM (RMA)";

@XendraTrl(Identifier="25183df0-c076-1186-cb99-ea71f9dfdd6c")
public static String es_PE_FIELD_Invoice_RMA_Description="Autorización de Devolución de Material";

@XendraTrl(Identifier="25183df0-c076-1186-cb99-ea71f9dfdd6c")
public static String es_PE_FIELD_Invoice_RMA_Help="La Autorización de Devolución de Material se requiere para aceptar devoluciones y para crear memos de credito.";

@XendraField(AD_Column_ID="M_RMA_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="25183df0-c076-1186-cb99-ea71f9dfdd6c")
public static final String FIELDNAME_Invoice_RMA="25183df0-c076-1186-cb99-ea71f9dfdd6c";

@XendraTrl(Identifier="8fae7a20-96c5-7eca-9543-746878758b84")
public static String es_PE_FIELD_Invoice_RMA2_Name="ADM (RMA)";

@XendraTrl(Identifier="8fae7a20-96c5-7eca-9543-746878758b84")
public static String es_PE_FIELD_Invoice_RMA2_Description="Autorización de Devolución de Material";

@XendraTrl(Identifier="8fae7a20-96c5-7eca-9543-746878758b84")
public static String es_PE_FIELD_Invoice_RMA2_Help="La Autorización de Devolución de Material se requiere para aceptar devoluciones y para crear memos de credito.";

@XendraField(AD_Column_ID="M_RMA_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8fae7a20-96c5-7eca-9543-746878758b84")
public static final String FIELDNAME_Invoice_RMA2="8fae7a20-96c5-7eca-9543-746878758b84";

@XendraTrl(Identifier="890bdeaa-e440-1470-4c07-db71329b3ecd")
public static String es_PE_COLUMN_M_RMA_ID_Name="ADM (RMA)";

@XendraColumn(AD_Element_ID="99f41ef6-5c78-3288-c0ff-9495a4714c13",ColumnName="M_RMA_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="890bdeaa-e440-1470-4c07-db71329b3ecd",
Synchronized="2020-03-03 21:36:58.0")
/** Column name M_RMA_ID */
public static final String COLUMNNAME_M_RMA_ID = "M_RMA_ID";
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

@XendraTrl(Identifier="a7005db5-f614-5d22-6ce3-625ebb3733b8")
public static String es_PE_FIELD_Invoice_PaymentRule_Name="Regla de Pago";

@XendraTrl(Identifier="a7005db5-f614-5d22-6ce3-625ebb3733b8")
public static String es_PE_FIELD_Invoice_PaymentRule_Description="Como se pagará la factura";

@XendraTrl(Identifier="a7005db5-f614-5d22-6ce3-625ebb3733b8")
public static String es_PE_FIELD_Invoice_PaymentRule_Help="La Regla de Pagos indica el método de pago de la factura";

@XendraField(AD_Column_ID="PaymentRule",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a7005db5-f614-5d22-6ce3-625ebb3733b8")
public static final String FIELDNAME_Invoice_PaymentRule="a7005db5-f614-5d22-6ce3-625ebb3733b8";

@XendraTrl(Identifier="06afbc9f-953a-4b73-5a83-8ab4406a9fa4")
public static String es_PE_FIELD_Invoice_PaymentRule2_Name="Regla de Pago";

@XendraTrl(Identifier="06afbc9f-953a-4b73-5a83-8ab4406a9fa4")
public static String es_PE_FIELD_Invoice_PaymentRule2_Description="Como se pagará la factura";

@XendraTrl(Identifier="06afbc9f-953a-4b73-5a83-8ab4406a9fa4")
public static String es_PE_FIELD_Invoice_PaymentRule2_Help="La Regla de Pagos indica el método de pago de la factura";

@XendraField(AD_Column_ID="PaymentRule",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="06afbc9f-953a-4b73-5a83-8ab4406a9fa4")
public static final String FIELDNAME_Invoice_PaymentRule2="06afbc9f-953a-4b73-5a83-8ab4406a9fa4";

@XendraTrl(Identifier="3a7124d8-d8ec-f7fd-101f-b6f877ae9834")
public static String es_PE_FIELD_Invoice_PaymentRule3_Name="Regla de Pago";

@XendraTrl(Identifier="3a7124d8-d8ec-f7fd-101f-b6f877ae9834")
public static String es_PE_FIELD_Invoice_PaymentRule3_Description="Como se pagará la factura";

@XendraTrl(Identifier="3a7124d8-d8ec-f7fd-101f-b6f877ae9834")
public static String es_PE_FIELD_Invoice_PaymentRule3_Help="La Regla de Pagos indica el método de pago de la factura";

@XendraField(AD_Column_ID="PaymentRule",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3a7124d8-d8ec-f7fd-101f-b6f877ae9834")
public static final String FIELDNAME_Invoice_PaymentRule3="3a7124d8-d8ec-f7fd-101f-b6f877ae9834";

@XendraTrl(Identifier="aaef1379-dc5d-0bce-2235-22985b2f0d31")
public static String es_PE_FIELD_Invoice_PaymentRule4_Name="Regla de Pago";

@XendraTrl(Identifier="aaef1379-dc5d-0bce-2235-22985b2f0d31")
public static String es_PE_FIELD_Invoice_PaymentRule4_Description="Como se pagará la factura";

@XendraTrl(Identifier="aaef1379-dc5d-0bce-2235-22985b2f0d31")
public static String es_PE_FIELD_Invoice_PaymentRule4_Help="La Regla de Pagos indica el método de pago de la factura";

@XendraField(AD_Column_ID="PaymentRule",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aaef1379-dc5d-0bce-2235-22985b2f0d31")
public static final String FIELDNAME_Invoice_PaymentRule4="aaef1379-dc5d-0bce-2235-22985b2f0d31";

@XendraTrl(Identifier="88be88dd-23d0-4089-2f06-850d62e66f1a")
public static String es_PE_FIELD_PartnerInvoices_PaymentRule_Name="Regla de Pago";

@XendraTrl(Identifier="88be88dd-23d0-4089-2f06-850d62e66f1a")
public static String es_PE_FIELD_PartnerInvoices_PaymentRule_Description="Como se pagará la factura";

@XendraTrl(Identifier="88be88dd-23d0-4089-2f06-850d62e66f1a")
public static String es_PE_FIELD_PartnerInvoices_PaymentRule_Help="La Regla de Pagos indica el método de pago de la factura";

@XendraField(AD_Column_ID="PaymentRule",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="88be88dd-23d0-4089-2f06-850d62e66f1a")
public static final String FIELDNAME_PartnerInvoices_PaymentRule="88be88dd-23d0-4089-2f06-850d62e66f1a";

@XendraTrl(Identifier="87bfa56e-f78f-8eff-74f5-880a7d12df94")
public static String es_PE_FIELD_Invoices_PaymentRule_Name="Regla de Pago";

@XendraTrl(Identifier="87bfa56e-f78f-8eff-74f5-880a7d12df94")
public static String es_PE_FIELD_Invoices_PaymentRule_Description="Como se pagará la factura";

@XendraTrl(Identifier="87bfa56e-f78f-8eff-74f5-880a7d12df94")
public static String es_PE_FIELD_Invoices_PaymentRule_Help="La Regla de Pagos indica el método de pago de la factura";

@XendraField(AD_Column_ID="PaymentRule",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=true,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="87bfa56e-f78f-8eff-74f5-880a7d12df94")
public static final String FIELDNAME_Invoices_PaymentRule="87bfa56e-f78f-8eff-74f5-880a7d12df94";

@XendraTrl(Identifier="591768f5-c37b-e946-98e3-60d215051ab8")
public static String es_PE_COLUMN_PaymentRule_Name="Regla de Pago";

@XendraColumn(AD_Element_ID="5074db21-c657-2d23-63dc-80f0c5f2d4cc",ColumnName="PaymentRule",
AD_Reference_ID=28,AD_Reference_Value_ID="ac003b85-a929-cc48-3def-1a8f7b1adc7b",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="P",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="591768f5-c37b-e946-98e3-60d215051ab8",Synchronized="2020-03-03 21:36:58.0")
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

@XendraTrl(Identifier="66aafae3-5cb3-4872-b3ea-e0d0f24fb158")
public static String es_PE_FIELD_Invoice_Points_Name="points";
@XendraField(AD_Column_ID="Points",
IsCentrallyMaintained=true,AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",
IsDisplayed=false,DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2016-10-06 14:47:17.0",Identifier="66aafae3-5cb3-4872-b3ea-e0d0f24fb158")
public static final String FIELDNAME_Invoice_Points="66aafae3-5cb3-4872-b3ea-e0d0f24fb158";

@XendraTrl(Identifier="7fb60868-378c-448c-8be0-e8906b40b6c9")
public static String es_PE_FIELD_Invoice_Points2_Name="points";
@XendraField(AD_Column_ID="Points",
IsCentrallyMaintained=true,AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",
IsDisplayed=false,DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2016-08-30 18:45:40.0",Identifier="7fb60868-378c-448c-8be0-e8906b40b6c9")
public static final String FIELDNAME_Invoice_Points2="7fb60868-378c-448c-8be0-e8906b40b6c9";

@XendraTrl(Identifier="d1f6ff16-3eb4-00e4-9770-05554c099ff7")
public static String es_PE_COLUMN_Points_Name="Points";

@XendraColumn(AD_Element_ID="b7851d60-f96e-369f-a20e-99a1cbd76360",ColumnName="Points",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d1f6ff16-3eb4-00e4-9770-05554c099ff7",
Synchronized="2020-03-03 21:36:58.0")
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
@XendraTrl(Identifier="9147c8de-0edb-9191-70f8-7f35e85e9c8b")
public static String es_PE_FIELD_Invoice_OrderReference_Name="Referencia de Orden de Socio";

@XendraTrl(Identifier="9147c8de-0edb-9191-70f8-7f35e85e9c8b")
public static String es_PE_FIELD_Invoice_OrderReference_Description="Número de referencia de de la transacción (Orden de Venta; Orden de Compra) de su socio de negocio)";

@XendraTrl(Identifier="9147c8de-0edb-9191-70f8-7f35e85e9c8b")
public static String es_PE_FIELD_Invoice_OrderReference_Help="La referencia de orden del socio de negocio es la referencia para esta transacción específica. Frecuentemente los números de orden de compras se dan para ser impresas en las facturas como una referencia más fácil. Un número estándar puede ser definido en la ventana socio de negocio (Cliente).";

@XendraField(AD_Column_ID="POReference",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9147c8de-0edb-9191-70f8-7f35e85e9c8b")
public static final String FIELDNAME_Invoice_OrderReference="9147c8de-0edb-9191-70f8-7f35e85e9c8b";

@XendraTrl(Identifier="efe50bf7-a6e9-db28-b8c6-6d960a181869")
public static String es_PE_FIELD_Invoice_OrderReference2_Name="Referencia de Orden de Socio";

@XendraTrl(Identifier="efe50bf7-a6e9-db28-b8c6-6d960a181869")
public static String es_PE_FIELD_Invoice_OrderReference2_Description="Número de referencia de de la transacción (Orden de Venta; Orden de Compra) de su socio de negocio)";

@XendraTrl(Identifier="efe50bf7-a6e9-db28-b8c6-6d960a181869")
public static String es_PE_FIELD_Invoice_OrderReference2_Help="La referencia de orden del socio de negocio es la referencia para esta transacción específica. Frecuentemente los números de orden de compras se dan para ser impresas en las facturas como una referencia más fácil. Un número estándar puede ser definido en la ventana socio de negocio (Cliente).";

@XendraField(AD_Column_ID="POReference",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="efe50bf7-a6e9-db28-b8c6-6d960a181869")
public static final String FIELDNAME_Invoice_OrderReference2="efe50bf7-a6e9-db28-b8c6-6d960a181869";

@XendraTrl(Identifier="7d0cac9e-12ce-e1a5-5002-1f5f3037307e")
public static String es_PE_FIELD_Invoice_OrderReference3_Name="Referencia de Orden de Socio";

@XendraTrl(Identifier="7d0cac9e-12ce-e1a5-5002-1f5f3037307e")
public static String es_PE_FIELD_Invoice_OrderReference3_Description="Número de referencia de de la transacción (Orden de Venta; Orden de Compra) de su socio de negocio)";

@XendraTrl(Identifier="7d0cac9e-12ce-e1a5-5002-1f5f3037307e")
public static String es_PE_FIELD_Invoice_OrderReference3_Help="La referencia de orden del socio de negocio es la referencia para esta transacción específica. Frecuentemente los números de orden de compras se dan para ser impresas en las facturas como una referencia más fácil. Un número estándar puede ser definido en la ventana socio de negocio (Cliente).";

@XendraField(AD_Column_ID="POReference",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7d0cac9e-12ce-e1a5-5002-1f5f3037307e")
public static final String FIELDNAME_Invoice_OrderReference3="7d0cac9e-12ce-e1a5-5002-1f5f3037307e";

@XendraTrl(Identifier="86de7764-7c95-b20c-7c9c-ef623d604875")
public static String es_PE_FIELD_Invoice_OrderReference4_Name="Referencia de Orden de Socio";

@XendraTrl(Identifier="86de7764-7c95-b20c-7c9c-ef623d604875")
public static String es_PE_FIELD_Invoice_OrderReference4_Description="Número de referencia de de la transacción (Orden de Venta; Orden de Compra) de su socio de negocio)";

@XendraTrl(Identifier="86de7764-7c95-b20c-7c9c-ef623d604875")
public static String es_PE_FIELD_Invoice_OrderReference4_Help="La referencia de orden del socio de negocio es la referencia para esta transacción específica. Frecuentemente los números de orden de compras se dan para ser impresas en las facturas como una referencia más fácil. Un número estándar puede ser definido en la ventana socio de negocio (Cliente).";

@XendraField(AD_Column_ID="POReference",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="86de7764-7c95-b20c-7c9c-ef623d604875")
public static final String FIELDNAME_Invoice_OrderReference4="86de7764-7c95-b20c-7c9c-ef623d604875";

@XendraTrl(Identifier="e0398e65-f028-aa98-c24a-4d2a1df73fb5")
public static String es_PE_FIELD_PartnerInvoices_OrderReference_Name="Referencia de Orden de Socio";

@XendraTrl(Identifier="e0398e65-f028-aa98-c24a-4d2a1df73fb5")
public static String es_PE_FIELD_PartnerInvoices_OrderReference_Description="Número de referencia de de la transacción (Orden de Venta; Orden de Compra) de su socio de negocio)";

@XendraTrl(Identifier="e0398e65-f028-aa98-c24a-4d2a1df73fb5")
public static String es_PE_FIELD_PartnerInvoices_OrderReference_Help="La referencia de orden del socio de negocio es la referencia para esta transacción específica. Frecuentemente los números de orden de compras se dan para ser impresas en las facturas como una referencia más fácil. Un número estándar puede ser definido en la ventana socio de negocio (Cliente).";

@XendraField(AD_Column_ID="POReference",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e0398e65-f028-aa98-c24a-4d2a1df73fb5")
public static final String FIELDNAME_PartnerInvoices_OrderReference="e0398e65-f028-aa98-c24a-4d2a1df73fb5";

@XendraTrl(Identifier="be09fb0d-a9bb-2495-3cf5-d3c986b6c4dd")
public static String es_PE_FIELD_Invoices_OrderReference_Name="Referencia de Orden de Socio";

@XendraTrl(Identifier="be09fb0d-a9bb-2495-3cf5-d3c986b6c4dd")
public static String es_PE_FIELD_Invoices_OrderReference_Description="Número de referencia de de la transacción (Orden de Venta; Orden de Compra) de su socio de negocio)";

@XendraTrl(Identifier="be09fb0d-a9bb-2495-3cf5-d3c986b6c4dd")
public static String es_PE_FIELD_Invoices_OrderReference_Help="La referencia de orden del socio de negocio es la referencia para esta transacción específica. Frecuentemente los números de orden de compras se dan para ser impresas en las facturas como una referencia más fácil. Un número estándar puede ser definido en la ventana socio de negocio (Cliente).";

@XendraField(AD_Column_ID="POReference",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="be09fb0d-a9bb-2495-3cf5-d3c986b6c4dd")
public static final String FIELDNAME_Invoices_OrderReference="be09fb0d-a9bb-2495-3cf5-d3c986b6c4dd";

@XendraTrl(Identifier="80729249-cabd-ddb5-483c-64030486642f")
public static String es_PE_COLUMN_POReference_Name="Referencia de Orden de Socio";

@XendraColumn(AD_Element_ID="c3de7eea-53b7-a810-0260-1bcb037a2967",ColumnName="POReference",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="80729249-cabd-ddb5-483c-64030486642f",
Synchronized="2020-03-03 21:36:58.0")
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

@XendraTrl(Identifier="6835f74a-861c-204c-7deb-52a2385a90cb")
public static String es_PE_FIELD_Invoice_Posted_Name="Fijada";

@XendraTrl(Identifier="6835f74a-861c-204c-7deb-52a2385a90cb")
public static String es_PE_FIELD_Invoice_Posted_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="6835f74a-861c-204c-7deb-52a2385a90cb")
public static String es_PE_FIELD_Invoice_Posted_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraField(AD_Column_ID="Posted",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="@Processed@=Y & @#ShowAcct@=Y",DisplayLength=20,IsReadOnly=false,SeqNo=360,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="6835f74a-861c-204c-7deb-52a2385a90cb")
public static final String FIELDNAME_Invoice_Posted="6835f74a-861c-204c-7deb-52a2385a90cb";

@XendraTrl(Identifier="9a599ea3-33ce-c068-323e-4f332c9fe9d7")
public static String es_PE_FIELD_Invoice_Posted2_Name="Fijada";

@XendraTrl(Identifier="9a599ea3-33ce-c068-323e-4f332c9fe9d7")
public static String es_PE_FIELD_Invoice_Posted2_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="9a599ea3-33ce-c068-323e-4f332c9fe9d7")
public static String es_PE_FIELD_Invoice_Posted2_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraField(AD_Column_ID="Posted",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="@Processed@=Y & @#ShowAcct@=Y",DisplayLength=20,IsReadOnly=false,SeqNo=370,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="9a599ea3-33ce-c068-323e-4f332c9fe9d7")
public static final String FIELDNAME_Invoice_Posted2="9a599ea3-33ce-c068-323e-4f332c9fe9d7";

@XendraTrl(Identifier="21d69ab2-e084-80f8-834c-aaca489980aa")
public static String es_PE_FIELD_Invoice_Posted3_Name="Fijada";

@XendraTrl(Identifier="21d69ab2-e084-80f8-834c-aaca489980aa")
public static String es_PE_FIELD_Invoice_Posted3_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="21d69ab2-e084-80f8-834c-aaca489980aa")
public static String es_PE_FIELD_Invoice_Posted3_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraField(AD_Column_ID="Posted",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="@Processed@=Y & @#ShowAcct@=Y",DisplayLength=23,IsReadOnly=false,SeqNo=280,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="21d69ab2-e084-80f8-834c-aaca489980aa")
public static final String FIELDNAME_Invoice_Posted3="21d69ab2-e084-80f8-834c-aaca489980aa";

@XendraTrl(Identifier="ce7cd0e0-6160-c858-994c-55537905748b")
public static String es_PE_FIELD_Invoice_Posted4_Name="Fijada";

@XendraTrl(Identifier="ce7cd0e0-6160-c858-994c-55537905748b")
public static String es_PE_FIELD_Invoice_Posted4_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="ce7cd0e0-6160-c858-994c-55537905748b")
public static String es_PE_FIELD_Invoice_Posted4_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraField(AD_Column_ID="Posted",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ce7cd0e0-6160-c858-994c-55537905748b")
public static final String FIELDNAME_Invoice_Posted4="ce7cd0e0-6160-c858-994c-55537905748b";

@XendraTrl(Identifier="7420f912-d47a-def7-568a-6fe1a717574a")
public static String es_PE_FIELD_PartnerInvoices_Posted_Name="Fijada";

@XendraTrl(Identifier="7420f912-d47a-def7-568a-6fe1a717574a")
public static String es_PE_FIELD_PartnerInvoices_Posted_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="7420f912-d47a-def7-568a-6fe1a717574a")
public static String es_PE_FIELD_PartnerInvoices_Posted_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraField(AD_Column_ID="Posted",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7420f912-d47a-def7-568a-6fe1a717574a")
public static final String FIELDNAME_PartnerInvoices_Posted="7420f912-d47a-def7-568a-6fe1a717574a";

@XendraTrl(Identifier="ff126d4b-cda6-5b6f-c2c6-9b1498857152")
public static String es_PE_FIELD_Invoices_Posted_Name="Fijada";

@XendraTrl(Identifier="ff126d4b-cda6-5b6f-c2c6-9b1498857152")
public static String es_PE_FIELD_Invoices_Posted_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="ff126d4b-cda6-5b6f-c2c6-9b1498857152")
public static String es_PE_FIELD_Invoices_Posted_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraField(AD_Column_ID="Posted",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ff126d4b-cda6-5b6f-c2c6-9b1498857152")
public static final String FIELDNAME_Invoices_Posted="ff126d4b-cda6-5b6f-c2c6-9b1498857152";

@XendraTrl(Identifier="9230c98b-9fb9-1dc0-08f4-999cff4676e5")
public static String es_PE_COLUMN_Posted_Name="Fijada";

@XendraColumn(AD_Element_ID="5eb52ebc-6992-12f5-b85a-e0a136df259b",ColumnName="Posted",
AD_Reference_ID=28,AD_Reference_Value_ID="d2b659dd-6c8c-baf3-fc71-0ee997273154",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9230c98b-9fb9-1dc0-08f4-999cff4676e5",Synchronized="2020-03-03 21:36:58.0")
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
@XendraTrl(Identifier="dd1be016-04f9-4f17-b0df-fa572da39a0d")
public static String es_PE_FIELD_Invoice_PrinterSerial_Name="printerserial";

@XendraField(AD_Column_ID="PrinterSerial",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-06 14:47:17.0",
Identifier="dd1be016-04f9-4f17-b0df-fa572da39a0d")
public static final String FIELDNAME_Invoice_PrinterSerial="dd1be016-04f9-4f17-b0df-fa572da39a0d";

@XendraTrl(Identifier="5a49d0ed-c4d7-4585-82a1-7e9941bdb857")
public static String es_PE_FIELD_Invoice_PrinterSerial2_Name="printerserial";

@XendraField(AD_Column_ID="PrinterSerial",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-08-30 18:45:40.0",
Identifier="5a49d0ed-c4d7-4585-82a1-7e9941bdb857")
public static final String FIELDNAME_Invoice_PrinterSerial2="5a49d0ed-c4d7-4585-82a1-7e9941bdb857";

@XendraTrl(Identifier="83a3112a-cda0-4592-8930-6020dece1b57")
public static String es_PE_COLUMN_PrinterSerial_Name="PrinterSerial";

@XendraColumn(AD_Element_ID="04f9081d-8d9d-fc64-9b26-6f16718cae86",ColumnName="PrinterSerial",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="83a3112a-cda0-4592-8930-6020dece1b57",
Synchronized="2020-03-03 21:36:58.0")
/** Column name PrinterSerial */
public static final String COLUMNNAME_PrinterSerial = "PrinterSerial";
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

@XendraTrl(Identifier="3e4c4f8c-1a6f-957f-61fa-118d372d0b12")
public static String es_PE_FIELD_Invoice_Processed_Name="Procesado";

@XendraTrl(Identifier="3e4c4f8c-1a6f-957f-61fa-118d372d0b12")
public static String es_PE_FIELD_Invoice_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="3e4c4f8c-1a6f-957f-61fa-118d372d0b12")
public static String es_PE_FIELD_Invoice_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=430,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3e4c4f8c-1a6f-957f-61fa-118d372d0b12")
public static final String FIELDNAME_Invoice_Processed="3e4c4f8c-1a6f-957f-61fa-118d372d0b12";

@XendraTrl(Identifier="8a0d1718-b808-a0f9-ef77-82b72f2369aa")
public static String es_PE_FIELD_Invoice_Processed2_Name="Procesado";

@XendraTrl(Identifier="8a0d1718-b808-a0f9-ef77-82b72f2369aa")
public static String es_PE_FIELD_Invoice_Processed2_Description="El documento ha sido procesado";

@XendraTrl(Identifier="8a0d1718-b808-a0f9-ef77-82b72f2369aa")
public static String es_PE_FIELD_Invoice_Processed2_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=410,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8a0d1718-b808-a0f9-ef77-82b72f2369aa")
public static final String FIELDNAME_Invoice_Processed2="8a0d1718-b808-a0f9-ef77-82b72f2369aa";

@XendraTrl(Identifier="9859079c-8762-5331-8763-9ffa7eb790d8")
public static String es_PE_FIELD_Invoice_Processed3_Name="Procesado";

@XendraTrl(Identifier="9859079c-8762-5331-8763-9ffa7eb790d8")
public static String es_PE_FIELD_Invoice_Processed3_Description="El documento ha sido procesado";

@XendraTrl(Identifier="9859079c-8762-5331-8763-9ffa7eb790d8")
public static String es_PE_FIELD_Invoice_Processed3_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9859079c-8762-5331-8763-9ffa7eb790d8")
public static final String FIELDNAME_Invoice_Processed3="9859079c-8762-5331-8763-9ffa7eb790d8";

@XendraTrl(Identifier="a6984a1c-bf82-06f9-ca87-f8f68e6f175a")
public static String es_PE_FIELD_Invoice_Processed4_Name="Procesado";

@XendraTrl(Identifier="a6984a1c-bf82-06f9-ca87-f8f68e6f175a")
public static String es_PE_FIELD_Invoice_Processed4_Description="El documento ha sido procesado";

@XendraTrl(Identifier="a6984a1c-bf82-06f9-ca87-f8f68e6f175a")
public static String es_PE_FIELD_Invoice_Processed4_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a6984a1c-bf82-06f9-ca87-f8f68e6f175a")
public static final String FIELDNAME_Invoice_Processed4="a6984a1c-bf82-06f9-ca87-f8f68e6f175a";

@XendraTrl(Identifier="f5e12afc-c148-ff5e-8e44-f901745adaf2")
public static String es_PE_FIELD_PartnerInvoices_Processed_Name="Procesado";

@XendraTrl(Identifier="f5e12afc-c148-ff5e-8e44-f901745adaf2")
public static String es_PE_FIELD_PartnerInvoices_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="f5e12afc-c148-ff5e-8e44-f901745adaf2")
public static String es_PE_FIELD_PartnerInvoices_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f5e12afc-c148-ff5e-8e44-f901745adaf2")
public static final String FIELDNAME_PartnerInvoices_Processed="f5e12afc-c148-ff5e-8e44-f901745adaf2";

@XendraTrl(Identifier="3075c633-49b5-8a4c-7a9e-4f37f215c5df")
public static String es_PE_FIELD_Invoices_Processed_Name="Procesado";

@XendraTrl(Identifier="3075c633-49b5-8a4c-7a9e-4f37f215c5df")
public static String es_PE_FIELD_Invoices_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="3075c633-49b5-8a4c-7a9e-4f37f215c5df")
public static String es_PE_FIELD_Invoices_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3075c633-49b5-8a4c-7a9e-4f37f215c5df")
public static final String FIELDNAME_Invoices_Processed="3075c633-49b5-8a4c-7a9e-4f37f215c5df";

@XendraTrl(Identifier="a344a9c6-572e-7001-b6f0-8959fb044e12")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a344a9c6-572e-7001-b6f0-8959fb044e12",
Synchronized="2020-03-03 21:36:58.0")
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

@XendraTrl(Identifier="177b05f6-f901-bab2-9a1d-3944c7e6a4be")
public static String es_PE_FIELD_Invoice_ProcessNow_Name="Procesar Factura";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="177b05f6-f901-bab2-9a1d-3944c7e6a4be")
public static final String FIELDNAME_Invoice_ProcessNow="177b05f6-f901-bab2-9a1d-3944c7e6a4be";

@XendraTrl(Identifier="6f6692ee-263e-745e-19f6-bb35c66ef9c2")
public static String es_PE_FIELD_Invoice_ProcessNow2_Name="Procesar Factura";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6f6692ee-263e-745e-19f6-bb35c66ef9c2")
public static final String FIELDNAME_Invoice_ProcessNow2="6f6692ee-263e-745e-19f6-bb35c66ef9c2";

@XendraTrl(Identifier="ad7df5d9-a44a-8d04-a3fa-e8ef09b8e925")
public static String es_PE_FIELD_Invoice_ProcessNow3_Name="Procesar Factura";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ad7df5d9-a44a-8d04-a3fa-e8ef09b8e925")
public static final String FIELDNAME_Invoice_ProcessNow3="ad7df5d9-a44a-8d04-a3fa-e8ef09b8e925";

@XendraTrl(Identifier="835bd6b6-a1d3-f626-1ce2-dc3754fef8e9")
public static String es_PE_FIELD_Invoice_ProcessNow4_Name="Procesar Factura";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="835bd6b6-a1d3-f626-1ce2-dc3754fef8e9")
public static final String FIELDNAME_Invoice_ProcessNow4="835bd6b6-a1d3-f626-1ce2-dc3754fef8e9";

@XendraTrl(Identifier="b99ad7fb-8880-16ea-03c2-93ff73fe3a8d")
public static String es_PE_FIELD_PartnerInvoices_ProcessNow_Name="Procesar Factura";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b99ad7fb-8880-16ea-03c2-93ff73fe3a8d")
public static final String FIELDNAME_PartnerInvoices_ProcessNow="b99ad7fb-8880-16ea-03c2-93ff73fe3a8d";

@XendraTrl(Identifier="b93408d4-502b-0753-38b1-fe32d7c8d750")
public static String es_PE_FIELD_Invoices_ProcessNow_Name="Procesar Factura";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b93408d4-502b-0753-38b1-fe32d7c8d750")
public static final String FIELDNAME_Invoices_ProcessNow="b93408d4-502b-0753-38b1-fe32d7c8d750";

@XendraTrl(Identifier="e4914344-aea5-1377-2e1c-2179157e621e")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="d2a0c97f-2078-edb6-9506-e4c2c9315366",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e4914344-aea5-1377-2e1c-2179157e621e",Synchronized="2020-03-03 21:36:58.0")
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

@XendraTrl(Identifier="577c7537-99fb-7f42-1c6d-10711afcc738")
public static String es_PE_FIELD_Invoice_Ref_Invoice_ID_Name="Referencia de Factura";

@XendraField(AD_Column_ID="Ref_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="577c7537-99fb-7f42-1c6d-10711afcc738")
public static final String FIELDNAME_Invoice_Ref_Invoice_ID="577c7537-99fb-7f42-1c6d-10711afcc738";

@XendraTrl(Identifier="e9b5699b-25bb-ca25-2b6f-4d43fefb4551")
public static String es_PE_FIELD_Invoice_Ref_Invoice_ID2_Name="Referencia de Factura";

@XendraField(AD_Column_ID="Ref_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e9b5699b-25bb-ca25-2b6f-4d43fefb4551")
public static final String FIELDNAME_Invoice_Ref_Invoice_ID2="e9b5699b-25bb-ca25-2b6f-4d43fefb4551";

@XendraTrl(Identifier="f75227bd-212d-9d83-5ffc-54bf913218bb")
public static String es_PE_FIELD_Invoice_Ref_Invoice_ID3_Name="Referencia de Factura";

@XendraField(AD_Column_ID="Ref_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f75227bd-212d-9d83-5ffc-54bf913218bb")
public static final String FIELDNAME_Invoice_Ref_Invoice_ID3="f75227bd-212d-9d83-5ffc-54bf913218bb";

@XendraTrl(Identifier="208288b2-4701-10db-0665-dc944863d05a")
public static String es_PE_FIELD_Invoice_Ref_Invoice_ID4_Name="Referencia de Factura";

@XendraField(AD_Column_ID="Ref_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="208288b2-4701-10db-0665-dc944863d05a")
public static final String FIELDNAME_Invoice_Ref_Invoice_ID4="208288b2-4701-10db-0665-dc944863d05a";

@XendraTrl(Identifier="66814328-7d8e-098c-6ccf-0bd1d69bbee9")
public static String es_PE_FIELD_PartnerInvoices_Ref_Invoice_ID_Name="Referencia de Factura";

@XendraField(AD_Column_ID="Ref_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="66814328-7d8e-098c-6ccf-0bd1d69bbee9")
public static final String FIELDNAME_PartnerInvoices_Ref_Invoice_ID="66814328-7d8e-098c-6ccf-0bd1d69bbee9";

@XendraTrl(Identifier="e89e3244-7075-eb1e-5de9-aa974bf481a9")
public static String es_PE_FIELD_Invoices_Ref_Invoice_ID_Name="Referencia de Factura";

@XendraField(AD_Column_ID="Ref_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e89e3244-7075-eb1e-5de9-aa974bf481a9")
public static final String FIELDNAME_Invoices_Ref_Invoice_ID="e89e3244-7075-eb1e-5de9-aa974bf481a9";

@XendraTrl(Identifier="b0e9e188-5236-1431-638d-1b0400489fe7")
public static String es_PE_COLUMN_Ref_Invoice_ID_Name="Referencia de Factura";

@XendraColumn(AD_Element_ID="e3ca474e-0bd4-06ea-5910-51930caa9bbc",ColumnName="Ref_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="7fd6a4ea-911e-151b-68bf-3a86cc5f06e3",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutInvoice.reference",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b0e9e188-5236-1431-638d-1b0400489fe7",
Synchronized="2020-03-03 21:36:58.0")
/** Column name Ref_Invoice_ID */
public static final String COLUMNNAME_Ref_Invoice_ID = "Ref_Invoice_ID";
/** Set Sales Representative.
@param SalesRep_ID Sales Representative or Company Agent */
public void setSalesRep_ID (int SalesRep_ID)
{
if (SalesRep_ID <= 0) set_Value (COLUMNNAME_SalesRep_ID, null);
 else 
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

@XendraTrl(Identifier="0b39089d-f346-baf4-2be4-5c598ab23b74")
public static String es_PE_FIELD_Invoice_SalesRepresentative_Name="Vendedor";

@XendraTrl(Identifier="0b39089d-f346-baf4-2be4-5c598ab23b74")
public static String es_PE_FIELD_Invoice_SalesRepresentative_Description="Representante de Ventas";

@XendraTrl(Identifier="0b39089d-f346-baf4-2be4-5c598ab23b74")
public static String es_PE_FIELD_Invoice_SalesRepresentative_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0b39089d-f346-baf4-2be4-5c598ab23b74")
public static final String FIELDNAME_Invoice_SalesRepresentative="0b39089d-f346-baf4-2be4-5c598ab23b74";

@XendraTrl(Identifier="95862a41-31ed-24a4-d445-c2af0599f398")
public static String es_PE_FIELD_Invoice_CompanyAgent_Name="Comprador";

@XendraTrl(Identifier="95862a41-31ed-24a4-d445-c2af0599f398")
public static String es_PE_FIELD_Invoice_CompanyAgent_Description="Comprador/ Agente";

@XendraTrl(Identifier="95862a41-31ed-24a4-d445-c2af0599f398")
public static String es_PE_FIELD_Invoice_CompanyAgent_Help="Agente de compras para el documento.";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="95862a41-31ed-24a4-d445-c2af0599f398")
public static final String FIELDNAME_Invoice_CompanyAgent="95862a41-31ed-24a4-d445-c2af0599f398";

@XendraTrl(Identifier="ee02123e-264a-e922-8881-88872bb0dc32")
public static String es_PE_FIELD_Invoice_CompanyAgent2_Name="Comprador";

@XendraTrl(Identifier="ee02123e-264a-e922-8881-88872bb0dc32")
public static String es_PE_FIELD_Invoice_CompanyAgent2_Description="Comprador/ Agente";

@XendraTrl(Identifier="ee02123e-264a-e922-8881-88872bb0dc32")
public static String es_PE_FIELD_Invoice_CompanyAgent2_Help="Agente de compras para el documento.";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ee02123e-264a-e922-8881-88872bb0dc32")
public static final String FIELDNAME_Invoice_CompanyAgent2="ee02123e-264a-e922-8881-88872bb0dc32";

@XendraTrl(Identifier="459a03e8-4975-c997-3ea8-44968e287175")
public static String es_PE_FIELD_Invoice_SalesRepresentative2_Name="Agente Cía";

@XendraTrl(Identifier="459a03e8-4975-c997-3ea8-44968e287175")
public static String es_PE_FIELD_Invoice_SalesRepresentative2_Description="Representante de Ventas";

@XendraTrl(Identifier="459a03e8-4975-c997-3ea8-44968e287175")
public static String es_PE_FIELD_Invoice_SalesRepresentative2_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="459a03e8-4975-c997-3ea8-44968e287175")
public static final String FIELDNAME_Invoice_SalesRepresentative2="459a03e8-4975-c997-3ea8-44968e287175";

@XendraTrl(Identifier="f41652dd-0040-efc3-2cf8-762a2a1403ae")
public static String es_PE_FIELD_PartnerInvoices_SalesRepresentative_Name="Agente Cía";

@XendraTrl(Identifier="f41652dd-0040-efc3-2cf8-762a2a1403ae")
public static String es_PE_FIELD_PartnerInvoices_SalesRepresentative_Description="Representante de Ventas";

@XendraTrl(Identifier="f41652dd-0040-efc3-2cf8-762a2a1403ae")
public static String es_PE_FIELD_PartnerInvoices_SalesRepresentative_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f41652dd-0040-efc3-2cf8-762a2a1403ae")
public static final String FIELDNAME_PartnerInvoices_SalesRepresentative="f41652dd-0040-efc3-2cf8-762a2a1403ae";

@XendraTrl(Identifier="ebb8b41f-f3a3-4c58-7c8d-8c3536250184")
public static String es_PE_FIELD_Invoices_SalesRepresentative_Name="Agente Cía";

@XendraTrl(Identifier="ebb8b41f-f3a3-4c58-7c8d-8c3536250184")
public static String es_PE_FIELD_Invoices_SalesRepresentative_Description="Representante de Ventas";

@XendraTrl(Identifier="ebb8b41f-f3a3-4c58-7c8d-8c3536250184")
public static String es_PE_FIELD_Invoices_SalesRepresentative_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ebb8b41f-f3a3-4c58-7c8d-8c3536250184")
public static final String FIELDNAME_Invoices_SalesRepresentative="ebb8b41f-f3a3-4c58-7c8d-8c3536250184";

@XendraTrl(Identifier="f07c0ee2-24bb-1eeb-13db-b93f9c57c173")
public static String es_PE_COLUMN_SalesRep_ID_Name="Agente Cía";

@XendraColumn(AD_Element_ID="197a9c3a-ff10-c291-d65f-5e05a36d3710",ColumnName="SalesRep_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="15251147-a1b6-4a83-a3a5-2d3ae7db69d9",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=true,ColumnSQL="",IsAllowLogging=false,
Identifier="f07c0ee2-24bb-1eeb-13db-b93f9c57c173",Synchronized="2020-03-03 21:36:58.0")
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

@XendraTrl(Identifier="e1d4ad0c-3e96-52f0-5fb3-407a3eed2674")
public static String es_PE_FIELD_Invoice_SendEMail_Name="Envía Email";

@XendraTrl(Identifier="e1d4ad0c-3e96-52f0-5fb3-407a3eed2674")
public static String es_PE_FIELD_Invoice_SendEMail_Description="Permite enviar el documento Email";

@XendraTrl(Identifier="e1d4ad0c-3e96-52f0-5fb3-407a3eed2674")
public static String es_PE_FIELD_Invoice_SendEMail_Help="Envíe los email con el documento unido (ej. factura, nota de entrega, etc.)";

@XendraField(AD_Column_ID="SendEMail",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e1d4ad0c-3e96-52f0-5fb3-407a3eed2674")
public static final String FIELDNAME_Invoice_SendEMail="e1d4ad0c-3e96-52f0-5fb3-407a3eed2674";

@XendraTrl(Identifier="d7a17365-acf2-4515-469a-cd92f21ebe34")
public static String es_PE_FIELD_Invoice_SendEMail2_Name="Envía Email";

@XendraTrl(Identifier="d7a17365-acf2-4515-469a-cd92f21ebe34")
public static String es_PE_FIELD_Invoice_SendEMail2_Description="Permite enviar el documento Email";

@XendraTrl(Identifier="d7a17365-acf2-4515-469a-cd92f21ebe34")
public static String es_PE_FIELD_Invoice_SendEMail2_Help="Envíe los email con el documento unido (ej. factura, nota de entrega, etc.)";

@XendraField(AD_Column_ID="SendEMail",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d7a17365-acf2-4515-469a-cd92f21ebe34")
public static final String FIELDNAME_Invoice_SendEMail2="d7a17365-acf2-4515-469a-cd92f21ebe34";

@XendraTrl(Identifier="44a65bb7-e6c1-c7f8-660b-bd5a6105f5b6")
public static String es_PE_FIELD_Invoice_SendEMail3_Name="Envía Email";

@XendraTrl(Identifier="44a65bb7-e6c1-c7f8-660b-bd5a6105f5b6")
public static String es_PE_FIELD_Invoice_SendEMail3_Description="Permite enviar el documento Email";

@XendraTrl(Identifier="44a65bb7-e6c1-c7f8-660b-bd5a6105f5b6")
public static String es_PE_FIELD_Invoice_SendEMail3_Help="Envíe los email con el documento unido (ej. factura, nota de entrega, etc.)";

@XendraField(AD_Column_ID="SendEMail",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="44a65bb7-e6c1-c7f8-660b-bd5a6105f5b6")
public static final String FIELDNAME_Invoice_SendEMail3="44a65bb7-e6c1-c7f8-660b-bd5a6105f5b6";

@XendraTrl(Identifier="db086491-8016-3dfb-8608-c84249f0719e")
public static String es_PE_FIELD_Invoice_SendEMail4_Name="Envía Email";

@XendraTrl(Identifier="db086491-8016-3dfb-8608-c84249f0719e")
public static String es_PE_FIELD_Invoice_SendEMail4_Description="Permite enviar el documento Email";

@XendraTrl(Identifier="db086491-8016-3dfb-8608-c84249f0719e")
public static String es_PE_FIELD_Invoice_SendEMail4_Help="Envíe los email con el documento unido (ej. factura, nota de entrega, etc.)";

@XendraField(AD_Column_ID="SendEMail",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="db086491-8016-3dfb-8608-c84249f0719e")
public static final String FIELDNAME_Invoice_SendEMail4="db086491-8016-3dfb-8608-c84249f0719e";

@XendraTrl(Identifier="3c998fda-5d3b-162d-321f-5513d6a1d687")
public static String es_PE_FIELD_PartnerInvoices_SendEMail_Name="Envía Email";

@XendraTrl(Identifier="3c998fda-5d3b-162d-321f-5513d6a1d687")
public static String es_PE_FIELD_PartnerInvoices_SendEMail_Description="Permite enviar el documento Email";

@XendraTrl(Identifier="3c998fda-5d3b-162d-321f-5513d6a1d687")
public static String es_PE_FIELD_PartnerInvoices_SendEMail_Help="Envíe los email con el documento unido (ej. factura, nota de entrega, etc.)";

@XendraField(AD_Column_ID="SendEMail",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3c998fda-5d3b-162d-321f-5513d6a1d687")
public static final String FIELDNAME_PartnerInvoices_SendEMail="3c998fda-5d3b-162d-321f-5513d6a1d687";

@XendraTrl(Identifier="709a8893-30d3-b7fd-4854-df54bce05ae0")
public static String es_PE_FIELD_Invoices_SendEMail_Name="Envía Email";

@XendraTrl(Identifier="709a8893-30d3-b7fd-4854-df54bce05ae0")
public static String es_PE_FIELD_Invoices_SendEMail_Description="Permite enviar el documento Email";

@XendraTrl(Identifier="709a8893-30d3-b7fd-4854-df54bce05ae0")
public static String es_PE_FIELD_Invoices_SendEMail_Help="Envíe los email con el documento unido (ej. factura, nota de entrega, etc.)";

@XendraField(AD_Column_ID="SendEMail",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="709a8893-30d3-b7fd-4854-df54bce05ae0")
public static final String FIELDNAME_Invoices_SendEMail="709a8893-30d3-b7fd-4854-df54bce05ae0";

@XendraTrl(Identifier="4fc5a446-8103-d5be-3b13-5f357c731495")
public static String es_PE_COLUMN_SendEMail_Name="Envía Email";

@XendraColumn(AD_Element_ID="88409dac-427a-2fc2-2bde-34430996bd43",ColumnName="SendEMail",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4fc5a446-8103-d5be-3b13-5f357c731495",
Synchronized="2020-03-03 21:36:58.0")
/** Column name SendEMail */
public static final String COLUMNNAME_SendEMail = "SendEMail";
/** Set Document Serial.
@param Serial Serial Number for the Document */
public void setSerial (String Serial)
{
if (Serial != null && Serial.length() > 10)
{
log.warning("Length > 10 - truncated");
Serial = Serial.substring(0,9);
}
set_Value (COLUMNNAME_Serial, Serial);
}
/** Get Document Serial.
@return Serial Number for the Document */
public String getSerial() 
{
String value = (String)get_Value(COLUMNNAME_Serial);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="dcb26ab1-a6f4-6885-4134-12dd6e15d2ff")
public static String es_PE_FIELD_Invoice_DocumentSerial_Name="Serie Doc.";

@XendraTrl(Identifier="dcb26ab1-a6f4-6885-4134-12dd6e15d2ff")
public static String es_PE_FIELD_Invoice_DocumentSerial_Description="Serie del Documento";

@XendraTrl(Identifier="dcb26ab1-a6f4-6885-4134-12dd6e15d2ff")
public static String es_PE_FIELD_Invoice_DocumentSerial_Help="En algunos paises, los documentos tienen una serie ademas de su numero. Ademas, cada serie tiene una numeracion independiente.";

@XendraField(AD_Column_ID="Serial",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dcb26ab1-a6f4-6885-4134-12dd6e15d2ff")
public static final String FIELDNAME_Invoice_DocumentSerial="dcb26ab1-a6f4-6885-4134-12dd6e15d2ff";

@XendraTrl(Identifier="a1092e5c-c277-130e-8ea6-a948709a017c")
public static String es_PE_FIELD_Invoice_DocumentSerial2_Name="Serie Doc.";

@XendraTrl(Identifier="a1092e5c-c277-130e-8ea6-a948709a017c")
public static String es_PE_FIELD_Invoice_DocumentSerial2_Description="Serie del Documento";

@XendraTrl(Identifier="a1092e5c-c277-130e-8ea6-a948709a017c")
public static String es_PE_FIELD_Invoice_DocumentSerial2_Help="En algunos paises, los documentos tienen una serie ademas de su numero. Ademas, cada serie tiene una numeracion independiente.";

@XendraField(AD_Column_ID="Serial",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a1092e5c-c277-130e-8ea6-a948709a017c")
public static final String FIELDNAME_Invoice_DocumentSerial2="a1092e5c-c277-130e-8ea6-a948709a017c";

@XendraTrl(Identifier="734ad524-d490-48a8-6213-5518a7a2cdc8")
public static String es_PE_COLUMN_Serial_Name="Serie del Documento";

@XendraColumn(AD_Element_ID="56277733-3963-25db-320e-99e754ca1e9c",ColumnName="Serial",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="734ad524-d490-48a8-6213-5518a7a2cdc8",
Synchronized="2020-03-03 21:36:58.0")
/** Column name Serial */
public static final String COLUMNNAME_Serial = "Serial";
/** Set StatusDate.
@param StatusDate StatusDate */
public void setStatusDate (Timestamp StatusDate)
{
set_Value (COLUMNNAME_StatusDate, StatusDate);
}
/** Get StatusDate.
@return StatusDate */
public Timestamp getStatusDate() 
{
return (Timestamp)get_Value(COLUMNNAME_StatusDate);
}

@XendraTrl(Identifier="8f0a89af-5b29-abfa-2665-f7638cbefd11")
public static String es_PE_FIELD_Invoice_StatusDate_Name="Fecha del Estado";

@XendraTrl(Identifier="8f0a89af-5b29-abfa-2665-f7638cbefd11")
public static String es_PE_FIELD_Invoice_StatusDate_Description="Fecha del Estado";

@XendraTrl(Identifier="8f0a89af-5b29-abfa-2665-f7638cbefd11")
public static String es_PE_FIELD_Invoice_StatusDate_Help="Fecha del Estado";

@XendraField(AD_Column_ID="StatusDate",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=420,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8f0a89af-5b29-abfa-2665-f7638cbefd11")
public static final String FIELDNAME_Invoice_StatusDate="8f0a89af-5b29-abfa-2665-f7638cbefd11";

@XendraTrl(Identifier="55c9da9e-b360-fb82-abce-3a416fdde456")
public static String es_PE_FIELD_Invoice_StatusDate2_Name="STATUSDATE";

@XendraField(AD_Column_ID="StatusDate",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=7,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="55c9da9e-b360-fb82-abce-3a416fdde456")
public static final String FIELDNAME_Invoice_StatusDate2="55c9da9e-b360-fb82-abce-3a416fdde456";

@XendraTrl(Identifier="6db10f3a-2f02-d0ba-b809-c6a98f01caf7")
public static String es_PE_COLUMN_StatusDate_Name="STATUSDATE";

@XendraColumn(AD_Element_ID="f4c6dc34-fa65-aa81-84cf-3e2d06a1583f",ColumnName="StatusDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6db10f3a-2f02-d0ba-b809-c6a98f01caf7",
Synchronized="2020-03-03 21:36:58.0")
/** Column name StatusDate */
public static final String COLUMNNAME_StatusDate = "StatusDate";
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

@XendraTrl(Identifier="84fe7b70-df33-3dbd-009e-5251f6c47b6e")
public static String es_PE_FIELD_Invoice_TotalLines_Name="Total de Ítems";

@XendraTrl(Identifier="84fe7b70-df33-3dbd-009e-5251f6c47b6e")
public static String es_PE_FIELD_Invoice_TotalLines_Description="Total de todas las líneas del documento";

@XendraTrl(Identifier="84fe7b70-df33-3dbd-009e-5251f6c47b6e")
public static String es_PE_FIELD_Invoice_TotalLines_Help="El Total total despliega el total de todas las líneas en la moneda del documento";

@XendraField(AD_Column_ID="TotalLines",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="General",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="84fe7b70-df33-3dbd-009e-5251f6c47b6e")
public static final String FIELDNAME_Invoice_TotalLines="84fe7b70-df33-3dbd-009e-5251f6c47b6e";

@XendraTrl(Identifier="f16080fe-ec1f-8e5c-270c-1601e4f2ccc1")
public static String es_PE_FIELD_Invoice_TotalLines2_Name="Total de Ítems";

@XendraTrl(Identifier="f16080fe-ec1f-8e5c-270c-1601e4f2ccc1")
public static String es_PE_FIELD_Invoice_TotalLines2_Description="Total de todas las líneas del documento";

@XendraTrl(Identifier="f16080fe-ec1f-8e5c-270c-1601e4f2ccc1")
public static String es_PE_FIELD_Invoice_TotalLines2_Help="El Total total despliega el total de todas las líneas en la moneda del documento";

@XendraField(AD_Column_ID="TotalLines",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="General",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f16080fe-ec1f-8e5c-270c-1601e4f2ccc1")
public static final String FIELDNAME_Invoice_TotalLines2="f16080fe-ec1f-8e5c-270c-1601e4f2ccc1";

@XendraTrl(Identifier="f1714b3b-be64-7e76-b1c0-73ab3ea577ae")
public static String es_PE_FIELD_Invoice_TotalLines3_Name="Total de Líneas";

@XendraTrl(Identifier="f1714b3b-be64-7e76-b1c0-73ab3ea577ae")
public static String es_PE_FIELD_Invoice_TotalLines3_Description="Total de todas las líneas del documento";

@XendraTrl(Identifier="f1714b3b-be64-7e76-b1c0-73ab3ea577ae")
public static String es_PE_FIELD_Invoice_TotalLines3_Help="El Total total despliega el total de todas las líneas en la moneda del documento";

@XendraField(AD_Column_ID="TotalLines",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f1714b3b-be64-7e76-b1c0-73ab3ea577ae")
public static final String FIELDNAME_Invoice_TotalLines3="f1714b3b-be64-7e76-b1c0-73ab3ea577ae";

@XendraTrl(Identifier="0562e6ad-62ef-8e96-7dfd-3e974427f47c")
public static String es_PE_FIELD_Invoice_TotalLines4_Name="Total de Líneas";

@XendraTrl(Identifier="0562e6ad-62ef-8e96-7dfd-3e974427f47c")
public static String es_PE_FIELD_Invoice_TotalLines4_Description="Total de todas las líneas del documento";

@XendraTrl(Identifier="0562e6ad-62ef-8e96-7dfd-3e974427f47c")
public static String es_PE_FIELD_Invoice_TotalLines4_Help="El Total total despliega el total de todas las líneas en la moneda del documento";

@XendraField(AD_Column_ID="TotalLines",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0562e6ad-62ef-8e96-7dfd-3e974427f47c")
public static final String FIELDNAME_Invoice_TotalLines4="0562e6ad-62ef-8e96-7dfd-3e974427f47c";

@XendraTrl(Identifier="33c8c5d3-f603-80fa-753b-3528e14387e1")
public static String es_PE_FIELD_PartnerInvoices_TotalLines_Name="Total de Líneas";

@XendraTrl(Identifier="33c8c5d3-f603-80fa-753b-3528e14387e1")
public static String es_PE_FIELD_PartnerInvoices_TotalLines_Description="Total de todas las líneas del documento";

@XendraTrl(Identifier="33c8c5d3-f603-80fa-753b-3528e14387e1")
public static String es_PE_FIELD_PartnerInvoices_TotalLines_Help="El Total total despliega el total de todas las líneas en la moneda del documento";

@XendraField(AD_Column_ID="TotalLines",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="33c8c5d3-f603-80fa-753b-3528e14387e1")
public static final String FIELDNAME_PartnerInvoices_TotalLines="33c8c5d3-f603-80fa-753b-3528e14387e1";

@XendraTrl(Identifier="d5c353e8-f9ab-f76c-c9e2-5667ee6affda")
public static String es_PE_FIELD_Invoices_TotalLines_Name="Total de Líneas";

@XendraTrl(Identifier="d5c353e8-f9ab-f76c-c9e2-5667ee6affda")
public static String es_PE_FIELD_Invoices_TotalLines_Description="Total de todas las líneas del documento";

@XendraTrl(Identifier="d5c353e8-f9ab-f76c-c9e2-5667ee6affda")
public static String es_PE_FIELD_Invoices_TotalLines_Help="El Total total despliega el total de todas las líneas en la moneda del documento";

@XendraField(AD_Column_ID="TotalLines",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d5c353e8-f9ab-f76c-c9e2-5667ee6affda")
public static final String FIELDNAME_Invoices_TotalLines="d5c353e8-f9ab-f76c-c9e2-5667ee6affda";

@XendraTrl(Identifier="1478263e-7ad3-bf83-2cf9-12729663e46e")
public static String es_PE_COLUMN_TotalLines_Name="Total de Líneas";

@XendraColumn(AD_Element_ID="b1a5a695-e900-bbfd-4380-df29c5444a9a",ColumnName="TotalLines",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1478263e-7ad3-bf83-2cf9-12729663e46e",
Synchronized="2020-03-03 21:36:58.0")
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

@XendraTrl(Identifier="50baf006-8532-5d83-be67-402b7bb7c539")
public static String es_PE_FIELD_Invoice_UserList_Name="Usuario 1";

@XendraTrl(Identifier="50baf006-8532-5d83-be67-402b7bb7c539")
public static String es_PE_FIELD_Invoice_UserList_Description="El usuario definió el elemento # 1";

@XendraTrl(Identifier="50baf006-8532-5d83-be67-402b7bb7c539")
public static String es_PE_FIELD_Invoice_UserList_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_U1@=Y",DisplayLength=10,IsReadOnly=false,SeqNo=250,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="50baf006-8532-5d83-be67-402b7bb7c539")
public static final String FIELDNAME_Invoice_UserList="50baf006-8532-5d83-be67-402b7bb7c539";

@XendraTrl(Identifier="7337dbf5-c6d2-2f83-12fa-c8189d75917a")
public static String es_PE_FIELD_Invoice_UserList12_Name="Usuario 1";

@XendraTrl(Identifier="7337dbf5-c6d2-2f83-12fa-c8189d75917a")
public static String es_PE_FIELD_Invoice_UserList12_Description="El usuario definió el elemento # 1";

@XendraTrl(Identifier="7337dbf5-c6d2-2f83-12fa-c8189d75917a")
public static String es_PE_FIELD_Invoice_UserList12_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_U1@=Y",DisplayLength=10,IsReadOnly=false,SeqNo=250,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="7337dbf5-c6d2-2f83-12fa-c8189d75917a")
public static final String FIELDNAME_Invoice_UserList12="7337dbf5-c6d2-2f83-12fa-c8189d75917a";

@XendraTrl(Identifier="e9a3475b-b0b1-435e-9fa1-0b3eea3309f1")
public static String es_PE_FIELD_Invoice_UserList13_Name="Usuario 1";

@XendraTrl(Identifier="e9a3475b-b0b1-435e-9fa1-0b3eea3309f1")
public static String es_PE_FIELD_Invoice_UserList13_Description="El usuario definió el elemento # 1";

@XendraTrl(Identifier="e9a3475b-b0b1-435e-9fa1-0b3eea3309f1")
public static String es_PE_FIELD_Invoice_UserList13_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_U1@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=210,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="e9a3475b-b0b1-435e-9fa1-0b3eea3309f1")
public static final String FIELDNAME_Invoice_UserList13="e9a3475b-b0b1-435e-9fa1-0b3eea3309f1";

@XendraTrl(Identifier="f05a8187-9e3c-2dc2-7d0f-4d76860d14e1")
public static String es_PE_FIELD_Invoice_UserList14_Name="Usuario 1";

@XendraTrl(Identifier="f05a8187-9e3c-2dc2-7d0f-4d76860d14e1")
public static String es_PE_FIELD_Invoice_UserList14_Description="El usuario definió el elemento # 1";

@XendraTrl(Identifier="f05a8187-9e3c-2dc2-7d0f-4d76860d14e1")
public static String es_PE_FIELD_Invoice_UserList14_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f05a8187-9e3c-2dc2-7d0f-4d76860d14e1")
public static final String FIELDNAME_Invoice_UserList14="f05a8187-9e3c-2dc2-7d0f-4d76860d14e1";

@XendraTrl(Identifier="7bca47de-c8ad-d27c-bb68-ba3f958f2b9a")
public static String es_PE_FIELD_PartnerInvoices_UserList_Name="Usuario 1";

@XendraTrl(Identifier="7bca47de-c8ad-d27c-bb68-ba3f958f2b9a")
public static String es_PE_FIELD_PartnerInvoices_UserList_Description="El usuario definió el elemento # 1";

@XendraTrl(Identifier="7bca47de-c8ad-d27c-bb68-ba3f958f2b9a")
public static String es_PE_FIELD_PartnerInvoices_UserList_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7bca47de-c8ad-d27c-bb68-ba3f958f2b9a")
public static final String FIELDNAME_PartnerInvoices_UserList="7bca47de-c8ad-d27c-bb68-ba3f958f2b9a";

@XendraTrl(Identifier="8df1ac1b-42f7-42a3-9c99-7acfb12a2bb7")
public static String es_PE_FIELD_Invoices_UserList_Name="Usuario 1";

@XendraTrl(Identifier="8df1ac1b-42f7-42a3-9c99-7acfb12a2bb7")
public static String es_PE_FIELD_Invoices_UserList_Description="El usuario definió el elemento # 1";

@XendraTrl(Identifier="8df1ac1b-42f7-42a3-9c99-7acfb12a2bb7")
public static String es_PE_FIELD_Invoices_UserList_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8df1ac1b-42f7-42a3-9c99-7acfb12a2bb7")
public static final String FIELDNAME_Invoices_UserList="8df1ac1b-42f7-42a3-9c99-7acfb12a2bb7";

@XendraTrl(Identifier="3c99c572-9b3b-bcbb-5886-ce5978a6bafd")
public static String es_PE_COLUMN_User1_ID_Name="Usuario 1";

@XendraColumn(AD_Element_ID="07453e74-aadd-d9c9-e543-837a6fdb3094",ColumnName="User1_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="5a2fe161-044f-67cb-3791-6d615980cabb",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3c99c572-9b3b-bcbb-5886-ce5978a6bafd",Synchronized="2020-03-03 21:36:58.0")
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

@XendraTrl(Identifier="304a5478-e0a4-6130-e7c4-333fcb27c934")
public static String es_PE_FIELD_Invoice_UserList25_Name="Usuario 2";

@XendraTrl(Identifier="304a5478-e0a4-6130-e7c4-333fcb27c934")
public static String es_PE_FIELD_Invoice_UserList25_Description="El usuario definió el elemento # 2";

@XendraTrl(Identifier="304a5478-e0a4-6130-e7c4-333fcb27c934")
public static String es_PE_FIELD_Invoice_UserList25_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_U2@=Y",DisplayLength=10,IsReadOnly=false,SeqNo=260,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="304a5478-e0a4-6130-e7c4-333fcb27c934")
public static final String FIELDNAME_Invoice_UserList25="304a5478-e0a4-6130-e7c4-333fcb27c934";

@XendraTrl(Identifier="37c9ae01-858f-b77f-5ab3-374a5c327236")
public static String es_PE_FIELD_Invoice_UserList26_Name="Usuario 2";

@XendraTrl(Identifier="37c9ae01-858f-b77f-5ab3-374a5c327236")
public static String es_PE_FIELD_Invoice_UserList26_Description="El usuario definió el elemento # 2";

@XendraTrl(Identifier="37c9ae01-858f-b77f-5ab3-374a5c327236")
public static String es_PE_FIELD_Invoice_UserList26_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_U2@=Y",DisplayLength=10,IsReadOnly=false,SeqNo=260,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="37c9ae01-858f-b77f-5ab3-374a5c327236")
public static final String FIELDNAME_Invoice_UserList26="37c9ae01-858f-b77f-5ab3-374a5c327236";

@XendraTrl(Identifier="f278d543-6e71-2e7f-bd1f-b126410aca78")
public static String es_PE_FIELD_Invoice_UserList27_Name="Usuario 2";

@XendraTrl(Identifier="f278d543-6e71-2e7f-bd1f-b126410aca78")
public static String es_PE_FIELD_Invoice_UserList27_Description="El usuario definió el elemento # 2";

@XendraTrl(Identifier="f278d543-6e71-2e7f-bd1f-b126410aca78")
public static String es_PE_FIELD_Invoice_UserList27_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6319e76d-d14f-154d-cff7-1d12c4f3360b",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_U2@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=220,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f278d543-6e71-2e7f-bd1f-b126410aca78")
public static final String FIELDNAME_Invoice_UserList27="f278d543-6e71-2e7f-bd1f-b126410aca78";

@XendraTrl(Identifier="2092a6db-01dc-ad88-def3-f1e2cd58215e")
public static String es_PE_FIELD_Invoice_UserList28_Name="Usuario 2";

@XendraTrl(Identifier="2092a6db-01dc-ad88-def3-f1e2cd58215e")
public static String es_PE_FIELD_Invoice_UserList28_Description="El usuario definió el elemento # 2";

@XendraTrl(Identifier="2092a6db-01dc-ad88-def3-f1e2cd58215e")
public static String es_PE_FIELD_Invoice_UserList28_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="94ca852a-51b2-e5ca-09c1-b4c3ecda5f06",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2092a6db-01dc-ad88-def3-f1e2cd58215e")
public static final String FIELDNAME_Invoice_UserList28="2092a6db-01dc-ad88-def3-f1e2cd58215e";

@XendraTrl(Identifier="4bde975b-8ea5-e8dc-3faa-a3fbb7d667db")
public static String es_PE_FIELD_PartnerInvoices_UserList22_Name="Usuario 2";

@XendraTrl(Identifier="4bde975b-8ea5-e8dc-3faa-a3fbb7d667db")
public static String es_PE_FIELD_PartnerInvoices_UserList22_Description="El usuario definió el elemento # 2";

@XendraTrl(Identifier="4bde975b-8ea5-e8dc-3faa-a3fbb7d667db")
public static String es_PE_FIELD_PartnerInvoices_UserList22_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29f3d906-790c-ebc8-d30e-8e67987e6645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4bde975b-8ea5-e8dc-3faa-a3fbb7d667db")
public static final String FIELDNAME_PartnerInvoices_UserList22="4bde975b-8ea5-e8dc-3faa-a3fbb7d667db";

@XendraTrl(Identifier="6e10e566-b5d2-edae-029e-97755dda16c1")
public static String es_PE_FIELD_Invoices_UserList22_Name="Usuario 2";

@XendraTrl(Identifier="6e10e566-b5d2-edae-029e-97755dda16c1")
public static String es_PE_FIELD_Invoices_UserList22_Description="El usuario definió el elemento # 2";

@XendraTrl(Identifier="6e10e566-b5d2-edae-029e-97755dda16c1")
public static String es_PE_FIELD_Invoices_UserList22_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5f0495a2-4377-292a-4f0b-07515d2a2d73",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6e10e566-b5d2-edae-029e-97755dda16c1")
public static final String FIELDNAME_Invoices_UserList22="6e10e566-b5d2-edae-029e-97755dda16c1";

@XendraTrl(Identifier="88c7e95a-3ff5-8700-ecaf-65e327e82ed6")
public static String es_PE_COLUMN_User2_ID_Name="Usuario 2";

@XendraColumn(AD_Element_ID="1b668c90-6743-20a2-df62-576857d72c06",ColumnName="User2_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="6a357ab2-7bb6-fce4-ffee-8bdd855a77fc",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="88c7e95a-3ff5-8700-ecaf-65e327e82ed6",Synchronized="2020-03-03 21:36:58.0")
/** Column name User2_ID */
public static final String COLUMNNAME_User2_ID = "User2_ID";
/** Set WithholdingAmt.
@param WithholdingAmt WithholdingAmt */
public void setWithholdingAmt (BigDecimal WithholdingAmt)
{
set_Value (COLUMNNAME_WithholdingAmt, WithholdingAmt);
}
/** Get WithholdingAmt.
@return WithholdingAmt */
public BigDecimal getWithholdingAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_WithholdingAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="3e0003a5-4ac7-47b1-8eb6-68d99ca1ab44")
public static String es_PE_FIELD_Invoice_WithholdingAmt_Name="withholdingamt";

@XendraField(AD_Column_ID="WithholdingAmt",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-06 14:47:17.0",
Identifier="3e0003a5-4ac7-47b1-8eb6-68d99ca1ab44")
public static final String FIELDNAME_Invoice_WithholdingAmt="3e0003a5-4ac7-47b1-8eb6-68d99ca1ab44";

@XendraTrl(Identifier="469b0cd9-6b3e-481e-9250-48b45b3067b5")
public static String es_PE_FIELD_Invoice_WithholdingAmt2_Name="Monto";

@XendraField(AD_Column_ID="WithholdingAmt",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=500,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-08-30 18:45:41.0",
Identifier="469b0cd9-6b3e-481e-9250-48b45b3067b5")
public static final String FIELDNAME_Invoice_WithholdingAmt2="469b0cd9-6b3e-481e-9250-48b45b3067b5";

@XendraTrl(Identifier="67bc6f1d-0386-4508-9765-1e26d180c658")
public static String es_PE_COLUMN_WithholdingAmt_Name="WithholdingAmt";

@XendraColumn(AD_Element_ID="750228fc-a0da-46c7-b584-2e34797d13d0",ColumnName="WithholdingAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="67bc6f1d-0386-4508-9765-1e26d180c658",
Synchronized="2020-03-03 21:36:58.0")
/** Column name WithholdingAmt */
public static final String COLUMNNAME_WithholdingAmt = "WithholdingAmt";
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

@XendraTrl(Identifier="d722efa9-8236-40ed-b129-8c20c503598f")
public static String es_PE_FIELD_Invoice_Write_OffAmount_Name="Total del Ajuste";

@XendraTrl(Identifier="d722efa9-8236-40ed-b129-8c20c503598f")
public static String es_PE_FIELD_Invoice_Write_OffAmount_Description="Total por ajustar";

@XendraTrl(Identifier="d722efa9-8236-40ed-b129-8c20c503598f")
public static String es_PE_FIELD_Invoice_Write_OffAmount_Help="El Total de ajuste indica el total a ser ajustado como incobrable";

@XendraField(AD_Column_ID="WriteOffAmt",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=131089,IsReadOnly=false,SeqNo=530,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-06 14:47:17.0",
Identifier="d722efa9-8236-40ed-b129-8c20c503598f")
public static final String FIELDNAME_Invoice_Write_OffAmount="d722efa9-8236-40ed-b129-8c20c503598f";

@XendraTrl(Identifier="dadbdbfa-7176-4a4e-9fc5-a4e4632afe2d")
public static String es_PE_FIELD_Invoice_Write_OffAmount2_Name="Total del Ajuste";

@XendraTrl(Identifier="dadbdbfa-7176-4a4e-9fc5-a4e4632afe2d")
public static String es_PE_FIELD_Invoice_Write_OffAmount2_Description="Total por ajustar";

@XendraTrl(Identifier="dadbdbfa-7176-4a4e-9fc5-a4e4632afe2d")
public static String es_PE_FIELD_Invoice_Write_OffAmount2_Help="El Total de ajuste indica el total a ser ajustado como incobrable";

@XendraField(AD_Column_ID="WriteOffAmt",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=131089,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-08-30 18:45:41.0",
Identifier="dadbdbfa-7176-4a4e-9fc5-a4e4632afe2d")
public static final String FIELDNAME_Invoice_Write_OffAmount2="dadbdbfa-7176-4a4e-9fc5-a4e4632afe2d";

@XendraTrl(Identifier="e057cbc8-2885-44e1-85a2-a6fbce547e9b")
public static String es_PE_COLUMN_WriteOffAmt_Name="Write-off Amount";

@XendraColumn(AD_Element_ID="5f70c6d6-fd9f-549c-363e-80eaef7df1c7",ColumnName="WriteOffAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e057cbc8-2885-44e1-85a2-a6fbce547e9b",
Synchronized="2020-03-03 21:36:58.0")
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

@XendraTrl(Identifier="338fc881-4f19-4925-9f33-7c7b45ac837d")
public static String es_PE_FIELD_Invoice_WriteOffType_Name="writeofftype";

@XendraField(AD_Column_ID="WriteOffType",IsCentrallyMaintained=true,
AD_Tab_ID="9c7b6352-0248-15c4-ef20-aa491cc36df8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=540,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-06 14:47:17.0",
Identifier="338fc881-4f19-4925-9f33-7c7b45ac837d")
public static final String FIELDNAME_Invoice_WriteOffType="338fc881-4f19-4925-9f33-7c7b45ac837d";

@XendraTrl(Identifier="d9ba4765-bd99-43a0-86a3-41b0f40fdca6")
public static String es_PE_COLUMN_WriteOffType_Name="WriteOffType";

@XendraColumn(AD_Element_ID="a3610896-3017-4b8c-9f1f-e21361226f89",ColumnName="WriteOffType",
AD_Reference_ID=17,AD_Reference_Value_ID="c41b3d42-db96-44ab-af5b-5fac4c7465e6",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d9ba4765-bd99-43a0-86a3-41b0f40fdca6",Synchronized="2020-03-03 21:36:58.0")
/** Column name WriteOffType */
public static final String COLUMNNAME_WriteOffType = "WriteOffType";
}
