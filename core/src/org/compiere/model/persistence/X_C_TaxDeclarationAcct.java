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
/** Generated Model for C_TaxDeclarationAcct
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_TaxDeclarationAcct extends PO
{
/** Standard Constructor
@param ctx context
@param C_TaxDeclarationAcct_ID id
@param trxName transaction
*/
public X_C_TaxDeclarationAcct (Properties ctx, int C_TaxDeclarationAcct_ID, String trxName)
{
super (ctx, C_TaxDeclarationAcct_ID, trxName);
/** if (C_TaxDeclarationAcct_ID == 0)
{
setC_AcctSchema_ID (0);
setC_TaxDeclarationAcct_ID (0);
setC_TaxDeclaration_ID (0);
setFact_Acct_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_TaxDeclarationAcct (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=820 */
public static int Table_ID=MTable.getTable_ID("C_TaxDeclarationAcct");

@XendraTrl(Identifier="b5804927-d28a-f4af-0954-edb4420f06b8")
public static String es_PE_TAB_Accounting_Description="Conciliación cuentas de impuestos";

@XendraTrl(Identifier="b5804927-d28a-f4af-0954-edb4420f06b8")
public static String es_PE_TAB_Accounting_Name="Contabilidad";

@XendraTrl(Identifier="b5804927-d28a-f4af-0954-edb4420f06b8")
public static String es_PE_TAB_Accounting_Help="Despliega toda la información contable relacionada para conciliación con documentos. Incluye todos los Ingresos/Gástos e Ingresos de Impuestos como base para un reporte detallado.";

@XendraTab(Name="Accounting",Description="Tax Accounting Reconciliation ",
Help="Displays all accounting related information for reconcilation with documents. It includes all revenue/expense and tax entries as a base for detail reporting",
AD_Window_ID="fb0fc605-6ba3-81e4-e1cd-99ec1bda901b",SeqNo=30,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="b5804927-d28a-f4af-0954-edb4420f06b8",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Accounting="b5804927-d28a-f4af-0954-edb4420f06b8";

@XendraTrl(Identifier="235a08fa-8f2f-94bd-456b-a515fda61348")
public static String es_PE_TABLE_C_TaxDeclarationAcct_Name="Cuenta Declaración de Impuestos";


@XendraTable(Name="Tax Declaration Accounting",Description="Tax Accounting Reconciliation ",
Help="Displays all accounting related information for reconcilation with documents. It includes all revenue/expense and tax entries as a base for detail reporting",
TableName="C_TaxDeclarationAcct",AccessLevel="3",
AD_Window_ID="fb0fc605-6ba3-81e4-e1cd-99ec1bda901b",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="235a08fa-8f2f-94bd-456b-a515fda61348",
Synchronized="2017-08-16 11:42:31.0")
/** TableName=C_TaxDeclarationAcct */
public static final String Table_Name="C_TaxDeclarationAcct";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_TaxDeclarationAcct");

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
    Table_ID = MTable.getTable_ID("C_TaxDeclarationAcct");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_TaxDeclarationAcct[").append(get_ID()).append("]");
return sb.toString();
}

/** Account_ID AD_Reference=c63c37c4-7a13-09ab-5af8-48da1b35609d */
public static final int ACCOUNT_ID_AD_Reference_ID=331;
/** Set Account.
@param Account_ID Account used */
public void setAccount_ID (int Account_ID)
{
throw new IllegalArgumentException ("Account_ID is virtual column");
}
/** Get Account.
@return Account used */
public int getAccount_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Account_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ff95c350-07fc-502a-a36e-af239df82dd1")
public static String es_PE_FIELD_Accounting_Account_Description="Cuenta usada";

@XendraTrl(Identifier="ff95c350-07fc-502a-a36e-af239df82dd1")
public static String es_PE_FIELD_Accounting_Account_Help="La cuenta (natural) usada";

@XendraTrl(Identifier="ff95c350-07fc-502a-a36e-af239df82dd1")
public static String es_PE_FIELD_Accounting_Account_Name="Cuenta";

@XendraField(AD_Column_ID="Account_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b5804927-d28a-f4af-0954-edb4420f06b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ff95c350-07fc-502a-a36e-af239df82dd1")
public static final String FIELDNAME_Accounting_Account="ff95c350-07fc-502a-a36e-af239df82dd1";

@XendraTrl(Identifier="b223e113-1cc7-31cc-3d93-3d0db6df8f9b")
public static String es_PE_COLUMN_Account_ID_Name="Cuenta";

@XendraColumn(AD_Element_ID="80f1c2b7-bd3e-7c80-0596-67c2f7ca3812",ColumnName="Account_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="c63c37c4-7a13-09ab-5af8-48da1b35609d",AD_Val_Rule_ID="",
FieldLength=11,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,
ColumnSQL="(SELECT Account_ID FROM Fact_Acct f WHERE f.Fact_Acct_ID=C_TaxDeclarationAcct.Fact_Acct_ID)",
IsAllowLogging=false,Identifier="b223e113-1cc7-31cc-3d93-3d0db6df8f9b",
Synchronized="2017-08-05 16:54:28.0")
/** Column name Account_ID */
public static final String COLUMNNAME_Account_ID = "Account_ID";
/** Set Accounted Credit.
@param AmtAcctCr Accounted Credit Amount */
public void setAmtAcctCr (BigDecimal AmtAcctCr)
{
throw new IllegalArgumentException ("AmtAcctCr is virtual column");
}
/** Get Accounted Credit.
@return Accounted Credit Amount */
public BigDecimal getAmtAcctCr() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtAcctCr);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="d9c8fbac-427b-7d75-c33f-46efa849f76e")
public static String es_PE_FIELD_Accounting_AccountedCredit_Description="Total del crédito contabilizado";

