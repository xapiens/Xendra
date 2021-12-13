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
/** Generated Model for PA_Measure
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_PA_Measure extends PO
{
/** Standard Constructor
@param ctx context
@param PA_Measure_ID id
@param trxName transaction
*/
public X_PA_Measure (Properties ctx, int PA_Measure_ID, String trxName)
{
super (ctx, PA_Measure_ID, trxName);
/** if (PA_Measure_ID == 0)
{
setMeasureDataType (null);	
// T
setMeasureType (null);	
// M
setName (null);
setPA_Measure_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_PA_Measure (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=441 */
public static int Table_ID=MTable.getTable_ID("PA_Measure");

@XendraTrl(Identifier="8ac9b36b-799c-7af6-ed3f-d8d9d0210239")
public static String es_PE_TAB_Measure_Description="Medida de Desempeño";

@XendraTrl(Identifier="8ac9b36b-799c-7af6-ed3f-d8d9d0210239")
public static String es_PE_TAB_Measure_Help="La pestaña Medida de Desempeño define el rango de fechas y el método usado para medir el desempeño.";

@XendraTrl(Identifier="8ac9b36b-799c-7af6-ed3f-d8d9d0210239")
public static String es_PE_TAB_Measure_Name="Medición";
@XendraTab(Name="Measure",
Description="Performance Measure",
Help="The Performance Measure Tab defines the date range and method to be used for measuring performance.",
AD_Window_ID="77e27ab5-730a-939b-28f1-8469068c1e44",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="8ac9b36b-799c-7af6-ed3f-d8d9d0210239",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Measure="8ac9b36b-799c-7af6-ed3f-d8d9d0210239";

@XendraTrl(Identifier="c3d77e15-7c74-a997-380e-9c543459faf2")
public static String es_PE_TABLE_PA_Measure_Name="Medida";

@XendraTable(Name="Measure",AD_Package_ID="34bf6e21-8c70-8fb9-604c-a300eb925459",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Concrete Performance Measurement",
Help="",TableName="PA_Measure",AccessLevel="6",AD_Window_ID="77e27ab5-730a-939b-28f1-8469068c1e44",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=135,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.performanceanalysis",
Identifier="c3d77e15-7c74-a997-380e-9c543459faf2",Synchronized="2020-03-03 21:39:04.0")
/** TableName=PA_Measure */
public static final String Table_Name="PA_Measure";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"PA_Measure");

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
    Table_ID = MTable.getTable_ID("PA_Measure");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_PA_Measure[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Calculation Class.
@param CalculationClass Java Class for calculation, implementing Interface Measure */
public void setCalculationClass (String CalculationClass)
{
if (CalculationClass != null && CalculationClass.length() > 60)
{
log.warning("Length > 60 - truncated");
CalculationClass = CalculationClass.substring(0,59);
}
set_Value (COLUMNNAME_CalculationClass, CalculationClass);
}
/** Get Calculation Class.
@return Java Class for calculation, implementing Interface Measure */
public String getCalculationClass() 
{
String value = (String)get_Value(COLUMNNAME_CalculationClass);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="8bfdaa12-8298-0489-b6c4-8f8f03642d3b")
public static String es_PE_FIELD_Measure_CalculationClass_Name="Clase Cálculo";

@XendraTrl(Identifier="8bfdaa12-8298-0489-b6c4-8f8f03642d3b")
public static String es_PE_FIELD_Measure_CalculationClass_Description="Clase Java para cálculo; implementando la medida de Interfase";

@XendraTrl(Identifier="8bfdaa12-8298-0489-b6c4-8f8f03642d3b")
public static String es_PE_FIELD_Measure_CalculationClass_Help="La Clase Cálculo indica la clase java usada para calcular medidas";

@XendraField(AD_Column_ID="CalculationClass",IsCentrallyMaintained=true,
AD_Tab_ID="8ac9b36b-799c-7af6-ed3f-d8d9d0210239",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@MeasureType@=U",DisplayLength=60,IsReadOnly=false,SeqNo=110,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="8bfdaa12-8298-0489-b6c4-8f8f03642d3b")
public static final String FIELDNAME_Measure_CalculationClass="8bfdaa12-8298-0489-b6c4-8f8f03642d3b";

@XendraTrl(Identifier="cfb204c5-1f2b-cf82-9b10-77c9b91a3246")
public static String es_PE_COLUMN_CalculationClass_Name="Clase Cálculo";

@XendraColumn(AD_Element_ID="dce4bd2a-8e18-8813-b91b-198bd948d6aa",ColumnName="CalculationClass",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cfb204c5-1f2b-cf82-9b10-77c9b91a3246",
Synchronized="2019-08-30 22:23:37.0")
/** Column name CalculationClass */
public static final String COLUMNNAME_CalculationClass = "CalculationClass";
/** Set Project Type.
@param C_ProjectType_ID Type of the project */
public void setC_ProjectType_ID (int C_ProjectType_ID)
{
if (C_ProjectType_ID <= 0) set_Value (COLUMNNAME_C_ProjectType_ID, null);
 else 
set_Value (COLUMNNAME_C_ProjectType_ID, Integer.valueOf(C_ProjectType_ID));
}
/** Get Project Type.
@return Type of the project */
public int getC_ProjectType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ProjectType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="455f66c6-af55-4012-cfa4-ea9b5a03149f")
public static String es_PE_FIELD_Measure_ProjectType_Name="Tipo de Proyecto";

@XendraTrl(Identifier="455f66c6-af55-4012-cfa4-ea9b5a03149f")
public static String es_PE_FIELD_Measure_ProjectType_Description="Tipo de proyecto";

@XendraTrl(Identifier="455f66c6-af55-4012-cfa4-ea9b5a03149f")
public static String es_PE_FIELD_Measure_ProjectType_Help="Tipo de proyecto con las fases opcionales del proyecto y la información estándar de funcionamiento";

@XendraField(AD_Column_ID="C_ProjectType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8ac9b36b-799c-7af6-ed3f-d8d9d0210239",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@MeasureType@=P",DisplayLength=10,IsReadOnly=false,SeqNo=140,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="455f66c6-af55-4012-cfa4-ea9b5a03149f")
public static final String FIELDNAME_Measure_ProjectType="455f66c6-af55-4012-cfa4-ea9b5a03149f";

@XendraTrl(Identifier="53395f3f-2e39-3850-1b4e-e6af7c0c1f0a")
public static String es_PE_COLUMN_C_ProjectType_ID_Name="Tipo de Proyecto";

@XendraColumn(AD_Element_ID="f000bb9d-562b-51bf-8de1-feef472fc4a8",ColumnName="C_ProjectType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="53395f3f-2e39-3850-1b4e-e6af7c0c1f0a",
Synchronized="2019-08-30 22:23:37.0")
/** Column name C_ProjectType_ID */
public static final String COLUMNNAME_C_ProjectType_ID = "C_ProjectType_ID";
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

@XendraTrl(Identifier="455f9d68-667d-bd32-df16-0473082dce34")
public static String es_PE_FIELD_Measure_Description_Name="Observación";

@XendraTrl(Identifier="455f9d68-667d-bd32-df16-0473082dce34")
public static String es_PE_FIELD_Measure_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="455f9d68-667d-bd32-df16-0473082dce34")
public static String es_PE_FIELD_Measure_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="8ac9b36b-799c-7af6-ed3f-d8d9d0210239",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="455f9d68-667d-bd32-df16-0473082dce34")
public static final String FIELDNAME_Measure_Description="455f9d68-667d-bd32-df16-0473082dce34";

@XendraTrl(Identifier="a7cab471-7ee8-b611-722b-2e9584727de0")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a7cab471-7ee8-b611-722b-2e9584727de0",
Synchronized="2019-08-30 22:23:37.0")
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
@XendraTrl(Identifier="be3c7fde-8033-4111-b606-23a8e0ad106c")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="be3c7fde-8033-4111-b606-23a8e0ad106c",
Synchronized="2019-08-30 22:23:37.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Manual Actual.
@param ManualActual Manually entered actual value */
public void setManualActual (BigDecimal ManualActual)
{
set_Value (COLUMNNAME_ManualActual, ManualActual);
}
/** Get Manual Actual.
@return Manually entered actual value */
public BigDecimal getManualActual() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ManualActual);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="d73a9802-1e2a-2e57-7923-add0d14a8892")
public static String es_PE_FIELD_Measure_ManualActual_Name="Valor Manual Actual";

