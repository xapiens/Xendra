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
/** Generated Model for T_InventoryValue
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_T_InventoryValue extends PO
{
/** Standard Constructor
@param ctx context
@param T_InventoryValue_ID id
@param trxName transaction
*/
public X_T_InventoryValue (Properties ctx, int T_InventoryValue_ID, String trxName)
{
super (ctx, T_InventoryValue_ID, trxName);
/** if (T_InventoryValue_ID == 0)
{
setAD_PInstance_ID (0);
setM_AttributeSetInstance_ID (0);
setM_Product_ID (0);
setM_Warehouse_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_T_InventoryValue (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=478 */
public static int Table_ID=MTable.getTable_ID("T_InventoryValue");

@XendraTrl(Identifier="ecf189c9-f134-4c26-a884-ac92a3c9a7f4")
public static String es_PE_TABLE_T_InventoryValue_Name="T_InventoryValue";

@XendraTable(Name="T_InventoryValue",Description="",Help="",TableName="T_InventoryValue",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,IsSecurityEnabled=false,
IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.standard",Identifier="ecf189c9-f134-4c26-a884-ac92a3c9a7f4",
Synchronized="2017-08-16 11:44:22.0")
/** TableName=T_InventoryValue */
public static final String Table_Name="T_InventoryValue";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"T_InventoryValue");

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
    Table_ID = MTable.getTable_ID("T_InventoryValue");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_T_InventoryValue[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Process Instance.
@param AD_PInstance_ID Instance of the process */
public void setAD_PInstance_ID (int AD_PInstance_ID)
{
if (AD_PInstance_ID < 1) throw new IllegalArgumentException ("AD_PInstance_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_PInstance_ID, Integer.valueOf(AD_PInstance_ID));
}
/** Get Process Instance.
@return Instance of the process */
public int getAD_PInstance_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PInstance_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9d1865e5-96ab-7f09-5249-c922e93893f7")
public static String es_PE_COLUMN_AD_PInstance_ID_Name="Instancia del Proceso";

@XendraColumn(AD_Element_ID="a293ee40-db79-24cc-fb47-781657ecb499",ColumnName="AD_PInstance_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9d1865e5-96ab-7f09-5249-c922e93893f7",
Synchronized="2017-08-05 16:56:25.0")
/** Column name AD_PInstance_ID */
public static final String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID <= 0) set_Value (COLUMNNAME_C_Currency_ID, null);
 else 
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

@XendraTrl(Identifier="7b98eece-696c-6fd3-283d-c1ea98a6ff88")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7b98eece-696c-6fd3-283d-c1ea98a6ff88",
Synchronized="2017-08-05 16:56:25.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Cost.
@param Cost Cost information */
public void setCost (BigDecimal Cost)
{
set_Value (COLUMNNAME_Cost, Cost);
}
/** Get Cost.
@return Cost information */
public BigDecimal getCost() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Cost);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="8797d758-afc0-95fe-c766-9798564a8195")
public static String es_PE_COLUMN_Cost_Name="Costo";

@XendraColumn(AD_Element_ID="ea07eea5-cd5c-5001-0f53-dfcaf5256889",ColumnName="Cost",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8797d758-afc0-95fe-c766-9798564a8195",
Synchronized="2017-08-05 16:56:25.0")
/** Column name Cost */
public static final String COLUMNNAME_Cost = "Cost";
/** Set Cost Value.
@param CostAmt Value with Cost */
public void setCostAmt (BigDecimal CostAmt)
{
set_Value (COLUMNNAME_CostAmt, CostAmt);
}
/** Get Cost Value.
@return Value with Cost */
public BigDecimal getCostAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CostAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="604be097-0a0f-6437-2c6c-30429e732167")
public static String es_PE_COLUMN_CostAmt_Name="Cost Value";

@XendraColumn(AD_Element_ID="a727016a-7aa5-3c6f-0d61-2bbf8e181ef7",ColumnName="CostAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="604be097-0a0f-6437-2c6c-30429e732167",
Synchronized="2017-08-05 16:56:25.0")
/** Column name CostAmt */
public static final String COLUMNNAME_CostAmt = "CostAmt";
/** Set Standard Cost.
@param CostStandard Standard Costs */
public void setCostStandard (BigDecimal CostStandard)
{
set_Value (COLUMNNAME_CostStandard, CostStandard);
}
/** Get Standard Cost.
@return Standard Costs */
public BigDecimal getCostStandard() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CostStandard);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="cf2abf6e-3614-b2ef-76c6-69bfcc50691d")
public static String es_PE_COLUMN_CostStandard_Name="Costo Estándar";

