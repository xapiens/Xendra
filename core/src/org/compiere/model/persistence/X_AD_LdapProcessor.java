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
/** Generated Model for AD_LdapProcessor
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_LdapProcessor extends PO
{
/** Standard Constructor
@param ctx context
@param AD_LdapProcessor_ID id
@param trxName transaction
*/
public X_AD_LdapProcessor (Properties ctx, int AD_LdapProcessor_ID, String trxName)
{
super (ctx, AD_LdapProcessor_ID, trxName);
/** if (AD_LdapProcessor_ID == 0)
{
setAD_LdapProcessor_ID (0);
setKeepLogDays (0);	
// 7
setLdapPort (0);	
// 389
setName (null);
setSupervisor_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_LdapProcessor (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=902 */
public static int Table_ID=MTable.getTable_ID("AD_LdapProcessor");

@XendraTrl(Identifier="35d0068e-bda0-6b5e-654f-db215d785854")
public static String es_PE_TAB_LDAPServer_Description="LDAP Server to authenticate and authorize external systems based on Adempiere";

@XendraTrl(Identifier="35d0068e-bda0-6b5e-654f-db215d785854")
public static String es_PE_TAB_LDAPServer_Help="The LDAP Server allows third party software (e.g. Apache) to use the users defined in the system to authentificate and authorize them.  There is only one server per Adempiere system.  The \"o\" is the Client key and the optional \"ou\" is the Interest Area key.";

@XendraTrl(Identifier="35d0068e-bda0-6b5e-654f-db215d785854")
public static String es_PE_TAB_LDAPServer_Name="LDAP Server";
@XendraTab(Name="LDAP Server",
Description="LDAP Server to authenticate and authorize external systems based on Adempiere",
Help="The LDAP Server allows third party software (e.g. Apache) to use the users defined in the system to authentificate and authorize them.  There is only one server per Adempiere system.  The 'o' is the Client key and the optional 'ou' is the Interest Area key.",
AD_Window_ID="b45775b7-8403-9bf8-5c4b-5c1f444c8e82",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="35d0068e-bda0-6b5e-654f-db215d785854",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_LDAPServer="35d0068e-bda0-6b5e-654f-db215d785854";

@XendraTrl(Identifier="e0066b35-acb3-f0f4-aa07-32ed7ef8bde8")
public static String es_PE_TABLE_AD_LdapProcessor_Name="Ldap Processor";

@XendraTable(Name="Ldap Processor",Description="LDAP Server",Help="",TableName="AD_LdapProcessor",
AccessLevel="4",AD_Window_ID="b45775b7-8403-9bf8-5c4b-5c1f444c8e82",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="e0066b35-acb3-f0f4-aa07-32ed7ef8bde8",Synchronized="2017-10-04 18:33:35.0")
/** TableName=AD_LdapProcessor */
public static final String Table_Name="AD_LdapProcessor";


@XendraIndex(Name="ad_ldapprocessorport",Identifier="ab52c666-12df-9072-9dea-7426a872bc26",
Column_Names="ldapport",IsUnique="true",TableIdentifier="ab52c666-12df-9072-9dea-7426a872bc26",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_ldapprocessorport = "ab52c666-12df-9072-9dea-7426a872bc26";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_LdapProcessor");

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
    Table_ID = MTable.getTable_ID("AD_LdapProcessor");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_LdapProcessor[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Ldap Processor.
@param AD_LdapProcessor_ID LDAP Server to authenticate and authorize external systems based on Adempiere */
public void setAD_LdapProcessor_ID (int AD_LdapProcessor_ID)
{
if (AD_LdapProcessor_ID < 1) throw new IllegalArgumentException ("AD_LdapProcessor_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_LdapProcessor_ID, Integer.valueOf(AD_LdapProcessor_ID));
}
/** Get Ldap Processor.
@return LDAP Server to authenticate and authorize external systems based on Adempiere */
public int getAD_LdapProcessor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_LdapProcessor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f3a1600e-b49c-8e94-ae50-156aff27d55a")
public static String es_PE_FIELD_LDAPServer_LdapProcessor_Name="Ldap Processor";

@XendraTrl(Identifier="f3a1600e-b49c-8e94-ae50-156aff27d55a")
public static String es_PE_FIELD_LDAPServer_LdapProcessor_Description="LDAP Server to authenticate and authorize external systems based on Adempiere";

@XendraTrl(Identifier="f3a1600e-b49c-8e94-ae50-156aff27d55a")
public static String es_PE_FIELD_LDAPServer_LdapProcessor_Help="The LDAP Server allows third party software (e.g. Apache) to use the users defined in the system to authentificate and authorize them.  There is only one server per Adempiere system.  The \"o\" is the Client key and the optional \"ou\" is the Interest Area key.";

@XendraField(AD_Column_ID="AD_LdapProcessor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="35d0068e-bda0-6b5e-654f-db215d785854",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f3a1600e-b49c-8e94-ae50-156aff27d55a")
public static final String FIELDNAME_LDAPServer_LdapProcessor="f3a1600e-b49c-8e94-ae50-156aff27d55a";
/** Column name AD_LdapProcessor_ID */
public static final String COLUMNNAME_AD_LdapProcessor_ID = "AD_LdapProcessor_ID";
/** Set Date last run.
@param DateLastRun Date the process was last run. */
public void setDateLastRun (Timestamp DateLastRun)
{
set_Value (COLUMNNAME_DateLastRun, DateLastRun);
}
/** Get Date last run.
@return Date the process was last run. */
public Timestamp getDateLastRun() 
{
return (Timestamp)get_Value(COLUMNNAME_DateLastRun);
}

@XendraTrl(Identifier="e7abfea7-f1dd-9c45-ff60-5c847b36caf2")
public static String es_PE_FIELD_LDAPServer_DateLastRun_Name="Última Fecha de Corrida";

@XendraTrl(Identifier="e7abfea7-f1dd-9c45-ff60-5c847b36caf2")
public static String es_PE_FIELD_LDAPServer_DateLastRun_Description="Fecha en que el proceso fue corrido por última vez";

@XendraTrl(Identifier="e7abfea7-f1dd-9c45-ff60-5c847b36caf2")
public static String es_PE_FIELD_LDAPServer_DateLastRun_Help="La fecha de última corrida indica la última vez que se corrió un proceso";

@XendraField(AD_Column_ID="DateLastRun",IsCentrallyMaintained=true,
AD_Tab_ID="35d0068e-bda0-6b5e-654f-db215d785854",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=7,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e7abfea7-f1dd-9c45-ff60-5c847b36caf2")
public static final String FIELDNAME_LDAPServer_DateLastRun="e7abfea7-f1dd-9c45-ff60-5c847b36caf2";

@XendraTrl(Identifier="e2755d07-ecd3-7d27-fc91-3534dd93fe8d")
public static String es_PE_COLUMN_DateLastRun_Name="Última Fecha de Corrida";

@XendraColumn(AD_Element_ID="e4c09739-6370-19ca-fdeb-4cdf8025abb8",ColumnName="DateLastRun",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e2755d07-ecd3-7d27-fc91-3534dd93fe8d",
Synchronized="2017-08-28 09:54:34.0")
/** Column name DateLastRun */
public static final String COLUMNNAME_DateLastRun = "DateLastRun";
/** Set Date next run.
@param DateNextRun Date the process will run next */
public void setDateNextRun (Timestamp DateNextRun)
{
set_Value (COLUMNNAME_DateNextRun, DateNextRun);
}
/** Get Date next run.
@return Date the process will run next */
public Timestamp getDateNextRun() 
{
return (Timestamp)get_Value(COLUMNNAME_DateNextRun);
}

@XendraTrl(Identifier="24089ff0-7017-3f1b-06de-e1c351722618")
public static String es_PE_FIELD_LDAPServer_DateNextRun_Name="Siguiente Fecha de Corrida";

@XendraTrl(Identifier="24089ff0-7017-3f1b-06de-e1c351722618")
public static String es_PE_FIELD_LDAPServer_DateNextRun_Description="Fecha en que el proceso será corrido la siguiente vez";

@XendraTrl(Identifier="24089ff0-7017-3f1b-06de-e1c351722618")
public static String es_PE_FIELD_LDAPServer_DateNextRun_Help="La fecha de la siguiente corrida indica la siguiente vez que este proceso se correrá.";

@XendraField(AD_Column_ID="DateNextRun",IsCentrallyMaintained=true,
AD_Tab_ID="35d0068e-bda0-6b5e-654f-db215d785854",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=7,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="24089ff0-7017-3f1b-06de-e1c351722618")
public static final String FIELDNAME_LDAPServer_DateNextRun="24089ff0-7017-3f1b-06de-e1c351722618";

@XendraTrl(Identifier="57273b9d-1b63-eef3-aee3-d01f75c21fa8")
public static String es_PE_COLUMN_DateNextRun_Name="Siguiente Fecha de Corrida";

@XendraColumn(AD_Element_ID="215eac34-7f19-f6b2-ebeb-e6fbdb06d7ee",ColumnName="DateNextRun",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="57273b9d-1b63-eef3-aee3-d01f75c21fa8",
Synchronized="2017-08-28 09:54:34.0")
/** Column name DateNextRun */
public static final String COLUMNNAME_DateNextRun = "DateNextRun";
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

@XendraTrl(Identifier="1858f028-13ec-d7ce-a0fb-a88664537c26")
public static String es_PE_FIELD_LDAPServer_Description_Name="Observación";

@XendraTrl(Identifier="1858f028-13ec-d7ce-a0fb-a88664537c26")
public static String es_PE_FIELD_LDAPServer_Description_Description="Observación";

@XendraTrl(Identifier="1858f028-13ec-d7ce-a0fb-a88664537c26")
public static String es_PE_FIELD_LDAPServer_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="35d0068e-bda0-6b5e-654f-db215d785854",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1858f028-13ec-d7ce-a0fb-a88664537c26")
public static final String FIELDNAME_LDAPServer_Description="1858f028-13ec-d7ce-a0fb-a88664537c26";

@XendraTrl(Identifier="c7d47334-376f-aa73-144d-b5047f5ac8b3")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c7d47334-376f-aa73-144d-b5047f5ac8b3",
Synchronized="2017-08-28 09:54:34.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set FrequencyStartAt.
@param FrequencyStartAt FrequencyStartAt */
public void setFrequencyStartAt (int FrequencyStartAt)
{
set_Value (COLUMNNAME_FrequencyStartAt, Integer.valueOf(FrequencyStartAt));
}
/** Get FrequencyStartAt.
@return FrequencyStartAt */
public int getFrequencyStartAt() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_FrequencyStartAt);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a85b76d7-9e62-42c0-b687-65d3f1bc909d")
public static String es_PE_COLUMN_FrequencyStartAt_Name="FrequencyStartAt";

@XendraColumn(AD_Element_ID="42d884cb-6480-428f-bef3-5e0802c0de5b",ColumnName="FrequencyStartAt",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a85b76d7-9e62-42c0-b687-65d3f1bc909d",
Synchronized="2017-10-04 18:31:00.0")
/** Column name FrequencyStartAt */
public static final String COLUMNNAME_FrequencyStartAt = "FrequencyStartAt";
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
@XendraTrl(Identifier="44c87f22-855b-4011-b9d0-2047acec0216")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="44c87f22-855b-4011-b9d0-2047acec0216",
Synchronized="2017-08-28 09:54:34.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Days to keep Log.
@param KeepLogDays Number of days to keep the log entries */
public void setKeepLogDays (int KeepLogDays)
{
set_Value (COLUMNNAME_KeepLogDays, Integer.valueOf(KeepLogDays));
}
/** Get Days to keep Log.
@return Number of days to keep the log entries */
public int getKeepLogDays() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_KeepLogDays);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="12f7f57d-7a4c-785d-7ca7-cf6d5ee35b0b")
public static String es_PE_FIELD_LDAPServer_DaysToKeepLog_Name="Días para guardar el registro";

@XendraTrl(Identifier="12f7f57d-7a4c-785d-7ca7-cf6d5ee35b0b")
public static String es_PE_FIELD_LDAPServer_DaysToKeepLog_Description="Número de días para guardar las entradas del registro";

@XendraTrl(Identifier="12f7f57d-7a4c-785d-7ca7-cf6d5ee35b0b")
public static String es_PE_FIELD_LDAPServer_DaysToKeepLog_Help="Las entradas de un registro mas viejo pueden ser suprimidas";

@XendraField(AD_Column_ID="KeepLogDays",IsCentrallyMaintained=true,
AD_Tab_ID="35d0068e-bda0-6b5e-654f-db215d785854",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="12f7f57d-7a4c-785d-7ca7-cf6d5ee35b0b")
public static final String FIELDNAME_LDAPServer_DaysToKeepLog="12f7f57d-7a4c-785d-7ca7-cf6d5ee35b0b";

@XendraTrl(Identifier="7957b575-791b-230c-a4f4-6595c9a823f8")
public static String es_PE_COLUMN_KeepLogDays_Name="Días para guardar el registro";

@XendraColumn(AD_Element_ID="5f6abdde-d6c5-cc1d-af35-b05c5b66edd5",ColumnName="KeepLogDays",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="7",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7957b575-791b-230c-a4f4-6595c9a823f8",
Synchronized="2017-08-28 09:54:34.0")
/** Column name KeepLogDays */
public static final String COLUMNNAME_KeepLogDays = "KeepLogDays";
/** Set Ldap Port.
@param LdapPort The port the server is listening */
public void setLdapPort (int LdapPort)
{
set_Value (COLUMNNAME_LdapPort, Integer.valueOf(LdapPort));
}
/** Get Ldap Port.
@return The port the server is listening */
public int getLdapPort() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_LdapPort);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0d8081cd-99d8-fef8-2f13-3dabce15443b")
public static String es_PE_FIELD_LDAPServer_LdapPort_Name="Ldap Port";

@XendraTrl(Identifier="0d8081cd-99d8-fef8-2f13-3dabce15443b")
public static String es_PE_FIELD_LDAPServer_LdapPort_Description="The port the server is listening";

@XendraTrl(Identifier="0d8081cd-99d8-fef8-2f13-3dabce15443b")
public static String es_PE_FIELD_LDAPServer_LdapPort_Help="The default LDAP port is 389";

@XendraField(AD_Column_ID="LdapPort",IsCentrallyMaintained=true,
AD_Tab_ID="35d0068e-bda0-6b5e-654f-db215d785854",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0d8081cd-99d8-fef8-2f13-3dabce15443b")
public static final String FIELDNAME_LDAPServer_LdapPort="0d8081cd-99d8-fef8-2f13-3dabce15443b";

@XendraTrl(Identifier="d7079508-b5f7-4ea1-ecf3-d32c3b15f4bb")
public static String es_PE_COLUMN_LdapPort_Name="Ldap Port";

@XendraColumn(AD_Element_ID="ffc57662-ee93-497f-ce38-32c2803d31d9",ColumnName="LdapPort",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="389",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d7079508-b5f7-4ea1-ecf3-d32c3b15f4bb",
Synchronized="2017-08-28 09:54:34.0")
/** Column name LdapPort */
public static final String COLUMNNAME_LdapPort = "LdapPort";
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

@XendraTrl(Identifier="884a9edd-a6ee-2eba-90cb-51e13e3f932c")
public static String es_PE_FIELD_LDAPServer_Name_Name="Nombre";

@XendraTrl(Identifier="884a9edd-a6ee-2eba-90cb-51e13e3f932c")
public static String es_PE_FIELD_LDAPServer_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="884a9edd-a6ee-2eba-90cb-51e13e3f932c")
public static String es_PE_FIELD_LDAPServer_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="35d0068e-bda0-6b5e-654f-db215d785854",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="884a9edd-a6ee-2eba-90cb-51e13e3f932c")
public static final String FIELDNAME_LDAPServer_Name="884a9edd-a6ee-2eba-90cb-51e13e3f932c";

@XendraTrl(Identifier="619e1c04-009c-4004-4e43-a87b097a9086")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="619e1c04-009c-4004-4e43-a87b097a9086",
Synchronized="2017-08-28 09:54:34.0")
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

