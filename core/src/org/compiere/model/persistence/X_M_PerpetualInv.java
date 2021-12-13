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
/** Generated Model for M_PerpetualInv
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_PerpetualInv extends PO
{
/** Standard Constructor
@param ctx context
@param M_PerpetualInv_ID id
@param trxName transaction
*/
public X_M_PerpetualInv (Properties ctx, int M_PerpetualInv_ID, String trxName)
{
super (ctx, M_PerpetualInv_ID, trxName);
/** if (M_PerpetualInv_ID == 0)
{
setCountHighMovement (false);	
// N
setM_PerpetualInv_ID (0);
setName (null);
setNoInventoryCount (0);	
// 1
setNoProductCount (0);	
// 1
setNumberOfRuns (0);	
// 1
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_PerpetualInv (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=342 */
public static int Table_ID=MTable.getTable_ID("M_PerpetualInv");

@XendraTrl(Identifier="141377e7-fd83-8bda-e68c-290ac6e993ca")
public static String es_PE_TAB_PerpetualInventory_Name="Inventario Perpetuo";

@XendraTab(Name="Perpetual Inventory",Description="",Help="",
AD_Window_ID="9ec8dcb8-6cbf-6031-be0e-28382265d9e2",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="141377e7-fd83-8bda-e68c-290ac6e993ca",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_PerpetualInventory="141377e7-fd83-8bda-e68c-290ac6e993ca";

@XendraTrl(Identifier="520dcca0-fd69-4296-7705-8706525b6c41")
public static String es_PE_TABLE_M_PerpetualInv_Name="Inventario Perpetuo";

@XendraTable(Name="Perpetual Inventory",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="Rules for generating physical inventory",Help="",TableName="M_PerpetualInv",
AccessLevel="3",AD_Window_ID="9ec8dcb8-6cbf-6031-be0e-28382265d9e2",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=125,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="520dcca0-fd69-4296-7705-8706525b6c41",Synchronized="2020-03-03 21:38:46.0")
/** TableName=M_PerpetualInv */
public static final String Table_Name="M_PerpetualInv";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_PerpetualInv");

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
    Table_ID = MTable.getTable_ID("M_PerpetualInv");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_PerpetualInv[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Count high turnover items.
@param CountHighMovement Count High Movement products */
public void setCountHighMovement (boolean CountHighMovement)
{
set_Value (COLUMNNAME_CountHighMovement, Boolean.valueOf(CountHighMovement));
}
/** Get Count high turnover items.
@return Count High Movement products */
public boolean isCountHighMovement() 
{
Object oo = get_Value(COLUMNNAME_CountHighMovement);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="3797913a-fb2f-36fe-9c21-1f43f823113a")
public static String es_PE_FIELD_PerpetualInventory_CountHighTurnoverItems_Name="Contador de artículos de alta rotación";

@XendraTrl(Identifier="3797913a-fb2f-36fe-9c21-1f43f823113a")
public static String es_PE_FIELD_PerpetualInventory_CountHighTurnoverItems_Description="Conteo del producto de alto movimiento";

@XendraTrl(Identifier="3797913a-fb2f-36fe-9c21-1f43f823113a")
public static String es_PE_FIELD_PerpetualInventory_CountHighTurnoverItems_Help="El cuadro de verificación cuenta de alto movimiento indica si aquellos artículos con una alta rotación de inventarios serán contados";

@XendraField(AD_Column_ID="CountHighMovement",IsCentrallyMaintained=true,
AD_Tab_ID="141377e7-fd83-8bda-e68c-290ac6e993ca",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3797913a-fb2f-36fe-9c21-1f43f823113a")
public static final String FIELDNAME_PerpetualInventory_CountHighTurnoverItems="3797913a-fb2f-36fe-9c21-1f43f823113a";

@XendraTrl(Identifier="4fbbb7bb-b778-17a0-9f19-a3edf5ea85cf")
public static String es_PE_COLUMN_CountHighMovement_Name="Contador de artículos de alta rotación";

@XendraColumn(AD_Element_ID="921c891e-5885-c9fa-c821-8e75d3ce2080",ColumnName="CountHighMovement",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4fbbb7bb-b778-17a0-9f19-a3edf5ea85cf",
Synchronized="2019-08-30 22:23:21.0")
/** Column name CountHighMovement */
public static final String COLUMNNAME_CountHighMovement = "CountHighMovement";
/** Set Date last run.
@param DateLastRun Date the process was last run. */
public void setDateLastRun (Timestamp DateLastRun)
{
set_ValueNoCheck (COLUMNNAME_DateLastRun, DateLastRun);
}
/** Get Date last run.
@return Date the process was last run. */
public Timestamp getDateLastRun() 
{
return (Timestamp)get_Value(COLUMNNAME_DateLastRun);
}

@XendraTrl(Identifier="a360ea48-df8c-702c-4774-6b43229f5e78")
public static String es_PE_FIELD_PerpetualInventory_DateLastRun_Name="Última Fecha de Corrida";

@XendraTrl(Identifier="a360ea48-df8c-702c-4774-6b43229f5e78")
public static String es_PE_FIELD_PerpetualInventory_DateLastRun_Description="Fecha en que el proceso fue corrido por última vez";

@XendraTrl(Identifier="a360ea48-df8c-702c-4774-6b43229f5e78")
public static String es_PE_FIELD_PerpetualInventory_DateLastRun_Help="La fecha de última corrida indica la última vez que se corrió un proceso";

@XendraField(AD_Column_ID="DateLastRun",IsCentrallyMaintained=true,
AD_Tab_ID="141377e7-fd83-8bda-e68c-290ac6e993ca",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a360ea48-df8c-702c-4774-6b43229f5e78")
public static final String FIELDNAME_PerpetualInventory_DateLastRun="a360ea48-df8c-702c-4774-6b43229f5e78";

@XendraTrl(Identifier="854f6702-3ec6-c8ae-7491-f138c1e153fc")
public static String es_PE_COLUMN_DateLastRun_Name="Última Fecha de Corrida";

@XendraColumn(AD_Element_ID="e4c09739-6370-19ca-fdeb-4cdf8025abb8",ColumnName="DateLastRun",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="854f6702-3ec6-c8ae-7491-f138c1e153fc",
Synchronized="2019-08-30 22:23:21.0")
/** Column name DateLastRun */
public static final String COLUMNNAME_DateLastRun = "DateLastRun";
/** Set Date next run.
@param DateNextRun Date the process will run next */
public void setDateNextRun (Timestamp DateNextRun)
{
set_ValueNoCheck (COLUMNNAME_DateNextRun, DateNextRun);
}
/** Get Date next run.
@return Date the process will run next */
public Timestamp getDateNextRun() 
{
return (Timestamp)get_Value(COLUMNNAME_DateNextRun);
}

@XendraTrl(Identifier="2f29c7df-a779-a144-3b58-d6c277012408")
public static String es_PE_FIELD_PerpetualInventory_DateNextRun_Name="Siguiente Fecha de Corrida";

@XendraTrl(Identifier="2f29c7df-a779-a144-3b58-d6c277012408")
public static String es_PE_FIELD_PerpetualInventory_DateNextRun_Description="Fecha en que el proceso será corrido la siguiente vez";

@XendraTrl(Identifier="2f29c7df-a779-a144-3b58-d6c277012408")
public static String es_PE_FIELD_PerpetualInventory_DateNextRun_Help="La fecha de la siguiente corrida indica la siguiente vez que este proceso se correrá.";

@XendraField(AD_Column_ID="DateNextRun",IsCentrallyMaintained=true,
AD_Tab_ID="141377e7-fd83-8bda-e68c-290ac6e993ca",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2f29c7df-a779-a144-3b58-d6c277012408")
public static final String FIELDNAME_PerpetualInventory_DateNextRun="2f29c7df-a779-a144-3b58-d6c277012408";

@XendraTrl(Identifier="fbe1d216-c1b8-9661-06f3-b165cd66f275")
public static String es_PE_COLUMN_DateNextRun_Name="Siguiente Fecha de Corrida";

@XendraColumn(AD_Element_ID="215eac34-7f19-f6b2-ebeb-e6fbdb06d7ee",ColumnName="DateNextRun",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fbe1d216-c1b8-9661-06f3-b165cd66f275",
Synchronized="2019-08-30 22:23:21.0")
/** Column name DateNextRun */
public static final String COLUMNNAME_DateNextRun = "DateNextRun";
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

@XendraTrl(Identifier="fdd7d848-1176-82a6-6daa-df86847ea439")
public static String es_PE_FIELD_PerpetualInventory_Description_Name="Observación";

@XendraTrl(Identifier="fdd7d848-1176-82a6-6daa-df86847ea439")
public static String es_PE_FIELD_PerpetualInventory_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="fdd7d848-1176-82a6-6daa-df86847ea439")
public static String es_PE_FIELD_PerpetualInventory_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="141377e7-fd83-8bda-e68c-290ac6e993ca",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fdd7d848-1176-82a6-6daa-df86847ea439")
public static final String FIELDNAME_PerpetualInventory_Description="fdd7d848-1176-82a6-6daa-df86847ea439";

@XendraTrl(Identifier="982d3a1c-dfec-39f9-0358-df6ba7457123")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="982d3a1c-dfec-39f9-0358-df6ba7457123",
Synchronized="2019-08-30 22:23:21.0")
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
@XendraTrl(Identifier="498e5053-a955-4ea5-ac22-80eaa8f18572")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="498e5053-a955-4ea5-ac22-80eaa8f18572",
Synchronized="2019-08-30 22:23:21.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Perpetual Inventory.
@param M_PerpetualInv_ID Rules for generating physical inventory */
public void setM_PerpetualInv_ID (int M_PerpetualInv_ID)
{
if (M_PerpetualInv_ID < 1) throw new IllegalArgumentException ("M_PerpetualInv_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_PerpetualInv_ID, Integer.valueOf(M_PerpetualInv_ID));
}
/** Get Perpetual Inventory.
@return Rules for generating physical inventory */
public int getM_PerpetualInv_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_PerpetualInv_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="14194ae3-a1f1-8ec8-52e1-9f2f6d2144b6")
public static String es_PE_FIELD_PerpetualInventory_PerpetualInventory_Name="Inventario Perpetuo";

@XendraTrl(Identifier="14194ae3-a1f1-8ec8-52e1-9f2f6d2144b6")
public static String es_PE_FIELD_PerpetualInventory_PerpetualInventory_Description="Reglas para generar el inventario físico";

@XendraTrl(Identifier="14194ae3-a1f1-8ec8-52e1-9f2f6d2144b6")
public static String es_PE_FIELD_PerpetualInventory_PerpetualInventory_Help="El inventario perpetuo identifica la regla del inventario perpetuo que generó este inventario físico.";

@XendraField(AD_Column_ID="M_PerpetualInv_ID",IsCentrallyMaintained=true,
AD_Tab_ID="141377e7-fd83-8bda-e68c-290ac6e993ca",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="14194ae3-a1f1-8ec8-52e1-9f2f6d2144b6")
public static final String FIELDNAME_PerpetualInventory_PerpetualInventory="14194ae3-a1f1-8ec8-52e1-9f2f6d2144b6";
/** Column name M_PerpetualInv_ID */
public static final String COLUMNNAME_M_PerpetualInv_ID = "M_PerpetualInv_ID";
/** Set Product Category.
@param M_Product_Category_ID Category of a Product */
public void setM_Product_Category_ID (int M_Product_Category_ID)
{
if (M_Product_Category_ID <= 0) set_Value (COLUMNNAME_M_Product_Category_ID, null);
 else 
set_Value (COLUMNNAME_M_Product_Category_ID, Integer.valueOf(M_Product_Category_ID));
}
/** Get Product Category.
@return Category of a Product */
public int getM_Product_Category_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_Category_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="553f352b-7ae1-c941-7192-acc3e0a69364")
public static String es_PE_FIELD_PerpetualInventory_ProductCategory_Name="Categoría del Producto";

@XendraTrl(Identifier="553f352b-7ae1-c941-7192-acc3e0a69364")
public static String es_PE_FIELD_PerpetualInventory_ProductCategory_Description="Categoría de la que este producto es parte";

@XendraTrl(Identifier="553f352b-7ae1-c941-7192-acc3e0a69364")
public static String es_PE_FIELD_PerpetualInventory_ProductCategory_Help="Identifica la categoría a la que pertenece este producto. Las categorías del producto son usadas para el cálculo de precios";

@XendraField(AD_Column_ID="M_Product_Category_ID",IsCentrallyMaintained=true,
AD_Tab_ID="141377e7-fd83-8bda-e68c-290ac6e993ca",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="553f352b-7ae1-c941-7192-acc3e0a69364")
public static final String FIELDNAME_PerpetualInventory_ProductCategory="553f352b-7ae1-c941-7192-acc3e0a69364";

@XendraTrl(Identifier="c2d9799f-f39e-a032-f948-3ca71739241c")
public static String es_PE_COLUMN_M_Product_Category_ID_Name="Categoría del Producto";

@XendraColumn(AD_Element_ID="80d3e0bb-473b-67d4-42d5-1d776006a69c",
ColumnName="M_Product_Category_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c2d9799f-f39e-a032-f948-3ca71739241c",Synchronized="2019-08-30 22:23:21.0")
/** Column name M_Product_Category_ID */
public static final String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";
/** Set Warehouse.
@param M_Warehouse_ID Storage Warehouse and Service Point */
public void setM_Warehouse_ID (int M_Warehouse_ID)
{
if (M_Warehouse_ID <= 0) set_Value (COLUMNNAME_M_Warehouse_ID, null);
 else 
set_Value (COLUMNNAME_M_Warehouse_ID, Integer.valueOf(M_Warehouse_ID));
}
/** Get Warehouse.
@return Storage Warehouse and Service Point */
public int getM_Warehouse_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Warehouse_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="eec31886-4ad9-4b07-1d47-1a8da996ea76")
public static String es_PE_FIELD_PerpetualInventory_Warehouse_Name="Almacén";

@XendraTrl(Identifier="eec31886-4ad9-4b07-1d47-1a8da996ea76")
public static String es_PE_FIELD_PerpetualInventory_Warehouse_Description="Almacén";

@XendraTrl(Identifier="eec31886-4ad9-4b07-1d47-1a8da996ea76")
public static String es_PE_FIELD_PerpetualInventory_Warehouse_Help="El Almacén indica un Almacén único donde los productos son almacenados";

@XendraField(AD_Column_ID="M_Warehouse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="141377e7-fd83-8bda-e68c-290ac6e993ca",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eec31886-4ad9-4b07-1d47-1a8da996ea76")
public static final String FIELDNAME_PerpetualInventory_Warehouse="eec31886-4ad9-4b07-1d47-1a8da996ea76";

@XendraTrl(Identifier="97d5d77e-92b0-c680-28c3-f30149eafbd0")
public static String es_PE_COLUMN_M_Warehouse_ID_Name="Almacén";

@XendraColumn(AD_Element_ID="402045cd-baa5-aeaf-b148-a921dffb7821",ColumnName="M_Warehouse_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="04acc0b0-f57d-0e15-af5b-80249f6e7906",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="97d5d77e-92b0-c680-28c3-f30149eafbd0",Synchronized="2019-08-30 22:23:21.0")
/** Column name M_Warehouse_ID */
public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
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

@XendraTrl(Identifier="a32e9201-299e-49eb-b1cb-38cb4a6190c6")
public static String es_PE_FIELD_PerpetualInventory_Name_Name="Nombre";

@XendraTrl(Identifier="a32e9201-299e-49eb-b1cb-38cb4a6190c6")
public static String es_PE_FIELD_PerpetualInventory_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="a32e9201-299e-49eb-b1cb-38cb4a6190c6")
public static String es_PE_FIELD_PerpetualInventory_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="141377e7-fd83-8bda-e68c-290ac6e993ca",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a32e9201-299e-49eb-b1cb-38cb4a6190c6")
public static final String FIELDNAME_PerpetualInventory_Name="a32e9201-299e-49eb-b1cb-38cb4a6190c6";

@XendraTrl(Identifier="4e2d4e9c-104d-9423-61bf-ac8757e9e33b")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4e2d4e9c-104d-9423-61bf-ac8757e9e33b",
Synchronized="2019-08-30 22:23:21.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Number of Inventory counts.
@param NoInventoryCount Frequency of inventory counts per year */
public void setNoInventoryCount (int NoInventoryCount)
{
set_Value (COLUMNNAME_NoInventoryCount, Integer.valueOf(NoInventoryCount));
}
/** Get Number of Inventory counts.
@return Frequency of inventory counts per year */
public int getNoInventoryCount() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_NoInventoryCount);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="80ba0844-2505-8bba-cc96-5bfaa5b794ba")
public static String es_PE_FIELD_PerpetualInventory_NumberOfInventoryCounts_Name="Frecuencia Conteo de Inventario";

