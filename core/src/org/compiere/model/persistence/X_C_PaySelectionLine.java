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
import org.compiere.model.reference.REF__PaymentRule;
/** Generated Model for C_PaySelectionLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_PaySelectionLine extends PO
{
/** Standard Constructor
@param ctx context
@param C_PaySelectionLine_ID id
@param trxName transaction
*/
public X_C_PaySelectionLine (Properties ctx, int C_PaySelectionLine_ID, String trxName)
{
super (ctx, C_PaySelectionLine_ID, trxName);
/** if (C_PaySelectionLine_ID == 0)
{
setC_Invoice_ID (0);
setC_PaySelection_ID (0);
setC_PaySelectionLine_ID (0);
setDifferenceAmt (Env.ZERO);	
// 0
setDiscountAmt (Env.ZERO);	
// 0
setIsManual (false);	
// N
setIsSOTrx (false);	
// N
setLine (0);	
// @SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM C_PaySelectionLine WHERE C_PaySelection_ID=@C_PaySelection_ID@
setOpenAmt (Env.ZERO);	
// 0
setPayAmt (Env.ZERO);	
// 0
setPaymentRule (null);	
// S
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
public X_C_PaySelectionLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=427 */
public static int Table_ID=MTable.getTable_ID("C_PaySelectionLine");

@XendraTrl(Identifier="6be3a1c6-8199-e467-9b08-3a894b51133b")
public static String es_PE_TAB_PaymentSelectionLine_Description="Ìtem de selección de pago";

@XendraTrl(Identifier="6be3a1c6-8199-e467-9b08-3a894b51133b")
public static String es_PE_TAB_PaymentSelectionLine_Name="Ìtem de Selección de Pago";

@XendraTrl(Identifier="6be3a1c6-8199-e467-9b08-3a894b51133b")
public static String es_PE_TAB_PaymentSelectionLine_Help="La pestaña Ìtem de Selección de Pago define las facturas individuales que una organización le esta pagando a un proveedor con este pago.";

@XendraTab(Name="Payment Selection Line",Description="Payment Selection Line",
Help="The Payment Selection Line Tab defines the individual invoices an organization is paying to a Vendor with this payment.",
AD_Window_ID="3b3a39ee-5fa5-65fa-8f03-b3cbf65cc9e9",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="6be3a1c6-8199-e467-9b08-3a894b51133b",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_PaymentSelectionLine="6be3a1c6-8199-e467-9b08-3a894b51133b";

@XendraTrl(Identifier="c1b97758-a4d2-f843-1636-ac521b13a33a")
public static String es_PE_TABLE_C_PaySelectionLine_Name="Línea de Selección de Pago";


@XendraTable(Name="Payment Selection Line",Description="Payment Selection Line",Help="",
TableName="C_PaySelectionLine",AccessLevel="1",AD_Window_ID="3b3a39ee-5fa5-65fa-8f03-b3cbf65cc9e9",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="c1b97758-a4d2-f843-1636-ac521b13a33a",Synchronized="2017-08-16 11:42:12.0")
/** TableName=C_PaySelectionLine */
public static final String Table_Name="C_PaySelectionLine";


@XendraIndex(Name="c_payselline_paysel",Identifier="311c1d53-fee0-b738-02f2-cc2deed10d12",
Column_Names="c_payselection_id",IsUnique="false",
TableIdentifier="311c1d53-fee0-b738-02f2-cc2deed10d12",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_payselline_paysel = "311c1d53-fee0-b738-02f2-cc2deed10d12";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_PaySelectionLine");

protected BigDecimal accessLevel = BigDecimal.valueOf(1);
/** AccessLevel
@return 1 - Org 
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
    Table_ID = MTable.getTable_ID("C_PaySelectionLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_PaySelectionLine[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Invoice.
@param C_Invoice_ID Invoice Identifier */
public void setC_Invoice_ID (int C_Invoice_ID)
{
if (C_Invoice_ID < 1) throw new IllegalArgumentException ("C_Invoice_ID is mandatory.");
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

@XendraTrl(Identifier="3c9f9a01-5086-e27f-9615-e0fbbc27edb2")
public static String es_PE_FIELD_PaymentSelectionLine_Invoice_Description="Identificador de la factura";

@XendraTrl(Identifier="3c9f9a01-5086-e27f-9615-e0fbbc27edb2")
public static String es_PE_FIELD_PaymentSelectionLine_Invoice_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraTrl(Identifier="3c9f9a01-5086-e27f-9615-e0fbbc27edb2")
public static String es_PE_FIELD_PaymentSelectionLine_Invoice_Name="Factura";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6be3a1c6-8199-e467-9b08-3a894b51133b",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3c9f9a01-5086-e27f-9615-e0fbbc27edb2")
public static final String FIELDNAME_PaymentSelectionLine_Invoice="3c9f9a01-5086-e27f-9615-e0fbbc27edb2";

@XendraTrl(Identifier="a820446f-5c76-51df-0359-08f068c69db6")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Factura";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutPaySelection.invoice",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a820446f-5c76-51df-0359-08f068c69db6",
Synchronized="2017-08-05 16:54:05.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
/** Set Pay Selection Check.
@param C_PaySelectionCheck_ID Payment Selection Check */
public void setC_PaySelectionCheck_ID (int C_PaySelectionCheck_ID)
{
if (C_PaySelectionCheck_ID <= 0) set_Value (COLUMNNAME_C_PaySelectionCheck_ID, null);
 else 
set_Value (COLUMNNAME_C_PaySelectionCheck_ID, Integer.valueOf(C_PaySelectionCheck_ID));
}
/** Get Pay Selection Check.
@return Payment Selection Check */
public int getC_PaySelectionCheck_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_PaySelectionCheck_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a090e105-8f1c-7d27-a28f-f775678ad9b5")
public static String es_PE_FIELD_PaymentSelectionLine_PaySelectionCheck_Description="Revisión de selección de pago";

@XendraTrl(Identifier="a090e105-8f1c-7d27-a28f-f775678ad9b5")
public static String es_PE_FIELD_PaymentSelectionLine_PaySelectionCheck_Name="Revisión de Selección de Pago";

@XendraField(AD_Column_ID="C_PaySelectionCheck_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6be3a1c6-8199-e467-9b08-3a894b51133b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a090e105-8f1c-7d27-a28f-f775678ad9b5")
public static final String FIELDNAME_PaymentSelectionLine_PaySelectionCheck="a090e105-8f1c-7d27-a28f-f775678ad9b5";

@XendraTrl(Identifier="c4638540-faf1-3658-f89e-34e5d09e9976")
public static String es_PE_COLUMN_C_PaySelectionCheck_ID_Name="Revisión de Selección de Pago";

@XendraColumn(AD_Element_ID="4b03e117-2aa0-f847-ea99-82dcc040d3ff",
ColumnName="C_PaySelectionCheck_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c4638540-faf1-3658-f89e-34e5d09e9976",Synchronized="2017-08-05 16:54:05.0")
/** Column name C_PaySelectionCheck_ID */
public static final String COLUMNNAME_C_PaySelectionCheck_ID = "C_PaySelectionCheck_ID";
/** Set Payment Selection.
@param C_PaySelection_ID Payment Selection */
public void setC_PaySelection_ID (int C_PaySelection_ID)
{
if (C_PaySelection_ID < 1) throw new IllegalArgumentException ("C_PaySelection_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_PaySelection_ID, Integer.valueOf(C_PaySelection_ID));
}
/** Get Payment Selection.
@return Payment Selection */
public int getC_PaySelection_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_PaySelection_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9996839d-2a70-2b2e-e604-14c113b867a5")
public static String es_PE_FIELD_PaymentSelectionLine_PaymentSelection_Description="Selección de Pago";

@XendraTrl(Identifier="9996839d-2a70-2b2e-e604-14c113b867a5")
public static String es_PE_FIELD_PaymentSelectionLine_PaymentSelection_Help="La selección de pago identifica un pago único.";

@XendraTrl(Identifier="9996839d-2a70-2b2e-e604-14c113b867a5")
public static String es_PE_FIELD_PaymentSelectionLine_PaymentSelection_Name="Selección de Pago";

@XendraField(AD_Column_ID="C_PaySelection_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6be3a1c6-8199-e467-9b08-3a894b51133b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9996839d-2a70-2b2e-e604-14c113b867a5")
public static final String FIELDNAME_PaymentSelectionLine_PaymentSelection="9996839d-2a70-2b2e-e604-14c113b867a5";

@XendraTrl(Identifier="67f30178-36a1-cbd0-0bda-7f9cac9bfb20")
public static String es_PE_COLUMN_C_PaySelection_ID_Name="Selección de Pago";

@XendraColumn(AD_Element_ID="79f02f46-d5fc-1851-93df-8e77a06c5431",ColumnName="C_PaySelection_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="67f30178-36a1-cbd0-0bda-7f9cac9bfb20",
Synchronized="2017-08-05 16:54:05.0")
/** Column name C_PaySelection_ID */
public static final String COLUMNNAME_C_PaySelection_ID = "C_PaySelection_ID";
/** Set Payment Selection Line.
@param C_PaySelectionLine_ID Payment Selection Line */
public void setC_PaySelectionLine_ID (int C_PaySelectionLine_ID)
{
if (C_PaySelectionLine_ID < 1) throw new IllegalArgumentException ("C_PaySelectionLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_PaySelectionLine_ID, Integer.valueOf(C_PaySelectionLine_ID));
}
/** Get Payment Selection Line.
@return Payment Selection Line */
public int getC_PaySelectionLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_PaySelectionLine_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getC_PaySelectionLine_ID()));
}

@XendraTrl(Identifier="c0f00061-4335-5a4b-c0dc-5b0dccabdc70")
public static String es_PE_FIELD_PaymentSelectionLine_PaymentSelectionLine_Description="Item de Selección de Pago";

@XendraTrl(Identifier="c0f00061-4335-5a4b-c0dc-5b0dccabdc70")
public static String es_PE_FIELD_PaymentSelectionLine_PaymentSelectionLine_Help="Identifica un Item único en un pago";

@XendraTrl(Identifier="c0f00061-4335-5a4b-c0dc-5b0dccabdc70")
public static String es_PE_FIELD_PaymentSelectionLine_PaymentSelectionLine_Name="Item de Selección de Pago";

@XendraField(AD_Column_ID="C_PaySelectionLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6be3a1c6-8199-e467-9b08-3a894b51133b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c0f00061-4335-5a4b-c0dc-5b0dccabdc70")
public static final String FIELDNAME_PaymentSelectionLine_PaymentSelectionLine="c0f00061-4335-5a4b-c0dc-5b0dccabdc70";
/** Column name C_PaySelectionLine_ID */
public static final String COLUMNNAME_C_PaySelectionLine_ID = "C_PaySelectionLine_ID";
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

@XendraTrl(Identifier="b865170d-913a-a9eb-5929-7f71c4050a26")
public static String es_PE_FIELD_PaymentSelectionLine_Description_Description="Observación";

@XendraTrl(Identifier="b865170d-913a-a9eb-5929-7f71c4050a26")
public static String es_PE_FIELD_PaymentSelectionLine_Description_Help="Observación";

@XendraTrl(Identifier="b865170d-913a-a9eb-5929-7f71c4050a26")
public static String es_PE_FIELD_PaymentSelectionLine_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="6be3a1c6-8199-e467-9b08-3a894b51133b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b865170d-913a-a9eb-5929-7f71c4050a26")
public static final String FIELDNAME_PaymentSelectionLine_Description="b865170d-913a-a9eb-5929-7f71c4050a26";

@XendraTrl(Identifier="b899dd72-5a61-5acf-8b8f-89989d78f5ba")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b899dd72-5a61-5acf-8b8f-89989d78f5ba",
Synchronized="2017-08-05 16:54:05.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Difference.
@param DifferenceAmt Difference Amount */
public void setDifferenceAmt (BigDecimal DifferenceAmt)
{
if (DifferenceAmt == null) throw new IllegalArgumentException ("DifferenceAmt is mandatory.");
set_ValueNoCheck (COLUMNNAME_DifferenceAmt, DifferenceAmt);
}
/** Get Difference.
@return Difference Amount */
public BigDecimal getDifferenceAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_DifferenceAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="ea9926e4-7082-17f6-69d4-25b105a5cfb5")
public static String es_PE_FIELD_PaymentSelectionLine_Difference_Name="Diferencia monto";

