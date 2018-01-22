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
import org.compiere.model.reference.REF_C_CashTrxType;
import org.compiere.model.reference.REF_WriteOffType;
/** Generated Model for C_CashLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_CashLine extends PO
{
/** Standard Constructor
@param ctx context
@param C_CashLine_ID id
@param trxName transaction
*/
public X_C_CashLine (Properties ctx, int C_CashLine_ID, String trxName)
{
super (ctx, C_CashLine_ID, trxName);
/** if (C_CashLine_ID == 0)
{
setAmount (Env.ZERO);	
// 0
setCashType (null);	
// I
setC_BPartner_ID (0);	
// @C_BPartner_ID@
setC_Cash_ID (0);
setC_CashLine_ID (0);
setIsCollection (false);	
// N
setIsPartialPayment (false);	
// N
setLine (0);	
// @SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM C_CashLine WHERE C_Cash_ID=@C_Cash_ID@
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
public X_C_CashLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=410 */
public static int Table_ID=MTable.getTable_ID("C_CashLine");

@XendraTrl(Identifier="3907dcf0-529f-7e00-12cd-062a3a040dd6")
public static String es_PE_TAB_CashLine_Description="Ìtem de Efectivo";

@XendraTrl(Identifier="3907dcf0-529f-7e00-12cd-062a3a040dd6")
public static String es_PE_TAB_CashLine_Name="Ìtem de Efectivo";

@XendraTrl(Identifier="3907dcf0-529f-7e00-12cd-062a3a040dd6")
public static String es_PE_TAB_CashLine_Help="La pestaña Ìtem de Efectivo define las líneas individuales para esta entrada de diario.";

@XendraTab(Name="Cash Line",Description="Cash Line",
Help="The Cash Line Tab defines the individual lines for this journal.",
AD_Window_ID="8d49c49d-eac3-71bc-171f-8a06ff4f4ab2",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="3907dcf0-529f-7e00-12cd-062a3a040dd6",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_CashLine="3907dcf0-529f-7e00-12cd-062a3a040dd6";

@XendraTrl(Identifier="a9d67065-3bdb-46fc-456b-f5aa34a8e20c")
public static String es_PE_TABLE_C_CashLine_Name="Línea del Diario de Efectivo";

@XendraTable(Name="Cash Journal Line",Description="Cash Journal Line",Help="",
TableName="C_CashLine",AccessLevel="3",AD_Window_ID="8d49c49d-eac3-71bc-171f-8a06ff4f4ab2",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=135,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="a9d67065-3bdb-46fc-456b-f5aa34a8e20c",Synchronized="2017-08-16 11:41:37.0")
/** TableName=C_CashLine */
public static final String Table_Name="C_CashLine";


@XendraIndex(Name="c_cashline_cash",Identifier="9b04d589-6596-c4da-aa5b-cf9cee48e327",
Column_Names="c_cash_id",IsUnique="false",TableIdentifier="9b04d589-6596-c4da-aa5b-cf9cee48e327",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_cashline_cash = "9b04d589-6596-c4da-aa5b-cf9cee48e327";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_CashLine");

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
    Table_ID = MTable.getTable_ID("C_CashLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_CashLine[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Amount.
@param Amount Amount in a defined currency */
public void setAmount (BigDecimal Amount)
{
if (Amount == null) throw new IllegalArgumentException ("Amount is mandatory.");
set_Value (COLUMNNAME_Amount, Amount);
}
/** Get Amount.
@return Amount in a defined currency */
public BigDecimal getAmount() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amount);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="c912c951-048c-f286-cc3f-0288c87038b2")
public static String es_PE_FIELD_CashLine_Amount_Description="Total en una moneda definida";

@XendraTrl(Identifier="c912c951-048c-f286-cc3f-0288c87038b2")
public static String es_PE_FIELD_CashLine_Amount_Help="Indica el total para esta línea del documento";

@XendraTrl(Identifier="c912c951-048c-f286-cc3f-0288c87038b2")
public static String es_PE_FIELD_CashLine_Amount_Name="Total";
@XendraField(AD_Column_ID="Amount",
IsCentrallyMaintained=true,AD_Tab_ID="3907dcf0-529f-7e00-12cd-062a3a040dd6",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=140,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c912c951-048c-f286-cc3f-0288c87038b2")
public static final String FIELDNAME_CashLine_Amount="c912c951-048c-f286-cc3f-0288c87038b2";

@XendraTrl(Identifier="c778125b-f89e-c37c-003e-a8886855e890")
public static String es_PE_COLUMN_Amount_Name="Total";

@XendraColumn(AD_Element_ID="d89b3a02-29fd-e2e3-2d01-dbda08fb2454",ColumnName="Amount",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,
ReadOnlyLogic="@IsGenerated@=Y",IsIdentifier=true,SeqNo=3,IsTranslated=false,
Callout="org.compiere.model.CalloutCashJournal.amounts",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c778125b-f89e-c37c-003e-a8886855e890",
Synchronized="2017-08-05 16:53:28.0")
/** Column name Amount */
public static final String COLUMNNAME_Amount = "Amount";
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

@XendraTrl(Identifier="007e776c-9b01-bc27-9ddb-b59aedfd2c5d")
public static String es_PE_FIELD_CashLine_Cashed_Name="cashed";
@XendraField(AD_Column_ID="Cashed",
IsCentrallyMaintained=true,AD_Tab_ID="3907dcf0-529f-7e00-12cd-062a3a040dd6",AD_FieldGroup_ID="",
IsDisplayed=false,DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="007e776c-9b01-bc27-9ddb-b59aedfd2c5d")
public static final String FIELDNAME_CashLine_Cashed="007e776c-9b01-bc27-9ddb-b59aedfd2c5d";

@XendraTrl(Identifier="0de5c132-37f4-082f-b175-b2b2ca1dfd27")
public static String es_PE_COLUMN_Cashed_Name="cashed";

@XendraColumn(AD_Element_ID="89dff811-0179-e222-762c-284cfbae4f72",ColumnName="Cashed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0de5c132-37f4-082f-b175-b2b2ca1dfd27",
Synchronized="2017-08-05 16:53:28.0")
/** Column name Cashed */
public static final String COLUMNNAME_Cashed = "Cashed";

/** CashType AD_Reference=c8687157-9eab-2d8f-c187-491e339f59bc */
public static final int CASHTYPE_AD_Reference_ID=217;
/** Set Cash Type.
@param CashType Source of Cash */
public void setCashType (String CashType)
{
if (CashType == null) throw new IllegalArgumentException ("CashType is mandatory");
if (CashType.equals(REF_C_CashTrxType.Invoice) || CashType.equals(REF_C_CashTrxType.Charge) || CashType.equals(REF_C_CashTrxType.GeneralExpense) || CashType.equals(REF_C_CashTrxType.GeneralReceipts) || CashType.equals(REF_C_CashTrxType.Difference) || CashType.equals(REF_C_CashTrxType.BankAccountTransfer) || CashType.equals(REF_C_CashTrxType.BillOfExchange));
 else throw new IllegalArgumentException ("CashType Invalid value - " + CashType + " - Reference_ID=217 - I - C - E - R - D - T - B");
if (CashType.length() > 1)
{
log.warning("Length > 1 - truncated");
CashType = CashType.substring(0,0);
}
set_ValueNoCheck (COLUMNNAME_CashType, CashType);
}
/** Get Cash Type.
@return Source of Cash */
public String getCashType() 
{
return (String)get_Value(COLUMNNAME_CashType);
}

@XendraTrl(Identifier="cf25b774-0e86-2183-366e-fd67c8518316")
public static String es_PE_FIELD_CashLine_CashType_Description="Fuente de Efectivo";

@XendraTrl(Identifier="cf25b774-0e86-2183-366e-fd67c8518316")
public static String es_PE_FIELD_CashLine_CashType_Help="Indica la fuente para esta línea del diario de efectivo";

@XendraTrl(Identifier="cf25b774-0e86-2183-366e-fd67c8518316")
public static String es_PE_FIELD_CashLine_CashType_Name="Tipo de Efectivo";

@XendraField(AD_Column_ID="CashType",IsCentrallyMaintained=true,
AD_Tab_ID="3907dcf0-529f-7e00-12cd-062a3a040dd6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cf25b774-0e86-2183-366e-fd67c8518316")
public static final String FIELDNAME_CashLine_CashType="cf25b774-0e86-2183-366e-fd67c8518316";

@XendraTrl(Identifier="ebbd4897-c018-811e-58f5-f58b76f9f186")
public static String es_PE_COLUMN_CashType_Name="Tipo de Efectivo";

@XendraColumn(AD_Element_ID="747d04eb-14e2-4afb-d815-ca9cbd878c1a",ColumnName="CashType",
AD_Reference_ID=17,AD_Reference_Value_ID="c8687157-9eab-2d8f-c187-491e339f59bc",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="I",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutCashJournal.cashtype",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ebbd4897-c018-811e-58f5-f58b76f9f186",
Synchronized="2017-08-05 16:53:28.0")
/** Column name CashType */
public static final String COLUMNNAME_CashType = "CashType";
/** Set Bank Account.
@param C_BankAccount_ID Account at the Bank */
public void setC_BankAccount_ID (int C_BankAccount_ID)
{
if (C_BankAccount_ID <= 0) set_Value (COLUMNNAME_C_BankAccount_ID, null);
 else 
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

@XendraTrl(Identifier="bce4d3d2-c48c-314b-ffa5-10ecf5aa2058")
public static String es_PE_FIELD_CashLine_BankAccount_Description="Cuenta bancaria";

@XendraTrl(Identifier="bce4d3d2-c48c-314b-ffa5-10ecf5aa2058")
public static String es_PE_FIELD_CashLine_BankAccount_Help="La cuenta bancaria identifica una cuenta en este banco";

@XendraTrl(Identifier="bce4d3d2-c48c-314b-ffa5-10ecf5aa2058")
public static String es_PE_FIELD_CashLine_BankAccount_Name="Cuenta Bancaria";

@XendraField(AD_Column_ID="C_BankAccount_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3907dcf0-529f-7e00-12cd-062a3a040dd6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@CashType@=T",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bce4d3d2-c48c-314b-ffa5-10ecf5aa2058")
public static final String FIELDNAME_CashLine_BankAccount="bce4d3d2-c48c-314b-ffa5-10ecf5aa2058";

@XendraTrl(Identifier="f88ff11f-7377-f22c-f085-331d91c7cb5e")
public static String es_PE_COLUMN_C_BankAccount_ID_Name="Cuenta Bancaria";

@XendraColumn(AD_Element_ID="5a03bc67-316f-bd8c-9e68-b009ad1b290b",ColumnName="C_BankAccount_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f88ff11f-7377-f22c-f085-331d91c7cb5e",
Synchronized="2017-08-05 16:53:28.0")
/** Column name C_BankAccount_ID */
public static final String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
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

@XendraTrl(Identifier="ee3db9eb-969e-7f3f-261c-60eb33834700")
public static String es_PE_FIELD_CashLine_BillOfExchange_Description="Identificador de la Letra de Cambio ";

@XendraTrl(Identifier="ee3db9eb-969e-7f3f-261c-60eb33834700")
public static String es_PE_FIELD_CashLine_BillOfExchange_Help="El docuemnto Letra de Cambio";

@XendraTrl(Identifier="ee3db9eb-969e-7f3f-261c-60eb33834700")
public static String es_PE_FIELD_CashLine_BillOfExchange_Name="Letra de Cambio";

@XendraField(AD_Column_ID="C_BOE_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3907dcf0-529f-7e00-12cd-062a3a040dd6",AD_FieldGroup_ID="Other options",IsDisplayed=true,
DisplayLogic="@CashType@=B",DisplayLength=10,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ee3db9eb-969e-7f3f-261c-60eb33834700")
public static final String FIELDNAME_CashLine_BillOfExchange="ee3db9eb-969e-7f3f-261c-60eb33834700";

@XendraTrl(Identifier="1b193c21-b6b0-487d-1655-c069197c2cd6")
public static String es_PE_COLUMN_C_BOE_ID_Name="Letra de Cambio";

@XendraColumn(AD_Element_ID="7dfa9e28-2055-cea9-fa94-b5ebdac44420",ColumnName="C_BOE_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutCashJournal.boe",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="1b193c21-b6b0-487d-1655-c069197c2cd6",Synchronized="2017-08-05 16:53:28.0")
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

@XendraTrl(Identifier="0ff73772-79b4-ec8f-0a44-05e64738f269")
public static String es_PE_FIELD_CashLine_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="0ff73772-79b4-ec8f-0a44-05e64738f269")
public static String es_PE_FIELD_CashLine_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="0ff73772-79b4-ec8f-0a44-05e64738f269")
public static String es_PE_FIELD_CashLine_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3907dcf0-529f-7e00-12cd-062a3a040dd6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0ff73772-79b4-ec8f-0a44-05e64738f269")
public static final String FIELDNAME_CashLine_BusinessPartner="0ff73772-79b4-ec8f-0a44-05e64738f269";

@XendraTrl(Identifier="13ee11ca-404e-2fd3-dbe5-f13de9914e22")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="@C_BPartner_ID@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutCashJournal.bpartner",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="13ee11ca-404e-2fd3-dbe5-f13de9914e22",
Synchronized="2017-08-05 16:53:28.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
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

@XendraTrl(Identifier="a70dc72d-6ff2-46fc-1095-d56fa1c6123d")
public static String es_PE_FIELD_CashLine_CashFlowCategory_Description="Marcar la categoria de flujo de caja a la que pertenece este pago";

@XendraTrl(Identifier="a70dc72d-6ff2-46fc-1095-d56fa1c6123d")
public static String es_PE_FIELD_CashLine_CashFlowCategory_Help="La categoria de flujo de caja nos indica que tipo de movimiento por caja estamos haciendo, para finalmente sacar el flujo de caja real y proyectado";

@XendraTrl(Identifier="a70dc72d-6ff2-46fc-1095-d56fa1c6123d")
public static String es_PE_FIELD_CashLine_CashFlowCategory_Name="Flujo de Caja";

@XendraField(AD_Column_ID="C_Cashflow_Group_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3907dcf0-529f-7e00-12cd-062a3a040dd6",AD_FieldGroup_ID="Other options",
IsDisplayed=false,DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="a70dc72d-6ff2-46fc-1095-d56fa1c6123d")
public static final String FIELDNAME_CashLine_CashFlowCategory="a70dc72d-6ff2-46fc-1095-d56fa1c6123d";

@XendraTrl(Identifier="00d6c342-77ed-800d-b931-3e13a979ee54")
public static String es_PE_COLUMN_C_Cashflow_Group_ID_Name="Cash Flow Category";

@XendraColumn(AD_Element_ID="d6ea8b87-4b95-2b42-c8d2-26b382da1f6c",
ColumnName="C_Cashflow_Group_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="00d6c342-77ed-800d-b931-3e13a979ee54",Synchronized="2017-08-05 16:53:28.0")
/** Column name C_Cashflow_Group_ID */
public static final String COLUMNNAME_C_Cashflow_Group_ID = "C_Cashflow_Group_ID";
/** Set Cash Journal.
@param C_Cash_ID Cash Journal */
public void setC_Cash_ID (int C_Cash_ID)
{
if (C_Cash_ID < 1) throw new IllegalArgumentException ("C_Cash_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Cash_ID, Integer.valueOf(C_Cash_ID));
}
/** Get Cash Journal.
@return Cash Journal */
public int getC_Cash_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Cash_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getC_Cash_ID()));
}

@XendraTrl(Identifier="cf3e5902-852b-e35c-4f8d-af539222504e")
public static String es_PE_FIELD_CashLine_CashJournal_Description="Diario de efectivo";

@XendraTrl(Identifier="cf3e5902-852b-e35c-4f8d-af539222504e")
public static String es_PE_FIELD_CashLine_CashJournal_Help="El diario de efectivo identifica únicamente un diario de efectivo. El diario de efectivo registrará las transacciones para la cuenta de bancos";

@XendraTrl(Identifier="cf3e5902-852b-e35c-4f8d-af539222504e")
public static String es_PE_FIELD_CashLine_CashJournal_Name="Diario de Efectivo";

@XendraField(AD_Column_ID="C_Cash_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3907dcf0-529f-7e00-12cd-062a3a040dd6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cf3e5902-852b-e35c-4f8d-af539222504e")
public static final String FIELDNAME_CashLine_CashJournal="cf3e5902-852b-e35c-4f8d-af539222504e";

@XendraTrl(Identifier="cb005760-ec03-f590-5936-0184fc5983de")
public static String es_PE_COLUMN_C_Cash_ID_Name="Diario de Efectivo";

@XendraColumn(AD_Element_ID="b43be1cd-0c26-1fad-b5d8-421dd3b1146e",ColumnName="C_Cash_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cb005760-ec03-f590-5936-0184fc5983de",
Synchronized="2017-08-05 16:53:28.0")
/** Column name C_Cash_ID */
public static final String COLUMNNAME_C_Cash_ID = "C_Cash_ID";
/** Set Cash Journal Line.
@param C_CashLine_ID Cash Journal Line */
public void setC_CashLine_ID (int C_CashLine_ID)
{
if (C_CashLine_ID < 1) throw new IllegalArgumentException ("C_CashLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_CashLine_ID, Integer.valueOf(C_CashLine_ID));
}
/** Get Cash Journal Line.
@return Cash Journal Line */
public int getC_CashLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_CashLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="80712043-5af4-779a-b57f-c8354a83753f")
public static String es_PE_FIELD_CashLine_CashJournalLine_Description="Item del diario de efectivo";

@XendraTrl(Identifier="80712043-5af4-779a-b57f-c8354a83753f")
public static String es_PE_FIELD_CashLine_CashJournalLine_Help="Identifica un Item único en un diario de efectivo.";

@XendraTrl(Identifier="80712043-5af4-779a-b57f-c8354a83753f")
public static String es_PE_FIELD_CashLine_CashJournalLine_Name="Item del Diario de Efectivo";

@XendraField(AD_Column_ID="C_CashLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3907dcf0-529f-7e00-12cd-062a3a040dd6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="80712043-5af4-779a-b57f-c8354a83753f")
public static final String FIELDNAME_CashLine_CashJournalLine="80712043-5af4-779a-b57f-c8354a83753f";
/** Column name C_CashLine_ID */
public static final String COLUMNNAME_C_CashLine_ID = "C_CashLine_ID";
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

@XendraTrl(Identifier="46465344-18e3-e440-2c8e-a38db4a3dae5")
public static String es_PE_FIELD_CashLine_Charge_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="46465344-18e3-e440-2c8e-a38db4a3dae5")
public static String es_PE_FIELD_CashLine_Charge_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraTrl(Identifier="46465344-18e3-e440-2c8e-a38db4a3dae5")
public static String es_PE_FIELD_CashLine_Charge_Name="Cargo";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3907dcf0-529f-7e00-12cd-062a3a040dd6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@CashType@=C",DisplayLength=14,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="46465344-18e3-e440-2c8e-a38db4a3dae5")
public static final String FIELDNAME_CashLine_Charge="46465344-18e3-e440-2c8e-a38db4a3dae5";

@XendraTrl(Identifier="5b1eecc7-fa19-f2e5-1681-a95acba0476c")
public static String es_PE_COLUMN_C_Charge_ID_Name="Cargo";

@XendraColumn(AD_Element_ID="d7e2fc48-a26e-4ded-ea44-fe15849a7883",ColumnName="C_Charge_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5b1eecc7-fa19-f2e5-1681-a95acba0476c",
Synchronized="2017-08-05 16:53:28.0")
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

@XendraTrl(Identifier="73221342-e170-23ff-af03-721f072307e3")
public static String es_PE_FIELD_CashLine_CurrencyType_Description="Tipo de índice de conversión de moneda ";

@XendraTrl(Identifier="73221342-e170-23ff-af03-721f072307e3")
public static String es_PE_FIELD_CashLine_CurrencyType_Help="El tipo del índice de conversión de monedas le deja definir diversos tipos de tarifas, tarifas ej. del punto, corporativas y/o de Ventas/Compras.";

@XendraTrl(Identifier="73221342-e170-23ff-af03-721f072307e3")
public static String es_PE_FIELD_CashLine_CurrencyType_Name="Tipo de Moneda";

@XendraField(AD_Column_ID="C_ConversionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3907dcf0-529f-7e00-12cd-062a3a040dd6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="73221342-e170-23ff-af03-721f072307e3")
public static final String FIELDNAME_CashLine_CurrencyType="73221342-e170-23ff-af03-721f072307e3";

@XendraTrl(Identifier="14201297-79e6-70da-a6f2-762554e757ab")
public static String es_PE_COLUMN_C_ConversionType_ID_Name="Tipo de Moneda";

@XendraColumn(AD_Element_ID="66f5d039-c94d-0957-487b-eb3118bd7719",
ColumnName="C_ConversionType_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="14201297-79e6-70da-a6f2-762554e757ab",Synchronized="2017-08-05 16:53:28.0")
/** Column name C_ConversionType_ID */
public static final String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_Currency_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
}
/** Get Currency.
@return The Currency for this record */
public int getC_Currency_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1cc5627f-9fd5-780f-1719-c470282c404e")
public static String es_PE_FIELD_CashLine_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="1cc5627f-9fd5-780f-1719-c470282c404e")
public static String es_PE_FIELD_CashLine_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="1cc5627f-9fd5-780f-1719-c470282c404e")
public static String es_PE_FIELD_CashLine_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3907dcf0-529f-7e00-12cd-062a3a040dd6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1cc5627f-9fd5-780f-1719-c470282c404e")
public static final String FIELDNAME_CashLine_Currency="1cc5627f-9fd5-780f-1719-c470282c404e";

@XendraTrl(Identifier="aba77014-bcee-dd39-082d-886132987f4d")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aba77014-bcee-dd39-082d-886132987f4d",
Synchronized="2017-08-05 16:53:28.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Invoice.
@param C_Invoice_ID Invoice Identifier */
public void setC_Invoice_ID (int C_Invoice_ID)
{
if (C_Invoice_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_Invoice_ID, null);
 else 
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

@XendraTrl(Identifier="2f4dc8bb-4ceb-d415-e2b0-1422d359fb1b")
public static String es_PE_FIELD_CashLine_Invoice_Description="Identificador de la factura";

@XendraTrl(Identifier="2f4dc8bb-4ceb-d415-e2b0-1422d359fb1b")
public static String es_PE_FIELD_CashLine_Invoice_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraTrl(Identifier="2f4dc8bb-4ceb-d415-e2b0-1422d359fb1b")
public static String es_PE_FIELD_CashLine_Invoice_Name="Factura";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3907dcf0-529f-7e00-12cd-062a3a040dd6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@CashType@=I",DisplayLength=26,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2f4dc8bb-4ceb-d415-e2b0-1422d359fb1b")
public static final String FIELDNAME_CashLine_Invoice="2f4dc8bb-4ceb-d415-e2b0-1422d359fb1b";

@XendraTrl(Identifier="a0261f2c-4583-0c58-b61a-3633dffa007b")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Factura";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutCashJournal.invoice",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a0261f2c-4583-0c58-b61a-3633dffa007b",
Synchronized="2017-08-05 16:53:28.0")
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

@XendraTrl(Identifier="71504aba-0361-d698-7841-1ed6bf41b9aa")
public static String es_PE_FIELD_CashLine_Payment_Description="Identificador del pago";

@XendraTrl(Identifier="71504aba-0361-d698-7841-1ed6bf41b9aa")
public static String es_PE_FIELD_CashLine_Payment_Help="El pago es un identificador único de este pago.";

@XendraTrl(Identifier="71504aba-0361-d698-7841-1ed6bf41b9aa")
public static String es_PE_FIELD_CashLine_Payment_Name="Pago";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3907dcf0-529f-7e00-12cd-062a3a040dd6",AD_FieldGroup_ID="Other options",
IsDisplayed=false,DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="71504aba-0361-d698-7841-1ed6bf41b9aa")
public static final String FIELDNAME_CashLine_Payment="71504aba-0361-d698-7841-1ed6bf41b9aa";

