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
/** Generated Model for Fact_Acct_Balance
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_Fact_Acct_Balance extends PO
{
/** Standard Constructor
@param ctx context
@param Fact_Acct_Balance_ID id
@param trxName transaction
*/
public X_Fact_Acct_Balance (Properties ctx, int Fact_Acct_Balance_ID, String trxName)
{
super (ctx, Fact_Acct_Balance_ID, trxName);
/** if (Fact_Acct_Balance_ID == 0)
{
setAccount_ID (0);
setAmtAcctCr (Env.ZERO);	
// 0
setAmtAcctDr (Env.ZERO);	
// 0
setC_AcctSchema_ID (0);
setDateAcct (new Timestamp(System.currentTimeMillis()));
setPostingType (null);
setQty (Env.ZERO);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_Fact_Acct_Balance (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=547 */
public static int Table_ID=MTable.getTable_ID("Fact_Acct_Balance");

@XendraTrl(Identifier="3c686acd-5f9e-f206-b2b0-647bd6fdccb8")
public static String es_PE_TAB_DailyBalances_Description="Balance Diario de la Contabilidad";

@XendraTrl(Identifier="3c686acd-5f9e-f206-b2b0-647bd6fdccb8")
public static String es_PE_TAB_DailyBalances_Name="Balances Diarios";

@XendraTab(Name="Daily Balances",Description="View daily accounting balances",Help="",
AD_Window_ID="a2cc7779-abfc-7453-aa0f-0fcfd29b77d6",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,WhereClause="",
OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="3c686acd-5f9e-f206-b2b0-647bd6fdccb8",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_DailyBalances="3c686acd-5f9e-f206-b2b0-647bd6fdccb8";

@XendraTrl(Identifier="bd2ced62-f0b5-77ca-aaa2-827a8cc13058")
public static String es_PE_TABLE_Fact_Acct_Balance_Name="Fact_Acct_Balance";

@XendraTable(Name="Fact_Acct_Balance",AD_Package_ID="2ac04657-d663-47c2-4ec1-927ad71f1e96",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="Fact_Acct_Balance",AccessLevel="3",AD_Window_ID="a2cc7779-abfc-7453-aa0f-0fcfd29b77d6",
AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.accounting",
Identifier="bd2ced62-f0b5-77ca-aaa2-827a8cc13058",Synchronized="2020-03-03 21:37:51.0")
/** TableName=Fact_Acct_Balance */
public static final String Table_Name="Fact_Acct_Balance";


@XendraIndex(Name="fact_acct_balance_akey",Identifier="9adb2e2d-370c-139f-0ab6-039bcb3d5913",
Column_Names="ad_client_id, ad_org_id, c_acctschema_id, dateacct, account_id, postingtype, m_product_id, c_bpartner_id, c_project_id, ad_orgtrx_id, c_salesregion_id, c_activity_id, c_campaign_id, c_locto_id, c_locfrom_id, user1_id, user2_id, gl_budget_id",
IsUnique="true",TableIdentifier="9adb2e2d-370c-139f-0ab6-039bcb3d5913",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_fact_acct_balance_akey = "9adb2e2d-370c-139f-0ab6-039bcb3d5913";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"Fact_Acct_Balance");

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
    Table_ID = MTable.getTable_ID("Fact_Acct_Balance");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_Fact_Acct_Balance[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Account.
@param Account_ID Account used */
public void setAccount_ID (int Account_ID)
{
if (Account_ID < 1) throw new IllegalArgumentException ("Account_ID is mandatory.");
set_Value (COLUMNNAME_Account_ID, Integer.valueOf(Account_ID));
}
/** Get Account.
@return Account used */
public int getAccount_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Account_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a37295dd-7c06-532f-e85d-8f55c4b0d15a")
public static String es_PE_FIELD_DailyBalances_Account_Name="Cuenta";

@XendraTrl(Identifier="a37295dd-7c06-532f-e85d-8f55c4b0d15a")
public static String es_PE_FIELD_DailyBalances_Account_Description="Cuenta usada";

@XendraTrl(Identifier="a37295dd-7c06-532f-e85d-8f55c4b0d15a")
public static String es_PE_FIELD_DailyBalances_Account_Help="La cuenta (natural) usada";

@XendraField(AD_Column_ID="Account_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3c686acd-5f9e-f206-b2b0-647bd6fdccb8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=60,SortNo=3,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a37295dd-7c06-532f-e85d-8f55c4b0d15a")
public static final String FIELDNAME_DailyBalances_Account="a37295dd-7c06-532f-e85d-8f55c4b0d15a";

@XendraTrl(Identifier="52ace34e-583c-682a-21e1-e958b322496a")
public static String es_PE_COLUMN_Account_ID_Name="Cuenta";

@XendraColumn(AD_Element_ID="80f1c2b7-bd3e-7c80-0596-67c2f7ca3812",ColumnName="Account_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="4a70ea12-0269-0422-814e-17afaa3a5479",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=true,SeqNo=3,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="52ace34e-583c-682a-21e1-e958b322496a",Synchronized="2019-08-30 22:22:28.0")
/** Column name Account_ID */
public static final String COLUMNNAME_Account_ID = "Account_ID";
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

@XendraTrl(Identifier="58523877-e48c-ce3d-bf0f-3c5ccc7ab541")
public static String es_PE_FIELD_DailyBalances_TrxOrganization_Name="Organización de la Trans.";

@XendraTrl(Identifier="58523877-e48c-ce3d-bf0f-3c5ccc7ab541")
public static String es_PE_FIELD_DailyBalances_TrxOrganization_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="58523877-e48c-ce3d-bf0f-3c5ccc7ab541")
public static String es_PE_FIELD_DailyBalances_TrxOrganization_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3c686acd-5f9e-f206-b2b0-647bd6fdccb8",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="58523877-e48c-ce3d-bf0f-3c5ccc7ab541")
public static final String FIELDNAME_DailyBalances_TrxOrganization="58523877-e48c-ce3d-bf0f-3c5ccc7ab541";

@XendraTrl(Identifier="10f9250d-d3df-6cf2-621b-2e834bbe4254")
public static String es_PE_COLUMN_AD_OrgTrx_ID_Name="Organización de la Trans.";

@XendraColumn(AD_Element_ID="b4180358-67aa-fe55-0409-6367a60e0a2e",ColumnName="AD_OrgTrx_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="c51c396d-3026-2c1f-b979-24961a8cd969",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="10f9250d-d3df-6cf2-621b-2e834bbe4254",Synchronized="2019-08-30 22:22:28.0")
/** Column name AD_OrgTrx_ID */
public static final String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
/** Set Accounted Credit.
@param AmtAcctCr Accounted Credit Amount */
public void setAmtAcctCr (BigDecimal AmtAcctCr)
{
if (AmtAcctCr == null) throw new IllegalArgumentException ("AmtAcctCr is mandatory.");
set_Value (COLUMNNAME_AmtAcctCr, AmtAcctCr);
}
/** Get Accounted Credit.
@return Accounted Credit Amount */
public BigDecimal getAmtAcctCr() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtAcctCr);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="a97da3c0-b7f1-c87a-db9a-e222f28251d9")
public static String es_PE_FIELD_DailyBalances_AccountedCredit_Name="Crédito Contabilizado";

@XendraTrl(Identifier="a97da3c0-b7f1-c87a-db9a-e222f28251d9")
public static String es_PE_FIELD_DailyBalances_AccountedCredit_Description="Total del crédito contabilizado";

@XendraTrl(Identifier="a97da3c0-b7f1-c87a-db9a-e222f28251d9")
public static String es_PE_FIELD_DailyBalances_AccountedCredit_Help="El total del crédito de la cuenta indica el total de la transacción convertido a esta transacción";

@XendraField(AD_Column_ID="AmtAcctCr",IsCentrallyMaintained=true,
AD_Tab_ID="3c686acd-5f9e-f206-b2b0-647bd6fdccb8",AD_FieldGroup_ID="Amounts",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=230,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a97da3c0-b7f1-c87a-db9a-e222f28251d9")
public static final String FIELDNAME_DailyBalances_AccountedCredit="a97da3c0-b7f1-c87a-db9a-e222f28251d9";

@XendraTrl(Identifier="8e83194c-c258-f9a5-c41d-a96f6136bdb7")
public static String es_PE_COLUMN_AmtAcctCr_Name="Crédito Contabilizado";

@XendraColumn(AD_Element_ID="945e7d70-99b5-5eaf-31ef-c5f460f7626c",ColumnName="AmtAcctCr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8e83194c-c258-f9a5-c41d-a96f6136bdb7",
Synchronized="2019-08-30 22:22:28.0")
/** Column name AmtAcctCr */
public static final String COLUMNNAME_AmtAcctCr = "AmtAcctCr";
/** Set Accounted Debit.
@param AmtAcctDr Accounted Debit Amount */
public void setAmtAcctDr (BigDecimal AmtAcctDr)
{
if (AmtAcctDr == null) throw new IllegalArgumentException ("AmtAcctDr is mandatory.");
set_Value (COLUMNNAME_AmtAcctDr, AmtAcctDr);
}
/** Get Accounted Debit.
@return Accounted Debit Amount */
public BigDecimal getAmtAcctDr() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtAcctDr);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="418c409d-4e20-fae2-71c0-7bfb33f6bd6b")
public static String es_PE_FIELD_DailyBalances_AccountedDebit_Name="Débito Contabilizado";

@XendraTrl(Identifier="418c409d-4e20-fae2-71c0-7bfb33f6bd6b")
public static String es_PE_FIELD_DailyBalances_AccountedDebit_Description="Débito";

@XendraTrl(Identifier="418c409d-4e20-fae2-71c0-7bfb33f6bd6b")
public static String es_PE_FIELD_DailyBalances_AccountedDebit_Help="El total del debito de la cuenta indica el total de la transacción convertido a esta transacción";

@XendraField(AD_Column_ID="AmtAcctDr",IsCentrallyMaintained=true,
AD_Tab_ID="3c686acd-5f9e-f206-b2b0-647bd6fdccb8",AD_FieldGroup_ID="Amounts",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="418c409d-4e20-fae2-71c0-7bfb33f6bd6b")
public static final String FIELDNAME_DailyBalances_AccountedDebit="418c409d-4e20-fae2-71c0-7bfb33f6bd6b";

@XendraTrl(Identifier="8374b077-186a-cd04-6652-da92783621b3")
public static String es_PE_COLUMN_AmtAcctDr_Name="Débito Contabilizado";

@XendraColumn(AD_Element_ID="67410612-76a4-c113-8594-305f58926372",ColumnName="AmtAcctDr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8374b077-186a-cd04-6652-da92783621b3",
Synchronized="2019-08-30 22:22:28.0")
/** Column name AmtAcctDr */
public static final String COLUMNNAME_AmtAcctDr = "AmtAcctDr";
/** Set Accounting Schema.
@param C_AcctSchema_ID Rules for accounting */
public void setC_AcctSchema_ID (int C_AcctSchema_ID)
{
if (C_AcctSchema_ID < 1) throw new IllegalArgumentException ("C_AcctSchema_ID is mandatory.");
set_Value (COLUMNNAME_C_AcctSchema_ID, Integer.valueOf(C_AcctSchema_ID));
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

@XendraTrl(Identifier="1fd3d1f7-550b-7a4d-1133-bdcd03213547")
public static String es_PE_FIELD_DailyBalances_AccountingSchema_Name="Esquema Contable";

@XendraTrl(Identifier="1fd3d1f7-550b-7a4d-1133-bdcd03213547")
public static String es_PE_FIELD_DailyBalances_AccountingSchema_Description="Reglas para contabilizar";

@XendraTrl(Identifier="1fd3d1f7-550b-7a4d-1133-bdcd03213547")
public static String es_PE_FIELD_DailyBalances_AccountingSchema_Help="Un esquema contable define las reglas contables usadas tales como método de costeo; moneda y calendario";

@XendraField(AD_Column_ID="C_AcctSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3c686acd-5f9e-f206-b2b0-647bd6fdccb8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1fd3d1f7-550b-7a4d-1133-bdcd03213547")
public static final String FIELDNAME_DailyBalances_AccountingSchema="1fd3d1f7-550b-7a4d-1133-bdcd03213547";

@XendraTrl(Identifier="28d63972-48a5-4799-21bc-73501ed04162")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="28d63972-48a5-4799-21bc-73501ed04162",
Synchronized="2019-08-30 22:22:28.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
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

@XendraTrl(Identifier="ffcb6cb7-a08e-635d-6028-bac92163c367")
public static String es_PE_FIELD_DailyBalances_Activity_Name="Tipo de Gasto";

@XendraTrl(Identifier="ffcb6cb7-a08e-635d-6028-bac92163c367")
public static String es_PE_FIELD_DailyBalances_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="ffcb6cb7-a08e-635d-6028-bac92163c367")
public static String es_PE_FIELD_DailyBalances_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3c686acd-5f9e-f206-b2b0-647bd6fdccb8",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ffcb6cb7-a08e-635d-6028-bac92163c367")
public static final String FIELDNAME_DailyBalances_Activity="ffcb6cb7-a08e-635d-6028-bac92163c367";

