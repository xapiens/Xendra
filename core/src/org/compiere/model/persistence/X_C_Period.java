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
import org.compiere.model.reference.REF_C_PeriodType;
/** Generated Model for C_Period
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Period extends PO
{
/** Standard Constructor
@param ctx context
@param C_Period_ID id
@param trxName transaction
*/
public X_C_Period (Properties ctx, int C_Period_ID, String trxName)
{
super (ctx, C_Period_ID, trxName);
/** if (C_Period_ID == 0)
{
setC_Period_ID (0);
setC_Year_ID (0);
setFact_ID (null);	
// 1
setName (null);
setPeriodNo (0);
setPeriodType (null);	
// S
setStartDate (new Timestamp(System.currentTimeMillis()));
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_Period (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=145 */
public static int Table_ID=MTable.getTable_ID("C_Period");

@XendraTrl(Identifier="68639869-33c2-7945-1f5e-76e4c02fc483")
public static String es_PE_TAB_Period_Description="Definir Períodos de calendario";

@XendraTrl(Identifier="68639869-33c2-7945-1f5e-76e4c02fc483")
public static String es_PE_TAB_Period_Name="Período";

@XendraTrl(Identifier="68639869-33c2-7945-1f5e-76e4c02fc483")
public static String es_PE_TAB_Period_Help="La pestaña de período define un número de período; nombre y fecha de comienzo para cada año calendario. Cada año comienza en la fecha de comienzo del año calendario y finaliza un dia antes de la fecha de comienzo del próximo año.";

@XendraTab(Name="Period",Description="Define Calendar Periods",
Help="The Period Tab defines a Period No, Name and Start Date for each Calendar Year.  Each period begins on the defined Start Date and ends one day prior to the next period's Start Date.",
AD_Window_ID="54524f0d-f1a4-460b-d2f8-1eff9aea350e",SeqNo=30,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="68639869-33c2-7945-1f5e-76e4c02fc483",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Period="68639869-33c2-7945-1f5e-76e4c02fc483";

@XendraTrl(Identifier="c1b1ad50-a52e-ba3b-8f6e-284167e4c5a1")
public static String es_PE_TABLE_C_Period_Name="Período";

@XendraTable(Name="Period",Description="Period of the Calendar",Help="",TableName="C_Period",
AccessLevel="2",AD_Window_ID="54524f0d-f1a4-460b-d2f8-1eff9aea350e",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=120,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="c1b1ad50-a52e-ba3b-8f6e-284167e4c5a1",Synchronized="2017-08-16 11:42:13.0")
/** TableName=C_Period */
public static final String Table_Name="C_Period";


@XendraIndex(Name="c_period_nounique",Identifier="adb1b92d-35d7-2604-3102-c86ded48adc1",
Column_Names="c_year_id, periodno",IsUnique="true",
TableIdentifier="adb1b92d-35d7-2604-3102-c86ded48adc1",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_period_nounique = "adb1b92d-35d7-2604-3102-c86ded48adc1";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Period");

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
    Table_ID = MTable.getTable_ID("C_Period");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Period[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Period.
@param C_Period_ID Period of the Calendar */
public void setC_Period_ID (int C_Period_ID)
{
if (C_Period_ID < 1) throw new IllegalArgumentException ("C_Period_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Period_ID, Integer.valueOf(C_Period_ID));
}
/** Get Period.
@return Period of the Calendar */
public int getC_Period_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Period_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="914a5f63-8e50-97e1-0ea7-1133d2c857c4")
public static String es_PE_FIELD_Period_Period_Description="Período de Calendario";

@XendraTrl(Identifier="914a5f63-8e50-97e1-0ea7-1133d2c857c4")
public static String es_PE_FIELD_Period_Period_Help="El Período indica un rango de fechas exclusivo para un calendario";

@XendraTrl(Identifier="914a5f63-8e50-97e1-0ea7-1133d2c857c4")
public static String es_PE_FIELD_Period_Period_Name="Período";

@XendraField(AD_Column_ID="C_Period_ID",IsCentrallyMaintained=true,
AD_Tab_ID="68639869-33c2-7945-1f5e-76e4c02fc483",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="914a5f63-8e50-97e1-0ea7-1133d2c857c4")
public static final String FIELDNAME_Period_Period="914a5f63-8e50-97e1-0ea7-1133d2c857c4";
/** Column name C_Period_ID */
public static final String COLUMNNAME_C_Period_ID = "C_Period_ID";
/** Set Year.
@param C_Year_ID Calendar Year */
public void setC_Year_ID (int C_Year_ID)
{
if (C_Year_ID < 1) throw new IllegalArgumentException ("C_Year_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Year_ID, Integer.valueOf(C_Year_ID));
}
/** Get Year.
@return Calendar Year */
public int getC_Year_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Year_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0fcac657-3fb7-ef5a-57d4-f2b0b9040c61")
public static String es_PE_FIELD_Period_Year_Description="Año del calendario";

@XendraTrl(Identifier="0fcac657-3fb7-ef5a-57d4-f2b0b9040c61")
public static String es_PE_FIELD_Period_Year_Help="El Año identifica únicamente un año contable para un calendario";

@XendraTrl(Identifier="0fcac657-3fb7-ef5a-57d4-f2b0b9040c61")
public static String es_PE_FIELD_Period_Year_Name="Año";
@XendraField(AD_Column_ID="C_Year_ID",
IsCentrallyMaintained=true,AD_Tab_ID="68639869-33c2-7945-1f5e-76e4c02fc483",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="0fcac657-3fb7-ef5a-57d4-f2b0b9040c61")
public static final String FIELDNAME_Period_Year="0fcac657-3fb7-ef5a-57d4-f2b0b9040c61";

@XendraTrl(Identifier="651ba429-aef8-dc3b-2a39-c4bfb306e20a")
public static String es_PE_COLUMN_C_Year_ID_Name="Año";

@XendraColumn(AD_Element_ID="c7021f96-c6b3-e088-ab83-e25c3e111170",ColumnName="C_Year_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="651ba429-aef8-dc3b-2a39-c4bfb306e20a",
Synchronized="2017-08-05 16:54:06.0")
/** Column name C_Year_ID */
public static final String COLUMNNAME_C_Year_ID = "C_Year_ID";
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

@XendraTrl(Identifier="792c0e12-347f-4634-bac2-a83fa945e416")
public static String es_PE_COLUMN_DateLastRun_Name="Date last run";

@XendraColumn(AD_Element_ID="e4c09739-6370-19ca-fdeb-4cdf8025abb8",ColumnName="DateLastRun",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="792c0e12-347f-4634-bac2-a83fa945e416",
Synchronized="2015-08-11 20:40:58.0")
/** Column name DateLastRun */
public static final String COLUMNNAME_DateLastRun = "DateLastRun";
/** Set End Date.
@param EndDate Last effective date (inclusive) */
public void setEndDate (Timestamp EndDate)
{
set_Value (COLUMNNAME_EndDate, EndDate);
}
/** Get End Date.
@return Last effective date (inclusive) */
public Timestamp getEndDate() 
{
return (Timestamp)get_Value(COLUMNNAME_EndDate);
}

@XendraTrl(Identifier="f197a83a-8f1e-14ba-da86-3c76364eeaf9")
public static String es_PE_FIELD_Period_EndDate_Description="Última fecha efectiva (inclusive)";

@XendraTrl(Identifier="f197a83a-8f1e-14ba-da86-3c76364eeaf9")
public static String es_PE_FIELD_Period_EndDate_Help="La fecha final indica la última fecha en este rango.";

@XendraTrl(Identifier="f197a83a-8f1e-14ba-da86-3c76364eeaf9")
public static String es_PE_FIELD_Period_EndDate_Name="Fecha Final";

@XendraField(AD_Column_ID="EndDate",IsCentrallyMaintained=true,
AD_Tab_ID="68639869-33c2-7945-1f5e-76e4c02fc483",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f197a83a-8f1e-14ba-da86-3c76364eeaf9")
public static final String FIELDNAME_Period_EndDate="f197a83a-8f1e-14ba-da86-3c76364eeaf9";

@XendraTrl(Identifier="0561f1d2-1445-ee3a-fa03-2e8ae4c84f2c")
public static String es_PE_COLUMN_EndDate_Name="Fecha Final";

@XendraColumn(AD_Element_ID="16fae692-c943-4a1f-732e-bfce5aecb4b3",ColumnName="EndDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0561f1d2-1445-ee3a-fa03-2e8ae4c84f2c",
Synchronized="2017-08-05 16:54:06.0")
/** Column name EndDate */
public static final String COLUMNNAME_EndDate = "EndDate";
/** Set Accounting Fact ID (per document).
@param Fact_ID This ID is guaranteed to be unique per client per year per document (in the fact table). */
public void setFact_ID (String Fact_ID)
{
if (Fact_ID == null) throw new IllegalArgumentException ("Fact_ID is mandatory.");
if (Fact_ID.length() > 20)
{
log.warning("Length > 20 - truncated");
Fact_ID = Fact_ID.substring(0,19);
}
set_Value (COLUMNNAME_Fact_ID, Fact_ID);
}
/** Get Accounting Fact ID (per document).
@return This ID is guaranteed to be unique per client per year per document (in the fact table). */
public String getFact_ID() 
{
String value = (String)get_Value(COLUMNNAME_Fact_ID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="1c2a9789-51a7-2db0-c2e6-c636c3d3e042")
public static String es_PE_FIELD_Period_AccountingFactIDPerDocument_Description="Se garantiza que este ID sea unico por cada cliente/ano/documento (en la tabla de asientos).";

@XendraTrl(Identifier="1c2a9789-51a7-2db0-c2e6-c636c3d3e042")
public static String es_PE_FIELD_Period_AccountingFactIDPerDocument_Name="ID Asiento Contable (por documento)";

@XendraField(AD_Column_ID="Fact_ID",IsCentrallyMaintained=true,
AD_Tab_ID="68639869-33c2-7945-1f5e-76e4c02fc483",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1c2a9789-51a7-2db0-c2e6-c636c3d3e042")
public static final String FIELDNAME_Period_AccountingFactIDPerDocument="1c2a9789-51a7-2db0-c2e6-c636c3d3e042";

@XendraTrl(Identifier="1b1235f4-5a32-c147-b185-9eb39258f923")
public static String es_PE_COLUMN_Fact_ID_Name="ID Asiento Contable (por documento)";

@XendraColumn(AD_Element_ID="20f6c8ee-0151-735b-7a03-2006e09d8eb0",ColumnName="Fact_ID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1b1235f4-5a32-c147-b185-9eb39258f923",
Synchronized="2017-08-05 16:54:06.0")
/** Column name Fact_ID */
public static final String COLUMNNAME_Fact_ID = "Fact_ID";
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
@XendraTrl(Identifier="6ce1bc95-b8e7-4fba-95b6-d9837052a8fc")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6ce1bc95-b8e7-4fba-95b6-d9837052a8fc",
Synchronized="2017-08-05 16:54:06.0")
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

@XendraTrl(Identifier="e7431a41-e47c-6961-ba74-645effb0d0b5")
public static String es_PE_FIELD_Period_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="e7431a41-e47c-6961-ba74-645effb0d0b5")
public static String es_PE_FIELD_Period_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="e7431a41-e47c-6961-ba74-645effb0d0b5")
public static String es_PE_FIELD_Period_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="68639869-33c2-7945-1f5e-76e4c02fc483",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="e7431a41-e47c-6961-ba74-645effb0d0b5")
public static final String FIELDNAME_Period_Name="e7431a41-e47c-6961-ba74-645effb0d0b5";

@XendraTrl(Identifier="40bbc6a7-5f56-607b-fff8-8f08b08d7575")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="40bbc6a7-5f56-607b-fff8-8f08b08d7575",
Synchronized="2017-08-05 16:54:06.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Period No.
@param PeriodNo Unique Period Number */
public void setPeriodNo (int PeriodNo)
{
set_Value (COLUMNNAME_PeriodNo, Integer.valueOf(PeriodNo));
}
/** Get Period No.
@return Unique Period Number */
public int getPeriodNo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PeriodNo);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6abb3ec5-d6a4-41eb-394b-661d6b24e89f")
public static String es_PE_FIELD_Period_PeriodNo_Description="Número de período único";

@XendraTrl(Identifier="6abb3ec5-d6a4-41eb-394b-661d6b24e89f")
public static String es_PE_FIELD_Period_PeriodNo_Help="El No. de período identifica un período específico para este año. Cada período está definido por una fecha inicial y una fecha final. Los rangos de fechas para un mismo calendario y año no se pueden traslapar.";

@XendraTrl(Identifier="6abb3ec5-d6a4-41eb-394b-661d6b24e89f")
public static String es_PE_FIELD_Period_PeriodNo_Name="No. de Período";

@XendraField(AD_Column_ID="PeriodNo",IsCentrallyMaintained=true,
AD_Tab_ID="68639869-33c2-7945-1f5e-76e4c02fc483",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6abb3ec5-d6a4-41eb-394b-661d6b24e89f")
public static final String FIELDNAME_Period_PeriodNo="6abb3ec5-d6a4-41eb-394b-661d6b24e89f";

@XendraTrl(Identifier="2906ac92-55f3-3bcf-4b52-0e43a84260ef")
public static String es_PE_COLUMN_PeriodNo_Name="No. de Período";

@XendraColumn(AD_Element_ID="c3b1b3eb-a9b0-25c6-0c8b-86bb7d76de0e",ColumnName="PeriodNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2906ac92-55f3-3bcf-4b52-0e43a84260ef",
Synchronized="2017-08-05 16:54:06.0")
/** Column name PeriodNo */
public static final String COLUMNNAME_PeriodNo = "PeriodNo";

/** PeriodType AD_Reference=957da71e-2cc9-3b18-6cdb-f8977df211eb */
public static final int PERIODTYPE_AD_Reference_ID=115;
/** Set Period Type.
@param PeriodType Period Type */
public void setPeriodType (String PeriodType)
{
if (PeriodType == null) throw new IllegalArgumentException ("PeriodType is mandatory");
if (PeriodType.equals(REF_C_PeriodType.StandardCalendarPeriod) || PeriodType.equals(REF_C_PeriodType.AdjustmentPeriod));
 else throw new IllegalArgumentException ("PeriodType Invalid value - " + PeriodType + " - Reference_ID=115 - S - A");
if (PeriodType.length() > 1)
{
log.warning("Length > 1 - truncated");
PeriodType = PeriodType.substring(0,0);
}
set_ValueNoCheck (COLUMNNAME_PeriodType, PeriodType);
}
/** Get Period Type.
@return Period Type */
public String getPeriodType() 
{
return (String)get_Value(COLUMNNAME_PeriodType);
}

@XendraTrl(Identifier="bfdce9d0-b105-0720-a561-ebda2f70e4da")
public static String es_PE_FIELD_Period_PeriodType_Description="Tipo de período";

@XendraTrl(Identifier="bfdce9d0-b105-0720-a561-ebda2f70e4da")
public static String es_PE_FIELD_Period_PeriodType_Help="El tipo de período indica el tipo (Estándar ó Ajuste) de período";

@XendraTrl(Identifier="bfdce9d0-b105-0720-a561-ebda2f70e4da")
public static String es_PE_FIELD_Period_PeriodType_Name="Tipo de Período";

@XendraField(AD_Column_ID="PeriodType",IsCentrallyMaintained=true,
AD_Tab_ID="68639869-33c2-7945-1f5e-76e4c02fc483",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bfdce9d0-b105-0720-a561-ebda2f70e4da")
public static final String FIELDNAME_Period_PeriodType="bfdce9d0-b105-0720-a561-ebda2f70e4da";

@XendraTrl(Identifier="f690f30f-436c-26d2-bd47-18637428faea")
public static String es_PE_COLUMN_PeriodType_Name="Tipo de Período";

@XendraColumn(AD_Element_ID="f1979546-dd43-2a54-65bf-8e387aa7a7bc",ColumnName="PeriodType",
AD_Reference_ID=17,AD_Reference_Value_ID="957da71e-2cc9-3b18-6cdb-f8977df211eb",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="S",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f690f30f-436c-26d2-bd47-18637428faea",Synchronized="2017-08-05 16:54:06.0")
/** Column name PeriodType */
public static final String COLUMNNAME_PeriodType = "PeriodType";
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

@XendraTrl(Identifier="ed997e46-d822-8cbc-e2ce-a4869620fe9b")
public static String es_PE_FIELD_Period_ProcessNow_Description="Abrir/Cerrar todos los tipos de documento base para este período";

@XendraTrl(Identifier="ed997e46-d822-8cbc-e2ce-a4869620fe9b")
public static String es_PE_FIELD_Period_ProcessNow_Name="Abrir/Cerrar Todo";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="68639869-33c2-7945-1f5e-76e4c02fc483",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ed997e46-d822-8cbc-e2ce-a4869620fe9b")
public static final String FIELDNAME_Period_ProcessNow="ed997e46-d822-8cbc-e2ce-a4869620fe9b";

@XendraTrl(Identifier="daed4049-daf9-5f70-6113-1d135b7ef547")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="07e1b2b2-3185-4ef1-7595-ac94623b5bd4",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="daed4049-daf9-5f70-6113-1d135b7ef547",Synchronized="2017-08-05 16:54:06.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Start Date.
@param StartDate First effective day (inclusive) */
public void setStartDate (Timestamp StartDate)
{
if (StartDate == null) throw new IllegalArgumentException ("StartDate is mandatory.");
set_Value (COLUMNNAME_StartDate, StartDate);
}
/** Get Start Date.
@return First effective day (inclusive) */
public Timestamp getStartDate() 
{
return (Timestamp)get_Value(COLUMNNAME_StartDate);
}

@XendraTrl(Identifier="74f1c616-dd14-cc23-8f79-510c6aafbd34")
public static String es_PE_FIELD_Period_StartDate_Description="Primer día efectivo (inclusive)";

@XendraTrl(Identifier="74f1c616-dd14-cc23-8f79-510c6aafbd34")
public static String es_PE_FIELD_Period_StartDate_Help="La fecha de Inicio indica la primera fecha ó fecha inicial de un rango";

@XendraTrl(Identifier="74f1c616-dd14-cc23-8f79-510c6aafbd34")
public static String es_PE_FIELD_Period_StartDate_Name="Fecha de Inicio";

@XendraField(AD_Column_ID="StartDate",IsCentrallyMaintained=true,
AD_Tab_ID="68639869-33c2-7945-1f5e-76e4c02fc483",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="74f1c616-dd14-cc23-8f79-510c6aafbd34")
public static final String FIELDNAME_Period_StartDate="74f1c616-dd14-cc23-8f79-510c6aafbd34";

@XendraTrl(Identifier="34dc205f-8781-c7d2-8891-05fbca031200")
public static String es_PE_COLUMN_StartDate_Name="Fecha de Inicio";

@XendraColumn(AD_Element_ID="3fe42406-cab3-a569-bf0b-3614f5d95711",ColumnName="StartDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="34dc205f-8781-c7d2-8891-05fbca031200",
Synchronized="2017-08-05 16:54:07.0")
/** Column name StartDate */
public static final String COLUMNNAME_StartDate = "StartDate";
}
