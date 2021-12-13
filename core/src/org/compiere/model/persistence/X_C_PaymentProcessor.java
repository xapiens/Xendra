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
/** Generated Model for C_PaymentProcessor
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_PaymentProcessor extends PO
{
/** Standard Constructor
@param ctx context
@param C_PaymentProcessor_ID id
@param trxName transaction
*/
public X_C_PaymentProcessor (Properties ctx, int C_PaymentProcessor_ID, String trxName)
{
super (ctx, C_PaymentProcessor_ID, trxName);
/** if (C_PaymentProcessor_ID == 0)
{
setAcceptAMEX (false);	
// N
setAcceptATM (false);	
// N
setAcceptCheck (false);	
// N
setAcceptCorporate (false);	
// N
setAcceptDiners (false);	
// N
setAcceptDirectDebit (false);	
// N
setAcceptDirectDeposit (false);	
// N
setAcceptDiscover (false);	
// N
setAcceptMC (false);	
// N
setAcceptVisa (false);	
// N
setC_BankAccount_ID (0);
setCommission (Env.ZERO);
setCostPerTrx (Env.ZERO);
setC_PaymentProcessor_ID (0);
setHostAddress (null);
setHostPort (0);
setName (null);
setPassword (null);
setRequireVV (false);	
// N
setUserID (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_PaymentProcessor (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=398 */
public static int Table_ID=MTable.getTable_ID("C_PaymentProcessor");

@XendraTrl(Identifier="52482ace-9c2b-3b37-4c46-42d350e94ca9")
public static String es_PE_TAB_PaymentProcessor_Description="Procesador para pagos en línea";

@XendraTrl(Identifier="52482ace-9c2b-3b37-4c46-42d350e94ca9")
public static String es_PE_TAB_PaymentProcessor_Help="La pestaña Pago Electrónico es usada para definir los parámetros para el procesamiento de pagos electrónicos.";

@XendraTrl(Identifier="52482ace-9c2b-3b37-4c46-42d350e94ca9")
public static String es_PE_TAB_PaymentProcessor_Name="Procesador de Pago";

@XendraTab(Name="Payment Processor",Description="Processor for online payments",
Help="The Electronic Payments Tab is used to define the parameters for the processing of electronic payments. If no currency is defined, all currencies are accepted. If a minumum amount is defined (or not zero), the payment processor is only used if the payment amount is equal or higher than the minumum amount. <br> The class needs to implement org.compiere.model.PaymentProcessor",
AD_Window_ID="da35b881-e51f-c76d-0c58-a14a86f4a839",SeqNo=40,TabLevel=2,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="52482ace-9c2b-3b37-4c46-42d350e94ca9",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_PaymentProcessor="52482ace-9c2b-3b37-4c46-42d350e94ca9";

@XendraTrl(Identifier="48bfe7bc-630c-25fc-1894-dd460e793bd5")
public static String es_PE_TABLE_C_PaymentProcessor_Name="Procesador de Pago";

@XendraTable(Name="Payment Processor",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="Payment processor for electronic payments",Help="",TableName="C_PaymentProcessor",
AccessLevel="3",AD_Window_ID="da35b881-e51f-c76d-0c58-a14a86f4a839",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=95,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="48bfe7bc-630c-25fc-1894-dd460e793bd5",Synchronized="2020-03-03 21:37:22.0")
/** TableName=C_PaymentProcessor */
public static final String Table_Name="C_PaymentProcessor";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_PaymentProcessor");

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
    Table_ID = MTable.getTable_ID("C_PaymentProcessor");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_PaymentProcessor[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Accept AMEX.
@param AcceptAMEX Accept American Express Card */
public void setAcceptAMEX (boolean AcceptAMEX)
{
set_Value (COLUMNNAME_AcceptAMEX, Boolean.valueOf(AcceptAMEX));
}
/** Get Accept AMEX.
@return Accept American Express Card */
public boolean isAcceptAMEX() 
{
Object oo = get_Value(COLUMNNAME_AcceptAMEX);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="400499be-f5b2-783e-d657-abac32c5fce9")
public static String es_PE_FIELD_PaymentProcessor_AcceptAMEX_Name="Acepta AMEX";

@XendraTrl(Identifier="400499be-f5b2-783e-d657-abac32c5fce9")
public static String es_PE_FIELD_PaymentProcessor_AcceptAMEX_Description="Acepta Tarjeta American Express";

@XendraTrl(Identifier="400499be-f5b2-783e-d657-abac32c5fce9")
public static String es_PE_FIELD_PaymentProcessor_AcceptAMEX_Help="Indica si las Tarjetas American Express son aceptadas como pagos a esta cuenta Bancaria";

@XendraField(AD_Column_ID="AcceptAMEX",IsCentrallyMaintained=true,
AD_Tab_ID="52482ace-9c2b-3b37-4c46-42d350e94ca9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="400499be-f5b2-783e-d657-abac32c5fce9")
public static final String FIELDNAME_PaymentProcessor_AcceptAMEX="400499be-f5b2-783e-d657-abac32c5fce9";

@XendraTrl(Identifier="c1fac00d-e4ac-7b20-de9c-d707706627d5")
public static String es_PE_COLUMN_AcceptAMEX_Name="Acepta AMEX";

@XendraColumn(AD_Element_ID="3b904e7b-4e5f-4a9e-6222-87f1ecc5aba7",ColumnName="AcceptAMEX",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c1fac00d-e4ac-7b20-de9c-d707706627d5",
Synchronized="2019-08-30 22:21:58.0")
/** Column name AcceptAMEX */
public static final String COLUMNNAME_AcceptAMEX = "AcceptAMEX";
/** Set Accept ATM.
@param AcceptATM Accept Bank ATM Card */
public void setAcceptATM (boolean AcceptATM)
{
set_Value (COLUMNNAME_AcceptATM, Boolean.valueOf(AcceptATM));
}
/** Get Accept ATM.
@return Accept Bank ATM Card */
public boolean isAcceptATM() 
{
Object oo = get_Value(COLUMNNAME_AcceptATM);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="870da152-e277-8bd3-3db5-3e233e5d34f9")
public static String es_PE_FIELD_PaymentProcessor_AcceptATM_Name="Acepta ATM";

@XendraTrl(Identifier="870da152-e277-8bd3-3db5-3e233e5d34f9")
public static String es_PE_FIELD_PaymentProcessor_AcceptATM_Description="Acepta Tarjeta Bank ATM";

@XendraTrl(Identifier="870da152-e277-8bd3-3db5-3e233e5d34f9")
public static String es_PE_FIELD_PaymentProcessor_AcceptATM_Help="Indica si las Tarjetas Bank ATM son aceptadas como pagos a esta cuenta Bancaria";

@XendraField(AD_Column_ID="AcceptATM",IsCentrallyMaintained=true,
AD_Tab_ID="52482ace-9c2b-3b37-4c46-42d350e94ca9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=270,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="870da152-e277-8bd3-3db5-3e233e5d34f9")
public static final String FIELDNAME_PaymentProcessor_AcceptATM="870da152-e277-8bd3-3db5-3e233e5d34f9";

@XendraTrl(Identifier="ea09da49-b725-c7a3-b077-36a7ec104e8c")
public static String es_PE_COLUMN_AcceptATM_Name="Acepta ATM";

@XendraColumn(AD_Element_ID="8569c3b2-09a5-1b16-bbeb-f5e2a12255f8",ColumnName="AcceptATM",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ea09da49-b725-c7a3-b077-36a7ec104e8c",
Synchronized="2019-08-30 22:21:58.0")
/** Column name AcceptATM */
public static final String COLUMNNAME_AcceptATM = "AcceptATM";
/** Set Accept Electronic Check.
@param AcceptCheck Accept ECheck (Electronic Checks) */
public void setAcceptCheck (boolean AcceptCheck)
{
set_Value (COLUMNNAME_AcceptCheck, Boolean.valueOf(AcceptCheck));
}
/** Get Accept Electronic Check.
@return Accept ECheck (Electronic Checks) */
public boolean isAcceptCheck() 
{
Object oo = get_Value(COLUMNNAME_AcceptCheck);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="acf2836a-37e0-10aa-bf80-b5c9af13be86")
public static String es_PE_FIELD_PaymentProcessor_AcceptElectronicCheck_Name="Acepta Cheque Electrónico";

@XendraTrl(Identifier="acf2836a-37e0-10aa-bf80-b5c9af13be86")
public static String es_PE_FIELD_PaymentProcessor_AcceptElectronicCheck_Description="Acepta Tarjeta Cheques Electrónicos";

@XendraTrl(Identifier="acf2836a-37e0-10aa-bf80-b5c9af13be86")
public static String es_PE_FIELD_PaymentProcessor_AcceptElectronicCheck_Help="Indica si cheques electronicos son aceptados como pagos a esta Cuenta Bancaria.";

@XendraField(AD_Column_ID="AcceptCheck",IsCentrallyMaintained=true,
AD_Tab_ID="52482ace-9c2b-3b37-4c46-42d350e94ca9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="acf2836a-37e0-10aa-bf80-b5c9af13be86")
public static final String FIELDNAME_PaymentProcessor_AcceptElectronicCheck="acf2836a-37e0-10aa-bf80-b5c9af13be86";

@XendraTrl(Identifier="6cd8f3e8-71f3-f646-2ed8-2991c2ee53ca")
public static String es_PE_COLUMN_AcceptCheck_Name="Acepta Cheque Electrónico";

@XendraColumn(AD_Element_ID="0d1bb551-3543-33a6-1e27-ae0d2ab29bf7",ColumnName="AcceptCheck",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6cd8f3e8-71f3-f646-2ed8-2991c2ee53ca",
Synchronized="2019-08-30 22:21:58.0")
/** Column name AcceptCheck */
public static final String COLUMNNAME_AcceptCheck = "AcceptCheck";
/** Set Accept Corporate.
@param AcceptCorporate Accept Corporate Purchase Cards */
public void setAcceptCorporate (boolean AcceptCorporate)
{
set_Value (COLUMNNAME_AcceptCorporate, Boolean.valueOf(AcceptCorporate));
}
/** Get Accept Corporate.
@return Accept Corporate Purchase Cards */
public boolean isAcceptCorporate() 
{
Object oo = get_Value(COLUMNNAME_AcceptCorporate);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="37d97f7f-1b7b-26c8-e5b9-6af7b3ed6cd3")
public static String es_PE_FIELD_PaymentProcessor_AcceptCorporate_Name="Acepta Tarjeta de Pago Corporativa";

@XendraTrl(Identifier="37d97f7f-1b7b-26c8-e5b9-6af7b3ed6cd3")
public static String es_PE_FIELD_PaymentProcessor_AcceptCorporate_Description="Acepta Tarjetas de Pago Corporativas";

@XendraTrl(Identifier="37d97f7f-1b7b-26c8-e5b9-6af7b3ed6cd3")
public static String es_PE_FIELD_PaymentProcessor_AcceptCorporate_Help="Indica si Tarjetas de Pago Corporativas son aceptadas como pagos a esta cuenta bancaria";

@XendraField(AD_Column_ID="AcceptCorporate",IsCentrallyMaintained=true,
AD_Tab_ID="52482ace-9c2b-3b37-4c46-42d350e94ca9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="37d97f7f-1b7b-26c8-e5b9-6af7b3ed6cd3")
public static final String FIELDNAME_PaymentProcessor_AcceptCorporate="37d97f7f-1b7b-26c8-e5b9-6af7b3ed6cd3";

@XendraTrl(Identifier="e3855b32-64cc-8a6e-171f-d6f3714c83e3")
public static String es_PE_COLUMN_AcceptCorporate_Name="Acepta Tarjeta de Pago Corporativa";

@XendraColumn(AD_Element_ID="2b9ec8de-730a-06d4-0cfa-0e4f09ef8339",ColumnName="AcceptCorporate",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e3855b32-64cc-8a6e-171f-d6f3714c83e3",
Synchronized="2019-08-30 22:21:58.0")
/** Column name AcceptCorporate */
public static final String COLUMNNAME_AcceptCorporate = "AcceptCorporate";
/** Set Accept Diners.
@param AcceptDiners Accept Diner's Club */
public void setAcceptDiners (boolean AcceptDiners)
{
set_Value (COLUMNNAME_AcceptDiners, Boolean.valueOf(AcceptDiners));
}
/** Get Accept Diners.
@return Accept Diner's Club */
public boolean isAcceptDiners() 
{
Object oo = get_Value(COLUMNNAME_AcceptDiners);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f61d7b5d-29f4-ffe7-6fad-cb19f6968284")
public static String es_PE_FIELD_PaymentProcessor_AcceptDiners_Name="Acepta Diner`s Club";

@XendraTrl(Identifier="f61d7b5d-29f4-ffe7-6fad-cb19f6968284")
public static String es_PE_FIELD_PaymentProcessor_AcceptDiners_Description="Acepta Tarjeta Diner";

@XendraTrl(Identifier="f61d7b5d-29f4-ffe7-6fad-cb19f6968284")
public static String es_PE_FIELD_PaymentProcessor_AcceptDiners_Help="Indica si las Tarjetas Diner son aceptadas como pagos a esta cuenta Bancaria";

@XendraField(AD_Column_ID="AcceptDiners",IsCentrallyMaintained=true,
AD_Tab_ID="52482ace-9c2b-3b37-4c46-42d350e94ca9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f61d7b5d-29f4-ffe7-6fad-cb19f6968284")
public static final String FIELDNAME_PaymentProcessor_AcceptDiners="f61d7b5d-29f4-ffe7-6fad-cb19f6968284";

@XendraTrl(Identifier="560e0d92-eeb8-18b2-2943-0a21018c9878")
public static String es_PE_COLUMN_AcceptDiners_Name="Acepta Diner`s Club";

@XendraColumn(AD_Element_ID="6c33d675-c1ac-8b16-e11e-9459486d36c7",ColumnName="AcceptDiners",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="560e0d92-eeb8-18b2-2943-0a21018c9878",
Synchronized="2019-08-30 22:21:58.0")
/** Column name AcceptDiners */
public static final String COLUMNNAME_AcceptDiners = "AcceptDiners";
/** Set Accept Direct Debit.
@param AcceptDirectDebit Accept Direct Debits (vendor initiated) */
public void setAcceptDirectDebit (boolean AcceptDirectDebit)
{
set_Value (COLUMNNAME_AcceptDirectDebit, Boolean.valueOf(AcceptDirectDebit));
}
/** Get Accept Direct Debit.
@return Accept Direct Debits (vendor initiated) */
public boolean isAcceptDirectDebit() 
{
Object oo = get_Value(COLUMNNAME_AcceptDirectDebit);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="8d006b74-fd14-40d4-59c0-67488f9ba0d7")
public static String es_PE_FIELD_PaymentProcessor_AcceptDirectDebit_Name="Acepta El Debito Directo";

@XendraTrl(Identifier="8d006b74-fd14-40d4-59c0-67488f9ba0d7")
public static String es_PE_FIELD_PaymentProcessor_AcceptDirectDebit_Description="Aceptar Debito Directo (proveedor iniciado)";

@XendraTrl(Identifier="8d006b74-fd14-40d4-59c0-67488f9ba0d7")
public static String es_PE_FIELD_PaymentProcessor_AcceptDirectDebit_Help="Acepta transacciones de Debito Directo. Los debitos directos son iniciados para el proveedor cuando tiene permisos para deducir montos desde su cuenta de pago.";

@XendraField(AD_Column_ID="AcceptDirectDebit",IsCentrallyMaintained=true,
AD_Tab_ID="52482ace-9c2b-3b37-4c46-42d350e94ca9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8d006b74-fd14-40d4-59c0-67488f9ba0d7")
public static final String FIELDNAME_PaymentProcessor_AcceptDirectDebit="8d006b74-fd14-40d4-59c0-67488f9ba0d7";

@XendraTrl(Identifier="0a69173a-9baf-2a29-759d-e5f58deaa263")
public static String es_PE_COLUMN_AcceptDirectDebit_Name="Acepta El Debito Directo";

@XendraColumn(AD_Element_ID="74242870-0cc7-607a-469a-89ccddd4a2af",ColumnName="AcceptDirectDebit",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0a69173a-9baf-2a29-759d-e5f58deaa263",
Synchronized="2019-08-30 22:21:58.0")
/** Column name AcceptDirectDebit */
public static final String COLUMNNAME_AcceptDirectDebit = "AcceptDirectDebit";
/** Set Accept Direct Deposit.
@param AcceptDirectDeposit Accept Direct Deposit (payee initiated) */
public void setAcceptDirectDeposit (boolean AcceptDirectDeposit)
{
set_Value (COLUMNNAME_AcceptDirectDeposit, Boolean.valueOf(AcceptDirectDeposit));
}
/** Get Accept Direct Deposit.
@return Accept Direct Deposit (payee initiated) */
public boolean isAcceptDirectDeposit() 
{
Object oo = get_Value(COLUMNNAME_AcceptDirectDeposit);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="ffbc8280-c35b-8449-1b5d-9eff2275a216")
public static String es_PE_FIELD_PaymentProcessor_AcceptDirectDeposit_Name="Acepta TRAN";

@XendraTrl(Identifier="ffbc8280-c35b-8449-1b5d-9eff2275a216")
public static String es_PE_FIELD_PaymentProcessor_AcceptDirectDeposit_Description="Acepta Automatic Clearing House";

@XendraTrl(Identifier="ffbc8280-c35b-8449-1b5d-9eff2275a216")
public static String es_PE_FIELD_PaymentProcessor_AcceptDirectDeposit_Help="Indica si los Pagos ACH son aceptados como pagos a esta Cuenta Bancaria";

@XendraField(AD_Column_ID="AcceptDirectDeposit",IsCentrallyMaintained=true,
AD_Tab_ID="52482ace-9c2b-3b37-4c46-42d350e94ca9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ffbc8280-c35b-8449-1b5d-9eff2275a216")
public static final String FIELDNAME_PaymentProcessor_AcceptDirectDeposit="ffbc8280-c35b-8449-1b5d-9eff2275a216";

@XendraTrl(Identifier="a38ce747-c742-434e-e143-475059bbbbb8")
public static String es_PE_COLUMN_AcceptDirectDeposit_Name="Acepta TRAN";

@XendraColumn(AD_Element_ID="cceae3bb-0c10-9402-1eea-bffeb475cac4",
ColumnName="AcceptDirectDeposit",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a38ce747-c742-434e-e143-475059bbbbb8",Synchronized="2019-08-30 22:21:58.0")
/** Column name AcceptDirectDeposit */
public static final String COLUMNNAME_AcceptDirectDeposit = "AcceptDirectDeposit";
/** Set Accept Discover.
@param AcceptDiscover Accept Discover Card */
public void setAcceptDiscover (boolean AcceptDiscover)
{
set_Value (COLUMNNAME_AcceptDiscover, Boolean.valueOf(AcceptDiscover));
}
/** Get Accept Discover.
@return Accept Discover Card */
public boolean isAcceptDiscover() 
{
Object oo = get_Value(COLUMNNAME_AcceptDiscover);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="df275ca0-19f6-cb4e-a95b-0b7b7550369a")
public static String es_PE_FIELD_PaymentProcessor_AcceptDiscover_Name="Aceptar Discover Card";

@XendraTrl(Identifier="df275ca0-19f6-cb4e-a95b-0b7b7550369a")
public static String es_PE_FIELD_PaymentProcessor_AcceptDiscover_Description="Aceptar Discover Card";

@XendraTrl(Identifier="df275ca0-19f6-cb4e-a95b-0b7b7550369a")
public static String es_PE_FIELD_PaymentProcessor_AcceptDiscover_Help="Indica si las tarjetas Discover son aceptadas como pago a esta Cuenta Bancaria";

@XendraField(AD_Column_ID="AcceptDiscover",IsCentrallyMaintained=true,
AD_Tab_ID="52482ace-9c2b-3b37-4c46-42d350e94ca9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="df275ca0-19f6-cb4e-a95b-0b7b7550369a")
public static final String FIELDNAME_PaymentProcessor_AcceptDiscover="df275ca0-19f6-cb4e-a95b-0b7b7550369a";

@XendraTrl(Identifier="55c79cd8-c55f-fafd-242c-a258565f2ee5")
public static String es_PE_COLUMN_AcceptDiscover_Name="Aceptar Discover Card";

@XendraColumn(AD_Element_ID="f7d0bbf7-a00b-cdc8-0850-d6561180c83a",ColumnName="AcceptDiscover",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="55c79cd8-c55f-fafd-242c-a258565f2ee5",
Synchronized="2019-08-30 22:21:58.0")
/** Column name AcceptDiscover */
public static final String COLUMNNAME_AcceptDiscover = "AcceptDiscover";
/** Set Accept MasterCard.
@param AcceptMC Accept Master Card */
public void setAcceptMC (boolean AcceptMC)
{
set_Value (COLUMNNAME_AcceptMC, Boolean.valueOf(AcceptMC));
}
/** Get Accept MasterCard.
@return Accept Master Card */
public boolean isAcceptMC() 
{
Object oo = get_Value(COLUMNNAME_AcceptMC);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="e5d2fb0d-b90f-b562-2671-40a6a5d47ca3")
public static String es_PE_FIELD_PaymentProcessor_AcceptMasterCard_Name="Acepta MasterCard";

@XendraTrl(Identifier="e5d2fb0d-b90f-b562-2671-40a6a5d47ca3")
public static String es_PE_FIELD_PaymentProcessor_AcceptMasterCard_Description="Acepta Tarjeta Master Card";

@XendraTrl(Identifier="e5d2fb0d-b90f-b562-2671-40a6a5d47ca3")
public static String es_PE_FIELD_PaymentProcessor_AcceptMasterCard_Help="Indica si Master Cards son aceptadas como pagos a esta cuenta Bancaria";

@XendraField(AD_Column_ID="AcceptMC",IsCentrallyMaintained=true,
AD_Tab_ID="52482ace-9c2b-3b37-4c46-42d350e94ca9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e5d2fb0d-b90f-b562-2671-40a6a5d47ca3")
public static final String FIELDNAME_PaymentProcessor_AcceptMasterCard="e5d2fb0d-b90f-b562-2671-40a6a5d47ca3";

@XendraTrl(Identifier="96acc0da-b2ff-09d3-cc77-535cf0f2764c")
public static String es_PE_COLUMN_AcceptMC_Name="Acepta MasterCard";

@XendraColumn(AD_Element_ID="89fa57eb-850e-79bc-afc1-a2648957b048",ColumnName="AcceptMC",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="96acc0da-b2ff-09d3-cc77-535cf0f2764c",
Synchronized="2019-08-30 22:21:58.0")
/** Column name AcceptMC */
public static final String COLUMNNAME_AcceptMC = "AcceptMC";
/** Set Accept Visa.
@param AcceptVisa Accept Visa Cards */
public void setAcceptVisa (boolean AcceptVisa)
{
set_Value (COLUMNNAME_AcceptVisa, Boolean.valueOf(AcceptVisa));
}
/** Get Accept Visa.
@return Accept Visa Cards */
public boolean isAcceptVisa() 
{
Object oo = get_Value(COLUMNNAME_AcceptVisa);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="072879e0-db0c-433e-96cc-f0678e051665")
public static String es_PE_FIELD_PaymentProcessor_AcceptVisa_Name="Acepta Visa";

@XendraTrl(Identifier="072879e0-db0c-433e-96cc-f0678e051665")
public static String es_PE_FIELD_PaymentProcessor_AcceptVisa_Description="Acepta Tarjetas Visa";

@XendraTrl(Identifier="072879e0-db0c-433e-96cc-f0678e051665")
public static String es_PE_FIELD_PaymentProcessor_AcceptVisa_Help="Indica si tarjetas Visa son aceptadas como pago para esta cuenta bancaria";

@XendraField(AD_Column_ID="AcceptVisa",IsCentrallyMaintained=true,
AD_Tab_ID="52482ace-9c2b-3b37-4c46-42d350e94ca9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="072879e0-db0c-433e-96cc-f0678e051665")
public static final String FIELDNAME_PaymentProcessor_AcceptVisa="072879e0-db0c-433e-96cc-f0678e051665";

@XendraTrl(Identifier="c030e571-c304-6d3b-0ffa-5af250729682")
public static String es_PE_COLUMN_AcceptVisa_Name="Acepta Visa";

@XendraColumn(AD_Element_ID="788b475c-c6bc-e4c1-cd5e-2bbad5a3948c",ColumnName="AcceptVisa",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c030e571-c304-6d3b-0ffa-5af250729682",
Synchronized="2019-08-30 22:21:58.0")
/** Column name AcceptVisa */
public static final String COLUMNNAME_AcceptVisa = "AcceptVisa";
/** Set Sequence.
@param AD_Sequence_ID Document Sequence */
public void setAD_Sequence_ID (int AD_Sequence_ID)
{
if (AD_Sequence_ID <= 0) set_Value (COLUMNNAME_AD_Sequence_ID, null);
 else 
set_Value (COLUMNNAME_AD_Sequence_ID, Integer.valueOf(AD_Sequence_ID));
}
/** Get Sequence.
@return Document Sequence */
public int getAD_Sequence_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Sequence_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9270ac54-20fc-53c4-438e-904024f2dd69")
public static String es_PE_FIELD_PaymentProcessor_Sequence_Name="Secuencia";

@XendraTrl(Identifier="9270ac54-20fc-53c4-438e-904024f2dd69")
public static String es_PE_FIELD_PaymentProcessor_Sequence_Description="Secuencia del documento";

@XendraTrl(Identifier="9270ac54-20fc-53c4-438e-904024f2dd69")
public static String es_PE_FIELD_PaymentProcessor_Sequence_Help="La secuencia indica el número de secuencia a ser usado para los documentos";

@XendraField(AD_Column_ID="AD_Sequence_ID",IsCentrallyMaintained=true,
AD_Tab_ID="52482ace-9c2b-3b37-4c46-42d350e94ca9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=310,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9270ac54-20fc-53c4-438e-904024f2dd69")
public static final String FIELDNAME_PaymentProcessor_Sequence="9270ac54-20fc-53c4-438e-904024f2dd69";

@XendraTrl(Identifier="253437b2-2906-eac4-08da-dfb650a74681")
public static String es_PE_COLUMN_AD_Sequence_ID_Name="Secuencia";

@XendraColumn(AD_Element_ID="b4ecd1ce-eb14-87fa-8115-bb00f9f5d8b5",ColumnName="AD_Sequence_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="4aa462a2-7603-59ba-08c7-4982c43f3ad7",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="253437b2-2906-eac4-08da-dfb650a74681",Synchronized="2019-08-30 22:21:58.0")
/** Column name AD_Sequence_ID */
public static final String COLUMNNAME_AD_Sequence_ID = "AD_Sequence_ID";
/** Set Bank Account.
@param C_BankAccount_ID Account at the Bank */
public void setC_BankAccount_ID (int C_BankAccount_ID)
{
if (C_BankAccount_ID < 1) throw new IllegalArgumentException ("C_BankAccount_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_BankAccount_ID, Integer.valueOf(C_BankAccount_ID));
}
/** Get Bank Account.
@return Account at the Bank */
public int getC_BankAccount_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BankAccount_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d943f39b-fe24-42be-4343-2f183bfb9f14")
public static String es_PE_FIELD_PaymentProcessor_BankAccount_Name="Cuenta Bancaria";

@XendraTrl(Identifier="d943f39b-fe24-42be-4343-2f183bfb9f14")
public static String es_PE_FIELD_PaymentProcessor_BankAccount_Description="Cuenta bancaria";

@XendraTrl(Identifier="d943f39b-fe24-42be-4343-2f183bfb9f14")
public static String es_PE_FIELD_PaymentProcessor_BankAccount_Help="La cuenta bancaria identifica una cuenta en este banco";

@XendraField(AD_Column_ID="C_BankAccount_ID",IsCentrallyMaintained=true,
AD_Tab_ID="52482ace-9c2b-3b37-4c46-42d350e94ca9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d943f39b-fe24-42be-4343-2f183bfb9f14")
public static final String FIELDNAME_PaymentProcessor_BankAccount="d943f39b-fe24-42be-4343-2f183bfb9f14";

@XendraTrl(Identifier="d1bbf4c4-7414-0b0d-0b97-eca9bbbcc875")
public static String es_PE_COLUMN_C_BankAccount_ID_Name="Cuenta Bancaria";

@XendraColumn(AD_Element_ID="5a03bc67-316f-bd8c-9e68-b009ad1b290b",ColumnName="C_BankAccount_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d1bbf4c4-7414-0b0d-0b97-eca9bbbcc875",
Synchronized="2019-08-30 22:21:58.0")
/** Column name C_BankAccount_ID */
public static final String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID <= 0) set_Value (COLUMNNAME_C_Currency_ID, null);
 else 
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

@XendraTrl(Identifier="3ceb98ec-5c92-4e3d-091e-69e0020175f6")
public static String es_PE_FIELD_PaymentProcessor_OnlyCurrency_Name="Moneda Única";

@XendraTrl(Identifier="3ceb98ec-5c92-4e3d-091e-69e0020175f6")
public static String es_PE_FIELD_PaymentProcessor_OnlyCurrency_Description="Restringe aceptar solamente esta moneda.";

@XendraTrl(Identifier="3ceb98ec-5c92-4e3d-091e-69e0020175f6")
public static String es_PE_FIELD_PaymentProcessor_OnlyCurrency_Help="El campo moneda Única  indica que esta cuenta bancaria acepta solamente la moneda identificada aquí.";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=false,
AD_Tab_ID="52482ace-9c2b-3b37-4c46-42d350e94ca9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=290,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3ceb98ec-5c92-4e3d-091e-69e0020175f6")
public static final String FIELDNAME_PaymentProcessor_OnlyCurrency="3ceb98ec-5c92-4e3d-091e-69e0020175f6";

@XendraTrl(Identifier="8a6a3ce7-12e2-cf61-2ba7-8fb0c2357e18")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8a6a3ce7-12e2-cf61-2ba7-8fb0c2357e18",
Synchronized="2019-08-30 22:21:58.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Commission %.
@param Commission Commission stated as a percentage */
public void setCommission (BigDecimal Commission)
{
if (Commission == null) throw new IllegalArgumentException ("Commission is mandatory.");
set_Value (COLUMNNAME_Commission, Commission);
}
/** Get Commission %.
@return Commission stated as a percentage */
public BigDecimal getCommission() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Commission);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="4e12054f-945e-9d1f-29cf-2bcb3fe07d49")
public static String es_PE_FIELD_PaymentProcessor_Commission_Name="Comisión";

@XendraTrl(Identifier="4e12054f-945e-9d1f-29cf-2bcb3fe07d49")
public static String es_PE_FIELD_PaymentProcessor_Commission_Description="Comisión establecida como un porcentaje";

@XendraTrl(Identifier="4e12054f-945e-9d1f-29cf-2bcb3fe07d49")
public static String es_PE_FIELD_PaymentProcessor_Commission_Help="La Comisión indica (como porcentaje) la comisión a ser pagada";

@XendraField(AD_Column_ID="Commission",IsCentrallyMaintained=true,
AD_Tab_ID="52482ace-9c2b-3b37-4c46-42d350e94ca9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=330,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4e12054f-945e-9d1f-29cf-2bcb3fe07d49")
public static final String FIELDNAME_PaymentProcessor_Commission="4e12054f-945e-9d1f-29cf-2bcb3fe07d49";

@XendraTrl(Identifier="e576d1aa-5304-57e0-5117-518b01ae039d")
public static String es_PE_COLUMN_Commission_Name="Comisión";

@XendraColumn(AD_Element_ID="9c2b08d5-e215-0d37-14f4-dc63ca65f53c",ColumnName="Commission",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e576d1aa-5304-57e0-5117-518b01ae039d",
Synchronized="2019-08-30 22:21:58.0")
/** Column name Commission */
public static final String COLUMNNAME_Commission = "Commission";
/** Set Cost per transaction.
@param CostPerTrx Fixed cost per transaction */
public void setCostPerTrx (BigDecimal CostPerTrx)
{
if (CostPerTrx == null) throw new IllegalArgumentException ("CostPerTrx is mandatory.");
set_Value (COLUMNNAME_CostPerTrx, CostPerTrx);
}
/** Get Cost per transaction.
@return Fixed cost per transaction */
public BigDecimal getCostPerTrx() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CostPerTrx);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="90cf436d-71a0-fc1f-b1ad-a36f5186fddd")
public static String es_PE_FIELD_PaymentProcessor_CostPerTransaction_Name="Costo por Transacción";

@XendraTrl(Identifier="90cf436d-71a0-fc1f-b1ad-a36f5186fddd")
public static String es_PE_FIELD_PaymentProcessor_CostPerTransaction_Description="Costo fijado por transacción";

@XendraTrl(Identifier="90cf436d-71a0-fc1f-b1ad-a36f5186fddd")
public static String es_PE_FIELD_PaymentProcessor_CostPerTransaction_Help="El costo por transacción indica el costo fijo a ser cargado por transacción";

@XendraField(AD_Column_ID="CostPerTrx",IsCentrallyMaintained=true,
AD_Tab_ID="52482ace-9c2b-3b37-4c46-42d350e94ca9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=340,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="90cf436d-71a0-fc1f-b1ad-a36f5186fddd")
public static final String FIELDNAME_PaymentProcessor_CostPerTransaction="90cf436d-71a0-fc1f-b1ad-a36f5186fddd";

@XendraTrl(Identifier="dc5e89e3-0222-3f03-d1ce-1ee6b8ff35cd")
public static String es_PE_COLUMN_CostPerTrx_Name="Costo por Transacción";

@XendraColumn(AD_Element_ID="0390a8c8-9231-4358-afd9-7072d5f2f802",ColumnName="CostPerTrx",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dc5e89e3-0222-3f03-d1ce-1ee6b8ff35cd",
Synchronized="2019-08-30 22:21:58.0")
/** Column name CostPerTrx */
public static final String COLUMNNAME_CostPerTrx = "CostPerTrx";
/** Set Payment Processor.
@param C_PaymentProcessor_ID Payment processor for electronic payments */
public void setC_PaymentProcessor_ID (int C_PaymentProcessor_ID)
{
if (C_PaymentProcessor_ID < 1) throw new IllegalArgumentException ("C_PaymentProcessor_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_PaymentProcessor_ID, Integer.valueOf(C_PaymentProcessor_ID));
}
/** Get Payment Processor.
@return Payment processor for electronic payments */
public int getC_PaymentProcessor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_PaymentProcessor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="32cbb077-d831-a414-e634-8a449405cc1f")
public static String es_PE_FIELD_PaymentProcessor_PaymentProcessor_Name="Procesador de Pago";

@XendraTrl(Identifier="32cbb077-d831-a414-e634-8a449405cc1f")
public static String es_PE_FIELD_PaymentProcessor_PaymentProcessor_Description="Procesador de pagos para pagos electrónicos.";

@XendraTrl(Identifier="32cbb077-d831-a414-e634-8a449405cc1f")
public static String es_PE_FIELD_PaymentProcessor_PaymentProcessor_Help="El procesador de pagos indica el procesador a ser usado para pagos electrónicos.";

@XendraField(AD_Column_ID="C_PaymentProcessor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="52482ace-9c2b-3b37-4c46-42d350e94ca9",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="32cbb077-d831-a414-e634-8a449405cc1f")
public static final String FIELDNAME_PaymentProcessor_PaymentProcessor="32cbb077-d831-a414-e634-8a449405cc1f";
/** Column name C_PaymentProcessor_ID */
public static final String COLUMNNAME_C_PaymentProcessor_ID = "C_PaymentProcessor_ID";
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

@XendraTrl(Identifier="0a785e8d-e054-0315-95b6-89226ba20d69")
public static String es_PE_FIELD_PaymentProcessor_Description_Name="Observación";

@XendraTrl(Identifier="0a785e8d-e054-0315-95b6-89226ba20d69")
public static String es_PE_FIELD_PaymentProcessor_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="0a785e8d-e054-0315-95b6-89226ba20d69")
public static String es_PE_FIELD_PaymentProcessor_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="52482ace-9c2b-3b37-4c46-42d350e94ca9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0a785e8d-e054-0315-95b6-89226ba20d69")
public static final String FIELDNAME_PaymentProcessor_Description="0a785e8d-e054-0315-95b6-89226ba20d69";

@XendraTrl(Identifier="7e538874-7069-e928-13da-97b217f3eec1")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7e538874-7069-e928-13da-97b217f3eec1",
Synchronized="2019-08-30 22:21:58.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Host Address.
@param HostAddress Host Address URL or DNS */
public void setHostAddress (String HostAddress)
{
if (HostAddress == null) throw new IllegalArgumentException ("HostAddress is mandatory.");
if (HostAddress.length() > 60)
{
log.warning("Length > 60 - truncated");
HostAddress = HostAddress.substring(0,59);
}
set_Value (COLUMNNAME_HostAddress, HostAddress);
}
/** Get Host Address.
@return Host Address URL or DNS */
public String getHostAddress() 
{
String value = (String)get_Value(COLUMNNAME_HostAddress);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="f9c63eab-f631-3000-5e61-6be466c32a19")
public static String es_PE_FIELD_PaymentProcessor_HostAddress_Name="Dirección Anfitrión";

@XendraTrl(Identifier="f9c63eab-f631-3000-5e61-6be466c32a19")
public static String es_PE_FIELD_PaymentProcessor_HostAddress_Description="Dirección de host del procesador de pagos";

@XendraTrl(Identifier="f9c63eab-f631-3000-5e61-6be466c32a19")
public static String es_PE_FIELD_PaymentProcessor_HostAddress_Help="La dirección del host identifica el URL para su procesador de pagos";

@XendraField(AD_Column_ID="HostAddress",IsCentrallyMaintained=true,
AD_Tab_ID="52482ace-9c2b-3b37-4c46-42d350e94ca9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f9c63eab-f631-3000-5e61-6be466c32a19")
public static final String FIELDNAME_PaymentProcessor_HostAddress="f9c63eab-f631-3000-5e61-6be466c32a19";

@XendraTrl(Identifier="79f2f39d-c31f-c175-74ca-a54cc14a032d")
public static String es_PE_COLUMN_HostAddress_Name="Dirección Anfitrión";

@XendraColumn(AD_Element_ID="360f9086-02d8-c014-bb85-dbcfac9c3e1d",ColumnName="HostAddress",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="79f2f39d-c31f-c175-74ca-a54cc14a032d",
Synchronized="2019-08-30 22:21:58.0")
/** Column name HostAddress */
public static final String COLUMNNAME_HostAddress = "HostAddress";
/** Set Host port.
@param HostPort Host Communication Port */
public void setHostPort (int HostPort)
{
set_Value (COLUMNNAME_HostPort, Integer.valueOf(HostPort));
}
/** Get Host port.
@return Host Communication Port */
public int getHostPort() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HostPort);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7f748ae2-ba2a-a2f2-8d59-d0b0c3a8aaff")
public static String es_PE_FIELD_PaymentProcessor_HostPort_Name="Puerto Anfitrión";

@XendraTrl(Identifier="7f748ae2-ba2a-a2f2-8d59-d0b0c3a8aaff")
public static String es_PE_FIELD_PaymentProcessor_HostPort_Description="Puerto de host del procesador de pagos";

@XendraTrl(Identifier="7f748ae2-ba2a-a2f2-8d59-d0b0c3a8aaff")
public static String es_PE_FIELD_PaymentProcessor_HostPort_Help="El Puerto Host identifica la ID del puerto para su procesador de pagos";

@XendraField(AD_Column_ID="HostPort",IsCentrallyMaintained=true,
AD_Tab_ID="52482ace-9c2b-3b37-4c46-42d350e94ca9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7f748ae2-ba2a-a2f2-8d59-d0b0c3a8aaff")
public static final String FIELDNAME_PaymentProcessor_HostPort="7f748ae2-ba2a-a2f2-8d59-d0b0c3a8aaff";

@XendraTrl(Identifier="2a86afc2-570b-b1f2-8274-d66233d21618")
public static String es_PE_COLUMN_HostPort_Name="Puerto Anfitrión";

@XendraColumn(AD_Element_ID="6082bb2b-fdc8-34b4-ba72-e7b1c6b69316",ColumnName="HostPort",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2a86afc2-570b-b1f2-8274-d66233d21618",
Synchronized="2019-08-30 22:21:58.0")
/** Column name HostPort */
public static final String COLUMNNAME_HostPort = "HostPort";
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
@XendraTrl(Identifier="13497c87-4312-4a39-984b-1f22893e438b")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="13497c87-4312-4a39-984b-1f22893e438b",
Synchronized="2019-08-30 22:21:58.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Minimum Amt.
@param MinimumAmt Minumum Amout in Document Currency */
public void setMinimumAmt (BigDecimal MinimumAmt)
{
set_Value (COLUMNNAME_MinimumAmt, MinimumAmt);
}
/** Get Minimum Amt.
@return Minumum Amout in Document Currency */
public BigDecimal getMinimumAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MinimumAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="0865d42d-5be0-df0a-2512-26db7e598316")
public static String es_PE_FIELD_PaymentProcessor_MinimumAmt_Name="Cantidad Minima";

@XendraTrl(Identifier="0865d42d-5be0-df0a-2512-26db7e598316")
public static String es_PE_FIELD_PaymentProcessor_MinimumAmt_Description="Cantidad Minima en el documento de moneda";

@XendraField(AD_Column_ID="MinimumAmt",IsCentrallyMaintained=true,
AD_Tab_ID="52482ace-9c2b-3b37-4c46-42d350e94ca9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=280,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0865d42d-5be0-df0a-2512-26db7e598316")
public static final String FIELDNAME_PaymentProcessor_MinimumAmt="0865d42d-5be0-df0a-2512-26db7e598316";

@XendraTrl(Identifier="b39d23e7-4ac4-042f-a1fc-e4e3fffe7139")
public static String es_PE_COLUMN_MinimumAmt_Name="Cantidad Minima";

@XendraColumn(AD_Element_ID="ee5469a0-7c15-2c16-238c-57249ed27d90",ColumnName="MinimumAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b39d23e7-4ac4-042f-a1fc-e4e3fffe7139",
Synchronized="2019-08-30 22:21:58.0")
/** Column name MinimumAmt */
public static final String COLUMNNAME_MinimumAmt = "MinimumAmt";
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

@XendraTrl(Identifier="49aa6d6c-5bcc-9660-f809-e6358aac0061")
public static String es_PE_FIELD_PaymentProcessor_Name_Name="Nombre";

@XendraTrl(Identifier="49aa6d6c-5bcc-9660-f809-e6358aac0061")
public static String es_PE_FIELD_PaymentProcessor_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="49aa6d6c-5bcc-9660-f809-e6358aac0061")
public static String es_PE_FIELD_PaymentProcessor_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="52482ace-9c2b-3b37-4c46-42d350e94ca9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="49aa6d6c-5bcc-9660-f809-e6358aac0061")
public static final String FIELDNAME_PaymentProcessor_Name="49aa6d6c-5bcc-9660-f809-e6358aac0061";

@XendraTrl(Identifier="47f3f1f2-86af-937c-8323-aa15c2e27c2a")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="47f3f1f2-86af-937c-8323-aa15c2e27c2a",
Synchronized="2019-08-30 22:21:58.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Partner ID.
@param PartnerID Partner ID or Account for the Payment Processor */
public void setPartnerID (String PartnerID)
{
if (PartnerID != null && PartnerID.length() > 60)
{
log.warning("Length > 60 - truncated");
PartnerID = PartnerID.substring(0,59);
}
set_Value (COLUMNNAME_PartnerID, PartnerID);
}
/** Get Partner ID.
@return Partner ID or Account for the Payment Processor */
public String getPartnerID() 
{
String value = (String)get_Value(COLUMNNAME_PartnerID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="eae2709a-8517-0819-7b64-a4a0a886ea69")
public static String es_PE_FIELD_PaymentProcessor_PartnerID_Name="ID del Socio";

@XendraTrl(Identifier="eae2709a-8517-0819-7b64-a4a0a886ea69")
public static String es_PE_FIELD_PaymentProcessor_PartnerID_Description="Identificación del socio para el procesamiento de pago";

@XendraField(AD_Column_ID="PartnerID",IsCentrallyMaintained=true,
AD_Tab_ID="52482ace-9c2b-3b37-4c46-42d350e94ca9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eae2709a-8517-0819-7b64-a4a0a886ea69")
public static final String FIELDNAME_PaymentProcessor_PartnerID="eae2709a-8517-0819-7b64-a4a0a886ea69";

@XendraTrl(Identifier="0f162bc5-acde-63f8-bc17-6a954aa31119")
public static String es_PE_COLUMN_PartnerID_Name="ID del Socio";

@XendraColumn(AD_Element_ID="2c03f58c-d414-b171-d934-d31d3824395d",ColumnName="PartnerID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0f162bc5-acde-63f8-bc17-6a954aa31119",
Synchronized="2019-08-30 22:21:58.0")
/** Column name PartnerID */
public static final String COLUMNNAME_PartnerID = "PartnerID";
/** Set Password.
@param Password Password of any length (case sensitive) */
public void setPassword (String Password)
{
if (Password == null) throw new IllegalArgumentException ("Password is mandatory.");
if (Password.length() > 60)
{
log.warning("Length > 60 - truncated");
Password = Password.substring(0,59);
}
set_ValueE (COLUMNNAME_Password, Password);
}
/** Get Password.
@return Password of any length (case sensitive) */
public String getPassword() 
{
String value = (String)get_ValueE(COLUMNNAME_Password);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="cdf47a3a-6d84-c088-8537-eed6e8aac341")
public static String es_PE_FIELD_PaymentProcessor_Password_Name="Contraseña";

@XendraTrl(Identifier="cdf47a3a-6d84-c088-8537-eed6e8aac341")
public static String es_PE_FIELD_PaymentProcessor_Password_Description="Contraseña de cualquier longitud (Sensible a mayúsculas y minúsculas)";

@XendraTrl(Identifier="cdf47a3a-6d84-c088-8537-eed6e8aac341")
public static String es_PE_FIELD_PaymentProcessor_Password_Help="La contraseña indica la contraseña para esta ID de usuario. Las contraseñas se requieren para identificar usuarios autorizados";

@XendraField(AD_Column_ID="Password",IsCentrallyMaintained=true,
AD_Tab_ID="52482ace-9c2b-3b37-4c46-42d350e94ca9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cdf47a3a-6d84-c088-8537-eed6e8aac341")
public static final String FIELDNAME_PaymentProcessor_Password="cdf47a3a-6d84-c088-8537-eed6e8aac341";

@XendraTrl(Identifier="2343bd72-09ac-cb4b-e24b-53d04d37fb3b")
public static String es_PE_COLUMN_Password_Name="Contraseña";

@XendraColumn(AD_Element_ID="cd8ab187-f65c-a732-8e67-8675630874c3",ColumnName="Password",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2343bd72-09ac-cb4b-e24b-53d04d37fb3b",
Synchronized="2019-08-30 22:21:58.0")
/** Column name Password */
public static final String COLUMNNAME_Password = "Password";
/** Set Payment Processor Class.
@param PayProcessorClass Payment Processor Java Class */
public void setPayProcessorClass (String PayProcessorClass)
{
if (PayProcessorClass != null && PayProcessorClass.length() > 60)
{
log.warning("Length > 60 - truncated");
PayProcessorClass = PayProcessorClass.substring(0,59);
}
set_Value (COLUMNNAME_PayProcessorClass, PayProcessorClass);
}
/** Get Payment Processor Class.
@return Payment Processor Java Class */
public String getPayProcessorClass() 
{
String value = (String)get_Value(COLUMNNAME_PayProcessorClass);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="2cccf40e-d6b3-ac9a-1521-b8d4f2c351d7")
public static String es_PE_FIELD_PaymentProcessor_PaymentProcessorClass_Name="Clase Procesador de Pago";

@XendraTrl(Identifier="2cccf40e-d6b3-ac9a-1521-b8d4f2c351d7")
public static String es_PE_FIELD_PaymentProcessor_PaymentProcessorClass_Description="Clase Java del procesador de Pagos";

@XendraTrl(Identifier="2cccf40e-d6b3-ac9a-1521-b8d4f2c351d7")
public static String es_PE_FIELD_PaymentProcessor_PaymentProcessorClass_Help="La clase del procesador de pagos identifica la clase Java usada para procesar pagos";

@XendraField(AD_Column_ID="PayProcessorClass",IsCentrallyMaintained=true,
AD_Tab_ID="52482ace-9c2b-3b37-4c46-42d350e94ca9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=320,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2cccf40e-d6b3-ac9a-1521-b8d4f2c351d7")
public static final String FIELDNAME_PaymentProcessor_PaymentProcessorClass="2cccf40e-d6b3-ac9a-1521-b8d4f2c351d7";

@XendraTrl(Identifier="9cd3d39d-13cc-220a-3f09-97e16e3f18e1")
public static String es_PE_COLUMN_PayProcessorClass_Name="Clase Procesador de Pago";

@XendraColumn(AD_Element_ID="102c7c8a-32e5-4487-6064-5341e7d51e00",ColumnName="PayProcessorClass",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9cd3d39d-13cc-220a-3f09-97e16e3f18e1",
Synchronized="2019-08-30 22:21:58.0")
/** Column name PayProcessorClass */
public static final String COLUMNNAME_PayProcessorClass = "PayProcessorClass";
/** Set Proxy address.
@param ProxyAddress  Address of your proxy server */
public void setProxyAddress (String ProxyAddress)
{
if (ProxyAddress != null && ProxyAddress.length() > 60)
{
log.warning("Length > 60 - truncated");
ProxyAddress = ProxyAddress.substring(0,59);
}
set_Value (COLUMNNAME_ProxyAddress, ProxyAddress);
}
/** Get Proxy address.
@return  Address of your proxy server */
public String getProxyAddress() 
{
String value = (String)get_Value(COLUMNNAME_ProxyAddress);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="448ccf9a-ad11-2d4c-739a-8c905ca5b535")
public static String es_PE_FIELD_PaymentProcessor_ProxyAddress_Name="Dirección Proxy";

@XendraTrl(Identifier="448ccf9a-ad11-2d4c-739a-8c905ca5b535")
public static String es_PE_FIELD_PaymentProcessor_ProxyAddress_Description="Dirección de su servidor de proxy";

@XendraTrl(Identifier="448ccf9a-ad11-2d4c-739a-8c905ca5b535")
public static String es_PE_FIELD_PaymentProcessor_ProxyAddress_Help="La dirección del proxy debe ser definida si usted debe y pasa a través de un cortafuego para tener acceso a su procesador de pago";

@XendraField(AD_Column_ID="ProxyAddress",IsCentrallyMaintained=true,
AD_Tab_ID="52482ace-9c2b-3b37-4c46-42d350e94ca9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="448ccf9a-ad11-2d4c-739a-8c905ca5b535")
public static final String FIELDNAME_PaymentProcessor_ProxyAddress="448ccf9a-ad11-2d4c-739a-8c905ca5b535";

@XendraTrl(Identifier="595a9fc1-b6bd-be5a-c9ad-19f3f98edb6b")
public static String es_PE_COLUMN_ProxyAddress_Name="Dirección Proxy";

@XendraColumn(AD_Element_ID="16a58716-8ae9-bc0d-91e0-589988ba328e",ColumnName="ProxyAddress",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="595a9fc1-b6bd-be5a-c9ad-19f3f98edb6b",
Synchronized="2019-08-30 22:21:58.0")
/** Column name ProxyAddress */
public static final String COLUMNNAME_ProxyAddress = "ProxyAddress";
/** Set Proxy logon.
@param ProxyLogon Logon of your proxy server */
public void setProxyLogon (String ProxyLogon)
{
if (ProxyLogon != null && ProxyLogon.length() > 60)
{
log.warning("Length > 60 - truncated");
ProxyLogon = ProxyLogon.substring(0,59);
}
set_Value (COLUMNNAME_ProxyLogon, ProxyLogon);
}
/** Get Proxy logon.
@return Logon of your proxy server */
public String getProxyLogon() 
{
String value = (String)get_Value(COLUMNNAME_ProxyLogon);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="6c1adfff-3ee2-0872-e1e9-46367f26fc68")
public static String es_PE_FIELD_PaymentProcessor_ProxyLogon_Name="ID Usuario Proxy";

@XendraTrl(Identifier="6c1adfff-3ee2-0872-e1e9-46367f26fc68")
public static String es_PE_FIELD_PaymentProcessor_ProxyLogon_Description="ID Usuario en el servidor Proxy";

@XendraTrl(Identifier="6c1adfff-3ee2-0872-e1e9-46367f26fc68")
public static String es_PE_FIELD_PaymentProcessor_ProxyLogon_Help="La Firma Proxy identifica en la ID de la Firma para su servidor proxy";

@XendraField(AD_Column_ID="ProxyLogon",IsCentrallyMaintained=true,
AD_Tab_ID="52482ace-9c2b-3b37-4c46-42d350e94ca9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6c1adfff-3ee2-0872-e1e9-46367f26fc68")
public static final String FIELDNAME_PaymentProcessor_ProxyLogon="6c1adfff-3ee2-0872-e1e9-46367f26fc68";

@XendraTrl(Identifier="ce5d0f9b-4c24-a1a1-3657-4b4f24ab1cf9")
public static String es_PE_COLUMN_ProxyLogon_Name="ID Usuario Proxy";

@XendraColumn(AD_Element_ID="f3637931-d9d2-a10b-7289-230719e7eebe",ColumnName="ProxyLogon",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ce5d0f9b-4c24-a1a1-3657-4b4f24ab1cf9",
Synchronized="2019-08-30 22:21:58.0")
/** Column name ProxyLogon */
public static final String COLUMNNAME_ProxyLogon = "ProxyLogon";
/** Set Proxy password.
@param ProxyPassword Password of your proxy server */
public void setProxyPassword (String ProxyPassword)
{
if (ProxyPassword != null && ProxyPassword.length() > 60)
{
log.warning("Length > 60 - truncated");
ProxyPassword = ProxyPassword.substring(0,59);
}
set_ValueE (COLUMNNAME_ProxyPassword, ProxyPassword);
}
/** Get Proxy password.
@return Password of your proxy server */
public String getProxyPassword() 
{
String value = (String)get_ValueE(COLUMNNAME_ProxyPassword);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="07782e34-f147-2093-db0d-01781b0bd617")
public static String es_PE_FIELD_PaymentProcessor_ProxyPassword_Name="Contraseña Proxy";

@XendraTrl(Identifier="07782e34-f147-2093-db0d-01781b0bd617")
public static String es_PE_FIELD_PaymentProcessor_ProxyPassword_Description="Contraseña en el servidor proxy";

@XendraTrl(Identifier="07782e34-f147-2093-db0d-01781b0bd617")
public static String es_PE_FIELD_PaymentProcessor_ProxyPassword_Help="La contraseña proxy identifica la contraseña para su servidor proxy";

@XendraField(AD_Column_ID="ProxyPassword",IsCentrallyMaintained=true,
AD_Tab_ID="52482ace-9c2b-3b37-4c46-42d350e94ca9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="07782e34-f147-2093-db0d-01781b0bd617")
public static final String FIELDNAME_PaymentProcessor_ProxyPassword="07782e34-f147-2093-db0d-01781b0bd617";

@XendraTrl(Identifier="ccc4a178-5ee8-18bc-c380-fa3bea2e3d5b")
public static String es_PE_COLUMN_ProxyPassword_Name="Contraseña Proxy";

@XendraColumn(AD_Element_ID="290ba922-a5ea-5c7a-f2c7-dd298b623471",ColumnName="ProxyPassword",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ccc4a178-5ee8-18bc-c380-fa3bea2e3d5b",
Synchronized="2019-08-30 22:21:58.0")
/** Column name ProxyPassword */
public static final String COLUMNNAME_ProxyPassword = "ProxyPassword";
/** Set Proxy port.
@param ProxyPort Port of your proxy server */
public void setProxyPort (int ProxyPort)
{
set_Value (COLUMNNAME_ProxyPort, Integer.valueOf(ProxyPort));
}
/** Get Proxy port.
@return Port of your proxy server */
public int getProxyPort() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_ProxyPort);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c44c4c59-e641-d195-8029-739a7a1e4382")
public static String es_PE_FIELD_PaymentProcessor_ProxyPort_Name="Puerto Proxy";

@XendraTrl(Identifier="c44c4c59-e641-d195-8029-739a7a1e4382")
public static String es_PE_FIELD_PaymentProcessor_ProxyPort_Description="Puerto de tu servidor proxy";

@XendraTrl(Identifier="c44c4c59-e641-d195-8029-739a7a1e4382")
public static String es_PE_FIELD_PaymentProcessor_ProxyPort_Help="El Puerto Proxy identifica el  puerto de su servidor proxy";

@XendraField(AD_Column_ID="ProxyPort",IsCentrallyMaintained=true,
AD_Tab_ID="52482ace-9c2b-3b37-4c46-42d350e94ca9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c44c4c59-e641-d195-8029-739a7a1e4382")
public static final String FIELDNAME_PaymentProcessor_ProxyPort="c44c4c59-e641-d195-8029-739a7a1e4382";

@XendraTrl(Identifier="709707d5-4710-2c28-31a2-56e373fe5cef")
public static String es_PE_COLUMN_ProxyPort_Name="Puerto Proxy";

@XendraColumn(AD_Element_ID="c272d2c7-8ad8-cca4-00ec-45195c7912e9",ColumnName="ProxyPort",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="709707d5-4710-2c28-31a2-56e373fe5cef",
Synchronized="2019-08-30 22:21:58.0")
/** Column name ProxyPort */
public static final String COLUMNNAME_ProxyPort = "ProxyPort";
/** Set Require CreditCard Verification Code.
@param RequireVV Require 3/4 digit Credit Verification Code */
public void setRequireVV (boolean RequireVV)
{
set_Value (COLUMNNAME_RequireVV, Boolean.valueOf(RequireVV));
}
/** Get Require CreditCard Verification Code.
@return Require 3/4 digit Credit Verification Code */
public boolean isRequireVV() 
{
Object oo = get_Value(COLUMNNAME_RequireVV);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="d0e19ce7-96b4-2581-8fec-85ffa3a145ea")
public static String es_PE_FIELD_PaymentProcessor_RequireCreditCardVerificationCode_Name="Verificar Tarjeta de crédito";

@XendraTrl(Identifier="d0e19ce7-96b4-2581-8fec-85ffa3a145ea")
public static String es_PE_FIELD_PaymentProcessor_RequireCreditCardVerificationCode_Description="Requiere código de verificación de crédito verificación tarjeta de crédito dígito 3/4";

@XendraTrl(Identifier="d0e19ce7-96b4-2581-8fec-85ffa3a145ea")
public static String es_PE_FIELD_PaymentProcessor_RequireCreditCardVerificationCode_Help="El cuadro de verificación require verficación la tarjeta de crédito, indica si esta cuenta de banco requiere un número de verificación para transacciones de tarjeta de crédito.";

@XendraField(AD_Column_ID="RequireVV",IsCentrallyMaintained=true,
AD_Tab_ID="52482ace-9c2b-3b37-4c46-42d350e94ca9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=300,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d0e19ce7-96b4-2581-8fec-85ffa3a145ea")
public static final String FIELDNAME_PaymentProcessor_RequireCreditCardVerificationCode="d0e19ce7-96b4-2581-8fec-85ffa3a145ea";

@XendraTrl(Identifier="b598075a-503e-9b0e-848b-f7e4a98eef28")
public static String es_PE_COLUMN_RequireVV_Name="Verificar Tarjeta de crédito";

@XendraColumn(AD_Element_ID="e7dea400-7594-892f-aeb8-0555bf4bba0e",ColumnName="RequireVV",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b598075a-503e-9b0e-848b-f7e4a98eef28",
Synchronized="2019-08-30 22:21:58.0")
/** Column name RequireVV */
public static final String COLUMNNAME_RequireVV = "RequireVV";
/** Set User ID.
@param UserID User ID or account number */
public void setUserID (String UserID)
{
if (UserID == null) throw new IllegalArgumentException ("UserID is mandatory.");
if (UserID.length() > 60)
{
log.warning("Length > 60 - truncated");
UserID = UserID.substring(0,59);
}
set_Value (COLUMNNAME_UserID, UserID);
}
/** Get User ID.
@return User ID or account number */
public String getUserID() 
{
String value = (String)get_Value(COLUMNNAME_UserID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="0d5ddd4d-4eff-3bd6-1cec-3a5a5a3803f1")
public static String es_PE_FIELD_PaymentProcessor_UserID_Name="ID de Usuario";

@XendraTrl(Identifier="0d5ddd4d-4eff-3bd6-1cec-3a5a5a3803f1")
public static String es_PE_FIELD_PaymentProcessor_UserID_Description="ID de Usuario";

@XendraTrl(Identifier="0d5ddd4d-4eff-3bd6-1cec-3a5a5a3803f1")
public static String es_PE_FIELD_PaymentProcessor_UserID_Help="La ID de Usuario identifica a un usuario y le permite el acceso a los registros ó procesos.";

@XendraField(AD_Column_ID="UserID",IsCentrallyMaintained=true,
AD_Tab_ID="52482ace-9c2b-3b37-4c46-42d350e94ca9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0d5ddd4d-4eff-3bd6-1cec-3a5a5a3803f1")
public static final String FIELDNAME_PaymentProcessor_UserID="0d5ddd4d-4eff-3bd6-1cec-3a5a5a3803f1";

@XendraTrl(Identifier="821544e2-cc15-6d45-dee3-f8b7cc20b155")
public static String es_PE_COLUMN_UserID_Name="ID de Usuario";

@XendraColumn(AD_Element_ID="9ebe66cf-07df-8a41-14fc-726fbde3a347",ColumnName="UserID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="821544e2-cc15-6d45-dee3-f8b7cc20b155",
Synchronized="2019-08-30 22:21:58.0")
/** Column name UserID */
public static final String COLUMNNAME_UserID = "UserID";
/** Set Vendor ID.
@param VendorID Vendor ID for the Payment Processor */
public void setVendorID (String VendorID)
{
if (VendorID != null && VendorID.length() > 60)
{
log.warning("Length > 60 - truncated");
VendorID = VendorID.substring(0,59);
}
set_Value (COLUMNNAME_VendorID, VendorID);
}
/** Get Vendor ID.
@return Vendor ID for the Payment Processor */
public String getVendorID() 
{
String value = (String)get_Value(COLUMNNAME_VendorID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="adb8887d-9a29-6abc-60e6-99734059e3e3")
public static String es_PE_FIELD_PaymentProcessor_VendorID_Name="ID del Proveedor";

@XendraTrl(Identifier="adb8887d-9a29-6abc-60e6-99734059e3e3")
public static String es_PE_FIELD_PaymentProcessor_VendorID_Description="Identificación del proveedor para el procesamiento de pago";

@XendraField(AD_Column_ID="VendorID",IsCentrallyMaintained=true,
AD_Tab_ID="52482ace-9c2b-3b37-4c46-42d350e94ca9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="adb8887d-9a29-6abc-60e6-99734059e3e3")
public static final String FIELDNAME_PaymentProcessor_VendorID="adb8887d-9a29-6abc-60e6-99734059e3e3";

@XendraTrl(Identifier="cfdf9f8f-7dd3-031f-1fb0-e1200b042418")
public static String es_PE_COLUMN_VendorID_Name="ID del Proveedor";

@XendraColumn(AD_Element_ID="4eae81cd-740e-fc26-8026-b7bbed5e2721",ColumnName="VendorID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cfdf9f8f-7dd3-031f-1fb0-e1200b042418",
Synchronized="2019-08-30 22:21:58.0")
/** Column name VendorID */
public static final String COLUMNNAME_VendorID = "VendorID";
}
