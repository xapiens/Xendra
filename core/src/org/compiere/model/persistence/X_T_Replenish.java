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
import org.compiere.model.reference.REF_M_ReplenishmentCreate;
import org.compiere.model.reference.REF_M_ReplenishType;
/** Generated Model for T_Replenish
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_T_Replenish extends PO
{
/** Standard Constructor
@param ctx context
@param T_Replenish_ID id
@param trxName transaction
*/
public X_T_Replenish (Properties ctx, int T_Replenish_ID, String trxName)
{
super (ctx, T_Replenish_ID, trxName);
/** if (T_Replenish_ID == 0)
{
setAD_PInstance_ID (0);
setC_BPartner_ID (0);
setLevel_Max (Env.ZERO);
setLevel_Min (Env.ZERO);
setM_Product_ID (0);
setM_Warehouse_ID (0);
setReplenishType (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_T_Replenish (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=364 */
public static int Table_ID=MTable.getTable_ID("T_Replenish");

@XendraTrl(Identifier="007ab784-cbc6-db6c-befc-582dcb0a6c51")
public static String es_PE_TABLE_T_Replenish_Name="T_Replenish";

@XendraTable(Name="T_Replenish",Description="",Help="",TableName="T_Replenish",AccessLevel="3",
AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,
IsHighVolume=true,IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="007ab784-cbc6-db6c-befc-582dcb0a6c51",Synchronized="2017-08-16 11:44:25.0")
/** TableName=T_Replenish */
public static final String Table_Name="T_Replenish";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"T_Replenish");

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
    Table_ID = MTable.getTable_ID("T_Replenish");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_T_Replenish[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="1f449209-b92b-7752-f126-42f5cdd6863f")
public static String es_PE_COLUMN_AD_PInstance_ID_Name="Instancia del Proceso";

@XendraColumn(AD_Element_ID="a293ee40-db79-24cc-fb47-781657ecb499",ColumnName="AD_PInstance_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1f449209-b92b-7752-f126-42f5cdd6863f",
Synchronized="2017-08-05 16:56:28.0")
/** Column name AD_PInstance_ID */
public static final String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
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

@XendraTrl(Identifier="f80776e1-0969-4dbc-51e6-5530781e355d")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f80776e1-0969-4dbc-51e6-5530781e355d",
Synchronized="2017-08-05 16:56:28.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Document Type.
@param C_DocType_ID Document type or rules */
public void setC_DocType_ID (int C_DocType_ID)
{
if (C_DocType_ID <= 0) set_Value (COLUMNNAME_C_DocType_ID, null);
 else 
set_Value (COLUMNNAME_C_DocType_ID, Integer.valueOf(C_DocType_ID));
}
/** Get Document Type.
@return Document type or rules */
public int getC_DocType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DocType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="714ce150-d5b2-a4d4-8c0a-260eacf4a10b")
public static String es_PE_COLUMN_C_DocType_ID_Name="Tipo de Documento";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="714ce150-d5b2-a4d4-8c0a-260eacf4a10b",
Synchronized="2017-08-05 16:56:28.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
/** Set Maximum Level.
@param Level_Max Maximum Inventory level for this product */
public void setLevel_Max (BigDecimal Level_Max)
{
if (Level_Max == null) throw new IllegalArgumentException ("Level_Max is mandatory.");
set_Value (COLUMNNAME_Level_Max, Level_Max);
}
/** Get Maximum Level.
@return Maximum Inventory level for this product */
public BigDecimal getLevel_Max() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Level_Max);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="d43e2d8e-f3d7-b215-f73e-179007abe231")
public static String es_PE_COLUMN_Level_Max_Name="Nivel Máximo";

@XendraColumn(AD_Element_ID="208d613f-fe5d-67df-60ea-10ddad36ccb5",ColumnName="Level_Max",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d43e2d8e-f3d7-b215-f73e-179007abe231",
Synchronized="2017-08-05 16:56:28.0")
/** Column name Level_Max */
public static final String COLUMNNAME_Level_Max = "Level_Max";
/** Set Minimum Level.
@param Level_Min Minimum Inventory level for this product */
public void setLevel_Min (BigDecimal Level_Min)
{
if (Level_Min == null) throw new IllegalArgumentException ("Level_Min is mandatory.");
set_Value (COLUMNNAME_Level_Min, Level_Min);
}
/** Get Minimum Level.
@return Minimum Inventory level for this product */
public BigDecimal getLevel_Min() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Level_Min);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="df2b197b-677e-2099-77d7-76c623ee093f")
public static String es_PE_COLUMN_Level_Min_Name="Nivel Mínimo";

