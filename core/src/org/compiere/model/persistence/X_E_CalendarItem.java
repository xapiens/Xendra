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
/** Generated Model for E_CalendarItem
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_E_CalendarItem extends PO
{
/** Standard Constructor
@param ctx context
@param E_CalendarItem_ID id
@param trxName transaction
*/
public X_E_CalendarItem (Properties ctx, int E_CalendarItem_ID, String trxName)
{
super (ctx, E_CalendarItem_ID, trxName);
/** if (E_CalendarItem_ID == 0)
{
setE_CalendarItem_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_E_CalendarItem (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000391 */
public static int Table_ID=MTable.getTable_ID("E_CalendarItem");

@XendraTrl(Identifier="ed9b60ea-145b-47e2-b889-452e04364d53")
public static String es_PE_TABLE_E_CalendarItem_Name="E_CalendarItem";

@XendraTable(Name="E_CalendarItem",AD_Package_ID="5a4baeee-43d7-eba9-9b5a-4ab05cfda2bd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="E_CalendarItem",AccessLevel="6",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.communication",Identifier="ed9b60ea-145b-47e2-b889-452e04364d53",
Synchronized="2020-03-03 21:37:47.0")
/** TableName=E_CalendarItem */
public static final String Table_Name="E_CalendarItem";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"E_CalendarItem");

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
    Table_ID = MTable.getTable_ID("E_CalendarItem");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_E_CalendarItem[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Calendar.
@param Calendar Calendar */
public void setCalendar (String Calendar)
{
set_Value (COLUMNNAME_Calendar, Calendar);
}
/** Get Calendar.
@return Calendar */
public String getCalendar() 
{
String value = (String)get_Value(COLUMNNAME_Calendar);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ae68917d-c833-442b-9019-a9b51d533ad1")
public static String es_PE_COLUMN_Calendar_Name="Calendar";

@XendraColumn(AD_Element_ID="0504e3f5-8174-4aba-a791-ef8b5bf8f4e2",ColumnName="Calendar",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="ae68917d-c833-442b-9019-a9b51d533ad1",
Synchronized="2019-08-30 22:22:24.0")
/** Column name Calendar */
public static final String COLUMNNAME_Calendar = "Calendar";
/** Set CalendarType.
@param CalendarType CalendarType */
public void setCalendarType (String CalendarType)
{
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

@XendraTrl(Identifier="a8c424a6-f3bd-4220-b318-349a1228886c")
public static String es_PE_COLUMN_CalendarType_Name="CalendarType";

@XendraColumn(AD_Element_ID="31d91d2f-3616-43a6-93e8-07cff4fecf16",ColumnName="CalendarType",
AD_Reference_ID=17,AD_Reference_Value_ID="710925ba-3a28-4c2a-b444-af8a8a22f060",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a8c424a6-f3bd-4220-b318-349a1228886c",Synchronized="2019-08-30 22:22:24.0")
/** Column name CalendarType */
public static final String COLUMNNAME_CalendarType = "CalendarType";
/** Set Categories.
@param Categories Categories */
public void setCategories (String Categories)
{
set_Value (COLUMNNAME_Categories, Categories);
}
/** Get Categories.
@return Categories */
public String getCategories() 
{
String value = (String)get_Value(COLUMNNAME_Categories);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="788dda6a-d6a5-4f3d-b375-11dbfb5e58ab")
public static String es_PE_COLUMN_Categories_Name="Categories";

@XendraColumn(AD_Element_ID="2ed5b034-15ca-472d-8a96-8935ddb16d5d",ColumnName="Categories",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="788dda6a-d6a5-4f3d-b375-11dbfb5e58ab",
Synchronized="2019-08-30 22:22:24.0")
/** Column name Categories */
public static final String COLUMNNAME_Categories = "Categories";
/** Set ComponentType.
@param ComponentType ComponentType */
public void setComponentType (String ComponentType)
{
if (ComponentType != null && ComponentType.length() > 20)
{
log.warning("Length > 20 - truncated");
ComponentType = ComponentType.substring(0,19);
}
set_Value (COLUMNNAME_ComponentType, ComponentType);
}
/** Get ComponentType.
@return ComponentType */
public String getComponentType() 
{
String value = (String)get_Value(COLUMNNAME_ComponentType);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="3d496462-5e71-4cc8-b3d9-14a871e0cf68")
public static String es_PE_COLUMN_ComponentType_Name="ComponentType";

@XendraColumn(AD_Element_ID="97ae9054-4717-4e1c-b6bb-e6ee5af12d32",ColumnName="ComponentType",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3d496462-5e71-4cc8-b3d9-14a871e0cf68",
Synchronized="2019-08-30 22:22:24.0")
/** Column name ComponentType */
public static final String COLUMNNAME_ComponentType = "ComponentType";
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

@XendraTrl(Identifier="be4f1c9f-b326-44d2-8112-d552e95aefc1")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="be4f1c9f-b326-44d2-8112-d552e95aefc1",
Synchronized="2019-08-30 22:22:24.0")
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

@XendraTrl(Identifier="22a99e3f-a1f5-4755-8ace-8e52f491fd14")
public static String es_PE_COLUMN_DTEnd_Name="DTEnd";

@XendraColumn(AD_Element_ID="3e73215e-a0ae-4f23-a819-19d2cd7dad49",ColumnName="DTEnd",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="22a99e3f-a1f5-4755-8ace-8e52f491fd14",
Synchronized="2019-08-30 22:22:24.0")
/** Column name DTEnd */
public static final String COLUMNNAME_DTEnd = "DTEnd";
/** Set DTStamp.
@param DTStamp DTStamp */
public void setDTStamp (Timestamp DTStamp)
{
set_Value (COLUMNNAME_DTStamp, DTStamp);
}
/** Get DTStamp.
@return DTStamp */
public Timestamp getDTStamp() 
{
return (Timestamp)get_Value(COLUMNNAME_DTStamp);
}

@XendraTrl(Identifier="adeaaee7-bd0e-448c-9bb8-829240432c43")
public static String es_PE_COLUMN_DTStamp_Name="DTStamp";

@XendraColumn(AD_Element_ID="8807ed52-c066-4329-ae01-f08d601e325b",ColumnName="DTStamp",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="adeaaee7-bd0e-448c-9bb8-829240432c43",
Synchronized="2019-08-30 22:22:24.0")
/** Column name DTStamp */
public static final String COLUMNNAME_DTStamp = "DTStamp";
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

@XendraTrl(Identifier="ee6eb36f-f193-4ea8-b1e7-1daf3d496b98")
public static String es_PE_COLUMN_DTStart_Name="DTStart";

@XendraColumn(AD_Element_ID="f82d0fcf-8dcc-44eb-a242-139737ec7a5b",ColumnName="DTStart",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ee6eb36f-f193-4ea8-b1e7-1daf3d496b98",
Synchronized="2019-08-30 22:22:24.0")
/** Column name DTStart */
public static final String COLUMNNAME_DTStart = "DTStart";
/** Set Calendar Event.
@param E_CalendarEvent_ID Calendar Event */
public void setE_CalendarEvent_ID (int E_CalendarEvent_ID)
{
if (E_CalendarEvent_ID <= 0) set_Value (COLUMNNAME_E_CalendarEvent_ID, null);
 else 
set_Value (COLUMNNAME_E_CalendarEvent_ID, Integer.valueOf(E_CalendarEvent_ID));
}
/** Get Calendar Event.
@return Calendar Event */
public int getE_CalendarEvent_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_E_CalendarEvent_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6a9bca1f-f92e-4774-933a-5129ac0ba033")
public static String es_PE_COLUMN_E_CalendarEvent_ID_Name="E_CalendarEvent_ID";

@XendraColumn(AD_Element_ID="b1279a55-d693-43c3-8fe0-9e3324d9da47",ColumnName="E_CalendarEvent_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6a9bca1f-f92e-4774-933a-5129ac0ba033",
Synchronized="2019-08-30 22:22:24.0")
/** Column name E_CalendarEvent_ID */
public static final String COLUMNNAME_E_CalendarEvent_ID = "E_CalendarEvent_ID";
/** Set E_CalendarItem_ID.
@param E_CalendarItem_ID E_CalendarItem_ID */
public void setE_CalendarItem_ID (int E_CalendarItem_ID)
{
if (E_CalendarItem_ID < 1) throw new IllegalArgumentException ("E_CalendarItem_ID is mandatory.");
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
/** Column name E_CalendarItem_ID */
public static final String COLUMNNAME_E_CalendarItem_ID = "E_CalendarItem_ID";
/** Set E_CalendarType_ID.
@param E_CalendarType_ID E_CalendarType_ID */
public void setE_CalendarType_ID (int E_CalendarType_ID)
{
if (E_CalendarType_ID <= 0) set_Value (COLUMNNAME_E_CalendarType_ID, null);
 else 
set_Value (COLUMNNAME_E_CalendarType_ID, Integer.valueOf(E_CalendarType_ID));
}
/** Get E_CalendarType_ID.
@return E_CalendarType_ID */
public int getE_CalendarType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_E_CalendarType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f6f8db70-1222-4e82-95d5-a7cf563cdeab")
public static String es_PE_COLUMN_E_CalendarType_ID_Name="Calendar Type";

@XendraColumn(AD_Element_ID="39c3dcd5-e100-4978-994b-10b1e3928fe3",ColumnName="E_CalendarType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f6f8db70-1222-4e82-95d5-a7cf563cdeab",
Synchronized="2019-08-30 22:22:24.0")
/** Column name E_CalendarType_ID */
public static final String COLUMNNAME_E_CalendarType_ID = "E_CalendarType_ID";
/** Set EventClass.
@param EventClass EventClass */
public void setEventClass (String EventClass)
{
if (EventClass != null && EventClass.length() > 20)
{
log.warning("Length > 20 - truncated");
EventClass = EventClass.substring(0,19);
}
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
@XendraTrl(Identifier="8f498e41-e173-4253-a0a2-998d0c29b43d")
public static String es_PE_COLUMN_EventClass_Name="EventClass";

@XendraColumn(AD_Element_ID="39dbe0de-8004-452e-a463-158e9f554b8b",ColumnName="EventClass",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8f498e41-e173-4253-a0a2-998d0c29b43d",
Synchronized="2019-08-30 22:22:24.0")
/** Column name EventClass */
public static final String COLUMNNAME_EventClass = "EventClass";
/** Set Identifier.
@param Identifier Identifier */
public void setIdentifier (String Identifier)
{
if (Identifier != null && Identifier.length() > 32)
{
log.warning("Length > 32 - truncated");
Identifier = Identifier.substring(0,31);
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
@XendraTrl(Identifier="41a2f098-82f4-49ec-9c6e-26ad65dd1e88")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=32,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="41a2f098-82f4-49ec-9c6e-26ad65dd1e88",
Synchronized="2019-08-30 22:22:24.0")
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

@XendraTrl(Identifier="98b049d1-93ed-4339-be3a-94c94fa6a812")
public static String es_PE_COLUMN_IsReadOnly_Name="IsReadOnly";

@XendraColumn(AD_Element_ID="91b664da-9e5a-8ff7-2fef-8042ee7fb0c2",ColumnName="IsReadOnly",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="98b049d1-93ed-4339-be3a-94c94fa6a812",
Synchronized="2019-08-30 22:22:24.0")
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
@XendraTrl(Identifier="8dbb8652-404d-41c9-8f97-80534be24653")
public static String es_PE_COLUMN_Location_Name="Location";

@XendraColumn(AD_Element_ID="471a6d48-c7d4-4ad6-8e8a-9bd351bbe61f",ColumnName="Location",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="8dbb8652-404d-41c9-8f97-80534be24653",
Synchronized="2019-08-30 22:22:24.0")
/** Column name Location */
public static final String COLUMNNAME_Location = "Location";
/** Set RecurrenceRule.
@param RecurrenceRule RecurrenceRule */
public void setRecurrenceRule (String RecurrenceRule)
{
set_Value (COLUMNNAME_RecurrenceRule, RecurrenceRule);
}
/** Get RecurrenceRule.
@return RecurrenceRule */
public String getRecurrenceRule() 
{
String value = (String)get_Value(COLUMNNAME_RecurrenceRule);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="97c6cb61-176f-489b-9340-3f10a4e37542")
public static String es_PE_COLUMN_RecurrenceRule_Name="RecurrenceRule";

@XendraColumn(AD_Element_ID="16f02ebe-f56e-43c5-8a51-b285e19b935f",ColumnName="RecurrenceRule",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="97c6cb61-176f-489b-9340-3f10a4e37542",
Synchronized="2019-08-30 22:22:24.0")
/** Column name RecurrenceRule */
public static final String COLUMNNAME_RecurrenceRule = "RecurrenceRule";
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
@XendraTrl(Identifier="82027588-df1a-403b-8073-100e87b25588")
public static String es_PE_COLUMN_Summary_Name="Summary";

@XendraColumn(AD_Element_ID="94fe105c-8853-7c06-a32a-9ad75a452917",ColumnName="Summary",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="82027588-df1a-403b-8073-100e87b25588",
Synchronized="2019-08-30 22:22:24.0")
/** Column name Summary */
public static final String COLUMNNAME_Summary = "Summary";
/** Set TypeEvent.
@param TypeEvent TypeEvent */
public void setTypeEvent (String TypeEvent)
{
if (TypeEvent != null && TypeEvent.length() > 20)
{
log.warning("Length > 20 - truncated");
TypeEvent = TypeEvent.substring(0,19);
}
set_Value (COLUMNNAME_TypeEvent, TypeEvent);
}
/** Get TypeEvent.
@return TypeEvent */
public String getTypeEvent() 
{
String value = (String)get_Value(COLUMNNAME_TypeEvent);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="bf7515ec-7756-436d-987c-76e8df6c0399")
public static String es_PE_COLUMN_TypeEvent_Name="TypeEvent";

@XendraColumn(AD_Element_ID="023fdab0-50ae-4562-9df5-1352eefd9516",ColumnName="TypeEvent",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bf7515ec-7756-436d-987c-76e8df6c0399",
Synchronized="2019-08-30 22:22:24.0")
/** Column name TypeEvent */
public static final String COLUMNNAME_TypeEvent = "TypeEvent";
}
