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
/** Generated Model for C_BP_Group_Acct
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_BP_Group_Acct extends PO
{
/** Standard Constructor
@param ctx context
@param C_BP_Group_Acct_ID id
@param trxName transaction
*/
public X_C_BP_Group_Acct (Properties ctx, int C_BP_Group_Acct_ID, String trxName)
{
super (ctx, C_BP_Group_Acct_ID, trxName);
/** if (C_BP_Group_Acct_ID == 0)
{
setC_AcctSchema_ID (0);
setC_BP_Group_ID (0);
setC_Prepayment_Acct (0);
setC_Receivable_Acct (0);
setC_Receivable_Services_Acct (0);
setNotInvoicedReceipts_Acct (0);
setNotInvoicedReceivables_Acct (0);
setNotInvoicedRevenue_Acct (0);
setPayDiscount_Exp_Acct (0);
setPayDiscount_Rev_Acct (0);
setUnEarnedRevenue_Acct (0);
setV_Liability_Acct (0);
setV_Liability_Services_Acct (0);
setV_Prepayment_Acct (0);
setWriteOffGain_Acct (0);
setWriteOffLoss_Acct (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_BP_Group_Acct (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=395 */
public static int Table_ID=MTable.getTable_ID("C_BP_Group_Acct");

@XendraTrl(Identifier="c4f152c8-6011-43d2-a6f0-343e1b262255")
public static String es_PE_TAB_Accounting_Description="Definir Contabilidad";

@XendraTrl(Identifier="c4f152c8-6011-43d2-a6f0-343e1b262255")
public static String es_PE_TAB_Accounting_Help="La pestaña Contabilidad define las cuentas predeterminadas para cualquier socio de negocio que pertenezca a este grupo.";

@XendraTrl(Identifier="c4f152c8-6011-43d2-a6f0-343e1b262255")
public static String es_PE_TAB_Accounting_Name="Contabilidad";
@XendraTab(Name="Accounting",
Description="Define Accounting",
Help="The Accounting Tab defines the default accounts for any business partner that references this group.  These default values can be modified for each business partner if required.",
AD_Window_ID="96da4345-d601-5a94-1f7c-420540a4b3c4",SeqNo=20,TabLevel=1,IsSingleRow=true,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="c4f152c8-6011-43d2-a6f0-343e1b262255",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Accounting="c4f152c8-6011-43d2-a6f0-343e1b262255";

@XendraTrl(Identifier="498f9a36-7cd1-9011-e5bd-56c6f1884633")
public static String es_PE_TABLE_C_BP_Group_Acct_Name="C_BP_Group_Acct";

@XendraTable(Name="Business Partner Group Acct",
AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="C_BP_Group_Acct",AccessLevel="3",AD_Window_ID="96da4345-d601-5a94-1f7c-420540a4b3c4",
AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="498f9a36-7cd1-9011-e5bd-56c6f1884633",Synchronized="2020-03-03 21:36:38.0")
/** TableName=C_BP_Group_Acct */
public static final String Table_Name="C_BP_Group_Acct";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_BP_Group_Acct");

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
    Table_ID = MTable.getTable_ID("C_BP_Group_Acct");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_BP_Group_Acct[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Accounting Schema.
@param C_AcctSchema_ID Rules for accounting */
public void setC_AcctSchema_ID (int C_AcctSchema_ID)
{
if (C_AcctSchema_ID < 1) throw new IllegalArgumentException ("C_AcctSchema_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_AcctSchema_ID, Integer.valueOf(C_AcctSchema_ID));
}
/** Get Accounting Schema.
@return Rules for accounting */
public int getC_AcctSchema_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_AcctSchema_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="284df714-8843-5c5d-9dd3-a19974868c07")
public static String es_PE_FIELD_Accounting_AccountingSchema_Name="Esquema Contable";

@XendraTrl(Identifier="284df714-8843-5c5d-9dd3-a19974868c07")
public static String es_PE_FIELD_Accounting_AccountingSchema_Description="Reglas para contabilizar";

@XendraTrl(Identifier="284df714-8843-5c5d-9dd3-a19974868c07")
public static String es_PE_FIELD_Accounting_AccountingSchema_Help="Un esquema contable define las reglas contables usadas tales como método de costeo; moneda y calendario";

@XendraField(AD_Column_ID="C_AcctSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c4f152c8-6011-43d2-a6f0-343e1b262255",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="284df714-8843-5c5d-9dd3-a19974868c07")
public static final String FIELDNAME_Accounting_AccountingSchema="284df714-8843-5c5d-9dd3-a19974868c07";

@XendraTrl(Identifier="97f477bd-f701-50db-0536-c86cc4d403ca")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="97f477bd-f701-50db-0536-c86cc4d403ca",
Synchronized="2019-08-30 22:21:15.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
/** Set Business Partner Group.
@param C_BP_Group_ID Business Partner Group */
public void setC_BP_Group_ID (int C_BP_Group_ID)
{
if (C_BP_Group_ID < 1) throw new IllegalArgumentException ("C_BP_Group_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_BP_Group_ID, Integer.valueOf(C_BP_Group_ID));
}
/** Get Business Partner Group.
@return Business Partner Group */
public int getC_BP_Group_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BP_Group_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getC_BP_Group_ID()));
}

@XendraTrl(Identifier="40c6cc2e-5084-6cbc-28f5-f0deeb6afd05")
public static String es_PE_FIELD_Accounting_BusinessPartnerGroup_Name="Grupo de Socio de Negocio";

@XendraTrl(Identifier="40c6cc2e-5084-6cbc-28f5-f0deeb6afd05")
public static String es_PE_FIELD_Accounting_BusinessPartnerGroup_Description="ID del Grupo de Socio de Negocio";

@XendraTrl(Identifier="40c6cc2e-5084-6cbc-28f5-f0deeb6afd05")
public static String es_PE_FIELD_Accounting_BusinessPartnerGroup_Help="La ID Grupo del Socio de Negocio proporciona un método de definir valores predeterminados a ser usados para Socios de Negocio individuales.";

@XendraField(AD_Column_ID="C_BP_Group_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c4f152c8-6011-43d2-a6f0-343e1b262255",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="40c6cc2e-5084-6cbc-28f5-f0deeb6afd05")
public static final String FIELDNAME_Accounting_BusinessPartnerGroup="40c6cc2e-5084-6cbc-28f5-f0deeb6afd05";

@XendraTrl(Identifier="a3279b5d-814d-6785-5a1f-6dde9fcd84b3")
public static String es_PE_COLUMN_C_BP_Group_ID_Name="Grupo de Socio de Negocio";

@XendraColumn(AD_Element_ID="e4bea975-0a3a-c828-703f-724f29c7518a",ColumnName="C_BP_Group_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a3279b5d-814d-6785-5a1f-6dde9fcd84b3",
Synchronized="2019-08-30 22:21:15.0")
/** Column name C_BP_Group_ID */
public static final String COLUMNNAME_C_BP_Group_ID = "C_BP_Group_ID";
/** Set Customer Prepayment.
@param C_Prepayment_Acct Account for customer prepayments */
public void setC_Prepayment_Acct (int C_Prepayment_Acct)
{
set_Value (COLUMNNAME_C_Prepayment_Acct, Integer.valueOf(C_Prepayment_Acct));
}
/** Get Customer Prepayment.
@return Account for customer prepayments */
public int getC_Prepayment_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Prepayment_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="63f22e70-dcf0-8d35-5471-cf67bfd5fec9")
public static String es_PE_FIELD_Accounting_CustomerPrepayment_Name="Pago Anticipado de Clientes";

