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
/** Generated Model for C_PaymentAllocate
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_PaymentAllocate extends PO
{
/** Standard Constructor
@param ctx context
@param C_PaymentAllocate_ID id
@param trxName transaction
*/
public X_C_PaymentAllocate (Properties ctx, int C_PaymentAllocate_ID, String trxName)
{
super (ctx, C_PaymentAllocate_ID, trxName);
/** if (C_PaymentAllocate_ID == 0)
{
setAmount (Env.ZERO);	
// 0
setC_Invoice_ID (0);
setC_PaymentAllocate_ID (0);
setC_Payment_ID (0);
setDiscountAmt (Env.ZERO);	
// 0
setOverUnderAmt (Env.ZERO);	
// 0
setWriteOffAmt (Env.ZERO);	
// 0
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_PaymentAllocate (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=812 */
public static int Table_ID=MTable.getTable_ID("C_PaymentAllocate");

@XendraTrl(Identifier="db1aeabf-42d4-7a16-91c2-8c0debeba787")
public static String es_PE_TAB_Allocate_Description="Asignación de Pagos a Facturas";

@XendraTrl(Identifier="db1aeabf-42d4-7a16-91c2-8c0debeba787")
public static String es_PE_TAB_Allocate_Help="Usted puede asignar pagos a Facturas directamente con lamisma monéda al crear el pago.Note que usted puede sobe asignar o sub asignar un pago. La asignación es creada al momento de procesar el pago.";

@XendraTrl(Identifier="db1aeabf-42d4-7a16-91c2-8c0debeba787")
public static String es_PE_TAB_Allocate_Name="Varias Facturas";
@XendraTab(Name="Allocate",
Description="Allocate Payments to Invoices",
Help="You can directly allocate payments to invoices with the same currency when creating the Payment.  Note that you can over- or under-allocate the payment.<b> When processing the payment, the allocation is created.<b> The Organization is set to the invoice organization",
AD_Window_ID="a5526dd3-69bf-661f-67ed-fa8a6962a00e",SeqNo=20,TabLevel=1,IsSingleRow=true,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,WhereClause="",
OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="@Processed@=Y",
DisplayLogic="",IsInsertRecord=false,IsAdvancedTab=true,Parent_Column_ID="",
Identifier="db1aeabf-42d4-7a16-91c2-8c0debeba787",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Allocate="db1aeabf-42d4-7a16-91c2-8c0debeba787";

@XendraTrl(Identifier="d78052b7-df45-a916-721e-45fddf65b0c4")
public static String es_PE_TABLE_C_PaymentAllocate_Name="Asignación de Pago";

@XendraTable(Name="Allocate Payment",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Allocate Payment to Invoices",
Help="",TableName="C_PaymentAllocate",AccessLevel="1",
AD_Window_ID="a5526dd3-69bf-661f-67ed-fa8a6962a00e",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="d78052b7-df45-a916-721e-45fddf65b0c4",
Synchronized="2020-03-03 21:37:20.0")
/** TableName=C_PaymentAllocate */
public static final String Table_Name="C_PaymentAllocate";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_PaymentAllocate");

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
    Table_ID = MTable.getTable_ID("C_PaymentAllocate");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_PaymentAllocate[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Amount.
@param Amount Amount in a defined currency */
public void setAmount (BigDecimal Amount)
{
if (Amount == null) throw new IllegalArgumentException ("Amount is mandatory.");
set_Value (COLUMNNAME_Amount, Amount);
}
/** Get Amount.
@return Amount in a defined currency */
public BigDecimal getAmount() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amount);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="745ddb5f-0dc1-abb7-8de0-fb8bbf49cd89")
public static String es_PE_FIELD_Allocate_Amount_Name="Total";

@XendraTrl(Identifier="745ddb5f-0dc1-abb7-8de0-fb8bbf49cd89")
public static String es_PE_FIELD_Allocate_Amount_Description="Total en una moneda definida";

@XendraTrl(Identifier="745ddb5f-0dc1-abb7-8de0-fb8bbf49cd89")
public static String es_PE_FIELD_Allocate_Amount_Help="Indica el total para esta línea del documento";

@XendraField(AD_Column_ID="Amount",IsCentrallyMaintained=true,
AD_Tab_ID="db1aeabf-42d4-7a16-91c2-8c0debeba787",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="745ddb5f-0dc1-abb7-8de0-fb8bbf49cd89")
public static final String FIELDNAME_Allocate_Amount="745ddb5f-0dc1-abb7-8de0-fb8bbf49cd89";

@XendraTrl(Identifier="26d08c16-8b39-d5b8-e166-cff5ed01e9aa")
public static String es_PE_COLUMN_Amount_Name="Total";

@XendraColumn(AD_Element_ID="d89b3a02-29fd-e2e3-2d01-dbda08fb2454",ColumnName="Amount",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,
Callout="org.compiere.model.CalloutPaymentAllocate.amounts",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="26d08c16-8b39-d5b8-e166-cff5ed01e9aa",
Synchronized="2019-08-30 22:21:57.0")
/** Column name Amount */
public static final String COLUMNNAME_Amount = "Amount";
/** Set Allocation Line.
@param C_AllocationLine_ID Allocation Line */
public void setC_AllocationLine_ID (int C_AllocationLine_ID)
{
if (C_AllocationLine_ID <= 0) set_Value (COLUMNNAME_C_AllocationLine_ID, null);
 else 
set_Value (COLUMNNAME_C_AllocationLine_ID, Integer.valueOf(C_AllocationLine_ID));
}
/** Get Allocation Line.
@return Allocation Line */
public int getC_AllocationLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_AllocationLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d952203e-d4f5-96d9-a69b-bd9ec4adbfce")
public static String es_PE_FIELD_Allocate_AllocationLine_Name="Item de Asignación";

@XendraTrl(Identifier="d952203e-d4f5-96d9-a69b-bd9ec4adbfce")
public static String es_PE_FIELD_Allocate_AllocationLine_Description="Item de Asignación";

@XendraTrl(Identifier="d952203e-d4f5-96d9-a69b-bd9ec4adbfce")
public static String es_PE_FIELD_Allocate_AllocationLine_Help="Asignación de Efectivo/Pagos a facturas";

@XendraField(AD_Column_ID="C_AllocationLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="db1aeabf-42d4-7a16-91c2-8c0debeba787",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d952203e-d4f5-96d9-a69b-bd9ec4adbfce")
public static final String FIELDNAME_Allocate_AllocationLine="d952203e-d4f5-96d9-a69b-bd9ec4adbfce";

@XendraTrl(Identifier="3603be68-d723-c713-792f-b1704ef32806")
public static String es_PE_COLUMN_C_AllocationLine_ID_Name="Línea de Asignación";

@XendraColumn(AD_Element_ID="2be588b1-2d10-d36e-dc0e-aa9b74d99c63",
ColumnName="C_AllocationLine_ID",AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3603be68-d723-c713-792f-b1704ef32806",Synchronized="2019-08-30 22:21:57.0")
/** Column name C_AllocationLine_ID */
public static final String COLUMNNAME_C_AllocationLine_ID = "C_AllocationLine_ID";
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getC_Invoice_ID()));
}

