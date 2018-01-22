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
import org.compiere.model.reference.REF_AD_PrintPaperUnits;
/** Generated Model for AD_PrintPaper
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_PrintPaper extends PO
{
/** Standard Constructor
@param ctx context
@param AD_PrintPaper_ID id
@param trxName transaction
*/
public X_AD_PrintPaper (Properties ctx, int AD_PrintPaper_ID, String trxName)
{
super (ctx, AD_PrintPaper_ID, trxName);
/** if (AD_PrintPaper_ID == 0)
{
setAD_PrintPaper_ID (0);
setCode (null);	
// iso-a4
setIsDefault (false);	
// N
setIsLandscape (true);	
// Y
setMarginBottom (0);	
// 36
setMarginLeft (0);	
// 36
setMarginRight (0);	
// 36
setMarginTop (0);	
// 36
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_PrintPaper (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=492 */
public static int Table_ID=MTable.getTable_ID("AD_PrintPaper");

@XendraTrl(Identifier="3b3b812f-8ebe-db23-4169-49eced70b611")
public static String es_PE_TAB_PrintPaper_Description="Mantener Papel de Impresión";

@XendraTrl(Identifier="3b3b812f-8ebe-db23-4169-49eced70b611")
public static String es_PE_TAB_PrintPaper_Name="Papel de Impresión";

@XendraTrl(Identifier="3b3b812f-8ebe-db23-4169-49eced70b611")
public static String es_PE_TAB_PrintPaper_Help="Tamaño de papel de impresión; Orientación y Margenes. El código de validación contiene el nombre de tamaño de Media. Los nombres de tamaño de medio corresponde a aquellos en IPP 1.1 RFC 2911 - http://www.ietf.org/rfc/rfc2911.txt";

@XendraTab(Name="Print Paper",Description="Maintain Print Paper",
Help="Printer Paper Size, Orientation and Margins.  The Validation Code contains the Media Size name. The names of the media sizes correspond to those in the IPP 1.1 RFC 2911 - http://www.ietf.org/rfc/rfc2911.txt  <br> If the name is not found, the SizeX/Y with the dimension is used. Size and dimension are ignored, if a valid media size name is used.",
AD_Window_ID="81c030ba-e183-57ad-d614-755002e4fdd3",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="3b3b812f-8ebe-db23-4169-49eced70b611",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_PrintPaper="3b3b812f-8ebe-db23-4169-49eced70b611";

@XendraTrl(Identifier="23fe0c8b-a64e-41e0-012d-d61336f81d42")
public static String es_PE_TABLE_AD_PrintPaper_Name="Papel de Impresión";

@XendraTable(Name="Print Paper",Description="Printer paper definition",Help="",
TableName="AD_PrintPaper",AccessLevel="6",AD_Window_ID="81c030ba-e183-57ad-d614-755002e4fdd3",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=60,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="23fe0c8b-a64e-41e0-012d-d61336f81d42",Synchronized="2017-08-16 11:40:50.0")
/** TableName=AD_PrintPaper */
public static final String Table_Name="AD_PrintPaper";


@XendraIndex(Name="ad_printpaper_name",Identifier="8d011428-b62c-e445-ddea-a9c0aa2afbba",
Column_Names="ad_client_id, name",IsUnique="true",
TableIdentifier="8d011428-b62c-e445-ddea-a9c0aa2afbba",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_printpaper_name = "8d011428-b62c-e445-ddea-a9c0aa2afbba";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_PrintPaper");

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
    Table_ID = MTable.getTable_ID("AD_PrintPaper");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_PrintPaper[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Print Paper.
@param AD_PrintPaper_ID Printer paper definition */
public void setAD_PrintPaper_ID (int AD_PrintPaper_ID)
{
if (AD_PrintPaper_ID < 1) throw new IllegalArgumentException ("AD_PrintPaper_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_PrintPaper_ID, Integer.valueOf(AD_PrintPaper_ID));
}
/** Get Print Paper.
@return Printer paper definition */
public int getAD_PrintPaper_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PrintPaper_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b83c6c39-dc1f-873b-456f-99accc84e600")
public static String es_PE_FIELD_PrintPaper_PrintPaper_Description="Definición del papel de impresión";

@XendraTrl(Identifier="b83c6c39-dc1f-873b-456f-99accc84e600")
public static String es_PE_FIELD_PrintPaper_PrintPaper_Help="Tamaño; orientación y margenes del papel de impresión";

@XendraTrl(Identifier="b83c6c39-dc1f-873b-456f-99accc84e600")
public static String es_PE_FIELD_PrintPaper_PrintPaper_Name="Papel de Impresión";

@XendraField(AD_Column_ID="AD_PrintPaper_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3b3b812f-8ebe-db23-4169-49eced70b611",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b83c6c39-dc1f-873b-456f-99accc84e600")
public static final String FIELDNAME_PrintPaper_PrintPaper="b83c6c39-dc1f-873b-456f-99accc84e600";
/** Column name AD_PrintPaper_ID */
public static final String COLUMNNAME_AD_PrintPaper_ID = "AD_PrintPaper_ID";
/** Set Validation code.
@param Code Validation Code */
public void setCode (String Code)
{
if (Code == null) throw new IllegalArgumentException ("Code is mandatory.");
if (Code.length() > 2000)
{
log.warning("Length > 2000 - truncated");
Code = Code.substring(0,1999);
}
set_Value (COLUMNNAME_Code, Code);
}
/** Get Validation code.
@return Validation Code */
public String getCode() 
{
String value = (String)get_Value(COLUMNNAME_Code);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="b654c953-b0ec-c387-9cac-796fcd158096")
public static String es_PE_FIELD_PrintPaper_ValidationCode_Description="Código de Validación";

@XendraTrl(Identifier="b654c953-b0ec-c387-9cac-796fcd158096")
public static String es_PE_FIELD_PrintPaper_ValidationCode_Help="El código validación despliega la fecha; hora y mensaje del error";

@XendraTrl(Identifier="b654c953-b0ec-c387-9cac-796fcd158096")
public static String es_PE_FIELD_PrintPaper_ValidationCode_Name="Código de Validación";

@XendraField(AD_Column_ID="Code",IsCentrallyMaintained=true,
AD_Tab_ID="3b3b812f-8ebe-db23-4169-49eced70b611",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b654c953-b0ec-c387-9cac-796fcd158096")
public static final String FIELDNAME_PrintPaper_ValidationCode="b654c953-b0ec-c387-9cac-796fcd158096";

@XendraTrl(Identifier="b416e0cb-001b-f1a7-4eb1-a56d3fd47747")
public static String es_PE_COLUMN_Code_Name="Código de Validación";

@XendraColumn(AD_Element_ID="4885b915-20ff-fb01-73f8-086c5ba63ba8",ColumnName="Code",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,
DefaultValue="iso-a4",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b416e0cb-001b-f1a7-4eb1-a56d3fd47747",Synchronized="2017-08-05 16:52:43.0")
/** Column name Code */
public static final String COLUMNNAME_Code = "Code";
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

@XendraTrl(Identifier="edf1f479-f19d-2c60-8be7-b4111f020a59")
public static String es_PE_FIELD_PrintPaper_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="edf1f479-f19d-2c60-8be7-b4111f020a59")
public static String es_PE_FIELD_PrintPaper_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="edf1f479-f19d-2c60-8be7-b4111f020a59")
public static String es_PE_FIELD_PrintPaper_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="3b3b812f-8ebe-db23-4169-49eced70b611",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="edf1f479-f19d-2c60-8be7-b4111f020a59")
public static final String FIELDNAME_PrintPaper_Description="edf1f479-f19d-2c60-8be7-b4111f020a59";

@XendraTrl(Identifier="73fa6990-b800-58cd-10c9-63bca8aa5173")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="73fa6990-b800-58cd-10c9-63bca8aa5173",
Synchronized="2017-08-05 16:52:43.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";

/** DimensionUnits AD_Reference=36fe46fb-48ed-3eea-df0d-46fae64af9d5 */
public static final int DIMENSIONUNITS_AD_Reference_ID=375;
/** Set Dimension Units.
@param DimensionUnits Units of Dimension */
public void setDimensionUnits (String DimensionUnits)
{
if (DimensionUnits == null || DimensionUnits.equals(REF_AD_PrintPaperUnits.MM) || DimensionUnits.equals(REF_AD_PrintPaperUnits.Inch));
 else throw new IllegalArgumentException ("DimensionUnits Invalid value - " + DimensionUnits + " - Reference_ID=375 - M - I");
if (DimensionUnits != null && DimensionUnits.length() > 1)
{
log.warning("Length > 1 - truncated");
DimensionUnits = DimensionUnits.substring(0,0);
}
set_Value (COLUMNNAME_DimensionUnits, DimensionUnits);
}
/** Get Dimension Units.
@return Units of Dimension */
public String getDimensionUnits() 
{
return (String)get_Value(COLUMNNAME_DimensionUnits);
}

@XendraTrl(Identifier="72e91884-6b58-62db-7981-8d672d835c77")
public static String es_PE_FIELD_PrintPaper_DimensionUnits_Description="Units of Dimension";

@XendraTrl(Identifier="72e91884-6b58-62db-7981-8d672d835c77")
public static String es_PE_FIELD_PrintPaper_DimensionUnits_Name="Dimension Units";

@XendraField(AD_Column_ID="DimensionUnits",IsCentrallyMaintained=true,
AD_Tab_ID="3b3b812f-8ebe-db23-4169-49eced70b611",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="72e91884-6b58-62db-7981-8d672d835c77")
public static final String FIELDNAME_PrintPaper_DimensionUnits="72e91884-6b58-62db-7981-8d672d835c77";

@XendraTrl(Identifier="fc0f1f62-be68-f295-ee35-0901b07839ea")
public static String es_PE_COLUMN_DimensionUnits_Name="Dimension Units";

@XendraColumn(AD_Element_ID="9ce85cb4-0ef4-16e8-90cb-75c77ab35c1e",ColumnName="DimensionUnits",
AD_Reference_ID=17,AD_Reference_Value_ID="36fe46fb-48ed-3eea-df0d-46fae64af9d5",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="fc0f1f62-be68-f295-ee35-0901b07839ea",Synchronized="2017-08-05 16:52:43.0")
/** Column name DimensionUnits */
public static final String COLUMNNAME_DimensionUnits = "DimensionUnits";
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
@XendraTrl(Identifier="56732681-84dc-4de5-9e95-2bab458c23b3")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="56732681-84dc-4de5-9e95-2bab458c23b3",
Synchronized="2017-08-05 16:52:43.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Default.
@param IsDefault Default value */
public void setIsDefault (boolean IsDefault)
{
set_Value (COLUMNNAME_IsDefault, Boolean.valueOf(IsDefault));
}
/** Get Default.
@return Default value */
public boolean isDefault() 
{
Object oo = get_Value(COLUMNNAME_IsDefault);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="d5c2951a-87cc-a659-c7c0-369e7fb20c3e")
public static String es_PE_FIELD_PrintPaper_Default_Description="Valor Predeterminado";

@XendraTrl(Identifier="d5c2951a-87cc-a659-c7c0-369e7fb20c3e")
public static String es_PE_FIELD_PrintPaper_Default_Help="El cuadro de verificación indica si este registro será usado como un valor predeterminado";

@XendraTrl(Identifier="d5c2951a-87cc-a659-c7c0-369e7fb20c3e")
public static String es_PE_FIELD_PrintPaper_Default_Name="Predeterminado";

@XendraField(AD_Column_ID="IsDefault",IsCentrallyMaintained=true,
AD_Tab_ID="3b3b812f-8ebe-db23-4169-49eced70b611",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d5c2951a-87cc-a659-c7c0-369e7fb20c3e")
public static final String FIELDNAME_PrintPaper_Default="d5c2951a-87cc-a659-c7c0-369e7fb20c3e";

@XendraTrl(Identifier="2e95b7d1-4171-2246-a81c-937cba95adc2")
public static String es_PE_COLUMN_IsDefault_Name="Predeterminado";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2e95b7d1-4171-2246-a81c-937cba95adc2",
Synchronized="2017-08-05 16:52:43.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
/** Set Landscape.
@param IsLandscape Landscape orientation */
public void setIsLandscape (boolean IsLandscape)
{
set_Value (COLUMNNAME_IsLandscape, Boolean.valueOf(IsLandscape));
}
/** Get Landscape.
@return Landscape orientation */
public boolean isLandscape() 
{
Object oo = get_Value(COLUMNNAME_IsLandscape);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="878c51be-8703-ed27-20f8-1d1095c166b2")
public static String es_PE_FIELD_PrintPaper_Landscape_Description="Orientación Apaisada";

@XendraTrl(Identifier="878c51be-8703-ed27-20f8-1d1095c166b2")
public static String es_PE_FIELD_PrintPaper_Landscape_Name="Apaisada";

@XendraField(AD_Column_ID="IsLandscape",IsCentrallyMaintained=true,
AD_Tab_ID="3b3b812f-8ebe-db23-4169-49eced70b611",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="878c51be-8703-ed27-20f8-1d1095c166b2")
public static final String FIELDNAME_PrintPaper_Landscape="878c51be-8703-ed27-20f8-1d1095c166b2";

@XendraTrl(Identifier="4293db0b-b0b3-9f79-74a4-3604442c1eab")
public static String es_PE_COLUMN_IsLandscape_Name="Apaisada";

@XendraColumn(AD_Element_ID="df6b41a3-21cb-b8e5-00b1-122cb74ba27e",ColumnName="IsLandscape",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4293db0b-b0b3-9f79-74a4-3604442c1eab",
Synchronized="2017-08-05 16:52:43.0")
/** Column name IsLandscape */
public static final String COLUMNNAME_IsLandscape = "IsLandscape";
/** Set Bottom Margin.
@param MarginBottom Bottom Space in 1/72 inch */
public void setMarginBottom (int MarginBottom)
{
set_Value (COLUMNNAME_MarginBottom, Integer.valueOf(MarginBottom));
}
/** Get Bottom Margin.
@return Bottom Space in 1/72 inch */
public int getMarginBottom() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_MarginBottom);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="31cc6c15-b400-3df5-ed2a-0c7484e02910")
public static String es_PE_FIELD_PrintPaper_BottomMargin_Description="Margen Inferior en espacios de 1/72 de pulgada";

@XendraTrl(Identifier="31cc6c15-b400-3df5-ed2a-0c7484e02910")
public static String es_PE_FIELD_PrintPaper_BottomMargin_Help="Margen Inferior en espacios de 1/72 de pulgada";

@XendraTrl(Identifier="31cc6c15-b400-3df5-ed2a-0c7484e02910")
public static String es_PE_FIELD_PrintPaper_BottomMargin_Name="Margen Inferior";

@XendraField(AD_Column_ID="MarginBottom",IsCentrallyMaintained=true,
AD_Tab_ID="3b3b812f-8ebe-db23-4169-49eced70b611",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="31cc6c15-b400-3df5-ed2a-0c7484e02910")
public static final String FIELDNAME_PrintPaper_BottomMargin="31cc6c15-b400-3df5-ed2a-0c7484e02910";

@XendraTrl(Identifier="1ada88bd-1b88-12cd-2a54-362c61ba7268")
public static String es_PE_COLUMN_MarginBottom_Name="Margen Inferior";

@XendraColumn(AD_Element_ID="4f7f5581-1989-2c20-3ecc-79c3f56340b3",ColumnName="MarginBottom",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="36",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1ada88bd-1b88-12cd-2a54-362c61ba7268",
Synchronized="2017-08-05 16:52:43.0")
/** Column name MarginBottom */
public static final String COLUMNNAME_MarginBottom = "MarginBottom";
/** Set Left Margin.
@param MarginLeft Left Space in 1/72 inch */
public void setMarginLeft (int MarginLeft)
{
set_Value (COLUMNNAME_MarginLeft, Integer.valueOf(MarginLeft));
}
/** Get Left Margin.
@return Left Space in 1/72 inch */
public int getMarginLeft() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_MarginLeft);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c0fb32e3-48ed-cab7-530d-997fc68a3c62")
public static String es_PE_FIELD_PrintPaper_LeftMargin_Description="Margen Izquierdo en espacios de 1/72 de pulgada";

@XendraTrl(Identifier="c0fb32e3-48ed-cab7-530d-997fc68a3c62")
public static String es_PE_FIELD_PrintPaper_LeftMargin_Help="Margen Izquierdo en espacios de 1/72 de pulgada";

@XendraTrl(Identifier="c0fb32e3-48ed-cab7-530d-997fc68a3c62")
public static String es_PE_FIELD_PrintPaper_LeftMargin_Name="Margen Izquierdo";

@XendraField(AD_Column_ID="MarginLeft",IsCentrallyMaintained=true,
AD_Tab_ID="3b3b812f-8ebe-db23-4169-49eced70b611",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c0fb32e3-48ed-cab7-530d-997fc68a3c62")
public static final String FIELDNAME_PrintPaper_LeftMargin="c0fb32e3-48ed-cab7-530d-997fc68a3c62";

@XendraTrl(Identifier="650f757e-c01f-0cd3-fc3b-80c61dbb6c55")
public static String es_PE_COLUMN_MarginLeft_Name="Margen Izquierdo";

@XendraColumn(AD_Element_ID="7a9e7a3f-e007-ce84-f4cc-eca26c1c835d",ColumnName="MarginLeft",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="36",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="650f757e-c01f-0cd3-fc3b-80c61dbb6c55",
Synchronized="2017-08-05 16:52:43.0")
/** Column name MarginLeft */
public static final String COLUMNNAME_MarginLeft = "MarginLeft";
/** Set Right Margin.
@param MarginRight Right Space in 1/72 inch */
public void setMarginRight (int MarginRight)
{
set_Value (COLUMNNAME_MarginRight, Integer.valueOf(MarginRight));
}
/** Get Right Margin.
@return Right Space in 1/72 inch */
public int getMarginRight() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_MarginRight);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="edabe24c-3071-9070-4549-f16a3664e5ff")
public static String es_PE_FIELD_PrintPaper_RightMargin_Description="Margen derecho en espacios de 1/72 de pulgada.";

@XendraTrl(Identifier="edabe24c-3071-9070-4549-f16a3664e5ff")
public static String es_PE_FIELD_PrintPaper_RightMargin_Help="Margen derecho en espacios de 1/72 de pulgada.";

@XendraTrl(Identifier="edabe24c-3071-9070-4549-f16a3664e5ff")
public static String es_PE_FIELD_PrintPaper_RightMargin_Name="Margen Derecho";

@XendraField(AD_Column_ID="MarginRight",IsCentrallyMaintained=true,
AD_Tab_ID="3b3b812f-8ebe-db23-4169-49eced70b611",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="edabe24c-3071-9070-4549-f16a3664e5ff")
public static final String FIELDNAME_PrintPaper_RightMargin="edabe24c-3071-9070-4549-f16a3664e5ff";

@XendraTrl(Identifier="361875e6-d55e-7e7e-01af-3696ea871c4b")
public static String es_PE_COLUMN_MarginRight_Name="Margen Derecho";

@XendraColumn(AD_Element_ID="8a24c56b-8db7-c9fc-c83a-09374003d4c8",ColumnName="MarginRight",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="36",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="361875e6-d55e-7e7e-01af-3696ea871c4b",
Synchronized="2017-08-05 16:52:43.0")
/** Column name MarginRight */
public static final String COLUMNNAME_MarginRight = "MarginRight";
/** Set Top Margin.
@param MarginTop Top Space in 1/72 inch */
public void setMarginTop (int MarginTop)
{
set_Value (COLUMNNAME_MarginTop, Integer.valueOf(MarginTop));
}
/** Get Top Margin.
@return Top Space in 1/72 inch */
public int getMarginTop() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_MarginTop);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7d6df549-cf10-ca7f-4cfd-cad5f01b0284")
public static String es_PE_FIELD_PrintPaper_TopMargin_Description="Margen superior en espacios de 1/72 de pulgada";

@XendraTrl(Identifier="7d6df549-cf10-ca7f-4cfd-cad5f01b0284")
public static String es_PE_FIELD_PrintPaper_TopMargin_Help="Margen superior en espacios de 1/72 de pulgada";

@XendraTrl(Identifier="7d6df549-cf10-ca7f-4cfd-cad5f01b0284")
public static String es_PE_FIELD_PrintPaper_TopMargin_Name="Margen Superior";

@XendraField(AD_Column_ID="MarginTop",IsCentrallyMaintained=true,
AD_Tab_ID="3b3b812f-8ebe-db23-4169-49eced70b611",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7d6df549-cf10-ca7f-4cfd-cad5f01b0284")
public static final String FIELDNAME_PrintPaper_TopMargin="7d6df549-cf10-ca7f-4cfd-cad5f01b0284";

@XendraTrl(Identifier="50218f7a-c467-bcd8-8d21-9cbdbca48f03")
public static String es_PE_COLUMN_MarginTop_Name="Margen Superior";

@XendraColumn(AD_Element_ID="5b33bcbb-78f7-59ad-8620-83fa5dfd81c5",ColumnName="MarginTop",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="36",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="50218f7a-c467-bcd8-8d21-9cbdbca48f03",
Synchronized="2017-08-05 16:52:43.0")
/** Column name MarginTop */
public static final String COLUMNNAME_MarginTop = "MarginTop";
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

@XendraTrl(Identifier="e02796a1-b9ca-91c1-08d6-b9dc623e6037")
public static String es_PE_FIELD_PrintPaper_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="e02796a1-b9ca-91c1-08d6-b9dc623e6037")
public static String es_PE_FIELD_PrintPaper_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="e02796a1-b9ca-91c1-08d6-b9dc623e6037")
public static String es_PE_FIELD_PrintPaper_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="3b3b812f-8ebe-db23-4169-49eced70b611",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="e02796a1-b9ca-91c1-08d6-b9dc623e6037")
public static final String FIELDNAME_PrintPaper_Name="e02796a1-b9ca-91c1-08d6-b9dc623e6037";