@XendraTrl(Identifier="0666c333-b166-6e5b-e0b0-027ccbdae725")
public static String es_PE_COLUMN_C_Payment_ID_Name="Pago";

@XendraColumn(AD_Element_ID="3ded5658-968e-94c5-207b-eed6f6a7bb43",ColumnName="C_Payment_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0666c333-b166-6e5b-e0b0-027ccbdae725",
Synchronized="2017-08-05 16:53:28.0")
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

@XendraTrl(Identifier="b5a3ff7a-6185-47f1-b176-360bd8d91ab7")
public static String es_PE_FIELD_CashLine_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="b5a3ff7a-6185-47f1-b176-360bd8d91ab7")
public static String es_PE_FIELD_CashLine_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraTrl(Identifier="b5a3ff7a-6185-47f1-b176-360bd8d91ab7")
public static String es_PE_FIELD_CashLine_Project_Name="Proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3907dcf0-529f-7e00-12cd-062a3a040dd6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-06 21:47:53.0",
Identifier="b5a3ff7a-6185-47f1-b176-360bd8d91ab7")
public static final String FIELDNAME_CashLine_Project="b5a3ff7a-6185-47f1-b176-360bd8d91ab7";

@XendraTrl(Identifier="124c215a-0688-436e-95e7-01877e909670")
public static String es_PE_COLUMN_C_Project_ID_Name="Project";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="124c215a-0688-436e-95e7-01877e909670",
Synchronized="2017-08-05 16:53:28.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
/** Set Date Invoiced.
@param DateInvoiced Date printed on Invoice */
public void setDateInvoiced (Timestamp DateInvoiced)
{
set_Value (COLUMNNAME_DateInvoiced, DateInvoiced);
}
/** Get Date Invoiced.
@return Date printed on Invoice */
public Timestamp getDateInvoiced() 
{
return (Timestamp)get_Value(COLUMNNAME_DateInvoiced);
}

