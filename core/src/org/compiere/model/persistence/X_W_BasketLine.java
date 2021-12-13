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
/** Generated Model for W_BasketLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_W_BasketLine extends PO
{
/** Standard Constructor
@param ctx context
@param W_BasketLine_ID id
@param trxName transaction
*/
public X_W_BasketLine (Properties ctx, int W_BasketLine_ID, String trxName)
{
super (ctx, W_BasketLine_ID, trxName);
/** if (W_BasketLine_ID == 0)
{
setDescription (null);
setLine (0);
setPrice (Env.ZERO);
setProduct (null);
setQty (Env.ZERO);
setW_Basket_ID (0);
setW_BasketLine_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_W_BasketLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=549 */
public static int Table_ID=MTable.getTable_ID("W_BasketLine");

@XendraTrl(Identifier="df5299e5-6525-61ec-cc5e-b334d6bad139")
public static String es_PE_TABLE_W_BasketLine_Name="Línea de Almacenado";

@XendraTable(Name="Basket Line",AD_Package_ID="1b3656e5-71c7-1296-994e-9b2c4549c7fd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Web Basket Line",Help="",
TableName="W_BasketLine",AccessLevel="4",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.standard",Identifier="df5299e5-6525-61ec-cc5e-b334d6bad139",
Synchronized="2020-03-03 21:40:31.0")
/** TableName=W_BasketLine */
public static final String Table_Name="W_BasketLine";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"W_BasketLine");

protected BigDecimal accessLevel = BigDecimal.valueOf(4);
/** AccessLevel
@return 4 - System 
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
    Table_ID = MTable.getTable_ID("W_BasketLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_W_BasketLine[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Description.
@param Description Optional short DESCRIPTION of the record */
public void setDescription (String Description)
{
if (Description == null) throw new IllegalArgumentException ("Description is mandatory.");
if (Description.length() > 255)
{
log.warning("Length > 255 - truncated");
Description = Description.substring(0,254);
}
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

@XendraTrl(Identifier="18b7aeba-f142-87c3-8b07-5c703d8debcb")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="18b7aeba-f142-87c3-8b07-5c703d8debcb",
Synchronized="2019-08-30 22:24:30.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
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
@XendraTrl(Identifier="c38b1d4f-b18e-4d1e-8f6a-58000b99718f")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c38b1d4f-b18e-4d1e-8f6a-58000b99718f",
Synchronized="2019-08-30 22:24:30.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Line No.
@param Line Unique line for this document */
public void setLine (int Line)
{
set_Value (COLUMNNAME_Line, Integer.valueOf(Line));
}
/** Get Line No.
@return Unique line for this document */
public int getLine() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Line);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getLine()));
}

@XendraTrl(Identifier="679d6697-7be0-86fa-ddd9-c17d07db317b")
public static String es_PE_COLUMN_Line_Name="No. Línea";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="679d6697-7be0-86fa-ddd9-c17d07db317b",
Synchronized="2019-08-30 22:24:30.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";
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

@XendraTrl(Identifier="e0ea837f-46bf-f225-eb7f-a63c46233c6b")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e0ea837f-46bf-f225-eb7f-a63c46233c6b",Synchronized="2019-08-30 22:24:30.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Price.
@param Price Price */
public void setPrice (BigDecimal Price)
{
if (Price == null) throw new IllegalArgumentException ("Price is mandatory.");
set_Value (COLUMNNAME_Price, Price);
}
/** Get Price.
@return Price */
public BigDecimal getPrice() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Price);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="44f0c175-48c3-52d2-fae6-4ac0e003c6c2")
public static String es_PE_COLUMN_Price_Name="Precio";

@XendraColumn(AD_Element_ID="aafaa7a6-6897-fb14-1b29-1dc3b61047b9",ColumnName="Price",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="44f0c175-48c3-52d2-fae6-4ac0e003c6c2",
Synchronized="2019-08-30 22:24:30.0")
/** Column name Price */
public static final String COLUMNNAME_Price = "Price";
/** Set Product.
@param Product Product */
public void setProduct (String Product)
{
if (Product == null) throw new IllegalArgumentException ("Product is mandatory.");
if (Product.length() > 40)
{
log.warning("Length > 40 - truncated");
Product = Product.substring(0,39);
}
set_Value (COLUMNNAME_Product, Product);
}
/** Get Product.
@return Product */
public String getProduct() 
{
String value = (String)get_Value(COLUMNNAME_Product);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="3d7c82c9-4b27-0948-89f5-c1f6d7237998")
public static String es_PE_COLUMN_Product_Name="Producto";

@XendraColumn(AD_Element_ID="18372c66-d72f-51a5-c6aa-c7976b30f962",ColumnName="Product",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3d7c82c9-4b27-0948-89f5-c1f6d7237998",
Synchronized="2019-08-30 22:24:30.0")
/** Column name Product */
public static final String COLUMNNAME_Product = "Product";
/** Set Quantity.
@param Qty Quantity */
public void setQty (BigDecimal Qty)
{
if (Qty == null) throw new IllegalArgumentException ("Qty is mandatory.");
set_Value (COLUMNNAME_Qty, Qty);
}
/** Get Quantity.
@return Quantity */
public BigDecimal getQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Qty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="884b83d9-5e28-a298-2ed2-f8b86b885fde")
public static String es_PE_COLUMN_Qty_Name="Cantidad";

@XendraColumn(AD_Element_ID="c9d74a25-87c5-9592-5660-4f397607dad3",ColumnName="Qty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="884b83d9-5e28-a298-2ed2-f8b86b885fde",
Synchronized="2019-08-30 22:24:30.0")
/** Column name Qty */
public static final String COLUMNNAME_Qty = "Qty";
/** Set W_Basket_ID.
@param W_Basket_ID Web Basket */
public void setW_Basket_ID (int W_Basket_ID)
{
if (W_Basket_ID < 1) throw new IllegalArgumentException ("W_Basket_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_W_Basket_ID, Integer.valueOf(W_Basket_ID));
}
/** Get W_Basket_ID.
@return Web Basket */
public int getW_Basket_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_W_Basket_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fd4eaf3c-312f-00fe-88da-96ebacd04911")
public static String es_PE_COLUMN_W_Basket_ID_Name="ID de almacenado";

@XendraColumn(AD_Element_ID="339fb34a-8308-3903-9dd7-58dd3224fe0c",ColumnName="W_Basket_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fd4eaf3c-312f-00fe-88da-96ebacd04911",
Synchronized="2019-08-30 22:24:30.0")
/** Column name W_Basket_ID */
public static final String COLUMNNAME_W_Basket_ID = "W_Basket_ID";
/** Set Basket Line.
@param W_BasketLine_ID Web Basket Line */
public void setW_BasketLine_ID (int W_BasketLine_ID)
{
if (W_BasketLine_ID < 1) throw new IllegalArgumentException ("W_BasketLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_W_BasketLine_ID, Integer.valueOf(W_BasketLine_ID));
}
/** Get Basket Line.
@return Web Basket Line */
public int getW_BasketLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_W_BasketLine_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name W_BasketLine_ID */
public static final String COLUMNNAME_W_BasketLine_ID = "W_BasketLine_ID";
}
