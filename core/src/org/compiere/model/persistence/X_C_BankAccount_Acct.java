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
/** Generated Model for C_BankAccount_Acct
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_BankAccount_Acct extends PO
{
/** Standard Constructor
@param ctx context
@param C_BankAccount_Acct_ID id
@param trxName transaction
*/
public X_C_BankAccount_Acct (Properties ctx, int C_BankAccount_Acct_ID, String trxName)
{
super (ctx, C_BankAccount_Acct_ID, trxName);
/** if (C_BankAccount_Acct_ID == 0)
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
setC_BankAccount_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_BankAccount_Acct (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=391 */
public static int Table_ID=MTable.getTable_ID("C_BankAccount_Acct");

@XendraTrl(Identifier="1e9aba65-2df6-4a80-056e-ee01a7cf5e22")
public static String es_PE_TAB_Accounting_Description="Mantener datos de contabilidad";

@XendraTrl(Identifier="1e9aba65-2df6-4a80-056e-ee01a7cf5e22")
public static String es_PE_TAB_Accounting_Name="Contabilidad";

@XendraTrl(Identifier="1e9aba65-2df6-4a80-056e-ee01a7cf5e22")
public static String es_PE_TAB_Accounting_Help="La pestaña Contabilidad es usada para definir las cuentas usadas para transacciones con este banco.";

@XendraTab(Name="Accounting",Description="Maintain Accounting Data",
Help="The Accounting Tab is used to define the accounts used for transactions with this Bank.",
AD_Window_ID="da35b881-e51f-c76d-0c58-a14a86f4a839",SeqNo=60,TabLevel=2,IsSingleRow=true,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="1e9aba65-2df6-4a80-056e-ee01a7cf5e22",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Accounting="1e9aba65-2df6-4a80-056e-ee01a7cf5e22";

@XendraTrl(Identifier="386c19d3-355c-846f-074d-2b10190bc040")
public static String es_PE_TABLE_C_BankAccount_Acct_Name="C_BankAccount_Acct";

@XendraTable(Name="C_BankAccount_Acct",Description="",Help="",TableName="C_BankAccount_Acct",
AccessLevel="3",AD_Window_ID="da35b881-e51f-c76d-0c58-a14a86f4a839",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="386c19d3-355c-846f-074d-2b10190bc040",Synchronized="2017-08-16 11:41:23.0")
/** TableName=C_BankAccount_Acct */
public static final String Table_Name="C_BankAccount_Acct";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_BankAccount_Acct");

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
    Table_ID = MTable.getTable_ID("C_BankAccount_Acct");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_BankAccount_Acct[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="27d37264-4f15-d0ec-41ac-cb017b182db2")
public static String es_PE_FIELD_Accounting_BankAsset_Description="Cuenta de Bancos";

@XendraTrl(Identifier="27d37264-4f15-d0ec-41ac-cb017b182db2")
public static String es_PE_FIELD_Accounting_BankAsset_Help="La Cuenta de Bancos identifica la cuenta a ser usada para cambios en libros a los saldos en esta cuenta bancaria";

@XendraTrl(Identifier="27d37264-4f15-d0ec-41ac-cb017b182db2")
public static String es_PE_FIELD_Accounting_BankAsset_Name="Bancos";

@XendraField(AD_Column_ID="B_Asset_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="1e9aba65-2df6-4a80-056e-ee01a7cf5e22",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="27d37264-4f15-d0ec-41ac-cb017b182db2")
public static final String FIELDNAME_Accounting_BankAsset="27d37264-4f15-d0ec-41ac-cb017b182db2";

@XendraTrl(Identifier="3e0ff097-029d-6b3f-48d3-cc176b5a0089")
public static String es_PE_COLUMN_B_Asset_Acct_Name="Bancos";

@XendraColumn(AD_Element_ID="42d393bb-86bc-06af-0a4c-c0c93f58ee2e",ColumnName="B_Asset_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3e0ff097-029d-6b3f-48d3-cc176b5a0089",
Synchronized="2017-08-05 16:53:13.0")
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

@XendraTrl(Identifier="0c4debb6-0330-3f9e-2b87-c1430d1d2cbc")
public static String es_PE_FIELD_Accounting_BankExpense_Description="Cuenta de gastos bancarios";

@XendraTrl(Identifier="0c4debb6-0330-3f9e-2b87-c1430d1d2cbc")
public static String es_PE_FIELD_Accounting_BankExpense_Help="La Cuenta de Gastos Bancarios identifica la cuenta a ser usada para registrar cargos ó tarifas incurridas desde este banco.";

@XendraTrl(Identifier="0c4debb6-0330-3f9e-2b87-c1430d1d2cbc")
public static String es_PE_FIELD_Accounting_BankExpense_Name="Gastos Bancarios";

@XendraField(AD_Column_ID="B_Expense_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="1e9aba65-2df6-4a80-056e-ee01a7cf5e22",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0c4debb6-0330-3f9e-2b87-c1430d1d2cbc")
public static final String FIELDNAME_Accounting_BankExpense="0c4debb6-0330-3f9e-2b87-c1430d1d2cbc";

@XendraTrl(Identifier="f1d88e5d-051f-3e4c-5f2d-4e8267a0c857")
public static String es_PE_COLUMN_B_Expense_Acct_Name="Gastos Bancarios";

@XendraColumn(AD_Element_ID="2de32a53-55f1-0010-c014-3bbf9515755f",ColumnName="B_Expense_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f1d88e5d-051f-3e4c-5f2d-4e8267a0c857",
Synchronized="2017-08-05 16:53:13.0")
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

@XendraTrl(Identifier="39e8a6d3-e5e7-83b7-0011-df55a30bfe2d")
public static String es_PE_FIELD_Accounting_BankInterestExpense_Description="Cuenta de Intereses Pagados";

@XendraTrl(Identifier="39e8a6d3-e5e7-83b7-0011-df55a30bfe2d")
public static String es_PE_FIELD_Accounting_BankInterestExpense_Help="La Cuenta Intereses Bancarios identifica la cuenta a ser usada para registrar gastos de intereses";

@XendraTrl(Identifier="39e8a6d3-e5e7-83b7-0011-df55a30bfe2d")
public static String es_PE_FIELD_Accounting_BankInterestExpense_Name="Gastos por Intereses Bancarios";

@XendraField(AD_Column_ID="B_InterestExp_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="1e9aba65-2df6-4a80-056e-ee01a7cf5e22",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="39e8a6d3-e5e7-83b7-0011-df55a30bfe2d")
public static final String FIELDNAME_Accounting_BankInterestExpense="39e8a6d3-e5e7-83b7-0011-df55a30bfe2d";

@XendraTrl(Identifier="a694992a-fb5b-81b8-a5d3-b217df208955")
public static String es_PE_COLUMN_B_InterestExp_Acct_Name="Gastos por Intereses Bancarios";

@XendraColumn(AD_Element_ID="92812cc3-c5f5-c8bf-36cb-5d6c7cf9ccf6",ColumnName="B_InterestExp_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a694992a-fb5b-81b8-a5d3-b217df208955",
Synchronized="2017-08-05 16:53:13.0")
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

@XendraTrl(Identifier="283272fa-8393-7000-3f51-fa6c77cc9832")
public static String es_PE_FIELD_Accounting_BankInterestRevenue_Description="Cuenta de ingresos por intereses bancarios.";

@XendraTrl(Identifier="283272fa-8393-7000-3f51-fa6c77cc9832")
public static String es_PE_FIELD_Accounting_BankInterestRevenue_Help="La cuenta de ingresos por intereses bancarios identifica la cuenta a ser usada para registrar ingresos de intereses de este banco.";

@XendraTrl(Identifier="283272fa-8393-7000-3f51-fa6c77cc9832")
public static String es_PE_FIELD_Accounting_BankInterestRevenue_Name="Ingresos por Intereses Bancarios";

@XendraField(AD_Column_ID="B_InterestRev_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="1e9aba65-2df6-4a80-056e-ee01a7cf5e22",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="283272fa-8393-7000-3f51-fa6c77cc9832")
public static final String FIELDNAME_Accounting_BankInterestRevenue="283272fa-8393-7000-3f51-fa6c77cc9832";

@XendraTrl(Identifier="383d9c4a-8930-03d0-99ae-03ece74c310d")
public static String es_PE_COLUMN_B_InterestRev_Acct_Name="Ingresos por Intereses Bancarios";

@XendraColumn(AD_Element_ID="5f4277f1-1bdf-1e0a-aa2a-0418489575d5",ColumnName="B_InterestRev_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="383d9c4a-8930-03d0-99ae-03ece74c310d",
Synchronized="2017-08-05 16:53:13.0")
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

@XendraTrl(Identifier="d75ea081-c483-02af-6b73-b722f1a77baf")
public static String es_PE_FIELD_Accounting_BankInTransit_Description="Cuenta de pagos en tránsito";

@XendraTrl(Identifier="d75ea081-c483-02af-6b73-b722f1a77baf")
public static String es_PE_FIELD_Accounting_BankInTransit_Help="La cuenta banco en tránsito identifica la cuenta a ser usada para fondos que están en tránsito";

@XendraTrl(Identifier="d75ea081-c483-02af-6b73-b722f1a77baf")
public static String es_PE_FIELD_Accounting_BankInTransit_Name="Cuenta de Pagos en Tránsito";

@XendraField(AD_Column_ID="B_InTransit_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="1e9aba65-2df6-4a80-056e-ee01a7cf5e22",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d75ea081-c483-02af-6b73-b722f1a77baf")
public static final String FIELDNAME_Accounting_BankInTransit="d75ea081-c483-02af-6b73-b722f1a77baf";

@XendraTrl(Identifier="bee9f468-48fc-9214-eb08-1fda5f732b60")
public static String es_PE_COLUMN_B_InTransit_Acct_Name="Cuenta de Pagos en Tránsito";

@XendraColumn(AD_Element_ID="dd7e2b96-46a2-fe8e-6fc2-b3e7dad6059c",ColumnName="B_InTransit_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bee9f468-48fc-9214-eb08-1fda5f732b60",
Synchronized="2017-08-05 16:53:13.0")
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

@XendraTrl(Identifier="d795c960-f451-6fd4-96c5-147d3a18f348")
public static String es_PE_COLUMN_Boe_Acct_Name="Boe_Acct";

@XendraColumn(AD_Element_ID="78879dbb-e69e-43b9-b422-950c2e01634e",ColumnName="Boe_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d795c960-f451-6fd4-96c5-147d3a18f348",
Synchronized="2017-08-05 16:53:13.0")
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

@XendraTrl(Identifier="aa989eac-c8af-22b0-7098-cfafe29efbfe")
public static String es_PE_FIELD_Accounting_BOE_Confirm_Acct_Name="boe_confirm_acct";

@XendraField(AD_Column_ID="BOE_Confirm_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="1e9aba65-2df6-4a80-056e-ee01a7cf5e22",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aa989eac-c8af-22b0-7098-cfafe29efbfe")
public static final String FIELDNAME_Accounting_BOE_Confirm_Acct="aa989eac-c8af-22b0-7098-cfafe29efbfe";

@XendraTrl(Identifier="4dfcf074-5844-43ce-5eb5-b086aacdae55")
public static String es_PE_COLUMN_BOE_Confirm_Acct_Name="BOE_Confirm_Acct";

@XendraColumn(AD_Element_ID="198a83eb-d96e-43ac-e04f-dacbb2ebb44a",ColumnName="BOE_Confirm_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4dfcf074-5844-43ce-5eb5-b086aacdae55",
Synchronized="2017-08-05 16:53:13.0")
/** Column name BOE_Confirm_Acct */
public static final String COLUMNNAME_BOE_Confirm_Acct = "BOE_Confirm_Acct";
/** Set BOE_DS_Acct.
@param BOE_DS_Acct BOE_DS_Acct */
public void setBOE_DS_Acct (int BOE_DS_Acct)
{
set_Value (COLUMNNAME_BOE_DS_Acct, Integer.valueOf(BOE_DS_Acct));
}
/** Get BOE_DS_Acct.
@return BOE_DS_Acct */
public int getBOE_DS_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_BOE_DS_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a6b3d33e-19c8-1248-8d3a-c26bbd530d66")
public static String es_PE_FIELD_Accounting_BOE_DS_Acct_Name="Letra en Descuento";

@XendraField(AD_Column_ID="BOE_DS_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="1e9aba65-2df6-4a80-056e-ee01a7cf5e22",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a6b3d33e-19c8-1248-8d3a-c26bbd530d66")
public static final String FIELDNAME_Accounting_BOE_DS_Acct="a6b3d33e-19c8-1248-8d3a-c26bbd530d66";

@XendraTrl(Identifier="cd2bd807-7d4d-33b9-4778-ac4c3e92cd94")
public static String es_PE_COLUMN_BOE_DS_Acct_Name="BOE_DS_Acct";

@XendraColumn(AD_Element_ID="e1f71f69-9bde-50f2-ec3d-bc44c1710a98",ColumnName="BOE_DS_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cd2bd807-7d4d-33b9-4778-ac4c3e92cd94",
Synchronized="2017-08-05 16:53:13.0")
/** Column name BOE_DS_Acct */
public static final String COLUMNNAME_BOE_DS_Acct = "BOE_DS_Acct";
/** Set BOE_PD_Acct.
@param BOE_PD_Acct BOE_PD_Acct */
public void setBOE_PD_Acct (int BOE_PD_Acct)
{
set_Value (COLUMNNAME_BOE_PD_Acct, Integer.valueOf(BOE_PD_Acct));
}
/** Get BOE_PD_Acct.
@return BOE_PD_Acct */
public int getBOE_PD_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_BOE_PD_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="12914c35-90c1-46e3-0d8c-756043c90a22")
public static String es_PE_FIELD_Accounting_BOE_PD_Acct_Name="Letra Protestada";

@XendraField(AD_Column_ID="BOE_PD_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="1e9aba65-2df6-4a80-056e-ee01a7cf5e22",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="12914c35-90c1-46e3-0d8c-756043c90a22")
public static final String FIELDNAME_Accounting_BOE_PD_Acct="12914c35-90c1-46e3-0d8c-756043c90a22";

@XendraTrl(Identifier="c843e885-6244-5932-ffa5-ab08d16e4258")
public static String es_PE_COLUMN_BOE_PD_Acct_Name="BOE_PD_Acct";

@XendraColumn(AD_Element_ID="c3b00f43-850c-0163-9141-42ae5a3275d7",ColumnName="BOE_PD_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c843e885-6244-5932-ffa5-ab08d16e4258",
Synchronized="2017-08-05 16:53:13.0")
/** Column name BOE_PD_Acct */
public static final String COLUMNNAME_BOE_PD_Acct = "BOE_PD_Acct";
/** Set BOE_RV_Acct.
@param BOE_RV_Acct BOE_RV_Acct */
public void setBOE_RV_Acct (int BOE_RV_Acct)
{
set_Value (COLUMNNAME_BOE_RV_Acct, Integer.valueOf(BOE_RV_Acct));
}
/** Get BOE_RV_Acct.
@return BOE_RV_Acct */
public int getBOE_RV_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_BOE_RV_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="dd2b3164-7fcd-8691-96eb-62bb86a3249a")
public static String es_PE_FIELD_Accounting_BOE_RV_Acct_Name="Letra en Cobranza";

@XendraField(AD_Column_ID="BOE_RV_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="1e9aba65-2df6-4a80-056e-ee01a7cf5e22",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dd2b3164-7fcd-8691-96eb-62bb86a3249a")
public static final String FIELDNAME_Accounting_BOE_RV_Acct="dd2b3164-7fcd-8691-96eb-62bb86a3249a";

@XendraTrl(Identifier="84a7b3ec-c0c8-4cf2-770c-de9d1b1ed61d")
public static String es_PE_COLUMN_BOE_RV_Acct_Name="BOE_RV_Acct";

@XendraColumn(AD_Element_ID="6c7f2bc2-5c5c-ff6f-b5a0-e52eeb1f1fa4",ColumnName="BOE_RV_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="84a7b3ec-c0c8-4cf2-770c-de9d1b1ed61d",
Synchronized="2017-08-05 16:53:13.0")
/** Column name BOE_RV_Acct */
public static final String COLUMNNAME_BOE_RV_Acct = "BOE_RV_Acct";
/** Set BOE_WR_Acct.
@param BOE_WR_Acct BOE_WR_Acct */
public void setBOE_WR_Acct (int BOE_WR_Acct)
{
set_Value (COLUMNNAME_BOE_WR_Acct, Integer.valueOf(BOE_WR_Acct));
}
/** Get BOE_WR_Acct.
@return BOE_WR_Acct */
public int getBOE_WR_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_BOE_WR_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="54340bbe-5090-ecf3-c5c3-8046a640259d")
public static String es_PE_FIELD_Accounting_BOE_WR_Acct_Name="Letra en Garantia";

@XendraField(AD_Column_ID="BOE_WR_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="1e9aba65-2df6-4a80-056e-ee01a7cf5e22",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="54340bbe-5090-ecf3-c5c3-8046a640259d")
public static final String FIELDNAME_Accounting_BOE_WR_Acct="54340bbe-5090-ecf3-c5c3-8046a640259d";

@XendraTrl(Identifier="9680be62-996a-ce02-6646-bcb37827eaaf")
public static String es_PE_COLUMN_BOE_WR_Acct_Name="BOE_WR_Acct";

@XendraColumn(AD_Element_ID="ee8f86d6-e904-43ff-e20d-288f09ed7134",ColumnName="BOE_WR_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9680be62-996a-ce02-6646-bcb37827eaaf",
Synchronized="2017-08-05 16:53:13.0")
/** Column name BOE_WR_Acct */
public static final String COLUMNNAME_BOE_WR_Acct = "BOE_WR_Acct";
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

@XendraTrl(Identifier="7d011e4f-a24a-41aa-af25-c7a62f529f35")
public static String es_PE_FIELD_Accounting_PaymentSelection_Description="Cuenta de limpieza de selección de pagos de Cuentas por Pagar";

@XendraTrl(Identifier="7d011e4f-a24a-41aa-af25-c7a62f529f35")
public static String es_PE_FIELD_Accounting_PaymentSelection_Name="Selección de Pagos";

@XendraField(AD_Column_ID="B_PaymentSelect_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="1e9aba65-2df6-4a80-056e-ee01a7cf5e22",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7d011e4f-a24a-41aa-af25-c7a62f529f35")
public static final String FIELDNAME_Accounting_PaymentSelection="7d011e4f-a24a-41aa-af25-c7a62f529f35";

@XendraTrl(Identifier="cf26af98-43ad-6c4d-b50e-469b08f7ea23")
public static String es_PE_COLUMN_B_PaymentSelect_Acct_Name="Selección de Pagos";

@XendraColumn(AD_Element_ID="678a5c81-2ff8-177f-a0da-71224d82ba15",
ColumnName="B_PaymentSelect_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="cf26af98-43ad-6c4d-b50e-469b08f7ea23",Synchronized="2017-08-05 16:53:13.0")
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

@XendraTrl(Identifier="df59b823-eb20-d4a3-7de7-831ef5a2804c")
public static String es_PE_FIELD_Accounting_BankRevaluationGain_Description="Cuenta de ganancias por reevaluación (Bancos)";

@XendraTrl(Identifier="df59b823-eb20-d4a3-7de7-831ef5a2804c")
public static String es_PE_FIELD_Accounting_BankRevaluationGain_Help="La cuenta de ganancias por reevaluación en bancos identifica la cuenta a ser usada para registrar ganancias que son reconocidas cuando se convierten las monedas";

@XendraTrl(Identifier="df59b823-eb20-d4a3-7de7-831ef5a2804c")
public static String es_PE_FIELD_Accounting_BankRevaluationGain_Name="Cuenta de Ganancias por Reevaluación (Bancos)";

@XendraField(AD_Column_ID="B_RevaluationGain_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="1e9aba65-2df6-4a80-056e-ee01a7cf5e22",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="df59b823-eb20-d4a3-7de7-831ef5a2804c")
public static final String FIELDNAME_Accounting_BankRevaluationGain="df59b823-eb20-d4a3-7de7-831ef5a2804c";

@XendraTrl(Identifier="503ed391-b46d-b3f5-614b-17bf719b594c")
public static String es_PE_COLUMN_B_RevaluationGain_Acct_Name="Cuenta de Ganancias por Reevaluación (Bancos)";

@XendraColumn(AD_Element_ID="413aa737-11c8-247d-e1d9-cfe273936e9c",
ColumnName="B_RevaluationGain_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="503ed391-b46d-b3f5-614b-17bf719b594c",Synchronized="2017-08-05 16:53:13.0")
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

@XendraTrl(Identifier="36c2c88a-9870-e03c-cb21-8730f29a488c")
public static String es_PE_FIELD_Accounting_BankRevaluationLoss_Description="Cuenta de pérdida por reevaluación (Bancos)";

@XendraTrl(Identifier="36c2c88a-9870-e03c-cb21-8730f29a488c")
public static String es_PE_FIELD_Accounting_BankRevaluationLoss_Help="La cuenta de pérdidas por reevaluación en bancos identifica la cuenta a ser usada para registrar pérdidas que son reconocidas cuando se convierten las monedas";

@XendraTrl(Identifier="36c2c88a-9870-e03c-cb21-8730f29a488c")
public static String es_PE_FIELD_Accounting_BankRevaluationLoss_Name="Cuenta de Pérdida por Reevaluación (Bancos)";

@XendraField(AD_Column_ID="B_RevaluationLoss_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="1e9aba65-2df6-4a80-056e-ee01a7cf5e22",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="36c2c88a-9870-e03c-cb21-8730f29a488c")
public static final String FIELDNAME_Accounting_BankRevaluationLoss="36c2c88a-9870-e03c-cb21-8730f29a488c";

@XendraTrl(Identifier="06a99022-e2ff-7d71-ad7b-1bda3b675c53")
public static String es_PE_COLUMN_B_RevaluationLoss_Acct_Name="Cuenta de Pérdida por Reevaluación (Bancos)";

@XendraColumn(AD_Element_ID="2453ca7e-30f0-b91a-386e-1bb02867d729",
ColumnName="B_RevaluationLoss_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="06a99022-e2ff-7d71-ad7b-1bda3b675c53",Synchronized="2017-08-05 16:53:13.0")
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

@XendraTrl(Identifier="8bc87697-6c13-7763-0127-9e9db712ca8c")
public static String es_PE_FIELD_Accounting_BankSettlementGain_Description="Cuenta de ganancia por ajuste";

@XendraTrl(Identifier="8bc87697-6c13-7763-0127-9e9db712ca8c")
public static String es_PE_FIELD_Accounting_BankSettlementGain_Help="La cuenta de ganancia por ajuste identifica la cuenta a ser usada cuando se registra la ganancia por moneda cuando la moneda de ajuste y recibo no son las mismas";

@XendraTrl(Identifier="8bc87697-6c13-7763-0127-9e9db712ca8c")
public static String es_PE_FIELD_Accounting_BankSettlementGain_Name="Cuenta de Ganancia por Ajuste";

@XendraField(AD_Column_ID="B_SettlementGain_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="1e9aba65-2df6-4a80-056e-ee01a7cf5e22",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8bc87697-6c13-7763-0127-9e9db712ca8c")
public static final String FIELDNAME_Accounting_BankSettlementGain="8bc87697-6c13-7763-0127-9e9db712ca8c";

@XendraTrl(Identifier="04256e01-63ac-3cc9-b05c-5067d7037f4a")
public static String es_PE_COLUMN_B_SettlementGain_Acct_Name="Cuenta de Ganancia por Ajuste";

@XendraColumn(AD_Element_ID="69484662-45d2-696e-4b4e-a08735ac114c",
ColumnName="B_SettlementGain_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="04256e01-63ac-3cc9-b05c-5067d7037f4a",Synchronized="2017-08-05 16:53:13.0")
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

@XendraTrl(Identifier="5b15eb06-827c-4f0e-a092-d72530d82493")
public static String es_PE_FIELD_Accounting_BankSettlementLoss_Description="Cuenta de pérdida por ajuste";

@XendraTrl(Identifier="5b15eb06-827c-4f0e-a092-d72530d82493")
public static String es_PE_FIELD_Accounting_BankSettlementLoss_Help="La cuenta de pérdida por ajuste identifica la cuenta a ser usada cuando se registra la pérdida por moneda cuando la moneda de ajuste y recibo no son las mismas";

@XendraTrl(Identifier="5b15eb06-827c-4f0e-a092-d72530d82493")
public static String es_PE_FIELD_Accounting_BankSettlementLoss_Name="Cuenta de Pérdida por Ajuste";

@XendraField(AD_Column_ID="B_SettlementLoss_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="1e9aba65-2df6-4a80-056e-ee01a7cf5e22",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5b15eb06-827c-4f0e-a092-d72530d82493")
public static final String FIELDNAME_Accounting_BankSettlementLoss="5b15eb06-827c-4f0e-a092-d72530d82493";

@XendraTrl(Identifier="e2547f6a-20a0-6a4f-c7e2-88812c3c0c0a")
public static String es_PE_COLUMN_B_SettlementLoss_Acct_Name="Cuenta de Pérdida por Ajuste";

@XendraColumn(AD_Element_ID="e5abee12-3aeb-2005-796f-d4b9a462d68c",
ColumnName="B_SettlementLoss_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e2547f6a-20a0-6a4f-c7e2-88812c3c0c0a",Synchronized="2017-08-05 16:53:13.0")
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

@XendraTrl(Identifier="5ff4433f-8129-9e01-a06f-7a8f1064fb37")
public static String es_PE_FIELD_Accounting_UnallocatedCash_Description="Cuenta de limpieza para efectivo no asignado";

@XendraTrl(Identifier="5ff4433f-8129-9e01-a06f-7a8f1064fb37")
public static String es_PE_FIELD_Accounting_UnallocatedCash_Help="Recibos no asignados a facturas";

@XendraTrl(Identifier="5ff4433f-8129-9e01-a06f-7a8f1064fb37")
public static String es_PE_FIELD_Accounting_UnallocatedCash_Name="Efectivo no asignado";

@XendraField(AD_Column_ID="B_UnallocatedCash_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="1e9aba65-2df6-4a80-056e-ee01a7cf5e22",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5ff4433f-8129-9e01-a06f-7a8f1064fb37")
public static final String FIELDNAME_Accounting_UnallocatedCash="5ff4433f-8129-9e01-a06f-7a8f1064fb37";

@XendraTrl(Identifier="965c8d50-abae-f82f-171f-3b3f7c30f3d6")
public static String es_PE_COLUMN_B_UnallocatedCash_Acct_Name="Efectivo no asignado";

@XendraColumn(AD_Element_ID="89dcf1cf-f1eb-937a-eeeb-3ee89dcbb735",
ColumnName="B_UnallocatedCash_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="965c8d50-abae-f82f-171f-3b3f7c30f3d6",Synchronized="2017-08-05 16:53:13.0")
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

@XendraTrl(Identifier="8b1b7eb6-3392-8ead-fda3-95220cddce0d")
public static String es_PE_FIELD_Accounting_BankUnidentifiedReceipts_Description="Cuenta de Cobros no identificados";

@XendraTrl(Identifier="8b1b7eb6-3392-8ead-fda3-95220cddce0d")
public static String es_PE_FIELD_Accounting_BankUnidentifiedReceipts_Help="La cuenta de cobros no identificados se refiere a la cuenta a ser usada cuando se registran los cobros que no pueden ser conciliados en el momento actual";

@XendraTrl(Identifier="8b1b7eb6-3392-8ead-fda3-95220cddce0d")
public static String es_PE_FIELD_Accounting_BankUnidentifiedReceipts_Name="Cuenta de Cobros no identificados";

@XendraField(AD_Column_ID="B_Unidentified_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="1e9aba65-2df6-4a80-056e-ee01a7cf5e22",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8b1b7eb6-3392-8ead-fda3-95220cddce0d")
public static final String FIELDNAME_Accounting_BankUnidentifiedReceipts="8b1b7eb6-3392-8ead-fda3-95220cddce0d";

@XendraTrl(Identifier="a7835978-b5de-315c-7c08-2e22576ffc43")
public static String es_PE_COLUMN_B_Unidentified_Acct_Name="Cuenta de Cobros no identificados";

@XendraColumn(AD_Element_ID="2ffafa86-2bd5-2404-84ed-12e76e62cf24",
ColumnName="B_Unidentified_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a7835978-b5de-315c-7c08-2e22576ffc43",Synchronized="2017-08-05 16:53:13.0")
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

@XendraTrl(Identifier="4b8f84f8-202b-a002-0a46-5fd9719787f3")
public static String es_PE_FIELD_Accounting_AccountingSchema_Description="Reglas para contabilizar";

@XendraTrl(Identifier="4b8f84f8-202b-a002-0a46-5fd9719787f3")
public static String es_PE_FIELD_Accounting_AccountingSchema_Help="Un esquema contable define las reglas contables usadas tales como método de costeo; moneda y calendario";

@XendraTrl(Identifier="4b8f84f8-202b-a002-0a46-5fd9719787f3")
public static String es_PE_FIELD_Accounting_AccountingSchema_Name="Esquema Contable";

@XendraField(AD_Column_ID="C_AcctSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1e9aba65-2df6-4a80-056e-ee01a7cf5e22",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4b8f84f8-202b-a002-0a46-5fd9719787f3")
public static final String FIELDNAME_Accounting_AccountingSchema="4b8f84f8-202b-a002-0a46-5fd9719787f3";

@XendraTrl(Identifier="5ec63eae-81ad-19b5-cdd7-fd8fe89ef244")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5ec63eae-81ad-19b5-cdd7-fd8fe89ef244",
Synchronized="2017-08-05 16:53:13.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
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

@XendraTrl(Identifier="44f4e6eb-7d53-65f9-e883-3aeb871eb30f")
public static String es_PE_FIELD_Accounting_BankAccount_Description="Cuenta bancaria";

@XendraTrl(Identifier="44f4e6eb-7d53-65f9-e883-3aeb871eb30f")
public static String es_PE_FIELD_Accounting_BankAccount_Help="La cuenta bancaria identifica una cuenta en este banco";

@XendraTrl(Identifier="44f4e6eb-7d53-65f9-e883-3aeb871eb30f")
public static String es_PE_FIELD_Accounting_BankAccount_Name="Cuenta Bancaria";

@XendraField(AD_Column_ID="C_BankAccount_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1e9aba65-2df6-4a80-056e-ee01a7cf5e22",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="44f4e6eb-7d53-65f9-e883-3aeb871eb30f")
public static final String FIELDNAME_Accounting_BankAccount="44f4e6eb-7d53-65f9-e883-3aeb871eb30f";

@XendraTrl(Identifier="ca738cd5-4f1a-addd-9c4c-1bcb14028eeb")
public static String es_PE_COLUMN_C_BankAccount_ID_Name="Cuenta Bancaria";

@XendraColumn(AD_Element_ID="5a03bc67-316f-bd8c-9e68-b009ad1b290b",ColumnName="C_BankAccount_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ca738cd5-4f1a-addd-9c4c-1bcb14028eeb",
Synchronized="2017-08-05 16:53:13.0")
/** Column name C_BankAccount_ID */
public static final String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
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
@XendraTrl(Identifier="83dff10d-a34d-4ce6-9161-4a686d92a938")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="83dff10d-a34d-4ce6-9161-4a686d92a938",
Synchronized="2017-08-05 16:53:13.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
}
