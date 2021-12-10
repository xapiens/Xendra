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
/** Generated Model for HR_WorkShift
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_HR_WorkShift extends PO
{
/** Standard Constructor
@param ctx context
@param HR_WorkShift_ID id
@param trxName transaction
*/
public X_HR_WorkShift (Properties ctx, int HR_WorkShift_ID, String trxName)
{
super (ctx, HR_WorkShift_ID, trxName);
/** if (HR_WorkShift_ID == 0)
{
setHR_WorkShift_ID (0);
setName (null);
setValue (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_HR_WorkShift (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000404 */
public static int Table_ID=MTable.getTable_ID("HR_WorkShift");

@XendraTrl(Identifier="7ae1098b-571f-4748-b215-b96f5f65bd2d")
public static String es_PE_TAB_WorkShift_Description="Work Shift";

@XendraTrl(Identifier="7ae1098b-571f-4748-b215-b96f5f65bd2d")
public static String es_PE_TAB_WorkShift_Help="Work Shift";

@XendraTrl(Identifier="7ae1098b-571f-4748-b215-b96f5f65bd2d")
public static String es_PE_TAB_WorkShift_Name="Work Shift";
@XendraTab(Name="Work Shift",
Description="Work Shift",Help="Work Shift",AD_Window_ID="12fd948f-907e-4fc5-97bf-648d33d79c95",
SeqNo=10,TabLevel=0,IsSingleRow=true,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="",HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="7ae1098b-571f-4748-b215-b96f5f65bd2d",Synchronized="2018-09-03 15:49:05.0")
public static final String TABNAME_WorkShift="7ae1098b-571f-4748-b215-b96f5f65bd2d";

@XendraTrl(Identifier="17c93e79-01ae-4dc9-9cf6-7429ba98242c")
public static String es_PE_TABLE_HR_WorkShift_Name="Work Shift";

@XendraTable(Name="Work Shift",AD_Package_ID="95f9a029-eaee-0747-b1a5-58cfdd8f8ae5",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Work Shift",Help="Work Shift",
TableName="HR_WorkShift",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.humanresource",Identifier="17c93e79-01ae-4dc9-9cf6-7429ba98242c",
Synchronized="2020-03-03 21:38:03.0")
/** TableName=HR_WorkShift */
public static final String Table_Name="HR_WorkShift";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"HR_WorkShift");

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
    Table_ID = MTable.getTable_ID("HR_WorkShift");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_HR_WorkShift[").append(get_ID()).append("]");
return sb.toString();
}
/** Set BreakHoursNo.
@param BreakHoursNo BreakHoursNo */
public void setBreakHoursNo (int BreakHoursNo)
{
set_Value (COLUMNNAME_BreakHoursNo, Integer.valueOf(BreakHoursNo));
}
/** Get BreakHoursNo.
@return BreakHoursNo */
public int getBreakHoursNo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_BreakHoursNo);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6d39455f-8fda-43fc-9e8f-95b3781d63be")
public static String es_PE_COLUMN_BreakHoursNo_Name="BreakHoursNo";

@XendraColumn(AD_Element_ID="56d02ac6-2240-47bf-814f-7c21873e7fa7",ColumnName="BreakHoursNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6d39455f-8fda-43fc-9e8f-95b3781d63be",
Synchronized="2019-08-30 22:22:43.0")
/** Column name BreakHoursNo */
public static final String COLUMNNAME_BreakHoursNo = "BreakHoursNo";
/** Set Description.
@param Description Optional short DESCRIPTION of the record */
public void setDescription (String Description)
{
if (Description != null && Description.length() > 255)
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

@XendraTrl(Identifier="3cb8b69b-bc42-40db-a887-96158a20a480")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3cb8b69b-bc42-40db-a887-96158a20a480",
Synchronized="2019-08-30 22:22:43.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set HR_ShiftGroup_ID.
@param HR_ShiftGroup_ID HR_ShiftGroup_ID */
public void setHR_ShiftGroup_ID (int HR_ShiftGroup_ID)
{
if (HR_ShiftGroup_ID <= 0) set_Value (COLUMNNAME_HR_ShiftGroup_ID, null);
 else 
set_Value (COLUMNNAME_HR_ShiftGroup_ID, Integer.valueOf(HR_ShiftGroup_ID));
}
/** Get HR_ShiftGroup_ID.
@return HR_ShiftGroup_ID */
public int getHR_ShiftGroup_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_ShiftGroup_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="88e26e45-f62d-4292-865f-bd1099422a8e")
public static String es_PE_FIELD_WorkShift_HR_ShiftGroup_ID_Name="hr_shiftgroup_id";

