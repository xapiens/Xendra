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
/** Generated Model for C_DunningRunLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_DunningRunLine extends PO
{
/** Standard Constructor
@param ctx context
@param C_DunningRunLine_ID id
@param trxName transaction
*/
public X_C_DunningRunLine (Properties ctx, int C_DunningRunLine_ID, String trxName)
{
super (ctx, C_DunningRunLine_ID, trxName);
/** if (C_DunningRunLine_ID == 0)
{
setAmt (Env.ZERO);	
// 0
setC_DunningRunEntry_ID (0);
setC_DunningRunLine_ID (0);
setConvertedAmt (Env.ZERO);	
// 0
setDaysDue (0);
setFeeAmt (Env.ZERO);	
// 0
setInterestAmt (Env.ZERO);	
// 0
setIsInDispute (false);	
// N
setOpenAmt (Env.ZERO);	
// 0
setProcessed (false);	
// N
setTimesDunned (0);
setTotalAmt (Env.ZERO);	
// 0
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_DunningRunLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=524 */
public static int Table_ID=MTable.getTable_ID("C_DunningRunLine");

@XendraTrl(Identifier="c2e5e729-4869-d995-2cc1-24e900efc2bb")
public static String es_PE_TAB_Line_Name="Ìtem";
@XendraTab(Name="Line",
Description="Dinning Run Line",Help="Maintain the information of the dunning letter line",
AD_Window_ID="a455d38f-dfdf-f625-e59d-84fe05432eea",SeqNo=30,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="c2e5e729-4869-d995-2cc1-24e900efc2bb",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Line="c2e5e729-4869-d995-2cc1-24e900efc2bb";

@XendraTrl(Identifier="369fff62-123a-67ff-c187-5652ad25f528")
public static String es_PE_TABLE_C_DunningRunLine_Name="Línea del Secuencial de Morosidad";


@XendraTable(Name="Dunning Run Line",Description="Dunning Run Line",Help="",
TableName="C_DunningRunLine",AccessLevel="3",AD_Window_ID="a455d38f-dfdf-f625-e59d-84fe05432eea",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="369fff62-123a-67ff-c187-5652ad25f528",Synchronized="2017-08-16 11:41:46.0")
/** TableName=C_DunningRunLine */
public static final String Table_Name="C_DunningRunLine";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_DunningRunLine");

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
    Table_ID = MTable.getTable_ID("C_DunningRunLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_DunningRunLine[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="8dd5014f-669d-0223-346d-23efa5dcd882")
public static String es_PE_FIELD_Line_Amount_Description="Total límite para el envío de facturas";

@XendraTrl(Identifier="8dd5014f-669d-0223-346d-23efa5dcd882")
public static String es_PE_FIELD_Line_Amount_Help="El campo total indica el límite en el que las facturas no serán generadas. Si el total total de la factura esta por debajo de este total; la factura  no será enviada en esta corrida programada. Este campo es solamente desplegado si el cuadro de verificación de total límite es seleccionado";

@XendraTrl(Identifier="8dd5014f-669d-0223-346d-23efa5dcd882")
public static String es_PE_FIELD_Line_Amount_Name="Total";
@XendraField(AD_Column_ID="Amt",
IsCentrallyMaintained=true,AD_Tab_ID="c2e5e729-4869-d995-2cc1-24e900efc2bb",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=70,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="8dd5014f-669d-0223-346d-23efa5dcd882")
public static final String FIELDNAME_Line_Amount="8dd5014f-669d-0223-346d-23efa5dcd882";

@XendraTrl(Identifier="a5c1651d-3b36-73d5-ca55-5472d0cc4b95")
public static String es_PE_COLUMN_Amt_Name="Total";

@XendraColumn(AD_Element_ID="42827f15-aceb-2f14-cc38-b4a7c6022136",ColumnName="Amt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a5c1651d-3b36-73d5-ca55-5472d0cc4b95",
Synchronized="2017-08-05 16:53:38.0")
/** Column name Amt */
public static final String COLUMNNAME_Amt = "Amt";
/** Set Dunning Run Entry.
@param C_DunningRunEntry_ID Dunning Run Entry */
public void setC_DunningRunEntry_ID (int C_DunningRunEntry_ID)
{
if (C_DunningRunEntry_ID < 1) throw new IllegalArgumentException ("C_DunningRunEntry_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_DunningRunEntry_ID, Integer.valueOf(C_DunningRunEntry_ID));
}
/** Get Dunning Run Entry.
@return Dunning Run Entry */
public int getC_DunningRunEntry_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DunningRunEntry_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8636d567-2dcf-d83d-5b52-6b37e29bb569")
public static String es_PE_FIELD_Line_DunningRunEntry_Description="Entrada del secuencial de Informes de morosidad";

@XendraTrl(Identifier="8636d567-2dcf-d83d-5b52-6b37e29bb569")
public static String es_PE_FIELD_Line_DunningRunEntry_Name="Entrada de secuencial de Morosidad";

@XendraField(AD_Column_ID="C_DunningRunEntry_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2e5e729-4869-d995-2cc1-24e900efc2bb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8636d567-2dcf-d83d-5b52-6b37e29bb569")
public static final String FIELDNAME_Line_DunningRunEntry="8636d567-2dcf-d83d-5b52-6b37e29bb569";

@XendraTrl(Identifier="6b491a5c-0a2f-1864-8f45-9ca57e056bad")
public static String es_PE_COLUMN_C_DunningRunEntry_ID_Name="Entrada de secuencial de Morosidad";

@XendraColumn(AD_Element_ID="048e9391-6a02-5770-5236-20f13b1a6cdc",
ColumnName="C_DunningRunEntry_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6b491a5c-0a2f-1864-8f45-9ca57e056bad",Synchronized="2017-08-05 16:53:39.0")
/** Column name C_DunningRunEntry_ID */
public static final String COLUMNNAME_C_DunningRunEntry_ID = "C_DunningRunEntry_ID";
/** Set Dunning Run Line.
@param C_DunningRunLine_ID Dunning Run Line */
public void setC_DunningRunLine_ID (int C_DunningRunLine_ID)
{
if (C_DunningRunLine_ID < 1) throw new IllegalArgumentException ("C_DunningRunLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_DunningRunLine_ID, Integer.valueOf(C_DunningRunLine_ID));
}
/** Get Dunning Run Line.
@return Dunning Run Line */
public int getC_DunningRunLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DunningRunLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="20bac99f-6bc6-5868-8ccf-451a1e294ac6")
public static String es_PE_FIELD_Line_DunningRunLine_Description="Línea del secuencial del Informe de morosidad";

@XendraTrl(Identifier="20bac99f-6bc6-5868-8ccf-451a1e294ac6")
public static String es_PE_FIELD_Line_DunningRunLine_Name="Item de Secuencial de Morosidad";

@XendraField(AD_Column_ID="C_DunningRunLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2e5e729-4869-d995-2cc1-24e900efc2bb",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="20bac99f-6bc6-5868-8ccf-451a1e294ac6")
public static final String FIELDNAME_Line_DunningRunLine="20bac99f-6bc6-5868-8ccf-451a1e294ac6";
/** Column name C_DunningRunLine_ID */
public static final String COLUMNNAME_C_DunningRunLine_ID = "C_DunningRunLine_ID";
/** Set Invoice.
@param C_Invoice_ID Invoice Identifier */
public void setC_Invoice_ID (int C_Invoice_ID)
{
if (C_Invoice_ID <= 0) set_Value (COLUMNNAME_C_Invoice_ID, null);
 else 
set_Value (COLUMNNAME_C_Invoice_ID, Integer.valueOf(C_Invoice_ID));
}
/** Get Invoice.
@return Invoice Identifier */
public int getC_Invoice_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Invoice_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getC_Invoice_ID()));
}

@XendraTrl(Identifier="20b2468c-35ba-3a56-2399-397d383a30a8")
public static String es_PE_FIELD_Line_Invoice_Description="Identificador de la factura";

@XendraTrl(Identifier="20b2468c-35ba-3a56-2399-397d383a30a8")
public static String es_PE_FIELD_Line_Invoice_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraTrl(Identifier="20b2468c-35ba-3a56-2399-397d383a30a8")
public static String es_PE_FIELD_Line_Invoice_Name="Factura";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2e5e729-4869-d995-2cc1-24e900efc2bb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="20b2468c-35ba-3a56-2399-397d383a30a8")
public static final String FIELDNAME_Line_Invoice="20b2468c-35ba-3a56-2399-397d383a30a8";

