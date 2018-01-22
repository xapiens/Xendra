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
/** Generated Model for E_WeekDay
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_E_WeekDay extends PO
{
/** Standard Constructor
@param ctx context
@param E_WeekDay_ID id
@param trxName transaction
*/
public X_E_WeekDay (Properties ctx, int E_WeekDay_ID, String trxName)
{
super (ctx, E_WeekDay_ID, trxName);
/** if (E_WeekDay_ID == 0)
{
setE_WeekDay_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_E_WeekDay (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000393 */
public static int Table_ID=MTable.getTable_ID("E_WeekDay");

@XendraTrl(Identifier="a6201b8d-85e0-4e40-b9d0-a1039d09e1a7")
public static String es_PE_TABLE_E_WeekDay_Name="WeekDay";

@XendraTable(Name="WeekDay",Description="WeekDay",Help="WeekDay",TableName="E_WeekDay",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=false,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.communication",Identifier="a6201b8d-85e0-4e40-b9d0-a1039d09e1a7",
Synchronized="2017-09-15 12:49:32.0")
/** TableName=E_WeekDay */
public static final String Table_Name="E_WeekDay";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"E_WeekDay");

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
    Table_ID = MTable.getTable_ID("E_WeekDay");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_E_WeekDay[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Day.
@param Day Day */
public void setDay (String Day)
{
if (Day != null && Day.length() > 20)
{
log.warning("Length > 20 - truncated");
Day = Day.substring(0,19);
}
set_Value (COLUMNNAME_Day, Day);
}
/** Get Day.
@return Day */
public String getDay() 
{
String value = (String)get_Value(COLUMNNAME_Day);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="0f9e496e-eac8-4cc1-9283-fb075cc7601b")
public static String es_PE_COLUMN_Day_Name="Day";

@XendraColumn(AD_Element_ID="bfb6e778-2e91-4a76-8442-36f90562e302",ColumnName="Day",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0f9e496e-eac8-4cc1-9283-fb075cc7601b",
Synchronized="2017-09-15 12:43:11.0")
/** Column name Day */
public static final String COLUMNNAME_Day = "Day";
/** Set E_WeekDay_ID.
@param E_WeekDay_ID E_WeekDay_ID */
public void setE_WeekDay_ID (int E_WeekDay_ID)
{
if (E_WeekDay_ID < 1) throw new IllegalArgumentException ("E_WeekDay_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_E_WeekDay_ID, Integer.valueOf(E_WeekDay_ID));
}
/** Get E_WeekDay_ID.
@return E_WeekDay_ID */
public int getE_WeekDay_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_E_WeekDay_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name E_WeekDay_ID */
public static final String COLUMNNAME_E_WeekDay_ID = "E_WeekDay_ID";
/** Set E_WeekDays_ID.
@param E_WeekDays_ID E_WeekDays_ID */
public void setE_WeekDays_ID (int E_WeekDays_ID)
{
if (E_WeekDays_ID <= 0) set_Value (COLUMNNAME_E_WeekDays_ID, null);
 else 
set_Value (COLUMNNAME_E_WeekDays_ID, Integer.valueOf(E_WeekDays_ID));
}
/** Get E_WeekDays_ID.
@return E_WeekDays_ID */
public int getE_WeekDays_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_E_WeekDays_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f7e6653f-c4b0-417c-845e-a837e70c2c17")
public static String es_PE_COLUMN_E_WeekDays_ID_Name="E_WeekDays_ID";

@XendraColumn(AD_Element_ID="52f3e46a-3425-4d1d-b6db-bce0d639a6bd",ColumnName="E_WeekDays_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f7e6653f-c4b0-417c-845e-a837e70c2c17",
Synchronized="2017-09-15 12:43:11.0")
/** Column name E_WeekDays_ID */
public static final String COLUMNNAME_E_WeekDays_ID = "E_WeekDays_ID";
/** Set OffsetDay.
@param OffsetDay OffsetDay */
public void setOffsetDay (int OffsetDay)
{
set_Value (COLUMNNAME_OffsetDay, Integer.valueOf(OffsetDay));
}
/** Get OffsetDay.
@return OffsetDay */
public int getOffsetDay() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_OffsetDay);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e52c9141-12bf-4b71-9fcd-79f15b399e92")
public static String es_PE_COLUMN_OffsetDay_Name="OffsetDay";

@XendraColumn(AD_Element_ID="1800c666-eace-4a34-928c-78ac418166a6",ColumnName="OffsetDay",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e52c9141-12bf-4b71-9fcd-79f15b399e92",
Synchronized="2017-09-15 12:43:11.0")
/** Column name OffsetDay */
public static final String COLUMNNAME_OffsetDay = "OffsetDay";
}