@XendraTrl(Identifier="50b05816-8deb-e93c-dd9f-3cb6c222db58")
public static String es_PE_FIELD_CashLine_DateInvoiced_Description="Fecha impresa en la factura";

@XendraTrl(Identifier="50b05816-8deb-e93c-dd9f-3cb6c222db58")
public static String es_PE_FIELD_CashLine_DateInvoiced_Help="La fecha de la factura indica la fecha impresa en la factura.";

@XendraTrl(Identifier="50b05816-8deb-e93c-dd9f-3cb6c222db58")
public static String es_PE_FIELD_CashLine_DateInvoiced_Name="Fecha Ref.";

@XendraField(AD_Column_ID="DateInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="3907dcf0-529f-7e00-12cd-062a3a040dd6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@CashType@=C",DisplayLength=29,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="50b05816-8deb-e93c-dd9f-3cb6c222db58")
public static final String FIELDNAME_CashLine_DateInvoiced="50b05816-8deb-e93c-dd9f-3cb6c222db58";

@XendraTrl(Identifier="5a8f11fe-58e0-8063-657a-6d3e20c90dd1")
public static String es_PE_COLUMN_DateInvoiced_Name="Date Invoiced";

@XendraColumn(AD_Element_ID="5e3c1a65-f97d-82ed-a21c-bc730ca3c080",ColumnName="DateInvoiced",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5a8f11fe-58e0-8063-657a-6d3e20c90dd1",
Synchronized="2017-08-05 16:53:28.0")
/** Column name DateInvoiced */
public static final String COLUMNNAME_DateInvoiced = "DateInvoiced";
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

@XendraTrl(Identifier="cdf0edf4-bd89-0208-1a64-c57eacfa7de1")
public static String es_PE_FIELD_CashLine_Description_Description="Observación";

@XendraTrl(Identifier="cdf0edf4-bd89-0208-1a64-c57eacfa7de1")
public static String es_PE_FIELD_CashLine_Description_Help="Observación";

@XendraTrl(Identifier="cdf0edf4-bd89-0208-1a64-c57eacfa7de1")
public static String es_PE_FIELD_CashLine_Description_Name="Observación / Motivo";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="3907dcf0-529f-7e00-12cd-062a3a040dd6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cdf0edf4-bd89-0208-1a64-c57eacfa7de1")
public static final String FIELDNAME_CashLine_Description="cdf0edf4-bd89-0208-1a64-c57eacfa7de1";

