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
/** Generated Model for AD_Scheduler
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Scheduler extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Scheduler_ID id
@param trxName transaction
*/
public X_AD_Scheduler (Properties ctx, int AD_Scheduler_ID, String trxName)
{
super (ctx, AD_Scheduler_ID, trxName);
/** if (AD_Scheduler_ID == 0)
{
setAD_Process_ID (0);
setAD_Scheduler_ID (0);
setFrequency (0);
setFrequencyType (null);
setKeepLogDays (0);	
// 7
setName (null);
setScheduleType (null);	
// F
setSupervisor_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Scheduler (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=688 */
public static int Table_ID=MTable.getTable_ID("AD_Scheduler");

@XendraTrl(Identifier="78fe33fa-e8bd-19d7-d650-8575b892c489")
public static String es_PE_TAB_ScheduleProcess_Description="Procesos del horario";

@XendraTrl(Identifier="78fe33fa-e8bd-19d7-d650-8575b892c489")
public static String es_PE_TAB_ScheduleProcess_Help="Procesos del horario que se ejecutarán una sincronización";

@XendraTrl(Identifier="78fe33fa-e8bd-19d7-d650-8575b892c489")
public static String es_PE_TAB_ScheduleProcess_Name="Procesos de Agenda";

@XendraTab(Name="Schedule Process",Description="Schedule processes",
Help="Schedule processes to be executed asynchronously",
AD_Window_ID="2d2f8ce7-abbe-ad81-0373-06f27fbe1596",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="78fe33fa-e8bd-19d7-d650-8575b892c489",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ScheduleProcess="78fe33fa-e8bd-19d7-d650-8575b892c489";

@XendraTrl(Identifier="9eb64579-cc57-0f07-a7db-705f2e90a2fa")
public static String es_PE_TABLE_AD_Scheduler_Name="Programación";

@XendraTable(Name="Scheduler",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Schedule Processes",Help="",
TableName="AD_Scheduler",AccessLevel="6",AD_Window_ID="2d2f8ce7-abbe-ad81-0373-06f27fbe1596",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="9eb64579-cc57-0f07-a7db-705f2e90a2fa",Synchronized="2020-03-03 21:35:54.0")
/** TableName=AD_Scheduler */
public static final String Table_Name="AD_Scheduler";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Scheduler");

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
    Table_ID = MTable.getTable_ID("AD_Scheduler");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Scheduler[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Process.
@param AD_Process_ID Process or Report */
public void setAD_Process_ID (int AD_Process_ID)
{
if (AD_Process_ID < 1) throw new IllegalArgumentException ("AD_Process_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Process_ID, Integer.valueOf(AD_Process_ID));
}
/** Get Process.
@return Process or Report */
public int getAD_Process_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Process_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="622fcf50-c0aa-8030-f0a2-bebcbc2f85bd")
public static String es_PE_FIELD_ScheduleProcess_Process_Name="Proceso";

@XendraTrl(Identifier="622fcf50-c0aa-8030-f0a2-bebcbc2f85bd")
public static String es_PE_FIELD_ScheduleProcess_Process_Description="Proceso ó Informe";

@XendraTrl(Identifier="622fcf50-c0aa-8030-f0a2-bebcbc2f85bd")
public static String es_PE_FIELD_ScheduleProcess_Process_Help="El campo proceso identifica un proceso ó Informe único en el sistema.";

@XendraField(AD_Column_ID="AD_Process_ID",IsCentrallyMaintained=true,
AD_Tab_ID="78fe33fa-e8bd-19d7-d650-8575b892c489",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="622fcf50-c0aa-8030-f0a2-bebcbc2f85bd")
public static final String FIELDNAME_ScheduleProcess_Process="622fcf50-c0aa-8030-f0a2-bebcbc2f85bd";

@XendraTrl(Identifier="0a94cbeb-ee26-cafc-b04f-43d099548a17")
public static String es_PE_COLUMN_AD_Process_ID_Name="Proceso";

@XendraColumn(AD_Element_ID="60982cc9-e937-d374-4608-1c3f64b16d3b",ColumnName="AD_Process_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0a94cbeb-ee26-cafc-b04f-43d099548a17",
Synchronized="2019-08-30 22:20:40.0")
/** Column name AD_Process_ID */
public static final String COLUMNNAME_AD_Process_ID = "AD_Process_ID";
/** Set Scheduler.
@param AD_Scheduler_ID Schedule Processes */
public void setAD_Scheduler_ID (int AD_Scheduler_ID)
{
if (AD_Scheduler_ID < 1) throw new IllegalArgumentException ("AD_Scheduler_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Scheduler_ID, Integer.valueOf(AD_Scheduler_ID));
}
/** Get Scheduler.
@return Schedule Processes */
public int getAD_Scheduler_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Scheduler_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ab5e4957-99c2-35bf-9fc8-2c4cc4d541f2")
public static String es_PE_FIELD_ScheduleProcess_Scheduler_Name="Programación";

@XendraTrl(Identifier="ab5e4957-99c2-35bf-9fc8-2c4cc4d541f2")
public static String es_PE_FIELD_ScheduleProcess_Scheduler_Description="Programación de procesos";

@XendraTrl(Identifier="ab5e4957-99c2-35bf-9fc8-2c4cc4d541f2")
public static String es_PE_FIELD_ScheduleProcess_Scheduler_Help="Programación de procesos para ser ejecutada la sincronización.";

@XendraField(AD_Column_ID="AD_Scheduler_ID",IsCentrallyMaintained=true,
AD_Tab_ID="78fe33fa-e8bd-19d7-d650-8575b892c489",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ab5e4957-99c2-35bf-9fc8-2c4cc4d541f2")
public static final String FIELDNAME_ScheduleProcess_Scheduler="ab5e4957-99c2-35bf-9fc8-2c4cc4d541f2";
/** Column name AD_Scheduler_ID */
public static final String COLUMNNAME_AD_Scheduler_ID = "AD_Scheduler_ID";
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

@XendraTrl(Identifier="3e847ce8-1387-c4d6-80bc-0cc304ef305d")
public static String es_PE_FIELD_ScheduleProcess_DateLastRun_Name="Última Fecha de Corrida";

@XendraTrl(Identifier="3e847ce8-1387-c4d6-80bc-0cc304ef305d")
public static String es_PE_FIELD_ScheduleProcess_DateLastRun_Description="Fecha en que el proceso fue corrido por última vez";

@XendraTrl(Identifier="3e847ce8-1387-c4d6-80bc-0cc304ef305d")
public static String es_PE_FIELD_ScheduleProcess_DateLastRun_Help="La fecha de última corrida indica la última vez que se corrió un proceso";

@XendraField(AD_Column_ID="DateLastRun",IsCentrallyMaintained=true,
AD_Tab_ID="78fe33fa-e8bd-19d7-d650-8575b892c489",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3e847ce8-1387-c4d6-80bc-0cc304ef305d")
public static final String FIELDNAME_ScheduleProcess_DateLastRun="3e847ce8-1387-c4d6-80bc-0cc304ef305d";

@XendraTrl(Identifier="305aa66c-1ced-44d3-18ee-929c7fa0faed")
public static String es_PE_COLUMN_DateLastRun_Name="Última Fecha de Corrida";

@XendraColumn(AD_Element_ID="e4c09739-6370-19ca-fdeb-4cdf8025abb8",ColumnName="DateLastRun",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="305aa66c-1ced-44d3-18ee-929c7fa0faed",
Synchronized="2019-08-30 22:20:40.0")
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

@XendraTrl(Identifier="30a6c20d-8559-149b-e81f-6c447b8abcbb")
public static String es_PE_FIELD_ScheduleProcess_DateNextRun_Name="Siguiente Fecha de Corrida";

@XendraTrl(Identifier="30a6c20d-8559-149b-e81f-6c447b8abcbb")
public static String es_PE_FIELD_ScheduleProcess_DateNextRun_Description="Fecha en que el proceso será corrido la siguiente vez";

@XendraTrl(Identifier="30a6c20d-8559-149b-e81f-6c447b8abcbb")
public static String es_PE_FIELD_ScheduleProcess_DateNextRun_Help="La fecha de la siguiente corrida indica la siguiente vez que este proceso se correrá.";

@XendraField(AD_Column_ID="DateNextRun",IsCentrallyMaintained=true,
AD_Tab_ID="78fe33fa-e8bd-19d7-d650-8575b892c489",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="30a6c20d-8559-149b-e81f-6c447b8abcbb")
public static final String FIELDNAME_ScheduleProcess_DateNextRun="30a6c20d-8559-149b-e81f-6c447b8abcbb";

@XendraTrl(Identifier="f9a16139-609a-206e-daee-f4757c8bdd00")
public static String es_PE_COLUMN_DateNextRun_Name="Siguiente Fecha de Corrida";

@XendraColumn(AD_Element_ID="215eac34-7f19-f6b2-ebeb-e6fbdb06d7ee",ColumnName="DateNextRun",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f9a16139-609a-206e-daee-f4757c8bdd00",
Synchronized="2019-08-30 22:20:40.0")
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

@XendraTrl(Identifier="b173568c-dc9b-4bfb-5b4d-72a18b472639")
public static String es_PE_FIELD_ScheduleProcess_Description_Name="Observación";

@XendraTrl(Identifier="b173568c-dc9b-4bfb-5b4d-72a18b472639")
public static String es_PE_FIELD_ScheduleProcess_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="b173568c-dc9b-4bfb-5b4d-72a18b472639")
public static String es_PE_FIELD_ScheduleProcess_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="78fe33fa-e8bd-19d7-d650-8575b892c489",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b173568c-dc9b-4bfb-5b4d-72a18b472639")
public static final String FIELDNAME_ScheduleProcess_Description="b173568c-dc9b-4bfb-5b4d-72a18b472639";

@XendraTrl(Identifier="90ed7633-ad77-1bd7-d73c-91d94ef5a7e2")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="90ed7633-ad77-1bd7-d73c-91d94ef5a7e2",
Synchronized="2019-08-30 22:20:40.0")
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

@XendraTrl(Identifier="c1bef99c-8a86-c38b-3105-42474de5cf30")
public static String es_PE_FIELD_ScheduleProcess_Frequency_Name="Frecuencia";

@XendraTrl(Identifier="c1bef99c-8a86-c38b-3105-42474de5cf30")
public static String es_PE_FIELD_ScheduleProcess_Frequency_Description="Frecuencia de proceso del requerimiento";

@XendraTrl(Identifier="c1bef99c-8a86-c38b-3105-42474de5cf30")
public static String es_PE_FIELD_ScheduleProcess_Frequency_Help="La Frecuencia se usa junto con el tipo de frecuencia para determinar cuando un requerimiento será procesado.";

@XendraField(AD_Column_ID="Frequency",IsCentrallyMaintained=true,
AD_Tab_ID="78fe33fa-e8bd-19d7-d650-8575b892c489",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ScheduleType@=F",DisplayLength=11,IsReadOnly=false,SeqNo=110,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c1bef99c-8a86-c38b-3105-42474de5cf30")
public static final String FIELDNAME_ScheduleProcess_Frequency="c1bef99c-8a86-c38b-3105-42474de5cf30";

@XendraTrl(Identifier="2de756c8-3fc5-bb79-ce3d-5644af2c4546")
public static String es_PE_COLUMN_Frequency_Name="Frecuencia";

@XendraColumn(AD_Element_ID="cd717b11-c45b-527f-9abd-4533f87b759f",ColumnName="Frequency",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2de756c8-3fc5-bb79-ce3d-5644af2c4546",
Synchronized="2019-08-30 22:20:40.0")
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

@XendraTrl(Identifier="ad768aac-3b66-49f2-9d20-b6128ea5a5af")
public static String es_PE_FIELD_ScheduleProcess_FrequencyStartAt_Name="frequencystartat";

@XendraField(AD_Column_ID="FrequencyStartAt",IsCentrallyMaintained=true,
AD_Tab_ID="78fe33fa-e8bd-19d7-d650-8575b892c489",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-10-04 22:28:46.0",
Identifier="ad768aac-3b66-49f2-9d20-b6128ea5a5af")
public static final String FIELDNAME_ScheduleProcess_FrequencyStartAt="ad768aac-3b66-49f2-9d20-b6128ea5a5af";

@XendraTrl(Identifier="2680bfba-6e38-419c-a620-0e3018e3cc63")
public static String es_PE_COLUMN_FrequencyStartAt_Name="FrequencyStartAt";

@XendraColumn(AD_Element_ID="42d884cb-6480-428f-bef3-5e0802c0de5b",ColumnName="FrequencyStartAt",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2680bfba-6e38-419c-a620-0e3018e3cc63",
Synchronized="2019-08-30 22:20:40.0")
/** Column name FrequencyStartAt */
public static final String COLUMNNAME_FrequencyStartAt = "FrequencyStartAt";
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

@XendraTrl(Identifier="74dc83f6-e880-e050-52a1-c4402290b21c")
public static String es_PE_FIELD_ScheduleProcess_FrequencyType_Name="Tipo de Frecuencia";

@XendraTrl(Identifier="74dc83f6-e880-e050-52a1-c4402290b21c")
public static String es_PE_FIELD_ScheduleProcess_FrequencyType_Description="Frecuencia de cálculo";

@XendraTrl(Identifier="74dc83f6-e880-e050-52a1-c4402290b21c")
public static String es_PE_FIELD_ScheduleProcess_FrequencyType_Help="El Tipo de frecuencia se usa para calcular las fechas de inicio y fin del cálculo";

@XendraField(AD_Column_ID="FrequencyType",IsCentrallyMaintained=true,
AD_Tab_ID="78fe33fa-e8bd-19d7-d650-8575b892c489",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ScheduleType@=F",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="74dc83f6-e880-e050-52a1-c4402290b21c")
public static final String FIELDNAME_ScheduleProcess_FrequencyType="74dc83f6-e880-e050-52a1-c4402290b21c";

@XendraTrl(Identifier="eab331af-e52f-9774-f3a4-ded1b2a3d376")
public static String es_PE_COLUMN_FrequencyType_Name="Tipo de Frecuencia";

@XendraColumn(AD_Element_ID="d2dcc6d7-4c3b-0646-5dc8-3df7514121af",ColumnName="FrequencyType",
AD_Reference_ID=17,AD_Reference_Value_ID="a8e24598-16fb-a392-7587-12a112938032",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="eab331af-e52f-9774-f3a4-ded1b2a3d376",Synchronized="2019-08-30 22:20:40.0")
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
@XendraTrl(Identifier="57424c48-b15b-441e-bf4c-e5ebe334f30d")
public static String es_PE_FIELD_ScheduleProcess_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="78fe33fa-e8bd-19d7-d650-8575b892c489",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-12-20 19:36:32.0",
Identifier="57424c48-b15b-441e-bf4c-e5ebe334f30d")
public static final String FIELDNAME_ScheduleProcess_Identifier="57424c48-b15b-441e-bf4c-e5ebe334f30d";

@XendraTrl(Identifier="79443d0a-6bfe-4ad4-a02c-c27e914320da")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="79443d0a-6bfe-4ad4-a02c-c27e914320da",
Synchronized="2019-08-30 22:20:40.0")
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

@XendraTrl(Identifier="f5475aa7-c2b4-e02e-c4b3-63ac46b50985")
public static String es_PE_FIELD_ScheduleProcess_DaysToKeepLog_Name="Días para guardar el registro";

@XendraTrl(Identifier="f5475aa7-c2b4-e02e-c4b3-63ac46b50985")
public static String es_PE_FIELD_ScheduleProcess_DaysToKeepLog_Description="Número de días para guardar las entradas del registro";

@XendraTrl(Identifier="f5475aa7-c2b4-e02e-c4b3-63ac46b50985")
public static String es_PE_FIELD_ScheduleProcess_DaysToKeepLog_Help="Las entradas de un registro mas viejo pueden ser suprimidas";

@XendraField(AD_Column_ID="KeepLogDays",IsCentrallyMaintained=true,
AD_Tab_ID="78fe33fa-e8bd-19d7-d650-8575b892c489",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f5475aa7-c2b4-e02e-c4b3-63ac46b50985")
public static final String FIELDNAME_ScheduleProcess_DaysToKeepLog="f5475aa7-c2b4-e02e-c4b3-63ac46b50985";

@XendraTrl(Identifier="68ae87c0-d819-7c90-351a-2fedd560e2b4")
public static String es_PE_COLUMN_KeepLogDays_Name="Días para guardar el registro";

@XendraColumn(AD_Element_ID="5f6abdde-d6c5-cc1d-af35-b05c5b66edd5",ColumnName="KeepLogDays",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="7",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="68ae87c0-d819-7c90-351a-2fedd560e2b4",
Synchronized="2019-08-30 22:20:40.0")
/** Column name KeepLogDays */
public static final String COLUMNNAME_KeepLogDays = "KeepLogDays";
/** Set Lockout.
@param Lockout Lockout */
public void setLockout (boolean Lockout)
{
set_Value (COLUMNNAME_Lockout, Boolean.valueOf(Lockout));
}
/** Get Lockout.
@return Lockout */
public boolean isLockout() 
{
Object oo = get_Value(COLUMNNAME_Lockout);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="13eff35e-bf42-4bc0-81ad-6520bd0acca0")
public static String es_PE_FIELD_ScheduleProcess_Lockout_Name="lockout";

@XendraField(AD_Column_ID="Lockout",IsCentrallyMaintained=true,
AD_Tab_ID="78fe33fa-e8bd-19d7-d650-8575b892c489",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-10-17 18:44:38.0",
Identifier="13eff35e-bf42-4bc0-81ad-6520bd0acca0")
public static final String FIELDNAME_ScheduleProcess_Lockout="13eff35e-bf42-4bc0-81ad-6520bd0acca0";

@XendraTrl(Identifier="67085d37-9085-4669-8ec4-762a85a6a00a")
public static String es_PE_COLUMN_Lockout_Name="Lockout";

@XendraColumn(AD_Element_ID="63f75f32-a2eb-4522-a988-6c753105407e",ColumnName="Lockout",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="67085d37-9085-4669-8ec4-762a85a6a00a",
Synchronized="2019-08-30 22:20:40.0")
/** Column name Lockout */
public static final String COLUMNNAME_Lockout = "Lockout";
/** Set Day of the Month.
@param MonthDay Day of the month 1 to 28/29/30/31 */
public void setMonthDay (int MonthDay)
{
set_Value (COLUMNNAME_MonthDay, Integer.valueOf(MonthDay));
}
/** Get Day of the Month.
@return Day of the month 1 to 28/29/30/31 */
public int getMonthDay() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_MonthDay);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="01af62d6-54d6-f6ee-b470-68dbb43ae841")
public static String es_PE_FIELD_ScheduleProcess_DayOfTheMonth_Name="Día del Mes";

@XendraTrl(Identifier="01af62d6-54d6-f6ee-b470-68dbb43ae841")
public static String es_PE_FIELD_ScheduleProcess_DayOfTheMonth_Description="Día del mes 1 a 28/29/30/31";

@XendraField(AD_Column_ID="MonthDay",IsCentrallyMaintained=true,
AD_Tab_ID="78fe33fa-e8bd-19d7-d650-8575b892c489",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ScheduleType@=M",DisplayLength=11,IsReadOnly=false,SeqNo=80,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="01af62d6-54d6-f6ee-b470-68dbb43ae841")
public static final String FIELDNAME_ScheduleProcess_DayOfTheMonth="01af62d6-54d6-f6ee-b470-68dbb43ae841";

@XendraTrl(Identifier="28c61ca4-4a34-4dc5-4bc3-41befdd05ce7")
public static String es_PE_COLUMN_MonthDay_Name="Día del Mes";

@XendraColumn(AD_Element_ID="c7979652-bfb3-4f97-276f-ee60806d6fc4",ColumnName="MonthDay",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="1",ValueMax="31",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="28c61ca4-4a34-4dc5-4bc3-41befdd05ce7",
Synchronized="2019-08-30 22:20:40.0")
/** Column name MonthDay */
public static final String COLUMNNAME_MonthDay = "MonthDay";
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

@XendraTrl(Identifier="59234065-1485-1449-6e48-5f76524da459")
public static String es_PE_FIELD_ScheduleProcess_Name_Name="Nombre";

@XendraTrl(Identifier="59234065-1485-1449-6e48-5f76524da459")
public static String es_PE_FIELD_ScheduleProcess_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="59234065-1485-1449-6e48-5f76524da459")
public static String es_PE_FIELD_ScheduleProcess_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="78fe33fa-e8bd-19d7-d650-8575b892c489",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="59234065-1485-1449-6e48-5f76524da459")
public static final String FIELDNAME_ScheduleProcess_Name="59234065-1485-1449-6e48-5f76524da459";

@XendraTrl(Identifier="8309c298-f640-2522-cbfe-b4c88f77eb6a")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8309c298-f640-2522-cbfe-b4c88f77eb6a",
Synchronized="2019-08-30 22:20:40.0")
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

