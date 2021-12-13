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
/** Generated Model for M_DiscountSchema
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_DiscountSchema extends PO
{
/** Standard Constructor
@param ctx context
@param M_DiscountSchema_ID id
@param trxName transaction
*/
public X_M_DiscountSchema (Properties ctx, int M_DiscountSchema_ID, String trxName)
{
super (ctx, M_DiscountSchema_ID, trxName);
/** if (M_DiscountSchema_ID == 0)
{
setDiscountType (null);	
// 'P'
setIsBPartnerFlatDiscount (false);	
// N
setIsQuantityBased (true);	
// Y
setM_DiscountSchema_ID (0);
setName (null);
setValidFrom (new Timestamp(System.currentTimeMillis()));
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_DiscountSchema (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=475 */
public static int Table_ID=MTable.getTable_ID("M_DiscountSchema");

@XendraTrl(Identifier="a0a3132f-3864-1100-2b26-bf06f0bc817d")
public static String es_PE_TAB_DiscountSchema_Description="Esquema de descuentos";

@XendraTrl(Identifier="a0a3132f-3864-1100-2b26-bf06f0bc817d")
public static String es_PE_TAB_DiscountSchema_Help="El esquema de descuento calcula los porcentajes de descuento.";

@XendraTrl(Identifier="a0a3132f-3864-1100-2b26-bf06f0bc817d")
public static String es_PE_TAB_DiscountSchema_Name="Esquema de Descuentos";

@XendraTab(Name="Discount Schema",Description="Trade Discount Schema",
Help="Trade discount schema calculates the trade discount percentage",
AD_Window_ID="f760f302-5874-a7c5-f148-3bb74844ea1d",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="DiscountType<>'P'",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="a0a3132f-3864-1100-2b26-bf06f0bc817d",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_DiscountSchema="a0a3132f-3864-1100-2b26-bf06f0bc817d";

@XendraTrl(Identifier="56d1c142-b10c-c631-c3c3-7fa57f2669b3")
public static String es_PE_TAB_PriceListSchema_Description="Esquema de Lista de Precios";

@XendraTrl(Identifier="56d1c142-b10c-c631-c3c3-7fa57f2669b3")
public static String es_PE_TAB_PriceListSchema_Help="El esquema de lista de precios define las reglas de cálculo para la lista de precios";

@XendraTrl(Identifier="56d1c142-b10c-c631-c3c3-7fa57f2669b3")
public static String es_PE_TAB_PriceListSchema_Name="Esquema de Lista de Precios";

@XendraTab(Name="Price List Schema",Description="Price List Schema",
Help="Price List schema defines calculation rules for price lists",
AD_Window_ID="0c3a375c-192b-bfce-6181-3cb6aea1c8f1",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="DiscountType='P'",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="56d1c142-b10c-c631-c3c3-7fa57f2669b3",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_PriceListSchema="56d1c142-b10c-c631-c3c3-7fa57f2669b3";

@XendraTrl(Identifier="6805921e-90b8-5233-f961-88c0a0bec29e")
public static String es_PE_TABLE_M_DiscountSchema_Name="Esq List Precios/Desc";

@XendraTable(Name="Discount Schema",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="Schema to calculate the trade discount percentage",Help="",
TableName="M_DiscountSchema",AccessLevel="3",AD_Window_ID="f760f302-5874-a7c5-f148-3bb74844ea1d",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=60,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="6805921e-90b8-5233-f961-88c0a0bec29e",Synchronized="2020-03-03 21:38:20.0")
/** TableName=M_DiscountSchema */
public static final String Table_Name="M_DiscountSchema";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_DiscountSchema");

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
    Table_ID = MTable.getTable_ID("M_DiscountSchema");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_DiscountSchema[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Accumulation Level.
@param CumulativeLevel Level for accumulative calculations */
public void setCumulativeLevel (String CumulativeLevel)
{
if (CumulativeLevel != null && CumulativeLevel.length() > 1)
{
log.warning("Length > 1 - truncated");
CumulativeLevel = CumulativeLevel.substring(0,0);
}
set_Value (COLUMNNAME_CumulativeLevel, CumulativeLevel);
}
/** Get Accumulation Level.
@return Level for accumulative calculations */
public String getCumulativeLevel() 
{
return (String)get_Value(COLUMNNAME_CumulativeLevel);
}

@XendraTrl(Identifier="4b128c59-014b-e8e7-b86e-e56a5183f1a7")
public static String es_PE_FIELD_DiscountSchema_AccumulationLevel_Name="Nivel para Acumular";

@XendraTrl(Identifier="4b128c59-014b-e8e7-b86e-e56a5183f1a7")
public static String es_PE_FIELD_DiscountSchema_AccumulationLevel_Description="Nivel para cálculos acumulados";

@XendraField(AD_Column_ID="CumulativeLevel",IsCentrallyMaintained=true,
AD_Tab_ID="a0a3132f-3864-1100-2b26-bf06f0bc817d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DiscountType@=B",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4b128c59-014b-e8e7-b86e-e56a5183f1a7")
public static final String FIELDNAME_DiscountSchema_AccumulationLevel="4b128c59-014b-e8e7-b86e-e56a5183f1a7";

@XendraTrl(Identifier="d6b23121-e0ae-10b0-24de-129e2749d4db")
public static String es_PE_FIELD_PriceListSchema_AccumulationLevel_Name="Nivel para Acumular";

@XendraTrl(Identifier="d6b23121-e0ae-10b0-24de-129e2749d4db")
public static String es_PE_FIELD_PriceListSchema_AccumulationLevel_Description="Nivel para cálculos acumulados";

@XendraField(AD_Column_ID="CumulativeLevel",IsCentrallyMaintained=true,
AD_Tab_ID="56d1c142-b10c-c631-c3c3-7fa57f2669b3",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@DiscountType@=B",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d6b23121-e0ae-10b0-24de-129e2749d4db")
public static final String FIELDNAME_PriceListSchema_AccumulationLevel="d6b23121-e0ae-10b0-24de-129e2749d4db";

@XendraTrl(Identifier="5eb50612-6bfa-a55e-e6e7-201061bbb7d8")
public static String es_PE_COLUMN_CumulativeLevel_Name="Nivel para Acumular";

@XendraColumn(AD_Element_ID="43e8b67d-bf1d-a75e-acdd-f72fd18d4da0",ColumnName="CumulativeLevel",
AD_Reference_ID=17,AD_Reference_Value_ID="a4bb6a27-1410-0575-cb12-a9c47c47c9b4",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="L",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5eb50612-6bfa-a55e-e6e7-201061bbb7d8",Synchronized="2019-08-30 22:23:02.0")
/** Column name CumulativeLevel */
public static final String COLUMNNAME_CumulativeLevel = "CumulativeLevel";
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

@XendraTrl(Identifier="c556cb8a-b437-52e2-1002-5b87292f76c3")
public static String es_PE_FIELD_DiscountSchema_Description_Name="Observación";

@XendraTrl(Identifier="c556cb8a-b437-52e2-1002-5b87292f76c3")
public static String es_PE_FIELD_DiscountSchema_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="c556cb8a-b437-52e2-1002-5b87292f76c3")
public static String es_PE_FIELD_DiscountSchema_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="a0a3132f-3864-1100-2b26-bf06f0bc817d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c556cb8a-b437-52e2-1002-5b87292f76c3")
public static final String FIELDNAME_DiscountSchema_Description="c556cb8a-b437-52e2-1002-5b87292f76c3";

@XendraTrl(Identifier="791a7a24-fa5e-5323-1ce8-b0225081018f")
public static String es_PE_FIELD_PriceListSchema_Description_Name="Observación";

@XendraTrl(Identifier="791a7a24-fa5e-5323-1ce8-b0225081018f")
public static String es_PE_FIELD_PriceListSchema_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="791a7a24-fa5e-5323-1ce8-b0225081018f")
public static String es_PE_FIELD_PriceListSchema_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="56d1c142-b10c-c631-c3c3-7fa57f2669b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="791a7a24-fa5e-5323-1ce8-b0225081018f")
public static final String FIELDNAME_PriceListSchema_Description="791a7a24-fa5e-5323-1ce8-b0225081018f";

@XendraTrl(Identifier="cce0468f-c5cd-ecd6-e860-e278d25a1d6c")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cce0468f-c5cd-ecd6-e860-e278d25a1d6c",
Synchronized="2019-08-30 22:23:02.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Discount Type.
@param DiscountType Type of trade discount calculation */
public void setDiscountType (String DiscountType)
{
if (DiscountType.length() > 1)
{
log.warning("Length > 1 - truncated");
DiscountType = DiscountType.substring(0,0);
}
set_Value (COLUMNNAME_DiscountType, DiscountType);
}
/** Get Discount Type.
@return Type of trade discount calculation */
public String getDiscountType() 
{
return (String)get_Value(COLUMNNAME_DiscountType);
}

@XendraTrl(Identifier="e4363ecc-6116-0e98-e9dd-6b7469b47a25")
public static String es_PE_FIELD_DiscountSchema_DiscountType_Name="Tipo de Descuento";

@XendraTrl(Identifier="e4363ecc-6116-0e98-e9dd-6b7469b47a25")
public static String es_PE_FIELD_DiscountSchema_DiscountType_Description="Tipo de cálculo del descuento comercial";

@XendraTrl(Identifier="e4363ecc-6116-0e98-e9dd-6b7469b47a25")
public static String es_PE_FIELD_DiscountSchema_DiscountType_Help="Tipo de procedimiento a ser usado para calcular el porcentaje de descuento comercial";

@XendraField(AD_Column_ID="DiscountType",IsCentrallyMaintained=true,
AD_Tab_ID="a0a3132f-3864-1100-2b26-bf06f0bc817d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e4363ecc-6116-0e98-e9dd-6b7469b47a25")
public static final String FIELDNAME_DiscountSchema_DiscountType="e4363ecc-6116-0e98-e9dd-6b7469b47a25";

@XendraTrl(Identifier="d5a01151-ca99-8bd0-e987-5c8941a65e57")
public static String es_PE_FIELD_PriceListSchema_DiscountType_Name="Tipo de Descuento";

@XendraTrl(Identifier="d5a01151-ca99-8bd0-e987-5c8941a65e57")
public static String es_PE_FIELD_PriceListSchema_DiscountType_Description="Tipo de cálculo del descuento comercial";

@XendraTrl(Identifier="d5a01151-ca99-8bd0-e987-5c8941a65e57")
public static String es_PE_FIELD_PriceListSchema_DiscountType_Help="Tipo de procedimiento a ser usado para calcular el porcentaje de descuento comercial";

@XendraField(AD_Column_ID="DiscountType",IsCentrallyMaintained=true,
AD_Tab_ID="56d1c142-b10c-c631-c3c3-7fa57f2669b3",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d5a01151-ca99-8bd0-e987-5c8941a65e57")
public static final String FIELDNAME_PriceListSchema_DiscountType="d5a01151-ca99-8bd0-e987-5c8941a65e57";

@XendraTrl(Identifier="9fccbda6-b96e-3534-d894-a8e763915534")
public static String es_PE_COLUMN_DiscountType_Name="Tipo de Descuento";

@XendraColumn(AD_Element_ID="8dd70774-c2ab-434b-0bee-8c4720bb85ac",ColumnName="DiscountType",
AD_Reference_ID=17,AD_Reference_Value_ID="97cc096c-622b-8db5-457c-304917053941",
AD_Val_Rule_ID="680587ad-efd5-128f-f095-b87e78ae0b00",FieldLength=1,DefaultValue="'P'",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9fccbda6-b96e-3534-d894-a8e763915534",
Synchronized="2019-08-30 22:23:02.0")
/** Column name DiscountType */
public static final String COLUMNNAME_DiscountType = "DiscountType";
/** Set Flat Discount %.
@param FlatDiscount Flat discount percentage  */
public void setFlatDiscount (BigDecimal FlatDiscount)
{
set_Value (COLUMNNAME_FlatDiscount, FlatDiscount);
}
/** Get Flat Discount %.
@return Flat discount percentage  */
public BigDecimal getFlatDiscount() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FlatDiscount);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="f2866540-b49c-ed4f-b4ef-4542c0965639")
public static String es_PE_FIELD_DiscountSchema_FlatDiscount_Name="% Descuento";

@XendraTrl(Identifier="f2866540-b49c-ed4f-b4ef-4542c0965639")
public static String es_PE_FIELD_DiscountSchema_FlatDiscount_Description="Porcentaje de descuento simple";

@XendraField(AD_Column_ID="FlatDiscount",IsCentrallyMaintained=true,
AD_Tab_ID="a0a3132f-3864-1100-2b26-bf06f0bc817d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DiscountType@=F & @IsBPartnerFlatDiscount@=N",DisplayLength=26,IsReadOnly=false,
SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f2866540-b49c-ed4f-b4ef-4542c0965639")
public static final String FIELDNAME_DiscountSchema_FlatDiscount="f2866540-b49c-ed4f-b4ef-4542c0965639";

@XendraTrl(Identifier="f8d4a72a-8d45-2e50-51e2-cce342cf6107")
public static String es_PE_FIELD_PriceListSchema_FlatDiscount_Name="% Descuento";

@XendraTrl(Identifier="f8d4a72a-8d45-2e50-51e2-cce342cf6107")
public static String es_PE_FIELD_PriceListSchema_FlatDiscount_Description="Porcentaje de descuento simple";

@XendraField(AD_Column_ID="FlatDiscount",IsCentrallyMaintained=true,
AD_Tab_ID="56d1c142-b10c-c631-c3c3-7fa57f2669b3",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@DiscountType@=F",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f8d4a72a-8d45-2e50-51e2-cce342cf6107")
public static final String FIELDNAME_PriceListSchema_FlatDiscount="f8d4a72a-8d45-2e50-51e2-cce342cf6107";

@XendraTrl(Identifier="5dab321e-e3ed-ed62-4e17-de37128bd9ff")
public static String es_PE_COLUMN_FlatDiscount_Name="% Descuento";

@XendraColumn(AD_Element_ID="f91c7c28-3c01-1814-fd31-274a18628563",ColumnName="FlatDiscount",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="-100",ValueMax="100",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5dab321e-e3ed-ed62-4e17-de37128bd9ff",
Synchronized="2019-08-30 22:23:02.0")
/** Column name FlatDiscount */
public static final String COLUMNNAME_FlatDiscount = "FlatDiscount";
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
@XendraTrl(Identifier="93b0a9c2-71c1-42ca-a371-b5d200f9d063")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="93b0a9c2-71c1-42ca-a371-b5d200f9d063",
Synchronized="2019-08-30 22:23:02.0")
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

@XendraTrl(Identifier="7dbbd049-3bb2-f95c-1082-49fed6751b13")
public static String es_PE_FIELD_DiscountSchema_BPartnerFlatDiscount_Name="Descuento para Socio del Negocio";

@XendraTrl(Identifier="7dbbd049-3bb2-f95c-1082-49fed6751b13")
public static String es_PE_FIELD_DiscountSchema_BPartnerFlatDiscount_Description="Usa el % de descuento simple definido en nivel de socio del negocio";

@XendraTrl(Identifier="7dbbd049-3bb2-f95c-1082-49fed6751b13")
public static String es_PE_FIELD_DiscountSchema_BPartnerFlatDiscount_Help="Para el cálculo del descuento, utilice el descuento definido en nivel del socio de negocio";

@XendraField(AD_Column_ID="IsBPartnerFlatDiscount",IsCentrallyMaintained=true,
AD_Tab_ID="a0a3132f-3864-1100-2b26-bf06f0bc817d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DiscountType@=F",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="7dbbd049-3bb2-f95c-1082-49fed6751b13")
public static final String FIELDNAME_DiscountSchema_BPartnerFlatDiscount="7dbbd049-3bb2-f95c-1082-49fed6751b13";

@XendraTrl(Identifier="28759226-0275-9a1b-a00a-3937d7b0ce75")
public static String es_PE_FIELD_PriceListSchema_BPartnerFlatDiscount_Name="Descuento para Socio del Negocio";

@XendraTrl(Identifier="28759226-0275-9a1b-a00a-3937d7b0ce75")
public static String es_PE_FIELD_PriceListSchema_BPartnerFlatDiscount_Description="Usa el % de descuento simple definido en nivel de socio del negocio";

@XendraTrl(Identifier="28759226-0275-9a1b-a00a-3937d7b0ce75")
public static String es_PE_FIELD_PriceListSchema_BPartnerFlatDiscount_Help="Para el cálculo del descuento, utilice el descuento definido en nivel del socio de negocio";

@XendraField(AD_Column_ID="IsBPartnerFlatDiscount",IsCentrallyMaintained=true,
AD_Tab_ID="56d1c142-b10c-c631-c3c3-7fa57f2669b3",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="28759226-0275-9a1b-a00a-3937d7b0ce75")
public static final String FIELDNAME_PriceListSchema_BPartnerFlatDiscount="28759226-0275-9a1b-a00a-3937d7b0ce75";

@XendraTrl(Identifier="01202010-fad0-3c17-a3d5-0260f57ed0d0")
public static String es_PE_COLUMN_IsBPartnerFlatDiscount_Name="Descuento para Socio del Negocio";

@XendraColumn(AD_Element_ID="c37dda3c-726d-fb42-cfbb-ebd8613120a6",
ColumnName="IsBPartnerFlatDiscount",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="01202010-fad0-3c17-a3d5-0260f57ed0d0",Synchronized="2019-08-30 22:23:02.0")
/** Column name IsBPartnerFlatDiscount */
public static final String COLUMNNAME_IsBPartnerFlatDiscount = "IsBPartnerFlatDiscount";
/** Set Quantity based.
@param IsQuantityBased Trade discount break level based on Quantity (not value) */
public void setIsQuantityBased (boolean IsQuantityBased)
{
set_Value (COLUMNNAME_IsQuantityBased, Boolean.valueOf(IsQuantityBased));
}
/** Get Quantity based.
@return Trade discount break level based on Quantity (not value) */
public boolean isQuantityBased() 
{
Object oo = get_Value(COLUMNNAME_IsQuantityBased);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="627d16a0-8f93-f7ef-cfd3-6604a69eb3d5")
public static String es_PE_FIELD_DiscountSchema_QuantityBased_Name="Cantidad Base";

@XendraTrl(Identifier="627d16a0-8f93-f7ef-cfd3-6604a69eb3d5")
public static String es_PE_FIELD_DiscountSchema_QuantityBased_Description="Nivel de corte del descuento comercial en cantidad (No en valor)";

@XendraTrl(Identifier="627d16a0-8f93-f7ef-cfd3-6604a69eb3d5")
public static String es_PE_FIELD_DiscountSchema_QuantityBased_Help="El cálculo del nivel de descuento comercial se basa en la cantidad de la orden y no en valor de la orden";

@XendraField(AD_Column_ID="IsQuantityBased",IsCentrallyMaintained=true,
AD_Tab_ID="a0a3132f-3864-1100-2b26-bf06f0bc817d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DiscountType@=B",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="627d16a0-8f93-f7ef-cfd3-6604a69eb3d5")
public static final String FIELDNAME_DiscountSchema_QuantityBased="627d16a0-8f93-f7ef-cfd3-6604a69eb3d5";

@XendraTrl(Identifier="223c9acf-0538-ddbf-2ab7-be0d2c56c255")
public static String es_PE_FIELD_PriceListSchema_QuantityBased_Name="Cantidad Base";

@XendraTrl(Identifier="223c9acf-0538-ddbf-2ab7-be0d2c56c255")
public static String es_PE_FIELD_PriceListSchema_QuantityBased_Description="Nivel de corte del descuento comercial en cantidad (No en valor)";

@XendraTrl(Identifier="223c9acf-0538-ddbf-2ab7-be0d2c56c255")
public static String es_PE_FIELD_PriceListSchema_QuantityBased_Help="El cálculo del nivel de descuento comercial se basa en la cantidad de la orden y no en valor de la orden";

@XendraField(AD_Column_ID="IsQuantityBased",IsCentrallyMaintained=true,
AD_Tab_ID="56d1c142-b10c-c631-c3c3-7fa57f2669b3",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@DiscountType@=B",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="223c9acf-0538-ddbf-2ab7-be0d2c56c255")
public static final String FIELDNAME_PriceListSchema_QuantityBased="223c9acf-0538-ddbf-2ab7-be0d2c56c255";

@XendraTrl(Identifier="5a5cfe32-a7ac-29d4-8dd1-48cdea120cd7")
public static String es_PE_COLUMN_IsQuantityBased_Name="Cantidad Base";

@XendraColumn(AD_Element_ID="e5a02afd-adea-c124-8552-6131fcf23917",ColumnName="IsQuantityBased",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5a5cfe32-a7ac-29d4-8dd1-48cdea120cd7",
Synchronized="2019-08-30 22:23:02.0")
/** Column name IsQuantityBased */
public static final String COLUMNNAME_IsQuantityBased = "IsQuantityBased";
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

@XendraTrl(Identifier="4aeea14d-c57b-d6a4-8527-71ee2a13ec89")
public static String es_PE_FIELD_DiscountSchema_DiscountSchema_Name="Esq List Precios/Desc";

@XendraTrl(Identifier="4aeea14d-c57b-d6a4-8527-71ee2a13ec89")
public static String es_PE_FIELD_DiscountSchema_DiscountSchema_Description="Esquema para calcular el porcentaje de descuento comercial";

@XendraTrl(Identifier="4aeea14d-c57b-d6a4-8527-71ee2a13ec89")
public static String es_PE_FIELD_DiscountSchema_DiscountSchema_Help="Después del cálculo de precio (estándar); el porcentaje de descuento comercial es calculado y aplicado resultando en el precio final";

@XendraField(AD_Column_ID="M_DiscountSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a0a3132f-3864-1100-2b26-bf06f0bc817d",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4aeea14d-c57b-d6a4-8527-71ee2a13ec89")
public static final String FIELDNAME_DiscountSchema_DiscountSchema="4aeea14d-c57b-d6a4-8527-71ee2a13ec89";

@XendraTrl(Identifier="131dce56-4f43-9ced-a02e-93d18d4affab")
public static String es_PE_FIELD_PriceListSchema_PriceListSchema_Name="Esq List Precios/Desc";

@XendraTrl(Identifier="131dce56-4f43-9ced-a02e-93d18d4affab")
public static String es_PE_FIELD_PriceListSchema_PriceListSchema_Description="Esquema para calcular el porcentaje de descuento comercial";

@XendraTrl(Identifier="131dce56-4f43-9ced-a02e-93d18d4affab")
public static String es_PE_FIELD_PriceListSchema_PriceListSchema_Help="Después del cálculo de precio (estándar); el porcentaje de descuento comercial es calculado y aplicado resultando en el precio final";

@XendraField(AD_Column_ID="M_DiscountSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="56d1c142-b10c-c631-c3c3-7fa57f2669b3",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="131dce56-4f43-9ced-a02e-93d18d4affab")
public static final String FIELDNAME_PriceListSchema_PriceListSchema="131dce56-4f43-9ced-a02e-93d18d4affab";
/** Column name M_DiscountSchema_ID */
public static final String COLUMNNAME_M_DiscountSchema_ID = "M_DiscountSchema_ID";
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

@XendraTrl(Identifier="53fb6926-4517-1117-0333-a642796aeafc")
public static String es_PE_FIELD_DiscountSchema_Name_Name="Nombre";

@XendraTrl(Identifier="53fb6926-4517-1117-0333-a642796aeafc")
public static String es_PE_FIELD_DiscountSchema_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="53fb6926-4517-1117-0333-a642796aeafc")
public static String es_PE_FIELD_DiscountSchema_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="a0a3132f-3864-1100-2b26-bf06f0bc817d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="53fb6926-4517-1117-0333-a642796aeafc")
public static final String FIELDNAME_DiscountSchema_Name="53fb6926-4517-1117-0333-a642796aeafc";

@XendraTrl(Identifier="3e67a014-00a7-c8c7-ca7c-28870629f241")
public static String es_PE_FIELD_PriceListSchema_Name_Name="Nombre";

@XendraTrl(Identifier="3e67a014-00a7-c8c7-ca7c-28870629f241")
public static String es_PE_FIELD_PriceListSchema_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="3e67a014-00a7-c8c7-ca7c-28870629f241")
public static String es_PE_FIELD_PriceListSchema_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="56d1c142-b10c-c631-c3c3-7fa57f2669b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3e67a014-00a7-c8c7-ca7c-28870629f241")
public static final String FIELDNAME_PriceListSchema_Name="3e67a014-00a7-c8c7-ca7c-28870629f241";

@XendraTrl(Identifier="6306f97b-40c0-2c4f-7b0a-2d88737485f9")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6306f97b-40c0-2c4f-7b0a-2d88737485f9",
Synchronized="2019-08-30 22:23:02.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
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

@XendraTrl(Identifier="990bd5ab-1013-4693-2975-92e3f1bfc863")
public static String es_PE_FIELD_DiscountSchema_ProcessNow_Name="Renumerar";

@XendraTrl(Identifier="990bd5ab-1013-4693-2975-92e3f1bfc863")
public static String es_PE_FIELD_DiscountSchema_ProcessNow_Description="Renumerar entradas de descuentos";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="a0a3132f-3864-1100-2b26-bf06f0bc817d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DiscountType@=B",DisplayLength=23,IsReadOnly=false,SeqNo=120,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="990bd5ab-1013-4693-2975-92e3f1bfc863")
public static final String FIELDNAME_DiscountSchema_ProcessNow="990bd5ab-1013-4693-2975-92e3f1bfc863";

@XendraTrl(Identifier="4f4c58df-3eea-3817-5c67-e6f69f5804a6")
public static String es_PE_FIELD_PriceListSchema_ProcessNow_Name="Renumerar";

@XendraTrl(Identifier="4f4c58df-3eea-3817-5c67-e6f69f5804a6")
public static String es_PE_FIELD_PriceListSchema_ProcessNow_Description="Renumerar entradas de descuentos";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="56d1c142-b10c-c631-c3c3-7fa57f2669b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4f4c58df-3eea-3817-5c67-e6f69f5804a6")
public static final String FIELDNAME_PriceListSchema_ProcessNow="4f4c58df-3eea-3817-5c67-e6f69f5804a6";

