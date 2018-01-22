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
import org.compiere.model.reference.REF_C_PaymentCreditCardType;
import org.compiere.model.reference.REF__DocumentAction;
import org.compiere.model.reference.REF__DocumentStatus;
import org.compiere.model.reference.REF_C_PaymentAVS;
import org.compiere.model.reference.REF_C_PaymentTenderType;
import org.compiere.model.reference.REF_C_PaymentTrxType;
/** Generated Model for C_Payment
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Payment extends PO
{
/** Standard Constructor
@param ctx context
@param C_Payment_ID id
@param trxName transaction
*/
public X_C_Payment (Properties ctx, int C_Payment_ID, String trxName)
{
super (ctx, C_Payment_ID, trxName);
/** if (C_Payment_ID == 0)
{
setC_BankAccount_ID (0);
setC_BPartner_ID (0);
setC_Currency_ID (0);
setC_DocType_ID (0);
setC_Payment_ID (0);
setDateAcct (new Timestamp(System.currentTimeMillis()));	
// @#Date@
setDateTrx (new Timestamp(System.currentTimeMillis()));	
// @#Date@
setDest_BankAccount_ID (0);
setDocAction (null);	
// CO
setDocStatus (null);	
// DR
setDocumentNo (null);
setIsAllocated (false);	
// N
setIsApproved (false);	
// N
setIsDelayedCapture (false);	
// N
setIsOnline (false);	
// N
setIsOverUnderPayment (false);	
// N
setIsPrepayment (false);	
// N
setIsReceipt (false);	
// N
setIsReconciled (false);	
// N
setIsSelfService (false);	
// N
setIsTransfer (false);	
// N
setIsTransferSource (false);	
// N
setPayAmt (Env.ZERO);	
// 0
setPosted (false);	
// N
setProcessed (false);	
// N
setTenderType (null);	
// K
setTrxType (null);	
// S
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_Payment (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=335 */
public static int Table_ID=MTable.getTable_ID("C_Payment");

@XendraTrl(Identifier="ecad51f1-914e-1976-e472-b07276bb417e")
public static String es_PE_TAB_Payment_Description="Movimiento Bancario";

@XendraTrl(Identifier="ecad51f1-914e-1976-e472-b07276bb417e")
public static String es_PE_TAB_Payment_Name="Movimiento Bancario";

@XendraTrl(Identifier="ecad51f1-914e-1976-e472-b07276bb417e")
public static String es_PE_TAB_Payment_Help="La pestaña Pagos define un pago hecho por un Socio de Negocio. Si el pago es para una sola factura; éste puede ser asignado a esa factura directamente usando esta pantalla. También es posible aplicar sobre/sub pagos; se tiene un sobrepago si se ha recibido más dinero que la que se debía por la factura. En lugar de eliminar la diferencia (ej. Volviendola una ganancia); es posible dejar el Total sin asignar y usarlo con futuras facturas ó cartas de crédito. Note que el Total es el Total pagado por lo tanto sobrepagos deben ser entrados como Totales negativos. Es posible también recibir un pago parcial (sub pago). Si se decide no eliminar el pago faltante; entre el sub pago como un Total positivo.";

@XendraTab(Name="Payment",Description="Payment or Receipt",
Help="Enter payment or receipt for a Business Partner.  If it is for a single invoice it can be allocated directly to that invoice using this screen. You can also apply over/under payments:<br> You have an over-payment, if you received more money than due for a single invoice. Instead of writing the difference off (i.e. would be a gain), you can leave the amount unallocated and use it for later invoices or credit memos. Please note that the Amount is the payment amount, so you need to enter the over-payment as a negative amount.<br> You can also receive a partial payment (under-payment). If you decide not to write off the remaining invoice amount, enter the under-payment as a positive amount.<br> Note that printed payments are archived in Payment Selection (Prepared Payment). <br>For Posting, the bank account organization is used, if it is not a charge.",
AD_Window_ID="a5526dd3-69bf-661f-67ed-fa8a6962a00e",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="C_Payment.TrxType<>'X'",OrderByClause="",CommitWarning="",
AD_Process_ID="98860950-a7d3-7244-ae00-7a6f4f0a0088",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="ecad51f1-914e-1976-e472-b07276bb417e",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Payment="ecad51f1-914e-1976-e472-b07276bb417e";

@XendraTrl(Identifier="f3a62298-5bfe-a758-6004-80c9d3836d7a")
public static String es_PE_TAB_Payment2_Description="Visión de la información del pago";

@XendraTrl(Identifier="f3a62298-5bfe-a758-6004-80c9d3836d7a")
public static String es_PE_TAB_Payment2_Name="Pago";
@XendraTab(Name="Payment",
Description="View Payment Information",Help="",AD_Window_ID="ac9cbe03-2007-ff60-2240-d4b45270528e",
SeqNo=20,TabLevel=1,IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="6cb77320-0443-b3c6-d6ba-ab926be1f12b",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="f3a62298-5bfe-a758-6004-80c9d3836d7a",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Payment2="f3a62298-5bfe-a758-6004-80c9d3836d7a";

@XendraTrl(Identifier="08d97246-f708-cbbf-e4c5-04d3aca9b55c")
public static String es_PE_TAB_PartnerPayments_Description="Pagos Socios de Negocio";

@XendraTrl(Identifier="08d97246-f708-cbbf-e4c5-04d3aca9b55c")
public static String es_PE_TAB_PartnerPayments_Name="Pagos Socios de Negocio";

@XendraTab(Name="Partner Payments",Description="Business Partner Payments",Help="",
AD_Window_ID="57133321-6993-bd92-eb4e-d35c10b15e95",SeqNo=50,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,
WhereClause="C_Payment.C_BPartner_ID=@C_BPartner_ID@",OrderByClause="",CommitWarning="",
AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,
Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,IsAdvancedTab=false,
Parent_Column_ID="",Identifier="08d97246-f708-cbbf-e4c5-04d3aca9b55c",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_PartnerPayments="08d97246-f708-cbbf-e4c5-04d3aca9b55c";

@XendraTrl(Identifier="6b56eee3-2271-8a46-80c2-c8ad74a02b26")
public static String es_PE_TABLE_C_Payment_Name="Pago";

@XendraTable(Name="Payment",Description="Payment identifier",Help="",TableName="C_Payment",
AccessLevel="1",AD_Window_ID="a5526dd3-69bf-661f-67ed-fa8a6962a00e",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=105,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="6b56eee3-2271-8a46-80c2-c8ad74a02b26",Synchronized="2017-08-16 11:42:07.0")
/** TableName=C_Payment */
public static final String Table_Name="C_Payment";


@XendraIndex(Name="c_payment_bpartner",Identifier="108b0a33-e553-0e8f-25cd-2eaa330f10c8",
Column_Names="c_bpartner_id",IsUnique="false",
TableIdentifier="108b0a33-e553-0e8f-25cd-2eaa330f10c8",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_payment_bpartner = "108b0a33-e553-0e8f-25cd-2eaa330f10c8";


@XendraIndex(Name="c_payment_bankaccount",Identifier="205fd73e-74c3-84a0-61a1-dc8c62159bbc",
Column_Names="c_bankaccount_id",IsUnique="false",
TableIdentifier="205fd73e-74c3-84a0-61a1-dc8c62159bbc",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_payment_bankaccount = "205fd73e-74c3-84a0-61a1-dc8c62159bbc";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Payment");

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
    Table_ID = MTable.getTable_ID("C_Payment");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Payment[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Account No.
@param AccountNo Account Number */
public void setAccountNo (String AccountNo)
{
if (AccountNo != null && AccountNo.length() > 20)
{
log.warning("Length > 20 - truncated");
AccountNo = AccountNo.substring(0,19);
}
set_Value (COLUMNNAME_AccountNo, AccountNo);
}
/** Get Account No.
@return Account Number */
public String getAccountNo() 
{
String value = (String)get_Value(COLUMNNAME_AccountNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="1422235f-6965-bd27-2664-012f284e4cc1")
public static String es_PE_FIELD_Payment_AccountNo_Description="Número de cuenta";

@XendraTrl(Identifier="1422235f-6965-bd27-2664-012f284e4cc1")
public static String es_PE_FIELD_Payment_AccountNo_Help="El número de cuenta indica el número asignado a esta cuenta.";

@XendraTrl(Identifier="1422235f-6965-bd27-2664-012f284e4cc1")
public static String es_PE_FIELD_Payment_AccountNo_Name="No. De Cuenta";

@XendraField(AD_Column_ID="AccountNo",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsTransfer@!Y & @TenderType@=A | @TenderType@=K",DisplayLength=20,IsReadOnly=false,
SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="1422235f-6965-bd27-2664-012f284e4cc1")
public static final String FIELDNAME_Payment_AccountNo="1422235f-6965-bd27-2664-012f284e4cc1";

@XendraTrl(Identifier="6a53b98e-2e94-a022-6d69-9eed931d8cc1")
public static String es_PE_FIELD_PartnerPayments_AccountNo_Description="Número de cuenta";

@XendraTrl(Identifier="6a53b98e-2e94-a022-6d69-9eed931d8cc1")
public static String es_PE_FIELD_PartnerPayments_AccountNo_Help="El número de cuenta indica el número asignado a esta cuenta.";

@XendraTrl(Identifier="6a53b98e-2e94-a022-6d69-9eed931d8cc1")
public static String es_PE_FIELD_PartnerPayments_AccountNo_Name="No. De Cuenta";

@XendraField(AD_Column_ID="AccountNo",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6a53b98e-2e94-a022-6d69-9eed931d8cc1")
public static final String FIELDNAME_PartnerPayments_AccountNo="6a53b98e-2e94-a022-6d69-9eed931d8cc1";

@XendraTrl(Identifier="76cacb97-bf02-cf1f-a9a6-8b1d84053cab")
public static String es_PE_FIELD_Payment_AccountNo2_Description="Número de cuenta";

@XendraTrl(Identifier="76cacb97-bf02-cf1f-a9a6-8b1d84053cab")
public static String es_PE_FIELD_Payment_AccountNo2_Help="El número de cuenta indica el número asignado a esta cuenta.";

@XendraTrl(Identifier="76cacb97-bf02-cf1f-a9a6-8b1d84053cab")
public static String es_PE_FIELD_Payment_AccountNo2_Name="No. De Cuenta";

@XendraField(AD_Column_ID="AccountNo",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="76cacb97-bf02-cf1f-a9a6-8b1d84053cab")
public static final String FIELDNAME_Payment_AccountNo2="76cacb97-bf02-cf1f-a9a6-8b1d84053cab";

@XendraTrl(Identifier="5b95ed74-7b55-f5f0-6ea6-1daeebee7e2e")
public static String es_PE_COLUMN_AccountNo_Name="No. De Cuenta";

@XendraColumn(AD_Element_ID="f476cad1-331f-9d18-a8b7-c03b172f9997",ColumnName="AccountNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5b95ed74-7b55-f5f0-6ea6-1daeebee7e2e",
Synchronized="2017-08-05 16:53:59.0")
/** Column name AccountNo */
public static final String COLUMNNAME_AccountNo = "AccountNo";
/** Set Account City.
@param A_City City or the Credit Card or Account Holder */
public void setA_City (String A_City)
{
if (A_City != null && A_City.length() > 60)
{
log.warning("Length > 60 - truncated");
A_City = A_City.substring(0,59);
}
set_Value (COLUMNNAME_A_City, A_City);
}
/** Get Account City.
@return City or the Credit Card or Account Holder */
public String getA_City() 
{
String value = (String)get_Value(COLUMNNAME_A_City);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d03e7efb-2d9a-7464-0707-b806db0b8027")
public static String es_PE_FIELD_Payment_AccountCity_Description="Ciudad de la tarjeta de crédito ó el poseedor de la cuenta";

@XendraTrl(Identifier="d03e7efb-2d9a-7464-0707-b806db0b8027")
public static String es_PE_FIELD_Payment_AccountCity_Help="La ciudad de la cuenta indica la ciudad de la tarjeta de crédito ó poseedor de la cuenta";

@XendraTrl(Identifier="d03e7efb-2d9a-7464-0707-b806db0b8027")
public static String es_PE_FIELD_Payment_AccountCity_Name="Ciudad";

@XendraField(AD_Column_ID="A_City",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsTransfer@!Y & @TenderType@=C | @TenderType@=K & @IsOnline@=Y",DisplayLength=20,
IsReadOnly=false,SeqNo=390,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,
Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d03e7efb-2d9a-7464-0707-b806db0b8027")
public static final String FIELDNAME_Payment_AccountCity="d03e7efb-2d9a-7464-0707-b806db0b8027";

@XendraTrl(Identifier="34e51ae0-b57b-9bab-0ee5-badb61ae2093")
public static String es_PE_FIELD_PartnerPayments_AccountCity_Description="Ciudad de la tarjeta de crédito ó el poseedor de la cuenta";

@XendraTrl(Identifier="34e51ae0-b57b-9bab-0ee5-badb61ae2093")
public static String es_PE_FIELD_PartnerPayments_AccountCity_Help="La ciudad de la cuenta indica la ciudad de la tarjeta de crédito ó poseedor de la cuenta";

@XendraTrl(Identifier="34e51ae0-b57b-9bab-0ee5-badb61ae2093")
public static String es_PE_FIELD_PartnerPayments_AccountCity_Name="Ciudad";

@XendraField(AD_Column_ID="A_City",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="34e51ae0-b57b-9bab-0ee5-badb61ae2093")
public static final String FIELDNAME_PartnerPayments_AccountCity="34e51ae0-b57b-9bab-0ee5-badb61ae2093";

@XendraTrl(Identifier="f5997880-aaff-dce2-6b9f-a411867a2056")
public static String es_PE_FIELD_Payment_AccountCity2_Description="Ciudad de la tarjeta de crédito ó el poseedor de la cuenta";

@XendraTrl(Identifier="f5997880-aaff-dce2-6b9f-a411867a2056")
public static String es_PE_FIELD_Payment_AccountCity2_Help="La ciudad de la cuenta indica la ciudad de la tarjeta de crédito ó poseedor de la cuenta";

@XendraTrl(Identifier="f5997880-aaff-dce2-6b9f-a411867a2056")
public static String es_PE_FIELD_Payment_AccountCity2_Name="Ciudad";

@XendraField(AD_Column_ID="A_City",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f5997880-aaff-dce2-6b9f-a411867a2056")
public static final String FIELDNAME_Payment_AccountCity2="f5997880-aaff-dce2-6b9f-a411867a2056";

@XendraTrl(Identifier="26d9c31c-0f2c-823c-f391-b4e42557ee4f")
public static String es_PE_COLUMN_A_City_Name="Ciudad";

@XendraColumn(AD_Element_ID="d0b9f0dc-6e4e-7b82-ce92-ce27f1d981da",ColumnName="A_City",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@IsApproved@=Y",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",
ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="26d9c31c-0f2c-823c-f391-b4e42557ee4f",Synchronized="2017-08-05 16:53:59.0")
/** Column name A_City */
public static final String COLUMNNAME_A_City = "A_City";
/** Set Account Country.
@param A_Country Country */
public void setA_Country (String A_Country)
{
if (A_Country != null && A_Country.length() > 40)
{
log.warning("Length > 40 - truncated");
A_Country = A_Country.substring(0,39);
}
set_Value (COLUMNNAME_A_Country, A_Country);
}
/** Get Account Country.
@return Country */
public String getA_Country() 
{
String value = (String)get_Value(COLUMNNAME_A_Country);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="7bf55598-aec1-2452-6aaf-e6de961673cc")
public static String es_PE_FIELD_Payment_AccountCountry_Description="País";

@XendraTrl(Identifier="7bf55598-aec1-2452-6aaf-e6de961673cc")
public static String es_PE_FIELD_Payment_AccountCountry_Help="Nombre de país cuenta.";

@XendraTrl(Identifier="7bf55598-aec1-2452-6aaf-e6de961673cc")
public static String es_PE_FIELD_Payment_AccountCountry_Name="País Cuenta";

@XendraField(AD_Column_ID="A_Country",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsTransfer@!Y & @TenderType@=C | @TenderType@=K & @IsOnline@=Y",DisplayLength=20,
IsReadOnly=false,SeqNo=420,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,
Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7bf55598-aec1-2452-6aaf-e6de961673cc")
public static final String FIELDNAME_Payment_AccountCountry="7bf55598-aec1-2452-6aaf-e6de961673cc";

@XendraTrl(Identifier="584bc046-2a51-e3f4-9c8f-1c507ad9be3f")
public static String es_PE_FIELD_PartnerPayments_AccountCountry_Description="País";

@XendraTrl(Identifier="584bc046-2a51-e3f4-9c8f-1c507ad9be3f")
public static String es_PE_FIELD_PartnerPayments_AccountCountry_Help="Nombre de país cuenta.";

@XendraTrl(Identifier="584bc046-2a51-e3f4-9c8f-1c507ad9be3f")
public static String es_PE_FIELD_PartnerPayments_AccountCountry_Name="País Cuenta";

@XendraField(AD_Column_ID="A_Country",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="584bc046-2a51-e3f4-9c8f-1c507ad9be3f")
public static final String FIELDNAME_PartnerPayments_AccountCountry="584bc046-2a51-e3f4-9c8f-1c507ad9be3f";

@XendraTrl(Identifier="f98581a5-90d0-52c9-7077-1861943c9a2c")
public static String es_PE_FIELD_Payment_AccountCountry2_Description="País";

@XendraTrl(Identifier="f98581a5-90d0-52c9-7077-1861943c9a2c")
public static String es_PE_FIELD_Payment_AccountCountry2_Help="Nombre de país cuenta.";

@XendraTrl(Identifier="f98581a5-90d0-52c9-7077-1861943c9a2c")
public static String es_PE_FIELD_Payment_AccountCountry2_Name="País Cuenta";

@XendraField(AD_Column_ID="A_Country",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f98581a5-90d0-52c9-7077-1861943c9a2c")
public static final String FIELDNAME_Payment_AccountCountry2="f98581a5-90d0-52c9-7077-1861943c9a2c";

@XendraTrl(Identifier="ca7ea872-ee69-95d4-f30b-e8ae34682b41")
public static String es_PE_COLUMN_A_Country_Name="País Cuenta";

@XendraColumn(AD_Element_ID="2557bc05-7c00-bbb7-3d44-0332178331b7",ColumnName="A_Country",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@IsApproved@=Y",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",
ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ca7ea872-ee69-95d4-f30b-e8ae34682b41",Synchronized="2017-08-05 16:53:59.0")
/** Column name A_Country */
public static final String COLUMNNAME_A_Country = "A_Country";

/** AD_OrgTrx_ID AD_Reference=54e78591-f7f4-c613-ea27-e64b3dac5198 */
public static final int AD_ORGTRX_ID_AD_Reference_ID=130;
/** Set Trx Organization.
@param AD_OrgTrx_ID Performing or initiating organization */
public void setAD_OrgTrx_ID (int AD_OrgTrx_ID)
{
if (AD_OrgTrx_ID <= 0) set_Value (COLUMNNAME_AD_OrgTrx_ID, null);
 else 
set_Value (COLUMNNAME_AD_OrgTrx_ID, Integer.valueOf(AD_OrgTrx_ID));
}
/** Get Trx Organization.
@return Performing or initiating organization */
public int getAD_OrgTrx_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_OrgTrx_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f95e3098-23f1-970e-acdc-ba4ebf94095c")
public static String es_PE_FIELD_Payment_TrxOrganization_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="f95e3098-23f1-970e-acdc-ba4ebf94095c")
public static String es_PE_FIELD_Payment_TrxOrganization_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraTrl(Identifier="f95e3098-23f1-970e-acdc-ba4ebf94095c")
public static String es_PE_FIELD_Payment_TrxOrganization_Name="Organización de la Trans.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsTransfer@!Y & @$Element_OT@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=190,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f95e3098-23f1-970e-acdc-ba4ebf94095c")
public static final String FIELDNAME_Payment_TrxOrganization="f95e3098-23f1-970e-acdc-ba4ebf94095c";

@XendraTrl(Identifier="9c2e3c9e-7edf-9ad6-e6ac-0ad3e3555cac")
public static String es_PE_FIELD_PartnerPayments_TrxOrganization_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="9c2e3c9e-7edf-9ad6-e6ac-0ad3e3555cac")
public static String es_PE_FIELD_PartnerPayments_TrxOrganization_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraTrl(Identifier="9c2e3c9e-7edf-9ad6-e6ac-0ad3e3555cac")
public static String es_PE_FIELD_PartnerPayments_TrxOrganization_Name="Organización de la Trans.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9c2e3c9e-7edf-9ad6-e6ac-0ad3e3555cac")
public static final String FIELDNAME_PartnerPayments_TrxOrganization="9c2e3c9e-7edf-9ad6-e6ac-0ad3e3555cac";

@XendraTrl(Identifier="aafe2a44-08be-6676-7b97-210572c6ae23")
public static String es_PE_FIELD_Payment_TrxOrganization2_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="aafe2a44-08be-6676-7b97-210572c6ae23")
public static String es_PE_FIELD_Payment_TrxOrganization2_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraTrl(Identifier="aafe2a44-08be-6676-7b97-210572c6ae23")
public static String es_PE_FIELD_Payment_TrxOrganization2_Name="Organización de la Trans.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aafe2a44-08be-6676-7b97-210572c6ae23")
public static final String FIELDNAME_Payment_TrxOrganization2="aafe2a44-08be-6676-7b97-210572c6ae23";

@XendraTrl(Identifier="edfb27a3-252d-1355-916c-02b7f6d00f9b")
public static String es_PE_COLUMN_AD_OrgTrx_ID_Name="Organización de la Trans.";

@XendraColumn(AD_Element_ID="b4180358-67aa-fe55-0409-6367a60e0a2e",ColumnName="AD_OrgTrx_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="54e78591-f7f4-c613-ea27-e64b3dac5198",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="edfb27a3-252d-1355-916c-02b7f6d00f9b",Synchronized="2017-08-05 16:53:59.0")
/** Column name AD_OrgTrx_ID */
public static final String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
/** Set Account EMail.
@param A_EMail Email Address */
public void setA_EMail (String A_EMail)
{
if (A_EMail != null && A_EMail.length() > 60)
{
log.warning("Length > 60 - truncated");
A_EMail = A_EMail.substring(0,59);
}
set_Value (COLUMNNAME_A_EMail, A_EMail);
}
/** Get Account EMail.
@return Email Address */
public String getA_EMail() 
{
String value = (String)get_Value(COLUMNNAME_A_EMail);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="aa5d736b-1256-b939-2239-c2d190cb3ccf")
public static String es_PE_FIELD_Payment_AccountEMail_Description="Dirección de correo electrónico";

@XendraTrl(Identifier="aa5d736b-1256-b939-2239-c2d190cb3ccf")
public static String es_PE_FIELD_Payment_AccountEMail_Help="La dirección de email indica la dirección de correo electrónico de la tarjeta de crédito ó poseedor de la cuenta";

@XendraTrl(Identifier="aa5d736b-1256-b939-2239-c2d190cb3ccf")
public static String es_PE_FIELD_Payment_AccountEMail_Name="Cta. Correo Electrónico";

@XendraField(AD_Column_ID="A_EMail",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsTransfer@!Y & @TenderType@=K & @IsOnline@=Y",DisplayLength=20,IsReadOnly=false,
SeqNo=450,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="aa5d736b-1256-b939-2239-c2d190cb3ccf")
public static final String FIELDNAME_Payment_AccountEMail="aa5d736b-1256-b939-2239-c2d190cb3ccf";

@XendraTrl(Identifier="2bbb7d0f-cbf8-d425-7699-d14a60c26775")
public static String es_PE_FIELD_PartnerPayments_AccountEMail_Description="Dirección de correo electrónico";

@XendraTrl(Identifier="2bbb7d0f-cbf8-d425-7699-d14a60c26775")
public static String es_PE_FIELD_PartnerPayments_AccountEMail_Help="La dirección de email indica la dirección de correo electrónico de la tarjeta de crédito ó poseedor de la cuenta";

@XendraTrl(Identifier="2bbb7d0f-cbf8-d425-7699-d14a60c26775")
public static String es_PE_FIELD_PartnerPayments_AccountEMail_Name="Cta. Correo Electrónico";

@XendraField(AD_Column_ID="A_EMail",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2bbb7d0f-cbf8-d425-7699-d14a60c26775")
public static final String FIELDNAME_PartnerPayments_AccountEMail="2bbb7d0f-cbf8-d425-7699-d14a60c26775";

@XendraTrl(Identifier="d17eaa24-0d98-36b3-ca3f-e8bca5945f51")
public static String es_PE_FIELD_Payment_AccountEMail2_Description="Dirección de correo electrónico";

@XendraTrl(Identifier="d17eaa24-0d98-36b3-ca3f-e8bca5945f51")
public static String es_PE_FIELD_Payment_AccountEMail2_Help="La dirección de email indica la dirección de correo electrónico de la tarjeta de crédito ó poseedor de la cuenta";

@XendraTrl(Identifier="d17eaa24-0d98-36b3-ca3f-e8bca5945f51")
public static String es_PE_FIELD_Payment_AccountEMail2_Name="Cta. Correo Electrónico";

@XendraField(AD_Column_ID="A_EMail",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d17eaa24-0d98-36b3-ca3f-e8bca5945f51")
public static final String FIELDNAME_Payment_AccountEMail2="d17eaa24-0d98-36b3-ca3f-e8bca5945f51";

@XendraTrl(Identifier="2386c200-fd13-242d-df83-76e981dcc217")
public static String es_PE_COLUMN_A_EMail_Name="Cta. Correo Electrónico";

@XendraColumn(AD_Element_ID="7d49db1f-4635-479c-1130-e25e429b9dde",ColumnName="A_EMail",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@IsApproved@=Y",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",
ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2386c200-fd13-242d-df83-76e981dcc217",Synchronized="2017-08-05 16:53:59.0")
/** Column name A_EMail */
public static final String COLUMNNAME_A_EMail = "A_EMail";
/** Set Driver License.
@param A_Ident_DL Payment Identification - Driver License */
public void setA_Ident_DL (String A_Ident_DL)
{
if (A_Ident_DL != null && A_Ident_DL.length() > 20)
{
log.warning("Length > 20 - truncated");
A_Ident_DL = A_Ident_DL.substring(0,19);
}
set_Value (COLUMNNAME_A_Ident_DL, A_Ident_DL);
}
/** Get Driver License.
@return Payment Identification - Driver License */
public String getA_Ident_DL() 
{
String value = (String)get_Value(COLUMNNAME_A_Ident_DL);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="4a3d2765-158f-2092-b46c-37b97f887275")
public static String es_PE_FIELD_Payment_DriverLicense_Description="Identificación de pago - Licencia de manejo";

@XendraTrl(Identifier="4a3d2765-158f-2092-b46c-37b97f887275")
public static String es_PE_FIELD_Payment_DriverLicense_Help="Licencia de conducir";

@XendraTrl(Identifier="4a3d2765-158f-2092-b46c-37b97f887275")
public static String es_PE_FIELD_Payment_DriverLicense_Name="Licencia de Conducir";

@XendraField(AD_Column_ID="A_Ident_DL",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsTransfer@!Y & @TenderType@=K & @IsOnline@=Y",DisplayLength=20,IsReadOnly=false,
SeqNo=430,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4a3d2765-158f-2092-b46c-37b97f887275")
public static final String FIELDNAME_Payment_DriverLicense="4a3d2765-158f-2092-b46c-37b97f887275";

@XendraTrl(Identifier="2499f5b4-1ea6-b152-3829-a1bca6f39da6")
public static String es_PE_FIELD_PartnerPayments_DriverLicense_Description="Identificación de pago - Licencia de manejo";

@XendraTrl(Identifier="2499f5b4-1ea6-b152-3829-a1bca6f39da6")
public static String es_PE_FIELD_PartnerPayments_DriverLicense_Help="Licencia de conducir";

@XendraTrl(Identifier="2499f5b4-1ea6-b152-3829-a1bca6f39da6")
public static String es_PE_FIELD_PartnerPayments_DriverLicense_Name="Licencia de Conducir";

@XendraField(AD_Column_ID="A_Ident_DL",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2499f5b4-1ea6-b152-3829-a1bca6f39da6")
public static final String FIELDNAME_PartnerPayments_DriverLicense="2499f5b4-1ea6-b152-3829-a1bca6f39da6";

@XendraTrl(Identifier="b8f70635-06bc-dfc6-4671-b340facf5110")
public static String es_PE_FIELD_Payment_DriverLicense2_Description="Identificación de pago - Licencia de manejo";

@XendraTrl(Identifier="b8f70635-06bc-dfc6-4671-b340facf5110")
public static String es_PE_FIELD_Payment_DriverLicense2_Help="Licencia de conducir";

@XendraTrl(Identifier="b8f70635-06bc-dfc6-4671-b340facf5110")
public static String es_PE_FIELD_Payment_DriverLicense2_Name="Licencia de Conducir";

@XendraField(AD_Column_ID="A_Ident_DL",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b8f70635-06bc-dfc6-4671-b340facf5110")
public static final String FIELDNAME_Payment_DriverLicense2="b8f70635-06bc-dfc6-4671-b340facf5110";

@XendraTrl(Identifier="9d2e5586-ab8c-2c27-61c3-44a6495a7ccb")
public static String es_PE_COLUMN_A_Ident_DL_Name="Licencia de Conducir";

@XendraColumn(AD_Element_ID="6cadeb4e-fc57-dc2e-3338-caca80ba426d",ColumnName="A_Ident_DL",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@IsApproved@=Y",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",
ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9d2e5586-ab8c-2c27-61c3-44a6495a7ccb",Synchronized="2017-08-05 16:53:59.0")
/** Column name A_Ident_DL */
public static final String COLUMNNAME_A_Ident_DL = "A_Ident_DL";
/** Set Social Security No.
@param A_Ident_SSN Payment Identification - Social Security No */
public void setA_Ident_SSN (String A_Ident_SSN)
{
if (A_Ident_SSN != null && A_Ident_SSN.length() > 20)
{
log.warning("Length > 20 - truncated");
A_Ident_SSN = A_Ident_SSN.substring(0,19);
}
set_Value (COLUMNNAME_A_Ident_SSN, A_Ident_SSN);
}
/** Get Social Security No.
@return Payment Identification - Social Security No */
public String getA_Ident_SSN() 
{
String value = (String)get_Value(COLUMNNAME_A_Ident_SSN);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="e9bb343d-825f-9a63-9343-eb181bbe0151")
public static String es_PE_FIELD_Payment_SocialSecurityNo_Description="Identificación de pago - No. del seguro social.";

@XendraTrl(Identifier="e9bb343d-825f-9a63-9343-eb181bbe0151")
public static String es_PE_FIELD_Payment_SocialSecurityNo_Help="El número de seguro social que se usará como identificación.";

@XendraTrl(Identifier="e9bb343d-825f-9a63-9343-eb181bbe0151")
public static String es_PE_FIELD_Payment_SocialSecurityNo_Name="No. Seguro Social";

@XendraField(AD_Column_ID="A_Ident_SSN",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsTransfer@!Y & @TenderType@=K & @IsOnline@=Y",DisplayLength=20,IsReadOnly=false,
SeqNo=440,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="e9bb343d-825f-9a63-9343-eb181bbe0151")
public static final String FIELDNAME_Payment_SocialSecurityNo="e9bb343d-825f-9a63-9343-eb181bbe0151";

@XendraTrl(Identifier="ce00a0ed-00ee-ab71-32cd-3200a685dd27")
public static String es_PE_FIELD_PartnerPayments_SocialSecurityNo_Description="Identificación de pago - No. del seguro social.";

@XendraTrl(Identifier="ce00a0ed-00ee-ab71-32cd-3200a685dd27")
public static String es_PE_FIELD_PartnerPayments_SocialSecurityNo_Help="El número de seguro social que se usará como identificación.";

@XendraTrl(Identifier="ce00a0ed-00ee-ab71-32cd-3200a685dd27")
public static String es_PE_FIELD_PartnerPayments_SocialSecurityNo_Name="No. Seguro Social";

@XendraField(AD_Column_ID="A_Ident_SSN",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ce00a0ed-00ee-ab71-32cd-3200a685dd27")
public static final String FIELDNAME_PartnerPayments_SocialSecurityNo="ce00a0ed-00ee-ab71-32cd-3200a685dd27";

@XendraTrl(Identifier="67d7704c-84fb-f832-2fc7-3d909e488dd7")
public static String es_PE_FIELD_Payment_SocialSecurityNo2_Description="Identificación de pago - No. del seguro social.";

@XendraTrl(Identifier="67d7704c-84fb-f832-2fc7-3d909e488dd7")
public static String es_PE_FIELD_Payment_SocialSecurityNo2_Help="El número de seguro social que se usará como identificación.";

@XendraTrl(Identifier="67d7704c-84fb-f832-2fc7-3d909e488dd7")
public static String es_PE_FIELD_Payment_SocialSecurityNo2_Name="No. Seguro Social";

@XendraField(AD_Column_ID="A_Ident_SSN",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="67d7704c-84fb-f832-2fc7-3d909e488dd7")
public static final String FIELDNAME_Payment_SocialSecurityNo2="67d7704c-84fb-f832-2fc7-3d909e488dd7";

@XendraTrl(Identifier="6c78550f-13d5-8097-2121-2543926e70a9")
public static String es_PE_COLUMN_A_Ident_SSN_Name="No. Seguro Social";

@XendraColumn(AD_Element_ID="a8725a16-fd7d-7fff-8ac8-c9ce0b539b15",ColumnName="A_Ident_SSN",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@IsApproved@=Y",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",
ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6c78550f-13d5-8097-2121-2543926e70a9",Synchronized="2017-08-05 16:53:59.0")
/** Column name A_Ident_SSN */
public static final String COLUMNNAME_A_Ident_SSN = "A_Ident_SSN";
/** Set Alias.
@param Alias Defines an alternate method of indicating an account combination. */
public void setAlias (String Alias)
{
if (Alias != null && Alias.length() > 60)
{
log.warning("Length > 60 - truncated");
Alias = Alias.substring(0,59);
}
set_Value (COLUMNNAME_Alias, Alias);
}
/** Get Alias.
@return Defines an alternate method of indicating an account combination. */
public String getAlias() 
{
String value = (String)get_Value(COLUMNNAME_Alias);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="36a1b423-b9bb-3334-1e01-474310da70db")
public static String es_PE_FIELD_Payment_Alias_Description="Define un método alterno de identificar una combinación de cuenta";

@XendraTrl(Identifier="36a1b423-b9bb-3334-1e01-474310da70db")
public static String es_PE_FIELD_Payment_Alias_Help="El campo Alias le permite identificar un método alterno para referirse a una combinación completa de cuenta. Por Ej.; La cuenta por cobrar para Garden World puede tener el alias de  GW_AR.";

@XendraTrl(Identifier="36a1b423-b9bb-3334-1e01-474310da70db")
public static String es_PE_FIELD_Payment_Alias_Name="Girado A:";
@XendraField(AD_Column_ID="Alias",
IsCentrallyMaintained=true,AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="36a1b423-b9bb-3334-1e01-474310da70db")
public static final String FIELDNAME_Payment_Alias="36a1b423-b9bb-3334-1e01-474310da70db";

@XendraTrl(Identifier="50d2040c-865f-c05d-7479-7922121250e3")
public static String es_PE_COLUMN_Alias_Name="Alias";

@XendraColumn(AD_Element_ID="eb2b55b1-1094-cce9-62c7-fbcb31313519",ColumnName="Alias",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="50d2040c-865f-c05d-7479-7922121250e3",
Synchronized="2017-08-05 16:53:59.0")
/** Column name Alias */
public static final String COLUMNNAME_Alias = "Alias";
/** Set Account Name.
@param A_Name Name on Credit Card or Account holder */
public void setA_Name (String A_Name)
{
if (A_Name != null && A_Name.length() > 60)
{
log.warning("Length > 60 - truncated");
A_Name = A_Name.substring(0,59);
}
set_Value (COLUMNNAME_A_Name, A_Name);
}
/** Get Account Name.
@return Name on Credit Card or Account holder */
public String getA_Name() 
{
String value = (String)get_Value(COLUMNNAME_A_Name);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="b52ac494-5c67-928b-d2fc-ae94ba4717bf")
public static String es_PE_FIELD_Payment_AccountName_Description="Nombre de la tarjeta de crédito ó el poseedor de la cuenta.";

@XendraTrl(Identifier="b52ac494-5c67-928b-d2fc-ae94ba4717bf")
public static String es_PE_FIELD_Payment_AccountName_Help="El nombre de la tarjeta de crédito ó poseedor de la cuenta.";

@XendraTrl(Identifier="b52ac494-5c67-928b-d2fc-ae94ba4717bf")
public static String es_PE_FIELD_Payment_AccountName_Name="Nombre";

@XendraField(AD_Column_ID="A_Name",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsTransfer@!Y & @TenderType@=C | @TenderType@=K",DisplayLength=20,IsReadOnly=false,
SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b52ac494-5c67-928b-d2fc-ae94ba4717bf")
public static final String FIELDNAME_Payment_AccountName="b52ac494-5c67-928b-d2fc-ae94ba4717bf";

@XendraTrl(Identifier="6ff060a8-6288-d5d4-5964-bfda2b145114")
public static String es_PE_FIELD_PartnerPayments_AccountName_Description="Nombre de la tarjeta de crédito ó el poseedor de la cuenta.";

@XendraTrl(Identifier="6ff060a8-6288-d5d4-5964-bfda2b145114")
public static String es_PE_FIELD_PartnerPayments_AccountName_Help="El nombre de la tarjeta de crédito ó poseedor de la cuenta.";

@XendraTrl(Identifier="6ff060a8-6288-d5d4-5964-bfda2b145114")
public static String es_PE_FIELD_PartnerPayments_AccountName_Name="Nombre";

@XendraField(AD_Column_ID="A_Name",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6ff060a8-6288-d5d4-5964-bfda2b145114")
public static final String FIELDNAME_PartnerPayments_AccountName="6ff060a8-6288-d5d4-5964-bfda2b145114";

@XendraTrl(Identifier="e9eb698e-988a-8edc-a0dc-a0368317c7cb")
public static String es_PE_FIELD_Payment_AccountName2_Description="Nombre de la tarjeta de crédito ó el poseedor de la cuenta.";

@XendraTrl(Identifier="e9eb698e-988a-8edc-a0dc-a0368317c7cb")
public static String es_PE_FIELD_Payment_AccountName2_Help="El nombre de la tarjeta de crédito ó poseedor de la cuenta.";

@XendraTrl(Identifier="e9eb698e-988a-8edc-a0dc-a0368317c7cb")
public static String es_PE_FIELD_Payment_AccountName2_Name="Nombre";

@XendraField(AD_Column_ID="A_Name",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e9eb698e-988a-8edc-a0dc-a0368317c7cb")
public static final String FIELDNAME_Payment_AccountName2="e9eb698e-988a-8edc-a0dc-a0368317c7cb";

@XendraTrl(Identifier="996cb817-e7ec-7b4d-cd4b-1b1a14252255")
public static String es_PE_COLUMN_A_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="4caab851-6dad-67db-64c8-779b7d63b4c6",ColumnName="A_Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@IsApproved@=Y",IsIdentifier=true,SeqNo=4,IsTranslated=false,Callout="",VFormat="",
ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="996cb817-e7ec-7b4d-cd4b-1b1a14252255",Synchronized="2017-08-05 16:53:59.0")
/** Column name A_Name */
public static final String COLUMNNAME_A_Name = "A_Name";
/** Set Account State.
@param A_State State of the Credit Card or Account holder */
public void setA_State (String A_State)
{
if (A_State != null && A_State.length() > 40)
{
log.warning("Length > 40 - truncated");
A_State = A_State.substring(0,39);
}
set_Value (COLUMNNAME_A_State, A_State);
}
/** Get Account State.
@return State of the Credit Card or Account holder */
public String getA_State() 
{
String value = (String)get_Value(COLUMNNAME_A_State);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="de244c8c-53c4-cc02-764a-4f65ad49b416")
public static String es_PE_FIELD_Payment_AccountState_Description="Estado de la tarjeta de crédito ó el poseedor de la cuenta";

@XendraTrl(Identifier="de244c8c-53c4-cc02-764a-4f65ad49b416")
public static String es_PE_FIELD_Payment_AccountState_Help="El estado de la tarjeta de crédito ó poseedor de la cuenta";

@XendraTrl(Identifier="de244c8c-53c4-cc02-764a-4f65ad49b416")
public static String es_PE_FIELD_Payment_AccountState_Name="Estado";

@XendraField(AD_Column_ID="A_State",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsTransfer@!Y & @TenderType@=C | @TenderType@=K & @IsOnline@=Y",DisplayLength=11,
IsReadOnly=false,SeqNo=410,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,
Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="de244c8c-53c4-cc02-764a-4f65ad49b416")
public static final String FIELDNAME_Payment_AccountState="de244c8c-53c4-cc02-764a-4f65ad49b416";

@XendraTrl(Identifier="aa26e083-2ad5-0da8-5328-e4b1ba3280fb")
public static String es_PE_FIELD_PartnerPayments_AccountState_Description="Estado de la tarjeta de crédito ó el poseedor de la cuenta";

@XendraTrl(Identifier="aa26e083-2ad5-0da8-5328-e4b1ba3280fb")
public static String es_PE_FIELD_PartnerPayments_AccountState_Help="El estado de la tarjeta de crédito ó poseedor de la cuenta";

@XendraTrl(Identifier="aa26e083-2ad5-0da8-5328-e4b1ba3280fb")
public static String es_PE_FIELD_PartnerPayments_AccountState_Name="Estado";

@XendraField(AD_Column_ID="A_State",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aa26e083-2ad5-0da8-5328-e4b1ba3280fb")
public static final String FIELDNAME_PartnerPayments_AccountState="aa26e083-2ad5-0da8-5328-e4b1ba3280fb";

@XendraTrl(Identifier="aa9cc7ce-2ac7-d81d-7e58-0ca68333fd80")
public static String es_PE_FIELD_Payment_AccountState2_Description="Estado de la tarjeta de crédito ó el poseedor de la cuenta";

@XendraTrl(Identifier="aa9cc7ce-2ac7-d81d-7e58-0ca68333fd80")
public static String es_PE_FIELD_Payment_AccountState2_Help="El estado de la tarjeta de crédito ó poseedor de la cuenta";

@XendraTrl(Identifier="aa9cc7ce-2ac7-d81d-7e58-0ca68333fd80")
public static String es_PE_FIELD_Payment_AccountState2_Name="Estado";

@XendraField(AD_Column_ID="A_State",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aa9cc7ce-2ac7-d81d-7e58-0ca68333fd80")
public static final String FIELDNAME_Payment_AccountState2="aa9cc7ce-2ac7-d81d-7e58-0ca68333fd80";

@XendraTrl(Identifier="fe94593d-fc63-d932-9dae-89d55eef24d9")
public static String es_PE_COLUMN_A_State_Name="Estado";

@XendraColumn(AD_Element_ID="9d555d0b-34c9-065f-d541-fe1cd1ef7490",ColumnName="A_State",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@IsApproved@=Y",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",
ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="fe94593d-fc63-d932-9dae-89d55eef24d9",Synchronized="2017-08-05 16:53:59.0")
/** Column name A_State */
public static final String COLUMNNAME_A_State = "A_State";
/** Set Account Street.
@param A_Street Street address of the Credit Card or Account holder */
public void setA_Street (String A_Street)
{
if (A_Street != null && A_Street.length() > 60)
{
log.warning("Length > 60 - truncated");
A_Street = A_Street.substring(0,59);
}
set_Value (COLUMNNAME_A_Street, A_Street);
}
/** Get Account Street.
@return Street address of the Credit Card or Account holder */
public String getA_Street() 
{
String value = (String)get_Value(COLUMNNAME_A_Street);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="1d241a94-c24e-6729-5457-b3dd07b3ce2d")
public static String es_PE_FIELD_Payment_AccountStreet_Description="Calle de la Tarjeta de Crédito o el Poseedor de la cuenta";

@XendraTrl(Identifier="1d241a94-c24e-6729-5457-b3dd07b3ce2d")
public static String es_PE_FIELD_Payment_AccountStreet_Help="La Dirección de la Calle de la Tarjeta de Crédito o poseedor de la cuenta";

@XendraTrl(Identifier="1d241a94-c24e-6729-5457-b3dd07b3ce2d")
public static String es_PE_FIELD_Payment_AccountStreet_Name="Calle";

@XendraField(AD_Column_ID="A_Street",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsTransfer@!Y & @TenderType@=C | @TenderType@=K & @IsOnline@=Y",DisplayLength=20,
IsReadOnly=false,SeqNo=380,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,
Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1d241a94-c24e-6729-5457-b3dd07b3ce2d")
public static final String FIELDNAME_Payment_AccountStreet="1d241a94-c24e-6729-5457-b3dd07b3ce2d";

@XendraTrl(Identifier="e53f58c8-d6d8-7bab-f11a-0c90d46d736c")
public static String es_PE_FIELD_PartnerPayments_AccountStreet_Description="Calle de la Tarjeta de Crédito o el Poseedor de la cuenta";

@XendraTrl(Identifier="e53f58c8-d6d8-7bab-f11a-0c90d46d736c")
public static String es_PE_FIELD_PartnerPayments_AccountStreet_Help="La Dirección de la Calle de la Tarjeta de Crédito o poseedor de la cuenta";

@XendraTrl(Identifier="e53f58c8-d6d8-7bab-f11a-0c90d46d736c")
public static String es_PE_FIELD_PartnerPayments_AccountStreet_Name="Calle";

@XendraField(AD_Column_ID="A_Street",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e53f58c8-d6d8-7bab-f11a-0c90d46d736c")
public static final String FIELDNAME_PartnerPayments_AccountStreet="e53f58c8-d6d8-7bab-f11a-0c90d46d736c";

@XendraTrl(Identifier="328a3725-a2d8-e783-d334-bbf76dbeffb1")
public static String es_PE_FIELD_Payment_AccountStreet2_Description="Calle de la Tarjeta de Crédito o el Poseedor de la cuenta";

@XendraTrl(Identifier="328a3725-a2d8-e783-d334-bbf76dbeffb1")
public static String es_PE_FIELD_Payment_AccountStreet2_Help="La Dirección de la Calle de la Tarjeta de Crédito o poseedor de la cuenta";

@XendraTrl(Identifier="328a3725-a2d8-e783-d334-bbf76dbeffb1")
public static String es_PE_FIELD_Payment_AccountStreet2_Name="Calle";

@XendraField(AD_Column_ID="A_Street",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="328a3725-a2d8-e783-d334-bbf76dbeffb1")
public static final String FIELDNAME_Payment_AccountStreet2="328a3725-a2d8-e783-d334-bbf76dbeffb1";

@XendraTrl(Identifier="090246e4-4b13-a8da-a00a-30f10b5a516e")
public static String es_PE_COLUMN_A_Street_Name="Calle";

@XendraColumn(AD_Element_ID="ef375ac2-5149-dbad-bf90-0f49fed02bbc",ColumnName="A_Street",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@IsApproved@=Y",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",
ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="090246e4-4b13-a8da-a00a-30f10b5a516e",Synchronized="2017-08-05 16:53:59.0")
/** Column name A_Street */
public static final String COLUMNNAME_A_Street = "A_Street";
/** Set Account Zip/Postal.
@param A_Zip Zip Code of the Credit Card or Account Holder */
public void setA_Zip (String A_Zip)
{
if (A_Zip != null && A_Zip.length() > 20)
{
log.warning("Length > 20 - truncated");
A_Zip = A_Zip.substring(0,19);
}
set_Value (COLUMNNAME_A_Zip, A_Zip);
}
/** Get Account Zip/Postal.
@return Zip Code of the Credit Card or Account Holder */
public String getA_Zip() 
{
String value = (String)get_Value(COLUMNNAME_A_Zip);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="19f25323-55b7-60e2-913b-cb41cd92235a")
public static String es_PE_FIELD_Payment_AccountZipPostal_Description="Código Postal de la Tarjeta de Crédito ó el Poseedor de la cuenta";

@XendraTrl(Identifier="19f25323-55b7-60e2-913b-cb41cd92235a")
public static String es_PE_FIELD_Payment_AccountZipPostal_Help="El Código Postal de la Tarjeta de Crédito ó poseedor de la cuenta";

@XendraTrl(Identifier="19f25323-55b7-60e2-913b-cb41cd92235a")
public static String es_PE_FIELD_Payment_AccountZipPostal_Name="Código Postal";

@XendraField(AD_Column_ID="A_Zip",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsTransfer@!Y & @TenderType@=C | @TenderType@=K & @IsOnline@=Y",DisplayLength=11,
IsReadOnly=false,SeqNo=400,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,
Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="19f25323-55b7-60e2-913b-cb41cd92235a")
public static final String FIELDNAME_Payment_AccountZipPostal="19f25323-55b7-60e2-913b-cb41cd92235a";

@XendraTrl(Identifier="26239758-e059-4055-ea0f-bed3d840d2a3")
public static String es_PE_FIELD_PartnerPayments_AccountZipPostal_Description="Código Postal de la Tarjeta de Crédito ó el Poseedor de la cuenta";

@XendraTrl(Identifier="26239758-e059-4055-ea0f-bed3d840d2a3")
public static String es_PE_FIELD_PartnerPayments_AccountZipPostal_Help="El Código Postal de la Tarjeta de Crédito ó poseedor de la cuenta";

@XendraTrl(Identifier="26239758-e059-4055-ea0f-bed3d840d2a3")
public static String es_PE_FIELD_PartnerPayments_AccountZipPostal_Name="Código Postal";

@XendraField(AD_Column_ID="A_Zip",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="26239758-e059-4055-ea0f-bed3d840d2a3")
public static final String FIELDNAME_PartnerPayments_AccountZipPostal="26239758-e059-4055-ea0f-bed3d840d2a3";

@XendraTrl(Identifier="c12c4b9a-004c-1423-290f-475122ea224e")
public static String es_PE_FIELD_Payment_AccountZipPostal2_Description="Código Postal de la Tarjeta de Crédito ó el Poseedor de la cuenta";

@XendraTrl(Identifier="c12c4b9a-004c-1423-290f-475122ea224e")
public static String es_PE_FIELD_Payment_AccountZipPostal2_Help="El Código Postal de la Tarjeta de Crédito ó poseedor de la cuenta";

@XendraTrl(Identifier="c12c4b9a-004c-1423-290f-475122ea224e")
public static String es_PE_FIELD_Payment_AccountZipPostal2_Name="Código Postal";

@XendraField(AD_Column_ID="A_Zip",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c12c4b9a-004c-1423-290f-475122ea224e")
public static final String FIELDNAME_Payment_AccountZipPostal2="c12c4b9a-004c-1423-290f-475122ea224e";

@XendraTrl(Identifier="abeea23e-ac7a-5e5f-737f-83ee7fa9d800")
public static String es_PE_COLUMN_A_Zip_Name="Código Postal";

@XendraColumn(AD_Element_ID="72061340-1a35-bf43-78af-738caee1cb49",ColumnName="A_Zip",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@IsApproved@=Y",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",
ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="abeea23e-ac7a-5e5f-737f-83ee7fa9d800",Synchronized="2017-08-05 16:53:59.0")
/** Column name A_Zip */
public static final String COLUMNNAME_A_Zip = "A_Zip";
/** Set Activity.
@param C_Activity_ID Business Activity */
public void setC_Activity_ID (int C_Activity_ID)
{
if (C_Activity_ID <= 0) set_Value (COLUMNNAME_C_Activity_ID, null);
 else 
set_Value (COLUMNNAME_C_Activity_ID, Integer.valueOf(C_Activity_ID));
}
/** Get Activity.
@return Business Activity */
public int getC_Activity_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Activity_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="dc036323-1253-6c21-662c-b99bf93b8576")
public static String es_PE_FIELD_Payment_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="dc036323-1253-6c21-662c-b99bf93b8576")
public static String es_PE_FIELD_Payment_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraTrl(Identifier="dc036323-1253-6c21-662c-b99bf93b8576")
public static String es_PE_FIELD_Payment_Activity_Name="Tipo de Gasto";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsTransfer@!Y & @$Element_AY@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=170,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="dc036323-1253-6c21-662c-b99bf93b8576")
public static final String FIELDNAME_Payment_Activity="dc036323-1253-6c21-662c-b99bf93b8576";

@XendraTrl(Identifier="814b7d2f-768a-9365-86cd-de5425459684")
public static String es_PE_FIELD_PartnerPayments_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="814b7d2f-768a-9365-86cd-de5425459684")
public static String es_PE_FIELD_PartnerPayments_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraTrl(Identifier="814b7d2f-768a-9365-86cd-de5425459684")
public static String es_PE_FIELD_PartnerPayments_Activity_Name="Tipo de Gasto";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="814b7d2f-768a-9365-86cd-de5425459684")
public static final String FIELDNAME_PartnerPayments_Activity="814b7d2f-768a-9365-86cd-de5425459684";

@XendraTrl(Identifier="dfb154e3-c392-9e00-fc7e-64c3d49034a4")
public static String es_PE_FIELD_Payment_Activity2_Description="Actividad de Negocio";

@XendraTrl(Identifier="dfb154e3-c392-9e00-fc7e-64c3d49034a4")
public static String es_PE_FIELD_Payment_Activity2_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraTrl(Identifier="dfb154e3-c392-9e00-fc7e-64c3d49034a4")
public static String es_PE_FIELD_Payment_Activity2_Name="Tipo de Gasto";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dfb154e3-c392-9e00-fc7e-64c3d49034a4")
public static final String FIELDNAME_Payment_Activity2="dfb154e3-c392-9e00-fc7e-64c3d49034a4";

@XendraTrl(Identifier="e4d152d6-a61f-8069-2ba1-e488c7c35bd6")
public static String es_PE_COLUMN_C_Activity_ID_Name="Tipo de Gasto";

@XendraColumn(AD_Element_ID="bfeadbb3-d866-26e3-8eee-3e2fdf0ff753",ColumnName="C_Activity_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e4d152d6-a61f-8069-2ba1-e488c7c35bd6",
Synchronized="2017-08-05 16:53:59.0")
/** Column name C_Activity_ID */
public static final String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
/** Set Cashed.
@param Cashed Cashed */
public void setCashed (boolean Cashed)
{
set_Value (COLUMNNAME_Cashed, Boolean.valueOf(Cashed));
}
/** Get Cashed.
@return Cashed */
public boolean isCashed() 
{
Object oo = get_Value(COLUMNNAME_Cashed);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f13d3884-552c-288b-22ec-99657f168923")
public static String es_PE_FIELD_Payment_Cashed_Name="cashed";
@XendraField(AD_Column_ID="Cashed",
IsCentrallyMaintained=true,AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",
IsDisplayed=false,DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f13d3884-552c-288b-22ec-99657f168923")
public static final String FIELDNAME_Payment_Cashed="f13d3884-552c-288b-22ec-99657f168923";

@XendraTrl(Identifier="5ec164c9-dcf4-e0a3-bcf1-db3fe48eb775")
public static String es_PE_COLUMN_Cashed_Name="cashed";

@XendraColumn(AD_Element_ID="89dff811-0179-e222-762c-284cfbae4f72",ColumnName="Cashed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5ec164c9-dcf4-e0a3-bcf1-db3fe48eb775",
Synchronized="2017-08-05 16:53:59.0")
/** Column name Cashed */
public static final String COLUMNNAME_Cashed = "Cashed";
/** Set Bank Account Document.
@param C_BankAccountDoc_ID Checks, Transfers, etc. */
public void setC_BankAccountDoc_ID (int C_BankAccountDoc_ID)
{
if (C_BankAccountDoc_ID <= 0) set_Value (COLUMNNAME_C_BankAccountDoc_ID, null);
 else 
set_Value (COLUMNNAME_C_BankAccountDoc_ID, Integer.valueOf(C_BankAccountDoc_ID));
}
/** Get Bank Account Document.
@return Checks, Transfers, etc. */
public int getC_BankAccountDoc_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BankAccountDoc_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="458c5f1d-4336-09c7-0722-f53050a66c7b")
public static String es_PE_FIELD_Payment_BankAccountDocument_Description="Cheques; transferencias; etc.";

@XendraTrl(Identifier="458c5f1d-4336-09c7-0722-f53050a66c7b")
public static String es_PE_FIELD_Payment_BankAccountDocument_Help="Documentos bancarios que usted genera ó monitorea";

@XendraTrl(Identifier="458c5f1d-4336-09c7-0722-f53050a66c7b")
public static String es_PE_FIELD_Payment_BankAccountDocument_Name="Doc. Cuenta Bancaria";

@XendraField(AD_Column_ID="C_BankAccountDoc_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=310,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="458c5f1d-4336-09c7-0722-f53050a66c7b")
public static final String FIELDNAME_Payment_BankAccountDocument="458c5f1d-4336-09c7-0722-f53050a66c7b";

@XendraTrl(Identifier="f0d40a95-aef5-5918-4230-b2bc2912f514")
public static String es_PE_COLUMN_C_BankAccountDoc_ID_Name="Documento De la Cuenta Bancaria";

@XendraColumn(AD_Element_ID="e4a214af-89c0-0759-f40d-ffee2434b4ce",
ColumnName="C_BankAccountDoc_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutPayment.BankAccountDoc",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f0d40a95-aef5-5918-4230-b2bc2912f514",
Synchronized="2017-08-05 16:53:59.0")
/** Column name C_BankAccountDoc_ID */
public static final String COLUMNNAME_C_BankAccountDoc_ID = "C_BankAccountDoc_ID";
/** Set Bank Account.
@param C_BankAccount_ID Account at the Bank */
public void setC_BankAccount_ID (int C_BankAccount_ID)
{
if (C_BankAccount_ID < 1) throw new IllegalArgumentException ("C_BankAccount_ID is mandatory.");
set_Value (COLUMNNAME_C_BankAccount_ID, Integer.valueOf(C_BankAccount_ID));
}
/** Get Bank Account.
@return Account at the Bank */
public int getC_BankAccount_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BankAccount_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0ddf8ade-46e5-cb16-c661-d4125205c262")
public static String es_PE_FIELD_Payment_BankAccount_Description="Cuenta bancaria";

@XendraTrl(Identifier="0ddf8ade-46e5-cb16-c661-d4125205c262")
public static String es_PE_FIELD_Payment_BankAccount_Help="La cuenta bancaria identifica una cuenta en este banco";

@XendraTrl(Identifier="0ddf8ade-46e5-cb16-c661-d4125205c262")
public static String es_PE_FIELD_Payment_BankAccount_Name="Cuenta Bancaria";

@XendraField(AD_Column_ID="C_BankAccount_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0ddf8ade-46e5-cb16-c661-d4125205c262")
public static final String FIELDNAME_Payment_BankAccount="0ddf8ade-46e5-cb16-c661-d4125205c262";

@XendraTrl(Identifier="419b100c-23dd-4dc2-560f-bc85e0c8ee9b")
public static String es_PE_FIELD_PartnerPayments_BankAccount_Description="Cuenta bancaria";

@XendraTrl(Identifier="419b100c-23dd-4dc2-560f-bc85e0c8ee9b")
public static String es_PE_FIELD_PartnerPayments_BankAccount_Help="La cuenta bancaria identifica una cuenta en este banco";

@XendraTrl(Identifier="419b100c-23dd-4dc2-560f-bc85e0c8ee9b")
public static String es_PE_FIELD_PartnerPayments_BankAccount_Name="Cuenta Bancaria";

@XendraField(AD_Column_ID="C_BankAccount_ID",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="419b100c-23dd-4dc2-560f-bc85e0c8ee9b")
public static final String FIELDNAME_PartnerPayments_BankAccount="419b100c-23dd-4dc2-560f-bc85e0c8ee9b";

@XendraTrl(Identifier="29eaddaa-7c6d-a3dc-9d68-0d5e713196d9")
public static String es_PE_FIELD_Payment_BankAccount2_Description="Cuenta bancaria";

@XendraTrl(Identifier="29eaddaa-7c6d-a3dc-9d68-0d5e713196d9")
public static String es_PE_FIELD_Payment_BankAccount2_Help="La cuenta bancaria identifica una cuenta en este banco";

@XendraTrl(Identifier="29eaddaa-7c6d-a3dc-9d68-0d5e713196d9")
public static String es_PE_FIELD_Payment_BankAccount2_Name="Cuenta Bancaria";

@XendraField(AD_Column_ID="C_BankAccount_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="29eaddaa-7c6d-a3dc-9d68-0d5e713196d9")
public static final String FIELDNAME_Payment_BankAccount2="29eaddaa-7c6d-a3dc-9d68-0d5e713196d9";

@XendraTrl(Identifier="6f41d367-3daa-06b9-9add-90be451dac53")
public static String es_PE_COLUMN_C_BankAccount_ID_Name="Cuenta Bancaria";

@XendraColumn(AD_Element_ID="5a03bc67-316f-bd8c-9e68-b009ad1b290b",ColumnName="C_BankAccount_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="97425762-0a99-5f8b-5219-df2cd66343cd",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutPayment.BankAccount",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6f41d367-3daa-06b9-9add-90be451dac53",
Synchronized="2017-08-05 16:53:59.0")
/** Column name C_BankAccount_ID */
public static final String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
/** Set C_BOEConfirm_ID.
@param C_BOEConfirm_ID C_BOEConfirm_ID */
public void setC_BOEConfirm_ID (int C_BOEConfirm_ID)
{
if (C_BOEConfirm_ID <= 0) set_Value (COLUMNNAME_C_BOEConfirm_ID, null);
 else 
set_Value (COLUMNNAME_C_BOEConfirm_ID, Integer.valueOf(C_BOEConfirm_ID));
}
/** Get C_BOEConfirm_ID.
@return C_BOEConfirm_ID */
public int getC_BOEConfirm_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BOEConfirm_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="eb950c7b-b0c1-22f7-a221-0bdec5bc0963")
public static String es_PE_FIELD_Payment_C_BOEConfirm_ID_Name="Confirmación Planilla";

@XendraField(AD_Column_ID="C_BOEConfirm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=690,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eb950c7b-b0c1-22f7-a221-0bdec5bc0963")
public static final String FIELDNAME_Payment_C_BOEConfirm_ID="eb950c7b-b0c1-22f7-a221-0bdec5bc0963";

@XendraTrl(Identifier="24e2c3ce-ef68-99af-62a2-68aa98b93768")
public static String es_PE_COLUMN_C_BOEConfirm_ID_Name="c_boeconfirm_id";

@XendraColumn(AD_Element_ID="1c623ee3-39bb-c6fc-297b-f7c03061acb4",ColumnName="C_BOEConfirm_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="24e2c3ce-ef68-99af-62a2-68aa98b93768",
Synchronized="2017-08-05 16:53:59.0")
/** Column name C_BOEConfirm_ID */
public static final String COLUMNNAME_C_BOEConfirm_ID = "C_BOEConfirm_ID";
/** Set Bill Of Exchange.
@param C_BOE_ID Bill Of Exchange Identifier */
public void setC_BOE_ID (int C_BOE_ID)
{
if (C_BOE_ID <= 0) set_Value (COLUMNNAME_C_BOE_ID, null);
 else 
set_Value (COLUMNNAME_C_BOE_ID, Integer.valueOf(C_BOE_ID));
}
/** Get Bill Of Exchange.
@return Bill Of Exchange Identifier */
public int getC_BOE_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BOE_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="086da401-886c-cdfd-01f7-ff1fa675d606")
public static String es_PE_FIELD_Payment_BillOfExchange_Description="Identificador de la Letra de Cambio ";

@XendraTrl(Identifier="086da401-886c-cdfd-01f7-ff1fa675d606")
public static String es_PE_FIELD_Payment_BillOfExchange_Help="El docuemnto Letra de Cambio";

@XendraTrl(Identifier="086da401-886c-cdfd-01f7-ff1fa675d606")
public static String es_PE_FIELD_Payment_BillOfExchange_Name="Letra de Cambio";

@XendraField(AD_Column_ID="C_BOE_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsTransfer@!Y",DisplayLength=10,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="086da401-886c-cdfd-01f7-ff1fa675d606")
public static final String FIELDNAME_Payment_BillOfExchange="086da401-886c-cdfd-01f7-ff1fa675d606";

@XendraTrl(Identifier="2f6c6c2c-a344-5d88-51c8-642d7d4a32a5")
public static String es_PE_COLUMN_C_BOE_ID_Name="Letra de Cambio";

@XendraColumn(AD_Element_ID="7dfa9e28-2055-cea9-fa94-b5ebdac44420",ColumnName="C_BOE_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2f6c6c2c-a344-5d88-51c8-642d7d4a32a5",
Synchronized="2017-08-05 16:53:59.0")
/** Column name C_BOE_ID */
public static final String COLUMNNAME_C_BOE_ID = "C_BOE_ID";
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID < 1) throw new IllegalArgumentException ("C_BPartner_ID is mandatory.");
set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
}
/** Get Business Partner .
@return Identifies a Business Partner */
public int getC_BPartner_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="52dcf040-0785-9aa5-9e62-ae5dfecea63b")
public static String es_PE_FIELD_Payment_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="52dcf040-0785-9aa5-9e62-ae5dfecea63b")
public static String es_PE_FIELD_Payment_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="52dcf040-0785-9aa5-9e62-ae5dfecea63b")
public static String es_PE_FIELD_Payment_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="52dcf040-0785-9aa5-9e62-ae5dfecea63b")
public static final String FIELDNAME_Payment_BusinessPartner="52dcf040-0785-9aa5-9e62-ae5dfecea63b";

@XendraTrl(Identifier="7335dcb1-8ff5-7887-864a-6bb6b17a0e96")
public static String es_PE_FIELD_PartnerPayments_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="7335dcb1-8ff5-7887-864a-6bb6b17a0e96")
public static String es_PE_FIELD_PartnerPayments_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="7335dcb1-8ff5-7887-864a-6bb6b17a0e96")
public static String es_PE_FIELD_PartnerPayments_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7335dcb1-8ff5-7887-864a-6bb6b17a0e96")
public static final String FIELDNAME_PartnerPayments_BusinessPartner="7335dcb1-8ff5-7887-864a-6bb6b17a0e96";

@XendraTrl(Identifier="eae42ca0-0e33-60e2-bf90-52729cee8048")
public static String es_PE_FIELD_Payment_BusinessPartner2_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="eae42ca0-0e33-60e2-bf90-52729cee8048")
public static String es_PE_FIELD_Payment_BusinessPartner2_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="eae42ca0-0e33-60e2-bf90-52729cee8048")
public static String es_PE_FIELD_Payment_BusinessPartner2_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eae42ca0-0e33-60e2-bf90-52729cee8048")
public static final String FIELDNAME_Payment_BusinessPartner2="eae42ca0-0e33-60e2-bf90-52729cee8048";

@XendraTrl(Identifier="fb8aba21-80f5-aa87-2cb1-9a309d459bc3")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="06fdbbe9-e1c4-3ee4-4a9d-73d1a990cc42",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutPayment.bPartner",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fb8aba21-80f5-aa87-2cb1-9a309d459bc3",
Synchronized="2017-08-05 16:53:59.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Partner Bank Account.
@param C_BP_BankAccount_ID Bank Account of the Business Partner */
public void setC_BP_BankAccount_ID (int C_BP_BankAccount_ID)
{
if (C_BP_BankAccount_ID <= 0) set_Value (COLUMNNAME_C_BP_BankAccount_ID, null);
 else 
set_Value (COLUMNNAME_C_BP_BankAccount_ID, Integer.valueOf(C_BP_BankAccount_ID));
}
/** Get Partner Bank Account.
@return Bank Account of the Business Partner */
public int getC_BP_BankAccount_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BP_BankAccount_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="715fcd2c-07e8-538f-cd11-5d275dac049e")
public static String es_PE_FIELD_Payment_PartnerBankAccount_Description="Cuenta bancaria del socio del negocio";

@XendraTrl(Identifier="715fcd2c-07e8-538f-cd11-5d275dac049e")
public static String es_PE_FIELD_Payment_PartnerBankAccount_Help="La cuenta bancaria del socio identifica la cuenta bancaria a ser usada por este socio de negocio";

@XendraTrl(Identifier="715fcd2c-07e8-538f-cd11-5d275dac049e")
public static String es_PE_FIELD_Payment_PartnerBankAccount_Name="Cuenta Bancaria del Socio";

@XendraField(AD_Column_ID="C_BP_BankAccount_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="715fcd2c-07e8-538f-cd11-5d275dac049e")
public static final String FIELDNAME_Payment_PartnerBankAccount="715fcd2c-07e8-538f-cd11-5d275dac049e";

@XendraTrl(Identifier="dc269039-7fd6-94da-4401-17a4705a453e")
public static String es_PE_FIELD_PartnerPayments_PartnerBankAccount_Description="Cuenta bancaria del socio del negocio";

@XendraTrl(Identifier="dc269039-7fd6-94da-4401-17a4705a453e")
public static String es_PE_FIELD_PartnerPayments_PartnerBankAccount_Help="La cuenta bancaria del socio identifica la cuenta bancaria a ser usada por este socio de negocio";

@XendraTrl(Identifier="dc269039-7fd6-94da-4401-17a4705a453e")
public static String es_PE_FIELD_PartnerPayments_PartnerBankAccount_Name="Cuenta Bancaria del Socio";

@XendraField(AD_Column_ID="C_BP_BankAccount_ID",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dc269039-7fd6-94da-4401-17a4705a453e")
public static final String FIELDNAME_PartnerPayments_PartnerBankAccount="dc269039-7fd6-94da-4401-17a4705a453e";

@XendraTrl(Identifier="bbae75ef-2439-63bf-5c49-be9782ceb70b")
public static String es_PE_FIELD_Payment_PartnerBankAccount2_Description="Cuenta bancaria del socio del negocio";

@XendraTrl(Identifier="bbae75ef-2439-63bf-5c49-be9782ceb70b")
public static String es_PE_FIELD_Payment_PartnerBankAccount2_Help="La cuenta bancaria del socio identifica la cuenta bancaria a ser usada por este socio de negocio";

@XendraTrl(Identifier="bbae75ef-2439-63bf-5c49-be9782ceb70b")
public static String es_PE_FIELD_Payment_PartnerBankAccount2_Name="Cuenta Bancaria del Socio";

@XendraField(AD_Column_ID="C_BP_BankAccount_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bbae75ef-2439-63bf-5c49-be9782ceb70b")
public static final String FIELDNAME_Payment_PartnerBankAccount2="bbae75ef-2439-63bf-5c49-be9782ceb70b";

@XendraTrl(Identifier="00ca05a9-ae69-a34d-32da-9e479b231802")
public static String es_PE_COLUMN_C_BP_BankAccount_ID_Name="Cuenta Bancaria del Socio";

@XendraColumn(AD_Element_ID="3c4f5cea-368f-2a75-7414-a8d02110104b",
ColumnName="C_BP_BankAccount_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="00ca05a9-ae69-a34d-32da-9e479b231802",Synchronized="2017-08-05 16:53:59.0")
/** Column name C_BP_BankAccount_ID */
public static final String COLUMNNAME_C_BP_BankAccount_ID = "C_BP_BankAccount_ID";
/** Set Campaign.
@param C_Campaign_ID Marketing Campaign */
public void setC_Campaign_ID (int C_Campaign_ID)
{
if (C_Campaign_ID <= 0) set_Value (COLUMNNAME_C_Campaign_ID, null);
 else 
set_Value (COLUMNNAME_C_Campaign_ID, Integer.valueOf(C_Campaign_ID));
}
/** Get Campaign.
@return Marketing Campaign */
public int getC_Campaign_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Campaign_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e637cd3a-a3a0-6b00-1fea-14faac3b8806")
public static String es_PE_FIELD_Payment_Campaign_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="e637cd3a-a3a0-6b00-1fea-14faac3b8806")
public static String es_PE_FIELD_Payment_Campaign_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraTrl(Identifier="e637cd3a-a3a0-6b00-1fea-14faac3b8806")
public static String es_PE_FIELD_Payment_Campaign_Name="Campaña";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsTransfer@!Y & @$Element_MC@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="e637cd3a-a3a0-6b00-1fea-14faac3b8806")
public static final String FIELDNAME_Payment_Campaign="e637cd3a-a3a0-6b00-1fea-14faac3b8806";

@XendraTrl(Identifier="3e160e66-3277-7aaf-77c1-e2f3a613efa1")
public static String es_PE_FIELD_PartnerPayments_Campaign_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="3e160e66-3277-7aaf-77c1-e2f3a613efa1")
public static String es_PE_FIELD_PartnerPayments_Campaign_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraTrl(Identifier="3e160e66-3277-7aaf-77c1-e2f3a613efa1")
public static String es_PE_FIELD_PartnerPayments_Campaign_Name="Campaña";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3e160e66-3277-7aaf-77c1-e2f3a613efa1")
public static final String FIELDNAME_PartnerPayments_Campaign="3e160e66-3277-7aaf-77c1-e2f3a613efa1";

@XendraTrl(Identifier="592c3b86-3254-4494-29fa-16dd5e6a2df1")
public static String es_PE_FIELD_Payment_Campaign2_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="592c3b86-3254-4494-29fa-16dd5e6a2df1")
public static String es_PE_FIELD_Payment_Campaign2_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraTrl(Identifier="592c3b86-3254-4494-29fa-16dd5e6a2df1")
public static String es_PE_FIELD_Payment_Campaign2_Name="Campaña";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="592c3b86-3254-4494-29fa-16dd5e6a2df1")
public static final String FIELDNAME_Payment_Campaign2="592c3b86-3254-4494-29fa-16dd5e6a2df1";

@XendraTrl(Identifier="a732739c-7198-8115-87e6-2a94f598f226")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaña";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a732739c-7198-8115-87e6-2a94f598f226",
Synchronized="2017-08-05 16:53:59.0")
/** Column name C_Campaign_ID */
public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
/** Set Cash Book.
@param C_CashBook_ID Cash Book for recording petty cash transactions */
public void setC_CashBook_ID (int C_CashBook_ID)
{
if (C_CashBook_ID <= 0) set_Value (COLUMNNAME_C_CashBook_ID, null);
 else 
set_Value (COLUMNNAME_C_CashBook_ID, Integer.valueOf(C_CashBook_ID));
}
/** Get Cash Book.
@return Cash Book for recording petty cash transactions */
public int getC_CashBook_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_CashBook_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="05b62a45-2573-de21-6486-bbcce1f61bb2")
public static String es_PE_FIELD_Payment_CashBook_Description="Libro de efectivo para registrar transacciones de caja chica.";

@XendraTrl(Identifier="05b62a45-2573-de21-6486-bbcce1f61bb2")
public static String es_PE_FIELD_Payment_CashBook_Help="El libro de efectivo identifica un libro de efectivo único. El libro de efectivo se usa para registrar transacciones de efectivo.";

@XendraTrl(Identifier="05b62a45-2573-de21-6486-bbcce1f61bb2")
public static String es_PE_FIELD_Payment_CashBook_Name="Libro de Efectivo";

@XendraField(AD_Column_ID="C_CashBook_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="05b62a45-2573-de21-6486-bbcce1f61bb2")
public static final String FIELDNAME_Payment_CashBook="05b62a45-2573-de21-6486-bbcce1f61bb2";

@XendraTrl(Identifier="83e27edc-35b9-9f77-6dc4-b4139c67bf1b")
public static String es_PE_COLUMN_C_CashBook_ID_Name="Libro de Efectivo";

@XendraColumn(AD_Element_ID="30688c51-d454-8026-32c4-990b9ea9ddf2",ColumnName="C_CashBook_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="83e27edc-35b9-9f77-6dc4-b4139c67bf1b",
Synchronized="2017-08-05 16:53:59.0")
/** Column name C_CashBook_ID */
public static final String COLUMNNAME_C_CashBook_ID = "C_CashBook_ID";
/** Set Cash Flow Category.
@param C_Cashflow_Group_ID Cash Flow Category  */
public void setC_Cashflow_Group_ID (int C_Cashflow_Group_ID)
{
if (C_Cashflow_Group_ID <= 0) set_Value (COLUMNNAME_C_Cashflow_Group_ID, null);
 else 
set_Value (COLUMNNAME_C_Cashflow_Group_ID, Integer.valueOf(C_Cashflow_Group_ID));
}
/** Get Cash Flow Category.
@return Cash Flow Category  */
public int getC_Cashflow_Group_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Cashflow_Group_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="37ecd849-f3ce-c6e3-7934-febc1610fd06")
public static String es_PE_FIELD_Payment_CashFlowCategory_Description="Elija la categoria de flujo de caja a la que pertenece este pago";

@XendraTrl(Identifier="37ecd849-f3ce-c6e3-7934-febc1610fd06")
public static String es_PE_FIELD_Payment_CashFlowCategory_Help="Esta opcion nos permitira agrupar a los pagos por categoria de tal forma que podamos sacar el Flujo de caja real y proyectado";

@XendraTrl(Identifier="37ecd849-f3ce-c6e3-7934-febc1610fd06")
public static String es_PE_FIELD_Payment_CashFlowCategory_Name="Flujo de Caja";

@XendraField(AD_Column_ID="C_Cashflow_Group_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsTransfer@!Y",DisplayLength=14,IsReadOnly=false,SeqNo=180,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="37ecd849-f3ce-c6e3-7934-febc1610fd06")
public static final String FIELDNAME_Payment_CashFlowCategory="37ecd849-f3ce-c6e3-7934-febc1610fd06";

@XendraTrl(Identifier="d2d8850a-e4cc-74a1-19e0-8e97c0a7c829")
public static String es_PE_COLUMN_C_Cashflow_Group_ID_Name="Cash Flow Category";

@XendraColumn(AD_Element_ID="d6ea8b87-4b95-2b42-c8d2-26b382da1f6c",
ColumnName="C_Cashflow_Group_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d2d8850a-e4cc-74a1-19e0-8e97c0a7c829",Synchronized="2017-08-05 16:53:59.0")
/** Column name C_Cashflow_Group_ID */
public static final String COLUMNNAME_C_Cashflow_Group_ID = "C_Cashflow_Group_ID";
/** Set Cash Journal.
@param C_Cash_ID Cash Journal */
public void setC_Cash_ID (int C_Cash_ID)
{
if (C_Cash_ID <= 0) set_Value (COLUMNNAME_C_Cash_ID, null);
 else 
set_Value (COLUMNNAME_C_Cash_ID, Integer.valueOf(C_Cash_ID));
}
/** Get Cash Journal.
@return Cash Journal */
public int getC_Cash_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Cash_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f0f42099-ddb0-aef7-19c2-c636c5aa7992")
public static String es_PE_FIELD_Payment_CashJournal_Description="Diario de efectivo";

@XendraTrl(Identifier="f0f42099-ddb0-aef7-19c2-c636c5aa7992")
public static String es_PE_FIELD_Payment_CashJournal_Help="El diario de efectivo identifica únicamente un diario de efectivo. El diario de efectivo registrará las transacciones para la cuenta de bancos";

@XendraTrl(Identifier="f0f42099-ddb0-aef7-19c2-c636c5aa7992")
public static String es_PE_FIELD_Payment_CashJournal_Name="Diario de Efectivo";

@XendraField(AD_Column_ID="C_Cash_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsTransfer@!Y",DisplayLength=10,IsReadOnly=false,SeqNo=150,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f0f42099-ddb0-aef7-19c2-c636c5aa7992")
public static final String FIELDNAME_Payment_CashJournal="f0f42099-ddb0-aef7-19c2-c636c5aa7992";

@XendraTrl(Identifier="c2fc091e-087f-209e-145e-69d496093c6b")
public static String es_PE_COLUMN_C_Cash_ID_Name="Diario de Efectivo";

@XendraColumn(AD_Element_ID="b43be1cd-0c26-1fad-b5d8-421dd3b1146e",ColumnName="C_Cash_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c2fc091e-087f-209e-145e-69d496093c6b",
Synchronized="2017-08-05 16:53:59.0")
/** Column name C_Cash_ID */
public static final String COLUMNNAME_C_Cash_ID = "C_Cash_ID";
/** Set Charge.
@param C_Charge_ID Additional document charges */
public void setC_Charge_ID (int C_Charge_ID)
{
if (C_Charge_ID <= 0) set_Value (COLUMNNAME_C_Charge_ID, null);
 else 
set_Value (COLUMNNAME_C_Charge_ID, Integer.valueOf(C_Charge_ID));
}
/** Get Charge.
@return Additional document charges */
public int getC_Charge_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Charge_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7616ee84-6857-e099-87b0-2bd94688519b")
public static String es_PE_FIELD_Payment_Charge_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="7616ee84-6857-e099-87b0-2bd94688519b")
public static String es_PE_FIELD_Payment_Charge_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraTrl(Identifier="7616ee84-6857-e099-87b0-2bd94688519b")
public static String es_PE_FIELD_Payment_Charge_Name="Cargo";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@IsTransfer@!Y",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="7616ee84-6857-e099-87b0-2bd94688519b")
public static final String FIELDNAME_Payment_Charge="7616ee84-6857-e099-87b0-2bd94688519b";

@XendraTrl(Identifier="f1ffc7ea-487d-9438-c907-18e4436ed253")
public static String es_PE_FIELD_PartnerPayments_Charge_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="f1ffc7ea-487d-9438-c907-18e4436ed253")
public static String es_PE_FIELD_PartnerPayments_Charge_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraTrl(Identifier="f1ffc7ea-487d-9438-c907-18e4436ed253")
public static String es_PE_FIELD_PartnerPayments_Charge_Name="Cargo";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f1ffc7ea-487d-9438-c907-18e4436ed253")
public static final String FIELDNAME_PartnerPayments_Charge="f1ffc7ea-487d-9438-c907-18e4436ed253";

@XendraTrl(Identifier="ab5c1e63-b055-0497-c2be-3f6f8fe8ef04")
public static String es_PE_FIELD_Payment_Charge2_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="ab5c1e63-b055-0497-c2be-3f6f8fe8ef04")
public static String es_PE_FIELD_Payment_Charge2_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraTrl(Identifier="ab5c1e63-b055-0497-c2be-3f6f8fe8ef04")
public static String es_PE_FIELD_Payment_Charge2_Name="Cargo";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ab5c1e63-b055-0497-c2be-3f6f8fe8ef04")
public static final String FIELDNAME_Payment_Charge2="ab5c1e63-b055-0497-c2be-3f6f8fe8ef04";

@XendraTrl(Identifier="ce69dc14-abac-591a-b0ae-426d8d0a0f28")
public static String es_PE_COLUMN_C_Charge_ID_Name="Cargo";

@XendraColumn(AD_Element_ID="d7e2fc48-a26e-4ded-ea44-fe15849a7883",ColumnName="C_Charge_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@C_Invoice_ID@!0 | @C_Order_ID@!0",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutPayment.charge",VFormat="",ValueMin="",ValueMax="",Version="1",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ce69dc14-abac-591a-b0ae-426d8d0a0f28",
Synchronized="2017-08-05 16:53:59.0")
/** Column name C_Charge_ID */
public static final String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
/** Set Currency Type.
@param C_ConversionType_ID Currency Conversion Rate Type */
public void setC_ConversionType_ID (int C_ConversionType_ID)
{
if (C_ConversionType_ID <= 0) set_Value (COLUMNNAME_C_ConversionType_ID, null);
 else 
set_Value (COLUMNNAME_C_ConversionType_ID, Integer.valueOf(C_ConversionType_ID));
}
/** Get Currency Type.
@return Currency Conversion Rate Type */
public int getC_ConversionType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ConversionType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f752008d-7c3f-7c9c-aec3-4ce1b7c2c2b4")
public static String es_PE_FIELD_Payment_CurrencyType_Description="Tipo de índice de conversión de moneda ";

@XendraTrl(Identifier="f752008d-7c3f-7c9c-aec3-4ce1b7c2c2b4")
public static String es_PE_FIELD_Payment_CurrencyType_Help="El tipo del índice de conversión de monedas le deja definir diversos tipos de tarifas, tarifas ej. del punto, corporativas y/o de Ventas/Compras.";

@XendraTrl(Identifier="f752008d-7c3f-7c9c-aec3-4ce1b7c2c2b4")
public static String es_PE_FIELD_Payment_CurrencyType_Name="Tipo de Moneda";

@XendraField(AD_Column_ID="C_ConversionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@C_Currency_ID@!@$C_Currency_ID@",DisplayLength=14,IsReadOnly=false,SeqNo=240,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f752008d-7c3f-7c9c-aec3-4ce1b7c2c2b4")
public static final String FIELDNAME_Payment_CurrencyType="f752008d-7c3f-7c9c-aec3-4ce1b7c2c2b4";

@XendraTrl(Identifier="d6a4cde6-f5d3-db62-6525-331b7df9482e")
public static String es_PE_FIELD_PartnerPayments_CurrencyType_Description="Tipo de índice de conversión de moneda ";

@XendraTrl(Identifier="d6a4cde6-f5d3-db62-6525-331b7df9482e")
public static String es_PE_FIELD_PartnerPayments_CurrencyType_Help="El tipo del índice de conversión de monedas le deja definir diversos tipos de tarifas, tarifas ej. del punto, corporativas y/o de Ventas/Compras.";

@XendraTrl(Identifier="d6a4cde6-f5d3-db62-6525-331b7df9482e")
public static String es_PE_FIELD_PartnerPayments_CurrencyType_Name="Tipo de Moneda";

@XendraField(AD_Column_ID="C_ConversionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d6a4cde6-f5d3-db62-6525-331b7df9482e")
public static final String FIELDNAME_PartnerPayments_CurrencyType="d6a4cde6-f5d3-db62-6525-331b7df9482e";

@XendraTrl(Identifier="583c6af7-8959-f178-fddd-31814d963726")
public static String es_PE_FIELD_Payment_CurrencyType2_Description="Tipo de índice de conversión de moneda ";

@XendraTrl(Identifier="583c6af7-8959-f178-fddd-31814d963726")
public static String es_PE_FIELD_Payment_CurrencyType2_Help="El tipo del índice de conversión de monedas le deja definir diversos tipos de tarifas, tarifas ej. del punto, corporativas y/o de Ventas/Compras.";

@XendraTrl(Identifier="583c6af7-8959-f178-fddd-31814d963726")
public static String es_PE_FIELD_Payment_CurrencyType2_Name="Tipo de Moneda";

@XendraField(AD_Column_ID="C_ConversionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="583c6af7-8959-f178-fddd-31814d963726")
public static final String FIELDNAME_Payment_CurrencyType2="583c6af7-8959-f178-fddd-31814d963726";

@XendraTrl(Identifier="bcac4c3a-e374-d937-d4fd-2757c860a092")
public static String es_PE_COLUMN_C_ConversionType_ID_Name="Tipo de Moneda";

@XendraColumn(AD_Element_ID="66f5d039-c94d-0957-487b-eb3118bd7719",
ColumnName="C_ConversionType_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutPayment.amounts",VFormat="",ValueMin="",ValueMax="",Version="1",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bcac4c3a-e374-d937-d4fd-2757c860a092",
Synchronized="2017-08-05 16:53:59.0")
/** Column name C_ConversionType_ID */
public static final String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID < 1) throw new IllegalArgumentException ("C_Currency_ID is mandatory.");
set_Value (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
}
/** Get Currency.
@return The Currency for this record */
public int getC_Currency_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="45bb988a-515f-b4c2-e68b-25310eeaab98")
public static String es_PE_FIELD_Payment_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="45bb988a-515f-b4c2-e68b-25310eeaab98")
public static String es_PE_FIELD_Payment_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="45bb988a-515f-b4c2-e68b-25310eeaab98")
public static String es_PE_FIELD_Payment_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="45bb988a-515f-b4c2-e68b-25310eeaab98")
public static final String FIELDNAME_Payment_Currency="45bb988a-515f-b4c2-e68b-25310eeaab98";

@XendraTrl(Identifier="bc399afd-73e0-5a2d-1d90-ee54bb508e22")
public static String es_PE_FIELD_PartnerPayments_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="bc399afd-73e0-5a2d-1d90-ee54bb508e22")
public static String es_PE_FIELD_PartnerPayments_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="bc399afd-73e0-5a2d-1d90-ee54bb508e22")
public static String es_PE_FIELD_PartnerPayments_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bc399afd-73e0-5a2d-1d90-ee54bb508e22")
public static final String FIELDNAME_PartnerPayments_Currency="bc399afd-73e0-5a2d-1d90-ee54bb508e22";

