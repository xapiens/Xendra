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
/** Generated Model for C_InvoiceLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_InvoiceLine extends PO
{
/** Standard Constructor
@param ctx context
@param C_InvoiceLine_ID id
@param trxName transaction
*/
public X_C_InvoiceLine (Properties ctx, int C_InvoiceLine_ID, String trxName)
{
super (ctx, C_InvoiceLine_ID, trxName);
/** if (C_InvoiceLine_ID == 0)
{
setC_Invoice_ID (0);
setC_InvoiceLine_ID (0);
setC_Tax_ID (0);
setIsDescription (false);	
// N
setIsPrinted (true);	
// Y
setIsUseAdvance (false);
setLine (0);	
// @SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM C_InvoiceLine WHERE C_Invoice_ID=@C_Invoice_ID@
setLineNetAmt (Env.ZERO);	
// 0
setM_AttributeSetInstance_ID (0);
setPriceActual (Env.ZERO);
setPriceEntered (Env.ZERO);
setPriceLimit (Env.ZERO);
setPriceList (Env.ZERO);
setProcessed (false);	
// N
setQtyEntered (Env.ZERO);	
// 1
setQtyInvoiced (Env.ZERO);	
// 1
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_InvoiceLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=333 */
public static int Table_ID=MTable.getTable_ID("C_InvoiceLine");

@XendraTrl(Identifier="6d5404fc-e047-c0ee-8a64-c457419e045c")
public static String es_PE_TAB_IncludedLines_Name="Incluidas Lineas";

@XendraTab(Name="Included Lines",Description="",Help="",
AD_Window_ID="3732da1a-f391-e5ed-8be9-901924c85001",SeqNo=20,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="6d5404fc-e047-c0ee-8a64-c457419e045c",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_IncludedLines="6d5404fc-e047-c0ee-8a64-c457419e045c";

@XendraTrl(Identifier="90f8b518-7f5c-9bae-ad70-c719b8e5c310")
public static String es_PE_TAB_InvoiceLine_Description="Todos los Ìtem de facturas donde el agente \"Posee\" la factura, el socio de negocio ó el producto.";

@XendraTrl(Identifier="90f8b518-7f5c-9bae-ad70-c719b8e5c310")
public static String es_PE_TAB_InvoiceLine_Name="Ìtem Factura";
@XendraTab(Name="Invoice Line",
Description="All Invoice Liness where the Agent 'owns' the Invoice, the Business Partner or the Product",
Help="",AD_Window_ID="a9894ddd-fe3c-1c33-44c9-6f79a11cde9e",SeqNo=50,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="78553003-566e-a901-2056-c23f4011df6a",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="90f8b518-7f5c-9bae-ad70-c719b8e5c310",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_InvoiceLine="90f8b518-7f5c-9bae-ad70-c719b8e5c310";

@XendraTrl(Identifier="43b4edb1-0e05-dd4f-8ed4-8dcf61132786")
public static String es_PE_TAB_InvoiceLine2_Description="Ìtem de Factura del Cliente";

@XendraTrl(Identifier="43b4edb1-0e05-dd4f-8ed4-8dcf61132786")
public static String es_PE_TAB_InvoiceLine2_Help="La pestaña Ìtem de Factura define el ítem individual ó cargos adicionales de una factura.";

@XendraTrl(Identifier="43b4edb1-0e05-dd4f-8ed4-8dcf61132786")
public static String es_PE_TAB_InvoiceLine2_Name="Ìtem de la Factura";

@XendraTab(Name="Invoice Line",Description="Customer Invoice Line",
Help="The Invoice Line Tab defines the individual items or charges on an Invoice.",
AD_Window_ID="dc1a37c5-086c-c19e-c2ba-344555bfcf65",SeqNo=20,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="@Processed@=Y",
DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_InvoiceLine2="43b4edb1-0e05-dd4f-8ed4-8dcf61132786";

@XendraTrl(Identifier="7acf40ad-c812-9a51-a249-e6a0017ff4bc")
public static String es_PE_TAB_InvoiceLine3_Description="Ìtem de Factura del Proveedor";

@XendraTrl(Identifier="7acf40ad-c812-9a51-a249-e6a0017ff4bc")
public static String es_PE_TAB_InvoiceLine3_Help="La pestaña Ìtem de Factura define cada ítem ó cargo adicional de una factura.";

@XendraTrl(Identifier="7acf40ad-c812-9a51-a249-e6a0017ff4bc")
public static String es_PE_TAB_InvoiceLine3_Name="Ìtem de Factura";
@XendraTab(Name="Invoice Line",
Description="Vendor Invoice Line",
Help="The Invoice Line Tab defines the individual items or charges on an Invoice.",
AD_Window_ID="f7b55b8d-31bd-29ee-4626-2d3ad620dccb",SeqNo=20,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="@Processed@=Y",
DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="7acf40ad-c812-9a51-a249-e6a0017ff4bc",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_InvoiceLine3="7acf40ad-c812-9a51-a249-e6a0017ff4bc";

@XendraTrl(Identifier="85066baa-ce0f-218e-6e63-faaa2e9a324d")
public static String es_PE_TABLE_C_InvoiceLine_Name="Línea de Factura";

@XendraTable(Name="Invoice Line",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Invoice Detail Line",Help="",
TableName="C_InvoiceLine",AccessLevel="1",AD_Window_ID="dc1a37c5-086c-c19e-c2ba-344555bfcf65",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=125,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="f7b55b8d-31bd-29ee-4626-2d3ad620dccb",
ID="org.xendra.commercial",Identifier="85066baa-ce0f-218e-6e63-faaa2e9a324d",
Synchronized="2020-11-02 17:47:42.0")
/** TableName=C_InvoiceLine */
public static final String Table_Name="C_InvoiceLine";


@XendraIndex(Name="c_invoiceline_advance",Identifier="daff77e4-c577-560e-612a-e70a85c10397",
Column_Names="c_invoiceadvance_id",IsUnique="false",
TableIdentifier="daff77e4-c577-560e-612a-e70a85c10397",Synchronized="2017-03-10 20:25:58.0")
public static final String INDEXNAME_c_invoiceline_advance = "daff77e4-c577-560e-612a-e70a85c10397";


@XendraIndex(Name="c_invoiceline_orderline",Identifier="442a4277-bdf9-01f5-42cd-05226952b657",
Column_Names="c_orderline_id",IsUnique="false",
TableIdentifier="442a4277-bdf9-01f5-42cd-05226952b657",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_invoiceline_orderline = "442a4277-bdf9-01f5-42cd-05226952b657";


@XendraIndex(Name="c_invoiceline_carding",Identifier="5e15c8dd-d9f1-5390-f62a-f3e9ab0bf12e",
Column_Names="m_inoutline_id",IsUnique="false",
TableIdentifier="5e15c8dd-d9f1-5390-f62a-f3e9ab0bf12e",Synchronized="2014-06-03 23:07:58.0")
public static final String INDEXNAME_c_invoiceline_carding = "5e15c8dd-d9f1-5390-f62a-f3e9ab0bf12e";


@XendraIndex(Name="c_invoiceline_product",Identifier="5ab16258-a076-4f8a-d8fb-d55a90df2b92",
Column_Names="m_product_id",IsUnique="false",
TableIdentifier="5ab16258-a076-4f8a-d8fb-d55a90df2b92",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_invoiceline_product = "5ab16258-a076-4f8a-d8fb-d55a90df2b92";


@XendraIndex(Name="c_invoiceline_invoice",Identifier="946b2cf7-1aba-d0c5-6b16-638ed1ca95c1",
Column_Names="c_invoice_id",IsUnique="false",
TableIdentifier="946b2cf7-1aba-d0c5-6b16-638ed1ca95c1",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_invoiceline_invoice = "946b2cf7-1aba-d0c5-6b16-638ed1ca95c1";


@XendraIndex(Name="c_invoiceline_identifier",Identifier="675b25c9-c3c5-4ac2-a2c1-5640a5579cbb",
Column_Names="identifier",IsUnique="false",TableIdentifier="675b25c9-c3c5-4ac2-a2c1-5640a5579cbb",
Synchronized="2020-11-02 17:47:42.0")
public static final String INDEXNAME_c_invoiceline_identifier = "675b25c9-c3c5-4ac2-a2c1-5640a5579cbb";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_InvoiceLine");

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
    Table_ID = MTable.getTable_ID("C_InvoiceLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_InvoiceLine[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Asset.
@param A_Asset_ID Asset used internally or by customers */
public void setA_Asset_ID (int A_Asset_ID)
{
if (A_Asset_ID <= 0) set_Value (COLUMNNAME_A_Asset_ID, null);
 else 
set_Value (COLUMNNAME_A_Asset_ID, Integer.valueOf(A_Asset_ID));
}
/** Get Asset.
@return Asset used internally or by customers */
public int getA_Asset_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="878457d6-4678-3784-722d-5295e31562d2")
public static String es_PE_FIELD_InvoiceLine_Asset_Name="Activo";

@XendraTrl(Identifier="878457d6-4678-3784-722d-5295e31562d2")
public static String es_PE_FIELD_InvoiceLine_Asset_Description="Activo usado por la compañía o sus clientes";

@XendraTrl(Identifier="878457d6-4678-3784-722d-5295e31562d2")
public static String es_PE_FIELD_InvoiceLine_Asset_Help="Indica si es usado por la compañia o sus clientes";

@XendraField(AD_Column_ID="A_Asset_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="878457d6-4678-3784-722d-5295e31562d2")
public static final String FIELDNAME_InvoiceLine_Asset="878457d6-4678-3784-722d-5295e31562d2";

@XendraTrl(Identifier="1d8da5ba-206c-2fd9-a3bf-4bf8eea503ca")
public static String es_PE_FIELD_InvoiceLine_Asset2_Name="Activo";

@XendraTrl(Identifier="1d8da5ba-206c-2fd9-a3bf-4bf8eea503ca")
public static String es_PE_FIELD_InvoiceLine_Asset2_Description="Activo usado por la compañía o sus clientes";

@XendraTrl(Identifier="1d8da5ba-206c-2fd9-a3bf-4bf8eea503ca")
public static String es_PE_FIELD_InvoiceLine_Asset2_Help="Indica si es usado por la compañia o sus clientes";

@XendraField(AD_Column_ID="A_Asset_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1d8da5ba-206c-2fd9-a3bf-4bf8eea503ca")
public static final String FIELDNAME_InvoiceLine_Asset2="1d8da5ba-206c-2fd9-a3bf-4bf8eea503ca";

@XendraTrl(Identifier="cf08ca02-c862-ffe8-8603-3244ab456b0e")
public static String es_PE_FIELD_IncludedLines_Asset_Name="Activo";

@XendraTrl(Identifier="cf08ca02-c862-ffe8-8603-3244ab456b0e")
public static String es_PE_FIELD_IncludedLines_Asset_Description="Activo usado por la compañía o sus clientes";

@XendraTrl(Identifier="cf08ca02-c862-ffe8-8603-3244ab456b0e")
public static String es_PE_FIELD_IncludedLines_Asset_Help="Indica si es usado por la compañia o sus clientes";

@XendraField(AD_Column_ID="A_Asset_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6d5404fc-e047-c0ee-8a64-c457419e045c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cf08ca02-c862-ffe8-8603-3244ab456b0e")
public static final String FIELDNAME_IncludedLines_Asset="cf08ca02-c862-ffe8-8603-3244ab456b0e";

@XendraTrl(Identifier="6f7b1168-7745-0f86-80b6-2b27638d46d6")
public static String es_PE_FIELD_InvoiceLine_Asset3_Name="Activo";

@XendraTrl(Identifier="6f7b1168-7745-0f86-80b6-2b27638d46d6")
public static String es_PE_FIELD_InvoiceLine_Asset3_Description="Activo usado por la compañía o sus clientes";

@XendraTrl(Identifier="6f7b1168-7745-0f86-80b6-2b27638d46d6")
public static String es_PE_FIELD_InvoiceLine_Asset3_Help="Indica si es usado por la compañia o sus clientes";

@XendraField(AD_Column_ID="A_Asset_ID",IsCentrallyMaintained=true,
AD_Tab_ID="90f8b518-7f5c-9bae-ad70-c719b8e5c310",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6f7b1168-7745-0f86-80b6-2b27638d46d6")
public static final String FIELDNAME_InvoiceLine_Asset3="6f7b1168-7745-0f86-80b6-2b27638d46d6";

@XendraTrl(Identifier="40ae8ff1-eaf2-11a6-548d-fc2b53a8e8c3")
public static String es_PE_COLUMN_A_Asset_ID_Name="Activo";

@XendraColumn(AD_Element_ID="3cd84c49-e25b-9ecc-5637-ed9a07d76bee",ColumnName="A_Asset_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="40ae8ff1-eaf2-11a6-548d-fc2b53a8e8c3",
Synchronized="2020-03-03 21:37:01.0")
/** Column name A_Asset_ID */
public static final String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
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

@XendraTrl(Identifier="d95e87e6-46aa-bdaf-38a0-c739ce30c39e")
public static String es_PE_FIELD_InvoiceLine_TrxOrganization_Name="Organización de la Trans.";

@XendraTrl(Identifier="d95e87e6-46aa-bdaf-38a0-c739ce30c39e")
public static String es_PE_FIELD_InvoiceLine_TrxOrganization_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="d95e87e6-46aa-bdaf-38a0-c739ce30c39e")
public static String es_PE_FIELD_InvoiceLine_TrxOrganization_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_OT@=Y",DisplayLength=10,IsReadOnly=false,SeqNo=170,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d95e87e6-46aa-bdaf-38a0-c739ce30c39e")
public static final String FIELDNAME_InvoiceLine_TrxOrganization="d95e87e6-46aa-bdaf-38a0-c739ce30c39e";

@XendraTrl(Identifier="d686ad9d-4849-bd61-0f84-a11591073f5f")
public static String es_PE_FIELD_InvoiceLine_TrxOrganization2_Name="Organización de la Trans.";

@XendraTrl(Identifier="d686ad9d-4849-bd61-0f84-a11591073f5f")
public static String es_PE_FIELD_InvoiceLine_TrxOrganization2_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="d686ad9d-4849-bd61-0f84-a11591073f5f")
public static String es_PE_FIELD_InvoiceLine_TrxOrganization2_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_OT@=Y",DisplayLength=10,IsReadOnly=false,SeqNo=190,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d686ad9d-4849-bd61-0f84-a11591073f5f")
public static final String FIELDNAME_InvoiceLine_TrxOrganization2="d686ad9d-4849-bd61-0f84-a11591073f5f";

@XendraTrl(Identifier="770d1524-6625-6bdc-c1e8-13162a1973fe")
public static String es_PE_COLUMN_AD_OrgTrx_ID_Name="Organización de la Trans.";

@XendraColumn(AD_Element_ID="b4180358-67aa-fe55-0409-6367a60e0a2e",ColumnName="AD_OrgTrx_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="54e78591-f7f4-c613-ea27-e64b3dac5198",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="770d1524-6625-6bdc-c1e8-13162a1973fe",Synchronized="2020-03-03 21:37:01.0")
/** Column name AD_OrgTrx_ID */
public static final String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
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

@XendraTrl(Identifier="c3cd247e-a755-e08f-55e2-9444e6ce6540")
public static String es_PE_FIELD_InvoiceLine_Activity_Name="Tipo de Gasto";

@XendraTrl(Identifier="c3cd247e-a755-e08f-55e2-9444e6ce6540")
public static String es_PE_FIELD_InvoiceLine_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="c3cd247e-a755-e08f-55e2-9444e6ce6540")
public static String es_PE_FIELD_InvoiceLine_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_AY@='Y'",DisplayLength=10,IsReadOnly=false,SeqNo=160,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c3cd247e-a755-e08f-55e2-9444e6ce6540")
public static final String FIELDNAME_InvoiceLine_Activity="c3cd247e-a755-e08f-55e2-9444e6ce6540";

@XendraTrl(Identifier="fda71911-3dca-ba78-ce78-bfcea54c559a")
public static String es_PE_FIELD_InvoiceLine_Activity2_Name="Tipo de Gasto";

@XendraTrl(Identifier="fda71911-3dca-ba78-ce78-bfcea54c559a")
public static String es_PE_FIELD_InvoiceLine_Activity2_Description="Actividad de Negocio";

@XendraTrl(Identifier="fda71911-3dca-ba78-ce78-bfcea54c559a")
public static String es_PE_FIELD_InvoiceLine_Activity2_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_AY@='Y'",DisplayLength=10,IsReadOnly=false,SeqNo=180,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="fda71911-3dca-ba78-ce78-bfcea54c559a")
public static final String FIELDNAME_InvoiceLine_Activity2="fda71911-3dca-ba78-ce78-bfcea54c559a";

@XendraTrl(Identifier="c7b38108-58f4-8425-c7ea-498fe7929be7")
public static String es_PE_COLUMN_C_Activity_ID_Name="Tipo de Gasto";

@XendraColumn(AD_Element_ID="bfeadbb3-d866-26e3-8eee-3e2fdf0ff753",ColumnName="C_Activity_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="079b2687-77a7-3004-9b77-18ca68ffe4fc",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c7b38108-58f4-8425-c7ea-498fe7929be7",Synchronized="2020-03-03 21:37:01.0")
/** Column name C_Activity_ID */
public static final String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
/** Set Campaign.
@param C_CampaignBonus_ID Campaign */
public void setC_CampaignBonus_ID (int C_CampaignBonus_ID)
{
if (C_CampaignBonus_ID <= 0) set_Value (COLUMNNAME_C_CampaignBonus_ID, null);
 else 
set_Value (COLUMNNAME_C_CampaignBonus_ID, Integer.valueOf(C_CampaignBonus_ID));
}
/** Get Campaign.
@return Campaign */
public int getC_CampaignBonus_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_CampaignBonus_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3be26dfd-3e46-dc03-2d4b-a5e02ce2c461")
public static String es_PE_FIELD_InvoiceLine_Campaign_Name="Cam.Bonificacion";

@XendraField(AD_Column_ID="C_CampaignBonus_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3be26dfd-3e46-dc03-2d4b-a5e02ce2c461")
public static final String FIELDNAME_InvoiceLine_Campaign="3be26dfd-3e46-dc03-2d4b-a5e02ce2c461";

@XendraTrl(Identifier="8e28bdad-2c2c-6be2-a401-01956b9bcbf4")
public static String es_PE_FIELD_InvoiceLine_Campaign2_Name="Campaign";

@XendraField(AD_Column_ID="C_CampaignBonus_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8e28bdad-2c2c-6be2-a401-01956b9bcbf4")
public static final String FIELDNAME_InvoiceLine_Campaign2="8e28bdad-2c2c-6be2-a401-01956b9bcbf4";

@XendraTrl(Identifier="4d69c283-0782-4867-9d63-b9fd9871f37f")
public static String es_PE_COLUMN_C_CampaignBonus_ID_Name="Campaign";

@XendraColumn(AD_Element_ID="a5f39b6e-5196-25a2-48dd-348f1075c264",ColumnName="C_CampaignBonus_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4d69c283-0782-4867-9d63-b9fd9871f37f",
Synchronized="2020-03-03 21:37:01.0")
/** Column name C_CampaignBonus_ID */
public static final String COLUMNNAME_C_CampaignBonus_ID = "C_CampaignBonus_ID";
/** Set C_CampaignDiscount_ID.
@param C_CampaignDiscount_ID C_CampaignDiscount_ID */
public void setC_CampaignDiscount_ID (int C_CampaignDiscount_ID)
{
if (C_CampaignDiscount_ID <= 0) set_Value (COLUMNNAME_C_CampaignDiscount_ID, null);
 else 
set_Value (COLUMNNAME_C_CampaignDiscount_ID, Integer.valueOf(C_CampaignDiscount_ID));
}
/** Get C_CampaignDiscount_ID.
@return C_CampaignDiscount_ID */
public int getC_CampaignDiscount_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_CampaignDiscount_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="321d8b8b-ce7e-533e-669e-8a0e7d2f2c5e")
public static String es_PE_FIELD_InvoiceLine_C_CampaignDiscount_ID_Name="Camp.Descuento";

@XendraField(AD_Column_ID="C_CampaignDiscount_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="321d8b8b-ce7e-533e-669e-8a0e7d2f2c5e")
public static final String FIELDNAME_InvoiceLine_C_CampaignDiscount_ID="321d8b8b-ce7e-533e-669e-8a0e7d2f2c5e";

@XendraTrl(Identifier="58a18928-40b1-6e8f-4f73-e20ee4a0f83b")
public static String es_PE_FIELD_InvoiceLine_C_CampaignDiscount_ID2_Name="C_CampaignDiscount_ID";

@XendraField(AD_Column_ID="C_CampaignDiscount_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="58a18928-40b1-6e8f-4f73-e20ee4a0f83b")
public static final String FIELDNAME_InvoiceLine_C_CampaignDiscount_ID2="58a18928-40b1-6e8f-4f73-e20ee4a0f83b";

@XendraTrl(Identifier="ae3103dc-aff1-8de8-3393-93a1e63f6670")
public static String es_PE_COLUMN_C_CampaignDiscount_ID_Name="C_CampaignDiscount_ID";

@XendraColumn(AD_Element_ID="e2aa5f05-083c-4f10-c01d-1ec55801a24f",
ColumnName="C_CampaignDiscount_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ae3103dc-aff1-8de8-3393-93a1e63f6670",Synchronized="2020-03-03 21:37:01.0")
/** Column name C_CampaignDiscount_ID */
public static final String COLUMNNAME_C_CampaignDiscount_ID = "C_CampaignDiscount_ID";
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

@XendraTrl(Identifier="56bb1227-6416-155d-4179-dda2f31518b9")
public static String es_PE_FIELD_InvoiceLine_Campaign3_Name="Campaña";

@XendraTrl(Identifier="56bb1227-6416-155d-4179-dda2f31518b9")
public static String es_PE_FIELD_InvoiceLine_Campaign3_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="56bb1227-6416-155d-4179-dda2f31518b9")
public static String es_PE_FIELD_InvoiceLine_Campaign3_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_MC@='Y'",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="56bb1227-6416-155d-4179-dda2f31518b9")
public static final String FIELDNAME_InvoiceLine_Campaign3="56bb1227-6416-155d-4179-dda2f31518b9";

@XendraTrl(Identifier="22ffc815-48d0-027a-30e8-4d5af43f7b0f")
public static String es_PE_FIELD_InvoiceLine_Campaign4_Name="Campaña";

@XendraTrl(Identifier="22ffc815-48d0-027a-30e8-4d5af43f7b0f")
public static String es_PE_FIELD_InvoiceLine_Campaign4_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="22ffc815-48d0-027a-30e8-4d5af43f7b0f")
public static String es_PE_FIELD_InvoiceLine_Campaign4_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_MC@='Y'",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="22ffc815-48d0-027a-30e8-4d5af43f7b0f")
public static final String FIELDNAME_InvoiceLine_Campaign4="22ffc815-48d0-027a-30e8-4d5af43f7b0f";

@XendraTrl(Identifier="fde3ef8c-c60f-4c35-9caa-e8c3d8ad3c3c")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaña";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="8e0d532d-2e55-9877-ef0b-a5950455e031",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="fde3ef8c-c60f-4c35-9caa-e8c3d8ad3c3c",Synchronized="2020-03-03 21:37:01.0")
/** Column name C_Campaign_ID */
public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
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

@XendraTrl(Identifier="52f927ec-4f11-9239-c19a-8b5bacbef5e1")
public static String es_PE_FIELD_InvoiceLine_Charge_Name="Cargo";

@XendraTrl(Identifier="52f927ec-4f11-9239-c19a-8b5bacbef5e1")
public static String es_PE_FIELD_InvoiceLine_Charge_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="52f927ec-4f11-9239-c19a-8b5bacbef5e1")
public static String es_PE_FIELD_InvoiceLine_Charge_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="52f927ec-4f11-9239-c19a-8b5bacbef5e1")
public static final String FIELDNAME_InvoiceLine_Charge="52f927ec-4f11-9239-c19a-8b5bacbef5e1";

@XendraTrl(Identifier="3aae224d-b2d7-3dd3-5cc0-e3a3dbd2b636")
public static String es_PE_FIELD_InvoiceLine_Charge2_Name="Cargo";

@XendraTrl(Identifier="3aae224d-b2d7-3dd3-5cc0-e3a3dbd2b636")
public static String es_PE_FIELD_InvoiceLine_Charge2_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="3aae224d-b2d7-3dd3-5cc0-e3a3dbd2b636")
public static String es_PE_FIELD_InvoiceLine_Charge2_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3aae224d-b2d7-3dd3-5cc0-e3a3dbd2b636")
public static final String FIELDNAME_InvoiceLine_Charge2="3aae224d-b2d7-3dd3-5cc0-e3a3dbd2b636";

@XendraTrl(Identifier="2f8eeffc-159a-53e9-480d-cbcc127eb2e4")
public static String es_PE_FIELD_IncludedLines_Charge_Name="Cargo";

@XendraTrl(Identifier="2f8eeffc-159a-53e9-480d-cbcc127eb2e4")
public static String es_PE_FIELD_IncludedLines_Charge_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="2f8eeffc-159a-53e9-480d-cbcc127eb2e4")
public static String es_PE_FIELD_IncludedLines_Charge_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6d5404fc-e047-c0ee-8a64-c457419e045c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=20,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2f8eeffc-159a-53e9-480d-cbcc127eb2e4")
public static final String FIELDNAME_IncludedLines_Charge="2f8eeffc-159a-53e9-480d-cbcc127eb2e4";

