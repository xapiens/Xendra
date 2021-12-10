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
/** Generated Model for AD_Package
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Package extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Package_ID id
@param trxName transaction
*/
public X_AD_Package (Properties ctx, int AD_Package_ID, String trxName)
{
super (ctx, AD_Package_ID, trxName);
/** if (AD_Package_ID == 0)
{
setAD_Package_ID (0);
setAD_Plugin_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Package (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000414 */
public static int Table_ID=MTable.getTable_ID("AD_Package");

@XendraTrl(Identifier="bdacbf5b-e7fc-451f-abe8-a93f33898ca5")
public static String es_PE_TABLE_AD_Package_Name="Package Name";

@XendraTable(Name="Package Name",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="AD_Package",
AccessLevel="4",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.dictionary",Identifier="bdacbf5b-e7fc-451f-abe8-a93f33898ca5",
Synchronized="2020-03-03 21:35:12.0")
/** TableName=AD_Package */
public static final String Table_Name="AD_Package";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Package");

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
    Table_ID = MTable.getTable_ID("AD_Package");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Package[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Package Name.
@param AD_Package_ID Package Name */
public void setAD_Package_ID (int AD_Package_ID)
{
if (AD_Package_ID < 1) throw new IllegalArgumentException ("AD_Package_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Package_ID, Integer.valueOf(AD_Package_ID));
}
/** Get Package Name.
@return Package Name */
public int getAD_Package_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Package_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_Package_ID */
public static final String COLUMNNAME_AD_Package_ID = "AD_Package_ID";
/** Set Plugin.
@param AD_Plugin_ID Plugin */
public void setAD_Plugin_ID (int AD_Plugin_ID)
{
if (AD_Plugin_ID < 1) throw new IllegalArgumentException ("AD_Plugin_ID is mandatory.");
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

@XendraTrl(Identifier="18353065-b0d8-40b1-962e-31f2855fd57b")
public static String es_PE_COLUMN_AD_Plugin_ID_Name="Plugin";

@XendraColumn(AD_Element_ID="895f0c3e-fa52-48b7-8fce-f9b2dc637774",ColumnName="AD_Plugin_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="18353065-b0d8-40b1-962e-31f2855fd57b",
Synchronized="2020-02-24 09:18:38.0")
/** Column name AD_Plugin_ID */
public static final String COLUMNNAME_AD_Plugin_ID = "AD_Plugin_ID";
/** Set Identifier.
@param Identifier Identifier */
public void setIdentifier (String Identifier)
{
if (Identifier != null && Identifier.length() > 37)
{
log.warning("Length > 37 - truncated");
Identifier = Identifier.substring(0,36);
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
@XendraTrl(Identifier="551df135-299d-4c1e-8d9b-dcdbdee9e29a")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=37,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="551df135-299d-4c1e-8d9b-dcdbdee9e29a",
Synchronized="2020-02-24 09:18:39.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
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
return new KeyNamePair(get_ID(), String.valueOf(getName()));
}

@XendraTrl(Identifier="ded731ae-6cfd-4188-b575-844dd731f575")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ded731ae-6cfd-4188-b575-844dd731f575",
Synchronized="2020-02-24 09:18:39.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
