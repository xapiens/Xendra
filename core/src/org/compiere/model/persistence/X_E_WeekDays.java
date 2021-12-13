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
/** Generated Model for E_WeekDays
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_E_WeekDays extends PO
{
/** Standard Constructor
@param ctx context
@param E_WeekDays_ID id
@param trxName transaction
*/
public X_E_WeekDays (Properties ctx, int E_WeekDays_ID, String trxName)
{
super (ctx, E_WeekDays_ID, trxName);
/** if (E_WeekDays_ID == 0)
{
setE_WeekDays_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_E_WeekDays (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000394 */
public static int Table_ID=MTable.getTable_ID("E_WeekDays");

@XendraTrl(Identifier="ae1d2335-1aeb-48c1-885e-4c945d8c54ab")
public static String es_PE_TABLE_E_WeekDays_Name="Week days";

@XendraTable(Name="Week days",AD_Package_ID="5a4baeee-43d7-eba9-9b5a-4ab05cfda2bd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Week Days",Help="Week Days",
TableName="E_WeekDays",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.communication",Identifier="ae1d2335-1aeb-48c1-885e-4c945d8c54ab",
Synchronized="2020-03-03 21:37:49.0")
/** TableName=E_WeekDays */
public static final String Table_Name="E_WeekDays";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"E_WeekDays");

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
    Table_ID = MTable.getTable_ID("E_WeekDays");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_E_WeekDays[").append(get_ID()).append("]");
return sb.toString();
}
/** Set E_WeekDay_ID.
@param E_WeekDay_ID E_WeekDay_ID */
public void setE_WeekDay_ID (int E_WeekDay_ID)
{
if (E_WeekDay_ID <= 0) set_Value (COLUMNNAME_E_WeekDay_ID, null);
 else 
set_Value (COLUMNNAME_E_WeekDay_ID, Integer.valueOf(E_WeekDay_ID));
}
/** Get E_WeekDay_ID.
@return E_WeekDay_ID */
public int getE_WeekDay_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_E_WeekDay_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e6d5dfdf-a361-4863-aa98-4148261a8d5c")
public static String es_PE_COLUMN_E_WeekDay_ID_Name="E_WeekDay_ID";

@XendraColumn(AD_Element_ID="7815dd85-d251-4a11-86b9-cda10399cebe",ColumnName="E_WeekDay_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e6d5dfdf-a361-4863-aa98-4148261a8d5c",
Synchronized="2019-08-30 22:22:27.0")
/** Column name E_WeekDay_ID */
public static final String COLUMNNAME_E_WeekDay_ID = "E_WeekDay_ID";
/** Set E_WeekDays_ID.
@param E_WeekDays_ID E_WeekDays_ID */
public void setE_WeekDays_ID (int E_WeekDays_ID)
{
if (E_WeekDays_ID < 1) throw new IllegalArgumentException ("E_WeekDays_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_E_WeekDays_ID, Integer.valueOf(E_WeekDays_ID));
}
/** Get E_WeekDays_ID.
@return E_WeekDays_ID */
public int getE_WeekDays_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_E_WeekDays_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name E_WeekDays_ID */
public static final String COLUMNNAME_E_WeekDays_ID = "E_WeekDays_ID";
}
