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
/** Generated Model for M_StorageMonthly
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_StorageMonthly extends PO
{
/** Standard Constructor
@param ctx context
@param M_StorageMonthly_ID id
@param trxName transaction
*/
public X_M_StorageMonthly (Properties ctx, int M_StorageMonthly_ID, String trxName)
{
super (ctx, M_StorageMonthly_ID, trxName);
/** if (M_StorageMonthly_ID == 0)
{
setC_Period_ID (0);
setM_AttributeSetInstance_ID (0);
setM_Locator_ID (0);
setM_Product_ID (0);
setM_StorageMonthly_ID (0);
setQtyOnHand (Env.ZERO);
setQtyOrdered (Env.ZERO);
setQtyReserved (Env.ZERO);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_StorageMonthly (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000328 */
public static int Table_ID=MTable.getTable_ID("M_StorageMonthly");

@XendraTrl(Identifier="ac6b9df4-45f2-4ca0-8baa-e13a44d764ac")
public static String es_PE_TABLE_M_StorageMonthly_Name="Storage Monthly";

@XendraTable(Name="Storage Monthly",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="M_StorageMonthly",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.material",Identifier="ac6b9df4-45f2-4ca0-8baa-e13a44d764ac",
Synchronized="2020-03-03 21:38:58.0")
/** TableName=M_StorageMonthly */
public static final String Table_Name="M_StorageMonthly";


@XendraIndex(Name="storagemonthlyproduct",Identifier="d545440b-1e57-43eb-9455-c3e4a57fe0ce",
Column_Names="ad_client_id, ad_org_id, m_product_id, c_period_id",IsUnique="false",
TableIdentifier="d545440b-1e57-43eb-9455-c3e4a57fe0ce",Synchronized="2015-09-19 20:15:27.0")
public static final String INDEXNAME_storagemonthlyproduct = "d545440b-1e57-43eb-9455-c3e4a57fe0ce";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_StorageMonthly");

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
    Table_ID = MTable.getTable_ID("M_StorageMonthly");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_StorageMonthly[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Period.
@param C_Period_ID Period of the Calendar */
public void setC_Period_ID (int C_Period_ID)
{
if (C_Period_ID < 1) throw new IllegalArgumentException ("C_Period_ID is mandatory.");
set_Value (COLUMNNAME_C_Period_ID, Integer.valueOf(C_Period_ID));
}
/** Get Period.
@return Period of the Calendar */
public int getC_Period_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Period_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d03867db-23a5-4c37-8c7f-46a5208fbb04")
public static String es_PE_COLUMN_C_Period_ID_Name="Period";

@XendraColumn(AD_Element_ID="8f295c04-0eb4-a8f3-829f-cc6a6bd1df1e",ColumnName="C_Period_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d03867db-23a5-4c37-8c7f-46a5208fbb04",
Synchronized="2019-08-30 22:23:33.0")
/** Column name C_Period_ID */
public static final String COLUMNNAME_C_Period_ID = "C_Period_ID";
/** Set Date last inventory count.
@param DateLastInventory Date of Last Inventory Count */
public void setDateLastInventory (Timestamp DateLastInventory)
{
set_Value (COLUMNNAME_DateLastInventory, DateLastInventory);
}
/** Get Date last inventory count.
@return Date of Last Inventory Count */
public Timestamp getDateLastInventory() 
{
return (Timestamp)get_Value(COLUMNNAME_DateLastInventory);
}

@XendraTrl(Identifier="afc6a75c-ca56-4349-94f1-4e25f546207c")
public static String es_PE_COLUMN_DateLastInventory_Name="Date last inventory count";

@XendraColumn(AD_Element_ID="a85ef901-a554-3a25-6dda-793a8a73752b",ColumnName="DateLastInventory",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="afc6a75c-ca56-4349-94f1-4e25f546207c",
Synchronized="2019-08-30 22:23:33.0")
/** Column name DateLastInventory */
public static final String COLUMNNAME_DateLastInventory = "DateLastInventory";
/** Set Date last run.
@param DateLastRun Date the process was last run. */
public void setDateLastRun (Timestamp DateLastRun)
{
set_Value (COLUMNNAME_DateLastRun, DateLastRun);
}
/** Get Date last run.
@return Date the process was last run. */
public Timestamp getDateLastRun() 
{
return (Timestamp)get_Value(COLUMNNAME_DateLastRun);
}

@XendraTrl(Identifier="ecad75e1-44f6-41bf-8d07-2a3d63bfe8db")
public static String es_PE_COLUMN_DateLastRun_Name="Date last run";

@XendraColumn(AD_Element_ID="e4c09739-6370-19ca-fdeb-4cdf8025abb8",ColumnName="DateLastRun",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ecad75e1-44f6-41bf-8d07-2a3d63bfe8db",
Synchronized="2019-08-30 22:23:33.0")
/** Column name DateLastRun */
public static final String COLUMNNAME_DateLastRun = "DateLastRun";
/** Set Error Msg.
@param ErrorMsg Error Msg */
public void setErrorMsg (String ErrorMsg)
{
set_Value (COLUMNNAME_ErrorMsg, ErrorMsg);
}
/** Get Error Msg.
@return Error Msg */
public String getErrorMsg() 
{
String value = (String)get_Value(COLUMNNAME_ErrorMsg);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="e25b1edc-0de5-407f-9f8f-1a693f0ce769")
public static String es_PE_COLUMN_ErrorMsg_Name="Error Msg";

@XendraColumn(AD_Element_ID="7ed8e902-7223-0140-a5e2-159d12a79a58",ColumnName="ErrorMsg",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e25b1edc-0de5-407f-9f8f-1a693f0ce769",
Synchronized="2019-08-30 22:23:33.0")
/** Column name ErrorMsg */
public static final String COLUMNNAME_ErrorMsg = "ErrorMsg";
/** Set LastCosted.
@param LastCosted LastCosted */
public void setLastCosted (Timestamp LastCosted)
{
set_Value (COLUMNNAME_LastCosted, LastCosted);
}
/** Get LastCosted.
@return LastCosted */
public Timestamp getLastCosted() 
{
return (Timestamp)get_Value(COLUMNNAME_LastCosted);
}

@XendraTrl(Identifier="53167fd4-3bb9-4ca6-ac90-2b3f14306854")
public static String es_PE_COLUMN_LastCosted_Name="LastCosted";

@XendraColumn(AD_Element_ID="13460917-cbad-45c0-a98e-aa5d708aeb80",ColumnName="LastCosted",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="53167fd4-3bb9-4ca6-ac90-2b3f14306854",
Synchronized="2019-08-30 22:23:33.0")
/** Column name LastCosted */
public static final String COLUMNNAME_LastCosted = "LastCosted";
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

@XendraTrl(Identifier="41a6619c-2a7a-483e-8bd9-2df4169bcabc")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Attribute Set Instance";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="41a6619c-2a7a-483e-8bd9-2df4169bcabc",Synchronized="2019-08-30 22:23:33.0")
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
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

@XendraTrl(Identifier="cb062ece-b2ae-4fdd-b632-317e8da000ec")
public static String es_PE_COLUMN_M_Locator_ID_Name="Locator";

@XendraColumn(AD_Element_ID="67f044ce-2864-93f9-fd0d-320945150933",ColumnName="M_Locator_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cb062ece-b2ae-4fdd-b632-317e8da000ec",
Synchronized="2019-08-30 22:23:33.0")
/** Column name M_Locator_ID */
public static final String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
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

@XendraTrl(Identifier="488c061f-efe1-48c4-9cab-790190b8748b")
public static String es_PE_COLUMN_M_Product_ID_Name="Product";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="488c061f-efe1-48c4-9cab-790190b8748b",
Synchronized="2019-08-30 22:23:33.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set M_Storage.
@param M_Storage_ID M_Storage */
public void setM_Storage_ID (int M_Storage_ID)
{
if (M_Storage_ID <= 0) set_Value (COLUMNNAME_M_Storage_ID, null);
 else 
set_Value (COLUMNNAME_M_Storage_ID, Integer.valueOf(M_Storage_ID));
}
/** Get M_Storage.
@return M_Storage */
public int getM_Storage_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Storage_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f8ad848e-7ffe-4afb-8443-80237002a71b")
public static String es_PE_COLUMN_M_Storage_ID_Name="M_Storage";

@XendraColumn(AD_Element_ID="6edd44fb-9fb0-4dd2-bc73-90bd0caa3f53",ColumnName="M_Storage_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f8ad848e-7ffe-4afb-8443-80237002a71b",
Synchronized="2019-08-30 22:23:33.0")
/** Column name M_Storage_ID */
public static final String COLUMNNAME_M_Storage_ID = "M_Storage_ID";
/** Set Storage Monthly.
@param M_StorageMonthly_ID Storage Monthly */
public void setM_StorageMonthly_ID (int M_StorageMonthly_ID)
{
if (M_StorageMonthly_ID < 1) throw new IllegalArgumentException ("M_StorageMonthly_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_StorageMonthly_ID, Integer.valueOf(M_StorageMonthly_ID));
}
/** Get Storage Monthly.
@return Storage Monthly */
public int getM_StorageMonthly_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_StorageMonthly_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name M_StorageMonthly_ID */
public static final String COLUMNNAME_M_StorageMonthly_ID = "M_StorageMonthly_ID";
/** Set Warehouse.
@param M_Warehouse_ID Storage Warehouse and Service Point */
public void setM_Warehouse_ID (int M_Warehouse_ID)
{
if (M_Warehouse_ID <= 0) set_Value (COLUMNNAME_M_Warehouse_ID, null);
 else 
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

@XendraTrl(Identifier="58885e7b-21e7-4654-bb1e-ce3a4c581acd")
public static String es_PE_COLUMN_M_Warehouse_ID_Name="Warehouse";

@XendraColumn(AD_Element_ID="402045cd-baa5-aeaf-b148-a921dffb7821",ColumnName="M_Warehouse_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="58885e7b-21e7-4654-bb1e-ce3a4c581acd",
Synchronized="2019-08-30 22:23:33.0")
/** Column name M_Warehouse_ID */
public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
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

@XendraTrl(Identifier="11bc35f1-5ddb-4b33-a25c-398593ae299d")
public static String es_PE_COLUMN_Processed_Name="Processed";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="11bc35f1-5ddb-4b33-a25c-398593ae299d",
Synchronized="2019-08-30 22:23:33.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set On Hand Quantity.
@param QtyOnHand On Hand Quantity */
public void setQtyOnHand (BigDecimal QtyOnHand)
{
if (QtyOnHand == null) throw new IllegalArgumentException ("QtyOnHand is mandatory.");
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

@XendraTrl(Identifier="8ce90c5a-c26d-4e7d-9949-9c83d224bc81")
public static String es_PE_COLUMN_QtyOnHand_Name="On Hand Quantity";

@XendraColumn(AD_Element_ID="491f8fda-42bc-512d-4b3c-2a1cad786e74",ColumnName="QtyOnHand",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8ce90c5a-c26d-4e7d-9949-9c83d224bc81",
Synchronized="2019-08-30 22:23:33.0")
/** Column name QtyOnHand */
public static final String COLUMNNAME_QtyOnHand = "QtyOnHand";
/** Set Ordered Quantity.
@param QtyOrdered Ordered Quantity */
public void setQtyOrdered (BigDecimal QtyOrdered)
{
if (QtyOrdered == null) throw new IllegalArgumentException ("QtyOrdered is mandatory.");
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

@XendraTrl(Identifier="0d514c40-5fd3-4ed6-8e13-66287fbce169")
public static String es_PE_COLUMN_QtyOrdered_Name="Ordered Quantity";

@XendraColumn(AD_Element_ID="2f601325-19ce-9544-d9df-693c76cbde8a",ColumnName="QtyOrdered",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0d514c40-5fd3-4ed6-8e13-66287fbce169",
Synchronized="2019-08-30 22:23:33.0")
/** Column name QtyOrdered */
public static final String COLUMNNAME_QtyOrdered = "QtyOrdered";
/** Set Reserved Quantity.
@param QtyReserved Reserved Quantity */
public void setQtyReserved (BigDecimal QtyReserved)
{
if (QtyReserved == null) throw new IllegalArgumentException ("QtyReserved is mandatory.");
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

@XendraTrl(Identifier="fc6529f6-8c32-4127-af47-2134a0507c3f")
public static String es_PE_COLUMN_QtyReserved_Name="Reserved Quantity";

@XendraColumn(AD_Element_ID="9e1b819d-9985-da9d-e2e7-a1fe07d429e4",ColumnName="QtyReserved",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fc6529f6-8c32-4127-af47-2134a0507c3f",
Synchronized="2019-08-30 22:23:33.0")
/** Column name QtyReserved */
public static final String COLUMNNAME_QtyReserved = "QtyReserved";
}
