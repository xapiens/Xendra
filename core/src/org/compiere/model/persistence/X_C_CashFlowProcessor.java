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
import org.compiere.model.reference.REF__FrequencyType;
/** Generated Model for C_CashFlowProcessor
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_CashFlowProcessor extends PO
{
/** Standard Constructor
@param ctx context
@param C_CashFlowProcessor_ID id
@param trxName transaction
*/
public X_C_CashFlowProcessor (Properties ctx, int C_CashFlowProcessor_ID, String trxName)
{
super (ctx, C_CashFlowProcessor_ID, trxName);
/** if (C_CashFlowProcessor_ID == 0)
{
setC_CashFlowProcessor_ID (0);
setFrequency (0);
setFrequencyType (null);
setKeepLogDays (0);	
// 7
setSupervisor_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_CashFlowProcessor (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000030 */
public static int Table_ID=MTable.getTable_ID("C_CashFlowProcessor");

@XendraTrl(Identifier="c8bc9995-6038-b370-4dc6-e520d0abdc10")
public static String es_PE_TAB_CashFlowProcessor_Description="Maintain Cash Flow Processor/Server Parameters";

@XendraTrl(Identifier="c8bc9995-6038-b370-4dc6-e520d0abdc10")
public static String es_PE_TAB_CashFlowProcessor_Help="Cash Flow Processor/Server parameters. all items of cash flow are processed. ";

@XendraTrl(Identifier="c8bc9995-6038-b370-4dc6-e520d0abdc10")
public static String es_PE_TAB_CashFlowProcessor_Name="Procesador Flujo de Efectivo";

@XendraTab(Name="Cash Flow Processor",Description="Maintain Cash Flow Processor/Server Parameters",
Help="Cash Flow Processor/Server parameters. all items of cash flow are processed. ",
AD_Window_ID="2dbf21fc-a923-fdd6-65f3-282445376a90",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="c8bc9995-6038-b370-4dc6-e520d0abdc10",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_CashFlowProcessor="c8bc9995-6038-b370-4dc6-e520d0abdc10";

@XendraTrl(Identifier="3d4d068a-62c3-8988-2ea9-52f253f5b6ec")
public static String es_PE_TABLE_C_CashFlowProcessor_Name="Cash Flow Processor";

@XendraTable(Name="Cash Flow Processor",Description="Cash Flow Processor Server",Help="",
TableName="C_CashFlowProcessor",AccessLevel="2",
AD_Window_ID="2dbf21fc-a923-fdd6-65f3-282445376a90",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="3d4d068a-62c3-8988-2ea9-52f253f5b6ec",
Synchronized="2017-10-04 18:36:54.0")
/** TableName=C_CashFlowProcessor */
public static final String Table_Name="C_CashFlowProcessor";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_CashFlowProcessor");

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
    Table_ID = MTable.getTable_ID("C_CashFlowProcessor");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_CashFlowProcessor[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Table.
@param AD_Table_ID Database Table information */
public void setAD_Table_ID (int AD_Table_ID)
{
if (AD_Table_ID <= 0) set_Value (COLUMNNAME_AD_Table_ID, null);
 else 
set_Value (COLUMNNAME_AD_Table_ID, Integer.valueOf(AD_Table_ID));
}
/** Get Table.
@return Database Table information */
public int getAD_Table_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Table_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ab12aa40-d51a-909c-2766-c326f048c906")
public static String es_PE_FIELD_CashFlowProcessor_Table_Name="Tabla";

@XendraTrl(Identifier="ab12aa40-d51a-909c-2766-c326f048c906")
public static String es_PE_FIELD_CashFlowProcessor_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="ab12aa40-d51a-909c-2766-c326f048c906")
public static String es_PE_FIELD_CashFlowProcessor_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c8bc9995-6038-b370-4dc6-e520d0abdc10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ab12aa40-d51a-909c-2766-c326f048c906")
public static final String FIELDNAME_CashFlowProcessor_Table="ab12aa40-d51a-909c-2766-c326f048c906";

@XendraTrl(Identifier="0ebf6f07-832b-6d75-0d09-e0a953434b7b")
public static String es_PE_COLUMN_AD_Table_ID_Name="Tabla";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0ebf6f07-832b-6d75-0d09-e0a953434b7b",
Synchronized="2017-08-28 09:55:27.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
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

@XendraTrl(Identifier="f1262f56-7bd1-4cab-9da0-9af6a56b73e3")
public static String es_PE_COLUMN_A_Machine_ID_Name="Machine ";

@XendraColumn(AD_Element_ID="5ca659c9-c8cc-4dd1-8e7c-ddc2fe399392",ColumnName="A_Machine_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f1262f56-7bd1-4cab-9da0-9af6a56b73e3",
Synchronized="2017-08-28 09:55:27.0")
/** Column name A_Machine_ID */
public static final String COLUMNNAME_A_Machine_ID = "A_Machine_ID";
/** Set Accounting Schema.
@param C_AcctSchema_ID Rules for accounting */
public void setC_AcctSchema_ID (int C_AcctSchema_ID)
{
if (C_AcctSchema_ID <= 0) set_Value (COLUMNNAME_C_AcctSchema_ID, null);
 else 
set_Value (COLUMNNAME_C_AcctSchema_ID, Integer.valueOf(C_AcctSchema_ID));
}
/** Get Accounting Schema.
@return Rules for accounting */
public int getC_AcctSchema_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_AcctSchema_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5c865987-43af-8dad-2577-6ae5c0f57641")
public static String es_PE_FIELD_CashFlowProcessor_AccountingSchema_Name="Esquema Contable";

@XendraTrl(Identifier="5c865987-43af-8dad-2577-6ae5c0f57641")
public static String es_PE_FIELD_CashFlowProcessor_AccountingSchema_Description="Reglas para contabilizar";

@XendraTrl(Identifier="5c865987-43af-8dad-2577-6ae5c0f57641")
public static String es_PE_FIELD_CashFlowProcessor_AccountingSchema_Help="Un esquema contable define las reglas contables usadas tales como método de costeo; moneda y calendario";

@XendraField(AD_Column_ID="C_AcctSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c8bc9995-6038-b370-4dc6-e520d0abdc10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5c865987-43af-8dad-2577-6ae5c0f57641")
public static final String FIELDNAME_CashFlowProcessor_AccountingSchema="5c865987-43af-8dad-2577-6ae5c0f57641";

@XendraTrl(Identifier="2f57437c-06b1-e6e1-7788-098e278d6908")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2f57437c-06b1-e6e1-7788-098e278d6908",
Synchronized="2017-08-28 09:55:27.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
/** Set Cash Flow Processor.
@param C_CashFlowProcessor_ID Cash Flow Processor / Server parameters */
public void setC_CashFlowProcessor_ID (int C_CashFlowProcessor_ID)
{
if (C_CashFlowProcessor_ID < 1) throw new IllegalArgumentException ("C_CashFlowProcessor_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_CashFlowProcessor_ID, Integer.valueOf(C_CashFlowProcessor_ID));
}
/** Get Cash Flow Processor.
@return Cash Flow Processor / Server parameters */
public int getC_CashFlowProcessor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_CashFlowProcessor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a36dc3a3-7e10-1986-ad93-2c1b0c4558a2")
public static String es_PE_FIELD_CashFlowProcessor_CashFlowProcessor_Name="Cash Flow Processor";

@XendraTrl(Identifier="a36dc3a3-7e10-1986-ad93-2c1b0c4558a2")
public static String es_PE_FIELD_CashFlowProcessor_CashFlowProcessor_Description="Cash Flow Processor / Server parameters";

@XendraTrl(Identifier="a36dc3a3-7e10-1986-ad93-2c1b0c4558a2")
public static String es_PE_FIELD_CashFlowProcessor_CashFlowProcessor_Help="Cash Flow Processor / Server parameters";

@XendraField(AD_Column_ID="C_CashFlowProcessor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c8bc9995-6038-b370-4dc6-e520d0abdc10",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a36dc3a3-7e10-1986-ad93-2c1b0c4558a2")
public static final String FIELDNAME_CashFlowProcessor_CashFlowProcessor="a36dc3a3-7e10-1986-ad93-2c1b0c4558a2";
/** Column name C_CashFlowProcessor_ID */
public static final String COLUMNNAME_C_CashFlowProcessor_ID = "C_CashFlowProcessor_ID";
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

@XendraTrl(Identifier="e2c7124e-538a-ad3b-99d8-d774f358d0c5")
public static String es_PE_FIELD_CashFlowProcessor_DateLastRun_Name="Última Fecha de Corrida";

@XendraTrl(Identifier="e2c7124e-538a-ad3b-99d8-d774f358d0c5")
public static String es_PE_FIELD_CashFlowProcessor_DateLastRun_Description="Fecha en que el proceso fue corrido por última vez";

@XendraTrl(Identifier="e2c7124e-538a-ad3b-99d8-d774f358d0c5")
public static String es_PE_FIELD_CashFlowProcessor_DateLastRun_Help="La fecha de última corrida indica la última vez que se corrió un proceso";

@XendraField(AD_Column_ID="DateLastRun",IsCentrallyMaintained=true,
AD_Tab_ID="c8bc9995-6038-b370-4dc6-e520d0abdc10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e2c7124e-538a-ad3b-99d8-d774f358d0c5")
public static final String FIELDNAME_CashFlowProcessor_DateLastRun="e2c7124e-538a-ad3b-99d8-d774f358d0c5";

@XendraTrl(Identifier="078acdf4-1057-4e50-2606-7afca7d58bb1")
public static String es_PE_COLUMN_DateLastRun_Name="Última Fecha de Corrida";

@XendraColumn(AD_Element_ID="e4c09739-6370-19ca-fdeb-4cdf8025abb8",ColumnName="DateLastRun",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="078acdf4-1057-4e50-2606-7afca7d58bb1",
Synchronized="2017-08-28 09:55:27.0")
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

@XendraTrl(Identifier="8906fa92-86c3-5070-31c2-d62525210ff1")
public static String es_PE_FIELD_CashFlowProcessor_DateNextRun_Name="Siguiente Fecha de Corrida";

@XendraTrl(Identifier="8906fa92-86c3-5070-31c2-d62525210ff1")
public static String es_PE_FIELD_CashFlowProcessor_DateNextRun_Description="Fecha en que el proceso será corrido la siguiente vez";

@XendraTrl(Identifier="8906fa92-86c3-5070-31c2-d62525210ff1")
public static String es_PE_FIELD_CashFlowProcessor_DateNextRun_Help="La fecha de la siguiente corrida indica la siguiente vez que este proceso se correrá.";

@XendraField(AD_Column_ID="DateNextRun",IsCentrallyMaintained=true,
AD_Tab_ID="c8bc9995-6038-b370-4dc6-e520d0abdc10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8906fa92-86c3-5070-31c2-d62525210ff1")
public static final String FIELDNAME_CashFlowProcessor_DateNextRun="8906fa92-86c3-5070-31c2-d62525210ff1";

@XendraTrl(Identifier="6c3f0d7e-bd9b-32ad-8c55-81a9c43378b2")
public static String es_PE_COLUMN_DateNextRun_Name="Siguiente Fecha de Corrida";

@XendraColumn(AD_Element_ID="215eac34-7f19-f6b2-ebeb-e6fbdb06d7ee",ColumnName="DateNextRun",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6c3f0d7e-bd9b-32ad-8c55-81a9c43378b2",
Synchronized="2017-08-28 09:55:27.0")
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

@XendraTrl(Identifier="7ef76406-b902-cf20-5e3a-07e3cb885e39")
public static String es_PE_FIELD_CashFlowProcessor_Description_Name="Observación";

@XendraTrl(Identifier="7ef76406-b902-cf20-5e3a-07e3cb885e39")
public static String es_PE_FIELD_CashFlowProcessor_Description_Description="Observación";

@XendraTrl(Identifier="7ef76406-b902-cf20-5e3a-07e3cb885e39")
public static String es_PE_FIELD_CashFlowProcessor_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="c8bc9995-6038-b370-4dc6-e520d0abdc10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7ef76406-b902-cf20-5e3a-07e3cb885e39")
public static final String FIELDNAME_CashFlowProcessor_Description="7ef76406-b902-cf20-5e3a-07e3cb885e39";

@XendraTrl(Identifier="60726462-fe30-f6f0-4ab5-62e6e29f969b")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="60726462-fe30-f6f0-4ab5-62e6e29f969b",
Synchronized="2017-08-28 09:55:27.0")
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

@XendraTrl(Identifier="3c517d31-f3fb-d40a-065f-9b3825548fb6")
public static String es_PE_FIELD_CashFlowProcessor_Frequency_Name="Frecuencia";

@XendraTrl(Identifier="3c517d31-f3fb-d40a-065f-9b3825548fb6")
public static String es_PE_FIELD_CashFlowProcessor_Frequency_Description="Frecuencia de proceso del requerimiento";

@XendraTrl(Identifier="3c517d31-f3fb-d40a-065f-9b3825548fb6")
public static String es_PE_FIELD_CashFlowProcessor_Frequency_Help="La Frecuencia se usa junto con el tipo de frecuencia para determinar cuando un requerimiento será procesado.";

@XendraField(AD_Column_ID="Frequency",IsCentrallyMaintained=true,
AD_Tab_ID="c8bc9995-6038-b370-4dc6-e520d0abdc10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3c517d31-f3fb-d40a-065f-9b3825548fb6")
public static final String FIELDNAME_CashFlowProcessor_Frequency="3c517d31-f3fb-d40a-065f-9b3825548fb6";

@XendraTrl(Identifier="b7cef9be-c860-2e19-791a-b8b75bb5de29")
public static String es_PE_COLUMN_Frequency_Name="Frecuencia";

@XendraColumn(AD_Element_ID="cd717b11-c45b-527f-9abd-4533f87b759f",ColumnName="Frequency",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b7cef9be-c860-2e19-791a-b8b75bb5de29",
Synchronized="2017-08-28 09:55:27.0")
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

@XendraTrl(Identifier="223b35c5-64b4-4762-948a-c645b5999f0e")
public static String es_PE_COLUMN_FrequencyStartAt_Name="FrequencyStartAt";

@XendraColumn(AD_Element_ID="42d884cb-6480-428f-bef3-5e0802c0de5b",ColumnName="FrequencyStartAt",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="223b35c5-64b4-4762-948a-c645b5999f0e",
Synchronized="2017-10-04 18:30:40.0")
/** Column name FrequencyStartAt */
public static final String COLUMNNAME_FrequencyStartAt = "FrequencyStartAt";

/** FrequencyType AD_Reference=a8e24598-16fb-a392-7587-12a112938032 */
public static final int FREQUENCYTYPE_AD_Reference_ID=221;
/** Set Frequency Type.
@param FrequencyType Frequency of event */
public void setFrequencyType (String FrequencyType)
{
if (FrequencyType == null) throw new IllegalArgumentException ("FrequencyType is mandatory");
if (FrequencyType.equals(REF__FrequencyType.Minute) || FrequencyType.equals(REF__FrequencyType.Hour) || FrequencyType.equals(REF__FrequencyType.Day) || FrequencyType.equals(REF__FrequencyType.Once) || FrequencyType.equals(REF__FrequencyType.Notification));
 else throw new IllegalArgumentException ("FrequencyType Invalid value - " + FrequencyType + " - Reference_ID=221 - M - H - D - O - N");
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

@XendraTrl(Identifier="f869ac4d-8f18-99de-f09a-4cc1fdb7a2c5")
public static String es_PE_FIELD_CashFlowProcessor_FrequencyType_Name="Tipo de Frecuencia";

@XendraTrl(Identifier="f869ac4d-8f18-99de-f09a-4cc1fdb7a2c5")
public static String es_PE_FIELD_CashFlowProcessor_FrequencyType_Description="Frecuencia de cálculo";

@XendraTrl(Identifier="f869ac4d-8f18-99de-f09a-4cc1fdb7a2c5")
public static String es_PE_FIELD_CashFlowProcessor_FrequencyType_Help="El Tipo de frecuencia se usa para calcular las fechas de inicio y fin del cálculo";

@XendraField(AD_Column_ID="FrequencyType",IsCentrallyMaintained=true,
AD_Tab_ID="c8bc9995-6038-b370-4dc6-e520d0abdc10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f869ac4d-8f18-99de-f09a-4cc1fdb7a2c5")
public static final String FIELDNAME_CashFlowProcessor_FrequencyType="f869ac4d-8f18-99de-f09a-4cc1fdb7a2c5";

@XendraTrl(Identifier="d4d741a4-ff34-aaeb-4779-725964d245a6")
public static String es_PE_COLUMN_FrequencyType_Name="Tipo de Frecuencia";

@XendraColumn(AD_Element_ID="d2dcc6d7-4c3b-0646-5dc8-3df7514121af",ColumnName="FrequencyType",
AD_Reference_ID=17,AD_Reference_Value_ID="a8e24598-16fb-a392-7587-12a112938032",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d4d741a4-ff34-aaeb-4779-725964d245a6",Synchronized="2017-08-28 09:55:27.0")
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
@XendraTrl(Identifier="c319382a-5410-4c83-a00b-f08f6bb37a03")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c319382a-5410-4c83-a00b-f08f6bb37a03",
Synchronized="2017-08-28 09:55:27.0")
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

@XendraTrl(Identifier="91592f55-c868-a21f-d8d5-33c48221145b")
public static String es_PE_FIELD_CashFlowProcessor_DaysToKeepLog_Name="Días para Guardar el Registro";

@XendraTrl(Identifier="91592f55-c868-a21f-d8d5-33c48221145b")
public static String es_PE_FIELD_CashFlowProcessor_DaysToKeepLog_Description="Número de días para guardar las entradas del registro";

@XendraTrl(Identifier="91592f55-c868-a21f-d8d5-33c48221145b")
public static String es_PE_FIELD_CashFlowProcessor_DaysToKeepLog_Help="Las entradas de un registro mas viejo pueden ser suprimidas";

@XendraField(AD_Column_ID="KeepLogDays",IsCentrallyMaintained=true,
AD_Tab_ID="c8bc9995-6038-b370-4dc6-e520d0abdc10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="91592f55-c868-a21f-d8d5-33c48221145b")
public static final String FIELDNAME_CashFlowProcessor_DaysToKeepLog="91592f55-c868-a21f-d8d5-33c48221145b";

@XendraTrl(Identifier="00a3e858-9a0a-d67f-2e32-e3105a660cdd")
public static String es_PE_COLUMN_KeepLogDays_Name="Días para guardar el registro";

@XendraColumn(AD_Element_ID="5f6abdde-d6c5-cc1d-af35-b05c5b66edd5",ColumnName="KeepLogDays",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="7",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="00a3e858-9a0a-d67f-2e32-e3105a660cdd",
Synchronized="2017-08-28 09:55:27.0")
/** Column name KeepLogDays */
public static final String COLUMNNAME_KeepLogDays = "KeepLogDays";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name != null && Name.length() > 60)
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

@XendraTrl(Identifier="c269cb33-c6fd-e332-8d63-223e8d3015a7")
public static String es_PE_FIELD_CashFlowProcessor_Name_Name="Nombre";

@XendraTrl(Identifier="c269cb33-c6fd-e332-8d63-223e8d3015a7")
public static String es_PE_FIELD_CashFlowProcessor_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="c269cb33-c6fd-e332-8d63-223e8d3015a7")
public static String es_PE_FIELD_CashFlowProcessor_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="c8bc9995-6038-b370-4dc6-e520d0abdc10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c269cb33-c6fd-e332-8d63-223e8d3015a7")
public static final String FIELDNAME_CashFlowProcessor_Name="c269cb33-c6fd-e332-8d63-223e8d3015a7";

@XendraTrl(Identifier="925c0cd3-9d8b-fa1f-9ef8-4305751faf42")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="925c0cd3-9d8b-fa1f-9ef8-4305751faf42",
Synchronized="2017-08-28 09:55:27.0")
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