@XendraField(AD_Column_ID="DifferenceAmt",IsCentrallyMaintained=true,
AD_Tab_ID="6be3a1c6-8199-e467-9b08-3a894b51133b",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ea9926e4-7082-17f6-69d4-25b105a5cfb5")
public static final String FIELDNAME_PaymentSelectionLine_Difference="ea9926e4-7082-17f6-69d4-25b105a5cfb5";

@XendraTrl(Identifier="20a6e4e2-fbb0-d0f8-e377-33a62f29723c")
public static String es_PE_COLUMN_DifferenceAmt_Name="Diferencia monto";

@XendraColumn(AD_Element_ID="62840044-943e-7971-69a5-7954e25dfe29",ColumnName="DifferenceAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="20a6e4e2-fbb0-d0f8-e377-33a62f29723c",
Synchronized="2017-08-05 16:54:05.0")
/** Column name DifferenceAmt */
public static final String COLUMNNAME_DifferenceAmt = "DifferenceAmt";
/** Set Discount Amount.
@param DiscountAmt Calculated amount of discount */
public void setDiscountAmt (BigDecimal DiscountAmt)
{
if (DiscountAmt == null) throw new IllegalArgumentException ("DiscountAmt is mandatory.");
set_ValueNoCheck (COLUMNNAME_DiscountAmt, DiscountAmt);
}
/** Get Discount Amount.
@return Calculated amount of discount */
public BigDecimal getDiscountAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_DiscountAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="6c7e50ae-c149-cf01-003a-3ac65fc7273d")
public static String es_PE_FIELD_PaymentSelectionLine_DiscountAmount_Description="Total de descuento calculado";