@XendraTrl(Identifier="cd50eb7b-15e8-8742-45e2-1840f5b7819b")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cd50eb7b-15e8-8742-45e2-1840f5b7819b",
Synchronized="2017-08-05 16:52:43.0")
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

@XendraTrl(Identifier="9bf291b5-d60c-8202-57d4-ba7b0a3c6336")
public static String es_PE_FIELD_PrintPaper_ProcessNow_Description="Establecer para todos los formatos de impresión con el mismo paisaje/retrato.";

@XendraTrl(Identifier="9bf291b5-d60c-8202-57d4-ba7b0a3c6336")
public static String es_PE_FIELD_PrintPaper_ProcessNow_Name="Establecer Formato de Impresión";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="3b3b812f-8ebe-db23-4169-49eced70b611",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9bf291b5-d60c-8202-57d4-ba7b0a3c6336")
public static final String FIELDNAME_PrintPaper_ProcessNow="9bf291b5-d60c-8202-57d4-ba7b0a3c6336";

@XendraTrl(Identifier="ca8afc5c-51ca-2a4e-301e-45b025b7c235")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="7072df31-ad35-e744-529e-c7037f1da8e4",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ca8afc5c-51ca-2a4e-301e-45b025b7c235",Synchronized="2017-08-05 16:52:43.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Size X.
@param SizeX X (horizontal) dimension size */
public void setSizeX (BigDecimal SizeX)
{
set_Value (COLUMNNAME_SizeX, SizeX);
}
/** Get Size X.
@return X (horizontal) dimension size */
public BigDecimal getSizeX() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_SizeX);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="026a9302-97ed-feb8-a3be-acd52b2c1126")
public static String es_PE_FIELD_PrintPaper_SizeX_Description="X (horizontal) dimension size";

