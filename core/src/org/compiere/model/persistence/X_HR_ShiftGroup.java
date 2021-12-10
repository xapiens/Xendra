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
/** Generated Model for HR_ShiftGroup
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_HR_ShiftGroup extends PO
{
/** Standard Constructor
@param ctx context
@param HR_ShiftGroup_ID id
@param trxName transaction
*/
public X_HR_ShiftGroup (Properties ctx, int HR_ShiftGroup_ID, String trxName)
{
super (ctx, HR_ShiftGroup_ID, trxName);
/** if (HR_ShiftGroup_ID == 0)
{
setHR_ShiftGroup_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_HR_ShiftGroup (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000403 */
public static int Table_ID=MTable.getTable_ID("HR_ShiftGroup");

@XendraTrl(Identifier="ebd2ec50-da1f-4c78-b17c-e0ef3b4bcbe1")
public static String es_PE_TABLE_HR_ShiftGroup_Name="Shift Group";

@XendraTable(Name="Shift Group",AD_Package_ID="95f9a029-eaee-0747-b1a5-58cfdd8f8ae5",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Shift Group",Help="Shift Group",
TableName="HR_ShiftGroup",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.humanresource",Identifier="ebd2ec50-da1f-4c78-b17c-e0ef3b4bcbe1",
Synchronized="2020-03-03 21:38:02.0")
/** TableName=HR_ShiftGroup */
public static final String Table_Name="HR_ShiftGroup";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"HR_ShiftGroup");

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
    Table_ID = MTable.getTable_ID("HR_ShiftGroup");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_HR_ShiftGroup[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Description.
@param Description Description */
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
@return Description */
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

@XendraTrl(Identifier="59805dc4-e103-4cc8-8808-26c217e2d2d5")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="59805dc4-e103-4cc8-8808-26c217e2d2d5",
Synchronized="2019-08-30 22:22:42.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set HR_ShiftGroup_ID.
@param HR_ShiftGroup_ID HR_ShiftGroup_ID */
public void setHR_ShiftGroup_ID (int HR_ShiftGroup_ID)
{
if (HR_ShiftGroup_ID < 1) throw new IllegalArgumentException ("HR_ShiftGroup_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_HR_ShiftGroup_ID, Integer.valueOf(HR_ShiftGroup_ID));
}
/** Get HR_ShiftGroup_ID.
@return HR_ShiftGroup_ID */
public int getHR_ShiftGroup_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_ShiftGroup_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name HR_ShiftGroup_ID */
public static final String COLUMNNAME_HR_ShiftGroup_ID = "HR_ShiftGroup_ID";
/** Set Name.
@param Name Name */
public void setName (String Name)
{
if (Name != null && Name.length() > 255)
{
log.warning("Length > 255 - truncated");
Name = Name.substring(0,254);
}
set_Value (COLUMNNAME_Name, Name);
}
/** Get Name.
@return Name */
public String getName() 
{
String value = (String)get_Value(COLUMNNAME_Name);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d5328393-3fd6-4875-86ac-ccbcdb34e553")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d5328393-3fd6-4875-86ac-ccbcdb34e553",
Synchronized="2019-08-30 22:22:42.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set NoOfHoursThisShift.
@param NoOfHoursThisShift NoOfHoursThisShift */
public void setNoOfHoursThisShift (BigDecimal NoOfHoursThisShift)
{
set_Value (COLUMNNAME_NoOfHoursThisShift, NoOfHoursThisShift);
}
/** Get NoOfHoursThisShift.
@return NoOfHoursThisShift */
public BigDecimal getNoOfHoursThisShift() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_NoOfHoursThisShift);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="2a4ca645-a82e-4a85-ba92-72531f51e03f")
public static String es_PE_COLUMN_NoOfHoursThisShift_Name="NoOfHoursThisShift";

@XendraColumn(AD_Element_ID="28f0699e-db5d-4a56-8855-f7ff3be2860a",ColumnName="NoOfHoursThisShift",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2a4ca645-a82e-4a85-ba92-72531f51e03f",
Synchronized="2019-08-30 22:22:42.0")
/** Column name NoOfHoursThisShift */
public static final String COLUMNNAME_NoOfHoursThisShift = "NoOfHoursThisShift";
/** Set Value.
@param Value Value */
public void setValue (String Value)
{
if (Value != null && Value.length() > 255)
{
log.warning("Length > 255 - truncated");
Value = Value.substring(0,254);
}
set_Value (COLUMNNAME_Value, Value);
}
/** Get Value.
@return Value */
public String getValue() 
{
String value = (String)get_Value(COLUMNNAME_Value);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="8c419554-04b9-427e-90dc-e8f6f03b3c3a")
public static String es_PE_COLUMN_Value_Name="Value";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8c419554-04b9-427e-90dc-e8f6f03b3c3a",
Synchronized="2019-08-30 22:22:42.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