@XendraTrl(Identifier="c54678dc-2314-4010-e56d-176797367494")
public static String es_PE_FIELD_InvoiceLine_Charge3_Name="Cargo";

@XendraTrl(Identifier="c54678dc-2314-4010-e56d-176797367494")
public static String es_PE_FIELD_InvoiceLine_Charge3_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="c54678dc-2314-4010-e56d-176797367494")
public static String es_PE_FIELD_InvoiceLine_Charge3_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="90f8b518-7f5c-9bae-ad70-c719b8e5c310",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c54678dc-2314-4010-e56d-176797367494")
public static final String FIELDNAME_InvoiceLine_Charge3="c54678dc-2314-4010-e56d-176797367494";

@XendraTrl(Identifier="4b76061c-2752-f0dd-d463-919d56d2f0d4")
public static String es_PE_COLUMN_C_Charge_ID_Name="Cargo";

@XendraColumn(AD_Element_ID="d7e2fc48-a26e-4ded-ea44-fe15849a7883",ColumnName="C_Charge_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@M_Product_ID@!0",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutInvoice.charge",VFormat="",ValueMin="",ValueMax="",Version="1",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4b76061c-2752-f0dd-d463-919d56d2f0d4",
Synchronized="2020-03-03 21:37:02.0")
/** Column name C_Charge_ID */
public static final String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
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

@XendraTrl(Identifier="1a0dc761-2106-2c2d-f6ac-561f73caccaa")
public static String es_PE_FIELD_InvoiceLine_ControlActivity_Name="Actividad de Control";

@XendraTrl(Identifier="1a0dc761-2106-2c2d-f6ac-561f73caccaa")
public static String es_PE_FIELD_InvoiceLine_ControlActivity_Description="Actividad de Control";

@XendraField(AD_Column_ID="C_ControlActivity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1a0dc761-2106-2c2d-f6ac-561f73caccaa")
public static final String FIELDNAME_InvoiceLine_ControlActivity="1a0dc761-2106-2c2d-f6ac-561f73caccaa";

@XendraTrl(Identifier="ffa462d7-cb8e-28da-8de6-aa8877758744")
public static String es_PE_FIELD_Invoice_ControlActivity_Name="Actividad de Control";

@XendraTrl(Identifier="ffa462d7-cb8e-28da-8de6-aa8877758744")
public static String es_PE_FIELD_Invoice_ControlActivity_Description="Actividad de Control";

@XendraField(AD_Column_ID="C_ControlActivity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc809099-40cb-4b54-71a5-dfee300e0645",AD_FieldGroup_ID="Reference",IsDisplayed=false,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ffa462d7-cb8e-28da-8de6-aa8877758744")
public static final String FIELDNAME_Invoice_ControlActivity="ffa462d7-cb8e-28da-8de6-aa8877758744";

@XendraTrl(Identifier="32cfb83d-f671-9879-3a0e-8e7965edc5b1")
public static String es_PE_FIELD_InvoiceLine_ControlActivity2_Name="Actividad de Control";

@XendraTrl(Identifier="32cfb83d-f671-9879-3a0e-8e7965edc5b1")
public static String es_PE_FIELD_InvoiceLine_ControlActivity2_Description="Actividad de Control";

@XendraField(AD_Column_ID="C_ControlActivity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="32cfb83d-f671-9879-3a0e-8e7965edc5b1")
public static final String FIELDNAME_InvoiceLine_ControlActivity2="32cfb83d-f671-9879-3a0e-8e7965edc5b1";

@XendraTrl(Identifier="0055fb8c-1abf-6e1f-0e70-42b229566a66")
public static String es_PE_COLUMN_C_ControlActivity_ID_Name="Actividad de Control";

@XendraColumn(AD_Element_ID="93cc21ee-0269-d42b-9bdf-df9462976ca0",
ColumnName="C_ControlActivity_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0055fb8c-1abf-6e1f-0e70-42b229566a66",Synchronized="2020-03-03 21:37:02.0")
/** Column name C_ControlActivity_ID */
public static final String COLUMNNAME_C_ControlActivity_ID = "C_ControlActivity_ID";
/** Set C_InvoiceAdvance.
@param C_InvoiceAdvance_ID C_InvoiceAdvance */
public void setC_InvoiceAdvance_ID (int C_InvoiceAdvance_ID)
{
if (C_InvoiceAdvance_ID <= 0) set_Value (COLUMNNAME_C_InvoiceAdvance_ID, null);
 else 
set_Value (COLUMNNAME_C_InvoiceAdvance_ID, Integer.valueOf(C_InvoiceAdvance_ID));
}
/** Get C_InvoiceAdvance.
@return C_InvoiceAdvance */
public int getC_InvoiceAdvance_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_InvoiceAdvance_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b05fa687-c38f-4efc-9dbe-68ff961fd154")
public static String es_PE_COLUMN_C_InvoiceAdvance_ID_Name="C_InvoiceAdvance";

@XendraColumn(AD_Element_ID="73d5858f-7fab-c200-0aa4-6028ec6f6e29",
ColumnName="C_InvoiceAdvance_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="7fd6a4ea-911e-151b-68bf-3a86cc5f06e3",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="b05fa687-c38f-4efc-9dbe-68ff961fd154",
Synchronized="2020-03-03 21:37:02.0")
/** Column name C_InvoiceAdvance_ID */
public static final String COLUMNNAME_C_InvoiceAdvance_ID = "C_InvoiceAdvance_ID";
/** Set C_InvoiceAdvanceLine_ID.
@param C_InvoiceAdvanceLine_ID C_InvoiceAdvanceLine_ID */
public void setC_InvoiceAdvanceLine_ID (int C_InvoiceAdvanceLine_ID)
{
if (C_InvoiceAdvanceLine_ID <= 0) set_Value (COLUMNNAME_C_InvoiceAdvanceLine_ID, null);
 else 
set_Value (COLUMNNAME_C_InvoiceAdvanceLine_ID, Integer.valueOf(C_InvoiceAdvanceLine_ID));
}
/** Get C_InvoiceAdvanceLine_ID.
@return C_InvoiceAdvanceLine_ID */
public int getC_InvoiceAdvanceLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_InvoiceAdvanceLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="88dd40a7-63e3-4eba-aff8-8c2be5f08dd7")
public static String es_PE_COLUMN_C_InvoiceAdvanceLine_ID_Name="C_InvoiceAdvanceLine_ID";

@XendraColumn(AD_Element_ID="0875adb3-a30f-a15b-bbeb-b39ff6c08b09",
ColumnName="C_InvoiceAdvanceLine_ID",AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="88dd40a7-63e3-4eba-aff8-8c2be5f08dd7",Synchronized="2020-03-03 21:37:02.0")
/** Column name C_InvoiceAdvanceLine_ID */
public static final String COLUMNNAME_C_InvoiceAdvanceLine_ID = "C_InvoiceAdvanceLine_ID";
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getC_Invoice_ID()));
}

@XendraTrl(Identifier="4a0644ad-5b08-b820-be7c-7a89453342b4")
public static String es_PE_FIELD_InvoiceLine_Invoice_Name="Factura";

@XendraTrl(Identifier="4a0644ad-5b08-b820-be7c-7a89453342b4")
public static String es_PE_FIELD_InvoiceLine_Invoice_Description="Identificador de la factura";

@XendraTrl(Identifier="4a0644ad-5b08-b820-be7c-7a89453342b4")
public static String es_PE_FIELD_InvoiceLine_Invoice_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4a0644ad-5b08-b820-be7c-7a89453342b4")
public static final String FIELDNAME_InvoiceLine_Invoice="4a0644ad-5b08-b820-be7c-7a89453342b4";

@XendraTrl(Identifier="3c079571-4d15-f7dc-26f8-33e24ae3793d")
public static String es_PE_FIELD_InvoiceLine_Invoice2_Name="Factura";

@XendraTrl(Identifier="3c079571-4d15-f7dc-26f8-33e24ae3793d")
public static String es_PE_FIELD_InvoiceLine_Invoice2_Description="Identificador de la factura";

@XendraTrl(Identifier="3c079571-4d15-f7dc-26f8-33e24ae3793d")
public static String es_PE_FIELD_InvoiceLine_Invoice2_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3c079571-4d15-f7dc-26f8-33e24ae3793d")
public static final String FIELDNAME_InvoiceLine_Invoice2="3c079571-4d15-f7dc-26f8-33e24ae3793d";

@XendraTrl(Identifier="7f35fe1d-e182-c4f8-7aeb-7761bb826620")
public static String es_PE_FIELD_IncludedLines_Invoice_Name="Factura";

@XendraTrl(Identifier="7f35fe1d-e182-c4f8-7aeb-7761bb826620")
public static String es_PE_FIELD_IncludedLines_Invoice_Description="Identificador de la factura";

@XendraTrl(Identifier="7f35fe1d-e182-c4f8-7aeb-7761bb826620")
public static String es_PE_FIELD_IncludedLines_Invoice_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6d5404fc-e047-c0ee-8a64-c457419e045c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7f35fe1d-e182-c4f8-7aeb-7761bb826620")
public static final String FIELDNAME_IncludedLines_Invoice="7f35fe1d-e182-c4f8-7aeb-7761bb826620";

@XendraTrl(Identifier="22ab8f12-c363-77d4-f281-cbff47b30c75")
public static String es_PE_FIELD_InvoiceLine_Invoice3_Name="Factura";

@XendraTrl(Identifier="22ab8f12-c363-77d4-f281-cbff47b30c75")
public static String es_PE_FIELD_InvoiceLine_Invoice3_Description="Identificador de la factura";

@XendraTrl(Identifier="22ab8f12-c363-77d4-f281-cbff47b30c75")
public static String es_PE_FIELD_InvoiceLine_Invoice3_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="90f8b518-7f5c-9bae-ad70-c719b8e5c310",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="22ab8f12-c363-77d4-f281-cbff47b30c75")
public static final String FIELDNAME_InvoiceLine_Invoice3="22ab8f12-c363-77d4-f281-cbff47b30c75";

