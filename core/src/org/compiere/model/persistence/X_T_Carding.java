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
import org.compiere.model.reference.REF_M_TransactionMovementType;
/** Generated Model for T_Carding
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_T_Carding extends PO
{
/** Standard Constructor
@param ctx context
@param T_Carding_ID id
@param trxName transaction
*/
public X_T_Carding (Properties ctx, int T_Carding_ID, String trxName)
{
super (ctx, T_Carding_ID, trxName);
/** if (T_Carding_ID == 0)
{
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_T_Carding (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000027 */
public static int Table_ID=MTable.getTable_ID("T_Carding");

@XendraTrl(Identifier="22fc163f-b7b5-d33b-9e63-00ebfacc350f")
public static String es_PE_TABLE_T_Carding_Name="Carding Stock";

@XendraTable(Name="Carding Stock",Description="",Help="",TableName="T_Carding",AccessLevel="3",
AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,
IsHighVolume=true,IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="22fc163f-b7b5-d33b-9e63-00ebfacc350f",Synchronized="2017-08-16 11:44:19.0")
/** TableName=T_Carding */
public static final String Table_Name="T_Carding";


@XendraIndex(Name="tcarding_pinstance",Identifier="56677ab6-190f-a335-b41b-1b899d888679",
Column_Names="ad_pinstance_id",IsUnique="false",
TableIdentifier="56677ab6-190f-a335-b41b-1b899d888679",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_tcarding_pinstance = "56677ab6-190f-a335-b41b-1b899d888679";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"T_Carding");

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
    Table_ID = MTable.getTable_ID("T_Carding");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_T_Carding[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Process Instance.
@param AD_PInstance_ID Instance of the process */
public void setAD_PInstance_ID (int AD_PInstance_ID)
{
if (AD_PInstance_ID <= 0) set_Value (COLUMNNAME_AD_PInstance_ID, null);
 else 
set_Value (COLUMNNAME_AD_PInstance_ID, Integer.valueOf(AD_PInstance_ID));
}
/** Get Process Instance.
@return Instance of the process */
public int getAD_PInstance_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PInstance_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="bc463f3e-af96-45b6-32f7-8611fdaeb503")
public static String es_PE_COLUMN_AD_PInstance_ID_Name="Instancia del Proceso";

@XendraColumn(AD_Element_ID="a293ee40-db79-24cc-fb47-781657ecb499",ColumnName="AD_PInstance_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bc463f3e-af96-45b6-32f7-8611fdaeb503",
Synchronized="2017-08-05 16:56:24.0")
/** Column name AD_PInstance_ID */
public static final String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
/** Set Project Issue.
@param C_ProjectIssue_ID Project Issues (Material, Labor) */
public void setC_ProjectIssue_ID (int C_ProjectIssue_ID)
{
if (C_ProjectIssue_ID <= 0) set_Value (COLUMNNAME_C_ProjectIssue_ID, null);
 else 
set_Value (COLUMNNAME_C_ProjectIssue_ID, Integer.valueOf(C_ProjectIssue_ID));
}
/** Get Project Issue.
@return Project Issues (Material, Labor) */
public int getC_ProjectIssue_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ProjectIssue_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e32fac37-6713-99c4-ed47-a915a6078f61")
public static String es_PE_COLUMN_C_ProjectIssue_ID_Name="Project Issue";

@XendraColumn(AD_Element_ID="6c6aa911-79e0-a8ca-00de-c0e2aa4fd667",ColumnName="C_ProjectIssue_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e32fac37-6713-99c4-ed47-a915a6078f61",
Synchronized="2017-08-05 16:56:24.0")
/** Column name C_ProjectIssue_ID */
public static final String COLUMNNAME_C_ProjectIssue_ID = "C_ProjectIssue_ID";
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

@XendraTrl(Identifier="d1ffc27b-ebe3-82e1-5999-d5243ec082b1")
public static String es_PE_COLUMN_M_InOut_ID_Name="Entrega / Recibo";

@XendraColumn(AD_Element_ID="5c1a0edf-01a0-832e-098b-d49510db71db",ColumnName="M_InOut_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d1ffc27b-ebe3-82e1-5999-d5243ec082b1",
Synchronized="2017-08-05 16:56:24.0")
/** Column name M_InOut_ID */
public static final String COLUMNNAME_M_InOut_ID = "M_InOut_ID";
/** Set Phys.Inventory Line.
@param M_InventoryLine_ID Unique line in an Inventory document */
public void setM_InventoryLine_ID (int M_InventoryLine_ID)
{
if (M_InventoryLine_ID <= 0) set_Value (COLUMNNAME_M_InventoryLine_ID, null);
 else 
set_Value (COLUMNNAME_M_InventoryLine_ID, Integer.valueOf(M_InventoryLine_ID));
}
/** Get Phys.Inventory Line.
@return Unique line in an Inventory document */
public int getM_InventoryLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_InventoryLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5d5fab13-0420-126e-2108-a41e3af99ca1")
public static String es_PE_COLUMN_M_InventoryLine_ID_Name="Línea de Inventario Físico";

@XendraColumn(AD_Element_ID="2c5571d8-3b1f-8721-db52-cae644155140",ColumnName="M_InventoryLine_ID",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5d5fab13-0420-126e-2108-a41e3af99ca1",
Synchronized="2017-08-05 16:56:24.0")
/** Column name M_InventoryLine_ID */
public static final String COLUMNNAME_M_InventoryLine_ID = "M_InventoryLine_ID";
/** Set Locator.
@param M_Locator_ID Warehouse Locator */
public void setM_Locator_ID (int M_Locator_ID)
{
if (M_Locator_ID <= 0) set_Value (COLUMNNAME_M_Locator_ID, null);
 else 
set_Value (COLUMNNAME_M_Locator_ID, Integer.valueOf(M_Locator_ID));
}
/** Get Locator.
@return Warehouse Locator */
public int getM_Locator_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Locator_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8651fa9b-abad-2861-1b84-eb3fbcff47e8")
public static String es_PE_COLUMN_M_Locator_ID_Name="Ubicación";

@XendraColumn(AD_Element_ID="67f044ce-2864-93f9-fd0d-320945150933",ColumnName="M_Locator_ID",
AD_Reference_ID=31,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8651fa9b-abad-2861-1b84-eb3fbcff47e8",
Synchronized="2017-08-05 16:56:24.0")
/** Column name M_Locator_ID */
public static final String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
/** Set Move Line.
@param M_MovementLine_ID Inventory Move document Line */
public void setM_MovementLine_ID (int M_MovementLine_ID)
{
if (M_MovementLine_ID <= 0) set_Value (COLUMNNAME_M_MovementLine_ID, null);
 else 
set_Value (COLUMNNAME_M_MovementLine_ID, Integer.valueOf(M_MovementLine_ID));
}
/** Get Move Line.
@return Inventory Move document Line */
public int getM_MovementLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_MovementLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c044dcbd-e962-56e2-07ba-981845868fd4")
public static String es_PE_COLUMN_M_MovementLine_ID_Name="Línea del Movimiento";

@XendraColumn(AD_Element_ID="45800ec7-b982-e856-179e-390dd2305e2e",ColumnName="M_MovementLine_ID",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c044dcbd-e962-56e2-07ba-981845868fd4",
Synchronized="2017-08-05 16:56:24.0")
/** Column name M_MovementLine_ID */
public static final String COLUMNNAME_M_MovementLine_ID = "M_MovementLine_ID";
/** Set Movement Date.
@param MovementDate Date a product was moved in or out of inventory */
public void setMovementDate (Timestamp MovementDate)
{
set_Value (COLUMNNAME_MovementDate, MovementDate);
}
/** Get Movement Date.
@return Date a product was moved in or out of inventory */
public Timestamp getMovementDate() 
{
return (Timestamp)get_Value(COLUMNNAME_MovementDate);
}

@XendraTrl(Identifier="d06d558f-37fa-1ca9-0d0d-8fa9ad70f954")
public static String es_PE_COLUMN_MovementDate_Name="Fecha de Movimiento";

@XendraColumn(AD_Element_ID="7a907f01-8525-820d-22d4-98b06d4b902b",ColumnName="MovementDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d06d558f-37fa-1ca9-0d0d-8fa9ad70f954",
Synchronized="2017-08-05 16:56:24.0")
/** Column name MovementDate */
public static final String COLUMNNAME_MovementDate = "MovementDate";
/** Set Movement Quantity.
@param MovementQty Quantity of a product moved. */
public void setMovementQty (BigDecimal MovementQty)
{
set_Value (COLUMNNAME_MovementQty, MovementQty);
}
/** Get Movement Quantity.
@return Quantity of a product moved. */
public BigDecimal getMovementQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MovementQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="61d7d7d5-e326-71d6-1f13-e8d770f58df5")
public static String es_PE_COLUMN_MovementQty_Name="Cantidad del Movimiento";