@XendraTrl(Identifier="a2d6b2e4-c90d-bd35-5f3a-9f2f7c9978ee")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a2d6b2e4-c90d-bd35-5f3a-9f2f7c9978ee",
Synchronized="2017-08-05 16:53:28.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Description2.
@param Description2 Description2 */
public void setDescription2 (String Description2)
{
if (Description2 != null && Description2.length() > 255)
{
log.warning("Length > 255 - truncated");
Description2 = Description2.substring(0,254);
}
set_Value (COLUMNNAME_Description2, Description2);
}
/** Get Description2.
@return Description2 */
public String getDescription2() 
{
String value = (String)get_Value(COLUMNNAME_Description2);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="f9cdf875-0802-5b23-af05-d0365d2e33ac")
public static String es_PE_FIELD_CashLine_Description22_Name="Destino de la movilidad";

@XendraField(AD_Column_ID="Description2",IsCentrallyMaintained=true,
AD_Tab_ID="3907dcf0-529f-7e00-12cd-062a3a040dd6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@CashType@=C",DisplayLength=255,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f9cdf875-0802-5b23-af05-d0365d2e33ac")
public static final String FIELDNAME_CashLine_Description22="f9cdf875-0802-5b23-af05-d0365d2e33ac";

@XendraTrl(Identifier="bdefeb1b-e577-d09e-863a-df16696aac7d")
public static String es_PE_COLUMN_Description2_Name="Description2";

@XendraColumn(AD_Element_ID="62f727e5-e9e4-6792-c927-c22b6d8bdc69",ColumnName="Description2",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bdefeb1b-e577-d09e-863a-df16696aac7d",
Synchronized="2017-08-05 16:53:28.0")
/** Column name Description2 */
public static final String COLUMNNAME_Description2 = "Description2";
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

@XendraTrl(Identifier="0e031d59-6789-8069-a36f-91e12c0a11d3")
public static String es_PE_FIELD_CashLine_DiscountAmount_Description="Total de descuento calculado";

@XendraTrl(Identifier="0e031d59-6789-8069-a36f-91e12c0a11d3")
public static String es_PE_FIELD_CashLine_DiscountAmount_Help="El Total descuento indica el total de descuento para un documento ó línea";

@XendraTrl(Identifier="0e031d59-6789-8069-a36f-91e12c0a11d3")
public static String es_PE_FIELD_CashLine_DiscountAmount_Name="Total del Descuento";

@XendraField(AD_Column_ID="DiscountAmt",IsCentrallyMaintained=true,
AD_Tab_ID="3907dcf0-529f-7e00-12cd-062a3a040dd6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@CashType@=I | @CashType@=B & @IsGenerated@=N",DisplayLength=26,IsReadOnly=false,
SeqNo=180,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="0e031d59-6789-8069-a36f-91e12c0a11d3")
public static final String FIELDNAME_CashLine_DiscountAmount="0e031d59-6789-8069-a36f-91e12c0a11d3";

@XendraTrl(Identifier="2f24c35c-5724-22e1-bf4e-42f7ba62605e")
public static String es_PE_COLUMN_DiscountAmt_Name="Total del Descuento";

@XendraColumn(AD_Element_ID="351290a4-6d07-13cb-9132-459358217d86",ColumnName="DiscountAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutCashJournal.amounts",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2f24c35c-5724-22e1-bf4e-42f7ba62605e",
Synchronized="2017-08-05 16:53:28.0")
/** Column name DiscountAmt */
public static final String COLUMNNAME_DiscountAmt = "DiscountAmt";
/** Set Document No.
@param DocumentNo Document sequence number of the document */
public void setDocumentNo (String DocumentNo)
{
if (DocumentNo != null && DocumentNo.length() > 15)
{
log.warning("Length > 15 - truncated");
DocumentNo = DocumentNo.substring(0,14);
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
@XendraTrl(Identifier="cfca8d9e-df36-3ad7-f854-492dbe9c484e")
public static String es_PE_FIELD_CashLine_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="cfca8d9e-df36-3ad7-f854-492dbe9c484e")
public static String es_PE_FIELD_CashLine_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraTrl(Identifier="cfca8d9e-df36-3ad7-f854-492dbe9c484e")
public static String es_PE_FIELD_CashLine_DocumentNo_Name="Documento Ref.";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="3907dcf0-529f-7e00-12cd-062a3a040dd6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@CashType@=C",DisplayLength=15,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cfca8d9e-df36-3ad7-f854-492dbe9c484e")
public static final String FIELDNAME_CashLine_DocumentNo="cfca8d9e-df36-3ad7-f854-492dbe9c484e";

@XendraTrl(Identifier="6878982e-9add-ec87-ccf9-6c23db7fe451")
public static String es_PE_COLUMN_DocumentNo_Name="Document No";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=15,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6878982e-9add-ec87-ccf9-6c23db7fe451",
Synchronized="2017-08-05 16:53:28.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";
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
@XendraTrl(Identifier="29c45e8e-f12d-4d2b-b20d-b144b645822b")
public static String es_PE_FIELD_CashLine_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="3907dcf0-529f-7e00-12cd-062a3a040dd6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-06 21:47:53.0",
Identifier="29c45e8e-f12d-4d2b-b20d-b144b645822b")
public static final String FIELDNAME_CashLine_Identifier="29c45e8e-f12d-4d2b-b20d-b144b645822b";

@XendraTrl(Identifier="7f9952a3-ada6-4324-9733-a26bcc4b53b8")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7f9952a3-ada6-4324-9733-a26bcc4b53b8",
Synchronized="2017-08-05 16:53:28.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set IsCollection.
@param IsCollection IsCollection */
public void setIsCollection (boolean IsCollection)
{
set_Value (COLUMNNAME_IsCollection, Boolean.valueOf(IsCollection));
}
/** Get IsCollection.
@return IsCollection */
public boolean isCollection() 
{
Object oo = get_Value(COLUMNNAME_IsCollection);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f3fbac57-e936-8a13-d6cc-c1b8774cf2cc")
public static String es_PE_FIELD_CashLine_IsCollection_Name="iscollection";

@XendraField(AD_Column_ID="IsCollection",IsCentrallyMaintained=true,
AD_Tab_ID="3907dcf0-529f-7e00-12cd-062a3a040dd6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f3fbac57-e936-8a13-d6cc-c1b8774cf2cc")
public static final String FIELDNAME_CashLine_IsCollection="f3fbac57-e936-8a13-d6cc-c1b8774cf2cc";

@XendraTrl(Identifier="3ddd51e2-324b-b3f5-d2e8-158d6a431945")
public static String es_PE_COLUMN_IsCollection_Name="iscollection";

@XendraColumn(AD_Element_ID="737069e1-b5a0-e65c-efcd-7ab5c801a956",ColumnName="IsCollection",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3ddd51e2-324b-b3f5-d2e8-158d6a431945",
Synchronized="2017-08-05 16:53:28.0")
/** Column name IsCollection */
public static final String COLUMNNAME_IsCollection = "IsCollection";
/** Set Generated.
@param IsGenerated This Line is generated */
public void setIsGenerated (boolean IsGenerated)
{
set_ValueNoCheck (COLUMNNAME_IsGenerated, Boolean.valueOf(IsGenerated));
}
/** Get Generated.
@return This Line is generated */
public boolean isGenerated() 
{
Object oo = get_Value(COLUMNNAME_IsGenerated);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="6ddf8f43-903d-b477-89a8-1b1450f3e6f3")
public static String es_PE_FIELD_CashLine_Generated_Description="Esta línea es generada";

@XendraTrl(Identifier="6ddf8f43-903d-b477-89a8-1b1450f3e6f3")
public static String es_PE_FIELD_CashLine_Generated_Help="El cuadro de verificación generado identifica una línea de póliza que fue generada desde un documento fuente. Las líneas podrían también ser introducidas manualmente ó importadas.";

@XendraTrl(Identifier="6ddf8f43-903d-b477-89a8-1b1450f3e6f3")
public static String es_PE_FIELD_CashLine_Generated_Name="Generado";

@XendraField(AD_Column_ID="IsGenerated",IsCentrallyMaintained=true,
AD_Tab_ID="3907dcf0-529f-7e00-12cd-062a3a040dd6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@CashType@=I",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6ddf8f43-903d-b477-89a8-1b1450f3e6f3")
public static final String FIELDNAME_CashLine_Generated="6ddf8f43-903d-b477-89a8-1b1450f3e6f3";

@XendraTrl(Identifier="1762b921-2ca4-a878-29ad-783f3cf2400c")
public static String es_PE_COLUMN_IsGenerated_Name="Generado";

@XendraColumn(AD_Element_ID="88727bdd-ffa1-9516-a955-2200e496a777",ColumnName="IsGenerated",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1762b921-2ca4-a878-29ad-783f3cf2400c",
Synchronized="2017-08-05 16:53:28.0")
/** Column name IsGenerated */
public static final String COLUMNNAME_IsGenerated = "IsGenerated";
/** Set Is a partial payment.
@param IsPartialPayment Is a partial payment */
public void setIsPartialPayment (boolean IsPartialPayment)
{
set_Value (COLUMNNAME_IsPartialPayment, Boolean.valueOf(IsPartialPayment));
}
/** Get Is a partial payment.
@return Is a partial payment */
public boolean isPartialPayment() 
{
Object oo = get_Value(COLUMNNAME_IsPartialPayment);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="696386ea-c16e-e842-acfe-5120babf8e5d")
public static String es_PE_FIELD_CashLine_IsAPartialPayment_Name="Es un pago parcial";

@XendraField(AD_Column_ID="IsPartialPayment",IsCentrallyMaintained=true,
AD_Tab_ID="3907dcf0-529f-7e00-12cd-062a3a040dd6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@CashType@=I | @CashType@=B ",DisplayLength=0,IsReadOnly=false,SeqNo=200,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="696386ea-c16e-e842-acfe-5120babf8e5d")
public static final String FIELDNAME_CashLine_IsAPartialPayment="696386ea-c16e-e842-acfe-5120babf8e5d";

@XendraTrl(Identifier="7aab8fb1-0dd9-a302-9a97-da403b1f6fb7")
public static String es_PE_COLUMN_IsPartialPayment_Name="Es un pago parcial";

@XendraColumn(AD_Element_ID="2d3371e8-1fda-44b6-d5b2-0017668e95cc",ColumnName="IsPartialPayment",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutCashJournal.amounts",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7aab8fb1-0dd9-a302-9a97-da403b1f6fb7",
Synchronized="2017-08-05 16:53:28.0")
/** Column name IsPartialPayment */
public static final String COLUMNNAME_IsPartialPayment = "IsPartialPayment";
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

@XendraTrl(Identifier="fd8e3788-8798-2666-4df2-4c2d88abe034")
public static String es_PE_FIELD_CashLine_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="fd8e3788-8798-2666-4df2-4c2d88abe034")
public static String es_PE_FIELD_CashLine_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraTrl(Identifier="fd8e3788-8798-2666-4df2-4c2d88abe034")
public static String es_PE_FIELD_CashLine_LineNo_Name="No. Línea";
@XendraField(AD_Column_ID="Line",
IsCentrallyMaintained=true,AD_Tab_ID="3907dcf0-529f-7e00-12cd-062a3a040dd6",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="fd8e3788-8798-2666-4df2-4c2d88abe034")
public static final String FIELDNAME_CashLine_LineNo="fd8e3788-8798-2666-4df2-4c2d88abe034";

@XendraTrl(Identifier="5f918437-6a47-556d-56ef-e67acb33d4b2")
public static String es_PE_COLUMN_Line_Name="No. Línea";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM C_CashLine WHERE C_Cash_ID=@C_Cash_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5f918437-6a47-556d-56ef-e67acb33d4b2",
Synchronized="2017-08-05 16:53:28.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";
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

@XendraTrl(Identifier="f5756925-f4d7-4b46-1167-9a2c88b82d48")
public static String es_PE_FIELD_CashLine_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="f5756925-f4d7-4b46-1167-9a2c88b82d48")
public static String es_PE_FIELD_CashLine_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="f5756925-f4d7-4b46-1167-9a2c88b82d48")
public static String es_PE_FIELD_CashLine_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="3907dcf0-529f-7e00-12cd-062a3a040dd6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f5756925-f4d7-4b46-1167-9a2c88b82d48")
public static final String FIELDNAME_CashLine_Processed="f5756925-f4d7-4b46-1167-9a2c88b82d48";