@XendraTrl(Identifier="5832b862-6bbf-5ddc-9a87-a6c98a3cb6a6")
public static String es_PE_FIELD_LDAPServer_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="35d0068e-bda0-6b5e-654f-db215d785854",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5832b862-6bbf-5ddc-9a87-a6c98a3cb6a6")
public static final String FIELDNAME_LDAPServer_ProcessNow="5832b862-6bbf-5ddc-9a87-a6c98a3cb6a6";

@XendraTrl(Identifier="70a26777-f68a-320e-f6d9-afa095337971")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="70a26777-f68a-320e-f6d9-afa095337971",
Synchronized="2017-08-28 09:54:34.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";

/** Supervisor_ID AD_Reference=606fce88-e8f3-4df6-0617-746fb6a85b2b */
public static final int SUPERVISOR_ID_AD_Reference_ID=110;
/** Set Supervisor.
@param Supervisor_ID Supervisor for this user/organization - used for escalation and approval */
public void setSupervisor_ID (int Supervisor_ID)
{
if (Supervisor_ID < 1) throw new IllegalArgumentException ("Supervisor_ID is mandatory.");
set_Value (COLUMNNAME_Supervisor_ID, Integer.valueOf(Supervisor_ID));
}
/** Get Supervisor.
@return Supervisor for this user/organization - used for escalation and approval */
public int getSupervisor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Supervisor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="78f104a7-117e-afdd-dbe9-50e5551090c0")
public static String es_PE_FIELD_LDAPServer_Supervisor_Name="Supervisor";

