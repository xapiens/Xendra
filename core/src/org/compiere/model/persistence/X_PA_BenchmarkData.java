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
/** Generated Model for PA_BenchmarkData
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_PA_BenchmarkData extends PO
{
/** Standard Constructor
@param ctx context
@param PA_BenchmarkData_ID id
@param trxName transaction
*/
public X_PA_BenchmarkData (Properties ctx, int PA_BenchmarkData_ID, String trxName)
{
super (ctx, PA_BenchmarkData_ID, trxName);
/** if (PA_BenchmarkData_ID == 0)
{
setBenchmarkDate (new Timestamp(System.currentTimeMillis()));
setBenchmarkValue (Env.ZERO);
setName (null);
setPA_BenchmarkData_ID (0);
setPA_Benchmark_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_PA_BenchmarkData (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=834 */
public static int Table_ID=MTable.getTable_ID("PA_BenchmarkData");

@XendraTrl(Identifier="0b210549-cfba-6cbb-b1f6-c1b4ebd0bf01")
public static String es_PE_TAB_Data_Description="Desempeño Punto deControl de Datos ";

@XendraTrl(Identifier="0b210549-cfba-6cbb-b1f6-c1b4ebd0bf01")
public static String es_PE_TAB_Data_Name="Datos";

@XendraTrl(Identifier="0b210549-cfba-6cbb-b1f6-c1b4ebd0bf01")
public static String es_PE_TAB_Data_Help="Series de Datos Puntuales para comparar desempeño interno (ej. Precio de Inventario, ...)";

@XendraTab(Name="Data",Description="Performance Benchmark Data Point",
Help="Data Series Point to compare internal performance with (e.g. stock price, ...)",
AD_Window_ID="e3187912-ea74-7814-0337-b1de9f9a6a25",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="0b210549-cfba-6cbb-b1f6-c1b4ebd0bf01",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Data="0b210549-cfba-6cbb-b1f6-c1b4ebd0bf01";

@XendraTrl(Identifier="e5d9b2e7-1067-678e-7f1c-d075b93e13e4")
public static String es_PE_TABLE_PA_BenchmarkData_Name="Información Punto de Comparación";


@XendraTable(Name="Benchmark Data",Description="Performance Benchmark Data Point",Help="",
TableName="PA_BenchmarkData",AccessLevel="6",AD_Window_ID="e3187912-ea74-7814-0337-b1de9f9a6a25",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.performanceanalysis",
Identifier="e5d9b2e7-1067-678e-7f1c-d075b93e13e4",Synchronized="2017-08-16 11:43:39.0")
/** TableName=PA_BenchmarkData */
public static final String Table_Name="PA_BenchmarkData";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"PA_BenchmarkData");

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
    Table_ID = MTable.getTable_ID("PA_BenchmarkData");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_PA_BenchmarkData[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Date.
@param BenchmarkDate Benchmark Date */
public void setBenchmarkDate (Timestamp BenchmarkDate)
{
if (BenchmarkDate == null) throw new IllegalArgumentException ("BenchmarkDate is mandatory.");
set_Value (COLUMNNAME_BenchmarkDate, BenchmarkDate);
}
/** Get Date.
@return Benchmark Date */
public Timestamp getBenchmarkDate() 
{
return (Timestamp)get_Value(COLUMNNAME_BenchmarkDate);
}

@XendraTrl(Identifier="2a8ef9e6-27be-81f4-714e-305f412ff0e6")
public static String es_PE_FIELD_Data_Date_Description="Fecha Punto de Comparación";

@XendraTrl(Identifier="2a8ef9e6-27be-81f4-714e-305f412ff0e6")
public static String es_PE_FIELD_Data_Date_Help="Fecha de Información Punto de Comparación";

@XendraTrl(Identifier="2a8ef9e6-27be-81f4-714e-305f412ff0e6")
public static String es_PE_FIELD_Data_Date_Name="Fecha";
@XendraField(AD_Column_ID="BenchmarkDate",
IsCentrallyMaintained=true,AD_Tab_ID="0b210549-cfba-6cbb-b1f6-c1b4ebd0bf01",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=7,IsReadOnly=false,SeqNo=70,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="2a8ef9e6-27be-81f4-714e-305f412ff0e6")
public static final String FIELDNAME_Data_Date="2a8ef9e6-27be-81f4-714e-305f412ff0e6";

@XendraTrl(Identifier="be58458a-2a24-45f8-27e1-d6d3e2338fd3")
public static String es_PE_COLUMN_BenchmarkDate_Name="Fecha";

@XendraColumn(AD_Element_ID="34bd0f34-063b-490f-a996-347755a9fb9d",ColumnName="BenchmarkDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="be58458a-2a24-45f8-27e1-d6d3e2338fd3",
Synchronized="2017-08-05 16:55:39.0")
/** Column name BenchmarkDate */
public static final String COLUMNNAME_BenchmarkDate = "BenchmarkDate";
/** Set Value.
@param BenchmarkValue Benchmark Value */
public void setBenchmarkValue (BigDecimal BenchmarkValue)
{
if (BenchmarkValue == null) throw new IllegalArgumentException ("BenchmarkValue is mandatory.");
set_Value (COLUMNNAME_BenchmarkValue, BenchmarkValue);
}
/** Get Value.
@return Benchmark Value */
public BigDecimal getBenchmarkValue() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_BenchmarkValue);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="754acb37-529c-2719-cbc4-6870befec65b")
public static String es_PE_FIELD_Data_Value_Description="Valor Punto de Referencia";

