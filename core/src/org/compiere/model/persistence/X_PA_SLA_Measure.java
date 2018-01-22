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
/** Generated Model for PA_SLA_Measure
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_PA_SLA_Measure extends PO
{
/** Standard Constructor
@param ctx context
@param PA_SLA_Measure_ID id
@param trxName transaction
*/
public X_PA_SLA_Measure (Properties ctx, int PA_SLA_Measure_ID, String trxName)
{
super (ctx, PA_SLA_Measure_ID, trxName);
/** if (PA_SLA_Measure_ID == 0)
{
setDateTrx (new Timestamp(System.currentTimeMillis()));
setMeasureActual (Env.ZERO);
setPA_SLA_Goal_ID (0);
setPA_SLA_Measure_ID (0);
setProcessed (false);	
// N
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_PA_SLA_Measure (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=743 */
public static int Table_ID=MTable.getTable_ID("PA_SLA_Measure");

@XendraTrl(Identifier="dc6619b5-39c3-2cd7-34c5-f4a5c3d9738c")
public static String es_PE_TAB_SLAMeasure_Description="Medida de Nivel de Servicio Acordado";

@XendraTrl(Identifier="dc6619b5-39c3-2cd7-34c5-f4a5c3d9738c")
public static String es_PE_TAB_SLAMeasure_Name="ANS Medida";

@XendraTrl(Identifier="dc6619b5-39c3-2cd7-34c5-f4a5c3d9738c")
public static String es_PE_TAB_SLAMeasure_Help="Visión/Mantenga el valor real individual / medida para la meta del acuerdo de porcentaje de disponibilidad del socio de negocio";

@XendraTab(Name="SLA Measure",Description="Service Level Agreement Measure",
Help="View/Maintain the individual actual value / measure for the business partner service level agreement goal",
AD_Window_ID="2f9c0dec-822e-9ffd-0c1a-85834bda184f",SeqNo=30,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="dc6619b5-39c3-2cd7-34c5-f4a5c3d9738c",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_SLAMeasure="dc6619b5-39c3-2cd7-34c5-f4a5c3d9738c";

@XendraTrl(Identifier="3bc58be8-ab85-7fbe-6373-366cfe7b8a9e")
public static String es_PE_TAB_SLAMeasure2_Description="Medida del Acuerdo del nivel de Servicio";

@XendraTrl(Identifier="3bc58be8-ab85-7fbe-6373-366cfe7b8a9e")
public static String es_PE_TAB_SLAMeasure2_Name="Medida ANS";

@XendraTrl(Identifier="3bc58be8-ab85-7fbe-6373-366cfe7b8a9e")
public static String es_PE_TAB_SLAMeasure2_Help="Visualiza/Mantenimiento individual del valor actual / medida para la meta del acuerdo de porcentaje de disponibilidad del socio de negocio";

@XendraTab(Name="SLA Measure",Description="Service Level Agreement Measure",
Help="View/Maintain the individual actual value / measure for the business partner service level agreement goal",
AD_Window_ID="c73cdd34-69c8-f9a1-85cc-cb0e427c8ec7",SeqNo=30,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="3bc58be8-ab85-7fbe-6373-366cfe7b8a9e",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_SLAMeasure2="3bc58be8-ab85-7fbe-6373-366cfe7b8a9e";

@XendraTrl(Identifier="83d06947-cd97-74a9-bfa1-8c525665bd7b")
public static String es_PE_TABLE_PA_SLA_Measure_Name="Medida SLA ";

@XendraTable(Name="SLA Measure",Description="Service Level Agreement Measure",Help="",
TableName="PA_SLA_Measure",AccessLevel="3",AD_Window_ID="2f9c0dec-822e-9ffd-0c1a-85834bda184f",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.performanceanalysis",
Identifier="83d06947-cd97-74a9-bfa1-8c525665bd7b",Synchronized="2017-08-16 11:43:44.0")
/** TableName=PA_SLA_Measure */
public static final String Table_Name="PA_SLA_Measure";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"PA_SLA_Measure");

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
    Table_ID = MTable.getTable_ID("PA_SLA_Measure");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_PA_SLA_Measure[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="d996f2cf-072b-9678-d268-249431e1765e")
public static String es_PE_FIELD_SLAMeasure_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="d996f2cf-072b-9678-d268-249431e1765e")
public static String es_PE_FIELD_SLAMeasure_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraTrl(Identifier="d996f2cf-072b-9678-d268-249431e1765e")
public static String es_PE_FIELD_SLAMeasure_Table_Name="Tabla";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3bc58be8-ab85-7fbe-6373-366cfe7b8a9e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d996f2cf-072b-9678-d268-249431e1765e")
public static final String FIELDNAME_SLAMeasure_Table="d996f2cf-072b-9678-d268-249431e1765e";

@XendraTrl(Identifier="947c006b-c06f-03c8-8c14-d087cf52a31a")
public static String es_PE_FIELD_SLAMeasure_Table2_Description="Tabla para los campos";

@XendraTrl(Identifier="947c006b-c06f-03c8-8c14-d087cf52a31a")
public static String es_PE_FIELD_SLAMeasure_Table2_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraTrl(Identifier="947c006b-c06f-03c8-8c14-d087cf52a31a")
public static String es_PE_FIELD_SLAMeasure_Table2_Name="Tabla";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="dc6619b5-39c3-2cd7-34c5-f4a5c3d9738c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="947c006b-c06f-03c8-8c14-d087cf52a31a")
public static final String FIELDNAME_SLAMeasure_Table2="947c006b-c06f-03c8-8c14-d087cf52a31a";

@XendraTrl(Identifier="e381e360-aa0c-0fd1-389a-e94f8da3a5b5")
public static String es_PE_COLUMN_AD_Table_ID_Name="Tabla";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e381e360-aa0c-0fd1-389a-e94f8da3a5b5",
Synchronized="2017-08-05 16:55:44.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
/** Set Transaction Date.
@param DateTrx Transaction Date */
public void setDateTrx (Timestamp DateTrx)
{
if (DateTrx == null) throw new IllegalArgumentException ("DateTrx is mandatory.");
set_Value (COLUMNNAME_DateTrx, DateTrx);
}
/** Get Transaction Date.
@return Transaction Date */
public Timestamp getDateTrx() 
{
return (Timestamp)get_Value(COLUMNNAME_DateTrx);
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getDateTrx()));
}