@XendraTrl(Identifier="d73a9802-1e2a-2e57-7923-add0d14a8892")
public static String es_PE_FIELD_Measure_ManualActual_Description="Valor actual introducido manualmente";

@XendraTrl(Identifier="d73a9802-1e2a-2e57-7923-add0d14a8892")
public static String es_PE_FIELD_Measure_ManualActual_Help="El activo manual identifica el valor actual introducido manualmente.";

@XendraField(AD_Column_ID="ManualActual",IsCentrallyMaintained=true,
AD_Tab_ID="8ac9b36b-799c-7af6-ed3f-d8d9d0210239",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@MeasureType@=M",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d73a9802-1e2a-2e57-7923-add0d14a8892")
public static final String FIELDNAME_Measure_ManualActual="d73a9802-1e2a-2e57-7923-add0d14a8892";

@XendraTrl(Identifier="16b256eb-b976-db1c-053a-024b0e5e277f")
public static String es_PE_COLUMN_ManualActual_Name="Valor Manual Actual";

@XendraColumn(AD_Element_ID="885854a7-bfaa-5e6e-de17-749a35a80edf",ColumnName="ManualActual",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="16b256eb-b976-db1c-053a-024b0e5e277f",
Synchronized="2019-08-30 22:23:37.0")
/** Column name ManualActual */
public static final String COLUMNNAME_ManualActual = "ManualActual";
/** Set Note.
@param ManualNote Note for manual entry */
public void setManualNote (String ManualNote)
{
set_Value (COLUMNNAME_ManualNote, ManualNote);
}
/** Get Note.
@return Note for manual entry */
public String getManualNote() 
{
String value = (String)get_Value(COLUMNNAME_ManualNote);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="f0c79e53-35fd-0e4b-4599-e409fca5c7f5")
public static String es_PE_FIELD_Measure_Note_Name="Nota";

