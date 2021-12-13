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
/** Generated Model for M_Cost
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_Cost extends PO
{
/** Standard Constructor
@param ctx context
@param M_Cost_ID id
@param trxName transaction
*/
public X_M_Cost (Properties ctx, int M_Cost_ID, String trxName)
{
super (ctx, M_Cost_ID, trxName);
/** if (M_Cost_ID == 0)
{
setC_AcctSchema_ID (0);
setCurrentCostPrice (Env.ZERO);
setCurrentQty (Env.ZERO);
setFutureCostPrice (Env.ZERO);
setM_AttributeSetInstance_ID (0);
setM_CostElement_ID (0);
setM_CostType_ID (0);
setM_Product_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_Cost (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=771 */
public static int Table_ID=MTable.getTable_ID("M_Cost");

@XendraTrl(Identifier="0259290c-e73c-147b-dc92-13ff832ff659")
public static String es_PE_TAB_ProductCosts_Description="Mantener costos del producto";

@XendraTrl(Identifier="0259290c-e73c-147b-dc92-13ff832ff659")
public static String es_PE_TAB_ProductCosts_Name="Costo del Producto";

@XendraTab(Name="Product Costs",Description="Maintain Product Costs",Help="",
AD_Window_ID="8983f195-c186-47e9-7541-aa6e2d0eebfc",SeqNo=20,TabLevel=1,IsSingleRow=true,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="6e0afae1-30f9-4db8-6bdb-c9ab6be1a685",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="0259290c-e73c-147b-dc92-13ff832ff659",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ProductCosts="0259290c-e73c-147b-dc92-13ff832ff659";

@XendraTrl(Identifier="afafad40-4ad1-b8f4-4993-929eb790e508")
public static String es_PE_TABLE_M_Cost_Name="Product Cost";

@XendraTable(Name="Product Cost",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="M_Cost",
AccessLevel="3",AD_Window_ID="8983f195-c186-47e9-7541-aa6e2d0eebfc",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="afafad40-4ad1-b8f4-4993-929eb790e508",Synchronized="2020-03-03 21:38:18.0")
/** TableName=M_Cost */
public static final String Table_Name="M_Cost";


@XendraIndex(Name="mcost_mproduct",Identifier="f845b070-b612-50ef-a9b3-0a70078001f8",
Column_Names="m_product_id",IsUnique="false",
TableIdentifier="f845b070-b612-50ef-a9b3-0a70078001f8",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_mcost_mproduct = "f845b070-b612-50ef-a9b3-0a70078001f8";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_Cost");

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
    Table_ID = MTable.getTable_ID("M_Cost");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_Cost[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="cd25d2fc-6de6-2997-961a-33d96b430797")
public static String es_PE_FIELD_ProductCosts_AccountingSchema_Name="Esquema Contable";

@XendraTrl(Identifier="cd25d2fc-6de6-2997-961a-33d96b430797")
public static String es_PE_FIELD_ProductCosts_AccountingSchema_Description="Reglas para contabilizar";

@XendraTrl(Identifier="cd25d2fc-6de6-2997-961a-33d96b430797")
public static String es_PE_FIELD_ProductCosts_AccountingSchema_Help="Un esquema contable define las reglas contables usadas tales como método de costeo; moneda y calendario";

@XendraField(AD_Column_ID="C_AcctSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0259290c-e73c-147b-dc92-13ff832ff659",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=2,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cd25d2fc-6de6-2997-961a-33d96b430797")
public static final String FIELDNAME_ProductCosts_AccountingSchema="cd25d2fc-6de6-2997-961a-33d96b430797";

@XendraTrl(Identifier="439ec17c-72d3-a6e9-e656-081c47d4d0c2")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="439ec17c-72d3-a6e9-e656-081c47d4d0c2",
Synchronized="2019-08-30 22:23:00.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
/** Set Costing Method.
@param CostingMethod Indicates how Costs will be calculated */
public void setCostingMethod (String CostingMethod)
{
throw new IllegalArgumentException ("CostingMethod is virtual column");
}
/** Get Costing Method.
@return Indicates how Costs will be calculated */
public String getCostingMethod() 
{
return (String)get_Value(COLUMNNAME_CostingMethod);
}

@XendraTrl(Identifier="4d9f3681-64e5-c934-f0df-6b11593b4712")
public static String es_PE_FIELD_ProductCosts_CostingMethod_Name="Método de Costeo";

@XendraTrl(Identifier="4d9f3681-64e5-c934-f0df-6b11593b4712")
public static String es_PE_FIELD_ProductCosts_CostingMethod_Description="Indica cómo serán calculados los costos";

@XendraTrl(Identifier="4d9f3681-64e5-c934-f0df-6b11593b4712")
public static String es_PE_FIELD_ProductCosts_CostingMethod_Help="El método de costeo indica cómo se calcularán los costos (Estándar; promedio)";

@XendraField(AD_Column_ID="CostingMethod",IsCentrallyMaintained=true,
AD_Tab_ID="0259290c-e73c-147b-dc92-13ff832ff659",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="1=2",DisplayLength=1,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4d9f3681-64e5-c934-f0df-6b11593b4712")
public static final String FIELDNAME_ProductCosts_CostingMethod="4d9f3681-64e5-c934-f0df-6b11593b4712";

@XendraTrl(Identifier="2a7407be-511b-51c4-723f-c7641dfd9047")
public static String es_PE_COLUMN_CostingMethod_Name="Método de Costeo";

@XendraColumn(AD_Element_ID="d3c72366-8d7e-1b49-ef94-f5412c3f434c",ColumnName="CostingMethod",
AD_Reference_ID=17,AD_Reference_Value_ID="f784bd15-8b38-c388-3a0e-a0ae23b717ec",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="x",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,
ColumnSQL="(SELECT COALESCE(CostingMethod, 'x') FROM M_CostElement ce WHERE M_Cost.M_CostElement_ID=ce.M_CostElement_ID)",
IsAllowLogging=false,Identifier="2a7407be-511b-51c4-723f-c7641dfd9047",
Synchronized="2019-08-30 22:23:00.0")
/** Column name CostingMethod */
public static final String COLUMNNAME_CostingMethod = "CostingMethod";
/** Set Accumulated Amt.
@param CumulatedAmt Total Amount */
public void setCumulatedAmt (BigDecimal CumulatedAmt)
{
set_ValueNoCheck (COLUMNNAME_CumulatedAmt, CumulatedAmt);
}
/** Get Accumulated Amt.
@return Total Amount */
public BigDecimal getCumulatedAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CumulatedAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="00644bad-494f-d833-9749-95f557ef2ca1")
public static String es_PE_FIELD_ProductCosts_AccumulatedAmt_Name="Monto Acumulado";

@XendraTrl(Identifier="00644bad-494f-d833-9749-95f557ef2ca1")
public static String es_PE_FIELD_ProductCosts_AccumulatedAmt_Description="Monto Total";

@XendraTrl(Identifier="00644bad-494f-d833-9749-95f557ef2ca1")
public static String es_PE_FIELD_ProductCosts_AccumulatedAmt_Help="Suma de Todos los Montos";

@XendraField(AD_Column_ID="CumulatedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="0259290c-e73c-147b-dc92-13ff832ff659",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="00644bad-494f-d833-9749-95f557ef2ca1")
public static final String FIELDNAME_ProductCosts_AccumulatedAmt="00644bad-494f-d833-9749-95f557ef2ca1";

@XendraTrl(Identifier="fb37d78e-81fb-cd98-9c6e-6b2fe50306a4")
public static String es_PE_COLUMN_CumulatedAmt_Name="Monto Acumulado";

@XendraColumn(AD_Element_ID="e318982b-9862-3397-2733-9b8848b1c96a",ColumnName="CumulatedAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fb37d78e-81fb-cd98-9c6e-6b2fe50306a4",
Synchronized="2019-08-30 22:23:00.0")
/** Column name CumulatedAmt */
public static final String COLUMNNAME_CumulatedAmt = "CumulatedAmt";
/** Set Accumulated Qty.
@param CumulatedQty Total Quantity */
public void setCumulatedQty (BigDecimal CumulatedQty)
{
set_ValueNoCheck (COLUMNNAME_CumulatedQty, CumulatedQty);
}
/** Get Accumulated Qty.
@return Total Quantity */
public BigDecimal getCumulatedQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CumulatedQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="ffbc2dff-163c-9139-af79-dfb8388cd096")
public static String es_PE_FIELD_ProductCosts_AccumulatedQty_Name="Cantidad Acumulada";

@XendraTrl(Identifier="ffbc2dff-163c-9139-af79-dfb8388cd096")
public static String es_PE_FIELD_ProductCosts_AccumulatedQty_Description="Cantidad Total";

@XendraTrl(Identifier="ffbc2dff-163c-9139-af79-dfb8388cd096")
public static String es_PE_FIELD_ProductCosts_AccumulatedQty_Help="Suma de Todas las Cantidades ";

@XendraField(AD_Column_ID="CumulatedQty",IsCentrallyMaintained=true,
AD_Tab_ID="0259290c-e73c-147b-dc92-13ff832ff659",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ffbc2dff-163c-9139-af79-dfb8388cd096")
public static final String FIELDNAME_ProductCosts_AccumulatedQty="ffbc2dff-163c-9139-af79-dfb8388cd096";

@XendraTrl(Identifier="89d7aa4c-f611-4199-ffc0-b19bb89fb6a0")
public static String es_PE_COLUMN_CumulatedQty_Name="Cantidad Acumulada";

@XendraColumn(AD_Element_ID="bfd753b6-b193-dad2-e1a0-6e18e598b71f",ColumnName="CumulatedQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="89d7aa4c-f611-4199-ffc0-b19bb89fb6a0",
Synchronized="2019-08-30 22:23:00.0")
/** Column name CumulatedQty */
public static final String COLUMNNAME_CumulatedQty = "CumulatedQty";
/** Set Current Cost Price.
@param CurrentCostPrice The currently used cost price */
public void setCurrentCostPrice (BigDecimal CurrentCostPrice)
{
if (CurrentCostPrice == null) throw new IllegalArgumentException ("CurrentCostPrice is mandatory.");
set_Value (COLUMNNAME_CurrentCostPrice, CurrentCostPrice);
}
/** Get Current Cost Price.
@return The currently used cost price */
public BigDecimal getCurrentCostPrice() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CurrentCostPrice);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="9dc0b3b2-f63b-defc-4d5c-49e13f68663f")
public static String es_PE_FIELD_ProductCosts_CurrentCostPrice_Name="Costo Actual";

@XendraTrl(Identifier="9dc0b3b2-f63b-defc-4d5c-49e13f68663f")
public static String es_PE_FIELD_ProductCosts_CurrentCostPrice_Description="Costo usado actualmente";

@XendraField(AD_Column_ID="CurrentCostPrice",IsCentrallyMaintained=true,
AD_Tab_ID="0259290c-e73c-147b-dc92-13ff832ff659",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9dc0b3b2-f63b-defc-4d5c-49e13f68663f")
public static final String FIELDNAME_ProductCosts_CurrentCostPrice="9dc0b3b2-f63b-defc-4d5c-49e13f68663f";

@XendraTrl(Identifier="6ae5d126-0e6b-9032-61e6-f9450eda53bb")
public static String es_PE_COLUMN_CurrentCostPrice_Name="Costo Actual";

@XendraColumn(AD_Element_ID="d07935b6-9cf0-08b3-6cd9-004592823010",ColumnName="CurrentCostPrice",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,
ReadOnlyLogic="@CostingMethod@!x & @CostingMethod@!S",IsIdentifier=false,SeqNo=0,
IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6ae5d126-0e6b-9032-61e6-f9450eda53bb",
Synchronized="2019-08-30 22:23:00.0")
/** Column name CurrentCostPrice */
public static final String COLUMNNAME_CurrentCostPrice = "CurrentCostPrice";
/** Set Current Quantity.
@param CurrentQty Current Quantity */
public void setCurrentQty (BigDecimal CurrentQty)
{
if (CurrentQty == null) throw new IllegalArgumentException ("CurrentQty is mandatory.");
set_Value (COLUMNNAME_CurrentQty, CurrentQty);
}
/** Get Current Quantity.
@return Current Quantity */
public BigDecimal getCurrentQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CurrentQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="557d33c6-248a-5876-3edb-787eccc460b7")
public static String es_PE_FIELD_ProductCosts_CurrentQuantity_Name="Cantidad Actual";

@XendraTrl(Identifier="557d33c6-248a-5876-3edb-787eccc460b7")
public static String es_PE_FIELD_ProductCosts_CurrentQuantity_Description="Cantidad Actual";

@XendraField(AD_Column_ID="CurrentQty",IsCentrallyMaintained=true,
AD_Tab_ID="0259290c-e73c-147b-dc92-13ff832ff659",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="557d33c6-248a-5876-3edb-787eccc460b7")
public static final String FIELDNAME_ProductCosts_CurrentQuantity="557d33c6-248a-5876-3edb-787eccc460b7";

@XendraTrl(Identifier="5ae4f200-8049-aa7b-9bad-688b4983da56")
public static String es_PE_COLUMN_CurrentQty_Name="Cantidad Actual";

@XendraColumn(AD_Element_ID="40e7fa44-f8c3-2486-0b6e-fb1fb23bc7a4",ColumnName="CurrentQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5ae4f200-8049-aa7b-9bad-688b4983da56",
Synchronized="2019-08-30 22:23:01.0")
/** Column name CurrentQty */
public static final String COLUMNNAME_CurrentQty = "CurrentQty";
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

@XendraTrl(Identifier="3b4f83c0-90c9-908e-1c19-d3984cf73f1e")
public static String es_PE_FIELD_ProductCosts_Description_Name="Observación";

@XendraTrl(Identifier="3b4f83c0-90c9-908e-1c19-d3984cf73f1e")
public static String es_PE_FIELD_ProductCosts_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="3b4f83c0-90c9-908e-1c19-d3984cf73f1e")
public static String es_PE_FIELD_ProductCosts_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="0259290c-e73c-147b-dc92-13ff832ff659",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3b4f83c0-90c9-908e-1c19-d3984cf73f1e")
public static final String FIELDNAME_ProductCosts_Description="3b4f83c0-90c9-908e-1c19-d3984cf73f1e";

@XendraTrl(Identifier="0bdcca88-377b-ffc0-46e7-4930de1eb3bc")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="0bdcca88-377b-ffc0-46e7-4930de1eb3bc",
Synchronized="2019-08-30 22:23:01.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Future Cost Price.
@param FutureCostPrice Future Cost Price */
public void setFutureCostPrice (BigDecimal FutureCostPrice)
{
if (FutureCostPrice == null) throw new IllegalArgumentException ("FutureCostPrice is mandatory.");
set_Value (COLUMNNAME_FutureCostPrice, FutureCostPrice);
}
/** Get Future Cost Price.
@return Future Cost Price */
public BigDecimal getFutureCostPrice() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FutureCostPrice);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="f150b0c6-c198-81fa-098e-fec9a92667d2")
public static String es_PE_FIELD_ProductCosts_FutureCostPrice_Name="Costo Futuro";

