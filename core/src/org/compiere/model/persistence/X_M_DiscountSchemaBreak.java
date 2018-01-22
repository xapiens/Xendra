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
/** Generated Model for M_DiscountSchemaBreak
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_DiscountSchemaBreak extends PO
{
/** Standard Constructor
@param ctx context
@param M_DiscountSchemaBreak_ID id
@param trxName transaction
*/
public X_M_DiscountSchemaBreak (Properties ctx, int M_DiscountSchemaBreak_ID, String trxName)
{
super (ctx, M_DiscountSchemaBreak_ID, trxName);
/** if (M_DiscountSchemaBreak_ID == 0)
{
setBreakDiscount (Env.ZERO);
setBreakValue (Env.ZERO);
setIsBPartnerFlatDiscount (false);	
// N
setM_DiscountSchemaBreak_ID (0);
setM_DiscountSchema_ID (0);
setSeqNo (0);	
// @SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM M_DiscountSchemaBreak WHERE M_DiscountSchema_ID=@M_DiscountSchema_ID@
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_DiscountSchemaBreak (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=476 */
public static int Table_ID=MTable.getTable_ID("M_DiscountSchemaBreak");

@XendraTrl(Identifier="d6f824df-ae9a-6a1e-79c8-0c6b236cc82c")
public static String es_PE_TAB_DiscountBreak_Description="Descuentos basados en pasos";

@XendraTrl(Identifier="d6f824df-ae9a-6a1e-79c8-0c6b236cc82c")
public static String es_PE_TAB_DiscountBreak_Name="Descuentos Cortes";

@XendraTab(Name="Discount Break",Description="Trade discount based on breaks (steps)",Help="",
AD_Window_ID="f760f302-5874-a7c5-f148-3bb74844ea1d",SeqNo=30,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="d6f824df-ae9a-6a1e-79c8-0c6b236cc82c",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_DiscountBreak="d6f824df-ae9a-6a1e-79c8-0c6b236cc82c";

@XendraTrl(Identifier="25e38255-a145-ca9a-8abf-eeff87ba9476")
public static String es_PE_TABLE_M_DiscountSchemaBreak_Name="Corte del esquema de descuento";


@XendraTable(Name="Discount Schema Break",Description="Trade Discount Break",Help="",
TableName="M_DiscountSchemaBreak",AccessLevel="3",
AD_Window_ID="f760f302-5874-a7c5-f148-3bb74844ea1d",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.material",Identifier="25e38255-a145-ca9a-8abf-eeff87ba9476",
Synchronized="2017-08-16 11:43:09.0")
/** TableName=M_DiscountSchemaBreak */
public static final String Table_Name="M_DiscountSchemaBreak";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_DiscountSchemaBreak");

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
    Table_ID = MTable.getTable_ID("M_DiscountSchemaBreak");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_DiscountSchemaBreak[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Break Discount %.
@param BreakDiscount Trade Discount in Percent for the break level */
public void setBreakDiscount (BigDecimal BreakDiscount)
{
if (BreakDiscount == null) throw new IllegalArgumentException ("BreakDiscount is mandatory.");
set_Value (COLUMNNAME_BreakDiscount, BreakDiscount);
}
/** Get Break Discount %.
@return Trade Discount in Percent for the break level */
public BigDecimal getBreakDiscount() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_BreakDiscount);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="af46948c-c301-c7c4-3d23-ea694f06e8f1")
public static String es_PE_FIELD_DiscountBreak_BreakDiscount_Description="Descuento Comercial en porcentaje para el nivel de corte";

@XendraTrl(Identifier="af46948c-c301-c7c4-3d23-ea694f06e8f1")
public static String es_PE_FIELD_DiscountBreak_BreakDiscount_Help="Descuento Comercial en Porcentaje para el nivel de corte";

@XendraTrl(Identifier="af46948c-c301-c7c4-3d23-ea694f06e8f1")
public static String es_PE_FIELD_DiscountBreak_BreakDiscount_Name="% de Descuento para Corte";

@XendraField(AD_Column_ID="BreakDiscount",IsCentrallyMaintained=true,
AD_Tab_ID="d6f824df-ae9a-6a1e-79c8-0c6b236cc82c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DiscountType@=B & @IsBPartnerFlatDiscount@=N",DisplayLength=26,IsReadOnly=false,
SeqNo=100,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="af46948c-c301-c7c4-3d23-ea694f06e8f1")
public static final String FIELDNAME_DiscountBreak_BreakDiscount="af46948c-c301-c7c4-3d23-ea694f06e8f1";

@XendraTrl(Identifier="3809e6a2-c8cc-c621-29b5-af36687d8c37")
public static String es_PE_COLUMN_BreakDiscount_Name="% de Descuento para Corte";

@XendraColumn(AD_Element_ID="c22e251c-6831-b70b-218e-dab36ab04a22",ColumnName="BreakDiscount",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="-100",ValueMax="100",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3809e6a2-c8cc-c621-29b5-af36687d8c37",
Synchronized="2017-08-05 16:55:04.0")
/** Column name BreakDiscount */
public static final String COLUMNNAME_BreakDiscount = "BreakDiscount";
/** Set Break Value.
@param BreakValue Low Value of trade discount break level */
public void setBreakValue (BigDecimal BreakValue)
{
if (BreakValue == null) throw new IllegalArgumentException ("BreakValue is mandatory.");
set_Value (COLUMNNAME_BreakValue, BreakValue);
}
/** Get Break Value.
@return Low Value of trade discount break level */
public BigDecimal getBreakValue() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_BreakValue);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="d0b0cdb4-8f71-4444-f52e-82fb79c6d15f")
public static String es_PE_FIELD_DiscountBreak_BreakValue_Description="Valor mínimo para el valor de corte del descuento";

