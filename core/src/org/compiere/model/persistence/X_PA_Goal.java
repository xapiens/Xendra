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
import org.compiere.model.reference.REF_PA_GoalScope;
/** Generated Model for PA_Goal
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_PA_Goal extends PO
{
/** Standard Constructor
@param ctx context
@param PA_Goal_ID id
@param trxName transaction
*/
public X_PA_Goal (Properties ctx, int PA_Goal_ID, String trxName)
{
super (ctx, PA_Goal_ID, trxName);
/** if (PA_Goal_ID == 0)
{
setChartType (null);
setGoalPerformance (Env.ZERO);
setIsSummary (false);	
// N
setMeasureActual (Env.ZERO);
setMeasureScope (null);
setMeasureTarget (Env.ZERO);
setName (null);
setPA_ColorSchema_ID (0);
setPA_Goal_ID (0);
setRelativeWeight (Env.ZERO);	
// 1
setSeqNo (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_PA_Goal (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=440 */
public static int Table_ID=MTable.getTable_ID("PA_Goal");

@XendraTrl(Identifier="21a62c95-06b8-9e1a-7e02-b82d97ae204b")
public static String es_PE_TAB_PerformanceGoal_Description="Objetivo del Desempeño";

@XendraTrl(Identifier="21a62c95-06b8-9e1a-7e02-b82d97ae204b")
public static String es_PE_TAB_PerformanceGoal_Name="Objetivo del Desempeño";

@XendraTrl(Identifier="21a62c95-06b8-9e1a-7e02-b82d97ae204b")
public static String es_PE_TAB_PerformanceGoal_Help="La pestaña Objetivo de Desempeño define los objetivos específicos de desempeño.";

@XendraTab(Name="Performance Goal",Description="Performance Goal",
Help="The Performance Goal Tab defines specific goals for performance.",
AD_Window_ID="862a0f62-314c-f80f-95c1-8aa84c5ab9f8",SeqNo=20,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="21a62c95-06b8-9e1a-7e02-b82d97ae204b",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_PerformanceGoal="21a62c95-06b8-9e1a-7e02-b82d97ae204b";

@XendraTrl(Identifier="8dd659b5-08e3-8da3-7f0e-8010691a37fc")
public static String es_PE_TABLE_PA_Goal_Name="Objetivo";

@XendraTable(Name="Goal",Description="Performance Goal",Help="",TableName="PA_Goal",
AccessLevel="6",AD_Window_ID="862a0f62-314c-f80f-95c1-8aa84c5ab9f8",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.performanceanalysis",
Identifier="8dd659b5-08e3-8da3-7f0e-8010691a37fc",Synchronized="2017-08-16 11:43:39.0")
/** TableName=PA_Goal */
public static final String Table_Name="PA_Goal";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"PA_Goal");

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
    Table_ID = MTable.getTable_ID("PA_Goal");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_PA_Goal[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Role.
@param AD_Role_ID Responsibility Role */
public void setAD_Role_ID (int AD_Role_ID)
{
if (AD_Role_ID <= 0) set_Value (COLUMNNAME_AD_Role_ID, null);
 else 
set_Value (COLUMNNAME_AD_Role_ID, Integer.valueOf(AD_Role_ID));
}
/** Get Role.
@return Responsibility Role */
public int getAD_Role_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Role_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="00c32af5-44e6-0e7a-d49c-517f27a97f10")
public static String es_PE_FIELD_PerformanceGoal_Role_Description="Rol de responsabilidad";

@XendraTrl(Identifier="00c32af5-44e6-0e7a-d49c-517f27a97f10")
public static String es_PE_FIELD_PerformanceGoal_Role_Help="El Rol determina la seguridad y acceso del usuario que posee este Rol";

@XendraTrl(Identifier="00c32af5-44e6-0e7a-d49c-517f27a97f10")
public static String es_PE_FIELD_PerformanceGoal_Role_Name="Rol";

@XendraField(AD_Column_ID="AD_Role_ID",IsCentrallyMaintained=true,
AD_Tab_ID="21a62c95-06b8-9e1a-7e02-b82d97ae204b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="00c32af5-44e6-0e7a-d49c-517f27a97f10")
public static final String FIELDNAME_PerformanceGoal_Role="00c32af5-44e6-0e7a-d49c-517f27a97f10";

@XendraTrl(Identifier="d67702c9-c23e-b1a9-b7be-d2e6ab089cbd")
public static String es_PE_COLUMN_AD_Role_ID_Name="Rol";

@XendraColumn(AD_Element_ID="08ffb725-ea75-e55f-f4c5-67ac26f40e2b",ColumnName="AD_Role_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="-1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d67702c9-c23e-b1a9-b7be-d2e6ab089cbd",
Synchronized="2017-08-05 16:55:39.0")
/** Column name AD_Role_ID */
public static final String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
/** Set User/Contact.
@param AD_User_ID User within the system - Internal or Business Partner Contact */
public void setAD_User_ID (int AD_User_ID)
{
if (AD_User_ID <= 0) set_Value (COLUMNNAME_AD_User_ID, null);
 else 
set_Value (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
}
/** Get User/Contact.
@return User within the system - Internal or Business Partner Contact */
public int getAD_User_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ea7d5fc9-0571-7ff6-02a0-f71b03a2e0ef")
public static String es_PE_FIELD_PerformanceGoal_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="ea7d5fc9-0571-7ff6-02a0-f71b03a2e0ef")
public static String es_PE_FIELD_PerformanceGoal_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="ea7d5fc9-0571-7ff6-02a0-f71b03a2e0ef")
public static String es_PE_FIELD_PerformanceGoal_UserContact_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="21a62c95-06b8-9e1a-7e02-b82d97ae204b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ea7d5fc9-0571-7ff6-02a0-f71b03a2e0ef")
public static final String FIELDNAME_PerformanceGoal_UserContact="ea7d5fc9-0571-7ff6-02a0-f71b03a2e0ef";