@XendraTrl(Identifier="80ba0844-2505-8bba-cc96-5bfaa5b794ba")
public static String es_PE_FIELD_PerpetualInventory_NumberOfInventoryCounts_Description="Frecuencia anual de conteos de inventario";

@XendraTrl(Identifier="80ba0844-2505-8bba-cc96-5bfaa5b794ba")
public static String es_PE_FIELD_PerpetualInventory_NumberOfInventoryCounts_Help="El número de conteos de Inventario indica el número de veces por año que los conteos de inventario se efectuarán.";

@XendraField(AD_Column_ID="NoInventoryCount",IsCentrallyMaintained=true,
AD_Tab_ID="141377e7-fd83-8bda-e68c-290ac6e993ca",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="80ba0844-2505-8bba-cc96-5bfaa5b794ba")
public static final String FIELDNAME_PerpetualInventory_NumberOfInventoryCounts="80ba0844-2505-8bba-cc96-5bfaa5b794ba";

@XendraTrl(Identifier="0c97838b-80aa-39f0-6cc8-bd2493ae135f")
public static String es_PE_COLUMN_NoInventoryCount_Name="Frecuencia Conteo de Inventario";

@XendraColumn(AD_Element_ID="9a75c976-579c-952f-19eb-bca73c1f95c2",ColumnName="NoInventoryCount",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="1",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0c97838b-80aa-39f0-6cc8-bd2493ae135f",
Synchronized="2019-08-30 22:23:21.0")
/** Column name NoInventoryCount */
public static final String COLUMNNAME_NoInventoryCount = "NoInventoryCount";
/** Set Number of Product counts.
@param NoProductCount Frequency of product counts per year */
public void setNoProductCount (int NoProductCount)
{
set_Value (COLUMNNAME_NoProductCount, Integer.valueOf(NoProductCount));
}
/** Get Number of Product counts.
@return Frequency of product counts per year */
public int getNoProductCount() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_NoProductCount);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="27313229-d823-fd7c-2061-670bce413685")
public static String es_PE_FIELD_PerpetualInventory_NumberOfProductCounts_Name="Frecuencia Conteo del Producto";

