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
/** Generated Model for C_InvoiceSchedule
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_InvoiceSchedule extends PO
{
/** Standard Constructor
@param ctx context
@param C_InvoiceSchedule_ID id
@param trxName transaction
*/
public X_C_InvoiceSchedule (Properties ctx, int C_InvoiceSchedule_ID, String trxName)
{
super (ctx, C_InvoiceSchedule_ID, trxName);
/** if (C_InvoiceSchedule_ID == 0)
{
setAmt (Env.ZERO);	
// 0
setC_InvoiceSchedule_ID (0);
setInvoiceDay (0);	
// 1
setInvoiceFrequency (null);
setInvoiceWeekDay (null);
setIsAmount (false);	
// N
setIsDefault (false);	
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
public X_C_InvoiceSchedule (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=257 */
public static int Table_ID=MTable.getTable_ID("C_InvoiceSchedule");

@XendraTrl(Identifier="c6b53d53-e99b-1572-66eb-fbec2fc71806")
public static String es_PE_TAB_InvoiceSchedule_Description="Definir Programa de Facturación";

@XendraTrl(Identifier="c6b53d53-e99b-1572-66eb-fbec2fc71806")
public static String es_PE_TAB_InvoiceSchedule_Help="La planilla de programa de facturación define la frecuencia con la cual los lotes de facturas serán generados para un socio de negocio.";

@XendraTrl(Identifier="c6b53d53-e99b-1572-66eb-fbec2fc71806")
public static String es_PE_TAB_InvoiceSchedule_Name="Programa de Facturas";

@XendraTab(Name="Invoice Schedule",Description="Define Invoice Schedule",
Help="The Invoice Schedule Tab defines the frequency for which batch invoices will be generated for a Business Partner.",
AD_Window_ID="9d4cb53b-a08d-6979-3454-3db6a6453f60",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="c6b53d53-e99b-1572-66eb-fbec2fc71806",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_InvoiceSchedule="c6b53d53-e99b-1572-66eb-fbec2fc71806";

@XendraTrl(Identifier="fcdd7fa5-0ff8-5060-b7fe-db67e91e4ec8")
public static String es_PE_TABLE_C_InvoiceSchedule_Name="Programa de Facturación";

@XendraTable(Name="Invoice Schedule",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Schedule for generating Invoices",
Help="",TableName="C_InvoiceSchedule",AccessLevel="3",
AD_Window_ID="9d4cb53b-a08d-6979-3454-3db6a6453f60",AD_Val_Rule_ID="",IsKey=1,LoadSeq=65,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="fcdd7fa5-0ff8-5060-b7fe-db67e91e4ec8",
Synchronized="2020-03-03 21:37:05.0")
/** TableName=C_InvoiceSchedule */
public static final String Table_Name="C_InvoiceSchedule";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_InvoiceSchedule");

protected BigDecimal accessLevel = BigDecimal.valueOf(3);
/** AccessLevel
@return 3 - Client - Org 
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
    Table_ID = MTable.getTable_ID("C_InvoiceSchedule");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_InvoiceSchedule[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Amount.
@param Amt Amount */
public void setAmt (BigDecimal Amt)
{
if (Amt == null) throw new IllegalArgumentException ("Amt is mandatory.");
set_Value (COLUMNNAME_Amt, Amt);
}
/** Get Amount.
@return Amount */
public BigDecimal getAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="fd98dd24-64c7-9b87-172e-7728fe32dbe4")
public static String es_PE_FIELD_InvoiceSchedule_Amount_Name="Total";

@XendraTrl(Identifier="fd98dd24-64c7-9b87-172e-7728fe32dbe4")
public static String es_PE_FIELD_InvoiceSchedule_Amount_Description="Total límite para el envío de facturas";

@XendraTrl(Identifier="fd98dd24-64c7-9b87-172e-7728fe32dbe4")
public static String es_PE_FIELD_InvoiceSchedule_Amount_Help="El campo total indica el límite en el que las facturas no serán generadas. Si el total total de la factura esta por debajo de este total; la factura  no será enviada en esta corrida programada. Este campo es solamente desplegado si el cuadro de verificación de total límite es seleccionado";

@XendraField(AD_Column_ID="Amt",IsCentrallyMaintained=true,
AD_Tab_ID="c6b53d53-e99b-1572-66eb-fbec2fc71806",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsAmount@='Y'",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fd98dd24-64c7-9b87-172e-7728fe32dbe4")
public static final String FIELDNAME_InvoiceSchedule_Amount="fd98dd24-64c7-9b87-172e-7728fe32dbe4";

@XendraTrl(Identifier="9124d734-be41-1931-326d-3ece6fbcf934")
public static String es_PE_COLUMN_Amt_Name="Total";

@XendraColumn(AD_Element_ID="42827f15-aceb-2f14-cc38-b4a7c6022136",ColumnName="Amt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9124d734-be41-1931-326d-3ece6fbcf934",
Synchronized="2019-08-30 22:21:43.0")
/** Column name Amt */
public static final String COLUMNNAME_Amt = "Amt";
/** Set Invoice Schedule.
@param C_InvoiceSchedule_ID Schedule for generating Invoices */
public void setC_InvoiceSchedule_ID (int C_InvoiceSchedule_ID)
{
if (C_InvoiceSchedule_ID < 1) throw new IllegalArgumentException ("C_InvoiceSchedule_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_InvoiceSchedule_ID, Integer.valueOf(C_InvoiceSchedule_ID));
}
/** Get Invoice Schedule.
@return Schedule for generating Invoices */
public int getC_InvoiceSchedule_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_InvoiceSchedule_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="078f70df-df99-2e5c-fdea-a404c95230d6")
public static String es_PE_FIELD_InvoiceSchedule_InvoiceSchedule_Name="Programa de Facturación";

@XendraTrl(Identifier="078f70df-df99-2e5c-fdea-a404c95230d6")
public static String es_PE_FIELD_InvoiceSchedule_InvoiceSchedule_Description="Programa para generar facturas";

@XendraTrl(Identifier="078f70df-df99-2e5c-fdea-a404c95230d6")
public static String es_PE_FIELD_InvoiceSchedule_InvoiceSchedule_Help="El programa de facturación identifica la frecuencia usada cuando se generan facturas.";

@XendraField(AD_Column_ID="C_InvoiceSchedule_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c6b53d53-e99b-1572-66eb-fbec2fc71806",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="078f70df-df99-2e5c-fdea-a404c95230d6")
public static final String FIELDNAME_InvoiceSchedule_InvoiceSchedule="078f70df-df99-2e5c-fdea-a404c95230d6";
/** Column name C_InvoiceSchedule_ID */
public static final String COLUMNNAME_C_InvoiceSchedule_ID = "C_InvoiceSchedule_ID";
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

@XendraTrl(Identifier="79dc48ea-1900-33c4-78ba-743b8731e2c3")
public static String es_PE_FIELD_InvoiceSchedule_Description_Name="Observación";

@XendraTrl(Identifier="79dc48ea-1900-33c4-78ba-743b8731e2c3")
public static String es_PE_FIELD_InvoiceSchedule_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="79dc48ea-1900-33c4-78ba-743b8731e2c3")
public static String es_PE_FIELD_InvoiceSchedule_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="c6b53d53-e99b-1572-66eb-fbec2fc71806",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="79dc48ea-1900-33c4-78ba-743b8731e2c3")
public static final String FIELDNAME_InvoiceSchedule_Description="79dc48ea-1900-33c4-78ba-743b8731e2c3";