@XendraTrl(Identifier="63f22e70-dcf0-8d35-5471-cf67bfd5fec9")
public static String es_PE_FIELD_Accounting_CustomerPrepayment_Description="Cuenta para pagos anticipados de clientes.";

@XendraTrl(Identifier="63f22e70-dcf0-8d35-5471-cf67bfd5fec9")
public static String es_PE_FIELD_Accounting_CustomerPrepayment_Help="La cuenta para pagos anticipados de clientes indica la cuenta a ser usada para registrar pagos anticipados de clientes.";

@XendraField(AD_Column_ID="C_Prepayment_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="c4f152c8-6011-43d2-a6f0-343e1b262255",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="63f22e70-dcf0-8d35-5471-cf67bfd5fec9")
public static final String FIELDNAME_Accounting_CustomerPrepayment="63f22e70-dcf0-8d35-5471-cf67bfd5fec9";

@XendraTrl(Identifier="9d1da403-d907-5157-7a29-bf17e3e88e4a")
public static String es_PE_COLUMN_C_Prepayment_Acct_Name="Pago Anticipado de Clientes";

@XendraColumn(AD_Element_ID="8fce2dea-0db2-e7fc-767e-344c87d2f65a",ColumnName="C_Prepayment_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9d1da403-d907-5157-7a29-bf17e3e88e4a",
Synchronized="2019-08-30 22:21:15.0")
/** Column name C_Prepayment_Acct */
public static final String COLUMNNAME_C_Prepayment_Acct = "C_Prepayment_Acct";
/** Set Customer Receivables.
@param C_Receivable_Acct Account for Customer Receivables */
public void setC_Receivable_Acct (int C_Receivable_Acct)
{
set_Value (COLUMNNAME_C_Receivable_Acct, Integer.valueOf(C_Receivable_Acct));
}
/** Get Customer Receivables.
@return Account for Customer Receivables */
public int getC_Receivable_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Receivable_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1f5a7a6c-d552-6611-6b9e-c6612294f0e8")
public static String es_PE_FIELD_Accounting_CustomerReceivables_Name="CxC de Clientes";

@XendraTrl(Identifier="1f5a7a6c-d552-6611-6b9e-c6612294f0e8")
public static String es_PE_FIELD_Accounting_CustomerReceivables_Description="Cuenta por cobrar de clientes";

@XendraTrl(Identifier="1f5a7a6c-d552-6611-6b9e-c6612294f0e8")
public static String es_PE_FIELD_Accounting_CustomerReceivables_Help="La cuenta por cobrar de clientes indica la cuenta a ser usada para registrar transacciones de cobros a clientes";

@XendraField(AD_Column_ID="C_Receivable_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="c4f152c8-6011-43d2-a6f0-343e1b262255",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1f5a7a6c-d552-6611-6b9e-c6612294f0e8")
public static final String FIELDNAME_Accounting_CustomerReceivables="1f5a7a6c-d552-6611-6b9e-c6612294f0e8";

@XendraTrl(Identifier="2f8c3bf5-511f-c123-a38c-0d7f0dd80c34")
public static String es_PE_COLUMN_C_Receivable_Acct_Name="CxC de Clientes";

@XendraColumn(AD_Element_ID="40fe8c0a-9ee8-fe94-a8c9-b45c09c9a30d",ColumnName="C_Receivable_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2f8c3bf5-511f-c123-a38c-0d7f0dd80c34",
Synchronized="2019-08-30 22:21:15.0")
/** Column name C_Receivable_Acct */
public static final String COLUMNNAME_C_Receivable_Acct = "C_Receivable_Acct";
/** Set Receivable Services.
@param C_Receivable_Services_Acct Customer Accounts Receivables Services Account */
public void setC_Receivable_Services_Acct (int C_Receivable_Services_Acct)
{
set_Value (COLUMNNAME_C_Receivable_Services_Acct, Integer.valueOf(C_Receivable_Services_Acct));
}
/** Get Receivable Services.
@return Customer Accounts Receivables Services Account */
public int getC_Receivable_Services_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Receivable_Services_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="81c283fa-1749-fd64-0f56-0af09958e0b3")
public static String es_PE_FIELD_Accounting_ReceivableServices_Name="CxC Servicios";

