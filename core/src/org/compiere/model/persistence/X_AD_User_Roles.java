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
/** Generated Model for AD_User_Roles
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_User_Roles extends PO
{
/** Standard Constructor
@param ctx context
@param AD_User_Roles_ID id
@param trxName transaction
*/
public X_AD_User_Roles (Properties ctx, int AD_User_Roles_ID, String trxName)
{
super (ctx, AD_User_Roles_ID, trxName);
/** if (AD_User_Roles_ID == 0)
{
setAD_Role_ID (0);
setAD_User_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_User_Roles (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=157 */
public static int Table_ID=MTable.getTable_ID("AD_User_Roles");

@XendraTrl(Identifier="d442fea8-a736-4d45-1bb5-1d0fe52f225a")
public static String es_PE_TAB_UserRoles_Description="Roles de Usuario";

@XendraTrl(Identifier="d442fea8-a736-4d45-1bb5-1d0fe52f225a")
public static String es_PE_TAB_UserRoles_Help="La pestaña de roles de usuario define los roles que cada usuario pueden tener: Los roles determinarán las ventanas; tareas y procesos a los cuales cada usuario tendrá acceso.";

@XendraTrl(Identifier="d442fea8-a736-4d45-1bb5-1d0fe52f225a")
public static String es_PE_TAB_UserRoles_Name="Rol de Usuario";
@XendraTab(Name="User Roles",
Description="User Roles",
Help="The User Roles Tab define the Roles each user may have.  The Roles will determine what windows, tasks, processes and workflows that a User has access to.",
AD_Window_ID="9f3c1c3a-ab4f-0018-8a1e-b6cfbdbe8e7b",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="88a91455-fa25-0ec3-9749-af0d8ae778af",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="d442fea8-a736-4d45-1bb5-1d0fe52f225a",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_UserRoles="d442fea8-a736-4d45-1bb5-1d0fe52f225a";

@XendraTrl(Identifier="3085cedb-9a61-ecbb-f858-1589bba0c6f9")
public static String es_PE_TAB_UserAssignment_Description="Usuarios con este rol";

@XendraTrl(Identifier="3085cedb-9a61-ecbb-f858-1589bba0c6f9")
public static String es_PE_TAB_UserAssignment_Help="La pestaña de asignación de usuarios despliega usuarios que han sido definidos para este rol.";

@XendraTrl(Identifier="3085cedb-9a61-ecbb-f858-1589bba0c6f9")
public static String es_PE_TAB_UserAssignment_Name="Asignación de Usuario";

@XendraTab(Name="User Assignment",Description="Users with this Role",
Help="The User Assignment Tab displays Users who have been defined for this Role.",
AD_Window_ID="6341ac38-b536-eb1d-f7aa-89d20601b434",SeqNo=40,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="88c62271-d345-676b-afca-67bb2d6c88a9",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="3085cedb-9a61-ecbb-f858-1589bba0c6f9",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_UserAssignment="3085cedb-9a61-ecbb-f858-1589bba0c6f9";

@XendraTrl(Identifier="a4b2a9b1-de76-626e-569e-063bf94b3cbc")
public static String es_PE_TABLE_AD_User_Roles_Name="AD_User_Roles";

@XendraTable(Name="AD_User_Roles",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="AD_User_Roles",AccessLevel="6",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.dictionary",Identifier="a4b2a9b1-de76-626e-569e-063bf94b3cbc",
Synchronized="2020-03-03 21:36:06.0")
/** TableName=AD_User_Roles */
public static final String Table_Name="AD_User_Roles";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_User_Roles");

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
    Table_ID = MTable.getTable_ID("AD_User_Roles");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_User_Roles[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Role.
@param AD_Role_ID Responsibility Role */
public void setAD_Role_ID (int AD_Role_ID)
{
if (AD_Role_ID < 0) throw new IllegalArgumentException ("AD_Role_ID is mandatory.");
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

@XendraTrl(Identifier="b19d2a32-8a47-7df1-1713-5d71f67dfe4a")
public static String es_PE_FIELD_UserAssignment_Role_Name="Rol";

@XendraTrl(Identifier="b19d2a32-8a47-7df1-1713-5d71f67dfe4a")
public static String es_PE_FIELD_UserAssignment_Role_Description="Rol de responsabilidad";

@XendraTrl(Identifier="b19d2a32-8a47-7df1-1713-5d71f67dfe4a")
public static String es_PE_FIELD_UserAssignment_Role_Help="El Rol determina la seguridad y acceso del usuario que posee este Rol";

@XendraField(AD_Column_ID="AD_Role_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3085cedb-9a61-ecbb-f858-1589bba0c6f9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b19d2a32-8a47-7df1-1713-5d71f67dfe4a")
public static final String FIELDNAME_UserAssignment_Role="b19d2a32-8a47-7df1-1713-5d71f67dfe4a";

@XendraTrl(Identifier="64e4bf03-37b5-0c7c-3658-8a9e8461c988")
public static String es_PE_FIELD_UserRoles_Role_Name="Rol";

@XendraTrl(Identifier="64e4bf03-37b5-0c7c-3658-8a9e8461c988")
public static String es_PE_FIELD_UserRoles_Role_Description="Rol de responsabilidad";

@XendraTrl(Identifier="64e4bf03-37b5-0c7c-3658-8a9e8461c988")
public static String es_PE_FIELD_UserRoles_Role_Help="El Rol determina la seguridad y acceso del usuario que posee este Rol";

@XendraField(AD_Column_ID="AD_Role_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d442fea8-a736-4d45-1bb5-1d0fe52f225a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="64e4bf03-37b5-0c7c-3658-8a9e8461c988")
public static final String FIELDNAME_UserRoles_Role="64e4bf03-37b5-0c7c-3658-8a9e8461c988";

@XendraTrl(Identifier="88c62271-d345-676b-afca-67bb2d6c88a9")
public static String es_PE_COLUMN_AD_Role_ID_Name="Rol";

@XendraColumn(AD_Element_ID="08ffb725-ea75-e55f-f4c5-67ac26f40e2b",ColumnName="AD_Role_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="b2c9f8b9-88a4-f1f2-30b5-b397993306dd",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="88c62271-d345-676b-afca-67bb2d6c88a9",Synchronized="2019-08-30 22:20:49.0")
/** Column name AD_Role_ID */
public static final String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
/** Set User/Contact.
@param AD_User_ID User within the system - Internal or Business Partner Contact */
public void setAD_User_ID (int AD_User_ID)
{
if (AD_User_ID < 1) throw new IllegalArgumentException ("AD_User_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
}
/** Get User/Contact.
@return User within the system - Internal or Business Partner Contact */
public int getAD_User_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a268eb5c-78ae-40ee-bd13-c8a4f3b7d2f7")
public static String es_PE_FIELD_UserAssignment_UserContact_Name="Usuario";

@XendraTrl(Identifier="a268eb5c-78ae-40ee-bd13-c8a4f3b7d2f7")
public static String es_PE_FIELD_UserAssignment_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="a268eb5c-78ae-40ee-bd13-c8a4f3b7d2f7")
public static String es_PE_FIELD_UserAssignment_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3085cedb-9a61-ecbb-f858-1589bba0c6f9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a268eb5c-78ae-40ee-bd13-c8a4f3b7d2f7")
public static final String FIELDNAME_UserAssignment_UserContact="a268eb5c-78ae-40ee-bd13-c8a4f3b7d2f7";

@XendraTrl(Identifier="f706c0d0-d2f8-c2ba-6000-b1365ee9773d")
public static String es_PE_FIELD_UserRoles_UserContact_Name="Usuario";

@XendraTrl(Identifier="f706c0d0-d2f8-c2ba-6000-b1365ee9773d")
public static String es_PE_FIELD_UserRoles_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="f706c0d0-d2f8-c2ba-6000-b1365ee9773d")
public static String es_PE_FIELD_UserRoles_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d442fea8-a736-4d45-1bb5-1d0fe52f225a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f706c0d0-d2f8-c2ba-6000-b1365ee9773d")
public static final String FIELDNAME_UserRoles_UserContact="f706c0d0-d2f8-c2ba-6000-b1365ee9773d";

@XendraTrl(Identifier="88a91455-fa25-0ec3-9749-af0d8ae778af")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="88a91455-fa25-0ec3-9749-af0d8ae778af",
Synchronized="2019-08-30 22:20:49.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
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
@XendraTrl(Identifier="641f057b-911e-4753-84c7-0324366c19fb")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="641f057b-911e-4753-84c7-0324366c19fb",
Synchronized="2019-08-30 22:20:49.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
}