@XendraTrl(Identifier="78553003-566e-a901-2056-c23f4011df6a")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Factura";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="78553003-566e-a901-2056-c23f4011df6a",
Synchronized="2020-03-03 21:37:02.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
/** Set Invoice Line.
@param C_InvoiceLine_ID Invoice Detail Line */
public void setC_InvoiceLine_ID (int C_InvoiceLine_ID)
{
if (C_InvoiceLine_ID < 1) throw new IllegalArgumentException ("C_InvoiceLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_InvoiceLine_ID, Integer.valueOf(C_InvoiceLine_ID));
}
/** Get Invoice Line.
@return Invoice Detail Line */
public int getC_InvoiceLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_InvoiceLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a65a4443-4747-9f58-fae6-9319c8297440")
public static String es_PE_FIELD_InvoiceLine_InvoiceLine_Name="Item de Factura";

@XendraTrl(Identifier="a65a4443-4747-9f58-fae6-9319c8297440")
public static String es_PE_FIELD_InvoiceLine_InvoiceLine_Description="Item de detalle de factura";

@XendraTrl(Identifier="a65a4443-4747-9f58-fae6-9319c8297440")
public static String es_PE_FIELD_InvoiceLine_InvoiceLine_Help="Identifica de manera única un Item de la factura";

@XendraField(AD_Column_ID="C_InvoiceLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a65a4443-4747-9f58-fae6-9319c8297440")
public static final String FIELDNAME_InvoiceLine_InvoiceLine="a65a4443-4747-9f58-fae6-9319c8297440";

@XendraTrl(Identifier="0976cb97-96ec-ccb7-5a92-be36e5c9656a")
public static String es_PE_FIELD_InvoiceLine_InvoiceLine2_Name="Item de Factura";

@XendraTrl(Identifier="0976cb97-96ec-ccb7-5a92-be36e5c9656a")
public static String es_PE_FIELD_InvoiceLine_InvoiceLine2_Description="Item de detalle de factura";

@XendraTrl(Identifier="0976cb97-96ec-ccb7-5a92-be36e5c9656a")
public static String es_PE_FIELD_InvoiceLine_InvoiceLine2_Help="Identifica de manera única un Item de la factura";

@XendraField(AD_Column_ID="C_InvoiceLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0976cb97-96ec-ccb7-5a92-be36e5c9656a")
public static final String FIELDNAME_InvoiceLine_InvoiceLine2="0976cb97-96ec-ccb7-5a92-be36e5c9656a";

@XendraTrl(Identifier="28c4af6f-db62-69c5-0485-d28123324773")
public static String es_PE_FIELD_IncludedLines_InvoiceLine_Name="Item de Factura";

@XendraTrl(Identifier="28c4af6f-db62-69c5-0485-d28123324773")
public static String es_PE_FIELD_IncludedLines_InvoiceLine_Description="Item de detalle de factura";

@XendraTrl(Identifier="28c4af6f-db62-69c5-0485-d28123324773")
public static String es_PE_FIELD_IncludedLines_InvoiceLine_Help="Identifica de manera única un Item de la factura";

@XendraField(AD_Column_ID="C_InvoiceLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6d5404fc-e047-c0ee-8a64-c457419e045c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="28c4af6f-db62-69c5-0485-d28123324773")
public static final String FIELDNAME_IncludedLines_InvoiceLine="28c4af6f-db62-69c5-0485-d28123324773";

@XendraTrl(Identifier="81d040b4-743c-4226-36c5-009d7bc99cd4")
public static String es_PE_FIELD_InvoiceLine_InvoiceLine3_Name="Item de Factura";

@XendraTrl(Identifier="81d040b4-743c-4226-36c5-009d7bc99cd4")
public static String es_PE_FIELD_InvoiceLine_InvoiceLine3_Description="Itemde detalle de factura";

@XendraTrl(Identifier="81d040b4-743c-4226-36c5-009d7bc99cd4")
public static String es_PE_FIELD_InvoiceLine_InvoiceLine3_Help="Identifica de manera única un Item de la factura";

@XendraField(AD_Column_ID="C_InvoiceLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="90f8b518-7f5c-9bae-ad70-c719b8e5c310",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="81d040b4-743c-4226-36c5-009d7bc99cd4")
public static final String FIELDNAME_InvoiceLine_InvoiceLine3="81d040b4-743c-4226-36c5-009d7bc99cd4";
/** Column name C_InvoiceLine_ID */
public static final String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
/** Set Sales Order Line.
@param C_OrderLine_ID Sales Order Line */
public void setC_OrderLine_ID (int C_OrderLine_ID)
{
if (C_OrderLine_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_OrderLine_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_OrderLine_ID, Integer.valueOf(C_OrderLine_ID));
}
/** Get Sales Order Line.
@return Sales Order Line */
public int getC_OrderLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_OrderLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0467a0cb-61bf-5461-c4a7-6eede71abcd2")
public static String es_PE_FIELD_InvoiceLine_SalesOrderLine_Name="Item";

@XendraTrl(Identifier="0467a0cb-61bf-5461-c4a7-6eede71abcd2")
public static String es_PE_FIELD_InvoiceLine_SalesOrderLine_Description="Item de orden de venta";

@XendraTrl(Identifier="0467a0cb-61bf-5461-c4a7-6eede71abcd2")
public static String es_PE_FIELD_InvoiceLine_SalesOrderLine_Help="Identificador único para un Item en una orden.";

@XendraField(AD_Column_ID="C_OrderLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0467a0cb-61bf-5461-c4a7-6eede71abcd2")
public static final String FIELDNAME_InvoiceLine_SalesOrderLine="0467a0cb-61bf-5461-c4a7-6eede71abcd2";

@XendraTrl(Identifier="99c1f62a-44f6-4b8a-a6f8-e818efe0fe41")
public static String es_PE_FIELD_InvoiceLine_PurchaseOrderLine_Name="Orden";

@XendraTrl(Identifier="99c1f62a-44f6-4b8a-a6f8-e818efe0fe41")
public static String es_PE_FIELD_InvoiceLine_PurchaseOrderLine_Description="Línea de orden de compra";

@XendraTrl(Identifier="99c1f62a-44f6-4b8a-a6f8-e818efe0fe41")
public static String es_PE_FIELD_InvoiceLine_PurchaseOrderLine_Help="La línea orden de compra es un identificador único para una línea en una orden.";

@XendraField(AD_Column_ID="C_OrderLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="99c1f62a-44f6-4b8a-a6f8-e818efe0fe41")
public static final String FIELDNAME_InvoiceLine_PurchaseOrderLine="99c1f62a-44f6-4b8a-a6f8-e818efe0fe41";

@XendraTrl(Identifier="69e723a0-9242-0bb3-6a6e-bd6a88856ed5")
public static String es_PE_FIELD_IncludedLines_PurchaseOrderLine_Name="Item";

@XendraTrl(Identifier="69e723a0-9242-0bb3-6a6e-bd6a88856ed5")
public static String es_PE_FIELD_IncludedLines_PurchaseOrderLine_Description="Item de orden de compra";

@XendraTrl(Identifier="69e723a0-9242-0bb3-6a6e-bd6a88856ed5")
public static String es_PE_FIELD_IncludedLines_PurchaseOrderLine_Help="Identificador único para un Item en una orden.";

@XendraField(AD_Column_ID="C_OrderLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6d5404fc-e047-c0ee-8a64-c457419e045c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="69e723a0-9242-0bb3-6a6e-bd6a88856ed5")
public static final String FIELDNAME_IncludedLines_PurchaseOrderLine="69e723a0-9242-0bb3-6a6e-bd6a88856ed5";

@XendraTrl(Identifier="549e015a-a1ae-dd9a-261b-e12621638d9e")
public static String es_PE_FIELD_InvoiceLine_SalesOrderLine2_Name="Item";

@XendraTrl(Identifier="549e015a-a1ae-dd9a-261b-e12621638d9e")
public static String es_PE_FIELD_InvoiceLine_SalesOrderLine2_Description="Item de orden de venta";

@XendraTrl(Identifier="549e015a-a1ae-dd9a-261b-e12621638d9e")
public static String es_PE_FIELD_InvoiceLine_SalesOrderLine2_Help="Identificador único para un Item en una orden.";

@XendraField(AD_Column_ID="C_OrderLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="90f8b518-7f5c-9bae-ad70-c719b8e5c310",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="549e015a-a1ae-dd9a-261b-e12621638d9e")
public static final String FIELDNAME_InvoiceLine_SalesOrderLine2="549e015a-a1ae-dd9a-261b-e12621638d9e";

@XendraTrl(Identifier="789284f2-f5fc-a360-67ff-c8f03c48f705")
public static String es_PE_COLUMN_C_OrderLine_ID_Name="Línea";

@XendraColumn(AD_Element_ID="a94fbec0-0ef5-0f6c-033d-8286782321b0",ColumnName="C_OrderLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="789284f2-f5fc-a360-67ff-c8f03c48f705",
Synchronized="2020-03-03 21:37:02.0")
/** Column name C_OrderLine_ID */
public static final String COLUMNNAME_C_OrderLine_ID = "C_OrderLine_ID";
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

@XendraTrl(Identifier="6c37bacf-e27d-c93c-23a5-8b2a54cb360f")
public static String es_PE_FIELD_InvoiceLine_Project_Name="Proyecto";

@XendraTrl(Identifier="6c37bacf-e27d-c93c-23a5-8b2a54cb360f")
public static String es_PE_FIELD_InvoiceLine_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="6c37bacf-e27d-c93c-23a5-8b2a54cb360f")
public static String es_PE_FIELD_InvoiceLine_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_PJ@='Y'",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="6c37bacf-e27d-c93c-23a5-8b2a54cb360f")
public static final String FIELDNAME_InvoiceLine_Project="6c37bacf-e27d-c93c-23a5-8b2a54cb360f";

@XendraTrl(Identifier="5b5eeb86-bc99-a84f-6ada-9a9c2479c4ce")
public static String es_PE_FIELD_InvoiceLine_Project2_Name="Proyecto";

@XendraTrl(Identifier="5b5eeb86-bc99-a84f-6ada-9a9c2479c4ce")
public static String es_PE_FIELD_InvoiceLine_Project2_Description="Identifica un proyecto único";

@XendraTrl(Identifier="5b5eeb86-bc99-a84f-6ada-9a9c2479c4ce")
public static String es_PE_FIELD_InvoiceLine_Project2_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_PJ@='Y'",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="5b5eeb86-bc99-a84f-6ada-9a9c2479c4ce")
public static final String FIELDNAME_InvoiceLine_Project2="5b5eeb86-bc99-a84f-6ada-9a9c2479c4ce";

@XendraTrl(Identifier="c87a099c-7cd4-5d01-7974-25763e08f05c")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="961cbc99-cc24-46df-b94e-37fe139285bf",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c87a099c-7cd4-5d01-7974-25763e08f05c",Synchronized="2020-03-03 21:37:02.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
/** Set Project Phase.
@param C_ProjectPhase_ID Phase of a Project */
public void setC_ProjectPhase_ID (int C_ProjectPhase_ID)
{
if (C_ProjectPhase_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_ProjectPhase_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_ProjectPhase_ID, Integer.valueOf(C_ProjectPhase_ID));
}
/** Get Project Phase.
@return Phase of a Project */
public int getC_ProjectPhase_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ProjectPhase_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="833af4a2-2dea-855e-ee60-c643852b0673")
public static String es_PE_FIELD_InvoiceLine_ProjectPhase_Name="Fase del Proyecto";

@XendraTrl(Identifier="833af4a2-2dea-855e-ee60-c643852b0673")
public static String es_PE_FIELD_InvoiceLine_ProjectPhase_Description="Fase del Proyecto";

@XendraField(AD_Column_ID="C_ProjectPhase_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="833af4a2-2dea-855e-ee60-c643852b0673")
public static final String FIELDNAME_InvoiceLine_ProjectPhase="833af4a2-2dea-855e-ee60-c643852b0673";

@XendraTrl(Identifier="94446c80-54f8-9fd7-6a56-e0c93069672d")
public static String es_PE_FIELD_InvoiceLine_ProjectPhase2_Name="Fase del Proyecto";

@XendraTrl(Identifier="94446c80-54f8-9fd7-6a56-e0c93069672d")
public static String es_PE_FIELD_InvoiceLine_ProjectPhase2_Description="Fase del Proyecto";

@XendraField(AD_Column_ID="C_ProjectPhase_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="94446c80-54f8-9fd7-6a56-e0c93069672d")
public static final String FIELDNAME_InvoiceLine_ProjectPhase2="94446c80-54f8-9fd7-6a56-e0c93069672d";

@XendraTrl(Identifier="6fa20832-2df9-fb66-2be2-ff3778f75fa3")
public static String es_PE_COLUMN_C_ProjectPhase_ID_Name="Fase del Proyecto";

@XendraColumn(AD_Element_ID="ba6e5aab-8337-208a-03da-5712e50d4da9",ColumnName="C_ProjectPhase_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="69e5a46c-92d0-8660-9d0d-a7f1b354e9b9",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6fa20832-2df9-fb66-2be2-ff3778f75fa3",Synchronized="2020-03-03 21:37:02.0")
/** Column name C_ProjectPhase_ID */
public static final String COLUMNNAME_C_ProjectPhase_ID = "C_ProjectPhase_ID";
/** Set Project Task.
@param C_ProjectTask_ID Actual Project Task in a Phase */
public void setC_ProjectTask_ID (int C_ProjectTask_ID)
{
if (C_ProjectTask_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_ProjectTask_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_ProjectTask_ID, Integer.valueOf(C_ProjectTask_ID));
}
/** Get Project Task.
@return Actual Project Task in a Phase */
public int getC_ProjectTask_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ProjectTask_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="104e6c40-6513-f3d7-890c-ef925bf161f5")
public static String es_PE_FIELD_InvoiceLine_ProjectTask_Name="Tarea del Proyecto";

@XendraTrl(Identifier="104e6c40-6513-f3d7-890c-ef925bf161f5")
public static String es_PE_FIELD_InvoiceLine_ProjectTask_Description="Actual tarea en la fase del proyecto.";

@XendraTrl(Identifier="104e6c40-6513-f3d7-890c-ef925bf161f5")
public static String es_PE_FIELD_InvoiceLine_ProjectTask_Help="Una tarea de proyecto en una fase de proyecto representa el trabajo real.";

@XendraField(AD_Column_ID="C_ProjectTask_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="104e6c40-6513-f3d7-890c-ef925bf161f5")
public static final String FIELDNAME_InvoiceLine_ProjectTask="104e6c40-6513-f3d7-890c-ef925bf161f5";

@XendraTrl(Identifier="0361f596-8f62-4b1d-3bbd-735e880f5bf3")
public static String es_PE_FIELD_InvoiceLine_ProjectTask2_Name="Tarea del Proyecto";

@XendraTrl(Identifier="0361f596-8f62-4b1d-3bbd-735e880f5bf3")
public static String es_PE_FIELD_InvoiceLine_ProjectTask2_Description="Actual tarea en la fase del proyecto.";

@XendraTrl(Identifier="0361f596-8f62-4b1d-3bbd-735e880f5bf3")
public static String es_PE_FIELD_InvoiceLine_ProjectTask2_Help="Una tarea de proyecto en una fase de proyecto representa el trabajo real.";

@XendraField(AD_Column_ID="C_ProjectTask_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0361f596-8f62-4b1d-3bbd-735e880f5bf3")
public static final String FIELDNAME_InvoiceLine_ProjectTask2="0361f596-8f62-4b1d-3bbd-735e880f5bf3";

@XendraTrl(Identifier="879be43e-044a-8892-a50a-621f88d64ebd")
public static String es_PE_COLUMN_C_ProjectTask_ID_Name="Tarea del Proyecto";

@XendraColumn(AD_Element_ID="1b2d7a20-215c-4f56-6077-83adcead0920",ColumnName="C_ProjectTask_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="53906434-74e2-0844-02ba-0367c21ac60c",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="879be43e-044a-8892-a50a-621f88d64ebd",Synchronized="2020-03-03 21:37:02.0")
/** Column name C_ProjectTask_ID */
public static final String COLUMNNAME_C_ProjectTask_ID = "C_ProjectTask_ID";
/** Set Tax.
@param C_Tax_ID Tax identifier */
public void setC_Tax_ID (int C_Tax_ID)
{
if (C_Tax_ID < 1) throw new IllegalArgumentException ("C_Tax_ID is mandatory.");
set_Value (COLUMNNAME_C_Tax_ID, Integer.valueOf(C_Tax_ID));
}
/** Get Tax.
@return Tax identifier */
public int getC_Tax_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Tax_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2d3751f6-d6a6-140b-d816-7bbda8da8bbf")
public static String es_PE_FIELD_InvoiceLine_Tax_Name="Impuesto";

@XendraTrl(Identifier="2d3751f6-d6a6-140b-d816-7bbda8da8bbf")
public static String es_PE_FIELD_InvoiceLine_Tax_Description="Identificador del Impuesto";

@XendraTrl(Identifier="2d3751f6-d6a6-140b-d816-7bbda8da8bbf")
public static String es_PE_FIELD_InvoiceLine_Tax_Help="El Impuesto indica el tipo de impuesto para esta línea del documento";

@XendraField(AD_Column_ID="C_Tax_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2d3751f6-d6a6-140b-d816-7bbda8da8bbf")
public static final String FIELDNAME_InvoiceLine_Tax="2d3751f6-d6a6-140b-d816-7bbda8da8bbf";

@XendraTrl(Identifier="d375aabd-05ec-7800-d009-3871c880c431")
public static String es_PE_FIELD_InvoiceLine_Tax2_Name="Impuesto";

@XendraTrl(Identifier="d375aabd-05ec-7800-d009-3871c880c431")
public static String es_PE_FIELD_InvoiceLine_Tax2_Description="Identificador del Impuesto";

@XendraTrl(Identifier="d375aabd-05ec-7800-d009-3871c880c431")
public static String es_PE_FIELD_InvoiceLine_Tax2_Help="El Impuesto indica el tipo de impuesto para esta línea del documento";

@XendraField(AD_Column_ID="C_Tax_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d375aabd-05ec-7800-d009-3871c880c431")
public static final String FIELDNAME_InvoiceLine_Tax2="d375aabd-05ec-7800-d009-3871c880c431";

@XendraTrl(Identifier="9d6b5099-e664-76d6-ef4f-9f3fa4d7c70e")
public static String es_PE_FIELD_IncludedLines_Tax_Name="Impuesto";

@XendraTrl(Identifier="9d6b5099-e664-76d6-ef4f-9f3fa4d7c70e")
public static String es_PE_FIELD_IncludedLines_Tax_Description="Identificador del Impuesto";

@XendraTrl(Identifier="9d6b5099-e664-76d6-ef4f-9f3fa4d7c70e")
public static String es_PE_FIELD_IncludedLines_Tax_Help="El Impuesto indica el tipo de impuesto para esta línea del documento";

@XendraField(AD_Column_ID="C_Tax_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6d5404fc-e047-c0ee-8a64-c457419e045c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9d6b5099-e664-76d6-ef4f-9f3fa4d7c70e")
public static final String FIELDNAME_IncludedLines_Tax="9d6b5099-e664-76d6-ef4f-9f3fa4d7c70e";

@XendraTrl(Identifier="0463f10b-ca66-bf7b-fc82-532ca3ef57d1")
public static String es_PE_FIELD_InvoiceLine_Tax3_Name="Impuesto";

@XendraTrl(Identifier="0463f10b-ca66-bf7b-fc82-532ca3ef57d1")
public static String es_PE_FIELD_InvoiceLine_Tax3_Description="Identificador del Impuesto";

@XendraTrl(Identifier="0463f10b-ca66-bf7b-fc82-532ca3ef57d1")
public static String es_PE_FIELD_InvoiceLine_Tax3_Help="El Impuesto indica el tipo de impuesto para esta línea del documento";

@XendraField(AD_Column_ID="C_Tax_ID",IsCentrallyMaintained=true,
AD_Tab_ID="90f8b518-7f5c-9bae-ad70-c719b8e5c310",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0463f10b-ca66-bf7b-fc82-532ca3ef57d1")
public static final String FIELDNAME_InvoiceLine_Tax3="0463f10b-ca66-bf7b-fc82-532ca3ef57d1";

@XendraTrl(Identifier="e93a3d6b-1bf7-699a-022c-42114d768e78")
public static String es_PE_COLUMN_C_Tax_ID_Name="Impuesto";

@XendraColumn(AD_Element_ID="38ff24fc-b68c-51a9-60f8-ef2a1f060de2",ColumnName="C_Tax_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutInvoice.amt",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e93a3d6b-1bf7-699a-022c-42114d768e78",Synchronized="2020-03-03 21:37:02.0")
/** Column name C_Tax_ID */
public static final String COLUMNNAME_C_Tax_ID = "C_Tax_ID";
/** Set UOM.
@param C_UOM_ID Unit of Measure */
public void setC_UOM_ID (int C_UOM_ID)
{
if (C_UOM_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_UOM_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_UOM_ID, Integer.valueOf(C_UOM_ID));
}
/** Get UOM.
@return Unit of Measure */
public int getC_UOM_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_UOM_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f5ac9424-9587-8d4b-8cbb-5e7f92f1808a")
public static String es_PE_FIELD_InvoiceLine_UOM_Name="UM";

@XendraTrl(Identifier="f5ac9424-9587-8d4b-8cbb-5e7f92f1808a")
public static String es_PE_FIELD_InvoiceLine_UOM_Description="Unidad de Medida";

@XendraTrl(Identifier="f5ac9424-9587-8d4b-8cbb-5e7f92f1808a")
public static String es_PE_FIELD_InvoiceLine_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraField(AD_Column_ID="C_UOM_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="Quantities",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f5ac9424-9587-8d4b-8cbb-5e7f92f1808a")
public static final String FIELDNAME_InvoiceLine_UOM="f5ac9424-9587-8d4b-8cbb-5e7f92f1808a";

@XendraTrl(Identifier="3c4eb5d1-7ee0-1d39-8f73-04adcb9039a5")
public static String es_PE_FIELD_InvoiceLine_UOM2_Name="UM";

@XendraTrl(Identifier="3c4eb5d1-7ee0-1d39-8f73-04adcb9039a5")
public static String es_PE_FIELD_InvoiceLine_UOM2_Description="Unidad de Medida";

@XendraTrl(Identifier="3c4eb5d1-7ee0-1d39-8f73-04adcb9039a5")
public static String es_PE_FIELD_InvoiceLine_UOM2_Help="La UM define una unidad de medida única no monetaria";

@XendraField(AD_Column_ID="C_UOM_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="Quantities",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3c4eb5d1-7ee0-1d39-8f73-04adcb9039a5")
public static final String FIELDNAME_InvoiceLine_UOM2="3c4eb5d1-7ee0-1d39-8f73-04adcb9039a5";

@XendraTrl(Identifier="a50d6d3d-747a-0eba-779c-b1c53317a2c7")
public static String es_PE_FIELD_IncludedLines_UOM_Name="UM";

@XendraTrl(Identifier="a50d6d3d-747a-0eba-779c-b1c53317a2c7")
public static String es_PE_FIELD_IncludedLines_UOM_Description="Unidad de Medida";

@XendraTrl(Identifier="a50d6d3d-747a-0eba-779c-b1c53317a2c7")
public static String es_PE_FIELD_IncludedLines_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraField(AD_Column_ID="C_UOM_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6d5404fc-e047-c0ee-8a64-c457419e045c",AD_FieldGroup_ID="Quantities",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a50d6d3d-747a-0eba-779c-b1c53317a2c7")
public static final String FIELDNAME_IncludedLines_UOM="a50d6d3d-747a-0eba-779c-b1c53317a2c7";

@XendraTrl(Identifier="e5123aea-2b5e-8d09-d1f5-d1cf00400858")
public static String es_PE_FIELD_InvoiceLine_UOM3_Name="UM";

@XendraTrl(Identifier="e5123aea-2b5e-8d09-d1f5-d1cf00400858")
public static String es_PE_FIELD_InvoiceLine_UOM3_Description="Unidad de Medida";

@XendraTrl(Identifier="e5123aea-2b5e-8d09-d1f5-d1cf00400858")
public static String es_PE_FIELD_InvoiceLine_UOM3_Help="La UM define una unidad de medida única no monetaria";

@XendraField(AD_Column_ID="C_UOM_ID",IsCentrallyMaintained=true,
AD_Tab_ID="90f8b518-7f5c-9bae-ad70-c719b8e5c310",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e5123aea-2b5e-8d09-d1f5-d1cf00400858")
public static final String FIELDNAME_InvoiceLine_UOM3="e5123aea-2b5e-8d09-d1f5-d1cf00400858";

@XendraTrl(Identifier="d12957b4-4206-d782-3672-4f6d660fe4bd")
public static String es_PE_COLUMN_C_UOM_ID_Name="UM";

@XendraColumn(AD_Element_ID="d0345019-4fcc-44c8-4fd1-e38e3b4adeed",ColumnName="C_UOM_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="107d46fd-952f-7ad3-6b0d-c74906c7b323",
FieldLength=22,DefaultValue="@#C_UOM_ID@",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,
IsTranslated=false,
Callout="org.compiere.model.CalloutInvoice.qty; org.compiere.model.CalloutInvoice.amt",VFormat="",
ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d12957b4-4206-d782-3672-4f6d660fe4bd",Synchronized="2020-03-03 21:37:02.0")
/** Column name C_UOM_ID */
public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
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

@XendraTrl(Identifier="576349fc-4af2-4259-11e4-26a6f0234dbc")
public static String es_PE_FIELD_InvoiceLine_Description_Name="Observación";

@XendraTrl(Identifier="576349fc-4af2-4259-11e4-26a6f0234dbc")
public static String es_PE_FIELD_InvoiceLine_Description_Description="Descripción corta opcional del registro";

@XendraTrl(Identifier="576349fc-4af2-4259-11e4-26a6f0234dbc")
public static String es_PE_FIELD_InvoiceLine_Description_Help="Una descripción esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="576349fc-4af2-4259-11e4-26a6f0234dbc")
public static final String FIELDNAME_InvoiceLine_Description="576349fc-4af2-4259-11e4-26a6f0234dbc";

@XendraTrl(Identifier="8ccc244e-0882-1698-c713-8a4f765c4c7f")
public static String es_PE_FIELD_InvoiceLine_Description2_Name="Observación";

@XendraTrl(Identifier="8ccc244e-0882-1698-c713-8a4f765c4c7f")
public static String es_PE_FIELD_InvoiceLine_Description2_Description="Descripción corta opcional del registro";

@XendraTrl(Identifier="8ccc244e-0882-1698-c713-8a4f765c4c7f")
public static String es_PE_FIELD_InvoiceLine_Description2_Help="Una descripción esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8ccc244e-0882-1698-c713-8a4f765c4c7f")
public static final String FIELDNAME_InvoiceLine_Description2="8ccc244e-0882-1698-c713-8a4f765c4c7f";

@XendraTrl(Identifier="8e793eed-7d31-a79d-cf2e-8af471fb708a")
public static String es_PE_FIELD_IncludedLines_Description_Name="Observación";

@XendraTrl(Identifier="8e793eed-7d31-a79d-cf2e-8af471fb708a")
public static String es_PE_FIELD_IncludedLines_Description_Description="Observación";

@XendraTrl(Identifier="8e793eed-7d31-a79d-cf2e-8af471fb708a")
public static String es_PE_FIELD_IncludedLines_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="6d5404fc-e047-c0ee-8a64-c457419e045c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8e793eed-7d31-a79d-cf2e-8af471fb708a")
public static final String FIELDNAME_IncludedLines_Description="8e793eed-7d31-a79d-cf2e-8af471fb708a";

@XendraTrl(Identifier="db552797-a9af-1ec8-90af-75f04bdcaf40")
public static String es_PE_FIELD_InvoiceLine_Description3_Name="Observación";

@XendraTrl(Identifier="db552797-a9af-1ec8-90af-75f04bdcaf40")
public static String es_PE_FIELD_InvoiceLine_Description3_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="db552797-a9af-1ec8-90af-75f04bdcaf40")
public static String es_PE_FIELD_InvoiceLine_Description3_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="90f8b518-7f5c-9bae-ad70-c719b8e5c310",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="db552797-a9af-1ec8-90af-75f04bdcaf40")
public static final String FIELDNAME_InvoiceLine_Description3="db552797-a9af-1ec8-90af-75f04bdcaf40";

@XendraTrl(Identifier="ed5dbe53-d2e5-1f18-e5cc-4f9692104a97")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="ed5dbe53-d2e5-1f18-e5cc-4f9692104a97",
Synchronized="2020-03-03 21:37:02.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Discount %.
@param Discount Discount in percent */
public void setDiscount (BigDecimal Discount)
{
set_Value (COLUMNNAME_Discount, Discount);
}
/** Get Discount %.
@return Discount in percent */
public BigDecimal getDiscount() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Discount);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="029f3433-772f-433c-97de-8a39ed948d25")
public static String es_PE_COLUMN_Discount_Name="Discount %";

@XendraColumn(AD_Element_ID="3d8e2bac-29ff-f758-dd80-f9b4107077e6",ColumnName="Discount",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="029f3433-772f-433c-97de-8a39ed948d25",
Synchronized="2020-03-03 21:37:02.0")
/** Column name Discount */
public static final String COLUMNNAME_Discount = "Discount";
/** Set Discount1.
@param Discount1 Discount1 */
public void setDiscount1 (BigDecimal Discount1)
{
set_Value (COLUMNNAME_Discount1, Discount1);
}
/** Get Discount1.
@return Discount1 */
public BigDecimal getDiscount1() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Discount1);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="953583e0-612f-38e7-2623-7e978bb8f487")
public static String es_PE_FIELD_InvoiceLine_Discount_Name="% D1";

@XendraField(AD_Column_ID="Discount1",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="953583e0-612f-38e7-2623-7e978bb8f487")
public static final String FIELDNAME_InvoiceLine_Discount="953583e0-612f-38e7-2623-7e978bb8f487";

@XendraTrl(Identifier="da48173d-9290-56e2-8b5c-7d4487d1651a")
public static String es_PE_FIELD_InvoiceLine_Discount12_Name="% D1";

@XendraField(AD_Column_ID="Discount1",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=290,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="da48173d-9290-56e2-8b5c-7d4487d1651a")
public static final String FIELDNAME_InvoiceLine_Discount12="da48173d-9290-56e2-8b5c-7d4487d1651a";

@XendraTrl(Identifier="5da3d8bf-040c-3a4d-5f86-9930d4cda773")
public static String es_PE_COLUMN_Discount1_Name="Discount1";

@XendraColumn(AD_Element_ID="477a8511-8bcb-feca-7140-a0b2ad1183b9",ColumnName="Discount1",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5da3d8bf-040c-3a4d-5f86-9930d4cda773",
Synchronized="2020-03-03 21:37:02.0")
/** Column name Discount1 */
public static final String COLUMNNAME_Discount1 = "Discount1";
/** Set Discount 2 %.
@param Discount2 Discount in percent */
public void setDiscount2 (BigDecimal Discount2)
{
set_Value (COLUMNNAME_Discount2, Discount2);
}
/** Get Discount 2 %.
@return Discount in percent */
public BigDecimal getDiscount2() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Discount2);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="6f45b5c9-a21e-4885-a747-6ebd3cb054d9")
public static String es_PE_FIELD_InvoiceLine_Discount23_Name="% D2";

@XendraTrl(Identifier="6f45b5c9-a21e-4885-a747-6ebd3cb054d9")
public static String es_PE_FIELD_InvoiceLine_Discount23_Description="Descuento en porcentaje";

@XendraTrl(Identifier="6f45b5c9-a21e-4885-a747-6ebd3cb054d9")
public static String es_PE_FIELD_InvoiceLine_Discount23_Help="El Descuento indica el descuento aplicado o tomado como un porcentaje.";

@XendraField(AD_Column_ID="Discount2",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=270,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6f45b5c9-a21e-4885-a747-6ebd3cb054d9")
public static final String FIELDNAME_InvoiceLine_Discount23="6f45b5c9-a21e-4885-a747-6ebd3cb054d9";

@XendraTrl(Identifier="0af87fcc-493f-a24f-f36f-27c428aeb2b0")
public static String es_PE_FIELD_InvoiceLine_Discount24_Name="% D2";

@XendraTrl(Identifier="0af87fcc-493f-a24f-f36f-27c428aeb2b0")
public static String es_PE_FIELD_InvoiceLine_Discount24_Description="Descuento en porcentaje";

@XendraTrl(Identifier="0af87fcc-493f-a24f-f36f-27c428aeb2b0")
public static String es_PE_FIELD_InvoiceLine_Discount24_Help="El Descuento indica el descuento aplicado o tomado como un porcentaje.";

@XendraField(AD_Column_ID="Discount2",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=300,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0af87fcc-493f-a24f-f36f-27c428aeb2b0")
public static final String FIELDNAME_InvoiceLine_Discount24="0af87fcc-493f-a24f-f36f-27c428aeb2b0";

@XendraTrl(Identifier="a5cb9352-07d6-345f-27ce-ac22b497f9e9")
public static String es_PE_COLUMN_Discount2_Name="Discount 2 %";

@XendraColumn(AD_Element_ID="f316139b-9edb-4d81-7a3b-369e45352498",ColumnName="Discount2",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a5cb9352-07d6-345f-27ce-ac22b497f9e9",
Synchronized="2020-03-03 21:37:02.0")
/** Column name Discount2 */
public static final String COLUMNNAME_Discount2 = "Discount2";
/** Set Discount3.
@param Discount3 Discount3 */
public void setDiscount3 (BigDecimal Discount3)
{
set_Value (COLUMNNAME_Discount3, Discount3);
}
/** Get Discount3.
@return Discount3 */
public BigDecimal getDiscount3() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Discount3);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="4202fd26-dcff-99b8-167e-24023a9eabbe")
public static String es_PE_FIELD_InvoiceLine_Discount35_Name="% D3";

@XendraField(AD_Column_ID="Discount3",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=280,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4202fd26-dcff-99b8-167e-24023a9eabbe")
public static final String FIELDNAME_InvoiceLine_Discount35="4202fd26-dcff-99b8-167e-24023a9eabbe";

@XendraTrl(Identifier="8fc32ce3-33bd-460d-fcd8-56795b7bfcb0")
public static String es_PE_FIELD_InvoiceLine_Discount36_Name="% D3";

@XendraField(AD_Column_ID="Discount3",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=310,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8fc32ce3-33bd-460d-fcd8-56795b7bfcb0")
public static final String FIELDNAME_InvoiceLine_Discount36="8fc32ce3-33bd-460d-fcd8-56795b7bfcb0";

@XendraTrl(Identifier="6b20d08c-197f-7319-1182-dfb3c88a9029")
public static String es_PE_COLUMN_Discount3_Name="discount3";

@XendraColumn(AD_Element_ID="c30e9759-37f1-0c5e-0b40-72d7e2b396b9",ColumnName="Discount3",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6b20d08c-197f-7319-1182-dfb3c88a9029",
Synchronized="2020-03-03 21:37:02.0")
/** Column name Discount3 */
public static final String COLUMNNAME_Discount3 = "Discount3";
/** Set Discount4.
@param Discount4 Discount4 */
public void setDiscount4 (BigDecimal Discount4)
{
set_Value (COLUMNNAME_Discount4, Discount4);
}
/** Get Discount4.
@return Discount4 */
public BigDecimal getDiscount4() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Discount4);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="cf34bac3-d859-c621-8fdf-400bb873bde8")
public static String es_PE_FIELD_InvoiceLine_Discount47_Name="% D4";

@XendraField(AD_Column_ID="Discount4",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=290,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cf34bac3-d859-c621-8fdf-400bb873bde8")
public static final String FIELDNAME_InvoiceLine_Discount47="cf34bac3-d859-c621-8fdf-400bb873bde8";

@XendraTrl(Identifier="bbbe7d72-1688-4e4c-4eac-cb87a2f60275")
public static String es_PE_FIELD_InvoiceLine_Discount48_Name="% D4";

@XendraField(AD_Column_ID="Discount4",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=320,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bbbe7d72-1688-4e4c-4eac-cb87a2f60275")
public static final String FIELDNAME_InvoiceLine_Discount48="bbbe7d72-1688-4e4c-4eac-cb87a2f60275";

@XendraTrl(Identifier="09c11dc8-4a2a-3f4b-1267-1e7ca0737535")
public static String es_PE_COLUMN_Discount4_Name="discount4";

@XendraColumn(AD_Element_ID="608dc743-7c00-576c-d5c1-b0a29a888a94",ColumnName="Discount4",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="09c11dc8-4a2a-3f4b-1267-1e7ca0737535",
Synchronized="2020-03-03 21:37:02.0")
/** Column name Discount4 */
public static final String COLUMNNAME_Discount4 = "Discount4";
/** Set DiscountAcquire1.
@param DiscountAcquire1 DiscountAcquire1 */
public void setDiscountAcquire1 (BigDecimal DiscountAcquire1)
{
set_Value (COLUMNNAME_DiscountAcquire1, DiscountAcquire1);
}
/** Get DiscountAcquire1.
@return DiscountAcquire1 */
public BigDecimal getDiscountAcquire1() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_DiscountAcquire1);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="78adb334-2e03-9bcc-d825-7ab255e67657")
public static String es_PE_FIELD_InvoiceLine_DiscountAcquire_Name="DiscountAcquire1";

@XendraField(AD_Column_ID="DiscountAcquire1",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="78adb334-2e03-9bcc-d825-7ab255e67657")
public static final String FIELDNAME_InvoiceLine_DiscountAcquire="78adb334-2e03-9bcc-d825-7ab255e67657";

@XendraTrl(Identifier="398a6071-d7aa-ae98-d2f8-dee120a59a4a")
public static String es_PE_FIELD_InvoiceLine_DiscountAcquire12_Name="DiscountAcquire1";

@XendraField(AD_Column_ID="DiscountAcquire1",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="398a6071-d7aa-ae98-d2f8-dee120a59a4a")
public static final String FIELDNAME_InvoiceLine_DiscountAcquire12="398a6071-d7aa-ae98-d2f8-dee120a59a4a";

@XendraTrl(Identifier="801707af-d7aa-3f11-d34c-b56aadf3236e")
public static String es_PE_COLUMN_DiscountAcquire1_Name="discountacquire1";

@XendraColumn(AD_Element_ID="dfb9142b-ec3b-1733-80c8-b48c82bb39e1",ColumnName="DiscountAcquire1",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="801707af-d7aa-3f11-d34c-b56aadf3236e",
Synchronized="2020-03-03 21:37:02.0")
/** Column name DiscountAcquire1 */
public static final String COLUMNNAME_DiscountAcquire1 = "DiscountAcquire1";
/** Set Freight Amount.
@param FreightAmt Freight Amount  */
public void setFreightAmt (BigDecimal FreightAmt)
{
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

@XendraTrl(Identifier="75b2e8a7-9a5e-2c4b-ed9f-c115a09d13af")
public static String es_PE_FIELD_InvoiceLine_FreightAmount_Name="Total de Flete";

@XendraTrl(Identifier="75b2e8a7-9a5e-2c4b-ed9f-c115a09d13af")
public static String es_PE_FIELD_InvoiceLine_FreightAmount_Description="Total de la entrega";

@XendraTrl(Identifier="75b2e8a7-9a5e-2c4b-ed9f-c115a09d13af")
public static String es_PE_FIELD_InvoiceLine_FreightAmount_Help="El Total del Flete indica el total cargado por flete en la moneda del documento";

@XendraField(AD_Column_ID="FreightAmt",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="75b2e8a7-9a5e-2c4b-ed9f-c115a09d13af")
public static final String FIELDNAME_InvoiceLine_FreightAmount="75b2e8a7-9a5e-2c4b-ed9f-c115a09d13af";

@XendraTrl(Identifier="a0cb87d6-5f83-bd70-3e95-29722b3ad063")
public static String es_PE_FIELD_InvoiceLine_FreightAmount2_Name="Total de Flete";

@XendraTrl(Identifier="a0cb87d6-5f83-bd70-3e95-29722b3ad063")
public static String es_PE_FIELD_InvoiceLine_FreightAmount2_Description="Total de la entrega";

@XendraTrl(Identifier="a0cb87d6-5f83-bd70-3e95-29722b3ad063")
public static String es_PE_FIELD_InvoiceLine_FreightAmount2_Help="El Total del Flete indica el total cargado por flete en la moneda del documento";

@XendraField(AD_Column_ID="FreightAmt",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=340,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a0cb87d6-5f83-bd70-3e95-29722b3ad063")
public static final String FIELDNAME_InvoiceLine_FreightAmount2="a0cb87d6-5f83-bd70-3e95-29722b3ad063";

@XendraTrl(Identifier="ba3c8130-428a-be81-1ae7-6af5c52853a2")
public static String es_PE_COLUMN_FreightAmt_Name="Freight Amount";

@XendraColumn(AD_Element_ID="b2162c75-bbbe-b49a-7ffe-6020ce78c453",ColumnName="FreightAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ba3c8130-428a-be81-1ae7-6af5c52853a2",
Synchronized="2020-03-03 21:37:02.0")
/** Column name FreightAmt */
public static final String COLUMNNAME_FreightAmt = "FreightAmt";
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
@XendraTrl(Identifier="7cda6e6a-77f0-49df-82eb-99fa034c9d1d")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7cda6e6a-77f0-49df-82eb-99fa034c9d1d",
Synchronized="2020-03-03 21:37:02.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Description Only.
@param IsDescription if true, the line is just DESCRIPTION and no transaction */
public void setIsDescription (boolean IsDescription)
{
set_Value (COLUMNNAME_IsDescription, Boolean.valueOf(IsDescription));
}
/** Get Description Only.
@return if true, the line is just DESCRIPTION and no transaction */
public boolean isDescription() 
{
Object oo = get_Value(COLUMNNAME_IsDescription);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f407c90e-4712-ee52-f18f-4d3ed3613300")
public static String es_PE_FIELD_InvoiceLine_DescriptionOnly_Name="Sólo Descripción";

@XendraTrl(Identifier="f407c90e-4712-ee52-f18f-4d3ed3613300")
public static String es_PE_FIELD_InvoiceLine_DescriptionOnly_Description="Si es verdad, la línea es descripción justa y ninguna transacción.";

@XendraTrl(Identifier="f407c90e-4712-ee52-f18f-4d3ed3613300")
public static String es_PE_FIELD_InvoiceLine_DescriptionOnly_Help="Si una línea es descripción solamente, Ej. el inventario del producto no se corrige. No se crea ningunas transacciones de la contabilidad y la cantidad ó los totales no se incluye en el documento. Esto para incluir líneas de detalle de descripción, Ej. para una orden de trabajo.";

@XendraField(AD_Column_ID="IsDescription",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f407c90e-4712-ee52-f18f-4d3ed3613300")
public static final String FIELDNAME_InvoiceLine_DescriptionOnly="f407c90e-4712-ee52-f18f-4d3ed3613300";

@XendraTrl(Identifier="70145434-c3f8-3c35-5655-f86aee154a3d")
public static String es_PE_FIELD_InvoiceLine_DescriptionOnly2_Name="Sólo Descripción";

@XendraTrl(Identifier="70145434-c3f8-3c35-5655-f86aee154a3d")
public static String es_PE_FIELD_InvoiceLine_DescriptionOnly2_Description="Si es verdad, la línea es descripción justa y ninguna transacción.";

@XendraTrl(Identifier="70145434-c3f8-3c35-5655-f86aee154a3d")
public static String es_PE_FIELD_InvoiceLine_DescriptionOnly2_Help="Si una línea es descripción solamente, Ej. el inventario del producto no se corrige. No se crea ningunas transacciones de la contabilidad y la cantidad ó los totales no se incluye en el documento. Esto para incluir líneas de detalle de descripción, Ej. para una orden de trabajo.";

@XendraField(AD_Column_ID="IsDescription",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="70145434-c3f8-3c35-5655-f86aee154a3d")
public static final String FIELDNAME_InvoiceLine_DescriptionOnly2="70145434-c3f8-3c35-5655-f86aee154a3d";

@XendraTrl(Identifier="dcba64bd-3ea5-339f-b491-414d07eb0964")
public static String es_PE_FIELD_IncludedLines_DescriptionOnly_Name="Sólo Descripción";

@XendraTrl(Identifier="dcba64bd-3ea5-339f-b491-414d07eb0964")
public static String es_PE_FIELD_IncludedLines_DescriptionOnly_Description="Si es verdad, la línea es descripción justa y ninguna transacción.";

@XendraTrl(Identifier="dcba64bd-3ea5-339f-b491-414d07eb0964")
public static String es_PE_FIELD_IncludedLines_DescriptionOnly_Help="Si una línea es descripción solamente, Ej. el inventario del producto no se corrige. No se crea ningunas transacciones de la contabilidad y la cantidad ó los totales no se incluye en el documento. Esto para incluir líneas de detalle de descripción, Ej. para una orden de trabajo.";

@XendraField(AD_Column_ID="IsDescription",IsCentrallyMaintained=true,
AD_Tab_ID="6d5404fc-e047-c0ee-8a64-c457419e045c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dcba64bd-3ea5-339f-b491-414d07eb0964")
public static final String FIELDNAME_IncludedLines_DescriptionOnly="dcba64bd-3ea5-339f-b491-414d07eb0964";

@XendraTrl(Identifier="02964368-1b30-df3d-1c84-08a2fbc23bf6")
public static String es_PE_FIELD_InvoiceLine_DescriptionOnly3_Name="Sólo Descripción";

@XendraTrl(Identifier="02964368-1b30-df3d-1c84-08a2fbc23bf6")
public static String es_PE_FIELD_InvoiceLine_DescriptionOnly3_Description="Si es verdad, la línea es descripción justa y ninguna transacción.";

@XendraTrl(Identifier="02964368-1b30-df3d-1c84-08a2fbc23bf6")
public static String es_PE_FIELD_InvoiceLine_DescriptionOnly3_Help="Si una línea es descripción solamente, Ej. el inventario del producto no se corrige. No se crea ningunas transacciones de la contabilidad y la cantidad ó los totales no se incluye en el documento. Esto para incluir líneas de detalle de descripción, Ej. para una orden de trabajo.";

@XendraField(AD_Column_ID="IsDescription",IsCentrallyMaintained=true,
AD_Tab_ID="90f8b518-7f5c-9bae-ad70-c719b8e5c310",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="02964368-1b30-df3d-1c84-08a2fbc23bf6")
public static final String FIELDNAME_InvoiceLine_DescriptionOnly3="02964368-1b30-df3d-1c84-08a2fbc23bf6";

@XendraTrl(Identifier="5844c31a-98e2-37a6-001d-dafc556fe5a8")
public static String es_PE_COLUMN_IsDescription_Name="Sólo Descripción";

@XendraColumn(AD_Element_ID="bd7f450d-a061-1b08-60d8-19c8943042f0",ColumnName="IsDescription",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5844c31a-98e2-37a6-001d-dafc556fe5a8",
Synchronized="2020-03-03 21:37:02.0")
/** Column name IsDescription */
public static final String COLUMNNAME_IsDescription = "IsDescription";
/** Set Printed.
@param IsPrinted Indicates if this document / line is printed */
public void setIsPrinted (boolean IsPrinted)
{
set_Value (COLUMNNAME_IsPrinted, Boolean.valueOf(IsPrinted));
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

@XendraTrl(Identifier="afc81973-9602-fa06-ab69-06806a816b6b")
public static String es_PE_FIELD_InvoiceLine_Printed_Name="Impreso";

@XendraTrl(Identifier="afc81973-9602-fa06-ab69-06806a816b6b")
public static String es_PE_FIELD_InvoiceLine_Printed_Description="Indica si este documento es impreso.";

@XendraTrl(Identifier="afc81973-9602-fa06-ab69-06806a816b6b")
public static String es_PE_FIELD_InvoiceLine_Printed_Help="El cuadro de verificación impreso indica si este documento se imprimirá.";

@XendraField(AD_Column_ID="IsPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=220,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="afc81973-9602-fa06-ab69-06806a816b6b")
public static final String FIELDNAME_InvoiceLine_Printed="afc81973-9602-fa06-ab69-06806a816b6b";

@XendraTrl(Identifier="06b12f57-3956-46d0-c635-28fe113589b9")
public static String es_PE_FIELD_InvoiceLine_Printed2_Name="Impreso";

@XendraTrl(Identifier="06b12f57-3956-46d0-c635-28fe113589b9")
public static String es_PE_FIELD_InvoiceLine_Printed2_Description="Indica si este documento es impreso.";

@XendraTrl(Identifier="06b12f57-3956-46d0-c635-28fe113589b9")
public static String es_PE_FIELD_InvoiceLine_Printed2_Help="El cuadro de verificación impreso indica si este documento se imprimirá.";

@XendraField(AD_Column_ID="IsPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=250,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="06b12f57-3956-46d0-c635-28fe113589b9")
public static final String FIELDNAME_InvoiceLine_Printed2="06b12f57-3956-46d0-c635-28fe113589b9";

@XendraTrl(Identifier="9b0562cf-7682-49df-06b3-b18d7cd5f75f")
public static String es_PE_FIELD_IncludedLines_Printed_Name="Impreso";

@XendraTrl(Identifier="9b0562cf-7682-49df-06b3-b18d7cd5f75f")
public static String es_PE_FIELD_IncludedLines_Printed_Description="Indica si este documento es impreso.";

@XendraTrl(Identifier="9b0562cf-7682-49df-06b3-b18d7cd5f75f")
public static String es_PE_FIELD_IncludedLines_Printed_Help="El cuadro de verificación impreso indica si este documento se imprimirá.";

@XendraField(AD_Column_ID="IsPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="6d5404fc-e047-c0ee-8a64-c457419e045c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9b0562cf-7682-49df-06b3-b18d7cd5f75f")
public static final String FIELDNAME_IncludedLines_Printed="9b0562cf-7682-49df-06b3-b18d7cd5f75f";

@XendraTrl(Identifier="2c8498fa-fbaf-81f3-2edd-6ed3a7a3850c")
public static String es_PE_FIELD_InvoiceLine_Printed3_Name="Impreso";

@XendraTrl(Identifier="2c8498fa-fbaf-81f3-2edd-6ed3a7a3850c")
public static String es_PE_FIELD_InvoiceLine_Printed3_Description="Indica si este documento es impreso.";

@XendraTrl(Identifier="2c8498fa-fbaf-81f3-2edd-6ed3a7a3850c")
public static String es_PE_FIELD_InvoiceLine_Printed3_Help="El cuadro de verificación impreso indica si este documento se imprimirá.";

@XendraField(AD_Column_ID="IsPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="90f8b518-7f5c-9bae-ad70-c719b8e5c310",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2c8498fa-fbaf-81f3-2edd-6ed3a7a3850c")
public static final String FIELDNAME_InvoiceLine_Printed3="2c8498fa-fbaf-81f3-2edd-6ed3a7a3850c";

@XendraTrl(Identifier="fbb389cb-f324-98e2-54ae-1ffbb4efe12c")
public static String es_PE_COLUMN_IsPrinted_Name="Impreso";

@XendraColumn(AD_Element_ID="66795cb3-a608-19bb-8cde-40abe30a0130",ColumnName="IsPrinted",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fbb389cb-f324-98e2-54ae-1ffbb4efe12c",
Synchronized="2020-03-03 21:37:02.0")
/** Column name IsPrinted */
public static final String COLUMNNAME_IsPrinted = "IsPrinted";
/** Set IsUseAdvance.
@param IsUseAdvance IsUseAdvance */
public void setIsUseAdvance (boolean IsUseAdvance)
{
set_Value (COLUMNNAME_IsUseAdvance, Boolean.valueOf(IsUseAdvance));
}
/** Get IsUseAdvance.
@return IsUseAdvance */
public boolean isUseAdvance() 
{
Object oo = get_Value(COLUMNNAME_IsUseAdvance);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="0e866ee4-123c-4f79-ac48-00689fb2cdc3")
public static String es_PE_COLUMN_IsUseAdvance_Name="IsUseAdvance";

@XendraColumn(AD_Element_ID="ba791fc3-7afe-ce0c-33ee-b9e782cb668e",ColumnName="IsUseAdvance",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0e866ee4-123c-4f79-ac48-00689fb2cdc3",
Synchronized="2020-03-03 21:37:02.0")
/** Column name IsUseAdvance */
public static final String COLUMNNAME_IsUseAdvance = "IsUseAdvance";
/** Set Line No.
@param Line Unique line for this document */
public void setLine (int Line)
{
set_Value (COLUMNNAME_Line, Integer.valueOf(Line));
}
/** Get Line No.
@return Unique line for this document */
public int getLine() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Line);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1a9d0da3-af6f-c0b5-35c3-7a996a801f5e")
public static String es_PE_FIELD_InvoiceLine_LineNo_Name="No. Ítem";

@XendraTrl(Identifier="1a9d0da3-af6f-c0b5-35c3-7a996a801f5e")
public static String es_PE_FIELD_InvoiceLine_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="1a9d0da3-af6f-c0b5-35c3-7a996a801f5e")
public static String es_PE_FIELD_InvoiceLine_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1a9d0da3-af6f-c0b5-35c3-7a996a801f5e")
public static final String FIELDNAME_InvoiceLine_LineNo="1a9d0da3-af6f-c0b5-35c3-7a996a801f5e";

@XendraTrl(Identifier="32f38e8b-f8a3-598e-b09c-8a243948bcff")
public static String es_PE_FIELD_InvoiceLine_LineNo2_Name="No. Ítem";

@XendraTrl(Identifier="32f38e8b-f8a3-598e-b09c-8a243948bcff")
public static String es_PE_FIELD_InvoiceLine_LineNo2_Description="No. Línea único para este documento";

@XendraTrl(Identifier="32f38e8b-f8a3-598e-b09c-8a243948bcff")
public static String es_PE_FIELD_InvoiceLine_LineNo2_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="32f38e8b-f8a3-598e-b09c-8a243948bcff")
public static final String FIELDNAME_InvoiceLine_LineNo2="32f38e8b-f8a3-598e-b09c-8a243948bcff";

@XendraTrl(Identifier="b1914445-cea2-2d19-6f0e-8415ddee7253")
public static String es_PE_FIELD_IncludedLines_LineNo_Name="No. Línea";

@XendraTrl(Identifier="b1914445-cea2-2d19-6f0e-8415ddee7253")
public static String es_PE_FIELD_IncludedLines_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="b1914445-cea2-2d19-6f0e-8415ddee7253")
public static String es_PE_FIELD_IncludedLines_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="6d5404fc-e047-c0ee-8a64-c457419e045c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=10,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b1914445-cea2-2d19-6f0e-8415ddee7253")
public static final String FIELDNAME_IncludedLines_LineNo="b1914445-cea2-2d19-6f0e-8415ddee7253";

@XendraTrl(Identifier="fbf17bbe-492d-7262-edbc-086437c4f51f")
public static String es_PE_FIELD_InvoiceLine_LineNo3_Name="No. Línea";

@XendraTrl(Identifier="fbf17bbe-492d-7262-edbc-086437c4f51f")
public static String es_PE_FIELD_InvoiceLine_LineNo3_Description="No. Línea único para este documento";

@XendraTrl(Identifier="fbf17bbe-492d-7262-edbc-086437c4f51f")
public static String es_PE_FIELD_InvoiceLine_LineNo3_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="90f8b518-7f5c-9bae-ad70-c719b8e5c310",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fbf17bbe-492d-7262-edbc-086437c4f51f")
public static final String FIELDNAME_InvoiceLine_LineNo3="fbf17bbe-492d-7262-edbc-086437c4f51f";

@XendraTrl(Identifier="f42ff189-749f-5125-4f06-7307e4030348")
public static String es_PE_COLUMN_Line_Name="No. Línea";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM C_InvoiceLine WHERE C_Invoice_ID=@C_Invoice_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f42ff189-749f-5125-4f06-7307e4030348",
Synchronized="2020-03-03 21:37:02.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";
/** Set Line Amount.
@param LineNetAmt Line Extended Amount (Quantity * Actual Price) without Freight and Charges */
public void setLineNetAmt (BigDecimal LineNetAmt)
{
if (LineNetAmt == null) throw new IllegalArgumentException ("LineNetAmt is mandatory.");
set_ValueNoCheck (COLUMNNAME_LineNetAmt, LineNetAmt);
}
/** Get Line Amount.
@return Line Extended Amount (Quantity * Actual Price) without Freight and Charges */
public BigDecimal getLineNetAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_LineNetAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="27c2f217-8f1f-9f23-638e-49bd575c11e9")
public static String es_PE_FIELD_InvoiceLine_LineAmount_Name="Neto de Ítem";

@XendraTrl(Identifier="27c2f217-8f1f-9f23-638e-49bd575c11e9")
public static String es_PE_FIELD_InvoiceLine_LineAmount_Description="Total neto de la línea (Cantidad * Precio Actual) sin fletes ni cargos";

@XendraTrl(Identifier="27c2f217-8f1f-9f23-638e-49bd575c11e9")
public static String es_PE_FIELD_InvoiceLine_LineAmount_Help="Indica el total neto de la línea basado en la cantidad y el precio actual. Cualquier cargo adicional ó flete no es incluido.";

@XendraField(AD_Column_ID="LineNetAmt",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="27c2f217-8f1f-9f23-638e-49bd575c11e9")
public static final String FIELDNAME_InvoiceLine_LineAmount="27c2f217-8f1f-9f23-638e-49bd575c11e9";

@XendraTrl(Identifier="6af50a02-7a9b-aca0-5299-489572e49e63")
public static String es_PE_FIELD_InvoiceLine_LineAmount2_Name="Neto de Ítem";

@XendraTrl(Identifier="6af50a02-7a9b-aca0-5299-489572e49e63")
public static String es_PE_FIELD_InvoiceLine_LineAmount2_Description="Total neto de la línea (Cantidad * Precio Actual) sin fletes ni cargos";

@XendraTrl(Identifier="6af50a02-7a9b-aca0-5299-489572e49e63")
public static String es_PE_FIELD_InvoiceLine_LineAmount2_Help="Indica el total neto de la línea basado en la cantidad y el precio actual. Cualquier cargo adicional ó flete no es incluido.";

@XendraField(AD_Column_ID="LineNetAmt",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=220,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6af50a02-7a9b-aca0-5299-489572e49e63")
public static final String FIELDNAME_InvoiceLine_LineAmount2="6af50a02-7a9b-aca0-5299-489572e49e63";

@XendraTrl(Identifier="82bf5760-3413-4883-03d7-156e80014bf1")
public static String es_PE_FIELD_IncludedLines_LineAmount_Name="Neto de Línea";

@XendraTrl(Identifier="82bf5760-3413-4883-03d7-156e80014bf1")
public static String es_PE_FIELD_IncludedLines_LineAmount_Description="Total neto de la línea (Cantidad * Precio Actual) sin fletes ni cargos";

@XendraTrl(Identifier="82bf5760-3413-4883-03d7-156e80014bf1")
public static String es_PE_FIELD_IncludedLines_LineAmount_Help="Indica el total neto de la línea basado en la cantidad y el precio actual. Cualquier cargo adicional ó flete no es incluido.";

@XendraField(AD_Column_ID="LineNetAmt",IsCentrallyMaintained=true,
AD_Tab_ID="6d5404fc-e047-c0ee-8a64-c457419e045c",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="82bf5760-3413-4883-03d7-156e80014bf1")
public static final String FIELDNAME_IncludedLines_LineAmount="82bf5760-3413-4883-03d7-156e80014bf1";

@XendraTrl(Identifier="d82e474a-91b8-586e-81d7-9d578e666605")
public static String es_PE_FIELD_InvoiceLine_LineAmount3_Name="Neto de Línea";

@XendraTrl(Identifier="d82e474a-91b8-586e-81d7-9d578e666605")
public static String es_PE_FIELD_InvoiceLine_LineAmount3_Description="Total neto de la línea (Cantidad * Precio Actual) sin fletes ni cargos";

@XendraTrl(Identifier="d82e474a-91b8-586e-81d7-9d578e666605")
public static String es_PE_FIELD_InvoiceLine_LineAmount3_Help="Indica el total neto de la línea basado en la cantidad y el precio actual. Cualquier cargo adicional ó flete no es incluido.";

@XendraField(AD_Column_ID="LineNetAmt",IsCentrallyMaintained=true,
AD_Tab_ID="90f8b518-7f5c-9bae-ad70-c719b8e5c310",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d82e474a-91b8-586e-81d7-9d578e666605")
public static final String FIELDNAME_InvoiceLine_LineAmount3="d82e474a-91b8-586e-81d7-9d578e666605";

@XendraTrl(Identifier="c4932bb9-6b0b-a404-6260-c502190233c4")
public static String es_PE_COLUMN_LineNetAmt_Name="Neto de Línea";

@XendraColumn(AD_Element_ID="ba57a535-4ae3-c6eb-74ec-3dcb0973d6f6",ColumnName="LineNetAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=3,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c4932bb9-6b0b-a404-6260-c502190233c4",
Synchronized="2020-03-03 21:37:02.0")
/** Column name LineNetAmt */
public static final String COLUMNNAME_LineNetAmt = "LineNetAmt";
/** Set Line Total.
@param LineTotalAmt Total line amount incl. Tax */
public void setLineTotalAmt (BigDecimal LineTotalAmt)
{
set_Value (COLUMNNAME_LineTotalAmt, LineTotalAmt);
}
/** Get Line Total.
@return Total line amount incl. Tax */
public BigDecimal getLineTotalAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_LineTotalAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="78a93605-c21d-56c2-b46f-d60c2c6d2d84")
public static String es_PE_FIELD_InvoiceLine_LineTotal_Name="Total de la Línea";

@XendraTrl(Identifier="78a93605-c21d-56c2-b46f-d60c2c6d2d84")
public static String es_PE_FIELD_InvoiceLine_LineTotal_Description="Cantidad total de la línea, impuestos incluidos";

@XendraTrl(Identifier="78a93605-c21d-56c2-b46f-d60c2c6d2d84")
public static String es_PE_FIELD_InvoiceLine_LineTotal_Help="Cantidad de la línea total";

@XendraField(AD_Column_ID="LineTotalAmt",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="78a93605-c21d-56c2-b46f-d60c2c6d2d84")
public static final String FIELDNAME_InvoiceLine_LineTotal="78a93605-c21d-56c2-b46f-d60c2c6d2d84";

@XendraTrl(Identifier="8691affb-c605-af29-6d82-7082f87a3e2e")
public static String es_PE_FIELD_InvoiceLine_LineTotal2_Name="Total del Ítem";

@XendraTrl(Identifier="8691affb-c605-af29-6d82-7082f87a3e2e")
public static String es_PE_FIELD_InvoiceLine_LineTotal2_Description="Cantidad total de la línea, impuestos incluidos";

@XendraTrl(Identifier="8691affb-c605-af29-6d82-7082f87a3e2e")
public static String es_PE_FIELD_InvoiceLine_LineTotal2_Help="Cantidad de la línea total";

@XendraField(AD_Column_ID="LineTotalAmt",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=230,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8691affb-c605-af29-6d82-7082f87a3e2e")
public static final String FIELDNAME_InvoiceLine_LineTotal2="8691affb-c605-af29-6d82-7082f87a3e2e";

@XendraTrl(Identifier="956fd0c0-29a3-de1f-336c-d0964bedf5de")
public static String es_PE_FIELD_IncludedLines_LineTotal_Name="Total de la Línea";

@XendraTrl(Identifier="956fd0c0-29a3-de1f-336c-d0964bedf5de")
public static String es_PE_FIELD_IncludedLines_LineTotal_Description="Cantidad total de la línea, impuestos incluidos";

@XendraTrl(Identifier="956fd0c0-29a3-de1f-336c-d0964bedf5de")
public static String es_PE_FIELD_IncludedLines_LineTotal_Help="Cantidad de la línea total";

@XendraField(AD_Column_ID="LineTotalAmt",IsCentrallyMaintained=true,
AD_Tab_ID="6d5404fc-e047-c0ee-8a64-c457419e045c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="956fd0c0-29a3-de1f-336c-d0964bedf5de")
public static final String FIELDNAME_IncludedLines_LineTotal="956fd0c0-29a3-de1f-336c-d0964bedf5de";

@XendraTrl(Identifier="dc7d4590-1738-6035-4ee7-8138b93aed9c")
public static String es_PE_FIELD_InvoiceLine_LineTotal3_Name="Total de la Línea";

@XendraTrl(Identifier="dc7d4590-1738-6035-4ee7-8138b93aed9c")
public static String es_PE_FIELD_InvoiceLine_LineTotal3_Description="Cantidad total de la línea, impuestos incluidos";

@XendraTrl(Identifier="dc7d4590-1738-6035-4ee7-8138b93aed9c")
public static String es_PE_FIELD_InvoiceLine_LineTotal3_Help="Cantidad de la línea total";

@XendraField(AD_Column_ID="LineTotalAmt",IsCentrallyMaintained=true,
AD_Tab_ID="90f8b518-7f5c-9bae-ad70-c719b8e5c310",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dc7d4590-1738-6035-4ee7-8138b93aed9c")
public static final String FIELDNAME_InvoiceLine_LineTotal3="dc7d4590-1738-6035-4ee7-8138b93aed9c";

@XendraTrl(Identifier="19988832-cf10-89ac-d304-ee054b0ded8b")
public static String es_PE_COLUMN_LineTotalAmt_Name="Total de la Línea";

@XendraColumn(AD_Element_ID="582be6fc-dd62-5c60-3398-a0f8435f0670",ColumnName="LineTotalAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="19988832-cf10-89ac-d304-ee054b0ded8b",
Synchronized="2020-03-03 21:37:02.0")
/** Column name LineTotalAmt */
public static final String COLUMNNAME_LineTotalAmt = "LineTotalAmt";
/** Set Attribute Set Instance.
@param M_AttributeSetInstance_ID Product Attribute Set Instance */
public void setM_AttributeSetInstance_ID (int M_AttributeSetInstance_ID)
{
if (M_AttributeSetInstance_ID < 0) throw new IllegalArgumentException ("M_AttributeSetInstance_ID is mandatory.");
set_Value (COLUMNNAME_M_AttributeSetInstance_ID, Integer.valueOf(M_AttributeSetInstance_ID));
}
/** Get Attribute Set Instance.
@return Product Attribute Set Instance */
public int getM_AttributeSetInstance_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_AttributeSetInstance_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="82652d4c-d9a7-8300-64bb-74967d6786d4")
public static String es_PE_FIELD_InvoiceLine_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraTrl(Identifier="82652d4c-d9a7-8300-64bb-74967d6786d4")
public static String es_PE_FIELD_InvoiceLine_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="82652d4c-d9a7-8300-64bb-74967d6786d4")
public static String es_PE_FIELD_InvoiceLine_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="82652d4c-d9a7-8300-64bb-74967d6786d4")
public static final String FIELDNAME_InvoiceLine_AttributeSetInstance="82652d4c-d9a7-8300-64bb-74967d6786d4";

@XendraTrl(Identifier="174bf420-24bb-0fbb-565f-7cbf0d96dea0")
public static String es_PE_FIELD_InvoiceLine_AttributeSetInstance2_Name="Instancia del Conjunto de Atributos";

@XendraTrl(Identifier="174bf420-24bb-0fbb-565f-7cbf0d96dea0")
public static String es_PE_FIELD_InvoiceLine_AttributeSetInstance2_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="174bf420-24bb-0fbb-565f-7cbf0d96dea0")
public static String es_PE_FIELD_InvoiceLine_AttributeSetInstance2_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="174bf420-24bb-0fbb-565f-7cbf0d96dea0")
public static final String FIELDNAME_InvoiceLine_AttributeSetInstance2="174bf420-24bb-0fbb-565f-7cbf0d96dea0";

@XendraTrl(Identifier="93d0169d-8eba-6680-9774-eb983c203168")
public static String es_PE_FIELD_IncludedLines_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraTrl(Identifier="93d0169d-8eba-6680-9774-eb983c203168")
public static String es_PE_FIELD_IncludedLines_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="93d0169d-8eba-6680-9774-eb983c203168")
public static String es_PE_FIELD_IncludedLines_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6d5404fc-e047-c0ee-8a64-c457419e045c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="93d0169d-8eba-6680-9774-eb983c203168")
public static final String FIELDNAME_IncludedLines_AttributeSetInstance="93d0169d-8eba-6680-9774-eb983c203168";

@XendraTrl(Identifier="fffbe0ab-6b55-68a9-984d-8225f4b907ec")
public static String es_PE_FIELD_InvoiceLine_AttributeSetInstance3_Name="Instancia del Conjunto de Atributos";

@XendraTrl(Identifier="fffbe0ab-6b55-68a9-984d-8225f4b907ec")
public static String es_PE_FIELD_InvoiceLine_AttributeSetInstance3_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="fffbe0ab-6b55-68a9-984d-8225f4b907ec")
public static String es_PE_FIELD_InvoiceLine_AttributeSetInstance3_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="90f8b518-7f5c-9bae-ad70-c719b8e5c310",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fffbe0ab-6b55-68a9-984d-8225f4b907ec")
public static final String FIELDNAME_InvoiceLine_AttributeSetInstance3="fffbe0ab-6b55-68a9-984d-8225f4b907ec";

