/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software;
 you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY;
 without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program;
 if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.compiere.model;

/** Generated Model - DO NOT CHANGE */
import java.util.*;
import java.sql.*;
import java.math.*;

import org.compiere.model.reference.REF_M_TransactionMovementType;
import org.compiere.util.*;
/** Generated Model for T_Carding
 *  @author Adempiere (generated) 
 *  @version Release 1.20 - $Id: X_T_Carding.java 5583 2015-08-05 14:11:58Z xapiens $ */
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
public static final int Table_ID=MTable.getTable_ID("T_Carding");

/** TableName=T_Carding */
public static final String Table_Name="T_Carding";

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
if (AD_PInstance_ID <= 0) set_Value ("AD_PInstance_ID", null);
 else 
set_Value ("AD_PInstance_ID", Integer.valueOf(AD_PInstance_ID));
}
/** Get Process Instance.
@return Instance of the process */
public int getAD_PInstance_ID() 
{
Integer ii = (Integer)get_Value("AD_PInstance_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_PInstance_ID */
public static final String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
/** Set Shipment/Receipt Line.
@param M_InOutLine_ID Line on Shipment or Receipt document */
public void setM_InOutLine_ID (int M_InOutLine_ID)
{
if (M_InOutLine_ID <= 0) set_Value ("M_InOutLine_ID", null);
 else 
set_Value ("M_InOutLine_ID", Integer.valueOf(M_InOutLine_ID));
}
/** Get Shipment/Receipt Line.
@return Line on Shipment or Receipt document */
public int getM_InOutLine_ID() 
{
Integer ii = (Integer)get_Value("M_InOutLine_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name M_InOutLine_ID */
public static final String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";
/** Set Phys.Inventory Line.
@param M_InventoryLine_ID Unique line in an Inventory document */
public void setM_InventoryLine_ID (int M_InventoryLine_ID)
{
if (M_InventoryLine_ID <= 0) set_Value ("M_InventoryLine_ID", null);
 else 
set_Value ("M_InventoryLine_ID", Integer.valueOf(M_InventoryLine_ID));
}
/** Get Phys.Inventory Line.
@return Unique line in an Inventory document */
public int getM_InventoryLine_ID() 
{
Integer ii = (Integer)get_Value("M_InventoryLine_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name M_InventoryLine_ID */
public static final String COLUMNNAME_M_InventoryLine_ID = "M_InventoryLine_ID";
/** Set Locator.
@param M_Locator_ID Warehouse Locator */
public void setM_Locator_ID (int M_Locator_ID)
{
if (M_Locator_ID <= 0) set_Value ("M_Locator_ID", null);
 else 
set_Value ("M_Locator_ID", Integer.valueOf(M_Locator_ID));
}
/** Get Locator.
@return Warehouse Locator */
public int getM_Locator_ID() 
{
Integer ii = (Integer)get_Value("M_Locator_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name M_Locator_ID */
public static final String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
/** Set Move Line.
@param M_MovementLine_ID Inventory Move document Line */
public void setM_MovementLine_ID (int M_MovementLine_ID)
{
if (M_MovementLine_ID <= 0) set_Value ("M_MovementLine_ID", null);
 else 
set_Value ("M_MovementLine_ID", Integer.valueOf(M_MovementLine_ID));
}
/** Get Move Line.
@return Inventory Move document Line */
public int getM_MovementLine_ID() 
{
Integer ii = (Integer)get_Value("M_MovementLine_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name M_MovementLine_ID */
public static final String COLUMNNAME_M_MovementLine_ID = "M_MovementLine_ID";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID <= 0) set_Value ("M_Product_ID", null);
 else 
set_Value ("M_Product_ID", Integer.valueOf(M_Product_ID));
}
/** Get Product.
@return Product, Service, Item */
public int getM_Product_ID() 
{
Integer ii = (Integer)get_Value("M_Product_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Production Line.
@param M_ProductionLine_ID Document Line representing a production */
public void setM_ProductionLine_ID (int M_ProductionLine_ID)
{
if (M_ProductionLine_ID <= 0) set_Value ("M_ProductionLine_ID", null);
 else 
set_Value ("M_ProductionLine_ID", Integer.valueOf(M_ProductionLine_ID));
}
/** Get Production Line.
@return Document Line representing a production */
public int getM_ProductionLine_ID() 
{
Integer ii = (Integer)get_Value("M_ProductionLine_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name M_ProductionLine_ID */
public static final String COLUMNNAME_M_ProductionLine_ID = "M_ProductionLine_ID";
/** Set Movement Date.
@param MovementDate Date a product was moved in or out of inventory */
public void setMovementDate (Timestamp MovementDate)
{
set_Value ("MovementDate", MovementDate);
}
/** Get Movement Date.
@return Date a product was moved in or out of inventory */
public Timestamp getMovementDate() 
{
return (Timestamp)get_Value("MovementDate");
}
/** Column name MovementDate */
public static final String COLUMNNAME_MovementDate = "MovementDate";
/** Set Movement Quantity.
@param MovementQty Quantity of a product moved. */
public void setMovementQty (BigDecimal MovementQty)
{
set_Value ("MovementQty", MovementQty);
}
/** Get Movement Quantity.
@return Quantity of a product moved. */
public BigDecimal getMovementQty() 
{
BigDecimal bd = (BigDecimal)get_Value("MovementQty");
if (bd == null) return Env.ZERO;
return bd;
}
/** Column name MovementQty */
public static final String COLUMNNAME_MovementQty = "MovementQty";
/** Set Movement Quantity Balance.
@param MovementQtyBalance Movement Quantity Balance */
public void setMovementQtyBalance (BigDecimal MovementQtyBalance)
{
set_Value ("MovementQtyBalance", MovementQtyBalance);
}
/** Get Movement Quantity Balance.
@return Movement Quantity Balance */
public BigDecimal getMovementQtyBalance() 
{
BigDecimal bd = (BigDecimal)get_Value("MovementQtyBalance");
if (bd == null) return Env.ZERO;
return bd;
}
/** Column name MovementQtyBalance */
public static final String COLUMNNAME_MovementQtyBalance = "MovementQtyBalance";

/** MovementType AD_Reference_ID=189 */
public static final int MOVEMENTTYPE_AD_Reference_ID=189;
/** Set Movement Type.
@param MovementType Method of moving the inventory */
public void setMovementType (String MovementType)
{
if (MovementType.equals(REF_M_TransactionMovementType.CustomerShipment) 
		 || MovementType.equals(REF_M_TransactionMovementType.InventoryOut) || MovementType.equals(REF_M_TransactionMovementType.InventoryIn) 
		 || MovementType.equals(REF_M_TransactionMovementType.MovementFrom) || MovementType.equals(REF_M_TransactionMovementType.MovementTo) 
		 || MovementType.equals(REF_M_TransactionMovementType.Production_) || MovementType.equals(REF_M_TransactionMovementType.ProductionPlus) 
		 || MovementType.equals(REF_M_TransactionMovementType.VendorReceipts) || MovementType.equals(REF_M_TransactionMovementType.VendorReturns) 
		 || MovementType.equals(REF_M_TransactionMovementType.WorkOrder_) || MovementType.equals(REF_M_TransactionMovementType.WorkOrderPlus));
 else throw new IllegalArgumentException ("MovementType Invalid value - " + MovementType + " - Reference_ID=189 -  C- - R+ - I- - I+ - M- - M+ - P- - P+ - V+ - R- - W- - W+");
if (MovementType != null && MovementType.length() > 10)
{
log.warning("Length > 10 - truncated");
MovementType = MovementType.substring(0,9);
}
set_Value ("MovementType", MovementType);
}
/** Get Movement Type.
@return Method of moving the inventory */
public String getMovementType() 
{
return (String)get_Value("MovementType");
}
/** Column name MovementType */
public static final String COLUMNNAME_MovementType = "MovementType";
/** Set Cost Price.
@param PriceCost Price per Unit of Measure including all indirect costs (Freight, etc.) */
public void setPriceCost (BigDecimal PriceCost)
{
set_Value ("PriceCost", PriceCost);
}
/** Get Cost Price.
@return Price per Unit of Measure including all indirect costs (Freight, etc.) */
public BigDecimal getPriceCost() 
{
BigDecimal bd = (BigDecimal)get_Value("PriceCost");
if (bd == null) return Env.ZERO;
return bd;
}
/** Column name PriceCost */
public static final String COLUMNNAME_PriceCost = "PriceCost";
/** Set Total Cost.
@param TotalCost Total Cost  (Freight, etc.) */
public void setTotalCost (BigDecimal TotalCost)
{
set_Value ("TotalCost", TotalCost);
}
/** Get Total Cost.
@return Total Cost  (Freight, etc.) */
public BigDecimal getTotalCost() 
{
BigDecimal bd = (BigDecimal)get_Value("TotalCost");
if (bd == null) return Env.ZERO;
return bd;
}
/** Column name TotalCost */
public static final String COLUMNNAME_TotalCost = "TotalCost";
}
