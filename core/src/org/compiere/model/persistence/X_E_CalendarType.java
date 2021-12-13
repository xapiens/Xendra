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
/** Generated Model for E_CalendarType
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_E_CalendarType extends PO
{
/** Standard Constructor
@param ctx context
@param E_CalendarType_ID id
@param trxName transaction
*/
public X_E_CalendarType (Properties ctx, int E_CalendarType_ID, String trxName)
{
super (ctx, E_CalendarType_ID, trxName);
/** if (E_CalendarType_ID == 0)
{
setE_CalendarType_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_E_CalendarType (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000293 */
public static int Table_ID=MTable.getTable_ID("E_CalendarType");

@XendraTrl(Identifier="fc853e2e-2f26-4084-b168-275be4f1f866")
public static String es_PE_TABLE_E_CalendarType_Name="E_CalendarType";

@XendraTable(Name="E_CalendarType",AD_Package_ID="5a4baeee-43d7-eba9-9b5a-4ab05cfda2bd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="E_CalendarType",AccessLevel="6",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.communication",Identifier="fc853e2e-2f26-4084-b168-275be4f1f866",
Synchronized="2020-03-03 21:37:47.0")
/** TableName=E_CalendarType */
public static final String Table_Name="E_CalendarType";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"E_CalendarType");

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
    Table_ID = MTable.getTable_ID("E_CalendarType");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_E_CalendarType[").append(get_ID()).append("]");
return sb.toString();
}
/** Set color.
@param color color */
public void setcolor (String color)
{
set_Value (COLUMNNAME_color, color);
}
/** Get color.
@return color */
public String getcolor() 
{
String value = (String)get_Value(COLUMNNAME_color);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="85ab737d-ef29-4226-ac76-cbf90fa29f0b")
public static String es_PE_COLUMN_color_Name="color";

@XendraColumn(AD_Element_ID="3f5e47dd-40f4-4cc6-85ca-e33fd9e5a198",ColumnName="color",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="85ab737d-ef29-4226-ac76-cbf90fa29f0b",
Synchronized="2019-08-30 22:22:24.0")
/** Column name color */
public static final String COLUMNNAME_color = "color";
/** Set E_CalendarType_ID.
@param E_CalendarType_ID E_CalendarType_ID */
public void setE_CalendarType_ID (int E_CalendarType_ID)
{
if (E_CalendarType_ID < 1) throw new IllegalArgumentException ("E_CalendarType_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_E_CalendarType_ID, Integer.valueOf(E_CalendarType_ID));
}
/** Get E_CalendarType_ID.
@return E_CalendarType_ID */
public int getE_CalendarType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_E_CalendarType_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name E_CalendarType_ID */
public static final String COLUMNNAME_E_CalendarType_ID = "E_CalendarType_ID";
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
@XendraTrl(Identifier="7b57dd44-23a0-41c7-ae7c-166949058115")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7b57dd44-23a0-41c7-ae7c-166949058115",
Synchronized="2019-08-30 22:22:24.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name != null && Name.length() > 20)
{
log.warning("Length > 20 - truncated");
Name = Name.substring(0,19);
}
set_Value (COLUMNNAME_Name, Name);
}
/** Get Name.
@return Alphanumeric identifier of the entity */
public String getName() 
{
String value = (String)get_Value(COLUMNNAME_Name);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="6da75109-a698-4f94-adaa-88ab69ff4db9")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6da75109-a698-4f94-adaa-88ab69ff4db9",
Synchronized="2019-08-30 22:22:24.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Type.
@param Type Type of Validation (SQL, Java Script, Java Language) */
public void setType (String Type)
{
if (Type != null && Type.length() > 20)
{
log.warning("Length > 20 - truncated");
Type = Type.substring(0,19);
}
set_Value (COLUMNNAME_Type, Type);
}
/** Get Type.
@return Type of Validation (SQL, Java Script, Java Language) */
public String getType() 
{
String value = (String)get_Value(COLUMNNAME_Type);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ae8b12b1-bfba-4936-9644-6170128a3360")
public static String es_PE_COLUMN_Type_Name="Type";

@XendraColumn(AD_Element_ID="25f95bd2-be42-03fc-c8d2-a7103835133c",ColumnName="Type",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ae8b12b1-bfba-4936-9644-6170128a3360",
Synchronized="2019-08-30 22:22:24.0")
/** Column name Type */
public static final String COLUMNNAME_Type = "Type";
/** Set URL.
@param URL Full URL address - e.g. http://www.adempiere.org */
public void setURL (String URL)
{
if (URL != null && URL.length() > 120)
{
log.warning("Length > 120 - truncated");
URL = URL.substring(0,119);
}
set_Value (COLUMNNAME_URL, URL);
}
/** Get URL.
@return Full URL address - e.g. http://www.adempiere.org */
public String getURL() 
{
String value = (String)get_Value(COLUMNNAME_URL);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="837f676a-aac3-4539-bf91-2226238c36c2")
public static String es_PE_COLUMN_URL_Name="URL";

@XendraColumn(AD_Element_ID="28e2c006-3aca-a761-94d4-14eac9cc634c",ColumnName="URL",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="837f676a-aac3-4539-bf91-2226238c36c2",
Synchronized="2019-08-30 22:22:24.0")
/** Column name URL */
public static final String COLUMNNAME_URL = "URL";
}