@XendraTrl(Identifier="95735ced-16ac-52de-1897-5ba63242240c")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="fd235ac1-048f-2b71-0caf-20b46701e013",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="95735ced-16ac-52de-1897-5ba63242240c",Synchronized="2019-08-30 22:23:02.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Script.
@param Script Dynamic Java Language Script to calculate result */
public void setScript (String Script)
{
set_Value (COLUMNNAME_Script, Script);
}
/** Get Script.
@return Dynamic Java Language Script to calculate result */
public String getScript() 
{
String value = (String)get_Value(COLUMNNAME_Script);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="5612a492-7324-a9a5-19d6-a786f78b5882")
public static String es_PE_FIELD_DiscountSchema_Script_Name="Escritura";

@XendraTrl(Identifier="5612a492-7324-a9a5-19d6-a786f78b5882")
public static String es_PE_FIELD_DiscountSchema_Script_Description="Escritura de lenguaje Java para calcular resultados";

@XendraTrl(Identifier="5612a492-7324-a9a5-19d6-a786f78b5882")
public static String es_PE_FIELD_DiscountSchema_Script_Help="Usar constructores del lenguaje Java para definir el resultado del calculo";

@XendraField(AD_Column_ID="Script",IsCentrallyMaintained=true,
AD_Tab_ID="a0a3132f-3864-1100-2b26-bf06f0bc817d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DiscountType@=S",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="5612a492-7324-a9a5-19d6-a786f78b5882")
public static final String FIELDNAME_DiscountSchema_Script="5612a492-7324-a9a5-19d6-a786f78b5882";

