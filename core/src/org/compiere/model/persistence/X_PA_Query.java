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
/** Generated Model for PA_Query
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_PA_Query extends PO
{
/** Standard Constructor
@param ctx context
@param PA_Query_ID id
@param trxName transaction
*/
public X_PA_Query (Properties ctx, int PA_Query_ID, String trxName)
{
super (ctx, PA_Query_ID, trxName);
/** if (PA_Query_ID == 0)
{
setName (null);
setPA_Query_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_PA_Query (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000422 */
public static int Table_ID=MTable.getTable_ID("PA_Query");

@XendraTrl(Identifier="552959fc-49c1-4db3-99b1-ee69f13c8342")
public static String es_PE_TABLE_PA_Query_Name="PA_Query";

@XendraTable(Name="PA_Query",AD_Package_ID="34bf6e21-8c70-8fb9-604c-a300eb925459",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="PA_Query",
AccessLevel="4",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.performanceanalysis",Identifier="552959fc-49c1-4db3-99b1-ee69f13c8342",
Synchronized="2020-03-04 16:04:40.0")
/** TableName=PA_Query */
public static final String Table_Name="PA_Query";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"PA_Query");

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
    Table_ID = MTable.getTable_ID("PA_Query");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_PA_Query[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Content.
@param Content Content */
public void setContent (String Content)
{
set_Value (COLUMNNAME_Content, Content);
}
/** Get Content.
@return Content */
public String getContent() 
{
String value = (String)get_Value(COLUMNNAME_Content);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="202be8be-6af5-4f98-b36c-cc2a3df6591f")
public static String es_PE_COLUMN_Content_Name="Content";

@XendraColumn(AD_Element_ID="1aa0835d-f6ff-ae44-3d38-0719eab019ce",ColumnName="Content",
AD_Reference_ID=45,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="202be8be-6af5-4f98-b36c-cc2a3df6591f",
Synchronized="2020-03-03 21:39:06.0")
/** Column name Content */
public static final String COLUMNNAME_Content = "Content";
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
@XendraTrl(Identifier="a609b02f-56ca-434b-9de0-f1364fee2a08")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a609b02f-56ca-434b-9de0-f1364fee2a08",
Synchronized="2020-03-03 21:39:06.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name == null) throw new IllegalArgumentException ("Name is mandatory.");
if (Name.length() > 60)
{
log.warning("Length > 60 - truncated");
Name = Name.substring(0,59);
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

@XendraTrl(Identifier="409e3ae2-2085-41f7-80ba-e54ab178e654")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="409e3ae2-2085-41f7-80ba-e54ab178e654",
Synchronized="2020-03-03 21:39:06.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set PA_Query.
@param PA_Query_ID PA_Query */
public void setPA_Query_ID (int PA_Query_ID)
{
if (PA_Query_ID < 1) throw new IllegalArgumentException ("PA_Query_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_PA_Query_ID, Integer.valueOf(PA_Query_ID));
}
/** Get PA_Query.
@return PA_Query */
public int getPA_Query_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_Query_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name PA_Query_ID */
public static final String COLUMNNAME_PA_Query_ID = "PA_Query_ID";
/** Set Synchronized.
@param Synchronized Synchronized */
public void setSynchronized (Timestamp Synchronized)
{
set_Value (COLUMNNAME_Synchronized, Synchronized);
}
/** Get Synchronized.
@return Synchronized */
public Timestamp getSynchronized() 
{
return (Timestamp)get_Value(COLUMNNAME_Synchronized);
}

@XendraTrl(Identifier="a6a6bbbc-9069-4ec4-a519-1326cd221214")
public static String es_PE_COLUMN_Synchronized_Name="Synchronized";

@XendraColumn(AD_Element_ID="08f1e976-ceeb-f830-9d75-bf94f13a98ce",ColumnName="Synchronized",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a6a6bbbc-9069-4ec4-a519-1326cd221214",
Synchronized="2020-03-03 21:39:06.0")
/** Column name Synchronized */
public static final String COLUMNNAME_Synchronized = "Synchronized";
}
