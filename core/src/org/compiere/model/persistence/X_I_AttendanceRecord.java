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
/** Generated Model for I_AttendanceRecord
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_I_AttendanceRecord extends PO
{
/** Standard Constructor
@param ctx context
@param I_AttendanceRecord_ID id
@param trxName transaction
*/
public X_I_AttendanceRecord (Properties ctx, int I_AttendanceRecord_ID, String trxName)
{
super (ctx, I_AttendanceRecord_ID, trxName);
/** if (I_AttendanceRecord_ID == 0)
{
setI_AttendanceRecord_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_I_AttendanceRecord (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000413 */
public static int Table_ID=MTable.getTable_ID("I_AttendanceRecord");

@XendraTrl(Identifier="badb62fb-0395-4e98-8690-b4f6996d7569")
public static String es_PE_TABLE_I_AttendanceRecord_Name="AttendanceRecord";

@XendraTable(Name="AttendanceRecord",AD_Package_ID="645f34c0-ea3a-ac63-618d-8ca49873c33b",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="I_AttendanceRecord",
Help="I_AttendanceRecord",TableName="I_AttendanceRecord",AccessLevel="3",AD_Window_ID="",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=false,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.import",
Identifier="badb62fb-0395-4e98-8690-b4f6996d7569",Synchronized="2020-03-03 21:38:03.0")
/** TableName=I_AttendanceRecord */
public static final String Table_Name="I_AttendanceRecord";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"I_AttendanceRecord");

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
    Table_ID = MTable.getTable_ID("I_AttendanceRecord");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_I_AttendanceRecord[").append(get_ID()).append("]");
return sb.toString();
}
/** Set AttendanceTime.
@param AttendanceTime AttendanceTime */
public void setAttendanceTime (Timestamp AttendanceTime)
{
set_Value (COLUMNNAME_AttendanceTime, AttendanceTime);
}
/** Get AttendanceTime.
@return AttendanceTime */
public Timestamp getAttendanceTime() 
{
return (Timestamp)get_Value(COLUMNNAME_AttendanceTime);
}

@XendraTrl(Identifier="a5eaadf9-9b5f-4d3b-bf2f-698e0b659ca6")
public static String es_PE_COLUMN_AttendanceTime_Name="AttendanceTime";

@XendraColumn(AD_Element_ID="99865005-6759-4c42-aefe-5e80df29d23b",ColumnName="AttendanceTime",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a5eaadf9-9b5f-4d3b-bf2f-698e0b659ca6",
Synchronized="2019-08-30 22:22:44.0")
/** Column name AttendanceTime */
public static final String COLUMNNAME_AttendanceTime = "AttendanceTime";
/** Set Code.
@param Code Code */
public void setCode (String Code)
{
set_Value (COLUMNNAME_Code, Code);
}
/** Get Code.
@return Code */
public String getCode() 
{
String value = (String)get_Value(COLUMNNAME_Code);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="0d0fc68c-21d2-4a08-853c-946085f2bc8b")
public static String es_PE_COLUMN_Code_Name="Code";

@XendraColumn(AD_Element_ID="4885b915-20ff-fb01-73f8-086c5ba63ba8",ColumnName="Code",
AD_Reference_ID=36,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=0,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0d0fc68c-21d2-4a08-853c-946085f2bc8b",
Synchronized="2019-08-30 22:22:44.0")
/** Column name Code */
public static final String COLUMNNAME_Code = "Code";
/** Set DeviceCode.
@param DeviceCode DeviceCode */
public void setDeviceCode (String DeviceCode)
{
if (DeviceCode != null && DeviceCode.length() > 255)
{
log.warning("Length > 255 - truncated");
DeviceCode = DeviceCode.substring(0,254);
}
set_Value (COLUMNNAME_DeviceCode, DeviceCode);
}
/** Get DeviceCode.
@return DeviceCode */
public String getDeviceCode() 
{
String value = (String)get_Value(COLUMNNAME_DeviceCode);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="4347103a-83e5-4ef8-b119-478f930dbc8a")
public static String es_PE_COLUMN_DeviceCode_Name="DeviceCode";

@XendraColumn(AD_Element_ID="171bcd4a-1c1b-4272-8829-0e608e24590a",ColumnName="DeviceCode",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4347103a-83e5-4ef8-b119-478f930dbc8a",
Synchronized="2019-08-30 22:22:44.0")
/** Column name DeviceCode */
public static final String COLUMNNAME_DeviceCode = "DeviceCode";
/** Set HR_AttendanceRecord_ID.
@param HR_AttendanceRecord_ID HR_AttendanceRecord_ID */
public void setHR_AttendanceRecord_ID (int HR_AttendanceRecord_ID)
{
if (HR_AttendanceRecord_ID <= 0) set_Value (COLUMNNAME_HR_AttendanceRecord_ID, null);
 else 
set_Value (COLUMNNAME_HR_AttendanceRecord_ID, Integer.valueOf(HR_AttendanceRecord_ID));
}
/** Get HR_AttendanceRecord_ID.
@return HR_AttendanceRecord_ID */
public int getHR_AttendanceRecord_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_AttendanceRecord_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0d163bcb-2977-47da-b6db-d61d04a41055")
public static String es_PE_COLUMN_HR_AttendanceRecord_ID_Name="HR_AttendanceRecord_ID";

@XendraColumn(AD_Element_ID="26ebafc4-aa22-4d86-9bbb-4ca614fa5e3c",
ColumnName="HR_AttendanceRecord_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0d163bcb-2977-47da-b6db-d61d04a41055",Synchronized="2019-08-30 22:22:44.0")
/** Column name HR_AttendanceRecord_ID */
public static final String COLUMNNAME_HR_AttendanceRecord_ID = "HR_AttendanceRecord_ID";
/** Set I_AttendanceRecord_ID.
@param I_AttendanceRecord_ID I_AttendanceRecord_ID */
public void setI_AttendanceRecord_ID (int I_AttendanceRecord_ID)
{
if (I_AttendanceRecord_ID < 1) throw new IllegalArgumentException ("I_AttendanceRecord_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_I_AttendanceRecord_ID, Integer.valueOf(I_AttendanceRecord_ID));
}
/** Get I_AttendanceRecord_ID.
@return I_AttendanceRecord_ID */
public int getI_AttendanceRecord_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_I_AttendanceRecord_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name I_AttendanceRecord_ID */
public static final String COLUMNNAME_I_AttendanceRecord_ID = "I_AttendanceRecord_ID";
}
