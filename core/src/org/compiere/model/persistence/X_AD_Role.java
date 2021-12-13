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
/** Generated Model for AD_Role
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Role extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Role_ID id
@param trxName transaction
*/
public X_AD_Role (Properties ctx, int AD_Role_ID, String trxName)
{
super (ctx, AD_Role_ID, trxName);
/** if (AD_Role_ID == 0)
{
setAD_Role_ID (0);
setConfirmQueryRecords (0);	
// 0
setIsAccessAllOrgs (false);	
// N
setIsCanApproveOwnDoc (false);	
// N
setIsCanExport (true);	
// Y
setIsCanReport (true);	
// Y
setIsChangeLog (false);	
// N
setIsManual (false);	
// N
setIsPersonalAccess (false);	
// N
setIsPersonalLock (false);	
// N
setIsShowAcct (false);	
// N
setIsUseUserOrgAccess (false);	
// N
setMaxQueryRecords (0);	
// 0
setName (null);
setOverwritePriceLimit (false);	
// N
setPreferenceType (null);	
// O
setUserLevel (null);	
// O
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Role (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=156 */
public static int Table_ID=MTable.getTable_ID("AD_Role");

@XendraTrl(Identifier="bb74c0c5-65c7-e59d-110d-ef40c54c72fd")
public static String es_PE_TAB_Role_Description="Rol con restricción de acceso a datos";

@XendraTrl(Identifier="bb74c0c5-65c7-e59d-110d-ef40c54c72fd")
public static String es_PE_TAB_Role_Help="Selecciona un rol con su restricción de acceso a datos";

@XendraTrl(Identifier="bb74c0c5-65c7-e59d-110d-ef40c54c72fd")
public static String es_PE_TAB_Role_Name="Rol";
@XendraTab(Name="Role",
Description="Role with Data Access Restriction",
Help="Select Role for with Data Access Restrictions. Note that access information is cached and requires re-login or reset of cache.",
AD_Window_ID="c927d42d-2145-4004-dbd3-51f85f9cab5e",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="bb74c0c5-65c7-e59d-110d-ef40c54c72fd",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Role="bb74c0c5-65c7-e59d-110d-ef40c54c72fd";

@XendraTrl(Identifier="c7b6e4ec-ddc3-5029-e929-f9f0b0526479")
public static String es_PE_TAB_Role2_Description="Definir roles de responsabilidad";

@XendraTrl(Identifier="c7b6e4ec-ddc3-5029-e929-f9f0b0526479")
public static String es_PE_TAB_Role2_Help="Define el rol y adiciona la compañía y organizaciones a las cuales el rol tiene acceso. Es posible asignar usuarios acceso a este rol para que tengan acceso a las diferentes ventanas; procesos y tareas.";

@XendraTrl(Identifier="c7b6e4ec-ddc3-5029-e929-f9f0b0526479")
public static String es_PE_TAB_Role2_Name="Rol";
@XendraTab(Name="Role",
Description="Define responsibility roles",
Help="Define the role and add the client and organizations the role has access to. You can give users access to this role and modify the access of this role to windows, forms, processes and reports as well as tasks. <br> If the Role User Level is Manual, the assigned acces rights are not automatically updated (e.g. if a role has a restricted number of Windows/Processes it can access). You need to add organizational access unless the role has access to all organizations. The SuperUser and the user creating a new role are assigned to the role automatically.  <br> If you select an Organization Tree, the user has access to the leaves of  summary organizations. Note: You cannot change the System Administrator role.",
AD_Window_ID="6341ac38-b536-eb1d-f7aa-89d20601b434",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Role2="c7b6e4ec-ddc3-5029-e929-f9f0b0526479";

@XendraTrl(Identifier="9a8f58eb-aa24-376b-ee81-4b7d9b8da213")
public static String es_PE_TABLE_AD_Role_Name="Rol";

@XendraTable(Name="Role",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Responsibility Role",Help="",
TableName="AD_Role",AccessLevel="6",AD_Window_ID="6341ac38-b536-eb1d-f7aa-89d20601b434",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=115,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="9a8f58eb-aa24-376b-ee81-4b7d9b8da213",Synchronized="2020-03-03 21:35:53.0")
/** TableName=AD_Role */
public static final String Table_Name="AD_Role";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Role");

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
    Table_ID = MTable.getTable_ID("AD_Role");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Role[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="627abb75-dad8-8975-db97-567a31ab7e78")
public static String es_PE_FIELD_Role_Role_Name="Rol";

@XendraTrl(Identifier="627abb75-dad8-8975-db97-567a31ab7e78")
public static String es_PE_FIELD_Role_Role_Description="Rol de responsabilidad";

@XendraTrl(Identifier="627abb75-dad8-8975-db97-567a31ab7e78")
public static String es_PE_FIELD_Role_Role_Help="El Rol determina la seguridad y acceso del usuario que posee este Rol";

@XendraField(AD_Column_ID="AD_Role_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="627abb75-dad8-8975-db97-567a31ab7e78")
public static final String FIELDNAME_Role_Role="627abb75-dad8-8975-db97-567a31ab7e78";

@XendraTrl(Identifier="770a31f3-e773-c806-54ff-c2efff69b5e3")
public static String es_PE_FIELD_Role_Role2_Name="Rol";

@XendraTrl(Identifier="770a31f3-e773-c806-54ff-c2efff69b5e3")
public static String es_PE_FIELD_Role_Role2_Description="Rol de responsabilidad";

@XendraTrl(Identifier="770a31f3-e773-c806-54ff-c2efff69b5e3")
public static String es_PE_FIELD_Role_Role2_Help="El Rol determina la seguridad y acceso del usuario que posee este Rol";

@XendraField(AD_Column_ID="AD_Role_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bb74c0c5-65c7-e59d-110d-ef40c54c72fd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="770a31f3-e773-c806-54ff-c2efff69b5e3")
public static final String FIELDNAME_Role_Role2="770a31f3-e773-c806-54ff-c2efff69b5e3";
/** Column name AD_Role_ID */
public static final String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
/** Set Menu Tree.
@param AD_Tree_Menu_ID Tree of the menu */
public void setAD_Tree_Menu_ID (int AD_Tree_Menu_ID)
{
if (AD_Tree_Menu_ID <= 0) set_Value (COLUMNNAME_AD_Tree_Menu_ID, null);
 else 
set_Value (COLUMNNAME_AD_Tree_Menu_ID, Integer.valueOf(AD_Tree_Menu_ID));
}
/** Get Menu Tree.
@return Tree of the menu */
public int getAD_Tree_Menu_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Tree_Menu_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="497c97ff-f3df-7cfe-ce80-49dcf9eb7523")
public static String es_PE_FIELD_Role_MenuTree_Name="Árbol Primario de Menú";

@XendraField(AD_Column_ID="AD_Tree_Menu_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="Access",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="497c97ff-f3df-7cfe-ce80-49dcf9eb7523")
public static final String FIELDNAME_Role_MenuTree="497c97ff-f3df-7cfe-ce80-49dcf9eb7523";

@XendraTrl(Identifier="3b639d1c-503c-1894-f6b1-1bb429024788")
public static String es_PE_FIELD_Role_MenuTree2_Name="Árbol Primario de Menú";

@XendraField(AD_Column_ID="AD_Tree_Menu_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bb74c0c5-65c7-e59d-110d-ef40c54c72fd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3b639d1c-503c-1894-f6b1-1bb429024788")
public static final String FIELDNAME_Role_MenuTree2="3b639d1c-503c-1894-f6b1-1bb429024788";

@XendraTrl(Identifier="c3bd066f-4a6f-b148-7507-f15dc1d8f017")
public static String es_PE_COLUMN_AD_Tree_Menu_ID_Name="Árbol Primario de Menú";

@XendraColumn(AD_Element_ID="dff25c2f-33f3-db6c-cbdc-0000bad282f1",ColumnName="AD_Tree_Menu_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="79a8ec82-b2c4-01ef-3d8c-2a2a8d8a2952",
AD_Val_Rule_ID="dc8487ba-28fc-411e-cb04-cda616151762",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c3bd066f-4a6f-b148-7507-f15dc1d8f017",
Synchronized="2019-08-30 22:20:38.0")
/** Column name AD_Tree_Menu_ID */
public static final String COLUMNNAME_AD_Tree_Menu_ID = "AD_Tree_Menu_ID";
/** Set Organization Tree.
@param AD_Tree_Org_ID Tree to determine organizational hierarchy */
public void setAD_Tree_Org_ID (int AD_Tree_Org_ID)
{
if (AD_Tree_Org_ID <= 0) set_Value (COLUMNNAME_AD_Tree_Org_ID, null);
 else 
set_Value (COLUMNNAME_AD_Tree_Org_ID, Integer.valueOf(AD_Tree_Org_ID));
}
/** Get Organization Tree.
@return Tree to determine organizational hierarchy */
public int getAD_Tree_Org_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Tree_Org_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="73296485-ae2f-e665-e9f6-7dd9118dbdae")
public static String es_PE_FIELD_Role_OrganizationTree_Name="Árbol Primario de Organización";

@XendraField(AD_Column_ID="AD_Tree_Org_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsAccessAllOrgs@=N",DisplayLength=14,IsReadOnly=false,SeqNo=190,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="73296485-ae2f-e665-e9f6-7dd9118dbdae")
public static final String FIELDNAME_Role_OrganizationTree="73296485-ae2f-e665-e9f6-7dd9118dbdae";

@XendraTrl(Identifier="8ccd995e-156f-bfa3-a312-9b2bdaf468a8")
public static String es_PE_FIELD_Role_OrganizationTree2_Name="Árbol Primario de Organización";

@XendraField(AD_Column_ID="AD_Tree_Org_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bb74c0c5-65c7-e59d-110d-ef40c54c72fd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8ccd995e-156f-bfa3-a312-9b2bdaf468a8")
public static final String FIELDNAME_Role_OrganizationTree2="8ccd995e-156f-bfa3-a312-9b2bdaf468a8";

@XendraTrl(Identifier="e7617f77-aabe-6526-b85b-6a4c91a84314")
public static String es_PE_COLUMN_AD_Tree_Org_ID_Name="Árbol Primario de Organización";

@XendraColumn(AD_Element_ID="ece986ac-8411-7f5a-662f-34ed42e25cc6",ColumnName="AD_Tree_Org_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="79a8ec82-b2c4-01ef-3d8c-2a2a8d8a2952",
AD_Val_Rule_ID="0d0fbf0f-d08c-51a5-6ab9-692a6550b14d",FieldLength=10,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e7617f77-aabe-6526-b85b-6a4c91a84314",
Synchronized="2019-08-30 22:20:38.0")
/** Column name AD_Tree_Org_ID */
public static final String COLUMNNAME_AD_Tree_Org_ID = "AD_Tree_Org_ID";
/** Set Allow Info Account.
@param Allow_Info_Account Allow Info Account */
public void setAllow_Info_Account (boolean Allow_Info_Account)
{
set_Value (COLUMNNAME_Allow_Info_Account, Boolean.valueOf(Allow_Info_Account));
}
/** Get Allow Info Account.
@return Allow Info Account */
public boolean isAllow_Info_Account() 
{
Object oo = get_Value(COLUMNNAME_Allow_Info_Account);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="7cfbfd3d-3b98-adf0-e5b1-cd3b00abff1a")
public static String es_PE_FIELD_Role_AllowInfoAccount_Name="Acceso Info Cuentas";

@XendraField(AD_Column_ID="Allow_Info_Account",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="Allow Info In Role",
IsDisplayed=true,DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=280,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="7cfbfd3d-3b98-adf0-e5b1-cd3b00abff1a")
public static final String FIELDNAME_Role_AllowInfoAccount="7cfbfd3d-3b98-adf0-e5b1-cd3b00abff1a";

@XendraTrl(Identifier="68649341-ab65-ca70-a3a9-99d58391a225")
public static String es_PE_COLUMN_Allow_Info_Account_Name="Allow Info Account";

@XendraColumn(AD_Element_ID="0b5ef8d4-72e5-89a0-f75d-dc1987a1d80f",ColumnName="Allow_Info_Account",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="68649341-ab65-ca70-a3a9-99d58391a225",
Synchronized="2019-08-30 22:20:38.0")
/** Column name Allow_Info_Account */
public static final String COLUMNNAME_Allow_Info_Account = "Allow_Info_Account";
/** Set Allow Info Asset.
@param Allow_Info_Asset Allow Info Asset */
public void setAllow_Info_Asset (boolean Allow_Info_Asset)
{
set_Value (COLUMNNAME_Allow_Info_Asset, Boolean.valueOf(Allow_Info_Asset));
}
/** Get Allow Info Asset.
@return Allow Info Asset */
public boolean isAllow_Info_Asset() 
{
Object oo = get_Value(COLUMNNAME_Allow_Info_Asset);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="5aea4107-7571-2e95-3209-8a5123617a8a")
public static String es_PE_FIELD_Role_AllowInfoAsset_Name="Acceso Info Activos";

@XendraField(AD_Column_ID="Allow_Info_Asset",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="Allow Info In Role",
IsDisplayed=true,DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=290,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="5aea4107-7571-2e95-3209-8a5123617a8a")
public static final String FIELDNAME_Role_AllowInfoAsset="5aea4107-7571-2e95-3209-8a5123617a8a";

@XendraTrl(Identifier="393097ae-0f34-7204-7258-6ff2cf749482")
public static String es_PE_COLUMN_Allow_Info_Asset_Name="Allow Info Asset";

@XendraColumn(AD_Element_ID="70547276-96a2-81d0-f5ba-eb647e9f2c11",ColumnName="Allow_Info_Asset",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="393097ae-0f34-7204-7258-6ff2cf749482",
Synchronized="2019-08-30 22:20:38.0")
/** Column name Allow_Info_Asset */
public static final String COLUMNNAME_Allow_Info_Asset = "Allow_Info_Asset";
/** Set Allow_Info_BOE.
@param Allow_Info_BOE Allow_Info_BOE */
public void setAllow_Info_BOE (boolean Allow_Info_BOE)
{
set_Value (COLUMNNAME_Allow_Info_BOE, Boolean.valueOf(Allow_Info_BOE));
}
/** Get Allow_Info_BOE.
@return Allow_Info_BOE */
public boolean isAllow_Info_BOE() 
{
Object oo = get_Value(COLUMNNAME_Allow_Info_BOE);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="d8c45955-bca3-d51d-8400-3fd74803781e")
public static String es_PE_FIELD_Role_Allow_Info_BOE_Name="Acceso Info Letra de Cambio";

@XendraField(AD_Column_ID="Allow_Info_BOE",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="Allow Info In Role",
IsDisplayed=true,DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=400,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d8c45955-bca3-d51d-8400-3fd74803781e")
public static final String FIELDNAME_Role_Allow_Info_BOE="d8c45955-bca3-d51d-8400-3fd74803781e";

@XendraTrl(Identifier="605800a6-adf6-c3f3-9b98-f166cb6d4720")
public static String es_PE_COLUMN_Allow_Info_BOE_Name="allow_info_boe";

@XendraColumn(AD_Element_ID="0f2bfe70-2880-e81b-2d6e-d4e02038fc86",ColumnName="Allow_Info_BOE",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="605800a6-adf6-c3f3-9b98-f166cb6d4720",
Synchronized="2019-08-30 22:20:38.0")
/** Column name Allow_Info_BOE */
public static final String COLUMNNAME_Allow_Info_BOE = "Allow_Info_BOE";
/** Set Allow Info BPartner.
@param Allow_Info_BPartner Allow Info BPartner */
public void setAllow_Info_BPartner (boolean Allow_Info_BPartner)
{
set_Value (COLUMNNAME_Allow_Info_BPartner, Boolean.valueOf(Allow_Info_BPartner));
}
/** Get Allow Info BPartner.
@return Allow Info BPartner */
public boolean isAllow_Info_BPartner() 
{
Object oo = get_Value(COLUMNNAME_Allow_Info_BPartner);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="aa99260a-65a2-f578-e874-48c3d0db9bbd")
public static String es_PE_FIELD_Role_AllowInfoBPartner_Name="Acceso Info Socio Negocio";

@XendraField(AD_Column_ID="Allow_Info_BPartner",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="Allow Info In Role",
IsDisplayed=true,DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=300,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="aa99260a-65a2-f578-e874-48c3d0db9bbd")
public static final String FIELDNAME_Role_AllowInfoBPartner="aa99260a-65a2-f578-e874-48c3d0db9bbd";

@XendraTrl(Identifier="07b4988b-6b89-2e67-6c7b-dbd7518779f2")
public static String es_PE_COLUMN_Allow_Info_BPartner_Name="Allow Info BPartner";

@XendraColumn(AD_Element_ID="def79e35-27a2-93aa-b45c-12d6eab34907",
ColumnName="Allow_Info_BPartner",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="Y",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="07b4988b-6b89-2e67-6c7b-dbd7518779f2",Synchronized="2019-08-30 22:20:38.0")
/** Column name Allow_Info_BPartner */
public static final String COLUMNNAME_Allow_Info_BPartner = "Allow_Info_BPartner";
/** Set Allow_Info_CashFlow.
@param Allow_Info_CashFlow Allow_Info_CashFlow */
public void setAllow_Info_CashFlow (boolean Allow_Info_CashFlow)
{
set_Value (COLUMNNAME_Allow_Info_CashFlow, Boolean.valueOf(Allow_Info_CashFlow));
}
/** Get Allow_Info_CashFlow.
@return Allow_Info_CashFlow */
public boolean isAllow_Info_CashFlow() 
{
Object oo = get_Value(COLUMNNAME_Allow_Info_CashFlow);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="6296cf81-797f-1c54-4217-504fce900f77")
public static String es_PE_FIELD_Role_Allow_Info_CashFlow_Name="Acceso Info Flujo de Caja";

@XendraField(AD_Column_ID="Allow_Info_CashFlow",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="Allow Info In Role",
IsDisplayed=true,DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=390,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="6296cf81-797f-1c54-4217-504fce900f77")
public static final String FIELDNAME_Role_Allow_Info_CashFlow="6296cf81-797f-1c54-4217-504fce900f77";

@XendraTrl(Identifier="208900c0-f85a-6c05-d977-73b280ac5cc6")
public static String es_PE_COLUMN_Allow_Info_CashFlow_Name="allow_info_cashflow";

@XendraColumn(AD_Element_ID="9fc20f78-3511-dbeb-ee8e-14c0679a98ca",
ColumnName="Allow_Info_CashFlow",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="Y",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="208900c0-f85a-6c05-d977-73b280ac5cc6",Synchronized="2019-08-30 22:20:38.0")
/** Column name Allow_Info_CashFlow */
public static final String COLUMNNAME_Allow_Info_CashFlow = "Allow_Info_CashFlow";
/** Set Allow Info CashJournal.
@param Allow_Info_CashJournal Allow Info CashJournal */
public void setAllow_Info_CashJournal (boolean Allow_Info_CashJournal)
{
set_Value (COLUMNNAME_Allow_Info_CashJournal, Boolean.valueOf(Allow_Info_CashJournal));
}
/** Get Allow Info CashJournal.
@return Allow Info CashJournal */
public boolean isAllow_Info_CashJournal() 
{
Object oo = get_Value(COLUMNNAME_Allow_Info_CashJournal);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="3f2f8b94-4f24-34c1-fb9c-13812eacc185")
public static String es_PE_FIELD_Role_AllowInfoCashJournal_Name="Acceso Info Diario Efectivo";

@XendraField(AD_Column_ID="Allow_Info_CashJournal",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="Allow Info In Role",
IsDisplayed=true,DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=310,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="3f2f8b94-4f24-34c1-fb9c-13812eacc185")
public static final String FIELDNAME_Role_AllowInfoCashJournal="3f2f8b94-4f24-34c1-fb9c-13812eacc185";

@XendraTrl(Identifier="6a273bb0-8f1d-7e7d-d508-3c7053efafd1")
public static String es_PE_COLUMN_Allow_Info_CashJournal_Name="Allow Info CashJournal";

@XendraColumn(AD_Element_ID="fb88f5c5-03d0-9324-664a-cb888dafc97f",
ColumnName="Allow_Info_CashJournal",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="Y",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6a273bb0-8f1d-7e7d-d508-3c7053efafd1",Synchronized="2019-08-30 22:20:38.0")
/** Column name Allow_Info_CashJournal */
public static final String COLUMNNAME_Allow_Info_CashJournal = "Allow_Info_CashJournal";
/** Set Allow Info InOut.
@param Allow_Info_InOut Allow Info InOut */
public void setAllow_Info_InOut (boolean Allow_Info_InOut)
{
set_Value (COLUMNNAME_Allow_Info_InOut, Boolean.valueOf(Allow_Info_InOut));
}
/** Get Allow Info InOut.
@return Allow Info InOut */
public boolean isAllow_Info_InOut() 
{
Object oo = get_Value(COLUMNNAME_Allow_Info_InOut);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="dc8ab4d5-ea0c-143e-661b-cd24f9d7c4e6")
public static String es_PE_FIELD_Role_AllowInfoInOut_Name="Acceso Info Salida";

@XendraField(AD_Column_ID="Allow_Info_InOut",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="Allow Info In Role",
IsDisplayed=true,DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=320,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="dc8ab4d5-ea0c-143e-661b-cd24f9d7c4e6")
public static final String FIELDNAME_Role_AllowInfoInOut="dc8ab4d5-ea0c-143e-661b-cd24f9d7c4e6";

@XendraTrl(Identifier="9263bddf-004e-91d3-c4c8-bb2dcb4e5ea9")
public static String es_PE_COLUMN_Allow_Info_InOut_Name="Allow Info InOut";

@XendraColumn(AD_Element_ID="57402da9-d017-a898-4ea6-05815309dd61",ColumnName="Allow_Info_InOut",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9263bddf-004e-91d3-c4c8-bb2dcb4e5ea9",
Synchronized="2019-08-30 22:20:38.0")
/** Column name Allow_Info_InOut */
public static final String COLUMNNAME_Allow_Info_InOut = "Allow_Info_InOut";
/** Set Allow Info Invoice.
@param Allow_Info_Invoice Allow Info Invoice */
public void setAllow_Info_Invoice (boolean Allow_Info_Invoice)
{
set_Value (COLUMNNAME_Allow_Info_Invoice, Boolean.valueOf(Allow_Info_Invoice));
}
/** Get Allow Info Invoice.
@return Allow Info Invoice */
public boolean isAllow_Info_Invoice() 
{
Object oo = get_Value(COLUMNNAME_Allow_Info_Invoice);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="c88d2032-4812-02bf-aef3-d46784218c94")
public static String es_PE_FIELD_Role_AllowInfoInvoice_Name="Acceso Info Factura";

@XendraField(AD_Column_ID="Allow_Info_Invoice",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="Allow Info In Role",
IsDisplayed=true,DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=330,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c88d2032-4812-02bf-aef3-d46784218c94")
public static final String FIELDNAME_Role_AllowInfoInvoice="c88d2032-4812-02bf-aef3-d46784218c94";

@XendraTrl(Identifier="29894d90-5779-a494-c048-8bf2a8f23aab")
public static String es_PE_COLUMN_Allow_Info_Invoice_Name="Allow Info Invoice";

@XendraColumn(AD_Element_ID="1db56b77-9fe7-788c-2cc6-5b949a8e3436",ColumnName="Allow_Info_Invoice",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="29894d90-5779-a494-c048-8bf2a8f23aab",
Synchronized="2019-08-30 22:20:38.0")
/** Column name Allow_Info_Invoice */
public static final String COLUMNNAME_Allow_Info_Invoice = "Allow_Info_Invoice";
/** Set Allow Info Order.
@param Allow_Info_Order Allow Info Order */
public void setAllow_Info_Order (boolean Allow_Info_Order)
{
set_Value (COLUMNNAME_Allow_Info_Order, Boolean.valueOf(Allow_Info_Order));
}
/** Get Allow Info Order.
@return Allow Info Order */
public boolean isAllow_Info_Order() 
{
Object oo = get_Value(COLUMNNAME_Allow_Info_Order);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f792e65d-72ad-63f6-37b1-f4bf052799b6")
public static String es_PE_FIELD_Role_AllowInfoOrder_Name="Acceso Info Orden";

@XendraField(AD_Column_ID="Allow_Info_Order",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="Allow Info In Role",
IsDisplayed=true,DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=340,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f792e65d-72ad-63f6-37b1-f4bf052799b6")
public static final String FIELDNAME_Role_AllowInfoOrder="f792e65d-72ad-63f6-37b1-f4bf052799b6";

@XendraTrl(Identifier="2edc3364-4369-842e-853e-40312692c358")
public static String es_PE_COLUMN_Allow_Info_Order_Name="Allow Info Order";

@XendraColumn(AD_Element_ID="a043de6c-7559-466b-6d18-70498e757576",ColumnName="Allow_Info_Order",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2edc3364-4369-842e-853e-40312692c358",
Synchronized="2019-08-30 22:20:38.0")
/** Column name Allow_Info_Order */
public static final String COLUMNNAME_Allow_Info_Order = "Allow_Info_Order";
/** Set Allow Info Payment.
@param Allow_Info_Payment Allow Info Payment */
public void setAllow_Info_Payment (boolean Allow_Info_Payment)
{
set_Value (COLUMNNAME_Allow_Info_Payment, Boolean.valueOf(Allow_Info_Payment));
}
/** Get Allow Info Payment.
@return Allow Info Payment */
public boolean isAllow_Info_Payment() 
{
Object oo = get_Value(COLUMNNAME_Allow_Info_Payment);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="70b0a441-9c93-8bda-fd77-bb83bf5e72dc")
public static String es_PE_FIELD_Role_AllowInfoPayment_Name="Acceso Info Pagos";

@XendraField(AD_Column_ID="Allow_Info_Payment",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="Allow Info In Role",
IsDisplayed=true,DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=350,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="70b0a441-9c93-8bda-fd77-bb83bf5e72dc")
public static final String FIELDNAME_Role_AllowInfoPayment="70b0a441-9c93-8bda-fd77-bb83bf5e72dc";

@XendraTrl(Identifier="a7fc6c9d-f484-5d2e-53d5-7c2e3f861336")
public static String es_PE_COLUMN_Allow_Info_Payment_Name="Allow Info Payment";

@XendraColumn(AD_Element_ID="cd094bf4-d57b-795a-cb8e-22130305fa32",ColumnName="Allow_Info_Payment",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a7fc6c9d-f484-5d2e-53d5-7c2e3f861336",
Synchronized="2019-08-30 22:20:38.0")
/** Column name Allow_Info_Payment */
public static final String COLUMNNAME_Allow_Info_Payment = "Allow_Info_Payment";
/** Set Allow Info Product.
@param Allow_Info_Product Allow Info Product */
public void setAllow_Info_Product (boolean Allow_Info_Product)
{
set_Value (COLUMNNAME_Allow_Info_Product, Boolean.valueOf(Allow_Info_Product));
}
/** Get Allow Info Product.
@return Allow Info Product */
public boolean isAllow_Info_Product() 
{
Object oo = get_Value(COLUMNNAME_Allow_Info_Product);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="3744a67e-fb83-5ab9-23a6-7e1af4309b7e")
public static String es_PE_FIELD_Role_AllowInfoProduct_Name="Acceso Info Producto";

@XendraField(AD_Column_ID="Allow_Info_Product",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="Allow Info In Role",
IsDisplayed=true,DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=360,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="3744a67e-fb83-5ab9-23a6-7e1af4309b7e")
public static final String FIELDNAME_Role_AllowInfoProduct="3744a67e-fb83-5ab9-23a6-7e1af4309b7e";

@XendraTrl(Identifier="0cb6a5bf-419c-a156-6b50-56193a93f9dd")
public static String es_PE_COLUMN_Allow_Info_Product_Name="Allow Info Product";

@XendraColumn(AD_Element_ID="2ae65dc6-f97b-690f-e77d-8e889df75c41",ColumnName="Allow_Info_Product",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0cb6a5bf-419c-a156-6b50-56193a93f9dd",
Synchronized="2019-08-30 22:20:38.0")
/** Column name Allow_Info_Product */
public static final String COLUMNNAME_Allow_Info_Product = "Allow_Info_Product";
/** Set Allow Info Resource.
@param Allow_Info_Resource Allow Info Resource */
public void setAllow_Info_Resource (boolean Allow_Info_Resource)
{
set_Value (COLUMNNAME_Allow_Info_Resource, Boolean.valueOf(Allow_Info_Resource));
}
/** Get Allow Info Resource.
@return Allow Info Resource */
public boolean isAllow_Info_Resource() 
{
Object oo = get_Value(COLUMNNAME_Allow_Info_Resource);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="cf643216-ec03-a137-b48b-857e83442bee")
public static String es_PE_FIELD_Role_AllowInfoResource_Name="Acceso Info Recursos";

@XendraField(AD_Column_ID="Allow_Info_Resource",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="Allow Info In Role",
IsDisplayed=true,DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=370,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="cf643216-ec03-a137-b48b-857e83442bee")
public static final String FIELDNAME_Role_AllowInfoResource="cf643216-ec03-a137-b48b-857e83442bee";

@XendraTrl(Identifier="4a5486d0-bcac-076c-e241-4ed036ce83f7")
public static String es_PE_COLUMN_Allow_Info_Resource_Name="Allow Info Resource";

@XendraColumn(AD_Element_ID="dcb4c79c-ec42-8dbd-0f75-e9d80c26f35e",
ColumnName="Allow_Info_Resource",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="Y",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4a5486d0-bcac-076c-e241-4ed036ce83f7",Synchronized="2019-08-30 22:20:38.0")
/** Column name Allow_Info_Resource */
public static final String COLUMNNAME_Allow_Info_Resource = "Allow_Info_Resource";
/** Set Allow Info Schedule.
@param Allow_Info_Schedule Allow Info Schedule */
public void setAllow_Info_Schedule (boolean Allow_Info_Schedule)
{
set_Value (COLUMNNAME_Allow_Info_Schedule, Boolean.valueOf(Allow_Info_Schedule));
}
/** Get Allow Info Schedule.
@return Allow Info Schedule */
public boolean isAllow_Info_Schedule() 
{
Object oo = get_Value(COLUMNNAME_Allow_Info_Schedule);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="16aad09b-45a9-dcb0-2276-dc135b51ceb0")
public static String es_PE_FIELD_Role_AllowInfoSchedule_Name="Acceso Info Programa";

@XendraField(AD_Column_ID="Allow_Info_Schedule",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="Allow Info In Role",
IsDisplayed=true,DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=380,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="16aad09b-45a9-dcb0-2276-dc135b51ceb0")
public static final String FIELDNAME_Role_AllowInfoSchedule="16aad09b-45a9-dcb0-2276-dc135b51ceb0";

@XendraTrl(Identifier="13705199-a12a-f647-6a03-3b118999e498")
public static String es_PE_COLUMN_Allow_Info_Schedule_Name="Allow Info Schedule";

@XendraColumn(AD_Element_ID="eec117b9-bdbf-0399-f0d7-b9f2a5550b41",
ColumnName="Allow_Info_Schedule",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="Y",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="13705199-a12a-f647-6a03-3b118999e498",Synchronized="2019-08-30 22:20:38.0")
/** Column name Allow_Info_Schedule */
public static final String COLUMNNAME_Allow_Info_Schedule = "Allow_Info_Schedule";
/** Set Allow_Store.
@param Allow_Store Allow_Store */
public void setAllow_Store (boolean Allow_Store)
{
set_Value (COLUMNNAME_Allow_Store, Boolean.valueOf(Allow_Store));
}
/** Get Allow_Store.
@return Allow_Store */
public boolean isAllow_Store() 
{
Object oo = get_Value(COLUMNNAME_Allow_Store);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="b89de3e6-68cf-b068-38b3-f18121afe2ea")
public static String es_PE_FIELD_Role_Allow_Store_Name="allow_store";

@XendraField(AD_Column_ID="Allow_Store",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=410,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2015-11-23 15:25:22.0",
Identifier="b89de3e6-68cf-b068-38b3-f18121afe2ea")
public static final String FIELDNAME_Role_Allow_Store="b89de3e6-68cf-b068-38b3-f18121afe2ea";

@XendraTrl(Identifier="12737593-97b5-49dc-bd1f-b04e42b4c9da")
public static String es_PE_COLUMN_Allow_Store_Name="allow_store";

@XendraColumn(AD_Element_ID="39f427d4-d2d3-4cb6-aec3-8fe9f2e89e17",ColumnName="Allow_Store",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="12737593-97b5-49dc-bd1f-b04e42b4c9da",
Synchronized="2019-08-30 22:20:38.0")
/** Column name Allow_Store */
public static final String COLUMNNAME_Allow_Store = "Allow_Store";
/** Set Approval Amount.
@param AmtApproval The approval amount limit for this role */
public void setAmtApproval (BigDecimal AmtApproval)
{
set_Value (COLUMNNAME_AmtApproval, AmtApproval);
}
/** Get Approval Amount.
@return The approval amount limit for this role */
public BigDecimal getAmtApproval() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtApproval);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="29c916e3-ba6c-1100-eee7-669277ab789a")
public static String es_PE_FIELD_Role_ApprovalAmount_Name="Total Aprobado";

@XendraTrl(Identifier="29c916e3-ba6c-1100-eee7-669277ab789a")
public static String es_PE_FIELD_Role_ApprovalAmount_Description="Total límite aprobado para este perfil";

@XendraTrl(Identifier="29c916e3-ba6c-1100-eee7-669277ab789a")
public static String es_PE_FIELD_Role_ApprovalAmount_Help="El campo total aprobado indica el total límite que esta perfil tiene para aprobación de documentos";

@XendraField(AD_Column_ID="AmtApproval",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="29c916e3-ba6c-1100-eee7-669277ab789a")
public static final String FIELDNAME_Role_ApprovalAmount="29c916e3-ba6c-1100-eee7-669277ab789a";

@XendraTrl(Identifier="b25f505f-8e61-e38c-663d-b6960aeb63dc")
public static String es_PE_FIELD_Role_ApprovalAmount2_Name="Total Aprobado";

@XendraTrl(Identifier="b25f505f-8e61-e38c-663d-b6960aeb63dc")
public static String es_PE_FIELD_Role_ApprovalAmount2_Description="Total límite aprobado para este perfil";

@XendraTrl(Identifier="b25f505f-8e61-e38c-663d-b6960aeb63dc")
public static String es_PE_FIELD_Role_ApprovalAmount2_Help="El campo total aprobado indica el total límite que esta perfil tiene para aprobación de documentos";

@XendraField(AD_Column_ID="AmtApproval",IsCentrallyMaintained=true,
AD_Tab_ID="bb74c0c5-65c7-e59d-110d-ef40c54c72fd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b25f505f-8e61-e38c-663d-b6960aeb63dc")
public static final String FIELDNAME_Role_ApprovalAmount2="b25f505f-8e61-e38c-663d-b6960aeb63dc";

@XendraTrl(Identifier="d8f4c671-92cc-b7cd-c803-5c354f3c01e0")
public static String es_PE_COLUMN_AmtApproval_Name="Total Aprobado";

@XendraColumn(AD_Element_ID="e78ee96a-b984-537e-499d-2786ef1aa408",ColumnName="AmtApproval",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d8f4c671-92cc-b7cd-c803-5c354f3c01e0",
Synchronized="2019-08-30 22:20:38.0")
/** Column name AmtApproval */
public static final String COLUMNNAME_AmtApproval = "AmtApproval";
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID <= 0) set_Value (COLUMNNAME_C_Currency_ID, null);
 else 
set_Value (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
}
/** Get Currency.
@return The Currency for this record */
public int getC_Currency_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="64034b32-17c0-a5e7-79b8-d25b4abf8293")
public static String es_PE_FIELD_Role_Currency_Name="Moneda";

@XendraTrl(Identifier="64034b32-17c0-a5e7-79b8-d25b4abf8293")
public static String es_PE_FIELD_Role_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="64034b32-17c0-a5e7-79b8-d25b4abf8293")
public static String es_PE_FIELD_Role_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="Workflow",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="64034b32-17c0-a5e7-79b8-d25b4abf8293")
public static final String FIELDNAME_Role_Currency="64034b32-17c0-a5e7-79b8-d25b4abf8293";

@XendraTrl(Identifier="fde8f97a-66dd-0101-b383-8f3cf633e49d")
public static String es_PE_FIELD_Role_Currency2_Name="Moneda";

@XendraTrl(Identifier="fde8f97a-66dd-0101-b383-8f3cf633e49d")
public static String es_PE_FIELD_Role_Currency2_Description="Moneda para este registro";

@XendraTrl(Identifier="fde8f97a-66dd-0101-b383-8f3cf633e49d")
public static String es_PE_FIELD_Role_Currency2_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bb74c0c5-65c7-e59d-110d-ef40c54c72fd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fde8f97a-66dd-0101-b383-8f3cf633e49d")
public static final String FIELDNAME_Role_Currency2="fde8f97a-66dd-0101-b383-8f3cf633e49d";

@XendraTrl(Identifier="d5facadb-dfc9-cbdc-5325-2d31a759e11a")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@$C_Currency_ID@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d5facadb-dfc9-cbdc-5325-2d31a759e11a",Synchronized="2019-08-30 22:20:38.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Confirm Query Records.
@param ConfirmQueryRecords Require Confirmation if more records will be returned by the query (If not defined 500) */
public void setConfirmQueryRecords (int ConfirmQueryRecords)
{
set_Value (COLUMNNAME_ConfirmQueryRecords, Integer.valueOf(ConfirmQueryRecords));
}
/** Get Confirm Query Records.
@return Require Confirmation if more records will be returned by the query (If not defined 500) */
public int getConfirmQueryRecords() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_ConfirmQueryRecords);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c02b7178-014a-0a07-3ffe-ecbd0a5fd483")
public static String es_PE_FIELD_Role_ConfirmQueryRecords_Name="Confirmar Registros de Consulta";

@XendraTrl(Identifier="c02b7178-014a-0a07-3ffe-ecbd0a5fd483")
public static String es_PE_FIELD_Role_ConfirmQueryRecords_Description="Requiere Confirmación sí más registros serán devueltos por la consulta (Si no definió 500)";

@XendraTrl(Identifier="c02b7178-014a-0a07-3ffe-ecbd0a5fd483")
public static String es_PE_FIELD_Role_ConfirmQueryRecords_Help="Ingrese el número de registros que la consulta devolvera sin confirmación para evitar cargas innecesarias en el sistema. Si es 0, se emplea 500 que es el predeterminado del sistema.";

@XendraField(AD_Column_ID="ConfirmQueryRecords",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c02b7178-014a-0a07-3ffe-ecbd0a5fd483")
public static final String FIELDNAME_Role_ConfirmQueryRecords="c02b7178-014a-0a07-3ffe-ecbd0a5fd483";

@XendraTrl(Identifier="3989efc2-75ca-e077-1323-bf092ac2cb6c")
public static String es_PE_COLUMN_ConfirmQueryRecords_Name="Confirmar Registros de Consulta";

@XendraColumn(AD_Element_ID="0e657dbc-3d5c-c78b-9c0e-47bffbd0be3a",
ColumnName="ConfirmQueryRecords",AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="0",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3989efc2-75ca-e077-1323-bf092ac2cb6c",Synchronized="2019-08-30 22:20:38.0")
/** Column name ConfirmQueryRecords */
public static final String COLUMNNAME_ConfirmQueryRecords = "ConfirmQueryRecords";
/** Set Connection Profile.
@param ConnectionProfile How a Java Client connects to the server(s) */
public void setConnectionProfile (String ConnectionProfile)
{
if (ConnectionProfile != null && ConnectionProfile.length() > 1)
{
log.warning("Length > 1 - truncated");
ConnectionProfile = ConnectionProfile.substring(0,0);
}
set_Value (COLUMNNAME_ConnectionProfile, ConnectionProfile);
}
/** Get Connection Profile.
@return How a Java Client connects to the server(s) */
public String getConnectionProfile() 
{
return (String)get_Value(COLUMNNAME_ConnectionProfile);
}

@XendraTrl(Identifier="fba1f4ae-de45-79e0-f3fe-ebf69f058024")
public static String es_PE_FIELD_Role_ConnectionProfile_Name="Perfil de Conexión";

@XendraTrl(Identifier="fba1f4ae-de45-79e0-f3fe-ebf69f058024")
public static String es_PE_FIELD_Role_ConnectionProfile_Description="Como un Cliente Java se conecta al Servidor(res) ";

@XendraTrl(Identifier="fba1f4ae-de45-79e0-f3fe-ebf69f058024")
public static String es_PE_FIELD_Role_ConnectionProfile_Help="Dependiendo del Perfil de Conexión, se emplean diferentes Protocolos y las tareas se desarrollan mejor en el Servidor que en el Cliente. Usualmente el usuario puede seleccionar diferentes perfiles, esto es frorzado mediante la definición de Usuarios o Roles. El perfil Nivél de Usuario sobre escribe el perfil basado en el Rol";

@XendraField(AD_Column_ID="ConnectionProfile",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=270,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fba1f4ae-de45-79e0-f3fe-ebf69f058024")
public static final String FIELDNAME_Role_ConnectionProfile="fba1f4ae-de45-79e0-f3fe-ebf69f058024";

@XendraTrl(Identifier="cc2afbc5-e93a-0577-4746-56b7740a35be")
public static String es_PE_COLUMN_ConnectionProfile_Name="Perfil de Conexión";

@XendraColumn(AD_Element_ID="0bedebc6-89fa-ce88-eb93-bbf2207e0485",ColumnName="ConnectionProfile",
AD_Reference_ID=17,AD_Reference_Value_ID="474037d5-3cef-9c8c-8e15-a0704cbfdc86",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="cc2afbc5-e93a-0577-4746-56b7740a35be",Synchronized="2019-08-30 22:20:38.0")
/** Column name ConnectionProfile */
public static final String COLUMNNAME_ConnectionProfile = "ConnectionProfile";
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

@XendraTrl(Identifier="58574933-d10b-6126-59be-23714d46a9e4")
public static String es_PE_FIELD_Role_Description_Name="Observación";

@XendraTrl(Identifier="58574933-d10b-6126-59be-23714d46a9e4")
public static String es_PE_FIELD_Role_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="58574933-d10b-6126-59be-23714d46a9e4")
public static String es_PE_FIELD_Role_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="58574933-d10b-6126-59be-23714d46a9e4")
public static final String FIELDNAME_Role_Description="58574933-d10b-6126-59be-23714d46a9e4";

@XendraTrl(Identifier="cb4fcfe7-8707-24dc-c985-d928da572c07")
public static String es_PE_FIELD_Role_Description2_Name="Observación";

@XendraTrl(Identifier="cb4fcfe7-8707-24dc-c985-d928da572c07")
public static String es_PE_FIELD_Role_Description2_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="cb4fcfe7-8707-24dc-c985-d928da572c07")
public static String es_PE_FIELD_Role_Description2_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="bb74c0c5-65c7-e59d-110d-ef40c54c72fd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cb4fcfe7-8707-24dc-c985-d928da572c07")
public static final String FIELDNAME_Role_Description2="cb4fcfe7-8707-24dc-c985-d928da572c07";

@XendraTrl(Identifier="e99b6614-bb77-f2a6-650f-959f144944af")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e99b6614-bb77-f2a6-650f-959f144944af",
Synchronized="2019-08-30 22:20:38.0")
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
@XendraTrl(Identifier="82459fe0-b2e4-5428-9677-154da8996f60")
public static String es_PE_FIELD_Role_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2015-11-23 15:25:23.0",
Identifier="82459fe0-b2e4-5428-9677-154da8996f60")
public static final String FIELDNAME_Role_Identifier="82459fe0-b2e4-5428-9677-154da8996f60";

