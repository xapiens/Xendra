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
/** Generated Model for AD_ReplicationTable
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_ReplicationTable extends PO
{
/** Standard Constructor
@param ctx context
@param AD_ReplicationTable_ID id
@param trxName transaction
*/
public X_AD_ReplicationTable (Properties ctx, int AD_ReplicationTable_ID, String trxName)
{
super (ctx, AD_ReplicationTable_ID, trxName);
/** if (AD_ReplicationTable_ID == 0)
{
setAD_ReplicationTable_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_ReplicationTable (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000405 */
public static int Table_ID=MTable.getTable_ID("AD_ReplicationTable");

@XendraTrl(Identifier="459f3420-885e-443d-87d4-f1c434111c29")
public static String es_PE_TABLE_AD_ReplicationTable_Name="AD_ReplicationTable";

@XendraTable(Name="ReplicationTable",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Replication Table",
Help="Replication Table",TableName="AD_ReplicationTable",AccessLevel="4",AD_Window_ID="",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=false,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="459f3420-885e-443d-87d4-f1c434111c29",Synchronized="2020-03-03 21:35:51.0")
/** TableName=AD_ReplicationTable */
public static final String Table_Name="AD_ReplicationTable";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_ReplicationTable");

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
    Table_ID = MTable.getTable_ID("AD_ReplicationTable");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_ReplicationTable[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Replication Table.
@param AD_ReplicationTable_ID Data Replication Strategy Table Info */
public void setAD_ReplicationTable_ID (int AD_ReplicationTable_ID)
{
if (AD_ReplicationTable_ID < 1) throw new IllegalArgumentException ("AD_ReplicationTable_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_ReplicationTable_ID, Integer.valueOf(AD_ReplicationTable_ID));
}
/** Get Replication Table.
@return Data Replication Strategy Table Info */
public int getAD_ReplicationTable_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_ReplicationTable_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_ReplicationTable_ID */
public static final String COLUMNNAME_AD_ReplicationTable_ID = "AD_ReplicationTable_ID";
/** Set AD_Table_ID.
@param AD_Table_ID AD_Table_ID */
public void setAD_Table_ID (int AD_Table_ID)
{
if (AD_Table_ID <= 0) set_Value (COLUMNNAME_AD_Table_ID, null);
 else 
set_Value (COLUMNNAME_AD_Table_ID, Integer.valueOf(AD_Table_ID));
}
/** Get AD_Table_ID.
@return AD_Table_ID */
public int getAD_Table_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Table_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d4597120-c6e4-4036-b16d-861be23829e0")
public static String es_PE_COLUMN_AD_Table_ID_Name="AD_Table_ID";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d4597120-c6e4-4036-b16d-861be23829e0",
Synchronized="2019-08-30 22:20:38.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
/** Set Error Msg.
@param ErrorMsg Error Msg */
public void setErrorMsg (String ErrorMsg)
{
set_Value (COLUMNNAME_ErrorMsg, ErrorMsg);
}
/** Get Error Msg.
@return Error Msg */
public String getErrorMsg() 
{
String value = (String)get_Value(COLUMNNAME_ErrorMsg);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="1f670a93-12dc-471c-b072-d0b6d9cdf78a")
public static String es_PE_COLUMN_ErrorMsg_Name="Error Msg";

@XendraColumn(AD_Element_ID="7ed8e902-7223-0140-a5e2-159d12a79a58",ColumnName="ErrorMsg",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1f670a93-12dc-471c-b072-d0b6d9cdf78a",
Synchronized="2019-08-30 22:20:38.0")
/** Column name ErrorMsg */
public static final String COLUMNNAME_ErrorMsg = "ErrorMsg";
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
@XendraTrl(Identifier="29be2266-702b-4244-934e-af222b8eb16a")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="29be2266-702b-4244-934e-af222b8eb16a",
Synchronized="2019-08-30 22:20:38.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Processed.
@param Processed Processed */
public void setProcessed (boolean Processed)
{
set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
}
/** Get Processed.
@return Processed */
public boolean isProcessed() 
{
Object oo = get_Value(COLUMNNAME_Processed);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="cf4345f4-b68d-411c-b446-aa11c113fc9f")
public static String es_PE_COLUMN_Processed_Name="Processed";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cf4345f4-b68d-411c-b446-aa11c113fc9f",
Synchronized="2019-08-30 22:20:38.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set TableIdentifier.
@param TableIdentifier TableIdentifier */
public void setTableIdentifier (String TableIdentifier)
{
if (TableIdentifier != null && TableIdentifier.length() > 36)
{
log.warning("Length > 36 - truncated");
TableIdentifier = TableIdentifier.substring(0,35);
}
set_Value (COLUMNNAME_TableIdentifier, TableIdentifier);
}
/** Get TableIdentifier.
@return TableIdentifier */
public String getTableIdentifier() 
{
String value = (String)get_Value(COLUMNNAME_TableIdentifier);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="e7ebc9de-7a5f-4f81-b195-cbd38bc26557")
public static String es_PE_COLUMN_TableIdentifier_Name="TableIdentifier";

@XendraColumn(AD_Element_ID="8b4a9083-e1f3-4fef-9d45-5361fb409c11",ColumnName="TableIdentifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e7ebc9de-7a5f-4f81-b195-cbd38bc26557",
Synchronized="2019-08-30 22:20:38.0")
/** Column name TableIdentifier */
public static final String COLUMNNAME_TableIdentifier = "TableIdentifier";
}
