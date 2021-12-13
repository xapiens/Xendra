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
/** Generated Model for M_Product_BOM
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_Product_BOM extends PO
{
/** Standard Constructor
@param ctx context
@param M_Product_BOM_ID id
@param trxName transaction
*/
public X_M_Product_BOM (Properties ctx, int M_Product_BOM_ID, String trxName)
{
super (ctx, M_Product_BOM_ID, trxName);
/** if (M_Product_BOM_ID == 0)
{
setBOMQty (Env.ZERO);	
// 1
setLine (0);	
// @SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM M_Product_BOM WHERE M_Product_ID=@M_Product_ID@
setM_Product_BOM_ID (0);
setM_ProductBOM_ID (0);
setM_Product_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_Product_BOM (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=383 */
public static int Table_ID=MTable.getTable_ID("M_Product_BOM");

@XendraTrl(Identifier="311d9f04-4437-45f7-17a4-8672292e30e5")
public static String es_PE_TAB_BillOfMaterials_Description="Lista de Materiales de líneas de producto";

@XendraTrl(Identifier="311d9f04-4437-45f7-17a4-8672292e30e5")
public static String es_PE_TAB_BillOfMaterials_Help="La pestaña Lista de Matriales define aquellos productos que son generados a partir de otros productos. Una lista de materialess (LDM) consta de uno ó más productos ó LDM`s. Cantidad Disponible: 1. LDM almacenadas tienen que ser creadas via producción. 2. La cantidad disponible de una LDM que no se almacena es calculada dinámicamente. 3. El atributo `Almacenada` que califica a una LDM es definida en la pestaña Producto. Precio: 1. LDM tienen que estar enlistadas en listas de precios. 2. Si el precio es 0.00; el precio es calculado dinámicamente como la suma del precio de cada ítem que compone la LDM. Impresión: 1. Usualmente; solo la información de la LDM es impresa. 2. Para facturas; boletas de despacho y boletas de recolección; se tiene la opción de imprimir los detalles. 3. En los detalles; la cantidad es listada y también el precio si este es calculado dinámicamente.";

@XendraTrl(Identifier="311d9f04-4437-45f7-17a4-8672292e30e5")
public static String es_PE_TAB_BillOfMaterials_Name="Lista de Materiales";

@XendraTab(Name="Bill of Materials",Description="Bill of Material product lines",
Help="The Bill of Materials tab defines those products that are generated from other products.  A Bill of Material (BOM) is one or more Products or BOMs.  Available Quantity: - Stored BOMs have to be created via 'Production' - The available quantity of a non-stored BOMs is dynamically calculated - The attribute 'Stored' is defined in the 'Product' tab  Price: - BOMs must be listed in Pricelists - If the price is 0.00, the price is dynamically calculated  Printing: - Usually, only the BOM information is printed - For invoices, delivery slips and pick lists, you have the option to print the details - In the details, the quantity is listed - and the price, if this is dynamically calculated",
AD_Window_ID="ce2d4e2c-ba4e-29bf-9f71-66fecdc05f55",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="311d9f04-4437-45f7-17a4-8672292e30e5",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_BillOfMaterials="311d9f04-4437-45f7-17a4-8672292e30e5";

@XendraTrl(Identifier="18a4c14a-3fed-e4a2-acc4-8c55e913a8fa")
public static String es_PE_TABLE_M_Product_BOM_Name="Línea de Lista de Materiales";

@XendraTable(Name="BOM Line",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="M_Product_BOM",AccessLevel="3",AD_Window_ID="ce2d4e2c-ba4e-29bf-9f71-66fecdc05f55",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="18a4c14a-3fed-e4a2-acc4-8c55e913a8fa",Synchronized="2020-03-03 21:38:49.0")
/** TableName=M_Product_BOM */
public static final String Table_Name="M_Product_BOM";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_Product_BOM");

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
    Table_ID = MTable.getTable_ID("M_Product_BOM");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_Product_BOM[").append(get_ID()).append("]");
return sb.toString();
}
/** Set BOM Quantity.
@param BOMQty Bill of Materials Quantity */
public void setBOMQty (BigDecimal BOMQty)
{
if (BOMQty == null) throw new IllegalArgumentException ("BOMQty is mandatory.");
set_Value (COLUMNNAME_BOMQty, BOMQty);
}
/** Get BOM Quantity.
@return Bill of Materials Quantity */
public BigDecimal getBOMQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_BOMQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="8521e859-d06c-9b49-882d-89daf212c7cc")
public static String es_PE_FIELD_BillOfMaterials_BOMQuantity_Name="Cantidad en LDM";

@XendraTrl(Identifier="8521e859-d06c-9b49-882d-89daf212c7cc")
public static String es_PE_FIELD_BillOfMaterials_BOMQuantity_Description="Cantidad en la Lista de Materiales";

@XendraTrl(Identifier="8521e859-d06c-9b49-882d-89daf212c7cc")
public static String es_PE_FIELD_BillOfMaterials_BOMQuantity_Help="La cantidad de Lista de Materiales indica la cantidad del producto en su unidad de medida (multiplicador)";

