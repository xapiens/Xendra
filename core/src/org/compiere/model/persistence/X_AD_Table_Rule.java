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
/** Generated Model for AD_Table_Rule
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Table_Rule extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Table_Rule_ID id
@param trxName transaction
*/
public X_AD_Table_Rule (Properties ctx, int AD_Table_Rule_ID, String trxName)
{
super (ctx, AD_Table_Rule_ID, trxName);
/** if (AD_Table_Rule_ID == 0)
{
setAD_Rule_ID (0);
setAD_Table_ID (0);
setAD_Table_Rule_ID (0);
setEventTable (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Table_Rule (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000352 */
public static int Table_ID=MTable.getTable_ID("AD_Table_Rule");

@XendraTrl(Identifier="32dc781d-a876-4dfd-9803-1a2746b836ae")
public static String es_PE_TABLE_AD_Table_Rule_Name="Table Rule";

@XendraTable(Name="Table Rule",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="AD_Table_Rule",AccessLevel="6",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.dictionary",Identifier="32dc781d-a876-4dfd-9803-1a2746b836ae",
Synchronized="2020-03-03 21:35:59.0")
/** TableName=AD_Table_Rule */
public static final String Table_Name="AD_Table_Rule";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Table_Rule");

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
    Table_ID = MTable.getTable_ID("AD_Table_Rule");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Table_Rule[").append(get_ID()).append("]");
return sb.toString();
}
/** Set AD_Rule_ID.
@param AD_Rule_ID AD_Rule_ID */
public void setAD_Rule_ID (int AD_Rule_ID)
{
if (AD_Rule_ID < 1) throw new IllegalArgumentException ("AD_Rule_ID is mandatory.");
set_Value (COLUMNNAME_AD_Rule_ID, Integer.valueOf(AD_Rule_ID));
}
/** Get AD_Rule_ID.
@return AD_Rule_ID */
public int getAD_Rule_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Rule_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="05b645cf-f050-4f67-8235-a0ac52d043ee")
public static String es_PE_COLUMN_AD_Rule_ID_Name="AD_Rule_ID";

@XendraColumn(AD_Element_ID="4b4afdeb-6aca-d182-6e3a-83f0f6d29f7d",ColumnName="AD_Rule_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="05b645cf-f050-4f67-8235-a0ac52d043ee",
Synchronized="2019-08-30 22:20:44.0")
/** Column name AD_Rule_ID */
public static final String COLUMNNAME_AD_Rule_ID = "AD_Rule_ID";
/** Set Table.
@param AD_Table_ID Database Table information */
public void setAD_Table_ID (int AD_Table_ID)
{
if (AD_Table_ID < 1) throw new IllegalArgumentException ("AD_Table_ID is mandatory.");
set_Value (COLUMNNAME_AD_Table_ID, Integer.valueOf(AD_Table_ID));
}
/** Get Table.
@return Database Table information */
public int getAD_Table_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Table_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="efe62aa3-d7ab-4d00-bb1d-20e94364ae47")
public static String es_PE_COLUMN_AD_Table_ID_Name="Table";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="efe62aa3-d7ab-4d00-bb1d-20e94364ae47",
Synchronized="2019-08-30 22:20:44.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
/** Set Table Rule.
@param AD_Table_Rule_ID Table Rule */
public void setAD_Table_Rule_ID (int AD_Table_Rule_ID)
{
if (AD_Table_Rule_ID < 1) throw new IllegalArgumentException ("AD_Table_Rule_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Table_Rule_ID, Integer.valueOf(AD_Table_Rule_ID));
}
/** Get Table Rule.
@return Table Rule */
public int getAD_Table_Rule_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Table_Rule_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_Table_Rule_ID */
public static final String COLUMNNAME_AD_Table_Rule_ID = "AD_Table_Rule_ID";
/** Set EventtTable.
@param EventTable EventtTable */
public void setEventTable (String EventTable)
{
if (EventTable.length() > 4)
{
log.warning("Length > 4 - truncated");
EventTable = EventTable.substring(0,3);
}
set_Value (COLUMNNAME_EventTable, EventTable);
}
/** Get EventtTable.
@return EventtTable */
public String getEventTable() 
{
return (String)get_Value(COLUMNNAME_EventTable);
}

@XendraTrl(Identifier="8a85c2fb-5ad5-4148-948d-76ddbb57805e")
public static String es_PE_COLUMN_EventTable_Name="eventtable";

@XendraColumn(AD_Element_ID="d39b5686-20f7-41b2-8ae5-5f9b98c7d2af",ColumnName="EventTable",
AD_Reference_ID=17,AD_Reference_Value_ID="64aec07a-a34f-4fd7-b4a0-88c09c379e6a",AD_Val_Rule_ID="",
FieldLength=4,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8a85c2fb-5ad5-4148-948d-76ddbb57805e",Synchronized="2019-08-30 22:20:44.0")
/** Column name EventTable */
public static final String COLUMNNAME_EventTable = "EventTable";
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
@XendraTrl(Identifier="e4c2d52e-98ff-4022-bc5a-2445668d2409")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e4c2d52e-98ff-4022-bc5a-2445668d2409",
Synchronized="2019-08-30 22:20:44.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
}
