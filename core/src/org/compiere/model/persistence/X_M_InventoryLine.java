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
import org.compiere.model.reference.REF_M_InventoryType;
/** Generated Model for M_InventoryLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_InventoryLine extends PO
{
/** Standard Constructor
@param ctx context
@param M_InventoryLine_ID id
@param trxName transaction
*/
public X_M_InventoryLine (Properties ctx, int M_InventoryLine_ID, String trxName)
{
super (ctx, M_InventoryLine_ID, trxName);
/** if (M_InventoryLine_ID == 0)
{
setInventoryType (null);	
// D
setM_AttributeSetInstance_ID (0);
setM_Inventory_ID (0);
setM_InventoryLine_ID (0);
setM_Locator_ID (0);	
// @M_Locator_ID@
setM_Product_ID (0);
setProcessed (false);	
// N
setQtyBook (Env.ZERO);
setQtyCount (Env.ZERO);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_InventoryLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=322 */
public static int Table_ID=MTable.getTable_ID("M_InventoryLine");

@XendraTrl(Identifier="9d14f409-9344-6b6d-75ef-31637d986133")
public static String es_PE_TAB_InventoryCountLine_Description="Ìtem del conteo de inventario";

@XendraTrl(Identifier="9d14f409-9344-6b6d-75ef-31637d986133")
public static String es_PE_TAB_InventoryCountLine_Name="Ìtem de Conteo de Inventario";

@XendraTrl(Identifier="9d14f409-9344-6b6d-75ef-31637d986133")
public static String es_PE_TAB_InventoryCountLine_Help="El Ìtem del Conteo de Inventario define los conteos de los diferentes productos en el inventario.";

@XendraTab(Name="Inventory Count Line",Description="Inventory Count Line",
Help="The Inventory Count Line defines the counts of the individual products in inventory. Normally you would create inventory count lines automaticelly. If you create them manually, make sure that the book value is correct. You can set the Organization, if it is a charge, otherwise it is set to the header organization.",
AD_Window_ID="a8fe7291-40b1-7bfb-fc66-0a724a144092",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="9d14f409-9344-6b6d-75ef-31637d986133",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_InventoryCountLine="9d14f409-9344-6b6d-75ef-31637d986133";

@XendraTrl(Identifier="85b41d68-eeb0-028f-710b-0b04ae6117ca")
public static String es_PE_TAB_InternalUseLine_Description="Línea de inventario, uso interno";

@XendraTrl(Identifier="85b41d68-eeb0-028f-710b-0b04ae6117ca")
public static String es_PE_TAB_InternalUseLine_Name="Linea Inventario, Uso Interno ";

@XendraTrl(Identifier="85b41d68-eeb0-028f-710b-0b04ae6117ca")
public static String es_PE_TAB_InternalUseLine_Help="La línea de la cuenta del inventario define las cuentas de los productos individuales en inventario.";

@XendraTab(Name="Internal Use Line",Description="Internal Use Inventory Line",
Help="The Inventory Count Line defines the counts of the individual products in inventory.",
AD_Window_ID="b293be42-ad17-266d-d98c-612c2bfd5d35",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="85b41d68-eeb0-028f-710b-0b04ae6117ca",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_InternalUseLine="85b41d68-eeb0-028f-710b-0b04ae6117ca";

@XendraTrl(Identifier="14de7113-764d-2342-3006-0fe30f440bbb")
public static String es_PE_TABLE_M_InventoryLine_Name="Línea de Inventario Físico";

@XendraTable(Name="Phys.Inventory Line",Description="Unique line in an Inventory document",Help="",
TableName="M_InventoryLine",AccessLevel="1",AD_Window_ID="a8fe7291-40b1-7bfb-fc66-0a724a144092",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=135,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="14de7113-764d-2342-3006-0fe30f440bbb",Synchronized="2017-08-16 11:43:18.0")
/** TableName=M_InventoryLine */
public static final String Table_Name="M_InventoryLine";


@XendraIndex(Name="m_inventoryline_productlocattr",
Identifier="a7a4fc76-4afa-1aea-19d4-4ac04620d274",
Column_Names="m_inventory_id, m_locator_id, m_product_id, m_attributesetinstance_id",
IsUnique="true",TableIdentifier="a7a4fc76-4afa-1aea-19d4-4ac04620d274",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_m_inventoryline_productlocattr = "a7a4fc76-4afa-1aea-19d4-4ac04620d274";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_InventoryLine");

protected BigDecimal accessLevel = BigDecimal.valueOf(1);
/** AccessLevel
@return 1 - Org 
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
    Table_ID = MTable.getTable_ID("M_InventoryLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_InventoryLine[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Charge.
@param C_Charge_ID Additional document charges */
public void setC_Charge_ID (int C_Charge_ID)
{
if (C_Charge_ID <= 0) set_Value (COLUMNNAME_C_Charge_ID, null);
 else 
set_Value (COLUMNNAME_C_Charge_ID, Integer.valueOf(C_Charge_ID));
}
/** Get Charge.
@return Additional document charges */
public int getC_Charge_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Charge_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="592130d9-fedc-bc15-d62f-d2f8a05cbe53")
public static String es_PE_FIELD_InventoryCountLine_Charge_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="592130d9-fedc-bc15-d62f-d2f8a05cbe53")
public static String es_PE_FIELD_InventoryCountLine_Charge_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraTrl(Identifier="592130d9-fedc-bc15-d62f-d2f8a05cbe53")
public static String es_PE_FIELD_InventoryCountLine_Charge_Name="Cargo";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9d14f409-9344-6b6d-75ef-31637d986133",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@InventoryType@=C",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="592130d9-fedc-bc15-d62f-d2f8a05cbe53")
public static final String FIELDNAME_InventoryCountLine_Charge="592130d9-fedc-bc15-d62f-d2f8a05cbe53";

@XendraTrl(Identifier="37a0f7f2-e4f1-d713-f5dc-5a047dfcc9e5")
public static String es_PE_FIELD_InternalUseLine_Charge_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="37a0f7f2-e4f1-d713-f5dc-5a047dfcc9e5")
public static String es_PE_FIELD_InternalUseLine_Charge_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraTrl(Identifier="37a0f7f2-e4f1-d713-f5dc-5a047dfcc9e5")
public static String es_PE_FIELD_InternalUseLine_Charge_Name="Cargo";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="85b41d68-eeb0-028f-710b-0b04ae6117ca",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="37a0f7f2-e4f1-d713-f5dc-5a047dfcc9e5")
public static final String FIELDNAME_InternalUseLine_Charge="37a0f7f2-e4f1-d713-f5dc-5a047dfcc9e5";