@XendraTrl(Identifier="6c7e50ae-c149-cf01-003a-3ac65fc7273d")
public static String es_PE_FIELD_PaymentSelectionLine_DiscountAmount_Help="El Total descuento indica el total de descuento para un documento ó línea";

@XendraTrl(Identifier="6c7e50ae-c149-cf01-003a-3ac65fc7273d")
public static String es_PE_FIELD_PaymentSelectionLine_DiscountAmount_Name="Total del Descuento";

@XendraField(AD_Column_ID="DiscountAmt",IsCentrallyMaintained=true,
AD_Tab_ID="6be3a1c6-8199-e467-9b08-3a894b51133b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6c7e50ae-c149-cf01-003a-3ac65fc7273d")
public static final String FIELDNAME_PaymentSelectionLine_DiscountAmount="6c7e50ae-c149-cf01-003a-3ac65fc7273d";

@XendraTrl(Identifier="029d91c8-e004-291a-e3cb-540b2fdebf00")
public static String es_PE_COLUMN_DiscountAmt_Name="Total del Descuento";

@XendraColumn(AD_Element_ID="351290a4-6d07-13cb-9132-459358217d86",ColumnName="DiscountAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="029d91c8-e004-291a-e3cb-540b2fdebf00",
Synchronized="2017-08-05 16:54:05.0")
/** Column name DiscountAmt */
public static final String COLUMNNAME_DiscountAmt = "DiscountAmt";
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
@XendraTrl(Identifier="99296575-b733-4756-84b8-340f4bdb2e19")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="99296575-b733-4756-84b8-340f4bdb2e19",
Synchronized="2017-08-05 16:54:05.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Manual.
@param IsManual This is a manual process */
public void setIsManual (boolean IsManual)
{
set_Value (COLUMNNAME_IsManual, Boolean.valueOf(IsManual));
}
/** Get Manual.
@return This is a manual process */
public boolean isManual() 
{
Object oo = get_Value(COLUMNNAME_IsManual);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="adfc5add-1c78-8fff-1fca-c1079574adf3")
public static String es_PE_FIELD_PaymentSelectionLine_Manual_Description="Éste es un proceso manual.";

