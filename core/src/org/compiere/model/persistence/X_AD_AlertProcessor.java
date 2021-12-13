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
/** Generated Model for AD_AlertProcessor
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_AlertProcessor extends PO
{
/** Standard Constructor
@param ctx context
@param AD_AlertProcessor_ID id
@param trxName transaction
*/
public X_AD_AlertProcessor (Properties ctx, int AD_AlertProcessor_ID, String trxName)
{
super (ctx, AD_AlertProcessor_ID, trxName);
/** if (AD_AlertProcessor_ID == 0)
{
setAD_AlertProcessor_ID (0);
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
public X_AD_AlertProcessor (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=700 */
public static int Table_ID=MTable.getTable_ID("AD_AlertProcessor");

@XendraTrl(Identifier="43e92aff-902d-8045-6595-58f541f6eb74")
public static String es_PE_TAB_Processor_Description="";

@XendraTrl(Identifier="43e92aff-902d-8045-6595-58f541f6eb74")
public static String es_PE_TAB_Processor_Name="Procesador Alertas";
@XendraTab(Name="Processor",
Description="Alert Processor",Help="",AD_Window_ID="859d189f-b63b-7afe-bad1-f24109c558c0",SeqNo=10,
TabLevel=0,IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="",HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="43e92aff-902d-8045-6595-58f541f6eb74",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Processor="43e92aff-902d-8045-6595-58f541f6eb74";

@XendraTrl(Identifier="41849b70-9827-fbaa-f748-19a4be753fe1")
public static String es_PE_TABLE_AD_AlertProcessor_Name="Procesador de Alertas";

@XendraTable(Name="Alert Processor",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Alert Processor/Server Parameter",
Help="",TableName="AD_AlertProcessor",AccessLevel="6",
AD_Window_ID="859d189f-b63b-7afe-bad1-f24109c558c0",AD_Val_Rule_ID="",IsKey=1,LoadSeq=135,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.dictionary",Identifier="41849b70-9827-fbaa-f748-19a4be753fe1",
Synchronized="2020-03-03 21:34:51.0")
/** TableName=AD_AlertProcessor */
public static final String Table_Name="AD_AlertProcessor";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_AlertProcessor");

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
    Table_ID = MTable.getTable_ID("AD_AlertProcessor");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_AlertProcessor[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Alert Processor.
@param AD_AlertProcessor_ID Alert Processor/Server Parameter */
public void setAD_AlertProcessor_ID (int AD_AlertProcessor_ID)
{
if (AD_AlertProcessor_ID < 1) throw new IllegalArgumentException ("AD_AlertProcessor_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_AlertProcessor_ID, Integer.valueOf(AD_AlertProcessor_ID));
}
/** Get Alert Processor.
@return Alert Processor/Server Parameter */
public int getAD_AlertProcessor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_AlertProcessor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c724434d-7942-78f6-85b1-187db814a2f7")
public static String es_PE_FIELD_Processor_AlertProcessor_Name="Procesador de Alertas";

@XendraTrl(Identifier="c724434d-7942-78f6-85b1-187db814a2f7")
public static String es_PE_FIELD_Processor_AlertProcessor_Description="Procesador de alertas / Parámetros del servidor.";

@XendraTrl(Identifier="c724434d-7942-78f6-85b1-187db814a2f7")
public static String es_PE_FIELD_Processor_AlertProcessor_Help="Procesador de alertas / Parámetros del servidor.";

@XendraField(AD_Column_ID="AD_AlertProcessor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43e92aff-902d-8045-6595-58f541f6eb74",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c724434d-7942-78f6-85b1-187db814a2f7")
public static final String FIELDNAME_Processor_AlertProcessor="c724434d-7942-78f6-85b1-187db814a2f7";
/** Column name AD_AlertProcessor_ID */
public static final String COLUMNNAME_AD_AlertProcessor_ID = "AD_AlertProcessor_ID";
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

@XendraTrl(Identifier="7399f7f8-e674-42bc-b922-fddb78e99db5")
public static String es_PE_COLUMN_A_Machine_ID_Name="Machine ";

@XendraColumn(AD_Element_ID="5ca659c9-c8cc-4dd1-8e7c-ddc2fe399392",ColumnName="A_Machine_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7399f7f8-e674-42bc-b922-fddb78e99db5",
Synchronized="2020-03-03 21:34:19.0")
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

@XendraTrl(Identifier="49291734-3ea4-f0c8-68de-645315207aa1")
public static String es_PE_FIELD_Processor_DateLastRun_Name="Última Fecha de Corrida";

@XendraTrl(Identifier="49291734-3ea4-f0c8-68de-645315207aa1")
public static String es_PE_FIELD_Processor_DateLastRun_Description="Fecha en que el proceso fue corrido por última vez";

@XendraTrl(Identifier="49291734-3ea4-f0c8-68de-645315207aa1")
public static String es_PE_FIELD_Processor_DateLastRun_Help="La fecha de última corrida indica la última vez que se corrió un proceso";

@XendraField(AD_Column_ID="DateLastRun",IsCentrallyMaintained=true,
AD_Tab_ID="43e92aff-902d-8045-6595-58f541f6eb74",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="49291734-3ea4-f0c8-68de-645315207aa1")
public static final String FIELDNAME_Processor_DateLastRun="49291734-3ea4-f0c8-68de-645315207aa1";

@XendraTrl(Identifier="f86bccb3-8195-b86c-aeb2-352c6e015876")
public static String es_PE_COLUMN_DateLastRun_Name="Última Fecha de Corrida";

@XendraColumn(AD_Element_ID="e4c09739-6370-19ca-fdeb-4cdf8025abb8",ColumnName="DateLastRun",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f86bccb3-8195-b86c-aeb2-352c6e015876",
Synchronized="2020-03-03 21:34:19.0")
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

@XendraTrl(Identifier="523770af-5a99-aa1e-c980-fe36b62fa076")
public static String es_PE_FIELD_Processor_DateNextRun_Name="Siguiente Fecha de Corrida";

@XendraTrl(Identifier="523770af-5a99-aa1e-c980-fe36b62fa076")
public static String es_PE_FIELD_Processor_DateNextRun_Description="Fecha en que el proceso será corrido la siguiente vez";

@XendraTrl(Identifier="523770af-5a99-aa1e-c980-fe36b62fa076")
public static String es_PE_FIELD_Processor_DateNextRun_Help="La fecha de la siguiente corrida indica la siguiente vez que este proceso se correrá.";

@XendraField(AD_Column_ID="DateNextRun",IsCentrallyMaintained=true,
AD_Tab_ID="43e92aff-902d-8045-6595-58f541f6eb74",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="523770af-5a99-aa1e-c980-fe36b62fa076")
public static final String FIELDNAME_Processor_DateNextRun="523770af-5a99-aa1e-c980-fe36b62fa076";

@XendraTrl(Identifier="a1a9505e-3ec9-93e9-3d56-58fbb99a3846")
public static String es_PE_COLUMN_DateNextRun_Name="Siguiente Fecha de Corrida";

@XendraColumn(AD_Element_ID="215eac34-7f19-f6b2-ebeb-e6fbdb06d7ee",ColumnName="DateNextRun",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a1a9505e-3ec9-93e9-3d56-58fbb99a3846",
Synchronized="2020-03-03 21:34:19.0")
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

@XendraTrl(Identifier="89e14375-950a-907d-99c6-7babb3fc6b3c")
public static String es_PE_FIELD_Processor_Description_Name="Observación";

@XendraTrl(Identifier="89e14375-950a-907d-99c6-7babb3fc6b3c")
public static String es_PE_FIELD_Processor_Description_Description="Observación";

@XendraTrl(Identifier="89e14375-950a-907d-99c6-7babb3fc6b3c")
public static String es_PE_FIELD_Processor_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="43e92aff-902d-8045-6595-58f541f6eb74",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="89e14375-950a-907d-99c6-7babb3fc6b3c")
public static final String FIELDNAME_Processor_Description="89e14375-950a-907d-99c6-7babb3fc6b3c";

@XendraTrl(Identifier="08b29b21-75e7-5e2a-efea-1a35aaf2c389")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="08b29b21-75e7-5e2a-efea-1a35aaf2c389",
Synchronized="2020-03-03 21:34:19.0")
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

@XendraTrl(Identifier="f952b1c0-3957-df8a-9db3-b37415bf8bd7")
public static String es_PE_FIELD_Processor_Frequency_Name="Frecuencia";

@XendraTrl(Identifier="f952b1c0-3957-df8a-9db3-b37415bf8bd7")
public static String es_PE_FIELD_Processor_Frequency_Description="Frecuencia de proceso del requerimiento";

@XendraTrl(Identifier="f952b1c0-3957-df8a-9db3-b37415bf8bd7")
public static String es_PE_FIELD_Processor_Frequency_Help="La Frecuencia se usa junto con el tipo de frecuencia para determinar cuando un requerimiento será procesado.";

@XendraField(AD_Column_ID="Frequency",IsCentrallyMaintained=true,
AD_Tab_ID="43e92aff-902d-8045-6595-58f541f6eb74",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f952b1c0-3957-df8a-9db3-b37415bf8bd7")
public static final String FIELDNAME_Processor_Frequency="f952b1c0-3957-df8a-9db3-b37415bf8bd7";

@XendraTrl(Identifier="134747b7-45cf-4154-490a-15877567ce33")
public static String es_PE_COLUMN_Frequency_Name="Frecuencia";

@XendraColumn(AD_Element_ID="cd717b11-c45b-527f-9abd-4533f87b759f",ColumnName="Frequency",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="134747b7-45cf-4154-490a-15877567ce33",
Synchronized="2020-03-03 21:34:19.0")
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

@XendraTrl(Identifier="06bd033c-0912-4323-93c7-d74e838f2100")
public static String es_PE_COLUMN_FrequencyStartAt_Name="FrequencyStartAt";

@XendraColumn(AD_Element_ID="42d884cb-6480-428f-bef3-5e0802c0de5b",ColumnName="FrequencyStartAt",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="06bd033c-0912-4323-93c7-d74e838f2100",
Synchronized="2020-03-03 21:34:19.0")
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

@XendraTrl(Identifier="1d9bda49-1174-ca86-3c3c-1c2ef21925e2")
public static String es_PE_FIELD_Processor_FrequencyType_Name="Tipo de Frecuencia";

@XendraTrl(Identifier="1d9bda49-1174-ca86-3c3c-1c2ef21925e2")
public static String es_PE_FIELD_Processor_FrequencyType_Description="Frecuencia de cálculo";

@XendraTrl(Identifier="1d9bda49-1174-ca86-3c3c-1c2ef21925e2")
public static String es_PE_FIELD_Processor_FrequencyType_Help="El Tipo de frecuencia se usa para calcular las fechas de inicio y fin del cálculo";

@XendraField(AD_Column_ID="FrequencyType",IsCentrallyMaintained=true,
AD_Tab_ID="43e92aff-902d-8045-6595-58f541f6eb74",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1d9bda49-1174-ca86-3c3c-1c2ef21925e2")
public static final String FIELDNAME_Processor_FrequencyType="1d9bda49-1174-ca86-3c3c-1c2ef21925e2";

@XendraTrl(Identifier="cfd6e869-2ab9-bfaf-e5a8-4a598cd59dcd")
public static String es_PE_COLUMN_FrequencyType_Name="Tipo de Frecuencia";

@XendraColumn(AD_Element_ID="d2dcc6d7-4c3b-0646-5dc8-3df7514121af",ColumnName="FrequencyType",
AD_Reference_ID=17,AD_Reference_Value_ID="a8e24598-16fb-a392-7587-12a112938032",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="cfd6e869-2ab9-bfaf-e5a8-4a598cd59dcd",Synchronized="2020-03-03 21:34:19.0")
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
@XendraTrl(Identifier="f7d5354d-0571-43c7-9e12-08d7002e8346")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f7d5354d-0571-43c7-9e12-08d7002e8346",
Synchronized="2020-03-03 21:34:19.0")
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

@XendraTrl(Identifier="795e77ad-5993-d341-33bc-06cf2e596b7e")
public static String es_PE_FIELD_Processor_DaysToKeepLog_Name="Días para Guardar el Registro";

@XendraTrl(Identifier="795e77ad-5993-d341-33bc-06cf2e596b7e")
public static String es_PE_FIELD_Processor_DaysToKeepLog_Description="Número de días para guardar las entradas del registro";

@XendraTrl(Identifier="795e77ad-5993-d341-33bc-06cf2e596b7e")
public static String es_PE_FIELD_Processor_DaysToKeepLog_Help="Las entradas de un registro mas viejo pueden ser suprimidas";

@XendraField(AD_Column_ID="KeepLogDays",IsCentrallyMaintained=true,
AD_Tab_ID="43e92aff-902d-8045-6595-58f541f6eb74",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="795e77ad-5993-d341-33bc-06cf2e596b7e")
public static final String FIELDNAME_Processor_DaysToKeepLog="795e77ad-5993-d341-33bc-06cf2e596b7e";

@XendraTrl(Identifier="d17e4440-2e9d-b88d-caa9-a9ed96dd5fd5")
public static String es_PE_COLUMN_KeepLogDays_Name="Días para guardar el registro";

@XendraColumn(AD_Element_ID="5f6abdde-d6c5-cc1d-af35-b05c5b66edd5",ColumnName="KeepLogDays",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="7",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d17e4440-2e9d-b88d-caa9-a9ed96dd5fd5",
Synchronized="2020-03-03 21:34:19.0")
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

@XendraTrl(Identifier="8b921a9d-bcba-a8d0-c3e9-d6b83bad3c8e")
public static String es_PE_FIELD_Processor_Name_Name="Nombre";

@XendraTrl(Identifier="8b921a9d-bcba-a8d0-c3e9-d6b83bad3c8e")
public static String es_PE_FIELD_Processor_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="8b921a9d-bcba-a8d0-c3e9-d6b83bad3c8e")
public static String es_PE_FIELD_Processor_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="43e92aff-902d-8045-6595-58f541f6eb74",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8b921a9d-bcba-a8d0-c3e9-d6b83bad3c8e")
public static final String FIELDNAME_Processor_Name="8b921a9d-bcba-a8d0-c3e9-d6b83bad3c8e";

@XendraTrl(Identifier="08b47847-6542-c105-e89e-eb3e3c075635")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="08b47847-6542-c105-e89e-eb3e3c075635",
Synchronized="2020-03-03 21:34:19.0")
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

@XendraTrl(Identifier="3640c475-76e2-dd8f-f55a-16f197ded651")
public static String es_PE_FIELD_Processor_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="43e92aff-902d-8045-6595-58f541f6eb74",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3640c475-76e2-dd8f-f55a-16f197ded651")
public static final String FIELDNAME_Processor_ProcessNow="3640c475-76e2-dd8f-f55a-16f197ded651";

@XendraTrl(Identifier="a8922466-57f6-cafc-971e-a3eb1ff53a0a")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a8922466-57f6-cafc-971e-a3eb1ff53a0a",
Synchronized="2020-03-03 21:34:19.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
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

@XendraTrl(Identifier="515e6903-5d25-c230-0dfd-a697af247a26")
public static String es_PE_FIELD_Processor_Supervisor_Name="Supervisor";

@XendraTrl(Identifier="515e6903-5d25-c230-0dfd-a697af247a26")
public static String es_PE_FIELD_Processor_Supervisor_Description="Supervisor para este usuario - usado para escalación";

@XendraTrl(Identifier="515e6903-5d25-c230-0dfd-a697af247a26")
public static String es_PE_FIELD_Processor_Supervisor_Help="El supervisor indica quien será usado para reenviar y escalar emisiones este usuario.";

@XendraField(AD_Column_ID="Supervisor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43e92aff-902d-8045-6595-58f541f6eb74",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="515e6903-5d25-c230-0dfd-a697af247a26")
public static final String FIELDNAME_Processor_Supervisor="515e6903-5d25-c230-0dfd-a697af247a26";

@XendraTrl(Identifier="60740e36-5a65-e732-f366-49b20fcce677")
public static String es_PE_COLUMN_Supervisor_ID_Name="Supervisor";

@XendraColumn(AD_Element_ID="cb6ad258-6bb2-80b2-a90f-63c4d947479b",ColumnName="Supervisor_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="65ec50be-ff59-adbc-c1f5-a20495af24e5",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="60740e36-5a65-e732-f366-49b20fcce677",Synchronized="2020-03-03 21:34:19.0")
/** Column name Supervisor_ID */
public static final String COLUMNNAME_Supervisor_ID = "Supervisor_ID";
}