@XendraTrl(Identifier="f1ef9784-ba3d-4d62-bb03-e0231f1687d5")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f1ef9784-ba3d-4d62-bb03-e0231f1687d5",
Synchronized="2019-08-30 22:20:39.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Access all Orgs.
@param IsAccessAllOrgs Access all Organizations (no org access control) of the client */
public void setIsAccessAllOrgs (boolean IsAccessAllOrgs)
{
set_Value (COLUMNNAME_IsAccessAllOrgs, Boolean.valueOf(IsAccessAllOrgs));
}
/** Get Access all Orgs.
@return Access all Organizations (no org access control) of the client */
public boolean isAccessAllOrgs() 
{
Object oo = get_Value(COLUMNNAME_IsAccessAllOrgs);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="4abb5a65-631a-2bcc-0e04-67d3d733d738")
public static String es_PE_FIELD_Role_AccessAllOrgs_Name="Acceso a todas las Organizaciones";

@XendraTrl(Identifier="4abb5a65-631a-2bcc-0e04-67d3d733d738")
public static String es_PE_FIELD_Role_AccessAllOrgs_Description="Acceso a todas las Organizaciones (no controla acceso a organizacion) de el cliente.";

@XendraTrl(Identifier="4abb5a65-631a-2bcc-0e04-67d3d733d738")
public static String es_PE_FIELD_Role_AccessAllOrgs_Help="Cuando selecciona la regla, le da acceso a todas las organizaciones de el cliente automaticamente. Esta tambien aumenta funcionamientos donde usted tiene muchas organizaciones.";