@XendraField(AD_Column_ID="FutureCostPrice",IsCentrallyMaintained=true,
AD_Tab_ID="0259290c-e73c-147b-dc92-13ff832ff659",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@CostingMethod@=S",DisplayLength=26,IsReadOnly=false,SeqNo=130,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f150b0c6-c198-81fa-098e-fec9a92667d2")
public static final String FIELDNAME_ProductCosts_FutureCostPrice="f150b0c6-c198-81fa-098e-fec9a92667d2";

@XendraTrl(Identifier="042248b7-6842-8f17-0218-badcc92e601b")
public static String es_PE_COLUMN_FutureCostPrice_Name="Costo Futuro";

@XendraColumn(AD_Element_ID="92208d2e-943b-0866-3053-e94a7efb0b73",ColumnName="FutureCostPrice",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,
ReadOnlyLogic="@CostingMethod@!S",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="042248b7-6842-8f17-0218-badcc92e601b",Synchronized="2019-08-30 22:23:01.0")
/** Column name FutureCostPrice */
public static final String COLUMNNAME_FutureCostPrice = "FutureCostPrice";
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
@XendraTrl(Identifier="649a2a0b-bf3f-4df6-ae99-be4c875b0a2d")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="649a2a0b-bf3f-4df6-ae99-be4c875b0a2d",
Synchronized="2019-08-30 22:23:01.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Attribute Set Instance.
@param M_AttributeSetInstance_ID Product Attribute Set Instance */
public void setM_AttributeSetInstance_ID (int M_AttributeSetInstance_ID)
{
if (M_AttributeSetInstance_ID < 0) throw new IllegalArgumentException ("M_AttributeSetInstance_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_AttributeSetInstance_ID, Integer.valueOf(M_AttributeSetInstance_ID));
}
/** Get Attribute Set Instance.
@return Product Attribute Set Instance */
public int getM_AttributeSetInstance_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_AttributeSetInstance_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c9cdf696-34c4-c9fe-2674-8cffc2ac6761")
public static String es_PE_FIELD_ProductCosts_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraTrl(Identifier="c9cdf696-34c4-c9fe-2674-8cffc2ac6761")
public static String es_PE_FIELD_ProductCosts_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="c9cdf696-34c4-c9fe-2674-8cffc2ac6761")
public static String es_PE_FIELD_ProductCosts_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0259290c-e73c-147b-dc92-13ff832ff659",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c9cdf696-34c4-c9fe-2674-8cffc2ac6761")
public static final String FIELDNAME_ProductCosts_AttributeSetInstance="c9cdf696-34c4-c9fe-2674-8cffc2ac6761";