@XendraColumn(AD_Element_ID="85a07b95-ef79-5555-7c3c-e9c25a74eae9",ColumnName="CostStandard",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cf2abf6e-3614-b2ef-76c6-69bfcc50691d",
Synchronized="2017-08-05 16:56:25.0")
/** Column name CostStandard */
public static final String COLUMNNAME_CostStandard = "CostStandard";
/** Set Standard Cost Value.
@param CostStandardAmt Value in Standard Costs */
public void setCostStandardAmt (BigDecimal CostStandardAmt)
{
set_Value (COLUMNNAME_CostStandardAmt, CostStandardAmt);
}
/** Get Standard Cost Value.
@return Value in Standard Costs */
public BigDecimal getCostStandardAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CostStandardAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="bb8cf26f-56cf-8bc0-ec24-91ad3aa6b7a9")
public static String es_PE_COLUMN_CostStandardAmt_Name="Valor Costo Estándar";

@XendraColumn(AD_Element_ID="daedd5d8-da1b-1a79-2920-a50f5537774e",ColumnName="CostStandardAmt",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bb8cf26f-56cf-8bc0-ec24-91ad3aa6b7a9",
Synchronized="2017-08-05 16:56:25.0")
/** Column name CostStandardAmt */
public static final String COLUMNNAME_CostStandardAmt = "CostStandardAmt";
/** Set Valuation Date.
@param DateValue Date of valuation */
public void setDateValue (Timestamp DateValue)
{
set_Value (COLUMNNAME_DateValue, DateValue);
}
/** Get Valuation Date.
@return Date of valuation */
public Timestamp getDateValue() 
{
return (Timestamp)get_Value(COLUMNNAME_DateValue);
}

@XendraTrl(Identifier="41115353-d8a9-a39f-89b3-50fb930758c7")
public static String es_PE_COLUMN_DateValue_Name="Fecha de Valor";

@XendraColumn(AD_Element_ID="9831837a-e0c3-aaec-bb1a-9311a56c6fa8",ColumnName="DateValue",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="41115353-d8a9-a39f-89b3-50fb930758c7",
Synchronized="2017-08-05 16:56:25.0")
/** Column name DateValue */
public static final String COLUMNNAME_DateValue = "DateValue";
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

@XendraTrl(Identifier="0d4e0cfd-b418-1759-e242-174af37e7f17")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Instancia del Conjunto de Atributos";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0d4e0cfd-b418-1759-e242-174af37e7f17",Synchronized="2017-08-05 16:56:25.0")
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
/** Set Cost Element.
@param M_CostElement_ID Product Cost Element */
public void setM_CostElement_ID (int M_CostElement_ID)
{
if (M_CostElement_ID <= 0) set_Value (COLUMNNAME_M_CostElement_ID, null);
 else 
set_Value (COLUMNNAME_M_CostElement_ID, Integer.valueOf(M_CostElement_ID));
}
/** Get Cost Element.
@return Product Cost Element */
public int getM_CostElement_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_CostElement_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1a1980ea-b744-2baf-e07f-ad7357995dc9")
public static String es_PE_COLUMN_M_CostElement_ID_Name="Elemento de Costo";

@XendraColumn(AD_Element_ID="1b5355ae-f799-dbe3-d07b-17cb2162e976",ColumnName="M_CostElement_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1a1980ea-b744-2baf-e07f-ad7357995dc9",
Synchronized="2017-08-05 16:56:25.0")
/** Column name M_CostElement_ID */
public static final String COLUMNNAME_M_CostElement_ID = "M_CostElement_ID";
/** Set Price List Version.
@param M_PriceList_Version_ID Identifies a unique instance of a Price List */
public void setM_PriceList_Version_ID (int M_PriceList_Version_ID)
{
if (M_PriceList_Version_ID <= 0) set_Value (COLUMNNAME_M_PriceList_Version_ID, null);
 else 
set_Value (COLUMNNAME_M_PriceList_Version_ID, Integer.valueOf(M_PriceList_Version_ID));
}
/** Get Price List Version.
@return Identifies a unique instance of a Price List */
public int getM_PriceList_Version_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_PriceList_Version_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ffa1ef54-a3aa-eb34-0d4e-863510308267")
public static String es_PE_COLUMN_M_PriceList_Version_ID_Name="Versión de Lista de Precios";