@XendraColumn(AD_Element_ID="36c2f62a-1d3b-a3ff-a433-9fc2eec47380",ColumnName="MovementQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="61d7d7d5-e326-71d6-1f13-e8d770f58df5",
Synchronized="2017-08-05 16:56:24.0")
/** Column name MovementQty */
public static final String COLUMNNAME_MovementQty = "MovementQty";
/** Set Movement Quantity Balance.
@param MovementQtyBalance Movement Quantity Balance */
public void setMovementQtyBalance (BigDecimal MovementQtyBalance)
{
set_Value (COLUMNNAME_MovementQtyBalance, MovementQtyBalance);
}
/** Get Movement Quantity Balance.
@return Movement Quantity Balance */
public BigDecimal getMovementQtyBalance() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MovementQtyBalance);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="1c2a0b45-cfe7-f65c-b496-b712fb5c5059")
public static String es_PE_COLUMN_MovementQtyBalance_Name="Movement Quantity Balance";

@XendraColumn(AD_Element_ID="ac415ed3-ef1a-5e5b-9343-f6e7d056e532",ColumnName="MovementQtyBalance",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1c2a0b45-cfe7-f65c-b496-b712fb5c5059",
Synchronized="2017-08-05 16:56:24.0")
/** Column name MovementQtyBalance */
public static final String COLUMNNAME_MovementQtyBalance = "MovementQtyBalance";