@XendraTrl(Identifier="798d3086-e980-614d-a9f0-6aeada06988e")
public static String es_PE_FIELD_SLAMeasure_TransactionDate_Description="Fecha de la transacción";

@XendraTrl(Identifier="798d3086-e980-614d-a9f0-6aeada06988e")
public static String es_PE_FIELD_SLAMeasure_TransactionDate_Help="La fecha de transacción indica la fecha en que se ejecutó la transacción";

@XendraTrl(Identifier="798d3086-e980-614d-a9f0-6aeada06988e")
public static String es_PE_FIELD_SLAMeasure_TransactionDate_Name="Fecha de la Transacción";

@XendraField(AD_Column_ID="DateTrx",IsCentrallyMaintained=true,
AD_Tab_ID="3bc58be8-ab85-7fbe-6373-366cfe7b8a9e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="798d3086-e980-614d-a9f0-6aeada06988e")
public static final String FIELDNAME_SLAMeasure_TransactionDate="798d3086-e980-614d-a9f0-6aeada06988e";

@XendraTrl(Identifier="5594cd93-4044-5b55-c2a9-8a5a6f83d322")
public static String es_PE_FIELD_SLAMeasure_TransactionDate2_Description="Fecha de la transacción";

@XendraTrl(Identifier="5594cd93-4044-5b55-c2a9-8a5a6f83d322")
public static String es_PE_FIELD_SLAMeasure_TransactionDate2_Help="La fecha de transacción indica la fecha en que se ejecutó la transacción";

@XendraTrl(Identifier="5594cd93-4044-5b55-c2a9-8a5a6f83d322")
public static String es_PE_FIELD_SLAMeasure_TransactionDate2_Name="Fecha de la Transacción";

@XendraField(AD_Column_ID="DateTrx",IsCentrallyMaintained=true,
AD_Tab_ID="dc6619b5-39c3-2cd7-34c5-f4a5c3d9738c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5594cd93-4044-5b55-c2a9-8a5a6f83d322")
public static final String FIELDNAME_SLAMeasure_TransactionDate2="5594cd93-4044-5b55-c2a9-8a5a6f83d322";

@XendraTrl(Identifier="ace9e66d-3603-adad-8e96-fed9dc9bc545")
public static String es_PE_COLUMN_DateTrx_Name="Fecha de la Transacción";

@XendraColumn(AD_Element_ID="3700288f-61dd-2021-b833-cf804ceed1e9",ColumnName="DateTrx",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ace9e66d-3603-adad-8e96-fed9dc9bc545",
Synchronized="2017-08-05 16:55:44.0")
/** Column name DateTrx */
public static final String COLUMNNAME_DateTrx = "DateTrx";
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

@XendraTrl(Identifier="62944faa-93b7-bb4e-2b3f-efec044601c4")
public static String es_PE_FIELD_SLAMeasure_Description_Description="Observación";

@XendraTrl(Identifier="62944faa-93b7-bb4e-2b3f-efec044601c4")
public static String es_PE_FIELD_SLAMeasure_Description_Help="Observación";

@XendraTrl(Identifier="62944faa-93b7-bb4e-2b3f-efec044601c4")
public static String es_PE_FIELD_SLAMeasure_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="3bc58be8-ab85-7fbe-6373-366cfe7b8a9e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="62944faa-93b7-bb4e-2b3f-efec044601c4")
public static final String FIELDNAME_SLAMeasure_Description="62944faa-93b7-bb4e-2b3f-efec044601c4";

@XendraTrl(Identifier="2707fa89-170b-ff17-2bcf-05a3e55586a7")
public static String es_PE_FIELD_SLAMeasure_Description2_Description="Observación";

@XendraTrl(Identifier="2707fa89-170b-ff17-2bcf-05a3e55586a7")
public static String es_PE_FIELD_SLAMeasure_Description2_Help="Observación";

@XendraTrl(Identifier="2707fa89-170b-ff17-2bcf-05a3e55586a7")
public static String es_PE_FIELD_SLAMeasure_Description2_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="dc6619b5-39c3-2cd7-34c5-f4a5c3d9738c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2707fa89-170b-ff17-2bcf-05a3e55586a7")
public static final String FIELDNAME_SLAMeasure_Description2="2707fa89-170b-ff17-2bcf-05a3e55586a7";

