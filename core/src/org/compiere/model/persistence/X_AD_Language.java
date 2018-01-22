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
/** Generated Model for AD_Language
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Language extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Language_ID id
@param trxName transaction
*/
public X_AD_Language (Properties ctx, int AD_Language_ID, String trxName)
{
super (ctx, AD_Language_ID, trxName);
/** if (AD_Language_ID == 0)
{
setAD_Language (null);
setAD_Language_ID (0);	
// @SQL=SELECT COALESCE(MAX(AD_Language_ID),0)+1 AS DefaultValue FROM AD_Language
setIsBaseLanguage (false);	
// N
setIsDecimalPoint (false);	
// N
setIsSystemLanguage (false);	
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
public X_AD_Language (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=111 */
public static int Table_ID=MTable.getTable_ID("AD_Language");

@XendraTrl(Identifier="cdd78c94-8408-59e5-2f13-dfb5e09abfad")
public static String es_PE_TAB_Language_Description="Lenguajes de Sistema y de Usuario";

@XendraTrl(Identifier="cdd78c94-8408-59e5-2f13-dfb5e09abfad")
public static String es_PE_TAB_Language_Name="Lenguaje";

@XendraTrl(Identifier="cdd78c94-8408-59e5-2f13-dfb5e09abfad")
public static String es_PE_TAB_Language_Help="Si se quiere adicionar un lenguaje adicional de interfase de usuario; seleccionar `Lenguaje del Sistema`. Si no es asi; el sistema solo le permitirá traducir elementos usados para la impresión de documentos";

@XendraTab(Name="Language",Description="System and User Languages",
Help="If you want to add an additional User Interface language, select 'System Language'. Otherwise, the system allows you to just translate elements for printing documents.",
AD_Window_ID="f5b80745-d3ce-3ffa-8396-5c5248f48faf",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="cdd78c94-8408-59e5-2f13-dfb5e09abfad",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Language="cdd78c94-8408-59e5-2f13-dfb5e09abfad";

@XendraTrl(Identifier="45c7b873-5437-793f-a143-625c69f8f091")
public static String es_PE_TAB_SelectLanguage_Description="Seleccione su Lenguaje";

@XendraTrl(Identifier="45c7b873-5437-793f-a143-625c69f8f091")
public static String es_PE_TAB_SelectLanguage_Name="Seleccionar Lenguaje";

@XendraTab(Name="Select Language",Description="Select your Language",
Help="The Language needs to be a (verified) System Language",
AD_Window_ID="df14488e-4347-a57d-7359-d158e6567fb8",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,
WhereClause="AD_Language.IsBaseLanguage='N' AND AD_Language.IsSystemLanguage='Y'",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="45c7b873-5437-793f-a143-625c69f8f091",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_SelectLanguage="45c7b873-5437-793f-a143-625c69f8f091";

@XendraTrl(Identifier="9f5b919f-3a26-0b79-28d5-4501b610c103")
public static String es_PE_TABLE_AD_Language_Name="Lenguaje ID";

@XendraTable(Name="Language ID",Description="",Help="",TableName="AD_Language",AccessLevel="4",
AD_Window_ID="f5b80745-d3ce-3ffa-8396-5c5248f48faf",AD_Val_Rule_ID="",IsKey=1,LoadSeq=50,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.dictionary",Identifier="9f5b919f-3a26-0b79-28d5-4501b610c103",
Synchronized="2017-08-16 11:40:26.0")
/** TableName=AD_Language */
public static final String Table_Name="AD_Language";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Language");

protected BigDecimal accessLevel = BigDecimal.valueOf(4);
/** AccessLevel
@return 4 - System 
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
    Table_ID = MTable.getTable_ID("AD_Language");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Language[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Language.
@param AD_Language Language for this entity */
public void setAD_Language (String AD_Language)
{
if (AD_Language == null) throw new IllegalArgumentException ("AD_Language is mandatory.");
if (AD_Language.length() > 6)
{
log.warning("Length > 6 - truncated");
AD_Language = AD_Language.substring(0,5);
}
set_ValueNoCheck (COLUMNNAME_AD_Language, AD_Language);
}
/** Get Language.
@return Language for this entity */
public String getAD_Language() 
{
String value = (String)get_Value(COLUMNNAME_AD_Language);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="2376716c-d47a-20cc-9978-e33584796cc5")
public static String es_PE_FIELD_Language_Language_Description="Lenguaje para esta aplicación";

@XendraTrl(Identifier="2376716c-d47a-20cc-9978-e33584796cc5")
public static String es_PE_FIELD_Language_Language_Help="El lenguaje identifica el lenguaje a usar para el despliegue";

@XendraTrl(Identifier="2376716c-d47a-20cc-9978-e33584796cc5")
public static String es_PE_FIELD_Language_Language_Name="Lenguaje";

@XendraField(AD_Column_ID="AD_Language",IsCentrallyMaintained=true,
AD_Tab_ID="cdd78c94-8408-59e5-2f13-dfb5e09abfad",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2376716c-d47a-20cc-9978-e33584796cc5")
public static final String FIELDNAME_Language_Language="2376716c-d47a-20cc-9978-e33584796cc5";

@XendraTrl(Identifier="7073acdc-79e6-cf03-880a-4f19eca37e29")
public static String es_PE_FIELD_SelectLanguage_Language_Description="Lenguaje para esta aplicación";

@XendraTrl(Identifier="7073acdc-79e6-cf03-880a-4f19eca37e29")
public static String es_PE_FIELD_SelectLanguage_Language_Help="El lenguaje identifica el lenguaje a usar para el despliegue";

@XendraTrl(Identifier="7073acdc-79e6-cf03-880a-4f19eca37e29")
public static String es_PE_FIELD_SelectLanguage_Language_Name="Lenguaje";

@XendraField(AD_Column_ID="AD_Language",IsCentrallyMaintained=true,
AD_Tab_ID="45c7b873-5437-793f-a143-625c69f8f091",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=6,IsReadOnly=true,SeqNo=40,SortNo=1,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7073acdc-79e6-cf03-880a-4f19eca37e29")
public static final String FIELDNAME_SelectLanguage_Language="7073acdc-79e6-cf03-880a-4f19eca37e29";
/** Column name AD_Language */
public static final String COLUMNNAME_AD_Language = "AD_Language";
/** Set Language ID.
@param AD_Language_ID Language ID */
public void setAD_Language_ID (int AD_Language_ID)
{
if (AD_Language_ID < 1) throw new IllegalArgumentException ("AD_Language_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Language_ID, Integer.valueOf(AD_Language_ID));
}
/** Get Language ID.
@return Language ID */
public int getAD_Language_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Language_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="03047b75-52e6-7b69-9409-34a558db23ee")
public static String es_PE_FIELD_Language_LanguageID_Name="Lenguaje ID";

@XendraField(AD_Column_ID="AD_Language_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cdd78c94-8408-59e5-2f13-dfb5e09abfad",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="03047b75-52e6-7b69-9409-34a558db23ee")
public static final String FIELDNAME_Language_LanguageID="03047b75-52e6-7b69-9409-34a558db23ee";

@XendraTrl(Identifier="7e84f36e-b097-14da-fd66-6e158cc49a8b")
public static String es_PE_FIELD_SelectLanguage_LanguageID_Name="Lenguaje ID";

@XendraField(AD_Column_ID="AD_Language_ID",IsCentrallyMaintained=true,
AD_Tab_ID="45c7b873-5437-793f-a143-625c69f8f091",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7e84f36e-b097-14da-fd66-6e158cc49a8b")
public static final String FIELDNAME_SelectLanguage_LanguageID="7e84f36e-b097-14da-fd66-6e158cc49a8b";

@XendraTrl(Identifier="a2c06de9-244e-3f58-6008-cc1417a24e96")
public static String es_PE_COLUMN_AD_Language_ID_Name="Lenguaje ID";

@XendraColumn(AD_Element_ID="bcb3e781-c6c6-fe3f-c268-1036555e7023",ColumnName="AD_Language_ID",
AD_Reference_ID=13,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT COALESCE(MAX(AD_Language_ID),0)+1 AS DefaultValue FROM AD_Language",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a2c06de9-244e-3f58-6008-cc1417a24e96",
Synchronized="2017-08-05 16:52:35.0")
/** Column name AD_Language_ID */
public static final String COLUMNNAME_AD_Language_ID = "AD_Language_ID";
/** Set ISO Country Code.
@param CountryCode Upper-case two-letter alphanumeric ISO Country code according to ISO 3166-1 - http://www.chemie.fu-berlin.de/diverse/doc/ISO_3166.html */
public void setCountryCode (String CountryCode)
{
if (CountryCode != null && CountryCode.length() > 2)
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
@XendraTrl(Identifier="36b9b227-4c2f-1fe2-0874-65a9ee694e85")
public static String es_PE_FIELD_Language_ISOCountryCode_Description="Código ISO de país alfanumérico en mayúsculas de acuerdo al ISO 3166-1 -";

@XendraTrl(Identifier="36b9b227-4c2f-1fe2-0874-65a9ee694e85")
public static String es_PE_FIELD_Language_ISOCountryCode_Help="Para detalles - http://www.din.de/gremien/nas/nabd/iso3166ma/codlstp1.html or - http://www.unece.org/trade/rec/rec03en.htm";

@XendraTrl(Identifier="36b9b227-4c2f-1fe2-0874-65a9ee694e85")
public static String es_PE_FIELD_Language_ISOCountryCode_Name="Código ISO del País";

@XendraField(AD_Column_ID="CountryCode",IsCentrallyMaintained=true,
AD_Tab_ID="cdd78c94-8408-59e5-2f13-dfb5e09abfad",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=5,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="36b9b227-4c2f-1fe2-0874-65a9ee694e85")
public static final String FIELDNAME_Language_ISOCountryCode="36b9b227-4c2f-1fe2-0874-65a9ee694e85";

@XendraTrl(Identifier="6d7b5481-5343-f39a-7a7f-26eac1390d8f")
public static String es_PE_FIELD_SelectLanguage_ISOCountryCode_Description="Código ISO de país alfanumérico en mayúsculas de acuerdo al ISO 3166-1 -";

@XendraTrl(Identifier="6d7b5481-5343-f39a-7a7f-26eac1390d8f")
public static String es_PE_FIELD_SelectLanguage_ISOCountryCode_Help="Para detalles - http://www.din.de/gremien/nas/nabd/iso3166ma/codlstp1.html or - http://www.unece.org/trade/rec/rec03en.htm";

@XendraTrl(Identifier="6d7b5481-5343-f39a-7a7f-26eac1390d8f")
public static String es_PE_FIELD_SelectLanguage_ISOCountryCode_Name="Código ISO del País";

@XendraField(AD_Column_ID="CountryCode",IsCentrallyMaintained=true,
AD_Tab_ID="45c7b873-5437-793f-a143-625c69f8f091",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=5,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6d7b5481-5343-f39a-7a7f-26eac1390d8f")
public static final String FIELDNAME_SelectLanguage_ISOCountryCode="6d7b5481-5343-f39a-7a7f-26eac1390d8f";

@XendraTrl(Identifier="22fd270e-2bf1-c4cb-9b6a-bbea70543e3d")
public static String es_PE_COLUMN_CountryCode_Name="Código ISO del País";

@XendraColumn(AD_Element_ID="45764594-a71a-901c-2c46-bb5485c061d1",ColumnName="CountryCode",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="22fd270e-2bf1-c4cb-9b6a-bbea70543e3d",
Synchronized="2017-08-05 16:52:35.0")
/** Column name CountryCode */
public static final String COLUMNNAME_CountryCode = "CountryCode";
/** Set Date Pattern.
@param DatePattern Java Date Pattern */
public void setDatePattern (String DatePattern)
{
if (DatePattern != null && DatePattern.length() > 20)
{
log.warning("Length > 20 - truncated");
DatePattern = DatePattern.substring(0,19);
}
set_Value (COLUMNNAME_DatePattern, DatePattern);
}
/** Get Date Pattern.
@return Java Date Pattern */
public String getDatePattern() 
{
String value = (String)get_Value(COLUMNNAME_DatePattern);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="bf921b49-95ef-d42d-1186-977eb84aed01")
public static String es_PE_FIELD_Language_DatePattern_Description="Patrón de la fecha en java.";

@XendraTrl(Identifier="bf921b49-95ef-d42d-1186-977eb84aed01")
public static String es_PE_FIELD_Language_DatePattern_Help="Patrón de la fecha en la notación Java. Ejemplos: dd.MM.yyyy - dd/MM/yyyySi el patrón para el lenguaje no es correcto, porfavor cree una petición en la ayuda de Adempiere con la información correcta.";

@XendraTrl(Identifier="bf921b49-95ef-d42d-1186-977eb84aed01")
public static String es_PE_FIELD_Language_DatePattern_Name="Patron de Fecha";

@XendraField(AD_Column_ID="DatePattern",IsCentrallyMaintained=true,
AD_Tab_ID="cdd78c94-8408-59e5-2f13-dfb5e09abfad",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bf921b49-95ef-d42d-1186-977eb84aed01")
public static final String FIELDNAME_Language_DatePattern="bf921b49-95ef-d42d-1186-977eb84aed01";

@XendraTrl(Identifier="bee48baa-eb7b-f97b-e969-e4f044ca4188")
public static String es_PE_FIELD_SelectLanguage_DatePattern_Description="Patrón de la fecha en java.";

@XendraTrl(Identifier="bee48baa-eb7b-f97b-e969-e4f044ca4188")
public static String es_PE_FIELD_SelectLanguage_DatePattern_Help="Patrón de la fecha en la notación Java. Ejemplos: dd.MM.yyyy - dd/MM/yyyySi el patrón para el lenguaje no es correcto, porfavor cree una petición en la ayuda de Adempiere con la información correcta.";

@XendraTrl(Identifier="bee48baa-eb7b-f97b-e969-e4f044ca4188")
public static String es_PE_FIELD_SelectLanguage_DatePattern_Name="Patron de Fecha";

@XendraField(AD_Column_ID="DatePattern",IsCentrallyMaintained=true,
AD_Tab_ID="45c7b873-5437-793f-a143-625c69f8f091",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bee48baa-eb7b-f97b-e969-e4f044ca4188")
public static final String FIELDNAME_SelectLanguage_DatePattern="bee48baa-eb7b-f97b-e969-e4f044ca4188";

@XendraTrl(Identifier="d2103327-e3bf-b255-f4c1-80b4442ab8a3")
public static String es_PE_COLUMN_DatePattern_Name="Patron de Fecha";

@XendraColumn(AD_Element_ID="dfe55ce6-acb5-2ee8-f344-aa4f49784a81",ColumnName="DatePattern",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d2103327-e3bf-b255-f4c1-80b4442ab8a3",
Synchronized="2017-08-05 16:52:36.0")
/** Column name DatePattern */
public static final String COLUMNNAME_DatePattern = "DatePattern";
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
@XendraTrl(Identifier="55a7da5a-0f70-410b-bd02-4c5e5c82c0cb")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="55a7da5a-0f70-410b-bd02-4c5e5c82c0cb",
Synchronized="2017-08-05 16:52:36.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Base Language.
@param IsBaseLanguage The system information is maintained in this language */
public void setIsBaseLanguage (boolean IsBaseLanguage)
{
set_ValueNoCheck (COLUMNNAME_IsBaseLanguage, Boolean.valueOf(IsBaseLanguage));
}
/** Get Base Language.
@return The system information is maintained in this language */
public boolean isBaseLanguage() 
{
Object oo = get_Value(COLUMNNAME_IsBaseLanguage);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="fd43a6a1-d0b4-c89a-0e2d-2aaea142c87e")
public static String es_PE_FIELD_Language_BaseLanguage_Description="La información del sistema es mantenida en este lenguaje";

@XendraTrl(Identifier="fd43a6a1-d0b4-c89a-0e2d-2aaea142c87e")
public static String es_PE_FIELD_Language_BaseLanguage_Name="Lenguaje Base";

@XendraField(AD_Column_ID="IsBaseLanguage",IsCentrallyMaintained=true,
AD_Tab_ID="cdd78c94-8408-59e5-2f13-dfb5e09abfad",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fd43a6a1-d0b4-c89a-0e2d-2aaea142c87e")
public static final String FIELDNAME_Language_BaseLanguage="fd43a6a1-d0b4-c89a-0e2d-2aaea142c87e";

@XendraTrl(Identifier="51526482-713f-3cd1-74d8-66b495e15244")
public static String es_PE_FIELD_SelectLanguage_BaseLanguage_Description="La información del sistema es mantenida en este lenguaje";

@XendraTrl(Identifier="51526482-713f-3cd1-74d8-66b495e15244")
public static String es_PE_FIELD_SelectLanguage_BaseLanguage_Name="Lenguaje Base";

@XendraField(AD_Column_ID="IsBaseLanguage",IsCentrallyMaintained=true,
AD_Tab_ID="45c7b873-5437-793f-a143-625c69f8f091",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="51526482-713f-3cd1-74d8-66b495e15244")
public static final String FIELDNAME_SelectLanguage_BaseLanguage="51526482-713f-3cd1-74d8-66b495e15244";

@XendraTrl(Identifier="64bdd279-b69a-c6f5-71c3-dc9ba4375b9f")
public static String es_PE_COLUMN_IsBaseLanguage_Name="Lenguaje Base";

@XendraColumn(AD_Element_ID="710a7999-7419-d820-1063-269872593734",ColumnName="IsBaseLanguage",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="64bdd279-b69a-c6f5-71c3-dc9ba4375b9f",
Synchronized="2017-08-05 16:52:36.0")
/** Column name IsBaseLanguage */
public static final String COLUMNNAME_IsBaseLanguage = "IsBaseLanguage";
/** Set Decimal Point.
@param IsDecimalPoint The number notation has a decimal point (no decimal comma) */
public void setIsDecimalPoint (boolean IsDecimalPoint)
{
set_Value (COLUMNNAME_IsDecimalPoint, Boolean.valueOf(IsDecimalPoint));
}
/** Get Decimal Point.
@return The number notation has a decimal point (no decimal comma) */
public boolean isDecimalPoint() 
{
Object oo = get_Value(COLUMNNAME_IsDecimalPoint);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="2a4b3816-f2ca-9618-0434-17a91dfe63f1")
public static String es_PE_FIELD_Language_DecimalPoint_Description="El número de notación tiene un punto decimal (no coma decimal)";

@XendraTrl(Identifier="2a4b3816-f2ca-9618-0434-17a91dfe63f1")
public static String es_PE_FIELD_Language_DecimalPoint_Help="Si esta seleccionada, los números son impresos con un punto decimal \".\" - Si no con una coma decimal \",\". Los mil separadores son el contrario.Si el patrón para su lenguaje no está correcto, cree por favor una petición en la ayuda de Adempiere con la información correcta.";

@XendraTrl(Identifier="2a4b3816-f2ca-9618-0434-17a91dfe63f1")
public static String es_PE_FIELD_Language_DecimalPoint_Name="Punto Decimal";

@XendraField(AD_Column_ID="IsDecimalPoint",IsCentrallyMaintained=true,
AD_Tab_ID="cdd78c94-8408-59e5-2f13-dfb5e09abfad",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2a4b3816-f2ca-9618-0434-17a91dfe63f1")
public static final String FIELDNAME_Language_DecimalPoint="2a4b3816-f2ca-9618-0434-17a91dfe63f1";

@XendraTrl(Identifier="c64d79f6-9d36-7a9f-de5b-9619a0f4c71e")
public static String es_PE_FIELD_SelectLanguage_DecimalPoint_Description="El número de notación tiene un punto decimal (no coma decimal)";

@XendraTrl(Identifier="c64d79f6-9d36-7a9f-de5b-9619a0f4c71e")
public static String es_PE_FIELD_SelectLanguage_DecimalPoint_Help="Si esta seleccionada, los números son impresos con un punto decimal \".\" - Si no con una coma decimal \",\". Los mil separadores son el contrario.Si el patrón para su lenguaje no está correcto, cree por favor una petición en la ayuda de Adempiere con la información correcta.";

@XendraTrl(Identifier="c64d79f6-9d36-7a9f-de5b-9619a0f4c71e")
public static String es_PE_FIELD_SelectLanguage_DecimalPoint_Name="Punto Decimal";

@XendraField(AD_Column_ID="IsDecimalPoint",IsCentrallyMaintained=true,
AD_Tab_ID="45c7b873-5437-793f-a143-625c69f8f091",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c64d79f6-9d36-7a9f-de5b-9619a0f4c71e")
public static final String FIELDNAME_SelectLanguage_DecimalPoint="c64d79f6-9d36-7a9f-de5b-9619a0f4c71e";

@XendraTrl(Identifier="63f82a11-2ba6-711c-0301-79ee50b71aaa")
public static String es_PE_COLUMN_IsDecimalPoint_Name="Punto Decimal";

@XendraColumn(AD_Element_ID="f01943cc-0f13-289a-5d59-b4df1b265462",ColumnName="IsDecimalPoint",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="63f82a11-2ba6-711c-0301-79ee50b71aaa",
Synchronized="2017-08-05 16:52:36.0")
/** Column name IsDecimalPoint */
public static final String COLUMNNAME_IsDecimalPoint = "IsDecimalPoint";
/** Set System Language.
@param IsSystemLanguage The screens, etc. are maintained in this Language */
public void setIsSystemLanguage (boolean IsSystemLanguage)
{
set_Value (COLUMNNAME_IsSystemLanguage, Boolean.valueOf(IsSystemLanguage));
}
/** Get System Language.
@return The screens, etc. are maintained in this Language */
public boolean isSystemLanguage() 
{
Object oo = get_Value(COLUMNNAME_IsSystemLanguage);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="c226c0ec-7c80-7493-9e05-75b843605c43")
public static String es_PE_FIELD_Language_SystemLanguage_Description="Las pantallas; etc. Son mantenidas en este lenguaje.";

@XendraTrl(Identifier="c226c0ec-7c80-7493-9e05-75b843605c43")
public static String es_PE_FIELD_Language_SystemLanguage_Help="Seleccionar; si usted quiere tener pantallas traducidas disponibles en este lenguaje. Favor de notificar al administrador del sistema que corra los scripts de mantenimiento al lenguaje para permitir el uso de este lenguaje. Si no se proporciona el lenguaje ; usted puede traducir los términos.";

@XendraTrl(Identifier="c226c0ec-7c80-7493-9e05-75b843605c43")
public static String es_PE_FIELD_Language_SystemLanguage_Name="Lenguaje del Sistema";

@XendraField(AD_Column_ID="IsSystemLanguage",IsCentrallyMaintained=true,
AD_Tab_ID="cdd78c94-8408-59e5-2f13-dfb5e09abfad",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsBaseLanguage@=N",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c226c0ec-7c80-7493-9e05-75b843605c43")
public static final String FIELDNAME_Language_SystemLanguage="c226c0ec-7c80-7493-9e05-75b843605c43";

@XendraTrl(Identifier="5b743076-e698-cf7f-6df7-543a005ff85c")
public static String es_PE_FIELD_SelectLanguage_SystemLanguage_Description="Las pantallas; etc. Son mantenidas en este lenguaje.";

@XendraTrl(Identifier="5b743076-e698-cf7f-6df7-543a005ff85c")
public static String es_PE_FIELD_SelectLanguage_SystemLanguage_Help="Seleccionar; si usted quiere tener pantallas traducidas disponibles en este lenguaje. Favor de notificar al administrador del sistema que corra los scripts de mantenimiento al lenguaje para permitir el uso de este lenguaje. Si no se proporciona el lenguaje ; usted puede traducir los términos.";

@XendraTrl(Identifier="5b743076-e698-cf7f-6df7-543a005ff85c")
public static String es_PE_FIELD_SelectLanguage_SystemLanguage_Name="Lenguaje del Sistema";

@XendraField(AD_Column_ID="IsSystemLanguage",IsCentrallyMaintained=true,
AD_Tab_ID="45c7b873-5437-793f-a143-625c69f8f091",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5b743076-e698-cf7f-6df7-543a005ff85c")
public static final String FIELDNAME_SelectLanguage_SystemLanguage="5b743076-e698-cf7f-6df7-543a005ff85c";

@XendraTrl(Identifier="aa8dda9d-a5ef-ea21-73af-d6d2738da08e")
public static String es_PE_COLUMN_IsSystemLanguage_Name="Lenguaje del Sistema";

@XendraColumn(AD_Element_ID="d5ba1742-e991-3386-eb02-376df905b7cf",ColumnName="IsSystemLanguage",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aa8dda9d-a5ef-ea21-73af-d6d2738da08e",
Synchronized="2017-08-05 16:52:36.0")
/** Column name IsSystemLanguage */
public static final String COLUMNNAME_IsSystemLanguage = "IsSystemLanguage";
/** Set ISO Language Code.
@param LanguageISO Lower-case two-letter ISO-3166 code - http://www.ics.uci.edu/pub/ietf/http/related/iso639.txt  */
public void setLanguageISO (String LanguageISO)
{
if (LanguageISO != null && LanguageISO.length() > 2)
{
log.warning("Length > 2 - truncated");
LanguageISO = LanguageISO.substring(0,1);
}
set_Value (COLUMNNAME_LanguageISO, LanguageISO);
}
/** Get ISO Language Code.
@return Lower-case two-letter ISO-3166 code - http://www.ics.uci.edu/pub/ietf/http/related/iso639.txt  */
public String getLanguageISO() 
{
String value = (String)get_Value(COLUMNNAME_LanguageISO);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="239bfc5d-4baf-5a3d-d746-535754287139")
public static String es_PE_FIELD_Language_ISOLanguageCode_Description="Código de dos letras minúsculas ISO-3166 - http://www.ics.uci.edu/pub/ietf/http/related/iso639.txt";

@XendraTrl(Identifier="239bfc5d-4baf-5a3d-d746-535754287139")
public static String es_PE_FIELD_Language_ISOLanguageCode_Help="El Código de Lenguaje ISO indica el código estándar ISO para un lenguaje en letra minúscula. La información puede ser encontrada en  http://www.ics.uci.edu/pub/ietf/http/related/iso639.txt";

@XendraTrl(Identifier="239bfc5d-4baf-5a3d-d746-535754287139")
public static String es_PE_FIELD_Language_ISOLanguageCode_Name="Código de Leguaje ISO";

@XendraField(AD_Column_ID="LanguageISO",IsCentrallyMaintained=true,
AD_Tab_ID="cdd78c94-8408-59e5-2f13-dfb5e09abfad",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=5,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="239bfc5d-4baf-5a3d-d746-535754287139")
public static final String FIELDNAME_Language_ISOLanguageCode="239bfc5d-4baf-5a3d-d746-535754287139";

@XendraTrl(Identifier="2d36530d-3c8d-c312-1224-d0284584ed83")
public static String es_PE_FIELD_SelectLanguage_ISOLanguageCode_Description="Código de dos letras minúsculas ISO-3166 - http://www.ics.uci.edu/pub/ietf/http/related/iso639.txt";

@XendraTrl(Identifier="2d36530d-3c8d-c312-1224-d0284584ed83")
public static String es_PE_FIELD_SelectLanguage_ISOLanguageCode_Help="El Código de Lenguaje ISO indica el código estándar ISO para un lenguaje en letra minúscula. La información puede ser encontrada en  http://www.ics.uci.edu/pub/ietf/http/related/iso639.txt";

@XendraTrl(Identifier="2d36530d-3c8d-c312-1224-d0284584ed83")
public static String es_PE_FIELD_SelectLanguage_ISOLanguageCode_Name="Código de Leguaje ISO";

@XendraField(AD_Column_ID="LanguageISO",IsCentrallyMaintained=true,
AD_Tab_ID="45c7b873-5437-793f-a143-625c69f8f091",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=5,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2d36530d-3c8d-c312-1224-d0284584ed83")
public static final String FIELDNAME_SelectLanguage_ISOLanguageCode="2d36530d-3c8d-c312-1224-d0284584ed83";

@XendraTrl(Identifier="fbc9c1a3-942b-3890-5d03-046d8c61c77a")
public static String es_PE_COLUMN_LanguageISO_Name="Código de Leguaje ISO";

@XendraColumn(AD_Element_ID="d37db5eb-bc12-d1af-14b9-70f46bc8b440",ColumnName="LanguageISO",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fbc9c1a3-942b-3890-5d03-046d8c61c77a",
Synchronized="2017-08-05 16:52:36.0")
/** Column name LanguageISO */
public static final String COLUMNNAME_LanguageISO = "LanguageISO";
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

@XendraTrl(Identifier="d0500c01-2450-23fa-e51d-00901d43a0c7")
public static String es_PE_FIELD_Language_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="d0500c01-2450-23fa-e51d-00901d43a0c7")
public static String es_PE_FIELD_Language_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="d0500c01-2450-23fa-e51d-00901d43a0c7")
public static String es_PE_FIELD_Language_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="cdd78c94-8408-59e5-2f13-dfb5e09abfad",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d0500c01-2450-23fa-e51d-00901d43a0c7")
public static final String FIELDNAME_Language_Name="d0500c01-2450-23fa-e51d-00901d43a0c7";

@XendraTrl(Identifier="355c7c80-196e-8bdb-fc33-bc6786d62352")
public static String es_PE_FIELD_SelectLanguage_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="355c7c80-196e-8bdb-fc33-bc6786d62352")
public static String es_PE_FIELD_SelectLanguage_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="355c7c80-196e-8bdb-fc33-bc6786d62352")
public static String es_PE_FIELD_SelectLanguage_Name_Name="Nombre";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="45c7b873-5437-793f-a143-625c69f8f091",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="355c7c80-196e-8bdb-fc33-bc6786d62352")
public static final String FIELDNAME_SelectLanguage_Name="355c7c80-196e-8bdb-fc33-bc6786d62352";

@XendraTrl(Identifier="bb589c71-c979-31c8-99f1-a7cb3439f843")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bb589c71-c979-31c8-99f1-a7cb3439f843",
Synchronized="2017-08-05 16:52:36.0")
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

@XendraTrl(Identifier="0854d4ac-4a64-fc00-199e-6f01b2266b0c")
public static String es_PE_FIELD_Language_ProcessNow_Description="Verificar existencia de lenguaje de traducción en el sistema (se requiere despues de la creación de un nuevo lenguaje)";

@XendraTrl(Identifier="0854d4ac-4a64-fc00-199e-6f01b2266b0c")
public static String es_PE_FIELD_Language_ProcessNow_Help="Verificar la Traducción crea los registros de traducción faltántes. Arranque este proceso después de crear un nuevo lenguaje. El proceso crea los registros copiando de las entradas del lenguaje base";

@XendraTrl(Identifier="0854d4ac-4a64-fc00-199e-6f01b2266b0c")
public static String es_PE_FIELD_Language_ProcessNow_Name="Verificar Lenguajes";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="cdd78c94-8408-59e5-2f13-dfb5e09abfad",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0854d4ac-4a64-fc00-199e-6f01b2266b0c")
public static final String FIELDNAME_Language_ProcessNow="0854d4ac-4a64-fc00-199e-6f01b2266b0c";

@XendraTrl(Identifier="c266d318-c444-e7c7-f983-f1dc9f8e853d")
public static String es_PE_FIELD_SelectLanguage_ProcessNow_Description="Verificar existencia de lenguaje de traducción en el sistema (se requiere despues de la creación de un nuevo lenguaje)";

@XendraTrl(Identifier="c266d318-c444-e7c7-f983-f1dc9f8e853d")
public static String es_PE_FIELD_SelectLanguage_ProcessNow_Help="Verificar la Traducción crea los registros de traducción faltántes. Arranque este proceso después de crear un nuevo lenguaje. El proceso crea los registros copiando de las entradas del lenguaje base";

@XendraTrl(Identifier="c266d318-c444-e7c7-f983-f1dc9f8e853d")
public static String es_PE_FIELD_SelectLanguage_ProcessNow_Name="Verificar Lenguajes";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="45c7b873-5437-793f-a143-625c69f8f091",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c266d318-c444-e7c7-f983-f1dc9f8e853d")
public static final String FIELDNAME_SelectLanguage_ProcessNow="c266d318-c444-e7c7-f983-f1dc9f8e853d";

@XendraTrl(Identifier="2ab8de70-e60b-4b0f-e734-0cca3384efa8")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="c7d8cf3b-378e-8b3d-70d3-92487f03da1d",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2ab8de70-e60b-4b0f-e734-0cca3384efa8",Synchronized="2017-08-05 16:52:36.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Time Pattern.
@param TimePattern Java Time Pattern */
public void setTimePattern (String TimePattern)
{
if (TimePattern != null && TimePattern.length() > 20)
{
log.warning("Length > 20 - truncated");
TimePattern = TimePattern.substring(0,19);
}
set_Value (COLUMNNAME_TimePattern, TimePattern);
}
/** Get Time Pattern.
@return Java Time Pattern */
public String getTimePattern() 
{
String value = (String)get_Value(COLUMNNAME_TimePattern);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="68e73b24-8836-1950-a9bf-2a39f448ea9b")
public static String es_PE_FIELD_Language_TimePattern_Description="Patrón de tiempo en Java.";

@XendraTrl(Identifier="68e73b24-8836-1950-a9bf-2a39f448ea9b")
public static String es_PE_FIELD_Language_TimePattern_Help="Patrón de tiempo en notación Java. Ejemplos: \"hh:mm:ss aaa z\" - \"HH:mm:ss\"Si el patrón del lenguaje no es correcto, porfavor cree una petición en la ayuda de Adempiere con la información correcta.";

@XendraTrl(Identifier="68e73b24-8836-1950-a9bf-2a39f448ea9b")
public static String es_PE_FIELD_Language_TimePattern_Name="Patrón de Tiempo";

@XendraField(AD_Column_ID="TimePattern",IsCentrallyMaintained=true,
AD_Tab_ID="cdd78c94-8408-59e5-2f13-dfb5e09abfad",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="68e73b24-8836-1950-a9bf-2a39f448ea9b")
public static final String FIELDNAME_Language_TimePattern="68e73b24-8836-1950-a9bf-2a39f448ea9b";

@XendraTrl(Identifier="201b27f7-a4e0-1062-bccf-30e9b5c9d1c3")
public static String es_PE_FIELD_SelectLanguage_TimePattern_Description="Patrón de tiempo en Java.";

@XendraTrl(Identifier="201b27f7-a4e0-1062-bccf-30e9b5c9d1c3")
public static String es_PE_FIELD_SelectLanguage_TimePattern_Help="Patrón de tiempo en notación Java. Ejemplos: \"hh:mm:ss aaa z\" - \"HH:mm:ss\"Si el patrón del lenguaje no es correcto, porfavor cree una petición en la ayuda de Adempiere con la información correcta.";

@XendraTrl(Identifier="201b27f7-a4e0-1062-bccf-30e9b5c9d1c3")
public static String es_PE_FIELD_SelectLanguage_TimePattern_Name="Patrón de Tiempo";

@XendraField(AD_Column_ID="TimePattern",IsCentrallyMaintained=true,
AD_Tab_ID="45c7b873-5437-793f-a143-625c69f8f091",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="201b27f7-a4e0-1062-bccf-30e9b5c9d1c3")
public static final String FIELDNAME_SelectLanguage_TimePattern="201b27f7-a4e0-1062-bccf-30e9b5c9d1c3";

@XendraTrl(Identifier="800b9bb3-e481-8449-e316-a5c2ff2212d2")
public static String es_PE_COLUMN_TimePattern_Name="Patrón de Tiempo";

@XendraColumn(AD_Element_ID="d56a1248-c68b-262e-2550-a5f1cecc463b",ColumnName="TimePattern",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="800b9bb3-e481-8449-e316-a5c2ff2212d2",
Synchronized="2017-08-05 16:52:36.0")
/** Column name TimePattern */
public static final String COLUMNNAME_TimePattern = "TimePattern";
}
