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
import org.compiere.model.reference.REF__FrequencyType;
/** Generated Model for R_RequestProcessor
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_R_RequestProcessor extends PO
{
/** Standard Constructor
@param ctx context
@param R_RequestProcessor_ID id
@param trxName transaction
*/
public X_R_RequestProcessor (Properties ctx, int R_RequestProcessor_ID, String trxName)
{
super (ctx, R_RequestProcessor_ID, trxName);
/** if (R_RequestProcessor_ID == 0)
{
setFrequency (0);	
// 1
setFrequencyType (null);
setInactivityAlertDays (0);	
// 0
setKeepLogDays (0);	
// 7
setName (null);
setOverdueAlertDays (0);	
// 0
setOverdueAssignDays (0);	
// 0
setRemindDays (0);	
// 0
setR_RequestProcessor_ID (0);
setSupervisor_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_R_RequestProcessor (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=420 */
public static int Table_ID=MTable.getTable_ID("R_RequestProcessor");

@XendraTrl(Identifier="2252c801-0fff-02bf-b6f5-9eae8d77a322")
public static String es_PE_TAB_RequestProcessor_Description="Procesador de Solicitudes";

@XendraTrl(Identifier="2252c801-0fff-02bf-b6f5-9eae8d77a322")
public static String es_PE_TAB_RequestProcessor_Help="La pestaña Procesador de Solicitudes permite definir procesos que ocurren durante el procesamiento de solicitudes. También permite definir la hora y frecuencia en que corre el procesador. Si el procesamiento no determina ningún usuario; las solicitudes son asignadas al supervisor.";

@XendraTrl(Identifier="2252c801-0fff-02bf-b6f5-9eae8d77a322")
public static String es_PE_TAB_RequestProcessor_Name="Procesador Solicitudes";

@XendraTab(Name="Request Processor",Description="Request Processor",
Help="The Request Processor Tab allows you to define processes that you want to occur and the frequency and timing of these processes. If no other user is found, the items are assigned to the supervisor. A Request Processor can be just for a specific Request Type or for all.",
AD_Window_ID="33d28bbc-a670-970b-7b9c-ecf75fc3740d",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="2252c801-0fff-02bf-b6f5-9eae8d77a322",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_RequestProcessor="2252c801-0fff-02bf-b6f5-9eae8d77a322";

@XendraTrl(Identifier="fad67664-a2cf-264c-0ec9-4dd305840f3b")
public static String es_PE_TABLE_R_RequestProcessor_Name="Procesador de Solicitudes";

@XendraTable(Name="Request Processor",Description="",Help="",TableName="R_RequestProcessor",
AccessLevel="2",AD_Window_ID="33d28bbc-a670-970b-7b9c-ecf75fc3740d",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="fad67664-a2cf-264c-0ec9-4dd305840f3b",Synchronized="2017-10-04 18:42:48.0")
/** TableName=R_RequestProcessor */
public static final String Table_Name="R_RequestProcessor";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"R_RequestProcessor");

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
    Table_ID = MTable.getTable_ID("R_RequestProcessor");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_R_RequestProcessor[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Machine .
@param A_Machine_ID Machine  */
public void setA_Machine_ID (int A_Machine_ID)
{
if (A_Machine_ID <= 0) set_Value (COLUMNNAME_A_Machine_ID, null);
 else 
set_Value (COLUMNNAME_A_Machine_ID, Integer.valueOf(A_Machine_ID));
}
/** Get Machine .
@return Machine  */
public int getA_Machine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_A_Machine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b7b403b3-2dec-490b-8bd1-0763882cbc63")
public static String es_PE_COLUMN_A_Machine_ID_Name="Machine ";

@XendraColumn(AD_Element_ID="5ca659c9-c8cc-4dd1-8e7c-ddc2fe399392",ColumnName="A_Machine_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b7b403b3-2dec-490b-8bd1-0763882cbc63",
Synchronized="2017-08-28 09:57:32.0")
/** Column name A_Machine_ID */
public static final String COLUMNNAME_A_Machine_ID = "A_Machine_ID";
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

@XendraTrl(Identifier="2170a14e-9636-5e75-913f-f9d590fd837f")
public static String es_PE_FIELD_RequestProcessor_DateLastRun_Name="Última Fecha de Corrida";

@XendraTrl(Identifier="2170a14e-9636-5e75-913f-f9d590fd837f")
public static String es_PE_FIELD_RequestProcessor_DateLastRun_Description="Fecha en que el proceso fue corrido por última vez";

@XendraTrl(Identifier="2170a14e-9636-5e75-913f-f9d590fd837f")
public static String es_PE_FIELD_RequestProcessor_DateLastRun_Help="La fecha de última corrida indica la última vez que se corrió un proceso";

@XendraField(AD_Column_ID="DateLastRun",IsCentrallyMaintained=true,
AD_Tab_ID="2252c801-0fff-02bf-b6f5-9eae8d77a322",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2170a14e-9636-5e75-913f-f9d590fd837f")
public static final String FIELDNAME_RequestProcessor_DateLastRun="2170a14e-9636-5e75-913f-f9d590fd837f";

@XendraTrl(Identifier="49c15174-2e3c-1bea-3ea5-d8df48cdf4d3")
public static String es_PE_COLUMN_DateLastRun_Name="Última Fecha de Corrida";

@XendraColumn(AD_Element_ID="e4c09739-6370-19ca-fdeb-4cdf8025abb8",ColumnName="DateLastRun",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="49c15174-2e3c-1bea-3ea5-d8df48cdf4d3",
Synchronized="2017-08-28 09:57:32.0")
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

@XendraTrl(Identifier="b36a5db5-ed1c-bf5a-c689-bf3256b5ae28")
public static String es_PE_FIELD_RequestProcessor_DateNextRun_Name="Siguiente Fecha de Corrida";

@XendraTrl(Identifier="b36a5db5-ed1c-bf5a-c689-bf3256b5ae28")
public static String es_PE_FIELD_RequestProcessor_DateNextRun_Description="Fecha en que el proceso será corrido la siguiente vez";

@XendraTrl(Identifier="b36a5db5-ed1c-bf5a-c689-bf3256b5ae28")
public static String es_PE_FIELD_RequestProcessor_DateNextRun_Help="La fecha de la siguiente corrida indica la siguiente vez que este proceso se correrá.";

@XendraField(AD_Column_ID="DateNextRun",IsCentrallyMaintained=true,
AD_Tab_ID="2252c801-0fff-02bf-b6f5-9eae8d77a322",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b36a5db5-ed1c-bf5a-c689-bf3256b5ae28")
public static final String FIELDNAME_RequestProcessor_DateNextRun="b36a5db5-ed1c-bf5a-c689-bf3256b5ae28";

@XendraTrl(Identifier="edbcac2e-2f89-d7cc-0f15-dffc2f79cfb9")
public static String es_PE_COLUMN_DateNextRun_Name="Siguiente Fecha de Corrida";

@XendraColumn(AD_Element_ID="215eac34-7f19-f6b2-ebeb-e6fbdb06d7ee",ColumnName="DateNextRun",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="edbcac2e-2f89-d7cc-0f15-dffc2f79cfb9",
Synchronized="2017-08-28 09:57:32.0")
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

@XendraTrl(Identifier="6df9ca6c-e2be-da2f-07bc-d4cfab76046e")
public static String es_PE_FIELD_RequestProcessor_Description_Name="Observación";

@XendraTrl(Identifier="6df9ca6c-e2be-da2f-07bc-d4cfab76046e")
public static String es_PE_FIELD_RequestProcessor_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="6df9ca6c-e2be-da2f-07bc-d4cfab76046e")
public static String es_PE_FIELD_RequestProcessor_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="2252c801-0fff-02bf-b6f5-9eae8d77a322",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6df9ca6c-e2be-da2f-07bc-d4cfab76046e")
public static final String FIELDNAME_RequestProcessor_Description="6df9ca6c-e2be-da2f-07bc-d4cfab76046e";

@XendraTrl(Identifier="377f7f03-95b6-3028-bac0-8dba4972650f")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="377f7f03-95b6-3028-bac0-8dba4972650f",
Synchronized="2017-08-28 09:57:32.0")
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

@XendraTrl(Identifier="23b5284e-bb67-4ac2-dbf1-52c0a8e6a6b4")
public static String es_PE_FIELD_RequestProcessor_Frequency_Name="Frecuencia";

@XendraTrl(Identifier="23b5284e-bb67-4ac2-dbf1-52c0a8e6a6b4")
public static String es_PE_FIELD_RequestProcessor_Frequency_Description="Frecuencia de proceso del requerimiento";

@XendraTrl(Identifier="23b5284e-bb67-4ac2-dbf1-52c0a8e6a6b4")
public static String es_PE_FIELD_RequestProcessor_Frequency_Help="La Frecuencia se usa junto con el tipo de frecuencia para determinar cuando un requerimiento será procesado.";

@XendraField(AD_Column_ID="Frequency",IsCentrallyMaintained=true,
AD_Tab_ID="2252c801-0fff-02bf-b6f5-9eae8d77a322",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="23b5284e-bb67-4ac2-dbf1-52c0a8e6a6b4")
public static final String FIELDNAME_RequestProcessor_Frequency="23b5284e-bb67-4ac2-dbf1-52c0a8e6a6b4";

@XendraTrl(Identifier="f8478fd8-2353-2802-4d1c-b8986157ff13")
public static String es_PE_COLUMN_Frequency_Name="Frecuencia";

@XendraColumn(AD_Element_ID="cd717b11-c45b-527f-9abd-4533f87b759f",ColumnName="Frequency",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f8478fd8-2353-2802-4d1c-b8986157ff13",
Synchronized="2017-08-28 09:57:32.0")
/** Column name Frequency */
public static final String COLUMNNAME_Frequency = "Frequency";
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

@XendraTrl(Identifier="4d7ceb02-6de0-43f5-bc6b-003d6a6d73ec")
public static String es_PE_COLUMN_FrequencyStartAt_Name="FrequencyStartAt";

@XendraColumn(AD_Element_ID="42d884cb-6480-428f-bef3-5e0802c0de5b",ColumnName="FrequencyStartAt",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4d7ceb02-6de0-43f5-bc6b-003d6a6d73ec",
Synchronized="2017-10-04 18:31:34.0")
/** Column name FrequencyStartAt */
public static final String COLUMNNAME_FrequencyStartAt = "FrequencyStartAt";

/** FrequencyType AD_Reference=a8e24598-16fb-a392-7587-12a112938032 */
public static final int FREQUENCYTYPE_AD_Reference_ID=221;
/** Set Frequency Type.
@param FrequencyType Frequency of event */
public void setFrequencyType (String FrequencyType)
{
if (FrequencyType == null) throw new IllegalArgumentException ("FrequencyType is mandatory");
if (FrequencyType.equals(REF__FrequencyType.Minute) || FrequencyType.equals(REF__FrequencyType.Hour) || FrequencyType.equals(REF__FrequencyType.Day) || FrequencyType.equals(REF__FrequencyType.Once) || FrequencyType.equals(REF__FrequencyType.Notification));
 else throw new IllegalArgumentException ("FrequencyType Invalid value - " + FrequencyType + " - Reference_ID=221 - M - H - D - O - N");
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

@XendraTrl(Identifier="d07a1801-d9c3-3345-9570-5ffca2582dbd")
public static String es_PE_FIELD_RequestProcessor_FrequencyType_Name="Tipo de Frecuencia";

@XendraTrl(Identifier="d07a1801-d9c3-3345-9570-5ffca2582dbd")
public static String es_PE_FIELD_RequestProcessor_FrequencyType_Description="Frecuencia de cálculo";

@XendraTrl(Identifier="d07a1801-d9c3-3345-9570-5ffca2582dbd")
public static String es_PE_FIELD_RequestProcessor_FrequencyType_Help="El Tipo de frecuencia se usa para calcular las fechas de inicio y fin del cálculo";

@XendraField(AD_Column_ID="FrequencyType",IsCentrallyMaintained=true,
AD_Tab_ID="2252c801-0fff-02bf-b6f5-9eae8d77a322",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d07a1801-d9c3-3345-9570-5ffca2582dbd")
public static final String FIELDNAME_RequestProcessor_FrequencyType="d07a1801-d9c3-3345-9570-5ffca2582dbd";

@XendraTrl(Identifier="495e140d-f1f8-4e6d-b9cf-778c6d10c0b1")
public static String es_PE_COLUMN_FrequencyType_Name="Tipo de Frecuencia";

@XendraColumn(AD_Element_ID="d2dcc6d7-4c3b-0646-5dc8-3df7514121af",ColumnName="FrequencyType",
AD_Reference_ID=17,AD_Reference_Value_ID="a8e24598-16fb-a392-7587-12a112938032",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="495e140d-f1f8-4e6d-b9cf-778c6d10c0b1",Synchronized="2017-08-28 09:57:32.0")
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
@XendraTrl(Identifier="a4fa5181-35d7-457d-bb9d-aac8857cffc9")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a4fa5181-35d7-457d-bb9d-aac8857cffc9",
Synchronized="2017-08-28 09:57:32.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Inactivity Alert Days.
@param InactivityAlertDays Send Alert when there is no activity after days (0= no alert) */
public void setInactivityAlertDays (int InactivityAlertDays)
{
set_Value (COLUMNNAME_InactivityAlertDays, Integer.valueOf(InactivityAlertDays));
}
/** Get Inactivity Alert Days.
@return Send Alert when there is no activity after days (0= no alert) */
public int getInactivityAlertDays() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_InactivityAlertDays);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="dc0e77f2-c3b1-c3e1-ad10-47b80db093d4")
public static String es_PE_FIELD_RequestProcessor_InactivityAlertDays_Name="Alerta de Días en Inactividad";

@XendraTrl(Identifier="dc0e77f2-c3b1-c3e1-ad10-47b80db093d4")
public static String es_PE_FIELD_RequestProcessor_InactivityAlertDays_Description="Enviar una alerta cuando esté en dias de inactividad. (0= no alerta)";

@XendraTrl(Identifier="dc0e77f2-c3b1-c3e1-ad10-47b80db093d4")
public static String es_PE_FIELD_RequestProcessor_InactivityAlertDays_Help="Enviar un Email de alerta cuando el resultado no muestra actividad por el numero de dias definido.";

@XendraField(AD_Column_ID="InactivityAlertDays",IsCentrallyMaintained=true,
AD_Tab_ID="2252c801-0fff-02bf-b6f5-9eae8d77a322",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dc0e77f2-c3b1-c3e1-ad10-47b80db093d4")
public static final String FIELDNAME_RequestProcessor_InactivityAlertDays="dc0e77f2-c3b1-c3e1-ad10-47b80db093d4";

@XendraTrl(Identifier="a186c9de-cf66-a28c-990e-1f49e43795ac")
public static String es_PE_COLUMN_InactivityAlertDays_Name="Alerta de días en inactividad";

@XendraColumn(AD_Element_ID="f01ac251-dc62-6d8f-a976-30d1be112938",
ColumnName="InactivityAlertDays",AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="0",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a186c9de-cf66-a28c-990e-1f49e43795ac",Synchronized="2017-08-28 09:57:32.0")
/** Column name InactivityAlertDays */
public static final String COLUMNNAME_InactivityAlertDays = "InactivityAlertDays";
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

@XendraTrl(Identifier="01c50082-4d58-0bc5-6399-3e819c598768")
public static String es_PE_FIELD_RequestProcessor_DaysToKeepLog_Name="Días para Guardar el Registro";

@XendraTrl(Identifier="01c50082-4d58-0bc5-6399-3e819c598768")
public static String es_PE_FIELD_RequestProcessor_DaysToKeepLog_Description="Número de días para guardar las entradas del registro";

@XendraTrl(Identifier="01c50082-4d58-0bc5-6399-3e819c598768")
public static String es_PE_FIELD_RequestProcessor_DaysToKeepLog_Help="Las entradas de un registro mas viejo pueden ser suprimidas";

@XendraField(AD_Column_ID="KeepLogDays",IsCentrallyMaintained=true,
AD_Tab_ID="2252c801-0fff-02bf-b6f5-9eae8d77a322",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="01c50082-4d58-0bc5-6399-3e819c598768")
public static final String FIELDNAME_RequestProcessor_DaysToKeepLog="01c50082-4d58-0bc5-6399-3e819c598768";

@XendraTrl(Identifier="8a467d22-96bc-7e38-a684-e5c122638b54")
public static String es_PE_COLUMN_KeepLogDays_Name="Días para guardar el registro";

@XendraColumn(AD_Element_ID="5f6abdde-d6c5-cc1d-af35-b05c5b66edd5",ColumnName="KeepLogDays",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="7",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8a467d22-96bc-7e38-a684-e5c122638b54",
Synchronized="2017-08-28 09:57:32.0")
/** Column name KeepLogDays */
public static final String COLUMNNAME_KeepLogDays = "KeepLogDays";
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

@XendraTrl(Identifier="f992685b-a524-7b0c-a352-e8d6d567e23e")
public static String es_PE_FIELD_RequestProcessor_Name_Name="Nombre";

@XendraTrl(Identifier="f992685b-a524-7b0c-a352-e8d6d567e23e")
public static String es_PE_FIELD_RequestProcessor_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="f992685b-a524-7b0c-a352-e8d6d567e23e")
public static String es_PE_FIELD_RequestProcessor_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="2252c801-0fff-02bf-b6f5-9eae8d77a322",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f992685b-a524-7b0c-a352-e8d6d567e23e")
public static final String FIELDNAME_RequestProcessor_Name="f992685b-a524-7b0c-a352-e8d6d567e23e";

@XendraTrl(Identifier="2500a3af-3c9b-3a49-c3ae-49cfbe612b5b")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2500a3af-3c9b-3a49-c3ae-49cfbe612b5b",
Synchronized="2017-08-28 09:57:32.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Alert after Days Due.
@param OverdueAlertDays Send email alert after number of days due (0=no alerts) */
public void setOverdueAlertDays (int OverdueAlertDays)
{
set_Value (COLUMNNAME_OverdueAlertDays, Integer.valueOf(OverdueAlertDays));
}
/** Get Alert after Days Due.
@return Send email alert after number of days due (0=no alerts) */
public int getOverdueAlertDays() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_OverdueAlertDays);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0bc65368-0aaf-2d51-2fc8-28f4448ce1d3")
public static String es_PE_FIELD_RequestProcessor_AlertAfterDaysDue_Name="Alarma Después de Atraso";

@XendraTrl(Identifier="0bc65368-0aaf-2d51-2fc8-28f4448ce1d3")
public static String es_PE_FIELD_RequestProcessor_AlertAfterDaysDue_Description="Enviar un correo electrónico de alerta después de un número de días de vencido (0=no alerta)";

@XendraTrl(Identifier="0bc65368-0aaf-2d51-2fc8-28f4448ce1d3")
public static String es_PE_FIELD_RequestProcessor_AlertAfterDaysDue_Help="Enviar un Email de alerta después de que la partida está vencida. Si se establece en cero; ninguna alerta se envía.";

@XendraField(AD_Column_ID="OverdueAlertDays",IsCentrallyMaintained=true,
AD_Tab_ID="2252c801-0fff-02bf-b6f5-9eae8d77a322",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0bc65368-0aaf-2d51-2fc8-28f4448ce1d3")
public static final String FIELDNAME_RequestProcessor_AlertAfterDaysDue="0bc65368-0aaf-2d51-2fc8-28f4448ce1d3";

@XendraTrl(Identifier="39373a2b-a1c0-a004-77a7-1f290bc78a52")
public static String es_PE_COLUMN_OverdueAlertDays_Name="Alarma Después de Atraso";

@XendraColumn(AD_Element_ID="dae14d82-577e-3df9-ba86-31b81038cb35",ColumnName="OverdueAlertDays",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="39373a2b-a1c0-a004-77a7-1f290bc78a52",
Synchronized="2017-08-28 09:57:32.0")
/** Column name OverdueAlertDays */
public static final String COLUMNNAME_OverdueAlertDays = "OverdueAlertDays";
/** Set Escalate after Days Due.
@param OverdueAssignDays Escalation to superior after number of due days (0 = no) */
public void setOverdueAssignDays (int OverdueAssignDays)
{
set_Value (COLUMNNAME_OverdueAssignDays, Integer.valueOf(OverdueAssignDays));
}
/** Get Escalate after Days Due.
@return Escalation to superior after number of due days (0 = no) */
public int getOverdueAssignDays() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_OverdueAssignDays);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c8e06fc1-5513-676a-7050-b9f102c7b188")
public static String es_PE_FIELD_RequestProcessor_EscalateAfterDaysDue_Name="Extiéndase Después de los Días Atraso";

@XendraTrl(Identifier="c8e06fc1-5513-676a-7050-b9f102c7b188")
public static String es_PE_FIELD_RequestProcessor_EscalateAfterDaysDue_Description="Escalación a un número superior después de un número de días de vencido";

@XendraTrl(Identifier="c8e06fc1-5513-676a-7050-b9f102c7b188")
public static String es_PE_FIELD_RequestProcessor_EscalateAfterDaysDue_Help="La partida será escalada y asignada al supervisor después de que el número de días esté vencida";

@XendraField(AD_Column_ID="OverdueAssignDays",IsCentrallyMaintained=true,
AD_Tab_ID="2252c801-0fff-02bf-b6f5-9eae8d77a322",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c8e06fc1-5513-676a-7050-b9f102c7b188")
public static final String FIELDNAME_RequestProcessor_EscalateAfterDaysDue="c8e06fc1-5513-676a-7050-b9f102c7b188";

@XendraTrl(Identifier="5fca5283-aaa6-f346-bfd3-7e7df1ac77d9")
public static String es_PE_COLUMN_OverdueAssignDays_Name="Extiéndase después de los días atraso";

@XendraColumn(AD_Element_ID="6cb75ab2-c0e8-dff4-0d62-0005e5f7d99e",ColumnName="OverdueAssignDays",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5fca5283-aaa6-f346-bfd3-7e7df1ac77d9",
Synchronized="2017-08-28 09:57:32.0")
/** Column name OverdueAssignDays */
public static final String COLUMNNAME_OverdueAssignDays = "OverdueAssignDays";
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

@XendraTrl(Identifier="e56eaf49-7a36-df65-033f-ec5e0d5eb84f")
public static String es_PE_FIELD_RequestProcessor_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="2252c801-0fff-02bf-b6f5-9eae8d77a322",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e56eaf49-7a36-df65-033f-ec5e0d5eb84f")
public static final String FIELDNAME_RequestProcessor_ProcessNow="e56eaf49-7a36-df65-033f-ec5e0d5eb84f";

@XendraTrl(Identifier="a9e9c026-19e1-2f1f-8c84-d1fc78338402")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a9e9c026-19e1-2f1f-8c84-d1fc78338402",
Synchronized="2017-08-28 09:57:32.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Reminder Days.
@param RemindDays Days between sending Reminder Emails for a due or inactive Document */
public void setRemindDays (int RemindDays)
{
set_Value (COLUMNNAME_RemindDays, Integer.valueOf(RemindDays));
}
/** Get Reminder Days.
@return Days between sending Reminder Emails for a due or inactive Document */
public int getRemindDays() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_RemindDays);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="592d1063-8dc8-add1-8663-1165d1bfb296")
public static String es_PE_FIELD_RequestProcessor_ReminderDays_Name="Días de Recordatorio";

@XendraTrl(Identifier="592d1063-8dc8-add1-8663-1165d1bfb296")
public static String es_PE_FIELD_RequestProcessor_ReminderDays_Description="Días para enviar los emails de recordatorio para un documento debido ó inactivo";

@XendraTrl(Identifier="592d1063-8dc8-add1-8663-1165d1bfb296")
public static String es_PE_FIELD_RequestProcessor_ReminderDays_Help="Cuando un documento es debido A, demasiado largo sin actividad, se envía un recordatorio. 0 no significa ningún recordatorio. Los días del recordar son los días en que se envía el recordatorio siguiente del email.";

@XendraField(AD_Column_ID="RemindDays",IsCentrallyMaintained=true,
AD_Tab_ID="2252c801-0fff-02bf-b6f5-9eae8d77a322",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="592d1063-8dc8-add1-8663-1165d1bfb296")
public static final String FIELDNAME_RequestProcessor_ReminderDays="592d1063-8dc8-add1-8663-1165d1bfb296";

@XendraTrl(Identifier="365cf86f-e9b4-5c6a-79a2-63faba876cbd")
public static String es_PE_COLUMN_RemindDays_Name="Días de Recordatorio";

@XendraColumn(AD_Element_ID="61c87de0-a3d9-936a-2dc0-189a6e5e587c",ColumnName="RemindDays",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="365cf86f-e9b4-5c6a-79a2-63faba876cbd",
Synchronized="2017-08-28 09:57:32.0")
/** Column name RemindDays */
public static final String COLUMNNAME_RemindDays = "RemindDays";
/** Set Request Processor.
@param R_RequestProcessor_ID Processor for Requests */
public void setR_RequestProcessor_ID (int R_RequestProcessor_ID)
{
if (R_RequestProcessor_ID < 1) throw new IllegalArgumentException ("R_RequestProcessor_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_R_RequestProcessor_ID, Integer.valueOf(R_RequestProcessor_ID));
}
/** Get Request Processor.
@return Processor for Requests */
public int getR_RequestProcessor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_RequestProcessor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6c7cb13f-f392-7e08-5f5c-84d2ad9bb818")
public static String es_PE_FIELD_RequestProcessor_RequestProcessor_Name="Procesador de Solicitudes";

@XendraField(AD_Column_ID="R_RequestProcessor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2252c801-0fff-02bf-b6f5-9eae8d77a322",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6c7cb13f-f392-7e08-5f5c-84d2ad9bb818")
public static final String FIELDNAME_RequestProcessor_RequestProcessor="6c7cb13f-f392-7e08-5f5c-84d2ad9bb818";
/** Column name R_RequestProcessor_ID */
public static final String COLUMNNAME_R_RequestProcessor_ID = "R_RequestProcessor_ID";
/** Set Request Type.
@param R_RequestType_ID Type of request (e.g. Inquiry, Complaint, ..) */
public void setR_RequestType_ID (int R_RequestType_ID)
{
if (R_RequestType_ID <= 0) set_Value (COLUMNNAME_R_RequestType_ID, null);
 else 
set_Value (COLUMNNAME_R_RequestType_ID, Integer.valueOf(R_RequestType_ID));
}
/** Get Request Type.
@return Type of request (e.g. Inquiry, Complaint, ..) */
public int getR_RequestType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_RequestType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a0d221a8-b7d8-3e31-ddf2-7a8fab89ec98")
public static String es_PE_FIELD_RequestProcessor_RequestType_Name="Tipo de Solicitud";

@XendraTrl(Identifier="a0d221a8-b7d8-3e31-ddf2-7a8fab89ec98")
public static String es_PE_FIELD_RequestProcessor_RequestType_Description="Tipo de Solicitud (pregunta; queja).";

@XendraTrl(Identifier="a0d221a8-b7d8-3e31-ddf2-7a8fab89ec98")
public static String es_PE_FIELD_RequestProcessor_RequestType_Help="Tipos de solicitud son usados para procesar y categorizar solicitudes. Ejemplos: consultas de cuentas; garantías; etc.";

@XendraField(AD_Column_ID="R_RequestType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2252c801-0fff-02bf-b6f5-9eae8d77a322",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a0d221a8-b7d8-3e31-ddf2-7a8fab89ec98")
public static final String FIELDNAME_RequestProcessor_RequestType="a0d221a8-b7d8-3e31-ddf2-7a8fab89ec98";

@XendraTrl(Identifier="5aa69957-7df8-85a4-24e1-19e4b940be3a")
public static String es_PE_COLUMN_R_RequestType_ID_Name="Tipo de Solicitud";

@XendraColumn(AD_Element_ID="5d38239d-4d14-9ae8-35a8-4f92ae90ab59",ColumnName="R_RequestType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5aa69957-7df8-85a4-24e1-19e4b940be3a",
Synchronized="2017-08-28 09:57:32.0")
/** Column name R_RequestType_ID */
public static final String COLUMNNAME_R_RequestType_ID = "R_RequestType_ID";

/** Supervisor_ID AD_Reference=91f52193-02ab-6545-99f8-d6d30b9d03a1 */
public static final int SUPERVISOR_ID_AD_Reference_ID=286;
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

@XendraTrl(Identifier="a507a88b-ce40-3934-f4e9-955ab6dfeeb0")
public static String es_PE_FIELD_RequestProcessor_Supervisor_Name="Supervisor";

@XendraTrl(Identifier="a507a88b-ce40-3934-f4e9-955ab6dfeeb0")
public static String es_PE_FIELD_RequestProcessor_Supervisor_Description="Supervisor para este usuario - usado para escalación";

@XendraTrl(Identifier="a507a88b-ce40-3934-f4e9-955ab6dfeeb0")
public static String es_PE_FIELD_RequestProcessor_Supervisor_Help="El supervisor indica quien será usado para reenviar y escalar emisiones este usuario.";

@XendraField(AD_Column_ID="Supervisor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2252c801-0fff-02bf-b6f5-9eae8d77a322",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a507a88b-ce40-3934-f4e9-955ab6dfeeb0")
public static final String FIELDNAME_RequestProcessor_Supervisor="a507a88b-ce40-3934-f4e9-955ab6dfeeb0";

@XendraTrl(Identifier="bfd0d231-c7dd-05c4-b123-8390c514d593")
public static String es_PE_COLUMN_Supervisor_ID_Name="Supervisor";

@XendraColumn(AD_Element_ID="cb6ad258-6bb2-80b2-a90f-63c4d947479b",ColumnName="Supervisor_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="91f52193-02ab-6545-99f8-d6d30b9d03a1",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="bfd0d231-c7dd-05c4-b123-8390c514d593",Synchronized="2017-08-28 09:57:32.0")
/** Column name Supervisor_ID */
public static final String COLUMNNAME_Supervisor_ID = "Supervisor_ID";
}