@XendraTrl(Identifier="e7534787-d0c2-535e-955f-0bdfea5a4cdd")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e7534787-d0c2-535e-955f-0bdfea5a4cdd",
Synchronized="2017-08-05 16:55:44.0")
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
@XendraTrl(Identifier="1b62cd2b-2936-4bc9-ba7b-e78fac514018")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1b62cd2b-2936-4bc9-ba7b-e78fac514018",
Synchronized="2017-08-05 16:55:44.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Measure Actual.
@param MeasureActual Actual value that has been measured. */
public void setMeasureActual (BigDecimal MeasureActual)
{
if (MeasureActual == null) throw new IllegalArgumentException ("MeasureActual is mandatory.");
set_Value (COLUMNNAME_MeasureActual, MeasureActual);
}
/** Get Measure Actual.
@return Actual value that has been measured. */
public BigDecimal getMeasureActual() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MeasureActual);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="9edaadbe-8259-510e-f4b0-3a35587a38fa")
public static String es_PE_FIELD_SLAMeasure_MeasureActual_Description="Valor actual que ha sido medido";

@XendraTrl(Identifier="9edaadbe-8259-510e-f4b0-3a35587a38fa")
public static String es_PE_FIELD_SLAMeasure_MeasureActual_Help="La medida actual indica el valor medido actual. Los valores medidos se usan para determinar si una meta de desempeño ha sido alcanzada.";