@XendraColumn(AD_Element_ID="6c31f4d5-58fe-0b61-33f1-e2549c3f35f6",
ColumnName="M_PriceList_Version_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ffa1ef54-a3aa-eb34-0d4e-863510308267",Synchronized="2017-08-05 16:56:25.0")
/** Column name M_PriceList_Version_ID */
public static final String COLUMNNAME_M_PriceList_Version_ID = "M_PriceList_Version_ID";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID < 1) throw new IllegalArgumentException ("M_Product_ID is mandatory.");
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

@XendraTrl(Identifier="7b278d93-adfa-e5b5-b82e-49d9344297d3")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7b278d93-adfa-e5b5-b82e-49d9344297d3",
Synchronized="2017-08-05 16:56:25.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
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

@XendraTrl(Identifier="7763911e-4e28-6e6d-62e1-0d74fffdb3ac")
public static String es_PE_COLUMN_M_Warehouse_ID_Name="Almacén";

@XendraColumn(AD_Element_ID="402045cd-baa5-aeaf-b148-a921dffb7821",ColumnName="M_Warehouse_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7763911e-4e28-6e6d-62e1-0d74fffdb3ac",
Synchronized="2017-08-05 16:56:25.0")
/** Column name M_Warehouse_ID */
public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
/** Set Limit Price.
@param PriceLimit Lowest price for a product */
public void setPriceLimit (BigDecimal PriceLimit)
{
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

@XendraTrl(Identifier="7820f836-4103-f795-cbf4-5fe50372cf5b")
public static String es_PE_COLUMN_PriceLimit_Name="Precio Límite";

@XendraColumn(AD_Element_ID="0dbee629-4878-ced9-eafa-0f6bdfb99af4",ColumnName="PriceLimit",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7820f836-4103-f795-cbf4-5fe50372cf5b",
Synchronized="2017-08-05 16:56:25.0")
/** Column name PriceLimit */
public static final String COLUMNNAME_PriceLimit = "PriceLimit";
/** Set Limit price Value.
@param PriceLimitAmt Value with limit price */
public void setPriceLimitAmt (BigDecimal PriceLimitAmt)
{
set_Value (COLUMNNAME_PriceLimitAmt, PriceLimitAmt);
}
/** Get Limit price Value.
@return Value with limit price */
public BigDecimal getPriceLimitAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceLimitAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="85d4846c-7cdc-e709-e630-989404920a1a")
public static String es_PE_COLUMN_PriceLimitAmt_Name="Valor con Precio Límite";

@XendraColumn(AD_Element_ID="96f38628-5ae2-5c17-8587-85102258faf5",ColumnName="PriceLimitAmt",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="85d4846c-7cdc-e709-e630-989404920a1a",
Synchronized="2017-08-05 16:56:26.0")
/** Column name PriceLimitAmt */
public static final String COLUMNNAME_PriceLimitAmt = "PriceLimitAmt";
/** Set List Price.
@param PriceList List Price */
public void setPriceList (BigDecimal PriceList)
{
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

@XendraTrl(Identifier="9616276e-638c-de65-49c5-9c7082d3325e")
public static String es_PE_COLUMN_PriceList_Name="Precio de Lista";

@XendraColumn(AD_Element_ID="0f6529f2-0ceb-0583-6c50-c04e6542c99b",ColumnName="PriceList",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9616276e-638c-de65-49c5-9c7082d3325e",
Synchronized="2017-08-05 16:56:26.0")
/** Column name PriceList */
public static final String COLUMNNAME_PriceList = "PriceList";
/** Set List price Value.
@param PriceListAmt Valuation with List Price */
public void setPriceListAmt (BigDecimal PriceListAmt)
{
set_Value (COLUMNNAME_PriceListAmt, PriceListAmt);
}
/** Get List price Value.
@return Valuation with List Price */
public BigDecimal getPriceListAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceListAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="10483e9f-e393-081a-1fcc-c30570ef9b5e")
public static String es_PE_COLUMN_PriceListAmt_Name="Valor con Precio de Lista";