@XendraTrl(Identifier="e3476a0c-d6e5-3001-1789-79a7ee4b11ee")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Factura";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@C_Invoice_ID@!0 | @C_Payment_ID@!0",IsIdentifier=true,SeqNo=1,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e3476a0c-d6e5-3001-1789-79a7ee4b11ee",Synchronized="2017-08-05 16:53:39.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
/** Set Converted Amount.
@param ConvertedAmt Converted Amount */
public void setConvertedAmt (BigDecimal ConvertedAmt)
{
if (ConvertedAmt == null) throw new IllegalArgumentException ("ConvertedAmt is mandatory.");
set_Value (COLUMNNAME_ConvertedAmt, ConvertedAmt);
}
/** Get Converted Amount.
@return Converted Amount */
public BigDecimal getConvertedAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ConvertedAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="89cdd619-a753-3932-5a93-e3612912d3dd")
public static String es_PE_FIELD_Line_ConvertedAmount_Description="Total Convertido";

@XendraTrl(Identifier="89cdd619-a753-3932-5a93-e3612912d3dd")
public static String es_PE_FIELD_Line_ConvertedAmount_Help="El Total convertido es el resultado de multiplicar el total fuente por la tasa de conversión para esta moneda destino.";

@XendraTrl(Identifier="89cdd619-a753-3932-5a93-e3612912d3dd")
public static String es_PE_FIELD_Line_ConvertedAmount_Name="Total Convertido";