@XendraTrl(Identifier="f162e920-ebd4-c8d4-53ca-93e4a4fc8983")
public static String es_PE_COLUMN_C_Charge_ID_Name="Cargo";

@XendraColumn(AD_Element_ID="d7e2fc48-a26e-4ded-ea44-fe15849a7883",ColumnName="C_Charge_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f162e920-ebd4-c8d4-53ca-93e4a4fc8983",
Synchronized="2017-08-05 16:55:13.0")
/** Column name C_Charge_ID */
public static final String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
/** Set Cost.
@param Cost Cost information */
public void setCost (BigDecimal Cost)
{
set_Value (COLUMNNAME_Cost, Cost);
}
/** Get Cost.
@return Cost information */
public BigDecimal getCost() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Cost);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="2d34752c-12af-4c1d-94fc-51e57f4fc716")
public static String es_PE_COLUMN_Cost_Name="Cost";

@XendraColumn(AD_Element_ID="ea07eea5-cd5c-5001-0f53-dfcaf5256889",ColumnName="Cost",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2d34752c-12af-4c1d-94fc-51e57f4fc716",
Synchronized="2017-08-05 16:55:13.0")
/** Column name Cost */
public static final String COLUMNNAME_Cost = "Cost";
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

@XendraTrl(Identifier="135f5b59-5e09-8945-6d2f-3294565aa8eb")
public static String es_PE_FIELD_InventoryCountLine_Description_Description="Descripción corta opcional del registro";

@XendraTrl(Identifier="135f5b59-5e09-8945-6d2f-3294565aa8eb")
public static String es_PE_FIELD_InventoryCountLine_Description_Help="Una descripción esta limitada a 255 caracteres";

@XendraTrl(Identifier="135f5b59-5e09-8945-6d2f-3294565aa8eb")
public static String es_PE_FIELD_InventoryCountLine_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="9d14f409-9344-6b6d-75ef-31637d986133",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="135f5b59-5e09-8945-6d2f-3294565aa8eb")
public static final String FIELDNAME_InventoryCountLine_Description="135f5b59-5e09-8945-6d2f-3294565aa8eb";

@XendraTrl(Identifier="0da58898-f44b-e311-1c5b-8f804353b8ae")
public static String es_PE_FIELD_InternalUseLine_Description_Description="Observación";

@XendraTrl(Identifier="0da58898-f44b-e311-1c5b-8f804353b8ae")
public static String es_PE_FIELD_InternalUseLine_Description_Help="Observación";

@XendraTrl(Identifier="0da58898-f44b-e311-1c5b-8f804353b8ae")
public static String es_PE_FIELD_InternalUseLine_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="85b41d68-eeb0-028f-710b-0b04ae6117ca",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0da58898-f44b-e311-1c5b-8f804353b8ae")
public static final String FIELDNAME_InternalUseLine_Description="0da58898-f44b-e311-1c5b-8f804353b8ae";

@XendraTrl(Identifier="452b947d-9cc6-6a93-e812-a8fe9d9264d1")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="452b947d-9cc6-6a93-e812-a8fe9d9264d1",
Synchronized="2017-08-05 16:55:13.0")
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
@XendraTrl(Identifier="18d9ca12-f41a-4538-b215-87248fc0f08e")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="18d9ca12-f41a-4538-b215-87248fc0f08e",
Synchronized="2017-08-05 16:55:13.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";

/** InventoryType AD_Reference=7e005d54-e029-eb24-c698-53b211653660 */
public static final int INVENTORYTYPE_AD_Reference_ID=292;
/** Set Inventory Type.
@param InventoryType Type of inventory difference */
public void setInventoryType (String InventoryType)
{
if (InventoryType == null) throw new IllegalArgumentException ("InventoryType is mandatory");
if (InventoryType.equals(REF_M_InventoryType.InventoryDifference) || InventoryType.equals(REF_M_InventoryType.ChargeAccount) || InventoryType.equals(REF_M_InventoryType.InitialCharge));
 else throw new IllegalArgumentException ("InventoryType Invalid value - " + InventoryType + " - Reference_ID=292 - D - C - I");
if (InventoryType.length() > 1)
{
log.warning("Length > 1 - truncated");
InventoryType = InventoryType.substring(0,0);
}
set_Value (COLUMNNAME_InventoryType, InventoryType);
}
/** Get Inventory Type.
@return Type of inventory difference */
public String getInventoryType() 
{
return (String)get_Value(COLUMNNAME_InventoryType);
}

@XendraTrl(Identifier="fdb5ad2f-923f-7131-ef02-93cbfa693991")
public static String es_PE_FIELD_InventoryCountLine_InventoryType_Description="Diferentes tipos de inventario";

@XendraTrl(Identifier="fdb5ad2f-923f-7131-ef02-93cbfa693991")
public static String es_PE_FIELD_InventoryCountLine_InventoryType_Help="El tipo de diferencia del inventario determina que cuenta es usada. Por default es la cuenta de la diferencia del inventario definida para el almacén. Alternativamente, usted podría seleccionar cualquier carga. Esto permite que usted explique uso interno ó pérdidas extraordinarias del inventario.";

