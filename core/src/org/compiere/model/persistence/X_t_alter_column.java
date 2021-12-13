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
/** Generated Model for t_alter_column
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_t_alter_column extends PO
{
/** Standard Constructor
@param ctx context
@param t_alter_column_ID id
@param trxName transaction
*/
public X_t_alter_column (Properties ctx, int t_alter_column_ID, String trxName)
{
super (ctx, t_alter_column_ID, trxName);
/** if (t_alter_column_ID == 0)
{
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_t_alter_column (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000238 */
public static int Table_ID=MTable.getTable_ID("t_alter_column");

@XendraTrl(Identifier="442ac176-06a1-c5a9-bad1-c858f9691ad8")
public static String es_PE_TABLE_t_alter_column_Name="t_alter_column";

@XendraTable(Name="t_alter_column",AD_Package_ID="1b3656e5-71c7-1296-994e-9b2c4549c7fd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="t_alter_column",AccessLevel="4",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.standard",Identifier="442ac176-06a1-c5a9-bad1-c858f9691ad8",
Synchronized="2020-03-03 21:40:20.0")
/** TableName=t_alter_column */
public static final String Table_Name="t_alter_column";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"t_alter_column");

protected BigDecimal accessLevel = BigDecimal.valueOf(4);
/** AccessLevel
@return 4 - System 
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
    Table_ID = MTable.getTable_ID("t_alter_column");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_t_alter_column[").append(get_ID()).append("]");
return sb.toString();
}
/** Set DB Column Name.
@param ColumnName Name of the column in the database */
public void setColumnName (String ColumnName)
{
set_Value (COLUMNNAME_ColumnName, ColumnName);
}
/** Get DB Column Name.
@return Name of the column in the database */
public String getColumnName() 
{
String value = (String)get_Value(COLUMNNAME_ColumnName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="63739637-9fb8-f4ff-3269-39a6427719ad")
public static String es_PE_COLUMN_ColumnName_Name="DB Column Name";

@XendraColumn(AD_Element_ID="fadc32aa-cd31-3fee-f9b7-0daa53df76a7",ColumnName="ColumnName",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="63739637-9fb8-f4ff-3269-39a6427719ad",
Synchronized="2019-08-30 22:24:20.0")
/** Column name ColumnName */
public static final String COLUMNNAME_ColumnName = "ColumnName";
/** Set Data Type.
@param DataType Type of data */
public void setDataType (String DataType)
{
set_Value (COLUMNNAME_DataType, DataType);
}
/** Get Data Type.
@return Type of data */
public String getDataType() 
{
String value = (String)get_Value(COLUMNNAME_DataType);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="005faf34-4bf4-847f-a018-3f2d06c80e8c")
public static String es_PE_COLUMN_DataType_Name="Data Type";

@XendraColumn(AD_Element_ID="8dc3b1f4-318c-ea06-6b96-a691ad208b48",ColumnName="DataType",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="005faf34-4bf4-847f-a018-3f2d06c80e8c",
Synchronized="2019-08-30 22:24:20.0")
/** Column name DataType */
public static final String COLUMNNAME_DataType = "DataType";
/** Set defaultclause.
@param defaultclause defaultclause */
public void setdefaultclause (String defaultclause)
{
if (defaultclause != null && defaultclause.length() > 200)
{
log.warning("Length > 200 - truncated");
defaultclause = defaultclause.substring(0,199);
}
set_Value (COLUMNNAME_defaultclause, defaultclause);
}
/** Get defaultclause.
@return defaultclause */
public String getdefaultclause() 
{
String value = (String)get_Value(COLUMNNAME_defaultclause);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="258cdb9c-9028-1b11-f4a7-b9f5bacfe8ea")
public static String es_PE_COLUMN_defaultclause_Name="defaultclause";

@XendraColumn(AD_Element_ID="b47344a3-bc69-e278-cb14-8b144756ceb6",ColumnName="defaultclause",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=200,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="258cdb9c-9028-1b11-f4a7-b9f5bacfe8ea",
Synchronized="2019-08-30 22:24:20.0")
/** Column name defaultclause */
public static final String COLUMNNAME_defaultclause = "defaultclause";
/** Set nullclause.
@param nullclause nullclause */
public void setnullclause (String nullclause)
{
if (nullclause != null && nullclause.length() > 10)
{
log.warning("Length > 10 - truncated");
nullclause = nullclause.substring(0,9);
}
set_Value (COLUMNNAME_nullclause, nullclause);
}
/** Get nullclause.
@return nullclause */
public String getnullclause() 
{
String value = (String)get_Value(COLUMNNAME_nullclause);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="313e8dce-a6eb-38db-3b39-61fa20f0d1b5")
public static String es_PE_COLUMN_nullclause_Name="nullclause";

@XendraColumn(AD_Element_ID="0e5ad66b-d3bf-8cae-6d2f-26de7883cc03",ColumnName="nullclause",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="313e8dce-a6eb-38db-3b39-61fa20f0d1b5",
Synchronized="2019-08-30 22:24:20.0")
/** Column name nullclause */
public static final String COLUMNNAME_nullclause = "nullclause";
/** Set DB Table Name.
@param TableName Name of the table in the database */
public void setTableName (String TableName)
{
set_Value (COLUMNNAME_TableName, TableName);
}
/** Get DB Table Name.
@return Name of the table in the database */
public String getTableName() 
{
String value = (String)get_Value(COLUMNNAME_TableName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="79f334da-5b1a-a134-243c-4919c40f4879")
public static String es_PE_COLUMN_TableName_Name="DB Table Name";

@XendraColumn(AD_Element_ID="be0b8df8-a2da-2b62-065c-960faee503eb",ColumnName="TableName",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="79f334da-5b1a-a134-243c-4919c40f4879",
Synchronized="2019-08-30 22:24:20.0")
/** Column name TableName */
public static final String COLUMNNAME_TableName = "TableName";
}