@XendraTrl(Identifier="81c283fa-1749-fd64-0f56-0af09958e0b3")
public static String es_PE_FIELD_Accounting_ReceivableServices_Description="Cuenta Clientes CxC Servicios ";

@XendraTrl(Identifier="81c283fa-1749-fd64-0f56-0af09958e0b3")
public static String es_PE_FIELD_Accounting_ReceivableServices_Help="Cuenta para aplicar servicios relacionados CxC. Si desea diferenciar ingresos por Productos y Servicios. Esta cuenta solamente es empleada, si la aplicación para la cuenta servicios está habilitado en el esquema contable.";

@XendraField(AD_Column_ID="C_Receivable_Services_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="c4f152c8-6011-43d2-a6f0-343e1b262255",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="81c283fa-1749-fd64-0f56-0af09958e0b3")
public static final String FIELDNAME_Accounting_ReceivableServices="81c283fa-1749-fd64-0f56-0af09958e0b3";

@XendraTrl(Identifier="b195da85-fa79-c904-87e0-ad4bb2ee4e82")
public static String es_PE_COLUMN_C_Receivable_Services_Acct_Name="CxC Servicios";

@XendraColumn(AD_Element_ID="9bd443ea-2c92-edbc-96ce-3eb12789faf4",
ColumnName="C_Receivable_Services_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b195da85-fa79-c904-87e0-ad4bb2ee4e82",Synchronized="2019-08-30 22:21:15.0")
/** Column name C_Receivable_Services_Acct */
public static final String COLUMNNAME_C_Receivable_Services_Acct = "C_Receivable_Services_Acct";
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
@XendraTrl(Identifier="4fe738fd-056d-442e-93fb-cecc15ca01c3")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4fe738fd-056d-442e-93fb-cecc15ca01c3",
Synchronized="2019-08-30 22:21:15.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Not-invoiced Receipts.
@param NotInvoicedReceipts_Acct Account for not-invoiced Material Receipts */
public void setNotInvoicedReceipts_Acct (int NotInvoicedReceipts_Acct)
{
set_Value (COLUMNNAME_NotInvoicedReceipts_Acct, Integer.valueOf(NotInvoicedReceipts_Acct));
}
/** Get Not-invoiced Receipts.
@return Account for not-invoiced Material Receipts */
public int getNotInvoicedReceipts_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_NotInvoicedReceipts_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1eb90214-4128-cbd0-d9d1-1ac398cb96b7")
public static String es_PE_FIELD_Accounting_Not_InvoicedReceipts_Name="Recibos no Facturados";

@XendraTrl(Identifier="1eb90214-4128-cbd0-d9d1-1ac398cb96b7")
public static String es_PE_FIELD_Accounting_Not_InvoicedReceipts_Description="Cuenta para Recibos de Material no Facturados";

@XendraTrl(Identifier="1eb90214-4128-cbd0-d9d1-1ac398cb96b7")
public static String es_PE_FIELD_Accounting_Not_InvoicedReceipts_Help="La cuenta de Recibos no Facturados indica la cuenta usada para registrar recibos de materiales que no han sido aún facturados";

@XendraField(AD_Column_ID="NotInvoicedReceipts_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="c4f152c8-6011-43d2-a6f0-343e1b262255",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1eb90214-4128-cbd0-d9d1-1ac398cb96b7")
public static final String FIELDNAME_Accounting_Not_InvoicedReceipts="1eb90214-4128-cbd0-d9d1-1ac398cb96b7";

@XendraTrl(Identifier="d9dde0da-efba-60bb-a58a-44ecb3469af8")
public static String es_PE_COLUMN_NotInvoicedReceipts_Acct_Name="Recibos no Facturados";

@XendraColumn(AD_Element_ID="0fcf25de-3044-1b9d-5e4a-df9ec372db39",
ColumnName="NotInvoicedReceipts_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d9dde0da-efba-60bb-a58a-44ecb3469af8",Synchronized="2019-08-30 22:21:15.0")
/** Column name NotInvoicedReceipts_Acct */
public static final String COLUMNNAME_NotInvoicedReceipts_Acct = "NotInvoicedReceipts_Acct";
/** Set Not-invoiced Receivables.
@param NotInvoicedReceivables_Acct Account for not invoiced Receivables */
public void setNotInvoicedReceivables_Acct (int NotInvoicedReceivables_Acct)
{
set_Value (COLUMNNAME_NotInvoicedReceivables_Acct, Integer.valueOf(NotInvoicedReceivables_Acct));
}
/** Get Not-invoiced Receivables.
@return Account for not invoiced Receivables */
public int getNotInvoicedReceivables_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_NotInvoicedReceivables_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="600efcad-eb69-6cd3-f18a-fdb0cbb7815c")
public static String es_PE_FIELD_Accounting_Not_InvoicedReceivables_Name="CxC No Facturada";

