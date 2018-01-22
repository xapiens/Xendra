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
/** Generated Model for C_ConversionType
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_ConversionType extends PO
{
/** Standard Constructor
@param ctx context
@param C_ConversionType_ID id
@param trxName transaction
*/
public X_C_ConversionType (Properties ctx, int C_ConversionType_ID, String trxName)
{
super (ctx, C_ConversionType_ID, trxName);
/** if (C_ConversionType_ID == 0)
{
setC_ConversionType_ID (0);
setIsDefault (false);	
// N
setName (null);
setValue (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_ConversionType (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=637 */
public static int Table_ID=MTable.getTable_ID("C_ConversionType");

@XendraTrl(Identifier="f2962a3e-0356-10ae-b482-e9b557a8530b")
public static String es_PE_TAB_ConversionType_Description="Mantenga el tipo del indice de conversión de moneda";

@XendraTrl(Identifier="f2962a3e-0356-10ae-b482-e9b557a8530b")
public static String es_PE_TAB_ConversionType_Name="Conversión Moneda";

@XendraTrl(Identifier="f2962a3e-0356-10ae-b482-e9b557a8530b")
public static String es_PE_TAB_ConversionType_Help="El tipo del índice de conversión de moneda permite definir diversos tipos de tarifas, tarifas. Ej. de punto, corporativas y/o de Venta/Compra.";

@XendraTab(Name="Conversion Type",Description="Maintain Currency Conversion Rate Type",
Help="The Currency Conversion Rate Type lets you define different type of rates, e.g. Spot, Corporate and/or Sell/Buy rates.",
AD_Window_ID="3168c7df-79e5-8659-1824-f07e4aa500eb",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="f2962a3e-0356-10ae-b482-e9b557a8530b",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ConversionType="f2962a3e-0356-10ae-b482-e9b557a8530b";

@XendraTrl(Identifier="64e2bf0e-4680-8ff2-b00b-10dc0fd7aadd")
public static String es_PE_TABLE_C_ConversionType_Name="Tipo de Moneda";

@XendraTable(Name="Currency Type",Description="Currency Conversion Rate Type",Help="",
TableName="C_ConversionType",AccessLevel="6",AD_Window_ID="3168c7df-79e5-8659-1824-f07e4aa500eb",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=100,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="64e2bf0e-4680-8ff2-b00b-10dc0fd7aadd",Synchronized="2017-08-16 11:41:41.0")
/** TableName=C_ConversionType */
public static final String Table_Name="C_ConversionType";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_ConversionType");

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
    Table_ID = MTable.getTable_ID("C_ConversionType");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_ConversionType[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Currency Type.
@param C_ConversionType_ID Currency Conversion Rate Type */
public void setC_ConversionType_ID (int C_ConversionType_ID)
{
if (C_ConversionType_ID < 1) throw new IllegalArgumentException ("C_ConversionType_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_ConversionType_ID, Integer.valueOf(C_ConversionType_ID));
}
/** Get Currency Type.
@return Currency Conversion Rate Type */
public int getC_ConversionType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ConversionType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="236f9cde-39ca-1b3e-023d-43d9ea97eede")
public static String es_PE_FIELD_ConversionType_CurrencyType_Description="Tipo de índice de conversión de moneda ";

@XendraTrl(Identifier="236f9cde-39ca-1b3e-023d-43d9ea97eede")
public static String es_PE_FIELD_ConversionType_CurrencyType_Help="El tipo del índice de conversión de monedas le deja definir diversos tipos de tarifas, tarifas ej. del punto, corporativas y/o de Ventas/Compras.";

@XendraTrl(Identifier="236f9cde-39ca-1b3e-023d-43d9ea97eede")
public static String es_PE_FIELD_ConversionType_CurrencyType_Name="Tipo de Moneda";

@XendraField(AD_Column_ID="C_ConversionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2962a3e-0356-10ae-b482-e9b557a8530b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="236f9cde-39ca-1b3e-023d-43d9ea97eede")
public static final String FIELDNAME_ConversionType_CurrencyType="236f9cde-39ca-1b3e-023d-43d9ea97eede";
/** Column name C_ConversionType_ID */
public static final String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";
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

@XendraTrl(Identifier="ea084591-5d8f-4836-740d-9185976f2174")
public static String es_PE_FIELD_ConversionType_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="ea084591-5d8f-4836-740d-9185976f2174")
public static String es_PE_FIELD_ConversionType_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="ea084591-5d8f-4836-740d-9185976f2174")
public static String es_PE_FIELD_ConversionType_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="f2962a3e-0356-10ae-b482-e9b557a8530b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ea084591-5d8f-4836-740d-9185976f2174")
public static final String FIELDNAME_ConversionType_Description="ea084591-5d8f-4836-740d-9185976f2174";

@XendraTrl(Identifier="b4fc71ab-93f5-878c-9413-f2b53a80c3ab")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b4fc71ab-93f5-878c-9413-f2b53a80c3ab",
Synchronized="2017-08-05 16:53:32.0")
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
@XendraTrl(Identifier="0d9580d0-ee34-46fd-802d-a8767c1f1d23")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0d9580d0-ee34-46fd-802d-a8767c1f1d23",
Synchronized="2017-08-05 16:53:32.0")
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

@XendraTrl(Identifier="f0f6cd8a-acad-5c56-c00c-37c04b2628af")
public static String es_PE_FIELD_ConversionType_Default_Description="Valor Predeterminado";

@XendraTrl(Identifier="f0f6cd8a-acad-5c56-c00c-37c04b2628af")
public static String es_PE_FIELD_ConversionType_Default_Help="El cuadro de verificación indica si este registro será usado como un valor predeterminado";