@XendraField(AD_Column_ID="ConvertedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="c2e5e729-4869-d995-2cc1-24e900efc2bb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="89cdd619-a753-3932-5a93-e3612912d3dd")
public static final String FIELDNAME_Line_ConvertedAmount="89cdd619-a753-3932-5a93-e3612912d3dd";

@XendraTrl(Identifier="086a7018-877d-eb5f-fe5a-3190e7a0543d")
public static String es_PE_COLUMN_ConvertedAmt_Name="Total Convertido";

@XendraColumn(AD_Element_ID="6b6925fc-75bd-914f-a973-fc059d2b2f46",ColumnName="ConvertedAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="086a7018-877d-eb5f-fe5a-3190e7a0543d",
Synchronized="2017-08-05 16:53:39.0")
/** Column name ConvertedAmt */
public static final String COLUMNNAME_ConvertedAmt = "ConvertedAmt";
/** Set Payment.
@param C_Payment_ID Payment identifier */
public void setC_Payment_ID (int C_Payment_ID)
{
if (C_Payment_ID <= 0) set_Value (COLUMNNAME_C_Payment_ID, null);
 else 
set_Value (COLUMNNAME_C_Payment_ID, Integer.valueOf(C_Payment_ID));
}
/** Get Payment.
@return Payment identifier */
public int getC_Payment_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Payment_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="89b3efce-1fff-69fa-fd63-983f5b611c9c")
public static String es_PE_FIELD_Line_Payment_Description="Identificador del pago";

@XendraTrl(Identifier="89b3efce-1fff-69fa-fd63-983f5b611c9c")
public static String es_PE_FIELD_Line_Payment_Help="El pago es un identificador único de este pago.";

@XendraTrl(Identifier="89b3efce-1fff-69fa-fd63-983f5b611c9c")
public static String es_PE_FIELD_Line_Payment_Name="Pago";
@XendraField(AD_Column_ID="C_Payment_ID",
IsCentrallyMaintained=true,AD_Tab_ID="c2e5e729-4869-d995-2cc1-24e900efc2bb",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="89b3efce-1fff-69fa-fd63-983f5b611c9c")
public static final String FIELDNAME_Line_Payment="89b3efce-1fff-69fa-fd63-983f5b611c9c";

@XendraTrl(Identifier="01883e8c-f408-2ac4-f2db-b1e4ae080c4f")
public static String es_PE_COLUMN_C_Payment_ID_Name="Pago";

@XendraColumn(AD_Element_ID="3ded5658-968e-94c5-207b-eed6f6a7bb43",ColumnName="C_Payment_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@C_Invoice_ID@!0 | @C_Payment_ID@!0",IsIdentifier=true,SeqNo=2,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="01883e8c-f408-2ac4-f2db-b1e4ae080c4f",Synchronized="2017-08-05 16:53:39.0")
/** Column name C_Payment_ID */
public static final String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
/** Set Days due.
@param DaysDue Number of days due (negative: due in number of days) */
public void setDaysDue (int DaysDue)
{
set_Value (COLUMNNAME_DaysDue, Integer.valueOf(DaysDue));
}
/** Get Days due.
@return Number of days due (negative: due in number of days) */
public int getDaysDue() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_DaysDue);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="51bd4c43-ec44-865e-3f31-6333b1dc02e4")
public static String es_PE_FIELD_Line_DaysDue_Description="Número de días de vencimiento (negativo; por vencer)";

