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
/** Generated Model for S_ExpenseType
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_S_ExpenseType extends PO
{
/** Standard Constructor
@param ctx context
@param S_ExpenseType_ID id
@param trxName transaction
*/
public X_S_ExpenseType (Properties ctx, int S_ExpenseType_ID, String trxName)
{
super (ctx, S_ExpenseType_ID, trxName);
/** if (S_ExpenseType_ID == 0)
{
setC_TaxCategory_ID (0);
setC_UOM_ID (0);
setIsInvoiced (false);	
// N
setM_Product_Category_ID (0);
setName (null);
setS_ExpenseType_ID (0);
setValue (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_S_ExpenseType (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=481 */
public static int Table_ID=MTable.getTable_ID("S_ExpenseType");

@XendraTrl(Identifier="66614c8c-a644-598f-e571-5d9a19182c32")
public static String es_PE_TAB_ExpenseType_Description="Mantener tipo de Informe de gasto";

@XendraTrl(Identifier="66614c8c-a644-598f-e571-5d9a19182c32")
public static String es_PE_TAB_ExpenseType_Name="Tipo de Gasto";
@XendraTab(Name="Expense Type",
Description="Maintain Expense Report Type",Help="",
AD_Window_ID="e37c684c-2fb9-31f4-b025-d8ef9933998c",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="66614c8c-a644-598f-e571-5d9a19182c32",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ExpenseType="66614c8c-a644-598f-e571-5d9a19182c32";

@XendraTrl(Identifier="29395c6b-bbef-c856-b5c7-89dcfb18a443")
public static String es_PE_TABLE_S_ExpenseType_Name="Tipo de Gasto";

@XendraTable(Name="Expense Type",Description="Expense report type",Help="",
TableName="S_ExpenseType",AccessLevel="3",AD_Window_ID="e37c684c-2fb9-31f4-b025-d8ef9933998c",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=85,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.services",
Identifier="29395c6b-bbef-c856-b5c7-89dcfb18a443",Synchronized="2017-08-16 11:44:14.0")
/** TableName=S_ExpenseType */
public static final String Table_Name="S_ExpenseType";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"S_ExpenseType");

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
    Table_ID = MTable.getTable_ID("S_ExpenseType");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_S_ExpenseType[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Tax Category.
@param C_TaxCategory_ID Tax Category */
public void setC_TaxCategory_ID (int C_TaxCategory_ID)
{
if (C_TaxCategory_ID < 1) throw new IllegalArgumentException ("C_TaxCategory_ID is mandatory.");
set_Value (COLUMNNAME_C_TaxCategory_ID, Integer.valueOf(C_TaxCategory_ID));
}
/** Get Tax Category.
@return Tax Category */
public int getC_TaxCategory_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_TaxCategory_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9cf3beb4-ec90-691b-1bf3-7fa51b8f0dea")
public static String es_PE_FIELD_ExpenseType_TaxCategory_Description="Categoría del Impuesto";

@XendraTrl(Identifier="9cf3beb4-ec90-691b-1bf3-7fa51b8f0dea")
public static String es_PE_FIELD_ExpenseType_TaxCategory_Help="La categoría de impuesto proporciona un método de agrupación de impuestos similares. (Ej. Impuesto de ventas ó Impuesto al Valor Agregado)";

@XendraTrl(Identifier="9cf3beb4-ec90-691b-1bf3-7fa51b8f0dea")
public static String es_PE_FIELD_ExpenseType_TaxCategory_Name="Categoría del Impuesto";

@XendraField(AD_Column_ID="C_TaxCategory_ID",IsCentrallyMaintained=true,
AD_Tab_ID="66614c8c-a644-598f-e571-5d9a19182c32",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9cf3beb4-ec90-691b-1bf3-7fa51b8f0dea")
public static final String FIELDNAME_ExpenseType_TaxCategory="9cf3beb4-ec90-691b-1bf3-7fa51b8f0dea";

@XendraTrl(Identifier="e89ae737-6fa8-0be6-8327-9066b83f3164")
public static String es_PE_COLUMN_C_TaxCategory_ID_Name="Categoría del Impuesto";

@XendraColumn(AD_Element_ID="d52d1891-09d1-cd05-f9fa-46c801a8d9a6",ColumnName="C_TaxCategory_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e89ae737-6fa8-0be6-8327-9066b83f3164",
Synchronized="2017-08-05 16:56:19.0")
/** Column name C_TaxCategory_ID */
public static final String COLUMNNAME_C_TaxCategory_ID = "C_TaxCategory_ID";
/** Set UOM.
@param C_UOM_ID Unit of Measure */
public void setC_UOM_ID (int C_UOM_ID)
{
if (C_UOM_ID < 1) throw new IllegalArgumentException ("C_UOM_ID is mandatory.");
set_Value (COLUMNNAME_C_UOM_ID, Integer.valueOf(C_UOM_ID));
}
/** Get UOM.
@return Unit of Measure */
public int getC_UOM_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_UOM_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f7fefd7a-4f2d-5533-abfb-27ff9b10c585")
public static String es_PE_FIELD_ExpenseType_UOM_Description="Unidad de Medida";

@XendraTrl(Identifier="f7fefd7a-4f2d-5533-abfb-27ff9b10c585")
public static String es_PE_FIELD_ExpenseType_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraTrl(Identifier="f7fefd7a-4f2d-5533-abfb-27ff9b10c585")
public static String es_PE_FIELD_ExpenseType_UOM_Name="UM";
@XendraField(AD_Column_ID="C_UOM_ID",
IsCentrallyMaintained=true,AD_Tab_ID="66614c8c-a644-598f-e571-5d9a19182c32",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f7fefd7a-4f2d-5533-abfb-27ff9b10c585")
public static final String FIELDNAME_ExpenseType_UOM="f7fefd7a-4f2d-5533-abfb-27ff9b10c585";

@XendraTrl(Identifier="e23df2a9-1f89-fb12-c40c-5f78971fc7ca")
public static String es_PE_COLUMN_C_UOM_ID_Name="UM";

@XendraColumn(AD_Element_ID="d0345019-4fcc-44c8-4fd1-e38e3b4adeed",ColumnName="C_UOM_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e23df2a9-1f89-fb12-c40c-5f78971fc7ca",
Synchronized="2017-08-05 16:56:19.0")
/** Column name C_UOM_ID */
public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
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

@XendraTrl(Identifier="4d548554-acfc-9bf5-3d18-fa6be34c2741")
public static String es_PE_FIELD_ExpenseType_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="4d548554-acfc-9bf5-3d18-fa6be34c2741")
public static String es_PE_FIELD_ExpenseType_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="4d548554-acfc-9bf5-3d18-fa6be34c2741")
public static String es_PE_FIELD_ExpenseType_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="66614c8c-a644-598f-e571-5d9a19182c32",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4d548554-acfc-9bf5-3d18-fa6be34c2741")
public static final String FIELDNAME_ExpenseType_Description="4d548554-acfc-9bf5-3d18-fa6be34c2741";

@XendraTrl(Identifier="2b1593e4-1c78-1c8b-a6e1-90e567887a96")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2b1593e4-1c78-1c8b-a6e1-90e567887a96",
Synchronized="2017-08-05 16:56:19.0")
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
@XendraTrl(Identifier="3a137dd8-7028-4c41-8e82-2a0005c2d9d6")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3a137dd8-7028-4c41-8e82-2a0005c2d9d6",
Synchronized="2017-08-05 16:56:19.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Invoiced.
@param IsInvoiced Is this invoiced? */
public void setIsInvoiced (boolean IsInvoiced)
{
set_Value (COLUMNNAME_IsInvoiced, Boolean.valueOf(IsInvoiced));
}
/** Get Invoiced.
@return Is this invoiced? */
public boolean isInvoiced() 
{
Object oo = get_Value(COLUMNNAME_IsInvoiced);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f21a532f-434d-4d9b-138c-815b0be51b3b")
public static String es_PE_FIELD_ExpenseType_Invoiced_Name="Facturado";

@XendraField(AD_Column_ID="IsInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="66614c8c-a644-598f-e571-5d9a19182c32",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f21a532f-434d-4d9b-138c-815b0be51b3b")
public static final String FIELDNAME_ExpenseType_Invoiced="f21a532f-434d-4d9b-138c-815b0be51b3b";

@XendraTrl(Identifier="3c38ab42-4471-4236-5ea0-ff2dfcfa3f1e")
public static String es_PE_COLUMN_IsInvoiced_Name="Facturado";

@XendraColumn(AD_Element_ID="a685c688-064e-aa25-7a8b-2b0273e958c1",ColumnName="IsInvoiced",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3c38ab42-4471-4236-5ea0-ff2dfcfa3f1e",
Synchronized="2017-08-05 16:56:19.0")
/** Column name IsInvoiced */
public static final String COLUMNNAME_IsInvoiced = "IsInvoiced";
/** Set Product Category.
@param M_Product_Category_ID Category of a Product */
public void setM_Product_Category_ID (int M_Product_Category_ID)
{
if (M_Product_Category_ID < 1) throw new IllegalArgumentException ("M_Product_Category_ID is mandatory.");
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

@XendraTrl(Identifier="47afaac3-075e-6bd7-02b5-0921d93e4b56")
public static String es_PE_FIELD_ExpenseType_ProductCategory_Description="Categoría de la que este producto es parte";

@XendraTrl(Identifier="47afaac3-075e-6bd7-02b5-0921d93e4b56")
public static String es_PE_FIELD_ExpenseType_ProductCategory_Help="Identifica la categoría a la que pertenece este producto. Las categorías del producto son usadas para el cálculo de precios";

@XendraTrl(Identifier="47afaac3-075e-6bd7-02b5-0921d93e4b56")
public static String es_PE_FIELD_ExpenseType_ProductCategory_Name="Categoría del Producto";

@XendraField(AD_Column_ID="M_Product_Category_ID",IsCentrallyMaintained=true,
AD_Tab_ID="66614c8c-a644-598f-e571-5d9a19182c32",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="47afaac3-075e-6bd7-02b5-0921d93e4b56")
public static final String FIELDNAME_ExpenseType_ProductCategory="47afaac3-075e-6bd7-02b5-0921d93e4b56";

@XendraTrl(Identifier="3b1c0f61-dcc1-6fff-ab56-ebda81261540")
public static String es_PE_COLUMN_M_Product_Category_ID_Name="Categoría del Producto";

@XendraColumn(AD_Element_ID="80d3e0bb-473b-67d4-42d5-1d776006a69c",
ColumnName="M_Product_Category_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3b1c0f61-dcc1-6fff-ab56-ebda81261540",Synchronized="2017-08-05 16:56:19.0")
/** Column name M_Product_Category_ID */
public static final String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";
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

@XendraTrl(Identifier="3a175742-cb11-409d-5332-f7115d038fbf")
public static String es_PE_FIELD_ExpenseType_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="3a175742-cb11-409d-5332-f7115d038fbf")
public static String es_PE_FIELD_ExpenseType_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="3a175742-cb11-409d-5332-f7115d038fbf")
public static String es_PE_FIELD_ExpenseType_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="66614c8c-a644-598f-e571-5d9a19182c32",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="3a175742-cb11-409d-5332-f7115d038fbf")
public static final String FIELDNAME_ExpenseType_Name="3a175742-cb11-409d-5332-f7115d038fbf";

