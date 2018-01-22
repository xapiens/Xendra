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
/** Generated Model for AD_LabelPrinterFunction
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_LabelPrinterFunction extends PO
{
/** Standard Constructor
@param ctx context
@param AD_LabelPrinterFunction_ID id
@param trxName transaction
*/
public X_AD_LabelPrinterFunction (Properties ctx, int AD_LabelPrinterFunction_ID, String trxName)
{
super (ctx, AD_LabelPrinterFunction_ID, trxName);
/** if (AD_LabelPrinterFunction_ID == 0)
{
setAD_LabelPrinterFunction_ID (0);
setAD_LabelPrinter_ID (0);
setIsXYPosition (false);	
// N
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_LabelPrinterFunction (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=624 */
public static int Table_ID=MTable.getTable_ID("AD_LabelPrinterFunction");

@XendraTrl(Identifier="90df1312-f21b-0ce6-9e6f-af123bdec8d8")
public static String es_PE_TAB_Function_Description="función de la impresora de la etiqueta.";

@XendraTrl(Identifier="90df1312-f21b-0ce6-9e6f-af123bdec8d8")
public static String es_PE_TAB_Function_Name="Función";
@XendraTab(Name="Function",
Description="Label Printer Function",Help="",AD_Window_ID="9965113b-8089-e90d-fddc-48811f50a74b",
SeqNo=20,TabLevel=1,IsSingleRow=true,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="",HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="90df1312-f21b-0ce6-9e6f-af123bdec8d8",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Function="90df1312-f21b-0ce6-9e6f-af123bdec8d8";

@XendraTrl(Identifier="729fde06-9d0e-e3ca-6711-671d2b19aec6")
public static String es_PE_TABLE_AD_LabelPrinterFunction_Name="Función de la Impresión de Etiqueta";


@XendraTable(Name="Label printer Function",Description="Function of Label Printer",Help="",
TableName="AD_LabelPrinterFunction",AccessLevel="6",
AD_Window_ID="9965113b-8089-e90d-fddc-48811f50a74b",AD_Val_Rule_ID="",IsKey=1,LoadSeq=135,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.dictionary",Identifier="729fde06-9d0e-e3ca-6711-671d2b19aec6",
Synchronized="2017-08-16 11:40:25.0")
/** TableName=AD_LabelPrinterFunction */
public static final String Table_Name="AD_LabelPrinterFunction";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_LabelPrinterFunction");

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
    Table_ID = MTable.getTable_ID("AD_LabelPrinterFunction");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_LabelPrinterFunction[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Label printer Function.
@param AD_LabelPrinterFunction_ID Function of Label Printer */
public void setAD_LabelPrinterFunction_ID (int AD_LabelPrinterFunction_ID)
{
if (AD_LabelPrinterFunction_ID < 1) throw new IllegalArgumentException ("AD_LabelPrinterFunction_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_LabelPrinterFunction_ID, Integer.valueOf(AD_LabelPrinterFunction_ID));
}
/** Get Label printer Function.
@return Function of Label Printer */
public int getAD_LabelPrinterFunction_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_LabelPrinterFunction_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4fcdb334-8875-a076-90ff-28d2f3930685")
public static String es_PE_FIELD_Function_LabelPrinterFunction_Description="Función de la impresión de etiqueta";

@XendraTrl(Identifier="4fcdb334-8875-a076-90ff-28d2f3930685")
public static String es_PE_FIELD_Function_LabelPrinterFunction_Name="Función de la Impresión de Etiqueta";

@XendraField(AD_Column_ID="AD_LabelPrinterFunction_ID",IsCentrallyMaintained=true,
AD_Tab_ID="90df1312-f21b-0ce6-9e6f-af123bdec8d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4fcdb334-8875-a076-90ff-28d2f3930685")
public static final String FIELDNAME_Function_LabelPrinterFunction="4fcdb334-8875-a076-90ff-28d2f3930685";
/** Column name AD_LabelPrinterFunction_ID */
public static final String COLUMNNAME_AD_LabelPrinterFunction_ID = "AD_LabelPrinterFunction_ID";
/** Set Label printer.
@param AD_LabelPrinter_ID Label Printer Definition */
public void setAD_LabelPrinter_ID (int AD_LabelPrinter_ID)
{
if (AD_LabelPrinter_ID < 1) throw new IllegalArgumentException ("AD_LabelPrinter_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_LabelPrinter_ID, Integer.valueOf(AD_LabelPrinter_ID));
}
/** Get Label printer.
@return Label Printer Definition */
public int getAD_LabelPrinter_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_LabelPrinter_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1422a913-9888-57d9-a38f-b702ab7071e2")
public static String es_PE_FIELD_Function_LabelPrinter_Description="Definición de la impresión de la etiqueta";

@XendraTrl(Identifier="1422a913-9888-57d9-a38f-b702ab7071e2")
public static String es_PE_FIELD_Function_LabelPrinter_Name="Impresión de Etiqueta";

@XendraField(AD_Column_ID="AD_LabelPrinter_ID",IsCentrallyMaintained=true,
AD_Tab_ID="90df1312-f21b-0ce6-9e6f-af123bdec8d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1422a913-9888-57d9-a38f-b702ab7071e2")
public static final String FIELDNAME_Function_LabelPrinter="1422a913-9888-57d9-a38f-b702ab7071e2";

@XendraTrl(Identifier="cc8dd3ce-8b19-c5bd-b555-e86cf5173bf1")
public static String es_PE_COLUMN_AD_LabelPrinter_ID_Name="Impresión de Etiqueta";

@XendraColumn(AD_Element_ID="5f02d45a-9966-d879-3ceb-09c4575649c5",ColumnName="AD_LabelPrinter_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cc8dd3ce-8b19-c5bd-b555-e86cf5173bf1",
Synchronized="2017-08-05 16:52:35.0")
/** Column name AD_LabelPrinter_ID */
public static final String COLUMNNAME_AD_LabelPrinter_ID = "AD_LabelPrinter_ID";
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

@XendraTrl(Identifier="652d49e2-298f-ffbd-1aca-c05a422c9552")
public static String es_PE_FIELD_Function_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="652d49e2-298f-ffbd-1aca-c05a422c9552")
public static String es_PE_FIELD_Function_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="652d49e2-298f-ffbd-1aca-c05a422c9552")
public static String es_PE_FIELD_Function_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="90df1312-f21b-0ce6-9e6f-af123bdec8d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="652d49e2-298f-ffbd-1aca-c05a422c9552")
public static final String FIELDNAME_Function_Description="652d49e2-298f-ffbd-1aca-c05a422c9552";

@XendraTrl(Identifier="cfbe1da5-2a49-6bd7-3cf1-a27dd2bef37c")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cfbe1da5-2a49-6bd7-3cf1-a27dd2bef37c",
Synchronized="2017-08-05 16:52:35.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Function Prefix.
@param FunctionPrefix Data sent before the function */
public void setFunctionPrefix (String FunctionPrefix)
{
if (FunctionPrefix != null && FunctionPrefix.length() > 40)
{
log.warning("Length > 40 - truncated");
FunctionPrefix = FunctionPrefix.substring(0,39);
}
set_Value (COLUMNNAME_FunctionPrefix, FunctionPrefix);
}
/** Get Function Prefix.
@return Data sent before the function */
public String getFunctionPrefix() 
{
String value = (String)get_Value(COLUMNNAME_FunctionPrefix);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c2c48ec7-7924-3ab3-1868-3575a230aa8a")
public static String es_PE_FIELD_Function_FunctionPrefix_Name="Función Prefijo";

@XendraField(AD_Column_ID="FunctionPrefix",IsCentrallyMaintained=true,
AD_Tab_ID="90df1312-f21b-0ce6-9e6f-af123bdec8d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c2c48ec7-7924-3ab3-1868-3575a230aa8a")
public static final String FIELDNAME_Function_FunctionPrefix="c2c48ec7-7924-3ab3-1868-3575a230aa8a";

@XendraTrl(Identifier="16906545-b313-91b5-8211-996077290ca0")
public static String es_PE_COLUMN_FunctionPrefix_Name="Función Prefijo";

@XendraColumn(AD_Element_ID="af9c32d5-8f5c-e1d2-5b4f-5601a23d2914",ColumnName="FunctionPrefix",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="16906545-b313-91b5-8211-996077290ca0",
Synchronized="2017-08-05 16:52:35.0")
/** Column name FunctionPrefix */
public static final String COLUMNNAME_FunctionPrefix = "FunctionPrefix";
/** Set Function Suffix.
@param FunctionSuffix Data sent after the function */
public void setFunctionSuffix (String FunctionSuffix)
{
if (FunctionSuffix != null && FunctionSuffix.length() > 40)
{
log.warning("Length > 40 - truncated");
FunctionSuffix = FunctionSuffix.substring(0,39);
}
set_Value (COLUMNNAME_FunctionSuffix, FunctionSuffix);
}
/** Get Function Suffix.
@return Data sent after the function */
public String getFunctionSuffix() 
{
String value = (String)get_Value(COLUMNNAME_FunctionSuffix);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="b4a4ed34-ebfc-0775-ce42-1020af303a54")
public static String es_PE_FIELD_Function_FunctionSuffix_Description="Datos enviados despues de la función";

@XendraTrl(Identifier="b4a4ed34-ebfc-0775-ce42-1020af303a54")
public static String es_PE_FIELD_Function_FunctionSuffix_Name="Función Sufijo";

@XendraField(AD_Column_ID="FunctionSuffix",IsCentrallyMaintained=true,
AD_Tab_ID="90df1312-f21b-0ce6-9e6f-af123bdec8d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b4a4ed34-ebfc-0775-ce42-1020af303a54")
public static final String FIELDNAME_Function_FunctionSuffix="b4a4ed34-ebfc-0775-ce42-1020af303a54";

@XendraTrl(Identifier="65bdaf34-73f7-94f0-2437-a656856adedd")
public static String es_PE_COLUMN_FunctionSuffix_Name="Función Sufijo";

@XendraColumn(AD_Element_ID="fe17e63a-024e-4b4b-3f18-0bcd2eac0764",ColumnName="FunctionSuffix",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="65bdaf34-73f7-94f0-2437-a656856adedd",
Synchronized="2017-08-05 16:52:35.0")
/** Column name FunctionSuffix */
public static final String COLUMNNAME_FunctionSuffix = "FunctionSuffix";
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
@XendraTrl(Identifier="667d10e1-a017-4a06-bcc8-527c819d7d7d")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="667d10e1-a017-4a06-bcc8-527c819d7d7d",
Synchronized="2017-08-05 16:52:35.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set XY Position.
@param IsXYPosition The Function is XY position */
public void setIsXYPosition (boolean IsXYPosition)
{
set_Value (COLUMNNAME_IsXYPosition, Boolean.valueOf(IsXYPosition));
}
/** Get XY Position.
@return The Function is XY position */
public boolean isXYPosition() 
{
Object oo = get_Value(COLUMNNAME_IsXYPosition);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="00c75785-455e-4ef8-3158-29e617adcf14")
public static String es_PE_FIELD_Function_XYPosition_Description="La función es XY posición.";

@XendraTrl(Identifier="00c75785-455e-4ef8-3158-29e617adcf14")
public static String es_PE_FIELD_Function_XYPosition_Help="Posiciones de esta función para la operación de impresión siguiente.";

@XendraTrl(Identifier="00c75785-455e-4ef8-3158-29e617adcf14")
public static String es_PE_FIELD_Function_XYPosition_Name="Posición XY";

@XendraField(AD_Column_ID="IsXYPosition",IsCentrallyMaintained=true,
AD_Tab_ID="90df1312-f21b-0ce6-9e6f-af123bdec8d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="00c75785-455e-4ef8-3158-29e617adcf14")
public static final String FIELDNAME_Function_XYPosition="00c75785-455e-4ef8-3158-29e617adcf14";

@XendraTrl(Identifier="10dfe2d2-d5a7-b362-c5c2-cf6c946923e8")
public static String es_PE_COLUMN_IsXYPosition_Name="Posición XY";

@XendraColumn(AD_Element_ID="7d378998-d75d-4a06-c121-96579ad728dd",ColumnName="IsXYPosition",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="10dfe2d2-d5a7-b362-c5c2-cf6c946923e8",
Synchronized="2017-08-05 16:52:35.0")
/** Column name IsXYPosition */
public static final String COLUMNNAME_IsXYPosition = "IsXYPosition";
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

@XendraTrl(Identifier="be789571-b05a-a283-bebc-79f68b6f7888")
public static String es_PE_FIELD_Function_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="be789571-b05a-a283-bebc-79f68b6f7888")
public static String es_PE_FIELD_Function_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="be789571-b05a-a283-bebc-79f68b6f7888")
public static String es_PE_FIELD_Function_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="90df1312-f21b-0ce6-9e6f-af123bdec8d8",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="be789571-b05a-a283-bebc-79f68b6f7888")
public static final String FIELDNAME_Function_Name="be789571-b05a-a283-bebc-79f68b6f7888";

@XendraTrl(Identifier="a8bc23c8-0410-86b2-8a98-423dde9a54bd")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a8bc23c8-0410-86b2-8a98-423dde9a54bd",
Synchronized="2017-08-05 16:52:35.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set XY Separator.
@param XYSeparator The separator between the X and Y function. */
public void setXYSeparator (String XYSeparator)
{
if (XYSeparator != null && XYSeparator.length() > 20)
{
log.warning("Length > 20 - truncated");
XYSeparator = XYSeparator.substring(0,19);
}
set_Value (COLUMNNAME_XYSeparator, XYSeparator);
}
/** Get XY Separator.
@return The separator between the X and Y function. */
public String getXYSeparator() 
{
String value = (String)get_Value(COLUMNNAME_XYSeparator);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ef0dcaa5-2781-e4da-7b16-ee08e98e7771")
public static String es_PE_FIELD_Function_XYSeparator_Description="El separador entre la función X y Y.";

@XendraTrl(Identifier="ef0dcaa5-2781-e4da-7b16-ee08e98e7771")
public static String es_PE_FIELD_Function_XYSeparator_Name="Separador XY";

@XendraField(AD_Column_ID="XYSeparator",IsCentrallyMaintained=true,
AD_Tab_ID="90df1312-f21b-0ce6-9e6f-af123bdec8d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsXYPosition@=Y",DisplayLength=20,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="ef0dcaa5-2781-e4da-7b16-ee08e98e7771")
public static final String FIELDNAME_Function_XYSeparator="ef0dcaa5-2781-e4da-7b16-ee08e98e7771";

@XendraTrl(Identifier="ed0d4a91-69bc-0d3e-f140-757f0a41da35")
public static String es_PE_COLUMN_XYSeparator_Name="Separador XY";

@XendraColumn(AD_Element_ID="a1fad290-857d-4606-f7f1-1a44963851bd",ColumnName="XYSeparator",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ed0d4a91-69bc-0d3e-f140-757f0a41da35",
Synchronized="2017-08-05 16:52:35.0")
/** Column name XYSeparator */
public static final String COLUMNNAME_XYSeparator = "XYSeparator";
}
