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
/** Generated Model for AD_WorkflowProcessor
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_WorkflowProcessor extends PO
{
/** Standard Constructor
@param ctx context
@param AD_WorkflowProcessor_ID id
@param trxName transaction
*/
public X_AD_WorkflowProcessor (Properties ctx, int AD_WorkflowProcessor_ID, String trxName)
{
super (ctx, AD_WorkflowProcessor_ID, trxName);
/** if (AD_WorkflowProcessor_ID == 0)
{
setAD_WorkflowProcessor_ID (0);
setFrequency (0);
setFrequencyType (null);
setKeepLogDays (0);	
// 7
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
public X_AD_WorkflowProcessor (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=697 */
public static int Table_ID=MTable.getTable_ID("AD_WorkflowProcessor");

@XendraTrl(Identifier="41686481-fdb6-68cf-3b23-c2f10a27268a")
public static String es_PE_TAB_WorkflowProcessor_Description="Servidor de Procesador Flujo de trabajo";

@XendraTrl(Identifier="41686481-fdb6-68cf-3b23-c2f10a27268a")
public static String es_PE_TAB_WorkflowProcessor_Help="Procesador del servidor de flujo de trabajo";

@XendraTrl(Identifier="41686481-fdb6-68cf-3b23-c2f10a27268a")
public static String es_PE_TAB_WorkflowProcessor_Name="Procesador Flujos de Trabajo";

@XendraTab(Name="Workflow Processor",Description="Workflow Processor Server",
Help="Workflow Processor Server",AD_Window_ID="87bf7f4e-6805-23e6-bf70-d864ee5329a0",SeqNo=10,
TabLevel=0,IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="",HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="41686481-fdb6-68cf-3b23-c2f10a27268a",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_WorkflowProcessor="41686481-fdb6-68cf-3b23-c2f10a27268a";

@XendraTrl(Identifier="8f5a60fc-2293-3451-f8b5-862c54aac11d")
public static String es_PE_TABLE_AD_WorkflowProcessor_Name="Procesador FT";

@XendraTable(Name="Workflow Processor",AD_Package_ID="9df191d4-b8da-879a-276b-6e16b286e868",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Workflow Processor Server",
Help="",TableName="AD_WorkflowProcessor",AccessLevel="4",
AD_Window_ID="87bf7f4e-6805-23e6-bf70-d864ee5329a0",AD_Val_Rule_ID="",IsKey=1,LoadSeq=120,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.workflow",Identifier="8f5a60fc-2293-3451-f8b5-862c54aac11d",
Synchronized="2020-03-03 21:36:14.0")
/** TableName=AD_WorkflowProcessor */
public static final String Table_Name="AD_WorkflowProcessor";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_WorkflowProcessor");

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
    Table_ID = MTable.getTable_ID("AD_WorkflowProcessor");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_WorkflowProcessor[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Workflow Processor.
@param AD_WorkflowProcessor_ID Workflow Processor Server */
public void setAD_WorkflowProcessor_ID (int AD_WorkflowProcessor_ID)
{
if (AD_WorkflowProcessor_ID < 1) throw new IllegalArgumentException ("AD_WorkflowProcessor_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_WorkflowProcessor_ID, Integer.valueOf(AD_WorkflowProcessor_ID));
}
/** Get Workflow Processor.
@return Workflow Processor Server */
public int getAD_WorkflowProcessor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_WorkflowProcessor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f55f2a48-e2e1-ff0b-d5c7-1602ff33e8c4")
public static String es_PE_FIELD_WorkflowProcessor_WorkflowProcessor_Name="Procesador FT";

@XendraTrl(Identifier="f55f2a48-e2e1-ff0b-d5c7-1602ff33e8c4")
public static String es_PE_FIELD_WorkflowProcessor_WorkflowProcessor_Description="Servidor del procesador del flujo de trabajo";

@XendraTrl(Identifier="f55f2a48-e2e1-ff0b-d5c7-1602ff33e8c4")
public static String es_PE_FIELD_WorkflowProcessor_WorkflowProcessor_Help="Servidor del procesador del flujo de trabajo";

@XendraField(AD_Column_ID="AD_WorkflowProcessor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="41686481-fdb6-68cf-3b23-c2f10a27268a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f55f2a48-e2e1-ff0b-d5c7-1602ff33e8c4")
public static final String FIELDNAME_WorkflowProcessor_WorkflowProcessor="f55f2a48-e2e1-ff0b-d5c7-1602ff33e8c4";
/** Column name AD_WorkflowProcessor_ID */
public static final String COLUMNNAME_AD_WorkflowProcessor_ID = "AD_WorkflowProcessor_ID";
/** Set Alert over Priority.
@param AlertOverPriority Send alert email when over priority */
public void setAlertOverPriority (int AlertOverPriority)
{
set_Value (COLUMNNAME_AlertOverPriority, Integer.valueOf(AlertOverPriority));
}
/** Get Alert over Priority.
@return Send alert email when over priority */
public int getAlertOverPriority() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AlertOverPriority);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="090a96b4-067d-0e65-d6f5-70c090d8b221")
public static String es_PE_FIELD_WorkflowProcessor_AlertOverPriority_Name="Alerta Sobre Prioridad";

@XendraTrl(Identifier="090a96b4-067d-0e65-d6f5-70c090d8b221")
public static String es_PE_FIELD_WorkflowProcessor_AlertOverPriority_Description="Enviar Email de alerta cuando este sobre prioridad.";

@XendraTrl(Identifier="090a96b4-067d-0e65-d6f5-70c090d8b221")
public static String es_PE_FIELD_WorkflowProcessor_AlertOverPriority_Help="Enviar Email de alerta cuando una actividad suspendida este sobre la prioridad definida.";

@XendraField(AD_Column_ID="AlertOverPriority",IsCentrallyMaintained=true,
AD_Tab_ID="41686481-fdb6-68cf-3b23-c2f10a27268a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="090a96b4-067d-0e65-d6f5-70c090d8b221")
public static final String FIELDNAME_WorkflowProcessor_AlertOverPriority="090a96b4-067d-0e65-d6f5-70c090d8b221";

@XendraTrl(Identifier="dd575639-f115-2344-a629-4b7d8c3d8377")
public static String es_PE_COLUMN_AlertOverPriority_Name="Alerta sobre prioridad";

@XendraColumn(AD_Element_ID="a7b7b2cd-b286-bc10-da22-ddb29624897c",ColumnName="AlertOverPriority",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dd575639-f115-2344-a629-4b7d8c3d8377",
Synchronized="2019-08-30 22:20:55.0")
/** Column name AlertOverPriority */
public static final String COLUMNNAME_AlertOverPriority = "AlertOverPriority";
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

@XendraTrl(Identifier="376ff055-bb5e-4545-a877-d7faea67a79d")
public static String es_PE_COLUMN_A_Machine_ID_Name="Machine ";

@XendraColumn(AD_Element_ID="5ca659c9-c8cc-4dd1-8e7c-ddc2fe399392",ColumnName="A_Machine_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="376ff055-bb5e-4545-a877-d7faea67a79d",
Synchronized="2019-08-30 22:20:55.0")
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

@XendraTrl(Identifier="811f3113-3862-9e1a-c2ca-fdaf06f3ecbb")
public static String es_PE_FIELD_WorkflowProcessor_DateLastRun_Name="Última Fecha de Corrida";

@XendraTrl(Identifier="811f3113-3862-9e1a-c2ca-fdaf06f3ecbb")
public static String es_PE_FIELD_WorkflowProcessor_DateLastRun_Description="Fecha en que el proceso fue corrido por última vez";

@XendraTrl(Identifier="811f3113-3862-9e1a-c2ca-fdaf06f3ecbb")
public static String es_PE_FIELD_WorkflowProcessor_DateLastRun_Help="La fecha de última corrida indica la última vez que se corrió un proceso";

@XendraField(AD_Column_ID="DateLastRun",IsCentrallyMaintained=true,
AD_Tab_ID="41686481-fdb6-68cf-3b23-c2f10a27268a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="811f3113-3862-9e1a-c2ca-fdaf06f3ecbb")
public static final String FIELDNAME_WorkflowProcessor_DateLastRun="811f3113-3862-9e1a-c2ca-fdaf06f3ecbb";

@XendraTrl(Identifier="6b2979f8-2eea-424a-7842-ba6d12dbd943")
public static String es_PE_COLUMN_DateLastRun_Name="Última Fecha de Corrida";

@XendraColumn(AD_Element_ID="e4c09739-6370-19ca-fdeb-4cdf8025abb8",ColumnName="DateLastRun",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6b2979f8-2eea-424a-7842-ba6d12dbd943",
Synchronized="2019-08-30 22:20:55.0")
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

@XendraTrl(Identifier="2c87a4a8-24d0-f801-cfe2-e1378549dbad")
public static String es_PE_FIELD_WorkflowProcessor_DateNextRun_Name="Siguiente Fecha de Corrida";

@XendraTrl(Identifier="2c87a4a8-24d0-f801-cfe2-e1378549dbad")
public static String es_PE_FIELD_WorkflowProcessor_DateNextRun_Description="Fecha en que el proceso será corrido la siguiente vez";

@XendraTrl(Identifier="2c87a4a8-24d0-f801-cfe2-e1378549dbad")
public static String es_PE_FIELD_WorkflowProcessor_DateNextRun_Help="La fecha de la siguiente corrida indica la siguiente vez que este proceso se correrá.";

@XendraField(AD_Column_ID="DateNextRun",IsCentrallyMaintained=true,
AD_Tab_ID="41686481-fdb6-68cf-3b23-c2f10a27268a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2c87a4a8-24d0-f801-cfe2-e1378549dbad")
public static final String FIELDNAME_WorkflowProcessor_DateNextRun="2c87a4a8-24d0-f801-cfe2-e1378549dbad";

@XendraTrl(Identifier="0ec2a483-3d5d-ba22-e6b7-c599402ac691")
public static String es_PE_COLUMN_DateNextRun_Name="Siguiente Fecha de Corrida";

@XendraColumn(AD_Element_ID="215eac34-7f19-f6b2-ebeb-e6fbdb06d7ee",ColumnName="DateNextRun",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0ec2a483-3d5d-ba22-e6b7-c599402ac691",
Synchronized="2019-08-30 22:20:55.0")
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

@XendraTrl(Identifier="712a40dc-459e-5eb1-9a8f-722a8e49edb8")
public static String es_PE_FIELD_WorkflowProcessor_Description_Name="Observación";

@XendraTrl(Identifier="712a40dc-459e-5eb1-9a8f-722a8e49edb8")
public static String es_PE_FIELD_WorkflowProcessor_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="712a40dc-459e-5eb1-9a8f-722a8e49edb8")
public static String es_PE_FIELD_WorkflowProcessor_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="41686481-fdb6-68cf-3b23-c2f10a27268a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="712a40dc-459e-5eb1-9a8f-722a8e49edb8")
public static final String FIELDNAME_WorkflowProcessor_Description="712a40dc-459e-5eb1-9a8f-722a8e49edb8";

@XendraTrl(Identifier="646e40d4-418e-b846-63be-d87dd1c81475")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="646e40d4-418e-b846-63be-d87dd1c81475",
Synchronized="2019-08-30 22:20:55.0")
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

@XendraTrl(Identifier="640162d4-6840-4e49-3a5d-fb84ea931710")
public static String es_PE_FIELD_WorkflowProcessor_Frequency_Name="Frecuencia";

@XendraTrl(Identifier="640162d4-6840-4e49-3a5d-fb84ea931710")
public static String es_PE_FIELD_WorkflowProcessor_Frequency_Description="Frecuencia de proceso del requerimiento";

@XendraTrl(Identifier="640162d4-6840-4e49-3a5d-fb84ea931710")
public static String es_PE_FIELD_WorkflowProcessor_Frequency_Help="La Frecuencia se usa junto con el tipo de frecuencia para determinar cuando un requerimiento será procesado.";

@XendraField(AD_Column_ID="Frequency",IsCentrallyMaintained=true,
AD_Tab_ID="41686481-fdb6-68cf-3b23-c2f10a27268a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="640162d4-6840-4e49-3a5d-fb84ea931710")
public static final String FIELDNAME_WorkflowProcessor_Frequency="640162d4-6840-4e49-3a5d-fb84ea931710";

@XendraTrl(Identifier="608d6061-54d3-a942-6e89-2aeb2ba8907e")
public static String es_PE_COLUMN_Frequency_Name="Frecuencia";

@XendraColumn(AD_Element_ID="cd717b11-c45b-527f-9abd-4533f87b759f",ColumnName="Frequency",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="608d6061-54d3-a942-6e89-2aeb2ba8907e",
Synchronized="2019-08-30 22:20:55.0")
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

@XendraTrl(Identifier="4a541968-a316-40cf-978d-7a79b9ccd94e")
public static String es_PE_COLUMN_FrequencyStartAt_Name="FrequencyStartAt";

@XendraColumn(AD_Element_ID="42d884cb-6480-428f-bef3-5e0802c0de5b",ColumnName="FrequencyStartAt",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4a541968-a316-40cf-978d-7a79b9ccd94e",
Synchronized="2019-08-30 22:20:55.0")
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

@XendraTrl(Identifier="873a3882-ec28-4da3-4390-4b962e763dda")
public static String es_PE_FIELD_WorkflowProcessor_FrequencyType_Name="Tipo de Frecuencia";

@XendraTrl(Identifier="873a3882-ec28-4da3-4390-4b962e763dda")
public static String es_PE_FIELD_WorkflowProcessor_FrequencyType_Description="Frecuencia de cálculo";

@XendraTrl(Identifier="873a3882-ec28-4da3-4390-4b962e763dda")
public static String es_PE_FIELD_WorkflowProcessor_FrequencyType_Help="El Tipo de frecuencia se usa para calcular las fechas de inicio y fin del cálculo";

@XendraField(AD_Column_ID="FrequencyType",IsCentrallyMaintained=true,
AD_Tab_ID="41686481-fdb6-68cf-3b23-c2f10a27268a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="873a3882-ec28-4da3-4390-4b962e763dda")
public static final String FIELDNAME_WorkflowProcessor_FrequencyType="873a3882-ec28-4da3-4390-4b962e763dda";

@XendraTrl(Identifier="0ec2014a-6e42-776b-31ed-8ec02d341430")
public static String es_PE_COLUMN_FrequencyType_Name="Tipo de Frecuencia";

@XendraColumn(AD_Element_ID="d2dcc6d7-4c3b-0646-5dc8-3df7514121af",ColumnName="FrequencyType",
AD_Reference_ID=17,AD_Reference_Value_ID="a8e24598-16fb-a392-7587-12a112938032",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0ec2014a-6e42-776b-31ed-8ec02d341430",Synchronized="2019-08-30 22:20:55.0")
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
@XendraTrl(Identifier="8075b1ac-7b9f-4c86-9f7e-7a435b984cc3")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8075b1ac-7b9f-4c86-9f7e-7a435b984cc3",
Synchronized="2019-08-30 22:20:55.0")
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

@XendraTrl(Identifier="10eb640c-ae2f-e722-e99f-be2b6a5b0203")
public static String es_PE_FIELD_WorkflowProcessor_InactivityAlertDays_Name="Alerta de Días en Inactividad";

@XendraTrl(Identifier="10eb640c-ae2f-e722-e99f-be2b6a5b0203")
public static String es_PE_FIELD_WorkflowProcessor_InactivityAlertDays_Description="Enviar una alerta cuando esté en dias de inactividad. (0= no alerta)";

@XendraTrl(Identifier="10eb640c-ae2f-e722-e99f-be2b6a5b0203")
public static String es_PE_FIELD_WorkflowProcessor_InactivityAlertDays_Help="Enviar un Email de alerta cuando el resultado no muestra actividad por el numero de dias definido.";

@XendraField(AD_Column_ID="InactivityAlertDays",IsCentrallyMaintained=true,
AD_Tab_ID="41686481-fdb6-68cf-3b23-c2f10a27268a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="10eb640c-ae2f-e722-e99f-be2b6a5b0203")
public static final String FIELDNAME_WorkflowProcessor_InactivityAlertDays="10eb640c-ae2f-e722-e99f-be2b6a5b0203";

@XendraTrl(Identifier="a264c1ad-54fe-f97d-aec9-43ead1dd11e7")
public static String es_PE_COLUMN_InactivityAlertDays_Name="Alerta de días en inactividad";

@XendraColumn(AD_Element_ID="f01ac251-dc62-6d8f-a976-30d1be112938",
ColumnName="InactivityAlertDays",AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="0",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a264c1ad-54fe-f97d-aec9-43ead1dd11e7",Synchronized="2019-08-30 22:20:55.0")
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

@XendraTrl(Identifier="edeef266-dadd-ad1e-2626-b6d79481680d")
public static String es_PE_FIELD_WorkflowProcessor_DaysToKeepLog_Name="Días para Guardar el Registro";

@XendraTrl(Identifier="edeef266-dadd-ad1e-2626-b6d79481680d")
public static String es_PE_FIELD_WorkflowProcessor_DaysToKeepLog_Description="Número de días para guardar las entradas del registro";

@XendraTrl(Identifier="edeef266-dadd-ad1e-2626-b6d79481680d")
public static String es_PE_FIELD_WorkflowProcessor_DaysToKeepLog_Help="Las entradas de un registro mas viejo pueden ser suprimidas";

@XendraField(AD_Column_ID="KeepLogDays",IsCentrallyMaintained=true,
AD_Tab_ID="41686481-fdb6-68cf-3b23-c2f10a27268a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="edeef266-dadd-ad1e-2626-b6d79481680d")
public static final String FIELDNAME_WorkflowProcessor_DaysToKeepLog="edeef266-dadd-ad1e-2626-b6d79481680d";

@XendraTrl(Identifier="091d0502-667c-350e-e791-1a88e176bd18")
public static String es_PE_COLUMN_KeepLogDays_Name="Días para guardar el registro";

@XendraColumn(AD_Element_ID="5f6abdde-d6c5-cc1d-af35-b05c5b66edd5",ColumnName="KeepLogDays",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="7",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="091d0502-667c-350e-e791-1a88e176bd18",
Synchronized="2019-08-30 22:20:55.0")
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

@XendraTrl(Identifier="fdd3c5c7-5a88-4784-cc83-2af009093cb1")
public static String es_PE_FIELD_WorkflowProcessor_Name_Name="Nombre";

@XendraTrl(Identifier="fdd3c5c7-5a88-4784-cc83-2af009093cb1")
public static String es_PE_FIELD_WorkflowProcessor_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="fdd3c5c7-5a88-4784-cc83-2af009093cb1")
public static String es_PE_FIELD_WorkflowProcessor_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="41686481-fdb6-68cf-3b23-c2f10a27268a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fdd3c5c7-5a88-4784-cc83-2af009093cb1")
public static final String FIELDNAME_WorkflowProcessor_Name="fdd3c5c7-5a88-4784-cc83-2af009093cb1";

@XendraTrl(Identifier="0838e6ef-adac-7615-d30f-8c6c37fcf35d")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0838e6ef-adac-7615-d30f-8c6c37fcf35d",
Synchronized="2019-08-30 22:20:55.0")
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

@XendraTrl(Identifier="4698b2a9-ae2e-c3ad-a242-caddf72c7407")
public static String es_PE_FIELD_WorkflowProcessor_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="41686481-fdb6-68cf-3b23-c2f10a27268a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4698b2a9-ae2e-c3ad-a242-caddf72c7407")
public static final String FIELDNAME_WorkflowProcessor_ProcessNow="4698b2a9-ae2e-c3ad-a242-caddf72c7407";

@XendraTrl(Identifier="18fce0a1-acc0-da6f-7e75-1e1646ed426f")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="18fce0a1-acc0-da6f-7e75-1e1646ed426f",
Synchronized="2019-08-30 22:20:55.0")
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

@XendraTrl(Identifier="5fe4703b-1b32-e88a-1cbe-1ad22ab53fbb")
public static String es_PE_FIELD_WorkflowProcessor_ReminderDays_Name="Días de Recordatorio";

@XendraTrl(Identifier="5fe4703b-1b32-e88a-1cbe-1ad22ab53fbb")
public static String es_PE_FIELD_WorkflowProcessor_ReminderDays_Description="Días para enviar los emails de recordatorio para un documento debido ó inactivo";

@XendraTrl(Identifier="5fe4703b-1b32-e88a-1cbe-1ad22ab53fbb")
public static String es_PE_FIELD_WorkflowProcessor_ReminderDays_Help="Cuando un documento es debido A, demasiado largo sin actividad, se envía un recordatorio. 0 no significa ningún recordatorio. Los días del recordar son los días en que se envía el recordatorio siguiente del email.";

@XendraField(AD_Column_ID="RemindDays",IsCentrallyMaintained=true,
AD_Tab_ID="41686481-fdb6-68cf-3b23-c2f10a27268a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5fe4703b-1b32-e88a-1cbe-1ad22ab53fbb")
public static final String FIELDNAME_WorkflowProcessor_ReminderDays="5fe4703b-1b32-e88a-1cbe-1ad22ab53fbb";

@XendraTrl(Identifier="4df47e45-f05a-c665-3f09-f25867eeb0f7")
public static String es_PE_COLUMN_RemindDays_Name="Días de Recordatorio";

@XendraColumn(AD_Element_ID="61c87de0-a3d9-936a-2dc0-189a6e5e587c",ColumnName="RemindDays",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="7",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4df47e45-f05a-c665-3f09-f25867eeb0f7",
Synchronized="2019-08-30 22:20:55.0")
/** Column name RemindDays */
public static final String COLUMNNAME_RemindDays = "RemindDays";
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

@XendraTrl(Identifier="ebac5c35-c40e-66b2-7e28-8ae9b1480368")
public static String es_PE_FIELD_WorkflowProcessor_Supervisor_Name="Supervisor";

@XendraTrl(Identifier="ebac5c35-c40e-66b2-7e28-8ae9b1480368")
public static String es_PE_FIELD_WorkflowProcessor_Supervisor_Description="Supervisor para este usuario - usado para escalación";

@XendraTrl(Identifier="ebac5c35-c40e-66b2-7e28-8ae9b1480368")
public static String es_PE_FIELD_WorkflowProcessor_Supervisor_Help="El supervisor indica quien será usado para reenviar y escalar emisiones este usuario.";

@XendraField(AD_Column_ID="Supervisor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="41686481-fdb6-68cf-3b23-c2f10a27268a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ebac5c35-c40e-66b2-7e28-8ae9b1480368")
public static final String FIELDNAME_WorkflowProcessor_Supervisor="ebac5c35-c40e-66b2-7e28-8ae9b1480368";

@XendraTrl(Identifier="275d5d62-c37b-bde5-e96f-969b79b21029")
public static String es_PE_COLUMN_Supervisor_ID_Name="Supervisor";

@XendraColumn(AD_Element_ID="cb6ad258-6bb2-80b2-a90f-63c4d947479b",ColumnName="Supervisor_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="65ec50be-ff59-adbc-c1f5-a20495af24e5",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="275d5d62-c37b-bde5-e96f-969b79b21029",Synchronized="2019-08-30 22:20:55.0")
/** Column name Supervisor_ID */
public static final String COLUMNNAME_Supervisor_ID = "Supervisor_ID";
}