@XendraTrl(Identifier="7fa56364-3735-143a-eb2a-38b9de0c5b33")
public static String es_PE_FIELD_Payment_Currency2_Description="Moneda para este registro";

@XendraTrl(Identifier="7fa56364-3735-143a-eb2a-38b9de0c5b33")
public static String es_PE_FIELD_Payment_Currency2_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="7fa56364-3735-143a-eb2a-38b9de0c5b33")
public static String es_PE_FIELD_Payment_Currency2_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7fa56364-3735-143a-eb2a-38b9de0c5b33")
public static final String FIELDNAME_Payment_Currency2="7fa56364-3735-143a-eb2a-38b9de0c5b33";

@XendraTrl(Identifier="6d2477a1-1e42-8271-e63e-31af48a60cba")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutPayment.amounts",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6d2477a1-1e42-8271-e63e-31af48a60cba",Synchronized="2017-08-05 16:53:59.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Document Type.
@param C_DocType_ID Document type or rules */
public void setC_DocType_ID (int C_DocType_ID)
{
if (C_DocType_ID < 0) throw new IllegalArgumentException ("C_DocType_ID is mandatory.");
set_Value (COLUMNNAME_C_DocType_ID, Integer.valueOf(C_DocType_ID));
}
/** Get Document Type.
@return Document type or rules */
public int getC_DocType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DocType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c8f696a5-9c9e-55f9-3c87-deeca558038c")
public static String es_PE_FIELD_Payment_DocumentType_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="c8f696a5-9c9e-55f9-3c87-deeca558038c")
public static String es_PE_FIELD_Payment_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraTrl(Identifier="c8f696a5-9c9e-55f9-3c87-deeca558038c")
public static String es_PE_FIELD_Payment_DocumentType_Name="Tipo";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c8f696a5-9c9e-55f9-3c87-deeca558038c")
public static final String FIELDNAME_Payment_DocumentType="c8f696a5-9c9e-55f9-3c87-deeca558038c";