@XendraTrl(Identifier="9edaadbe-8259-510e-f4b0-3a35587a38fa")
public static String es_PE_FIELD_SLAMeasure_MeasureActual_Name="Medida Actual";

@XendraField(AD_Column_ID="MeasureActual",IsCentrallyMaintained=true,
AD_Tab_ID="3bc58be8-ab85-7fbe-6373-366cfe7b8a9e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9edaadbe-8259-510e-f4b0-3a35587a38fa")
public static final String FIELDNAME_SLAMeasure_MeasureActual="9edaadbe-8259-510e-f4b0-3a35587a38fa";

@XendraTrl(Identifier="830ab16f-6d7a-ad25-0bce-da158e7ea1c4")
public static String es_PE_FIELD_SLAMeasure_MeasureActual2_Description="Valor actual que ha sido medido";

@XendraTrl(Identifier="830ab16f-6d7a-ad25-0bce-da158e7ea1c4")
public static String es_PE_FIELD_SLAMeasure_MeasureActual2_Help="La medida actual indica el valor medido actual. Los valores medidos se usan para determinar si una meta de desempeño ha sido alcanzada.";

@XendraTrl(Identifier="830ab16f-6d7a-ad25-0bce-da158e7ea1c4")
public static String es_PE_FIELD_SLAMeasure_MeasureActual2_Name="Medida Actual";

