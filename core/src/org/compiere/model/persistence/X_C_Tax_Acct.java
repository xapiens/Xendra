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
/** Generated Model for C_Tax_Acct
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Tax_Acct extends PO
{
/** Standard Constructor
@param ctx context
@param C_Tax_Acct_ID id
@param trxName transaction
*/
public X_C_Tax_Acct (Properties ctx, int C_Tax_Acct_ID, String trxName)
{
super (ctx, C_Tax_Acct_ID, trxName);
/** if (C_Tax_Acct_ID == 0)
{
setC_AcctSchema_ID (0);
setC_Tax_ID (0);
setT_Credit_Acct (0);
setT_Due_Acct (0);
setT_Expense_Acct (0);
setT_Liability_Acct (0);
setT_Receivables_Acct (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_Tax_Acct (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=399 */
public static int Table_ID=MTable.getTable_ID("C_Tax_Acct");

@XendraTrl(Identifier="87c0c52a-7f66-dde4-6f07-623ef6f7c1d1")
public static String es_PE_TAB_Accounting_Description="Contabilidad";

@XendraTrl(Identifier="87c0c52a-7f66-dde4-6f07-623ef6f7c1d1")
public static String es_PE_TAB_Accounting_Name="Contabilidad";

@XendraTrl(Identifier="87c0c52a-7f66-dde4-6f07-623ef6f7c1d1")
public static String es_PE_TAB_Accounting_Help="La pestaña Contabilidad define los parámetros contables que son usados en transacciones que usen esta tasa de impuestos.";

@XendraTab(Name="Accounting",Description="Accounting",
Help="The Accounting Tab defines the accounting parameters to be used for transactions referencing this Tax Rate.",
AD_Window_ID="738fa9ed-8c68-6bf1-79fe-8963640b6a8b",SeqNo=40,TabLevel=1,IsSingleRow=true,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="87c0c52a-7f66-dde4-6f07-623ef6f7c1d1",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Accounting="87c0c52a-7f66-dde4-6f07-623ef6f7c1d1";

@XendraTrl(Identifier="111fbf70-5e14-00a0-8e64-399e8b293097")
public static String es_PE_TABLE_C_Tax_Acct_Name="C_Tax_Acct";

@XendraTable(Name="C_Tax_Acct",Description="",Help="",TableName="C_Tax_Acct",AccessLevel="3",
AD_Window_ID="738fa9ed-8c68-6bf1-79fe-8963640b6a8b",AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="111fbf70-5e14-00a0-8e64-399e8b293097",
Synchronized="2017-08-16 11:42:31.0")
/** TableName=C_Tax_Acct */
public static final String Table_Name="C_Tax_Acct";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Tax_Acct");

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
    Table_ID = MTable.getTable_ID("C_Tax_Acct");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Tax_Acct[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="b12a8bf9-7aac-b180-2a26-74e9ad3d9979")
public static String es_PE_FIELD_Accounting_AccountingSchema_Description="Reglas para contabilizar";

@XendraTrl(Identifier="b12a8bf9-7aac-b180-2a26-74e9ad3d9979")
public static String es_PE_FIELD_Accounting_AccountingSchema_Help="Un esquema contable define las reglas contables usadas tales como método de costeo; moneda y calendario";

@XendraTrl(Identifier="b12a8bf9-7aac-b180-2a26-74e9ad3d9979")
public static String es_PE_FIELD_Accounting_AccountingSchema_Name="Esquema Contable";

@XendraField(AD_Column_ID="C_AcctSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="87c0c52a-7f66-dde4-6f07-623ef6f7c1d1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b12a8bf9-7aac-b180-2a26-74e9ad3d9979")
public static final String FIELDNAME_Accounting_AccountingSchema="b12a8bf9-7aac-b180-2a26-74e9ad3d9979";

@XendraTrl(Identifier="902f45bc-004e-aa2c-e098-9433f7c4ca38")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="902f45bc-004e-aa2c-e098-9433f7c4ca38",
Synchronized="2017-08-05 16:54:28.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
/** Set Tax.
@param C_Tax_ID Tax identifier */
public void setC_Tax_ID (int C_Tax_ID)
{
if (C_Tax_ID < 1) throw new IllegalArgumentException ("C_Tax_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Tax_ID, Integer.valueOf(C_Tax_ID));
}
/** Get Tax.
@return Tax identifier */
public int getC_Tax_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Tax_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="019ed90e-7daa-428e-d00e-9f1c7ffb848e")
public static String es_PE_FIELD_Accounting_Tax_Description="Identificador del Impuesto";

@XendraTrl(Identifier="019ed90e-7daa-428e-d00e-9f1c7ffb848e")
public static String es_PE_FIELD_Accounting_Tax_Help="El Impuesto indica el tipo de impuesto para esta línea del documento";

@XendraTrl(Identifier="019ed90e-7daa-428e-d00e-9f1c7ffb848e")
public static String es_PE_FIELD_Accounting_Tax_Name="Impuesto";

@XendraField(AD_Column_ID="C_Tax_ID",IsCentrallyMaintained=true,
AD_Tab_ID="87c0c52a-7f66-dde4-6f07-623ef6f7c1d1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="019ed90e-7daa-428e-d00e-9f1c7ffb848e")
public static final String FIELDNAME_Accounting_Tax="019ed90e-7daa-428e-d00e-9f1c7ffb848e";

@XendraTrl(Identifier="2647509a-f344-3edc-37b5-e05f69482d29")
public static String es_PE_COLUMN_C_Tax_ID_Name="Impuesto";

@XendraColumn(AD_Element_ID="38ff24fc-b68c-51a9-60f8-ef2a1f060de2",ColumnName="C_Tax_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2647509a-f344-3edc-37b5-e05f69482d29",
Synchronized="2017-08-05 16:54:28.0")
/** Column name C_Tax_ID */
public static final String COLUMNNAME_C_Tax_ID = "C_Tax_ID";
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
@XendraTrl(Identifier="67de51b0-6eb1-466f-b9b2-e78a7fa43589")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="67de51b0-6eb1-466f-b9b2-e78a7fa43589",
Synchronized="2017-08-05 16:54:28.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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

@XendraTrl(Identifier="8526ebb1-ecb8-0a69-637c-16697cb9845f")
public static String es_PE_FIELD_Accounting_TaxCredit_Description="Cuenta para impuestos a reclamar";

@XendraTrl(Identifier="8526ebb1-ecb8-0a69-637c-16697cb9845f")
public static String es_PE_FIELD_Accounting_TaxCredit_Help="La cuenta de Impuesto por Acreditar indica la cuenta usada para acumular impuestos que pueden ser reclamados";

@XendraTrl(Identifier="8526ebb1-ecb8-0a69-637c-16697cb9845f")
public static String es_PE_FIELD_Accounting_TaxCredit_Name="Impuesto por Acreditar";

@XendraField(AD_Column_ID="T_Credit_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="87c0c52a-7f66-dde4-6f07-623ef6f7c1d1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8526ebb1-ecb8-0a69-637c-16697cb9845f")
public static final String FIELDNAME_Accounting_TaxCredit="8526ebb1-ecb8-0a69-637c-16697cb9845f";

@XendraTrl(Identifier="650b9130-108e-99ba-f50a-0d99b5d4029b")
public static String es_PE_COLUMN_T_Credit_Acct_Name="Impuesto por Acreditar";

@XendraColumn(AD_Element_ID="095c9c14-fb7e-cdcc-055a-438a2629969e",ColumnName="T_Credit_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="650b9130-108e-99ba-f50a-0d99b5d4029b",
Synchronized="2017-08-05 16:54:28.0")
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

@XendraTrl(Identifier="7f51a565-c211-ffdb-50df-8eecd29c0a70")
public static String es_PE_FIELD_Accounting_TaxDue_Description="Cuenta para impuestos a pagar.";

@XendraTrl(Identifier="7f51a565-c211-ffdb-50df-8eecd29c0a70")
public static String es_PE_FIELD_Accounting_TaxDue_Help="La cuenta de impuestos por pagar indica la cuenta usada para acumular impuestos que se deben pagar.";

@XendraTrl(Identifier="7f51a565-c211-ffdb-50df-8eecd29c0a70")
public static String es_PE_FIELD_Accounting_TaxDue_Name="Impuestos por pagar";

@XendraField(AD_Column_ID="T_Due_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="87c0c52a-7f66-dde4-6f07-623ef6f7c1d1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7f51a565-c211-ffdb-50df-8eecd29c0a70")
public static final String FIELDNAME_Accounting_TaxDue="7f51a565-c211-ffdb-50df-8eecd29c0a70";

@XendraTrl(Identifier="8353aca6-62e9-f315-8d63-eafebbe7674c")
public static String es_PE_COLUMN_T_Due_Acct_Name="Impuestos por pagar";

@XendraColumn(AD_Element_ID="fd2e9a6b-7cbb-5efc-ff3d-20d027aafa24",ColumnName="T_Due_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8353aca6-62e9-f315-8d63-eafebbe7674c",
Synchronized="2017-08-05 16:54:28.0")
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

@XendraTrl(Identifier="e448918b-fd92-024f-6b13-2b40ab3870d3")
public static String es_PE_FIELD_Accounting_TaxExpense_Description="Cuenta para impuestos pagados que usted no puede reclamar";

@XendraTrl(Identifier="e448918b-fd92-024f-6b13-2b40ab3870d3")
public static String es_PE_FIELD_Accounting_TaxExpense_Help="La cuenta de impuestos absorbidos indica la cuenta usada para registrar los impuestos que han sido pagados y que no pueden ser reclamados.";

@XendraTrl(Identifier="e448918b-fd92-024f-6b13-2b40ab3870d3")
public static String es_PE_FIELD_Accounting_TaxExpense_Name="Impuesto Absorbido";

@XendraField(AD_Column_ID="T_Expense_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="87c0c52a-7f66-dde4-6f07-623ef6f7c1d1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e448918b-fd92-024f-6b13-2b40ab3870d3")
public static final String FIELDNAME_Accounting_TaxExpense="e448918b-fd92-024f-6b13-2b40ab3870d3";

@XendraTrl(Identifier="ab42d875-ce5f-0db1-7bd5-9f7528667e08")
public static String es_PE_COLUMN_T_Expense_Acct_Name="Impuesto Absorbido";

@XendraColumn(AD_Element_ID="885dc125-8497-8762-0b24-50e38967b975",ColumnName="T_Expense_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ab42d875-ce5f-0db1-7bd5-9f7528667e08",
Synchronized="2017-08-05 16:54:28.0")
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

@XendraTrl(Identifier="8a7d9f24-2992-122f-886b-288a0a954f20")
public static String es_PE_FIELD_Accounting_TaxLiability_Description="Cuenta para declaración de impuesto pagado";

@XendraTrl(Identifier="8a7d9f24-2992-122f-886b-288a0a954f20")
public static String es_PE_FIELD_Accounting_TaxLiability_Help="La cuenta de impuesto pagado indica la cuenta usada para registrar su declaración de responsabilidad de impuestos";

@XendraTrl(Identifier="8a7d9f24-2992-122f-886b-288a0a954f20")
public static String es_PE_FIELD_Accounting_TaxLiability_Name="Impuesto Pagado";

@XendraField(AD_Column_ID="T_Liability_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="87c0c52a-7f66-dde4-6f07-623ef6f7c1d1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8a7d9f24-2992-122f-886b-288a0a954f20")
public static final String FIELDNAME_Accounting_TaxLiability="8a7d9f24-2992-122f-886b-288a0a954f20";

@XendraTrl(Identifier="fda5feb2-6365-f42b-189d-def3eace0555")
public static String es_PE_COLUMN_T_Liability_Acct_Name="Impuesto Pagado";

@XendraColumn(AD_Element_ID="6241aa76-5324-6039-cfff-fd749887dde9",ColumnName="T_Liability_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fda5feb2-6365-f42b-189d-def3eace0555",
Synchronized="2017-08-05 16:54:28.0")
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

@XendraTrl(Identifier="c14eea53-c077-029d-7db3-4e0e106e4640")
public static String es_PE_FIELD_Accounting_TaxReceivables_Description="Cuenta de Impuesto acreditado después de la declaración de impuestos";

@XendraTrl(Identifier="c14eea53-c077-029d-7db3-4e0e106e4640")
public static String es_PE_FIELD_Accounting_TaxReceivables_Help="Cuenta de Impuesto acreditado después de la declaración de impuestos";

@XendraTrl(Identifier="c14eea53-c077-029d-7db3-4e0e106e4640")
public static String es_PE_FIELD_Accounting_TaxReceivables_Name="Impuesto Acreditado";

@XendraField(AD_Column_ID="T_Receivables_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="87c0c52a-7f66-dde4-6f07-623ef6f7c1d1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c14eea53-c077-029d-7db3-4e0e106e4640")
public static final String FIELDNAME_Accounting_TaxReceivables="c14eea53-c077-029d-7db3-4e0e106e4640";

@XendraTrl(Identifier="2f791bbc-ffd4-2361-ee53-2ba9503b20b1")
public static String es_PE_COLUMN_T_Receivables_Acct_Name="Impuesto Acreditado";

@XendraColumn(AD_Element_ID="b34be93f-75e3-1890-1f1f-c8408ea709ee",ColumnName="T_Receivables_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2f791bbc-ffd4-2361-ee53-2ba9503b20b1",
Synchronized="2017-08-05 16:54:28.0")
/** Column name T_Receivables_Acct */
public static final String COLUMNNAME_T_Receivables_Acct = "T_Receivables_Acct";
}