@XendraTrl(Identifier="adfc5add-1c78-8fff-1fca-c1079574adf3")
public static String es_PE_FIELD_PaymentSelectionLine_Manual_Help="El cuadro de verificación manual indica si el proceso será hecho manualmente.";

@XendraTrl(Identifier="adfc5add-1c78-8fff-1fca-c1079574adf3")
public static String es_PE_FIELD_PaymentSelectionLine_Manual_Name="Manual";

@XendraField(AD_Column_ID="IsManual",IsCentrallyMaintained=true,
AD_Tab_ID="6be3a1c6-8199-e467-9b08-3a894b51133b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="adfc5add-1c78-8fff-1fca-c1079574adf3")
public static final String FIELDNAME_PaymentSelectionLine_Manual="adfc5add-1c78-8fff-1fca-c1079574adf3";

@XendraTrl(Identifier="5258fb15-7d48-2e90-d2d7-fc1070a7e4cb")
public static String es_PE_COLUMN_IsManual_Name="Manual";

@XendraColumn(AD_Element_ID="064afee2-bc1c-12d9-20dc-97a2318dc359",ColumnName="IsManual",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5258fb15-7d48-2e90-d2d7-fc1070a7e4cb",
Synchronized="2017-08-05 16:54:05.0")
/** Column name IsManual */
public static final String COLUMNNAME_IsManual = "IsManual";
/** Set Sales Transaction.
@param IsSOTrx This is a Sales Transaction */
public void setIsSOTrx (boolean IsSOTrx)
{
set_Value (COLUMNNAME_IsSOTrx, Boolean.valueOf(IsSOTrx));
}
/** Get Sales Transaction.
@return This is a Sales Transaction */
public boolean isSOTrx() 
{
Object oo = get_Value(COLUMNNAME_IsSOTrx);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="0c574c12-4f32-40b1-4487-8902e83153a2")
public static String es_PE_FIELD_PaymentSelectionLine_SalesTransaction_Description="Esta es una transacción de ventas";

@XendraTrl(Identifier="0c574c12-4f32-40b1-4487-8902e83153a2")
public static String es_PE_FIELD_PaymentSelectionLine_SalesTransaction_Help="El cuadro de verificación Transacción de Ventas indica si este ítem es una transacción de ventas";

@XendraTrl(Identifier="0c574c12-4f32-40b1-4487-8902e83153a2")
public static String es_PE_FIELD_PaymentSelectionLine_SalesTransaction_Name="Transacción de Ventas";

@XendraField(AD_Column_ID="IsSOTrx",IsCentrallyMaintained=true,
AD_Tab_ID="6be3a1c6-8199-e467-9b08-3a894b51133b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0c574c12-4f32-40b1-4487-8902e83153a2")
public static final String FIELDNAME_PaymentSelectionLine_SalesTransaction="0c574c12-4f32-40b1-4487-8902e83153a2";

@XendraTrl(Identifier="989b6b1c-0e56-ce49-d8c5-fd303e7d6fbb")
public static String es_PE_COLUMN_IsSOTrx_Name="Transacción de Ventas";

@XendraColumn(AD_Element_ID="4084b69f-a51d-5676-4d8c-395a13e6b2df",ColumnName="IsSOTrx",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="989b6b1c-0e56-ce49-d8c5-fd303e7d6fbb",
Synchronized="2017-08-05 16:54:06.0")
/** Column name IsSOTrx */
public static final String COLUMNNAME_IsSOTrx = "IsSOTrx";
/** Set Line No.
@param Line Unique line for this document */
public void setLine (int Line)
{
set_Value (COLUMNNAME_Line, Integer.valueOf(Line));
}
/** Get Line No.
@return Unique line for this document */
public int getLine() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Line);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d9d2e68a-ff39-6b70-2adb-78458f13c815")
public static String es_PE_FIELD_PaymentSelectionLine_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="d9d2e68a-ff39-6b70-2adb-78458f13c815")
public static String es_PE_FIELD_PaymentSelectionLine_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraTrl(Identifier="d9d2e68a-ff39-6b70-2adb-78458f13c815")
public static String es_PE_FIELD_PaymentSelectionLine_LineNo_Name="No. Línea";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="6be3a1c6-8199-e467-9b08-3a894b51133b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d9d2e68a-ff39-6b70-2adb-78458f13c815")
public static final String FIELDNAME_PaymentSelectionLine_LineNo="d9d2e68a-ff39-6b70-2adb-78458f13c815";