@XendraField(AD_Column_ID="MeasureActual",IsCentrallyMaintained=true,
AD_Tab_ID="dc6619b5-39c3-2cd7-34c5-f4a5c3d9738c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="830ab16f-6d7a-ad25-0bce-da158e7ea1c4")
public static final String FIELDNAME_SLAMeasure_MeasureActual2="830ab16f-6d7a-ad25-0bce-da158e7ea1c4";

@XendraTrl(Identifier="a2053c5b-b489-13a6-2749-52cc336f8d42")
public static String es_PE_COLUMN_MeasureActual_Name="Medida Actual";

@XendraColumn(AD_Element_ID="0825e99a-364e-4459-9f17-d2bbda39cfde",ColumnName="MeasureActual",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a2053c5b-b489-13a6-2749-52cc336f8d42",
Synchronized="2017-08-05 16:55:44.0")
/** Column name MeasureActual */
public static final String COLUMNNAME_MeasureActual = "MeasureActual";
/** Set SLA Goal.
@param PA_SLA_Goal_ID Service Level Agreement Goal */
public void setPA_SLA_Goal_ID (int PA_SLA_Goal_ID)
{
if (PA_SLA_Goal_ID < 1) throw new IllegalArgumentException ("PA_SLA_Goal_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_PA_SLA_Goal_ID, Integer.valueOf(PA_SLA_Goal_ID));
}
/** Get SLA Goal.
@return Service Level Agreement Goal */
public int getPA_SLA_Goal_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_SLA_Goal_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="93da1e85-318a-89e5-747a-2a427a4fe2c2")
public static String es_PE_FIELD_SLAMeasure_SLAGoal_Description="Meta del acuerdo del porcentaje de disponibilidad";

@XendraTrl(Identifier="93da1e85-318a-89e5-747a-2a427a4fe2c2")
public static String es_PE_FIELD_SLAMeasure_SLAGoal_Help="Meta para los criterios de ANS para el socio de negocio";

@XendraTrl(Identifier="93da1e85-318a-89e5-747a-2a427a4fe2c2")
public static String es_PE_FIELD_SLAMeasure_SLAGoal_Name="Meta ANS";

@XendraField(AD_Column_ID="PA_SLA_Goal_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3bc58be8-ab85-7fbe-6373-366cfe7b8a9e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="93da1e85-318a-89e5-747a-2a427a4fe2c2")
public static final String FIELDNAME_SLAMeasure_SLAGoal="93da1e85-318a-89e5-747a-2a427a4fe2c2";

@XendraTrl(Identifier="5d63df14-f02a-b185-2772-ca1402048484")
public static String es_PE_FIELD_SLAMeasure_SLAGoal2_Description="Meta del acuerdo del porcentaje de disponibilidad";

@XendraTrl(Identifier="5d63df14-f02a-b185-2772-ca1402048484")
public static String es_PE_FIELD_SLAMeasure_SLAGoal2_Help="Meta para los criterios de ANS para el socio de negocio";

@XendraTrl(Identifier="5d63df14-f02a-b185-2772-ca1402048484")
public static String es_PE_FIELD_SLAMeasure_SLAGoal2_Name="Meta ANS";

@XendraField(AD_Column_ID="PA_SLA_Goal_ID",IsCentrallyMaintained=true,
AD_Tab_ID="dc6619b5-39c3-2cd7-34c5-f4a5c3d9738c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5d63df14-f02a-b185-2772-ca1402048484")
public static final String FIELDNAME_SLAMeasure_SLAGoal2="5d63df14-f02a-b185-2772-ca1402048484";

@XendraTrl(Identifier="f8c02ca5-06e5-cd29-669a-3b5a31238647")
public static String es_PE_COLUMN_PA_SLA_Goal_ID_Name="Meta ANS";

@XendraColumn(AD_Element_ID="e78d3e72-8107-a802-c0f8-a487fb6ac866",ColumnName="PA_SLA_Goal_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f8c02ca5-06e5-cd29-669a-3b5a31238647",
Synchronized="2017-08-05 16:55:44.0")
/** Column name PA_SLA_Goal_ID */
public static final String COLUMNNAME_PA_SLA_Goal_ID = "PA_SLA_Goal_ID";
/** Set SLA Measure.
@param PA_SLA_Measure_ID Service Level Agreement Measure */
public void setPA_SLA_Measure_ID (int PA_SLA_Measure_ID)
{
if (PA_SLA_Measure_ID < 1) throw new IllegalArgumentException ("PA_SLA_Measure_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_PA_SLA_Measure_ID, Integer.valueOf(PA_SLA_Measure_ID));
}
/** Get SLA Measure.
@return Service Level Agreement Measure */
public int getPA_SLA_Measure_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_SLA_Measure_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d20cb68e-eeee-a854-9a5a-9c511d594c45")
public static String es_PE_FIELD_SLAMeasure_SLAMeasure_Description="Medida del acuerdo de porcentaje de disponibilidad.";

@XendraTrl(Identifier="d20cb68e-eeee-a854-9a5a-9c511d594c45")
public static String es_PE_FIELD_SLAMeasure_SLAMeasure_Help="Visualiza / Mantenimiento al valor / las medidas reales individuales para la meta del acuerdo del porcentaje de disponibilidad del socio de negocio.";

@XendraTrl(Identifier="d20cb68e-eeee-a854-9a5a-9c511d594c45")
public static String es_PE_FIELD_SLAMeasure_SLAMeasure_Name="Medida SLA ";

@XendraField(AD_Column_ID="PA_SLA_Measure_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3bc58be8-ab85-7fbe-6373-366cfe7b8a9e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d20cb68e-eeee-a854-9a5a-9c511d594c45")
public static final String FIELDNAME_SLAMeasure_SLAMeasure="d20cb68e-eeee-a854-9a5a-9c511d594c45";

@XendraTrl(Identifier="80c48862-ad4b-8239-49d0-47b0f2b54ef8")
public static String es_PE_FIELD_SLAMeasure_SLAMeasure2_Description="Medida del acuerdo de porcentaje de disponibilidad.";

@XendraTrl(Identifier="80c48862-ad4b-8239-49d0-47b0f2b54ef8")
public static String es_PE_FIELD_SLAMeasure_SLAMeasure2_Help="Visualiza / Mantenimiento al valor / las medidas reales individuales para la meta del acuerdo del porcentaje de disponibilidad del socio de negocio.";

@XendraTrl(Identifier="80c48862-ad4b-8239-49d0-47b0f2b54ef8")
public static String es_PE_FIELD_SLAMeasure_SLAMeasure2_Name="Medida SLA ";

@XendraField(AD_Column_ID="PA_SLA_Measure_ID",IsCentrallyMaintained=true,
AD_Tab_ID="dc6619b5-39c3-2cd7-34c5-f4a5c3d9738c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="80c48862-ad4b-8239-49d0-47b0f2b54ef8")
public static final String FIELDNAME_SLAMeasure_SLAMeasure2="80c48862-ad4b-8239-49d0-47b0f2b54ef8";
/** Column name PA_SLA_Measure_ID */
public static final String COLUMNNAME_PA_SLA_Measure_ID = "PA_SLA_Measure_ID";
/** Set Processed.
@param Processed The document has been processed */
public void setProcessed (boolean Processed)
{
set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
}
/** Get Processed.
@return The document has been processed */
public boolean isProcessed() 
{
Object oo = get_Value(COLUMNNAME_Processed);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="880d1e1e-76db-faf7-7f0e-24e70850b9a0")
public static String es_PE_FIELD_SLAMeasure_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="880d1e1e-76db-faf7-7f0e-24e70850b9a0")
public static String es_PE_FIELD_SLAMeasure_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="880d1e1e-76db-faf7-7f0e-24e70850b9a0")
public static String es_PE_FIELD_SLAMeasure_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="3bc58be8-ab85-7fbe-6373-366cfe7b8a9e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="880d1e1e-76db-faf7-7f0e-24e70850b9a0")
public static final String FIELDNAME_SLAMeasure_Processed="880d1e1e-76db-faf7-7f0e-24e70850b9a0";

@XendraTrl(Identifier="711df414-7934-8edb-ae6d-2f8dc6e51314")
public static String es_PE_FIELD_SLAMeasure_Processed2_Description="El documento ha sido procesado";

@XendraTrl(Identifier="711df414-7934-8edb-ae6d-2f8dc6e51314")
public static String es_PE_FIELD_SLAMeasure_Processed2_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="711df414-7934-8edb-ae6d-2f8dc6e51314")
public static String es_PE_FIELD_SLAMeasure_Processed2_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="dc6619b5-39c3-2cd7-34c5-f4a5c3d9738c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="711df414-7934-8edb-ae6d-2f8dc6e51314")
public static final String FIELDNAME_SLAMeasure_Processed2="711df414-7934-8edb-ae6d-2f8dc6e51314";

@XendraTrl(Identifier="a07fdaf8-7e36-d719-8835-5816d11e596d")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a07fdaf8-7e36-d719-8835-5816d11e596d",
Synchronized="2017-08-05 16:55:45.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
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

@XendraTrl(Identifier="bab9429b-8630-c855-6c2e-326d6472c491")
public static String es_PE_FIELD_SLAMeasure_ProcessNow_Description="Calcule las Medidas";

@XendraTrl(Identifier="bab9429b-8630-c855-6c2e-326d6472c491")
public static String es_PE_FIELD_SLAMeasure_ProcessNow_Help="Calcule/actualize la medida actual.";

@XendraTrl(Identifier="bab9429b-8630-c855-6c2e-326d6472c491")
public static String es_PE_FIELD_SLAMeasure_ProcessNow_Name="Calcule las Medidas";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="3bc58be8-ab85-7fbe-6373-366cfe7b8a9e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bab9429b-8630-c855-6c2e-326d6472c491")
public static final String FIELDNAME_SLAMeasure_ProcessNow="bab9429b-8630-c855-6c2e-326d6472c491";