@XendraColumn(AD_Element_ID="23e1e821-a802-99ee-2a6a-0223aab95ea4",ColumnName="Level_Min",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="df2b197b-677e-2099-77d7-76c623ee093f",
Synchronized="2017-08-05 16:56:28.0")
/** Column name Level_Min */
public static final String COLUMNNAME_Level_Min = "Level_Min";
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

@XendraTrl(Identifier="eb2efe7b-7b8b-c605-a68e-ed3dbc601641")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eb2efe7b-7b8b-c605-a68e-ed3dbc601641",
Synchronized="2017-08-05 16:56:28.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Warehouse.
@param M_Warehouse_ID Storage Warehouse and Service Point */
public void setM_Warehouse_ID (int M_Warehouse_ID)
{
if (M_Warehouse_ID < 1) throw new IllegalArgumentException ("M_Warehouse_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Warehouse_ID, Integer.valueOf(M_Warehouse_ID));
}
/** Get Warehouse.
@return Storage Warehouse and Service Point */
public int getM_Warehouse_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Warehouse_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3e6f0ae4-1909-d09c-629f-f5615a53ea2b")
public static String es_PE_COLUMN_M_Warehouse_ID_Name="Almacén";

@XendraColumn(AD_Element_ID="402045cd-baa5-aeaf-b148-a921dffb7821",ColumnName="M_Warehouse_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3e6f0ae4-1909-d09c-629f-f5615a53ea2b",
Synchronized="2017-08-05 16:56:28.0")
/** Column name M_Warehouse_ID */
public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";

/** M_WarehouseSource_ID AD_Reference=e3999c76-66f0-38b0-a95e-fb0d580cde7a */
public static final int M_WAREHOUSESOURCE_ID_AD_Reference_ID=197;
/** Set Source Warehouse.
@param M_WarehouseSource_ID Optional Warehouse to replenish from */
public void setM_WarehouseSource_ID (int M_WarehouseSource_ID)
{
if (M_WarehouseSource_ID <= 0) set_Value (COLUMNNAME_M_WarehouseSource_ID, null);
 else 
set_Value (COLUMNNAME_M_WarehouseSource_ID, Integer.valueOf(M_WarehouseSource_ID));
}
/** Get Source Warehouse.
@return Optional Warehouse to replenish from */
public int getM_WarehouseSource_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_WarehouseSource_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="cf018c6f-dc0c-67d1-b0a9-233e294c33ae")
public static String es_PE_COLUMN_M_WarehouseSource_ID_Name="Almacén Fuente";

@XendraColumn(AD_Element_ID="47beb296-0f71-6c17-c133-5f1b98bf1682",
ColumnName="M_WarehouseSource_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="e3999c76-66f0-38b0-a95e-fb0d580cde7a",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="cf018c6f-dc0c-67d1-b0a9-233e294c33ae",
Synchronized="2017-08-05 16:56:28.0")
/** Column name M_WarehouseSource_ID */
public static final String COLUMNNAME_M_WarehouseSource_ID = "M_WarehouseSource_ID";
/** Set Minimum Order Qty.
@param Order_Min Minimum order quantity in UOM */
public void setOrder_Min (BigDecimal Order_Min)
{
set_Value (COLUMNNAME_Order_Min, Order_Min);
}
/** Get Minimum Order Qty.
@return Minimum order quantity in UOM */
public BigDecimal getOrder_Min() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Order_Min);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="80a5528c-f453-0579-29fa-a21fdd1e20cc")
public static String es_PE_COLUMN_Order_Min_Name="Mínimo a Ordenar";

