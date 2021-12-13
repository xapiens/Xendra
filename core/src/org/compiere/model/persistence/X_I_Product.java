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
/** Generated Model for I_Product
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_I_Product extends PO
{
/** Standard Constructor
@param ctx context
@param I_Product_ID id
@param trxName transaction
*/
public X_I_Product (Properties ctx, int I_Product_ID, String trxName)
{
super (ctx, I_Product_ID, trxName);
/** if (I_Product_ID == 0)
{
setC_BPartner_ID (0);
setC_UOM_ID (0);
setI_IsImported (false);	
// N
setI_Product_ID (0);
setM_Product_Category_ID (0);
setName (null);
setProductType (null);	
// I
setValue (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_I_Product (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=532 */
public static int Table_ID=MTable.getTable_ID("I_Product");

@XendraTrl(Identifier="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8")
public static String es_PE_TAB_ImportProduct_Description="Importar Productos";

@XendraTrl(Identifier="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8")
public static String es_PE_TAB_ImportProduct_Help="Antes de importar, Adempiere comprueba la unidad de la medida (por default si no es fijado), La categoria del producto (por default si no es fijado), El socio de negocio, la moneda (Por default la moneda de la contabilidad si no es fijada), El tipo de producto (solamente artículos y servicios), los únicos de UPC, llave y existencia de el No. de producto.<br>Adempiere intenta para el mapa de los productos existentes, si el UPC, La llave y el vendedor del producto no siguen (en esta secuencia). Si el expediente importado podría ser emparejado, los valores del campo del producto serán sobreescritos solamente, si el campo correspondiente de la importación se define explícitamente. Ejemplo: la categoría del producto será sobreescrita solamente si está fijada explícitamente en la importación.";

@XendraTrl(Identifier="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8")
public static String es_PE_TAB_ImportProduct_Name="Importar Productos";

@XendraTab(Name="Import Product",Description="Import Products",
Help="Before importing, Adempiere checks the Unit of Measure (default if not set), the Product Category (default if not set), the Business Partner, the Currency (defaults to accounting currency if not set), the Product Type (only Items and Services), the uniqueness of UPC, Key and uniqueness and existence of the Vendor Product No.<br> Adempiere tries to map to existing products, if the UPC, the Key and the Vendor Product No matches (in this sequence). If the imported record could be matched, product field values will only be overwritten, if the corresponding  Import field is explicitly defined.  Example: the Product Category will only be overwritten if explicitly set in the Import.",
AD_Window_ID="cb9a88bc-981e-7fdc-958a-4b9d4cde623a",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ImportProduct="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8";

@XendraTrl(Identifier="0dbf0a4b-62a2-5055-817f-4ca8c9a9f593")
public static String es_PE_TABLE_I_Product_Name="Importar Productos";

@XendraTable(Name="Import Product",AD_Package_ID="645f34c0-ea3a-ac63-618d-8ca49873c33b",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Import Item or Service",Help="",
TableName="I_Product",AccessLevel="2",AD_Window_ID="cb9a88bc-981e-7fdc-958a-4b9d4cde623a",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.import",
Identifier="0dbf0a4b-62a2-5055-817f-4ca8c9a9f593",Synchronized="2020-03-03 21:38:14.0")
/** TableName=I_Product */
public static final String Table_Name="I_Product";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"I_Product");

protected BigDecimal accessLevel = BigDecimal.valueOf(2);
/** AccessLevel
@return 2 - Client 
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
    Table_ID = MTable.getTable_ID("I_Product");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_I_Product[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Business Partner Key.
@param BPartner_Value The Key of the Business Partner */
public void setBPartner_Value (String BPartner_Value)
{
if (BPartner_Value != null && BPartner_Value.length() > 40)
{
log.warning("Length > 40 - truncated");
BPartner_Value = BPartner_Value.substring(0,39);
}
set_Value (COLUMNNAME_BPartner_Value, BPartner_Value);
}
/** Get Business Partner Key.
@return The Key of the Business Partner */
public String getBPartner_Value() 
{
String value = (String)get_Value(COLUMNNAME_BPartner_Value);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="040284a0-aae3-7538-eccb-d116fdeff45b")
public static String es_PE_FIELD_ImportProduct_BusinessPartnerKey_Name="Clave de S.N.";

@XendraTrl(Identifier="040284a0-aae3-7538-eccb-d116fdeff45b")
public static String es_PE_FIELD_ImportProduct_BusinessPartnerKey_Description="La clave del S.N.";

@XendraField(AD_Column_ID="BPartner_Value",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="Business Partner",
IsDisplayed=true,DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=390,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="040284a0-aae3-7538-eccb-d116fdeff45b")
public static final String FIELDNAME_ImportProduct_BusinessPartnerKey="040284a0-aae3-7538-eccb-d116fdeff45b";

@XendraTrl(Identifier="6d8b1015-1523-1690-640f-43db3dacc300")
public static String es_PE_COLUMN_BPartner_Value_Name="Clave de S.N.";

@XendraColumn(AD_Element_ID="0dc0e5ce-73ba-f7b3-e9a6-86c2a48fd36d",ColumnName="BPartner_Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6d8b1015-1523-1690-640f-43db3dacc300",
Synchronized="2019-08-30 22:22:54.0")
/** Column name BPartner_Value */
public static final String COLUMNNAME_BPartner_Value = "BPartner_Value";
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID < 1) throw new IllegalArgumentException ("C_BPartner_ID is mandatory.");
set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
}
/** Get Business Partner .
@return Identifies a Business Partner */
public int getC_BPartner_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2e3a1e18-9187-3f15-88d2-f435abcb6957")
public static String es_PE_FIELD_ImportProduct_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="2e3a1e18-9187-3f15-88d2-f435abcb6957")
public static String es_PE_FIELD_ImportProduct_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="2e3a1e18-9187-3f15-88d2-f435abcb6957")
public static String es_PE_FIELD_ImportProduct_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=400,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2e3a1e18-9187-3f15-88d2-f435abcb6957")
public static final String FIELDNAME_ImportProduct_BusinessPartner="2e3a1e18-9187-3f15-88d2-f435abcb6957";

@XendraTrl(Identifier="f0fd2fc1-8c5f-179c-7c4c-7a7a5f58e691")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f0fd2fc1-8c5f-179c-7c4c-7a7a5f58e691",
Synchronized="2019-08-30 22:22:54.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
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

@XendraTrl(Identifier="207c04c4-4dbf-adcc-2d4c-0e131bcb4a8e")
public static String es_PE_FIELD_ImportProduct_Currency_Name="Moneda";

@XendraTrl(Identifier="207c04c4-4dbf-adcc-2d4c-0e131bcb4a8e")
public static String es_PE_FIELD_ImportProduct_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="207c04c4-4dbf-adcc-2d4c-0e131bcb4a8e")
public static String es_PE_FIELD_ImportProduct_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=460,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="207c04c4-4dbf-adcc-2d4c-0e131bcb4a8e")
public static final String FIELDNAME_ImportProduct_Currency="207c04c4-4dbf-adcc-2d4c-0e131bcb4a8e";

@XendraTrl(Identifier="8736c8c5-c79d-5e2d-4bfe-95df11189bb1")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8736c8c5-c79d-5e2d-4bfe-95df11189bb1",
Synchronized="2019-08-30 22:22:54.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Classification.
@param Classification Classification for grouping */
public void setClassification (boolean Classification)
{
set_Value (COLUMNNAME_Classification, Boolean.valueOf(Classification));
}
/** Get Classification.
@return Classification for grouping */
public boolean isClassification() 
{
Object oo = get_Value(COLUMNNAME_Classification);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="6d7fdacf-da12-e88e-5e05-992bd7c1e15d")
public static String es_PE_FIELD_ImportProduct_Classification_Name="Línea de Producto";

@XendraTrl(Identifier="6d7fdacf-da12-e88e-5e05-992bd7c1e15d")
public static String es_PE_FIELD_ImportProduct_Classification_Description="Clasificación para agrupaciones de productos";

@XendraTrl(Identifier="6d7fdacf-da12-e88e-5e05-992bd7c1e15d")
public static String es_PE_FIELD_ImportProduct_Classification_Help="La clasificación puede ser usada para agrupar productos opcionalmente.";

@XendraField(AD_Column_ID="Classification",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=300,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6d7fdacf-da12-e88e-5e05-992bd7c1e15d")
public static final String FIELDNAME_ImportProduct_Classification="6d7fdacf-da12-e88e-5e05-992bd7c1e15d";

@XendraTrl(Identifier="13bfeb32-2732-ebfe-dcd7-523551606f52")
public static String es_PE_COLUMN_Classification_Name="Línea de Producto";

@XendraColumn(AD_Element_ID="3b3ad929-7cba-bd28-c1eb-6e8bac891ba7",ColumnName="Classification",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="13bfeb32-2732-ebfe-dcd7-523551606f52",
Synchronized="2019-08-30 22:22:54.0")
/** Column name Classification */
public static final String COLUMNNAME_Classification = "Classification";
/** Set Cost per Order.
@param CostPerOrder Fixed Cost Per Order */
public void setCostPerOrder (BigDecimal CostPerOrder)
{
set_Value (COLUMNNAME_CostPerOrder, CostPerOrder);
}
/** Get Cost per Order.
@return Fixed Cost Per Order */
public BigDecimal getCostPerOrder() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CostPerOrder);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="5f1d7215-1e6d-fc1b-2a01-c8971b23136f")
public static String es_PE_FIELD_ImportProduct_CostPerOrder_Name="Costo por Orden";

@XendraTrl(Identifier="5f1d7215-1e6d-fc1b-2a01-c8971b23136f")
public static String es_PE_FIELD_ImportProduct_CostPerOrder_Description="Costo de ordenar";

@XendraTrl(Identifier="5f1d7215-1e6d-fc1b-2a01-c8971b23136f")
public static String es_PE_FIELD_ImportProduct_CostPerOrder_Help="El costo de ordenar indica el cargo fijo evaluado cuando se coloca una orden para este producto";

@XendraField(AD_Column_ID="CostPerOrder",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=450,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5f1d7215-1e6d-fc1b-2a01-c8971b23136f")
public static final String FIELDNAME_ImportProduct_CostPerOrder="5f1d7215-1e6d-fc1b-2a01-c8971b23136f";

@XendraTrl(Identifier="ab8fa078-73e6-d925-c696-5ad38e32801b")
public static String es_PE_COLUMN_CostPerOrder_Name="Costo por Orden";

@XendraColumn(AD_Element_ID="c3b3deb1-8242-c8f0-ff7f-70f69fad92ea",ColumnName="CostPerOrder",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ab8fa078-73e6-d925-c696-5ad38e32801b",
Synchronized="2019-08-30 22:22:54.0")
/** Column name CostPerOrder */
public static final String COLUMNNAME_CostPerOrder = "CostPerOrder";
/** Set Tax Category.
@param C_TaxCategory_ID Tax Category */
public void setC_TaxCategory_ID (int C_TaxCategory_ID)
{
if (C_TaxCategory_ID <= 0) set_Value (COLUMNNAME_C_TaxCategory_ID, null);
 else 
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

@XendraTrl(Identifier="b886fb90-295d-42d1-b289-ff46fe0b9745")
public static String es_PE_COLUMN_C_TaxCategory_ID_Name="Tax Category";

@XendraColumn(AD_Element_ID="d52d1891-09d1-cd05-f9fa-46c801a8d9a6",ColumnName="C_TaxCategory_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b886fb90-295d-42d1-b289-ff46fe0b9745",
Synchronized="2019-08-30 22:22:54.0")
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

@XendraTrl(Identifier="ee175166-929d-f12c-1f4f-020f7d5cbc93")
public static String es_PE_FIELD_ImportProduct_UOM_Name="UM";

@XendraTrl(Identifier="ee175166-929d-f12c-1f4f-020f7d5cbc93")
public static String es_PE_FIELD_ImportProduct_UOM_Description="Unidad de Medida";

@XendraTrl(Identifier="ee175166-929d-f12c-1f4f-020f7d5cbc93")
public static String es_PE_FIELD_ImportProduct_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraField(AD_Column_ID="C_UOM_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ee175166-929d-f12c-1f4f-020f7d5cbc93")
public static final String FIELDNAME_ImportProduct_UOM="ee175166-929d-f12c-1f4f-020f7d5cbc93";

@XendraTrl(Identifier="e9de0b63-a9b2-9d8d-178b-ed1346dabee7")
public static String es_PE_COLUMN_C_UOM_ID_Name="UM";

@XendraColumn(AD_Element_ID="d0345019-4fcc-44c8-4fd1-e38e3b4adeed",ColumnName="C_UOM_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e9de0b63-a9b2-9d8d-178b-ed1346dabee7",
Synchronized="2019-08-30 22:22:54.0")
/** Column name C_UOM_ID */
public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
/** Set Promised Delivery Time.
@param DeliveryTime_Promised Promised days between order and delivery */
public void setDeliveryTime_Promised (int DeliveryTime_Promised)
{
set_Value (COLUMNNAME_DeliveryTime_Promised, Integer.valueOf(DeliveryTime_Promised));
}
/** Get Promised Delivery Time.
@return Promised days between order and delivery */
public int getDeliveryTime_Promised() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_DeliveryTime_Promised);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="adb8b383-e958-1a4b-2f48-71b41a8d917c")
public static String es_PE_FIELD_ImportProduct_PromisedDeliveryTime_Name="Tiempo de Entrega Prometido";

