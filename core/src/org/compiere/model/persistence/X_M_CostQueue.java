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
/** Generated Model for M_CostQueue
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_CostQueue extends PO
{
/** Standard Constructor
@param ctx context
@param M_CostQueue_ID id
@param trxName transaction
*/
public X_M_CostQueue (Properties ctx, int M_CostQueue_ID, String trxName)
{
super (ctx, M_CostQueue_ID, trxName);
/** if (M_CostQueue_ID == 0)
{
setC_AcctSchema_ID (0);
setCurrentCostPrice (Env.ZERO);
setCurrentQty (Env.ZERO);
setM_AttributeSetInstance_ID (0);
setM_CostElement_ID (0);
setM_CostQueue_ID (0);
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
public X_M_CostQueue (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000343 */
public static int Table_ID=MTable.getTable_ID("M_CostQueue");

@XendraTrl(Identifier="c7fc1b96-75eb-3bb8-046d-e0a0e3462a39")
public static String es_PE_TABLE_M_CostQueue_Name="Cost Queue";

@XendraTable(Name="Cost Queue",Description="",Help="",TableName="M_CostQueue",AccessLevel="6",
AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,
IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="c7fc1b96-75eb-3bb8-046d-e0a0e3462a39",Synchronized="2017-08-16 11:43:08.0")
/** TableName=M_CostQueue */
public static final String Table_Name="M_CostQueue";


@XendraIndex(Name="m_costqueue_product",Identifier="553fad82-d23b-f20a-0fc5-2c34ec64a7f8",
Column_Names="c_acctschema_id, m_product_id, m_costelement_id",IsUnique="false",
TableIdentifier="553fad82-d23b-f20a-0fc5-2c34ec64a7f8",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_m_costqueue_product = "553fad82-d23b-f20a-0fc5-2c34ec64a7f8";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_CostQueue");

protected BigDecimal accessLevel = BigDecimal.valueOf(6);
/** AccessLevel
@return 6 - System - Client 
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
    Table_ID = MTable.getTable_ID("M_CostQueue");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_CostQueue[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Accounting Schema.
@param C_AcctSchema_ID Rules for accounting */
public void setC_AcctSchema_ID (int C_AcctSchema_ID)
{
if (C_AcctSchema_ID < 1) throw new IllegalArgumentException ("C_AcctSchema_ID is mandatory.");
set_Value (COLUMNNAME_C_AcctSchema_ID, Integer.valueOf(C_AcctSchema_ID));
}
/** Get Accounting Schema.
@return Rules for accounting */
public int getC_AcctSchema_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_AcctSchema_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a0032868-9887-4adb-315c-c1aa0bdcfc7a")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Accounting Schema";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a0032868-9887-4adb-315c-c1aa0bdcfc7a",
Synchronized="2017-08-05 16:55:03.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
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

@XendraTrl(Identifier="7fa6420d-23ce-5cc7-26fd-6ea71ae31213")
public static String es_PE_COLUMN_CurrentCostPrice_Name="Current Cost Price";

@XendraColumn(AD_Element_ID="d07935b6-9cf0-08b3-6cd9-004592823010",ColumnName="CurrentCostPrice",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7fa6420d-23ce-5cc7-26fd-6ea71ae31213",
Synchronized="2017-08-05 16:55:03.0")
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

@XendraTrl(Identifier="6dfc7bdc-ffda-28e9-9591-77456c333217")
public static String es_PE_COLUMN_CurrentQty_Name="Current Quantity";

@XendraColumn(AD_Element_ID="40e7fa44-f8c3-2486-0b6e-fb1fb23bc7a4",ColumnName="CurrentQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6dfc7bdc-ffda-28e9-9591-77456c333217",
Synchronized="2017-08-05 16:55:03.0")
/** Column name CurrentQty */
public static final String COLUMNNAME_CurrentQty = "CurrentQty";
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
@XendraTrl(Identifier="e300ce10-6d73-4af4-9a7b-a39d8c9cc19d")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e300ce10-6d73-4af4-9a7b-a39d8c9cc19d",
Synchronized="2017-08-05 16:55:03.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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

@XendraTrl(Identifier="ecdbac5b-2f0a-e8a9-bfe1-8c2e2a6020f1")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Attribute Set Instance";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ecdbac5b-2f0a-e8a9-bfe1-8c2e2a6020f1",Synchronized="2017-08-05 16:55:03.0")
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
/** Set Cost Element.
@param M_CostElement_ID Product Cost Element */
public void setM_CostElement_ID (int M_CostElement_ID)
{
if (M_CostElement_ID < 1) throw new IllegalArgumentException ("M_CostElement_ID is mandatory.");
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

@XendraTrl(Identifier="bfea83be-0cf0-2eb5-6a90-6f6e852dbd75")
public static String es_PE_COLUMN_M_CostElement_ID_Name="Cost Element";

@XendraColumn(AD_Element_ID="1b5355ae-f799-dbe3-d07b-17cb2162e976",ColumnName="M_CostElement_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bfea83be-0cf0-2eb5-6a90-6f6e852dbd75",
Synchronized="2017-08-05 16:55:03.0")
/** Column name M_CostElement_ID */
public static final String COLUMNNAME_M_CostElement_ID = "M_CostElement_ID";
/** Set Cost Queue.
@param M_CostQueue_ID FiFo/LiFo Cost Queue */
public void setM_CostQueue_ID (int M_CostQueue_ID)
{
if (M_CostQueue_ID < 1) throw new IllegalArgumentException ("M_CostQueue_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_CostQueue_ID, Integer.valueOf(M_CostQueue_ID));
}
/** Get Cost Queue.
@return FiFo/LiFo Cost Queue */
public int getM_CostQueue_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_CostQueue_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name M_CostQueue_ID */
public static final String COLUMNNAME_M_CostQueue_ID = "M_CostQueue_ID";
/** Set Cost Type.
@param M_CostType_ID Type of Cost (e.g. Current, Plan, Future) */
public void setM_CostType_ID (int M_CostType_ID)
{
if (M_CostType_ID < 1) throw new IllegalArgumentException ("M_CostType_ID is mandatory.");
set_Value (COLUMNNAME_M_CostType_ID, Integer.valueOf(M_CostType_ID));
}
/** Get Cost Type.
@return Type of Cost (e.g. Current, Plan, Future) */
public int getM_CostType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_CostType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="dff25f5c-2418-40ea-02dd-90f38d461a3b")
public static String es_PE_COLUMN_M_CostType_ID_Name="Cost Type";

@XendraColumn(AD_Element_ID="d57fad3f-6266-3f9c-4044-9945fe7f0ca3",ColumnName="M_CostType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dff25f5c-2418-40ea-02dd-90f38d461a3b",
Synchronized="2017-08-05 16:55:04.0")
/** Column name M_CostType_ID */
public static final String COLUMNNAME_M_CostType_ID = "M_CostType_ID";
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

@XendraTrl(Identifier="f83f94dc-e5ca-9247-fccf-de06e4d105ac")
public static String es_PE_COLUMN_M_Product_ID_Name="Product";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f83f94dc-e5ca-9247-fccf-de06e4d105ac",
Synchronized="2017-08-05 16:55:04.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
}