@XendraTrl(Identifier="2aab15e1-82b5-d74d-7221-59e461e3f3ef")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Instancia del Conjunto de Atributos";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="@C_Charge_ID@!0",IsIdentifier=false,SeqNo=0,
IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2aab15e1-82b5-d74d-7221-59e461e3f3ef",
Synchronized="2020-03-03 21:37:02.0")
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
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

@XendraTrl(Identifier="7ca07b68-2feb-1ff7-8b51-ef9f868ba8c1")
public static String es_PE_FIELD_InvoiceLine_ShipmentReceiptLine_Name="Entrega / Recibo";

@XendraTrl(Identifier="7ca07b68-2feb-1ff7-8b51-ef9f868ba8c1")
public static String es_PE_FIELD_InvoiceLine_ShipmentReceiptLine_Description="Línea de entrega ó documento de recibo.";

@XendraTrl(Identifier="7ca07b68-2feb-1ff7-8b51-ef9f868ba8c1")
public static String es_PE_FIELD_InvoiceLine_ShipmentReceiptLine_Help="La línea de Entrega / Recibo indica una línea única en un documento de entrega / recibo";

@XendraField(AD_Column_ID="M_InOutLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7ca07b68-2feb-1ff7-8b51-ef9f868ba8c1")
public static final String FIELDNAME_InvoiceLine_ShipmentReceiptLine="7ca07b68-2feb-1ff7-8b51-ef9f868ba8c1";

