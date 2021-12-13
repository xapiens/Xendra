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
/** Generated Model for AD_Attribute_Value
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Attribute_Value extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Attribute_Value_ID id
@param trxName transaction
*/
public X_AD_Attribute_Value (Properties ctx, int AD_Attribute_Value_ID, String trxName)
{
super (ctx, AD_Attribute_Value_ID, trxName);
/** if (AD_Attribute_Value_ID == 0)
{
setAD_Attribute_ID (0);
setRecord_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Attribute_Value (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=406 */
public static int Table_ID=MTable.getTable_ID("AD_Attribute_Value");

@XendraTrl(Identifier="d8b9c389-8205-1a8e-cc91-0a5500f75da0")
public static String es_PE_TABLE_AD_Attribute_Value_Name="AD_Attribute_Value";

@XendraTable(Name="AD_Attribute_Value",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="AD_Attribute_Value",AccessLevel="7",AD_Window_ID="545edb7a-56cf-9857-622b-b8c9cc333346",
AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="d8b9c389-8205-1a8e-cc91-0a5500f75da0",Synchronized="2020-03-03 21:34:53.0")
/** TableName=AD_Attribute_Value */
public static final String Table_Name="AD_Attribute_Value";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Attribute_Value");

protected BigDecimal accessLevel = BigDecimal.valueOf(7);
/** AccessLevel
@return 7 - System - Client - Org 
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
    Table_ID = MTable.getTable_ID("AD_Attribute_Value");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Attribute_Value[").append(get_ID()).append("]");
return sb.toString();
}
/** Set System Attribute.
@param AD_Attribute_ID System Attribute */
public void setAD_Attribute_ID (int AD_Attribute_ID)
{
if (AD_Attribute_ID < 1) throw new IllegalArgumentException ("AD_Attribute_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Attribute_ID, Integer.valueOf(AD_Attribute_ID));
}
/** Get System Attribute.
@return System Attribute */
public int getAD_Attribute_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Attribute_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="52149706-1802-0125-54af-f37ad25cd966")
public static String es_PE_COLUMN_AD_Attribute_ID_Name="Atributo";

@XendraColumn(AD_Element_ID="3911028d-580b-a313-1d15-14a418a25e4d",ColumnName="AD_Attribute_ID",
AD_Reference_ID=13,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="52149706-1802-0125-54af-f37ad25cd966",
Synchronized="2020-03-03 21:34:24.0")
/** Column name AD_Attribute_ID */
public static final String COLUMNNAME_AD_Attribute_ID = "AD_Attribute_ID";
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
@XendraTrl(Identifier="abf3ef60-c1bc-414c-a411-d91c8078a5df")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="abf3ef60-c1bc-414c-a411-d91c8078a5df",
Synchronized="2020-03-03 21:34:24.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Record ID.
@param Record_ID Direct internal record ID */
public void setRecord_ID (int Record_ID)
{
if (Record_ID < 0) throw new IllegalArgumentException ("Record_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_Record_ID, Integer.valueOf(Record_ID));
}
/** Get Record ID.
@return Direct internal record ID */
public int getRecord_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Record_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="677e13f4-88ed-c592-4ebf-7f93328f68ea")
public static String es_PE_COLUMN_Record_ID_Name="ID de Registro";

@XendraColumn(AD_Element_ID="86e36e4b-d1dc-2deb-449d-c1f6769e1603",ColumnName="Record_ID",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="677e13f4-88ed-c592-4ebf-7f93328f68ea",
Synchronized="2020-03-03 21:34:24.0")
/** Column name Record_ID */
public static final String COLUMNNAME_Record_ID = "Record_ID";
/** Set V_Date.
@param V_Date V_Date */
public void setV_Date (Timestamp V_Date)
{
set_Value (COLUMNNAME_V_Date, V_Date);
}
/** Get V_Date.
@return V_Date */
public Timestamp getV_Date() 
{
return (Timestamp)get_Value(COLUMNNAME_V_Date);
}

@XendraTrl(Identifier="f199495c-7318-cb29-3fff-825cd0302c05")
public static String es_PE_COLUMN_V_Date_Name="Fecha";

@XendraColumn(AD_Element_ID="31f08928-9109-d0c9-b2c6-0c4c27903b04",ColumnName="V_Date",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f199495c-7318-cb29-3fff-825cd0302c05",
Synchronized="2020-03-03 21:34:24.0")
/** Column name V_Date */
public static final String COLUMNNAME_V_Date = "V_Date";
/** Set V_Number.
@param V_Number V_Number */
public void setV_Number (String V_Number)
{
if (V_Number != null && V_Number.length() > 22)
{
log.warning("Length > 22 - truncated");
V_Number = V_Number.substring(0,21);
}
set_Value (COLUMNNAME_V_Number, V_Number);
}
/** Get V_Number.
@return V_Number */
public String getV_Number() 
{
String value = (String)get_Value(COLUMNNAME_V_Number);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="131b25b1-f273-71b0-7585-f2a02ae7cf25")
public static String es_PE_COLUMN_V_Number_Name="Número";

@XendraColumn(AD_Element_ID="42f7edad-7ad9-adbb-8da4-200e5a341521",ColumnName="V_Number",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="131b25b1-f273-71b0-7585-f2a02ae7cf25",
Synchronized="2020-03-03 21:34:24.0")
/** Column name V_Number */
public static final String COLUMNNAME_V_Number = "V_Number";
/** Set V_String.
@param V_String V_String */
public void setV_String (String V_String)
{
if (V_String != null && V_String.length() > 2000)
{
log.warning("Length > 2000 - truncated");
V_String = V_String.substring(0,1999);
}
set_Value (COLUMNNAME_V_String, V_String);
}
/** Get V_String.
@return V_String */
public String getV_String() 
{
String value = (String)get_Value(COLUMNNAME_V_String);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="408fe1b4-7687-2c38-c7c6-2377e829abad")
public static String es_PE_COLUMN_V_String_Name="Secuencia";

@XendraColumn(AD_Element_ID="a1b1f33b-0c8e-cdb4-f28f-0b5bc20d5dfa",ColumnName="V_String",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="408fe1b4-7687-2c38-c7c6-2377e829abad",
Synchronized="2020-03-03 21:34:24.0")
/** Column name V_String */
public static final String COLUMNNAME_V_String = "V_String";
}
