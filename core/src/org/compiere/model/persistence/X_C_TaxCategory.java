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
/** Generated Model for C_TaxCategory
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_TaxCategory extends PO
{
/** Standard Constructor
@param ctx context
@param C_TaxCategory_ID id
@param trxName transaction
*/
public X_C_TaxCategory (Properties ctx, int C_TaxCategory_ID, String trxName)
{
super (ctx, C_TaxCategory_ID, trxName);
/** if (C_TaxCategory_ID == 0)
{
setC_TaxCategory_ID (0);
setIsDefault (false);	
// N
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_TaxCategory (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=252 */
public static int Table_ID=MTable.getTable_ID("C_TaxCategory");

@XendraTrl(Identifier="c15277e7-13b0-1ef9-91a7-93da41dff2b3")
public static String es_PE_TAB_TaxCategory_Description="Categoría de Impuestos";

@XendraTrl(Identifier="c15277e7-13b0-1ef9-91a7-93da41dff2b3")
public static String es_PE_TAB_TaxCategory_Help="La pestaña de Categoría de Impuesto es usada para definir y mantener las categorías de impuestos. Cada producto es asociado a una categoría. Esto facilita generar cambios como resultado de cambios en los regímenes de impuestos dictados por entidades gubernamentales.";

@XendraTrl(Identifier="c15277e7-13b0-1ef9-91a7-93da41dff2b3")
public static String es_PE_TAB_TaxCategory_Name="Categoría de Impuesto";

@XendraTab(Name="Tax Category",Description="Tax Category",
Help="The Tax Category Tab is used to define and maintain Tax Categories.  Each Product is associated with a Tax Category.  This facilitates adapting to changes in taxation.",
AD_Window_ID="8e0e0cd7-287d-ef15-cd46-1def743ad2fe",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="c15277e7-13b0-1ef9-91a7-93da41dff2b3",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_TaxCategory="c15277e7-13b0-1ef9-91a7-93da41dff2b3";

@XendraTrl(Identifier="52812880-00dd-e493-95db-6e98e9dafcb3")
public static String es_PE_TABLE_C_TaxCategory_Name="Categoría del Impuesto";

@XendraTable(Name="Tax Category",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Tax Category",Help="",
TableName="C_TaxCategory",AccessLevel="2",AD_Window_ID="8e0e0cd7-287d-ef15-cd46-1def743ad2fe",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=75,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="52812880-00dd-e493-95db-6e98e9dafcb3",Synchronized="2020-03-03 21:37:43.0")
/** TableName=C_TaxCategory */
public static final String Table_Name="C_TaxCategory";


@XendraIndex(Name="c_taxcategory_name",Identifier="6210df2b-76ee-aba5-429f-dae44a5d2bde",
Column_Names="ad_client_id, name",IsUnique="true",
TableIdentifier="6210df2b-76ee-aba5-429f-dae44a5d2bde",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_taxcategory_name = "6210df2b-76ee-aba5-429f-dae44a5d2bde";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_TaxCategory");

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
    Table_ID = MTable.getTable_ID("C_TaxCategory");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_TaxCategory[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Commodity Code.
@param CommodityCode Commodity code used for tax calculation */
public void setCommodityCode (String CommodityCode)
{
if (CommodityCode != null && CommodityCode.length() > 20)
{
log.warning("Length > 20 - truncated");
CommodityCode = CommodityCode.substring(0,19);
}
set_Value (COLUMNNAME_CommodityCode, CommodityCode);
}
/** Get Commodity Code.
@return Commodity code used for tax calculation */
public String getCommodityCode() 
{
String value = (String)get_Value(COLUMNNAME_CommodityCode);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="4dcf03a9-0fd4-39af-d2d6-fe786df8d754")
public static String es_PE_FIELD_TaxCategory_CommodityCode_Name="Código de Mercancía";

@XendraTrl(Identifier="4dcf03a9-0fd4-39af-d2d6-fe786df8d754")
public static String es_PE_FIELD_TaxCategory_CommodityCode_Description="Código de mercancía usado para cálculo de impuestos";

@XendraTrl(Identifier="4dcf03a9-0fd4-39af-d2d6-fe786df8d754")
public static String es_PE_FIELD_TaxCategory_CommodityCode_Help="El código mercancía indica un código que se usa en el cálculo de impuestos";

@XendraField(AD_Column_ID="CommodityCode",IsCentrallyMaintained=true,
AD_Tab_ID="c15277e7-13b0-1ef9-91a7-93da41dff2b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4dcf03a9-0fd4-39af-d2d6-fe786df8d754")
public static final String FIELDNAME_TaxCategory_CommodityCode="4dcf03a9-0fd4-39af-d2d6-fe786df8d754";

@XendraTrl(Identifier="3ed59700-cdef-61c0-0933-8f8008d8a9a2")
public static String es_PE_COLUMN_CommodityCode_Name="Código de Mercancía";

@XendraColumn(AD_Element_ID="dcaa2ba7-e982-afcf-5dc1-607cebc344b4",ColumnName="CommodityCode",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3ed59700-cdef-61c0-0933-8f8008d8a9a2",
Synchronized="2019-08-30 22:22:20.0")
/** Column name CommodityCode */
public static final String COLUMNNAME_CommodityCode = "CommodityCode";
/** Set Tax Category.
@param C_TaxCategory_ID Tax Category */
public void setC_TaxCategory_ID (int C_TaxCategory_ID)
{
if (C_TaxCategory_ID < 1) throw new IllegalArgumentException ("C_TaxCategory_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_TaxCategory_ID, Integer.valueOf(C_TaxCategory_ID));
}
/** Get Tax Category.
@return Tax Category */
public int getC_TaxCategory_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_TaxCategory_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="26c9741a-44fb-ec44-3b9e-18ba0d5419d1")
public static String es_PE_FIELD_TaxCategory_TaxCategory_Name="Categoría del Impuesto";

@XendraTrl(Identifier="26c9741a-44fb-ec44-3b9e-18ba0d5419d1")
public static String es_PE_FIELD_TaxCategory_TaxCategory_Description="Categoría del Impuesto";

@XendraTrl(Identifier="26c9741a-44fb-ec44-3b9e-18ba0d5419d1")
public static String es_PE_FIELD_TaxCategory_TaxCategory_Help="La categoría de impuesto proporciona un método de agrupación de impuestos similares. (Ej. Impuesto de ventas ó Impuesto al Valor Agregado)";

@XendraField(AD_Column_ID="C_TaxCategory_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c15277e7-13b0-1ef9-91a7-93da41dff2b3",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="26c9741a-44fb-ec44-3b9e-18ba0d5419d1")
public static final String FIELDNAME_TaxCategory_TaxCategory="26c9741a-44fb-ec44-3b9e-18ba0d5419d1";
/** Column name C_TaxCategory_ID */
public static final String COLUMNNAME_C_TaxCategory_ID = "C_TaxCategory_ID";
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

@XendraTrl(Identifier="2d711c46-66e3-cafd-8fc5-4dd57cec2f72")
public static String es_PE_FIELD_TaxCategory_Description_Name="Observación";

@XendraTrl(Identifier="2d711c46-66e3-cafd-8fc5-4dd57cec2f72")
public static String es_PE_FIELD_TaxCategory_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="2d711c46-66e3-cafd-8fc5-4dd57cec2f72")
public static String es_PE_FIELD_TaxCategory_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="c15277e7-13b0-1ef9-91a7-93da41dff2b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2d711c46-66e3-cafd-8fc5-4dd57cec2f72")
public static final String FIELDNAME_TaxCategory_Description="2d711c46-66e3-cafd-8fc5-4dd57cec2f72";

@XendraTrl(Identifier="8cd16d9a-15b6-fd3a-481c-e84e94b3f818")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8cd16d9a-15b6-fd3a-481c-e84e94b3f818",
Synchronized="2019-08-30 22:22:20.0")
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
@XendraTrl(Identifier="6a84b0ea-509a-4672-a4f6-06112fa038de")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6a84b0ea-509a-4672-a4f6-06112fa038de",
Synchronized="2019-08-30 22:22:20.0")
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

