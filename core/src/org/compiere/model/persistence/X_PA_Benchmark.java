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
import org.compiere.model.reference.REF_PA_BenschmarkAccumulationType;
/** Generated Model for PA_Benchmark
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_PA_Benchmark extends PO
{
/** Standard Constructor
@param ctx context
@param PA_Benchmark_ID id
@param trxName transaction
*/
public X_PA_Benchmark (Properties ctx, int PA_Benchmark_ID, String trxName)
{
super (ctx, PA_Benchmark_ID, trxName);
/** if (PA_Benchmark_ID == 0)
{
setAccumulationType (null);
setName (null);
setPA_Benchmark_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_PA_Benchmark (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=833 */
public static int Table_ID=MTable.getTable_ID("PA_Benchmark");

@XendraTrl(Identifier="58046948-d91b-dc14-5b81-286624e43d7c")
public static String es_PE_TAB_Benchmark_Description="Desempeño Punto de Control";

@XendraTrl(Identifier="58046948-d91b-dc14-5b81-286624e43d7c")
public static String es_PE_TAB_Benchmark_Name="Punto de Control";

@XendraTrl(Identifier="58046948-d91b-dc14-5b81-286624e43d7c")
public static String es_PE_TAB_Benchmark_Help="Series de Datos para comparar desempeño interno con (ej Precio de Inventario, . . )";

@XendraTab(Name="Benchmark",Description="Performance Benchmark",
Help="Data Series to compare internal performance with (e.g. stock price, ...)",
AD_Window_ID="e3187912-ea74-7814-0337-b1de9f9a6a25",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="58046948-d91b-dc14-5b81-286624e43d7c",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Benchmark="58046948-d91b-dc14-5b81-286624e43d7c";

@XendraTrl(Identifier="48bd6e34-8136-93e6-0d17-dec554ee76fe")
public static String es_PE_TABLE_PA_Benchmark_Name="Punto de Comparación";

@XendraTable(Name="Benchmark",Description="Performance Benchmark",Help="",TableName="PA_Benchmark",
AccessLevel="6",AD_Window_ID="e3187912-ea74-7814-0337-b1de9f9a6a25",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=130,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.performanceanalysis",
Identifier="48bd6e34-8136-93e6-0d17-dec554ee76fe",Synchronized="2017-08-16 11:43:38.0")
/** TableName=PA_Benchmark */
public static final String Table_Name="PA_Benchmark";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"PA_Benchmark");

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
    Table_ID = MTable.getTable_ID("PA_Benchmark");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_PA_Benchmark[").append(get_ID()).append("]");
return sb.toString();
}

/** AccumulationType AD_Reference=fde92be7-ff52-1bd2-9186-e27f63637854 */
public static final int ACCUMULATIONTYPE_AD_Reference_ID=370;
/** Set Accumulation Type.
@param AccumulationType How to accumulate data on time axis */
public void setAccumulationType (String AccumulationType)
{
if (AccumulationType == null) throw new IllegalArgumentException ("AccumulationType is mandatory");
if (AccumulationType.equals(REF_PA_BenschmarkAccumulationType.Average) || AccumulationType.equals(REF_PA_BenschmarkAccumulationType.Sum));
 else throw new IllegalArgumentException ("AccumulationType Invalid value - " + AccumulationType + " - Reference_ID=370 - A - S");
if (AccumulationType.length() > 1)
{
log.warning("Length > 1 - truncated");
AccumulationType = AccumulationType.substring(0,0);
}
set_Value (COLUMNNAME_AccumulationType, AccumulationType);
}
/** Get Accumulation Type.
@return How to accumulate data on time axis */
public String getAccumulationType() 
{
return (String)get_Value(COLUMNNAME_AccumulationType);
}

@XendraTrl(Identifier="d0048aef-8e03-36d9-a3ed-b290dba9a2b4")
public static String es_PE_FIELD_Benchmark_AccumulationType_Description="Como Acumular Datos en el eje de tiempo";

@XendraTrl(Identifier="d0048aef-8e03-36d9-a3ed-b290dba9a2b4")
public static String es_PE_FIELD_Benchmark_AccumulationType_Help="Suma añade los puntos de datos (ejem. volumen de inventario) - El promedio es apropiado para  por ejemplo el Precio del Inventario";

@XendraTrl(Identifier="d0048aef-8e03-36d9-a3ed-b290dba9a2b4")
public static String es_PE_FIELD_Benchmark_AccumulationType_Name="Tipo de Acumulación";

@XendraField(AD_Column_ID="AccumulationType",IsCentrallyMaintained=true,
AD_Tab_ID="58046948-d91b-dc14-5b81-286624e43d7c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d0048aef-8e03-36d9-a3ed-b290dba9a2b4")
public static final String FIELDNAME_Benchmark_AccumulationType="d0048aef-8e03-36d9-a3ed-b290dba9a2b4";

@XendraTrl(Identifier="872d0a56-2c1c-e8dc-facd-3772baca4f66")
public static String es_PE_COLUMN_AccumulationType_Name="Tipo de Acumulación";