@XendraTrl(Identifier="516177cd-69b8-e25f-08b8-fef1d7a2dd05")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="516177cd-69b8-e25f-08b8-fef1d7a2dd05",
Synchronized="2017-08-05 16:53:28.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
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

@XendraTrl(Identifier="7621e8b3-cc54-0e7a-6caa-2ec6bc46ae64")
public static String es_PE_FIELD_CashLine_RenewedAmt_Name="RenewedAmt";

@XendraField(AD_Column_ID="RenewedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="3907dcf0-529f-7e00-12cd-062a3a040dd6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@CashType@=B",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7621e8b3-cc54-0e7a-6caa-2ec6bc46ae64")
public static final String FIELDNAME_CashLine_RenewedAmt="7621e8b3-cc54-0e7a-6caa-2ec6bc46ae64";

@XendraTrl(Identifier="1a49ab5b-a79b-8b21-2d33-b474336449f5")
public static String es_PE_COLUMN_RenewedAmt_Name="RenewedAmt";

@XendraColumn(AD_Element_ID="129b3913-b2f7-440f-2257-1f7b71f40bb0",ColumnName="RenewedAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutCashJournal.amounts",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1a49ab5b-a79b-8b21-2d33-b474336449f5",
Synchronized="2017-08-05 16:53:28.0")
/** Column name RenewedAmt */
public static final String COLUMNNAME_RenewedAmt = "RenewedAmt";
/** Set Ticket.
@param Ticket Ticket */
public void setTicket (String Ticket)
{
if (Ticket != null && Ticket.length() > 1)
{
log.warning("Length > 1 - truncated");
Ticket = Ticket.substring(0,0);
}
set_Value (COLUMNNAME_Ticket, Ticket);
}
/** Get Ticket.
@return Ticket */
public String getTicket() 
{
return (String)get_Value(COLUMNNAME_Ticket);
}