@XendraTrl(Identifier="58d692ec-a38a-69fc-709e-2bd87529296f")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="58d692ec-a38a-69fc-709e-2bd87529296f",
Synchronized="2019-08-30 22:21:43.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Invoice on even weeks.
@param EvenInvoiceWeek Send invoices on even weeks */
public void setEvenInvoiceWeek (boolean EvenInvoiceWeek)
{
set_Value (COLUMNNAME_EvenInvoiceWeek, Boolean.valueOf(EvenInvoiceWeek));
}
/** Get Invoice on even weeks.
@return Send invoices on even weeks */
public boolean isEvenInvoiceWeek() 
{
Object oo = get_Value(COLUMNNAME_EvenInvoiceWeek);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="5d4730fa-9078-d4ac-47bb-137ca8acc041")
public static String es_PE_FIELD_InvoiceSchedule_InvoiceOnEvenWeeks_Name="Factura en Semanas Pares";

@XendraTrl(Identifier="5d4730fa-9078-d4ac-47bb-137ca8acc041")
public static String es_PE_FIELD_InvoiceSchedule_InvoiceOnEvenWeeks_Description="Enviar facturas en semanas pares";

@XendraTrl(Identifier="5d4730fa-9078-d4ac-47bb-137ca8acc041")
public static String es_PE_FIELD_InvoiceSchedule_InvoiceOnEvenWeeks_Help="El cuadro de verificación factura en semanas pares indica si las facturas bisemanales deben ser enviadas en números pares de semanas.";

