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
/** Generated Model for C_Conversion_Rate
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Conversion_Rate extends PO
{
/** Standard Constructor
@param ctx context
@param C_Conversion_Rate_ID id
@param trxName transaction
*/
public X_C_Conversion_Rate (Properties ctx, int C_Conversion_Rate_ID, String trxName)
{
super (ctx, C_Conversion_Rate_ID, trxName);
/** if (C_Conversion_Rate_ID == 0)
{
setC_Conversion_Rate_ID (0);
setC_ConversionType_ID (0);
setC_Currency_ID (0);
setC_Currency_ID_To (0);
setDivideRate (Env.ZERO);
setMultiplyRate (Env.ZERO);
setValidFrom (new Timestamp(System.currentTimeMillis()));
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_Conversion_Rate (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=140 */
public static int Table_ID=MTable.getTable_ID("C_Conversion_Rate");

@XendraTrl(Identifier="ca1bb2e2-7758-6994-2899-a14871347637")
public static String es_PE_TAB_ConversionRate_Description="Definir tasas de cambio";

@XendraTrl(Identifier="ca1bb2e2-7758-6994-2899-a14871347637")
public static String es_PE_TAB_ConversionRate_Name="Tasa de Cambio";

@XendraTrl(Identifier="ca1bb2e2-7758-6994-2899-a14871347637")
public static String es_PE_TAB_ConversionRate_Help="La pestaña de tasas de cambio es usada para definir tasas de cambio a ser usadas cuando se convierten Totales de documentos de una moneda a otra. Las tasas de cambio pueden ser definidas para tipos de tasas múltiples. También pueden ser efectivas para un rango definido de fechas.";

@XendraTab(Name="Conversion Rate",Description="Define Currency Conversion Rates",
Help="The Conversion Rates tab is used to define conversion rates to be used when converting document amounts from one currency to another.  Conversion rates can be defined for multiple rate types.  They can also be effective for a defined range of dates. Note that only the multiply rate is used: The divide rate is for visualization only.",
AD_Window_ID="b6e8f4c8-93af-5b91-a6c0-4033bd82f2ac",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="ca1bb2e2-7758-6994-2899-a14871347637",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ConversionRate="ca1bb2e2-7758-6994-2899-a14871347637";

@XendraTrl(Identifier="9c9a7769-2604-db53-4780-20a716cd516e")
public static String es_PE_TAB_ConversionRates_Description="Definir tasas de cambio";

@XendraTrl(Identifier="9c9a7769-2604-db53-4780-20a716cd516e")
public static String es_PE_TAB_ConversionRates_Name="Tasas de Cambio";

@XendraTrl(Identifier="9c9a7769-2604-db53-4780-20a716cd516e")
public static String es_PE_TAB_ConversionRates_Help="La pestaña de tasa de cambio define las tasas a ser usadas cuando se convierte una moneda fuente a una moneda contable ó de Informe.";

@XendraTab(Name="Conversion Rates",Description="Define currency conversion rates",
Help="The Conversion Rate Tab defines the rates to use when converting a source currency to an accounting or reporting currency. Note that only the multiply rate is used: The divide rate is for visualization only.",
AD_Window_ID="69518fbe-add4-e240-8d5a-c664ddd2ccd1",SeqNo=40,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="6635269a-8ade-2fcf-558b-58bcd3056975",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="9c9a7769-2604-db53-4780-20a716cd516e",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ConversionRates="9c9a7769-2604-db53-4780-20a716cd516e";

@XendraTrl(Identifier="5357d361-585d-d83e-5087-3c2bb2ce66b9")
public static String es_PE_TABLE_C_Conversion_Rate_Name="Tasa de Cambio";

@XendraTable(Name="Conversion Rate",Description="Rate used for converting currencies",Help="",
TableName="C_Conversion_Rate",AccessLevel="6",AD_Window_ID="b6e8f4c8-93af-5b91-a6c0-4033bd82f2ac",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="5357d361-585d-d83e-5087-3c2bb2ce66b9",Synchronized="2017-08-16 11:41:40.0")
/** TableName=C_Conversion_Rate */
public static final String Table_Name="C_Conversion_Rate";


@XendraIndex(Name="c_conversionrate_once",Identifier="52bc782e-c20c-34c2-dba2-2bd9fd03f22e",
Column_Names="ad_client_id, ad_org_id, c_currency_id, c_currency_id_to, c_conversiontype_id, validfrom",
IsUnique="false",TableIdentifier="52bc782e-c20c-34c2-dba2-2bd9fd03f22e",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_conversionrate_once = "52bc782e-c20c-34c2-dba2-2bd9fd03f22e";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Conversion_Rate");

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
    Table_ID = MTable.getTable_ID("C_Conversion_Rate");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Conversion_Rate[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Conversion Rate.
@param C_Conversion_Rate_ID Rate used for converting currencies */
public void setC_Conversion_Rate_ID (int C_Conversion_Rate_ID)
{
if (C_Conversion_Rate_ID < 1) throw new IllegalArgumentException ("C_Conversion_Rate_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Conversion_Rate_ID, Integer.valueOf(C_Conversion_Rate_ID));
}
/** Get Conversion Rate.
@return Rate used for converting currencies */
public int getC_Conversion_Rate_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Conversion_Rate_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getC_Conversion_Rate_ID()));
}

@XendraTrl(Identifier="60ef79aa-7ed1-7fc3-07c1-bfd1c480c713")
public static String es_PE_FIELD_ConversionRates_ConversionRate_Description="Tasa usada para conversión de monedas";

@XendraTrl(Identifier="60ef79aa-7ed1-7fc3-07c1-bfd1c480c713")
public static String es_PE_FIELD_ConversionRates_ConversionRate_Help="La tasa de cambio define la tasa que se debe usar (multiplicando ó dividiendo) para convertir de una moneda a otra.";

@XendraTrl(Identifier="60ef79aa-7ed1-7fc3-07c1-bfd1c480c713")
public static String es_PE_FIELD_ConversionRates_ConversionRate_Name="Tasa de Cambio";

@XendraField(AD_Column_ID="C_Conversion_Rate_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c9a7769-2604-db53-4780-20a716cd516e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="60ef79aa-7ed1-7fc3-07c1-bfd1c480c713")
public static final String FIELDNAME_ConversionRates_ConversionRate="60ef79aa-7ed1-7fc3-07c1-bfd1c480c713";

@XendraTrl(Identifier="c54e3dbb-1310-cb94-9d22-3ca3885da573")
public static String es_PE_FIELD_ConversionRate_ConversionRate_Description="Tasa usada para conversión de monedas";

@XendraTrl(Identifier="c54e3dbb-1310-cb94-9d22-3ca3885da573")
public static String es_PE_FIELD_ConversionRate_ConversionRate_Help="La tasa de cambio define la tasa que se debe usar (multiplicando ó dividiendo) para convertir de una moneda a otra.";

@XendraTrl(Identifier="c54e3dbb-1310-cb94-9d22-3ca3885da573")
public static String es_PE_FIELD_ConversionRate_ConversionRate_Name="Tasa de Cambio";

@XendraField(AD_Column_ID="C_Conversion_Rate_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ca1bb2e2-7758-6994-2899-a14871347637",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c54e3dbb-1310-cb94-9d22-3ca3885da573")
public static final String FIELDNAME_ConversionRate_ConversionRate="c54e3dbb-1310-cb94-9d22-3ca3885da573";
/** Column name C_Conversion_Rate_ID */
public static final String COLUMNNAME_C_Conversion_Rate_ID = "C_Conversion_Rate_ID";
/** Set Currency Type.
@param C_ConversionType_ID Currency Conversion Rate Type */
public void setC_ConversionType_ID (int C_ConversionType_ID)
{
if (C_ConversionType_ID < 1) throw new IllegalArgumentException ("C_ConversionType_ID is mandatory.");
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

@XendraTrl(Identifier="de1e86b3-1bda-34cf-f852-ff2eb585aa5b")
public static String es_PE_FIELD_ConversionRates_CurrencyType_Description="Tipo de índice de conversión de moneda ";

@XendraTrl(Identifier="de1e86b3-1bda-34cf-f852-ff2eb585aa5b")
public static String es_PE_FIELD_ConversionRates_CurrencyType_Help="El tipo del índice de conversión de monedas le deja definir diversos tipos de tarifas, tarifas ej. del punto, corporativas y/o de Ventas/Compras.";

@XendraTrl(Identifier="de1e86b3-1bda-34cf-f852-ff2eb585aa5b")
public static String es_PE_FIELD_ConversionRates_CurrencyType_Name="Tipo de Moneda";

@XendraField(AD_Column_ID="C_ConversionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c9a7769-2604-db53-4780-20a716cd516e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="de1e86b3-1bda-34cf-f852-ff2eb585aa5b")
public static final String FIELDNAME_ConversionRates_CurrencyType="de1e86b3-1bda-34cf-f852-ff2eb585aa5b";

@XendraTrl(Identifier="5c9ce70d-3cc5-501e-5785-d010bcff4661")
public static String es_PE_FIELD_ConversionRate_CurrencyType_Description="Tipo de índice de conversión de moneda ";

@XendraTrl(Identifier="5c9ce70d-3cc5-501e-5785-d010bcff4661")
public static String es_PE_FIELD_ConversionRate_CurrencyType_Help="El tipo del índice de conversión de monedas le deja definir diversos tipos de tarifas, tarifas ej. del punto, corporativas y/o de Ventas/Compras.";

@XendraTrl(Identifier="5c9ce70d-3cc5-501e-5785-d010bcff4661")
public static String es_PE_FIELD_ConversionRate_CurrencyType_Name="Tipo de Moneda";

@XendraField(AD_Column_ID="C_ConversionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ca1bb2e2-7758-6994-2899-a14871347637",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5c9ce70d-3cc5-501e-5785-d010bcff4661")
public static final String FIELDNAME_ConversionRate_CurrencyType="5c9ce70d-3cc5-501e-5785-d010bcff4661";

@XendraTrl(Identifier="8b1d2d9b-fba3-4246-98d9-1553713430b5")
public static String es_PE_COLUMN_C_ConversionType_ID_Name="Tipo de Moneda";

@XendraColumn(AD_Element_ID="66f5d039-c94d-0957-487b-eb3118bd7719",
ColumnName="C_ConversionType_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8b1d2d9b-fba3-4246-98d9-1553713430b5",Synchronized="2017-08-05 16:53:32.0")
/** Column name C_ConversionType_ID */
public static final String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";

/** C_Currency_ID AD_Reference=f518e797-c49f-bc60-667a-48fd618f8ee8 */
public static final int C_CURRENCY_ID_AD_Reference_ID=112;
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

@XendraTrl(Identifier="64633c0f-bdc7-fa64-d8ca-96e8fcc43ab5")
public static String es_PE_FIELD_ConversionRates_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="64633c0f-bdc7-fa64-d8ca-96e8fcc43ab5")
public static String es_PE_FIELD_ConversionRates_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="64633c0f-bdc7-fa64-d8ca-96e8fcc43ab5")
public static String es_PE_FIELD_ConversionRates_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c9a7769-2604-db53-4780-20a716cd516e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsEMUMember@=N",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="64633c0f-bdc7-fa64-d8ca-96e8fcc43ab5")
public static final String FIELDNAME_ConversionRates_Currency="64633c0f-bdc7-fa64-d8ca-96e8fcc43ab5";

@XendraTrl(Identifier="08555aec-6e8f-4cc6-3081-547ba6b4d38d")
public static String es_PE_FIELD_ConversionRate_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="08555aec-6e8f-4cc6-3081-547ba6b4d38d")
public static String es_PE_FIELD_ConversionRate_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="08555aec-6e8f-4cc6-3081-547ba6b4d38d")
public static String es_PE_FIELD_ConversionRate_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ca1bb2e2-7758-6994-2899-a14871347637",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="08555aec-6e8f-4cc6-3081-547ba6b4d38d")
public static final String FIELDNAME_ConversionRate_Currency="08555aec-6e8f-4cc6-3081-547ba6b4d38d";

@XendraTrl(Identifier="6635269a-8ade-2fcf-558b-58bcd3056975")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="f518e797-c49f-bc60-667a-48fd618f8ee8",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6635269a-8ade-2fcf-558b-58bcd3056975",Synchronized="2017-08-05 16:53:32.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";

/** C_Currency_ID_To AD_Reference=f518e797-c49f-bc60-667a-48fd618f8ee8 */
public static final int C_CURRENCY_ID_TO_AD_Reference_ID=112;
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

@XendraTrl(Identifier="22f70e16-ec74-4821-11bb-d6c95a738860")
public static String es_PE_FIELD_ConversionRates_CurrencyTo_Description="Moneda a convertir.";

@XendraTrl(Identifier="22f70e16-ec74-4821-11bb-d6c95a738860")
public static String es_PE_FIELD_ConversionRates_CurrencyTo_Help="La Moneda A define la moneda destino para esta tasa de conversión.";

@XendraTrl(Identifier="22f70e16-ec74-4821-11bb-d6c95a738860")
public static String es_PE_FIELD_ConversionRates_CurrencyTo_Name="A Moneda";

@XendraField(AD_Column_ID="C_Currency_ID_To",IsCentrallyMaintained=true,
AD_Tab_ID="9c9a7769-2604-db53-4780-20a716cd516e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsEMUMember@=N",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=2,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="22f70e16-ec74-4821-11bb-d6c95a738860")
public static final String FIELDNAME_ConversionRates_CurrencyTo="22f70e16-ec74-4821-11bb-d6c95a738860";

@XendraTrl(Identifier="f11fc416-3e53-80ae-98ff-cee372273045")
public static String es_PE_FIELD_ConversionRate_CurrencyTo_Description="Moneda a convertir.";

@XendraTrl(Identifier="f11fc416-3e53-80ae-98ff-cee372273045")
public static String es_PE_FIELD_ConversionRate_CurrencyTo_Help="La Moneda A define la moneda destino para esta tasa de conversión.";

@XendraTrl(Identifier="f11fc416-3e53-80ae-98ff-cee372273045")
public static String es_PE_FIELD_ConversionRate_CurrencyTo_Name="A Moneda";

@XendraField(AD_Column_ID="C_Currency_ID_To",IsCentrallyMaintained=true,
AD_Tab_ID="ca1bb2e2-7758-6994-2899-a14871347637",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=2,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f11fc416-3e53-80ae-98ff-cee372273045")
public static final String FIELDNAME_ConversionRate_CurrencyTo="f11fc416-3e53-80ae-98ff-cee372273045";

@XendraTrl(Identifier="190c057b-8ef2-3695-d9b4-1f47b602203f")
public static String es_PE_COLUMN_C_Currency_ID_To_Name="A Moneda";

@XendraColumn(AD_Element_ID="c0b694a2-f7ed-3e59-d263-713709d89af7",ColumnName="C_Currency_ID_To",
AD_Reference_ID=18,AD_Reference_Value_ID="f518e797-c49f-bc60-667a-48fd618f8ee8",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="190c057b-8ef2-3695-d9b4-1f47b602203f",Synchronized="2017-08-05 16:53:32.0")
/** Column name C_Currency_ID_To */
public static final String COLUMNNAME_C_Currency_ID_To = "C_Currency_ID_To";
/** Set Divide Rate.
@param DivideRate To convert Source number to Target number, the Source is divided */
public void setDivideRate (BigDecimal DivideRate)
{
if (DivideRate == null) throw new IllegalArgumentException ("DivideRate is mandatory.");
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

@XendraTrl(Identifier="72d53b94-3ec1-cf76-fecc-7b81eaf0b06f")
public static String es_PE_FIELD_ConversionRates_DivideRate_Description="Convierte el número fuente a número destino; el fuente entre el número divisor.";

@XendraTrl(Identifier="72d53b94-3ec1-cf76-fecc-7b81eaf0b06f")
public static String es_PE_FIELD_ConversionRates_DivideRate_Help="Para convertir el número fuente a número destino; la fuente es dividida entre la tasa divisora. Si usted introduce una tasa divisora; la tasa multiplicadora será calculada automáticamente;";

@XendraTrl(Identifier="72d53b94-3ec1-cf76-fecc-7b81eaf0b06f")
public static String es_PE_FIELD_ConversionRates_DivideRate_Name="Tasa Divisora";

@XendraField(AD_Column_ID="DivideRate",IsCentrallyMaintained=true,
AD_Tab_ID="9c9a7769-2604-db53-4780-20a716cd516e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsEMUMember@=N",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="72d53b94-3ec1-cf76-fecc-7b81eaf0b06f")
public static final String FIELDNAME_ConversionRates_DivideRate="72d53b94-3ec1-cf76-fecc-7b81eaf0b06f";

@XendraTrl(Identifier="58ec3597-0152-8ea6-e849-df2f5f3bc6fa")
public static String es_PE_FIELD_ConversionRate_DivideRate_Description="Convierte el número fuente a número destino; el fuente entre el número divisor.";

@XendraTrl(Identifier="58ec3597-0152-8ea6-e849-df2f5f3bc6fa")
public static String es_PE_FIELD_ConversionRate_DivideRate_Help="Para convertir el número fuente a número destino; la fuente es dividida entre la tasa divisora. Si usted introduce una tasa divisora; la tasa multiplicadora será calculada automáticamente;";

@XendraTrl(Identifier="58ec3597-0152-8ea6-e849-df2f5f3bc6fa")
public static String es_PE_FIELD_ConversionRate_DivideRate_Name="Tasa Divisora";

@XendraField(AD_Column_ID="DivideRate",IsCentrallyMaintained=true,
AD_Tab_ID="ca1bb2e2-7758-6994-2899-a14871347637",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="58ec3597-0152-8ea6-e849-df2f5f3bc6fa")
public static final String FIELDNAME_ConversionRate_DivideRate="58ec3597-0152-8ea6-e849-df2f5f3bc6fa";

@XendraTrl(Identifier="b74ff00c-e1e7-7337-7898-44afcfeab215")
public static String es_PE_COLUMN_DivideRate_Name="Tasa Divisora";

@XendraColumn(AD_Element_ID="1a9c1cdd-c0a8-f71b-09ec-c1e93b1b7b06",ColumnName="DivideRate",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutEngine.rate",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b74ff00c-e1e7-7337-7898-44afcfeab215",Synchronized="2017-08-05 16:53:32.0")
/** Column name DivideRate */
public static final String COLUMNNAME_DivideRate = "DivideRate";
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
@XendraTrl(Identifier="f9757e86-3919-42a9-aea7-33fad8b7a963")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f9757e86-3919-42a9-aea7-33fad8b7a963",
Synchronized="2017-08-05 16:53:32.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Multiply Rate.
@param MultiplyRate Rate to multiple the source by to calculate the target. */
public void setMultiplyRate (BigDecimal MultiplyRate)
{
if (MultiplyRate == null) throw new IllegalArgumentException ("MultiplyRate is mandatory.");
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

@XendraTrl(Identifier="3e359da1-2876-d45f-d32c-6c9e2d05152e")
public static String es_PE_FIELD_ConversionRates_MultiplyRate_Description="Tasa por la que se multiplica la fuente para encontrar el objetivo";

@XendraTrl(Identifier="3e359da1-2876-d45f-d32c-6c9e2d05152e")
public static String es_PE_FIELD_ConversionRates_MultiplyRate_Help="Para convertir un número fuente a un número destino el fuente es multiplicado por la tasa multiplicadora. Si la tasa multiplicadora es introducida; entonces la tasa divisora será calculada automáticamente.";

@XendraTrl(Identifier="3e359da1-2876-d45f-d32c-6c9e2d05152e")
public static String es_PE_FIELD_ConversionRates_MultiplyRate_Name="Tasa Multiplicadora";

@XendraField(AD_Column_ID="MultiplyRate",IsCentrallyMaintained=true,
AD_Tab_ID="9c9a7769-2604-db53-4780-20a716cd516e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsEMUMember@=N",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="3e359da1-2876-d45f-d32c-6c9e2d05152e")
public static final String FIELDNAME_ConversionRates_MultiplyRate="3e359da1-2876-d45f-d32c-6c9e2d05152e";

@XendraTrl(Identifier="7eceb65b-9463-0eb0-bb87-5354961f7b67")
public static String es_PE_FIELD_ConversionRate_MultiplyRate_Description="Tasa por la que se multiplica la fuente para encontrar el objetivo";

@XendraTrl(Identifier="7eceb65b-9463-0eb0-bb87-5354961f7b67")
public static String es_PE_FIELD_ConversionRate_MultiplyRate_Help="Para convertir un número fuente a un número destino el fuente es multiplicado por la tasa multiplicadora. Si la tasa multiplicadora es introducida; entonces la tasa divisora será calculada automáticamente.";

@XendraTrl(Identifier="7eceb65b-9463-0eb0-bb87-5354961f7b67")
public static String es_PE_FIELD_ConversionRate_MultiplyRate_Name="Tasa Multiplicadora";

@XendraField(AD_Column_ID="MultiplyRate",IsCentrallyMaintained=true,
AD_Tab_ID="ca1bb2e2-7758-6994-2899-a14871347637",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7eceb65b-9463-0eb0-bb87-5354961f7b67")
public static final String FIELDNAME_ConversionRate_MultiplyRate="7eceb65b-9463-0eb0-bb87-5354961f7b67";

@XendraTrl(Identifier="156f68bd-e6e7-bea9-9a1b-fb81184f3f38")
public static String es_PE_COLUMN_MultiplyRate_Name="Tasa Multiplicadora";

@XendraColumn(AD_Element_ID="01f1ea55-fcce-bdc6-b676-8dbecf680a30",ColumnName="MultiplyRate",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutEngine.rate",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="156f68bd-e6e7-bea9-9a1b-fb81184f3f38",Synchronized="2017-08-05 16:53:32.0")
/** Column name MultiplyRate */
public static final String COLUMNNAME_MultiplyRate = "MultiplyRate";
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

@XendraTrl(Identifier="3b8c90f5-bcc3-495a-3be4-f69922dde95e")
public static String es_PE_FIELD_ConversionRates_ValidFrom_Description="Válido desde; incluyendo esta fecha (primer día)";

@XendraTrl(Identifier="3b8c90f5-bcc3-495a-3be4-f69922dde95e")
public static String es_PE_FIELD_ConversionRates_ValidFrom_Help="La fecha válida desde indica el primer día de un rango de fechas";

@XendraTrl(Identifier="3b8c90f5-bcc3-495a-3be4-f69922dde95e")
public static String es_PE_FIELD_ConversionRates_ValidFrom_Name="Válido Desde";

@XendraField(AD_Column_ID="ValidFrom",IsCentrallyMaintained=true,
AD_Tab_ID="9c9a7769-2604-db53-4780-20a716cd516e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsEMUMember@=N",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=3,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="3b8c90f5-bcc3-495a-3be4-f69922dde95e")
public static final String FIELDNAME_ConversionRates_ValidFrom="3b8c90f5-bcc3-495a-3be4-f69922dde95e";

@XendraTrl(Identifier="1951cbaa-0aa1-c8b6-007b-2afa14ad2443")
public static String es_PE_FIELD_ConversionRate_ValidFrom_Description="Válido desde; incluyendo esta fecha (primer día)";

@XendraTrl(Identifier="1951cbaa-0aa1-c8b6-007b-2afa14ad2443")
public static String es_PE_FIELD_ConversionRate_ValidFrom_Help="La fecha válida desde indica el primer día de un rango de fechas";

@XendraTrl(Identifier="1951cbaa-0aa1-c8b6-007b-2afa14ad2443")
public static String es_PE_FIELD_ConversionRate_ValidFrom_Name="Válido Desde";

@XendraField(AD_Column_ID="ValidFrom",IsCentrallyMaintained=true,
AD_Tab_ID="ca1bb2e2-7758-6994-2899-a14871347637",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=3,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1951cbaa-0aa1-c8b6-007b-2afa14ad2443")
public static final String FIELDNAME_ConversionRate_ValidFrom="1951cbaa-0aa1-c8b6-007b-2afa14ad2443";

@XendraTrl(Identifier="483f9184-26ea-3ff6-8b0f-c7f8de961772")
public static String es_PE_COLUMN_ValidFrom_Name="Válido Desde";

@XendraColumn(AD_Element_ID="86b1171a-a6c6-0da5-1aea-3f3106450d07",ColumnName="ValidFrom",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="483f9184-26ea-3ff6-8b0f-c7f8de961772",
Synchronized="2017-08-05 16:53:32.0")
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

@XendraTrl(Identifier="e5b59459-87cc-9107-1c68-c4b83fdc7dcb")
public static String es_PE_FIELD_ConversionRates_ValidTo_Description="Válido hasta; incluyendo esta fecha (ultimo día)";

@XendraTrl(Identifier="e5b59459-87cc-9107-1c68-c4b83fdc7dcb")
public static String es_PE_FIELD_ConversionRates_ValidTo_Help="La fecha válida hasta indica el último día de un rango de fechas";

@XendraTrl(Identifier="e5b59459-87cc-9107-1c68-c4b83fdc7dcb")
public static String es_PE_FIELD_ConversionRates_ValidTo_Name="Válido Hasta";

@XendraField(AD_Column_ID="ValidTo",IsCentrallyMaintained=true,
AD_Tab_ID="9c9a7769-2604-db53-4780-20a716cd516e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsEMUMember@=N",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e5b59459-87cc-9107-1c68-c4b83fdc7dcb")
public static final String FIELDNAME_ConversionRates_ValidTo="e5b59459-87cc-9107-1c68-c4b83fdc7dcb";

@XendraTrl(Identifier="aeb07e4b-244b-b33c-514d-760bb9911166")
public static String es_PE_FIELD_ConversionRate_ValidTo_Description="Válido hasta; incluyendo esta fecha (ultimo día)";

@XendraTrl(Identifier="aeb07e4b-244b-b33c-514d-760bb9911166")
public static String es_PE_FIELD_ConversionRate_ValidTo_Help="La fecha válida hasta indica el último día de un rango de fechas";

@XendraTrl(Identifier="aeb07e4b-244b-b33c-514d-760bb9911166")
public static String es_PE_FIELD_ConversionRate_ValidTo_Name="Válido Hasta";

@XendraField(AD_Column_ID="ValidTo",IsCentrallyMaintained=true,
AD_Tab_ID="ca1bb2e2-7758-6994-2899-a14871347637",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aeb07e4b-244b-b33c-514d-760bb9911166")
public static final String FIELDNAME_ConversionRate_ValidTo="aeb07e4b-244b-b33c-514d-760bb9911166";

@XendraTrl(Identifier="3b6d6bf5-ef51-d301-ad52-eaa437359971")
public static String es_PE_COLUMN_ValidTo_Name="Válido Hasta";

@XendraColumn(AD_Element_ID="0fbe43c3-c76d-0505-0043-63adb568a68f",ColumnName="ValidTo",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3b6d6bf5-ef51-d301-ad52-eaa437359971",
Synchronized="2017-08-05 16:53:32.0")
/** Column name ValidTo */
public static final String COLUMNNAME_ValidTo = "ValidTo";
}