@XendraTrl(Identifier="600efcad-eb69-6cd3-f18a-fdb0cbb7815c")
public static String es_PE_FIELD_Accounting_Not_InvoicedReceivables_Description="Cuenta para cobros no facturados";

@XendraTrl(Identifier="600efcad-eb69-6cd3-f18a-fdb0cbb7815c")
public static String es_PE_FIELD_Accounting_Not_InvoicedReceivables_Help="La cuenta de cobros no facturados indica la cuenta usada para registrar cobros que aún no han sido facturados";

@XendraField(AD_Column_ID="NotInvoicedReceivables_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="c4f152c8-6011-43d2-a6f0-343e1b262255",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="600efcad-eb69-6cd3-f18a-fdb0cbb7815c")
public static final String FIELDNAME_Accounting_Not_InvoicedReceivables="600efcad-eb69-6cd3-f18a-fdb0cbb7815c";

@XendraTrl(Identifier="b83d6b81-6e40-99c4-c7dd-627db50c87e9")
public static String es_PE_COLUMN_NotInvoicedReceivables_Acct_Name="CxC No Facturada";

@XendraColumn(AD_Element_ID="136c5289-9315-f019-a4b1-07f6b00cf381",
ColumnName="NotInvoicedReceivables_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b83d6b81-6e40-99c4-c7dd-627db50c87e9",Synchronized="2019-08-30 22:21:15.0")
/** Column name NotInvoicedReceivables_Acct */
public static final String COLUMNNAME_NotInvoicedReceivables_Acct = "NotInvoicedReceivables_Acct";
/** Set Not-invoiced Revenue.
@param NotInvoicedRevenue_Acct Account for not invoiced Revenue */
public void setNotInvoicedRevenue_Acct (int NotInvoicedRevenue_Acct)
{
set_Value (COLUMNNAME_NotInvoicedRevenue_Acct, Integer.valueOf(NotInvoicedRevenue_Acct));
}
/** Get Not-invoiced Revenue.
@return Account for not invoiced Revenue */
public int getNotInvoicedRevenue_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_NotInvoicedRevenue_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="cf5820b7-d272-3ad3-2cbd-2287e05fbdf4")
public static String es_PE_FIELD_Accounting_Not_InvoicedRevenue_Name="Ingresos no Facturados";

@XendraTrl(Identifier="cf5820b7-d272-3ad3-2cbd-2287e05fbdf4")
public static String es_PE_FIELD_Accounting_Not_InvoicedRevenue_Description="Cuenta para Ingresos no facturados";

