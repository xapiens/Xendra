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
import org.compiere.model.reference.REF_CalendarType;
/** Generated Model for E_CalendarEvent
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_E_CalendarEvent extends PO
{
/** Standard Constructor
@param ctx context
@param E_CalendarEvent_ID id
@param trxName transaction
*/
public X_E_CalendarEvent (Properties ctx, int E_CalendarEvent_ID, String trxName)
{
super (ctx, E_CalendarEvent_ID, trxName);
/** if (E_CalendarEvent_ID == 0)
{
setE_CalendarEvent_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_E_CalendarEvent (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000413 */
public static int Table_ID=MTable.getTable_ID("E_CalendarEvent");

@XendraTrl(Identifier="6d4f7cde-c3bf-45e2-83da-e88f8e1e8bda")
public static String es_PE_TABLE_E_CalendarEvent_Name="Calendar Event";

@XendraTable(Name="Calendar Event",Description="",Help="",TableName="E_CalendarEvent",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.communication",Identifier="6d4f7cde-c3bf-45e2-83da-e88f8e1e8bda",
Synchronized="2017-09-15 19:13:43.0")
/** TableName=E_CalendarEvent */
public static final String Table_Name="E_CalendarEvent";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"E_CalendarEvent");

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
    Table_ID = MTable.getTable_ID("E_CalendarEvent");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_E_CalendarEvent[").append(get_ID()).append("]");
return sb.toString();
}
/** Set alldayevent.
@param alldayevent alldayevent */
public void setalldayevent (String alldayevent)
{
if (alldayevent != null && alldayevent.length() > 1)
{
log.warning("Length > 1 - truncated");
alldayevent = alldayevent.substring(0,0);
}
set_Value (COLUMNNAME_alldayevent, alldayevent);
}
/** Get alldayevent.
@return alldayevent */
public String getalldayevent() 
{
String value = (String)get_Value(COLUMNNAME_alldayevent);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="17862328-c0a2-42c1-b0e5-3726cf7e5b02")
public static String es_PE_COLUMN_alldayevent_Name="alldayevent";

@XendraColumn(AD_Element_ID="5ca52778-6ec8-43d8-abe2-2fb2b6e68b09",ColumnName="alldayevent",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="17862328-c0a2-42c1-b0e5-3726cf7e5b02",
Synchronized="2017-09-14 20:36:49.0")
/** Column name alldayevent */
public static final String COLUMNNAME_alldayevent = "alldayevent";

/** CalendarType AD_Reference=710925ba-3a28-4c2a-b444-af8a8a22f060 */
public static final int CALENDARTYPE_AD_Reference_ID=1000112;
/** Set CalendarType.
@param CalendarType CalendarType */
public void setCalendarType (String CalendarType)
{
if (CalendarType == null || CalendarType.equals(REF_CalendarType.Event) || CalendarType.equals(REF_CalendarType.FreeBusy) || CalendarType.equals(REF_CalendarType.Journal) || CalendarType.equals(REF_CalendarType.Todo) || CalendarType.equals(REF_CalendarType.Timezone));
 else throw new IllegalArgumentException ("CalendarType Invalid value - " + CalendarType + " - Reference_ID=1000112 - EV - FB - JN - TD - TZ");
if (CalendarType != null && CalendarType.length() > 2)
{
log.warning("Length > 2 - truncated");
CalendarType = CalendarType.substring(0,1);
}
set_Value (COLUMNNAME_CalendarType, CalendarType);
}
/** Get CalendarType.
@return CalendarType */
public String getCalendarType() 
{
return (String)get_Value(COLUMNNAME_CalendarType);
}

@XendraTrl(Identifier="a72c4b40-f624-43ea-827a-7780773e0dfb")
public static String es_PE_COLUMN_CalendarType_Name="CalendarType";