@XendraTrl(Identifier="fd3bf10a-827b-dfa5-53b1-09a377f8f9c9")
public static String es_PE_FIELD_CashLine_Ticket_Name="Ticket";
@XendraField(AD_Column_ID="Ticket",
IsCentrallyMaintained=true,AD_Tab_ID="3907dcf0-529f-7e00-12cd-062a3a040dd6",
AD_FieldGroup_ID="Other options",IsDisplayed=true,DisplayLogic="",DisplayLength=1,IsReadOnly=false,
SeqNo=210,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="fd3bf10a-827b-dfa5-53b1-09a377f8f9c9")
public static final String FIELDNAME_CashLine_Ticket="fd3bf10a-827b-dfa5-53b1-09a377f8f9c9";

@XendraTrl(Identifier="fb287156-367b-c615-84c0-b5f2854a19a6")
public static String es_PE_COLUMN_Ticket_Name="Ticket";

@XendraColumn(AD_Element_ID="f98fe3e7-db45-2a18-68cc-3dda85cfb753",ColumnName="Ticket",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutTicket.allocationline",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fb287156-367b-c615-84c0-b5f2854a19a6",
Synchronized="2017-08-05 16:53:28.0")
/** Column name Ticket */
public static final String COLUMNNAME_Ticket = "Ticket";
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

