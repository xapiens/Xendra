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
/** Generated Model for AD_RelationType
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_RelationType extends PO
{
/** Standard Constructor
@param ctx context
@param AD_RelationType_ID id
@param trxName transaction
*/
public X_AD_RelationType (Properties ctx, int AD_RelationType_ID, String trxName)
{
super (ctx, AD_RelationType_ID, trxName);
/** if (AD_RelationType_ID == 0)
{
setAD_RelationType_ID (0);
setIsDirected (false);	
// N
setName (null);
setType (null);	
// I
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_RelationType (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000122 */
public static int Table_ID=MTable.getTable_ID("AD_RelationType");

@XendraTrl(Identifier="dba548fa-7623-19e5-df42-8cf3e995ef62")
public static String es_PE_TABLE_AD_RelationType_Name="RelationType";

@XendraTable(Name="RelationType",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="AD_RelationType",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=120,
IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.dictionary",Identifier="dba548fa-7623-19e5-df42-8cf3e995ef62",
Synchronized="2020-03-03 21:35:51.0")
/** TableName=AD_RelationType */
public static final String Table_Name="AD_RelationType";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_RelationType");

protected BigDecimal accessLevel = BigDecimal.valueOf(3);
/** AccessLevel
@return 3 - Client - Org 
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
    Table_ID = MTable.getTable_ID("AD_RelationType");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_RelationType[").append(get_ID()).append("]");
return sb.toString();
}
/** Set AD_Reference_Source_ID.
@param AD_Reference_Source_ID AD_Reference_Source_ID */
public void setAD_Reference_Source_ID (int AD_Reference_Source_ID)
{
if (AD_Reference_Source_ID <= 0) set_Value (COLUMNNAME_AD_Reference_Source_ID, null);
 else 
set_Value (COLUMNNAME_AD_Reference_Source_ID, Integer.valueOf(AD_Reference_Source_ID));
}
/** Get AD_Reference_Source_ID.
@return AD_Reference_Source_ID */
public int getAD_Reference_Source_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Reference_Source_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fa023355-8359-7001-6c4c-14d62e3b1e0a")
public static String es_PE_COLUMN_AD_Reference_Source_ID_Name="ad_reference_source_id";

@XendraColumn(AD_Element_ID="4662b185-bca6-b5d6-da9d-ea0ebb88582c",
ColumnName="AD_Reference_Source_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="12253474-e61c-58a4-3fd3-2c2ccf236272",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="fa023355-8359-7001-6c4c-14d62e3b1e0a",
Synchronized="2019-08-30 22:20:37.0")
/** Column name AD_Reference_Source_ID */
public static final String COLUMNNAME_AD_Reference_Source_ID = "AD_Reference_Source_ID";
/** Set AD_Reference_Target_ID.
@param AD_Reference_Target_ID AD_Reference_Target_ID */
public void setAD_Reference_Target_ID (int AD_Reference_Target_ID)
{
if (AD_Reference_Target_ID <= 0) set_Value (COLUMNNAME_AD_Reference_Target_ID, null);
 else 
set_Value (COLUMNNAME_AD_Reference_Target_ID, Integer.valueOf(AD_Reference_Target_ID));
}
/** Get AD_Reference_Target_ID.
@return AD_Reference_Target_ID */
public int getAD_Reference_Target_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Reference_Target_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f32b0ea5-49cb-1ad6-3f84-c14c765fd7c2")
public static String es_PE_COLUMN_AD_Reference_Target_ID_Name="ad_reference_target_id";

@XendraColumn(AD_Element_ID="e7e2d90a-e456-15da-bbcb-80365466895b",
ColumnName="AD_Reference_Target_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="12253474-e61c-58a4-3fd3-2c2ccf236272",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="f32b0ea5-49cb-1ad6-3f84-c14c765fd7c2",
Synchronized="2019-08-30 22:20:37.0")
/** Column name AD_Reference_Target_ID */
public static final String COLUMNNAME_AD_Reference_Target_ID = "AD_Reference_Target_ID";
/** Set RelationType.
@param AD_RelationType_ID RelationType */
public void setAD_RelationType_ID (int AD_RelationType_ID)
{
if (AD_RelationType_ID < 1) throw new IllegalArgumentException ("AD_RelationType_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_RelationType_ID, Integer.valueOf(AD_RelationType_ID));
}
/** Get RelationType.
@return RelationType */
public int getAD_RelationType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_RelationType_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_RelationType_ID */
public static final String COLUMNNAME_AD_RelationType_ID = "AD_RelationType_ID";
/** Set Table.
@param AD_Table_ID Database Table information */
public void setAD_Table_ID (int AD_Table_ID)
{
if (AD_Table_ID <= 0) set_Value (COLUMNNAME_AD_Table_ID, null);
 else 
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

@XendraTrl(Identifier="3a1fea54-0847-515b-9ec7-ffe7602679f1")
public static String es_PE_COLUMN_AD_Table_ID_Name="Table";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3a1fea54-0847-515b-9ec7-ffe7602679f1",
Synchronized="2019-08-30 22:20:37.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
/** Set Description.
@param Description Optional short DESCRIPTION of the record */
public void setDescription (String Description)
{
if (Description != null && Description.length() > 255)
{
log.warning("Length > 255 - truncated");
Description = Description.substring(0,254);
}
set_Value (COLUMNNAME_Description, Description);
}
/** Get Description.
@return Optional short DESCRIPTION of the record */
public String getDescription() 
{
String value = (String)get_Value(COLUMNNAME_Description);
if (value == null)
  return "";
if (value.contains("\""))
  value = value.replaceAll("\"","'");
if (value.contains("\n"))
  value = value.replaceAll("\n"," ");
if (value.contains(";"))
  value = value.replaceAll(";",":");
return value;
}

@XendraTrl(Identifier="6996f547-e336-ddd2-d7a7-f1bc369a5797")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6996f547-e336-ddd2-d7a7-f1bc369a5797",
Synchronized="2019-08-30 22:20:37.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
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
@XendraTrl(Identifier="4ed17a63-80f1-4143-95a5-a8bbd62e638d")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4ed17a63-80f1-4143-95a5-a8bbd62e638d",
Synchronized="2019-08-30 22:20:37.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set IsDirected.
@param IsDirected IsDirected */
public void setIsDirected (boolean IsDirected)
{
set_Value (COLUMNNAME_IsDirected, Boolean.valueOf(IsDirected));
}
/** Get IsDirected.
@return IsDirected */
public boolean isDirected() 
{
Object oo = get_Value(COLUMNNAME_IsDirected);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="a82d210f-1662-0d19-de03-4b6e72bd1d1b")
public static String es_PE_COLUMN_IsDirected_Name="isdirected";

@XendraColumn(AD_Element_ID="7bbb8946-abb9-e9b2-3f24-0f015375a41d",ColumnName="IsDirected",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a82d210f-1662-0d19-de03-4b6e72bd1d1b",
Synchronized="2019-08-30 22:20:37.0")
/** Column name IsDirected */
public static final String COLUMNNAME_IsDirected = "IsDirected";
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

@XendraTrl(Identifier="503d8597-f64b-0e3a-77a4-40a578d492ab")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="503d8597-f64b-0e3a-77a4-40a578d492ab",
Synchronized="2019-08-30 22:20:37.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Role_Source.
@param Role_Source Role_Source */
public void setRole_Source (String Role_Source)
{
if (Role_Source != null && Role_Source.length() > 50)
{
log.warning("Length > 50 - truncated");
Role_Source = Role_Source.substring(0,49);
}
set_Value (COLUMNNAME_Role_Source, Role_Source);
}
/** Get Role_Source.
@return Role_Source */
public String getRole_Source() 
{
return (String)get_Value(COLUMNNAME_Role_Source);
}

@XendraTrl(Identifier="ea27aa65-2a46-7699-d431-7f1879360a61")
public static String es_PE_COLUMN_Role_Source_Name="role_source";

@XendraColumn(AD_Element_ID="3f811219-6b10-d114-2b28-77ac9039e0c4",ColumnName="Role_Source",
AD_Reference_ID=17,AD_Reference_Value_ID="9be2af4f-0f91-a3dd-c472-4f14d05e5d5b",AD_Val_Rule_ID="",
FieldLength=50,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ea27aa65-2a46-7699-d431-7f1879360a61",Synchronized="2019-08-30 22:20:37.0")
/** Column name Role_Source */
public static final String COLUMNNAME_Role_Source = "Role_Source";
/** Set Role_Target.
@param Role_Target Role_Target */
public void setRole_Target (String Role_Target)
{
if (Role_Target != null && Role_Target.length() > 50)
{
log.warning("Length > 50 - truncated");
Role_Target = Role_Target.substring(0,49);
}
set_Value (COLUMNNAME_Role_Target, Role_Target);
}
/** Get Role_Target.
@return Role_Target */
public String getRole_Target() 
{
return (String)get_Value(COLUMNNAME_Role_Target);
}

@XendraTrl(Identifier="66578707-6d0c-8d8f-c389-a5bfea2edf68")
public static String es_PE_COLUMN_Role_Target_Name="role_target";

@XendraColumn(AD_Element_ID="b693ba36-c03e-1dc7-226a-df359864b0f1",ColumnName="Role_Target",
AD_Reference_ID=17,AD_Reference_Value_ID="9be2af4f-0f91-a3dd-c472-4f14d05e5d5b",AD_Val_Rule_ID="",
FieldLength=50,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="66578707-6d0c-8d8f-c389-a5bfea2edf68",Synchronized="2019-08-30 22:20:38.0")
/** Column name Role_Target */
public static final String COLUMNNAME_Role_Target = "Role_Target";
/** Set Type.
@param Type Type of Validation (SQL, Java Script, Java Language) */
public void setType (String Type)
{
if (Type.length() > 1)
{
log.warning("Length > 1 - truncated");
Type = Type.substring(0,0);
}
set_Value (COLUMNNAME_Type, Type);
}
/** Get Type.
@return Type of Validation (SQL, Java Script, Java Language) */
public String getType() 
{
return (String)get_Value(COLUMNNAME_Type);
}

@XendraTrl(Identifier="8c1a14be-2d4c-41ea-fb62-b1c53683612d")
public static String es_PE_COLUMN_Type_Name="Tipo";

@XendraColumn(AD_Element_ID="25f95bd2-be42-03fc-c8d2-a7103835133c",ColumnName="Type",
AD_Reference_ID=17,AD_Reference_Value_ID="c3039723-e720-0622-e649-ac2d944c0df9",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="I",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8c1a14be-2d4c-41ea-fb62-b1c53683612d",Synchronized="2019-08-30 22:20:38.0")
/** Column name Type */
public static final String COLUMNNAME_Type = "Type";
}
