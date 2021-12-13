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
/** Generated Model for AD_Process_Para
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Process_Para extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Process_Para_ID id
@param trxName transaction
*/
public X_AD_Process_Para (Properties ctx, int AD_Process_Para_ID, String trxName)
{
super (ctx, AD_Process_Para_ID, trxName);
/** if (AD_Process_Para_ID == 0)
{
setAD_Process_ID (0);
setAD_Process_Para_ID (0);
setAD_Reference_ID (0);
setColumnName (null);
setEntityType (null);	
// U
setFieldLength (0);
setIsCentrallyMaintained (true);	
// Y
setIsMandatory (false);	
// N
setIsRange (false);	
// N
setName (null);
setSeqNo (0);	
// @SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM AD_Process_Para WHERE AD_Process_ID=@AD_Process_ID@
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Process_Para (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=285 */
public static int Table_ID=MTable.getTable_ID("AD_Process_Para");

@XendraTrl(Identifier="dad31749-11a8-523f-e1a6-70422528ba7c")
public static String es_PE_TAB_Parameter_Description="Parámetro del Informe";

@XendraTrl(Identifier="dad31749-11a8-523f-e1a6-70422528ba7c")
public static String es_PE_TAB_Parameter_Help="La pestaña de Parámetro de Informe define los parámetros requeridos para ejecutar un Informe ó proceso.";

@XendraTrl(Identifier="dad31749-11a8-523f-e1a6-70422528ba7c")
public static String es_PE_TAB_Parameter_Name="Parámetro";
@XendraTab(Name="Parameter",
Description="Report Parameter",
Help="The Report Parameter Tab defines any parameters required to execute a report or process.",
AD_Window_ID="7bc9e03b-e56c-36fe-34ff-ea412ab43089",SeqNo=40,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="dad31749-11a8-523f-e1a6-70422528ba7c",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Parameter="dad31749-11a8-523f-e1a6-70422528ba7c";

@XendraTrl(Identifier="24e1e5c0-0174-2bc6-8007-a48dd56536fe")
public static String es_PE_TABLE_AD_Process_Para_Name="Parámetro de Procesos";

@XendraTable(Name="Process Parameter",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="AD_Process_Para",AccessLevel="4",AD_Window_ID="7bc9e03b-e56c-36fe-34ff-ea412ab43089",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="24e1e5c0-0174-2bc6-8007-a48dd56536fe",Synchronized="2020-03-03 21:35:49.0")
/** TableName=AD_Process_Para */
public static final String Table_Name="AD_Process_Para";


@XendraIndex(Name="ad_process_para_process",Identifier="b5e6ffe6-a296-492c-179e-0ef5bdb94fa4",
Column_Names="ad_process_id",IsUnique="false",
TableIdentifier="b5e6ffe6-a296-492c-179e-0ef5bdb94fa4",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_process_para_process = "b5e6ffe6-a296-492c-179e-0ef5bdb94fa4";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Process_Para");

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
    Table_ID = MTable.getTable_ID("AD_Process_Para");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Process_Para[").append(get_ID()).append("]");
return sb.toString();
}
/** Set System Element.
@param AD_Element_ID System Element enables the central maintenance of column DESCRIPTION and HELP. */
public void setAD_Element_ID (int AD_Element_ID)
{
if (AD_Element_ID <= 0) set_Value (COLUMNNAME_AD_Element_ID, null);
 else 
set_Value (COLUMNNAME_AD_Element_ID, Integer.valueOf(AD_Element_ID));
}
/** Get System Element.
@return System Element enables the central maintenance of column DESCRIPTION and HELP. */
public int getAD_Element_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Element_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="18af5a8f-eea9-1250-fbb2-877973a776f0")
public static String es_PE_FIELD_Parameter_SystemElement_Name="Elemento";

@XendraTrl(Identifier="18af5a8f-eea9-1250-fbb2-877973a776f0")
public static String es_PE_FIELD_Parameter_SystemElement_Description="El elemento del sistema permite el mantenimiento central de la descripción y ayuda de la columna";

@XendraTrl(Identifier="18af5a8f-eea9-1250-fbb2-877973a776f0")
public static String es_PE_FIELD_Parameter_SystemElement_Help="El elemento sistema permite el mantenimiento central de la ayuda descripciones y terminología para una columna base de datos.";

@XendraField(AD_Column_ID="AD_Element_ID",IsCentrallyMaintained=true,
AD_Tab_ID="dad31749-11a8-523f-e1a6-70422528ba7c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="18af5a8f-eea9-1250-fbb2-877973a776f0")
public static final String FIELDNAME_Parameter_SystemElement="18af5a8f-eea9-1250-fbb2-877973a776f0";

@XendraTrl(Identifier="c391bd5e-929e-e35a-3343-e7c24875c279")
public static String es_PE_COLUMN_AD_Element_ID_Name="Elemento";

@XendraColumn(AD_Element_ID="ca8e78b4-089d-16d4-cff1-575a3558c7bc",ColumnName="AD_Element_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c391bd5e-929e-e35a-3343-e7c24875c279",
Synchronized="2019-08-30 22:20:36.0")
/** Column name AD_Element_ID */
public static final String COLUMNNAME_AD_Element_ID = "AD_Element_ID";
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

@XendraTrl(Identifier="b2b912af-ca8b-05b4-01bb-7a69080a5729")
public static String es_PE_FIELD_Parameter_Process_Name="Proceso";

@XendraTrl(Identifier="b2b912af-ca8b-05b4-01bb-7a69080a5729")
public static String es_PE_FIELD_Parameter_Process_Description="Proceso ó Informe";

@XendraTrl(Identifier="b2b912af-ca8b-05b4-01bb-7a69080a5729")
public static String es_PE_FIELD_Parameter_Process_Help="El campo proceso identifica un proceso ó Informe único en el sistema.";

@XendraField(AD_Column_ID="AD_Process_ID",IsCentrallyMaintained=true,
AD_Tab_ID="dad31749-11a8-523f-e1a6-70422528ba7c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b2b912af-ca8b-05b4-01bb-7a69080a5729")
public static final String FIELDNAME_Parameter_Process="b2b912af-ca8b-05b4-01bb-7a69080a5729";

@XendraTrl(Identifier="9a953eaf-c9e5-fa03-88dd-e4781c2852f2")
public static String es_PE_COLUMN_AD_Process_ID_Name="Proceso";

@XendraColumn(AD_Element_ID="60982cc9-e937-d374-4608-1c3f64b16d3b",ColumnName="AD_Process_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9a953eaf-c9e5-fa03-88dd-e4781c2852f2",
Synchronized="2019-08-30 22:20:36.0")
/** Column name AD_Process_ID */
public static final String COLUMNNAME_AD_Process_ID = "AD_Process_ID";
/** Set Process Parameter.
@param AD_Process_Para_ID Process Parameter */
public void setAD_Process_Para_ID (int AD_Process_Para_ID)
{
if (AD_Process_Para_ID < 1) throw new IllegalArgumentException ("AD_Process_Para_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Process_Para_ID, Integer.valueOf(AD_Process_Para_ID));
}
/** Get Process Parameter.
@return Process Parameter */
public int getAD_Process_Para_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Process_Para_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="de7ad87e-a2fc-d698-be68-5ac97d1396e9")
public static String es_PE_FIELD_Parameter_ProcessParameter_Name="Parámetro de Procesos";

@XendraField(AD_Column_ID="AD_Process_Para_ID",IsCentrallyMaintained=true,
AD_Tab_ID="dad31749-11a8-523f-e1a6-70422528ba7c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="de7ad87e-a2fc-d698-be68-5ac97d1396e9")
public static final String FIELDNAME_Parameter_ProcessParameter="de7ad87e-a2fc-d698-be68-5ac97d1396e9";
/** Column name AD_Process_Para_ID */
public static final String COLUMNNAME_AD_Process_Para_ID = "AD_Process_Para_ID";
/** Set Reference.
@param AD_Reference_ID System Reference and Validation */
public void setAD_Reference_ID (int AD_Reference_ID)
{
if (AD_Reference_ID < 1) throw new IllegalArgumentException ("AD_Reference_ID is mandatory.");
set_Value (COLUMNNAME_AD_Reference_ID, Integer.valueOf(AD_Reference_ID));
}
/** Get Reference.
@return System Reference and Validation */
public int getAD_Reference_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Reference_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="183fc4e2-e91a-0164-f95f-74435b966d7b")
public static String es_PE_FIELD_Parameter_Reference_Name="Referencia";

@XendraTrl(Identifier="183fc4e2-e91a-0164-f95f-74435b966d7b")
public static String es_PE_FIELD_Parameter_Reference_Description="Referencia del Sistema (Lista de Selección)";

@XendraTrl(Identifier="183fc4e2-e91a-0164-f95f-74435b966d7b")
public static String es_PE_FIELD_Parameter_Reference_Help="La Referencia indica el tipo de campo de referencia";

@XendraField(AD_Column_ID="AD_Reference_ID",IsCentrallyMaintained=true,
AD_Tab_ID="dad31749-11a8-523f-e1a6-70422528ba7c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="183fc4e2-e91a-0164-f95f-74435b966d7b")
public static final String FIELDNAME_Parameter_Reference="183fc4e2-e91a-0164-f95f-74435b966d7b";

@XendraTrl(Identifier="237b7fe7-b1bd-e644-aa21-7eb419114399")
public static String es_PE_COLUMN_AD_Reference_ID_Name="Referencia";

@XendraColumn(AD_Element_ID="bf1912e9-a75f-4e1b-99b4-d04633e7777b",ColumnName="AD_Reference_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="17ec718c-707b-498f-3a6c-e81d1630e510",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="237b7fe7-b1bd-e644-aa21-7eb419114399",Synchronized="2019-08-30 22:20:36.0")
/** Column name AD_Reference_ID */
public static final String COLUMNNAME_AD_Reference_ID = "AD_Reference_ID";
/** Set Reference Key.
@param AD_Reference_Value_ID Required to specify, if data type is Table or List */
public void setAD_Reference_Value_ID (int AD_Reference_Value_ID)
{
if (AD_Reference_Value_ID <= 0) set_Value (COLUMNNAME_AD_Reference_Value_ID, null);
 else 
set_Value (COLUMNNAME_AD_Reference_Value_ID, Integer.valueOf(AD_Reference_Value_ID));
}
/** Get Reference Key.
@return Required to specify, if data type is Table or List */
public int getAD_Reference_Value_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Reference_Value_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="01d17198-a26b-1b81-c906-9c13dc637768")
public static String es_PE_FIELD_Parameter_ReferenceKey_Name="Valor de Referencia";

@XendraTrl(Identifier="01d17198-a26b-1b81-c906-9c13dc637768")
public static String es_PE_FIELD_Parameter_ReferenceKey_Description="Requerido para especificar; si el tipo de datos es tabla ó lista.";

@XendraTrl(Identifier="01d17198-a26b-1b81-c906-9c13dc637768")
public static String es_PE_FIELD_Parameter_ReferenceKey_Help="El valor referencia indica dónde los valores referencia son almacenados. Debe especificarce si el tipo de datos es tabla ó lista.";

@XendraField(AD_Column_ID="AD_Reference_Value_ID",IsCentrallyMaintained=true,
AD_Tab_ID="dad31749-11a8-523f-e1a6-70422528ba7c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="01d17198-a26b-1b81-c906-9c13dc637768")
public static final String FIELDNAME_Parameter_ReferenceKey="01d17198-a26b-1b81-c906-9c13dc637768";

@XendraTrl(Identifier="0e3f381d-1adc-bc9a-3236-e74a2073ee67")
public static String es_PE_COLUMN_AD_Reference_Value_ID_Name="Valor de Referencia";

@XendraColumn(AD_Element_ID="1ce26254-3c83-8d1d-3506-37160c076aad",
ColumnName="AD_Reference_Value_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="12253474-e61c-58a4-3fd3-2c2ccf236272",
AD_Val_Rule_ID="147ddeef-c150-2ac8-67e8-346cc5225ef4",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0e3f381d-1adc-bc9a-3236-e74a2073ee67",
Synchronized="2019-08-30 22:20:36.0")
/** Column name AD_Reference_Value_ID */
public static final String COLUMNNAME_AD_Reference_Value_ID = "AD_Reference_Value_ID";
/** Set Dynamic Validation.
@param AD_Val_Rule_ID Dynamic Validation Rule */
public void setAD_Val_Rule_ID (int AD_Val_Rule_ID)
{
if (AD_Val_Rule_ID <= 0) set_Value (COLUMNNAME_AD_Val_Rule_ID, null);
 else 
set_Value (COLUMNNAME_AD_Val_Rule_ID, Integer.valueOf(AD_Val_Rule_ID));
}
/** Get Dynamic Validation.
@return Dynamic Validation Rule */
public int getAD_Val_Rule_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Val_Rule_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="72406da6-99c8-ac8a-de75-fc6ab34cecbd")
public static String es_PE_FIELD_Parameter_DynamicValidation_Name="Validación";

@XendraTrl(Identifier="72406da6-99c8-ac8a-de75-fc6ab34cecbd")
public static String es_PE_FIELD_Parameter_DynamicValidation_Description="Regla de validación";

@XendraTrl(Identifier="72406da6-99c8-ac8a-de75-fc6ab34cecbd")
public static String es_PE_FIELD_Parameter_DynamicValidation_Help="La Regla de validación indica una regla de validación única en el sistema. Esas reglas definen como una entidad se determina como válida ó inválida.";

@XendraField(AD_Column_ID="AD_Val_Rule_ID",IsCentrallyMaintained=true,
AD_Tab_ID="dad31749-11a8-523f-e1a6-70422528ba7c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="72406da6-99c8-ac8a-de75-fc6ab34cecbd")
public static final String FIELDNAME_Parameter_DynamicValidation="72406da6-99c8-ac8a-de75-fc6ab34cecbd";

@XendraTrl(Identifier="25b654dc-fae5-ac57-b974-4b58c2f95767")
public static String es_PE_COLUMN_AD_Val_Rule_ID_Name="Validación";

@XendraColumn(AD_Element_ID="c0a45383-82fd-7e33-a355-80b15115b36b",ColumnName="AD_Val_Rule_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="25b654dc-fae5-ac57-b974-4b58c2f95767",
Synchronized="2019-08-30 22:20:36.0")
/** Column name AD_Val_Rule_ID */
public static final String COLUMNNAME_AD_Val_Rule_ID = "AD_Val_Rule_ID";
/** Set DB Column Name.
@param ColumnName Name of the column in the database */
public void setColumnName (String ColumnName)
{
if (ColumnName == null) throw new IllegalArgumentException ("ColumnName is mandatory.");
if (ColumnName.length() > 40)
{
log.warning("Length > 40 - truncated");
ColumnName = ColumnName.substring(0,39);
}
set_Value (COLUMNNAME_ColumnName, ColumnName);
}
/** Get DB Column Name.
@return Name of the column in the database */
public String getColumnName() 
{
String value = (String)get_Value(COLUMNNAME_ColumnName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="14e1df78-768e-c6c9-0b53-9ccaa06627c0")
public static String es_PE_FIELD_Parameter_DBColumnName_Name="Nombre de Columna en BD";

@XendraTrl(Identifier="14e1df78-768e-c6c9-0b53-9ccaa06627c0")
public static String es_PE_FIELD_Parameter_DBColumnName_Description="Nombre de la columna en la base de datos";

@XendraTrl(Identifier="14e1df78-768e-c6c9-0b53-9ccaa06627c0")
public static String es_PE_FIELD_Parameter_DBColumnName_Help="Indica el nombre de una columna en una tabla como se definió en la base de datos.";

@XendraField(AD_Column_ID="ColumnName",IsCentrallyMaintained=true,
AD_Tab_ID="dad31749-11a8-523f-e1a6-70422528ba7c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="14e1df78-768e-c6c9-0b53-9ccaa06627c0")
public static final String FIELDNAME_Parameter_DBColumnName="14e1df78-768e-c6c9-0b53-9ccaa06627c0";

@XendraTrl(Identifier="125ab14a-22e2-4182-83d0-d7b8c08a25dc")
public static String es_PE_COLUMN_ColumnName_Name="Nombre de Columna en BD";

@XendraColumn(AD_Element_ID="fadc32aa-cd31-3fee-f9b7-0daa53df76a7",ColumnName="ColumnName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="125ab14a-22e2-4182-83d0-d7b8c08a25dc",
Synchronized="2019-08-30 22:20:36.0")
/** Column name ColumnName */
public static final String COLUMNNAME_ColumnName = "ColumnName";
/** Set Default Logic.
@param DefaultValue Default value hierarchy, separated by : */
public void setDefaultValue (String DefaultValue)
{
if (DefaultValue != null && DefaultValue.length() > 2000)
{
log.warning("Length > 2000 - truncated");
DefaultValue = DefaultValue.substring(0,1999);
}
set_Value (COLUMNNAME_DefaultValue, DefaultValue);
}
/** Get Default Logic.
@return Default value hierarchy, separated by : */
public String getDefaultValue() 
{
String value = (String)get_Value(COLUMNNAME_DefaultValue);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="1d605a40-22c7-8294-6bfa-87c301242ad5")
public static String es_PE_FIELD_Parameter_DefaultLogic_Name="Lógica Predeterminada";

@XendraTrl(Identifier="1d605a40-22c7-8294-6bfa-87c301242ad5")
public static String es_PE_FIELD_Parameter_DefaultLogic_Description="Jerarquía de valores predeterminados; separados por ;";

@XendraTrl(Identifier="1d605a40-22c7-8294-6bfa-87c301242ad5")
public static String es_PE_FIELD_Parameter_DefaultLogic_Help="Los valores predeterminados son evaluados en el orden de la definición; el primer valor no nulo de la columna  llega a ser el valor predeterminado. Los valores son separados por coma ó punto y coma.";

@XendraField(AD_Column_ID="DefaultValue",IsCentrallyMaintained=true,
AD_Tab_ID="dad31749-11a8-523f-e1a6-70422528ba7c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1d605a40-22c7-8294-6bfa-87c301242ad5")
public static final String FIELDNAME_Parameter_DefaultLogic="1d605a40-22c7-8294-6bfa-87c301242ad5";

@XendraTrl(Identifier="fd458c59-1b2e-03ed-3a5e-d1c1d0c14491")
public static String es_PE_COLUMN_DefaultValue_Name="Lógica Predeterminada";

@XendraColumn(AD_Element_ID="85c6e06b-cd4c-c419-f8e4-9e93236b9219",ColumnName="DefaultValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fd458c59-1b2e-03ed-3a5e-d1c1d0c14491",
Synchronized="2019-08-30 22:20:36.0")
/** Column name DefaultValue */
public static final String COLUMNNAME_DefaultValue = "DefaultValue";
/** Set Default Logic 2.
@param DefaultValue2 Default value hierarchy, separated by : */
public void setDefaultValue2 (String DefaultValue2)
{
if (DefaultValue2 != null && DefaultValue2.length() > 2000)
{
log.warning("Length > 2000 - truncated");
DefaultValue2 = DefaultValue2.substring(0,1999);
}
set_Value (COLUMNNAME_DefaultValue2, DefaultValue2);
}
/** Get Default Logic 2.
@return Default value hierarchy, separated by : */
public String getDefaultValue2() 
{
String value = (String)get_Value(COLUMNNAME_DefaultValue2);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="9c22f907-7da1-309d-8c82-67fc117badd2")
public static String es_PE_FIELD_Parameter_DefaultLogic22_Name="Predeterminado Lógico 2";

@XendraTrl(Identifier="9c22f907-7da1-309d-8c82-67fc117badd2")
public static String es_PE_FIELD_Parameter_DefaultLogic22_Description="Jerarquía de valores predeterminados; separados por ;";

@XendraTrl(Identifier="9c22f907-7da1-309d-8c82-67fc117badd2")
public static String es_PE_FIELD_Parameter_DefaultLogic22_Help="Los valores predeterminados son evaluados en el orden de definición ; el primer valor no nulo llega a ser el valor predeterminado de la columna. Los valores son separados por coma o punto y coma. a) Literales:";

@XendraField(AD_Column_ID="DefaultValue2",IsCentrallyMaintained=true,
AD_Tab_ID="dad31749-11a8-523f-e1a6-70422528ba7c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsRange@=Y",DisplayLength=26,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9c22f907-7da1-309d-8c82-67fc117badd2")
public static final String FIELDNAME_Parameter_DefaultLogic22="9c22f907-7da1-309d-8c82-67fc117badd2";

@XendraTrl(Identifier="25f5c9de-1bad-2fa7-f2c4-4606ff37c450")
public static String es_PE_COLUMN_DefaultValue2_Name="Predeterminado Lógico 2";

@XendraColumn(AD_Element_ID="2d3beeef-3de4-778b-6738-3c71800daa0d",ColumnName="DefaultValue2",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="25f5c9de-1bad-2fa7-f2c4-4606ff37c450",
Synchronized="2019-08-30 22:20:36.0")
/** Column name DefaultValue2 */
public static final String COLUMNNAME_DefaultValue2 = "DefaultValue2";
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

@XendraTrl(Identifier="c326b39e-5270-2666-d642-707fad607d5a")
public static String es_PE_FIELD_Parameter_Description_Name="Observación";

@XendraTrl(Identifier="c326b39e-5270-2666-d642-707fad607d5a")
public static String es_PE_FIELD_Parameter_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="c326b39e-5270-2666-d642-707fad607d5a")
public static String es_PE_FIELD_Parameter_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="dad31749-11a8-523f-e1a6-70422528ba7c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c326b39e-5270-2666-d642-707fad607d5a")
public static final String FIELDNAME_Parameter_Description="c326b39e-5270-2666-d642-707fad607d5a";

@XendraTrl(Identifier="5ee52648-8efc-a6d0-0e58-8bcb1abf0d9c")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5ee52648-8efc-a6d0-0e58-8bcb1abf0d9c",
Synchronized="2019-08-30 22:20:36.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Display Logic.
@param DisplayLogic If the Field is displayed, the result determines if the field is actually displayed */
public void setDisplayLogic (String DisplayLogic)
{
set_Value (COLUMNNAME_DisplayLogic, DisplayLogic);
}
/** Get Display Logic.
@return If the Field is displayed, the result determines if the field is actually displayed */
public String getDisplayLogic() 
{
String value = (String)get_Value(COLUMNNAME_DisplayLogic);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c5ca3133-c49d-927e-c408-3d339f42bb61")
public static String es_PE_COLUMN_DisplayLogic_Name="Display Logic";

@XendraColumn(AD_Element_ID="fcb60996-c818-2f09-e6c4-b7544353cf56",ColumnName="DisplayLogic",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c5ca3133-c49d-927e-c408-3d339f42bb61",
Synchronized="2019-08-30 22:20:36.0")
/** Column name DisplayLogic */
public static final String COLUMNNAME_DisplayLogic = "DisplayLogic";
/** Set Entity Type.
@param EntityType Dictionary Entity Type: Determines ownership and synchronization */
public void setEntityType (String EntityType)
{
if (EntityType.length() > 4)
{
log.warning("Length > 4 - truncated");
EntityType = EntityType.substring(0,3);
}
set_Value (COLUMNNAME_EntityType, EntityType);
}
/** Get Entity Type.
@return Dictionary Entity Type: Determines ownership and synchronization */
public String getEntityType() 
{
return (String)get_Value(COLUMNNAME_EntityType);
}

@XendraTrl(Identifier="e4282247-e02a-c60f-33bc-f82978061d22")
public static String es_PE_FIELD_Parameter_EntityType_Name="Tipo de Entidad";

@XendraTrl(Identifier="e4282247-e02a-c60f-33bc-f82978061d22")
public static String es_PE_FIELD_Parameter_EntityType_Description="Tipo de Entidad Diccionario; determina propiedad y sincronización";

@XendraTrl(Identifier="e4282247-e02a-c60f-33bc-f82978061d22")
public static String es_PE_FIELD_Parameter_EntityType_Help="Los tipos de entidad \"Diccionario\"; \"Adempiere\"; y \"Aplicación\" podrían ser automáticamente sincronizados y las personalizaciones eliminadas ó sobreescritas";

@XendraField(AD_Column_ID="EntityType",IsCentrallyMaintained=true,
AD_Tab_ID="dad31749-11a8-523f-e1a6-70422528ba7c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e4282247-e02a-c60f-33bc-f82978061d22")
public static final String FIELDNAME_Parameter_EntityType="e4282247-e02a-c60f-33bc-f82978061d22";

@XendraTrl(Identifier="07c17994-792e-48c4-b020-bc521c03ae10")
public static String es_PE_COLUMN_EntityType_Name="Tipo de Entidad";

@XendraColumn(AD_Element_ID="5ba917bf-871c-6f19-aa50-962adc5de558",ColumnName="EntityType",
AD_Reference_ID=18,AD_Reference_Value_ID="fae4ad31-8ff1-5d5c-8d47-2426c541cd74",AD_Val_Rule_ID="",
FieldLength=4,DefaultValue="U",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="@EntityType@=D",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="07c17994-792e-48c4-b020-bc521c03ae10",Synchronized="2019-08-30 22:20:36.0")
/** Column name EntityType */
public static final String COLUMNNAME_EntityType = "EntityType";
/** Set Length.
@param FieldLength Length of the column in the database */
public void setFieldLength (int FieldLength)
{
set_Value (COLUMNNAME_FieldLength, Integer.valueOf(FieldLength));
}
/** Get Length.
@return Length of the column in the database */
public int getFieldLength() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_FieldLength);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="cf0a9f1c-ab77-9f25-5787-7544677ccdf4")
public static String es_PE_FIELD_Parameter_Length_Name="Longitud";

@XendraTrl(Identifier="cf0a9f1c-ab77-9f25-5787-7544677ccdf4")
public static String es_PE_FIELD_Parameter_Length_Description="Longitud de la columna en la base de datos.";

@XendraTrl(Identifier="cf0a9f1c-ab77-9f25-5787-7544677ccdf4")
public static String es_PE_FIELD_Parameter_Length_Help="La longitud indica la longitud de una columna tal como se definió en la base de datos.";

@XendraField(AD_Column_ID="FieldLength",IsCentrallyMaintained=true,
AD_Tab_ID="dad31749-11a8-523f-e1a6-70422528ba7c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cf0a9f1c-ab77-9f25-5787-7544677ccdf4")
public static final String FIELDNAME_Parameter_Length="cf0a9f1c-ab77-9f25-5787-7544677ccdf4";

@XendraTrl(Identifier="5b0494b0-4e3e-f7e0-6775-c176dd986d88")
public static String es_PE_COLUMN_FieldLength_Name="Longitud";

@XendraColumn(AD_Element_ID="6b33873b-028e-abd7-6aea-0aec9b6e54e1",ColumnName="FieldLength",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5b0494b0-4e3e-f7e0-6775-c176dd986d88",
Synchronized="2019-08-30 22:20:36.0")
/** Column name FieldLength */
public static final String COLUMNNAME_FieldLength = "FieldLength";
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

@XendraTrl(Identifier="72ccdc15-945e-77ca-0381-219ecb691ebb")
public static String es_PE_FIELD_Parameter_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="72ccdc15-945e-77ca-0381-219ecb691ebb")
public static String es_PE_FIELD_Parameter_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="72ccdc15-945e-77ca-0381-219ecb691ebb")
public static String es_PE_FIELD_Parameter_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="dad31749-11a8-523f-e1a6-70422528ba7c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="72ccdc15-945e-77ca-0381-219ecb691ebb")
public static final String FIELDNAME_Parameter_CommentHelp="72ccdc15-945e-77ca-0381-219ecb691ebb";

@XendraTrl(Identifier="d6860901-2f0e-e54f-51d3-18321a66e9d8")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d6860901-2f0e-e54f-51d3-18321a66e9d8",
Synchronized="2019-08-30 22:20:36.0")
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
@XendraTrl(Identifier="952670f1-1d91-46e4-b450-9373d37232e6")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="952670f1-1d91-46e4-b450-9373d37232e6",
Synchronized="2019-08-30 22:20:36.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Centrally maintained.
@param IsCentrallyMaintained Information maintained in System Element table */
public void setIsCentrallyMaintained (boolean IsCentrallyMaintained)
{
set_Value (COLUMNNAME_IsCentrallyMaintained, Boolean.valueOf(IsCentrallyMaintained));
}
/** Get Centrally maintained.
@return Information maintained in System Element table */
public boolean isCentrallyMaintained() 
{
Object oo = get_Value(COLUMNNAME_IsCentrallyMaintained);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="2de376f3-0015-299c-9ef2-8a90dcc4aa57")
public static String es_PE_FIELD_Parameter_CentrallyMaintained_Name="Mantenido Centralmente";

@XendraTrl(Identifier="2de376f3-0015-299c-9ef2-8a90dcc4aa57")
public static String es_PE_FIELD_Parameter_CentrallyMaintained_Description="Información mantenida en la tabla elementos de sistema.";

@XendraTrl(Identifier="2de376f3-0015-299c-9ef2-8a90dcc4aa57")
public static String es_PE_FIELD_Parameter_CentrallyMaintained_Help="El cuadro de verificación mantenido centralmente indica si el nombre; descripción y ayuda son mantenidos centralmente.";

@XendraField(AD_Column_ID="IsCentrallyMaintained",IsCentrallyMaintained=true,
AD_Tab_ID="dad31749-11a8-523f-e1a6-70422528ba7c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2de376f3-0015-299c-9ef2-8a90dcc4aa57")
public static final String FIELDNAME_Parameter_CentrallyMaintained="2de376f3-0015-299c-9ef2-8a90dcc4aa57";

@XendraTrl(Identifier="d4fc174b-134c-adc8-bbc4-97383586c484")
public static String es_PE_COLUMN_IsCentrallyMaintained_Name="Mantenido Centralmente";

@XendraColumn(AD_Element_ID="aec11edc-fae1-bcfe-5a84-d685b53a80a6",
ColumnName="IsCentrallyMaintained",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="Y",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d4fc174b-134c-adc8-bbc4-97383586c484",Synchronized="2019-08-30 22:20:36.0")
/** Column name IsCentrallyMaintained */
public static final String COLUMNNAME_IsCentrallyMaintained = "IsCentrallyMaintained";
/** Set Mandatory.
@param IsMandatory Data entry is required in this column */
public void setIsMandatory (boolean IsMandatory)
{
set_Value (COLUMNNAME_IsMandatory, Boolean.valueOf(IsMandatory));
}
/** Get Mandatory.
@return Data entry is required in this column */
public boolean isMandatory() 
{
Object oo = get_Value(COLUMNNAME_IsMandatory);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="18486a80-86f0-09dc-eadd-0ab58a716ad0")
public static String es_PE_FIELD_Parameter_Mandatory_Name="Entrada Obligatoria";

@XendraTrl(Identifier="18486a80-86f0-09dc-eadd-0ab58a716ad0")
public static String es_PE_FIELD_Parameter_Mandatory_Description="Entrada de datos es requerida en esta columna";

@XendraTrl(Identifier="18486a80-86f0-09dc-eadd-0ab58a716ad0")
public static String es_PE_FIELD_Parameter_Mandatory_Help="El cuadro de verificación obligatorio indica si el campo es requerido para que un registro sea salvado a la base de datos.";

@XendraField(AD_Column_ID="IsMandatory",IsCentrallyMaintained=true,
AD_Tab_ID="dad31749-11a8-523f-e1a6-70422528ba7c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="18486a80-86f0-09dc-eadd-0ab58a716ad0")
public static final String FIELDNAME_Parameter_Mandatory="18486a80-86f0-09dc-eadd-0ab58a716ad0";

@XendraTrl(Identifier="692748fb-d794-4027-6852-9b1c92cbbb4c")
public static String es_PE_COLUMN_IsMandatory_Name="Entrada Obligatoria";

@XendraColumn(AD_Element_ID="43310179-c59f-f313-de13-08d90722e38d",ColumnName="IsMandatory",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="692748fb-d794-4027-6852-9b1c92cbbb4c",
Synchronized="2019-08-30 22:20:36.0")
/** Column name IsMandatory */
public static final String COLUMNNAME_IsMandatory = "IsMandatory";
/** Set Range.
@param IsRange The parameter is a range of values */
public void setIsRange (boolean IsRange)
{
set_Value (COLUMNNAME_IsRange, Boolean.valueOf(IsRange));
}
/** Get Range.
@return The parameter is a range of values */
public boolean isRange() 
{
Object oo = get_Value(COLUMNNAME_IsRange);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="1d4f684d-3c6f-9a5f-f267-c54d9abd18ff")
public static String es_PE_FIELD_Parameter_Range_Name="Rango";

@XendraTrl(Identifier="1d4f684d-3c6f-9a5f-f267-c54d9abd18ff")
public static String es_PE_FIELD_Parameter_Range_Description="El parámetro es un rango de valores";

@XendraTrl(Identifier="1d4f684d-3c6f-9a5f-f267-c54d9abd18ff")
public static String es_PE_FIELD_Parameter_Range_Help="El cuadro de verificación rango indica que este parámetro es un rango de valores.";

@XendraField(AD_Column_ID="IsRange",IsCentrallyMaintained=true,
AD_Tab_ID="dad31749-11a8-523f-e1a6-70422528ba7c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1d4f684d-3c6f-9a5f-f267-c54d9abd18ff")
public static final String FIELDNAME_Parameter_Range="1d4f684d-3c6f-9a5f-f267-c54d9abd18ff";

@XendraTrl(Identifier="4435cfd2-17c2-6d6f-1b8b-07115f5f095f")
public static String es_PE_COLUMN_IsRange_Name="Rango";

@XendraColumn(AD_Element_ID="a574a98d-8a11-94ec-f0b6-02d6a4458384",ColumnName="IsRange",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4435cfd2-17c2-6d6f-1b8b-07115f5f095f",
Synchronized="2019-08-30 22:20:36.0")
/** Column name IsRange */
public static final String COLUMNNAME_IsRange = "IsRange";
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

@XendraTrl(Identifier="ba5721b6-27c4-470b-87d7-7ebd2fba61d1")
public static String es_PE_FIELD_Parameter_Name_Name="Nombre";

@XendraTrl(Identifier="ba5721b6-27c4-470b-87d7-7ebd2fba61d1")
public static String es_PE_FIELD_Parameter_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="ba5721b6-27c4-470b-87d7-7ebd2fba61d1")
public static String es_PE_FIELD_Parameter_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="dad31749-11a8-523f-e1a6-70422528ba7c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ba5721b6-27c4-470b-87d7-7ebd2fba61d1")
public static final String FIELDNAME_Parameter_Name="ba5721b6-27c4-470b-87d7-7ebd2fba61d1";

@XendraTrl(Identifier="9b21ddeb-9392-3684-92bb-b9b9b436499c")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9b21ddeb-9392-3684-92bb-b9b9b436499c",
Synchronized="2019-08-30 22:20:36.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Read Only Logic.
@param ReadOnlyLogic Logic to determine if field is read only (applies only when field is read-write) */
public void setReadOnlyLogic (String ReadOnlyLogic)
{
set_Value (COLUMNNAME_ReadOnlyLogic, ReadOnlyLogic);
}
/** Get Read Only Logic.
@return Logic to determine if field is read only (applies only when field is read-write) */
public String getReadOnlyLogic() 
{
String value = (String)get_Value(COLUMNNAME_ReadOnlyLogic);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="10029cae-3ed4-58d0-8a10-2ce30ef855b1")
public static String es_PE_COLUMN_ReadOnlyLogic_Name="Read Only Logic";

@XendraColumn(AD_Element_ID="935267fb-b81e-300a-5bc2-f3c4b02f4d5d",ColumnName="ReadOnlyLogic",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="10029cae-3ed4-58d0-8a10-2ce30ef855b1",
Synchronized="2019-08-30 22:20:36.0")
/** Column name ReadOnlyLogic */
public static final String COLUMNNAME_ReadOnlyLogic = "ReadOnlyLogic";
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

@XendraTrl(Identifier="73282224-ea31-bc39-3a47-7679d1bfa8c7")
public static String es_PE_FIELD_Parameter_Sequence_Name="Secuencia";

@XendraTrl(Identifier="73282224-ea31-bc39-3a47-7679d1bfa8c7")
public static String es_PE_FIELD_Parameter_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="73282224-ea31-bc39-3a47-7679d1bfa8c7")
public static String es_PE_FIELD_Parameter_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="dad31749-11a8-523f-e1a6-70422528ba7c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=110,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="73282224-ea31-bc39-3a47-7679d1bfa8c7")
public static final String FIELDNAME_Parameter_Sequence="73282224-ea31-bc39-3a47-7679d1bfa8c7";

