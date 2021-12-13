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
/** Generated Model for C_AcctSchema_Default
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_AcctSchema_Default extends PO
{
/** Standard Constructor
@param ctx context
@param C_AcctSchema_Default_ID id
@param trxName transaction
*/
public X_C_AcctSchema_Default (Properties ctx, int C_AcctSchema_Default_ID, String trxName)
{
super (ctx, C_AcctSchema_Default_ID, trxName);
/** if (C_AcctSchema_Default_ID == 0)
{
setB_Asset_Acct (0);
setB_Expense_Acct (0);
setB_InterestExp_Acct (0);
setB_InterestRev_Acct (0);
setB_InTransit_Acct (0);
setB_PaymentSelect_Acct (0);
setB_RevaluationGain_Acct (0);
setB_RevaluationLoss_Acct (0);
setB_SettlementGain_Acct (0);
setB_SettlementLoss_Acct (0);
setB_UnallocatedCash_Acct (0);
setB_Unidentified_Acct (0);
setC_AcctSchema_ID (0);
setCB_Asset_Acct (0);
setCB_CashTransfer_Acct (0);
setCB_Differences_Acct (0);
setCB_Expense_Acct (0);
setCB_Receipt_Acct (0);
setCh_Expense_Acct (0);
setCh_Revenue_Acct (0);
setC_Prepayment_Acct (0);
setC_Receivable_Acct (0);
setC_Receivable_Services_Acct (0);
setE_Expense_Acct (0);
setE_Prepayment_Acct (0);
setNotInvoicedReceipts_Acct (0);
setNotInvoicedReceivables_Acct (0);
setNotInvoicedRevenue_Acct (0);
setP_Asset_Acct (0);
setPayDiscount_Exp_Acct (0);
setPayDiscount_Rev_Acct (0);
setP_COGS_Acct (0);
setP_CostAdjustment_Acct (0);
setP_Expense_Acct (0);
setP_InventoryClearing_Acct (0);
setP_InvoicePriceVariance_Acct (0);
setPJ_Asset_Acct (0);
setPJ_WIP_Acct (0);
setP_PurchasePriceVariance_Acct (0);
setP_Revenue_Acct (0);
setP_TradeDiscountGrant_Acct (0);
setP_TradeDiscountRec_Acct (0);
setRealizedGain_Acct (0);
setRealizedLoss_Acct (0);
setT_Credit_Acct (0);
setT_Due_Acct (0);
setT_Expense_Acct (0);
setT_Liability_Acct (0);
setT_Receivables_Acct (0);
setUnEarnedRevenue_Acct (0);
setUnrealizedGain_Acct (0);
setUnrealizedLoss_Acct (0);
setV_Liability_Acct (0);
setV_Liability_Services_Acct (0);
setV_Prepayment_Acct (0);
setW_Differences_Acct (0);
setW_InvActualAdjust_Acct (0);
setW_Inventory_Acct (0);
setWithholding_Acct (0);
setW_Revaluation_Acct (0);
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
public X_C_AcctSchema_Default (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=315 */
public static int Table_ID=MTable.getTable_ID("C_AcctSchema_Default");

@XendraTrl(Identifier="dd25cc85-815f-406f-ad6e-9021ce5214b7")
public static String es_PE_TAB_Defaults_Description="Cuentas Predeterminadas";

@XendraTrl(Identifier="dd25cc85-815f-406f-ad6e-9021ce5214b7")
public static String es_PE_TAB_Defaults_Help="La pestaña de Predeterminados despliega las cuentas predeterminadas para un esquema contable. Estos valores se despliegan cuando una nueva cuenta es creada. El usuario puede cambiar estos valores predeterminados en los diferentes documentos donde se usan.";

@XendraTrl(Identifier="dd25cc85-815f-406f-ad6e-9021ce5214b7")
public static String es_PE_TAB_Defaults_Name="Predeterminados";
@XendraTab(Name="Defaults",
Description="Default Accounts",
Help="The Defaults Tab displays the Default accounts for an Accounting Schema.  These values will display when a new document is opened.  The user can override these defaults within the document.",
AD_Window_ID="1d20d4ab-6f93-65b5-6cbb-44da46ec6819",SeqNo=40,TabLevel=1,IsSingleRow=true,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="52c85243-a22b-7c63-848d-f1c61484bceb",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="dd25cc85-815f-406f-ad6e-9021ce5214b7",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Defaults="dd25cc85-815f-406f-ad6e-9021ce5214b7";

@XendraTrl(Identifier="bc8e8ba6-3513-8fd4-346d-fcb547ce295a")
public static String es_PE_TABLE_C_AcctSchema_Default_Name="C_AcctSchema_Default";

@XendraTable(Name="C_AcctSchema_Default",AD_Package_ID="2ac04657-d663-47c2-4ec1-927ad71f1e96",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="C_AcctSchema_Default",AccessLevel="2",
AD_Window_ID="1d20d4ab-6f93-65b5-6cbb-44da46ec6819",AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.accounting",Identifier="bc8e8ba6-3513-8fd4-346d-fcb547ce295a",
Synchronized="2020-03-03 21:36:22.0")
/** TableName=C_AcctSchema_Default */
public static final String Table_Name="C_AcctSchema_Default";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_AcctSchema_Default");

protected BigDecimal accessLevel = BigDecimal.valueOf(2);
/** AccessLevel
@return 2 - Client 
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
    Table_ID = MTable.getTable_ID("C_AcctSchema_Default");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_AcctSchema_Default[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Bank Asset.
@param B_Asset_Acct Bank Asset Account */
public void setB_Asset_Acct (int B_Asset_Acct)
{
set_Value (COLUMNNAME_B_Asset_Acct, Integer.valueOf(B_Asset_Acct));
}
/** Get Bank Asset.
@return Bank Asset Account */
public int getB_Asset_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_B_Asset_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e3c1d920-0ca6-01a5-44b4-1a23b71addee")
public static String es_PE_FIELD_Defaults_BankAsset_Name="Bancos";

@XendraTrl(Identifier="e3c1d920-0ca6-01a5-44b4-1a23b71addee")
public static String es_PE_FIELD_Defaults_BankAsset_Description="Cuenta de Bancos";

@XendraTrl(Identifier="e3c1d920-0ca6-01a5-44b4-1a23b71addee")
public static String es_PE_FIELD_Defaults_BankAsset_Help="La Cuenta de Bancos identifica la cuenta a ser usada para cambios en libros a los saldos en esta cuenta bancaria";

@XendraField(AD_Column_ID="B_Asset_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Bank",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=360,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e3c1d920-0ca6-01a5-44b4-1a23b71addee")
public static final String FIELDNAME_Defaults_BankAsset="e3c1d920-0ca6-01a5-44b4-1a23b71addee";

@XendraTrl(Identifier="a0c88731-a34e-7667-57e4-4279c5b6e1a6")
public static String es_PE_COLUMN_B_Asset_Acct_Name="Bancos";

@XendraColumn(AD_Element_ID="42d393bb-86bc-06af-0a4c-c0c93f58ee2e",ColumnName="B_Asset_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a0c88731-a34e-7667-57e4-4279c5b6e1a6",
Synchronized="2019-08-30 22:20:59.0")
/** Column name B_Asset_Acct */
public static final String COLUMNNAME_B_Asset_Acct = "B_Asset_Acct";
/** Set Bank Expense.
@param B_Expense_Acct Bank Expense Account */
public void setB_Expense_Acct (int B_Expense_Acct)
{
set_Value (COLUMNNAME_B_Expense_Acct, Integer.valueOf(B_Expense_Acct));
}
/** Get Bank Expense.
@return Bank Expense Account */
public int getB_Expense_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_B_Expense_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8e36479a-06b5-b468-f0dd-0766fecfabdb")
public static String es_PE_FIELD_Defaults_BankExpense_Name="Gastos Bancarios";

@XendraTrl(Identifier="8e36479a-06b5-b468-f0dd-0766fecfabdb")
public static String es_PE_FIELD_Defaults_BankExpense_Description="Cuenta de gastos bancarios";

@XendraTrl(Identifier="8e36479a-06b5-b468-f0dd-0766fecfabdb")
public static String es_PE_FIELD_Defaults_BankExpense_Help="La Cuenta de Gastos Bancarios identifica la cuenta a ser usada para registrar cargos ó tarifas incurridas desde este banco.";

@XendraField(AD_Column_ID="B_Expense_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Bank",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=410,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8e36479a-06b5-b468-f0dd-0766fecfabdb")
public static final String FIELDNAME_Defaults_BankExpense="8e36479a-06b5-b468-f0dd-0766fecfabdb";

@XendraTrl(Identifier="9b1cd37d-089f-5ba6-971e-1bce6ec0847f")
public static String es_PE_COLUMN_B_Expense_Acct_Name="Gastos Bancarios";

@XendraColumn(AD_Element_ID="2de32a53-55f1-0010-c014-3bbf9515755f",ColumnName="B_Expense_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9b1cd37d-089f-5ba6-971e-1bce6ec0847f",
Synchronized="2019-08-30 22:20:59.0")
/** Column name B_Expense_Acct */
public static final String COLUMNNAME_B_Expense_Acct = "B_Expense_Acct";
/** Set Bank Interest Expense.
@param B_InterestExp_Acct Bank Interest Expense Account */
public void setB_InterestExp_Acct (int B_InterestExp_Acct)
{
set_Value (COLUMNNAME_B_InterestExp_Acct, Integer.valueOf(B_InterestExp_Acct));
}
/** Get Bank Interest Expense.
@return Bank Interest Expense Account */
public int getB_InterestExp_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_B_InterestExp_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e617076a-acf6-9c5c-b4c8-597bfba19db9")
public static String es_PE_FIELD_Defaults_BankInterestExpense_Name="Gastos por Intereses Bancarios";

@XendraTrl(Identifier="e617076a-acf6-9c5c-b4c8-597bfba19db9")
public static String es_PE_FIELD_Defaults_BankInterestExpense_Description="Cuenta de Intereses Pagados";

@XendraTrl(Identifier="e617076a-acf6-9c5c-b4c8-597bfba19db9")
public static String es_PE_FIELD_Defaults_BankInterestExpense_Help="La Cuenta Intereses Bancarios identifica la cuenta a ser usada para registrar gastos de intereses";

@XendraField(AD_Column_ID="B_InterestExp_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Bank",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=420,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e617076a-acf6-9c5c-b4c8-597bfba19db9")
public static final String FIELDNAME_Defaults_BankInterestExpense="e617076a-acf6-9c5c-b4c8-597bfba19db9";

@XendraTrl(Identifier="f380b355-b1ae-f97b-3810-2fea578ecb5d")
public static String es_PE_COLUMN_B_InterestExp_Acct_Name="Gastos por Intereses Bancarios";

@XendraColumn(AD_Element_ID="92812cc3-c5f5-c8bf-36cb-5d6c7cf9ccf6",ColumnName="B_InterestExp_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f380b355-b1ae-f97b-3810-2fea578ecb5d",
Synchronized="2019-08-30 22:20:59.0")
/** Column name B_InterestExp_Acct */
public static final String COLUMNNAME_B_InterestExp_Acct = "B_InterestExp_Acct";
/** Set Bank Interest Revenue.
@param B_InterestRev_Acct Bank Interest Revenue Account */
public void setB_InterestRev_Acct (int B_InterestRev_Acct)
{
set_Value (COLUMNNAME_B_InterestRev_Acct, Integer.valueOf(B_InterestRev_Acct));
}
/** Get Bank Interest Revenue.
@return Bank Interest Revenue Account */
public int getB_InterestRev_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_B_InterestRev_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="862606d2-718f-4a53-8b4b-82fc80e78efb")
public static String es_PE_FIELD_Defaults_BankInterestRevenue_Name="Ingresos por Intereses Bancarios";

@XendraTrl(Identifier="862606d2-718f-4a53-8b4b-82fc80e78efb")
public static String es_PE_FIELD_Defaults_BankInterestRevenue_Description="Cuenta de ingresos por intereses bancarios.";

@XendraTrl(Identifier="862606d2-718f-4a53-8b4b-82fc80e78efb")
public static String es_PE_FIELD_Defaults_BankInterestRevenue_Help="La cuenta de ingresos por intereses bancarios identifica la cuenta a ser usada para registrar ingresos de intereses de este banco.";

@XendraField(AD_Column_ID="B_InterestRev_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Bank",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=430,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="862606d2-718f-4a53-8b4b-82fc80e78efb")
public static final String FIELDNAME_Defaults_BankInterestRevenue="862606d2-718f-4a53-8b4b-82fc80e78efb";

@XendraTrl(Identifier="ce6839ba-8e4e-8a51-3d13-924f9f64e5cd")
public static String es_PE_COLUMN_B_InterestRev_Acct_Name="Ingresos por Intereses Bancarios";

@XendraColumn(AD_Element_ID="5f4277f1-1bdf-1e0a-aa2a-0418489575d5",ColumnName="B_InterestRev_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ce6839ba-8e4e-8a51-3d13-924f9f64e5cd",
Synchronized="2019-08-30 22:20:59.0")
/** Column name B_InterestRev_Acct */
public static final String COLUMNNAME_B_InterestRev_Acct = "B_InterestRev_Acct";
/** Set Bank In Transit.
@param B_InTransit_Acct Bank In Transit Account */
public void setB_InTransit_Acct (int B_InTransit_Acct)
{
set_Value (COLUMNNAME_B_InTransit_Acct, Integer.valueOf(B_InTransit_Acct));
}
/** Get Bank In Transit.
@return Bank In Transit Account */
public int getB_InTransit_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_B_InTransit_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="681a374c-49b7-f986-c1f4-df2e8b12dcbd")
public static String es_PE_FIELD_Defaults_BankInTransit_Name="Cuenta de Pagos en Tránsito";

@XendraTrl(Identifier="681a374c-49b7-f986-c1f4-df2e8b12dcbd")
public static String es_PE_FIELD_Defaults_BankInTransit_Description="Cuenta de pagos en tránsito";

@XendraTrl(Identifier="681a374c-49b7-f986-c1f4-df2e8b12dcbd")
public static String es_PE_FIELD_Defaults_BankInTransit_Help="La cuenta banco en tránsito identifica la cuenta a ser usada para fondos que están en tránsito";

@XendraField(AD_Column_ID="B_InTransit_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Bank",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=370,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="681a374c-49b7-f986-c1f4-df2e8b12dcbd")
public static final String FIELDNAME_Defaults_BankInTransit="681a374c-49b7-f986-c1f4-df2e8b12dcbd";

@XendraTrl(Identifier="821e149a-c407-1a09-07f4-4eec362cc37d")
public static String es_PE_COLUMN_B_InTransit_Acct_Name="Cuenta de Pagos en Tránsito";

@XendraColumn(AD_Element_ID="dd7e2b96-46a2-fe8e-6fc2-b3e7dad6059c",ColumnName="B_InTransit_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="821e149a-c407-1a09-07f4-4eec362cc37d",
Synchronized="2019-08-30 22:20:59.0")
/** Column name B_InTransit_Acct */
public static final String COLUMNNAME_B_InTransit_Acct = "B_InTransit_Acct";
/** Set Boe_Acct.
@param Boe_Acct Boe_Acct */
public void setBoe_Acct (int Boe_Acct)
{
set_Value (COLUMNNAME_Boe_Acct, Integer.valueOf(Boe_Acct));
}
/** Get Boe_Acct.
@return Boe_Acct */
public int getBoe_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Boe_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fa9d105a-6766-4f8c-a334-b19a8ee5e3b7")
public static String es_PE_COLUMN_Boe_Acct_Name="Boe_Acct";

@XendraColumn(AD_Element_ID="78879dbb-e69e-43b9-b422-950c2e01634e",ColumnName="Boe_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fa9d105a-6766-4f8c-a334-b19a8ee5e3b7",
Synchronized="2019-08-30 22:20:59.0")
/** Column name Boe_Acct */
public static final String COLUMNNAME_Boe_Acct = "Boe_Acct";
/** Set BOE_Confirm_Acct.
@param BOE_Confirm_Acct BOE_Confirm_Acct */
public void setBOE_Confirm_Acct (int BOE_Confirm_Acct)
{
set_Value (COLUMNNAME_BOE_Confirm_Acct, Integer.valueOf(BOE_Confirm_Acct));
}
/** Get BOE_Confirm_Acct.
@return BOE_Confirm_Acct */
public int getBOE_Confirm_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_BOE_Confirm_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="afa1ec86-edd3-ec50-aa27-cd047a578e17")
public static String es_PE_FIELD_Defaults_BOE_Confirm_Acct_Name="Plla de Letra";

@XendraField(AD_Column_ID="BOE_Confirm_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Boe",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=710,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="afa1ec86-edd3-ec50-aa27-cd047a578e17")
public static final String FIELDNAME_Defaults_BOE_Confirm_Acct="afa1ec86-edd3-ec50-aa27-cd047a578e17";

@XendraTrl(Identifier="84986661-6dc9-7140-08c5-fbcd372a03f3")
public static String es_PE_COLUMN_BOE_Confirm_Acct_Name="boe_confirm_acct";

@XendraColumn(AD_Element_ID="198a83eb-d96e-43ac-e04f-dacbb2ebb44a",ColumnName="BOE_Confirm_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="84986661-6dc9-7140-08c5-fbcd372a03f3",
Synchronized="2019-08-30 22:20:59.0")
/** Column name BOE_Confirm_Acct */
public static final String COLUMNNAME_BOE_Confirm_Acct = "BOE_Confirm_Acct";
/** Set BOE_Discount_Acct.
@param BOE_Discount_Acct BOE_Discount_Acct */
public void setBOE_Discount_Acct (int BOE_Discount_Acct)
{
set_Value (COLUMNNAME_BOE_Discount_Acct, Integer.valueOf(BOE_Discount_Acct));
}
/** Get BOE_Discount_Acct.
@return BOE_Discount_Acct */
public int getBOE_Discount_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_BOE_Discount_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="63f25dd9-7d9a-37cd-d49c-e9d600002aa2")
public static String es_PE_FIELD_Defaults_BOE_Discount_Acct_Name="En Descuento";

@XendraField(AD_Column_ID="BOE_Discount_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Boe",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=670,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="63f25dd9-7d9a-37cd-d49c-e9d600002aa2")
public static final String FIELDNAME_Defaults_BOE_Discount_Acct="63f25dd9-7d9a-37cd-d49c-e9d600002aa2";

@XendraTrl(Identifier="99acb800-a999-eaee-e1b3-daf0b6a75130")
public static String es_PE_COLUMN_BOE_Discount_Acct_Name="boe_discount_acct";

@XendraColumn(AD_Element_ID="3503a407-d579-dfde-64cb-2a8c12037352",ColumnName="BOE_Discount_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="99acb800-a999-eaee-e1b3-daf0b6a75130",
Synchronized="2019-08-30 22:20:59.0")
/** Column name BOE_Discount_Acct */
public static final String COLUMNNAME_BOE_Discount_Acct = "BOE_Discount_Acct";
/** Set BOE_Portfolio_Acct.
@param BOE_Portfolio_Acct BOE_Portfolio_Acct */
public void setBOE_Portfolio_Acct (int BOE_Portfolio_Acct)
{
set_Value (COLUMNNAME_BOE_Portfolio_Acct, Integer.valueOf(BOE_Portfolio_Acct));
}
/** Get BOE_Portfolio_Acct.
@return BOE_Portfolio_Acct */
public int getBOE_Portfolio_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_BOE_Portfolio_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f29b8dea-be4a-ad3f-07b5-d73354bb146a")
public static String es_PE_FIELD_Defaults_BOE_Portfolio_Acct_Name="En Portafolio";

@XendraField(AD_Column_ID="BOE_Portfolio_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Boe",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=650,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f29b8dea-be4a-ad3f-07b5-d73354bb146a")
public static final String FIELDNAME_Defaults_BOE_Portfolio_Acct="f29b8dea-be4a-ad3f-07b5-d73354bb146a";

@XendraTrl(Identifier="3cb37297-35b7-7081-457c-89a5bd4af323")
public static String es_PE_COLUMN_BOE_Portfolio_Acct_Name="boe_portfolio_acct";

@XendraColumn(AD_Element_ID="faa5725b-53e5-cf39-01be-787e85b9d575",ColumnName="BOE_Portfolio_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3cb37297-35b7-7081-457c-89a5bd4af323",
Synchronized="2019-08-30 22:20:59.0")
/** Column name BOE_Portfolio_Acct */
public static final String COLUMNNAME_BOE_Portfolio_Acct = "BOE_Portfolio_Acct";
/** Set BOE_Protested_Acct.
@param BOE_Protested_Acct BOE_Protested_Acct */
public void setBOE_Protested_Acct (int BOE_Protested_Acct)
{
set_Value (COLUMNNAME_BOE_Protested_Acct, Integer.valueOf(BOE_Protested_Acct));
}
/** Get BOE_Protested_Acct.
@return BOE_Protested_Acct */
public int getBOE_Protested_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_BOE_Protested_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6446903c-b818-a0f2-9c76-f661afa406b1")
public static String es_PE_FIELD_Defaults_BOE_Protested_Acct_Name="Protestada";

@XendraField(AD_Column_ID="BOE_Protested_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Boe",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=690,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6446903c-b818-a0f2-9c76-f661afa406b1")
public static final String FIELDNAME_Defaults_BOE_Protested_Acct="6446903c-b818-a0f2-9c76-f661afa406b1";

@XendraTrl(Identifier="57cbad93-e593-4463-68b9-25f02fb7327b")
public static String es_PE_COLUMN_BOE_Protested_Acct_Name="boe_protested_acct";

@XendraColumn(AD_Element_ID="f9e6f145-286a-8ede-1d92-e2d95d73f2cd",ColumnName="BOE_Protested_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="57cbad93-e593-4463-68b9-25f02fb7327b",
Synchronized="2019-08-30 22:20:59.0")
/** Column name BOE_Protested_Acct */
public static final String COLUMNNAME_BOE_Protested_Acct = "BOE_Protested_Acct";
/** Set BOE_Receivables_Acct.
@param BOE_Receivables_Acct BOE_Receivables_Acct */
public void setBOE_Receivables_Acct (int BOE_Receivables_Acct)
{
set_Value (COLUMNNAME_BOE_Receivables_Acct, Integer.valueOf(BOE_Receivables_Acct));
}
/** Get BOE_Receivables_Acct.
@return BOE_Receivables_Acct */
public int getBOE_Receivables_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_BOE_Receivables_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="45c7ad91-3cb2-e9ca-398e-00e1edd5ddeb")
public static String es_PE_FIELD_Defaults_BOE_Receivables_Acct_Name="En Cobranza";

@XendraField(AD_Column_ID="BOE_Receivables_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Boe",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=660,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="45c7ad91-3cb2-e9ca-398e-00e1edd5ddeb")
public static final String FIELDNAME_Defaults_BOE_Receivables_Acct="45c7ad91-3cb2-e9ca-398e-00e1edd5ddeb";

@XendraTrl(Identifier="a910f592-43db-98e1-f526-f55113c16342")
public static String es_PE_COLUMN_BOE_Receivables_Acct_Name="boe_receivables_acct";

@XendraColumn(AD_Element_ID="708648d2-902e-94e8-377f-457403cac9a3",
ColumnName="BOE_Receivables_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a910f592-43db-98e1-f526-f55113c16342",Synchronized="2019-08-30 22:21:00.0")
/** Column name BOE_Receivables_Acct */
public static final String COLUMNNAME_BOE_Receivables_Acct = "BOE_Receivables_Acct";
/** Set BOE_Vendor_Acct.
@param BOE_Vendor_Acct BOE_Vendor_Acct */
public void setBOE_Vendor_Acct (int BOE_Vendor_Acct)
{
set_Value (COLUMNNAME_BOE_Vendor_Acct, Integer.valueOf(BOE_Vendor_Acct));
}
/** Get BOE_Vendor_Acct.
@return BOE_Vendor_Acct */
public int getBOE_Vendor_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_BOE_Vendor_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0ea8740a-220b-f770-ed8f-7cd92e5bf428")
public static String es_PE_FIELD_Defaults_BOE_Vendor_Acct_Name="Letra Proveedor";

@XendraField(AD_Column_ID="BOE_Vendor_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Boe",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=700,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0ea8740a-220b-f770-ed8f-7cd92e5bf428")
public static final String FIELDNAME_Defaults_BOE_Vendor_Acct="0ea8740a-220b-f770-ed8f-7cd92e5bf428";

@XendraTrl(Identifier="e5c60735-d1ca-911c-5eb1-3aceec7f46db")
public static String es_PE_COLUMN_BOE_Vendor_Acct_Name="boe_vendor_acct";

@XendraColumn(AD_Element_ID="d5ca5a84-d87e-c994-d2be-7a0f04e03922",ColumnName="BOE_Vendor_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e5c60735-d1ca-911c-5eb1-3aceec7f46db",
Synchronized="2019-08-30 22:21:00.0")
/** Column name BOE_Vendor_Acct */
public static final String COLUMNNAME_BOE_Vendor_Acct = "BOE_Vendor_Acct";
/** Set BOE_Warranty_Acct.
@param BOE_Warranty_Acct BOE_Warranty_Acct */
public void setBOE_Warranty_Acct (int BOE_Warranty_Acct)
{
set_Value (COLUMNNAME_BOE_Warranty_Acct, Integer.valueOf(BOE_Warranty_Acct));
}
/** Get BOE_Warranty_Acct.
@return BOE_Warranty_Acct */
public int getBOE_Warranty_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_BOE_Warranty_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3a45dc91-dab0-4909-fb5d-1cb1b677275b")
public static String es_PE_FIELD_Defaults_BOE_Warranty_Acct_Name="En Garantía";

@XendraField(AD_Column_ID="BOE_Warranty_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Boe",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=680,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3a45dc91-dab0-4909-fb5d-1cb1b677275b")
public static final String FIELDNAME_Defaults_BOE_Warranty_Acct="3a45dc91-dab0-4909-fb5d-1cb1b677275b";

@XendraTrl(Identifier="f043ee65-b7af-dd3d-9acb-7c2a485ade97")
public static String es_PE_COLUMN_BOE_Warranty_Acct_Name="boe_warranty_acct";

@XendraColumn(AD_Element_ID="731dad94-baf8-75f2-d4cc-8e21723ded92",ColumnName="BOE_Warranty_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f043ee65-b7af-dd3d-9acb-7c2a485ade97",
Synchronized="2019-08-30 22:21:00.0")
/** Column name BOE_Warranty_Acct */
public static final String COLUMNNAME_BOE_Warranty_Acct = "BOE_Warranty_Acct";
/** Set Payment Selection.
@param B_PaymentSelect_Acct AP Payment Selection Clearing Account */
public void setB_PaymentSelect_Acct (int B_PaymentSelect_Acct)
{
set_Value (COLUMNNAME_B_PaymentSelect_Acct, Integer.valueOf(B_PaymentSelect_Acct));
}
/** Get Payment Selection.
@return AP Payment Selection Clearing Account */
public int getB_PaymentSelect_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_B_PaymentSelect_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1f6a7002-2064-97c1-2e66-e6d85b1c9345")
public static String es_PE_FIELD_Defaults_PaymentSelection_Name="Selección de Pagos";

@XendraTrl(Identifier="1f6a7002-2064-97c1-2e66-e6d85b1c9345")
public static String es_PE_FIELD_Defaults_PaymentSelection_Description="Cuenta de limpieza de selección de pagos de Cuentas por Pagar";

@XendraField(AD_Column_ID="B_PaymentSelect_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Bank",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=400,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1f6a7002-2064-97c1-2e66-e6d85b1c9345")
public static final String FIELDNAME_Defaults_PaymentSelection="1f6a7002-2064-97c1-2e66-e6d85b1c9345";

@XendraTrl(Identifier="1c7da984-d632-1664-29aa-ee64831bfa17")
public static String es_PE_COLUMN_B_PaymentSelect_Acct_Name="Selección de Pagos";

@XendraColumn(AD_Element_ID="678a5c81-2ff8-177f-a0da-71224d82ba15",
ColumnName="B_PaymentSelect_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="1c7da984-d632-1664-29aa-ee64831bfa17",Synchronized="2019-08-30 22:21:00.0")
/** Column name B_PaymentSelect_Acct */
public static final String COLUMNNAME_B_PaymentSelect_Acct = "B_PaymentSelect_Acct";
/** Set Bank Revaluation Gain.
@param B_RevaluationGain_Acct Bank Revaluation Gain Account */
public void setB_RevaluationGain_Acct (int B_RevaluationGain_Acct)
{
set_Value (COLUMNNAME_B_RevaluationGain_Acct, Integer.valueOf(B_RevaluationGain_Acct));
}
/** Get Bank Revaluation Gain.
@return Bank Revaluation Gain Account */
public int getB_RevaluationGain_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_B_RevaluationGain_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="604d3d01-8b5c-c692-3ca7-8c82dd04ddcc")
public static String es_PE_FIELD_Defaults_BankRevaluationGain_Name="Cuenta de Ganancias por Reevaluación (Bancos)";

@XendraTrl(Identifier="604d3d01-8b5c-c692-3ca7-8c82dd04ddcc")
public static String es_PE_FIELD_Defaults_BankRevaluationGain_Description="Cuenta de ganancias por reevaluación (Bancos)";

@XendraTrl(Identifier="604d3d01-8b5c-c692-3ca7-8c82dd04ddcc")
public static String es_PE_FIELD_Defaults_BankRevaluationGain_Help="La cuenta de ganancias por reevaluación en bancos identifica la cuenta a ser usada para registrar ganancias que son reconocidas cuando se convierten las monedas";

@XendraField(AD_Column_ID="B_RevaluationGain_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Bank",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=440,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="604d3d01-8b5c-c692-3ca7-8c82dd04ddcc")
public static final String FIELDNAME_Defaults_BankRevaluationGain="604d3d01-8b5c-c692-3ca7-8c82dd04ddcc";

@XendraTrl(Identifier="038f5b12-6989-beba-d9f4-bb31141f2825")
public static String es_PE_COLUMN_B_RevaluationGain_Acct_Name="Cuenta de Ganancias por Reevaluación (Bancos)";

@XendraColumn(AD_Element_ID="413aa737-11c8-247d-e1d9-cfe273936e9c",
ColumnName="B_RevaluationGain_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="038f5b12-6989-beba-d9f4-bb31141f2825",Synchronized="2019-08-30 22:21:00.0")
/** Column name B_RevaluationGain_Acct */
public static final String COLUMNNAME_B_RevaluationGain_Acct = "B_RevaluationGain_Acct";
/** Set Bank Revaluation Loss.
@param B_RevaluationLoss_Acct Bank Revaluation Loss Account */
public void setB_RevaluationLoss_Acct (int B_RevaluationLoss_Acct)
{
set_Value (COLUMNNAME_B_RevaluationLoss_Acct, Integer.valueOf(B_RevaluationLoss_Acct));
}
/** Get Bank Revaluation Loss.
@return Bank Revaluation Loss Account */
public int getB_RevaluationLoss_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_B_RevaluationLoss_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="346b3a4d-24c0-e78f-7653-7208d6375f02")
public static String es_PE_FIELD_Defaults_BankRevaluationLoss_Name="Cuenta de Pérdida por Reevaluación (Bancos)";

@XendraTrl(Identifier="346b3a4d-24c0-e78f-7653-7208d6375f02")
public static String es_PE_FIELD_Defaults_BankRevaluationLoss_Description="Cuenta de pérdida por reevaluación (Bancos)";

@XendraTrl(Identifier="346b3a4d-24c0-e78f-7653-7208d6375f02")
public static String es_PE_FIELD_Defaults_BankRevaluationLoss_Help="La cuenta de pérdidas por reevaluación en bancos identifica la cuenta a ser usada para registrar pérdidas que son reconocidas cuando se convierten las monedas";

@XendraField(AD_Column_ID="B_RevaluationLoss_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Bank",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=450,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="346b3a4d-24c0-e78f-7653-7208d6375f02")
public static final String FIELDNAME_Defaults_BankRevaluationLoss="346b3a4d-24c0-e78f-7653-7208d6375f02";

@XendraTrl(Identifier="3668628e-b7ae-5833-c5b2-adba45f691a9")
public static String es_PE_COLUMN_B_RevaluationLoss_Acct_Name="Cuenta de Pérdida por Reevaluación (Bancos)";

@XendraColumn(AD_Element_ID="2453ca7e-30f0-b91a-386e-1bb02867d729",
ColumnName="B_RevaluationLoss_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3668628e-b7ae-5833-c5b2-adba45f691a9",Synchronized="2019-08-30 22:21:00.0")
/** Column name B_RevaluationLoss_Acct */
public static final String COLUMNNAME_B_RevaluationLoss_Acct = "B_RevaluationLoss_Acct";
/** Set Bank Settlement Gain.
@param B_SettlementGain_Acct Bank Settlement Gain Account */
public void setB_SettlementGain_Acct (int B_SettlementGain_Acct)
{
set_Value (COLUMNNAME_B_SettlementGain_Acct, Integer.valueOf(B_SettlementGain_Acct));
}
/** Get Bank Settlement Gain.
@return Bank Settlement Gain Account */
public int getB_SettlementGain_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_B_SettlementGain_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3ab49515-f9d9-47c5-b23f-30e1aeaad38d")
public static String es_PE_FIELD_Defaults_BankSettlementGain_Name="Cuenta de Ganancia por Ajuste";

@XendraTrl(Identifier="3ab49515-f9d9-47c5-b23f-30e1aeaad38d")
public static String es_PE_FIELD_Defaults_BankSettlementGain_Description="Cuenta de ganancia por ajuste";

@XendraTrl(Identifier="3ab49515-f9d9-47c5-b23f-30e1aeaad38d")
public static String es_PE_FIELD_Defaults_BankSettlementGain_Help="La cuenta de ganancia por ajuste identifica la cuenta a ser usada cuando se registra la ganancia por moneda cuando la moneda de ajuste y recibo no son las mismas";

@XendraField(AD_Column_ID="B_SettlementGain_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Bank",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=470,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3ab49515-f9d9-47c5-b23f-30e1aeaad38d")
public static final String FIELDNAME_Defaults_BankSettlementGain="3ab49515-f9d9-47c5-b23f-30e1aeaad38d";

@XendraTrl(Identifier="6390d959-959b-e14a-e987-e281b0aacd0e")
public static String es_PE_COLUMN_B_SettlementGain_Acct_Name="Cuenta de Ganancia por Ajuste";

@XendraColumn(AD_Element_ID="69484662-45d2-696e-4b4e-a08735ac114c",
ColumnName="B_SettlementGain_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6390d959-959b-e14a-e987-e281b0aacd0e",Synchronized="2019-08-30 22:21:00.0")
/** Column name B_SettlementGain_Acct */
public static final String COLUMNNAME_B_SettlementGain_Acct = "B_SettlementGain_Acct";
/** Set Bank Settlement Loss.
@param B_SettlementLoss_Acct Bank Settlement Loss Account */
public void setB_SettlementLoss_Acct (int B_SettlementLoss_Acct)
{
set_Value (COLUMNNAME_B_SettlementLoss_Acct, Integer.valueOf(B_SettlementLoss_Acct));
}
/** Get Bank Settlement Loss.
@return Bank Settlement Loss Account */
public int getB_SettlementLoss_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_B_SettlementLoss_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d723f4b9-74bd-07f3-8c9f-902927e3d07b")
public static String es_PE_FIELD_Defaults_BankSettlementLoss_Name="Cuenta de Pérdida por Ajuste";

@XendraTrl(Identifier="d723f4b9-74bd-07f3-8c9f-902927e3d07b")
public static String es_PE_FIELD_Defaults_BankSettlementLoss_Description="Cuenta de pérdida por ajuste";

@XendraTrl(Identifier="d723f4b9-74bd-07f3-8c9f-902927e3d07b")
public static String es_PE_FIELD_Defaults_BankSettlementLoss_Help="La cuenta de pérdida por ajuste identifica la cuenta a ser usada cuando se registra la pérdida por moneda cuando la moneda de ajuste y recibo no son las mismas";

@XendraField(AD_Column_ID="B_SettlementLoss_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Bank",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=460,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d723f4b9-74bd-07f3-8c9f-902927e3d07b")
public static final String FIELDNAME_Defaults_BankSettlementLoss="d723f4b9-74bd-07f3-8c9f-902927e3d07b";

@XendraTrl(Identifier="8b5daf94-b5c7-739a-f528-5b59ee4a1a9b")
public static String es_PE_COLUMN_B_SettlementLoss_Acct_Name="Cuenta de Pérdida por Ajuste";

@XendraColumn(AD_Element_ID="e5abee12-3aeb-2005-796f-d4b9a462d68c",
ColumnName="B_SettlementLoss_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8b5daf94-b5c7-739a-f528-5b59ee4a1a9b",Synchronized="2019-08-30 22:21:00.0")
/** Column name B_SettlementLoss_Acct */
public static final String COLUMNNAME_B_SettlementLoss_Acct = "B_SettlementLoss_Acct";
/** Set Unallocated Cash.
@param B_UnallocatedCash_Acct Unallocated Cash Clearing Account */
public void setB_UnallocatedCash_Acct (int B_UnallocatedCash_Acct)
{
set_Value (COLUMNNAME_B_UnallocatedCash_Acct, Integer.valueOf(B_UnallocatedCash_Acct));
}
/** Get Unallocated Cash.
@return Unallocated Cash Clearing Account */
public int getB_UnallocatedCash_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_B_UnallocatedCash_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fefcb640-ad2d-46db-51aa-3709b2c2a8e2")
public static String es_PE_FIELD_Defaults_UnallocatedCash_Name="Efectivo no asignado";

@XendraTrl(Identifier="fefcb640-ad2d-46db-51aa-3709b2c2a8e2")
public static String es_PE_FIELD_Defaults_UnallocatedCash_Description="Cuenta de limpieza para efectivo no asignado";

@XendraTrl(Identifier="fefcb640-ad2d-46db-51aa-3709b2c2a8e2")
public static String es_PE_FIELD_Defaults_UnallocatedCash_Help="Recibos no asignados a facturas";

@XendraField(AD_Column_ID="B_UnallocatedCash_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Bank",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=390,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fefcb640-ad2d-46db-51aa-3709b2c2a8e2")
public static final String FIELDNAME_Defaults_UnallocatedCash="fefcb640-ad2d-46db-51aa-3709b2c2a8e2";

@XendraTrl(Identifier="df26fb6e-b969-f156-5953-9b2ecf0c521f")
public static String es_PE_COLUMN_B_UnallocatedCash_Acct_Name="Efectivo no asignado";

@XendraColumn(AD_Element_ID="89dcf1cf-f1eb-937a-eeeb-3ee89dcbb735",
ColumnName="B_UnallocatedCash_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="df26fb6e-b969-f156-5953-9b2ecf0c521f",Synchronized="2019-08-30 22:21:00.0")
/** Column name B_UnallocatedCash_Acct */
public static final String COLUMNNAME_B_UnallocatedCash_Acct = "B_UnallocatedCash_Acct";
/** Set Bank Unidentified Receipts.
@param B_Unidentified_Acct Bank Unidentified Receipts Account */
public void setB_Unidentified_Acct (int B_Unidentified_Acct)
{
set_Value (COLUMNNAME_B_Unidentified_Acct, Integer.valueOf(B_Unidentified_Acct));
}
/** Get Bank Unidentified Receipts.
@return Bank Unidentified Receipts Account */
public int getB_Unidentified_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_B_Unidentified_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9e648be1-03b4-b908-f1bd-e62df2737799")
public static String es_PE_FIELD_Defaults_BankUnidentifiedReceipts_Name="Cuenta de Cobros no identificados";

@XendraTrl(Identifier="9e648be1-03b4-b908-f1bd-e62df2737799")
public static String es_PE_FIELD_Defaults_BankUnidentifiedReceipts_Description="Cuenta de Cobros no identificados";

@XendraTrl(Identifier="9e648be1-03b4-b908-f1bd-e62df2737799")
public static String es_PE_FIELD_Defaults_BankUnidentifiedReceipts_Help="La cuenta de cobros no identificados se refiere a la cuenta a ser usada cuando se registran los cobros que no pueden ser conciliados en el momento actual";

@XendraField(AD_Column_ID="B_Unidentified_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Bank",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=380,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9e648be1-03b4-b908-f1bd-e62df2737799")
public static final String FIELDNAME_Defaults_BankUnidentifiedReceipts="9e648be1-03b4-b908-f1bd-e62df2737799";

@XendraTrl(Identifier="5705fa5a-d9e5-d812-f6da-d7a6b8e2c344")
public static String es_PE_COLUMN_B_Unidentified_Acct_Name="Cuenta de Cobros no identificados";

@XendraColumn(AD_Element_ID="2ffafa86-2bd5-2404-84ed-12e76e62cf24",
ColumnName="B_Unidentified_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5705fa5a-d9e5-d812-f6da-d7a6b8e2c344",Synchronized="2019-08-30 22:21:00.0")
/** Column name B_Unidentified_Acct */
public static final String COLUMNNAME_B_Unidentified_Acct = "B_Unidentified_Acct";
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getC_AcctSchema_ID()));
}

@XendraTrl(Identifier="a795eb8c-3223-0391-16a1-e040d79c4286")
public static String es_PE_FIELD_Defaults_AccountingSchema_Name="Esquema Contable";

@XendraTrl(Identifier="a795eb8c-3223-0391-16a1-e040d79c4286")
public static String es_PE_FIELD_Defaults_AccountingSchema_Description="Reglas para contabilizar";

@XendraTrl(Identifier="a795eb8c-3223-0391-16a1-e040d79c4286")
public static String es_PE_FIELD_Defaults_AccountingSchema_Help="Un esquema contable define las reglas contables usadas tales como método de costeo; moneda y calendario";

@XendraField(AD_Column_ID="C_AcctSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a795eb8c-3223-0391-16a1-e040d79c4286")
public static final String FIELDNAME_Defaults_AccountingSchema="a795eb8c-3223-0391-16a1-e040d79c4286";

@XendraTrl(Identifier="52c85243-a22b-7c63-848d-f1c61484bceb")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="52c85243-a22b-7c63-848d-f1c61484bceb",
Synchronized="2019-08-30 22:21:00.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
/** Set Cash Book Asset.
@param CB_Asset_Acct Cash Book Asset Account */
public void setCB_Asset_Acct (int CB_Asset_Acct)
{
set_Value (COLUMNNAME_CB_Asset_Acct, Integer.valueOf(CB_Asset_Acct));
}
/** Get Cash Book Asset.
@return Cash Book Asset Account */
public int getCB_Asset_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_CB_Asset_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="aed7238f-4d16-fe29-c7bc-b74af0505a69")
public static String es_PE_FIELD_Defaults_CashBookAsset_Name="Cuenta de Activo del Libro de Efectivo";

@XendraTrl(Identifier="aed7238f-4d16-fe29-c7bc-b74af0505a69")
public static String es_PE_FIELD_Defaults_CashBookAsset_Description="Cuenta de Activo del Libro de Efectivo";

@XendraTrl(Identifier="aed7238f-4d16-fe29-c7bc-b74af0505a69")
public static String es_PE_FIELD_Defaults_CashBookAsset_Help="La cuenta de activo del libro de efectivo identifica la cuenta a ser usada para registrar cobros y pagos desde este libro de efectivo";

@XendraField(AD_Column_ID="CB_Asset_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Cash Book",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=600,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aed7238f-4d16-fe29-c7bc-b74af0505a69")
public static final String FIELDNAME_Defaults_CashBookAsset="aed7238f-4d16-fe29-c7bc-b74af0505a69";

@XendraTrl(Identifier="d361e6d9-acea-9ae6-8fc4-c8571aac1e76")
public static String es_PE_COLUMN_CB_Asset_Acct_Name="Cuenta de Activo del Libro de Efectivo";

@XendraColumn(AD_Element_ID="7b341ac3-e99f-5886-03e2-11e1af745bda",ColumnName="CB_Asset_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d361e6d9-acea-9ae6-8fc4-c8571aac1e76",
Synchronized="2019-08-30 22:21:00.0")
/** Column name CB_Asset_Acct */
public static final String COLUMNNAME_CB_Asset_Acct = "CB_Asset_Acct";
/** Set Cash Transfer.
@param CB_CashTransfer_Acct Cash Transfer Clearing Account */
public void setCB_CashTransfer_Acct (int CB_CashTransfer_Acct)
{
set_Value (COLUMNNAME_CB_CashTransfer_Acct, Integer.valueOf(CB_CashTransfer_Acct));
}
/** Get Cash Transfer.
@return Cash Transfer Clearing Account */
public int getCB_CashTransfer_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_CB_CashTransfer_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b6542b86-2fb5-0ee1-0bfd-22e1fefd7240")
public static String es_PE_FIELD_Defaults_CashTransfer_Name="Transferencia de Efectivo";

@XendraTrl(Identifier="b6542b86-2fb5-0ee1-0bfd-22e1fefd7240")
public static String es_PE_FIELD_Defaults_CashTransfer_Description="Cuenta de limpieza de transferencia de efectivo";

@XendraTrl(Identifier="b6542b86-2fb5-0ee1-0bfd-22e1fefd7240")
public static String es_PE_FIELD_Defaults_CashTransfer_Help="Cuenta para facturas pagadas en efectivo";

@XendraField(AD_Column_ID="CB_CashTransfer_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Cash Book",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=620,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b6542b86-2fb5-0ee1-0bfd-22e1fefd7240")
public static final String FIELDNAME_Defaults_CashTransfer="b6542b86-2fb5-0ee1-0bfd-22e1fefd7240";

@XendraTrl(Identifier="7e4d40bf-c790-965d-85df-4d6d07711ac3")
public static String es_PE_COLUMN_CB_CashTransfer_Acct_Name="Transferencia de Efectivo";

@XendraColumn(AD_Element_ID="cc342719-1636-2ccc-b84b-1726e559aa8b",
ColumnName="CB_CashTransfer_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7e4d40bf-c790-965d-85df-4d6d07711ac3",Synchronized="2019-08-30 22:21:00.0")
/** Column name CB_CashTransfer_Acct */
public static final String COLUMNNAME_CB_CashTransfer_Acct = "CB_CashTransfer_Acct";
/** Set Cash Book Differences.
@param CB_Differences_Acct Cash Book Differences Account */
public void setCB_Differences_Acct (int CB_Differences_Acct)
{
set_Value (COLUMNNAME_CB_Differences_Acct, Integer.valueOf(CB_Differences_Acct));
}
/** Get Cash Book Differences.
@return Cash Book Differences Account */
public int getCB_Differences_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_CB_Differences_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5a4c6eff-adfc-bd6e-7f31-7451fb7d0477")
public static String es_PE_FIELD_Defaults_CashBookDifferences_Name="Cuenta de Diferencias del Libro de Efectivo";

@XendraTrl(Identifier="5a4c6eff-adfc-bd6e-7f31-7451fb7d0477")
public static String es_PE_FIELD_Defaults_CashBookDifferences_Description="Cuenta de Diferencias del Libro de Efectivo";

@XendraTrl(Identifier="5a4c6eff-adfc-bd6e-7f31-7451fb7d0477")
public static String es_PE_FIELD_Defaults_CashBookDifferences_Help="La cuenta de diferencias en el libro de efectivo identifica la cuenta a ser usada para registrar cualquier diferencia que afecte este libro de efectivo";

@XendraField(AD_Column_ID="CB_Differences_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Cash Book",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=610,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5a4c6eff-adfc-bd6e-7f31-7451fb7d0477")
public static final String FIELDNAME_Defaults_CashBookDifferences="5a4c6eff-adfc-bd6e-7f31-7451fb7d0477";

@XendraTrl(Identifier="6dea7796-7daf-8ca1-3613-490f29164e99")
public static String es_PE_COLUMN_CB_Differences_Acct_Name="Cuenta de Diferencias del Libro de Efectivo";

@XendraColumn(AD_Element_ID="67449829-1714-b645-815c-524e4e927b13",
ColumnName="CB_Differences_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6dea7796-7daf-8ca1-3613-490f29164e99",Synchronized="2019-08-30 22:21:00.0")
/** Column name CB_Differences_Acct */
public static final String COLUMNNAME_CB_Differences_Acct = "CB_Differences_Acct";
/** Set Cash Book Expense.
@param CB_Expense_Acct Cash Book Expense Account */
public void setCB_Expense_Acct (int CB_Expense_Acct)
{
set_Value (COLUMNNAME_CB_Expense_Acct, Integer.valueOf(CB_Expense_Acct));
}
/** Get Cash Book Expense.
@return Cash Book Expense Account */
public int getCB_Expense_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_CB_Expense_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9d344e01-740b-8779-29c2-0fbf92825491")
public static String es_PE_FIELD_Defaults_CashBookExpense_Name="Cuenta de Gastos del Libro de Efectivo";

@XendraTrl(Identifier="9d344e01-740b-8779-29c2-0fbf92825491")
public static String es_PE_FIELD_Defaults_CashBookExpense_Description="Cuenta de gastos del libro de efectivo";

@XendraTrl(Identifier="9d344e01-740b-8779-29c2-0fbf92825491")
public static String es_PE_FIELD_Defaults_CashBookExpense_Help="La cuenta de gastos del libro de efectivo identifica la cuenta a ser usada para registrar gastos generales sin partidas";

@XendraField(AD_Column_ID="CB_Expense_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Cash Book",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=630,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9d344e01-740b-8779-29c2-0fbf92825491")
public static final String FIELDNAME_Defaults_CashBookExpense="9d344e01-740b-8779-29c2-0fbf92825491";

@XendraTrl(Identifier="733295d5-15c2-9d7d-e9ac-bbd47ff410cc")
public static String es_PE_COLUMN_CB_Expense_Acct_Name="Cuenta de Gastos del Libro de Efectivo";

@XendraColumn(AD_Element_ID="be4ae1a2-6f4b-44c1-91ff-0e308db88cc4",ColumnName="CB_Expense_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="733295d5-15c2-9d7d-e9ac-bbd47ff410cc",
Synchronized="2019-08-30 22:21:00.0")
/** Column name CB_Expense_Acct */
public static final String COLUMNNAME_CB_Expense_Acct = "CB_Expense_Acct";
/** Set Cash Book Receipt.
@param CB_Receipt_Acct Cash Book Receipts Account */
public void setCB_Receipt_Acct (int CB_Receipt_Acct)
{
set_Value (COLUMNNAME_CB_Receipt_Acct, Integer.valueOf(CB_Receipt_Acct));
}
/** Get Cash Book Receipt.
@return Cash Book Receipts Account */
public int getCB_Receipt_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_CB_Receipt_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="08a1316a-006c-7b21-5a0e-9190d82a11c7")
public static String es_PE_FIELD_Defaults_CashBookReceipt_Name="Cuenta de Ingresos del Libro de Efectivo";

@XendraTrl(Identifier="08a1316a-006c-7b21-5a0e-9190d82a11c7")
public static String es_PE_FIELD_Defaults_CashBookReceipt_Description="Cuenta de Ingresos del libro de efectivo";

@XendraTrl(Identifier="08a1316a-006c-7b21-5a0e-9190d82a11c7")
public static String es_PE_FIELD_Defaults_CashBookReceipt_Help="La cuenta de Ingresos del libro de efectivo identifica la cuenta a ser usada para ingresos generales sin partidas en el libro de ingresos";

@XendraField(AD_Column_ID="CB_Receipt_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Cash Book",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=640,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="08a1316a-006c-7b21-5a0e-9190d82a11c7")
public static final String FIELDNAME_Defaults_CashBookReceipt="08a1316a-006c-7b21-5a0e-9190d82a11c7";

@XendraTrl(Identifier="08b3c3ad-24c5-cd9b-74ba-1b19f190307b")
public static String es_PE_COLUMN_CB_Receipt_Acct_Name="Cuenta de Ingresos del Libro de Efectivo";

@XendraColumn(AD_Element_ID="8595fb4a-ac4f-ec51-e6a0-0be94935e1b7",ColumnName="CB_Receipt_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="08b3c3ad-24c5-cd9b-74ba-1b19f190307b",
Synchronized="2019-08-30 22:21:00.0")
/** Column name CB_Receipt_Acct */
public static final String COLUMNNAME_CB_Receipt_Acct = "CB_Receipt_Acct";
/** Set Charge Expense.
@param Ch_Expense_Acct Charge Expense Account */
public void setCh_Expense_Acct (int Ch_Expense_Acct)
{
set_Value (COLUMNNAME_Ch_Expense_Acct, Integer.valueOf(Ch_Expense_Acct));
}
/** Get Charge Expense.
@return Charge Expense Account */
public int getCh_Expense_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Ch_Expense_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="abdaeab4-9190-a7eb-64b1-5e90e3ac8ba6")
public static String es_PE_FIELD_Defaults_ChargeExpense_Name="Cuenta Cargo";

@XendraTrl(Identifier="abdaeab4-9190-a7eb-64b1-5e90e3ac8ba6")
public static String es_PE_FIELD_Defaults_ChargeExpense_Description="Cuenta de otros gastos";

@XendraTrl(Identifier="abdaeab4-9190-a7eb-64b1-5e90e3ac8ba6")
public static String es_PE_FIELD_Defaults_ChargeExpense_Help="La cuenta de otros gastos identifica la cuenta a usar cuando se registran cargos pagados a proveedores.";

@XendraField(AD_Column_ID="Ch_Expense_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="General",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=530,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="abdaeab4-9190-a7eb-64b1-5e90e3ac8ba6")
public static final String FIELDNAME_Defaults_ChargeExpense="abdaeab4-9190-a7eb-64b1-5e90e3ac8ba6";

@XendraTrl(Identifier="ab2ef6a7-e9f7-8f04-9eaf-b522fd267e05")
public static String es_PE_COLUMN_Ch_Expense_Acct_Name="Cuenta Cargo";

@XendraColumn(AD_Element_ID="94da125a-6c2d-37e7-afc1-22b78b63499c",ColumnName="Ch_Expense_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ab2ef6a7-e9f7-8f04-9eaf-b522fd267e05",
Synchronized="2019-08-30 22:21:00.0")
/** Column name Ch_Expense_Acct */
public static final String COLUMNNAME_Ch_Expense_Acct = "Ch_Expense_Acct";
/** Set Charge Revenue.
@param Ch_Revenue_Acct Charge Revenue Account */
public void setCh_Revenue_Acct (int Ch_Revenue_Acct)
{
set_Value (COLUMNNAME_Ch_Revenue_Acct, Integer.valueOf(Ch_Revenue_Acct));
}
/** Get Charge Revenue.
@return Charge Revenue Account */
public int getCh_Revenue_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Ch_Revenue_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e05fcec7-0121-85dd-b852-aa65ee84db19")
public static String es_PE_FIELD_Defaults_ChargeRevenue_Name="Cuenta Abono";

@XendraTrl(Identifier="e05fcec7-0121-85dd-b852-aa65ee84db19")
public static String es_PE_FIELD_Defaults_ChargeRevenue_Description="Cuenta de otros ingresos";

@XendraTrl(Identifier="e05fcec7-0121-85dd-b852-aa65ee84db19")
public static String es_PE_FIELD_Defaults_ChargeRevenue_Help="La cuenta de otros ingresos identifica la cuenta a usar cuando se registran cargos pagados por los clientes";

@XendraField(AD_Column_ID="Ch_Revenue_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="General",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=540,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e05fcec7-0121-85dd-b852-aa65ee84db19")
public static final String FIELDNAME_Defaults_ChargeRevenue="e05fcec7-0121-85dd-b852-aa65ee84db19";

@XendraTrl(Identifier="e6bad685-4576-4974-34eb-2e39b0e5f66c")
public static String es_PE_COLUMN_Ch_Revenue_Acct_Name="Cuenta Abono";

@XendraColumn(AD_Element_ID="db1f0c15-01b7-f3d7-a879-800051f9196c",ColumnName="Ch_Revenue_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e6bad685-4576-4974-34eb-2e39b0e5f66c",
Synchronized="2019-08-30 22:21:00.0")
/** Column name Ch_Revenue_Acct */
public static final String COLUMNNAME_Ch_Revenue_Acct = "Ch_Revenue_Acct";
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

@XendraTrl(Identifier="f6a3bb99-6853-f956-9365-0692ba33d6e6")
public static String es_PE_FIELD_Defaults_CustomerPrepayment_Name="Pago Anticipado de Clientes";

@XendraTrl(Identifier="f6a3bb99-6853-f956-9365-0692ba33d6e6")
public static String es_PE_FIELD_Defaults_CustomerPrepayment_Description="Cuenta para pagos anticipados de clientes.";

@XendraTrl(Identifier="f6a3bb99-6853-f956-9365-0692ba33d6e6")
public static String es_PE_FIELD_Defaults_CustomerPrepayment_Help="La cuenta para pagos anticipados de clientes indica la cuenta a ser usada para registrar pagos anticipados de clientes.";

@XendraField(AD_Column_ID="C_Prepayment_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Business Partner",
IsDisplayed=true,DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f6a3bb99-6853-f956-9365-0692ba33d6e6")
public static final String FIELDNAME_Defaults_CustomerPrepayment="f6a3bb99-6853-f956-9365-0692ba33d6e6";

@XendraTrl(Identifier="e2179c37-0411-6c0e-b4c9-9f098b869719")
public static String es_PE_COLUMN_C_Prepayment_Acct_Name="Pago Anticipado de Clientes";

@XendraColumn(AD_Element_ID="8fce2dea-0db2-e7fc-767e-344c87d2f65a",ColumnName="C_Prepayment_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e2179c37-0411-6c0e-b4c9-9f098b869719",
Synchronized="2019-08-30 22:21:00.0")
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

@XendraTrl(Identifier="9276d345-b041-f1bb-8306-c7b74f96cbdb")
public static String es_PE_FIELD_Defaults_CustomerReceivables_Name="CxC de Clientes";

@XendraTrl(Identifier="9276d345-b041-f1bb-8306-c7b74f96cbdb")
public static String es_PE_FIELD_Defaults_CustomerReceivables_Description="Cuenta por cobrar de clientes";

@XendraTrl(Identifier="9276d345-b041-f1bb-8306-c7b74f96cbdb")
public static String es_PE_FIELD_Defaults_CustomerReceivables_Help="La cuenta por cobrar de clientes indica la cuenta a ser usada para registrar transacciones de cobros a clientes";

@XendraField(AD_Column_ID="C_Receivable_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Business Partner",
IsDisplayed=true,DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=40,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="9276d345-b041-f1bb-8306-c7b74f96cbdb")
public static final String FIELDNAME_Defaults_CustomerReceivables="9276d345-b041-f1bb-8306-c7b74f96cbdb";

@XendraTrl(Identifier="2975c334-a09b-0ad7-3ae1-550e71932cf7")
public static String es_PE_COLUMN_C_Receivable_Acct_Name="CxC de Clientes";

@XendraColumn(AD_Element_ID="40fe8c0a-9ee8-fe94-a8c9-b45c09c9a30d",ColumnName="C_Receivable_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2975c334-a09b-0ad7-3ae1-550e71932cf7",
Synchronized="2019-08-30 22:21:00.0")
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

@XendraTrl(Identifier="8693a348-dbdc-d5a6-afdf-1847d15e5ace")
public static String es_PE_FIELD_Defaults_ReceivableServices_Name="CxC Servicios";

@XendraTrl(Identifier="8693a348-dbdc-d5a6-afdf-1847d15e5ace")
public static String es_PE_FIELD_Defaults_ReceivableServices_Description="Cuenta Clientes CxC Servicios ";

@XendraTrl(Identifier="8693a348-dbdc-d5a6-afdf-1847d15e5ace")
public static String es_PE_FIELD_Defaults_ReceivableServices_Help="Cuenta para aplicar servicios relacionados CxC. Si desea diferenciar ingresos por Productos y Servicios. Esta cuenta solamente es empleada, si la aplicación para la cuenta servicios está habilitado en el esquema contable.";

@XendraField(AD_Column_ID="C_Receivable_Services_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8693a348-dbdc-d5a6-afdf-1847d15e5ace")
public static final String FIELDNAME_Defaults_ReceivableServices="8693a348-dbdc-d5a6-afdf-1847d15e5ace";

@XendraTrl(Identifier="2f778794-9829-ccdb-541c-f788526d2098")
public static String es_PE_COLUMN_C_Receivable_Services_Acct_Name="CxC Servicios";

@XendraColumn(AD_Element_ID="9bd443ea-2c92-edbc-96ce-3eb12789faf4",
ColumnName="C_Receivable_Services_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2f778794-9829-ccdb-541c-f788526d2098",Synchronized="2019-08-30 22:21:00.0")
/** Column name C_Receivable_Services_Acct */
public static final String COLUMNNAME_C_Receivable_Services_Acct = "C_Receivable_Services_Acct";
/** Set Donation_Acct.
@param Donation_Acct Donation_Acct */
public void setDonation_Acct (int Donation_Acct)
{
set_Value (COLUMNNAME_Donation_Acct, Integer.valueOf(Donation_Acct));
}
/** Get Donation_Acct.
@return Donation_Acct */
public int getDonation_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Donation_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="09414d4b-a6b9-4893-8c65-ff67dafc2be6")
public static String es_PE_FIELD_Defaults_Donation_Acct_Name="Cta Donacion";

@XendraField(AD_Column_ID="Donation_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="General",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=590,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-03 17:35:33.0",
Identifier="09414d4b-a6b9-4893-8c65-ff67dafc2be6")
public static final String FIELDNAME_Defaults_Donation_Acct="09414d4b-a6b9-4893-8c65-ff67dafc2be6";

@XendraTrl(Identifier="dc0b02af-0b6c-49bd-bcbf-b17767e2a722")
public static String es_PE_COLUMN_Donation_Acct_Name="donation_acct";

@XendraColumn(AD_Element_ID="f4d74adc-6d0e-459c-b9d9-654e709cd5d4",ColumnName="Donation_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dc0b02af-0b6c-49bd-bcbf-b17767e2a722",
Synchronized="2019-08-30 22:21:00.0")
/** Column name Donation_Acct */
public static final String COLUMNNAME_Donation_Acct = "Donation_Acct";
/** Set Employee Expense.
@param E_Expense_Acct Account for Employee Expenses */
public void setE_Expense_Acct (int E_Expense_Acct)
{
set_Value (COLUMNNAME_E_Expense_Acct, Integer.valueOf(E_Expense_Acct));
}
/** Get Employee Expense.
@return Account for Employee Expenses */
public int getE_Expense_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_E_Expense_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5c640925-c072-7de9-51d1-8f3bade95311")
public static String es_PE_FIELD_Defaults_EmployeeExpense_Name="Gastos de Empleados";

@XendraTrl(Identifier="5c640925-c072-7de9-51d1-8f3bade95311")
public static String es_PE_FIELD_Defaults_EmployeeExpense_Description="Cuenta para gastos de empleados";

@XendraTrl(Identifier="5c640925-c072-7de9-51d1-8f3bade95311")
public static String es_PE_FIELD_Defaults_EmployeeExpense_Help="La Cuenta de Gastos de empleados identifica la cuenta a usar para registrar gastos para este empleado";

@XendraField(AD_Column_ID="E_Expense_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Business Partner",
IsDisplayed=true,DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=190,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="5c640925-c072-7de9-51d1-8f3bade95311")
public static final String FIELDNAME_Defaults_EmployeeExpense="5c640925-c072-7de9-51d1-8f3bade95311";

@XendraTrl(Identifier="07fd594d-7fcf-0dbd-bd98-73f9aea51b94")
public static String es_PE_COLUMN_E_Expense_Acct_Name="Gastos de Empleados";

@XendraColumn(AD_Element_ID="c3b9a2f6-e4f8-d6fe-d356-df5e7508c46d",ColumnName="E_Expense_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="07fd594d-7fcf-0dbd-bd98-73f9aea51b94",
Synchronized="2019-08-30 22:21:00.0")
/** Column name E_Expense_Acct */
public static final String COLUMNNAME_E_Expense_Acct = "E_Expense_Acct";
/** Set Employee Prepayment.
@param E_Prepayment_Acct Account for Employee Expense Prepayments */
public void setE_Prepayment_Acct (int E_Prepayment_Acct)
{
set_Value (COLUMNNAME_E_Prepayment_Acct, Integer.valueOf(E_Prepayment_Acct));
}
/** Get Employee Prepayment.
@return Account for Employee Expense Prepayments */
public int getE_Prepayment_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_E_Prepayment_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="52e154a1-603f-3cfe-bbdb-09b5232ae28c")
public static String es_PE_FIELD_Defaults_EmployeePrepayment_Name="Pago Anticipado a Empleados";

@XendraTrl(Identifier="52e154a1-603f-3cfe-bbdb-09b5232ae28c")
public static String es_PE_FIELD_Defaults_EmployeePrepayment_Description="Cuenta para pagos anticipados a empleados";

@XendraTrl(Identifier="52e154a1-603f-3cfe-bbdb-09b5232ae28c")
public static String es_PE_FIELD_Defaults_EmployeePrepayment_Help="La cuenta de anticipos a empleados identifica la cuenta a usar para registrar anticipos de gastos hechos a este empleado.";

@XendraField(AD_Column_ID="E_Prepayment_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Business Partner",
IsDisplayed=true,DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=180,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="52e154a1-603f-3cfe-bbdb-09b5232ae28c")
public static final String FIELDNAME_Defaults_EmployeePrepayment="52e154a1-603f-3cfe-bbdb-09b5232ae28c";

@XendraTrl(Identifier="8f082def-df33-fc04-239c-7aa345da2777")
public static String es_PE_COLUMN_E_Prepayment_Acct_Name="Pago Anticipado a Empleados";

@XendraColumn(AD_Element_ID="6564c32b-763e-332c-1529-86be89fc3a9d",ColumnName="E_Prepayment_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8f082def-df33-fc04-239c-7aa345da2777",
Synchronized="2019-08-30 22:21:00.0")
/** Column name E_Prepayment_Acct */
public static final String COLUMNNAME_E_Prepayment_Acct = "E_Prepayment_Acct";
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
@XendraTrl(Identifier="7a1fa5c4-f861-4e45-b244-e9df8952d42d")
public static String es_PE_FIELD_Defaults_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-03 17:35:33.0",
Identifier="7a1fa5c4-f861-4e45-b244-e9df8952d42d")
public static final String FIELDNAME_Defaults_Identifier="7a1fa5c4-f861-4e45-b244-e9df8952d42d";

@XendraTrl(Identifier="eee4d691-f1cc-4be0-bf30-0df021f00c89")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eee4d691-f1cc-4be0-bf30-0df021f00c89",
Synchronized="2019-08-30 22:21:00.0")
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

@XendraTrl(Identifier="2b0033eb-73e7-348e-0eb7-c433089ccd15")
public static String es_PE_FIELD_Defaults_Not_InvoicedReceipts_Name="Recibos no Facturados";

@XendraTrl(Identifier="2b0033eb-73e7-348e-0eb7-c433089ccd15")
public static String es_PE_FIELD_Defaults_Not_InvoicedReceipts_Description="Cuenta para Recibos de Material no Facturados";

@XendraTrl(Identifier="2b0033eb-73e7-348e-0eb7-c433089ccd15")
public static String es_PE_FIELD_Defaults_Not_InvoicedReceipts_Help="La cuenta de Recibos no Facturados indica la cuenta usada para registrar recibos de materiales que no han sido aún facturados";

@XendraField(AD_Column_ID="NotInvoicedReceipts_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Business Partner",
IsDisplayed=true,DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=170,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="2b0033eb-73e7-348e-0eb7-c433089ccd15")
public static final String FIELDNAME_Defaults_Not_InvoicedReceipts="2b0033eb-73e7-348e-0eb7-c433089ccd15";

@XendraTrl(Identifier="3a6288b4-ba3e-5831-f55a-3f934282ec95")
public static String es_PE_COLUMN_NotInvoicedReceipts_Acct_Name="Recibos no Facturados";

@XendraColumn(AD_Element_ID="0fcf25de-3044-1b9d-5e4a-df9ec372db39",
ColumnName="NotInvoicedReceipts_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3a6288b4-ba3e-5831-f55a-3f934282ec95",Synchronized="2019-08-30 22:21:00.0")
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

@XendraTrl(Identifier="f77b64d7-eac9-db66-db07-432217c56c8a")
public static String es_PE_FIELD_Defaults_Not_InvoicedReceivables_Name="CxC No Facturada";

@XendraTrl(Identifier="f77b64d7-eac9-db66-db07-432217c56c8a")
public static String es_PE_FIELD_Defaults_Not_InvoicedReceivables_Description="Cuenta para cobros no facturados";

@XendraTrl(Identifier="f77b64d7-eac9-db66-db07-432217c56c8a")
public static String es_PE_FIELD_Defaults_Not_InvoicedReceivables_Help="La cuenta de cobros no facturados indica la cuenta usada para registrar cobros que aún no han sido facturados";

@XendraField(AD_Column_ID="NotInvoicedReceivables_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Business Partner",
IsDisplayed=true,DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f77b64d7-eac9-db66-db07-432217c56c8a")
public static final String FIELDNAME_Defaults_Not_InvoicedReceivables="f77b64d7-eac9-db66-db07-432217c56c8a";

@XendraTrl(Identifier="7da9cb18-a0b8-5d19-b0c9-a8000963baed")
public static String es_PE_COLUMN_NotInvoicedReceivables_Acct_Name="CxC No Facturada";

@XendraColumn(AD_Element_ID="136c5289-9315-f019-a4b1-07f6b00cf381",
ColumnName="NotInvoicedReceivables_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7da9cb18-a0b8-5d19-b0c9-a8000963baed",Synchronized="2019-08-30 22:21:00.0")
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

@XendraTrl(Identifier="f15757da-6015-5976-e224-9f896fb3e498")
public static String es_PE_FIELD_Defaults_Not_InvoicedRevenue_Name="Ingresos no Facturados";

@XendraTrl(Identifier="f15757da-6015-5976-e224-9f896fb3e498")
public static String es_PE_FIELD_Defaults_Not_InvoicedRevenue_Description="Cuenta para Ingresos no facturados";

@XendraTrl(Identifier="f15757da-6015-5976-e224-9f896fb3e498")
public static String es_PE_FIELD_Defaults_Not_InvoicedRevenue_Help="La cuenta de Ingresos no facturados indica la cuenta usada para registrar ingresos que no han sido aún facturados.";

@XendraField(AD_Column_ID="NotInvoicedRevenue_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Business Partner",
IsDisplayed=true,DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f15757da-6015-5976-e224-9f896fb3e498")
public static final String FIELDNAME_Defaults_Not_InvoicedRevenue="f15757da-6015-5976-e224-9f896fb3e498";

@XendraTrl(Identifier="32a2dae8-bf56-0cbd-21a6-39761d1a080e")
public static String es_PE_COLUMN_NotInvoicedRevenue_Acct_Name="Ingresos no Facturados";

@XendraColumn(AD_Element_ID="a812ce44-7f3f-f0c5-d688-384a8cd4f22d",
ColumnName="NotInvoicedRevenue_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="32a2dae8-bf56-0cbd-21a6-39761d1a080e",Synchronized="2019-08-30 22:21:00.0")
/** Column name NotInvoicedRevenue_Acct */
public static final String COLUMNNAME_NotInvoicedRevenue_Acct = "NotInvoicedRevenue_Acct";
/** Set Product Asset.
@param P_Asset_Acct Account for Product Asset (Inventory) */
public void setP_Asset_Acct (int P_Asset_Acct)
{
set_Value (COLUMNNAME_P_Asset_Acct, Integer.valueOf(P_Asset_Acct));
}
/** Get Product Asset.
@return Account for Product Asset (Inventory) */
public int getP_Asset_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_P_Asset_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="704f5263-5607-0eb3-186e-ffd7978433d4")
public static String es_PE_FIELD_Defaults_ProductAsset_Name="Inventario de Producto";

@XendraTrl(Identifier="704f5263-5607-0eb3-186e-ffd7978433d4")
public static String es_PE_FIELD_Defaults_ProductAsset_Description="Cuenta para inventario del producto";

@XendraTrl(Identifier="704f5263-5607-0eb3-186e-ffd7978433d4")
public static String es_PE_FIELD_Defaults_ProductAsset_Help="La cuenta Inventario indica la cuenta usada para valuar los productos en inventario.";

@XendraField(AD_Column_ID="P_Asset_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Product",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="704f5263-5607-0eb3-186e-ffd7978433d4")
public static final String FIELDNAME_Defaults_ProductAsset="704f5263-5607-0eb3-186e-ffd7978433d4";

@XendraTrl(Identifier="b04b48b5-f523-cde9-4b20-73f950614207")
public static String es_PE_COLUMN_P_Asset_Acct_Name="Inventario de Producto";

@XendraColumn(AD_Element_ID="d30f7070-17c9-1af8-c525-961260c4aa6b",ColumnName="P_Asset_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b04b48b5-f523-cde9-4b20-73f950614207",
Synchronized="2019-08-30 22:21:00.0")
/** Column name P_Asset_Acct */
public static final String COLUMNNAME_P_Asset_Acct = "P_Asset_Acct";
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

@XendraTrl(Identifier="eb8fa6ea-301e-96bf-cca7-7c439312ae7e")
public static String es_PE_FIELD_Defaults_PaymentDiscountExpense_Name="Gastos de Descuentos en Pagos";

@XendraTrl(Identifier="eb8fa6ea-301e-96bf-cca7-7c439312ae7e")
public static String es_PE_FIELD_Defaults_PaymentDiscountExpense_Description="Gastos de Descuentos en Pagos";

@XendraTrl(Identifier="eb8fa6ea-301e-96bf-cca7-7c439312ae7e")
public static String es_PE_FIELD_Defaults_PaymentDiscountExpense_Help="Indica la cuenta a ser cargada para gastos por descuentos en pagos";

@XendraField(AD_Column_ID="PayDiscount_Exp_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Business Partner",
IsDisplayed=true,DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="eb8fa6ea-301e-96bf-cca7-7c439312ae7e")
public static final String FIELDNAME_Defaults_PaymentDiscountExpense="eb8fa6ea-301e-96bf-cca7-7c439312ae7e";

@XendraTrl(Identifier="6e408bca-6920-7ce7-ec25-d1d11280d207")
public static String es_PE_COLUMN_PayDiscount_Exp_Acct_Name="Gastos de Descuentos en Pagos";

@XendraColumn(AD_Element_ID="5ba156b8-18c7-dda1-5404-606e13996b8a",
ColumnName="PayDiscount_Exp_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6e408bca-6920-7ce7-ec25-d1d11280d207",Synchronized="2019-08-30 22:21:00.0")
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

@XendraTrl(Identifier="bb561c35-990e-a98c-b68f-fb64cb3af127")
public static String es_PE_FIELD_Defaults_PaymentDiscountRevenue_Name="Ingresos de Descuentos en Pagos";

@XendraTrl(Identifier="bb561c35-990e-a98c-b68f-fb64cb3af127")
public static String es_PE_FIELD_Defaults_PaymentDiscountRevenue_Description="Ingresos de descuentos en pagos";

@XendraTrl(Identifier="bb561c35-990e-a98c-b68f-fb64cb3af127")
public static String es_PE_FIELD_Defaults_PaymentDiscountRevenue_Help="Indica la cuenta a ser cargada por ingresos por descuentos en pagos.";

@XendraField(AD_Column_ID="PayDiscount_Rev_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Business Partner",
IsDisplayed=true,DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=160,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="bb561c35-990e-a98c-b68f-fb64cb3af127")
public static final String FIELDNAME_Defaults_PaymentDiscountRevenue="bb561c35-990e-a98c-b68f-fb64cb3af127";

@XendraTrl(Identifier="0160b7be-e3e4-4c3a-7347-9e77c128f6fe")
public static String es_PE_COLUMN_PayDiscount_Rev_Acct_Name="Ingresos de Descuentos en Pagos";

@XendraColumn(AD_Element_ID="735917d8-4315-5aa6-3e6f-b283ad644399",
ColumnName="PayDiscount_Rev_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0160b7be-e3e4-4c3a-7347-9e77c128f6fe",Synchronized="2019-08-30 22:21:00.0")
/** Column name PayDiscount_Rev_Acct */
public static final String COLUMNNAME_PayDiscount_Rev_Acct = "PayDiscount_Rev_Acct";
/** Set Product COGS.
@param P_COGS_Acct Account for Cost of Goods Sold */
public void setP_COGS_Acct (int P_COGS_Acct)
{
set_Value (COLUMNNAME_P_COGS_Acct, Integer.valueOf(P_COGS_Acct));
}
/** Get Product COGS.
@return Account for Cost of Goods Sold */
public int getP_COGS_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_P_COGS_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="20158c0f-031e-deb4-6079-1488f530801d")
public static String es_PE_FIELD_Defaults_ProductCOGS_Name="COGS del Producto";

@XendraTrl(Identifier="20158c0f-031e-deb4-6079-1488f530801d")
public static String es_PE_FIELD_Defaults_ProductCOGS_Description="Cuenta para costo de producto vendido";

@XendraTrl(Identifier="20158c0f-031e-deb4-6079-1488f530801d")
public static String es_PE_FIELD_Defaults_ProductCOGS_Help="La cuenta COGS de producto indica la cuenta usada para registrar costos asociados con la venta de este producto";

@XendraField(AD_Column_ID="P_COGS_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Product",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="20158c0f-031e-deb4-6079-1488f530801d")
public static final String FIELDNAME_Defaults_ProductCOGS="20158c0f-031e-deb4-6079-1488f530801d";

@XendraTrl(Identifier="76e3ae55-858f-2d3c-e0d1-e5df530c4197")
public static String es_PE_COLUMN_P_COGS_Acct_Name="COGS del Producto";

@XendraColumn(AD_Element_ID="2909678b-c885-6958-6484-c07916c61343",ColumnName="P_COGS_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="76e3ae55-858f-2d3c-e0d1-e5df530c4197",
Synchronized="2019-08-30 22:21:00.0")
/** Column name P_COGS_Acct */
public static final String COLUMNNAME_P_COGS_Acct = "P_COGS_Acct";
/** Set Cost Adjustment.
@param P_CostAdjustment_Acct Product Cost Adjustment Account */
public void setP_CostAdjustment_Acct (int P_CostAdjustment_Acct)
{
set_Value (COLUMNNAME_P_CostAdjustment_Acct, Integer.valueOf(P_CostAdjustment_Acct));
}
/** Get Cost Adjustment.
@return Product Cost Adjustment Account */
public int getP_CostAdjustment_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_P_CostAdjustment_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e1a57341-728d-bfe1-cf4a-e6a684b617d2")
public static String es_PE_FIELD_Defaults_CostAdjustment_Name="Ajustar Costo";

@XendraTrl(Identifier="e1a57341-728d-bfe1-cf4a-e6a684b617d2")
public static String es_PE_FIELD_Defaults_CostAdjustment_Description="Ajustar Cuenta Costo de Producto";

@XendraTrl(Identifier="e1a57341-728d-bfe1-cf4a-e6a684b617d2")
public static String es_PE_FIELD_Defaults_CostAdjustment_Help="Cuenta empleada para contabilizar ajustes al costo del producto (ej.Costos Adicionales)";

@XendraField(AD_Column_ID="P_CostAdjustment_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e1a57341-728d-bfe1-cf4a-e6a684b617d2")
public static final String FIELDNAME_Defaults_CostAdjustment="e1a57341-728d-bfe1-cf4a-e6a684b617d2";

@XendraTrl(Identifier="b802dc9b-793e-42da-01f9-ed8a9fe63908")
public static String es_PE_COLUMN_P_CostAdjustment_Acct_Name="Ajustar Costo";

@XendraColumn(AD_Element_ID="ad309537-4749-1eec-078d-4d547978d2b6",
ColumnName="P_CostAdjustment_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b802dc9b-793e-42da-01f9-ed8a9fe63908",Synchronized="2019-08-30 22:21:00.0")
/** Column name P_CostAdjustment_Acct */
public static final String COLUMNNAME_P_CostAdjustment_Acct = "P_CostAdjustment_Acct";
/** Set Product Expense.
@param P_Expense_Acct Account for Product Expense */
public void setP_Expense_Acct (int P_Expense_Acct)
{
set_Value (COLUMNNAME_P_Expense_Acct, Integer.valueOf(P_Expense_Acct));
}
/** Get Product Expense.
@return Account for Product Expense */
public int getP_Expense_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_P_Expense_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="14f0fad7-160a-b0cf-0fd5-dc660ea784f7")
public static String es_PE_FIELD_Defaults_ProductExpense_Name="Discrepancia en Producto";

@XendraTrl(Identifier="14f0fad7-160a-b0cf-0fd5-dc660ea784f7")
public static String es_PE_FIELD_Defaults_ProductExpense_Description="Cuenta para gastos por el producto";

@XendraTrl(Identifier="14f0fad7-160a-b0cf-0fd5-dc660ea784f7")
public static String es_PE_FIELD_Defaults_ProductExpense_Help="La cuenta gastos para el producto indica la cuenta usada para registrar gastos asociados con estos productos.";

@XendraField(AD_Column_ID="P_Expense_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Product",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="14f0fad7-160a-b0cf-0fd5-dc660ea784f7")
public static final String FIELDNAME_Defaults_ProductExpense="14f0fad7-160a-b0cf-0fd5-dc660ea784f7";

@XendraTrl(Identifier="9c114e0f-f044-ee6d-9857-3a5276c06da7")
public static String es_PE_COLUMN_P_Expense_Acct_Name="Discrepancia en Producto";

@XendraColumn(AD_Element_ID="3b747810-2ea8-e75f-5550-9ef4be318c0a",ColumnName="P_Expense_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9c114e0f-f044-ee6d-9857-3a5276c06da7",
Synchronized="2019-08-30 22:21:00.0")
/** Column name P_Expense_Acct */
public static final String COLUMNNAME_P_Expense_Acct = "P_Expense_Acct";
/** Set Inventory Clearing.
@param P_InventoryClearing_Acct Product Inventory Clearing Account */
public void setP_InventoryClearing_Acct (int P_InventoryClearing_Acct)
{
set_Value (COLUMNNAME_P_InventoryClearing_Acct, Integer.valueOf(P_InventoryClearing_Acct));
}
/** Get Inventory Clearing.
@return Product Inventory Clearing Account */
public int getP_InventoryClearing_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_P_InventoryClearing_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a1064265-aa21-0589-9097-c913f156d079")
public static String es_PE_FIELD_Defaults_InventoryClearing_Name="Compras";

@XendraTrl(Identifier="a1064265-aa21-0589-9097-c913f156d079")
public static String es_PE_FIELD_Defaults_InventoryClearing_Description="Product Inventory Clearing Account";

@XendraTrl(Identifier="a1064265-aa21-0589-9097-c913f156d079")
public static String es_PE_FIELD_Defaults_InventoryClearing_Help="Account used for posting matched product (item) expenses (e.g. AP Invoice, Invoice Match).  You would use a different account then Product Expense, if you want to differentate service related costs from item related costs. The balance on the clearing account should be zero and accounts for the timing difference between invoice receipt and matching.";

@XendraField(AD_Column_ID="P_InventoryClearing_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a1064265-aa21-0589-9097-c913f156d079")
public static final String FIELDNAME_Defaults_InventoryClearing="a1064265-aa21-0589-9097-c913f156d079";

@XendraTrl(Identifier="c13129b0-bfc2-d7d5-3241-de71b0eea9ba")
public static String es_PE_COLUMN_P_InventoryClearing_Acct_Name="Inventory Clearing";

@XendraColumn(AD_Element_ID="df102fda-6348-7e51-ccc2-eb5639647e89",
ColumnName="P_InventoryClearing_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c13129b0-bfc2-d7d5-3241-de71b0eea9ba",Synchronized="2019-08-30 22:21:00.0")
/** Column name P_InventoryClearing_Acct */
public static final String COLUMNNAME_P_InventoryClearing_Acct = "P_InventoryClearing_Acct";
/** Set Invoice Price Variance.
@param P_InvoicePriceVariance_Acct Difference between Costs and Invoice Price (IPV) */
public void setP_InvoicePriceVariance_Acct (int P_InvoicePriceVariance_Acct)
{
set_Value (COLUMNNAME_P_InvoicePriceVariance_Acct, Integer.valueOf(P_InvoicePriceVariance_Acct));
}
/** Get Invoice Price Variance.
@return Difference between Costs and Invoice Price (IPV) */
public int getP_InvoicePriceVariance_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_P_InvoicePriceVariance_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="03bdc0a1-81a1-f52c-eeb0-7ada68ebe28d")
public static String es_PE_FIELD_Defaults_InvoicePriceVariance_Name="Variación en Precio de la Factura";

@XendraTrl(Identifier="03bdc0a1-81a1-f52c-eeb0-7ada68ebe28d")
public static String es_PE_FIELD_Defaults_InvoicePriceVariance_Description="Variación entre el costo y el precio de la factura (IPV)";

@XendraTrl(Identifier="03bdc0a1-81a1-f52c-eeb0-7ada68ebe28d")
public static String es_PE_FIELD_Defaults_InvoicePriceVariance_Help="La Variación en el precio de la factura se usa para reflejar la diferencia entre el costo actual y el precio de la factura.";

@XendraField(AD_Column_ID="P_InvoicePriceVariance_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Product",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=270,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="03bdc0a1-81a1-f52c-eeb0-7ada68ebe28d")
public static final String FIELDNAME_Defaults_InvoicePriceVariance="03bdc0a1-81a1-f52c-eeb0-7ada68ebe28d";

@XendraTrl(Identifier="2c08fe94-1309-4d15-ee4a-de6905f0523d")
public static String es_PE_COLUMN_P_InvoicePriceVariance_Acct_Name="Variación en Precio de la Factura";

@XendraColumn(AD_Element_ID="52fdc368-6796-1aa4-732e-8b6e615d3483",
ColumnName="P_InvoicePriceVariance_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2c08fe94-1309-4d15-ee4a-de6905f0523d",Synchronized="2019-08-30 22:21:00.0")
/** Column name P_InvoicePriceVariance_Acct */
public static final String COLUMNNAME_P_InvoicePriceVariance_Acct = "P_InvoicePriceVariance_Acct";
/** Set Project Asset.
@param PJ_Asset_Acct Project Asset Account */
public void setPJ_Asset_Acct (int PJ_Asset_Acct)
{
set_Value (COLUMNNAME_PJ_Asset_Acct, Integer.valueOf(PJ_Asset_Acct));
}
/** Get Project Asset.
@return Project Asset Account */
public int getPJ_Asset_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PJ_Asset_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7aac674d-9622-fae2-7f2e-8fafecedcd22")
public static String es_PE_FIELD_Defaults_ProjectAsset_Name="Activos de Proyecto";

@XendraTrl(Identifier="7aac674d-9622-fae2-7f2e-8fafecedcd22")
public static String es_PE_FIELD_Defaults_ProjectAsset_Description="Cuenta de Activos de Proyecto";

@XendraTrl(Identifier="7aac674d-9622-fae2-7f2e-8fafecedcd22")
public static String es_PE_FIELD_Defaults_ProjectAsset_Help="La cuenta de Activos de Proyecto es la cuenta usada como la cuenta final de capitalización de activos en proyectos de capital";

@XendraField(AD_Column_ID="PJ_Asset_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Project",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=340,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7aac674d-9622-fae2-7f2e-8fafecedcd22")
public static final String FIELDNAME_Defaults_ProjectAsset="7aac674d-9622-fae2-7f2e-8fafecedcd22";

@XendraTrl(Identifier="bcb65388-6813-b762-38af-7202de57163b")
public static String es_PE_COLUMN_PJ_Asset_Acct_Name="Activos de Proyecto";

@XendraColumn(AD_Element_ID="4f648405-0f0b-2987-7d81-4fc3198c2a42",ColumnName="PJ_Asset_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bcb65388-6813-b762-38af-7202de57163b",
Synchronized="2019-08-30 22:21:00.0")
/** Column name PJ_Asset_Acct */
public static final String COLUMNNAME_PJ_Asset_Acct = "PJ_Asset_Acct";
/** Set Work In Progress.
@param PJ_WIP_Acct Account for Work in Progress */
public void setPJ_WIP_Acct (int PJ_WIP_Acct)
{
set_Value (COLUMNNAME_PJ_WIP_Acct, Integer.valueOf(PJ_WIP_Acct));
}
/** Get Work In Progress.
@return Account for Work in Progress */
public int getPJ_WIP_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PJ_WIP_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a10102b1-0638-da1a-7ed8-15cb6e4c591a")
public static String es_PE_FIELD_Defaults_WorkInProgress_Name="Cuenta de Trabajo en Proceso";

@XendraTrl(Identifier="a10102b1-0638-da1a-7ed8-15cb6e4c591a")
public static String es_PE_FIELD_Defaults_WorkInProgress_Description="Cuenta de trabajo en proceso";

@XendraTrl(Identifier="a10102b1-0638-da1a-7ed8-15cb6e4c591a")
public static String es_PE_FIELD_Defaults_WorkInProgress_Help="La cuenta de trabajo en proceso es la cuenta usada en proyectos capitales hasta que el proyecto se completa";

@XendraField(AD_Column_ID="PJ_WIP_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Project",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=350,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a10102b1-0638-da1a-7ed8-15cb6e4c591a")
public static final String FIELDNAME_Defaults_WorkInProgress="a10102b1-0638-da1a-7ed8-15cb6e4c591a";

@XendraTrl(Identifier="eba49537-b699-ea7a-9503-2c01140242df")
public static String es_PE_COLUMN_PJ_WIP_Acct_Name="Cuenta de Trabajo en Proceso";

@XendraColumn(AD_Element_ID="6210a7b5-1560-eda6-676f-3a2ca1d56da6",ColumnName="PJ_WIP_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eba49537-b699-ea7a-9503-2c01140242df",
Synchronized="2019-08-30 22:21:00.0")
/** Column name PJ_WIP_Acct */
public static final String COLUMNNAME_PJ_WIP_Acct = "PJ_WIP_Acct";
/** Set Purchase Price Variance.
@param P_PurchasePriceVariance_Acct Difference between Standard Cost and Purchase Price (PPV) */
public void setP_PurchasePriceVariance_Acct (int P_PurchasePriceVariance_Acct)
{
set_Value (COLUMNNAME_P_PurchasePriceVariance_Acct, Integer.valueOf(P_PurchasePriceVariance_Acct));
}
/** Get Purchase Price Variance.
@return Difference between Standard Cost and Purchase Price (PPV) */
public int getP_PurchasePriceVariance_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_P_PurchasePriceVariance_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d308417c-4ae2-b6bb-6e46-437e1fadbe40")
public static String es_PE_FIELD_Defaults_PurchasePriceVariance_Name="Variación Precio de OC";

@XendraTrl(Identifier="d308417c-4ae2-b6bb-6e46-437e1fadbe40")
public static String es_PE_FIELD_Defaults_PurchasePriceVariance_Description="Variación entre le costo estándar y el precio de la orden de compra.";

@XendraTrl(Identifier="d308417c-4ae2-b6bb-6e46-437e1fadbe40")
public static String es_PE_FIELD_Defaults_PurchasePriceVariance_Help="La Variación en precios de compra es usada en costeo estándar. Refleja la diferencia entre el costo estándar y el precio de la orden de compra";

@XendraField(AD_Column_ID="P_PurchasePriceVariance_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Product",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d308417c-4ae2-b6bb-6e46-437e1fadbe40")
public static final String FIELDNAME_Defaults_PurchasePriceVariance="d308417c-4ae2-b6bb-6e46-437e1fadbe40";

@XendraTrl(Identifier="f7f76166-793b-ba45-642b-cb3dbf6bac67")
public static String es_PE_COLUMN_P_PurchasePriceVariance_Acct_Name="Variación Precio de OC";

@XendraColumn(AD_Element_ID="b7204f76-9f57-b30e-5da5-8c9791c46c2b",
ColumnName="P_PurchasePriceVariance_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f7f76166-793b-ba45-642b-cb3dbf6bac67",Synchronized="2019-08-30 22:21:00.0")
/** Column name P_PurchasePriceVariance_Acct */
public static final String COLUMNNAME_P_PurchasePriceVariance_Acct = "P_PurchasePriceVariance_Acct";
/** Set Product Revenue.
@param P_Revenue_Acct Account for Product Revenue (Sales Account) */
public void setP_Revenue_Acct (int P_Revenue_Acct)
{
set_Value (COLUMNNAME_P_Revenue_Acct, Integer.valueOf(P_Revenue_Acct));
}
/** Get Product Revenue.
@return Account for Product Revenue (Sales Account) */
public int getP_Revenue_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_P_Revenue_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7d099601-6f8d-fa16-dfd9-aa57aa7729ff")
public static String es_PE_FIELD_Defaults_ProductRevenue_Name="Ventas";

@XendraTrl(Identifier="7d099601-6f8d-fa16-dfd9-aa57aa7729ff")
public static String es_PE_FIELD_Defaults_ProductRevenue_Description="Cuenta de Ingresos por el producto (Cuenta de Ventas)";

@XendraTrl(Identifier="7d099601-6f8d-fa16-dfd9-aa57aa7729ff")
public static String es_PE_FIELD_Defaults_ProductRevenue_Help="Cuenta de Ingresos por el producto (Cuenta de Ventas)  indica la cuenta usada para registrar ingresos de ventas para este producto";

@XendraField(AD_Column_ID="P_Revenue_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Product",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7d099601-6f8d-fa16-dfd9-aa57aa7729ff")
public static final String FIELDNAME_Defaults_ProductRevenue="7d099601-6f8d-fa16-dfd9-aa57aa7729ff";

@XendraTrl(Identifier="268173c1-ce13-29a2-cfbe-7ec6ca00f8fc")
public static String es_PE_COLUMN_P_Revenue_Acct_Name="Ventas";

@XendraColumn(AD_Element_ID="fda0d9fb-f4a4-e939-7cf3-6b0ec27ece2f",ColumnName="P_Revenue_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="268173c1-ce13-29a2-cfbe-7ec6ca00f8fc",
Synchronized="2019-08-30 22:21:00.0")
/** Column name P_Revenue_Acct */
public static final String COLUMNNAME_P_Revenue_Acct = "P_Revenue_Acct";
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

@XendraTrl(Identifier="929996d9-df8a-bc8c-1ad1-49b5192eb1d1")
public static String es_PE_FIELD_Defaults_ProcessNow_Name="Copiar Cuentas";

@XendraTrl(Identifier="929996d9-df8a-bc8c-1ad1-49b5192eb1d1")
public static String es_PE_FIELD_Defaults_ProcessNow_Description="Copiar y sobreescribir todas las cuentas a los valores preestablecidos del sistema (PELIGROSO!!!)";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=770,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="929996d9-df8a-bc8c-1ad1-49b5192eb1d1")
public static final String FIELDNAME_Defaults_ProcessNow="929996d9-df8a-bc8c-1ad1-49b5192eb1d1";

@XendraTrl(Identifier="c256883d-dfaf-d6c9-0b54-1ea9452a9d6a")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="828aca6a-e644-5dcb-4dc9-f310dc2cb7ab",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c256883d-dfaf-d6c9-0b54-1ea9452a9d6a",Synchronized="2019-08-30 22:21:00.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Trade Discount Granted.
@param P_TradeDiscountGrant_Acct Trade Discount Granted Account */
public void setP_TradeDiscountGrant_Acct (int P_TradeDiscountGrant_Acct)
{
set_Value (COLUMNNAME_P_TradeDiscountGrant_Acct, Integer.valueOf(P_TradeDiscountGrant_Acct));
}
/** Get Trade Discount Granted.
@return Trade Discount Granted Account */
public int getP_TradeDiscountGrant_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_P_TradeDiscountGrant_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="061ebc2d-4fdb-ca88-26ea-c574feedcaeb")
public static String es_PE_FIELD_Defaults_TradeDiscountGranted_Name="Descuento Comercial Concedido";

@XendraTrl(Identifier="061ebc2d-4fdb-ca88-26ea-c574feedcaeb")
public static String es_PE_FIELD_Defaults_TradeDiscountGranted_Description="Cuenta de descuento comercial concedido";

@XendraTrl(Identifier="061ebc2d-4fdb-ca88-26ea-c574feedcaeb")
public static String es_PE_FIELD_Defaults_TradeDiscountGranted_Help="La cuenta de descuento comercial concedido indica la cuenta para descuento comercial concedido en facturas de ventas";

@XendraField(AD_Column_ID="P_TradeDiscountGrant_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Product",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=290,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="061ebc2d-4fdb-ca88-26ea-c574feedcaeb")
public static final String FIELDNAME_Defaults_TradeDiscountGranted="061ebc2d-4fdb-ca88-26ea-c574feedcaeb";

@XendraTrl(Identifier="17450abf-52bb-7067-4bfc-d884778374a4")
public static String es_PE_COLUMN_P_TradeDiscountGrant_Acct_Name="Descuento Comercial Concedido";

@XendraColumn(AD_Element_ID="e9f9bf44-94ac-4d3b-b330-3bc1a7a4c6d8",
ColumnName="P_TradeDiscountGrant_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="17450abf-52bb-7067-4bfc-d884778374a4",Synchronized="2019-08-30 22:21:00.0")
/** Column name P_TradeDiscountGrant_Acct */
public static final String COLUMNNAME_P_TradeDiscountGrant_Acct = "P_TradeDiscountGrant_Acct";
/** Set Trade Discount Received.
@param P_TradeDiscountRec_Acct Trade Discount Receivable Account */
public void setP_TradeDiscountRec_Acct (int P_TradeDiscountRec_Acct)
{
set_Value (COLUMNNAME_P_TradeDiscountRec_Acct, Integer.valueOf(P_TradeDiscountRec_Acct));
}
/** Get Trade Discount Received.
@return Trade Discount Receivable Account */
public int getP_TradeDiscountRec_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_P_TradeDiscountRec_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0490d712-35d8-f399-a451-ed60c6611709")
public static String es_PE_FIELD_Defaults_TradeDiscountReceived_Name="Descuento Comercial Recibido";

@XendraTrl(Identifier="0490d712-35d8-f399-a451-ed60c6611709")
public static String es_PE_FIELD_Defaults_TradeDiscountReceived_Description="Cuenta de descuento comercial recibido";

@XendraTrl(Identifier="0490d712-35d8-f399-a451-ed60c6611709")
public static String es_PE_FIELD_Defaults_TradeDiscountReceived_Help="La cuenta de descuento comercial recibido indica la cuenta para descuento en facturas de proveedores";

@XendraField(AD_Column_ID="P_TradeDiscountRec_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Product",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=280,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0490d712-35d8-f399-a451-ed60c6611709")
public static final String FIELDNAME_Defaults_TradeDiscountReceived="0490d712-35d8-f399-a451-ed60c6611709";

@XendraTrl(Identifier="92fee791-3fab-4b1d-7baa-9ea7ad341c8f")
public static String es_PE_COLUMN_P_TradeDiscountRec_Acct_Name="Descuento Comercial Recibido";

@XendraColumn(AD_Element_ID="943a9f87-e68a-413b-f934-894f3f19723b",
ColumnName="P_TradeDiscountRec_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="92fee791-3fab-4b1d-7baa-9ea7ad341c8f",Synchronized="2019-08-30 22:21:00.0")
/** Column name P_TradeDiscountRec_Acct */
public static final String COLUMNNAME_P_TradeDiscountRec_Acct = "P_TradeDiscountRec_Acct";
/** Set Realized Gain Acct.
@param RealizedGain_Acct Realized Gain Account */
public void setRealizedGain_Acct (int RealizedGain_Acct)
{
set_Value (COLUMNNAME_RealizedGain_Acct, Integer.valueOf(RealizedGain_Acct));
}
/** Get Realized Gain Acct.
@return Realized Gain Account */
public int getRealizedGain_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_RealizedGain_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4baefe66-4dbc-976c-5799-c200af590a12")
public static String es_PE_FIELD_Defaults_RealizedGainAcct_Name="Cta. Ganancia Realizada";

@XendraTrl(Identifier="4baefe66-4dbc-976c-5799-c200af590a12")
public static String es_PE_FIELD_Defaults_RealizedGainAcct_Description="Cuenta de ganancia realizada";

@XendraTrl(Identifier="4baefe66-4dbc-976c-5799-c200af590a12")
public static String es_PE_FIELD_Defaults_RealizedGainAcct_Help="La cuenta de ganancia realizada indica la cuenta a ser usada cuando se registran ganancias realizadas por reevaluación de moneda";

@XendraField(AD_Column_ID="RealizedGain_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="General",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=570,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4baefe66-4dbc-976c-5799-c200af590a12")
public static final String FIELDNAME_Defaults_RealizedGainAcct="4baefe66-4dbc-976c-5799-c200af590a12";

@XendraTrl(Identifier="aef8754a-0536-dc12-80eb-1cc25aaa09b6")
public static String es_PE_COLUMN_RealizedGain_Acct_Name="Cta. Ganancia Realizada";

@XendraColumn(AD_Element_ID="b1a37766-a6ee-af2d-cb8e-aa7bd5cdcbb2",ColumnName="RealizedGain_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aef8754a-0536-dc12-80eb-1cc25aaa09b6",
Synchronized="2019-08-30 22:21:00.0")
/** Column name RealizedGain_Acct */
public static final String COLUMNNAME_RealizedGain_Acct = "RealizedGain_Acct";
/** Set Realized Loss Acct.
@param RealizedLoss_Acct Realized Loss Account */
public void setRealizedLoss_Acct (int RealizedLoss_Acct)
{
set_Value (COLUMNNAME_RealizedLoss_Acct, Integer.valueOf(RealizedLoss_Acct));
}
/** Get Realized Loss Acct.
@return Realized Loss Account */
public int getRealizedLoss_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_RealizedLoss_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f0aa6159-47a1-c536-3479-32ab51a08941")
public static String es_PE_FIELD_Defaults_RealizedLossAcct_Name="Cta. Pérdida Realizada";

@XendraTrl(Identifier="f0aa6159-47a1-c536-3479-32ab51a08941")
public static String es_PE_FIELD_Defaults_RealizedLossAcct_Description="Cuenta de pérdida realizada";

@XendraTrl(Identifier="f0aa6159-47a1-c536-3479-32ab51a08941")
public static String es_PE_FIELD_Defaults_RealizedLossAcct_Help="La cuenta de pérdida realizada indica la cuenta a ser usada cuando se registran pérdidas realizadas por reevaluación de moneda";

@XendraField(AD_Column_ID="RealizedLoss_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="General",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=580,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f0aa6159-47a1-c536-3479-32ab51a08941")
public static final String FIELDNAME_Defaults_RealizedLossAcct="f0aa6159-47a1-c536-3479-32ab51a08941";

@XendraTrl(Identifier="b2ffcbad-a8dd-5d11-2233-d8350eb5010d")
public static String es_PE_COLUMN_RealizedLoss_Acct_Name="Cta. Pérdida Realizada";

@XendraColumn(AD_Element_ID="7e5a74b9-ab23-f88b-a100-923d97d74ee4",ColumnName="RealizedLoss_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b2ffcbad-a8dd-5d11-2233-d8350eb5010d",
Synchronized="2019-08-30 22:21:00.0")
/** Column name RealizedLoss_Acct */
public static final String COLUMNNAME_RealizedLoss_Acct = "RealizedLoss_Acct";
/** Set Retention_Apply_Acct.
@param Retention_Apply_Acct Retention_Apply_Acct */
public void setRetention_Apply_Acct (int Retention_Apply_Acct)
{
set_Value (COLUMNNAME_Retention_Apply_Acct, Integer.valueOf(Retention_Apply_Acct));
}
/** Get Retention_Apply_Acct.
@return Retention_Apply_Acct */
public int getRetention_Apply_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Retention_Apply_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ab46fbf1-9877-2ec9-1e62-a72edc691ca6")
public static String es_PE_FIELD_Defaults_Retention_Apply_Acct_Name="Retención Aplicada";

@XendraField(AD_Column_ID="Retention_Apply_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Spot",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=740,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ab46fbf1-9877-2ec9-1e62-a72edc691ca6")
public static final String FIELDNAME_Defaults_Retention_Apply_Acct="ab46fbf1-9877-2ec9-1e62-a72edc691ca6";

@XendraTrl(Identifier="3e1ddd66-ed72-3517-0c9d-6dd2b605dc40")
public static String es_PE_COLUMN_Retention_Apply_Acct_Name="retention_apply_acct";

@XendraColumn(AD_Element_ID="19ef3935-22b9-5bec-6f82-921baf250424",
ColumnName="Retention_Apply_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3e1ddd66-ed72-3517-0c9d-6dd2b605dc40",Synchronized="2019-08-30 22:21:00.0")
/** Column name Retention_Apply_Acct */
public static final String COLUMNNAME_Retention_Apply_Acct = "Retention_Apply_Acct";
/** Set Retention_Collect_Acct.
@param Retention_Collect_Acct Retention_Collect_Acct */
public void setRetention_Collect_Acct (int Retention_Collect_Acct)
{
set_Value (COLUMNNAME_Retention_Collect_Acct, Integer.valueOf(Retention_Collect_Acct));
}
/** Get Retention_Collect_Acct.
@return Retention_Collect_Acct */
public int getRetention_Collect_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Retention_Collect_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="711ecf14-db8f-34d1-df04-9c8891dd552b")
public static String es_PE_FIELD_Defaults_Retention_Collect_Acct_Name="Retención Recogida";

@XendraField(AD_Column_ID="Retention_Collect_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Spot",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=730,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="711ecf14-db8f-34d1-df04-9c8891dd552b")
public static final String FIELDNAME_Defaults_Retention_Collect_Acct="711ecf14-db8f-34d1-df04-9c8891dd552b";

@XendraTrl(Identifier="0ace5714-bb97-e79e-c275-c74abc72218c")
public static String es_PE_COLUMN_Retention_Collect_Acct_Name="retention_collect_acct";

@XendraColumn(AD_Element_ID="f020fe33-b24b-76ba-0b78-f8cad9560505",
ColumnName="Retention_Collect_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0ace5714-bb97-e79e-c275-c74abc72218c",Synchronized="2019-08-30 22:21:00.0")
/** Column name Retention_Collect_Acct */
public static final String COLUMNNAME_Retention_Collect_Acct = "Retention_Collect_Acct";
/** Set Retention_ToCollect_Acct.
@param Retention_ToCollect_Acct Retention_ToCollect_Acct */
public void setRetention_ToCollect_Acct (int Retention_ToCollect_Acct)
{
set_Value (COLUMNNAME_Retention_ToCollect_Acct, Integer.valueOf(Retention_ToCollect_Acct));
}
/** Get Retention_ToCollect_Acct.
@return Retention_ToCollect_Acct */
public int getRetention_ToCollect_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Retention_ToCollect_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4170c6c9-5d45-7c67-b178-89f56e64e745")
public static String es_PE_FIELD_Defaults_Retention_ToCollect_Acct_Name="Retención por Recoger";

@XendraField(AD_Column_ID="Retention_ToCollect_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Spot",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=720,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4170c6c9-5d45-7c67-b178-89f56e64e745")
public static final String FIELDNAME_Defaults_Retention_ToCollect_Acct="4170c6c9-5d45-7c67-b178-89f56e64e745";

@XendraTrl(Identifier="3b129e2f-cc23-6d20-318d-dcc0d786ea6b")
public static String es_PE_COLUMN_Retention_ToCollect_Acct_Name="retention_tocollect_acct";

@XendraColumn(AD_Element_ID="4b6a6e7f-1853-b77c-3773-906e86f8683d",
ColumnName="Retention_ToCollect_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3b129e2f-cc23-6d20-318d-dcc0d786ea6b",Synchronized="2019-08-30 22:21:00.0")
/** Column name Retention_ToCollect_Acct */
public static final String COLUMNNAME_Retention_ToCollect_Acct = "Retention_ToCollect_Acct";
/** Set Tax Credit.
@param T_Credit_Acct Account for Tax you can reclaim */
public void setT_Credit_Acct (int T_Credit_Acct)
{
set_Value (COLUMNNAME_T_Credit_Acct, Integer.valueOf(T_Credit_Acct));
}
/** Get Tax Credit.
@return Account for Tax you can reclaim */
public int getT_Credit_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_T_Credit_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8765e05b-c145-795c-ee2e-4b3de9edfa81")
public static String es_PE_FIELD_Defaults_TaxCredit_Name="Impuesto por Acreditar";

@XendraTrl(Identifier="8765e05b-c145-795c-ee2e-4b3de9edfa81")
public static String es_PE_FIELD_Defaults_TaxCredit_Description="Cuenta para impuestos a reclamar";

@XendraTrl(Identifier="8765e05b-c145-795c-ee2e-4b3de9edfa81")
public static String es_PE_FIELD_Defaults_TaxCredit_Help="La cuenta de Impuesto por Acreditar indica la cuenta usada para acumular impuestos que pueden ser reclamados";

@XendraField(AD_Column_ID="T_Credit_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Tax",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=500,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8765e05b-c145-795c-ee2e-4b3de9edfa81")
public static final String FIELDNAME_Defaults_TaxCredit="8765e05b-c145-795c-ee2e-4b3de9edfa81";

@XendraTrl(Identifier="3f80527a-c52c-46b5-ba12-4457aab156f0")
public static String es_PE_COLUMN_T_Credit_Acct_Name="Impuesto por Acreditar";

@XendraColumn(AD_Element_ID="095c9c14-fb7e-cdcc-055a-438a2629969e",ColumnName="T_Credit_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3f80527a-c52c-46b5-ba12-4457aab156f0",
Synchronized="2019-08-30 22:21:00.0")
/** Column name T_Credit_Acct */
public static final String COLUMNNAME_T_Credit_Acct = "T_Credit_Acct";
/** Set Tax Due.
@param T_Due_Acct Account for Tax you have to pay */
public void setT_Due_Acct (int T_Due_Acct)
{
set_Value (COLUMNNAME_T_Due_Acct, Integer.valueOf(T_Due_Acct));
}
/** Get Tax Due.
@return Account for Tax you have to pay */
public int getT_Due_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_T_Due_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="567231e1-ddc9-98fa-d71c-f7f2dfc2bd38")
public static String es_PE_FIELD_Defaults_TaxDue_Name="Impuestos por pagar";

@XendraTrl(Identifier="567231e1-ddc9-98fa-d71c-f7f2dfc2bd38")
public static String es_PE_FIELD_Defaults_TaxDue_Description="Cuenta para impuestos a pagar.";

@XendraTrl(Identifier="567231e1-ddc9-98fa-d71c-f7f2dfc2bd38")
public static String es_PE_FIELD_Defaults_TaxDue_Help="La cuenta de impuestos por pagar indica la cuenta usada para acumular impuestos que se deben pagar.";

@XendraField(AD_Column_ID="T_Due_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Tax",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=480,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="567231e1-ddc9-98fa-d71c-f7f2dfc2bd38")
public static final String FIELDNAME_Defaults_TaxDue="567231e1-ddc9-98fa-d71c-f7f2dfc2bd38";

@XendraTrl(Identifier="ad31840b-286a-b36f-0ba0-255ca58cbe2f")
public static String es_PE_COLUMN_T_Due_Acct_Name="Impuestos por pagar";

@XendraColumn(AD_Element_ID="fd2e9a6b-7cbb-5efc-ff3d-20d027aafa24",ColumnName="T_Due_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ad31840b-286a-b36f-0ba0-255ca58cbe2f",
Synchronized="2019-08-30 22:21:00.0")
/** Column name T_Due_Acct */
public static final String COLUMNNAME_T_Due_Acct = "T_Due_Acct";
/** Set Tax Expense.
@param T_Expense_Acct Account for paid tax you cannot reclaim */
public void setT_Expense_Acct (int T_Expense_Acct)
{
set_Value (COLUMNNAME_T_Expense_Acct, Integer.valueOf(T_Expense_Acct));
}
/** Get Tax Expense.
@return Account for paid tax you cannot reclaim */
public int getT_Expense_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_T_Expense_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4a19aada-4fc1-c04d-6ec9-ee2d225536c6")
public static String es_PE_FIELD_Defaults_TaxExpense_Name="Impuesto Absorbido";

@XendraTrl(Identifier="4a19aada-4fc1-c04d-6ec9-ee2d225536c6")
public static String es_PE_FIELD_Defaults_TaxExpense_Description="Cuenta para impuestos pagados que usted no puede reclamar";

@XendraTrl(Identifier="4a19aada-4fc1-c04d-6ec9-ee2d225536c6")
public static String es_PE_FIELD_Defaults_TaxExpense_Help="La cuenta de impuestos absorbidos indica la cuenta usada para registrar los impuestos que han sido pagados y que no pueden ser reclamados.";

@XendraField(AD_Column_ID="T_Expense_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Tax",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=520,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4a19aada-4fc1-c04d-6ec9-ee2d225536c6")
public static final String FIELDNAME_Defaults_TaxExpense="4a19aada-4fc1-c04d-6ec9-ee2d225536c6";

@XendraTrl(Identifier="3421a752-2239-9a0a-53e2-66ca0ec93812")
public static String es_PE_COLUMN_T_Expense_Acct_Name="Impuesto Absorbido";

@XendraColumn(AD_Element_ID="885dc125-8497-8762-0b24-50e38967b975",ColumnName="T_Expense_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3421a752-2239-9a0a-53e2-66ca0ec93812",
Synchronized="2019-08-30 22:21:00.0")
/** Column name T_Expense_Acct */
public static final String COLUMNNAME_T_Expense_Acct = "T_Expense_Acct";
/** Set Tax Liability.
@param T_Liability_Acct Account for Tax declaration liability */
public void setT_Liability_Acct (int T_Liability_Acct)
{
set_Value (COLUMNNAME_T_Liability_Acct, Integer.valueOf(T_Liability_Acct));
}
/** Get Tax Liability.
@return Account for Tax declaration liability */
public int getT_Liability_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_T_Liability_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="769d009d-2a97-f16f-4b79-1a1dce645449")
public static String es_PE_FIELD_Defaults_TaxLiability_Name="Impuesto Pagado";

@XendraTrl(Identifier="769d009d-2a97-f16f-4b79-1a1dce645449")
public static String es_PE_FIELD_Defaults_TaxLiability_Description="Cuenta para declaración de impuesto pagado";

@XendraTrl(Identifier="769d009d-2a97-f16f-4b79-1a1dce645449")
public static String es_PE_FIELD_Defaults_TaxLiability_Help="La cuenta de impuesto pagado indica la cuenta usada para registrar su declaración de responsabilidad de impuestos";

@XendraField(AD_Column_ID="T_Liability_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Tax",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=490,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="769d009d-2a97-f16f-4b79-1a1dce645449")
public static final String FIELDNAME_Defaults_TaxLiability="769d009d-2a97-f16f-4b79-1a1dce645449";

@XendraTrl(Identifier="8396c937-863a-edb3-2d56-e9fb4cf062b7")
public static String es_PE_COLUMN_T_Liability_Acct_Name="Impuesto Pagado";

@XendraColumn(AD_Element_ID="6241aa76-5324-6039-cfff-fd749887dde9",ColumnName="T_Liability_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8396c937-863a-edb3-2d56-e9fb4cf062b7",
Synchronized="2019-08-30 22:21:00.0")
/** Column name T_Liability_Acct */
public static final String COLUMNNAME_T_Liability_Acct = "T_Liability_Acct";
/** Set Tax Receivables.
@param T_Receivables_Acct Account for Tax credit after tax declaration */
public void setT_Receivables_Acct (int T_Receivables_Acct)
{
set_Value (COLUMNNAME_T_Receivables_Acct, Integer.valueOf(T_Receivables_Acct));
}
/** Get Tax Receivables.
@return Account for Tax credit after tax declaration */
public int getT_Receivables_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_T_Receivables_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ba0ff107-cf37-589e-d058-85201eb83ae8")
public static String es_PE_FIELD_Defaults_TaxReceivables_Name="Impuesto Acreditado";

@XendraTrl(Identifier="ba0ff107-cf37-589e-d058-85201eb83ae8")
public static String es_PE_FIELD_Defaults_TaxReceivables_Description="Cuenta de Impuesto acreditado después de la declaración de impuestos";

@XendraTrl(Identifier="ba0ff107-cf37-589e-d058-85201eb83ae8")
public static String es_PE_FIELD_Defaults_TaxReceivables_Help="Cuenta de Impuesto acreditado después de la declaración de impuestos";

@XendraField(AD_Column_ID="T_Receivables_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Tax",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=510,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ba0ff107-cf37-589e-d058-85201eb83ae8")
public static final String FIELDNAME_Defaults_TaxReceivables="ba0ff107-cf37-589e-d058-85201eb83ae8";

@XendraTrl(Identifier="27a846c4-a34d-2ddc-0e3e-92d4cd911da5")
public static String es_PE_COLUMN_T_Receivables_Acct_Name="Impuesto Acreditado";

@XendraColumn(AD_Element_ID="b34be93f-75e3-1890-1f1f-c8408ea709ee",ColumnName="T_Receivables_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="27a846c4-a34d-2ddc-0e3e-92d4cd911da5",
Synchronized="2019-08-30 22:21:00.0")
/** Column name T_Receivables_Acct */
public static final String COLUMNNAME_T_Receivables_Acct = "T_Receivables_Acct";
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

@XendraTrl(Identifier="2123df09-0306-e380-ea04-ebad82716c00")
public static String es_PE_FIELD_Defaults_UnearnedRevenue_Name="Ingresos no Devengados";

@XendraTrl(Identifier="2123df09-0306-e380-ea04-ebad82716c00")
public static String es_PE_FIELD_Defaults_UnearnedRevenue_Description="Cuenta para ingresos no devengados";

@XendraTrl(Identifier="2123df09-0306-e380-ea04-ebad82716c00")
public static String es_PE_FIELD_Defaults_UnearnedRevenue_Help="El Ingreso no devengado indica la cuenta usada para registrar facturas enviadas por productos ó servicios que aún no han sido entregados. Es usado en reconocimiento de ingresos.";

@XendraField(AD_Column_ID="UnEarnedRevenue_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Business Partner",
IsDisplayed=true,DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=120,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="2123df09-0306-e380-ea04-ebad82716c00")
public static final String FIELDNAME_Defaults_UnearnedRevenue="2123df09-0306-e380-ea04-ebad82716c00";

@XendraTrl(Identifier="fb068e2a-cc93-1fe9-a7d0-4a2f38d3c88e")
public static String es_PE_COLUMN_UnEarnedRevenue_Acct_Name="Ingresos no Devengados";

@XendraColumn(AD_Element_ID="7e124a02-1533-da59-cb65-c976cc633243",
ColumnName="UnEarnedRevenue_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="fb068e2a-cc93-1fe9-a7d0-4a2f38d3c88e",Synchronized="2019-08-30 22:21:00.0")
/** Column name UnEarnedRevenue_Acct */
public static final String COLUMNNAME_UnEarnedRevenue_Acct = "UnEarnedRevenue_Acct";
/** Set Unrealized Gain Acct.
@param UnrealizedGain_Acct Unrealized Gain Account for currency revaluation */
public void setUnrealizedGain_Acct (int UnrealizedGain_Acct)
{
set_Value (COLUMNNAME_UnrealizedGain_Acct, Integer.valueOf(UnrealizedGain_Acct));
}
/** Get Unrealized Gain Acct.
@return Unrealized Gain Account for currency revaluation */
public int getUnrealizedGain_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_UnrealizedGain_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9117278d-81d6-0d10-8a85-c3b74bc7725f")
public static String es_PE_FIELD_Defaults_UnrealizedGainAcct_Name="Cta. Ganancia No Realizada";

@XendraTrl(Identifier="9117278d-81d6-0d10-8a85-c3b74bc7725f")
public static String es_PE_FIELD_Defaults_UnrealizedGainAcct_Description="Cuenta de ganancia no realizada para reevaluación monedas";

@XendraTrl(Identifier="9117278d-81d6-0d10-8a85-c3b74bc7725f")
public static String es_PE_FIELD_Defaults_UnrealizedGainAcct_Help="La cuenta de ganancia no realizada indica la cuenta a ser usada cuando se registran las ganancias logradas; por la reevaluación de la moneda; que aún no han sido realizadas";

@XendraField(AD_Column_ID="UnrealizedGain_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="General",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=550,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9117278d-81d6-0d10-8a85-c3b74bc7725f")
public static final String FIELDNAME_Defaults_UnrealizedGainAcct="9117278d-81d6-0d10-8a85-c3b74bc7725f";

@XendraTrl(Identifier="6409ff90-c24d-c1bf-8134-106818418daf")
public static String es_PE_COLUMN_UnrealizedGain_Acct_Name="Cta. Ganancia No Realizada";

@XendraColumn(AD_Element_ID="aa435787-ef35-3e4d-ae68-8b3ce73213c1",
ColumnName="UnrealizedGain_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6409ff90-c24d-c1bf-8134-106818418daf",Synchronized="2019-08-30 22:21:00.0")
/** Column name UnrealizedGain_Acct */
public static final String COLUMNNAME_UnrealizedGain_Acct = "UnrealizedGain_Acct";
/** Set Unrealized Loss Acct.
@param UnrealizedLoss_Acct Unrealized Loss Account for currency revaluation */
public void setUnrealizedLoss_Acct (int UnrealizedLoss_Acct)
{
set_Value (COLUMNNAME_UnrealizedLoss_Acct, Integer.valueOf(UnrealizedLoss_Acct));
}
/** Get Unrealized Loss Acct.
@return Unrealized Loss Account for currency revaluation */
public int getUnrealizedLoss_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_UnrealizedLoss_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8bccea36-5338-22c5-fbc5-e6eacf76e8a6")
public static String es_PE_FIELD_Defaults_UnrealizedLossAcct_Name="Cta. Pérdida No Realizada";

@XendraTrl(Identifier="8bccea36-5338-22c5-fbc5-e6eacf76e8a6")
public static String es_PE_FIELD_Defaults_UnrealizedLossAcct_Description="Cuenta de pérdida no realizada para reevaluación monedas";

@XendraTrl(Identifier="8bccea36-5338-22c5-fbc5-e6eacf76e8a6")
public static String es_PE_FIELD_Defaults_UnrealizedLossAcct_Help="La cuenta de pérdida no realizada indica la cuenta a ser usada cuando se registran las pérdidas incurridas; por reevaluación de la moneda; que aún no han sido realizadas";

@XendraField(AD_Column_ID="UnrealizedLoss_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="General",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=560,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8bccea36-5338-22c5-fbc5-e6eacf76e8a6")
public static final String FIELDNAME_Defaults_UnrealizedLossAcct="8bccea36-5338-22c5-fbc5-e6eacf76e8a6";

@XendraTrl(Identifier="9839c5ae-eecb-de4d-69ab-f0414bf37e3e")
public static String es_PE_COLUMN_UnrealizedLoss_Acct_Name="Cta. Pérdida No Realizada";

@XendraColumn(AD_Element_ID="5673552f-a36f-26ee-7aa3-d014efe269b1",
ColumnName="UnrealizedLoss_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9839c5ae-eecb-de4d-69ab-f0414bf37e3e",Synchronized="2019-08-30 22:21:00.0")
/** Column name UnrealizedLoss_Acct */
public static final String COLUMNNAME_UnrealizedLoss_Acct = "UnrealizedLoss_Acct";
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

@XendraTrl(Identifier="7eb116b6-0386-7782-73df-d42bb573c984")
public static String es_PE_FIELD_Defaults_VendorLiability_Name="CxP del Proveedor";

@XendraTrl(Identifier="7eb116b6-0386-7782-73df-d42bb573c984")
public static String es_PE_FIELD_Defaults_VendorLiability_Description="Cuenta por pagar a proveedores";

@XendraTrl(Identifier="7eb116b6-0386-7782-73df-d42bb573c984")
public static String es_PE_FIELD_Defaults_VendorLiability_Help="La cuenta por pagar a proveedores indica la cuenta usada para registrar transacciones para pasivos de proveedores";

@XendraField(AD_Column_ID="V_Liability_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Business Partner",
IsDisplayed=true,DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=130,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="7eb116b6-0386-7782-73df-d42bb573c984")
public static final String FIELDNAME_Defaults_VendorLiability="7eb116b6-0386-7782-73df-d42bb573c984";

@XendraTrl(Identifier="40ac28fa-6b8e-6859-03b9-07281de046c6")
public static String es_PE_COLUMN_V_Liability_Acct_Name="CxP del Proveedor";

@XendraColumn(AD_Element_ID="e29c7545-3824-1bd2-2c19-97e5fec61099",ColumnName="V_Liability_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="40ac28fa-6b8e-6859-03b9-07281de046c6",
Synchronized="2019-08-30 22:21:00.0")
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

@XendraTrl(Identifier="2ca5b53f-80f6-893c-5831-4fa581b4c055")
public static String es_PE_FIELD_Defaults_VendorServiceLiability_Name="CxP del Proveedor de Servicios";

@XendraTrl(Identifier="2ca5b53f-80f6-893c-5831-4fa581b4c055")
public static String es_PE_FIELD_Defaults_VendorServiceLiability_Description="Cuenta por pagar a proveedores de servicios";

@XendraTrl(Identifier="2ca5b53f-80f6-893c-5831-4fa581b4c055")
public static String es_PE_FIELD_Defaults_VendorServiceLiability_Help="La cuenta de pasivos por servicios a proveedores";

@XendraField(AD_Column_ID="V_Liability_Services_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Business Partner",
IsDisplayed=true,DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=140,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="2ca5b53f-80f6-893c-5831-4fa581b4c055")
public static final String FIELDNAME_Defaults_VendorServiceLiability="2ca5b53f-80f6-893c-5831-4fa581b4c055";

@XendraTrl(Identifier="2408b095-bded-23cc-0725-f6d06520e294")
public static String es_PE_COLUMN_V_Liability_Services_Acct_Name="CxP del Proveedor de Servicios";

@XendraColumn(AD_Element_ID="8e204c54-fe89-0381-543a-caba88fb2eb6",
ColumnName="V_Liability_Services_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2408b095-bded-23cc-0725-f6d06520e294",Synchronized="2019-08-30 22:21:00.0")
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

@XendraTrl(Identifier="7ca1aaa1-89ae-b59e-7361-f186b21392c0")
public static String es_PE_FIELD_Defaults_VendorPrepayment_Name="Prepago del proveedor";

@XendraTrl(Identifier="7ca1aaa1-89ae-b59e-7361-f186b21392c0")
public static String es_PE_FIELD_Defaults_VendorPrepayment_Description="Cuenta para prepagos del proveedor";

@XendraTrl(Identifier="7ca1aaa1-89ae-b59e-7361-f186b21392c0")
public static String es_PE_FIELD_Defaults_VendorPrepayment_Help="La cuenta de prepagos del proveedor indica la cuenta usada para registrar pagos anticipados a un proveedor";

@XendraField(AD_Column_ID="V_Prepayment_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Business Partner",
IsDisplayed=true,DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=150,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="7ca1aaa1-89ae-b59e-7361-f186b21392c0")
public static final String FIELDNAME_Defaults_VendorPrepayment="7ca1aaa1-89ae-b59e-7361-f186b21392c0";

@XendraTrl(Identifier="903d7bc7-0414-be32-a5a7-1e31378a301f")
public static String es_PE_COLUMN_V_Prepayment_Acct_Name="Prepago del proveedor";

@XendraColumn(AD_Element_ID="cd6be1eb-3769-4db5-ea33-4b298a8725a5",ColumnName="V_Prepayment_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="903d7bc7-0414-be32-a5a7-1e31378a301f",
Synchronized="2019-08-30 22:21:00.0")
/** Column name V_Prepayment_Acct */
public static final String COLUMNNAME_V_Prepayment_Acct = "V_Prepayment_Acct";
/** Set Warehouse Differences.
@param W_Differences_Acct Warehouse Differences Account */
public void setW_Differences_Acct (int W_Differences_Acct)
{
set_Value (COLUMNNAME_W_Differences_Acct, Integer.valueOf(W_Differences_Acct));
}
/** Get Warehouse Differences.
@return Warehouse Differences Account */
public int getW_Differences_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_W_Differences_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d98263b4-41e2-090e-1bcb-f5be0d9a0b33")
public static String es_PE_FIELD_Defaults_WarehouseDifferences_Name="Discrepancia en Almacén";

@XendraTrl(Identifier="d98263b4-41e2-090e-1bcb-f5be0d9a0b33")
public static String es_PE_FIELD_Defaults_WarehouseDifferences_Description="Cuenta de discrepancias en almacén";

@XendraTrl(Identifier="d98263b4-41e2-090e-1bcb-f5be0d9a0b33")
public static String es_PE_FIELD_Defaults_WarehouseDifferences_Help="La cuenta diferencia en almacenes indica la cuenta usada para registrar las diferencias identificadas durante el conteo de inventario";

@XendraField(AD_Column_ID="W_Differences_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Warehouse",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=320,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d98263b4-41e2-090e-1bcb-f5be0d9a0b33")
public static final String FIELDNAME_Defaults_WarehouseDifferences="d98263b4-41e2-090e-1bcb-f5be0d9a0b33";

@XendraTrl(Identifier="e69a40b5-cbc3-7704-c598-e7e959fd1fcb")
public static String es_PE_COLUMN_W_Differences_Acct_Name="Discrepancia en Almacén";

@XendraColumn(AD_Element_ID="42655a2b-4ea5-e691-e289-4c2f61a877d5",ColumnName="W_Differences_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e69a40b5-cbc3-7704-c598-e7e959fd1fcb",
Synchronized="2019-08-30 22:21:00.0")
/** Column name W_Differences_Acct */
public static final String COLUMNNAME_W_Differences_Acct = "W_Differences_Acct";
/** Set Inventory Adjustment.
@param W_InvActualAdjust_Acct Account for Inventory value adjustments for Actual Costing */
public void setW_InvActualAdjust_Acct (int W_InvActualAdjust_Acct)
{
set_Value (COLUMNNAME_W_InvActualAdjust_Acct, Integer.valueOf(W_InvActualAdjust_Acct));
}
/** Get Inventory Adjustment.
@return Account for Inventory value adjustments for Actual Costing */
public int getW_InvActualAdjust_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_W_InvActualAdjust_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="bab9f82d-1cf1-b530-8282-70bc268fa31c")
public static String es_PE_FIELD_Defaults_InventoryAdjustment_Name="Ajuste de Inventario";

@XendraTrl(Identifier="bab9f82d-1cf1-b530-8282-70bc268fa31c")
public static String es_PE_FIELD_Defaults_InventoryAdjustment_Description="Cuenta de Ajuste del valor del inventario por costeo actual.";

@XendraTrl(Identifier="bab9f82d-1cf1-b530-8282-70bc268fa31c")
public static String es_PE_FIELD_Defaults_InventoryAdjustment_Help="En sistemas de costeo actual; esta cuenta se usa para registrar ajustes al valor del inventario. Usted podría establecerla a la cuenta estándar de Activo de Inventarios.";

@XendraField(AD_Column_ID="W_InvActualAdjust_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Warehouse",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=310,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bab9f82d-1cf1-b530-8282-70bc268fa31c")
public static final String FIELDNAME_Defaults_InventoryAdjustment="bab9f82d-1cf1-b530-8282-70bc268fa31c";

@XendraTrl(Identifier="fbafc790-be54-adc1-aecd-756f7191878c")
public static String es_PE_COLUMN_W_InvActualAdjust_Acct_Name="Ajuste de Inventario";

@XendraColumn(AD_Element_ID="78b1be4c-95ca-de26-d1ca-67b2d396b657",
ColumnName="W_InvActualAdjust_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="fbafc790-be54-adc1-aecd-756f7191878c",Synchronized="2019-08-30 22:21:01.0")
/** Column name W_InvActualAdjust_Acct */
public static final String COLUMNNAME_W_InvActualAdjust_Acct = "W_InvActualAdjust_Acct";
/** Set (Not Used).
@param W_Inventory_Acct Warehouse Inventory Asset Account - Currently not used */
public void setW_Inventory_Acct (int W_Inventory_Acct)
{
set_Value (COLUMNNAME_W_Inventory_Acct, Integer.valueOf(W_Inventory_Acct));
}
/** Get (Not Used).
@return Warehouse Inventory Asset Account - Currently not used */
public int getW_Inventory_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_W_Inventory_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c52efa96-3e99-c7d7-4afc-d26917278900")
public static String es_PE_FIELD_Defaults_NotUsed_Name="Inventario de Materia Prima";

@XendraTrl(Identifier="c52efa96-3e99-c7d7-4afc-d26917278900")
public static String es_PE_FIELD_Defaults_NotUsed_Description="Cuenta de inventarios";

@XendraTrl(Identifier="c52efa96-3e99-c7d7-4afc-d26917278900")
public static String es_PE_FIELD_Defaults_NotUsed_Help="La cuenta de inventarios identifica la cuenta usada para registrar el valor de su inventario.";

@XendraField(AD_Column_ID="W_Inventory_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Warehouse",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=300,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c52efa96-3e99-c7d7-4afc-d26917278900")
public static final String FIELDNAME_Defaults_NotUsed="c52efa96-3e99-c7d7-4afc-d26917278900";

@XendraTrl(Identifier="80fd93ec-acf3-1380-ee37-f848dcc2f0a4")
public static String es_PE_COLUMN_W_Inventory_Acct_Name="Inventario de Materia Prima";

@XendraColumn(AD_Element_ID="1ff46904-f77b-eeed-a62f-69e39ce2315e",ColumnName="W_Inventory_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="80fd93ec-acf3-1380-ee37-f848dcc2f0a4",
Synchronized="2019-08-30 22:21:01.0")
/** Column name W_Inventory_Acct */
public static final String COLUMNNAME_W_Inventory_Acct = "W_Inventory_Acct";
/** Set Withholding.
@param Withholding_Acct Account for Withholdings */
public void setWithholding_Acct (int Withholding_Acct)
{
set_Value (COLUMNNAME_Withholding_Acct, Integer.valueOf(Withholding_Acct));
}
/** Get Withholding.
@return Account for Withholdings */
public int getWithholding_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Withholding_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="57a2cdfe-54b6-f0b2-9b31-36de9ccb7b69")
public static String es_PE_FIELD_Defaults_Withholding_Name="Retención";

@XendraTrl(Identifier="57a2cdfe-54b6-f0b2-9b31-36de9ccb7b69")
public static String es_PE_FIELD_Defaults_Withholding_Description="Cuenta de Retenciones";

@XendraTrl(Identifier="57a2cdfe-54b6-f0b2-9b31-36de9ccb7b69")
public static String es_PE_FIELD_Defaults_Withholding_Help="La cuenta de Retenciones indica la cuenta para registrar retenciones";

@XendraField(AD_Column_ID="Withholding_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Spot",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=750,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="57a2cdfe-54b6-f0b2-9b31-36de9ccb7b69")
public static final String FIELDNAME_Defaults_Withholding="57a2cdfe-54b6-f0b2-9b31-36de9ccb7b69";

@XendraTrl(Identifier="34057d01-0c68-af10-f72f-ce5dc00cdd93")
public static String es_PE_COLUMN_Withholding_Acct_Name="Retención";

@XendraColumn(AD_Element_ID="0bfcae8b-77ff-accf-048a-406950de843b",ColumnName="Withholding_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="34057d01-0c68-af10-f72f-ce5dc00cdd93",
Synchronized="2019-08-30 22:21:01.0")
/** Column name Withholding_Acct */
public static final String COLUMNNAME_Withholding_Acct = "Withholding_Acct";
/** Set WithholdingApply_Acct.
@param WithholdingApply_Acct WithholdingApply_Acct */
public void setWithholdingApply_Acct (int WithholdingApply_Acct)
{
set_Value (COLUMNNAME_WithholdingApply_Acct, Integer.valueOf(WithholdingApply_Acct));
}
/** Get WithholdingApply_Acct.
@return WithholdingApply_Acct */
public int getWithholdingApply_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_WithholdingApply_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="24ea50b5-bfbd-4c97-9491-594421b5ef5c")
public static String es_PE_FIELD_Defaults_WithholdingApply_Acct_Name="Retencion aplicada";

@XendraField(AD_Column_ID="WithholdingApply_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Spot",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=760,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-03 17:35:35.0",
Identifier="24ea50b5-bfbd-4c97-9491-594421b5ef5c")
public static final String FIELDNAME_Defaults_WithholdingApply_Acct="24ea50b5-bfbd-4c97-9491-594421b5ef5c";

@XendraTrl(Identifier="9c1caacc-6bbf-4b6d-88ca-0d067dff8da8")
public static String es_PE_COLUMN_WithholdingApply_Acct_Name="WithholdingApply_Acct";

@XendraColumn(AD_Element_ID="da8ffbbe-c0a8-4fd5-805b-177f86451703",
ColumnName="WithholdingApply_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9c1caacc-6bbf-4b6d-88ca-0d067dff8da8",Synchronized="2019-08-30 22:21:01.0")
/** Column name WithholdingApply_Acct */
public static final String COLUMNNAME_WithholdingApply_Acct = "WithholdingApply_Acct";
/** Set Inventory Revaluation.
@param W_Revaluation_Acct Account for Inventory Revaluation */
public void setW_Revaluation_Acct (int W_Revaluation_Acct)
{
set_Value (COLUMNNAME_W_Revaluation_Acct, Integer.valueOf(W_Revaluation_Acct));
}
/** Get Inventory Revaluation.
@return Account for Inventory Revaluation */
public int getW_Revaluation_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_W_Revaluation_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="33caba81-9ecb-1513-b6a7-f9b8601e1c75")
public static String es_PE_FIELD_Defaults_InventoryRevaluation_Name="Reevaluación de Inventario";

@XendraTrl(Identifier="33caba81-9ecb-1513-b6a7-f9b8601e1c75")
public static String es_PE_FIELD_Defaults_InventoryRevaluation_Description="Cuenta de Reevaluación de Inventarios";

@XendraTrl(Identifier="33caba81-9ecb-1513-b6a7-f9b8601e1c75")
public static String es_PE_FIELD_Defaults_InventoryRevaluation_Help="La cuenta de Revaluación de Inventarios identifica la cuenta usada y los cambios del inventario debido a la evaluación actual.";

@XendraField(AD_Column_ID="W_Revaluation_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Warehouse",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=330,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="33caba81-9ecb-1513-b6a7-f9b8601e1c75")
public static final String FIELDNAME_Defaults_InventoryRevaluation="33caba81-9ecb-1513-b6a7-f9b8601e1c75";

@XendraTrl(Identifier="466a1313-675b-9418-b997-80ff82af192c")
public static String es_PE_COLUMN_W_Revaluation_Acct_Name="Reevaluación de Inventario";

@XendraColumn(AD_Element_ID="97e7cc75-6202-6b6d-8672-193e8c5c026e",ColumnName="W_Revaluation_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="466a1313-675b-9418-b997-80ff82af192c",
Synchronized="2019-08-30 22:21:01.0")
/** Column name W_Revaluation_Acct */
public static final String COLUMNNAME_W_Revaluation_Acct = "W_Revaluation_Acct";
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

@XendraTrl(Identifier="bd5e871f-85b6-4f73-c9d5-968e0cb31d65")
public static String es_PE_FIELD_Defaults_Write_OffGain_Name="Ajustes Ganancia";

@XendraTrl(Identifier="bd5e871f-85b6-4f73-c9d5-968e0cb31d65")
public static String es_PE_FIELD_Defaults_Write_OffGain_Description="Cuenta de Ajustes en Cuentas por Cobrar (C x C) para diferencia positiva";

@XendraTrl(Identifier="bd5e871f-85b6-4f73-c9d5-968e0cb31d65")
public static String es_PE_FIELD_Defaults_Write_OffGain_Help="La cuenta de ajustes identifica la cuenta para las transacciones de ajuste en libros, cuando la diferencia es positiva.";

@XendraField(AD_Column_ID="WriteOffGain_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Business Partner",
IsDisplayed=true,DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="bd5e871f-85b6-4f73-c9d5-968e0cb31d65")
public static final String FIELDNAME_Defaults_Write_OffGain="bd5e871f-85b6-4f73-c9d5-968e0cb31d65";

@XendraTrl(Identifier="bdc46e91-a468-d48e-5f9c-59c67068dd38")
public static String es_PE_COLUMN_WriteOffGain_Acct_Name="Ajustes Ganancia";

@XendraColumn(AD_Element_ID="daf9a398-1bce-6a85-1193-d964fadd65ba",ColumnName="WriteOffGain_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bdc46e91-a468-d48e-5f9c-59c67068dd38",
Synchronized="2019-08-30 22:21:01.0")
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

@XendraTrl(Identifier="41f20080-fd74-51c9-7d05-817ee4c5916e")
public static String es_PE_FIELD_Defaults_WriteOffLoss_Name="Ajustes Pérdida";

@XendraField(AD_Column_ID="WriteOffLoss_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="dd25cc85-815f-406f-ad6e-9021ce5214b7",AD_FieldGroup_ID="Business Partner",
IsDisplayed=true,DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="41f20080-fd74-51c9-7d05-817ee4c5916e")
public static final String FIELDNAME_Defaults_WriteOffLoss="41f20080-fd74-51c9-7d05-817ee4c5916e";

@XendraTrl(Identifier="5d419f1b-4a07-9c95-3b81-392e9ccf23ad")
public static String es_PE_COLUMN_WriteOffLoss_Acct_Name="Write Off Loss";

@XendraColumn(AD_Element_ID="ff746bbd-0d5e-ba72-adff-544de8c5e373",ColumnName="WriteOffLoss_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5d419f1b-4a07-9c95-3b81-392e9ccf23ad",
Synchronized="2019-08-30 22:21:01.0")
/** Column name WriteOffLoss_Acct */
public static final String COLUMNNAME_WriteOffLoss_Acct = "WriteOffLoss_Acct";
}
