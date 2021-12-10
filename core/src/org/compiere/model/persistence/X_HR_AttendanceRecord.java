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
/** Generated Model for HR_AttendanceRecord
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_HR_AttendanceRecord extends PO
{
/** Standard Constructor
@param ctx context
@param HR_AttendanceRecord_ID id
@param trxName transaction
*/
public X_HR_AttendanceRecord (Properties ctx, int HR_AttendanceRecord_ID, String trxName)
{
super (ctx, HR_AttendanceRecord_ID, trxName);
/** if (HR_AttendanceRecord_ID == 0)
{
setHR_AttendanceRecord_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_HR_AttendanceRecord (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000410 */
public static int Table_ID=MTable.getTable_ID("HR_AttendanceRecord");

@XendraTrl(Identifier="28d77a1b-1506-41bf-add0-b030f2d59e42")
public static String es_PE_TABLE_HR_AttendanceRecord_Name="AttendanceRecord";

@XendraTable(Name="AttendanceRecord",AD_Package_ID="95f9a029-eaee-0747-b1a5-58cfdd8f8ae5",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="HR_AttendanceRecord",
Help="HR_AttendanceRecord",TableName="HR_AttendanceRecord",AccessLevel="3",AD_Window_ID="",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=false,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.humanresource",
Identifier="28d77a1b-1506-41bf-add0-b030f2d59e42",Synchronized="2020-03-03 21:37:59.0")
/** TableName=HR_AttendanceRecord */
public static final String Table_Name="HR_AttendanceRecord";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"HR_AttendanceRecord");

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
    Table_ID = MTable.getTable_ID("HR_AttendanceRecord");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_HR_AttendanceRecord[").append(get_ID()).append("]");
return sb.toString();
}
/** Set C_Project_ID.
@param C_Project_ID C_Project_ID */
public void setC_Project_ID (int C_Project_ID)
{
if (C_Project_ID <= 0) set_Value (COLUMNNAME_C_Project_ID, null);
 else 
set_Value (COLUMNNAME_C_Project_ID, Integer.valueOf(C_Project_ID));
}
/** Get C_Project_ID.
@return C_Project_ID */
public int getC_Project_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Project_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a9841405-582d-4312-9a7c-a3794b8d4eed")
public static String es_PE_COLUMN_C_Project_ID_Name="C_Project_ID";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a9841405-582d-4312-9a7c-a3794b8d4eed",
Synchronized="2019-08-30 22:22:39.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
/** Set HR_AttendanceBatch_ID.
@param HR_AttendanceBatch_ID HR_AttendanceBatch_ID */
public void setHR_AttendanceBatch_ID (int HR_AttendanceBatch_ID)
{
if (HR_AttendanceBatch_ID <= 0) set_Value (COLUMNNAME_HR_AttendanceBatch_ID, null);
 else 
set_Value (COLUMNNAME_HR_AttendanceBatch_ID, Integer.valueOf(HR_AttendanceBatch_ID));
}
/** Get HR_AttendanceBatch_ID.
@return HR_AttendanceBatch_ID */
public int getHR_AttendanceBatch_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_AttendanceBatch_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="afe6a67e-4bca-444a-ac07-c736d451390e")
public static String es_PE_COLUMN_HR_AttendanceBatch_ID_Name="HR_AttendanceBatch_ID";