@XendraField(AD_Column_ID="EvenInvoiceWeek",IsCentrallyMaintained=true,
AD_Tab_ID="c6b53d53-e99b-1572-66eb-fbec2fc71806",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@InvoiceFrequency@=B",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="5d4730fa-9078-d4ac-47bb-137ca8acc041")
public static final String FIELDNAME_InvoiceSchedule_InvoiceOnEvenWeeks="5d4730fa-9078-d4ac-47bb-137ca8acc041";

@XendraTrl(Identifier="45090adc-7176-30a7-8beb-3e4de46cedea")
public static String es_PE_COLUMN_EvenInvoiceWeek_Name="Factura en Semanas Pares";

@XendraColumn(AD_Element_ID="23cb15b8-9e16-aecf-6c1a-c9af6fe2426e",ColumnName="EvenInvoiceWeek",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="45090adc-7176-30a7-8beb-3e4de46cedea",
Synchronized="2019-08-30 22:21:44.0")
/** Column name EvenInvoiceWeek */
public static final String COLUMNNAME_EvenInvoiceWeek = "EvenInvoiceWeek";
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
@XendraTrl(Identifier="103f06cd-f8f5-4c56-99a2-8a975d3e2009")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="103f06cd-f8f5-4c56-99a2-8a975d3e2009",
Synchronized="2019-08-30 22:21:44.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Invoice Day.
@param InvoiceDay Day of Invoice Generation */
public void setInvoiceDay (int InvoiceDay)
{
set_Value (COLUMNNAME_InvoiceDay, Integer.valueOf(InvoiceDay));
}
/** Get Invoice Day.
@return Day of Invoice Generation */
public int getInvoiceDay() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_InvoiceDay);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d12bdc25-f010-5739-08ab-40e0d4689710")
public static String es_PE_FIELD_InvoiceSchedule_InvoiceDay_Name="Día de la Factura";

@XendraTrl(Identifier="d12bdc25-f010-5739-08ab-40e0d4689710")
public static String es_PE_FIELD_InvoiceSchedule_InvoiceDay_Description="Día de generación de la factura";

@XendraTrl(Identifier="d12bdc25-f010-5739-08ab-40e0d4689710")
public static String es_PE_FIELD_InvoiceSchedule_InvoiceDay_Help="El día de facturación indica el día de generación de las facturas. Si es dos veces al mes el segundo día es 15 días después de este día";

