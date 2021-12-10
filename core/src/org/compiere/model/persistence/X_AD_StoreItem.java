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
/** Generated Model for AD_StoreItem
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_StoreItem extends PO
{
/** Standard Constructor
@param ctx context
@param AD_StoreItem_ID id
@param trxName transaction
*/
public X_AD_StoreItem (Properties ctx, int AD_StoreItem_ID, String trxName)
{
super (ctx, AD_StoreItem_ID, trxName);
/** if (AD_StoreItem_ID == 0)
{
setAD_StoreItem_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_StoreItem (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000399 */
public static int Table_ID=MTable.getTable_ID("AD_StoreItem");

@XendraTrl(Identifier="f29ad1f6-21d9-403d-bfed-22a39c62cbba")
public static String es_PE_TABLE_AD_StoreItem_Name="Store Item";

@XendraTable(Name="Store Item",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="AD_StoreItem",AccessLevel="6",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.dictionary",Identifier="f29ad1f6-21d9-403d-bfed-22a39c62cbba",
Synchronized="2020-03-03 21:35:56.0")
/** TableName=AD_StoreItem */
public static final String Table_Name="AD_StoreItem";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_StoreItem");

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
    Table_ID = MTable.getTable_ID("AD_StoreItem");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_StoreItem[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Store Item.
@param AD_StoreItem_ID Store Item */
public void setAD_StoreItem_ID (int AD_StoreItem_ID)
{
if (AD_StoreItem_ID < 1) throw new IllegalArgumentException ("AD_StoreItem_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_StoreItem_ID, Integer.valueOf(AD_StoreItem_ID));
}
/** Get Store Item.
@return Store Item */
public int getAD_StoreItem_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_StoreItem_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_StoreItem_ID */
public static final String COLUMNNAME_AD_StoreItem_ID = "AD_StoreItem_ID";
/** Set Properties.
@param Properties Properties */
public void setProperties (HashMap Properties)
{
set_Value (COLUMNNAME_Properties, Properties);
}
/** Get Properties.
@return Properties */
public HashMap getProperties() 
{
HashMap propsrc = (HashMap)get_Value(COLUMNNAME_Properties);
if (propsrc == null) return new HashMap();
 HashMap propdst = (HashMap) propsrc.clone();
return propdst;
}

@XendraTrl(Identifier="ff150bfe-784d-4dfb-8d18-e1b5bad15f70")
public static String es_PE_COLUMN_Properties_Name="Properties";

@XendraColumn(AD_Element_ID="acc3987b-292c-475a-86b5-5104970a96f3",ColumnName="Properties",
AD_Reference_ID=46,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ff150bfe-784d-4dfb-8d18-e1b5bad15f70",
Synchronized="2019-08-30 22:20:42.0")
/** Column name Properties */
public static final String COLUMNNAME_Properties = "Properties";
}