@XendraTrl(Identifier="51bd4c43-ec44-865e-3f31-6333b1dc02e4")
public static String es_PE_FIELD_Line_DaysDue_Name="Días de Vencimiento";

@XendraField(AD_Column_ID="DaysDue",IsCentrallyMaintained=true,
AD_Tab_ID="c2e5e729-4869-d995-2cc1-24e900efc2bb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=110,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="51bd4c43-ec44-865e-3f31-6333b1dc02e4")
public static final String FIELDNAME_Line_DaysDue="51bd4c43-ec44-865e-3f31-6333b1dc02e4";

@XendraTrl(Identifier="d1ad06cc-7182-e310-87c1-946595b3a85b")
public static String es_PE_COLUMN_DaysDue_Name="Días de Vencimiento";

@XendraColumn(AD_Element_ID="64acd2e4-02d1-dcb5-c65f-a18bd0b91443",ColumnName="DaysDue",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d1ad06cc-7182-e310-87c1-946595b3a85b",
Synchronized="2017-08-05 16:53:39.0")
/** Column name DaysDue */
public static final String COLUMNNAME_DaysDue = "DaysDue";
/** Set Fee Amount.
@param FeeAmt Fee amount in invoice currency */
public void setFeeAmt (BigDecimal FeeAmt)
{
if (FeeAmt == null) throw new IllegalArgumentException ("FeeAmt is mandatory.");
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

@XendraTrl(Identifier="e113d6c7-ceec-12bf-11de-1ac370cb42f1")
public static String es_PE_FIELD_Line_FeeAmount_Description="Total de la tarifa en moneda de la factura";

@XendraTrl(Identifier="e113d6c7-ceec-12bf-11de-1ac370cb42f1")
public static String es_PE_FIELD_Line_FeeAmount_Help="El Total tarifa indica el total del cargo en una carta de morosidad por facturas vencidas. Este campo sólo se desplegará si el cuadro de verificación cargar tarifa ha sido seleccionado";

@XendraTrl(Identifier="e113d6c7-ceec-12bf-11de-1ac370cb42f1")
public static String es_PE_FIELD_Line_FeeAmount_Name="Total de Tarifa";

@XendraField(AD_Column_ID="FeeAmt",IsCentrallyMaintained=true,
AD_Tab_ID="c2e5e729-4869-d995-2cc1-24e900efc2bb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e113d6c7-ceec-12bf-11de-1ac370cb42f1")
public static final String FIELDNAME_Line_FeeAmount="e113d6c7-ceec-12bf-11de-1ac370cb42f1";

@XendraTrl(Identifier="e8b108f8-a57b-43b8-9628-6ff811e353f3")
public static String es_PE_COLUMN_FeeAmt_Name="Total de Tarifa";

@XendraColumn(AD_Element_ID="9c6f3b0a-0969-f64c-7214-c03efd2f8112",ColumnName="FeeAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e8b108f8-a57b-43b8-9628-6ff811e353f3",
Synchronized="2017-08-05 16:53:39.0")
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
@XendraTrl(Identifier="7f993c44-dcb9-4177-afb1-41cbd3c91250")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7f993c44-dcb9-4177-afb1-41cbd3c91250",
Synchronized="2017-08-05 16:53:39.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Interest Amount.
@param InterestAmt Interest Amount */
public void setInterestAmt (BigDecimal InterestAmt)
{
if (InterestAmt == null) throw new IllegalArgumentException ("InterestAmt is mandatory.");
set_Value (COLUMNNAME_InterestAmt, InterestAmt);
}
/** Get Interest Amount.
@return Interest Amount */
public BigDecimal getInterestAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_InterestAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="981c197a-4cbf-1ace-422a-dd096655ee51")
public static String es_PE_FIELD_Line_InterestAmount_Description="Total del interés";

@XendraTrl(Identifier="981c197a-4cbf-1ace-422a-dd096655ee51")
public static String es_PE_FIELD_Line_InterestAmount_Help="El Total del Interés indica cualquier interés cargado ó recibido en un estado de cuenta bancario";

@XendraTrl(Identifier="981c197a-4cbf-1ace-422a-dd096655ee51")
public static String es_PE_FIELD_Line_InterestAmount_Name="Total del Interés";

@XendraField(AD_Column_ID="InterestAmt",IsCentrallyMaintained=true,
AD_Tab_ID="c2e5e729-4869-d995-2cc1-24e900efc2bb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="981c197a-4cbf-1ace-422a-dd096655ee51")
public static final String FIELDNAME_Line_InterestAmount="981c197a-4cbf-1ace-422a-dd096655ee51";

@XendraTrl(Identifier="dbccdaf7-196f-8a84-5cbe-59e4ce30ee52")
public static String es_PE_COLUMN_InterestAmt_Name="Total del Interés";

@XendraColumn(AD_Element_ID="94999794-0276-6683-3826-7546d7f35a50",ColumnName="InterestAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dbccdaf7-196f-8a84-5cbe-59e4ce30ee52",
Synchronized="2017-08-05 16:53:39.0")
/** Column name InterestAmt */
public static final String COLUMNNAME_InterestAmt = "InterestAmt";
/** Set In Dispute.
@param IsInDispute Document is in dispute */
public void setIsInDispute (boolean IsInDispute)
{
set_Value (COLUMNNAME_IsInDispute, Boolean.valueOf(IsInDispute));
}
/** Get In Dispute.
@return Document is in dispute */
public boolean isInDispute() 
{
Object oo = get_Value(COLUMNNAME_IsInDispute);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="d0df7f26-2734-d98a-0162-1e92e002ac99")
public static String es_PE_FIELD_Line_InDispute_Description="Documento en negociación";

@XendraTrl(Identifier="d0df7f26-2734-d98a-0162-1e92e002ac99")
public static String es_PE_FIELD_Line_InDispute_Help="Documento en negociación";

@XendraTrl(Identifier="d0df7f26-2734-d98a-0162-1e92e002ac99")
public static String es_PE_FIELD_Line_InDispute_Name="En Negociación";

@XendraField(AD_Column_ID="IsInDispute",IsCentrallyMaintained=true,
AD_Tab_ID="c2e5e729-4869-d995-2cc1-24e900efc2bb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d0df7f26-2734-d98a-0162-1e92e002ac99")
public static final String FIELDNAME_Line_InDispute="d0df7f26-2734-d98a-0162-1e92e002ac99";

@XendraTrl(Identifier="de856ffa-177e-1f81-389a-d341f29ac371")
public static String es_PE_COLUMN_IsInDispute_Name="En Negociación";

@XendraColumn(AD_Element_ID="4d75c777-0a61-61e6-1a19-413ad176740e",ColumnName="IsInDispute",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="de856ffa-177e-1f81-389a-d341f29ac371",
Synchronized="2017-08-05 16:53:39.0")
/** Column name IsInDispute */
public static final String COLUMNNAME_IsInDispute = "IsInDispute";
/** Set Open Amount.
@param OpenAmt Open item amount */
public void setOpenAmt (BigDecimal OpenAmt)
{
if (OpenAmt == null) throw new IllegalArgumentException ("OpenAmt is mandatory.");
set_Value (COLUMNNAME_OpenAmt, OpenAmt);
}
/** Get Open Amount.
@return Open item amount */
public BigDecimal getOpenAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_OpenAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="c4352360-d99d-387d-a5d5-8b5a3738bc3f")
public static String es_PE_FIELD_Line_OpenAmount_Description="Total abierto de la partida";

@XendraTrl(Identifier="c4352360-d99d-387d-a5d5-8b5a3738bc3f")
public static String es_PE_FIELD_Line_OpenAmount_Name="Total Abierto";

@XendraField(AD_Column_ID="OpenAmt",IsCentrallyMaintained=true,
AD_Tab_ID="c2e5e729-4869-d995-2cc1-24e900efc2bb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c4352360-d99d-387d-a5d5-8b5a3738bc3f")
public static final String FIELDNAME_Line_OpenAmount="c4352360-d99d-387d-a5d5-8b5a3738bc3f";

@XendraTrl(Identifier="ad2e42e6-6696-dd35-b0ac-260e7cfc3985")
public static String es_PE_COLUMN_OpenAmt_Name="Total Abierto";

@XendraColumn(AD_Element_ID="89a287e4-b72d-e4d4-2a42-90bcfde3d1ae",ColumnName="OpenAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ad2e42e6-6696-dd35-b0ac-260e7cfc3985",
Synchronized="2017-08-05 16:53:39.0")
/** Column name OpenAmt */
public static final String COLUMNNAME_OpenAmt = "OpenAmt";
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

@XendraTrl(Identifier="2223dec6-fb71-e49f-46f6-36725fb44454")
public static String es_PE_FIELD_Line_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="2223dec6-fb71-e49f-46f6-36725fb44454")
public static String es_PE_FIELD_Line_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="2223dec6-fb71-e49f-46f6-36725fb44454")
public static String es_PE_FIELD_Line_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="c2e5e729-4869-d995-2cc1-24e900efc2bb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=160,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2223dec6-fb71-e49f-46f6-36725fb44454")
public static final String FIELDNAME_Line_Processed="2223dec6-fb71-e49f-46f6-36725fb44454";

