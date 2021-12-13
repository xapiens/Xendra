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
/** Generated Model for C_DunningLevel
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_DunningLevel extends PO
{
/** Standard Constructor
@param ctx context
@param C_DunningLevel_ID id
@param trxName transaction
*/
public X_C_DunningLevel (Properties ctx, int C_DunningLevel_ID, String trxName)
{
super (ctx, C_DunningLevel_ID, trxName);
/** if (C_DunningLevel_ID == 0)
{
setC_Dunning_ID (0);
setC_DunningLevel_ID (0);
setChargeFee (false);	
// N
setChargeInterest (false);	
// N
setDaysAfterDue (Env.ZERO);
setDaysBetweenDunning (0);
setIsSetCreditStop (false);	
// N
setIsSetPaymentTerm (false);	
// N
setIsShowAllDue (false);	
// N
setIsShowNotDue (false);	
// N
setName (null);
setPrintName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_DunningLevel (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=331 */
public static int Table_ID=MTable.getTable_ID("C_DunningLevel");

@XendraTrl(Identifier="38ca7e9d-1f5f-ae00-8da5-c1179e63b485")
public static String es_PE_TAB_Level_Description="Mantener Nivel de Morosidad";

@XendraTrl(Identifier="38ca7e9d-1f5f-ae00-8da5-c1179e63b485")
public static String es_PE_TAB_Level_Help="La pestaña Nivel de Morosidad define los tiempos y frecuencias de los avisos de morosidad.";

@XendraTrl(Identifier="38ca7e9d-1f5f-ae00-8da5-c1179e63b485")
public static String es_PE_TAB_Level_Name="Nivel";
@XendraTab(Name="Level",
Description="Maintain Dunning Level",
Help="The Dunning Level Tab defines the timing and frequency of the dunning notices.",
AD_Window_ID="3474d11d-d9ea-1bda-8265-679528dc5382",SeqNo=20,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="38ca7e9d-1f5f-ae00-8da5-c1179e63b485",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Level="38ca7e9d-1f5f-ae00-8da5-c1179e63b485";

@XendraTrl(Identifier="a56a94e7-208d-61c1-1179-3f481aa80ce6")
public static String es_PE_TABLE_C_DunningLevel_Name="Nivel de Morosidad";

@XendraTable(Name="Dunning Level",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="C_DunningLevel",AccessLevel="3",AD_Window_ID="3474d11d-d9ea-1bda-8265-679528dc5382",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=130,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="a56a94e7-208d-61c1-1179-3f481aa80ce6",Synchronized="2020-03-03 21:36:52.0")
/** TableName=C_DunningLevel */
public static final String Table_Name="C_DunningLevel";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_DunningLevel");

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
    Table_ID = MTable.getTable_ID("C_DunningLevel");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_DunningLevel[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Dunning.
@param C_Dunning_ID Dunning Rules for overdue invoices */
public void setC_Dunning_ID (int C_Dunning_ID)
{
if (C_Dunning_ID < 1) throw new IllegalArgumentException ("C_Dunning_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Dunning_ID, Integer.valueOf(C_Dunning_ID));
}
/** Get Dunning.
@return Dunning Rules for overdue invoices */
public int getC_Dunning_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Dunning_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0a1e4293-7678-a99b-3419-2f0bd47dbd92")
public static String es_PE_FIELD_Level_Dunning_Name="Morosidad";

@XendraTrl(Identifier="0a1e4293-7678-a99b-3419-2f0bd47dbd92")
public static String es_PE_FIELD_Level_Dunning_Description="Reglas de morosidad para facturas vencidas";

@XendraTrl(Identifier="0a1e4293-7678-a99b-3419-2f0bd47dbd92")
public static String es_PE_FIELD_Level_Dunning_Help="La Morosidad indica las reglas y métodos de cálculo de morosidad para pagos vencidos";

@XendraField(AD_Column_ID="C_Dunning_ID",IsCentrallyMaintained=true,
AD_Tab_ID="38ca7e9d-1f5f-ae00-8da5-c1179e63b485",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0a1e4293-7678-a99b-3419-2f0bd47dbd92")
public static final String FIELDNAME_Level_Dunning="0a1e4293-7678-a99b-3419-2f0bd47dbd92";

@XendraTrl(Identifier="28fdb22b-3248-2db6-86e6-2bc8869441c7")
public static String es_PE_COLUMN_C_Dunning_ID_Name="Morosidad";

@XendraColumn(AD_Element_ID="1ecce40a-5c50-54d9-2d4b-12d7fbab21a8",ColumnName="C_Dunning_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="28fdb22b-3248-2db6-86e6-2bc8869441c7",
Synchronized="2019-08-30 22:21:32.0")
/** Column name C_Dunning_ID */
public static final String COLUMNNAME_C_Dunning_ID = "C_Dunning_ID";
/** Set Dunning Level.
@param C_DunningLevel_ID Dunning Level */
public void setC_DunningLevel_ID (int C_DunningLevel_ID)
{
if (C_DunningLevel_ID < 1) throw new IllegalArgumentException ("C_DunningLevel_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_DunningLevel_ID, Integer.valueOf(C_DunningLevel_ID));
}
/** Get Dunning Level.
@return Dunning Level */
public int getC_DunningLevel_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DunningLevel_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8e35edd7-e2bc-7287-3b7f-c8570ca2062c")
public static String es_PE_FIELD_Level_DunningLevel_Name="Nivel de Morosidad";

@XendraField(AD_Column_ID="C_DunningLevel_ID",IsCentrallyMaintained=true,
AD_Tab_ID="38ca7e9d-1f5f-ae00-8da5-c1179e63b485",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8e35edd7-e2bc-7287-3b7f-c8570ca2062c")
public static final String FIELDNAME_Level_DunningLevel="8e35edd7-e2bc-7287-3b7f-c8570ca2062c";
/** Column name C_DunningLevel_ID */
public static final String COLUMNNAME_C_DunningLevel_ID = "C_DunningLevel_ID";
/** Set Charge fee.
@param ChargeFee Indicates if fees will be charged for overdue invoices */
public void setChargeFee (boolean ChargeFee)
{
set_Value (COLUMNNAME_ChargeFee, Boolean.valueOf(ChargeFee));
}
/** Get Charge fee.
@return Indicates if fees will be charged for overdue invoices */
public boolean isChargeFee() 
{
Object oo = get_Value(COLUMNNAME_ChargeFee);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="10cf3f05-2836-3717-a581-1bcccfd9f394")
public static String es_PE_FIELD_Level_ChargeFee_Name="Cargo";

@XendraTrl(Identifier="10cf3f05-2836-3717-a581-1bcccfd9f394")
public static String es_PE_FIELD_Level_ChargeFee_Description="Indica si se hacen cargos por facturas morosas";

@XendraField(AD_Column_ID="ChargeFee",IsCentrallyMaintained=true,
AD_Tab_ID="38ca7e9d-1f5f-ae00-8da5-c1179e63b485",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="10cf3f05-2836-3717-a581-1bcccfd9f394")
public static final String FIELDNAME_Level_ChargeFee="10cf3f05-2836-3717-a581-1bcccfd9f394";

@XendraTrl(Identifier="9606ad9e-71c1-905c-ba6d-f2569af49bac")
public static String es_PE_COLUMN_ChargeFee_Name="Cargo";

@XendraColumn(AD_Element_ID="e32694be-5e26-c744-bf0e-175771dc8559",ColumnName="ChargeFee",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9606ad9e-71c1-905c-ba6d-f2569af49bac",
Synchronized="2019-08-30 22:21:32.0")
/** Column name ChargeFee */
public static final String COLUMNNAME_ChargeFee = "ChargeFee";
/** Set Charge Interest.
@param ChargeInterest Indicates if interest will be charged on overdue invoices */
public void setChargeInterest (boolean ChargeInterest)
{
set_Value (COLUMNNAME_ChargeInterest, Boolean.valueOf(ChargeInterest));
}
/** Get Charge Interest.
@return Indicates if interest will be charged on overdue invoices */
public boolean isChargeInterest() 
{
Object oo = get_Value(COLUMNNAME_ChargeInterest);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="d20bbb25-d423-c1a1-b067-317015181c91")
public static String es_PE_FIELD_Level_ChargeInterest_Name="Cargo de Intereses";

@XendraTrl(Identifier="d20bbb25-d423-c1a1-b067-317015181c91")
public static String es_PE_FIELD_Level_ChargeInterest_Description="Indica si el interés será cambiado; en facturas vencidas";

@XendraTrl(Identifier="d20bbb25-d423-c1a1-b067-317015181c91")
public static String es_PE_FIELD_Level_ChargeInterest_Help="El cuadro de verificación cargo de intereses indica si se cargarán intereses en los totales de facturas vencidas.";

@XendraField(AD_Column_ID="ChargeInterest",IsCentrallyMaintained=true,
AD_Tab_ID="38ca7e9d-1f5f-ae00-8da5-c1179e63b485",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d20bbb25-d423-c1a1-b067-317015181c91")
public static final String FIELDNAME_Level_ChargeInterest="d20bbb25-d423-c1a1-b067-317015181c91";

@XendraTrl(Identifier="62e42077-7c01-5cdd-30da-6f15ad43c0eb")
public static String es_PE_COLUMN_ChargeInterest_Name="Cargo de Intereses";

@XendraColumn(AD_Element_ID="d6428ddf-0d1e-b3a2-e1bf-1ced4a363f3a",ColumnName="ChargeInterest",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="62e42077-7c01-5cdd-30da-6f15ad43c0eb",
Synchronized="2019-08-30 22:21:32.0")
/** Column name ChargeInterest */
public static final String COLUMNNAME_ChargeInterest = "ChargeInterest";
/** Set Payment Term.
@param C_PaymentTerm_ID The terms of Payment (timing, discount) */
public void setC_PaymentTerm_ID (int C_PaymentTerm_ID)
{
if (C_PaymentTerm_ID <= 0) set_Value (COLUMNNAME_C_PaymentTerm_ID, null);
 else 
set_Value (COLUMNNAME_C_PaymentTerm_ID, Integer.valueOf(C_PaymentTerm_ID));
}
/** Get Payment Term.
@return The terms of Payment (timing, discount) */
public int getC_PaymentTerm_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_PaymentTerm_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="82ea1397-77d3-5045-582e-f9bd90e4553a")
public static String es_PE_FIELD_Level_PaymentTerm_Name="Término de Pago";

@XendraTrl(Identifier="82ea1397-77d3-5045-582e-f9bd90e4553a")
public static String es_PE_FIELD_Level_PaymentTerm_Description="Condiciones de pago de esta transacción";

@XendraTrl(Identifier="82ea1397-77d3-5045-582e-f9bd90e4553a")
public static String es_PE_FIELD_Level_PaymentTerm_Help="Las condiciones de pago indican el método y tiempo de pago para esta transacción.";

@XendraField(AD_Column_ID="C_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="38ca7e9d-1f5f-ae00-8da5-c1179e63b485",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSetPaymentTerm@=Y",DisplayLength=10,IsReadOnly=false,SeqNo=200,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="82ea1397-77d3-5045-582e-f9bd90e4553a")
public static final String FIELDNAME_Level_PaymentTerm="82ea1397-77d3-5045-582e-f9bd90e4553a";

@XendraTrl(Identifier="1eff7664-3af5-d90b-ab5e-7c92f1aa9755")
public static String es_PE_COLUMN_C_PaymentTerm_ID_Name="Término de Pago";

@XendraColumn(AD_Element_ID="9b2224b8-8020-a83c-2d1e-ea35741c781a",ColumnName="C_PaymentTerm_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1eff7664-3af5-d90b-ab5e-7c92f1aa9755",
Synchronized="2019-08-30 22:21:32.0")
/** Column name C_PaymentTerm_ID */
public static final String COLUMNNAME_C_PaymentTerm_ID = "C_PaymentTerm_ID";
/** Set Days after due date.
@param DaysAfterDue Days after due date to dun (if negative days until due) */
public void setDaysAfterDue (BigDecimal DaysAfterDue)
{
if (DaysAfterDue == null) throw new IllegalArgumentException ("DaysAfterDue is mandatory.");
set_Value (COLUMNNAME_DaysAfterDue, DaysAfterDue);
}
/** Get Days after due date.
@return Days after due date to dun (if negative days until due) */
public BigDecimal getDaysAfterDue() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_DaysAfterDue);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="c32fe051-fe77-bce1-d0ae-6bd218793d3d")
public static String es_PE_FIELD_Level_DaysAfterDueDate_Name="Días para Morosidad";

@XendraTrl(Identifier="c32fe051-fe77-bce1-d0ae-6bd218793d3d")
public static String es_PE_FIELD_Level_DaysAfterDueDate_Description="Días después de la fecha de vencimiento del pago en que se convierte en morosa";

@XendraTrl(Identifier="c32fe051-fe77-bce1-d0ae-6bd218793d3d")
public static String es_PE_FIELD_Level_DaysAfterDueDate_Help="Los días después de la fecha de vencimiento del pago indica el número de días después de la fecha de vencimiento para considerar morosidad";

@XendraField(AD_Column_ID="DaysAfterDue",IsCentrallyMaintained=true,
AD_Tab_ID="38ca7e9d-1f5f-ae00-8da5-c1179e63b485",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c32fe051-fe77-bce1-d0ae-6bd218793d3d")
public static final String FIELDNAME_Level_DaysAfterDueDate="c32fe051-fe77-bce1-d0ae-6bd218793d3d";

@XendraTrl(Identifier="c0242613-d8f2-0070-608d-50459257e56a")
public static String es_PE_COLUMN_DaysAfterDue_Name="Días para Morosidad";

@XendraColumn(AD_Element_ID="80905038-95a7-6002-0cbb-141b3930902c",ColumnName="DaysAfterDue",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c0242613-d8f2-0070-608d-50459257e56a",
Synchronized="2019-08-30 22:21:32.0")
/** Column name DaysAfterDue */
public static final String COLUMNNAME_DaysAfterDue = "DaysAfterDue";
/** Set Days between dunning.
@param DaysBetweenDunning Days between sending dunning notices */
public void setDaysBetweenDunning (int DaysBetweenDunning)
{
set_Value (COLUMNNAME_DaysBetweenDunning, Integer.valueOf(DaysBetweenDunning));
}
/** Get Days between dunning.
@return Days between sending dunning notices */
public int getDaysBetweenDunning() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_DaysBetweenDunning);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4bae6168-48bd-c7fe-0637-2bb82adcb8dd")
public static String es_PE_FIELD_Level_DaysBetweenDunning_Name="Días entre morosidad";

@XendraTrl(Identifier="4bae6168-48bd-c7fe-0637-2bb82adcb8dd")
public static String es_PE_FIELD_Level_DaysBetweenDunning_Description="Días entre avisos de morosidad";

@XendraField(AD_Column_ID="DaysBetweenDunning",IsCentrallyMaintained=true,
AD_Tab_ID="38ca7e9d-1f5f-ae00-8da5-c1179e63b485",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4bae6168-48bd-c7fe-0637-2bb82adcb8dd")
public static final String FIELDNAME_Level_DaysBetweenDunning="4bae6168-48bd-c7fe-0637-2bb82adcb8dd";

@XendraTrl(Identifier="578036b1-2b08-b344-9c42-37f1a0fbbce6")
public static String es_PE_COLUMN_DaysBetweenDunning_Name="Días entre morosidad";

@XendraColumn(AD_Element_ID="01ce6498-0d0c-5135-29a5-3393650911b6",ColumnName="DaysBetweenDunning",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="578036b1-2b08-b344-9c42-37f1a0fbbce6",
Synchronized="2019-08-30 22:21:32.0")
/** Column name DaysBetweenDunning */
public static final String COLUMNNAME_DaysBetweenDunning = "DaysBetweenDunning";
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

@XendraTrl(Identifier="8846172e-1271-802b-bc37-6479b00271a4")
public static String es_PE_FIELD_Level_Description_Name="Observación";

@XendraTrl(Identifier="8846172e-1271-802b-bc37-6479b00271a4")
public static String es_PE_FIELD_Level_Description_Description="Observación";

@XendraTrl(Identifier="8846172e-1271-802b-bc37-6479b00271a4")
public static String es_PE_FIELD_Level_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="38ca7e9d-1f5f-ae00-8da5-c1179e63b485",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8846172e-1271-802b-bc37-6479b00271a4")
public static final String FIELDNAME_Level_Description="8846172e-1271-802b-bc37-6479b00271a4";

@XendraTrl(Identifier="c5544c5b-03f3-4f0a-13ea-9b936414923a")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c5544c5b-03f3-4f0a-13ea-9b936414923a",
Synchronized="2019-08-30 22:21:32.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Dunning Print Format.
@param Dunning_PrintFormat_ID Print Format for printing Dunning Letters */
public void setDunning_PrintFormat_ID (int Dunning_PrintFormat_ID)
{
if (Dunning_PrintFormat_ID <= 0) set_Value (COLUMNNAME_Dunning_PrintFormat_ID, null);
 else 
set_Value (COLUMNNAME_Dunning_PrintFormat_ID, Integer.valueOf(Dunning_PrintFormat_ID));
}
/** Get Dunning Print Format.
@return Print Format for printing Dunning Letters */
public int getDunning_PrintFormat_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Dunning_PrintFormat_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e6673320-1f8a-c57c-2ac1-cd10b92c24a1")
public static String es_PE_FIELD_Level_DunningPrintFormat_Name="Formato de Impresión de Cobro moroso";

@XendraTrl(Identifier="e6673320-1f8a-c57c-2ac1-cd10b92c24a1")
public static String es_PE_FIELD_Level_DunningPrintFormat_Description="Formato de impresión usado para imprimir cartas de pago moroso.";

@XendraTrl(Identifier="e6673320-1f8a-c57c-2ac1-cd10b92c24a1")
public static String es_PE_FIELD_Level_DunningPrintFormat_Help="Es necesario definir un formato para imprimir el documento.";

@XendraField(AD_Column_ID="Dunning_PrintFormat_ID",IsCentrallyMaintained=true,
AD_Tab_ID="38ca7e9d-1f5f-ae00-8da5-c1179e63b485",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e6673320-1f8a-c57c-2ac1-cd10b92c24a1")
public static final String FIELDNAME_Level_DunningPrintFormat="e6673320-1f8a-c57c-2ac1-cd10b92c24a1";

@XendraTrl(Identifier="d98806f7-f15a-679d-5a94-90d06d8790e6")
public static String es_PE_COLUMN_Dunning_PrintFormat_ID_Name="Formato de Impresión de Cobro moroso";

@XendraColumn(AD_Element_ID="d7562edd-4a37-5410-ab06-0c48453473c1",
ColumnName="Dunning_PrintFormat_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="377b8075-d154-6c3b-1cc0-dea545937fae",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="d98806f7-f15a-679d-5a94-90d06d8790e6",
Synchronized="2019-08-30 22:21:32.0")
/** Column name Dunning_PrintFormat_ID */
public static final String COLUMNNAME_Dunning_PrintFormat_ID = "Dunning_PrintFormat_ID";
/** Set Fee Amount.
@param FeeAmt Fee amount in invoice currency */
public void setFeeAmt (BigDecimal FeeAmt)
{
set_Value (COLUMNNAME_FeeAmt, FeeAmt);
}
/** Get Fee Amount.
@return Fee amount in invoice currency */
public BigDecimal getFeeAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FeeAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="19667659-a457-73b5-7776-d0b9e23ee60e")
public static String es_PE_FIELD_Level_FeeAmount_Name="Total de Tarifa";

@XendraTrl(Identifier="19667659-a457-73b5-7776-d0b9e23ee60e")
public static String es_PE_FIELD_Level_FeeAmount_Description="Total de la tarifa en moneda de la factura";

@XendraTrl(Identifier="19667659-a457-73b5-7776-d0b9e23ee60e")
public static String es_PE_FIELD_Level_FeeAmount_Help="El Total tarifa indica el total del cargo en una carta de morosidad por facturas vencidas. Este campo sólo se desplegará si el cuadro de verificación cargar tarifa ha sido seleccionado";

@XendraField(AD_Column_ID="FeeAmt",IsCentrallyMaintained=true,
AD_Tab_ID="38ca7e9d-1f5f-ae00-8da5-c1179e63b485",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ChargeFee@='Y'",DisplayLength=26,IsReadOnly=false,SeqNo=120,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="19667659-a457-73b5-7776-d0b9e23ee60e")
public static final String FIELDNAME_Level_FeeAmount="19667659-a457-73b5-7776-d0b9e23ee60e";

@XendraTrl(Identifier="c012932b-3804-cf5c-a4a5-7a9b094c6786")
public static String es_PE_COLUMN_FeeAmt_Name="Total de Tarifa";

@XendraColumn(AD_Element_ID="9c6f3b0a-0969-f64c-7214-c03efd2f8112",ColumnName="FeeAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c012932b-3804-cf5c-a4a5-7a9b094c6786",
Synchronized="2019-08-30 22:21:32.0")
/** Column name FeeAmt */
public static final String COLUMNNAME_FeeAmt = "FeeAmt";
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
@XendraTrl(Identifier="5100cac0-4b25-46c9-9e80-31f53fcad13d")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5100cac0-4b25-46c9-9e80-31f53fcad13d",
Synchronized="2019-08-30 22:21:32.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Interest in percent.
@param InterestPercent Percentage interest to charge on overdue invoices */
public void setInterestPercent (BigDecimal InterestPercent)
{
set_Value (COLUMNNAME_InterestPercent, InterestPercent);
}
/** Get Interest in percent.
@return Percentage interest to charge on overdue invoices */
public BigDecimal getInterestPercent() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_InterestPercent);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="20d0bc79-aabb-4b89-e450-53d4b60797b6")
public static String es_PE_FIELD_Level_InterestInPercent_Name="Porcentaje de Interés";

@XendraTrl(Identifier="20d0bc79-aabb-4b89-e450-53d4b60797b6")
public static String es_PE_FIELD_Level_InterestInPercent_Description="Porcentaje de interés a cargar en facturas vencidas";

@XendraTrl(Identifier="20d0bc79-aabb-4b89-e450-53d4b60797b6")
public static String es_PE_FIELD_Level_InterestInPercent_Help="El total del interés en porcentaje indica el interés a ser cargado en facturas vencidas. Este campo se despliega solamente si el cuadro de verificación cargar Interés ha sido seleccionado.";

@XendraField(AD_Column_ID="InterestPercent",IsCentrallyMaintained=true,
AD_Tab_ID="38ca7e9d-1f5f-ae00-8da5-c1179e63b485",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ChargeInterest@='Y'",DisplayLength=26,IsReadOnly=false,SeqNo=140,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="20d0bc79-aabb-4b89-e450-53d4b60797b6")
public static final String FIELDNAME_Level_InterestInPercent="20d0bc79-aabb-4b89-e450-53d4b60797b6";

@XendraTrl(Identifier="c33916be-e70e-f3ef-f826-849140ed493d")
public static String es_PE_COLUMN_InterestPercent_Name="Porcentaje de Interés";

@XendraColumn(AD_Element_ID="062a1e3e-9d28-7263-2f1d-0934d76e60ad",ColumnName="InterestPercent",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c33916be-e70e-f3ef-f826-849140ed493d",
Synchronized="2019-08-30 22:21:32.0")
/** Column name InterestPercent */
public static final String COLUMNNAME_InterestPercent = "InterestPercent";
/** Set Credit Stop.
@param IsSetCreditStop Set the business partner to credit stop */
public void setIsSetCreditStop (boolean IsSetCreditStop)
{
set_Value (COLUMNNAME_IsSetCreditStop, Boolean.valueOf(IsSetCreditStop));
}
/** Get Credit Stop.
@return Set the business partner to credit stop */
public boolean isSetCreditStop() 
{
Object oo = get_Value(COLUMNNAME_IsSetCreditStop);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="2c8a0f27-de7a-8b73-f833-b89efdf19926")
public static String es_PE_FIELD_Level_CreditStop_Name="Detener el Crédito";

@XendraTrl(Identifier="2c8a0f27-de7a-8b73-f833-b89efdf19926")
public static String es_PE_FIELD_Level_CreditStop_Description="Set the business partner to credit stop";

@XendraTrl(Identifier="2c8a0f27-de7a-8b73-f833-b89efdf19926")
public static String es_PE_FIELD_Level_CreditStop_Help="If a dunning letter of this level is created, the business partner is set to Credit Stop (needs to be manually changed).";

@XendraField(AD_Column_ID="IsSetCreditStop",IsCentrallyMaintained=true,
AD_Tab_ID="38ca7e9d-1f5f-ae00-8da5-c1179e63b485",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2c8a0f27-de7a-8b73-f833-b89efdf19926")
public static final String FIELDNAME_Level_CreditStop="2c8a0f27-de7a-8b73-f833-b89efdf19926";

@XendraTrl(Identifier="62670f10-246c-a611-5486-ad848f7dd8c3")
public static String es_PE_COLUMN_IsSetCreditStop_Name="Credit Stop";

@XendraColumn(AD_Element_ID="240f1b10-2b11-bcca-570c-d32387f9ca43",ColumnName="IsSetCreditStop",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="62670f10-246c-a611-5486-ad848f7dd8c3",
Synchronized="2019-08-30 22:21:32.0")
/** Column name IsSetCreditStop */
public static final String COLUMNNAME_IsSetCreditStop = "IsSetCreditStop";
/** Set Set Payment Term.
@param IsSetPaymentTerm Set the payment term of the Business Partner */
public void setIsSetPaymentTerm (boolean IsSetPaymentTerm)
{
set_Value (COLUMNNAME_IsSetPaymentTerm, Boolean.valueOf(IsSetPaymentTerm));
}
/** Get Set Payment Term.
@return Set the payment term of the Business Partner */
public boolean isSetPaymentTerm() 
{
Object oo = get_Value(COLUMNNAME_IsSetPaymentTerm);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="e414717a-4933-b222-1be0-eb49cb439c51")
public static String es_PE_FIELD_Level_SetPaymentTerm_Name="Plazo de Término de Pago";

@XendraTrl(Identifier="e414717a-4933-b222-1be0-eb49cb439c51")
public static String es_PE_FIELD_Level_SetPaymentTerm_Description="Set the payment term of the Business Partner";

@XendraTrl(Identifier="e414717a-4933-b222-1be0-eb49cb439c51")
public static String es_PE_FIELD_Level_SetPaymentTerm_Help="If a dunning letter of this level is created, the payment term of this business partner is overwritten.";

@XendraField(AD_Column_ID="IsSetPaymentTerm",IsCentrallyMaintained=true,
AD_Tab_ID="38ca7e9d-1f5f-ae00-8da5-c1179e63b485",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e414717a-4933-b222-1be0-eb49cb439c51")
public static final String FIELDNAME_Level_SetPaymentTerm="e414717a-4933-b222-1be0-eb49cb439c51";

@XendraTrl(Identifier="d7a91225-eae0-a9d8-b641-f0c9357bcdf9")
public static String es_PE_COLUMN_IsSetPaymentTerm_Name="Set Payment Term";

@XendraColumn(AD_Element_ID="df2bf367-6393-1811-495b-38330fa2e04b",ColumnName="IsSetPaymentTerm",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d7a91225-eae0-a9d8-b641-f0c9357bcdf9",
Synchronized="2019-08-30 22:21:32.0")
/** Column name IsSetPaymentTerm */
public static final String COLUMNNAME_IsSetPaymentTerm = "IsSetPaymentTerm";
/** Set Show All Due.
@param IsShowAllDue Show/print all due invoices */
public void setIsShowAllDue (boolean IsShowAllDue)
{
set_Value (COLUMNNAME_IsShowAllDue, Boolean.valueOf(IsShowAllDue));
}
/** Get Show All Due.
@return Show/print all due invoices */
public boolean isShowAllDue() 
{
Object oo = get_Value(COLUMNNAME_IsShowAllDue);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="a9bb8635-6f65-bfb9-572d-57460285ca3a")
public static String es_PE_FIELD_Level_ShowAllDue_Name="Mostrar todas Aplicadas";

@XendraTrl(Identifier="a9bb8635-6f65-bfb9-572d-57460285ca3a")
public static String es_PE_FIELD_Level_ShowAllDue_Description="Show/print all due invoices";

@XendraTrl(Identifier="a9bb8635-6f65-bfb9-572d-57460285ca3a")
public static String es_PE_FIELD_Level_ShowAllDue_Help="The dunning letter with this level incudes all due invoices.";

@XendraField(AD_Column_ID="IsShowAllDue",IsCentrallyMaintained=true,
AD_Tab_ID="38ca7e9d-1f5f-ae00-8da5-c1179e63b485",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a9bb8635-6f65-bfb9-572d-57460285ca3a")
public static final String FIELDNAME_Level_ShowAllDue="a9bb8635-6f65-bfb9-572d-57460285ca3a";

@XendraTrl(Identifier="8c4453d3-c9d5-0493-0160-c9c8323d48f8")
public static String es_PE_COLUMN_IsShowAllDue_Name="Show All Due";

@XendraColumn(AD_Element_ID="a56e9412-fed6-6c1f-46e6-ff063d5a5238",ColumnName="IsShowAllDue",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8c4453d3-c9d5-0493-0160-c9c8323d48f8",
Synchronized="2019-08-30 22:21:32.0")
/** Column name IsShowAllDue */
public static final String COLUMNNAME_IsShowAllDue = "IsShowAllDue";
/** Set Show Not Due.
@param IsShowNotDue Show/print all invoices which are not due (yet). */
public void setIsShowNotDue (boolean IsShowNotDue)
{
set_Value (COLUMNNAME_IsShowNotDue, Boolean.valueOf(IsShowNotDue));
}
/** Get Show Not Due.
@return Show/print all invoices which are not due (yet). */
public boolean isShowNotDue() 
{
Object oo = get_Value(COLUMNNAME_IsShowNotDue);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="9e2cd9d8-18f4-9c27-5020-02388a2f46b2")
public static String es_PE_FIELD_Level_ShowNotDue_Name="Mostrar No Aplicadas";

@XendraTrl(Identifier="9e2cd9d8-18f4-9c27-5020-02388a2f46b2")
public static String es_PE_FIELD_Level_ShowNotDue_Description="Show/print all invoices which are not due (yet).";

@XendraTrl(Identifier="9e2cd9d8-18f4-9c27-5020-02388a2f46b2")
public static String es_PE_FIELD_Level_ShowNotDue_Help="The dunning letter with this level incudes all not due invoices.";

@XendraField(AD_Column_ID="IsShowNotDue",IsCentrallyMaintained=true,
AD_Tab_ID="38ca7e9d-1f5f-ae00-8da5-c1179e63b485",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9e2cd9d8-18f4-9c27-5020-02388a2f46b2")
public static final String FIELDNAME_Level_ShowNotDue="9e2cd9d8-18f4-9c27-5020-02388a2f46b2";

@XendraTrl(Identifier="d6be7ad3-73dd-ce33-2da9-fa216681443b")
public static String es_PE_COLUMN_IsShowNotDue_Name="Show Not Due";

@XendraColumn(AD_Element_ID="73d39e47-8d3c-9c82-06b3-26f28abd5b92",ColumnName="IsShowNotDue",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d6be7ad3-73dd-ce33-2da9-fa216681443b",
Synchronized="2019-08-30 22:21:32.0")
/** Column name IsShowNotDue */
public static final String COLUMNNAME_IsShowNotDue = "IsShowNotDue";
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

@XendraTrl(Identifier="17005d71-a936-4c79-e50a-c10ac4801241")
public static String es_PE_FIELD_Level_Name_Name="Nombre";

@XendraTrl(Identifier="17005d71-a936-4c79-e50a-c10ac4801241")
public static String es_PE_FIELD_Level_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="17005d71-a936-4c79-e50a-c10ac4801241")
public static String es_PE_FIELD_Level_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="38ca7e9d-1f5f-ae00-8da5-c1179e63b485",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="17005d71-a936-4c79-e50a-c10ac4801241")
public static final String FIELDNAME_Level_Name="17005d71-a936-4c79-e50a-c10ac4801241";

@XendraTrl(Identifier="923005ac-1eea-1a36-e1ad-f2d795b651e8")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="923005ac-1eea-1a36-e1ad-f2d795b651e8",
Synchronized="2019-08-30 22:21:32.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Note.
@param Note Optional additional user defined information */
public void setNote (String Note)
{
set_Value (COLUMNNAME_Note, Note);
}
/** Get Note.
@return Optional additional user defined information */
public String getNote() 
{
String value = (String)get_Value(COLUMNNAME_Note);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="2c7a8512-cbd5-3f75-ba3b-21f5d485b7f6")
public static String es_PE_FIELD_Level_Note_Name="Nota";

@XendraTrl(Identifier="2c7a8512-cbd5-3f75-ba3b-21f5d485b7f6")
public static String es_PE_FIELD_Level_Note_Description="Información adicional opcional definida por el usuario";

@XendraTrl(Identifier="2c7a8512-cbd5-3f75-ba3b-21f5d485b7f6")
public static String es_PE_FIELD_Level_Note_Help="El campo Nota permite una entrada opcional de información definida por el usuario considerando este registro";

@XendraField(AD_Column_ID="Note",IsCentrallyMaintained=true,
AD_Tab_ID="38ca7e9d-1f5f-ae00-8da5-c1179e63b485",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2c7a8512-cbd5-3f75-ba3b-21f5d485b7f6")
public static final String FIELDNAME_Level_Note="2c7a8512-cbd5-3f75-ba3b-21f5d485b7f6";

@XendraTrl(Identifier="1406a434-ceaa-d39e-8a7d-82bed475c942")
public static String es_PE_COLUMN_Note_Name="Nota";

@XendraColumn(AD_Element_ID="5fea140b-6b26-b544-b237-3b3fa64ae1c6",ColumnName="Note",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1406a434-ceaa-d39e-8a7d-82bed475c942",
Synchronized="2019-08-30 22:21:32.0")
/** Column name Note */
public static final String COLUMNNAME_Note = "Note";
/** Set Print Text.
@param PrintName The label text to be printed on a document or correspondence. */
public void setPrintName (String PrintName)
{
if (PrintName == null) throw new IllegalArgumentException ("PrintName is mandatory.");
if (PrintName.length() > 60)
{
log.warning("Length > 60 - truncated");
PrintName = PrintName.substring(0,59);
}
set_Value (COLUMNNAME_PrintName, PrintName);
}
/** Get Print Text.
@return The label text to be printed on a document or correspondence. */
public String getPrintName() 
{
String value = (String)get_Value(COLUMNNAME_PrintName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="7081c961-0bf0-1eda-126b-3ab1d49ff9e2")
public static String es_PE_FIELD_Level_PrintText_Name="Nombre a ser Impreso";

@XendraTrl(Identifier="7081c961-0bf0-1eda-126b-3ab1d49ff9e2")
public static String es_PE_FIELD_Level_PrintText_Description="Indica el nombre a ser impreso en un documento ó correspondencia";

@XendraTrl(Identifier="7081c961-0bf0-1eda-126b-3ab1d49ff9e2")
public static String es_PE_FIELD_Level_PrintText_Help="El nombre a ser Impreso indica el nombre que será impreso en un documento ó correspondencia";

@XendraField(AD_Column_ID="PrintName",IsCentrallyMaintained=true,
AD_Tab_ID="38ca7e9d-1f5f-ae00-8da5-c1179e63b485",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7081c961-0bf0-1eda-126b-3ab1d49ff9e2")
public static final String FIELDNAME_Level_PrintText="7081c961-0bf0-1eda-126b-3ab1d49ff9e2";

@XendraTrl(Identifier="0afa42ac-d513-4f03-3b05-f6162aced6a2")
public static String es_PE_COLUMN_PrintName_Name="Nombre a ser Impreso";

@XendraColumn(AD_Element_ID="83f7d1df-e4e7-adff-3bda-43555a334585",ColumnName="PrintName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0afa42ac-d513-4f03-3b05-f6162aced6a2",
Synchronized="2019-08-30 22:21:32.0")
/** Column name PrintName */
public static final String COLUMNNAME_PrintName = "PrintName";
}