@XendraTrl(Identifier="754acb37-529c-2719-cbc4-6870befec65b")
public static String es_PE_FIELD_Data_Value_Help="Valor del Punto de Datos de Referencia.";

@XendraTrl(Identifier="754acb37-529c-2719-cbc4-6870befec65b")
public static String es_PE_FIELD_Data_Value_Name="Valor ";

@XendraField(AD_Column_ID="BenchmarkValue",IsCentrallyMaintained=true,
AD_Tab_ID="0b210549-cfba-6cbb-b1f6-c1b4ebd0bf01",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="754acb37-529c-2719-cbc4-6870befec65b")
public static final String FIELDNAME_Data_Value="754acb37-529c-2719-cbc4-6870befec65b";

@XendraTrl(Identifier="90c4ebe9-1d3b-ac8a-8a88-599ed2d3b1b8")
public static String es_PE_COLUMN_BenchmarkValue_Name="Valor ";

@XendraColumn(AD_Element_ID="dd40de83-991d-cb91-b0a7-407ae399e61e",ColumnName="BenchmarkValue",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="90c4ebe9-1d3b-ac8a-8a88-599ed2d3b1b8",
Synchronized="2017-08-05 16:55:39.0")
/** Column name BenchmarkValue */
public static final String COLUMNNAME_BenchmarkValue = "BenchmarkValue";
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

@XendraTrl(Identifier="06697d29-f8a1-3e2f-6a5e-3adac8f74c1b")
public static String es_PE_FIELD_Data_Description_Description="Observación";

@XendraTrl(Identifier="06697d29-f8a1-3e2f-6a5e-3adac8f74c1b")
public static String es_PE_FIELD_Data_Description_Help="Observación";

@XendraTrl(Identifier="06697d29-f8a1-3e2f-6a5e-3adac8f74c1b")
public static String es_PE_FIELD_Data_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="0b210549-cfba-6cbb-b1f6-c1b4ebd0bf01",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="06697d29-f8a1-3e2f-6a5e-3adac8f74c1b")
public static final String FIELDNAME_Data_Description="06697d29-f8a1-3e2f-6a5e-3adac8f74c1b";

@XendraTrl(Identifier="65955a69-c83e-c01c-35ea-877853e1ef37")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="65955a69-c83e-c01c-35ea-877853e1ef37",
Synchronized="2017-08-05 16:55:39.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
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
@XendraTrl(Identifier="ea0cc664-b682-4b41-aa90-22a3b9655e6c")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ea0cc664-b682-4b41-aa90-22a3b9655e6c",
Synchronized="2017-08-05 16:55:39.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name == null) throw new IllegalArgumentException ("Name is mandatory.");
if (Name.length() > 120)
{
log.warning("Length > 120 - truncated");
Name = Name.substring(0,119);
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

@XendraTrl(Identifier="14efaef5-c81d-2084-776c-8cfa331f1062")
public static String es_PE_FIELD_Data_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="14efaef5-c81d-2084-776c-8cfa331f1062")
public static String es_PE_FIELD_Data_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="14efaef5-c81d-2084-776c-8cfa331f1062")
public static String es_PE_FIELD_Data_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="0b210549-cfba-6cbb-b1f6-c1b4ebd0bf01",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=120,IsReadOnly=false,SeqNo=40,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="14efaef5-c81d-2084-776c-8cfa331f1062")
public static final String FIELDNAME_Data_Name="14efaef5-c81d-2084-776c-8cfa331f1062";