@XendraTrl(Identifier="f0c79e53-35fd-0e4b-4599-e409fca5c7f5")
public static String es_PE_FIELD_Measure_Note_Description="Nota para entrada manual";

@XendraTrl(Identifier="f0c79e53-35fd-0e4b-4599-e409fca5c7f5")
public static String es_PE_FIELD_Measure_Note_Help="La nota permite la entrada de información adicional concerniente a una entrada manual";

@XendraField(AD_Column_ID="ManualNote",IsCentrallyMaintained=true,
AD_Tab_ID="8ac9b36b-799c-7af6-ed3f-d8d9d0210239",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@MeasureType@=M",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f0c79e53-35fd-0e4b-4599-e409fca5c7f5")
public static final String FIELDNAME_Measure_Note="f0c79e53-35fd-0e4b-4599-e409fca5c7f5";

@XendraTrl(Identifier="c9655ae6-2d64-6795-b10b-3183d0dd7bf8")
public static String es_PE_COLUMN_ManualNote_Name="Nota";

@XendraColumn(AD_Element_ID="84d72f60-7ec4-21d5-e0a9-6d7df23f8796",ColumnName="ManualNote",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c9655ae6-2d64-6795-b10b-3183d0dd7bf8",
Synchronized="2019-08-30 22:23:37.0")
/** Column name ManualNote */
public static final String COLUMNNAME_ManualNote = "ManualNote";
/** Set Measure Data Type.
@param MeasureDataType Type of data - Status or in Time */
public void setMeasureDataType (String MeasureDataType)
{
if (MeasureDataType.length() > 1)
{
log.warning("Length > 1 - truncated");
MeasureDataType = MeasureDataType.substring(0,0);
}
set_Value (COLUMNNAME_MeasureDataType, MeasureDataType);
}
/** Get Measure Data Type.
@return Type of data - Status or in Time */
public String getMeasureDataType() 
{
return (String)get_Value(COLUMNNAME_MeasureDataType);
}

@XendraTrl(Identifier="024f8ebf-ee6e-7873-56d9-3b6b17fe8089")
public static String es_PE_FIELD_Measure_MeasureDataType_Name="Tipo  Medida de la Información";

@XendraTrl(Identifier="024f8ebf-ee6e-7873-56d9-3b6b17fe8089")
public static String es_PE_FIELD_Measure_MeasureDataType_Description="Tipo de Información - Estado o A tiempo";