@XendraTrl(Identifier="ee0a4ba7-727e-30c8-dfe5-e924a915f60d")
public static String es_PE_COLUMN_C_Activity_ID_Name="Tipo de Gasto";

@XendraColumn(AD_Element_ID="bfeadbb3-d866-26e3-8eee-3e2fdf0ff753",ColumnName="C_Activity_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ee0a4ba7-727e-30c8-dfe5-e924a915f60d",
Synchronized="2019-08-30 22:22:28.0")
/** Column name C_Activity_ID */
public static final String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID <= 0) set_Value (COLUMNNAME_C_BPartner_ID, null);
 else 
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

@XendraTrl(Identifier="80729948-7175-a591-c5e3-4b9024bb3577")
public static String es_PE_FIELD_DailyBalances_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="80729948-7175-a591-c5e3-4b9024bb3577")
public static String es_PE_FIELD_DailyBalances_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="80729948-7175-a591-c5e3-4b9024bb3577")
public static String es_PE_FIELD_DailyBalances_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3c686acd-5f9e-f206-b2b0-647bd6fdccb8",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="80729948-7175-a591-c5e3-4b9024bb3577")
public static final String FIELDNAME_DailyBalances_BusinessPartner="80729948-7175-a591-c5e3-4b9024bb3577";