@XendraTrl(Identifier="adb8b383-e958-1a4b-2f48-71b41a8d917c")
public static String es_PE_FIELD_ImportProduct_PromisedDeliveryTime_Description="Días prometidos entre la orden y la entrega";

@XendraTrl(Identifier="adb8b383-e958-1a4b-2f48-71b41a8d917c")
public static String es_PE_FIELD_ImportProduct_PromisedDeliveryTime_Help="El tiempo de entrega prometido indica el número de días transcurridos entre la fecha de la orden y la fecha en que la entrega fue prometida.";

@XendraField(AD_Column_ID="DeliveryTime_Promised",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=540,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="adb8b383-e958-1a4b-2f48-71b41a8d917c")
public static final String FIELDNAME_ImportProduct_PromisedDeliveryTime="adb8b383-e958-1a4b-2f48-71b41a8d917c";

@XendraTrl(Identifier="94a0045e-c194-5d42-2d29-23a62ec45644")
public static String es_PE_COLUMN_DeliveryTime_Promised_Name="Tiempo de Entrega Prometido";

@XendraColumn(AD_Element_ID="02ec830c-bb55-b286-1a11-54a08825d9d9",
ColumnName="DeliveryTime_Promised",AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="94a0045e-c194-5d42-2d29-23a62ec45644",Synchronized="2019-08-30 22:22:54.0")
/** Column name DeliveryTime_Promised */
public static final String COLUMNNAME_DeliveryTime_Promised = "DeliveryTime_Promised";
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

@XendraTrl(Identifier="f1f77d56-bc33-b086-3aac-0d57d07719ef")
public static String es_PE_FIELD_ImportProduct_Description_Name="Descripción";

@XendraTrl(Identifier="f1f77d56-bc33-b086-3aac-0d57d07719ef")
public static String es_PE_FIELD_ImportProduct_Description_Description="Descripción corta opcional del registro";

@XendraTrl(Identifier="f1f77d56-bc33-b086-3aac-0d57d07719ef")
public static String es_PE_FIELD_ImportProduct_Description_Help="Una descripción esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f1f77d56-bc33-b086-3aac-0d57d07719ef")
public static final String FIELDNAME_ImportProduct_Description="f1f77d56-bc33-b086-3aac-0d57d07719ef";

@XendraTrl(Identifier="107beaba-4362-27d2-53d1-96dd0d8a3c01")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="107beaba-4362-27d2-53d1-96dd0d8a3c01",
Synchronized="2019-08-30 22:22:54.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Description URL.
@param DescriptionURL URL for the DESCRIPTION */
public void setDescriptionURL (String DescriptionURL)
{
if (DescriptionURL != null && DescriptionURL.length() > 120)
{
log.warning("Length > 120 - truncated");
DescriptionURL = DescriptionURL.substring(0,119);
}
set_Value (COLUMNNAME_DescriptionURL, DescriptionURL);
}
/** Get Description URL.
@return URL for the DESCRIPTION */
public String getDescriptionURL() 
{
String value = (String)get_Value(COLUMNNAME_DescriptionURL);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="2c5b145f-689e-b864-ac35-fac717c5757a")
public static String es_PE_FIELD_ImportProduct_DescriptionURL_Name="Descripción URL";

@XendraTrl(Identifier="2c5b145f-689e-b864-ac35-fac717c5757a")
public static String es_PE_FIELD_ImportProduct_DescriptionURL_Description="Descripción de la URL";

@XendraField(AD_Column_ID="DescriptionURL",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2c5b145f-689e-b864-ac35-fac717c5757a")
public static final String FIELDNAME_ImportProduct_DescriptionURL="2c5b145f-689e-b864-ac35-fac717c5757a";

@XendraTrl(Identifier="01abff40-a807-d240-c36d-c3ac17a74344")
public static String es_PE_COLUMN_DescriptionURL_Name="Descripción URL";

@XendraColumn(AD_Element_ID="22f9040f-e220-0cf5-b1a0-c26babbe91f1",ColumnName="DescriptionURL",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="01abff40-a807-d240-c36d-c3ac17a74344",
Synchronized="2019-08-30 22:22:54.0")
/** Column name DescriptionURL */
public static final String COLUMNNAME_DescriptionURL = "DescriptionURL";
/** Set Discontinued.
@param Discontinued This product is no longer available */
public void setDiscontinued (boolean Discontinued)
{
set_Value (COLUMNNAME_Discontinued, Boolean.valueOf(Discontinued));
}
/** Get Discontinued.
@return This product is no longer available */
public boolean isDiscontinued() 
{
Object oo = get_Value(COLUMNNAME_Discontinued);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="21f9498d-90ca-e3f1-bd38-8fd21b272e88")
public static String es_PE_FIELD_ImportProduct_Discontinued_Name="Suspendido";

@XendraTrl(Identifier="21f9498d-90ca-e3f1-bd38-8fd21b272e88")
public static String es_PE_FIELD_ImportProduct_Discontinued_Description="Este registro no está disponible";

@XendraTrl(Identifier="21f9498d-90ca-e3f1-bd38-8fd21b272e88")
public static String es_PE_FIELD_ImportProduct_Discontinued_Help="El cuadro de verificación descontinuado indica un producto que ha sido descontinuado.";

@XendraField(AD_Column_ID="Discontinued",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=520,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="21f9498d-90ca-e3f1-bd38-8fd21b272e88")
public static final String FIELDNAME_ImportProduct_Discontinued="21f9498d-90ca-e3f1-bd38-8fd21b272e88";

@XendraTrl(Identifier="769d0454-ad73-c7bc-5e33-c6ec99e811dc")
public static String es_PE_COLUMN_Discontinued_Name="Suspendido";

@XendraColumn(AD_Element_ID="d1d87912-d08c-5658-dda1-868e7beda7fb",ColumnName="Discontinued",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="769d0454-ad73-c7bc-5e33-c6ec99e811dc",
Synchronized="2019-08-30 22:22:54.0")
/** Column name Discontinued */
public static final String COLUMNNAME_Discontinued = "Discontinued";
/** Set Discontinued by.
@param DiscontinuedBy Discontinued By */
public void setDiscontinuedBy (Timestamp DiscontinuedBy)
{
set_Value (COLUMNNAME_DiscontinuedBy, DiscontinuedBy);
}
/** Get Discontinued by.
@return Discontinued By */
public Timestamp getDiscontinuedBy() 
{
return (Timestamp)get_Value(COLUMNNAME_DiscontinuedBy);
}

@XendraTrl(Identifier="52706d76-25d5-d520-4a64-11d8163ea579")
public static String es_PE_FIELD_ImportProduct_DiscontinuedBy_Name="Suspendido Por";

@XendraTrl(Identifier="52706d76-25d5-d520-4a64-11d8163ea579")
public static String es_PE_FIELD_ImportProduct_DiscontinuedBy_Description="Descontinuado Por";

@XendraTrl(Identifier="52706d76-25d5-d520-4a64-11d8163ea579")
public static String es_PE_FIELD_ImportProduct_DiscontinuedBy_Help="El suspendido por indica el individuo que suspendió este producto.";

@XendraField(AD_Column_ID="DiscontinuedBy",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=530,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="52706d76-25d5-d520-4a64-11d8163ea579")
public static final String FIELDNAME_ImportProduct_DiscontinuedBy="52706d76-25d5-d520-4a64-11d8163ea579";

@XendraTrl(Identifier="d666b30d-65f1-2bdc-5af1-ac6f896c354a")
public static String es_PE_COLUMN_DiscontinuedBy_Name="Suspendido Por";

@XendraColumn(AD_Element_ID="27a2ca99-0516-37b9-6667-e8a6634b9141",ColumnName="DiscontinuedBy",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d666b30d-65f1-2bdc-5af1-ac6f896c354a",
Synchronized="2019-08-30 22:22:54.0")
/** Column name DiscontinuedBy */
public static final String COLUMNNAME_DiscontinuedBy = "DiscontinuedBy";
/** Set Document Note.
@param DocumentNote Additional information for a Document */
public void setDocumentNote (String DocumentNote)
{
set_Value (COLUMNNAME_DocumentNote, DocumentNote);
}
/** Get Document Note.
@return Additional information for a Document */
public String getDocumentNote() 
{
String value = (String)get_Value(COLUMNNAME_DocumentNote);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="1015984b-0192-5727-ed56-b45605a4609d")
public static String es_PE_FIELD_ImportProduct_DocumentNote_Name="Nota de Documento";

@XendraTrl(Identifier="1015984b-0192-5727-ed56-b45605a4609d")
public static String es_PE_FIELD_ImportProduct_DocumentNote_Description="Información adicional para un documento";

@XendraTrl(Identifier="1015984b-0192-5727-ed56-b45605a4609d")
public static String es_PE_FIELD_ImportProduct_DocumentNote_Help="La nota de documento se usa para registrar cualquier información adicional considerando este producto.";

@XendraField(AD_Column_ID="DocumentNote",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=330,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1015984b-0192-5727-ed56-b45605a4609d")
public static final String FIELDNAME_ImportProduct_DocumentNote="1015984b-0192-5727-ed56-b45605a4609d";

@XendraTrl(Identifier="2e251475-d9d2-118e-1d48-8dab04081c1d")
public static String es_PE_COLUMN_DocumentNote_Name="Nota de Documento";

@XendraColumn(AD_Element_ID="facce503-36ce-65e5-ad96-c872503feb2e",ColumnName="DocumentNote",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2e251475-d9d2-118e-1d48-8dab04081c1d",
Synchronized="2019-08-30 22:22:54.0")
/** Column name DocumentNote */
public static final String COLUMNNAME_DocumentNote = "DocumentNote";
/** Set Comment/Help.
@param Help Comment or Hint */
public void setHelp (String Help)
{
set_Value (COLUMNNAME_Help, Help);
}
/** Get Comment/Help.
@return Comment or Hint */
public String getHelp() 
{
String value = (String)get_Value(COLUMNNAME_Help);
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

@XendraTrl(Identifier="8016b242-b706-25ab-6b01-a33820ed8b89")
public static String es_PE_FIELD_ImportProduct_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="8016b242-b706-25ab-6b01-a33820ed8b89")
public static String es_PE_FIELD_ImportProduct_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="8016b242-b706-25ab-6b01-a33820ed8b89")
public static String es_PE_FIELD_ImportProduct_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8016b242-b706-25ab-6b01-a33820ed8b89")
public static final String FIELDNAME_ImportProduct_CommentHelp="8016b242-b706-25ab-6b01-a33820ed8b89";

@XendraTrl(Identifier="f609343c-3000-d0c0-3392-0aca17d9ba2e")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f609343c-3000-d0c0-3392-0aca17d9ba2e",
Synchronized="2019-08-30 22:22:54.0")
/** Column name Help */
public static final String COLUMNNAME_Help = "Help";
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
@XendraTrl(Identifier="3964fce4-f269-409c-9cd2-00c03a45d8fb")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3964fce4-f269-409c-9cd2-00c03a45d8fb",
Synchronized="2019-08-30 22:22:54.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Import Error Message.
@param I_ErrorMsg Messages generated from import process */
public void setI_ErrorMsg (String I_ErrorMsg)
{
set_Value (COLUMNNAME_I_ErrorMsg, I_ErrorMsg);
}
/** Get Import Error Message.
@return Messages generated from import process */
public String getI_ErrorMsg() 
{
String value = (String)get_Value(COLUMNNAME_I_ErrorMsg);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="93f56e93-7ad8-1960-1c74-8c34a340ebe2")
public static String es_PE_FIELD_ImportProduct_ImportErrorMessage_Name="Mensajes de Error al Importar";