@XendraTrl(Identifier="b52f3130-ac9c-488b-a636-424e9dd35d6b")
public static String es_PE_FIELD_CashLine_WithholdingAmt_Name="withholdingamt";

@XendraField(AD_Column_ID="WithholdingAmt",IsCentrallyMaintained=true,
AD_Tab_ID="3907dcf0-529f-7e00-12cd-062a3a040dd6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-06 21:47:53.0",
Identifier="b52f3130-ac9c-488b-a636-424e9dd35d6b")
public static final String FIELDNAME_CashLine_WithholdingAmt="b52f3130-ac9c-488b-a636-424e9dd35d6b";

@XendraTrl(Identifier="b50707db-395d-4706-b805-72632df693e0")
public static String es_PE_COLUMN_WithholdingAmt_Name="withholdingamt";

@XendraColumn(AD_Element_ID="750228fc-a0da-46c7-b584-2e34797d13d0",ColumnName="WithholdingAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b50707db-395d-4706-b805-72632df693e0",
Synchronized="2017-08-05 16:53:29.0")
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

@XendraTrl(Identifier="0ec2a354-a54a-a062-e5b0-104a0f5ca227")
public static String es_PE_FIELD_CashLine_Write_OffAmount_Description="Total por ajustar";

@XendraTrl(Identifier="0ec2a354-a54a-a062-e5b0-104a0f5ca227")
public static String es_PE_FIELD_CashLine_Write_OffAmount_Help="El Total de ajuste indica el total a ser ajustado como incobrable";

