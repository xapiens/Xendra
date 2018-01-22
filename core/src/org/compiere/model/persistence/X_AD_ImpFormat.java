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
import org.compiere.model.reference.REF_AD_ImpFormatFormatType;
/** Generated Model for AD_ImpFormat
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_ImpFormat extends PO
{
/** Standard Constructor
@param ctx context
@param AD_ImpFormat_ID id
@param trxName transaction
*/
public X_AD_ImpFormat (Properties ctx, int AD_ImpFormat_ID, String trxName)
{
super (ctx, AD_ImpFormat_ID, trxName);
/** if (AD_ImpFormat_ID == 0)
{
setAD_ImpFormat_ID (0);
setAD_Table_ID (0);
setFormatType (null);
setName (null);
setProcessing (false);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_ImpFormat (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=381 */
public static int Table_ID=MTable.getTable_ID("AD_ImpFormat");

@XendraTrl(Identifier="6e97713e-1eac-60ef-977c-86eb12ab314b")
public static String es_PE_TAB_ImportFormat_Name="Formato de Importar";

@XendraTab(Name="Import Format",Description="",Help="",
AD_Window_ID="68101bd1-27c7-50e5-b950-c55d071f1f43",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="6e97713e-1eac-60ef-977c-86eb12ab314b",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ImportFormat="6e97713e-1eac-60ef-977c-86eb12ab314b";

@XendraTrl(Identifier="9b57ffab-049d-0de4-5010-2d8cb168c2ac")
public static String es_PE_TABLE_AD_ImpFormat_Name="Formato de Importación";

@XendraTable(Name="Import Format",Description="",Help="",TableName="AD_ImpFormat",AccessLevel="6",
AD_Window_ID="68101bd1-27c7-50e5-b950-c55d071f1f43",AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.dictionary",Identifier="9b57ffab-049d-0de4-5010-2d8cb168c2ac",
Synchronized="2017-08-16 11:40:19.0")
/** TableName=AD_ImpFormat */
public static final String Table_Name="AD_ImpFormat";


@XendraIndex(Name="ad_impformat_name",Identifier="750f88d9-08dd-961a-bfa6-3b9bae5db7e0",
Column_Names="name",IsUnique="true",TableIdentifier="750f88d9-08dd-961a-bfa6-3b9bae5db7e0",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_impformat_name = "750f88d9-08dd-961a-bfa6-3b9bae5db7e0";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_ImpFormat");

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
    Table_ID = MTable.getTable_ID("AD_ImpFormat");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer (get_ID()).append(" ").append(getName());
return sb.toString();
}
/** Set Import Format.
@param AD_ImpFormat_ID Import Format */
public void setAD_ImpFormat_ID (int AD_ImpFormat_ID)
{
if (AD_ImpFormat_ID < 1) throw new IllegalArgumentException ("AD_ImpFormat_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_ImpFormat_ID, Integer.valueOf(AD_ImpFormat_ID));
}
/** Get Import Format.
@return Import Format */
public int getAD_ImpFormat_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_ImpFormat_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c960a7fe-5779-cce1-a7cf-aeb31c910bb2")
public static String es_PE_FIELD_ImportFormat_ImportFormat_Name="Formato de Importación";

@XendraField(AD_Column_ID="AD_ImpFormat_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6e97713e-1eac-60ef-977c-86eb12ab314b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c960a7fe-5779-cce1-a7cf-aeb31c910bb2")
public static final String FIELDNAME_ImportFormat_ImportFormat="c960a7fe-5779-cce1-a7cf-aeb31c910bb2";
/** Column name AD_ImpFormat_ID */
public static final String COLUMNNAME_AD_ImpFormat_ID = "AD_ImpFormat_ID";
/** Set Table.
@param AD_Table_ID Database Table information */
public void setAD_Table_ID (int AD_Table_ID)
{
if (AD_Table_ID < 1) throw new IllegalArgumentException ("AD_Table_ID is mandatory.");
set_Value (COLUMNNAME_AD_Table_ID, Integer.valueOf(AD_Table_ID));
}
/** Get Table.
@return Database Table information */
public int getAD_Table_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Table_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="78942053-fc4e-b435-048d-727ad82d4f0e")
public static String es_PE_FIELD_ImportFormat_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="78942053-fc4e-b435-048d-727ad82d4f0e")
public static String es_PE_FIELD_ImportFormat_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraTrl(Identifier="78942053-fc4e-b435-048d-727ad82d4f0e")
public static String es_PE_FIELD_ImportFormat_Table_Name="Tabla";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6e97713e-1eac-60ef-977c-86eb12ab314b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="78942053-fc4e-b435-048d-727ad82d4f0e")
public static final String FIELDNAME_ImportFormat_Table="78942053-fc4e-b435-048d-727ad82d4f0e";

@XendraTrl(Identifier="aa947a16-1631-a8e4-5329-6b4c57fd1e6e")
public static String es_PE_COLUMN_AD_Table_ID_Name="Tabla";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="b58a19eb-4dd6-f9c8-5288-2763af30ceeb",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="aa947a16-1631-a8e4-5329-6b4c57fd1e6e",Synchronized="2017-08-05 16:52:33.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
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