@XendraTrl(Identifier="8e02cd41-e174-5062-ba11-0a57b88ef464")
public static String es_PE_FIELD_Allocate_Invoice_Name="Factura";

@XendraTrl(Identifier="8e02cd41-e174-5062-ba11-0a57b88ef464")
public static String es_PE_FIELD_Allocate_Invoice_Description="Identificador de la factura";

@XendraTrl(Identifier="8e02cd41-e174-5062-ba11-0a57b88ef464")
public static String es_PE_FIELD_Allocate_Invoice_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="db1aeabf-42d4-7a16-91c2-8c0debeba787",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8e02cd41-e174-5062-ba11-0a57b88ef464")
public static final String FIELDNAME_Allocate_Invoice="8e02cd41-e174-5062-ba11-0a57b88ef464";

@XendraTrl(Identifier="bd9f8344-2939-27a9-7cff-9f48ecc9fd27")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Factura";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="ef3f8528-e3d7-e4bd-825d-3aaa82d823d9",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=true,SeqNo=1,IsTranslated=false,
Callout="org.compiere.model.CalloutPaymentAllocate.invoice",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bd9f8344-2939-27a9-7cff-9f48ecc9fd27",
Synchronized="2019-08-30 22:21:57.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
/** Set Allocate Payment.
@param C_PaymentAllocate_ID Allocate Payment to Invoices */
public void setC_PaymentAllocate_ID (int C_PaymentAllocate_ID)
{
if (C_PaymentAllocate_ID < 1) throw new IllegalArgumentException ("C_PaymentAllocate_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_PaymentAllocate_ID, Integer.valueOf(C_PaymentAllocate_ID));
}
/** Get Allocate Payment.
@return Allocate Payment to Invoices */
public int getC_PaymentAllocate_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_PaymentAllocate_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2d056e38-5ae2-aa3c-8136-dab08ffd19d0")
public static String es_PE_FIELD_Allocate_AllocatePayment_Name="Asignación de Pago";

@XendraTrl(Identifier="2d056e38-5ae2-aa3c-8136-dab08ffd19d0")
public static String es_PE_FIELD_Allocate_AllocatePayment_Description="Asignación de Pagos a Facturas";

@XendraTrl(Identifier="2d056e38-5ae2-aa3c-8136-dab08ffd19d0")
public static String es_PE_FIELD_Allocate_AllocatePayment_Help="Usted puede asignar directamente los pagos a Facturas cuando esta creando el PagoNote que usted puede  Sobre o Sub Asignar el Pago.Durante el procesamiento  del Pago, es creada la asignación. ";

@XendraField(AD_Column_ID="C_PaymentAllocate_ID",IsCentrallyMaintained=true,
AD_Tab_ID="db1aeabf-42d4-7a16-91c2-8c0debeba787",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2d056e38-5ae2-aa3c-8136-dab08ffd19d0")
public static final String FIELDNAME_Allocate_AllocatePayment="2d056e38-5ae2-aa3c-8136-dab08ffd19d0";
/** Column name C_PaymentAllocate_ID */
public static final String COLUMNNAME_C_PaymentAllocate_ID = "C_PaymentAllocate_ID";
/** Set Payment.
@param C_Payment_ID Payment identifier */
public void setC_Payment_ID (int C_Payment_ID)
{
if (C_Payment_ID < 1) throw new IllegalArgumentException ("C_Payment_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Payment_ID, Integer.valueOf(C_Payment_ID));
}
/** Get Payment.
@return Payment identifier */
public int getC_Payment_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Payment_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2b70c55b-3248-2d3f-f4f0-a737a862b55d")
public static String es_PE_FIELD_Allocate_Payment_Name="Pago";

@XendraTrl(Identifier="2b70c55b-3248-2d3f-f4f0-a737a862b55d")
public static String es_PE_FIELD_Allocate_Payment_Description="Identificador del pago";

@XendraTrl(Identifier="2b70c55b-3248-2d3f-f4f0-a737a862b55d")
public static String es_PE_FIELD_Allocate_Payment_Help="El pago es un identificador único de este pago.";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="db1aeabf-42d4-7a16-91c2-8c0debeba787",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2b70c55b-3248-2d3f-f4f0-a737a862b55d")
public static final String FIELDNAME_Allocate_Payment="2b70c55b-3248-2d3f-f4f0-a737a862b55d";

@XendraTrl(Identifier="4cd7fc58-0c30-31a9-fe4b-24c551c01a0d")
public static String es_PE_COLUMN_C_Payment_ID_Name="Pago";

@XendraColumn(AD_Element_ID="3ded5658-968e-94c5-207b-eed6f6a7bb43",ColumnName="C_Payment_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4cd7fc58-0c30-31a9-fe4b-24c551c01a0d",
Synchronized="2019-08-30 22:21:57.0")
/** Column name C_Payment_ID */
public static final String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
/** Set Discount Amount.
@param DiscountAmt Calculated amount of discount */
public void setDiscountAmt (BigDecimal DiscountAmt)
{
if (DiscountAmt == null) throw new IllegalArgumentException ("DiscountAmt is mandatory.");
set_Value (COLUMNNAME_DiscountAmt, DiscountAmt);
}
/** Get Discount Amount.
@return Calculated amount of discount */
public BigDecimal getDiscountAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_DiscountAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="59e7dc28-0966-be0c-223b-e2f67dc68edd")
public static String es_PE_FIELD_Allocate_DiscountAmount_Name="Total del Descuento";

@XendraTrl(Identifier="59e7dc28-0966-be0c-223b-e2f67dc68edd")
public static String es_PE_FIELD_Allocate_DiscountAmount_Description="Total de descuento calculado";

@XendraTrl(Identifier="59e7dc28-0966-be0c-223b-e2f67dc68edd")
public static String es_PE_FIELD_Allocate_DiscountAmount_Help="El Total descuento indica el total de descuento para un documento ó línea";

@XendraField(AD_Column_ID="DiscountAmt",IsCentrallyMaintained=true,
AD_Tab_ID="db1aeabf-42d4-7a16-91c2-8c0debeba787",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="59e7dc28-0966-be0c-223b-e2f67dc68edd")
public static final String FIELDNAME_Allocate_DiscountAmount="59e7dc28-0966-be0c-223b-e2f67dc68edd";

@XendraTrl(Identifier="8860421d-2c70-c9f0-fbf7-b3111f28ee54")
public static String es_PE_COLUMN_DiscountAmt_Name="Total del Descuento";

@XendraColumn(AD_Element_ID="351290a4-6d07-13cb-9132-459358217d86",ColumnName="DiscountAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutPaymentAllocate.amounts",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8860421d-2c70-c9f0-fbf7-b3111f28ee54",
Synchronized="2019-08-30 22:21:57.0")
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
@XendraTrl(Identifier="1d082aec-8429-4faf-9107-d7323c2b095a")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1d082aec-8429-4faf-9107-d7323c2b095a",
Synchronized="2019-08-30 22:21:57.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Invoice Amt.
@param InvoiceAmt Invoice Amt */
public void setInvoiceAmt (BigDecimal InvoiceAmt)
{
set_Value (COLUMNNAME_InvoiceAmt, InvoiceAmt);
}
/** Get Invoice Amt.
@return Invoice Amt */
public BigDecimal getInvoiceAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_InvoiceAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="633689da-43cd-813d-d9e8-a0dc482385a8")
public static String es_PE_FIELD_Allocate_InvoiceAmt_Name="Monto de Factura";

@XendraField(AD_Column_ID="InvoiceAmt",IsCentrallyMaintained=true,
AD_Tab_ID="db1aeabf-42d4-7a16-91c2-8c0debeba787",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="633689da-43cd-813d-d9e8-a0dc482385a8")
public static final String FIELDNAME_Allocate_InvoiceAmt="633689da-43cd-813d-d9e8-a0dc482385a8";

@XendraTrl(Identifier="10a05461-54f9-ae3d-43f9-9dfdda21fce8")
public static String es_PE_COLUMN_InvoiceAmt_Name="Monto de Factura";

@XendraColumn(AD_Element_ID="844bc58f-18b9-f3e8-9d6b-bda0d713fd6c",ColumnName="InvoiceAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="10a05461-54f9-ae3d-43f9-9dfdda21fce8",
Synchronized="2019-08-30 22:21:57.0")
/** Column name InvoiceAmt */
public static final String COLUMNNAME_InvoiceAmt = "InvoiceAmt";
/** Set Over/Under Payment.
@param OverUnderAmt Over-Payment (unallocated) or Under-Payment (partial payment) Amount */
public void setOverUnderAmt (BigDecimal OverUnderAmt)
{
if (OverUnderAmt == null) throw new IllegalArgumentException ("OverUnderAmt is mandatory.");
set_Value (COLUMNNAME_OverUnderAmt, OverUnderAmt);
}
/** Get Over/Under Payment.
@return Over-Payment (unallocated) or Under-Payment (partial payment) Amount */
public BigDecimal getOverUnderAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_OverUnderAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="d8169d82-9ddd-04f5-ae83-6ab8dc1de6cf")
public static String es_PE_FIELD_Allocate_OverUnderPayment_Name="Totales con sobre/sub pago";