@XendraTrl(Identifier="dcd87cd0-b0e1-e365-0052-0c717491e4a3")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dcd87cd0-b0e1-e365-0052-0c717491e4a3",
Synchronized="2017-08-05 16:53:39.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set Times Dunned.
@param TimesDunned Number of times dunned previously */
public void setTimesDunned (int TimesDunned)
{
set_Value (COLUMNNAME_TimesDunned, Integer.valueOf(TimesDunned));
}
/** Get Times Dunned.
@return Number of times dunned previously */
public int getTimesDunned() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_TimesDunned);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="00d17538-26c9-a390-333b-39c5c377d9e4")
public static String es_PE_FIELD_Line_TimesDunned_Description="Número de veces realizado previamente.";

@XendraTrl(Identifier="00d17538-26c9-a390-333b-39c5c377d9e4")
public static String es_PE_FIELD_Line_TimesDunned_Name="Veces Realizado";

@XendraField(AD_Column_ID="TimesDunned",IsCentrallyMaintained=true,
AD_Tab_ID="c2e5e729-4869-d995-2cc1-24e900efc2bb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="00d17538-26c9-a390-333b-39c5c377d9e4")
public static final String FIELDNAME_Line_TimesDunned="00d17538-26c9-a390-333b-39c5c377d9e4";

@XendraTrl(Identifier="b5781df1-15e4-cf2b-f6a0-dab2fc0e816c")
public static String es_PE_COLUMN_TimesDunned_Name="Veces Realizado";

@XendraColumn(AD_Element_ID="abd9f37b-566d-4dfd-9dfb-0fa9954a81d1",ColumnName="TimesDunned",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b5781df1-15e4-cf2b-f6a0-dab2fc0e816c",
Synchronized="2017-08-05 16:53:39.0")
/** Column name TimesDunned */
public static final String COLUMNNAME_TimesDunned = "TimesDunned";
/** Set Total Amount.
@param TotalAmt Total Amount */
public void setTotalAmt (BigDecimal TotalAmt)
{
if (TotalAmt == null) throw new IllegalArgumentException ("TotalAmt is mandatory.");
set_Value (COLUMNNAME_TotalAmt, TotalAmt);
}
/** Get Total Amount.
@return Total Amount */
public BigDecimal getTotalAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TotalAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="e15eb4f6-f58f-a455-899d-467c81fe772c")
public static String es_PE_FIELD_Line_TotalAmount_Description="Total Total";