@XendraTrl(Identifier="5b6c53ab-e01d-8286-e0bd-19cb8664fb6e")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5b6c53ab-e01d-8286-e0bd-19cb8664fb6e",
Synchronized="2019-08-30 22:22:28.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
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

@XendraTrl(Identifier="532b4504-cdc4-63d2-4a67-27cb5bdb1079")
public static String es_PE_FIELD_DailyBalances_Campaign_Name="Campaña";

@XendraTrl(Identifier="532b4504-cdc4-63d2-4a67-27cb5bdb1079")
public static String es_PE_FIELD_DailyBalances_Campaign_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="532b4504-cdc4-63d2-4a67-27cb5bdb1079")
public static String es_PE_FIELD_DailyBalances_Campaign_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3c686acd-5f9e-f206-b2b0-647bd6fdccb8",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="532b4504-cdc4-63d2-4a67-27cb5bdb1079")
public static final String FIELDNAME_DailyBalances_Campaign="532b4504-cdc4-63d2-4a67-27cb5bdb1079";

@XendraTrl(Identifier="ed343c91-bec9-9a62-d2f3-4642827749bb")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaña";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ed343c91-bec9-9a62-d2f3-4642827749bb",
Synchronized="2019-08-30 22:22:28.0")
/** Column name C_Campaign_ID */
public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
/** Set Location From.
@param C_LocFrom_ID Location that inventory was moved from */
public void setC_LocFrom_ID (int C_LocFrom_ID)
{
if (C_LocFrom_ID <= 0) set_Value (COLUMNNAME_C_LocFrom_ID, null);
 else 
set_Value (COLUMNNAME_C_LocFrom_ID, Integer.valueOf(C_LocFrom_ID));
}
/** Get Location From.
@return Location that inventory was moved from */
public int getC_LocFrom_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_LocFrom_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1a3f502f-00b7-1a42-1bf3-e0471613f873")
public static String es_PE_FIELD_DailyBalances_LocationFrom_Name="Desde Localización";

