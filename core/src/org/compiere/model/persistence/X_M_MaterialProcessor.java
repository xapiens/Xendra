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
/** Generated Model for M_MaterialProcessor
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_MaterialProcessor extends PO
{
/** Standard Constructor
@param ctx context
@param M_MaterialProcessor_ID id
@param trxName transaction
*/
public X_M_MaterialProcessor (Properties ctx, int M_MaterialProcessor_ID, String trxName)
{
super (ctx, M_MaterialProcessor_ID, trxName);
/** if (M_MaterialProcessor_ID == 0)
{
setFrequency (0);
setFrequencyType (null);
setKeepLogDays (0);
setM_MaterialProcessor_ID (0);
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
public X_M_MaterialProcessor (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000350 */
public static int Table_ID=MTable.getTable_ID("M_MaterialProcessor");

@XendraTrl(Identifier="85b07e20-b2dc-4c0e-8e16-32431f685acb")
public static String es_PE_TAB_MaterialProcessor_Name="Material Processor";

@XendraTab(Name="Material Processor",Description="",Help="",
AD_Window_ID="f8deeb00-bafb-48f0-8ec8-7e17fae48c6c",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="85b07e20-b2dc-4c0e-8e16-32431f685acb",Synchronized="2016-08-09 07:09:39.0")
public static final String TABNAME_MaterialProcessor="85b07e20-b2dc-4c0e-8e16-32431f685acb";

@XendraTrl(Identifier="c61a5195-a7d4-4010-951e-f3693a069012")
public static String es_PE_TABLE_M_MaterialProcessor_Name="Material Processor";

@XendraTable(Name="Material Processor",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="M_MaterialProcessor",AccessLevel="3",
AD_Window_ID="f8deeb00-bafb-48f0-8ec8-7e17fae48c6c",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.material",Identifier="c61a5195-a7d4-4010-951e-f3693a069012",
Synchronized="2020-03-03 21:38:39.0")
/** TableName=M_MaterialProcessor */
public static final String Table_Name="M_MaterialProcessor";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_MaterialProcessor");

protected BigDecimal accessLevel = BigDecimal.valueOf(3);
/** AccessLevel
@return 3 - Client - Org 
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
    Table_ID = MTable.getTable_ID("M_MaterialProcessor");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_MaterialProcessor[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="6d9fd5b8-8a66-4ff0-81dd-7cae8ac26f21")
public static String es_PE_FIELD_MaterialProcessor_Machine_Name="Machine ";

@XendraField(AD_Column_ID="A_Machine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="85b07e20-b2dc-4c0e-8e16-32431f685acb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-08-09 07:09:39.0",
Identifier="6d9fd5b8-8a66-4ff0-81dd-7cae8ac26f21")
public static final String FIELDNAME_MaterialProcessor_Machine="6d9fd5b8-8a66-4ff0-81dd-7cae8ac26f21";

@XendraTrl(Identifier="25b916d0-916e-40ae-992e-9d1eca89c057")
public static String es_PE_COLUMN_A_Machine_ID_Name="Machine ";

@XendraColumn(AD_Element_ID="5ca659c9-c8cc-4dd1-8e7c-ddc2fe399392",ColumnName="A_Machine_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="25b916d0-916e-40ae-992e-9d1eca89c057",
Synchronized="2019-08-30 22:23:17.0")
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

@XendraTrl(Identifier="6a5d4832-e568-43ee-9289-bbc4eb227549")
public static String es_PE_FIELD_MaterialProcessor_DateLastRun_Name="Última Fecha de Corrida";

@XendraTrl(Identifier="6a5d4832-e568-43ee-9289-bbc4eb227549")
public static String es_PE_FIELD_MaterialProcessor_DateLastRun_Description="Fecha en que el proceso fue corrido por última vez";

@XendraTrl(Identifier="6a5d4832-e568-43ee-9289-bbc4eb227549")
public static String es_PE_FIELD_MaterialProcessor_DateLastRun_Help="La fecha de última corrida indica la última vez que se corrió un proceso";

@XendraField(AD_Column_ID="DateLastRun",IsCentrallyMaintained=true,
AD_Tab_ID="85b07e20-b2dc-4c0e-8e16-32431f685acb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-08-09 07:09:39.0",
Identifier="6a5d4832-e568-43ee-9289-bbc4eb227549")
public static final String FIELDNAME_MaterialProcessor_DateLastRun="6a5d4832-e568-43ee-9289-bbc4eb227549";

@XendraTrl(Identifier="2c393719-4369-41c8-a2cf-4cf7773cd0af")
public static String es_PE_COLUMN_DateLastRun_Name="Date last run";

@XendraColumn(AD_Element_ID="e4c09739-6370-19ca-fdeb-4cdf8025abb8",ColumnName="DateLastRun",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2c393719-4369-41c8-a2cf-4cf7773cd0af",
Synchronized="2019-08-30 22:23:17.0")
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

@XendraTrl(Identifier="cabe6cdd-910e-4455-afb1-6798c80465a6")
public static String es_PE_FIELD_MaterialProcessor_DateNextRun_Name="Siguiente Fecha de Corrida";

@XendraTrl(Identifier="cabe6cdd-910e-4455-afb1-6798c80465a6")
public static String es_PE_FIELD_MaterialProcessor_DateNextRun_Description="Fecha en que el proceso será corrido la siguiente vez";

@XendraTrl(Identifier="cabe6cdd-910e-4455-afb1-6798c80465a6")
public static String es_PE_FIELD_MaterialProcessor_DateNextRun_Help="La fecha de la siguiente corrida indica la siguiente vez que este proceso se correrá.";

@XendraField(AD_Column_ID="DateNextRun",IsCentrallyMaintained=true,
AD_Tab_ID="85b07e20-b2dc-4c0e-8e16-32431f685acb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-08-09 07:09:39.0",
Identifier="cabe6cdd-910e-4455-afb1-6798c80465a6")
public static final String FIELDNAME_MaterialProcessor_DateNextRun="cabe6cdd-910e-4455-afb1-6798c80465a6";

@XendraTrl(Identifier="d834813f-3980-44e1-89fd-90a6a14d80d6")
public static String es_PE_COLUMN_DateNextRun_Name="Date next run";

@XendraColumn(AD_Element_ID="215eac34-7f19-f6b2-ebeb-e6fbdb06d7ee",ColumnName="DateNextRun",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d834813f-3980-44e1-89fd-90a6a14d80d6",
Synchronized="2019-08-30 22:23:17.0")
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

@XendraTrl(Identifier="d67e937e-96ed-40c9-876b-79e29b8eda07")
public static String es_PE_FIELD_MaterialProcessor_Description_Name="Descripción";

@XendraTrl(Identifier="d67e937e-96ed-40c9-876b-79e29b8eda07")
public static String es_PE_FIELD_MaterialProcessor_Description_Description="Descripción corta opcional del registro";

@XendraTrl(Identifier="d67e937e-96ed-40c9-876b-79e29b8eda07")
public static String es_PE_FIELD_MaterialProcessor_Description_Help="Una descripción esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="85b07e20-b2dc-4c0e-8e16-32431f685acb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-08-09 07:09:39.0",
Identifier="d67e937e-96ed-40c9-876b-79e29b8eda07")
public static final String FIELDNAME_MaterialProcessor_Description="d67e937e-96ed-40c9-876b-79e29b8eda07";

@XendraTrl(Identifier="691c6395-545b-4d51-94a8-62c2a2e6d15b")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="691c6395-545b-4d51-94a8-62c2a2e6d15b",
Synchronized="2019-08-30 22:23:17.0")
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

@XendraTrl(Identifier="9954d2ea-8a12-4b56-85ae-875221050b46")
public static String es_PE_FIELD_MaterialProcessor_Frequency_Name="Frecuencia";

@XendraTrl(Identifier="9954d2ea-8a12-4b56-85ae-875221050b46")
public static String es_PE_FIELD_MaterialProcessor_Frequency_Description="Frecuencia de proceso del requerimiento";

@XendraTrl(Identifier="9954d2ea-8a12-4b56-85ae-875221050b46")
public static String es_PE_FIELD_MaterialProcessor_Frequency_Help="La Frecuencia se usa junto con el tipo de frecuencia para determinar cuando un requerimiento será procesado.";

@XendraField(AD_Column_ID="Frequency",IsCentrallyMaintained=true,
AD_Tab_ID="85b07e20-b2dc-4c0e-8e16-32431f685acb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-08-09 07:09:39.0",
Identifier="9954d2ea-8a12-4b56-85ae-875221050b46")
public static final String FIELDNAME_MaterialProcessor_Frequency="9954d2ea-8a12-4b56-85ae-875221050b46";

@XendraTrl(Identifier="eb747541-aedf-42b0-8a95-438ea5427000")
public static String es_PE_COLUMN_Frequency_Name="Frequency";

@XendraColumn(AD_Element_ID="cd717b11-c45b-527f-9abd-4533f87b759f",ColumnName="Frequency",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eb747541-aedf-42b0-8a95-438ea5427000",
Synchronized="2019-08-30 22:23:17.0")
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

@XendraTrl(Identifier="f8be545c-b63b-4d34-a685-8dd28e7ef9fa")
public static String es_PE_COLUMN_FrequencyStartAt_Name="frequencystartat";

@XendraColumn(AD_Element_ID="42d884cb-6480-428f-bef3-5e0802c0de5b",ColumnName="FrequencyStartAt",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f8be545c-b63b-4d34-a685-8dd28e7ef9fa",
Synchronized="2019-08-30 22:23:17.0")
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

@XendraTrl(Identifier="f71a6677-9303-48ec-a8e7-2cd502776507")
public static String es_PE_FIELD_MaterialProcessor_FrequencyType_Name="Tipo de Frecuencia";

@XendraTrl(Identifier="f71a6677-9303-48ec-a8e7-2cd502776507")
public static String es_PE_FIELD_MaterialProcessor_FrequencyType_Description="Frecuencia de cálculo";

@XendraTrl(Identifier="f71a6677-9303-48ec-a8e7-2cd502776507")
public static String es_PE_FIELD_MaterialProcessor_FrequencyType_Help="El Tipo de frecuencia se usa para calcular las fechas de inicio y fin del cálculo";

@XendraField(AD_Column_ID="FrequencyType",IsCentrallyMaintained=true,
AD_Tab_ID="85b07e20-b2dc-4c0e-8e16-32431f685acb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-08-09 07:09:39.0",
Identifier="f71a6677-9303-48ec-a8e7-2cd502776507")
public static final String FIELDNAME_MaterialProcessor_FrequencyType="f71a6677-9303-48ec-a8e7-2cd502776507";

@XendraTrl(Identifier="01307890-dd6b-4f49-929c-e390ae40e7d4")
public static String es_PE_COLUMN_FrequencyType_Name="Frequency Type";

@XendraColumn(AD_Element_ID="d2dcc6d7-4c3b-0646-5dc8-3df7514121af",ColumnName="FrequencyType",
AD_Reference_ID=17,AD_Reference_Value_ID="a8e24598-16fb-a392-7587-12a112938032",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="01307890-dd6b-4f49-929c-e390ae40e7d4",Synchronized="2019-08-30 22:23:17.0")
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
@XendraTrl(Identifier="f3538e4f-de6e-44f5-ad6f-446502e938a9")
public static String es_PE_FIELD_MaterialProcessor_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="85b07e20-b2dc-4c0e-8e16-32431f685acb",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-08-09 07:09:39.0",
Identifier="f3538e4f-de6e-44f5-ad6f-446502e938a9")
public static final String FIELDNAME_MaterialProcessor_Identifier="f3538e4f-de6e-44f5-ad6f-446502e938a9";

@XendraTrl(Identifier="6d4a7dfe-40cf-4cd9-a0be-ea856269e0e0")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6d4a7dfe-40cf-4cd9-a0be-ea856269e0e0",
Synchronized="2019-08-30 22:23:17.0")
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

@XendraTrl(Identifier="39d6e1be-1f3f-437a-a13a-205d04175db2")
public static String es_PE_FIELD_MaterialProcessor_DaysToKeepLog_Name="Días para guardar el registro";

@XendraTrl(Identifier="39d6e1be-1f3f-437a-a13a-205d04175db2")
public static String es_PE_FIELD_MaterialProcessor_DaysToKeepLog_Description="Número de días para guardar las entradas del registro";

@XendraTrl(Identifier="39d6e1be-1f3f-437a-a13a-205d04175db2")
public static String es_PE_FIELD_MaterialProcessor_DaysToKeepLog_Help="Las entradas de un registro mas viejo pueden ser suprimidas";

@XendraField(AD_Column_ID="KeepLogDays",IsCentrallyMaintained=true,
AD_Tab_ID="85b07e20-b2dc-4c0e-8e16-32431f685acb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-08-09 07:09:39.0",
Identifier="39d6e1be-1f3f-437a-a13a-205d04175db2")
public static final String FIELDNAME_MaterialProcessor_DaysToKeepLog="39d6e1be-1f3f-437a-a13a-205d04175db2";

@XendraTrl(Identifier="90329ae2-17a7-469f-8e01-1f764182cba1")
public static String es_PE_COLUMN_KeepLogDays_Name="Days to keep Log";

@XendraColumn(AD_Element_ID="5f6abdde-d6c5-cc1d-af35-b05c5b66edd5",ColumnName="KeepLogDays",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="90329ae2-17a7-469f-8e01-1f764182cba1",
Synchronized="2019-08-30 22:23:17.0")
/** Column name KeepLogDays */
public static final String COLUMNNAME_KeepLogDays = "KeepLogDays";
/** Set Material Processor.
@param M_MaterialProcessor_ID Material Processor */
public void setM_MaterialProcessor_ID (int M_MaterialProcessor_ID)
{
if (M_MaterialProcessor_ID < 1) throw new IllegalArgumentException ("M_MaterialProcessor_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_MaterialProcessor_ID, Integer.valueOf(M_MaterialProcessor_ID));
}
/** Get Material Processor.
@return Material Processor */
public int getM_MaterialProcessor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_MaterialProcessor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ff994a2d-c06d-4d32-8b28-e3eb961d8dec")
public static String es_PE_FIELD_MaterialProcessor_MaterialProcessor_Name="Material Processor";

@XendraField(AD_Column_ID="M_MaterialProcessor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="85b07e20-b2dc-4c0e-8e16-32431f685acb",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-08-09 07:09:39.0",
Identifier="ff994a2d-c06d-4d32-8b28-e3eb961d8dec")
public static final String FIELDNAME_MaterialProcessor_MaterialProcessor="ff994a2d-c06d-4d32-8b28-e3eb961d8dec";
/** Column name M_MaterialProcessor_ID */
public static final String COLUMNNAME_M_MaterialProcessor_ID = "M_MaterialProcessor_ID";
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

@XendraTrl(Identifier="6d2f0282-efad-4dea-9103-9b03538a01fd")
public static String es_PE_FIELD_MaterialProcessor_Name_Name="Nombre";

@XendraTrl(Identifier="6d2f0282-efad-4dea-9103-9b03538a01fd")
public static String es_PE_FIELD_MaterialProcessor_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="6d2f0282-efad-4dea-9103-9b03538a01fd")
public static String es_PE_FIELD_MaterialProcessor_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="85b07e20-b2dc-4c0e-8e16-32431f685acb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-08-09 07:09:39.0",
Identifier="6d2f0282-efad-4dea-9103-9b03538a01fd")
public static final String FIELDNAME_MaterialProcessor_Name="6d2f0282-efad-4dea-9103-9b03538a01fd";

