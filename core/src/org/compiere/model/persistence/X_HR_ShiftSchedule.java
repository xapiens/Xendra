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
/** Generated Model for HR_ShiftSchedule
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_HR_ShiftSchedule extends PO
{
/** Standard Constructor
@param ctx context
@param HR_ShiftSchedule_ID id
@param trxName transaction
*/
public X_HR_ShiftSchedule (Properties ctx, int HR_ShiftSchedule_ID, String trxName)
{
super (ctx, HR_ShiftSchedule_ID, trxName);
/** if (HR_ShiftSchedule_ID == 0)
{
setHR_ShiftSchedule_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_HR_ShiftSchedule (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000407 */
public static int Table_ID=MTable.getTable_ID("HR_ShiftSchedule");

@XendraTrl(Identifier="fde52d88-8af4-4946-a823-013d6257fa46")
public static String es_PE_TABLE_HR_ShiftSchedule_Name="ShiftSchedule";

@XendraTable(Name="ShiftSchedule",AD_Package_ID="95f9a029-eaee-0747-b1a5-58cfdd8f8ae5",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="HR_ShiftSchedule",
Help="HR_ShiftSchedule",TableName="HR_ShiftSchedule",AccessLevel="3",AD_Window_ID="",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=false,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.humanresource",
Identifier="fde52d88-8af4-4946-a823-013d6257fa46",Synchronized="2020-03-03 21:38:03.0")
/** TableName=HR_ShiftSchedule */
public static final String Table_Name="HR_ShiftSchedule";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"HR_ShiftSchedule");

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
    Table_ID = MTable.getTable_ID("HR_ShiftSchedule");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_HR_ShiftSchedule[").append(get_ID()).append("]");
return sb.toString();
}
/** Set HR_Period_ID.
@param HR_Period_ID HR_Period_ID */
public void setHR_Period_ID (int HR_Period_ID)
{
if (HR_Period_ID <= 0) set_Value (COLUMNNAME_HR_Period_ID, null);
 else 
set_Value (COLUMNNAME_HR_Period_ID, Integer.valueOf(HR_Period_ID));
}
/** Get HR_Period_ID.
@return HR_Period_ID */
public int getHR_Period_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_Period_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fba2ba87-fbd9-40b1-9792-a68d63aef830")
public static String es_PE_COLUMN_HR_Period_ID_Name="HR_Period_ID";

@XendraColumn(AD_Element_ID="e75ae9a3-701a-442a-847a-5e1887efaf12",ColumnName="HR_Period_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fba2ba87-fbd9-40b1-9792-a68d63aef830",
Synchronized="2019-08-30 22:22:43.0")
/** Column name HR_Period_ID */
public static final String COLUMNNAME_HR_Period_ID = "HR_Period_ID";
/** Set HR_ShiftSchedule_ID.
@param HR_ShiftSchedule_ID HR_ShiftSchedule_ID */
public void setHR_ShiftSchedule_ID (int HR_ShiftSchedule_ID)
{
if (HR_ShiftSchedule_ID < 1) throw new IllegalArgumentException ("HR_ShiftSchedule_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_HR_ShiftSchedule_ID, Integer.valueOf(HR_ShiftSchedule_ID));
}
/** Get HR_ShiftSchedule_ID.
@return HR_ShiftSchedule_ID */
public int getHR_ShiftSchedule_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_ShiftSchedule_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name HR_ShiftSchedule_ID */
public static final String COLUMNNAME_HR_ShiftSchedule_ID = "HR_ShiftSchedule_ID";
/** Set HR_WorkGroup_ID.
@param HR_WorkGroup_ID HR_WorkGroup_ID */
public void setHR_WorkGroup_ID (int HR_WorkGroup_ID)
{
if (HR_WorkGroup_ID <= 0) set_Value (COLUMNNAME_HR_WorkGroup_ID, null);
 else 
set_Value (COLUMNNAME_HR_WorkGroup_ID, Integer.valueOf(HR_WorkGroup_ID));
}
/** Get HR_WorkGroup_ID.
@return HR_WorkGroup_ID */
public int getHR_WorkGroup_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_WorkGroup_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c21cb272-2de3-44ad-83e9-970a22416560")
public static String es_PE_COLUMN_HR_WorkGroup_ID_Name="HR_WorkGroup_ID";

@XendraColumn(AD_Element_ID="45ef08e9-415b-4658-b622-807b9daedd6d",ColumnName="HR_WorkGroup_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c21cb272-2de3-44ad-83e9-970a22416560",
Synchronized="2019-08-30 22:22:43.0")
/** Column name HR_WorkGroup_ID */
public static final String COLUMNNAME_HR_WorkGroup_ID = "HR_WorkGroup_ID";
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

@XendraTrl(Identifier="058fddc7-4f80-4ca3-9c3b-95096c365b56")
public static String es_PE_COLUMN_HR_WorkShift_ID_Name="HR_WorkShift_ID";

@XendraColumn(AD_Element_ID="742243ba-9ede-4990-8e52-6da7e53a866b",ColumnName="HR_WorkShift_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="058fddc7-4f80-4ca3-9c3b-95096c365b56",
Synchronized="2019-08-30 22:22:43.0")
/** Column name HR_WorkShift_ID */
public static final String COLUMNNAME_HR_WorkShift_ID = "HR_WorkShift_ID";
}