@XendraTrl(Identifier="fdb5ad2f-923f-7131-ef02-93cbfa693991")
public static String es_PE_FIELD_InventoryCountLine_InventoryType_Name="Tipo de Inventario";

@XendraField(AD_Column_ID="InventoryType",IsCentrallyMaintained=true,
AD_Tab_ID="9d14f409-9344-6b6d-75ef-31637d986133",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fdb5ad2f-923f-7131-ef02-93cbfa693991")
public static final String FIELDNAME_InventoryCountLine_InventoryType="fdb5ad2f-923f-7131-ef02-93cbfa693991";

@XendraTrl(Identifier="5aa98a48-5d20-a41f-c8a0-f6c5aaaad3db")
public static String es_PE_FIELD_InternalUseLine_InventoryType_Description="Diferentes tipos de inventario";

@XendraTrl(Identifier="5aa98a48-5d20-a41f-c8a0-f6c5aaaad3db")
public static String es_PE_FIELD_InternalUseLine_InventoryType_Help="El tipo de diferencia del inventario determina que cuenta es usada. Por default es la cuenta de la diferencia del inventario definida para el almacén. Alternativamente, usted podría seleccionar cualquier carga. Esto permite que usted explique uso interno ó pérdidas extraordinarias del inventario.";

@XendraTrl(Identifier="5aa98a48-5d20-a41f-c8a0-f6c5aaaad3db")
public static String es_PE_FIELD_InternalUseLine_InventoryType_Name="Tipo de Inventario";

@XendraField(AD_Column_ID="InventoryType",IsCentrallyMaintained=true,
AD_Tab_ID="85b41d68-eeb0-028f-710b-0b04ae6117ca",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5aa98a48-5d20-a41f-c8a0-f6c5aaaad3db")
public static final String FIELDNAME_InternalUseLine_InventoryType="5aa98a48-5d20-a41f-c8a0-f6c5aaaad3db";

@XendraTrl(Identifier="6a0e2e3c-70e7-ae9d-7e03-ea53a7123cf0")
public static String es_PE_COLUMN_InventoryType_Name="Tipo de Inventario";

@XendraColumn(AD_Element_ID="11968cac-c964-2641-6d93-2aa0e9e5349b",ColumnName="InventoryType",
AD_Reference_ID=17,AD_Reference_Value_ID="7e005d54-e029-eb24-c698-53b211653660",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="D",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6a0e2e3c-70e7-ae9d-7e03-ea53a7123cf0",Synchronized="2017-08-05 16:55:13.0")
/** Column name InventoryType */
public static final String COLUMNNAME_InventoryType = "InventoryType";
/** Set IsCosted.
@param IsCosted IsCosted */
public void setIsCosted (boolean IsCosted)
{
set_Value (COLUMNNAME_IsCosted, Boolean.valueOf(IsCosted));
}
/** Get IsCosted.
@return IsCosted */
public boolean isCosted() 
{
Object oo = get_Value(COLUMNNAME_IsCosted);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="bda07b47-223d-a7a4-f5ae-7d5c7af61969")
public static String es_PE_COLUMN_IsCosted_Name="IsCosted";

@XendraColumn(AD_Element_ID="1d2cca33-7933-6933-e8cd-036ca4cb806e",ColumnName="IsCosted",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bda07b47-223d-a7a4-f5ae-7d5c7af61969",
Synchronized="2017-08-05 16:55:13.0")
/** Column name IsCosted */
public static final String COLUMNNAME_IsCosted = "IsCosted";
/** Set Line No.
@param Line Unique line for this document */
public void setLine (int Line)
{
set_Value (COLUMNNAME_Line, Integer.valueOf(Line));
}
/** Get Line No.
@return Unique line for this document */
public int getLine() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Line);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getLine()));
}

@XendraTrl(Identifier="2a3a69d8-214d-7c68-e39c-3094a3696c92")
public static String es_PE_FIELD_InventoryCountLine_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="2a3a69d8-214d-7c68-e39c-3094a3696c92")
public static String es_PE_FIELD_InventoryCountLine_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraTrl(Identifier="2a3a69d8-214d-7c68-e39c-3094a3696c92")
public static String es_PE_FIELD_InventoryCountLine_LineNo_Name="No. Ítem";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="9d14f409-9344-6b6d-75ef-31637d986133",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2a3a69d8-214d-7c68-e39c-3094a3696c92")
public static final String FIELDNAME_InventoryCountLine_LineNo="2a3a69d8-214d-7c68-e39c-3094a3696c92";

@XendraTrl(Identifier="ae7a400b-c598-d303-890f-2e82a5e9d264")
public static String es_PE_FIELD_InternalUseLine_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="ae7a400b-c598-d303-890f-2e82a5e9d264")
public static String es_PE_FIELD_InternalUseLine_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraTrl(Identifier="ae7a400b-c598-d303-890f-2e82a5e9d264")
public static String es_PE_FIELD_InternalUseLine_LineNo_Name="No. Línea";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="85b41d68-eeb0-028f-710b-0b04ae6117ca",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ae7a400b-c598-d303-890f-2e82a5e9d264")
public static final String FIELDNAME_InternalUseLine_LineNo="ae7a400b-c598-d303-890f-2e82a5e9d264";

