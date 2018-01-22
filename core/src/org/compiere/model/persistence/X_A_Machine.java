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
/** Generated Model for A_Machine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_A_Machine extends PO
{
/** Standard Constructor
@param ctx context
@param A_Machine_ID id
@param trxName transaction
*/
public X_A_Machine (Properties ctx, int A_Machine_ID, String trxName)
{
super (ctx, A_Machine_ID, trxName);
/** if (A_Machine_ID == 0)
{
setA_Machine_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_A_Machine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000306 */
public static int Table_ID=MTable.getTable_ID("A_Machine");

@XendraTrl(Identifier="63506e11-5a3e-493f-aae0-e519e1721221")
public static String es_PE_TABLE_A_Machine_Name="Machine ";

@XendraTable(Name="Machine ",Description="",Help="",TableName="A_Machine",AccessLevel="3",
AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,
IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="63506e11-5a3e-493f-aae0-e519e1721221",Synchronized="2017-10-19 16:20:58.0")
/** TableName=A_Machine */
public static final String Table_Name="A_Machine";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"A_Machine");

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
    Table_ID = MTable.getTable_ID("A_Machine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_A_Machine[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Machine .
@param A_Machine_ID Machine  */
public void setA_Machine_ID (int A_Machine_ID)
{
if (A_Machine_ID < 1) throw new IllegalArgumentException ("A_Machine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_A_Machine_ID, Integer.valueOf(A_Machine_ID));
}
/** Get Machine .
@return Machine  */
public int getA_Machine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_A_Machine_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name A_Machine_ID */
public static final String COLUMNNAME_A_Machine_ID = "A_Machine_ID";
/** Set Point of Purchase.
@param C_POP_ID Point of Purchase */
public void setC_POP_ID (int C_POP_ID)
{
if (C_POP_ID <= 0) set_Value (COLUMNNAME_C_POP_ID, null);
 else 
set_Value (COLUMNNAME_C_POP_ID, Integer.valueOf(C_POP_ID));
}
/** Get Point of Purchase.
@return Point of Purchase */
public int getC_POP_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_POP_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f1dcc473-f285-4aff-b66f-ba23012121cd")
public static String es_PE_COLUMN_C_POP_ID_Name="Point of Purchase";

@XendraColumn(AD_Element_ID="aeab4e94-a404-6b73-10c4-b133128c2853",ColumnName="C_POP_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f1dcc473-f285-4aff-b66f-ba23012121cd",
Synchronized="2017-08-28 09:55:04.0")
/** Column name C_POP_ID */
public static final String COLUMNNAME_C_POP_ID = "C_POP_ID";
/** Set POS Terminal.
@param C_POS_ID Point of Sales Terminal */
public void setC_POS_ID (int C_POS_ID)
{
if (C_POS_ID <= 0) set_Value (COLUMNNAME_C_POS_ID, null);
 else 
set_Value (COLUMNNAME_C_POS_ID, Integer.valueOf(C_POS_ID));
}
/** Get POS Terminal.
@return Point of Sales Terminal */
public int getC_POS_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_POS_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4f4034ad-7742-4844-bcc3-b8460c278f4f")
public static String es_PE_COLUMN_C_POS_ID_Name="POS Terminal";

@XendraColumn(AD_Element_ID="c2adeeab-8099-b658-0016-5d97a32be4a2",ColumnName="C_POS_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4f4034ad-7742-4844-bcc3-b8460c278f4f",
Synchronized="2017-08-28 09:55:04.0")
/** Column name C_POS_ID */
public static final String COLUMNNAME_C_POS_ID = "C_POS_ID";
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

@XendraTrl(Identifier="73355e37-4e67-451f-a0cd-7d44b6acb9bd")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="73355e37-4e67-451f-a0cd-7d44b6acb9bd",
Synchronized="2017-08-28 09:55:04.0")
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
@XendraTrl(Identifier="8821f039-8d92-4c0a-b96e-e4b54ddace02")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8821f039-8d92-4c0a-b96e-e4b54ddace02",
Synchronized="2017-08-28 09:55:04.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set IsServerMessage.
@param IsServerMessage IsServerMessage */
public void setIsServerMessage (boolean IsServerMessage)
{
set_Value (COLUMNNAME_IsServerMessage, Boolean.valueOf(IsServerMessage));
}
/** Get IsServerMessage.
@return IsServerMessage */
public boolean isServerMessage() 
{
Object oo = get_Value(COLUMNNAME_IsServerMessage);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="9451816d-c9ee-44c1-a519-afda930198d9")
public static String es_PE_COLUMN_IsServerMessage_Name="isservermessage";

@XendraColumn(AD_Element_ID="4d2df3ea-5560-41ad-bce7-da7703de1052",ColumnName="IsServerMessage",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9451816d-c9ee-44c1-a519-afda930198d9",
Synchronized="2017-08-28 09:55:04.0")
/** Column name IsServerMessage */
public static final String COLUMNNAME_IsServerMessage = "IsServerMessage";
/** Set IsServerWeb.
@param IsServerWeb IsServerWeb */
public void setIsServerWeb (boolean IsServerWeb)
{
set_Value (COLUMNNAME_IsServerWeb, Boolean.valueOf(IsServerWeb));
}
/** Get IsServerWeb.
@return IsServerWeb */
public boolean isServerWeb() 
{
Object oo = get_Value(COLUMNNAME_IsServerWeb);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="38b5a16d-e151-40bd-b513-eff1a0dd6155")
public static String es_PE_COLUMN_IsServerWeb_Name="isserverweb";

@XendraColumn(AD_Element_ID="7366e326-db84-4005-a0ec-33b1b0381e11",ColumnName="IsServerWeb",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="38b5a16d-e151-40bd-b513-eff1a0dd6155",
Synchronized="2017-08-28 09:55:04.0")
/** Column name IsServerWeb */
public static final String COLUMNNAME_IsServerWeb = "IsServerWeb";
/** Set Lockout.
@param Lockout Lockout */
public void setLockout (boolean Lockout)
{
set_Value (COLUMNNAME_Lockout, Boolean.valueOf(Lockout));
}
/** Get Lockout.
@return Lockout */
public boolean isLockout() 
{
Object oo = get_Value(COLUMNNAME_Lockout);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="4e42f17f-2c87-4f7d-8ab3-926fa3340191")
public static String es_PE_COLUMN_Lockout_Name="Lockout";

@XendraColumn(AD_Element_ID="63f75f32-a2eb-4522-a988-6c753105407e",ColumnName="Lockout",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4e42f17f-2c87-4f7d-8ab3-926fa3340191",
Synchronized="2017-10-19 16:19:06.0")
/** Column name Lockout */
public static final String COLUMNNAME_Lockout = "Lockout";
/** Set Mac_Address.
@param Mac_Address Mac_Address */
public void setMac_Address (String Mac_Address)
{
if (Mac_Address != null && Mac_Address.length() > 20)
{
log.warning("Length > 20 - truncated");
Mac_Address = Mac_Address.substring(0,19);
}
set_Value (COLUMNNAME_Mac_Address, Mac_Address);
}
/** Get Mac_Address.
@return Mac_Address */
public String getMac_Address() 
{
String value = (String)get_Value(COLUMNNAME_Mac_Address);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="51720a0c-957d-4ea0-b548-2399f196c10c")
public static String es_PE_COLUMN_Mac_Address_Name="mac_address";

@XendraColumn(AD_Element_ID="b9943122-5ec5-43ab-be71-9edd40c23c6b",ColumnName="Mac_Address",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="51720a0c-957d-4ea0-b548-2399f196c10c",
Synchronized="2017-08-28 09:55:04.0")
/** Column name Mac_Address */
public static final String COLUMNNAME_Mac_Address = "Mac_Address";
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

@XendraTrl(Identifier="7af6119c-847a-4c28-b147-69070989f672")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7af6119c-847a-4c28-b147-69070989f672",
Synchronized="2017-08-28 09:55:04.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Properties.
@param Properties Properties */
public void setProperties (HashMap Properties)
{
set_Value (COLUMNNAME_Properties, Properties);
}
/** Get Properties.
@return Properties */
public HashMap getProperties() 
{
HashMap propsrc = (HashMap)get_Value(COLUMNNAME_Properties);
if (propsrc == null) return new HashMap();
 HashMap propdst = (HashMap) propsrc.clone();
return propdst;
}

@XendraTrl(Identifier="50482cae-d2ce-4c4a-8ddb-4a904b37264c")
public static String es_PE_COLUMN_Properties_Name="Properties";

@XendraColumn(AD_Element_ID="acc3987b-292c-475a-86b5-5104970a96f3",ColumnName="Properties",
AD_Reference_ID=46,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="50482cae-d2ce-4c4a-8ddb-4a904b37264c",
Synchronized="2017-08-28 09:55:04.0")
/** Column name Properties */
public static final String COLUMNNAME_Properties = "Properties";
}