@XendraTrl(Identifier="57c8a363-7240-fdf0-f7d9-2e448f316d1d")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="-1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="57c8a363-7240-fdf0-f7d9-2e448f316d1d",
Synchronized="2017-08-05 16:55:39.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set ChartType.
@param ChartType ChartType */
public void setChartType (String ChartType)
{
if (ChartType == null) throw new IllegalArgumentException ("ChartType is mandatory.");
if (ChartType.length() > 2)
{
log.warning("Length > 2 - truncated");
ChartType = ChartType.substring(0,1);
}
set_Value (COLUMNNAME_ChartType, ChartType);
}
/** Get ChartType.
@return ChartType */
public String getChartType() 
{
String value = (String)get_Value(COLUMNNAME_ChartType);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="be9da4ee-c416-4587-b680-e485f3eabd6a")
public static String es_PE_COLUMN_ChartType_Name="charttype";

@XendraColumn(AD_Element_ID="4a4a389c-f60f-448b-abe9-10f7cc1f2143",ColumnName="ChartType",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="be9da4ee-c416-4587-b680-e485f3eabd6a",
Synchronized="2017-08-05 16:55:39.0")
/** Column name ChartType */
public static final String COLUMNNAME_ChartType = "ChartType";
/** Set Date From.
@param DateFrom Starting date for a range */
public void setDateFrom (Timestamp DateFrom)
{
set_Value (COLUMNNAME_DateFrom, DateFrom);
}
/** Get Date From.
@return Starting date for a range */
public Timestamp getDateFrom() 
{
return (Timestamp)get_Value(COLUMNNAME_DateFrom);
}

@XendraTrl(Identifier="77a6db5f-1aeb-820b-aae1-510eedd3d098")
public static String es_PE_FIELD_PerformanceGoal_DateFrom_Description="Fecha de inicio para un rango";

@XendraTrl(Identifier="77a6db5f-1aeb-820b-aae1-510eedd3d098")
public static String es_PE_FIELD_PerformanceGoal_DateFrom_Help="La Fecha desde indica la fecha inicial de un rango";

@XendraTrl(Identifier="77a6db5f-1aeb-820b-aae1-510eedd3d098")
public static String es_PE_FIELD_PerformanceGoal_DateFrom_Name="Desde Fecha";

