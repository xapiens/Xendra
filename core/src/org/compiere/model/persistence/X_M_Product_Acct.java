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
/** Generated Model for M_Product_Acct
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_Product_Acct extends PO
{
/** Standard Constructor
@param ctx context
@param M_Product_Acct_ID id
@param trxName transaction
*/
public X_M_Product_Acct (Properties ctx, int M_Product_Acct_ID, String trxName)
{
super (ctx, M_Product_Acct_ID, trxName);
/** if (M_Product_Acct_ID == 0)
{
setC_AcctSchema_ID (0);
setM_Product_ID (0);
setP_Asset_Acct (0);
setP_COGS_Acct (0);
setP_CostAdjustment_Acct (0);
setP_Expense_Acct (0);
setP_InventoryClearing_Acct (0);
setP_InvoicePriceVariance_Acct (0);
setP_PurchasePriceVariance_Acct (0);
setP_Revenue_Acct (0);
setP_TradeDiscountGrant_Acct (0);
setP_TradeDiscountRec_Acct (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_Product_Acct (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=273 */
public static int Table_ID=MTable.getTable_ID("M_Product_Acct");

@XendraTrl(Identifier="c3edd678-19ad-3e9f-73d1-a360285d3881")
public static String es_PE_TAB_Accounting_Description="Definir Parámetros Contables";

@XendraTrl(Identifier="c3edd678-19ad-3e9f-73d1-a360285d3881")
public static String es_PE_TAB_Accounting_Name="Contabilidad";

@XendraTrl(Identifier="c3edd678-19ad-3e9f-73d1-a360285d3881")
public static String es_PE_TAB_Accounting_Help="La pestaña Contabilidad define los valores predeterminado que usa cuando se generan transacciones contables para ordenes y facturas las cuales contienen este tipo de gasto. No todas las cuentas aplican.";

@XendraTab(Name="Accounting",Description="Define Accounting Parameters",
Help="The Accounting Tab defines the defaults to use when generating accounting transactions for orders and invoices which contain this Expense Type. Not all accounts apply.",
AD_Window_ID="e37c684c-2fb9-31f4-b025-d8ef9933998c",SeqNo=40,TabLevel=2,IsSingleRow=true,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="c090f87c-6d94-b06c-45bd-08dea87d0c71",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="c3edd678-19ad-3e9f-73d1-a360285d3881",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Accounting="c3edd678-19ad-3e9f-73d1-a360285d3881";

@XendraTrl(Identifier="da96e538-e53b-f58d-9068-afa8fee8e1fa")
public static String es_PE_TAB_Accounting2_Description="Definir Parámetros Contables";

@XendraTrl(Identifier="da96e538-e53b-f58d-9068-afa8fee8e1fa")
public static String es_PE_TAB_Accounting2_Name="Contabilidad";

@XendraTrl(Identifier="da96e538-e53b-f58d-9068-afa8fee8e1fa")
public static String es_PE_TAB_Accounting2_Help="La pestaña Contabilidad define los valores predeterminado que usa cuando se generan transacciones contables para ordenes y facturas las cuales contienen este recurso. No todas las cuentas aplican a recursos.";

@XendraTab(Name="Accounting",Description="Define Accounting Parameters",
Help="The Accounting Tab defines the defaults to use when generating accounting transactions for orders and invoices which contain this resource.  Not all accounts apply to resources.",
AD_Window_ID="d64fba3f-bbf2-bd5b-1f70-0c9bcedb722a",SeqNo=50,TabLevel=2,IsSingleRow=true,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="c090f87c-6d94-b06c-45bd-08dea87d0c71",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="da96e538-e53b-f58d-9068-afa8fee8e1fa",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Accounting2="da96e538-e53b-f58d-9068-afa8fee8e1fa";

@XendraTrl(Identifier="6ad98ef2-6490-99f3-fe7f-778b89fb9e8b")
public static String es_PE_TAB_Accounting3_Description="Definir Parámetros Contables";

@XendraTrl(Identifier="6ad98ef2-6490-99f3-fe7f-778b89fb9e8b")
public static String es_PE_TAB_Accounting3_Name="Contabilidad";

@XendraTrl(Identifier="6ad98ef2-6490-99f3-fe7f-778b89fb9e8b")
public static String es_PE_TAB_Accounting3_Help="La pestaña de Contabilidad define los valores predeterminados que se usan cuando se generan transacciones contables para ordenes y facturas que contengan este producto.";

@XendraTab(Name="Accounting",Description="Define Accounting Parameters",
Help="The Accounting Tab defines the defaults to use when generating accounting transactions for orders and invoices which contain this product.",
AD_Window_ID="ce2d4e2c-ba4e-29bf-9f71-66fecdc05f55",SeqNo=70,TabLevel=1,IsSingleRow=true,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="6ad98ef2-6490-99f3-fe7f-778b89fb9e8b",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Accounting3="6ad98ef2-6490-99f3-fe7f-778b89fb9e8b";

@XendraTrl(Identifier="58c92497-335c-2b85-6c7d-29bf577a1da8")
public static String es_PE_TABLE_M_Product_Acct_Name="M_Product_Acct";

@XendraTable(Name="Product Acct",Description="",Help="",TableName="M_Product_Acct",AccessLevel="3",
AD_Window_ID="ce2d4e2c-ba4e-29bf-9f71-66fecdc05f55",AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.material",Identifier="58c92497-335c-2b85-6c7d-29bf577a1da8",
Synchronized="2017-08-16 11:43:26.0")
/** TableName=M_Product_Acct */
public static final String Table_Name="M_Product_Acct";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_Product_Acct");

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
    Table_ID = MTable.getTable_ID("M_Product_Acct");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_Product_Acct[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Accounting Schema.
@param C_AcctSchema_ID Rules for accounting */
public void setC_AcctSchema_ID (int C_AcctSchema_ID)
{
if (C_AcctSchema_ID < 1) throw new IllegalArgumentException ("C_AcctSchema_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_AcctSchema_ID, Integer.valueOf(C_AcctSchema_ID));
}
/** Get Accounting Schema.
@return Rules for accounting */
public int getC_AcctSchema_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_AcctSchema_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="db7ae6d8-61eb-10e3-f3ea-88ff4d2af36c")
public static String es_PE_FIELD_Accounting_AccountingSchema_Description="Reglas para contabilizar";

@XendraTrl(Identifier="db7ae6d8-61eb-10e3-f3ea-88ff4d2af36c")
public static String es_PE_FIELD_Accounting_AccountingSchema_Help="Un esquema contable define las reglas contables usadas tales como método de costeo; moneda y calendario";

@XendraTrl(Identifier="db7ae6d8-61eb-10e3-f3ea-88ff4d2af36c")
public static String es_PE_FIELD_Accounting_AccountingSchema_Name="Esquema Contable";

@XendraField(AD_Column_ID="C_AcctSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6ad98ef2-6490-99f3-fe7f-778b89fb9e8b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="db7ae6d8-61eb-10e3-f3ea-88ff4d2af36c")
public static final String FIELDNAME_Accounting_AccountingSchema="db7ae6d8-61eb-10e3-f3ea-88ff4d2af36c";

@XendraTrl(Identifier="bbf6f394-e88f-1cad-571f-e1e50e6d2969")
public static String es_PE_FIELD_Accounting_AccountingSchema2_Description="Reglas para contabilizar";

@XendraTrl(Identifier="bbf6f394-e88f-1cad-571f-e1e50e6d2969")
public static String es_PE_FIELD_Accounting_AccountingSchema2_Help="Un esquema contable define las reglas contables usadas tales como método de costeo; moneda y calendario";

@XendraTrl(Identifier="bbf6f394-e88f-1cad-571f-e1e50e6d2969")
public static String es_PE_FIELD_Accounting_AccountingSchema2_Name="Esquema Contable";

@XendraField(AD_Column_ID="C_AcctSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c3edd678-19ad-3e9f-73d1-a360285d3881",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bbf6f394-e88f-1cad-571f-e1e50e6d2969")
public static final String FIELDNAME_Accounting_AccountingSchema2="bbf6f394-e88f-1cad-571f-e1e50e6d2969";

@XendraTrl(Identifier="e405b600-f5b1-ac2d-d099-756be40e6d81")
public static String es_PE_FIELD_Accounting_AccountingSchema3_Description="Reglas para contabilizar";

@XendraTrl(Identifier="e405b600-f5b1-ac2d-d099-756be40e6d81")
public static String es_PE_FIELD_Accounting_AccountingSchema3_Help="Un esquema contable define las reglas contables usadas tales como método de costeo; moneda y calendario";

@XendraTrl(Identifier="e405b600-f5b1-ac2d-d099-756be40e6d81")
public static String es_PE_FIELD_Accounting_AccountingSchema3_Name="Esquema Contable";

@XendraField(AD_Column_ID="C_AcctSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="da96e538-e53b-f58d-9068-afa8fee8e1fa",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e405b600-f5b1-ac2d-d099-756be40e6d81")
public static final String FIELDNAME_Accounting_AccountingSchema3="e405b600-f5b1-ac2d-d099-756be40e6d81";

@XendraTrl(Identifier="28f50fbe-86e1-8034-0b47-5235f4f3d60c")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="28f50fbe-86e1-8034-0b47-5235f4f3d60c",
Synchronized="2017-08-05 16:55:22.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
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
@XendraTrl(Identifier="c8bb9833-0a70-4f7a-93fc-276c89fc9154")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c8bb9833-0a70-4f7a-93fc-276c89fc9154",
Synchronized="2017-08-05 16:55:22.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID < 1) throw new IllegalArgumentException ("M_Product_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
}
/** Get Product.
@return Product, Service, Item */
public int getM_Product_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d2f0896a-e924-9556-9b5d-4ea13fecf50a")
public static String es_PE_FIELD_Accounting_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="d2f0896a-e924-9556-9b5d-4ea13fecf50a")
public static String es_PE_FIELD_Accounting_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="d2f0896a-e924-9556-9b5d-4ea13fecf50a")
public static String es_PE_FIELD_Accounting_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6ad98ef2-6490-99f3-fe7f-778b89fb9e8b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d2f0896a-e924-9556-9b5d-4ea13fecf50a")
public static final String FIELDNAME_Accounting_Product="d2f0896a-e924-9556-9b5d-4ea13fecf50a";

@XendraTrl(Identifier="aa071562-8a99-6f5f-b66e-9c8cefa2d157")
public static String es_PE_FIELD_Accounting_Product2_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="aa071562-8a99-6f5f-b66e-9c8cefa2d157")
public static String es_PE_FIELD_Accounting_Product2_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="aa071562-8a99-6f5f-b66e-9c8cefa2d157")
public static String es_PE_FIELD_Accounting_Product2_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c3edd678-19ad-3e9f-73d1-a360285d3881",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aa071562-8a99-6f5f-b66e-9c8cefa2d157")
public static final String FIELDNAME_Accounting_Product2="aa071562-8a99-6f5f-b66e-9c8cefa2d157";

@XendraTrl(Identifier="3658b77e-1cc5-9cdf-2fad-6cba2adaf648")
public static String es_PE_FIELD_Accounting_Product3_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="3658b77e-1cc5-9cdf-2fad-6cba2adaf648")
public static String es_PE_FIELD_Accounting_Product3_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="3658b77e-1cc5-9cdf-2fad-6cba2adaf648")
public static String es_PE_FIELD_Accounting_Product3_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="da96e538-e53b-f58d-9068-afa8fee8e1fa",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3658b77e-1cc5-9cdf-2fad-6cba2adaf648")
public static final String FIELDNAME_Accounting_Product3="3658b77e-1cc5-9cdf-2fad-6cba2adaf648";