@XendraTrl(Identifier="d9c8fbac-427b-7d75-c33f-46efa849f76e")
public static String es_PE_FIELD_Accounting_AccountedCredit_Help="El total del crédito de la cuenta indica el total de la transacción convertido a esta transacción";

@XendraTrl(Identifier="d9c8fbac-427b-7d75-c33f-46efa849f76e")
public static String es_PE_FIELD_Accounting_AccountedCredit_Name="Crédito Contabilizado";

@XendraField(AD_Column_ID="AmtAcctCr",IsCentrallyMaintained=true,
AD_Tab_ID="b5804927-d28a-f4af-0954-edb4420f06b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d9c8fbac-427b-7d75-c33f-46efa849f76e")
public static final String FIELDNAME_Accounting_AccountedCredit="d9c8fbac-427b-7d75-c33f-46efa849f76e";

@XendraTrl(Identifier="516d1035-cc83-1383-74c0-6375d72ac4ff")
public static String es_PE_COLUMN_AmtAcctCr_Name="Crédito Contabilizado";

@XendraColumn(AD_Element_ID="945e7d70-99b5-5eaf-31ef-c5f460f7626c",ColumnName="AmtAcctCr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=11,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="(SELECT AmtAcctCr FROM Fact_Acct f WHERE f.Fact_Acct_ID=C_TaxDeclarationAcct.Fact_Acct_ID)",
IsAllowLogging=false,Identifier="516d1035-cc83-1383-74c0-6375d72ac4ff",
Synchronized="2017-08-05 16:54:29.0")
/** Column name AmtAcctCr */
public static final String COLUMNNAME_AmtAcctCr = "AmtAcctCr";
/** Set Accounted Debit.
@param AmtAcctDr Accounted Debit Amount */
public void setAmtAcctDr (BigDecimal AmtAcctDr)
{
throw new IllegalArgumentException ("AmtAcctDr is virtual column");
}
/** Get Accounted Debit.
@return Accounted Debit Amount */
public BigDecimal getAmtAcctDr() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtAcctDr);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="f7dc6ac7-2db6-3b38-0b0a-836e9dfd9238")
public static String es_PE_FIELD_Accounting_AccountedDebit_Description="Débito";

@XendraTrl(Identifier="f7dc6ac7-2db6-3b38-0b0a-836e9dfd9238")
public static String es_PE_FIELD_Accounting_AccountedDebit_Help="El total del debito de la cuenta indica el total de la transacción convertido a esta transacción";

@XendraTrl(Identifier="f7dc6ac7-2db6-3b38-0b0a-836e9dfd9238")
public static String es_PE_FIELD_Accounting_AccountedDebit_Name="Débito Contabilizado";