@XendraField(AD_Column_ID="HR_ShiftGroup_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7ae1098b-571f-4748-b215-b96f5f65bd2d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2018-09-03 15:49:04.0",
Identifier="88e26e45-f62d-4292-865f-bd1099422a8e")
public static final String FIELDNAME_WorkShift_HR_ShiftGroup_ID="88e26e45-f62d-4292-865f-bd1099422a8e";

@XendraTrl(Identifier="3fc1a6b2-c078-45f2-bbf3-4845a2d6b807")
public static String es_PE_COLUMN_HR_ShiftGroup_ID_Name="HR_ShiftGroup_ID";

@XendraColumn(AD_Element_ID="d8d0db6a-0a39-4fc9-bb4a-121ea1c64d66",ColumnName="HR_ShiftGroup_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3fc1a6b2-c078-45f2-bbf3-4845a2d6b807",
Synchronized="2019-08-30 22:22:43.0")
/** Column name HR_ShiftGroup_ID */
public static final String COLUMNNAME_HR_ShiftGroup_ID = "HR_ShiftGroup_ID";
/** Set HR_WorkShift_ID.
@param HR_WorkShift_ID HR_WorkShift_ID */
public void setHR_WorkShift_ID (int HR_WorkShift_ID)
{
if (HR_WorkShift_ID < 1) throw new IllegalArgumentException ("HR_WorkShift_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_HR_WorkShift_ID, Integer.valueOf(HR_WorkShift_ID));
}
/** Get HR_WorkShift_ID.
@return HR_WorkShift_ID */
public int getHR_WorkShift_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_WorkShift_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7a9a11e1-4def-46f6-8305-59c90a8fb202")
public static String es_PE_FIELD_WorkShift_HR_WorkShift_ID_Name="HR_WorkShift";

@XendraField(AD_Column_ID="HR_WorkShift_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7ae1098b-571f-4748-b215-b96f5f65bd2d",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2018-09-03 15:49:04.0",
Identifier="7a9a11e1-4def-46f6-8305-59c90a8fb202")
public static final String FIELDNAME_WorkShift_HR_WorkShift_ID="7a9a11e1-4def-46f6-8305-59c90a8fb202";
/** Column name HR_WorkShift_ID */
public static final String COLUMNNAME_HR_WorkShift_ID = "HR_WorkShift_ID";
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
@XendraTrl(Identifier="3ae00cfe-09ae-40af-b28a-517f3cdd0945")
public static String es_PE_FIELD_WorkShift_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="7ae1098b-571f-4748-b215-b96f5f65bd2d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2018-09-03 15:49:04.0",
Identifier="3ae00cfe-09ae-40af-b28a-517f3cdd0945")
public static final String FIELDNAME_WorkShift_Identifier="3ae00cfe-09ae-40af-b28a-517f3cdd0945";

@XendraTrl(Identifier="dc9ff837-bf7a-473a-a4cf-88308cdc8d40")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dc9ff837-bf7a-473a-a4cf-88308cdc8d40",
Synchronized="2019-08-30 22:22:43.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set IsOverTimeApplicable.
@param IsOverTimeApplicable IsOverTimeApplicable */
public void setIsOverTimeApplicable (boolean IsOverTimeApplicable)
{
set_Value (COLUMNNAME_IsOverTimeApplicable, Boolean.valueOf(IsOverTimeApplicable));
}
/** Get IsOverTimeApplicable.
@return IsOverTimeApplicable */
public boolean isOverTimeApplicable() 
{
Object oo = get_Value(COLUMNNAME_IsOverTimeApplicable);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="2195bb34-2f97-4320-8755-d2359854f010")
public static String es_PE_COLUMN_IsOverTimeApplicable_Name="IsOverTimeApplicable";

@XendraColumn(AD_Element_ID="afa9ffa2-428b-4362-bc17-5a7cd71c5601",
ColumnName="IsOverTimeApplicable",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2195bb34-2f97-4320-8755-d2359854f010",Synchronized="2019-08-30 22:22:43.0")
/** Column name IsOverTimeApplicable */
public static final String COLUMNNAME_IsOverTimeApplicable = "IsOverTimeApplicable";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name == null) throw new IllegalArgumentException ("Name is mandatory.");
if (Name.length() > 255)
{
log.warning("Length > 255 - truncated");
Name = Name.substring(0,254);
}
set_Value (COLUMNNAME_Name, Name);
}
/** Get Name.
@return Alphanumeric identifier of the entity */
public String getName() 
{
String value = (String)get_Value(COLUMNNAME_Name);
if (value == null)
  return "";
return value;
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getName());
}