@XendraTrl(Identifier="e15eb4f6-f58f-a455-899d-467c81fe772c")
public static String es_PE_FIELD_Line_TotalAmount_Help="Indica el total total del documento";

@XendraTrl(Identifier="e15eb4f6-f58f-a455-899d-467c81fe772c")
public static String es_PE_FIELD_Line_TotalAmount_Name="Total Total";

@XendraField(AD_Column_ID="TotalAmt",IsCentrallyMaintained=true,
AD_Tab_ID="c2e5e729-4869-d995-2cc1-24e900efc2bb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e15eb4f6-f58f-a455-899d-467c81fe772c")
public static final String FIELDNAME_Line_TotalAmount="e15eb4f6-f58f-a455-899d-467c81fe772c";

@XendraTrl(Identifier="21b54e4d-84d5-793c-7fd3-d2514f981e1f")
public static String es_PE_COLUMN_TotalAmt_Name="Total Total";

@XendraColumn(AD_Element_ID="c413def6-435d-8c44-d0d5-90526042b2e0",ColumnName="TotalAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="21b54e4d-84d5-793c-7fd3-d2514f981e1f",
Synchronized="2017-08-05 16:53:39.0")
/** Column name TotalAmt */
public static final String COLUMNNAME_TotalAmt = "TotalAmt";
}