@XendraTrl(Identifier="93f56e93-7ad8-1960-1c74-8c34a340ebe2")
public static String es_PE_FIELD_ImportProduct_ImportErrorMessage_Description="Mensajes generados desde procesos de importación";

@XendraTrl(Identifier="93f56e93-7ad8-1960-1c74-8c34a340ebe2")
public static String es_PE_FIELD_ImportProduct_ImportErrorMessage_Help="El mensaje de error de Importación despliega cualquier mensaje de error generado durante el proceso de importación.";

@XendraField(AD_Column_ID="I_ErrorMsg",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="93f56e93-7ad8-1960-1c74-8c34a340ebe2")
public static final String FIELDNAME_ImportProduct_ImportErrorMessage="93f56e93-7ad8-1960-1c74-8c34a340ebe2";

@XendraTrl(Identifier="4fc9da72-712f-e4b9-9c06-31420f6b7d39")
public static String es_PE_COLUMN_I_ErrorMsg_Name="Mensajes de Error al Importar";

@XendraColumn(AD_Element_ID="e512e524-25c8-eddd-ad88-d2ce6b66fdc7",ColumnName="I_ErrorMsg",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4fc9da72-712f-e4b9-9c06-31420f6b7d39",
Synchronized="2019-08-30 22:22:54.0")
/** Column name I_ErrorMsg */
public static final String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";
/** Set Imported.
@param I_IsImported Has this import been processed */
public void setI_IsImported (boolean I_IsImported)
{
set_Value (COLUMNNAME_I_IsImported, Boolean.valueOf(I_IsImported));
}
/** Get Imported.
@return Has this import been processed */
public boolean isI_IsImported() 
{
Object oo = get_Value(COLUMNNAME_I_IsImported);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="3f5b5899-4787-baee-3666-1b8846bdd7b1")
public static String es_PE_FIELD_ImportProduct_Imported_Name="Importar";

@XendraTrl(Identifier="3f5b5899-4787-baee-3666-1b8846bdd7b1")
public static String es_PE_FIELD_ImportProduct_Imported_Description="Esta importación ha sido procesada";

@XendraTrl(Identifier="3f5b5899-4787-baee-3666-1b8846bdd7b1")
public static String es_PE_FIELD_ImportProduct_Imported_Help="El cuadro de verificación Importado indica si esta importación ha sido procesada";