@XendraColumn(AD_Element_ID="1d8d0ab1-eadf-b653-858e-9d9d56f1ef39",ColumnName="Order_Min",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="80a5528c-f453-0579-29fa-a21fdd1e20cc",
Synchronized="2017-08-05 16:56:28.0")
/** Column name Order_Min */
public static final String COLUMNNAME_Order_Min = "Order_Min";
/** Set Order Pack Qty.
@param Order_Pack Package order size in UOM (e.g. order set of 5 units) */
public void setOrder_Pack (BigDecimal Order_Pack)
{
set_Value (COLUMNNAME_Order_Pack, Order_Pack);
}
/** Get Order Pack Qty.
@return Package order size in UOM (e.g. order set of 5 units) */
public BigDecimal getOrder_Pack() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Order_Pack);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="2cca7536-cc13-0d0a-036d-4f1bbd1fe41f")
public static String es_PE_COLUMN_Order_Pack_Name="Múltiplo a Ordenar";

@XendraColumn(AD_Element_ID="96c8897c-422d-34b0-315a-2fb2c4e49ff7",ColumnName="Order_Pack",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2cca7536-cc13-0d0a-036d-4f1bbd1fe41f",
Synchronized="2017-08-05 16:56:29.0")
/** Column name Order_Pack */
public static final String COLUMNNAME_Order_Pack = "Order_Pack";
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

@XendraTrl(Identifier="dbc0b7db-d40c-6182-2e8c-ef9446fc752c")
public static String es_PE_COLUMN_QtyOnHand_Name="Cantidad en Existencia";

@XendraColumn(AD_Element_ID="491f8fda-42bc-512d-4b3c-2a1cad786e74",ColumnName="QtyOnHand",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dbc0b7db-d40c-6182-2e8c-ef9446fc752c",
Synchronized="2017-08-05 16:56:29.0")
/** Column name QtyOnHand */
public static final String COLUMNNAME_QtyOnHand = "QtyOnHand";
/** Set Ordered Quantity.
@param QtyOrdered Ordered Quantity */
public void setQtyOrdered (BigDecimal QtyOrdered)
{
set_Value (COLUMNNAME_QtyOrdered, QtyOrdered);
}
/** Get Ordered Quantity.
@return Ordered Quantity */
public BigDecimal getQtyOrdered() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyOrdered);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="85fe9354-d647-aad3-b11f-4992fa87d8b0")
public static String es_PE_COLUMN_QtyOrdered_Name="Cantidad Ordenada";

@XendraColumn(AD_Element_ID="2f601325-19ce-9544-d9df-693c76cbde8a",ColumnName="QtyOrdered",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="85fe9354-d647-aad3-b11f-4992fa87d8b0",
Synchronized="2017-08-05 16:56:29.0")
/** Column name QtyOrdered */
public static final String COLUMNNAME_QtyOrdered = "QtyOrdered";
/** Set Reserved Quantity.
@param QtyReserved Reserved Quantity */
public void setQtyReserved (BigDecimal QtyReserved)
{
set_Value (COLUMNNAME_QtyReserved, QtyReserved);
}
/** Get Reserved Quantity.
@return Reserved Quantity */
public BigDecimal getQtyReserved() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyReserved);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="fbe20976-2624-0b6c-def8-2c9afbec0e53")
public static String es_PE_COLUMN_QtyReserved_Name="Cantidad Reservada";

@XendraColumn(AD_Element_ID="9e1b819d-9985-da9d-e2e7-a1fe07d429e4",ColumnName="QtyReserved",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fbe20976-2624-0b6c-def8-2c9afbec0e53",
Synchronized="2017-08-05 16:56:29.0")
/** Column name QtyReserved */
public static final String COLUMNNAME_QtyReserved = "QtyReserved";
/** Set Quantity to Order.
@param QtyToOrder Quantity to Order */
public void setQtyToOrder (BigDecimal QtyToOrder)
{
set_Value (COLUMNNAME_QtyToOrder, QtyToOrder);
}
/** Get Quantity to Order.
@return Quantity to Order */
public BigDecimal getQtyToOrder() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyToOrder);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="8521adb7-e43d-5702-466d-9a5b95996a8f")
public static String es_PE_COLUMN_QtyToOrder_Name="Cantidad a Ordenar";

@XendraColumn(AD_Element_ID="58419f3d-04fa-bec7-dff5-be009049184d",ColumnName="QtyToOrder",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8521adb7-e43d-5702-466d-9a5b95996a8f",
Synchronized="2017-08-05 16:56:29.0")
/** Column name QtyToOrder */
public static final String COLUMNNAME_QtyToOrder = "QtyToOrder";

