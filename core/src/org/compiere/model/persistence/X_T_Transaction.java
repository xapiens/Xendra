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
/** Generated Model for T_Transaction
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_T_Transaction extends PO
{
/** Standard Constructor
@param ctx context
@param T_Transaction_ID id
@param trxName transaction
*/
public X_T_Transaction (Properties ctx, int T_Transaction_ID, String trxName)
{
super (ctx, T_Transaction_ID, trxName);
/** if (T_Transaction_ID == 0)
{
setAD_PInstance_ID (0);
setM_AttributeSetInstance_ID (0);
setM_Locator_ID (0);
setMovementDate (new Timestamp(System.currentTimeMillis()));
setMovementQty (Env.ZERO);
setMovementType (null);
setM_Product_ID (0);
setM_Transaction_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_T_Transaction (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=758 */
public static int Table_ID=MTable.getTable_ID("T_Transaction");

@XendraTrl(Identifier="b460d466-d170-68e4-a50f-b6716ed17cb4")
public static String es_PE_TABLE_T_Transaction_Name="T_Transaction";

@XendraTable(Name="T_Transaction",Description="",Help="",TableName="T_Transaction",AccessLevel="3",
AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,
IsHighVolume=true,IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="b460d466-d170-68e4-a50f-b6716ed17cb4",Synchronized="2017-08-16 11:44:26.0")
/** TableName=T_Transaction */
public static final String Table_Name="T_Transaction";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"T_Transaction");

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
    Table_ID = MTable.getTable_ID("T_Transaction");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_T_Transaction[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Process Instance.
@param AD_PInstance_ID Instance of the process */
public void setAD_PInstance_ID (int AD_PInstance_ID)
{
if (AD_PInstance_ID < 1) throw new IllegalArgumentException ("AD_PInstance_ID is mandatory.");
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

@XendraTrl(Identifier="5ae5025f-2871-fd28-7004-46ff76d1acf3")
public static String es_PE_COLUMN_AD_PInstance_ID_Name="Instancia del Proceso";

@XendraColumn(AD_Element_ID="a293ee40-db79-24cc-fb47-781657ecb499",ColumnName="AD_PInstance_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5ae5025f-2871-fd28-7004-46ff76d1acf3",
Synchronized="2017-08-05 16:56:30.0")
/** Column name AD_PInstance_ID */
public static final String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
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

@XendraTrl(Identifier="ba1264b3-1623-56c1-6901-7eefab47538e")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ba1264b3-1623-56c1-6901-7eefab47538e",
Synchronized="2017-08-05 16:56:30.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
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

@XendraTrl(Identifier="9f5c0c11-7a6c-7305-863b-79d87756535d")
public static String es_PE_COLUMN_C_ProjectIssue_ID_Name="Asunto del Proyecto";

@XendraColumn(AD_Element_ID="6c6aa911-79e0-a8ca-00de-c0e2aa4fd667",ColumnName="C_ProjectIssue_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9f5c0c11-7a6c-7305-863b-79d87756535d",
Synchronized="2017-08-05 16:56:30.0")
/** Column name C_ProjectIssue_ID */
public static final String COLUMNNAME_C_ProjectIssue_ID = "C_ProjectIssue_ID";
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

@XendraTrl(Identifier="22569a3f-4434-4000-efd4-ef48f1f30f27")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Instancia del Conjunto de Atributos";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="22569a3f-4434-4000-efd4-ef48f1f30f27",Synchronized="2017-08-05 16:56:30.0")
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
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

@XendraTrl(Identifier="fa02f386-8d2e-5141-fcf5-73da7c4ff119")
public static String es_PE_COLUMN_M_InOut_ID_Name="Entrega / Recibo";

@XendraColumn(AD_Element_ID="5c1a0edf-01a0-832e-098b-d49510db71db",ColumnName="M_InOut_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fa02f386-8d2e-5141-fcf5-73da7c4ff119",
Synchronized="2017-08-05 16:56:30.0")
/** Column name M_InOut_ID */
public static final String COLUMNNAME_M_InOut_ID = "M_InOut_ID";
/** Set Shipment/Receipt Line.
@param M_InOutLine_ID Line on Shipment or Receipt document */
public void setM_InOutLine_ID (int M_InOutLine_ID)
{
if (M_InOutLine_ID <= 0) set_Value (COLUMNNAME_M_InOutLine_ID, null);
 else 
set_Value (COLUMNNAME_M_InOutLine_ID, Integer.valueOf(M_InOutLine_ID));
}
/** Get Shipment/Receipt Line.
@return Line on Shipment or Receipt document */
public int getM_InOutLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_InOutLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="33282bc1-0ca6-df8a-f867-d331052e66dc")
public static String es_PE_COLUMN_M_InOutLine_ID_Name="Línea Entrega / Recibo";

@XendraColumn(AD_Element_ID="a4d9928e-fbec-fd6c-b061-d3dbbd7de02c",ColumnName="M_InOutLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="33282bc1-0ca6-df8a-f867-d331052e66dc",
Synchronized="2017-08-05 16:56:30.0")
/** Column name M_InOutLine_ID */
public static final String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";
/** Set Phys.Inventory.
@param M_Inventory_ID Parameters for a Physical Inventory */
public void setM_Inventory_ID (int M_Inventory_ID)
{
if (M_Inventory_ID <= 0) set_Value (COLUMNNAME_M_Inventory_ID, null);
 else 
set_Value (COLUMNNAME_M_Inventory_ID, Integer.valueOf(M_Inventory_ID));
}
/** Get Phys.Inventory.
@return Parameters for a Physical Inventory */
public int getM_Inventory_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Inventory_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0c6d4ed5-3370-49a3-222e-a9251619dd0e")
public static String es_PE_COLUMN_M_Inventory_ID_Name="Inventario Físico";

@XendraColumn(AD_Element_ID="0e8f85f3-fbb2-f347-b412-2f2218e14665",ColumnName="M_Inventory_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0c6d4ed5-3370-49a3-222e-a9251619dd0e",
Synchronized="2017-08-05 16:56:30.0")
/** Column name M_Inventory_ID */
public static final String COLUMNNAME_M_Inventory_ID = "M_Inventory_ID";
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

@XendraTrl(Identifier="9ee2c1c0-17b4-d6d8-4a55-d0eb1a6d63b4")
public static String es_PE_COLUMN_M_InventoryLine_ID_Name="Línea de Inventario Físico";

@XendraColumn(AD_Element_ID="2c5571d8-3b1f-8721-db52-cae644155140",ColumnName="M_InventoryLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9ee2c1c0-17b4-d6d8-4a55-d0eb1a6d63b4",
Synchronized="2017-08-05 16:56:30.0")
/** Column name M_InventoryLine_ID */
public static final String COLUMNNAME_M_InventoryLine_ID = "M_InventoryLine_ID";
/** Set Locator.
@param M_Locator_ID Warehouse Locator */
public void setM_Locator_ID (int M_Locator_ID)
{
if (M_Locator_ID < 1) throw new IllegalArgumentException ("M_Locator_ID is mandatory.");
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

@XendraTrl(Identifier="0455ae7d-aa5a-015f-5d5e-12bac7b87c18")
public static String es_PE_COLUMN_M_Locator_ID_Name="Ubicación";

@XendraColumn(AD_Element_ID="67f044ce-2864-93f9-fd0d-320945150933",ColumnName="M_Locator_ID",
AD_Reference_ID=31,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0455ae7d-aa5a-015f-5d5e-12bac7b87c18",
Synchronized="2017-08-05 16:56:30.0")
/** Column name M_Locator_ID */
public static final String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
/** Set Inventory Move.
@param M_Movement_ID Movement of Inventory */
public void setM_Movement_ID (int M_Movement_ID)
{
if (M_Movement_ID <= 0) set_Value (COLUMNNAME_M_Movement_ID, null);
 else 
set_Value (COLUMNNAME_M_Movement_ID, Integer.valueOf(M_Movement_ID));
}
/** Get Inventory Move.
@return Movement of Inventory */
public int getM_Movement_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Movement_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6bcd25f6-ff03-84c7-c38a-cf9f3e1bcaf0")
public static String es_PE_COLUMN_M_Movement_ID_Name="Movimiento";

@XendraColumn(AD_Element_ID="38464e21-16a7-4ca4-2d20-bfa901cb61fb",ColumnName="M_Movement_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6bcd25f6-ff03-84c7-c38a-cf9f3e1bcaf0",
Synchronized="2017-08-05 16:56:30.0")
/** Column name M_Movement_ID */
public static final String COLUMNNAME_M_Movement_ID = "M_Movement_ID";
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

@XendraTrl(Identifier="a36bfd34-ba29-9db9-dab9-cbe2fc3f696c")
public static String es_PE_COLUMN_M_MovementLine_ID_Name="Línea del Movimiento";

@XendraColumn(AD_Element_ID="45800ec7-b982-e856-179e-390dd2305e2e",ColumnName="M_MovementLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a36bfd34-ba29-9db9-dab9-cbe2fc3f696c",
Synchronized="2017-08-05 16:56:30.0")
/** Column name M_MovementLine_ID */
public static final String COLUMNNAME_M_MovementLine_ID = "M_MovementLine_ID";
/** Set Movement Date.
@param MovementDate Date a product was moved in or out of inventory */
public void setMovementDate (Timestamp MovementDate)
{
if (MovementDate == null) throw new IllegalArgumentException ("MovementDate is mandatory.");
set_Value (COLUMNNAME_MovementDate, MovementDate);
}
/** Get Movement Date.
@return Date a product was moved in or out of inventory */
public Timestamp getMovementDate() 
{
return (Timestamp)get_Value(COLUMNNAME_MovementDate);
}

@XendraTrl(Identifier="9a25f536-ba13-423b-682c-56b68ee1204a")
public static String es_PE_COLUMN_MovementDate_Name="Fecha de Movimiento";

@XendraColumn(AD_Element_ID="7a907f01-8525-820d-22d4-98b06d4b902b",ColumnName="MovementDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9a25f536-ba13-423b-682c-56b68ee1204a",
Synchronized="2017-08-05 16:56:30.0")
/** Column name MovementDate */
public static final String COLUMNNAME_MovementDate = "MovementDate";
/** Set Movement Quantity.
@param MovementQty Quantity of a product moved. */
public void setMovementQty (BigDecimal MovementQty)
{
if (MovementQty == null) throw new IllegalArgumentException ("MovementQty is mandatory.");
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

@XendraTrl(Identifier="8e270647-75de-01aa-23a7-7d5182de9837")
public static String es_PE_COLUMN_MovementQty_Name="Cantidad del Movimiento";

@XendraColumn(AD_Element_ID="36c2f62a-1d3b-a3ff-a433-9fc2eec47380",ColumnName="MovementQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8e270647-75de-01aa-23a7-7d5182de9837",
Synchronized="2017-08-05 16:56:30.0")
/** Column name MovementQty */
public static final String COLUMNNAME_MovementQty = "MovementQty";

/** MovementType AD_Reference=0455b4db-004d-594c-a505-3e493bfda9ad */
public static final int MOVEMENTTYPE_AD_Reference_ID=189;
/** Set Movement Type.
@param MovementType Method of moving the inventory */
public void setMovementType (String MovementType)
{
if (MovementType == null) throw new IllegalArgumentException ("MovementType is mandatory");
if (MovementType.equals(REF_M_TransactionMovementType.WorkOrderPlus) || MovementType.equals(REF_M_TransactionMovementType.WorkOrder_) || MovementType.equals(REF_M_TransactionMovementType.ProductionPlus) || MovementType.equals(REF_M_TransactionMovementType.InventoryIn) || MovementType.equals(REF_M_TransactionMovementType.VendorReturns) || MovementType.equals(REF_M_TransactionMovementType.MovementFrom) || MovementType.equals(REF_M_TransactionMovementType.Production_) || MovementType.equals(REF_M_TransactionMovementType.CustomerShipment) || MovementType.equals(REF_M_TransactionMovementType.VendorReceipts) || MovementType.equals(REF_M_TransactionMovementType.InventoryOut) || MovementType.equals(REF_M_TransactionMovementType.MovementTo) || MovementType.equals(REF_M_TransactionMovementType.CustomerReturns) || MovementType.equals(REF_M_TransactionMovementType.NotApply));
 else throw new IllegalArgumentException ("MovementType Invalid value - " + MovementType + " - Reference_ID=189 - W+ - W- - P+ - I+ - R- - M- - P- - C- - V+ - I- - M+ - R+ - NA");
if (MovementType.length() > 2)
{
log.warning("Length > 2 - truncated");
MovementType = MovementType.substring(0,1);
}
set_Value (COLUMNNAME_MovementType, MovementType);
}
/** Get Movement Type.
@return Method of moving the inventory */
public String getMovementType() 
{
return (String)get_Value(COLUMNNAME_MovementType);
}

@XendraTrl(Identifier="7e923061-def3-e7b2-9028-edaf24017b98")
public static String es_PE_COLUMN_MovementType_Name="Tipo de Movimiento";

@XendraColumn(AD_Element_ID="6deba235-3003-eca1-becf-5fd99b19b2a9",ColumnName="MovementType",
AD_Reference_ID=17,AD_Reference_Value_ID="0455b4db-004d-594c-a505-3e493bfda9ad",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7e923061-def3-e7b2-9028-edaf24017b98",Synchronized="2017-08-05 16:56:30.0")
/** Column name MovementType */
public static final String COLUMNNAME_MovementType = "MovementType";
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

@XendraTrl(Identifier="3d06b7d4-a08e-e2e7-82a5-d2e4623299f4")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3d06b7d4-a08e-e2e7-82a5-d2e4623299f4",
Synchronized="2017-08-05 16:56:30.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Production.
@param M_Production_ID Plan for producing a product */
public void setM_Production_ID (int M_Production_ID)
{
if (M_Production_ID <= 0) set_Value (COLUMNNAME_M_Production_ID, null);
 else 
set_Value (COLUMNNAME_M_Production_ID, Integer.valueOf(M_Production_ID));
}
/** Get Production.
@return Plan for producing a product */
public int getM_Production_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Production_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="67ec1b66-5a5b-7427-ceea-eeae2d3a5da1")
public static String es_PE_COLUMN_M_Production_ID_Name="Producción";

@XendraColumn(AD_Element_ID="9c8dd82c-e2c6-2b73-d9f8-045652e10cb9",ColumnName="M_Production_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="67ec1b66-5a5b-7427-ceea-eeae2d3a5da1",
Synchronized="2017-08-05 16:56:30.0")
/** Column name M_Production_ID */
public static final String COLUMNNAME_M_Production_ID = "M_Production_ID";
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

@XendraTrl(Identifier="3de0573f-4a75-a68e-6d21-1313ab45ddd8")
public static String es_PE_COLUMN_M_ProductionLine_ID_Name="Línea de Producción";

@XendraColumn(AD_Element_ID="cd41491f-514d-42fd-aaf9-36308e165c0b",
ColumnName="M_ProductionLine_ID",AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3de0573f-4a75-a68e-6d21-1313ab45ddd8",Synchronized="2017-08-05 16:56:30.0")
/** Column name M_ProductionLine_ID */
public static final String COLUMNNAME_M_ProductionLine_ID = "M_ProductionLine_ID";
/** Set Inventory Transaction.
@param M_Transaction_ID Inventory Transaction */
public void setM_Transaction_ID (int M_Transaction_ID)
{
if (M_Transaction_ID < 1) throw new IllegalArgumentException ("M_Transaction_ID is mandatory.");
set_Value (COLUMNNAME_M_Transaction_ID, Integer.valueOf(M_Transaction_ID));
}
/** Get Inventory Transaction.
@return Inventory Transaction */
public int getM_Transaction_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Transaction_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fb4df81e-e54f-0fc3-7102-f33887d836da")
public static String es_PE_COLUMN_M_Transaction_ID_Name="Transacción de Inventario";

@XendraColumn(AD_Element_ID="f5a7dcbf-becf-1bc2-2dd2-ee6fd51f398c",ColumnName="M_Transaction_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fb4df81e-e54f-0fc3-7102-f33887d836da",
Synchronized="2017-08-05 16:56:30.0")
/** Column name M_Transaction_ID */
public static final String COLUMNNAME_M_Transaction_ID = "M_Transaction_ID";
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

@XendraTrl(Identifier="ab8ca52a-730a-b7e8-bc10-0c9c940b67f6")
public static String es_PE_COLUMN_PriceCost_Name="Cost Price";

@XendraColumn(AD_Element_ID="decf6dde-230c-11ea-c777-e7b052b8e69e",ColumnName="PriceCost",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ab8ca52a-730a-b7e8-bc10-0c9c940b67f6",
Synchronized="2017-08-05 16:56:30.0")
/** Column name PriceCost */
public static final String COLUMNNAME_PriceCost = "PriceCost";

/** Search_InOut_ID AD_Reference=09bcaf38-49c7-0311-4a15-1296d9699294 */
public static final int SEARCH_INOUT_ID_AD_Reference_ID=295;
/** Set Search Shipment/Receipt.
@param Search_InOut_ID Material Shipment Document */
public void setSearch_InOut_ID (int Search_InOut_ID)
{
if (Search_InOut_ID <= 0) set_Value (COLUMNNAME_Search_InOut_ID, null);
 else 
set_Value (COLUMNNAME_Search_InOut_ID, Integer.valueOf(Search_InOut_ID));
}
/** Get Search Shipment/Receipt.
@return Material Shipment Document */
public int getSearch_InOut_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Search_InOut_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c3883ac7-d28a-e750-77a6-d6fc4b5d1f8f")
public static String es_PE_COLUMN_Search_InOut_ID_Name="Busca Entrega/Recibo";

@XendraColumn(AD_Element_ID="6fbbb968-8f1c-5920-b6d9-f4d7b1883664",ColumnName="Search_InOut_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="09bcaf38-49c7-0311-4a15-1296d9699294",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c3883ac7-d28a-e750-77a6-d6fc4b5d1f8f",Synchronized="2017-08-05 16:56:30.0")
/** Column name Search_InOut_ID */
public static final String COLUMNNAME_Search_InOut_ID = "Search_InOut_ID";

/** Search_Invoice_ID AD_Reference=7fd6a4ea-911e-151b-68bf-3a86cc5f06e3 */
public static final int SEARCH_INVOICE_ID_AD_Reference_ID=336;
/** Set Search Invoice.
@param Search_Invoice_ID Search Invoice Identifier */
public void setSearch_Invoice_ID (int Search_Invoice_ID)
{
if (Search_Invoice_ID <= 0) set_Value (COLUMNNAME_Search_Invoice_ID, null);
 else 
set_Value (COLUMNNAME_Search_Invoice_ID, Integer.valueOf(Search_Invoice_ID));
}
/** Get Search Invoice.
@return Search Invoice Identifier */
public int getSearch_Invoice_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Search_Invoice_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d58c042e-994c-a87c-02f5-ba1344468fc0")
public static String es_PE_COLUMN_Search_Invoice_ID_Name="Busqueda de Factura";

@XendraColumn(AD_Element_ID="438ecd95-37fc-a6d4-f0db-5d7271a7fe2c",ColumnName="Search_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="7fd6a4ea-911e-151b-68bf-3a86cc5f06e3",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d58c042e-994c-a87c-02f5-ba1344468fc0",Synchronized="2017-08-05 16:56:30.0")
/** Column name Search_Invoice_ID */
public static final String COLUMNNAME_Search_Invoice_ID = "Search_Invoice_ID";

/** Search_Order_ID AD_Reference=0dbd9edb-94cc-bd5a-1824-0c6381e7976b */
public static final int SEARCH_ORDER_ID_AD_Reference_ID=290;
/** Set Search Order.
@param Search_Order_ID Order Identifier */
public void setSearch_Order_ID (int Search_Order_ID)
{
if (Search_Order_ID <= 0) set_Value (COLUMNNAME_Search_Order_ID, null);
 else 
set_Value (COLUMNNAME_Search_Order_ID, Integer.valueOf(Search_Order_ID));
}
/** Get Search Order.
@return Order Identifier */
public int getSearch_Order_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Search_Order_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b54d975a-5af2-353a-cbbc-d74360fba5a6")
public static String es_PE_COLUMN_Search_Order_ID_Name="Busca Órden";

@XendraColumn(AD_Element_ID="4d871ce3-94a4-04df-2adf-a368052275e1",ColumnName="Search_Order_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="0dbd9edb-94cc-bd5a-1824-0c6381e7976b",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b54d975a-5af2-353a-cbbc-d74360fba5a6",Synchronized="2017-08-05 16:56:30.0")
/** Column name Search_Order_ID */
public static final String COLUMNNAME_Search_Order_ID = "Search_Order_ID";
}