@XendraTrl(Identifier="27313229-d823-fd7c-2061-670bce413685")
public static String es_PE_FIELD_PerpetualInventory_NumberOfProductCounts_Description="Frecuencia anual de conteos del producto";

@XendraTrl(Identifier="27313229-d823-fd7c-2061-670bce413685")
public static String es_PE_FIELD_PerpetualInventory_NumberOfProductCounts_Help="El número de conteos del producto indica el número de veces por año que un producto será contado.";

@XendraField(AD_Column_ID="NoProductCount",IsCentrallyMaintained=true,
AD_Tab_ID="141377e7-fd83-8bda-e68c-290ac6e993ca",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="27313229-d823-fd7c-2061-670bce413685")
public static final String FIELDNAME_PerpetualInventory_NumberOfProductCounts="27313229-d823-fd7c-2061-670bce413685";

@XendraTrl(Identifier="0f9f28f6-6940-a5c0-c7e4-be07db0babbb")
public static String es_PE_COLUMN_NoProductCount_Name="Frecuencia Conteo del Producto";

@XendraColumn(AD_Element_ID="5fc807a4-bf5a-4932-82ce-d5aea0ca6ba3",ColumnName="NoProductCount",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="1",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0f9f28f6-6940-a5c0-c7e4-be07db0babbb",
Synchronized="2019-08-30 22:23:21.0")
/** Column name NoProductCount */
public static final String COLUMNNAME_NoProductCount = "NoProductCount";
/** Set Number of runs.
@param NumberOfRuns Frequency of processing Perpetual Inventory */
public void setNumberOfRuns (int NumberOfRuns)
{
set_Value (COLUMNNAME_NumberOfRuns, Integer.valueOf(NumberOfRuns));
}
/** Get Number of runs.
@return Frequency of processing Perpetual Inventory */
public int getNumberOfRuns() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_NumberOfRuns);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="83d21380-e776-8501-ec12-318b7fcb608b")
public static String es_PE_FIELD_PerpetualInventory_NumberOfRuns_Name="Número de Cálculos";