@XendraTrl(Identifier="a6dce0f2-1c46-ad68-2014-321c177e1f31")
public static String es_PE_FIELD_SLAMeasure_ProcessNow2_Description="Calcule las Medidas";

@XendraTrl(Identifier="a6dce0f2-1c46-ad68-2014-321c177e1f31")
public static String es_PE_FIELD_SLAMeasure_ProcessNow2_Help="Calcule/actualize la medida actual.";

@XendraTrl(Identifier="a6dce0f2-1c46-ad68-2014-321c177e1f31")
public static String es_PE_FIELD_SLAMeasure_ProcessNow2_Name="Calcule las Medidas";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="dc6619b5-39c3-2cd7-34c5-f4a5c3d9738c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a6dce0f2-1c46-ad68-2014-321c177e1f31")
public static final String FIELDNAME_SLAMeasure_ProcessNow2="a6dce0f2-1c46-ad68-2014-321c177e1f31";

@XendraTrl(Identifier="cc2da520-50a4-699a-5047-291a623269c5")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="21d517c0-cd68-4bb4-75e6-c0a7858fc586",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="cc2da520-50a4-699a-5047-291a623269c5",Synchronized="2017-08-05 16:55:45.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Record ID.
@param Record_ID Direct internal record ID */
public void setRecord_ID (int Record_ID)
{
if (Record_ID <= 0) set_Value (COLUMNNAME_Record_ID, null);
 else 
set_Value (COLUMNNAME_Record_ID, Integer.valueOf(Record_ID));
}
/** Get Record ID.
@return Direct internal record ID */
public int getRecord_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Record_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8ea04c73-b569-a460-f20c-739dd5093bd0")
public static String es_PE_FIELD_SLAMeasure_RecordID_Description="Identificador de registro interno";