@XendraTrl(Identifier="67f58063-47c4-c7e4-b3c6-ba487bd50339")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Instancia del Conjunto de Atributos";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,
IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="67f58063-47c4-c7e4-b3c6-ba487bd50339",Synchronized="2019-08-30 22:23:01.0")
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
/** Set Cost Element.
@param M_CostElement_ID Product Cost Element */
public void setM_CostElement_ID (int M_CostElement_ID)
{
if (M_CostElement_ID < 1) throw new IllegalArgumentException ("M_CostElement_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_CostElement_ID, Integer.valueOf(M_CostElement_ID));
}
/** Get Cost Element.
@return Product Cost Element */
public int getM_CostElement_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_CostElement_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="742eedd3-4868-f485-cf43-c78315cf0e09")
public static String es_PE_FIELD_ProductCosts_CostElement_Name="Elemento de Costo";

@XendraTrl(Identifier="742eedd3-4868-f485-cf43-c78315cf0e09")
public static String es_PE_FIELD_ProductCosts_CostElement_Description="Elemento de costo de producto";

@XendraField(AD_Column_ID="M_CostElement_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0259290c-e73c-147b-dc92-13ff832ff659",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=4,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="742eedd3-4868-f485-cf43-c78315cf0e09")
public static final String FIELDNAME_ProductCosts_CostElement="742eedd3-4868-f485-cf43-c78315cf0e09";