@XendraTrl(Identifier="1a3f502f-00b7-1a42-1bf3-e0471613f873")
public static String es_PE_FIELD_DailyBalances_LocationFrom_Description="Ubicación desde la que el inventario fue movido";

@XendraTrl(Identifier="1a3f502f-00b7-1a42-1bf3-e0471613f873")
public static String es_PE_FIELD_DailyBalances_LocationFrom_Help="La ubicación desde indica la ubicación desde la que un producto fue movido";

@XendraField(AD_Column_ID="C_LocFrom_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3c686acd-5f9e-f206-b2b0-647bd6fdccb8",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1a3f502f-00b7-1a42-1bf3-e0471613f873")
public static final String FIELDNAME_DailyBalances_LocationFrom="1a3f502f-00b7-1a42-1bf3-e0471613f873";

@XendraTrl(Identifier="0874bdc1-29f7-9e2b-b8c0-b3aa30707a3f")
public static String es_PE_COLUMN_C_LocFrom_ID_Name="Desde Localización";

@XendraColumn(AD_Element_ID="5c54374e-b27b-3cd4-f5a8-8705436152bc",ColumnName="C_LocFrom_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="69189951-7109-d2c7-f034-b4660d43b572",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0874bdc1-29f7-9e2b-b8c0-b3aa30707a3f",Synchronized="2019-08-30 22:22:28.0")
/** Column name C_LocFrom_ID */
public static final String COLUMNNAME_C_LocFrom_ID = "C_LocFrom_ID";
/** Set Location To.
@param C_LocTo_ID Location that inventory was moved to */
public void setC_LocTo_ID (int C_LocTo_ID)
{
if (C_LocTo_ID <= 0) set_Value (COLUMNNAME_C_LocTo_ID, null);
 else 
set_Value (COLUMNNAME_C_LocTo_ID, Integer.valueOf(C_LocTo_ID));
}
/** Get Location To.
@return Location that inventory was moved to */
public int getC_LocTo_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_LocTo_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7e53e265-66e4-8923-3f4f-8115dc090cd2")
public static String es_PE_FIELD_DailyBalances_LocationTo_Name="A Localización";

@XendraTrl(Identifier="7e53e265-66e4-8923-3f4f-8115dc090cd2")
public static String es_PE_FIELD_DailyBalances_LocationTo_Description="Ubicación a la que el inventario fue movido.";

@XendraTrl(Identifier="7e53e265-66e4-8923-3f4f-8115dc090cd2")
public static String es_PE_FIELD_DailyBalances_LocationTo_Help="La Ubicación A indica la ubicación a la que un producto fue movido.";

@XendraField(AD_Column_ID="C_LocTo_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3c686acd-5f9e-f206-b2b0-647bd6fdccb8",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7e53e265-66e4-8923-3f4f-8115dc090cd2")
public static final String FIELDNAME_DailyBalances_LocationTo="7e53e265-66e4-8923-3f4f-8115dc090cd2";

@XendraTrl(Identifier="afbcb2eb-f9d1-796b-6d8b-8cfb778c662d")
public static String es_PE_COLUMN_C_LocTo_ID_Name="A Localización";

@XendraColumn(AD_Element_ID="531e981d-5722-db37-a6eb-54ec21b60a90",ColumnName="C_LocTo_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="69189951-7109-d2c7-f034-b4660d43b572",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="afbcb2eb-f9d1-796b-6d8b-8cfb778c662d",Synchronized="2019-08-30 22:22:28.0")
/** Column name C_LocTo_ID */
public static final String COLUMNNAME_C_LocTo_ID = "C_LocTo_ID";
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

@XendraTrl(Identifier="8f803852-6b39-1c98-9586-bbeff80b3eec")
public static String es_PE_FIELD_DailyBalances_Project_Name="Proyecto";

@XendraTrl(Identifier="8f803852-6b39-1c98-9586-bbeff80b3eec")
public static String es_PE_FIELD_DailyBalances_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="8f803852-6b39-1c98-9586-bbeff80b3eec")
public static String es_PE_FIELD_DailyBalances_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3c686acd-5f9e-f206-b2b0-647bd6fdccb8",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8f803852-6b39-1c98-9586-bbeff80b3eec")
public static final String FIELDNAME_DailyBalances_Project="8f803852-6b39-1c98-9586-bbeff80b3eec";

@XendraTrl(Identifier="13719be3-f89d-c808-b42f-464dfd49233a")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="13719be3-f89d-c808-b42f-464dfd49233a",
Synchronized="2019-08-30 22:22:28.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
/** Set Project Phase.
@param C_ProjectPhase_ID Phase of a Project */
public void setC_ProjectPhase_ID (int C_ProjectPhase_ID)
{
if (C_ProjectPhase_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_ProjectPhase_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_ProjectPhase_ID, Integer.valueOf(C_ProjectPhase_ID));
}
/** Get Project Phase.
@return Phase of a Project */
public int getC_ProjectPhase_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ProjectPhase_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="312060f1-267d-cf88-3ff5-5af94e419b73")
public static String es_PE_COLUMN_C_ProjectPhase_ID_Name="Fase del Proyecto";

