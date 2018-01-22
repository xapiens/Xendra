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
/** Generated Model for AD_ReportView_Col
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_ReportView_Col extends PO
{
/** Standard Constructor
@param ctx context
@param AD_ReportView_Col_ID id
@param trxName transaction
*/
public X_AD_ReportView_Col (Properties ctx, int AD_ReportView_Col_ID, String trxName)
{
super (ctx, AD_ReportView_Col_ID, trxName);
/** if (AD_ReportView_Col_ID == 0)
{
setAD_ReportView_Col_ID (0);
setAD_ReportView_ID (0);
setFunctionColumn (null);
setIsGroupFunction (false);	
// N
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_ReportView_Col (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=428 */
public static int Table_ID=MTable.getTable_ID("AD_ReportView_Col");

@XendraTrl(Identifier="a3c31013-07ae-51ef-0c34-1642e1a33e8c")
public static String es_PE_TAB_ReportViewColumn_Description="Columna de Vista del Informe";

@XendraTrl(Identifier="a3c31013-07ae-51ef-0c34-1642e1a33e8c")
public static String es_PE_TAB_ReportViewColumn_Name="Columna de Vista del Informe";

@XendraTrl(Identifier="a3c31013-07ae-51ef-0c34-1642e1a33e8c")
public static String es_PE_TAB_ReportViewColumn_Help="La pestaña Columna de Vista de Informe define las columnas que no serán consideradas durante la generación del Select del SQL.";

@XendraTab(Name="Report View Column",Description="Report View Column",
Help="The Report View Column Tab defines any columns which will be overridden in the generation of the select SQL",
AD_Window_ID="dd35bdde-cc7b-8f79-1962-33f8253fe1b6",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="a3c31013-07ae-51ef-0c34-1642e1a33e8c",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ReportViewColumn="a3c31013-07ae-51ef-0c34-1642e1a33e8c";

@XendraTrl(Identifier="125031f1-48fe-46cb-08a7-5831edb38e21")
public static String es_PE_TABLE_AD_ReportView_Col_Name="Columna Vista de Informe";

@XendraTable(Name="Report view Column",Description="",Help="",TableName="AD_ReportView_Col",
AccessLevel="4",AD_Window_ID="dd35bdde-cc7b-8f79-1962-33f8253fe1b6",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.request",
Identifier="125031f1-48fe-46cb-08a7-5831edb38e21",Synchronized="2017-08-16 11:40:56.0")
/** TableName=AD_ReportView_Col */
public static final String Table_Name="AD_ReportView_Col";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_ReportView_Col");

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
    Table_ID = MTable.getTable_ID("AD_ReportView_Col");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_ReportView_Col[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Column.
@param AD_Column_ID Column in the table */
public void setAD_Column_ID (int AD_Column_ID)
{
if (AD_Column_ID <= 0) set_Value (COLUMNNAME_AD_Column_ID, null);
 else 
set_Value (COLUMNNAME_AD_Column_ID, Integer.valueOf(AD_Column_ID));
}
/** Get Column.
@return Column in the table */
public int getAD_Column_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Column_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="70194715-3c47-d809-2a81-4ba6e0b4b347")
public static String es_PE_FIELD_ReportViewColumn_Column_Description="Columna en la tabla";

@XendraTrl(Identifier="70194715-3c47-d809-2a81-4ba6e0b4b347")
public static String es_PE_FIELD_ReportViewColumn_Column_Help="Enlace a la columna base de datos de la tabla";

@XendraTrl(Identifier="70194715-3c47-d809-2a81-4ba6e0b4b347")
public static String es_PE_FIELD_ReportViewColumn_Column_Name="Columna";

@XendraField(AD_Column_ID="AD_Column_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a3c31013-07ae-51ef-0c34-1642e1a33e8c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="70194715-3c47-d809-2a81-4ba6e0b4b347")
public static final String FIELDNAME_ReportViewColumn_Column="70194715-3c47-d809-2a81-4ba6e0b4b347";

@XendraTrl(Identifier="09a998a7-d927-766a-0043-29e707ca188c")
public static String es_PE_COLUMN_AD_Column_ID_Name="Columna";

@XendraColumn(AD_Element_ID="a0dcf1ba-2ef3-ca06-ed42-8ae37c632eaf",ColumnName="AD_Column_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="084db087-1100-ad15-806b-d1b94a96650c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="09a998a7-d927-766a-0043-29e707ca188c",Synchronized="2017-08-05 16:52:48.0")
/** Column name AD_Column_ID */
public static final String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
/** Set Report view Column.
@param AD_ReportView_Col_ID Report view Column */
public void setAD_ReportView_Col_ID (int AD_ReportView_Col_ID)
{
if (AD_ReportView_Col_ID < 1) throw new IllegalArgumentException ("AD_ReportView_Col_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_ReportView_Col_ID, Integer.valueOf(AD_ReportView_Col_ID));
}
/** Get Report view Column.
@return Report view Column */
public int getAD_ReportView_Col_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_ReportView_Col_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fc2f38fc-bc89-5080-b5f9-9b2c6716a96c")
public static String es_PE_FIELD_ReportViewColumn_ReportViewColumn_Name="Columna Vista de Informe";

@XendraField(AD_Column_ID="AD_ReportView_Col_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a3c31013-07ae-51ef-0c34-1642e1a33e8c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fc2f38fc-bc89-5080-b5f9-9b2c6716a96c")
public static final String FIELDNAME_ReportViewColumn_ReportViewColumn="fc2f38fc-bc89-5080-b5f9-9b2c6716a96c";
/** Column name AD_ReportView_Col_ID */
public static final String COLUMNNAME_AD_ReportView_Col_ID = "AD_ReportView_Col_ID";
/** Set Report View.
@param AD_ReportView_ID View used to generate this report */
public void setAD_ReportView_ID (int AD_ReportView_ID)
{
if (AD_ReportView_ID < 1) throw new IllegalArgumentException ("AD_ReportView_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_ReportView_ID, Integer.valueOf(AD_ReportView_ID));
}
/** Get Report View.
@return View used to generate this report */
public int getAD_ReportView_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_ReportView_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getAD_ReportView_ID()));
}

@XendraTrl(Identifier="018950fd-c9fe-e1fe-42d8-a0ef69880438")
public static String es_PE_FIELD_ReportViewColumn_ReportView_Description="Vista usada para generar este Informe";

@XendraTrl(Identifier="018950fd-c9fe-e1fe-42d8-a0ef69880438")
public static String es_PE_FIELD_ReportViewColumn_ReportView_Help="La Vista del Informe indica la vista usada para generar este Informe";

@XendraTrl(Identifier="018950fd-c9fe-e1fe-42d8-a0ef69880438")
public static String es_PE_FIELD_ReportViewColumn_ReportView_Name="Vista del Informe";

@XendraField(AD_Column_ID="AD_ReportView_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a3c31013-07ae-51ef-0c34-1642e1a33e8c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="018950fd-c9fe-e1fe-42d8-a0ef69880438")
public static final String FIELDNAME_ReportViewColumn_ReportView="018950fd-c9fe-e1fe-42d8-a0ef69880438";

@XendraTrl(Identifier="01796752-4020-0a4c-2f9a-010106c167ab")
public static String es_PE_COLUMN_AD_ReportView_ID_Name="Vista del Informe";

@XendraColumn(AD_Element_ID="c754a5db-23cc-4220-33ac-cc954cd05645",ColumnName="AD_ReportView_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="01796752-4020-0a4c-2f9a-010106c167ab",
Synchronized="2017-08-05 16:52:48.0")
/** Column name AD_ReportView_ID */
public static final String COLUMNNAME_AD_ReportView_ID = "AD_ReportView_ID";
/** Set Function Column.
@param FunctionColumn Overwrite Column with Function  */
public void setFunctionColumn (String FunctionColumn)
{
if (FunctionColumn == null) throw new IllegalArgumentException ("FunctionColumn is mandatory.");
if (FunctionColumn.length() > 60)
{
log.warning("Length > 60 - truncated");
FunctionColumn = FunctionColumn.substring(0,59);
}
set_Value (COLUMNNAME_FunctionColumn, FunctionColumn);
}
/** Get Function Column.
@return Overwrite Column with Function  */
public String getFunctionColumn() 
{
String value = (String)get_Value(COLUMNNAME_FunctionColumn);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="25f0f7eb-3c84-a474-e814-1b9ee0503d0e")
public static String es_PE_FIELD_ReportViewColumn_FunctionColumn_Description="Sobre escribe columna con función.";

@XendraTrl(Identifier="25f0f7eb-3c84-a474-e814-1b9ee0503d0e")
public static String es_PE_FIELD_ReportViewColumn_FunctionColumn_Help="La columna función indica que la columna será modificada con una función.";

@XendraTrl(Identifier="25f0f7eb-3c84-a474-e814-1b9ee0503d0e")
public static String es_PE_FIELD_ReportViewColumn_FunctionColumn_Name="Función x Columna";

@XendraField(AD_Column_ID="FunctionColumn",IsCentrallyMaintained=true,
AD_Tab_ID="a3c31013-07ae-51ef-0c34-1642e1a33e8c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="25f0f7eb-3c84-a474-e814-1b9ee0503d0e")
public static final String FIELDNAME_ReportViewColumn_FunctionColumn="25f0f7eb-3c84-a474-e814-1b9ee0503d0e";

@XendraTrl(Identifier="4db13375-197f-936b-e42d-34532ba93bda")
public static String es_PE_COLUMN_FunctionColumn_Name="Función x Columna";

@XendraColumn(AD_Element_ID="f597ef6d-df13-f00e-b1b8-210b5829a165",ColumnName="FunctionColumn",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4db13375-197f-936b-e42d-34532ba93bda",
Synchronized="2017-08-05 16:52:48.0")
/** Column name FunctionColumn */
public static final String COLUMNNAME_FunctionColumn = "FunctionColumn";
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
@XendraTrl(Identifier="30fd29f0-7522-4ced-bf8b-0e63aa8ab278")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="30fd29f0-7522-4ced-bf8b-0e63aa8ab278",
Synchronized="2017-08-05 16:52:48.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set SQL Group Function.
@param IsGroupFunction This function will generate a Group By Clause */
public void setIsGroupFunction (boolean IsGroupFunction)
{
set_Value (COLUMNNAME_IsGroupFunction, Boolean.valueOf(IsGroupFunction));
}
/** Get SQL Group Function.
@return This function will generate a Group By Clause */
public boolean isGroupFunction() 
{
Object oo = get_Value(COLUMNNAME_IsGroupFunction);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="e99f9984-c436-ba9c-ba9f-6e103522020f")
public static String es_PE_FIELD_ReportViewColumn_SQLGroupFunction_Description="Esta función generará una cláusula por grupo.";

@XendraTrl(Identifier="e99f9984-c436-ba9c-ba9f-6e103522020f")
public static String es_PE_FIELD_ReportViewColumn_SQLGroupFunction_Help="El cuadro de verificación función grupo SQL indica que esta función generará una cláusula de grupo. ";

@XendraTrl(Identifier="e99f9984-c436-ba9c-ba9f-6e103522020f")
public static String es_PE_FIELD_ReportViewColumn_SQLGroupFunction_Name="Función de Grupo SQL";

@XendraField(AD_Column_ID="IsGroupFunction",IsCentrallyMaintained=true,
AD_Tab_ID="a3c31013-07ae-51ef-0c34-1642e1a33e8c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e99f9984-c436-ba9c-ba9f-6e103522020f")
public static final String FIELDNAME_ReportViewColumn_SQLGroupFunction="e99f9984-c436-ba9c-ba9f-6e103522020f";

@XendraTrl(Identifier="ca53e136-23e9-7130-c27d-5b00233e22b4")
public static String es_PE_COLUMN_IsGroupFunction_Name="Función de Grupo SQL";

@XendraColumn(AD_Element_ID="199a127f-78fe-3acb-8543-047e2e9dd2da",ColumnName="IsGroupFunction",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ca53e136-23e9-7130-c27d-5b00233e22b4",
Synchronized="2017-08-05 16:52:48.0")
/** Column name IsGroupFunction */
public static final String COLUMNNAME_IsGroupFunction = "IsGroupFunction";
}
