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
/** Generated Model for M_Product
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_Product extends PO
{
/** Standard Constructor
@param ctx context
@param M_Product_ID id
@param trxName transaction
*/
public X_M_Product (Properties ctx, int M_Product_ID, String trxName)
{
super (ctx, M_Product_ID, trxName);
/** if (M_Product_ID == 0)
{
setC_TaxCategory_ID (0);
setC_UOM_ID (0);
setIsBOM (false);	
// N
setIsCostable (false);	
// N
setIsDropShip (false);	
// N
setIsExcludeAutoDelivery (false);	
// N
setIsInvoicePrintDetails (false);	
// N
setIsPickListPrintDetails (false);	
// N
setIsPurchased (true);	
// Y
setIsSelfService (true);	
// Y
setIsSold (true);	
// Y
setIsStocked (true);	
// Y
setIsSummary (false);	
// N
setIsVerified (false);	
// N
setIsWebStoreFeatured (false);	
// N
setM_AttributeSetInstance_ID (0);
setM_Product_Category_ID (0);
setM_Product_ID (0);
setName (null);
setProductType (null);	
// I
setProductTypeTax (null);
setValue (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_Product (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=208 */
public static int Table_ID=MTable.getTable_ID("M_Product");

@XendraTrl(Identifier="3613957f-d0c4-6b93-13a2-0fb23284d808")
public static String es_PE_TAB_ProductDimension_Description="Mantenga la dimensión del árbol del producto.";

@XendraTrl(Identifier="3613957f-d0c4-6b93-13a2-0fb23284d808")
public static String es_PE_TAB_ProductDimension_Help="¡Observe por favor que usted no podrá crear entidades nuevas en esta ventana si usted no tiene defecto fijado para todos los valores obligatorios!.";

@XendraTrl(Identifier="3613957f-d0c4-6b93-13a2-0fb23284d808")
public static String es_PE_TAB_ProductDimension_Name="Dimensión Productos";

@XendraTab(Name="Product Dimension",Description="Maintain Product Accounting Dimension Tree",
Help="Please note that you will not be able to create new entities in this window if you have not default set for all mandatory values! ",
AD_Window_ID="6d82a0ab-8b9a-fa56-aec1-277a04b274a1",SeqNo=60,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=true,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="3613957f-d0c4-6b93-13a2-0fb23284d808",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ProductDimension="3613957f-d0c4-6b93-13a2-0fb23284d808";

@XendraTrl(Identifier="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973")
public static String es_PE_TAB_ExpenseProduct_Description="Definición de producto de tipo de gasto";

@XendraTrl(Identifier="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973")
public static String es_PE_TAB_ExpenseProduct_Name="Producto";
@XendraTab(Name="Expense Product",
Description="Product definition of Expense Type",Help="",
AD_Window_ID="e37c684c-2fb9-31f4-b025-d8ef9933998c",SeqNo=20,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="0bafc89a-ea6a-5f13-86b0-7aa1a03389e4",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ExpenseProduct="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973";

@XendraTrl(Identifier="0259cb0c-f204-3a56-705d-b9cdd730f9d8")
public static String es_PE_TAB_AssignedProducts_Description="Productos asignados a una categoría de producto";

@XendraTrl(Identifier="0259cb0c-f204-3a56-705d-b9cdd730f9d8")
public static String es_PE_TAB_AssignedProducts_Name="Productos Asignados";

@XendraTab(Name="Assigned Products",Description="Products assigned to Product Category",Help="",
AD_Window_ID="4e60880d-1a9c-ed56-dba9-3ba9d80c8b83",SeqNo=30,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="6f298307-ee89-b44b-1341-afb769b7f98c",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="0259cb0c-f204-3a56-705d-b9cdd730f9d8",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_AssignedProducts="0259cb0c-f204-3a56-705d-b9cdd730f9d8";

@XendraTrl(Identifier="b2bfdf14-fd43-88d6-16f0-6764a52e3edd")
public static String es_PE_TAB_SelectProduct_Description="Selección de producto";

@XendraTrl(Identifier="b2bfdf14-fd43-88d6-16f0-6764a52e3edd")
public static String es_PE_TAB_SelectProduct_Name="Seleccion de Producto";

@XendraTab(Name="Select Product",Description="Select the product",Help="",
AD_Window_ID="8983f195-c186-47e9-7541-aa6e2d0eebfc",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,WhereClause="",
OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_SelectProduct="b2bfdf14-fd43-88d6-16f0-6764a52e3edd";

@XendraTrl(Identifier="4b12a806-caeb-ad25-c955-727c0c0e3e63")
public static String es_PE_TAB_Product_Description="Mantiene información de producto";

@XendraTrl(Identifier="4b12a806-caeb-ad25-c955-727c0c0e3e63")
public static String es_PE_TAB_Product_Name="Producto";
@XendraTab(Name="Product",
Description="Maintain Product Information",Help="",
AD_Window_ID="19c8d953-bce9-f34c-e702-5d8e285fb49d",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="4b12a806-caeb-ad25-c955-727c0c0e3e63",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Product="4b12a806-caeb-ad25-c955-727c0c0e3e63";

@XendraTrl(Identifier="fc913b56-1737-810e-a21d-efaa2bde7153")
public static String es_PE_TAB_ResourceProduct_Description="Mantener Información de productos para recursos";

@XendraTrl(Identifier="fc913b56-1737-810e-a21d-efaa2bde7153")
public static String es_PE_TAB_ResourceProduct_Help="El producto para el recurso es creado automáticamente y sincronizado. Actualiza Nombre; Unidad de Medida; etc. En el recurso y no lo cambia en el producto.";

@XendraTrl(Identifier="fc913b56-1737-810e-a21d-efaa2bde7153")
public static String es_PE_TAB_ResourceProduct_Name="Producto";
@XendraTab(Name="Resource Product",
Description="Maintain Product information of Resource",
Help="The product for the resource is automatically created and synchronized. Update Name, Unit of Measure, etc. in the Resource and don't change it in the product.",
AD_Window_ID="d64fba3f-bbf2-bd5b-1f70-0c9bcedb722a",SeqNo=30,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="31237d94-b549-ea5d-5513-b766a7fe1ac6",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="fc913b56-1737-810e-a21d-efaa2bde7153",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ResourceProduct="fc913b56-1737-810e-a21d-efaa2bde7153";

@XendraTrl(Identifier="cda82352-4ccb-b0c6-7307-2c5795eb49f6")
public static String es_PE_TAB_Product2_Description="Definir producto";

@XendraTrl(Identifier="cda82352-4ccb-b0c6-7307-2c5795eb49f6")
public static String es_PE_TAB_Product2_Help="La pestaña de producto define cada producto y lo identifica para su uso en lista de precios y ordenes.";

@XendraTrl(Identifier="cda82352-4ccb-b0c6-7307-2c5795eb49f6")
public static String es_PE_TAB_Product2_Name="Producto";
@XendraTab(Name="Product",
Description="Define Product",
Help="The Product Tab defines each product and identifies it for use in price lists and orders. The Location is the default location when receiving the stored product.",
AD_Window_ID="ce2d4e2c-ba4e-29bf-9f71-66fecdc05f55",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="cda82352-4ccb-b0c6-7307-2c5795eb49f6",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Product2="cda82352-4ccb-b0c6-7307-2c5795eb49f6";

@XendraTrl(Identifier="b819f4da-3df6-ed33-3c4a-2f06b4b46999")
public static String es_PE_TABLE_M_Product_Name="Producto";

@XendraTable(Name="Product",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Product, Service, Item",Help="",
TableName="M_Product",AccessLevel="3",AD_Window_ID="ce2d4e2c-ba4e-29bf-9f71-66fecdc05f55",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=90,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="b819f4da-3df6-ed33-3c4a-2f06b4b46999",Synchronized="2022-05-06 17:51:34.0")
/** TableName=M_Product */
public static final String Table_Name="M_Product";


@XendraIndex(Name="m_product_expensetype",Identifier="850a59d4-7c3e-94b6-ce2e-79f6367b4f93",
Column_Names="s_expensetype_id",IsUnique="true",
TableIdentifier="850a59d4-7c3e-94b6-ce2e-79f6367b4f93",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_m_product_expensetype = "850a59d4-7c3e-94b6-ce2e-79f6367b4f93";


@XendraIndex(Name="m_product_identifier",Identifier="2d836251-a13e-46f3-b242-f6755f0798fd",
Column_Names="identifier",IsUnique="false",TableIdentifier="2d836251-a13e-46f3-b242-f6755f0798fd",
Synchronized="2020-11-02 17:52:25.0")
public static final String INDEXNAME_m_product_identifier = "2d836251-a13e-46f3-b242-f6755f0798fd";


@XendraIndex(Name="m_product_name",Identifier="63d1a3f0-bcd5-697f-c8cd-1e96e71fbfdb",
Column_Names="name",IsUnique="false",TableIdentifier="63d1a3f0-bcd5-697f-c8cd-1e96e71fbfdb",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_m_product_name = "63d1a3f0-bcd5-697f-c8cd-1e96e71fbfdb";


@XendraIndex(Name="m_product_productcategory",Identifier="af46650b-b5a6-14a2-508b-5f0a5f746b15",
Column_Names="m_product_category_id",IsUnique="false",
TableIdentifier="af46650b-b5a6-14a2-508b-5f0a5f746b15",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_m_product_productcategory = "af46650b-b5a6-14a2-508b-5f0a5f746b15";


@XendraIndex(Name="m_product_resource",Identifier="90f7e582-f4e9-ecdd-a1e1-4cee8c08459f",
Column_Names="s_resource_id",IsUnique="true",
TableIdentifier="90f7e582-f4e9-ecdd-a1e1-4cee8c08459f",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_m_product_resource = "90f7e582-f4e9-ecdd-a1e1-4cee8c08459f";


@XendraIndex(Name="m_product_upc",Identifier="e6371ee4-acc8-3492-bb0a-ddddad18d082",
Column_Names="upc",IsUnique="false",TableIdentifier="e6371ee4-acc8-3492-bb0a-ddddad18d082",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_m_product_upc = "e6371ee4-acc8-3492-bb0a-ddddad18d082";


@XendraIndex(Name="m_product_value",Identifier="5a2e264f-99a7-ee09-50a3-a0effee16e7a",
Column_Names="ad_client_id, value",IsUnique="true",
TableIdentifier="5a2e264f-99a7-ee09-50a3-a0effee16e7a",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_m_product_value = "5a2e264f-99a7-ee09-50a3-a0effee16e7a";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_Product");

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
    Table_ID = MTable.getTable_ID("M_Product");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_Product[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Classification.
@param Classification Classification for grouping */
public void setClassification (String Classification)
{
if (Classification != null && Classification.length() > 1)
{
log.warning("Length > 1 - truncated");
Classification = Classification.substring(0,0);
}
set_Value (COLUMNNAME_Classification, Classification);
}
/** Get Classification.
@return Classification for grouping */
public String getClassification() 
{
String value = (String)get_Value(COLUMNNAME_Classification);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="90c3389f-a47b-30a1-2661-918ab04222f7")
public static String es_PE_FIELD_Product_Classification_Name="Item de Producto";

@XendraTrl(Identifier="90c3389f-a47b-30a1-2661-918ab04222f7")
public static String es_PE_FIELD_Product_Classification_Help="La clasificación puede ser usada para agrupar productos opcionalmente.";

@XendraTrl(Identifier="90c3389f-a47b-30a1-2661-918ab04222f7")
public static String es_PE_FIELD_Product_Classification_Description="Clasificación para agrupaciones de productos";

@XendraField(AD_Column_ID="Classification",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="90c3389f-a47b-30a1-2661-918ab04222f7")
public static final String FIELDNAME_Product_Classification="90c3389f-a47b-30a1-2661-918ab04222f7";

@XendraTrl(Identifier="3f094e2e-7623-61e7-1b6d-16a8d5f81f32")
public static String es_PE_FIELD_AssignedProducts_Classification_Name="Item de Producto";

@XendraTrl(Identifier="3f094e2e-7623-61e7-1b6d-16a8d5f81f32")
public static String es_PE_FIELD_AssignedProducts_Classification_Help="La clasificación puede ser usada para agrupar productos opcionalmente.";

@XendraTrl(Identifier="3f094e2e-7623-61e7-1b6d-16a8d5f81f32")
public static String es_PE_FIELD_AssignedProducts_Classification_Description="Clasificación para agrupaciones de productos";

@XendraField(AD_Column_ID="Classification",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3f094e2e-7623-61e7-1b6d-16a8d5f81f32")
public static final String FIELDNAME_AssignedProducts_Classification="3f094e2e-7623-61e7-1b6d-16a8d5f81f32";

@XendraTrl(Identifier="0c3dbda3-2817-5ff8-d163-24a69d429934")
public static String es_PE_FIELD_ExpenseProduct_Classification_Name="Item de Producto";

@XendraTrl(Identifier="0c3dbda3-2817-5ff8-d163-24a69d429934")
public static String es_PE_FIELD_ExpenseProduct_Classification_Help="La clasificación puede ser usada para agrupar productos opcionalmente.";

@XendraTrl(Identifier="0c3dbda3-2817-5ff8-d163-24a69d429934")
public static String es_PE_FIELD_ExpenseProduct_Classification_Description="Clasificación para agrupaciones de productos";

@XendraField(AD_Column_ID="Classification",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0c3dbda3-2817-5ff8-d163-24a69d429934")
public static final String FIELDNAME_ExpenseProduct_Classification="0c3dbda3-2817-5ff8-d163-24a69d429934";

@XendraTrl(Identifier="faba62e6-3c90-dbf3-76b5-b39ebd669335")
public static String es_PE_FIELD_ResourceProduct_Classification_Name="Item de Producto";

@XendraTrl(Identifier="faba62e6-3c90-dbf3-76b5-b39ebd669335")
public static String es_PE_FIELD_ResourceProduct_Classification_Help="La clasificación puede ser usada para agrupar productos opcionalmente.";

@XendraTrl(Identifier="faba62e6-3c90-dbf3-76b5-b39ebd669335")
public static String es_PE_FIELD_ResourceProduct_Classification_Description="Clasificación para agrupaciones de productos";

@XendraField(AD_Column_ID="Classification",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="faba62e6-3c90-dbf3-76b5-b39ebd669335")
public static final String FIELDNAME_ResourceProduct_Classification="faba62e6-3c90-dbf3-76b5-b39ebd669335";

@XendraTrl(Identifier="834014ea-d0d8-8d0f-0fd9-43eb635e7f50")
public static String es_PE_FIELD_ProductDimension_Classification_Name="Item de Producto";

@XendraTrl(Identifier="834014ea-d0d8-8d0f-0fd9-43eb635e7f50")
public static String es_PE_FIELD_ProductDimension_Classification_Help="La clasificación puede ser usada para agrupar productos opcionalmente.";

@XendraTrl(Identifier="834014ea-d0d8-8d0f-0fd9-43eb635e7f50")
public static String es_PE_FIELD_ProductDimension_Classification_Description="Clasificación para agrupaciones de productos";

@XendraField(AD_Column_ID="Classification",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="834014ea-d0d8-8d0f-0fd9-43eb635e7f50")
public static final String FIELDNAME_ProductDimension_Classification="834014ea-d0d8-8d0f-0fd9-43eb635e7f50";

@XendraTrl(Identifier="c7d576d8-8716-bd5c-fe27-116c1c75ef42")
public static String es_PE_FIELD_SelectProduct_Classification_Name="Item de Producto";

@XendraTrl(Identifier="c7d576d8-8716-bd5c-fe27-116c1c75ef42")
public static String es_PE_FIELD_SelectProduct_Classification_Help="La clasificación puede ser usada para agrupar productos opcionalmente.";

@XendraTrl(Identifier="c7d576d8-8716-bd5c-fe27-116c1c75ef42")
public static String es_PE_FIELD_SelectProduct_Classification_Description="Clasificación para agrupaciones de productos";

@XendraField(AD_Column_ID="Classification",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c7d576d8-8716-bd5c-fe27-116c1c75ef42")
public static final String FIELDNAME_SelectProduct_Classification="c7d576d8-8716-bd5c-fe27-116c1c75ef42";

@XendraTrl(Identifier="a1b851dd-bf2b-2ca2-f6a0-1a04ad57a4a7")
public static String es_PE_FIELD_Product_Classification2_Name="Item de Producto";

@XendraTrl(Identifier="a1b851dd-bf2b-2ca2-f6a0-1a04ad57a4a7")
public static String es_PE_FIELD_Product_Classification2_Help="La clasificación puede ser usada para agrupar productos opcionalmente.";

@XendraTrl(Identifier="a1b851dd-bf2b-2ca2-f6a0-1a04ad57a4a7")
public static String es_PE_FIELD_Product_Classification2_Description="Clasificación para agrupaciones de productos";

@XendraField(AD_Column_ID="Classification",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a1b851dd-bf2b-2ca2-f6a0-1a04ad57a4a7")
public static final String FIELDNAME_Product_Classification2="a1b851dd-bf2b-2ca2-f6a0-1a04ad57a4a7";

@XendraTrl(Identifier="7564162a-730d-dfaa-f3fe-8401321c125a")
public static String es_PE_COLUMN_Classification_Name="Línea de Producto";

@XendraColumn(AD_Element_ID="3b3ad929-7cba-bd28-c1eb-6e8bac891ba7",ColumnName="Classification",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7564162a-730d-dfaa-f3fe-8401321c125a",
Synchronized="2022-04-26 19:23:02.0")
/** Column name Classification */
public static final String COLUMNNAME_Classification = "Classification";
/** Set Revenue Recognition.
@param C_RevenueRecognition_ID Method for recording revenue */
public void setC_RevenueRecognition_ID (int C_RevenueRecognition_ID)
{
if (C_RevenueRecognition_ID <= 0) set_Value (COLUMNNAME_C_RevenueRecognition_ID, null);
 else 
set_Value (COLUMNNAME_C_RevenueRecognition_ID, Integer.valueOf(C_RevenueRecognition_ID));
}
/** Get Revenue Recognition.
@return Method for recording revenue */
public int getC_RevenueRecognition_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_RevenueRecognition_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c0d0ebd4-a8f5-985d-d033-7f4c6e5fb853")
public static String es_PE_FIELD_Product_RevenueRecognition_Name="Reconocimiento de Ingreso";

@XendraTrl(Identifier="c0d0ebd4-a8f5-985d-d033-7f4c6e5fb853")
public static String es_PE_FIELD_Product_RevenueRecognition_Help="El Reconocimiento de Ingresos indica como los ingresos serán reconocidos para este producto.";

@XendraTrl(Identifier="c0d0ebd4-a8f5-985d-d033-7f4c6e5fb853")
public static String es_PE_FIELD_Product_RevenueRecognition_Description="Método para registro de ingresos";

@XendraField(AD_Column_ID="C_RevenueRecognition_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsSold@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c0d0ebd4-a8f5-985d-d033-7f4c6e5fb853")
public static final String FIELDNAME_Product_RevenueRecognition="c0d0ebd4-a8f5-985d-d033-7f4c6e5fb853";

@XendraTrl(Identifier="d08dc90f-2f56-9f89-f974-5c6ae6714b99")
public static String es_PE_FIELD_AssignedProducts_RevenueRecognition_Name="Reconocimiento de Ingreso";

@XendraTrl(Identifier="d08dc90f-2f56-9f89-f974-5c6ae6714b99")
public static String es_PE_FIELD_AssignedProducts_RevenueRecognition_Help="El Reconocimiento de Ingresos indica como los ingresos serán reconocidos para este producto.";

@XendraTrl(Identifier="d08dc90f-2f56-9f89-f974-5c6ae6714b99")
public static String es_PE_FIELD_AssignedProducts_RevenueRecognition_Description="Método para registro de ingresos";

@XendraField(AD_Column_ID="C_RevenueRecognition_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d08dc90f-2f56-9f89-f974-5c6ae6714b99")
public static final String FIELDNAME_AssignedProducts_RevenueRecognition="d08dc90f-2f56-9f89-f974-5c6ae6714b99";

@XendraTrl(Identifier="b9bbe6e7-df47-d284-a47f-93235e858e82")
public static String es_PE_FIELD_ExpenseProduct_RevenueRecognition_Name="Reconocimiento de Ingreso";

@XendraTrl(Identifier="b9bbe6e7-df47-d284-a47f-93235e858e82")
public static String es_PE_FIELD_ExpenseProduct_RevenueRecognition_Help="El Reconocimiento de Ingresos indica como los ingresos serán reconocidos para este producto.";

@XendraTrl(Identifier="b9bbe6e7-df47-d284-a47f-93235e858e82")
public static String es_PE_FIELD_ExpenseProduct_RevenueRecognition_Description="Método para registro de ingresos";

@XendraField(AD_Column_ID="C_RevenueRecognition_ID",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSold@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b9bbe6e7-df47-d284-a47f-93235e858e82")
public static final String FIELDNAME_ExpenseProduct_RevenueRecognition="b9bbe6e7-df47-d284-a47f-93235e858e82";

@XendraTrl(Identifier="daf2e12a-7c1a-07cb-5dc7-7a6625a548ac")
public static String es_PE_FIELD_ResourceProduct_RevenueRecognition_Name="Reconocimiento de Ingreso";

@XendraTrl(Identifier="daf2e12a-7c1a-07cb-5dc7-7a6625a548ac")
public static String es_PE_FIELD_ResourceProduct_RevenueRecognition_Help="El Reconocimiento de Ingresos indica como los ingresos serán reconocidos para este producto.";

@XendraTrl(Identifier="daf2e12a-7c1a-07cb-5dc7-7a6625a548ac")
public static String es_PE_FIELD_ResourceProduct_RevenueRecognition_Description="Método para registro de ingresos";

@XendraField(AD_Column_ID="C_RevenueRecognition_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSold@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="daf2e12a-7c1a-07cb-5dc7-7a6625a548ac")
public static final String FIELDNAME_ResourceProduct_RevenueRecognition="daf2e12a-7c1a-07cb-5dc7-7a6625a548ac";

@XendraTrl(Identifier="546372b2-e2ef-cc59-24dd-821fcc1c6500")
public static String es_PE_FIELD_ProductDimension_RevenueRecognition_Name="Reconocimiento de Ingreso";

@XendraTrl(Identifier="546372b2-e2ef-cc59-24dd-821fcc1c6500")
public static String es_PE_FIELD_ProductDimension_RevenueRecognition_Help="El Reconocimiento de Ingresos indica como los ingresos serán reconocidos para este producto.";

@XendraTrl(Identifier="546372b2-e2ef-cc59-24dd-821fcc1c6500")
public static String es_PE_FIELD_ProductDimension_RevenueRecognition_Description="Método para registro de ingresos";

@XendraField(AD_Column_ID="C_RevenueRecognition_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="546372b2-e2ef-cc59-24dd-821fcc1c6500")
public static final String FIELDNAME_ProductDimension_RevenueRecognition="546372b2-e2ef-cc59-24dd-821fcc1c6500";

@XendraTrl(Identifier="81dad54d-8624-9973-a070-89d6d283f0e7")
public static String es_PE_FIELD_SelectProduct_RevenueRecognition_Name="Reconocimiento de Ingreso";

@XendraTrl(Identifier="81dad54d-8624-9973-a070-89d6d283f0e7")
public static String es_PE_FIELD_SelectProduct_RevenueRecognition_Help="El Reconocimiento de Ingresos indica como los ingresos serán reconocidos para este producto.";

@XendraTrl(Identifier="81dad54d-8624-9973-a070-89d6d283f0e7")
public static String es_PE_FIELD_SelectProduct_RevenueRecognition_Description="Método para registro de ingresos";

@XendraField(AD_Column_ID="C_RevenueRecognition_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="81dad54d-8624-9973-a070-89d6d283f0e7")
public static final String FIELDNAME_SelectProduct_RevenueRecognition="81dad54d-8624-9973-a070-89d6d283f0e7";

@XendraTrl(Identifier="071f8543-02bf-37d9-d889-790e53e068b5")
public static String es_PE_FIELD_Product_RevenueRecognition2_Name="Reconocimiento de Ingreso";

@XendraTrl(Identifier="071f8543-02bf-37d9-d889-790e53e068b5")
public static String es_PE_FIELD_Product_RevenueRecognition2_Help="El Reconocimiento de Ingresos indica como los ingresos serán reconocidos para este producto.";

@XendraTrl(Identifier="071f8543-02bf-37d9-d889-790e53e068b5")
public static String es_PE_FIELD_Product_RevenueRecognition2_Description="Método para registro de ingresos";

@XendraField(AD_Column_ID="C_RevenueRecognition_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSold@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="071f8543-02bf-37d9-d889-790e53e068b5")
public static final String FIELDNAME_Product_RevenueRecognition2="071f8543-02bf-37d9-d889-790e53e068b5";

@XendraTrl(Identifier="ea2c1a39-4df8-95a0-3cc1-0f6a12f03c45")
public static String es_PE_COLUMN_C_RevenueRecognition_ID_Name="Reconocimiento de Ingreso";

@XendraColumn(AD_Element_ID="874c0d47-1c5f-9fc9-8805-0ba48ccc7cff",
ColumnName="C_RevenueRecognition_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ea2c1a39-4df8-95a0-3cc1-0f6a12f03c45",Synchronized="2022-04-26 19:23:02.0")
/** Column name C_RevenueRecognition_ID */
public static final String COLUMNNAME_C_RevenueRecognition_ID = "C_RevenueRecognition_ID";
/** Set Subscription Type.
@param C_SubscriptionType_ID Type of subscription */
public void setC_SubscriptionType_ID (int C_SubscriptionType_ID)
{
if (C_SubscriptionType_ID <= 0) set_Value (COLUMNNAME_C_SubscriptionType_ID, null);
 else 
set_Value (COLUMNNAME_C_SubscriptionType_ID, Integer.valueOf(C_SubscriptionType_ID));
}
/** Get Subscription Type.
@return Type of subscription */
public int getC_SubscriptionType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_SubscriptionType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9dc43a36-85f3-b52a-b71f-0c6abddd226e")
public static String es_PE_FIELD_Product_SubscriptionType_Name="Tipo de suscripción ";

@XendraTrl(Identifier="9dc43a36-85f3-b52a-b71f-0c6abddd226e")
public static String es_PE_FIELD_Product_SubscriptionType_Help="Tipo de suscripción y frecuencia de la renovación.";

@XendraTrl(Identifier="9dc43a36-85f3-b52a-b71f-0c6abddd226e")
public static String es_PE_FIELD_Product_SubscriptionType_Description="Tipo de suscripción ";

@XendraField(AD_Column_ID="C_SubscriptionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsSummary@='N'",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9dc43a36-85f3-b52a-b71f-0c6abddd226e")
public static final String FIELDNAME_Product_SubscriptionType="9dc43a36-85f3-b52a-b71f-0c6abddd226e";

@XendraTrl(Identifier="39437d40-65a3-f25b-c3a3-89618115e623")
public static String es_PE_FIELD_AssignedProducts_SubscriptionType_Name="Tipo de suscripción ";

@XendraTrl(Identifier="39437d40-65a3-f25b-c3a3-89618115e623")
public static String es_PE_FIELD_AssignedProducts_SubscriptionType_Help="Tipo de suscripción y frecuencia de la renovación.";

@XendraTrl(Identifier="39437d40-65a3-f25b-c3a3-89618115e623")
public static String es_PE_FIELD_AssignedProducts_SubscriptionType_Description="Tipo de suscripción ";

@XendraField(AD_Column_ID="C_SubscriptionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="39437d40-65a3-f25b-c3a3-89618115e623")
public static final String FIELDNAME_AssignedProducts_SubscriptionType="39437d40-65a3-f25b-c3a3-89618115e623";

@XendraTrl(Identifier="90dd8fca-3715-adf1-41a8-860d3c98a3a0")
public static String es_PE_FIELD_ExpenseProduct_SubscriptionType_Name="Tipo de suscripción ";

@XendraTrl(Identifier="90dd8fca-3715-adf1-41a8-860d3c98a3a0")
public static String es_PE_FIELD_ExpenseProduct_SubscriptionType_Help="Tipo de suscripción y frecuencia de la renovación.";

@XendraTrl(Identifier="90dd8fca-3715-adf1-41a8-860d3c98a3a0")
public static String es_PE_FIELD_ExpenseProduct_SubscriptionType_Description="Tipo de suscripción ";

@XendraField(AD_Column_ID="C_SubscriptionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="90dd8fca-3715-adf1-41a8-860d3c98a3a0")
public static final String FIELDNAME_ExpenseProduct_SubscriptionType="90dd8fca-3715-adf1-41a8-860d3c98a3a0";

@XendraTrl(Identifier="29cad1d6-895f-c4fd-ae88-24b389752deb")
public static String es_PE_FIELD_ResourceProduct_SubscriptionType_Name="Tipo de suscripción ";

@XendraTrl(Identifier="29cad1d6-895f-c4fd-ae88-24b389752deb")
public static String es_PE_FIELD_ResourceProduct_SubscriptionType_Help="Tipo de suscripción y frecuencia de la renovación.";

@XendraTrl(Identifier="29cad1d6-895f-c4fd-ae88-24b389752deb")
public static String es_PE_FIELD_ResourceProduct_SubscriptionType_Description="Tipo de suscripción ";

@XendraField(AD_Column_ID="C_SubscriptionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="29cad1d6-895f-c4fd-ae88-24b389752deb")
public static final String FIELDNAME_ResourceProduct_SubscriptionType="29cad1d6-895f-c4fd-ae88-24b389752deb";

@XendraTrl(Identifier="fc6ad80d-7767-c4eb-02c6-93f3a2f00715")
public static String es_PE_FIELD_ProductDimension_SubscriptionType_Name="Tipo de suscripción ";

@XendraTrl(Identifier="fc6ad80d-7767-c4eb-02c6-93f3a2f00715")
public static String es_PE_FIELD_ProductDimension_SubscriptionType_Help="Tipo de suscripción y frecuencia de la renovación.";

@XendraTrl(Identifier="fc6ad80d-7767-c4eb-02c6-93f3a2f00715")
public static String es_PE_FIELD_ProductDimension_SubscriptionType_Description="Tipo de suscripción ";

@XendraField(AD_Column_ID="C_SubscriptionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fc6ad80d-7767-c4eb-02c6-93f3a2f00715")
public static final String FIELDNAME_ProductDimension_SubscriptionType="fc6ad80d-7767-c4eb-02c6-93f3a2f00715";

@XendraTrl(Identifier="7f91ebde-7274-4b1c-8d45-cc20708bf0de")
public static String es_PE_FIELD_SelectProduct_SubscriptionType_Name="Tipo de suscripción ";

@XendraTrl(Identifier="7f91ebde-7274-4b1c-8d45-cc20708bf0de")
public static String es_PE_FIELD_SelectProduct_SubscriptionType_Help="Tipo de suscripción y frecuencia de la renovación.";

@XendraTrl(Identifier="7f91ebde-7274-4b1c-8d45-cc20708bf0de")
public static String es_PE_FIELD_SelectProduct_SubscriptionType_Description="Tipo de suscripción ";

@XendraField(AD_Column_ID="C_SubscriptionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7f91ebde-7274-4b1c-8d45-cc20708bf0de")
public static final String FIELDNAME_SelectProduct_SubscriptionType="7f91ebde-7274-4b1c-8d45-cc20708bf0de";

@XendraTrl(Identifier="dc8a75f1-b33f-a927-8e6b-b7af7b2ba1ba")
public static String es_PE_FIELD_Product_SubscriptionType2_Name="Tipo de suscripción ";

@XendraTrl(Identifier="dc8a75f1-b33f-a927-8e6b-b7af7b2ba1ba")
public static String es_PE_FIELD_Product_SubscriptionType2_Help="Tipo de suscripción y frecuencia de la renovación.";

@XendraTrl(Identifier="dc8a75f1-b33f-a927-8e6b-b7af7b2ba1ba")
public static String es_PE_FIELD_Product_SubscriptionType2_Description="Tipo de suscripción ";

@XendraField(AD_Column_ID="C_SubscriptionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dc8a75f1-b33f-a927-8e6b-b7af7b2ba1ba")
public static final String FIELDNAME_Product_SubscriptionType2="dc8a75f1-b33f-a927-8e6b-b7af7b2ba1ba";

@XendraTrl(Identifier="8432aea6-2852-cad1-c683-63641592daf1")
public static String es_PE_COLUMN_C_SubscriptionType_ID_Name="Tipo de suscripción ";

@XendraColumn(AD_Element_ID="680dfbf9-387a-19a6-3b56-a8ab812c2801",
ColumnName="C_SubscriptionType_ID",AD_Reference_ID=13,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8432aea6-2852-cad1-c683-63641592daf1",Synchronized="2022-04-26 19:23:02.0")
/** Column name C_SubscriptionType_ID */
public static final String COLUMNNAME_C_SubscriptionType_ID = "C_SubscriptionType_ID";
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

@XendraTrl(Identifier="99d106b6-0340-656d-99e9-b21f177f74ac")
public static String es_PE_FIELD_Product_TaxCategory_Name="Categoría del Impuesto";

@XendraTrl(Identifier="99d106b6-0340-656d-99e9-b21f177f74ac")
public static String es_PE_FIELD_Product_TaxCategory_Help="La categoría de impuesto proporciona un método de agrupación de impuestos similares. (Ej. Impuesto de ventas ó Impuesto al Valor Agregado)";

@XendraTrl(Identifier="99d106b6-0340-656d-99e9-b21f177f74ac")
public static String es_PE_FIELD_Product_TaxCategory_Description="Categoría del Impuesto";

@XendraField(AD_Column_ID="C_TaxCategory_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSold@='Y' | @IsPurchased@='Y' & @IsSummary@='N'",DisplayLength=14,
IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,
Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="99d106b6-0340-656d-99e9-b21f177f74ac")
public static final String FIELDNAME_Product_TaxCategory="99d106b6-0340-656d-99e9-b21f177f74ac";

@XendraTrl(Identifier="a462a87f-b668-dad0-1cb5-b78bb696c73d")
public static String es_PE_FIELD_AssignedProducts_TaxCategory_Name="Categoría del Impuesto";

@XendraTrl(Identifier="a462a87f-b668-dad0-1cb5-b78bb696c73d")
public static String es_PE_FIELD_AssignedProducts_TaxCategory_Help="La categoría de impuesto proporciona un método de agrupación de impuestos similares. (Ej. Impuesto de ventas ó Impuesto al Valor Agregado)";

@XendraTrl(Identifier="a462a87f-b668-dad0-1cb5-b78bb696c73d")
public static String es_PE_FIELD_AssignedProducts_TaxCategory_Description="Categoría del Impuesto";

@XendraField(AD_Column_ID="C_TaxCategory_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a462a87f-b668-dad0-1cb5-b78bb696c73d")
public static final String FIELDNAME_AssignedProducts_TaxCategory="a462a87f-b668-dad0-1cb5-b78bb696c73d";

@XendraTrl(Identifier="1f794719-bbb7-e876-6c3e-0aaa5927675d")
public static String es_PE_FIELD_ExpenseProduct_TaxCategory_Name="Categoría del Impuesto";

@XendraTrl(Identifier="1f794719-bbb7-e876-6c3e-0aaa5927675d")
public static String es_PE_FIELD_ExpenseProduct_TaxCategory_Help="La categoría de impuesto proporciona un método de agrupación de impuestos similares. (Ej. Impuesto de ventas ó Impuesto al Valor Agregado)";

@XendraTrl(Identifier="1f794719-bbb7-e876-6c3e-0aaa5927675d")
public static String es_PE_FIELD_ExpenseProduct_TaxCategory_Description="Categoría del Impuesto";

@XendraField(AD_Column_ID="C_TaxCategory_ID",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSold@='Y' | @IsPurchased@='Y' & @IsSummary@='N'",DisplayLength=14,
IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,
Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1f794719-bbb7-e876-6c3e-0aaa5927675d")
public static final String FIELDNAME_ExpenseProduct_TaxCategory="1f794719-bbb7-e876-6c3e-0aaa5927675d";

@XendraTrl(Identifier="605f2597-992d-f4a1-d36b-056f45f9fe66")
public static String es_PE_FIELD_ResourceProduct_TaxCategory_Name="Categoría del Impuesto";

@XendraTrl(Identifier="605f2597-992d-f4a1-d36b-056f45f9fe66")
public static String es_PE_FIELD_ResourceProduct_TaxCategory_Help="La categoría de impuesto proporciona un método de agrupación de impuestos similares. (Ej. Impuesto de ventas ó Impuesto al Valor Agregado)";

@XendraTrl(Identifier="605f2597-992d-f4a1-d36b-056f45f9fe66")
public static String es_PE_FIELD_ResourceProduct_TaxCategory_Description="Categoría del Impuesto";

@XendraField(AD_Column_ID="C_TaxCategory_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSold@='Y' | @IsPurchased@='Y' & @IsSummary@='N'",DisplayLength=14,
IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,
Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="605f2597-992d-f4a1-d36b-056f45f9fe66")
public static final String FIELDNAME_ResourceProduct_TaxCategory="605f2597-992d-f4a1-d36b-056f45f9fe66";

@XendraTrl(Identifier="1ef441cb-33b2-312c-d224-4797909e133d")
public static String es_PE_FIELD_ProductDimension_TaxCategory_Name="Categoría del Impuesto";

@XendraTrl(Identifier="1ef441cb-33b2-312c-d224-4797909e133d")
public static String es_PE_FIELD_ProductDimension_TaxCategory_Help="La categoría de impuesto proporciona un método de agrupación de impuestos similares. (Ej. Impuesto de ventas ó Impuesto al Valor Agregado)";

@XendraTrl(Identifier="1ef441cb-33b2-312c-d224-4797909e133d")
public static String es_PE_FIELD_ProductDimension_TaxCategory_Description="Categoría del Impuesto";

@XendraField(AD_Column_ID="C_TaxCategory_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1ef441cb-33b2-312c-d224-4797909e133d")
public static final String FIELDNAME_ProductDimension_TaxCategory="1ef441cb-33b2-312c-d224-4797909e133d";

@XendraTrl(Identifier="5b6d465e-51f0-c72f-7a1a-f236b3bdbc5f")
public static String es_PE_FIELD_SelectProduct_TaxCategory_Name="Categoría del Impuesto";

@XendraTrl(Identifier="5b6d465e-51f0-c72f-7a1a-f236b3bdbc5f")
public static String es_PE_FIELD_SelectProduct_TaxCategory_Help="La categoría de impuesto proporciona un método de agrupación de impuestos similares. (Ej. Impuesto de ventas ó Impuesto al Valor Agregado)";

@XendraTrl(Identifier="5b6d465e-51f0-c72f-7a1a-f236b3bdbc5f")
public static String es_PE_FIELD_SelectProduct_TaxCategory_Description="Categoría del Impuesto";

@XendraField(AD_Column_ID="C_TaxCategory_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5b6d465e-51f0-c72f-7a1a-f236b3bdbc5f")
public static final String FIELDNAME_SelectProduct_TaxCategory="5b6d465e-51f0-c72f-7a1a-f236b3bdbc5f";

@XendraTrl(Identifier="71213acc-5545-9d05-9b12-9ada087a6f0f")
public static String es_PE_FIELD_Product_TaxCategory2_Name="Categoría del Impuesto";

@XendraTrl(Identifier="71213acc-5545-9d05-9b12-9ada087a6f0f")
public static String es_PE_FIELD_Product_TaxCategory2_Help="La categoría de impuesto proporciona un método de agrupación de impuestos similares. (Ej. Impuesto de ventas ó Impuesto al Valor Agregado)";

@XendraTrl(Identifier="71213acc-5545-9d05-9b12-9ada087a6f0f")
public static String es_PE_FIELD_Product_TaxCategory2_Description="Categoría del Impuesto";

@XendraField(AD_Column_ID="C_TaxCategory_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSold@='Y' | @IsPurchased@='Y' & @IsSummary@='N'",DisplayLength=14,
IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,
Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="71213acc-5545-9d05-9b12-9ada087a6f0f")
public static final String FIELDNAME_Product_TaxCategory2="71213acc-5545-9d05-9b12-9ada087a6f0f";

@XendraTrl(Identifier="4e7b86a3-547a-7452-2cd9-ecbd55e9b22f")
public static String es_PE_COLUMN_C_TaxCategory_ID_Name="Categoría del Impuesto";

@XendraColumn(AD_Element_ID="d52d1891-09d1-cd05-f9fa-46c801a8d9a6",ColumnName="C_TaxCategory_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,
ReadOnlyLogic="@ProductType@=R | @ProductType@=E | @ProductType@=O",IsIdentifier=false,SeqNo=0,
IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",
IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4e7b86a3-547a-7452-2cd9-ecbd55e9b22f",Synchronized="2022-04-26 19:23:02.0")
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

@XendraTrl(Identifier="d519fc38-f447-58bb-7d0f-f888498b95ee")
public static String es_PE_FIELD_Product_UOM_Name="UM";

@XendraTrl(Identifier="d519fc38-f447-58bb-7d0f-f888498b95ee")
public static String es_PE_FIELD_Product_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraTrl(Identifier="d519fc38-f447-58bb-7d0f-f888498b95ee")
public static String es_PE_FIELD_Product_UOM_Description="Unidad de Medida";

@XendraField(AD_Column_ID="C_UOM_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d519fc38-f447-58bb-7d0f-f888498b95ee")
public static final String FIELDNAME_Product_UOM="d519fc38-f447-58bb-7d0f-f888498b95ee";

@XendraTrl(Identifier="27f35615-eb68-716e-8895-96f131072f31")
public static String es_PE_FIELD_AssignedProducts_UOM_Name="UM";

@XendraTrl(Identifier="27f35615-eb68-716e-8895-96f131072f31")
public static String es_PE_FIELD_AssignedProducts_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraTrl(Identifier="27f35615-eb68-716e-8895-96f131072f31")
public static String es_PE_FIELD_AssignedProducts_UOM_Description="Unidad de Medida";

@XendraField(AD_Column_ID="C_UOM_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="27f35615-eb68-716e-8895-96f131072f31")
public static final String FIELDNAME_AssignedProducts_UOM="27f35615-eb68-716e-8895-96f131072f31";

@XendraTrl(Identifier="b66e3894-14fd-d4ba-0c00-5e01fd909955")
public static String es_PE_FIELD_ExpenseProduct_UOM_Name="UM";

@XendraTrl(Identifier="b66e3894-14fd-d4ba-0c00-5e01fd909955")
public static String es_PE_FIELD_ExpenseProduct_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraTrl(Identifier="b66e3894-14fd-d4ba-0c00-5e01fd909955")
public static String es_PE_FIELD_ExpenseProduct_UOM_Description="Unidad de Medida";

@XendraField(AD_Column_ID="C_UOM_ID",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b66e3894-14fd-d4ba-0c00-5e01fd909955")
public static final String FIELDNAME_ExpenseProduct_UOM="b66e3894-14fd-d4ba-0c00-5e01fd909955";

@XendraTrl(Identifier="22175ceb-3088-a38a-269b-dc518260c9d1")
public static String es_PE_FIELD_ResourceProduct_UOM_Name="UM";

@XendraTrl(Identifier="22175ceb-3088-a38a-269b-dc518260c9d1")
public static String es_PE_FIELD_ResourceProduct_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraTrl(Identifier="22175ceb-3088-a38a-269b-dc518260c9d1")
public static String es_PE_FIELD_ResourceProduct_UOM_Description="Unidad de Medida";

@XendraField(AD_Column_ID="C_UOM_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="22175ceb-3088-a38a-269b-dc518260c9d1")
public static final String FIELDNAME_ResourceProduct_UOM="22175ceb-3088-a38a-269b-dc518260c9d1";

@XendraTrl(Identifier="d0a80076-bbee-4704-a5ed-e8ae3bb50d6a")
public static String es_PE_FIELD_ProductDimension_UOM_Name="UM";

@XendraTrl(Identifier="d0a80076-bbee-4704-a5ed-e8ae3bb50d6a")
public static String es_PE_FIELD_ProductDimension_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraTrl(Identifier="d0a80076-bbee-4704-a5ed-e8ae3bb50d6a")
public static String es_PE_FIELD_ProductDimension_UOM_Description="Unidad de Medida";

@XendraField(AD_Column_ID="C_UOM_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d0a80076-bbee-4704-a5ed-e8ae3bb50d6a")
public static final String FIELDNAME_ProductDimension_UOM="d0a80076-bbee-4704-a5ed-e8ae3bb50d6a";

@XendraTrl(Identifier="bf17c159-6811-ba10-0881-aa8a545af4b9")
public static String es_PE_FIELD_SelectProduct_UOM_Name="UM";

@XendraTrl(Identifier="bf17c159-6811-ba10-0881-aa8a545af4b9")
public static String es_PE_FIELD_SelectProduct_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraTrl(Identifier="bf17c159-6811-ba10-0881-aa8a545af4b9")
public static String es_PE_FIELD_SelectProduct_UOM_Description="Unidad de Medida";

@XendraField(AD_Column_ID="C_UOM_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bf17c159-6811-ba10-0881-aa8a545af4b9")
public static final String FIELDNAME_SelectProduct_UOM="bf17c159-6811-ba10-0881-aa8a545af4b9";

@XendraTrl(Identifier="6f834899-6f7e-23bf-7fea-b33d4ea4be6e")
public static String es_PE_FIELD_Product_UOM2_Name="UM";

@XendraTrl(Identifier="6f834899-6f7e-23bf-7fea-b33d4ea4be6e")
public static String es_PE_FIELD_Product_UOM2_Help="La UM define una unidad de medida única no monetaria";

@XendraTrl(Identifier="6f834899-6f7e-23bf-7fea-b33d4ea4be6e")
public static String es_PE_FIELD_Product_UOM2_Description="Unidad de Medida";

@XendraField(AD_Column_ID="C_UOM_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6f834899-6f7e-23bf-7fea-b33d4ea4be6e")
public static final String FIELDNAME_Product_UOM2="6f834899-6f7e-23bf-7fea-b33d4ea4be6e";

@XendraTrl(Identifier="f5d5df62-7f23-8b41-c0fd-7ce90e228d1f")
public static String es_PE_COLUMN_C_UOM_ID_Name="UM";

@XendraColumn(AD_Element_ID="d0345019-4fcc-44c8-4fd1-e38e3b4adeed",ColumnName="C_UOM_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,
ReadOnlyLogic="@ProductType@=R | @ProductType@=E | @ProductType@=O",IsIdentifier=false,SeqNo=0,
IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",
IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f5d5df62-7f23-8b41-c0fd-7ce90e228d1f",Synchronized="2022-04-26 19:23:02.0")
/** Column name C_UOM_ID */
public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
/** Set C_UOM_Order_ID.
@param C_UOM_Order_ID C_UOM_Order_ID */
public void setC_UOM_Order_ID (int C_UOM_Order_ID)
{
if (C_UOM_Order_ID <= 0) set_Value (COLUMNNAME_C_UOM_Order_ID, null);
 else 
set_Value (COLUMNNAME_C_UOM_Order_ID, Integer.valueOf(C_UOM_Order_ID));
}
/** Get C_UOM_Order_ID.
@return C_UOM_Order_ID */
public int getC_UOM_Order_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_UOM_Order_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="09bb9c7a-c7fd-60b3-22ef-9820580bae6b")
public static String es_PE_FIELD_Product_C_UOM_Order_ID_Name="UM de Compra";

@XendraField(AD_Column_ID="C_UOM_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="09bb9c7a-c7fd-60b3-22ef-9820580bae6b")
public static final String FIELDNAME_Product_C_UOM_Order_ID="09bb9c7a-c7fd-60b3-22ef-9820580bae6b";

@XendraTrl(Identifier="6a18f571-0891-1a22-ad78-e409b3ea92a3")
public static String es_PE_COLUMN_C_UOM_Order_ID_Name="C_UOM_Order_ID";

@XendraColumn(AD_Element_ID="8dad559d-70c3-631c-51c4-43be8c0c89b2",ColumnName="C_UOM_Order_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="723d7831-ccf2-1634-fe46-62dbc58e9a8e",
AD_Val_Rule_ID="107d46fd-952f-7ad3-6b0d-c74906c7b323",FieldLength=10,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6a18f571-0891-1a22-ad78-e409b3ea92a3",
Synchronized="2022-04-26 19:23:02.0")
/** Column name C_UOM_Order_ID */
public static final String COLUMNNAME_C_UOM_Order_ID = "C_UOM_Order_ID";
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

@XendraTrl(Identifier="be13c470-de37-2b36-c030-ae1ec0d6b03e")
public static String es_PE_FIELD_Product_Description_Name="Observación";

@XendraTrl(Identifier="be13c470-de37-2b36-c030-ae1ec0d6b03e")
public static String es_PE_FIELD_Product_Description_Help="Observación";

@XendraTrl(Identifier="be13c470-de37-2b36-c030-ae1ec0d6b03e")
public static String es_PE_FIELD_Product_Description_Description="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="be13c470-de37-2b36-c030-ae1ec0d6b03e")
public static final String FIELDNAME_Product_Description="be13c470-de37-2b36-c030-ae1ec0d6b03e";

@XendraTrl(Identifier="d65dccfb-b0cc-6e09-a409-e5ce41f61c28")
public static String es_PE_FIELD_AssignedProducts_Description_Name="Observación";

@XendraTrl(Identifier="d65dccfb-b0cc-6e09-a409-e5ce41f61c28")
public static String es_PE_FIELD_AssignedProducts_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="d65dccfb-b0cc-6e09-a409-e5ce41f61c28")
public static String es_PE_FIELD_AssignedProducts_Description_Description="Observación corta opcional del registro";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d65dccfb-b0cc-6e09-a409-e5ce41f61c28")
public static final String FIELDNAME_AssignedProducts_Description="d65dccfb-b0cc-6e09-a409-e5ce41f61c28";

@XendraTrl(Identifier="60238d7f-d491-1047-e53f-f1150b7fe419")
public static String es_PE_FIELD_ExpenseProduct_Description_Name="Observación";

@XendraTrl(Identifier="60238d7f-d491-1047-e53f-f1150b7fe419")
public static String es_PE_FIELD_ExpenseProduct_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="60238d7f-d491-1047-e53f-f1150b7fe419")
public static String es_PE_FIELD_ExpenseProduct_Description_Description="Observación corta opcional del registro";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="60238d7f-d491-1047-e53f-f1150b7fe419")
public static final String FIELDNAME_ExpenseProduct_Description="60238d7f-d491-1047-e53f-f1150b7fe419";

@XendraTrl(Identifier="1211be16-46a0-9c4a-3c98-9cec103a32d7")
public static String es_PE_FIELD_ResourceProduct_Description_Name="Observación";

@XendraTrl(Identifier="1211be16-46a0-9c4a-3c98-9cec103a32d7")
public static String es_PE_FIELD_ResourceProduct_Description_Help="Observación";

@XendraTrl(Identifier="1211be16-46a0-9c4a-3c98-9cec103a32d7")
public static String es_PE_FIELD_ResourceProduct_Description_Description="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1211be16-46a0-9c4a-3c98-9cec103a32d7")
public static final String FIELDNAME_ResourceProduct_Description="1211be16-46a0-9c4a-3c98-9cec103a32d7";

@XendraTrl(Identifier="ac34a134-efcb-e894-f8fc-849963a06cc8")
public static String es_PE_FIELD_ProductDimension_Description_Name="Observación";

@XendraTrl(Identifier="ac34a134-efcb-e894-f8fc-849963a06cc8")
public static String es_PE_FIELD_ProductDimension_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="ac34a134-efcb-e894-f8fc-849963a06cc8")
public static String es_PE_FIELD_ProductDimension_Description_Description="Observación corta opcional del registro";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ac34a134-efcb-e894-f8fc-849963a06cc8")
public static final String FIELDNAME_ProductDimension_Description="ac34a134-efcb-e894-f8fc-849963a06cc8";

@XendraTrl(Identifier="08c5e8b1-bb0d-8f50-e90b-b62971fb5cfc")
public static String es_PE_FIELD_SelectProduct_Description_Name="Observación";

@XendraTrl(Identifier="08c5e8b1-bb0d-8f50-e90b-b62971fb5cfc")
public static String es_PE_FIELD_SelectProduct_Description_Help="Observación";

@XendraTrl(Identifier="08c5e8b1-bb0d-8f50-e90b-b62971fb5cfc")
public static String es_PE_FIELD_SelectProduct_Description_Description="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="08c5e8b1-bb0d-8f50-e90b-b62971fb5cfc")
public static final String FIELDNAME_SelectProduct_Description="08c5e8b1-bb0d-8f50-e90b-b62971fb5cfc";

@XendraTrl(Identifier="bc38deb2-6b82-4b04-ff42-9907e92a5b87")
public static String es_PE_FIELD_Product_Description2_Name="Observación";

@XendraTrl(Identifier="bc38deb2-6b82-4b04-ff42-9907e92a5b87")
public static String es_PE_FIELD_Product_Description2_Help="Observación";

@XendraTrl(Identifier="bc38deb2-6b82-4b04-ff42-9907e92a5b87")
public static String es_PE_FIELD_Product_Description2_Description="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bc38deb2-6b82-4b04-ff42-9907e92a5b87")
public static final String FIELDNAME_Product_Description2="bc38deb2-6b82-4b04-ff42-9907e92a5b87";

@XendraTrl(Identifier="96fbe46f-b22e-fce0-356d-c7ee1acc1c04")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@ProductType@=R | @ProductType@=E | @ProductType@=O",IsIdentifier=false,SeqNo=0,
IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,
AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="96fbe46f-b22e-fce0-356d-c7ee1acc1c04",Synchronized="2022-04-26 19:23:02.0")
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
@XendraTrl(Identifier="f9f6fd86-3049-ab52-d028-df070fa5a37e")
public static String es_PE_FIELD_Product_DescriptionURL_Name="Descripción URL";

@XendraTrl(Identifier="f9f6fd86-3049-ab52-d028-df070fa5a37e")
public static String es_PE_FIELD_Product_DescriptionURL_Description="Descripción de la URL";

@XendraField(AD_Column_ID="DescriptionURL",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N'",DisplayLength=20,IsReadOnly=false,SeqNo=390,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f9f6fd86-3049-ab52-d028-df070fa5a37e")
public static final String FIELDNAME_Product_DescriptionURL="f9f6fd86-3049-ab52-d028-df070fa5a37e";

@XendraTrl(Identifier="b030098f-9140-0406-4156-b73a1bc20ac4")
public static String es_PE_FIELD_AssignedProducts_DescriptionURL_Name="Descripción URL";

@XendraTrl(Identifier="b030098f-9140-0406-4156-b73a1bc20ac4")
public static String es_PE_FIELD_AssignedProducts_DescriptionURL_Description="Descripción de la URL";

@XendraField(AD_Column_ID="DescriptionURL",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b030098f-9140-0406-4156-b73a1bc20ac4")
public static final String FIELDNAME_AssignedProducts_DescriptionURL="b030098f-9140-0406-4156-b73a1bc20ac4";

@XendraTrl(Identifier="60641d31-e1f9-7bba-e2da-a43a6eaa6971")
public static String es_PE_FIELD_ExpenseProduct_DescriptionURL_Name="Descripción URL";

@XendraTrl(Identifier="60641d31-e1f9-7bba-e2da-a43a6eaa6971")
public static String es_PE_FIELD_ExpenseProduct_DescriptionURL_Description="Descripción de la URL";

@XendraField(AD_Column_ID="DescriptionURL",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="60641d31-e1f9-7bba-e2da-a43a6eaa6971")
public static final String FIELDNAME_ExpenseProduct_DescriptionURL="60641d31-e1f9-7bba-e2da-a43a6eaa6971";

@XendraTrl(Identifier="7084b8a8-8700-6d82-d8bf-112c487b2b1f")
public static String es_PE_FIELD_ResourceProduct_DescriptionURL_Name="Descripción URL";

@XendraTrl(Identifier="7084b8a8-8700-6d82-d8bf-112c487b2b1f")
public static String es_PE_FIELD_ResourceProduct_DescriptionURL_Description="Descripción de la URL";

@XendraField(AD_Column_ID="DescriptionURL",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7084b8a8-8700-6d82-d8bf-112c487b2b1f")
public static final String FIELDNAME_ResourceProduct_DescriptionURL="7084b8a8-8700-6d82-d8bf-112c487b2b1f";

@XendraTrl(Identifier="792a7bf1-f590-4db1-a51a-18a46ab57dae")
public static String es_PE_FIELD_ProductDimension_DescriptionURL_Name="Descripción URL";

@XendraTrl(Identifier="792a7bf1-f590-4db1-a51a-18a46ab57dae")
public static String es_PE_FIELD_ProductDimension_DescriptionURL_Description="Descripción de la URL";

@XendraField(AD_Column_ID="DescriptionURL",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="792a7bf1-f590-4db1-a51a-18a46ab57dae")
public static final String FIELDNAME_ProductDimension_DescriptionURL="792a7bf1-f590-4db1-a51a-18a46ab57dae";

@XendraTrl(Identifier="769842f3-fddf-e8d7-0c05-199175434c3d")
public static String es_PE_FIELD_SelectProduct_DescriptionURL_Name="Descripción URL";

@XendraTrl(Identifier="769842f3-fddf-e8d7-0c05-199175434c3d")
public static String es_PE_FIELD_SelectProduct_DescriptionURL_Description="Descripción de la URL";

@XendraField(AD_Column_ID="DescriptionURL",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="769842f3-fddf-e8d7-0c05-199175434c3d")
public static final String FIELDNAME_SelectProduct_DescriptionURL="769842f3-fddf-e8d7-0c05-199175434c3d";

@XendraTrl(Identifier="72f34d9a-b528-c74b-7949-4755894e7f1b")
public static String es_PE_FIELD_Product_DescriptionURL2_Name="Descripción URL";

@XendraTrl(Identifier="72f34d9a-b528-c74b-7949-4755894e7f1b")
public static String es_PE_FIELD_Product_DescriptionURL2_Description="Descripción de la URL";

@XendraField(AD_Column_ID="DescriptionURL",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=410,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="72f34d9a-b528-c74b-7949-4755894e7f1b")
public static final String FIELDNAME_Product_DescriptionURL2="72f34d9a-b528-c74b-7949-4755894e7f1b";

@XendraTrl(Identifier="155eb3ff-a360-618c-6b9d-4e5d0efde138")
public static String es_PE_COLUMN_DescriptionURL_Name="Descripción URL";

@XendraColumn(AD_Element_ID="22f9040f-e220-0cf5-b1a0-c26babbe91f1",ColumnName="DescriptionURL",
AD_Reference_ID=40,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="155eb3ff-a360-618c-6b9d-4e5d0efde138",
Synchronized="2022-04-26 19:23:02.0")
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

@XendraTrl(Identifier="5b245f28-3f13-369a-f3d0-79524facb505")
public static String es_PE_FIELD_Product_Discontinued_Name="Suspendido";

@XendraTrl(Identifier="5b245f28-3f13-369a-f3d0-79524facb505")
public static String es_PE_FIELD_Product_Discontinued_Help="El cuadro de verificación descontinuado indica un producto que ha sido descontinuado.";

@XendraTrl(Identifier="5b245f28-3f13-369a-f3d0-79524facb505")
public static String es_PE_FIELD_Product_Discontinued_Description="Este registro no está disponible";

@XendraField(AD_Column_ID="Discontinued",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsSummary@='N'",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5b245f28-3f13-369a-f3d0-79524facb505")
public static final String FIELDNAME_Product_Discontinued="5b245f28-3f13-369a-f3d0-79524facb505";

@XendraTrl(Identifier="4007ee7e-1cf4-aa80-e8d5-6824ebf6d7d1")
public static String es_PE_FIELD_AssignedProducts_Discontinued_Name="Suspendido";

@XendraTrl(Identifier="4007ee7e-1cf4-aa80-e8d5-6824ebf6d7d1")
public static String es_PE_FIELD_AssignedProducts_Discontinued_Help="El cuadro de verificación descontinuado indica un producto que ha sido descontinuado.";

@XendraTrl(Identifier="4007ee7e-1cf4-aa80-e8d5-6824ebf6d7d1")
public static String es_PE_FIELD_AssignedProducts_Discontinued_Description="Este registro no está disponible";

@XendraField(AD_Column_ID="Discontinued",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4007ee7e-1cf4-aa80-e8d5-6824ebf6d7d1")
public static final String FIELDNAME_AssignedProducts_Discontinued="4007ee7e-1cf4-aa80-e8d5-6824ebf6d7d1";

@XendraTrl(Identifier="022bf94c-493f-4813-1538-3585addb58a8")
public static String es_PE_FIELD_ExpenseProduct_Discontinued_Name="Suspendido";

@XendraTrl(Identifier="022bf94c-493f-4813-1538-3585addb58a8")
public static String es_PE_FIELD_ExpenseProduct_Discontinued_Help="El cuadro de verificación descontinuado indica un producto que ha sido descontinuado.";

@XendraTrl(Identifier="022bf94c-493f-4813-1538-3585addb58a8")
public static String es_PE_FIELD_ExpenseProduct_Discontinued_Description="Este registro no está disponible";

@XendraField(AD_Column_ID="Discontinued",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N'",DisplayLength=1,IsReadOnly=false,SeqNo=210,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="022bf94c-493f-4813-1538-3585addb58a8")
public static final String FIELDNAME_ExpenseProduct_Discontinued="022bf94c-493f-4813-1538-3585addb58a8";

@XendraTrl(Identifier="c1770e3a-363c-3382-8f44-087bfd5e1c38")
public static String es_PE_FIELD_ResourceProduct_Discontinued_Name="Suspendido";

@XendraTrl(Identifier="c1770e3a-363c-3382-8f44-087bfd5e1c38")
public static String es_PE_FIELD_ResourceProduct_Discontinued_Help="El cuadro de verificación descontinuado indica un producto que ha sido descontinuado.";

@XendraTrl(Identifier="c1770e3a-363c-3382-8f44-087bfd5e1c38")
public static String es_PE_FIELD_ResourceProduct_Discontinued_Description="Este registro no está disponible";

@XendraField(AD_Column_ID="Discontinued",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N'",DisplayLength=1,IsReadOnly=false,SeqNo=210,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c1770e3a-363c-3382-8f44-087bfd5e1c38")
public static final String FIELDNAME_ResourceProduct_Discontinued="c1770e3a-363c-3382-8f44-087bfd5e1c38";

@XendraTrl(Identifier="4a81a9b1-538a-c56c-6f93-e7fc5ba4d3ef")
public static String es_PE_FIELD_ProductDimension_Discontinued_Name="Suspendido";

@XendraTrl(Identifier="4a81a9b1-538a-c56c-6f93-e7fc5ba4d3ef")
public static String es_PE_FIELD_ProductDimension_Discontinued_Help="El cuadro de verificación descontinuado indica un producto que ha sido descontinuado.";

@XendraTrl(Identifier="4a81a9b1-538a-c56c-6f93-e7fc5ba4d3ef")
public static String es_PE_FIELD_ProductDimension_Discontinued_Description="Este registro no está disponible";

@XendraField(AD_Column_ID="Discontinued",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4a81a9b1-538a-c56c-6f93-e7fc5ba4d3ef")
public static final String FIELDNAME_ProductDimension_Discontinued="4a81a9b1-538a-c56c-6f93-e7fc5ba4d3ef";

@XendraTrl(Identifier="867dc65c-2569-265b-2893-850140ae60d5")
public static String es_PE_FIELD_SelectProduct_Discontinued_Name="Suspendido";

@XendraTrl(Identifier="867dc65c-2569-265b-2893-850140ae60d5")
public static String es_PE_FIELD_SelectProduct_Discontinued_Help="El cuadro de verificación descontinuado indica un producto que ha sido descontinuado.";

@XendraTrl(Identifier="867dc65c-2569-265b-2893-850140ae60d5")
public static String es_PE_FIELD_SelectProduct_Discontinued_Description="Este registro no está disponible";

@XendraField(AD_Column_ID="Discontinued",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="867dc65c-2569-265b-2893-850140ae60d5")
public static final String FIELDNAME_SelectProduct_Discontinued="867dc65c-2569-265b-2893-850140ae60d5";

@XendraTrl(Identifier="6364942d-89c7-3f5a-4b81-60e5d8500be8")
public static String es_PE_FIELD_Product_Discontinued2_Name="Suspendido";

@XendraTrl(Identifier="6364942d-89c7-3f5a-4b81-60e5d8500be8")
public static String es_PE_FIELD_Product_Discontinued2_Help="El cuadro de verificación descontinuado indica un producto que ha sido descontinuado.";

@XendraTrl(Identifier="6364942d-89c7-3f5a-4b81-60e5d8500be8")
public static String es_PE_FIELD_Product_Discontinued2_Description="Este registro no está disponible";

@XendraField(AD_Column_ID="Discontinued",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N'",DisplayLength=1,IsReadOnly=false,SeqNo=380,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="6364942d-89c7-3f5a-4b81-60e5d8500be8")
public static final String FIELDNAME_Product_Discontinued2="6364942d-89c7-3f5a-4b81-60e5d8500be8";

@XendraTrl(Identifier="567b2ea0-303e-5d25-0e8c-4b3e5e00b0a8")
public static String es_PE_COLUMN_Discontinued_Name="Suspendido";

@XendraColumn(AD_Element_ID="d1d87912-d08c-5658-dda1-868e7beda7fb",ColumnName="Discontinued",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="567b2ea0-303e-5d25-0e8c-4b3e5e00b0a8",
Synchronized="2022-04-26 19:23:02.0")
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

@XendraTrl(Identifier="9950f036-3b48-546a-2067-bb982f14c20b")
public static String es_PE_FIELD_Product_DiscontinuedBy_Name="Suspendido Por";

@XendraTrl(Identifier="9950f036-3b48-546a-2067-bb982f14c20b")
public static String es_PE_FIELD_Product_DiscontinuedBy_Help="El suspendido por indica el individuo que suspendió este producto.";

@XendraTrl(Identifier="9950f036-3b48-546a-2067-bb982f14c20b")
public static String es_PE_FIELD_Product_DiscontinuedBy_Description="Descontinuado Por";

@XendraField(AD_Column_ID="DiscontinuedBy",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsSummary@='N' & @Discontinued@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=0,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="9950f036-3b48-546a-2067-bb982f14c20b")
public static final String FIELDNAME_Product_DiscontinuedBy="9950f036-3b48-546a-2067-bb982f14c20b";

@XendraTrl(Identifier="076a9838-6757-17bc-b86c-81b4fee71fa2")
public static String es_PE_FIELD_AssignedProducts_DiscontinuedBy_Name="Suspendido Por";

@XendraTrl(Identifier="076a9838-6757-17bc-b86c-81b4fee71fa2")
public static String es_PE_FIELD_AssignedProducts_DiscontinuedBy_Help="El suspendido por indica el individuo que suspendió este producto.";

@XendraTrl(Identifier="076a9838-6757-17bc-b86c-81b4fee71fa2")
public static String es_PE_FIELD_AssignedProducts_DiscontinuedBy_Description="Descontinuado Por";

@XendraField(AD_Column_ID="DiscontinuedBy",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="076a9838-6757-17bc-b86c-81b4fee71fa2")
public static final String FIELDNAME_AssignedProducts_DiscontinuedBy="076a9838-6757-17bc-b86c-81b4fee71fa2";

@XendraTrl(Identifier="f64ecb50-d091-bc2a-6ba4-9d47c7048f13")
public static String es_PE_FIELD_ExpenseProduct_DiscontinuedBy_Name="Suspendido Por";

@XendraTrl(Identifier="f64ecb50-d091-bc2a-6ba4-9d47c7048f13")
public static String es_PE_FIELD_ExpenseProduct_DiscontinuedBy_Help="El suspendido por indica el individuo que suspendió este producto.";

@XendraTrl(Identifier="f64ecb50-d091-bc2a-6ba4-9d47c7048f13")
public static String es_PE_FIELD_ExpenseProduct_DiscontinuedBy_Description="Descontinuado Por";

@XendraField(AD_Column_ID="DiscontinuedBy",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N' & @Discontinued@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=220,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f64ecb50-d091-bc2a-6ba4-9d47c7048f13")
public static final String FIELDNAME_ExpenseProduct_DiscontinuedBy="f64ecb50-d091-bc2a-6ba4-9d47c7048f13";

@XendraTrl(Identifier="13c2ac80-bbec-9374-1040-8cb771309647")
public static String es_PE_FIELD_ResourceProduct_DiscontinuedBy_Name="Suspendido Por";

@XendraTrl(Identifier="13c2ac80-bbec-9374-1040-8cb771309647")
public static String es_PE_FIELD_ResourceProduct_DiscontinuedBy_Help="El suspendido por indica el individuo que suspendió este producto.";

@XendraTrl(Identifier="13c2ac80-bbec-9374-1040-8cb771309647")
public static String es_PE_FIELD_ResourceProduct_DiscontinuedBy_Description="Descontinuado Por";

@XendraField(AD_Column_ID="DiscontinuedBy",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N' & @Discontinued@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=220,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="13c2ac80-bbec-9374-1040-8cb771309647")
public static final String FIELDNAME_ResourceProduct_DiscontinuedBy="13c2ac80-bbec-9374-1040-8cb771309647";

@XendraTrl(Identifier="339f6a9f-106d-5b11-c089-b5bfe98ded75")
public static String es_PE_FIELD_ProductDimension_DiscontinuedBy_Name="Suspendido Por";

@XendraTrl(Identifier="339f6a9f-106d-5b11-c089-b5bfe98ded75")
public static String es_PE_FIELD_ProductDimension_DiscontinuedBy_Help="El suspendido por indica el individuo que suspendió este producto.";

@XendraTrl(Identifier="339f6a9f-106d-5b11-c089-b5bfe98ded75")
public static String es_PE_FIELD_ProductDimension_DiscontinuedBy_Description="Descontinuado Por";

@XendraField(AD_Column_ID="DiscontinuedBy",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="339f6a9f-106d-5b11-c089-b5bfe98ded75")
public static final String FIELDNAME_ProductDimension_DiscontinuedBy="339f6a9f-106d-5b11-c089-b5bfe98ded75";

@XendraTrl(Identifier="e877c67c-b2a5-ad19-4d26-f10fe393d3f3")
public static String es_PE_FIELD_SelectProduct_DiscontinuedBy_Name="Suspendido Por";

@XendraTrl(Identifier="e877c67c-b2a5-ad19-4d26-f10fe393d3f3")
public static String es_PE_FIELD_SelectProduct_DiscontinuedBy_Help="El suspendido por indica el individuo que suspendió este producto.";

@XendraTrl(Identifier="e877c67c-b2a5-ad19-4d26-f10fe393d3f3")
public static String es_PE_FIELD_SelectProduct_DiscontinuedBy_Description="Descontinuado Por";

@XendraField(AD_Column_ID="DiscontinuedBy",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e877c67c-b2a5-ad19-4d26-f10fe393d3f3")
public static final String FIELDNAME_SelectProduct_DiscontinuedBy="e877c67c-b2a5-ad19-4d26-f10fe393d3f3";

@XendraTrl(Identifier="e3dddbc1-b973-50e7-b4ce-acce3ed6f719")
public static String es_PE_FIELD_Product_DiscontinuedBy2_Name="Suspendido Por";

@XendraTrl(Identifier="e3dddbc1-b973-50e7-b4ce-acce3ed6f719")
public static String es_PE_FIELD_Product_DiscontinuedBy2_Help="El suspendido por indica el individuo que suspendió este producto.";

@XendraTrl(Identifier="e3dddbc1-b973-50e7-b4ce-acce3ed6f719")
public static String es_PE_FIELD_Product_DiscontinuedBy2_Description="Descontinuado Por";

@XendraField(AD_Column_ID="DiscontinuedBy",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N' & @Discontinued@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=390,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="e3dddbc1-b973-50e7-b4ce-acce3ed6f719")
public static final String FIELDNAME_Product_DiscontinuedBy2="e3dddbc1-b973-50e7-b4ce-acce3ed6f719";

@XendraTrl(Identifier="0817f907-0714-156f-4273-9d2b2294090d")
public static String es_PE_COLUMN_DiscontinuedBy_Name="Suspendido Por";

@XendraColumn(AD_Element_ID="27a2ca99-0516-37b9-6667-e8a6634b9141",ColumnName="DiscontinuedBy",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0817f907-0714-156f-4273-9d2b2294090d",
Synchronized="2022-04-26 19:23:02.0")
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
@XendraTrl(Identifier="df715a1b-1877-6d00-dcb4-1db22b319c4b")
public static String es_PE_FIELD_Product_DocumentNote_Name="Nota de Documento";

@XendraTrl(Identifier="df715a1b-1877-6d00-dcb4-1db22b319c4b")
public static String es_PE_FIELD_Product_DocumentNote_Help="La nota de documento se usa para registrar cualquier información adicional considerando este producto.";

@XendraTrl(Identifier="df715a1b-1877-6d00-dcb4-1db22b319c4b")
public static String es_PE_FIELD_Product_DocumentNote_Description="Información adicional para un documento";

@XendraField(AD_Column_ID="DocumentNote",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="df715a1b-1877-6d00-dcb4-1db22b319c4b")
public static final String FIELDNAME_Product_DocumentNote="df715a1b-1877-6d00-dcb4-1db22b319c4b";

@XendraTrl(Identifier="bae76c86-8dc0-56f2-e9fd-8afa3f8202bb")
public static String es_PE_FIELD_AssignedProducts_DocumentNote_Name="Nota de Documento";

@XendraTrl(Identifier="bae76c86-8dc0-56f2-e9fd-8afa3f8202bb")
public static String es_PE_FIELD_AssignedProducts_DocumentNote_Help="La nota de documento se usa para registrar cualquier información adicional considerando este producto.";

@XendraTrl(Identifier="bae76c86-8dc0-56f2-e9fd-8afa3f8202bb")
public static String es_PE_FIELD_AssignedProducts_DocumentNote_Description="Información adicional para un documento";

@XendraField(AD_Column_ID="DocumentNote",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bae76c86-8dc0-56f2-e9fd-8afa3f8202bb")
public static final String FIELDNAME_AssignedProducts_DocumentNote="bae76c86-8dc0-56f2-e9fd-8afa3f8202bb";

@XendraTrl(Identifier="3fdaf50b-51c7-58cb-aaf1-7034bae4bc66")
public static String es_PE_FIELD_ExpenseProduct_DocumentNote_Name="Nota de Documento";

@XendraTrl(Identifier="3fdaf50b-51c7-58cb-aaf1-7034bae4bc66")
public static String es_PE_FIELD_ExpenseProduct_DocumentNote_Help="La nota de documento se usa para registrar cualquier información adicional considerando este producto.";

@XendraTrl(Identifier="3fdaf50b-51c7-58cb-aaf1-7034bae4bc66")
public static String es_PE_FIELD_ExpenseProduct_DocumentNote_Description="Información adicional para un documento";

@XendraField(AD_Column_ID="DocumentNote",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3fdaf50b-51c7-58cb-aaf1-7034bae4bc66")
public static final String FIELDNAME_ExpenseProduct_DocumentNote="3fdaf50b-51c7-58cb-aaf1-7034bae4bc66";

@XendraTrl(Identifier="8e886312-714e-c05f-d549-6a65a05da256")
public static String es_PE_FIELD_ResourceProduct_DocumentNote_Name="Nota de Documento";

@XendraTrl(Identifier="8e886312-714e-c05f-d549-6a65a05da256")
public static String es_PE_FIELD_ResourceProduct_DocumentNote_Help="La nota de documento se usa para registrar cualquier información adicional considerando este producto.";

@XendraTrl(Identifier="8e886312-714e-c05f-d549-6a65a05da256")
public static String es_PE_FIELD_ResourceProduct_DocumentNote_Description="Información adicional para un documento";

@XendraField(AD_Column_ID="DocumentNote",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8e886312-714e-c05f-d549-6a65a05da256")
public static final String FIELDNAME_ResourceProduct_DocumentNote="8e886312-714e-c05f-d549-6a65a05da256";

@XendraTrl(Identifier="7c20ffcc-5d89-1e23-9fd1-ac6853c33418")
public static String es_PE_FIELD_ProductDimension_DocumentNote_Name="Nota de Documento";

@XendraTrl(Identifier="7c20ffcc-5d89-1e23-9fd1-ac6853c33418")
public static String es_PE_FIELD_ProductDimension_DocumentNote_Help="La nota de documento se usa para registrar cualquier información adicional considerando este producto.";

@XendraTrl(Identifier="7c20ffcc-5d89-1e23-9fd1-ac6853c33418")
public static String es_PE_FIELD_ProductDimension_DocumentNote_Description="Información adicional para un documento";

@XendraField(AD_Column_ID="DocumentNote",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7c20ffcc-5d89-1e23-9fd1-ac6853c33418")
public static final String FIELDNAME_ProductDimension_DocumentNote="7c20ffcc-5d89-1e23-9fd1-ac6853c33418";

@XendraTrl(Identifier="3e64972e-ecec-bcae-b856-3799eb245fed")
public static String es_PE_FIELD_SelectProduct_DocumentNote_Name="Nota de Documento";

@XendraTrl(Identifier="3e64972e-ecec-bcae-b856-3799eb245fed")
public static String es_PE_FIELD_SelectProduct_DocumentNote_Help="La nota de documento se usa para registrar cualquier información adicional considerando este producto.";

@XendraTrl(Identifier="3e64972e-ecec-bcae-b856-3799eb245fed")
public static String es_PE_FIELD_SelectProduct_DocumentNote_Description="Información adicional para un documento";

@XendraField(AD_Column_ID="DocumentNote",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3e64972e-ecec-bcae-b856-3799eb245fed")
public static final String FIELDNAME_SelectProduct_DocumentNote="3e64972e-ecec-bcae-b856-3799eb245fed";

@XendraTrl(Identifier="80051a73-e930-c3f3-91bc-a9a6c2d16e19")
public static String es_PE_FIELD_Product_DocumentNote2_Name="Nota de Documento";

@XendraTrl(Identifier="80051a73-e930-c3f3-91bc-a9a6c2d16e19")
public static String es_PE_FIELD_Product_DocumentNote2_Help="La nota de documento se usa para registrar cualquier información adicional considerando este producto.";

@XendraTrl(Identifier="80051a73-e930-c3f3-91bc-a9a6c2d16e19")
public static String es_PE_FIELD_Product_DocumentNote2_Description="Información adicional para un documento";

@XendraField(AD_Column_ID="DocumentNote",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="80051a73-e930-c3f3-91bc-a9a6c2d16e19")
public static final String FIELDNAME_Product_DocumentNote2="80051a73-e930-c3f3-91bc-a9a6c2d16e19";

@XendraTrl(Identifier="1cb10902-ace0-593f-fdfb-81b6c9762582")
public static String es_PE_COLUMN_DocumentNote_Name="Nota de Documento";

@XendraColumn(AD_Element_ID="facce503-36ce-65e5-ad96-c872503feb2e",ColumnName="DocumentNote",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1cb10902-ace0-593f-fdfb-81b6c9762582",
Synchronized="2022-04-26 19:23:02.0")
/** Column name DocumentNote */
public static final String COLUMNNAME_DocumentNote = "DocumentNote";
/** Set Guarantee Days.
@param GuaranteeDays Number of days the product is guaranteed or available */
public void setGuaranteeDays (int GuaranteeDays)
{
set_Value (COLUMNNAME_GuaranteeDays, Integer.valueOf(GuaranteeDays));
}
/** Get Guarantee Days.
@return Number of days the product is guaranteed or available */
public int getGuaranteeDays() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_GuaranteeDays);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="18f46e73-bef3-ee3c-7469-6fc7a1b3a5da")
public static String es_PE_FIELD_Product_GuaranteeDays_Name="Días de Caducidad";

@XendraTrl(Identifier="18f46e73-bef3-ee3c-7469-6fc7a1b3a5da")
public static String es_PE_FIELD_Product_GuaranteeDays_Help="Si el valor es 0, no hay límite a la disponibilidad ó garantía, si no la fecha de la garantía es calculada agregando los días a la fecha de entrega.";

@XendraTrl(Identifier="18f46e73-bef3-ee3c-7469-6fc7a1b3a5da")
public static String es_PE_FIELD_Product_GuaranteeDays_Description="Número de días que el producto está garantizado ó disponible";

@XendraField(AD_Column_ID="GuaranteeDays",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N'",DisplayLength=11,IsReadOnly=false,SeqNo=400,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="18f46e73-bef3-ee3c-7469-6fc7a1b3a5da")
public static final String FIELDNAME_Product_GuaranteeDays="18f46e73-bef3-ee3c-7469-6fc7a1b3a5da";

@XendraTrl(Identifier="f72f2725-9728-bf0b-249a-66eeaa4f9a0b")
public static String es_PE_FIELD_AssignedProducts_GuaranteeDays_Name="Días de Caducidad";

@XendraTrl(Identifier="f72f2725-9728-bf0b-249a-66eeaa4f9a0b")
public static String es_PE_FIELD_AssignedProducts_GuaranteeDays_Help="Si el valor es 0, no hay límite a la disponibilidad ó garantía, si no la fecha de la garantía es calculada agregando los días a la fecha de entrega.";

@XendraTrl(Identifier="f72f2725-9728-bf0b-249a-66eeaa4f9a0b")
public static String es_PE_FIELD_AssignedProducts_GuaranteeDays_Description="Número de días que el producto está garantizado ó disponible";

@XendraField(AD_Column_ID="GuaranteeDays",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f72f2725-9728-bf0b-249a-66eeaa4f9a0b")
public static final String FIELDNAME_AssignedProducts_GuaranteeDays="f72f2725-9728-bf0b-249a-66eeaa4f9a0b";

@XendraTrl(Identifier="dad672cf-0d0e-84fc-5372-33daf285116c")
public static String es_PE_FIELD_ExpenseProduct_GuaranteeDays_Name="Días de Caducidad";

@XendraTrl(Identifier="dad672cf-0d0e-84fc-5372-33daf285116c")
public static String es_PE_FIELD_ExpenseProduct_GuaranteeDays_Help="Si el valor es 0, no hay límite a la disponibilidad ó garantía, si no la fecha de la garantía es calculada agregando los días a la fecha de entrega.";

@XendraTrl(Identifier="dad672cf-0d0e-84fc-5372-33daf285116c")
public static String es_PE_FIELD_ExpenseProduct_GuaranteeDays_Description="Número de días que el producto está garantizado ó disponible";

@XendraField(AD_Column_ID="GuaranteeDays",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dad672cf-0d0e-84fc-5372-33daf285116c")
public static final String FIELDNAME_ExpenseProduct_GuaranteeDays="dad672cf-0d0e-84fc-5372-33daf285116c";

@XendraTrl(Identifier="37136b2f-c276-9e93-cc09-100c5961d23a")
public static String es_PE_FIELD_ResourceProduct_GuaranteeDays_Name="Días de Caducidad";

@XendraTrl(Identifier="37136b2f-c276-9e93-cc09-100c5961d23a")
public static String es_PE_FIELD_ResourceProduct_GuaranteeDays_Help="Si el valor es 0, no hay límite a la disponibilidad ó garantía, si no la fecha de la garantía es calculada agregando los días a la fecha de entrega.";

@XendraTrl(Identifier="37136b2f-c276-9e93-cc09-100c5961d23a")
public static String es_PE_FIELD_ResourceProduct_GuaranteeDays_Description="Número de días que el producto está garantizado ó disponible";

@XendraField(AD_Column_ID="GuaranteeDays",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="37136b2f-c276-9e93-cc09-100c5961d23a")
public static final String FIELDNAME_ResourceProduct_GuaranteeDays="37136b2f-c276-9e93-cc09-100c5961d23a";

@XendraTrl(Identifier="df957fef-cd5a-d664-e54e-844ad8241e36")
public static String es_PE_FIELD_ProductDimension_GuaranteeDays_Name="Días de Caducidad";

@XendraTrl(Identifier="df957fef-cd5a-d664-e54e-844ad8241e36")
public static String es_PE_FIELD_ProductDimension_GuaranteeDays_Help="Si el valor es 0, no hay límite a la disponibilidad ó garantía, si no la fecha de la garantía es calculada agregando los días a la fecha de entrega.";

@XendraTrl(Identifier="df957fef-cd5a-d664-e54e-844ad8241e36")
public static String es_PE_FIELD_ProductDimension_GuaranteeDays_Description="Número de días que el producto está garantizado ó disponible";

@XendraField(AD_Column_ID="GuaranteeDays",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="df957fef-cd5a-d664-e54e-844ad8241e36")
public static final String FIELDNAME_ProductDimension_GuaranteeDays="df957fef-cd5a-d664-e54e-844ad8241e36";

@XendraTrl(Identifier="a45d1444-1748-219e-5761-bf120c28e375")
public static String es_PE_FIELD_SelectProduct_GuaranteeDays_Name="Días de Caducidad";

@XendraTrl(Identifier="a45d1444-1748-219e-5761-bf120c28e375")
public static String es_PE_FIELD_SelectProduct_GuaranteeDays_Help="Si el valor es 0, no hay límite a la disponibilidad ó garantía, si no la fecha de la garantía es calculada agregando los días a la fecha de entrega.";

@XendraTrl(Identifier="a45d1444-1748-219e-5761-bf120c28e375")
public static String es_PE_FIELD_SelectProduct_GuaranteeDays_Description="Número de días que el producto está garantizado ó disponible";

@XendraField(AD_Column_ID="GuaranteeDays",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a45d1444-1748-219e-5761-bf120c28e375")
public static final String FIELDNAME_SelectProduct_GuaranteeDays="a45d1444-1748-219e-5761-bf120c28e375";

@XendraTrl(Identifier="b00e213f-7cb1-cb67-d358-7279ead57970")
public static String es_PE_FIELD_Product_GuaranteeDays2_Name="Días de Caducidad";

@XendraTrl(Identifier="b00e213f-7cb1-cb67-d358-7279ead57970")
public static String es_PE_FIELD_Product_GuaranteeDays2_Help="Si el valor es 0, no hay límite a la disponibilidad ó garantía, si no la fecha de la garantía es calculada agregando los días a la fecha de entrega.";

@XendraTrl(Identifier="b00e213f-7cb1-cb67-d358-7279ead57970")
public static String es_PE_FIELD_Product_GuaranteeDays2_Description="Número de días que el producto está garantizado ó disponible";

@XendraField(AD_Column_ID="GuaranteeDays",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=420,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b00e213f-7cb1-cb67-d358-7279ead57970")
public static final String FIELDNAME_Product_GuaranteeDays2="b00e213f-7cb1-cb67-d358-7279ead57970";

@XendraTrl(Identifier="3ca24ba2-da61-829b-8ada-3e704e5ca49e")
public static String es_PE_COLUMN_GuaranteeDays_Name="Días de Caducidad";

@XendraColumn(AD_Element_ID="544e6239-596d-2b81-716c-5b0349884aa1",ColumnName="GuaranteeDays",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3ca24ba2-da61-829b-8ada-3e704e5ca49e",
Synchronized="2022-04-26 19:23:02.0")
/** Column name GuaranteeDays */
public static final String COLUMNNAME_GuaranteeDays = "GuaranteeDays";
/** Set Min Guarantee Days.
@param GuaranteeDaysMin Minumum number of guarantee days */
public void setGuaranteeDaysMin (int GuaranteeDaysMin)
{
set_Value (COLUMNNAME_GuaranteeDaysMin, Integer.valueOf(GuaranteeDaysMin));
}
/** Get Min Guarantee Days.
@return Minumum number of guarantee days */
public int getGuaranteeDaysMin() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_GuaranteeDaysMin);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="02e73528-1c4b-7607-ad79-37cb5a6fa5d4")
public static String es_PE_FIELD_Product_MinGuaranteeDays_Name="Días Mínimos Caducidad";

@XendraTrl(Identifier="02e73528-1c4b-7607-ad79-37cb5a6fa5d4")
public static String es_PE_FIELD_Product_MinGuaranteeDays_Help="Cuando selecciona el producto/lote con una fecha de garantia, las fechas minimas de garantias son tomadas automaticamente. Usted puede seleccionar cualquier producto/lote manualmente.";

@XendraTrl(Identifier="02e73528-1c4b-7607-ad79-37cb5a6fa5d4")
public static String es_PE_FIELD_Product_MinGuaranteeDays_Description="Número minimo de días de garantía";

@XendraField(AD_Column_ID="GuaranteeDaysMin",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N'",DisplayLength=11,IsReadOnly=false,SeqNo=410,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="02e73528-1c4b-7607-ad79-37cb5a6fa5d4")
public static final String FIELDNAME_Product_MinGuaranteeDays="02e73528-1c4b-7607-ad79-37cb5a6fa5d4";

@XendraTrl(Identifier="8271f699-c06d-3ebd-80be-0ec8ab4f85c7")
public static String es_PE_FIELD_AssignedProducts_MinGuaranteeDays_Name="Días Mínimos Caducidad";

@XendraTrl(Identifier="8271f699-c06d-3ebd-80be-0ec8ab4f85c7")
public static String es_PE_FIELD_AssignedProducts_MinGuaranteeDays_Help="Cuando selecciona el producto/lote con una fecha de garantia, las fechas minimas de garantias son tomadas automaticamente. Usted puede seleccionar cualquier producto/lote manualmente.";

@XendraTrl(Identifier="8271f699-c06d-3ebd-80be-0ec8ab4f85c7")
public static String es_PE_FIELD_AssignedProducts_MinGuaranteeDays_Description="Número minimo de días de garantía";

@XendraField(AD_Column_ID="GuaranteeDaysMin",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8271f699-c06d-3ebd-80be-0ec8ab4f85c7")
public static final String FIELDNAME_AssignedProducts_MinGuaranteeDays="8271f699-c06d-3ebd-80be-0ec8ab4f85c7";

@XendraTrl(Identifier="e1b6dd10-0201-3a62-b0c8-d2716b47a490")
public static String es_PE_FIELD_ExpenseProduct_MinGuaranteeDays_Name="Días Mínimos Caducidad";

@XendraTrl(Identifier="e1b6dd10-0201-3a62-b0c8-d2716b47a490")
public static String es_PE_FIELD_ExpenseProduct_MinGuaranteeDays_Help="Cuando selecciona el producto/lote con una fecha de garantia, las fechas minimas de garantias son tomadas automaticamente. Usted puede seleccionar cualquier producto/lote manualmente.";

@XendraTrl(Identifier="e1b6dd10-0201-3a62-b0c8-d2716b47a490")
public static String es_PE_FIELD_ExpenseProduct_MinGuaranteeDays_Description="Número minimo de días de garantía";

@XendraField(AD_Column_ID="GuaranteeDaysMin",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e1b6dd10-0201-3a62-b0c8-d2716b47a490")
public static final String FIELDNAME_ExpenseProduct_MinGuaranteeDays="e1b6dd10-0201-3a62-b0c8-d2716b47a490";

@XendraTrl(Identifier="414fb74f-cf17-85e9-1518-ccb3d700dc4f")
public static String es_PE_FIELD_ResourceProduct_MinGuaranteeDays_Name="Días Mínimos Caducidad";

@XendraTrl(Identifier="414fb74f-cf17-85e9-1518-ccb3d700dc4f")
public static String es_PE_FIELD_ResourceProduct_MinGuaranteeDays_Help="Cuando selecciona el producto/lote con una fecha de garantia, las fechas minimas de garantias son tomadas automaticamente. Usted puede seleccionar cualquier producto/lote manualmente.";

@XendraTrl(Identifier="414fb74f-cf17-85e9-1518-ccb3d700dc4f")
public static String es_PE_FIELD_ResourceProduct_MinGuaranteeDays_Description="Número minimo de días de garantía";

@XendraField(AD_Column_ID="GuaranteeDaysMin",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="414fb74f-cf17-85e9-1518-ccb3d700dc4f")
public static final String FIELDNAME_ResourceProduct_MinGuaranteeDays="414fb74f-cf17-85e9-1518-ccb3d700dc4f";

@XendraTrl(Identifier="5d4a9056-aa19-b5ac-9757-9e62b6a77c6a")
public static String es_PE_FIELD_ProductDimension_MinGuaranteeDays_Name="Días Mínimos Caducidad";

@XendraTrl(Identifier="5d4a9056-aa19-b5ac-9757-9e62b6a77c6a")
public static String es_PE_FIELD_ProductDimension_MinGuaranteeDays_Help="Cuando selecciona el producto/lote con una fecha de garantia, las fechas minimas de garantias son tomadas automaticamente. Usted puede seleccionar cualquier producto/lote manualmente.";

@XendraTrl(Identifier="5d4a9056-aa19-b5ac-9757-9e62b6a77c6a")
public static String es_PE_FIELD_ProductDimension_MinGuaranteeDays_Description="Número minimo de días de garantía";

@XendraField(AD_Column_ID="GuaranteeDaysMin",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5d4a9056-aa19-b5ac-9757-9e62b6a77c6a")
public static final String FIELDNAME_ProductDimension_MinGuaranteeDays="5d4a9056-aa19-b5ac-9757-9e62b6a77c6a";

@XendraTrl(Identifier="f45a98ce-84eb-b99b-3786-dc54720b9117")
public static String es_PE_FIELD_SelectProduct_MinGuaranteeDays_Name="Días Mínimos Caducidad";

@XendraTrl(Identifier="f45a98ce-84eb-b99b-3786-dc54720b9117")
public static String es_PE_FIELD_SelectProduct_MinGuaranteeDays_Help="Cuando selecciona el producto/lote con una fecha de garantia, las fechas minimas de garantias son tomadas automaticamente. Usted puede seleccionar cualquier producto/lote manualmente.";

@XendraTrl(Identifier="f45a98ce-84eb-b99b-3786-dc54720b9117")
public static String es_PE_FIELD_SelectProduct_MinGuaranteeDays_Description="Número minimo de días de garantía";

@XendraField(AD_Column_ID="GuaranteeDaysMin",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f45a98ce-84eb-b99b-3786-dc54720b9117")
public static final String FIELDNAME_SelectProduct_MinGuaranteeDays="f45a98ce-84eb-b99b-3786-dc54720b9117";

@XendraTrl(Identifier="eeea6122-ab36-93e5-a710-75f66850177e")
public static String es_PE_FIELD_Product_MinGuaranteeDays2_Name="Días Mínimos Caducidad";

@XendraTrl(Identifier="eeea6122-ab36-93e5-a710-75f66850177e")
public static String es_PE_FIELD_Product_MinGuaranteeDays2_Help="Cuando selecciona el producto/lote con una fecha de garantia, las fechas minimas de garantias son tomadas automaticamente. Usted puede seleccionar cualquier producto/lote manualmente.";

@XendraTrl(Identifier="eeea6122-ab36-93e5-a710-75f66850177e")
public static String es_PE_FIELD_Product_MinGuaranteeDays2_Description="Número minimo de días de garantía";

@XendraField(AD_Column_ID="GuaranteeDaysMin",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=430,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eeea6122-ab36-93e5-a710-75f66850177e")
public static final String FIELDNAME_Product_MinGuaranteeDays2="eeea6122-ab36-93e5-a710-75f66850177e";

@XendraTrl(Identifier="0aee13b8-e322-bfc0-ccae-c3482bc43124")
public static String es_PE_COLUMN_GuaranteeDaysMin_Name="Días Mínimos Caducidad";

@XendraColumn(AD_Element_ID="3a62266b-f332-ef08-b625-4064c416fdf5",ColumnName="GuaranteeDaysMin",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0aee13b8-e322-bfc0-ccae-c3482bc43124",
Synchronized="2022-04-26 19:23:02.0")
/** Column name GuaranteeDaysMin */
public static final String COLUMNNAME_GuaranteeDaysMin = "GuaranteeDaysMin";
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

@XendraTrl(Identifier="f926c5a4-a55d-d5fa-a7be-f9084103cd99")
public static String es_PE_FIELD_Product_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="f926c5a4-a55d-d5fa-a7be-f9084103cd99")
public static String es_PE_FIELD_Product_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="f926c5a4-a55d-d5fa-a7be-f9084103cd99")
public static String es_PE_FIELD_Product_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f926c5a4-a55d-d5fa-a7be-f9084103cd99")
public static final String FIELDNAME_Product_CommentHelp="f926c5a4-a55d-d5fa-a7be-f9084103cd99";

@XendraTrl(Identifier="1941e933-9d48-33d9-5bbe-788797466b7b")
public static String es_PE_FIELD_AssignedProducts_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="1941e933-9d48-33d9-5bbe-788797466b7b")
public static String es_PE_FIELD_AssignedProducts_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="1941e933-9d48-33d9-5bbe-788797466b7b")
public static String es_PE_FIELD_AssignedProducts_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1941e933-9d48-33d9-5bbe-788797466b7b")
public static final String FIELDNAME_AssignedProducts_CommentHelp="1941e933-9d48-33d9-5bbe-788797466b7b";

@XendraTrl(Identifier="938a47a3-e89c-b8bb-e5f0-1eebcd7742bd")
public static String es_PE_FIELD_ExpenseProduct_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="938a47a3-e89c-b8bb-e5f0-1eebcd7742bd")
public static String es_PE_FIELD_ExpenseProduct_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="938a47a3-e89c-b8bb-e5f0-1eebcd7742bd")
public static String es_PE_FIELD_ExpenseProduct_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="938a47a3-e89c-b8bb-e5f0-1eebcd7742bd")
public static final String FIELDNAME_ExpenseProduct_CommentHelp="938a47a3-e89c-b8bb-e5f0-1eebcd7742bd";

@XendraTrl(Identifier="3b929bcf-94bb-4ddc-651c-5ac66fac1232")
public static String es_PE_FIELD_ResourceProduct_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="3b929bcf-94bb-4ddc-651c-5ac66fac1232")
public static String es_PE_FIELD_ResourceProduct_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="3b929bcf-94bb-4ddc-651c-5ac66fac1232")
public static String es_PE_FIELD_ResourceProduct_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3b929bcf-94bb-4ddc-651c-5ac66fac1232")
public static final String FIELDNAME_ResourceProduct_CommentHelp="3b929bcf-94bb-4ddc-651c-5ac66fac1232";

@XendraTrl(Identifier="060df4b1-7be0-6d43-0f10-daf7feae403f")
public static String es_PE_FIELD_ProductDimension_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="060df4b1-7be0-6d43-0f10-daf7feae403f")
public static String es_PE_FIELD_ProductDimension_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="060df4b1-7be0-6d43-0f10-daf7feae403f")
public static String es_PE_FIELD_ProductDimension_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="060df4b1-7be0-6d43-0f10-daf7feae403f")
public static final String FIELDNAME_ProductDimension_CommentHelp="060df4b1-7be0-6d43-0f10-daf7feae403f";

@XendraTrl(Identifier="41a4a4d8-9621-b531-384e-d3eb2faac081")
public static String es_PE_FIELD_SelectProduct_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="41a4a4d8-9621-b531-384e-d3eb2faac081")
public static String es_PE_FIELD_SelectProduct_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="41a4a4d8-9621-b531-384e-d3eb2faac081")
public static String es_PE_FIELD_SelectProduct_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="41a4a4d8-9621-b531-384e-d3eb2faac081")
public static final String FIELDNAME_SelectProduct_CommentHelp="41a4a4d8-9621-b531-384e-d3eb2faac081";

@XendraTrl(Identifier="07d7a308-25f6-d947-0994-caaae4f9994d")
public static String es_PE_FIELD_Product_CommentHelp2_Name="Ayuda";

@XendraTrl(Identifier="07d7a308-25f6-d947-0994-caaae4f9994d")
public static String es_PE_FIELD_Product_CommentHelp2_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="07d7a308-25f6-d947-0994-caaae4f9994d")
public static String es_PE_FIELD_Product_CommentHelp2_Description="Ayuda; Comentario o Sugerencia";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="07d7a308-25f6-d947-0994-caaae4f9994d")
public static final String FIELDNAME_Product_CommentHelp2="07d7a308-25f6-d947-0994-caaae4f9994d";

@XendraTrl(Identifier="c6775663-9f61-3ff8-e590-b2778ec47f99")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c6775663-9f61-3ff8-e590-b2778ec47f99",
Synchronized="2022-04-26 19:23:02.0")
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
@XendraTrl(Identifier="13f5a94c-90f1-4b6d-b414-b429b43600dc")
public static String es_PE_FIELD_Product_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2020-11-02 17:52:23.0",
Identifier="13f5a94c-90f1-4b6d-b414-b429b43600dc")
public static final String FIELDNAME_Product_Identifier="13f5a94c-90f1-4b6d-b414-b429b43600dc";

@XendraTrl(Identifier="21b42f54-6988-4736-ac48-7373890a03e1")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="21b42f54-6988-4736-ac48-7373890a03e1",
Synchronized="2022-04-26 19:23:02.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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
return (String)get_Value(COLUMNNAME_ImageURL);
}

@XendraTrl(Identifier="55e7d592-7769-25db-b39d-0884fc079841")
public static String es_PE_FIELD_Product_ImageURL_Name="URL de la Imagen";

@XendraTrl(Identifier="55e7d592-7769-25db-b39d-0884fc079841")
public static String es_PE_FIELD_Product_ImageURL_Help="URL de imagen de la textura; La imagen no se almacena en la base de datos; ";

@XendraTrl(Identifier="55e7d592-7769-25db-b39d-0884fc079841")
public static String es_PE_FIELD_Product_ImageURL_Description="URL de la estructura de la imagen";

@XendraField(AD_Column_ID="ImageURL",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsSummary@='N'",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="55e7d592-7769-25db-b39d-0884fc079841")
public static final String FIELDNAME_Product_ImageURL="55e7d592-7769-25db-b39d-0884fc079841";

@XendraTrl(Identifier="f5410be2-6b5b-6b57-1171-539ca2a2564b")
public static String es_PE_FIELD_AssignedProducts_ImageURL_Name="URL de la Imagen";

@XendraTrl(Identifier="f5410be2-6b5b-6b57-1171-539ca2a2564b")
public static String es_PE_FIELD_AssignedProducts_ImageURL_Help="URL de imagen de la textura; La imagen no se almacena en la base de datos; ";

@XendraTrl(Identifier="f5410be2-6b5b-6b57-1171-539ca2a2564b")
public static String es_PE_FIELD_AssignedProducts_ImageURL_Description="URL de la estructura de la imagen";

@XendraField(AD_Column_ID="ImageURL",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f5410be2-6b5b-6b57-1171-539ca2a2564b")
public static final String FIELDNAME_AssignedProducts_ImageURL="f5410be2-6b5b-6b57-1171-539ca2a2564b";

@XendraTrl(Identifier="c2007d81-d7b7-31eb-e0db-b841e89ae83c")
public static String es_PE_FIELD_ExpenseProduct_ImageURL_Name="URL de la Imagen";

@XendraTrl(Identifier="c2007d81-d7b7-31eb-e0db-b841e89ae83c")
public static String es_PE_FIELD_ExpenseProduct_ImageURL_Help="URL de imagen de la textura; La imagen no se almacena en la base de datos; ";

@XendraTrl(Identifier="c2007d81-d7b7-31eb-e0db-b841e89ae83c")
public static String es_PE_FIELD_ExpenseProduct_ImageURL_Description="URL de la estructura de la imagen";

@XendraField(AD_Column_ID="ImageURL",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c2007d81-d7b7-31eb-e0db-b841e89ae83c")
public static final String FIELDNAME_ExpenseProduct_ImageURL="c2007d81-d7b7-31eb-e0db-b841e89ae83c";

@XendraTrl(Identifier="3c3c34db-be94-bca4-eb64-5d54fd1046a4")
public static String es_PE_FIELD_ResourceProduct_ImageURL_Name="URL de la Imagen";

@XendraTrl(Identifier="3c3c34db-be94-bca4-eb64-5d54fd1046a4")
public static String es_PE_FIELD_ResourceProduct_ImageURL_Help="URL de imagen de la textura; La imagen no se almacena en la base de datos; ";

@XendraTrl(Identifier="3c3c34db-be94-bca4-eb64-5d54fd1046a4")
public static String es_PE_FIELD_ResourceProduct_ImageURL_Description="URL de la estructura de la imagen";

@XendraField(AD_Column_ID="ImageURL",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3c3c34db-be94-bca4-eb64-5d54fd1046a4")
public static final String FIELDNAME_ResourceProduct_ImageURL="3c3c34db-be94-bca4-eb64-5d54fd1046a4";

@XendraTrl(Identifier="cf9a147d-ad62-e75b-2e35-8beb8e140b32")
public static String es_PE_FIELD_ProductDimension_ImageURL_Name="URL de la Imagen";

@XendraTrl(Identifier="cf9a147d-ad62-e75b-2e35-8beb8e140b32")
public static String es_PE_FIELD_ProductDimension_ImageURL_Help="URL de imagen de la textura; La imagen no se almacena en la base de datos; ";

@XendraTrl(Identifier="cf9a147d-ad62-e75b-2e35-8beb8e140b32")
public static String es_PE_FIELD_ProductDimension_ImageURL_Description="URL de la estructura de la imagen";

@XendraField(AD_Column_ID="ImageURL",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cf9a147d-ad62-e75b-2e35-8beb8e140b32")
public static final String FIELDNAME_ProductDimension_ImageURL="cf9a147d-ad62-e75b-2e35-8beb8e140b32";

@XendraTrl(Identifier="dfd9dc0f-c6bb-35d2-527b-d20f3f766b72")
public static String es_PE_FIELD_SelectProduct_ImageURL_Name="URL de la Imagen";

@XendraTrl(Identifier="dfd9dc0f-c6bb-35d2-527b-d20f3f766b72")
public static String es_PE_FIELD_SelectProduct_ImageURL_Help="URL de imagen de la textura; La imagen no se almacena en la base de datos; ";

@XendraTrl(Identifier="dfd9dc0f-c6bb-35d2-527b-d20f3f766b72")
public static String es_PE_FIELD_SelectProduct_ImageURL_Description="URL de la estructura de la imagen";

@XendraField(AD_Column_ID="ImageURL",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dfd9dc0f-c6bb-35d2-527b-d20f3f766b72")
public static final String FIELDNAME_SelectProduct_ImageURL="dfd9dc0f-c6bb-35d2-527b-d20f3f766b72";

@XendraTrl(Identifier="5dc2d45f-e071-fc93-5d0f-e3ebf67f9fcd")
public static String es_PE_FIELD_Product_ImageURL2_Name="URL de la Imagen";

@XendraTrl(Identifier="5dc2d45f-e071-fc93-5d0f-e3ebf67f9fcd")
public static String es_PE_FIELD_Product_ImageURL2_Help="URL de imagen de la textura; La imagen no se almacena en la base de datos; ";

@XendraTrl(Identifier="5dc2d45f-e071-fc93-5d0f-e3ebf67f9fcd")
public static String es_PE_FIELD_Product_ImageURL2_Description="URL de la estructura de la imagen";

@XendraField(AD_Column_ID="ImageURL",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=400,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5dc2d45f-e071-fc93-5d0f-e3ebf67f9fcd")
public static final String FIELDNAME_Product_ImageURL2="5dc2d45f-e071-fc93-5d0f-e3ebf67f9fcd";

@XendraTrl(Identifier="08714ebb-8c2b-bf9b-b206-25e0cbb65368")
public static String es_PE_COLUMN_ImageURL_Name="URL de la Imagen";

@XendraColumn(AD_Element_ID="fe037607-f5d9-d969-d6e5-eb1f94c10e5e",ColumnName="ImageURL",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="08714ebb-8c2b-bf9b-b206-25e0cbb65368",
Synchronized="2022-04-26 19:23:02.0")
/** Column name ImageURL */
public static final String COLUMNNAME_ImageURL = "ImageURL";
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

@XendraTrl(Identifier="f4dd0fb4-a53e-78b0-b45d-0adcc95ce54e")
public static String es_PE_FIELD_Product_BillOfMaterials_Name="Lista de Materiales";

@XendraTrl(Identifier="f4dd0fb4-a53e-78b0-b45d-0adcc95ce54e")
public static String es_PE_FIELD_Product_BillOfMaterials_Help="El cuadro de verificación de lista de materiales indica si este producto contiene una lista de materiales.";

@XendraTrl(Identifier="f4dd0fb4-a53e-78b0-b45d-0adcc95ce54e")
public static String es_PE_FIELD_Product_BillOfMaterials_Description="Lista de materiales";

@XendraField(AD_Column_ID="IsBOM",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N' & @ProductType@=I | @ProductType@=S",DisplayLength=1,
IsReadOnly=false,SeqNo=310,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,
Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f4dd0fb4-a53e-78b0-b45d-0adcc95ce54e")
public static final String FIELDNAME_Product_BillOfMaterials="f4dd0fb4-a53e-78b0-b45d-0adcc95ce54e";

@XendraTrl(Identifier="9a580b16-f0b5-8372-bbac-8aafdae46ccb")
public static String es_PE_FIELD_AssignedProducts_BillOfMaterials_Name="Lista de Materiales";

@XendraTrl(Identifier="9a580b16-f0b5-8372-bbac-8aafdae46ccb")
public static String es_PE_FIELD_AssignedProducts_BillOfMaterials_Help="El cuadro de verificación de lista de materiales indica si este producto contiene una lista de materiales.";

@XendraTrl(Identifier="9a580b16-f0b5-8372-bbac-8aafdae46ccb")
public static String es_PE_FIELD_AssignedProducts_BillOfMaterials_Description="Lista de materiales";

@XendraField(AD_Column_ID="IsBOM",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9a580b16-f0b5-8372-bbac-8aafdae46ccb")
public static final String FIELDNAME_AssignedProducts_BillOfMaterials="9a580b16-f0b5-8372-bbac-8aafdae46ccb";

@XendraTrl(Identifier="e1e4fd4c-d819-e3bc-3706-d84ace76d431")
public static String es_PE_FIELD_ExpenseProduct_BillOfMaterials_Name="Lista de Materiales";

@XendraTrl(Identifier="e1e4fd4c-d819-e3bc-3706-d84ace76d431")
public static String es_PE_FIELD_ExpenseProduct_BillOfMaterials_Help="El cuadro de verificación de lista de materiales indica si este producto contiene una lista de materiales.";

@XendraTrl(Identifier="e1e4fd4c-d819-e3bc-3706-d84ace76d431")
public static String es_PE_FIELD_ExpenseProduct_BillOfMaterials_Description="Lista de materiales";

@XendraField(AD_Column_ID="IsBOM",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsSummary@='N' & @ProductType@=I",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="e1e4fd4c-d819-e3bc-3706-d84ace76d431")
public static final String FIELDNAME_ExpenseProduct_BillOfMaterials="e1e4fd4c-d819-e3bc-3706-d84ace76d431";

@XendraTrl(Identifier="3e48db7e-8eea-4980-f379-12aff22a3244")
public static String es_PE_FIELD_ResourceProduct_BillOfMaterials_Name="Lista de Materiales";

@XendraTrl(Identifier="3e48db7e-8eea-4980-f379-12aff22a3244")
public static String es_PE_FIELD_ResourceProduct_BillOfMaterials_Help="El cuadro de verificación de lista de materiales indica si este producto contiene una lista de materiales.";

@XendraTrl(Identifier="3e48db7e-8eea-4980-f379-12aff22a3244")
public static String es_PE_FIELD_ResourceProduct_BillOfMaterials_Description="Lista de materiales";

@XendraField(AD_Column_ID="IsBOM",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsSummary@='N' & @ProductType@=I",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="3e48db7e-8eea-4980-f379-12aff22a3244")
public static final String FIELDNAME_ResourceProduct_BillOfMaterials="3e48db7e-8eea-4980-f379-12aff22a3244";

@XendraTrl(Identifier="fffda66c-0dce-1832-03b8-a178036381d9")
public static String es_PE_FIELD_ProductDimension_BillOfMaterials_Name="Lista de Materiales";

@XendraTrl(Identifier="fffda66c-0dce-1832-03b8-a178036381d9")
public static String es_PE_FIELD_ProductDimension_BillOfMaterials_Help="El cuadro de verificación de lista de materiales indica si este producto contiene una lista de materiales.";

@XendraTrl(Identifier="fffda66c-0dce-1832-03b8-a178036381d9")
public static String es_PE_FIELD_ProductDimension_BillOfMaterials_Description="Lista de materiales";

@XendraField(AD_Column_ID="IsBOM",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fffda66c-0dce-1832-03b8-a178036381d9")
public static final String FIELDNAME_ProductDimension_BillOfMaterials="fffda66c-0dce-1832-03b8-a178036381d9";

@XendraTrl(Identifier="60ab3c9c-4b0b-b531-9fea-0d9a7b7840f7")
public static String es_PE_FIELD_SelectProduct_BillOfMaterials_Name="Lista de Materiales";

@XendraTrl(Identifier="60ab3c9c-4b0b-b531-9fea-0d9a7b7840f7")
public static String es_PE_FIELD_SelectProduct_BillOfMaterials_Help="El cuadro de verificación de lista de materiales indica si este producto contiene una lista de materiales.";

@XendraTrl(Identifier="60ab3c9c-4b0b-b531-9fea-0d9a7b7840f7")
public static String es_PE_FIELD_SelectProduct_BillOfMaterials_Description="Lista de materiales";

@XendraField(AD_Column_ID="IsBOM",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="60ab3c9c-4b0b-b531-9fea-0d9a7b7840f7")
public static final String FIELDNAME_SelectProduct_BillOfMaterials="60ab3c9c-4b0b-b531-9fea-0d9a7b7840f7";

@XendraTrl(Identifier="d15aae27-93c6-9812-de82-ca3e0dc8c7e9")
public static String es_PE_FIELD_Product_BillOfMaterials2_Name="Lista de Materiales";

@XendraTrl(Identifier="d15aae27-93c6-9812-de82-ca3e0dc8c7e9")
public static String es_PE_FIELD_Product_BillOfMaterials2_Help="El cuadro de verificación de lista de materiales indica si este producto contiene una lista de materiales.";

@XendraTrl(Identifier="d15aae27-93c6-9812-de82-ca3e0dc8c7e9")
public static String es_PE_FIELD_Product_BillOfMaterials2_Description="Lista de materiales";

@XendraField(AD_Column_ID="IsBOM",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N' & @ProductType@=I | @ProductType@=S",DisplayLength=1,
IsReadOnly=false,SeqNo=310,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,
Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d15aae27-93c6-9812-de82-ca3e0dc8c7e9")
public static final String FIELDNAME_Product_BillOfMaterials2="d15aae27-93c6-9812-de82-ca3e0dc8c7e9";

@XendraTrl(Identifier="1547a86f-3fde-3b45-7920-f37b477b3b74")
public static String es_PE_COLUMN_IsBOM_Name="Lista de Materiales";

@XendraColumn(AD_Element_ID="a76e9af0-88a0-9806-806f-9636bab53078",ColumnName="IsBOM",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,
ReadOnlyLogic="@ProductType@=R | @ProductType@=E | @ProductType@=O",IsIdentifier=false,SeqNo=0,
IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1547a86f-3fde-3b45-7920-f37b477b3b74",
Synchronized="2022-04-26 19:23:02.0")
/** Column name IsBOM */
public static final String COLUMNNAME_IsBOM = "IsBOM";
/** Set IsCostable.
@param IsCostable IsCostable */
public void setIsCostable (boolean IsCostable)
{
set_Value (COLUMNNAME_IsCostable, Boolean.valueOf(IsCostable));
}
/** Get IsCostable.
@return IsCostable */
public boolean isCostable() 
{
Object oo = get_Value(COLUMNNAME_IsCostable);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f8fa7f06-d8b5-ea8a-d71b-5b672c51e7d8")
public static String es_PE_FIELD_Product_IsCostable_Name="Costeable";

@XendraField(AD_Column_ID="IsCostable",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f8fa7f06-d8b5-ea8a-d71b-5b672c51e7d8")
public static final String FIELDNAME_Product_IsCostable="f8fa7f06-d8b5-ea8a-d71b-5b672c51e7d8";

@XendraTrl(Identifier="d248e364-7ed9-f758-c21e-fd15d73d2dbd")
public static String es_PE_COLUMN_IsCostable_Name="iscostable";

@XendraColumn(AD_Element_ID="eaf3869d-c347-e2c6-ef4f-645ad3cf6607",ColumnName="IsCostable",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d248e364-7ed9-f758-c21e-fd15d73d2dbd",
Synchronized="2022-04-26 19:23:02.0")
/** Column name IsCostable */
public static final String COLUMNNAME_IsCostable = "IsCostable";
/** Set Drop Shipment.
@param IsDropShip Drop Shipments are sent from the Vendor directly to the Customer */
public void setIsDropShip (boolean IsDropShip)
{
set_Value (COLUMNNAME_IsDropShip, Boolean.valueOf(IsDropShip));
}
/** Get Drop Shipment.
@return Drop Shipments are sent from the Vendor directly to the Customer */
public boolean isDropShip() 
{
Object oo = get_Value(COLUMNNAME_IsDropShip);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="8c85c45d-6b28-b82d-5087-2ae807a5398b")
public static String es_PE_FIELD_Product_DropShipment_Name="Entrega Directa";

@XendraTrl(Identifier="8c85c45d-6b28-b82d-5087-2ae807a5398b")
public static String es_PE_FIELD_Product_DropShipment_Help="Los envíos de la nota no causan ningunas reservaciones ó movimientos del inventario mientras que el envío es del inventario del vendedor. El envío del vendedor al cliente debe ser confirmado.";

@XendraTrl(Identifier="8c85c45d-6b28-b82d-5087-2ae807a5398b")
public static String es_PE_FIELD_Product_DropShipment_Description="Los envíos de la nota se envían del vendedor directamente al cliente";

@XendraField(AD_Column_ID="IsDropShip",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N' & @ProductType@=I",DisplayLength=1,IsReadOnly=false,SeqNo=240,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="8c85c45d-6b28-b82d-5087-2ae807a5398b")
public static final String FIELDNAME_Product_DropShipment="8c85c45d-6b28-b82d-5087-2ae807a5398b";

@XendraTrl(Identifier="cfce6235-d5ec-0b6d-c336-4480bfa2fad8")
public static String es_PE_FIELD_AssignedProducts_DropShipment_Name="Entrega Directa";

@XendraTrl(Identifier="cfce6235-d5ec-0b6d-c336-4480bfa2fad8")
public static String es_PE_FIELD_AssignedProducts_DropShipment_Help="Los envíos de la nota no causan ningunas reservaciones ó movimientos del inventario mientras que el envío es del inventario del vendedor. El envío del vendedor al cliente debe ser confirmado.";

@XendraTrl(Identifier="cfce6235-d5ec-0b6d-c336-4480bfa2fad8")
public static String es_PE_FIELD_AssignedProducts_DropShipment_Description="Los envíos de la nota se envían del vendedor directamente al cliente";

@XendraField(AD_Column_ID="IsDropShip",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cfce6235-d5ec-0b6d-c336-4480bfa2fad8")
public static final String FIELDNAME_AssignedProducts_DropShipment="cfce6235-d5ec-0b6d-c336-4480bfa2fad8";

@XendraTrl(Identifier="f8f8fa1b-767b-7ad9-8547-784532e25a81")
public static String es_PE_FIELD_ExpenseProduct_DropShipment_Name="Entrega Directa";

@XendraTrl(Identifier="f8f8fa1b-767b-7ad9-8547-784532e25a81")
public static String es_PE_FIELD_ExpenseProduct_DropShipment_Help="Los envíos de la nota no causan ningunas reservaciones ó movimientos del inventario mientras que el envío es del inventario del vendedor. El envío del vendedor al cliente debe ser confirmado.";

@XendraTrl(Identifier="f8f8fa1b-767b-7ad9-8547-784532e25a81")
public static String es_PE_FIELD_ExpenseProduct_DropShipment_Description="Los envíos de la nota se envían del vendedor directamente al cliente";

@XendraField(AD_Column_ID="IsDropShip",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f8f8fa1b-767b-7ad9-8547-784532e25a81")
public static final String FIELDNAME_ExpenseProduct_DropShipment="f8f8fa1b-767b-7ad9-8547-784532e25a81";

@XendraTrl(Identifier="6a807c97-3f3d-b08e-db29-f95d96a07336")
public static String es_PE_FIELD_ResourceProduct_DropShipment_Name="Entrega Directa";

@XendraTrl(Identifier="6a807c97-3f3d-b08e-db29-f95d96a07336")
public static String es_PE_FIELD_ResourceProduct_DropShipment_Help="Los envíos de la nota no causan ningunas reservaciones ó movimientos del inventario mientras que el envío es del inventario del vendedor. El envío del vendedor al cliente debe ser confirmado.";

@XendraTrl(Identifier="6a807c97-3f3d-b08e-db29-f95d96a07336")
public static String es_PE_FIELD_ResourceProduct_DropShipment_Description="Los envíos de la nota se envían del vendedor directamente al cliente";

@XendraField(AD_Column_ID="IsDropShip",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6a807c97-3f3d-b08e-db29-f95d96a07336")
public static final String FIELDNAME_ResourceProduct_DropShipment="6a807c97-3f3d-b08e-db29-f95d96a07336";

@XendraTrl(Identifier="e8b18083-e1c0-a47e-fd12-52db13765588")
public static String es_PE_FIELD_ProductDimension_DropShipment_Name="Entrega Directa";

@XendraTrl(Identifier="e8b18083-e1c0-a47e-fd12-52db13765588")
public static String es_PE_FIELD_ProductDimension_DropShipment_Help="Los envíos de la nota no causan ningunas reservaciones ó movimientos del inventario mientras que el envío es del inventario del vendedor. El envío del vendedor al cliente debe ser confirmado.";

@XendraTrl(Identifier="e8b18083-e1c0-a47e-fd12-52db13765588")
public static String es_PE_FIELD_ProductDimension_DropShipment_Description="Los envíos de la nota se envían del vendedor directamente al cliente";

@XendraField(AD_Column_ID="IsDropShip",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e8b18083-e1c0-a47e-fd12-52db13765588")
public static final String FIELDNAME_ProductDimension_DropShipment="e8b18083-e1c0-a47e-fd12-52db13765588";

@XendraTrl(Identifier="0d9554af-e5e3-344b-4097-c647ca8da7ba")
public static String es_PE_FIELD_SelectProduct_DropShipment_Name="Entrega Directa";

@XendraTrl(Identifier="0d9554af-e5e3-344b-4097-c647ca8da7ba")
public static String es_PE_FIELD_SelectProduct_DropShipment_Help="Los envíos de la nota no causan ningunas reservaciones ó movimientos del inventario mientras que el envío es del inventario del vendedor. El envío del vendedor al cliente debe ser confirmado.";

@XendraTrl(Identifier="0d9554af-e5e3-344b-4097-c647ca8da7ba")
public static String es_PE_FIELD_SelectProduct_DropShipment_Description="Los envíos de la nota se envían del vendedor directamente al cliente";

@XendraField(AD_Column_ID="IsDropShip",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0d9554af-e5e3-344b-4097-c647ca8da7ba")
public static final String FIELDNAME_SelectProduct_DropShipment="0d9554af-e5e3-344b-4097-c647ca8da7ba";

@XendraTrl(Identifier="c0f0c2e1-6f5c-63f5-f02f-13b14dc29c30")
public static String es_PE_FIELD_Product_DropShipment2_Name="Entrega Directa";

@XendraTrl(Identifier="c0f0c2e1-6f5c-63f5-f02f-13b14dc29c30")
public static String es_PE_FIELD_Product_DropShipment2_Help="Los envíos de la nota no causan ningunas reservaciones ó movimientos del inventario mientras que el envío es del inventario del vendedor. El envío del vendedor al cliente debe ser confirmado.";

@XendraTrl(Identifier="c0f0c2e1-6f5c-63f5-f02f-13b14dc29c30")
public static String es_PE_FIELD_Product_DropShipment2_Description="Los envíos de la nota se envían del vendedor directamente al cliente";

@XendraField(AD_Column_ID="IsDropShip",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N' & @ProductType@=I",DisplayLength=1,IsReadOnly=false,SeqNo=240,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c0f0c2e1-6f5c-63f5-f02f-13b14dc29c30")
public static final String FIELDNAME_Product_DropShipment2="c0f0c2e1-6f5c-63f5-f02f-13b14dc29c30";

@XendraTrl(Identifier="294e6f51-9021-e13c-a5f0-ec5a2da1c9c0")
public static String es_PE_COLUMN_IsDropShip_Name="Entrega Directa";

@XendraColumn(AD_Element_ID="9169ec42-d87e-a73e-8ef5-81b97661ffb5",ColumnName="IsDropShip",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="294e6f51-9021-e13c-a5f0-ec5a2da1c9c0",
Synchronized="2022-04-26 19:23:02.0")
/** Column name IsDropShip */
public static final String COLUMNNAME_IsDropShip = "IsDropShip";
/** Set Exclude Auto Delivery.
@param IsExcludeAutoDelivery Exclude from automatic Delivery */
public void setIsExcludeAutoDelivery (boolean IsExcludeAutoDelivery)
{
set_Value (COLUMNNAME_IsExcludeAutoDelivery, Boolean.valueOf(IsExcludeAutoDelivery));
}
/** Get Exclude Auto Delivery.
@return Exclude from automatic Delivery */
public boolean isExcludeAutoDelivery() 
{
Object oo = get_Value(COLUMNNAME_IsExcludeAutoDelivery);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="abd2ba27-572f-5c92-733e-a2ec17857093")
public static String es_PE_FIELD_Product_ExcludeAutoDelivery_Name="Excluir de Auto Entrega";

@XendraTrl(Identifier="abd2ba27-572f-5c92-733e-a2ec17857093")
public static String es_PE_FIELD_Product_ExcludeAutoDelivery_Help="El producto es excluído de la generación de entregas. Esto permite la creación manual de entregas Si seleccionó debe crear manualmente la  entrega.  Pero, los artículos siempre son incluidos, cuando las reglas de entrega de la órden son forzadas (ej. PDV).Esto permite una granularidad más fina de las Reglas de Entrega Manual.";

@XendraTrl(Identifier="abd2ba27-572f-5c92-733e-a2ec17857093")
public static String es_PE_FIELD_Product_ExcludeAutoDelivery_Description="Excluir de Entrega  automática";

@XendraField(AD_Column_ID="IsExcludeAutoDelivery",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsSummary@='N'",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="abd2ba27-572f-5c92-733e-a2ec17857093")
public static final String FIELDNAME_Product_ExcludeAutoDelivery="abd2ba27-572f-5c92-733e-a2ec17857093";

@XendraTrl(Identifier="69d1706f-5a57-1d1a-a78c-7f7fc59771c3")
public static String es_PE_COLUMN_IsExcludeAutoDelivery_Name="Excluir de Auto Entrega";

@XendraColumn(AD_Element_ID="022c3abd-5296-1249-02a5-52a0b485f47f",
ColumnName="IsExcludeAutoDelivery",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="69d1706f-5a57-1d1a-a78c-7f7fc59771c3",Synchronized="2022-04-26 19:23:03.0")
/** Column name IsExcludeAutoDelivery */
public static final String COLUMNNAME_IsExcludeAutoDelivery = "IsExcludeAutoDelivery";
/** Set Print detail records on invoice .
@param IsInvoicePrintDetails Print detail BOM elements on the invoice */
public void setIsInvoicePrintDetails (boolean IsInvoicePrintDetails)
{
set_Value (COLUMNNAME_IsInvoicePrintDetails, Boolean.valueOf(IsInvoicePrintDetails));
}
/** Get Print detail records on invoice .
@return Print detail BOM elements on the invoice */
public boolean isInvoicePrintDetails() 
{
Object oo = get_Value(COLUMNNAME_IsInvoicePrintDetails);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="af32840a-5771-935a-4c52-318419e5cb90")
public static String es_PE_FIELD_Product_PrintDetailRecordsOnInvoice_Name="Imprimir Detalle en la Factura";

@XendraTrl(Identifier="af32840a-5771-935a-4c52-318419e5cb90")
public static String es_PE_FIELD_Product_PrintDetailRecordsOnInvoice_Help="El Imprimir detalles en la factura indica que los productos en la lista de materiales se imprimirán en la factura en contraposición a este producto.";

@XendraTrl(Identifier="af32840a-5771-935a-4c52-318419e5cb90")
public static String es_PE_FIELD_Product_PrintDetailRecordsOnInvoice_Description="Imprimir detalle de elementos de LDM en la factura";

@XendraField(AD_Column_ID="IsInvoicePrintDetails",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N' & @IsBOM@='Y'",DisplayLength=1,IsReadOnly=false,SeqNo=340,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="af32840a-5771-935a-4c52-318419e5cb90")
public static final String FIELDNAME_Product_PrintDetailRecordsOnInvoice="af32840a-5771-935a-4c52-318419e5cb90";

@XendraTrl(Identifier="254633b4-e4b1-f53e-5884-203fde716372")
public static String es_PE_FIELD_AssignedProducts_PrintDetailRecordsOnInvoice_Name="Imprimir Detalle en la Factura";

@XendraTrl(Identifier="254633b4-e4b1-f53e-5884-203fde716372")
public static String es_PE_FIELD_AssignedProducts_PrintDetailRecordsOnInvoice_Help="El Imprimir detalles en la factura indica que los productos en la lista de materiales se imprimirán en la factura en contraposición a este producto.";

@XendraTrl(Identifier="254633b4-e4b1-f53e-5884-203fde716372")
public static String es_PE_FIELD_AssignedProducts_PrintDetailRecordsOnInvoice_Description="Imprimir detalle de elementos de LDM en la factura";

@XendraField(AD_Column_ID="IsInvoicePrintDetails",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="254633b4-e4b1-f53e-5884-203fde716372")
public static final String FIELDNAME_AssignedProducts_PrintDetailRecordsOnInvoice="254633b4-e4b1-f53e-5884-203fde716372";

@XendraTrl(Identifier="9dce349e-6637-e6c9-93ca-964e4fff7cc0")
public static String es_PE_FIELD_ExpenseProduct_PrintDetailRecordsOnInvoice_Name="Imprimir Detalle en la Factura";

@XendraTrl(Identifier="9dce349e-6637-e6c9-93ca-964e4fff7cc0")
public static String es_PE_FIELD_ExpenseProduct_PrintDetailRecordsOnInvoice_Help="El Imprimir detalles en la factura indica que los productos en la lista de materiales se imprimirán en la factura en contraposición a este producto.";

@XendraTrl(Identifier="9dce349e-6637-e6c9-93ca-964e4fff7cc0")
public static String es_PE_FIELD_ExpenseProduct_PrintDetailRecordsOnInvoice_Description="Imprimir detalle de elementos de LDM en la factura";

@XendraField(AD_Column_ID="IsInvoicePrintDetails",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsSummary@='N' & @IsBOM@='Y'",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="9dce349e-6637-e6c9-93ca-964e4fff7cc0")
public static final String FIELDNAME_ExpenseProduct_PrintDetailRecordsOnInvoice="9dce349e-6637-e6c9-93ca-964e4fff7cc0";

@XendraTrl(Identifier="12576ada-e074-a7ae-a7b4-087856d58236")
public static String es_PE_FIELD_ResourceProduct_PrintDetailRecordsOnInvoice_Name="Imprimir Detalle en la Factura";

@XendraTrl(Identifier="12576ada-e074-a7ae-a7b4-087856d58236")
public static String es_PE_FIELD_ResourceProduct_PrintDetailRecordsOnInvoice_Help="El Imprimir detalles en la factura indica que los productos en la lista de materiales se imprimirán en la factura en contraposición a este producto.";

@XendraTrl(Identifier="12576ada-e074-a7ae-a7b4-087856d58236")
public static String es_PE_FIELD_ResourceProduct_PrintDetailRecordsOnInvoice_Description="Imprimir detalle de elementos de LDM en la factura";

@XendraField(AD_Column_ID="IsInvoicePrintDetails",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsSummary@='N' & @IsBOM@='Y'",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="12576ada-e074-a7ae-a7b4-087856d58236")
public static final String FIELDNAME_ResourceProduct_PrintDetailRecordsOnInvoice="12576ada-e074-a7ae-a7b4-087856d58236";

@XendraTrl(Identifier="987d663b-70d0-6f7b-399f-2c4697165b6f")
public static String es_PE_FIELD_ProductDimension_PrintDetailRecordsOnInvoice_Name="Imprimir Detalle en la Factura";

@XendraTrl(Identifier="987d663b-70d0-6f7b-399f-2c4697165b6f")
public static String es_PE_FIELD_ProductDimension_PrintDetailRecordsOnInvoice_Help="El Imprimir detalles en la factura indica que los productos en la lista de materiales se imprimirán en la factura en contraposición a este producto.";

@XendraTrl(Identifier="987d663b-70d0-6f7b-399f-2c4697165b6f")
public static String es_PE_FIELD_ProductDimension_PrintDetailRecordsOnInvoice_Description="Imprimir detalle de elementos de LDM en la factura";

@XendraField(AD_Column_ID="IsInvoicePrintDetails",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="987d663b-70d0-6f7b-399f-2c4697165b6f")
public static final String FIELDNAME_ProductDimension_PrintDetailRecordsOnInvoice="987d663b-70d0-6f7b-399f-2c4697165b6f";

@XendraTrl(Identifier="b8c1f8d3-21a3-b212-b0c8-7809fe42b2e2")
public static String es_PE_FIELD_SelectProduct_PrintDetailRecordsOnInvoice_Name="Imprimir Detalle en la Factura";

@XendraTrl(Identifier="b8c1f8d3-21a3-b212-b0c8-7809fe42b2e2")
public static String es_PE_FIELD_SelectProduct_PrintDetailRecordsOnInvoice_Help="El Imprimir detalles en la factura indica que los productos en la lista de materiales se imprimirán en la factura en contraposición a este producto.";

@XendraTrl(Identifier="b8c1f8d3-21a3-b212-b0c8-7809fe42b2e2")
public static String es_PE_FIELD_SelectProduct_PrintDetailRecordsOnInvoice_Description="Imprimir detalle de elementos de LDM en la factura";

@XendraField(AD_Column_ID="IsInvoicePrintDetails",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b8c1f8d3-21a3-b212-b0c8-7809fe42b2e2")
public static final String FIELDNAME_SelectProduct_PrintDetailRecordsOnInvoice="b8c1f8d3-21a3-b212-b0c8-7809fe42b2e2";

@XendraTrl(Identifier="5daeb9ca-d411-0c18-5062-00df1428df9a")
public static String es_PE_FIELD_Product_PrintDetailRecordsOnInvoice2_Name="Imprimir Detalle en la Factura";

@XendraTrl(Identifier="5daeb9ca-d411-0c18-5062-00df1428df9a")
public static String es_PE_FIELD_Product_PrintDetailRecordsOnInvoice2_Help="El Imprimir detalles en la factura indica que los productos en la lista de materiales se imprimirán en la factura en contraposición a este producto.";

@XendraTrl(Identifier="5daeb9ca-d411-0c18-5062-00df1428df9a")
public static String es_PE_FIELD_Product_PrintDetailRecordsOnInvoice2_Description="Imprimir detalle de elementos de LDM en la factura";

@XendraField(AD_Column_ID="IsInvoicePrintDetails",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N' & @IsBOM@='Y'",DisplayLength=1,IsReadOnly=false,SeqNo=340,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="5daeb9ca-d411-0c18-5062-00df1428df9a")
public static final String FIELDNAME_Product_PrintDetailRecordsOnInvoice2="5daeb9ca-d411-0c18-5062-00df1428df9a";

@XendraTrl(Identifier="80dcfa70-b671-acce-2716-829cff5427b6")
public static String es_PE_COLUMN_IsInvoicePrintDetails_Name="Imprimir Detalle en la Factura";

@XendraColumn(AD_Element_ID="0961ecfa-b393-b8c3-22ca-ab68b54fdffa",
ColumnName="IsInvoicePrintDetails",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="80dcfa70-b671-acce-2716-829cff5427b6",Synchronized="2022-04-26 19:23:03.0")
/** Column name IsInvoicePrintDetails */
public static final String COLUMNNAME_IsInvoicePrintDetails = "IsInvoicePrintDetails";
/** Set Print detail records on pick list.
@param IsPickListPrintDetails Print detail BOM elements on the pick list */
public void setIsPickListPrintDetails (boolean IsPickListPrintDetails)
{
set_Value (COLUMNNAME_IsPickListPrintDetails, Boolean.valueOf(IsPickListPrintDetails));
}
/** Get Print detail records on pick list.
@return Print detail BOM elements on the pick list */
public boolean isPickListPrintDetails() 
{
Object oo = get_Value(COLUMNNAME_IsPickListPrintDetails);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="4a8aaf66-29b2-ed52-ec31-95db0396eacf")
public static String es_PE_FIELD_Product_PrintDetailRecordsOnPickList_Name="Imprimir detalle en lista de recolección";

@XendraTrl(Identifier="4a8aaf66-29b2-ed52-ec31-95db0396eacf")
public static String es_PE_FIELD_Product_PrintDetailRecordsOnPickList_Help="El Imprimir detalles en la lista de selección indica que los elementos de la lista de materiales se imprimirán en la lista de selección en contraposición a este producto.";

@XendraTrl(Identifier="4a8aaf66-29b2-ed52-ec31-95db0396eacf")
public static String es_PE_FIELD_Product_PrintDetailRecordsOnPickList_Description="Imprimir detalle de elementos de LDM en la lista de selección";

@XendraField(AD_Column_ID="IsPickListPrintDetails",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N' & @IsBOM@='Y'",DisplayLength=1,IsReadOnly=false,SeqNo=350,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4a8aaf66-29b2-ed52-ec31-95db0396eacf")
public static final String FIELDNAME_Product_PrintDetailRecordsOnPickList="4a8aaf66-29b2-ed52-ec31-95db0396eacf";

@XendraTrl(Identifier="7dafb62d-84e3-dc7f-3e09-32e2ca5a7d54")
public static String es_PE_FIELD_AssignedProducts_PrintDetailRecordsOnPickList_Name="Imprimir detalle en lista de recolección";

@XendraTrl(Identifier="7dafb62d-84e3-dc7f-3e09-32e2ca5a7d54")
public static String es_PE_FIELD_AssignedProducts_PrintDetailRecordsOnPickList_Help="El Imprimir detalles en la lista de selección indica que los elementos de la lista de materiales se imprimirán en la lista de selección en contraposición a este producto.";

@XendraTrl(Identifier="7dafb62d-84e3-dc7f-3e09-32e2ca5a7d54")
public static String es_PE_FIELD_AssignedProducts_PrintDetailRecordsOnPickList_Description="Imprimir detalle de elementos de LDM en la lista de selección";

@XendraField(AD_Column_ID="IsPickListPrintDetails",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7dafb62d-84e3-dc7f-3e09-32e2ca5a7d54")
public static final String FIELDNAME_AssignedProducts_PrintDetailRecordsOnPickList="7dafb62d-84e3-dc7f-3e09-32e2ca5a7d54";

@XendraTrl(Identifier="2bc3a144-d283-8615-9deb-b728531b8b90")
public static String es_PE_FIELD_ExpenseProduct_PrintDetailRecordsOnPickList_Name="Imprimir detalle en lista de recolección";

@XendraTrl(Identifier="2bc3a144-d283-8615-9deb-b728531b8b90")
public static String es_PE_FIELD_ExpenseProduct_PrintDetailRecordsOnPickList_Help="El Imprimir detalles en la lista de selección indica que los elementos de la lista de materiales se imprimirán en la lista de selección en contraposición a este producto.";

@XendraTrl(Identifier="2bc3a144-d283-8615-9deb-b728531b8b90")
public static String es_PE_FIELD_ExpenseProduct_PrintDetailRecordsOnPickList_Description="Imprimir detalle de elementos de LDM en la lista de selección";

@XendraField(AD_Column_ID="IsPickListPrintDetails",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsSummary@='N' & @IsBOM@='Y'",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="2bc3a144-d283-8615-9deb-b728531b8b90")
public static final String FIELDNAME_ExpenseProduct_PrintDetailRecordsOnPickList="2bc3a144-d283-8615-9deb-b728531b8b90";

@XendraTrl(Identifier="ce22a968-ab9a-0bf9-dde5-976f9e6b1257")
public static String es_PE_FIELD_ResourceProduct_PrintDetailRecordsOnPickList_Name="Imprimir detalle en lista de recolección";

@XendraTrl(Identifier="ce22a968-ab9a-0bf9-dde5-976f9e6b1257")
public static String es_PE_FIELD_ResourceProduct_PrintDetailRecordsOnPickList_Help="El Imprimir detalles en la lista de selección indica que los elementos de la lista de materiales se imprimirán en la lista de selección en contraposición a este producto.";

@XendraTrl(Identifier="ce22a968-ab9a-0bf9-dde5-976f9e6b1257")
public static String es_PE_FIELD_ResourceProduct_PrintDetailRecordsOnPickList_Description="Imprimir detalle de elementos de LDM en la lista de selección";

@XendraField(AD_Column_ID="IsPickListPrintDetails",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsSummary@='N' & @IsBOM@='Y'",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="ce22a968-ab9a-0bf9-dde5-976f9e6b1257")
public static final String FIELDNAME_ResourceProduct_PrintDetailRecordsOnPickList="ce22a968-ab9a-0bf9-dde5-976f9e6b1257";

@XendraTrl(Identifier="ac2f4919-0194-3700-8d78-b36f15b594ed")
public static String es_PE_FIELD_ProductDimension_PrintDetailRecordsOnPickList_Name="Imprimir detalle en lista de recolección";

@XendraTrl(Identifier="ac2f4919-0194-3700-8d78-b36f15b594ed")
public static String es_PE_FIELD_ProductDimension_PrintDetailRecordsOnPickList_Help="El Imprimir detalles en la lista de selección indica que los elementos de la lista de materiales se imprimirán en la lista de selección en contraposición a este producto.";

@XendraTrl(Identifier="ac2f4919-0194-3700-8d78-b36f15b594ed")
public static String es_PE_FIELD_ProductDimension_PrintDetailRecordsOnPickList_Description="Imprimir detalle de elementos de LDM en la lista de selección";

@XendraField(AD_Column_ID="IsPickListPrintDetails",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ac2f4919-0194-3700-8d78-b36f15b594ed")
public static final String FIELDNAME_ProductDimension_PrintDetailRecordsOnPickList="ac2f4919-0194-3700-8d78-b36f15b594ed";

@XendraTrl(Identifier="a1f71151-53d9-4744-dae5-c9b2df4848ac")
public static String es_PE_FIELD_SelectProduct_PrintDetailRecordsOnPickList_Name="Imprimir detalle en lista de recolección";

@XendraTrl(Identifier="a1f71151-53d9-4744-dae5-c9b2df4848ac")
public static String es_PE_FIELD_SelectProduct_PrintDetailRecordsOnPickList_Help="El Imprimir detalles en la lista de selección indica que los elementos de la lista de materiales se imprimirán en la lista de selección en contraposición a este producto.";

@XendraTrl(Identifier="a1f71151-53d9-4744-dae5-c9b2df4848ac")
public static String es_PE_FIELD_SelectProduct_PrintDetailRecordsOnPickList_Description="Imprimir detalle de elementos de LDM en la lista de selección";

@XendraField(AD_Column_ID="IsPickListPrintDetails",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a1f71151-53d9-4744-dae5-c9b2df4848ac")
public static final String FIELDNAME_SelectProduct_PrintDetailRecordsOnPickList="a1f71151-53d9-4744-dae5-c9b2df4848ac";

@XendraTrl(Identifier="1c416643-32b2-fe12-9d85-afecb855c310")
public static String es_PE_FIELD_Product_PrintDetailRecordsOnPickList2_Name="Imprimir detalle en lista de recolección";

@XendraTrl(Identifier="1c416643-32b2-fe12-9d85-afecb855c310")
public static String es_PE_FIELD_Product_PrintDetailRecordsOnPickList2_Help="El Imprimir detalles en la lista de selección indica que los elementos de la lista de materiales se imprimirán en la lista de selección en contraposición a este producto.";

@XendraTrl(Identifier="1c416643-32b2-fe12-9d85-afecb855c310")
public static String es_PE_FIELD_Product_PrintDetailRecordsOnPickList2_Description="Imprimir detalle de elementos de LDM en la lista de selección";

@XendraField(AD_Column_ID="IsPickListPrintDetails",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N' & @IsBOM@='Y'",DisplayLength=1,IsReadOnly=false,SeqNo=350,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="1c416643-32b2-fe12-9d85-afecb855c310")
public static final String FIELDNAME_Product_PrintDetailRecordsOnPickList2="1c416643-32b2-fe12-9d85-afecb855c310";

@XendraTrl(Identifier="192575d2-570d-75ae-57a5-cf7f6c09859a")
public static String es_PE_COLUMN_IsPickListPrintDetails_Name="Imprimir detalle en lista de recolección";

@XendraColumn(AD_Element_ID="59107fa9-27dd-7294-2ca6-374d403e6220",
ColumnName="IsPickListPrintDetails",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="192575d2-570d-75ae-57a5-cf7f6c09859a",Synchronized="2022-04-26 19:23:03.0")
/** Column name IsPickListPrintDetails */
public static final String COLUMNNAME_IsPickListPrintDetails = "IsPickListPrintDetails";
/** Set Purchased.
@param IsPurchased Organization purchases this product */
public void setIsPurchased (boolean IsPurchased)
{
set_Value (COLUMNNAME_IsPurchased, Boolean.valueOf(IsPurchased));
}
/** Get Purchased.
@return Organization purchases this product */
public boolean isPurchased() 
{
Object oo = get_Value(COLUMNNAME_IsPurchased);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="4268004a-815a-d180-a112-dce7be3d4fa8")
public static String es_PE_FIELD_Product_Purchased_Name="Comprado";

@XendraTrl(Identifier="4268004a-815a-d180-a112-dce7be3d4fa8")
public static String es_PE_FIELD_Product_Purchased_Help="El cuadro de verificación comprado indica si este producto es comprado por esta organización";

@XendraTrl(Identifier="4268004a-815a-d180-a112-dce7be3d4fa8")
public static String es_PE_FIELD_Product_Purchased_Description="Organización que compra este producto";

@XendraField(AD_Column_ID="IsPurchased",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N'",DisplayLength=1,IsReadOnly=false,SeqNo=360,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4268004a-815a-d180-a112-dce7be3d4fa8")
public static final String FIELDNAME_Product_Purchased="4268004a-815a-d180-a112-dce7be3d4fa8";

@XendraTrl(Identifier="f5b736ca-d582-2260-2770-45f052bcd466")
public static String es_PE_FIELD_AssignedProducts_Purchased_Name="Comprado";

@XendraTrl(Identifier="f5b736ca-d582-2260-2770-45f052bcd466")
public static String es_PE_FIELD_AssignedProducts_Purchased_Help="El cuadro de verificación comprado indica si este producto es comprado por esta organización";

@XendraTrl(Identifier="f5b736ca-d582-2260-2770-45f052bcd466")
public static String es_PE_FIELD_AssignedProducts_Purchased_Description="Organización que compra este producto";

@XendraField(AD_Column_ID="IsPurchased",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f5b736ca-d582-2260-2770-45f052bcd466")
public static final String FIELDNAME_AssignedProducts_Purchased="f5b736ca-d582-2260-2770-45f052bcd466";

@XendraTrl(Identifier="b0768ef6-11a3-fafb-8ed5-d0645c5eb0de")
public static String es_PE_FIELD_ExpenseProduct_Purchased_Name="Comprado";

@XendraTrl(Identifier="b0768ef6-11a3-fafb-8ed5-d0645c5eb0de")
public static String es_PE_FIELD_ExpenseProduct_Purchased_Help="El cuadro de verificación comprado indica si este producto es comprado por esta organización";

@XendraTrl(Identifier="b0768ef6-11a3-fafb-8ed5-d0645c5eb0de")
public static String es_PE_FIELD_ExpenseProduct_Purchased_Description="Organización que compra este producto";

@XendraField(AD_Column_ID="IsPurchased",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N'",DisplayLength=1,IsReadOnly=false,SeqNo=190,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b0768ef6-11a3-fafb-8ed5-d0645c5eb0de")
public static final String FIELDNAME_ExpenseProduct_Purchased="b0768ef6-11a3-fafb-8ed5-d0645c5eb0de";

@XendraTrl(Identifier="2e66cd4c-499d-1dc7-a9f4-8d1369e395ed")
public static String es_PE_FIELD_ResourceProduct_Purchased_Name="Comprado";

@XendraTrl(Identifier="2e66cd4c-499d-1dc7-a9f4-8d1369e395ed")
public static String es_PE_FIELD_ResourceProduct_Purchased_Help="El cuadro de verificación comprado indica si este producto es comprado por esta organización";

@XendraTrl(Identifier="2e66cd4c-499d-1dc7-a9f4-8d1369e395ed")
public static String es_PE_FIELD_ResourceProduct_Purchased_Description="Organización que compra este producto";

@XendraField(AD_Column_ID="IsPurchased",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N'",DisplayLength=1,IsReadOnly=false,SeqNo=190,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="2e66cd4c-499d-1dc7-a9f4-8d1369e395ed")
public static final String FIELDNAME_ResourceProduct_Purchased="2e66cd4c-499d-1dc7-a9f4-8d1369e395ed";

@XendraTrl(Identifier="b218edcb-9cd4-8232-2959-abbf069a5755")
public static String es_PE_FIELD_ProductDimension_Purchased_Name="Comprado";

@XendraTrl(Identifier="b218edcb-9cd4-8232-2959-abbf069a5755")
public static String es_PE_FIELD_ProductDimension_Purchased_Help="El cuadro de verificación comprado indica si este producto es comprado por esta organización";

@XendraTrl(Identifier="b218edcb-9cd4-8232-2959-abbf069a5755")
public static String es_PE_FIELD_ProductDimension_Purchased_Description="Organización que compra este producto";

@XendraField(AD_Column_ID="IsPurchased",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b218edcb-9cd4-8232-2959-abbf069a5755")
public static final String FIELDNAME_ProductDimension_Purchased="b218edcb-9cd4-8232-2959-abbf069a5755";

@XendraTrl(Identifier="fdc91c8c-16aa-a666-cc8b-ce232466094a")
public static String es_PE_FIELD_SelectProduct_Purchased_Name="Comprado";

@XendraTrl(Identifier="fdc91c8c-16aa-a666-cc8b-ce232466094a")
public static String es_PE_FIELD_SelectProduct_Purchased_Help="El cuadro de verificación comprado indica si este producto es comprado por esta organización";

@XendraTrl(Identifier="fdc91c8c-16aa-a666-cc8b-ce232466094a")
public static String es_PE_FIELD_SelectProduct_Purchased_Description="Organización que compra este producto";

@XendraField(AD_Column_ID="IsPurchased",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fdc91c8c-16aa-a666-cc8b-ce232466094a")
public static final String FIELDNAME_SelectProduct_Purchased="fdc91c8c-16aa-a666-cc8b-ce232466094a";

@XendraTrl(Identifier="0d9a925d-de55-121a-986d-344e0846b8c7")
public static String es_PE_FIELD_Product_Purchased2_Name="Comprado";

@XendraTrl(Identifier="0d9a925d-de55-121a-986d-344e0846b8c7")
public static String es_PE_FIELD_Product_Purchased2_Help="El cuadro de verificación comprado indica si este producto es comprado por esta organización";

@XendraTrl(Identifier="0d9a925d-de55-121a-986d-344e0846b8c7")
public static String es_PE_FIELD_Product_Purchased2_Description="Organización que compra este producto";

@XendraField(AD_Column_ID="IsPurchased",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N'",DisplayLength=1,IsReadOnly=false,SeqNo=360,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="0d9a925d-de55-121a-986d-344e0846b8c7")
public static final String FIELDNAME_Product_Purchased2="0d9a925d-de55-121a-986d-344e0846b8c7";

@XendraTrl(Identifier="6c043dd2-5ffe-85d9-6b0b-d89a4305af64")
public static String es_PE_COLUMN_IsPurchased_Name="Comprado";

@XendraColumn(AD_Element_ID="bb82b5f4-16ad-650d-d20c-0118aa7b9888",ColumnName="IsPurchased",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6c043dd2-5ffe-85d9-6b0b-d89a4305af64",
Synchronized="2022-04-26 19:23:03.0")
/** Column name IsPurchased */
public static final String COLUMNNAME_IsPurchased = "IsPurchased";
/** Set Self-Service.
@param IsSelfService This is a Self-Service entry or this entry can be changed via Self-Service */
public void setIsSelfService (boolean IsSelfService)
{
set_Value (COLUMNNAME_IsSelfService, Boolean.valueOf(IsSelfService));
}
/** Get Self-Service.
@return This is a Self-Service entry or this entry can be changed via Self-Service */
public boolean isSelfService() 
{
Object oo = get_Value(COLUMNNAME_IsSelfService);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="b6bfbc3d-ac15-1357-a620-d12872a94a6e")
public static String es_PE_FIELD_Product_Self_Service_Name="Auto-Servicio";

@XendraTrl(Identifier="b6bfbc3d-ac15-1357-a620-d12872a94a6e")
public static String es_PE_FIELD_Product_Self_Service_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraTrl(Identifier="b6bfbc3d-ac15-1357-a620-d12872a94a6e")
public static String es_PE_FIELD_Product_Self_Service_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N'",DisplayLength=1,IsReadOnly=false,SeqNo=420,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b6bfbc3d-ac15-1357-a620-d12872a94a6e")
public static final String FIELDNAME_Product_Self_Service="b6bfbc3d-ac15-1357-a620-d12872a94a6e";

@XendraTrl(Identifier="62ee039b-a504-c1ee-dbe7-0d291f04c1a8")
public static String es_PE_FIELD_AssignedProducts_Self_Service_Name="Auto-Servicio";

@XendraTrl(Identifier="62ee039b-a504-c1ee-dbe7-0d291f04c1a8")
public static String es_PE_FIELD_AssignedProducts_Self_Service_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraTrl(Identifier="62ee039b-a504-c1ee-dbe7-0d291f04c1a8")
public static String es_PE_FIELD_AssignedProducts_Self_Service_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="62ee039b-a504-c1ee-dbe7-0d291f04c1a8")
public static final String FIELDNAME_AssignedProducts_Self_Service="62ee039b-a504-c1ee-dbe7-0d291f04c1a8";

@XendraTrl(Identifier="bed93ac0-38c4-6d25-7c17-e686ce656a86")
public static String es_PE_FIELD_ExpenseProduct_Self_Service_Name="Auto-Servicio";

@XendraTrl(Identifier="bed93ac0-38c4-6d25-7c17-e686ce656a86")
public static String es_PE_FIELD_ExpenseProduct_Self_Service_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraTrl(Identifier="bed93ac0-38c4-6d25-7c17-e686ce656a86")
public static String es_PE_FIELD_ExpenseProduct_Self_Service_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bed93ac0-38c4-6d25-7c17-e686ce656a86")
public static final String FIELDNAME_ExpenseProduct_Self_Service="bed93ac0-38c4-6d25-7c17-e686ce656a86";

@XendraTrl(Identifier="50627076-206c-5bb6-19de-a874da3acce8")
public static String es_PE_FIELD_ResourceProduct_Self_Service_Name="Auto-Servicio";

@XendraTrl(Identifier="50627076-206c-5bb6-19de-a874da3acce8")
public static String es_PE_FIELD_ResourceProduct_Self_Service_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraTrl(Identifier="50627076-206c-5bb6-19de-a874da3acce8")
public static String es_PE_FIELD_ResourceProduct_Self_Service_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="50627076-206c-5bb6-19de-a874da3acce8")
public static final String FIELDNAME_ResourceProduct_Self_Service="50627076-206c-5bb6-19de-a874da3acce8";

@XendraTrl(Identifier="7013887a-ccf5-4b9e-f124-2c49b3a69441")
public static String es_PE_FIELD_ProductDimension_Self_Service_Name="Auto-Servicio";

@XendraTrl(Identifier="7013887a-ccf5-4b9e-f124-2c49b3a69441")
public static String es_PE_FIELD_ProductDimension_Self_Service_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraTrl(Identifier="7013887a-ccf5-4b9e-f124-2c49b3a69441")
public static String es_PE_FIELD_ProductDimension_Self_Service_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7013887a-ccf5-4b9e-f124-2c49b3a69441")
public static final String FIELDNAME_ProductDimension_Self_Service="7013887a-ccf5-4b9e-f124-2c49b3a69441";

@XendraTrl(Identifier="7d6be0cc-c66e-de75-b60f-2b3877284735")
public static String es_PE_FIELD_SelectProduct_Self_Service_Name="Auto-Servicio";

@XendraTrl(Identifier="7d6be0cc-c66e-de75-b60f-2b3877284735")
public static String es_PE_FIELD_SelectProduct_Self_Service_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraTrl(Identifier="7d6be0cc-c66e-de75-b60f-2b3877284735")
public static String es_PE_FIELD_SelectProduct_Self_Service_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7d6be0cc-c66e-de75-b60f-2b3877284735")
public static final String FIELDNAME_SelectProduct_Self_Service="7d6be0cc-c66e-de75-b60f-2b3877284735";

@XendraTrl(Identifier="4f8a7c0a-3d43-9050-4e38-ebaf49d4668a")
public static String es_PE_FIELD_Product_Self_Service2_Name="Auto-Servicio";

@XendraTrl(Identifier="4f8a7c0a-3d43-9050-4e38-ebaf49d4668a")
public static String es_PE_FIELD_Product_Self_Service2_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraTrl(Identifier="4f8a7c0a-3d43-9050-4e38-ebaf49d4668a")
public static String es_PE_FIELD_Product_Self_Service2_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=470,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4f8a7c0a-3d43-9050-4e38-ebaf49d4668a")
public static final String FIELDNAME_Product_Self_Service2="4f8a7c0a-3d43-9050-4e38-ebaf49d4668a";

@XendraTrl(Identifier="f6bfca30-d27e-3c25-ba64-dde293728dab")
public static String es_PE_COLUMN_IsSelfService_Name="Auto-Servicio";

@XendraColumn(AD_Element_ID="8f201030-f9ab-66d2-f4de-7209f41f2af8",ColumnName="IsSelfService",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f6bfca30-d27e-3c25-ba64-dde293728dab",
Synchronized="2022-04-26 19:23:03.0")
/** Column name IsSelfService */
public static final String COLUMNNAME_IsSelfService = "IsSelfService";
/** Set Sold.
@param IsSold Organization sells this product */
public void setIsSold (boolean IsSold)
{
set_Value (COLUMNNAME_IsSold, Boolean.valueOf(IsSold));
}
/** Get Sold.
@return Organization sells this product */
public boolean isSold() 
{
Object oo = get_Value(COLUMNNAME_IsSold);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="11ec6527-b64f-4487-8454-82d3c1ccd319")
public static String es_PE_FIELD_Product_Sold_Name="Vendido";

@XendraTrl(Identifier="11ec6527-b64f-4487-8454-82d3c1ccd319")
public static String es_PE_FIELD_Product_Sold_Help="El cuadro de verificación vendido indica si este producto es vendido por esta organización";

@XendraTrl(Identifier="11ec6527-b64f-4487-8454-82d3c1ccd319")
public static String es_PE_FIELD_Product_Sold_Description="La Organización vende este producto";

@XendraField(AD_Column_ID="IsSold",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N'",DisplayLength=1,IsReadOnly=false,SeqNo=370,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="11ec6527-b64f-4487-8454-82d3c1ccd319")
public static final String FIELDNAME_Product_Sold="11ec6527-b64f-4487-8454-82d3c1ccd319";

@XendraTrl(Identifier="47e2c514-b3c2-d068-7b5c-12db61c6731b")
public static String es_PE_FIELD_AssignedProducts_Sold_Name="Vendido";

@XendraTrl(Identifier="47e2c514-b3c2-d068-7b5c-12db61c6731b")
public static String es_PE_FIELD_AssignedProducts_Sold_Help="El cuadro de verificación vendido indica si este producto es vendido por esta organización";

@XendraTrl(Identifier="47e2c514-b3c2-d068-7b5c-12db61c6731b")
public static String es_PE_FIELD_AssignedProducts_Sold_Description="La Organización vende este producto";

@XendraField(AD_Column_ID="IsSold",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="47e2c514-b3c2-d068-7b5c-12db61c6731b")
public static final String FIELDNAME_AssignedProducts_Sold="47e2c514-b3c2-d068-7b5c-12db61c6731b";

@XendraTrl(Identifier="b097a153-c558-13fb-da37-739fe895a63a")
public static String es_PE_FIELD_ExpenseProduct_Sold_Name="Vendido";

@XendraTrl(Identifier="b097a153-c558-13fb-da37-739fe895a63a")
public static String es_PE_FIELD_ExpenseProduct_Sold_Help="El cuadro de verificación vendido indica si este producto es vendido por esta organización";

@XendraTrl(Identifier="b097a153-c558-13fb-da37-739fe895a63a")
public static String es_PE_FIELD_ExpenseProduct_Sold_Description="La Organización vende este producto";

@XendraField(AD_Column_ID="IsSold",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N'",DisplayLength=1,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b097a153-c558-13fb-da37-739fe895a63a")
public static final String FIELDNAME_ExpenseProduct_Sold="b097a153-c558-13fb-da37-739fe895a63a";

@XendraTrl(Identifier="7f9e9298-f77c-fe62-9ab6-6d3015a7bdd6")
public static String es_PE_FIELD_ResourceProduct_Sold_Name="Vendido";

@XendraTrl(Identifier="7f9e9298-f77c-fe62-9ab6-6d3015a7bdd6")
public static String es_PE_FIELD_ResourceProduct_Sold_Help="El cuadro de verificación vendido indica si este producto es vendido por esta organización";

@XendraTrl(Identifier="7f9e9298-f77c-fe62-9ab6-6d3015a7bdd6")
public static String es_PE_FIELD_ResourceProduct_Sold_Description="La Organización vende este producto";

@XendraField(AD_Column_ID="IsSold",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N'",DisplayLength=1,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7f9e9298-f77c-fe62-9ab6-6d3015a7bdd6")
public static final String FIELDNAME_ResourceProduct_Sold="7f9e9298-f77c-fe62-9ab6-6d3015a7bdd6";

@XendraTrl(Identifier="bcd358bc-fd77-42c0-8900-03a7bd338cec")
public static String es_PE_FIELD_ProductDimension_Sold_Name="Vendido";

@XendraTrl(Identifier="bcd358bc-fd77-42c0-8900-03a7bd338cec")
public static String es_PE_FIELD_ProductDimension_Sold_Help="El cuadro de verificación vendido indica si este producto es vendido por esta organización";

@XendraTrl(Identifier="bcd358bc-fd77-42c0-8900-03a7bd338cec")
public static String es_PE_FIELD_ProductDimension_Sold_Description="La Organización vende este producto";

@XendraField(AD_Column_ID="IsSold",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bcd358bc-fd77-42c0-8900-03a7bd338cec")
public static final String FIELDNAME_ProductDimension_Sold="bcd358bc-fd77-42c0-8900-03a7bd338cec";

@XendraTrl(Identifier="279b9565-913e-a6af-4928-6bab0b97bcd5")
public static String es_PE_FIELD_SelectProduct_Sold_Name="Vendido";

@XendraTrl(Identifier="279b9565-913e-a6af-4928-6bab0b97bcd5")
public static String es_PE_FIELD_SelectProduct_Sold_Help="El cuadro de verificación vendido indica si este producto es vendido por esta organización";

@XendraTrl(Identifier="279b9565-913e-a6af-4928-6bab0b97bcd5")
public static String es_PE_FIELD_SelectProduct_Sold_Description="La Organización vende este producto";

@XendraField(AD_Column_ID="IsSold",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="279b9565-913e-a6af-4928-6bab0b97bcd5")
public static final String FIELDNAME_SelectProduct_Sold="279b9565-913e-a6af-4928-6bab0b97bcd5";

@XendraTrl(Identifier="73e13886-f836-3aab-6180-900fad5eea10")
public static String es_PE_FIELD_Product_Sold2_Name="Vendido";

@XendraTrl(Identifier="73e13886-f836-3aab-6180-900fad5eea10")
public static String es_PE_FIELD_Product_Sold2_Help="El cuadro de verificación vendido indica si este producto es vendido por esta organización";

@XendraTrl(Identifier="73e13886-f836-3aab-6180-900fad5eea10")
public static String es_PE_FIELD_Product_Sold2_Description="La Organización vende este producto";

@XendraField(AD_Column_ID="IsSold",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N'",DisplayLength=1,IsReadOnly=false,SeqNo=370,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="73e13886-f836-3aab-6180-900fad5eea10")
public static final String FIELDNAME_Product_Sold2="73e13886-f836-3aab-6180-900fad5eea10";

@XendraTrl(Identifier="5c97f49d-6c74-14d6-28f8-929ccdeba487")
public static String es_PE_COLUMN_IsSold_Name="Vendido";

@XendraColumn(AD_Element_ID="053d92cc-87fe-b62f-dcca-e2a431775df4",ColumnName="IsSold",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5c97f49d-6c74-14d6-28f8-929ccdeba487",
Synchronized="2022-04-26 19:23:03.0")
/** Column name IsSold */
public static final String COLUMNNAME_IsSold = "IsSold";
/** Set Stocked.
@param IsStocked Organization stocks this product */
public void setIsStocked (boolean IsStocked)
{
set_Value (COLUMNNAME_IsStocked, Boolean.valueOf(IsStocked));
}
/** Get Stocked.
@return Organization stocks this product */
public boolean isStocked() 
{
Object oo = get_Value(COLUMNNAME_IsStocked);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="304ce511-52b3-764e-2b8b-c25f6cb8287c")
public static String es_PE_FIELD_Product_Stocked_Name="Almacenado";

@XendraTrl(Identifier="304ce511-52b3-764e-2b8b-c25f6cb8287c")
public static String es_PE_FIELD_Product_Stocked_Help="El Cuadro de Verificación Almacenado indica si este producto es almacenado por esta organización";

@XendraTrl(Identifier="304ce511-52b3-764e-2b8b-c25f6cb8287c")
public static String es_PE_FIELD_Product_Stocked_Description="La Organización almacena este producto";

@XendraField(AD_Column_ID="IsStocked",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N' & @ProductType@=I",DisplayLength=1,IsReadOnly=false,SeqNo=250,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="304ce511-52b3-764e-2b8b-c25f6cb8287c")
public static final String FIELDNAME_Product_Stocked="304ce511-52b3-764e-2b8b-c25f6cb8287c";

@XendraTrl(Identifier="10667868-c614-af99-872e-aaa28bcb1522")
public static String es_PE_FIELD_AssignedProducts_Stocked_Name="Almacenado";

@XendraTrl(Identifier="10667868-c614-af99-872e-aaa28bcb1522")
public static String es_PE_FIELD_AssignedProducts_Stocked_Help="El Cuadro de Verificación Almacenado indica si este producto es almacenado por esta organización";

@XendraTrl(Identifier="10667868-c614-af99-872e-aaa28bcb1522")
public static String es_PE_FIELD_AssignedProducts_Stocked_Description="La Organización almacena este producto";

@XendraField(AD_Column_ID="IsStocked",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="10667868-c614-af99-872e-aaa28bcb1522")
public static final String FIELDNAME_AssignedProducts_Stocked="10667868-c614-af99-872e-aaa28bcb1522";

@XendraTrl(Identifier="26dcbd32-cc15-0f36-0854-d8d910f43e8d")
public static String es_PE_FIELD_ExpenseProduct_Stocked_Name="Almacenado";

@XendraTrl(Identifier="26dcbd32-cc15-0f36-0854-d8d910f43e8d")
public static String es_PE_FIELD_ExpenseProduct_Stocked_Help="El Cuadro de Verificación Almacenado indica si este producto es almacenado por esta organización";

@XendraTrl(Identifier="26dcbd32-cc15-0f36-0854-d8d910f43e8d")
public static String es_PE_FIELD_ExpenseProduct_Stocked_Description="La Organización almacena este producto";

@XendraField(AD_Column_ID="IsStocked",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsSummary@='N' & @ProductType@=I",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="26dcbd32-cc15-0f36-0854-d8d910f43e8d")
public static final String FIELDNAME_ExpenseProduct_Stocked="26dcbd32-cc15-0f36-0854-d8d910f43e8d";

@XendraTrl(Identifier="43e9231a-5d29-9c5a-db1a-e0721b68b105")
public static String es_PE_FIELD_ResourceProduct_Stocked_Name="Almacenado";

@XendraTrl(Identifier="43e9231a-5d29-9c5a-db1a-e0721b68b105")
public static String es_PE_FIELD_ResourceProduct_Stocked_Help="El Cuadro de Verificación Almacenado indica si este producto es almacenado por esta organización";

@XendraTrl(Identifier="43e9231a-5d29-9c5a-db1a-e0721b68b105")
public static String es_PE_FIELD_ResourceProduct_Stocked_Description="La Organización almacena este producto";

@XendraField(AD_Column_ID="IsStocked",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsSummary@='N' & @ProductType@=I",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="43e9231a-5d29-9c5a-db1a-e0721b68b105")
public static final String FIELDNAME_ResourceProduct_Stocked="43e9231a-5d29-9c5a-db1a-e0721b68b105";

@XendraTrl(Identifier="2d2e864f-5203-c3eb-a617-c5f546121ab4")
public static String es_PE_FIELD_ProductDimension_Stocked_Name="Almacenado";

@XendraTrl(Identifier="2d2e864f-5203-c3eb-a617-c5f546121ab4")
public static String es_PE_FIELD_ProductDimension_Stocked_Help="El Cuadro de Verificación Almacenado indica si este producto es almacenado por esta organización";

@XendraTrl(Identifier="2d2e864f-5203-c3eb-a617-c5f546121ab4")
public static String es_PE_FIELD_ProductDimension_Stocked_Description="La Organización almacena este producto";

@XendraField(AD_Column_ID="IsStocked",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2d2e864f-5203-c3eb-a617-c5f546121ab4")
public static final String FIELDNAME_ProductDimension_Stocked="2d2e864f-5203-c3eb-a617-c5f546121ab4";

@XendraTrl(Identifier="2d338d27-df38-2b42-beef-aad4f4659ca4")
public static String es_PE_FIELD_SelectProduct_Stocked_Name="Almacenado";

@XendraTrl(Identifier="2d338d27-df38-2b42-beef-aad4f4659ca4")
public static String es_PE_FIELD_SelectProduct_Stocked_Help="El Cuadro de Verificación Almacenado indica si este producto es almacenado por esta organización";

@XendraTrl(Identifier="2d338d27-df38-2b42-beef-aad4f4659ca4")
public static String es_PE_FIELD_SelectProduct_Stocked_Description="La Organización almacena este producto";

@XendraField(AD_Column_ID="IsStocked",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2d338d27-df38-2b42-beef-aad4f4659ca4")
public static final String FIELDNAME_SelectProduct_Stocked="2d338d27-df38-2b42-beef-aad4f4659ca4";

@XendraTrl(Identifier="5f980bd1-91f8-196c-179e-31fd8d10b7fa")
public static String es_PE_FIELD_Product_Stocked2_Name="Almacenado";

@XendraTrl(Identifier="5f980bd1-91f8-196c-179e-31fd8d10b7fa")
public static String es_PE_FIELD_Product_Stocked2_Help="El Cuadro de Verificación Almacenado indica si este producto es almacenado por esta organización";

@XendraTrl(Identifier="5f980bd1-91f8-196c-179e-31fd8d10b7fa")
public static String es_PE_FIELD_Product_Stocked2_Description="La Organización almacena este producto";

@XendraField(AD_Column_ID="IsStocked",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N' & @ProductType@=I",DisplayLength=1,IsReadOnly=false,SeqNo=250,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="5f980bd1-91f8-196c-179e-31fd8d10b7fa")
public static final String FIELDNAME_Product_Stocked2="5f980bd1-91f8-196c-179e-31fd8d10b7fa";

@XendraTrl(Identifier="fd2e6375-efbc-b207-f470-ec2f24006683")
public static String es_PE_COLUMN_IsStocked_Name="Almacenado";

@XendraColumn(AD_Element_ID="6e03d9e0-c7b4-24f3-752f-ebeeae253740",ColumnName="IsStocked",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,
ReadOnlyLogic="@ProductType@=R | @ProductType@=E | @ProductType@=O",IsIdentifier=false,SeqNo=0,
IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fd2e6375-efbc-b207-f470-ec2f24006683",
Synchronized="2022-04-26 19:23:03.0")
/** Column name IsStocked */
public static final String COLUMNNAME_IsStocked = "IsStocked";
/** Set Summary Level.
@param IsSummary This is a summary entity */
public void setIsSummary (boolean IsSummary)
{
set_Value (COLUMNNAME_IsSummary, Boolean.valueOf(IsSummary));
}
/** Get Summary Level.
@return This is a summary entity */
public boolean isSummary() 
{
Object oo = get_Value(COLUMNNAME_IsSummary);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="5aeb1373-b452-d435-f331-219c8f2ca60c")
public static String es_PE_FIELD_Product_SummaryLevel_Name="Entidad Acumulada";

@XendraTrl(Identifier="5aeb1373-b452-d435-f331-219c8f2ca60c")
public static String es_PE_FIELD_Product_SummaryLevel_Help="Una entidad sumaria representa una rama en un árbol mas bien que un nodo final. Las entidades sumarias son usadas para reportar y no tienen valores propios";

@XendraTrl(Identifier="5aeb1373-b452-d435-f331-219c8f2ca60c")
public static String es_PE_FIELD_Product_SummaryLevel_Description="Esta es una entidad sumaria";

@XendraField(AD_Column_ID="IsSummary",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5aeb1373-b452-d435-f331-219c8f2ca60c")
public static final String FIELDNAME_Product_SummaryLevel="5aeb1373-b452-d435-f331-219c8f2ca60c";

@XendraTrl(Identifier="c000f2f0-9a44-b25d-5ed4-19f69b90d70c")
public static String es_PE_FIELD_AssignedProducts_SummaryLevel_Name="Entidad Acumulada";

@XendraTrl(Identifier="c000f2f0-9a44-b25d-5ed4-19f69b90d70c")
public static String es_PE_FIELD_AssignedProducts_SummaryLevel_Help="Una entidad sumaria representa una rama en un árbol mas bien que un nodo final. Las entidades sumarias son usadas para reportar y no tienen valores propios";

@XendraTrl(Identifier="c000f2f0-9a44-b25d-5ed4-19f69b90d70c")
public static String es_PE_FIELD_AssignedProducts_SummaryLevel_Description="Esta es una entidad sumaria";

@XendraField(AD_Column_ID="IsSummary",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c000f2f0-9a44-b25d-5ed4-19f69b90d70c")
public static final String FIELDNAME_AssignedProducts_SummaryLevel="c000f2f0-9a44-b25d-5ed4-19f69b90d70c";

@XendraTrl(Identifier="9ad945dd-db59-fbbf-9229-bcfdd0f23a53")
public static String es_PE_FIELD_ExpenseProduct_SummaryLevel_Name="Entidad Acumulada";

@XendraTrl(Identifier="9ad945dd-db59-fbbf-9229-bcfdd0f23a53")
public static String es_PE_FIELD_ExpenseProduct_SummaryLevel_Help="Una entidad sumaria representa una rama en un árbol mas bien que un nodo final. Las entidades sumarias son usadas para reportar y no tienen valores propios";

@XendraTrl(Identifier="9ad945dd-db59-fbbf-9229-bcfdd0f23a53")
public static String es_PE_FIELD_ExpenseProduct_SummaryLevel_Description="Esta es una entidad sumaria";

@XendraField(AD_Column_ID="IsSummary",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9ad945dd-db59-fbbf-9229-bcfdd0f23a53")
public static final String FIELDNAME_ExpenseProduct_SummaryLevel="9ad945dd-db59-fbbf-9229-bcfdd0f23a53";

@XendraTrl(Identifier="b1b867ed-6931-46d3-32dc-d9777f889465")
public static String es_PE_FIELD_ResourceProduct_SummaryLevel_Name="Entidad Acumulada";

@XendraTrl(Identifier="b1b867ed-6931-46d3-32dc-d9777f889465")
public static String es_PE_FIELD_ResourceProduct_SummaryLevel_Help="Una entidad sumaria representa una rama en un árbol mas bien que un nodo final. Las entidades sumarias son usadas para reportar y no tienen valores propios";

@XendraTrl(Identifier="b1b867ed-6931-46d3-32dc-d9777f889465")
public static String es_PE_FIELD_ResourceProduct_SummaryLevel_Description="Esta es una entidad sumaria";

@XendraField(AD_Column_ID="IsSummary",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b1b867ed-6931-46d3-32dc-d9777f889465")
public static final String FIELDNAME_ResourceProduct_SummaryLevel="b1b867ed-6931-46d3-32dc-d9777f889465";

@XendraTrl(Identifier="06cc2b36-dd1c-2ec4-168b-39ab1fa17e2d")
public static String es_PE_FIELD_ProductDimension_SummaryLevel_Name="Entidad Acumulada";

@XendraTrl(Identifier="06cc2b36-dd1c-2ec4-168b-39ab1fa17e2d")
public static String es_PE_FIELD_ProductDimension_SummaryLevel_Help="Una entidad sumaria representa una rama en un árbol mas bien que un nodo final. Las entidades sumarias son usadas para reportar y no tienen valores propios";

@XendraTrl(Identifier="06cc2b36-dd1c-2ec4-168b-39ab1fa17e2d")
public static String es_PE_FIELD_ProductDimension_SummaryLevel_Description="Esta es una entidad sumaria";

@XendraField(AD_Column_ID="IsSummary",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="06cc2b36-dd1c-2ec4-168b-39ab1fa17e2d")
public static final String FIELDNAME_ProductDimension_SummaryLevel="06cc2b36-dd1c-2ec4-168b-39ab1fa17e2d";

@XendraTrl(Identifier="322f3f05-c953-1e13-22a1-b92077473824")
public static String es_PE_FIELD_SelectProduct_SummaryLevel_Name="Entidad Acumulada";

@XendraTrl(Identifier="322f3f05-c953-1e13-22a1-b92077473824")
public static String es_PE_FIELD_SelectProduct_SummaryLevel_Help="Una entidad sumaria representa una rama en un árbol mas bien que un nodo final. Las entidades sumarias son usadas para reportar y no tienen valores propios";

@XendraTrl(Identifier="322f3f05-c953-1e13-22a1-b92077473824")
public static String es_PE_FIELD_SelectProduct_SummaryLevel_Description="Esta es una entidad sumaria";

@XendraField(AD_Column_ID="IsSummary",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="322f3f05-c953-1e13-22a1-b92077473824")
public static final String FIELDNAME_SelectProduct_SummaryLevel="322f3f05-c953-1e13-22a1-b92077473824";

@XendraTrl(Identifier="92dcfc0f-7772-ed12-f094-c06144b0c403")
public static String es_PE_FIELD_Product_SummaryLevel2_Name="Entidad Acumulada";

@XendraTrl(Identifier="92dcfc0f-7772-ed12-f094-c06144b0c403")
public static String es_PE_FIELD_Product_SummaryLevel2_Help="Una entidad sumaria representa una rama en un árbol mas bien que un nodo final. Las entidades sumarias son usadas para reportar y no tienen valores propios";

@XendraTrl(Identifier="92dcfc0f-7772-ed12-f094-c06144b0c403")
public static String es_PE_FIELD_Product_SummaryLevel2_Description="Esta es una entidad sumaria";

@XendraField(AD_Column_ID="IsSummary",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="92dcfc0f-7772-ed12-f094-c06144b0c403")
public static final String FIELDNAME_Product_SummaryLevel2="92dcfc0f-7772-ed12-f094-c06144b0c403";

@XendraTrl(Identifier="a7815f72-c6be-14fe-1483-e627f7b37068")
public static String es_PE_COLUMN_IsSummary_Name="Entidad Acumulada";

@XendraColumn(AD_Element_ID="0ecd1d56-9e2b-8778-7b05-92730d811ad4",ColumnName="IsSummary",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a7815f72-c6be-14fe-1483-e627f7b37068",
Synchronized="2022-04-26 19:23:03.0")
/** Column name IsSummary */
public static final String COLUMNNAME_IsSummary = "IsSummary";
/** Set Verified.
@param IsVerified The BOM configuration has been verified */
public void setIsVerified (boolean IsVerified)
{
set_ValueNoCheck (COLUMNNAME_IsVerified, Boolean.valueOf(IsVerified));
}
/** Get Verified.
@return The BOM configuration has been verified */
public boolean isVerified() 
{
Object oo = get_Value(COLUMNNAME_IsVerified);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="60829e33-63c3-e0b0-4ec9-2802065c77f9")
public static String es_PE_FIELD_Product_Verified_Name="Verificado";

@XendraTrl(Identifier="60829e33-63c3-e0b0-4ec9-2802065c77f9")
public static String es_PE_FIELD_Product_Verified_Help="El cuadro de  verificación verificado indica si la configuración de este producto ha sido verificada. Este es usado para productos que constan de una lista de materiales.";

@XendraTrl(Identifier="60829e33-63c3-e0b0-4ec9-2802065c77f9")
public static String es_PE_FIELD_Product_Verified_Description="La configuración de LDM ha sido verificada";

@XendraField(AD_Column_ID="IsVerified",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N' & @IsBOM@='Y'",DisplayLength=1,IsReadOnly=false,SeqNo=320,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="60829e33-63c3-e0b0-4ec9-2802065c77f9")
public static final String FIELDNAME_Product_Verified="60829e33-63c3-e0b0-4ec9-2802065c77f9";

@XendraTrl(Identifier="53ae0dc7-88a6-d4e2-e17a-85f042b74869")
public static String es_PE_FIELD_AssignedProducts_Verified_Name="Verificado";

@XendraTrl(Identifier="53ae0dc7-88a6-d4e2-e17a-85f042b74869")
public static String es_PE_FIELD_AssignedProducts_Verified_Help="El cuadro de  verificación verificado indica si la configuración de este producto ha sido verificada. Este es usado para productos que constan de una lista de materiales.";

@XendraTrl(Identifier="53ae0dc7-88a6-d4e2-e17a-85f042b74869")
public static String es_PE_FIELD_AssignedProducts_Verified_Description="La configuración de LDM ha sido verificada";

@XendraField(AD_Column_ID="IsVerified",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="53ae0dc7-88a6-d4e2-e17a-85f042b74869")
public static final String FIELDNAME_AssignedProducts_Verified="53ae0dc7-88a6-d4e2-e17a-85f042b74869";

@XendraTrl(Identifier="792239b5-15af-3f33-9c3c-69fa11aa34a9")
public static String es_PE_FIELD_ExpenseProduct_Verified_Name="Verificado";

@XendraTrl(Identifier="792239b5-15af-3f33-9c3c-69fa11aa34a9")
public static String es_PE_FIELD_ExpenseProduct_Verified_Help="El cuadro de  verificación verificado indica si la configuración de este producto ha sido verificada. Este es usado para productos que constan de una lista de materiales.";

@XendraTrl(Identifier="792239b5-15af-3f33-9c3c-69fa11aa34a9")
public static String es_PE_FIELD_ExpenseProduct_Verified_Description="La configuración de LDM ha sido verificada";

@XendraField(AD_Column_ID="IsVerified",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsSummary@='N' & @IsBOM@='Y'",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="792239b5-15af-3f33-9c3c-69fa11aa34a9")
public static final String FIELDNAME_ExpenseProduct_Verified="792239b5-15af-3f33-9c3c-69fa11aa34a9";

@XendraTrl(Identifier="542801da-51c6-c539-8081-894487b42e06")
public static String es_PE_FIELD_ResourceProduct_Verified_Name="Verificado";

@XendraTrl(Identifier="542801da-51c6-c539-8081-894487b42e06")
public static String es_PE_FIELD_ResourceProduct_Verified_Help="El cuadro de  verificación verificado indica si la configuración de este producto ha sido verificada. Este es usado para productos que constan de una lista de materiales.";

@XendraTrl(Identifier="542801da-51c6-c539-8081-894487b42e06")
public static String es_PE_FIELD_ResourceProduct_Verified_Description="La configuración de LDM ha sido verificada";

@XendraField(AD_Column_ID="IsVerified",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsSummary@='N' & @IsBOM@='Y'",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="542801da-51c6-c539-8081-894487b42e06")
public static final String FIELDNAME_ResourceProduct_Verified="542801da-51c6-c539-8081-894487b42e06";

@XendraTrl(Identifier="25009465-ebab-316d-74a5-6c2d739ede3b")
public static String es_PE_FIELD_ProductDimension_Verified_Name="Verificado";

@XendraTrl(Identifier="25009465-ebab-316d-74a5-6c2d739ede3b")
public static String es_PE_FIELD_ProductDimension_Verified_Help="El cuadro de  verificación verificado indica si la configuración de este producto ha sido verificada. Este es usado para productos que constan de una lista de materiales.";

@XendraTrl(Identifier="25009465-ebab-316d-74a5-6c2d739ede3b")
public static String es_PE_FIELD_ProductDimension_Verified_Description="La configuración de LDM ha sido verificada";

@XendraField(AD_Column_ID="IsVerified",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="25009465-ebab-316d-74a5-6c2d739ede3b")
public static final String FIELDNAME_ProductDimension_Verified="25009465-ebab-316d-74a5-6c2d739ede3b";

@XendraTrl(Identifier="fed89c25-40cb-c649-3b7b-9b279468c9a5")
public static String es_PE_FIELD_SelectProduct_Verified_Name="Verificado";

@XendraTrl(Identifier="fed89c25-40cb-c649-3b7b-9b279468c9a5")
public static String es_PE_FIELD_SelectProduct_Verified_Help="El cuadro de  verificación verificado indica si la configuración de este producto ha sido verificada. Este es usado para productos que constan de una lista de materiales.";

@XendraTrl(Identifier="fed89c25-40cb-c649-3b7b-9b279468c9a5")
public static String es_PE_FIELD_SelectProduct_Verified_Description="La configuración de LDM ha sido verificada";

@XendraField(AD_Column_ID="IsVerified",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fed89c25-40cb-c649-3b7b-9b279468c9a5")
public static final String FIELDNAME_SelectProduct_Verified="fed89c25-40cb-c649-3b7b-9b279468c9a5";

@XendraTrl(Identifier="285a4300-0734-c392-c5fe-8beaca341254")
public static String es_PE_FIELD_Product_Verified2_Name="Verificado";

@XendraTrl(Identifier="285a4300-0734-c392-c5fe-8beaca341254")
public static String es_PE_FIELD_Product_Verified2_Help="El cuadro de  verificación verificado indica si la configuración de este producto ha sido verificada. Este es usado para productos que constan de una lista de materiales.";

@XendraTrl(Identifier="285a4300-0734-c392-c5fe-8beaca341254")
public static String es_PE_FIELD_Product_Verified2_Description="La configuración de LDM ha sido verificada";

@XendraField(AD_Column_ID="IsVerified",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N' & @IsBOM@='Y'",DisplayLength=1,IsReadOnly=false,SeqNo=320,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="285a4300-0734-c392-c5fe-8beaca341254")
public static final String FIELDNAME_Product_Verified2="285a4300-0734-c392-c5fe-8beaca341254";

@XendraTrl(Identifier="c0429d43-038e-56c6-9118-ea4f1c883ad4")
public static String es_PE_COLUMN_IsVerified_Name="Verificado";

@XendraColumn(AD_Element_ID="d7fe915f-9703-88ae-2abc-65610ae7b142",ColumnName="IsVerified",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c0429d43-038e-56c6-9118-ea4f1c883ad4",
Synchronized="2022-04-26 19:23:03.0")
/** Column name IsVerified */
public static final String COLUMNNAME_IsVerified = "IsVerified";
/** Set Featured in Web Store.
@param IsWebStoreFeatured If selected, the product is displayed in the inital or any empy search */
public void setIsWebStoreFeatured (boolean IsWebStoreFeatured)
{
set_Value (COLUMNNAME_IsWebStoreFeatured, Boolean.valueOf(IsWebStoreFeatured));
}
/** Get Featured in Web Store.
@return If selected, the product is displayed in the inital or any empy search */
public boolean isWebStoreFeatured() 
{
Object oo = get_Value(COLUMNNAME_IsWebStoreFeatured);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="e9a13bee-9d84-4251-3472-6bd2484cd1e1")
public static String es_PE_FIELD_Product_FeaturedInWebStore_Name="Presentación del Almacen Web";

@XendraTrl(Identifier="e9a13bee-9d84-4251-3472-6bd2484cd1e1")
public static String es_PE_FIELD_Product_FeaturedInWebStore_Help="En la exhibición de productos en almacén de la Web, el producto se exhibe en la visión inicial ó si no ninguno incorporará criterios de búsqueda. Para ser exhibido, el producto debe estar en la lista de precios usada.";

@XendraTrl(Identifier="e9a13bee-9d84-4251-3472-6bd2484cd1e1")
public static String es_PE_FIELD_Product_FeaturedInWebStore_Description="Si esta seleccionado, el producto es exhibido en búsqueda inicial ó cualquier otra.";

@XendraField(AD_Column_ID="IsWebStoreFeatured",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsSummary@='N'",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e9a13bee-9d84-4251-3472-6bd2484cd1e1")
public static final String FIELDNAME_Product_FeaturedInWebStore="e9a13bee-9d84-4251-3472-6bd2484cd1e1";

@XendraTrl(Identifier="246c6ace-0bfd-cfcc-0125-acd3c0929909")
public static String es_PE_FIELD_AssignedProducts_FeaturedInWebStore_Name="Presentación del Almacen Web";

@XendraTrl(Identifier="246c6ace-0bfd-cfcc-0125-acd3c0929909")
public static String es_PE_FIELD_AssignedProducts_FeaturedInWebStore_Help="En la exhibición de productos en almacén de la Web, el producto se exhibe en la visión inicial ó si no ninguno incorporará criterios de búsqueda. Para ser exhibido, el producto debe estar en la lista de precios usada.";

@XendraTrl(Identifier="246c6ace-0bfd-cfcc-0125-acd3c0929909")
public static String es_PE_FIELD_AssignedProducts_FeaturedInWebStore_Description="Si esta seleccionado, el producto es exhibido en búsqueda inicial ó cualquier otra.";

@XendraField(AD_Column_ID="IsWebStoreFeatured",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="246c6ace-0bfd-cfcc-0125-acd3c0929909")
public static final String FIELDNAME_AssignedProducts_FeaturedInWebStore="246c6ace-0bfd-cfcc-0125-acd3c0929909";

@XendraTrl(Identifier="ed6cdcf6-cf74-1e40-d9fe-3010dd310947")
public static String es_PE_FIELD_ExpenseProduct_FeaturedInWebStore_Name="Presentación del Almacen Web";

@XendraTrl(Identifier="ed6cdcf6-cf74-1e40-d9fe-3010dd310947")
public static String es_PE_FIELD_ExpenseProduct_FeaturedInWebStore_Help="En la exhibición de productos en almacén de la Web, el producto se exhibe en la visión inicial ó si no ninguno incorporará criterios de búsqueda. Para ser exhibido, el producto debe estar en la lista de precios usada.";

@XendraTrl(Identifier="ed6cdcf6-cf74-1e40-d9fe-3010dd310947")
public static String es_PE_FIELD_ExpenseProduct_FeaturedInWebStore_Description="Si esta seleccionado, el producto es exhibido en búsqueda inicial ó cualquier otra.";

@XendraField(AD_Column_ID="IsWebStoreFeatured",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ed6cdcf6-cf74-1e40-d9fe-3010dd310947")
public static final String FIELDNAME_ExpenseProduct_FeaturedInWebStore="ed6cdcf6-cf74-1e40-d9fe-3010dd310947";

@XendraTrl(Identifier="095d4f87-5b61-4d6a-c9d9-ca8b733b0aec")
public static String es_PE_FIELD_ResourceProduct_FeaturedInWebStore_Name="Presentación del Almacen Web";

@XendraTrl(Identifier="095d4f87-5b61-4d6a-c9d9-ca8b733b0aec")
public static String es_PE_FIELD_ResourceProduct_FeaturedInWebStore_Help="En la exhibición de productos en almacén de la Web, el producto se exhibe en la visión inicial ó si no ninguno incorporará criterios de búsqueda. Para ser exhibido, el producto debe estar en la lista de precios usada.";

@XendraTrl(Identifier="095d4f87-5b61-4d6a-c9d9-ca8b733b0aec")
public static String es_PE_FIELD_ResourceProduct_FeaturedInWebStore_Description="Si esta seleccionado, el producto es exhibido en búsqueda inicial ó cualquier otra.";

@XendraField(AD_Column_ID="IsWebStoreFeatured",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="095d4f87-5b61-4d6a-c9d9-ca8b733b0aec")
public static final String FIELDNAME_ResourceProduct_FeaturedInWebStore="095d4f87-5b61-4d6a-c9d9-ca8b733b0aec";

@XendraTrl(Identifier="732f59dc-b59b-382b-47a5-8e58ffd5063c")
public static String es_PE_FIELD_ProductDimension_FeaturedInWebStore_Name="Presentación del Almacen Web";

@XendraTrl(Identifier="732f59dc-b59b-382b-47a5-8e58ffd5063c")
public static String es_PE_FIELD_ProductDimension_FeaturedInWebStore_Help="En la exhibición de productos en almacén de la Web, el producto se exhibe en la visión inicial ó si no ninguno incorporará criterios de búsqueda. Para ser exhibido, el producto debe estar en la lista de precios usada.";

@XendraTrl(Identifier="732f59dc-b59b-382b-47a5-8e58ffd5063c")
public static String es_PE_FIELD_ProductDimension_FeaturedInWebStore_Description="Si esta seleccionado, el producto es exhibido en búsqueda inicial ó cualquier otra.";

@XendraField(AD_Column_ID="IsWebStoreFeatured",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="732f59dc-b59b-382b-47a5-8e58ffd5063c")
public static final String FIELDNAME_ProductDimension_FeaturedInWebStore="732f59dc-b59b-382b-47a5-8e58ffd5063c";

@XendraTrl(Identifier="3e7f0114-4d52-d6c2-507b-0c8c7b2ffe62")
public static String es_PE_FIELD_SelectProduct_FeaturedInWebStore_Name="Presentación del Almacen Web";

@XendraTrl(Identifier="3e7f0114-4d52-d6c2-507b-0c8c7b2ffe62")
public static String es_PE_FIELD_SelectProduct_FeaturedInWebStore_Help="En la exhibición de productos en almacén de la Web, el producto se exhibe en la visión inicial ó si no ninguno incorporará criterios de búsqueda. Para ser exhibido, el producto debe estar en la lista de precios usada.";

@XendraTrl(Identifier="3e7f0114-4d52-d6c2-507b-0c8c7b2ffe62")
public static String es_PE_FIELD_SelectProduct_FeaturedInWebStore_Description="Si esta seleccionado, el producto es exhibido en búsqueda inicial ó cualquier otra.";

@XendraField(AD_Column_ID="IsWebStoreFeatured",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3e7f0114-4d52-d6c2-507b-0c8c7b2ffe62")
public static final String FIELDNAME_SelectProduct_FeaturedInWebStore="3e7f0114-4d52-d6c2-507b-0c8c7b2ffe62";

@XendraTrl(Identifier="48aa16bb-f580-5a68-e22c-94290667a75c")
public static String es_PE_FIELD_Product_FeaturedInWebStore2_Name="Presentación del Almacen Web";

@XendraTrl(Identifier="48aa16bb-f580-5a68-e22c-94290667a75c")
public static String es_PE_FIELD_Product_FeaturedInWebStore2_Help="En la exhibición de productos en almacén de la Web, el producto se exhibe en la visión inicial ó si no ninguno incorporará criterios de búsqueda. Para ser exhibido, el producto debe estar en la lista de precios usada.";

@XendraTrl(Identifier="48aa16bb-f580-5a68-e22c-94290667a75c")
public static String es_PE_FIELD_Product_FeaturedInWebStore2_Description="Si esta seleccionado, el producto es exhibido en búsqueda inicial ó cualquier otra.";

@XendraField(AD_Column_ID="IsWebStoreFeatured",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=460,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="48aa16bb-f580-5a68-e22c-94290667a75c")
public static final String FIELDNAME_Product_FeaturedInWebStore2="48aa16bb-f580-5a68-e22c-94290667a75c";

@XendraTrl(Identifier="9410d414-34e9-28e6-3e6d-b17a2614260f")
public static String es_PE_COLUMN_IsWebStoreFeatured_Name="Presentación del Almacen Web";

@XendraColumn(AD_Element_ID="ec241888-0704-b232-d973-1ad836a4ec5b",ColumnName="IsWebStoreFeatured",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9410d414-34e9-28e6-3e6d-b17a2614260f",
Synchronized="2022-04-26 19:23:03.0")
/** Column name IsWebStoreFeatured */
public static final String COLUMNNAME_IsWebStoreFeatured = "IsWebStoreFeatured";
/** Set IsWithholding.
@param IsWithholding IsWithholding */
public void setIsWithholding (boolean IsWithholding)
{
set_Value (COLUMNNAME_IsWithholding, Boolean.valueOf(IsWithholding));
}
/** Get IsWithholding.
@return IsWithholding */
public boolean isWithholding() 
{
Object oo = get_Value(COLUMNNAME_IsWithholding);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="b4bc9355-8ddf-4693-a00d-08d63ded830c")
public static String es_PE_FIELD_Product_IsWithholding_Name="iswithholding";

@XendraField(AD_Column_ID="IsWithholding",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2020-11-02 17:52:24.0",
Identifier="b4bc9355-8ddf-4693-a00d-08d63ded830c")
public static final String FIELDNAME_Product_IsWithholding="b4bc9355-8ddf-4693-a00d-08d63ded830c";

@XendraTrl(Identifier="d51bc498-42c8-428e-bce7-cc197ae41180")
public static String es_PE_COLUMN_IsWithholding_Name="iswithholding";

@XendraColumn(AD_Element_ID="21a44578-bb82-4b75-a7b3-36a7edba6b2a",ColumnName="IsWithholding",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d51bc498-42c8-428e-bce7-cc197ae41180",
Synchronized="2022-04-26 19:23:03.0")
/** Column name IsWithholding */
public static final String COLUMNNAME_IsWithholding = "IsWithholding";
/** Set Attribute Set.
@param M_AttributeSet_ID Product Attribute Set */
public void setM_AttributeSet_ID (int M_AttributeSet_ID)
{
if (M_AttributeSet_ID <= 0) set_Value (COLUMNNAME_M_AttributeSet_ID, null);
 else 
set_Value (COLUMNNAME_M_AttributeSet_ID, Integer.valueOf(M_AttributeSet_ID));
}
/** Get Attribute Set.
@return Product Attribute Set */
public int getM_AttributeSet_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_AttributeSet_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d8ebd4d8-4762-30b9-02b6-3a568a02c517")
public static String es_PE_FIELD_Product_AttributeSet_Name="Conjunto de Atributos";

@XendraTrl(Identifier="d8ebd4d8-4762-30b9-02b6-3a568a02c517")
public static String es_PE_FIELD_Product_AttributeSet_Help="Defina los sistemas de la cualidad de producto para agregar cualidades y valores adicionales al producto. Usted necesita definir una cualidad fijada si desea seguir el número de conteo por entregas y de porción.";

@XendraTrl(Identifier="d8ebd4d8-4762-30b9-02b6-3a568a02c517")
public static String es_PE_FIELD_Product_AttributeSet_Description="Conjunto de Atributos de Producto";

@XendraField(AD_Column_ID="M_AttributeSet_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N'",DisplayLength=14,IsReadOnly=false,SeqNo=430,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d8ebd4d8-4762-30b9-02b6-3a568a02c517")
public static final String FIELDNAME_Product_AttributeSet="d8ebd4d8-4762-30b9-02b6-3a568a02c517";

@XendraTrl(Identifier="063b7f5a-b0e5-5296-024f-be904070d421")
public static String es_PE_FIELD_AssignedProducts_AttributeSet_Name="Conjunto de Atributos";

@XendraTrl(Identifier="063b7f5a-b0e5-5296-024f-be904070d421")
public static String es_PE_FIELD_AssignedProducts_AttributeSet_Help="Defina los sistemas de la cualidad de producto para agregar cualidades y valores adicionales al producto. Usted necesita definir una cualidad fijada si desea seguir el número de conteo por entregas y de porción.";

@XendraTrl(Identifier="063b7f5a-b0e5-5296-024f-be904070d421")
public static String es_PE_FIELD_AssignedProducts_AttributeSet_Description="Conjunto de Atributos de Producto";

@XendraField(AD_Column_ID="M_AttributeSet_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="063b7f5a-b0e5-5296-024f-be904070d421")
public static final String FIELDNAME_AssignedProducts_AttributeSet="063b7f5a-b0e5-5296-024f-be904070d421";

@XendraTrl(Identifier="a480b386-4d69-1829-a435-a588276b42c6")
public static String es_PE_FIELD_ExpenseProduct_AttributeSet_Name="Conjunto de Atributos";

@XendraTrl(Identifier="a480b386-4d69-1829-a435-a588276b42c6")
public static String es_PE_FIELD_ExpenseProduct_AttributeSet_Help="Defina los sistemas de la cualidad de producto para agregar cualidades y valores adicionales al producto. Usted necesita definir una cualidad fijada si desea seguir el número de conteo por entregas y de porción.";

@XendraTrl(Identifier="a480b386-4d69-1829-a435-a588276b42c6")
public static String es_PE_FIELD_ExpenseProduct_AttributeSet_Description="Conjunto de Atributos de Producto";

@XendraField(AD_Column_ID="M_AttributeSet_ID",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a480b386-4d69-1829-a435-a588276b42c6")
public static final String FIELDNAME_ExpenseProduct_AttributeSet="a480b386-4d69-1829-a435-a588276b42c6";

@XendraTrl(Identifier="7be48689-5e82-816d-6750-7a1775091d15")
public static String es_PE_FIELD_ResourceProduct_AttributeSet_Name="Conjunto de Atributos";

@XendraTrl(Identifier="7be48689-5e82-816d-6750-7a1775091d15")
public static String es_PE_FIELD_ResourceProduct_AttributeSet_Help="Defina los sistemas de la cualidad de producto para agregar cualidades y valores adicionales al producto. Usted necesita definir una cualidad fijada si desea seguir el número de conteo por entregas y de porción.";

@XendraTrl(Identifier="7be48689-5e82-816d-6750-7a1775091d15")
public static String es_PE_FIELD_ResourceProduct_AttributeSet_Description="Conjunto de Atributos de Producto";

@XendraField(AD_Column_ID="M_AttributeSet_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7be48689-5e82-816d-6750-7a1775091d15")
public static final String FIELDNAME_ResourceProduct_AttributeSet="7be48689-5e82-816d-6750-7a1775091d15";

@XendraTrl(Identifier="8e9851b2-6509-f02b-7300-a9825f8861c6")
public static String es_PE_FIELD_ProductDimension_AttributeSet_Name="Conjunto de Atributos";

@XendraTrl(Identifier="8e9851b2-6509-f02b-7300-a9825f8861c6")
public static String es_PE_FIELD_ProductDimension_AttributeSet_Help="Defina los sistemas de la cualidad de producto para agregar cualidades y valores adicionales al producto. Usted necesita definir una cualidad fijada si desea seguir el número de conteo por entregas y de porción.";

@XendraTrl(Identifier="8e9851b2-6509-f02b-7300-a9825f8861c6")
public static String es_PE_FIELD_ProductDimension_AttributeSet_Description="Conjunto de Atributos de Producto";

@XendraField(AD_Column_ID="M_AttributeSet_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8e9851b2-6509-f02b-7300-a9825f8861c6")
public static final String FIELDNAME_ProductDimension_AttributeSet="8e9851b2-6509-f02b-7300-a9825f8861c6";

@XendraTrl(Identifier="90388576-fbc0-deb5-b7ff-eb28fd1134a9")
public static String es_PE_FIELD_SelectProduct_AttributeSet_Name="Conjunto de Atributos";

@XendraTrl(Identifier="90388576-fbc0-deb5-b7ff-eb28fd1134a9")
public static String es_PE_FIELD_SelectProduct_AttributeSet_Help="Defina los sistemas de la cualidad de producto para agregar cualidades y valores adicionales al producto. Usted necesita definir una cualidad fijada si desea seguir el número de conteo por entregas y de porción.";

@XendraTrl(Identifier="90388576-fbc0-deb5-b7ff-eb28fd1134a9")
public static String es_PE_FIELD_SelectProduct_AttributeSet_Description="Conjunto de Atributos de Producto";

@XendraField(AD_Column_ID="M_AttributeSet_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="90388576-fbc0-deb5-b7ff-eb28fd1134a9")
public static final String FIELDNAME_SelectProduct_AttributeSet="90388576-fbc0-deb5-b7ff-eb28fd1134a9";

@XendraTrl(Identifier="d449280d-a57c-5207-a936-ce21bb1696f1")
public static String es_PE_FIELD_Product_AttributeSet2_Name="Conjunto de Atributos";

@XendraTrl(Identifier="d449280d-a57c-5207-a936-ce21bb1696f1")
public static String es_PE_FIELD_Product_AttributeSet2_Help="Defina los sistemas de la cualidad de producto para agregar cualidades y valores adicionales al producto. Usted necesita definir una cualidad fijada si desea seguir el número de conteo por entregas y de porción.";

@XendraTrl(Identifier="d449280d-a57c-5207-a936-ce21bb1696f1")
public static String es_PE_FIELD_Product_AttributeSet2_Description="Conjunto de Atributos de Producto";

@XendraField(AD_Column_ID="M_AttributeSet_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=440,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d449280d-a57c-5207-a936-ce21bb1696f1")
public static final String FIELDNAME_Product_AttributeSet2="d449280d-a57c-5207-a936-ce21bb1696f1";

@XendraTrl(Identifier="6a93d47f-bad3-a1e2-0ecb-4e1a906c4aa9")
public static String es_PE_COLUMN_M_AttributeSet_ID_Name="Conjunto de Atributos";

@XendraColumn(AD_Element_ID="8debe7a4-548a-6126-d8aa-196f184678c2",ColumnName="M_AttributeSet_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6a93d47f-bad3-a1e2-0ecb-4e1a906c4aa9",
Synchronized="2022-04-26 19:23:03.0")
/** Column name M_AttributeSet_ID */
public static final String COLUMNNAME_M_AttributeSet_ID = "M_AttributeSet_ID";
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

@XendraTrl(Identifier="55e9f205-72f7-50c7-c953-987ec345616d")
public static String es_PE_FIELD_Product_AttributeSetInstance_Name="Instancia Conjunto de Atributos ";

@XendraTrl(Identifier="55e9f205-72f7-50c7-c953-987ec345616d")
public static String es_PE_FIELD_Product_AttributeSetInstance_Help="Los valores actuales de Atributos de Producto. Instancia Atributo de Producto  son definidos en The values of the actual Product Attributes. Product Instance attributes are defined in the actual transactions.";

@XendraTrl(Identifier="55e9f205-72f7-50c7-c953-987ec345616d")
public static String es_PE_FIELD_Product_AttributeSetInstance_Description="Valor Atributos de Productos";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=false,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N'",DisplayLength=26,IsReadOnly=false,SeqNo=440,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="55e9f205-72f7-50c7-c953-987ec345616d")
public static final String FIELDNAME_Product_AttributeSetInstance="55e9f205-72f7-50c7-c953-987ec345616d";

@XendraTrl(Identifier="a0d942d7-e69b-3ee6-c367-8b3bb06a153b")
public static String es_PE_FIELD_AssignedProducts_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraTrl(Identifier="a0d942d7-e69b-3ee6-c367-8b3bb06a153b")
public static String es_PE_FIELD_AssignedProducts_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="a0d942d7-e69b-3ee6-c367-8b3bb06a153b")
public static String es_PE_FIELD_AssignedProducts_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a0d942d7-e69b-3ee6-c367-8b3bb06a153b")
public static final String FIELDNAME_AssignedProducts_AttributeSetInstance="a0d942d7-e69b-3ee6-c367-8b3bb06a153b";

@XendraTrl(Identifier="ce5722ba-29f4-a592-0b16-e6ed21ffc634")
public static String es_PE_FIELD_ExpenseProduct_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraTrl(Identifier="ce5722ba-29f4-a592-0b16-e6ed21ffc634")
public static String es_PE_FIELD_ExpenseProduct_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="ce5722ba-29f4-a592-0b16-e6ed21ffc634")
public static String es_PE_FIELD_ExpenseProduct_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ce5722ba-29f4-a592-0b16-e6ed21ffc634")
public static final String FIELDNAME_ExpenseProduct_AttributeSetInstance="ce5722ba-29f4-a592-0b16-e6ed21ffc634";

@XendraTrl(Identifier="262332c6-4b27-99e5-8c90-d977cbc29ffb")
public static String es_PE_FIELD_ResourceProduct_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraTrl(Identifier="262332c6-4b27-99e5-8c90-d977cbc29ffb")
public static String es_PE_FIELD_ResourceProduct_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="262332c6-4b27-99e5-8c90-d977cbc29ffb")
public static String es_PE_FIELD_ResourceProduct_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="262332c6-4b27-99e5-8c90-d977cbc29ffb")
public static final String FIELDNAME_ResourceProduct_AttributeSetInstance="262332c6-4b27-99e5-8c90-d977cbc29ffb";

@XendraTrl(Identifier="628bba46-ae1c-01c7-1a35-e12aacc804a3")
public static String es_PE_FIELD_ProductDimension_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraTrl(Identifier="628bba46-ae1c-01c7-1a35-e12aacc804a3")
public static String es_PE_FIELD_ProductDimension_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="628bba46-ae1c-01c7-1a35-e12aacc804a3")
public static String es_PE_FIELD_ProductDimension_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="628bba46-ae1c-01c7-1a35-e12aacc804a3")
public static final String FIELDNAME_ProductDimension_AttributeSetInstance="628bba46-ae1c-01c7-1a35-e12aacc804a3";

@XendraTrl(Identifier="20b9c404-4c3b-8ccf-05bb-deacde29e1f7")
public static String es_PE_FIELD_SelectProduct_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraTrl(Identifier="20b9c404-4c3b-8ccf-05bb-deacde29e1f7")
public static String es_PE_FIELD_SelectProduct_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="20b9c404-4c3b-8ccf-05bb-deacde29e1f7")
public static String es_PE_FIELD_SelectProduct_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="20b9c404-4c3b-8ccf-05bb-deacde29e1f7")
public static final String FIELDNAME_SelectProduct_AttributeSetInstance="20b9c404-4c3b-8ccf-05bb-deacde29e1f7";

@XendraTrl(Identifier="aac0ae85-81fb-09ad-7ac5-d8cfcf7fdd9b")
public static String es_PE_FIELD_Product_AttributeSetInstance2_Name="Instancia Conjunto de Atributos";

@XendraTrl(Identifier="aac0ae85-81fb-09ad-7ac5-d8cfcf7fdd9b")
public static String es_PE_FIELD_Product_AttributeSetInstance2_Help="Los valores de los Atributos de Producto actual. Atributos Instancias de Producto son definidos en transacción actual.";

@XendraTrl(Identifier="aac0ae85-81fb-09ad-7ac5-d8cfcf7fdd9b")
public static String es_PE_FIELD_Product_AttributeSetInstance2_Description="Valores Atributos de Producto";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=false,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=450,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aac0ae85-81fb-09ad-7ac5-d8cfcf7fdd9b")
public static final String FIELDNAME_Product_AttributeSetInstance2="aac0ae85-81fb-09ad-7ac5-d8cfcf7fdd9b";

@XendraTrl(Identifier="8ec14b1c-8a9d-4761-eb91-2ab834d5b54c")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Instancia del Conjunto de Atributos";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8ec14b1c-8a9d-4761-eb91-2ab834d5b54c",Synchronized="2022-04-26 19:23:03.0")
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
/** Set Freight Category.
@param M_FreightCategory_ID Category of the Freight */
public void setM_FreightCategory_ID (int M_FreightCategory_ID)
{
if (M_FreightCategory_ID <= 0) set_Value (COLUMNNAME_M_FreightCategory_ID, null);
 else 
set_Value (COLUMNNAME_M_FreightCategory_ID, Integer.valueOf(M_FreightCategory_ID));
}
/** Get Freight Category.
@return Category of the Freight */
public int getM_FreightCategory_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_FreightCategory_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9c7b3000-b38d-d844-d04e-bf63907e1639")
public static String es_PE_FIELD_Product_FreightCategory_Name="Categoría de Fletes";

@XendraTrl(Identifier="9c7b3000-b38d-d844-d04e-bf63907e1639")
public static String es_PE_FIELD_Product_FreightCategory_Help="Las categorías de fletes se utilizan para calcular los fletes del expedidor seleccionado";

@XendraTrl(Identifier="9c7b3000-b38d-d844-d04e-bf63907e1639")
public static String es_PE_FIELD_Product_FreightCategory_Description="Categoría de Fletes";

@XendraField(AD_Column_ID="M_FreightCategory_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsSummary@='N' & @ProductType@=I",DisplayLength=14,IsReadOnly=false,SeqNo=0,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="9c7b3000-b38d-d844-d04e-bf63907e1639")
public static final String FIELDNAME_Product_FreightCategory="9c7b3000-b38d-d844-d04e-bf63907e1639";

@XendraTrl(Identifier="6a255f79-e7a5-dab3-d59b-472271e28764")
public static String es_PE_FIELD_AssignedProducts_FreightCategory_Name="Categoría de Fletes";

@XendraTrl(Identifier="6a255f79-e7a5-dab3-d59b-472271e28764")
public static String es_PE_FIELD_AssignedProducts_FreightCategory_Help="Las categorías de fletes se utilizan para calcular los fletes del expedidor seleccionado";

@XendraTrl(Identifier="6a255f79-e7a5-dab3-d59b-472271e28764")
public static String es_PE_FIELD_AssignedProducts_FreightCategory_Description="Categoría de Fletes";

@XendraField(AD_Column_ID="M_FreightCategory_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6a255f79-e7a5-dab3-d59b-472271e28764")
public static final String FIELDNAME_AssignedProducts_FreightCategory="6a255f79-e7a5-dab3-d59b-472271e28764";

@XendraTrl(Identifier="2114bef6-0d6b-c125-6d27-0f95893f1ef5")
public static String es_PE_FIELD_ExpenseProduct_FreightCategory_Name="Categoría de Fletes";

@XendraTrl(Identifier="2114bef6-0d6b-c125-6d27-0f95893f1ef5")
public static String es_PE_FIELD_ExpenseProduct_FreightCategory_Help="Las categorías de fletes se utilizan para calcular los fletes del expedidor seleccionado";

@XendraTrl(Identifier="2114bef6-0d6b-c125-6d27-0f95893f1ef5")
public static String es_PE_FIELD_ExpenseProduct_FreightCategory_Description="Categoría de Fletes";

@XendraField(AD_Column_ID="M_FreightCategory_ID",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2114bef6-0d6b-c125-6d27-0f95893f1ef5")
public static final String FIELDNAME_ExpenseProduct_FreightCategory="2114bef6-0d6b-c125-6d27-0f95893f1ef5";

@XendraTrl(Identifier="d5d06cec-4d00-a210-9cb7-f80c92aede86")
public static String es_PE_FIELD_ResourceProduct_FreightCategory_Name="Categoría de Fletes";

@XendraTrl(Identifier="d5d06cec-4d00-a210-9cb7-f80c92aede86")
public static String es_PE_FIELD_ResourceProduct_FreightCategory_Help="Las categorías de fletes se utilizan para calcular los fletes del expedidor seleccionado";

@XendraTrl(Identifier="d5d06cec-4d00-a210-9cb7-f80c92aede86")
public static String es_PE_FIELD_ResourceProduct_FreightCategory_Description="Categoría de Fletes";

@XendraField(AD_Column_ID="M_FreightCategory_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d5d06cec-4d00-a210-9cb7-f80c92aede86")
public static final String FIELDNAME_ResourceProduct_FreightCategory="d5d06cec-4d00-a210-9cb7-f80c92aede86";

@XendraTrl(Identifier="d75abe2a-7df3-5e88-1f93-d71c65659269")
public static String es_PE_FIELD_ProductDimension_FreightCategory_Name="Categoría de Fletes";

@XendraTrl(Identifier="d75abe2a-7df3-5e88-1f93-d71c65659269")
public static String es_PE_FIELD_ProductDimension_FreightCategory_Help="Las categorías de fletes se utilizan para calcular los fletes del expedidor seleccionado";

@XendraTrl(Identifier="d75abe2a-7df3-5e88-1f93-d71c65659269")
public static String es_PE_FIELD_ProductDimension_FreightCategory_Description="Categoría de Fletes";

@XendraField(AD_Column_ID="M_FreightCategory_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d75abe2a-7df3-5e88-1f93-d71c65659269")
public static final String FIELDNAME_ProductDimension_FreightCategory="d75abe2a-7df3-5e88-1f93-d71c65659269";

@XendraTrl(Identifier="8f2c5695-22af-5c61-6c1b-331d7d9a92d8")
public static String es_PE_FIELD_SelectProduct_FreightCategory_Name="Categoría de Fletes";

@XendraTrl(Identifier="8f2c5695-22af-5c61-6c1b-331d7d9a92d8")
public static String es_PE_FIELD_SelectProduct_FreightCategory_Help="Las categorías de fletes se utilizan para calcular los fletes del expedidor seleccionado";

@XendraTrl(Identifier="8f2c5695-22af-5c61-6c1b-331d7d9a92d8")
public static String es_PE_FIELD_SelectProduct_FreightCategory_Description="Categoría de Fletes";

@XendraField(AD_Column_ID="M_FreightCategory_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8f2c5695-22af-5c61-6c1b-331d7d9a92d8")
public static final String FIELDNAME_SelectProduct_FreightCategory="8f2c5695-22af-5c61-6c1b-331d7d9a92d8";

@XendraTrl(Identifier="4500c5ff-bb77-0e8f-51f5-220838b674e8")
public static String es_PE_FIELD_Product_FreightCategory2_Name="Categoría de Fletes";

@XendraTrl(Identifier="4500c5ff-bb77-0e8f-51f5-220838b674e8")
public static String es_PE_FIELD_Product_FreightCategory2_Help="Las categorías de fletes se utilizan para calcular los fletes del expedidor seleccionado";

@XendraTrl(Identifier="4500c5ff-bb77-0e8f-51f5-220838b674e8")
public static String es_PE_FIELD_Product_FreightCategory2_Description="Categoría de Fletes";

@XendraField(AD_Column_ID="M_FreightCategory_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N' & @ProductType@=I",DisplayLength=14,IsReadOnly=false,SeqNo=230,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4500c5ff-bb77-0e8f-51f5-220838b674e8")
public static final String FIELDNAME_Product_FreightCategory2="4500c5ff-bb77-0e8f-51f5-220838b674e8";

@XendraTrl(Identifier="3c4b5940-be48-7bd8-898b-3f5baf96f30e")
public static String es_PE_COLUMN_M_FreightCategory_ID_Name="Categoría de Fletes";

@XendraColumn(AD_Element_ID="a6bd0308-4cda-2bdf-220e-15636641b487",
ColumnName="M_FreightCategory_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3c4b5940-be48-7bd8-898b-3f5baf96f30e",Synchronized="2022-04-26 19:23:03.0")
/** Column name M_FreightCategory_ID */
public static final String COLUMNNAME_M_FreightCategory_ID = "M_FreightCategory_ID";
/** Set Locator.
@param M_Locator_ID Warehouse Locator */
public void setM_Locator_ID (int M_Locator_ID)
{
if (M_Locator_ID <= 0) set_Value (COLUMNNAME_M_Locator_ID, null);
 else 
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

@XendraTrl(Identifier="0112f3f9-116e-21b9-f4d6-837d6e6b47a7")
public static String es_PE_FIELD_Product_Locator_Name="Ubicación";

@XendraTrl(Identifier="0112f3f9-116e-21b9-f4d6-837d6e6b47a7")
public static String es_PE_FIELD_Product_Locator_Help="El ID de la ubicación indica en que parte del almacén se localiza el producto";

@XendraTrl(Identifier="0112f3f9-116e-21b9-f4d6-837d6e6b47a7")
public static String es_PE_FIELD_Product_Locator_Description="Ubicación de Almacén";

@XendraField(AD_Column_ID="M_Locator_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N & @ProductType@=I & @IsStocked@=Y",DisplayLength=23,IsReadOnly=false,
SeqNo=260,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="0112f3f9-116e-21b9-f4d6-837d6e6b47a7")
public static final String FIELDNAME_Product_Locator="0112f3f9-116e-21b9-f4d6-837d6e6b47a7";

@XendraTrl(Identifier="3d40ade5-79cb-02db-8da5-e16c0ece1eca")
public static String es_PE_FIELD_AssignedProducts_Locator_Name="Ubicación";

@XendraTrl(Identifier="3d40ade5-79cb-02db-8da5-e16c0ece1eca")
public static String es_PE_FIELD_AssignedProducts_Locator_Help="El ID de la ubicación indica en que parte del almacén se localiza el producto";

@XendraTrl(Identifier="3d40ade5-79cb-02db-8da5-e16c0ece1eca")
public static String es_PE_FIELD_AssignedProducts_Locator_Description="Ubicación de Almacén";

@XendraField(AD_Column_ID="M_Locator_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3d40ade5-79cb-02db-8da5-e16c0ece1eca")
public static final String FIELDNAME_AssignedProducts_Locator="3d40ade5-79cb-02db-8da5-e16c0ece1eca";

@XendraTrl(Identifier="4d786871-005e-82da-fb5c-a3a808a1bae3")
public static String es_PE_FIELD_ExpenseProduct_Locator_Name="Ubicación";

@XendraTrl(Identifier="4d786871-005e-82da-fb5c-a3a808a1bae3")
public static String es_PE_FIELD_ExpenseProduct_Locator_Help="El ID de la ubicación indica en que parte del almacén se localiza el producto";

@XendraTrl(Identifier="4d786871-005e-82da-fb5c-a3a808a1bae3")
public static String es_PE_FIELD_ExpenseProduct_Locator_Description="Ubicación de Almacén";

@XendraField(AD_Column_ID="M_Locator_ID",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4d786871-005e-82da-fb5c-a3a808a1bae3")
public static final String FIELDNAME_ExpenseProduct_Locator="4d786871-005e-82da-fb5c-a3a808a1bae3";

@XendraTrl(Identifier="48b68be1-2220-72b5-f149-c05334d799b3")
public static String es_PE_FIELD_ResourceProduct_Locator_Name="Ubicación";

@XendraTrl(Identifier="48b68be1-2220-72b5-f149-c05334d799b3")
public static String es_PE_FIELD_ResourceProduct_Locator_Help="El ID de la ubicación indica en que parte del almacén se localiza el producto";

@XendraTrl(Identifier="48b68be1-2220-72b5-f149-c05334d799b3")
public static String es_PE_FIELD_ResourceProduct_Locator_Description="Ubicación de Almacén";

@XendraField(AD_Column_ID="M_Locator_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="48b68be1-2220-72b5-f149-c05334d799b3")
public static final String FIELDNAME_ResourceProduct_Locator="48b68be1-2220-72b5-f149-c05334d799b3";

@XendraTrl(Identifier="3605bc4c-f268-9634-9bb9-dd8abfa3f294")
public static String es_PE_FIELD_ProductDimension_Locator_Name="Ubicación";

@XendraTrl(Identifier="3605bc4c-f268-9634-9bb9-dd8abfa3f294")
public static String es_PE_FIELD_ProductDimension_Locator_Help="El ID de la ubicación indica en que parte del almacén se localiza el producto";

@XendraTrl(Identifier="3605bc4c-f268-9634-9bb9-dd8abfa3f294")
public static String es_PE_FIELD_ProductDimension_Locator_Description="Ubicación de Almacén";

@XendraField(AD_Column_ID="M_Locator_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3605bc4c-f268-9634-9bb9-dd8abfa3f294")
public static final String FIELDNAME_ProductDimension_Locator="3605bc4c-f268-9634-9bb9-dd8abfa3f294";

@XendraTrl(Identifier="93ba5997-db7a-0a40-d825-4bdca0d5128d")
public static String es_PE_FIELD_SelectProduct_Locator_Name="Ubicación";

@XendraTrl(Identifier="93ba5997-db7a-0a40-d825-4bdca0d5128d")
public static String es_PE_FIELD_SelectProduct_Locator_Help="El ID de la ubicación indica en que parte del almacén se localiza el producto";

@XendraTrl(Identifier="93ba5997-db7a-0a40-d825-4bdca0d5128d")
public static String es_PE_FIELD_SelectProduct_Locator_Description="Ubicación de Almacén";

@XendraField(AD_Column_ID="M_Locator_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="93ba5997-db7a-0a40-d825-4bdca0d5128d")
public static final String FIELDNAME_SelectProduct_Locator="93ba5997-db7a-0a40-d825-4bdca0d5128d";

@XendraTrl(Identifier="88b16f3e-bcc2-50e5-ea56-4eda096da35a")
public static String es_PE_FIELD_Product_Locator2_Name="Ubicación";

@XendraTrl(Identifier="88b16f3e-bcc2-50e5-ea56-4eda096da35a")
public static String es_PE_FIELD_Product_Locator2_Help="El ID de la ubicación indica en que parte del almacén se localiza el producto";

@XendraTrl(Identifier="88b16f3e-bcc2-50e5-ea56-4eda096da35a")
public static String es_PE_FIELD_Product_Locator2_Description="Ubicación de Almacén";

@XendraField(AD_Column_ID="M_Locator_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N & @ProductType@=I & @IsStocked@=Y",DisplayLength=23,IsReadOnly=false,
SeqNo=260,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="88b16f3e-bcc2-50e5-ea56-4eda096da35a")
public static final String FIELDNAME_Product_Locator2="88b16f3e-bcc2-50e5-ea56-4eda096da35a";

@XendraTrl(Identifier="636d386b-f86f-4764-f621-8f45736747e5")
public static String es_PE_COLUMN_M_Locator_ID_Name="Ubicación";

@XendraColumn(AD_Element_ID="67f044ce-2864-93f9-fd0d-320945150933",ColumnName="M_Locator_ID",
AD_Reference_ID=31,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="636d386b-f86f-4764-f621-8f45736747e5",
Synchronized="2022-04-26 19:23:03.0")
/** Column name M_Locator_ID */
public static final String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
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

@XendraTrl(Identifier="3b753a8d-ec55-91e8-2fb7-74f3d1e6a379")
public static String es_PE_FIELD_Product_ProductBrand_Name="Linea";

@XendraTrl(Identifier="3b753a8d-ec55-91e8-2fb7-74f3d1e6a379")
public static String es_PE_FIELD_Product_ProductBrand_Description="Linea";

@XendraField(AD_Column_ID="M_Product_Brand_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="Other options",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3b753a8d-ec55-91e8-2fb7-74f3d1e6a379")
public static final String FIELDNAME_Product_ProductBrand="3b753a8d-ec55-91e8-2fb7-74f3d1e6a379";

@XendraTrl(Identifier="9b7f92bb-935f-1fd9-2c3f-f796652a2a86")
public static String es_PE_COLUMN_M_Product_Brand_ID_Name="Product Brand";

@XendraColumn(AD_Element_ID="028aa2e6-3ac7-548f-6575-e61a07ea3e9e",ColumnName="M_Product_Brand_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9b7f92bb-935f-1fd9-2c3f-f796652a2a86",
Synchronized="2022-04-26 19:23:03.0")
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

@XendraTrl(Identifier="2bf10c3a-14c5-9c2d-80d6-2531d00ef911")
public static String es_PE_FIELD_Product_ProductCategory_Name="Categoría del Producto";

@XendraTrl(Identifier="2bf10c3a-14c5-9c2d-80d6-2531d00ef911")
public static String es_PE_FIELD_Product_ProductCategory_Help="Identifica la categoría a la que pertenece este producto. Las categorías del producto son usadas para el cálculo de precios";

@XendraTrl(Identifier="2bf10c3a-14c5-9c2d-80d6-2531d00ef911")
public static String es_PE_FIELD_Product_ProductCategory_Description="Categoría de la que este producto es parte";

@XendraField(AD_Column_ID="M_Product_Category_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2bf10c3a-14c5-9c2d-80d6-2531d00ef911")
public static final String FIELDNAME_Product_ProductCategory="2bf10c3a-14c5-9c2d-80d6-2531d00ef911";

@XendraTrl(Identifier="1006d7c8-7830-14ff-16a0-8ec850ae4cd7")
public static String es_PE_FIELD_AssignedProducts_ProductCategory_Name="Categoría del Producto";

@XendraTrl(Identifier="1006d7c8-7830-14ff-16a0-8ec850ae4cd7")
public static String es_PE_FIELD_AssignedProducts_ProductCategory_Help="Identifica la categoría a la que pertenece este producto. Las categorías del producto son usadas para el cálculo de precios";

@XendraTrl(Identifier="1006d7c8-7830-14ff-16a0-8ec850ae4cd7")
public static String es_PE_FIELD_AssignedProducts_ProductCategory_Description="Categoría de la que este producto es parte";

@XendraField(AD_Column_ID="M_Product_Category_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1006d7c8-7830-14ff-16a0-8ec850ae4cd7")
public static final String FIELDNAME_AssignedProducts_ProductCategory="1006d7c8-7830-14ff-16a0-8ec850ae4cd7";

@XendraTrl(Identifier="9613037f-00d9-6648-4805-215fe0a2aebd")
public static String es_PE_FIELD_ExpenseProduct_ProductCategory_Name="Categoría del Producto";

@XendraTrl(Identifier="9613037f-00d9-6648-4805-215fe0a2aebd")
public static String es_PE_FIELD_ExpenseProduct_ProductCategory_Help="Identifica la categoría a la que pertenece este producto. Las categorías del producto son usadas para el cálculo de precios";

@XendraTrl(Identifier="9613037f-00d9-6648-4805-215fe0a2aebd")
public static String es_PE_FIELD_ExpenseProduct_ProductCategory_Description="Categoría de la que este producto es parte";

@XendraField(AD_Column_ID="M_Product_Category_ID",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9613037f-00d9-6648-4805-215fe0a2aebd")
public static final String FIELDNAME_ExpenseProduct_ProductCategory="9613037f-00d9-6648-4805-215fe0a2aebd";

@XendraTrl(Identifier="468ae713-d4e9-2a27-56e7-d9e49cd3a79c")
public static String es_PE_FIELD_ResourceProduct_ProductCategory_Name="Categoría del Producto";

@XendraTrl(Identifier="468ae713-d4e9-2a27-56e7-d9e49cd3a79c")
public static String es_PE_FIELD_ResourceProduct_ProductCategory_Help="Identifica la categoría a la que pertenece este producto. Las categorías del producto son usadas para el cálculo de precios";

@XendraTrl(Identifier="468ae713-d4e9-2a27-56e7-d9e49cd3a79c")
public static String es_PE_FIELD_ResourceProduct_ProductCategory_Description="Categoría de la que este producto es parte";

@XendraField(AD_Column_ID="M_Product_Category_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="468ae713-d4e9-2a27-56e7-d9e49cd3a79c")
public static final String FIELDNAME_ResourceProduct_ProductCategory="468ae713-d4e9-2a27-56e7-d9e49cd3a79c";

@XendraTrl(Identifier="acb23542-b38a-8594-1594-4950ee0f23b5")
public static String es_PE_FIELD_ProductDimension_ProductCategory_Name="Categoría del Producto";

@XendraTrl(Identifier="acb23542-b38a-8594-1594-4950ee0f23b5")
public static String es_PE_FIELD_ProductDimension_ProductCategory_Help="Identifica la categoría a la que pertenece este producto. Las categorías del producto son usadas para el cálculo de precios";

@XendraTrl(Identifier="acb23542-b38a-8594-1594-4950ee0f23b5")
public static String es_PE_FIELD_ProductDimension_ProductCategory_Description="Categoría de la que este producto es parte";

@XendraField(AD_Column_ID="M_Product_Category_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="acb23542-b38a-8594-1594-4950ee0f23b5")
public static final String FIELDNAME_ProductDimension_ProductCategory="acb23542-b38a-8594-1594-4950ee0f23b5";

@XendraTrl(Identifier="8d972ce2-f60d-3f92-1682-63cfb7a9ecd1")
public static String es_PE_FIELD_SelectProduct_ProductCategory_Name="Categoría del Producto";

@XendraTrl(Identifier="8d972ce2-f60d-3f92-1682-63cfb7a9ecd1")
public static String es_PE_FIELD_SelectProduct_ProductCategory_Help="Identifica la categoría a la que pertenece este producto. Las categorías del producto son usadas para el cálculo de precios";

@XendraTrl(Identifier="8d972ce2-f60d-3f92-1682-63cfb7a9ecd1")
public static String es_PE_FIELD_SelectProduct_ProductCategory_Description="Categoría de la que este producto es parte";

@XendraField(AD_Column_ID="M_Product_Category_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8d972ce2-f60d-3f92-1682-63cfb7a9ecd1")
public static final String FIELDNAME_SelectProduct_ProductCategory="8d972ce2-f60d-3f92-1682-63cfb7a9ecd1";

@XendraTrl(Identifier="51a0d95e-abc5-e3a1-ac55-a0677d922c5b")
public static String es_PE_FIELD_Product_ProductCategory2_Name="Categoría del Producto";

@XendraTrl(Identifier="51a0d95e-abc5-e3a1-ac55-a0677d922c5b")
public static String es_PE_FIELD_Product_ProductCategory2_Help="Identifica la categoría a la que pertenece este producto. Las categorías del producto son usadas para el cálculo de precios";

@XendraTrl(Identifier="51a0d95e-abc5-e3a1-ac55-a0677d922c5b")
public static String es_PE_FIELD_Product_ProductCategory2_Description="Categoría de la que este producto es parte";

@XendraField(AD_Column_ID="M_Product_Category_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="51a0d95e-abc5-e3a1-ac55-a0677d922c5b")
public static final String FIELDNAME_Product_ProductCategory2="51a0d95e-abc5-e3a1-ac55-a0677d922c5b";

@XendraTrl(Identifier="6f298307-ee89-b44b-1341-afb769b7f98c")
public static String es_PE_COLUMN_M_Product_Category_ID_Name="Categoría del Producto";

@XendraColumn(AD_Element_ID="80d3e0bb-473b-67d4-42d5-1d776006a69c",
ColumnName="M_Product_Category_ID",AD_Reference_ID=19,
AD_Reference_Value_ID="36e5e285-96f7-de95-1ec8-5e02581d0f51",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,
ReadOnlyLogic="@ProductType@=R | @ProductType@=E | @ProductType@=O",IsIdentifier=false,SeqNo=0,
IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",
IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6f298307-ee89-b44b-1341-afb769b7f98c",Synchronized="2022-04-26 19:23:03.0")
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

@XendraTrl(Identifier="af9d610b-6f58-350a-0337-cd5899d0f2eb")
public static String es_PE_FIELD_Product_ProductGeneric_Name="Generico";

@XendraTrl(Identifier="af9d610b-6f58-350a-0337-cd5899d0f2eb")
public static String es_PE_FIELD_Product_ProductGeneric_Description="Generico";

@XendraField(AD_Column_ID="M_Product_Generic_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="Other options",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="af9d610b-6f58-350a-0337-cd5899d0f2eb")
public static final String FIELDNAME_Product_ProductGeneric="af9d610b-6f58-350a-0337-cd5899d0f2eb";

@XendraTrl(Identifier="5e2c5c0c-15b5-9e84-d131-e86cb3233333")
public static String es_PE_COLUMN_M_Product_Generic_ID_Name="Generico de Producto";

@XendraColumn(AD_Element_ID="29ff5a3c-04a3-1e11-967b-06b36ab2ba4a",
ColumnName="M_Product_Generic_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5e2c5c0c-15b5-9e84-d131-e86cb3233333",Synchronized="2022-04-26 19:23:03.0")
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

@XendraTrl(Identifier="e3d14c62-7ed4-7b88-b74e-d6fc15bd7ede")
public static String es_PE_FIELD_Product_ProductGroup_Name="Grupo";

@XendraField(AD_Column_ID="M_Product_Group_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="Other options",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e3d14c62-7ed4-7b88-b74e-d6fc15bd7ede")
public static final String FIELDNAME_Product_ProductGroup="e3d14c62-7ed4-7b88-b74e-d6fc15bd7ede";

@XendraTrl(Identifier="ef4e67eb-3681-0229-6fe7-52ecb93f1f14")
public static String es_PE_COLUMN_M_Product_Group_ID_Name="Grupo de Producto";

@XendraColumn(AD_Element_ID="969f31c5-ca66-a83f-7eca-f4700c100b5c",ColumnName="M_Product_Group_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ef4e67eb-3681-0229-6fe7-52ecb93f1f14",
Synchronized="2022-04-26 19:23:03.0")
/** Column name M_Product_Group_ID */
public static final String COLUMNNAME_M_Product_Group_ID = "M_Product_Group_ID";
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

@XendraTrl(Identifier="90f69f51-ad35-7fb6-ff9d-ebb037c201d8")
public static String es_PE_FIELD_Product_Product_Name="Producto";

@XendraTrl(Identifier="90f69f51-ad35-7fb6-ff9d-ebb037c201d8")
public static String es_PE_FIELD_Product_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="90f69f51-ad35-7fb6-ff9d-ebb037c201d8")
public static String es_PE_FIELD_Product_Product_Description="Producto; servicio ó artículo.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="90f69f51-ad35-7fb6-ff9d-ebb037c201d8")
public static final String FIELDNAME_Product_Product="90f69f51-ad35-7fb6-ff9d-ebb037c201d8";

@XendraTrl(Identifier="16eba7b9-96c0-db5d-db30-d73e2c3b5788")
public static String es_PE_FIELD_AssignedProducts_Product_Name="Producto";

@XendraTrl(Identifier="16eba7b9-96c0-db5d-db30-d73e2c3b5788")
public static String es_PE_FIELD_AssignedProducts_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="16eba7b9-96c0-db5d-db30-d73e2c3b5788")
public static String es_PE_FIELD_AssignedProducts_Product_Description="Producto; servicio ó artículo.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="16eba7b9-96c0-db5d-db30-d73e2c3b5788")
public static final String FIELDNAME_AssignedProducts_Product="16eba7b9-96c0-db5d-db30-d73e2c3b5788";

@XendraTrl(Identifier="97ba061d-7458-23a8-f08e-3b3a9ea9b5c1")
public static String es_PE_FIELD_ExpenseProduct_Product_Name="Producto";

@XendraTrl(Identifier="97ba061d-7458-23a8-f08e-3b3a9ea9b5c1")
public static String es_PE_FIELD_ExpenseProduct_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="97ba061d-7458-23a8-f08e-3b3a9ea9b5c1")
public static String es_PE_FIELD_ExpenseProduct_Product_Description="Producto; servicio ó artículo.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="97ba061d-7458-23a8-f08e-3b3a9ea9b5c1")
public static final String FIELDNAME_ExpenseProduct_Product="97ba061d-7458-23a8-f08e-3b3a9ea9b5c1";

@XendraTrl(Identifier="d9cbc308-18f9-f8ea-b3f7-bcc659cbd6d3")
public static String es_PE_FIELD_ResourceProduct_Product_Name="Producto";

@XendraTrl(Identifier="d9cbc308-18f9-f8ea-b3f7-bcc659cbd6d3")
public static String es_PE_FIELD_ResourceProduct_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="d9cbc308-18f9-f8ea-b3f7-bcc659cbd6d3")
public static String es_PE_FIELD_ResourceProduct_Product_Description="Producto; servicio ó artículo.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d9cbc308-18f9-f8ea-b3f7-bcc659cbd6d3")
public static final String FIELDNAME_ResourceProduct_Product="d9cbc308-18f9-f8ea-b3f7-bcc659cbd6d3";

@XendraTrl(Identifier="bcab40ce-9c2d-5c62-aaf1-a82d77a3af91")
public static String es_PE_FIELD_ProductDimension_Product_Name="Producto";

@XendraTrl(Identifier="bcab40ce-9c2d-5c62-aaf1-a82d77a3af91")
public static String es_PE_FIELD_ProductDimension_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="bcab40ce-9c2d-5c62-aaf1-a82d77a3af91")
public static String es_PE_FIELD_ProductDimension_Product_Description="Producto; servicio ó artículo.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bcab40ce-9c2d-5c62-aaf1-a82d77a3af91")
public static final String FIELDNAME_ProductDimension_Product="bcab40ce-9c2d-5c62-aaf1-a82d77a3af91";

@XendraTrl(Identifier="71de1bb2-9fd6-3120-d690-93cf5894b161")
public static String es_PE_FIELD_SelectProduct_Product_Name="Producto";

@XendraTrl(Identifier="71de1bb2-9fd6-3120-d690-93cf5894b161")
public static String es_PE_FIELD_SelectProduct_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="71de1bb2-9fd6-3120-d690-93cf5894b161")
public static String es_PE_FIELD_SelectProduct_Product_Description="Producto; servicio ó artículo.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="71de1bb2-9fd6-3120-d690-93cf5894b161")
public static final String FIELDNAME_SelectProduct_Product="71de1bb2-9fd6-3120-d690-93cf5894b161";

@XendraTrl(Identifier="62b36559-2e01-5570-412a-89dbbf998b71")
public static String es_PE_FIELD_Product_Product2_Name="Producto";

@XendraTrl(Identifier="62b36559-2e01-5570-412a-89dbbf998b71")
public static String es_PE_FIELD_Product_Product2_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="62b36559-2e01-5570-412a-89dbbf998b71")
public static String es_PE_FIELD_Product_Product2_Description="Producto; servicio ó artículo.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="62b36559-2e01-5570-412a-89dbbf998b71")
public static final String FIELDNAME_Product_Product2="62b36559-2e01-5570-412a-89dbbf998b71";
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

@XendraTrl(Identifier="d20f5fc3-3a0c-ca9e-025f-84df78a16ab3")
public static String es_PE_FIELD_Product_ProductType_Name="Tipo";

@XendraTrl(Identifier="d20f5fc3-3a0c-ca9e-025f-84df78a16ab3")
public static String es_PE_FIELD_Product_ProductType_Description="Tipo";

@XendraField(AD_Column_ID="M_Product_Type_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="Other options",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d20f5fc3-3a0c-ca9e-025f-84df78a16ab3")
public static final String FIELDNAME_Product_ProductType="d20f5fc3-3a0c-ca9e-025f-84df78a16ab3";

@XendraTrl(Identifier="491acf00-4569-86d1-0b03-51c54bd42f0a")
public static String es_PE_COLUMN_M_Product_Type_ID_Name="Tipo de Producto";

@XendraColumn(AD_Element_ID="6247a6d2-fefe-f01a-c954-3ddd9f9b9f1b",ColumnName="M_Product_Type_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="491acf00-4569-86d1-0b03-51c54bd42f0a",
Synchronized="2022-04-26 19:23:03.0")
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getName());
}

@XendraTrl(Identifier="956518b3-35b7-b9d8-d37b-149a37329383")
public static String es_PE_FIELD_Product_Name_Name="Nombre";

@XendraTrl(Identifier="956518b3-35b7-b9d8-d37b-149a37329383")
public static String es_PE_FIELD_Product_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="956518b3-35b7-b9d8-d37b-149a37329383")
public static String es_PE_FIELD_Product_Name_Description="Identificador alfanumérico de la entidad.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="956518b3-35b7-b9d8-d37b-149a37329383")
public static final String FIELDNAME_Product_Name="956518b3-35b7-b9d8-d37b-149a37329383";

@XendraTrl(Identifier="22a6c176-1811-f06e-015d-edc55e364dfd")
public static String es_PE_FIELD_AssignedProducts_Name_Name="Nombre";

@XendraTrl(Identifier="22a6c176-1811-f06e-015d-edc55e364dfd")
public static String es_PE_FIELD_AssignedProducts_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="22a6c176-1811-f06e-015d-edc55e364dfd")
public static String es_PE_FIELD_AssignedProducts_Name_Description="Identificador alfanumérico de la entidad.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="22a6c176-1811-f06e-015d-edc55e364dfd")
public static final String FIELDNAME_AssignedProducts_Name="22a6c176-1811-f06e-015d-edc55e364dfd";

@XendraTrl(Identifier="03df0d4b-c439-099a-86e4-90d9c6e434ce")
public static String es_PE_FIELD_ExpenseProduct_Name_Name="Nombre";

@XendraTrl(Identifier="03df0d4b-c439-099a-86e4-90d9c6e434ce")
public static String es_PE_FIELD_ExpenseProduct_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="03df0d4b-c439-099a-86e4-90d9c6e434ce")
public static String es_PE_FIELD_ExpenseProduct_Name_Description="Identificador alfanumérico de la entidad.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="03df0d4b-c439-099a-86e4-90d9c6e434ce")
public static final String FIELDNAME_ExpenseProduct_Name="03df0d4b-c439-099a-86e4-90d9c6e434ce";

@XendraTrl(Identifier="47d04546-cdc5-93ca-71e5-3e57cea394fa")
public static String es_PE_FIELD_ResourceProduct_Name_Name="Nombre";

@XendraTrl(Identifier="47d04546-cdc5-93ca-71e5-3e57cea394fa")
public static String es_PE_FIELD_ResourceProduct_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="47d04546-cdc5-93ca-71e5-3e57cea394fa")
public static String es_PE_FIELD_ResourceProduct_Name_Description="Identificador alfanumérico de la entidad.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="47d04546-cdc5-93ca-71e5-3e57cea394fa")
public static final String FIELDNAME_ResourceProduct_Name="47d04546-cdc5-93ca-71e5-3e57cea394fa";

@XendraTrl(Identifier="39aaa40c-b2dd-c7e9-f8b4-f5de805a2fd4")
public static String es_PE_FIELD_ProductDimension_Name_Name="Nombre";

@XendraTrl(Identifier="39aaa40c-b2dd-c7e9-f8b4-f5de805a2fd4")
public static String es_PE_FIELD_ProductDimension_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="39aaa40c-b2dd-c7e9-f8b4-f5de805a2fd4")
public static String es_PE_FIELD_ProductDimension_Name_Description="Identificador alfanumérico de la entidad.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="39aaa40c-b2dd-c7e9-f8b4-f5de805a2fd4")
public static final String FIELDNAME_ProductDimension_Name="39aaa40c-b2dd-c7e9-f8b4-f5de805a2fd4";

@XendraTrl(Identifier="f544ca90-ad71-7eb2-b232-bb76df87d5d4")
public static String es_PE_FIELD_SelectProduct_Name_Name="Nombre";

@XendraTrl(Identifier="f544ca90-ad71-7eb2-b232-bb76df87d5d4")
public static String es_PE_FIELD_SelectProduct_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="f544ca90-ad71-7eb2-b232-bb76df87d5d4")
public static String es_PE_FIELD_SelectProduct_Name_Description="Identificador alfanumérico de la entidad.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f544ca90-ad71-7eb2-b232-bb76df87d5d4")
public static final String FIELDNAME_SelectProduct_Name="f544ca90-ad71-7eb2-b232-bb76df87d5d4";

@XendraTrl(Identifier="6070ecc7-8862-cb11-8980-2645387787f9")
public static String es_PE_FIELD_Product_Name2_Name="Nombre";

@XendraTrl(Identifier="6070ecc7-8862-cb11-8980-2645387787f9")
public static String es_PE_FIELD_Product_Name2_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="6070ecc7-8862-cb11-8980-2645387787f9")
public static String es_PE_FIELD_Product_Name2_Description="Identificador alfanumérico de la entidad.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6070ecc7-8862-cb11-8980-2645387787f9")
public static final String FIELDNAME_Product_Name2="6070ecc7-8862-cb11-8980-2645387787f9";

@XendraTrl(Identifier="4e3c688f-2ca2-c2a7-1c75-e233e781a684")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,
ReadOnlyLogic="@ProductType@=R | @ProductType@=E | @ProductType@=O",IsIdentifier=true,SeqNo=1,
IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,
AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4e3c688f-2ca2-c2a7-1c75-e233e781a684",Synchronized="2022-04-26 19:23:03.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set PO_GS.
@param PO_GS PO_GS */
public void setPO_GS (String PO_GS)
{
if (PO_GS != null && PO_GS.length() > 1)
{
log.warning("Length > 1 - truncated");
PO_GS = PO_GS.substring(0,0);
}
set_Value (COLUMNNAME_PO_GS, PO_GS);
}
/** Get PO_GS.
@return PO_GS */
public String getPO_GS() 
{
return (String)get_Value(COLUMNNAME_PO_GS);
}

@XendraTrl(Identifier="9d4dd45b-69a5-40ca-9328-bd3b97b8e523")
public static String es_PE_FIELD_Product_PO_GS_Name="PO_GS";
@XendraField(AD_Column_ID="PO_GS",
IsCentrallyMaintained=true,AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",
IsDisplayed=false,DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2020-11-02 17:52:24.0",Identifier="9d4dd45b-69a5-40ca-9328-bd3b97b8e523")
public static final String FIELDNAME_Product_PO_GS="9d4dd45b-69a5-40ca-9328-bd3b97b8e523";

@XendraTrl(Identifier="22ffb320-abff-41dd-b32c-adcc10e465cf")
public static String es_PE_COLUMN_PO_GS_Name="po_gs";

@XendraColumn(AD_Element_ID="6947ca3c-f528-4ac5-8034-5745946ed6cc",ColumnName="PO_GS",
AD_Reference_ID=17,AD_Reference_Value_ID="684506f6-a7aa-49ad-852c-8e6c59f303f6",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="22ffb320-abff-41dd-b32c-adcc10e465cf",Synchronized="2022-04-26 19:23:03.0")
/** Column name PO_GS */
public static final String COLUMNNAME_PO_GS = "PO_GS";
/** Set PriceTypeCode.
@param PriceTypeCode PriceTypeCode */
public void setPriceTypeCode (String PriceTypeCode)
{
if (PriceTypeCode != null && PriceTypeCode.length() > 2)
{
log.warning("Length > 2 - truncated");
PriceTypeCode = PriceTypeCode.substring(0,1);
}
set_Value (COLUMNNAME_PriceTypeCode, PriceTypeCode);
}
/** Get PriceTypeCode.
@return PriceTypeCode */
public String getPriceTypeCode() 
{
return (String)get_Value(COLUMNNAME_PriceTypeCode);
}

@XendraTrl(Identifier="5e070dd2-e6bb-49f6-80c0-992fe7d4512d")
public static String es_PE_COLUMN_PriceTypeCode_Name="pricetypecode";

@XendraColumn(AD_Element_ID="f34df652-9bc9-4a5e-bd02-6b6c35a95faa",ColumnName="PriceTypeCode",
AD_Reference_ID=17,AD_Reference_Value_ID="3ebada4e-e45b-493f-a33b-d39203375707",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5e070dd2-e6bb-49f6-80c0-992fe7d4512d",Synchronized="2022-05-06 17:50:07.0")
/** Column name PriceTypeCode */
public static final String COLUMNNAME_PriceTypeCode = "PriceTypeCode";
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

@XendraTrl(Identifier="9226f0da-ae44-9173-2c05-3baa0a99d0cc")
public static String es_PE_FIELD_Product_ProcessNow_Name="Verificar LDM";

@XendraTrl(Identifier="9226f0da-ae44-9173-2c05-3baa0a99d0cc")
public static String es_PE_FIELD_Product_ProcessNow_Help="Verificar la estructura de la LDM revisa los elementos y pasos que hacen parte de la lista de materiales";

@XendraTrl(Identifier="9226f0da-ae44-9173-2c05-3baa0a99d0cc")
public static String es_PE_FIELD_Product_ProcessNow_Description="Verificar estructura de LDM";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N' & @IsBOM@='Y' & @IsVerified@='N'",DisplayLength=23,IsReadOnly=false,
SeqNo=330,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="9226f0da-ae44-9173-2c05-3baa0a99d0cc")
public static final String FIELDNAME_Product_ProcessNow="9226f0da-ae44-9173-2c05-3baa0a99d0cc";

@XendraTrl(Identifier="8a1136c5-13f5-b531-ac4b-4ceca56a70a9")
public static String es_PE_FIELD_AssignedProducts_ProcessNow_Name="Verificar LDM";

@XendraTrl(Identifier="8a1136c5-13f5-b531-ac4b-4ceca56a70a9")
public static String es_PE_FIELD_AssignedProducts_ProcessNow_Help="Verificar la estructura de la LDM revisa los elementos y pasos que hacen parte de la lista de materiales";

@XendraTrl(Identifier="8a1136c5-13f5-b531-ac4b-4ceca56a70a9")
public static String es_PE_FIELD_AssignedProducts_ProcessNow_Description="Verificar estructura de LDM";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8a1136c5-13f5-b531-ac4b-4ceca56a70a9")
public static final String FIELDNAME_AssignedProducts_ProcessNow="8a1136c5-13f5-b531-ac4b-4ceca56a70a9";

@XendraTrl(Identifier="4f38b293-a3e1-de7a-ef94-493d619d6946")
public static String es_PE_FIELD_ExpenseProduct_ProcessNow_Name="Verificar LDM";

@XendraTrl(Identifier="4f38b293-a3e1-de7a-ef94-493d619d6946")
public static String es_PE_FIELD_ExpenseProduct_ProcessNow_Help="Verificar la estructura de la LDM revisa los elementos y pasos que hacen parte de la lista de materiales";

@XendraTrl(Identifier="4f38b293-a3e1-de7a-ef94-493d619d6946")
public static String es_PE_FIELD_ExpenseProduct_ProcessNow_Description="Verificar estructura de LDM";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsSummary@='N' & @IsBOM@='Y' & @IsVerified@='N'",DisplayLength=23,IsReadOnly=false,
SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4f38b293-a3e1-de7a-ef94-493d619d6946")
public static final String FIELDNAME_ExpenseProduct_ProcessNow="4f38b293-a3e1-de7a-ef94-493d619d6946";

@XendraTrl(Identifier="d27a3be1-457c-6bbc-9458-2e5cf1b52e85")
public static String es_PE_FIELD_ResourceProduct_ProcessNow_Name="Verificar LDM";

@XendraTrl(Identifier="d27a3be1-457c-6bbc-9458-2e5cf1b52e85")
public static String es_PE_FIELD_ResourceProduct_ProcessNow_Help="Verificar la estructura de la LDM revisa los elementos y pasos que hacen parte de la lista de materiales";

@XendraTrl(Identifier="d27a3be1-457c-6bbc-9458-2e5cf1b52e85")
public static String es_PE_FIELD_ResourceProduct_ProcessNow_Description="Verificar estructura de LDM";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsSummary@='N' & @IsBOM@='Y' & @IsVerified@='N'",DisplayLength=23,IsReadOnly=false,
SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d27a3be1-457c-6bbc-9458-2e5cf1b52e85")
public static final String FIELDNAME_ResourceProduct_ProcessNow="d27a3be1-457c-6bbc-9458-2e5cf1b52e85";

@XendraTrl(Identifier="3cc792c8-f682-2e99-10c4-a877ac19f08e")
public static String es_PE_FIELD_ProductDimension_ProcessNow_Name="Verificar LDM";

@XendraTrl(Identifier="3cc792c8-f682-2e99-10c4-a877ac19f08e")
public static String es_PE_FIELD_ProductDimension_ProcessNow_Help="Verificar la estructura de la LDM revisa los elementos y pasos que hacen parte de la lista de materiales";

@XendraTrl(Identifier="3cc792c8-f682-2e99-10c4-a877ac19f08e")
public static String es_PE_FIELD_ProductDimension_ProcessNow_Description="Verificar estructura de LDM";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3cc792c8-f682-2e99-10c4-a877ac19f08e")
public static final String FIELDNAME_ProductDimension_ProcessNow="3cc792c8-f682-2e99-10c4-a877ac19f08e";

@XendraTrl(Identifier="df98c458-527e-80e9-af44-a8690a03d0f7")
public static String es_PE_FIELD_SelectProduct_ProcessNow_Name="Verificar LDM";

@XendraTrl(Identifier="df98c458-527e-80e9-af44-a8690a03d0f7")
public static String es_PE_FIELD_SelectProduct_ProcessNow_Help="Verificar la estructura de la LDM revisa los elementos y pasos que hacen parte de la lista de materiales";

@XendraTrl(Identifier="df98c458-527e-80e9-af44-a8690a03d0f7")
public static String es_PE_FIELD_SelectProduct_ProcessNow_Description="Verificar estructura de LDM";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="df98c458-527e-80e9-af44-a8690a03d0f7")
public static final String FIELDNAME_SelectProduct_ProcessNow="df98c458-527e-80e9-af44-a8690a03d0f7";

@XendraTrl(Identifier="26beac5e-ffa0-68fa-c02d-620a590ef6f6")
public static String es_PE_FIELD_Product_ProcessNow2_Name="Verificar LDM";

@XendraTrl(Identifier="26beac5e-ffa0-68fa-c02d-620a590ef6f6")
public static String es_PE_FIELD_Product_ProcessNow2_Help="Verificar la estructura de la LDM revisa los elementos y pasos que hacen parte de la lista de materiales";

@XendraTrl(Identifier="26beac5e-ffa0-68fa-c02d-620a590ef6f6")
public static String es_PE_FIELD_Product_ProcessNow2_Description="Verificar estructura de LDM";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N' & @IsBOM@='Y' & @IsVerified@='N'",DisplayLength=23,IsReadOnly=false,
SeqNo=330,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="26beac5e-ffa0-68fa-c02d-620a590ef6f6")
public static final String FIELDNAME_Product_ProcessNow2="26beac5e-ffa0-68fa-c02d-620a590ef6f6";

@XendraTrl(Identifier="b8f5a634-f077-27b5-a1b0-73ae6d0cf569")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="d551caf4-4ce8-9c21-490e-764e98942f42",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b8f5a634-f077-27b5-a1b0-73ae6d0cf569",Synchronized="2022-04-26 19:23:03.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
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

@XendraTrl(Identifier="5fab9065-8b85-fd25-02d5-9bfe9994053e")
public static String es_PE_FIELD_Product_ProductType2_Name="Tipo de Producto";

@XendraTrl(Identifier="5fab9065-8b85-fd25-02d5-9bfe9994053e")
public static String es_PE_FIELD_Product_ProductType2_Help="El tipo de producto también determina consecuencias contables";

@XendraTrl(Identifier="5fab9065-8b85-fd25-02d5-9bfe9994053e")
public static String es_PE_FIELD_Product_ProductType2_Description="Tipo de Producto";

@XendraField(AD_Column_ID="ProductType",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5fab9065-8b85-fd25-02d5-9bfe9994053e")
public static final String FIELDNAME_Product_ProductType2="5fab9065-8b85-fd25-02d5-9bfe9994053e";

@XendraTrl(Identifier="85f2f9d8-ff85-0f3a-693a-f6ded336a39d")
public static String es_PE_FIELD_AssignedProducts_ProductType_Name="Tipo de Producto";

@XendraTrl(Identifier="85f2f9d8-ff85-0f3a-693a-f6ded336a39d")
public static String es_PE_FIELD_AssignedProducts_ProductType_Help="El tipo de producto también determina consecuencias contables";

@XendraTrl(Identifier="85f2f9d8-ff85-0f3a-693a-f6ded336a39d")
public static String es_PE_FIELD_AssignedProducts_ProductType_Description="Tipo de Producto";

@XendraField(AD_Column_ID="ProductType",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="85f2f9d8-ff85-0f3a-693a-f6ded336a39d")
public static final String FIELDNAME_AssignedProducts_ProductType="85f2f9d8-ff85-0f3a-693a-f6ded336a39d";

@XendraTrl(Identifier="779fee64-0680-4cb6-96f6-1a2ecbee5f83")
public static String es_PE_FIELD_ExpenseProduct_ProductType_Name="Tipo de Producto";

@XendraTrl(Identifier="779fee64-0680-4cb6-96f6-1a2ecbee5f83")
public static String es_PE_FIELD_ExpenseProduct_ProductType_Help="El tipo de producto también determina consecuencias contables";

@XendraTrl(Identifier="779fee64-0680-4cb6-96f6-1a2ecbee5f83")
public static String es_PE_FIELD_ExpenseProduct_ProductType_Description="Tipo de Producto";

@XendraField(AD_Column_ID="ProductType",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="779fee64-0680-4cb6-96f6-1a2ecbee5f83")
public static final String FIELDNAME_ExpenseProduct_ProductType="779fee64-0680-4cb6-96f6-1a2ecbee5f83";

@XendraTrl(Identifier="1ccf5631-4a05-3766-e5b6-f7ed64a6e0b2")
public static String es_PE_FIELD_ResourceProduct_ProductType_Name="Tipo de Producto";

@XendraTrl(Identifier="1ccf5631-4a05-3766-e5b6-f7ed64a6e0b2")
public static String es_PE_FIELD_ResourceProduct_ProductType_Help="El tipo de producto también determina consecuencias contables";

@XendraTrl(Identifier="1ccf5631-4a05-3766-e5b6-f7ed64a6e0b2")
public static String es_PE_FIELD_ResourceProduct_ProductType_Description="Tipo de Producto";

@XendraField(AD_Column_ID="ProductType",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1ccf5631-4a05-3766-e5b6-f7ed64a6e0b2")
public static final String FIELDNAME_ResourceProduct_ProductType="1ccf5631-4a05-3766-e5b6-f7ed64a6e0b2";

@XendraTrl(Identifier="2ca6c62c-988a-08ec-8c60-2d811041fb85")
public static String es_PE_FIELD_ProductDimension_ProductType_Name="Tipo de Producto";

@XendraTrl(Identifier="2ca6c62c-988a-08ec-8c60-2d811041fb85")
public static String es_PE_FIELD_ProductDimension_ProductType_Help="El tipo de producto también determina consecuencias contables";

@XendraTrl(Identifier="2ca6c62c-988a-08ec-8c60-2d811041fb85")
public static String es_PE_FIELD_ProductDimension_ProductType_Description="Tipo de Producto";

@XendraField(AD_Column_ID="ProductType",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2ca6c62c-988a-08ec-8c60-2d811041fb85")
public static final String FIELDNAME_ProductDimension_ProductType="2ca6c62c-988a-08ec-8c60-2d811041fb85";

@XendraTrl(Identifier="c13c67bb-33a5-f2b8-72bf-348edfcb9774")
public static String es_PE_FIELD_SelectProduct_ProductType_Name="Tipo de Producto";

@XendraTrl(Identifier="c13c67bb-33a5-f2b8-72bf-348edfcb9774")
public static String es_PE_FIELD_SelectProduct_ProductType_Help="El tipo de producto también determina consecuencias contables";

@XendraTrl(Identifier="c13c67bb-33a5-f2b8-72bf-348edfcb9774")
public static String es_PE_FIELD_SelectProduct_ProductType_Description="Tipo de Producto";

@XendraField(AD_Column_ID="ProductType",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c13c67bb-33a5-f2b8-72bf-348edfcb9774")
public static final String FIELDNAME_SelectProduct_ProductType="c13c67bb-33a5-f2b8-72bf-348edfcb9774";

@XendraTrl(Identifier="cadbb073-0de2-eedf-a691-ff678d6bec5a")
public static String es_PE_FIELD_Product_ProductType3_Name="Tipo de Producto";

@XendraTrl(Identifier="cadbb073-0de2-eedf-a691-ff678d6bec5a")
public static String es_PE_FIELD_Product_ProductType3_Help="El tipo de producto también determina consecuencias contables";

@XendraTrl(Identifier="cadbb073-0de2-eedf-a691-ff678d6bec5a")
public static String es_PE_FIELD_Product_ProductType3_Description="Tipo de Producto";

@XendraField(AD_Column_ID="ProductType",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cadbb073-0de2-eedf-a691-ff678d6bec5a")
public static final String FIELDNAME_Product_ProductType3="cadbb073-0de2-eedf-a691-ff678d6bec5a";

@XendraTrl(Identifier="b1eb05ff-9b0e-6b4f-31b9-1a771064c4ab")
public static String es_PE_COLUMN_ProductType_Name="Tipo de Producto";

@XendraColumn(AD_Element_ID="4780314c-a559-eb6b-03a6-3eb6c18136da",ColumnName="ProductType",
AD_Reference_ID=17,AD_Reference_Value_ID="028a2683-c298-dd54-f589-fe0d15a36c1b",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="I",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b1eb05ff-9b0e-6b4f-31b9-1a771064c4ab",Synchronized="2022-04-26 19:23:03.0")
/** Column name ProductType */
public static final String COLUMNNAME_ProductType = "ProductType";
/** Set ProductTypeTax.
@param ProductTypeTax ProductTypeTax */
public void setProductTypeTax (String ProductTypeTax)
{
if (ProductTypeTax.length() > 2)
{
log.warning("Length > 2 - truncated");
ProductTypeTax = ProductTypeTax.substring(0,1);
}
set_Value (COLUMNNAME_ProductTypeTax, ProductTypeTax);
}
/** Get ProductTypeTax.
@return ProductTypeTax */
public String getProductTypeTax() 
{
return (String)get_Value(COLUMNNAME_ProductTypeTax);
}

@XendraTrl(Identifier="3e7acd82-acc4-342a-7892-fc8459ff02a3")
public static String es_PE_FIELD_Product_ProductTypeTax_Name="Tipo de Existencia";

@XendraField(AD_Column_ID="ProductTypeTax",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3e7acd82-acc4-342a-7892-fc8459ff02a3")
public static final String FIELDNAME_Product_ProductTypeTax="3e7acd82-acc4-342a-7892-fc8459ff02a3";

@XendraTrl(Identifier="e92b15bd-a77a-66b2-9293-5c91c23f76fe")
public static String es_PE_COLUMN_ProductTypeTax_Name="producttypetax";

@XendraColumn(AD_Element_ID="dbf5fbd7-d810-ec01-47e7-164e98fcc42c",ColumnName="ProductTypeTax",
AD_Reference_ID=17,AD_Reference_Value_ID="aa86fc62-6f03-d7f8-4cb3-2cdef5206e20",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e92b15bd-a77a-66b2-9293-5c91c23f76fe",Synchronized="2022-04-26 19:23:03.0")
/** Column name ProductTypeTax */
public static final String COLUMNNAME_ProductTypeTax = "ProductTypeTax";
/** Set Mail Template.
@param R_MailText_ID Text templates for mailings */
public void setR_MailText_ID (int R_MailText_ID)
{
if (R_MailText_ID <= 0) set_Value (COLUMNNAME_R_MailText_ID, null);
 else 
set_Value (COLUMNNAME_R_MailText_ID, Integer.valueOf(R_MailText_ID));
}
/** Get Mail Template.
@return Text templates for mailings */
public int getR_MailText_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_MailText_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7229adb0-b387-5bad-3363-2d951397eefc")
public static String es_PE_FIELD_Product_MailTemplate_Name="Patrón de Correo";

@XendraTrl(Identifier="7229adb0-b387-5bad-3363-2d951397eefc")
public static String es_PE_FIELD_Product_MailTemplate_Help="El patrón de correo indica el patrón de correo para mensajes de retorno.";

@XendraTrl(Identifier="7229adb0-b387-5bad-3363-2d951397eefc")
public static String es_PE_FIELD_Product_MailTemplate_Description="Patrón de texto para correos.";

@XendraField(AD_Column_ID="R_MailText_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7229adb0-b387-5bad-3363-2d951397eefc")
public static final String FIELDNAME_Product_MailTemplate="7229adb0-b387-5bad-3363-2d951397eefc";

@XendraTrl(Identifier="cc6ee418-191b-8347-16f9-dbe4227d0493")
public static String es_PE_FIELD_AssignedProducts_MailTemplate_Name="Patrón de Correo";

@XendraTrl(Identifier="cc6ee418-191b-8347-16f9-dbe4227d0493")
public static String es_PE_FIELD_AssignedProducts_MailTemplate_Help="El patrón de correo indica el patrón de correo para mensajes de retorno.";

@XendraTrl(Identifier="cc6ee418-191b-8347-16f9-dbe4227d0493")
public static String es_PE_FIELD_AssignedProducts_MailTemplate_Description="Patrón de texto para correos.";

@XendraField(AD_Column_ID="R_MailText_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cc6ee418-191b-8347-16f9-dbe4227d0493")
public static final String FIELDNAME_AssignedProducts_MailTemplate="cc6ee418-191b-8347-16f9-dbe4227d0493";

@XendraTrl(Identifier="2af3a49f-ec32-93ea-8f9e-f47183d6cbb7")
public static String es_PE_FIELD_ExpenseProduct_MailTemplate_Name="Patrón de Correo";

@XendraTrl(Identifier="2af3a49f-ec32-93ea-8f9e-f47183d6cbb7")
public static String es_PE_FIELD_ExpenseProduct_MailTemplate_Help="El patrón de correo indica el patrón de correo para mensajes de retorno.";

@XendraTrl(Identifier="2af3a49f-ec32-93ea-8f9e-f47183d6cbb7")
public static String es_PE_FIELD_ExpenseProduct_MailTemplate_Description="Patrón de texto para correos.";

@XendraField(AD_Column_ID="R_MailText_ID",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2af3a49f-ec32-93ea-8f9e-f47183d6cbb7")
public static final String FIELDNAME_ExpenseProduct_MailTemplate="2af3a49f-ec32-93ea-8f9e-f47183d6cbb7";

@XendraTrl(Identifier="ce79d959-e176-953f-4a5a-118d3451195f")
public static String es_PE_FIELD_ResourceProduct_MailTemplate_Name="Patrón de Correo";

@XendraTrl(Identifier="ce79d959-e176-953f-4a5a-118d3451195f")
public static String es_PE_FIELD_ResourceProduct_MailTemplate_Help="El patrón de correo indica el patrón de correo para mensajes de retorno.";

@XendraTrl(Identifier="ce79d959-e176-953f-4a5a-118d3451195f")
public static String es_PE_FIELD_ResourceProduct_MailTemplate_Description="Patrón de texto para correos.";

@XendraField(AD_Column_ID="R_MailText_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ce79d959-e176-953f-4a5a-118d3451195f")
public static final String FIELDNAME_ResourceProduct_MailTemplate="ce79d959-e176-953f-4a5a-118d3451195f";

@XendraTrl(Identifier="c77243a5-fdfa-5ed7-ff28-92943ab30c65")
public static String es_PE_FIELD_ProductDimension_MailTemplate_Name="Patrón de Correo";

@XendraTrl(Identifier="c77243a5-fdfa-5ed7-ff28-92943ab30c65")
public static String es_PE_FIELD_ProductDimension_MailTemplate_Help="El patrón de correo indica el patrón de correo para mensajes de retorno.";

@XendraTrl(Identifier="c77243a5-fdfa-5ed7-ff28-92943ab30c65")
public static String es_PE_FIELD_ProductDimension_MailTemplate_Description="Patrón de texto para correos.";

@XendraField(AD_Column_ID="R_MailText_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c77243a5-fdfa-5ed7-ff28-92943ab30c65")
public static final String FIELDNAME_ProductDimension_MailTemplate="c77243a5-fdfa-5ed7-ff28-92943ab30c65";

@XendraTrl(Identifier="72a292b0-4698-fd7f-1724-cd569be3819e")
public static String es_PE_FIELD_SelectProduct_MailTemplate_Name="Patrón de Correo";

@XendraTrl(Identifier="72a292b0-4698-fd7f-1724-cd569be3819e")
public static String es_PE_FIELD_SelectProduct_MailTemplate_Help="El patrón de correo indica el patrón de correo para mensajes de retorno.";

@XendraTrl(Identifier="72a292b0-4698-fd7f-1724-cd569be3819e")
public static String es_PE_FIELD_SelectProduct_MailTemplate_Description="Patrón de texto para correos.";

@XendraField(AD_Column_ID="R_MailText_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="72a292b0-4698-fd7f-1724-cd569be3819e")
public static final String FIELDNAME_SelectProduct_MailTemplate="72a292b0-4698-fd7f-1724-cd569be3819e";

@XendraTrl(Identifier="8e265ed5-b5d5-40ec-f41a-60a16664d8ae")
public static String es_PE_FIELD_Product_MailTemplate2_Name="Patrón de Correo";

@XendraTrl(Identifier="8e265ed5-b5d5-40ec-f41a-60a16664d8ae")
public static String es_PE_FIELD_Product_MailTemplate2_Help="El patrón de correo indica el patrón de correo para mensajes de retorno.";

@XendraTrl(Identifier="8e265ed5-b5d5-40ec-f41a-60a16664d8ae")
public static String es_PE_FIELD_Product_MailTemplate2_Description="Patrón de texto para correos.";

@XendraField(AD_Column_ID="R_MailText_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8e265ed5-b5d5-40ec-f41a-60a16664d8ae")
public static final String FIELDNAME_Product_MailTemplate2="8e265ed5-b5d5-40ec-f41a-60a16664d8ae";

@XendraTrl(Identifier="2f37f98a-4091-bb3a-b951-c90e212b9359")
public static String es_PE_COLUMN_R_MailText_ID_Name="Patrón de Correo";

@XendraColumn(AD_Element_ID="02b75e55-f80b-d8c7-5f34-dfc8b6205e3e",ColumnName="R_MailText_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2f37f98a-4091-bb3a-b951-c90e212b9359",
Synchronized="2022-04-26 19:23:03.0")
/** Column name R_MailText_ID */
public static final String COLUMNNAME_R_MailText_ID = "R_MailText_ID";
/** Set Sales Representative.
@param SalesRep_ID Sales Representative or Company Agent */
public void setSalesRep_ID (int SalesRep_ID)
{
if (SalesRep_ID <= 0) set_Value (COLUMNNAME_SalesRep_ID, null);
 else 
set_Value (COLUMNNAME_SalesRep_ID, Integer.valueOf(SalesRep_ID));
}
/** Get Sales Representative.
@return Sales Representative or Company Agent */
public int getSalesRep_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SalesRep_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="bffc196a-59d0-620f-6d9f-dd5ac7984214")
public static String es_PE_FIELD_Product_CompanyAgent_Name="Comprador";

@XendraTrl(Identifier="bffc196a-59d0-620f-6d9f-dd5ac7984214")
public static String es_PE_FIELD_Product_CompanyAgent_Help="Agente de compras para el documento.";

@XendraTrl(Identifier="bffc196a-59d0-620f-6d9f-dd5ac7984214")
public static String es_PE_FIELD_Product_CompanyAgent_Description="Comprador/ Agente";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bffc196a-59d0-620f-6d9f-dd5ac7984214")
public static final String FIELDNAME_Product_CompanyAgent="bffc196a-59d0-620f-6d9f-dd5ac7984214";

@XendraTrl(Identifier="f54f43cd-b587-a91e-9308-7a41324dba93")
public static String es_PE_FIELD_AssignedProducts_CompanyAgent_Name="Comprador";

@XendraTrl(Identifier="f54f43cd-b587-a91e-9308-7a41324dba93")
public static String es_PE_FIELD_AssignedProducts_CompanyAgent_Help="Agente de compras para el documento.";

@XendraTrl(Identifier="f54f43cd-b587-a91e-9308-7a41324dba93")
public static String es_PE_FIELD_AssignedProducts_CompanyAgent_Description="Comprador/ Agente";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f54f43cd-b587-a91e-9308-7a41324dba93")
public static final String FIELDNAME_AssignedProducts_CompanyAgent="f54f43cd-b587-a91e-9308-7a41324dba93";

@XendraTrl(Identifier="5848aba3-ce1f-f843-f061-c857be87db67")
public static String es_PE_FIELD_ExpenseProduct_SalesRepresentative_Name="Agente Cía";

@XendraTrl(Identifier="5848aba3-ce1f-f843-f061-c857be87db67")
public static String es_PE_FIELD_ExpenseProduct_SalesRepresentative_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraTrl(Identifier="5848aba3-ce1f-f843-f061-c857be87db67")
public static String es_PE_FIELD_ExpenseProduct_SalesRepresentative_Description="Representante de Ventas";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5848aba3-ce1f-f843-f061-c857be87db67")
public static final String FIELDNAME_ExpenseProduct_SalesRepresentative="5848aba3-ce1f-f843-f061-c857be87db67";

@XendraTrl(Identifier="3675dcc5-dde3-c0f6-60b2-bf98b0ebb066")
public static String es_PE_FIELD_ResourceProduct_SalesRepresentative_Name="Agente Cía";

@XendraTrl(Identifier="3675dcc5-dde3-c0f6-60b2-bf98b0ebb066")
public static String es_PE_FIELD_ResourceProduct_SalesRepresentative_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraTrl(Identifier="3675dcc5-dde3-c0f6-60b2-bf98b0ebb066")
public static String es_PE_FIELD_ResourceProduct_SalesRepresentative_Description="Representante de Ventas";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3675dcc5-dde3-c0f6-60b2-bf98b0ebb066")
public static final String FIELDNAME_ResourceProduct_SalesRepresentative="3675dcc5-dde3-c0f6-60b2-bf98b0ebb066";

@XendraTrl(Identifier="bdd8226c-ec6f-8fd1-8aa0-51c4d27fa027")
public static String es_PE_FIELD_ProductDimension_SalesRepresentative_Name="Agente Cía";

@XendraTrl(Identifier="bdd8226c-ec6f-8fd1-8aa0-51c4d27fa027")
public static String es_PE_FIELD_ProductDimension_SalesRepresentative_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraTrl(Identifier="bdd8226c-ec6f-8fd1-8aa0-51c4d27fa027")
public static String es_PE_FIELD_ProductDimension_SalesRepresentative_Description="Representante de Ventas";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bdd8226c-ec6f-8fd1-8aa0-51c4d27fa027")
public static final String FIELDNAME_ProductDimension_SalesRepresentative="bdd8226c-ec6f-8fd1-8aa0-51c4d27fa027";

@XendraTrl(Identifier="5bae1709-2b15-5ad8-e7cf-59da0a543337")
public static String es_PE_FIELD_SelectProduct_CompanyAgent_Name="Comprador";

@XendraTrl(Identifier="5bae1709-2b15-5ad8-e7cf-59da0a543337")
public static String es_PE_FIELD_SelectProduct_CompanyAgent_Help="Agente de compras para el documento.";

@XendraTrl(Identifier="5bae1709-2b15-5ad8-e7cf-59da0a543337")
public static String es_PE_FIELD_SelectProduct_CompanyAgent_Description="Comprador/ Agente";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5bae1709-2b15-5ad8-e7cf-59da0a543337")
public static final String FIELDNAME_SelectProduct_CompanyAgent="5bae1709-2b15-5ad8-e7cf-59da0a543337";

@XendraTrl(Identifier="46ab34f9-c70a-cef1-496f-da5be4de1943")
public static String es_PE_FIELD_Product_CompanyAgent2_Name="Comprador";

@XendraTrl(Identifier="46ab34f9-c70a-cef1-496f-da5be4de1943")
public static String es_PE_FIELD_Product_CompanyAgent2_Help="Agente de compras para el documento.";

@XendraTrl(Identifier="46ab34f9-c70a-cef1-496f-da5be4de1943")
public static String es_PE_FIELD_Product_CompanyAgent2_Description="Comprador/ Agente";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="46ab34f9-c70a-cef1-496f-da5be4de1943")
public static final String FIELDNAME_Product_CompanyAgent2="46ab34f9-c70a-cef1-496f-da5be4de1943";

@XendraTrl(Identifier="a50d170c-123f-183d-a1f2-1d587810574f")
public static String es_PE_COLUMN_SalesRep_ID_Name="Agente Cía";

@XendraColumn(AD_Element_ID="197a9c3a-ff10-c291-d65f-5e05a36d3710",ColumnName="SalesRep_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="15251147-a1b6-4a83-a3a5-2d3ae7db69d9",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a50d170c-123f-183d-a1f2-1d587810574f",Synchronized="2022-04-26 19:23:03.0")
/** Column name SalesRep_ID */
public static final String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
/** Set Expense Type.
@param S_ExpenseType_ID Expense report type */
public void setS_ExpenseType_ID (int S_ExpenseType_ID)
{
if (S_ExpenseType_ID <= 0) set_ValueNoCheck (COLUMNNAME_S_ExpenseType_ID, null);
 else 
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

@XendraTrl(Identifier="fde980b3-1091-b61f-8056-f7dce696fdbb")
public static String es_PE_FIELD_Product_ExpenseType_Name="Tipo de Gasto";

@XendraTrl(Identifier="fde980b3-1091-b61f-8056-f7dce696fdbb")
public static String es_PE_FIELD_Product_ExpenseType_Description="Tipo de Informe de gasto";

@XendraField(AD_Column_ID="S_ExpenseType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@ProductType@=E",DisplayLength=14,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fde980b3-1091-b61f-8056-f7dce696fdbb")
public static final String FIELDNAME_Product_ExpenseType="fde980b3-1091-b61f-8056-f7dce696fdbb";

@XendraTrl(Identifier="1fb517d5-023b-3da5-4eb2-8b767f7f09c3")
public static String es_PE_FIELD_AssignedProducts_ExpenseType_Name="Tipo de Gasto";

@XendraTrl(Identifier="1fb517d5-023b-3da5-4eb2-8b767f7f09c3")
public static String es_PE_FIELD_AssignedProducts_ExpenseType_Description="Tipo de Informe de gasto";

@XendraField(AD_Column_ID="S_ExpenseType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ProductType@=E",DisplayLength=14,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1fb517d5-023b-3da5-4eb2-8b767f7f09c3")
public static final String FIELDNAME_AssignedProducts_ExpenseType="1fb517d5-023b-3da5-4eb2-8b767f7f09c3";

@XendraTrl(Identifier="d71ab3bb-0a48-5a95-cc02-e9664a8db083")
public static String es_PE_FIELD_ExpenseProduct_ExpenseType_Name="Tipo de Gasto";

@XendraTrl(Identifier="d71ab3bb-0a48-5a95-cc02-e9664a8db083")
public static String es_PE_FIELD_ExpenseProduct_ExpenseType_Description="Tipo de Informe de gasto";

@XendraField(AD_Column_ID="S_ExpenseType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@ProductType@=E",DisplayLength=14,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d71ab3bb-0a48-5a95-cc02-e9664a8db083")
public static final String FIELDNAME_ExpenseProduct_ExpenseType="d71ab3bb-0a48-5a95-cc02-e9664a8db083";

@XendraTrl(Identifier="71b180ad-90ba-397e-14ac-49bd4e79abdf")
public static String es_PE_FIELD_ResourceProduct_ExpenseType_Name="Tipo de Gasto";

@XendraTrl(Identifier="71b180ad-90ba-397e-14ac-49bd4e79abdf")
public static String es_PE_FIELD_ResourceProduct_ExpenseType_Description="Tipo de Informe de gasto";

@XendraField(AD_Column_ID="S_ExpenseType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@ProductTypeType@=E",DisplayLength=14,IsReadOnly=true,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="71b180ad-90ba-397e-14ac-49bd4e79abdf")
public static final String FIELDNAME_ResourceProduct_ExpenseType="71b180ad-90ba-397e-14ac-49bd4e79abdf";

@XendraTrl(Identifier="7c75b3f6-edaf-1437-02a9-61399c04fb84")
public static String es_PE_FIELD_ProductDimension_ExpenseType_Name="Tipo de Gasto";

@XendraTrl(Identifier="7c75b3f6-edaf-1437-02a9-61399c04fb84")
public static String es_PE_FIELD_ProductDimension_ExpenseType_Description="Tipo de Informe de gasto";

@XendraField(AD_Column_ID="S_ExpenseType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7c75b3f6-edaf-1437-02a9-61399c04fb84")
public static final String FIELDNAME_ProductDimension_ExpenseType="7c75b3f6-edaf-1437-02a9-61399c04fb84";

@XendraTrl(Identifier="25f9bde6-4cb0-072b-5f98-994fd1ffb72a")
public static String es_PE_FIELD_SelectProduct_ExpenseType_Name="Tipo de Gasto";

@XendraTrl(Identifier="25f9bde6-4cb0-072b-5f98-994fd1ffb72a")
public static String es_PE_FIELD_SelectProduct_ExpenseType_Description="Tipo de Informe de gasto";

@XendraField(AD_Column_ID="S_ExpenseType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="25f9bde6-4cb0-072b-5f98-994fd1ffb72a")
public static final String FIELDNAME_SelectProduct_ExpenseType="25f9bde6-4cb0-072b-5f98-994fd1ffb72a";

@XendraTrl(Identifier="0255e5ce-90de-fa60-e1e4-80bb79ffa281")
public static String es_PE_FIELD_Product_ExpenseType2_Name="Tipo de Gasto";

@XendraTrl(Identifier="0255e5ce-90de-fa60-e1e4-80bb79ffa281")
public static String es_PE_FIELD_Product_ExpenseType2_Description="Tipo de Informe de gasto";

@XendraField(AD_Column_ID="S_ExpenseType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@ProductType@=E",DisplayLength=14,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0255e5ce-90de-fa60-e1e4-80bb79ffa281")
public static final String FIELDNAME_Product_ExpenseType2="0255e5ce-90de-fa60-e1e4-80bb79ffa281";

@XendraTrl(Identifier="0bafc89a-ea6a-5f13-86b0-7aa1a03389e4")
public static String es_PE_COLUMN_S_ExpenseType_ID_Name="Tipo de Gasto";

@XendraColumn(AD_Element_ID="5c2d1ef2-cb6c-dc1a-d4b7-1f306eab6664",ColumnName="S_ExpenseType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0bafc89a-ea6a-5f13-86b0-7aa1a03389e4",
Synchronized="2022-04-26 19:23:03.0")
/** Column name S_ExpenseType_ID */
public static final String COLUMNNAME_S_ExpenseType_ID = "S_ExpenseType_ID";
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

@XendraTrl(Identifier="3bbb1e41-bcdd-45d0-e32c-2b720ac7b5e2")
public static String es_PE_FIELD_Product_ShelfDepth_Name="Profundidad del Anaquel";

@XendraTrl(Identifier="3bbb1e41-bcdd-45d0-e32c-2b720ac7b5e2")
public static String es_PE_FIELD_Product_ShelfDepth_Help="La profundidad del Anaquel indica la dimensión de la profundidad requerida en un anaquel para un producto";

@XendraTrl(Identifier="3bbb1e41-bcdd-45d0-e32c-2b720ac7b5e2")
public static String es_PE_FIELD_Product_ShelfDepth_Description="Profundidad del anaquel requerida";

@XendraField(AD_Column_ID="ShelfDepth",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N' & @ProductType@=I & @IsStocked@=Y",DisplayLength=11,IsReadOnly=false,
SeqNo=290,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="3bbb1e41-bcdd-45d0-e32c-2b720ac7b5e2")
public static final String FIELDNAME_Product_ShelfDepth="3bbb1e41-bcdd-45d0-e32c-2b720ac7b5e2";

@XendraTrl(Identifier="d4898f4a-fe72-9779-7090-2ff4cdac3812")
public static String es_PE_FIELD_AssignedProducts_ShelfDepth_Name="Profundidad del Anaquel";

@XendraTrl(Identifier="d4898f4a-fe72-9779-7090-2ff4cdac3812")
public static String es_PE_FIELD_AssignedProducts_ShelfDepth_Help="La profundidad del Anaquel indica la dimensión de la profundidad requerida en un anaquel para un producto";

@XendraTrl(Identifier="d4898f4a-fe72-9779-7090-2ff4cdac3812")
public static String es_PE_FIELD_AssignedProducts_ShelfDepth_Description="Profundidad del anaquel requerida";

@XendraField(AD_Column_ID="ShelfDepth",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d4898f4a-fe72-9779-7090-2ff4cdac3812")
public static final String FIELDNAME_AssignedProducts_ShelfDepth="d4898f4a-fe72-9779-7090-2ff4cdac3812";

@XendraTrl(Identifier="082fb112-cc2a-007c-9371-9e7f6ab2ca0b")
public static String es_PE_FIELD_ExpenseProduct_ShelfDepth_Name="Profundidad del Anaquel";

@XendraTrl(Identifier="082fb112-cc2a-007c-9371-9e7f6ab2ca0b")
public static String es_PE_FIELD_ExpenseProduct_ShelfDepth_Help="La profundidad del Anaquel indica la dimensión de la profundidad requerida en un anaquel para un producto";

@XendraTrl(Identifier="082fb112-cc2a-007c-9371-9e7f6ab2ca0b")
public static String es_PE_FIELD_ExpenseProduct_ShelfDepth_Description="Profundidad del anaquel requerida";

@XendraField(AD_Column_ID="ShelfDepth",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsSummary@='N' & @ProductType@=I",DisplayLength=11,IsReadOnly=false,SeqNo=0,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="082fb112-cc2a-007c-9371-9e7f6ab2ca0b")
public static final String FIELDNAME_ExpenseProduct_ShelfDepth="082fb112-cc2a-007c-9371-9e7f6ab2ca0b";

@XendraTrl(Identifier="24bea1fa-63e8-03fa-e76b-fcbc671e0dd5")
public static String es_PE_FIELD_ResourceProduct_ShelfDepth_Name="Profundidad del Anaquel";

@XendraTrl(Identifier="24bea1fa-63e8-03fa-e76b-fcbc671e0dd5")
public static String es_PE_FIELD_ResourceProduct_ShelfDepth_Help="La profundidad del Anaquel indica la dimensión de la profundidad requerida en un anaquel para un producto";

@XendraTrl(Identifier="24bea1fa-63e8-03fa-e76b-fcbc671e0dd5")
public static String es_PE_FIELD_ResourceProduct_ShelfDepth_Description="Profundidad del anaquel requerida";

@XendraField(AD_Column_ID="ShelfDepth",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsSummary@='N' & @ProductType@=I",DisplayLength=11,IsReadOnly=false,SeqNo=0,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="24bea1fa-63e8-03fa-e76b-fcbc671e0dd5")
public static final String FIELDNAME_ResourceProduct_ShelfDepth="24bea1fa-63e8-03fa-e76b-fcbc671e0dd5";

@XendraTrl(Identifier="9d8983cc-0e8f-a19b-22db-502b7035d305")
public static String es_PE_FIELD_ProductDimension_ShelfDepth_Name="Profundidad del Anaquel";

@XendraTrl(Identifier="9d8983cc-0e8f-a19b-22db-502b7035d305")
public static String es_PE_FIELD_ProductDimension_ShelfDepth_Help="La profundidad del Anaquel indica la dimensión de la profundidad requerida en un anaquel para un producto";

@XendraTrl(Identifier="9d8983cc-0e8f-a19b-22db-502b7035d305")
public static String es_PE_FIELD_ProductDimension_ShelfDepth_Description="Profundidad del anaquel requerida";

@XendraField(AD_Column_ID="ShelfDepth",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9d8983cc-0e8f-a19b-22db-502b7035d305")
public static final String FIELDNAME_ProductDimension_ShelfDepth="9d8983cc-0e8f-a19b-22db-502b7035d305";

@XendraTrl(Identifier="32458ba5-aba6-b07c-6194-b0dd8e97a74d")
public static String es_PE_FIELD_SelectProduct_ShelfDepth_Name="Profundidad del Anaquel";

@XendraTrl(Identifier="32458ba5-aba6-b07c-6194-b0dd8e97a74d")
public static String es_PE_FIELD_SelectProduct_ShelfDepth_Help="La profundidad del Anaquel indica la dimensión de la profundidad requerida en un anaquel para un producto";

@XendraTrl(Identifier="32458ba5-aba6-b07c-6194-b0dd8e97a74d")
public static String es_PE_FIELD_SelectProduct_ShelfDepth_Description="Profundidad del anaquel requerida";

@XendraField(AD_Column_ID="ShelfDepth",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="32458ba5-aba6-b07c-6194-b0dd8e97a74d")
public static final String FIELDNAME_SelectProduct_ShelfDepth="32458ba5-aba6-b07c-6194-b0dd8e97a74d";

@XendraTrl(Identifier="36a7e019-2273-2a69-f0d8-a17bd4217489")
public static String es_PE_FIELD_Product_ShelfDepth2_Name="Profundidad del Anaquel";

@XendraTrl(Identifier="36a7e019-2273-2a69-f0d8-a17bd4217489")
public static String es_PE_FIELD_Product_ShelfDepth2_Help="La profundidad del Anaquel indica la dimensión de la profundidad requerida en un anaquel para un producto";

@XendraTrl(Identifier="36a7e019-2273-2a69-f0d8-a17bd4217489")
public static String es_PE_FIELD_Product_ShelfDepth2_Description="Profundidad del anaquel requerida";

@XendraField(AD_Column_ID="ShelfDepth",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N' & @ProductType@=I & @IsStocked@=Y",DisplayLength=11,IsReadOnly=false,
SeqNo=290,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="36a7e019-2273-2a69-f0d8-a17bd4217489")
public static final String FIELDNAME_Product_ShelfDepth2="36a7e019-2273-2a69-f0d8-a17bd4217489";

@XendraTrl(Identifier="1039c92e-dc25-3176-b35e-7a81aefbd213")
public static String es_PE_COLUMN_ShelfDepth_Name="Profundidad del Anaquel";

@XendraColumn(AD_Element_ID="71c10a34-b62d-3e7b-080f-c3c3d211b095",ColumnName="ShelfDepth",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1039c92e-dc25-3176-b35e-7a81aefbd213",
Synchronized="2022-04-26 19:23:03.0")
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

@XendraTrl(Identifier="d89ac9a2-9ca1-8f01-122a-9c8709fad4ba")
public static String es_PE_FIELD_Product_ShelfHeight_Name="Altura del Anaquel";

@XendraTrl(Identifier="d89ac9a2-9ca1-8f01-122a-9c8709fad4ba")
public static String es_PE_FIELD_Product_ShelfHeight_Help="La altura del Anaquel indica la dimensión de la altura requerida en un anaquel para un producto";

@XendraTrl(Identifier="d89ac9a2-9ca1-8f01-122a-9c8709fad4ba")
public static String es_PE_FIELD_Product_ShelfHeight_Description="Altura del anaquel requerida";

@XendraField(AD_Column_ID="ShelfHeight",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N' & @ProductType@=I & @IsStocked@=Y",DisplayLength=11,IsReadOnly=false,
SeqNo=280,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d89ac9a2-9ca1-8f01-122a-9c8709fad4ba")
public static final String FIELDNAME_Product_ShelfHeight="d89ac9a2-9ca1-8f01-122a-9c8709fad4ba";

@XendraTrl(Identifier="72d1dcea-4adb-b710-47b2-3989aa759b6d")
public static String es_PE_FIELD_AssignedProducts_ShelfHeight_Name="Altura del Anaquel";

@XendraTrl(Identifier="72d1dcea-4adb-b710-47b2-3989aa759b6d")
public static String es_PE_FIELD_AssignedProducts_ShelfHeight_Help="La altura del Anaquel indica la dimensión de la altura requerida en un anaquel para un producto";

@XendraTrl(Identifier="72d1dcea-4adb-b710-47b2-3989aa759b6d")
public static String es_PE_FIELD_AssignedProducts_ShelfHeight_Description="Altura del anaquel requerida";

@XendraField(AD_Column_ID="ShelfHeight",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="72d1dcea-4adb-b710-47b2-3989aa759b6d")
public static final String FIELDNAME_AssignedProducts_ShelfHeight="72d1dcea-4adb-b710-47b2-3989aa759b6d";

@XendraTrl(Identifier="b891c263-498c-15df-56d7-b8aa330be7c8")
public static String es_PE_FIELD_ExpenseProduct_ShelfHeight_Name="Altura del Anaquel";

@XendraTrl(Identifier="b891c263-498c-15df-56d7-b8aa330be7c8")
public static String es_PE_FIELD_ExpenseProduct_ShelfHeight_Help="La altura del Anaquel indica la dimensión de la altura requerida en un anaquel para un producto";

@XendraTrl(Identifier="b891c263-498c-15df-56d7-b8aa330be7c8")
public static String es_PE_FIELD_ExpenseProduct_ShelfHeight_Description="Altura del anaquel requerida";

@XendraField(AD_Column_ID="ShelfHeight",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsSummary@='N' & @ProductType@=I",DisplayLength=11,IsReadOnly=false,SeqNo=0,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b891c263-498c-15df-56d7-b8aa330be7c8")
public static final String FIELDNAME_ExpenseProduct_ShelfHeight="b891c263-498c-15df-56d7-b8aa330be7c8";

@XendraTrl(Identifier="d8d2783c-fbcf-22bf-2008-157187f0a2cd")
public static String es_PE_FIELD_ResourceProduct_ShelfHeight_Name="Altura del Anaquel";

@XendraTrl(Identifier="d8d2783c-fbcf-22bf-2008-157187f0a2cd")
public static String es_PE_FIELD_ResourceProduct_ShelfHeight_Help="La altura del Anaquel indica la dimensión de la altura requerida en un anaquel para un producto";

@XendraTrl(Identifier="d8d2783c-fbcf-22bf-2008-157187f0a2cd")
public static String es_PE_FIELD_ResourceProduct_ShelfHeight_Description="Altura del anaquel requerida";

@XendraField(AD_Column_ID="ShelfHeight",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsSummary@='N' & @ProductType@=I",DisplayLength=11,IsReadOnly=false,SeqNo=0,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d8d2783c-fbcf-22bf-2008-157187f0a2cd")
public static final String FIELDNAME_ResourceProduct_ShelfHeight="d8d2783c-fbcf-22bf-2008-157187f0a2cd";

@XendraTrl(Identifier="88def597-cbd5-5184-d281-a7363535de50")
public static String es_PE_FIELD_ProductDimension_ShelfHeight_Name="Altura del Anaquel";

@XendraTrl(Identifier="88def597-cbd5-5184-d281-a7363535de50")
public static String es_PE_FIELD_ProductDimension_ShelfHeight_Help="La altura del Anaquel indica la dimensión de la altura requerida en un anaquel para un producto";

@XendraTrl(Identifier="88def597-cbd5-5184-d281-a7363535de50")
public static String es_PE_FIELD_ProductDimension_ShelfHeight_Description="Altura del anaquel requerida";

@XendraField(AD_Column_ID="ShelfHeight",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="88def597-cbd5-5184-d281-a7363535de50")
public static final String FIELDNAME_ProductDimension_ShelfHeight="88def597-cbd5-5184-d281-a7363535de50";

@XendraTrl(Identifier="636b1ded-8749-8c09-75e8-5f82686957f9")
public static String es_PE_FIELD_SelectProduct_ShelfHeight_Name="Altura del Anaquel";

@XendraTrl(Identifier="636b1ded-8749-8c09-75e8-5f82686957f9")
public static String es_PE_FIELD_SelectProduct_ShelfHeight_Help="La altura del Anaquel indica la dimensión de la altura requerida en un anaquel para un producto";

@XendraTrl(Identifier="636b1ded-8749-8c09-75e8-5f82686957f9")
public static String es_PE_FIELD_SelectProduct_ShelfHeight_Description="Altura del anaquel requerida";

@XendraField(AD_Column_ID="ShelfHeight",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="636b1ded-8749-8c09-75e8-5f82686957f9")
public static final String FIELDNAME_SelectProduct_ShelfHeight="636b1ded-8749-8c09-75e8-5f82686957f9";

@XendraTrl(Identifier="ac9eec37-8109-be7d-ecdc-26fb79139855")
public static String es_PE_FIELD_Product_ShelfHeight2_Name="Altura del Anaquel";

@XendraTrl(Identifier="ac9eec37-8109-be7d-ecdc-26fb79139855")
public static String es_PE_FIELD_Product_ShelfHeight2_Help="La altura del Anaquel indica la dimensión de la altura requerida en un anaquel para un producto";

@XendraTrl(Identifier="ac9eec37-8109-be7d-ecdc-26fb79139855")
public static String es_PE_FIELD_Product_ShelfHeight2_Description="Altura del anaquel requerida";

@XendraField(AD_Column_ID="ShelfHeight",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N' & @ProductType@=I & @IsStocked@=Y",DisplayLength=11,IsReadOnly=false,
SeqNo=280,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="ac9eec37-8109-be7d-ecdc-26fb79139855")
public static final String FIELDNAME_Product_ShelfHeight2="ac9eec37-8109-be7d-ecdc-26fb79139855";

@XendraTrl(Identifier="d7933b77-900e-b627-8aa8-4b16e9c0a197")
public static String es_PE_COLUMN_ShelfHeight_Name="Altura del Anaquel";

@XendraColumn(AD_Element_ID="b0e883ea-4e2f-cafe-a8ad-582715d9100a",ColumnName="ShelfHeight",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d7933b77-900e-b627-8aa8-4b16e9c0a197",
Synchronized="2022-04-26 19:23:03.0")
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

@XendraTrl(Identifier="b4f382d0-6415-9b88-e908-7542456731e2")
public static String es_PE_FIELD_Product_ShelfWidth_Name="Ancho del Anaquel";

@XendraTrl(Identifier="b4f382d0-6415-9b88-e908-7542456731e2")
public static String es_PE_FIELD_Product_ShelfWidth_Help="El ancho del Anaquel indica la dimensión del ancho requerido en un anaquel para un producto";

@XendraTrl(Identifier="b4f382d0-6415-9b88-e908-7542456731e2")
public static String es_PE_FIELD_Product_ShelfWidth_Description="Ancho del anaquel requerido";

@XendraField(AD_Column_ID="ShelfWidth",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N' & @ProductType@=I & @IsStocked@=Y",DisplayLength=11,IsReadOnly=false,
SeqNo=270,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b4f382d0-6415-9b88-e908-7542456731e2")
public static final String FIELDNAME_Product_ShelfWidth="b4f382d0-6415-9b88-e908-7542456731e2";

@XendraTrl(Identifier="0887541a-b686-5e45-69a9-7733ae4bfc71")
public static String es_PE_FIELD_AssignedProducts_ShelfWidth_Name="Ancho del Anaquel";

@XendraTrl(Identifier="0887541a-b686-5e45-69a9-7733ae4bfc71")
public static String es_PE_FIELD_AssignedProducts_ShelfWidth_Help="El ancho del Anaquel indica la dimensión del ancho requerido en un anaquel para un producto";

@XendraTrl(Identifier="0887541a-b686-5e45-69a9-7733ae4bfc71")
public static String es_PE_FIELD_AssignedProducts_ShelfWidth_Description="Ancho del anaquel requerido";

@XendraField(AD_Column_ID="ShelfWidth",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0887541a-b686-5e45-69a9-7733ae4bfc71")
public static final String FIELDNAME_AssignedProducts_ShelfWidth="0887541a-b686-5e45-69a9-7733ae4bfc71";

@XendraTrl(Identifier="79400657-e032-edec-d4fc-3105c458e1fe")
public static String es_PE_FIELD_ExpenseProduct_ShelfWidth_Name="Ancho del Anaquel";

@XendraTrl(Identifier="79400657-e032-edec-d4fc-3105c458e1fe")
public static String es_PE_FIELD_ExpenseProduct_ShelfWidth_Help="El ancho del Anaquel indica la dimensión del ancho requerido en un anaquel para un producto";

@XendraTrl(Identifier="79400657-e032-edec-d4fc-3105c458e1fe")
public static String es_PE_FIELD_ExpenseProduct_ShelfWidth_Description="Ancho del anaquel requerido";

@XendraField(AD_Column_ID="ShelfWidth",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsSummary@='N' & @ProductType@=I",DisplayLength=11,IsReadOnly=false,SeqNo=0,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="79400657-e032-edec-d4fc-3105c458e1fe")
public static final String FIELDNAME_ExpenseProduct_ShelfWidth="79400657-e032-edec-d4fc-3105c458e1fe";

@XendraTrl(Identifier="07330995-7424-b2a9-1079-db9068829d1d")
public static String es_PE_FIELD_ResourceProduct_ShelfWidth_Name="Ancho del Anaquel";

@XendraTrl(Identifier="07330995-7424-b2a9-1079-db9068829d1d")
public static String es_PE_FIELD_ResourceProduct_ShelfWidth_Help="El ancho del Anaquel indica la dimensión del ancho requerido en un anaquel para un producto";

@XendraTrl(Identifier="07330995-7424-b2a9-1079-db9068829d1d")
public static String es_PE_FIELD_ResourceProduct_ShelfWidth_Description="Ancho del anaquel requerido";

@XendraField(AD_Column_ID="ShelfWidth",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsSummary@='N' & @ProductType@=I",DisplayLength=11,IsReadOnly=false,SeqNo=0,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="07330995-7424-b2a9-1079-db9068829d1d")
public static final String FIELDNAME_ResourceProduct_ShelfWidth="07330995-7424-b2a9-1079-db9068829d1d";

@XendraTrl(Identifier="9a526f24-057f-d1c9-2660-69b15a0558fd")
public static String es_PE_FIELD_ProductDimension_ShelfWidth_Name="Ancho del Anaquel";

@XendraTrl(Identifier="9a526f24-057f-d1c9-2660-69b15a0558fd")
public static String es_PE_FIELD_ProductDimension_ShelfWidth_Help="El ancho del Anaquel indica la dimensión del ancho requerido en un anaquel para un producto";

@XendraTrl(Identifier="9a526f24-057f-d1c9-2660-69b15a0558fd")
public static String es_PE_FIELD_ProductDimension_ShelfWidth_Description="Ancho del anaquel requerido";

@XendraField(AD_Column_ID="ShelfWidth",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9a526f24-057f-d1c9-2660-69b15a0558fd")
public static final String FIELDNAME_ProductDimension_ShelfWidth="9a526f24-057f-d1c9-2660-69b15a0558fd";

@XendraTrl(Identifier="013328e8-0164-86b8-1359-d9a83c6e2cbc")
public static String es_PE_FIELD_SelectProduct_ShelfWidth_Name="Ancho del Anaquel";

@XendraTrl(Identifier="013328e8-0164-86b8-1359-d9a83c6e2cbc")
public static String es_PE_FIELD_SelectProduct_ShelfWidth_Help="El ancho del Anaquel indica la dimensión del ancho requerido en un anaquel para un producto";

@XendraTrl(Identifier="013328e8-0164-86b8-1359-d9a83c6e2cbc")
public static String es_PE_FIELD_SelectProduct_ShelfWidth_Description="Ancho del anaquel requerido";

@XendraField(AD_Column_ID="ShelfWidth",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="013328e8-0164-86b8-1359-d9a83c6e2cbc")
public static final String FIELDNAME_SelectProduct_ShelfWidth="013328e8-0164-86b8-1359-d9a83c6e2cbc";

@XendraTrl(Identifier="30e93307-2865-88ab-c4c4-7477b93e56da")
public static String es_PE_FIELD_Product_ShelfWidth2_Name="Ancho del Anaquel";

@XendraTrl(Identifier="30e93307-2865-88ab-c4c4-7477b93e56da")
public static String es_PE_FIELD_Product_ShelfWidth2_Help="El ancho del Anaquel indica la dimensión del ancho requerido en un anaquel para un producto";

@XendraTrl(Identifier="30e93307-2865-88ab-c4c4-7477b93e56da")
public static String es_PE_FIELD_Product_ShelfWidth2_Description="Ancho del anaquel requerido";

@XendraField(AD_Column_ID="ShelfWidth",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N' & @ProductType@=I & @IsStocked@=Y",DisplayLength=11,IsReadOnly=false,
SeqNo=270,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="30e93307-2865-88ab-c4c4-7477b93e56da")
public static final String FIELDNAME_Product_ShelfWidth2="30e93307-2865-88ab-c4c4-7477b93e56da";

@XendraTrl(Identifier="ead264e3-490e-2bb5-7062-5f7426ff20c9")
public static String es_PE_COLUMN_ShelfWidth_Name="Ancho del Anaquel";

@XendraColumn(AD_Element_ID="a687e67e-bb81-a520-028a-cefe9b8a8bde",ColumnName="ShelfWidth",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ead264e3-490e-2bb5-7062-5f7426ff20c9",
Synchronized="2022-04-26 19:23:03.0")
/** Column name ShelfWidth */
public static final String COLUMNNAME_ShelfWidth = "ShelfWidth";
/** Set ShortName.
@param ShortName ShortName */
public void setShortName (String ShortName)
{
if (ShortName != null && ShortName.length() > 30)
{
log.warning("Length > 30 - truncated");
ShortName = ShortName.substring(0,29);
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
@XendraTrl(Identifier="0246d048-036c-4117-9d2d-ff828df8b2ce")
public static String es_PE_FIELD_Product_ShortName_Name="Nombre corto";

@XendraField(AD_Column_ID="ShortName",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=30,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2020-11-02 17:52:24.0",
Identifier="0246d048-036c-4117-9d2d-ff828df8b2ce")
public static final String FIELDNAME_Product_ShortName="0246d048-036c-4117-9d2d-ff828df8b2ce";

@XendraTrl(Identifier="d1d73f17-2f30-4bb0-9b9e-bfc2dd40b082")
public static String es_PE_COLUMN_ShortName_Name="ShortName";

@XendraColumn(AD_Element_ID="885ce67a-fc00-4e8b-be05-8d8045283c6c",ColumnName="ShortName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d1d73f17-2f30-4bb0-9b9e-bfc2dd40b082",
Synchronized="2022-04-26 19:23:03.0")
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
@XendraTrl(Identifier="803309e9-82e2-edae-afd1-e097567c6aa4")
public static String es_PE_FIELD_Product_SKU_Name="Codigo Laboratorio";

@XendraTrl(Identifier="803309e9-82e2-edae-afd1-e097567c6aa4")
public static String es_PE_FIELD_Product_SKU_Help="";

@XendraTrl(Identifier="803309e9-82e2-edae-afd1-e097567c6aa4")
public static String es_PE_FIELD_Product_SKU_Description="Codigo proporcionado por el laboratorio, para el control de los productos";

@XendraField(AD_Column_ID="SKU",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="803309e9-82e2-edae-afd1-e097567c6aa4")
public static final String FIELDNAME_Product_SKU="803309e9-82e2-edae-afd1-e097567c6aa4";

@XendraTrl(Identifier="988b84af-8435-e997-4c5b-45244fc59613")
public static String es_PE_FIELD_AssignedProducts_SKU_Name="UM Almacenamiento";

@XendraTrl(Identifier="988b84af-8435-e997-4c5b-45244fc59613")
public static String es_PE_FIELD_AssignedProducts_SKU_Help="El SKU indica la unidad de almacenamiento de inventario definida por el usuario. Puede ser usada por  una simbología adicional de código de barras ó por su propio esquema .";

@XendraTrl(Identifier="988b84af-8435-e997-4c5b-45244fc59613")
public static String es_PE_FIELD_AssignedProducts_SKU_Description="Unidad de Mantenimiento en Inventario";

@XendraField(AD_Column_ID="SKU",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="988b84af-8435-e997-4c5b-45244fc59613")
public static final String FIELDNAME_AssignedProducts_SKU="988b84af-8435-e997-4c5b-45244fc59613";

@XendraTrl(Identifier="fd906495-5adf-0b6b-9b2d-e2f9003762c6")
public static String es_PE_FIELD_ExpenseProduct_SKU_Name="UM Almacenamiento";

@XendraTrl(Identifier="fd906495-5adf-0b6b-9b2d-e2f9003762c6")
public static String es_PE_FIELD_ExpenseProduct_SKU_Help="El SKU indica la unidad de almacenamiento de inventario definida por el usuario. Puede ser usada por  una simbología adicional de código de barras ó por su propio esquema .";

@XendraTrl(Identifier="fd906495-5adf-0b6b-9b2d-e2f9003762c6")
public static String es_PE_FIELD_ExpenseProduct_SKU_Description="Unidad de Mantenimiento en Inventario";

@XendraField(AD_Column_ID="SKU",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fd906495-5adf-0b6b-9b2d-e2f9003762c6")
public static final String FIELDNAME_ExpenseProduct_SKU="fd906495-5adf-0b6b-9b2d-e2f9003762c6";

@XendraTrl(Identifier="42f7b12f-29e5-8115-cdc5-f1fffd5671ee")
public static String es_PE_FIELD_ResourceProduct_SKU_Name="UM Almacenamiento";

@XendraTrl(Identifier="42f7b12f-29e5-8115-cdc5-f1fffd5671ee")
public static String es_PE_FIELD_ResourceProduct_SKU_Help="El SKU indica la unidad de almacenamiento de inventario definida por el usuario. Puede ser usada por  una simbología adicional de código de barras ó por su propio esquema .";

@XendraTrl(Identifier="42f7b12f-29e5-8115-cdc5-f1fffd5671ee")
public static String es_PE_FIELD_ResourceProduct_SKU_Description="Unidad de Mantenimiento en Inventario";

@XendraField(AD_Column_ID="SKU",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="42f7b12f-29e5-8115-cdc5-f1fffd5671ee")
public static final String FIELDNAME_ResourceProduct_SKU="42f7b12f-29e5-8115-cdc5-f1fffd5671ee";

@XendraTrl(Identifier="dd863e02-6097-51c3-89ad-64a26d1dbc03")
public static String es_PE_FIELD_ProductDimension_SKU_Name="UM Almacenamiento";

@XendraTrl(Identifier="dd863e02-6097-51c3-89ad-64a26d1dbc03")
public static String es_PE_FIELD_ProductDimension_SKU_Help="El SKU indica la unidad de almacenamiento de inventario definida por el usuario. Puede ser usada por  una simbología adicional de código de barras ó por su propio esquema .";

@XendraTrl(Identifier="dd863e02-6097-51c3-89ad-64a26d1dbc03")
public static String es_PE_FIELD_ProductDimension_SKU_Description="Unidad de Mantenimiento en Inventario";

@XendraField(AD_Column_ID="SKU",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dd863e02-6097-51c3-89ad-64a26d1dbc03")
public static final String FIELDNAME_ProductDimension_SKU="dd863e02-6097-51c3-89ad-64a26d1dbc03";

@XendraTrl(Identifier="1b1feaf3-1a42-a539-11bc-7e22553c47dc")
public static String es_PE_FIELD_SelectProduct_SKU_Name="UM Almacenamiento";

@XendraTrl(Identifier="1b1feaf3-1a42-a539-11bc-7e22553c47dc")
public static String es_PE_FIELD_SelectProduct_SKU_Help="El SKU indica la unidad de almacenamiento de inventario definida por el usuario. Puede ser usada por  una simbología adicional de código de barras ó por su propio esquema .";

@XendraTrl(Identifier="1b1feaf3-1a42-a539-11bc-7e22553c47dc")
public static String es_PE_FIELD_SelectProduct_SKU_Description="Unidad de Mantenimiento en Inventario";

@XendraField(AD_Column_ID="SKU",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1b1feaf3-1a42-a539-11bc-7e22553c47dc")
public static final String FIELDNAME_SelectProduct_SKU="1b1feaf3-1a42-a539-11bc-7e22553c47dc";

@XendraTrl(Identifier="ed291510-0650-a637-6b31-0c98417467f9")
public static String es_PE_FIELD_Product_SKU2_Name="UM Almacenamiento";

@XendraTrl(Identifier="ed291510-0650-a637-6b31-0c98417467f9")
public static String es_PE_FIELD_Product_SKU2_Help="El SKU indica la unidad de almacenamiento de inventario definida por el usuario. Puede ser usada por  una simbología adicional de código de barras ó por su propio esquema .";

@XendraTrl(Identifier="ed291510-0650-a637-6b31-0c98417467f9")
public static String es_PE_FIELD_Product_SKU2_Description="Unidad de Mantenimiento en Inventario";

@XendraField(AD_Column_ID="SKU",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ed291510-0650-a637-6b31-0c98417467f9")
public static final String FIELDNAME_Product_SKU2="ed291510-0650-a637-6b31-0c98417467f9";

@XendraTrl(Identifier="38780182-f3dd-9c5a-2c3d-4e3125b0a89d")
public static String es_PE_COLUMN_SKU_Name="UM Almacenamiento";

@XendraColumn(AD_Element_ID="f473a6ed-4a3f-b6fd-5b0f-06d49c1e65e2",ColumnName="SKU",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="38780182-f3dd-9c5a-2c3d-4e3125b0a89d",
Synchronized="2022-04-26 19:23:03.0")
/** Column name SKU */
public static final String COLUMNNAME_SKU = "SKU";
/** Set Resource.
@param S_Resource_ID Resource */
public void setS_Resource_ID (int S_Resource_ID)
{
if (S_Resource_ID <= 0) set_ValueNoCheck (COLUMNNAME_S_Resource_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_S_Resource_ID, Integer.valueOf(S_Resource_ID));
}
/** Get Resource.
@return Resource */
public int getS_Resource_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_S_Resource_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3f9e3b4e-e69e-9afb-a30a-ba3c9dc136fd")
public static String es_PE_FIELD_Product_Resource_Name="Recurso";

@XendraTrl(Identifier="3f9e3b4e-e69e-9afb-a30a-ba3c9dc136fd")
public static String es_PE_FIELD_Product_Resource_Description="Recurso";

@XendraField(AD_Column_ID="S_Resource_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ProductType@=R",DisplayLength=14,IsReadOnly=true,SeqNo=380,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="3f9e3b4e-e69e-9afb-a30a-ba3c9dc136fd")
public static final String FIELDNAME_Product_Resource="3f9e3b4e-e69e-9afb-a30a-ba3c9dc136fd";

@XendraTrl(Identifier="195efe4b-4091-ae0e-5e32-9c1dbb46ab06")
public static String es_PE_FIELD_AssignedProducts_Resource_Name="Recurso";

@XendraTrl(Identifier="195efe4b-4091-ae0e-5e32-9c1dbb46ab06")
public static String es_PE_FIELD_AssignedProducts_Resource_Description="Recurso";

@XendraField(AD_Column_ID="S_Resource_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ProductType@=R",DisplayLength=14,IsReadOnly=true,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="195efe4b-4091-ae0e-5e32-9c1dbb46ab06")
public static final String FIELDNAME_AssignedProducts_Resource="195efe4b-4091-ae0e-5e32-9c1dbb46ab06";

@XendraTrl(Identifier="fc4c9142-8faf-ea93-bd57-99d3082d3e4e")
public static String es_PE_FIELD_ExpenseProduct_Resource_Name="Recurso";

@XendraTrl(Identifier="fc4c9142-8faf-ea93-bd57-99d3082d3e4e")
public static String es_PE_FIELD_ExpenseProduct_Resource_Description="Recurso";

@XendraField(AD_Column_ID="S_Resource_ID",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@ProductType@=R",DisplayLength=14,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fc4c9142-8faf-ea93-bd57-99d3082d3e4e")
public static final String FIELDNAME_ExpenseProduct_Resource="fc4c9142-8faf-ea93-bd57-99d3082d3e4e";

@XendraTrl(Identifier="6615e369-f68f-c200-2c3a-ed9f01af62af")
public static String es_PE_FIELD_ResourceProduct_Resource_Name="Recurso";

@XendraTrl(Identifier="6615e369-f68f-c200-2c3a-ed9f01af62af")
public static String es_PE_FIELD_ResourceProduct_Resource_Description="Recurso";

@XendraField(AD_Column_ID="S_Resource_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@ProductType@=R",DisplayLength=14,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6615e369-f68f-c200-2c3a-ed9f01af62af")
public static final String FIELDNAME_ResourceProduct_Resource="6615e369-f68f-c200-2c3a-ed9f01af62af";

@XendraTrl(Identifier="e747b020-1ae8-5106-c60f-d2440e5555b1")
public static String es_PE_FIELD_ProductDimension_Resource_Name="Recurso";

@XendraTrl(Identifier="e747b020-1ae8-5106-c60f-d2440e5555b1")
public static String es_PE_FIELD_ProductDimension_Resource_Description="Recurso";

@XendraField(AD_Column_ID="S_Resource_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e747b020-1ae8-5106-c60f-d2440e5555b1")
public static final String FIELDNAME_ProductDimension_Resource="e747b020-1ae8-5106-c60f-d2440e5555b1";

@XendraTrl(Identifier="a167d290-f850-2229-11d7-a91af803c2d3")
public static String es_PE_FIELD_SelectProduct_Resource_Name="Recurso";

@XendraTrl(Identifier="a167d290-f850-2229-11d7-a91af803c2d3")
public static String es_PE_FIELD_SelectProduct_Resource_Description="Recurso";

@XendraField(AD_Column_ID="S_Resource_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a167d290-f850-2229-11d7-a91af803c2d3")
public static final String FIELDNAME_SelectProduct_Resource="a167d290-f850-2229-11d7-a91af803c2d3";

@XendraTrl(Identifier="fcc80cb4-267d-7916-ff23-ea501737d519")
public static String es_PE_FIELD_Product_Resource2_Name="Recurso";

@XendraTrl(Identifier="fcc80cb4-267d-7916-ff23-ea501737d519")
public static String es_PE_FIELD_Product_Resource2_Description="Recurso";

@XendraField(AD_Column_ID="S_Resource_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@ProductType@=R",DisplayLength=14,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fcc80cb4-267d-7916-ff23-ea501737d519")
public static final String FIELDNAME_Product_Resource2="fcc80cb4-267d-7916-ff23-ea501737d519";

@XendraTrl(Identifier="31237d94-b549-ea5d-5513-b766a7fe1ac6")
public static String es_PE_COLUMN_S_Resource_ID_Name="Recurso";

@XendraColumn(AD_Element_ID="22f30913-1545-c2d4-4092-f033c05219ea",ColumnName="S_Resource_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="31237d94-b549-ea5d-5513-b766a7fe1ac6",
Synchronized="2022-04-26 19:23:03.0")
/** Column name S_Resource_ID */
public static final String COLUMNNAME_S_Resource_ID = "S_Resource_ID";
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

@XendraTrl(Identifier="e26286ed-0dea-6d19-2fae-4346e4405c55")
public static String es_PE_FIELD_Product_UnitsPerPallet_Name="Unidades por Tarima";

@XendraTrl(Identifier="e26286ed-0dea-6d19-2fae-4346e4405c55")
public static String es_PE_FIELD_Product_UnitsPerPallet_Help="Las unidades por tarima indica el número de unidades de este producto que caben en una tarima";

@XendraTrl(Identifier="e26286ed-0dea-6d19-2fae-4346e4405c55")
public static String es_PE_FIELD_Product_UnitsPerPallet_Description="Unidades por Tarima";

@XendraField(AD_Column_ID="UnitsPerPallet",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N' & @ProductType@=I & @IsStocked@=Y",DisplayLength=11,IsReadOnly=false,
SeqNo=300,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="e26286ed-0dea-6d19-2fae-4346e4405c55")
public static final String FIELDNAME_Product_UnitsPerPallet="e26286ed-0dea-6d19-2fae-4346e4405c55";

@XendraTrl(Identifier="9eb5c87f-5b88-be91-d860-c1699563709b")
public static String es_PE_FIELD_AssignedProducts_UnitsPerPallet_Name="Unidades por Tarima";

@XendraTrl(Identifier="9eb5c87f-5b88-be91-d860-c1699563709b")
public static String es_PE_FIELD_AssignedProducts_UnitsPerPallet_Help="Las unidades por tarima indica el número de unidades de este producto que caben en una tarima";

@XendraTrl(Identifier="9eb5c87f-5b88-be91-d860-c1699563709b")
public static String es_PE_FIELD_AssignedProducts_UnitsPerPallet_Description="Unidades por Tarima";

@XendraField(AD_Column_ID="UnitsPerPallet",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9eb5c87f-5b88-be91-d860-c1699563709b")
public static final String FIELDNAME_AssignedProducts_UnitsPerPallet="9eb5c87f-5b88-be91-d860-c1699563709b";

@XendraTrl(Identifier="8e1cb16b-1035-d190-8e70-25a323b444f9")
public static String es_PE_FIELD_ExpenseProduct_UnitsPerPallet_Name="Unidades por Tarima";

@XendraTrl(Identifier="8e1cb16b-1035-d190-8e70-25a323b444f9")
public static String es_PE_FIELD_ExpenseProduct_UnitsPerPallet_Help="Las unidades por tarima indica el número de unidades de este producto que caben en una tarima";

@XendraTrl(Identifier="8e1cb16b-1035-d190-8e70-25a323b444f9")
public static String es_PE_FIELD_ExpenseProduct_UnitsPerPallet_Description="Unidades por Tarima";

@XendraField(AD_Column_ID="UnitsPerPallet",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsSummary@='N' & @ProductType@=I",DisplayLength=11,IsReadOnly=false,SeqNo=0,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="8e1cb16b-1035-d190-8e70-25a323b444f9")
public static final String FIELDNAME_ExpenseProduct_UnitsPerPallet="8e1cb16b-1035-d190-8e70-25a323b444f9";

@XendraTrl(Identifier="c5f7f05c-5e3c-700d-0b7d-86cdd49abeed")
public static String es_PE_FIELD_ResourceProduct_UnitsPerPallet_Name="Unidades por Tarima";

@XendraTrl(Identifier="c5f7f05c-5e3c-700d-0b7d-86cdd49abeed")
public static String es_PE_FIELD_ResourceProduct_UnitsPerPallet_Help="Las unidades por tarima indica el número de unidades de este producto que caben en una tarima";

@XendraTrl(Identifier="c5f7f05c-5e3c-700d-0b7d-86cdd49abeed")
public static String es_PE_FIELD_ResourceProduct_UnitsPerPallet_Description="Unidades por Tarima";

@XendraField(AD_Column_ID="UnitsPerPallet",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsSummary@='N' & @ProductType@=I",DisplayLength=11,IsReadOnly=false,SeqNo=0,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c5f7f05c-5e3c-700d-0b7d-86cdd49abeed")
public static final String FIELDNAME_ResourceProduct_UnitsPerPallet="c5f7f05c-5e3c-700d-0b7d-86cdd49abeed";

@XendraTrl(Identifier="6a90d473-e1de-d1b9-1cb0-d124d4f26ad7")
public static String es_PE_FIELD_ProductDimension_UnitsPerPallet_Name="Unidades por Tarima";

@XendraTrl(Identifier="6a90d473-e1de-d1b9-1cb0-d124d4f26ad7")
public static String es_PE_FIELD_ProductDimension_UnitsPerPallet_Help="Las unidades por tarima indica el número de unidades de este producto que caben en una tarima";

@XendraTrl(Identifier="6a90d473-e1de-d1b9-1cb0-d124d4f26ad7")
public static String es_PE_FIELD_ProductDimension_UnitsPerPallet_Description="Unidades por Tarima";

@XendraField(AD_Column_ID="UnitsPerPallet",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6a90d473-e1de-d1b9-1cb0-d124d4f26ad7")
public static final String FIELDNAME_ProductDimension_UnitsPerPallet="6a90d473-e1de-d1b9-1cb0-d124d4f26ad7";

@XendraTrl(Identifier="4d6f46d3-2b4b-df5f-9ac2-01907044fa3a")
public static String es_PE_FIELD_SelectProduct_UnitsPerPallet_Name="Unidades por Tarima";

@XendraTrl(Identifier="4d6f46d3-2b4b-df5f-9ac2-01907044fa3a")
public static String es_PE_FIELD_SelectProduct_UnitsPerPallet_Help="Las unidades por tarima indica el número de unidades de este producto que caben en una tarima";

@XendraTrl(Identifier="4d6f46d3-2b4b-df5f-9ac2-01907044fa3a")
public static String es_PE_FIELD_SelectProduct_UnitsPerPallet_Description="Unidades por Tarima";

@XendraField(AD_Column_ID="UnitsPerPallet",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4d6f46d3-2b4b-df5f-9ac2-01907044fa3a")
public static final String FIELDNAME_SelectProduct_UnitsPerPallet="4d6f46d3-2b4b-df5f-9ac2-01907044fa3a";

@XendraTrl(Identifier="9f757adf-6555-913e-dedf-133283c2465b")
public static String es_PE_FIELD_Product_UnitsPerPallet2_Name="Unidades por Tarima";

@XendraTrl(Identifier="9f757adf-6555-913e-dedf-133283c2465b")
public static String es_PE_FIELD_Product_UnitsPerPallet2_Help="Las unidades por tarima indica el número de unidades de este producto que caben en una tarima";

@XendraTrl(Identifier="9f757adf-6555-913e-dedf-133283c2465b")
public static String es_PE_FIELD_Product_UnitsPerPallet2_Description="Unidades por Tarima";

@XendraField(AD_Column_ID="UnitsPerPallet",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N' & @ProductType@=I & @IsStocked@=Y",DisplayLength=11,IsReadOnly=false,
SeqNo=300,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="9f757adf-6555-913e-dedf-133283c2465b")
public static final String FIELDNAME_Product_UnitsPerPallet2="9f757adf-6555-913e-dedf-133283c2465b";

@XendraTrl(Identifier="ed340deb-3244-c25f-5539-073f56f2cacb")
public static String es_PE_COLUMN_UnitsPerPallet_Name="Unidades por Tarima";

@XendraColumn(AD_Element_ID="41f9f625-088c-1dfb-3e1f-7dc81a70441a",ColumnName="UnitsPerPallet",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ed340deb-3244-c25f-5539-073f56f2cacb",
Synchronized="2022-04-26 19:23:03.0")
/** Column name UnitsPerPallet */
public static final String COLUMNNAME_UnitsPerPallet = "UnitsPerPallet";
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
@XendraTrl(Identifier="41543b40-a92b-d0f9-fe03-a2e1c10b93a8")
public static String es_PE_FIELD_Product_UPCEAN_Name="UPC/EAN";

@XendraTrl(Identifier="41543b40-a92b-d0f9-fe03-a2e1c10b93a8")
public static String es_PE_FIELD_Product_UPCEAN_Help="Use este campo para introducir el código de barras para el producto en cualquiera de las simbologías del código de barras  (Codabar; Código 25; Código 39; Código 93; Código 128; UPC (A); UPC (E); EAN-13; EAN-8; ITF; ITF-14; ISBN; ISSN; JAN-13; JAN-8; POSTNET y FIM; MSI/Plessey; y Pharmacode)";

@XendraTrl(Identifier="41543b40-a92b-d0f9-fe03-a2e1c10b93a8")
public static String es_PE_FIELD_Product_UPCEAN_Description="Código de Barras (Codigo universal del Producto ó su super conjunto, Número de Articulo europeo)";

@XendraField(AD_Column_ID="UPC",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="41543b40-a92b-d0f9-fe03-a2e1c10b93a8")
public static final String FIELDNAME_Product_UPCEAN="41543b40-a92b-d0f9-fe03-a2e1c10b93a8";

@XendraTrl(Identifier="20e31356-571d-49aa-5f9d-ba6fb62e9f85")
public static String es_PE_FIELD_AssignedProducts_UPCEAN_Name="UPC/EAN";

@XendraTrl(Identifier="20e31356-571d-49aa-5f9d-ba6fb62e9f85")
public static String es_PE_FIELD_AssignedProducts_UPCEAN_Help="Use este campo para introducir el código de barras para el producto en cualquiera de las simbologías del código de barras  (Codabar; Código 25; Código 39; Código 93; Código 128; UPC (A); UPC (E); EAN-13; EAN-8; ITF; ITF-14; ISBN; ISSN; JAN-13; JAN-8; POSTNET y FIM; MSI/Plessey; y Pharmacode)";

@XendraTrl(Identifier="20e31356-571d-49aa-5f9d-ba6fb62e9f85")
public static String es_PE_FIELD_AssignedProducts_UPCEAN_Description="Código de Barras (Codigo universal del Producto ó su super conjunto, Número de Articulo europeo)";

@XendraField(AD_Column_ID="UPC",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="20e31356-571d-49aa-5f9d-ba6fb62e9f85")
public static final String FIELDNAME_AssignedProducts_UPCEAN="20e31356-571d-49aa-5f9d-ba6fb62e9f85";

@XendraTrl(Identifier="8dc58632-9a73-bb48-6881-e48d4ab1dc22")
public static String es_PE_FIELD_ExpenseProduct_UPCEAN_Name="UPC/EAN";

@XendraTrl(Identifier="8dc58632-9a73-bb48-6881-e48d4ab1dc22")
public static String es_PE_FIELD_ExpenseProduct_UPCEAN_Help="Use este campo para introducir el código de barras para el producto en cualquiera de las simbologías del código de barras  (Codabar; Código 25; Código 39; Código 93; Código 128; UPC (A); UPC (E); EAN-13; EAN-8; ITF; ITF-14; ISBN; ISSN; JAN-13; JAN-8; POSTNET y FIM; MSI/Plessey; y Pharmacode)";

@XendraTrl(Identifier="8dc58632-9a73-bb48-6881-e48d4ab1dc22")
public static String es_PE_FIELD_ExpenseProduct_UPCEAN_Description="Código de Barras (Codigo universal del Producto ó su super conjunto, Número de Articulo europeo)";

@XendraField(AD_Column_ID="UPC",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8dc58632-9a73-bb48-6881-e48d4ab1dc22")
public static final String FIELDNAME_ExpenseProduct_UPCEAN="8dc58632-9a73-bb48-6881-e48d4ab1dc22";

@XendraTrl(Identifier="489b75bf-a108-5d1c-d12d-45a696366946")
public static String es_PE_FIELD_ResourceProduct_UPCEAN_Name="UPC/EAN";

@XendraTrl(Identifier="489b75bf-a108-5d1c-d12d-45a696366946")
public static String es_PE_FIELD_ResourceProduct_UPCEAN_Help="Use este campo para introducir el código de barras para el producto en cualquiera de las simbologías del código de barras  (Codabar; Código 25; Código 39; Código 93; Código 128; UPC (A); UPC (E); EAN-13; EAN-8; ITF; ITF-14; ISBN; ISSN; JAN-13; JAN-8; POSTNET y FIM; MSI/Plessey; y Pharmacode)";

@XendraTrl(Identifier="489b75bf-a108-5d1c-d12d-45a696366946")
public static String es_PE_FIELD_ResourceProduct_UPCEAN_Description="Código de Barras (Codigo universal del Producto ó su super conjunto, Número de Articulo europeo)";

@XendraField(AD_Column_ID="UPC",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="489b75bf-a108-5d1c-d12d-45a696366946")
public static final String FIELDNAME_ResourceProduct_UPCEAN="489b75bf-a108-5d1c-d12d-45a696366946";

@XendraTrl(Identifier="7883efe7-c96b-ecc7-1f17-1444805e0e05")
public static String es_PE_FIELD_ProductDimension_UPCEAN_Name="UPC/EAN";

@XendraTrl(Identifier="7883efe7-c96b-ecc7-1f17-1444805e0e05")
public static String es_PE_FIELD_ProductDimension_UPCEAN_Help="Use este campo para introducir el código de barras para el producto en cualquiera de las simbologías del código de barras  (Codabar; Código 25; Código 39; Código 93; Código 128; UPC (A); UPC (E); EAN-13; EAN-8; ITF; ITF-14; ISBN; ISSN; JAN-13; JAN-8; POSTNET y FIM; MSI/Plessey; y Pharmacode)";

@XendraTrl(Identifier="7883efe7-c96b-ecc7-1f17-1444805e0e05")
public static String es_PE_FIELD_ProductDimension_UPCEAN_Description="Código de Barras (Codigo universal del Producto ó su super conjunto, Número de Articulo europeo)";

@XendraField(AD_Column_ID="UPC",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7883efe7-c96b-ecc7-1f17-1444805e0e05")
public static final String FIELDNAME_ProductDimension_UPCEAN="7883efe7-c96b-ecc7-1f17-1444805e0e05";

@XendraTrl(Identifier="ad0bf781-69a8-5f00-5c9e-7fc4d9e5ea46")
public static String es_PE_FIELD_SelectProduct_UPCEAN_Name="UPC/EAN";

@XendraTrl(Identifier="ad0bf781-69a8-5f00-5c9e-7fc4d9e5ea46")
public static String es_PE_FIELD_SelectProduct_UPCEAN_Help="Use este campo para introducir el código de barras para el producto en cualquiera de las simbologías del código de barras  (Codabar; Código 25; Código 39; Código 93; Código 128; UPC (A); UPC (E); EAN-13; EAN-8; ITF; ITF-14; ISBN; ISSN; JAN-13; JAN-8; POSTNET y FIM; MSI/Plessey; y Pharmacode)";

@XendraTrl(Identifier="ad0bf781-69a8-5f00-5c9e-7fc4d9e5ea46")
public static String es_PE_FIELD_SelectProduct_UPCEAN_Description="Código de Barras (Codigo universal del Producto ó su super conjunto, Número de Articulo europeo)";

@XendraField(AD_Column_ID="UPC",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ad0bf781-69a8-5f00-5c9e-7fc4d9e5ea46")
public static final String FIELDNAME_SelectProduct_UPCEAN="ad0bf781-69a8-5f00-5c9e-7fc4d9e5ea46";

@XendraTrl(Identifier="87970555-6e7c-ba4a-639b-018f9ebb1156")
public static String es_PE_FIELD_Product_UPCEAN2_Name="UPC/EAN";

@XendraTrl(Identifier="87970555-6e7c-ba4a-639b-018f9ebb1156")
public static String es_PE_FIELD_Product_UPCEAN2_Help="Use este campo para introducir el código de barras para el producto en cualquiera de las simbologías del código de barras  (Codabar; Código 25; Código 39; Código 93; Código 128; UPC (A); UPC (E); EAN-13; EAN-8; ITF; ITF-14; ISBN; ISSN; JAN-13; JAN-8; POSTNET y FIM; MSI/Plessey; y Pharmacode)";

@XendraTrl(Identifier="87970555-6e7c-ba4a-639b-018f9ebb1156")
public static String es_PE_FIELD_Product_UPCEAN2_Description="Código de Barras (Codigo universal del Producto ó su super conjunto, Número de Articulo europeo)";

@XendraField(AD_Column_ID="UPC",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="87970555-6e7c-ba4a-639b-018f9ebb1156")
public static final String FIELDNAME_Product_UPCEAN2="87970555-6e7c-ba4a-639b-018f9ebb1156";

@XendraTrl(Identifier="3a52ba7d-bddd-6d22-ffaa-12f7581986b1")
public static String es_PE_COLUMN_UPC_Name="UPC/EAN";

@XendraColumn(AD_Element_ID="9e36272a-ec41-b187-d531-cec50070c612",ColumnName="UPC",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3a52ba7d-bddd-6d22-ffaa-12f7581986b1",
Synchronized="2022-04-26 19:23:03.0")
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
@XendraTrl(Identifier="2344fd4f-7ed3-a7cc-a97f-38a895e47ddf")
public static String es_PE_FIELD_Product_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="2344fd4f-7ed3-a7cc-a97f-38a895e47ddf")
public static String es_PE_FIELD_Product_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraTrl(Identifier="2344fd4f-7ed3-a7cc-a97f-38a895e47ddf")
public static String es_PE_FIELD_Product_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2344fd4f-7ed3-a7cc-a97f-38a895e47ddf")
public static final String FIELDNAME_Product_SearchKey="2344fd4f-7ed3-a7cc-a97f-38a895e47ddf";

@XendraTrl(Identifier="5aec92ac-590e-3194-2b76-89cb145f1c59")
public static String es_PE_FIELD_AssignedProducts_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="5aec92ac-590e-3194-2b76-89cb145f1c59")
public static String es_PE_FIELD_AssignedProducts_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraTrl(Identifier="5aec92ac-590e-3194-2b76-89cb145f1c59")
public static String es_PE_FIELD_AssignedProducts_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5aec92ac-590e-3194-2b76-89cb145f1c59")
public static final String FIELDNAME_AssignedProducts_SearchKey="5aec92ac-590e-3194-2b76-89cb145f1c59";

@XendraTrl(Identifier="f99ece2f-e1e6-36b2-a7a0-8934f916b7f2")
public static String es_PE_FIELD_ExpenseProduct_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="f99ece2f-e1e6-36b2-a7a0-8934f916b7f2")
public static String es_PE_FIELD_ExpenseProduct_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraTrl(Identifier="f99ece2f-e1e6-36b2-a7a0-8934f916b7f2")
public static String es_PE_FIELD_ExpenseProduct_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f99ece2f-e1e6-36b2-a7a0-8934f916b7f2")
public static final String FIELDNAME_ExpenseProduct_SearchKey="f99ece2f-e1e6-36b2-a7a0-8934f916b7f2";

@XendraTrl(Identifier="5bb90bfd-b58d-b664-b6f6-2c4009d51805")
public static String es_PE_FIELD_ResourceProduct_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="5bb90bfd-b58d-b664-b6f6-2c4009d51805")
public static String es_PE_FIELD_ResourceProduct_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraTrl(Identifier="5bb90bfd-b58d-b664-b6f6-2c4009d51805")
public static String es_PE_FIELD_ResourceProduct_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5bb90bfd-b58d-b664-b6f6-2c4009d51805")
public static final String FIELDNAME_ResourceProduct_SearchKey="5bb90bfd-b58d-b664-b6f6-2c4009d51805";

@XendraTrl(Identifier="ecff505c-71bc-ead2-07d4-6da3ff0c6bcf")
public static String es_PE_FIELD_ProductDimension_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="ecff505c-71bc-ead2-07d4-6da3ff0c6bcf")
public static String es_PE_FIELD_ProductDimension_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraTrl(Identifier="ecff505c-71bc-ead2-07d4-6da3ff0c6bcf")
public static String es_PE_FIELD_ProductDimension_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ecff505c-71bc-ead2-07d4-6da3ff0c6bcf")
public static final String FIELDNAME_ProductDimension_SearchKey="ecff505c-71bc-ead2-07d4-6da3ff0c6bcf";

@XendraTrl(Identifier="bb54fcbe-d91f-ac36-d0bb-79971a6cf7a8")
public static String es_PE_FIELD_SelectProduct_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="bb54fcbe-d91f-ac36-d0bb-79971a6cf7a8")
public static String es_PE_FIELD_SelectProduct_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraTrl(Identifier="bb54fcbe-d91f-ac36-d0bb-79971a6cf7a8")
public static String es_PE_FIELD_SelectProduct_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bb54fcbe-d91f-ac36-d0bb-79971a6cf7a8")
public static final String FIELDNAME_SelectProduct_SearchKey="bb54fcbe-d91f-ac36-d0bb-79971a6cf7a8";

@XendraTrl(Identifier="9fc509cc-89bf-4100-7a7b-d63eb38e46c6")
public static String es_PE_FIELD_Product_SearchKey2_Name="Clave de Búsqueda";

@XendraTrl(Identifier="9fc509cc-89bf-4100-7a7b-d63eb38e46c6")
public static String es_PE_FIELD_Product_SearchKey2_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraTrl(Identifier="9fc509cc-89bf-4100-7a7b-d63eb38e46c6")
public static String es_PE_FIELD_Product_SearchKey2_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9fc509cc-89bf-4100-7a7b-d63eb38e46c6")
public static final String FIELDNAME_Product_SearchKey2="9fc509cc-89bf-4100-7a7b-d63eb38e46c6";

@XendraTrl(Identifier="8136eec6-1db3-f369-a841-e26d1ce019ae")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,
ReadOnlyLogic="@ProductType@=R | @ProductType@=E | @ProductType@=O",IsIdentifier=false,SeqNo=0,
IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",
IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8136eec6-1db3-f369-a841-e26d1ce019ae",Synchronized="2022-04-26 19:23:03.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
/** Set Version No.
@param VersionNo Version Number */
public void setVersionNo (String VersionNo)
{
if (VersionNo != null && VersionNo.length() > 20)
{
log.warning("Length > 20 - truncated");
VersionNo = VersionNo.substring(0,19);
}
set_Value (COLUMNNAME_VersionNo, VersionNo);
}
/** Get Version No.
@return Version Number */
public String getVersionNo() 
{
String value = (String)get_Value(COLUMNNAME_VersionNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="b8adc1f2-dd50-3f80-a103-d2f22c1c3673")
public static String es_PE_FIELD_Product_VersionNo_Name="No. de Versión";

@XendraTrl(Identifier="b8adc1f2-dd50-3f80-a103-d2f22c1c3673")
public static String es_PE_FIELD_Product_VersionNo_Description="Número de versión";

@XendraField(AD_Column_ID="VersionNo",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b8adc1f2-dd50-3f80-a103-d2f22c1c3673")
public static final String FIELDNAME_Product_VersionNo="b8adc1f2-dd50-3f80-a103-d2f22c1c3673";

@XendraTrl(Identifier="09f19617-4777-45f6-dc11-43b613c002e8")
public static String es_PE_FIELD_AssignedProducts_VersionNo_Name="No. de Versión";

@XendraTrl(Identifier="09f19617-4777-45f6-dc11-43b613c002e8")
public static String es_PE_FIELD_AssignedProducts_VersionNo_Description="Número de versión";

@XendraField(AD_Column_ID="VersionNo",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="09f19617-4777-45f6-dc11-43b613c002e8")
public static final String FIELDNAME_AssignedProducts_VersionNo="09f19617-4777-45f6-dc11-43b613c002e8";

@XendraTrl(Identifier="ea1bf703-3b6b-3c32-955f-d53ca09dedbf")
public static String es_PE_FIELD_ExpenseProduct_VersionNo_Name="No. de Versión";

@XendraTrl(Identifier="ea1bf703-3b6b-3c32-955f-d53ca09dedbf")
public static String es_PE_FIELD_ExpenseProduct_VersionNo_Description="Número de versión";

@XendraField(AD_Column_ID="VersionNo",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ea1bf703-3b6b-3c32-955f-d53ca09dedbf")
public static final String FIELDNAME_ExpenseProduct_VersionNo="ea1bf703-3b6b-3c32-955f-d53ca09dedbf";

@XendraTrl(Identifier="ab05c213-a874-4112-7d41-148a8e4daab3")
public static String es_PE_FIELD_ResourceProduct_VersionNo_Name="No. de Versión";

@XendraTrl(Identifier="ab05c213-a874-4112-7d41-148a8e4daab3")
public static String es_PE_FIELD_ResourceProduct_VersionNo_Description="Número de versión";

@XendraField(AD_Column_ID="VersionNo",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ab05c213-a874-4112-7d41-148a8e4daab3")
public static final String FIELDNAME_ResourceProduct_VersionNo="ab05c213-a874-4112-7d41-148a8e4daab3";

@XendraTrl(Identifier="31a1e377-96e3-d4ee-01cc-836300d129f5")
public static String es_PE_FIELD_ProductDimension_VersionNo_Name="No. de Versión";

@XendraTrl(Identifier="31a1e377-96e3-d4ee-01cc-836300d129f5")
public static String es_PE_FIELD_ProductDimension_VersionNo_Description="Número de versión";

@XendraField(AD_Column_ID="VersionNo",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="31a1e377-96e3-d4ee-01cc-836300d129f5")
public static final String FIELDNAME_ProductDimension_VersionNo="31a1e377-96e3-d4ee-01cc-836300d129f5";

@XendraTrl(Identifier="fc43a9a8-780c-d3b1-46fc-6d80d75ed309")
public static String es_PE_FIELD_SelectProduct_VersionNo_Name="No. de Versión";

@XendraTrl(Identifier="fc43a9a8-780c-d3b1-46fc-6d80d75ed309")
public static String es_PE_FIELD_SelectProduct_VersionNo_Description="Número de versión";

@XendraField(AD_Column_ID="VersionNo",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fc43a9a8-780c-d3b1-46fc-6d80d75ed309")
public static final String FIELDNAME_SelectProduct_VersionNo="fc43a9a8-780c-d3b1-46fc-6d80d75ed309";

@XendraTrl(Identifier="26e1d9df-958a-9faf-30f8-79ebd2e824b9")
public static String es_PE_FIELD_Product_VersionNo2_Name="No. de Versión";

@XendraTrl(Identifier="26e1d9df-958a-9faf-30f8-79ebd2e824b9")
public static String es_PE_FIELD_Product_VersionNo2_Description="Número de versión";

@XendraField(AD_Column_ID="VersionNo",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="26e1d9df-958a-9faf-30f8-79ebd2e824b9")
public static final String FIELDNAME_Product_VersionNo2="26e1d9df-958a-9faf-30f8-79ebd2e824b9";

@XendraTrl(Identifier="e7d2ce56-ba03-644d-7661-1f3b15070ffd")
public static String es_PE_COLUMN_VersionNo_Name="No. de Versión";

@XendraColumn(AD_Element_ID="be2c9d9c-6f4c-295d-d62f-5aaf587fb5a0",ColumnName="VersionNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e7d2ce56-ba03-644d-7661-1f3b15070ffd",
Synchronized="2022-04-26 19:23:03.0")
/** Column name VersionNo */
public static final String COLUMNNAME_VersionNo = "VersionNo";
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

@XendraTrl(Identifier="a6164304-70b6-c7d1-3932-9fe7d78650c3")
public static String es_PE_FIELD_Product_Volume_Name="Volúmen";

@XendraTrl(Identifier="a6164304-70b6-c7d1-3932-9fe7d78650c3")
public static String es_PE_FIELD_Product_Volume_Help="El Volumen indica el volumen del producto en la UM de volúmen del cliente";

@XendraTrl(Identifier="a6164304-70b6-c7d1-3932-9fe7d78650c3")
public static String es_PE_FIELD_Product_Volume_Description="Volúmen del producto";

@XendraField(AD_Column_ID="Volume",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N' & @ProductType@=I",DisplayLength=26,IsReadOnly=false,SeqNo=230,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="a6164304-70b6-c7d1-3932-9fe7d78650c3")
public static final String FIELDNAME_Product_Volume="a6164304-70b6-c7d1-3932-9fe7d78650c3";

@XendraTrl(Identifier="9e0749e0-1341-bf8b-7a18-0acdb9312c69")
public static String es_PE_FIELD_AssignedProducts_Volume_Name="Volúmen";

@XendraTrl(Identifier="9e0749e0-1341-bf8b-7a18-0acdb9312c69")
public static String es_PE_FIELD_AssignedProducts_Volume_Help="El Volumen indica el volumen del producto en la UM de volúmen del cliente";

@XendraTrl(Identifier="9e0749e0-1341-bf8b-7a18-0acdb9312c69")
public static String es_PE_FIELD_AssignedProducts_Volume_Description="Volúmen del producto";

@XendraField(AD_Column_ID="Volume",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9e0749e0-1341-bf8b-7a18-0acdb9312c69")
public static final String FIELDNAME_AssignedProducts_Volume="9e0749e0-1341-bf8b-7a18-0acdb9312c69";

@XendraTrl(Identifier="bfea2571-6190-6e29-edb7-f7cf98a5c343")
public static String es_PE_FIELD_ExpenseProduct_Volume_Name="Volúmen";

@XendraTrl(Identifier="bfea2571-6190-6e29-edb7-f7cf98a5c343")
public static String es_PE_FIELD_ExpenseProduct_Volume_Help="El Volumen indica el volumen del producto en la UM de volúmen del cliente";

@XendraTrl(Identifier="bfea2571-6190-6e29-edb7-f7cf98a5c343")
public static String es_PE_FIELD_ExpenseProduct_Volume_Description="Volúmen del producto";

@XendraField(AD_Column_ID="Volume",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsSummary@='N' & @ProductType@=I",DisplayLength=26,IsReadOnly=false,SeqNo=0,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="bfea2571-6190-6e29-edb7-f7cf98a5c343")
public static final String FIELDNAME_ExpenseProduct_Volume="bfea2571-6190-6e29-edb7-f7cf98a5c343";

@XendraTrl(Identifier="1d2ba731-e6e7-9cc0-1c49-b3c23ac0454b")
public static String es_PE_FIELD_ResourceProduct_Volume_Name="Volúmen";

@XendraTrl(Identifier="1d2ba731-e6e7-9cc0-1c49-b3c23ac0454b")
public static String es_PE_FIELD_ResourceProduct_Volume_Help="El Volumen indica el volumen del producto en la UM de volúmen del cliente";

@XendraTrl(Identifier="1d2ba731-e6e7-9cc0-1c49-b3c23ac0454b")
public static String es_PE_FIELD_ResourceProduct_Volume_Description="Volúmen del producto";

@XendraField(AD_Column_ID="Volume",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsSummary@='N' & @ProductType@=I",DisplayLength=26,IsReadOnly=false,SeqNo=0,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="1d2ba731-e6e7-9cc0-1c49-b3c23ac0454b")
public static final String FIELDNAME_ResourceProduct_Volume="1d2ba731-e6e7-9cc0-1c49-b3c23ac0454b";

@XendraTrl(Identifier="2fc1ef90-ab40-90ab-5e35-2dc0e1403ae0")
public static String es_PE_FIELD_ProductDimension_Volume_Name="Volúmen";

@XendraTrl(Identifier="2fc1ef90-ab40-90ab-5e35-2dc0e1403ae0")
public static String es_PE_FIELD_ProductDimension_Volume_Help="El Volumen indica el volumen del producto en la UM de volúmen del cliente";

@XendraTrl(Identifier="2fc1ef90-ab40-90ab-5e35-2dc0e1403ae0")
public static String es_PE_FIELD_ProductDimension_Volume_Description="Volúmen del producto";

@XendraField(AD_Column_ID="Volume",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2fc1ef90-ab40-90ab-5e35-2dc0e1403ae0")
public static final String FIELDNAME_ProductDimension_Volume="2fc1ef90-ab40-90ab-5e35-2dc0e1403ae0";

@XendraTrl(Identifier="e5bf1657-3cc8-df89-03af-e6834bf3a7fe")
public static String es_PE_FIELD_SelectProduct_Volume_Name="Volúmen";

@XendraTrl(Identifier="e5bf1657-3cc8-df89-03af-e6834bf3a7fe")
public static String es_PE_FIELD_SelectProduct_Volume_Help="El Volumen indica el volumen del producto en la UM de volúmen del cliente";

@XendraTrl(Identifier="e5bf1657-3cc8-df89-03af-e6834bf3a7fe")
public static String es_PE_FIELD_SelectProduct_Volume_Description="Volúmen del producto";

@XendraField(AD_Column_ID="Volume",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e5bf1657-3cc8-df89-03af-e6834bf3a7fe")
public static final String FIELDNAME_SelectProduct_Volume="e5bf1657-3cc8-df89-03af-e6834bf3a7fe";

@XendraTrl(Identifier="6c2cd584-5ce2-23ce-5e03-e58787961644")
public static String es_PE_FIELD_Product_Volume2_Name="Volúmen";

@XendraTrl(Identifier="6c2cd584-5ce2-23ce-5e03-e58787961644")
public static String es_PE_FIELD_Product_Volume2_Help="El Volumen indica el volumen del producto en la UM de volúmen del cliente";

@XendraTrl(Identifier="6c2cd584-5ce2-23ce-5e03-e58787961644")
public static String es_PE_FIELD_Product_Volume2_Description="Volúmen del producto";

@XendraField(AD_Column_ID="Volume",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N' & @ProductType@=I",DisplayLength=26,IsReadOnly=false,SeqNo=220,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="6c2cd584-5ce2-23ce-5e03-e58787961644")
public static final String FIELDNAME_Product_Volume2="6c2cd584-5ce2-23ce-5e03-e58787961644";

@XendraTrl(Identifier="1f05009e-6d76-93d2-2881-3a6bc6cb73af")
public static String es_PE_COLUMN_Volume_Name="Volúmen";

@XendraColumn(AD_Element_ID="464c5f3e-92af-e641-7d3a-e7e5427af367",ColumnName="Volume",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1f05009e-6d76-93d2-2881-3a6bc6cb73af",
Synchronized="2022-04-26 19:23:03.0")
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

@XendraTrl(Identifier="8da47754-d37b-dd8f-c87e-6e392fecba31")
public static String es_PE_FIELD_Product_Weight_Name="Peso";

@XendraTrl(Identifier="8da47754-d37b-dd8f-c87e-6e392fecba31")
public static String es_PE_FIELD_Product_Weight_Help="El peso indica el peso del producto en la UM de peso del cliente.";

@XendraTrl(Identifier="8da47754-d37b-dd8f-c87e-6e392fecba31")
public static String es_PE_FIELD_Product_Weight_Description="Peso del producto";

@XendraField(AD_Column_ID="Weight",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N' & @ProductType@=I",DisplayLength=26,IsReadOnly=false,SeqNo=220,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="8da47754-d37b-dd8f-c87e-6e392fecba31")
public static final String FIELDNAME_Product_Weight="8da47754-d37b-dd8f-c87e-6e392fecba31";

@XendraTrl(Identifier="f63db4cb-16c6-45a7-e868-76ab77e92ab3")
public static String es_PE_FIELD_AssignedProducts_Weight_Name="Peso";

@XendraTrl(Identifier="f63db4cb-16c6-45a7-e868-76ab77e92ab3")
public static String es_PE_FIELD_AssignedProducts_Weight_Help="El peso indica el peso del producto en la UM de peso del cliente.";

@XendraTrl(Identifier="f63db4cb-16c6-45a7-e868-76ab77e92ab3")
public static String es_PE_FIELD_AssignedProducts_Weight_Description="Peso del producto";

@XendraField(AD_Column_ID="Weight",IsCentrallyMaintained=true,
AD_Tab_ID="0259cb0c-f204-3a56-705d-b9cdd730f9d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f63db4cb-16c6-45a7-e868-76ab77e92ab3")
public static final String FIELDNAME_AssignedProducts_Weight="f63db4cb-16c6-45a7-e868-76ab77e92ab3";

@XendraTrl(Identifier="1b0c5722-dcd8-a236-2260-5ab85ac1e9e2")
public static String es_PE_FIELD_ExpenseProduct_Weight_Name="Peso";

@XendraTrl(Identifier="1b0c5722-dcd8-a236-2260-5ab85ac1e9e2")
public static String es_PE_FIELD_ExpenseProduct_Weight_Help="El peso indica el peso del producto en la UM de peso del cliente.";

@XendraTrl(Identifier="1b0c5722-dcd8-a236-2260-5ab85ac1e9e2")
public static String es_PE_FIELD_ExpenseProduct_Weight_Description="Peso del producto";

@XendraField(AD_Column_ID="Weight",IsCentrallyMaintained=true,
AD_Tab_ID="df1d44fb-fbe7-d3a7-b2a6-7eb0a2846973",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsSummary@='N' & @ProductType@=I",DisplayLength=26,IsReadOnly=false,SeqNo=0,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="1b0c5722-dcd8-a236-2260-5ab85ac1e9e2")
public static final String FIELDNAME_ExpenseProduct_Weight="1b0c5722-dcd8-a236-2260-5ab85ac1e9e2";

@XendraTrl(Identifier="8d610da3-dfb3-4078-c51c-f33a1b9cffd5")
public static String es_PE_FIELD_ResourceProduct_Weight_Name="Peso";

@XendraTrl(Identifier="8d610da3-dfb3-4078-c51c-f33a1b9cffd5")
public static String es_PE_FIELD_ResourceProduct_Weight_Help="El peso indica el peso del producto en la UM de peso del cliente.";

@XendraTrl(Identifier="8d610da3-dfb3-4078-c51c-f33a1b9cffd5")
public static String es_PE_FIELD_ResourceProduct_Weight_Description="Peso del producto";

@XendraField(AD_Column_ID="Weight",IsCentrallyMaintained=true,
AD_Tab_ID="fc913b56-1737-810e-a21d-efaa2bde7153",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsSummary@='N' & @ProductType@=I",DisplayLength=26,IsReadOnly=false,SeqNo=0,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="8d610da3-dfb3-4078-c51c-f33a1b9cffd5")
public static final String FIELDNAME_ResourceProduct_Weight="8d610da3-dfb3-4078-c51c-f33a1b9cffd5";

@XendraTrl(Identifier="7bae8acf-f77c-ff1f-3870-a2532804ff85")
public static String es_PE_FIELD_ProductDimension_Weight_Name="Peso";

@XendraTrl(Identifier="7bae8acf-f77c-ff1f-3870-a2532804ff85")
public static String es_PE_FIELD_ProductDimension_Weight_Help="El peso indica el peso del producto en la UM de peso del cliente.";

@XendraTrl(Identifier="7bae8acf-f77c-ff1f-3870-a2532804ff85")
public static String es_PE_FIELD_ProductDimension_Weight_Description="Peso del producto";

@XendraField(AD_Column_ID="Weight",IsCentrallyMaintained=true,
AD_Tab_ID="3613957f-d0c4-6b93-13a2-0fb23284d808",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7bae8acf-f77c-ff1f-3870-a2532804ff85")
public static final String FIELDNAME_ProductDimension_Weight="7bae8acf-f77c-ff1f-3870-a2532804ff85";

@XendraTrl(Identifier="979c17ed-2e56-0a18-0999-49c50f613ac5")
public static String es_PE_FIELD_SelectProduct_Weight_Name="Peso";

@XendraTrl(Identifier="979c17ed-2e56-0a18-0999-49c50f613ac5")
public static String es_PE_FIELD_SelectProduct_Weight_Help="El peso indica el peso del producto en la UM de peso del cliente.";

@XendraTrl(Identifier="979c17ed-2e56-0a18-0999-49c50f613ac5")
public static String es_PE_FIELD_SelectProduct_Weight_Description="Peso del producto";

@XendraField(AD_Column_ID="Weight",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfdf14-fd43-88d6-16f0-6764a52e3edd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="979c17ed-2e56-0a18-0999-49c50f613ac5")
public static final String FIELDNAME_SelectProduct_Weight="979c17ed-2e56-0a18-0999-49c50f613ac5";

@XendraTrl(Identifier="a2aad97f-9ee1-a4ec-5e42-2912b8ff5a6b")
public static String es_PE_FIELD_Product_Weight2_Name="Peso";

@XendraTrl(Identifier="a2aad97f-9ee1-a4ec-5e42-2912b8ff5a6b")
public static String es_PE_FIELD_Product_Weight2_Help="El peso indica el peso del producto en la UM de peso del cliente.";

@XendraTrl(Identifier="a2aad97f-9ee1-a4ec-5e42-2912b8ff5a6b")
public static String es_PE_FIELD_Product_Weight2_Description="Peso del producto";

@XendraField(AD_Column_ID="Weight",IsCentrallyMaintained=true,
AD_Tab_ID="4b12a806-caeb-ad25-c955-727c0c0e3e63",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N' & @ProductType@=I",DisplayLength=26,IsReadOnly=false,SeqNo=210,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="a2aad97f-9ee1-a4ec-5e42-2912b8ff5a6b")
public static final String FIELDNAME_Product_Weight2="a2aad97f-9ee1-a4ec-5e42-2912b8ff5a6b";

@XendraTrl(Identifier="969963cc-5561-dd1c-e8ec-80b6410e10e0")
public static String es_PE_COLUMN_Weight_Name="Peso";

@XendraColumn(AD_Element_ID="712867f4-95e8-b3a8-b07b-f884a12efbb4",ColumnName="Weight",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="969963cc-5561-dd1c-e8ec-80b6410e10e0",
Synchronized="2022-04-26 19:23:03.0")
/** Column name Weight */
public static final String COLUMNNAME_Weight = "Weight";
/** Set WithholdingType.
@param WithholdingType WithholdingType */
public void setWithholdingType (String WithholdingType)
{
if (WithholdingType != null && WithholdingType.length() > 1)
{
log.warning("Length > 1 - truncated");
WithholdingType = WithholdingType.substring(0,0);
}
set_Value (COLUMNNAME_WithholdingType, WithholdingType);
}
/** Get WithholdingType.
@return WithholdingType */
public String getWithholdingType() 
{
return (String)get_Value(COLUMNNAME_WithholdingType);
}

@XendraTrl(Identifier="cc617f37-a9f7-4470-913e-e5d0329b0f77")
public static String es_PE_FIELD_Product_WithholdingType_Name="withholdingtype";

@XendraField(AD_Column_ID="WithholdingType",IsCentrallyMaintained=true,
AD_Tab_ID="cda82352-4ccb-b0c6-7307-2c5795eb49f6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2020-11-02 17:52:25.0",
Identifier="cc617f37-a9f7-4470-913e-e5d0329b0f77")
public static final String FIELDNAME_Product_WithholdingType="cc617f37-a9f7-4470-913e-e5d0329b0f77";

@XendraTrl(Identifier="9652fd50-9378-4124-9a7a-0dec894c3ef2")
public static String es_PE_COLUMN_WithholdingType_Name="WithholdingType";

@XendraColumn(AD_Element_ID="7d4f1c66-fc7b-4c9e-ac9e-5fd1796bf7f9",ColumnName="WithholdingType",
AD_Reference_ID=17,AD_Reference_Value_ID="843810e4-0376-4299-bd8c-1fc15022d579",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9652fd50-9378-4124-9a7a-0dec894c3ef2",Synchronized="2022-04-26 19:23:03.0")
/** Column name WithholdingType */
public static final String COLUMNNAME_WithholdingType = "WithholdingType";
}