@XendraTrl(Identifier="e7b8c642-19f0-3005-0b6f-2dd6a457ca19")
public static String es_PE_COLUMN_Line_Name="No. Línea";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM M_InventoryLine WHERE M_Inventory_ID=@M_Inventory_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e7b8c642-19f0-3005-0b6f-2dd6a457ca19",
Synchronized="2017-08-05 16:55:13.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";
/** Set Attribute Set Instance.
@param M_AttributeSetInstance_ID Product Attribute Set Instance */
public void setM_AttributeSetInstance_ID (int M_AttributeSetInstance_ID)
{
if (M_AttributeSetInstance_ID < 0) throw new IllegalArgumentException ("M_AttributeSetInstance_ID is mandatory.");
set_Value (COLUMNNAME_M_AttributeSetInstance_ID, Integer.valueOf(M_AttributeSetInstance_ID));
}
/** Get Attribute Set Instance.
@return Product Attribute Set Instance */
public int getM_AttributeSetInstance_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_AttributeSetInstance_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6e8318d6-3cb0-f152-70c5-a02b84780ad5")
public static String es_PE_FIELD_InventoryCountLine_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="6e8318d6-3cb0-f152-70c5-a02b84780ad5")
public static String es_PE_FIELD_InventoryCountLine_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="6e8318d6-3cb0-f152-70c5-a02b84780ad5")
public static String es_PE_FIELD_InventoryCountLine_AttributeSetInstance_Name="Lote - Serie";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9d14f409-9344-6b6d-75ef-31637d986133",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6e8318d6-3cb0-f152-70c5-a02b84780ad5")
public static final String FIELDNAME_InventoryCountLine_AttributeSetInstance="6e8318d6-3cb0-f152-70c5-a02b84780ad5";

@XendraTrl(Identifier="996b5ca1-00c9-863a-9f25-1a3ba6f9d2e8")
public static String es_PE_FIELD_InternalUseLine_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="996b5ca1-00c9-863a-9f25-1a3ba6f9d2e8")
public static String es_PE_FIELD_InternalUseLine_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="996b5ca1-00c9-863a-9f25-1a3ba6f9d2e8")
public static String es_PE_FIELD_InternalUseLine_AttributeSetInstance_Name="Lote - Serie";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="85b41d68-eeb0-028f-710b-0b04ae6117ca",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="996b5ca1-00c9-863a-9f25-1a3ba6f9d2e8")
public static final String FIELDNAME_InternalUseLine_AttributeSetInstance="996b5ca1-00c9-863a-9f25-1a3ba6f9d2e8";

@XendraTrl(Identifier="4609a3d2-e0f6-147f-049e-5a501a29802d")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Instancia del Conjunto de Atributos";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutInventory.product",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4609a3d2-e0f6-147f-049e-5a501a29802d",
Synchronized="2017-08-05 16:55:13.0")
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
/** Set Phys.Inventory.
@param M_Inventory_ID Parameters for a Physical Inventory */
public void setM_Inventory_ID (int M_Inventory_ID)
{
if (M_Inventory_ID < 1) throw new IllegalArgumentException ("M_Inventory_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Inventory_ID, Integer.valueOf(M_Inventory_ID));
}
/** Get Phys.Inventory.
@return Parameters for a Physical Inventory */
public int getM_Inventory_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Inventory_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="36c1a0df-0def-c25f-b79a-62a0fecfc15d")
public static String es_PE_FIELD_InventoryCountLine_PhysInventory_Description="Parámetros para el inventario físico.";

@XendraTrl(Identifier="36c1a0df-0def-c25f-b79a-62a0fecfc15d")
public static String es_PE_FIELD_InventoryCountLine_PhysInventory_Help="El inventario físico indica parámetros únicos para el inventario físico.";

@XendraTrl(Identifier="36c1a0df-0def-c25f-b79a-62a0fecfc15d")
public static String es_PE_FIELD_InventoryCountLine_PhysInventory_Name="Inventario Físico";

@XendraField(AD_Column_ID="M_Inventory_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9d14f409-9344-6b6d-75ef-31637d986133",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="36c1a0df-0def-c25f-b79a-62a0fecfc15d")
public static final String FIELDNAME_InventoryCountLine_PhysInventory="36c1a0df-0def-c25f-b79a-62a0fecfc15d";

@XendraTrl(Identifier="20f36025-3087-2e8f-8ccc-3af5b70056c8")
public static String es_PE_FIELD_InternalUseLine_PhysInventory_Description="Parámetros para el inventario físico.";

@XendraTrl(Identifier="20f36025-3087-2e8f-8ccc-3af5b70056c8")
public static String es_PE_FIELD_InternalUseLine_PhysInventory_Help="El inventario físico indica parámetros únicos para el inventario físico.";

@XendraTrl(Identifier="20f36025-3087-2e8f-8ccc-3af5b70056c8")
public static String es_PE_FIELD_InternalUseLine_PhysInventory_Name="Inventario Físico";

@XendraField(AD_Column_ID="M_Inventory_ID",IsCentrallyMaintained=true,
AD_Tab_ID="85b41d68-eeb0-028f-710b-0b04ae6117ca",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="20f36025-3087-2e8f-8ccc-3af5b70056c8")
public static final String FIELDNAME_InternalUseLine_PhysInventory="20f36025-3087-2e8f-8ccc-3af5b70056c8";

@XendraTrl(Identifier="bf5aef4a-7a90-01c4-5fea-7c4077ca7eec")
public static String es_PE_COLUMN_M_Inventory_ID_Name="Inventario Físico";