@XendraTrl(Identifier="d0b0cdb4-8f71-4444-f52e-82fb79c6d15f")
public static String es_PE_FIELD_DiscountBreak_BreakValue_Name="Valor de corte";

@XendraField(AD_Column_ID="BreakValue",IsCentrallyMaintained=true,
AD_Tab_ID="d6f824df-ae9a-6a1e-79c8-0c6b236cc82c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DiscountType@=B",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d0b0cdb4-8f71-4444-f52e-82fb79c6d15f")
public static final String FIELDNAME_DiscountBreak_BreakValue="d0b0cdb4-8f71-4444-f52e-82fb79c6d15f";

@XendraTrl(Identifier="353dea8a-4924-3926-b410-72754de0f760")
public static String es_PE_COLUMN_BreakValue_Name="Valor de corte";

@XendraColumn(AD_Element_ID="c7060020-4c95-96db-bfcf-ac4f63cab833",ColumnName="BreakValue",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="353dea8a-4924-3926-b410-72754de0f760",
Synchronized="2017-08-05 16:55:04.0")
/** Column name BreakValue */
public static final String COLUMNNAME_BreakValue = "BreakValue";
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
@XendraTrl(Identifier="900e9031-d087-4c06-94d3-fd18b23a3e70")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="900e9031-d087-4c06-94d3-fd18b23a3e70",
Synchronized="2017-08-05 16:55:04.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set B.Partner Flat Discount.
@param IsBPartnerFlatDiscount Use flat discount defined on Business Partner Level */
public void setIsBPartnerFlatDiscount (boolean IsBPartnerFlatDiscount)
{
set_Value (COLUMNNAME_IsBPartnerFlatDiscount, Boolean.valueOf(IsBPartnerFlatDiscount));
}
/** Get B.Partner Flat Discount.
@return Use flat discount defined on Business Partner Level */
public boolean isBPartnerFlatDiscount() 
{
Object oo = get_Value(COLUMNNAME_IsBPartnerFlatDiscount);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="4e84825a-2527-01a0-510c-d7704ef0192e")
public static String es_PE_FIELD_DiscountBreak_BPartnerFlatDiscount_Description="Usa el % de descuento simple definido en nivel de socio del negocio";

@XendraTrl(Identifier="4e84825a-2527-01a0-510c-d7704ef0192e")
public static String es_PE_FIELD_DiscountBreak_BPartnerFlatDiscount_Help="Para el cálculo del descuento, utilice el descuento definido en nivel del socio de negocio";

@XendraTrl(Identifier="4e84825a-2527-01a0-510c-d7704ef0192e")
public static String es_PE_FIELD_DiscountBreak_BPartnerFlatDiscount_Name="Descuento para Socio del Negocio";

@XendraField(AD_Column_ID="IsBPartnerFlatDiscount",IsCentrallyMaintained=true,
AD_Tab_ID="d6f824df-ae9a-6a1e-79c8-0c6b236cc82c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DiscountType@=B",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4e84825a-2527-01a0-510c-d7704ef0192e")
public static final String FIELDNAME_DiscountBreak_BPartnerFlatDiscount="4e84825a-2527-01a0-510c-d7704ef0192e";

@XendraTrl(Identifier="63eb9fda-66c2-7110-73b7-8dfb1670bb91")
public static String es_PE_COLUMN_IsBPartnerFlatDiscount_Name="Descuento para Socio del Negocio";

@XendraColumn(AD_Element_ID="c37dda3c-726d-fb42-cfbb-ebd8613120a6",
ColumnName="IsBPartnerFlatDiscount",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="63eb9fda-66c2-7110-73b7-8dfb1670bb91",Synchronized="2017-08-05 16:55:05.0")
/** Column name IsBPartnerFlatDiscount */
public static final String COLUMNNAME_IsBPartnerFlatDiscount = "IsBPartnerFlatDiscount";
/** Set Discount Schema Break.
@param M_DiscountSchemaBreak_ID Trade Discount Break */
public void setM_DiscountSchemaBreak_ID (int M_DiscountSchemaBreak_ID)
{
if (M_DiscountSchemaBreak_ID < 1) throw new IllegalArgumentException ("M_DiscountSchemaBreak_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_DiscountSchemaBreak_ID, Integer.valueOf(M_DiscountSchemaBreak_ID));
}
/** Get Discount Schema Break.
@return Trade Discount Break */
public int getM_DiscountSchemaBreak_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_DiscountSchemaBreak_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3b131c43-4adf-a178-89f4-ad5982271e13")
public static String es_PE_FIELD_DiscountBreak_DiscountSchemaBreak_Description="Corte del descuento comercial";

@XendraTrl(Identifier="3b131c43-4adf-a178-89f4-ad5982271e13")
public static String es_PE_FIELD_DiscountBreak_DiscountSchemaBreak_Help="Descuento comercial basado en cortes (pasos)";

@XendraTrl(Identifier="3b131c43-4adf-a178-89f4-ad5982271e13")
public static String es_PE_FIELD_DiscountBreak_DiscountSchemaBreak_Name="Corte del esquema de descuento";

@XendraField(AD_Column_ID="M_DiscountSchemaBreak_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d6f824df-ae9a-6a1e-79c8-0c6b236cc82c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@DiscountType@=B",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="3b131c43-4adf-a178-89f4-ad5982271e13")
public static final String FIELDNAME_DiscountBreak_DiscountSchemaBreak="3b131c43-4adf-a178-89f4-ad5982271e13";
/** Column name M_DiscountSchemaBreak_ID */
public static final String COLUMNNAME_M_DiscountSchemaBreak_ID = "M_DiscountSchemaBreak_ID";
/** Set Discount Schema.
@param M_DiscountSchema_ID Schema to calculate the trade discount percentage */
public void setM_DiscountSchema_ID (int M_DiscountSchema_ID)
{
if (M_DiscountSchema_ID < 1) throw new IllegalArgumentException ("M_DiscountSchema_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_DiscountSchema_ID, Integer.valueOf(M_DiscountSchema_ID));
}
/** Get Discount Schema.
@return Schema to calculate the trade discount percentage */
public int getM_DiscountSchema_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_DiscountSchema_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a42255c4-624f-e298-6d9d-accc12a2ab1e")
public static String es_PE_FIELD_DiscountBreak_DiscountSchema_Description="Esquema para calcular el porcentaje de descuento comercial";

@XendraTrl(Identifier="a42255c4-624f-e298-6d9d-accc12a2ab1e")
public static String es_PE_FIELD_DiscountBreak_DiscountSchema_Help="Después del cálculo de precio (estándar); el porcentaje de descuento comercial es calculado y aplicado resultando en el precio final";

@XendraTrl(Identifier="a42255c4-624f-e298-6d9d-accc12a2ab1e")
public static String es_PE_FIELD_DiscountBreak_DiscountSchema_Name="Esq Descuento";

@XendraField(AD_Column_ID="M_DiscountSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d6f824df-ae9a-6a1e-79c8-0c6b236cc82c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DiscountType@=B",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="a42255c4-624f-e298-6d9d-accc12a2ab1e")
public static final String FIELDNAME_DiscountBreak_DiscountSchema="a42255c4-624f-e298-6d9d-accc12a2ab1e";

@XendraTrl(Identifier="bb93ab5e-5a3c-0b91-29b1-624b7eed62ec")
public static String es_PE_COLUMN_M_DiscountSchema_ID_Name="Esq List Precios/Desc";

@XendraColumn(AD_Element_ID="e8a3b5bd-239d-8376-eae6-8e5ebcfbe6fa",
ColumnName="M_DiscountSchema_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="bb93ab5e-5a3c-0b91-29b1-624b7eed62ec",Synchronized="2017-08-05 16:55:05.0")
/** Column name M_DiscountSchema_ID */
public static final String COLUMNNAME_M_DiscountSchema_ID = "M_DiscountSchema_ID";
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

@XendraTrl(Identifier="cfe64e2c-f35b-fff0-24de-068936408440")
public static String es_PE_FIELD_DiscountBreak_ProductCategory_Description="Categoría de la que este producto es parte";

@XendraTrl(Identifier="cfe64e2c-f35b-fff0-24de-068936408440")
public static String es_PE_FIELD_DiscountBreak_ProductCategory_Help="Identifica la categoría a la que pertenece este producto. Las categorías del producto son usadas para el cálculo de precios";

@XendraTrl(Identifier="cfe64e2c-f35b-fff0-24de-068936408440")
public static String es_PE_FIELD_DiscountBreak_ProductCategory_Name="Categoría del Producto";

@XendraField(AD_Column_ID="M_Product_Category_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d6f824df-ae9a-6a1e-79c8-0c6b236cc82c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DiscountType@=B",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="cfe64e2c-f35b-fff0-24de-068936408440")
public static final String FIELDNAME_DiscountBreak_ProductCategory="cfe64e2c-f35b-fff0-24de-068936408440";

@XendraTrl(Identifier="0b9cf912-53be-720b-3187-6c9b78cc329c")
public static String es_PE_COLUMN_M_Product_Category_ID_Name="Categoría del Producto";

@XendraColumn(AD_Element_ID="80d3e0bb-473b-67d4-42d5-1d776006a69c",
ColumnName="M_Product_Category_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0b9cf912-53be-720b-3187-6c9b78cc329c",Synchronized="2017-08-05 16:55:05.0")
/** Column name M_Product_Category_ID */
public static final String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";
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

@XendraTrl(Identifier="27db658a-9403-c6dc-8621-2ad7faf045a9")
public static String es_PE_FIELD_DiscountBreak_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="27db658a-9403-c6dc-8621-2ad7faf045a9")
public static String es_PE_FIELD_DiscountBreak_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="27db658a-9403-c6dc-8621-2ad7faf045a9")
public static String es_PE_FIELD_DiscountBreak_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d6f824df-ae9a-6a1e-79c8-0c6b236cc82c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DiscountType@=B",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="27db658a-9403-c6dc-8621-2ad7faf045a9")
public static final String FIELDNAME_DiscountBreak_Product="27db658a-9403-c6dc-8621-2ad7faf045a9";

@XendraTrl(Identifier="c0a2b1d0-6de0-11fd-1099-936f1a3cda6d")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c0a2b1d0-6de0-11fd-1099-936f1a3cda6d",Synchronized="2017-08-05 16:55:05.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Sequence.
@param SeqNo Method of ordering records: lowest number comes first */
public void setSeqNo (int SeqNo)
{
set_Value (COLUMNNAME_SeqNo, Integer.valueOf(SeqNo));
}
/** Get Sequence.
@return Method of ordering records: lowest number comes first */
public int getSeqNo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SeqNo);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getSeqNo()));
}

@XendraTrl(Identifier="526ca5ad-aa49-60d4-7de1-273129eb531e")
public static String es_PE_FIELD_DiscountBreak_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="526ca5ad-aa49-60d4-7de1-273129eb531e")
public static String es_PE_FIELD_DiscountBreak_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraTrl(Identifier="526ca5ad-aa49-60d4-7de1-273129eb531e")
public static String es_PE_FIELD_DiscountBreak_Sequence_Name="Secuencia";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="d6f824df-ae9a-6a1e-79c8-0c6b236cc82c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DiscountType@=B",DisplayLength=11,IsReadOnly=false,SeqNo=50,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="526ca5ad-aa49-60d4-7de1-273129eb531e")
public static final String FIELDNAME_DiscountBreak_Sequence="526ca5ad-aa49-60d4-7de1-273129eb531e";

@XendraTrl(Identifier="9b4ae758-a55b-6cd3-6a5c-2e5260294a43")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM M_DiscountSchemaBreak WHERE M_DiscountSchema_ID=@M_DiscountSchema_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9b4ae758-a55b-6cd3-6a5c-2e5260294a43",
Synchronized="2017-08-05 16:55:05.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
}
