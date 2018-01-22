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
/** Generated Model for C_BankStatementLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_BankStatementLine extends PO
{
/** Standard Constructor
@param ctx context
@param C_BankStatementLine_ID id
@param trxName transaction
*/
public X_C_BankStatementLine (Properties ctx, int C_BankStatementLine_ID, String trxName)
{
super (ctx, C_BankStatementLine_ID, trxName);
/** if (C_BankStatementLine_ID == 0)
{
setC_BankStatement_ID (0);
setC_BankStatementLine_ID (0);
setC_Charge_ID (0);
setC_Currency_ID (0);	
// @SQL=SELECT C_Currency_ID FROM C_BankAccount WHERE C_BankAccount_ID=@C_BankAccount_ID@
setChargeAmt (Env.ZERO);	
// 0
setDateAcct (new Timestamp(System.currentTimeMillis()));	
// @StatementDate@
setInterestAmt (Env.ZERO);	
// 0
setIsManual (true);	
// Y
setIsReversal (false);	
// N
setLine (0);	
// @SQL=SELECT COALESCE(MAX(Line),0)+10 FROM C_BankStatementLine WHERE C_BankStatement_ID=@C_BankStatement_ID@
setProcessed (false);	
// N
setStatementLineDate (new Timestamp(System.currentTimeMillis()));	
// @StatementLineDate@
setStmtAmt (Env.ZERO);	
// 0
setTrxAmt (Env.ZERO);	
// 0
setValutaDate (new Timestamp(System.currentTimeMillis()));	
// @StatementDate@
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_BankStatementLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=393 */
public static int Table_ID=MTable.getTable_ID("C_BankStatementLine");

@XendraTrl(Identifier="44026b30-2ee9-a0ce-c4af-c07a51f7d15f")
public static String es_PE_TAB_StatementLine_Description="Ìtem del Estado de Cuentas";

@XendraTrl(Identifier="44026b30-2ee9-a0ce-c4af-c07a51f7d15f")
public static String es_PE_TAB_StatementLine_Name="Ìtem Edo. de Cuentas";

@XendraTrl(Identifier="44026b30-2ee9-a0ce-c4af-c07a51f7d15f")
public static String es_PE_TAB_StatementLine_Help="La pestaña Ìtem Edo. de Cuentas define las líneas individuales en el Estado de Cuentas bancario. Las líneas pueden ser introducidas manualmente ó generadas desde entradas de pagos.";

@XendraTab(Name="Statement Line",Description="Statement Line",
Help="The Statement Line Tab defines the individual line items on the Bank Statement.  They can be entered manually or generated from payments entered. <br>For Posting, the bank account organization is used, if it is not a charge.",
AD_Window_ID="5b26c020-cbec-1897-1781-73fd519089d4",SeqNo=20,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="44026b30-2ee9-a0ce-c4af-c07a51f7d15f",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_StatementLine="44026b30-2ee9-a0ce-c4af-c07a51f7d15f";

@XendraTrl(Identifier="11f17897-73a5-d583-6d49-d294338887a6")
public static String es_PE_TABLE_C_BankStatementLine_Name="Línea de Estado de Cuenta";


@XendraTable(Name="Bank statement line",Description="Line on a statement from this Bank",Help="",
TableName="C_BankStatementLine",AccessLevel="3",
AD_Window_ID="5b26c020-cbec-1897-1781-73fd519089d4",AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="11f17897-73a5-d583-6d49-d294338887a6",
Synchronized="2017-08-16 11:41:23.0")
/** TableName=C_BankStatementLine */
public static final String Table_Name="C_BankStatementLine";


@XendraIndex(Name="c_bankstmtline_bankstmt",Identifier="27300351-34c1-37e4-7fee-843e943f07dd",
Column_Names="c_bankstatement_id",IsUnique="false",
TableIdentifier="27300351-34c1-37e4-7fee-843e943f07dd",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_bankstmtline_bankstmt = "27300351-34c1-37e4-7fee-843e943f07dd";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_BankStatementLine");

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
    Table_ID = MTable.getTable_ID("C_BankStatementLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_BankStatementLine[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Bank Statement.
@param C_BankStatement_ID Bank Statement of account */
public void setC_BankStatement_ID (int C_BankStatement_ID)
{
if (C_BankStatement_ID < 1) throw new IllegalArgumentException ("C_BankStatement_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_BankStatement_ID, Integer.valueOf(C_BankStatement_ID));
}
/** Get Bank Statement.
@return Bank Statement of account */
public int getC_BankStatement_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BankStatement_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4726cf45-2559-420d-7580-3410708fd261")
public static String es_PE_FIELD_StatementLine_BankStatement_Description="Balance bancario de la cuenta";

@XendraTrl(Identifier="4726cf45-2559-420d-7580-3410708fd261")
public static String es_PE_FIELD_StatementLine_BankStatement_Help="El balance bancario identifica un balance único para un período de tiempo definido. El balance lista todas las transacciones que han ocurrido";

@XendraTrl(Identifier="4726cf45-2559-420d-7580-3410708fd261")
public static String es_PE_FIELD_StatementLine_BankStatement_Name="Balance Bancario";

@XendraField(AD_Column_ID="C_BankStatement_ID",IsCentrallyMaintained=true,
AD_Tab_ID="44026b30-2ee9-a0ce-c4af-c07a51f7d15f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4726cf45-2559-420d-7580-3410708fd261")
public static final String FIELDNAME_StatementLine_BankStatement="4726cf45-2559-420d-7580-3410708fd261";

@XendraTrl(Identifier="d009a646-cd5d-0a25-0d22-16bbe3575ed7")
public static String es_PE_COLUMN_C_BankStatement_ID_Name="Balance Bancario";

@XendraColumn(AD_Element_ID="8105d871-aa63-d678-57d6-1450c5b5d3d4",ColumnName="C_BankStatement_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=3,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d009a646-cd5d-0a25-0d22-16bbe3575ed7",
Synchronized="2017-08-05 16:53:14.0")
/** Column name C_BankStatement_ID */
public static final String COLUMNNAME_C_BankStatement_ID = "C_BankStatement_ID";
/** Set Bank statement line.
@param C_BankStatementLine_ID Line on a statement from this Bank */
public void setC_BankStatementLine_ID (int C_BankStatementLine_ID)
{
if (C_BankStatementLine_ID < 1) throw new IllegalArgumentException ("C_BankStatementLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_BankStatementLine_ID, Integer.valueOf(C_BankStatementLine_ID));
}
/** Get Bank statement line.
@return Line on a statement from this Bank */
public int getC_BankStatementLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BankStatementLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d72a7b0a-a4a3-e1b1-0392-d6f37a3ca7da")
public static String es_PE_FIELD_StatementLine_BankStatementLine_Description="Item del estado de cuenta de este banco";

@XendraTrl(Identifier="d72a7b0a-a4a3-e1b1-0392-d6f37a3ca7da")
public static String es_PE_FIELD_StatementLine_BankStatementLine_Help="Identifica una transacción única (Pagos; retiros; cargos) para el período de tiempo definido en este banco.";

@XendraTrl(Identifier="d72a7b0a-a4a3-e1b1-0392-d6f37a3ca7da")
public static String es_PE_FIELD_StatementLine_BankStatementLine_Name="Item de Estado de Cuenta";

@XendraField(AD_Column_ID="C_BankStatementLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="44026b30-2ee9-a0ce-c4af-c07a51f7d15f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d72a7b0a-a4a3-e1b1-0392-d6f37a3ca7da")
public static final String FIELDNAME_StatementLine_BankStatementLine="d72a7b0a-a4a3-e1b1-0392-d6f37a3ca7da";
/** Column name C_BankStatementLine_ID */
public static final String COLUMNNAME_C_BankStatementLine_ID = "C_BankStatementLine_ID";
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

@XendraTrl(Identifier="6408ef37-bae0-7d0c-7313-a7b4d87a9cfb")
public static String es_PE_FIELD_StatementLine_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="6408ef37-bae0-7d0c-7313-a7b4d87a9cfb")
public static String es_PE_FIELD_StatementLine_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="6408ef37-bae0-7d0c-7313-a7b4d87a9cfb")
public static String es_PE_FIELD_StatementLine_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="44026b30-2ee9-a0ce-c4af-c07a51f7d15f",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6408ef37-bae0-7d0c-7313-a7b4d87a9cfb")
public static final String FIELDNAME_StatementLine_BusinessPartner="6408ef37-bae0-7d0c-7313-a7b4d87a9cfb";

@XendraTrl(Identifier="3154d0bd-5294-a27b-9854-beb2e28de462")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="06fdbbe9-e1c4-3ee4-4a9d-73d1a990cc42",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="@C_Payment_ID@!0",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3154d0bd-5294-a27b-9854-beb2e28de462",Synchronized="2017-08-05 16:53:15.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Charge.
@param C_Charge_ID Additional document charges */
public void setC_Charge_ID (int C_Charge_ID)
{
if (C_Charge_ID < 1) throw new IllegalArgumentException ("C_Charge_ID is mandatory.");
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

@XendraTrl(Identifier="9e6ece20-9575-d952-76db-aa567648fa43")
public static String es_PE_FIELD_StatementLine_Charge_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="9e6ece20-9575-d952-76db-aa567648fa43")
public static String es_PE_FIELD_StatementLine_Charge_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraTrl(Identifier="9e6ece20-9575-d952-76db-aa567648fa43")
public static String es_PE_FIELD_StatementLine_Charge_Name="Cargo";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="44026b30-2ee9-a0ce-c4af-c07a51f7d15f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ChargeAmt@!0",DisplayLength=14,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9e6ece20-9575-d952-76db-aa567648fa43")
public static final String FIELDNAME_StatementLine_Charge="9e6ece20-9575-d952-76db-aa567648fa43";

@XendraTrl(Identifier="452f1ae3-6bf2-d15d-328b-e84e280fe035")
public static String es_PE_COLUMN_C_Charge_ID_Name="Cargo";

@XendraColumn(AD_Element_ID="d7e2fc48-a26e-4ded-ea44-fe15849a7883",ColumnName="C_Charge_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="452f1ae3-6bf2-d15d-328b-e84e280fe035",
Synchronized="2017-08-05 16:53:15.0")
/** Column name C_Charge_ID */
public static final String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
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

@XendraTrl(Identifier="0805e774-e35d-e999-a475-12815298ec5a")
public static String es_PE_FIELD_StatementLine_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="0805e774-e35d-e999-a475-12815298ec5a")
public static String es_PE_FIELD_StatementLine_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="0805e774-e35d-e999-a475-12815298ec5a")
public static String es_PE_FIELD_StatementLine_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="44026b30-2ee9-a0ce-c4af-c07a51f7d15f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0805e774-e35d-e999-a475-12815298ec5a")
public static final String FIELDNAME_StatementLine_Currency="0805e774-e35d-e999-a475-12815298ec5a";

@XendraTrl(Identifier="1ef09b68-5922-e1d9-318b-3982c9de4e0b")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT C_Currency_ID FROM C_BankAccount WHERE C_BankAccount_ID=@C_BankAccount_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1ef09b68-5922-e1d9-318b-3982c9de4e0b",
Synchronized="2017-08-05 16:53:15.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Charge amount.
@param ChargeAmt Charge Amount */
public void setChargeAmt (BigDecimal ChargeAmt)
{
if (ChargeAmt == null) throw new IllegalArgumentException ("ChargeAmt is mandatory.");
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

@XendraTrl(Identifier="d7bf3e21-cddf-c1d6-3993-fbf8ed9f9745")
public static String es_PE_FIELD_StatementLine_ChargeAmount_Description="Total del Cargo";

@XendraTrl(Identifier="d7bf3e21-cddf-c1d6-3993-fbf8ed9f9745")
public static String es_PE_FIELD_StatementLine_ChargeAmount_Help="El Total Cargo indica el total para un cargo adicional";

@XendraTrl(Identifier="d7bf3e21-cddf-c1d6-3993-fbf8ed9f9745")
public static String es_PE_FIELD_StatementLine_ChargeAmount_Name="Total de Cargo";

@XendraField(AD_Column_ID="ChargeAmt",IsCentrallyMaintained=true,
AD_Tab_ID="44026b30-2ee9-a0ce-c4af-c07a51f7d15f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d7bf3e21-cddf-c1d6-3993-fbf8ed9f9745")
public static final String FIELDNAME_StatementLine_ChargeAmount="d7bf3e21-cddf-c1d6-3993-fbf8ed9f9745";

@XendraTrl(Identifier="2687e86c-1387-42a3-f03e-54ea467583e2")
public static String es_PE_COLUMN_ChargeAmt_Name="Total de Cargo";

@XendraColumn(AD_Element_ID="0700d401-01bb-8f19-a508-aa47155ba852",ColumnName="ChargeAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutBankStatement.amount",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2687e86c-1387-42a3-f03e-54ea467583e2",
Synchronized="2017-08-05 16:53:15.0")
/** Column name ChargeAmt */
public static final String COLUMNNAME_ChargeAmt = "ChargeAmt";
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

@XendraTrl(Identifier="8de87b94-8d58-d28b-b4e7-108288800fe6")
public static String es_PE_FIELD_StatementLine_Invoice_Description="Identificador de la factura";

@XendraTrl(Identifier="8de87b94-8d58-d28b-b4e7-108288800fe6")
public static String es_PE_FIELD_StatementLine_Invoice_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraTrl(Identifier="8de87b94-8d58-d28b-b4e7-108288800fe6")
public static String es_PE_FIELD_StatementLine_Invoice_Name="Factura";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="44026b30-2ee9-a0ce-c4af-c07a51f7d15f",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8de87b94-8d58-d28b-b4e7-108288800fe6")
public static final String FIELDNAME_StatementLine_Invoice="8de87b94-8d58-d28b-b4e7-108288800fe6";

@XendraTrl(Identifier="7abcd82e-91c5-9f16-fc3e-e1dc06f0f267")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Factura";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@C_Payment_ID@!0",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7abcd82e-91c5-9f16-fc3e-e1dc06f0f267",Synchronized="2017-08-05 16:53:15.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
/** Set Payment.
@param C_Payment_ID Payment identifier */
public void setC_Payment_ID (int C_Payment_ID)
{
if (C_Payment_ID <= 0) set_Value (COLUMNNAME_C_Payment_ID, null);
 else 
set_Value (COLUMNNAME_C_Payment_ID, Integer.valueOf(C_Payment_ID));
}
/** Get Payment.
@return Payment identifier */
public int getC_Payment_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Payment_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0ba661b5-b518-944f-31bd-d714ca5d0cd9")
public static String es_PE_FIELD_StatementLine_Payment_Description="Identificador del pago";

@XendraTrl(Identifier="0ba661b5-b518-944f-31bd-d714ca5d0cd9")
public static String es_PE_FIELD_StatementLine_Payment_Help="El pago es un identificador único de este pago.";

@XendraTrl(Identifier="0ba661b5-b518-944f-31bd-d714ca5d0cd9")
public static String es_PE_FIELD_StatementLine_Payment_Name="Pago";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="44026b30-2ee9-a0ce-c4af-c07a51f7d15f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0ba661b5-b518-944f-31bd-d714ca5d0cd9")
public static final String FIELDNAME_StatementLine_Payment="0ba661b5-b518-944f-31bd-d714ca5d0cd9";

@XendraTrl(Identifier="5d9753ad-8954-ced7-4a25-0ed5172ba3f0")
public static String es_PE_COLUMN_C_Payment_ID_Name="Pago";

@XendraColumn(AD_Element_ID="3ded5658-968e-94c5-207b-eed6f6a7bb43",ColumnName="C_Payment_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="23d32195-8a48-d5d0-adf7-1c84033016ee",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutBankStatement.payment",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5d9753ad-8954-ced7-4a25-0ed5172ba3f0",
Synchronized="2017-08-05 16:53:15.0")
/** Column name C_Payment_ID */
public static final String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
/** Set Create Payment.
@param CreatePayment Create Payment */
public void setCreatePayment (String CreatePayment)
{
if (CreatePayment != null && CreatePayment.length() > 1)
{
log.warning("Length > 1 - truncated");
CreatePayment = CreatePayment.substring(0,0);
}
set_Value (COLUMNNAME_CreatePayment, CreatePayment);
}
/** Get Create Payment.
@return Create Payment */
public String getCreatePayment() 
{
return (String)get_Value(COLUMNNAME_CreatePayment);
}

@XendraTrl(Identifier="be817efe-7e8a-59f7-7dd5-f94798efa6f4")
public static String es_PE_FIELD_StatementLine_CreatePayment_Description="Cree el pago del estado de la información del estado de cuenta";

@XendraTrl(Identifier="be817efe-7e8a-59f7-7dd5-f94798efa6f4")
public static String es_PE_FIELD_StatementLine_CreatePayment_Name="Crea Pago";

@XendraField(AD_Column_ID="CreatePayment",IsCentrallyMaintained=true,
AD_Tab_ID="44026b30-2ee9-a0ce-c4af-c07a51f7d15f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="be817efe-7e8a-59f7-7dd5-f94798efa6f4")
public static final String FIELDNAME_StatementLine_CreatePayment="be817efe-7e8a-59f7-7dd5-f94798efa6f4";

@XendraTrl(Identifier="7683655e-e2ee-d643-2d3c-3387d96cf57b")
public static String es_PE_COLUMN_CreatePayment_Name="Crear Pagos";

@XendraColumn(AD_Element_ID="fabb4f55-394e-1364-2da9-92ae62998ea8",ColumnName="CreatePayment",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@C_Payment_ID@!0",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,
AD_Process_ID="8dfd9a54-2f4a-eb68-153d-8830b5ede723",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7683655e-e2ee-d643-2d3c-3387d96cf57b",
Synchronized="2017-08-05 16:53:15.0")
/** Column name CreatePayment */
public static final String COLUMNNAME_CreatePayment = "CreatePayment";
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

@XendraTrl(Identifier="a61a4b99-f1c0-0005-7e77-73afcbe42a6c")
public static String es_PE_FIELD_StatementLine_AccountDate_Description="Fecha contable";

@XendraTrl(Identifier="a61a4b99-f1c0-0005-7e77-73afcbe42a6c")
public static String es_PE_FIELD_StatementLine_AccountDate_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraTrl(Identifier="a61a4b99-f1c0-0005-7e77-73afcbe42a6c")
public static String es_PE_FIELD_StatementLine_AccountDate_Name="Fecha de Aplicación CG";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="44026b30-2ee9-a0ce-c4af-c07a51f7d15f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a61a4b99-f1c0-0005-7e77-73afcbe42a6c")
public static final String FIELDNAME_StatementLine_AccountDate="a61a4b99-f1c0-0005-7e77-73afcbe42a6c";

@XendraTrl(Identifier="282e9091-162e-9da1-4ea8-bdbaad3226ba")
public static String es_PE_COLUMN_DateAcct_Name="Fecha de Aplicación CG";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,
DefaultValue="@StatementDate@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="282e9091-162e-9da1-4ea8-bdbaad3226ba",Synchronized="2017-08-05 16:53:15.0")
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

@XendraTrl(Identifier="a4a1ada7-5d08-aa45-5325-271b54e9acce")
public static String es_PE_FIELD_StatementLine_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="a4a1ada7-5d08-aa45-5325-271b54e9acce")
public static String es_PE_FIELD_StatementLine_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="a4a1ada7-5d08-aa45-5325-271b54e9acce")
public static String es_PE_FIELD_StatementLine_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="44026b30-2ee9-a0ce-c4af-c07a51f7d15f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a4a1ada7-5d08-aa45-5325-271b54e9acce")
public static final String FIELDNAME_StatementLine_Description="a4a1ada7-5d08-aa45-5325-271b54e9acce";