@XendraTrl(Identifier="34acfe3c-303f-48dc-f9ca-6056122c4250")
public static String es_PE_FIELD_TaxCategory_Default_Name="Predeterminado";

@XendraTrl(Identifier="34acfe3c-303f-48dc-f9ca-6056122c4250")
public static String es_PE_FIELD_TaxCategory_Default_Description="Valor Predeterminado";

@XendraTrl(Identifier="34acfe3c-303f-48dc-f9ca-6056122c4250")
public static String es_PE_FIELD_TaxCategory_Default_Help="El cuadro de verificación indica si este registro será usado como un valor predeterminado";

@XendraField(AD_Column_ID="IsDefault",IsCentrallyMaintained=true,
AD_Tab_ID="c15277e7-13b0-1ef9-91a7-93da41dff2b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="34acfe3c-303f-48dc-f9ca-6056122c4250")
public static final String FIELDNAME_TaxCategory_Default="34acfe3c-303f-48dc-f9ca-6056122c4250";

@XendraTrl(Identifier="f1d78422-f29c-8075-161a-88d753096eec")
public static String es_PE_COLUMN_IsDefault_Name="Predeterminado";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f1d78422-f29c-8075-161a-88d753096eec",
Synchronized="2019-08-30 22:22:20.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
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

@XendraTrl(Identifier="d56ac230-7dad-4319-b654-4feb74368f2a")
public static String es_PE_FIELD_TaxCategory_Name_Name="Nombre";

@XendraTrl(Identifier="d56ac230-7dad-4319-b654-4feb74368f2a")
public static String es_PE_FIELD_TaxCategory_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="d56ac230-7dad-4319-b654-4feb74368f2a")
public static String es_PE_FIELD_TaxCategory_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="c15277e7-13b0-1ef9-91a7-93da41dff2b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d56ac230-7dad-4319-b654-4feb74368f2a")
public static final String FIELDNAME_TaxCategory_Name="d56ac230-7dad-4319-b654-4feb74368f2a";

@XendraTrl(Identifier="9be6b177-1df8-7e30-cd1f-4b50508518e8")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9be6b177-1df8-7e30-cd1f-4b50508518e8",
Synchronized="2019-08-30 22:22:20.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