@XendraTrl(Identifier="25f9709f-4163-4497-a86a-2487dcd129da")
public static String es_PE_FIELD_WorkShift_Name_Name="Nombre";

@XendraTrl(Identifier="25f9709f-4163-4497-a86a-2487dcd129da")
public static String es_PE_FIELD_WorkShift_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="25f9709f-4163-4497-a86a-2487dcd129da")
public static String es_PE_FIELD_WorkShift_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="7ae1098b-571f-4748-b215-b96f5f65bd2d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2018-09-03 15:49:04.0",
Identifier="25f9709f-4163-4497-a86a-2487dcd129da")
public static final String FIELDNAME_WorkShift_Name="25f9709f-4163-4497-a86a-2487dcd129da";

@XendraTrl(Identifier="47a71027-cd2b-40c3-b50b-ab953cc04aa8")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="47a71027-cd2b-40c3-b50b-ab953cc04aa8",
Synchronized="2019-08-30 22:22:43.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set NoOfHours.
@param NoOfHours NoOfHours */
public void setNoOfHours (BigDecimal NoOfHours)
{
set_Value (COLUMNNAME_NoOfHours, NoOfHours);
}
/** Get NoOfHours.
@return NoOfHours */
public BigDecimal getNoOfHours() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_NoOfHours);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="7eb1eeb3-7ce6-439d-83fb-bec7dfc375ef")
public static String es_PE_COLUMN_NoOfHours_Name="NoOfHours";

@XendraColumn(AD_Element_ID="589fc7d1-ebdd-45b9-8c1b-fc314b6105cd",ColumnName="NoOfHours",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7eb1eeb3-7ce6-439d-83fb-bec7dfc375ef",
Synchronized="2019-08-30 22:22:43.0")
/** Column name NoOfHours */
public static final String COLUMNNAME_NoOfHours = "NoOfHours";
/** Set Friday.
@param OnFriday Available on Fridays */
public void setOnFriday (boolean OnFriday)
{
set_Value (COLUMNNAME_OnFriday, Boolean.valueOf(OnFriday));
}
/** Get Friday.
@return Available on Fridays */
public boolean isOnFriday() 
{
Object oo = get_Value(COLUMNNAME_OnFriday);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="3c0cd21f-f6c0-437e-8f16-0c4bd7afdba0")
public static String es_PE_COLUMN_OnFriday_Name="OnFriday";

@XendraColumn(AD_Element_ID="b48d0dde-cf3f-04c1-43fc-fea10282b017",ColumnName="OnFriday",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3c0cd21f-f6c0-437e-8f16-0c4bd7afdba0",
Synchronized="2019-08-30 22:22:43.0")
/** Column name OnFriday */
public static final String COLUMNNAME_OnFriday = "OnFriday";
/** Set Monday.
@param OnMonday Available on Mondays */
public void setOnMonday (boolean OnMonday)
{
set_Value (COLUMNNAME_OnMonday, Boolean.valueOf(OnMonday));
}
/** Get Monday.
@return Available on Mondays */
public boolean isOnMonday() 
{
Object oo = get_Value(COLUMNNAME_OnMonday);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="09f3bdc4-70b0-4b28-9819-9677f2e24c65")
public static String es_PE_COLUMN_OnMonday_Name="OnMonday";

@XendraColumn(AD_Element_ID="47062be2-3eb4-a496-3910-6b134c369f87",ColumnName="OnMonday",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="09f3bdc4-70b0-4b28-9819-9677f2e24c65",
Synchronized="2019-08-30 22:22:43.0")
/** Column name OnMonday */
public static final String COLUMNNAME_OnMonday = "OnMonday";
/** Set Saturday.
@param OnSaturday Available on Saturday */
public void setOnSaturday (boolean OnSaturday)
{
set_Value (COLUMNNAME_OnSaturday, Boolean.valueOf(OnSaturday));
}
/** Get Saturday.
@return Available on Saturday */
public boolean isOnSaturday() 
{
Object oo = get_Value(COLUMNNAME_OnSaturday);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="dd5eb107-385d-426c-867b-9ac5ac343cb3")
public static String es_PE_COLUMN_OnSaturday_Name="OnSaturday";

