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
/** Generated Model for C_AcctProcessor
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_AcctProcessor extends PO
{
/** Standard Constructor
@param ctx context
@param C_AcctProcessor_ID id
@param trxName transaction
*/
public X_C_AcctProcessor (Properties ctx, int C_AcctProcessor_ID, String trxName)
{
super (ctx, C_AcctProcessor_ID, trxName);
/** if (C_AcctProcessor_ID == 0)
{
setC_AcctProcessor_ID (0);
setFrequency (0);
setFrequencyType (null);
setKeepLogDays (0);	
// 7
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
public X_C_AcctProcessor (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=695 */
public static int Table_ID=MTable.getTable_ID("C_AcctProcessor");

@XendraTrl(Identifier="b9884cac-32a2-1cb4-05e7-bc895727b90f")
public static String es_PE_TAB_AccountingProcessor_Description="Mantener Procesador de contabilidad/Parámetros del servidor";

@XendraTrl(Identifier="b9884cac-32a2-1cb4-05e7-bc895727b90f")
public static String es_PE_TAB_AccountingProcessor_Help="Procesador/Parámetros del servidor";

@XendraTrl(Identifier="b9884cac-32a2-1cb4-05e7-bc895727b90f")
public static String es_PE_TAB_AccountingProcessor_Name="Procesador de Contabilidad";

@XendraTab(Name="Accounting Processor",
Description="Maintain Accounting Processor/Server Parameters",
Help="Accounting Processor/Server Parameters. If no account schema is selected, all accounting schema are processed. If no transaction table is selected, accounting for all transaction is created.",
AD_Window_ID="e1ecf009-9f38-cb92-e627-1b55afb20cc9",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="b9884cac-32a2-1cb4-05e7-bc895727b90f",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_AccountingProcessor="b9884cac-32a2-1cb4-05e7-bc895727b90f";

@XendraTrl(Identifier="fe72f959-e95d-e68a-cc86-cbbf23e31d11")
public static String es_PE_TABLE_C_AcctProcessor_Name="Procesador Contable";

@XendraTable(Name="Accounting Processor",Description="Accounting Processor/Server Parameters",
Help="",TableName="C_AcctProcessor",AccessLevel="2",
AD_Window_ID="e1ecf009-9f38-cb92-e627-1b55afb20cc9",AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="fe72f959-e95d-e68a-cc86-cbbf23e31d11",
Synchronized="2017-10-04 18:36:19.0")
/** TableName=C_AcctProcessor */
public static final String Table_Name="C_AcctProcessor";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_AcctProcessor");

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
    Table_ID = MTable.getTable_ID("C_AcctProcessor");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_AcctProcessor[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="e194178f-bd8c-6ff2-52a6-0c4e78c9efa4")
public static String es_PE_FIELD_AccountingProcessor_Table_Name="Tabla";

@XendraTrl(Identifier="e194178f-bd8c-6ff2-52a6-0c4e78c9efa4")
public static String es_PE_FIELD_AccountingProcessor_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="e194178f-bd8c-6ff2-52a6-0c4e78c9efa4")
public static String es_PE_FIELD_AccountingProcessor_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b9884cac-32a2-1cb4-05e7-bc895727b90f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e194178f-bd8c-6ff2-52a6-0c4e78c9efa4")
public static final String FIELDNAME_AccountingProcessor_Table="e194178f-bd8c-6ff2-52a6-0c4e78c9efa4";

@XendraTrl(Identifier="8ab3eecc-def2-5549-8c25-19b1838f30db")
public static String es_PE_COLUMN_AD_Table_ID_Name="Tabla";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="7dcee7da-621b-b7a7-784d-91a75526fe52",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8ab3eecc-def2-5549-8c25-19b1838f30db",Synchronized="2017-08-28 09:55:08.0")
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

@XendraTrl(Identifier="60adac59-4a6e-4fe4-ac85-ed2b72d97bab")
public static String es_PE_FIELD_AccountingProcessor_Machine_Name="Machine ";

@XendraField(AD_Column_ID="A_Machine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b9884cac-32a2-1cb4-05e7-bc895727b90f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2015-05-01 21:17:54.0",
Identifier="60adac59-4a6e-4fe4-ac85-ed2b72d97bab")
public static final String FIELDNAME_AccountingProcessor_Machine="60adac59-4a6e-4fe4-ac85-ed2b72d97bab";

@XendraTrl(Identifier="8a9f3955-cc11-421b-8cc2-1e473c82d862")
public static String es_PE_COLUMN_A_Machine_ID_Name="Machine ";

@XendraColumn(AD_Element_ID="5ca659c9-c8cc-4dd1-8e7c-ddc2fe399392",ColumnName="A_Machine_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8a9f3955-cc11-421b-8cc2-1e473c82d862",
Synchronized="2017-08-28 09:55:08.0")
/** Column name A_Machine_ID */
public static final String COLUMNNAME_A_Machine_ID = "A_Machine_ID";
/** Set Accounting Processor.
@param C_AcctProcessor_ID Accounting Processor/Server Parameters */
public void setC_AcctProcessor_ID (int C_AcctProcessor_ID)
{
if (C_AcctProcessor_ID < 1) throw new IllegalArgumentException ("C_AcctProcessor_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_AcctProcessor_ID, Integer.valueOf(C_AcctProcessor_ID));
}
/** Get Accounting Processor.
@return Accounting Processor/Server Parameters */
public int getC_AcctProcessor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_AcctProcessor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3646af55-098f-b9d2-c054-de63cea8a45e")
public static String es_PE_FIELD_AccountingProcessor_AccountingProcessor_Name="Procesador Contable";

@XendraTrl(Identifier="3646af55-098f-b9d2-c054-de63cea8a45e")
public static String es_PE_FIELD_AccountingProcessor_AccountingProcessor_Description="Procesador contable / Parámetros del servidor.";

@XendraTrl(Identifier="3646af55-098f-b9d2-c054-de63cea8a45e")
public static String es_PE_FIELD_AccountingProcessor_AccountingProcessor_Help="Procesador contable / Servidor.";

@XendraField(AD_Column_ID="C_AcctProcessor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b9884cac-32a2-1cb4-05e7-bc895727b90f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3646af55-098f-b9d2-c054-de63cea8a45e")
public static final String FIELDNAME_AccountingProcessor_AccountingProcessor="3646af55-098f-b9d2-c054-de63cea8a45e";
/** Column name C_AcctProcessor_ID */
public static final String COLUMNNAME_C_AcctProcessor_ID = "C_AcctProcessor_ID";
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

@XendraTrl(Identifier="316e4291-2084-904c-40fe-8246838af8fa")
public static String es_PE_FIELD_AccountingProcessor_AccountingSchema_Name="Esquema Contable";

@XendraTrl(Identifier="316e4291-2084-904c-40fe-8246838af8fa")
public static String es_PE_FIELD_AccountingProcessor_AccountingSchema_Description="Reglas para contabilizar";

@XendraTrl(Identifier="316e4291-2084-904c-40fe-8246838af8fa")
public static String es_PE_FIELD_AccountingProcessor_AccountingSchema_Help="Un esquema contable define las reglas contables usadas tales como método de costeo; moneda y calendario";

@XendraField(AD_Column_ID="C_AcctSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b9884cac-32a2-1cb4-05e7-bc895727b90f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="316e4291-2084-904c-40fe-8246838af8fa")
public static final String FIELDNAME_AccountingProcessor_AccountingSchema="316e4291-2084-904c-40fe-8246838af8fa";

@XendraTrl(Identifier="09de1a32-ea73-166a-47dd-c7620b28480c")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="09de1a32-ea73-166a-47dd-c7620b28480c",
Synchronized="2017-08-28 09:55:08.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
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

@XendraTrl(Identifier="88aaaab8-70cb-cd91-2689-bde86ad934ce")
public static String es_PE_FIELD_AccountingProcessor_DateLastRun_Name="Última Fecha de Corrida";

@XendraTrl(Identifier="88aaaab8-70cb-cd91-2689-bde86ad934ce")
public static String es_PE_FIELD_AccountingProcessor_DateLastRun_Description="Fecha en que el proceso fue corrido por última vez";

@XendraTrl(Identifier="88aaaab8-70cb-cd91-2689-bde86ad934ce")
public static String es_PE_FIELD_AccountingProcessor_DateLastRun_Help="La fecha de última corrida indica la última vez que se corrió un proceso";

@XendraField(AD_Column_ID="DateLastRun",IsCentrallyMaintained=true,
AD_Tab_ID="b9884cac-32a2-1cb4-05e7-bc895727b90f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="88aaaab8-70cb-cd91-2689-bde86ad934ce")
public static final String FIELDNAME_AccountingProcessor_DateLastRun="88aaaab8-70cb-cd91-2689-bde86ad934ce";

@XendraTrl(Identifier="9f71b8a1-3517-2f57-3bf6-ff6f4ab99ebe")
public static String es_PE_COLUMN_DateLastRun_Name="Última Fecha de Corrida";

@XendraColumn(AD_Element_ID="e4c09739-6370-19ca-fdeb-4cdf8025abb8",ColumnName="DateLastRun",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9f71b8a1-3517-2f57-3bf6-ff6f4ab99ebe",
Synchronized="2017-08-28 09:55:08.0")
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

@XendraTrl(Identifier="89f23ea5-7f32-5256-f74a-598dbd6ee474")
public static String es_PE_FIELD_AccountingProcessor_DateNextRun_Name="Siguiente Fecha de Corrida";

@XendraTrl(Identifier="89f23ea5-7f32-5256-f74a-598dbd6ee474")
public static String es_PE_FIELD_AccountingProcessor_DateNextRun_Description="Fecha en que el proceso será corrido la siguiente vez";

@XendraTrl(Identifier="89f23ea5-7f32-5256-f74a-598dbd6ee474")
public static String es_PE_FIELD_AccountingProcessor_DateNextRun_Help="La fecha de la siguiente corrida indica la siguiente vez que este proceso se correrá.";

@XendraField(AD_Column_ID="DateNextRun",IsCentrallyMaintained=true,
AD_Tab_ID="b9884cac-32a2-1cb4-05e7-bc895727b90f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="89f23ea5-7f32-5256-f74a-598dbd6ee474")
public static final String FIELDNAME_AccountingProcessor_DateNextRun="89f23ea5-7f32-5256-f74a-598dbd6ee474";

@XendraTrl(Identifier="ba394db0-c611-f479-de04-d79d1e5d5778")
public static String es_PE_COLUMN_DateNextRun_Name="Siguiente Fecha de Corrida";

@XendraColumn(AD_Element_ID="215eac34-7f19-f6b2-ebeb-e6fbdb06d7ee",ColumnName="DateNextRun",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ba394db0-c611-f479-de04-d79d1e5d5778",
Synchronized="2017-08-28 09:55:08.0")
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

@XendraTrl(Identifier="2a7d9d1b-8175-8401-5e86-711578a7fab8")
public static String es_PE_FIELD_AccountingProcessor_Description_Name="Observación";

@XendraTrl(Identifier="2a7d9d1b-8175-8401-5e86-711578a7fab8")
public static String es_PE_FIELD_AccountingProcessor_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="2a7d9d1b-8175-8401-5e86-711578a7fab8")
public static String es_PE_FIELD_AccountingProcessor_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="b9884cac-32a2-1cb4-05e7-bc895727b90f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2a7d9d1b-8175-8401-5e86-711578a7fab8")
public static final String FIELDNAME_AccountingProcessor_Description="2a7d9d1b-8175-8401-5e86-711578a7fab8";

@XendraTrl(Identifier="b2e93d1b-33be-cf5f-2f24-b28bebd65a6a")
public static String es_PE_FIELD_CashFlowProcessor_Description_Name="Observación";

@XendraTrl(Identifier="b2e93d1b-33be-cf5f-2f24-b28bebd65a6a")
public static String es_PE_FIELD_CashFlowProcessor_Description_Description="Observación";

@XendraTrl(Identifier="b2e93d1b-33be-cf5f-2f24-b28bebd65a6a")
public static String es_PE_FIELD_CashFlowProcessor_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="c8bc9995-6038-b370-4dc6-e520d0abdc10",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b2e93d1b-33be-cf5f-2f24-b28bebd65a6a")
public static final String FIELDNAME_CashFlowProcessor_Description="b2e93d1b-33be-cf5f-2f24-b28bebd65a6a";

@XendraTrl(Identifier="e4865100-4eea-1703-a08d-da0612d2d37b")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e4865100-4eea-1703-a08d-da0612d2d37b",
Synchronized="2017-08-28 09:55:08.0")
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

@XendraTrl(Identifier="19779c64-4654-eee8-b3a8-4b640b877662")
public static String es_PE_FIELD_AccountingProcessor_Frequency_Name="Frecuencia";

@XendraTrl(Identifier="19779c64-4654-eee8-b3a8-4b640b877662")
public static String es_PE_FIELD_AccountingProcessor_Frequency_Description="Frecuencia de proceso del requerimiento";

@XendraTrl(Identifier="19779c64-4654-eee8-b3a8-4b640b877662")
public static String es_PE_FIELD_AccountingProcessor_Frequency_Help="La Frecuencia se usa junto con el tipo de frecuencia para determinar cuando un requerimiento será procesado.";

@XendraField(AD_Column_ID="Frequency",IsCentrallyMaintained=true,
AD_Tab_ID="b9884cac-32a2-1cb4-05e7-bc895727b90f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="19779c64-4654-eee8-b3a8-4b640b877662")
public static final String FIELDNAME_AccountingProcessor_Frequency="19779c64-4654-eee8-b3a8-4b640b877662";

@XendraTrl(Identifier="7ebc368d-e729-6418-36b3-b3abfa08abfd")
public static String es_PE_COLUMN_Frequency_Name="Frecuencia";

@XendraColumn(AD_Element_ID="cd717b11-c45b-527f-9abd-4533f87b759f",ColumnName="Frequency",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7ebc368d-e729-6418-36b3-b3abfa08abfd",
Synchronized="2017-08-28 09:55:08.0")
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

@XendraTrl(Identifier="f64211aa-5582-4048-8caa-34c598047bff")
public static String es_PE_COLUMN_FrequencyStartAt_Name="FrequencyStartAt";

@XendraColumn(AD_Element_ID="42d884cb-6480-428f-bef3-5e0802c0de5b",ColumnName="FrequencyStartAt",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f64211aa-5582-4048-8caa-34c598047bff",
Synchronized="2017-10-04 18:29:49.0")
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

@XendraTrl(Identifier="4bfd5a98-f846-415f-e2a3-260f59f10507")
public static String es_PE_FIELD_AccountingProcessor_FrequencyType_Name="Tipo de Frecuencia";

@XendraTrl(Identifier="4bfd5a98-f846-415f-e2a3-260f59f10507")
public static String es_PE_FIELD_AccountingProcessor_FrequencyType_Description="Frecuencia de cálculo";

@XendraTrl(Identifier="4bfd5a98-f846-415f-e2a3-260f59f10507")
public static String es_PE_FIELD_AccountingProcessor_FrequencyType_Help="El Tipo de frecuencia se usa para calcular las fechas de inicio y fin del cálculo";

@XendraField(AD_Column_ID="FrequencyType",IsCentrallyMaintained=true,
AD_Tab_ID="b9884cac-32a2-1cb4-05e7-bc895727b90f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4bfd5a98-f846-415f-e2a3-260f59f10507")
public static final String FIELDNAME_AccountingProcessor_FrequencyType="4bfd5a98-f846-415f-e2a3-260f59f10507";

@XendraTrl(Identifier="9e8c0528-8c20-ef50-64c8-b88a9e98e2c8")
public static String es_PE_COLUMN_FrequencyType_Name="Tipo de Frecuencia";

@XendraColumn(AD_Element_ID="d2dcc6d7-4c3b-0646-5dc8-3df7514121af",ColumnName="FrequencyType",
AD_Reference_ID=17,AD_Reference_Value_ID="a8e24598-16fb-a392-7587-12a112938032",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9e8c0528-8c20-ef50-64c8-b88a9e98e2c8",Synchronized="2017-08-28 09:55:08.0")
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
@XendraTrl(Identifier="8e9dce45-6e6d-41bf-9ed8-b8abb6109f6e")
public static String es_PE_FIELD_AccountingProcessor_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="b9884cac-32a2-1cb4-05e7-bc895727b90f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2015-05-01 21:17:54.0",
Identifier="8e9dce45-6e6d-41bf-9ed8-b8abb6109f6e")
public static final String FIELDNAME_AccountingProcessor_Identifier="8e9dce45-6e6d-41bf-9ed8-b8abb6109f6e";

@XendraTrl(Identifier="5d553cdd-f1d6-4c95-818e-36844e59989d")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5d553cdd-f1d6-4c95-818e-36844e59989d",
Synchronized="2017-08-28 09:55:08.0")
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

@XendraTrl(Identifier="9ebb0372-5152-c812-8d68-3e3307ab366c")
public static String es_PE_FIELD_AccountingProcessor_DaysToKeepLog_Name="Días para guardar el registro";

@XendraTrl(Identifier="9ebb0372-5152-c812-8d68-3e3307ab366c")
public static String es_PE_FIELD_AccountingProcessor_DaysToKeepLog_Description="Número de días para guardar las entradas del registro";

@XendraTrl(Identifier="9ebb0372-5152-c812-8d68-3e3307ab366c")
public static String es_PE_FIELD_AccountingProcessor_DaysToKeepLog_Help="Las entradas de un registro mas viejo pueden ser suprimidas";

@XendraField(AD_Column_ID="KeepLogDays",IsCentrallyMaintained=true,
AD_Tab_ID="b9884cac-32a2-1cb4-05e7-bc895727b90f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9ebb0372-5152-c812-8d68-3e3307ab366c")
public static final String FIELDNAME_AccountingProcessor_DaysToKeepLog="9ebb0372-5152-c812-8d68-3e3307ab366c";

@XendraTrl(Identifier="03af0ddd-3c21-eaf7-6531-e6d7ac766e9b")
public static String es_PE_COLUMN_KeepLogDays_Name="Días para guardar el registro";

@XendraColumn(AD_Element_ID="5f6abdde-d6c5-cc1d-af35-b05c5b66edd5",ColumnName="KeepLogDays",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="7",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="03af0ddd-3c21-eaf7-6531-e6d7ac766e9b",
Synchronized="2017-08-28 09:55:08.0")
/** Column name KeepLogDays */
public static final String COLUMNNAME_KeepLogDays = "KeepLogDays";
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

@XendraTrl(Identifier="338b9a56-fad7-bc54-78bc-573b8c4f2714")
public static String es_PE_FIELD_AccountingProcessor_Name_Name="Nombre";

@XendraTrl(Identifier="338b9a56-fad7-bc54-78bc-573b8c4f2714")
public static String es_PE_FIELD_AccountingProcessor_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="338b9a56-fad7-bc54-78bc-573b8c4f2714")
public static String es_PE_FIELD_AccountingProcessor_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="b9884cac-32a2-1cb4-05e7-bc895727b90f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="338b9a56-fad7-bc54-78bc-573b8c4f2714")
public static final String FIELDNAME_AccountingProcessor_Name="338b9a56-fad7-bc54-78bc-573b8c4f2714";

@XendraTrl(Identifier="b878d0a2-e1eb-b309-bc38-9dad998032f5")
public static String es_PE_FIELD_CashFlowProcessor_Name_Name="Nombre";

@XendraTrl(Identifier="b878d0a2-e1eb-b309-bc38-9dad998032f5")
public static String es_PE_FIELD_CashFlowProcessor_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="b878d0a2-e1eb-b309-bc38-9dad998032f5")
public static String es_PE_FIELD_CashFlowProcessor_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="c8bc9995-6038-b370-4dc6-e520d0abdc10",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b878d0a2-e1eb-b309-bc38-9dad998032f5")
public static final String FIELDNAME_CashFlowProcessor_Name="b878d0a2-e1eb-b309-bc38-9dad998032f5";

