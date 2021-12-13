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
/** Generated Model for C_SubscriptionType
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_SubscriptionType extends PO
{
/** Standard Constructor
@param ctx context
@param C_SubscriptionType_ID id
@param trxName transaction
*/
public X_C_SubscriptionType (Properties ctx, int C_SubscriptionType_ID, String trxName)
{
super (ctx, C_SubscriptionType_ID, trxName);
/** if (C_SubscriptionType_ID == 0)
{
setC_SubscriptionType_ID (0);
setFrequency (0);
setFrequencyType (null);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_SubscriptionType (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=668 */
public static int Table_ID=MTable.getTable_ID("C_SubscriptionType");

@XendraTrl(Identifier="80826a44-99df-9b1a-7ea4-8bf985550935")
public static String es_PE_TAB_SubscriptionType_Description="Tipo de Suscripción";

@XendraTrl(Identifier="80826a44-99df-9b1a-7ea4-8bf985550935")
public static String es_PE_TAB_SubscriptionType_Help="Tipo de la suscripción y frecuencia de la renovación.";

@XendraTrl(Identifier="80826a44-99df-9b1a-7ea4-8bf985550935")
public static String es_PE_TAB_SubscriptionType_Name="Tipo de Suscripción";

@XendraTab(Name="Subscription Type",Description="Type of subscription",
Help="Subscription type and renewal frequency",AD_Window_ID="e94c5a67-b794-a034-0401-5d53fd62b4de",
SeqNo=10,TabLevel=0,IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="",HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="80826a44-99df-9b1a-7ea4-8bf985550935",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_SubscriptionType="80826a44-99df-9b1a-7ea4-8bf985550935";

@XendraTrl(Identifier="3372fa5a-fe04-ed67-4610-0a0261a48511")
public static String es_PE_TABLE_C_SubscriptionType_Name="Tipo de suscripción ";

@XendraTable(Name="Subscription Type",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Type of subscription",Help="",
TableName="C_SubscriptionType",AccessLevel="2",AD_Window_ID="e94c5a67-b794-a034-0401-5d53fd62b4de",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=85,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="3372fa5a-fe04-ed67-4610-0a0261a48511",Synchronized="2020-03-03 21:37:42.0")
/** TableName=C_SubscriptionType */
public static final String Table_Name="C_SubscriptionType";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_SubscriptionType");

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
    Table_ID = MTable.getTable_ID("C_SubscriptionType");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_SubscriptionType[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Subscription Type.
@param C_SubscriptionType_ID Type of subscription */
public void setC_SubscriptionType_ID (int C_SubscriptionType_ID)
{
if (C_SubscriptionType_ID < 1) throw new IllegalArgumentException ("C_SubscriptionType_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_SubscriptionType_ID, Integer.valueOf(C_SubscriptionType_ID));
}
/** Get Subscription Type.
@return Type of subscription */
public int getC_SubscriptionType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_SubscriptionType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f0d9a296-e493-de5a-be22-56621e7af5fc")
public static String es_PE_FIELD_SubscriptionType_SubscriptionType_Name="Tipo de suscripción ";

@XendraTrl(Identifier="f0d9a296-e493-de5a-be22-56621e7af5fc")
public static String es_PE_FIELD_SubscriptionType_SubscriptionType_Description="Tipo de suscripción ";

@XendraTrl(Identifier="f0d9a296-e493-de5a-be22-56621e7af5fc")
public static String es_PE_FIELD_SubscriptionType_SubscriptionType_Help="Tipo de suscripción y frecuencia de la renovación.";

@XendraField(AD_Column_ID="C_SubscriptionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="80826a44-99df-9b1a-7ea4-8bf985550935",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f0d9a296-e493-de5a-be22-56621e7af5fc")
public static final String FIELDNAME_SubscriptionType_SubscriptionType="f0d9a296-e493-de5a-be22-56621e7af5fc";
/** Column name C_SubscriptionType_ID */
public static final String COLUMNNAME_C_SubscriptionType_ID = "C_SubscriptionType_ID";
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

@XendraTrl(Identifier="2f612345-18e9-42ad-69d9-a2db27fc057b")
public static String es_PE_FIELD_SubscriptionType_Description_Name="Observación";

@XendraTrl(Identifier="2f612345-18e9-42ad-69d9-a2db27fc057b")
public static String es_PE_FIELD_SubscriptionType_Description_Description="Observación";

@XendraTrl(Identifier="2f612345-18e9-42ad-69d9-a2db27fc057b")
public static String es_PE_FIELD_SubscriptionType_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="80826a44-99df-9b1a-7ea4-8bf985550935",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2f612345-18e9-42ad-69d9-a2db27fc057b")
public static final String FIELDNAME_SubscriptionType_Description="2f612345-18e9-42ad-69d9-a2db27fc057b";

@XendraTrl(Identifier="2da67d8f-5a91-ba6a-6ae1-a90785179c26")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2da67d8f-5a91-ba6a-6ae1-a90785179c26",
Synchronized="2019-08-30 22:22:19.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Frequency.
@param Frequency Frequency of events */
public void setFrequency (int Frequency)
{
set_Value (COLUMNNAME_Frequency, Integer.valueOf(Frequency));
}
/** Get Frequency.
@return Frequency of events */
public int getFrequency() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Frequency);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3a9e5582-5675-7b55-7187-44231cc1d295")
public static String es_PE_FIELD_SubscriptionType_Frequency_Name="Frecuencia";

@XendraTrl(Identifier="3a9e5582-5675-7b55-7187-44231cc1d295")
public static String es_PE_FIELD_SubscriptionType_Frequency_Description="Frecuencia de proceso del requerimiento";

@XendraTrl(Identifier="3a9e5582-5675-7b55-7187-44231cc1d295")
public static String es_PE_FIELD_SubscriptionType_Frequency_Help="La Frecuencia se usa junto con el tipo de frecuencia para determinar cuando un requerimiento será procesado.";

@XendraField(AD_Column_ID="Frequency",IsCentrallyMaintained=true,
AD_Tab_ID="80826a44-99df-9b1a-7ea4-8bf985550935",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3a9e5582-5675-7b55-7187-44231cc1d295")
public static final String FIELDNAME_SubscriptionType_Frequency="3a9e5582-5675-7b55-7187-44231cc1d295";

@XendraTrl(Identifier="70305410-d1f2-feef-2007-cbb51be680e1")
public static String es_PE_COLUMN_Frequency_Name="Frecuencia";

@XendraColumn(AD_Element_ID="cd717b11-c45b-527f-9abd-4533f87b759f",ColumnName="Frequency",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="70305410-d1f2-feef-2007-cbb51be680e1",
Synchronized="2019-08-30 22:22:19.0")
/** Column name Frequency */
public static final String COLUMNNAME_Frequency = "Frequency";
/** Set Frequency Type.
@param FrequencyType Frequency of event */
public void setFrequencyType (String FrequencyType)
{
if (FrequencyType.length() > 1)
{
log.warning("Length > 1 - truncated");
FrequencyType = FrequencyType.substring(0,0);
}
set_Value (COLUMNNAME_FrequencyType, FrequencyType);
}
/** Get Frequency Type.
@return Frequency of event */
public String getFrequencyType() 
{
return (String)get_Value(COLUMNNAME_FrequencyType);
}

@XendraTrl(Identifier="541c6fbc-8384-f011-0286-9b233f5ea9f6")
public static String es_PE_FIELD_SubscriptionType_FrequencyType_Name="Tipo de Frecuencia";

@XendraTrl(Identifier="541c6fbc-8384-f011-0286-9b233f5ea9f6")
public static String es_PE_FIELD_SubscriptionType_FrequencyType_Description="Frecuencia de cálculo";

@XendraTrl(Identifier="541c6fbc-8384-f011-0286-9b233f5ea9f6")
public static String es_PE_FIELD_SubscriptionType_FrequencyType_Help="El Tipo de frecuencia se usa para calcular las fechas de inicio y fin del cálculo";

@XendraField(AD_Column_ID="FrequencyType",IsCentrallyMaintained=true,
AD_Tab_ID="80826a44-99df-9b1a-7ea4-8bf985550935",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="541c6fbc-8384-f011-0286-9b233f5ea9f6")
public static final String FIELDNAME_SubscriptionType_FrequencyType="541c6fbc-8384-f011-0286-9b233f5ea9f6";

@XendraTrl(Identifier="5d32f117-924f-3cfc-d7c6-d623cf309973")
public static String es_PE_COLUMN_FrequencyType_Name="Tipo de Frecuencia";

@XendraColumn(AD_Element_ID="d2dcc6d7-4c3b-0646-5dc8-3df7514121af",ColumnName="FrequencyType",
AD_Reference_ID=17,AD_Reference_Value_ID="a8e24598-16fb-a392-7587-12a112938032",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5d32f117-924f-3cfc-d7c6-d623cf309973",Synchronized="2019-08-30 22:22:19.0")
/** Column name FrequencyType */
public static final String COLUMNNAME_FrequencyType = "FrequencyType";
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
@XendraTrl(Identifier="375d7816-beb9-4018-b1bb-c18573b22a7f")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="375d7816-beb9-4018-b1bb-c18573b22a7f",
Synchronized="2019-08-30 22:22:19.0")
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

@XendraTrl(Identifier="d9053f92-e8f4-a545-51a5-cb5f3d13f87a")
public static String es_PE_FIELD_SubscriptionType_Name_Name="Nombre";

@XendraTrl(Identifier="d9053f92-e8f4-a545-51a5-cb5f3d13f87a")
public static String es_PE_FIELD_SubscriptionType_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="d9053f92-e8f4-a545-51a5-cb5f3d13f87a")
public static String es_PE_FIELD_SubscriptionType_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="80826a44-99df-9b1a-7ea4-8bf985550935",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d9053f92-e8f4-a545-51a5-cb5f3d13f87a")
public static final String FIELDNAME_SubscriptionType_Name="d9053f92-e8f4-a545-51a5-cb5f3d13f87a";

@XendraTrl(Identifier="1c605619-0a4c-29c7-b9dd-ed010383a5ed")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1c605619-0a4c-29c7-b9dd-ed010383a5ed",
Synchronized="2019-08-30 22:22:19.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