@XendraColumn(AD_Element_ID="0e8f85f3-fbb2-f347-b412-2f2218e14665",ColumnName="M_Inventory_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=3,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bf5aef4a-7a90-01c4-5fea-7c4077ca7eec",
Synchronized="2017-08-05 16:55:13.0")
/** Column name M_Inventory_ID */
public static final String COLUMNNAME_M_Inventory_ID = "M_Inventory_ID";
/** Set Phys.Inventory Line.
@param M_InventoryLine_ID Unique line in an Inventory document */
public void setM_InventoryLine_ID (int M_InventoryLine_ID)
{
if (M_InventoryLine_ID < 1) throw new IllegalArgumentException ("M_InventoryLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_InventoryLine_ID, Integer.valueOf(M_InventoryLine_ID));
}
/** Get Phys.Inventory Line.
@return Unique line in an Inventory document */
public int getM_InventoryLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_InventoryLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fe07d780-2660-3afb-0d3b-3aa8d8779989")
public static String es_PE_FIELD_InventoryCountLine_PhysInventoryLine_Description="Item único en un documento de inventario.";

@XendraTrl(Identifier="fe07d780-2660-3afb-0d3b-3aa8d8779989")
public static String es_PE_FIELD_InventoryCountLine_PhysInventoryLine_Help="Indica el Item del documento del inventario físico (si es aplicable) para esta transacción.";

@XendraTrl(Identifier="fe07d780-2660-3afb-0d3b-3aa8d8779989")
public static String es_PE_FIELD_InventoryCountLine_PhysInventoryLine_Name="Item de Inventario Físico";

@XendraField(AD_Column_ID="M_InventoryLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9d14f409-9344-6b6d-75ef-31637d986133",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fe07d780-2660-3afb-0d3b-3aa8d8779989")
public static final String FIELDNAME_InventoryCountLine_PhysInventoryLine="fe07d780-2660-3afb-0d3b-3aa8d8779989";

@XendraTrl(Identifier="c6d69fab-ab8c-8650-fb0a-e59ef3b61b77")
public static String es_PE_FIELD_InternalUseLine_PhysInventoryLine_Description="Item único en un documento de inventario.";

@XendraTrl(Identifier="c6d69fab-ab8c-8650-fb0a-e59ef3b61b77")
public static String es_PE_FIELD_InternalUseLine_PhysInventoryLine_Help="Indica el Item del documento del inventario físico (si es aplicable) para esta transacción.";

@XendraTrl(Identifier="c6d69fab-ab8c-8650-fb0a-e59ef3b61b77")
public static String es_PE_FIELD_InternalUseLine_PhysInventoryLine_Name="Item de Inventario Físico";

@XendraField(AD_Column_ID="M_InventoryLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="85b41d68-eeb0-028f-710b-0b04ae6117ca",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c6d69fab-ab8c-8650-fb0a-e59ef3b61b77")
public static final String FIELDNAME_InternalUseLine_PhysInventoryLine="c6d69fab-ab8c-8650-fb0a-e59ef3b61b77";
/** Column name M_InventoryLine_ID */
public static final String COLUMNNAME_M_InventoryLine_ID = "M_InventoryLine_ID";
/** Set Locator.
@param M_Locator_ID Warehouse Locator */
public void setM_Locator_ID (int M_Locator_ID)
{
if (M_Locator_ID < 1) throw new IllegalArgumentException ("M_Locator_ID is mandatory.");
set_Value (COLUMNNAME_M_Locator_ID, Integer.valueOf(M_Locator_ID));
}
/** Get Locator.
@return Warehouse Locator */
public int getM_Locator_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Locator_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1b824bec-56f8-ea2b-5281-b2d5cf0ca7fa")
public static String es_PE_FIELD_InventoryCountLine_Locator_Description="Ubicación de Almacén";

@XendraTrl(Identifier="1b824bec-56f8-ea2b-5281-b2d5cf0ca7fa")
public static String es_PE_FIELD_InventoryCountLine_Locator_Help="El ID de la ubicación indica en que parte del almacén se localiza el producto";

@XendraTrl(Identifier="1b824bec-56f8-ea2b-5281-b2d5cf0ca7fa")
public static String es_PE_FIELD_InventoryCountLine_Locator_Name="Ubicación";

@XendraField(AD_Column_ID="M_Locator_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9d14f409-9344-6b6d-75ef-31637d986133",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1b824bec-56f8-ea2b-5281-b2d5cf0ca7fa")
public static final String FIELDNAME_InventoryCountLine_Locator="1b824bec-56f8-ea2b-5281-b2d5cf0ca7fa";

@XendraTrl(Identifier="bd035c90-4358-cebf-2603-08fcdaca5e99")
public static String es_PE_FIELD_InternalUseLine_Locator_Description="Ubicación de Almacén";

@XendraTrl(Identifier="bd035c90-4358-cebf-2603-08fcdaca5e99")
public static String es_PE_FIELD_InternalUseLine_Locator_Help="El ID de la ubicación indica en que parte del almacén se localiza el producto";

@XendraTrl(Identifier="bd035c90-4358-cebf-2603-08fcdaca5e99")
public static String es_PE_FIELD_InternalUseLine_Locator_Name="Ubicación";

@XendraField(AD_Column_ID="M_Locator_ID",IsCentrallyMaintained=true,
AD_Tab_ID="85b41d68-eeb0-028f-710b-0b04ae6117ca",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bd035c90-4358-cebf-2603-08fcdaca5e99")
public static final String FIELDNAME_InternalUseLine_Locator="bd035c90-4358-cebf-2603-08fcdaca5e99";

@XendraTrl(Identifier="f832c49c-6d91-64ec-3001-5e48cf5743dc")
public static String es_PE_COLUMN_M_Locator_ID_Name="Ubicación";

@XendraColumn(AD_Element_ID="67f044ce-2864-93f9-fd0d-320945150933",ColumnName="M_Locator_ID",
AD_Reference_ID=31,AD_Reference_Value_ID="",AD_Val_Rule_ID="67c484dc-284d-a4ad-b352-8a8b313f4190",
FieldLength=22,DefaultValue="@M_Locator_ID@",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutInventory.product",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f832c49c-6d91-64ec-3001-5e48cf5743dc",
Synchronized="2017-08-05 16:55:13.0")
/** Column name M_Locator_ID */
public static final String COLUMNNAME_M_Locator_ID = "M_Locator_ID";

/** M_Product_ID AD_Reference=716fae5e-de65-cb55-cec9-d3f538d9eff8 */
public static final int M_PRODUCT_ID_AD_Reference_ID=171;
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID < 1) throw new IllegalArgumentException ("M_Product_ID is mandatory.");
set_Value (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
}
/** Get Product.
@return Product, Service, Item */
public int getM_Product_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="21582cb8-3c75-9c10-0ea0-1f6f016f79c1")
public static String es_PE_FIELD_InventoryCountLine_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="21582cb8-3c75-9c10-0ea0-1f6f016f79c1")
public static String es_PE_FIELD_InventoryCountLine_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="21582cb8-3c75-9c10-0ea0-1f6f016f79c1")
public static String es_PE_FIELD_InventoryCountLine_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9d14f409-9344-6b6d-75ef-31637d986133",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="21582cb8-3c75-9c10-0ea0-1f6f016f79c1")
public static final String FIELDNAME_InventoryCountLine_Product="21582cb8-3c75-9c10-0ea0-1f6f016f79c1";

