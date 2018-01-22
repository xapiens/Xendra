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
/** Generated Model for C_CashBook
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_CashBook extends PO
{
/** Standard Constructor
@param ctx context
@param C_CashBook_ID id
@param trxName transaction
*/
public X_C_CashBook (Properties ctx, int C_CashBook_ID, String trxName)
{
super (ctx, C_CashBook_ID, trxName);
/** if (C_CashBook_ID == 0)
{
setC_CashBook_ID (0);
setC_Currency_ID (0);	
// SQL=SELECT cb.C_Currency_ID FROM C_CashBook cb INNER JOIN C_Cash c ON (cb.C_CashBook_ID=c.C_CashBook_ID) WHERE c.C_Cash_ID=@C_Cash_ID@
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
public X_C_CashBook (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=408 */
public static int Table_ID=MTable.getTable_ID("C_CashBook");

@XendraTrl(Identifier="29e338b6-943f-f41c-3329-e0d98f5de8f6")
public static String es_PE_TAB_Cashbook_Description="Mantener Libro de Efectivo";

@XendraTrl(Identifier="29e338b6-943f-f41c-3329-e0d98f5de8f6")
public static String es_PE_TAB_Cashbook_Name="Libro de Efectivo";

@XendraTrl(Identifier="29e338b6-943f-f41c-3329-e0d98f5de8f6")
public static String es_PE_TAB_Cashbook_Help="La pestaña Libro de Efectivo define un libro de efectivo para una organización.";

@XendraTab(Name="Cashbook",Description="Maintain Cashbook",
Help="The Cashbook Tab defines a unique cashbook for an organization.",
AD_Window_ID="9f80de58-8dfb-e022-030e-4507c96bb137",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="29e338b6-943f-f41c-3329-e0d98f5de8f6",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Cashbook="29e338b6-943f-f41c-3329-e0d98f5de8f6";

@XendraTrl(Identifier="ab44027e-b361-a2a7-e816-a5279dbc771d")
public static String es_PE_TABLE_C_CashBook_Name="Libro de Efectivo";

@XendraTable(Name="Cash Book",Description="Cash Book for recording petty cash transactions",
Help="",TableName="C_CashBook",AccessLevel="3",AD_Window_ID="9f80de58-8dfb-e022-030e-4507c96bb137",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=125,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="ab44027e-b361-a2a7-e816-a5279dbc771d",Synchronized="2017-08-16 11:41:35.0")
/** TableName=C_CashBook */
public static final String Table_Name="C_CashBook";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_CashBook");

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
    Table_ID = MTable.getTable_ID("C_CashBook");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_CashBook[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Cash Book.
@param C_CashBook_ID Cash Book for recording petty cash transactions */
public void setC_CashBook_ID (int C_CashBook_ID)
{
if (C_CashBook_ID < 1) throw new IllegalArgumentException ("C_CashBook_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_CashBook_ID, Integer.valueOf(C_CashBook_ID));
}
/** Get Cash Book.
@return Cash Book for recording petty cash transactions */
public int getC_CashBook_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_CashBook_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="aca73dde-fbbb-d91d-f4b3-5cc988d7d29f")
public static String es_PE_FIELD_Cashbook_CashBook_Description="Libro de efectivo para registrar transacciones de caja chica.";

@XendraTrl(Identifier="aca73dde-fbbb-d91d-f4b3-5cc988d7d29f")
public static String es_PE_FIELD_Cashbook_CashBook_Help="El libro de efectivo identifica un libro de efectivo único. El libro de efectivo se usa para registrar transacciones de efectivo.";

@XendraTrl(Identifier="aca73dde-fbbb-d91d-f4b3-5cc988d7d29f")
public static String es_PE_FIELD_Cashbook_CashBook_Name="Libro de Efectivo";

@XendraField(AD_Column_ID="C_CashBook_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29e338b6-943f-f41c-3329-e0d98f5de8f6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aca73dde-fbbb-d91d-f4b3-5cc988d7d29f")
public static final String FIELDNAME_Cashbook_CashBook="aca73dde-fbbb-d91d-f4b3-5cc988d7d29f";
/** Column name C_CashBook_ID */
public static final String COLUMNNAME_C_CashBook_ID = "C_CashBook_ID";
/** Set Currency Type.
@param C_ConversionType_ID Currency Conversion Rate Type */
public void setC_ConversionType_ID (int C_ConversionType_ID)
{
if (C_ConversionType_ID <= 0) set_Value (COLUMNNAME_C_ConversionType_ID, null);
 else 
set_Value (COLUMNNAME_C_ConversionType_ID, Integer.valueOf(C_ConversionType_ID));
}
/** Get Currency Type.
@return Currency Conversion Rate Type */
public int getC_ConversionType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ConversionType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d9eb5dc4-50a7-4253-f945-aa23972f8b9f")
public static String es_PE_FIELD_Cashbook_CurrencyType_Description="Tipo de índice de conversión de moneda ";

@XendraTrl(Identifier="d9eb5dc4-50a7-4253-f945-aa23972f8b9f")
public static String es_PE_FIELD_Cashbook_CurrencyType_Help="El tipo del índice de conversión de monedas le deja definir diversos tipos de tarifas, tarifas ej. del punto, corporativas y/o de Ventas/Compras.";

@XendraTrl(Identifier="d9eb5dc4-50a7-4253-f945-aa23972f8b9f")
public static String es_PE_FIELD_Cashbook_CurrencyType_Name="Tipo de Moneda";

@XendraField(AD_Column_ID="C_ConversionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29e338b6-943f-f41c-3329-e0d98f5de8f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d9eb5dc4-50a7-4253-f945-aa23972f8b9f")
public static final String FIELDNAME_Cashbook_CurrencyType="d9eb5dc4-50a7-4253-f945-aa23972f8b9f";

@XendraTrl(Identifier="d3975799-5eb4-9f8d-3a10-cbcf7e5c3bc1")
public static String es_PE_COLUMN_C_ConversionType_ID_Name="Currency Type";

@XendraColumn(AD_Element_ID="66f5d039-c94d-0957-487b-eb3118bd7719",
ColumnName="C_ConversionType_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d3975799-5eb4-9f8d-3a10-cbcf7e5c3bc1",Synchronized="2017-08-05 16:53:27.0")
/** Column name C_ConversionType_ID */
public static final String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID < 1) throw new IllegalArgumentException ("C_Currency_ID is mandatory.");
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

@XendraTrl(Identifier="9d2878e4-e006-91ac-b936-4b2433170e98")
public static String es_PE_FIELD_Cashbook_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="9d2878e4-e006-91ac-b936-4b2433170e98")
public static String es_PE_FIELD_Cashbook_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="9d2878e4-e006-91ac-b936-4b2433170e98")
public static String es_PE_FIELD_Cashbook_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29e338b6-943f-f41c-3329-e0d98f5de8f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9d2878e4-e006-91ac-b936-4b2433170e98")
public static final String FIELDNAME_Cashbook_Currency="9d2878e4-e006-91ac-b936-4b2433170e98";