@XendraTrl(Identifier="6f8b78c6-45c6-796c-0707-bc7c953074d8")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6f8b78c6-45c6-796c-0707-bc7c953074d8",
Synchronized="2017-08-28 09:55:08.0")
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

@XendraTrl(Identifier="740d556c-66f3-e216-e2ad-73a416322ab4")
public static String es_PE_FIELD_AccountingProcessor_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="b9884cac-32a2-1cb4-05e7-bc895727b90f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="740d556c-66f3-e216-e2ad-73a416322ab4")
public static final String FIELDNAME_AccountingProcessor_ProcessNow="740d556c-66f3-e216-e2ad-73a416322ab4";

@XendraTrl(Identifier="cf258293-a079-68df-fee9-ddfb8844a737")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cf258293-a079-68df-fee9-ddfb8844a737",
Synchronized="2017-08-28 09:55:08.0")
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

@XendraTrl(Identifier="e5f232f6-de6a-173e-864c-5d249dbcc9c8")
public static String es_PE_FIELD_AccountingProcessor_Supervisor_Name="Supervisor";

@XendraTrl(Identifier="e5f232f6-de6a-173e-864c-5d249dbcc9c8")
public static String es_PE_FIELD_AccountingProcessor_Supervisor_Description="Supervisor para este usuario - usado para escalación";

@XendraTrl(Identifier="e5f232f6-de6a-173e-864c-5d249dbcc9c8")
public static String es_PE_FIELD_AccountingProcessor_Supervisor_Help="El supervisor indica quien será usado para reenviar y escalar emisiones este usuario.";

@XendraField(AD_Column_ID="Supervisor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b9884cac-32a2-1cb4-05e7-bc895727b90f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e5f232f6-de6a-173e-864c-5d249dbcc9c8")
public static final String FIELDNAME_AccountingProcessor_Supervisor="e5f232f6-de6a-173e-864c-5d249dbcc9c8";

@XendraTrl(Identifier="ff78a32f-f6e0-59a1-df1b-25a4454f4097")
public static String es_PE_COLUMN_Supervisor_ID_Name="Supervisor";

@XendraColumn(AD_Element_ID="cb6ad258-6bb2-80b2-a90f-63c4d947479b",ColumnName="Supervisor_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="91f52193-02ab-6545-99f8-d6d30b9d03a1",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ff78a32f-f6e0-59a1-df1b-25a4454f4097",Synchronized="2017-08-28 09:55:08.0")
/** Column name Supervisor_ID */
public static final String COLUMNNAME_Supervisor_ID = "Supervisor_ID";
}