@XendraTrl(Identifier="149da5e9-e676-4ead-8773-708a220d6055")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="149da5e9-e676-4ead-8773-708a220d6055",
Synchronized="2019-08-30 22:23:17.0")
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

@XendraTrl(Identifier="8958f500-bf33-4c54-b607-84f92d9f8721")
public static String es_PE_FIELD_MaterialProcessor_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="85b07e20-b2dc-4c0e-8e16-32431f685acb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-08-09 07:09:39.0",
Identifier="8958f500-bf33-4c54-b607-84f92d9f8721")
public static final String FIELDNAME_MaterialProcessor_ProcessNow="8958f500-bf33-4c54-b607-84f92d9f8721";

@XendraTrl(Identifier="c28007f5-523f-4880-9d96-b4575743f407")
public static String es_PE_COLUMN_Processing_Name="Process Now";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c28007f5-523f-4880-9d96-b4575743f407",
Synchronized="2019-08-30 22:23:17.0")
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

@XendraTrl(Identifier="e4179abe-5641-4f50-9522-d9a62b80d3db")
public static String es_PE_FIELD_MaterialProcessor_Supervisor_Name="Supervisor";

@XendraTrl(Identifier="e4179abe-5641-4f50-9522-d9a62b80d3db")
public static String es_PE_FIELD_MaterialProcessor_Supervisor_Description="Supervisor para este usuario - usado para escalación";

@XendraTrl(Identifier="e4179abe-5641-4f50-9522-d9a62b80d3db")
public static String es_PE_FIELD_MaterialProcessor_Supervisor_Help="El supervisor indica quien será usado para reenviar y escalar emisiones este usuario.";

@XendraField(AD_Column_ID="Supervisor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="85b07e20-b2dc-4c0e-8e16-32431f685acb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-08-09 07:09:39.0",
Identifier="e4179abe-5641-4f50-9522-d9a62b80d3db")
public static final String FIELDNAME_MaterialProcessor_Supervisor="e4179abe-5641-4f50-9522-d9a62b80d3db";

@XendraTrl(Identifier="d82c34af-f42d-4319-b672-af5e6d015155")
public static String es_PE_COLUMN_Supervisor_ID_Name="Supervisor";

@XendraColumn(AD_Element_ID="cb6ad258-6bb2-80b2-a90f-63c4d947479b",ColumnName="Supervisor_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="91f52193-02ab-6545-99f8-d6d30b9d03a1",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d82c34af-f42d-4319-b672-af5e6d015155",Synchronized="2019-08-30 22:23:17.0")
/** Column name Supervisor_ID */
public static final String COLUMNNAME_Supervisor_ID = "Supervisor_ID";
}