@XendraField(AD_Column_ID="I_IsImported",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=20,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3f5b5899-4787-baee-3666-1b8846bdd7b1")
public static final String FIELDNAME_ImportProduct_Imported="3f5b5899-4787-baee-3666-1b8846bdd7b1";

@XendraTrl(Identifier="e98fd425-ce0c-c825-e598-d41f5bc5e3a1")
public static String es_PE_COLUMN_I_IsImported_Name="Importar";

@XendraColumn(AD_Element_ID="f4939725-7d85-767d-540d-feafa759184b",ColumnName="I_IsImported",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e98fd425-ce0c-c825-e598-d41f5bc5e3a1",
Synchronized="2019-08-30 22:22:54.0")
/** Column name I_IsImported */
public static final String COLUMNNAME_I_IsImported = "I_IsImported";
/** Set Image URL.
@param ImageURL URL of  image */
public void setImageURL (String ImageURL)
{
if (ImageURL != null && ImageURL.length() > 120)
{
log.warning("Length > 120 - truncated");
ImageURL = ImageURL.substring(0,119);
}
set_Value (COLUMNNAME_ImageURL, ImageURL);
}
/** Get Image URL.
@return URL of  image */
public String getImageURL() 
{
String value = (String)get_Value(COLUMNNAME_ImageURL);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ddd73538-8714-7a02-593e-51a97e933129")
public static String es_PE_FIELD_ImportProduct_ImageURL_Name="URL de la Imagen";

@XendraTrl(Identifier="ddd73538-8714-7a02-593e-51a97e933129")
public static String es_PE_FIELD_ImportProduct_ImageURL_Description="URL de la estructura de la imagen";

@XendraTrl(Identifier="ddd73538-8714-7a02-593e-51a97e933129")
public static String es_PE_FIELD_ImportProduct_ImageURL_Help="URL de imagen de la textura; La imagen no se almacena en la base de datos; ";

@XendraField(AD_Column_ID="ImageURL",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ddd73538-8714-7a02-593e-51a97e933129")
public static final String FIELDNAME_ImportProduct_ImageURL="ddd73538-8714-7a02-593e-51a97e933129";

@XendraTrl(Identifier="e3c1a074-60fa-c1de-c685-24f238df2f51")
public static String es_PE_COLUMN_ImageURL_Name="URL de la Imagen";

@XendraColumn(AD_Element_ID="fe037607-f5d9-d969-d6e5-eb1f94c10e5e",ColumnName="ImageURL",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e3c1a074-60fa-c1de-c685-24f238df2f51",
Synchronized="2019-08-30 22:22:54.0")
/** Column name ImageURL */
public static final String COLUMNNAME_ImageURL = "ImageURL";
/** Set Import Product.
@param I_Product_ID Import Item or Service */
public void setI_Product_ID (int I_Product_ID)
{
if (I_Product_ID < 1) throw new IllegalArgumentException ("I_Product_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_I_Product_ID, Integer.valueOf(I_Product_ID));
}
/** Get Import Product.
@return Import Item or Service */
public int getI_Product_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_I_Product_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ddf92b4a-4b89-d0a0-6124-a294be8f3777")
public static String es_PE_FIELD_ImportProduct_ImportProduct_Name="Importar Productos";

@XendraTrl(Identifier="ddf92b4a-4b89-d0a0-6124-a294be8f3777")
public static String es_PE_FIELD_ImportProduct_ImportProduct_Description="Importar productos ó servicios";

@XendraField(AD_Column_ID="I_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="Y=N",DisplayLength=10,IsReadOnly=true,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ddf92b4a-4b89-d0a0-6124-a294be8f3777")
public static final String FIELDNAME_ImportProduct_ImportProduct="ddf92b4a-4b89-d0a0-6124-a294be8f3777";
/** Column name I_Product_ID */
public static final String COLUMNNAME_I_Product_ID = "I_Product_ID";
/** Set Bill of Materials.
@param IsBOM Bill of Materials */
public void setIsBOM (boolean IsBOM)
{
set_Value (COLUMNNAME_IsBOM, Boolean.valueOf(IsBOM));
}
/** Get Bill of Materials.
@return Bill of Materials */
public boolean isBOM() 
{
Object oo = get_Value(COLUMNNAME_IsBOM);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="19d555cc-c1c9-4824-82d0-8bd7ae037b80")
public static String es_PE_COLUMN_IsBOM_Name="Bill of Materials";

@XendraColumn(AD_Element_ID="a76e9af0-88a0-9806-806f-9636bab53078",ColumnName="IsBOM",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="19d555cc-c1c9-4824-82d0-8bd7ae037b80",
Synchronized="2019-08-30 22:22:54.0")
/** Column name IsBOM */
public static final String COLUMNNAME_IsBOM = "IsBOM";
/** Set ISO Currency Code.
@param ISO_Code Three letter ISO 4217 Code of the Currency */
public void setISO_Code (String ISO_Code)
{
if (ISO_Code != null && ISO_Code.length() > 3)
{
log.warning("Length > 3 - truncated");
ISO_Code = ISO_Code.substring(0,2);
}
set_Value (COLUMNNAME_ISO_Code, ISO_Code);
}
/** Get ISO Currency Code.
@return Three letter ISO 4217 Code of the Currency */
public String getISO_Code() 
{
return (String)get_Value(COLUMNNAME_ISO_Code);
}

@XendraTrl(Identifier="9fd1828a-56ef-2383-ce3c-286903c1d870")
public static String es_PE_FIELD_ImportProduct_ISOCurrencyCode_Name="Código ISO";

@XendraTrl(Identifier="9fd1828a-56ef-2383-ce3c-286903c1d870")
public static String es_PE_FIELD_ImportProduct_ISOCurrencyCode_Description="Código ISO 4217 de la moneda";

@XendraTrl(Identifier="9fd1828a-56ef-2383-ce3c-286903c1d870")
public static String es_PE_FIELD_ImportProduct_ISOCurrencyCode_Help="Para detalles ver - http://www.unece.org/trade/rec/rec09en.htm";

@XendraField(AD_Column_ID="ISO_Code",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9fd1828a-56ef-2383-ce3c-286903c1d870")
public static final String FIELDNAME_ImportProduct_ISOCurrencyCode="9fd1828a-56ef-2383-ce3c-286903c1d870";

@XendraTrl(Identifier="c6ee9b86-0411-bdd7-7168-ac9cb9119a77")
public static String es_PE_COLUMN_ISO_Code_Name="Código ISO";

@XendraColumn(AD_Element_ID="0770c1a3-36f8-0fc9-bd56-a563b64128ee",ColumnName="ISO_Code",
AD_Reference_ID=17,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=3,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c6ee9b86-0411-bdd7-7168-ac9cb9119a77",
Synchronized="2019-08-30 22:22:54.0")
/** Column name ISO_Code */
public static final String COLUMNNAME_ISO_Code = "ISO_Code";
/** Set Manufacturer.
@param Manufacturer Manufacturer of the Product */
public void setManufacturer (String Manufacturer)
{
if (Manufacturer != null && Manufacturer.length() > 30)
{
log.warning("Length > 30 - truncated");
Manufacturer = Manufacturer.substring(0,29);
}
set_Value (COLUMNNAME_Manufacturer, Manufacturer);
}
/** Get Manufacturer.
@return Manufacturer of the Product */
public String getManufacturer() 
{
String value = (String)get_Value(COLUMNNAME_Manufacturer);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="f1e0ecb2-4194-1659-dee0-93e64f981a09")
public static String es_PE_FIELD_ImportProduct_Manufacturer_Name="Manufactura";

@XendraField(AD_Column_ID="Manufacturer",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=320,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f1e0ecb2-4194-1659-dee0-93e64f981a09")
public static final String FIELDNAME_ImportProduct_Manufacturer="f1e0ecb2-4194-1659-dee0-93e64f981a09";

@XendraTrl(Identifier="33dc0114-de3c-c867-3907-10775ed2e308")
public static String es_PE_COLUMN_Manufacturer_Name="Manufactura";

@XendraColumn(AD_Element_ID="0978599c-589f-e3c5-586b-8346ff97ccbd",ColumnName="Manufacturer",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="33dc0114-de3c-c867-3907-10775ed2e308",
Synchronized="2019-08-30 22:22:54.0")
/** Column name Manufacturer */
public static final String COLUMNNAME_Manufacturer = "Manufacturer";
/** Set Product Brand.
@param M_Product_Brand_ID Brand of a Product */
public void setM_Product_Brand_ID (int M_Product_Brand_ID)
{
if (M_Product_Brand_ID <= 0) set_Value (COLUMNNAME_M_Product_Brand_ID, null);
 else 
set_Value (COLUMNNAME_M_Product_Brand_ID, Integer.valueOf(M_Product_Brand_ID));
}
/** Get Product Brand.
@return Brand of a Product */
public int getM_Product_Brand_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_Brand_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7c5f16bc-c8c8-d1c3-f12c-40c8f7155996")
public static String es_PE_FIELD_ImportProduct_ProductBrand_Name="Marca";

@XendraTrl(Identifier="7c5f16bc-c8c8-d1c3-f12c-40c8f7155996")
public static String es_PE_FIELD_ImportProduct_ProductBrand_Description="";

@XendraTrl(Identifier="7c5f16bc-c8c8-d1c3-f12c-40c8f7155996")
public static String es_PE_FIELD_ImportProduct_ProductBrand_Help="";

@XendraField(AD_Column_ID="M_Product_Brand_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=270,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7c5f16bc-c8c8-d1c3-f12c-40c8f7155996")
public static final String FIELDNAME_ImportProduct_ProductBrand="7c5f16bc-c8c8-d1c3-f12c-40c8f7155996";

@XendraTrl(Identifier="e1139e5d-211d-39f0-44bb-653c840c50df")
public static String es_PE_COLUMN_M_Product_Brand_ID_Name="Marca";

@XendraColumn(AD_Element_ID="028aa2e6-3ac7-548f-6575-e61a07ea3e9e",ColumnName="M_Product_Brand_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e1139e5d-211d-39f0-44bb-653c840c50df",
Synchronized="2019-08-30 22:22:54.0")
/** Column name M_Product_Brand_ID */
public static final String COLUMNNAME_M_Product_Brand_ID = "M_Product_Brand_ID";
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

@XendraTrl(Identifier="d96060aa-8e1d-f44a-aa88-dba9d549132b")
public static String es_PE_FIELD_ImportProduct_ProductCategory_Name="Categoría";

@XendraTrl(Identifier="d96060aa-8e1d-f44a-aa88-dba9d549132b")
public static String es_PE_FIELD_ImportProduct_ProductCategory_Description="";

@XendraTrl(Identifier="d96060aa-8e1d-f44a-aa88-dba9d549132b")
public static String es_PE_FIELD_ImportProduct_ProductCategory_Help="";

@XendraField(AD_Column_ID="M_Product_Category_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d96060aa-8e1d-f44a-aa88-dba9d549132b")
public static final String FIELDNAME_ImportProduct_ProductCategory="d96060aa-8e1d-f44a-aa88-dba9d549132b";

@XendraTrl(Identifier="0fedc359-dc4f-04e7-8331-56805238df1e")
public static String es_PE_COLUMN_M_Product_Category_ID_Name="Categoría del Producto";

@XendraColumn(AD_Element_ID="80d3e0bb-473b-67d4-42d5-1d776006a69c",
ColumnName="M_Product_Category_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0fedc359-dc4f-04e7-8331-56805238df1e",Synchronized="2019-08-30 22:22:54.0")
/** Column name M_Product_Category_ID */
public static final String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";
/** Set Product Generic.
@param M_Product_Generic_ID Product Generic */
public void setM_Product_Generic_ID (int M_Product_Generic_ID)
{
if (M_Product_Generic_ID <= 0) set_Value (COLUMNNAME_M_Product_Generic_ID, null);
 else 
set_Value (COLUMNNAME_M_Product_Generic_ID, Integer.valueOf(M_Product_Generic_ID));
}
/** Get Product Generic.
@return Product Generic */
public int getM_Product_Generic_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_Generic_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2db2fa26-d2d6-c252-c775-0c4f58ff84bc")
public static String es_PE_FIELD_ImportProduct_ProductGeneric_Name="Genérico";

@XendraField(AD_Column_ID="M_Product_Generic_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2db2fa26-d2d6-c252-c775-0c4f58ff84bc")
public static final String FIELDNAME_ImportProduct_ProductGeneric="2db2fa26-d2d6-c252-c775-0c4f58ff84bc";

@XendraTrl(Identifier="d6c210d7-b4a5-73bf-7957-4535f3fa80f7")
public static String es_PE_COLUMN_M_Product_Generic_ID_Name="Genérico";

@XendraColumn(AD_Element_ID="29ff5a3c-04a3-1e11-967b-06b36ab2ba4a",
ColumnName="M_Product_Generic_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d6c210d7-b4a5-73bf-7957-4535f3fa80f7",Synchronized="2019-08-30 22:22:54.0")
/** Column name M_Product_Generic_ID */
public static final String COLUMNNAME_M_Product_Generic_ID = "M_Product_Generic_ID";
/** Set Product Group.
@param M_Product_Group_ID Product Group */
public void setM_Product_Group_ID (int M_Product_Group_ID)
{
if (M_Product_Group_ID <= 0) set_Value (COLUMNNAME_M_Product_Group_ID, null);
 else 
set_Value (COLUMNNAME_M_Product_Group_ID, Integer.valueOf(M_Product_Group_ID));
}
/** Get Product Group.
@return Product Group */
public int getM_Product_Group_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_Group_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5e9661d3-530f-4316-4e2b-f976789da45d")
public static String es_PE_FIELD_ImportProduct_ProductGroup_Name="Grupo";

@XendraField(AD_Column_ID="M_Product_Group_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5e9661d3-530f-4316-4e2b-f976789da45d")
public static final String FIELDNAME_ImportProduct_ProductGroup="5e9661d3-530f-4316-4e2b-f976789da45d";

@XendraTrl(Identifier="4f0b1d55-3ed7-12cc-2e9b-7da4ef9d7a5d")
public static String es_PE_COLUMN_M_Product_Group_ID_Name="Grupo";

@XendraColumn(AD_Element_ID="969f31c5-ca66-a83f-7eca-f4700c100b5c",ColumnName="M_Product_Group_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4f0b1d55-3ed7-12cc-2e9b-7da4ef9d7a5d",
Synchronized="2019-08-30 22:22:54.0")
/** Column name M_Product_Group_ID */
public static final String COLUMNNAME_M_Product_Group_ID = "M_Product_Group_ID";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID <= 0) set_Value (COLUMNNAME_M_Product_ID, null);
 else 
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

@XendraTrl(Identifier="086c6d4b-8e83-dac8-9f5b-da1f0e3c0087")
public static String es_PE_FIELD_ImportProduct_Product_Name="Producto";

@XendraTrl(Identifier="086c6d4b-8e83-dac8-9f5b-da1f0e3c0087")
public static String es_PE_FIELD_ImportProduct_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="086c6d4b-8e83-dac8-9f5b-da1f0e3c0087")
public static String es_PE_FIELD_ImportProduct_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="086c6d4b-8e83-dac8-9f5b-da1f0e3c0087")
public static final String FIELDNAME_ImportProduct_Product="086c6d4b-8e83-dac8-9f5b-da1f0e3c0087";

@XendraTrl(Identifier="dae3015a-e150-9b9f-c440-da17c82c2056")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dae3015a-e150-9b9f-c440-da17c82c2056",
Synchronized="2019-08-30 22:22:54.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Product Type.
@param M_Product_Type_ID Type of a Product */
public void setM_Product_Type_ID (int M_Product_Type_ID)
{
if (M_Product_Type_ID <= 0) set_Value (COLUMNNAME_M_Product_Type_ID, null);
 else 
set_Value (COLUMNNAME_M_Product_Type_ID, Integer.valueOf(M_Product_Type_ID));
}
/** Get Product Type.
@return Type of a Product */
public int getM_Product_Type_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_Type_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ac3d71d6-25da-4e62-36c2-dc6f4ba2aad3")
public static String es_PE_FIELD_ImportProduct_ProductType_Name="Tipo";

@XendraField(AD_Column_ID="M_Product_Type_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=290,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ac3d71d6-25da-4e62-36c2-dc6f4ba2aad3")
public static final String FIELDNAME_ImportProduct_ProductType="ac3d71d6-25da-4e62-36c2-dc6f4ba2aad3";

@XendraTrl(Identifier="e2a49f03-aafe-c5bc-6acd-5296305c4d11")
public static String es_PE_COLUMN_M_Product_Type_ID_Name="Tipo";

@XendraColumn(AD_Element_ID="6247a6d2-fefe-f01a-c954-3ddd9f9b9f1b",ColumnName="M_Product_Type_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e2a49f03-aafe-c5bc-6acd-5296305c4d11",
Synchronized="2019-08-30 22:22:54.0")
/** Column name M_Product_Type_ID */
public static final String COLUMNNAME_M_Product_Type_ID = "M_Product_Type_ID";
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
@XendraTrl(Identifier="c02212ef-ae5f-5d9b-b759-1cd8d844f0d3")
public static String es_PE_FIELD_ImportProduct_Name_Name="Nombre";

@XendraTrl(Identifier="c02212ef-ae5f-5d9b-b759-1cd8d844f0d3")
public static String es_PE_FIELD_ImportProduct_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="c02212ef-ae5f-5d9b-b759-1cd8d844f0d3")
public static String es_PE_FIELD_ImportProduct_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c02212ef-ae5f-5d9b-b759-1cd8d844f0d3")
public static final String FIELDNAME_ImportProduct_Name="c02212ef-ae5f-5d9b-b759-1cd8d844f0d3";

@XendraTrl(Identifier="2131c5aa-5673-81a6-9a51-0b55b87ce38a")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2131c5aa-5673-81a6-9a51-0b55b87ce38a",
Synchronized="2019-08-30 22:22:54.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Minimum Order Qty.
@param Order_Min Minimum order quantity in UOM */
public void setOrder_Min (BigDecimal Order_Min)
{
set_Value (COLUMNNAME_Order_Min, Order_Min);
}
/** Get Minimum Order Qty.
@return Minimum order quantity in UOM */
public BigDecimal getOrder_Min() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Order_Min);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="2e708fae-adb3-509c-4de0-b79a7c34cd23")
public static String es_PE_FIELD_ImportProduct_MinimumOrderQty_Name="Mínimo a Ordenar";

@XendraTrl(Identifier="2e708fae-adb3-509c-4de0-b79a7c34cd23")
public static String es_PE_FIELD_ImportProduct_MinimumOrderQty_Description="Cantidad a ordenar mínima en la UM";

@XendraTrl(Identifier="2e708fae-adb3-509c-4de0-b79a7c34cd23")
public static String es_PE_FIELD_ImportProduct_MinimumOrderQty_Help="La cantidad mínima a ordenar indica la cantidad mas pequeña de este producto que puede ser ordenada.";

@XendraField(AD_Column_ID="Order_Min",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=430,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2e708fae-adb3-509c-4de0-b79a7c34cd23")
public static final String FIELDNAME_ImportProduct_MinimumOrderQty="2e708fae-adb3-509c-4de0-b79a7c34cd23";

@XendraTrl(Identifier="da11f4ee-412b-c08a-4b79-2a75aaba85e9")
public static String es_PE_COLUMN_Order_Min_Name="Mínimo a Ordenar";

@XendraColumn(AD_Element_ID="1d8d0ab1-eadf-b653-858e-9d9d56f1ef39",ColumnName="Order_Min",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="da11f4ee-412b-c08a-4b79-2a75aaba85e9",
Synchronized="2019-08-30 22:22:54.0")
/** Column name Order_Min */
public static final String COLUMNNAME_Order_Min = "Order_Min";
/** Set Order Pack Qty.
@param Order_Pack Package order size in UOM (e.g. order set of 5 units) */
public void setOrder_Pack (BigDecimal Order_Pack)
{
set_Value (COLUMNNAME_Order_Pack, Order_Pack);
}
/** Get Order Pack Qty.
@return Package order size in UOM (e.g. order set of 5 units) */
public BigDecimal getOrder_Pack() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Order_Pack);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="efe786c6-537e-c334-cfa7-315bfb9f8048")
public static String es_PE_FIELD_ImportProduct_OrderPackQty_Name="Múltiplo a Ordenar";

