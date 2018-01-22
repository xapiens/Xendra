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
import org.compiere.model.reference.REF_C_AcctSchemaCostingLevel;
import org.compiere.model.reference.REF_C_AcctSchemaCostingMethod;
/** Generated Model for M_Product_Category_Acct
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_Product_Category_Acct extends PO
{
/** Standard Constructor
@param ctx context
@param M_Product_Category_Acct_ID id
@param trxName transaction
*/
public X_M_Product_Category_Acct (Properties ctx, int M_Product_Category_Acct_ID, String trxName)
{
super (ctx, M_Product_Category_Acct_ID, trxName);
/** if (M_Product_Category_Acct_ID == 0)
{
setC_AcctSchema_ID (0);
setM_Product_Category_ID (0);
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
public X_M_Product_Category_Acct (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=401 */
public static int Table_ID=MTable.getTable_ID("M_Product_Category_Acct");

@XendraTrl(Identifier="50c4478f-ba60-5ac1-ecd2-3aad83725e92")
public static String es_PE_TAB_Accounting_Description="Parámetros de Contabilidad";

@XendraTrl(Identifier="50c4478f-ba60-5ac1-ecd2-3aad83725e92")
public static String es_PE_TAB_Accounting_Name="Contabilidad";

@XendraTrl(Identifier="50c4478f-ba60-5ac1-ecd2-3aad83725e92")
public static String es_PE_TAB_Accounting_Help="La pestaña Contabilidad define los parámetros contables. Cualquier producto que sea parte de esta categoría heredará sus parámetros contables.";

@XendraTab(Name="Accounting",Description="Accounting Parameters",
Help="The Accounting Tab defines default accounting parameters.  Any product that uses a product category can inherit its default accounting parameters.  If the Costing method is not defined, the default costing method of the accounting schema is used.",
AD_Window_ID="4e60880d-1a9c-ed56-dba9-3ba9d80c8b83",SeqNo=20,TabLevel=1,IsSingleRow=true,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="50c4478f-ba60-5ac1-ecd2-3aad83725e92",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Accounting="50c4478f-ba60-5ac1-ecd2-3aad83725e92";

@XendraTrl(Identifier="a41701ec-9853-8531-0204-41031a1079a9")
public static String es_PE_TABLE_M_Product_Category_Acct_Name="M_Product_Category_Acct";


@XendraTable(Name="Product Category Acct",Description="",Help="",
TableName="M_Product_Category_Acct",AccessLevel="3",
AD_Window_ID="4e60880d-1a9c-ed56-dba9-3ba9d80c8b83",AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.material",Identifier="a41701ec-9853-8531-0204-41031a1079a9",
Synchronized="2017-08-16 11:43:28.0")
/** TableName=M_Product_Category_Acct */
public static final String Table_Name="M_Product_Category_Acct";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_Product_Category_Acct");

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
    Table_ID = MTable.getTable_ID("M_Product_Category_Acct");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_Product_Category_Acct[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="aa741637-2c9c-7e01-c3ce-bb161d768a2f")
public static String es_PE_FIELD_Accounting_AccountingSchema_Description="Reglas para contabilizar";

@XendraTrl(Identifier="aa741637-2c9c-7e01-c3ce-bb161d768a2f")
public static String es_PE_FIELD_Accounting_AccountingSchema_Help="Un esquema contable define las reglas contables usadas tales como método de costeo; moneda y calendario";

@XendraTrl(Identifier="aa741637-2c9c-7e01-c3ce-bb161d768a2f")
public static String es_PE_FIELD_Accounting_AccountingSchema_Name="Esquema Contable";

@XendraField(AD_Column_ID="C_AcctSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="50c4478f-ba60-5ac1-ecd2-3aad83725e92",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aa741637-2c9c-7e01-c3ce-bb161d768a2f")
public static final String FIELDNAME_Accounting_AccountingSchema="aa741637-2c9c-7e01-c3ce-bb161d768a2f";

@XendraTrl(Identifier="a735f274-4f08-5e91-9180-2b962a736472")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a735f274-4f08-5e91-9180-2b962a736472",
Synchronized="2017-08-05 16:55:23.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";

/** CostingLevel AD_Reference=50276432-1362-79b4-e882-a2d08541856b */
public static final int COSTINGLEVEL_AD_Reference_ID=355;
/** Set Costing Level.
@param CostingLevel The lowest level to accumulate Costing Information */
public void setCostingLevel (String CostingLevel)
{
if (CostingLevel == null || CostingLevel.equals(REF_C_AcctSchemaCostingLevel.BatchLot) || CostingLevel.equals(REF_C_AcctSchemaCostingLevel.Client) || CostingLevel.equals(REF_C_AcctSchemaCostingLevel.Organization));
 else throw new IllegalArgumentException ("CostingLevel Invalid value - " + CostingLevel + " - Reference_ID=355 - B - C - O");
if (CostingLevel != null && CostingLevel.length() > 1)
{
log.warning("Length > 1 - truncated");
CostingLevel = CostingLevel.substring(0,0);
}
set_Value (COLUMNNAME_CostingLevel, CostingLevel);
}
/** Get Costing Level.
@return The lowest level to accumulate Costing Information */
public String getCostingLevel() 
{
return (String)get_Value(COLUMNNAME_CostingLevel);
}

@XendraTrl(Identifier="6ef72e36-8280-1478-b394-27d9e5dc4eb0")
public static String es_PE_FIELD_Accounting_CostingLevel_Description="El nivel mas bajo para acumular información del costeo";

@XendraTrl(Identifier="6ef72e36-8280-1478-b394-27d9e5dc4eb0")
public static String es_PE_FIELD_Accounting_CostingLevel_Help="Si desea mantener diferentes costos por organización (Almacén) o por Lote/No de Lote, cerciorese que usted define el costo para cada organización  o  Lote/No de Lote. El nivel de Costeo es definido  por Esquema Contable y puede ser sobreescrito mediante Categoría de Producto y Esquema Contable.";

@XendraTrl(Identifier="6ef72e36-8280-1478-b394-27d9e5dc4eb0")
public static String es_PE_FIELD_Accounting_CostingLevel_Name="Nivel de Costeo";

@XendraField(AD_Column_ID="CostingLevel",IsCentrallyMaintained=true,
AD_Tab_ID="50c4478f-ba60-5ac1-ecd2-3aad83725e92",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6ef72e36-8280-1478-b394-27d9e5dc4eb0")
public static final String FIELDNAME_Accounting_CostingLevel="6ef72e36-8280-1478-b394-27d9e5dc4eb0";

@XendraTrl(Identifier="7c50e05f-9994-48a7-7d59-9c6a25cf8681")
public static String es_PE_COLUMN_CostingLevel_Name="Nivel de Costeo";

@XendraColumn(AD_Element_ID="75255888-a130-58b8-ac62-be5642b80011",ColumnName="CostingLevel",
AD_Reference_ID=17,AD_Reference_Value_ID="50276432-1362-79b4-e882-a2d08541856b",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7c50e05f-9994-48a7-7d59-9c6a25cf8681",Synchronized="2017-08-05 16:55:24.0")
/** Column name CostingLevel */
public static final String COLUMNNAME_CostingLevel = "CostingLevel";

/** CostingMethod AD_Reference=f784bd15-8b38-c388-3a0e-a0ae23b717ec */
public static final int COSTINGMETHOD_AD_Reference_ID=122;
/** Set Costing Method.
@param CostingMethod Indicates how Costs will be calculated */
public void setCostingMethod (String CostingMethod)
{
if (CostingMethod == null || CostingMethod.equals(REF_C_AcctSchemaCostingMethod.LastPOPrice) || CostingMethod.equals(REF_C_AcctSchemaCostingMethod._) || CostingMethod.equals(REF_C_AcctSchemaCostingMethod.StandardCosting) || CostingMethod.equals(REF_C_AcctSchemaCostingMethod.AveragePO) || CostingMethod.equals(REF_C_AcctSchemaCostingMethod.Lifo) || CostingMethod.equals(REF_C_AcctSchemaCostingMethod.Fifo) || CostingMethod.equals(REF_C_AcctSchemaCostingMethod.AverageInvoice) || CostingMethod.equals(REF_C_AcctSchemaCostingMethod.AverageWarehouse) || CostingMethod.equals(REF_C_AcctSchemaCostingMethod.LastInvoice) || CostingMethod.equals(REF_C_AcctSchemaCostingMethod.UserDefined));
 else throw new IllegalArgumentException ("CostingMethod Invalid value - " + CostingMethod + " - Reference_ID=122 - p - x - S - A - L - F - I - W - i - U");
if (CostingMethod != null && CostingMethod.length() > 1)
{
log.warning("Length > 1 - truncated");
CostingMethod = CostingMethod.substring(0,0);
}
set_Value (COLUMNNAME_CostingMethod, CostingMethod);
}
/** Get Costing Method.
@return Indicates how Costs will be calculated */
public String getCostingMethod() 
{
return (String)get_Value(COLUMNNAME_CostingMethod);
}

@XendraTrl(Identifier="eef1f457-8277-6bb2-5e2e-fec27c5377d1")
public static String es_PE_FIELD_Accounting_CostingMethod_Description="Indica cómo serán calculados los costos";

@XendraTrl(Identifier="eef1f457-8277-6bb2-5e2e-fec27c5377d1")
public static String es_PE_FIELD_Accounting_CostingMethod_Help="El método de costeo indica cómo se calcularán los costos (Estándar; promedio)";

@XendraTrl(Identifier="eef1f457-8277-6bb2-5e2e-fec27c5377d1")
public static String es_PE_FIELD_Accounting_CostingMethod_Name="Método de Costeo";

@XendraField(AD_Column_ID="CostingMethod",IsCentrallyMaintained=true,
AD_Tab_ID="50c4478f-ba60-5ac1-ecd2-3aad83725e92",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eef1f457-8277-6bb2-5e2e-fec27c5377d1")
public static final String FIELDNAME_Accounting_CostingMethod="eef1f457-8277-6bb2-5e2e-fec27c5377d1";

@XendraTrl(Identifier="32e62c19-a191-4489-8011-6c2a2db2ebb7")
public static String es_PE_COLUMN_CostingMethod_Name="Método de Costeo";

@XendraColumn(AD_Element_ID="d3c72366-8d7e-1b49-ef94-f5412c3f434c",ColumnName="CostingMethod",
AD_Reference_ID=17,AD_Reference_Value_ID="f784bd15-8b38-c388-3a0e-a0ae23b717ec",
AD_Val_Rule_ID="62983f4c-0f5e-8a77-2189-53895351bcb2",FieldLength=1,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="32e62c19-a191-4489-8011-6c2a2db2ebb7",
Synchronized="2017-08-05 16:55:24.0")
/** Column name CostingMethod */
public static final String COLUMNNAME_CostingMethod = "CostingMethod";
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
@XendraTrl(Identifier="04552248-6640-4fc3-ba0c-e31d139e6ce6")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="04552248-6640-4fc3-ba0c-e31d139e6ce6",
Synchronized="2017-08-05 16:55:24.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Product Category.
@param M_Product_Category_ID Category of a Product */
public void setM_Product_Category_ID (int M_Product_Category_ID)
{
if (M_Product_Category_ID < 1) throw new IllegalArgumentException ("M_Product_Category_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Product_Category_ID, Integer.valueOf(M_Product_Category_ID));
}
/** Get Product Category.
@return Category of a Product */
public int getM_Product_Category_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_Category_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0a99bd5b-e7f7-8ea8-a5ad-7433d27fc3f5")
public static String es_PE_FIELD_Accounting_ProductCategory_Description="Categoría de la que este producto es parte";

@XendraTrl(Identifier="0a99bd5b-e7f7-8ea8-a5ad-7433d27fc3f5")
public static String es_PE_FIELD_Accounting_ProductCategory_Help="Identifica la categoría a la que pertenece este producto. Las categorías del producto son usadas para el cálculo de precios";

@XendraTrl(Identifier="0a99bd5b-e7f7-8ea8-a5ad-7433d27fc3f5")
public static String es_PE_FIELD_Accounting_ProductCategory_Name="Categoría del Producto";

@XendraField(AD_Column_ID="M_Product_Category_ID",IsCentrallyMaintained=true,
AD_Tab_ID="50c4478f-ba60-5ac1-ecd2-3aad83725e92",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0a99bd5b-e7f7-8ea8-a5ad-7433d27fc3f5")
public static final String FIELDNAME_Accounting_ProductCategory="0a99bd5b-e7f7-8ea8-a5ad-7433d27fc3f5";

@XendraTrl(Identifier="38956344-19b0-9be0-1532-f9e066ff7a6a")
public static String es_PE_COLUMN_M_Product_Category_ID_Name="Categoría del Producto";

@XendraColumn(AD_Element_ID="80d3e0bb-473b-67d4-42d5-1d776006a69c",
ColumnName="M_Product_Category_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="38956344-19b0-9be0-1532-f9e066ff7a6a",Synchronized="2017-08-05 16:55:24.0")
/** Column name M_Product_Category_ID */
public static final String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";
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

@XendraTrl(Identifier="8b4d1179-9eb2-4e04-810b-2cf407a204c0")
public static String es_PE_FIELD_Accounting_ProductAsset_Description="Cuenta para inventario del producto";

@XendraTrl(Identifier="8b4d1179-9eb2-4e04-810b-2cf407a204c0")
public static String es_PE_FIELD_Accounting_ProductAsset_Help="La cuenta Inventario indica la cuenta usada para valuar los productos en inventario.";

@XendraTrl(Identifier="8b4d1179-9eb2-4e04-810b-2cf407a204c0")
public static String es_PE_FIELD_Accounting_ProductAsset_Name="Inventario de Producto";

@XendraField(AD_Column_ID="P_Asset_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="50c4478f-ba60-5ac1-ecd2-3aad83725e92",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8b4d1179-9eb2-4e04-810b-2cf407a204c0")
public static final String FIELDNAME_Accounting_ProductAsset="8b4d1179-9eb2-4e04-810b-2cf407a204c0";

@XendraTrl(Identifier="187f0b54-e753-37e6-d004-1864fb076067")
public static String es_PE_COLUMN_P_Asset_Acct_Name="Inventario de Producto";

@XendraColumn(AD_Element_ID="d30f7070-17c9-1af8-c525-961260c4aa6b",ColumnName="P_Asset_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="187f0b54-e753-37e6-d004-1864fb076067",
Synchronized="2017-08-05 16:55:24.0")
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

@XendraTrl(Identifier="c84846f6-a651-9370-6c5c-6d768f6987d1")
public static String es_PE_FIELD_Accounting_ProductCOGS_Description="Cuenta para costo de producto vendido";

@XendraTrl(Identifier="c84846f6-a651-9370-6c5c-6d768f6987d1")
public static String es_PE_FIELD_Accounting_ProductCOGS_Help="La cuenta COGS de producto indica la cuenta usada para registrar costos asociados con la venta de este producto";

@XendraTrl(Identifier="c84846f6-a651-9370-6c5c-6d768f6987d1")
public static String es_PE_FIELD_Accounting_ProductCOGS_Name="COGS del Producto";

@XendraField(AD_Column_ID="P_COGS_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="50c4478f-ba60-5ac1-ecd2-3aad83725e92",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c84846f6-a651-9370-6c5c-6d768f6987d1")
public static final String FIELDNAME_Accounting_ProductCOGS="c84846f6-a651-9370-6c5c-6d768f6987d1";

@XendraTrl(Identifier="4d88b4ee-2a45-4396-f004-ef895b294ff2")
public static String es_PE_COLUMN_P_COGS_Acct_Name="COGS del Producto";

@XendraColumn(AD_Element_ID="2909678b-c885-6958-6484-c07916c61343",ColumnName="P_COGS_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4d88b4ee-2a45-4396-f004-ef895b294ff2",
Synchronized="2017-08-05 16:55:24.0")
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

@XendraTrl(Identifier="0de00fe1-367a-5f40-4232-f18036b12ee3")
public static String es_PE_FIELD_Accounting_CostAdjustment_Description="Ajustar Cuenta Costo de Producto";

@XendraTrl(Identifier="0de00fe1-367a-5f40-4232-f18036b12ee3")
public static String es_PE_FIELD_Accounting_CostAdjustment_Help="Cuenta empleada para contabilizar ajustes al costo del producto (ej.Costos Adicionales)";

@XendraTrl(Identifier="0de00fe1-367a-5f40-4232-f18036b12ee3")
public static String es_PE_FIELD_Accounting_CostAdjustment_Name="Ajustar Costo";

@XendraField(AD_Column_ID="P_CostAdjustment_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="50c4478f-ba60-5ac1-ecd2-3aad83725e92",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0de00fe1-367a-5f40-4232-f18036b12ee3")
public static final String FIELDNAME_Accounting_CostAdjustment="0de00fe1-367a-5f40-4232-f18036b12ee3";

@XendraTrl(Identifier="00c38fe8-20cc-ceb0-4905-403939c74808")
public static String es_PE_COLUMN_P_CostAdjustment_Acct_Name="Ajustar Costo";

@XendraColumn(AD_Element_ID="ad309537-4749-1eec-078d-4d547978d2b6",
ColumnName="P_CostAdjustment_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="00c38fe8-20cc-ceb0-4905-403939c74808",Synchronized="2017-08-05 16:55:24.0")
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

@XendraTrl(Identifier="f8193b69-2be0-b2b4-51a3-86b10b66c8dd")
public static String es_PE_FIELD_Accounting_ProductExpense_Description="Cuenta para gastos por el producto";

@XendraTrl(Identifier="f8193b69-2be0-b2b4-51a3-86b10b66c8dd")
public static String es_PE_FIELD_Accounting_ProductExpense_Help="La cuenta gastos para el producto indica la cuenta usada para registrar gastos asociados con estos productos.";

@XendraTrl(Identifier="f8193b69-2be0-b2b4-51a3-86b10b66c8dd")
public static String es_PE_FIELD_Accounting_ProductExpense_Name="Discrepancia en Producto";

@XendraField(AD_Column_ID="P_Expense_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="50c4478f-ba60-5ac1-ecd2-3aad83725e92",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f8193b69-2be0-b2b4-51a3-86b10b66c8dd")
public static final String FIELDNAME_Accounting_ProductExpense="f8193b69-2be0-b2b4-51a3-86b10b66c8dd";

@XendraTrl(Identifier="b92e663e-9e6e-39d8-ec91-0e3e2b6130a4")
public static String es_PE_COLUMN_P_Expense_Acct_Name="Discrepancia en Producto";

@XendraColumn(AD_Element_ID="3b747810-2ea8-e75f-5550-9ef4be318c0a",ColumnName="P_Expense_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b92e663e-9e6e-39d8-ec91-0e3e2b6130a4",
Synchronized="2017-08-05 16:55:24.0")
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

@XendraTrl(Identifier="ad8d80fe-bed1-b0f3-721e-6d10be1a2444")
public static String es_PE_FIELD_Accounting_InventoryClearing_Description="Product Inventory Clearing Account";

@XendraTrl(Identifier="ad8d80fe-bed1-b0f3-721e-6d10be1a2444")
public static String es_PE_FIELD_Accounting_InventoryClearing_Help="Account used for posting matched product (item) expenses (e.g. AP Invoice, Invoice Match).  You would use a different account then Product Expense, if you want to differentate service related costs from item related costs. The balance on the clearing account should be zero and accounts for the timing difference between invoice receipt and matching.";

@XendraTrl(Identifier="ad8d80fe-bed1-b0f3-721e-6d10be1a2444")
public static String es_PE_FIELD_Accounting_InventoryClearing_Name="Compras";

@XendraField(AD_Column_ID="P_InventoryClearing_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="50c4478f-ba60-5ac1-ecd2-3aad83725e92",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ad8d80fe-bed1-b0f3-721e-6d10be1a2444")
public static final String FIELDNAME_Accounting_InventoryClearing="ad8d80fe-bed1-b0f3-721e-6d10be1a2444";

@XendraTrl(Identifier="31697f75-2a3e-6803-4981-b330e033f9b3")
public static String es_PE_COLUMN_P_InventoryClearing_Acct_Name="Inventory Clearing";

@XendraColumn(AD_Element_ID="df102fda-6348-7e51-ccc2-eb5639647e89",
ColumnName="P_InventoryClearing_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="31697f75-2a3e-6803-4981-b330e033f9b3",Synchronized="2017-08-05 16:55:24.0")
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

@XendraTrl(Identifier="3f8bb6a9-670e-9c59-ece7-7d63fefc6f68")
public static String es_PE_FIELD_Accounting_InvoicePriceVariance_Description="Variación entre el costo y el precio de la factura (IPV)";

@XendraTrl(Identifier="3f8bb6a9-670e-9c59-ece7-7d63fefc6f68")
public static String es_PE_FIELD_Accounting_InvoicePriceVariance_Help="La Variación en el precio de la factura se usa para reflejar la diferencia entre el costo actual y el precio de la factura.";

@XendraTrl(Identifier="3f8bb6a9-670e-9c59-ece7-7d63fefc6f68")
public static String es_PE_FIELD_Accounting_InvoicePriceVariance_Name="Variación en Precio de la Factura";

@XendraField(AD_Column_ID="P_InvoicePriceVariance_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="50c4478f-ba60-5ac1-ecd2-3aad83725e92",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3f8bb6a9-670e-9c59-ece7-7d63fefc6f68")
public static final String FIELDNAME_Accounting_InvoicePriceVariance="3f8bb6a9-670e-9c59-ece7-7d63fefc6f68";

@XendraTrl(Identifier="73405ffc-9455-e60f-132e-f810644edf33")
public static String es_PE_COLUMN_P_InvoicePriceVariance_Acct_Name="Variación en Precio de la Factura";

@XendraColumn(AD_Element_ID="52fdc368-6796-1aa4-732e-8b6e615d3483",
ColumnName="P_InvoicePriceVariance_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="73405ffc-9455-e60f-132e-f810644edf33",Synchronized="2017-08-05 16:55:24.0")
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

@XendraTrl(Identifier="13d50ee9-9601-c6b8-5462-c63afdbc3754")
public static String es_PE_FIELD_Accounting_PurchasePriceVariance_Description="Variación entre le costo estándar y el precio de la orden de compra.";

@XendraTrl(Identifier="13d50ee9-9601-c6b8-5462-c63afdbc3754")
public static String es_PE_FIELD_Accounting_PurchasePriceVariance_Help="La Variación en precios de compra es usada en costeo estándar. Refleja la diferencia entre el costo estándar y el precio de la orden de compra";

@XendraTrl(Identifier="13d50ee9-9601-c6b8-5462-c63afdbc3754")
public static String es_PE_FIELD_Accounting_PurchasePriceVariance_Name="Variación Precio de OC";

@XendraField(AD_Column_ID="P_PurchasePriceVariance_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="50c4478f-ba60-5ac1-ecd2-3aad83725e92",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="13d50ee9-9601-c6b8-5462-c63afdbc3754")
public static final String FIELDNAME_Accounting_PurchasePriceVariance="13d50ee9-9601-c6b8-5462-c63afdbc3754";

@XendraTrl(Identifier="77b54db7-8695-89cc-a6b9-2656d8b8b811")
public static String es_PE_COLUMN_P_PurchasePriceVariance_Acct_Name="Variación Precio de OC";

@XendraColumn(AD_Element_ID="b7204f76-9f57-b30e-5da5-8c9791c46c2b",
ColumnName="P_PurchasePriceVariance_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="77b54db7-8695-89cc-a6b9-2656d8b8b811",Synchronized="2017-08-05 16:55:24.0")
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

@XendraTrl(Identifier="0064e059-c6b7-2924-08ba-5e96de783586")
public static String es_PE_FIELD_Accounting_ProductRevenue_Description="Cuenta de Ingresos por el producto (Cuenta de Ventas)";

@XendraTrl(Identifier="0064e059-c6b7-2924-08ba-5e96de783586")
public static String es_PE_FIELD_Accounting_ProductRevenue_Help="Cuenta de Ingresos por el producto (Cuenta de Ventas)  indica la cuenta usada para registrar ingresos de ventas para este producto";

@XendraTrl(Identifier="0064e059-c6b7-2924-08ba-5e96de783586")
public static String es_PE_FIELD_Accounting_ProductRevenue_Name="Ventas";

@XendraField(AD_Column_ID="P_Revenue_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="50c4478f-ba60-5ac1-ecd2-3aad83725e92",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0064e059-c6b7-2924-08ba-5e96de783586")
public static final String FIELDNAME_Accounting_ProductRevenue="0064e059-c6b7-2924-08ba-5e96de783586";

@XendraTrl(Identifier="a8f5271b-482e-dbe3-3d46-e20efb3f208d")
public static String es_PE_COLUMN_P_Revenue_Acct_Name="Ventas";

@XendraColumn(AD_Element_ID="fda0d9fb-f4a4-e939-7cf3-6b0ec27ece2f",ColumnName="P_Revenue_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a8f5271b-482e-dbe3-3d46-e20efb3f208d",
Synchronized="2017-08-05 16:55:24.0")
/** Column name P_Revenue_Acct */
public static final String COLUMNNAME_P_Revenue_Acct = "P_Revenue_Acct";
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

@XendraTrl(Identifier="95a3d5ce-3070-a22f-fe67-642a9fad0d5a")
public static String es_PE_FIELD_Accounting_ProcessNow_Description="Copiar y sobreescribir las cuentas a productos de esta categoría";

@XendraTrl(Identifier="95a3d5ce-3070-a22f-fe67-642a9fad0d5a")
public static String es_PE_FIELD_Accounting_ProcessNow_Help="El proceso de copiar cuentas tomará las cuentas definidas para una categoría de producto y las copiará a cualquier producto que que haga referencia a esta categoría. Si una cuenta existe a nivel de producto sera sobreescrita";

@XendraTrl(Identifier="95a3d5ce-3070-a22f-fe67-642a9fad0d5a")
public static String es_PE_FIELD_Accounting_ProcessNow_Name="Copiar Cuentas";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="50c4478f-ba60-5ac1-ecd2-3aad83725e92",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="95a3d5ce-3070-a22f-fe67-642a9fad0d5a")
public static final String FIELDNAME_Accounting_ProcessNow="95a3d5ce-3070-a22f-fe67-642a9fad0d5a";

@XendraTrl(Identifier="20a81e9f-e382-a4e7-60bf-ccb696644712")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="6b9c8610-e042-0dc8-9c0e-8912d5c39d4c",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="20a81e9f-e382-a4e7-60bf-ccb696644712",Synchronized="2017-08-05 16:55:24.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
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

@XendraTrl(Identifier="eafa5b07-bfc9-fa6a-14f2-878ebccff10d")
public static String es_PE_FIELD_Accounting_TradeDiscountGranted_Description="Cuenta de descuento comercial concedido";

@XendraTrl(Identifier="eafa5b07-bfc9-fa6a-14f2-878ebccff10d")
public static String es_PE_FIELD_Accounting_TradeDiscountGranted_Help="La cuenta de descuento comercial concedido indica la cuenta para descuento comercial concedido en facturas de ventas";

@XendraTrl(Identifier="eafa5b07-bfc9-fa6a-14f2-878ebccff10d")
public static String es_PE_FIELD_Accounting_TradeDiscountGranted_Name="Descuento Comercial Concedido";

@XendraField(AD_Column_ID="P_TradeDiscountGrant_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="50c4478f-ba60-5ac1-ecd2-3aad83725e92",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eafa5b07-bfc9-fa6a-14f2-878ebccff10d")
public static final String FIELDNAME_Accounting_TradeDiscountGranted="eafa5b07-bfc9-fa6a-14f2-878ebccff10d";

@XendraTrl(Identifier="6ae83c85-acea-8188-fa72-0fa201dde73c")
public static String es_PE_COLUMN_P_TradeDiscountGrant_Acct_Name="Descuento Comercial Concedido";

@XendraColumn(AD_Element_ID="e9f9bf44-94ac-4d3b-b330-3bc1a7a4c6d8",
ColumnName="P_TradeDiscountGrant_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6ae83c85-acea-8188-fa72-0fa201dde73c",Synchronized="2017-08-05 16:55:24.0")
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

@XendraTrl(Identifier="b311fb33-263e-3be2-0a10-3375b737ddff")
public static String es_PE_FIELD_Accounting_TradeDiscountReceived_Description="Cuenta de descuento comercial recibido";

@XendraTrl(Identifier="b311fb33-263e-3be2-0a10-3375b737ddff")
public static String es_PE_FIELD_Accounting_TradeDiscountReceived_Help="La cuenta de descuento comercial recibido indica la cuenta para descuento en facturas de proveedores";

@XendraTrl(Identifier="b311fb33-263e-3be2-0a10-3375b737ddff")
public static String es_PE_FIELD_Accounting_TradeDiscountReceived_Name="Descuento Comercial Recibido";

@XendraField(AD_Column_ID="P_TradeDiscountRec_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="50c4478f-ba60-5ac1-ecd2-3aad83725e92",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b311fb33-263e-3be2-0a10-3375b737ddff")
public static final String FIELDNAME_Accounting_TradeDiscountReceived="b311fb33-263e-3be2-0a10-3375b737ddff";

@XendraTrl(Identifier="d361931a-ceb4-7763-718c-36acd3a1d12c")
public static String es_PE_COLUMN_P_TradeDiscountRec_Acct_Name="Descuento Comercial Recibido";

@XendraColumn(AD_Element_ID="943a9f87-e68a-413b-f934-894f3f19723b",
ColumnName="P_TradeDiscountRec_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d361931a-ceb4-7763-718c-36acd3a1d12c",Synchronized="2017-08-05 16:55:24.0")
/** Column name P_TradeDiscountRec_Acct */
public static final String COLUMNNAME_P_TradeDiscountRec_Acct = "P_TradeDiscountRec_Acct";
}