@XendraField(AD_Column_ID="AmtAcctDr",IsCentrallyMaintained=true,
AD_Tab_ID="b5804927-d28a-f4af-0954-edb4420f06b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f7dc6ac7-2db6-3b38-0b0a-836e9dfd9238")
public static final String FIELDNAME_Accounting_AccountedDebit="f7dc6ac7-2db6-3b38-0b0a-836e9dfd9238";

@XendraTrl(Identifier="bf55365a-650d-a4ee-6367-f87f325f3e1b")
public static String es_PE_COLUMN_AmtAcctDr_Name="Débito Contabilizado";

@XendraColumn(AD_Element_ID="67410612-76a4-c113-8594-305f58926372",ColumnName="AmtAcctDr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=11,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="(SELECT AmtAcctDr FROM Fact_Acct f WHERE f.Fact_Acct_ID=C_TaxDeclarationAcct.Fact_Acct_ID)",
IsAllowLogging=false,Identifier="bf55365a-650d-a4ee-6367-f87f325f3e1b",
Synchronized="2017-08-05 16:54:29.0")
/** Column name AmtAcctDr */
public static final String COLUMNNAME_AmtAcctDr = "AmtAcctDr";
/** Set Source Credit.
@param AmtSourceCr Source Credit Amount */
public void setAmtSourceCr (BigDecimal AmtSourceCr)
{
throw new IllegalArgumentException ("AmtSourceCr is virtual column");
}
/** Get Source Credit.
@return Source Credit Amount */
public BigDecimal getAmtSourceCr() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtSourceCr);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="f5a6fd2d-5a1c-d143-389c-9936bc358930")
public static String es_PE_FIELD_Accounting_SourceCredit_Description="Total del Crédito en moneda fuente.";

@XendraTrl(Identifier="f5a6fd2d-5a1c-d143-389c-9936bc358930")
public static String es_PE_FIELD_Accounting_SourceCredit_Help="El Total crédito fuente indica el Total crédito para esta línea en la moneda fuente.";

@XendraTrl(Identifier="f5a6fd2d-5a1c-d143-389c-9936bc358930")
public static String es_PE_FIELD_Accounting_SourceCredit_Name="Abono";

@XendraField(AD_Column_ID="AmtSourceCr",IsCentrallyMaintained=true,
AD_Tab_ID="b5804927-d28a-f4af-0954-edb4420f06b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f5a6fd2d-5a1c-d143-389c-9936bc358930")
public static final String FIELDNAME_Accounting_SourceCredit="f5a6fd2d-5a1c-d143-389c-9936bc358930";

@XendraTrl(Identifier="c94ba92b-e325-b4fd-5007-7b5793324d4d")
public static String es_PE_COLUMN_AmtSourceCr_Name="Abono";

@XendraColumn(AD_Element_ID="37fc9554-00eb-5046-f770-46b9f63a1166",ColumnName="AmtSourceCr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=11,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="(SELECT AmtSourceCr FROM Fact_Acct f WHERE f.Fact_Acct_ID=C_TaxDeclarationAcct.Fact_Acct_ID)",
IsAllowLogging=false,Identifier="c94ba92b-e325-b4fd-5007-7b5793324d4d",
Synchronized="2017-08-05 16:54:29.0")
/** Column name AmtSourceCr */
public static final String COLUMNNAME_AmtSourceCr = "AmtSourceCr";
/** Set Source Debit.
@param AmtSourceDr Source Debit Amount */
public void setAmtSourceDr (BigDecimal AmtSourceDr)
{
throw new IllegalArgumentException ("AmtSourceDr is virtual column");
}
/** Get Source Debit.
@return Source Debit Amount */
public BigDecimal getAmtSourceDr() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtSourceDr);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="b3acd7ec-7d79-1b7b-d38a-8299745005ef")
public static String es_PE_FIELD_Accounting_SourceDebit_Description="Total del débito en moneda fuente";

@XendraTrl(Identifier="b3acd7ec-7d79-1b7b-d38a-8299745005ef")
public static String es_PE_FIELD_Accounting_SourceDebit_Help="El total débito fuente indica el total debito para esta línea en la moneda fuente";

