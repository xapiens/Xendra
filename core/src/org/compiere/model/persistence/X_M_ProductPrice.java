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
/** Generated Model for M_ProductPrice
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_ProductPrice extends PO
{
/** Standard Constructor
@param ctx context
@param M_ProductPrice_ID id
@param trxName transaction
*/
public X_M_ProductPrice (Properties ctx, int M_ProductPrice_ID, String trxName)
{
super (ctx, M_ProductPrice_ID, trxName);
/** if (M_ProductPrice_ID == 0)
{
setM_PriceList_Version_ID (0);
setM_Product_ID (0);
setPriceLimit (Env.ZERO);
setPriceList (Env.ZERO);
setPriceStd (Env.ZERO);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_ProductPrice (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=251 */
public static int Table_ID=MTable.getTable_ID("M_ProductPrice");

@XendraTrl(Identifier="d44ff030-29aa-ac2d-5d38-58701c3cb0c5")
public static String es_PE_TAB_Price_Description="Precio de Recursos";

@XendraTrl(Identifier="d44ff030-29aa-ac2d-5d38-58701c3cb0c5")
public static String es_PE_TAB_Price_Help="La pestaña Precio despliega los precios de lista; estándar; y límite para cada lista de precios que contiene el recurso.";

@XendraTrl(Identifier="d44ff030-29aa-ac2d-5d38-58701c3cb0c5")
public static String es_PE_TAB_Price_Name="Precio";
@XendraTab(Name="Price",
Description="Resource Pricing",
Help="The Pricing Tab displays the List, Standard and Limit prices for each price list a resource is contained in.",
AD_Window_ID="d64fba3f-bbf2-bd5b-1f70-0c9bcedb722a",SeqNo=40,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="b3b6bf6f-b2fe-d106-6a9d-d157554dfb17",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="d44ff030-29aa-ac2d-5d38-58701c3cb0c5",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Price="d44ff030-29aa-ac2d-5d38-58701c3cb0c5";

@XendraTrl(Identifier="81fbd04c-95ef-d2c5-6d09-1d200c8b3b64")
public static String es_PE_TAB_ProductPrice_Description="Mantener Precios de Producto";

@XendraTrl(Identifier="81fbd04c-95ef-d2c5-6d09-1d200c8b3b64")
public static String es_PE_TAB_ProductPrice_Help="La pestaña de Precio del Producto despliega los precios para un producto basado en la lista de precios seleccionada.";

@XendraTrl(Identifier="81fbd04c-95ef-d2c5-6d09-1d200c8b3b64")
public static String es_PE_TAB_ProductPrice_Name="Precio de Producto";

@XendraTab(Name="Product Price",Description="Maintain Product Prices",
Help="The Price List Tab displays the prices for a product based on the selected price list.",
AD_Window_ID="e3c55106-2db1-b535-c578-d544cd183313",SeqNo=30,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="6ec0918c-e1b8-9e47-acff-73f7f0123fb9",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="81fbd04c-95ef-d2c5-6d09-1d200c8b3b64",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ProductPrice="81fbd04c-95ef-d2c5-6d09-1d200c8b3b64";

@XendraTrl(Identifier="66bd48e5-5fa2-35bc-9660-a02975cd99a6")
public static String es_PE_TAB_Price2_Description="Precio de tipo de gasto";

@XendraTrl(Identifier="66bd48e5-5fa2-35bc-9660-a02975cd99a6")
public static String es_PE_TAB_Price2_Help="La pestaña Precio despliega los precios de lista; estándar; y límite para cada lista de precios que contiene el producto.";

@XendraTrl(Identifier="66bd48e5-5fa2-35bc-9660-a02975cd99a6")
public static String es_PE_TAB_Price2_Name="Precio";
@XendraTab(Name="Price",
Description="Expense Type Pricing",
Help="The Pricing Tab displays the List, Standard and Limit prices for each price list a product is contained in.",
AD_Window_ID="e37c684c-2fb9-31f4-b025-d8ef9933998c",SeqNo=30,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="b3b6bf6f-b2fe-d106-6a9d-d157554dfb17",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="66bd48e5-5fa2-35bc-9660-a02975cd99a6",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Price2="66bd48e5-5fa2-35bc-9660-a02975cd99a6";

@XendraTrl(Identifier="ed0e497c-a9ea-b889-628f-c365979d48b3")
public static String es_PE_TAB_Price3_Description="Precio de Productos";

@XendraTrl(Identifier="ed0e497c-a9ea-b889-628f-c365979d48b3")
public static String es_PE_TAB_Price3_Help="La pestaña de precios despliega los precios de lista; estándar; y límite para cada precio de lista que tiene el producto contenido en ella.";

@XendraTrl(Identifier="ed0e497c-a9ea-b889-628f-c365979d48b3")
public static String es_PE_TAB_Price3_Name="Precio";
@XendraTab(Name="Price",
Description="Product Pricing",
Help="The Pricing Tab displays the List, Standard and Limit prices for each price list a product is contained in.",
AD_Window_ID="ce2d4e2c-ba4e-29bf-9f71-66fecdc05f55",SeqNo=30,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="isAccessSOPriceList(M_ProductPrice.M_Pricelist_Version_ID,@#AD_Role_ID@)",
OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="ed0e497c-a9ea-b889-628f-c365979d48b3",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Price3="ed0e497c-a9ea-b889-628f-c365979d48b3";

@XendraTrl(Identifier="27102b3a-762b-d6f3-8609-f712707937ad")
public static String es_PE_TABLE_M_ProductPrice_Name="M_ProductPrice";

@XendraTable(Name="Product Price",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="M_ProductPrice",AccessLevel="3",AD_Window_ID="e3c55106-2db1-b535-c578-d544cd183313",
AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="27102b3a-762b-d6f3-8609-f712707937ad",Synchronized="2020-11-02 20:59:37.0")
/** TableName=M_ProductPrice */
public static final String Table_Name="M_ProductPrice";


@XendraIndex(Name="m_productprice_identifier",Identifier="6ed9fb03-3538-4c2f-8925-b31dd0bf68f8",
Column_Names="identifier",IsUnique="false",TableIdentifier="6ed9fb03-3538-4c2f-8925-b31dd0bf68f8",
Synchronized="2020-11-02 20:59:37.0")
public static final String INDEXNAME_m_productprice_identifier = "6ed9fb03-3538-4c2f-8925-b31dd0bf68f8";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_ProductPrice");

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
    Table_ID = MTable.getTable_ID("M_ProductPrice");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_ProductPrice[").append(get_ID()).append("]");
return sb.toString();
}
/** Set UOM.
@param C_UOM_ID Unit of Measure */
public void setC_UOM_ID (int C_UOM_ID)
{
if (C_UOM_ID <= 0) set_Value (COLUMNNAME_C_UOM_ID, null);
 else 
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

@XendraTrl(Identifier="69d61458-be11-8911-c6ef-aa79778b1321")
public static String es_PE_FIELD_Price_UOM_Name="UM";

@XendraTrl(Identifier="69d61458-be11-8911-c6ef-aa79778b1321")
public static String es_PE_FIELD_Price_UOM_Description="Unidad de Medida";

@XendraTrl(Identifier="69d61458-be11-8911-c6ef-aa79778b1321")
public static String es_PE_FIELD_Price_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraField(AD_Column_ID="C_UOM_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ed0e497c-a9ea-b889-628f-c365979d48b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="69d61458-be11-8911-c6ef-aa79778b1321")
public static final String FIELDNAME_Price_UOM="69d61458-be11-8911-c6ef-aa79778b1321";

@XendraTrl(Identifier="2c88065a-b017-1783-9b4a-757f848b49e8")
public static String es_PE_FIELD_ProductPrice_UOM_Name="UM";

@XendraTrl(Identifier="2c88065a-b017-1783-9b4a-757f848b49e8")
public static String es_PE_FIELD_ProductPrice_UOM_Description="Unidad de Medida";

@XendraTrl(Identifier="2c88065a-b017-1783-9b4a-757f848b49e8")
public static String es_PE_FIELD_ProductPrice_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraField(AD_Column_ID="C_UOM_ID",IsCentrallyMaintained=true,
AD_Tab_ID="81fbd04c-95ef-d2c5-6d09-1d200c8b3b64",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2c88065a-b017-1783-9b4a-757f848b49e8")
public static final String FIELDNAME_ProductPrice_UOM="2c88065a-b017-1783-9b4a-757f848b49e8";

@XendraTrl(Identifier="c2bb7773-ce67-c76b-a42b-58829f6e034e")
public static String es_PE_COLUMN_C_UOM_ID_Name="UOM";

@XendraColumn(AD_Element_ID="d0345019-4fcc-44c8-4fd1-e38e3b4adeed",ColumnName="C_UOM_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="107d46fd-952f-7ad3-6b0d-c74906c7b323",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c2bb7773-ce67-c76b-a42b-58829f6e034e",Synchronized="2020-03-03 21:38:53.0")
/** Column name C_UOM_ID */
public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
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
@XendraTrl(Identifier="7d0892c3-b9c2-4098-9602-ae13cabf7dbd")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7d0892c3-b9c2-4098-9602-ae13cabf7dbd",
Synchronized="2020-03-03 21:38:53.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Price List Version.
@param M_PriceList_Version_ID Identifies a unique instance of a Price List */
public void setM_PriceList_Version_ID (int M_PriceList_Version_ID)
{
if (M_PriceList_Version_ID < 1) throw new IllegalArgumentException ("M_PriceList_Version_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_PriceList_Version_ID, Integer.valueOf(M_PriceList_Version_ID));
}
/** Get Price List Version.
@return Identifies a unique instance of a Price List */
public int getM_PriceList_Version_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_PriceList_Version_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0e85f2e4-d751-2aa6-a9f5-db3e2aa48029")
public static String es_PE_FIELD_Price_PriceListVersion_Name="Versión de Lista de Precios";

@XendraTrl(Identifier="0e85f2e4-d751-2aa6-a9f5-db3e2aa48029")
public static String es_PE_FIELD_Price_PriceListVersion_Description="Identifica una instancia única de una lista de precios";

@XendraTrl(Identifier="0e85f2e4-d751-2aa6-a9f5-db3e2aa48029")
public static String es_PE_FIELD_Price_PriceListVersion_Help="Cada lista de precios puede tener múltiples versiones. El uso más común es indicar las fechas en que es válida una lista de precios.";

@XendraField(AD_Column_ID="M_PriceList_Version_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ed0e497c-a9ea-b889-628f-c365979d48b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0e85f2e4-d751-2aa6-a9f5-db3e2aa48029")
public static final String FIELDNAME_Price_PriceListVersion="0e85f2e4-d751-2aa6-a9f5-db3e2aa48029";

@XendraTrl(Identifier="ed752a99-e98e-9db3-6fd9-04ab234fb88f")
public static String es_PE_FIELD_ProductPrice_PriceListVersion_Name="Versión de Lista de Precios";

@XendraTrl(Identifier="ed752a99-e98e-9db3-6fd9-04ab234fb88f")
public static String es_PE_FIELD_ProductPrice_PriceListVersion_Description="Identifica una instancia única de una lista de precios";

@XendraTrl(Identifier="ed752a99-e98e-9db3-6fd9-04ab234fb88f")
public static String es_PE_FIELD_ProductPrice_PriceListVersion_Help="Cada lista de precios puede tener múltiples versiones. El uso más común es indicar las fechas en que es válida una lista de precios.";

@XendraField(AD_Column_ID="M_PriceList_Version_ID",IsCentrallyMaintained=true,
AD_Tab_ID="81fbd04c-95ef-d2c5-6d09-1d200c8b3b64",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ed752a99-e98e-9db3-6fd9-04ab234fb88f")
public static final String FIELDNAME_ProductPrice_PriceListVersion="ed752a99-e98e-9db3-6fd9-04ab234fb88f";

@XendraTrl(Identifier="506d0fbb-7d68-96eb-9348-d6342def337a")
public static String es_PE_FIELD_Price_PriceListVersion2_Name="Versión de Lista de Precios";

@XendraTrl(Identifier="506d0fbb-7d68-96eb-9348-d6342def337a")
public static String es_PE_FIELD_Price_PriceListVersion2_Description="Identifica una instancia única de una lista de precios";

@XendraTrl(Identifier="506d0fbb-7d68-96eb-9348-d6342def337a")
public static String es_PE_FIELD_Price_PriceListVersion2_Help="Cada lista de precios puede tener múltiples versiones. El uso más común es indicar las fechas en que es válida una lista de precios.";

@XendraField(AD_Column_ID="M_PriceList_Version_ID",IsCentrallyMaintained=true,
AD_Tab_ID="66bd48e5-5fa2-35bc-9660-a02975cd99a6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="506d0fbb-7d68-96eb-9348-d6342def337a")
public static final String FIELDNAME_Price_PriceListVersion2="506d0fbb-7d68-96eb-9348-d6342def337a";

@XendraTrl(Identifier="55645fc0-2da0-c9b8-360f-b00e060de4e7")
public static String es_PE_FIELD_Price_PriceListVersion3_Name="Versión de Lista de Precios";

@XendraTrl(Identifier="55645fc0-2da0-c9b8-360f-b00e060de4e7")
public static String es_PE_FIELD_Price_PriceListVersion3_Description="Identifica una instancia única de una lista de precios";

@XendraTrl(Identifier="55645fc0-2da0-c9b8-360f-b00e060de4e7")
public static String es_PE_FIELD_Price_PriceListVersion3_Help="Cada lista de precios puede tener múltiples versiones. El uso más común es indicar las fechas en que es válida una lista de precios.";

@XendraField(AD_Column_ID="M_PriceList_Version_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d44ff030-29aa-ac2d-5d38-58701c3cb0c5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="55645fc0-2da0-c9b8-360f-b00e060de4e7")
public static final String FIELDNAME_Price_PriceListVersion3="55645fc0-2da0-c9b8-360f-b00e060de4e7";

@XendraTrl(Identifier="6ec0918c-e1b8-9e47-acff-73f7f0123fb9")
public static String es_PE_COLUMN_M_PriceList_Version_ID_Name="Versión de Lista de Precios";

@XendraColumn(AD_Element_ID="6c31f4d5-58fe-0b61-33f1-e2549c3f35f6",
ColumnName="M_PriceList_Version_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6ec0918c-e1b8-9e47-acff-73f7f0123fb9",Synchronized="2020-03-03 21:38:53.0")
/** Column name M_PriceList_Version_ID */
public static final String COLUMNNAME_M_PriceList_Version_ID = "M_PriceList_Version_ID";
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

@XendraTrl(Identifier="8cbd857a-b638-4591-bfdf-a4ad0fc72ccd")
public static String es_PE_FIELD_Price_Product_Name="Producto";

@XendraTrl(Identifier="8cbd857a-b638-4591-bfdf-a4ad0fc72ccd")
public static String es_PE_FIELD_Price_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="8cbd857a-b638-4591-bfdf-a4ad0fc72ccd")
public static String es_PE_FIELD_Price_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ed0e497c-a9ea-b889-628f-c365979d48b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8cbd857a-b638-4591-bfdf-a4ad0fc72ccd")
public static final String FIELDNAME_Price_Product="8cbd857a-b638-4591-bfdf-a4ad0fc72ccd";

@XendraTrl(Identifier="1bbc5786-8ae1-bc74-f645-64e7594ca028")
public static String es_PE_FIELD_ProductPrice_Product_Name="Producto";

@XendraTrl(Identifier="1bbc5786-8ae1-bc74-f645-64e7594ca028")
public static String es_PE_FIELD_ProductPrice_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="1bbc5786-8ae1-bc74-f645-64e7594ca028")
public static String es_PE_FIELD_ProductPrice_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="81fbd04c-95ef-d2c5-6d09-1d200c8b3b64",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1bbc5786-8ae1-bc74-f645-64e7594ca028")
public static final String FIELDNAME_ProductPrice_Product="1bbc5786-8ae1-bc74-f645-64e7594ca028";

@XendraTrl(Identifier="e5d115e3-7241-bc65-00e3-e5e178faf326")
public static String es_PE_FIELD_Price_Product2_Name="Producto";

@XendraTrl(Identifier="e5d115e3-7241-bc65-00e3-e5e178faf326")
public static String es_PE_FIELD_Price_Product2_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="e5d115e3-7241-bc65-00e3-e5e178faf326")
public static String es_PE_FIELD_Price_Product2_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="66bd48e5-5fa2-35bc-9660-a02975cd99a6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e5d115e3-7241-bc65-00e3-e5e178faf326")
public static final String FIELDNAME_Price_Product2="e5d115e3-7241-bc65-00e3-e5e178faf326";

@XendraTrl(Identifier="0fe81255-4d7d-04c4-3b74-b56eb51b8e8f")
public static String es_PE_FIELD_Price_Product3_Name="Producto";

@XendraTrl(Identifier="0fe81255-4d7d-04c4-3b74-b56eb51b8e8f")
public static String es_PE_FIELD_Price_Product3_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="0fe81255-4d7d-04c4-3b74-b56eb51b8e8f")
public static String es_PE_FIELD_Price_Product3_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d44ff030-29aa-ac2d-5d38-58701c3cb0c5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0fe81255-4d7d-04c4-3b74-b56eb51b8e8f")
public static final String FIELDNAME_Price_Product3="0fe81255-4d7d-04c4-3b74-b56eb51b8e8f";

@XendraTrl(Identifier="b3b6bf6f-b2fe-d106-6a9d-d157554dfb17")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b3b6bf6f-b2fe-d106-6a9d-d157554dfb17",Synchronized="2020-03-03 21:38:53.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Limit Price.
@param PriceLimit Lowest price for a product */
public void setPriceLimit (BigDecimal PriceLimit)
{
if (PriceLimit == null) throw new IllegalArgumentException ("PriceLimit is mandatory.");
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

@XendraTrl(Identifier="3595ace2-b8ee-377f-18a8-3e0bdc11f17a")
public static String es_PE_FIELD_Price_LimitPrice_Name="Precio Límite";

@XendraTrl(Identifier="3595ace2-b8ee-377f-18a8-3e0bdc11f17a")
public static String es_PE_FIELD_Price_LimitPrice_Description="Precio más bajo del producto";

@XendraTrl(Identifier="3595ace2-b8ee-377f-18a8-3e0bdc11f17a")
public static String es_PE_FIELD_Price_LimitPrice_Help="El límite de precio indica el precio más bajo para un producto establecido en la moneda de la lista de precio.";

@XendraField(AD_Column_ID="PriceLimit",IsCentrallyMaintained=true,
AD_Tab_ID="ed0e497c-a9ea-b889-628f-c365979d48b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3595ace2-b8ee-377f-18a8-3e0bdc11f17a")
public static final String FIELDNAME_Price_LimitPrice="3595ace2-b8ee-377f-18a8-3e0bdc11f17a";

@XendraTrl(Identifier="6b7896df-5666-029b-cf84-d0a335e9ebfe")
public static String es_PE_FIELD_ProductPrice_LimitPrice_Name="Precio Límite";

@XendraTrl(Identifier="6b7896df-5666-029b-cf84-d0a335e9ebfe")
public static String es_PE_FIELD_ProductPrice_LimitPrice_Description="Precio más bajo del producto";

@XendraTrl(Identifier="6b7896df-5666-029b-cf84-d0a335e9ebfe")
public static String es_PE_FIELD_ProductPrice_LimitPrice_Help="El límite de precio indica el precio más bajo para un producto establecido en la moneda de la lista de precio.";

@XendraField(AD_Column_ID="PriceLimit",IsCentrallyMaintained=true,
AD_Tab_ID="81fbd04c-95ef-d2c5-6d09-1d200c8b3b64",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6b7896df-5666-029b-cf84-d0a335e9ebfe")
public static final String FIELDNAME_ProductPrice_LimitPrice="6b7896df-5666-029b-cf84-d0a335e9ebfe";

@XendraTrl(Identifier="23c5e10b-ad8b-fb03-78ef-c688ecf8ad93")
public static String es_PE_FIELD_Price_LimitPrice2_Name="Precio Límite";

@XendraTrl(Identifier="23c5e10b-ad8b-fb03-78ef-c688ecf8ad93")
public static String es_PE_FIELD_Price_LimitPrice2_Description="Precio más bajo del producto";

@XendraTrl(Identifier="23c5e10b-ad8b-fb03-78ef-c688ecf8ad93")
public static String es_PE_FIELD_Price_LimitPrice2_Help="El límite de precio indica el precio más bajo para un producto establecido en la moneda de la lista de precio.";

@XendraField(AD_Column_ID="PriceLimit",IsCentrallyMaintained=true,
AD_Tab_ID="66bd48e5-5fa2-35bc-9660-a02975cd99a6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="23c5e10b-ad8b-fb03-78ef-c688ecf8ad93")
public static final String FIELDNAME_Price_LimitPrice2="23c5e10b-ad8b-fb03-78ef-c688ecf8ad93";

@XendraTrl(Identifier="a6670fb4-7897-a721-220b-3e5b1dd8b17c")
public static String es_PE_FIELD_Price_LimitPrice3_Name="Precio Límite";

@XendraTrl(Identifier="a6670fb4-7897-a721-220b-3e5b1dd8b17c")
public static String es_PE_FIELD_Price_LimitPrice3_Description="Precio más bajo del producto";

@XendraTrl(Identifier="a6670fb4-7897-a721-220b-3e5b1dd8b17c")
public static String es_PE_FIELD_Price_LimitPrice3_Help="El límite de precio indica el precio más bajo para un producto establecido en la moneda de la lista de precio.";

@XendraField(AD_Column_ID="PriceLimit",IsCentrallyMaintained=true,
AD_Tab_ID="d44ff030-29aa-ac2d-5d38-58701c3cb0c5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a6670fb4-7897-a721-220b-3e5b1dd8b17c")
public static final String FIELDNAME_Price_LimitPrice3="a6670fb4-7897-a721-220b-3e5b1dd8b17c";

@XendraTrl(Identifier="201dbad4-c52f-c91d-a08d-b384c2652b5b")
public static String es_PE_COLUMN_PriceLimit_Name="Precio Límite";

@XendraColumn(AD_Element_ID="0dbee629-4878-ced9-eafa-0f6bdfb99af4",ColumnName="PriceLimit",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="201dbad4-c52f-c91d-a08d-b384c2652b5b",
Synchronized="2020-03-03 21:38:53.0")
/** Column name PriceLimit */
public static final String COLUMNNAME_PriceLimit = "PriceLimit";
/** Set List Price.
@param PriceList List Price */
public void setPriceList (BigDecimal PriceList)
{
if (PriceList == null) throw new IllegalArgumentException ("PriceList is mandatory.");
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

@XendraTrl(Identifier="ebeb775e-c43a-dc12-7da2-49b1d8338008")
public static String es_PE_FIELD_Price_ListPrice_Name="Precio de Lista";

@XendraTrl(Identifier="ebeb775e-c43a-dc12-7da2-49b1d8338008")
public static String es_PE_FIELD_Price_ListPrice_Description="Precio de Lista";

@XendraTrl(Identifier="ebeb775e-c43a-dc12-7da2-49b1d8338008")
public static String es_PE_FIELD_Price_ListPrice_Help="El Precio de lista es el precio de lista oficial en la moneda del documento";

@XendraField(AD_Column_ID="PriceList",IsCentrallyMaintained=true,
AD_Tab_ID="ed0e497c-a9ea-b889-628f-c365979d48b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ebeb775e-c43a-dc12-7da2-49b1d8338008")
public static final String FIELDNAME_Price_ListPrice="ebeb775e-c43a-dc12-7da2-49b1d8338008";

@XendraTrl(Identifier="3a2da8b1-3b68-b398-a86a-2bf8a24078c2")
public static String es_PE_FIELD_ProductPrice_ListPrice_Name="Precio de Lista";

@XendraTrl(Identifier="3a2da8b1-3b68-b398-a86a-2bf8a24078c2")
public static String es_PE_FIELD_ProductPrice_ListPrice_Description="Precio de Lista";

@XendraTrl(Identifier="3a2da8b1-3b68-b398-a86a-2bf8a24078c2")
public static String es_PE_FIELD_ProductPrice_ListPrice_Help="El Precio de lista es el precio de lista oficial en la moneda del documento";

@XendraField(AD_Column_ID="PriceList",IsCentrallyMaintained=true,
AD_Tab_ID="81fbd04c-95ef-d2c5-6d09-1d200c8b3b64",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3a2da8b1-3b68-b398-a86a-2bf8a24078c2")
public static final String FIELDNAME_ProductPrice_ListPrice="3a2da8b1-3b68-b398-a86a-2bf8a24078c2";

@XendraTrl(Identifier="3d604eb2-7f2a-ae76-d20f-1a45ae90a8a4")
public static String es_PE_FIELD_Price_ListPrice2_Name="Precio de Lista";

@XendraTrl(Identifier="3d604eb2-7f2a-ae76-d20f-1a45ae90a8a4")
public static String es_PE_FIELD_Price_ListPrice2_Description="Precio de Lista";

@XendraTrl(Identifier="3d604eb2-7f2a-ae76-d20f-1a45ae90a8a4")
public static String es_PE_FIELD_Price_ListPrice2_Help="El Precio de lista es el precio de lista oficial en la moneda del documento";

@XendraField(AD_Column_ID="PriceList",IsCentrallyMaintained=true,
AD_Tab_ID="66bd48e5-5fa2-35bc-9660-a02975cd99a6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3d604eb2-7f2a-ae76-d20f-1a45ae90a8a4")
public static final String FIELDNAME_Price_ListPrice2="3d604eb2-7f2a-ae76-d20f-1a45ae90a8a4";

@XendraTrl(Identifier="173938a8-88b1-e81d-8415-d8d037951f10")
public static String es_PE_FIELD_Price_ListPrice3_Name="Precio de Lista";

@XendraTrl(Identifier="173938a8-88b1-e81d-8415-d8d037951f10")
public static String es_PE_FIELD_Price_ListPrice3_Description="Precio de Lista";

@XendraTrl(Identifier="173938a8-88b1-e81d-8415-d8d037951f10")
public static String es_PE_FIELD_Price_ListPrice3_Help="El Precio de lista es el precio de lista oficial en la moneda del documento";

@XendraField(AD_Column_ID="PriceList",IsCentrallyMaintained=true,
AD_Tab_ID="d44ff030-29aa-ac2d-5d38-58701c3cb0c5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="173938a8-88b1-e81d-8415-d8d037951f10")
public static final String FIELDNAME_Price_ListPrice3="173938a8-88b1-e81d-8415-d8d037951f10";

@XendraTrl(Identifier="b60fb708-a402-0911-6682-e0f274becb4c")
public static String es_PE_COLUMN_PriceList_Name="Precio de Lista";

@XendraColumn(AD_Element_ID="0f6529f2-0ceb-0583-6c50-c04e6542c99b",ColumnName="PriceList",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b60fb708-a402-0911-6682-e0f274becb4c",
Synchronized="2020-03-03 21:38:53.0")
/** Column name PriceList */
public static final String COLUMNNAME_PriceList = "PriceList";
/** Set Standard Price.
@param PriceStd Standard Price */
public void setPriceStd (BigDecimal PriceStd)
{
if (PriceStd == null) throw new IllegalArgumentException ("PriceStd is mandatory.");
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

@XendraTrl(Identifier="015e5b06-d465-1bb4-f416-da06b8cb0102")
public static String es_PE_FIELD_Price_StandardPrice_Name="Precio Estándar";

@XendraTrl(Identifier="015e5b06-d465-1bb4-f416-da06b8cb0102")
public static String es_PE_FIELD_Price_StandardPrice_Description="Precio Estándar";

@XendraTrl(Identifier="015e5b06-d465-1bb4-f416-da06b8cb0102")
public static String es_PE_FIELD_Price_StandardPrice_Help="El Precio Estándar indica el precio estándar ó normal para un producto en esta lista de precios";

@XendraField(AD_Column_ID="PriceStd",IsCentrallyMaintained=true,
AD_Tab_ID="ed0e497c-a9ea-b889-628f-c365979d48b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="015e5b06-d465-1bb4-f416-da06b8cb0102")
public static final String FIELDNAME_Price_StandardPrice="015e5b06-d465-1bb4-f416-da06b8cb0102";

@XendraTrl(Identifier="55b5207a-4041-7586-643d-40c4665cd7f1")
public static String es_PE_FIELD_ProductPrice_StandardPrice_Name="Precio Estándar";

@XendraTrl(Identifier="55b5207a-4041-7586-643d-40c4665cd7f1")
public static String es_PE_FIELD_ProductPrice_StandardPrice_Description="Precio Estándar";

@XendraTrl(Identifier="55b5207a-4041-7586-643d-40c4665cd7f1")
public static String es_PE_FIELD_ProductPrice_StandardPrice_Help="El Precio Estándar indica el precio estándar ó normal para un producto en esta lista de precios";

@XendraField(AD_Column_ID="PriceStd",IsCentrallyMaintained=true,
AD_Tab_ID="81fbd04c-95ef-d2c5-6d09-1d200c8b3b64",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="55b5207a-4041-7586-643d-40c4665cd7f1")
public static final String FIELDNAME_ProductPrice_StandardPrice="55b5207a-4041-7586-643d-40c4665cd7f1";

@XendraTrl(Identifier="34377198-b753-b0b5-e87c-95222da2ae16")
public static String es_PE_FIELD_Price_StandardPrice2_Name="Precio Estándar";

@XendraTrl(Identifier="34377198-b753-b0b5-e87c-95222da2ae16")
public static String es_PE_FIELD_Price_StandardPrice2_Description="Precio Estándar";

@XendraTrl(Identifier="34377198-b753-b0b5-e87c-95222da2ae16")
public static String es_PE_FIELD_Price_StandardPrice2_Help="El Precio Estándar indica el precio estándar ó normal para un producto en esta lista de precios";

@XendraField(AD_Column_ID="PriceStd",IsCentrallyMaintained=true,
AD_Tab_ID="66bd48e5-5fa2-35bc-9660-a02975cd99a6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="34377198-b753-b0b5-e87c-95222da2ae16")
public static final String FIELDNAME_Price_StandardPrice2="34377198-b753-b0b5-e87c-95222da2ae16";

@XendraTrl(Identifier="d13bb63c-1190-c535-c8ee-c5801aeb4b39")
public static String es_PE_FIELD_Price_StandardPrice3_Name="Precio Estándar";

@XendraTrl(Identifier="d13bb63c-1190-c535-c8ee-c5801aeb4b39")
public static String es_PE_FIELD_Price_StandardPrice3_Description="Precio Estándar";

@XendraTrl(Identifier="d13bb63c-1190-c535-c8ee-c5801aeb4b39")
public static String es_PE_FIELD_Price_StandardPrice3_Help="El Precio Estándar indica el precio estándar ó normal para un producto en esta lista de precios";

@XendraField(AD_Column_ID="PriceStd",IsCentrallyMaintained=true,
AD_Tab_ID="d44ff030-29aa-ac2d-5d38-58701c3cb0c5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d13bb63c-1190-c535-c8ee-c5801aeb4b39")
public static final String FIELDNAME_Price_StandardPrice3="d13bb63c-1190-c535-c8ee-c5801aeb4b39";

@XendraTrl(Identifier="0087326f-3134-122a-26f6-46b44b06ba90")
public static String es_PE_COLUMN_PriceStd_Name="Precio Estándar";

@XendraColumn(AD_Element_ID="cd12259b-a52a-9102-1c72-983d6e1d5324",ColumnName="PriceStd",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0087326f-3134-122a-26f6-46b44b06ba90",
Synchronized="2020-03-03 21:38:53.0")
/** Column name PriceStd */
public static final String COLUMNNAME_PriceStd = "PriceStd";
}