@XendraTrl(Identifier="53348376-fc7c-8131-2ab6-0b30eca5118a")
public static String es_PE_FIELD_ScheduleProcess_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="78fe33fa-e8bd-19d7-d650-8575b892c489",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="53348376-fc7c-8131-2ab6-0b30eca5118a")
public static final String FIELDNAME_ScheduleProcess_ProcessNow="53348376-fc7c-8131-2ab6-0b30eca5118a";

@XendraTrl(Identifier="111860ea-0866-f301-23de-bb516fd7bd7e")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="111860ea-0866-f301-23de-bb516fd7bd7e",
Synchronized="2019-08-30 22:20:40.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Schedule Type.
@param ScheduleType Type of schedule */
public void setScheduleType (String ScheduleType)
{
if (ScheduleType.length() > 1)
{
log.warning("Length > 1 - truncated");
ScheduleType = ScheduleType.substring(0,0);
}
set_Value (COLUMNNAME_ScheduleType, ScheduleType);
}
/** Get Schedule Type.
@return Type of schedule */
public String getScheduleType() 
{
return (String)get_Value(COLUMNNAME_ScheduleType);
}

@XendraTrl(Identifier="dc4f6aa9-21e5-3237-8d2d-5c22688cbc8c")
public static String es_PE_FIELD_ScheduleProcess_ScheduleType_Name="Tipo de Programa";