@XendraTrl(Identifier="cf5820b7-d272-3ad3-2cbd-2287e05fbdf4")
public static String es_PE_FIELD_Accounting_Not_InvoicedRevenue_Help="La cuenta de Ingresos no facturados indica la cuenta usada para registrar ingresos que no han sido aún facturados.";

@XendraField(AD_Column_ID="NotInvoicedRevenue_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="c4f152c8-6011-43d2-a6f0-343e1b262255",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cf5820b7-d272-3ad3-2cbd-2287e05fbdf4")
public static final String FIELDNAME_Accounting_Not_InvoicedRevenue="cf5820b7-d272-3ad3-2cbd-2287e05fbdf4";

@XendraTrl(Identifier="3bc929ca-858b-04fb-c1a7-e42267c7bd3a")
public static String es_PE_COLUMN_NotInvoicedRevenue_Acct_Name="Ingresos no Facturados";

@XendraColumn(AD_Element_ID="a812ce44-7f3f-f0c5-d688-384a8cd4f22d",
ColumnName="NotInvoicedRevenue_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3bc929ca-858b-04fb-c1a7-e42267c7bd3a",Synchronized="2019-08-30 22:21:15.0")
/** Column name NotInvoicedRevenue_Acct */
public static final String COLUMNNAME_NotInvoicedRevenue_Acct = "NotInvoicedRevenue_Acct";
/** Set Payment Discount Expense.
@param PayDiscount_Exp_Acct Payment Discount Expense Account */
public void setPayDiscount_Exp_Acct (int PayDiscount_Exp_Acct)
{
set_Value (COLUMNNAME_PayDiscount_Exp_Acct, Integer.valueOf(PayDiscount_Exp_Acct));
}
/** Get Payment Discount Expense.
@return Payment Discount Expense Account */
public int getPayDiscount_Exp_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PayDiscount_Exp_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9db182e2-7dca-d312-ae06-dd62971f78aa")
public static String es_PE_FIELD_Accounting_PaymentDiscountExpense_Name="Gastos de Descuentos en Pagos";

@XendraTrl(Identifier="9db182e2-7dca-d312-ae06-dd62971f78aa")
public static String es_PE_FIELD_Accounting_PaymentDiscountExpense_Description="Gastos de Descuentos en Pagos";

@XendraTrl(Identifier="9db182e2-7dca-d312-ae06-dd62971f78aa")
public static String es_PE_FIELD_Accounting_PaymentDiscountExpense_Help="Indica la cuenta a ser cargada para gastos por descuentos en pagos";

@XendraField(AD_Column_ID="PayDiscount_Exp_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="c4f152c8-6011-43d2-a6f0-343e1b262255",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9db182e2-7dca-d312-ae06-dd62971f78aa")
public static final String FIELDNAME_Accounting_PaymentDiscountExpense="9db182e2-7dca-d312-ae06-dd62971f78aa";

@XendraTrl(Identifier="5608f8e9-d7dc-d3f9-5d5a-0d33d727153c")
public static String es_PE_COLUMN_PayDiscount_Exp_Acct_Name="Gastos de Descuentos en Pagos";

@XendraColumn(AD_Element_ID="5ba156b8-18c7-dda1-5404-606e13996b8a",
ColumnName="PayDiscount_Exp_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5608f8e9-d7dc-d3f9-5d5a-0d33d727153c",Synchronized="2019-08-30 22:21:15.0")
/** Column name PayDiscount_Exp_Acct */
public static final String COLUMNNAME_PayDiscount_Exp_Acct = "PayDiscount_Exp_Acct";
/** Set Payment Discount Revenue.
@param PayDiscount_Rev_Acct Payment Discount Revenue Account */
public void setPayDiscount_Rev_Acct (int PayDiscount_Rev_Acct)
{
set_Value (COLUMNNAME_PayDiscount_Rev_Acct, Integer.valueOf(PayDiscount_Rev_Acct));
}
/** Get Payment Discount Revenue.
@return Payment Discount Revenue Account */
public int getPayDiscount_Rev_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PayDiscount_Rev_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="cc5b8ad3-a7d4-1e1a-5698-490fc8abdcf2")
public static String es_PE_FIELD_Accounting_PaymentDiscountRevenue_Name="Ingresos de Descuentos en Pagos";

@XendraTrl(Identifier="cc5b8ad3-a7d4-1e1a-5698-490fc8abdcf2")
public static String es_PE_FIELD_Accounting_PaymentDiscountRevenue_Description="Ingresos de descuentos en pagos";

@XendraTrl(Identifier="cc5b8ad3-a7d4-1e1a-5698-490fc8abdcf2")
public static String es_PE_FIELD_Accounting_PaymentDiscountRevenue_Help="Indica la cuenta a ser cargada por ingresos por descuentos en pagos.";