/** ReplenishmentCreate AD_Reference=3a4e4a72-6e97-5638-22ad-655b0c1e671c */
public static final int REPLENISHMENTCREATE_AD_Reference_ID=329;
/** Set Create.
@param ReplenishmentCreate Create from Replenishment */
public void setReplenishmentCreate (String ReplenishmentCreate)
{
if (ReplenishmentCreate == null || ReplenishmentCreate.equals(REF_M_ReplenishmentCreate.PurchaseOrder) || ReplenishmentCreate.equals(REF_M_ReplenishmentCreate.InventoryMove) || ReplenishmentCreate.equals(REF_M_ReplenishmentCreate.Requisition));
 else throw new IllegalArgumentException ("ReplenishmentCreate Invalid value - " + ReplenishmentCreate + " - Reference_ID=329 - POO - MMM - POR");
if (ReplenishmentCreate != null && ReplenishmentCreate.length() > 1)
{
log.warning("Length > 1 - truncated");
ReplenishmentCreate = ReplenishmentCreate.substring(0,0);
}
set_Value (COLUMNNAME_ReplenishmentCreate, ReplenishmentCreate);
}
/** Get Create.
@return Create from Replenishment */
public String getReplenishmentCreate() 
{
return (String)get_Value(COLUMNNAME_ReplenishmentCreate);
}

@XendraTrl(Identifier="c81a1150-b53e-3b9a-602f-778a5bac3fa3")
public static String es_PE_COLUMN_ReplenishmentCreate_Name="Crear";

@XendraColumn(AD_Element_ID="deb541bc-fe2a-c855-6844-a636efbc1f74",
ColumnName="ReplenishmentCreate",AD_Reference_ID=17,
AD_Reference_Value_ID="3a4e4a72-6e97-5638-22ad-655b0c1e671c",AD_Val_Rule_ID="",FieldLength=1,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="c81a1150-b53e-3b9a-602f-778a5bac3fa3",
Synchronized="2017-08-05 16:56:29.0")
/** Column name ReplenishmentCreate */
public static final String COLUMNNAME_ReplenishmentCreate = "ReplenishmentCreate";

/** ReplenishType AD_Reference=4ae23d3a-7913-5665-971c-430591c605b3 */
public static final int REPLENISHTYPE_AD_Reference_ID=164;
/** Set Replenish Type.
@param ReplenishType Method for re-ordering a product */
public void setReplenishType (String ReplenishType)
{
if (ReplenishType == null) throw new IllegalArgumentException ("ReplenishType is mandatory");
if (ReplenishType.equals(REF_M_ReplenishType.MaintainMaximumLevel) || ReplenishType.equals(REF_M_ReplenishType.Manual) || ReplenishType.equals(REF_M_ReplenishType.ReorderBelowMinimumLevel) || ReplenishType.equals(REF_M_ReplenishType.Custom));
 else throw new IllegalArgumentException ("ReplenishType Invalid value - " + ReplenishType + " - Reference_ID=164 - 2 - 0 - 1 - 9");
if (ReplenishType.length() > 1)
{
log.warning("Length > 1 - truncated");
ReplenishType = ReplenishType.substring(0,0);
}
set_Value (COLUMNNAME_ReplenishType, ReplenishType);
}
/** Get Replenish Type.
@return Method for re-ordering a product */
public String getReplenishType() 
{
return (String)get_Value(COLUMNNAME_ReplenishType);
}

@XendraTrl(Identifier="d7ebe059-9cf9-5e16-4ced-c3e9ad053d60")
public static String es_PE_COLUMN_ReplenishType_Name="Tipo de Reabastecimiento";

@XendraColumn(AD_Element_ID="b40e880b-813a-5bc0-caa7-dd8ed9e21f1d",ColumnName="ReplenishType",
AD_Reference_ID=17,AD_Reference_Value_ID="4ae23d3a-7913-5665-971c-430591c605b3",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d7ebe059-9cf9-5e16-4ced-c3e9ad053d60",Synchronized="2017-08-05 16:56:29.0")
/** Column name ReplenishType */
public static final String COLUMNNAME_ReplenishType = "ReplenishType";
}