@XendraColumn(AD_Element_ID="1dcfa80a-f64a-4c02-b6f3-c69cefb65700",ColumnName="CalendarType",
AD_Reference_ID=17,AD_Reference_Value_ID="710925ba-3a28-4c2a-b444-af8a8a22f060",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a72c4b40-f624-43ea-827a-7780773e0dfb",Synchronized="2017-09-14 20:36:49.0")
/** Column name CalendarType */
public static final String COLUMNNAME_CalendarType = "CalendarType";
/** Set Description.
@param Description Optional short DESCRIPTION of the record */
public void setDescription (String Description)
{
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

@XendraTrl(Identifier="275b8df6-b053-4a08-b08b-95f0d9180e53")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="275b8df6-b053-4a08-b08b-95f0d9180e53",
Synchronized="2017-09-14 20:36:49.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set DTEnd.
@param DTEnd DTEnd */
public void setDTEnd (Timestamp DTEnd)
{
set_Value (COLUMNNAME_DTEnd, DTEnd);
}
/** Get DTEnd.
@return DTEnd */
public Timestamp getDTEnd() 
{
return (Timestamp)get_Value(COLUMNNAME_DTEnd);
}

@XendraTrl(Identifier="c700e6bd-9404-4332-8ddc-06c222776d9d")
public static String es_PE_COLUMN_DTEnd_Name="DTEnd";

@XendraColumn(AD_Element_ID="3e73215e-a0ae-4f23-a819-19d2cd7dad49",ColumnName="DTEnd",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c700e6bd-9404-4332-8ddc-06c222776d9d",
Synchronized="2017-09-14 20:36:49.0")
/** Column name DTEnd */
public static final String COLUMNNAME_DTEnd = "DTEnd";
/** Set DTStart.
@param DTStart DTStart */
public void setDTStart (Timestamp DTStart)
{
set_Value (COLUMNNAME_DTStart, DTStart);
}
/** Get DTStart.
@return DTStart */
public Timestamp getDTStart() 
{
return (Timestamp)get_Value(COLUMNNAME_DTStart);
}

@XendraTrl(Identifier="306a81c7-cfbb-4a9b-a500-f789810e00d0")
public static String es_PE_COLUMN_DTStart_Name="DTStart";

@XendraColumn(AD_Element_ID="f82d0fcf-8dcc-44eb-a242-139737ec7a5b",ColumnName="DTStart",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="306a81c7-cfbb-4a9b-a500-f789810e00d0",
Synchronized="2017-09-14 20:36:49.0")
/** Column name DTStart */
public static final String COLUMNNAME_DTStart = "DTStart";
/** Set E_CalendarEvent_ID.
@param E_CalendarEvent_ID E_CalendarEvent_ID */
public void setE_CalendarEvent_ID (int E_CalendarEvent_ID)
{
if (E_CalendarEvent_ID < 1) throw new IllegalArgumentException ("E_CalendarEvent_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_E_CalendarEvent_ID, Integer.valueOf(E_CalendarEvent_ID));
}
/** Get E_CalendarEvent_ID.
@return E_CalendarEvent_ID */
public int getE_CalendarEvent_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_E_CalendarEvent_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name E_CalendarEvent_ID */
public static final String COLUMNNAME_E_CalendarEvent_ID = "E_CalendarEvent_ID";
/** Set E_CalendarItem_ID.
@param E_CalendarItem_ID E_CalendarItem_ID */
public void setE_CalendarItem_ID (int E_CalendarItem_ID)
{
if (E_CalendarItem_ID <= 0) set_Value (COLUMNNAME_E_CalendarItem_ID, null);
 else 
set_Value (COLUMNNAME_E_CalendarItem_ID, Integer.valueOf(E_CalendarItem_ID));
}
/** Get E_CalendarItem_ID.
@return E_CalendarItem_ID */
public int getE_CalendarItem_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_E_CalendarItem_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="64f489ed-6554-4e30-8c12-873169f18500")
public static String es_PE_COLUMN_E_CalendarItem_ID_Name="E_CalendarItem_ID";

@XendraColumn(AD_Element_ID="a31aaedb-3b12-448f-99a4-70c87aa7fa25",ColumnName="E_CalendarItem_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="64f489ed-6554-4e30-8c12-873169f18500",
Synchronized="2017-09-14 20:36:49.0")
/** Column name E_CalendarItem_ID */
public static final String COLUMNNAME_E_CalendarItem_ID = "E_CalendarItem_ID";
/** Set E_CalendarRecurrence_ID.
@param E_CalendarRecurrence_ID E_CalendarRecurrence_ID */
public void setE_CalendarRecurrence_ID (int E_CalendarRecurrence_ID)
{
if (E_CalendarRecurrence_ID <= 0) set_Value (COLUMNNAME_E_CalendarRecurrence_ID, null);
 else 
set_Value (COLUMNNAME_E_CalendarRecurrence_ID, Integer.valueOf(E_CalendarRecurrence_ID));
}
/** Get E_CalendarRecurrence_ID.
@return E_CalendarRecurrence_ID */
public int getE_CalendarRecurrence_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_E_CalendarRecurrence_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e2b98fa8-1d3e-468e-b3e7-d225b7e59a87")
public static String es_PE_COLUMN_E_CalendarRecurrence_ID_Name="E_CalendarRecurrence_ID";

@XendraColumn(AD_Element_ID="abf8afb6-f74b-4260-a84f-9fb8b5afa511",
ColumnName="E_CalendarRecurrence_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e2b98fa8-1d3e-468e-b3e7-d225b7e59a87",Synchronized="2017-09-14 20:36:49.0")
/** Column name E_CalendarRecurrence_ID */
public static final String COLUMNNAME_E_CalendarRecurrence_ID = "E_CalendarRecurrence_ID";
/** Set EventClass.
@param EventClass EventClass */
public void setEventClass (String EventClass)
{
set_Value (COLUMNNAME_EventClass, EventClass);
}
/** Get EventClass.
@return EventClass */
public String getEventClass() 
{
String value = (String)get_Value(COLUMNNAME_EventClass);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="87d675a6-20d8-452a-9c3b-90ba3509f128")
public static String es_PE_COLUMN_EventClass_Name="EventClass";

@XendraColumn(AD_Element_ID="39dbe0de-8004-452e-a463-158e9f554b8b",ColumnName="EventClass",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="87d675a6-20d8-452a-9c3b-90ba3509f128",
Synchronized="2017-09-14 20:36:49.0")
/** Column name EventClass */
public static final String COLUMNNAME_EventClass = "EventClass";
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
@XendraTrl(Identifier="e8170466-9944-4933-baac-473e92b09ea6")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e8170466-9944-4933-baac-473e92b09ea6",
Synchronized="2017-09-14 20:36:49.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set IsReadOnly.
@param IsReadOnly IsReadOnly */
public void setIsReadOnly (boolean IsReadOnly)
{
set_Value (COLUMNNAME_IsReadOnly, Boolean.valueOf(IsReadOnly));
}
/** Get IsReadOnly.
@return IsReadOnly */
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

@XendraTrl(Identifier="fbe3b42b-bc6c-4fe7-b1fe-d14b28e43212")
public static String es_PE_COLUMN_IsReadOnly_Name="IsReadOnly";

@XendraColumn(AD_Element_ID="91b664da-9e5a-8ff7-2fef-8042ee7fb0c2",ColumnName="IsReadOnly",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fbe3b42b-bc6c-4fe7-b1fe-d14b28e43212",
Synchronized="2017-09-15 19:13:13.0")
/** Column name IsReadOnly */
public static final String COLUMNNAME_IsReadOnly = "IsReadOnly";
/** Set Location.
@param Location Location */
public void setLocation (String Location)
{
set_Value (COLUMNNAME_Location, Location);
}
/** Get Location.
@return Location */
public String getLocation() 
{
String value = (String)get_Value(COLUMNNAME_Location);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a368ac09-0c10-4a68-a93d-236c435a2b7b")
public static String es_PE_COLUMN_Location_Name="Location";

@XendraColumn(AD_Element_ID="471a6d48-c7d4-4ad6-8e8a-9bd351bbe61f",ColumnName="Location",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="a368ac09-0c10-4a68-a93d-236c435a2b7b",
Synchronized="2017-09-14 20:36:49.0")
/** Column name Location */
public static final String COLUMNNAME_Location = "Location";
/** Set Priority.
@param Priority Indicates if this request is of a high, medium or low priority. */
public void setPriority (String Priority)
{
set_Value (COLUMNNAME_Priority, Priority);
}
/** Get Priority.
@return Indicates if this request is of a high, medium or low priority. */
public String getPriority() 
{
String value = (String)get_Value(COLUMNNAME_Priority);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="65de5721-45b0-41fc-97bb-9e612e354f0d")
public static String es_PE_COLUMN_Priority_Name="Priority";

@XendraColumn(AD_Element_ID="5057921e-c21f-a6bc-898d-053fcc239847",ColumnName="Priority",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="65de5721-45b0-41fc-97bb-9e612e354f0d",
Synchronized="2017-09-14 20:36:49.0")
/** Column name Priority */
public static final String COLUMNNAME_Priority = "Priority";
/** Set Status.
@param Status Status of the currently running check */
public void setStatus (String Status)
{
set_Value (COLUMNNAME_Status, Status);
}
/** Get Status.
@return Status of the currently running check */
public String getStatus() 
{
String value = (String)get_Value(COLUMNNAME_Status);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="4b35800f-8b63-4497-99fc-fe091f88ab4f")
public static String es_PE_COLUMN_Status_Name="Status";

@XendraColumn(AD_Element_ID="0b9968a2-c050-f756-f519-4b5d48d463a0",ColumnName="Status",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="4b35800f-8b63-4497-99fc-fe091f88ab4f",
Synchronized="2017-09-14 20:36:49.0")
/** Column name Status */
public static final String COLUMNNAME_Status = "Status";
/** Set Summary.
@param Summary Textual summary of this request */
public void setSummary (String Summary)
{
set_Value (COLUMNNAME_Summary, Summary);
}
/** Get Summary.
@return Textual summary of this request */
public String getSummary() 
{
String value = (String)get_Value(COLUMNNAME_Summary);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="362ed126-dab3-4f79-a2a9-ec3e26121b1b")
public static String es_PE_COLUMN_Summary_Name="Summary";

@XendraColumn(AD_Element_ID="94fe105c-8853-7c06-a32a-9ad75a452917",ColumnName="Summary",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="362ed126-dab3-4f79-a2a9-ec3e26121b1b",
Synchronized="2017-09-14 20:36:49.0")
/** Column name Summary */
public static final String COLUMNNAME_Summary = "Summary";
/** Set Transsp.
@param Transsp Transsp */
public void setTranssp (String Transsp)
{
set_Value (COLUMNNAME_Transsp, Transsp);
}
/** Get Transsp.
@return Transsp */
public String getTranssp() 
{
String value = (String)get_Value(COLUMNNAME_Transsp);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ab6bc1a5-9714-4963-bf6f-897fe1f4876f")
public static String es_PE_COLUMN_Transsp_Name="Transsp";

@XendraColumn(AD_Element_ID="4e904c95-4c4e-45f3-becb-ff3304d8b4e0",ColumnName="Transsp",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ab6bc1a5-9714-4963-bf6f-897fe1f4876f",
Synchronized="2017-09-14 20:36:49.0")
/** Column name Transsp */
public static final String COLUMNNAME_Transsp = "Transsp";
}