@XendraColumn(AD_Element_ID="dad68a73-edf7-1a52-7414-dfdca8f9fd90",ColumnName="OnSaturday",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dd5eb107-385d-426c-867b-9ac5ac343cb3",
Synchronized="2019-08-30 22:22:43.0")
/** Column name OnSaturday */
public static final String COLUMNNAME_OnSaturday = "OnSaturday";
/** Set Sunday.
@param OnSunday Available on Sundays */
public void setOnSunday (boolean OnSunday)
{
set_Value (COLUMNNAME_OnSunday, Boolean.valueOf(OnSunday));
}
/** Get Sunday.
@return Available on Sundays */
public boolean isOnSunday() 
{
Object oo = get_Value(COLUMNNAME_OnSunday);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="bc9ac0ef-6cf2-4aac-afe1-97b4c82f96c6")
public static String es_PE_COLUMN_OnSunday_Name="OnSunday";

@XendraColumn(AD_Element_ID="88a0f08b-4471-14e0-4677-efe2aecfff68",ColumnName="OnSunday",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bc9ac0ef-6cf2-4aac-afe1-97b4c82f96c6",
Synchronized="2019-08-30 22:22:43.0")
/** Column name OnSunday */
public static final String COLUMNNAME_OnSunday = "OnSunday";
/** Set Thursday.
@param OnThursday Available on Thursdays */
public void setOnThursday (boolean OnThursday)
{
set_Value (COLUMNNAME_OnThursday, Boolean.valueOf(OnThursday));
}
/** Get Thursday.
@return Available on Thursdays */
public boolean isOnThursday() 
{
Object oo = get_Value(COLUMNNAME_OnThursday);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="dce2b5ac-b3e7-4529-9191-78cfee9630b5")
public static String es_PE_COLUMN_OnThursday_Name="OnThursday";

@XendraColumn(AD_Element_ID="3b9a627b-1e5c-7294-7abf-d92411fb6b61",ColumnName="OnThursday",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dce2b5ac-b3e7-4529-9191-78cfee9630b5",
Synchronized="2019-08-30 22:22:43.0")
/** Column name OnThursday */
public static final String COLUMNNAME_OnThursday = "OnThursday";
/** Set Tuesday.
@param OnTuesday Available on Tuesdays */
public void setOnTuesday (boolean OnTuesday)
{
set_Value (COLUMNNAME_OnTuesday, Boolean.valueOf(OnTuesday));
}
/** Get Tuesday.
@return Available on Tuesdays */
public boolean isOnTuesday() 
{
Object oo = get_Value(COLUMNNAME_OnTuesday);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="55565c09-66a9-4767-9b1a-ee8255760573")
public static String es_PE_COLUMN_OnTuesday_Name="OnTuesday";

@XendraColumn(AD_Element_ID="225ffab7-2af2-fe39-5821-3648aa7db913",ColumnName="OnTuesday",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="55565c09-66a9-4767-9b1a-ee8255760573",
Synchronized="2019-08-30 22:22:43.0")
/** Column name OnTuesday */
public static final String COLUMNNAME_OnTuesday = "OnTuesday";
/** Set Wednesday.
@param OnWednesday Available on Wednesdays */
public void setOnWednesday (boolean OnWednesday)
{
set_Value (COLUMNNAME_OnWednesday, Boolean.valueOf(OnWednesday));
}
/** Get Wednesday.
@return Available on Wednesdays */
public boolean isOnWednesday() 
{
Object oo = get_Value(COLUMNNAME_OnWednesday);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="6b356114-e2c1-4d9a-9d6a-1f9ab79069c1")
public static String es_PE_COLUMN_OnWednesday_Name="OnWednesday";

@XendraColumn(AD_Element_ID="4d1edfb8-f525-c7b5-2d0d-0245f1f8eefe",ColumnName="OnWednesday",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6b356114-e2c1-4d9a-9d6a-1f9ab79069c1",
Synchronized="2019-08-30 22:22:43.0")
/** Column name OnWednesday */
public static final String COLUMNNAME_OnWednesday = "OnWednesday";
/** Set OverTimeAmount.
@param OverTimeAmount OverTimeAmount */
public void setOverTimeAmount (BigDecimal OverTimeAmount)
{
set_Value (COLUMNNAME_OverTimeAmount, OverTimeAmount);
}
/** Get OverTimeAmount.
@return OverTimeAmount */
public BigDecimal getOverTimeAmount() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_OverTimeAmount);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="eb2b85fe-4235-4ffa-b3ba-04eca5edeb14")
public static String es_PE_COLUMN_OverTimeAmount_Name="OverTimeAmount";