@XendraTrl(Identifier="efe786c6-537e-c334-cfa7-315bfb9f8048")
public static String es_PE_FIELD_ImportProduct_OrderPackQty_Description="Tamaño del paquete a ordenar en UM (Ej. Conjunto a ordenar de 5 unidades)";

@XendraTrl(Identifier="efe786c6-537e-c334-cfa7-315bfb9f8048")
public static String es_PE_FIELD_ImportProduct_OrderPackQty_Help="La cantidad del paquete a ordenar indica el número de unidades en cada paquete de este producto.";

@XendraField(AD_Column_ID="Order_Pack",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=440,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="efe786c6-537e-c334-cfa7-315bfb9f8048")
public static final String FIELDNAME_ImportProduct_OrderPackQty="efe786c6-537e-c334-cfa7-315bfb9f8048";

@XendraTrl(Identifier="79495b31-b16b-05cc-1f70-fe869788f852")
public static String es_PE_COLUMN_Order_Pack_Name="Múltiplo a Ordenar";

@XendraColumn(AD_Element_ID="96c8897c-422d-34b0-315a-2fb2c4e49ff7",ColumnName="Order_Pack",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="79495b31-b16b-05cc-1f70-fe869788f852",
Synchronized="2019-08-30 22:22:54.0")
/** Column name Order_Pack */
public static final String COLUMNNAME_Order_Pack = "Order_Pack";
/** Set Price effective.
@param PriceEffective Effective Date of Price */
public void setPriceEffective (Timestamp PriceEffective)
{
set_Value (COLUMNNAME_PriceEffective, PriceEffective);
}
/** Get Price effective.
@return Effective Date of Price */
public Timestamp getPriceEffective() 
{
return (Timestamp)get_Value(COLUMNNAME_PriceEffective);
}

@XendraTrl(Identifier="fe272df2-a2f5-d012-a06a-ef81ec0a3444")
public static String es_PE_FIELD_ImportProduct_PriceEffective_Name="Fecha de Efectividad del Precio";

@XendraTrl(Identifier="fe272df2-a2f5-d012-a06a-ef81ec0a3444")
public static String es_PE_FIELD_ImportProduct_PriceEffective_Description="Fecha efectiva del Precio";

@XendraTrl(Identifier="fe272df2-a2f5-d012-a06a-ef81ec0a3444")
public static String es_PE_FIELD_ImportProduct_PriceEffective_Help="La efectividad del precio indica la fecha en que el precio es efectivo. Esto le permite introducir precios futuros a productos que llegarán a ser efectivos cuando sea apropiado.";

@XendraField(AD_Column_ID="PriceEffective",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=470,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fe272df2-a2f5-d012-a06a-ef81ec0a3444")
public static final String FIELDNAME_ImportProduct_PriceEffective="fe272df2-a2f5-d012-a06a-ef81ec0a3444";

@XendraTrl(Identifier="5ee8c7ec-6d5f-eda8-daed-c0e4c60bf70e")
public static String es_PE_COLUMN_PriceEffective_Name="Fecha de Efectividad del Precio";

@XendraColumn(AD_Element_ID="673c6705-3bc2-09fb-7ef7-2dcb71a80536",ColumnName="PriceEffective",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5ee8c7ec-6d5f-eda8-daed-c0e4c60bf70e",
Synchronized="2019-08-30 22:22:55.0")
/** Column name PriceEffective */
public static final String COLUMNNAME_PriceEffective = "PriceEffective";
/** Set Limit Price.
@param PriceLimit Lowest price for a product */
public void setPriceLimit (BigDecimal PriceLimit)
{
set_Value (COLUMNNAME_PriceLimit, PriceLimit);
}
/** Get Limit Price.
@return Lowest price for a product */
public BigDecimal getPriceLimit() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceLimit);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="60b0bb39-8d5d-25c4-25f8-0548b30c4495")
public static String es_PE_FIELD_ImportProduct_LimitPrice_Name="Precio Límite";

@XendraTrl(Identifier="60b0bb39-8d5d-25c4-25f8-0548b30c4495")
public static String es_PE_FIELD_ImportProduct_LimitPrice_Description="Precio más bajo del producto";

@XendraTrl(Identifier="60b0bb39-8d5d-25c4-25f8-0548b30c4495")
public static String es_PE_FIELD_ImportProduct_LimitPrice_Help="El límite de precio indica el precio más bajo para un producto establecido en la moneda de la lista de precio.";

@XendraField(AD_Column_ID="PriceLimit",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=510,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="60b0bb39-8d5d-25c4-25f8-0548b30c4495")
public static final String FIELDNAME_ImportProduct_LimitPrice="60b0bb39-8d5d-25c4-25f8-0548b30c4495";

@XendraTrl(Identifier="f0240fa9-8690-a2a2-d597-a77eac087801")
public static String es_PE_COLUMN_PriceLimit_Name="Precio Límite";

@XendraColumn(AD_Element_ID="0dbee629-4878-ced9-eafa-0f6bdfb99af4",ColumnName="PriceLimit",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f0240fa9-8690-a2a2-d597-a77eac087801",
Synchronized="2019-08-30 22:22:55.0")
/** Column name PriceLimit */
public static final String COLUMNNAME_PriceLimit = "PriceLimit";
/** Set List Price.
@param PriceList List Price */
public void setPriceList (BigDecimal PriceList)
{
set_Value (COLUMNNAME_PriceList, PriceList);
}
/** Get List Price.
@return List Price */
public BigDecimal getPriceList() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceList);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="99821510-8133-ab7f-7dc2-2d5b0b985901")
public static String es_PE_FIELD_ImportProduct_ListPrice_Name="Precio de Lista";

@XendraTrl(Identifier="99821510-8133-ab7f-7dc2-2d5b0b985901")
public static String es_PE_FIELD_ImportProduct_ListPrice_Description="Precio de Lista";

@XendraTrl(Identifier="99821510-8133-ab7f-7dc2-2d5b0b985901")
public static String es_PE_FIELD_ImportProduct_ListPrice_Help="El Precio de lista es el precio de lista oficial en la moneda del documento";

@XendraField(AD_Column_ID="PriceList",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=490,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="99821510-8133-ab7f-7dc2-2d5b0b985901")
public static final String FIELDNAME_ImportProduct_ListPrice="99821510-8133-ab7f-7dc2-2d5b0b985901";

@XendraTrl(Identifier="d17d6327-6ee3-4634-469f-c8b9162834ec")
public static String es_PE_COLUMN_PriceList_Name="Precio de Lista";

@XendraColumn(AD_Element_ID="0f6529f2-0ceb-0583-6c50-c04e6542c99b",ColumnName="PriceList",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d17d6327-6ee3-4634-469f-c8b9162834ec",
Synchronized="2019-08-30 22:22:55.0")
/** Column name PriceList */
public static final String COLUMNNAME_PriceList = "PriceList";
/** Set PO Price.
@param PricePO Price based on a purchase order */
public void setPricePO (BigDecimal PricePO)
{
set_Value (COLUMNNAME_PricePO, PricePO);
}
/** Get PO Price.
@return Price based on a purchase order */
public BigDecimal getPricePO() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PricePO);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="97ba8c58-2af2-039c-baa1-8e9949ec915b")
public static String es_PE_FIELD_ImportProduct_POPrice_Name="Precio OC";

@XendraTrl(Identifier="97ba8c58-2af2-039c-baa1-8e9949ec915b")
public static String es_PE_FIELD_ImportProduct_POPrice_Description="Precio basado en una orden de compra";

@XendraTrl(Identifier="97ba8c58-2af2-039c-baa1-8e9949ec915b")
public static String es_PE_FIELD_ImportProduct_POPrice_Help="El Precio de la OC indica el precio unitario de un producto para la orden de compra";

@XendraField(AD_Column_ID="PricePO",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=480,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="97ba8c58-2af2-039c-baa1-8e9949ec915b")
public static final String FIELDNAME_ImportProduct_POPrice="97ba8c58-2af2-039c-baa1-8e9949ec915b";

@XendraTrl(Identifier="19bb017a-0582-f16a-06d3-fca3b52bb45b")
public static String es_PE_COLUMN_PricePO_Name="Precio OC";

@XendraColumn(AD_Element_ID="1dc1da18-70d5-3909-dc1c-cf7fe1faefaf",ColumnName="PricePO",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="19bb017a-0582-f16a-06d3-fca3b52bb45b",
Synchronized="2019-08-30 22:22:55.0")
/** Column name PricePO */
public static final String COLUMNNAME_PricePO = "PricePO";
/** Set Standard Price.
@param PriceStd Standard Price */
public void setPriceStd (BigDecimal PriceStd)
{
set_Value (COLUMNNAME_PriceStd, PriceStd);
}
/** Get Standard Price.
@return Standard Price */
public BigDecimal getPriceStd() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceStd);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="7f35ffa8-7cf2-b74d-eb08-f0053f11dbb2")
public static String es_PE_FIELD_ImportProduct_StandardPrice_Name="Precio Estándar";

@XendraTrl(Identifier="7f35ffa8-7cf2-b74d-eb08-f0053f11dbb2")
public static String es_PE_FIELD_ImportProduct_StandardPrice_Description="Precio Estándar";

@XendraTrl(Identifier="7f35ffa8-7cf2-b74d-eb08-f0053f11dbb2")
public static String es_PE_FIELD_ImportProduct_StandardPrice_Help="El Precio Estándar indica el precio estándar ó normal para un producto en esta lista de precios";

@XendraField(AD_Column_ID="PriceStd",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=500,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7f35ffa8-7cf2-b74d-eb08-f0053f11dbb2")
public static final String FIELDNAME_ImportProduct_StandardPrice="7f35ffa8-7cf2-b74d-eb08-f0053f11dbb2";

@XendraTrl(Identifier="a99a010d-a46a-7780-51f8-cdf52ce18dbc")
public static String es_PE_COLUMN_PriceStd_Name="Precio Estándar";

@XendraColumn(AD_Element_ID="cd12259b-a52a-9102-1c72-983d6e1d5324",ColumnName="PriceStd",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a99a010d-a46a-7780-51f8-cdf52ce18dbc",
Synchronized="2019-08-30 22:22:55.0")
/** Column name PriceStd */
public static final String COLUMNNAME_PriceStd = "PriceStd";
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

@XendraTrl(Identifier="41858e0b-156d-3cf2-9c3c-395ec0f771cc")
public static String es_PE_FIELD_ImportProduct_Processed_Name="Procesado";

@XendraTrl(Identifier="41858e0b-156d-3cf2-9c3c-395ec0f771cc")
public static String es_PE_FIELD_ImportProduct_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="41858e0b-156d-3cf2-9c3c-395ec0f771cc")
public static String es_PE_FIELD_ImportProduct_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=550,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="41858e0b-156d-3cf2-9c3c-395ec0f771cc")
public static final String FIELDNAME_ImportProduct_Processed="41858e0b-156d-3cf2-9c3c-395ec0f771cc";

@XendraTrl(Identifier="0b637078-1774-bcfc-f1d7-3e6adb271e7b")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0b637078-1774-bcfc-f1d7-3e6adb271e7b",
Synchronized="2019-08-30 22:22:55.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
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

@XendraTrl(Identifier="3d7310ce-a12a-234e-0fd5-4b78df07df7d")
public static String es_PE_FIELD_ImportProduct_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=560,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3d7310ce-a12a-234e-0fd5-4b78df07df7d")
public static final String FIELDNAME_ImportProduct_ProcessNow="3d7310ce-a12a-234e-0fd5-4b78df07df7d";