@XendraTrl(Identifier="026a9302-97ed-feb8-a3be-acd52b2c1126")
public static String es_PE_FIELD_PrintPaper_SizeX_Help="Size of X (horizontal) dimension in Units";

@XendraTrl(Identifier="026a9302-97ed-feb8-a3be-acd52b2c1126")
public static String es_PE_FIELD_PrintPaper_SizeX_Name="Size X";
@XendraField(AD_Column_ID="SizeX",
IsCentrallyMaintained=true,AD_Tab_ID="3b3b812f-8ebe-db23-4169-49eced70b611",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=5,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="026a9302-97ed-feb8-a3be-acd52b2c1126")
public static final String FIELDNAME_PrintPaper_SizeX="026a9302-97ed-feb8-a3be-acd52b2c1126";

@XendraTrl(Identifier="0ae5a07c-a571-ebdf-c19f-2a061dc7cca5")
public static String es_PE_COLUMN_SizeX_Name="Size X";

@XendraColumn(AD_Element_ID="f20f642b-ed3d-c470-3cf4-45466f400ae3",ColumnName="SizeX",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=5,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0ae5a07c-a571-ebdf-c19f-2a061dc7cca5",
Synchronized="2017-08-05 16:52:43.0")
/** Column name SizeX */
public static final String COLUMNNAME_SizeX = "SizeX";
/** Set Size Y.
@param SizeY Y (vertical) dimension size */
public void setSizeY (BigDecimal SizeY)
{
set_Value (COLUMNNAME_SizeY, SizeY);
}
/** Get Size Y.
@return Y (vertical) dimension size */
public BigDecimal getSizeY() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_SizeY);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="034b2c58-3cc5-17b2-e0ab-7ea2db2a777f")
public static String es_PE_FIELD_PrintPaper_SizeY_Description="Y (vertical) dimension size";

