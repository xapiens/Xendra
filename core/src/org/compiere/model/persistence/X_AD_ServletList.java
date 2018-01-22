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
/** Generated Model for AD_ServletList
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_ServletList extends PO
{
/** Standard Constructor
@param ctx context
@param AD_ServletList_ID id
@param trxName transaction
*/
public X_AD_ServletList (Properties ctx, int AD_ServletList_ID, String trxName)
{
super (ctx, AD_ServletList_ID, trxName);
/** if (AD_ServletList_ID == 0)
{
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_ServletList (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000383 */
public static int Table_ID=MTable.getTable_ID("AD_ServletList");

@XendraTrl(Identifier="88e7fc5d-663c-4f82-b716-23480e4db752")
public static String es_PE_TABLE_AD_ServletList_Name="Servlet List";

@XendraTable(Name="Servlet List",Description="",Help="",TableName="AD_ServletList",AccessLevel="6",
AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,
IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="88e7fc5d-663c-4f82-b716-23480e4db752",Synchronized="2017-08-16 11:40:59.0")
/** TableName=AD_ServletList */
public static final String Table_Name="AD_ServletList";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_ServletList");

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
    Table_ID = MTable.getTable_ID("AD_ServletList");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_ServletList[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Plugin.
@param AD_Plugin_ID Plugin */
public void setAD_Plugin_ID (int AD_Plugin_ID)
{
if (AD_Plugin_ID <= 0) set_Value (COLUMNNAME_AD_Plugin_ID, null);
 else 
set_Value (COLUMNNAME_AD_Plugin_ID, Integer.valueOf(AD_Plugin_ID));
}
/** Get Plugin.
@return Plugin */
public int getAD_Plugin_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Plugin_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="76153e9f-6d93-4f83-a8f8-175906c22378")
public static String es_PE_COLUMN_AD_Plugin_ID_Name="Plugin";

@XendraColumn(AD_Element_ID="895f0c3e-fa52-48b7-8fce-f9b2dc637774",ColumnName="AD_Plugin_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="76153e9f-6d93-4f83-a8f8-175906c22378",
Synchronized="2017-08-05 16:52:50.0")
/** Column name AD_Plugin_ID */
public static final String COLUMNNAME_AD_Plugin_ID = "AD_Plugin_ID";
/** Set Servlet List.
@param AD_ServletList_ID Servlet List */
public void setAD_ServletList_ID (int AD_ServletList_ID)
{
if (AD_ServletList_ID <= 0) set_ValueNoCheck (COLUMNNAME_AD_ServletList_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_AD_ServletList_ID, Integer.valueOf(AD_ServletList_ID));
}
/** Get Servlet List.
@return Servlet List */
public int getAD_ServletList_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_ServletList_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_ServletList_ID */
public static final String COLUMNNAME_AD_ServletList_ID = "AD_ServletList_ID";
/** Set context.
@param context context */
public void setcontext (String context)
{
if (context != null && context.length() > 100)
{
log.warning("Length > 100 - truncated");
context = context.substring(0,99);
}
set_Value (COLUMNNAME_context, context);
}
/** Get context.
@return context */
public String getcontext() 
{
String value = (String)get_Value(COLUMNNAME_context);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="898ba012-a68a-4cd1-80e2-21029f4a1b5a")
public static String es_PE_COLUMN_context_Name="context";

@XendraColumn(AD_Element_ID="e765745b-ca0e-492f-be52-54af511aa7aa",ColumnName="context",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=100,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="898ba012-a68a-4cd1-80e2-21029f4a1b5a",
Synchronized="2017-08-05 16:52:50.0")
/** Column name context */
public static final String COLUMNNAME_context = "context";
/** Set ID.
@param ID ID */
public void setID (String ID)
{
if (ID != null && ID.length() > 100)
{
log.warning("Length > 100 - truncated");
ID = ID.substring(0,99);
}
set_Value (COLUMNNAME_ID, ID);
}
/** Get ID.
@return ID */
public String getID() 
{
String value = (String)get_Value(COLUMNNAME_ID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="422e1dc8-d749-405e-9b0a-0210595fb374")
public static String es_PE_COLUMN_ID_Name="ID";

@XendraColumn(AD_Element_ID="089e82a2-807e-4cc0-96a6-05e479740035",ColumnName="ID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=100,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="422e1dc8-d749-405e-9b0a-0210595fb374",
Synchronized="2017-08-05 16:52:51.0")
/** Column name ID */
public static final String COLUMNNAME_ID = "ID";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name != null && Name.length() > 50)
{
log.warning("Length > 50 - truncated");
Name = Name.substring(0,49);
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getName());
}

@XendraTrl(Identifier="576278c9-0faf-402e-ae7a-a2ef55fad507")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=50,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="576278c9-0faf-402e-ae7a-a2ef55fad507",
Synchronized="2017-08-05 16:52:51.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