@XendraColumn(AD_Element_ID="2a77f2e9-b6c2-4609-811d-310b8ddfffe2",
ColumnName="HR_AttendanceBatch_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="afe6a67e-4bca-444a-ac07-c736d451390e",Synchronized="2019-08-30 22:22:39.0")
/** Column name HR_AttendanceBatch_ID */
public static final String COLUMNNAME_HR_AttendanceBatch_ID = "HR_AttendanceBatch_ID";
/** Set HR_AttendanceRecord_ID.
@param HR_AttendanceRecord_ID HR_AttendanceRecord_ID */
public void setHR_AttendanceRecord_ID (int HR_AttendanceRecord_ID)
{
if (HR_AttendanceRecord_ID < 1) throw new IllegalArgumentException ("HR_AttendanceRecord_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_HR_AttendanceRecord_ID, Integer.valueOf(HR_AttendanceRecord_ID));
}
/** Get HR_AttendanceRecord_ID.
@return HR_AttendanceRecord_ID */
public int getHR_AttendanceRecord_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_AttendanceRecord_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name HR_AttendanceRecord_ID */
public static final String COLUMNNAME_HR_AttendanceRecord_ID = "HR_AttendanceRecord_ID";
/** Set HR_Employee_ID.
@param HR_Employee_ID HR_Employee_ID */
public void setHR_Employee_ID (int HR_Employee_ID)
{
if (HR_Employee_ID <= 0) set_Value (COLUMNNAME_HR_Employee_ID, null);
 else 
set_Value (COLUMNNAME_HR_Employee_ID, Integer.valueOf(HR_Employee_ID));
}
/** Get HR_Employee_ID.
@return HR_Employee_ID */
public int getHR_Employee_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_Employee_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="82ca52ae-1f69-4a37-8573-370666f50a23")
public static String es_PE_COLUMN_HR_Employee_ID_Name="HR_Employee_ID";

@XendraColumn(AD_Element_ID="e2e2d837-3087-4795-9ab7-535beef68162",ColumnName="HR_Employee_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="82ca52ae-1f69-4a37-8573-370666f50a23",
Synchronized="2019-08-30 22:22:39.0")
/** Column name HR_Employee_ID */
public static final String COLUMNNAME_HR_Employee_ID = "HR_Employee_ID";
/** Set HR_ShiftSchedule_ID.
@param HR_ShiftSchedule_ID HR_ShiftSchedule_ID */
public void setHR_ShiftSchedule_ID (int HR_ShiftSchedule_ID)
{
if (HR_ShiftSchedule_ID <= 0) set_Value (COLUMNNAME_HR_ShiftSchedule_ID, null);
 else 
set_Value (COLUMNNAME_HR_ShiftSchedule_ID, Integer.valueOf(HR_ShiftSchedule_ID));
}
/** Get HR_ShiftSchedule_ID.
@return HR_ShiftSchedule_ID */
public int getHR_ShiftSchedule_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_ShiftSchedule_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="05f99718-802e-45c4-8801-0de98f59472f")
public static String es_PE_COLUMN_HR_ShiftSchedule_ID_Name="HR_ShiftSchedule_ID";

@XendraColumn(AD_Element_ID="c2796d6b-5ddf-4777-b4a5-c775155af2a9",
ColumnName="HR_ShiftSchedule_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="05f99718-802e-45c4-8801-0de98f59472f",Synchronized="2019-08-30 22:22:39.0")
/** Column name HR_ShiftSchedule_ID */
public static final String COLUMNNAME_HR_ShiftSchedule_ID = "HR_ShiftSchedule_ID";
/** Set HR_WorkShift_ID.
@param HR_WorkShift_ID HR_WorkShift_ID */
public void setHR_WorkShift_ID (int HR_WorkShift_ID)
{
if (HR_WorkShift_ID <= 0) set_Value (COLUMNNAME_HR_WorkShift_ID, null);
 else 
set_Value (COLUMNNAME_HR_WorkShift_ID, Integer.valueOf(HR_WorkShift_ID));
}
/** Get HR_WorkShift_ID.
@return HR_WorkShift_ID */
public int getHR_WorkShift_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_WorkShift_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7906b4ec-c5be-4d2d-929f-402f6b5d6bf3")
public static String es_PE_COLUMN_HR_WorkShift_ID_Name="HR_WorkShift_ID";

@XendraColumn(AD_Element_ID="742243ba-9ede-4990-8e52-6da7e53a866b",ColumnName="HR_WorkShift_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7906b4ec-c5be-4d2d-929f-402f6b5d6bf3",
Synchronized="2019-08-30 22:22:39.0")
/** Column name HR_WorkShift_ID */
public static final String COLUMNNAME_HR_WorkShift_ID = "HR_WorkShift_ID";
}