@XendraColumn(AD_Element_ID="ba6e5aab-8337-208a-03da-5712e50d4da9",ColumnName="C_ProjectPhase_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="312060f1-267d-cf88-3ff5-5af94e419b73",
Synchronized="2019-08-30 22:22:28.0")
/** Column name C_ProjectPhase_ID */
public static final String COLUMNNAME_C_ProjectPhase_ID = "C_ProjectPhase_ID";
/** Set Project Task.
@param C_ProjectTask_ID Actual Project Task in a Phase */
public void setC_ProjectTask_ID (int C_ProjectTask_ID)
{
if (C_ProjectTask_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_ProjectTask_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_ProjectTask_ID, Integer.valueOf(C_ProjectTask_ID));
}
/** Get Project Task.
@return Actual Project Task in a Phase */
public int getC_ProjectTask_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ProjectTask_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7295e419-ab99-6411-6531-114f2f3e3258")
public static String es_PE_COLUMN_C_ProjectTask_ID_Name="Tarea del Proyecto";

@XendraColumn(AD_Element_ID="1b2d7a20-215c-4f56-6077-83adcead0920",ColumnName="C_ProjectTask_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7295e419-ab99-6411-6531-114f2f3e3258",
Synchronized="2019-08-30 22:22:28.0")
/** Column name C_ProjectTask_ID */
public static final String COLUMNNAME_C_ProjectTask_ID = "C_ProjectTask_ID";
/** Set Sales Region.
@param C_SalesRegion_ID Sales coverage region */
public void setC_SalesRegion_ID (int C_SalesRegion_ID)
{
if (C_SalesRegion_ID <= 0) set_Value (COLUMNNAME_C_SalesRegion_ID, null);
 else 
set_Value (COLUMNNAME_C_SalesRegion_ID, Integer.valueOf(C_SalesRegion_ID));
}
/** Get Sales Region.
@return Sales coverage region */
public int getC_SalesRegion_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_SalesRegion_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ead9b88b-e0f2-6c21-c69d-adc7320fa526")
public static String es_PE_FIELD_DailyBalances_SalesRegion_Name="Región de Ventas";

@XendraTrl(Identifier="ead9b88b-e0f2-6c21-c69d-adc7320fa526")
public static String es_PE_FIELD_DailyBalances_SalesRegion_Description="Región de cobertura de ventas.";

@XendraTrl(Identifier="ead9b88b-e0f2-6c21-c69d-adc7320fa526")
public static String es_PE_FIELD_DailyBalances_SalesRegion_Help="La región de ventas indica una área de cobertura de ventas específica.";

@XendraField(AD_Column_ID="C_SalesRegion_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3c686acd-5f9e-f206-b2b0-647bd6fdccb8",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ead9b88b-e0f2-6c21-c69d-adc7320fa526")
public static final String FIELDNAME_DailyBalances_SalesRegion="ead9b88b-e0f2-6c21-c69d-adc7320fa526";

@XendraTrl(Identifier="b7bb3a8e-cf42-c231-234f-d7d5227f2692")
public static String es_PE_COLUMN_C_SalesRegion_ID_Name="Región de Ventas";

@XendraColumn(AD_Element_ID="26b40f06-df79-27f7-adb4-8ae6c5a1c9b8",ColumnName="C_SalesRegion_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b7bb3a8e-cf42-c231-234f-d7d5227f2692",
Synchronized="2019-08-30 22:22:28.0")
/** Column name C_SalesRegion_ID */
public static final String COLUMNNAME_C_SalesRegion_ID = "C_SalesRegion_ID";
/** Set Sub Account.
@param C_SubAcct_ID Sub account for Element Value */
public void setC_SubAcct_ID (int C_SubAcct_ID)
{
if (C_SubAcct_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_SubAcct_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_SubAcct_ID, Integer.valueOf(C_SubAcct_ID));
}
/** Get Sub Account.
@return Sub account for Element Value */
public int getC_SubAcct_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_SubAcct_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="193dfeef-15c0-dd39-828c-cd54c5dea07b")
public static String es_PE_FIELD_DailyBalances_SubAccount_Name="Sub Cuenta";

@XendraTrl(Identifier="193dfeef-15c0-dd39-828c-cd54c5dea07b")
public static String es_PE_FIELD_DailyBalances_SubAccount_Description="Sub Cuenta para Valor del Elemento";

@XendraTrl(Identifier="193dfeef-15c0-dd39-828c-cd54c5dea07b")
public static String es_PE_FIELD_DailyBalances_SubAccount_Help="El Valor del Elemento (ej. Cuenta) opcionalmente puede tener subcuentas para detalles adicionales. La subcuenta es dependientedel valor de la cuenta, así también las especificaciónes. Si las cuentas son mas o menos lo mismo, considere el empleo de otra dimensión contable.";