@XendraTrl(Identifier="f0f6cd8a-acad-5c56-c00c-37c04b2628af")
public static String es_PE_FIELD_ConversionType_Default_Name="Predeterminado";

@XendraField(AD_Column_ID="IsDefault",IsCentrallyMaintained=true,
AD_Tab_ID="f2962a3e-0356-10ae-b482-e9b557a8530b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f0f6cd8a-acad-5c56-c00c-37c04b2628af")
public static final String FIELDNAME_ConversionType_Default="f0f6cd8a-acad-5c56-c00c-37c04b2628af";

@XendraTrl(Identifier="90aad7b6-be1b-6093-3859-79b15125ce3d")
public static String es_PE_COLUMN_IsDefault_Name="Predeterminado";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="90aad7b6-be1b-6093-3859-79b15125ce3d",
Synchronized="2017-08-05 16:53:32.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
/** Set IsLoad.
@param IsLoad IsLoad */
public void setIsLoad (boolean IsLoad)
{
set_Value (COLUMNNAME_IsLoad, Boolean.valueOf(IsLoad));
}
/** Get IsLoad.
@return IsLoad */
public boolean isLoad() 
{
Object oo = get_Value(COLUMNNAME_IsLoad);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="41984637-2797-da11-ef46-5d89a69f5041")
public static String es_PE_COLUMN_IsLoad_Name="IsLoad";

@XendraColumn(AD_Element_ID="3d27d23e-9f0e-aed3-599f-7753a212cb4c",ColumnName="IsLoad",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="41984637-2797-da11-ef46-5d89a69f5041",
Synchronized="2017-08-05 16:53:33.0")
/** Column name IsLoad */
public static final String COLUMNNAME_IsLoad = "IsLoad";
/** Set Mandatory.
@param IsMandatory Data entry is required in this column */
public void setIsMandatory (boolean IsMandatory)
{
set_Value (COLUMNNAME_IsMandatory, Boolean.valueOf(IsMandatory));
}
/** Get Mandatory.
@return Data entry is required in this column */
public boolean isMandatory() 
{
Object oo = get_Value(COLUMNNAME_IsMandatory);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="85aee42a-37f5-bfe3-8c09-49abf6c42ea2")
public static String es_PE_FIELD_ConversionType_Mandatory_Description="Entrada de datos es requerida en esta columna";

@XendraTrl(Identifier="85aee42a-37f5-bfe3-8c09-49abf6c42ea2")
public static String es_PE_FIELD_ConversionType_Mandatory_Help="El cuadro de verificación obligatorio indica si el campo es requerido para que un registro sea salvado a la base de datos.";

@XendraTrl(Identifier="85aee42a-37f5-bfe3-8c09-49abf6c42ea2")
public static String es_PE_FIELD_ConversionType_Mandatory_Name="Entrada Obligatoria";

@XendraField(AD_Column_ID="IsMandatory",IsCentrallyMaintained=true,
AD_Tab_ID="f2962a3e-0356-10ae-b482-e9b557a8530b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="85aee42a-37f5-bfe3-8c09-49abf6c42ea2")
public static final String FIELDNAME_ConversionType_Mandatory="85aee42a-37f5-bfe3-8c09-49abf6c42ea2";

@XendraTrl(Identifier="a9ed3e8d-a6d4-8699-df4b-66154ed55681")
public static String es_PE_COLUMN_IsMandatory_Name="Mandatory";

@XendraColumn(AD_Element_ID="43310179-c59f-f313-de13-08d90722e38d",ColumnName="IsMandatory",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a9ed3e8d-a6d4-8699-df4b-66154ed55681",
Synchronized="2017-08-05 16:53:33.0")
/** Column name IsMandatory */
public static final String COLUMNNAME_IsMandatory = "IsMandatory";
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

@XendraTrl(Identifier="8e5d5d68-3095-02a1-7daa-8b3d98cbe299")
public static String es_PE_FIELD_ConversionType_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="8e5d5d68-3095-02a1-7daa-8b3d98cbe299")
public static String es_PE_FIELD_ConversionType_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="8e5d5d68-3095-02a1-7daa-8b3d98cbe299")
public static String es_PE_FIELD_ConversionType_Name_Name="Nombre";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="f2962a3e-0356-10ae-b482-e9b557a8530b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8e5d5d68-3095-02a1-7daa-8b3d98cbe299")
public static final String FIELDNAME_ConversionType_Name="8e5d5d68-3095-02a1-7daa-8b3d98cbe299";

@XendraTrl(Identifier="93de9080-0963-d55b-6724-0cf8e01aaf1b")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="93de9080-0963-d55b-6724-0cf8e01aaf1b",
Synchronized="2017-08-05 16:53:33.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
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
@XendraTrl(Identifier="cc300c88-0bc6-1bd0-ebea-c44aeb32fec8")
public static String es_PE_FIELD_ConversionType_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="cc300c88-0bc6-1bd0-ebea-c44aeb32fec8")
public static String es_PE_FIELD_ConversionType_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraTrl(Identifier="cc300c88-0bc6-1bd0-ebea-c44aeb32fec8")
public static String es_PE_FIELD_ConversionType_SearchKey_Name="Clave de Búsqueda";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="f2962a3e-0356-10ae-b482-e9b557a8530b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cc300c88-0bc6-1bd0-ebea-c44aeb32fec8")
public static final String FIELDNAME_ConversionType_SearchKey="cc300c88-0bc6-1bd0-ebea-c44aeb32fec8";

@XendraTrl(Identifier="ffbd88ce-b699-a044-dffa-50f1a3926f9e")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ffbd88ce-b699-a044-dffa-50f1a3926f9e",
Synchronized="2017-08-05 16:53:33.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