@XendraTrl(Identifier="e59dbf04-9f3f-7794-0463-a46978a75b60")
public static String es_PE_COLUMN_Line_Name="No. Línea";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM C_PaySelectionLine WHERE C_PaySelection_ID=@C_PaySelection_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e59dbf04-9f3f-7794-0463-a46978a75b60",
Synchronized="2017-08-05 16:54:06.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";
/** Set Open Amount.
@param OpenAmt Open item amount */
public void setOpenAmt (BigDecimal OpenAmt)
{
if (OpenAmt == null) throw new IllegalArgumentException ("OpenAmt is mandatory.");
set_ValueNoCheck (COLUMNNAME_OpenAmt, OpenAmt);
}
/** Get Open Amount.
@return Open item amount */
public BigDecimal getOpenAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_OpenAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="c6052686-7b55-457d-11ae-aafb0cee8bfc")
public static String es_PE_FIELD_PaymentSelectionLine_OpenAmount_Description="Total abierto de la partida";

@XendraTrl(Identifier="c6052686-7b55-457d-11ae-aafb0cee8bfc")
public static String es_PE_FIELD_PaymentSelectionLine_OpenAmount_Name="Total Abierto";

@XendraField(AD_Column_ID="OpenAmt",IsCentrallyMaintained=true,
AD_Tab_ID="6be3a1c6-8199-e467-9b08-3a894b51133b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c6052686-7b55-457d-11ae-aafb0cee8bfc")
public static final String FIELDNAME_PaymentSelectionLine_OpenAmount="c6052686-7b55-457d-11ae-aafb0cee8bfc";