@XendraTrl(Identifier="3c1d7e17-54ce-714f-48c2-6ae9de809bee")
public static String es_PE_FIELD_PriceListSchema_Script_Name="Escritura";

@XendraTrl(Identifier="3c1d7e17-54ce-714f-48c2-6ae9de809bee")
public static String es_PE_FIELD_PriceListSchema_Script_Description="Escritura de lenguaje Java para calcular resultados";

@XendraTrl(Identifier="3c1d7e17-54ce-714f-48c2-6ae9de809bee")
public static String es_PE_FIELD_PriceListSchema_Script_Help="Usar constructores del lenguaje Java para definir el resultado del calculo";

@XendraField(AD_Column_ID="Script",IsCentrallyMaintained=true,
AD_Tab_ID="56d1c142-b10c-c631-c3c3-7fa57f2669b3",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@DiscountType@=S",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="3c1d7e17-54ce-714f-48c2-6ae9de809bee")
public static final String FIELDNAME_PriceListSchema_Script="3c1d7e17-54ce-714f-48c2-6ae9de809bee";

@XendraTrl(Identifier="b4d68fb3-45e1-4f39-f292-33df11cecbb4")
public static String es_PE_COLUMN_Script_Name="Escritura";

@XendraColumn(AD_Element_ID="9cf04103-dbd5-c841-c159-641242e2c557",ColumnName="Script",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b4d68fb3-45e1-4f39-f292-33df11cecbb4",
Synchronized="2019-08-30 22:23:02.0")
/** Column name Script */
public static final String COLUMNNAME_Script = "Script";
/** Set Valid from.
@param ValidFrom Valid from including this date (first day) */
public void setValidFrom (Timestamp ValidFrom)
{
if (ValidFrom == null) throw new IllegalArgumentException ("ValidFrom is mandatory.");
set_Value (COLUMNNAME_ValidFrom, ValidFrom);
}
/** Get Valid from.
@return Valid from including this date (first day) */
public Timestamp getValidFrom() 
{
return (Timestamp)get_Value(COLUMNNAME_ValidFrom);
}

@XendraTrl(Identifier="fc6db9b9-3c33-19f1-5914-3baa56dd5a8c")
public static String es_PE_FIELD_DiscountSchema_ValidFrom_Name="Válido Desde";

@XendraTrl(Identifier="fc6db9b9-3c33-19f1-5914-3baa56dd5a8c")
public static String es_PE_FIELD_DiscountSchema_ValidFrom_Description="Válido desde; incluyendo esta fecha (primer día)";

@XendraTrl(Identifier="fc6db9b9-3c33-19f1-5914-3baa56dd5a8c")
public static String es_PE_FIELD_DiscountSchema_ValidFrom_Help="La fecha válida desde indica el primer día de un rango de fechas";

@XendraField(AD_Column_ID="ValidFrom",IsCentrallyMaintained=true,
AD_Tab_ID="a0a3132f-3864-1100-2b26-bf06f0bc817d",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=2,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fc6db9b9-3c33-19f1-5914-3baa56dd5a8c")
public static final String FIELDNAME_DiscountSchema_ValidFrom="fc6db9b9-3c33-19f1-5914-3baa56dd5a8c";

@XendraTrl(Identifier="f5bbecda-a9e4-1e84-612b-f9788e92c86e")
public static String es_PE_FIELD_PriceListSchema_ValidFrom_Name="Válido Desde";

@XendraTrl(Identifier="f5bbecda-a9e4-1e84-612b-f9788e92c86e")
public static String es_PE_FIELD_PriceListSchema_ValidFrom_Description="Válido desde; incluyendo esta fecha (primer día)";

@XendraTrl(Identifier="f5bbecda-a9e4-1e84-612b-f9788e92c86e")
public static String es_PE_FIELD_PriceListSchema_ValidFrom_Help="La fecha válida desde indica el primer día de un rango de fechas";

@XendraField(AD_Column_ID="ValidFrom",IsCentrallyMaintained=true,
AD_Tab_ID="56d1c142-b10c-c631-c3c3-7fa57f2669b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=2,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f5bbecda-a9e4-1e84-612b-f9788e92c86e")
public static final String FIELDNAME_PriceListSchema_ValidFrom="f5bbecda-a9e4-1e84-612b-f9788e92c86e";

@XendraTrl(Identifier="86948ff5-26de-b393-5322-7c77ce27a29a")
public static String es_PE_COLUMN_ValidFrom_Name="Válido Desde";

@XendraColumn(AD_Element_ID="86b1171a-a6c6-0da5-1aea-3f3106450d07",ColumnName="ValidFrom",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="86948ff5-26de-b393-5322-7c77ce27a29a",
Synchronized="2019-08-30 22:23:02.0")
/** Column name ValidFrom */
public static final String COLUMNNAME_ValidFrom = "ValidFrom";
}