@XendraTrl(Identifier="70184283-ae9d-0e9e-cba3-675e4f1e8f4d")
public static String es_PE_FIELD_InvoiceLine_ReceiptLine_Name="Entrega / Recibo";

@XendraTrl(Identifier="70184283-ae9d-0e9e-cba3-675e4f1e8f4d")
public static String es_PE_FIELD_InvoiceLine_ReceiptLine_Description="Línea de entrega ó documento de recibo.";

@XendraTrl(Identifier="70184283-ae9d-0e9e-cba3-675e4f1e8f4d")
public static String es_PE_FIELD_InvoiceLine_ReceiptLine_Help="La línea de Entrega / Recibo indica una línea única en un documento de entrega / recibo";

@XendraField(AD_Column_ID="M_InOutLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="70184283-ae9d-0e9e-cba3-675e4f1e8f4d")
public static final String FIELDNAME_InvoiceLine_ReceiptLine="70184283-ae9d-0e9e-cba3-675e4f1e8f4d";

@XendraTrl(Identifier="06c7f9b2-828b-8d8b-48ad-dbf2ac7be4e6")
public static String es_PE_FIELD_IncludedLines_ReceiptLine_Name="Item Entrega / Recibo";

@XendraTrl(Identifier="06c7f9b2-828b-8d8b-48ad-dbf2ac7be4e6")
public static String es_PE_FIELD_IncludedLines_ReceiptLine_Description="Item de entrega ó documento de recibo.";

@XendraTrl(Identifier="06c7f9b2-828b-8d8b-48ad-dbf2ac7be4e6")
public static String es_PE_FIELD_IncludedLines_ReceiptLine_Help="Indica un Item único en un documento de entrega / recibo";

@XendraField(AD_Column_ID="M_InOutLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6d5404fc-e047-c0ee-8a64-c457419e045c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="06c7f9b2-828b-8d8b-48ad-dbf2ac7be4e6")
public static final String FIELDNAME_IncludedLines_ReceiptLine="06c7f9b2-828b-8d8b-48ad-dbf2ac7be4e6";

@XendraTrl(Identifier="8be7e607-df29-4296-9792-1530e39b6b45")
public static String es_PE_FIELD_InvoiceLine_ShipmentReceiptLine2_Name="Item Entrega / Recibo";

@XendraTrl(Identifier="8be7e607-df29-4296-9792-1530e39b6b45")
public static String es_PE_FIELD_InvoiceLine_ShipmentReceiptLine2_Description="Item de entrega ó documento de recibo.";

@XendraTrl(Identifier="8be7e607-df29-4296-9792-1530e39b6b45")
public static String es_PE_FIELD_InvoiceLine_ShipmentReceiptLine2_Help="Indica un Item único en un documento de entrega / recibo";

@XendraField(AD_Column_ID="M_InOutLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="90f8b518-7f5c-9bae-ad70-c719b8e5c310",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8be7e607-df29-4296-9792-1530e39b6b45")
public static final String FIELDNAME_InvoiceLine_ShipmentReceiptLine2="8be7e607-df29-4296-9792-1530e39b6b45";

@XendraTrl(Identifier="d82d70b9-54bb-088c-2fdd-0dc4310dd638")
public static String es_PE_COLUMN_M_InOutLine_ID_Name="Línea Entrega / Recibo";

@XendraColumn(AD_Element_ID="a4d9928e-fbec-fd6c-b061-d3dbbd7de02c",ColumnName="M_InOutLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d82d70b9-54bb-088c-2fdd-0dc4310dd638",
Synchronized="2020-03-03 21:37:02.0")
/** Column name M_InOutLine_ID */
public static final String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID <= 0) set_Value (COLUMNNAME_M_Product_ID, null);
 else 
set_Value (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
}
/** Get Product.
@return Product, Service, Item */
public int getM_Product_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b5034553-0923-8101-dab6-42ecf57e31d7")
public static String es_PE_FIELD_InvoiceLine_Product_Name="Producto";

@XendraTrl(Identifier="b5034553-0923-8101-dab6-42ecf57e31d7")
public static String es_PE_FIELD_InvoiceLine_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="b5034553-0923-8101-dab6-42ecf57e31d7")
public static String es_PE_FIELD_InvoiceLine_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b5034553-0923-8101-dab6-42ecf57e31d7")
public static final String FIELDNAME_InvoiceLine_Product="b5034553-0923-8101-dab6-42ecf57e31d7";