@XendraColumn(AD_Element_ID="92e6dda0-72e4-1b02-ad6a-c881a2f7703e",ColumnName="AccumulationType",
AD_Reference_ID=17,AD_Reference_Value_ID="fde92be7-ff52-1bd2-9186-e27f63637854",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="872d0a56-2c1c-e8dc-facd-3772baca4f66",Synchronized="2017-08-05 16:55:38.0")
/** Column name AccumulationType */
public static final String COLUMNNAME_AccumulationType = "AccumulationType";
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

@XendraTrl(Identifier="38b906cb-4954-6300-3a6a-127fe49966d3")
public static String es_PE_FIELD_Benchmark_Description_Description="Observación";

@XendraTrl(Identifier="38b906cb-4954-6300-3a6a-127fe49966d3")
public static String es_PE_FIELD_Benchmark_Description_Help="Observación";

@XendraTrl(Identifier="38b906cb-4954-6300-3a6a-127fe49966d3")
public static String es_PE_FIELD_Benchmark_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="58046948-d91b-dc14-5b81-286624e43d7c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="38b906cb-4954-6300-3a6a-127fe49966d3")
public static final String FIELDNAME_Benchmark_Description="38b906cb-4954-6300-3a6a-127fe49966d3";

@XendraTrl(Identifier="e291d1ec-c090-5dee-3c25-5eca4cbac5c3")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e291d1ec-c090-5dee-3c25-5eca4cbac5c3",
Synchronized="2017-08-05 16:55:38.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Comment/Help.
@param Help Comment or Hint */
public void setHelp (String Help)
{
set_Value (COLUMNNAME_Help, Help);
}
/** Get Comment/Help.
@return Comment or Hint */
public String getHelp() 
{
String value = (String)get_Value(COLUMNNAME_Help);
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

@XendraTrl(Identifier="095bed54-8525-074f-6d65-adc4ea9f7a87")
public static String es_PE_FIELD_Benchmark_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="095bed54-8525-074f-6d65-adc4ea9f7a87")
public static String es_PE_FIELD_Benchmark_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="095bed54-8525-074f-6d65-adc4ea9f7a87")
public static String es_PE_FIELD_Benchmark_CommentHelp_Name="Ayuda";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="58046948-d91b-dc14-5b81-286624e43d7c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="095bed54-8525-074f-6d65-adc4ea9f7a87")
public static final String FIELDNAME_Benchmark_CommentHelp="095bed54-8525-074f-6d65-adc4ea9f7a87";

@XendraTrl(Identifier="1b0063f2-fcd0-4241-e1e5-9635a34f7d5c")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1b0063f2-fcd0-4241-e1e5-9635a34f7d5c",
Synchronized="2017-08-05 16:55:38.0")
/** Column name Help */
public static final String COLUMNNAME_Help = "Help";
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
@XendraTrl(Identifier="99bffbcb-2ee3-405c-9c30-2b5cdf61ad11")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="99bffbcb-2ee3-405c-9c30-2b5cdf61ad11",
Synchronized="2017-08-05 16:55:38.0")
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

@XendraTrl(Identifier="3a646757-7c44-2981-b64f-66d8d27c49ed")
public static String es_PE_FIELD_Benchmark_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="3a646757-7c44-2981-b64f-66d8d27c49ed")
public static String es_PE_FIELD_Benchmark_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="3a646757-7c44-2981-b64f-66d8d27c49ed")
public static String es_PE_FIELD_Benchmark_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="58046948-d91b-dc14-5b81-286624e43d7c",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=120,IsReadOnly=false,SeqNo=30,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="3a646757-7c44-2981-b64f-66d8d27c49ed")
public static final String FIELDNAME_Benchmark_Name="3a646757-7c44-2981-b64f-66d8d27c49ed";

@XendraTrl(Identifier="20e9e8a0-3565-1a9e-ac4e-e2e899431eab")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="20e9e8a0-3565-1a9e-ac4e-e2e899431eab",
Synchronized="2017-08-05 16:55:38.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
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

@XendraTrl(Identifier="2b9ec26d-0950-055b-759d-f94319dac565")
public static String es_PE_FIELD_Benchmark_Benchmark_Description="Desempeño Punto de Comparación";

@XendraTrl(Identifier="2b9ec26d-0950-055b-759d-f94319dac565")
public static String es_PE_FIELD_Benchmark_Benchmark_Help="Series de Datos para comparar el desempeño interno (ej precio del inventario, ...)";

@XendraTrl(Identifier="2b9ec26d-0950-055b-759d-f94319dac565")
public static String es_PE_FIELD_Benchmark_Benchmark_Name="Punto de Comparación";

@XendraField(AD_Column_ID="PA_Benchmark_ID",IsCentrallyMaintained=true,
AD_Tab_ID="58046948-d91b-dc14-5b81-286624e43d7c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2b9ec26d-0950-055b-759d-f94319dac565")
public static final String FIELDNAME_Benchmark_Benchmark="2b9ec26d-0950-055b-759d-f94319dac565";
/** Column name PA_Benchmark_ID */
public static final String COLUMNNAME_PA_Benchmark_ID = "PA_Benchmark_ID";
}
