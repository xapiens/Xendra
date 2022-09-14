/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
 * Copyright (C)  dravios       All Rights Reserved.                          *
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
/** Generated Model for S_Error_Codes
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_S_Error_Codes extends PO
{
/** Standard Constructor
@param ctx context
@param S_Error_Codes_ID id
@param trxName transaction
*/
public X_S_Error_Codes (Properties ctx, int S_Error_Codes_ID, String trxName)
{
super (ctx, S_Error_Codes_ID, trxName);
/** if (S_Error_Codes_ID == 0)
{
setErrorMsg (null);
setS_Error_Codes_ID (0);
setValue (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_S_Error_Codes (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000433 */
public static int Table_ID=MTable.getTable_ID("S_Error_Codes");

@XendraTrl(Identifier="76bfa3fd-0778-4c11-a914-848d16d87c8f")
public static String es_PE_TABLE_S_Error_Codes_Name="Sunat Error Codes";

@XendraTable(Name="Sunat Error Codes",AD_Package_ID="2ac04657-d663-47c2-4ec1-927ad71f1e96",
AD_Plugin_ID="",Description="",Help="",TableName="S_Error_Codes",AccessLevel="6",AD_Window_ID="",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="",
Identifier="76bfa3fd-0778-4c11-a914-848d16d87c8f",Synchronized="2022-09-14 10:20:57.0")
/** TableName=S_Error_Codes */
public static final String Table_Name="S_Error_Codes";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"S_Error_Codes");

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
    Table_ID = MTable.getTable_ID("S_Error_Codes");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_S_Error_Codes[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Error Msg.
@param ErrorMsg Error Msg */
public void setErrorMsg (String ErrorMsg)
{
if (ErrorMsg == null) throw new IllegalArgumentException ("ErrorMsg is mandatory.");
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
@XendraTrl(Identifier="93d7bedd-5660-43ea-93a9-669a8e8d9925")
public static String es_PE_COLUMN_ErrorMsg_Name="Error Msg";

@XendraColumn(AD_Element_ID="7ed8e902-7223-0140-a5e2-159d12a79a58",ColumnName="ErrorMsg",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="93d7bedd-5660-43ea-93a9-669a8e8d9925",
Synchronized="2022-06-09 16:49:33.0")
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
@XendraTrl(Identifier="56618e11-17f4-47d4-8284-ecbc95dd215e")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="56618e11-17f4-47d4-8284-ecbc95dd215e",
Synchronized="2022-06-09 16:49:33.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Sunat Error Codes.
@param S_Error_Codes_ID Sunat Error Codes */
public void setS_Error_Codes_ID (int S_Error_Codes_ID)
{
if (S_Error_Codes_ID < 1) throw new IllegalArgumentException ("S_Error_Codes_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_S_Error_Codes_ID, Integer.valueOf(S_Error_Codes_ID));
}
/** Get Sunat Error Codes.
@return Sunat Error Codes */
public int getS_Error_Codes_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_S_Error_Codes_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name S_Error_Codes_ID */
public static final String COLUMNNAME_S_Error_Codes_ID = "S_Error_Codes_ID";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value == null) throw new IllegalArgumentException ("Value is mandatory.");
if (Value.length() > 40)
{
log.warning("Length > 40 - truncated");
Value = Value.substring(0,39);
}
set_Value (COLUMNNAME_Value, Value);
}
/** Get Search Key.
@return Search key for the record in the format required - must be unique */
public String getValue() 
{
String value = (String)get_Value(COLUMNNAME_Value);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="6cfc69b3-d8e3-4b55-8d13-df52787daca5")
public static String es_PE_COLUMN_Value_Name="Search Key";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6cfc69b3-d8e3-4b55-8d13-df52787daca5",
Synchronized="2022-06-09 16:49:33.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