@XendraTrl(Identifier="c090f87c-6d94-b06c-45bd-08dea87d0c71")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c090f87c-6d94-b06c-45bd-08dea87d0c71",
Synchronized="2017-08-05 16:55:22.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Product Asset.
@param P_Asset_Acct Account for Product Asset (Inventory) */
public void setP_Asset_Acct (int P_Asset_Acct)
{
set_Value (COLUMNNAME_P_Asset_Acct, Integer.valueOf(P_Asset_Acct));
}
/** Get Product Asset.
@return Account for Product Asset (Inventory) */
public int getP_Asset_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_P_Asset_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c3396520-871c-90d4-19ce-9046a5454dc1")
public static String es_PE_FIELD_Accounting_ProductAsset_Description="Cuenta para inventario del producto";

@XendraTrl(Identifier="c3396520-871c-90d4-19ce-9046a5454dc1")
public static String es_PE_FIELD_Accounting_ProductAsset_Help="La cuenta Inventario indica la cuenta usada para valuar los productos en inventario.";

@XendraTrl(Identifier="c3396520-871c-90d4-19ce-9046a5454dc1")
public static String es_PE_FIELD_Accounting_ProductAsset_Name="Inventario de Producto";

@XendraField(AD_Column_ID="P_Asset_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="6ad98ef2-6490-99f3-fe7f-778b89fb9e8b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c3396520-871c-90d4-19ce-9046a5454dc1")
public static final String FIELDNAME_Accounting_ProductAsset="c3396520-871c-90d4-19ce-9046a5454dc1";

@XendraTrl(Identifier="306a8afa-c3dd-ef40-be47-000ddca6374d")
public static String es_PE_FIELD_Accounting_ProductAsset2_Description="Cuenta para inventario del producto";

@XendraTrl(Identifier="306a8afa-c3dd-ef40-be47-000ddca6374d")
public static String es_PE_FIELD_Accounting_ProductAsset2_Help="La cuenta Inventario indica la cuenta usada para valuar los productos en inventario.";

@XendraTrl(Identifier="306a8afa-c3dd-ef40-be47-000ddca6374d")
public static String es_PE_FIELD_Accounting_ProductAsset2_Name="Inventario de Producto";

@XendraField(AD_Column_ID="P_Asset_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="c3edd678-19ad-3e9f-73d1-a360285d3881",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="306a8afa-c3dd-ef40-be47-000ddca6374d")
public static final String FIELDNAME_Accounting_ProductAsset2="306a8afa-c3dd-ef40-be47-000ddca6374d";

@XendraTrl(Identifier="3f5f9709-563e-6aee-c1ca-e0f171f04454")
public static String es_PE_FIELD_Accounting_ProductAsset3_Description="Cuenta para inventario del producto";

@XendraTrl(Identifier="3f5f9709-563e-6aee-c1ca-e0f171f04454")
public static String es_PE_FIELD_Accounting_ProductAsset3_Help="La cuenta Inventario indica la cuenta usada para valuar los productos en inventario.";

@XendraTrl(Identifier="3f5f9709-563e-6aee-c1ca-e0f171f04454")
public static String es_PE_FIELD_Accounting_ProductAsset3_Name="Inventario de Producto";

@XendraField(AD_Column_ID="P_Asset_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="da96e538-e53b-f58d-9068-afa8fee8e1fa",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3f5f9709-563e-6aee-c1ca-e0f171f04454")
public static final String FIELDNAME_Accounting_ProductAsset3="3f5f9709-563e-6aee-c1ca-e0f171f04454";

@XendraTrl(Identifier="649a5856-8e11-5cad-37d9-ebb902d287e8")
public static String es_PE_COLUMN_P_Asset_Acct_Name="Inventario de Producto";

@XendraColumn(AD_Element_ID="d30f7070-17c9-1af8-c525-961260c4aa6b",ColumnName="P_Asset_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="649a5856-8e11-5cad-37d9-ebb902d287e8",
Synchronized="2017-08-05 16:55:22.0")
/** Column name P_Asset_Acct */
public static final String COLUMNNAME_P_Asset_Acct = "P_Asset_Acct";
/** Set Product COGS.
@param P_COGS_Acct Account for Cost of Goods Sold */
public void setP_COGS_Acct (int P_COGS_Acct)
{
set_Value (COLUMNNAME_P_COGS_Acct, Integer.valueOf(P_COGS_Acct));
}
/** Get Product COGS.
@return Account for Cost of Goods Sold */
public int getP_COGS_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_P_COGS_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5890ca06-f277-1825-fa0f-8038709f7f0c")
public static String es_PE_FIELD_Accounting_ProductCOGS_Description="Cuenta para costo de producto vendido";

@XendraTrl(Identifier="5890ca06-f277-1825-fa0f-8038709f7f0c")
public static String es_PE_FIELD_Accounting_ProductCOGS_Help="La cuenta COGS de producto indica la cuenta usada para registrar costos asociados con la venta de este producto";

@XendraTrl(Identifier="5890ca06-f277-1825-fa0f-8038709f7f0c")
public static String es_PE_FIELD_Accounting_ProductCOGS_Name="COGS del Producto";

@XendraField(AD_Column_ID="P_COGS_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="6ad98ef2-6490-99f3-fe7f-778b89fb9e8b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5890ca06-f277-1825-fa0f-8038709f7f0c")
public static final String FIELDNAME_Accounting_ProductCOGS="5890ca06-f277-1825-fa0f-8038709f7f0c";

@XendraTrl(Identifier="af6bb46c-403a-7384-d503-13f22e13fda1")
public static String es_PE_FIELD_Accounting_ProductCOGS2_Description="Cuenta para costo de producto vendido";

@XendraTrl(Identifier="af6bb46c-403a-7384-d503-13f22e13fda1")
public static String es_PE_FIELD_Accounting_ProductCOGS2_Help="La cuenta COGS de producto indica la cuenta usada para registrar costos asociados con la venta de este producto";

@XendraTrl(Identifier="af6bb46c-403a-7384-d503-13f22e13fda1")
public static String es_PE_FIELD_Accounting_ProductCOGS2_Name="COGS del Producto";

@XendraField(AD_Column_ID="P_COGS_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="c3edd678-19ad-3e9f-73d1-a360285d3881",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="af6bb46c-403a-7384-d503-13f22e13fda1")
public static final String FIELDNAME_Accounting_ProductCOGS2="af6bb46c-403a-7384-d503-13f22e13fda1";

@XendraTrl(Identifier="3e6ad2ce-5472-e0c7-3f7a-20ea83059752")
public static String es_PE_FIELD_Accounting_ProductCOGS3_Description="Cuenta para costo de producto vendido";

@XendraTrl(Identifier="3e6ad2ce-5472-e0c7-3f7a-20ea83059752")
public static String es_PE_FIELD_Accounting_ProductCOGS3_Help="La cuenta COGS de producto indica la cuenta usada para registrar costos asociados con la venta de este producto";

@XendraTrl(Identifier="3e6ad2ce-5472-e0c7-3f7a-20ea83059752")
public static String es_PE_FIELD_Accounting_ProductCOGS3_Name="COGS del Producto";

@XendraField(AD_Column_ID="P_COGS_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="da96e538-e53b-f58d-9068-afa8fee8e1fa",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3e6ad2ce-5472-e0c7-3f7a-20ea83059752")
public static final String FIELDNAME_Accounting_ProductCOGS3="3e6ad2ce-5472-e0c7-3f7a-20ea83059752";

@XendraTrl(Identifier="ec742259-5a65-d24f-72bc-1fa5278cec1d")
public static String es_PE_COLUMN_P_COGS_Acct_Name="COGS del Producto";

@XendraColumn(AD_Element_ID="2909678b-c885-6958-6484-c07916c61343",ColumnName="P_COGS_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ec742259-5a65-d24f-72bc-1fa5278cec1d",
Synchronized="2017-08-05 16:55:22.0")
/** Column name P_COGS_Acct */
public static final String COLUMNNAME_P_COGS_Acct = "P_COGS_Acct";
/** Set Cost Adjustment.
@param P_CostAdjustment_Acct Product Cost Adjustment Account */
public void setP_CostAdjustment_Acct (int P_CostAdjustment_Acct)
{
set_Value (COLUMNNAME_P_CostAdjustment_Acct, Integer.valueOf(P_CostAdjustment_Acct));
}
/** Get Cost Adjustment.
@return Product Cost Adjustment Account */
public int getP_CostAdjustment_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_P_CostAdjustment_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="36aecc42-2f95-1b7e-feb0-dfc7982c183f")
public static String es_PE_FIELD_Accounting_CostAdjustment_Description="Ajustar Cuenta Costo de Producto";

@XendraTrl(Identifier="36aecc42-2f95-1b7e-feb0-dfc7982c183f")
public static String es_PE_FIELD_Accounting_CostAdjustment_Help="Cuenta empleada para contabilizar ajustes al costo del producto (ej.Costos Adicionales)";

@XendraTrl(Identifier="36aecc42-2f95-1b7e-feb0-dfc7982c183f")
public static String es_PE_FIELD_Accounting_CostAdjustment_Name="Ajustar Costo";

@XendraField(AD_Column_ID="P_CostAdjustment_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="6ad98ef2-6490-99f3-fe7f-778b89fb9e8b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="36aecc42-2f95-1b7e-feb0-dfc7982c183f")
public static final String FIELDNAME_Accounting_CostAdjustment="36aecc42-2f95-1b7e-feb0-dfc7982c183f";

@XendraTrl(Identifier="a146b745-47b1-f946-01a5-6ac0d92ac5de")
public static String es_PE_COLUMN_P_CostAdjustment_Acct_Name="Ajustar Costo";

@XendraColumn(AD_Element_ID="ad309537-4749-1eec-078d-4d547978d2b6",
ColumnName="P_CostAdjustment_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a146b745-47b1-f946-01a5-6ac0d92ac5de",Synchronized="2017-08-05 16:55:22.0")
/** Column name P_CostAdjustment_Acct */
public static final String COLUMNNAME_P_CostAdjustment_Acct = "P_CostAdjustment_Acct";
/** Set Product Expense.
@param P_Expense_Acct Account for Product Expense */
public void setP_Expense_Acct (int P_Expense_Acct)
{
set_Value (COLUMNNAME_P_Expense_Acct, Integer.valueOf(P_Expense_Acct));
}
/** Get Product Expense.
@return Account for Product Expense */
public int getP_Expense_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_P_Expense_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="cbf383f2-6f51-a294-14a2-bd585b7c4383")
public static String es_PE_FIELD_Accounting_ProductExpense_Description="Cuenta para gastos por el producto";

@XendraTrl(Identifier="cbf383f2-6f51-a294-14a2-bd585b7c4383")
public static String es_PE_FIELD_Accounting_ProductExpense_Help="La cuenta gastos para el producto indica la cuenta usada para registrar gastos asociados con estos productos.";

@XendraTrl(Identifier="cbf383f2-6f51-a294-14a2-bd585b7c4383")
public static String es_PE_FIELD_Accounting_ProductExpense_Name="Discrepancia en Producto";

@XendraField(AD_Column_ID="P_Expense_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="6ad98ef2-6490-99f3-fe7f-778b89fb9e8b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cbf383f2-6f51-a294-14a2-bd585b7c4383")
public static final String FIELDNAME_Accounting_ProductExpense="cbf383f2-6f51-a294-14a2-bd585b7c4383";

@XendraTrl(Identifier="fe2578a3-a97c-1541-bc45-3ae8280efa2d")
public static String es_PE_FIELD_Accounting_ProductExpense2_Description="Cuenta para gastos por el producto";

@XendraTrl(Identifier="fe2578a3-a97c-1541-bc45-3ae8280efa2d")
public static String es_PE_FIELD_Accounting_ProductExpense2_Help="La cuenta gastos para el producto indica la cuenta usada para registrar gastos asociados con estos productos.";

@XendraTrl(Identifier="fe2578a3-a97c-1541-bc45-3ae8280efa2d")
public static String es_PE_FIELD_Accounting_ProductExpense2_Name="Discrepancia en Producto";

@XendraField(AD_Column_ID="P_Expense_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="c3edd678-19ad-3e9f-73d1-a360285d3881",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fe2578a3-a97c-1541-bc45-3ae8280efa2d")
public static final String FIELDNAME_Accounting_ProductExpense2="fe2578a3-a97c-1541-bc45-3ae8280efa2d";

@XendraTrl(Identifier="121231ed-a277-7b5b-5f16-3806d53ba4d1")
public static String es_PE_FIELD_Accounting_ProductExpense3_Description="Cuenta para gastos por el producto";

@XendraTrl(Identifier="121231ed-a277-7b5b-5f16-3806d53ba4d1")
public static String es_PE_FIELD_Accounting_ProductExpense3_Help="La cuenta gastos para el producto indica la cuenta usada para registrar gastos asociados con estos productos.";

@XendraTrl(Identifier="121231ed-a277-7b5b-5f16-3806d53ba4d1")
public static String es_PE_FIELD_Accounting_ProductExpense3_Name="Discrepancia en Producto";

@XendraField(AD_Column_ID="P_Expense_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="da96e538-e53b-f58d-9068-afa8fee8e1fa",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="121231ed-a277-7b5b-5f16-3806d53ba4d1")
public static final String FIELDNAME_Accounting_ProductExpense3="121231ed-a277-7b5b-5f16-3806d53ba4d1";

@XendraTrl(Identifier="a0e8c769-8e0b-9ff4-bfec-2aa52d7d6cd7")
public static String es_PE_COLUMN_P_Expense_Acct_Name="Discrepancia en Producto";

@XendraColumn(AD_Element_ID="3b747810-2ea8-e75f-5550-9ef4be318c0a",ColumnName="P_Expense_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a0e8c769-8e0b-9ff4-bfec-2aa52d7d6cd7",
Synchronized="2017-08-05 16:55:22.0")
/** Column name P_Expense_Acct */
public static final String COLUMNNAME_P_Expense_Acct = "P_Expense_Acct";
/** Set Inventory Clearing.
@param P_InventoryClearing_Acct Product Inventory Clearing Account */
public void setP_InventoryClearing_Acct (int P_InventoryClearing_Acct)
{
set_Value (COLUMNNAME_P_InventoryClearing_Acct, Integer.valueOf(P_InventoryClearing_Acct));
}
/** Get Inventory Clearing.
@return Product Inventory Clearing Account */
public int getP_InventoryClearing_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_P_InventoryClearing_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="23a78399-b6aa-cafa-6a25-53b821e94502")
public static String es_PE_FIELD_Accounting_InventoryClearing_Description="Product Inventory Clearing Account";

@XendraTrl(Identifier="23a78399-b6aa-cafa-6a25-53b821e94502")
public static String es_PE_FIELD_Accounting_InventoryClearing_Help="Account used for posting matched product (item) expenses (e.g. AP Invoice, Invoice Match).  You would use a different account then Product Expense, if you want to differentate service related costs from item related costs. The balance on the clearing account should be zero and accounts for the timing difference between invoice receipt and matching.";

@XendraTrl(Identifier="23a78399-b6aa-cafa-6a25-53b821e94502")
public static String es_PE_FIELD_Accounting_InventoryClearing_Name="Compras";

@XendraField(AD_Column_ID="P_InventoryClearing_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="6ad98ef2-6490-99f3-fe7f-778b89fb9e8b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="23a78399-b6aa-cafa-6a25-53b821e94502")
public static final String FIELDNAME_Accounting_InventoryClearing="23a78399-b6aa-cafa-6a25-53b821e94502";

@XendraTrl(Identifier="111a0437-6a02-ad96-de3a-e7e6be9ca85c")
public static String es_PE_COLUMN_P_InventoryClearing_Acct_Name="Inventory Clearing";

@XendraColumn(AD_Element_ID="df102fda-6348-7e51-ccc2-eb5639647e89",
ColumnName="P_InventoryClearing_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="111a0437-6a02-ad96-de3a-e7e6be9ca85c",Synchronized="2017-08-05 16:55:22.0")
/** Column name P_InventoryClearing_Acct */
public static final String COLUMNNAME_P_InventoryClearing_Acct = "P_InventoryClearing_Acct";
/** Set Invoice Price Variance.
@param P_InvoicePriceVariance_Acct Difference between Costs and Invoice Price (IPV) */
public void setP_InvoicePriceVariance_Acct (int P_InvoicePriceVariance_Acct)
{
set_Value (COLUMNNAME_P_InvoicePriceVariance_Acct, Integer.valueOf(P_InvoicePriceVariance_Acct));
}
/** Get Invoice Price Variance.
@return Difference between Costs and Invoice Price (IPV) */
public int getP_InvoicePriceVariance_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_P_InvoicePriceVariance_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0e862e48-bead-a8c8-c2a8-0cf15a8f2485")
public static String es_PE_FIELD_Accounting_InvoicePriceVariance_Description="Variación entre el costo y el precio de la factura (IPV)";

@XendraTrl(Identifier="0e862e48-bead-a8c8-c2a8-0cf15a8f2485")
public static String es_PE_FIELD_Accounting_InvoicePriceVariance_Help="La Variación en el precio de la factura se usa para reflejar la diferencia entre el costo actual y el precio de la factura.";

@XendraTrl(Identifier="0e862e48-bead-a8c8-c2a8-0cf15a8f2485")
public static String es_PE_FIELD_Accounting_InvoicePriceVariance_Name="Variación en Precio de la Factura";

@XendraField(AD_Column_ID="P_InvoicePriceVariance_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="6ad98ef2-6490-99f3-fe7f-778b89fb9e8b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0e862e48-bead-a8c8-c2a8-0cf15a8f2485")
public static final String FIELDNAME_Accounting_InvoicePriceVariance="0e862e48-bead-a8c8-c2a8-0cf15a8f2485";

@XendraTrl(Identifier="d0d227f7-3633-25db-166f-b8c01f2a0cc9")
public static String es_PE_FIELD_Accounting_InvoicePriceVariance2_Description="Variación entre el costo y el precio de la factura (IPV)";

@XendraTrl(Identifier="d0d227f7-3633-25db-166f-b8c01f2a0cc9")
public static String es_PE_FIELD_Accounting_InvoicePriceVariance2_Help="La Variación en el precio de la factura se usa para reflejar la diferencia entre el costo actual y el precio de la factura.";

@XendraTrl(Identifier="d0d227f7-3633-25db-166f-b8c01f2a0cc9")
public static String es_PE_FIELD_Accounting_InvoicePriceVariance2_Name="Variación en Precio de la Factura";

@XendraField(AD_Column_ID="P_InvoicePriceVariance_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="c3edd678-19ad-3e9f-73d1-a360285d3881",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d0d227f7-3633-25db-166f-b8c01f2a0cc9")
public static final String FIELDNAME_Accounting_InvoicePriceVariance2="d0d227f7-3633-25db-166f-b8c01f2a0cc9";

@XendraTrl(Identifier="c0357d3d-116f-6ff3-0b50-98675638b6ff")
public static String es_PE_FIELD_Accounting_InvoicePriceVariance3_Description="Variación entre el costo y el precio de la factura (IPV)";

@XendraTrl(Identifier="c0357d3d-116f-6ff3-0b50-98675638b6ff")
public static String es_PE_FIELD_Accounting_InvoicePriceVariance3_Help="La Variación en el precio de la factura se usa para reflejar la diferencia entre el costo actual y el precio de la factura.";

@XendraTrl(Identifier="c0357d3d-116f-6ff3-0b50-98675638b6ff")
public static String es_PE_FIELD_Accounting_InvoicePriceVariance3_Name="Variación en Precio de la Factura";

@XendraField(AD_Column_ID="P_InvoicePriceVariance_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="da96e538-e53b-f58d-9068-afa8fee8e1fa",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c0357d3d-116f-6ff3-0b50-98675638b6ff")
public static final String FIELDNAME_Accounting_InvoicePriceVariance3="c0357d3d-116f-6ff3-0b50-98675638b6ff";

@XendraTrl(Identifier="22223a4b-7c28-352a-a8d1-083b3934fff3")
public static String es_PE_COLUMN_P_InvoicePriceVariance_Acct_Name="Variación en Precio de la Factura";

@XendraColumn(AD_Element_ID="52fdc368-6796-1aa4-732e-8b6e615d3483",
ColumnName="P_InvoicePriceVariance_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="22223a4b-7c28-352a-a8d1-083b3934fff3",Synchronized="2017-08-05 16:55:22.0")
/** Column name P_InvoicePriceVariance_Acct */
public static final String COLUMNNAME_P_InvoicePriceVariance_Acct = "P_InvoicePriceVariance_Acct";
/** Set Purchase Price Variance.
@param P_PurchasePriceVariance_Acct Difference between Standard Cost and Purchase Price (PPV) */
public void setP_PurchasePriceVariance_Acct (int P_PurchasePriceVariance_Acct)
{
set_Value (COLUMNNAME_P_PurchasePriceVariance_Acct, Integer.valueOf(P_PurchasePriceVariance_Acct));
}
/** Get Purchase Price Variance.
@return Difference between Standard Cost and Purchase Price (PPV) */
public int getP_PurchasePriceVariance_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_P_PurchasePriceVariance_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ea609a19-07fa-b37a-8616-ecbfed6bcec8")
public static String es_PE_FIELD_Accounting_PurchasePriceVariance_Description="Variación entre le costo estándar y el precio de la orden de compra.";

@XendraTrl(Identifier="ea609a19-07fa-b37a-8616-ecbfed6bcec8")
public static String es_PE_FIELD_Accounting_PurchasePriceVariance_Help="La Variación en precios de compra es usada en costeo estándar. Refleja la diferencia entre el costo estándar y el precio de la orden de compra";

@XendraTrl(Identifier="ea609a19-07fa-b37a-8616-ecbfed6bcec8")
public static String es_PE_FIELD_Accounting_PurchasePriceVariance_Name="Variación Precio de OC";

@XendraField(AD_Column_ID="P_PurchasePriceVariance_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="6ad98ef2-6490-99f3-fe7f-778b89fb9e8b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ea609a19-07fa-b37a-8616-ecbfed6bcec8")
public static final String FIELDNAME_Accounting_PurchasePriceVariance="ea609a19-07fa-b37a-8616-ecbfed6bcec8";

@XendraTrl(Identifier="89c7c1c1-b381-56c4-0d1a-d1f69e72b983")
public static String es_PE_FIELD_Accounting_PurchasePriceVariance2_Description="Variación entre le costo estándar y el precio de la orden de compra.";

@XendraTrl(Identifier="89c7c1c1-b381-56c4-0d1a-d1f69e72b983")
public static String es_PE_FIELD_Accounting_PurchasePriceVariance2_Help="La Variación en precios de compra es usada en costeo estándar. Refleja la diferencia entre el costo estándar y el precio de la orden de compra";

@XendraTrl(Identifier="89c7c1c1-b381-56c4-0d1a-d1f69e72b983")
public static String es_PE_FIELD_Accounting_PurchasePriceVariance2_Name="Variación Precio de OC";

@XendraField(AD_Column_ID="P_PurchasePriceVariance_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="c3edd678-19ad-3e9f-73d1-a360285d3881",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="89c7c1c1-b381-56c4-0d1a-d1f69e72b983")
public static final String FIELDNAME_Accounting_PurchasePriceVariance2="89c7c1c1-b381-56c4-0d1a-d1f69e72b983";

@XendraTrl(Identifier="72846b1e-b22a-1f8e-d6f8-49b28cbb4027")
public static String es_PE_FIELD_Accounting_PurchasePriceVariance3_Description="Variación entre le costo estándar y el precio de la orden de compra.";

@XendraTrl(Identifier="72846b1e-b22a-1f8e-d6f8-49b28cbb4027")
public static String es_PE_FIELD_Accounting_PurchasePriceVariance3_Help="La Variación en precios de compra es usada en costeo estándar. Refleja la diferencia entre el costo estándar y el precio de la orden de compra";

@XendraTrl(Identifier="72846b1e-b22a-1f8e-d6f8-49b28cbb4027")
public static String es_PE_FIELD_Accounting_PurchasePriceVariance3_Name="Variación Precio de OC";

@XendraField(AD_Column_ID="P_PurchasePriceVariance_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="da96e538-e53b-f58d-9068-afa8fee8e1fa",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="72846b1e-b22a-1f8e-d6f8-49b28cbb4027")
public static final String FIELDNAME_Accounting_PurchasePriceVariance3="72846b1e-b22a-1f8e-d6f8-49b28cbb4027";

@XendraTrl(Identifier="b6ddd5d3-35d3-7d03-df66-5a930dc115fa")
public static String es_PE_COLUMN_P_PurchasePriceVariance_Acct_Name="Variación Precio de OC";

@XendraColumn(AD_Element_ID="b7204f76-9f57-b30e-5da5-8c9791c46c2b",
ColumnName="P_PurchasePriceVariance_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b6ddd5d3-35d3-7d03-df66-5a930dc115fa",Synchronized="2017-08-05 16:55:22.0")
/** Column name P_PurchasePriceVariance_Acct */
public static final String COLUMNNAME_P_PurchasePriceVariance_Acct = "P_PurchasePriceVariance_Acct";
/** Set Product Revenue.
@param P_Revenue_Acct Account for Product Revenue (Sales Account) */
public void setP_Revenue_Acct (int P_Revenue_Acct)
{
set_Value (COLUMNNAME_P_Revenue_Acct, Integer.valueOf(P_Revenue_Acct));
}
/** Get Product Revenue.
@return Account for Product Revenue (Sales Account) */
public int getP_Revenue_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_P_Revenue_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="40322194-4ec9-01a1-6e56-19249473e149")
public static String es_PE_FIELD_Accounting_ProductRevenue_Description="Cuenta de Ingresos por el producto (Cuenta de Ventas)";

@XendraTrl(Identifier="40322194-4ec9-01a1-6e56-19249473e149")
public static String es_PE_FIELD_Accounting_ProductRevenue_Help="Cuenta de Ingresos por el producto (Cuenta de Ventas)  indica la cuenta usada para registrar ingresos de ventas para este producto";

@XendraTrl(Identifier="40322194-4ec9-01a1-6e56-19249473e149")
public static String es_PE_FIELD_Accounting_ProductRevenue_Name="Ventas";

@XendraField(AD_Column_ID="P_Revenue_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="6ad98ef2-6490-99f3-fe7f-778b89fb9e8b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="40322194-4ec9-01a1-6e56-19249473e149")
public static final String FIELDNAME_Accounting_ProductRevenue="40322194-4ec9-01a1-6e56-19249473e149";

@XendraTrl(Identifier="ca9ec34c-497f-1bb4-ca94-17b5e59d4c07")
public static String es_PE_FIELD_Accounting_ProductRevenue2_Description="Cuenta de Ingresos por el producto (Cuenta de Ventas)";

@XendraTrl(Identifier="ca9ec34c-497f-1bb4-ca94-17b5e59d4c07")
public static String es_PE_FIELD_Accounting_ProductRevenue2_Help="Cuenta de Ingresos por el producto (Cuenta de Ventas)  indica la cuenta usada para registrar ingresos de ventas para este producto";

@XendraTrl(Identifier="ca9ec34c-497f-1bb4-ca94-17b5e59d4c07")
public static String es_PE_FIELD_Accounting_ProductRevenue2_Name="Ventas";

@XendraField(AD_Column_ID="P_Revenue_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="c3edd678-19ad-3e9f-73d1-a360285d3881",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ca9ec34c-497f-1bb4-ca94-17b5e59d4c07")
public static final String FIELDNAME_Accounting_ProductRevenue2="ca9ec34c-497f-1bb4-ca94-17b5e59d4c07";

@XendraTrl(Identifier="4150097c-7513-6091-c0c4-ae5aadbac772")
public static String es_PE_FIELD_Accounting_ProductRevenue3_Description="Cuenta de Ingresos por el producto (Cuenta de Ventas)";

@XendraTrl(Identifier="4150097c-7513-6091-c0c4-ae5aadbac772")
public static String es_PE_FIELD_Accounting_ProductRevenue3_Help="Cuenta de Ingresos por el producto (Cuenta de Ventas)  indica la cuenta usada para registrar ingresos de ventas para este producto";

@XendraTrl(Identifier="4150097c-7513-6091-c0c4-ae5aadbac772")
public static String es_PE_FIELD_Accounting_ProductRevenue3_Name="Ventas";

@XendraField(AD_Column_ID="P_Revenue_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="da96e538-e53b-f58d-9068-afa8fee8e1fa",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4150097c-7513-6091-c0c4-ae5aadbac772")
public static final String FIELDNAME_Accounting_ProductRevenue3="4150097c-7513-6091-c0c4-ae5aadbac772";

@XendraTrl(Identifier="495a2590-5c80-f423-f50b-3a47dd8af421")
public static String es_PE_COLUMN_P_Revenue_Acct_Name="Ventas";

@XendraColumn(AD_Element_ID="fda0d9fb-f4a4-e939-7cf3-6b0ec27ece2f",ColumnName="P_Revenue_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="495a2590-5c80-f423-f50b-3a47dd8af421",
Synchronized="2017-08-05 16:55:22.0")
/** Column name P_Revenue_Acct */
public static final String COLUMNNAME_P_Revenue_Acct = "P_Revenue_Acct";
/** Set Trade Discount Granted.
@param P_TradeDiscountGrant_Acct Trade Discount Granted Account */
public void setP_TradeDiscountGrant_Acct (int P_TradeDiscountGrant_Acct)
{
set_Value (COLUMNNAME_P_TradeDiscountGrant_Acct, Integer.valueOf(P_TradeDiscountGrant_Acct));
}
/** Get Trade Discount Granted.
@return Trade Discount Granted Account */
public int getP_TradeDiscountGrant_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_P_TradeDiscountGrant_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="19952d5a-e9dd-d811-6f13-edd3854c1ec6")
public static String es_PE_FIELD_Accounting_TradeDiscountGranted_Description="Cuenta de descuento comercial concedido";

@XendraTrl(Identifier="19952d5a-e9dd-d811-6f13-edd3854c1ec6")
public static String es_PE_FIELD_Accounting_TradeDiscountGranted_Help="La cuenta de descuento comercial concedido indica la cuenta para descuento comercial concedido en facturas de ventas";

@XendraTrl(Identifier="19952d5a-e9dd-d811-6f13-edd3854c1ec6")
public static String es_PE_FIELD_Accounting_TradeDiscountGranted_Name="Descuento Comercial Concedido";

@XendraField(AD_Column_ID="P_TradeDiscountGrant_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="6ad98ef2-6490-99f3-fe7f-778b89fb9e8b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="19952d5a-e9dd-d811-6f13-edd3854c1ec6")
public static final String FIELDNAME_Accounting_TradeDiscountGranted="19952d5a-e9dd-d811-6f13-edd3854c1ec6";

@XendraTrl(Identifier="1209bf6c-b617-4eac-f059-c230db427df8")
public static String es_PE_FIELD_Accounting_TradeDiscountGranted2_Description="Cuenta de descuento comercial concedido";

@XendraTrl(Identifier="1209bf6c-b617-4eac-f059-c230db427df8")
public static String es_PE_FIELD_Accounting_TradeDiscountGranted2_Help="La cuenta de descuento comercial concedido indica la cuenta para descuento comercial concedido en facturas de ventas";

@XendraTrl(Identifier="1209bf6c-b617-4eac-f059-c230db427df8")
public static String es_PE_FIELD_Accounting_TradeDiscountGranted2_Name="Descuento Comercial Concedido";

@XendraField(AD_Column_ID="P_TradeDiscountGrant_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="c3edd678-19ad-3e9f-73d1-a360285d3881",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1209bf6c-b617-4eac-f059-c230db427df8")
public static final String FIELDNAME_Accounting_TradeDiscountGranted2="1209bf6c-b617-4eac-f059-c230db427df8";

@XendraTrl(Identifier="284fed57-6bea-9473-ab57-4db5f2fe7acc")
public static String es_PE_FIELD_Accounting_TradeDiscountGranted3_Description="Cuenta de descuento comercial concedido";

@XendraTrl(Identifier="284fed57-6bea-9473-ab57-4db5f2fe7acc")
public static String es_PE_FIELD_Accounting_TradeDiscountGranted3_Help="La cuenta de descuento comercial concedido indica la cuenta para descuento comercial concedido en facturas de ventas";

@XendraTrl(Identifier="284fed57-6bea-9473-ab57-4db5f2fe7acc")
public static String es_PE_FIELD_Accounting_TradeDiscountGranted3_Name="Descuento Comercial Concedido";

@XendraField(AD_Column_ID="P_TradeDiscountGrant_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="da96e538-e53b-f58d-9068-afa8fee8e1fa",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="284fed57-6bea-9473-ab57-4db5f2fe7acc")
public static final String FIELDNAME_Accounting_TradeDiscountGranted3="284fed57-6bea-9473-ab57-4db5f2fe7acc";

@XendraTrl(Identifier="e5b2240c-c8e5-0d4c-7b25-283b0daa61b1")
public static String es_PE_COLUMN_P_TradeDiscountGrant_Acct_Name="Descuento Comercial Concedido";

@XendraColumn(AD_Element_ID="e9f9bf44-94ac-4d3b-b330-3bc1a7a4c6d8",
ColumnName="P_TradeDiscountGrant_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e5b2240c-c8e5-0d4c-7b25-283b0daa61b1",Synchronized="2017-08-05 16:55:22.0")
/** Column name P_TradeDiscountGrant_Acct */
public static final String COLUMNNAME_P_TradeDiscountGrant_Acct = "P_TradeDiscountGrant_Acct";
/** Set Trade Discount Received.
@param P_TradeDiscountRec_Acct Trade Discount Receivable Account */
public void setP_TradeDiscountRec_Acct (int P_TradeDiscountRec_Acct)
{
set_Value (COLUMNNAME_P_TradeDiscountRec_Acct, Integer.valueOf(P_TradeDiscountRec_Acct));
}
/** Get Trade Discount Received.
@return Trade Discount Receivable Account */
public int getP_TradeDiscountRec_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_P_TradeDiscountRec_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c20cfd4d-5fd8-77f0-6823-4886699cbab7")
public static String es_PE_FIELD_Accounting_TradeDiscountReceived_Description="Cuenta de descuento comercial recibido";

@XendraTrl(Identifier="c20cfd4d-5fd8-77f0-6823-4886699cbab7")
public static String es_PE_FIELD_Accounting_TradeDiscountReceived_Help="La cuenta de descuento comercial recibido indica la cuenta para descuento en facturas de proveedores";

@XendraTrl(Identifier="c20cfd4d-5fd8-77f0-6823-4886699cbab7")
public static String es_PE_FIELD_Accounting_TradeDiscountReceived_Name="Descuento Comercial Recibido";

@XendraField(AD_Column_ID="P_TradeDiscountRec_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="6ad98ef2-6490-99f3-fe7f-778b89fb9e8b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c20cfd4d-5fd8-77f0-6823-4886699cbab7")
public static final String FIELDNAME_Accounting_TradeDiscountReceived="c20cfd4d-5fd8-77f0-6823-4886699cbab7";

@XendraTrl(Identifier="eebd4613-c828-af0f-25a7-555d1bca8fb9")
public static String es_PE_FIELD_Accounting_TradeDiscountReceived2_Description="Cuenta de descuento comercial recibido";

@XendraTrl(Identifier="eebd4613-c828-af0f-25a7-555d1bca8fb9")
public static String es_PE_FIELD_Accounting_TradeDiscountReceived2_Help="La cuenta de descuento comercial recibido indica la cuenta para descuento en facturas de proveedores";

@XendraTrl(Identifier="eebd4613-c828-af0f-25a7-555d1bca8fb9")
public static String es_PE_FIELD_Accounting_TradeDiscountReceived2_Name="Descuento Comercial Recibido";

@XendraField(AD_Column_ID="P_TradeDiscountRec_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="c3edd678-19ad-3e9f-73d1-a360285d3881",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eebd4613-c828-af0f-25a7-555d1bca8fb9")
public static final String FIELDNAME_Accounting_TradeDiscountReceived2="eebd4613-c828-af0f-25a7-555d1bca8fb9";

@XendraTrl(Identifier="11bdd341-84f1-1bcf-349c-712474beb945")
public static String es_PE_FIELD_Accounting_TradeDiscountReceived3_Description="Cuenta de descuento comercial recibido";

@XendraTrl(Identifier="11bdd341-84f1-1bcf-349c-712474beb945")
public static String es_PE_FIELD_Accounting_TradeDiscountReceived3_Help="La cuenta de descuento comercial recibido indica la cuenta para descuento en facturas de proveedores";

@XendraTrl(Identifier="11bdd341-84f1-1bcf-349c-712474beb945")
public static String es_PE_FIELD_Accounting_TradeDiscountReceived3_Name="Descuento Comercial Recibido";

@XendraField(AD_Column_ID="P_TradeDiscountRec_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="da96e538-e53b-f58d-9068-afa8fee8e1fa",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="11bdd341-84f1-1bcf-349c-712474beb945")
public static final String FIELDNAME_Accounting_TradeDiscountReceived3="11bdd341-84f1-1bcf-349c-712474beb945";

@XendraTrl(Identifier="06408103-df5a-e24b-0b09-d8d4ed6fe319")
public static String es_PE_COLUMN_P_TradeDiscountRec_Acct_Name="Descuento Comercial Recibido";

@XendraColumn(AD_Element_ID="943a9f87-e68a-413b-f934-894f3f19723b",
ColumnName="P_TradeDiscountRec_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="06408103-df5a-e24b-0b09-d8d4ed6fe319",Synchronized="2017-08-05 16:55:22.0")
/** Column name P_TradeDiscountRec_Acct */
public static final String COLUMNNAME_P_TradeDiscountRec_Acct = "P_TradeDiscountRec_Acct";
}
