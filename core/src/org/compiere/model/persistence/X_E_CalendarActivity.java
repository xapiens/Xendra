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
/** Generated Model for E_CalendarActivity
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_E_CalendarActivity extends PO
{
/** Standard Constructor
@param ctx context
@param E_CalendarActivity_ID id
@param trxName transaction
*/
public X_E_CalendarActivity (Properties ctx, int E_CalendarActivity_ID, String trxName)
{
super (ctx, E_CalendarActivity_ID, trxName);
/** if (E_CalendarActivity_ID == 0)
{
setE_CalendarActivity_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_E_CalendarActivity (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000388 */
public static int Table_ID=MTable.getTable_ID("E_CalendarActivity");

@XendraTrl(Identifier="6739dfa3-c85e-4cc1-a1b4-2289f022bf10")
public static String es_PE_TABLE_E_CalendarActivity_Name="Calendar Activity";

@XendraTable(Name="Calendar Activity",AD_Package_ID="5a4baeee-43d7-eba9-9b5a-4ab05cfda2bd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="E_CalendarActivity",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.communication",Identifier="6739dfa3-c85e-4cc1-a1b4-2289f022bf10",
Synchronized="2020-03-03 21:37:46.0")
/** TableName=E_CalendarActivity */
public static final String Table_Name="E_CalendarActivity";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"E_CalendarActivity");

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
    Table_ID = MTable.getTable_ID("E_CalendarActivity");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_E_CalendarActivity[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Calendar Activity.
@param E_CalendarActivity_ID Calendar Activity */
public void setE_CalendarActivity_ID (int E_CalendarActivity_ID)
{
if (E_CalendarActivity_ID < 1) throw new IllegalArgumentException ("E_CalendarActivity_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_E_CalendarActivity_ID, Integer.valueOf(E_CalendarActivity_ID));
}
/** Get Calendar Activity.
@return Calendar Activity */
public int getE_CalendarActivity_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_E_CalendarActivity_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name E_CalendarActivity_ID */
public static final String COLUMNNAME_E_CalendarActivity_ID = "E_CalendarActivity_ID";
/** Set E_CalendarItem_ID.
@param E_CalendarItem_ID E_CalendarItem_ID */
public void setE_CalendarItem_ID (int E_CalendarItem_ID)
{
if (E_CalendarItem_ID <= 0) set_ValueNoCheck (COLUMNNAME_E_CalendarItem_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_E_CalendarItem_ID, Integer.valueOf(E_CalendarItem_ID));
}
/** Get E_CalendarItem_ID.
@return E_CalendarItem_ID */
public int getE_CalendarItem_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_E_CalendarItem_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0b708fbb-8285-47ff-b04d-0636ca684bbd")
public static String es_PE_COLUMN_E_CalendarItem_ID_Name="E_CalendarItem_ID";

@XendraColumn(AD_Element_ID="a31aaedb-3b12-448f-99a4-70c87aa7fa25",ColumnName="E_CalendarItem_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0b708fbb-8285-47ff-b04d-0636ca684bbd",
Synchronized="2019-08-30 22:22:23.0")
/** Column name E_CalendarItem_ID */
public static final String COLUMNNAME_E_CalendarItem_ID = "E_CalendarItem_ID";
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
@XendraTrl(Identifier="1167d466-17c0-4cf7-9c85-6466083fb30d")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1167d466-17c0-4cf7-9c85-6466083fb30d",
Synchronized="2019-08-30 22:22:23.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Read Only.
@param IsReadOnly Field is read only */
public void setIsReadOnly (boolean IsReadOnly)
{
set_Value (COLUMNNAME_IsReadOnly, Boolean.valueOf(IsReadOnly));
}
/** Get Read Only.
@return Field is read only */
public boolean isReadOnly() 
{
Object oo = get_Value(COLUMNNAME_IsReadOnly);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="0d9bf971-c128-430f-83ab-c05076a3ab14")
public static String es_PE_COLUMN_IsReadOnly_Name="IsReadOnly";

@XendraColumn(AD_Element_ID="91b664da-9e5a-8ff7-2fef-8042ee7fb0c2",ColumnName="IsReadOnly",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0d9bf971-c128-430f-83ab-c05076a3ab14",
Synchronized="2019-08-30 22:22:23.0")
/** Column name IsReadOnly */
public static final String COLUMNNAME_IsReadOnly = "IsReadOnly";
}