@XendraColumn(AD_Element_ID="74beaf85-e8c3-9b95-a63d-891241d36d35",ColumnName="PriceListAmt",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="10483e9f-e393-081a-1fcc-c30570ef9b5e",
Synchronized="2017-08-05 16:56:26.0")
/** Column name PriceListAmt */
public static final String COLUMNNAME_PriceListAmt = "PriceListAmt";
/** Set PO Price.
@param PricePO Price based on a purchase order */
public void setPricePO (BigDecimal PricePO)
{
set_Value (COLUMNNAME_PricePO, PricePO);
}
/** Get PO Price.
@return Price based on a purchase order */
public BigDecimal getPricePO() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PricePO);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="10717f22-3d78-1164-6372-de9cedcb6a1a")
public static String es_PE_COLUMN_PricePO_Name="Precio OC";

@XendraColumn(AD_Element_ID="1dc1da18-70d5-3909-dc1c-cf7fe1faefaf",ColumnName="PricePO",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="10717f22-3d78-1164-6372-de9cedcb6a1a",
Synchronized="2017-08-05 16:56:26.0")
/** Column name PricePO */
public static final String COLUMNNAME_PricePO = "PricePO";
/** Set PO Price Value.
@param PricePOAmt Valuation with PO Price */
public void setPricePOAmt (BigDecimal PricePOAmt)
{
set_Value (COLUMNNAME_PricePOAmt, PricePOAmt);
}
/** Get PO Price Value.
@return Valuation with PO Price */
public BigDecimal getPricePOAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PricePOAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="0348f0f2-67a7-0bc2-fd4b-9596e16d3495")
public static String es_PE_COLUMN_PricePOAmt_Name="Valor con Precio OC";

@XendraColumn(AD_Element_ID="7bfc0613-61a7-9b9d-65ab-cf4bc53ec405",ColumnName="PricePOAmt",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0348f0f2-67a7-0bc2-fd4b-9596e16d3495",
Synchronized="2017-08-05 16:56:26.0")
/** Column name PricePOAmt */
public static final String COLUMNNAME_PricePOAmt = "PricePOAmt";
/** Set Standard Price.
@param PriceStd Standard Price */
public void setPriceStd (BigDecimal PriceStd)
{
set_Value (COLUMNNAME_PriceStd, PriceStd);
}
/** Get Standard Price.
@return Standard Price */
public BigDecimal getPriceStd() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceStd);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="234a642a-3b38-7764-973d-314e418545eb")
public static String es_PE_COLUMN_PriceStd_Name="Precio Estándar";

@XendraColumn(AD_Element_ID="cd12259b-a52a-9102-1c72-983d6e1d5324",ColumnName="PriceStd",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="234a642a-3b38-7764-973d-314e418545eb",
Synchronized="2017-08-05 16:56:26.0")
/** Column name PriceStd */
public static final String COLUMNNAME_PriceStd = "PriceStd";
/** Set Std Price Value.
@param PriceStdAmt Valuation with standard price */
public void setPriceStdAmt (BigDecimal PriceStdAmt)
{
set_Value (COLUMNNAME_PriceStdAmt, PriceStdAmt);
}
/** Get Std Price Value.
@return Valuation with standard price */
public BigDecimal getPriceStdAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceStdAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="00f43670-0c03-677c-be13-e39977d66d03")
public static String es_PE_COLUMN_PriceStdAmt_Name="Valor con Precio Estándar";

@XendraColumn(AD_Element_ID="2f1ce1d8-2360-a194-998f-6e7d06e2b7ab",ColumnName="PriceStdAmt",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="00f43670-0c03-677c-be13-e39977d66d03",
Synchronized="2017-08-05 16:56:27.0")
/** Column name PriceStdAmt */
public static final String COLUMNNAME_PriceStdAmt = "PriceStdAmt";
/** Set On Hand Quantity.
@param QtyOnHand On Hand Quantity */
public void setQtyOnHand (BigDecimal QtyOnHand)
{
set_Value (COLUMNNAME_QtyOnHand, QtyOnHand);
}
/** Get On Hand Quantity.
@return On Hand Quantity */
public BigDecimal getQtyOnHand() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyOnHand);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="64538781-45b7-8ff0-d658-271895f2fb84")
public static String es_PE_COLUMN_QtyOnHand_Name="Cantidad en Existencia";

@XendraColumn(AD_Element_ID="491f8fda-42bc-512d-4b3c-2a1cad786e74",ColumnName="QtyOnHand",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="64538781-45b7-8ff0-d658-271895f2fb84",
Synchronized="2017-08-05 16:56:27.0")
/** Column name QtyOnHand */
public static final String COLUMNNAME_QtyOnHand = "QtyOnHand";
}