@XendraTrl(Identifier="98da07bb-37ea-badb-433e-53d88a5b13ce")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="3dc27912-c644-9cd0-a08e-3242544d8802",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="98da07bb-37ea-badb-433e-53d88a5b13ce",Synchronized="2019-08-30 22:22:55.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set ProductBrand_Value.
@param ProductBrand_Value ProductBrand_Value */
public void setProductBrand_Value (String ProductBrand_Value)
{
if (ProductBrand_Value != null && ProductBrand_Value.length() > 40)
{
log.warning("Length > 40 - truncated");
ProductBrand_Value = ProductBrand_Value.substring(0,39);
}
set_Value (COLUMNNAME_ProductBrand_Value, ProductBrand_Value);
}
/** Get ProductBrand_Value.
@return ProductBrand_Value */
public String getProductBrand_Value() 
{
String value = (String)get_Value(COLUMNNAME_ProductBrand_Value);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="02bbd4f3-e678-5b22-1d27-98eb48046422")
public static String es_PE_FIELD_ImportProduct_ProductBrand_Value_Name="Value Marca";

@XendraField(AD_Column_ID="ProductBrand_Value",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="02bbd4f3-e678-5b22-1d27-98eb48046422")
public static final String FIELDNAME_ImportProduct_ProductBrand_Value="02bbd4f3-e678-5b22-1d27-98eb48046422";

@XendraTrl(Identifier="4d0fe0c1-4207-83f5-d42f-ced91ca5f09c")
public static String es_PE_COLUMN_ProductBrand_Value_Name="Productbrand_Value";

