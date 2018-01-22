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
/** Generated Model for C_AcctSchema_GL
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_AcctSchema_GL extends PO
{
/** Standard Constructor
@param ctx context
@param C_AcctSchema_GL_ID id
@param trxName transaction
*/
public X_C_AcctSchema_GL (Properties ctx, int C_AcctSchema_GL_ID, String trxName)
{
super (ctx, C_AcctSchema_GL_ID, trxName);
/** if (C_AcctSchema_GL_ID == 0)
{
setC_AcctSchema_ID (0);
setCommitmentOffset_Acct (0);
setIncomeSummary_Acct (0);
setIntercompanyDueFrom_Acct (0);
setIntercompanyDueTo_Acct (0);
setPPVOffset_Acct (0);
setRetainedEarning_Acct (0);
setUseCurrencyBalancing (false);	
// N
setUseSuspenseBalancing (false);	
// N
setUseSuspenseError (false);	
// N
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_AcctSchema_GL (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=266 */
public static int Table_ID=MTable.getTable_ID("C_AcctSchema_GL");

@XendraTrl(Identifier="baf4efeb-69b0-7c1e-3d95-64e0612c860f")
public static String es_PE_TAB_GeneralLedger_Description="Cuentas de la Contabilidad General (CG)";

@XendraTrl(Identifier="baf4efeb-69b0-7c1e-3d95-64e0612c860f")
public static String es_PE_TAB_GeneralLedger_Name="Contabilidad General (CG)";

@XendraTrl(Identifier="baf4efeb-69b0-7c1e-3d95-64e0612c860f")
public static String es_PE_TAB_GeneralLedger_Help="La pestaña Contabilidad General (CG)) define el manejo de error y de balance a usar así como las cuentas necesarias para registrar las transacciones en el libro mayor.";

@XendraTab(Name="General Ledger",Description="Accounts for GL",
Help="The General Ledger Tab defines error and balance handling to use as well as  the necessary accounts for posting to General Ledger.  ",
AD_Window_ID="1d20d4ab-6f93-65b5-6cbb-44da46ec6819",SeqNo=30,TabLevel=1,IsSingleRow=true,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="9a0f7fa1-d5b9-74f4-4cc8-ce5e0dcf032e",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="For changes to become effective, you must re-login and re-start the Application Server.",
AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,
Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,
Parent_Column_ID="",Identifier="baf4efeb-69b0-7c1e-3d95-64e0612c860f",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_GeneralLedger="baf4efeb-69b0-7c1e-3d95-64e0612c860f";

@XendraTrl(Identifier="99989066-d7e0-f1af-cc2d-24ce1c5f8605")
public static String es_PE_TABLE_C_AcctSchema_GL_Name="C_AcctSchema_GL";

@XendraTable(Name="C_AcctSchema_GL",Description="",Help="",TableName="C_AcctSchema_GL",
AccessLevel="2",AD_Window_ID="1d20d4ab-6f93-65b5-6cbb-44da46ec6819",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="99989066-d7e0-f1af-cc2d-24ce1c5f8605",Synchronized="2017-08-16 11:41:21.0")
/** TableName=C_AcctSchema_GL */
public static final String Table_Name="C_AcctSchema_GL";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_AcctSchema_GL");

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
    Table_ID = MTable.getTable_ID("C_AcctSchema_GL");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_AcctSchema_GL[").append(get_ID()).append("]");
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getC_AcctSchema_ID()));
}

@XendraTrl(Identifier="a0f3592c-b6f5-c1eb-bd57-738a5836ded2")
public static String es_PE_FIELD_GeneralLedger_AccountingSchema_Description="Reglas para contabilizar";

@XendraTrl(Identifier="a0f3592c-b6f5-c1eb-bd57-738a5836ded2")
public static String es_PE_FIELD_GeneralLedger_AccountingSchema_Help="Un esquema contable define las reglas contables usadas tales como método de costeo; moneda y calendario";