@XendraTrl(Identifier="b3acd7ec-7d79-1b7b-d38a-8299745005ef")
public static String es_PE_FIELD_Accounting_SourceDebit_Name="Cargo";

@XendraField(AD_Column_ID="AmtSourceDr",IsCentrallyMaintained=true,
AD_Tab_ID="b5804927-d28a-f4af-0954-edb4420f06b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=true,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b3acd7ec-7d79-1b7b-d38a-8299745005ef")
public static final String FIELDNAME_Accounting_SourceDebit="b3acd7ec-7d79-1b7b-d38a-8299745005ef";

@XendraTrl(Identifier="69ced00a-a16f-b416-01a6-d28dc5f6ed05")
public static String es_PE_COLUMN_AmtSourceDr_Name="Cargo";

@XendraColumn(AD_Element_ID="83234cfc-e73c-2419-af3c-afb9356f1f68",ColumnName="AmtSourceDr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=11,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="(SELECT AmtSourceDr FROM Fact_Acct f WHERE f.Fact_Acct_ID=C_TaxDeclarationAcct.Fact_Acct_ID)",
IsAllowLogging=false,Identifier="69ced00a-a16f-b416-01a6-d28dc5f6ed05",
Synchronized="2017-08-05 16:54:29.0")
/** Column name AmtSourceDr */
public static final String COLUMNNAME_AmtSourceDr = "AmtSourceDr";
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

@XendraTrl(Identifier="316d2bf5-37a0-4983-a1f4-597a206425b6")
public static String es_PE_FIELD_Accounting_AccountingSchema_Description="Reglas para contabilizar";

@XendraTrl(Identifier="316d2bf5-37a0-4983-a1f4-597a206425b6")
public static String es_PE_FIELD_Accounting_AccountingSchema_Help="Un esquema contable define las reglas contables usadas tales como método de costeo; moneda y calendario";

@XendraTrl(Identifier="316d2bf5-37a0-4983-a1f4-597a206425b6")
public static String es_PE_FIELD_Accounting_AccountingSchema_Name="Esquema Contable";

@XendraField(AD_Column_ID="C_AcctSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b5804927-d28a-f4af-0954-edb4420f06b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="316d2bf5-37a0-4983-a1f4-597a206425b6")
public static final String FIELDNAME_Accounting_AccountingSchema="316d2bf5-37a0-4983-a1f4-597a206425b6";

@XendraTrl(Identifier="4d13f758-f1b3-5895-4112-de1539ce55fd")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4d13f758-f1b3-5895-4112-de1539ce55fd",
Synchronized="2017-08-05 16:54:29.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
throw new IllegalArgumentException ("C_BPartner_ID is virtual column");
}
/** Get Business Partner .
@return Identifies a Business Partner */
public int getC_BPartner_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="92dbafef-2979-36ba-6ec1-d184d0658d9c")
public static String es_PE_FIELD_Accounting_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="92dbafef-2979-36ba-6ec1-d184d0658d9c")
public static String es_PE_FIELD_Accounting_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="92dbafef-2979-36ba-6ec1-d184d0658d9c")
public static String es_PE_FIELD_Accounting_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b5804927-d28a-f4af-0954-edb4420f06b8",AD_FieldGroup_ID="Document",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=true,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="92dbafef-2979-36ba-6ec1-d184d0658d9c")
public static final String FIELDNAME_Accounting_BusinessPartner="92dbafef-2979-36ba-6ec1-d184d0658d9c";

@XendraTrl(Identifier="d823e0eb-41b6-ad54-1379-433c3ff1b064")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=11,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="(SELECT C_BPartner_ID FROM Fact_Acct f WHERE f.Fact_Acct_ID=C_TaxDeclarationAcct.Fact_Acct_ID)",
IsAllowLogging=false,Identifier="d823e0eb-41b6-ad54-1379-433c3ff1b064",
Synchronized="2017-08-05 16:54:29.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
throw new IllegalArgumentException ("C_Currency_ID is virtual column");
}
/** Get Currency.
@return The Currency for this record */
public int getC_Currency_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="38b6e718-bd74-231a-4429-97154fe583bc")
public static String es_PE_FIELD_Accounting_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="38b6e718-bd74-231a-4429-97154fe583bc")
public static String es_PE_FIELD_Accounting_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="38b6e718-bd74-231a-4429-97154fe583bc")
public static String es_PE_FIELD_Accounting_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b5804927-d28a-f4af-0954-edb4420f06b8",AD_FieldGroup_ID="Document",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=true,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="38b6e718-bd74-231a-4429-97154fe583bc")
public static final String FIELDNAME_Accounting_Currency="38b6e718-bd74-231a-4429-97154fe583bc";

