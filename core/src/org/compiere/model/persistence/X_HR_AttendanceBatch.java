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
/** Generated Model for HR_AttendanceBatch
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_HR_AttendanceBatch extends PO
{
/** Standard Constructor
@param ctx context
@param HR_AttendanceBatch_ID id
@param trxName transaction
*/
public X_HR_AttendanceBatch (Properties ctx, int HR_AttendanceBatch_ID, String trxName)
{
super (ctx, HR_AttendanceBatch_ID, trxName);
/** if (HR_AttendanceBatch_ID == 0)
{
setHR_AttendanceBatch_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_HR_AttendanceBatch (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000411 */
public static int Table_ID=MTable.getTable_ID("HR_AttendanceBatch");

@XendraTrl(Identifier="57bb20e3-a401-46ba-a75f-32e0a2133c2e")
public static String es_PE_TABLE_HR_AttendanceBatch_Name="AttendanceBatch";

@XendraTable(Name="AttendanceBatch",AD_Package_ID="95f9a029-eaee-0747-b1a5-58cfdd8f8ae5",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="HR_AttendanceBatch",
Help="HR_AttendanceBatch",TableName="HR_AttendanceBatch",AccessLevel="3",AD_Window_ID="",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=false,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.humanresource",
Identifier="57bb20e3-a401-46ba-a75f-32e0a2133c2e",Synchronized="2020-03-03 21:37:59.0")
/** TableName=HR_AttendanceBatch */
public static final String Table_Name="HR_AttendanceBatch";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"HR_AttendanceBatch");

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
    Table_ID = MTable.getTable_ID("HR_AttendanceBatch");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_HR_AttendanceBatch[").append(get_ID()).append("]");
return sb.toString();
}
/** Set DateDoc.
@param DateDoc DateDoc */
public void setDateDoc (Timestamp DateDoc)
{
set_Value (COLUMNNAME_DateDoc, DateDoc);
}
/** Get DateDoc.
@return DateDoc */
public Timestamp getDateDoc() 
{
return (Timestamp)get_Value(COLUMNNAME_DateDoc);
}

@XendraTrl(Identifier="465016a8-9a6b-42e0-990c-d76ce615f6fe")
public static String es_PE_COLUMN_DateDoc_Name="DateDoc";

@XendraColumn(AD_Element_ID="68f87a38-0b7e-cc52-6990-3b5d2d120d9d",ColumnName="DateDoc",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="465016a8-9a6b-42e0-990c-d76ce615f6fe",
Synchronized="2019-08-30 22:22:38.0")
/** Column name DateDoc */
public static final String COLUMNNAME_DateDoc = "DateDoc";
/** Set HR_AttendanceBatch_ID.
@param HR_AttendanceBatch_ID HR_AttendanceBatch_ID */
public void setHR_AttendanceBatch_ID (int HR_AttendanceBatch_ID)
{
if (HR_AttendanceBatch_ID < 1) throw new IllegalArgumentException ("HR_AttendanceBatch_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_HR_AttendanceBatch_ID, Integer.valueOf(HR_AttendanceBatch_ID));
}
/** Get HR_AttendanceBatch_ID.
@return HR_AttendanceBatch_ID */
public int getHR_AttendanceBatch_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_AttendanceBatch_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name HR_AttendanceBatch_ID */
public static final String COLUMNNAME_HR_AttendanceBatch_ID = "HR_AttendanceBatch_ID";
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

@XendraTrl(Identifier="bfeaf0d5-b61b-4ab5-a7f4-1d41830f1dac")
public static String es_PE_COLUMN_HR_Employee_ID_Name="HR_Employee_ID";

@XendraColumn(AD_Element_ID="e2e2d837-3087-4795-9ab7-535beef68162",ColumnName="HR_Employee_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bfeaf0d5-b61b-4ab5-a7f4-1d41830f1dac",
Synchronized="2019-08-30 22:22:39.0")
/** Column name HR_Employee_ID */
public static final String COLUMNNAME_HR_Employee_ID = "HR_Employee_ID";
}