@XendraTrl(Identifier="83d21380-e776-8501-ec12-318b7fcb608b")
public static String es_PE_FIELD_PerpetualInventory_NumberOfRuns_Description="Frecuencia de proceso de inventarios perpetuos.";

@XendraTrl(Identifier="83d21380-e776-8501-ec12-318b7fcb608b")
public static String es_PE_FIELD_PerpetualInventory_NumberOfRuns_Help="El número de corridas indica el número de veces que el Inventario perpetuo ha sido procesado.";

@XendraField(AD_Column_ID="NumberOfRuns",IsCentrallyMaintained=true,
AD_Tab_ID="141377e7-fd83-8bda-e68c-290ac6e993ca",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=true,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="83d21380-e776-8501-ec12-318b7fcb608b")
public static final String FIELDNAME_PerpetualInventory_NumberOfRuns="83d21380-e776-8501-ec12-318b7fcb608b";

@XendraTrl(Identifier="38786ca4-e34c-f567-0f30-0167a1cf01f5")
public static String es_PE_COLUMN_NumberOfRuns_Name="Número de Cálculos";

@XendraColumn(AD_Element_ID="230c304b-0cc2-0c5d-d617-7af348597df3",ColumnName="NumberOfRuns",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="1",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="38786ca4-e34c-f567-0f30-0167a1cf01f5",
Synchronized="2019-08-30 22:23:21.0")
/** Column name NumberOfRuns */
public static final String COLUMNNAME_NumberOfRuns = "NumberOfRuns";
/** Set Process Now.
@param Processing Process Now */
public void setProcessing (boolean Processing)
{
set_Value (COLUMNNAME_Processing, Boolean.valueOf(Processing));
}
/** Get Process Now.
@return Process Now */
public boolean isProcessing() 
{
Object oo = get_Value(COLUMNNAME_Processing);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="003af7d9-12e6-c23e-8e89-1736f6eb4ebd")
public static String es_PE_FIELD_PerpetualInventory_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="141377e7-fd83-8bda-e68c-290ac6e993ca",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="003af7d9-12e6-c23e-8e89-1736f6eb4ebd")
public static final String FIELDNAME_PerpetualInventory_ProcessNow="003af7d9-12e6-c23e-8e89-1736f6eb4ebd";

@XendraTrl(Identifier="eb84b886-dcde-45a0-8eaa-573cae2902d9")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eb84b886-dcde-45a0-8eaa-573cae2902d9",
Synchronized="2019-08-30 22:23:21.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
}