@XendraField(AD_Column_ID="BOMQty",IsCentrallyMaintained=true,
AD_Tab_ID="311d9f04-4437-45f7-17a4-8672292e30e5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsBOM@='Y'",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8521e859-d06c-9b49-882d-89daf212c7cc")
public static final String FIELDNAME_BillOfMaterials_BOMQuantity="8521e859-d06c-9b49-882d-89daf212c7cc";

@XendraTrl(Identifier="bf7eacbe-ec9a-8c5a-1f25-45421f77e423")
public static String es_PE_COLUMN_BOMQty_Name="Cantidad en LDM";

@XendraColumn(AD_Element_ID="5919f8a7-8b3b-81f0-0a45-1abd107dfe84",ColumnName="BOMQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bf7eacbe-ec9a-8c5a-1f25-45421f77e423",
Synchronized="2019-08-30 22:23:25.0")
/** Column name BOMQty */
public static final String COLUMNNAME_BOMQty = "BOMQty";
/** Set BOM Type.
@param BOMType Type of BOM */
public void setBOMType (String BOMType)
{
if (BOMType != null && BOMType.length() > 1)
{
log.warning("Length > 1 - truncated");
BOMType = BOMType.substring(0,0);
}
set_Value (COLUMNNAME_BOMType, BOMType);
}
/** Get BOM Type.
@return Type of BOM */
public String getBOMType() 
{
return (String)get_Value(COLUMNNAME_BOMType);
}

@XendraTrl(Identifier="46353fb5-e29d-cace-a6f6-eadb089d5420")
public static String es_PE_FIELD_BillOfMaterials_BOMType_Name="Tipo LDM";

@XendraTrl(Identifier="46353fb5-e29d-cace-a6f6-eadb089d5420")
public static String es_PE_FIELD_BillOfMaterials_BOMType_Description="Tipo de LDM";

@XendraTrl(Identifier="46353fb5-e29d-cace-a6f6-eadb089d5420")
public static String es_PE_FIELD_BillOfMaterials_BOMType_Help="Tipo de Lista de Materiales";

@XendraField(AD_Column_ID="BOMType",IsCentrallyMaintained=true,
AD_Tab_ID="311d9f04-4437-45f7-17a4-8672292e30e5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsBOM@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="46353fb5-e29d-cace-a6f6-eadb089d5420")
public static final String FIELDNAME_BillOfMaterials_BOMType="46353fb5-e29d-cace-a6f6-eadb089d5420";

@XendraTrl(Identifier="7cf7057a-6180-b8d9-3484-a19917490cc3")
public static String es_PE_COLUMN_BOMType_Name="Tipo LDM";

@XendraColumn(AD_Element_ID="21ef1f6f-19df-c093-92ae-16d50df3c14f",ColumnName="BOMType",
AD_Reference_ID=17,AD_Reference_Value_ID="b9ae8ee9-425c-da2d-5182-32c62d681f71",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="P",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7cf7057a-6180-b8d9-3484-a19917490cc3",Synchronized="2019-08-30 22:23:25.0")
/** Column name BOMType */
public static final String COLUMNNAME_BOMType = "BOMType";
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

@XendraTrl(Identifier="2e2d665b-e8ae-3aea-63d3-ba76772f8245")
public static String es_PE_FIELD_BillOfMaterials_Description_Name="Observación";

@XendraTrl(Identifier="2e2d665b-e8ae-3aea-63d3-ba76772f8245")
public static String es_PE_FIELD_BillOfMaterials_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="2e2d665b-e8ae-3aea-63d3-ba76772f8245")
public static String es_PE_FIELD_BillOfMaterials_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="311d9f04-4437-45f7-17a4-8672292e30e5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsBOM@='Y'",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2e2d665b-e8ae-3aea-63d3-ba76772f8245")
public static final String FIELDNAME_BillOfMaterials_Description="2e2d665b-e8ae-3aea-63d3-ba76772f8245";

@XendraTrl(Identifier="b6dd2df4-872f-2313-3a32-1a5514ed42f5")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b6dd2df4-872f-2313-3a32-1a5514ed42f5",
Synchronized="2019-08-30 22:23:25.0")
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
@XendraTrl(Identifier="fe0eff79-0d6c-40e0-aca7-75f1584669f6")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fe0eff79-0d6c-40e0-aca7-75f1584669f6",
Synchronized="2019-08-30 22:23:25.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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

@XendraTrl(Identifier="54e56a5a-d639-c822-e14f-58d6f21039df")
public static String es_PE_FIELD_BillOfMaterials_LineNo_Name="No. Línea";

@XendraTrl(Identifier="54e56a5a-d639-c822-e14f-58d6f21039df")
public static String es_PE_FIELD_BillOfMaterials_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="54e56a5a-d639-c822-e14f-58d6f21039df")
public static String es_PE_FIELD_BillOfMaterials_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="311d9f04-4437-45f7-17a4-8672292e30e5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsBOM@='Y'",DisplayLength=11,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="54e56a5a-d639-c822-e14f-58d6f21039df")
public static final String FIELDNAME_BillOfMaterials_LineNo="54e56a5a-d639-c822-e14f-58d6f21039df";