@XendraTrl(Identifier="a0f3592c-b6f5-c1eb-bd57-738a5836ded2")
public static String es_PE_FIELD_GeneralLedger_AccountingSchema_Name="Esquema Contable";

@XendraField(AD_Column_ID="C_AcctSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="baf4efeb-69b0-7c1e-3d95-64e0612c860f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a0f3592c-b6f5-c1eb-bd57-738a5836ded2")
public static final String FIELDNAME_GeneralLedger_AccountingSchema="a0f3592c-b6f5-c1eb-bd57-738a5836ded2";

@XendraTrl(Identifier="9a0f7fa1-d5b9-74f4-4cc8-ce5e0dcf032e")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9a0f7fa1-d5b9-74f4-4cc8-ce5e0dcf032e",
Synchronized="2017-08-05 16:53:11.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
/** Set Commitment Offset.
@param CommitmentOffset_Acct Budgetary Commitment Offset Account */
public void setCommitmentOffset_Acct (int CommitmentOffset_Acct)
{
set_Value (COLUMNNAME_CommitmentOffset_Acct, Integer.valueOf(CommitmentOffset_Acct));
}
/** Get Commitment Offset.
@return Budgetary Commitment Offset Account */
public int getCommitmentOffset_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_CommitmentOffset_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="650d4aed-a387-98b4-a8e5-875fa0d03013")
public static String es_PE_FIELD_GeneralLedger_CommitmentOffset_Description="Budgetary Commitment Offset Account";

@XendraTrl(Identifier="650d4aed-a387-98b4-a8e5-875fa0d03013")
public static String es_PE_FIELD_GeneralLedger_CommitmentOffset_Help="The Commitment Offset Account is used for posting Commitments and Reservations.  It is usually an off-balance sheet and gain-and-loss account.";

@XendraTrl(Identifier="650d4aed-a387-98b4-a8e5-875fa0d03013")
public static String es_PE_FIELD_GeneralLedger_CommitmentOffset_Name="Commitment Offset";

@XendraField(AD_Column_ID="CommitmentOffset_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="baf4efeb-69b0-7c1e-3d95-64e0612c860f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="650d4aed-a387-98b4-a8e5-875fa0d03013")
public static final String FIELDNAME_GeneralLedger_CommitmentOffset="650d4aed-a387-98b4-a8e5-875fa0d03013";

@XendraTrl(Identifier="02777462-80e8-1493-1c16-0ecb7e7b2984")
public static String es_PE_COLUMN_CommitmentOffset_Acct_Name="Commitment Offset";

@XendraColumn(AD_Element_ID="46452405-ec53-676b-127f-59214d7d9a20",
ColumnName="CommitmentOffset_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="02777462-80e8-1493-1c16-0ecb7e7b2984",Synchronized="2017-08-05 16:53:11.0")
/** Column name CommitmentOffset_Acct */
public static final String COLUMNNAME_CommitmentOffset_Acct = "CommitmentOffset_Acct";
/** Set Currency Balancing Income Acct.
@param CurrencyBalancingIncome_Acct Account used when a currency is out of balance */
public void setCurrencyBalancingIncome_Acct (int CurrencyBalancingIncome_Acct)
{
set_Value (COLUMNNAME_CurrencyBalancingIncome_Acct, Integer.valueOf(CurrencyBalancingIncome_Acct));
}
/** Get Currency Balancing Income Acct.
@return Account used when a currency is out of balance */
public int getCurrencyBalancingIncome_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_CurrencyBalancingIncome_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="bda8cc1a-5179-b93b-f966-c512e9ca7220")
public static String es_PE_FIELD_GeneralLedger_CurrencyBalancingIncomeAcct_Description="Cuenta usada cuando la moneda está fuera de balance y se redondea hacia el haber";