@XendraField(AD_Column_ID="PayDiscount_Rev_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="c4f152c8-6011-43d2-a6f0-343e1b262255",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cc5b8ad3-a7d4-1e1a-5698-490fc8abdcf2")
public static final String FIELDNAME_Accounting_PaymentDiscountRevenue="cc5b8ad3-a7d4-1e1a-5698-490fc8abdcf2";

@XendraTrl(Identifier="0bcb9cd7-549d-17c5-827c-0c854ab0cf49")
public static String es_PE_COLUMN_PayDiscount_Rev_Acct_Name="Ingresos de Descuentos en Pagos";

@XendraColumn(AD_Element_ID="735917d8-4315-5aa6-3e6f-b283ad644399",
ColumnName="PayDiscount_Rev_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0bcb9cd7-549d-17c5-827c-0c854ab0cf49",Synchronized="2019-08-30 22:21:15.0")
/** Column name PayDiscount_Rev_Acct */
public static final String COLUMNNAME_PayDiscount_Rev_Acct = "PayDiscount_Rev_Acct";
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

@XendraTrl(Identifier="1b8b923b-4ac7-e44d-7df8-49ac7e4e04eb")
public static String es_PE_FIELD_Accounting_ProcessNow_Name="Copiar Cuentas";

@XendraTrl(Identifier="1b8b923b-4ac7-e44d-7df8-49ac7e4e04eb")
public static String es_PE_FIELD_Accounting_ProcessNow_Description="Copiar y sobreescribir las cuentas para los socios del negocio de este grupo";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="c4f152c8-6011-43d2-a6f0-343e1b262255",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1b8b923b-4ac7-e44d-7df8-49ac7e4e04eb")
public static final String FIELDNAME_Accounting_ProcessNow="1b8b923b-4ac7-e44d-7df8-49ac7e4e04eb";

@XendraTrl(Identifier="6712083c-20ae-cb1f-5ec4-07b7982f5c85")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="4fbbacc8-b7c7-8cc5-5eaf-f976b4f61f5a",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6712083c-20ae-cb1f-5ec4-07b7982f5c85",Synchronized="2019-08-30 22:21:15.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Unearned Revenue.
@param UnEarnedRevenue_Acct Account for unearned revenue */
public void setUnEarnedRevenue_Acct (int UnEarnedRevenue_Acct)
{
set_Value (COLUMNNAME_UnEarnedRevenue_Acct, Integer.valueOf(UnEarnedRevenue_Acct));
}
/** Get Unearned Revenue.
@return Account for unearned revenue */
public int getUnEarnedRevenue_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_UnEarnedRevenue_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="18247fdf-fd30-7ed6-8f4d-e4279fb19b29")
public static String es_PE_FIELD_Accounting_UnearnedRevenue_Name="Ingresos no Devengados";

@XendraTrl(Identifier="18247fdf-fd30-7ed6-8f4d-e4279fb19b29")
public static String es_PE_FIELD_Accounting_UnearnedRevenue_Description="Cuenta para ingresos no devengados";

@XendraTrl(Identifier="18247fdf-fd30-7ed6-8f4d-e4279fb19b29")
public static String es_PE_FIELD_Accounting_UnearnedRevenue_Help="El Ingreso no devengado indica la cuenta usada para registrar facturas enviadas por productos ó servicios que aún no han sido entregados. Es usado en reconocimiento de ingresos.";