@XendraField(AD_Column_ID="DateFrom",IsCentrallyMaintained=true,
AD_Tab_ID="21a62c95-06b8-9e1a-7e02-b82d97ae204b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=7,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="77a6db5f-1aeb-820b-aae1-510eedd3d098")
public static final String FIELDNAME_PerformanceGoal_DateFrom="77a6db5f-1aeb-820b-aae1-510eedd3d098";

@XendraTrl(Identifier="ba92ab2d-2bee-8c12-c1c5-e593f7ce78b8")
public static String es_PE_COLUMN_DateFrom_Name="Desde Fecha";

@XendraColumn(AD_Element_ID="5bfdcbe1-cf4f-d7f7-c643-7a07f2907ae9",ColumnName="DateFrom",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ba92ab2d-2bee-8c12-c1c5-e593f7ce78b8",
Synchronized="2017-08-05 16:55:39.0")
/** Column name DateFrom */
public static final String COLUMNNAME_DateFrom = "DateFrom";
/** Set Date last run.
@param DateLastRun Date the process was last run. */
public void setDateLastRun (Timestamp DateLastRun)
{
set_ValueNoCheck (COLUMNNAME_DateLastRun, DateLastRun);
}
/** Get Date last run.
@return Date the process was last run. */
public Timestamp getDateLastRun() 
{
return (Timestamp)get_Value(COLUMNNAME_DateLastRun);
}

@XendraTrl(Identifier="a7174aca-7178-5beb-a465-104b8866aad8")
public static String es_PE_FIELD_PerformanceGoal_DateLastRun_Description="Fecha en que el proceso fue corrido por última vez";

@XendraTrl(Identifier="a7174aca-7178-5beb-a465-104b8866aad8")
public static String es_PE_FIELD_PerformanceGoal_DateLastRun_Help="La fecha de última corrida indica la última vez que se corrió un proceso";

@XendraTrl(Identifier="a7174aca-7178-5beb-a465-104b8866aad8")
public static String es_PE_FIELD_PerformanceGoal_DateLastRun_Name="Última Fecha de Corrida";

@XendraField(AD_Column_ID="DateLastRun",IsCentrallyMaintained=true,
AD_Tab_ID="21a62c95-06b8-9e1a-7e02-b82d97ae204b",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=200,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a7174aca-7178-5beb-a465-104b8866aad8")
public static final String FIELDNAME_PerformanceGoal_DateLastRun="a7174aca-7178-5beb-a465-104b8866aad8";

@XendraTrl(Identifier="bfe2c9f7-d4cb-58f3-5ad6-42325878c8ce")
public static String es_PE_COLUMN_DateLastRun_Name="Última Fecha de Corrida";

@XendraColumn(AD_Element_ID="e4c09739-6370-19ca-fdeb-4cdf8025abb8",ColumnName="DateLastRun",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bfe2c9f7-d4cb-58f3-5ad6-42325878c8ce",
Synchronized="2017-08-05 16:55:39.0")
/** Column name DateLastRun */
public static final String COLUMNNAME_DateLastRun = "DateLastRun";
/** Set Date To.
@param DateTo End date of a date range */
public void setDateTo (Timestamp DateTo)
{
set_Value (COLUMNNAME_DateTo, DateTo);
}
/** Get Date To.
@return End date of a date range */
public Timestamp getDateTo() 
{
return (Timestamp)get_Value(COLUMNNAME_DateTo);
}

@XendraTrl(Identifier="b5a6c68a-7973-ee51-316c-24825c724c34")
public static String es_PE_FIELD_PerformanceGoal_DateTo_Description="Fecha final de un rango (inclusive)";

@XendraTrl(Identifier="b5a6c68a-7973-ee51-316c-24825c724c34")
public static String es_PE_FIELD_PerformanceGoal_DateTo_Help="La Fecha A indica la fecha final de un rango (inclusive)";

@XendraTrl(Identifier="b5a6c68a-7973-ee51-316c-24825c724c34")
public static String es_PE_FIELD_PerformanceGoal_DateTo_Name="A Fecha";

@XendraField(AD_Column_ID="DateTo",IsCentrallyMaintained=true,
AD_Tab_ID="21a62c95-06b8-9e1a-7e02-b82d97ae204b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=7,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b5a6c68a-7973-ee51-316c-24825c724c34")
public static final String FIELDNAME_PerformanceGoal_DateTo="b5a6c68a-7973-ee51-316c-24825c724c34";

@XendraTrl(Identifier="18bd0618-99b4-6eaf-7111-1b988437f62e")
public static String es_PE_COLUMN_DateTo_Name="A Fecha";

@XendraColumn(AD_Element_ID="c98c05a0-7b58-ed8f-3e5b-fe1e1358ac38",ColumnName="DateTo",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="18bd0618-99b4-6eaf-7111-1b988437f62e",
Synchronized="2017-08-05 16:55:39.0")
/** Column name DateTo */
public static final String COLUMNNAME_DateTo = "DateTo";
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

@XendraTrl(Identifier="ca5ef09e-58f9-6a84-ce83-ea17ba6a6aee")
public static String es_PE_FIELD_PerformanceGoal_Description_Description="Observación";

@XendraTrl(Identifier="ca5ef09e-58f9-6a84-ce83-ea17ba6a6aee")
public static String es_PE_FIELD_PerformanceGoal_Description_Help="Observación";

@XendraTrl(Identifier="ca5ef09e-58f9-6a84-ce83-ea17ba6a6aee")
public static String es_PE_FIELD_PerformanceGoal_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="21a62c95-06b8-9e1a-7e02-b82d97ae204b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ca5ef09e-58f9-6a84-ce83-ea17ba6a6aee")
public static final String FIELDNAME_PerformanceGoal_Description="ca5ef09e-58f9-6a84-ce83-ea17ba6a6aee";

@XendraTrl(Identifier="06b3d426-84db-12fc-e52b-88ddc04de066")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="06b3d426-84db-12fc-e52b-88ddc04de066",
Synchronized="2017-08-05 16:55:39.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Performance Goal.
@param GoalPerformance Target achievement from 0..1 */
public void setGoalPerformance (BigDecimal GoalPerformance)
{
if (GoalPerformance == null) throw new IllegalArgumentException ("GoalPerformance is mandatory.");
set_ValueNoCheck (COLUMNNAME_GoalPerformance, GoalPerformance);
}
/** Get Performance Goal.
@return Target achievement from 0..1 */
public BigDecimal getGoalPerformance() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_GoalPerformance);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="6ca3871b-c184-8c47-8289-9e32b1170911")
public static String es_PE_FIELD_PerformanceGoal_PerformanceGoal_Description="Meta del rendimiento desde 0.1";

@XendraTrl(Identifier="6ca3871b-c184-8c47-8289-9e32b1170911")
public static String es_PE_FIELD_PerformanceGoal_PerformanceGoal_Help="La meta de desempeño indica el logro del objetivo de 0 a 1";

@XendraTrl(Identifier="6ca3871b-c184-8c47-8289-9e32b1170911")
public static String es_PE_FIELD_PerformanceGoal_PerformanceGoal_Name="Meta del Rendimiento";