@XendraTrl(Identifier="a90c74dd-d2a4-ea19-29b7-1ca8c811ffee")
public static String es_PE_FIELD_InvoiceLine_Product2_Name="Producto";

@XendraTrl(Identifier="a90c74dd-d2a4-ea19-29b7-1ca8c811ffee")
public static String es_PE_FIELD_InvoiceLine_Product2_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="a90c74dd-d2a4-ea19-29b7-1ca8c811ffee")
public static String es_PE_FIELD_InvoiceLine_Product2_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a90c74dd-d2a4-ea19-29b7-1ca8c811ffee")
public static final String FIELDNAME_InvoiceLine_Product2="a90c74dd-d2a4-ea19-29b7-1ca8c811ffee";

@XendraTrl(Identifier="f2e1ae86-1521-4593-155b-a4178a7a0b07")
public static String es_PE_FIELD_IncludedLines_Product_Name="Producto";

@XendraTrl(Identifier="f2e1ae86-1521-4593-155b-a4178a7a0b07")
public static String es_PE_FIELD_IncludedLines_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="f2e1ae86-1521-4593-155b-a4178a7a0b07")
public static String es_PE_FIELD_IncludedLines_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6d5404fc-e047-c0ee-8a64-c457419e045c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f2e1ae86-1521-4593-155b-a4178a7a0b07")
public static final String FIELDNAME_IncludedLines_Product="f2e1ae86-1521-4593-155b-a4178a7a0b07";

@XendraTrl(Identifier="5cddae11-9130-4b3c-2737-1f8966af4713")
public static String es_PE_FIELD_InvoiceLine_Product3_Name="Producto";

@XendraTrl(Identifier="5cddae11-9130-4b3c-2737-1f8966af4713")
public static String es_PE_FIELD_InvoiceLine_Product3_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="5cddae11-9130-4b3c-2737-1f8966af4713")
public static String es_PE_FIELD_InvoiceLine_Product3_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="90f8b518-7f5c-9bae-ad70-c719b8e5c310",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5cddae11-9130-4b3c-2737-1f8966af4713")
public static final String FIELDNAME_InvoiceLine_Product3="5cddae11-9130-4b3c-2737-1f8966af4713";

@XendraTrl(Identifier="1d3946ca-8099-b365-121e-97b26f8d6536")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="@S_ResourceAssignment_ID@!0 | @C_Charge_ID@!0",IsIdentifier=false,
SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutInvoice.product",VFormat="",
ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="1d3946ca-8099-b365-121e-97b26f8d6536",Synchronized="2020-03-03 21:37:02.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set RMA Line.
@param M_RMALine_ID Return Material Authorization Line */
public void setM_RMALine_ID (int M_RMALine_ID)
{
if (M_RMALine_ID <= 0) set_Value (COLUMNNAME_M_RMALine_ID, null);
 else 
set_Value (COLUMNNAME_M_RMALine_ID, Integer.valueOf(M_RMALine_ID));
}
/** Get RMA Line.
@return Return Material Authorization Line */
public int getM_RMALine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_RMALine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e41fc777-a7c9-9e96-7036-6cb97e70a33e")
public static String es_PE_FIELD_InvoiceLine_RMALine_Name="Línea ADM (RMA)";

@XendraTrl(Identifier="e41fc777-a7c9-9e96-7036-6cb97e70a33e")
public static String es_PE_FIELD_InvoiceLine_RMALine_Description="Línea Autorización de Devolución de Material";

@XendraTrl(Identifier="e41fc777-a7c9-9e96-7036-6cb97e70a33e")
public static String es_PE_FIELD_InvoiceLine_RMALine_Help="Información del detalle sobre las mercancías devueltas";

@XendraField(AD_Column_ID="M_RMALine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e41fc777-a7c9-9e96-7036-6cb97e70a33e")
public static final String FIELDNAME_InvoiceLine_RMALine="e41fc777-a7c9-9e96-7036-6cb97e70a33e";

@XendraTrl(Identifier="4aa8cf13-89a2-265a-ff93-68ef748eb398")
public static String es_PE_FIELD_InvoiceLine_RMALine2_Name="Línea ADM (RMA)";

@XendraTrl(Identifier="4aa8cf13-89a2-265a-ff93-68ef748eb398")
public static String es_PE_FIELD_InvoiceLine_RMALine2_Description="Línea Autorización de Devolución de Material";

@XendraTrl(Identifier="4aa8cf13-89a2-265a-ff93-68ef748eb398")
public static String es_PE_FIELD_InvoiceLine_RMALine2_Help="Información del detalle sobre las mercancías devueltas";

@XendraField(AD_Column_ID="M_RMALine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4aa8cf13-89a2-265a-ff93-68ef748eb398")
public static final String FIELDNAME_InvoiceLine_RMALine2="4aa8cf13-89a2-265a-ff93-68ef748eb398";

@XendraTrl(Identifier="7c7549ba-5406-6cec-9947-1c5d852d9ea1")
public static String es_PE_COLUMN_M_RMALine_ID_Name="Línea ADM (RMA)";

@XendraColumn(AD_Element_ID="e0f0ae49-188f-5578-c173-f836bc2ece2e",ColumnName="M_RMALine_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7c7549ba-5406-6cec-9947-1c5d852d9ea1",
Synchronized="2020-03-03 21:37:02.0")
/** Column name M_RMALine_ID */
public static final String COLUMNNAME_M_RMALine_ID = "M_RMALine_ID";
/** Set PriceAcquisition.
@param PriceAcquisition PriceAcquisition */
public void setPriceAcquisition (BigDecimal PriceAcquisition)
{
set_Value (COLUMNNAME_PriceAcquisition, PriceAcquisition);
}
/** Get PriceAcquisition.
@return PriceAcquisition */
public BigDecimal getPriceAcquisition() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceAcquisition);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="b154e525-e07c-c542-2a91-fc03e28ccfab")
public static String es_PE_FIELD_InvoiceLine_PriceAcquisition_Name="PriceAcquisition";

@XendraField(AD_Column_ID="PriceAcquisition",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b154e525-e07c-c542-2a91-fc03e28ccfab")
public static final String FIELDNAME_InvoiceLine_PriceAcquisition="b154e525-e07c-c542-2a91-fc03e28ccfab";

@XendraTrl(Identifier="81b5fa07-9f52-165e-6863-f817b41ccc70")
public static String es_PE_FIELD_InvoiceLine_PriceAcquisition2_Name="Precio Final";

@XendraField(AD_Column_ID="PriceAcquisition",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=270,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="81b5fa07-9f52-165e-6863-f817b41ccc70")
public static final String FIELDNAME_InvoiceLine_PriceAcquisition2="81b5fa07-9f52-165e-6863-f817b41ccc70";

@XendraTrl(Identifier="773b12b4-b24f-7565-0fa8-dcbaeb017233")
public static String es_PE_COLUMN_PriceAcquisition_Name="PriceAcquisition";

@XendraColumn(AD_Element_ID="646f765c-eaa2-f974-85cd-df7e3e16c293",ColumnName="PriceAcquisition",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="773b12b4-b24f-7565-0fa8-dcbaeb017233",
Synchronized="2020-03-03 21:37:02.0")
/** Column name PriceAcquisition */
public static final String COLUMNNAME_PriceAcquisition = "PriceAcquisition";
/** Set Unit Price.
@param PriceActual Actual Price  */
public void setPriceActual (BigDecimal PriceActual)
{
if (PriceActual == null) throw new IllegalArgumentException ("PriceActual is mandatory.");
set_ValueNoCheck (COLUMNNAME_PriceActual, PriceActual);
}
/** Get Unit Price.
@return Actual Price  */
public BigDecimal getPriceActual() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceActual);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="94a25f18-a4b6-0a92-a5d1-84e09c973a5d")
public static String es_PE_FIELD_InvoiceLine_UnitPrice_Name="Precio Actual";

@XendraTrl(Identifier="94a25f18-a4b6-0a92-a5d1-84e09c973a5d")
public static String es_PE_FIELD_InvoiceLine_UnitPrice_Description="Precio Actual";

@XendraTrl(Identifier="94a25f18-a4b6-0a92-a5d1-84e09c973a5d")
public static String es_PE_FIELD_InvoiceLine_UnitPrice_Help="El precio Actual ó Unitario indica el precio para un producto en la moneda fuente.";

@XendraField(AD_Column_ID="PriceActual",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="Amounts",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="94a25f18-a4b6-0a92-a5d1-84e09c973a5d")
public static final String FIELDNAME_InvoiceLine_UnitPrice="94a25f18-a4b6-0a92-a5d1-84e09c973a5d";

@XendraTrl(Identifier="840fb3dc-8cbe-3b37-113d-5c7c82838ced")
public static String es_PE_FIELD_InvoiceLine_UnitPrice2_Name="Precio Actual";

@XendraTrl(Identifier="840fb3dc-8cbe-3b37-113d-5c7c82838ced")
public static String es_PE_FIELD_InvoiceLine_UnitPrice2_Description="Precio Actual";

@XendraTrl(Identifier="840fb3dc-8cbe-3b37-113d-5c7c82838ced")
public static String es_PE_FIELD_InvoiceLine_UnitPrice2_Help="El precio Actual ó Unitario indica el precio para un producto en la moneda fuente.";

@XendraField(AD_Column_ID="PriceActual",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="Amounts",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="840fb3dc-8cbe-3b37-113d-5c7c82838ced")
public static final String FIELDNAME_InvoiceLine_UnitPrice2="840fb3dc-8cbe-3b37-113d-5c7c82838ced";

@XendraTrl(Identifier="783433ab-fa99-a764-bd45-ada6608ab90b")
public static String es_PE_FIELD_IncludedLines_UnitPrice_Name="Precio Actual";

@XendraTrl(Identifier="783433ab-fa99-a764-bd45-ada6608ab90b")
public static String es_PE_FIELD_IncludedLines_UnitPrice_Description="Precio Actual";

@XendraTrl(Identifier="783433ab-fa99-a764-bd45-ada6608ab90b")
public static String es_PE_FIELD_IncludedLines_UnitPrice_Help="El precio Actual ó Unitario indica el precio para un producto en la moneda fuente.";

@XendraField(AD_Column_ID="PriceActual",IsCentrallyMaintained=true,
AD_Tab_ID="6d5404fc-e047-c0ee-8a64-c457419e045c",AD_FieldGroup_ID="Amounts",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="783433ab-fa99-a764-bd45-ada6608ab90b")
public static final String FIELDNAME_IncludedLines_UnitPrice="783433ab-fa99-a764-bd45-ada6608ab90b";

@XendraTrl(Identifier="4fe34680-ba86-52be-95cf-d9d452be5df8")
public static String es_PE_FIELD_InvoiceLine_UnitPrice3_Name="Precio Actual";

@XendraTrl(Identifier="4fe34680-ba86-52be-95cf-d9d452be5df8")
public static String es_PE_FIELD_InvoiceLine_UnitPrice3_Description="Precio Actual";

@XendraTrl(Identifier="4fe34680-ba86-52be-95cf-d9d452be5df8")
public static String es_PE_FIELD_InvoiceLine_UnitPrice3_Help="El precio Actual ó Unitario indica el precio para un producto en la moneda fuente.";

@XendraField(AD_Column_ID="PriceActual",IsCentrallyMaintained=true,
AD_Tab_ID="90f8b518-7f5c-9bae-ad70-c719b8e5c310",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4fe34680-ba86-52be-95cf-d9d452be5df8")
public static final String FIELDNAME_InvoiceLine_UnitPrice3="4fe34680-ba86-52be-95cf-d9d452be5df8";

@XendraTrl(Identifier="4d5549d4-19d1-4215-a58e-def3a9acf6ab")
public static String es_PE_COLUMN_PriceActual_Name="Precio Actual";

@XendraColumn(AD_Element_ID="8ee15d33-8f4b-598f-dc4c-9d67f968a13c",ColumnName="PriceActual",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutInvoice.amt",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4d5549d4-19d1-4215-a58e-def3a9acf6ab",Synchronized="2020-03-03 21:37:02.0")
/** Column name PriceActual */
public static final String COLUMNNAME_PriceActual = "PriceActual";
/** Set PriceBase.
@param PriceBase PriceBase */
public void setPriceBase (BigDecimal PriceBase)
{
set_Value (COLUMNNAME_PriceBase, PriceBase);
}
/** Get PriceBase.
@return PriceBase */
public BigDecimal getPriceBase() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceBase);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="79a59e7b-0975-b815-544a-e6263766c697")
public static String es_PE_FIELD_InvoiceLine_PriceBase_Name="Precio base";

@XendraField(AD_Column_ID="PriceBase",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="79a59e7b-0975-b815-544a-e6263766c697")
public static final String FIELDNAME_InvoiceLine_PriceBase="79a59e7b-0975-b815-544a-e6263766c697";

@XendraTrl(Identifier="3dc5c5de-db9c-743a-0023-a1930ac4ee8f")
public static String es_PE_FIELD_InvoiceLine_PriceBase2_Name="PriceBase";

@XendraField(AD_Column_ID="PriceBase",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=330,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3dc5c5de-db9c-743a-0023-a1930ac4ee8f")
public static final String FIELDNAME_InvoiceLine_PriceBase2="3dc5c5de-db9c-743a-0023-a1930ac4ee8f";

@XendraTrl(Identifier="4b884dc5-ebc3-7327-884b-5783d4d1c41c")
public static String es_PE_COLUMN_PriceBase_Name="PriceBase";

@XendraColumn(AD_Element_ID="2342314a-e1c4-dc0e-b83e-ec9a9a83fd0a",ColumnName="PriceBase",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4b884dc5-ebc3-7327-884b-5783d4d1c41c",
Synchronized="2020-03-03 21:37:02.0")
/** Column name PriceBase */
public static final String COLUMNNAME_PriceBase = "PriceBase";
/** Set Price.
@param PriceEntered Price Entered - the price based on the selected/base UoM */
public void setPriceEntered (BigDecimal PriceEntered)
{
if (PriceEntered == null) throw new IllegalArgumentException ("PriceEntered is mandatory.");
set_Value (COLUMNNAME_PriceEntered, PriceEntered);
}
/** Get Price.
@return Price Entered - the price based on the selected/base UoM */
public BigDecimal getPriceEntered() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceEntered);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="3dc13ba1-c1ec-2777-f0f0-dd3b6b69448a")
public static String es_PE_FIELD_InvoiceLine_Price_Name="Precio";

@XendraTrl(Identifier="3dc13ba1-c1ec-2777-f0f0-dd3b6b69448a")
public static String es_PE_FIELD_InvoiceLine_Price_Description="Precio cargado - El Precio esta basado en la selección de UM";

@XendraTrl(Identifier="3dc13ba1-c1ec-2777-f0f0-dd3b6b69448a")
public static String es_PE_FIELD_InvoiceLine_Price_Help="El precio incorporado es convertido al precio real basado en la conversión de UM";