@XendraTrl(Identifier="4c2ba64a-deab-988c-bb0c-610e93332695")
public static String es_PE_FIELD_CashFlowProcessor_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="c8bc9995-6038-b370-4dc6-e520d0abdc10",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4c2ba64a-deab-988c-bb0c-610e93332695")
public static final String FIELDNAME_CashFlowProcessor_ProcessNow="4c2ba64a-deab-988c-bb0c-610e93332695";

@XendraTrl(Identifier="36fabf06-d2a9-e555-6d27-4ac35c2bec5a")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="36fabf06-d2a9-e555-6d27-4ac35c2bec5a",
Synchronized="2017-08-28 09:55:27.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";

/** Supervisor_ID AD_Reference=91f52193-02ab-6545-99f8-d6d30b9d03a1 */
public static final int SUPERVISOR_ID_AD_Reference_ID=286;
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

@XendraTrl(Identifier="0d9b911f-eaa6-43e0-929d-37fd2a24fdae")
public static String es_PE_FIELD_CashFlowProcessor_Supervisor_Name="Supervisor";

@XendraTrl(Identifier="0d9b911f-eaa6-43e0-929d-37fd2a24fdae")
public static String es_PE_FIELD_CashFlowProcessor_Supervisor_Description="Supervisor para este usuario - usado para escalación";

@XendraTrl(Identifier="0d9b911f-eaa6-43e0-929d-37fd2a24fdae")
public static String es_PE_FIELD_CashFlowProcessor_Supervisor_Help="El supervisor indica quien será usado para reenviar y escalar emisiones este usuario.";

@XendraField(AD_Column_ID="Supervisor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c8bc9995-6038-b370-4dc6-e520d0abdc10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0d9b911f-eaa6-43e0-929d-37fd2a24fdae")
public static final String FIELDNAME_CashFlowProcessor_Supervisor="0d9b911f-eaa6-43e0-929d-37fd2a24fdae";

@XendraTrl(Identifier="235052f4-3150-2f06-0112-17c1bbd743ce")
public static String es_PE_COLUMN_Supervisor_ID_Name="Supervisor";

@XendraColumn(AD_Element_ID="cb6ad258-6bb2-80b2-a90f-63c4d947479b",ColumnName="Supervisor_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="91f52193-02ab-6545-99f8-d6d30b9d03a1",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="235052f4-3150-2f06-0112-17c1bbd743ce",Synchronized="2017-08-28 09:55:27.0")
/** Column name Supervisor_ID */
public static final String COLUMNNAME_Supervisor_ID = "Supervisor_ID";
}