@XendraField(AD_Column_ID="InvoiceDay",IsCentrallyMaintained=true,
AD_Tab_ID="c6b53d53-e99b-1572-66eb-fbec2fc71806",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@InvoiceFrequency@=M | @InvoiceFrequency@=T",DisplayLength=11,IsReadOnly=false,
SeqNo=140,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d12bdc25-f010-5739-08ab-40e0d4689710")
public static final String FIELDNAME_InvoiceSchedule_InvoiceDay="d12bdc25-f010-5739-08ab-40e0d4689710";

@XendraTrl(Identifier="f19b0cf9-ad2a-5065-79ae-62dd022e2fc6")
public static String es_PE_COLUMN_InvoiceDay_Name="Día de la Factura";

@XendraColumn(AD_Element_ID="60cc3f54-9913-6937-f6af-aa87e6bfd67f",ColumnName="InvoiceDay",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="1",ValueMax="31",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f19b0cf9-ad2a-5065-79ae-62dd022e2fc6",
Synchronized="2019-08-30 22:21:44.0")
/** Column name InvoiceDay */
public static final String COLUMNNAME_InvoiceDay = "InvoiceDay";
/** Set Invoice day cut-off.
@param InvoiceDayCutoff Last day for including shipments */
public void setInvoiceDayCutoff (int InvoiceDayCutoff)
{
set_Value (COLUMNNAME_InvoiceDayCutoff, Integer.valueOf(InvoiceDayCutoff));
}
/** Get Invoice day cut-off.
@return Last day for including shipments */
public int getInvoiceDayCutoff() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_InvoiceDayCutoff);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b8d26299-bd1b-e34c-9487-946d44b73c7d")
public static String es_PE_FIELD_InvoiceSchedule_InvoiceDayCut_Off_Name="Día de Corte para Factura";

@XendraTrl(Identifier="b8d26299-bd1b-e34c-9487-946d44b73c7d")
public static String es_PE_FIELD_InvoiceSchedule_InvoiceDayCut_Off_Description="Último día para que las entregas sean incluidas";

@XendraTrl(Identifier="b8d26299-bd1b-e34c-9487-946d44b73c7d")
public static String es_PE_FIELD_InvoiceSchedule_InvoiceDayCut_Off_Help="El Corte del día de factura indica el último día para que las entregas sean incluidas en el programa de facturas actual . Por ej. Si el programa de facturación se define para el primer día del mes ; día del corte puede ser el 25 del mes.";