@XendraTrl(Identifier="2e103f1c-f902-66bd-8fdd-419b667ef577")
public static String es_PE_FIELD_InternalUseLine_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="2e103f1c-f902-66bd-8fdd-419b667ef577")
public static String es_PE_FIELD_InternalUseLine_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="2e103f1c-f902-66bd-8fdd-419b667ef577")
public static String es_PE_FIELD_InternalUseLine_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="85b41d68-eeb0-028f-710b-0b04ae6117ca",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2e103f1c-f902-66bd-8fdd-419b667ef577")
public static final String FIELDNAME_InternalUseLine_Product="2e103f1c-f902-66bd-8fdd-419b667ef577";

@XendraTrl(Identifier="a88d8d2c-139c-ab46-87e6-fc3c462daa3c")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="716fae5e-de65-cb55-cec9-d3f538d9eff8",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutInventory.product",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a88d8d2c-139c-ab46-87e6-fc3c462daa3c",
Synchronized="2017-08-05 16:55:13.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Processed.
@param Processed The document has been processed */
public void setProcessed (boolean Processed)
{
set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
}
/** Get Processed.
@return The document has been processed */
public boolean isProcessed() 
{
Object oo = get_Value(COLUMNNAME_Processed);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="704777a0-de86-a3c2-7b18-72958565cd4d")
public static String es_PE_FIELD_InventoryCountLine_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="704777a0-de86-a3c2-7b18-72958565cd4d")
public static String es_PE_FIELD_InventoryCountLine_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="704777a0-de86-a3c2-7b18-72958565cd4d")
public static String es_PE_FIELD_InventoryCountLine_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="9d14f409-9344-6b6d-75ef-31637d986133",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="704777a0-de86-a3c2-7b18-72958565cd4d")
public static final String FIELDNAME_InventoryCountLine_Processed="704777a0-de86-a3c2-7b18-72958565cd4d";

@XendraTrl(Identifier="978c2d79-3dc1-30e4-68da-35747b161ea8")
public static String es_PE_FIELD_InternalUseLine_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="978c2d79-3dc1-30e4-68da-35747b161ea8")
public static String es_PE_FIELD_InternalUseLine_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="978c2d79-3dc1-30e4-68da-35747b161ea8")
public static String es_PE_FIELD_InternalUseLine_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="85b41d68-eeb0-028f-710b-0b04ae6117ca",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="978c2d79-3dc1-30e4-68da-35747b161ea8")
public static final String FIELDNAME_InternalUseLine_Processed="978c2d79-3dc1-30e4-68da-35747b161ea8";

@XendraTrl(Identifier="05c062e2-eef9-cd10-b26d-0a08be51a481")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="05c062e2-eef9-cd10-b26d-0a08be51a481",
Synchronized="2017-08-05 16:55:13.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set Quantity book.
@param QtyBook Book Quantity */
public void setQtyBook (BigDecimal QtyBook)
{
if (QtyBook == null) throw new IllegalArgumentException ("QtyBook is mandatory.");
set_ValueNoCheck (COLUMNNAME_QtyBook, QtyBook);
}
/** Get Quantity book.
@return Book Quantity */
public BigDecimal getQtyBook() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyBook);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="ee0d62f9-604b-9b3b-d1ce-1aaf730c6c82")
public static String es_PE_FIELD_InventoryCountLine_QuantityBook_Description="Cantidad en Libros";

@XendraTrl(Identifier="ee0d62f9-604b-9b3b-d1ce-1aaf730c6c82")
public static String es_PE_FIELD_InventoryCountLine_QuantityBook_Help="El cantidad en libros indica la cuenta de la línea almacenada en el sistema para un producto en inventario";

@XendraTrl(Identifier="ee0d62f9-604b-9b3b-d1ce-1aaf730c6c82")
public static String es_PE_FIELD_InventoryCountLine_QuantityBook_Name="Cantidad Actual";

@XendraField(AD_Column_ID="QtyBook",IsCentrallyMaintained=true,
AD_Tab_ID="9d14f409-9344-6b6d-75ef-31637d986133",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ee0d62f9-604b-9b3b-d1ce-1aaf730c6c82")
public static final String FIELDNAME_InventoryCountLine_QuantityBook="ee0d62f9-604b-9b3b-d1ce-1aaf730c6c82";

@XendraTrl(Identifier="29b82f82-a99d-ec47-1572-053d6ed67c87")
public static String es_PE_FIELD_InternalUseLine_QuantityBook_Description="Cantidad en Libros";

@XendraTrl(Identifier="29b82f82-a99d-ec47-1572-053d6ed67c87")
public static String es_PE_FIELD_InternalUseLine_QuantityBook_Help="El cantidad en libros indica la cuenta de la línea almacenada en el sistema para un producto en inventario";

@XendraTrl(Identifier="29b82f82-a99d-ec47-1572-053d6ed67c87")
public static String es_PE_FIELD_InternalUseLine_QuantityBook_Name="Cantidad en Libros";

@XendraField(AD_Column_ID="QtyBook",IsCentrallyMaintained=true,
AD_Tab_ID="85b41d68-eeb0-028f-710b-0b04ae6117ca",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="29b82f82-a99d-ec47-1572-053d6ed67c87")
public static final String FIELDNAME_InternalUseLine_QuantityBook="29b82f82-a99d-ec47-1572-053d6ed67c87";

@XendraTrl(Identifier="fec84ce6-08ce-2b76-781c-e5fbdcdbe3ff")
public static String es_PE_COLUMN_QtyBook_Name="Cantidad en Libros";

@XendraColumn(AD_Element_ID="6934ec29-953c-1617-8421-63d66b15d0f9",ColumnName="QtyBook",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fec84ce6-08ce-2b76-781c-e5fbdcdbe3ff",
Synchronized="2017-08-05 16:55:13.0")
/** Column name QtyBook */
public static final String COLUMNNAME_QtyBook = "QtyBook";
/** Set Quantity count.
@param QtyCount Counted Quantity */
public void setQtyCount (BigDecimal QtyCount)
{
if (QtyCount == null) throw new IllegalArgumentException ("QtyCount is mandatory.");
set_Value (COLUMNNAME_QtyCount, QtyCount);
}
/** Get Quantity count.
@return Counted Quantity */
public BigDecimal getQtyCount() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyCount);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="c555e42c-945b-e432-4d5a-d6db33cb6594")
public static String es_PE_FIELD_InventoryCountLine_QuantityCount_Description="Cantidad Contada";

