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
/** Generated Model for E_CalendarRecurrence
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_E_CalendarRecurrence extends PO
{
/** Standard Constructor
@param ctx context
@param E_CalendarRecurrence_ID id
@param trxName transaction
*/
public X_E_CalendarRecurrence (Properties ctx, int E_CalendarRecurrence_ID, String trxName)
{
super (ctx, E_CalendarRecurrence_ID, trxName);
/** if (E_CalendarRecurrence_ID == 0)
{
setE_CalendarRecurrence_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_E_CalendarRecurrence (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000392 */
public static int Table_ID=MTable.getTable_ID("E_CalendarRecurrence");

@XendraTrl(Identifier="89445e8f-9845-458f-b0d8-01e00e29a506")
public static String es_PE_TABLE_E_CalendarRecurrence_Name="Calendar Recurrence";

@XendraTable(Name="Calendar Recurrence",AD_Package_ID="5a4baeee-43d7-eba9-9b5a-4ab05cfda2bd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="E_CalendarRecurrence",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.communication",
Identifier="89445e8f-9845-458f-b0d8-01e00e29a506",Synchronized="2020-03-03 21:37:47.0")
/** TableName=E_CalendarRecurrence */
public static final String Table_Name="E_CalendarRecurrence";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"E_CalendarRecurrence");

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
    Table_ID = MTable.getTable_ID("E_CalendarRecurrence");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_E_CalendarRecurrence[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Calendar Recurrence.
@param E_CalendarRecurrence_ID Calendar Recurrence */
public void setE_CalendarRecurrence_ID (int E_CalendarRecurrence_ID)
{
if (E_CalendarRecurrence_ID < 1) throw new IllegalArgumentException ("E_CalendarRecurrence_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_E_CalendarRecurrence_ID, Integer.valueOf(E_CalendarRecurrence_ID));
}
/** Get Calendar Recurrence.
@return Calendar Recurrence */
public int getE_CalendarRecurrence_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_E_CalendarRecurrence_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name E_CalendarRecurrence_ID */
public static final String COLUMNNAME_E_CalendarRecurrence_ID = "E_CalendarRecurrence_ID";
/** Set End Date.
@param EndDate Last effective date (inclusive) */
public void setEndDate (Timestamp EndDate)
{
set_Value (COLUMNNAME_EndDate, EndDate);
}
/** Get End Date.
@return Last effective date (inclusive) */
public Timestamp getEndDate() 
{
return (Timestamp)get_Value(COLUMNNAME_EndDate);
}

@XendraTrl(Identifier="9f7c295e-3e2c-4b33-aa37-10168fa8f19f")
public static String es_PE_COLUMN_EndDate_Name="End Date";

@XendraColumn(AD_Element_ID="16fae692-c943-4a1f-732e-bfce5aecb4b3",ColumnName="EndDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9f7c295e-3e2c-4b33-aa37-10168fa8f19f",
Synchronized="2019-08-30 22:22:24.0")
/** Column name EndDate */
public static final String COLUMNNAME_EndDate = "EndDate";
/** Set EndMaxOccurrences.
@param EndMaxOccurrences EndMaxOccurrences */
public void setEndMaxOccurrences (BigDecimal EndMaxOccurrences)
{
set_Value (COLUMNNAME_EndMaxOccurrences, EndMaxOccurrences);
}
/** Get EndMaxOccurrences.
@return EndMaxOccurrences */
public BigDecimal getEndMaxOccurrences() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_EndMaxOccurrences);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="c211398b-f254-4ef4-9a50-bb496f458759")
public static String es_PE_COLUMN_EndMaxOccurrences_Name="EndMaxOccurrences";

@XendraColumn(AD_Element_ID="6f1538a7-8a9e-4b1d-9bde-01083e39a33d",ColumnName="EndMaxOccurrences",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c211398b-f254-4ef4-9a50-bb496f458759",
Synchronized="2019-08-30 22:22:24.0")
/** Column name EndMaxOccurrences */
public static final String COLUMNNAME_EndMaxOccurrences = "EndMaxOccurrences";
/** Set EndType.
@param EndType EndType */
public void setEndType (String EndType)
{
if (EndType != null && EndType.length() > 1)
{
log.warning("Length > 1 - truncated");
EndType = EndType.substring(0,0);
}
set_Value (COLUMNNAME_EndType, EndType);
}
/** Get EndType.
@return EndType */
public String getEndType() 
{
return (String)get_Value(COLUMNNAME_EndType);
}