@XendraField(AD_Column_ID="IsAccessAllOrgs",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4abb5a65-631a-2bcc-0e04-67d3d733d738")
public static final String FIELDNAME_Role_AccessAllOrgs="4abb5a65-631a-2bcc-0e04-67d3d733d738";

@XendraTrl(Identifier="be1177df-4195-295e-6d67-832853e83efd")
public static String es_PE_FIELD_Role_AccessAllOrgs2_Name="Acceso a todas las Organizaciones";

@XendraTrl(Identifier="be1177df-4195-295e-6d67-832853e83efd")
public static String es_PE_FIELD_Role_AccessAllOrgs2_Description="Acceso a todas las Organizaciones (no controla acceso a organizacion) de el cliente.";

@XendraTrl(Identifier="be1177df-4195-295e-6d67-832853e83efd")
public static String es_PE_FIELD_Role_AccessAllOrgs2_Help="Cuando selecciona la regla, le da acceso a todas las organizaciones de el cliente automaticamente. Esta tambien aumenta funcionamientos donde usted tiene muchas organizaciones.";

@XendraField(AD_Column_ID="IsAccessAllOrgs",IsCentrallyMaintained=true,
AD_Tab_ID="bb74c0c5-65c7-e59d-110d-ef40c54c72fd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="be1177df-4195-295e-6d67-832853e83efd")
public static final String FIELDNAME_Role_AccessAllOrgs2="be1177df-4195-295e-6d67-832853e83efd";

@XendraTrl(Identifier="6f529828-a332-f09e-dcd2-d6f309ebfa8f")
public static String es_PE_COLUMN_IsAccessAllOrgs_Name="Acceso a todas las Organizaciones";

@XendraColumn(AD_Element_ID="8c62d0a9-3f39-d2ae-f037-07789b99100d",ColumnName="IsAccessAllOrgs",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6f529828-a332-f09e-dcd2-d6f309ebfa8f",
Synchronized="2019-08-30 22:20:39.0")
/** Column name IsAccessAllOrgs */
public static final String COLUMNNAME_IsAccessAllOrgs = "IsAccessAllOrgs";
/** Set Approve own Documents.
@param IsCanApproveOwnDoc Users with this role can approve their own documents */
public void setIsCanApproveOwnDoc (boolean IsCanApproveOwnDoc)
{
set_Value (COLUMNNAME_IsCanApproveOwnDoc, Boolean.valueOf(IsCanApproveOwnDoc));
}
/** Get Approve own Documents.
@return Users with this role can approve their own documents */
public boolean isCanApproveOwnDoc() 
{
Object oo = get_Value(COLUMNNAME_IsCanApproveOwnDoc);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="5059a4e8-aff9-56a1-db9b-86aca22682e5")
public static String es_PE_FIELD_Role_ApproveOwnDocuments_Name="Aprueba su propio Documento";

@XendraTrl(Identifier="5059a4e8-aff9-56a1-db9b-86aca22682e5")
public static String es_PE_FIELD_Role_ApproveOwnDocuments_Description="Los usuarios con este rol pueden aprobar sus propios documentos";

@XendraTrl(Identifier="5059a4e8-aff9-56a1-db9b-86aca22682e5")
public static String es_PE_FIELD_Role_ApproveOwnDocuments_Help="Si un usuario no puede aprobar sus propios documentos (ordenes, etc.), necesita ser aprobado por algún otro.";

@XendraField(AD_Column_ID="IsCanApproveOwnDoc",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5059a4e8-aff9-56a1-db9b-86aca22682e5")
public static final String FIELDNAME_Role_ApproveOwnDocuments="5059a4e8-aff9-56a1-db9b-86aca22682e5";

@XendraTrl(Identifier="200851ec-b67f-7137-5654-c8abd234c1b8")
public static String es_PE_FIELD_Role_ApproveOwnDocuments2_Name="Aprueba su propio Documento";

@XendraTrl(Identifier="200851ec-b67f-7137-5654-c8abd234c1b8")
public static String es_PE_FIELD_Role_ApproveOwnDocuments2_Description="Los usuarios con este rol pueden aprobar sus propios documentos";

@XendraTrl(Identifier="200851ec-b67f-7137-5654-c8abd234c1b8")
public static String es_PE_FIELD_Role_ApproveOwnDocuments2_Help="Si un usuario no puede aprobar sus propios documentos (ordenes, etc.), necesita ser aprobado por algún otro.";

@XendraField(AD_Column_ID="IsCanApproveOwnDoc",IsCentrallyMaintained=true,
AD_Tab_ID="bb74c0c5-65c7-e59d-110d-ef40c54c72fd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="200851ec-b67f-7137-5654-c8abd234c1b8")
public static final String FIELDNAME_Role_ApproveOwnDocuments2="200851ec-b67f-7137-5654-c8abd234c1b8";

@XendraTrl(Identifier="2af9d361-82ab-6978-2a41-fee18a8445fe")
public static String es_PE_COLUMN_IsCanApproveOwnDoc_Name="Aprueba su propio Documento";

@XendraColumn(AD_Element_ID="6f139902-a10b-cb75-55fb-e461aeb25882",ColumnName="IsCanApproveOwnDoc",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2af9d361-82ab-6978-2a41-fee18a8445fe",
Synchronized="2019-08-30 22:20:39.0")
/** Column name IsCanApproveOwnDoc */
public static final String COLUMNNAME_IsCanApproveOwnDoc = "IsCanApproveOwnDoc";
/** Set Can Export.
@param IsCanExport Users with this role can export data */
public void setIsCanExport (boolean IsCanExport)
{
set_Value (COLUMNNAME_IsCanExport, Boolean.valueOf(IsCanExport));
}
/** Get Can Export.
@return Users with this role can export data */
public boolean isCanExport() 
{
Object oo = get_Value(COLUMNNAME_IsCanExport);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="feb3f150-2a3d-9348-e877-c9c1e8c2e433")
public static String es_PE_FIELD_Role_CanExport_Name="Puede Exportar";

@XendraTrl(Identifier="feb3f150-2a3d-9348-e877-c9c1e8c2e433")
public static String es_PE_FIELD_Role_CanExport_Description="Usuarios con una regla para poder exportar";

@XendraTrl(Identifier="feb3f150-2a3d-9348-e877-c9c1e8c2e433")
public static String es_PE_FIELD_Role_CanExport_Help="Usted puede restringir la capacidad de exportar datos de Adempiere.";

@XendraField(AD_Column_ID="IsCanExport",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="feb3f150-2a3d-9348-e877-c9c1e8c2e433")
public static final String FIELDNAME_Role_CanExport="feb3f150-2a3d-9348-e877-c9c1e8c2e433";

@XendraTrl(Identifier="db79a2b6-f7f8-8c4e-a9be-14a6e29c624c")
public static String es_PE_FIELD_Role_CanExport2_Name="Puede Exportar";

@XendraTrl(Identifier="db79a2b6-f7f8-8c4e-a9be-14a6e29c624c")
public static String es_PE_FIELD_Role_CanExport2_Description="Usuarios con una regla para poder exportar";

@XendraTrl(Identifier="db79a2b6-f7f8-8c4e-a9be-14a6e29c624c")
public static String es_PE_FIELD_Role_CanExport2_Help="Usted puede restringir la capacidad de exportar datos de Adempiere.";

@XendraField(AD_Column_ID="IsCanExport",IsCentrallyMaintained=true,
AD_Tab_ID="bb74c0c5-65c7-e59d-110d-ef40c54c72fd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="db79a2b6-f7f8-8c4e-a9be-14a6e29c624c")
public static final String FIELDNAME_Role_CanExport2="db79a2b6-f7f8-8c4e-a9be-14a6e29c624c";

@XendraTrl(Identifier="8d1e55b2-3430-645e-0dc3-b0cfb9a8389c")
public static String es_PE_COLUMN_IsCanExport_Name="Puede Exportar";

@XendraColumn(AD_Element_ID="0af50b0e-deaa-f58b-d99f-12fd6eebd3dd",ColumnName="IsCanExport",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8d1e55b2-3430-645e-0dc3-b0cfb9a8389c",
Synchronized="2019-08-30 22:20:39.0")
/** Column name IsCanExport */
public static final String COLUMNNAME_IsCanExport = "IsCanExport";
/** Set Can Report.
@param IsCanReport Users with this role can create reports */
public void setIsCanReport (boolean IsCanReport)
{
set_Value (COLUMNNAME_IsCanReport, Boolean.valueOf(IsCanReport));
}
/** Get Can Report.
@return Users with this role can create reports */
public boolean isCanReport() 
{
Object oo = get_Value(COLUMNNAME_IsCanReport);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="91a69c0a-2f61-b16a-5bf8-f773aa0e63e8")
public static String es_PE_FIELD_Role_CanReport_Name="Puede hacer Informes";

@XendraTrl(Identifier="91a69c0a-2f61-b16a-5bf8-f773aa0e63e8")
public static String es_PE_FIELD_Role_CanReport_Description="Usuarios con una regla para poder crear informes";

@XendraTrl(Identifier="91a69c0a-2f61-b16a-5bf8-f773aa0e63e8")
public static String es_PE_FIELD_Role_CanReport_Help="Usted puede restringir la capacidad de hacer informes sobre datos.";

@XendraField(AD_Column_ID="IsCanReport",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="91a69c0a-2f61-b16a-5bf8-f773aa0e63e8")
public static final String FIELDNAME_Role_CanReport="91a69c0a-2f61-b16a-5bf8-f773aa0e63e8";

@XendraTrl(Identifier="0135fd5a-ab5e-b5a2-d0de-5d9c568be618")
public static String es_PE_FIELD_Role_CanReport2_Name="Puede hacer Informes";

@XendraTrl(Identifier="0135fd5a-ab5e-b5a2-d0de-5d9c568be618")
public static String es_PE_FIELD_Role_CanReport2_Description="Usuarios con una regla para poder crear informes";

@XendraTrl(Identifier="0135fd5a-ab5e-b5a2-d0de-5d9c568be618")
public static String es_PE_FIELD_Role_CanReport2_Help="Usted puede restringir la capacidad de hacer informes sobre datos.";

@XendraField(AD_Column_ID="IsCanReport",IsCentrallyMaintained=true,
AD_Tab_ID="bb74c0c5-65c7-e59d-110d-ef40c54c72fd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0135fd5a-ab5e-b5a2-d0de-5d9c568be618")
public static final String FIELDNAME_Role_CanReport2="0135fd5a-ab5e-b5a2-d0de-5d9c568be618";

@XendraTrl(Identifier="05b8f066-b77d-8236-fd2d-6123747e0d99")
public static String es_PE_COLUMN_IsCanReport_Name="Puede hacer Informes";

@XendraColumn(AD_Element_ID="aea4c019-2381-2f85-c631-9521d55c77a3",ColumnName="IsCanReport",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="05b8f066-b77d-8236-fd2d-6123747e0d99",
Synchronized="2019-08-30 22:20:39.0")
/** Column name IsCanReport */
public static final String COLUMNNAME_IsCanReport = "IsCanReport";
/** Set Maintain Change Log.
@param IsChangeLog Maintain a log of changes */
public void setIsChangeLog (boolean IsChangeLog)
{
set_Value (COLUMNNAME_IsChangeLog, Boolean.valueOf(IsChangeLog));
}
/** Get Maintain Change Log.
@return Maintain a log of changes */
public boolean isChangeLog() 
{
Object oo = get_Value(COLUMNNAME_IsChangeLog);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="cbac49b9-ce10-3ae6-d974-335fe778a5b1")
public static String es_PE_FIELD_Role_MaintainChangeLog_Name="Mantenimiento de Cambios de Log";

@XendraTrl(Identifier="cbac49b9-ce10-3ae6-d974-335fe778a5b1")
public static String es_PE_FIELD_Role_MaintainChangeLog_Description="Mantenimiento de cambios de registro.";

@XendraTrl(Identifier="cbac49b9-ce10-3ae6-d974-335fe778a5b1")
public static String es_PE_FIELD_Role_MaintainChangeLog_Help="Si está seleccionado, un registro de todos los cambios de mantiene.";

@XendraField(AD_Column_ID="IsChangeLog",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cbac49b9-ce10-3ae6-d974-335fe778a5b1")
public static final String FIELDNAME_Role_MaintainChangeLog="cbac49b9-ce10-3ae6-d974-335fe778a5b1";

@XendraTrl(Identifier="1cc4b4a0-13ca-f026-a803-71262b0cef47")
public static String es_PE_FIELD_Role_MaintainChangeLog2_Name="Mantenimiento de Cambios de Log";

@XendraTrl(Identifier="1cc4b4a0-13ca-f026-a803-71262b0cef47")
public static String es_PE_FIELD_Role_MaintainChangeLog2_Description="Mantenimiento de cambios de registro.";

@XendraTrl(Identifier="1cc4b4a0-13ca-f026-a803-71262b0cef47")
public static String es_PE_FIELD_Role_MaintainChangeLog2_Help="Si está seleccionado, un registro de todos los cambios de mantiene.";

@XendraField(AD_Column_ID="IsChangeLog",IsCentrallyMaintained=true,
AD_Tab_ID="bb74c0c5-65c7-e59d-110d-ef40c54c72fd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1cc4b4a0-13ca-f026-a803-71262b0cef47")
public static final String FIELDNAME_Role_MaintainChangeLog2="1cc4b4a0-13ca-f026-a803-71262b0cef47";

@XendraTrl(Identifier="5f657b66-b9ed-63af-dfe5-a2c95ae9156a")
public static String es_PE_COLUMN_IsChangeLog_Name="Mantenimiento de Cambios de Log";

@XendraColumn(AD_Element_ID="63cfbe02-8817-b677-b5a2-24ed2145326c",ColumnName="IsChangeLog",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5f657b66-b9ed-63af-dfe5-a2c95ae9156a",
Synchronized="2019-08-30 22:20:39.0")
/** Column name IsChangeLog */
public static final String COLUMNNAME_IsChangeLog = "IsChangeLog";
/** Set Manual.
@param IsManual This is a manual process */
public void setIsManual (boolean IsManual)
{
set_Value (COLUMNNAME_IsManual, Boolean.valueOf(IsManual));
}
/** Get Manual.
@return This is a manual process */
public boolean isManual() 
{
Object oo = get_Value(COLUMNNAME_IsManual);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="011f595c-1524-0672-1460-7f5a086a287a")
public static String es_PE_FIELD_Role_Manual_Name="Manual";

@XendraTrl(Identifier="011f595c-1524-0672-1460-7f5a086a287a")
public static String es_PE_FIELD_Role_Manual_Description="Éste es un proceso manual.";

@XendraTrl(Identifier="011f595c-1524-0672-1460-7f5a086a287a")
public static String es_PE_FIELD_Role_Manual_Help="El cuadro de verificación manual indica si el proceso será hecho manualmente.";

@XendraField(AD_Column_ID="IsManual",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="011f595c-1524-0672-1460-7f5a086a287a")
public static final String FIELDNAME_Role_Manual="011f595c-1524-0672-1460-7f5a086a287a";

@XendraTrl(Identifier="77b0f573-1d33-3fd3-812b-c25e65cad536")
public static String es_PE_FIELD_Role_Manual2_Name="Manual";

@XendraTrl(Identifier="77b0f573-1d33-3fd3-812b-c25e65cad536")
public static String es_PE_FIELD_Role_Manual2_Description="Éste es un proceso manual.";

@XendraTrl(Identifier="77b0f573-1d33-3fd3-812b-c25e65cad536")
public static String es_PE_FIELD_Role_Manual2_Help="El cuadro de verificación manual indica si el proceso será hecho manualmente.";

@XendraField(AD_Column_ID="IsManual",IsCentrallyMaintained=true,
AD_Tab_ID="bb74c0c5-65c7-e59d-110d-ef40c54c72fd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="77b0f573-1d33-3fd3-812b-c25e65cad536")
public static final String FIELDNAME_Role_Manual2="77b0f573-1d33-3fd3-812b-c25e65cad536";

@XendraTrl(Identifier="5c089fe1-c711-6a1b-fd46-4c9d7a4f7de3")
public static String es_PE_COLUMN_IsManual_Name="Manual";

@XendraColumn(AD_Element_ID="064afee2-bc1c-12d9-20dc-97a2318dc359",ColumnName="IsManual",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5c089fe1-c711-6a1b-fd46-4c9d7a4f7de3",
Synchronized="2019-08-30 22:20:39.0")
/** Column name IsManual */
public static final String COLUMNNAME_IsManual = "IsManual";
/** Set IsOnlySoPriceListAccess.
@param IsOnlySoPriceListAccess IsOnlySoPriceListAccess */
public void setIsOnlySoPriceListAccess (boolean IsOnlySoPriceListAccess)
{
set_Value (COLUMNNAME_IsOnlySoPriceListAccess, Boolean.valueOf(IsOnlySoPriceListAccess));
}
/** Get IsOnlySoPriceListAccess.
@return IsOnlySoPriceListAccess */
public boolean isOnlySoPriceListAccess() 
{
Object oo = get_Value(COLUMNNAME_IsOnlySoPriceListAccess);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="ba69d277-be2f-cba9-9b21-61045262e29f")
public static String es_PE_FIELD_Role_IsOnlySoPriceListAccess_Name="Solo Lista de Precios Venta";

@XendraField(AD_Column_ID="IsOnlySoPriceListAccess",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ba69d277-be2f-cba9-9b21-61045262e29f")
public static final String FIELDNAME_Role_IsOnlySoPriceListAccess="ba69d277-be2f-cba9-9b21-61045262e29f";

@XendraTrl(Identifier="87cb1caa-b2a8-00c8-617f-3c90b81b702a")
public static String es_PE_COLUMN_IsOnlySoPriceListAccess_Name="Isonlysopricelistaccess";

@XendraColumn(AD_Element_ID="eb3ed615-8035-aa2e-7f93-680c6970f2f8",
ColumnName="IsOnlySoPriceListAccess",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="87cb1caa-b2a8-00c8-617f-3c90b81b702a",Synchronized="2019-08-30 22:20:39.0")
/** Column name IsOnlySoPriceListAccess */
public static final String COLUMNNAME_IsOnlySoPriceListAccess = "IsOnlySoPriceListAccess";
/** Set Personal Access.
@param IsPersonalAccess Allow access to all personal records */
public void setIsPersonalAccess (boolean IsPersonalAccess)
{
set_Value (COLUMNNAME_IsPersonalAccess, Boolean.valueOf(IsPersonalAccess));
}
/** Get Personal Access.
@return Allow access to all personal records */
public boolean isPersonalAccess() 
{
Object oo = get_Value(COLUMNNAME_IsPersonalAccess);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="159a3705-1893-2ddf-f473-96a5955fbb64")
public static String es_PE_FIELD_Role_PersonalAccess_Name="Acceso Personal";

@XendraTrl(Identifier="159a3705-1893-2ddf-f473-96a5955fbb64")
public static String es_PE_FIELD_Role_PersonalAccess_Description="Permite el acceso para todo los registros de personal.";

@XendraTrl(Identifier="159a3705-1893-2ddf-f473-96a5955fbb64")
public static String es_PE_FIELD_Role_PersonalAccess_Help="Usar de este rol tiene acceso a todos los registros del personal.";

@XendraField(AD_Column_ID="IsPersonalAccess",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="159a3705-1893-2ddf-f473-96a5955fbb64")
public static final String FIELDNAME_Role_PersonalAccess="159a3705-1893-2ddf-f473-96a5955fbb64";

@XendraTrl(Identifier="6dea7b6b-d892-0a0f-55f4-b2d92305a8c8")
public static String es_PE_FIELD_Role_PersonalAccess2_Name="Acceso Personal";

@XendraTrl(Identifier="6dea7b6b-d892-0a0f-55f4-b2d92305a8c8")
public static String es_PE_FIELD_Role_PersonalAccess2_Description="Permite el acceso para todo los registros de personal.";

@XendraTrl(Identifier="6dea7b6b-d892-0a0f-55f4-b2d92305a8c8")
public static String es_PE_FIELD_Role_PersonalAccess2_Help="Usar de este rol tiene acceso a todos los registros del personal.";

@XendraField(AD_Column_ID="IsPersonalAccess",IsCentrallyMaintained=true,
AD_Tab_ID="bb74c0c5-65c7-e59d-110d-ef40c54c72fd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6dea7b6b-d892-0a0f-55f4-b2d92305a8c8")
public static final String FIELDNAME_Role_PersonalAccess2="6dea7b6b-d892-0a0f-55f4-b2d92305a8c8";

@XendraTrl(Identifier="adc851e5-3549-50dd-29db-76a607465635")
public static String es_PE_COLUMN_IsPersonalAccess_Name="Acceso Personal";

@XendraColumn(AD_Element_ID="9c072af3-a5d7-df8b-c73a-2caad4b951ce",ColumnName="IsPersonalAccess",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="adc851e5-3549-50dd-29db-76a607465635",
Synchronized="2019-08-30 22:20:39.0")
/** Column name IsPersonalAccess */
public static final String COLUMNNAME_IsPersonalAccess = "IsPersonalAccess";
/** Set Personal Lock.
@param IsPersonalLock Allow users with role to lock access to personal records */
public void setIsPersonalLock (boolean IsPersonalLock)
{
set_Value (COLUMNNAME_IsPersonalLock, Boolean.valueOf(IsPersonalLock));
}
/** Get Personal Lock.
@return Allow users with role to lock access to personal records */
public boolean isPersonalLock() 
{
Object oo = get_Value(COLUMNNAME_IsPersonalLock);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="103c30ba-0efd-ba4c-6e48-dc38ee591645")
public static String es_PE_FIELD_Role_PersonalLock_Name="Bloqueo Personal";

@XendraTrl(Identifier="103c30ba-0efd-ba4c-6e48-dc38ee591645")
public static String es_PE_FIELD_Role_PersonalLock_Description="Permita que los usuarios con papel bloqueen el acceso a los expedientes personales";

@XendraTrl(Identifier="103c30ba-0efd-ba4c-6e48-dc38ee591645")
public static String es_PE_FIELD_Role_PersonalLock_Help="Si está permitido, el usuario con el papel puede prevenir el acceso de otros a los expedientes personales. Si un expediente es bloqueado, sólo el usuario ó la gente que puede leer expedientes bloqueados personales puede ver el expediente.";

@XendraField(AD_Column_ID="IsPersonalLock",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="103c30ba-0efd-ba4c-6e48-dc38ee591645")
public static final String FIELDNAME_Role_PersonalLock="103c30ba-0efd-ba4c-6e48-dc38ee591645";

@XendraTrl(Identifier="9004f99d-7dbf-9a44-db8e-fd97054a1bf1")
public static String es_PE_FIELD_Role_PersonalLock2_Name="Bloqueo Personal";

@XendraTrl(Identifier="9004f99d-7dbf-9a44-db8e-fd97054a1bf1")
public static String es_PE_FIELD_Role_PersonalLock2_Description="Permita que los usuarios con papel bloqueen el acceso a los expedientes personales";

@XendraTrl(Identifier="9004f99d-7dbf-9a44-db8e-fd97054a1bf1")
public static String es_PE_FIELD_Role_PersonalLock2_Help="Si está permitido, el usuario con el papel puede prevenir el acceso de otros a los expedientes personales. Si un expediente es bloqueado, sólo el usuario ó la gente que puede leer expedientes bloqueados personales puede ver el expediente.";

@XendraField(AD_Column_ID="IsPersonalLock",IsCentrallyMaintained=true,
AD_Tab_ID="bb74c0c5-65c7-e59d-110d-ef40c54c72fd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9004f99d-7dbf-9a44-db8e-fd97054a1bf1")
public static final String FIELDNAME_Role_PersonalLock2="9004f99d-7dbf-9a44-db8e-fd97054a1bf1";

@XendraTrl(Identifier="5d2bf548-3745-b03c-793a-d04b6cc24f5f")
public static String es_PE_COLUMN_IsPersonalLock_Name="Bloqueo Personal";

@XendraColumn(AD_Element_ID="4557c733-3dd8-181e-bcf7-4c7f2b64b1cf",ColumnName="IsPersonalLock",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5d2bf548-3745-b03c-793a-d04b6cc24f5f",
Synchronized="2019-08-30 22:20:39.0")
/** Column name IsPersonalLock */
public static final String COLUMNNAME_IsPersonalLock = "IsPersonalLock";
/** Set Show Accounting.
@param IsShowAcct Users with this role can see accounting information */
public void setIsShowAcct (boolean IsShowAcct)
{
set_Value (COLUMNNAME_IsShowAcct, Boolean.valueOf(IsShowAcct));
}
/** Get Show Accounting.
@return Users with this role can see accounting information */
public boolean isShowAcct() 
{
Object oo = get_Value(COLUMNNAME_IsShowAcct);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f5676ff5-33c9-468c-0ff6-f3d83903b5b0")
public static String es_PE_FIELD_Role_ShowAccounting_Name="Muestra Contabilidad";

@XendraTrl(Identifier="f5676ff5-33c9-468c-0ff6-f3d83903b5b0")
public static String es_PE_FIELD_Role_ShowAccounting_Description="Los usuarios con este rol pueden ver la información de contabilidad.";

@XendraField(AD_Column_ID="IsShowAcct",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f5676ff5-33c9-468c-0ff6-f3d83903b5b0")
public static final String FIELDNAME_Role_ShowAccounting="f5676ff5-33c9-468c-0ff6-f3d83903b5b0";

@XendraTrl(Identifier="d1c4e304-2750-30f6-b474-ff83d10829f4")
public static String es_PE_FIELD_Role_ShowAccounting2_Name="Muestra Contabilidad";

@XendraTrl(Identifier="d1c4e304-2750-30f6-b474-ff83d10829f4")
public static String es_PE_FIELD_Role_ShowAccounting2_Description="Los usuarios con este rol pueden ver la información de contabilidad.";

@XendraField(AD_Column_ID="IsShowAcct",IsCentrallyMaintained=true,
AD_Tab_ID="bb74c0c5-65c7-e59d-110d-ef40c54c72fd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d1c4e304-2750-30f6-b474-ff83d10829f4")
public static final String FIELDNAME_Role_ShowAccounting2="d1c4e304-2750-30f6-b474-ff83d10829f4";

@XendraTrl(Identifier="39be525f-ceff-f060-4575-92e7213f974c")
public static String es_PE_COLUMN_IsShowAcct_Name="Muestra Contabilidad";

@XendraColumn(AD_Element_ID="5ac5977b-5ed6-2af7-0aa9-49621e1a3440",ColumnName="IsShowAcct",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="39be525f-ceff-f060-4575-92e7213f974c",
Synchronized="2019-08-30 22:20:39.0")
/** Column name IsShowAcct */
public static final String COLUMNNAME_IsShowAcct = "IsShowAcct";
/** Set IsSuperUser.
@param IsSuperUser IsSuperUser */
public void setIsSuperUser (boolean IsSuperUser)
{
set_Value (COLUMNNAME_IsSuperUser, Boolean.valueOf(IsSuperUser));
}
/** Get IsSuperUser.
@return IsSuperUser */
public boolean isSuperUser() 
{
Object oo = get_Value(COLUMNNAME_IsSuperUser);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="4b39e6f0-c06e-9dba-0bda-1b8f6138eafb")
public static String es_PE_FIELD_Role_IsSuperUser_Name="SuperUsuario";

@XendraTrl(Identifier="4b39e6f0-c06e-9dba-0bda-1b8f6138eafb")
public static String es_PE_FIELD_Role_IsSuperUser_Description="Usuario que puede modificar datos";

@XendraField(AD_Column_ID="IsSuperUser",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=420,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2015-11-23 15:25:24.0",
Identifier="4b39e6f0-c06e-9dba-0bda-1b8f6138eafb")
public static final String FIELDNAME_Role_IsSuperUser="4b39e6f0-c06e-9dba-0bda-1b8f6138eafb";

@XendraTrl(Identifier="6596c361-9e3d-4c88-8bf1-67f1061e0d44")
public static String es_PE_COLUMN_IsSuperUser_Name="issuperuser";

@XendraColumn(AD_Element_ID="f5f5fcaa-01b1-4bf6-be8c-0bab740501bf",ColumnName="IsSuperUser",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6596c361-9e3d-4c88-8bf1-67f1061e0d44",
Synchronized="2019-08-30 22:20:39.0")
/** Column name IsSuperUser */
public static final String COLUMNNAME_IsSuperUser = "IsSuperUser";
/** Set Use User Org Access.
@param IsUseUserOrgAccess Use Org Access defined by user instead of Role Org Access */
public void setIsUseUserOrgAccess (boolean IsUseUserOrgAccess)
{
set_Value (COLUMNNAME_IsUseUserOrgAccess, Boolean.valueOf(IsUseUserOrgAccess));
}
/** Get Use User Org Access.
@return Use Org Access defined by user instead of Role Org Access */
public boolean isUseUserOrgAccess() 
{
Object oo = get_Value(COLUMNNAME_IsUseUserOrgAccess);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="8c8a633e-7f64-10c2-dcb1-33e97a02fbd4")
public static String es_PE_FIELD_Role_UseUserOrgAccess_Name="El Usuario usa Acceso a Organización";

@XendraTrl(Identifier="8c8a633e-7f64-10c2-dcb1-33e97a02fbd4")
public static String es_PE_FIELD_Role_UseUserOrgAccess_Description="Utilice el acceso de Org. definido por el usuario en vez del acceso de Org. de rol";

@XendraTrl(Identifier="8c8a633e-7f64-10c2-dcb1-33e97a02fbd4")
public static String es_PE_FIELD_Role_UseUserOrgAccess_Help="Usted puede definir el acceso a la organización por Rol ó por User. Usted seleccionaría esto, si usted tiene muchas organizaciones.";

@XendraField(AD_Column_ID="IsUseUserOrgAccess",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsAccessAllOrgs@=N",DisplayLength=1,IsReadOnly=false,SeqNo=200,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="8c8a633e-7f64-10c2-dcb1-33e97a02fbd4")
public static final String FIELDNAME_Role_UseUserOrgAccess="8c8a633e-7f64-10c2-dcb1-33e97a02fbd4";

@XendraTrl(Identifier="a1879ccd-c610-07e9-9b57-1f4166df43a4")
public static String es_PE_FIELD_Role_UseUserOrgAccess2_Name="El Usuario usa Acceso a Organización";

@XendraTrl(Identifier="a1879ccd-c610-07e9-9b57-1f4166df43a4")
public static String es_PE_FIELD_Role_UseUserOrgAccess2_Description="Utilice el acceso de Org. definido por el usuario en vez del acceso de Org. de rol";

@XendraTrl(Identifier="a1879ccd-c610-07e9-9b57-1f4166df43a4")
public static String es_PE_FIELD_Role_UseUserOrgAccess2_Help="Usted puede definir el acceso a la organización por Rol ó por User. Usted seleccionaría esto, si usted tiene muchas organizaciones.";

@XendraField(AD_Column_ID="IsUseUserOrgAccess",IsCentrallyMaintained=true,
AD_Tab_ID="bb74c0c5-65c7-e59d-110d-ef40c54c72fd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a1879ccd-c610-07e9-9b57-1f4166df43a4")
public static final String FIELDNAME_Role_UseUserOrgAccess2="a1879ccd-c610-07e9-9b57-1f4166df43a4";

@XendraTrl(Identifier="a248f449-c1c0-9b6b-da6b-1900d5eda245")
public static String es_PE_COLUMN_IsUseUserOrgAccess_Name="El Usuario usa Acceso a Organización";

@XendraColumn(AD_Element_ID="0ccafed8-5bea-300a-3b20-20b441fde8ac",ColumnName="IsUseUserOrgAccess",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a248f449-c1c0-9b6b-da6b-1900d5eda245",
Synchronized="2019-08-30 22:20:39.0")
/** Column name IsUseUserOrgAccess */
public static final String COLUMNNAME_IsUseUserOrgAccess = "IsUseUserOrgAccess";
/** Set Max Query Records.
@param MaxQueryRecords If defined, you cannot query more records as defined - the query criteria needs to be changed to query less records */
public void setMaxQueryRecords (int MaxQueryRecords)
{
set_Value (COLUMNNAME_MaxQueryRecords, Integer.valueOf(MaxQueryRecords));
}
/** Get Max Query Records.
@return If defined, you cannot query more records as defined - the query criteria needs to be changed to query less records */
public int getMaxQueryRecords() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_MaxQueryRecords);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="65ec55a6-dba5-ee65-9eea-d7bc6f9e9059")
public static String es_PE_FIELD_Role_MaxQueryRecords_Name="Registros Consulta Máx ";

@XendraTrl(Identifier="65ec55a6-dba5-ee65-9eea-d7bc6f9e9059")
public static String es_PE_FIELD_Role_MaxQueryRecords_Description="Si definió, usted no podrá consultar más registro que los definidos - el criterio de consultas debe ser cambiado  a menos que el No de registros existentes";

@XendraTrl(Identifier="65ec55a6-dba5-ee65-9eea-d7bc6f9e9059")
public static String es_PE_FIELD_Role_MaxQueryRecords_Help="Ingrese el número de registros que un usuario podrá consultar para cancelar cargas innecesarias en el sistema. Si es 0, no se impondrán restricciónes.  ";

@XendraField(AD_Column_ID="MaxQueryRecords",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="65ec55a6-dba5-ee65-9eea-d7bc6f9e9059")
public static final String FIELDNAME_Role_MaxQueryRecords="65ec55a6-dba5-ee65-9eea-d7bc6f9e9059";

@XendraTrl(Identifier="099326f2-0c5c-0db5-a0c8-91212e4e5071")
public static String es_PE_COLUMN_MaxQueryRecords_Name="Registros Consulta Máx ";

@XendraColumn(AD_Element_ID="822029fd-00be-cf0e-6b85-88d4604cf594",ColumnName="MaxQueryRecords",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="099326f2-0c5c-0db5-a0c8-91212e4e5071",
Synchronized="2019-08-30 22:20:39.0")
/** Column name MaxQueryRecords */
public static final String COLUMNNAME_MaxQueryRecords = "MaxQueryRecords";
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

@XendraTrl(Identifier="2a5dbb8a-c1f0-d795-804d-e66c91b0937d")
public static String es_PE_FIELD_Role_Name_Name="Nombre";

@XendraTrl(Identifier="2a5dbb8a-c1f0-d795-804d-e66c91b0937d")
public static String es_PE_FIELD_Role_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="2a5dbb8a-c1f0-d795-804d-e66c91b0937d")
public static String es_PE_FIELD_Role_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2a5dbb8a-c1f0-d795-804d-e66c91b0937d")
public static final String FIELDNAME_Role_Name="2a5dbb8a-c1f0-d795-804d-e66c91b0937d";

@XendraTrl(Identifier="4568a7b4-4fd7-5a18-874d-4bef0af4ab35")
public static String es_PE_FIELD_Role_Name2_Name="Nombre";

@XendraTrl(Identifier="4568a7b4-4fd7-5a18-874d-4bef0af4ab35")
public static String es_PE_FIELD_Role_Name2_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="4568a7b4-4fd7-5a18-874d-4bef0af4ab35")
public static String es_PE_FIELD_Role_Name2_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="bb74c0c5-65c7-e59d-110d-ef40c54c72fd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4568a7b4-4fd7-5a18-874d-4bef0af4ab35")
public static final String FIELDNAME_Role_Name2="4568a7b4-4fd7-5a18-874d-4bef0af4ab35";

@XendraTrl(Identifier="2bb6bb58-5214-d558-86da-2e63a6780ac9")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2bb6bb58-5214-d558-86da-2e63a6780ac9",
Synchronized="2019-08-30 22:20:39.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set OverwritePriceLimit.
@param OverwritePriceLimit Overwrite Price Limit if the Price List  enforces the Price Limit */
public void setOverwritePriceLimit (boolean OverwritePriceLimit)
{
set_Value (COLUMNNAME_OverwritePriceLimit, Boolean.valueOf(OverwritePriceLimit));
}
/** Get OverwritePriceLimit.
@return Overwrite Price Limit if the Price List  enforces the Price Limit */
public boolean isOverwritePriceLimit() 
{
Object oo = get_Value(COLUMNNAME_OverwritePriceLimit);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="5d182eca-c246-05ff-faeb-3b6af98fc5f0")
public static String es_PE_FIELD_Role_OverwritePriceLimit_Name="Sobreescribe Precio Limite";

@XendraTrl(Identifier="5d182eca-c246-05ff-faeb-3b6af98fc5f0")
public static String es_PE_FIELD_Role_OverwritePriceLimit_Description="Sobreescribe el precio limite si el precio de lista cumple con el limite de precio.";

@XendraTrl(Identifier="5d182eca-c246-05ff-faeb-3b6af98fc5f0")
public static String es_PE_FIELD_Role_OverwritePriceLimit_Help="La lista de precios permite cumplir el límite del precio. Si el grupo, a usar con este rol puede sobreescribir el precio limite (ej. incorpore cualquier precio)";

@XendraField(AD_Column_ID="OverwritePriceLimit",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5d182eca-c246-05ff-faeb-3b6af98fc5f0")
public static final String FIELDNAME_Role_OverwritePriceLimit="5d182eca-c246-05ff-faeb-3b6af98fc5f0";

@XendraTrl(Identifier="80829bfd-a40f-abda-75d6-e88387774664")
public static String es_PE_FIELD_Role_OverwritePriceLimit2_Name="Sobreescribe Precio Limite";

@XendraTrl(Identifier="80829bfd-a40f-abda-75d6-e88387774664")
public static String es_PE_FIELD_Role_OverwritePriceLimit2_Description="Sobreescribe el precio limite si el precio de lista cumple con el limite de precio.";

@XendraTrl(Identifier="80829bfd-a40f-abda-75d6-e88387774664")
public static String es_PE_FIELD_Role_OverwritePriceLimit2_Help="La lista de precios permite cumplir el límite del precio. Si el grupo, a usar con este rol puede sobreescribir el precio limite (ej. incorpore cualquier precio)";

@XendraField(AD_Column_ID="OverwritePriceLimit",IsCentrallyMaintained=true,
AD_Tab_ID="bb74c0c5-65c7-e59d-110d-ef40c54c72fd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="80829bfd-a40f-abda-75d6-e88387774664")
public static final String FIELDNAME_Role_OverwritePriceLimit2="80829bfd-a40f-abda-75d6-e88387774664";

@XendraTrl(Identifier="4bd2dccf-8aaf-8371-c80b-6a8aa3feafa7")
public static String es_PE_COLUMN_OverwritePriceLimit_Name="Sobreescribe Precio Limite";

@XendraColumn(AD_Element_ID="72aff687-ec33-ead0-6b4a-87301c9cfb3e",
ColumnName="OverwritePriceLimit",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4bd2dccf-8aaf-8371-c80b-6a8aa3feafa7",Synchronized="2019-08-30 22:20:39.0")
/** Column name OverwritePriceLimit */
public static final String COLUMNNAME_OverwritePriceLimit = "OverwritePriceLimit";
/** Set Preference Level.
@param PreferenceType Determines what preferences the user can set */
public void setPreferenceType (String PreferenceType)
{
if (PreferenceType.length() > 1)
{
log.warning("Length > 1 - truncated");
PreferenceType = PreferenceType.substring(0,0);
}
set_Value (COLUMNNAME_PreferenceType, PreferenceType);
}
/** Get Preference Level.
@return Determines what preferences the user can set */
public String getPreferenceType() 
{
return (String)get_Value(COLUMNNAME_PreferenceType);
}

@XendraTrl(Identifier="0a55742b-43de-4a2a-75ee-696d723c3069")
public static String es_PE_FIELD_Role_PreferenceLevel_Name="Nivel de preferencia";

@XendraTrl(Identifier="0a55742b-43de-4a2a-75ee-696d723c3069")
public static String es_PE_FIELD_Role_PreferenceLevel_Description="Se determina que preferencia puede fijar el usuario.";

@XendraTrl(Identifier="0a55742b-43de-4a2a-75ee-696d723c3069")
public static String es_PE_FIELD_Role_PreferenceLevel_Help="Las preferencias permiten que usted defina los valores por defaul. Sin ningun sistema, usted no puede fijar ninguna preferencia del valor. Solamente con sistema al cliente, usted puede ver el registro del cambio de expediente.";

@XendraField(AD_Column_ID="PreferenceType",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0a55742b-43de-4a2a-75ee-696d723c3069")
public static final String FIELDNAME_Role_PreferenceLevel="0a55742b-43de-4a2a-75ee-696d723c3069";

@XendraTrl(Identifier="28b284f1-ec51-0622-31df-c9184c7f3c70")
public static String es_PE_FIELD_Role_PreferenceLevel2_Name="Nivel de preferencia";

@XendraTrl(Identifier="28b284f1-ec51-0622-31df-c9184c7f3c70")
public static String es_PE_FIELD_Role_PreferenceLevel2_Description="Se determina que preferencia puede fijar el usuario.";

@XendraTrl(Identifier="28b284f1-ec51-0622-31df-c9184c7f3c70")
public static String es_PE_FIELD_Role_PreferenceLevel2_Help="Las preferencias permiten que usted defina los valores por defaul. Sin ningun sistema, usted no puede fijar ninguna preferencia del valor. Solamente con sistema al cliente, usted puede ver el registro del cambio de expediente.";

@XendraField(AD_Column_ID="PreferenceType",IsCentrallyMaintained=true,
AD_Tab_ID="bb74c0c5-65c7-e59d-110d-ef40c54c72fd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="28b284f1-ec51-0622-31df-c9184c7f3c70")
public static final String FIELDNAME_Role_PreferenceLevel2="28b284f1-ec51-0622-31df-c9184c7f3c70";

@XendraTrl(Identifier="35c09975-5e9f-7290-9f30-86d7db072c16")
public static String es_PE_COLUMN_PreferenceType_Name="Nivel de preferencia";

@XendraColumn(AD_Element_ID="c15f71ea-52bc-693a-c2b2-543c80eb9fdc",ColumnName="PreferenceType",
AD_Reference_ID=17,AD_Reference_Value_ID="83b3b2cc-4339-890c-90a4-99b01403480b",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="O",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="35c09975-5e9f-7290-9f30-86d7db072c16",Synchronized="2019-08-30 22:20:39.0")
/** Column name PreferenceType */
public static final String COLUMNNAME_PreferenceType = "PreferenceType";
/** Set Supervisor.
@param Supervisor_ID Supervisor for this user/organization - used for escalation and approval */
public void setSupervisor_ID (int Supervisor_ID)
{
if (Supervisor_ID <= 0) set_Value (COLUMNNAME_Supervisor_ID, null);
 else 
set_Value (COLUMNNAME_Supervisor_ID, Integer.valueOf(Supervisor_ID));
}
/** Get Supervisor.
@return Supervisor for this user/organization - used for escalation and approval */
public int getSupervisor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Supervisor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6ce66266-a4ce-0bd2-98bf-8928b5f257d1")
public static String es_PE_FIELD_Role_Supervisor_Name="Supervisor";

@XendraTrl(Identifier="6ce66266-a4ce-0bd2-98bf-8928b5f257d1")
public static String es_PE_FIELD_Role_Supervisor_Description="Supervisor para este usuario - usado para escalación";

@XendraTrl(Identifier="6ce66266-a4ce-0bd2-98bf-8928b5f257d1")
public static String es_PE_FIELD_Role_Supervisor_Help="El supervisor indica quien será usado para reenviar y escalar emisiones este usuario.";

@XendraField(AD_Column_ID="Supervisor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6ce66266-a4ce-0bd2-98bf-8928b5f257d1")
public static final String FIELDNAME_Role_Supervisor="6ce66266-a4ce-0bd2-98bf-8928b5f257d1";

@XendraTrl(Identifier="188f107b-9715-2c39-a177-f059016f27fa")
public static String es_PE_FIELD_Role_Supervisor2_Name="Supervisor";

@XendraTrl(Identifier="188f107b-9715-2c39-a177-f059016f27fa")
public static String es_PE_FIELD_Role_Supervisor2_Description="Supervisor para este usuario - usado para escalación";

@XendraTrl(Identifier="188f107b-9715-2c39-a177-f059016f27fa")
public static String es_PE_FIELD_Role_Supervisor2_Help="El supervisor indica quien será usado para reenviar y escalar emisiones este usuario.";

@XendraField(AD_Column_ID="Supervisor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bb74c0c5-65c7-e59d-110d-ef40c54c72fd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="188f107b-9715-2c39-a177-f059016f27fa")
public static final String FIELDNAME_Role_Supervisor2="188f107b-9715-2c39-a177-f059016f27fa";

@XendraTrl(Identifier="54eca3fc-9728-560c-35e3-824e8cd449ee")
public static String es_PE_COLUMN_Supervisor_ID_Name="Supervisor";

@XendraColumn(AD_Element_ID="cb6ad258-6bb2-80b2-a90f-63c4d947479b",ColumnName="Supervisor_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="91f52193-02ab-6545-99f8-d6d30b9d03a1",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="54eca3fc-9728-560c-35e3-824e8cd449ee",Synchronized="2019-08-30 22:20:39.0")
/** Column name Supervisor_ID */
public static final String COLUMNNAME_Supervisor_ID = "Supervisor_ID";
/** Set User Level.
@param UserLevel System Client Organization */
public void setUserLevel (String UserLevel)
{
if (UserLevel.length() > 3)
{
log.warning("Length > 3 - truncated");
UserLevel = UserLevel.substring(0,2);
}
set_Value (COLUMNNAME_UserLevel, UserLevel);
}
/** Get User Level.
@return System Client Organization */
public String getUserLevel() 
{
return (String)get_Value(COLUMNNAME_UserLevel);
}

@XendraTrl(Identifier="7fd3b781-a2db-e34f-19be-49c9a9ae1b2e")
public static String es_PE_FIELD_Role_UserLevel_Name="Nivel del Usuario";

@XendraTrl(Identifier="7fd3b781-a2db-e34f-19be-49c9a9ae1b2e")
public static String es_PE_FIELD_Role_UserLevel_Description="Sistema compañía organización.";

@XendraTrl(Identifier="7fd3b781-a2db-e34f-19be-49c9a9ae1b2e")
public static String es_PE_FIELD_Role_UserLevel_Help="El campo Nivel de Usuario determina si los usuarios de este perfil tendrán acceso a datos de nivel de sistema ; datos de nivel de organización; datos a nivel de compañía ó datos a nivel compañía y organización.";

@XendraField(AD_Column_ID="UserLevel",IsCentrallyMaintained=true,
AD_Tab_ID="c7b6e4ec-ddc3-5029-e929-f9f0b0526479",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7fd3b781-a2db-e34f-19be-49c9a9ae1b2e")
public static final String FIELDNAME_Role_UserLevel="7fd3b781-a2db-e34f-19be-49c9a9ae1b2e";

@XendraTrl(Identifier="99065d59-c6e3-1590-1666-15af764964ed")
public static String es_PE_FIELD_Role_UserLevel2_Name="Nivel del Usuario";

@XendraTrl(Identifier="99065d59-c6e3-1590-1666-15af764964ed")
public static String es_PE_FIELD_Role_UserLevel2_Description="Sistema compañía organización.";

@XendraTrl(Identifier="99065d59-c6e3-1590-1666-15af764964ed")
public static String es_PE_FIELD_Role_UserLevel2_Help="El campo Nivel de Usuario determina si los usuarios de este perfil tendrán acceso a datos de nivel de sistema ; datos de nivel de organización; datos a nivel de compañía ó datos a nivel compañía y organización.";

@XendraField(AD_Column_ID="UserLevel",IsCentrallyMaintained=true,
AD_Tab_ID="bb74c0c5-65c7-e59d-110d-ef40c54c72fd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="99065d59-c6e3-1590-1666-15af764964ed")
public static final String FIELDNAME_Role_UserLevel2="99065d59-c6e3-1590-1666-15af764964ed";

@XendraTrl(Identifier="0fff82ee-ae82-a659-2e1c-7e2b6bb235ab")
public static String es_PE_COLUMN_UserLevel_Name="Nivel del Usuario";

@XendraColumn(AD_Element_ID="204903a2-a5e8-2b6f-a0f4-ea6d30dcd19f",ColumnName="UserLevel",
AD_Reference_ID=17,AD_Reference_Value_ID="b911f62a-deaa-a655-7d6d-437cb3f05cac",AD_Val_Rule_ID="",
FieldLength=3,DefaultValue="O",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="@IsManual@=Y",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0fff82ee-ae82-a659-2e1c-7e2b6bb235ab",Synchronized="2019-08-30 22:20:39.0")
/** Column name UserLevel */
public static final String COLUMNNAME_UserLevel = "UserLevel";
}