@XendraTrl(Identifier="c555e42c-945b-e432-4d5a-d6db33cb6594")
public static String es_PE_FIELD_InventoryCountLine_QuantityCount_Help="La Cantidad Contada indica la cuenta de inventario actual tomada para un producto en inventario";

@XendraTrl(Identifier="c555e42c-945b-e432-4d5a-d6db33cb6594")
public static String es_PE_FIELD_InventoryCountLine_QuantityCount_Name="Cantidad Contada";

@XendraField(AD_Column_ID="QtyCount",IsCentrallyMaintained=true,
AD_Tab_ID="9d14f409-9344-6b6d-75ef-31637d986133",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c555e42c-945b-e432-4d5a-d6db33cb6594")
public static final String FIELDNAME_InventoryCountLine_QuantityCount="c555e42c-945b-e432-4d5a-d6db33cb6594";

@XendraTrl(Identifier="2f08c0cb-8ad9-7ed6-b0cd-ba0dbb139ce9")
public static String es_PE_FIELD_InternalUseLine_QuantityCount_Description="Cantidad Contada";

@XendraTrl(Identifier="2f08c0cb-8ad9-7ed6-b0cd-ba0dbb139ce9")
public static String es_PE_FIELD_InternalUseLine_QuantityCount_Help="La Cantidad Contada indica la cuenta de inventario actual tomada para un producto en inventario";

@XendraTrl(Identifier="2f08c0cb-8ad9-7ed6-b0cd-ba0dbb139ce9")
public static String es_PE_FIELD_InternalUseLine_QuantityCount_Name="Cantidad Contada";

@XendraField(AD_Column_ID="QtyCount",IsCentrallyMaintained=true,
AD_Tab_ID="85b41d68-eeb0-028f-710b-0b04ae6117ca",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2f08c0cb-8ad9-7ed6-b0cd-ba0dbb139ce9")
public static final String FIELDNAME_InternalUseLine_QuantityCount="2f08c0cb-8ad9-7ed6-b0cd-ba0dbb139ce9";

@XendraTrl(Identifier="b2276058-a25c-ac60-a88f-57692bda17b0")
public static String es_PE_COLUMN_QtyCount_Name="Cantidad Contada";

@XendraColumn(AD_Element_ID="0bc23bd1-673a-949b-480d-869c08afa39d",ColumnName="QtyCount",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="0",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b2276058-a25c-ac60-a88f-57692bda17b0",
Synchronized="2017-08-05 16:55:13.0")
/** Column name QtyCount */
public static final String COLUMNNAME_QtyCount = "QtyCount";
/** Set Internal Use Qty.
@param QtyInternalUse Internal Use Quantity removed from Inventory */
public void setQtyInternalUse (BigDecimal QtyInternalUse)
{
set_Value (COLUMNNAME_QtyInternalUse, QtyInternalUse);
}
/** Get Internal Use Qty.
@return Internal Use Quantity removed from Inventory */
public BigDecimal getQtyInternalUse() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyInternalUse);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="6c98b3dd-848d-53d1-3279-7e99c0166c84")
public static String es_PE_FIELD_InventoryCountLine_InternalUseQty_Description="Cantidad usada Internamente borrado por inventario";

@XendraTrl(Identifier="6c98b3dd-848d-53d1-3279-7e99c0166c84")
public static String es_PE_FIELD_InventoryCountLine_InternalUseQty_Help="Cantidad de inventario del producto usada internamente (si esta tomado hacia afuera positivo - negativa si está vuelto)";

@XendraTrl(Identifier="6c98b3dd-848d-53d1-3279-7e99c0166c84")
public static String es_PE_FIELD_InventoryCountLine_InternalUseQty_Name="Cantidad Usada Internamente";