@XendraTrl(Identifier="7d8ccb9b-2737-c5b9-4c5d-db8e5f0bf26f")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="SQL=SELECT cb.C_Currency_ID FROM C_CashBook cb INNER JOIN C_Cash c ON (cb.C_CashBook_ID=c.C_CashBook_ID) WHERE c.C_Cash_ID=@C_Cash_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7d8ccb9b-2737-c5b9-4c5d-db8e5f0bf26f",
Synchronized="2017-08-05 16:53:27.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
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

@XendraTrl(Identifier="80c62fbf-aff2-777a-6f11-7d3c41287dc5")
public static String es_PE_FIELD_Cashbook_Description_Description="Observación";

@XendraTrl(Identifier="80c62fbf-aff2-777a-6f11-7d3c41287dc5")
public static String es_PE_FIELD_Cashbook_Description_Help="Observación";

@XendraTrl(Identifier="80c62fbf-aff2-777a-6f11-7d3c41287dc5")
public static String es_PE_FIELD_Cashbook_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="29e338b6-943f-f41c-3329-e0d98f5de8f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="80c62fbf-aff2-777a-6f11-7d3c41287dc5")
public static final String FIELDNAME_Cashbook_Description="80c62fbf-aff2-777a-6f11-7d3c41287dc5";