@XendraTrl(Identifier="14ada997-b3b5-ac6d-c4be-d57f8b85e97d")
public static String es_PE_COLUMN_OpenAmt_Name="Total Abierto";

@XendraColumn(AD_Element_ID="89a287e4-b72d-e4d4-2a42-90bcfde3d1ae",ColumnName="OpenAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="14ada997-b3b5-ac6d-c4be-d57f8b85e97d",
Synchronized="2017-08-05 16:54:06.0")
/** Column name OpenAmt */
public static final String COLUMNNAME_OpenAmt = "OpenAmt";
/** Set Payment amount.
@param PayAmt Amount being paid */
public void setPayAmt (BigDecimal PayAmt)
{
if (PayAmt == null) throw new IllegalArgumentException ("PayAmt is mandatory.");
set_Value (COLUMNNAME_PayAmt, PayAmt);
}
/** Get Payment amount.
@return Amount being paid */
public BigDecimal getPayAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PayAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="5c6b42e7-0a83-eb96-4bec-8ae087e4543b")
public static String es_PE_FIELD_PaymentSelectionLine_PaymentAmount_Description="Total siendo pagado";

@XendraTrl(Identifier="5c6b42e7-0a83-eb96-4bec-8ae087e4543b")
public static String es_PE_FIELD_PaymentSelectionLine_PaymentAmount_Help="Indica el total a pagar. El total del pago puede ser para una factura simple, múltiple ó un pago parcial de una factura.";

@XendraTrl(Identifier="5c6b42e7-0a83-eb96-4bec-8ae087e4543b")
public static String es_PE_FIELD_PaymentSelectionLine_PaymentAmount_Name="Total del Pago";