@XendraField(AD_Column_ID="QtyInternalUse",IsCentrallyMaintained=true,
AD_Tab_ID="9d14f409-9344-6b6d-75ef-31637d986133",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6c98b3dd-848d-53d1-3279-7e99c0166c84")
public static final String FIELDNAME_InventoryCountLine_InternalUseQty="6c98b3dd-848d-53d1-3279-7e99c0166c84";

@XendraTrl(Identifier="97cd4400-effc-8e15-d394-0b108818d9fd")
public static String es_PE_FIELD_InternalUseLine_InternalUseQty_Description="Cantidad usada Internamente borrado por inventario";

@XendraTrl(Identifier="97cd4400-effc-8e15-d394-0b108818d9fd")
public static String es_PE_FIELD_InternalUseLine_InternalUseQty_Help="Cantidad de inventario del producto usada internamente (si esta tomado hacia afuera positivo - negativa si está vuelto)";

@XendraTrl(Identifier="97cd4400-effc-8e15-d394-0b108818d9fd")
public static String es_PE_FIELD_InternalUseLine_InternalUseQty_Name="Cantidad Usada Internamente";

@XendraField(AD_Column_ID="QtyInternalUse",IsCentrallyMaintained=true,
AD_Tab_ID="85b41d68-eeb0-028f-710b-0b04ae6117ca",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="97cd4400-effc-8e15-d394-0b108818d9fd")
public static final String FIELDNAME_InternalUseLine_InternalUseQty="97cd4400-effc-8e15-d394-0b108818d9fd";

@XendraTrl(Identifier="a44b43b4-87cf-92cd-1cbd-6086deb9ba1e")
public static String es_PE_COLUMN_QtyInternalUse_Name="Cantidad Usada Internamente";

@XendraColumn(AD_Element_ID="2e6dae80-a1e3-a1de-6a48-7e5b2dbc0f3e",ColumnName="QtyInternalUse",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a44b43b4-87cf-92cd-1cbd-6086deb9ba1e",
Synchronized="2017-08-05 16:55:13.0")
/** Column name QtyInternalUse */
public static final String COLUMNNAME_QtyInternalUse = "QtyInternalUse";
/** Set ReversalLine_ID.
@param ReversalLine_ID ReversalLine_ID */
public void setReversalLine_ID (int ReversalLine_ID)
{
if (ReversalLine_ID <= 0) set_Value (COLUMNNAME_ReversalLine_ID, null);
 else 
set_Value (COLUMNNAME_ReversalLine_ID, Integer.valueOf(ReversalLine_ID));
}
/** Get ReversalLine_ID.
@return ReversalLine_ID */
public int getReversalLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_ReversalLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="732b337d-e564-8e87-5956-3955dc3ad005")
public static String es_PE_COLUMN_ReversalLine_ID_Name="reversalline_id";

@XendraColumn(AD_Element_ID="21516ca0-09b5-e20b-cc75-a14c4c9c55b8",ColumnName="ReversalLine_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="732b337d-e564-8e87-5956-3955dc3ad005",
Synchronized="2017-08-05 16:55:13.0")
/** Column name ReversalLine_ID */
public static final String COLUMNNAME_ReversalLine_ID = "ReversalLine_ID";
/** Set UPC/EAN.
@param UPC Bar Code (Universal Product Code or its superset European Article Number) */
public void setUPC (String UPC)
{
throw new IllegalArgumentException ("UPC is virtual column");
}
/** Get UPC/EAN.
@return Bar Code (Universal Product Code or its superset European Article Number) */
public String getUPC() 
{
String value = (String)get_Value(COLUMNNAME_UPC);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="e7c36d8f-fb48-2259-2315-4b11ba12ca06")
public static String es_PE_FIELD_InventoryCountLine_UPCEAN_Description="Código de Barras (Codigo universal del Producto ó su super conjunto, Número de Articulo europeo)";

@XendraTrl(Identifier="e7c36d8f-fb48-2259-2315-4b11ba12ca06")
public static String es_PE_FIELD_InventoryCountLine_UPCEAN_Help="Use este campo para introducir el código de barras para el producto en cualquiera de las simbologías del código de barras  (Codabar; Código 25; Código 39; Código 93; Código 128; UPC (A); UPC (E); EAN-13; EAN-8; ITF; ITF-14; ISBN; ISSN; JAN-13; JAN-8; POSTNET y FIM; MSI/Plessey; y Pharmacode)";

@XendraTrl(Identifier="e7c36d8f-fb48-2259-2315-4b11ba12ca06")
public static String es_PE_FIELD_InventoryCountLine_UPCEAN_Name="UPC/EAN";

@XendraField(AD_Column_ID="UPC",IsCentrallyMaintained=true,
AD_Tab_ID="9d14f409-9344-6b6d-75ef-31637d986133",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=30,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e7c36d8f-fb48-2259-2315-4b11ba12ca06")
public static final String FIELDNAME_InventoryCountLine_UPCEAN="e7c36d8f-fb48-2259-2315-4b11ba12ca06";

@XendraTrl(Identifier="72027e5b-5f07-bb10-88c2-66b70e0a4355")
public static String es_PE_COLUMN_UPC_Name="UPC/EAN";

@XendraColumn(AD_Element_ID="9e36272a-ec41-b187-d531-cec50070c612",ColumnName="UPC",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="(SELECT UPC FROM M_Product p WHERE p.M_Product_ID=M_InventoryLine.M_Product_ID)",
IsAllowLogging=false,Identifier="72027e5b-5f07-bb10-88c2-66b70e0a4355",
Synchronized="2017-08-05 16:55:13.0")
/** Column name UPC */
public static final String COLUMNNAME_UPC = "UPC";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
throw new IllegalArgumentException ("Value is virtual column");
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
@XendraTrl(Identifier="d3fbf629-a8da-79fc-0c78-c41c7576589b")
public static String es_PE_FIELD_InventoryCountLine_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="d3fbf629-a8da-79fc-0c78-c41c7576589b")
public static String es_PE_FIELD_InventoryCountLine_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraTrl(Identifier="d3fbf629-a8da-79fc-0c78-c41c7576589b")
public static String es_PE_FIELD_InventoryCountLine_SearchKey_Name="Clave de Búsqueda";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="9d14f409-9344-6b6d-75ef-31637d986133",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d3fbf629-a8da-79fc-0c78-c41c7576589b")
public static final String FIELDNAME_InventoryCountLine_SearchKey="d3fbf629-a8da-79fc-0c78-c41c7576589b";

@XendraTrl(Identifier="aea1a805-4707-7d5b-ca17-1ec6ff63313f")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="(SELECT Value FROM M_Product p WHERE p.M_Product_ID=M_InventoryLine.M_Product_ID)",
IsAllowLogging=false,Identifier="aea1a805-4707-7d5b-ca17-1ec6ff63313f",
Synchronized="2017-08-05 16:55:13.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
