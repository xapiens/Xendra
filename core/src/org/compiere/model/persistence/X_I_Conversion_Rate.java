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
/** Generated Model for I_Conversion_Rate
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_I_Conversion_Rate extends PO
{
/** Standard Constructor
@param ctx context
@param I_Conversion_Rate_ID id
@param trxName transaction
*/
public X_I_Conversion_Rate (Properties ctx, int I_Conversion_Rate_ID, String trxName)
{
super (ctx, I_Conversion_Rate_ID, trxName);
/** if (I_Conversion_Rate_ID == 0)
{
setI_Conversion_Rate_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_I_Conversion_Rate (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=641 */
public static int Table_ID=MTable.getTable_ID("I_Conversion_Rate");

@XendraTrl(Identifier="8d7bb25a-ca84-6e8d-78d8-2000c5075175")
public static String es_PE_TAB_ImportCurrencyRate_Description="Importar conversión de tasa de cambio";

@XendraTrl(Identifier="8d7bb25a-ca84-6e8d-78d8-2000c5075175")
public static String es_PE_TAB_ImportCurrencyRate_Name="Importar Tasa de Cambio";

@XendraTab(Name="Import Currency Rate",Description="Import Currency Conversion Rate",Help="",
AD_Window_ID="a669a6a6-6932-d6ac-6240-918e42bb33ed",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="8d7bb25a-ca84-6e8d-78d8-2000c5075175",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ImportCurrencyRate="8d7bb25a-ca84-6e8d-78d8-2000c5075175";

@XendraTrl(Identifier="ba162058-f972-81fd-f80b-c11edc53cee5")
public static String es_PE_TABLE_I_Conversion_Rate_Name="Importar Tabla de Equivalencias";


@XendraTable(Name="Import Conversion Rate",AD_Package_ID="645f34c0-ea3a-ac63-618d-8ca49873c33b",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Import Currency Conversion Rate",
Help="",TableName="I_Conversion_Rate",AccessLevel="6",
AD_Window_ID="a669a6a6-6932-d6ac-6240-918e42bb33ed",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.import",Identifier="ba162058-f972-81fd-f80b-c11edc53cee5",
Synchronized="2020-03-03 21:38:06.0")
/** TableName=I_Conversion_Rate */
public static final String Table_Name="I_Conversion_Rate";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"I_Conversion_Rate");

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
    Table_ID = MTable.getTable_ID("I_Conversion_Rate");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_I_Conversion_Rate[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Conversion Rate.
@param C_Conversion_Rate_ID Rate used for converting currencies */
public void setC_Conversion_Rate_ID (int C_Conversion_Rate_ID)
{
if (C_Conversion_Rate_ID <= 0) set_Value (COLUMNNAME_C_Conversion_Rate_ID, null);
 else 
set_Value (COLUMNNAME_C_Conversion_Rate_ID, Integer.valueOf(C_Conversion_Rate_ID));
}
/** Get Conversion Rate.
@return Rate used for converting currencies */
public int getC_Conversion_Rate_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Conversion_Rate_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8fc81ee4-1c97-fcb0-0d95-3459b318169b")
public static String es_PE_FIELD_ImportCurrencyRate_ConversionRate_Name="Tasa de Cambio";

@XendraTrl(Identifier="8fc81ee4-1c97-fcb0-0d95-3459b318169b")
public static String es_PE_FIELD_ImportCurrencyRate_ConversionRate_Description="Tasa usada para conversión de monedas";

@XendraTrl(Identifier="8fc81ee4-1c97-fcb0-0d95-3459b318169b")
public static String es_PE_FIELD_ImportCurrencyRate_ConversionRate_Help="La tasa de cambio define la tasa que se debe usar (multiplicando ó dividiendo) para convertir de una moneda a otra.";

@XendraField(AD_Column_ID="C_Conversion_Rate_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8d7bb25a-ca84-6e8d-78d8-2000c5075175",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8fc81ee4-1c97-fcb0-0d95-3459b318169b")
public static final String FIELDNAME_ImportCurrencyRate_ConversionRate="8fc81ee4-1c97-fcb0-0d95-3459b318169b";

@XendraTrl(Identifier="574d3cdd-d6dd-145d-77ce-8724554aa20c")
public static String es_PE_COLUMN_C_Conversion_Rate_ID_Name="Tasa de Cambio";

@XendraColumn(AD_Element_ID="7bef9385-08f5-1d95-b9a4-c748f80ccc59",
ColumnName="C_Conversion_Rate_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="574d3cdd-d6dd-145d-77ce-8724554aa20c",Synchronized="2019-08-30 22:22:47.0")
/** Column name C_Conversion_Rate_ID */
public static final String COLUMNNAME_C_Conversion_Rate_ID = "C_Conversion_Rate_ID";
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

@XendraTrl(Identifier="9ff06db2-5683-818e-82cb-f71c3f8c7ca8")
public static String es_PE_FIELD_ImportCurrencyRate_CurrencyType_Name="Tipo de Moneda";

@XendraTrl(Identifier="9ff06db2-5683-818e-82cb-f71c3f8c7ca8")
public static String es_PE_FIELD_ImportCurrencyRate_CurrencyType_Description="Tipo de índice de conversión de moneda ";

@XendraTrl(Identifier="9ff06db2-5683-818e-82cb-f71c3f8c7ca8")
public static String es_PE_FIELD_ImportCurrencyRate_CurrencyType_Help="El tipo del índice de conversión de monedas le deja definir diversos tipos de tarifas, tarifas ej. del punto, corporativas y/o de Ventas/Compras.";

@XendraField(AD_Column_ID="C_ConversionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8d7bb25a-ca84-6e8d-78d8-2000c5075175",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9ff06db2-5683-818e-82cb-f71c3f8c7ca8")
public static final String FIELDNAME_ImportCurrencyRate_CurrencyType="9ff06db2-5683-818e-82cb-f71c3f8c7ca8";

@XendraTrl(Identifier="31520e47-9be3-858c-99b4-d51238214207")
public static String es_PE_COLUMN_C_ConversionType_ID_Name="Tipo de Moneda";

@XendraColumn(AD_Element_ID="66f5d039-c94d-0957-487b-eb3118bd7719",
ColumnName="C_ConversionType_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="31520e47-9be3-858c-99b4-d51238214207",Synchronized="2019-08-30 22:22:47.0")
/** Column name C_ConversionType_ID */
public static final String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";
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

@XendraTrl(Identifier="93a37d3d-8fd0-a1d2-51c9-fc179711d765")
public static String es_PE_FIELD_ImportCurrencyRate_Currency_Name="Moneda";

@XendraTrl(Identifier="93a37d3d-8fd0-a1d2-51c9-fc179711d765")
public static String es_PE_FIELD_ImportCurrencyRate_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="93a37d3d-8fd0-a1d2-51c9-fc179711d765")
public static String es_PE_FIELD_ImportCurrencyRate_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8d7bb25a-ca84-6e8d-78d8-2000c5075175",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="93a37d3d-8fd0-a1d2-51c9-fc179711d765")
public static final String FIELDNAME_ImportCurrencyRate_Currency="93a37d3d-8fd0-a1d2-51c9-fc179711d765";

@XendraTrl(Identifier="7aed4fd3-81ff-22df-984b-d1aad88db13f")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7aed4fd3-81ff-22df-984b-d1aad88db13f",
Synchronized="2019-08-30 22:22:47.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Currency To.
@param C_Currency_ID_To Target currency */
public void setC_Currency_ID_To (int C_Currency_ID_To)
{
set_Value (COLUMNNAME_C_Currency_ID_To, Integer.valueOf(C_Currency_ID_To));
}
/** Get Currency To.
@return Target currency */
public int getC_Currency_ID_To() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID_To);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="95c6cf78-d126-a992-b4a5-7e910b7e1e08")
public static String es_PE_FIELD_ImportCurrencyRate_CurrencyTo_Name="A Moneda";

@XendraTrl(Identifier="95c6cf78-d126-a992-b4a5-7e910b7e1e08")
public static String es_PE_FIELD_ImportCurrencyRate_CurrencyTo_Description="Moneda a convertir.";

@XendraTrl(Identifier="95c6cf78-d126-a992-b4a5-7e910b7e1e08")
public static String es_PE_FIELD_ImportCurrencyRate_CurrencyTo_Help="La Moneda A define la moneda destino para esta tasa de conversión.";

@XendraField(AD_Column_ID="C_Currency_ID_To",IsCentrallyMaintained=true,
AD_Tab_ID="8d7bb25a-ca84-6e8d-78d8-2000c5075175",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="95c6cf78-d126-a992-b4a5-7e910b7e1e08")
public static final String FIELDNAME_ImportCurrencyRate_CurrencyTo="95c6cf78-d126-a992-b4a5-7e910b7e1e08";

@XendraTrl(Identifier="6f4153af-ecb6-8e2e-5a27-619406e1a8e2")
public static String es_PE_COLUMN_C_Currency_ID_To_Name="A Moneda";

@XendraColumn(AD_Element_ID="c0b694a2-f7ed-3e59-d263-713709d89af7",ColumnName="C_Currency_ID_To",
AD_Reference_ID=18,AD_Reference_Value_ID="f518e797-c49f-bc60-667a-48fd618f8ee8",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6f4153af-ecb6-8e2e-5a27-619406e1a8e2",Synchronized="2019-08-30 22:22:47.0")
/** Column name C_Currency_ID_To */
public static final String COLUMNNAME_C_Currency_ID_To = "C_Currency_ID_To";
/** Set Currency Type Key.
@param ConversionTypeValue Key value for the Currency Conversion Rate Type */
public void setConversionTypeValue (String ConversionTypeValue)
{
if (ConversionTypeValue != null && ConversionTypeValue.length() > 40)
{
log.warning("Length > 40 - truncated");
ConversionTypeValue = ConversionTypeValue.substring(0,39);
}
set_Value (COLUMNNAME_ConversionTypeValue, ConversionTypeValue);
}
/** Get Currency Type Key.
@return Key value for the Currency Conversion Rate Type */
public String getConversionTypeValue() 
{
String value = (String)get_Value(COLUMNNAME_ConversionTypeValue);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d35fdc09-0229-6eeb-11f2-2dfdef7a46ea")
public static String es_PE_FIELD_ImportCurrencyRate_CurrencyTypeKey_Name="Tipo de llave de Conversión";

@XendraTrl(Identifier="d35fdc09-0229-6eeb-11f2-2dfdef7a46ea")
public static String es_PE_FIELD_ImportCurrencyRate_CurrencyTypeKey_Description="Valor de la llave para el tipo del indice de conversión.";

@XendraTrl(Identifier="d35fdc09-0229-6eeb-11f2-2dfdef7a46ea")
public static String es_PE_FIELD_ImportCurrencyRate_CurrencyTypeKey_Help="El valor de tipo de llave para la conversión de las transacciones de moneda extranjera.";

@XendraField(AD_Column_ID="ConversionTypeValue",IsCentrallyMaintained=true,
AD_Tab_ID="8d7bb25a-ca84-6e8d-78d8-2000c5075175",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d35fdc09-0229-6eeb-11f2-2dfdef7a46ea")
public static final String FIELDNAME_ImportCurrencyRate_CurrencyTypeKey="d35fdc09-0229-6eeb-11f2-2dfdef7a46ea";

@XendraTrl(Identifier="3f9eb8d1-4bc5-ec52-93d9-d7c527f1b323")
public static String es_PE_COLUMN_ConversionTypeValue_Name="Tipo de llave de Conversión";

@XendraColumn(AD_Element_ID="db98d8a9-d136-fa56-ebbe-e540f17d6655",
ColumnName="ConversionTypeValue",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=40,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3f9eb8d1-4bc5-ec52-93d9-d7c527f1b323",Synchronized="2019-08-30 22:22:47.0")
/** Column name ConversionTypeValue */
public static final String COLUMNNAME_ConversionTypeValue = "ConversionTypeValue";
/** Set Create Reciprocal Rate.
@param CreateReciprocalRate Create Reciprocal Rate from current information */
public void setCreateReciprocalRate (boolean CreateReciprocalRate)
{
set_Value (COLUMNNAME_CreateReciprocalRate, Boolean.valueOf(CreateReciprocalRate));
}
/** Get Create Reciprocal Rate.
@return Create Reciprocal Rate from current information */
public boolean isCreateReciprocalRate() 
{
Object oo = get_Value(COLUMNNAME_CreateReciprocalRate);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="0e5b6d10-6aec-315e-b2d9-2ad12f430cfa")
public static String es_PE_FIELD_ImportCurrencyRate_CreateReciprocalRate_Name="Crear Proporción Reciproca";

@XendraTrl(Identifier="0e5b6d10-6aec-315e-b2d9-2ad12f430cfa")
public static String es_PE_FIELD_ImportCurrencyRate_CreateReciprocalRate_Description="Crear proporción reciproca desde la información actual";

@XendraTrl(Identifier="0e5b6d10-6aec-315e-b2d9-2ad12f430cfa")
public static String es_PE_FIELD_ImportCurrencyRate_CreateReciprocalRate_Help="Si está seleccionada, la tarifa importada Usd->eur se utiliza para crear/calcular la tarifa recíproca Eur->usd. ";

@XendraField(AD_Column_ID="CreateReciprocalRate",IsCentrallyMaintained=true,
AD_Tab_ID="8d7bb25a-ca84-6e8d-78d8-2000c5075175",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0e5b6d10-6aec-315e-b2d9-2ad12f430cfa")
public static final String FIELDNAME_ImportCurrencyRate_CreateReciprocalRate="0e5b6d10-6aec-315e-b2d9-2ad12f430cfa";

@XendraTrl(Identifier="a6d0888a-554a-5680-3f82-53326fa4120e")
public static String es_PE_COLUMN_CreateReciprocalRate_Name="Crear Proporción Reciproca";

@XendraColumn(AD_Element_ID="3ff36d3c-eb36-0c7f-0eeb-674fb4d815df",
ColumnName="CreateReciprocalRate",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a6d0888a-554a-5680-3f82-53326fa4120e",Synchronized="2019-08-30 22:22:47.0")
/** Column name CreateReciprocalRate */
public static final String COLUMNNAME_CreateReciprocalRate = "CreateReciprocalRate";
/** Set Divide Rate.
@param DivideRate To convert Source number to Target number, the Source is divided */
public void setDivideRate (BigDecimal DivideRate)
{
set_Value (COLUMNNAME_DivideRate, DivideRate);
}
/** Get Divide Rate.
@return To convert Source number to Target number, the Source is divided */
public BigDecimal getDivideRate() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_DivideRate);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="5f3c69cb-141d-1085-6859-2cf3142b5c8e")
public static String es_PE_FIELD_ImportCurrencyRate_DivideRate_Name="Tasa Divisora";

@XendraTrl(Identifier="5f3c69cb-141d-1085-6859-2cf3142b5c8e")
public static String es_PE_FIELD_ImportCurrencyRate_DivideRate_Description="Convierte el número fuente a número destino; el fuente entre el número divisor.";

@XendraTrl(Identifier="5f3c69cb-141d-1085-6859-2cf3142b5c8e")
public static String es_PE_FIELD_ImportCurrencyRate_DivideRate_Help="Para convertir el número fuente a número destino; la fuente es dividida entre la tasa divisora. Si usted introduce una tasa divisora; la tasa multiplicadora será calculada automáticamente;";

@XendraField(AD_Column_ID="DivideRate",IsCentrallyMaintained=true,
AD_Tab_ID="8d7bb25a-ca84-6e8d-78d8-2000c5075175",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5f3c69cb-141d-1085-6859-2cf3142b5c8e")
public static final String FIELDNAME_ImportCurrencyRate_DivideRate="5f3c69cb-141d-1085-6859-2cf3142b5c8e";

@XendraTrl(Identifier="9276b2cd-0331-3d1d-900a-7f32f807cf39")
public static String es_PE_COLUMN_DivideRate_Name="Tasa Divisora";

@XendraColumn(AD_Element_ID="1a9c1cdd-c0a8-f71b-09ec-c1e93b1b7b06",ColumnName="DivideRate",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9276b2cd-0331-3d1d-900a-7f32f807cf39",
Synchronized="2019-08-30 22:22:47.0")
/** Column name DivideRate */
public static final String COLUMNNAME_DivideRate = "DivideRate";
/** Set Import Conversion Rate.
@param I_Conversion_Rate_ID Import Currency Conversion Rate */
public void setI_Conversion_Rate_ID (int I_Conversion_Rate_ID)
{
if (I_Conversion_Rate_ID < 1) throw new IllegalArgumentException ("I_Conversion_Rate_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_I_Conversion_Rate_ID, Integer.valueOf(I_Conversion_Rate_ID));
}
/** Get Import Conversion Rate.
@return Import Currency Conversion Rate */
public int getI_Conversion_Rate_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_I_Conversion_Rate_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getI_Conversion_Rate_ID()));
}

@XendraTrl(Identifier="5875b7e2-6f79-fdce-15fc-d2397405bfdf")
public static String es_PE_FIELD_ImportCurrencyRate_ImportConversionRate_Name="Importar Tabla de Equivalencias";

@XendraTrl(Identifier="5875b7e2-6f79-fdce-15fc-d2397405bfdf")
public static String es_PE_FIELD_ImportCurrencyRate_ImportConversionRate_Description="Importar moneda de conversión";

@XendraField(AD_Column_ID="I_Conversion_Rate_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8d7bb25a-ca84-6e8d-78d8-2000c5075175",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="1=2",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5875b7e2-6f79-fdce-15fc-d2397405bfdf")
public static final String FIELDNAME_ImportCurrencyRate_ImportConversionRate="5875b7e2-6f79-fdce-15fc-d2397405bfdf";
/** Column name I_Conversion_Rate_ID */
public static final String COLUMNNAME_I_Conversion_Rate_ID = "I_Conversion_Rate_ID";
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
@XendraTrl(Identifier="f147def5-ca7b-412c-bdae-ee3e9aa52e82")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f147def5-ca7b-412c-bdae-ee3e9aa52e82",
Synchronized="2019-08-30 22:22:47.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Import Error Message.
@param I_ErrorMsg Messages generated from import process */
public void setI_ErrorMsg (String I_ErrorMsg)
{
if (I_ErrorMsg != null && I_ErrorMsg.length() > 2000)
{
log.warning("Length > 2000 - truncated");
I_ErrorMsg = I_ErrorMsg.substring(0,1999);
}
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
@XendraTrl(Identifier="5812d51a-d507-0262-4f6f-845898de2c0a")
public static String es_PE_FIELD_ImportCurrencyRate_ImportErrorMessage_Name="Mensajes de Error al Importar";

@XendraTrl(Identifier="5812d51a-d507-0262-4f6f-845898de2c0a")
public static String es_PE_FIELD_ImportCurrencyRate_ImportErrorMessage_Description="Mensajes generados desde procesos de importación";

@XendraTrl(Identifier="5812d51a-d507-0262-4f6f-845898de2c0a")
public static String es_PE_FIELD_ImportCurrencyRate_ImportErrorMessage_Help="El mensaje de error de Importación despliega cualquier mensaje de error generado durante el proceso de importación.";

@XendraField(AD_Column_ID="I_ErrorMsg",IsCentrallyMaintained=true,
AD_Tab_ID="8d7bb25a-ca84-6e8d-78d8-2000c5075175",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5812d51a-d507-0262-4f6f-845898de2c0a")
public static final String FIELDNAME_ImportCurrencyRate_ImportErrorMessage="5812d51a-d507-0262-4f6f-845898de2c0a";

@XendraTrl(Identifier="94ca57ca-74a8-a24a-7e71-8792606c06df")
public static String es_PE_COLUMN_I_ErrorMsg_Name="Mensajes de Error al Importar";

@XendraColumn(AD_Element_ID="e512e524-25c8-eddd-ad88-d2ce6b66fdc7",ColumnName="I_ErrorMsg",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="94ca57ca-74a8-a24a-7e71-8792606c06df",
Synchronized="2019-08-30 22:22:47.0")
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

@XendraTrl(Identifier="d40ed691-7b84-7b95-0e70-496c5405c35b")
public static String es_PE_FIELD_ImportCurrencyRate_Imported_Name="Importar";

@XendraTrl(Identifier="d40ed691-7b84-7b95-0e70-496c5405c35b")
public static String es_PE_FIELD_ImportCurrencyRate_Imported_Description="Esta importación ha sido procesada";

@XendraTrl(Identifier="d40ed691-7b84-7b95-0e70-496c5405c35b")
public static String es_PE_FIELD_ImportCurrencyRate_Imported_Help="El cuadro de verificación Importado indica si esta importación ha sido procesada";

@XendraField(AD_Column_ID="I_IsImported",IsCentrallyMaintained=true,
AD_Tab_ID="8d7bb25a-ca84-6e8d-78d8-2000c5075175",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=20,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d40ed691-7b84-7b95-0e70-496c5405c35b")
public static final String FIELDNAME_ImportCurrencyRate_Imported="d40ed691-7b84-7b95-0e70-496c5405c35b";

@XendraTrl(Identifier="49116e7d-0082-3980-2071-7a91fae1be9e")
public static String es_PE_COLUMN_I_IsImported_Name="Importar";

@XendraColumn(AD_Element_ID="f4939725-7d85-767d-540d-feafa759184b",ColumnName="I_IsImported",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="49116e7d-0082-3980-2071-7a91fae1be9e",
Synchronized="2019-08-30 22:22:47.0")
/** Column name I_IsImported */
public static final String COLUMNNAME_I_IsImported = "I_IsImported";
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
String value = (String)get_Value(COLUMNNAME_ISO_Code);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="44527971-58b1-fd02-5c34-9bd66d4d031f")
public static String es_PE_FIELD_ImportCurrencyRate_ISOCurrencyCode_Name="Código ISO";

@XendraTrl(Identifier="44527971-58b1-fd02-5c34-9bd66d4d031f")
public static String es_PE_FIELD_ImportCurrencyRate_ISOCurrencyCode_Description="Código ISO 4217 de la moneda";

@XendraTrl(Identifier="44527971-58b1-fd02-5c34-9bd66d4d031f")
public static String es_PE_FIELD_ImportCurrencyRate_ISOCurrencyCode_Help="Para detalles ver - http://www.unece.org/trade/rec/rec09en.htm";

@XendraField(AD_Column_ID="ISO_Code",IsCentrallyMaintained=true,
AD_Tab_ID="8d7bb25a-ca84-6e8d-78d8-2000c5075175",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=5,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="44527971-58b1-fd02-5c34-9bd66d4d031f")
public static final String FIELDNAME_ImportCurrencyRate_ISOCurrencyCode="44527971-58b1-fd02-5c34-9bd66d4d031f";

@XendraTrl(Identifier="375e1e51-37ad-e823-29f5-d5ad3ef23f99")
public static String es_PE_COLUMN_ISO_Code_Name="Código ISO";

@XendraColumn(AD_Element_ID="0770c1a3-36f8-0fc9-bd56-a563b64128ee",ColumnName="ISO_Code",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=3,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="375e1e51-37ad-e823-29f5-d5ad3ef23f99",
Synchronized="2019-08-30 22:22:47.0")
/** Column name ISO_Code */
public static final String COLUMNNAME_ISO_Code = "ISO_Code";
/** Set ISO Currency To Code.
@param ISO_Code_To Three letter ISO 4217 Code of the To Currency */
public void setISO_Code_To (String ISO_Code_To)
{
if (ISO_Code_To != null && ISO_Code_To.length() > 3)
{
log.warning("Length > 3 - truncated");
ISO_Code_To = ISO_Code_To.substring(0,2);
}
set_Value (COLUMNNAME_ISO_Code_To, ISO_Code_To);
}
/** Get ISO Currency To Code.
@return Three letter ISO 4217 Code of the To Currency */
public String getISO_Code_To() 
{
String value = (String)get_Value(COLUMNNAME_ISO_Code_To);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="0c0f75e2-e76a-7015-11d0-1072d64c182e")
public static String es_PE_FIELD_ImportCurrencyRate_ISOCurrencyToCode_Name="Codigo ISO actual de Moneda";

@XendraTrl(Identifier="0c0f75e2-e76a-7015-11d0-1072d64c182e")
public static String es_PE_FIELD_ImportCurrencyRate_ISOCurrencyToCode_Description="Tres letras ISO 4217 código actual para la moneda";

@XendraTrl(Identifier="0c0f75e2-e76a-7015-11d0-1072d64c182e")
public static String es_PE_FIELD_ImportCurrencyRate_ISOCurrencyToCode_Help="Para detalles ver - http://www.unece.org/trade/rec/rec09en.htm";

@XendraField(AD_Column_ID="ISO_Code_To",IsCentrallyMaintained=true,
AD_Tab_ID="8d7bb25a-ca84-6e8d-78d8-2000c5075175",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=5,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0c0f75e2-e76a-7015-11d0-1072d64c182e")
public static final String FIELDNAME_ImportCurrencyRate_ISOCurrencyToCode="0c0f75e2-e76a-7015-11d0-1072d64c182e";

@XendraTrl(Identifier="78d5d2fd-0a94-1e5a-271f-03684a1d6924")
public static String es_PE_COLUMN_ISO_Code_To_Name="Codigo ISO actual de Moneda";

@XendraColumn(AD_Element_ID="86c3dacd-bc0e-8e0c-5241-45b1419aef2d",ColumnName="ISO_Code_To",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=3,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="78d5d2fd-0a94-1e5a-271f-03684a1d6924",
Synchronized="2019-08-30 22:22:47.0")
/** Column name ISO_Code_To */
public static final String COLUMNNAME_ISO_Code_To = "ISO_Code_To";
/** Set Multiply Rate.
@param MultiplyRate Rate to multiple the source by to calculate the target. */
public void setMultiplyRate (BigDecimal MultiplyRate)
{
set_Value (COLUMNNAME_MultiplyRate, MultiplyRate);
}
/** Get Multiply Rate.
@return Rate to multiple the source by to calculate the target. */
public BigDecimal getMultiplyRate() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MultiplyRate);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="22d6c368-4436-7209-66ae-e5745daa7282")
public static String es_PE_FIELD_ImportCurrencyRate_MultiplyRate_Name="Tasa Multiplicadora";

@XendraTrl(Identifier="22d6c368-4436-7209-66ae-e5745daa7282")
public static String es_PE_FIELD_ImportCurrencyRate_MultiplyRate_Description="Tasa por la que se multiplica la fuente para encontrar el objetivo";

@XendraTrl(Identifier="22d6c368-4436-7209-66ae-e5745daa7282")
public static String es_PE_FIELD_ImportCurrencyRate_MultiplyRate_Help="Para convertir un número fuente a un número destino el fuente es multiplicado por la tasa multiplicadora. Si la tasa multiplicadora es introducida; entonces la tasa divisora será calculada automáticamente.";

@XendraField(AD_Column_ID="MultiplyRate",IsCentrallyMaintained=true,
AD_Tab_ID="8d7bb25a-ca84-6e8d-78d8-2000c5075175",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="22d6c368-4436-7209-66ae-e5745daa7282")
public static final String FIELDNAME_ImportCurrencyRate_MultiplyRate="22d6c368-4436-7209-66ae-e5745daa7282";

@XendraTrl(Identifier="897deca6-b748-1fb6-3ce0-fc536e930619")
public static String es_PE_COLUMN_MultiplyRate_Name="Tasa Multiplicadora";

@XendraColumn(AD_Element_ID="01f1ea55-fcce-bdc6-b676-8dbecf680a30",ColumnName="MultiplyRate",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="897deca6-b748-1fb6-3ce0-fc536e930619",
Synchronized="2019-08-30 22:22:47.0")
/** Column name MultiplyRate */
public static final String COLUMNNAME_MultiplyRate = "MultiplyRate";
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

@XendraTrl(Identifier="8296ee57-64b9-dec7-481d-20119d621850")
public static String es_PE_FIELD_ImportCurrencyRate_Processed_Name="Procesado";

@XendraTrl(Identifier="8296ee57-64b9-dec7-481d-20119d621850")
public static String es_PE_FIELD_ImportCurrencyRate_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="8296ee57-64b9-dec7-481d-20119d621850")
public static String es_PE_FIELD_ImportCurrencyRate_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="8d7bb25a-ca84-6e8d-78d8-2000c5075175",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=200,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8296ee57-64b9-dec7-481d-20119d621850")
public static final String FIELDNAME_ImportCurrencyRate_Processed="8296ee57-64b9-dec7-481d-20119d621850";

@XendraTrl(Identifier="bcf997af-fcdf-3837-04fc-ba83e0bf2a33")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bcf997af-fcdf-3837-04fc-ba83e0bf2a33",
Synchronized="2019-08-30 22:22:47.0")
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

@XendraTrl(Identifier="0ea98759-aebd-289e-c383-0ba9bafcd338")
public static String es_PE_FIELD_ImportCurrencyRate_ProcessNow_Name="Importar Tarifa de Conversión";

@XendraTrl(Identifier="0ea98759-aebd-289e-c383-0ba9bafcd338")
public static String es_PE_FIELD_ImportCurrencyRate_ProcessNow_Description="Importar Tarifa de Conversión";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="8d7bb25a-ca84-6e8d-78d8-2000c5075175",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0ea98759-aebd-289e-c383-0ba9bafcd338")
public static final String FIELDNAME_ImportCurrencyRate_ProcessNow="0ea98759-aebd-289e-c383-0ba9bafcd338";

@XendraTrl(Identifier="fa8e4ce1-c522-94bb-c49b-a9e030e29470")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="3c05dbc0-c245-594c-a89d-62bdd49ce0b2",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="fa8e4ce1-c522-94bb-c49b-a9e030e29470",Synchronized="2019-08-30 22:22:47.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Valid from.
@param ValidFrom Valid from including this date (first day) */
public void setValidFrom (Timestamp ValidFrom)
{
set_Value (COLUMNNAME_ValidFrom, ValidFrom);
}
/** Get Valid from.
@return Valid from including this date (first day) */
public Timestamp getValidFrom() 
{
return (Timestamp)get_Value(COLUMNNAME_ValidFrom);
}

@XendraTrl(Identifier="dbce78b7-9d4a-f4a6-542c-f60bbf4c217d")
public static String es_PE_FIELD_ImportCurrencyRate_ValidFrom_Name="Válido Desde";

@XendraTrl(Identifier="dbce78b7-9d4a-f4a6-542c-f60bbf4c217d")
public static String es_PE_FIELD_ImportCurrencyRate_ValidFrom_Description="Válido desde; incluyendo esta fecha (primer día)";

@XendraTrl(Identifier="dbce78b7-9d4a-f4a6-542c-f60bbf4c217d")
public static String es_PE_FIELD_ImportCurrencyRate_ValidFrom_Help="La fecha válida desde indica el primer día de un rango de fechas";

@XendraField(AD_Column_ID="ValidFrom",IsCentrallyMaintained=true,
AD_Tab_ID="8d7bb25a-ca84-6e8d-78d8-2000c5075175",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dbce78b7-9d4a-f4a6-542c-f60bbf4c217d")
public static final String FIELDNAME_ImportCurrencyRate_ValidFrom="dbce78b7-9d4a-f4a6-542c-f60bbf4c217d";

@XendraTrl(Identifier="60078be7-0ac0-8300-1c5b-d33caae3ed9d")
public static String es_PE_COLUMN_ValidFrom_Name="Válido Desde";

@XendraColumn(AD_Element_ID="86b1171a-a6c6-0da5-1aea-3f3106450d07",ColumnName="ValidFrom",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="60078be7-0ac0-8300-1c5b-d33caae3ed9d",
Synchronized="2019-08-30 22:22:47.0")
/** Column name ValidFrom */
public static final String COLUMNNAME_ValidFrom = "ValidFrom";
/** Set Valid to.
@param ValidTo Valid to including this date (last day) */
public void setValidTo (Timestamp ValidTo)
{
set_Value (COLUMNNAME_ValidTo, ValidTo);
}
/** Get Valid to.
@return Valid to including this date (last day) */
public Timestamp getValidTo() 
{
return (Timestamp)get_Value(COLUMNNAME_ValidTo);
}

@XendraTrl(Identifier="86bc0a21-2db5-12fa-e3cb-e470ba100c73")
public static String es_PE_FIELD_ImportCurrencyRate_ValidTo_Name="Válido Hasta";

@XendraTrl(Identifier="86bc0a21-2db5-12fa-e3cb-e470ba100c73")
public static String es_PE_FIELD_ImportCurrencyRate_ValidTo_Description="Válido hasta; incluyendo esta fecha (ultimo día)";

@XendraTrl(Identifier="86bc0a21-2db5-12fa-e3cb-e470ba100c73")
public static String es_PE_FIELD_ImportCurrencyRate_ValidTo_Help="La fecha válida hasta indica el último día de un rango de fechas";

@XendraField(AD_Column_ID="ValidTo",IsCentrallyMaintained=true,
AD_Tab_ID="8d7bb25a-ca84-6e8d-78d8-2000c5075175",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="86bc0a21-2db5-12fa-e3cb-e470ba100c73")
public static final String FIELDNAME_ImportCurrencyRate_ValidTo="86bc0a21-2db5-12fa-e3cb-e470ba100c73";

@XendraTrl(Identifier="b34260e3-3232-cf08-cd80-2a8114e9fa08")
public static String es_PE_COLUMN_ValidTo_Name="Válido Hasta";

@XendraColumn(AD_Element_ID="0fbe43c3-c76d-0505-0043-63adb568a68f",ColumnName="ValidTo",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b34260e3-3232-cf08-cd80-2a8114e9fa08",
Synchronized="2019-08-30 22:22:47.0")
/** Column name ValidTo */
public static final String COLUMNNAME_ValidTo = "ValidTo";
}