@XendraTrl(Identifier="8ea04c73-b569-a460-f20c-739dd5093bd0")
public static String es_PE_FIELD_SLAMeasure_RecordID_Help="La ID de registro es el identificador único interno de un registro.";

@XendraTrl(Identifier="8ea04c73-b569-a460-f20c-739dd5093bd0")
public static String es_PE_FIELD_SLAMeasure_RecordID_Name="ID de Registro";

@XendraField(AD_Column_ID="Record_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3bc58be8-ab85-7fbe-6373-366cfe7b8a9e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8ea04c73-b569-a460-f20c-739dd5093bd0")
public static final String FIELDNAME_SLAMeasure_RecordID="8ea04c73-b569-a460-f20c-739dd5093bd0";

@XendraTrl(Identifier="681aec67-651c-da17-079e-c0883b28f6cd")
public static String es_PE_FIELD_SLAMeasure_RecordID2_Description="Identificador de registro interno";

@XendraTrl(Identifier="681aec67-651c-da17-079e-c0883b28f6cd")
public static String es_PE_FIELD_SLAMeasure_RecordID2_Help="La ID de registro es el identificador único interno de un registro.";

@XendraTrl(Identifier="681aec67-651c-da17-079e-c0883b28f6cd")
public static String es_PE_FIELD_SLAMeasure_RecordID2_Name="ID de Registro";

@XendraField(AD_Column_ID="Record_ID",IsCentrallyMaintained=true,
AD_Tab_ID="dc6619b5-39c3-2cd7-34c5-f4a5c3d9738c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="681aec67-651c-da17-079e-c0883b28f6cd")
public static final String FIELDNAME_SLAMeasure_RecordID2="681aec67-651c-da17-079e-c0883b28f6cd";

@XendraTrl(Identifier="92416054-e082-5ee6-5317-d1cc77970a52")
public static String es_PE_COLUMN_Record_ID_Name="ID de Registro";

@XendraColumn(AD_Element_ID="86e36e4b-d1dc-2deb-449d-c1f6769e1603",ColumnName="Record_ID",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="92416054-e082-5ee6-5317-d1cc77970a52",
Synchronized="2017-08-05 16:55:45.0")
/** Column name Record_ID */
public static final String COLUMNNAME_Record_ID = "Record_ID";
}