@XendraField(AD_Column_ID="UnEarnedRevenue_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="c4f152c8-6011-43d2-a6f0-343e1b262255",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="18247fdf-fd30-7ed6-8f4d-e4279fb19b29")
public static final String FIELDNAME_Accounting_UnearnedRevenue="18247fdf-fd30-7ed6-8f4d-e4279fb19b29";

@XendraTrl(Identifier="73b54155-716f-e589-5609-44742034e6a0")
public static String es_PE_COLUMN_UnEarnedRevenue_Acct_Name="Ingresos no Devengados";

@XendraColumn(AD_Element_ID="7e124a02-1533-da59-cb65-c976cc633243",
ColumnName="UnEarnedRevenue_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="73b54155-716f-e589-5609-44742034e6a0",Synchronized="2019-08-30 22:21:15.0")
/** Column name UnEarnedRevenue_Acct */
public static final String COLUMNNAME_UnEarnedRevenue_Acct = "UnEarnedRevenue_Acct";
/** Set Vendor Liability.
@param V_Liability_Acct Account for Vendor Liability */
public void setV_Liability_Acct (int V_Liability_Acct)
{
set_Value (COLUMNNAME_V_Liability_Acct, Integer.valueOf(V_Liability_Acct));
}
/** Get Vendor Liability.
@return Account for Vendor Liability */
public int getV_Liability_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_V_Liability_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e9971d77-1395-7fd6-f0b9-13270a79f332")
public static String es_PE_FIELD_Accounting_VendorLiability_Name="CxP del Proveedor";

@XendraTrl(Identifier="e9971d77-1395-7fd6-f0b9-13270a79f332")
public static String es_PE_FIELD_Accounting_VendorLiability_Description="Cuenta por pagar a proveedores";

@XendraTrl(Identifier="e9971d77-1395-7fd6-f0b9-13270a79f332")
public static String es_PE_FIELD_Accounting_VendorLiability_Help="La cuenta por pagar a proveedores indica la cuenta usada para registrar transacciones para pasivos de proveedores";

@XendraField(AD_Column_ID="V_Liability_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="c4f152c8-6011-43d2-a6f0-343e1b262255",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e9971d77-1395-7fd6-f0b9-13270a79f332")
public static final String FIELDNAME_Accounting_VendorLiability="e9971d77-1395-7fd6-f0b9-13270a79f332";

@XendraTrl(Identifier="ccc177cf-1cf8-bc08-1481-b4cf2f2ef6d9")
public static String es_PE_COLUMN_V_Liability_Acct_Name="CxP del Proveedor";

@XendraColumn(AD_Element_ID="e29c7545-3824-1bd2-2c19-97e5fec61099",ColumnName="V_Liability_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ccc177cf-1cf8-bc08-1481-b4cf2f2ef6d9",
Synchronized="2019-08-30 22:21:15.0")
/** Column name V_Liability_Acct */
public static final String COLUMNNAME_V_Liability_Acct = "V_Liability_Acct";
/** Set Vendor Service Liability.
@param V_Liability_Services_Acct Account for Vender Service Liability */
public void setV_Liability_Services_Acct (int V_Liability_Services_Acct)
{
set_Value (COLUMNNAME_V_Liability_Services_Acct, Integer.valueOf(V_Liability_Services_Acct));
}
/** Get Vendor Service Liability.
@return Account for Vender Service Liability */
public int getV_Liability_Services_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_V_Liability_Services_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c83ed651-8ff2-5416-c137-0048a9ba2fba")
public static String es_PE_FIELD_Accounting_VendorServiceLiability_Name="CxP del Proveedor de Servicios";

@XendraTrl(Identifier="c83ed651-8ff2-5416-c137-0048a9ba2fba")
public static String es_PE_FIELD_Accounting_VendorServiceLiability_Description="Cuenta por pagar a proveedores de servicios";

@XendraTrl(Identifier="c83ed651-8ff2-5416-c137-0048a9ba2fba")
public static String es_PE_FIELD_Accounting_VendorServiceLiability_Help="La cuenta de pasivos por servicios a proveedores";

@XendraField(AD_Column_ID="V_Liability_Services_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="c4f152c8-6011-43d2-a6f0-343e1b262255",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c83ed651-8ff2-5416-c137-0048a9ba2fba")
public static final String FIELDNAME_Accounting_VendorServiceLiability="c83ed651-8ff2-5416-c137-0048a9ba2fba";

@XendraTrl(Identifier="0144fbbc-2db5-85b7-7c34-96c882718de2")
public static String es_PE_COLUMN_V_Liability_Services_Acct_Name="CxP del Proveedor de Servicios";

@XendraColumn(AD_Element_ID="8e204c54-fe89-0381-543a-caba88fb2eb6",
ColumnName="V_Liability_Services_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0144fbbc-2db5-85b7-7c34-96c882718de2",Synchronized="2019-08-30 22:21:15.0")
/** Column name V_Liability_Services_Acct */
public static final String COLUMNNAME_V_Liability_Services_Acct = "V_Liability_Services_Acct";
/** Set Vendor Prepayment.
@param V_Prepayment_Acct Account for Vendor Prepayments */
public void setV_Prepayment_Acct (int V_Prepayment_Acct)
{
set_Value (COLUMNNAME_V_Prepayment_Acct, Integer.valueOf(V_Prepayment_Acct));
}
/** Get Vendor Prepayment.
@return Account for Vendor Prepayments */
public int getV_Prepayment_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_V_Prepayment_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="abed8a0f-b886-f84c-73a5-3e22e56c4c1c")
public static String es_PE_FIELD_Accounting_VendorPrepayment_Name="Prepago del proveedor";

@XendraTrl(Identifier="abed8a0f-b886-f84c-73a5-3e22e56c4c1c")
public static String es_PE_FIELD_Accounting_VendorPrepayment_Description="Cuenta para prepagos del proveedor";

@XendraTrl(Identifier="abed8a0f-b886-f84c-73a5-3e22e56c4c1c")
public static String es_PE_FIELD_Accounting_VendorPrepayment_Help="La cuenta de prepagos del proveedor indica la cuenta usada para registrar pagos anticipados a un proveedor";

@XendraField(AD_Column_ID="V_Prepayment_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="c4f152c8-6011-43d2-a6f0-343e1b262255",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="abed8a0f-b886-f84c-73a5-3e22e56c4c1c")
public static final String FIELDNAME_Accounting_VendorPrepayment="abed8a0f-b886-f84c-73a5-3e22e56c4c1c";

@XendraTrl(Identifier="5b67dd4f-f82b-9a32-f06a-bbd25c91f76e")
public static String es_PE_COLUMN_V_Prepayment_Acct_Name="Prepago del proveedor";

@XendraColumn(AD_Element_ID="cd6be1eb-3769-4db5-ea33-4b298a8725a5",ColumnName="V_Prepayment_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5b67dd4f-f82b-9a32-f06a-bbd25c91f76e",
Synchronized="2019-08-30 22:21:15.0")
/** Column name V_Prepayment_Acct */
public static final String COLUMNNAME_V_Prepayment_Acct = "V_Prepayment_Acct";
/** Set Write-off Gain.
@param WriteOffGain_Acct Account for Receivables write-off incomes */
public void setWriteOffGain_Acct (int WriteOffGain_Acct)
{
set_Value (COLUMNNAME_WriteOffGain_Acct, Integer.valueOf(WriteOffGain_Acct));
}
/** Get Write-off Gain.
@return Account for Receivables write-off incomes */
public int getWriteOffGain_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_WriteOffGain_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b3c9bca1-139d-f544-3264-0629f3529326")
public static String es_PE_FIELD_Accounting_Write_OffGain_Name="Ajustes Ganancia";

@XendraTrl(Identifier="b3c9bca1-139d-f544-3264-0629f3529326")
public static String es_PE_FIELD_Accounting_Write_OffGain_Description="Cuenta de Ajustes en Cuentas por Cobrar (C x C) para diferencia positiva";

@XendraTrl(Identifier="b3c9bca1-139d-f544-3264-0629f3529326")
public static String es_PE_FIELD_Accounting_Write_OffGain_Help="La cuenta de ajustes identifica la cuenta para las transacciones de ajuste en libros, cuando la diferencia es positiva.";

@XendraField(AD_Column_ID="WriteOffGain_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="c4f152c8-6011-43d2-a6f0-343e1b262255",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b3c9bca1-139d-f544-3264-0629f3529326")
public static final String FIELDNAME_Accounting_Write_OffGain="b3c9bca1-139d-f544-3264-0629f3529326";

@XendraTrl(Identifier="c04f264b-aa88-cd43-989b-767ccd5e01b7")
public static String es_PE_COLUMN_WriteOffGain_Acct_Name="Ajustes Ganancia";

@XendraColumn(AD_Element_ID="daf9a398-1bce-6a85-1193-d964fadd65ba",ColumnName="WriteOffGain_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c04f264b-aa88-cd43-989b-767ccd5e01b7",
Synchronized="2019-08-30 22:21:15.0")
/** Column name WriteOffGain_Acct */
public static final String COLUMNNAME_WriteOffGain_Acct = "WriteOffGain_Acct";
/** Set Write Off Loss.
@param WriteOffLoss_Acct Write Off Loss */
public void setWriteOffLoss_Acct (int WriteOffLoss_Acct)
{
set_Value (COLUMNNAME_WriteOffLoss_Acct, Integer.valueOf(WriteOffLoss_Acct));
}
/** Get Write Off Loss.
@return Write Off Loss */
public int getWriteOffLoss_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_WriteOffLoss_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a0eec937-8bd8-7c02-f686-cbe7360b4203")
public static String es_PE_FIELD_Accounting_WriteOffLoss_Name="Ajustes Pérdida";

@XendraField(AD_Column_ID="WriteOffLoss_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="c4f152c8-6011-43d2-a6f0-343e1b262255",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a0eec937-8bd8-7c02-f686-cbe7360b4203")
public static final String FIELDNAME_Accounting_WriteOffLoss="a0eec937-8bd8-7c02-f686-cbe7360b4203";

@XendraTrl(Identifier="b09aec9c-a3a4-8fa5-fee3-10bdf252b0d9")
public static String es_PE_COLUMN_WriteOffLoss_Acct_Name="Write Off Loss";

@XendraColumn(AD_Element_ID="ff746bbd-0d5e-ba72-adff-544de8c5e373",ColumnName="WriteOffLoss_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b09aec9c-a3a4-8fa5-fee3-10bdf252b0d9",
Synchronized="2019-08-30 22:21:15.0")
/** Column name WriteOffLoss_Acct */
public static final String COLUMNNAME_WriteOffLoss_Acct = "WriteOffLoss_Acct";
}