@XendraTrl(Identifier="d11b8941-1072-ed59-ed9d-23a0e59ada6b")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d11b8941-1072-ed59-ed9d-23a0e59ada6b",
Synchronized="2017-08-05 16:55:39.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Benchmark Data.
@param PA_BenchmarkData_ID Performance Benchmark Data Point */
public void setPA_BenchmarkData_ID (int PA_BenchmarkData_ID)
{
if (PA_BenchmarkData_ID < 1) throw new IllegalArgumentException ("PA_BenchmarkData_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_PA_BenchmarkData_ID, Integer.valueOf(PA_BenchmarkData_ID));
}
/** Get Benchmark Data.
@return Performance Benchmark Data Point */
public int getPA_BenchmarkData_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_BenchmarkData_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="77bfbb46-0e87-8091-8596-89d141f373c3")
public static String es_PE_FIELD_Data_BenchmarkData_Description="Información Puntual Desempeño Punto de Comparación ";

@XendraTrl(Identifier="77bfbb46-0e87-8091-8596-89d141f373c3")
public static String es_PE_FIELD_Data_BenchmarkData_Help="Serie de Datos Puntuales para comparar desempeño interno con (ej. costo de inventario,....)";

@XendraTrl(Identifier="77bfbb46-0e87-8091-8596-89d141f373c3")
public static String es_PE_FIELD_Data_BenchmarkData_Name="Información Punto de Comparación";

@XendraField(AD_Column_ID="PA_BenchmarkData_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0b210549-cfba-6cbb-b1f6-c1b4ebd0bf01",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="77bfbb46-0e87-8091-8596-89d141f373c3")
public static final String FIELDNAME_Data_BenchmarkData="77bfbb46-0e87-8091-8596-89d141f373c3";
/** Column name PA_BenchmarkData_ID */
public static final String COLUMNNAME_PA_BenchmarkData_ID = "PA_BenchmarkData_ID";
/** Set Benchmark.
@param PA_Benchmark_ID Performance Benchmark */
public void setPA_Benchmark_ID (int PA_Benchmark_ID)
{
if (PA_Benchmark_ID < 1) throw new IllegalArgumentException ("PA_Benchmark_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_PA_Benchmark_ID, Integer.valueOf(PA_Benchmark_ID));
}
/** Get Benchmark.
@return Performance Benchmark */
public int getPA_Benchmark_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_Benchmark_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b0444678-1e5a-5981-48a7-af0a3173ffc1")
public static String es_PE_FIELD_Data_Benchmark_Description="Desempeño Punto de Comparación";

@XendraTrl(Identifier="b0444678-1e5a-5981-48a7-af0a3173ffc1")
public static String es_PE_FIELD_Data_Benchmark_Help="Series de Datos para comparar el desempeño interno (ej precio del inventario, ...)";

@XendraTrl(Identifier="b0444678-1e5a-5981-48a7-af0a3173ffc1")
public static String es_PE_FIELD_Data_Benchmark_Name="Punto de Comparación";

@XendraField(AD_Column_ID="PA_Benchmark_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0b210549-cfba-6cbb-b1f6-c1b4ebd0bf01",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b0444678-1e5a-5981-48a7-af0a3173ffc1")
public static final String FIELDNAME_Data_Benchmark="b0444678-1e5a-5981-48a7-af0a3173ffc1";

@XendraTrl(Identifier="d22e6210-45ab-1348-f410-3039bea07a17")
public static String es_PE_COLUMN_PA_Benchmark_ID_Name="Punto de Comparación";

@XendraColumn(AD_Element_ID="5c3a5d8b-4915-414f-800a-8f14a5dc7994",ColumnName="PA_Benchmark_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d22e6210-45ab-1348-f410-3039bea07a17",
Synchronized="2017-08-05 16:55:39.0")
/** Column name PA_Benchmark_ID */
public static final String COLUMNNAME_PA_Benchmark_ID = "PA_Benchmark_ID";
}