@XendraTrl(Identifier="78f104a7-117e-afdd-dbe9-50e5551090c0")
public static String es_PE_FIELD_LDAPServer_Supervisor_Description="Supervisor para este usuario - usado para escalación";

@XendraTrl(Identifier="78f104a7-117e-afdd-dbe9-50e5551090c0")
public static String es_PE_FIELD_LDAPServer_Supervisor_Help="El supervisor indica quien será usado para reenviar y escalar emisiones este usuario.";

@XendraField(AD_Column_ID="Supervisor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="35d0068e-bda0-6b5e-654f-db215d785854",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="78f104a7-117e-afdd-dbe9-50e5551090c0")
public static final String FIELDNAME_LDAPServer_Supervisor="78f104a7-117e-afdd-dbe9-50e5551090c0";

@XendraTrl(Identifier="1e789170-89be-b8d1-b50c-d46a81be0b7a")
public static String es_PE_COLUMN_Supervisor_ID_Name="Supervisor";

@XendraColumn(AD_Element_ID="cb6ad258-6bb2-80b2-a90f-63c4d947479b",ColumnName="Supervisor_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="606fce88-e8f3-4df6-0617-746fb6a85b2b",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="1e789170-89be-b8d1-b50c-d46a81be0b7a",Synchronized="2017-08-28 09:54:34.0")
/** Column name Supervisor_ID */
public static final String COLUMNNAME_Supervisor_ID = "Supervisor_ID";
}