@XendraTrl(Identifier="e728b64c-c7ac-cb98-a5e8-d2b9ed35c7d3")
public static String es_PE_COLUMN_M_CostElement_ID_Name="Elemento de Costo";

@XendraColumn(AD_Element_ID="1b5355ae-f799-dbe3-d07b-17cb2162e976",ColumnName="M_CostElement_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="701dee9a-9390-33f9-5ca8-795e9b3ef34f",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e728b64c-c7ac-cb98-a5e8-d2b9ed35c7d3",Synchronized="2019-08-30 22:23:01.0")
/** Column name M_CostElement_ID */
public static final String COLUMNNAME_M_CostElement_ID = "M_CostElement_ID";
/** Set Cost Type.
@param M_CostType_ID Type of Cost (e.g. Current, Plan, Future) */
public void setM_CostType_ID (int M_CostType_ID)
{
if (M_CostType_ID < 1) throw new IllegalArgumentException ("M_CostType_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_CostType_ID, Integer.valueOf(M_CostType_ID));
}
/** Get Cost Type.
@return Type of Cost (e.g. Current, Plan, Future) */
public int getM_CostType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_CostType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4ab7024b-6ec5-2d5c-cf87-8ada4a660574")
public static String es_PE_FIELD_ProductCosts_CostType_Name="Tipo de Costo";

@XendraTrl(Identifier="4ab7024b-6ec5-2d5c-cf87-8ada4a660574")
public static String es_PE_FIELD_ProductCosts_CostType_Description="Tipo de Costo";

@XendraField(AD_Column_ID="M_CostType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0259290c-e73c-147b-dc92-13ff832ff659",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=3,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4ab7024b-6ec5-2d5c-cf87-8ada4a660574")
public static final String FIELDNAME_ProductCosts_CostType="4ab7024b-6ec5-2d5c-cf87-8ada4a660574";

@XendraTrl(Identifier="429112b3-1860-4e6a-1883-76b5973bf216")
public static String es_PE_COLUMN_M_CostType_ID_Name="Tipo de Costo";

@XendraColumn(AD_Element_ID="d57fad3f-6266-3f9c-4044-9945fe7f0ca3",ColumnName="M_CostType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="429112b3-1860-4e6a-1883-76b5973bf216",
Synchronized="2019-08-30 22:23:01.0")
/** Column name M_CostType_ID */
public static final String COLUMNNAME_M_CostType_ID = "M_CostType_ID";
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

@XendraTrl(Identifier="3c7ae790-9a20-19cb-2c8e-1d325e88eb6e")
public static String es_PE_FIELD_ProductCosts_Product_Name="Producto";

@XendraTrl(Identifier="3c7ae790-9a20-19cb-2c8e-1d325e88eb6e")
public static String es_PE_FIELD_ProductCosts_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="3c7ae790-9a20-19cb-2c8e-1d325e88eb6e")
public static String es_PE_FIELD_ProductCosts_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0259290c-e73c-147b-dc92-13ff832ff659",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3c7ae790-9a20-19cb-2c8e-1d325e88eb6e")
public static final String FIELDNAME_ProductCosts_Product="3c7ae790-9a20-19cb-2c8e-1d325e88eb6e";