@XendraTrl(Identifier="bda8cc1a-5179-b93b-f966-c512e9ca7220")
public static String es_PE_FIELD_GeneralLedger_CurrencyBalancingIncomeAcct_Help="La cuenta de balanceo de moneda indica la cuenta a ser usada cuando una moneda esté fuera de balance (generalmente debido al redondeo). Esta se usa cuando se redondea hacia el haber.";

@XendraTrl(Identifier="bda8cc1a-5179-b93b-f966-c512e9ca7220")
public static String es_PE_FIELD_GeneralLedger_CurrencyBalancingIncomeAcct_Name="Cuenta de Balanceo de Moneda (Ganancia)";

@XendraField(AD_Column_ID="CurrencyBalancingIncome_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="baf4efeb-69b0-7c1e-3d95-64e0612c860f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@UseCurrencyBalancing@='Y'",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="bda8cc1a-5179-b93b-f966-c512e9ca7220")
public static final String FIELDNAME_GeneralLedger_CurrencyBalancingIncomeAcct="bda8cc1a-5179-b93b-f966-c512e9ca7220";

@XendraTrl(Identifier="11560456-40d9-1eb2-3d2f-c1ed95023c33")
public static String es_PE_COLUMN_CurrencyBalancingIncome_Acct_Name="Cuenta de Balanceo de Moneda (Ganancia)";

@XendraColumn(AD_Element_ID="023814aa-4d60-df44-85d5-98327739e2cc",
ColumnName="CurrencyBalancingIncome_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="11560456-40d9-1eb2-3d2f-c1ed95023c33",Synchronized="2017-08-05 16:53:11.0")
/** Column name CurrencyBalancingIncome_Acct */
public static final String COLUMNNAME_CurrencyBalancingIncome_Acct = "CurrencyBalancingIncome_Acct";
/** Set Currency Balancing Loss Acct.
@param CurrencyBalancingLoss_Acct Currency Balancing Loss Acct */
public void setCurrencyBalancingLoss_Acct (int CurrencyBalancingLoss_Acct)
{
set_Value (COLUMNNAME_CurrencyBalancingLoss_Acct, Integer.valueOf(CurrencyBalancingLoss_Acct));
}
/** Get Currency Balancing Loss Acct.
@return Currency Balancing Loss Acct */
public int getCurrencyBalancingLoss_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_CurrencyBalancingLoss_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="69ab7691-9677-d718-2d0c-d79866ef2a8a")
public static String es_PE_FIELD_GeneralLedger_CurrencyBalancingLossAcct_Description="Cuenta usada cuando la moneda está fuera de balance y se redondea hacia el debe";

@XendraTrl(Identifier="69ab7691-9677-d718-2d0c-d79866ef2a8a")
public static String es_PE_FIELD_GeneralLedger_CurrencyBalancingLossAcct_Help="La cuenta de balanceo de moneda indica la cuenta a ser usada cuando una moneda esté fuera de balance (generalmente debido al redondeo). Esta se usa cuando se redondea hacia el debe.";

@XendraTrl(Identifier="69ab7691-9677-d718-2d0c-d79866ef2a8a")
public static String es_PE_FIELD_GeneralLedger_CurrencyBalancingLossAcct_Name="Cuenta de Balanceo de Moneda (Perdida)";

@XendraField(AD_Column_ID="CurrencyBalancingLoss_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="baf4efeb-69b0-7c1e-3d95-64e0612c860f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@UseCurrencyBalancing@='Y'",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="69ab7691-9677-d718-2d0c-d79866ef2a8a")
public static final String FIELDNAME_GeneralLedger_CurrencyBalancingLossAcct="69ab7691-9677-d718-2d0c-d79866ef2a8a";

@XendraTrl(Identifier="7f62aef2-cfb2-a2e1-a2ec-261ca48d05ae")
public static String es_PE_COLUMN_CurrencyBalancingLoss_Acct_Name="Cuenta de Balanceo de Moneda (Perdida)";

@XendraColumn(AD_Element_ID="2d459819-4d55-7403-39fb-438ef9c7f99f",
ColumnName="CurrencyBalancingLoss_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7f62aef2-cfb2-a2e1-a2ec-261ca48d05ae",Synchronized="2017-08-05 16:53:11.0")
/** Column name CurrencyBalancingLoss_Acct */
public static final String COLUMNNAME_CurrencyBalancingLoss_Acct = "CurrencyBalancingLoss_Acct";
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
@XendraTrl(Identifier="7ae90121-8d25-4550-94c4-cfd8df0bab0f")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7ae90121-8d25-4550-94c4-cfd8df0bab0f",
Synchronized="2017-08-05 16:53:11.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Income Summary Acct.
@param IncomeSummary_Acct Income Summary Account  */
public void setIncomeSummary_Acct (int IncomeSummary_Acct)
{
set_Value (COLUMNNAME_IncomeSummary_Acct, Integer.valueOf(IncomeSummary_Acct));
}
/** Get Income Summary Acct.
@return Income Summary Account  */
public int getIncomeSummary_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_IncomeSummary_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="97a58744-ea51-a1b5-3130-715964a844fa")
public static String es_PE_FIELD_GeneralLedger_IncomeSummaryAcct_Name="Cuenta de Ingresos Acumulados";

@XendraField(AD_Column_ID="IncomeSummary_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="baf4efeb-69b0-7c1e-3d95-64e0612c860f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="97a58744-ea51-a1b5-3130-715964a844fa")
public static final String FIELDNAME_GeneralLedger_IncomeSummaryAcct="97a58744-ea51-a1b5-3130-715964a844fa";

@XendraTrl(Identifier="59a751f6-5173-49a0-7472-7d8d9a24c94f")
public static String es_PE_COLUMN_IncomeSummary_Acct_Name="Cuenta de Ingresos Acumulados";

@XendraColumn(AD_Element_ID="eda953dc-1e2b-9280-8227-ed41f30cbfa1",ColumnName="IncomeSummary_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="59a751f6-5173-49a0-7472-7d8d9a24c94f",
Synchronized="2017-08-05 16:53:11.0")
/** Column name IncomeSummary_Acct */
public static final String COLUMNNAME_IncomeSummary_Acct = "IncomeSummary_Acct";
/** Set Intercompany Due From Acct.
@param IntercompanyDueFrom_Acct Intercompany Due From / Receivables Account */
public void setIntercompanyDueFrom_Acct (int IntercompanyDueFrom_Acct)
{
set_Value (COLUMNNAME_IntercompanyDueFrom_Acct, Integer.valueOf(IntercompanyDueFrom_Acct));
}
/** Get Intercompany Due From Acct.
@return Intercompany Due From / Receivables Account */
public int getIntercompanyDueFrom_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_IntercompanyDueFrom_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e70e9b95-94ed-f04d-b34c-e1325b11767e")
public static String es_PE_FIELD_GeneralLedger_IntercompanyDueFromAcct_Description="Cta. Intercompañía que debe a esta compañía / Cuenta por Cobrar";

@XendraTrl(Identifier="e70e9b95-94ed-f04d-b34c-e1325b11767e")
public static String es_PE_FIELD_GeneralLedger_IntercompanyDueFromAcct_Help="La cuenta Inter-compañía debido desde indica la cuenta que representa dinero que se debe a esta organización desde otras organizaciones";

@XendraTrl(Identifier="e70e9b95-94ed-f04d-b34c-e1325b11767e")
public static String es_PE_FIELD_GeneralLedger_IntercompanyDueFromAcct_Name="Cuenta Inter-Compañía Debido Desde";

@XendraField(AD_Column_ID="IntercompanyDueFrom_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="baf4efeb-69b0-7c1e-3d95-64e0612c860f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e70e9b95-94ed-f04d-b34c-e1325b11767e")
public static final String FIELDNAME_GeneralLedger_IntercompanyDueFromAcct="e70e9b95-94ed-f04d-b34c-e1325b11767e";

@XendraTrl(Identifier="0ed6b546-fcf1-bbba-b79c-254ff9cfb9ff")
public static String es_PE_COLUMN_IntercompanyDueFrom_Acct_Name="Cuenta Inter-Compañía Debido Desde";

@XendraColumn(AD_Element_ID="c2fdc95c-e1cc-eb8c-48f9-c55d51ed2d8c",
ColumnName="IntercompanyDueFrom_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0ed6b546-fcf1-bbba-b79c-254ff9cfb9ff",Synchronized="2017-08-05 16:53:11.0")
/** Column name IntercompanyDueFrom_Acct */
public static final String COLUMNNAME_IntercompanyDueFrom_Acct = "IntercompanyDueFrom_Acct";
/** Set Intercompany Due To Acct.
@param IntercompanyDueTo_Acct Intercompany Due To / Payable Account */
public void setIntercompanyDueTo_Acct (int IntercompanyDueTo_Acct)
{
set_Value (COLUMNNAME_IntercompanyDueTo_Acct, Integer.valueOf(IntercompanyDueTo_Acct));
}
/** Get Intercompany Due To Acct.
@return Intercompany Due To / Payable Account */
public int getIntercompanyDueTo_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_IntercompanyDueTo_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="120caa3e-a8da-013c-ce7d-2a6e6eae211f")
public static String es_PE_FIELD_GeneralLedger_IntercompanyDueToAcct_Description="Cta. Inter-compañía que esta compañía debe / Cuenta por Pagar";

@XendraTrl(Identifier="120caa3e-a8da-013c-ce7d-2a6e6eae211f")
public static String es_PE_FIELD_GeneralLedger_IntercompanyDueToAcct_Help="La cuenta Ínter-compañía debido A indica la cuenta que representa dinero que debe esta organización a otras organizaciones";

@XendraTrl(Identifier="120caa3e-a8da-013c-ce7d-2a6e6eae211f")
public static String es_PE_FIELD_GeneralLedger_IntercompanyDueToAcct_Name="Cuenta Inter-Compañía Debido A";

@XendraField(AD_Column_ID="IntercompanyDueTo_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="baf4efeb-69b0-7c1e-3d95-64e0612c860f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="120caa3e-a8da-013c-ce7d-2a6e6eae211f")
public static final String FIELDNAME_GeneralLedger_IntercompanyDueToAcct="120caa3e-a8da-013c-ce7d-2a6e6eae211f";

@XendraTrl(Identifier="ebab5800-4342-cdfe-722c-89324bffac88")
public static String es_PE_COLUMN_IntercompanyDueTo_Acct_Name="Cuenta Inter-Compañía Debido A";

@XendraColumn(AD_Element_ID="87198123-4127-3ebd-e1e0-3a0b16922c8b",
ColumnName="IntercompanyDueTo_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ebab5800-4342-cdfe-722c-89324bffac88",Synchronized="2017-08-05 16:53:11.0")
/** Column name IntercompanyDueTo_Acct */
public static final String COLUMNNAME_IntercompanyDueTo_Acct = "IntercompanyDueTo_Acct";
/** Set PPV Offset.
@param PPVOffset_Acct Purchase Price Variance Offset Account */
public void setPPVOffset_Acct (int PPVOffset_Acct)
{
set_Value (COLUMNNAME_PPVOffset_Acct, Integer.valueOf(PPVOffset_Acct));
}
/** Get PPV Offset.
@return Purchase Price Variance Offset Account */
public int getPPVOffset_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PPVOffset_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0600f06b-cc05-9885-5b2c-5bedd9eb83e5")
public static String es_PE_FIELD_GeneralLedger_PPVOffset_Description="Cuenta de Balanceo de Variación el Precio de Compra";

@XendraTrl(Identifier="0600f06b-cc05-9885-5b2c-5bedd9eb83e5")
public static String es_PE_FIELD_GeneralLedger_PPVOffset_Help="Cuenta de Balanceo para variaciones del precio de compras con costeo estándar. La contra cuenta es Variación de Precio de Compras del Producto.";

@XendraTrl(Identifier="0600f06b-cc05-9885-5b2c-5bedd9eb83e5")
public static String es_PE_FIELD_GeneralLedger_PPVOffset_Name="Cuenta de Balanceo de Variación Precio de Compra";

@XendraField(AD_Column_ID="PPVOffset_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="baf4efeb-69b0-7c1e-3d95-64e0612c860f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0600f06b-cc05-9885-5b2c-5bedd9eb83e5")
public static final String FIELDNAME_GeneralLedger_PPVOffset="0600f06b-cc05-9885-5b2c-5bedd9eb83e5";

@XendraTrl(Identifier="fa93b1c4-1fff-541a-0174-c6e856ff4634")
public static String es_PE_COLUMN_PPVOffset_Acct_Name="Cuenta de Balanceo de Variación Precio de Compra";

@XendraColumn(AD_Element_ID="7de27729-f7c0-9ad0-48cd-847d9c6eaf20",ColumnName="PPVOffset_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fa93b1c4-1fff-541a-0174-c6e856ff4634",
Synchronized="2017-08-05 16:53:11.0")
/** Column name PPVOffset_Acct */
public static final String COLUMNNAME_PPVOffset_Acct = "PPVOffset_Acct";
/** Set Retained Earning Acct.
@param RetainedEarning_Acct Retained Earning Acct */
public void setRetainedEarning_Acct (int RetainedEarning_Acct)
{
set_Value (COLUMNNAME_RetainedEarning_Acct, Integer.valueOf(RetainedEarning_Acct));
}
/** Get Retained Earning Acct.
@return Retained Earning Acct */
public int getRetainedEarning_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_RetainedEarning_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a7f22481-c861-5c30-fad2-5cbb6a55f37e")
public static String es_PE_FIELD_GeneralLedger_RetainedEarningAcct_Name="Cuenta de Utilidades Retenidas";

@XendraField(AD_Column_ID="RetainedEarning_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="baf4efeb-69b0-7c1e-3d95-64e0612c860f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a7f22481-c861-5c30-fad2-5cbb6a55f37e")
public static final String FIELDNAME_GeneralLedger_RetainedEarningAcct="a7f22481-c861-5c30-fad2-5cbb6a55f37e";

@XendraTrl(Identifier="9703f159-5412-e9e7-498a-44ba04949782")
public static String es_PE_COLUMN_RetainedEarning_Acct_Name="Cuenta de Utilidades Retenidas";

@XendraColumn(AD_Element_ID="44cc5ae4-7637-efaa-18d5-3563542f22de",
ColumnName="RetainedEarning_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9703f159-5412-e9e7-498a-44ba04949782",Synchronized="2017-08-05 16:53:11.0")
/** Column name RetainedEarning_Acct */
public static final String COLUMNNAME_RetainedEarning_Acct = "RetainedEarning_Acct";
/** Set Suspense Balancing Acct.
@param SuspenseBalancing_Acct Suspense Balancing Acct */
public void setSuspenseBalancing_Acct (int SuspenseBalancing_Acct)
{
set_Value (COLUMNNAME_SuspenseBalancing_Acct, Integer.valueOf(SuspenseBalancing_Acct));
}
/** Get Suspense Balancing Acct.
@return Suspense Balancing Acct */
public int getSuspenseBalancing_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SuspenseBalancing_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="55eba650-2679-258f-480b-e775dc7873be")
public static String es_PE_FIELD_GeneralLedger_SuspenseBalancingAcct_Name="Cuenta puente de Balanceo";

@XendraField(AD_Column_ID="SuspenseBalancing_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="baf4efeb-69b0-7c1e-3d95-64e0612c860f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@UseSuspenseBalancing@='Y'",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="55eba650-2679-258f-480b-e775dc7873be")
public static final String FIELDNAME_GeneralLedger_SuspenseBalancingAcct="55eba650-2679-258f-480b-e775dc7873be";

@XendraTrl(Identifier="5f007e54-fbfd-efea-0cdc-dcab3229635c")
public static String es_PE_COLUMN_SuspenseBalancing_Acct_Name="Cuenta puente de Balanceo";

@XendraColumn(AD_Element_ID="2f06ea69-6e99-8135-c3cd-9fef37d8dc43",
ColumnName="SuspenseBalancing_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5f007e54-fbfd-efea-0cdc-dcab3229635c",Synchronized="2017-08-05 16:53:11.0")
/** Column name SuspenseBalancing_Acct */
public static final String COLUMNNAME_SuspenseBalancing_Acct = "SuspenseBalancing_Acct";
/** Set Suspense Error Acct.
@param SuspenseError_Acct Suspense Error Acct */
public void setSuspenseError_Acct (int SuspenseError_Acct)
{
set_Value (COLUMNNAME_SuspenseError_Acct, Integer.valueOf(SuspenseError_Acct));
}
/** Get Suspense Error Acct.
@return Suspense Error Acct */
public int getSuspenseError_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SuspenseError_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a3eed176-03ef-194a-e2fa-4a3991a2141a")
public static String es_PE_FIELD_GeneralLedger_SuspenseErrorAcct_Name="Cuenta Puente de Error";

@XendraField(AD_Column_ID="SuspenseError_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="baf4efeb-69b0-7c1e-3d95-64e0612c860f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@UseSuspenseError@='Y'",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="a3eed176-03ef-194a-e2fa-4a3991a2141a")
public static final String FIELDNAME_GeneralLedger_SuspenseErrorAcct="a3eed176-03ef-194a-e2fa-4a3991a2141a";

@XendraTrl(Identifier="56644864-4279-e044-558d-3a8f00ef38f4")
public static String es_PE_COLUMN_SuspenseError_Acct_Name="Cuenta Puente de Error";

@XendraColumn(AD_Element_ID="696b7c8e-c52a-7ea7-d37b-fad201e51367",ColumnName="SuspenseError_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="56644864-4279-e044-558d-3a8f00ef38f4",
Synchronized="2017-08-05 16:53:11.0")
/** Column name SuspenseError_Acct */
public static final String COLUMNNAME_SuspenseError_Acct = "SuspenseError_Acct";
/** Set Use Currency Balancing.
@param UseCurrencyBalancing Use Currency Balancing */
public void setUseCurrencyBalancing (boolean UseCurrencyBalancing)
{
set_Value (COLUMNNAME_UseCurrencyBalancing, Boolean.valueOf(UseCurrencyBalancing));
}
/** Get Use Currency Balancing.
@return Use Currency Balancing */
public boolean isUseCurrencyBalancing() 
{
Object oo = get_Value(COLUMNNAME_UseCurrencyBalancing);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="ad4444c7-3020-f30d-fddb-a01ea1846bca")
public static String es_PE_FIELD_GeneralLedger_UseCurrencyBalancing_Name="Usar Balanceo de Moneda";

@XendraField(AD_Column_ID="UseCurrencyBalancing",IsCentrallyMaintained=true,
AD_Tab_ID="baf4efeb-69b0-7c1e-3d95-64e0612c860f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ad4444c7-3020-f30d-fddb-a01ea1846bca")
public static final String FIELDNAME_GeneralLedger_UseCurrencyBalancing="ad4444c7-3020-f30d-fddb-a01ea1846bca";

@XendraTrl(Identifier="f445dbfa-574f-f84b-721a-808dea3f5d1c")
public static String es_PE_COLUMN_UseCurrencyBalancing_Name="Usar Balanceo de Moneda";

@XendraColumn(AD_Element_ID="a8ac0b63-c401-5723-ddd4-54e0a8d0f4c3",
ColumnName="UseCurrencyBalancing",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f445dbfa-574f-f84b-721a-808dea3f5d1c",Synchronized="2017-08-05 16:53:11.0")
/** Column name UseCurrencyBalancing */
public static final String COLUMNNAME_UseCurrencyBalancing = "UseCurrencyBalancing";
/** Set Use Suspense Balancing.
@param UseSuspenseBalancing Use Suspense Balancing */
public void setUseSuspenseBalancing (boolean UseSuspenseBalancing)
{
set_Value (COLUMNNAME_UseSuspenseBalancing, Boolean.valueOf(UseSuspenseBalancing));
}
/** Get Use Suspense Balancing.
@return Use Suspense Balancing */
public boolean isUseSuspenseBalancing() 
{
Object oo = get_Value(COLUMNNAME_UseSuspenseBalancing);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="7fdd050a-ee54-610e-2fa4-f9bd94203fa5")
public static String es_PE_FIELD_GeneralLedger_UseSuspenseBalancing_Name="Usar Balance Suspendido";

@XendraField(AD_Column_ID="UseSuspenseBalancing",IsCentrallyMaintained=true,
AD_Tab_ID="baf4efeb-69b0-7c1e-3d95-64e0612c860f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7fdd050a-ee54-610e-2fa4-f9bd94203fa5")
public static final String FIELDNAME_GeneralLedger_UseSuspenseBalancing="7fdd050a-ee54-610e-2fa4-f9bd94203fa5";

@XendraTrl(Identifier="be518ed2-3479-17f7-8231-25c89dd4d62d")
public static String es_PE_COLUMN_UseSuspenseBalancing_Name="Usar Balance Suspendido";

@XendraColumn(AD_Element_ID="f45757f1-0b32-241c-5a09-000f1beb1b6c",
ColumnName="UseSuspenseBalancing",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="be518ed2-3479-17f7-8231-25c89dd4d62d",Synchronized="2017-08-05 16:53:11.0")
/** Column name UseSuspenseBalancing */
public static final String COLUMNNAME_UseSuspenseBalancing = "UseSuspenseBalancing";
/** Set Use Suspense Error.
@param UseSuspenseError Use Suspense Error */
public void setUseSuspenseError (boolean UseSuspenseError)
{
set_Value (COLUMNNAME_UseSuspenseError, Boolean.valueOf(UseSuspenseError));
}
/** Get Use Suspense Error.
@return Use Suspense Error */
public boolean isUseSuspenseError() 
{
Object oo = get_Value(COLUMNNAME_UseSuspenseError);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="6784becb-95d9-3531-e1e1-be040cb431b5")
public static String es_PE_FIELD_GeneralLedger_UseSuspenseError_Name="Usar Error en Suspenso";

@XendraField(AD_Column_ID="UseSuspenseError",IsCentrallyMaintained=true,
AD_Tab_ID="baf4efeb-69b0-7c1e-3d95-64e0612c860f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6784becb-95d9-3531-e1e1-be040cb431b5")
public static final String FIELDNAME_GeneralLedger_UseSuspenseError="6784becb-95d9-3531-e1e1-be040cb431b5";

@XendraTrl(Identifier="3c9fd1ba-c443-f8f2-3eb0-82e2f0e2dd49")
public static String es_PE_COLUMN_UseSuspenseError_Name="Usar Error en Suspenso";

@XendraColumn(AD_Element_ID="df0a9c33-94bd-704b-c9ec-264f02178c05",ColumnName="UseSuspenseError",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3c9fd1ba-c443-f8f2-3eb0-82e2f0e2dd49",
Synchronized="2017-08-05 16:53:11.0")
/** Column name UseSuspenseError */
public static final String COLUMNNAME_UseSuspenseError = "UseSuspenseError";
}