@XendraTrl(Identifier="dc4f6aa9-21e5-3237-8d2d-5c22688cbc8c")
public static String es_PE_FIELD_ScheduleProcess_ScheduleType_Description="Tipo de Programa";

@XendraTrl(Identifier="dc4f6aa9-21e5-3237-8d2d-5c22688cbc8c")
public static String es_PE_FIELD_ScheduleProcess_ScheduleType_Help="Define el metodo como se calcula la siguiente actividad.";

@XendraField(AD_Column_ID="ScheduleType",IsCentrallyMaintained=true,
AD_Tab_ID="78fe33fa-e8bd-19d7-d650-8575b892c489",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dc4f6aa9-21e5-3237-8d2d-5c22688cbc8c")
public static final String FIELDNAME_ScheduleProcess_ScheduleType="dc4f6aa9-21e5-3237-8d2d-5c22688cbc8c";

@XendraTrl(Identifier="554312cb-8c00-db13-9616-2c22e8f58f65")
public static String es_PE_COLUMN_ScheduleType_Name="Tipo de Programa";

@XendraColumn(AD_Element_ID="c5db1c85-fef3-0a44-52c8-0f9c5dfd27bb",ColumnName="ScheduleType",
AD_Reference_ID=17,AD_Reference_Value_ID="4c0c19ed-6f41-afdc-47cd-d1649d8b484f",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="F",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="554312cb-8c00-db13-9616-2c22e8f58f65",Synchronized="2019-08-30 22:20:40.0")
/** Column name ScheduleType */
public static final String COLUMNNAME_ScheduleType = "ScheduleType";
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

@XendraTrl(Identifier="5c3f70ec-1485-82a3-2e4f-630065c2b1c3")
public static String es_PE_FIELD_ScheduleProcess_Supervisor_Name="Supervisor";

@XendraTrl(Identifier="5c3f70ec-1485-82a3-2e4f-630065c2b1c3")
public static String es_PE_FIELD_ScheduleProcess_Supervisor_Description="Supervisor para este usuario - usado para escalación";

@XendraTrl(Identifier="5c3f70ec-1485-82a3-2e4f-630065c2b1c3")
public static String es_PE_FIELD_ScheduleProcess_Supervisor_Help="El supervisor indica quien será usado para reenviar y escalar emisiones este usuario.";

@XendraField(AD_Column_ID="Supervisor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="78fe33fa-e8bd-19d7-d650-8575b892c489",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5c3f70ec-1485-82a3-2e4f-630065c2b1c3")
public static final String FIELDNAME_ScheduleProcess_Supervisor="5c3f70ec-1485-82a3-2e4f-630065c2b1c3";

@XendraTrl(Identifier="f479eff3-2ad5-8d72-e528-0d3b5e38c40b")
public static String es_PE_COLUMN_Supervisor_ID_Name="Supervisor";

@XendraColumn(AD_Element_ID="cb6ad258-6bb2-80b2-a90f-63c4d947479b",ColumnName="Supervisor_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="65ec50be-ff59-adbc-c1f5-a20495af24e5",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f479eff3-2ad5-8d72-e528-0d3b5e38c40b",Synchronized="2019-08-30 22:20:40.0")
/** Column name Supervisor_ID */
public static final String COLUMNNAME_Supervisor_ID = "Supervisor_ID";
/** Set Synchronized.
@param Synchronized Synchronized */
public void setSynchronized (Timestamp Synchronized)
{
set_Value (COLUMNNAME_Synchronized, Synchronized);
}
/** Get Synchronized.
@return Synchronized */
public Timestamp getSynchronized() 
{
return (Timestamp)get_Value(COLUMNNAME_Synchronized);
}

@XendraTrl(Identifier="7b2a50f2-d1f2-4e3b-b1dc-526b54e4f0fc")
public static String es_PE_FIELD_ScheduleProcess_Synchronized_Name="Synchronized";

@XendraField(AD_Column_ID="Synchronized",IsCentrallyMaintained=true,
AD_Tab_ID="78fe33fa-e8bd-19d7-d650-8575b892c489",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-10-17 18:44:38.0",
Identifier="7b2a50f2-d1f2-4e3b-b1dc-526b54e4f0fc")
public static final String FIELDNAME_ScheduleProcess_Synchronized="7b2a50f2-d1f2-4e3b-b1dc-526b54e4f0fc";

@XendraTrl(Identifier="dda8af67-656f-4445-84a5-0182b2725778")
public static String es_PE_COLUMN_Synchronized_Name="Synchronized";

@XendraColumn(AD_Element_ID="08f1e976-ceeb-f830-9d75-bf94f13a98ce",ColumnName="Synchronized",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dda8af67-656f-4445-84a5-0182b2725778",
Synchronized="2019-08-30 22:20:40.0")
/** Column name Synchronized */
public static final String COLUMNNAME_Synchronized = "Synchronized";
/** Set Tag.
@param Tag Tag */
public void setTag (String Tag)
{
if (Tag != null && Tag.length() > 10)
{
log.warning("Length > 10 - truncated");
Tag = Tag.substring(0,9);
}
set_Value (COLUMNNAME_Tag, Tag);
}
/** Get Tag.
@return Tag */
public String getTag() 
{
String value = (String)get_Value(COLUMNNAME_Tag);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="1a5b52a9-747c-4869-ab57-f773f108dbee")
public static String es_PE_FIELD_ScheduleProcess_Tag_Name="tag";
@XendraField(AD_Column_ID="Tag",
IsCentrallyMaintained=true,AD_Tab_ID="78fe33fa-e8bd-19d7-d650-8575b892c489",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=130,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2016-12-20 19:36:33.0",Identifier="1a5b52a9-747c-4869-ab57-f773f108dbee")
public static final String FIELDNAME_ScheduleProcess_Tag="1a5b52a9-747c-4869-ab57-f773f108dbee";

@XendraTrl(Identifier="16ec67db-c41e-4030-9a3c-27fba02587f2")
public static String es_PE_COLUMN_Tag_Name="tag";

@XendraColumn(AD_Element_ID="ed47fb4d-b4da-4b96-b307-95641913f2e5",ColumnName="Tag",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="16ec67db-c41e-4030-9a3c-27fba02587f2",
Synchronized="2019-08-30 22:20:40.0")
/** Column name Tag */
public static final String COLUMNNAME_Tag = "Tag";
/** Set Day of the Week.
@param WeekDay Day of the Week */
public void setWeekDay (String WeekDay)
{
if (WeekDay != null && WeekDay.length() > 1)
{
log.warning("Length > 1 - truncated");
WeekDay = WeekDay.substring(0,0);
}
set_Value (COLUMNNAME_WeekDay, WeekDay);
}
/** Get Day of the Week.
@return Day of the Week */
public String getWeekDay() 
{
return (String)get_Value(COLUMNNAME_WeekDay);
}

@XendraTrl(Identifier="16da4fe4-af4e-4878-d562-856b071bed90")
public static String es_PE_FIELD_ScheduleProcess_DayOfTheWeek_Name="Día de la Semana";

@XendraTrl(Identifier="16da4fe4-af4e-4878-d562-856b071bed90")
public static String es_PE_FIELD_ScheduleProcess_DayOfTheWeek_Description="Dia de la semana";

@XendraField(AD_Column_ID="WeekDay",IsCentrallyMaintained=true,
AD_Tab_ID="78fe33fa-e8bd-19d7-d650-8575b892c489",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ScheduleType@=W",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="16da4fe4-af4e-4878-d562-856b071bed90")
public static final String FIELDNAME_ScheduleProcess_DayOfTheWeek="16da4fe4-af4e-4878-d562-856b071bed90";

@XendraTrl(Identifier="369d81a0-585f-f27e-aa64-6135ccad3eee")
public static String es_PE_COLUMN_WeekDay_Name="Día de la Semana";

@XendraColumn(AD_Element_ID="d262df44-aa48-16aa-6826-d59e440dc764",ColumnName="WeekDay",
AD_Reference_ID=17,AD_Reference_Value_ID="83e938bc-4a87-77a1-cbb0-83c31065e487",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="369d81a0-585f-f27e-aa64-6135ccad3eee",Synchronized="2019-08-30 22:20:40.0")
/** Column name WeekDay */
public static final String COLUMNNAME_WeekDay = "WeekDay";
}