@XendraTrl(Identifier="2c8e7c11-83e0-66c5-bf7e-80cfb4541ce3")
public static String es_PE_FIELD_PartnerPayments_DocumentType_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="2c8e7c11-83e0-66c5-bf7e-80cfb4541ce3")
public static String es_PE_FIELD_PartnerPayments_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraTrl(Identifier="2c8e7c11-83e0-66c5-bf7e-80cfb4541ce3")
public static String es_PE_FIELD_PartnerPayments_DocumentType_Name="Tipo de Documento";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2c8e7c11-83e0-66c5-bf7e-80cfb4541ce3")
public static final String FIELDNAME_PartnerPayments_DocumentType="2c8e7c11-83e0-66c5-bf7e-80cfb4541ce3";

@XendraTrl(Identifier="d5bcd6ab-e226-8f27-fe5a-9878d6d9d15f")
public static String es_PE_FIELD_Payment_DocumentType2_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="d5bcd6ab-e226-8f27-fe5a-9878d6d9d15f")
public static String es_PE_FIELD_Payment_DocumentType2_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraTrl(Identifier="d5bcd6ab-e226-8f27-fe5a-9878d6d9d15f")
public static String es_PE_FIELD_Payment_DocumentType2_Name="Tipo de Documento";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d5bcd6ab-e226-8f27-fe5a-9878d6d9d15f")
public static final String FIELDNAME_Payment_DocumentType2="d5bcd6ab-e226-8f27-fe5a-9878d6d9d15f";

@XendraTrl(Identifier="41a1c8ca-725a-5318-42d3-d6bc26bd3928")
public static String es_PE_COLUMN_C_DocType_ID_Name="Tipo de Documento";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="757105c8-f6b5-223c-c6c4-1c7d6405b50e",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutPayment.docType",VFormat="",ValueMin="",ValueMax="",Version="1",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="41a1c8ca-725a-5318-42d3-d6bc26bd3928",
Synchronized="2017-08-05 16:53:59.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
/** Set Charge amount.
@param ChargeAmt Charge Amount */
public void setChargeAmt (BigDecimal ChargeAmt)
{
set_Value (COLUMNNAME_ChargeAmt, ChargeAmt);
}
/** Get Charge amount.
@return Charge Amount */
public BigDecimal getChargeAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ChargeAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="58f543fd-41bc-4085-6d0c-3e56eb0f2956")
public static String es_PE_FIELD_Payment_ChargeAmount_Description="Total del Cargo";

@XendraTrl(Identifier="58f543fd-41bc-4085-6d0c-3e56eb0f2956")
public static String es_PE_FIELD_Payment_ChargeAmount_Help="El Total Cargo indica el total para un cargo adicional";

@XendraTrl(Identifier="58f543fd-41bc-4085-6d0c-3e56eb0f2956")
public static String es_PE_FIELD_Payment_ChargeAmount_Name="Total de Cargo";

@XendraField(AD_Column_ID="ChargeAmt",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="58f543fd-41bc-4085-6d0c-3e56eb0f2956")
public static final String FIELDNAME_Payment_ChargeAmount="58f543fd-41bc-4085-6d0c-3e56eb0f2956";

@XendraTrl(Identifier="8d49ae6a-2a52-1b01-5507-a76987192c91")
public static String es_PE_FIELD_PartnerPayments_ChargeAmount_Description="Total del Cargo";

@XendraTrl(Identifier="8d49ae6a-2a52-1b01-5507-a76987192c91")
public static String es_PE_FIELD_PartnerPayments_ChargeAmount_Help="El Total Cargo indica el total para un cargo adicional";

@XendraTrl(Identifier="8d49ae6a-2a52-1b01-5507-a76987192c91")
public static String es_PE_FIELD_PartnerPayments_ChargeAmount_Name="Total de Cargo";

@XendraField(AD_Column_ID="ChargeAmt",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8d49ae6a-2a52-1b01-5507-a76987192c91")
public static final String FIELDNAME_PartnerPayments_ChargeAmount="8d49ae6a-2a52-1b01-5507-a76987192c91";

@XendraTrl(Identifier="db183b6a-8157-3b6f-1a7d-7fdb72e8c58f")
public static String es_PE_FIELD_Payment_ChargeAmount2_Description="Total del Cargo";

@XendraTrl(Identifier="db183b6a-8157-3b6f-1a7d-7fdb72e8c58f")
public static String es_PE_FIELD_Payment_ChargeAmount2_Help="El Total Cargo indica el total para un cargo adicional";

@XendraTrl(Identifier="db183b6a-8157-3b6f-1a7d-7fdb72e8c58f")
public static String es_PE_FIELD_Payment_ChargeAmount2_Name="Total de Cargo";

@XendraField(AD_Column_ID="ChargeAmt",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="db183b6a-8157-3b6f-1a7d-7fdb72e8c58f")
public static final String FIELDNAME_Payment_ChargeAmount2="db183b6a-8157-3b6f-1a7d-7fdb72e8c58f";

@XendraTrl(Identifier="4d389ad1-fb37-14df-39a8-f5a6a2e53c49")
public static String es_PE_COLUMN_ChargeAmt_Name="Total de Cargo";

@XendraColumn(AD_Element_ID="0700d401-01bb-8f19-a508-aa47155ba852",ColumnName="ChargeAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4d389ad1-fb37-14df-39a8-f5a6a2e53c49",
Synchronized="2017-08-05 16:53:59.0")
/** Column name ChargeAmt */
public static final String COLUMNNAME_ChargeAmt = "ChargeAmt";
/** Set Check No.
@param CheckNo Check Number */
public void setCheckNo (String CheckNo)
{
if (CheckNo != null && CheckNo.length() > 20)
{
log.warning("Length > 20 - truncated");
CheckNo = CheckNo.substring(0,19);
}
set_Value (COLUMNNAME_CheckNo, CheckNo);
}
/** Get Check No.
@return Check Number */
public String getCheckNo() 
{
String value = (String)get_Value(COLUMNNAME_CheckNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="637bb29e-95e1-85de-5f30-18e5b73004ca")
public static String es_PE_FIELD_Payment_CheckNo_Description="No. de Cheque";

@XendraTrl(Identifier="637bb29e-95e1-85de-5f30-18e5b73004ca")
public static String es_PE_FIELD_Payment_CheckNo_Help="El Número de Cheque indica el número en el cheque";

@XendraTrl(Identifier="637bb29e-95e1-85de-5f30-18e5b73004ca")
public static String es_PE_FIELD_Payment_CheckNo_Name="No. de Cheque";

@XendraField(AD_Column_ID="CheckNo",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsTransfer@!Y & @TenderType@=K",DisplayLength=20,IsReadOnly=false,SeqNo=300,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="637bb29e-95e1-85de-5f30-18e5b73004ca")
public static final String FIELDNAME_Payment_CheckNo="637bb29e-95e1-85de-5f30-18e5b73004ca";

@XendraTrl(Identifier="46e06b31-8c17-722d-2423-82c1092f3efb")
public static String es_PE_FIELD_PartnerPayments_CheckNo_Description="No. de Cheque";

@XendraTrl(Identifier="46e06b31-8c17-722d-2423-82c1092f3efb")
public static String es_PE_FIELD_PartnerPayments_CheckNo_Help="El Número de Cheque indica el número en el cheque";

@XendraTrl(Identifier="46e06b31-8c17-722d-2423-82c1092f3efb")
public static String es_PE_FIELD_PartnerPayments_CheckNo_Name="No. de Cheque";

@XendraField(AD_Column_ID="CheckNo",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="46e06b31-8c17-722d-2423-82c1092f3efb")
public static final String FIELDNAME_PartnerPayments_CheckNo="46e06b31-8c17-722d-2423-82c1092f3efb";

@XendraTrl(Identifier="b0784da4-61ef-3b3f-beaa-0781834c63db")
public static String es_PE_FIELD_Payment_CheckNo2_Description="No. de Cheque";

@XendraTrl(Identifier="b0784da4-61ef-3b3f-beaa-0781834c63db")
public static String es_PE_FIELD_Payment_CheckNo2_Help="El Número de Cheque indica el número en el cheque";

@XendraTrl(Identifier="b0784da4-61ef-3b3f-beaa-0781834c63db")
public static String es_PE_FIELD_Payment_CheckNo2_Name="No. de Cheque";

@XendraField(AD_Column_ID="CheckNo",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b0784da4-61ef-3b3f-beaa-0781834c63db")
public static final String FIELDNAME_Payment_CheckNo2="b0784da4-61ef-3b3f-beaa-0781834c63db";

@XendraTrl(Identifier="2d6308b2-cde7-94b2-9bdf-1b510d68160b")
public static String es_PE_COLUMN_CheckNo_Name="No. de Cheque";

@XendraColumn(AD_Element_ID="3123a69e-c052-5e62-1da1-52e9859520d5",ColumnName="CheckNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2d6308b2-cde7-94b2-9bdf-1b510d68160b",
Synchronized="2017-08-05 16:53:59.0")
/** Column name CheckNo */
public static final String COLUMNNAME_CheckNo = "CheckNo";
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

@XendraTrl(Identifier="260f3a28-3f09-c1eb-ee0f-895dabf5c118")
public static String es_PE_FIELD_Payment_Invoice_Description="Identificador de la factura";

@XendraTrl(Identifier="260f3a28-3f09-c1eb-ee0f-895dabf5c118")
public static String es_PE_FIELD_Payment_Invoice_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraTrl(Identifier="260f3a28-3f09-c1eb-ee0f-895dabf5c118")
public static String es_PE_FIELD_Payment_Invoice_Name="Factura";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsTransfer@!Y",DisplayLength=26,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="260f3a28-3f09-c1eb-ee0f-895dabf5c118")
public static final String FIELDNAME_Payment_Invoice="260f3a28-3f09-c1eb-ee0f-895dabf5c118";

@XendraTrl(Identifier="4240d7d2-a9a3-a87b-b00b-f12a79dc2fea")
public static String es_PE_FIELD_PartnerPayments_Invoice_Description="Identificador de la factura";

@XendraTrl(Identifier="4240d7d2-a9a3-a87b-b00b-f12a79dc2fea")
public static String es_PE_FIELD_PartnerPayments_Invoice_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraTrl(Identifier="4240d7d2-a9a3-a87b-b00b-f12a79dc2fea")
public static String es_PE_FIELD_PartnerPayments_Invoice_Name="Factura";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4240d7d2-a9a3-a87b-b00b-f12a79dc2fea")
public static final String FIELDNAME_PartnerPayments_Invoice="4240d7d2-a9a3-a87b-b00b-f12a79dc2fea";

@XendraTrl(Identifier="45d3c5e1-e8ae-01b2-ea37-aae6ec6b11f7")
public static String es_PE_FIELD_Payment_Invoice2_Description="Identificador de la factura";

@XendraTrl(Identifier="45d3c5e1-e8ae-01b2-ea37-aae6ec6b11f7")
public static String es_PE_FIELD_Payment_Invoice2_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraTrl(Identifier="45d3c5e1-e8ae-01b2-ea37-aae6ec6b11f7")
public static String es_PE_FIELD_Payment_Invoice2_Name="Factura";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="45d3c5e1-e8ae-01b2-ea37-aae6ec6b11f7")
public static final String FIELDNAME_Payment_Invoice2="45d3c5e1-e8ae-01b2-ea37-aae6ec6b11f7";

@XendraTrl(Identifier="158928e1-380a-3e4e-6486-a7bd23093ddc")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Factura";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="1756545a-9e8f-c0b5-5fd8-598388dea68e",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="@C_Order_ID@!0 | @C_Charge_ID@!0",IsIdentifier=false,SeqNo=0,
IsTranslated=false,Callout="org.compiere.model.CalloutPayment.invoice",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="158928e1-380a-3e4e-6486-a7bd23093ddc",
Synchronized="2017-08-05 16:53:59.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
/** Set Order.
@param C_Order_ID Order */
public void setC_Order_ID (int C_Order_ID)
{
if (C_Order_ID <= 0) set_Value (COLUMNNAME_C_Order_ID, null);
 else 
set_Value (COLUMNNAME_C_Order_ID, Integer.valueOf(C_Order_ID));
}
/** Get Order.
@return Order */
public int getC_Order_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Order_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="195bfd56-8907-b57e-296d-04478be3a7f4")
public static String es_PE_FIELD_Payment_Order_Description="Orden de Venta";

@XendraTrl(Identifier="195bfd56-8907-b57e-296d-04478be3a7f4")
public static String es_PE_FIELD_Payment_Order_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraTrl(Identifier="195bfd56-8907-b57e-296d-04478be3a7f4")
public static String es_PE_FIELD_Payment_Order_Name="Orden de Venta";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsTransfer@!Y",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="195bfd56-8907-b57e-296d-04478be3a7f4")
public static final String FIELDNAME_Payment_Order="195bfd56-8907-b57e-296d-04478be3a7f4";

@XendraTrl(Identifier="db6cc1ad-f87b-11d6-f5f2-a2dbf373d114")
public static String es_PE_FIELD_PartnerPayments_Order_Description="Orden de Venta";

@XendraTrl(Identifier="db6cc1ad-f87b-11d6-f5f2-a2dbf373d114")
public static String es_PE_FIELD_PartnerPayments_Order_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraTrl(Identifier="db6cc1ad-f87b-11d6-f5f2-a2dbf373d114")
public static String es_PE_FIELD_PartnerPayments_Order_Name="Orden de Venta";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="db6cc1ad-f87b-11d6-f5f2-a2dbf373d114")
public static final String FIELDNAME_PartnerPayments_Order="db6cc1ad-f87b-11d6-f5f2-a2dbf373d114";

@XendraTrl(Identifier="6a5b8b81-4313-b051-86cc-53f72c342baa")
public static String es_PE_FIELD_Payment_Order2_Description="Orden de Venta";

@XendraTrl(Identifier="6a5b8b81-4313-b051-86cc-53f72c342baa")
public static String es_PE_FIELD_Payment_Order2_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraTrl(Identifier="6a5b8b81-4313-b051-86cc-53f72c342baa")
public static String es_PE_FIELD_Payment_Order2_Name="Orden de Venta";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6a5b8b81-4313-b051-86cc-53f72c342baa")
public static final String FIELDNAME_Payment_Order2="6a5b8b81-4313-b051-86cc-53f72c342baa";

@XendraTrl(Identifier="c218a6fa-59e0-85b4-fac6-608e67f2b8ab")
public static String es_PE_COLUMN_C_Order_ID_Name="Orden de Venta";

@XendraColumn(AD_Element_ID="cc846c60-90b8-6aad-9d07-b5d0c0328787",ColumnName="C_Order_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="773fb461-6147-eb1c-65bb-f69991e6cc6c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="@C_Invoice_ID@!0 | @C_Charge_ID@!0",IsIdentifier=false,SeqNo=0,
IsTranslated=false,Callout="org.compiere.model.CalloutPayment.order",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="c218a6fa-59e0-85b4-fac6-608e67f2b8ab",
Synchronized="2017-08-05 16:53:59.0")
/** Column name C_Order_ID */
public static final String COLUMNNAME_C_Order_ID = "C_Order_ID";
/** Set Payment Batch.
@param C_PaymentBatch_ID Payment batch for EFT */
public void setC_PaymentBatch_ID (int C_PaymentBatch_ID)
{
if (C_PaymentBatch_ID <= 0) set_Value (COLUMNNAME_C_PaymentBatch_ID, null);
 else 
set_Value (COLUMNNAME_C_PaymentBatch_ID, Integer.valueOf(C_PaymentBatch_ID));
}
/** Get Payment Batch.
@return Payment batch for EFT */
public int getC_PaymentBatch_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_PaymentBatch_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5f476fc3-6009-4dff-edab-31dcc8f2887d")
public static String es_PE_FIELD_Payment_PaymentBatch_Name="Lote de Pagos";

@XendraField(AD_Column_ID="C_PaymentBatch_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5f476fc3-6009-4dff-edab-31dcc8f2887d")
public static final String FIELDNAME_Payment_PaymentBatch="5f476fc3-6009-4dff-edab-31dcc8f2887d";

@XendraTrl(Identifier="2ab27e4c-8ff7-9b15-8cdb-fbac91ed57f0")
public static String es_PE_FIELD_PartnerPayments_PaymentBatch_Name="Lote de Pagos";

@XendraField(AD_Column_ID="C_PaymentBatch_ID",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2ab27e4c-8ff7-9b15-8cdb-fbac91ed57f0")
public static final String FIELDNAME_PartnerPayments_PaymentBatch="2ab27e4c-8ff7-9b15-8cdb-fbac91ed57f0";

@XendraTrl(Identifier="b4547ea8-9762-ac3f-1005-eae126f9cf76")
public static String es_PE_FIELD_Payment_PaymentBatch2_Name="Lote de Pagos";

@XendraField(AD_Column_ID="C_PaymentBatch_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b4547ea8-9762-ac3f-1005-eae126f9cf76")
public static final String FIELDNAME_Payment_PaymentBatch2="b4547ea8-9762-ac3f-1005-eae126f9cf76";

@XendraTrl(Identifier="6cb77320-0443-b3c6-d6ba-ab926be1f12b")
public static String es_PE_COLUMN_C_PaymentBatch_ID_Name="Lote de Pagos";

@XendraColumn(AD_Element_ID="505ff281-5321-d12d-a033-18f81c6efdba",ColumnName="C_PaymentBatch_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6cb77320-0443-b3c6-d6ba-ab926be1f12b",
Synchronized="2017-08-05 16:53:59.0")
/** Column name C_PaymentBatch_ID */
public static final String COLUMNNAME_C_PaymentBatch_ID = "C_PaymentBatch_ID";
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

@XendraTrl(Identifier="37e6e185-4d8e-8120-f252-2102d72ea31e")
public static String es_PE_FIELD_Payment_Payment_Description="Identificador del pago";

@XendraTrl(Identifier="37e6e185-4d8e-8120-f252-2102d72ea31e")
public static String es_PE_FIELD_Payment_Payment_Help="El pago es un identificador único de este pago.";

@XendraTrl(Identifier="37e6e185-4d8e-8120-f252-2102d72ea31e")
public static String es_PE_FIELD_Payment_Payment_Name="Pago";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="37e6e185-4d8e-8120-f252-2102d72ea31e")
public static final String FIELDNAME_Payment_Payment="37e6e185-4d8e-8120-f252-2102d72ea31e";

@XendraTrl(Identifier="e5cf8fbf-9a6a-84c4-a3a9-431a30047e18")
public static String es_PE_FIELD_PartnerPayments_Payment_Description="Identificador del pago";

@XendraTrl(Identifier="e5cf8fbf-9a6a-84c4-a3a9-431a30047e18")
public static String es_PE_FIELD_PartnerPayments_Payment_Help="El pago es un identificador único de este pago.";

@XendraTrl(Identifier="e5cf8fbf-9a6a-84c4-a3a9-431a30047e18")
public static String es_PE_FIELD_PartnerPayments_Payment_Name="Pago";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="1=2",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e5cf8fbf-9a6a-84c4-a3a9-431a30047e18")
public static final String FIELDNAME_PartnerPayments_Payment="e5cf8fbf-9a6a-84c4-a3a9-431a30047e18";

@XendraTrl(Identifier="f46224e5-ce1d-ee92-a21e-b4fe550f8ea7")
public static String es_PE_FIELD_Payment_Payment2_Description="Identificador del pago";

@XendraTrl(Identifier="f46224e5-ce1d-ee92-a21e-b4fe550f8ea7")
public static String es_PE_FIELD_Payment_Payment2_Help="El pago es un identificador único de este pago.";

@XendraTrl(Identifier="f46224e5-ce1d-ee92-a21e-b4fe550f8ea7")
public static String es_PE_FIELD_Payment_Payment2_Name="Pago";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f46224e5-ce1d-ee92-a21e-b4fe550f8ea7")
public static final String FIELDNAME_Payment_Payment2="f46224e5-ce1d-ee92-a21e-b4fe550f8ea7";
/** Column name C_Payment_ID */
public static final String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
/** Set Project.
@param C_Project_ID Financial Project */
public void setC_Project_ID (int C_Project_ID)
{
if (C_Project_ID <= 0) set_Value (COLUMNNAME_C_Project_ID, null);
 else 
set_Value (COLUMNNAME_C_Project_ID, Integer.valueOf(C_Project_ID));
}
/** Get Project.
@return Financial Project */
public int getC_Project_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Project_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="00ad7084-0e11-dd93-d96b-3e7db8c32cdd")
public static String es_PE_FIELD_Payment_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="00ad7084-0e11-dd93-d96b-3e7db8c32cdd")
public static String es_PE_FIELD_Payment_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraTrl(Identifier="00ad7084-0e11-dd93-d96b-3e7db8c32cdd")
public static String es_PE_FIELD_Payment_Project_Name="Proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsTransfer@!Y & @$Element_PJ@=Y & @C_Invoice_ID@=0 | @C_Invoice_ID@=''",
DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="00ad7084-0e11-dd93-d96b-3e7db8c32cdd")
public static final String FIELDNAME_Payment_Project="00ad7084-0e11-dd93-d96b-3e7db8c32cdd";

@XendraTrl(Identifier="8cddfc09-a2c1-c466-efa9-f269a8c4ba19")
public static String es_PE_FIELD_PartnerPayments_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="8cddfc09-a2c1-c466-efa9-f269a8c4ba19")
public static String es_PE_FIELD_PartnerPayments_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraTrl(Identifier="8cddfc09-a2c1-c466-efa9-f269a8c4ba19")
public static String es_PE_FIELD_PartnerPayments_Project_Name="Proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8cddfc09-a2c1-c466-efa9-f269a8c4ba19")
public static final String FIELDNAME_PartnerPayments_Project="8cddfc09-a2c1-c466-efa9-f269a8c4ba19";

@XendraTrl(Identifier="46c039d9-07fe-3cca-847a-19b6b335416a")
public static String es_PE_FIELD_Payment_Project2_Description="Identifica un proyecto único";

@XendraTrl(Identifier="46c039d9-07fe-3cca-847a-19b6b335416a")
public static String es_PE_FIELD_Payment_Project2_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraTrl(Identifier="46c039d9-07fe-3cca-847a-19b6b335416a")
public static String es_PE_FIELD_Payment_Project2_Name="Proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="46c039d9-07fe-3cca-847a-19b6b335416a")
public static final String FIELDNAME_Payment_Project2="46c039d9-07fe-3cca-847a-19b6b335416a";

@XendraTrl(Identifier="73ca49d4-a679-521b-e57f-15089647e351")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@C_Charge_ID!0",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutPayment.project",VFormat="",ValueMin="",ValueMax="",Version="1",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="73ca49d4-a679-521b-e57f-15089647e351",
Synchronized="2017-08-05 16:53:59.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
/** Set Exp. Month.
@param CreditCardExpMM Expiry Month */
public void setCreditCardExpMM (int CreditCardExpMM)
{
set_Value (COLUMNNAME_CreditCardExpMM, Integer.valueOf(CreditCardExpMM));
}
/** Get Exp. Month.
@return Expiry Month */
public int getCreditCardExpMM() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_CreditCardExpMM);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="54cf9355-e5f2-388d-8522-b1c28f09a342")
public static String es_PE_FIELD_Payment_ExpMonth_Description="Mes de expiración";

@XendraTrl(Identifier="54cf9355-e5f2-388d-8522-b1c28f09a342")
public static String es_PE_FIELD_Payment_ExpMonth_Help="El mes de expiración indica el mes de expiración para esta tarjeta de crédito";

@XendraTrl(Identifier="54cf9355-e5f2-388d-8522-b1c28f09a342")
public static String es_PE_FIELD_Payment_ExpMonth_Name="Mes de Expiración";