@XendraField(AD_Column_ID="PayAmt",IsCentrallyMaintained=true,
AD_Tab_ID="6be3a1c6-8199-e467-9b08-3a894b51133b",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5c6b42e7-0a83-eb96-4bec-8ae087e4543b")
public static final String FIELDNAME_PaymentSelectionLine_PaymentAmount="5c6b42e7-0a83-eb96-4bec-8ae087e4543b";

@XendraTrl(Identifier="233fcab9-953a-38a1-f570-fd06c4c22ed1")
public static String es_PE_COLUMN_PayAmt_Name="Total del Pago";

@XendraColumn(AD_Element_ID="9e9a0ba1-2d71-67e7-e0f1-0309fd537c8b",ColumnName="PayAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutPaySelection.payAmt",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="233fcab9-953a-38a1-f570-fd06c4c22ed1",
Synchronized="2017-08-05 16:54:06.0")
/** Column name PayAmt */
public static final String COLUMNNAME_PayAmt = "PayAmt";

/** PaymentRule AD_Reference=ac003b85-a929-cc48-3def-1a8f7b1adc7b */
public static final int PAYMENTRULE_AD_Reference_ID=195;
/** Set Payment Rule.
@param PaymentRule How you pay the invoice */
public void setPaymentRule (String PaymentRule)
{
if (PaymentRule == null) throw new IllegalArgumentException ("PaymentRule is mandatory");
if (PaymentRule.equals(REF__PaymentRule.Cash) || PaymentRule.equals(REF__PaymentRule.CreditCard) || PaymentRule.equals(REF__PaymentRule.DirectDeposit) || PaymentRule.equals(REF__PaymentRule.Check) || PaymentRule.equals(REF__PaymentRule.OnCredit) || PaymentRule.equals(REF__PaymentRule.DirectDebit) || PaymentRule.equals(REF__PaymentRule.Advance) || PaymentRule.equals(REF__PaymentRule.Coupon));
 else throw new IllegalArgumentException ("PaymentRule Invalid value - " + PaymentRule + " - Reference_ID=195 - B - K - T - S - P - D - A - C");
if (PaymentRule.length() > 1)
{
log.warning("Length > 1 - truncated");
PaymentRule = PaymentRule.substring(0,0);
}
set_Value (COLUMNNAME_PaymentRule, PaymentRule);
}
/** Get Payment Rule.
@return How you pay the invoice */
public String getPaymentRule() 
{
return (String)get_Value(COLUMNNAME_PaymentRule);
}

@XendraTrl(Identifier="e38a80b6-6a14-7dbf-c76d-6ef87de9d089")
public static String es_PE_FIELD_PaymentSelectionLine_PaymentRule_Description="Como se pagará la factura";

@XendraTrl(Identifier="e38a80b6-6a14-7dbf-c76d-6ef87de9d089")
public static String es_PE_FIELD_PaymentSelectionLine_PaymentRule_Help="La Regla de Pagos indica el método de pago de la factura";

@XendraTrl(Identifier="e38a80b6-6a14-7dbf-c76d-6ef87de9d089")
public static String es_PE_FIELD_PaymentSelectionLine_PaymentRule_Name="Regla de Pago";

@XendraField(AD_Column_ID="PaymentRule",IsCentrallyMaintained=true,
AD_Tab_ID="6be3a1c6-8199-e467-9b08-3a894b51133b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e38a80b6-6a14-7dbf-c76d-6ef87de9d089")
public static final String FIELDNAME_PaymentSelectionLine_PaymentRule="e38a80b6-6a14-7dbf-c76d-6ef87de9d089";

@XendraTrl(Identifier="b79392ce-e04d-0dad-c453-4485cf8a5011")
public static String es_PE_COLUMN_PaymentRule_Name="Regla de Pago";

@XendraColumn(AD_Element_ID="5074db21-c657-2d23-63dc-80f0c5f2d4cc",ColumnName="PaymentRule",
AD_Reference_ID=17,AD_Reference_Value_ID="ac003b85-a929-cc48-3def-1a8f7b1adc7b",
AD_Val_Rule_ID="ddb2995e-0325-fcfb-01ce-64a7af71853f",FieldLength=1,DefaultValue="S",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b79392ce-e04d-0dad-c453-4485cf8a5011",
Synchronized="2017-08-05 16:54:06.0")
/** Column name PaymentRule */
public static final String COLUMNNAME_PaymentRule = "PaymentRule";
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

@XendraTrl(Identifier="b9a93668-b932-b782-4101-2901430b5fac")
public static String es_PE_FIELD_PaymentSelectionLine_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="b9a93668-b932-b782-4101-2901430b5fac")
public static String es_PE_FIELD_PaymentSelectionLine_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="b9a93668-b932-b782-4101-2901430b5fac")
public static String es_PE_FIELD_PaymentSelectionLine_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="6be3a1c6-8199-e467-9b08-3a894b51133b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=150,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b9a93668-b932-b782-4101-2901430b5fac")
public static final String FIELDNAME_PaymentSelectionLine_Processed="b9a93668-b932-b782-4101-2901430b5fac";

@XendraTrl(Identifier="caa15dab-d7a3-a6e3-85e0-c365b6941f16")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="caa15dab-d7a3-a6e3-85e0-c365b6941f16",
Synchronized="2017-08-05 16:54:06.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
}