@XendraTrl(Identifier="74aba25a-c2a2-2630-e0d2-bf40d67168fa")
public static String es_PE_COLUMN_Line_Name="No. Línea";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM M_Product_BOM WHERE M_Product_ID=@M_Product_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="74aba25a-c2a2-2630-e0d2-bf40d67168fa",
Synchronized="2019-08-30 22:23:25.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";
/** Set BOM Line.
@param M_Product_BOM_ID BOM Line */
public void setM_Product_BOM_ID (int M_Product_BOM_ID)
{
if (M_Product_BOM_ID < 1) throw new IllegalArgumentException ("M_Product_BOM_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Product_BOM_ID, Integer.valueOf(M_Product_BOM_ID));
}
/** Get BOM Line.
@return BOM Line */
public int getM_Product_BOM_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_BOM_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7b946b20-8228-8ab2-460d-18c53630e4d2")
public static String es_PE_FIELD_BillOfMaterials_BOMLine_Name="Item de Lista de Materiales";

@XendraField(AD_Column_ID="M_Product_BOM_ID",IsCentrallyMaintained=true,
AD_Tab_ID="311d9f04-4437-45f7-17a4-8672292e30e5",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7b946b20-8228-8ab2-460d-18c53630e4d2")
public static final String FIELDNAME_BillOfMaterials_BOMLine="7b946b20-8228-8ab2-460d-18c53630e4d2";
/** Column name M_Product_BOM_ID */
public static final String COLUMNNAME_M_Product_BOM_ID = "M_Product_BOM_ID";
/** Set BOM Product.
@param M_ProductBOM_ID Bill of Material Component Product */
public void setM_ProductBOM_ID (int M_ProductBOM_ID)
{
if (M_ProductBOM_ID < 1) throw new IllegalArgumentException ("M_ProductBOM_ID is mandatory.");
set_Value (COLUMNNAME_M_ProductBOM_ID, Integer.valueOf(M_ProductBOM_ID));
}
/** Get BOM Product.
@return Bill of Material Component Product */
public int getM_ProductBOM_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_ProductBOM_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getM_ProductBOM_ID()));
}

@XendraTrl(Identifier="5d1c5e2d-0e31-73cc-b370-9013483195ab")
public static String es_PE_FIELD_BillOfMaterials_BOMProduct_Name="Producto (Formula)/ LDM";

@XendraTrl(Identifier="5d1c5e2d-0e31-73cc-b370-9013483195ab")
public static String es_PE_FIELD_BillOfMaterials_BOMProduct_Description="Producto en Lista de Materiales";

@XendraTrl(Identifier="5d1c5e2d-0e31-73cc-b370-9013483195ab")
public static String es_PE_FIELD_BillOfMaterials_BOMProduct_Help="El Producto en LDM identifica un elemento que es parte de una lista de materiales";

@XendraField(AD_Column_ID="M_ProductBOM_ID",IsCentrallyMaintained=true,
AD_Tab_ID="311d9f04-4437-45f7-17a4-8672292e30e5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsBOM@='Y'",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=2,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5d1c5e2d-0e31-73cc-b370-9013483195ab")
public static final String FIELDNAME_BillOfMaterials_BOMProduct="5d1c5e2d-0e31-73cc-b370-9013483195ab";

@XendraTrl(Identifier="a5fae782-177d-25ea-1637-16cf178173e8")
public static String es_PE_COLUMN_M_ProductBOM_ID_Name="Producto (Formula)/ LDM";

@XendraColumn(AD_Element_ID="b4d24ab3-36aa-35f2-ebb2-81e1c924f11d",ColumnName="M_ProductBOM_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="28b49c4d-0409-b2e0-b70e-d686f8d6503f",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a5fae782-177d-25ea-1637-16cf178173e8",Synchronized="2019-08-30 22:23:25.0")
/** Column name M_ProductBOM_ID */
public static final String COLUMNNAME_M_ProductBOM_ID = "M_ProductBOM_ID";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID < 1) throw new IllegalArgumentException ("M_Product_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
}
/** Get Product.
@return Product, Service, Item */
public int getM_Product_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0c22c398-59cf-60cc-526e-0e6e9fe4bed5")
public static String es_PE_FIELD_BillOfMaterials_Product_Name="Producto";

@XendraTrl(Identifier="0c22c398-59cf-60cc-526e-0e6e9fe4bed5")
public static String es_PE_FIELD_BillOfMaterials_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="0c22c398-59cf-60cc-526e-0e6e9fe4bed5")
public static String es_PE_FIELD_BillOfMaterials_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="311d9f04-4437-45f7-17a4-8672292e30e5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsBOM@='Y'",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0c22c398-59cf-60cc-526e-0e6e9fe4bed5")
public static final String FIELDNAME_BillOfMaterials_Product="0c22c398-59cf-60cc-526e-0e6e9fe4bed5";

@XendraTrl(Identifier="ab6e3115-78b5-7640-c615-62d4b989fb3c")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ab6e3115-78b5-7640-c615-62d4b989fb3c",Synchronized="2019-08-30 22:23:25.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
}