/** MovementType AD_Reference=0455b4db-004d-594c-a505-3e493bfda9ad */
public static final int MOVEMENTTYPE_AD_Reference_ID=189;
/** Set Movement Type.
@param MovementType Method of moving the inventory */
public void setMovementType (String MovementType)
{
if (MovementType == null || MovementType.equals(REF_M_TransactionMovementType.WorkOrderPlus) || MovementType.equals(REF_M_TransactionMovementType.WorkOrder_) || MovementType.equals(REF_M_TransactionMovementType.ProductionPlus) || MovementType.equals(REF_M_TransactionMovementType.InventoryIn) || MovementType.equals(REF_M_TransactionMovementType.VendorReturns) || MovementType.equals(REF_M_TransactionMovementType.MovementFrom) || MovementType.equals(REF_M_TransactionMovementType.Production_) || MovementType.equals(REF_M_TransactionMovementType.CustomerShipment) || MovementType.equals(REF_M_TransactionMovementType.VendorReceipts) || MovementType.equals(REF_M_TransactionMovementType.InventoryOut) || MovementType.equals(REF_M_TransactionMovementType.MovementTo) || MovementType.equals(REF_M_TransactionMovementType.CustomerReturns) || MovementType.equals(REF_M_TransactionMovementType.NotApply));
 else throw new IllegalArgumentException ("MovementType Invalid value - " + MovementType + " - Reference_ID=189 - W+ - W- - P+ - I+ - R- - M- - P- - C- - V+ - I- - M+ - R+ - NA");
if (MovementType != null && MovementType.length() > 10)
{
log.warning("Length > 10 - truncated");
MovementType = MovementType.substring(0,9);
}
set_Value (COLUMNNAME_MovementType, MovementType);
}
/** Get Movement Type.
@return Method of moving the inventory */
public String getMovementType() 
{
return (String)get_Value(COLUMNNAME_MovementType);
}

