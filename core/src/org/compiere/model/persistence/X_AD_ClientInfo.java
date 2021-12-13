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
/** Generated Model for AD_ClientInfo
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_ClientInfo extends PO
{
/** Standard Constructor
@param ctx context
@param AD_ClientInfo_ID id
@param trxName transaction
*/
public X_AD_ClientInfo (Properties ctx, int AD_ClientInfo_ID, String trxName)
{
super (ctx, AD_ClientInfo_ID, trxName);
/** if (AD_ClientInfo_ID == 0)
{
setIsDiscountLineAmt (false);	
// N
setIsRetention (false);	
// N
setTaxID (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_ClientInfo (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=227 */
public static int Table_ID=MTable.getTable_ID("AD_ClientInfo");

@XendraTrl(Identifier="40ab9f8f-60e6-5944-f74c-e68258e364fd")
public static String es_PE_TAB_ClientInfo_Description="Información de la compañía";

@XendraTrl(Identifier="40ab9f8f-60e6-5944-f74c-e68258e364fd")
public static String es_PE_TAB_ClientInfo_Help="La pestaña de información de la compañía define los detalles de cada compañía. Las reglas contables y los valores predeterminados de alto nivel son definidos aquí.";

@XendraTrl(Identifier="40ab9f8f-60e6-5944-f74c-e68258e364fd")
public static String es_PE_TAB_ClientInfo_Name="Información de Compañía";

@XendraTab(Name="Client Info",Description="Client Info",
Help="The Client Info Tab defines the details for each client.  The accounting rules and high level defaults are defined here. The Calendar is used to determine if a period is open or closed.",
AD_Window_ID="e44db880-39fd-a94c-7bc3-d8740a7efd77",SeqNo=20,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",
CommitWarning="You need re-login and restart your application server for most changes made here to be effective.",
AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,
Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,IsAdvancedTab=false,
Parent_Column_ID="",Identifier="40ab9f8f-60e6-5944-f74c-e68258e364fd",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ClientInfo="40ab9f8f-60e6-5944-f74c-e68258e364fd";

@XendraTrl(Identifier="b7f00285-8795-2e21-05f2-c5769fe315e7")
public static String es_PE_TABLE_AD_ClientInfo_Name="AD_ClientInfo";

@XendraTable(Name="AD_ClientInfo",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="AD_ClientInfo",AccessLevel="6",AD_Window_ID="e44db880-39fd-a94c-7bc3-d8740a7efd77",
AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="b7f00285-8795-2e21-05f2-c5769fe315e7",Synchronized="2020-03-03 21:34:55.0")
/** TableName=AD_ClientInfo */
public static final String Table_Name="AD_ClientInfo";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_ClientInfo");

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
    Table_ID = MTable.getTable_ID("AD_ClientInfo");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_ClientInfo[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Activity Tree.
@param AD_Tree_Activity_ID Tree to determine activity hierarchy */
public void setAD_Tree_Activity_ID (int AD_Tree_Activity_ID)
{
if (AD_Tree_Activity_ID <= 0) set_ValueNoCheck (COLUMNNAME_AD_Tree_Activity_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_AD_Tree_Activity_ID, Integer.valueOf(AD_Tree_Activity_ID));
}
/** Get Activity Tree.
@return Tree to determine activity hierarchy */
public int getAD_Tree_Activity_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Tree_Activity_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ab973cdc-5eb5-d09b-097b-72aa1c2c7acc")
public static String es_PE_FIELD_ClientInfo_ActivityTree_Name="Actividad Árbol primario";

@XendraField(AD_Column_ID="AD_Tree_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="40ab9f8f-60e6-5944-f74c-e68258e364fd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ab973cdc-5eb5-d09b-097b-72aa1c2c7acc")
public static final String FIELDNAME_ClientInfo_ActivityTree="ab973cdc-5eb5-d09b-097b-72aa1c2c7acc";

@XendraTrl(Identifier="0e339582-e961-5783-4f21-33d33d475a44")
public static String es_PE_COLUMN_AD_Tree_Activity_ID_Name="Actividad Árbol primario";

@XendraColumn(AD_Element_ID="e0df1bfd-05d9-e649-2d02-be0397329dfb",
ColumnName="AD_Tree_Activity_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="79a8ec82-b2c4-01ef-3d8c-2a2a8d8a2952",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="0e339582-e961-5783-4f21-33d33d475a44",
Synchronized="2020-03-03 21:34:27.0")
/** Column name AD_Tree_Activity_ID */
public static final String COLUMNNAME_AD_Tree_Activity_ID = "AD_Tree_Activity_ID";
/** Set BPartner Tree.
@param AD_Tree_BPartner_ID Tree to determine business partner hierarchy */
public void setAD_Tree_BPartner_ID (int AD_Tree_BPartner_ID)
{
if (AD_Tree_BPartner_ID <= 0) set_ValueNoCheck (COLUMNNAME_AD_Tree_BPartner_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_AD_Tree_BPartner_ID, Integer.valueOf(AD_Tree_BPartner_ID));
}
/** Get BPartner Tree.
@return Tree to determine business partner hierarchy */
public int getAD_Tree_BPartner_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Tree_BPartner_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0adc47c4-186c-9e27-f003-4d96a6a3ecf0")
public static String es_PE_FIELD_ClientInfo_BPartnerTree_Name="Árbol Primario de Socio";

@XendraField(AD_Column_ID="AD_Tree_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="40ab9f8f-60e6-5944-f74c-e68258e364fd",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0adc47c4-186c-9e27-f003-4d96a6a3ecf0")
public static final String FIELDNAME_ClientInfo_BPartnerTree="0adc47c4-186c-9e27-f003-4d96a6a3ecf0";

@XendraTrl(Identifier="90ccb469-7abd-732c-aa8b-5e812b299e9e")
public static String es_PE_COLUMN_AD_Tree_BPartner_ID_Name="Árbol Primario de Socio";

@XendraColumn(AD_Element_ID="e61fdac0-07c9-6eac-fb7f-dbac5cd56cd1",
ColumnName="AD_Tree_BPartner_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="79a8ec82-b2c4-01ef-3d8c-2a2a8d8a2952",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="90ccb469-7abd-732c-aa8b-5e812b299e9e",
Synchronized="2020-03-03 21:34:27.0")
/** Column name AD_Tree_BPartner_ID */
public static final String COLUMNNAME_AD_Tree_BPartner_ID = "AD_Tree_BPartner_ID";
/** Set Campaign Tree.
@param AD_Tree_Campaign_ID Tree to determine marketing campaign hierarchy */
public void setAD_Tree_Campaign_ID (int AD_Tree_Campaign_ID)
{
if (AD_Tree_Campaign_ID <= 0) set_ValueNoCheck (COLUMNNAME_AD_Tree_Campaign_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_AD_Tree_Campaign_ID, Integer.valueOf(AD_Tree_Campaign_ID));
}
/** Get Campaign Tree.
@return Tree to determine marketing campaign hierarchy */
public int getAD_Tree_Campaign_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Tree_Campaign_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="de05defc-8401-7666-a42b-0683768be6de")
public static String es_PE_FIELD_ClientInfo_CampaignTree_Name="Campaña Árbol primario";

@XendraField(AD_Column_ID="AD_Tree_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="40ab9f8f-60e6-5944-f74c-e68258e364fd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="de05defc-8401-7666-a42b-0683768be6de")
public static final String FIELDNAME_ClientInfo_CampaignTree="de05defc-8401-7666-a42b-0683768be6de";

@XendraTrl(Identifier="7db55f88-8626-b1cb-a346-9bf98bca3432")
public static String es_PE_COLUMN_AD_Tree_Campaign_ID_Name="Campaña Árbol primario";

@XendraColumn(AD_Element_ID="1eddfa44-4f1d-5fab-5a35-1b14c621548f",
ColumnName="AD_Tree_Campaign_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="79a8ec82-b2c4-01ef-3d8c-2a2a8d8a2952",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="7db55f88-8626-b1cb-a346-9bf98bca3432",
Synchronized="2020-03-03 21:34:27.0")
/** Column name AD_Tree_Campaign_ID */
public static final String COLUMNNAME_AD_Tree_Campaign_ID = "AD_Tree_Campaign_ID";
/** Set Menu Tree.
@param AD_Tree_Menu_ID Tree of the menu */
public void setAD_Tree_Menu_ID (int AD_Tree_Menu_ID)
{
if (AD_Tree_Menu_ID <= 0) set_ValueNoCheck (COLUMNNAME_AD_Tree_Menu_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_AD_Tree_Menu_ID, Integer.valueOf(AD_Tree_Menu_ID));
}
/** Get Menu Tree.
@return Tree of the menu */
public int getAD_Tree_Menu_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Tree_Menu_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b44136a0-1f3f-d17a-09e3-3019f0aa0f49")
public static String es_PE_FIELD_ClientInfo_MenuTree_Name="Árbol Primario de Menú";

@XendraField(AD_Column_ID="AD_Tree_Menu_ID",IsCentrallyMaintained=true,
AD_Tab_ID="40ab9f8f-60e6-5944-f74c-e68258e364fd",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b44136a0-1f3f-d17a-09e3-3019f0aa0f49")
public static final String FIELDNAME_ClientInfo_MenuTree="b44136a0-1f3f-d17a-09e3-3019f0aa0f49";

@XendraTrl(Identifier="6643cf92-982f-17ee-11f6-9722316717e4")
public static String es_PE_COLUMN_AD_Tree_Menu_ID_Name="Árbol Primario de Menú";

@XendraColumn(AD_Element_ID="dff25c2f-33f3-db6c-cbdc-0000bad282f1",ColumnName="AD_Tree_Menu_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="79a8ec82-b2c4-01ef-3d8c-2a2a8d8a2952",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6643cf92-982f-17ee-11f6-9722316717e4",Synchronized="2020-03-03 21:34:27.0")
/** Column name AD_Tree_Menu_ID */
public static final String COLUMNNAME_AD_Tree_Menu_ID = "AD_Tree_Menu_ID";
/** Set Organization Tree.
@param AD_Tree_Org_ID Tree to determine organizational hierarchy */
public void setAD_Tree_Org_ID (int AD_Tree_Org_ID)
{
if (AD_Tree_Org_ID <= 0) set_ValueNoCheck (COLUMNNAME_AD_Tree_Org_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_AD_Tree_Org_ID, Integer.valueOf(AD_Tree_Org_ID));
}
/** Get Organization Tree.
@return Tree to determine organizational hierarchy */
public int getAD_Tree_Org_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Tree_Org_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9877d0e5-9395-e61d-dd28-2408fda0368e")
public static String es_PE_FIELD_ClientInfo_OrganizationTree_Name="Árbol Primario de Organización";

@XendraField(AD_Column_ID="AD_Tree_Org_ID",IsCentrallyMaintained=true,
AD_Tab_ID="40ab9f8f-60e6-5944-f74c-e68258e364fd",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9877d0e5-9395-e61d-dd28-2408fda0368e")
public static final String FIELDNAME_ClientInfo_OrganizationTree="9877d0e5-9395-e61d-dd28-2408fda0368e";

@XendraTrl(Identifier="ba744015-1340-2cbf-10ef-0d6481b929b7")
public static String es_PE_COLUMN_AD_Tree_Org_ID_Name="Árbol Primario de Organización";

@XendraColumn(AD_Element_ID="ece986ac-8411-7f5a-662f-34ed42e25cc6",ColumnName="AD_Tree_Org_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="79a8ec82-b2c4-01ef-3d8c-2a2a8d8a2952",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ba744015-1340-2cbf-10ef-0d6481b929b7",Synchronized="2020-03-03 21:34:27.0")
/** Column name AD_Tree_Org_ID */
public static final String COLUMNNAME_AD_Tree_Org_ID = "AD_Tree_Org_ID";
/** Set Product Tree.
@param AD_Tree_Product_ID Tree to determine product hierarchy */
public void setAD_Tree_Product_ID (int AD_Tree_Product_ID)
{
if (AD_Tree_Product_ID <= 0) set_ValueNoCheck (COLUMNNAME_AD_Tree_Product_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_AD_Tree_Product_ID, Integer.valueOf(AD_Tree_Product_ID));
}
/** Get Product Tree.
@return Tree to determine product hierarchy */
public int getAD_Tree_Product_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Tree_Product_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="08f72629-b797-b23a-c398-fae3d0be3e51")
public static String es_PE_FIELD_ClientInfo_ProductTree_Name="Árbol Primario del Producto";

@XendraField(AD_Column_ID="AD_Tree_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="40ab9f8f-60e6-5944-f74c-e68258e364fd",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="08f72629-b797-b23a-c398-fae3d0be3e51")
public static final String FIELDNAME_ClientInfo_ProductTree="08f72629-b797-b23a-c398-fae3d0be3e51";

@XendraTrl(Identifier="d0a3532b-41ac-00fe-97ca-24952d276711")
public static String es_PE_COLUMN_AD_Tree_Product_ID_Name="Árbol Primario del Producto";

@XendraColumn(AD_Element_ID="41ddf96d-d52b-c2e6-7a44-34d62b5319c6",ColumnName="AD_Tree_Product_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="79a8ec82-b2c4-01ef-3d8c-2a2a8d8a2952",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d0a3532b-41ac-00fe-97ca-24952d276711",Synchronized="2020-03-03 21:34:27.0")
/** Column name AD_Tree_Product_ID */
public static final String COLUMNNAME_AD_Tree_Product_ID = "AD_Tree_Product_ID";
/** Set Project Tree.
@param AD_Tree_Project_ID Tree to determine project hierarchy */
public void setAD_Tree_Project_ID (int AD_Tree_Project_ID)
{
if (AD_Tree_Project_ID <= 0) set_ValueNoCheck (COLUMNNAME_AD_Tree_Project_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_AD_Tree_Project_ID, Integer.valueOf(AD_Tree_Project_ID));
}
/** Get Project Tree.
@return Tree to determine project hierarchy */
public int getAD_Tree_Project_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Tree_Project_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="db56f453-bec6-4e1e-faf6-810d7276e7bb")
public static String es_PE_FIELD_ClientInfo_ProjectTree_Name="Árbol Primario de Proyectos";

@XendraField(AD_Column_ID="AD_Tree_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="40ab9f8f-60e6-5944-f74c-e68258e364fd",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="db56f453-bec6-4e1e-faf6-810d7276e7bb")
public static final String FIELDNAME_ClientInfo_ProjectTree="db56f453-bec6-4e1e-faf6-810d7276e7bb";

@XendraTrl(Identifier="0c777288-bb53-5ff8-f41d-a44334f3d894")
public static String es_PE_COLUMN_AD_Tree_Project_ID_Name="Árbol Primario de Proyectos";

@XendraColumn(AD_Element_ID="61735bf6-cf9c-70b4-a9b1-a396d86f8460",ColumnName="AD_Tree_Project_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="79a8ec82-b2c4-01ef-3d8c-2a2a8d8a2952",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0c777288-bb53-5ff8-f41d-a44334f3d894",Synchronized="2020-03-03 21:34:27.0")
/** Column name AD_Tree_Project_ID */
public static final String COLUMNNAME_AD_Tree_Project_ID = "AD_Tree_Project_ID";
/** Set Sales Region Tree.
@param AD_Tree_SalesRegion_ID Tree to determine sales regional hierarchy */
public void setAD_Tree_SalesRegion_ID (int AD_Tree_SalesRegion_ID)
{
if (AD_Tree_SalesRegion_ID <= 0) set_ValueNoCheck (COLUMNNAME_AD_Tree_SalesRegion_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_AD_Tree_SalesRegion_ID, Integer.valueOf(AD_Tree_SalesRegion_ID));
}
/** Get Sales Region Tree.
@return Tree to determine sales regional hierarchy */
public int getAD_Tree_SalesRegion_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Tree_SalesRegion_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a1cdabca-0b11-756c-2074-0e40a3c9b88d")
public static String es_PE_FIELD_ClientInfo_SalesRegionTree_Name="Árbol Primario de Región de Venta";

@XendraField(AD_Column_ID="AD_Tree_SalesRegion_ID",IsCentrallyMaintained=true,
AD_Tab_ID="40ab9f8f-60e6-5944-f74c-e68258e364fd",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a1cdabca-0b11-756c-2074-0e40a3c9b88d")
public static final String FIELDNAME_ClientInfo_SalesRegionTree="a1cdabca-0b11-756c-2074-0e40a3c9b88d";

@XendraTrl(Identifier="5e176a45-26a6-f1ea-ff89-32ab2e6267ed")
public static String es_PE_COLUMN_AD_Tree_SalesRegion_ID_Name="Árbol Primario de Región de Venta";

@XendraColumn(AD_Element_ID="fb3056f6-271f-d89c-0c12-ab622639a3eb",
ColumnName="AD_Tree_SalesRegion_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="79a8ec82-b2c4-01ef-3d8c-2a2a8d8a2952",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="5e176a45-26a6-f1ea-ff89-32ab2e6267ed",
Synchronized="2020-03-03 21:34:27.0")
/** Column name AD_Tree_SalesRegion_ID */
public static final String COLUMNNAME_AD_Tree_SalesRegion_ID = "AD_Tree_SalesRegion_ID";
/** Set Primary Accounting Schema.
@param C_AcctSchema1_ID Primary rules for accounting */
public void setC_AcctSchema1_ID (int C_AcctSchema1_ID)
{
if (C_AcctSchema1_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_AcctSchema1_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_AcctSchema1_ID, Integer.valueOf(C_AcctSchema1_ID));
}
/** Get Primary Accounting Schema.
@return Primary rules for accounting */
public int getC_AcctSchema1_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_AcctSchema1_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="59243956-80ff-284b-e80a-08600f47834c")
public static String es_PE_FIELD_ClientInfo_PrimaryAccountingSchema_Name="Esquema Contable Primario";

@XendraTrl(Identifier="59243956-80ff-284b-e80a-08600f47834c")
public static String es_PE_FIELD_ClientInfo_PrimaryAccountingSchema_Description="Reglas primarias para contabilizar";

@XendraTrl(Identifier="59243956-80ff-284b-e80a-08600f47834c")
public static String es_PE_FIELD_ClientInfo_PrimaryAccountingSchema_Help="Un esquema contable define las reglas contables usadas tales como método de costeo; moneda y calendario";

@XendraField(AD_Column_ID="C_AcctSchema1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="40ab9f8f-60e6-5944-f74c-e68258e364fd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="59243956-80ff-284b-e80a-08600f47834c")
public static final String FIELDNAME_ClientInfo_PrimaryAccountingSchema="59243956-80ff-284b-e80a-08600f47834c";

@XendraTrl(Identifier="f67b6d10-bbc1-e396-52d6-f11052485505")
public static String es_PE_COLUMN_C_AcctSchema1_ID_Name="Esquema Contable Primario";

@XendraColumn(AD_Element_ID="d0cc9404-e8e1-c87c-89de-2185b1867412",ColumnName="C_AcctSchema1_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="d6951844-6f79-a10f-bc74-3aaec4f0e638",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="@AD_Client_ID=0",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f67b6d10-bbc1-e396-52d6-f11052485505",Synchronized="2020-03-03 21:34:27.0")
/** Column name C_AcctSchema1_ID */
public static final String COLUMNNAME_C_AcctSchema1_ID = "C_AcctSchema1_ID";
/** Set Template B.Partner.
@param C_BPartnerCashTrx_ID Business Partner used for creating new Business Partners on the fly */
public void setC_BPartnerCashTrx_ID (int C_BPartnerCashTrx_ID)
{
if (C_BPartnerCashTrx_ID <= 0) set_Value (COLUMNNAME_C_BPartnerCashTrx_ID, null);
 else 
set_Value (COLUMNNAME_C_BPartnerCashTrx_ID, Integer.valueOf(C_BPartnerCashTrx_ID));
}
/** Get Template B.Partner.
@return Business Partner used for creating new Business Partners on the fly */
public int getC_BPartnerCashTrx_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartnerCashTrx_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="588ff7ca-3d3e-1308-3632-ec36ae0f5ca5")
public static String es_PE_FIELD_ClientInfo_TemplateBPartner_Name="Plantilla S. N.";

@XendraTrl(Identifier="588ff7ca-3d3e-1308-3632-ec36ae0f5ca5")
public static String es_PE_FIELD_ClientInfo_TemplateBPartner_Description="Socio de negocio usado para crear nuevos socios de negocio rápidamente.";

@XendraTrl(Identifier="588ff7ca-3d3e-1308-3632-ec36ae0f5ca5")
public static String es_PE_FIELD_ClientInfo_TemplateBPartner_Help="Cuando se crea un nuevo socio de negocio desde el campo de búsqueda de socio de negocio (clic-derecho:Crear, el socio de negocio seleccionado se usa como una plantilla, ej. para definir lista de precios, términos de pago, etc.";

@XendraField(AD_Column_ID="C_BPartnerCashTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="40ab9f8f-60e6-5944-f74c-e68258e364fd",AD_FieldGroup_ID="Defaults",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="588ff7ca-3d3e-1308-3632-ec36ae0f5ca5")
public static final String FIELDNAME_ClientInfo_TemplateBPartner="588ff7ca-3d3e-1308-3632-ec36ae0f5ca5";

@XendraTrl(Identifier="e50f000a-4f0f-a51b-8d6b-ecfe41c90c9e")
public static String es_PE_COLUMN_C_BPartnerCashTrx_ID_Name="Plantilla S. N.";

@XendraColumn(AD_Element_ID="c3596ea7-726a-4546-0f19-72ff7134527b",
ColumnName="C_BPartnerCashTrx_ID",AD_Reference_ID=30,
AD_Reference_Value_ID="ed87c3fe-720d-c26d-0166-b5178b65db41",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@AD_Client_ID=0",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e50f000a-4f0f-a51b-8d6b-ecfe41c90c9e",Synchronized="2020-03-03 21:34:27.0")
/** Column name C_BPartnerCashTrx_ID */
public static final String COLUMNNAME_C_BPartnerCashTrx_ID = "C_BPartnerCashTrx_ID";
/** Set Calendar.
@param C_Calendar_ID Accounting Calendar Name */
public void setC_Calendar_ID (int C_Calendar_ID)
{
if (C_Calendar_ID <= 0) set_Value (COLUMNNAME_C_Calendar_ID, null);
 else 
set_Value (COLUMNNAME_C_Calendar_ID, Integer.valueOf(C_Calendar_ID));
}
/** Get Calendar.
@return Accounting Calendar Name */
public int getC_Calendar_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Calendar_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3371ad7b-3f28-22cd-fbba-ff0adf0df1eb")
public static String es_PE_FIELD_ClientInfo_Calendar_Name="Calendario";

@XendraTrl(Identifier="3371ad7b-3f28-22cd-fbba-ff0adf0df1eb")
public static String es_PE_FIELD_ClientInfo_Calendar_Description="Nombre del Calendario Contable";

@XendraTrl(Identifier="3371ad7b-3f28-22cd-fbba-ff0adf0df1eb")
public static String es_PE_FIELD_ClientInfo_Calendar_Help="El calendario únicamente identifica un calendario contable. Múltiples calendarios pueden ser usados. Ej. Ud. puede necesitar un calendario estándar que corre del 1 de enero al 31 de diciembre y un calendario fiscal que corre del 1 de julio al 30 de junio.";

@XendraField(AD_Column_ID="C_Calendar_ID",IsCentrallyMaintained=true,
AD_Tab_ID="40ab9f8f-60e6-5944-f74c-e68258e364fd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3371ad7b-3f28-22cd-fbba-ff0adf0df1eb")
public static final String FIELDNAME_ClientInfo_Calendar="3371ad7b-3f28-22cd-fbba-ff0adf0df1eb";

@XendraTrl(Identifier="9157a9db-a1b5-c24d-18c0-4009b4c3b364")
public static String es_PE_COLUMN_C_Calendar_ID_Name="Calendario";

@XendraColumn(AD_Element_ID="f78f20f5-74d2-53fd-4e80-4df19abaa806",ColumnName="C_Calendar_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@AD_Client_ID=0",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9157a9db-a1b5-c24d-18c0-4009b4c3b364",Synchronized="2020-03-03 21:34:27.0")
/** Column name C_Calendar_ID */
public static final String COLUMNNAME_C_Calendar_ID = "C_Calendar_ID";
/** Set C_SPOT_ID.
@param C_SPOT_ID C_SPOT_ID */
public void setC_SPOT_ID (int C_SPOT_ID)
{
if (C_SPOT_ID <= 0) set_Value (COLUMNNAME_C_SPOT_ID, null);
 else 
set_Value (COLUMNNAME_C_SPOT_ID, Integer.valueOf(C_SPOT_ID));
}
/** Get C_SPOT_ID.
@return C_SPOT_ID */
public int getC_SPOT_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_SPOT_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="10ea4016-7f86-1de4-6f38-721919998085")
public static String es_PE_FIELD_ClientInfo_C_SPOT_ID_Name="Spot";

@XendraField(AD_Column_ID="C_SPOT_ID",IsCentrallyMaintained=true,
AD_Tab_ID="40ab9f8f-60e6-5944-f74c-e68258e364fd",AD_FieldGroup_ID="Spot",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="10ea4016-7f86-1de4-6f38-721919998085")
public static final String FIELDNAME_ClientInfo_C_SPOT_ID="10ea4016-7f86-1de4-6f38-721919998085";

@XendraTrl(Identifier="3fdee2ff-49ac-6bd8-b4ae-e93f364d532d")
public static String es_PE_COLUMN_C_SPOT_ID_Name="c_spot_id";

@XendraColumn(AD_Element_ID="1d8110a3-38e8-4bc4-ddae-077082fd0f00",ColumnName="C_SPOT_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3fdee2ff-49ac-6bd8-b4ae-e93f364d532d",
Synchronized="2020-03-03 21:34:27.0")
/** Column name C_SPOT_ID */
public static final String COLUMNNAME_C_SPOT_ID = "C_SPOT_ID";
/** Set UOM for Length.
@param C_UOM_Length_ID Standard Unit of Measure for Length */
public void setC_UOM_Length_ID (int C_UOM_Length_ID)
{
if (C_UOM_Length_ID <= 0) set_Value (COLUMNNAME_C_UOM_Length_ID, null);
 else 
set_Value (COLUMNNAME_C_UOM_Length_ID, Integer.valueOf(C_UOM_Length_ID));
}
/** Get UOM for Length.
@return Standard Unit of Measure for Length */
public int getC_UOM_Length_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_UOM_Length_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7a15068b-94cf-2f64-8496-aa5c26c30c66")
public static String es_PE_FIELD_ClientInfo_UOMForLength_Name="UM para Longitud";

@XendraTrl(Identifier="7a15068b-94cf-2f64-8496-aa5c26c30c66")
public static String es_PE_FIELD_ClientInfo_UOMForLength_Description="Unidad de Medida estándar para longitud";

@XendraTrl(Identifier="7a15068b-94cf-2f64-8496-aa5c26c30c66")
public static String es_PE_FIELD_ClientInfo_UOMForLength_Help="La UM estándar de longitud indica la UM a usar para productos referenciados por longitud en un documento";

@XendraField(AD_Column_ID="C_UOM_Length_ID",IsCentrallyMaintained=true,
AD_Tab_ID="40ab9f8f-60e6-5944-f74c-e68258e364fd",AD_FieldGroup_ID="Defaults",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7a15068b-94cf-2f64-8496-aa5c26c30c66")
public static final String FIELDNAME_ClientInfo_UOMForLength="7a15068b-94cf-2f64-8496-aa5c26c30c66";

@XendraTrl(Identifier="8ae8e8e1-dfce-070c-526e-47cbc9c385a0")
public static String es_PE_COLUMN_C_UOM_Length_ID_Name="UM para Longitud";

@XendraColumn(AD_Element_ID="87742236-93bc-4a87-f47d-ede77cdf97f8",ColumnName="C_UOM_Length_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="723d7831-ccf2-1634-fe46-62dbc58e9a8e",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="@AD_Client_ID=0",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8ae8e8e1-dfce-070c-526e-47cbc9c385a0",Synchronized="2020-03-03 21:34:27.0")
/** Column name C_UOM_Length_ID */
public static final String COLUMNNAME_C_UOM_Length_ID = "C_UOM_Length_ID";
/** Set UOM for Time.
@param C_UOM_Time_ID Standard Unit of Measure for Time */
public void setC_UOM_Time_ID (int C_UOM_Time_ID)
{
if (C_UOM_Time_ID <= 0) set_Value (COLUMNNAME_C_UOM_Time_ID, null);
 else 
set_Value (COLUMNNAME_C_UOM_Time_ID, Integer.valueOf(C_UOM_Time_ID));
}
/** Get UOM for Time.
@return Standard Unit of Measure for Time */
public int getC_UOM_Time_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_UOM_Time_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1001dfbc-9979-ddee-0c13-29273b527961")
public static String es_PE_FIELD_ClientInfo_UOMForTime_Name="UM para Tiempo";

@XendraTrl(Identifier="1001dfbc-9979-ddee-0c13-29273b527961")
public static String es_PE_FIELD_ClientInfo_UOMForTime_Description="Unidad de Medida estándar para tiempo";

@XendraTrl(Identifier="1001dfbc-9979-ddee-0c13-29273b527961")
public static String es_PE_FIELD_ClientInfo_UOMForTime_Help="La UM estándar de tiempo indica la UM a usar para productos referenciados por tiempo en un documento";

@XendraField(AD_Column_ID="C_UOM_Time_ID",IsCentrallyMaintained=true,
AD_Tab_ID="40ab9f8f-60e6-5944-f74c-e68258e364fd",AD_FieldGroup_ID="Defaults",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1001dfbc-9979-ddee-0c13-29273b527961")
public static final String FIELDNAME_ClientInfo_UOMForTime="1001dfbc-9979-ddee-0c13-29273b527961";

@XendraTrl(Identifier="ff324a1d-f4ff-3bca-58d4-47818c8db6fa")
public static String es_PE_COLUMN_C_UOM_Time_ID_Name="UM para Tiempo";

@XendraColumn(AD_Element_ID="9c6f3dd0-efb3-b9a3-09b1-4b77b3d4b55c",ColumnName="C_UOM_Time_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="723d7831-ccf2-1634-fe46-62dbc58e9a8e",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="@AD_Client_ID=0",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ff324a1d-f4ff-3bca-58d4-47818c8db6fa",Synchronized="2020-03-03 21:34:27.0")
/** Column name C_UOM_Time_ID */
public static final String COLUMNNAME_C_UOM_Time_ID = "C_UOM_Time_ID";
/** Set UOM for Volume.
@param C_UOM_Volume_ID Standard Unit of Measure for Volume */
public void setC_UOM_Volume_ID (int C_UOM_Volume_ID)
{
if (C_UOM_Volume_ID <= 0) set_Value (COLUMNNAME_C_UOM_Volume_ID, null);
 else 
set_Value (COLUMNNAME_C_UOM_Volume_ID, Integer.valueOf(C_UOM_Volume_ID));
}
/** Get UOM for Volume.
@return Standard Unit of Measure for Volume */
public int getC_UOM_Volume_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_UOM_Volume_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4fc6c279-857f-f990-a6ac-94555d28a5d0")
public static String es_PE_FIELD_ClientInfo_UOMForVolume_Name="UM para Volumen";

@XendraTrl(Identifier="4fc6c279-857f-f990-a6ac-94555d28a5d0")
public static String es_PE_FIELD_ClientInfo_UOMForVolume_Description="Unidad de Medida estándar para volumen";

@XendraTrl(Identifier="4fc6c279-857f-f990-a6ac-94555d28a5d0")
public static String es_PE_FIELD_ClientInfo_UOMForVolume_Help="La UM estándar de volumen indica la UM a usar para productos referenciados por volumen en un documento";

@XendraField(AD_Column_ID="C_UOM_Volume_ID",IsCentrallyMaintained=true,
AD_Tab_ID="40ab9f8f-60e6-5944-f74c-e68258e364fd",AD_FieldGroup_ID="Defaults",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4fc6c279-857f-f990-a6ac-94555d28a5d0")
public static final String FIELDNAME_ClientInfo_UOMForVolume="4fc6c279-857f-f990-a6ac-94555d28a5d0";

@XendraTrl(Identifier="874894b0-029e-6174-9e64-721a8a92d564")
public static String es_PE_COLUMN_C_UOM_Volume_ID_Name="UM para Volumen";

@XendraColumn(AD_Element_ID="fe2fc491-4791-c0e9-c3a1-583223a08f60",ColumnName="C_UOM_Volume_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="723d7831-ccf2-1634-fe46-62dbc58e9a8e",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="@AD_Client_ID=0",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="874894b0-029e-6174-9e64-721a8a92d564",Synchronized="2020-03-03 21:34:27.0")
/** Column name C_UOM_Volume_ID */
public static final String COLUMNNAME_C_UOM_Volume_ID = "C_UOM_Volume_ID";
/** Set UOM for Weight.
@param C_UOM_Weight_ID Standard Unit of Measure for Weight */
public void setC_UOM_Weight_ID (int C_UOM_Weight_ID)
{
if (C_UOM_Weight_ID <= 0) set_Value (COLUMNNAME_C_UOM_Weight_ID, null);
 else 
set_Value (COLUMNNAME_C_UOM_Weight_ID, Integer.valueOf(C_UOM_Weight_ID));
}
/** Get UOM for Weight.
@return Standard Unit of Measure for Weight */
public int getC_UOM_Weight_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_UOM_Weight_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="083c6e6d-e77e-5ece-2efb-b6e71a6ffc74")
public static String es_PE_FIELD_ClientInfo_UOMForWeight_Name="UM para Peso";

@XendraTrl(Identifier="083c6e6d-e77e-5ece-2efb-b6e71a6ffc74")
public static String es_PE_FIELD_ClientInfo_UOMForWeight_Description="Unidad de Medida estándar para peso";

@XendraTrl(Identifier="083c6e6d-e77e-5ece-2efb-b6e71a6ffc74")
public static String es_PE_FIELD_ClientInfo_UOMForWeight_Help="La UM estándar de peso indica la UM a usar para productos referenciados por peso en un documento";

@XendraField(AD_Column_ID="C_UOM_Weight_ID",IsCentrallyMaintained=true,
AD_Tab_ID="40ab9f8f-60e6-5944-f74c-e68258e364fd",AD_FieldGroup_ID="Defaults",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="083c6e6d-e77e-5ece-2efb-b6e71a6ffc74")
public static final String FIELDNAME_ClientInfo_UOMForWeight="083c6e6d-e77e-5ece-2efb-b6e71a6ffc74";

@XendraTrl(Identifier="2cf92754-46c5-6b55-7adf-e46eea8b5a29")
public static String es_PE_COLUMN_C_UOM_Weight_ID_Name="UM para Peso";

@XendraColumn(AD_Element_ID="216be096-0e3e-f93c-426a-fecdd6590a15",ColumnName="C_UOM_Weight_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="723d7831-ccf2-1634-fe46-62dbc58e9a8e",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="@AD_Client_ID=0",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2cf92754-46c5-6b55-7adf-e46eea8b5a29",Synchronized="2020-03-03 21:34:27.0")
/** Column name C_UOM_Weight_ID */
public static final String COLUMNNAME_C_UOM_Weight_ID = "C_UOM_Weight_ID";
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
@XendraTrl(Identifier="8bea7a8e-2b3f-432e-926d-5a431fef361d")
public static String es_PE_FIELD_ClientInfo_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="40ab9f8f-60e6-5944-f74c-e68258e364fd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-08-05 16:52:26.0",
Identifier="8bea7a8e-2b3f-432e-926d-5a431fef361d")
public static final String FIELDNAME_ClientInfo_Identifier="8bea7a8e-2b3f-432e-926d-5a431fef361d";

@XendraTrl(Identifier="a6cf2a09-2b20-464e-9709-f7e21c9a3257")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a6cf2a09-2b20-464e-9709-f7e21c9a3257",
Synchronized="2020-03-03 21:34:27.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Discount calculated from Line Amounts.
@param IsDiscountLineAmt Payment Discount calculation does not include Taxes and Charges */
public void setIsDiscountLineAmt (boolean IsDiscountLineAmt)
{
set_Value (COLUMNNAME_IsDiscountLineAmt, Boolean.valueOf(IsDiscountLineAmt));
}
/** Get Discount calculated from Line Amounts.
@return Payment Discount calculation does not include Taxes and Charges */
public boolean isDiscountLineAmt() 
{
Object oo = get_Value(COLUMNNAME_IsDiscountLineAmt);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="212f6acd-f9fe-6496-33c3-ed3f47816c72")
public static String es_PE_FIELD_ClientInfo_DiscountCalculatedFromLineAmounts_Name="Descuento Calculado desde el Total de la Línea";

@XendraTrl(Identifier="212f6acd-f9fe-6496-33c3-ed3f47816c72")
public static String es_PE_FIELD_ClientInfo_DiscountCalculatedFromLineAmounts_Description="Cálculo de descuento en pago; no incluye impuestos ni cargos";

@XendraTrl(Identifier="212f6acd-f9fe-6496-33c3-ed3f47816c72")
public static String es_PE_FIELD_ClientInfo_DiscountCalculatedFromLineAmounts_Help="Si el descuento en pago se calcula solamente desde los Totales de las líneas ; los Totales de impuesto y cargos no se incluyen. Esto es una práctica de negocios en EU. Si no es seleccionado; el Total de la factura es usado para calcular el descuento en el pago.";

@XendraField(AD_Column_ID="IsDiscountLineAmt",IsCentrallyMaintained=true,
AD_Tab_ID="40ab9f8f-60e6-5944-f74c-e68258e364fd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="212f6acd-f9fe-6496-33c3-ed3f47816c72")
public static final String FIELDNAME_ClientInfo_DiscountCalculatedFromLineAmounts="212f6acd-f9fe-6496-33c3-ed3f47816c72";

@XendraTrl(Identifier="ef1fc504-e7b6-e029-80e9-5d69045f51f0")
public static String es_PE_COLUMN_IsDiscountLineAmt_Name="Descuento Calculado desde el Total de la Línea";

@XendraColumn(AD_Element_ID="d046dbce-32d4-20eb-639a-0f51e1e6698d",ColumnName="IsDiscountLineAmt",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,
ReadOnlyLogic="@AD_Client_ID=0",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ef1fc504-e7b6-e029-80e9-5d69045f51f0",Synchronized="2020-03-03 21:34:27.0")
/** Column name IsDiscountLineAmt */
public static final String COLUMNNAME_IsDiscountLineAmt = "IsDiscountLineAmt";
/** Set IsRetention.
@param IsRetention IsRetention */
public void setIsRetention (boolean IsRetention)
{
set_Value (COLUMNNAME_IsRetention, Boolean.valueOf(IsRetention));
}
/** Get IsRetention.
@return IsRetention */
public boolean isRetention() 
{
Object oo = get_Value(COLUMNNAME_IsRetention);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f4573bf6-6672-ea27-c069-e9d5446563cb")
public static String es_PE_FIELD_ClientInfo_IsRetention_Name="Agente de Retención";

@XendraField(AD_Column_ID="IsRetention",IsCentrallyMaintained=true,
AD_Tab_ID="40ab9f8f-60e6-5944-f74c-e68258e364fd",AD_FieldGroup_ID="Spot",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f4573bf6-6672-ea27-c069-e9d5446563cb")
public static final String FIELDNAME_ClientInfo_IsRetention="f4573bf6-6672-ea27-c069-e9d5446563cb";

@XendraTrl(Identifier="4806e0bf-b79f-b2b3-8291-ef97b60a5790")
public static String es_PE_COLUMN_IsRetention_Name="IsRetention";

@XendraColumn(AD_Element_ID="01d8c51a-7406-718a-2bee-ae906aadb51b",ColumnName="IsRetention",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4806e0bf-b79f-b2b3-8291-ef97b60a5790",
Synchronized="2020-03-03 21:34:27.0")
/** Column name IsRetention */
public static final String COLUMNNAME_IsRetention = "IsRetention";
/** Set Days to keep Log.
@param KeepLogDays Number of days to keep the log entries */
public void setKeepLogDays (int KeepLogDays)
{
set_Value (COLUMNNAME_KeepLogDays, Integer.valueOf(KeepLogDays));
}
/** Get Days to keep Log.
@return Number of days to keep the log entries */
public int getKeepLogDays() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_KeepLogDays);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e09461ee-9f37-1e69-7bb8-6e6c4f441674")
public static String es_PE_FIELD_ClientInfo_DaysToKeepLog_Name="Días para guardar el registro";

@XendraTrl(Identifier="e09461ee-9f37-1e69-7bb8-6e6c4f441674")
public static String es_PE_FIELD_ClientInfo_DaysToKeepLog_Description="Número de días para guardar las entradas del registro";

@XendraTrl(Identifier="e09461ee-9f37-1e69-7bb8-6e6c4f441674")
public static String es_PE_FIELD_ClientInfo_DaysToKeepLog_Help="Las entradas de un registro mas viejo pueden ser suprimidas";

@XendraField(AD_Column_ID="KeepLogDays",IsCentrallyMaintained=true,
AD_Tab_ID="40ab9f8f-60e6-5944-f74c-e68258e364fd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e09461ee-9f37-1e69-7bb8-6e6c4f441674")
public static final String FIELDNAME_ClientInfo_DaysToKeepLog="e09461ee-9f37-1e69-7bb8-6e6c4f441674";

@XendraTrl(Identifier="2544ad01-bc91-ae7a-852c-624716186913")
public static String es_PE_COLUMN_KeepLogDays_Name="Días para guardar el registro";

@XendraColumn(AD_Element_ID="5f6abdde-d6c5-cc1d-af35-b05c5b66edd5",ColumnName="KeepLogDays",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2544ad01-bc91-ae7a-852c-624716186913",
Synchronized="2020-03-03 21:34:27.0")
/** Column name KeepLogDays */
public static final String COLUMNNAME_KeepLogDays = "KeepLogDays";
/** Set Logo_ID.
@param Logo_ID Logo_ID */
public void setLogo_ID (int Logo_ID)
{
if (Logo_ID <= 0) set_Value (COLUMNNAME_Logo_ID, null);
 else 
set_Value (COLUMNNAME_Logo_ID, Integer.valueOf(Logo_ID));
}
/** Get Logo_ID.
@return Logo_ID */
public int getLogo_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Logo_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9433528a-e60b-1694-07be-dd232d6bb526")
public static String es_PE_FIELD_ClientInfo_Logo_ID_Name="logo_id";

@XendraField(AD_Column_ID="Logo_ID",IsCentrallyMaintained=true,
AD_Tab_ID="40ab9f8f-60e6-5944-f74c-e68258e364fd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9433528a-e60b-1694-07be-dd232d6bb526")
public static final String FIELDNAME_ClientInfo_Logo_ID="9433528a-e60b-1694-07be-dd232d6bb526";

@XendraTrl(Identifier="76f4a337-1466-3c33-f91c-404c5b71dbb7")
public static String es_PE_COLUMN_Logo_ID_Name="logo_id";

@XendraColumn(AD_Element_ID="2e9bcaaf-8605-e949-31e7-efa08df8e35d",ColumnName="Logo_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="76f4a337-1466-3c33-f91c-404c5b71dbb7",
Synchronized="2020-03-03 21:34:27.0")
/** Column name Logo_ID */
public static final String COLUMNNAME_Logo_ID = "Logo_ID";
/** Set LogoReport_ID.
@param LogoReport_ID LogoReport_ID */
public void setLogoReport_ID (int LogoReport_ID)
{
if (LogoReport_ID <= 0) set_Value (COLUMNNAME_LogoReport_ID, null);
 else 
set_Value (COLUMNNAME_LogoReport_ID, Integer.valueOf(LogoReport_ID));
}
/** Get LogoReport_ID.
@return LogoReport_ID */
public int getLogoReport_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_LogoReport_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b26c0358-a9e3-87ca-348e-9cc839559e53")
public static String es_PE_FIELD_ClientInfo_LogoReport_ID_Name="logoreport_id";

@XendraField(AD_Column_ID="LogoReport_ID",IsCentrallyMaintained=true,
AD_Tab_ID="40ab9f8f-60e6-5944-f74c-e68258e364fd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b26c0358-a9e3-87ca-348e-9cc839559e53")
public static final String FIELDNAME_ClientInfo_LogoReport_ID="b26c0358-a9e3-87ca-348e-9cc839559e53";

@XendraTrl(Identifier="d33604d3-8679-b609-16da-a71bafbdadee")
public static String es_PE_COLUMN_LogoReport_ID_Name="logoreport_id";

@XendraColumn(AD_Element_ID="20d92d87-1c67-3730-b75b-88367bee5e40",ColumnName="LogoReport_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d33604d3-8679-b609-16da-a71bafbdadee",
Synchronized="2020-03-03 21:34:27.0")
/** Column name LogoReport_ID */
public static final String COLUMNNAME_LogoReport_ID = "LogoReport_ID";
/** Set LogoWeb_ID.
@param LogoWeb_ID LogoWeb_ID */
public void setLogoWeb_ID (int LogoWeb_ID)
{
if (LogoWeb_ID <= 0) set_Value (COLUMNNAME_LogoWeb_ID, null);
 else 
set_Value (COLUMNNAME_LogoWeb_ID, Integer.valueOf(LogoWeb_ID));
}
/** Get LogoWeb_ID.
@return LogoWeb_ID */
public int getLogoWeb_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_LogoWeb_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7dc91590-279e-43ba-bed1-3945369e74db")
public static String es_PE_FIELD_ClientInfo_LogoWeb_ID_Name="logoweb_id";

@XendraField(AD_Column_ID="LogoWeb_ID",IsCentrallyMaintained=true,
AD_Tab_ID="40ab9f8f-60e6-5944-f74c-e68258e364fd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7dc91590-279e-43ba-bed1-3945369e74db")
public static final String FIELDNAME_ClientInfo_LogoWeb_ID="7dc91590-279e-43ba-bed1-3945369e74db";

@XendraTrl(Identifier="faf72c87-2482-4dda-591f-5425b10ee30e")
public static String es_PE_COLUMN_LogoWeb_ID_Name="logoweb_id";

@XendraColumn(AD_Element_ID="4617cc73-53a9-9f40-9047-1c409fde177e",ColumnName="LogoWeb_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="faf72c87-2482-4dda-591f-5425b10ee30e",
Synchronized="2020-03-03 21:34:27.0")
/** Column name LogoWeb_ID */
public static final String COLUMNNAME_LogoWeb_ID = "LogoWeb_ID";
/** Set Product for Freight.
@param M_ProductFreight_ID Product for Freight */
public void setM_ProductFreight_ID (int M_ProductFreight_ID)
{
if (M_ProductFreight_ID <= 0) set_Value (COLUMNNAME_M_ProductFreight_ID, null);
 else 
set_Value (COLUMNNAME_M_ProductFreight_ID, Integer.valueOf(M_ProductFreight_ID));
}
/** Get Product for Freight.
@return Product for Freight */
public int getM_ProductFreight_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_ProductFreight_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e7fbb456-da6e-2c63-6ed5-94eeea9b1770")
public static String es_PE_FIELD_ClientInfo_ProductForFreight_Name="Producto para Flete";

@XendraField(AD_Column_ID="M_ProductFreight_ID",IsCentrallyMaintained=true,
AD_Tab_ID="40ab9f8f-60e6-5944-f74c-e68258e364fd",AD_FieldGroup_ID="Defaults",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e7fbb456-da6e-2c63-6ed5-94eeea9b1770")
public static final String FIELDNAME_ClientInfo_ProductForFreight="e7fbb456-da6e-2c63-6ed5-94eeea9b1770";

@XendraTrl(Identifier="66e9b3bf-654c-d4b5-a145-4fd5154e2b6b")
public static String es_PE_COLUMN_M_ProductFreight_ID_Name="Producto para Flete";

@XendraColumn(AD_Element_ID="5f4cd5ff-2d2a-5d52-6dc3-e2595eaad3f2",
ColumnName="M_ProductFreight_ID",AD_Reference_ID=30,
AD_Reference_Value_ID="28b49c4d-0409-b2e0-b70e-d686f8d6503f",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@AD_Client_ID=0",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="66e9b3bf-654c-d4b5-a145-4fd5154e2b6b",Synchronized="2020-03-03 21:34:27.0")
/** Column name M_ProductFreight_ID */
public static final String COLUMNNAME_M_ProductFreight_ID = "M_ProductFreight_ID";
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

@XendraTrl(Identifier="4379ee4a-6767-47cb-9427-88c3eae51f01")
public static String es_PE_FIELD_ClientInfo_Properties_Name="Properties";

@XendraField(AD_Column_ID="Properties",IsCentrallyMaintained=true,
AD_Tab_ID="40ab9f8f-60e6-5944-f74c-e68258e364fd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-08-05 16:52:26.0",
Identifier="4379ee4a-6767-47cb-9427-88c3eae51f01")
public static final String FIELDNAME_ClientInfo_Properties="4379ee4a-6767-47cb-9427-88c3eae51f01";

@XendraTrl(Identifier="be1e3978-d494-445e-9b4c-9b7926de5dbc")
public static String es_PE_COLUMN_Properties_Name="Properties";

@XendraColumn(AD_Element_ID="acc3987b-292c-475a-86b5-5104970a96f3",ColumnName="Properties",
AD_Reference_ID=46,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="be1e3978-d494-445e-9b4c-9b7926de5dbc",
Synchronized="2020-03-03 21:34:27.0")
/** Column name Properties */
public static final String COLUMNNAME_Properties = "Properties";
/** Set Tax ID.
@param TaxID Tax Identification */
public void setTaxID (String TaxID)
{
if (TaxID == null) throw new IllegalArgumentException ("TaxID is mandatory.");
if (TaxID.length() > 20)
{
log.warning("Length > 20 - truncated");
TaxID = TaxID.substring(0,19);
}
set_Value (COLUMNNAME_TaxID, TaxID);
}
/** Get Tax ID.
@return Tax Identification */
public String getTaxID() 
{
String value = (String)get_Value(COLUMNNAME_TaxID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="326353bd-ce5e-8b7d-fa0f-a2add877d02f")
public static String es_PE_FIELD_ClientInfo_TaxID_Name="RUC";

@XendraTrl(Identifier="326353bd-ce5e-8b7d-fa0f-a2add877d02f")
public static String es_PE_FIELD_ClientInfo_TaxID_Description="Código de Identificación";

@XendraTrl(Identifier="326353bd-ce5e-8b7d-fa0f-a2add877d02f")
public static String es_PE_FIELD_ClientInfo_TaxID_Help="El código de Identificación es el número de identificación gubernamental de esta entidad";

@XendraField(AD_Column_ID="TaxID",IsCentrallyMaintained=true,
AD_Tab_ID="40ab9f8f-60e6-5944-f74c-e68258e364fd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=20,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="326353bd-ce5e-8b7d-fa0f-a2add877d02f")
public static final String FIELDNAME_ClientInfo_TaxID="326353bd-ce5e-8b7d-fa0f-a2add877d02f";

@XendraTrl(Identifier="e4a679a9-ac4d-26c1-8e29-2dd4838747d3")
public static String es_PE_COLUMN_TaxID_Name="RFC";

@XendraColumn(AD_Element_ID="e0a9d0f7-835b-4f80-4c13-bff62213e232",ColumnName="TaxID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e4a679a9-ac4d-26c1-8e29-2dd4838747d3",
Synchronized="2020-03-03 21:34:27.0")
/** Column name TaxID */
public static final String COLUMNNAME_TaxID = "TaxID";
}
