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
/** Generated Model for C_Charge_Acct
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Charge_Acct extends PO
{
/** Standard Constructor
@param ctx context
@param C_Charge_Acct_ID id
@param trxName transaction
*/
public X_C_Charge_Acct (Properties ctx, int C_Charge_Acct_ID, String trxName)
{
super (ctx, C_Charge_Acct_ID, trxName);
/** if (C_Charge_Acct_ID == 0)
{
setC_AcctSchema_ID (0);
setC_Charge_ID (0);
setCh_Expense_Acct (0);
setCh_Revenue_Acct (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_Charge_Acct (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=396 */
public static int Table_ID=MTable.getTable_ID("C_Charge_Acct");

@XendraTrl(Identifier="5f56b3f5-9bf5-e34e-2bbc-164017b6de89")
public static String es_PE_TAB_Accounting_Description="Contabilidad de Cargos";

@XendraTrl(Identifier="5f56b3f5-9bf5-e34e-2bbc-164017b6de89")
public static String es_PE_TAB_Accounting_Help="La pestaña Contabilidad define los parámetros usados para transacciones incluyendo cargos.";

@XendraTrl(Identifier="5f56b3f5-9bf5-e34e-2bbc-164017b6de89")
public static String es_PE_TAB_Accounting_Name="Contabilidad";
@XendraTab(Name="Accounting",
Description="Charge Accounting",
Help="The Accounting Tab defines the accounting parameters used for transactions including a charge or charges.",
AD_Window_ID="ef466ff3-68cd-74cc-581f-b4cfbb084e84",SeqNo=20,TabLevel=1,IsSingleRow=true,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="5f56b3f5-9bf5-e34e-2bbc-164017b6de89",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Accounting="5f56b3f5-9bf5-e34e-2bbc-164017b6de89";

@XendraTrl(Identifier="06547239-75ce-c41c-ae5e-3be5d1f5ac9b")
public static String es_PE_TABLE_C_Charge_Acct_Name="C_Charge_Acct";

@XendraTable(Name="C_Charge_Acct",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="C_Charge_Acct",AccessLevel="3",AD_Window_ID="ef466ff3-68cd-74cc-581f-b4cfbb084e84",
AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="06547239-75ce-c41c-ae5e-3be5d1f5ac9b",Synchronized="2020-03-03 21:36:43.0")
/** TableName=C_Charge_Acct */
public static final String Table_Name="C_Charge_Acct";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Charge_Acct");

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
    Table_ID = MTable.getTable_ID("C_Charge_Acct");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Charge_Acct[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="45e1231d-05a9-3d21-3d4a-6b338b849431")
public static String es_PE_FIELD_Accounting_AccountingSchema_Name="Esquema Contable";

@XendraTrl(Identifier="45e1231d-05a9-3d21-3d4a-6b338b849431")
public static String es_PE_FIELD_Accounting_AccountingSchema_Description="Reglas para contabilizar";

@XendraTrl(Identifier="45e1231d-05a9-3d21-3d4a-6b338b849431")
public static String es_PE_FIELD_Accounting_AccountingSchema_Help="Un esquema contable define las reglas contables usadas tales como método de costeo; moneda y calendario";

@XendraField(AD_Column_ID="C_AcctSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5f56b3f5-9bf5-e34e-2bbc-164017b6de89",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="45e1231d-05a9-3d21-3d4a-6b338b849431")
public static final String FIELDNAME_Accounting_AccountingSchema="45e1231d-05a9-3d21-3d4a-6b338b849431";

@XendraTrl(Identifier="c63dee47-10ab-c7af-9e4a-77859acde399")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c63dee47-10ab-c7af-9e4a-77859acde399",
Synchronized="2019-08-30 22:21:21.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
/** Set Charge.
@param C_Charge_ID Additional document charges */
public void setC_Charge_ID (int C_Charge_ID)
{
if (C_Charge_ID < 1) throw new IllegalArgumentException ("C_Charge_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Charge_ID, Integer.valueOf(C_Charge_ID));
}
/** Get Charge.
@return Additional document charges */
public int getC_Charge_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Charge_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="95f1166d-81a9-0a57-01aa-b21c291d714f")
public static String es_PE_FIELD_Accounting_Charge_Name="Cargo";

@XendraTrl(Identifier="95f1166d-81a9-0a57-01aa-b21c291d714f")
public static String es_PE_FIELD_Accounting_Charge_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="95f1166d-81a9-0a57-01aa-b21c291d714f")
public static String es_PE_FIELD_Accounting_Charge_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5f56b3f5-9bf5-e34e-2bbc-164017b6de89",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="95f1166d-81a9-0a57-01aa-b21c291d714f")
public static final String FIELDNAME_Accounting_Charge="95f1166d-81a9-0a57-01aa-b21c291d714f";

@XendraTrl(Identifier="3fe418e6-3f8d-51ab-dff1-f37f29c841e7")
public static String es_PE_COLUMN_C_Charge_ID_Name="Cargo";

@XendraColumn(AD_Element_ID="d7e2fc48-a26e-4ded-ea44-fe15849a7883",ColumnName="C_Charge_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3fe418e6-3f8d-51ab-dff1-f37f29c841e7",
Synchronized="2019-08-30 22:21:21.0")
/** Column name C_Charge_ID */
public static final String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
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

@XendraTrl(Identifier="2f9c7ae7-8ff1-4ad1-a4df-61838554eb5a")
public static String es_PE_FIELD_Accounting_ChargeExpense_Name="Cuenta Cargo";

@XendraTrl(Identifier="2f9c7ae7-8ff1-4ad1-a4df-61838554eb5a")
public static String es_PE_FIELD_Accounting_ChargeExpense_Description="Cuenta de otros gastos";

@XendraTrl(Identifier="2f9c7ae7-8ff1-4ad1-a4df-61838554eb5a")
public static String es_PE_FIELD_Accounting_ChargeExpense_Help="La cuenta de otros gastos identifica la cuenta a usar cuando se registran cargos pagados a proveedores.";

@XendraField(AD_Column_ID="Ch_Expense_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="5f56b3f5-9bf5-e34e-2bbc-164017b6de89",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2f9c7ae7-8ff1-4ad1-a4df-61838554eb5a")
public static final String FIELDNAME_Accounting_ChargeExpense="2f9c7ae7-8ff1-4ad1-a4df-61838554eb5a";

@XendraTrl(Identifier="703851cf-a082-3750-709d-a0f121a890b1")
public static String es_PE_COLUMN_Ch_Expense_Acct_Name="Cuenta Cargo";

@XendraColumn(AD_Element_ID="94da125a-6c2d-37e7-afc1-22b78b63499c",ColumnName="Ch_Expense_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="703851cf-a082-3750-709d-a0f121a890b1",
Synchronized="2019-08-30 22:21:21.0")
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

@XendraTrl(Identifier="f490aad1-71c1-9227-7e9f-8becfca49106")
public static String es_PE_FIELD_Accounting_ChargeRevenue_Name="Cuenta Abono";

@XendraTrl(Identifier="f490aad1-71c1-9227-7e9f-8becfca49106")
public static String es_PE_FIELD_Accounting_ChargeRevenue_Description="Cuenta de otros ingresos";

@XendraTrl(Identifier="f490aad1-71c1-9227-7e9f-8becfca49106")
public static String es_PE_FIELD_Accounting_ChargeRevenue_Help="La cuenta de otros ingresos identifica la cuenta a usar cuando se registran cargos pagados por los clientes";

@XendraField(AD_Column_ID="Ch_Revenue_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="5f56b3f5-9bf5-e34e-2bbc-164017b6de89",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f490aad1-71c1-9227-7e9f-8becfca49106")
public static final String FIELDNAME_Accounting_ChargeRevenue="f490aad1-71c1-9227-7e9f-8becfca49106";

@XendraTrl(Identifier="94cc3464-33ad-9279-0a60-210521d32e25")
public static String es_PE_COLUMN_Ch_Revenue_Acct_Name="Cuenta Abono";

@XendraColumn(AD_Element_ID="db1f0c15-01b7-f3d7-a879-800051f9196c",ColumnName="Ch_Revenue_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="94cc3464-33ad-9279-0a60-210521d32e25",
Synchronized="2019-08-30 22:21:21.0")
/** Column name Ch_Revenue_Acct */
public static final String COLUMNNAME_Ch_Revenue_Acct = "Ch_Revenue_Acct";
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
@XendraTrl(Identifier="9154a0ef-2782-4a99-8738-0fde9a2f8984")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9154a0ef-2782-4a99-8738-0fde9a2f8984",
Synchronized="2019-08-30 22:21:21.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
}
