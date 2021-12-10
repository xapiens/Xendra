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
/** Generated Model for HR_WorkGroup
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_HR_WorkGroup extends PO
{
/** Standard Constructor
@param ctx context
@param HR_WorkGroup_ID id
@param trxName transaction
*/
public X_HR_WorkGroup (Properties ctx, int HR_WorkGroup_ID, String trxName)
{
super (ctx, HR_WorkGroup_ID, trxName);
/** if (HR_WorkGroup_ID == 0)
{
setHR_WorkGroup_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_HR_WorkGroup (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000406 */
public static int Table_ID=MTable.getTable_ID("HR_WorkGroup");

@XendraTrl(Identifier="84037ed8-8c3d-4469-a813-82c3b41ddcff")
public static String es_PE_TABLE_HR_WorkGroup_Name="WorkGroup";

@XendraTable(Name="WorkGroup",AD_Package_ID="95f9a029-eaee-0747-b1a5-58cfdd8f8ae5",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="WorkGroup",Help="WorkGroup",
TableName="HR_WorkGroup",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.humanresource",Identifier="84037ed8-8c3d-4469-a813-82c3b41ddcff",
Synchronized="2020-03-03 21:38:03.0")
/** TableName=HR_WorkGroup */
public static final String Table_Name="HR_WorkGroup";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"HR_WorkGroup");

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
    Table_ID = MTable.getTable_ID("HR_WorkGroup");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_HR_WorkGroup[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="ff792ca8-10a8-4a83-b6f5-eeac3eec6e21")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ff792ca8-10a8-4a83-b6f5-eeac3eec6e21",
Synchronized="2019-08-30 22:22:43.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set HR_WorkGroup_ID.
@param HR_WorkGroup_ID HR_WorkGroup_ID */
public void setHR_WorkGroup_ID (int HR_WorkGroup_ID)
{
if (HR_WorkGroup_ID < 1) throw new IllegalArgumentException ("HR_WorkGroup_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_HR_WorkGroup_ID, Integer.valueOf(HR_WorkGroup_ID));
}
/** Get HR_WorkGroup_ID.
@return HR_WorkGroup_ID */
public int getHR_WorkGroup_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_WorkGroup_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name HR_WorkGroup_ID */
public static final String COLUMNNAME_HR_WorkGroup_ID = "HR_WorkGroup_ID";
/** Set IsShiftAllocation.
@param IsShiftAllocation IsShiftAllocation */
public void setIsShiftAllocation (boolean IsShiftAllocation)
{
set_Value (COLUMNNAME_IsShiftAllocation, Boolean.valueOf(IsShiftAllocation));
}
/** Get IsShiftAllocation.
@return IsShiftAllocation */
public boolean isShiftAllocation() 
{
Object oo = get_Value(COLUMNNAME_IsShiftAllocation);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f151bd59-a0c1-4f59-934f-a9db899baaae")
public static String es_PE_COLUMN_IsShiftAllocation_Name="IsShiftAllocation";

@XendraColumn(AD_Element_ID="e0586f16-9031-4552-8b21-6bade84e4f69",ColumnName="IsShiftAllocation",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f151bd59-a0c1-4f59-934f-a9db899baaae",
Synchronized="2019-08-30 22:22:43.0")
/** Column name IsShiftAllocation */
public static final String COLUMNNAME_IsShiftAllocation = "IsShiftAllocation";
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
@XendraTrl(Identifier="6b28eeee-d857-4943-bdd0-bd2e2c3e4349")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6b28eeee-d857-4943-bdd0-bd2e2c3e4349",
Synchronized="2019-08-30 22:22:43.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set SeqNo.
@param SeqNo SeqNo */
public void setSeqNo (int SeqNo)
{
set_Value (COLUMNNAME_SeqNo, Integer.valueOf(SeqNo));
}
/** Get SeqNo.
@return SeqNo */
public int getSeqNo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SeqNo);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c4ebaae0-9046-4b59-9744-68a0cc016be7")
public static String es_PE_COLUMN_SeqNo_Name="SeqNo";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c4ebaae0-9046-4b59-9744-68a0cc016be7",
Synchronized="2019-08-30 22:22:43.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
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
@XendraTrl(Identifier="62241410-cce5-4a25-9f8d-ee590fc69919")
public static String es_PE_COLUMN_Value_Name="Value";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="62241410-cce5-4a25-9f8d-ee590fc69919",
Synchronized="2019-08-30 22:22:43.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