@XendraField(AD_Column_ID="C_SubAcct_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3c686acd-5f9e-f206-b2b0-647bd6fdccb8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="193dfeef-15c0-dd39-828c-cd54c5dea07b")
public static final String FIELDNAME_DailyBalances_SubAccount="193dfeef-15c0-dd39-828c-cd54c5dea07b";

@XendraTrl(Identifier="217ccdae-f83d-680d-f29f-c4456b6ca5d3")
public static String es_PE_COLUMN_C_SubAcct_ID_Name="Sub Cuenta";

@XendraColumn(AD_Element_ID="24ec01a7-d6fe-2833-9fa3-5bc5aa2648b5",ColumnName="C_SubAcct_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="217ccdae-f83d-680d-f29f-c4456b6ca5d3",
Synchronized="2019-08-30 22:22:28.0")
/** Column name C_SubAcct_ID */
public static final String COLUMNNAME_C_SubAcct_ID = "C_SubAcct_ID";
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

@XendraTrl(Identifier="df9f0f70-b67b-ae33-20e6-5c06edde17ed")
public static String es_PE_FIELD_DailyBalances_AccountDate_Name="Fecha de Aplicación CG";

@XendraTrl(Identifier="df9f0f70-b67b-ae33-20e6-5c06edde17ed")
public static String es_PE_FIELD_DailyBalances_AccountDate_Description="Fecha contable";

@XendraTrl(Identifier="df9f0f70-b67b-ae33-20e6-5c06edde17ed")
public static String es_PE_FIELD_DailyBalances_AccountDate_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="3c686acd-5f9e-f206-b2b0-647bd6fdccb8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=2,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="df9f0f70-b67b-ae33-20e6-5c06edde17ed")
public static final String FIELDNAME_DailyBalances_AccountDate="df9f0f70-b67b-ae33-20e6-5c06edde17ed";

@XendraTrl(Identifier="ad11525d-349e-2510-e638-6404f1726034")
public static String es_PE_COLUMN_DateAcct_Name="Fecha de Aplicación CG";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ad11525d-349e-2510-e638-6404f1726034",
Synchronized="2019-08-30 22:22:28.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";
/** Set Budget.
@param GL_Budget_ID General Ledger Budget */
public void setGL_Budget_ID (int GL_Budget_ID)
{
if (GL_Budget_ID <= 0) set_Value (COLUMNNAME_GL_Budget_ID, null);
 else 
set_Value (COLUMNNAME_GL_Budget_ID, Integer.valueOf(GL_Budget_ID));
}
/** Get Budget.
@return General Ledger Budget */
public int getGL_Budget_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_GL_Budget_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f7a6452c-358d-8b36-fdd2-af7b665cce05")
public static String es_PE_FIELD_DailyBalances_Budget_Name="Presupuesto";

@XendraTrl(Identifier="f7a6452c-358d-8b36-fdd2-af7b665cce05")
public static String es_PE_FIELD_DailyBalances_Budget_Description="Presupuesto de la Contabilidad General";

@XendraTrl(Identifier="f7a6452c-358d-8b36-fdd2-af7b665cce05")
public static String es_PE_FIELD_DailyBalances_Budget_Help="El Presupuesto de Contabilidad General identifica un presupuesto definido por el usuario. Puede ser usado para reportar en comparación con los meses reales.";

@XendraField(AD_Column_ID="GL_Budget_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3c686acd-5f9e-f206-b2b0-647bd6fdccb8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f7a6452c-358d-8b36-fdd2-af7b665cce05")
public static final String FIELDNAME_DailyBalances_Budget="f7a6452c-358d-8b36-fdd2-af7b665cce05";

@XendraTrl(Identifier="90242966-963b-34f2-3122-dc9c97a8b789")
public static String es_PE_COLUMN_GL_Budget_ID_Name="Presupuesto";

@XendraColumn(AD_Element_ID="202442f1-5c47-451c-a68b-6c32567592ad",ColumnName="GL_Budget_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="90242966-963b-34f2-3122-dc9c97a8b789",
Synchronized="2019-08-30 22:22:28.0")
/** Column name GL_Budget_ID */
public static final String COLUMNNAME_GL_Budget_ID = "GL_Budget_ID";
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
@XendraTrl(Identifier="3c22276f-4be5-4f74-89f6-73778d6506ca")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3c22276f-4be5-4f74-89f6-73778d6506ca",
Synchronized="2019-08-30 22:22:28.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID <= 0) set_Value (COLUMNNAME_M_Product_ID, null);
 else 
set_Value (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
}
/** Get Product.
@return Product, Service, Item */
public int getM_Product_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5a42c6a0-9766-1a98-7119-7b60c1133194")
public static String es_PE_FIELD_DailyBalances_Product_Name="Producto";

@XendraTrl(Identifier="5a42c6a0-9766-1a98-7119-7b60c1133194")
public static String es_PE_FIELD_DailyBalances_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="5a42c6a0-9766-1a98-7119-7b60c1133194")
public static String es_PE_FIELD_DailyBalances_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3c686acd-5f9e-f206-b2b0-647bd6fdccb8",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5a42c6a0-9766-1a98-7119-7b60c1133194")
public static final String FIELDNAME_DailyBalances_Product="5a42c6a0-9766-1a98-7119-7b60c1133194";

@XendraTrl(Identifier="7e9fe80b-5188-4b3c-ec84-779148a45611")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7e9fe80b-5188-4b3c-ec84-779148a45611",
Synchronized="2019-08-30 22:22:28.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set PostingType.
@param PostingType The type of posted amount for the transaction */
public void setPostingType (String PostingType)
{
if (PostingType.length() > 1)
{
log.warning("Length > 1 - truncated");
PostingType = PostingType.substring(0,0);
}
set_Value (COLUMNNAME_PostingType, PostingType);
}
/** Get PostingType.
@return The type of posted amount for the transaction */
public String getPostingType() 
{
return (String)get_Value(COLUMNNAME_PostingType);
}

@XendraTrl(Identifier="01b99749-419b-b133-706a-ee4713f26e8d")
public static String es_PE_FIELD_DailyBalances_PostingType_Name="Tipo de Aplicación";

@XendraTrl(Identifier="01b99749-419b-b133-706a-ee4713f26e8d")
public static String es_PE_FIELD_DailyBalances_PostingType_Description="El tipo de total que esta póliza actualizó";