@XendraTrl(Identifier="24675a5e-3c45-eb29-5de2-c7e9c26bb0ea")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM AD_Process_Para WHERE AD_Process_ID=@AD_Process_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="24675a5e-3c45-eb29-5de2-c7e9c26bb0ea",
Synchronized="2019-08-30 22:20:36.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
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

@XendraTrl(Identifier="2a20fcc2-e698-49c0-8e82-3d3b7dae3894")
public static String es_PE_COLUMN_Synchronized_Name="Synchronized";

@XendraColumn(AD_Element_ID="08f1e976-ceeb-f830-9d75-bf94f13a98ce",ColumnName="Synchronized",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2a20fcc2-e698-49c0-8e82-3d3b7dae3894",
Synchronized="2019-08-30 22:20:36.0")
/** Column name Synchronized */
public static final String COLUMNNAME_Synchronized = "Synchronized";
/** Set Max. Value.
@param ValueMax Maximum Value for a field */
public void setValueMax (String ValueMax)
{
if (ValueMax != null && ValueMax.length() > 20)
{
log.warning("Length > 20 - truncated");
ValueMax = ValueMax.substring(0,19);
}
set_Value (COLUMNNAME_ValueMax, ValueMax);
}
/** Get Max. Value.
@return Maximum Value for a field */
public String getValueMax() 
{
String value = (String)get_Value(COLUMNNAME_ValueMax);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="acb3cff5-b0ce-adce-2cf5-ba40a590b1bf")
public static String es_PE_FIELD_Parameter_MaxValue_Name="Valor Máximo";