@XendraTrl(Identifier="39f709f2-9bde-8b8b-c36a-b6f968bbe3c9")
public static String es_PE_COLUMN_MovementType_Name="Tipo de Movimiento";

@XendraColumn(AD_Element_ID="6deba235-3003-eca1-becf-5fd99b19b2a9",ColumnName="MovementType",
AD_Reference_ID=17,AD_Reference_Value_ID="0455b4db-004d-594c-a505-3e493bfda9ad",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="39f709f2-9bde-8b8b-c36a-b6f968bbe3c9",Synchronized="2017-08-05 16:56:24.0")
/** Column name MovementType */
public static final String COLUMNNAME_MovementType = "MovementType";
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

@XendraTrl(Identifier="722f018c-b2a8-9c49-f1e8-d36e18d168d9")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="722f018c-b2a8-9c49-f1e8-d36e18d168d9",
Synchronized="2017-08-05 16:56:24.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Production Line.
@param M_ProductionLine_ID Document Line representing a production */
public void setM_ProductionLine_ID (int M_ProductionLine_ID)
{
if (M_ProductionLine_ID <= 0) set_Value (COLUMNNAME_M_ProductionLine_ID, null);
 else 
set_Value (COLUMNNAME_M_ProductionLine_ID, Integer.valueOf(M_ProductionLine_ID));
}
/** Get Production Line.
@return Document Line representing a production */
public int getM_ProductionLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_ProductionLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7490ef0c-5fee-38a2-4b08-5eb7a648d0b3")
public static String es_PE_COLUMN_M_ProductionLine_ID_Name="Línea de Producción";

@XendraColumn(AD_Element_ID="cd41491f-514d-42fd-aaf9-36308e165c0b",
ColumnName="M_ProductionLine_ID",AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7490ef0c-5fee-38a2-4b08-5eb7a648d0b3",Synchronized="2017-08-05 16:56:24.0")
/** Column name M_ProductionLine_ID */
public static final String COLUMNNAME_M_ProductionLine_ID = "M_ProductionLine_ID";
/** Set Cost Price.
@param PriceCost Price per Unit of Measure including all indirect costs (Freight, etc.) */
public void setPriceCost (BigDecimal PriceCost)
{
set_Value (COLUMNNAME_PriceCost, PriceCost);
}
/** Get Cost Price.
@return Price per Unit of Measure including all indirect costs (Freight, etc.) */
public BigDecimal getPriceCost() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceCost);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="46c67183-1088-074f-57f4-2379b81e15e8")
public static String es_PE_COLUMN_PriceCost_Name="Precio de Costo";

@XendraColumn(AD_Element_ID="decf6dde-230c-11ea-c777-e7b052b8e69e",ColumnName="PriceCost",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="46c67183-1088-074f-57f4-2379b81e15e8",
Synchronized="2017-08-05 16:56:24.0")
/** Column name PriceCost */
public static final String COLUMNNAME_PriceCost = "PriceCost";
/** Set Total Cost.
@param TotalCost Total Cost  (Freight, etc.) */
public void setTotalCost (BigDecimal TotalCost)
{
set_Value (COLUMNNAME_TotalCost, TotalCost);
}
/** Get Total Cost.
@return Total Cost  (Freight, etc.) */
public BigDecimal getTotalCost() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TotalCost);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="59cc4a86-807b-4750-294d-7606803fb1da")
public static String es_PE_COLUMN_TotalCost_Name="Total Cost";

@XendraColumn(AD_Element_ID="99a761fd-2d83-588e-13a0-eec11b2c5ea0",ColumnName="TotalCost",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="59cc4a86-807b-4750-294d-7606803fb1da",
Synchronized="2017-08-05 16:56:24.0")
/** Column name TotalCost */
public static final String COLUMNNAME_TotalCost = "TotalCost";
}