@XendraTrl(Identifier="5d670e67-ec01-7dbd-bcce-d7d8b263d0cc")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5d670e67-ec01-7dbd-bcce-d7d8b263d0cc",
Synchronized="2017-08-05 16:56:19.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Expense Type.
@param S_ExpenseType_ID Expense report type */
public void setS_ExpenseType_ID (int S_ExpenseType_ID)
{
if (S_ExpenseType_ID < 1) throw new IllegalArgumentException ("S_ExpenseType_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_S_ExpenseType_ID, Integer.valueOf(S_ExpenseType_ID));
}
/** Get Expense Type.
@return Expense report type */
public int getS_ExpenseType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_S_ExpenseType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6a5cd655-2dcc-5e9a-ea41-6b07c1350777")
public static String es_PE_FIELD_ExpenseType_ExpenseType_Description="Tipo de Informe de gasto";

@XendraTrl(Identifier="6a5cd655-2dcc-5e9a-ea41-6b07c1350777")
public static String es_PE_FIELD_ExpenseType_ExpenseType_Name="Tipo de Gasto";

@XendraField(AD_Column_ID="S_ExpenseType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="66614c8c-a644-598f-e571-5d9a19182c32",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6a5cd655-2dcc-5e9a-ea41-6b07c1350777")
public static final String FIELDNAME_ExpenseType_ExpenseType="6a5cd655-2dcc-5e9a-ea41-6b07c1350777";
/** Column name S_ExpenseType_ID */
public static final String COLUMNNAME_S_ExpenseType_ID = "S_ExpenseType_ID";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value == null) throw new IllegalArgumentException ("Value is mandatory.");
if (Value.length() > 40)
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
@XendraTrl(Identifier="633ab9b6-7cc2-a204-7948-27c708d3386b")
public static String es_PE_FIELD_ExpenseType_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="633ab9b6-7cc2-a204-7948-27c708d3386b")
public static String es_PE_FIELD_ExpenseType_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraTrl(Identifier="633ab9b6-7cc2-a204-7948-27c708d3386b")
public static String es_PE_FIELD_ExpenseType_SearchKey_Name="Clave de Búsqueda";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="66614c8c-a644-598f-e571-5d9a19182c32",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="633ab9b6-7cc2-a204-7948-27c708d3386b")
public static final String FIELDNAME_ExpenseType_SearchKey="633ab9b6-7cc2-a204-7948-27c708d3386b";

@XendraTrl(Identifier="430949ea-4485-68e0-36eb-bf214f675ed3")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="430949ea-4485-68e0-36eb-bf214f675ed3",
Synchronized="2017-08-05 16:56:19.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