@XendraTrl(Identifier="034b2c58-3cc5-17b2-e0ab-7ea2db2a777f")
public static String es_PE_FIELD_PrintPaper_SizeY_Help="Size of Y (vertical) dimension in Units";

@XendraTrl(Identifier="034b2c58-3cc5-17b2-e0ab-7ea2db2a777f")
public static String es_PE_FIELD_PrintPaper_SizeY_Name="Size Y";
@XendraField(AD_Column_ID="SizeY",
IsCentrallyMaintained=true,AD_Tab_ID="3b3b812f-8ebe-db23-4169-49eced70b611",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=5,IsReadOnly=false,SeqNo=110,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="034b2c58-3cc5-17b2-e0ab-7ea2db2a777f")
public static final String FIELDNAME_PrintPaper_SizeY="034b2c58-3cc5-17b2-e0ab-7ea2db2a777f";

@XendraTrl(Identifier="89a563d0-4da2-58de-9458-387558380b66")
public static String es_PE_COLUMN_SizeY_Name="Size Y";

@XendraColumn(AD_Element_ID="3a04c005-6b61-63ee-907a-3b2cf25bd282",ColumnName="SizeY",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=5,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="89a563d0-4da2-58de-9458-387558380b66",
Synchronized="2017-08-05 16:52:43.0")
/** Column name SizeY */
public static final String COLUMNNAME_SizeY = "SizeY";
}