@XendraTrl(Identifier="6e0afae1-30f9-4db8-6bdb-c9ab6be1a685")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6e0afae1-30f9-4db8-6bdb-c9ab6be1a685",Synchronized="2019-08-30 22:23:01.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Percent.
@param Percent Percentage */
public void setPercent (int Percent)
{
set_Value (COLUMNNAME_Percent, Integer.valueOf(Percent));
}
/** Get Percent.
@return Percentage */
public int getPercent() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Percent);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d31c13ec-34d1-3cc7-c3c2-d8d4488cdc25")
public static String es_PE_FIELD_ProductCosts_Percent_Name="Porcentaje";

@XendraTrl(Identifier="d31c13ec-34d1-3cc7-c3c2-d8d4488cdc25")
public static String es_PE_FIELD_ProductCosts_Percent_Description="Porcentaje de retención";

@XendraTrl(Identifier="d31c13ec-34d1-3cc7-c3c2-d8d4488cdc25")
public static String es_PE_FIELD_ProductCosts_Percent_Help="El porcentaje indica el porcentaje usado para retención.";

@XendraField(AD_Column_ID="Percent",IsCentrallyMaintained=true,
AD_Tab_ID="0259290c-e73c-147b-dc92-13ff832ff659",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@CostingMethod@=x",DisplayLength=10,IsReadOnly=false,SeqNo=140,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d31c13ec-34d1-3cc7-c3c2-d8d4488cdc25")
public static final String FIELDNAME_ProductCosts_Percent="d31c13ec-34d1-3cc7-c3c2-d8d4488cdc25";