@XendraTrl(Identifier="d8169d82-9ddd-04f5-ae83-6ab8dc1de6cf")
public static String es_PE_FIELD_Allocate_OverUnderPayment_Description="Total de sobre pago (no contabilizado) ó sub pago (pago parcial)";

@XendraTrl(Identifier="d8169d82-9ddd-04f5-ae83-6ab8dc1de6cf")
public static String es_PE_FIELD_Allocate_OverUnderPayment_Help="Sobre pagos (negativos) son totales no contabilizados y permiten recibir dinero por totales superiores a una factura particular. Sub pagos (positivo) es un pago parcial de una factura. No se saca de libros la cantidad no pagada.";

@XendraField(AD_Column_ID="OverUnderAmt",IsCentrallyMaintained=true,
AD_Tab_ID="db1aeabf-42d4-7a16-91c2-8c0debeba787",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d8169d82-9ddd-04f5-ae83-6ab8dc1de6cf")
public static final String FIELDNAME_Allocate_OverUnderPayment="d8169d82-9ddd-04f5-ae83-6ab8dc1de6cf";

@XendraTrl(Identifier="d7cf3e7c-cc59-e212-eb7b-de0dc107864b")
public static String es_PE_COLUMN_OverUnderAmt_Name="Totales con sobre/sub pago";

@XendraColumn(AD_Element_ID="c1b8d715-3799-d069-9abd-dcbda10d4c2a",ColumnName="OverUnderAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutPaymentAllocate.amounts",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d7cf3e7c-cc59-e212-eb7b-de0dc107864b",
Synchronized="2019-08-30 22:21:57.0")
/** Column name OverUnderAmt */
public static final String COLUMNNAME_OverUnderAmt = "OverUnderAmt";
/** Set Remaining Amt.
@param RemainingAmt Remaining Amount */
public void setRemainingAmt (BigDecimal RemainingAmt)
{
throw new IllegalArgumentException ("RemainingAmt is virtual column");
}
/** Get Remaining Amt.
@return Remaining Amount */
public BigDecimal getRemainingAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_RemainingAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="90beb2fa-765a-7c3d-3ad8-730a3642ea13")
public static String es_PE_FIELD_Allocate_RemainingAmt_Name="Importe Remanente";