@XendraField(AD_Column_ID="GoalPerformance",IsCentrallyMaintained=true,
AD_Tab_ID="21a62c95-06b8-9e1a-7e02-b82d97ae204b",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6ca3871b-c184-8c47-8289-9e32b1170911")
public static final String FIELDNAME_PerformanceGoal_PerformanceGoal="6ca3871b-c184-8c47-8289-9e32b1170911";

@XendraTrl(Identifier="3b797d53-60f3-38a3-5430-541835a86cb5")
public static String es_PE_COLUMN_GoalPerformance_Name="Meta del Rendimiento";

@XendraColumn(AD_Element_ID="5d323345-a995-054e-2ab6-12dbdbe2bfb9",ColumnName="GoalPerformance",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3b797d53-60f3-38a3-5430-541835a86cb5",
Synchronized="2017-08-05 16:55:39.0")
/** Column name GoalPerformance */
public static final String COLUMNNAME_GoalPerformance = "GoalPerformance";
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
@XendraTrl(Identifier="c202644b-426d-475d-8bfa-16e1952a64a4")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c202644b-426d-475d-8bfa-16e1952a64a4",
Synchronized="2017-08-05 16:55:39.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Summary Level.
@param IsSummary This is a summary entity */
public void setIsSummary (boolean IsSummary)
{
set_Value (COLUMNNAME_IsSummary, Boolean.valueOf(IsSummary));
}
/** Get Summary Level.
@return This is a summary entity */
public boolean isSummary() 
{
Object oo = get_Value(COLUMNNAME_IsSummary);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="b4b50549-4b48-4612-0a55-3a3a8faf1528")
public static String es_PE_FIELD_PerformanceGoal_SummaryLevel_Description="Esta es una entidad sumaria";

@XendraTrl(Identifier="b4b50549-4b48-4612-0a55-3a3a8faf1528")
public static String es_PE_FIELD_PerformanceGoal_SummaryLevel_Help="Una entidad sumaria representa una rama en un árbol mas bien que un nodo final. Las entidades sumarias son usadas para reportar y no tienen valores propios";

@XendraTrl(Identifier="b4b50549-4b48-4612-0a55-3a3a8faf1528")
public static String es_PE_FIELD_PerformanceGoal_SummaryLevel_Name="Entidad Acumulada";

@XendraField(AD_Column_ID="IsSummary",IsCentrallyMaintained=true,
AD_Tab_ID="21a62c95-06b8-9e1a-7e02-b82d97ae204b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b4b50549-4b48-4612-0a55-3a3a8faf1528")
public static final String FIELDNAME_PerformanceGoal_SummaryLevel="b4b50549-4b48-4612-0a55-3a3a8faf1528";

@XendraTrl(Identifier="8d8d4261-ad40-375d-9968-a3769a0ff976")
public static String es_PE_COLUMN_IsSummary_Name="Entidad Acumulada";

@XendraColumn(AD_Element_ID="0ecd1d56-9e2b-8778-7b05-92730d811ad4",ColumnName="IsSummary",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8d8d4261-ad40-375d-9968-a3769a0ff976",
Synchronized="2017-08-05 16:55:40.0")
/** Column name IsSummary */
public static final String COLUMNNAME_IsSummary = "IsSummary";
/** Set Measure Actual.
@param MeasureActual Actual value that has been measured. */
public void setMeasureActual (BigDecimal MeasureActual)
{
if (MeasureActual == null) throw new IllegalArgumentException ("MeasureActual is mandatory.");
set_ValueNoCheck (COLUMNNAME_MeasureActual, MeasureActual);
}
/** Get Measure Actual.
@return Actual value that has been measured. */
public BigDecimal getMeasureActual() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MeasureActual);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="c0a4d905-8046-05e2-3897-62b9413c1ebc")
public static String es_PE_FIELD_PerformanceGoal_MeasureActual_Description="Valor actual que ha sido medido";

@XendraTrl(Identifier="c0a4d905-8046-05e2-3897-62b9413c1ebc")
public static String es_PE_FIELD_PerformanceGoal_MeasureActual_Help="La medida actual indica el valor medido actual. Los valores medidos se usan para determinar si una meta de desempeño ha sido alcanzada.";

@XendraTrl(Identifier="c0a4d905-8046-05e2-3897-62b9413c1ebc")
public static String es_PE_FIELD_PerformanceGoal_MeasureActual_Name="Medida Actual";