@XendraField(AD_Column_ID="InvoiceDayCutoff",IsCentrallyMaintained=true,
AD_Tab_ID="c6b53d53-e99b-1572-66eb-fbec2fc71806",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@InvoiceFrequency@=M | @InvoiceFrequency@=T",DisplayLength=11,IsReadOnly=false,
SeqNo=150,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b8d26299-bd1b-e34c-9487-946d44b73c7d")
public static final String FIELDNAME_InvoiceSchedule_InvoiceDayCut_Off="b8d26299-bd1b-e34c-9487-946d44b73c7d";

@XendraTrl(Identifier="da9d2bb5-0bc5-65aa-45f3-56f6daa45de9")
public static String es_PE_COLUMN_InvoiceDayCutoff_Name="Día de Corte para Factura";

@XendraColumn(AD_Element_ID="16f85044-54df-2ce9-23c4-9d3ed1224d3b",ColumnName="InvoiceDayCutoff",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="1",ValueMax="31",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="da9d2bb5-0bc5-65aa-45f3-56f6daa45de9",
Synchronized="2019-08-30 22:21:44.0")
/** Column name InvoiceDayCutoff */
public static final String COLUMNNAME_InvoiceDayCutoff = "InvoiceDayCutoff";
/** Set Invoice Frequency.
@param InvoiceFrequency How often invoices will be generated */
public void setInvoiceFrequency (String InvoiceFrequency)
{
if (InvoiceFrequency.length() > 1)
{
log.warning("Length > 1 - truncated");
InvoiceFrequency = InvoiceFrequency.substring(0,0);
}
set_Value (COLUMNNAME_InvoiceFrequency, InvoiceFrequency);
}
/** Get Invoice Frequency.
@return How often invoices will be generated */
public String getInvoiceFrequency() 
{
return (String)get_Value(COLUMNNAME_InvoiceFrequency);
}

@XendraTrl(Identifier="a6bb7914-9222-46a1-0054-9ea89b6361c2")
public static String es_PE_FIELD_InvoiceSchedule_InvoiceFrequency_Name="Frecuencia de Factura";

@XendraTrl(Identifier="a6bb7914-9222-46a1-0054-9ea89b6361c2")
public static String es_PE_FIELD_InvoiceSchedule_InvoiceFrequency_Description="Frecuencia con que las facturas serán generadas";

@XendraTrl(Identifier="a6bb7914-9222-46a1-0054-9ea89b6361c2")
public static String es_PE_FIELD_InvoiceSchedule_InvoiceFrequency_Help="La frecuencia de facturación indica la frecuencia de generación de facturas para un socio de negocio";

@XendraField(AD_Column_ID="InvoiceFrequency",IsCentrallyMaintained=true,
AD_Tab_ID="c6b53d53-e99b-1572-66eb-fbec2fc71806",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a6bb7914-9222-46a1-0054-9ea89b6361c2")
public static final String FIELDNAME_InvoiceSchedule_InvoiceFrequency="a6bb7914-9222-46a1-0054-9ea89b6361c2";

@XendraTrl(Identifier="7ab1c775-acdb-a3f8-d9de-187dc471a126")
public static String es_PE_COLUMN_InvoiceFrequency_Name="Frecuencia de Factura";

@XendraColumn(AD_Element_ID="d37385f1-6e30-66db-aef4-435a1c69bf72",ColumnName="InvoiceFrequency",
AD_Reference_ID=17,AD_Reference_Value_ID="67d6fd18-7cd1-74b1-b3fb-3a7a52814403",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7ab1c775-acdb-a3f8-d9de-187dc471a126",Synchronized="2019-08-30 22:21:44.0")
/** Column name InvoiceFrequency */
public static final String COLUMNNAME_InvoiceFrequency = "InvoiceFrequency";
/** Set Invoice Week Day.
@param InvoiceWeekDay Day to generate invoices */
public void setInvoiceWeekDay (String InvoiceWeekDay)
{
if (InvoiceWeekDay.length() > 1)
{
log.warning("Length > 1 - truncated");
InvoiceWeekDay = InvoiceWeekDay.substring(0,0);
}
set_Value (COLUMNNAME_InvoiceWeekDay, InvoiceWeekDay);
}
/** Get Invoice Week Day.
@return Day to generate invoices */
public String getInvoiceWeekDay() 
{
return (String)get_Value(COLUMNNAME_InvoiceWeekDay);
}

@XendraTrl(Identifier="848f84b4-61c9-a4d2-6202-287abc3914ce")
public static String es_PE_FIELD_InvoiceSchedule_InvoiceWeekDay_Name="Día de la Semana para Facturar";

@XendraTrl(Identifier="848f84b4-61c9-a4d2-6202-287abc3914ce")
public static String es_PE_FIELD_InvoiceSchedule_InvoiceWeekDay_Description="Día de la semana para generar facturas";

@XendraTrl(Identifier="848f84b4-61c9-a4d2-6202-287abc3914ce")
public static String es_PE_FIELD_InvoiceSchedule_InvoiceWeekDay_Help="El día de la semana de facturación indica el día de la semana para generar facturas";

@XendraField(AD_Column_ID="InvoiceWeekDay",IsCentrallyMaintained=true,
AD_Tab_ID="c6b53d53-e99b-1572-66eb-fbec2fc71806",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@InvoiceFrequency@=W",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="848f84b4-61c9-a4d2-6202-287abc3914ce")
public static final String FIELDNAME_InvoiceSchedule_InvoiceWeekDay="848f84b4-61c9-a4d2-6202-287abc3914ce";

@XendraTrl(Identifier="1d31ce0f-4df5-57e7-49ee-202109b91000")
public static String es_PE_COLUMN_InvoiceWeekDay_Name="Día de la Semana para Facturar";

@XendraColumn(AD_Element_ID="970bc925-f7c2-cd7e-82f5-b86287e9f9fd",ColumnName="InvoiceWeekDay",
AD_Reference_ID=17,AD_Reference_Value_ID="83e938bc-4a87-77a1-cbb0-83c31065e487",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="1d31ce0f-4df5-57e7-49ee-202109b91000",Synchronized="2019-08-30 22:21:44.0")
/** Column name InvoiceWeekDay */
public static final String COLUMNNAME_InvoiceWeekDay = "InvoiceWeekDay";
/** Set Invoice weekday cutoff.
@param InvoiceWeekDayCutoff Last day in the week for shipments to be included */
public void setInvoiceWeekDayCutoff (String InvoiceWeekDayCutoff)
{
if (InvoiceWeekDayCutoff != null && InvoiceWeekDayCutoff.length() > 1)
{
log.warning("Length > 1 - truncated");
InvoiceWeekDayCutoff = InvoiceWeekDayCutoff.substring(0,0);
}
set_Value (COLUMNNAME_InvoiceWeekDayCutoff, InvoiceWeekDayCutoff);
}
/** Get Invoice weekday cutoff.
@return Last day in the week for shipments to be included */
public String getInvoiceWeekDayCutoff() 
{
return (String)get_Value(COLUMNNAME_InvoiceWeekDayCutoff);
}

@XendraTrl(Identifier="780448ba-f9d2-6edf-1b38-ae2235f7158e")
public static String es_PE_FIELD_InvoiceSchedule_InvoiceWeekdayCutoff_Name="Día de la Semana de Corte para Factura";

@XendraTrl(Identifier="780448ba-f9d2-6edf-1b38-ae2235f7158e")
public static String es_PE_FIELD_InvoiceSchedule_InvoiceWeekdayCutoff_Description="Último día en la semana para que las entregas sean incluidas";

@XendraTrl(Identifier="780448ba-f9d2-6edf-1b38-ae2235f7158e")
public static String es_PE_FIELD_InvoiceSchedule_InvoiceWeekdayCutoff_Help="El corte del día de la semana para facturación indica el último día de la semana en que una entrega pueda ser hecha para ser incluida en el programa de facturación";

@XendraField(AD_Column_ID="InvoiceWeekDayCutoff",IsCentrallyMaintained=true,
AD_Tab_ID="c6b53d53-e99b-1572-66eb-fbec2fc71806",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@InvoiceFrequency@=W",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="780448ba-f9d2-6edf-1b38-ae2235f7158e")
public static final String FIELDNAME_InvoiceSchedule_InvoiceWeekdayCutoff="780448ba-f9d2-6edf-1b38-ae2235f7158e";

@XendraTrl(Identifier="f9a121b6-7ab4-5be2-c59f-70f514cc2122")
public static String es_PE_COLUMN_InvoiceWeekDayCutoff_Name="Día de la Semana de Corte para Factura";

@XendraColumn(AD_Element_ID="ddf86952-1482-24a0-fdba-b44b499a4dd4",
ColumnName="InvoiceWeekDayCutoff",AD_Reference_ID=17,
AD_Reference_Value_ID="83e938bc-4a87-77a1-cbb0-83c31065e487",AD_Val_Rule_ID="",FieldLength=1,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="f9a121b6-7ab4-5be2-c59f-70f514cc2122",
Synchronized="2019-08-30 22:21:44.0")
/** Column name InvoiceWeekDayCutoff */
public static final String COLUMNNAME_InvoiceWeekDayCutoff = "InvoiceWeekDayCutoff";
/** Set Amount Limit.
@param IsAmount Send invoices only if the amount exceeds the limit */
public void setIsAmount (boolean IsAmount)
{
set_Value (COLUMNNAME_IsAmount, Boolean.valueOf(IsAmount));
}
/** Get Amount Limit.
@return Send invoices only if the amount exceeds the limit */
public boolean isAmount() 
{
Object oo = get_Value(COLUMNNAME_IsAmount);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="d3bc3587-5587-2a2c-768e-9d9aeefbdff2")
public static String es_PE_FIELD_InvoiceSchedule_AmountLimit_Name="Total Límite";

@XendraTrl(Identifier="d3bc3587-5587-2a2c-768e-9d9aeefbdff2")
public static String es_PE_FIELD_InvoiceSchedule_AmountLimit_Description="Enviar facturas solamente si el total excede el límite";

@XendraTrl(Identifier="d3bc3587-5587-2a2c-768e-9d9aeefbdff2")
public static String es_PE_FIELD_InvoiceSchedule_AmountLimit_Help="El cuadro de verificación total límite indica si las facturas serán enviadas si ellas están por debajo del límite introducido";

@XendraField(AD_Column_ID="IsAmount",IsCentrallyMaintained=true,
AD_Tab_ID="c6b53d53-e99b-1572-66eb-fbec2fc71806",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d3bc3587-5587-2a2c-768e-9d9aeefbdff2")
public static final String FIELDNAME_InvoiceSchedule_AmountLimit="d3bc3587-5587-2a2c-768e-9d9aeefbdff2";

@XendraTrl(Identifier="9eed1fba-eca9-57cc-9fff-90bba55f9e74")
public static String es_PE_COLUMN_IsAmount_Name="Total Límite";

@XendraColumn(AD_Element_ID="98c578ab-a272-5009-abc1-f12df9e9ff0c",ColumnName="IsAmount",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9eed1fba-eca9-57cc-9fff-90bba55f9e74",
Synchronized="2019-08-30 22:21:44.0")
/** Column name IsAmount */
public static final String COLUMNNAME_IsAmount = "IsAmount";
/** Set Default.
@param IsDefault Default value */
public void setIsDefault (boolean IsDefault)
{
set_Value (COLUMNNAME_IsDefault, Boolean.valueOf(IsDefault));
}
/** Get Default.
@return Default value */
public boolean isDefault() 
{
Object oo = get_Value(COLUMNNAME_IsDefault);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="a67e62dc-3132-54a4-1c22-0eb0e3edfb6f")
public static String es_PE_FIELD_InvoiceSchedule_Default_Name="Predeterminado";

@XendraTrl(Identifier="a67e62dc-3132-54a4-1c22-0eb0e3edfb6f")
public static String es_PE_FIELD_InvoiceSchedule_Default_Description="Valor Predeterminado";

@XendraTrl(Identifier="a67e62dc-3132-54a4-1c22-0eb0e3edfb6f")
public static String es_PE_FIELD_InvoiceSchedule_Default_Help="El cuadro de verificación indica si este registro será usado como un valor predeterminado";

@XendraField(AD_Column_ID="IsDefault",IsCentrallyMaintained=true,
AD_Tab_ID="c6b53d53-e99b-1572-66eb-fbec2fc71806",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a67e62dc-3132-54a4-1c22-0eb0e3edfb6f")
public static final String FIELDNAME_InvoiceSchedule_Default="a67e62dc-3132-54a4-1c22-0eb0e3edfb6f";

@XendraTrl(Identifier="07016b93-0c54-eb1b-3e22-e1a3d6bf0dfb")
public static String es_PE_COLUMN_IsDefault_Name="Predeterminado";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="07016b93-0c54-eb1b-3e22-e1a3d6bf0dfb",
Synchronized="2019-08-30 22:21:44.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
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

@XendraTrl(Identifier="2ffeca3b-567d-483d-4e74-63428495d4bb")
public static String es_PE_FIELD_InvoiceSchedule_Name_Name="Nombre";

@XendraTrl(Identifier="2ffeca3b-567d-483d-4e74-63428495d4bb")
public static String es_PE_FIELD_InvoiceSchedule_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="2ffeca3b-567d-483d-4e74-63428495d4bb")
public static String es_PE_FIELD_InvoiceSchedule_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="c6b53d53-e99b-1572-66eb-fbec2fc71806",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2ffeca3b-567d-483d-4e74-63428495d4bb")
public static final String FIELDNAME_InvoiceSchedule_Name="2ffeca3b-567d-483d-4e74-63428495d4bb";

@XendraTrl(Identifier="a03c280e-bdb9-1cd3-4517-77410a82dc6f")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a03c280e-bdb9-1cd3-4517-77410a82dc6f",
Synchronized="2019-08-30 22:21:44.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