@XendraTrl(Identifier="cef969b5-18c2-d1c8-8831-e4ed9635aca5")
public static String es_PE_FIELD_ImportFormat_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="cef969b5-18c2-d1c8-8831-e4ed9635aca5")
public static String es_PE_FIELD_ImportFormat_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="cef969b5-18c2-d1c8-8831-e4ed9635aca5")
public static String es_PE_FIELD_ImportFormat_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="6e97713e-1eac-60ef-977c-86eb12ab314b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cef969b5-18c2-d1c8-8831-e4ed9635aca5")
public static final String FIELDNAME_ImportFormat_Description="cef969b5-18c2-d1c8-8831-e4ed9635aca5";

@XendraTrl(Identifier="2c729b42-d215-267d-d54b-25f39dcb08e0")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2c729b42-d215-267d-d54b-25f39dcb08e0",
Synchronized="2017-08-05 16:52:33.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";

/** FormatType AD_Reference=230ed9ba-8dc2-8494-a554-d81e665fc924 */
public static final int FORMATTYPE_AD_Reference_ID=209;
/** Set Format.
@param FormatType Format of the data */
public void setFormatType (String FormatType)
{
if (FormatType == null) throw new IllegalArgumentException ("FormatType is mandatory");
if (FormatType.equals(REF_AD_ImpFormatFormatType.CommaSeparated) || FormatType.equals(REF_AD_ImpFormatFormatType.TabSeparated) || FormatType.equals(REF_AD_ImpFormatFormatType.XML) || FormatType.equals(REF_AD_ImpFormatFormatType.FixedPosition));
 else throw new IllegalArgumentException ("FormatType Invalid value - " + FormatType + " - Reference_ID=209 - C - T - X - F");
if (FormatType.length() > 1)
{
log.warning("Length > 1 - truncated");
FormatType = FormatType.substring(0,0);
}
set_Value (COLUMNNAME_FormatType, FormatType);
}
/** Get Format.
@return Format of the data */
public String getFormatType() 
{
return (String)get_Value(COLUMNNAME_FormatType);
}

@XendraTrl(Identifier="eddee132-bf34-5566-a244-45cf69230170")
public static String es_PE_FIELD_ImportFormat_Format_Description="Formato del dato";

@XendraTrl(Identifier="eddee132-bf34-5566-a244-45cf69230170")
public static String es_PE_FIELD_ImportFormat_Format_Help="El formato es un cuadro de lista para seleccionar el tipo de formato (texto; pestaña delimitada; XML; etc) del archivo a ser importada";

@XendraTrl(Identifier="eddee132-bf34-5566-a244-45cf69230170")
public static String es_PE_FIELD_ImportFormat_Format_Name="Formato";

@XendraField(AD_Column_ID="FormatType",IsCentrallyMaintained=true,
AD_Tab_ID="6e97713e-1eac-60ef-977c-86eb12ab314b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eddee132-bf34-5566-a244-45cf69230170")
public static final String FIELDNAME_ImportFormat_Format="eddee132-bf34-5566-a244-45cf69230170";

@XendraTrl(Identifier="12cac56b-6ed2-de56-16e4-28ac54f4854d")
public static String es_PE_COLUMN_FormatType_Name="Formato";

@XendraColumn(AD_Element_ID="ee8f22ff-e27e-c178-9a16-ee186ea9cc60",ColumnName="FormatType",
AD_Reference_ID=17,AD_Reference_Value_ID="230ed9ba-8dc2-8494-a554-d81e665fc924",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="12cac56b-6ed2-de56-16e4-28ac54f4854d",Synchronized="2017-08-05 16:52:33.0")
/** Column name FormatType */
public static final String COLUMNNAME_FormatType = "FormatType";
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
@XendraTrl(Identifier="f5b0ceef-d968-427c-bb5b-a64609bc6419")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f5b0ceef-d968-427c-bb5b-a64609bc6419",
Synchronized="2017-08-05 16:52:33.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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

@XendraTrl(Identifier="09011691-9140-5c92-2847-996739da97f3")
public static String es_PE_FIELD_ImportFormat_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="09011691-9140-5c92-2847-996739da97f3")
public static String es_PE_FIELD_ImportFormat_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="09011691-9140-5c92-2847-996739da97f3")
public static String es_PE_FIELD_ImportFormat_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="6e97713e-1eac-60ef-977c-86eb12ab314b",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="09011691-9140-5c92-2847-996739da97f3")
public static final String FIELDNAME_ImportFormat_Name="09011691-9140-5c92-2847-996739da97f3";

@XendraTrl(Identifier="a46fc28f-8cb1-b8ed-c12b-36c00ce68e2c")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a46fc28f-8cb1-b8ed-c12b-36c00ce68e2c",
Synchronized="2017-08-05 16:52:33.0")
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

@XendraTrl(Identifier="20163cb3-cfff-f40f-2ab9-092a44e00b04")
public static String es_PE_FIELD_ImportFormat_ProcessNow_Name="Copiar De";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="6e97713e-1eac-60ef-977c-86eb12ab314b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="20163cb3-cfff-f40f-2ab9-092a44e00b04")
public static final String FIELDNAME_ImportFormat_ProcessNow="20163cb3-cfff-f40f-2ab9-092a44e00b04";

@XendraTrl(Identifier="d7a15421-83fb-6b60-e89a-efa4b099548b")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="4a600e92-020b-2ea1-4477-9c9d4fcebaf4",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d7a15421-83fb-6b60-e89a-efa4b099548b",Synchronized="2017-08-05 16:52:33.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
}