@XendraField(AD_Column_ID="MeasureActual",IsCentrallyMaintained=true,
AD_Tab_ID="21a62c95-06b8-9e1a-7e02-b82d97ae204b",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c0a4d905-8046-05e2-3897-62b9413c1ebc")
public static final String FIELDNAME_PerformanceGoal_MeasureActual="c0a4d905-8046-05e2-3897-62b9413c1ebc";

@XendraTrl(Identifier="73f30bc5-6823-1d8f-4729-0584ed91eca3")
public static String es_PE_COLUMN_MeasureActual_Name="Medida Actual";

@XendraColumn(AD_Element_ID="0825e99a-364e-4459-9f17-d2bbda39cfde",ColumnName="MeasureActual",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="73f30bc5-6823-1d8f-4729-0584ed91eca3",
Synchronized="2017-08-05 16:55:40.0")
/** Column name MeasureActual */
public static final String COLUMNNAME_MeasureActual = "MeasureActual";

/** MeasureDisplay AD_Reference=4ce4e589-8d57-44b4-2021-e8aabd1627ca */
public static final int MEASUREDISPLAY_AD_Reference_ID=367;
/** Set Measure Display.
@param MeasureDisplay Measure Scope initially displayed */
public void setMeasureDisplay (String MeasureDisplay)
{
if (MeasureDisplay == null || MeasureDisplay.equals(REF_PA_GoalScope.Year) || MeasureDisplay.equals(REF_PA_GoalScope.Quarter) || MeasureDisplay.equals(REF_PA_GoalScope.Month) || MeasureDisplay.equals(REF_PA_GoalScope.Total) || MeasureDisplay.equals(REF_PA_GoalScope.Week) || MeasureDisplay.equals(REF_PA_GoalScope.Day));
 else throw new IllegalArgumentException ("MeasureDisplay Invalid value - " + MeasureDisplay + " - Reference_ID=367 - 1 - 3 - 5 - 0 - 7 - 8");
if (MeasureDisplay != null && MeasureDisplay.length() > 1)
{
log.warning("Length > 1 - truncated");
MeasureDisplay = MeasureDisplay.substring(0,0);
}
set_Value (COLUMNNAME_MeasureDisplay, MeasureDisplay);
}
/** Get Measure Display.
@return Measure Scope initially displayed */
public String getMeasureDisplay() 
{
return (String)get_Value(COLUMNNAME_MeasureDisplay);
}

@XendraTrl(Identifier="9af76918-0e6f-430b-a44b-c26ac47b6225")
public static String es_PE_FIELD_PerformanceGoal_MeasureDisplay_Description="Alcance de Medida Inicialmente Desplegado";

@XendraTrl(Identifier="9af76918-0e6f-430b-a44b-c26ac47b6225")
public static String es_PE_FIELD_PerformanceGoal_MeasureDisplay_Name="Desplegar Medida";

@XendraField(AD_Column_ID="MeasureDisplay",IsCentrallyMaintained=true,
AD_Tab_ID="21a62c95-06b8-9e1a-7e02-b82d97ae204b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9af76918-0e6f-430b-a44b-c26ac47b6225")
public static final String FIELDNAME_PerformanceGoal_MeasureDisplay="9af76918-0e6f-430b-a44b-c26ac47b6225";

@XendraTrl(Identifier="57b111ea-7d5e-e4b9-7aa1-827a59e915a6")
public static String es_PE_COLUMN_MeasureDisplay_Name="Desplegar Medida";

@XendraColumn(AD_Element_ID="751f51ea-0f16-09db-2ef1-80db16c08101",ColumnName="MeasureDisplay",
AD_Reference_ID=17,AD_Reference_Value_ID="4ce4e589-8d57-44b4-2021-e8aabd1627ca",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="57b111ea-7d5e-e4b9-7aa1-827a59e915a6",Synchronized="2017-08-05 16:55:40.0")
/** Column name MeasureDisplay */
public static final String COLUMNNAME_MeasureDisplay = "MeasureDisplay";

/** MeasureScope AD_Reference=4ce4e589-8d57-44b4-2021-e8aabd1627ca */
public static final int MEASURESCOPE_AD_Reference_ID=367;
/** Set Measure Scope.
@param MeasureScope Performance Measure Scope */
public void setMeasureScope (String MeasureScope)
{
if (MeasureScope == null) throw new IllegalArgumentException ("MeasureScope is mandatory");
if (MeasureScope.equals(REF_PA_GoalScope.Year) || MeasureScope.equals(REF_PA_GoalScope.Quarter) || MeasureScope.equals(REF_PA_GoalScope.Month) || MeasureScope.equals(REF_PA_GoalScope.Total) || MeasureScope.equals(REF_PA_GoalScope.Week) || MeasureScope.equals(REF_PA_GoalScope.Day));
 else throw new IllegalArgumentException ("MeasureScope Invalid value - " + MeasureScope + " - Reference_ID=367 - 1 - 3 - 5 - 0 - 7 - 8");
if (MeasureScope.length() > 1)
{
log.warning("Length > 1 - truncated");
MeasureScope = MeasureScope.substring(0,0);
}
set_Value (COLUMNNAME_MeasureScope, MeasureScope);
}
/** Get Measure Scope.
@return Performance Measure Scope */
public String getMeasureScope() 
{
return (String)get_Value(COLUMNNAME_MeasureScope);
}

@XendraTrl(Identifier="4f60b2f4-ee1c-4819-acad-62ba14bac9c9")
public static String es_PE_FIELD_PerformanceGoal_MeasureScope_Description="Desempeño Alcance de medida";

@XendraTrl(Identifier="4f60b2f4-ee1c-4819-acad-62ba14bac9c9")
public static String es_PE_FIELD_PerformanceGoal_MeasureScope_Help="El alcance de la meta se puede analizar para la exhibición inicial. Ejemplo: El alcance es año, exhibición es mes - la meta se incorpora como número anual, la exhibición divide la meta por 12.";

@XendraTrl(Identifier="4f60b2f4-ee1c-4819-acad-62ba14bac9c9")
public static String es_PE_FIELD_PerformanceGoal_MeasureScope_Name="Alcance de Medida";

@XendraField(AD_Column_ID="MeasureScope",IsCentrallyMaintained=true,
AD_Tab_ID="21a62c95-06b8-9e1a-7e02-b82d97ae204b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4f60b2f4-ee1c-4819-acad-62ba14bac9c9")
public static final String FIELDNAME_PerformanceGoal_MeasureScope="4f60b2f4-ee1c-4819-acad-62ba14bac9c9";

@XendraTrl(Identifier="c3e8178f-1299-f8f5-e931-1b795b257a44")
public static String es_PE_COLUMN_MeasureScope_Name="Alcance de Medida";

@XendraColumn(AD_Element_ID="2cd1cbdd-b3a7-ea71-f17f-b5a4ee5277fd",ColumnName="MeasureScope",
AD_Reference_ID=17,AD_Reference_Value_ID="4ce4e589-8d57-44b4-2021-e8aabd1627ca",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c3e8178f-1299-f8f5-e931-1b795b257a44",Synchronized="2017-08-05 16:55:40.0")
/** Column name MeasureScope */
public static final String COLUMNNAME_MeasureScope = "MeasureScope";
/** Set Measure Target.
@param MeasureTarget Target value for measure */
public void setMeasureTarget (BigDecimal MeasureTarget)
{
if (MeasureTarget == null) throw new IllegalArgumentException ("MeasureTarget is mandatory.");
set_Value (COLUMNNAME_MeasureTarget, MeasureTarget);
}
/** Get Measure Target.
@return Target value for measure */
public BigDecimal getMeasureTarget() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MeasureTarget);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="5703e60d-d8cc-a8d0-d7fb-99774ef7b371")
public static String es_PE_FIELD_PerformanceGoal_MeasureTarget_Description="Valor objetivo de esta medida";