@XendraTrl(Identifier="024f8ebf-ee6e-7873-56d9-3b6b17fe8089")
public static String es_PE_FIELD_Measure_MeasureDataType_Help="Estado representa valóres válidos para cierto momento (ej. Facturas abiertas) - El historial no se mantiene.  El tiempo representa un valor en un tiempo dado (ej Cantidad Facturada en 1/1 ) - El historial es mantenido. ";

@XendraField(AD_Column_ID="MeasureDataType",IsCentrallyMaintained=true,
AD_Tab_ID="8ac9b36b-799c-7af6-ed3f-d8d9d0210239",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="024f8ebf-ee6e-7873-56d9-3b6b17fe8089")
public static final String FIELDNAME_Measure_MeasureDataType="024f8ebf-ee6e-7873-56d9-3b6b17fe8089";

@XendraTrl(Identifier="4867ba22-17a0-de6a-d046-0e9b1578fc3f")
public static String es_PE_COLUMN_MeasureDataType_Name="Tipo  Medida de la Información";

@XendraColumn(AD_Element_ID="0178be62-ec44-5feb-e940-e5ec22eada59",ColumnName="MeasureDataType",
AD_Reference_ID=17,AD_Reference_Value_ID="e04ce600-714c-a8a5-5a36-6390b68f39f6",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="T",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4867ba22-17a0-de6a-d046-0e9b1578fc3f",Synchronized="2019-08-30 22:23:37.0")
/** Column name MeasureDataType */
public static final String COLUMNNAME_MeasureDataType = "MeasureDataType";
/** Set Measure Type.
@param MeasureType Determines how the actual performance is derived */
public void setMeasureType (String MeasureType)
{
if (MeasureType.length() > 1)
{
log.warning("Length > 1 - truncated");
MeasureType = MeasureType.substring(0,0);
}
set_Value (COLUMNNAME_MeasureType, MeasureType);
}
/** Get Measure Type.
@return Determines how the actual performance is derived */
public String getMeasureType() 
{
return (String)get_Value(COLUMNNAME_MeasureType);
}

@XendraTrl(Identifier="9db6572e-40a9-1783-ac3f-3a3d287004a1")
public static String es_PE_FIELD_Measure_MeasureType_Name="Tipo de Medida";

@XendraTrl(Identifier="9db6572e-40a9-1783-ac3f-3a3d287004a1")
public static String es_PE_FIELD_Measure_MeasureType_Description="Determina de donde se determina la medida actual";

@XendraTrl(Identifier="9db6572e-40a9-1783-ac3f-3a3d287004a1")
public static String es_PE_FIELD_Measure_MeasureType_Help="El Tipo de Medida indica como es determinada la medida actual. Por Ej. Una medida puede ser manual mientras que otra es calculada";

@XendraField(AD_Column_ID="MeasureType",IsCentrallyMaintained=true,
AD_Tab_ID="8ac9b36b-799c-7af6-ed3f-d8d9d0210239",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9db6572e-40a9-1783-ac3f-3a3d287004a1")
public static final String FIELDNAME_Measure_MeasureType="9db6572e-40a9-1783-ac3f-3a3d287004a1";

@XendraTrl(Identifier="8705dcb6-6897-7f77-21e2-108236867a03")
public static String es_PE_COLUMN_MeasureType_Name="Tipo de Medida";

@XendraColumn(AD_Element_ID="b2f13b22-b37d-4601-560e-8e5082a12a32",ColumnName="MeasureType",
AD_Reference_ID=17,AD_Reference_Value_ID="a4edf16f-cf34-ee95-53c0-01e19e781b26",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="M",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8705dcb6-6897-7f77-21e2-108236867a03",Synchronized="2019-08-30 22:23:37.0")
/** Column name MeasureType */
public static final String COLUMNNAME_MeasureType = "MeasureType";
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

@XendraTrl(Identifier="6821444a-1f88-d340-5ba1-7aa1d974dbe4")
public static String es_PE_FIELD_Measure_Name_Name="Nombre";

@XendraTrl(Identifier="6821444a-1f88-d340-5ba1-7aa1d974dbe4")
public static String es_PE_FIELD_Measure_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="6821444a-1f88-d340-5ba1-7aa1d974dbe4")
public static String es_PE_FIELD_Measure_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="8ac9b36b-799c-7af6-ed3f-d8d9d0210239",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6821444a-1f88-d340-5ba1-7aa1d974dbe4")
public static final String FIELDNAME_Measure_Name="6821444a-1f88-d340-5ba1-7aa1d974dbe4";

@XendraTrl(Identifier="6db12050-0070-93f4-13d0-97904772d572")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6db12050-0070-93f4-13d0-97904772d572",
Synchronized="2019-08-30 22:23:37.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Benchmark.
@param PA_Benchmark_ID Performance Benchmark */
public void setPA_Benchmark_ID (int PA_Benchmark_ID)
{
if (PA_Benchmark_ID <= 0) set_Value (COLUMNNAME_PA_Benchmark_ID, null);
 else 
set_Value (COLUMNNAME_PA_Benchmark_ID, Integer.valueOf(PA_Benchmark_ID));
}
/** Get Benchmark.
@return Performance Benchmark */
public int getPA_Benchmark_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_Benchmark_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e034bc4e-fb5e-38a4-04d4-c6172a44e2b7")
public static String es_PE_FIELD_Measure_Benchmark_Name="Punto de Comparación";

@XendraTrl(Identifier="e034bc4e-fb5e-38a4-04d4-c6172a44e2b7")
public static String es_PE_FIELD_Measure_Benchmark_Description="Desempeño Punto de Comparación";

@XendraTrl(Identifier="e034bc4e-fb5e-38a4-04d4-c6172a44e2b7")
public static String es_PE_FIELD_Measure_Benchmark_Help="Series de Datos para comparar el desempeño interno (ej precio del inventario, ...)";

@XendraField(AD_Column_ID="PA_Benchmark_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8ac9b36b-799c-7af6-ed3f-d8d9d0210239",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e034bc4e-fb5e-38a4-04d4-c6172a44e2b7")
public static final String FIELDNAME_Measure_Benchmark="e034bc4e-fb5e-38a4-04d4-c6172a44e2b7";

@XendraTrl(Identifier="cfeb5947-de74-be9c-d1cc-c673c0381725")
public static String es_PE_COLUMN_PA_Benchmark_ID_Name="Punto de Comparación";

@XendraColumn(AD_Element_ID="5c3a5d8b-4915-414f-800a-8f14a5dc7994",ColumnName="PA_Benchmark_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cfeb5947-de74-be9c-d1cc-c673c0381725",
Synchronized="2019-08-30 22:23:37.0")
/** Column name PA_Benchmark_ID */
public static final String COLUMNNAME_PA_Benchmark_ID = "PA_Benchmark_ID";
/** Set Reporting Hierarchy.
@param PA_Hierarchy_ID Optional Reporting Hierarchy - If not selected the default hierarchy trees are used. */
public void setPA_Hierarchy_ID (int PA_Hierarchy_ID)
{
if (PA_Hierarchy_ID <= 0) set_Value (COLUMNNAME_PA_Hierarchy_ID, null);
 else 
set_Value (COLUMNNAME_PA_Hierarchy_ID, Integer.valueOf(PA_Hierarchy_ID));
}
/** Get Reporting Hierarchy.
@return Optional Reporting Hierarchy - If not selected the default hierarchy trees are used. */
public int getPA_Hierarchy_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_Hierarchy_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5dac73a0-9e11-03b6-04a7-4fcbe826d7e8")
public static String es_PE_FIELD_Measure_ReportingHierarchy_Name="Reportando Jerarquías";

@XendraTrl(Identifier="5dac73a0-9e11-03b6-04a7-4fcbe826d7e8")
public static String es_PE_FIELD_Measure_ReportingHierarchy_Description="Reporte Opcional de Jerarquías - Si no seleccionó se emplea el árbol predeterminado de jerarquías";

@XendraTrl(Identifier="5dac73a0-9e11-03b6-04a7-4fcbe826d7e8")
public static String es_PE_FIELD_Measure_ReportingHierarchy_Help="Reportar Jerarquías le permite seleccionar diferentes Jerarquías/Árboles para el Reoporte.Segmentos contables deseadosm Organizaciones, Cuentas, Productos pueden tener algunas jerarquías para acomodar siferentes vistas acerca del negocio.";

@XendraField(AD_Column_ID="PA_Hierarchy_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8ac9b36b-799c-7af6-ed3f-d8d9d0210239",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5dac73a0-9e11-03b6-04a7-4fcbe826d7e8")
public static final String FIELDNAME_Measure_ReportingHierarchy="5dac73a0-9e11-03b6-04a7-4fcbe826d7e8";

@XendraTrl(Identifier="2c8fa519-56b0-a5a9-912e-4c400a700295")
public static String es_PE_COLUMN_PA_Hierarchy_ID_Name="Reportando Jerarquías";

@XendraColumn(AD_Element_ID="b08a22da-a1e2-eddd-382a-6467c1196907",ColumnName="PA_Hierarchy_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2c8fa519-56b0-a5a9-912e-4c400a700295",
Synchronized="2019-08-30 22:23:37.0")
/** Column name PA_Hierarchy_ID */
public static final String COLUMNNAME_PA_Hierarchy_ID = "PA_Hierarchy_ID";
/** Set Measure Calculation.
@param PA_MeasureCalc_ID Calculation method for measuring performance */
public void setPA_MeasureCalc_ID (int PA_MeasureCalc_ID)
{
if (PA_MeasureCalc_ID <= 0) set_Value (COLUMNNAME_PA_MeasureCalc_ID, null);
 else 
set_Value (COLUMNNAME_PA_MeasureCalc_ID, Integer.valueOf(PA_MeasureCalc_ID));
}
/** Get Measure Calculation.
@return Calculation method for measuring performance */
public int getPA_MeasureCalc_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_MeasureCalc_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3b4cada6-e04d-ba05-b0b6-c819134a579b")
public static String es_PE_FIELD_Measure_MeasureCalculation_Name="Cálculo de la Medida";

@XendraTrl(Identifier="3b4cada6-e04d-ba05-b0b6-c819134a579b")
public static String es_PE_FIELD_Measure_MeasureCalculation_Description="Método de cálculo para medir el desempeño";

@XendraTrl(Identifier="3b4cada6-e04d-ba05-b0b6-c819134a579b")
public static String es_PE_FIELD_Measure_MeasureCalculation_Help="El Cálculo de la Medida indica el método para medir el desempeño";

@XendraField(AD_Column_ID="PA_MeasureCalc_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8ac9b36b-799c-7af6-ed3f-d8d9d0210239",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@MeasureType@=C",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="3b4cada6-e04d-ba05-b0b6-c819134a579b")
public static final String FIELDNAME_Measure_MeasureCalculation="3b4cada6-e04d-ba05-b0b6-c819134a579b";

@XendraTrl(Identifier="fdd43153-877e-0593-bb74-5290dd954474")
public static String es_PE_COLUMN_PA_MeasureCalc_ID_Name="Cálculo de la Medida";

@XendraColumn(AD_Element_ID="91f987c2-0c7c-5323-1b6a-d43d697ba1b7",ColumnName="PA_MeasureCalc_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fdd43153-877e-0593-bb74-5290dd954474",
Synchronized="2019-08-30 22:23:37.0")
/** Column name PA_MeasureCalc_ID */
public static final String COLUMNNAME_PA_MeasureCalc_ID = "PA_MeasureCalc_ID";
/** Set Measure.
@param PA_Measure_ID Concrete Performance Measurement */
public void setPA_Measure_ID (int PA_Measure_ID)
{
if (PA_Measure_ID < 1) throw new IllegalArgumentException ("PA_Measure_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_PA_Measure_ID, Integer.valueOf(PA_Measure_ID));
}
/** Get Measure.
@return Concrete Performance Measurement */
public int getPA_Measure_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_Measure_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fe62ab06-6b58-29b7-23e6-d466a6220306")
public static String es_PE_FIELD_Measure_Measure_Name="Medida";

@XendraTrl(Identifier="fe62ab06-6b58-29b7-23e6-d466a6220306")
public static String es_PE_FIELD_Measure_Measure_Description="Medida de desempeño concreto";

@XendraTrl(Identifier="fe62ab06-6b58-29b7-23e6-d466a6220306")
public static String es_PE_FIELD_Measure_Measure_Help="La medida identifica un indicador concreto; medible del desempeño. Por Ej. Dólares de venta ó prospectos contactados.";

@XendraField(AD_Column_ID="PA_Measure_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8ac9b36b-799c-7af6-ed3f-d8d9d0210239",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fe62ab06-6b58-29b7-23e6-d466a6220306")
public static final String FIELDNAME_Measure_Measure="fe62ab06-6b58-29b7-23e6-d466a6220306";
/** Column name PA_Measure_ID */
public static final String COLUMNNAME_PA_Measure_ID = "PA_Measure_ID";
/** Set Ratio.
@param PA_Ratio_ID Performace Ratio */
public void setPA_Ratio_ID (int PA_Ratio_ID)
{
if (PA_Ratio_ID <= 0) set_Value (COLUMNNAME_PA_Ratio_ID, null);
 else 
set_Value (COLUMNNAME_PA_Ratio_ID, Integer.valueOf(PA_Ratio_ID));
}
/** Get Ratio.
@return Performace Ratio */
public int getPA_Ratio_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_Ratio_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1914225c-0f18-eea5-e628-a35bb835052d")
public static String es_PE_FIELD_Measure_Ratio_Name="Razón";

@XendraTrl(Identifier="1914225c-0f18-eea5-e628-a35bb835052d")
public static String es_PE_FIELD_Measure_Ratio_Description="Razón de Desempeño";

@XendraTrl(Identifier="1914225c-0f18-eea5-e628-a35bb835052d")
public static String es_PE_FIELD_Measure_Ratio_Help="Ajusta instrucción de cálculo para Razón de Desempeño.";

@XendraField(AD_Column_ID="PA_Ratio_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8ac9b36b-799c-7af6-ed3f-d8d9d0210239",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@MeasureType@=R",DisplayLength=10,IsReadOnly=false,SeqNo=120,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="1914225c-0f18-eea5-e628-a35bb835052d")
public static final String FIELDNAME_Measure_Ratio="1914225c-0f18-eea5-e628-a35bb835052d";

@XendraTrl(Identifier="83411e54-351f-2f0a-deda-c8f84555c737")
public static String es_PE_COLUMN_PA_Ratio_ID_Name="Razón";

@XendraColumn(AD_Element_ID="69ecf648-1f3a-ed9d-5dfc-4444352e595f",ColumnName="PA_Ratio_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="83411e54-351f-2f0a-deda-c8f84555c737",
Synchronized="2019-08-30 22:23:37.0")
/** Column name PA_Ratio_ID */
public static final String COLUMNNAME_PA_Ratio_ID = "PA_Ratio_ID";
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

@XendraTrl(Identifier="4aa704ba-3633-fbe2-3f70-6228c0203371")
public static String es_PE_FIELD_Measure_RequestType_Name="Tipo de Solicitud";

@XendraTrl(Identifier="4aa704ba-3633-fbe2-3f70-6228c0203371")
public static String es_PE_FIELD_Measure_RequestType_Description="Tipo de Solicitud (pregunta; queja).";

@XendraTrl(Identifier="4aa704ba-3633-fbe2-3f70-6228c0203371")
public static String es_PE_FIELD_Measure_RequestType_Help="Tipos de solicitud son usados para procesar y categorizar solicitudes. Ejemplos: consultas de cuentas; garantías; etc.";

@XendraField(AD_Column_ID="R_RequestType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8ac9b36b-799c-7af6-ed3f-d8d9d0210239",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@MeasureType@=Q",DisplayLength=10,IsReadOnly=false,SeqNo=130,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4aa704ba-3633-fbe2-3f70-6228c0203371")
public static final String FIELDNAME_Measure_RequestType="4aa704ba-3633-fbe2-3f70-6228c0203371";

@XendraTrl(Identifier="89ee3c2e-40a3-4ac5-56b6-51d86a298750")
public static String es_PE_COLUMN_R_RequestType_ID_Name="Tipo de Solicitud";

@XendraColumn(AD_Element_ID="5d38239d-4d14-9ae8-35a8-4f92ae90ab59",ColumnName="R_RequestType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="89ee3c2e-40a3-4ac5-56b6-51d86a298750",
Synchronized="2019-08-30 22:23:37.0")
/** Column name R_RequestType_ID */
public static final String COLUMNNAME_R_RequestType_ID = "R_RequestType_ID";
}
