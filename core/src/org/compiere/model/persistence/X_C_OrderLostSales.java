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
/** Generated Model for C_OrderLostSales
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_OrderLostSales extends PO
{
/** Standard Constructor
@param ctx context
@param C_OrderLostSales_ID id
@param trxName transaction
*/
public X_C_OrderLostSales (Properties ctx, int C_OrderLostSales_ID, String trxName)
{
super (ctx, C_OrderLostSales_ID, trxName);
/** if (C_OrderLostSales_ID == 0)
{
setC_OrderLostSales_ID (0);
setC_UOM_ID (0);
setM_Product_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_OrderLostSales (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000283 */
public static int Table_ID=MTable.getTable_ID("C_OrderLostSales");

@XendraTrl(Identifier="bd5c38e4-1ae9-41cc-8710-264b76448716")
public static String es_PE_TABLE_C_OrderLostSales_Name="Order Lost Sales";

@XendraTable(Name="Order Lost Sales",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="C_OrderLostSales",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="bd5c38e4-1ae9-41cc-8710-264b76448716",
Synchronized="2020-03-03 21:37:16.0")
/** TableName=C_OrderLostSales */
public static final String Table_Name="C_OrderLostSales";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_OrderLostSales");

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
    Table_ID = MTable.getTable_ID("C_OrderLostSales");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_OrderLostSales[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Order Lost Sales.
@param C_OrderLostSales_ID Order Lost Sales */
public void setC_OrderLostSales_ID (int C_OrderLostSales_ID)
{
if (C_OrderLostSales_ID < 1) throw new IllegalArgumentException ("C_OrderLostSales_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_OrderLostSales_ID, Integer.valueOf(C_OrderLostSales_ID));
}
/** Get Order Lost Sales.
@return Order Lost Sales */
public int getC_OrderLostSales_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_OrderLostSales_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_OrderLostSales_ID */
public static final String COLUMNNAME_C_OrderLostSales_ID = "C_OrderLostSales_ID";
/** Set UOM.
@param C_UOM_ID Unit of Measure */
public void setC_UOM_ID (int C_UOM_ID)
{
if (C_UOM_ID < 1) throw new IllegalArgumentException ("C_UOM_ID is mandatory.");
set_Value (COLUMNNAME_C_UOM_ID, Integer.valueOf(C_UOM_ID));
}
/** Get UOM.
@return Unit of Measure */
public int getC_UOM_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_UOM_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d40ebf48-16da-4eff-8f1e-3f3b78906019")
public static String es_PE_COLUMN_C_UOM_ID_Name="UOM";

@XendraColumn(AD_Element_ID="d0345019-4fcc-44c8-4fd1-e38e3b4adeed",ColumnName="C_UOM_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d40ebf48-16da-4eff-8f1e-3f3b78906019",
Synchronized="2019-08-30 22:21:53.0")
/** Column name C_UOM_ID */
public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
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
@XendraTrl(Identifier="4db0efb2-0257-4a16-a3e0-9466e774d0f0")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4db0efb2-0257-4a16-a3e0-9466e774d0f0",
Synchronized="2019-08-30 22:21:53.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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

@XendraTrl(Identifier="36b790fc-a3c4-4b16-80b1-10ab95099253")
public static String es_PE_COLUMN_M_Product_ID_Name="Product";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="36b790fc-a3c4-4b16-80b1-10ab95099253",
Synchronized="2019-08-30 22:21:53.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Lost Sales Qty.
@param QtyLostSales Quantity of potential sales */
public void setQtyLostSales (BigDecimal QtyLostSales)
{
set_Value (COLUMNNAME_QtyLostSales, QtyLostSales);
}
/** Get Lost Sales Qty.
@return Quantity of potential sales */
public BigDecimal getQtyLostSales() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyLostSales);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="9f7863d7-87a5-4b97-9198-8789396856ac")
public static String es_PE_COLUMN_QtyLostSales_Name="Lost Sales Qty";

@XendraColumn(AD_Element_ID="a16fbc85-1e28-a1e0-c277-17b64f097cbf",ColumnName="QtyLostSales",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9f7863d7-87a5-4b97-9198-8789396856ac",
Synchronized="2019-08-30 22:21:53.0")
/** Column name QtyLostSales */
public static final String COLUMNNAME_QtyLostSales = "QtyLostSales";
}