@XendraTrl(Identifier="b14d6f50-a264-89f7-3c44-d8b7f8996790")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=11,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="(SELECT C_Currency_ID FROM Fact_Acct f WHERE f.Fact_Acct_ID=C_TaxDeclarationAcct.Fact_Acct_ID)",
IsAllowLogging=false,Identifier="b14d6f50-a264-89f7-3c44-d8b7f8996790",
Synchronized="2017-08-05 16:54:29.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Tax Declaration Accounting.
@param C_TaxDeclarationAcct_ID Tax Accounting Reconciliation  */
public void setC_TaxDeclarationAcct_ID (int C_TaxDeclarationAcct_ID)
{
if (C_TaxDeclarationAcct_ID < 1) throw new IllegalArgumentException ("C_TaxDeclarationAcct_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_TaxDeclarationAcct_ID, Integer.valueOf(C_TaxDeclarationAcct_ID));
}
/** Get Tax Declaration Accounting.
@return Tax Accounting Reconciliation  */
public int getC_TaxDeclarationAcct_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_TaxDeclarationAcct_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ad5b5b34-9db8-715e-5186-4502b8a1eda4")
public static String es_PE_FIELD_Accounting_TaxDeclarationAccounting_Description="Conciliación de la cuenta Impuestos";

@XendraTrl(Identifier="ad5b5b34-9db8-715e-5186-4502b8a1eda4")
public static String es_PE_FIELD_Accounting_TaxDeclarationAccounting_Help="Información relacionada a la contabilidad para conciliación con documentos. Incuyendo todos ingresos/gastos y entradas de  impuestos como base para un reporte detallado.";

@XendraTrl(Identifier="ad5b5b34-9db8-715e-5186-4502b8a1eda4")
public static String es_PE_FIELD_Accounting_TaxDeclarationAccounting_Name="Cuenta Declaración de Impuestos";

@XendraField(AD_Column_ID="C_TaxDeclarationAcct_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b5804927-d28a-f4af-0954-edb4420f06b8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ad5b5b34-9db8-715e-5186-4502b8a1eda4")
public static final String FIELDNAME_Accounting_TaxDeclarationAccounting="ad5b5b34-9db8-715e-5186-4502b8a1eda4";
/** Column name C_TaxDeclarationAcct_ID */
public static final String COLUMNNAME_C_TaxDeclarationAcct_ID = "C_TaxDeclarationAcct_ID";
/** Set Tax Declaration.
@param C_TaxDeclaration_ID Define the declaration to the tax authorities */
public void setC_TaxDeclaration_ID (int C_TaxDeclaration_ID)
{
if (C_TaxDeclaration_ID < 1) throw new IllegalArgumentException ("C_TaxDeclaration_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_TaxDeclaration_ID, Integer.valueOf(C_TaxDeclaration_ID));
}
/** Get Tax Declaration.
@return Define the declaration to the tax authorities */
public int getC_TaxDeclaration_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_TaxDeclaration_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b7d736ba-0e64-c081-62dc-7ee4c9006b4f")
public static String es_PE_FIELD_Accounting_TaxDeclaration_Description="Define declaración de impuestos a las autoridades  ";

@XendraTrl(Identifier="b7d736ba-0e64-c081-62dc-7ee4c9006b4f")
public static String es_PE_FIELD_Accounting_TaxDeclaration_Help="La declaración de impuestos le permite crear información de soporte y documentos de conciliación  con la contabilidad.";

@XendraTrl(Identifier="b7d736ba-0e64-c081-62dc-7ee4c9006b4f")
public static String es_PE_FIELD_Accounting_TaxDeclaration_Name="Declaración Impuestos";

@XendraField(AD_Column_ID="C_TaxDeclaration_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b5804927-d28a-f4af-0954-edb4420f06b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b7d736ba-0e64-c081-62dc-7ee4c9006b4f")
public static final String FIELDNAME_Accounting_TaxDeclaration="b7d736ba-0e64-c081-62dc-7ee4c9006b4f";

@XendraTrl(Identifier="6b0b67ac-db0e-bcff-3a1c-8c54b050042b")
public static String es_PE_COLUMN_C_TaxDeclaration_ID_Name="Declaración Impuestos";

@XendraColumn(AD_Element_ID="91b35a12-f73d-10ef-9906-7612a8622caf",
ColumnName="C_TaxDeclaration_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6b0b67ac-db0e-bcff-3a1c-8c54b050042b",Synchronized="2017-08-05 16:54:29.0")
/** Column name C_TaxDeclaration_ID */
public static final String COLUMNNAME_C_TaxDeclaration_ID = "C_TaxDeclaration_ID";
/** Set Tax.
@param C_Tax_ID Tax identifier */
public void setC_Tax_ID (int C_Tax_ID)
{
throw new IllegalArgumentException ("C_Tax_ID is virtual column");
}
/** Get Tax.
@return Tax identifier */
public int getC_Tax_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Tax_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="09db371e-2c26-bf55-4d00-65c8c09349b2")
public static String es_PE_FIELD_Accounting_Tax_Description="Identificador del Impuesto";

@XendraTrl(Identifier="09db371e-2c26-bf55-4d00-65c8c09349b2")
public static String es_PE_FIELD_Accounting_Tax_Help="El Impuesto indica el tipo de impuesto para esta línea del documento";

@XendraTrl(Identifier="09db371e-2c26-bf55-4d00-65c8c09349b2")
public static String es_PE_FIELD_Accounting_Tax_Name="Impuesto";

@XendraField(AD_Column_ID="C_Tax_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b5804927-d28a-f4af-0954-edb4420f06b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="09db371e-2c26-bf55-4d00-65c8c09349b2")
public static final String FIELDNAME_Accounting_Tax="09db371e-2c26-bf55-4d00-65c8c09349b2";

@XendraTrl(Identifier="a220c0ea-b8d8-b7b8-f3ef-fdc1bbeacc34")
public static String es_PE_COLUMN_C_Tax_ID_Name="Impuesto";

@XendraColumn(AD_Element_ID="38ff24fc-b68c-51a9-60f8-ef2a1f060de2",ColumnName="C_Tax_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=11,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="(SELECT C_Tax_ID FROM Fact_Acct f WHERE f.Fact_Acct_ID=C_TaxDeclarationAcct.Fact_Acct_ID)",
IsAllowLogging=false,Identifier="a220c0ea-b8d8-b7b8-f3ef-fdc1bbeacc34",
Synchronized="2017-08-05 16:54:29.0")
/** Column name C_Tax_ID */
public static final String COLUMNNAME_C_Tax_ID = "C_Tax_ID";
/** Set Account Date.
@param DateAcct Accounting Date */
public void setDateAcct (Timestamp DateAcct)
{
throw new IllegalArgumentException ("DateAcct is virtual column");
}
/** Get Account Date.
@return Accounting Date */
public Timestamp getDateAcct() 
{
return (Timestamp)get_Value(COLUMNNAME_DateAcct);
}

@XendraTrl(Identifier="ac5cfec9-a4b0-35c4-5015-8452e00767fe")
public static String es_PE_FIELD_Accounting_AccountDate_Description="Fecha contable";

@XendraTrl(Identifier="ac5cfec9-a4b0-35c4-5015-8452e00767fe")
public static String es_PE_FIELD_Accounting_AccountDate_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraTrl(Identifier="ac5cfec9-a4b0-35c4-5015-8452e00767fe")
public static String es_PE_FIELD_Accounting_AccountDate_Name="Fecha de Aplicación CG";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="b5804927-d28a-f4af-0954-edb4420f06b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ac5cfec9-a4b0-35c4-5015-8452e00767fe")
public static final String FIELDNAME_Accounting_AccountDate="ac5cfec9-a4b0-35c4-5015-8452e00767fe";

@XendraTrl(Identifier="6454e35c-2529-94a0-4479-cf509beb7f75")
public static String es_PE_COLUMN_DateAcct_Name="Fecha de Aplicación CG";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=11,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="(SELECT DateAcct FROM Fact_Acct f WHERE f.Fact_Acct_ID=C_TaxDeclarationAcct.Fact_Acct_ID)",
IsAllowLogging=false,Identifier="6454e35c-2529-94a0-4479-cf509beb7f75",
Synchronized="2017-08-05 16:54:29.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";
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

@XendraTrl(Identifier="6fcd4664-17c5-379d-a4b5-df1479e68881")
public static String es_PE_FIELD_Accounting_Description_Description="Observación";

@XendraTrl(Identifier="6fcd4664-17c5-379d-a4b5-df1479e68881")
public static String es_PE_FIELD_Accounting_Description_Help="Observación";

@XendraTrl(Identifier="6fcd4664-17c5-379d-a4b5-df1479e68881")
public static String es_PE_FIELD_Accounting_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="b5804927-d28a-f4af-0954-edb4420f06b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6fcd4664-17c5-379d-a4b5-df1479e68881")
public static final String FIELDNAME_Accounting_Description="6fcd4664-17c5-379d-a4b5-df1479e68881";