@XendraTrl(Identifier="acb3cff5-b0ce-adce-2cf5-ba40a590b1bf")
public static String es_PE_FIELD_Parameter_MaxValue_Description="Valor Máximo de un campo";

@XendraTrl(Identifier="acb3cff5-b0ce-adce-2cf5-ba40a590b1bf")
public static String es_PE_FIELD_Parameter_MaxValue_Help="El Valor Máximo indica el valor más alto permisible para un campo";

@XendraField(AD_Column_ID="ValueMax",IsCentrallyMaintained=true,
AD_Tab_ID="dad31749-11a8-523f-e1a6-70422528ba7c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="acb3cff5-b0ce-adce-2cf5-ba40a590b1bf")
public static final String FIELDNAME_Parameter_MaxValue="acb3cff5-b0ce-adce-2cf5-ba40a590b1bf";

@XendraTrl(Identifier="99b6482e-9cb2-48a1-b922-056aee45f9f7")
public static String es_PE_COLUMN_ValueMax_Name="Valor Máximo";

@XendraColumn(AD_Element_ID="9a379735-7a4d-6bc7-3c02-7c24576e4604",ColumnName="ValueMax",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="99b6482e-9cb2-48a1-b922-056aee45f9f7",
Synchronized="2019-08-30 22:20:36.0")
/** Column name ValueMax */
public static final String COLUMNNAME_ValueMax = "ValueMax";
/** Set Min. Value.
@param ValueMin Minimum Value for a field */
public void setValueMin (String ValueMin)
{
if (ValueMin != null && ValueMin.length() > 20)
{
log.warning("Length > 20 - truncated");
ValueMin = ValueMin.substring(0,19);
}
set_Value (COLUMNNAME_ValueMin, ValueMin);
}
/** Get Min. Value.
@return Minimum Value for a field */
public String getValueMin() 
{
String value = (String)get_Value(COLUMNNAME_ValueMin);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a26535fe-bf7d-c45c-8b66-350b61e212fd")
public static String es_PE_FIELD_Parameter_MinValue_Name="Valor Mínimo";

@XendraTrl(Identifier="a26535fe-bf7d-c45c-8b66-350b61e212fd")
public static String es_PE_FIELD_Parameter_MinValue_Description="Valor Mínimo de un campo";

@XendraTrl(Identifier="a26535fe-bf7d-c45c-8b66-350b61e212fd")
public static String es_PE_FIELD_Parameter_MinValue_Help="El Valor Mínimo indica el menor valor permisible para un campo";

@XendraField(AD_Column_ID="ValueMin",IsCentrallyMaintained=true,
AD_Tab_ID="dad31749-11a8-523f-e1a6-70422528ba7c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a26535fe-bf7d-c45c-8b66-350b61e212fd")
public static final String FIELDNAME_Parameter_MinValue="a26535fe-bf7d-c45c-8b66-350b61e212fd";

@XendraTrl(Identifier="fb862f1a-8f6c-95ea-1363-ed7c1bc0865c")
public static String es_PE_COLUMN_ValueMin_Name="Valor Mínimo";

@XendraColumn(AD_Element_ID="4017e4d8-25ab-786b-f835-a0847fb18a89",ColumnName="ValueMin",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fb862f1a-8f6c-95ea-1363-ed7c1bc0865c",
Synchronized="2019-08-30 22:20:36.0")
/** Column name ValueMin */
public static final String COLUMNNAME_ValueMin = "ValueMin";
/** Set Value Format.
@param VFormat Format of the value: Can contain fixed format elements, Variables: '_lLoOaAcCa09' */
public void setVFormat (String VFormat)
{
if (VFormat != null && VFormat.length() > 20)
{
log.warning("Length > 20 - truncated");
VFormat = VFormat.substring(0,19);
}
set_Value (COLUMNNAME_VFormat, VFormat);
}
/** Get Value Format.
@return Format of the value: Can contain fixed format elements, Variables: '_lLoOaAcCa09' */
public String getVFormat() 
{
String value = (String)get_Value(COLUMNNAME_VFormat);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="1ba274f2-9547-360e-76e1-5c85835f9e5c")
public static String es_PE_FIELD_Parameter_ValueFormat_Name="Formato del Valor";

@XendraTrl(Identifier="1ba274f2-9547-360e-76e1-5c85835f9e5c")
public static String es_PE_FIELD_Parameter_ValueFormat_Description="Formato del valor; puede contener elementos de formato fijo; Variables: \"_lLoOaAcCa09\"";

@XendraTrl(Identifier="1ba274f2-9547-360e-76e1-5c85835f9e5c")
public static String es_PE_FIELD_Parameter_ValueFormat_Help="<B>Elementos de validación:</B>";

@XendraField(AD_Column_ID="VFormat",IsCentrallyMaintained=true,
AD_Tab_ID="dad31749-11a8-523f-e1a6-70422528ba7c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1ba274f2-9547-360e-76e1-5c85835f9e5c")
public static final String FIELDNAME_Parameter_ValueFormat="1ba274f2-9547-360e-76e1-5c85835f9e5c";

@XendraTrl(Identifier="64647d35-6b4b-f0b6-0342-3b4106cb5a9e")
public static String es_PE_COLUMN_VFormat_Name="Formato del Valor";

@XendraColumn(AD_Element_ID="041d14f4-3102-bf3a-cf36-5153817cbfad",ColumnName="VFormat",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="64647d35-6b4b-f0b6-0342-3b4106cb5a9e",
Synchronized="2019-08-30 22:20:36.0")
/** Column name VFormat */
public static final String COLUMNNAME_VFormat = "VFormat";
}