@XendraTrl(Identifier="0ec2a354-a54a-a062-e5b0-104a0f5ca227")
public static String es_PE_FIELD_CashLine_Write_OffAmount_Name="Total del Ajuste";

@XendraField(AD_Column_ID="WriteOffAmt",IsCentrallyMaintained=true,
AD_Tab_ID="3907dcf0-529f-7e00-12cd-062a3a040dd6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@CashType@=I | @CashType@=B & @IsGenerated@=N & @IsPartialPayment@=N",
DisplayLength=26,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0ec2a354-a54a-a062-e5b0-104a0f5ca227")
public static final String FIELDNAME_CashLine_Write_OffAmount="0ec2a354-a54a-a062-e5b0-104a0f5ca227";

@XendraTrl(Identifier="e1dd7987-917f-ab63-7016-efa2fb3f115e")
public static String es_PE_COLUMN_WriteOffAmt_Name="Total del Ajuste";

@XendraColumn(AD_Element_ID="5f70c6d6-fd9f-549c-363e-80eaef7df1c7",ColumnName="WriteOffAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutCashJournal.amounts",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e1dd7987-917f-ab63-7016-efa2fb3f115e",
Synchronized="2017-08-05 16:53:29.0")
/** Column name WriteOffAmt */
public static final String COLUMNNAME_WriteOffAmt = "WriteOffAmt";

/** WriteOffType AD_Reference=c41b3d42-db96-44ab-af5b-5fac4c7465e6 */
public static final int WRITEOFFTYPE_AD_Reference_ID=1000069;
/** Set WriteOffType.
@param WriteOffType WriteOffType */
public void setWriteOffType (String WriteOffType)
{
if (WriteOffType == null || WriteOffType.equals(REF_WriteOffType.Donation) || WriteOffType.equals(REF_WriteOffType.WriteOffAmt) || WriteOffType.equals(REF_WriteOffType.None));
 else throw new IllegalArgumentException ("WriteOffType Invalid value - " + WriteOffType + " - Reference_ID=1000069 - D - W - N");
if (WriteOffType != null && WriteOffType.length() > 1)
{
log.warning("Length > 1 - truncated");
WriteOffType = WriteOffType.substring(0,0);
}
set_Value (COLUMNNAME_WriteOffType, WriteOffType);
}
/** Get WriteOffType.
@return WriteOffType */
public String getWriteOffType() 
{
return (String)get_Value(COLUMNNAME_WriteOffType);
}

@XendraTrl(Identifier="dbe0da20-1c8a-4855-98b4-62ad9c8063e6")
public static String es_PE_FIELD_CashLine_WriteOffType_Name="writeofftype";

@XendraField(AD_Column_ID="WriteOffType",IsCentrallyMaintained=true,
AD_Tab_ID="3907dcf0-529f-7e00-12cd-062a3a040dd6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-06 21:47:53.0",
Identifier="dbe0da20-1c8a-4855-98b4-62ad9c8063e6")
public static final String FIELDNAME_CashLine_WriteOffType="dbe0da20-1c8a-4855-98b4-62ad9c8063e6";

@XendraTrl(Identifier="cea8e2dd-c8ff-40a0-800b-2b024b1409e6")
public static String es_PE_COLUMN_WriteOffType_Name="WriteOffType";

@XendraColumn(AD_Element_ID="a3610896-3017-4b8c-9f1f-e21361226f89",ColumnName="WriteOffType",
AD_Reference_ID=17,AD_Reference_Value_ID="c41b3d42-db96-44ab-af5b-5fac4c7465e6",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="cea8e2dd-c8ff-40a0-800b-2b024b1409e6",Synchronized="2017-08-05 16:53:29.0")
/** Column name WriteOffType */
public static final String COLUMNNAME_WriteOffType = "WriteOffType";
}