@XendraTrl(Identifier="90beb2fa-765a-7c3d-3ad8-730a3642ea13")
public static String es_PE_FIELD_Allocate_RemainingAmt_Description="Importe Remanente";

@XendraField(AD_Column_ID="RemainingAmt",IsCentrallyMaintained=true,
AD_Tab_ID="db1aeabf-42d4-7a16-91c2-8c0debeba787",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=true,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="90beb2fa-765a-7c3d-3ad8-730a3642ea13")
public static final String FIELDNAME_Allocate_RemainingAmt="90beb2fa-765a-7c3d-3ad8-730a3642ea13";

@XendraTrl(Identifier="b9845627-1e02-9087-27f7-2592a60a6b4b")
public static String es_PE_COLUMN_RemainingAmt_Name="Importe Remanente";

@XendraColumn(AD_Element_ID="cf7333c3-e0c1-f81e-183f-c3ebd714bf5f",ColumnName="RemainingAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT MAX(p.PayAmt)-COALESCE(SUM(a.Amount),0) FROM C_Payment p LEFT OUTER JOIN C_PaymentAllocate a ON (p.C_Payment_ID=a.C_Payment_ID) WHERE p.C_Payment_ID=@C_Payment_ID@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,
ColumnSQL="(SELECT MAX(p.PayAmt)-COALESCE(SUM(a.Amount),0) FROM C_Payment p  LEFT OUTER JOIN C_PaymentAllocate a ON (p.C_Payment_ID=a.C_Payment_ID) WHERE p.C_Payment_ID=C_PaymentAllocate.C_Payment_ID)",
IsAllowLogging=false,Identifier="b9845627-1e02-9087-27f7-2592a60a6b4b",
Synchronized="2019-08-30 22:21:57.0")
/** Column name RemainingAmt */
public static final String COLUMNNAME_RemainingAmt = "RemainingAmt";
/** Set Write-off Amount.
@param WriteOffAmt Amount to write-off */
public void setWriteOffAmt (BigDecimal WriteOffAmt)
{
if (WriteOffAmt == null) throw new IllegalArgumentException ("WriteOffAmt is mandatory.");
set_Value (COLUMNNAME_WriteOffAmt, WriteOffAmt);
}
/** Get Write-off Amount.
@return Amount to write-off */
public BigDecimal getWriteOffAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_WriteOffAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="ce4e0fb9-a121-a5fa-91fd-f16ad3f9873e")
public static String es_PE_FIELD_Allocate_Write_OffAmount_Name="Total del Ajuste";