@XendraTrl(Identifier="1bd2c0d1-3d06-4c2f-9735-b4975be718ea")
public static String es_PE_COLUMN_EndType_Name="EndType";

@XendraColumn(AD_Element_ID="7da3910c-5b65-41b0-b30a-a1c0b78f9e53",ColumnName="EndType",
AD_Reference_ID=17,AD_Reference_Value_ID="f7439b44-7ed8-44f9-a2ec-4885b13e4c30",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="1bd2c0d1-3d06-4c2f-9735-b4975be718ea",Synchronized="2019-08-30 22:22:24.0")
/** Column name EndType */
public static final String COLUMNNAME_EndType = "EndType";
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

@XendraTrl(Identifier="3f79f33c-48ba-486e-b6b7-f0630d89a393")
public static String es_PE_COLUMN_E_WeekDays_ID_Name="E_WeekDays_ID";

@XendraColumn(AD_Element_ID="52f3e46a-3425-4d1d-b6db-bce0d639a6bd",ColumnName="E_WeekDays_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3f79f33c-48ba-486e-b6b7-f0630d89a393",
Synchronized="2019-08-30 22:22:24.0")
/** Column name E_WeekDays_ID */
public static final String COLUMNNAME_E_WeekDays_ID = "E_WeekDays_ID";
/** Set Interval.
@param Interval Interval */
public void setInterval (BigDecimal Interval)
{
set_Value (COLUMNNAME_Interval, Interval);
}
/** Get Interval.
@return Interval */
public BigDecimal getInterval() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Interval);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="c6aa77c5-c5cd-47e7-8302-a87697b0f7f2")
public static String es_PE_COLUMN_Interval_Name="Interval";

@XendraColumn(AD_Element_ID="23a579e1-6d5f-4e29-91ae-1d19f216bb6c",ColumnName="Interval",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=12,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c6aa77c5-c5cd-47e7-8302-a87697b0f7f2",
Synchronized="2019-08-30 22:22:24.0")
/** Column name Interval */
public static final String COLUMNNAME_Interval = "Interval";
/** Set Recurrence Type.
@param RecurrenceType Recurrence Type */
public void setRecurrenceType (String RecurrenceType)
{
if (RecurrenceType != null && RecurrenceType.length() > 1)
{
log.warning("Length > 1 - truncated");
RecurrenceType = RecurrenceType.substring(0,0);
}
set_Value (COLUMNNAME_RecurrenceType, RecurrenceType);
}
/** Get Recurrence Type.
@return Recurrence Type */
public String getRecurrenceType() 
{
return (String)get_Value(COLUMNNAME_RecurrenceType);
}

@XendraTrl(Identifier="f26227df-ca83-41c3-b265-70cd575698d5")
public static String es_PE_COLUMN_RecurrenceType_Name="RecurrenceType";

@XendraColumn(AD_Element_ID="fa72dde2-19e6-4cdc-a903-d796a2c088ab",ColumnName="RecurrenceType",
AD_Reference_ID=17,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f26227df-ca83-41c3-b265-70cd575698d5",
Synchronized="2019-08-30 22:22:24.0")
/** Column name RecurrenceType */
public static final String COLUMNNAME_RecurrenceType = "RecurrenceType";
/** Set Type.
@param Type Type of Validation (SQL, Java Script, Java Language) */
public void setType (BigDecimal Type)
{
set_Value (COLUMNNAME_Type, Type);
}
/** Get Type.
@return Type of Validation (SQL, Java Script, Java Language) */
public BigDecimal getType() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Type);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="5abc3525-eb64-42e7-9a5e-4ffffddd99f9")
public static String es_PE_COLUMN_Type_Name="Type";

@XendraColumn(AD_Element_ID="25f95bd2-be42-03fc-c8d2-a7103835133c",ColumnName="Type",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5abc3525-eb64-42e7-9a5e-4ffffddd99f9",
Synchronized="2019-08-30 22:22:24.0")
/** Column name Type */
public static final String COLUMNNAME_Type = "Type";
}