@XendraField(AD_Column_ID="PriceEntered",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="Amounts",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3dc13ba1-c1ec-2777-f0f0-dd3b6b69448a")
public static final String FIELDNAME_InvoiceLine_Price="3dc13ba1-c1ec-2777-f0f0-dd3b6b69448a";

@XendraTrl(Identifier="7f672e77-b4b2-238a-d379-cda130e683a3")
public static String es_PE_FIELD_InvoiceLine_Price2_Name="Precio";

@XendraTrl(Identifier="7f672e77-b4b2-238a-d379-cda130e683a3")
public static String es_PE_FIELD_InvoiceLine_Price2_Description="Precio cargado - El Precio esta basado en la selección de UM";

@XendraTrl(Identifier="7f672e77-b4b2-238a-d379-cda130e683a3")
public static String es_PE_FIELD_InvoiceLine_Price2_Help="El precio incorporado es convertido al precio real basado en la conversión de UM";

@XendraField(AD_Column_ID="PriceEntered",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="Amounts",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7f672e77-b4b2-238a-d379-cda130e683a3")
public static final String FIELDNAME_InvoiceLine_Price2="7f672e77-b4b2-238a-d379-cda130e683a3";

@XendraTrl(Identifier="6dfc5ada-52d4-82a7-bef8-7d07ec5b9ab2")
public static String es_PE_FIELD_IncludedLines_Price_Name="Precio";

@XendraTrl(Identifier="6dfc5ada-52d4-82a7-bef8-7d07ec5b9ab2")
public static String es_PE_FIELD_IncludedLines_Price_Description="Precio cargado - El Precio esta basado en la selección de UM";

@XendraTrl(Identifier="6dfc5ada-52d4-82a7-bef8-7d07ec5b9ab2")
public static String es_PE_FIELD_IncludedLines_Price_Help="El precio incorporado es convertido al precio real basado en la conversión de UM";

@XendraField(AD_Column_ID="PriceEntered",IsCentrallyMaintained=true,
AD_Tab_ID="6d5404fc-e047-c0ee-8a64-c457419e045c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6dfc5ada-52d4-82a7-bef8-7d07ec5b9ab2")
public static final String FIELDNAME_IncludedLines_Price="6dfc5ada-52d4-82a7-bef8-7d07ec5b9ab2";

@XendraTrl(Identifier="ae5961b2-c2a1-63fe-01d8-4a921e97e5c0")
public static String es_PE_FIELD_InvoiceLine_Price3_Name="Precio";

@XendraTrl(Identifier="ae5961b2-c2a1-63fe-01d8-4a921e97e5c0")
public static String es_PE_FIELD_InvoiceLine_Price3_Description="Precio cargado - El Precio esta basado en la selección de UM";

@XendraTrl(Identifier="ae5961b2-c2a1-63fe-01d8-4a921e97e5c0")
public static String es_PE_FIELD_InvoiceLine_Price3_Help="El precio incorporado es convertido al precio real basado en la conversión de UM";

@XendraField(AD_Column_ID="PriceEntered",IsCentrallyMaintained=true,
AD_Tab_ID="90f8b518-7f5c-9bae-ad70-c719b8e5c310",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ae5961b2-c2a1-63fe-01d8-4a921e97e5c0")
public static final String FIELDNAME_InvoiceLine_Price3="ae5961b2-c2a1-63fe-01d8-4a921e97e5c0";

@XendraTrl(Identifier="680ef245-a744-8781-fcef-fc4e0cc03da3")
public static String es_PE_COLUMN_PriceEntered_Name="Precio";

@XendraColumn(AD_Element_ID="c0a272c7-da17-7089-b9a4-6aeab9e222ef",ColumnName="PriceEntered",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutInvoice.amt",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="680ef245-a744-8781-fcef-fc4e0cc03da3",Synchronized="2020-03-03 21:37:02.0")
/** Column name PriceEntered */
public static final String COLUMNNAME_PriceEntered = "PriceEntered";
/** Set Limit Price.
@param PriceLimit Lowest price for a product */
public void setPriceLimit (BigDecimal PriceLimit)
{
if (PriceLimit == null) throw new IllegalArgumentException ("PriceLimit is mandatory.");
set_Value (COLUMNNAME_PriceLimit, PriceLimit);
}
/** Get Limit Price.
@return Lowest price for a product */
public BigDecimal getPriceLimit() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceLimit);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="2ce13190-7c51-6a37-ff34-0b807832bb9a")
public static String es_PE_FIELD_InvoiceLine_LimitPrice_Name="Precio Límite";

@XendraTrl(Identifier="2ce13190-7c51-6a37-ff34-0b807832bb9a")
public static String es_PE_FIELD_InvoiceLine_LimitPrice_Description="Precio más bajo del producto";

@XendraTrl(Identifier="2ce13190-7c51-6a37-ff34-0b807832bb9a")
public static String es_PE_FIELD_InvoiceLine_LimitPrice_Help="El límite de precio indica el precio más bajo para un producto establecido en la moneda de la lista de precio.";

@XendraField(AD_Column_ID="PriceLimit",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="Amounts",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2ce13190-7c51-6a37-ff34-0b807832bb9a")
public static final String FIELDNAME_InvoiceLine_LimitPrice="2ce13190-7c51-6a37-ff34-0b807832bb9a";

@XendraTrl(Identifier="a88db4ad-a9b0-0fc2-09db-d52e3ddaa2c5")
public static String es_PE_FIELD_InvoiceLine_LimitPrice2_Name="Precio Límite";

@XendraTrl(Identifier="a88db4ad-a9b0-0fc2-09db-d52e3ddaa2c5")
public static String es_PE_FIELD_InvoiceLine_LimitPrice2_Description="Precio más bajo del producto";

@XendraTrl(Identifier="a88db4ad-a9b0-0fc2-09db-d52e3ddaa2c5")
public static String es_PE_FIELD_InvoiceLine_LimitPrice2_Help="El límite de precio indica el precio más bajo para un producto establecido en la moneda de la lista de precio.";

@XendraField(AD_Column_ID="PriceLimit",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="Amounts",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a88db4ad-a9b0-0fc2-09db-d52e3ddaa2c5")
public static final String FIELDNAME_InvoiceLine_LimitPrice2="a88db4ad-a9b0-0fc2-09db-d52e3ddaa2c5";

@XendraTrl(Identifier="8dc266a8-0c27-b10f-1e52-ec4cfbcfe4e7")
public static String es_PE_FIELD_IncludedLines_LimitPrice_Name="Precio Límite";

@XendraTrl(Identifier="8dc266a8-0c27-b10f-1e52-ec4cfbcfe4e7")
public static String es_PE_FIELD_IncludedLines_LimitPrice_Description="Precio más bajo del producto";

@XendraTrl(Identifier="8dc266a8-0c27-b10f-1e52-ec4cfbcfe4e7")
public static String es_PE_FIELD_IncludedLines_LimitPrice_Help="El límite de precio indica el precio más bajo para un producto establecido en la moneda de la lista de precio.";

@XendraField(AD_Column_ID="PriceLimit",IsCentrallyMaintained=true,
AD_Tab_ID="6d5404fc-e047-c0ee-8a64-c457419e045c",AD_FieldGroup_ID="Amounts",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8dc266a8-0c27-b10f-1e52-ec4cfbcfe4e7")
public static final String FIELDNAME_IncludedLines_LimitPrice="8dc266a8-0c27-b10f-1e52-ec4cfbcfe4e7";

@XendraTrl(Identifier="30ecccbf-636d-3c6c-06f2-584921a775a1")
public static String es_PE_FIELD_InvoiceLine_LimitPrice3_Name="Precio Límite";

@XendraTrl(Identifier="30ecccbf-636d-3c6c-06f2-584921a775a1")
public static String es_PE_FIELD_InvoiceLine_LimitPrice3_Description="Precio más bajo del producto";

@XendraTrl(Identifier="30ecccbf-636d-3c6c-06f2-584921a775a1")
public static String es_PE_FIELD_InvoiceLine_LimitPrice3_Help="El límite de precio indica el precio más bajo para un producto establecido en la moneda de la lista de precio.";

@XendraField(AD_Column_ID="PriceLimit",IsCentrallyMaintained=true,
AD_Tab_ID="90f8b518-7f5c-9bae-ad70-c719b8e5c310",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="30ecccbf-636d-3c6c-06f2-584921a775a1")
public static final String FIELDNAME_InvoiceLine_LimitPrice3="30ecccbf-636d-3c6c-06f2-584921a775a1";

@XendraTrl(Identifier="6e64b76e-2277-d239-f36d-229c24fbf080")
public static String es_PE_COLUMN_PriceLimit_Name="Precio Límite";

@XendraColumn(AD_Element_ID="0dbee629-4878-ced9-eafa-0f6bdfb99af4",ColumnName="PriceLimit",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6e64b76e-2277-d239-f36d-229c24fbf080",
Synchronized="2020-03-03 21:37:02.0")
/** Column name PriceLimit */
public static final String COLUMNNAME_PriceLimit = "PriceLimit";
/** Set List Price.
@param PriceList List Price */
public void setPriceList (BigDecimal PriceList)
{
if (PriceList == null) throw new IllegalArgumentException ("PriceList is mandatory.");
set_Value (COLUMNNAME_PriceList, PriceList);
}
/** Get List Price.
@return List Price */
public BigDecimal getPriceList() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceList);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="7fd9de17-df8c-ccc2-69cc-bf934b53eaeb")
public static String es_PE_FIELD_InvoiceLine_ListPrice_Name="Precio de Lista";

@XendraTrl(Identifier="7fd9de17-df8c-ccc2-69cc-bf934b53eaeb")
public static String es_PE_FIELD_InvoiceLine_ListPrice_Description="Precio de Lista";

@XendraTrl(Identifier="7fd9de17-df8c-ccc2-69cc-bf934b53eaeb")
public static String es_PE_FIELD_InvoiceLine_ListPrice_Help="El Precio de lista es el precio de lista oficial en la moneda del documento";

@XendraField(AD_Column_ID="PriceList",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="Amounts",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7fd9de17-df8c-ccc2-69cc-bf934b53eaeb")
public static final String FIELDNAME_InvoiceLine_ListPrice="7fd9de17-df8c-ccc2-69cc-bf934b53eaeb";

@XendraTrl(Identifier="6157f114-cf93-6ed3-0a16-3a148c81c218")
public static String es_PE_FIELD_InvoiceLine_ListPrice2_Name="Precio de Lista";

@XendraTrl(Identifier="6157f114-cf93-6ed3-0a16-3a148c81c218")
public static String es_PE_FIELD_InvoiceLine_ListPrice2_Description="Precio de Lista";

@XendraTrl(Identifier="6157f114-cf93-6ed3-0a16-3a148c81c218")
public static String es_PE_FIELD_InvoiceLine_ListPrice2_Help="El Precio de lista es el precio de lista oficial en la moneda del documento";

@XendraField(AD_Column_ID="PriceList",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="Amounts",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6157f114-cf93-6ed3-0a16-3a148c81c218")
public static final String FIELDNAME_InvoiceLine_ListPrice2="6157f114-cf93-6ed3-0a16-3a148c81c218";

@XendraTrl(Identifier="99eb3cb7-a3ad-f281-7687-7483c96da099")
public static String es_PE_FIELD_IncludedLines_ListPrice_Name="Precio de Lista";

@XendraTrl(Identifier="99eb3cb7-a3ad-f281-7687-7483c96da099")
public static String es_PE_FIELD_IncludedLines_ListPrice_Description="Precio de Lista";

@XendraTrl(Identifier="99eb3cb7-a3ad-f281-7687-7483c96da099")
public static String es_PE_FIELD_IncludedLines_ListPrice_Help="El Precio de lista es el precio de lista oficial en la moneda del documento";

@XendraField(AD_Column_ID="PriceList",IsCentrallyMaintained=true,
AD_Tab_ID="6d5404fc-e047-c0ee-8a64-c457419e045c",AD_FieldGroup_ID="Amounts",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="99eb3cb7-a3ad-f281-7687-7483c96da099")
public static final String FIELDNAME_IncludedLines_ListPrice="99eb3cb7-a3ad-f281-7687-7483c96da099";

@XendraTrl(Identifier="ad07d7a4-bdf5-c24c-85ee-d0cbe91e7698")
public static String es_PE_FIELD_InvoiceLine_ListPrice3_Name="Precio de Lista";

@XendraTrl(Identifier="ad07d7a4-bdf5-c24c-85ee-d0cbe91e7698")
public static String es_PE_FIELD_InvoiceLine_ListPrice3_Description="Precio de Lista";

@XendraTrl(Identifier="ad07d7a4-bdf5-c24c-85ee-d0cbe91e7698")
public static String es_PE_FIELD_InvoiceLine_ListPrice3_Help="El Precio de lista es el precio de lista oficial en la moneda del documento";

@XendraField(AD_Column_ID="PriceList",IsCentrallyMaintained=true,
AD_Tab_ID="90f8b518-7f5c-9bae-ad70-c719b8e5c310",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ad07d7a4-bdf5-c24c-85ee-d0cbe91e7698")
public static final String FIELDNAME_InvoiceLine_ListPrice3="ad07d7a4-bdf5-c24c-85ee-d0cbe91e7698";

@XendraTrl(Identifier="0fc93a73-5944-052f-4f11-a54f9601db88")
public static String es_PE_COLUMN_PriceList_Name="Precio de Lista";

@XendraColumn(AD_Element_ID="0f6529f2-0ceb-0583-6c50-c04e6542c99b",ColumnName="PriceList",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0fc93a73-5944-052f-4f11-a54f9601db88",
Synchronized="2020-03-03 21:37:02.0")
/** Column name PriceList */
public static final String COLUMNNAME_PriceList = "PriceList";
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

@XendraTrl(Identifier="0cde0d36-fae8-a76b-c6e4-9ae6ab43c0d4")
public static String es_PE_FIELD_InvoiceLine_Processed_Name="Procesado";

@XendraTrl(Identifier="0cde0d36-fae8-a76b-c6e4-9ae6ab43c0d4")
public static String es_PE_FIELD_InvoiceLine_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="0cde0d36-fae8-a76b-c6e4-9ae6ab43c0d4")
public static String es_PE_FIELD_InvoiceLine_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0cde0d36-fae8-a76b-c6e4-9ae6ab43c0d4")
public static final String FIELDNAME_InvoiceLine_Processed="0cde0d36-fae8-a76b-c6e4-9ae6ab43c0d4";

@XendraTrl(Identifier="9ed3dd6b-b3fa-d75d-ab99-43a5ae14347e")
public static String es_PE_FIELD_InvoiceLine_Processed2_Name="Procesado";

@XendraTrl(Identifier="9ed3dd6b-b3fa-d75d-ab99-43a5ae14347e")
public static String es_PE_FIELD_InvoiceLine_Processed2_Description="El documento ha sido procesado";

@XendraTrl(Identifier="9ed3dd6b-b3fa-d75d-ab99-43a5ae14347e")
public static String es_PE_FIELD_InvoiceLine_Processed2_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9ed3dd6b-b3fa-d75d-ab99-43a5ae14347e")
public static final String FIELDNAME_InvoiceLine_Processed2="9ed3dd6b-b3fa-d75d-ab99-43a5ae14347e";

@XendraTrl(Identifier="2002f61c-341e-abe9-2ec9-fbbf5a725f71")
public static String es_PE_FIELD_IncludedLines_Processed_Name="Procesado";

@XendraTrl(Identifier="2002f61c-341e-abe9-2ec9-fbbf5a725f71")
public static String es_PE_FIELD_IncludedLines_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="2002f61c-341e-abe9-2ec9-fbbf5a725f71")
public static String es_PE_FIELD_IncludedLines_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="6d5404fc-e047-c0ee-8a64-c457419e045c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2002f61c-341e-abe9-2ec9-fbbf5a725f71")
public static final String FIELDNAME_IncludedLines_Processed="2002f61c-341e-abe9-2ec9-fbbf5a725f71";

@XendraTrl(Identifier="a42bfd11-5ca2-7f15-0c27-5688dc28d4c8")
public static String es_PE_FIELD_InvoiceLine_Processed3_Name="Procesado";

@XendraTrl(Identifier="a42bfd11-5ca2-7f15-0c27-5688dc28d4c8")
public static String es_PE_FIELD_InvoiceLine_Processed3_Description="El documento ha sido procesado";

@XendraTrl(Identifier="a42bfd11-5ca2-7f15-0c27-5688dc28d4c8")
public static String es_PE_FIELD_InvoiceLine_Processed3_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="90f8b518-7f5c-9bae-ad70-c719b8e5c310",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a42bfd11-5ca2-7f15-0c27-5688dc28d4c8")
public static final String FIELDNAME_InvoiceLine_Processed3="a42bfd11-5ca2-7f15-0c27-5688dc28d4c8";

@XendraTrl(Identifier="685a8b11-918d-58a0-7b82-e623f0939f02")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="685a8b11-918d-58a0-7b82-e623f0939f02",
Synchronized="2020-03-03 21:37:02.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set QtyBonus.
@param QtyBonus QtyBonus */
public void setQtyBonus (BigDecimal QtyBonus)
{
set_Value (COLUMNNAME_QtyBonus, QtyBonus);
}
/** Get QtyBonus.
@return QtyBonus */
public BigDecimal getQtyBonus() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyBonus);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="7b6d4f4a-44ed-29fe-5372-2a5002f5f495")
public static String es_PE_FIELD_InvoiceLine_QtyBonus_Name="Cantidad Bonificada";

@XendraField(AD_Column_ID="QtyBonus",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7b6d4f4a-44ed-29fe-5372-2a5002f5f495")
public static final String FIELDNAME_InvoiceLine_QtyBonus="7b6d4f4a-44ed-29fe-5372-2a5002f5f495";

@XendraTrl(Identifier="4f6d0770-b43b-f711-493a-732d7cdb9065")
public static String es_PE_FIELD_InvoiceLine_QtyBonus2_Name="Cantidad Bonificada";

@XendraField(AD_Column_ID="QtyBonus",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=280,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4f6d0770-b43b-f711-493a-732d7cdb9065")
public static final String FIELDNAME_InvoiceLine_QtyBonus2="4f6d0770-b43b-f711-493a-732d7cdb9065";

@XendraTrl(Identifier="91300024-179f-7099-0295-4d6409079bf6")
public static String es_PE_COLUMN_QtyBonus_Name="QtyBonus";

@XendraColumn(AD_Element_ID="6b9c3175-594a-52b1-5954-95db31e6038c",ColumnName="QtyBonus",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="91300024-179f-7099-0295-4d6409079bf6",
Synchronized="2020-03-03 21:37:02.0")
/** Column name QtyBonus */
public static final String COLUMNNAME_QtyBonus = "QtyBonus";
/** Set Quantity.
@param QtyEntered The Quantity Entered is based on the selected UoM */
public void setQtyEntered (BigDecimal QtyEntered)
{
if (QtyEntered == null) throw new IllegalArgumentException ("QtyEntered is mandatory.");
set_Value (COLUMNNAME_QtyEntered, QtyEntered);
}
/** Get Quantity.
@return The Quantity Entered is based on the selected UoM */
public BigDecimal getQtyEntered() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyEntered);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="bb25aeaa-f6c2-5e25-b70a-78492dbbb377")
public static String es_PE_FIELD_InvoiceLine_Quantity_Name="Cantidad";

@XendraTrl(Identifier="bb25aeaa-f6c2-5e25-b70a-78492dbbb377")
public static String es_PE_FIELD_InvoiceLine_Quantity_Description="La cantidad incorporada se basa en la UM seleccionada.";

@XendraTrl(Identifier="bb25aeaa-f6c2-5e25-b70a-78492dbbb377")
public static String es_PE_FIELD_InvoiceLine_Quantity_Help="La cantidad incorporada se convierte a la cantidad baja de UM del producto";

@XendraField(AD_Column_ID="QtyEntered",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="Quantities",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bb25aeaa-f6c2-5e25-b70a-78492dbbb377")
public static final String FIELDNAME_InvoiceLine_Quantity="bb25aeaa-f6c2-5e25-b70a-78492dbbb377";

@XendraTrl(Identifier="fb67353e-726a-ecb8-1e5b-7180e42c3074")
public static String es_PE_FIELD_InvoiceLine_Quantity2_Name="Cantidad";

@XendraTrl(Identifier="fb67353e-726a-ecb8-1e5b-7180e42c3074")
public static String es_PE_FIELD_InvoiceLine_Quantity2_Description="La cantidad incorporada se basa en la UM seleccionada.";

@XendraTrl(Identifier="fb67353e-726a-ecb8-1e5b-7180e42c3074")
public static String es_PE_FIELD_InvoiceLine_Quantity2_Help="La cantidad incorporada se convierte a la cantidad baja de UM del producto";

@XendraField(AD_Column_ID="QtyEntered",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="Quantities",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fb67353e-726a-ecb8-1e5b-7180e42c3074")
public static final String FIELDNAME_InvoiceLine_Quantity2="fb67353e-726a-ecb8-1e5b-7180e42c3074";

@XendraTrl(Identifier="8553b5cc-2e05-030a-ea0c-3501617c4a63")
public static String es_PE_FIELD_IncludedLines_Quantity_Name="Cantidad";

@XendraTrl(Identifier="8553b5cc-2e05-030a-ea0c-3501617c4a63")
public static String es_PE_FIELD_IncludedLines_Quantity_Description="La cantidad incorporada se basa en la UM seleccionada.";

@XendraTrl(Identifier="8553b5cc-2e05-030a-ea0c-3501617c4a63")
public static String es_PE_FIELD_IncludedLines_Quantity_Help="La cantidad incorporada se convierte a la cantidad baja de UM del producto";

@XendraField(AD_Column_ID="QtyEntered",IsCentrallyMaintained=true,
AD_Tab_ID="6d5404fc-e047-c0ee-8a64-c457419e045c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8553b5cc-2e05-030a-ea0c-3501617c4a63")
public static final String FIELDNAME_IncludedLines_Quantity="8553b5cc-2e05-030a-ea0c-3501617c4a63";

@XendraTrl(Identifier="3da75b23-5cab-e49c-948e-f0ade13d11d0")
public static String es_PE_FIELD_InvoiceLine_Quantity3_Name="Cantidad";

@XendraTrl(Identifier="3da75b23-5cab-e49c-948e-f0ade13d11d0")
public static String es_PE_FIELD_InvoiceLine_Quantity3_Description="La cantidad incorporada se basa en la UM seleccionada.";

@XendraTrl(Identifier="3da75b23-5cab-e49c-948e-f0ade13d11d0")
public static String es_PE_FIELD_InvoiceLine_Quantity3_Help="La cantidad incorporada se convierte a la cantidad baja de UM del producto";

@XendraField(AD_Column_ID="QtyEntered",IsCentrallyMaintained=true,
AD_Tab_ID="90f8b518-7f5c-9bae-ad70-c719b8e5c310",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3da75b23-5cab-e49c-948e-f0ade13d11d0")
public static final String FIELDNAME_InvoiceLine_Quantity3="3da75b23-5cab-e49c-948e-f0ade13d11d0";

@XendraTrl(Identifier="5f800bc8-6c02-6cdb-c84a-275f15b51470")
public static String es_PE_COLUMN_QtyEntered_Name="Cantidad";

@XendraColumn(AD_Element_ID="70a37b06-986d-bf01-1ef9-23e214211841",ColumnName="QtyEntered",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutInvoice.qty; org.compiere.model.CalloutInvoice.amt",VFormat="",
ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5f800bc8-6c02-6cdb-c84a-275f15b51470",Synchronized="2020-03-03 21:37:02.0")
/** Column name QtyEntered */
public static final String COLUMNNAME_QtyEntered = "QtyEntered";
/** Set Quantity Invoiced.
@param QtyInvoiced Invoiced Quantity */
public void setQtyInvoiced (BigDecimal QtyInvoiced)
{
if (QtyInvoiced == null) throw new IllegalArgumentException ("QtyInvoiced is mandatory.");
set_Value (COLUMNNAME_QtyInvoiced, QtyInvoiced);
}
/** Get Quantity Invoiced.
@return Invoiced Quantity */
public BigDecimal getQtyInvoiced() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyInvoiced);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="2481d5d4-adb1-154c-fd3f-c23ea591879c")
public static String es_PE_FIELD_InvoiceLine_QuantityInvoiced_Name="Cantidad Facturada";

@XendraTrl(Identifier="2481d5d4-adb1-154c-fd3f-c23ea591879c")
public static String es_PE_FIELD_InvoiceLine_QuantityInvoiced_Description="Cantidad facturada";

@XendraTrl(Identifier="2481d5d4-adb1-154c-fd3f-c23ea591879c")
public static String es_PE_FIELD_InvoiceLine_QuantityInvoiced_Help="La cantidad facturada indica la cantidad de un producto que ha sido facturado";

@XendraField(AD_Column_ID="QtyInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="Quantities",IsDisplayed=true,
DisplayLogic="@UOMConversion@=Y | @Processed@=Y",DisplayLength=26,IsReadOnly=false,SeqNo=110,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="2481d5d4-adb1-154c-fd3f-c23ea591879c")
public static final String FIELDNAME_InvoiceLine_QuantityInvoiced="2481d5d4-adb1-154c-fd3f-c23ea591879c";

@XendraTrl(Identifier="36ff872a-ed0b-cf26-d24c-10b21a6030ba")
public static String es_PE_FIELD_InvoiceLine_QuantityInvoiced2_Name="Cantidad Facturada";

@XendraTrl(Identifier="36ff872a-ed0b-cf26-d24c-10b21a6030ba")
public static String es_PE_FIELD_InvoiceLine_QuantityInvoiced2_Description="Cantidad facturada";

@XendraTrl(Identifier="36ff872a-ed0b-cf26-d24c-10b21a6030ba")
public static String es_PE_FIELD_InvoiceLine_QuantityInvoiced2_Help="La cantidad facturada indica la cantidad de un producto que ha sido facturado";

@XendraField(AD_Column_ID="QtyInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="Quantities",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="36ff872a-ed0b-cf26-d24c-10b21a6030ba")
public static final String FIELDNAME_InvoiceLine_QuantityInvoiced2="36ff872a-ed0b-cf26-d24c-10b21a6030ba";

@XendraTrl(Identifier="3d437af0-adae-6383-ca8d-579a8d8608cf")
public static String es_PE_FIELD_IncludedLines_QuantityInvoiced_Name="Cantidad Facturada";

@XendraTrl(Identifier="3d437af0-adae-6383-ca8d-579a8d8608cf")
public static String es_PE_FIELD_IncludedLines_QuantityInvoiced_Description="Cantidad facturada";

@XendraTrl(Identifier="3d437af0-adae-6383-ca8d-579a8d8608cf")
public static String es_PE_FIELD_IncludedLines_QuantityInvoiced_Help="La cantidad facturada indica la cantidad de un producto que ha sido facturado";

@XendraField(AD_Column_ID="QtyInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="6d5404fc-e047-c0ee-8a64-c457419e045c",AD_FieldGroup_ID="Quantities",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3d437af0-adae-6383-ca8d-579a8d8608cf")
public static final String FIELDNAME_IncludedLines_QuantityInvoiced="3d437af0-adae-6383-ca8d-579a8d8608cf";

@XendraTrl(Identifier="a6a0f1ed-6363-5fd8-8e40-6481856e3187")
public static String es_PE_FIELD_InvoiceLine_QuantityInvoiced3_Name="Cantidad Facturada";

@XendraTrl(Identifier="a6a0f1ed-6363-5fd8-8e40-6481856e3187")
public static String es_PE_FIELD_InvoiceLine_QuantityInvoiced3_Description="Cantidad facturada";

@XendraTrl(Identifier="a6a0f1ed-6363-5fd8-8e40-6481856e3187")
public static String es_PE_FIELD_InvoiceLine_QuantityInvoiced3_Help="La cantidad facturada indica la cantidad de un producto que ha sido facturado";

@XendraField(AD_Column_ID="QtyInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="90f8b518-7f5c-9bae-ad70-c719b8e5c310",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a6a0f1ed-6363-5fd8-8e40-6481856e3187")
public static final String FIELDNAME_InvoiceLine_QuantityInvoiced3="a6a0f1ed-6363-5fd8-8e40-6481856e3187";

@XendraTrl(Identifier="0045ade3-2b3b-90b4-bddc-2429fdeeb93e")
public static String es_PE_COLUMN_QtyInvoiced_Name="Cantidad Facturada";

@XendraColumn(AD_Element_ID="406c1301-33f0-3d6a-3fbc-b0cf44ccc5b3",ColumnName="QtyInvoiced",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutInvoice.qty; org.compiere.model.CalloutInvoice.amt",VFormat="",
ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0045ade3-2b3b-90b4-bddc-2429fdeeb93e",Synchronized="2020-03-03 21:37:03.0")
/** Column name QtyInvoiced */
public static final String COLUMNNAME_QtyInvoiced = "QtyInvoiced";
/** Set Referenced Invoice Line.
@param Ref_InvoiceLine_ID Referenced Invoice Line */
public void setRef_InvoiceLine_ID (int Ref_InvoiceLine_ID)
{
if (Ref_InvoiceLine_ID <= 0) set_Value (COLUMNNAME_Ref_InvoiceLine_ID, null);
 else 
set_Value (COLUMNNAME_Ref_InvoiceLine_ID, Integer.valueOf(Ref_InvoiceLine_ID));
}
/** Get Referenced Invoice Line.
@return Referenced Invoice Line */
public int getRef_InvoiceLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Ref_InvoiceLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e985a979-5d29-bce9-b6b1-5c3241dc2d51")
public static String es_PE_FIELD_InvoiceLine_ReferencedInvoiceLine_Name="Item de Referencia Factura";

@XendraField(AD_Column_ID="Ref_InvoiceLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e985a979-5d29-bce9-b6b1-5c3241dc2d51")
public static final String FIELDNAME_InvoiceLine_ReferencedInvoiceLine="e985a979-5d29-bce9-b6b1-5c3241dc2d51";

@XendraTrl(Identifier="3f7b4dfa-6327-3da3-3951-fb4eeaa8786e")
public static String es_PE_FIELD_InvoiceLine_ReferencedInvoiceLine2_Name="Item de Referencia Factura";

@XendraField(AD_Column_ID="Ref_InvoiceLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3f7b4dfa-6327-3da3-3951-fb4eeaa8786e")
public static final String FIELDNAME_InvoiceLine_ReferencedInvoiceLine2="3f7b4dfa-6327-3da3-3951-fb4eeaa8786e";

@XendraTrl(Identifier="051c1d30-dd0f-fda8-78a4-ca4eac2293be")
public static String es_PE_FIELD_IncludedLines_ReferencedInvoiceLine_Name="Item de Referencia Factura";

@XendraField(AD_Column_ID="Ref_InvoiceLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6d5404fc-e047-c0ee-8a64-c457419e045c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="051c1d30-dd0f-fda8-78a4-ca4eac2293be")
public static final String FIELDNAME_IncludedLines_ReferencedInvoiceLine="051c1d30-dd0f-fda8-78a4-ca4eac2293be";

@XendraTrl(Identifier="3aeb1d98-4cf6-4bd5-7800-0b058a4a865a")
public static String es_PE_FIELD_InvoiceLine_ReferencedInvoiceLine3_Name="Item de Referencia Factura";

@XendraField(AD_Column_ID="Ref_InvoiceLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="90f8b518-7f5c-9bae-ad70-c719b8e5c310",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3aeb1d98-4cf6-4bd5-7800-0b058a4a865a")
public static final String FIELDNAME_InvoiceLine_ReferencedInvoiceLine3="3aeb1d98-4cf6-4bd5-7800-0b058a4a865a";

@XendraTrl(Identifier="b4ee2d4c-d41f-8bca-f50e-68e8d2ea26e5")
public static String es_PE_COLUMN_Ref_InvoiceLine_ID_Name="Línea de Referencia Factura";

@XendraColumn(AD_Element_ID="22b9ee04-e24b-4a56-78a0-54b85fff4fe2",ColumnName="Ref_InvoiceLine_ID",
AD_Reference_ID=13,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b4ee2d4c-d41f-8bca-f50e-68e8d2ea26e5",
Synchronized="2020-03-03 21:37:03.0")
/** Column name Ref_InvoiceLine_ID */
public static final String COLUMNNAME_Ref_InvoiceLine_ID = "Ref_InvoiceLine_ID";
/** Set Revenue Recognition Amt.
@param RRAmt Revenue Recognition Amount */
public void setRRAmt (BigDecimal RRAmt)
{
set_Value (COLUMNNAME_RRAmt, RRAmt);
}
/** Get Revenue Recognition Amt.
@return Revenue Recognition Amount */
public BigDecimal getRRAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_RRAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="2732ab2f-e6d7-3973-78da-138155f36f52")
public static String es_PE_FIELD_InvoiceLine_RevenueRecognitionAmt_Name="Revenue Recognition Amt";

@XendraTrl(Identifier="2732ab2f-e6d7-3973-78da-138155f36f52")
public static String es_PE_FIELD_InvoiceLine_RevenueRecognitionAmt_Description="Revenue Recognition Amount";

@XendraTrl(Identifier="2732ab2f-e6d7-3973-78da-138155f36f52")
public static String es_PE_FIELD_InvoiceLine_RevenueRecognitionAmt_Help="The amount for revenue recognition calculation.  If empty, the complete invoice amount is used.  The difference between Revenue Recognition Amount and Invoice Line Net Amount is immediately recognized as revenue.";

@XendraField(AD_Column_ID="RRAmt",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2732ab2f-e6d7-3973-78da-138155f36f52")
public static final String FIELDNAME_InvoiceLine_RevenueRecognitionAmt="2732ab2f-e6d7-3973-78da-138155f36f52";

@XendraTrl(Identifier="46dc5f4c-c17d-929d-c60b-561b4ad93d79")
public static String es_PE_FIELD_InvoiceLine_RevenueRecognitionAmt2_Name="Revenue Recognition Amt";

@XendraTrl(Identifier="46dc5f4c-c17d-929d-c60b-561b4ad93d79")
public static String es_PE_FIELD_InvoiceLine_RevenueRecognitionAmt2_Description="Revenue Recognition Amount";

@XendraTrl(Identifier="46dc5f4c-c17d-929d-c60b-561b4ad93d79")
public static String es_PE_FIELD_InvoiceLine_RevenueRecognitionAmt2_Help="The amount for revenue recognition calculation.  If empty, the complete invoice amount is used.  The difference between Revenue Recognition Amount and Invoice Line Net Amount is immediately recognized as revenue.";

@XendraField(AD_Column_ID="RRAmt",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="46dc5f4c-c17d-929d-c60b-561b4ad93d79")
public static final String FIELDNAME_InvoiceLine_RevenueRecognitionAmt2="46dc5f4c-c17d-929d-c60b-561b4ad93d79";

@XendraTrl(Identifier="aa994290-1e3d-d2bc-9377-157106a56835")
public static String es_PE_COLUMN_RRAmt_Name="Revenue Recognition Amt";

@XendraColumn(AD_Element_ID="4c89d321-da8c-565e-c050-3172ca737c4b",ColumnName="RRAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aa994290-1e3d-d2bc-9377-157106a56835",
Synchronized="2020-03-03 21:37:03.0")
/** Column name RRAmt */
public static final String COLUMNNAME_RRAmt = "RRAmt";
/** Set Revenue Recognition Start.
@param RRStartDate Revenue Recognition Start Date */
public void setRRStartDate (Timestamp RRStartDate)
{
set_Value (COLUMNNAME_RRStartDate, RRStartDate);
}
/** Get Revenue Recognition Start.
@return Revenue Recognition Start Date */
public Timestamp getRRStartDate() 
{
return (Timestamp)get_Value(COLUMNNAME_RRStartDate);
}

@XendraTrl(Identifier="14902a6e-b941-dd6d-3daa-6c2a5d773a01")
public static String es_PE_FIELD_InvoiceLine_RevenueRecognitionStart_Name="Revenue Recognition Start";

@XendraTrl(Identifier="14902a6e-b941-dd6d-3daa-6c2a5d773a01")
public static String es_PE_FIELD_InvoiceLine_RevenueRecognitionStart_Description="Revenue Recognition Start Date";

@XendraTrl(Identifier="14902a6e-b941-dd6d-3daa-6c2a5d773a01")
public static String es_PE_FIELD_InvoiceLine_RevenueRecognitionStart_Help="The date the revenue reconition starts.";

@XendraField(AD_Column_ID="RRStartDate",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=7,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="14902a6e-b941-dd6d-3daa-6c2a5d773a01")
public static final String FIELDNAME_InvoiceLine_RevenueRecognitionStart="14902a6e-b941-dd6d-3daa-6c2a5d773a01";

@XendraTrl(Identifier="8fd64cd4-528d-fd92-d125-7ee7b1d55760")
public static String es_PE_FIELD_InvoiceLine_RevenueRecognitionStart2_Name="Revenue Recognition Start";

@XendraTrl(Identifier="8fd64cd4-528d-fd92-d125-7ee7b1d55760")
public static String es_PE_FIELD_InvoiceLine_RevenueRecognitionStart2_Description="Revenue Recognition Start Date";

@XendraTrl(Identifier="8fd64cd4-528d-fd92-d125-7ee7b1d55760")
public static String es_PE_FIELD_InvoiceLine_RevenueRecognitionStart2_Help="The date the revenue reconition starts.";

@XendraField(AD_Column_ID="RRStartDate",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=7,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8fd64cd4-528d-fd92-d125-7ee7b1d55760")
public static final String FIELDNAME_InvoiceLine_RevenueRecognitionStart2="8fd64cd4-528d-fd92-d125-7ee7b1d55760";

@XendraTrl(Identifier="7efc5205-11f4-9ab4-942d-cf11f0382534")
public static String es_PE_COLUMN_RRStartDate_Name="Revenue Recognition Start";

@XendraColumn(AD_Element_ID="cb48e150-f63c-6446-4432-1a24dd47f886",ColumnName="RRStartDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7efc5205-11f4-9ab4-942d-cf11f0382534",
Synchronized="2020-03-03 21:37:03.0")
/** Column name RRStartDate */
public static final String COLUMNNAME_RRStartDate = "RRStartDate";
/** Set Resource Assignment.
@param S_ResourceAssignment_ID Resource Assignment */
public void setS_ResourceAssignment_ID (int S_ResourceAssignment_ID)
{
if (S_ResourceAssignment_ID <= 0) set_ValueNoCheck (COLUMNNAME_S_ResourceAssignment_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_S_ResourceAssignment_ID, Integer.valueOf(S_ResourceAssignment_ID));
}
/** Get Resource Assignment.
@return Resource Assignment */
public int getS_ResourceAssignment_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_S_ResourceAssignment_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="bcd603b6-750a-28eb-ad16-4a0759356ec9")
public static String es_PE_FIELD_InvoiceLine_ResourceAssignment_Name="Asignación de Recursos";

@XendraTrl(Identifier="bcd603b6-750a-28eb-ad16-4a0759356ec9")
public static String es_PE_FIELD_InvoiceLine_ResourceAssignment_Description="Asignación de Recursos";

@XendraField(AD_Column_ID="S_ResourceAssignment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bcd603b6-750a-28eb-ad16-4a0759356ec9")
public static final String FIELDNAME_InvoiceLine_ResourceAssignment="bcd603b6-750a-28eb-ad16-4a0759356ec9";

@XendraTrl(Identifier="a749b8ed-5871-a100-5997-c856f8c9508e")
public static String es_PE_FIELD_InvoiceLine_ResourceAssignment2_Name="Asignación de Recursos";

@XendraTrl(Identifier="a749b8ed-5871-a100-5997-c856f8c9508e")
public static String es_PE_FIELD_InvoiceLine_ResourceAssignment2_Description="Asignación de Recursos";

@XendraField(AD_Column_ID="S_ResourceAssignment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a749b8ed-5871-a100-5997-c856f8c9508e")
public static final String FIELDNAME_InvoiceLine_ResourceAssignment2="a749b8ed-5871-a100-5997-c856f8c9508e";

@XendraTrl(Identifier="a379b0b8-3213-edb0-30a3-2fbd87981236")
public static String es_PE_FIELD_IncludedLines_ResourceAssignment_Name="Asignación de Recursos";

@XendraTrl(Identifier="a379b0b8-3213-edb0-30a3-2fbd87981236")
public static String es_PE_FIELD_IncludedLines_ResourceAssignment_Description="Asignación de Recursos";

@XendraField(AD_Column_ID="S_ResourceAssignment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6d5404fc-e047-c0ee-8a64-c457419e045c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a379b0b8-3213-edb0-30a3-2fbd87981236")
public static final String FIELDNAME_IncludedLines_ResourceAssignment="a379b0b8-3213-edb0-30a3-2fbd87981236";

@XendraTrl(Identifier="22c39f36-62fd-3d59-394d-55cab6948c91")
public static String es_PE_FIELD_InvoiceLine_ResourceAssignment3_Name="Asignación de Recursos";

@XendraTrl(Identifier="22c39f36-62fd-3d59-394d-55cab6948c91")
public static String es_PE_FIELD_InvoiceLine_ResourceAssignment3_Description="Asignación de Recursos";

@XendraField(AD_Column_ID="S_ResourceAssignment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="90f8b518-7f5c-9bae-ad70-c719b8e5c310",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="22c39f36-62fd-3d59-394d-55cab6948c91")
public static final String FIELDNAME_InvoiceLine_ResourceAssignment3="22c39f36-62fd-3d59-394d-55cab6948c91";

@XendraTrl(Identifier="b7519239-39d7-cdec-76b1-5bb65f7f9e20")
public static String es_PE_COLUMN_S_ResourceAssignment_ID_Name="Asignación de Recursos";

@XendraColumn(AD_Element_ID="5b04aabc-c98f-1f47-d00c-ef5ca7e86447",
ColumnName="S_ResourceAssignment_ID",AD_Reference_ID=33,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="@C_Charge_ID@!0",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutAssignment.product",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b7519239-39d7-cdec-76b1-5bb65f7f9e20",
Synchronized="2020-03-03 21:37:03.0")
/** Column name S_ResourceAssignment_ID */
public static final String COLUMNNAME_S_ResourceAssignment_ID = "S_ResourceAssignment_ID";
/** Set Tax Amount.
@param TaxAmt Tax Amount for a document */
public void setTaxAmt (BigDecimal TaxAmt)
{
set_Value (COLUMNNAME_TaxAmt, TaxAmt);
}
/** Get Tax Amount.
@return Tax Amount for a document */
public BigDecimal getTaxAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="571d6bae-ae91-0e32-a353-ccffd90267e2")
public static String es_PE_FIELD_InvoiceLine_TaxAmount_Name="Total del Impuesto";

@XendraTrl(Identifier="571d6bae-ae91-0e32-a353-ccffd90267e2")
public static String es_PE_FIELD_InvoiceLine_TaxAmount_Description="Total del impuesto para un documento";

@XendraTrl(Identifier="571d6bae-ae91-0e32-a353-ccffd90267e2")
public static String es_PE_FIELD_InvoiceLine_TaxAmount_Help="El Total de Impuesto despliega el total de impuesto para un documento";

@XendraField(AD_Column_ID="TaxAmt",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="571d6bae-ae91-0e32-a353-ccffd90267e2")
public static final String FIELDNAME_InvoiceLine_TaxAmount="571d6bae-ae91-0e32-a353-ccffd90267e2";

@XendraTrl(Identifier="409f84f8-b914-debc-d693-762ea5b312db")
public static String es_PE_FIELD_InvoiceLine_TaxAmount2_Name="Total del Impuesto";

@XendraTrl(Identifier="409f84f8-b914-debc-d693-762ea5b312db")
public static String es_PE_FIELD_InvoiceLine_TaxAmount2_Description="Total del impuesto para un documento";

@XendraTrl(Identifier="409f84f8-b914-debc-d693-762ea5b312db")
public static String es_PE_FIELD_InvoiceLine_TaxAmount2_Help="El Total de Impuesto despliega el total de impuesto para un documento";

@XendraField(AD_Column_ID="TaxAmt",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="409f84f8-b914-debc-d693-762ea5b312db")
public static final String FIELDNAME_InvoiceLine_TaxAmount2="409f84f8-b914-debc-d693-762ea5b312db";

@XendraTrl(Identifier="7e63027d-bec0-b601-47a0-be4cbcd2dfec")
public static String es_PE_FIELD_IncludedLines_TaxAmount_Name="Total del Impuesto";

@XendraTrl(Identifier="7e63027d-bec0-b601-47a0-be4cbcd2dfec")
public static String es_PE_FIELD_IncludedLines_TaxAmount_Description="Total del impuesto para un documento";

@XendraTrl(Identifier="7e63027d-bec0-b601-47a0-be4cbcd2dfec")
public static String es_PE_FIELD_IncludedLines_TaxAmount_Help="El Total de Impuesto despliega el total de impuesto para un documento";

@XendraField(AD_Column_ID="TaxAmt",IsCentrallyMaintained=true,
AD_Tab_ID="6d5404fc-e047-c0ee-8a64-c457419e045c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7e63027d-bec0-b601-47a0-be4cbcd2dfec")
public static final String FIELDNAME_IncludedLines_TaxAmount="7e63027d-bec0-b601-47a0-be4cbcd2dfec";

@XendraTrl(Identifier="7b12d1bc-47bb-0a20-c4ae-3cac0a2a5d44")
public static String es_PE_FIELD_InvoiceLine_TaxAmount3_Name="Total del Impuesto";

@XendraTrl(Identifier="7b12d1bc-47bb-0a20-c4ae-3cac0a2a5d44")
public static String es_PE_FIELD_InvoiceLine_TaxAmount3_Description="Total del impuesto para un documento";

@XendraTrl(Identifier="7b12d1bc-47bb-0a20-c4ae-3cac0a2a5d44")
public static String es_PE_FIELD_InvoiceLine_TaxAmount3_Help="El Total de Impuesto despliega el total de impuesto para un documento";

@XendraField(AD_Column_ID="TaxAmt",IsCentrallyMaintained=true,
AD_Tab_ID="90f8b518-7f5c-9bae-ad70-c719b8e5c310",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7b12d1bc-47bb-0a20-c4ae-3cac0a2a5d44")
public static final String FIELDNAME_InvoiceLine_TaxAmount3="7b12d1bc-47bb-0a20-c4ae-3cac0a2a5d44";

@XendraTrl(Identifier="780f6a8e-1b1c-6409-46e4-f705737998ce")
public static String es_PE_COLUMN_TaxAmt_Name="Total del Impuesto";

@XendraColumn(AD_Element_ID="462941e1-a196-170f-fd16-84da06ba50ea",ColumnName="TaxAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutInvoice.amt",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="780f6a8e-1b1c-6409-46e4-f705737998ce",Synchronized="2020-03-03 21:37:03.0")
/** Column name TaxAmt */
public static final String COLUMNNAME_TaxAmt = "TaxAmt";
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

@XendraTrl(Identifier="9e02eed5-0dfd-6661-4d5d-edcb4011114f")
public static String es_PE_FIELD_InvoiceLine_UserList_Name="Usuario 1";

@XendraTrl(Identifier="9e02eed5-0dfd-6661-4d5d-edcb4011114f")
public static String es_PE_FIELD_InvoiceLine_UserList_Description="El usuario definió el elemento # 1";

@XendraTrl(Identifier="9e02eed5-0dfd-6661-4d5d-edcb4011114f")
public static String es_PE_FIELD_InvoiceLine_UserList_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_U1@='Y'",DisplayLength=10,IsReadOnly=false,SeqNo=180,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="9e02eed5-0dfd-6661-4d5d-edcb4011114f")
public static final String FIELDNAME_InvoiceLine_UserList="9e02eed5-0dfd-6661-4d5d-edcb4011114f";

@XendraTrl(Identifier="ad9fc210-e991-8a63-5a01-a0e18ea3210d")
public static String es_PE_FIELD_InvoiceLine_UserList12_Name="Usuario 1";

@XendraTrl(Identifier="ad9fc210-e991-8a63-5a01-a0e18ea3210d")
public static String es_PE_FIELD_InvoiceLine_UserList12_Description="El usuario definió el elemento # 1";

@XendraTrl(Identifier="ad9fc210-e991-8a63-5a01-a0e18ea3210d")
public static String es_PE_FIELD_InvoiceLine_UserList12_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_U1@='Y'",DisplayLength=10,IsReadOnly=false,SeqNo=200,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="ad9fc210-e991-8a63-5a01-a0e18ea3210d")
public static final String FIELDNAME_InvoiceLine_UserList12="ad9fc210-e991-8a63-5a01-a0e18ea3210d";

@XendraTrl(Identifier="a3e11f69-79d1-146c-e107-31b33053a73c")
public static String es_PE_COLUMN_User1_ID_Name="Usuario 1";

@XendraColumn(AD_Element_ID="07453e74-aadd-d9c9-e543-837a6fdb3094",ColumnName="User1_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="5a2fe161-044f-67cb-3791-6d615980cabb",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a3e11f69-79d1-146c-e107-31b33053a73c",Synchronized="2020-03-03 21:37:03.0")
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

@XendraTrl(Identifier="cfc03040-14c4-96bb-8797-29ab0601f665")
public static String es_PE_FIELD_InvoiceLine_UserList23_Name="Usuario 2";

@XendraTrl(Identifier="cfc03040-14c4-96bb-8797-29ab0601f665")
public static String es_PE_FIELD_InvoiceLine_UserList23_Description="El usuario definió el elemento # 2";

@XendraTrl(Identifier="cfc03040-14c4-96bb-8797-29ab0601f665")
public static String es_PE_FIELD_InvoiceLine_UserList23_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43b4edb1-0e05-dd4f-8ed4-8dcf61132786",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_U2@='Y'",DisplayLength=10,IsReadOnly=false,SeqNo=190,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="cfc03040-14c4-96bb-8797-29ab0601f665")
public static final String FIELDNAME_InvoiceLine_UserList23="cfc03040-14c4-96bb-8797-29ab0601f665";

@XendraTrl(Identifier="9c5e043b-3034-8fcf-2a92-3306c6c3918c")
public static String es_PE_FIELD_InvoiceLine_UserList24_Name="Usuario 2";

@XendraTrl(Identifier="9c5e043b-3034-8fcf-2a92-3306c6c3918c")
public static String es_PE_FIELD_InvoiceLine_UserList24_Description="El usuario definió el elemento # 2";

@XendraTrl(Identifier="9c5e043b-3034-8fcf-2a92-3306c6c3918c")
public static String es_PE_FIELD_InvoiceLine_UserList24_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7acf40ad-c812-9a51-a249-e6a0017ff4bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_U2@='Y'",DisplayLength=10,IsReadOnly=false,SeqNo=210,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="9c5e043b-3034-8fcf-2a92-3306c6c3918c")
public static final String FIELDNAME_InvoiceLine_UserList24="9c5e043b-3034-8fcf-2a92-3306c6c3918c";

@XendraTrl(Identifier="462cffa2-1a81-08af-adf3-6d713c01f74a")
public static String es_PE_COLUMN_User2_ID_Name="Usuario 2";

@XendraColumn(AD_Element_ID="1b668c90-6743-20a2-df62-576857d72c06",ColumnName="User2_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="6a357ab2-7bb6-fce4-ffee-8bdd855a77fc",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="462cffa2-1a81-08af-adf3-6d713c01f74a",Synchronized="2020-03-03 21:37:03.0")
/** Column name User2_ID */
public static final String COLUMNNAME_User2_ID = "User2_ID";
}