@XendraTrl(Identifier="f8b5b34a-15c3-64cf-78a8-8b865e745950")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="f8b5b34a-15c3-64cf-78a8-8b865e745950",
Synchronized="2017-08-05 16:53:15.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set EFT Amount.
@param EftAmt Electronic Funds Transfer Amount */
public void setEftAmt (BigDecimal EftAmt)
{
set_Value (COLUMNNAME_EftAmt, EftAmt);
}
/** Get EFT Amount.
@return Electronic Funds Transfer Amount */
public BigDecimal getEftAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_EftAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="18ce6e15-a2f4-0c82-4886-526ad57886c6")
public static String es_PE_FIELD_StatementLine_EFTAmount_Description="Cantidad de Transferencia Eectronica de Fondos.";

@XendraTrl(Identifier="18ce6e15-a2f4-0c82-4886-526ad57886c6")
public static String es_PE_FIELD_StatementLine_EFTAmount_Name="Importe TEF";

@XendraField(AD_Column_ID="EftAmt",IsCentrallyMaintained=true,
AD_Tab_ID="44026b30-2ee9-a0ce-c4af-c07a51f7d15f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=340,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="18ce6e15-a2f4-0c82-4886-526ad57886c6")
public static final String FIELDNAME_StatementLine_EFTAmount="18ce6e15-a2f4-0c82-4886-526ad57886c6";

@XendraTrl(Identifier="b9463ee5-4aa0-b74a-d580-8c1ad4f1daba")
public static String es_PE_COLUMN_EftAmt_Name="Importe TEF";

@XendraColumn(AD_Element_ID="ddb6c460-9173-c3b2-d198-b5dd5cd32186",ColumnName="EftAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b9463ee5-4aa0-b74a-d580-8c1ad4f1daba",
Synchronized="2017-08-05 16:53:15.0")
/** Column name EftAmt */
public static final String COLUMNNAME_EftAmt = "EftAmt";
/** Set EFT Check No.
@param EftCheckNo Electronic Funds Transfer Check No */
public void setEftCheckNo (String EftCheckNo)
{
if (EftCheckNo != null && EftCheckNo.length() > 20)
{
log.warning("Length > 20 - truncated");
EftCheckNo = EftCheckNo.substring(0,19);
}
set_Value (COLUMNNAME_EftCheckNo, EftCheckNo);
}
/** Get EFT Check No.
@return Electronic Funds Transfer Check No */
public String getEftCheckNo() 
{
String value = (String)get_Value(COLUMNNAME_EftCheckNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="8a5f0a04-02c7-d8f8-815d-78cc3f3758a3")
public static String es_PE_FIELD_StatementLine_EFTCheckNo_Description="No. Transferencia Electrónica de Fondos Cheque.";

@XendraTrl(Identifier="8a5f0a04-02c7-d8f8-815d-78cc3f3758a3")
public static String es_PE_FIELD_StatementLine_EFTCheckNo_Help="Información de medios TEF.";

@XendraTrl(Identifier="8a5f0a04-02c7-d8f8-815d-78cc3f3758a3")
public static String es_PE_FIELD_StatementLine_EFTCheckNo_Name="No. TEF Cheque";

@XendraField(AD_Column_ID="EftCheckNo",IsCentrallyMaintained=true,
AD_Tab_ID="44026b30-2ee9-a0ce-c4af-c07a51f7d15f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=260,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8a5f0a04-02c7-d8f8-815d-78cc3f3758a3")
public static final String FIELDNAME_StatementLine_EFTCheckNo="8a5f0a04-02c7-d8f8-815d-78cc3f3758a3";

@XendraTrl(Identifier="670bc3ce-5bb4-f486-e744-295b886a8999")
public static String es_PE_COLUMN_EftCheckNo_Name="No. TEF Cheque";

@XendraColumn(AD_Element_ID="3cfdfc52-c84b-cd37-69fe-402cc4bd53d8",ColumnName="EftCheckNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="670bc3ce-5bb4-f486-e744-295b886a8999",
Synchronized="2017-08-05 16:53:15.0")
/** Column name EftCheckNo */
public static final String COLUMNNAME_EftCheckNo = "EftCheckNo";
/** Set EFT Currency.
@param EftCurrency Electronic Funds Transfer Currency */
public void setEftCurrency (String EftCurrency)
{
if (EftCurrency != null && EftCurrency.length() > 20)
{
log.warning("Length > 20 - truncated");
EftCurrency = EftCurrency.substring(0,19);
}
set_Value (COLUMNNAME_EftCurrency, EftCurrency);
}
/** Get EFT Currency.
@return Electronic Funds Transfer Currency */
public String getEftCurrency() 
{
String value = (String)get_Value(COLUMNNAME_EftCurrency);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="298b51c1-9db0-8e3a-260e-524a4f40e8b6")
public static String es_PE_FIELD_StatementLine_EFTCurrency_Description="Moneda de Transferencia Electronica de Fondos";

@XendraTrl(Identifier="298b51c1-9db0-8e3a-260e-524a4f40e8b6")
public static String es_PE_FIELD_StatementLine_EFTCurrency_Help="Información de medios Transferencia Electronica de Fondos.";

@XendraTrl(Identifier="298b51c1-9db0-8e3a-260e-524a4f40e8b6")
public static String es_PE_FIELD_StatementLine_EFTCurrency_Name="Moneda de TEF";

@XendraField(AD_Column_ID="EftCurrency",IsCentrallyMaintained=true,
AD_Tab_ID="44026b30-2ee9-a0ce-c4af-c07a51f7d15f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=330,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="298b51c1-9db0-8e3a-260e-524a4f40e8b6")
public static final String FIELDNAME_StatementLine_EFTCurrency="298b51c1-9db0-8e3a-260e-524a4f40e8b6";

@XendraTrl(Identifier="e38bfdf8-1d75-e6ac-76f5-042933cd221d")
public static String es_PE_COLUMN_EftCurrency_Name="Moneda de TEF";

@XendraColumn(AD_Element_ID="d3541164-d7dd-c1bd-824a-6f309e0eb1de",ColumnName="EftCurrency",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e38bfdf8-1d75-e6ac-76f5-042933cd221d",
Synchronized="2017-08-05 16:53:15.0")
/** Column name EftCurrency */
public static final String COLUMNNAME_EftCurrency = "EftCurrency";
/** Set EFT Memo.
@param EftMemo Electronic Funds Transfer Memo */
public void setEftMemo (String EftMemo)
{
if (EftMemo != null && EftMemo.length() > 2000)
{
log.warning("Length > 2000 - truncated");
EftMemo = EftMemo.substring(0,1999);
}
set_Value (COLUMNNAME_EftMemo, EftMemo);
}
/** Get EFT Memo.
@return Electronic Funds Transfer Memo */
public String getEftMemo() 
{
String value = (String)get_Value(COLUMNNAME_EftMemo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="48bf9d9f-ec2b-c855-8377-fc358af0ba08")
public static String es_PE_FIELD_StatementLine_EFTMemo_Description="Memo de Transferencia Electronica de Fondos.";

@XendraTrl(Identifier="48bf9d9f-ec2b-c855-8377-fc358af0ba08")
public static String es_PE_FIELD_StatementLine_EFTMemo_Help="Información de medios de Transferencia Electronica de Fondos.";

@XendraTrl(Identifier="48bf9d9f-ec2b-c855-8377-fc358af0ba08")
public static String es_PE_FIELD_StatementLine_EFTMemo_Name="Memo TEF";

@XendraField(AD_Column_ID="EftMemo",IsCentrallyMaintained=true,
AD_Tab_ID="44026b30-2ee9-a0ce-c4af-c07a51f7d15f",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=280,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="48bf9d9f-ec2b-c855-8377-fc358af0ba08")
public static final String FIELDNAME_StatementLine_EFTMemo="48bf9d9f-ec2b-c855-8377-fc358af0ba08";

@XendraTrl(Identifier="b4e83f59-ee21-c27d-7609-0832027e2f44")
public static String es_PE_COLUMN_EftMemo_Name="Memo TEF";

@XendraColumn(AD_Element_ID="d22505b1-0145-20d2-e936-10713168180a",ColumnName="EftMemo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b4e83f59-ee21-c27d-7609-0832027e2f44",
Synchronized="2017-08-05 16:53:15.0")
/** Column name EftMemo */
public static final String COLUMNNAME_EftMemo = "EftMemo";
/** Set EFT Payee.
@param EftPayee Electronic Funds Transfer Payee information */
public void setEftPayee (String EftPayee)
{
if (EftPayee != null && EftPayee.length() > 255)
{
log.warning("Length > 255 - truncated");
EftPayee = EftPayee.substring(0,254);
}
set_Value (COLUMNNAME_EftPayee, EftPayee);
}
/** Get EFT Payee.
@return Electronic Funds Transfer Payee information */
public String getEftPayee() 
{
String value = (String)get_Value(COLUMNNAME_EftPayee);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="6fcedcb9-0273-1284-1bc1-44a11fcc9532")
public static String es_PE_FIELD_StatementLine_EFTPayee_Description="Información del beneficiario para Transferencia Elecronica de Fondos.";

@XendraTrl(Identifier="6fcedcb9-0273-1284-1bc1-44a11fcc9532")
public static String es_PE_FIELD_StatementLine_EFTPayee_Help="Información de pagos de Transferencia Electronica de Fondos.";

@XendraTrl(Identifier="6fcedcb9-0273-1284-1bc1-44a11fcc9532")
public static String es_PE_FIELD_StatementLine_EFTPayee_Name="TFE Beneficiario";

@XendraField(AD_Column_ID="EftPayee",IsCentrallyMaintained=true,
AD_Tab_ID="44026b30-2ee9-a0ce-c4af-c07a51f7d15f",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=290,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6fcedcb9-0273-1284-1bc1-44a11fcc9532")
public static final String FIELDNAME_StatementLine_EFTPayee="6fcedcb9-0273-1284-1bc1-44a11fcc9532";

@XendraTrl(Identifier="1bcdcff6-2b00-5ea6-0885-d859e2f3f300")
public static String es_PE_COLUMN_EftPayee_Name="TFE Beneficiario";

@XendraColumn(AD_Element_ID="6d8b943a-1a57-1392-d28f-13f72a90cf8a",ColumnName="EftPayee",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1bcdcff6-2b00-5ea6-0885-d859e2f3f300",
Synchronized="2017-08-05 16:53:15.0")
/** Column name EftPayee */
public static final String COLUMNNAME_EftPayee = "EftPayee";
/** Set EFT Payee Account.
@param EftPayeeAccount Electronic Funds Transfer Payyee Account Information */
public void setEftPayeeAccount (String EftPayeeAccount)
{
if (EftPayeeAccount != null && EftPayeeAccount.length() > 40)
{
log.warning("Length > 40 - truncated");
EftPayeeAccount = EftPayeeAccount.substring(0,39);
}
set_Value (COLUMNNAME_EftPayeeAccount, EftPayeeAccount);
}
/** Get EFT Payee Account.
@return Electronic Funds Transfer Payyee Account Information */
public String getEftPayeeAccount() 
{
String value = (String)get_Value(COLUMNNAME_EftPayeeAccount);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="411fb79e-949b-9966-cc7a-3dcfb50e6d80")
public static String es_PE_FIELD_StatementLine_EFTPayeeAccount_Description="Información de la cuenta del beneficiario de la transferencia de fondos electrónica";

@XendraTrl(Identifier="411fb79e-949b-9966-cc7a-3dcfb50e6d80")
public static String es_PE_FIELD_StatementLine_EFTPayeeAccount_Help="Información de medios de TEF ";

@XendraTrl(Identifier="411fb79e-949b-9966-cc7a-3dcfb50e6d80")
public static String es_PE_FIELD_StatementLine_EFTPayeeAccount_Name="Cuenta del Beneficiario de TEF";

@XendraField(AD_Column_ID="EftPayeeAccount",IsCentrallyMaintained=true,
AD_Tab_ID="44026b30-2ee9-a0ce-c4af-c07a51f7d15f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=300,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="411fb79e-949b-9966-cc7a-3dcfb50e6d80")
public static final String FIELDNAME_StatementLine_EFTPayeeAccount="411fb79e-949b-9966-cc7a-3dcfb50e6d80";

@XendraTrl(Identifier="544a5b84-9c32-ddab-295e-28731badb7b5")
public static String es_PE_COLUMN_EftPayeeAccount_Name="Cuenta del Beneficiario de TEF";

@XendraColumn(AD_Element_ID="647fbd1c-d14c-2cd6-6303-6f881d810185",ColumnName="EftPayeeAccount",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="544a5b84-9c32-ddab-295e-28731badb7b5",
Synchronized="2017-08-05 16:53:15.0")
/** Column name EftPayeeAccount */
public static final String COLUMNNAME_EftPayeeAccount = "EftPayeeAccount";
/** Set EFT Reference.
@param EftReference Electronic Funds Transfer Reference */
public void setEftReference (String EftReference)
{
if (EftReference != null && EftReference.length() > 60)
{
log.warning("Length > 60 - truncated");
EftReference = EftReference.substring(0,59);
}
set_Value (COLUMNNAME_EftReference, EftReference);
}
/** Get EFT Reference.
@return Electronic Funds Transfer Reference */
public String getEftReference() 
{
String value = (String)get_Value(COLUMNNAME_EftReference);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a4434997-d93f-82bb-30da-266dae0119aa")
public static String es_PE_FIELD_StatementLine_EFTReference_Description="Referencia de Transferencia Electronica de Fondos";

@XendraTrl(Identifier="a4434997-d93f-82bb-30da-266dae0119aa")
public static String es_PE_FIELD_StatementLine_EFTReference_Help="Información de medios TEF";

@XendraTrl(Identifier="a4434997-d93f-82bb-30da-266dae0119aa")
public static String es_PE_FIELD_StatementLine_EFTReference_Name="Referencia TEF";

@XendraField(AD_Column_ID="EftReference",IsCentrallyMaintained=true,
AD_Tab_ID="44026b30-2ee9-a0ce-c4af-c07a51f7d15f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=270,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a4434997-d93f-82bb-30da-266dae0119aa")
public static final String FIELDNAME_StatementLine_EFTReference="a4434997-d93f-82bb-30da-266dae0119aa";

@XendraTrl(Identifier="1f279ffc-75be-b7e2-7af4-f6a23bf8f78a")
public static String es_PE_COLUMN_EftReference_Name="Referencia TEF";

@XendraColumn(AD_Element_ID="950c0764-1512-b934-0bf5-2204e09dde51",ColumnName="EftReference",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1f279ffc-75be-b7e2-7af4-f6a23bf8f78a",
Synchronized="2017-08-05 16:53:15.0")
/** Column name EftReference */
public static final String COLUMNNAME_EftReference = "EftReference";
/** Set EFT Statement Line Date.
@param EftStatementLineDate Electronic Funds Transfer Statement Line Date */
public void setEftStatementLineDate (Timestamp EftStatementLineDate)
{
set_Value (COLUMNNAME_EftStatementLineDate, EftStatementLineDate);
}
/** Get EFT Statement Line Date.
@return Electronic Funds Transfer Statement Line Date */
public Timestamp getEftStatementLineDate() 
{
return (Timestamp)get_Value(COLUMNNAME_EftStatementLineDate);
}

@XendraTrl(Identifier="f3d9de55-a082-bbf5-ebd0-f2fd10827ed5")
public static String es_PE_FIELD_StatementLine_EFTStatementLineDate_Description="Fecha del Item de Transferencia Electronica de Fondos.";

@XendraTrl(Identifier="f3d9de55-a082-bbf5-ebd0-f2fd10827ed5")
public static String es_PE_FIELD_StatementLine_EFTStatementLineDate_Help="Información media de Transferencia Electronica de Fondos.";

@XendraTrl(Identifier="f3d9de55-a082-bbf5-ebd0-f2fd10827ed5")
public static String es_PE_FIELD_StatementLine_EFTStatementLineDate_Name="Item Estado de la TEF a la Fecha";

@XendraField(AD_Column_ID="EftStatementLineDate",IsCentrallyMaintained=true,
AD_Tab_ID="44026b30-2ee9-a0ce-c4af-c07a51f7d15f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=310,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f3d9de55-a082-bbf5-ebd0-f2fd10827ed5")
public static final String FIELDNAME_StatementLine_EFTStatementLineDate="f3d9de55-a082-bbf5-ebd0-f2fd10827ed5";

@XendraTrl(Identifier="daffe83d-54f0-0ae0-d884-bb64364ba0d1")
public static String es_PE_COLUMN_EftStatementLineDate_Name="Línea Estado de la TEF a la Fecha";

@XendraColumn(AD_Element_ID="691f726e-ad2e-8c81-6a74-6f9f3342a5c4",
ColumnName="EftStatementLineDate",AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=7,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="daffe83d-54f0-0ae0-d884-bb64364ba0d1",Synchronized="2017-08-05 16:53:15.0")
/** Column name EftStatementLineDate */
public static final String COLUMNNAME_EftStatementLineDate = "EftStatementLineDate";
/** Set EFT Trx ID.
@param EftTrxID Electronic Funds Transfer Transaction ID */
public void setEftTrxID (String EftTrxID)
{
if (EftTrxID != null && EftTrxID.length() > 40)
{
log.warning("Length > 40 - truncated");
EftTrxID = EftTrxID.substring(0,39);
}
set_Value (COLUMNNAME_EftTrxID, EftTrxID);
}
/** Get EFT Trx ID.
@return Electronic Funds Transfer Transaction ID */
public String getEftTrxID() 
{
String value = (String)get_Value(COLUMNNAME_EftTrxID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="9cbae906-909c-b952-4a0d-16f212ad4211")
public static String es_PE_FIELD_StatementLine_EFTTrxID_Description="ID transacción de Transferencia Electronica de fondos";

@XendraTrl(Identifier="9cbae906-909c-b952-4a0d-16f212ad4211")
public static String es_PE_FIELD_StatementLine_EFTTrxID_Help="Información de los medios de Transferencia Electronica de Fondos.";

@XendraTrl(Identifier="9cbae906-909c-b952-4a0d-16f212ad4211")
public static String es_PE_FIELD_StatementLine_EFTTrxID_Name="ID Trans TEF";

@XendraField(AD_Column_ID="EftTrxID",IsCentrallyMaintained=true,
AD_Tab_ID="44026b30-2ee9-a0ce-c4af-c07a51f7d15f",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9cbae906-909c-b952-4a0d-16f212ad4211")
public static final String FIELDNAME_StatementLine_EFTTrxID="9cbae906-909c-b952-4a0d-16f212ad4211";

@XendraTrl(Identifier="5dcf1441-757f-d970-709c-af36188850cb")
public static String es_PE_COLUMN_EftTrxID_Name="ID Trans TEF";

@XendraColumn(AD_Element_ID="1a6f03a1-bcbc-d16b-11bf-f6b661a8bbe4",ColumnName="EftTrxID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5dcf1441-757f-d970-709c-af36188850cb",
Synchronized="2017-08-05 16:53:15.0")
/** Column name EftTrxID */
public static final String COLUMNNAME_EftTrxID = "EftTrxID";
/** Set EFT Trx Type.
@param EftTrxType Electronic Funds Transfer Transaction Type */
public void setEftTrxType (String EftTrxType)
{
if (EftTrxType != null && EftTrxType.length() > 20)
{
log.warning("Length > 20 - truncated");
EftTrxType = EftTrxType.substring(0,19);
}
set_Value (COLUMNNAME_EftTrxType, EftTrxType);
}
/** Get EFT Trx Type.
@return Electronic Funds Transfer Transaction Type */
public String getEftTrxType() 
{
String value = (String)get_Value(COLUMNNAME_EftTrxType);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c0046711-8ec9-39ba-6cda-e95827dea925")
public static String es_PE_FIELD_StatementLine_EFTTrxType_Description="Tipo de Transferencia Electronica de Fondos";

@XendraTrl(Identifier="c0046711-8ec9-39ba-6cda-e95827dea925")
public static String es_PE_FIELD_StatementLine_EFTTrxType_Help="Información de medios de TEF";

@XendraTrl(Identifier="c0046711-8ec9-39ba-6cda-e95827dea925")
public static String es_PE_FIELD_StatementLine_EFTTrxType_Name="Tipo Trans TEF";

@XendraField(AD_Column_ID="EftTrxType",IsCentrallyMaintained=true,
AD_Tab_ID="44026b30-2ee9-a0ce-c4af-c07a51f7d15f",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=250,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c0046711-8ec9-39ba-6cda-e95827dea925")
public static final String FIELDNAME_StatementLine_EFTTrxType="c0046711-8ec9-39ba-6cda-e95827dea925";

@XendraTrl(Identifier="772af597-6330-c876-0122-2f2e12ecabc4")
public static String es_PE_COLUMN_EftTrxType_Name="Tipo Trans TEF";

@XendraColumn(AD_Element_ID="8c688b24-7173-822c-c328-4456a5b73d69",ColumnName="EftTrxType",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="772af597-6330-c876-0122-2f2e12ecabc4",
Synchronized="2017-08-05 16:53:15.0")
/** Column name EftTrxType */
public static final String COLUMNNAME_EftTrxType = "EftTrxType";
/** Set EFT Effective Date.
@param EftValutaDate Electronic Funds Transfer Valuta (effective) Date */
public void setEftValutaDate (Timestamp EftValutaDate)
{
set_Value (COLUMNNAME_EftValutaDate, EftValutaDate);
}
/** Get EFT Effective Date.
@return Electronic Funds Transfer Valuta (effective) Date */
public Timestamp getEftValutaDate() 
{
return (Timestamp)get_Value(COLUMNNAME_EftValutaDate);
}

@XendraTrl(Identifier="6020d46c-6b28-dda0-c3de-75707b6be797")
public static String es_PE_FIELD_StatementLine_EFTEffectiveDate_Description="Fecha efectiva para la Transferencia Electronica de Fondos.";

@XendraTrl(Identifier="6020d46c-6b28-dda0-c3de-75707b6be797")
public static String es_PE_FIELD_StatementLine_EFTEffectiveDate_Help="Información de Transferencia Electronica de Fondos";

@XendraTrl(Identifier="6020d46c-6b28-dda0-c3de-75707b6be797")
public static String es_PE_FIELD_StatementLine_EFTEffectiveDate_Name="Fecha Efectiva para TEF";

@XendraField(AD_Column_ID="EftValutaDate",IsCentrallyMaintained=true,
AD_Tab_ID="44026b30-2ee9-a0ce-c4af-c07a51f7d15f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=320,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6020d46c-6b28-dda0-c3de-75707b6be797")
public static final String FIELDNAME_StatementLine_EFTEffectiveDate="6020d46c-6b28-dda0-c3de-75707b6be797";

@XendraTrl(Identifier="9b496b13-a770-f008-f050-b3f92eec5b75")
public static String es_PE_COLUMN_EftValutaDate_Name="Fecha Efectiva para TEF";

@XendraColumn(AD_Element_ID="56edc870-99c1-8bba-0e8d-14bf8824aafb",ColumnName="EftValutaDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9b496b13-a770-f008-f050-b3f92eec5b75",
Synchronized="2017-08-05 16:53:15.0")
/** Column name EftValutaDate */
public static final String COLUMNNAME_EftValutaDate = "EftValutaDate";
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
@XendraTrl(Identifier="5bf3fdc8-6a74-40b5-a7c6-6579ceb4e642")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5bf3fdc8-6a74-40b5-a7c6-6579ceb4e642",
Synchronized="2017-08-05 16:53:15.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Interest Amount.
@param InterestAmt Interest Amount */
public void setInterestAmt (BigDecimal InterestAmt)
{
if (InterestAmt == null) throw new IllegalArgumentException ("InterestAmt is mandatory.");
set_Value (COLUMNNAME_InterestAmt, InterestAmt);
}
/** Get Interest Amount.
@return Interest Amount */
public BigDecimal getInterestAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_InterestAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="7f235993-017d-dd2c-9f06-d20a5c1e49fb")
public static String es_PE_FIELD_StatementLine_InterestAmount_Description="Total del interés";

@XendraTrl(Identifier="7f235993-017d-dd2c-9f06-d20a5c1e49fb")
public static String es_PE_FIELD_StatementLine_InterestAmount_Help="El Total del Interés indica cualquier interés cargado ó recibido en un estado de cuenta bancario";

@XendraTrl(Identifier="7f235993-017d-dd2c-9f06-d20a5c1e49fb")
public static String es_PE_FIELD_StatementLine_InterestAmount_Name="Total del Interés";

@XendraField(AD_Column_ID="InterestAmt",IsCentrallyMaintained=true,
AD_Tab_ID="44026b30-2ee9-a0ce-c4af-c07a51f7d15f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7f235993-017d-dd2c-9f06-d20a5c1e49fb")
public static final String FIELDNAME_StatementLine_InterestAmount="7f235993-017d-dd2c-9f06-d20a5c1e49fb";

@XendraTrl(Identifier="bb34e06d-2590-4a1a-f007-14fcf210f9da")
public static String es_PE_COLUMN_InterestAmt_Name="Total del Interés";

@XendraColumn(AD_Element_ID="94999794-0276-6683-3826-7546d7f35a50",ColumnName="InterestAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutBankStatement.amount",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bb34e06d-2590-4a1a-f007-14fcf210f9da",
Synchronized="2017-08-05 16:53:15.0")
/** Column name InterestAmt */
public static final String COLUMNNAME_InterestAmt = "InterestAmt";
/** Set Manual.
@param IsManual This is a manual process */
public void setIsManual (boolean IsManual)
{
set_Value (COLUMNNAME_IsManual, Boolean.valueOf(IsManual));
}
/** Get Manual.
@return This is a manual process */
public boolean isManual() 
{
Object oo = get_Value(COLUMNNAME_IsManual);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="a2d2b967-d222-170e-c665-1eef0cb4a58f")
public static String es_PE_FIELD_StatementLine_Manual_Description="Éste es un proceso manual.";

@XendraTrl(Identifier="a2d2b967-d222-170e-c665-1eef0cb4a58f")
public static String es_PE_FIELD_StatementLine_Manual_Help="El cuadro de verificación manual indica si el proceso será hecho manualmente.";

@XendraTrl(Identifier="a2d2b967-d222-170e-c665-1eef0cb4a58f")
public static String es_PE_FIELD_StatementLine_Manual_Name="Manual";

@XendraField(AD_Column_ID="IsManual",IsCentrallyMaintained=true,
AD_Tab_ID="44026b30-2ee9-a0ce-c4af-c07a51f7d15f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a2d2b967-d222-170e-c665-1eef0cb4a58f")
public static final String FIELDNAME_StatementLine_Manual="a2d2b967-d222-170e-c665-1eef0cb4a58f";

@XendraTrl(Identifier="e9a196f8-0a41-d562-709d-6890bb1c3cde")
public static String es_PE_COLUMN_IsManual_Name="Manual";

@XendraColumn(AD_Element_ID="064afee2-bc1c-12d9-20dc-97a2318dc359",ColumnName="IsManual",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e9a196f8-0a41-d562-709d-6890bb1c3cde",
Synchronized="2017-08-05 16:53:15.0")
/** Column name IsManual */
public static final String COLUMNNAME_IsManual = "IsManual";
/** Set Reversal.
@param IsReversal This is a reversing transaction */
public void setIsReversal (boolean IsReversal)
{
set_Value (COLUMNNAME_IsReversal, Boolean.valueOf(IsReversal));
}
/** Get Reversal.
@return This is a reversing transaction */
public boolean isReversal() 
{
Object oo = get_Value(COLUMNNAME_IsReversal);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="89a9069e-e196-184c-e774-5e634d282f58")
public static String es_PE_FIELD_StatementLine_Reversal_Description="Ésta es una transacción inversa";

@XendraTrl(Identifier="89a9069e-e196-184c-e774-5e634d282f58")
public static String es_PE_FIELD_StatementLine_Reversal_Help="El cuadro de verificación Inverso indica si esta es una transacción inversa de una transacción anterior.";

@XendraTrl(Identifier="89a9069e-e196-184c-e774-5e634d282f58")
public static String es_PE_FIELD_StatementLine_Reversal_Name="Inverso";

@XendraField(AD_Column_ID="IsReversal",IsCentrallyMaintained=true,
AD_Tab_ID="44026b30-2ee9-a0ce-c4af-c07a51f7d15f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="89a9069e-e196-184c-e774-5e634d282f58")
public static final String FIELDNAME_StatementLine_Reversal="89a9069e-e196-184c-e774-5e634d282f58";

@XendraTrl(Identifier="b8936ecd-8a1f-5677-2c5a-86ebf7909c93")
public static String es_PE_COLUMN_IsReversal_Name="Inverso";

@XendraColumn(AD_Element_ID="eecc12dc-531a-0341-6fe7-26ddd75bb608",ColumnName="IsReversal",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b8936ecd-8a1f-5677-2c5a-86ebf7909c93",
Synchronized="2017-08-05 16:53:15.0")
/** Column name IsReversal */
public static final String COLUMNNAME_IsReversal = "IsReversal";
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getLine()));
}

@XendraTrl(Identifier="97d1f3ef-2f6b-3cd0-9ac0-0730022f28fb")
public static String es_PE_FIELD_StatementLine_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="97d1f3ef-2f6b-3cd0-9ac0-0730022f28fb")
public static String es_PE_FIELD_StatementLine_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraTrl(Identifier="97d1f3ef-2f6b-3cd0-9ac0-0730022f28fb")
public static String es_PE_FIELD_StatementLine_LineNo_Name="No. Línea";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="44026b30-2ee9-a0ce-c4af-c07a51f7d15f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="97d1f3ef-2f6b-3cd0-9ac0-0730022f28fb")
public static final String FIELDNAME_StatementLine_LineNo="97d1f3ef-2f6b-3cd0-9ac0-0730022f28fb";

@XendraTrl(Identifier="71d6ca10-302e-c79b-6e5e-fed0cbd39d21")
public static String es_PE_COLUMN_Line_Name="No. Línea";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT COALESCE(MAX(Line),0)+10 FROM C_BankStatementLine WHERE C_BankStatement_ID=@C_BankStatement_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="71d6ca10-302e-c79b-6e5e-fed0cbd39d21",
Synchronized="2017-08-05 16:53:15.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";
/** Set Match Statement.
@param MatchStatement Match Statement */
public void setMatchStatement (String MatchStatement)
{
if (MatchStatement != null && MatchStatement.length() > 1)
{
log.warning("Length > 1 - truncated");
MatchStatement = MatchStatement.substring(0,0);
}
set_Value (COLUMNNAME_MatchStatement, MatchStatement);
}
/** Get Match Statement.
@return Match Statement */
public String getMatchStatement() 
{
return (String)get_Value(COLUMNNAME_MatchStatement);
}

@XendraTrl(Identifier="3b97d1a9-db8f-a85f-46c5-66aea2edff08")
public static String es_PE_FIELD_StatementLine_MatchStatement_Description="Estado de la cuenta del banco, información a los socios de negocio, a las facturas y a los pagos.";

@XendraTrl(Identifier="3b97d1a9-db8f-a85f-46c5-66aea2edff08")
public static String es_PE_FIELD_StatementLine_MatchStatement_Name="Conciliación de Estado de Cuenta Bancario";

@XendraField(AD_Column_ID="MatchStatement",IsCentrallyMaintained=true,
AD_Tab_ID="44026b30-2ee9-a0ce-c4af-c07a51f7d15f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3b97d1a9-db8f-a85f-46c5-66aea2edff08")
public static final String FIELDNAME_StatementLine_MatchStatement="3b97d1a9-db8f-a85f-46c5-66aea2edff08";

@XendraTrl(Identifier="1d158286-419f-e4c5-7ec7-1999900f0c79")
public static String es_PE_COLUMN_MatchStatement_Name="Conciliación";

@XendraColumn(AD_Element_ID="458ade5b-b2f5-9520-6391-55dfab59c30a",ColumnName="MatchStatement",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@C_Payment_ID@!0",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,
AD_Process_ID="b09397f4-1e05-ab78-94ea-b67a4c43a1f2",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1d158286-419f-e4c5-7ec7-1999900f0c79",
Synchronized="2017-08-05 16:53:16.0")
/** Column name MatchStatement */
public static final String COLUMNNAME_MatchStatement = "MatchStatement";
/** Set Memo.
@param Memo Memo Text */
public void setMemo (String Memo)
{
if (Memo != null && Memo.length() > 255)
{
log.warning("Length > 255 - truncated");
Memo = Memo.substring(0,254);
}
set_Value (COLUMNNAME_Memo, Memo);
}
/** Get Memo.
@return Memo Text */
public String getMemo() 
{
String value = (String)get_Value(COLUMNNAME_Memo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="67d07d5b-4322-b582-cb93-3bab296ff9f0")
public static String es_PE_FIELD_StatementLine_Memo_Description="Memo de texto";

@XendraTrl(Identifier="67d07d5b-4322-b582-cb93-3bab296ff9f0")
public static String es_PE_FIELD_StatementLine_Memo_Name="Memo";
@XendraField(AD_Column_ID="Memo",
IsCentrallyMaintained=true,AD_Tab_ID="44026b30-2ee9-a0ce-c4af-c07a51f7d15f",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=190,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="67d07d5b-4322-b582-cb93-3bab296ff9f0")
public static final String FIELDNAME_StatementLine_Memo="67d07d5b-4322-b582-cb93-3bab296ff9f0";

@XendraTrl(Identifier="4721d221-f536-4a0f-9923-1dc83070c90f")
public static String es_PE_COLUMN_Memo_Name="Memo";

@XendraColumn(AD_Element_ID="2c278815-3821-9fa0-1746-7d846f4e7396",ColumnName="Memo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4721d221-f536-4a0f-9923-1dc83070c90f",
Synchronized="2017-08-05 16:53:16.0")
/** Column name Memo */
public static final String COLUMNNAME_Memo = "Memo";
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

@XendraTrl(Identifier="aa5b0485-53f1-aabb-09cd-d42e850fa24f")
public static String es_PE_FIELD_StatementLine_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="aa5b0485-53f1-aabb-09cd-d42e850fa24f")
public static String es_PE_FIELD_StatementLine_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="aa5b0485-53f1-aabb-09cd-d42e850fa24f")
public static String es_PE_FIELD_StatementLine_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="44026b30-2ee9-a0ce-c4af-c07a51f7d15f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aa5b0485-53f1-aabb-09cd-d42e850fa24f")
public static final String FIELDNAME_StatementLine_Processed="aa5b0485-53f1-aabb-09cd-d42e850fa24f";

@XendraTrl(Identifier="b765470e-9dba-0931-f173-bf9f837c0ff1")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b765470e-9dba-0931-f173-bf9f837c0ff1",
Synchronized="2017-08-05 16:53:16.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set Reference No.
@param ReferenceNo Your customer or vendor number at the Business Partner's site */
public void setReferenceNo (String ReferenceNo)
{
if (ReferenceNo != null && ReferenceNo.length() > 40)
{
log.warning("Length > 40 - truncated");
ReferenceNo = ReferenceNo.substring(0,39);
}
set_Value (COLUMNNAME_ReferenceNo, ReferenceNo);
}
/** Get Reference No.
@return Your customer or vendor number at the Business Partner's site */
public String getReferenceNo() 
{
String value = (String)get_Value(COLUMNNAME_ReferenceNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="fb94e051-1c63-2c08-d15c-e6c7470235a6")
public static String es_PE_FIELD_StatementLine_ReferenceNo_Description="Su número de cliente ó proveedor con el socio de negocio.";

@XendraTrl(Identifier="fb94e051-1c63-2c08-d15c-e6c7470235a6")
public static String es_PE_FIELD_StatementLine_ReferenceNo_Help="El número de referencia puede ser impreso en órdenes y facturas para permitirle a su socio de negocio identificar más rápido sus registros.";

@XendraTrl(Identifier="fb94e051-1c63-2c08-d15c-e6c7470235a6")
public static String es_PE_FIELD_StatementLine_ReferenceNo_Name="No. de Referencia";

@XendraField(AD_Column_ID="ReferenceNo",IsCentrallyMaintained=true,
AD_Tab_ID="44026b30-2ee9-a0ce-c4af-c07a51f7d15f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fb94e051-1c63-2c08-d15c-e6c7470235a6")
public static final String FIELDNAME_StatementLine_ReferenceNo="fb94e051-1c63-2c08-d15c-e6c7470235a6";

@XendraTrl(Identifier="2626cd1f-8074-0e85-f3d2-7a7dad4c5d01")
public static String es_PE_COLUMN_ReferenceNo_Name="No. de Referencia";

@XendraColumn(AD_Element_ID="87d37906-4977-97f1-29f1-85a654abe404",ColumnName="ReferenceNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2626cd1f-8074-0e85-f3d2-7a7dad4c5d01",
Synchronized="2017-08-05 16:53:16.0")
/** Column name ReferenceNo */
public static final String COLUMNNAME_ReferenceNo = "ReferenceNo";
/** Set Statement Line Date.
@param StatementLineDate Date of the Statement Line */
public void setStatementLineDate (Timestamp StatementLineDate)
{
if (StatementLineDate == null) throw new IllegalArgumentException ("StatementLineDate is mandatory.");
set_Value (COLUMNNAME_StatementLineDate, StatementLineDate);
}
/** Get Statement Line Date.
@return Date of the Statement Line */
public Timestamp getStatementLineDate() 
{
return (Timestamp)get_Value(COLUMNNAME_StatementLineDate);
}

@XendraTrl(Identifier="5fcac9f7-3ef3-cc12-37eb-3118d2be0709")
public static String es_PE_FIELD_StatementLine_StatementLineDate_Description="Fecha de el estado de línea";

@XendraTrl(Identifier="5fcac9f7-3ef3-cc12-37eb-3118d2be0709")
public static String es_PE_FIELD_StatementLine_StatementLineDate_Name="Fecha de Estado de Línea";

@XendraField(AD_Column_ID="StatementLineDate",IsCentrallyMaintained=true,
AD_Tab_ID="44026b30-2ee9-a0ce-c4af-c07a51f7d15f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5fcac9f7-3ef3-cc12-37eb-3118d2be0709")
public static final String FIELDNAME_StatementLine_StatementLineDate="5fcac9f7-3ef3-cc12-37eb-3118d2be0709";

@XendraTrl(Identifier="489deaf3-c29b-d4c9-53ec-77a64235e35d")
public static String es_PE_COLUMN_StatementLineDate_Name="Fecha de Estado de Línea";

@XendraColumn(AD_Element_ID="9cc0a961-4b24-c1bf-e2a7-074698bb9445",ColumnName="StatementLineDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,
DefaultValue="@StatementLineDate@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutEngine.dateAcct",VFormat="",ValueMin="",ValueMax="",Version="1",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="489deaf3-c29b-d4c9-53ec-77a64235e35d",
Synchronized="2017-08-05 16:53:16.0")
/** Column name StatementLineDate */
public static final String COLUMNNAME_StatementLineDate = "StatementLineDate";
/** Set Statement amount.
@param StmtAmt Statement Amount */
public void setStmtAmt (BigDecimal StmtAmt)
{
if (StmtAmt == null) throw new IllegalArgumentException ("StmtAmt is mandatory.");
set_Value (COLUMNNAME_StmtAmt, StmtAmt);
}
/** Get Statement amount.
@return Statement Amount */
public BigDecimal getStmtAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_StmtAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="6f29f7e5-a3a2-78f2-065e-1df46d8c0acc")
public static String es_PE_FIELD_StatementLine_StatementAmount_Description="Total del Estado de Cuenta";

@XendraTrl(Identifier="6f29f7e5-a3a2-78f2-065e-1df46d8c0acc")
public static String es_PE_FIELD_StatementLine_StatementAmount_Help="El Total del estado de cuenta indica el total de una línea simple del estado de cuenta";

@XendraTrl(Identifier="6f29f7e5-a3a2-78f2-065e-1df46d8c0acc")
public static String es_PE_FIELD_StatementLine_StatementAmount_Name="Total del Estado de Cuenta";

@XendraField(AD_Column_ID="StmtAmt",IsCentrallyMaintained=true,
AD_Tab_ID="44026b30-2ee9-a0ce-c4af-c07a51f7d15f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6f29f7e5-a3a2-78f2-065e-1df46d8c0acc")
public static final String FIELDNAME_StatementLine_StatementAmount="6f29f7e5-a3a2-78f2-065e-1df46d8c0acc";

@XendraTrl(Identifier="0dcd2bc3-4a30-49f2-3d6f-d59dc5e8d9d5")
public static String es_PE_COLUMN_StmtAmt_Name="Total del Estado de Cuenta";

@XendraColumn(AD_Element_ID="ddbb5bef-b53b-8b96-f1bc-014ae727d005",ColumnName="StmtAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,
Callout="org.compiere.model.CalloutBankStatement.amount",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0dcd2bc3-4a30-49f2-3d6f-d59dc5e8d9d5",
Synchronized="2017-08-05 16:53:16.0")
/** Column name StmtAmt */
public static final String COLUMNNAME_StmtAmt = "StmtAmt";
/** Set Transaction Amount.
@param TrxAmt Amount of a transaction */
public void setTrxAmt (BigDecimal TrxAmt)
{
if (TrxAmt == null) throw new IllegalArgumentException ("TrxAmt is mandatory.");
set_Value (COLUMNNAME_TrxAmt, TrxAmt);
}
/** Get Transaction Amount.
@return Amount of a transaction */
public BigDecimal getTrxAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TrxAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="1ef1a150-74a1-2203-aa29-ad110f07e417")
public static String es_PE_FIELD_StatementLine_TransactionAmount_Description="Total de una transacción";

@XendraTrl(Identifier="1ef1a150-74a1-2203-aa29-ad110f07e417")
public static String es_PE_FIELD_StatementLine_TransactionAmount_Help="El Total de la transacción indica el total para una transacción simple";

@XendraTrl(Identifier="1ef1a150-74a1-2203-aa29-ad110f07e417")
public static String es_PE_FIELD_StatementLine_TransactionAmount_Name="Total de la Transacción";

@XendraField(AD_Column_ID="TrxAmt",IsCentrallyMaintained=true,
AD_Tab_ID="44026b30-2ee9-a0ce-c4af-c07a51f7d15f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1ef1a150-74a1-2203-aa29-ad110f07e417")
public static final String FIELDNAME_StatementLine_TransactionAmount="1ef1a150-74a1-2203-aa29-ad110f07e417";

@XendraTrl(Identifier="44a29ca9-de0e-27eb-9952-4bfa20b134c1")
public static String es_PE_COLUMN_TrxAmt_Name="Total de la Transacción";

@XendraColumn(AD_Element_ID="b6dd2b3a-bec1-6ad8-c860-9c03c52b5a44",ColumnName="TrxAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="44a29ca9-de0e-27eb-9952-4bfa20b134c1",
Synchronized="2017-08-05 16:53:16.0")
/** Column name TrxAmt */
public static final String COLUMNNAME_TrxAmt = "TrxAmt";
/** Set Effective date.
@param ValutaDate Date when money is available */
public void setValutaDate (Timestamp ValutaDate)
{
if (ValutaDate == null) throw new IllegalArgumentException ("ValutaDate is mandatory.");
set_Value (COLUMNNAME_ValutaDate, ValutaDate);
}
/** Get Effective date.
@return Date when money is available */
public Timestamp getValutaDate() 
{
return (Timestamp)get_Value(COLUMNNAME_ValutaDate);
}

@XendraTrl(Identifier="2fd00745-b7c3-2206-b0a5-ecadaf11dc51")
public static String es_PE_FIELD_StatementLine_EffectiveDate_Description="Fecha cuando el dinero está disponible";

@XendraTrl(Identifier="2fd00745-b7c3-2206-b0a5-ecadaf11dc51")
public static String es_PE_FIELD_StatementLine_EffectiveDate_Help="La fecha efectiva indica la fecha en que el dinero esté disponible en el banco";

@XendraTrl(Identifier="2fd00745-b7c3-2206-b0a5-ecadaf11dc51")
public static String es_PE_FIELD_StatementLine_EffectiveDate_Name="Fecha Efectiva";

@XendraField(AD_Column_ID="ValutaDate",IsCentrallyMaintained=true,
AD_Tab_ID="44026b30-2ee9-a0ce-c4af-c07a51f7d15f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2fd00745-b7c3-2206-b0a5-ecadaf11dc51")
public static final String FIELDNAME_StatementLine_EffectiveDate="2fd00745-b7c3-2206-b0a5-ecadaf11dc51";

@XendraTrl(Identifier="13e34cda-d687-6577-bb0d-2b1b82ddb90f")
public static String es_PE_COLUMN_ValutaDate_Name="Fecha Efectiva";

@XendraColumn(AD_Element_ID="e4600c7f-a40d-9373-8986-c69cdf7049c9",ColumnName="ValutaDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,
DefaultValue="@StatementDate@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="13e34cda-d687-6577-bb0d-2b1b82ddb90f",Synchronized="2017-08-05 16:53:16.0")
/** Column name ValutaDate */
public static final String COLUMNNAME_ValutaDate = "ValutaDate";
}
