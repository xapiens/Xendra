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
/** Generated Model for AD_RoleType
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_RoleType extends PO
{
/** Standard Constructor
@param ctx context
@param AD_RoleType_ID id
@param trxName transaction
*/
public X_AD_RoleType (Properties ctx, int AD_RoleType_ID, String trxName)
{
super (ctx, AD_RoleType_ID, trxName);
/** if (AD_RoleType_ID == 0)
{
setAD_RoleType_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_RoleType (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000416 */
public static int Table_ID=MTable.getTable_ID("AD_RoleType");

@XendraTrl(Identifier="ca82cd8f-39c2-47c3-bdba-11497fc15aa9")
public static String es_PE_TAB_RoleType_Description="Types of Roles";

@XendraTrl(Identifier="ca82cd8f-39c2-47c3-bdba-11497fc15aa9")
public static String es_PE_TAB_RoleType_Help="The Types of Roles";

@XendraTrl(Identifier="ca82cd8f-39c2-47c3-bdba-11497fc15aa9")
public static String es_PE_TAB_RoleType_Name="Role Type";
@XendraTab(Name="Role Type",
Description="Types of Roles",Help="The Types of Roles",
AD_Window_ID="6341ac38-b536-eb1d-f7aa-89d20601b434",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="56e9dec6-0821-4c28-b114-74b77a1ea813",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="ca82cd8f-39c2-47c3-bdba-11497fc15aa9",
Synchronized="2018-12-05 15:41:36.0")
public static final String TABNAME_RoleType="ca82cd8f-39c2-47c3-bdba-11497fc15aa9";

@XendraTrl(Identifier="e9d96f13-a14c-40c4-b00b-d4d17ecb6d11")
public static String es_PE_TABLE_AD_RoleType_Name="Role Type";

@XendraTable(Name="Role Type",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="AD_RoleType",
AccessLevel="7",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.dictionary",Identifier="e9d96f13-a14c-40c4-b00b-d4d17ecb6d11",
Synchronized="2020-03-03 21:35:53.0")
/** TableName=AD_RoleType */
public static final String Table_Name="AD_RoleType";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_RoleType");

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
    Table_ID = MTable.getTable_ID("AD_RoleType");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_RoleType[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Role.
@param AD_Role_ID Responsibility Role */
public void setAD_Role_ID (int AD_Role_ID)
{
if (AD_Role_ID <= 0) set_ValueNoCheck (COLUMNNAME_AD_Role_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_AD_Role_ID, Integer.valueOf(AD_Role_ID));
}
/** Get Role.
@return Responsibility Role */
public int getAD_Role_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Role_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9a1409be-9f20-475d-9ac2-3452cebada04")
public static String es_PE_FIELD_RoleType_Role_Name="Rol";

@XendraTrl(Identifier="9a1409be-9f20-475d-9ac2-3452cebada04")
public static String es_PE_FIELD_RoleType_Role_Description="Rol de responsabilidad";

@XendraTrl(Identifier="9a1409be-9f20-475d-9ac2-3452cebada04")
public static String es_PE_FIELD_RoleType_Role_Help="El Rol determina la seguridad y acceso del usuario que posee este Rol";

@XendraField(AD_Column_ID="AD_Role_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ca82cd8f-39c2-47c3-bdba-11497fc15aa9",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2018-12-05 18:54:31.0",
Identifier="9a1409be-9f20-475d-9ac2-3452cebada04")
public static final String FIELDNAME_RoleType_Role="9a1409be-9f20-475d-9ac2-3452cebada04";

@XendraTrl(Identifier="56e9dec6-0821-4c28-b114-74b77a1ea813")
public static String es_PE_COLUMN_AD_Role_ID_Name="Role";

@XendraColumn(AD_Element_ID="08ffb725-ea75-e55f-f4c5-67ac26f40e2b",ColumnName="AD_Role_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="56e9dec6-0821-4c28-b114-74b77a1ea813",
Synchronized="2019-08-30 22:20:39.0")
/** Column name AD_Role_ID */
public static final String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
/** Set Role Type.
@param AD_RoleType_ID Role Type */
public void setAD_RoleType_ID (int AD_RoleType_ID)
{
if (AD_RoleType_ID < 1) throw new IllegalArgumentException ("AD_RoleType_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_RoleType_ID, Integer.valueOf(AD_RoleType_ID));
}
/** Get Role Type.
@return Role Type */
public int getAD_RoleType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_RoleType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1f975b24-c6e5-4867-af54-72ec27f738b8")
public static String es_PE_FIELD_RoleType_RoleType_Name="Role Type";

@XendraField(AD_Column_ID="AD_RoleType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ca82cd8f-39c2-47c3-bdba-11497fc15aa9",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2018-12-05 18:54:31.0",
Identifier="1f975b24-c6e5-4867-af54-72ec27f738b8")
public static final String FIELDNAME_RoleType_RoleType="1f975b24-c6e5-4867-af54-72ec27f738b8";
/** Column name AD_RoleType_ID */
public static final String COLUMNNAME_AD_RoleType_ID = "AD_RoleType_ID";
/** Set BaseRole.
@param BaseRole BaseRole */
public void setBaseRole (String BaseRole)
{
if (BaseRole != null && BaseRole.length() > 3)
{
log.warning("Length > 3 - truncated");
BaseRole = BaseRole.substring(0,2);
}
set_Value (COLUMNNAME_BaseRole, BaseRole);
}
/** Get BaseRole.
@return BaseRole */
public String getBaseRole() 
{
return (String)get_Value(COLUMNNAME_BaseRole);
}

@XendraTrl(Identifier="04026093-7e84-435b-8d71-5ef64bf23fd0")
public static String es_PE_FIELD_RoleType_BaseRole_Name="baserole";

@XendraField(AD_Column_ID="BaseRole",IsCentrallyMaintained=true,
AD_Tab_ID="ca82cd8f-39c2-47c3-bdba-11497fc15aa9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=3,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2018-12-05 22:02:50.0",
Identifier="04026093-7e84-435b-8d71-5ef64bf23fd0")
public static final String FIELDNAME_RoleType_BaseRole="04026093-7e84-435b-8d71-5ef64bf23fd0";

@XendraTrl(Identifier="c08f889c-53e0-4371-a6fa-a59414213028")
public static String es_PE_COLUMN_BaseRole_Name="BaseRole";

@XendraColumn(AD_Element_ID="3e283513-3261-4962-8405-3d36793f3672",ColumnName="BaseRole",
AD_Reference_ID=17,AD_Reference_Value_ID="fc2ae4f4-a201-4dfd-834b-949971e56775",AD_Val_Rule_ID="",
FieldLength=3,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c08f889c-53e0-4371-a6fa-a59414213028",Synchronized="2019-08-30 22:20:39.0")
/** Column name BaseRole */
public static final String COLUMNNAME_BaseRole = "BaseRole";
}