@XendraColumn(AD_Element_ID="99674a3e-49c0-4653-b341-5b11a4e3288d",ColumnName="OverTimeAmount",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eb2b85fe-4235-4ffa-b3ba-04eca5edeb14",
Synchronized="2019-08-30 22:22:43.0")
/** Column name OverTimeAmount */
public static final String COLUMNNAME_OverTimeAmount = "OverTimeAmount";
/** Set Sequence.
@param SeqNo Method of ordering records: lowest number comes first */
public void setSeqNo (int SeqNo)
{
set_Value (COLUMNNAME_SeqNo, Integer.valueOf(SeqNo));
}
/** Get Sequence.
@return Method of ordering records: lowest number comes first */
public int getSeqNo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SeqNo);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0e01421f-0f52-429e-ada8-916d26c8d2c7")
public static String es_PE_COLUMN_SeqNo_Name="SeqNo";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0e01421f-0f52-429e-ada8-916d26c8d2c7",
Synchronized="2019-08-30 22:22:43.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
/** Set ShiftFromTime.
@param ShiftFromTime ShiftFromTime */
public void setShiftFromTime (Timestamp ShiftFromTime)
{
set_Value (COLUMNNAME_ShiftFromTime, ShiftFromTime);
}
/** Get ShiftFromTime.
@return ShiftFromTime */
public Timestamp getShiftFromTime() 
{
return (Timestamp)get_Value(COLUMNNAME_ShiftFromTime);
}

@XendraTrl(Identifier="e1a7b3ad-42ee-42ed-963b-59c311a52092")
public static String es_PE_COLUMN_ShiftFromTime_Name="ShiftFromTime";

@XendraColumn(AD_Element_ID="3c7f7e4d-5b56-4f13-a5cf-6bdf70c1cc1f",ColumnName="ShiftFromTime",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e1a7b3ad-42ee-42ed-963b-59c311a52092",
Synchronized="2019-08-30 22:22:43.0")
/** Column name ShiftFromTime */
public static final String COLUMNNAME_ShiftFromTime = "ShiftFromTime";
/** Set ShiftToTime.
@param ShiftToTime ShiftToTime */
public void setShiftToTime (Timestamp ShiftToTime)
{
set_Value (COLUMNNAME_ShiftToTime, ShiftToTime);
}
/** Get ShiftToTime.
@return ShiftToTime */
public Timestamp getShiftToTime() 
{
return (Timestamp)get_Value(COLUMNNAME_ShiftToTime);
}

@XendraTrl(Identifier="31e38e4b-ed97-419f-af02-5abad1e6f5ed")
public static String es_PE_COLUMN_ShiftToTime_Name="ShiftToTime";

@XendraColumn(AD_Element_ID="144fd4a9-2deb-4ae7-b618-e43733898101",ColumnName="ShiftToTime",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="31e38e4b-ed97-419f-af02-5abad1e6f5ed",
Synchronized="2019-08-30 22:22:43.0")
/** Column name ShiftToTime */
public static final String COLUMNNAME_ShiftToTime = "ShiftToTime";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value == null) throw new IllegalArgumentException ("Value is mandatory.");
if (Value.length() > 255)
{
log.warning("Length > 255 - truncated");
Value = Value.substring(0,254);
}
set_Value (COLUMNNAME_Value, Value);
}
/** Get Search Key.
@return Search key for the record in the format required - must be unique */
public String getValue() 
{
String value = (String)get_Value(COLUMNNAME_Value);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="f2f397c9-375d-44f7-b2c9-f3b4b5f0e0e2")
public static String es_PE_FIELD_WorkShift_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="f2f397c9-375d-44f7-b2c9-f3b4b5f0e0e2")
public static String es_PE_FIELD_WorkShift_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="f2f397c9-375d-44f7-b2c9-f3b4b5f0e0e2")
public static String es_PE_FIELD_WorkShift_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="7ae1098b-571f-4748-b215-b96f5f65bd2d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2018-09-03 15:49:05.0",
Identifier="f2f397c9-375d-44f7-b2c9-f3b4b5f0e0e2")
public static final String FIELDNAME_WorkShift_SearchKey="f2f397c9-375d-44f7-b2c9-f3b4b5f0e0e2";

@XendraTrl(Identifier="b138f0ed-1ba8-47fe-b30f-dd6d1ecc9e5f")
public static String es_PE_COLUMN_Value_Name="Search Key";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b138f0ed-1ba8-47fe-b30f-dd6d1ecc9e5f",
Synchronized="2019-08-30 22:22:43.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