@XendraTrl(Identifier="5703e60d-d8cc-a8d0-d7fb-99774ef7b371")
public static String es_PE_FIELD_PerformanceGoal_MeasureTarget_Help="La medida objetivo indica el objetivo ó meta para esta medida. Se usa como una comparación contra las medidas actuales.";

@XendraTrl(Identifier="5703e60d-d8cc-a8d0-d7fb-99774ef7b371")
public static String es_PE_FIELD_PerformanceGoal_MeasureTarget_Name="Medida Objetivo";

@XendraField(AD_Column_ID="MeasureTarget",IsCentrallyMaintained=true,
AD_Tab_ID="21a62c95-06b8-9e1a-7e02-b82d97ae204b",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5703e60d-d8cc-a8d0-d7fb-99774ef7b371")
public static final String FIELDNAME_PerformanceGoal_MeasureTarget="5703e60d-d8cc-a8d0-d7fb-99774ef7b371";

@XendraTrl(Identifier="ec67971b-eae6-6648-3f83-759f9113a57b")
public static String es_PE_COLUMN_MeasureTarget_Name="Medida Objetivo";

@XendraColumn(AD_Element_ID="49cb94bb-de84-99a5-ca61-aa73744fc707",ColumnName="MeasureTarget",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ec67971b-eae6-6648-3f83-759f9113a57b",
Synchronized="2017-08-05 16:55:40.0")
/** Column name MeasureTarget */
public static final String COLUMNNAME_MeasureTarget = "MeasureTarget";
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

@XendraTrl(Identifier="b0075b23-2814-0d76-0bac-a66c3cab59b0")
public static String es_PE_FIELD_PerformanceGoal_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="b0075b23-2814-0d76-0bac-a66c3cab59b0")
public static String es_PE_FIELD_PerformanceGoal_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="b0075b23-2814-0d76-0bac-a66c3cab59b0")
public static String es_PE_FIELD_PerformanceGoal_Name_Name="Nombre";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="21a62c95-06b8-9e1a-7e02-b82d97ae204b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b0075b23-2814-0d76-0bac-a66c3cab59b0")
public static final String FIELDNAME_PerformanceGoal_Name="b0075b23-2814-0d76-0bac-a66c3cab59b0";

@XendraTrl(Identifier="b04c0dd3-2b41-d22d-2632-11cf0bd3779e")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b04c0dd3-2b41-d22d-2632-11cf0bd3779e",
Synchronized="2017-08-05 16:55:40.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Note.
@param Note Optional additional user defined information */
public void setNote (String Note)
{
set_Value (COLUMNNAME_Note, Note);
}
/** Get Note.
@return Optional additional user defined information */
public String getNote() 
{
String value = (String)get_Value(COLUMNNAME_Note);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="4359f66b-5828-8682-bf97-0b0c5e165b0d")
public static String es_PE_FIELD_PerformanceGoal_Note_Description="Información adicional opcional definida por el usuario";

@XendraTrl(Identifier="4359f66b-5828-8682-bf97-0b0c5e165b0d")
public static String es_PE_FIELD_PerformanceGoal_Note_Help="El campo Nota permite una entrada opcional de información definida por el usuario considerando este registro";

@XendraTrl(Identifier="4359f66b-5828-8682-bf97-0b0c5e165b0d")
public static String es_PE_FIELD_PerformanceGoal_Note_Name="Nota";
@XendraField(AD_Column_ID="Note",
IsCentrallyMaintained=true,AD_Tab_ID="21a62c95-06b8-9e1a-7e02-b82d97ae204b",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4359f66b-5828-8682-bf97-0b0c5e165b0d")
public static final String FIELDNAME_PerformanceGoal_Note="4359f66b-5828-8682-bf97-0b0c5e165b0d";

@XendraTrl(Identifier="52e6aedf-a0c6-af07-59e4-44a01b43ec50")
public static String es_PE_COLUMN_Note_Name="Nota";

@XendraColumn(AD_Element_ID="5fea140b-6b26-b544-b237-3b3fa64ae1c6",ColumnName="Note",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="52e6aedf-a0c6-af07-59e4-44a01b43ec50",
Synchronized="2017-08-05 16:55:40.0")
/** Column name Note */
public static final String COLUMNNAME_Note = "Note";
/** Set Color Schema.
@param PA_ColorSchema_ID Performance Color Schema */
public void setPA_ColorSchema_ID (int PA_ColorSchema_ID)
{
if (PA_ColorSchema_ID < 1) throw new IllegalArgumentException ("PA_ColorSchema_ID is mandatory.");
set_Value (COLUMNNAME_PA_ColorSchema_ID, Integer.valueOf(PA_ColorSchema_ID));
}
/** Get Color Schema.
@return Performance Color Schema */
public int getPA_ColorSchema_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_ColorSchema_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="da195621-9567-5b03-0911-91a78d973661")
public static String es_PE_FIELD_PerformanceGoal_ColorSchema_Description="Desempeño Esquema de Colores";

@XendraTrl(Identifier="da195621-9567-5b03-0911-91a78d973661")
public static String es_PE_FIELD_PerformanceGoal_ColorSchema_Help="Representación visual del Desempeño mediante colores.  El esquema frrecuentemente tiene 3 niveles (ej. rojo-amarillo-verde).  Adempiere soporta dos niveles (ej. rojo-verde) o cuatro noveles (ej. gris-bronce-plata-oro).  Note que una Meta sin Medida es representada en Blanco.  El  porcentaje puede ser entre 0 y  sin limite  (ej. sobre 100%).";

