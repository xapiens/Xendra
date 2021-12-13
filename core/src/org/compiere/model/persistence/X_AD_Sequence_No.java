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
/** Generated Model for AD_Sequence_No
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Sequence_No extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Sequence_No_ID id
@param trxName transaction
*/
public X_AD_Sequence_No (Properties ctx, int AD_Sequence_No_ID, String trxName)
{
super (ctx, AD_Sequence_No_ID, trxName);
/** if (AD_Sequence_No_ID == 0)
{
setAD_Sequence_ID (0);
setCalendarYear (null);
setCurrentNext (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Sequence_No (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=122 */
public static int Table_ID=MTable.getTable_ID("AD_Sequence_No");

@XendraTrl(Identifier="0f0e04e6-75ad-d020-4f17-dd6384c1d3a2")
public static String es_PE_TABLE_AD_Sequence_No_Name="AD_Sequence_No";

@XendraTable(Name="AD_Sequence_No",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="AD_Sequence_No",AccessLevel="6",AD_Window_ID="c20f0a4a-33e9-82a3-2cc2-3b602cd050d2",
AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="0f0e04e6-75ad-d020-4f17-dd6384c1d3a2",Synchronized="2020-03-03 21:35:55.0")
/** TableName=AD_Sequence_No */
public static final String Table_Name="AD_Sequence_No";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Sequence_No");

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
    Table_ID = MTable.getTable_ID("AD_Sequence_No");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Sequence_No[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Sequence.
@param AD_Sequence_ID Document Sequence */
public void setAD_Sequence_ID (int AD_Sequence_ID)
{
if (AD_Sequence_ID < 1) throw new IllegalArgumentException ("AD_Sequence_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Sequence_ID, Integer.valueOf(AD_Sequence_ID));
}
/** Get Sequence.
@return Document Sequence */
public int getAD_Sequence_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Sequence_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3e5fb348-58d6-a828-c1eb-931d3154f8a7")
public static String es_PE_COLUMN_AD_Sequence_ID_Name="Secuencia";

@XendraColumn(AD_Element_ID="b4ecd1ce-eb14-87fa-8115-bb00f9f5d8b5",ColumnName="AD_Sequence_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3e5fb348-58d6-a828-c1eb-931d3154f8a7",
Synchronized="2019-08-30 22:20:41.0")
/** Column name AD_Sequence_ID */
public static final String COLUMNNAME_AD_Sequence_ID = "AD_Sequence_ID";
/** Set Year.
@param CalendarYear Calendar Year */
public void setCalendarYear (String CalendarYear)
{
if (CalendarYear == null) throw new IllegalArgumentException ("CalendarYear is mandatory.");
if (CalendarYear.length() > 4)
{
log.warning("Length > 4 - truncated");
CalendarYear = CalendarYear.substring(0,3);
}
set_ValueNoCheck (COLUMNNAME_CalendarYear, CalendarYear);
}
/** Get Year.
@return Calendar Year */
public String getCalendarYear() 
{
String value = (String)get_Value(COLUMNNAME_CalendarYear);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a74c5958-8ac8-ec0f-b89b-f57327136d94")
public static String es_PE_COLUMN_CalendarYear_Name="Año";

@XendraColumn(AD_Element_ID="7a9d01a9-5391-3074-5e4a-66205fb71b6b",ColumnName="CalendarYear",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=4,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a74c5958-8ac8-ec0f-b89b-f57327136d94",
Synchronized="2019-08-30 22:20:41.0")
/** Column name CalendarYear */
public static final String COLUMNNAME_CalendarYear = "CalendarYear";
/** Set Current Next.
@param CurrentNext The next number to be used */
public void setCurrentNext (int CurrentNext)
{
set_Value (COLUMNNAME_CurrentNext, Integer.valueOf(CurrentNext));
}
/** Get Current Next.
@return The next number to be used */
public int getCurrentNext() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_CurrentNext);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="19871b5c-80bf-0335-928d-b185cb620340")
public static String es_PE_COLUMN_CurrentNext_Name="Siguiente Secuencia";

@XendraColumn(AD_Element_ID="3cb3c545-8207-00bd-81ee-d16aaa68f4c2",ColumnName="CurrentNext",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="19871b5c-80bf-0335-928d-b185cb620340",
Synchronized="2019-08-30 22:20:41.0")
/** Column name CurrentNext */
public static final String COLUMNNAME_CurrentNext = "CurrentNext";
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
@XendraTrl(Identifier="f5031da0-f489-4ac4-9873-71df9c4654d2")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f5031da0-f489-4ac4-9873-71df9c4654d2",
Synchronized="2019-08-30 22:20:41.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
}