@XendraTrl(Identifier="ce4e0fb9-a121-a5fa-91fd-f16ad3f9873e")
public static String es_PE_FIELD_Allocate_Write_OffAmount_Description="Total por ajustar";

@XendraTrl(Identifier="ce4e0fb9-a121-a5fa-91fd-f16ad3f9873e")
public static String es_PE_FIELD_Allocate_Write_OffAmount_Help="El Total de ajuste indica el total a ser ajustado como incobrable";

@XendraField(AD_Column_ID="WriteOffAmt",IsCentrallyMaintained=true,
AD_Tab_ID="db1aeabf-42d4-7a16-91c2-8c0debeba787",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ce4e0fb9-a121-a5fa-91fd-f16ad3f9873e")
public static final String FIELDNAME_Allocate_Write_OffAmount="ce4e0fb9-a121-a5fa-91fd-f16ad3f9873e";

@XendraTrl(Identifier="3750211c-22d0-784c-4da6-7811c6d5b4d0")
public static String es_PE_COLUMN_WriteOffAmt_Name="Total del Ajuste";

@XendraColumn(AD_Element_ID="5f70c6d6-fd9f-549c-363e-80eaef7df1c7",ColumnName="WriteOffAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutPaymentAllocate.amounts",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3750211c-22d0-784c-4da6-7811c6d5b4d0",
Synchronized="2019-08-30 22:21:57.0")
/** Column name WriteOffAmt */
public static final String COLUMNNAME_WriteOffAmt = "WriteOffAmt";
}