@XendraTrl(Identifier="01b99749-419b-b133-706a-ee4713f26e8d")
public static String es_PE_FIELD_DailyBalances_PostingType_Help="El tipo de aplicación indica el tipo de total (actual; gravamen; presupuesto) que esta póliza actualizó";

@XendraField(AD_Column_ID="PostingType",IsCentrallyMaintained=true,
AD_Tab_ID="3c686acd-5f9e-f206-b2b0-647bd6fdccb8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="01b99749-419b-b133-706a-ee4713f26e8d")
public static final String FIELDNAME_DailyBalances_PostingType="01b99749-419b-b133-706a-ee4713f26e8d";

@XendraTrl(Identifier="abf828fe-1fde-7ffa-b1ee-d38b8cdb8507")
public static String es_PE_COLUMN_PostingType_Name="Tipo de Aplicación";

@XendraColumn(AD_Element_ID="465cd8dd-d2b8-aa76-fc18-7f8df439b182",ColumnName="PostingType",
AD_Reference_ID=17,AD_Reference_Value_ID="1ad48d23-2ec9-09d0-cb68-38688c5e6ce0",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="abf828fe-1fde-7ffa-b1ee-d38b8cdb8507",Synchronized="2019-08-30 22:22:28.0")
/** Column name PostingType */
public static final String COLUMNNAME_PostingType = "PostingType";
/** Set Quantity.
@param Qty Quantity */
public void setQty (BigDecimal Qty)
{
if (Qty == null) throw new IllegalArgumentException ("Qty is mandatory.");
set_Value (COLUMNNAME_Qty, Qty);
}
/** Get Quantity.
@return Quantity */
public BigDecimal getQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Qty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="a5e8c788-9e0b-944a-7673-04ddf8df7f80")
public static String es_PE_FIELD_DailyBalances_Quantity_Name="Cantidad";

@XendraTrl(Identifier="a5e8c788-9e0b-944a-7673-04ddf8df7f80")
public static String es_PE_FIELD_DailyBalances_Quantity_Description="Cantidad";

@XendraTrl(Identifier="a5e8c788-9e0b-944a-7673-04ddf8df7f80")
public static String es_PE_FIELD_DailyBalances_Quantity_Help="La Cantidad indica el número de un producto específico o artículo para este documento";

@XendraField(AD_Column_ID="Qty",IsCentrallyMaintained=true,
AD_Tab_ID="3c686acd-5f9e-f206-b2b0-647bd6fdccb8",AD_FieldGroup_ID="Quantities",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a5e8c788-9e0b-944a-7673-04ddf8df7f80")
public static final String FIELDNAME_DailyBalances_Quantity="a5e8c788-9e0b-944a-7673-04ddf8df7f80";

@XendraTrl(Identifier="44c788df-32da-305c-0d02-fc7a26fdba1c")
public static String es_PE_COLUMN_Qty_Name="Cantidad";

@XendraColumn(AD_Element_ID="c9d74a25-87c5-9592-5660-4f397607dad3",ColumnName="Qty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="44c788df-32da-305c-0d02-fc7a26fdba1c",
Synchronized="2019-08-30 22:22:28.0")
/** Column name Qty */
public static final String COLUMNNAME_Qty = "Qty";
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

@XendraTrl(Identifier="1ee7497b-de3f-dcb6-5a50-0a1baca8336d")
public static String es_PE_FIELD_DailyBalances_UserList_Name="Usuario 1";

@XendraTrl(Identifier="1ee7497b-de3f-dcb6-5a50-0a1baca8336d")
public static String es_PE_FIELD_DailyBalances_UserList_Description="El usuario definió el elemento # 1";

@XendraTrl(Identifier="1ee7497b-de3f-dcb6-5a50-0a1baca8336d")
public static String es_PE_FIELD_DailyBalances_UserList_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3c686acd-5f9e-f206-b2b0-647bd6fdccb8",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_U1@=Y",DisplayLength=14,IsReadOnly=true,SeqNo=170,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="1ee7497b-de3f-dcb6-5a50-0a1baca8336d")
public static final String FIELDNAME_DailyBalances_UserList="1ee7497b-de3f-dcb6-5a50-0a1baca8336d";

@XendraTrl(Identifier="84194deb-5574-36e7-e934-1ca1f7445e59")
public static String es_PE_COLUMN_User1_ID_Name="Usuario 1";

