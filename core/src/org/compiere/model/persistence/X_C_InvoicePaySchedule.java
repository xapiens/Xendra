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
/** Generated Model for C_InvoicePaySchedule
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_InvoicePaySchedule extends PO
{
/** Standard Constructor
@param ctx context
@param C_InvoicePaySchedule_ID id
@param trxName transaction
*/
public X_C_InvoicePaySchedule (Properties ctx, int C_InvoicePaySchedule_ID, String trxName)
{
super (ctx, C_InvoicePaySchedule_ID, trxName);
/** if (C_InvoicePaySchedule_ID == 0)
{
setC_Invoice_ID (0);
setC_InvoicePaySchedule_ID (0);
setDiscountAmt (Env.ZERO);	
// 0
setDiscountDate (new Timestamp(System.currentTimeMillis()));
setDueAmt (Env.ZERO);	
// 0
setDueDate (new Timestamp(System.currentTimeMillis()));
setIsValid (false);	
// N
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
public X_C_InvoicePaySchedule (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=551 */
public static int Table_ID=MTable.getTable_ID("C_InvoicePaySchedule");

@XendraTrl(Identifier="81743aee-3657-abd3-f04e-502643185628")
public static String es_PE_TAB_PaymentSchedule_Description="Programa de Pagos de Facturas";

@XendraTrl(Identifier="81743aee-3657-abd3-f04e-502643185628")
public static String es_PE_TAB_PaymentSchedule_Name="Programa de Pagos";

@XendraTab(Name="Payment Schedule",Description="Invoice Payment Schedule",Help="",
AD_Window_ID="dc1a37c5-086c-c19e-c2ba-344555bfcf65",SeqNo=40,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="81743aee-3657-abd3-f04e-502643185628",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_PaymentSchedule="81743aee-3657-abd3-f04e-502643185628";

@XendraTrl(Identifier="1c98f8f9-9e3a-e888-b8a8-6322564808db")
public static String es_PE_TAB_PaymentSchedule2_Description="Mantener el Programa de Pagos";

@XendraTrl(Identifier="1c98f8f9-9e3a-e888-b8a8-6322564808db")
public static String es_PE_TAB_PaymentSchedule2_Name="Programa de Pagos";

@XendraTab(Name="Payment Schedule",Description="Mainain Payment Schedule",Help="",
AD_Window_ID="bf8d2c99-7662-a183-f151-c2a2c0c2be33",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="1c98f8f9-9e3a-e888-b8a8-6322564808db",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_PaymentSchedule2="1c98f8f9-9e3a-e888-b8a8-6322564808db";

@XendraTrl(Identifier="3d83bb4d-74ea-0ccc-175c-5046f581d0ed")
public static String es_PE_TABLE_C_InvoicePaySchedule_Name="Programa de Pagos de Facturas";


@XendraTable(Name="Invoice Payment Schedule",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Invoice Payment Schedule",Help="",
TableName="C_InvoicePaySchedule",AccessLevel="1",
AD_Window_ID="dc1a37c5-086c-c19e-c2ba-344555bfcf65",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="3d83bb4d-74ea-0ccc-175c-5046f581d0ed",
Synchronized="2020-03-03 21:37:05.0")
/** TableName=C_InvoicePaySchedule */
public static final String Table_Name="C_InvoicePaySchedule";


@XendraIndex(Name="c_invoicepayschedule_invoice",Identifier="1cc47820-f1a0-a726-d03a-94f139273ef3",
Column_Names="c_invoice_id",IsUnique="false",
TableIdentifier="1cc47820-f1a0-a726-d03a-94f139273ef3",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_invoicepayschedule_invoice = "1cc47820-f1a0-a726-d03a-94f139273ef3";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_InvoicePaySchedule");

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
    Table_ID = MTable.getTable_ID("C_InvoicePaySchedule");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_InvoicePaySchedule[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Invoice.
@param C_Invoice_ID Invoice Identifier */
public void setC_Invoice_ID (int C_Invoice_ID)
{
if (C_Invoice_ID < 1) throw new IllegalArgumentException ("C_Invoice_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Invoice_ID, Integer.valueOf(C_Invoice_ID));
}
/** Get Invoice.
@return Invoice Identifier */
public int getC_Invoice_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Invoice_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f80ca100-f355-b857-c723-576f5a931715")
public static String es_PE_FIELD_PaymentSchedule_Invoice_Name="Factura";

@XendraTrl(Identifier="f80ca100-f355-b857-c723-576f5a931715")
public static String es_PE_FIELD_PaymentSchedule_Invoice_Description="Identificador de la factura";

@XendraTrl(Identifier="f80ca100-f355-b857-c723-576f5a931715")
public static String es_PE_FIELD_PaymentSchedule_Invoice_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="81743aee-3657-abd3-f04e-502643185628",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f80ca100-f355-b857-c723-576f5a931715")
public static final String FIELDNAME_PaymentSchedule_Invoice="f80ca100-f355-b857-c723-576f5a931715";

@XendraTrl(Identifier="b3d853c1-13a7-5b54-7126-b78e6322be33")
public static String es_PE_FIELD_PaymentSchedule_Invoice2_Name="Factura";

@XendraTrl(Identifier="b3d853c1-13a7-5b54-7126-b78e6322be33")
public static String es_PE_FIELD_PaymentSchedule_Invoice2_Description="Identificador de la factura";

@XendraTrl(Identifier="b3d853c1-13a7-5b54-7126-b78e6322be33")
public static String es_PE_FIELD_PaymentSchedule_Invoice2_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1c98f8f9-9e3a-e888-b8a8-6322564808db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b3d853c1-13a7-5b54-7126-b78e6322be33")
public static final String FIELDNAME_PaymentSchedule_Invoice2="b3d853c1-13a7-5b54-7126-b78e6322be33";

@XendraTrl(Identifier="fd679ab8-1282-d5fa-8450-2aef2781d0d0")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Factura";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fd679ab8-1282-d5fa-8450-2aef2781d0d0",
Synchronized="2019-08-30 22:21:43.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
/** Set Invoice Payment Schedule.
@param C_InvoicePaySchedule_ID Invoice Payment Schedule */
public void setC_InvoicePaySchedule_ID (int C_InvoicePaySchedule_ID)
{
if (C_InvoicePaySchedule_ID < 1) throw new IllegalArgumentException ("C_InvoicePaySchedule_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_InvoicePaySchedule_ID, Integer.valueOf(C_InvoicePaySchedule_ID));
}
/** Get Invoice Payment Schedule.
@return Invoice Payment Schedule */
public int getC_InvoicePaySchedule_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_InvoicePaySchedule_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="994cfe95-a43a-8471-6041-c663311097e4")
public static String es_PE_FIELD_PaymentSchedule_InvoicePaymentSchedule_Name="Programa de Pagos de Facturas";

@XendraTrl(Identifier="994cfe95-a43a-8471-6041-c663311097e4")
public static String es_PE_FIELD_PaymentSchedule_InvoicePaymentSchedule_Description="Agenda de pagos de facturas";

@XendraTrl(Identifier="994cfe95-a43a-8471-6041-c663311097e4")
public static String es_PE_FIELD_PaymentSchedule_InvoicePaymentSchedule_Help="El programa de factura de pago se determina cuando los pagos parciales son debidos.";

@XendraField(AD_Column_ID="C_InvoicePaySchedule_ID",IsCentrallyMaintained=true,
AD_Tab_ID="81743aee-3657-abd3-f04e-502643185628",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="994cfe95-a43a-8471-6041-c663311097e4")
public static final String FIELDNAME_PaymentSchedule_InvoicePaymentSchedule="994cfe95-a43a-8471-6041-c663311097e4";

@XendraTrl(Identifier="2cd44c46-3a6e-178d-f111-934037e51a1c")
public static String es_PE_FIELD_PaymentSchedule_InvoicePaymentSchedule2_Name="Programa de Pagos de Facturas";

@XendraTrl(Identifier="2cd44c46-3a6e-178d-f111-934037e51a1c")
public static String es_PE_FIELD_PaymentSchedule_InvoicePaymentSchedule2_Description="Agenda de pagos de facturas";

@XendraTrl(Identifier="2cd44c46-3a6e-178d-f111-934037e51a1c")
public static String es_PE_FIELD_PaymentSchedule_InvoicePaymentSchedule2_Help="El programa de factura de pago se determina cuando los pagos parciales son debidos.";

@XendraField(AD_Column_ID="C_InvoicePaySchedule_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1c98f8f9-9e3a-e888-b8a8-6322564808db",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2cd44c46-3a6e-178d-f111-934037e51a1c")
public static final String FIELDNAME_PaymentSchedule_InvoicePaymentSchedule2="2cd44c46-3a6e-178d-f111-934037e51a1c";
/** Column name C_InvoicePaySchedule_ID */
public static final String COLUMNNAME_C_InvoicePaySchedule_ID = "C_InvoicePaySchedule_ID";
/** Set Payment Schedule.
@param C_PaySchedule_ID Payment Schedule Template */
public void setC_PaySchedule_ID (int C_PaySchedule_ID)
{
if (C_PaySchedule_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_PaySchedule_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_PaySchedule_ID, Integer.valueOf(C_PaySchedule_ID));
}
/** Get Payment Schedule.
@return Payment Schedule Template */
public int getC_PaySchedule_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_PaySchedule_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c14b76a8-d8bd-d1cf-07a9-804987238f83")
public static String es_PE_FIELD_PaymentSchedule_PaymentSchedule_Name="Programa de Pagos";

@XendraTrl(Identifier="c14b76a8-d8bd-d1cf-07a9-804987238f83")
public static String es_PE_FIELD_PaymentSchedule_PaymentSchedule_Description="Plantilla de agenda de pagos.";

@XendraTrl(Identifier="c14b76a8-d8bd-d1cf-07a9-804987238f83")
public static String es_PE_FIELD_PaymentSchedule_PaymentSchedule_Help="Información cuando las partes del pago son debidas.";

@XendraField(AD_Column_ID="C_PaySchedule_ID",IsCentrallyMaintained=true,
AD_Tab_ID="81743aee-3657-abd3-f04e-502643185628",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c14b76a8-d8bd-d1cf-07a9-804987238f83")
public static final String FIELDNAME_PaymentSchedule_PaymentSchedule="c14b76a8-d8bd-d1cf-07a9-804987238f83";

@XendraTrl(Identifier="1c258660-d2d4-d22b-0f8a-06a3d4b95fbc")
public static String es_PE_FIELD_PaymentSchedule_PaymentSchedule2_Name="Programa de Pagos";

@XendraTrl(Identifier="1c258660-d2d4-d22b-0f8a-06a3d4b95fbc")
public static String es_PE_FIELD_PaymentSchedule_PaymentSchedule2_Description="Plantilla de agenda de pagos.";

@XendraTrl(Identifier="1c258660-d2d4-d22b-0f8a-06a3d4b95fbc")
public static String es_PE_FIELD_PaymentSchedule_PaymentSchedule2_Help="Información cuando las partes del pago son debidas.";

@XendraField(AD_Column_ID="C_PaySchedule_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1c98f8f9-9e3a-e888-b8a8-6322564808db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1c258660-d2d4-d22b-0f8a-06a3d4b95fbc")
public static final String FIELDNAME_PaymentSchedule_PaymentSchedule2="1c258660-d2d4-d22b-0f8a-06a3d4b95fbc";

@XendraTrl(Identifier="e67e29f7-a521-3448-674a-df6647a0172b")
public static String es_PE_COLUMN_C_PaySchedule_ID_Name="Programa de Pagos";

@XendraColumn(AD_Element_ID="c1551f4c-5fe0-f529-10e0-cc89a6b9e125",ColumnName="C_PaySchedule_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e67e29f7-a521-3448-674a-df6647a0172b",
Synchronized="2019-08-30 22:21:43.0")
/** Column name C_PaySchedule_ID */
public static final String COLUMNNAME_C_PaySchedule_ID = "C_PaySchedule_ID";
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

@XendraTrl(Identifier="521da4b5-2574-9eb4-22fb-440410e7a1aa")
public static String es_PE_FIELD_PaymentSchedule_DiscountAmount_Name="Total del Descuento";

@XendraTrl(Identifier="521da4b5-2574-9eb4-22fb-440410e7a1aa")
public static String es_PE_FIELD_PaymentSchedule_DiscountAmount_Description="Total de descuento calculado";

@XendraTrl(Identifier="521da4b5-2574-9eb4-22fb-440410e7a1aa")
public static String es_PE_FIELD_PaymentSchedule_DiscountAmount_Help="El Total descuento indica el total de descuento para un documento ó línea";

@XendraField(AD_Column_ID="DiscountAmt",IsCentrallyMaintained=true,
AD_Tab_ID="81743aee-3657-abd3-f04e-502643185628",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="521da4b5-2574-9eb4-22fb-440410e7a1aa")
public static final String FIELDNAME_PaymentSchedule_DiscountAmount="521da4b5-2574-9eb4-22fb-440410e7a1aa";

@XendraTrl(Identifier="6f00b426-7c86-e877-accf-a34ba9a17b9b")
public static String es_PE_FIELD_PaymentSchedule_DiscountAmount2_Name="Total del Descuento";

@XendraTrl(Identifier="6f00b426-7c86-e877-accf-a34ba9a17b9b")
public static String es_PE_FIELD_PaymentSchedule_DiscountAmount2_Description="Total de descuento calculado";

@XendraTrl(Identifier="6f00b426-7c86-e877-accf-a34ba9a17b9b")
public static String es_PE_FIELD_PaymentSchedule_DiscountAmount2_Help="El Total descuento indica el total de descuento para un documento ó línea";

@XendraField(AD_Column_ID="DiscountAmt",IsCentrallyMaintained=true,
AD_Tab_ID="1c98f8f9-9e3a-e888-b8a8-6322564808db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6f00b426-7c86-e877-accf-a34ba9a17b9b")
public static final String FIELDNAME_PaymentSchedule_DiscountAmount2="6f00b426-7c86-e877-accf-a34ba9a17b9b";

@XendraTrl(Identifier="41c5819b-b61b-4dd3-9622-773c5bb8a419")
public static String es_PE_COLUMN_DiscountAmt_Name="Total del Descuento";

@XendraColumn(AD_Element_ID="351290a4-6d07-13cb-9132-459358217d86",ColumnName="DiscountAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="41c5819b-b61b-4dd3-9622-773c5bb8a419",
Synchronized="2019-08-30 22:21:43.0")
/** Column name DiscountAmt */
public static final String COLUMNNAME_DiscountAmt = "DiscountAmt";
/** Set Discount Date.
@param DiscountDate Last Date for payments with discount */
public void setDiscountDate (Timestamp DiscountDate)
{
if (DiscountDate == null) throw new IllegalArgumentException ("DiscountDate is mandatory.");
set_Value (COLUMNNAME_DiscountDate, DiscountDate);
}
/** Get Discount Date.
@return Last Date for payments with discount */
public Timestamp getDiscountDate() 
{
return (Timestamp)get_Value(COLUMNNAME_DiscountDate);
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getDiscountDate()));
}

@XendraTrl(Identifier="0b91b17c-a510-66d7-595d-40075075320c")
public static String es_PE_FIELD_PaymentSchedule_DiscountDate_Name="F. Descuento";

@XendraTrl(Identifier="0b91b17c-a510-66d7-595d-40075075320c")
public static String es_PE_FIELD_PaymentSchedule_DiscountDate_Description="Última fecha para pagos con descuentos";

@XendraTrl(Identifier="0b91b17c-a510-66d7-595d-40075075320c")
public static String es_PE_FIELD_PaymentSchedule_DiscountDate_Help="La fecha pasada donde una deducción del descuento de pago se permite.";

@XendraField(AD_Column_ID="DiscountDate",IsCentrallyMaintained=true,
AD_Tab_ID="81743aee-3657-abd3-f04e-502643185628",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0b91b17c-a510-66d7-595d-40075075320c")
public static final String FIELDNAME_PaymentSchedule_DiscountDate="0b91b17c-a510-66d7-595d-40075075320c";

@XendraTrl(Identifier="24de861b-413e-4489-955e-1afdbb00a9b9")
public static String es_PE_FIELD_PaymentSchedule_DiscountDate2_Name="F. Descuento";

@XendraTrl(Identifier="24de861b-413e-4489-955e-1afdbb00a9b9")
public static String es_PE_FIELD_PaymentSchedule_DiscountDate2_Description="Última fecha para pagos con descuentos";

@XendraTrl(Identifier="24de861b-413e-4489-955e-1afdbb00a9b9")
public static String es_PE_FIELD_PaymentSchedule_DiscountDate2_Help="La fecha pasada donde una deducción del descuento de pago se permite.";

@XendraField(AD_Column_ID="DiscountDate",IsCentrallyMaintained=true,
AD_Tab_ID="1c98f8f9-9e3a-e888-b8a8-6322564808db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="24de861b-413e-4489-955e-1afdbb00a9b9")
public static final String FIELDNAME_PaymentSchedule_DiscountDate2="24de861b-413e-4489-955e-1afdbb00a9b9";

@XendraTrl(Identifier="39664e05-3d91-708d-1132-542d29f5fe51")
public static String es_PE_COLUMN_DiscountDate_Name="F. Descuento";

@XendraColumn(AD_Element_ID="99c55ad3-6e1f-5619-0c46-81724e3b1f18",ColumnName="DiscountDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="39664e05-3d91-708d-1132-542d29f5fe51",
Synchronized="2019-08-30 22:21:43.0")
/** Column name DiscountDate */
public static final String COLUMNNAME_DiscountDate = "DiscountDate";
/** Set Amount due.
@param DueAmt Amount of the payment due */
public void setDueAmt (BigDecimal DueAmt)
{
if (DueAmt == null) throw new IllegalArgumentException ("DueAmt is mandatory.");
set_Value (COLUMNNAME_DueAmt, DueAmt);
}
/** Get Amount due.
@return Amount of the payment due */
public BigDecimal getDueAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_DueAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="bec09d68-4aa4-2a1f-388e-5fc0232948d9")
public static String es_PE_FIELD_PaymentSchedule_AmountDue_Name="Total Debido";

@XendraTrl(Identifier="bec09d68-4aa4-2a1f-388e-5fc0232948d9")
public static String es_PE_FIELD_PaymentSchedule_AmountDue_Description="Total de pagos debidos";

@XendraTrl(Identifier="bec09d68-4aa4-2a1f-388e-5fc0232948d9")
public static String es_PE_FIELD_PaymentSchedule_AmountDue_Help="Cantidad completa del pago debido";

@XendraField(AD_Column_ID="DueAmt",IsCentrallyMaintained=true,
AD_Tab_ID="81743aee-3657-abd3-f04e-502643185628",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bec09d68-4aa4-2a1f-388e-5fc0232948d9")
public static final String FIELDNAME_PaymentSchedule_AmountDue="bec09d68-4aa4-2a1f-388e-5fc0232948d9";

@XendraTrl(Identifier="2253f5bc-bbd6-b0cc-f6ad-46113660f4f3")
public static String es_PE_FIELD_PaymentSchedule_AmountDue2_Name="Total Debido";

@XendraTrl(Identifier="2253f5bc-bbd6-b0cc-f6ad-46113660f4f3")
public static String es_PE_FIELD_PaymentSchedule_AmountDue2_Description="Total de pagos debidos";

@XendraTrl(Identifier="2253f5bc-bbd6-b0cc-f6ad-46113660f4f3")
public static String es_PE_FIELD_PaymentSchedule_AmountDue2_Help="Cantidad completa del pago debido";

@XendraField(AD_Column_ID="DueAmt",IsCentrallyMaintained=true,
AD_Tab_ID="1c98f8f9-9e3a-e888-b8a8-6322564808db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2253f5bc-bbd6-b0cc-f6ad-46113660f4f3")
public static final String FIELDNAME_PaymentSchedule_AmountDue2="2253f5bc-bbd6-b0cc-f6ad-46113660f4f3";

@XendraTrl(Identifier="6d88efee-7641-9fa3-d321-8e54dc2a9b1c")
public static String es_PE_COLUMN_DueAmt_Name="Total Debido";

@XendraColumn(AD_Element_ID="4d3398a4-aa51-f41a-0b8c-b6b3d7e029b5",ColumnName="DueAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6d88efee-7641-9fa3-d321-8e54dc2a9b1c",
Synchronized="2019-08-30 22:21:43.0")
/** Column name DueAmt */
public static final String COLUMNNAME_DueAmt = "DueAmt";
/** Set Due Date.
@param DueDate Date when the payment is due */
public void setDueDate (Timestamp DueDate)
{
if (DueDate == null) throw new IllegalArgumentException ("DueDate is mandatory.");
set_Value (COLUMNNAME_DueDate, DueDate);
}
/** Get Due Date.
@return Date when the payment is due */
public Timestamp getDueDate() 
{
return (Timestamp)get_Value(COLUMNNAME_DueDate);
}

@XendraTrl(Identifier="8c9ca7d0-d9f7-07f1-c65f-52d0f4b6c48f")
public static String es_PE_FIELD_PaymentSchedule_DueDate_Name="Fecha de Vencimiento";

@XendraTrl(Identifier="8c9ca7d0-d9f7-07f1-c65f-52d0f4b6c48f")
public static String es_PE_FIELD_PaymentSchedule_DueDate_Description="Fecha cuando el pago es vencido.";

@XendraTrl(Identifier="8c9ca7d0-d9f7-07f1-c65f-52d0f4b6c48f")
public static String es_PE_FIELD_PaymentSchedule_DueDate_Help="Fecha cuando el pago es vencido sin deducciones ó descuento";

@XendraField(AD_Column_ID="DueDate",IsCentrallyMaintained=true,
AD_Tab_ID="81743aee-3657-abd3-f04e-502643185628",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8c9ca7d0-d9f7-07f1-c65f-52d0f4b6c48f")
public static final String FIELDNAME_PaymentSchedule_DueDate="8c9ca7d0-d9f7-07f1-c65f-52d0f4b6c48f";

@XendraTrl(Identifier="530819a9-900a-39da-e85e-f01979f1e650")
public static String es_PE_FIELD_PaymentSchedule_DueDate2_Name="Fecha de Vencimiento";

@XendraTrl(Identifier="530819a9-900a-39da-e85e-f01979f1e650")
public static String es_PE_FIELD_PaymentSchedule_DueDate2_Description="Fecha cuando el pago es vencido.";

@XendraTrl(Identifier="530819a9-900a-39da-e85e-f01979f1e650")
public static String es_PE_FIELD_PaymentSchedule_DueDate2_Help="Fecha cuando el pago es vencido sin deducciones ó descuento";

@XendraField(AD_Column_ID="DueDate",IsCentrallyMaintained=true,
AD_Tab_ID="1c98f8f9-9e3a-e888-b8a8-6322564808db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="530819a9-900a-39da-e85e-f01979f1e650")
public static final String FIELDNAME_PaymentSchedule_DueDate2="530819a9-900a-39da-e85e-f01979f1e650";

@XendraTrl(Identifier="0fd2aa9b-509b-d231-2fd9-62645a5b6db0")
public static String es_PE_COLUMN_DueDate_Name="Fecha de Vencimiento";

@XendraColumn(AD_Element_ID="37bdf028-bb21-2699-2840-6730e99633c6",ColumnName="DueDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0fd2aa9b-509b-d231-2fd9-62645a5b6db0",
Synchronized="2019-08-30 22:21:43.0")
/** Column name DueDate */
public static final String COLUMNNAME_DueDate = "DueDate";
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
@XendraTrl(Identifier="d2795152-ed60-4bc8-a8bb-a44e59e108f6")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d2795152-ed60-4bc8-a8bb-a44e59e108f6",
Synchronized="2019-08-30 22:21:43.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Valid.
@param IsValid Element is valid */
public void setIsValid (boolean IsValid)
{
set_Value (COLUMNNAME_IsValid, Boolean.valueOf(IsValid));
}
/** Get Valid.
@return Element is valid */
public boolean isValid() 
{
Object oo = get_Value(COLUMNNAME_IsValid);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="95529ccb-a64b-f72e-aaba-b78f28d4fd26")
public static String es_PE_FIELD_PaymentSchedule_Valid_Name="Valido";

@XendraTrl(Identifier="95529ccb-a64b-f72e-aaba-b78f28d4fd26")
public static String es_PE_FIELD_PaymentSchedule_Valid_Description="El elemento es valido";

@XendraTrl(Identifier="95529ccb-a64b-f72e-aaba-b78f28d4fd26")
public static String es_PE_FIELD_PaymentSchedule_Valid_Help="El elemento pasado es el cheque de la validación";

@XendraField(AD_Column_ID="IsValid",IsCentrallyMaintained=true,
AD_Tab_ID="81743aee-3657-abd3-f04e-502643185628",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=130,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="95529ccb-a64b-f72e-aaba-b78f28d4fd26")
public static final String FIELDNAME_PaymentSchedule_Valid="95529ccb-a64b-f72e-aaba-b78f28d4fd26";

@XendraTrl(Identifier="b1bea7f8-f466-e958-f3e1-70762cf6c021")
public static String es_PE_FIELD_PaymentSchedule_Valid2_Name="Valido";

@XendraTrl(Identifier="b1bea7f8-f466-e958-f3e1-70762cf6c021")
public static String es_PE_FIELD_PaymentSchedule_Valid2_Description="El elemento es valido";

@XendraTrl(Identifier="b1bea7f8-f466-e958-f3e1-70762cf6c021")
public static String es_PE_FIELD_PaymentSchedule_Valid2_Help="El elemento pasado es el cheque de la validación";

@XendraField(AD_Column_ID="IsValid",IsCentrallyMaintained=true,
AD_Tab_ID="1c98f8f9-9e3a-e888-b8a8-6322564808db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=130,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b1bea7f8-f466-e958-f3e1-70762cf6c021")
public static final String FIELDNAME_PaymentSchedule_Valid2="b1bea7f8-f466-e958-f3e1-70762cf6c021";

@XendraTrl(Identifier="be3ca6ef-e6a3-b07f-f565-4cd27ecf6538")
public static String es_PE_COLUMN_IsValid_Name="Valido";

@XendraColumn(AD_Element_ID="394c3099-1638-2f07-2e14-7bd38bb8ad25",ColumnName="IsValid",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="be3ca6ef-e6a3-b07f-f565-4cd27ecf6538",
Synchronized="2019-08-30 22:21:43.0")
/** Column name IsValid */
public static final String COLUMNNAME_IsValid = "IsValid";
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

@XendraTrl(Identifier="cd3b645b-be6b-24d1-4d01-09e5ab030bca")
public static String es_PE_FIELD_PaymentSchedule_Processed_Name="Procesado";

@XendraTrl(Identifier="cd3b645b-be6b-24d1-4d01-09e5ab030bca")
public static String es_PE_FIELD_PaymentSchedule_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="cd3b645b-be6b-24d1-4d01-09e5ab030bca")
public static String es_PE_FIELD_PaymentSchedule_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="81743aee-3657-abd3-f04e-502643185628",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=20,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cd3b645b-be6b-24d1-4d01-09e5ab030bca")
public static final String FIELDNAME_PaymentSchedule_Processed="cd3b645b-be6b-24d1-4d01-09e5ab030bca";

@XendraTrl(Identifier="ac7205c7-2e52-deae-98fc-b702f6446198")
public static String es_PE_FIELD_PaymentSchedule_Processed2_Name="Procesado";

@XendraTrl(Identifier="ac7205c7-2e52-deae-98fc-b702f6446198")
public static String es_PE_FIELD_PaymentSchedule_Processed2_Description="El documento ha sido procesado";

@XendraTrl(Identifier="ac7205c7-2e52-deae-98fc-b702f6446198")
public static String es_PE_FIELD_PaymentSchedule_Processed2_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="1c98f8f9-9e3a-e888-b8a8-6322564808db",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=20,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ac7205c7-2e52-deae-98fc-b702f6446198")
public static final String FIELDNAME_PaymentSchedule_Processed2="ac7205c7-2e52-deae-98fc-b702f6446198";

@XendraTrl(Identifier="170d0dcc-be6c-87d7-4365-761fcc382bb0")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="170d0dcc-be6c-87d7-4365-761fcc382bb0",
Synchronized="2019-08-30 22:21:43.0")
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

@XendraTrl(Identifier="d224f9f8-caa2-932c-76e0-341ce182ddf1")
public static String es_PE_FIELD_PaymentSchedule_ProcessNow_Name="Validar";

@XendraTrl(Identifier="d224f9f8-caa2-932c-76e0-341ce182ddf1")
public static String es_PE_FIELD_PaymentSchedule_ProcessNow_Description="Validar Programa de Pagos";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="81743aee-3657-abd3-f04e-502643185628",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d224f9f8-caa2-932c-76e0-341ce182ddf1")
public static final String FIELDNAME_PaymentSchedule_ProcessNow="d224f9f8-caa2-932c-76e0-341ce182ddf1";

@XendraTrl(Identifier="cae2321a-3549-c07b-cd21-a5993a91da92")
public static String es_PE_FIELD_PaymentSchedule_ProcessNow2_Name="Validar";

@XendraTrl(Identifier="cae2321a-3549-c07b-cd21-a5993a91da92")
public static String es_PE_FIELD_PaymentSchedule_ProcessNow2_Description="Validar Programa de Pagos";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="1c98f8f9-9e3a-e888-b8a8-6322564808db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cae2321a-3549-c07b-cd21-a5993a91da92")
public static final String FIELDNAME_PaymentSchedule_ProcessNow2="cae2321a-3549-c07b-cd21-a5993a91da92";

@XendraTrl(Identifier="4cf43905-193a-01f3-317e-c6eae888f2db")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="0b9cee66-157c-a4a9-3908-4fdad3c29000",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4cf43905-193a-01f3-317e-c6eae888f2db",Synchronized="2019-08-30 22:21:43.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
}