@XendraTrl(Identifier="b0ba3910-6fe8-ba53-a986-e288f7ffc042")
public static String es_PE_COLUMN_Percent_Name="Porcentaje";

@XendraColumn(AD_Element_ID="a70b0c31-700a-d879-f313-b31531c93f04",ColumnName="Percent",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b0ba3910-6fe8-ba53-a986-e288f7ffc042",
Synchronized="2019-08-30 22:23:01.0")
/** Column name Percent */
public static final String COLUMNNAME_Percent = "Percent";
/** Set Processed.
@param Processed The document has been processed */
public void setProcessed (boolean Processed)
{
throw new IllegalArgumentException ("Processed is virtual column");
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

@XendraTrl(Identifier="a0d824aa-f2d6-3225-3681-9620c0bcee57")
public static String es_PE_FIELD_ProductCosts_Processed_Name="Procesado";

@XendraTrl(Identifier="a0d824aa-f2d6-3225-3681-9620c0bcee57")
public static String es_PE_FIELD_ProductCosts_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="a0d824aa-f2d6-3225-3681-9620c0bcee57")
public static String es_PE_FIELD_ProductCosts_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="0259290c-e73c-147b-dc92-13ff832ff659",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="1=2",DisplayLength=0,IsReadOnly=true,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a0d824aa-f2d6-3225-3681-9620c0bcee57")
public static final String FIELDNAME_ProductCosts_Processed="a0d824aa-f2d6-3225-3681-9620c0bcee57";

@XendraTrl(Identifier="b1583051-d330-44af-a149-78891ac5b6a2")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="'N'",
IsAllowLogging=false,Identifier="b1583051-d330-44af-a149-78891ac5b6a2",
Synchronized="2019-08-30 22:23:01.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
}