@XendraTrl(Identifier="b40e0700-489f-09e2-e563-570f67c0b3a4")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b40e0700-489f-09e2-e563-570f67c0b3a4",
Synchronized="2017-08-05 16:53:27.0")
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
@XendraTrl(Identifier="2a5d9fec-85d6-406c-929f-4a8a1553b14a")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2a5d9fec-85d6-406c-929f-4a8a1553b14a",
Synchronized="2017-08-05 16:53:27.0")
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

@XendraTrl(Identifier="74161a2b-b597-2d0e-f85d-df9ef231dbc2")
public static String es_PE_FIELD_Cashbook_Default_Description="Valor Predeterminado";

@XendraTrl(Identifier="74161a2b-b597-2d0e-f85d-df9ef231dbc2")
public static String es_PE_FIELD_Cashbook_Default_Help="El cuadro de verificación indica si este registro será usado como un valor predeterminado";

@XendraTrl(Identifier="74161a2b-b597-2d0e-f85d-df9ef231dbc2")
public static String es_PE_FIELD_Cashbook_Default_Name="Predeterminado";

@XendraField(AD_Column_ID="IsDefault",IsCentrallyMaintained=true,
AD_Tab_ID="29e338b6-943f-f41c-3329-e0d98f5de8f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="74161a2b-b597-2d0e-f85d-df9ef231dbc2")
public static final String FIELDNAME_Cashbook_Default="74161a2b-b597-2d0e-f85d-df9ef231dbc2";

@XendraTrl(Identifier="4d4e6ea4-46e0-7fab-4480-e7b06ddf2de3")
public static String es_PE_COLUMN_IsDefault_Name="Predeterminado";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4d4e6ea4-46e0-7fab-4480-e7b06ddf2de3",
Synchronized="2017-08-05 16:53:27.0")
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

@XendraTrl(Identifier="992c0ac1-015d-4446-1ff3-115856245ce1")
public static String es_PE_FIELD_Cashbook_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="992c0ac1-015d-4446-1ff3-115856245ce1")
public static String es_PE_FIELD_Cashbook_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="992c0ac1-015d-4446-1ff3-115856245ce1")
public static String es_PE_FIELD_Cashbook_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="29e338b6-943f-f41c-3329-e0d98f5de8f6",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="992c0ac1-015d-4446-1ff3-115856245ce1")
public static final String FIELDNAME_Cashbook_Name="992c0ac1-015d-4446-1ff3-115856245ce1";

@XendraTrl(Identifier="4039ae97-51d7-6220-4a06-1635ce3998f9")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4039ae97-51d7-6220-4a06-1635ce3998f9",
Synchronized="2017-08-05 16:53:27.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value != null && Value.length() > 40)
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
@XendraTrl(Identifier="6a451943-1de4-1d43-0aaf-a7d2a02a740b")
public static String es_PE_FIELD_Cashbook_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="6a451943-1de4-1d43-0aaf-a7d2a02a740b")
public static String es_PE_FIELD_Cashbook_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraTrl(Identifier="6a451943-1de4-1d43-0aaf-a7d2a02a740b")
public static String es_PE_FIELD_Cashbook_SearchKey_Name="Clave de Búsqueda";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="29e338b6-943f-f41c-3329-e0d98f5de8f6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6a451943-1de4-1d43-0aaf-a7d2a02a740b")
public static final String FIELDNAME_Cashbook_SearchKey="6a451943-1de4-1d43-0aaf-a7d2a02a740b";

@XendraTrl(Identifier="19d1d92c-5ccb-c551-49fc-fc986bc380c3")
public static String es_PE_COLUMN_Value_Name="Search Key";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="19d1d92c-5ccb-c551-49fc-fc986bc380c3",
Synchronized="2017-08-05 16:53:27.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