@XendraTrl(Identifier="da195621-9567-5b03-0911-91a78d973661")
public static String es_PE_FIELD_PerformanceGoal_ColorSchema_Name="Esquema de Color ";

@XendraField(AD_Column_ID="PA_ColorSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="21a62c95-06b8-9e1a-7e02-b82d97ae204b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="da195621-9567-5b03-0911-91a78d973661")
public static final String FIELDNAME_PerformanceGoal_ColorSchema="da195621-9567-5b03-0911-91a78d973661";

@XendraTrl(Identifier="14e0b7fb-e52d-0479-0c85-7db80db6cbda")
public static String es_PE_COLUMN_PA_ColorSchema_ID_Name="Esquema de Color ";

@XendraColumn(AD_Element_ID="78a22b02-7886-a6c6-5e93-924a4dac708b",ColumnName="PA_ColorSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="14e0b7fb-e52d-0479-0c85-7db80db6cbda",
Synchronized="2017-08-05 16:55:40.0")
/** Column name PA_ColorSchema_ID */
public static final String COLUMNNAME_PA_ColorSchema_ID = "PA_ColorSchema_ID";
/** Set Goal.
@param PA_Goal_ID Performance Goal */
public void setPA_Goal_ID (int PA_Goal_ID)
{
if (PA_Goal_ID < 1) throw new IllegalArgumentException ("PA_Goal_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_PA_Goal_ID, Integer.valueOf(PA_Goal_ID));
}
/** Get Goal.
@return Performance Goal */
public int getPA_Goal_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_Goal_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f3902fb9-e4f2-af0f-b2b9-7bf0f90cb145")
public static String es_PE_FIELD_PerformanceGoal_Goal_Description="Objetivo de desempeño";

@XendraTrl(Identifier="f3902fb9-e4f2-af0f-b2b9-7bf0f90cb145")
public static String es_PE_FIELD_PerformanceGoal_Goal_Help="La meta de desempeño indica contra que será medido este desempeño de usuarios.";

@XendraTrl(Identifier="f3902fb9-e4f2-af0f-b2b9-7bf0f90cb145")
public static String es_PE_FIELD_PerformanceGoal_Goal_Name="Objetivo";

@XendraField(AD_Column_ID="PA_Goal_ID",IsCentrallyMaintained=true,
AD_Tab_ID="21a62c95-06b8-9e1a-7e02-b82d97ae204b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f3902fb9-e4f2-af0f-b2b9-7bf0f90cb145")
public static final String FIELDNAME_PerformanceGoal_Goal="f3902fb9-e4f2-af0f-b2b9-7bf0f90cb145";
/** Column name PA_Goal_ID */
public static final String COLUMNNAME_PA_Goal_ID = "PA_Goal_ID";

/** PA_GoalParent_ID AD_Reference=3d6c5f0f-cdfa-12af-375a-fb06f67c30fc */
public static final int PA_GOALPARENT_ID_AD_Reference_ID=230;
/** Set Parent Goal.
@param PA_GoalParent_ID Parent Goal */
public void setPA_GoalParent_ID (int PA_GoalParent_ID)
{
if (PA_GoalParent_ID <= 0) set_Value (COLUMNNAME_PA_GoalParent_ID, null);
 else 
set_Value (COLUMNNAME_PA_GoalParent_ID, Integer.valueOf(PA_GoalParent_ID));
}
/** Get Parent Goal.
@return Parent Goal */
public int getPA_GoalParent_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_GoalParent_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e5c35e95-a378-0bfb-4441-ca6e360846db")
public static String es_PE_FIELD_PerformanceGoal_ParentGoal_Description="Meta Padre";

@XendraTrl(Identifier="e5c35e95-a378-0bfb-4441-ca6e360846db")
public static String es_PE_FIELD_PerformanceGoal_ParentGoal_Help="Usted puede crear una jerarquía de metas a través de sub-metas para sumarizar la meta.Las medidas son automáticamente integradas.";

@XendraTrl(Identifier="e5c35e95-a378-0bfb-4441-ca6e360846db")
public static String es_PE_FIELD_PerformanceGoal_ParentGoal_Name="Meta Padre";

@XendraField(AD_Column_ID="PA_GoalParent_ID",IsCentrallyMaintained=true,
AD_Tab_ID="21a62c95-06b8-9e1a-7e02-b82d97ae204b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e5c35e95-a378-0bfb-4441-ca6e360846db")
public static final String FIELDNAME_PerformanceGoal_ParentGoal="e5c35e95-a378-0bfb-4441-ca6e360846db";

@XendraTrl(Identifier="3e695e4d-4a9a-1e31-6e44-c8c70c9b4442")
public static String es_PE_COLUMN_PA_GoalParent_ID_Name="Meta Padre";

@XendraColumn(AD_Element_ID="bb950969-2ea2-41cd-742e-7041460b5021",ColumnName="PA_GoalParent_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="3d6c5f0f-cdfa-12af-375a-fb06f67c30fc",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3e695e4d-4a9a-1e31-6e44-c8c70c9b4442",Synchronized="2017-08-05 16:55:40.0")
/** Column name PA_GoalParent_ID */
public static final String COLUMNNAME_PA_GoalParent_ID = "PA_GoalParent_ID";
/** Set Measure.
@param PA_Measure_ID Concrete Performance Measurement */
public void setPA_Measure_ID (int PA_Measure_ID)
{
if (PA_Measure_ID <= 0) set_Value (COLUMNNAME_PA_Measure_ID, null);
 else 
set_Value (COLUMNNAME_PA_Measure_ID, Integer.valueOf(PA_Measure_ID));
}
/** Get Measure.
@return Concrete Performance Measurement */
public int getPA_Measure_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_Measure_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7e444d26-eace-2dd6-8d28-2ec89ccfd1d0")
public static String es_PE_FIELD_PerformanceGoal_Measure_Description="Medida de desempeño concreto";

@XendraTrl(Identifier="7e444d26-eace-2dd6-8d28-2ec89ccfd1d0")
public static String es_PE_FIELD_PerformanceGoal_Measure_Help="La medida identifica un indicador concreto; medible del desempeño. Por Ej. Dólares de venta ó prospectos contactados.";

@XendraTrl(Identifier="7e444d26-eace-2dd6-8d28-2ec89ccfd1d0")
public static String es_PE_FIELD_PerformanceGoal_Measure_Name="Medida";

@XendraField(AD_Column_ID="PA_Measure_ID",IsCentrallyMaintained=true,
AD_Tab_ID="21a62c95-06b8-9e1a-7e02-b82d97ae204b",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7e444d26-eace-2dd6-8d28-2ec89ccfd1d0")
public static final String FIELDNAME_PerformanceGoal_Measure="7e444d26-eace-2dd6-8d28-2ec89ccfd1d0";

@XendraTrl(Identifier="0f706d4a-5bd8-30a9-3ce5-31e5540a80b6")
public static String es_PE_COLUMN_PA_Measure_ID_Name="Medida";

@XendraColumn(AD_Element_ID="a1b2285c-4e3e-37c1-37a9-2206d4a6cd87",ColumnName="PA_Measure_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0f706d4a-5bd8-30a9-3ce5-31e5540a80b6",
Synchronized="2017-08-05 16:55:40.0")
/** Column name PA_Measure_ID */
public static final String COLUMNNAME_PA_Measure_ID = "PA_Measure_ID";
/** Set Relative Weight.
@param RelativeWeight Relative weight of this step (0 = ignored) */
public void setRelativeWeight (BigDecimal RelativeWeight)
{
if (RelativeWeight == null) throw new IllegalArgumentException ("RelativeWeight is mandatory.");
set_Value (COLUMNNAME_RelativeWeight, RelativeWeight);
}
/** Get Relative Weight.
@return Relative weight of this step (0 = ignored) */
public BigDecimal getRelativeWeight() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_RelativeWeight);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="423582ef-d0f1-db7c-22b3-df9eba83163b")
public static String es_PE_FIELD_PerformanceGoal_RelativeWeight_Description="Peso relativo de este paso (0=ignorado)";