@XendraTrl(Identifier="03e51515-4a07-6d4a-c96f-01c650cdd2bb")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="03e51515-4a07-6d4a-c96f-01c650cdd2bb",
Synchronized="2017-08-05 16:54:29.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Accounting Fact.
@param Fact_Acct_ID Accounting Fact */
public void setFact_Acct_ID (int Fact_Acct_ID)
{
if (Fact_Acct_ID < 1) throw new IllegalArgumentException ("Fact_Acct_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_Fact_Acct_ID, Integer.valueOf(Fact_Acct_ID));
}
/** Get Accounting Fact.
@return Accounting Fact */
public int getFact_Acct_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Fact_Acct_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0d08fff7-f422-4076-b931-1e1a9fd72175")
public static String es_PE_FIELD_Accounting_AccountingFact_Name="Hecho Contable";

@XendraField(AD_Column_ID="Fact_Acct_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b5804927-d28a-f4af-0954-edb4420f06b8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0d08fff7-f422-4076-b931-1e1a9fd72175")
public static final String FIELDNAME_Accounting_AccountingFact="0d08fff7-f422-4076-b931-1e1a9fd72175";

@XendraTrl(Identifier="93bc50ab-62bc-8153-6bb0-896cae83b225")
public static String es_PE_COLUMN_Fact_Acct_ID_Name="Hecho Contable";

@XendraColumn(AD_Element_ID="c1839793-0346-4c78-96ff-8f7942ce0082",ColumnName="Fact_Acct_ID",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="93bc50ab-62bc-8153-6bb0-896cae83b225",
Synchronized="2017-08-05 16:54:29.0")
/** Column name Fact_Acct_ID */
public static final String COLUMNNAME_Fact_Acct_ID = "Fact_Acct_ID";
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
@XendraTrl(Identifier="2ad2be8c-cc9a-480c-b371-435294a75b16")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2ad2be8c-cc9a-480c-b371-435294a75b16",
Synchronized="2017-08-05 16:54:29.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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

@XendraTrl(Identifier="b9b36cf8-4db6-4a2a-8dda-6f468817b3af")
public static String es_PE_FIELD_Accounting_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="b9b36cf8-4db6-4a2a-8dda-6f468817b3af")
public static String es_PE_FIELD_Accounting_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraTrl(Identifier="b9b36cf8-4db6-4a2a-8dda-6f468817b3af")
public static String es_PE_FIELD_Accounting_LineNo_Name="No. Línea";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="b5804927-d28a-f4af-0954-edb4420f06b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b9b36cf8-4db6-4a2a-8dda-6f468817b3af")
public static final String FIELDNAME_Accounting_LineNo="b9b36cf8-4db6-4a2a-8dda-6f468817b3af";

@XendraTrl(Identifier="b89534de-8daf-4ba1-5bbc-6a1eed99e93c")
public static String es_PE_COLUMN_Line_Name="No. Línea";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b89534de-8daf-4ba1-5bbc-6a1eed99e93c",
Synchronized="2017-08-05 16:54:29.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";
}
