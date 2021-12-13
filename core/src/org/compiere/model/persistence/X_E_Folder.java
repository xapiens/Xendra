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
/** Generated Model for E_Folder
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_E_Folder extends PO
{
/** Standard Constructor
@param ctx context
@param E_Folder_ID id
@param trxName transaction
*/
public X_E_Folder (Properties ctx, int E_Folder_ID, String trxName)
{
super (ctx, E_Folder_ID, trxName);
/** if (E_Folder_ID == 0)
{
setE_Folder_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_E_Folder (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000297 */
public static int Table_ID=MTable.getTable_ID("E_Folder");

@XendraTrl(Identifier="059ef79a-580d-4328-aa7b-c56d42cfa9cd")
public static String es_PE_TABLE_E_Folder_Name="E_Folder";

@XendraTable(Name="E_Folder",AD_Package_ID="5a4baeee-43d7-eba9-9b5a-4ab05cfda2bd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="E_Folder",
AccessLevel="6",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=false,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.communication",Identifier="059ef79a-580d-4328-aa7b-c56d42cfa9cd",
Synchronized="2020-03-03 21:37:47.0")
/** TableName=E_Folder */
public static final String Table_Name="E_Folder";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"E_Folder");

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
    Table_ID = MTable.getTable_ID("E_Folder");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_E_Folder[").append(get_ID()).append("]");
return sb.toString();
}
/** Set User/Contact.
@param AD_User_ID User within the system - Internal or Business Partner Contact */
public void setAD_User_ID (int AD_User_ID)
{
if (AD_User_ID <= 0) set_Value (COLUMNNAME_AD_User_ID, null);
 else 
set_Value (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
}
/** Get User/Contact.
@return User within the system - Internal or Business Partner Contact */
public int getAD_User_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2038f2ac-c9a0-4cf9-a68a-83e4c129eb08")
public static String es_PE_COLUMN_AD_User_ID_Name="User/Contact";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2038f2ac-c9a0-4cf9-a68a-83e4c129eb08",
Synchronized="2019-08-30 22:22:24.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set E_Folder_ID.
@param E_Folder_ID E_Folder_ID */
public void setE_Folder_ID (int E_Folder_ID)
{
if (E_Folder_ID < 1) throw new IllegalArgumentException ("E_Folder_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_E_Folder_ID, Integer.valueOf(E_Folder_ID));
}
/** Get E_Folder_ID.
@return E_Folder_ID */
public int getE_Folder_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_E_Folder_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name E_Folder_ID */
public static final String COLUMNNAME_E_Folder_ID = "E_Folder_ID";
/** Set FolderType.
@param FolderType FolderType */
public void setFolderType (String FolderType)
{
if (FolderType != null && FolderType.length() > 20)
{
log.warning("Length > 20 - truncated");
FolderType = FolderType.substring(0,19);
}
set_Value (COLUMNNAME_FolderType, FolderType);
}
/** Get FolderType.
@return FolderType */
public String getFolderType() 
{
String value = (String)get_Value(COLUMNNAME_FolderType);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="723a60a5-d7e5-4659-9233-e544dd0d64c3")
public static String es_PE_COLUMN_FolderType_Name="FolderType";

@XendraColumn(AD_Element_ID="1af1ee60-3672-4cfb-95a1-2a0ace8704c3",ColumnName="FolderType",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="723a60a5-d7e5-4659-9233-e544dd0d64c3",
Synchronized="2019-08-30 22:22:24.0")
/** Column name FolderType */
public static final String COLUMNNAME_FolderType = "FolderType";
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
@XendraTrl(Identifier="8fd162fa-ff5f-4855-96c2-c80006ca298a")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8fd162fa-ff5f-4855-96c2-c80006ca298a",
Synchronized="2019-08-30 22:22:24.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set IsSpam.
@param IsSpam IsSpam */
public void setIsSpam (boolean IsSpam)
{
set_Value (COLUMNNAME_IsSpam, Boolean.valueOf(IsSpam));
}
/** Get IsSpam.
@return IsSpam */
public boolean isSpam() 
{
Object oo = get_Value(COLUMNNAME_IsSpam);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="10a7afd6-edc2-4871-9a66-a579ad5c764b")
public static String es_PE_COLUMN_IsSpam_Name="IsSpam";

@XendraColumn(AD_Element_ID="62f9cad0-5656-4041-a9d5-6e3e7c084dda",ColumnName="IsSpam",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="10a7afd6-edc2-4871-9a66-a579ad5c764b",
Synchronized="2019-08-30 22:22:24.0")
/** Column name IsSpam */
public static final String COLUMNNAME_IsSpam = "IsSpam";
/** Set IsSpecial.
@param IsSpecial IsSpecial */
public void setIsSpecial (boolean IsSpecial)
{
set_Value (COLUMNNAME_IsSpecial, Boolean.valueOf(IsSpecial));
}
/** Get IsSpecial.
@return IsSpecial */
public boolean isSpecial() 
{
Object oo = get_Value(COLUMNNAME_IsSpecial);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="9d14e9ea-8e47-4b61-a9be-0e4352658b8d")
public static String es_PE_COLUMN_IsSpecial_Name="IsSpecial";

@XendraColumn(AD_Element_ID="72b9a803-04ad-4265-9c79-c985309f65df",ColumnName="IsSpecial",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9d14e9ea-8e47-4b61-a9be-0e4352658b8d",
Synchronized="2019-08-30 22:22:24.0")
/** Column name IsSpecial */
public static final String COLUMNNAME_IsSpecial = "IsSpecial";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name != null && Name.length() > 30)
{
log.warning("Length > 30 - truncated");
Name = Name.substring(0,29);
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
@XendraTrl(Identifier="c4cde8c7-e746-4d75-975a-5a339172c70b")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c4cde8c7-e746-4d75-975a-5a339172c70b",
Synchronized="2019-08-30 22:22:24.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value != null && Value.length() > 40)
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
@XendraTrl(Identifier="65995b88-7612-4b42-8f7b-2fa1e366b718")
public static String es_PE_COLUMN_Value_Name="Search Key";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="65995b88-7612-4b42-8f7b-2fa1e366b718",
Synchronized="2019-08-30 22:22:24.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