@XendraTrl(Identifier="423582ef-d0f1-db7c-22b3-df9eba83163b")
public static String es_PE_FIELD_PerformanceGoal_RelativeWeight_Help="El peso relativo le permite ajustar el Informe basado en probabilidades. Por Ej. Si usted tiene 1:10 de oportunidades de cerrar un contrato cuando está en la etapa de prospecto y 1:2 de oportunidades cuando está en la etapa de contrato; usted puede poner un peso de 0.1 y 0.5";

@XendraTrl(Identifier="423582ef-d0f1-db7c-22b3-df9eba83163b")
public static String es_PE_FIELD_PerformanceGoal_RelativeWeight_Name="Peso Relativo";

@XendraField(AD_Column_ID="RelativeWeight",IsCentrallyMaintained=true,
AD_Tab_ID="21a62c95-06b8-9e1a-7e02-b82d97ae204b",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="423582ef-d0f1-db7c-22b3-df9eba83163b")
public static final String FIELDNAME_PerformanceGoal_RelativeWeight="423582ef-d0f1-db7c-22b3-df9eba83163b";

@XendraTrl(Identifier="d98a5bb8-4eb8-6466-56e8-4633a2cae837")
public static String es_PE_COLUMN_RelativeWeight_Name="Peso Relativo";

@XendraColumn(AD_Element_ID="e2db7feb-fe90-45ec-faac-9e11cb9ecdd7",ColumnName="RelativeWeight",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d98a5bb8-4eb8-6466-56e8-4633a2cae837",
Synchronized="2017-08-05 16:55:40.0")
/** Column name RelativeWeight */
public static final String COLUMNNAME_RelativeWeight = "RelativeWeight";
/** Set Sequence.
@param SeqNo Method of ordering records: lowest number comes first */
public void setSeqNo (int SeqNo)
{
set_Value (COLUMNNAME_SeqNo, Integer.valueOf(SeqNo));
}
/** Get Sequence.
@return Method of ordering records: lowest number comes first */
public int getSeqNo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SeqNo);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c67027ea-429b-8d2f-d7dc-ae45cb64dd02")
public static String es_PE_FIELD_PerformanceGoal_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="c67027ea-429b-8d2f-d7dc-ae45cb64dd02")
public static String es_PE_FIELD_PerformanceGoal_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraTrl(Identifier="c67027ea-429b-8d2f-d7dc-ae45cb64dd02")
public static String es_PE_FIELD_PerformanceGoal_Sequence_Name="Secuencia";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="21a62c95-06b8-9e1a-7e02-b82d97ae204b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c67027ea-429b-8d2f-d7dc-ae45cb64dd02")
public static final String FIELDNAME_PerformanceGoal_Sequence="c67027ea-429b-8d2f-d7dc-ae45cb64dd02";

@XendraTrl(Identifier="0cd38910-9ce3-44e7-aeaa-02bcd7d462f2")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0cd38910-9ce3-44e7-aeaa-02bcd7d462f2",
Synchronized="2017-08-05 16:55:40.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
}
