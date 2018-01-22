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
/** Generated Model for C_Country
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Country extends PO
{
/** Standard Constructor
@param ctx context
@param C_Country_ID id
@param trxName transaction
*/
public X_C_Country (Properties ctx, int C_Country_ID, String trxName)
{
super (ctx, C_Country_ID, trxName);
/** if (C_Country_ID == 0)
{
setC_Country_ID (0);
setCountryCode (null);
setDisplaySequence (null);	
// @C@, @R@ @P@
setHasPostal_Add (false);	
// N
setHasRegion (false);	
// N
setIsAddressLinesLocalReverse (false);	
// N
setIsAddressLinesReverse (false);	
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
public X_C_Country (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=170 */
public static int Table_ID=MTable.getTable_ID("C_Country");

@XendraTrl(Identifier="b614304d-5009-6131-7afa-c32a0a3e9189")
public static String es_PE_TAB_Country_Description="Definir País";

@XendraTrl(Identifier="b614304d-5009-6131-7afa-c32a0a3e9189")
public static String es_PE_TAB_Country_Name="País";

@XendraTrl(Identifier="b614304d-5009-6131-7afa-c32a0a3e9189")
public static String es_PE_TAB_Country_Help="La pestaña de país define cada país en la cual se ejecutan negocios. Los valores entrados para país son usados en las localizaciones de Socios de Negocio.";

@XendraTab(Name="Country",Description="Define Country",
Help="The Country Tab defines any country in which you do business.  Values entered here are referenced in location records for Business Partners.",
AD_Window_ID="566e8b2a-6be5-463e-f216-e211f099e497",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",
CommitWarning="Please create a support request (http://www.adempiere.org/support/requests.html), if the country data is not correct.",
AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,
Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,
Parent_Column_ID="",Identifier="b614304d-5009-6131-7afa-c32a0a3e9189",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Country="b614304d-5009-6131-7afa-c32a0a3e9189";

@XendraTrl(Identifier="0dd77580-1db4-0592-e668-3cd5b33fa77a")
public static String es_PE_TABLE_C_Country_Name="País";

@XendraTable(Name="Country",Description="Country ",Help="",TableName="C_Country",AccessLevel="6",
AD_Window_ID="566e8b2a-6be5-463e-f216-e211f099e497",AD_Val_Rule_ID="",IsKey=1,LoadSeq=55,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="0dd77580-1db4-0592-e668-3cd5b33fa77a",
Synchronized="2017-08-16 11:41:41.0")
/** TableName=C_Country */
public static final String Table_Name="C_Country";


@XendraIndex(Name="c_countrycode",Identifier="9108a8b8-a5d2-aaeb-fa60-49a8ee256432",
Column_Names="countrycode",IsUnique="true",TableIdentifier="9108a8b8-a5d2-aaeb-fa60-49a8ee256432",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_countrycode = "9108a8b8-a5d2-aaeb-fa60-49a8ee256432";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Country");

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
    Table_ID = MTable.getTable_ID("C_Country");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Country[").append(get_ID()).append("]");
return sb.toString();
}

/** AD_Language AD_Reference=136e26cd-6ffa-f76c-1e63-cce5ed2025b9 */
public static final int AD_LANGUAGE_AD_Reference_ID=106;
/** Set Language.
@param AD_Language Language for this entity */
public void setAD_Language (String AD_Language)
{
if (AD_Language != null && AD_Language.length() > 6)
{
log.warning("Length > 6 - truncated");
AD_Language = AD_Language.substring(0,5);
}
set_Value (COLUMNNAME_AD_Language, AD_Language);
}
/** Get Language.
@return Language for this entity */
public String getAD_Language() 
{
return (String)get_Value(COLUMNNAME_AD_Language);
}

@XendraTrl(Identifier="a2b5dfe3-cb98-71a4-12e3-b77e6bdf9f23")
public static String es_PE_FIELD_Country_Language_Description="Lenguaje para esta aplicación";

@XendraTrl(Identifier="a2b5dfe3-cb98-71a4-12e3-b77e6bdf9f23")
public static String es_PE_FIELD_Country_Language_Help="El lenguaje identifica el lenguaje a usar para el despliegue";

@XendraTrl(Identifier="a2b5dfe3-cb98-71a4-12e3-b77e6bdf9f23")
public static String es_PE_FIELD_Country_Language_Name="Lenguaje";

@XendraField(AD_Column_ID="AD_Language",IsCentrallyMaintained=true,
AD_Tab_ID="b614304d-5009-6131-7afa-c32a0a3e9189",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a2b5dfe3-cb98-71a4-12e3-b77e6bdf9f23")
public static final String FIELDNAME_Country_Language="a2b5dfe3-cb98-71a4-12e3-b77e6bdf9f23";

@XendraTrl(Identifier="e4cc5bab-57e5-b38e-68c5-1137f6e601ca")
public static String es_PE_COLUMN_AD_Language_Name="Lenguaje";

@XendraColumn(AD_Element_ID="d542d9da-4627-0da8-89af-5797f22de434",ColumnName="AD_Language",
AD_Reference_ID=18,AD_Reference_Value_ID="136e26cd-6ffa-f76c-1e63-cce5ed2025b9",AD_Val_Rule_ID="",
FieldLength=6,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e4cc5bab-57e5-b38e-68c5-1137f6e601ca",Synchronized="2017-08-05 16:53:33.0")
/** Column name AD_Language */
public static final String COLUMNNAME_AD_Language = "AD_Language";
/** Set Country_ID.
@param C_Country_ID Country  */
public void setC_Country_ID (int C_Country_ID)
{
if (C_Country_ID < 1) throw new IllegalArgumentException ("C_Country_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Country_ID, Integer.valueOf(C_Country_ID));
}
/** Get Country_ID.
@return Country  */
public int getC_Country_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Country_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="976c6bf0-a1df-b3e4-7662-8c9d369ee77d")
public static String es_PE_FIELD_Country_Country_ID_Description="País";

@XendraTrl(Identifier="976c6bf0-a1df-b3e4-7662-8c9d369ee77d")
public static String es_PE_FIELD_Country_Country_ID_Help="El país define un país. Cada país debe ser definido antes de que pueda ser usado en un documento.";

@XendraTrl(Identifier="976c6bf0-a1df-b3e4-7662-8c9d369ee77d")
public static String es_PE_FIELD_Country_Country_ID_Name="País";

@XendraField(AD_Column_ID="C_Country_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b614304d-5009-6131-7afa-c32a0a3e9189",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="976c6bf0-a1df-b3e4-7662-8c9d369ee77d")
public static final String FIELDNAME_Country_Country_ID="976c6bf0-a1df-b3e4-7662-8c9d369ee77d";
/** Column name C_Country_ID */
public static final String COLUMNNAME_C_Country_ID = "C_Country_ID";
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

@XendraTrl(Identifier="79ca1801-e19e-4bcf-1d8b-413ebe848e5b")
public static String es_PE_FIELD_Country_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="79ca1801-e19e-4bcf-1d8b-413ebe848e5b")
public static String es_PE_FIELD_Country_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="79ca1801-e19e-4bcf-1d8b-413ebe848e5b")
public static String es_PE_FIELD_Country_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b614304d-5009-6131-7afa-c32a0a3e9189",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="79ca1801-e19e-4bcf-1d8b-413ebe848e5b")
public static final String FIELDNAME_Country_Currency="79ca1801-e19e-4bcf-1d8b-413ebe848e5b";

@XendraTrl(Identifier="b1933462-7c61-1dd3-26bd-169fdaa68e37")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b1933462-7c61-1dd3-26bd-169fdaa68e37",
Synchronized="2017-08-05 16:53:33.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set ISO Country Code.
@param CountryCode Upper-case two-letter alphanumeric ISO Country code according to ISO 3166-1 - http://www.chemie.fu-berlin.de/diverse/doc/ISO_3166.html */
public void setCountryCode (String CountryCode)
{
if (CountryCode == null) throw new IllegalArgumentException ("CountryCode is mandatory.");
if (CountryCode.length() > 2)
{
log.warning("Length > 2 - truncated");
CountryCode = CountryCode.substring(0,1);
}
set_Value (COLUMNNAME_CountryCode, CountryCode);
}
/** Get ISO Country Code.
@return Upper-case two-letter alphanumeric ISO Country code according to ISO 3166-1 - http://www.chemie.fu-berlin.de/diverse/doc/ISO_3166.html */
public String getCountryCode() 
{
String value = (String)get_Value(COLUMNNAME_CountryCode);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="7a8ed961-41b2-de27-29c9-6b4ed0f0f35b")
public static String es_PE_FIELD_Country_ISOCountryCode_Description="Código ISO de país alfanumérico en mayúsculas de acuerdo al ISO 3166-1 -";

@XendraTrl(Identifier="7a8ed961-41b2-de27-29c9-6b4ed0f0f35b")
public static String es_PE_FIELD_Country_ISOCountryCode_Help="Para detalles - http://www.din.de/gremien/nas/nabd/iso3166ma/codlstp1.html or - http://www.unece.org/trade/rec/rec03en.htm";

@XendraTrl(Identifier="7a8ed961-41b2-de27-29c9-6b4ed0f0f35b")
public static String es_PE_FIELD_Country_ISOCountryCode_Name="Código ISO del País";

@XendraField(AD_Column_ID="CountryCode",IsCentrallyMaintained=true,
AD_Tab_ID="b614304d-5009-6131-7afa-c32a0a3e9189",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7a8ed961-41b2-de27-29c9-6b4ed0f0f35b")
public static final String FIELDNAME_Country_ISOCountryCode="7a8ed961-41b2-de27-29c9-6b4ed0f0f35b";

@XendraTrl(Identifier="aa0a9057-0c34-b996-5878-a3e1ce5203ff")
public static String es_PE_COLUMN_CountryCode_Name="Código ISO del País";

@XendraColumn(AD_Element_ID="45764594-a71a-901c-2c46-bb5485c061d1",ColumnName="CountryCode",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aa0a9057-0c34-b996-5878-a3e1ce5203ff",
Synchronized="2017-08-05 16:53:33.0")
/** Column name CountryCode */
public static final String COLUMNNAME_CountryCode = "CountryCode";
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

@XendraTrl(Identifier="7b2bd156-2ca4-7bdd-30c6-b5b01e638826")
public static String es_PE_FIELD_Country_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="7b2bd156-2ca4-7bdd-30c6-b5b01e638826")
public static String es_PE_FIELD_Country_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="7b2bd156-2ca4-7bdd-30c6-b5b01e638826")
public static String es_PE_FIELD_Country_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="b614304d-5009-6131-7afa-c32a0a3e9189",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7b2bd156-2ca4-7bdd-30c6-b5b01e638826")
public static final String FIELDNAME_Country_Description="7b2bd156-2ca4-7bdd-30c6-b5b01e638826";

@XendraTrl(Identifier="2ec57361-b9e3-ed6e-bf9e-28a0bd631681")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2ec57361-b9e3-ed6e-bf9e-28a0bd631681",
Synchronized="2017-08-05 16:53:33.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Address Print Format.
@param DisplaySequence Format for printing this Address */
public void setDisplaySequence (String DisplaySequence)
{
if (DisplaySequence == null) throw new IllegalArgumentException ("DisplaySequence is mandatory.");
if (DisplaySequence.length() > 20)
{
log.warning("Length > 20 - truncated");
DisplaySequence = DisplaySequence.substring(0,19);
}
set_Value (COLUMNNAME_DisplaySequence, DisplaySequence);
}
/** Get Address Print Format.
@return Format for printing this Address */
public String getDisplaySequence() 
{
String value = (String)get_Value(COLUMNNAME_DisplaySequence);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="abeea066-a469-4e68-1ba2-e58d0fd4e19d")
public static String es_PE_FIELD_Country_AddressPrintFormat_Description="Formato para imprimir esta dirección";

@XendraTrl(Identifier="abeea066-a469-4e68-1ba2-e58d0fd4e19d")
public static String es_PE_FIELD_Country_AddressPrintFormat_Help="El formato de impresión de dirección define el formato a ser usado cuando se imprime esta dirección. Se usan las siguientes notaciones: @C@=Ciudad  @P@=Postal  @A@=Postal adicional  @R@=Región";

@XendraTrl(Identifier="abeea066-a469-4e68-1ba2-e58d0fd4e19d")
public static String es_PE_FIELD_Country_AddressPrintFormat_Name="Formato Impresión de Dirección";

@XendraField(AD_Column_ID="DisplaySequence",IsCentrallyMaintained=true,
AD_Tab_ID="b614304d-5009-6131-7afa-c32a0a3e9189",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="abeea066-a469-4e68-1ba2-e58d0fd4e19d")
public static final String FIELDNAME_Country_AddressPrintFormat="abeea066-a469-4e68-1ba2-e58d0fd4e19d";

@XendraTrl(Identifier="0fbca338-7f76-20e9-467a-d31055a74031")
public static String es_PE_COLUMN_DisplaySequence_Name="Formato Impresión de Dirección";

@XendraColumn(AD_Element_ID="d2ab4664-33f7-fae0-0666-909389784aa1",ColumnName="DisplaySequence",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,
DefaultValue="@C@, @R@ @P@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0fbca338-7f76-20e9-467a-d31055a74031",Synchronized="2017-08-05 16:53:33.0")
/** Column name DisplaySequence */
public static final String COLUMNNAME_DisplaySequence = "DisplaySequence";
/** Set Local Address Format.
@param DisplaySequenceLocal Format for printing this Address locally */
public void setDisplaySequenceLocal (String DisplaySequenceLocal)
{
if (DisplaySequenceLocal != null && DisplaySequenceLocal.length() > 20)
{
log.warning("Length > 20 - truncated");
DisplaySequenceLocal = DisplaySequenceLocal.substring(0,19);
}
set_Value (COLUMNNAME_DisplaySequenceLocal, DisplaySequenceLocal);
}
/** Get Local Address Format.
@return Format for printing this Address locally */
public String getDisplaySequenceLocal() 
{
String value = (String)get_Value(COLUMNNAME_DisplaySequenceLocal);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ca946bc6-a1f3-6f90-1623-a6a560359237")
public static String es_PE_FIELD_Country_LocalAddressFormat_Description="Formato para imprimir esta dirección local.";

@XendraTrl(Identifier="ca946bc6-a1f3-6f90-1623-a6a560359237")
public static String es_PE_FIELD_Country_LocalAddressFormat_Help="El formato local opcional de impresión de la dirección define el formato que se utilizará cuando esta dirección imprime para el país. Si está definido, este formato se utiliza para imprimir la dirección para el país es entonces el formato de dirección estándar. Se utilizan las notaciones siguientes: @R@=Region @P@=Postal @A@=Postal adicional @C@=Cuidad.";

@XendraTrl(Identifier="ca946bc6-a1f3-6f90-1623-a6a560359237")
public static String es_PE_FIELD_Country_LocalAddressFormat_Name="Formato de Dirección local";

@XendraField(AD_Column_ID="DisplaySequenceLocal",IsCentrallyMaintained=true,
AD_Tab_ID="b614304d-5009-6131-7afa-c32a0a3e9189",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ca946bc6-a1f3-6f90-1623-a6a560359237")
public static final String FIELDNAME_Country_LocalAddressFormat="ca946bc6-a1f3-6f90-1623-a6a560359237";

@XendraTrl(Identifier="19c2b6e2-f495-b009-dbb7-3e5e70a78c2a")
public static String es_PE_COLUMN_DisplaySequenceLocal_Name="Formato de Dirección local";

@XendraColumn(AD_Element_ID="3333c496-2f48-d5d1-92f6-012e691be8c9",
ColumnName="DisplaySequenceLocal",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=20,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="19c2b6e2-f495-b009-dbb7-3e5e70a78c2a",Synchronized="2017-08-05 16:53:33.0")
/** Column name DisplaySequenceLocal */
public static final String COLUMNNAME_DisplaySequenceLocal = "DisplaySequenceLocal";
/** Set Bank Account No Format.
@param ExpressionBankAccountNo Format of the Bank Account */
public void setExpressionBankAccountNo (String ExpressionBankAccountNo)
{
if (ExpressionBankAccountNo != null && ExpressionBankAccountNo.length() > 20)
{
log.warning("Length > 20 - truncated");
ExpressionBankAccountNo = ExpressionBankAccountNo.substring(0,19);
}
set_Value (COLUMNNAME_ExpressionBankAccountNo, ExpressionBankAccountNo);
}
/** Get Bank Account No Format.
@return Format of the Bank Account */
public String getExpressionBankAccountNo() 
{
String value = (String)get_Value(COLUMNNAME_ExpressionBankAccountNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="69984e2f-326f-f6e7-fc98-32da10dc24bf")
public static String es_PE_FIELD_Country_BankAccountNoFormat_Description="Formato de la Cuenta de Banco.";

@XendraTrl(Identifier="69984e2f-326f-f6e7-fc98-32da10dc24bf")
public static String es_PE_FIELD_Country_BankAccountNoFormat_Name="Sin Formato de Cuenta de Banco";

@XendraField(AD_Column_ID="ExpressionBankAccountNo",IsCentrallyMaintained=true,
AD_Tab_ID="b614304d-5009-6131-7afa-c32a0a3e9189",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="69984e2f-326f-f6e7-fc98-32da10dc24bf")
public static final String FIELDNAME_Country_BankAccountNoFormat="69984e2f-326f-f6e7-fc98-32da10dc24bf";

@XendraTrl(Identifier="e6c026d7-38c3-d1eb-9e05-6d813bb5e3fb")
public static String es_PE_COLUMN_ExpressionBankAccountNo_Name="Sin Formato de Cuenta de Banco";

@XendraColumn(AD_Element_ID="e9e81666-686c-3a0e-d5c6-103ccdb11808",
ColumnName="ExpressionBankAccountNo",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=20,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e6c026d7-38c3-d1eb-9e05-6d813bb5e3fb",Synchronized="2017-08-05 16:53:33.0")
/** Column name ExpressionBankAccountNo */
public static final String COLUMNNAME_ExpressionBankAccountNo = "ExpressionBankAccountNo";
/** Set Bank Routing No Format.
@param ExpressionBankRoutingNo Format of the Bank Routing Number */
public void setExpressionBankRoutingNo (String ExpressionBankRoutingNo)
{
if (ExpressionBankRoutingNo != null && ExpressionBankRoutingNo.length() > 20)
{
log.warning("Length > 20 - truncated");
ExpressionBankRoutingNo = ExpressionBankRoutingNo.substring(0,19);
}
set_Value (COLUMNNAME_ExpressionBankRoutingNo, ExpressionBankRoutingNo);
}
/** Get Bank Routing No Format.
@return Format of the Bank Routing Number */
public String getExpressionBankRoutingNo() 
{
String value = (String)get_Value(COLUMNNAME_ExpressionBankRoutingNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="b37dc383-84ad-f941-e95c-43236ed03f58")
public static String es_PE_FIELD_Country_BankRoutingNoFormat_Description="Número de formato de ruta bancaría";

@XendraTrl(Identifier="b37dc383-84ad-f941-e95c-43236ed03f58")
public static String es_PE_FIELD_Country_BankRoutingNoFormat_Name="Número de Formato de Ruta Bancaría";

@XendraField(AD_Column_ID="ExpressionBankRoutingNo",IsCentrallyMaintained=true,
AD_Tab_ID="b614304d-5009-6131-7afa-c32a0a3e9189",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b37dc383-84ad-f941-e95c-43236ed03f58")
public static final String FIELDNAME_Country_BankRoutingNoFormat="b37dc383-84ad-f941-e95c-43236ed03f58";

@XendraTrl(Identifier="b8b5ce44-994a-7384-03a5-0384c7c9b676")
public static String es_PE_COLUMN_ExpressionBankRoutingNo_Name="Número de Formato de Ruta Bancaría";

@XendraColumn(AD_Element_ID="99daae0e-90bc-a546-bf87-574119300dfa",
ColumnName="ExpressionBankRoutingNo",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=20,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b8b5ce44-994a-7384-03a5-0384c7c9b676",Synchronized="2017-08-05 16:53:33.0")
/** Column name ExpressionBankRoutingNo */
public static final String COLUMNNAME_ExpressionBankRoutingNo = "ExpressionBankRoutingNo";
/** Set Phone Format.
@param ExpressionPhone Format of the phone: Can contain fixed format elements, Variables: '_lLoOaAcCa09' */
public void setExpressionPhone (String ExpressionPhone)
{
if (ExpressionPhone != null && ExpressionPhone.length() > 20)
{
log.warning("Length > 20 - truncated");
ExpressionPhone = ExpressionPhone.substring(0,19);
}
set_Value (COLUMNNAME_ExpressionPhone, ExpressionPhone);
}
/** Get Phone Format.
@return Format of the phone: Can contain fixed format elements, Variables: '_lLoOaAcCa09' */
public String getExpressionPhone() 
{
String value = (String)get_Value(COLUMNNAME_ExpressionPhone);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="51133c25-29bc-1586-c3d9-914b1371fb9a")
public static String es_PE_FIELD_Country_PhoneFormat_Description="Formato del teléfono; puede contener elementos de formato fijo; Variables: \"_lLoOaAcCa09\"";

@XendraTrl(Identifier="51133c25-29bc-1586-c3d9-914b1371fb9a")
public static String es_PE_FIELD_Country_PhoneFormat_Help="<B>Elementos de validación</B>";

@XendraTrl(Identifier="51133c25-29bc-1586-c3d9-914b1371fb9a")
public static String es_PE_FIELD_Country_PhoneFormat_Name="Formato de Teléfono";

@XendraField(AD_Column_ID="ExpressionPhone",IsCentrallyMaintained=true,
AD_Tab_ID="b614304d-5009-6131-7afa-c32a0a3e9189",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="51133c25-29bc-1586-c3d9-914b1371fb9a")
public static final String FIELDNAME_Country_PhoneFormat="51133c25-29bc-1586-c3d9-914b1371fb9a";

@XendraTrl(Identifier="d16cb760-da4d-69ab-0a36-74dced807dc6")
public static String es_PE_COLUMN_ExpressionPhone_Name="Formato de Teléfono";

@XendraColumn(AD_Element_ID="eae6a702-903c-5bb4-bdee-fee9fd378382",ColumnName="ExpressionPhone",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d16cb760-da4d-69ab-0a36-74dced807dc6",
Synchronized="2017-08-05 16:53:33.0")
/** Column name ExpressionPhone */
public static final String COLUMNNAME_ExpressionPhone = "ExpressionPhone";
/** Set Postal Code Format.
@param ExpressionPostal Format of the postal code: Can contain fixed format elements, Variables: '_lLoOaAcCa09' */
public void setExpressionPostal (String ExpressionPostal)
{
if (ExpressionPostal != null && ExpressionPostal.length() > 20)
{
log.warning("Length > 20 - truncated");
ExpressionPostal = ExpressionPostal.substring(0,19);
}
set_Value (COLUMNNAME_ExpressionPostal, ExpressionPostal);
}
/** Get Postal Code Format.
@return Format of the postal code: Can contain fixed format elements, Variables: '_lLoOaAcCa09' */
public String getExpressionPostal() 
{
String value = (String)get_Value(COLUMNNAME_ExpressionPostal);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a1f308ab-e6ba-d5c4-5d84-5a000a8c37d8")
public static String es_PE_FIELD_Country_PostalCodeFormat_Description="Formato del valor; puede contener elementos de formato fijo; Variables: \"_lLoOaAcCa09\"";

@XendraTrl(Identifier="a1f308ab-e6ba-d5c4-5d84-5a000a8c37d8")
public static String es_PE_FIELD_Country_PostalCodeFormat_Help="<B>Elementos de validación</B>";

@XendraTrl(Identifier="a1f308ab-e6ba-d5c4-5d84-5a000a8c37d8")
public static String es_PE_FIELD_Country_PostalCodeFormat_Name="Formato de Código Postal";

@XendraField(AD_Column_ID="ExpressionPostal",IsCentrallyMaintained=true,
AD_Tab_ID="b614304d-5009-6131-7afa-c32a0a3e9189",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a1f308ab-e6ba-d5c4-5d84-5a000a8c37d8")
public static final String FIELDNAME_Country_PostalCodeFormat="a1f308ab-e6ba-d5c4-5d84-5a000a8c37d8";

@XendraTrl(Identifier="19f87047-50bf-628d-8639-39e633527da6")
public static String es_PE_COLUMN_ExpressionPostal_Name="Formato de Código Postal";

@XendraColumn(AD_Element_ID="e6ab8aad-7a42-1578-786e-e41c8add0b28",ColumnName="ExpressionPostal",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="19f87047-50bf-628d-8639-39e633527da6",
Synchronized="2017-08-05 16:53:33.0")
/** Column name ExpressionPostal */
public static final String COLUMNNAME_ExpressionPostal = "ExpressionPostal";
/** Set Additional Postal Format.
@param ExpressionPostal_Add Format of the value: Can contain fixed format elements, Variables: '_lLoOaAcCa09' */
public void setExpressionPostal_Add (String ExpressionPostal_Add)
{
if (ExpressionPostal_Add != null && ExpressionPostal_Add.length() > 20)
{
log.warning("Length > 20 - truncated");
ExpressionPostal_Add = ExpressionPostal_Add.substring(0,19);
}
set_Value (COLUMNNAME_ExpressionPostal_Add, ExpressionPostal_Add);
}
/** Get Additional Postal Format.
@return Format of the value: Can contain fixed format elements, Variables: '_lLoOaAcCa09' */
public String getExpressionPostal_Add() 
{
String value = (String)get_Value(COLUMNNAME_ExpressionPostal_Add);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="257a58d4-5f2b-6727-7105-919f35680ba1")
public static String es_PE_FIELD_Country_AdditionalPostalFormat_Description="Formato del código postal; puede contener elementos de formato fijo; Variables: \"_lLoOaAcCa09\"";

@XendraTrl(Identifier="257a58d4-5f2b-6727-7105-919f35680ba1")
public static String es_PE_FIELD_Country_AdditionalPostalFormat_Help="<B>Elementos de validación</B>";

@XendraTrl(Identifier="257a58d4-5f2b-6727-7105-919f35680ba1")
public static String es_PE_FIELD_Country_AdditionalPostalFormat_Name="Formato Postal Adicional";

@XendraField(AD_Column_ID="ExpressionPostal_Add",IsCentrallyMaintained=true,
AD_Tab_ID="b614304d-5009-6131-7afa-c32a0a3e9189",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@HasPostal_Add@=Y",DisplayLength=20,IsReadOnly=false,SeqNo=160,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="257a58d4-5f2b-6727-7105-919f35680ba1")
public static final String FIELDNAME_Country_AdditionalPostalFormat="257a58d4-5f2b-6727-7105-919f35680ba1";

@XendraTrl(Identifier="09461454-8591-4993-4bb2-f9228d08892f")
public static String es_PE_COLUMN_ExpressionPostal_Add_Name="Formato Postal Adicional";

@XendraColumn(AD_Element_ID="98b6402f-393c-de40-e99d-57ac4dbf6b46",
ColumnName="ExpressionPostal_Add",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=20,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="09461454-8591-4993-4bb2-f9228d08892f",Synchronized="2017-08-05 16:53:33.0")
/** Column name ExpressionPostal_Add */
public static final String COLUMNNAME_ExpressionPostal_Add = "ExpressionPostal_Add";
/** Set Additional Postal code.
@param HasPostal_Add Has Additional Postal Code */
public void setHasPostal_Add (boolean HasPostal_Add)
{
set_Value (COLUMNNAME_HasPostal_Add, Boolean.valueOf(HasPostal_Add));
}
/** Get Additional Postal code.
@return Has Additional Postal Code */
public boolean isHasPostal_Add() 
{
Object oo = get_Value(COLUMNNAME_HasPostal_Add);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="fcdab483-f97e-d65c-ab7f-5f8c5184aa28")
public static String es_PE_FIELD_Country_AdditionalPostalCode_Description="Existe Código postal adicional";

@XendraTrl(Identifier="fcdab483-f97e-d65c-ab7f-5f8c5184aa28")
public static String es_PE_FIELD_Country_AdditionalPostalCode_Help="El cuadro de verificación Código Postal Adicional indica si esta dirección es un Código Postal Adicional. Si se selecciona; un campo adicional solicita la entrada del Código Postal Adicional";

@XendraTrl(Identifier="fcdab483-f97e-d65c-ab7f-5f8c5184aa28")
public static String es_PE_FIELD_Country_AdditionalPostalCode_Name="Código Postal Adicional";

@XendraField(AD_Column_ID="HasPostal_Add",IsCentrallyMaintained=true,
AD_Tab_ID="b614304d-5009-6131-7afa-c32a0a3e9189",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fcdab483-f97e-d65c-ab7f-5f8c5184aa28")
public static final String FIELDNAME_Country_AdditionalPostalCode="fcdab483-f97e-d65c-ab7f-5f8c5184aa28";

@XendraTrl(Identifier="60f04bc7-235e-72c0-a31c-f2087628ba3d")
public static String es_PE_COLUMN_HasPostal_Add_Name="Código Postal Adicional";

@XendraColumn(AD_Element_ID="df1838fe-273d-62a1-0a56-4d731118216b",ColumnName="HasPostal_Add",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="60f04bc7-235e-72c0-a31c-f2087628ba3d",
Synchronized="2017-08-05 16:53:33.0")
/** Column name HasPostal_Add */
public static final String COLUMNNAME_HasPostal_Add = "HasPostal_Add";
/** Set Country has Region.
@param HasRegion Country contains Regions */
public void setHasRegion (boolean HasRegion)
{
set_Value (COLUMNNAME_HasRegion, Boolean.valueOf(HasRegion));
}
/** Get Country has Region.
@return Country contains Regions */
public boolean isHasRegion() 
{
Object oo = get_Value(COLUMNNAME_HasRegion);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="3226329d-fcde-0165-1983-20ad9a2a0e8f")
public static String es_PE_FIELD_Country_CountryHasRegion_Description="El país contiene regiones.";

@XendraTrl(Identifier="3226329d-fcde-0165-1983-20ad9a2a0e8f")
public static String es_PE_FIELD_Country_CountryHasRegion_Help="El cuadro de verificación país tiene región se selecciona si el país que se está definiendo está dividido en  regiones. Si se selecciona; la pestaña región se habilita.";

@XendraTrl(Identifier="3226329d-fcde-0165-1983-20ad9a2a0e8f")
public static String es_PE_FIELD_Country_CountryHasRegion_Name="País con Regiones";

@XendraField(AD_Column_ID="HasRegion",IsCentrallyMaintained=true,
AD_Tab_ID="b614304d-5009-6131-7afa-c32a0a3e9189",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3226329d-fcde-0165-1983-20ad9a2a0e8f")
public static final String FIELDNAME_Country_CountryHasRegion="3226329d-fcde-0165-1983-20ad9a2a0e8f";

@XendraTrl(Identifier="7b3be137-76e1-3037-a198-b17c0c24e8f7")
public static String es_PE_COLUMN_HasRegion_Name="País con Regiones";

@XendraColumn(AD_Element_ID="8586b78b-e9a7-5628-3b66-af09fab84a11",ColumnName="HasRegion",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7b3be137-76e1-3037-a198-b17c0c24e8f7",
Synchronized="2017-08-05 16:53:33.0")
/** Column name HasRegion */
public static final String COLUMNNAME_HasRegion = "HasRegion";
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
@XendraTrl(Identifier="7c5a84d9-ed33-47d5-805c-d4d2c2d8834a")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7c5a84d9-ed33-47d5-805c-d4d2c2d8834a",
Synchronized="2017-08-05 16:53:33.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Reverse Local Address Lines.
@param IsAddressLinesLocalReverse Print Local Address in reverse Order */
public void setIsAddressLinesLocalReverse (boolean IsAddressLinesLocalReverse)
{
set_Value (COLUMNNAME_IsAddressLinesLocalReverse, Boolean.valueOf(IsAddressLinesLocalReverse));
}
/** Get Reverse Local Address Lines.
@return Print Local Address in reverse Order */
public boolean isAddressLinesLocalReverse() 
{
Object oo = get_Value(COLUMNNAME_IsAddressLinesLocalReverse);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="d8fe7dc9-8e75-59ef-120f-6665ce11ef4f")
public static String es_PE_FIELD_Country_ReverseLocalAddressLines_Description="Imprime dirección local en orden reversa.";

@XendraTrl(Identifier="d8fe7dc9-8e75-59ef-120f-6665ce11ef4f")
public static String es_PE_FIELD_Country_ReverseLocalAddressLines_Help="Si no esta seleccionada la secuencia local es dirección 1, dirección 2, dirección 3, dirección 4, Ciudad/Región/Postal,País.Si esta seleccionada la secuencia local es País, Ciudad/Región/Postal/, dirección 4, dirección 3, dirección 2, dirección 1.La secuencia de Ciudad/Región/Postal es determinada por el formato de dirección local.";

@XendraTrl(Identifier="d8fe7dc9-8e75-59ef-120f-6665ce11ef4f")
public static String es_PE_FIELD_Country_ReverseLocalAddressLines_Name="Reversa Dirección de línea";

@XendraField(AD_Column_ID="IsAddressLinesLocalReverse",IsCentrallyMaintained=true,
AD_Tab_ID="b614304d-5009-6131-7afa-c32a0a3e9189",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d8fe7dc9-8e75-59ef-120f-6665ce11ef4f")
public static final String FIELDNAME_Country_ReverseLocalAddressLines="d8fe7dc9-8e75-59ef-120f-6665ce11ef4f";

@XendraTrl(Identifier="7b051e61-2b6b-f2ff-b0b6-eada57924ea7")
public static String es_PE_COLUMN_IsAddressLinesLocalReverse_Name="Reversa Dirección de línea";

@XendraColumn(AD_Element_ID="7c6763b0-4b20-01d8-c8ae-d088b31abb05",
ColumnName="IsAddressLinesLocalReverse",AD_Reference_ID=20,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7b051e61-2b6b-f2ff-b0b6-eada57924ea7",Synchronized="2017-08-05 16:53:33.0")
/** Column name IsAddressLinesLocalReverse */
public static final String COLUMNNAME_IsAddressLinesLocalReverse = "IsAddressLinesLocalReverse";
/** Set Reverse Address Lines.
@param IsAddressLinesReverse Print Address in reverse Order */
public void setIsAddressLinesReverse (boolean IsAddressLinesReverse)
{
set_Value (COLUMNNAME_IsAddressLinesReverse, Boolean.valueOf(IsAddressLinesReverse));
}
/** Get Reverse Address Lines.
@return Print Address in reverse Order */
public boolean isAddressLinesReverse() 
{
Object oo = get_Value(COLUMNNAME_IsAddressLinesReverse);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="4977a61b-3080-bb62-6212-41ea975a2aab")
public static String es_PE_FIELD_Country_ReverseAddressLines_Description="Imprimir dirección en orden reversa.";

@XendraTrl(Identifier="4977a61b-3080-bb62-6212-41ea975a2aab")
public static String es_PE_FIELD_Country_ReverseAddressLines_Help="Si no esta seleccionada la secuencia es dirección 1,dirección 2, dirección 3, dirección 4, Ciudad/Región/Postal, País.Si esta seleccionada la secuencia es Ciudad, País/Región/Postal, dirección 4, dirección 3, dirección 2, dirección 1.La secuencia de Ciudad/Región/Postal es determinada con la dirección de formato.";

@XendraTrl(Identifier="4977a61b-3080-bb62-6212-41ea975a2aab")
public static String es_PE_FIELD_Country_ReverseAddressLines_Name="Reversa Línea de Dirección";

@XendraField(AD_Column_ID="IsAddressLinesReverse",IsCentrallyMaintained=true,
AD_Tab_ID="b614304d-5009-6131-7afa-c32a0a3e9189",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4977a61b-3080-bb62-6212-41ea975a2aab")
public static final String FIELDNAME_Country_ReverseAddressLines="4977a61b-3080-bb62-6212-41ea975a2aab";

@XendraTrl(Identifier="9b670cd1-5855-e6d6-2235-0c7faaa13ff8")
public static String es_PE_COLUMN_IsAddressLinesReverse_Name="Reversa Línea de Dirección";

@XendraColumn(AD_Element_ID="1f3b26c1-eaed-2763-cd5c-540705e8989f",
ColumnName="IsAddressLinesReverse",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9b670cd1-5855-e6d6-2235-0c7faaa13ff8",Synchronized="2017-08-05 16:53:33.0")
/** Column name IsAddressLinesReverse */
public static final String COLUMNNAME_IsAddressLinesReverse = "IsAddressLinesReverse";
/** Set Media Size.
@param MediaSize Java Media Size */
public void setMediaSize (String MediaSize)
{
if (MediaSize != null && MediaSize.length() > 40)
{
log.warning("Length > 40 - truncated");
MediaSize = MediaSize.substring(0,39);
}
set_Value (COLUMNNAME_MediaSize, MediaSize);
}
/** Get Media Size.
@return Java Media Size */
public String getMediaSize() 
{
String value = (String)get_Value(COLUMNNAME_MediaSize);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ebbf58f7-8634-e50d-a823-464271d12d18")
public static String es_PE_FIELD_Country_MediaSize_Description="Tamaño de la medida en java";

@XendraTrl(Identifier="ebbf58f7-8634-e50d-a823-464271d12d18")
public static String es_PE_FIELD_Country_MediaSize_Help="El tamaño de la media en java. Ejemplo \"MediaSize.ISO.A4\" (Asume el paquete javax.print.attribute.standard) Si usted define su propio tamaño de media, use la siguiente clasificación de nombre. Si el patrón de lenguaje no es correcto, por favor cree una solicitud de soporte con la información correcta.";

@XendraTrl(Identifier="ebbf58f7-8634-e50d-a823-464271d12d18")
public static String es_PE_FIELD_Country_MediaSize_Name="Tamaño de la medida (papel)";

@XendraField(AD_Column_ID="MediaSize",IsCentrallyMaintained=true,
AD_Tab_ID="b614304d-5009-6131-7afa-c32a0a3e9189",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ebbf58f7-8634-e50d-a823-464271d12d18")
public static final String FIELDNAME_Country_MediaSize="ebbf58f7-8634-e50d-a823-464271d12d18";

@XendraTrl(Identifier="ee3dc737-f309-df46-0d28-8ebf4b185e6b")
public static String es_PE_COLUMN_MediaSize_Name="Tamaño de la medida (papel)";

@XendraColumn(AD_Element_ID="0d40530e-50b1-d8d2-d608-3c5a18cac1a3",ColumnName="MediaSize",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ee3dc737-f309-df46-0d28-8ebf4b185e6b",
Synchronized="2017-08-05 16:53:33.0")
/** Column name MediaSize */
public static final String COLUMNNAME_MediaSize = "MediaSize";
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

@XendraTrl(Identifier="d64922b3-b6a1-5806-6697-826ade7773eb")
public static String es_PE_FIELD_Country_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="d64922b3-b6a1-5806-6697-826ade7773eb")
public static String es_PE_FIELD_Country_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="d64922b3-b6a1-5806-6697-826ade7773eb")
public static String es_PE_FIELD_Country_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="b614304d-5009-6131-7afa-c32a0a3e9189",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d64922b3-b6a1-5806-6697-826ade7773eb")
public static final String FIELDNAME_Country_Name="d64922b3-b6a1-5806-6697-826ade7773eb";

@XendraTrl(Identifier="b4cad3b3-ba3d-4ab4-9a7b-21e035ab3555")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b4cad3b3-ba3d-4ab4-9a7b-21e035ab3555",
Synchronized="2017-08-05 16:53:33.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Region.
@param RegionName Name of the Region */
public void setRegionName (String RegionName)
{
if (RegionName != null && RegionName.length() > 60)
{
log.warning("Length > 60 - truncated");
RegionName = RegionName.substring(0,59);
}
set_Value (COLUMNNAME_RegionName, RegionName);
}
/** Get Region.
@return Name of the Region */
public String getRegionName() 
{
String value = (String)get_Value(COLUMNNAME_RegionName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="460e84d8-dd8c-df04-d9e1-81f865ffa9c6")
public static String es_PE_FIELD_Country_Region_Description="Nombre de esta región";

@XendraTrl(Identifier="460e84d8-dd8c-df04-d9e1-81f865ffa9c6")
public static String es_PE_FIELD_Country_Region_Help="El nombre de región define el nombre que se imprimirá cuando esta región se use en un documento.";

@XendraTrl(Identifier="460e84d8-dd8c-df04-d9e1-81f865ffa9c6")
public static String es_PE_FIELD_Country_Region_Name="Nombre de Región";

@XendraField(AD_Column_ID="RegionName",IsCentrallyMaintained=true,
AD_Tab_ID="b614304d-5009-6131-7afa-c32a0a3e9189",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@HasRegion@=Y",DisplayLength=29,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="460e84d8-dd8c-df04-d9e1-81f865ffa9c6")
public static final String FIELDNAME_Country_Region="460e84d8-dd8c-df04-d9e1-81f865ffa9c6";

@XendraTrl(Identifier="6b1d1ba0-9c83-3ebb-3757-51310e2891c2")
public static String es_PE_COLUMN_RegionName_Name="Nombre de Región";

@XendraColumn(AD_Element_ID="b2bf2a97-80d5-f41e-ee37-c6093627a1b0",ColumnName="RegionName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="State",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6b1d1ba0-9c83-3ebb-3757-51310e2891c2",
Synchronized="2017-08-05 16:53:33.0")
/** Column name RegionName */
public static final String COLUMNNAME_RegionName = "RegionName";
}