@XendraField(AD_Column_ID="CreditCardExpMM",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsTransfer@!Y & @TenderType@=C",DisplayLength=11,IsReadOnly=false,SeqNo=360,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="54cf9355-e5f2-388d-8522-b1c28f09a342")
public static final String FIELDNAME_Payment_ExpMonth="54cf9355-e5f2-388d-8522-b1c28f09a342";

@XendraTrl(Identifier="d9e61e98-28e9-d1f9-f0b1-304a27bd1bbd")
public static String es_PE_FIELD_PartnerPayments_ExpMonth_Description="Mes de expiración";

@XendraTrl(Identifier="d9e61e98-28e9-d1f9-f0b1-304a27bd1bbd")
public static String es_PE_FIELD_PartnerPayments_ExpMonth_Help="El mes de expiración indica el mes de expiración para esta tarjeta de crédito";

@XendraTrl(Identifier="d9e61e98-28e9-d1f9-f0b1-304a27bd1bbd")
public static String es_PE_FIELD_PartnerPayments_ExpMonth_Name="Mes de Expiración";

@XendraField(AD_Column_ID="CreditCardExpMM",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d9e61e98-28e9-d1f9-f0b1-304a27bd1bbd")
public static final String FIELDNAME_PartnerPayments_ExpMonth="d9e61e98-28e9-d1f9-f0b1-304a27bd1bbd";

@XendraTrl(Identifier="fc540300-c15b-7d99-da12-fe7d41aacfc6")
public static String es_PE_FIELD_Payment_ExpMonth2_Description="Mes de expiración";

@XendraTrl(Identifier="fc540300-c15b-7d99-da12-fe7d41aacfc6")
public static String es_PE_FIELD_Payment_ExpMonth2_Help="El mes de expiración indica el mes de expiración para esta tarjeta de crédito";

@XendraTrl(Identifier="fc540300-c15b-7d99-da12-fe7d41aacfc6")
public static String es_PE_FIELD_Payment_ExpMonth2_Name="Mes de Expiración";

@XendraField(AD_Column_ID="CreditCardExpMM",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fc540300-c15b-7d99-da12-fe7d41aacfc6")
public static final String FIELDNAME_Payment_ExpMonth2="fc540300-c15b-7d99-da12-fe7d41aacfc6";

@XendraTrl(Identifier="27ea8306-ed8f-628b-47db-096030a9ebad")
public static String es_PE_COLUMN_CreditCardExpMM_Name="Mes de Expiración";

@XendraColumn(AD_Element_ID="356e5287-2f42-aa22-fe06-93d0c824b8b8",ColumnName="CreditCardExpMM",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@IsApproved@=Y",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",
ValueMin="1",ValueMax="12",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="27ea8306-ed8f-628b-47db-096030a9ebad",Synchronized="2017-08-05 16:54:00.0")
/** Column name CreditCardExpMM */
public static final String COLUMNNAME_CreditCardExpMM = "CreditCardExpMM";
/** Set Exp. Year.
@param CreditCardExpYY Expiry Year */
public void setCreditCardExpYY (int CreditCardExpYY)
{
set_Value (COLUMNNAME_CreditCardExpYY, Integer.valueOf(CreditCardExpYY));
}
/** Get Exp. Year.
@return Expiry Year */
public int getCreditCardExpYY() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_CreditCardExpYY);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="62c3c103-bae4-be20-8a03-c00513acb16b")
public static String es_PE_FIELD_Payment_ExpYear_Description="Año de expiración";

@XendraTrl(Identifier="62c3c103-bae4-be20-8a03-c00513acb16b")
public static String es_PE_FIELD_Payment_ExpYear_Help="El Año de Expiración indica el año de expiración para esta tarjeta de crédito";

@XendraTrl(Identifier="62c3c103-bae4-be20-8a03-c00513acb16b")
public static String es_PE_FIELD_Payment_ExpYear_Name="Año de Expiración";

@XendraField(AD_Column_ID="CreditCardExpYY",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsTransfer@!Y & @TenderType@=C",DisplayLength=11,IsReadOnly=false,SeqNo=370,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="62c3c103-bae4-be20-8a03-c00513acb16b")
public static final String FIELDNAME_Payment_ExpYear="62c3c103-bae4-be20-8a03-c00513acb16b";

@XendraTrl(Identifier="031320e0-87e6-4f74-dc49-db50813971fd")
public static String es_PE_FIELD_PartnerPayments_ExpYear_Description="Año de expiración";

@XendraTrl(Identifier="031320e0-87e6-4f74-dc49-db50813971fd")
public static String es_PE_FIELD_PartnerPayments_ExpYear_Help="El Año de Expiración indica el año de expiración para esta tarjeta de crédito";

@XendraTrl(Identifier="031320e0-87e6-4f74-dc49-db50813971fd")
public static String es_PE_FIELD_PartnerPayments_ExpYear_Name="Año de Expiración";

@XendraField(AD_Column_ID="CreditCardExpYY",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="031320e0-87e6-4f74-dc49-db50813971fd")
public static final String FIELDNAME_PartnerPayments_ExpYear="031320e0-87e6-4f74-dc49-db50813971fd";

@XendraTrl(Identifier="1f7ab963-7ccc-cbd8-663c-294123076084")
public static String es_PE_FIELD_Payment_ExpYear2_Description="Año de expiración";

@XendraTrl(Identifier="1f7ab963-7ccc-cbd8-663c-294123076084")
public static String es_PE_FIELD_Payment_ExpYear2_Help="El Año de Expiración indica el año de expiración para esta tarjeta de crédito";

@XendraTrl(Identifier="1f7ab963-7ccc-cbd8-663c-294123076084")
public static String es_PE_FIELD_Payment_ExpYear2_Name="Año de Expiración";

@XendraField(AD_Column_ID="CreditCardExpYY",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1f7ab963-7ccc-cbd8-663c-294123076084")
public static final String FIELDNAME_Payment_ExpYear2="1f7ab963-7ccc-cbd8-663c-294123076084";

@XendraTrl(Identifier="abcb82c5-b556-47ac-60f6-719651d8cf17")
public static String es_PE_COLUMN_CreditCardExpYY_Name="Año de Expiración";

@XendraColumn(AD_Element_ID="0fd5b930-7df8-710d-43fa-e4e55dd5df2d",ColumnName="CreditCardExpYY",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="03",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@IsApproved@=Y",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",
ValueMin="3",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="abcb82c5-b556-47ac-60f6-719651d8cf17",Synchronized="2017-08-05 16:54:00.0")
/** Column name CreditCardExpYY */
public static final String COLUMNNAME_CreditCardExpYY = "CreditCardExpYY";
/** Set Number.
@param CreditCardNumber Credit Card Number  */
public void setCreditCardNumber (String CreditCardNumber)
{
if (CreditCardNumber != null && CreditCardNumber.length() > 20)
{
log.warning("Length > 20 - truncated");
CreditCardNumber = CreditCardNumber.substring(0,19);
}
set_Value (COLUMNNAME_CreditCardNumber, CreditCardNumber);
}
/** Get Number.
@return Credit Card Number  */
public String getCreditCardNumber() 
{
String value = (String)get_Value(COLUMNNAME_CreditCardNumber);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c9db6d09-0767-2ea2-9950-5731046acfdc")
public static String es_PE_FIELD_Payment_Number_Description="Número de tarjeta de crédito";

@XendraTrl(Identifier="c9db6d09-0767-2ea2-9950-5731046acfdc")
public static String es_PE_FIELD_Payment_Number_Help="El número de tarjeta de crédito indica el número sin espacios en blancos.";

@XendraTrl(Identifier="c9db6d09-0767-2ea2-9950-5731046acfdc")
public static String es_PE_FIELD_Payment_Number_Name="Número";

@XendraField(AD_Column_ID="CreditCardNumber",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsTransfer@!Y & @TenderType@=C",DisplayLength=20,IsReadOnly=false,SeqNo=340,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c9db6d09-0767-2ea2-9950-5731046acfdc")
public static final String FIELDNAME_Payment_Number="c9db6d09-0767-2ea2-9950-5731046acfdc";

@XendraTrl(Identifier="a206837d-30db-d5bb-4e00-0e5835448963")
public static String es_PE_FIELD_PartnerPayments_Number_Description="Número de tarjeta de crédito";

@XendraTrl(Identifier="a206837d-30db-d5bb-4e00-0e5835448963")
public static String es_PE_FIELD_PartnerPayments_Number_Help="El número de tarjeta de crédito indica el número sin espacios en blancos.";

@XendraTrl(Identifier="a206837d-30db-d5bb-4e00-0e5835448963")
public static String es_PE_FIELD_PartnerPayments_Number_Name="Número";

@XendraField(AD_Column_ID="CreditCardNumber",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a206837d-30db-d5bb-4e00-0e5835448963")
public static final String FIELDNAME_PartnerPayments_Number="a206837d-30db-d5bb-4e00-0e5835448963";

@XendraTrl(Identifier="9e9582da-9071-9f2f-6939-e02ca71ba747")
public static String es_PE_FIELD_Payment_Number2_Description="Número de tarjeta de crédito";

@XendraTrl(Identifier="9e9582da-9071-9f2f-6939-e02ca71ba747")
public static String es_PE_FIELD_Payment_Number2_Help="El número de tarjeta de crédito indica el número sin espacios en blancos.";

@XendraTrl(Identifier="9e9582da-9071-9f2f-6939-e02ca71ba747")
public static String es_PE_FIELD_Payment_Number2_Name="Número";

@XendraField(AD_Column_ID="CreditCardNumber",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9e9582da-9071-9f2f-6939-e02ca71ba747")
public static final String FIELDNAME_Payment_Number2="9e9582da-9071-9f2f-6939-e02ca71ba747";

@XendraTrl(Identifier="534b725d-4ce4-f746-e54e-087f3aaa4d97")
public static String es_PE_COLUMN_CreditCardNumber_Name="Número";

@XendraColumn(AD_Element_ID="ba2012cb-ab05-b83e-d2ab-52eaad7b996c",ColumnName="CreditCardNumber",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@IsApproved@=Y",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",
ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="534b725d-4ce4-f746-e54e-087f3aaa4d97",Synchronized="2017-08-05 16:54:00.0")
/** Column name CreditCardNumber */
public static final String COLUMNNAME_CreditCardNumber = "CreditCardNumber";

/** CreditCardType AD_Reference=5ca77e7f-ae8f-2faa-c3ab-3c8ffded32d9 */
public static final int CREDITCARDTYPE_AD_Reference_ID=149;
/** Set Credit Card.
@param CreditCardType Credit Card (Visa, MC, AmEx) */
public void setCreditCardType (String CreditCardType)
{
if (CreditCardType == null || CreditCardType.equals(REF_C_PaymentCreditCardType.Amex) || CreditCardType.equals(REF_C_PaymentCreditCardType.MasterCard) || CreditCardType.equals(REF_C_PaymentCreditCardType.Visa) || CreditCardType.equals(REF_C_PaymentCreditCardType.ATM) || CreditCardType.equals(REF_C_PaymentCreditCardType.PurchaseCard) || CreditCardType.equals(REF_C_PaymentCreditCardType.Diners) || CreditCardType.equals(REF_C_PaymentCreditCardType.Discover) || CreditCardType.equals(REF_C_PaymentCreditCardType.Ripley) || CreditCardType.equals(REF_C_PaymentCreditCardType.CMRFalabella));
 else throw new IllegalArgumentException ("CreditCardType Invalid value - " + CreditCardType + " - Reference_ID=149 - A - M - V - C - P - D - N - R - S");
if (CreditCardType != null && CreditCardType.length() > 1)
{
log.warning("Length > 1 - truncated");
CreditCardType = CreditCardType.substring(0,0);
}
set_Value (COLUMNNAME_CreditCardType, CreditCardType);
}
/** Get Credit Card.
@return Credit Card (Visa, MC, AmEx) */
public String getCreditCardType() 
{
return (String)get_Value(COLUMNNAME_CreditCardType);
}

@XendraTrl(Identifier="f5a511df-5367-7fcf-5091-3024929796f3")
public static String es_PE_FIELD_Payment_CreditCard_Description="Tarjeta de Crédito (Visa; MC; Am Ex)";

@XendraTrl(Identifier="f5a511df-5367-7fcf-5091-3024929796f3")
public static String es_PE_FIELD_Payment_CreditCard_Help="El cuadro de lista de tarjeta de crédito se usa para seleccionar el tipo de tarjeta de crédito presentada para  pago.";

@XendraTrl(Identifier="f5a511df-5367-7fcf-5091-3024929796f3")
public static String es_PE_FIELD_Payment_CreditCard_Name="Tarjeta de Crédito";

@XendraField(AD_Column_ID="CreditCardType",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsTransfer@!Y & @TenderType@=C",DisplayLength=14,IsReadOnly=false,SeqNo=320,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f5a511df-5367-7fcf-5091-3024929796f3")
public static final String FIELDNAME_Payment_CreditCard="f5a511df-5367-7fcf-5091-3024929796f3";

@XendraTrl(Identifier="220a5456-fad9-6a63-b964-692989dcf373")
public static String es_PE_FIELD_PartnerPayments_CreditCard_Description="Tarjeta de Crédito (Visa; MC; Am Ex)";

@XendraTrl(Identifier="220a5456-fad9-6a63-b964-692989dcf373")
public static String es_PE_FIELD_PartnerPayments_CreditCard_Help="El cuadro de lista de tarjeta de crédito se usa para seleccionar el tipo de tarjeta de crédito presentada para  pago.";

@XendraTrl(Identifier="220a5456-fad9-6a63-b964-692989dcf373")
public static String es_PE_FIELD_PartnerPayments_CreditCard_Name="Tarjeta de Crédito";

@XendraField(AD_Column_ID="CreditCardType",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="220a5456-fad9-6a63-b964-692989dcf373")
public static final String FIELDNAME_PartnerPayments_CreditCard="220a5456-fad9-6a63-b964-692989dcf373";

@XendraTrl(Identifier="8fb3457a-1d79-1f82-4315-176650404dc4")
public static String es_PE_FIELD_Payment_CreditCard2_Description="Tarjeta de Crédito (Visa; MC; Am Ex)";

@XendraTrl(Identifier="8fb3457a-1d79-1f82-4315-176650404dc4")
public static String es_PE_FIELD_Payment_CreditCard2_Help="El cuadro de lista de tarjeta de crédito se usa para seleccionar el tipo de tarjeta de crédito presentada para  pago.";

@XendraTrl(Identifier="8fb3457a-1d79-1f82-4315-176650404dc4")
public static String es_PE_FIELD_Payment_CreditCard2_Name="Tarjeta de Crédito";

@XendraField(AD_Column_ID="CreditCardType",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8fb3457a-1d79-1f82-4315-176650404dc4")
public static final String FIELDNAME_Payment_CreditCard2="8fb3457a-1d79-1f82-4315-176650404dc4";

@XendraTrl(Identifier="0132e8eb-bfd6-11b8-7e98-65f6927af565")
public static String es_PE_COLUMN_CreditCardType_Name="Tarjeta de Crédito";

@XendraColumn(AD_Element_ID="22758af1-56f5-1e54-84a3-40d8827367a1",ColumnName="CreditCardType",
AD_Reference_ID=17,AD_Reference_Value_ID="5ca77e7f-ae8f-2faa-c3ab-3c8ffded32d9",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="M",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="@IsApproved@=Y",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0132e8eb-bfd6-11b8-7e98-65f6927af565",Synchronized="2017-08-05 16:54:00.0")
/** Column name CreditCardType */
public static final String COLUMNNAME_CreditCardType = "CreditCardType";
/** Set Verification Code.
@param CreditCardVV Credit Card Verification code on credit card */
public void setCreditCardVV (String CreditCardVV)
{
if (CreditCardVV != null && CreditCardVV.length() > 4)
{
log.warning("Length > 4 - truncated");
CreditCardVV = CreditCardVV.substring(0,3);
}
set_Value (COLUMNNAME_CreditCardVV, CreditCardVV);
}
/** Get Verification Code.
@return Credit Card Verification code on credit card */
public String getCreditCardVV() 
{
String value = (String)get_Value(COLUMNNAME_CreditCardVV);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ec5d729b-bdca-d2a8-4f0b-76370a5364f6")
public static String es_PE_FIELD_Payment_VerificationCode_Description="Código de verificación en la tarjeta de crédito";

@XendraTrl(Identifier="ec5d729b-bdca-d2a8-4f0b-76370a5364f6")
public static String es_PE_FIELD_Payment_VerificationCode_Help="La verificación de la tarjeta de crédito indica el código de verificación en la tarjeta de crédito (AMEX 4 digitos en frente; MC;Visa 3 digitos)";

@XendraTrl(Identifier="ec5d729b-bdca-d2a8-4f0b-76370a5364f6")
public static String es_PE_FIELD_Payment_VerificationCode_Name="Verificación de Tarjeta de Crédito";

@XendraField(AD_Column_ID="CreditCardVV",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsTransfer@!Y & @TenderType@=C",DisplayLength=5,IsReadOnly=false,SeqNo=350,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="ec5d729b-bdca-d2a8-4f0b-76370a5364f6")
public static final String FIELDNAME_Payment_VerificationCode="ec5d729b-bdca-d2a8-4f0b-76370a5364f6";

@XendraTrl(Identifier="41815067-e36d-bf37-b5bf-0aea43469722")
public static String es_PE_FIELD_PartnerPayments_VerificationCode_Description="Código de verificación en la tarjeta de crédito";

@XendraTrl(Identifier="41815067-e36d-bf37-b5bf-0aea43469722")
public static String es_PE_FIELD_PartnerPayments_VerificationCode_Help="La verificación de la tarjeta de crédito indica el código de verificación en la tarjeta de crédito (AMEX 4 digitos en frente; MC;Visa 3 digitos)";

@XendraTrl(Identifier="41815067-e36d-bf37-b5bf-0aea43469722")
public static String es_PE_FIELD_PartnerPayments_VerificationCode_Name="Verificación de Tarjeta de Crédito";

@XendraField(AD_Column_ID="CreditCardVV",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=5,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="41815067-e36d-bf37-b5bf-0aea43469722")
public static final String FIELDNAME_PartnerPayments_VerificationCode="41815067-e36d-bf37-b5bf-0aea43469722";

@XendraTrl(Identifier="cdc28f9e-3194-7822-3f7f-141951ec44b8")
public static String es_PE_FIELD_Payment_VerificationCode2_Description="Código de verificación en la tarjeta de crédito";

@XendraTrl(Identifier="cdc28f9e-3194-7822-3f7f-141951ec44b8")
public static String es_PE_FIELD_Payment_VerificationCode2_Help="La verificación de la tarjeta de crédito indica el código de verificación en la tarjeta de crédito (AMEX 4 digitos en frente; MC;Visa 3 digitos)";

@XendraTrl(Identifier="cdc28f9e-3194-7822-3f7f-141951ec44b8")
public static String es_PE_FIELD_Payment_VerificationCode2_Name="Verificación de Tarjeta de Crédito";

@XendraField(AD_Column_ID="CreditCardVV",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=5,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cdc28f9e-3194-7822-3f7f-141951ec44b8")
public static final String FIELDNAME_Payment_VerificationCode2="cdc28f9e-3194-7822-3f7f-141951ec44b8";

@XendraTrl(Identifier="e4511651-0578-3174-ad6d-307225984538")
public static String es_PE_COLUMN_CreditCardVV_Name="Verificación de Tarjeta de Crédito";

@XendraColumn(AD_Element_ID="cfff0a60-ada3-c9c2-d76e-7f805447f51b",ColumnName="CreditCardVV",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=4,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@IsApproved@=Y",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",
ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e4511651-0578-3174-ad6d-307225984538",Synchronized="2017-08-05 16:54:00.0")
/** Column name CreditCardVV */
public static final String COLUMNNAME_CreditCardVV = "CreditCardVV";
/** Set Account Date.
@param DateAcct Accounting Date */
public void setDateAcct (Timestamp DateAcct)
{
if (DateAcct == null) throw new IllegalArgumentException ("DateAcct is mandatory.");
set_Value (COLUMNNAME_DateAcct, DateAcct);
}
/** Get Account Date.
@return Accounting Date */
public Timestamp getDateAcct() 
{
return (Timestamp)get_Value(COLUMNNAME_DateAcct);
}

@XendraTrl(Identifier="3ba25f35-e923-a45f-dd1e-bf9cdcda9de9")
public static String es_PE_FIELD_Payment_AccountDate_Description="Fecha contable";

@XendraTrl(Identifier="3ba25f35-e923-a45f-dd1e-bf9cdcda9de9")
public static String es_PE_FIELD_Payment_AccountDate_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraTrl(Identifier="3ba25f35-e923-a45f-dd1e-bf9cdcda9de9")
public static String es_PE_FIELD_Payment_AccountDate_Name="Fecha de Aplicación CG";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3ba25f35-e923-a45f-dd1e-bf9cdcda9de9")
public static final String FIELDNAME_Payment_AccountDate="3ba25f35-e923-a45f-dd1e-bf9cdcda9de9";

@XendraTrl(Identifier="079d2ca6-c377-b0b9-9c12-c9f38e5efefc")
public static String es_PE_FIELD_PartnerPayments_AccountDate_Description="Fecha contable";

@XendraTrl(Identifier="079d2ca6-c377-b0b9-9c12-c9f38e5efefc")
public static String es_PE_FIELD_PartnerPayments_AccountDate_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraTrl(Identifier="079d2ca6-c377-b0b9-9c12-c9f38e5efefc")
public static String es_PE_FIELD_PartnerPayments_AccountDate_Name="Fecha de Aplicación CG";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="079d2ca6-c377-b0b9-9c12-c9f38e5efefc")
public static final String FIELDNAME_PartnerPayments_AccountDate="079d2ca6-c377-b0b9-9c12-c9f38e5efefc";

@XendraTrl(Identifier="de470683-c97e-8048-6bcc-d76d1b406c14")
public static String es_PE_FIELD_Payment_AccountDate2_Description="Fecha contable";

@XendraTrl(Identifier="de470683-c97e-8048-6bcc-d76d1b406c14")
public static String es_PE_FIELD_Payment_AccountDate2_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraTrl(Identifier="de470683-c97e-8048-6bcc-d76d1b406c14")
public static String es_PE_FIELD_Payment_AccountDate2_Name="Fecha de Aplicación CG";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="de470683-c97e-8048-6bcc-d76d1b406c14")
public static final String FIELDNAME_Payment_AccountDate2="de470683-c97e-8048-6bcc-d76d1b406c14";

@XendraTrl(Identifier="52a29b18-15e2-fd1f-3c7e-a39a99e4aa3f")
public static String es_PE_COLUMN_DateAcct_Name="Fecha de Aplicación CG";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="@#Date@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="52a29b18-15e2-fd1f-3c7e-a39a99e4aa3f",
Synchronized="2017-08-05 16:54:00.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";
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

@XendraTrl(Identifier="53f81f25-1edb-3a6b-bcde-c1b8b6434f07")
public static String es_PE_FIELD_Payment_TransactionDate_Description="Fecha de la transacción";

@XendraTrl(Identifier="53f81f25-1edb-3a6b-bcde-c1b8b6434f07")
public static String es_PE_FIELD_Payment_TransactionDate_Help="La fecha de transacción indica la fecha en que se ejecutó la transacción";

@XendraTrl(Identifier="53f81f25-1edb-3a6b-bcde-c1b8b6434f07")
public static String es_PE_FIELD_Payment_TransactionDate_Name="Fecha";

@XendraField(AD_Column_ID="DateTrx",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="53f81f25-1edb-3a6b-bcde-c1b8b6434f07")
public static final String FIELDNAME_Payment_TransactionDate="53f81f25-1edb-3a6b-bcde-c1b8b6434f07";

@XendraTrl(Identifier="30b5b493-78f4-4438-fa33-fc4f62147d7e")
public static String es_PE_FIELD_PartnerPayments_TransactionDate_Description="Fecha de la transacción";

@XendraTrl(Identifier="30b5b493-78f4-4438-fa33-fc4f62147d7e")
public static String es_PE_FIELD_PartnerPayments_TransactionDate_Help="La fecha de transacción indica la fecha en que se ejecutó la transacción";

@XendraTrl(Identifier="30b5b493-78f4-4438-fa33-fc4f62147d7e")
public static String es_PE_FIELD_PartnerPayments_TransactionDate_Name="Fecha de la Transacción";

@XendraField(AD_Column_ID="DateTrx",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="30b5b493-78f4-4438-fa33-fc4f62147d7e")
public static final String FIELDNAME_PartnerPayments_TransactionDate="30b5b493-78f4-4438-fa33-fc4f62147d7e";

@XendraTrl(Identifier="c8ac425a-050e-a935-413c-221c1c9bb674")
public static String es_PE_FIELD_Payment_TransactionDate2_Description="Fecha de la transacción";

@XendraTrl(Identifier="c8ac425a-050e-a935-413c-221c1c9bb674")
public static String es_PE_FIELD_Payment_TransactionDate2_Help="La fecha de transacción indica la fecha en que se ejecutó la transacción";

@XendraTrl(Identifier="c8ac425a-050e-a935-413c-221c1c9bb674")
public static String es_PE_FIELD_Payment_TransactionDate2_Name="Fecha de la Transacción";

@XendraField(AD_Column_ID="DateTrx",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c8ac425a-050e-a935-413c-221c1c9bb674")
public static final String FIELDNAME_Payment_TransactionDate2="c8ac425a-050e-a935-413c-221c1c9bb674";

@XendraTrl(Identifier="5e880829-b6cc-02d1-f587-5e34a177eb6b")
public static String es_PE_COLUMN_DateTrx_Name="Fecha de la Transacción";

@XendraColumn(AD_Element_ID="3700288f-61dd-2021-b833-cf804ceed1e9",ColumnName="DateTrx",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="@#Date@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="org.compiere.model.CalloutEngine.dateAcct",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5e880829-b6cc-02d1-f587-5e34a177eb6b",Synchronized="2017-08-05 16:54:00.0")
/** Column name DateTrx */
public static final String COLUMNNAME_DateTrx = "DateTrx";
/** Set DeferredDate.
@param DeferredDate DeferredDate */
public void setDeferredDate (Timestamp DeferredDate)
{
set_Value (COLUMNNAME_DeferredDate, DeferredDate);
}
/** Get DeferredDate.
@return DeferredDate */
public Timestamp getDeferredDate() 
{
return (Timestamp)get_Value(COLUMNNAME_DeferredDate);
}

@XendraTrl(Identifier="dd053120-6819-7fee-d564-bdb5ff761c5e")
public static String es_PE_FIELD_Payment_DeferredDate_Name="Fecha Diferido";

@XendraField(AD_Column_ID="DeferredDate",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dd053120-6819-7fee-d564-bdb5ff761c5e")
public static final String FIELDNAME_Payment_DeferredDate="dd053120-6819-7fee-d564-bdb5ff761c5e";

@XendraTrl(Identifier="43ee6e70-79fe-d510-6fa7-a5a818eafc75")
public static String es_PE_COLUMN_DeferredDate_Name="deferreddate";

@XendraColumn(AD_Element_ID="3b5c426e-3ab0-925f-c1c8-045daa0a5b58",ColumnName="DeferredDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="43ee6e70-79fe-d510-6fa7-a5a818eafc75",
Synchronized="2017-08-05 16:54:00.0")
/** Column name DeferredDate */
public static final String COLUMNNAME_DeferredDate = "DeferredDate";
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

@XendraTrl(Identifier="33d0f173-04fc-c260-7844-3792e234bf76")
public static String es_PE_FIELD_Payment_Description_Description="Observación";

@XendraTrl(Identifier="33d0f173-04fc-c260-7844-3792e234bf76")
public static String es_PE_FIELD_Payment_Description_Help="Observación";

@XendraTrl(Identifier="33d0f173-04fc-c260-7844-3792e234bf76")
public static String es_PE_FIELD_Payment_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="33d0f173-04fc-c260-7844-3792e234bf76")
public static final String FIELDNAME_Payment_Description="33d0f173-04fc-c260-7844-3792e234bf76";

@XendraTrl(Identifier="288b89a3-faad-e27c-3e5b-d387251ff417")
public static String es_PE_FIELD_PartnerPayments_Description_Description="Observación";

@XendraTrl(Identifier="288b89a3-faad-e27c-3e5b-d387251ff417")
public static String es_PE_FIELD_PartnerPayments_Description_Help="Observación";

@XendraTrl(Identifier="288b89a3-faad-e27c-3e5b-d387251ff417")
public static String es_PE_FIELD_PartnerPayments_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="288b89a3-faad-e27c-3e5b-d387251ff417")
public static final String FIELDNAME_PartnerPayments_Description="288b89a3-faad-e27c-3e5b-d387251ff417";

@XendraTrl(Identifier="579cf094-1fc5-c611-7520-bbe57d2b127f")
public static String es_PE_FIELD_Payment_Description2_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="579cf094-1fc5-c611-7520-bbe57d2b127f")
public static String es_PE_FIELD_Payment_Description2_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="579cf094-1fc5-c611-7520-bbe57d2b127f")
public static String es_PE_FIELD_Payment_Description2_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="579cf094-1fc5-c611-7520-bbe57d2b127f")
public static final String FIELDNAME_Payment_Description2="579cf094-1fc5-c611-7520-bbe57d2b127f";

@XendraTrl(Identifier="d911448d-e4a3-6955-0634-1375ed1c4534")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="d911448d-e4a3-6955-0634-1375ed1c4534",
Synchronized="2017-08-05 16:54:00.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";

/** Dest_BankAccount_ID AD_Reference=a43649fa-c8bd-ecd9-6496-45a4d285f2f7 */
public static final int DEST_BANKACCOUNT_ID_AD_Reference_ID=1000012;
/** Set Dest_BankAccount_ID.
@param Dest_BankAccount_ID Account at the Bank */
public void setDest_BankAccount_ID (int Dest_BankAccount_ID)
{
if (Dest_BankAccount_ID < 1) throw new IllegalArgumentException ("Dest_BankAccount_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_Dest_BankAccount_ID, Integer.valueOf(Dest_BankAccount_ID));
}
/** Get Dest_BankAccount_ID.
@return Account at the Bank */
public int getDest_BankAccount_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Dest_BankAccount_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="41fcaf51-2512-73be-24d8-1301fd22bf8a")
public static String es_PE_FIELD_Payment_Dest_BankAccount_ID_Description="Cuenta bancaria";

@XendraTrl(Identifier="41fcaf51-2512-73be-24d8-1301fd22bf8a")
public static String es_PE_FIELD_Payment_Dest_BankAccount_ID_Help="La cuenta bancaria identifica una cuenta en este banco";

@XendraTrl(Identifier="41fcaf51-2512-73be-24d8-1301fd22bf8a")
public static String es_PE_FIELD_Payment_Dest_BankAccount_ID_Name="Cuenta Bancaria";

@XendraField(AD_Column_ID="Dest_BankAccount_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="Transfer",IsDisplayed=true,
DisplayLogic="@IsTransfer@=Y",DisplayLength=0,IsReadOnly=false,SeqNo=530,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="41fcaf51-2512-73be-24d8-1301fd22bf8a")
public static final String FIELDNAME_Payment_Dest_BankAccount_ID="41fcaf51-2512-73be-24d8-1301fd22bf8a";

@XendraTrl(Identifier="5c9f82e2-bba6-84bc-966d-429f5cfb3fdf")
public static String es_PE_COLUMN_Dest_BankAccount_ID_Name="Cuenta Bancaria";

@XendraColumn(AD_Element_ID="66f4d9a2-94ae-8700-954f-b3099128605b",
ColumnName="Dest_BankAccount_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="a43649fa-c8bd-ecd9-6496-45a4d285f2f7",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="5c9f82e2-bba6-84bc-966d-429f5cfb3fdf",
Synchronized="2017-08-05 16:54:00.0")
/** Column name Dest_BankAccount_ID */
public static final String COLUMNNAME_Dest_BankAccount_ID = "Dest_BankAccount_ID";

/** Dest_Payment_ID AD_Reference=673fb4cb-023a-7fa1-b83c-5a97d7f5caea */
public static final int DEST_PAYMENT_ID_AD_Reference_ID=343;
/** Set Dest_Payment_ID.
@param Dest_Payment_ID Payment identifier */
public void setDest_Payment_ID (int Dest_Payment_ID)
{
if (Dest_Payment_ID <= 0) set_Value (COLUMNNAME_Dest_Payment_ID, null);
 else 
set_Value (COLUMNNAME_Dest_Payment_ID, Integer.valueOf(Dest_Payment_ID));
}
/** Get Dest_Payment_ID.
@return Payment identifier */
public int getDest_Payment_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Dest_Payment_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="dc655db2-46b7-2046-532b-5ce000e57c24")
public static String es_PE_FIELD_Payment_Dest_Payment_ID_Description="Identificador del Movimiento";

@XendraTrl(Identifier="dc655db2-46b7-2046-532b-5ce000e57c24")
public static String es_PE_FIELD_Payment_Dest_Payment_ID_Help="El pago es un identificador único de este pago.";

@XendraTrl(Identifier="dc655db2-46b7-2046-532b-5ce000e57c24")
public static String es_PE_FIELD_Payment_Dest_Payment_ID_Name="Movimiento";

@XendraField(AD_Column_ID="Dest_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="Transfer",IsDisplayed=true,
DisplayLogic="@IsTransfer@=Y",DisplayLength=0,IsReadOnly=true,SeqNo=540,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dc655db2-46b7-2046-532b-5ce000e57c24")
public static final String FIELDNAME_Payment_Dest_Payment_ID="dc655db2-46b7-2046-532b-5ce000e57c24";

@XendraTrl(Identifier="cd10bdaa-d8b3-7414-ddeb-0f1637d02783")
public static String es_PE_COLUMN_Dest_Payment_ID_Name="Pago";

@XendraColumn(AD_Element_ID="84e8a578-858a-7ef5-ee16-489a6e16ef75",ColumnName="Dest_Payment_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="673fb4cb-023a-7fa1-b83c-5a97d7f5caea",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="cd10bdaa-d8b3-7414-ddeb-0f1637d02783",Synchronized="2017-08-05 16:54:00.0")
/** Column name Dest_Payment_ID */
public static final String COLUMNNAME_Dest_Payment_ID = "Dest_Payment_ID";
/** Set Discount Amount.
@param DiscountAmt Calculated amount of discount */
public void setDiscountAmt (BigDecimal DiscountAmt)
{
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

@XendraTrl(Identifier="12a70c12-1170-8105-25a0-eb50f3774182")
public static String es_PE_FIELD_Payment_DiscountAmount_Description="Total de descuento calculado";

@XendraTrl(Identifier="12a70c12-1170-8105-25a0-eb50f3774182")
public static String es_PE_FIELD_Payment_DiscountAmount_Help="El Total descuento indica el total de descuento para un documento ó línea";

@XendraTrl(Identifier="12a70c12-1170-8105-25a0-eb50f3774182")
public static String es_PE_FIELD_Payment_DiscountAmount_Name="Total del Descuento";

@XendraField(AD_Column_ID="DiscountAmt",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@C_Invoice_ID@^''",DisplayLength=26,IsReadOnly=false,SeqNo=250,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="12a70c12-1170-8105-25a0-eb50f3774182")
public static final String FIELDNAME_Payment_DiscountAmount="12a70c12-1170-8105-25a0-eb50f3774182";

@XendraTrl(Identifier="04c9ea77-988f-b3f0-b26a-a961cb1833e1")
public static String es_PE_FIELD_PartnerPayments_DiscountAmount_Description="Total de descuento calculado";

@XendraTrl(Identifier="04c9ea77-988f-b3f0-b26a-a961cb1833e1")
public static String es_PE_FIELD_PartnerPayments_DiscountAmount_Help="El Total descuento indica el total de descuento para un documento ó línea";

@XendraTrl(Identifier="04c9ea77-988f-b3f0-b26a-a961cb1833e1")
public static String es_PE_FIELD_PartnerPayments_DiscountAmount_Name="Total del Descuento";

@XendraField(AD_Column_ID="DiscountAmt",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="04c9ea77-988f-b3f0-b26a-a961cb1833e1")
public static final String FIELDNAME_PartnerPayments_DiscountAmount="04c9ea77-988f-b3f0-b26a-a961cb1833e1";

@XendraTrl(Identifier="746d2d4d-edea-3459-2162-d458d8b62f86")
public static String es_PE_FIELD_Payment_DiscountAmount2_Description="Total de descuento calculado";

@XendraTrl(Identifier="746d2d4d-edea-3459-2162-d458d8b62f86")
public static String es_PE_FIELD_Payment_DiscountAmount2_Help="El Total descuento indica el total de descuento para un documento ó línea";

@XendraTrl(Identifier="746d2d4d-edea-3459-2162-d458d8b62f86")
public static String es_PE_FIELD_Payment_DiscountAmount2_Name="Total del Descuento";

@XendraField(AD_Column_ID="DiscountAmt",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="746d2d4d-edea-3459-2162-d458d8b62f86")
public static final String FIELDNAME_Payment_DiscountAmount2="746d2d4d-edea-3459-2162-d458d8b62f86";

@XendraTrl(Identifier="f8d6ef6d-5d2a-dc33-3836-2d6cfab3a84f")
public static String es_PE_COLUMN_DiscountAmt_Name="Total del Descuento";

@XendraColumn(AD_Element_ID="351290a4-6d07-13cb-9132-459358217d86",ColumnName="DiscountAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@C_Charge_ID@!0 | @C_Order_ID@!0",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutPayment.amounts",VFormat="",ValueMin="",ValueMax="",Version="1",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f8d6ef6d-5d2a-dc33-3836-2d6cfab3a84f",
Synchronized="2017-08-05 16:54:00.0")
/** Column name DiscountAmt */
public static final String COLUMNNAME_DiscountAmt = "DiscountAmt";

/** DocAction AD_Reference=e397c9b0-c643-d1cd-8380-20bee13b2a6e */
public static final int DOCACTION_AD_Reference_ID=135;
/** Set Document Action.
@param DocAction The targeted status of the document */
public void setDocAction (String DocAction)
{
if (DocAction == null) throw new IllegalArgumentException ("DocAction is mandatory");
if (DocAction.equals(REF__DocumentAction.Complete) || DocAction.equals(REF__DocumentAction.Approve) || DocAction.equals(REF__DocumentAction.Reject) || DocAction.equals(REF__DocumentAction.Post) || DocAction.equals(REF__DocumentAction.WaitComplete) || DocAction.equals(REF__DocumentAction.Prepare) || DocAction.equals(REF__DocumentAction.Close) || DocAction.equals(REF__DocumentAction.Placed) || DocAction.equals(REF__DocumentAction.Discount) || DocAction.equals(REF__DocumentAction.Portofolio) || DocAction.equals(REF__DocumentAction.Warranty) || DocAction.equals(REF__DocumentAction.Reverse_Correct) || DocAction.equals(REF__DocumentAction.Reverse_Accrual) || DocAction.equals(REF__DocumentAction.Invalidate) || DocAction.equals(REF__DocumentAction.Re_Activate) || DocAction.equals(REF__DocumentAction.None) || DocAction.equals(REF__DocumentAction.Unlock) || DocAction.equals(REF__DocumentAction.Returned) || DocAction.equals(REF__DocumentAction.Apply) || DocAction.equals(REF__DocumentAction.Collect) || DocAction.equals(REF__DocumentAction.ToCollect) || DocAction.equals(REF__DocumentAction.Restore) || DocAction.equals(REF__DocumentAction.Protested) || DocAction.equals(REF__DocumentAction.Receivables) || DocAction.equals(REF__DocumentAction.Void) || DocAction.equals(REF__DocumentAction.Draft) || DocAction.equals(REF__DocumentAction.InProgress) || DocAction.equals(REF__DocumentAction.WaitingPayment));
 else throw new IllegalArgumentException ("DocAction Invalid value - " + DocAction + " - Reference_ID=135 - CO - AP - RJ - PO - WC - PR - CL - PL - DS - PT - WR - RC - RA - IN - RE - -- - XL - RT - AY - CT - TC - RR - PD - RV - VO - DR - IP - WP");
if (DocAction.length() > 2)
{
log.warning("Length > 2 - truncated");
DocAction = DocAction.substring(0,1);
}
set_Value (COLUMNNAME_DocAction, DocAction);
}
/** Get Document Action.
@return The targeted status of the document */
public String getDocAction() 
{
return (String)get_Value(COLUMNNAME_DocAction);
}

@XendraTrl(Identifier="67e0f411-72b4-9ff8-248e-f28480611992")
public static String es_PE_FIELD_Payment_ProcessPayment_Name="Procesar Movimiento";

@XendraField(AD_Column_ID="DocAction",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=630,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="67e0f411-72b4-9ff8-248e-f28480611992")
public static final String FIELDNAME_Payment_ProcessPayment="67e0f411-72b4-9ff8-248e-f28480611992";

@XendraTrl(Identifier="6a400ab3-5708-60c1-9c1c-4fb7754bdada")
public static String es_PE_FIELD_PartnerPayments_ProcessPayment_Name="Procesar Pago";

@XendraField(AD_Column_ID="DocAction",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6a400ab3-5708-60c1-9c1c-4fb7754bdada")
public static final String FIELDNAME_PartnerPayments_ProcessPayment="6a400ab3-5708-60c1-9c1c-4fb7754bdada";

@XendraTrl(Identifier="88db63e7-85cc-77d0-5328-ca444328698b")
public static String es_PE_FIELD_Payment_ProcessPayment2_Name="Procesar Pago";

@XendraField(AD_Column_ID="DocAction",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="88db63e7-85cc-77d0-5328-ca444328698b")
public static final String FIELDNAME_Payment_ProcessPayment2="88db63e7-85cc-77d0-5328-ca444328698b";

@XendraTrl(Identifier="9b2eca35-206c-87ea-c96e-7bf3e80a5df8")
public static String es_PE_COLUMN_DocAction_Name="Acción en el Documento";

@XendraColumn(AD_Element_ID="d4b9075b-18e5-ebbb-5565-d217a7e531cb",ColumnName="DocAction",
AD_Reference_ID=28,AD_Reference_Value_ID="e397c9b0-c643-d1cd-8380-20bee13b2a6e",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="CO",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,
AD_Process_ID="5f953611-ddcc-1533-5c07-613d54d9b496",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9b2eca35-206c-87ea-c96e-7bf3e80a5df8",
Synchronized="2017-08-05 16:54:00.0")
/** Column name DocAction */
public static final String COLUMNNAME_DocAction = "DocAction";

/** DocStatus AD_Reference=7627125d-fefe-e6bc-bb7d-4a6c772172dc */
public static final int DOCSTATUS_AD_Reference_ID=131;
/** Set Document Status.
@param DocStatus The current status of the document */
public void setDocStatus (String DocStatus)
{
if (DocStatus == null) throw new IllegalArgumentException ("DocStatus is mandatory");
if (DocStatus.equals(REF__DocumentStatus.InProgress) || DocStatus.equals(REF__DocumentStatus.WaitingConfirmation) || DocStatus.equals(REF__DocumentStatus.Drafted) || DocStatus.equals(REF__DocumentStatus.Completed) || DocStatus.equals(REF__DocumentStatus.Approved) || DocStatus.equals(REF__DocumentStatus.WaitingPayment) || DocStatus.equals(REF__DocumentStatus.Placed) || DocStatus.equals(REF__DocumentStatus.Returned) || DocStatus.equals(REF__DocumentStatus.Discount) || DocStatus.equals(REF__DocumentStatus.Protested) || DocStatus.equals(REF__DocumentStatus.NotApproved) || DocStatus.equals(REF__DocumentStatus.Voided) || DocStatus.equals(REF__DocumentStatus.Invalid) || DocStatus.equals(REF__DocumentStatus.Reversed) || DocStatus.equals(REF__DocumentStatus.Closed) || DocStatus.equals(REF__DocumentStatus.Unknown) || DocStatus.equals(REF__DocumentStatus.Portfolio) || DocStatus.equals(REF__DocumentStatus.Warranty) || DocStatus.equals(REF__DocumentStatus.ToCollect) || DocStatus.equals(REF__DocumentStatus.Collect) || DocStatus.equals(REF__DocumentStatus.Receivables) || DocStatus.equals(REF__DocumentStatus.Apply));
 else throw new IllegalArgumentException ("DocStatus Invalid value - " + DocStatus + " - Reference_ID=131 - IP - WC - DR - CO - AP - WP - PL - RT - DS - PD - NA - VO - IN - RE - CL - ?? - PT - WR - TC - CT - RV - AY");
if (DocStatus.length() > 2)
{
log.warning("Length > 2 - truncated");
DocStatus = DocStatus.substring(0,1);
}
set_Value (COLUMNNAME_DocStatus, DocStatus);
}
/** Get Document Status.
@return The current status of the document */
public String getDocStatus() 
{
return (String)get_Value(COLUMNNAME_DocStatus);
}

@XendraTrl(Identifier="8893c413-e973-162d-d290-964344ea1125")
public static String es_PE_FIELD_Payment_DocumentStatus_Description="El estado actual del documento";

@XendraTrl(Identifier="8893c413-e973-162d-d290-964344ea1125")
public static String es_PE_FIELD_Payment_DocumentStatus_Help="El estado del documento indica el estado del documento en este momento. Si usted quiere cambiar el estado de Documento; use el campo acción de documento";

@XendraTrl(Identifier="8893c413-e973-162d-d290-964344ea1125")
public static String es_PE_FIELD_Payment_DocumentStatus_Name="Estado del Documento";

@XendraField(AD_Column_ID="DocStatus",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=620,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8893c413-e973-162d-d290-964344ea1125")
public static final String FIELDNAME_Payment_DocumentStatus="8893c413-e973-162d-d290-964344ea1125";

@XendraTrl(Identifier="c5496ba8-0025-6af7-114b-58b023db645a")
public static String es_PE_FIELD_PartnerPayments_DocumentStatus_Description="El estado actual del documento";

@XendraTrl(Identifier="c5496ba8-0025-6af7-114b-58b023db645a")
public static String es_PE_FIELD_PartnerPayments_DocumentStatus_Help="El estado del documento indica el estado del documento en este momento. Si usted quiere cambiar el estado de Documento; use el campo acción de documento";

@XendraTrl(Identifier="c5496ba8-0025-6af7-114b-58b023db645a")
public static String es_PE_FIELD_PartnerPayments_DocumentStatus_Name="Estado del Documento";

@XendraField(AD_Column_ID="DocStatus",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c5496ba8-0025-6af7-114b-58b023db645a")
public static final String FIELDNAME_PartnerPayments_DocumentStatus="c5496ba8-0025-6af7-114b-58b023db645a";

@XendraTrl(Identifier="c966a39f-dd19-ba8e-b20f-88634a9cd71f")
public static String es_PE_FIELD_Payment_DocumentStatus2_Description="El estado actual del documento";

@XendraTrl(Identifier="c966a39f-dd19-ba8e-b20f-88634a9cd71f")
public static String es_PE_FIELD_Payment_DocumentStatus2_Help="El estado del documento indica el estado del documento en este momento. Si usted quiere cambiar el estado de Documento; use el campo acción de documento";

@XendraTrl(Identifier="c966a39f-dd19-ba8e-b20f-88634a9cd71f")
public static String es_PE_FIELD_Payment_DocumentStatus2_Name="Estado del Documento";

@XendraField(AD_Column_ID="DocStatus",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c966a39f-dd19-ba8e-b20f-88634a9cd71f")
public static final String FIELDNAME_Payment_DocumentStatus2="c966a39f-dd19-ba8e-b20f-88634a9cd71f";

@XendraTrl(Identifier="dc61f617-eb25-f6f0-46bd-0353894c5d63")
public static String es_PE_COLUMN_DocStatus_Name="Estado del Documento";

@XendraColumn(AD_Element_ID="e73fa537-3438-bd01-dfd4-f0f080a28c55",ColumnName="DocStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="7627125d-fefe-e6bc-bb7d-4a6c772172dc",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="DR",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="dc61f617-eb25-f6f0-46bd-0353894c5d63",Synchronized="2017-08-05 16:54:00.0")
/** Column name DocStatus */
public static final String COLUMNNAME_DocStatus = "DocStatus";
/** Set Document No.
@param DocumentNo Document sequence number of the document */
public void setDocumentNo (String DocumentNo)
{
if (DocumentNo == null) throw new IllegalArgumentException ("DocumentNo is mandatory.");
if (DocumentNo.length() > 30)
{
log.warning("Length > 30 - truncated");
DocumentNo = DocumentNo.substring(0,29);
}
set_Value (COLUMNNAME_DocumentNo, DocumentNo);
}
/** Get Document No.
@return Document sequence number of the document */
public String getDocumentNo() 
{
String value = (String)get_Value(COLUMNNAME_DocumentNo);
if (value == null)
  return "";
return value;
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getDocumentNo());
}

@XendraTrl(Identifier="44ee2c89-4e5c-3084-abba-a4ed949f30f9")
public static String es_PE_FIELD_Payment_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="44ee2c89-4e5c-3084-abba-a4ed949f30f9")
public static String es_PE_FIELD_Payment_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraTrl(Identifier="44ee2c89-4e5c-3084-abba-a4ed949f30f9")
public static String es_PE_FIELD_Payment_DocumentNo_Name="No.";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=30,SortNo=-1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="44ee2c89-4e5c-3084-abba-a4ed949f30f9")
public static final String FIELDNAME_Payment_DocumentNo="44ee2c89-4e5c-3084-abba-a4ed949f30f9";

@XendraTrl(Identifier="907314ff-2dc8-3f3e-90c2-7973797576b2")
public static String es_PE_FIELD_PartnerPayments_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="907314ff-2dc8-3f3e-90c2-7973797576b2")
public static String es_PE_FIELD_PartnerPayments_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraTrl(Identifier="907314ff-2dc8-3f3e-90c2-7973797576b2")
public static String es_PE_FIELD_PartnerPayments_DocumentNo_Name="No. del Documento";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=50,SortNo=2,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="907314ff-2dc8-3f3e-90c2-7973797576b2")
public static final String FIELDNAME_PartnerPayments_DocumentNo="907314ff-2dc8-3f3e-90c2-7973797576b2";

@XendraTrl(Identifier="03cf6f1e-4613-766e-fc5e-2ee0afa1648b")
public static String es_PE_FIELD_Payment_DocumentNo2_Description="Document sequence number of the document";

@XendraTrl(Identifier="03cf6f1e-4613-766e-fc5e-2ee0afa1648b")
public static String es_PE_FIELD_Payment_DocumentNo2_Help="The document number is usually automatically generated by the system and determined by the document type of the document. If the document is not saved, the preliminary number is displayed in \"<>\".If the document type of your document has no automatic document sequence defined, the field is empty if you create a new document. This is for documents which usually have an external number (like vendor invoice).  If you leave the field empty, the system will generate a document number for you. The document sequence used for this fallback number is defined in the \"Maintain Sequence\" window with the name \"DocumentNo_<TableName>\", where TableName is the actual name of the table (e.g. C_Order).";

@XendraTrl(Identifier="03cf6f1e-4613-766e-fc5e-2ee0afa1648b")
public static String es_PE_FIELD_Payment_DocumentNo2_Name="Documento No";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=false,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="03cf6f1e-4613-766e-fc5e-2ee0afa1648b")
public static final String FIELDNAME_Payment_DocumentNo2="03cf6f1e-4613-766e-fc5e-2ee0afa1648b";

@XendraTrl(Identifier="86041989-02c2-e745-85ce-f7b25ba87763")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="86041989-02c2-e745-85ce-f7b25ba87763",
Synchronized="2017-08-05 16:54:00.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";
/** Set Accounting Fact ID (per document).
@param Fact_ID This ID is guaranteed to be unique per client per year per document (in the fact table). */
public void setFact_ID (String Fact_ID)
{
if (Fact_ID != null && Fact_ID.length() > 20)
{
log.warning("Length > 20 - truncated");
Fact_ID = Fact_ID.substring(0,19);
}
set_ValueNoCheck (COLUMNNAME_Fact_ID, Fact_ID);
}
/** Get Accounting Fact ID (per document).
@return This ID is guaranteed to be unique per client per year per document (in the fact table). */
public String getFact_ID() 
{
String value = (String)get_Value(COLUMNNAME_Fact_ID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ed7eb1e3-5e13-f0c1-ee7d-af9b99b2bfb7")
public static String es_PE_FIELD_Payment_AccountingFactIDPerDocument_Description="Se garantiza que este ID sea unico por cada cliente/ano/documento (en la tabla de asientos).";

@XendraTrl(Identifier="ed7eb1e3-5e13-f0c1-ee7d-af9b99b2bfb7")
public static String es_PE_FIELD_Payment_AccountingFactIDPerDocument_Name="ID Asiento Contable";

@XendraField(AD_Column_ID="Fact_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=680,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ed7eb1e3-5e13-f0c1-ee7d-af9b99b2bfb7")
public static final String FIELDNAME_Payment_AccountingFactIDPerDocument="ed7eb1e3-5e13-f0c1-ee7d-af9b99b2bfb7";

@XendraTrl(Identifier="ae65402f-7533-788f-9d65-43357c834924")
public static String es_PE_COLUMN_Fact_ID_Name="ID Asiento Contable (por documento)";

@XendraColumn(AD_Element_ID="20f6c8ee-0151-735b-7a03-2006e09d8eb0",ColumnName="Fact_ID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ae65402f-7533-788f-9d65-43357c834924",
Synchronized="2017-08-05 16:54:00.0")
/** Column name Fact_ID */
public static final String COLUMNNAME_Fact_ID = "Fact_ID";
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
@XendraTrl(Identifier="d3c0d696-006f-4110-9f4d-1fac50b7a2c6")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d3c0d696-006f-4110-9f4d-1fac50b7a2c6",
Synchronized="2017-08-05 16:54:00.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Allocated.
@param IsAllocated Indicates if the payment has been allocated */
public void setIsAllocated (boolean IsAllocated)
{
set_Value (COLUMNNAME_IsAllocated, Boolean.valueOf(IsAllocated));
}
/** Get Allocated.
@return Indicates if the payment has been allocated */
public boolean isAllocated() 
{
Object oo = get_Value(COLUMNNAME_IsAllocated);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="79c56fcf-c7ad-38de-bd02-4593f59de85e")
public static String es_PE_FIELD_Payment_Allocated_Description="Indica si el pago ha sido asignado";

@XendraTrl(Identifier="79c56fcf-c7ad-38de-bd02-4593f59de85e")
public static String es_PE_FIELD_Payment_Allocated_Help="El cuadro de verificación Asignado indica si el pago ha sido asignado o asociado con una factura o facturas";

@XendraTrl(Identifier="79c56fcf-c7ad-38de-bd02-4593f59de85e")
public static String es_PE_FIELD_Payment_Allocated_Name="Asignado";

@XendraField(AD_Column_ID="IsAllocated",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Processed@=Y",DisplayLength=1,IsReadOnly=true,SeqNo=670,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="79c56fcf-c7ad-38de-bd02-4593f59de85e")
public static final String FIELDNAME_Payment_Allocated="79c56fcf-c7ad-38de-bd02-4593f59de85e";

@XendraTrl(Identifier="895f3e92-63ad-64e8-4ece-9a1a333d069a")
public static String es_PE_FIELD_PartnerPayments_Allocated_Description="Indica si el pago ha sido asignado";

@XendraTrl(Identifier="895f3e92-63ad-64e8-4ece-9a1a333d069a")
public static String es_PE_FIELD_PartnerPayments_Allocated_Help="El cuadro de verificación Asignado indica si el pago ha sido asignado o asociado con una factura o facturas";

@XendraTrl(Identifier="895f3e92-63ad-64e8-4ece-9a1a333d069a")
public static String es_PE_FIELD_PartnerPayments_Allocated_Name="Asignado";

@XendraField(AD_Column_ID="IsAllocated",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="895f3e92-63ad-64e8-4ece-9a1a333d069a")
public static final String FIELDNAME_PartnerPayments_Allocated="895f3e92-63ad-64e8-4ece-9a1a333d069a";

@XendraTrl(Identifier="15a0db4e-259b-c771-a7ed-09bc00dd9f38")
public static String es_PE_FIELD_Payment_Allocated2_Description="Indica si el pago ha sido asignado";

@XendraTrl(Identifier="15a0db4e-259b-c771-a7ed-09bc00dd9f38")
public static String es_PE_FIELD_Payment_Allocated2_Help="El cuadro de verificación Asignado indica si el pago ha sido asignado o asociado con una factura o facturas";

@XendraTrl(Identifier="15a0db4e-259b-c771-a7ed-09bc00dd9f38")
public static String es_PE_FIELD_Payment_Allocated2_Name="Asignado";

@XendraField(AD_Column_ID="IsAllocated",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="15a0db4e-259b-c771-a7ed-09bc00dd9f38")
public static final String FIELDNAME_Payment_Allocated2="15a0db4e-259b-c771-a7ed-09bc00dd9f38";

@XendraTrl(Identifier="4556010a-cfa5-855e-d1f0-fad26fd24c39")
public static String es_PE_COLUMN_IsAllocated_Name="Asignado";

@XendraColumn(AD_Element_ID="9e224a32-8f75-7921-819b-e891efaf4226",ColumnName="IsAllocated",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4556010a-cfa5-855e-d1f0-fad26fd24c39",
Synchronized="2017-08-05 16:54:00.0")
/** Column name IsAllocated */
public static final String COLUMNNAME_IsAllocated = "IsAllocated";
/** Set Approved.
@param IsApproved Indicates if this document requires approval */
public void setIsApproved (boolean IsApproved)
{
set_ValueNoCheck (COLUMNNAME_IsApproved, Boolean.valueOf(IsApproved));
}
/** Get Approved.
@return Indicates if this document requires approval */
public boolean isApproved() 
{
Object oo = get_Value(COLUMNNAME_IsApproved);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="3a32688e-1901-7899-aee1-0e2f6da9f0cf")
public static String es_PE_FIELD_Payment_Approved_Description="Indica si este documento requiere aprobación";

@XendraTrl(Identifier="3a32688e-1901-7899-aee1-0e2f6da9f0cf")
public static String es_PE_FIELD_Payment_Approved_Help="El Cuadro de Verificación  Aprobado indica si este documento requiere aprobación antes de que pueda ser procesado";

@XendraTrl(Identifier="3a32688e-1901-7899-aee1-0e2f6da9f0cf")
public static String es_PE_FIELD_Payment_Approved_Name="Aprobación";

@XendraField(AD_Column_ID="IsApproved",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="@IsTransfer@!Y & @IsOnline@=Y",DisplayLength=1,IsReadOnly=true,SeqNo=550,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="3a32688e-1901-7899-aee1-0e2f6da9f0cf")
public static final String FIELDNAME_Payment_Approved="3a32688e-1901-7899-aee1-0e2f6da9f0cf";

@XendraTrl(Identifier="4c3aa153-299b-fdd0-3e95-bc67977ed3f6")
public static String es_PE_FIELD_PartnerPayments_Approved_Description="Indica si este documento requiere aprobación";

@XendraTrl(Identifier="4c3aa153-299b-fdd0-3e95-bc67977ed3f6")
public static String es_PE_FIELD_PartnerPayments_Approved_Help="El Cuadro de Verificación  Aprobado indica si este documento requiere aprobación antes de que pueda ser procesado";

@XendraTrl(Identifier="4c3aa153-299b-fdd0-3e95-bc67977ed3f6")
public static String es_PE_FIELD_PartnerPayments_Approved_Name="Aprobación";

@XendraField(AD_Column_ID="IsApproved",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4c3aa153-299b-fdd0-3e95-bc67977ed3f6")
public static final String FIELDNAME_PartnerPayments_Approved="4c3aa153-299b-fdd0-3e95-bc67977ed3f6";

@XendraTrl(Identifier="b6560f6b-c203-ea6a-b182-eb9a2002d662")
public static String es_PE_FIELD_Payment_Approved2_Description="Indica si este documento requiere aprobación";

@XendraTrl(Identifier="b6560f6b-c203-ea6a-b182-eb9a2002d662")
public static String es_PE_FIELD_Payment_Approved2_Help="El Cuadro de Verificación  Aprobado indica si este documento requiere aprobación antes de que pueda ser procesado";

@XendraTrl(Identifier="b6560f6b-c203-ea6a-b182-eb9a2002d662")
public static String es_PE_FIELD_Payment_Approved2_Name="Aprobación";

@XendraField(AD_Column_ID="IsApproved",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b6560f6b-c203-ea6a-b182-eb9a2002d662")
public static final String FIELDNAME_Payment_Approved2="b6560f6b-c203-ea6a-b182-eb9a2002d662";

@XendraTrl(Identifier="154c1ebe-5468-ed67-a135-5bba271c8a4f")
public static String es_PE_COLUMN_IsApproved_Name="Aprobación";

@XendraColumn(AD_Element_ID="44388d99-07b7-b005-9e16-78884800beff",ColumnName="IsApproved",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="154c1ebe-5468-ed67-a135-5bba271c8a4f",
Synchronized="2017-08-05 16:54:00.0")
/** Column name IsApproved */
public static final String COLUMNNAME_IsApproved = "IsApproved";
/** Set Delayed Capture.
@param IsDelayedCapture Charge after Shipment */
public void setIsDelayedCapture (boolean IsDelayedCapture)
{
set_Value (COLUMNNAME_IsDelayedCapture, Boolean.valueOf(IsDelayedCapture));
}
/** Get Delayed Capture.
@return Charge after Shipment */
public boolean isDelayedCapture() 
{
Object oo = get_Value(COLUMNNAME_IsDelayedCapture);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="ba89a4d9-a0ea-b724-94d2-ec837bc475c2")
public static String es_PE_FIELD_Payment_DelayedCapture_Description="Cargo despues del envio";

@XendraTrl(Identifier="ba89a4d9-a0ea-b724-94d2-ec837bc475c2")
public static String es_PE_FIELD_Payment_DelayedCapture_Help="Se requiere la captura retrasada, si usted envía productos. La primera transacción de la tarjeta de crédito es la autorización, el segundo es la transacción real después del envío del producto.";

@XendraTrl(Identifier="ba89a4d9-a0ea-b724-94d2-ec837bc475c2")
public static String es_PE_FIELD_Payment_DelayedCapture_Name="Captura Retardada";

@XendraField(AD_Column_ID="IsDelayedCapture",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ba89a4d9-a0ea-b724-94d2-ec837bc475c2")
public static final String FIELDNAME_Payment_DelayedCapture="ba89a4d9-a0ea-b724-94d2-ec837bc475c2";

@XendraTrl(Identifier="896791fa-1fa4-b788-d670-2c6b65004a00")
public static String es_PE_FIELD_PartnerPayments_DelayedCapture_Description="Cargo despues del envio";

@XendraTrl(Identifier="896791fa-1fa4-b788-d670-2c6b65004a00")
public static String es_PE_FIELD_PartnerPayments_DelayedCapture_Help="Se requiere la captura retrasada, si usted envía productos. La primera transacción de la tarjeta de crédito es la autorización, el segundo es la transacción real después del envío del producto.";

@XendraTrl(Identifier="896791fa-1fa4-b788-d670-2c6b65004a00")
public static String es_PE_FIELD_PartnerPayments_DelayedCapture_Name="Captura Retardada";

@XendraField(AD_Column_ID="IsDelayedCapture",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="896791fa-1fa4-b788-d670-2c6b65004a00")
public static final String FIELDNAME_PartnerPayments_DelayedCapture="896791fa-1fa4-b788-d670-2c6b65004a00";

@XendraTrl(Identifier="013275c8-ba37-f301-3e67-e947cc7836a8")
public static String es_PE_FIELD_Payment_DelayedCapture2_Description="Cargo despues del envio";

@XendraTrl(Identifier="013275c8-ba37-f301-3e67-e947cc7836a8")
public static String es_PE_FIELD_Payment_DelayedCapture2_Help="Se requiere la captura retrasada, si usted envía productos. La primera transacción de la tarjeta de crédito es la autorización, el segundo es la transacción real después del envío del producto.";

@XendraTrl(Identifier="013275c8-ba37-f301-3e67-e947cc7836a8")
public static String es_PE_FIELD_Payment_DelayedCapture2_Name="Captura Retardada";

@XendraField(AD_Column_ID="IsDelayedCapture",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="013275c8-ba37-f301-3e67-e947cc7836a8")
public static final String FIELDNAME_Payment_DelayedCapture2="013275c8-ba37-f301-3e67-e947cc7836a8";

@XendraTrl(Identifier="37c5818d-4cf2-9ae0-f3d0-ba748ab4e9bb")
public static String es_PE_COLUMN_IsDelayedCapture_Name="Captura Retardada";

@XendraColumn(AD_Element_ID="badfa246-719d-629f-87ac-4f1f66feb16c",ColumnName="IsDelayedCapture",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="37c5818d-4cf2-9ae0-f3d0-ba748ab4e9bb",
Synchronized="2017-08-05 16:54:00.0")
/** Column name IsDelayedCapture */
public static final String COLUMNNAME_IsDelayedCapture = "IsDelayedCapture";
/** Set Online Access.
@param IsOnline Can be accessed online  */
public void setIsOnline (boolean IsOnline)
{
set_Value (COLUMNNAME_IsOnline, Boolean.valueOf(IsOnline));
}
/** Get Online Access.
@return Can be accessed online  */
public boolean isOnline() 
{
Object oo = get_Value(COLUMNNAME_IsOnline);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f410346e-ff4a-9c6f-a1c7-c12b7a88fd2e")
public static String es_PE_FIELD_Payment_OnlineAccess_Description="Puede ser accedido en línea";

@XendraTrl(Identifier="f410346e-ff4a-9c6f-a1c7-c12b7a88fd2e")
public static String es_PE_FIELD_Payment_OnlineAccess_Help="El cuadro de verificación Acceso en Línea indica si la aplicación puede ser accedida vía Web";

@XendraTrl(Identifier="f410346e-ff4a-9c6f-a1c7-c12b7a88fd2e")
public static String es_PE_FIELD_Payment_OnlineAccess_Name="Acceso en Línea";

@XendraField(AD_Column_ID="IsOnline",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsTransfer@!Y ",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f410346e-ff4a-9c6f-a1c7-c12b7a88fd2e")
public static final String FIELDNAME_Payment_OnlineAccess="f410346e-ff4a-9c6f-a1c7-c12b7a88fd2e";

@XendraTrl(Identifier="3e478b3f-bab4-7271-753b-30e8f7d957c3")
public static String es_PE_FIELD_PartnerPayments_OnlineAccess_Description="Puede ser accedido en línea";

@XendraTrl(Identifier="3e478b3f-bab4-7271-753b-30e8f7d957c3")
public static String es_PE_FIELD_PartnerPayments_OnlineAccess_Help="El cuadro de verificación Acceso en Línea indica si la aplicación puede ser accedida vía Web";

@XendraTrl(Identifier="3e478b3f-bab4-7271-753b-30e8f7d957c3")
public static String es_PE_FIELD_PartnerPayments_OnlineAccess_Name="Acceso en Línea";

@XendraField(AD_Column_ID="IsOnline",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3e478b3f-bab4-7271-753b-30e8f7d957c3")
public static final String FIELDNAME_PartnerPayments_OnlineAccess="3e478b3f-bab4-7271-753b-30e8f7d957c3";

@XendraTrl(Identifier="487b6b2b-9a0a-12dc-f3e3-bd41c63a4cb7")
public static String es_PE_FIELD_Payment_OnlineAccess2_Description="Puede ser accedido en línea";

@XendraTrl(Identifier="487b6b2b-9a0a-12dc-f3e3-bd41c63a4cb7")
public static String es_PE_FIELD_Payment_OnlineAccess2_Help="El cuadro de verificación Acceso en Línea indica si la aplicación puede ser accedida vía Web";

@XendraTrl(Identifier="487b6b2b-9a0a-12dc-f3e3-bd41c63a4cb7")
public static String es_PE_FIELD_Payment_OnlineAccess2_Name="Acceso en Línea";

@XendraField(AD_Column_ID="IsOnline",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="487b6b2b-9a0a-12dc-f3e3-bd41c63a4cb7")
public static final String FIELDNAME_Payment_OnlineAccess2="487b6b2b-9a0a-12dc-f3e3-bd41c63a4cb7";

@XendraTrl(Identifier="a43d13bd-a37c-c3c5-7001-4bb36268e22e")
public static String es_PE_COLUMN_IsOnline_Name="Acceso en Línea";

@XendraColumn(AD_Element_ID="d3476294-0798-5c86-0094-339a26eac62c",ColumnName="IsOnline",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,
ReadOnlyLogic="@IsApproved@=Y",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",
ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a43d13bd-a37c-c3c5-7001-4bb36268e22e",Synchronized="2017-08-05 16:54:00.0")
/** Column name IsOnline */
public static final String COLUMNNAME_IsOnline = "IsOnline";
/** Set Over/Under Payment.
@param IsOverUnderPayment Over-Payment (unallocated) or Under-Payment (partial payment) */
public void setIsOverUnderPayment (boolean IsOverUnderPayment)
{
set_Value (COLUMNNAME_IsOverUnderPayment, Boolean.valueOf(IsOverUnderPayment));
}
/** Get Over/Under Payment.
@return Over-Payment (unallocated) or Under-Payment (partial payment) */
public boolean isOverUnderPayment() 
{
Object oo = get_Value(COLUMNNAME_IsOverUnderPayment);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="5d5f8cd9-7ecb-8b30-8336-ec735fb30c5e")
public static String es_PE_FIELD_Payment_OverUnderPayment_Description="Sobre pago (no contabilizado) ó sub pago (pago parcial)";

@XendraTrl(Identifier="5d5f8cd9-7ecb-8b30-8336-ec735fb30c5e")
public static String es_PE_FIELD_Payment_OverUnderPayment_Help="Sobre pagos (negativos) son totales no contabilizados y permiten recibir dinero por totales superiores a una factura particular. Sub pagos (positivo) es un pago parcial de una factura. No se saca de libros la cantidad no pagada.";

@XendraTrl(Identifier="5d5f8cd9-7ecb-8b30-8336-ec735fb30c5e")
public static String es_PE_FIELD_Payment_OverUnderPayment_Name="Sobre/sub pago";

@XendraField(AD_Column_ID="IsOverUnderPayment",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@C_Invoice_ID@^''",DisplayLength=1,IsReadOnly=false,SeqNo=270,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="5d5f8cd9-7ecb-8b30-8336-ec735fb30c5e")
public static final String FIELDNAME_Payment_OverUnderPayment="5d5f8cd9-7ecb-8b30-8336-ec735fb30c5e";

@XendraTrl(Identifier="0dd4c2ab-2563-064c-26ee-5f1591e95c36")
public static String es_PE_FIELD_PartnerPayments_OverUnderPayment_Description="Sobre pago (no contabilizado) ó sub pago (pago parcial)";

@XendraTrl(Identifier="0dd4c2ab-2563-064c-26ee-5f1591e95c36")
public static String es_PE_FIELD_PartnerPayments_OverUnderPayment_Help="Sobre pagos (negativos) son totales no contabilizados y permiten recibir dinero por totales superiores a una factura particular. Sub pagos (positivo) es un pago parcial de una factura. No se saca de libros la cantidad no pagada.";

@XendraTrl(Identifier="0dd4c2ab-2563-064c-26ee-5f1591e95c36")
public static String es_PE_FIELD_PartnerPayments_OverUnderPayment_Name="Sobre/sub pago";

@XendraField(AD_Column_ID="IsOverUnderPayment",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0dd4c2ab-2563-064c-26ee-5f1591e95c36")
public static final String FIELDNAME_PartnerPayments_OverUnderPayment="0dd4c2ab-2563-064c-26ee-5f1591e95c36";

@XendraTrl(Identifier="a98babb0-37f0-ec47-6c10-07b1321ce5f1")
public static String es_PE_FIELD_Payment_OverUnderPayment2_Description="Sobre pago (no contabilizado) ó sub pago (pago parcial)";

@XendraTrl(Identifier="a98babb0-37f0-ec47-6c10-07b1321ce5f1")
public static String es_PE_FIELD_Payment_OverUnderPayment2_Help="Sobre pagos (negativos) son totales no contabilizados y permiten recibir dinero por totales superiores a una factura particular. Sub pagos (positivo) es un pago parcial de una factura. No se saca de libros la cantidad no pagada.";

@XendraTrl(Identifier="a98babb0-37f0-ec47-6c10-07b1321ce5f1")
public static String es_PE_FIELD_Payment_OverUnderPayment2_Name="Sobre/sub pago";

@XendraField(AD_Column_ID="IsOverUnderPayment",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a98babb0-37f0-ec47-6c10-07b1321ce5f1")
public static final String FIELDNAME_Payment_OverUnderPayment2="a98babb0-37f0-ec47-6c10-07b1321ce5f1";

@XendraTrl(Identifier="0f38c730-2ef9-1886-7b4f-1d5bf4608988")
public static String es_PE_COLUMN_IsOverUnderPayment_Name="Sobre/sub pago";

@XendraColumn(AD_Element_ID="2c24379d-5a56-e5ee-c09f-632905d4e52f",ColumnName="IsOverUnderPayment",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,
ReadOnlyLogic="@C_Charge_ID@!0 | @C_Order_ID@!0",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutPayment.amounts",VFormat="",ValueMin="",ValueMax="",Version="0",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0f38c730-2ef9-1886-7b4f-1d5bf4608988",
Synchronized="2017-08-05 16:54:00.0")
/** Column name IsOverUnderPayment */
public static final String COLUMNNAME_IsOverUnderPayment = "IsOverUnderPayment";
/** Set Prepayment.
@param IsPrepayment The Payment/Receipt is a Prepayment */
public void setIsPrepayment (boolean IsPrepayment)
{
set_Value (COLUMNNAME_IsPrepayment, Boolean.valueOf(IsPrepayment));
}
/** Get Prepayment.
@return The Payment/Receipt is a Prepayment */
public boolean isPrepayment() 
{
Object oo = get_Value(COLUMNNAME_IsPrepayment);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="42527dd8-606f-0e71-38b1-bd79150cf688")
public static String es_PE_FIELD_Payment_Prepayment_Description="El Pago/Recibo es un prepago.";

@XendraTrl(Identifier="42527dd8-606f-0e71-38b1-bd79150cf688")
public static String es_PE_FIELD_Payment_Prepayment_Help="Los pagos no asignados a una factura se fijan con una carga para la asignación de pago. Al fijar esta asignación el pago se fija a la cuenta de pago adelantado del cliente ó del proveedor.";

@XendraTrl(Identifier="42527dd8-606f-0e71-38b1-bd79150cf688")
public static String es_PE_FIELD_Payment_Prepayment_Name="Prepago";

@XendraField(AD_Column_ID="IsPrepayment",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@IsTransfer@!Y",DisplayLength=1,IsReadOnly=true,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="42527dd8-606f-0e71-38b1-bd79150cf688")
public static final String FIELDNAME_Payment_Prepayment="42527dd8-606f-0e71-38b1-bd79150cf688";

@XendraTrl(Identifier="6255bc95-efea-a035-9228-f8ffacc9ae9b")
public static String es_PE_FIELD_PartnerPayments_Prepayment_Description="El Pago/Recibo es un prepago.";

@XendraTrl(Identifier="6255bc95-efea-a035-9228-f8ffacc9ae9b")
public static String es_PE_FIELD_PartnerPayments_Prepayment_Help="Los pagos no asignados a una factura se fijan con una carga para la asignación de pago. Al fijar esta asignación el pago se fija a la cuenta de pago adelantado del cliente ó del proveedor.";

@XendraTrl(Identifier="6255bc95-efea-a035-9228-f8ffacc9ae9b")
public static String es_PE_FIELD_PartnerPayments_Prepayment_Name="Prepago";

@XendraField(AD_Column_ID="IsPrepayment",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6255bc95-efea-a035-9228-f8ffacc9ae9b")
public static final String FIELDNAME_PartnerPayments_Prepayment="6255bc95-efea-a035-9228-f8ffacc9ae9b";

@XendraTrl(Identifier="8cc241fb-ab07-cecb-5ad1-1eeaba6143fa")
public static String es_PE_FIELD_Payment_Prepayment2_Description="El Pago/Recibo es un prepago.";

@XendraTrl(Identifier="8cc241fb-ab07-cecb-5ad1-1eeaba6143fa")
public static String es_PE_FIELD_Payment_Prepayment2_Help="Los pagos no asignados a una factura se fijan con una carga para la asignación de pago. Al fijar esta asignación el pago se fija a la cuenta de pago adelantado del cliente ó del proveedor.";

@XendraTrl(Identifier="8cc241fb-ab07-cecb-5ad1-1eeaba6143fa")
public static String es_PE_FIELD_Payment_Prepayment2_Name="Prepago";

@XendraField(AD_Column_ID="IsPrepayment",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8cc241fb-ab07-cecb-5ad1-1eeaba6143fa")
public static final String FIELDNAME_Payment_Prepayment2="8cc241fb-ab07-cecb-5ad1-1eeaba6143fa";

@XendraTrl(Identifier="6a91ad5d-ddec-706e-8212-9380216115b7")
public static String es_PE_COLUMN_IsPrepayment_Name="Prepago";

@XendraColumn(AD_Element_ID="e1a3173b-edea-2b50-947e-f2116229e34b",ColumnName="IsPrepayment",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6a91ad5d-ddec-706e-8212-9380216115b7",
Synchronized="2017-08-05 16:54:00.0")
/** Column name IsPrepayment */
public static final String COLUMNNAME_IsPrepayment = "IsPrepayment";
/** Set Receipt.
@param IsReceipt This is a sales transaction (receipt) */
public void setIsReceipt (boolean IsReceipt)
{
set_Value (COLUMNNAME_IsReceipt, Boolean.valueOf(IsReceipt));
}
/** Get Receipt.
@return This is a sales transaction (receipt) */
public boolean isReceipt() 
{
Object oo = get_Value(COLUMNNAME_IsReceipt);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="b38a8152-05c4-a32a-e0c4-7cf00414df3a")
public static String es_PE_FIELD_Payment_Receipt_Description="Ésta es una transacción de ventas (Cobros)";

@XendraTrl(Identifier="b38a8152-05c4-a32a-e0c4-7cf00414df3a")
public static String es_PE_FIELD_Payment_Receipt_Name="Cobros";

@XendraField(AD_Column_ID="IsReceipt",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=650,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b38a8152-05c4-a32a-e0c4-7cf00414df3a")
public static final String FIELDNAME_Payment_Receipt="b38a8152-05c4-a32a-e0c4-7cf00414df3a";

@XendraTrl(Identifier="b6b44288-effc-7e60-71f8-3a1c0623917f")
public static String es_PE_FIELD_PartnerPayments_Receipt_Description="Ésta es una transacción de ventas (Cobros)";

@XendraTrl(Identifier="b6b44288-effc-7e60-71f8-3a1c0623917f")
public static String es_PE_FIELD_PartnerPayments_Receipt_Name="Cobros";

@XendraField(AD_Column_ID="IsReceipt",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b6b44288-effc-7e60-71f8-3a1c0623917f")
public static final String FIELDNAME_PartnerPayments_Receipt="b6b44288-effc-7e60-71f8-3a1c0623917f";

@XendraTrl(Identifier="70f51412-8eb7-22e7-e9d5-6d94d527e1f5")
public static String es_PE_FIELD_Payment_Receipt2_Description="Ésta es una transacción de ventas (Cobros)";

@XendraTrl(Identifier="70f51412-8eb7-22e7-e9d5-6d94d527e1f5")
public static String es_PE_FIELD_Payment_Receipt2_Name="Cobros";

@XendraField(AD_Column_ID="IsReceipt",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="70f51412-8eb7-22e7-e9d5-6d94d527e1f5")
public static final String FIELDNAME_Payment_Receipt2="70f51412-8eb7-22e7-e9d5-6d94d527e1f5";

@XendraTrl(Identifier="6d0ab61a-999f-f626-c842-6f5153415478")
public static String es_PE_COLUMN_IsReceipt_Name="Cobros";

@XendraColumn(AD_Element_ID="68c0f386-4097-c612-05c3-316e89cb3692",ColumnName="IsReceipt",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6d0ab61a-999f-f626-c842-6f5153415478",
Synchronized="2017-08-05 16:54:00.0")
/** Column name IsReceipt */
public static final String COLUMNNAME_IsReceipt = "IsReceipt";
/** Set Reconciled.
@param IsReconciled Payment is reconciled with bank statement */
public void setIsReconciled (boolean IsReconciled)
{
set_Value (COLUMNNAME_IsReconciled, Boolean.valueOf(IsReconciled));
}
/** Get Reconciled.
@return Payment is reconciled with bank statement */
public boolean isReconciled() 
{
Object oo = get_Value(COLUMNNAME_IsReconciled);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="b533661a-5e25-c59c-8e23-7a498e0a1780")
public static String es_PE_FIELD_Payment_Reconciled_Name="Reconciliado";

@XendraField(AD_Column_ID="IsReconciled",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b533661a-5e25-c59c-8e23-7a498e0a1780")
public static final String FIELDNAME_Payment_Reconciled="b533661a-5e25-c59c-8e23-7a498e0a1780";

@XendraTrl(Identifier="0451d20f-e9ce-0768-497d-fbac78d7d0f5")
public static String es_PE_FIELD_PartnerPayments_Reconciled_Name="Reconciliado";

@XendraField(AD_Column_ID="IsReconciled",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0451d20f-e9ce-0768-497d-fbac78d7d0f5")
public static final String FIELDNAME_PartnerPayments_Reconciled="0451d20f-e9ce-0768-497d-fbac78d7d0f5";

@XendraTrl(Identifier="5dd1a002-6bb2-a6f3-c6b8-707934c9e105")
public static String es_PE_FIELD_Payment_Reconciled2_Name="Reconciliado";

@XendraField(AD_Column_ID="IsReconciled",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5dd1a002-6bb2-a6f3-c6b8-707934c9e105")
public static final String FIELDNAME_Payment_Reconciled2="5dd1a002-6bb2-a6f3-c6b8-707934c9e105";

@XendraTrl(Identifier="356a4859-52bd-291f-cac8-2807e3854a95")
public static String es_PE_COLUMN_IsReconciled_Name="Reconciliado";

@XendraColumn(AD_Element_ID="86d77140-27dd-ed64-2c3f-5dd26190df54",ColumnName="IsReconciled",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="356a4859-52bd-291f-cac8-2807e3854a95",
Synchronized="2017-08-05 16:54:00.0")
/** Column name IsReconciled */
public static final String COLUMNNAME_IsReconciled = "IsReconciled";
/** Set Self-Service.
@param IsSelfService This is a Self-Service entry or this entry can be changed via Self-Service */
public void setIsSelfService (boolean IsSelfService)
{
set_Value (COLUMNNAME_IsSelfService, Boolean.valueOf(IsSelfService));
}
/** Get Self-Service.
@return This is a Self-Service entry or this entry can be changed via Self-Service */
public boolean isSelfService() 
{
Object oo = get_Value(COLUMNNAME_IsSelfService);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="ff438750-beb7-c880-0407-25274fe6f22f")
public static String es_PE_FIELD_Payment_Self_Service_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraTrl(Identifier="ff438750-beb7-c880-0407-25274fe6f22f")
public static String es_PE_FIELD_Payment_Self_Service_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraTrl(Identifier="ff438750-beb7-c880-0407-25274fe6f22f")
public static String es_PE_FIELD_Payment_Self_Service_Name="Auto-Servicio";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=640,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ff438750-beb7-c880-0407-25274fe6f22f")
public static final String FIELDNAME_Payment_Self_Service="ff438750-beb7-c880-0407-25274fe6f22f";

@XendraTrl(Identifier="dc4dfb32-8e01-b630-4159-db02a4b7f83a")
public static String es_PE_FIELD_PartnerPayments_Self_Service_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraTrl(Identifier="dc4dfb32-8e01-b630-4159-db02a4b7f83a")
public static String es_PE_FIELD_PartnerPayments_Self_Service_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraTrl(Identifier="dc4dfb32-8e01-b630-4159-db02a4b7f83a")
public static String es_PE_FIELD_PartnerPayments_Self_Service_Name="Auto-Servicio";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dc4dfb32-8e01-b630-4159-db02a4b7f83a")
public static final String FIELDNAME_PartnerPayments_Self_Service="dc4dfb32-8e01-b630-4159-db02a4b7f83a";

@XendraTrl(Identifier="e30d772c-3dfb-3554-6b68-cff9a90cce26")
public static String es_PE_FIELD_Payment_Self_Service2_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraTrl(Identifier="e30d772c-3dfb-3554-6b68-cff9a90cce26")
public static String es_PE_FIELD_Payment_Self_Service2_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraTrl(Identifier="e30d772c-3dfb-3554-6b68-cff9a90cce26")
public static String es_PE_FIELD_Payment_Self_Service2_Name="Auto-Servicio";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e30d772c-3dfb-3554-6b68-cff9a90cce26")
public static final String FIELDNAME_Payment_Self_Service2="e30d772c-3dfb-3554-6b68-cff9a90cce26";

@XendraTrl(Identifier="a7092219-9ae0-5bac-9c58-4a9083a44d73")
public static String es_PE_COLUMN_IsSelfService_Name="Auto-Servicio";

@XendraColumn(AD_Element_ID="8f201030-f9ab-66d2-f4de-7209f41f2af8",ColumnName="IsSelfService",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a7092219-9ae0-5bac-9c58-4a9083a44d73",
Synchronized="2017-08-05 16:54:00.0")
/** Column name IsSelfService */
public static final String COLUMNNAME_IsSelfService = "IsSelfService";
/** Set Is transfer.
@param IsTransfer Is a transference between two bank accounts */
public void setIsTransfer (boolean IsTransfer)
{
set_Value (COLUMNNAME_IsTransfer, Boolean.valueOf(IsTransfer));
}
/** Get Is transfer.
@return Is a transference between two bank accounts */
public boolean isTransfer() 
{
Object oo = get_Value(COLUMNNAME_IsTransfer);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="6092c174-8921-d667-58de-84a3e013e01d")
public static String es_PE_FIELD_Payment_IsTransfer_Description="Es transferencia entre dos cuentas bancarias.";

@XendraTrl(Identifier="6092c174-8921-d667-58de-84a3e013e01d")
public static String es_PE_FIELD_Payment_IsTransfer_Name="Es transferencia";

@XendraField(AD_Column_ID="IsTransfer",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="Transfer",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=true,SeqNo=510,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6092c174-8921-d667-58de-84a3e013e01d")
public static final String FIELDNAME_Payment_IsTransfer="6092c174-8921-d667-58de-84a3e013e01d";

@XendraTrl(Identifier="bce076d0-f798-97b7-8e04-93321f4aa9b0")
public static String es_PE_COLUMN_IsTransfer_Name="Es transferencia";

@XendraColumn(AD_Element_ID="a9a92c15-6f52-c96d-5873-441f5fa1eb58",ColumnName="IsTransfer",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bce076d0-f798-97b7-8e04-93321f4aa9b0",
Synchronized="2017-08-05 16:54:00.0")
/** Column name IsTransfer */
public static final String COLUMNNAME_IsTransfer = "IsTransfer";
/** Set Is Transfer Source.
@param IsTransferSource Indicates if the transaction is the source of a transfer between different bank accounts. */
public void setIsTransferSource (boolean IsTransferSource)
{
set_Value (COLUMNNAME_IsTransferSource, Boolean.valueOf(IsTransferSource));
}
/** Get Is Transfer Source.
@return Indicates if the transaction is the source of a transfer between different bank accounts. */
public boolean isTransferSource() 
{
Object oo = get_Value(COLUMNNAME_IsTransferSource);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="6d950987-f17b-cd8c-095f-9fcb229465b6")
public static String es_PE_FIELD_Payment_IsTransferSource_Description="Indica si la transaccion es el origen de una transferencia entre dos cuentas bancarias.";

@XendraTrl(Identifier="6d950987-f17b-cd8c-095f-9fcb229465b6")
public static String es_PE_FIELD_Payment_IsTransferSource_Name="Es Origen de Transferencia";

@XendraField(AD_Column_ID="IsTransferSource",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="Transfer",IsDisplayed=true,
DisplayLogic="@IsTransfer@=Y",DisplayLength=0,IsReadOnly=true,SeqNo=520,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6d950987-f17b-cd8c-095f-9fcb229465b6")
public static final String FIELDNAME_Payment_IsTransferSource="6d950987-f17b-cd8c-095f-9fcb229465b6";

@XendraTrl(Identifier="b0228983-f0b9-b546-62be-25aeb8d57d21")
public static String es_PE_COLUMN_IsTransferSource_Name="Es Origen de Transferencia";

@XendraColumn(AD_Element_ID="d44cb485-6f0f-385e-c553-b281b5e537ba",ColumnName="IsTransferSource",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b0228983-f0b9-b546-62be-25aeb8d57d21",
Synchronized="2017-08-05 16:54:00.0")
/** Column name IsTransferSource */
public static final String COLUMNNAME_IsTransferSource = "IsTransferSource";
/** Set Micr.
@param Micr Combination of routing no, account and check no */
public void setMicr (String Micr)
{
if (Micr != null && Micr.length() > 20)
{
log.warning("Length > 20 - truncated");
Micr = Micr.substring(0,19);
}
set_Value (COLUMNNAME_Micr, Micr);
}
/** Get Micr.
@return Combination of routing no, account and check no */
public String getMicr() 
{
String value = (String)get_Value(COLUMNNAME_Micr);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="2229eccf-1483-47f2-8507-9f03b295549e")
public static String es_PE_FIELD_Payment_Micr_Description="Combinación de No. de Sucursal; Cta. y Cheque";

@XendraTrl(Identifier="2229eccf-1483-47f2-8507-9f03b295549e")
public static String es_PE_FIELD_Payment_Micr_Help="El número Micr es la combinación del número de sucursal del banco; número de cuenta y número de cheque.";

@XendraTrl(Identifier="2229eccf-1483-47f2-8507-9f03b295549e")
public static String es_PE_FIELD_Payment_Micr_Name="Sucursal; Cta.; No. Cheque";

@XendraField(AD_Column_ID="Micr",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsTransfer@!Y & @TenderType@=K",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="2229eccf-1483-47f2-8507-9f03b295549e")
public static final String FIELDNAME_Payment_Micr="2229eccf-1483-47f2-8507-9f03b295549e";

@XendraTrl(Identifier="66fd5122-b4ac-426e-779e-5f5309739849")
public static String es_PE_FIELD_PartnerPayments_Micr_Description="Combinación de No. de Sucursal; Cta. y Cheque";

@XendraTrl(Identifier="66fd5122-b4ac-426e-779e-5f5309739849")
public static String es_PE_FIELD_PartnerPayments_Micr_Help="El número Micr es la combinación del número de sucursal del banco; número de cuenta y número de cheque.";

@XendraTrl(Identifier="66fd5122-b4ac-426e-779e-5f5309739849")
public static String es_PE_FIELD_PartnerPayments_Micr_Name="Sucursal; Cta.; No. Cheque";

@XendraField(AD_Column_ID="Micr",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="66fd5122-b4ac-426e-779e-5f5309739849")
public static final String FIELDNAME_PartnerPayments_Micr="66fd5122-b4ac-426e-779e-5f5309739849";

@XendraTrl(Identifier="5fdfdb25-12b0-dc50-19bc-f0d6b1dc0bca")
public static String es_PE_FIELD_Payment_Micr2_Description="Combinación de No. de Sucursal; Cta. y Cheque";

@XendraTrl(Identifier="5fdfdb25-12b0-dc50-19bc-f0d6b1dc0bca")
public static String es_PE_FIELD_Payment_Micr2_Help="El número Micr es la combinación del número de sucursal del banco; número de cuenta y número de cheque.";

@XendraTrl(Identifier="5fdfdb25-12b0-dc50-19bc-f0d6b1dc0bca")
public static String es_PE_FIELD_Payment_Micr2_Name="Sucursal; Cta.; No. Cheque";

@XendraField(AD_Column_ID="Micr",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5fdfdb25-12b0-dc50-19bc-f0d6b1dc0bca")
public static final String FIELDNAME_Payment_Micr2="5fdfdb25-12b0-dc50-19bc-f0d6b1dc0bca";

@XendraTrl(Identifier="a5ac3388-eca7-7991-ba17-c367163bab60")
public static String es_PE_COLUMN_Micr_Name="Sucursal; Cta.; No. Cheque";

@XendraColumn(AD_Element_ID="0b752d44-f881-42b3-cecc-a50231c4a36d",ColumnName="Micr",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a5ac3388-eca7-7991-ba17-c367163bab60",
Synchronized="2017-08-05 16:54:00.0")
/** Column name Micr */
public static final String COLUMNNAME_Micr = "Micr";
/** Set Online Processing.
@param OProcessing This payment can be processed online */
public void setOProcessing (String OProcessing)
{
if (OProcessing != null && OProcessing.length() > 1)
{
log.warning("Length > 1 - truncated");
OProcessing = OProcessing.substring(0,0);
}
set_Value (COLUMNNAME_OProcessing, OProcessing);
}
/** Get Online Processing.
@return This payment can be processed online */
public String getOProcessing() 
{
return (String)get_Value(COLUMNNAME_OProcessing);
}

@XendraTrl(Identifier="521cf57c-dc53-9605-cc51-4d52d8bc1ebe")
public static String es_PE_FIELD_Payment_OnlineProcess_Name="Procesar en Línea";

@XendraField(AD_Column_ID="OProcessing",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsTransfer@!Y & @IsOnline@=Y",DisplayLength=23,IsReadOnly=false,SeqNo=500,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="521cf57c-dc53-9605-cc51-4d52d8bc1ebe")
public static final String FIELDNAME_Payment_OnlineProcess="521cf57c-dc53-9605-cc51-4d52d8bc1ebe";

@XendraTrl(Identifier="32a84f7a-9e71-bbf7-abaf-c0c220fdf041")
public static String es_PE_FIELD_PartnerPayments_OnlineProcess_Name="Procesar en Línea";

@XendraField(AD_Column_ID="OProcessing",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="32a84f7a-9e71-bbf7-abaf-c0c220fdf041")
public static final String FIELDNAME_PartnerPayments_OnlineProcess="32a84f7a-9e71-bbf7-abaf-c0c220fdf041";

@XendraTrl(Identifier="6ebb2a07-e17c-ae22-ff8c-dcc0a3eb7a1d")
public static String es_PE_FIELD_Payment_OnlineProcess2_Name="Procesar en Línea";

@XendraField(AD_Column_ID="OProcessing",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6ebb2a07-e17c-ae22-ff8c-dcc0a3eb7a1d")
public static final String FIELDNAME_Payment_OnlineProcess2="6ebb2a07-e17c-ae22-ff8c-dcc0a3eb7a1d";

@XendraTrl(Identifier="114d8709-6c87-2343-f88e-825cabe0cef8")
public static String es_PE_COLUMN_OProcessing_Name="Proceso en Línea";

@XendraColumn(AD_Element_ID="f96ca644-d9bf-c113-d5f0-593437771b2c",ColumnName="OProcessing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@IsApproved@=Y",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",
ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,
AD_Process_ID="6add155b-ffea-9f74-85fb-1f4b1a354325",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="114d8709-6c87-2343-f88e-825cabe0cef8",
Synchronized="2017-08-05 16:54:00.0")
/** Column name OProcessing */
public static final String COLUMNNAME_OProcessing = "OProcessing";
/** Set Original Transaction ID.
@param Orig_TrxID Original Transaction ID */
public void setOrig_TrxID (String Orig_TrxID)
{
if (Orig_TrxID != null && Orig_TrxID.length() > 20)
{
log.warning("Length > 20 - truncated");
Orig_TrxID = Orig_TrxID.substring(0,19);
}
set_Value (COLUMNNAME_Orig_TrxID, Orig_TrxID);
}
/** Get Original Transaction ID.
@return Original Transaction ID */
public String getOrig_TrxID() 
{
String value = (String)get_Value(COLUMNNAME_Orig_TrxID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="fef4bd65-db64-9c55-df62-47aa146e1caa")
public static String es_PE_FIELD_Payment_OriginalTransactionID_Description="ID de la transacción original";

@XendraTrl(Identifier="fef4bd65-db64-9c55-df62-47aa146e1caa")
public static String es_PE_FIELD_Payment_OriginalTransactionID_Help="La ID de la transacción original se usa para restaurar transacciones e indica la transacción a ser restaurada.";

@XendraTrl(Identifier="fef4bd65-db64-9c55-df62-47aa146e1caa")
public static String es_PE_FIELD_Payment_OriginalTransactionID_Name="ID de la Transacción Original";

@XendraField(AD_Column_ID="Orig_TrxID",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsTransfer@!Y & @IsOnline@=Y",DisplayLength=20,IsReadOnly=false,SeqNo=490,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="fef4bd65-db64-9c55-df62-47aa146e1caa")
public static final String FIELDNAME_Payment_OriginalTransactionID="fef4bd65-db64-9c55-df62-47aa146e1caa";

@XendraTrl(Identifier="bcbca489-4cd5-fae8-bc56-93cbf28b2bba")
public static String es_PE_FIELD_PartnerPayments_OriginalTransactionID_Description="ID de la transacción original";

@XendraTrl(Identifier="bcbca489-4cd5-fae8-bc56-93cbf28b2bba")
public static String es_PE_FIELD_PartnerPayments_OriginalTransactionID_Help="La ID de la transacción original se usa para restaurar transacciones e indica la transacción a ser restaurada.";

@XendraTrl(Identifier="bcbca489-4cd5-fae8-bc56-93cbf28b2bba")
public static String es_PE_FIELD_PartnerPayments_OriginalTransactionID_Name="ID de la Transacción Original";

@XendraField(AD_Column_ID="Orig_TrxID",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bcbca489-4cd5-fae8-bc56-93cbf28b2bba")
public static final String FIELDNAME_PartnerPayments_OriginalTransactionID="bcbca489-4cd5-fae8-bc56-93cbf28b2bba";

@XendraTrl(Identifier="73a04a2e-ce55-9c24-3705-f1341266e213")
public static String es_PE_FIELD_Payment_OriginalTransactionID2_Description="ID de la transacción original";

@XendraTrl(Identifier="73a04a2e-ce55-9c24-3705-f1341266e213")
public static String es_PE_FIELD_Payment_OriginalTransactionID2_Help="La ID de la transacción original se usa para restaurar transacciones e indica la transacción a ser restaurada.";

@XendraTrl(Identifier="73a04a2e-ce55-9c24-3705-f1341266e213")
public static String es_PE_FIELD_Payment_OriginalTransactionID2_Name="ID de la Transacción Original";

@XendraField(AD_Column_ID="Orig_TrxID",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="73a04a2e-ce55-9c24-3705-f1341266e213")
public static final String FIELDNAME_Payment_OriginalTransactionID2="73a04a2e-ce55-9c24-3705-f1341266e213";

@XendraTrl(Identifier="e78e7a0e-d0ad-1237-2131-9532e78f1dac")
public static String es_PE_COLUMN_Orig_TrxID_Name="ID de la Transacción Original";

@XendraColumn(AD_Element_ID="e16848a0-0be3-8619-06f3-ad80fefbab90",ColumnName="Orig_TrxID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@IsApproved@=Y",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",
ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e78e7a0e-d0ad-1237-2131-9532e78f1dac",Synchronized="2017-08-05 16:54:00.0")
/** Column name Orig_TrxID */
public static final String COLUMNNAME_Orig_TrxID = "Orig_TrxID";
/** Set Over/Under Payment.
@param OverUnderAmt Over-Payment (unallocated) or Under-Payment (partial payment) Amount */
public void setOverUnderAmt (BigDecimal OverUnderAmt)
{
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

@XendraTrl(Identifier="aa7acefa-92c9-bbc0-b179-e132c9d5a852")
public static String es_PE_FIELD_Payment_OverUnderPayment3_Description="Total de sobre pago (no contabilizado) ó sub pago (pago parcial)";

@XendraTrl(Identifier="aa7acefa-92c9-bbc0-b179-e132c9d5a852")
public static String es_PE_FIELD_Payment_OverUnderPayment3_Help="Sobre pagos (negativos) son totales no contabilizados y permiten recibir dinero por totales superiores a una factura particular. Sub pagos (positivo) es un pago parcial de una factura. No se saca de libros la cantidad no pagada.";

@XendraTrl(Identifier="aa7acefa-92c9-bbc0-b179-e132c9d5a852")
public static String es_PE_FIELD_Payment_OverUnderPayment3_Name="Totales con sobre/sub pago";

@XendraField(AD_Column_ID="OverUnderAmt",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsOverUnderPayment@=Y & @C_Invoice_ID@^''",DisplayLength=26,IsReadOnly=false,
SeqNo=280,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="aa7acefa-92c9-bbc0-b179-e132c9d5a852")
public static final String FIELDNAME_Payment_OverUnderPayment3="aa7acefa-92c9-bbc0-b179-e132c9d5a852";

@XendraTrl(Identifier="028b9a3d-491f-6167-df2e-677e17382779")
public static String es_PE_FIELD_PartnerPayments_OverUnderPayment2_Description="Total de sobre pago (no contabilizado) ó sub pago (pago parcial)";

@XendraTrl(Identifier="028b9a3d-491f-6167-df2e-677e17382779")
public static String es_PE_FIELD_PartnerPayments_OverUnderPayment2_Help="Sobre pagos (negativos) son totales no contabilizados y permiten recibir dinero por totales superiores a una factura particular. Sub pagos (positivo) es un pago parcial de una factura. No se saca de libros la cantidad no pagada.";

@XendraTrl(Identifier="028b9a3d-491f-6167-df2e-677e17382779")
public static String es_PE_FIELD_PartnerPayments_OverUnderPayment2_Name="Totales con sobre/sub pago";

@XendraField(AD_Column_ID="OverUnderAmt",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="028b9a3d-491f-6167-df2e-677e17382779")
public static final String FIELDNAME_PartnerPayments_OverUnderPayment2="028b9a3d-491f-6167-df2e-677e17382779";

@XendraTrl(Identifier="b4e130dc-dc3e-1430-326d-3e8544fe22ed")
public static String es_PE_FIELD_Payment_OverUnderPayment4_Description="Total de sobre pago (no contabilizado) ó sub pago (pago parcial)";

@XendraTrl(Identifier="b4e130dc-dc3e-1430-326d-3e8544fe22ed")
public static String es_PE_FIELD_Payment_OverUnderPayment4_Help="Sobre pagos (negativos) son totales no contabilizados y permiten recibir dinero por totales superiores a una factura particular. Sub pagos (positivo) es un pago parcial de una factura. No se saca de libros la cantidad no pagada.";

@XendraTrl(Identifier="b4e130dc-dc3e-1430-326d-3e8544fe22ed")
public static String es_PE_FIELD_Payment_OverUnderPayment4_Name="Totales con sobre/sub pago";

@XendraField(AD_Column_ID="OverUnderAmt",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b4e130dc-dc3e-1430-326d-3e8544fe22ed")
public static final String FIELDNAME_Payment_OverUnderPayment4="b4e130dc-dc3e-1430-326d-3e8544fe22ed";

@XendraTrl(Identifier="348b6c99-eb8e-ad21-adc4-2ce0b3c86e2c")
public static String es_PE_COLUMN_OverUnderAmt_Name="Totales con sobre/sub pago";

@XendraColumn(AD_Element_ID="c1b8d715-3799-d069-9abd-dcbda10d4c2a",ColumnName="OverUnderAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@C_Charge_ID@!0 | @C_Order_ID@!0",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutPayment.amounts",VFormat="",ValueMin="",ValueMax="",Version="0",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="348b6c99-eb8e-ad21-adc4-2ce0b3c86e2c",
Synchronized="2017-08-05 16:54:00.0")
/** Column name OverUnderAmt */
public static final String COLUMNNAME_OverUnderAmt = "OverUnderAmt";
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

@XendraTrl(Identifier="6fd319dc-8930-a5ef-8f1c-1e218dd38b88")
public static String es_PE_FIELD_Payment_PaymentAmount_Description="Total siendo movimiento";

@XendraTrl(Identifier="6fd319dc-8930-a5ef-8f1c-1e218dd38b88")
public static String es_PE_FIELD_Payment_PaymentAmount_Help="Indica el total a pagar. El total del pago puede ser para una factura simple, múltiple ó un pago parcial de una factura.";

@XendraTrl(Identifier="6fd319dc-8930-a5ef-8f1c-1e218dd38b88")
public static String es_PE_FIELD_Payment_PaymentAmount_Name="Total del Movimiento";

@XendraField(AD_Column_ID="PayAmt",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="Amounts",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6fd319dc-8930-a5ef-8f1c-1e218dd38b88")
public static final String FIELDNAME_Payment_PaymentAmount="6fd319dc-8930-a5ef-8f1c-1e218dd38b88";

@XendraTrl(Identifier="05a7f71c-919a-0527-3ad8-c157afdb7b2f")
public static String es_PE_FIELD_PartnerPayments_PaymentAmount_Description="Total siendo pagado";

@XendraTrl(Identifier="05a7f71c-919a-0527-3ad8-c157afdb7b2f")
public static String es_PE_FIELD_PartnerPayments_PaymentAmount_Help="Indica el total a pagar. El total del pago puede ser para una factura simple, múltiple ó un pago parcial de una factura.";

@XendraTrl(Identifier="05a7f71c-919a-0527-3ad8-c157afdb7b2f")
public static String es_PE_FIELD_PartnerPayments_PaymentAmount_Name="Total del Pago";

@XendraField(AD_Column_ID="PayAmt",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="05a7f71c-919a-0527-3ad8-c157afdb7b2f")
public static final String FIELDNAME_PartnerPayments_PaymentAmount="05a7f71c-919a-0527-3ad8-c157afdb7b2f";

@XendraTrl(Identifier="faef217a-d53d-70cf-10be-dd40db44a285")
public static String es_PE_FIELD_Payment_PaymentAmount2_Description="Total siendo pagado";

@XendraTrl(Identifier="faef217a-d53d-70cf-10be-dd40db44a285")
public static String es_PE_FIELD_Payment_PaymentAmount2_Help="Indica el total a pagar. El total del pago puede ser para una factura simple, múltiple ó un pago parcial de una factura.";

@XendraTrl(Identifier="faef217a-d53d-70cf-10be-dd40db44a285")
public static String es_PE_FIELD_Payment_PaymentAmount2_Name="Total del Pago";

@XendraField(AD_Column_ID="PayAmt",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="Amounts",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="faef217a-d53d-70cf-10be-dd40db44a285")
public static final String FIELDNAME_Payment_PaymentAmount2="faef217a-d53d-70cf-10be-dd40db44a285";

@XendraTrl(Identifier="3ec8bf0e-80db-bf7d-d51a-0397e2a3ff16")
public static String es_PE_COLUMN_PayAmt_Name="Total del Pago";

@XendraColumn(AD_Element_ID="9e9a0ba1-2d71-67e7-e0f1-0309fd537c8b",ColumnName="PayAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=3,IsTranslated=false,Callout="org.compiere.model.CalloutPayment.amounts",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3ec8bf0e-80db-bf7d-d51a-0397e2a3ff16",Synchronized="2017-08-05 16:54:00.0")
/** Column name PayAmt */
public static final String COLUMNNAME_PayAmt = "PayAmt";
/** Set PO Number.
@param PONum Purchase Order Number */
public void setPONum (String PONum)
{
if (PONum != null && PONum.length() > 60)
{
log.warning("Length > 60 - truncated");
PONum = PONum.substring(0,59);
}
set_Value (COLUMNNAME_PONum, PONum);
}
/** Get PO Number.
@return Purchase Order Number */
public String getPONum() 
{
String value = (String)get_Value(COLUMNNAME_PONum);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="55f53562-6865-5d67-ce35-dfe9ee1d71fc")
public static String es_PE_FIELD_Payment_PONumber_Description="Número de Orden de Compra";

@XendraTrl(Identifier="55f53562-6865-5d67-ce35-dfe9ee1d71fc")
public static String es_PE_FIELD_Payment_PONumber_Help="El Número de OC indica el número asignado a una orden de compras";

@XendraTrl(Identifier="55f53562-6865-5d67-ce35-dfe9ee1d71fc")
public static String es_PE_FIELD_Payment_PONumber_Name="Número de OC";

@XendraField(AD_Column_ID="PONum",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsTransfer@!Y & @CreditCardType@=P & @IsOnline@=Y",DisplayLength=20,
IsReadOnly=false,SeqNo=470,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,
Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="55f53562-6865-5d67-ce35-dfe9ee1d71fc")
public static final String FIELDNAME_Payment_PONumber="55f53562-6865-5d67-ce35-dfe9ee1d71fc";

@XendraTrl(Identifier="607e32c5-0b06-e6b4-db04-26edf8696ccc")
public static String es_PE_FIELD_PartnerPayments_PONumber_Description="Número de Orden de Compra";

@XendraTrl(Identifier="607e32c5-0b06-e6b4-db04-26edf8696ccc")
public static String es_PE_FIELD_PartnerPayments_PONumber_Help="El Número de OC indica el número asignado a una orden de compras";

@XendraTrl(Identifier="607e32c5-0b06-e6b4-db04-26edf8696ccc")
public static String es_PE_FIELD_PartnerPayments_PONumber_Name="Número de OC";

@XendraField(AD_Column_ID="PONum",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="607e32c5-0b06-e6b4-db04-26edf8696ccc")
public static final String FIELDNAME_PartnerPayments_PONumber="607e32c5-0b06-e6b4-db04-26edf8696ccc";

@XendraTrl(Identifier="209452e4-3090-e004-1118-40a2742724c0")
public static String es_PE_FIELD_Payment_PONumber2_Description="Número de Orden de Compra";

@XendraTrl(Identifier="209452e4-3090-e004-1118-40a2742724c0")
public static String es_PE_FIELD_Payment_PONumber2_Help="El Número de OC indica el número asignado a una orden de compras";

@XendraTrl(Identifier="209452e4-3090-e004-1118-40a2742724c0")
public static String es_PE_FIELD_Payment_PONumber2_Name="Número de OC";

@XendraField(AD_Column_ID="PONum",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="209452e4-3090-e004-1118-40a2742724c0")
public static final String FIELDNAME_Payment_PONumber2="209452e4-3090-e004-1118-40a2742724c0";

@XendraTrl(Identifier="bea1944c-50f6-62ab-000b-f8a4098fee91")
public static String es_PE_COLUMN_PONum_Name="Número de OC";

@XendraColumn(AD_Element_ID="05310437-552a-2dc7-2b71-517dbacef9d4",ColumnName="PONum",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bea1944c-50f6-62ab-000b-f8a4098fee91",
Synchronized="2017-08-05 16:54:00.0")
/** Column name PONum */
public static final String COLUMNNAME_PONum = "PONum";
/** Set Posted.
@param Posted Posting status */
public void setPosted (boolean Posted)
{
set_Value (COLUMNNAME_Posted, Boolean.valueOf(Posted));
}
/** Get Posted.
@return Posting status */
public boolean isPosted() 
{
Object oo = get_Value(COLUMNNAME_Posted);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="c8929d7b-dd74-9bd7-6e52-df57ef4e08a7")
public static String es_PE_FIELD_Payment_Posted_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="c8929d7b-dd74-9bd7-6e52-df57ef4e08a7")
public static String es_PE_FIELD_Payment_Posted_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraTrl(Identifier="c8929d7b-dd74-9bd7-6e52-df57ef4e08a7")
public static String es_PE_FIELD_Payment_Posted_Name="Fijada";
@XendraField(AD_Column_ID="Posted",
IsCentrallyMaintained=true,AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="@Processed@=Y & @#ShowAcct@=Y",DisplayLength=23,IsReadOnly=false,
SeqNo=660,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c8929d7b-dd74-9bd7-6e52-df57ef4e08a7")
public static final String FIELDNAME_Payment_Posted="c8929d7b-dd74-9bd7-6e52-df57ef4e08a7";

@XendraTrl(Identifier="f6893217-91e1-f2dd-950c-5b1d82e61449")
public static String es_PE_FIELD_PartnerPayments_Posted_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="f6893217-91e1-f2dd-950c-5b1d82e61449")
public static String es_PE_FIELD_PartnerPayments_Posted_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraTrl(Identifier="f6893217-91e1-f2dd-950c-5b1d82e61449")
public static String es_PE_FIELD_PartnerPayments_Posted_Name="Fijada";

@XendraField(AD_Column_ID="Posted",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f6893217-91e1-f2dd-950c-5b1d82e61449")
public static final String FIELDNAME_PartnerPayments_Posted="f6893217-91e1-f2dd-950c-5b1d82e61449";

@XendraTrl(Identifier="9dfe63e5-1044-a500-18a5-d7e2d0c259f8")
public static String es_PE_FIELD_Payment_Posted2_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="9dfe63e5-1044-a500-18a5-d7e2d0c259f8")
public static String es_PE_FIELD_Payment_Posted2_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraTrl(Identifier="9dfe63e5-1044-a500-18a5-d7e2d0c259f8")
public static String es_PE_FIELD_Payment_Posted2_Name="Fijada";
@XendraField(AD_Column_ID="Posted",
IsCentrallyMaintained=true,AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=250,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="9dfe63e5-1044-a500-18a5-d7e2d0c259f8")
public static final String FIELDNAME_Payment_Posted2="9dfe63e5-1044-a500-18a5-d7e2d0c259f8";

@XendraTrl(Identifier="66a0969b-4df9-36c2-2b53-007c2c3a4447")
public static String es_PE_COLUMN_Posted_Name="Fijada";

@XendraColumn(AD_Element_ID="5eb52ebc-6992-12f5-b85a-e0a136df259b",ColumnName="Posted",
AD_Reference_ID=28,AD_Reference_Value_ID="d2b659dd-6c8c-baf3-fc71-0ee997273154",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="66a0969b-4df9-36c2-2b53-007c2c3a4447",Synchronized="2017-08-05 16:54:00.0")
/** Column name Posted */
public static final String COLUMNNAME_Posted = "Posted";
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

@XendraTrl(Identifier="2854c18c-8fde-2ae8-73da-dadb3f1239d5")
public static String es_PE_FIELD_Payment_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="2854c18c-8fde-2ae8-73da-dadb3f1239d5")
public static String es_PE_FIELD_Payment_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="2854c18c-8fde-2ae8-73da-dadb3f1239d5")
public static String es_PE_FIELD_Payment_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2854c18c-8fde-2ae8-73da-dadb3f1239d5")
public static final String FIELDNAME_Payment_Processed="2854c18c-8fde-2ae8-73da-dadb3f1239d5";

@XendraTrl(Identifier="c42b9a09-d33b-7a39-c9ad-93865cfd792e")
public static String es_PE_FIELD_PartnerPayments_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="c42b9a09-d33b-7a39-c9ad-93865cfd792e")
public static String es_PE_FIELD_PartnerPayments_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="c42b9a09-d33b-7a39-c9ad-93865cfd792e")
public static String es_PE_FIELD_PartnerPayments_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c42b9a09-d33b-7a39-c9ad-93865cfd792e")
public static final String FIELDNAME_PartnerPayments_Processed="c42b9a09-d33b-7a39-c9ad-93865cfd792e";

@XendraTrl(Identifier="b69a56ba-c742-d0b8-79be-072b462f27f3")
public static String es_PE_FIELD_Payment_Processed2_Description="El documento ha sido procesado";

@XendraTrl(Identifier="b69a56ba-c742-d0b8-79be-072b462f27f3")
public static String es_PE_FIELD_Payment_Processed2_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="b69a56ba-c742-d0b8-79be-072b462f27f3")
public static String es_PE_FIELD_Payment_Processed2_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b69a56ba-c742-d0b8-79be-072b462f27f3")
public static final String FIELDNAME_Payment_Processed2="b69a56ba-c742-d0b8-79be-072b462f27f3";

@XendraTrl(Identifier="63d6a4e3-7b44-945a-5e73-86b187e04bce")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="63d6a4e3-7b44-945a-5e73-86b187e04bce",
Synchronized="2017-08-05 16:54:00.0")
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

@XendraTrl(Identifier="b4d34cbf-2714-970c-862c-12f04b411d4b")
public static String es_PE_FIELD_Payment_ProcessNow_Name="Procesar Pago";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b4d34cbf-2714-970c-862c-12f04b411d4b")
public static final String FIELDNAME_Payment_ProcessNow="b4d34cbf-2714-970c-862c-12f04b411d4b";

@XendraTrl(Identifier="54661736-f498-d87b-9d76-6970df40940c")
public static String es_PE_FIELD_PartnerPayments_ProcessNow_Name="Procesar Pago";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="54661736-f498-d87b-9d76-6970df40940c")
public static final String FIELDNAME_PartnerPayments_ProcessNow="54661736-f498-d87b-9d76-6970df40940c";

@XendraTrl(Identifier="60dd8ad0-e539-b734-64dd-d83f9b5ca620")
public static String es_PE_FIELD_Payment_ProcessNow2_Name="Procesar Pago";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="60dd8ad0-e539-b734-64dd-d83f9b5ca620")
public static final String FIELDNAME_Payment_ProcessNow2="60dd8ad0-e539-b734-64dd-d83f9b5ca620";

@XendraTrl(Identifier="742f96f0-b361-5c3c-a64e-4266b8eedcee")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="5f953611-ddcc-1533-5c07-613d54d9b496",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="742f96f0-b361-5c3c-a64e-4266b8eedcee",Synchronized="2017-08-05 16:54:00.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Authorization Code.
@param R_AuthCode Authorization Code returned */
public void setR_AuthCode (String R_AuthCode)
{
if (R_AuthCode != null && R_AuthCode.length() > 20)
{
log.warning("Length > 20 - truncated");
R_AuthCode = R_AuthCode.substring(0,19);
}
set_ValueNoCheck (COLUMNNAME_R_AuthCode, R_AuthCode);
}
/** Get Authorization Code.
@return Authorization Code returned */
public String getR_AuthCode() 
{
String value = (String)get_Value(COLUMNNAME_R_AuthCode);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="0a96ede9-aa6f-ab78-f7ea-0cb87ab7d20f")
public static String es_PE_FIELD_Payment_AuthorizationCode_Description="Autorización del Código devuelto";

@XendraTrl(Identifier="0a96ede9-aa6f-ab78-f7ea-0cb87ab7d20f")
public static String es_PE_FIELD_Payment_AuthorizationCode_Help="El código de autorización indica el código devuelto desde la transmisión electrónica";

@XendraTrl(Identifier="0a96ede9-aa6f-ab78-f7ea-0cb87ab7d20f")
public static String es_PE_FIELD_Payment_AuthorizationCode_Name="Código de Autorización";

@XendraField(AD_Column_ID="R_AuthCode",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="@IsTransfer@!Y & @IsOnline@=Y",DisplayLength=20,IsReadOnly=true,SeqNo=590,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="0a96ede9-aa6f-ab78-f7ea-0cb87ab7d20f")
public static final String FIELDNAME_Payment_AuthorizationCode="0a96ede9-aa6f-ab78-f7ea-0cb87ab7d20f";

@XendraTrl(Identifier="83db9738-dfcc-e223-93f2-b8d7ecaa096d")
public static String es_PE_FIELD_PartnerPayments_AuthorizationCode_Description="Autorización del Código devuelto";

@XendraTrl(Identifier="83db9738-dfcc-e223-93f2-b8d7ecaa096d")
public static String es_PE_FIELD_PartnerPayments_AuthorizationCode_Help="El código de autorización indica el código devuelto desde la transmisión electrónica";

@XendraTrl(Identifier="83db9738-dfcc-e223-93f2-b8d7ecaa096d")
public static String es_PE_FIELD_PartnerPayments_AuthorizationCode_Name="Código de Autorización";

@XendraField(AD_Column_ID="R_AuthCode",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="83db9738-dfcc-e223-93f2-b8d7ecaa096d")
public static final String FIELDNAME_PartnerPayments_AuthorizationCode="83db9738-dfcc-e223-93f2-b8d7ecaa096d";

@XendraTrl(Identifier="7d9adaa5-1068-5bd9-51b1-4f2077c22ecb")
public static String es_PE_FIELD_Payment_AuthorizationCode2_Description="Autorización del Código devuelto";

@XendraTrl(Identifier="7d9adaa5-1068-5bd9-51b1-4f2077c22ecb")
public static String es_PE_FIELD_Payment_AuthorizationCode2_Help="El código de autorización indica el código devuelto desde la transmisión electrónica";

@XendraTrl(Identifier="7d9adaa5-1068-5bd9-51b1-4f2077c22ecb")
public static String es_PE_FIELD_Payment_AuthorizationCode2_Name="Código de Autorización";

@XendraField(AD_Column_ID="R_AuthCode",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7d9adaa5-1068-5bd9-51b1-4f2077c22ecb")
public static final String FIELDNAME_Payment_AuthorizationCode2="7d9adaa5-1068-5bd9-51b1-4f2077c22ecb";

@XendraTrl(Identifier="1759a8fc-5f66-65c3-d782-3c7e8d836614")
public static String es_PE_COLUMN_R_AuthCode_Name="Código de Autorización";

@XendraColumn(AD_Element_ID="aba120af-b02d-16f6-4b52-dac37c17a92b",ColumnName="R_AuthCode",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1759a8fc-5f66-65c3-d782-3c7e8d836614",
Synchronized="2017-08-05 16:54:00.0")
/** Column name R_AuthCode */
public static final String COLUMNNAME_R_AuthCode = "R_AuthCode";
/** Set Authorization Code (DC).
@param R_AuthCode_DC Authorization Code Delayed Capture returned */
public void setR_AuthCode_DC (String R_AuthCode_DC)
{
if (R_AuthCode_DC != null && R_AuthCode_DC.length() > 20)
{
log.warning("Length > 20 - truncated");
R_AuthCode_DC = R_AuthCode_DC.substring(0,19);
}
set_ValueNoCheck (COLUMNNAME_R_AuthCode_DC, R_AuthCode_DC);
}
/** Get Authorization Code (DC).
@return Authorization Code Delayed Capture returned */
public String getR_AuthCode_DC() 
{
String value = (String)get_Value(COLUMNNAME_R_AuthCode_DC);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="eb5bf08f-7118-1c2a-5414-26320539666f")
public static String es_PE_FIELD_Payment_AuthorizationCodeDC_Description="Codigo de autorización de retrasó captura la vuelta";

@XendraTrl(Identifier="eb5bf08f-7118-1c2a-5414-26320539666f")
public static String es_PE_FIELD_Payment_AuthorizationCodeDC_Help="El código de la autorización indica el código vuelto de la transmisión electrónica.";

@XendraTrl(Identifier="eb5bf08f-7118-1c2a-5414-26320539666f")
public static String es_PE_FIELD_Payment_AuthorizationCodeDC_Name="Codigo de Autorización (DC)";

@XendraField(AD_Column_ID="R_AuthCode_DC",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eb5bf08f-7118-1c2a-5414-26320539666f")
public static final String FIELDNAME_Payment_AuthorizationCodeDC="eb5bf08f-7118-1c2a-5414-26320539666f";

@XendraTrl(Identifier="0be936f6-9892-91f5-06ba-934d85a3c274")
public static String es_PE_FIELD_PartnerPayments_AuthorizationCodeDC_Description="Codigo de autorización de retrasó captura la vuelta";

@XendraTrl(Identifier="0be936f6-9892-91f5-06ba-934d85a3c274")
public static String es_PE_FIELD_PartnerPayments_AuthorizationCodeDC_Help="El código de la autorización indica el código vuelto de la transmisión electrónica.";

@XendraTrl(Identifier="0be936f6-9892-91f5-06ba-934d85a3c274")
public static String es_PE_FIELD_PartnerPayments_AuthorizationCodeDC_Name="Codigo de Autorización (DC)";

@XendraField(AD_Column_ID="R_AuthCode_DC",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0be936f6-9892-91f5-06ba-934d85a3c274")
public static final String FIELDNAME_PartnerPayments_AuthorizationCodeDC="0be936f6-9892-91f5-06ba-934d85a3c274";

@XendraTrl(Identifier="e7625dda-c1ce-9880-a878-4e8293ac06c8")
public static String es_PE_FIELD_Payment_AuthorizationCodeDC2_Description="Codigo de autorización de retrasó captura la vuelta";

@XendraTrl(Identifier="e7625dda-c1ce-9880-a878-4e8293ac06c8")
public static String es_PE_FIELD_Payment_AuthorizationCodeDC2_Help="El código de la autorización indica el código vuelto de la transmisión electrónica.";

@XendraTrl(Identifier="e7625dda-c1ce-9880-a878-4e8293ac06c8")
public static String es_PE_FIELD_Payment_AuthorizationCodeDC2_Name="Codigo de Autorización (DC)";

@XendraField(AD_Column_ID="R_AuthCode_DC",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e7625dda-c1ce-9880-a878-4e8293ac06c8")
public static final String FIELDNAME_Payment_AuthorizationCodeDC2="e7625dda-c1ce-9880-a878-4e8293ac06c8";

@XendraTrl(Identifier="ffa50c68-aca4-8cb7-5ac4-df16eeaa13b8")
public static String es_PE_COLUMN_R_AuthCode_DC_Name="Codigo de Autorización (DC)";

@XendraColumn(AD_Element_ID="36205548-1eb8-fd5b-ba99-9a780a982e49",ColumnName="R_AuthCode_DC",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ffa50c68-aca4-8cb7-5ac4-df16eeaa13b8",
Synchronized="2017-08-05 16:54:00.0")
/** Column name R_AuthCode_DC */
public static final String COLUMNNAME_R_AuthCode_DC = "R_AuthCode_DC";

/** R_AvsAddr AD_Reference=a38caa4a-a80a-342b-7bcf-5e887ef40a4c */
public static final int R_AVSADDR_AD_Reference_ID=213;
/** Set Address verified.
@param R_AvsAddr This address has been verified */
public void setR_AvsAddr (String R_AvsAddr)
{
if (R_AvsAddr == null || R_AvsAddr.equals(REF_C_PaymentAVS.Match) || R_AvsAddr.equals(REF_C_PaymentAVS.NoMatch) || R_AvsAddr.equals(REF_C_PaymentAVS.Unavailable));
 else throw new IllegalArgumentException ("R_AvsAddr Invalid value - " + R_AvsAddr + " - Reference_ID=213 - Y - N - X");
if (R_AvsAddr != null && R_AvsAddr.length() > 1)
{
log.warning("Length > 1 - truncated");
R_AvsAddr = R_AvsAddr.substring(0,0);
}
set_ValueNoCheck (COLUMNNAME_R_AvsAddr, R_AvsAddr);
}
/** Get Address verified.
@return This address has been verified */
public String getR_AvsAddr() 
{
return (String)get_Value(COLUMNNAME_R_AvsAddr);
}

@XendraTrl(Identifier="60e1ce82-7005-5a67-e2e0-ba923a9b534c")
public static String es_PE_FIELD_Payment_AddressVerified_Description="Esta dirección ha sido devuelta";

@XendraTrl(Identifier="60e1ce82-7005-5a67-e2e0-ba923a9b534c")
public static String es_PE_FIELD_Payment_AddressVerified_Help="La dirección verificada indica si la dirección ha sido verificada por la compañía de la tarjeta de crédito";

@XendraTrl(Identifier="60e1ce82-7005-5a67-e2e0-ba923a9b534c")
public static String es_PE_FIELD_Payment_AddressVerified_Name="Dirección Verificada";

@XendraField(AD_Column_ID="R_AvsAddr",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="@IsTransfer@!Y & @IsOnline@=Y",DisplayLength=14,IsReadOnly=true,SeqNo=610,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="60e1ce82-7005-5a67-e2e0-ba923a9b534c")
public static final String FIELDNAME_Payment_AddressVerified="60e1ce82-7005-5a67-e2e0-ba923a9b534c";

@XendraTrl(Identifier="65ee6e22-7318-422c-b15f-5cc444af7c09")
public static String es_PE_FIELD_PartnerPayments_AddressVerified_Description="Esta dirección ha sido devuelta";

@XendraTrl(Identifier="65ee6e22-7318-422c-b15f-5cc444af7c09")
public static String es_PE_FIELD_PartnerPayments_AddressVerified_Help="La dirección verificada indica si la dirección ha sido verificada por la compañía de la tarjeta de crédito";

@XendraTrl(Identifier="65ee6e22-7318-422c-b15f-5cc444af7c09")
public static String es_PE_FIELD_PartnerPayments_AddressVerified_Name="Dirección Verificada";

@XendraField(AD_Column_ID="R_AvsAddr",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="65ee6e22-7318-422c-b15f-5cc444af7c09")
public static final String FIELDNAME_PartnerPayments_AddressVerified="65ee6e22-7318-422c-b15f-5cc444af7c09";

@XendraTrl(Identifier="cb949737-927f-c8c5-79ac-9de292132699")
public static String es_PE_FIELD_Payment_AddressVerified2_Description="Esta dirección ha sido devuelta";

@XendraTrl(Identifier="cb949737-927f-c8c5-79ac-9de292132699")
public static String es_PE_FIELD_Payment_AddressVerified2_Help="La dirección verificada indica si la dirección ha sido verificada por la compañía de la tarjeta de crédito";

@XendraTrl(Identifier="cb949737-927f-c8c5-79ac-9de292132699")
public static String es_PE_FIELD_Payment_AddressVerified2_Name="Dirección Verificada";

@XendraField(AD_Column_ID="R_AvsAddr",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cb949737-927f-c8c5-79ac-9de292132699")
public static final String FIELDNAME_Payment_AddressVerified2="cb949737-927f-c8c5-79ac-9de292132699";

@XendraTrl(Identifier="ba8a672d-e229-6d94-7b47-b60ae2fea2f3")
public static String es_PE_COLUMN_R_AvsAddr_Name="Dirección Verificada";

@XendraColumn(AD_Element_ID="3432afba-fd83-3253-148c-70d58d2646cd",ColumnName="R_AvsAddr",
AD_Reference_ID=17,AD_Reference_Value_ID="a38caa4a-a80a-342b-7bcf-5e887ef40a4c",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ba8a672d-e229-6d94-7b47-b60ae2fea2f3",Synchronized="2017-08-05 16:54:00.0")
/** Column name R_AvsAddr */
public static final String COLUMNNAME_R_AvsAddr = "R_AvsAddr";

/** R_AvsZip AD_Reference=a38caa4a-a80a-342b-7bcf-5e887ef40a4c */
public static final int R_AVSZIP_AD_Reference_ID=213;
/** Set Zip verified.
@param R_AvsZip The Zip Code has been verified */
public void setR_AvsZip (String R_AvsZip)
{
if (R_AvsZip == null || R_AvsZip.equals(REF_C_PaymentAVS.Match) || R_AvsZip.equals(REF_C_PaymentAVS.NoMatch) || R_AvsZip.equals(REF_C_PaymentAVS.Unavailable));
 else throw new IllegalArgumentException ("R_AvsZip Invalid value - " + R_AvsZip + " - Reference_ID=213 - Y - N - X");
if (R_AvsZip != null && R_AvsZip.length() > 1)
{
log.warning("Length > 1 - truncated");
R_AvsZip = R_AvsZip.substring(0,0);
}
set_ValueNoCheck (COLUMNNAME_R_AvsZip, R_AvsZip);
}
/** Get Zip verified.
@return The Zip Code has been verified */
public String getR_AvsZip() 
{
return (String)get_Value(COLUMNNAME_R_AvsZip);
}

@XendraTrl(Identifier="4ccc04e2-1d03-c406-8a66-9978d4e6599c")
public static String es_PE_FIELD_Payment_ZipVerified_Description="El Código Postal ha sido verificado";

@XendraTrl(Identifier="4ccc04e2-1d03-c406-8a66-9978d4e6599c")
public static String es_PE_FIELD_Payment_ZipVerified_Help="El Zip Verificado indica si el código postal ha sido verificado por la compañía de la tarjeta de crédito";

@XendraTrl(Identifier="4ccc04e2-1d03-c406-8a66-9978d4e6599c")
public static String es_PE_FIELD_Payment_ZipVerified_Name="Código Postal Verificado";

@XendraField(AD_Column_ID="R_AvsZip",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="@IsTransfer@!Y & @IsOnline@=Y",DisplayLength=14,IsReadOnly=true,SeqNo=600,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4ccc04e2-1d03-c406-8a66-9978d4e6599c")
public static final String FIELDNAME_Payment_ZipVerified="4ccc04e2-1d03-c406-8a66-9978d4e6599c";

@XendraTrl(Identifier="074e913c-115e-fe67-97da-b866f57e6519")
public static String es_PE_FIELD_PartnerPayments_ZipVerified_Description="El Código Postal ha sido verificado";

@XendraTrl(Identifier="074e913c-115e-fe67-97da-b866f57e6519")
public static String es_PE_FIELD_PartnerPayments_ZipVerified_Help="El Zip Verificado indica si el código postal ha sido verificado por la compañía de la tarjeta de crédito";

@XendraTrl(Identifier="074e913c-115e-fe67-97da-b866f57e6519")
public static String es_PE_FIELD_PartnerPayments_ZipVerified_Name="Código Postal Verificado";

@XendraField(AD_Column_ID="R_AvsZip",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="074e913c-115e-fe67-97da-b866f57e6519")
public static final String FIELDNAME_PartnerPayments_ZipVerified="074e913c-115e-fe67-97da-b866f57e6519";

@XendraTrl(Identifier="aea4cd59-d2f6-a8dc-085a-87133d580428")
public static String es_PE_FIELD_Payment_ZipVerified2_Description="El Código Postal ha sido verificado";

@XendraTrl(Identifier="aea4cd59-d2f6-a8dc-085a-87133d580428")
public static String es_PE_FIELD_Payment_ZipVerified2_Help="El Zip Verificado indica si el código postal ha sido verificado por la compañía de la tarjeta de crédito";

@XendraTrl(Identifier="aea4cd59-d2f6-a8dc-085a-87133d580428")
public static String es_PE_FIELD_Payment_ZipVerified2_Name="Código Postal Verificado";

@XendraField(AD_Column_ID="R_AvsZip",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aea4cd59-d2f6-a8dc-085a-87133d580428")
public static final String FIELDNAME_Payment_ZipVerified2="aea4cd59-d2f6-a8dc-085a-87133d580428";

@XendraTrl(Identifier="e5062b0a-15ad-1c4b-13f3-28e5995ac94e")
public static String es_PE_COLUMN_R_AvsZip_Name="Código Postal Verificado";

@XendraColumn(AD_Element_ID="4f2e0f81-83ea-d083-4bfb-a91d0660a73f",ColumnName="R_AvsZip",
AD_Reference_ID=17,AD_Reference_Value_ID="a38caa4a-a80a-342b-7bcf-5e887ef40a4c",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e5062b0a-15ad-1c4b-13f3-28e5995ac94e",Synchronized="2017-08-05 16:54:00.0")
/** Column name R_AvsZip */
public static final String COLUMNNAME_R_AvsZip = "R_AvsZip";
/** Set CVV Match.
@param R_CVV2Match Credit Card Verification Code Match */
public void setR_CVV2Match (boolean R_CVV2Match)
{
set_ValueNoCheck (COLUMNNAME_R_CVV2Match, Boolean.valueOf(R_CVV2Match));
}
/** Get CVV Match.
@return Credit Card Verification Code Match */
public boolean isR_CVV2Match() 
{
Object oo = get_Value(COLUMNNAME_R_CVV2Match);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="a4d5d7c4-8b12-39a7-5889-0af141788f0c")
public static String es_PE_FIELD_Payment_CVVMatch_Description="Verificación del código matemático de la tarjeta de crédito";

@XendraTrl(Identifier="a4d5d7c4-8b12-39a7-5889-0af141788f0c")
public static String es_PE_FIELD_Payment_CVVMatch_Help="El código de verificación de la tarjeta de crédito fue cotejado";

@XendraTrl(Identifier="a4d5d7c4-8b12-39a7-5889-0af141788f0c")
public static String es_PE_FIELD_Payment_CVVMatch_Name="Cotejo VCM";

@XendraField(AD_Column_ID="R_CVV2Match",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a4d5d7c4-8b12-39a7-5889-0af141788f0c")
public static final String FIELDNAME_Payment_CVVMatch="a4d5d7c4-8b12-39a7-5889-0af141788f0c";

@XendraTrl(Identifier="12302bcd-8cb1-e9c4-b9a5-80ed38cf7593")
public static String es_PE_FIELD_PartnerPayments_CVVMatch_Description="Verificación del código matemático de la tarjeta de crédito";

@XendraTrl(Identifier="12302bcd-8cb1-e9c4-b9a5-80ed38cf7593")
public static String es_PE_FIELD_PartnerPayments_CVVMatch_Help="El código de verificación de la tarjeta de crédito fue cotejado";

@XendraTrl(Identifier="12302bcd-8cb1-e9c4-b9a5-80ed38cf7593")
public static String es_PE_FIELD_PartnerPayments_CVVMatch_Name="Cotejo VCM";

@XendraField(AD_Column_ID="R_CVV2Match",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="12302bcd-8cb1-e9c4-b9a5-80ed38cf7593")
public static final String FIELDNAME_PartnerPayments_CVVMatch="12302bcd-8cb1-e9c4-b9a5-80ed38cf7593";

@XendraTrl(Identifier="10e74d80-e3c5-9abb-8cc1-ed34833c5984")
public static String es_PE_FIELD_Payment_CVVMatch2_Description="Verificación del código matemático de la tarjeta de crédito";

@XendraTrl(Identifier="10e74d80-e3c5-9abb-8cc1-ed34833c5984")
public static String es_PE_FIELD_Payment_CVVMatch2_Help="El código de verificación de la tarjeta de crédito fue cotejado";

@XendraTrl(Identifier="10e74d80-e3c5-9abb-8cc1-ed34833c5984")
public static String es_PE_FIELD_Payment_CVVMatch2_Name="Cotejo VCM";

@XendraField(AD_Column_ID="R_CVV2Match",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="10e74d80-e3c5-9abb-8cc1-ed34833c5984")
public static final String FIELDNAME_Payment_CVVMatch2="10e74d80-e3c5-9abb-8cc1-ed34833c5984";

@XendraTrl(Identifier="228475be-22dc-1161-7bb3-28ee18850fc4")
public static String es_PE_COLUMN_R_CVV2Match_Name="Cotejo VCM";

@XendraColumn(AD_Element_ID="ebad21af-26af-9174-23d5-256377c0c639",ColumnName="R_CVV2Match",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="228475be-22dc-1161-7bb3-28ee18850fc4",
Synchronized="2017-08-05 16:54:00.0")
/** Column name R_CVV2Match */
public static final String COLUMNNAME_R_CVV2Match = "R_CVV2Match";

/** Ref_Payment_ID AD_Reference=673fb4cb-023a-7fa1-b83c-5a97d7f5caea */
public static final int REF_PAYMENT_ID_AD_Reference_ID=343;
/** Set Referenced Payment.
@param Ref_Payment_ID Referenced Payment */
public void setRef_Payment_ID (int Ref_Payment_ID)
{
if (Ref_Payment_ID <= 0) set_ValueNoCheck (COLUMNNAME_Ref_Payment_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_Ref_Payment_ID, Integer.valueOf(Ref_Payment_ID));
}
/** Get Referenced Payment.
@return Referenced Payment */
public int getRef_Payment_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Ref_Payment_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="976113e8-f717-8f19-16d4-7536252cb434")
public static String es_PE_FIELD_Payment_ReferencedPayment_Name="Pago Referido";

@XendraField(AD_Column_ID="Ref_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="976113e8-f717-8f19-16d4-7536252cb434")
public static final String FIELDNAME_Payment_ReferencedPayment="976113e8-f717-8f19-16d4-7536252cb434";

@XendraTrl(Identifier="a382e3ca-daad-d2ab-9ae5-34d7788cdfc8")
public static String es_PE_COLUMN_Ref_Payment_ID_Name="Pago Referido";

@XendraColumn(AD_Element_ID="fdfcab1c-fcf4-5365-2b42-ae0c3845fba2",ColumnName="Ref_Payment_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="673fb4cb-023a-7fa1-b83c-5a97d7f5caea",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a382e3ca-daad-d2ab-9ae5-34d7788cdfc8",Synchronized="2017-08-05 16:54:00.0")
/** Column name Ref_Payment_ID */
public static final String COLUMNNAME_Ref_Payment_ID = "Ref_Payment_ID";
/** Set RenewedAmt.
@param RenewedAmt RenewedAmt */
public void setRenewedAmt (BigDecimal RenewedAmt)
{
set_Value (COLUMNNAME_RenewedAmt, RenewedAmt);
}
/** Get RenewedAmt.
@return RenewedAmt */
public BigDecimal getRenewedAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_RenewedAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="b93f375c-1dff-a03f-54c2-b99a903ed4d5")
public static String es_PE_FIELD_Payment_RenewedAmt_Name="Monto a renovar";

@XendraField(AD_Column_ID="RenewedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=700,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b93f375c-1dff-a03f-54c2-b99a903ed4d5")
public static final String FIELDNAME_Payment_RenewedAmt="b93f375c-1dff-a03f-54c2-b99a903ed4d5";

@XendraTrl(Identifier="234564ef-dad6-dd56-03fa-6216ec38a3de")
public static String es_PE_COLUMN_RenewedAmt_Name="RenewedAmt";

@XendraColumn(AD_Element_ID="129b3913-b2f7-440f-2257-1f7b71f40bb0",ColumnName="RenewedAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="234564ef-dad6-dd56-03fa-6216ec38a3de",
Synchronized="2017-08-05 16:54:00.0")
/** Column name RenewedAmt */
public static final String COLUMNNAME_RenewedAmt = "RenewedAmt";
/** Set Reversal_Id.
@param Reversal_Id Reversal_Id */
public void setReversal_Id (int Reversal_Id)
{
set_Value (COLUMNNAME_Reversal_Id, Integer.valueOf(Reversal_Id));
}
/** Get Reversal_Id.
@return Reversal_Id */
public int getReversal_Id() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Reversal_Id);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5697a1d7-1ea6-4616-b01c-898d5b6a2250")
public static String es_PE_COLUMN_Reversal_Id_Name="Reversal_Id";

@XendraColumn(AD_Element_ID="072b6a3c-1389-3168-b586-752d0874e508",ColumnName="Reversal_Id",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5697a1d7-1ea6-4616-b01c-898d5b6a2250",
Synchronized="2017-08-05 16:54:00.0")
/** Column name Reversal_Id */
public static final String COLUMNNAME_Reversal_Id = "Reversal_Id";
/** Set Info.
@param R_Info Response info */
public void setR_Info (String R_Info)
{
if (R_Info != null && R_Info.length() > 2000)
{
log.warning("Length > 2000 - truncated");
R_Info = R_Info.substring(0,1999);
}
set_ValueNoCheck (COLUMNNAME_R_Info, R_Info);
}
/** Get Info.
@return Response info */
public String getR_Info() 
{
String value = (String)get_Value(COLUMNNAME_R_Info);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="71642909-67a3-ecac-4551-bc058c3155f1")
public static String es_PE_FIELD_Payment_Info_Description="Respuesta info";

@XendraTrl(Identifier="71642909-67a3-ecac-4551-bc058c3155f1")
public static String es_PE_FIELD_Payment_Info_Help="La Info indica cualquier información de respuesta de la compañía de la tarjeta de crédito.";

@XendraTrl(Identifier="71642909-67a3-ecac-4551-bc058c3155f1")
public static String es_PE_FIELD_Payment_Info_Name="Información";

@XendraField(AD_Column_ID="R_Info",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="Status",IsDisplayed=false,
DisplayLogic="@IsOnline@=Y",DisplayLength=20,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="71642909-67a3-ecac-4551-bc058c3155f1")
public static final String FIELDNAME_Payment_Info="71642909-67a3-ecac-4551-bc058c3155f1";

@XendraTrl(Identifier="335cbcc4-2338-50ad-5462-9357c2a1bb50")
public static String es_PE_FIELD_PartnerPayments_Info_Description="Respuesta info";

@XendraTrl(Identifier="335cbcc4-2338-50ad-5462-9357c2a1bb50")
public static String es_PE_FIELD_PartnerPayments_Info_Help="La Info indica cualquier información de respuesta de la compañía de la tarjeta de crédito.";

@XendraTrl(Identifier="335cbcc4-2338-50ad-5462-9357c2a1bb50")
public static String es_PE_FIELD_PartnerPayments_Info_Name="Información";

@XendraField(AD_Column_ID="R_Info",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="335cbcc4-2338-50ad-5462-9357c2a1bb50")
public static final String FIELDNAME_PartnerPayments_Info="335cbcc4-2338-50ad-5462-9357c2a1bb50";

@XendraTrl(Identifier="8738dd54-d685-47a1-19f4-5f1ae8a8f8d5")
public static String es_PE_FIELD_Payment_Info2_Description="Respuesta info";

@XendraTrl(Identifier="8738dd54-d685-47a1-19f4-5f1ae8a8f8d5")
public static String es_PE_FIELD_Payment_Info2_Help="La Info indica cualquier información de respuesta de la compañía de la tarjeta de crédito.";

@XendraTrl(Identifier="8738dd54-d685-47a1-19f4-5f1ae8a8f8d5")
public static String es_PE_FIELD_Payment_Info2_Name="Información";

@XendraField(AD_Column_ID="R_Info",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8738dd54-d685-47a1-19f4-5f1ae8a8f8d5")
public static final String FIELDNAME_Payment_Info2="8738dd54-d685-47a1-19f4-5f1ae8a8f8d5";

@XendraTrl(Identifier="743dcd4c-fc16-6fd3-5d80-cd200ea79a7a")
public static String es_PE_COLUMN_R_Info_Name="Información";

@XendraColumn(AD_Element_ID="9c1c4fed-0da5-ba9d-ce5a-5a95fe04f610",ColumnName="R_Info",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="743dcd4c-fc16-6fd3-5d80-cd200ea79a7a",
Synchronized="2017-08-05 16:54:00.0")
/** Column name R_Info */
public static final String COLUMNNAME_R_Info = "R_Info";
/** Set Routing No.
@param RoutingNo Bank Routing Number */
public void setRoutingNo (String RoutingNo)
{
if (RoutingNo != null && RoutingNo.length() > 20)
{
log.warning("Length > 20 - truncated");
RoutingNo = RoutingNo.substring(0,19);
}
set_Value (COLUMNNAME_RoutingNo, RoutingNo);
}
/** Get Routing No.
@return Bank Routing Number */
public String getRoutingNo() 
{
String value = (String)get_Value(COLUMNNAME_RoutingNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="b5223c19-0e1c-84db-bb90-8dface399c74")
public static String es_PE_FIELD_Payment_RoutingNo_Description="Número de sucursal bancaria";

@XendraTrl(Identifier="b5223c19-0e1c-84db-bb90-8dface399c74")
public static String es_PE_FIELD_Payment_RoutingNo_Help="El número de ruta del banco (Número ABA) identifica un banco legal. Se usa en ruteo de cheques y transacciones electrónicas.";

@XendraTrl(Identifier="b5223c19-0e1c-84db-bb90-8dface399c74")
public static String es_PE_FIELD_Payment_RoutingNo_Name="No. de Ruta";

@XendraField(AD_Column_ID="RoutingNo",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsTransfer@!Y & @TenderType@=A | @TenderType@=K",DisplayLength=20,IsReadOnly=false,
SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b5223c19-0e1c-84db-bb90-8dface399c74")
public static final String FIELDNAME_Payment_RoutingNo="b5223c19-0e1c-84db-bb90-8dface399c74";

@XendraTrl(Identifier="a0b62a9d-38e6-bd0c-efcc-234cbd026158")
public static String es_PE_FIELD_PartnerPayments_RoutingNo_Description="Número de sucursal bancaria";

@XendraTrl(Identifier="a0b62a9d-38e6-bd0c-efcc-234cbd026158")
public static String es_PE_FIELD_PartnerPayments_RoutingNo_Help="El número de ruta del banco (Número ABA) identifica un banco legal. Se usa en ruteo de cheques y transacciones electrónicas.";

@XendraTrl(Identifier="a0b62a9d-38e6-bd0c-efcc-234cbd026158")
public static String es_PE_FIELD_PartnerPayments_RoutingNo_Name="No. de Ruta";

@XendraField(AD_Column_ID="RoutingNo",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a0b62a9d-38e6-bd0c-efcc-234cbd026158")
public static final String FIELDNAME_PartnerPayments_RoutingNo="a0b62a9d-38e6-bd0c-efcc-234cbd026158";

@XendraTrl(Identifier="e2ff7907-5196-e723-78de-ef27e03983b1")
public static String es_PE_FIELD_Payment_RoutingNo2_Description="Número de sucursal bancaria";

@XendraTrl(Identifier="e2ff7907-5196-e723-78de-ef27e03983b1")
public static String es_PE_FIELD_Payment_RoutingNo2_Help="El número de ruta del banco (Número ABA) identifica un banco legal. Se usa en ruteo de cheques y transacciones electrónicas.";

@XendraTrl(Identifier="e2ff7907-5196-e723-78de-ef27e03983b1")
public static String es_PE_FIELD_Payment_RoutingNo2_Name="No. de Ruta";

@XendraField(AD_Column_ID="RoutingNo",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e2ff7907-5196-e723-78de-ef27e03983b1")
public static final String FIELDNAME_Payment_RoutingNo2="e2ff7907-5196-e723-78de-ef27e03983b1";

@XendraTrl(Identifier="56865d93-51ea-38f0-f8fa-a34eeb41c89f")
public static String es_PE_COLUMN_RoutingNo_Name="No. de Ruta";

@XendraColumn(AD_Element_ID="6fe1dae1-ff7f-9b06-686b-31ba56524158",ColumnName="RoutingNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="56865d93-51ea-38f0-f8fa-a34eeb41c89f",
Synchronized="2017-08-05 16:54:00.0")
/** Column name RoutingNo */
public static final String COLUMNNAME_RoutingNo = "RoutingNo";
/** Set Reference.
@param R_PnRef Payment reference */
public void setR_PnRef (String R_PnRef)
{
if (R_PnRef != null && R_PnRef.length() > 20)
{
log.warning("Length > 20 - truncated");
R_PnRef = R_PnRef.substring(0,19);
}
set_ValueNoCheck (COLUMNNAME_R_PnRef, R_PnRef);
}
/** Get Reference.
@return Payment reference */
public String getR_PnRef() 
{
String value = (String)get_Value(COLUMNNAME_R_PnRef);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="8d3f181e-9c3c-b056-e51a-3dd2038d19eb")
public static String es_PE_FIELD_Payment_Reference_Description="Referencia del pago";

@XendraTrl(Identifier="8d3f181e-9c3c-b056-e51a-3dd2038d19eb")
public static String es_PE_FIELD_Payment_Reference_Help="La Referencia de Pago indica la referencia devuelta de la compañía de la tarjeta de crédito para un pago";

@XendraTrl(Identifier="8d3f181e-9c3c-b056-e51a-3dd2038d19eb")
public static String es_PE_FIELD_Payment_Reference_Name="Referencia";

@XendraField(AD_Column_ID="R_PnRef",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="@IsTransfer@!Y & @IsOnline@=Y",DisplayLength=20,IsReadOnly=true,SeqNo=580,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="8d3f181e-9c3c-b056-e51a-3dd2038d19eb")
public static final String FIELDNAME_Payment_Reference="8d3f181e-9c3c-b056-e51a-3dd2038d19eb";

@XendraTrl(Identifier="31dae979-2727-7b24-86d8-cc6bc6e525a4")
public static String es_PE_FIELD_PartnerPayments_Reference_Description="Referencia del pago";

@XendraTrl(Identifier="31dae979-2727-7b24-86d8-cc6bc6e525a4")
public static String es_PE_FIELD_PartnerPayments_Reference_Help="La Referencia de Pago indica la referencia devuelta de la compañía de la tarjeta de crédito para un pago";

@XendraTrl(Identifier="31dae979-2727-7b24-86d8-cc6bc6e525a4")
public static String es_PE_FIELD_PartnerPayments_Reference_Name="Referencia";

@XendraField(AD_Column_ID="R_PnRef",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="31dae979-2727-7b24-86d8-cc6bc6e525a4")
public static final String FIELDNAME_PartnerPayments_Reference="31dae979-2727-7b24-86d8-cc6bc6e525a4";

@XendraTrl(Identifier="b69034c6-b0b0-563e-7926-f60c8413f6a0")
public static String es_PE_FIELD_Payment_Reference2_Description="Referencia del pago";

@XendraTrl(Identifier="b69034c6-b0b0-563e-7926-f60c8413f6a0")
public static String es_PE_FIELD_Payment_Reference2_Help="La Referencia de Pago indica la referencia devuelta de la compañía de la tarjeta de crédito para un pago";

@XendraTrl(Identifier="b69034c6-b0b0-563e-7926-f60c8413f6a0")
public static String es_PE_FIELD_Payment_Reference2_Name="Referencia";

@XendraField(AD_Column_ID="R_PnRef",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b69034c6-b0b0-563e-7926-f60c8413f6a0")
public static final String FIELDNAME_Payment_Reference2="b69034c6-b0b0-563e-7926-f60c8413f6a0";

@XendraTrl(Identifier="8396f47d-4647-e34e-5107-93768369639c")
public static String es_PE_COLUMN_R_PnRef_Name="Referencia";

@XendraColumn(AD_Element_ID="bc667ce3-4709-a9f2-fdb7-0decdb6500a1",ColumnName="R_PnRef",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8396f47d-4647-e34e-5107-93768369639c",
Synchronized="2017-08-05 16:54:00.0")
/** Column name R_PnRef */
public static final String COLUMNNAME_R_PnRef = "R_PnRef";
/** Set Reference (DC).
@param R_PnRef_DC Payment Reference Delayed Capture */
public void setR_PnRef_DC (String R_PnRef_DC)
{
if (R_PnRef_DC != null && R_PnRef_DC.length() > 20)
{
log.warning("Length > 20 - truncated");
R_PnRef_DC = R_PnRef_DC.substring(0,19);
}
set_ValueNoCheck (COLUMNNAME_R_PnRef_DC, R_PnRef_DC);
}
/** Get Reference (DC).
@return Payment Reference Delayed Capture */
public String getR_PnRef_DC() 
{
String value = (String)get_Value(COLUMNNAME_R_PnRef_DC);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="47340fef-16c7-e9d0-0b1c-5ef021d7c0f0")
public static String es_PE_FIELD_Payment_ReferenceDC_Description="Captura de referencia (Pago Retrasado).";

@XendraTrl(Identifier="47340fef-16c7-e9d0-0b1c-5ef021d7c0f0")
public static String es_PE_FIELD_Payment_ReferenceDC_Help="El pago de referencia indica la referencia retrasada para la tarjeta de credito de un pago de la Compañía.";

@XendraTrl(Identifier="47340fef-16c7-e9d0-0b1c-5ef021d7c0f0")
public static String es_PE_FIELD_Payment_ReferenceDC_Name="Referencia (RD)";

@XendraField(AD_Column_ID="R_PnRef_DC",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="47340fef-16c7-e9d0-0b1c-5ef021d7c0f0")
public static final String FIELDNAME_Payment_ReferenceDC="47340fef-16c7-e9d0-0b1c-5ef021d7c0f0";

@XendraTrl(Identifier="89e4525b-3174-fcb2-9525-23343cd635c8")
public static String es_PE_FIELD_PartnerPayments_ReferenceDC_Description="Captura de referencia (Pago Retrasado).";

@XendraTrl(Identifier="89e4525b-3174-fcb2-9525-23343cd635c8")
public static String es_PE_FIELD_PartnerPayments_ReferenceDC_Help="El pago de referencia indica la referencia retrasada para la tarjeta de credito de un pago de la Compañía.";

@XendraTrl(Identifier="89e4525b-3174-fcb2-9525-23343cd635c8")
public static String es_PE_FIELD_PartnerPayments_ReferenceDC_Name="Referencia (RD)";

@XendraField(AD_Column_ID="R_PnRef_DC",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="89e4525b-3174-fcb2-9525-23343cd635c8")
public static final String FIELDNAME_PartnerPayments_ReferenceDC="89e4525b-3174-fcb2-9525-23343cd635c8";

@XendraTrl(Identifier="09488d52-62e4-3e5d-be57-3324ced53cea")
public static String es_PE_FIELD_Payment_ReferenceDC2_Description="Captura de referencia (Pago Retrasado).";

@XendraTrl(Identifier="09488d52-62e4-3e5d-be57-3324ced53cea")
public static String es_PE_FIELD_Payment_ReferenceDC2_Help="El pago de referencia indica la referencia retrasada para la tarjeta de credito de un pago de la Compañía.";

@XendraTrl(Identifier="09488d52-62e4-3e5d-be57-3324ced53cea")
public static String es_PE_FIELD_Payment_ReferenceDC2_Name="Referencia (RD)";

@XendraField(AD_Column_ID="R_PnRef_DC",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="09488d52-62e4-3e5d-be57-3324ced53cea")
public static final String FIELDNAME_Payment_ReferenceDC2="09488d52-62e4-3e5d-be57-3324ced53cea";

@XendraTrl(Identifier="1ae62c99-aedb-44ac-3f8c-1a6dfe29b78b")
public static String es_PE_COLUMN_R_PnRef_DC_Name="Referencia (RD)";

@XendraColumn(AD_Element_ID="ce21c027-3b8a-320f-b5ba-c7b5a54bf77b",ColumnName="R_PnRef_DC",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1ae62c99-aedb-44ac-3f8c-1a6dfe29b78b",
Synchronized="2017-08-05 16:54:00.0")
/** Column name R_PnRef_DC */
public static final String COLUMNNAME_R_PnRef_DC = "R_PnRef_DC";
/** Set Response Message.
@param R_RespMsg Response message */
public void setR_RespMsg (String R_RespMsg)
{
if (R_RespMsg != null && R_RespMsg.length() > 60)
{
log.warning("Length > 60 - truncated");
R_RespMsg = R_RespMsg.substring(0,59);
}
set_ValueNoCheck (COLUMNNAME_R_RespMsg, R_RespMsg);
}
/** Get Response Message.
@return Response message */
public String getR_RespMsg() 
{
String value = (String)get_Value(COLUMNNAME_R_RespMsg);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="e2a52bdc-389e-dbc0-9be2-88b649589199")
public static String es_PE_FIELD_Payment_ResponseMessage_Description="Mensaje de respuesta.";

@XendraTrl(Identifier="e2a52bdc-389e-dbc0-9be2-88b649589199")
public static String es_PE_FIELD_Payment_ResponseMessage_Help="El mensaje de respuesta indica el mensaje devuelto desde la compañía de la tarjeta de crédito como resultado de una transmisión.";

@XendraTrl(Identifier="e2a52bdc-389e-dbc0-9be2-88b649589199")
public static String es_PE_FIELD_Payment_ResponseMessage_Name="Mensaje";

@XendraField(AD_Column_ID="R_RespMsg",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="@IsTransfer@!Y & @IsOnline@=Y",DisplayLength=20,IsReadOnly=true,SeqNo=570,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="e2a52bdc-389e-dbc0-9be2-88b649589199")
public static final String FIELDNAME_Payment_ResponseMessage="e2a52bdc-389e-dbc0-9be2-88b649589199";

@XendraTrl(Identifier="4058b27e-277b-147c-cd1c-a263628766ac")
public static String es_PE_FIELD_PartnerPayments_ResponseMessage_Description="Mensaje de respuesta.";

@XendraTrl(Identifier="4058b27e-277b-147c-cd1c-a263628766ac")
public static String es_PE_FIELD_PartnerPayments_ResponseMessage_Help="El mensaje de respuesta indica el mensaje devuelto desde la compañía de la tarjeta de crédito como resultado de una transmisión.";

@XendraTrl(Identifier="4058b27e-277b-147c-cd1c-a263628766ac")
public static String es_PE_FIELD_PartnerPayments_ResponseMessage_Name="Mensaje";

@XendraField(AD_Column_ID="R_RespMsg",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4058b27e-277b-147c-cd1c-a263628766ac")
public static final String FIELDNAME_PartnerPayments_ResponseMessage="4058b27e-277b-147c-cd1c-a263628766ac";

@XendraTrl(Identifier="329fa9a7-14c1-2437-9d68-b4da8364a0a1")
public static String es_PE_FIELD_Payment_ResponseMessage2_Description="Mensaje de respuesta.";

@XendraTrl(Identifier="329fa9a7-14c1-2437-9d68-b4da8364a0a1")
public static String es_PE_FIELD_Payment_ResponseMessage2_Help="El mensaje de respuesta indica el mensaje devuelto desde la compañía de la tarjeta de crédito como resultado de una transmisión.";

@XendraTrl(Identifier="329fa9a7-14c1-2437-9d68-b4da8364a0a1")
public static String es_PE_FIELD_Payment_ResponseMessage2_Name="Mensaje";

@XendraField(AD_Column_ID="R_RespMsg",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="329fa9a7-14c1-2437-9d68-b4da8364a0a1")
public static final String FIELDNAME_Payment_ResponseMessage2="329fa9a7-14c1-2437-9d68-b4da8364a0a1";

@XendraTrl(Identifier="b12e4416-8744-d16e-4e69-0284e3659d39")
public static String es_PE_COLUMN_R_RespMsg_Name="Mensaje";

@XendraColumn(AD_Element_ID="201e2ce8-8ec2-bbb5-93e1-38822287784e",ColumnName="R_RespMsg",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b12e4416-8744-d16e-4e69-0284e3659d39",
Synchronized="2017-08-05 16:54:01.0")
/** Column name R_RespMsg */
public static final String COLUMNNAME_R_RespMsg = "R_RespMsg";
/** Set Result.
@param R_Result Result of transmission */
public void setR_Result (String R_Result)
{
if (R_Result != null && R_Result.length() > 20)
{
log.warning("Length > 20 - truncated");
R_Result = R_Result.substring(0,19);
}
set_ValueNoCheck (COLUMNNAME_R_Result, R_Result);
}
/** Get Result.
@return Result of transmission */
public String getR_Result() 
{
String value = (String)get_Value(COLUMNNAME_R_Result);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="febb857e-ca32-c379-8ce9-51814d9eb1ee")
public static String es_PE_FIELD_Payment_Result_Description="Resultado de la transmisión";

@XendraTrl(Identifier="febb857e-ca32-c379-8ce9-51814d9eb1ee")
public static String es_PE_FIELD_Payment_Result_Help="El resultado de la respuesta indica el resultado de la transmisión a la compañía de la tarjeta de crédito.";

@XendraTrl(Identifier="febb857e-ca32-c379-8ce9-51814d9eb1ee")
public static String es_PE_FIELD_Payment_Result_Name="Resultado";

@XendraField(AD_Column_ID="R_Result",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="@IsTransfer@!Y & @IsOnline@=Y",DisplayLength=20,IsReadOnly=true,SeqNo=560,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="febb857e-ca32-c379-8ce9-51814d9eb1ee")
public static final String FIELDNAME_Payment_Result="febb857e-ca32-c379-8ce9-51814d9eb1ee";

@XendraTrl(Identifier="4e2a1125-387b-b7e8-2057-ff8013b3e0c6")
public static String es_PE_FIELD_PartnerPayments_Result_Description="Resultado de la transmisión";

@XendraTrl(Identifier="4e2a1125-387b-b7e8-2057-ff8013b3e0c6")
public static String es_PE_FIELD_PartnerPayments_Result_Help="El resultado de la respuesta indica el resultado de la transmisión a la compañía de la tarjeta de crédito.";

@XendraTrl(Identifier="4e2a1125-387b-b7e8-2057-ff8013b3e0c6")
public static String es_PE_FIELD_PartnerPayments_Result_Name="Resultado";

@XendraField(AD_Column_ID="R_Result",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4e2a1125-387b-b7e8-2057-ff8013b3e0c6")
public static final String FIELDNAME_PartnerPayments_Result="4e2a1125-387b-b7e8-2057-ff8013b3e0c6";

@XendraTrl(Identifier="51988671-716c-1513-984b-81f7507778b0")
public static String es_PE_FIELD_Payment_Result2_Description="Resultado de la transmisión";

@XendraTrl(Identifier="51988671-716c-1513-984b-81f7507778b0")
public static String es_PE_FIELD_Payment_Result2_Help="El resultado de la respuesta indica el resultado de la transmisión a la compañía de la tarjeta de crédito.";

@XendraTrl(Identifier="51988671-716c-1513-984b-81f7507778b0")
public static String es_PE_FIELD_Payment_Result2_Name="Resultado";

@XendraField(AD_Column_ID="R_Result",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="51988671-716c-1513-984b-81f7507778b0")
public static final String FIELDNAME_Payment_Result2="51988671-716c-1513-984b-81f7507778b0";

@XendraTrl(Identifier="ece852df-a7bb-287e-f09c-2418b575cf51")
public static String es_PE_COLUMN_R_Result_Name="Resultado";

@XendraColumn(AD_Element_ID="8348daed-16ca-c682-827b-0bacd5dbb1a1",ColumnName="R_Result",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ece852df-a7bb-287e-f09c-2418b575cf51",
Synchronized="2017-08-05 16:54:01.0")
/** Column name R_Result */
public static final String COLUMNNAME_R_Result = "R_Result";
/** Set Swipe.
@param Swipe Track 1 and 2 of the Credit Card */
public void setSwipe (String Swipe)
{
if (Swipe != null && Swipe.length() > 80)
{
log.warning("Length > 80 - truncated");
Swipe = Swipe.substring(0,79);
}
set_ValueNoCheck (COLUMNNAME_Swipe, Swipe);
}
/** Get Swipe.
@return Track 1 and 2 of the Credit Card */
public String getSwipe() 
{
String value = (String)get_Value(COLUMNNAME_Swipe);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="0d44987e-63b1-9594-abbc-70da5a3eb7de")
public static String es_PE_FIELD_Payment_Swipe_Description="Track 1 and 2 of the Credit Card";

@XendraTrl(Identifier="0d44987e-63b1-9594-abbc-70da5a3eb7de")
public static String es_PE_FIELD_Payment_Swipe_Help="Swiped information for Credit Card Presence Transactions";

@XendraTrl(Identifier="0d44987e-63b1-9594-abbc-70da5a3eb7de")
public static String es_PE_FIELD_Payment_Swipe_Name="Swipe";
@XendraField(AD_Column_ID="Swipe",
IsCentrallyMaintained=true,AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",
IsDisplayed=false,DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="0d44987e-63b1-9594-abbc-70da5a3eb7de")
public static final String FIELDNAME_Payment_Swipe="0d44987e-63b1-9594-abbc-70da5a3eb7de";

@XendraTrl(Identifier="90275ea0-8eaa-ac51-b443-52541b20bd57")
public static String es_PE_FIELD_PartnerPayments_Swipe_Description="Track 1 and 2 of the Credit Card";

@XendraTrl(Identifier="90275ea0-8eaa-ac51-b443-52541b20bd57")
public static String es_PE_FIELD_PartnerPayments_Swipe_Help="Swiped information for Credit Card Presence Transactions";

@XendraTrl(Identifier="90275ea0-8eaa-ac51-b443-52541b20bd57")
public static String es_PE_FIELD_PartnerPayments_Swipe_Name="Swipe";

@XendraField(AD_Column_ID="Swipe",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="90275ea0-8eaa-ac51-b443-52541b20bd57")
public static final String FIELDNAME_PartnerPayments_Swipe="90275ea0-8eaa-ac51-b443-52541b20bd57";

@XendraTrl(Identifier="d0b2ede0-2fce-17fb-8640-bcbd69d0d7b2")
public static String es_PE_FIELD_Payment_Swipe2_Description="Track 1 and 2 of the Credit Card";

@XendraTrl(Identifier="d0b2ede0-2fce-17fb-8640-bcbd69d0d7b2")
public static String es_PE_FIELD_Payment_Swipe2_Help="Swiped information for Credit Card Presence Transactions";

@XendraTrl(Identifier="d0b2ede0-2fce-17fb-8640-bcbd69d0d7b2")
public static String es_PE_FIELD_Payment_Swipe2_Name="Swipe";
@XendraField(AD_Column_ID="Swipe",
IsCentrallyMaintained=true,AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",
IsDisplayed=false,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d0b2ede0-2fce-17fb-8640-bcbd69d0d7b2")
public static final String FIELDNAME_Payment_Swipe2="d0b2ede0-2fce-17fb-8640-bcbd69d0d7b2";

@XendraTrl(Identifier="499b1408-26e1-f4ca-b284-6a2b5d07bb55")
public static String es_PE_COLUMN_Swipe_Name="Swipe";

@XendraColumn(AD_Element_ID="222d5f88-5d5d-a3f4-9fbb-5ea53d84ee2d",ColumnName="Swipe",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=80,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="499b1408-26e1-f4ca-b284-6a2b5d07bb55",
Synchronized="2017-08-05 16:54:01.0")
/** Column name Swipe */
public static final String COLUMNNAME_Swipe = "Swipe";
/** Set Tax Amount.
@param TaxAmt Tax Amount for a document */
public void setTaxAmt (BigDecimal TaxAmt)
{
set_Value (COLUMNNAME_TaxAmt, TaxAmt);
}
/** Get Tax Amount.
@return Tax Amount for a document */
public BigDecimal getTaxAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="65400257-b2d9-685a-d62c-0dd95c15555e")
public static String es_PE_FIELD_Payment_TaxAmount_Description="Monto del impuesto para las transacciones con tarjeta de cr=E9dito";

@XendraTrl(Identifier="65400257-b2d9-685a-d62c-0dd95c15555e")
public static String es_PE_FIELD_Payment_TaxAmount_Help="El monto del impuesto exhibe la cantidad total del impuesto. El monto del impuesto se utiliza solamente para el proceso de la tarjeta de cr=E9dito.";

@XendraTrl(Identifier="65400257-b2d9-685a-d62c-0dd95c15555e")
public static String es_PE_FIELD_Payment_TaxAmount_Name="Total del Impuesto";

@XendraField(AD_Column_ID="TaxAmt",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsTransfer@!Y & @CreditCardType@=P & @IsOnline@=Y",DisplayLength=26,
IsReadOnly=false,SeqNo=460,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,
Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="65400257-b2d9-685a-d62c-0dd95c15555e")
public static final String FIELDNAME_Payment_TaxAmount="65400257-b2d9-685a-d62c-0dd95c15555e";

@XendraTrl(Identifier="b1325883-6d44-0fb7-096e-8b751246fd7a")
public static String es_PE_FIELD_PartnerPayments_TaxAmount_Description="Total del impuesto para un documento";

@XendraTrl(Identifier="b1325883-6d44-0fb7-096e-8b751246fd7a")
public static String es_PE_FIELD_PartnerPayments_TaxAmount_Help="El Total de Impuesto despliega el total de impuesto para un documento";

@XendraTrl(Identifier="b1325883-6d44-0fb7-096e-8b751246fd7a")
public static String es_PE_FIELD_PartnerPayments_TaxAmount_Name="Total del Impuesto";

@XendraField(AD_Column_ID="TaxAmt",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b1325883-6d44-0fb7-096e-8b751246fd7a")
public static final String FIELDNAME_PartnerPayments_TaxAmount="b1325883-6d44-0fb7-096e-8b751246fd7a";

@XendraTrl(Identifier="276b61a9-a321-17ed-1cd8-734ec4a7cc90")
public static String es_PE_FIELD_Payment_TaxAmount2_Description="Total del impuesto para un documento";

@XendraTrl(Identifier="276b61a9-a321-17ed-1cd8-734ec4a7cc90")
public static String es_PE_FIELD_Payment_TaxAmount2_Help="El Total de Impuesto despliega el total de impuesto para un documento";

@XendraTrl(Identifier="276b61a9-a321-17ed-1cd8-734ec4a7cc90")
public static String es_PE_FIELD_Payment_TaxAmount2_Name="Total del Impuesto";

@XendraField(AD_Column_ID="TaxAmt",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="276b61a9-a321-17ed-1cd8-734ec4a7cc90")
public static final String FIELDNAME_Payment_TaxAmount2="276b61a9-a321-17ed-1cd8-734ec4a7cc90";

@XendraTrl(Identifier="c08931f1-532e-f233-8199-fa6cb18c5d71")
public static String es_PE_COLUMN_TaxAmt_Name="Total del Impuesto";

@XendraColumn(AD_Element_ID="462941e1-a196-170f-fd16-84da06ba50ea",ColumnName="TaxAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c08931f1-532e-f233-8199-fa6cb18c5d71",
Synchronized="2017-08-05 16:54:01.0")
/** Column name TaxAmt */
public static final String COLUMNNAME_TaxAmt = "TaxAmt";

/** TenderType AD_Reference=99d2e48b-10ce-666f-5675-0a893b4e12aa */
public static final int TENDERTYPE_AD_Reference_ID=214;
/** Set Tender type.
@param TenderType Method of Payment */
public void setTenderType (String TenderType)
{
if (TenderType == null) throw new IllegalArgumentException ("TenderType is mandatory");
if (TenderType.equals(REF_C_PaymentTenderType.Continet) || TenderType.equals(REF_C_PaymentTenderType.FEC) || TenderType.equals(REF_C_PaymentTenderType.Telecredito) || TenderType.equals(REF_C_PaymentTenderType.DirectDebit) || TenderType.equals(REF_C_PaymentTenderType.CreditCard) || TenderType.equals(REF_C_PaymentTenderType.Check) || TenderType.equals(REF_C_PaymentTenderType.BillOfExchange) || TenderType.equals(REF_C_PaymentTenderType.Giro) || TenderType.equals(REF_C_PaymentTenderType.DirectDeposit) || TenderType.equals(REF_C_PaymentTenderType.Transfer));
 else throw new IllegalArgumentException ("TenderType Invalid value - " + TenderType + " - Reference_ID=214 - CN - FC - TL - D - C - K - B - G - A - T");
if (TenderType.length() > 1)
{
log.warning("Length > 1 - truncated");
TenderType = TenderType.substring(0,0);
}
set_Value (COLUMNNAME_TenderType, TenderType);
}
/** Get Tender type.
@return Method of Payment */
public String getTenderType() 
{
return (String)get_Value(COLUMNNAME_TenderType);
}

@XendraTrl(Identifier="a9c528eb-6285-6093-8273-4bb148f62229")
public static String es_PE_FIELD_Payment_TenderType_Description="Método de Movimiento";

@XendraTrl(Identifier="a9c528eb-6285-6093-8273-4bb148f62229")
public static String es_PE_FIELD_Payment_TenderType_Help="El Tipo de Pago indica el método de pago  (ACH; Tarjeta de Crédito; Cheque)";

@XendraTrl(Identifier="a9c528eb-6285-6093-8273-4bb148f62229")
public static String es_PE_FIELD_Payment_TenderType_Name="Tipo de Movimiento";

@XendraField(AD_Column_ID="TenderType",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="Document",IsDisplayed=true,
DisplayLogic="@IsTransfer@!Y",DisplayLength=14,IsReadOnly=false,SeqNo=290,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="a9c528eb-6285-6093-8273-4bb148f62229")
public static final String FIELDNAME_Payment_TenderType="a9c528eb-6285-6093-8273-4bb148f62229";

@XendraTrl(Identifier="fe10b24b-1bc6-2ace-ab1d-c09e642252c4")
public static String es_PE_FIELD_PartnerPayments_TenderType_Description="Método de pago";

@XendraTrl(Identifier="fe10b24b-1bc6-2ace-ab1d-c09e642252c4")
public static String es_PE_FIELD_PartnerPayments_TenderType_Help="El Tipo de Pago indica el método de pago  (ACH; Tarjeta de Crédito; Cheque)";

@XendraTrl(Identifier="fe10b24b-1bc6-2ace-ab1d-c09e642252c4")
public static String es_PE_FIELD_PartnerPayments_TenderType_Name="Tipo de Pago";

@XendraField(AD_Column_ID="TenderType",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fe10b24b-1bc6-2ace-ab1d-c09e642252c4")
public static final String FIELDNAME_PartnerPayments_TenderType="fe10b24b-1bc6-2ace-ab1d-c09e642252c4";

@XendraTrl(Identifier="40ebc7cb-f31a-5c70-a5f7-c27c80fd8665")
public static String es_PE_FIELD_Payment_TenderType2_Description="Método de pago";

@XendraTrl(Identifier="40ebc7cb-f31a-5c70-a5f7-c27c80fd8665")
public static String es_PE_FIELD_Payment_TenderType2_Help="El Tipo de Pago indica el método de pago  (ACH; Tarjeta de Crédito; Cheque)";

@XendraTrl(Identifier="40ebc7cb-f31a-5c70-a5f7-c27c80fd8665")
public static String es_PE_FIELD_Payment_TenderType2_Name="Tipo de Pago";

@XendraField(AD_Column_ID="TenderType",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="40ebc7cb-f31a-5c70-a5f7-c27c80fd8665")
public static final String FIELDNAME_Payment_TenderType2="40ebc7cb-f31a-5c70-a5f7-c27c80fd8665";

@XendraTrl(Identifier="f6d84b7e-f091-1c62-1a57-4e004c8c400a")
public static String es_PE_COLUMN_TenderType_Name="Tipo de Pago";

@XendraColumn(AD_Element_ID="a11558e0-04b1-3a6f-e53e-dd508c5dfc1c",ColumnName="TenderType",
AD_Reference_ID=17,AD_Reference_Value_ID="99d2e48b-10ce-666f-5675-0a893b4e12aa",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="K",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="@IsApproved@=Y",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutPayment.TenderType",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f6d84b7e-f091-1c62-1a57-4e004c8c400a",
Synchronized="2017-08-05 16:54:01.0")
/** Column name TenderType */
public static final String COLUMNNAME_TenderType = "TenderType";

/** TrxType AD_Reference=a083d7a1-2e00-66db-651c-da45d285eb24 */
public static final int TRXTYPE_AD_Reference_ID=215;
/** Set Transaction Type.
@param TrxType Type of credit card transaction */
public void setTrxType (String TrxType)
{
if (TrxType == null) throw new IllegalArgumentException ("TrxType is mandatory");
if (TrxType.equals(REF_C_PaymentTrxType.Sales) || TrxType.equals(REF_C_PaymentTrxType.DelayedCapture) || TrxType.equals(REF_C_PaymentTrxType.CreditPayment) || TrxType.equals(REF_C_PaymentTrxType.VoiceAuthorization) || TrxType.equals(REF_C_PaymentTrxType.Authorization) || TrxType.equals(REF_C_PaymentTrxType.Void));
 else throw new IllegalArgumentException ("TrxType Invalid value - " + TrxType + " - Reference_ID=215 - S - D - C - F - A - V");
if (TrxType.length() > 1)
{
log.warning("Length > 1 - truncated");
TrxType = TrxType.substring(0,0);
}
set_Value (COLUMNNAME_TrxType, TrxType);
}
/** Get Transaction Type.
@return Type of credit card transaction */
public String getTrxType() 
{
return (String)get_Value(COLUMNNAME_TrxType);
}

@XendraTrl(Identifier="4de59b8f-126d-0ef8-d37e-a431d8d6b123")
public static String es_PE_FIELD_Payment_TransactionType_Description="Tipo de transacción de la tarjeta de crédito";

@XendraTrl(Identifier="4de59b8f-126d-0ef8-d37e-a431d8d6b123")
public static String es_PE_FIELD_Payment_TransactionType_Help="El tipo de transacción indica el tipo de transacción a ser sometida a la compañía de la tarjeta de crédito.";

@XendraTrl(Identifier="4de59b8f-126d-0ef8-d37e-a431d8d6b123")
public static String es_PE_FIELD_Payment_TransactionType_Name="Tipo de Transacción";

@XendraField(AD_Column_ID="TrxType",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsTransfer@!Y & @TenderType@=C",DisplayLength=14,IsReadOnly=false,SeqNo=330,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4de59b8f-126d-0ef8-d37e-a431d8d6b123")
public static final String FIELDNAME_Payment_TransactionType="4de59b8f-126d-0ef8-d37e-a431d8d6b123";

@XendraTrl(Identifier="eb36f004-ac6b-5e6f-dd33-65d1e0d42ba5")
public static String es_PE_FIELD_PartnerPayments_TransactionType_Description="Tipo de transacción de la tarjeta de crédito";

@XendraTrl(Identifier="eb36f004-ac6b-5e6f-dd33-65d1e0d42ba5")
public static String es_PE_FIELD_PartnerPayments_TransactionType_Help="El tipo de transacción indica el tipo de transacción a ser sometida a la compañía de la tarjeta de crédito.";

@XendraTrl(Identifier="eb36f004-ac6b-5e6f-dd33-65d1e0d42ba5")
public static String es_PE_FIELD_PartnerPayments_TransactionType_Name="Tipo de Transacción";

@XendraField(AD_Column_ID="TrxType",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eb36f004-ac6b-5e6f-dd33-65d1e0d42ba5")
public static final String FIELDNAME_PartnerPayments_TransactionType="eb36f004-ac6b-5e6f-dd33-65d1e0d42ba5";

@XendraTrl(Identifier="d31194b8-8d29-ece9-d99c-d2717132904c")
public static String es_PE_FIELD_Payment_TransactionType2_Description="Tipo de transacción de la tarjeta de crédito";

@XendraTrl(Identifier="d31194b8-8d29-ece9-d99c-d2717132904c")
public static String es_PE_FIELD_Payment_TransactionType2_Help="El tipo de transacción indica el tipo de transacción a ser sometida a la compañía de la tarjeta de crédito.";

@XendraTrl(Identifier="d31194b8-8d29-ece9-d99c-d2717132904c")
public static String es_PE_FIELD_Payment_TransactionType2_Name="Tipo de Transacción";

@XendraField(AD_Column_ID="TrxType",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d31194b8-8d29-ece9-d99c-d2717132904c")
public static final String FIELDNAME_Payment_TransactionType2="d31194b8-8d29-ece9-d99c-d2717132904c";

@XendraTrl(Identifier="595dbe94-921a-d518-0756-c4bc009ac040")
public static String es_PE_COLUMN_TrxType_Name="Tipo de Transacción";

@XendraColumn(AD_Element_ID="4d4a53c4-1cc3-27bd-5eb1-03412d96bc93",ColumnName="TrxType",
AD_Reference_ID=17,AD_Reference_Value_ID="a083d7a1-2e00-66db-651c-da45d285eb24",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="S",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="595dbe94-921a-d518-0756-c4bc009ac040",Synchronized="2017-08-05 16:54:01.0")
/** Column name TrxType */
public static final String COLUMNNAME_TrxType = "TrxType";

/** User1_ID AD_Reference=5a2fe161-044f-67cb-3791-6d615980cabb */
public static final int USER1_ID_AD_Reference_ID=134;
/** Set User List 1.
@param User1_ID User defined list element #1 */
public void setUser1_ID (int User1_ID)
{
if (User1_ID <= 0) set_Value (COLUMNNAME_User1_ID, null);
 else 
set_Value (COLUMNNAME_User1_ID, Integer.valueOf(User1_ID));
}
/** Get User List 1.
@return User defined list element #1 */
public int getUser1_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_User1_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="09425d4a-9dca-8d8e-f1aa-b797e34d00d6")
public static String es_PE_FIELD_Payment_UserList_Description="El usuario definió el elemento # 1";

@XendraTrl(Identifier="09425d4a-9dca-8d8e-f1aa-b797e34d00d6")
public static String es_PE_FIELD_Payment_UserList_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraTrl(Identifier="09425d4a-9dca-8d8e-f1aa-b797e34d00d6")
public static String es_PE_FIELD_Payment_UserList_Name="Usuario 1";

@XendraField(AD_Column_ID="User1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsTransfer@!Y & @$Element_U1@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=200,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="09425d4a-9dca-8d8e-f1aa-b797e34d00d6")
public static final String FIELDNAME_Payment_UserList="09425d4a-9dca-8d8e-f1aa-b797e34d00d6";

@XendraTrl(Identifier="ee198ec6-15ac-1557-b79d-72bd2da0cac0")
public static String es_PE_FIELD_PartnerPayments_UserList_Description="El usuario definió el elemento # 1";

@XendraTrl(Identifier="ee198ec6-15ac-1557-b79d-72bd2da0cac0")
public static String es_PE_FIELD_PartnerPayments_UserList_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraTrl(Identifier="ee198ec6-15ac-1557-b79d-72bd2da0cac0")
public static String es_PE_FIELD_PartnerPayments_UserList_Name="Usuario 1";

@XendraField(AD_Column_ID="User1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ee198ec6-15ac-1557-b79d-72bd2da0cac0")
public static final String FIELDNAME_PartnerPayments_UserList="ee198ec6-15ac-1557-b79d-72bd2da0cac0";

@XendraTrl(Identifier="00a2df50-a935-1024-b5a3-aad14e76db75")
public static String es_PE_FIELD_Payment_UserList12_Description="El usuario definió el elemento # 1";

@XendraTrl(Identifier="00a2df50-a935-1024-b5a3-aad14e76db75")
public static String es_PE_FIELD_Payment_UserList12_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraTrl(Identifier="00a2df50-a935-1024-b5a3-aad14e76db75")
public static String es_PE_FIELD_Payment_UserList12_Name="Usuario 1";

@XendraField(AD_Column_ID="User1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="00a2df50-a935-1024-b5a3-aad14e76db75")
public static final String FIELDNAME_Payment_UserList12="00a2df50-a935-1024-b5a3-aad14e76db75";

@XendraTrl(Identifier="63d39943-9e17-0eaf-4c55-2f2d2cf5167f")
public static String es_PE_COLUMN_User1_ID_Name="Usuario 1";

@XendraColumn(AD_Element_ID="07453e74-aadd-d9c9-e543-837a6fdb3094",ColumnName="User1_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="5a2fe161-044f-67cb-3791-6d615980cabb",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="63d39943-9e17-0eaf-4c55-2f2d2cf5167f",Synchronized="2017-08-05 16:54:01.0")
/** Column name User1_ID */
public static final String COLUMNNAME_User1_ID = "User1_ID";

/** User2_ID AD_Reference=6a357ab2-7bb6-fce4-ffee-8bdd855a77fc */
public static final int USER2_ID_AD_Reference_ID=137;
/** Set User List 2.
@param User2_ID User defined list element #2 */
public void setUser2_ID (int User2_ID)
{
if (User2_ID <= 0) set_Value (COLUMNNAME_User2_ID, null);
 else 
set_Value (COLUMNNAME_User2_ID, Integer.valueOf(User2_ID));
}
/** Get User List 2.
@return User defined list element #2 */
public int getUser2_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_User2_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4aaa3aa3-c3fe-0514-3221-2f3a6fd1d97d")
public static String es_PE_FIELD_Payment_UserList23_Description="El usuario definió el elemento # 2";

@XendraTrl(Identifier="4aaa3aa3-c3fe-0514-3221-2f3a6fd1d97d")
public static String es_PE_FIELD_Payment_UserList23_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraTrl(Identifier="4aaa3aa3-c3fe-0514-3221-2f3a6fd1d97d")
public static String es_PE_FIELD_Payment_UserList23_Name="Usuario 2";

@XendraField(AD_Column_ID="User2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsTransfer@!Y & @$Element_U2@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=210,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4aaa3aa3-c3fe-0514-3221-2f3a6fd1d97d")
public static final String FIELDNAME_Payment_UserList23="4aaa3aa3-c3fe-0514-3221-2f3a6fd1d97d";

@XendraTrl(Identifier="9ff3acad-5eec-f4de-a5a5-c3b42c7ffa2a")
public static String es_PE_FIELD_PartnerPayments_UserList22_Description="El usuario definió el elemento # 2";

@XendraTrl(Identifier="9ff3acad-5eec-f4de-a5a5-c3b42c7ffa2a")
public static String es_PE_FIELD_PartnerPayments_UserList22_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraTrl(Identifier="9ff3acad-5eec-f4de-a5a5-c3b42c7ffa2a")
public static String es_PE_FIELD_PartnerPayments_UserList22_Name="Usuario 2";

@XendraField(AD_Column_ID="User2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9ff3acad-5eec-f4de-a5a5-c3b42c7ffa2a")
public static final String FIELDNAME_PartnerPayments_UserList22="9ff3acad-5eec-f4de-a5a5-c3b42c7ffa2a";

@XendraTrl(Identifier="7a8797cc-215d-51df-519e-ee1b421480c9")
public static String es_PE_FIELD_Payment_UserList24_Description="El usuario definió el elemento # 2";

@XendraTrl(Identifier="7a8797cc-215d-51df-519e-ee1b421480c9")
public static String es_PE_FIELD_Payment_UserList24_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraTrl(Identifier="7a8797cc-215d-51df-519e-ee1b421480c9")
public static String es_PE_FIELD_Payment_UserList24_Name="Usuario 2";

@XendraField(AD_Column_ID="User2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7a8797cc-215d-51df-519e-ee1b421480c9")
public static final String FIELDNAME_Payment_UserList24="7a8797cc-215d-51df-519e-ee1b421480c9";

@XendraTrl(Identifier="ccf56c4a-a200-f3d6-5b8e-2f5089918ea5")
public static String es_PE_COLUMN_User2_ID_Name="Usuario 2";

@XendraColumn(AD_Element_ID="1b668c90-6743-20a2-df62-576857d72c06",ColumnName="User2_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="6a357ab2-7bb6-fce4-ffee-8bdd855a77fc",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ccf56c4a-a200-f3d6-5b8e-2f5089918ea5",Synchronized="2017-08-05 16:54:01.0")
/** Column name User2_ID */
public static final String COLUMNNAME_User2_ID = "User2_ID";
/** Set Voice authorization code.
@param VoiceAuthCode Voice Authorization Code from credit card company */
public void setVoiceAuthCode (String VoiceAuthCode)
{
if (VoiceAuthCode != null && VoiceAuthCode.length() > 20)
{
log.warning("Length > 20 - truncated");
VoiceAuthCode = VoiceAuthCode.substring(0,19);
}
set_Value (COLUMNNAME_VoiceAuthCode, VoiceAuthCode);
}
/** Get Voice authorization code.
@return Voice Authorization Code from credit card company */
public String getVoiceAuthCode() 
{
String value = (String)get_Value(COLUMNNAME_VoiceAuthCode);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="b3af5c6b-50b0-686a-6c83-686f98c28421")
public static String es_PE_FIELD_Payment_VoiceAuthorizationCode_Description="Código de Autorización de voz de la compañía de la tarjeta de crédito";

@XendraTrl(Identifier="b3af5c6b-50b0-686a-6c83-686f98c28421")
public static String es_PE_FIELD_Payment_VoiceAuthorizationCode_Help="El Código de Autorización de Voz indica el código recibido de la compañía de la tarjeta de crédito";

@XendraTrl(Identifier="b3af5c6b-50b0-686a-6c83-686f98c28421")
public static String es_PE_FIELD_Payment_VoiceAuthorizationCode_Name="Código de Autorización de voz";

@XendraField(AD_Column_ID="VoiceAuthCode",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsTransfer@!Y & @IsOnline@=Y",DisplayLength=20,IsReadOnly=false,SeqNo=480,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b3af5c6b-50b0-686a-6c83-686f98c28421")
public static final String FIELDNAME_Payment_VoiceAuthorizationCode="b3af5c6b-50b0-686a-6c83-686f98c28421";

@XendraTrl(Identifier="1f1d79bc-8bb5-8af8-bd23-5147a4b403a9")
public static String es_PE_FIELD_PartnerPayments_VoiceAuthorizationCode_Description="Código de Autorización de voz de la compañía de la tarjeta de crédito";

@XendraTrl(Identifier="1f1d79bc-8bb5-8af8-bd23-5147a4b403a9")
public static String es_PE_FIELD_PartnerPayments_VoiceAuthorizationCode_Help="El Código de Autorización de Voz indica el código recibido de la compañía de la tarjeta de crédito";

@XendraTrl(Identifier="1f1d79bc-8bb5-8af8-bd23-5147a4b403a9")
public static String es_PE_FIELD_PartnerPayments_VoiceAuthorizationCode_Name="Código de Autorización de voz";

@XendraField(AD_Column_ID="VoiceAuthCode",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1f1d79bc-8bb5-8af8-bd23-5147a4b403a9")
public static final String FIELDNAME_PartnerPayments_VoiceAuthorizationCode="1f1d79bc-8bb5-8af8-bd23-5147a4b403a9";

@XendraTrl(Identifier="6adf165d-8abd-1374-d6dc-63a6f918ffb5")
public static String es_PE_FIELD_Payment_VoiceAuthorizationCode2_Description="Código de Autorización de voz de la compañía de la tarjeta de crédito";

@XendraTrl(Identifier="6adf165d-8abd-1374-d6dc-63a6f918ffb5")
public static String es_PE_FIELD_Payment_VoiceAuthorizationCode2_Help="El Código de Autorización de Voz indica el código recibido de la compañía de la tarjeta de crédito";

@XendraTrl(Identifier="6adf165d-8abd-1374-d6dc-63a6f918ffb5")
public static String es_PE_FIELD_Payment_VoiceAuthorizationCode2_Name="Código de Autorización de voz";

@XendraField(AD_Column_ID="VoiceAuthCode",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6adf165d-8abd-1374-d6dc-63a6f918ffb5")
public static final String FIELDNAME_Payment_VoiceAuthorizationCode2="6adf165d-8abd-1374-d6dc-63a6f918ffb5";

@XendraTrl(Identifier="4aa2afa2-0e2b-e239-02a4-54e4cf47b53d")
public static String es_PE_COLUMN_VoiceAuthCode_Name="Código de Autorización de voz";

@XendraColumn(AD_Element_ID="eaa5a6bc-5695-2f97-4eb8-b88205498956",ColumnName="VoiceAuthCode",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@IsApproved@=Y",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",
ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4aa2afa2-0e2b-e239-02a4-54e4cf47b53d",Synchronized="2017-08-05 16:54:01.0")
/** Column name VoiceAuthCode */
public static final String COLUMNNAME_VoiceAuthCode = "VoiceAuthCode";
/** Set WithholdingAmt.
@param WithholdingAmt WithholdingAmt */
public void setWithholdingAmt (BigDecimal WithholdingAmt)
{
set_Value (COLUMNNAME_WithholdingAmt, WithholdingAmt);
}
/** Get WithholdingAmt.
@return WithholdingAmt */
public BigDecimal getWithholdingAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_WithholdingAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="5d8e41d6-e9d4-46db-963f-46c5dd0c6e4e")
public static String es_PE_COLUMN_WithholdingAmt_Name="WithholdingAmt";

@XendraColumn(AD_Element_ID="750228fc-a0da-46c7-b584-2e34797d13d0",ColumnName="WithholdingAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5d8e41d6-e9d4-46db-963f-46c5dd0c6e4e",
Synchronized="2017-08-05 16:54:01.0")
/** Column name WithholdingAmt */
public static final String COLUMNNAME_WithholdingAmt = "WithholdingAmt";
/** Set Write-off Amount.
@param WriteOffAmt Amount to write-off */
public void setWriteOffAmt (BigDecimal WriteOffAmt)
{
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

@XendraTrl(Identifier="c44eb797-2d10-42d4-95a2-335e333228ef")
public static String es_PE_FIELD_Payment_Write_OffAmount_Description="Total por ajustar";

@XendraTrl(Identifier="c44eb797-2d10-42d4-95a2-335e333228ef")
public static String es_PE_FIELD_Payment_Write_OffAmount_Help="El Total de ajuste indica el total a ser ajustado como incobrable";

@XendraTrl(Identifier="c44eb797-2d10-42d4-95a2-335e333228ef")
public static String es_PE_FIELD_Payment_Write_OffAmount_Name="Total del Ajuste";

@XendraField(AD_Column_ID="WriteOffAmt",IsCentrallyMaintained=true,
AD_Tab_ID="ecad51f1-914e-1976-e472-b07276bb417e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@C_Invoice_ID@^''",DisplayLength=26,IsReadOnly=false,SeqNo=260,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c44eb797-2d10-42d4-95a2-335e333228ef")
public static final String FIELDNAME_Payment_Write_OffAmount="c44eb797-2d10-42d4-95a2-335e333228ef";

@XendraTrl(Identifier="39c04d48-6df5-1a0e-1957-7dd155bcd061")
public static String es_PE_FIELD_PartnerPayments_Write_OffAmount_Description="Total por ajustar";

@XendraTrl(Identifier="39c04d48-6df5-1a0e-1957-7dd155bcd061")
public static String es_PE_FIELD_PartnerPayments_Write_OffAmount_Help="El Total de ajuste indica el total a ser ajustado como incobrable";

@XendraTrl(Identifier="39c04d48-6df5-1a0e-1957-7dd155bcd061")
public static String es_PE_FIELD_PartnerPayments_Write_OffAmount_Name="Total del Ajuste";

@XendraField(AD_Column_ID="WriteOffAmt",IsCentrallyMaintained=true,
AD_Tab_ID="08d97246-f708-cbbf-e4c5-04d3aca9b55c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="39c04d48-6df5-1a0e-1957-7dd155bcd061")
public static final String FIELDNAME_PartnerPayments_Write_OffAmount="39c04d48-6df5-1a0e-1957-7dd155bcd061";

@XendraTrl(Identifier="dbd6f1a6-26e0-19cd-e98c-42e158745c1d")
public static String es_PE_FIELD_Payment_Write_OffAmount2_Description="Total por ajustar";

@XendraTrl(Identifier="dbd6f1a6-26e0-19cd-e98c-42e158745c1d")
public static String es_PE_FIELD_Payment_Write_OffAmount2_Help="El Total de ajuste indica el total a ser ajustado como incobrable";

@XendraTrl(Identifier="dbd6f1a6-26e0-19cd-e98c-42e158745c1d")
public static String es_PE_FIELD_Payment_Write_OffAmount2_Name="Total del Ajuste";

@XendraField(AD_Column_ID="WriteOffAmt",IsCentrallyMaintained=true,
AD_Tab_ID="f3a62298-5bfe-a758-6004-80c9d3836d7a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dbd6f1a6-26e0-19cd-e98c-42e158745c1d")
public static final String FIELDNAME_Payment_Write_OffAmount2="dbd6f1a6-26e0-19cd-e98c-42e158745c1d";

@XendraTrl(Identifier="d6940233-36bc-13cf-caa3-317b5b557289")
public static String es_PE_COLUMN_WriteOffAmt_Name="Total del Ajuste";

@XendraColumn(AD_Element_ID="5f70c6d6-fd9f-549c-363e-80eaef7df1c7",ColumnName="WriteOffAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@C_Charge_ID@!0 | @C_Order_ID@!0",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutPayment.amounts",VFormat="",ValueMin="",ValueMax="",Version="1",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d6940233-36bc-13cf-caa3-317b5b557289",
Synchronized="2017-08-05 16:54:01.0")
/** Column name WriteOffAmt */
public static final String COLUMNNAME_WriteOffAmt = "WriteOffAmt";
}