@XendraColumn(AD_Element_ID="07453e74-aadd-d9c9-e543-837a6fdb3094",ColumnName="User1_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="5a2fe161-044f-67cb-3791-6d615980cabb",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="84194deb-5574-36e7-e934-1ca1f7445e59",Synchronized="2019-08-30 22:22:28.0")
/** Column name User1_ID */
public static final String COLUMNNAME_User1_ID = "User1_ID";
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

@XendraTrl(Identifier="b8e3d1a0-6fd4-b99b-8503-04bdabc4ba70")
public static String es_PE_FIELD_DailyBalances_UserList22_Name="Usuario 2";

@XendraTrl(Identifier="b8e3d1a0-6fd4-b99b-8503-04bdabc4ba70")
public static String es_PE_FIELD_DailyBalances_UserList22_Description="El usuario definió el elemento # 2";

@XendraTrl(Identifier="b8e3d1a0-6fd4-b99b-8503-04bdabc4ba70")
public static String es_PE_FIELD_DailyBalances_UserList22_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3c686acd-5f9e-f206-b2b0-647bd6fdccb8",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_U2@=Y",DisplayLength=14,IsReadOnly=true,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b8e3d1a0-6fd4-b99b-8503-04bdabc4ba70")
public static final String FIELDNAME_DailyBalances_UserList22="b8e3d1a0-6fd4-b99b-8503-04bdabc4ba70";

@XendraTrl(Identifier="55e6faa7-f414-5615-07fe-eb0accd98453")
public static String es_PE_COLUMN_User2_ID_Name="Usuario 2";

@XendraColumn(AD_Element_ID="1b668c90-6743-20a2-df62-576857d72c06",ColumnName="User2_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="6a357ab2-7bb6-fce4-ffee-8bdd855a77fc",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="55e6faa7-f414-5615-07fe-eb0accd98453",Synchronized="2019-08-30 22:22:28.0")
/** Column name User2_ID */
public static final String COLUMNNAME_User2_ID = "User2_ID";
/** Set User Element 1.
@param UserElement1_ID User defined accounting Element */
public void setUserElement1_ID (int UserElement1_ID)
{
if (UserElement1_ID <= 0) set_Value (COLUMNNAME_UserElement1_ID, null);
 else 
set_Value (COLUMNNAME_UserElement1_ID, Integer.valueOf(UserElement1_ID));
}
/** Get User Element 1.
@return User defined accounting Element */
public int getUserElement1_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_UserElement1_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="15055cfa-d656-0f1a-85ed-eec8ab28215f")
public static String es_PE_FIELD_DailyBalances_UserElement_Name="Elemento 1 de Usuario";

@XendraTrl(Identifier="15055cfa-d656-0f1a-85ed-eec8ab28215f")
public static String es_PE_FIELD_DailyBalances_UserElement_Description="Elemento Contable definido por Usuario";

@XendraTrl(Identifier="15055cfa-d656-0f1a-85ed-eec8ab28215f")
public static String es_PE_FIELD_DailyBalances_UserElement_Help="el elemento contable definido por el usuario refiere a una tabla de Adempiere. Esto le permite emplear el contenido de cualquier tabla como una dimensión contable (ej  Actividad de Proyecto). Note que los Elementos de Usuario son opcionales y son llenados desde el contexto del Documento (ej. No Solicitado).";

@XendraField(AD_Column_ID="UserElement1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3c686acd-5f9e-f206-b2b0-647bd6fdccb8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_X1@=Y",DisplayLength=10,IsReadOnly=true,SeqNo=190,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="15055cfa-d656-0f1a-85ed-eec8ab28215f")
public static final String FIELDNAME_DailyBalances_UserElement="15055cfa-d656-0f1a-85ed-eec8ab28215f";

@XendraTrl(Identifier="4675bc48-b86b-7b4d-9121-fe6a63b32887")
public static String es_PE_COLUMN_UserElement1_ID_Name="Elemento 1 de Usuario";

@XendraColumn(AD_Element_ID="ff0e32d9-4f26-c956-dcff-4c22340ac351",ColumnName="UserElement1_ID",
AD_Reference_ID=13,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4675bc48-b86b-7b4d-9121-fe6a63b32887",
Synchronized="2019-08-30 22:22:28.0")
/** Column name UserElement1_ID */
public static final String COLUMNNAME_UserElement1_ID = "UserElement1_ID";
/** Set User Element 2.
@param UserElement2_ID User defined accounting Element */
public void setUserElement2_ID (int UserElement2_ID)
{
if (UserElement2_ID <= 0) set_Value (COLUMNNAME_UserElement2_ID, null);
 else 
set_Value (COLUMNNAME_UserElement2_ID, Integer.valueOf(UserElement2_ID));
}
/** Get User Element 2.
@return User defined accounting Element */
public int getUserElement2_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_UserElement2_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ba2088da-616c-cd93-ec69-3adc33a64a1b")
public static String es_PE_FIELD_DailyBalances_UserElement22_Name="Elemento 2 de Usuario";

@XendraTrl(Identifier="ba2088da-616c-cd93-ec69-3adc33a64a1b")
public static String es_PE_FIELD_DailyBalances_UserElement22_Description="Elemento Contable definido por Usuario";

@XendraTrl(Identifier="ba2088da-616c-cd93-ec69-3adc33a64a1b")
public static String es_PE_FIELD_DailyBalances_UserElement22_Help="Un Elemento Contable definido por el Usuario refiere a una Tabla de Adempiere. Esto le permite emplear el contenido de cualquier Tabla como una Dimensión Contable (Ej. Actividad de  Proyecto). Note que los Elementos de Usuario son opcionales y son llenados desde el contexto del Documento (ej. No Solicitado).";

@XendraField(AD_Column_ID="UserElement2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3c686acd-5f9e-f206-b2b0-647bd6fdccb8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_X2@=Y",DisplayLength=10,IsReadOnly=true,SeqNo=200,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ba2088da-616c-cd93-ec69-3adc33a64a1b")
public static final String FIELDNAME_DailyBalances_UserElement22="ba2088da-616c-cd93-ec69-3adc33a64a1b";

@XendraTrl(Identifier="58e57079-64d5-0358-ef7a-c9cd9df13fcf")
public static String es_PE_COLUMN_UserElement2_ID_Name="Elemento 2 de Usuario";

@XendraColumn(AD_Element_ID="e99c9066-c80c-ab02-0bfb-e485dfbadc2d",ColumnName="UserElement2_ID",
AD_Reference_ID=13,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="58e57079-64d5-0358-ef7a-c9cd9df13fcf",
Synchronized="2019-08-30 22:22:28.0")
/** Column name UserElement2_ID */
public static final String COLUMNNAME_UserElement2_ID = "UserElement2_ID";
}