@XendraColumn(AD_Element_ID="acc328bd-a3cc-5cdd-d853-b9fdc842efb5",ColumnName="ProductBrand_Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4d0fe0c1-4207-83f5-d42f-ced91ca5f09c",
Synchronized="2019-08-30 22:22:55.0")
/** Column name ProductBrand_Value */
public static final String COLUMNNAME_ProductBrand_Value = "ProductBrand_Value";
/** Set Product Category Key.
@param ProductCategory_Value Product Category Key */
public void setProductCategory_Value (String ProductCategory_Value)
{
if (ProductCategory_Value != null && ProductCategory_Value.length() > 40)
{
log.warning("Length > 40 - truncated");
ProductCategory_Value = ProductCategory_Value.substring(0,39);
}
set_Value (COLUMNNAME_ProductCategory_Value, ProductCategory_Value);
}
/** Get Product Category Key.
@return Product Category Key */
public String getProductCategory_Value() 
{
String value = (String)get_Value(COLUMNNAME_ProductCategory_Value);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d4170e4c-8d40-6969-5988-a97034ae8393")
public static String es_PE_FIELD_ImportProduct_ProductCategoryKey_Name="Clave Categoría Producto";

@XendraField(AD_Column_ID="ProductCategory_Value",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d4170e4c-8d40-6969-5988-a97034ae8393")
public static final String FIELDNAME_ImportProduct_ProductCategoryKey="d4170e4c-8d40-6969-5988-a97034ae8393";

@XendraTrl(Identifier="01ac44f2-8a9f-589c-8c8f-2e7db22efc65")
public static String es_PE_COLUMN_ProductCategory_Value_Name="Clave Categoría Producto";

@XendraColumn(AD_Element_ID="7cefcb7d-37e5-ef09-6cf4-73bc7fd4cfcc",
ColumnName="ProductCategory_Value",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=40,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="01ac44f2-8a9f-589c-8c8f-2e7db22efc65",Synchronized="2019-08-30 22:22:55.0")
/** Column name ProductCategory_Value */
public static final String COLUMNNAME_ProductCategory_Value = "ProductCategory_Value";
/** Set ProductGeneric_Value.
@param ProductGeneric_Value ProductGeneric_Value */
public void setProductGeneric_Value (String ProductGeneric_Value)
{
if (ProductGeneric_Value != null && ProductGeneric_Value.length() > 40)
{
log.warning("Length > 40 - truncated");
ProductGeneric_Value = ProductGeneric_Value.substring(0,39);
}
set_Value (COLUMNNAME_ProductGeneric_Value, ProductGeneric_Value);
}
/** Get ProductGeneric_Value.
@return ProductGeneric_Value */
public String getProductGeneric_Value() 
{
String value = (String)get_Value(COLUMNNAME_ProductGeneric_Value);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="bc0b74e0-10ac-7f9b-2623-ee985cedfadd")
public static String es_PE_FIELD_ImportProduct_ProductGeneric_Value_Name="Value Generico";

@XendraField(AD_Column_ID="ProductGeneric_Value",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bc0b74e0-10ac-7f9b-2623-ee985cedfadd")
public static final String FIELDNAME_ImportProduct_ProductGeneric_Value="bc0b74e0-10ac-7f9b-2623-ee985cedfadd";

@XendraTrl(Identifier="f4fbf351-5daa-3038-b577-b9a500f63a2c")
public static String es_PE_COLUMN_ProductGeneric_Value_Name="Productgeneric_Value";

@XendraColumn(AD_Element_ID="475fb919-f037-7745-7432-82b3fdbfed73",
ColumnName="ProductGeneric_Value",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=40,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f4fbf351-5daa-3038-b577-b9a500f63a2c",Synchronized="2019-08-30 22:22:55.0")
/** Column name ProductGeneric_Value */
public static final String COLUMNNAME_ProductGeneric_Value = "ProductGeneric_Value";
/** Set ProductGroup_Value.
@param ProductGroup_Value ProductGroup_Value */
public void setProductGroup_Value (String ProductGroup_Value)
{
if (ProductGroup_Value != null && ProductGroup_Value.length() > 40)
{
log.warning("Length > 40 - truncated");
ProductGroup_Value = ProductGroup_Value.substring(0,39);
}
set_Value (COLUMNNAME_ProductGroup_Value, ProductGroup_Value);
}
/** Get ProductGroup_Value.
@return ProductGroup_Value */
public String getProductGroup_Value() 
{
String value = (String)get_Value(COLUMNNAME_ProductGroup_Value);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="cfc75dac-501a-6e79-6fa4-8d17741d9088")
public static String es_PE_FIELD_ImportProduct_ProductGroup_Value_Name="Value Grupo";

@XendraField(AD_Column_ID="ProductGroup_Value",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cfc75dac-501a-6e79-6fa4-8d17741d9088")
public static final String FIELDNAME_ImportProduct_ProductGroup_Value="cfc75dac-501a-6e79-6fa4-8d17741d9088";

@XendraTrl(Identifier="07765684-a0b4-1983-c513-059365493f76")
public static String es_PE_COLUMN_ProductGroup_Value_Name="Productgroup_Value";

@XendraColumn(AD_Element_ID="b5c349bb-4dc4-9a0e-551e-7cf6e23bf720",ColumnName="ProductGroup_Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="07765684-a0b4-1983-c513-059365493f76",
Synchronized="2019-08-30 22:22:55.0")
/** Column name ProductGroup_Value */
public static final String COLUMNNAME_ProductGroup_Value = "ProductGroup_Value";
/** Set Product Type.
@param ProductType Type of product */
public void setProductType (String ProductType)
{
if (ProductType.length() > 1)
{
log.warning("Length > 1 - truncated");
ProductType = ProductType.substring(0,0);
}
set_Value (COLUMNNAME_ProductType, ProductType);
}
/** Get Product Type.
@return Type of product */
public String getProductType() 
{
return (String)get_Value(COLUMNNAME_ProductType);
}

@XendraTrl(Identifier="e5b19579-4b73-5b5b-aa11-86106360c50a")
public static String es_PE_FIELD_ImportProduct_ProductType2_Name="Tipo de Producto";

@XendraTrl(Identifier="e5b19579-4b73-5b5b-aa11-86106360c50a")
public static String es_PE_FIELD_ImportProduct_ProductType2_Description="Tipo de Producto";

@XendraTrl(Identifier="e5b19579-4b73-5b5b-aa11-86106360c50a")
public static String es_PE_FIELD_ImportProduct_ProductType2_Help="El tipo de producto también determina consecuencias contables";

@XendraField(AD_Column_ID="ProductType",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e5b19579-4b73-5b5b-aa11-86106360c50a")
public static final String FIELDNAME_ImportProduct_ProductType2="e5b19579-4b73-5b5b-aa11-86106360c50a";

@XendraTrl(Identifier="48c1457c-6c6a-af4b-bb7a-91e99d13bd2c")
public static String es_PE_COLUMN_ProductType_Name="Tipo de Producto";

@XendraColumn(AD_Element_ID="4780314c-a559-eb6b-03a6-3eb6c18136da",ColumnName="ProductType",
AD_Reference_ID=17,AD_Reference_Value_ID="028a2683-c298-dd54-f589-fe0d15a36c1b",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="I",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="48c1457c-6c6a-af4b-bb7a-91e99d13bd2c",Synchronized="2019-08-30 22:22:55.0")
/** Column name ProductType */
public static final String COLUMNNAME_ProductType = "ProductType";
/** Set Producttype_Value.
@param Producttype_Value Producttype_Value */
public void setProducttype_Value (String Producttype_Value)
{
if (Producttype_Value != null && Producttype_Value.length() > 40)
{
log.warning("Length > 40 - truncated");
Producttype_Value = Producttype_Value.substring(0,39);
}
set_Value (COLUMNNAME_Producttype_Value, Producttype_Value);
}
/** Get Producttype_Value.
@return Producttype_Value */
public String getProducttype_Value() 
{
String value = (String)get_Value(COLUMNNAME_Producttype_Value);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c98f1766-7a72-c2d3-14c8-77377d0a254c")
public static String es_PE_FIELD_ImportProduct_Producttype_Value_Name="Value Tipo";

@XendraField(AD_Column_ID="Producttype_Value",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=280,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c98f1766-7a72-c2d3-14c8-77377d0a254c")
public static final String FIELDNAME_ImportProduct_Producttype_Value="c98f1766-7a72-c2d3-14c8-77377d0a254c";

@XendraTrl(Identifier="2e14ee01-2d29-0150-e8a1-43110a081e37")
public static String es_PE_COLUMN_Producttype_Value_Name="Producttype_Value";

@XendraColumn(AD_Element_ID="306f38c8-0942-dbe6-9984-04826cfae26a",ColumnName="Producttype_Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2e14ee01-2d29-0150-e8a1-43110a081e37",
Synchronized="2019-08-30 22:22:55.0")
/** Column name Producttype_Value */
public static final String COLUMNNAME_Producttype_Value = "Producttype_Value";
/** Set Royalty Amount.
@param RoyaltyAmt (Included) Amount for copyright, etc. */
public void setRoyaltyAmt (BigDecimal RoyaltyAmt)
{
set_Value (COLUMNNAME_RoyaltyAmt, RoyaltyAmt);
}
/** Get Royalty Amount.
@return (Included) Amount for copyright, etc. */
public BigDecimal getRoyaltyAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_RoyaltyAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="c95a9c78-7f7b-76c2-1c0d-9c90b9a991ee")
public static String es_PE_FIELD_ImportProduct_RoyaltyAmount_Name="Importe de los Derechos";

@XendraTrl(Identifier="c95a9c78-7f7b-76c2-1c0d-9c90b9a991ee")
public static String es_PE_FIELD_ImportProduct_RoyaltyAmount_Description="(incluido) cantidad para el copyright, etc.";

@XendraField(AD_Column_ID="RoyaltyAmt",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=310,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c95a9c78-7f7b-76c2-1c0d-9c90b9a991ee")
public static final String FIELDNAME_ImportProduct_RoyaltyAmount="c95a9c78-7f7b-76c2-1c0d-9c90b9a991ee";

@XendraTrl(Identifier="294f5502-e9a6-1662-9f84-6168ec72914f")
public static String es_PE_COLUMN_RoyaltyAmt_Name="Importe de los Derechos";

@XendraColumn(AD_Element_ID="4947b9a2-6c54-c15b-1d8e-8b78ac569677",ColumnName="RoyaltyAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="294f5502-e9a6-1662-9f84-6168ec72914f",
Synchronized="2019-08-30 22:22:55.0")
/** Column name RoyaltyAmt */
public static final String COLUMNNAME_RoyaltyAmt = "RoyaltyAmt";
/** Set Shelf Depth.
@param ShelfDepth Shelf depth required */
public void setShelfDepth (int ShelfDepth)
{
set_Value (COLUMNNAME_ShelfDepth, Integer.valueOf(ShelfDepth));
}
/** Get Shelf Depth.
@return Shelf depth required */
public int getShelfDepth() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_ShelfDepth);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2b238fd1-6d39-1476-ff0f-a1d983773c61")
public static String es_PE_FIELD_ImportProduct_ShelfDepth_Name="Profundidad del Anaquel";

@XendraTrl(Identifier="2b238fd1-6d39-1476-ff0f-a1d983773c61")
public static String es_PE_FIELD_ImportProduct_ShelfDepth_Description="Profundidad del anaquel requerida";

@XendraTrl(Identifier="2b238fd1-6d39-1476-ff0f-a1d983773c61")
public static String es_PE_FIELD_ImportProduct_ShelfDepth_Help="La profundidad del Anaquel indica la dimensión de la profundidad requerida en un anaquel para un producto";

@XendraField(AD_Column_ID="ShelfDepth",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=380,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2b238fd1-6d39-1476-ff0f-a1d983773c61")
public static final String FIELDNAME_ImportProduct_ShelfDepth="2b238fd1-6d39-1476-ff0f-a1d983773c61";

@XendraTrl(Identifier="6951da69-11a7-84a0-2c3f-83f97b08dc02")
public static String es_PE_COLUMN_ShelfDepth_Name="Profundidad del Anaquel";

@XendraColumn(AD_Element_ID="71c10a34-b62d-3e7b-080f-c3c3d211b095",ColumnName="ShelfDepth",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6951da69-11a7-84a0-2c3f-83f97b08dc02",
Synchronized="2019-08-30 22:22:55.0")
/** Column name ShelfDepth */
public static final String COLUMNNAME_ShelfDepth = "ShelfDepth";
/** Set Shelf Height.
@param ShelfHeight Shelf height required */
public void setShelfHeight (int ShelfHeight)
{
set_Value (COLUMNNAME_ShelfHeight, Integer.valueOf(ShelfHeight));
}
/** Get Shelf Height.
@return Shelf height required */
public int getShelfHeight() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_ShelfHeight);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a90fb2a3-808a-cd21-8c9a-718a10800fc5")
public static String es_PE_FIELD_ImportProduct_ShelfHeight_Name="Altura del Anaquel";

@XendraTrl(Identifier="a90fb2a3-808a-cd21-8c9a-718a10800fc5")
public static String es_PE_FIELD_ImportProduct_ShelfHeight_Description="Altura del anaquel requerida";

@XendraTrl(Identifier="a90fb2a3-808a-cd21-8c9a-718a10800fc5")
public static String es_PE_FIELD_ImportProduct_ShelfHeight_Help="La altura del Anaquel indica la dimensión de la altura requerida en un anaquel para un producto";

@XendraField(AD_Column_ID="ShelfHeight",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a90fb2a3-808a-cd21-8c9a-718a10800fc5")
public static final String FIELDNAME_ImportProduct_ShelfHeight="a90fb2a3-808a-cd21-8c9a-718a10800fc5";

@XendraTrl(Identifier="17c0c1ad-75c6-fd00-7dc6-611f1e8c7e1b")
public static String es_PE_COLUMN_ShelfHeight_Name="Altura del Anaquel";

@XendraColumn(AD_Element_ID="b0e883ea-4e2f-cafe-a8ad-582715d9100a",ColumnName="ShelfHeight",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="17c0c1ad-75c6-fd00-7dc6-611f1e8c7e1b",
Synchronized="2019-08-30 22:22:55.0")
/** Column name ShelfHeight */
public static final String COLUMNNAME_ShelfHeight = "ShelfHeight";
/** Set Shelf Width.
@param ShelfWidth Shelf width required */
public void setShelfWidth (int ShelfWidth)
{
set_Value (COLUMNNAME_ShelfWidth, Integer.valueOf(ShelfWidth));
}
/** Get Shelf Width.
@return Shelf width required */
public int getShelfWidth() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_ShelfWidth);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8ad97b4e-4a4d-c8ff-bcc4-f1e5f26867c3")
public static String es_PE_FIELD_ImportProduct_ShelfWidth_Name="Ancho del Anaquel";

@XendraTrl(Identifier="8ad97b4e-4a4d-c8ff-bcc4-f1e5f26867c3")
public static String es_PE_FIELD_ImportProduct_ShelfWidth_Description="Ancho del anaquel requerido";

@XendraTrl(Identifier="8ad97b4e-4a4d-c8ff-bcc4-f1e5f26867c3")
public static String es_PE_FIELD_ImportProduct_ShelfWidth_Help="El ancho del Anaquel indica la dimensión del ancho requerido en un anaquel para un producto";

@XendraField(AD_Column_ID="ShelfWidth",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8ad97b4e-4a4d-c8ff-bcc4-f1e5f26867c3")
public static final String FIELDNAME_ImportProduct_ShelfWidth="8ad97b4e-4a4d-c8ff-bcc4-f1e5f26867c3";

@XendraTrl(Identifier="f49a3cc0-0948-dc18-da7c-4b082ec2ccf0")
public static String es_PE_COLUMN_ShelfWidth_Name="Ancho del Anaquel";

@XendraColumn(AD_Element_ID="a687e67e-bb81-a520-028a-cefe9b8a8bde",ColumnName="ShelfWidth",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f49a3cc0-0948-dc18-da7c-4b082ec2ccf0",
Synchronized="2019-08-30 22:22:55.0")
/** Column name ShelfWidth */
public static final String COLUMNNAME_ShelfWidth = "ShelfWidth";
/** Set ShortName.
@param ShortName ShortName */
public void setShortName (String ShortName)
{
if (ShortName != null && ShortName.length() > 60)
{
log.warning("Length > 60 - truncated");
ShortName = ShortName.substring(0,59);
}
set_Value (COLUMNNAME_ShortName, ShortName);
}
/** Get ShortName.
@return ShortName */
public String getShortName() 
{
String value = (String)get_Value(COLUMNNAME_ShortName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ee722b76-f86d-442c-bcb5-899fced1d157")
public static String es_PE_COLUMN_ShortName_Name="ShortName";

@XendraColumn(AD_Element_ID="885ce67a-fc00-4e8b-be05-8d8045283c6c",ColumnName="ShortName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ee722b76-f86d-442c-bcb5-899fced1d157",
Synchronized="2019-08-30 22:22:55.0")
/** Column name ShortName */
public static final String COLUMNNAME_ShortName = "ShortName";
/** Set SKU.
@param SKU Stock Keeping Unit */
public void setSKU (String SKU)
{
if (SKU != null && SKU.length() > 30)
{
log.warning("Length > 30 - truncated");
SKU = SKU.substring(0,29);
}
set_Value (COLUMNNAME_SKU, SKU);
}
/** Get SKU.
@return Stock Keeping Unit */
public String getSKU() 
{
String value = (String)get_Value(COLUMNNAME_SKU);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="6a8d596e-abf8-8573-13bf-878725a2d5e1")
public static String es_PE_FIELD_ImportProduct_SKU_Name="UM Almacenamiento";

@XendraTrl(Identifier="6a8d596e-abf8-8573-13bf-878725a2d5e1")
public static String es_PE_FIELD_ImportProduct_SKU_Description="Unidad de Mantenimiento en Inventario";

@XendraTrl(Identifier="6a8d596e-abf8-8573-13bf-878725a2d5e1")
public static String es_PE_FIELD_ImportProduct_SKU_Help="El SKU indica la unidad de almacenamiento de inventario definida por el usuario. Puede ser usada por  una simbología adicional de código de barras ó por su propio esquema .";

@XendraField(AD_Column_ID="SKU",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=370,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6a8d596e-abf8-8573-13bf-878725a2d5e1")
public static final String FIELDNAME_ImportProduct_SKU="6a8d596e-abf8-8573-13bf-878725a2d5e1";

@XendraTrl(Identifier="47181b3c-22c5-92c4-7e7c-d4e2f2000747")
public static String es_PE_COLUMN_SKU_Name="UM Almacenamiento";

@XendraColumn(AD_Element_ID="f473a6ed-4a3f-b6fd-5b0f-06d49c1e65e2",ColumnName="SKU",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="47181b3c-22c5-92c4-7e7c-d4e2f2000747",
Synchronized="2019-08-30 22:22:55.0")
/** Column name SKU */
public static final String COLUMNNAME_SKU = "SKU";
/** Set Units Per Pallet.
@param UnitsPerPallet Units Per Pallet */
public void setUnitsPerPallet (int UnitsPerPallet)
{
set_Value (COLUMNNAME_UnitsPerPallet, Integer.valueOf(UnitsPerPallet));
}
/** Get Units Per Pallet.
@return Units Per Pallet */
public int getUnitsPerPallet() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_UnitsPerPallet);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e1c622b1-8228-9971-cf97-8afc10e0950c")
public static String es_PE_FIELD_ImportProduct_UnitsPerPallet_Name="Unidades por Tarima";

@XendraTrl(Identifier="e1c622b1-8228-9971-cf97-8afc10e0950c")
public static String es_PE_FIELD_ImportProduct_UnitsPerPallet_Description="Unidades por Tarima";

@XendraTrl(Identifier="e1c622b1-8228-9971-cf97-8afc10e0950c")
public static String es_PE_FIELD_ImportProduct_UnitsPerPallet_Help="Las unidades por tarima indica el número de unidades de este producto que caben en una tarima";

@XendraField(AD_Column_ID="UnitsPerPallet",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=360,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e1c622b1-8228-9971-cf97-8afc10e0950c")
public static final String FIELDNAME_ImportProduct_UnitsPerPallet="e1c622b1-8228-9971-cf97-8afc10e0950c";

@XendraTrl(Identifier="0f54b0b0-a0ef-9453-7659-577ad5f74794")
public static String es_PE_COLUMN_UnitsPerPallet_Name="Unidades por Tarima";

@XendraColumn(AD_Element_ID="41f9f625-088c-1dfb-3e1f-7dc81a70441a",ColumnName="UnitsPerPallet",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0f54b0b0-a0ef-9453-7659-577ad5f74794",
Synchronized="2019-08-30 22:22:55.0")
/** Column name UnitsPerPallet */
public static final String COLUMNNAME_UnitsPerPallet = "UnitsPerPallet";
/** Set Symbol.
@param UOMSymbol Symbol for a Unit of Measure */
public void setUOMSymbol (String UOMSymbol)
{
if (UOMSymbol != null && UOMSymbol.length() > 10)
{
log.warning("Length > 10 - truncated");
UOMSymbol = UOMSymbol.substring(0,9);
}
set_Value (COLUMNNAME_UOMSymbol, UOMSymbol);
}
/** Get Symbol.
@return Symbol for a Unit of Measure */
public String getUOMSymbol() 
{
String value = (String)get_Value(COLUMNNAME_UOMSymbol);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="90a78626-83b2-41d3-aef9-a03571794bdd")
public static String es_PE_COLUMN_UOMSymbol_Name="Symbol";

@XendraColumn(AD_Element_ID="ccb82b4f-2e57-da9a-16a8-8fd48d94adf5",ColumnName="UOMSymbol",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="90a78626-83b2-41d3-aef9-a03571794bdd",
Synchronized="2019-08-30 22:22:55.0")
/** Column name UOMSymbol */
public static final String COLUMNNAME_UOMSymbol = "UOMSymbol";
/** Set UPC/EAN.
@param UPC Bar Code (Universal Product Code or its superset European Article Number) */
public void setUPC (String UPC)
{
if (UPC != null && UPC.length() > 30)
{
log.warning("Length > 30 - truncated");
UPC = UPC.substring(0,29);
}
set_Value (COLUMNNAME_UPC, UPC);
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
@XendraTrl(Identifier="75da04d2-d820-1721-d99a-15b710257165")
public static String es_PE_FIELD_ImportProduct_UPCEAN_Name="UPC/EAN";

@XendraTrl(Identifier="75da04d2-d820-1721-d99a-15b710257165")
public static String es_PE_FIELD_ImportProduct_UPCEAN_Description="Código de Barras (Codigo universal del Producto ó su super conjunto, Número de Articulo europeo)";

@XendraTrl(Identifier="75da04d2-d820-1721-d99a-15b710257165")
public static String es_PE_FIELD_ImportProduct_UPCEAN_Help="Use este campo para introducir el código de barras para el producto en cualquiera de las simbologías del código de barras  (Codabar; Código 25; Código 39; Código 93; Código 128; UPC (A); UPC (E); EAN-13; EAN-8; ITF; ITF-14; ISBN; ISSN; JAN-13; JAN-8; POSTNET y FIM; MSI/Plessey; y Pharmacode)";

@XendraField(AD_Column_ID="UPC",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="75da04d2-d820-1721-d99a-15b710257165")
public static final String FIELDNAME_ImportProduct_UPCEAN="75da04d2-d820-1721-d99a-15b710257165";

@XendraTrl(Identifier="0cb975aa-60fb-87e0-0aff-bb20cf1d2e7d")
public static String es_PE_COLUMN_UPC_Name="UPC/EAN";

@XendraColumn(AD_Element_ID="9e36272a-ec41-b187-d531-cec50070c612",ColumnName="UPC",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0cb975aa-60fb-87e0-0aff-bb20cf1d2e7d",
Synchronized="2019-08-30 22:22:55.0")
/** Column name UPC */
public static final String COLUMNNAME_UPC = "UPC";
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getValue());
}

@XendraTrl(Identifier="54aeddfb-35c1-b2e3-2895-c88aeed65410")
public static String es_PE_FIELD_ImportProduct_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="54aeddfb-35c1-b2e3-2895-c88aeed65410")
public static String es_PE_FIELD_ImportProduct_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="54aeddfb-35c1-b2e3-2895-c88aeed65410")
public static String es_PE_FIELD_ImportProduct_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="54aeddfb-35c1-b2e3-2895-c88aeed65410")
public static final String FIELDNAME_ImportProduct_SearchKey="54aeddfb-35c1-b2e3-2895-c88aeed65410";

@XendraTrl(Identifier="26c63075-8458-77ea-9a12-d503fa52da9f")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="26c63075-8458-77ea-9a12-d503fa52da9f",
Synchronized="2019-08-30 22:22:56.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
/** Set Partner Category.
@param VendorCategory Product Category of the Business Partner */
public void setVendorCategory (String VendorCategory)
{
if (VendorCategory != null && VendorCategory.length() > 30)
{
log.warning("Length > 30 - truncated");
VendorCategory = VendorCategory.substring(0,29);
}
set_Value (COLUMNNAME_VendorCategory, VendorCategory);
}
/** Get Partner Category.
@return Product Category of the Business Partner */
public String getVendorCategory() 
{
String value = (String)get_Value(COLUMNNAME_VendorCategory);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="7d3a7e09-78ce-ca17-a92c-e52898e4369b")
public static String es_PE_FIELD_ImportProduct_PartnerCategory_Name="Categoría del Proveedor";

@XendraTrl(Identifier="7d3a7e09-78ce-ca17-a92c-e52898e4369b")
public static String es_PE_FIELD_ImportProduct_PartnerCategory_Description="Proveedor";

@XendraTrl(Identifier="7d3a7e09-78ce-ca17-a92c-e52898e4369b")
public static String es_PE_FIELD_ImportProduct_PartnerCategory_Help="La categoría del proveedor identifica la categoría usada por el proveedor para este producto";

@XendraField(AD_Column_ID="VendorCategory",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=410,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7d3a7e09-78ce-ca17-a92c-e52898e4369b")
public static final String FIELDNAME_ImportProduct_PartnerCategory="7d3a7e09-78ce-ca17-a92c-e52898e4369b";

@XendraTrl(Identifier="2da199d6-6885-44be-db5b-bc7b2d201be9")
public static String es_PE_COLUMN_VendorCategory_Name="Categoría del Proveedor";

@XendraColumn(AD_Element_ID="e4cdee60-a64a-b5fe-51f4-6759366bdb6e",ColumnName="VendorCategory",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2da199d6-6885-44be-db5b-bc7b2d201be9",
Synchronized="2019-08-30 22:22:56.0")
/** Column name VendorCategory */
public static final String COLUMNNAME_VendorCategory = "VendorCategory";
/** Set Partner Product Key.
@param VendorProductNo Product Key of the Business Partner */
public void setVendorProductNo (String VendorProductNo)
{
if (VendorProductNo != null && VendorProductNo.length() > 30)
{
log.warning("Length > 30 - truncated");
VendorProductNo = VendorProductNo.substring(0,29);
}
set_Value (COLUMNNAME_VendorProductNo, VendorProductNo);
}
/** Get Partner Product Key.
@return Product Key of the Business Partner */
public String getVendorProductNo() 
{
String value = (String)get_Value(COLUMNNAME_VendorProductNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="db4f44d4-80ca-d14f-06d6-24c0fe9a9d7b")
public static String es_PE_FIELD_ImportProduct_PartnerProductKey_Name="No. de Producto del Proveedor";

@XendraTrl(Identifier="db4f44d4-80ca-d14f-06d6-24c0fe9a9d7b")
public static String es_PE_FIELD_ImportProduct_PartnerProductKey_Description="Proveedor";

@XendraTrl(Identifier="db4f44d4-80ca-d14f-06d6-24c0fe9a9d7b")
public static String es_PE_FIELD_ImportProduct_PartnerProductKey_Help="El número de producto del proveedor identifica el número usado por el proveedor para este producto.";

@XendraField(AD_Column_ID="VendorProductNo",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=420,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="db4f44d4-80ca-d14f-06d6-24c0fe9a9d7b")
public static final String FIELDNAME_ImportProduct_PartnerProductKey="db4f44d4-80ca-d14f-06d6-24c0fe9a9d7b";

@XendraTrl(Identifier="35cb0d98-160d-08b0-4284-fd49eeeef39d")
public static String es_PE_COLUMN_VendorProductNo_Name="No. de Producto del Proveedor";

@XendraColumn(AD_Element_ID="c028b618-164f-85b1-8821-99e6545860ce",ColumnName="VendorProductNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="35cb0d98-160d-08b0-4284-fd49eeeef39d",
Synchronized="2019-08-30 22:22:56.0")
/** Column name VendorProductNo */
public static final String COLUMNNAME_VendorProductNo = "VendorProductNo";
/** Set Volume.
@param Volume Volume of a product */
public void setVolume (BigDecimal Volume)
{
set_Value (COLUMNNAME_Volume, Volume);
}
/** Get Volume.
@return Volume of a product */
public BigDecimal getVolume() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Volume);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="6e645305-e084-5174-bcc3-4dc4314290e1")
public static String es_PE_FIELD_ImportProduct_Volume_Name="Volúmen";

@XendraTrl(Identifier="6e645305-e084-5174-bcc3-4dc4314290e1")
public static String es_PE_FIELD_ImportProduct_Volume_Description="Volúmen del producto";

@XendraTrl(Identifier="6e645305-e084-5174-bcc3-4dc4314290e1")
public static String es_PE_FIELD_ImportProduct_Volume_Help="El Volumen indica el volumen del producto en la UM de volúmen del cliente";

@XendraField(AD_Column_ID="Volume",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=350,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6e645305-e084-5174-bcc3-4dc4314290e1")
public static final String FIELDNAME_ImportProduct_Volume="6e645305-e084-5174-bcc3-4dc4314290e1";

@XendraTrl(Identifier="f534d2c0-0247-5b50-bb7d-83a9fb42fdd1")
public static String es_PE_COLUMN_Volume_Name="Volúmen";

@XendraColumn(AD_Element_ID="464c5f3e-92af-e641-7d3a-e7e5427af367",ColumnName="Volume",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f534d2c0-0247-5b50-bb7d-83a9fb42fdd1",
Synchronized="2019-08-30 22:22:56.0")
/** Column name Volume */
public static final String COLUMNNAME_Volume = "Volume";
/** Set Weight.
@param Weight Weight of a product */
public void setWeight (BigDecimal Weight)
{
set_Value (COLUMNNAME_Weight, Weight);
}
/** Get Weight.
@return Weight of a product */
public BigDecimal getWeight() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Weight);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="53cb0ade-41bb-cbac-5a7d-155edd9016e7")
public static String es_PE_FIELD_ImportProduct_Weight_Name="Peso";

@XendraTrl(Identifier="53cb0ade-41bb-cbac-5a7d-155edd9016e7")
public static String es_PE_FIELD_ImportProduct_Weight_Description="Peso del producto";

@XendraTrl(Identifier="53cb0ade-41bb-cbac-5a7d-155edd9016e7")
public static String es_PE_FIELD_ImportProduct_Weight_Help="El peso indica el peso del producto en la UM de peso del cliente.";

@XendraField(AD_Column_ID="Weight",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=340,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="53cb0ade-41bb-cbac-5a7d-155edd9016e7")
public static final String FIELDNAME_ImportProduct_Weight="53cb0ade-41bb-cbac-5a7d-155edd9016e7";

@XendraTrl(Identifier="7645122c-a6a1-8734-9e89-2d7975fbdd38")
public static String es_PE_COLUMN_Weight_Name="Peso";

@XendraColumn(AD_Element_ID="712867f4-95e8-b3a8-b07b-f884a12efbb4",ColumnName="Weight",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7645122c-a6a1-8734-9e89-2d7975fbdd38",
Synchronized="2019-08-30 22:22:56.0")
/** Column name Weight */
public static final String COLUMNNAME_Weight = "Weight";
/** Set UOM Code.
@param X12DE355 UOM EDI X12 Code */
public void setX12DE355 (String X12DE355)
{
if (X12DE355 != null && X12DE355.length() > 2)
{
log.warning("Length > 2 - truncated");
X12DE355 = X12DE355.substring(0,1);
}
set_Value (COLUMNNAME_X12DE355, X12DE355);
}
/** Get UOM Code.
@return UOM EDI X12 Code */
public String getX12DE355() 
{
return (String)get_Value(COLUMNNAME_X12DE355);
}

@XendraTrl(Identifier="cbbbb471-0aa7-bdd6-57e7-cf16ef2c62f9")
public static String es_PE_FIELD_ImportProduct_UOMCode_Name="Código EDI";

@XendraTrl(Identifier="cbbbb471-0aa7-bdd6-57e7-cf16ef2c62f9")
public static String es_PE_FIELD_ImportProduct_UOMCode_Description="Código EDI";

@XendraTrl(Identifier="cbbbb471-0aa7-bdd6-57e7-cf16ef2c62f9")
public static String es_PE_FIELD_ImportProduct_UOMCode_Help="El código EDI indica el Elemento de Dato del Código EDI X!12 355 (Unidad ó Base para Medida)";

@XendraField(AD_Column_ID="X12DE355",IsCentrallyMaintained=true,
AD_Tab_ID="ec15f2f7-f4d5-3b40-9e45-22bc56cde9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cbbbb471-0aa7-bdd6-57e7-cf16ef2c62f9")
public static final String FIELDNAME_ImportProduct_UOMCode="cbbbb471-0aa7-bdd6-57e7-cf16ef2c62f9";

@XendraTrl(Identifier="b4c1a607-655e-6636-3171-5f2d1d1cb8f8")
public static String es_PE_COLUMN_X12DE355_Name="Código EDI";

@XendraColumn(AD_Element_ID="f1c4cca9-24fe-9fb1-505a-36bc2f9545f1",ColumnName="X12DE355",
AD_Reference_ID=17,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b4c1a607-655e-6636-3171-5f2d1d1cb8f8",
Synchronized="2019-08-30 22:22:56.0")
/** Column name X12DE355 */
public static final String COLUMNNAME_X12DE355 = "X12DE355";
}
