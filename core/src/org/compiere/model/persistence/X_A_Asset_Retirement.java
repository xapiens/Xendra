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
/** Generated Model for A_Asset_Retirement
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_A_Asset_Retirement extends PO
{
/** Standard Constructor
@param ctx context
@param A_Asset_Retirement_ID id
@param trxName transaction
*/
public X_A_Asset_Retirement (Properties ctx, int A_Asset_Retirement_ID, String trxName)
{
super (ctx, A_Asset_Retirement_ID, trxName);
/** if (A_Asset_Retirement_ID == 0)
{
setA_Asset_ID (0);
setA_Asset_Retirement_ID (0);
setAssetMarketValueAmt (Env.ZERO);	
// 0
setAssetValueAmt (Env.ZERO);	
// 0
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_A_Asset_Retirement (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=540 */
public static int Table_ID=MTable.getTable_ID("A_Asset_Retirement");

@XendraTrl(Identifier="65f33097-00d9-6989-4140-cf3a35fcf2fb")
public static String es_PE_TABLE_A_Asset_Retirement_Name="Activo Retirado";

@XendraTable(Name="Asset Retirement",AD_Package_ID="f42d3f39-06e2-bcd9-2954-27694ae45e5d",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="Internally used asset is not longer used.",Help="",TableName="A_Asset_Retirement",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=135,IsSecurityEnabled=false,
IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.asset",Identifier="65f33097-00d9-6989-4140-cf3a35fcf2fb",
Synchronized="2020-03-03 21:34:50.0")
/** TableName=A_Asset_Retirement */
public static final String Table_Name="A_Asset_Retirement";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"A_Asset_Retirement");

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
    Table_ID = MTable.getTable_ID("A_Asset_Retirement");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_A_Asset_Retirement[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Asset.
@param A_Asset_ID Asset used internally or by customers */
public void setA_Asset_ID (int A_Asset_ID)
{
if (A_Asset_ID < 1) throw new IllegalArgumentException ("A_Asset_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_A_Asset_ID, Integer.valueOf(A_Asset_ID));
}
/** Get Asset.
@return Asset used internally or by customers */
public int getA_Asset_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e1842a10-d7ce-05fc-d876-54e74a502d3b")
public static String es_PE_COLUMN_A_Asset_ID_Name="Activo";

@XendraColumn(AD_Element_ID="3cd84c49-e25b-9ecc-5637-ed9a07d76bee",ColumnName="A_Asset_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e1842a10-d7ce-05fc-d876-54e74a502d3b",
Synchronized="2020-03-03 21:34:17.0")
/** Column name A_Asset_ID */
public static final String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
/** Set Asset Retirement.
@param A_Asset_Retirement_ID Internally used asset is not longer used. */
public void setA_Asset_Retirement_ID (int A_Asset_Retirement_ID)
{
if (A_Asset_Retirement_ID < 1) throw new IllegalArgumentException ("A_Asset_Retirement_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_A_Asset_Retirement_ID, Integer.valueOf(A_Asset_Retirement_ID));
}
/** Get Asset Retirement.
@return Internally used asset is not longer used. */
public int getA_Asset_Retirement_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_Retirement_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getA_Asset_Retirement_ID()));
}
/** Column name A_Asset_Retirement_ID */
public static final String COLUMNNAME_A_Asset_Retirement_ID = "A_Asset_Retirement_ID";
/** Set Market value Amount.
@param AssetMarketValueAmt Market value of the asset */
public void setAssetMarketValueAmt (BigDecimal AssetMarketValueAmt)
{
if (AssetMarketValueAmt == null) throw new IllegalArgumentException ("AssetMarketValueAmt is mandatory.");
set_Value (COLUMNNAME_AssetMarketValueAmt, AssetMarketValueAmt);
}
/** Get Market value Amount.
@return Market value of the asset */
public BigDecimal getAssetMarketValueAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AssetMarketValueAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="9915db4a-2a1a-1172-e196-13f2ca49f84e")
public static String es_PE_COLUMN_AssetMarketValueAmt_Name="Valor Cantidad de Mercado";

@XendraColumn(AD_Element_ID="0e701c32-f503-92cb-9115-daf8e2a0fa61",
ColumnName="AssetMarketValueAmt",AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="0",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9915db4a-2a1a-1172-e196-13f2ca49f84e",Synchronized="2020-03-03 21:34:17.0")
/** Column name AssetMarketValueAmt */
public static final String COLUMNNAME_AssetMarketValueAmt = "AssetMarketValueAmt";
/** Set Asset value.
@param AssetValueAmt Book Value of the asset */
public void setAssetValueAmt (BigDecimal AssetValueAmt)
{
if (AssetValueAmt == null) throw new IllegalArgumentException ("AssetValueAmt is mandatory.");
set_Value (COLUMNNAME_AssetValueAmt, AssetValueAmt);
}
/** Get Asset value.
@return Book Value of the asset */
public BigDecimal getAssetValueAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AssetValueAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="ca644094-9f58-7125-3de5-0c102be967b5")
public static String es_PE_COLUMN_AssetValueAmt_Name="Valor del Activo";

@XendraColumn(AD_Element_ID="334b056c-6d49-9385-ebc3-5e0dc39511ba",ColumnName="AssetValueAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ca644094-9f58-7125-3de5-0c102be967b5",
Synchronized="2020-03-03 21:34:17.0")
/** Column name AssetValueAmt */
public static final String COLUMNNAME_AssetValueAmt = "AssetValueAmt";
/** Set Invoice Line.
@param C_InvoiceLine_ID Invoice Detail Line */
public void setC_InvoiceLine_ID (int C_InvoiceLine_ID)
{
if (C_InvoiceLine_ID <= 0) set_Value (COLUMNNAME_C_InvoiceLine_ID, null);
 else 
set_Value (COLUMNNAME_C_InvoiceLine_ID, Integer.valueOf(C_InvoiceLine_ID));
}
/** Get Invoice Line.
@return Invoice Detail Line */
public int getC_InvoiceLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_InvoiceLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="07b1d0f8-222e-8877-53d2-f034b0c22071")
public static String es_PE_COLUMN_C_InvoiceLine_ID_Name="Línea de Factura";

@XendraColumn(AD_Element_ID="56a4b078-1c5d-e08d-5d9d-847e94161779",ColumnName="C_InvoiceLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="07b1d0f8-222e-8877-53d2-f034b0c22071",
Synchronized="2020-03-03 21:34:17.0")
/** Column name C_InvoiceLine_ID */
public static final String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
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
@XendraTrl(Identifier="93c6518b-668c-4d33-aa59-ad1b6a15e484")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="93c6518b-668c-4d33-aa59-ad1b6a15e484",
Synchronized="2020-03-03 21:34:17.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
}
