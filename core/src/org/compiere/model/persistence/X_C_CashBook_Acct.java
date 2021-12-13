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
/** Generated Model for C_CashBook_Acct
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_CashBook_Acct extends PO
{
/** Standard Constructor
@param ctx context
@param C_CashBook_Acct_ID id
@param trxName transaction
*/
public X_C_CashBook_Acct (Properties ctx, int C_CashBook_Acct_ID, String trxName)
{
super (ctx, C_CashBook_Acct_ID, trxName);
/** if (C_CashBook_Acct_ID == 0)
{
setC_AcctSchema_ID (0);
setCB_Asset_Acct (0);
setCB_CashTransfer_Acct (0);
setCB_Differences_Acct (0);
setCB_Expense_Acct (0);
setCB_Receipt_Acct (0);
setC_CashBook_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_CashBook_Acct (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=409 */
public static int Table_ID=MTable.getTable_ID("C_CashBook_Acct");

@XendraTrl(Identifier="bad58c94-72c2-3c3f-10b7-b1afa5f3d9ee")
public static String es_PE_TAB_Accounting_Description="Contabilidad del Libro de Efectivo";

@XendraTrl(Identifier="bad58c94-72c2-3c3f-10b7-b1afa5f3d9ee")
public static String es_PE_TAB_Accounting_Help="La pestaña Contabilidad del Libro de Efectivo define los parámetros contables para las transacciones que involucren un libro de efectivo.";

@XendraTrl(Identifier="bad58c94-72c2-3c3f-10b7-b1afa5f3d9ee")
public static String es_PE_TAB_Accounting_Name="Contabilidad";
@XendraTab(Name="Accounting",
Description="Cashbook Accounting",
Help="The Cashbook Accounting Tab defines the accounting parameters for transaction involving a cashbook.",
AD_Window_ID="9f80de58-8dfb-e022-030e-4507c96bb137",SeqNo=20,TabLevel=1,IsSingleRow=true,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="bad58c94-72c2-3c3f-10b7-b1afa5f3d9ee",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Accounting="bad58c94-72c2-3c3f-10b7-b1afa5f3d9ee";

@XendraTrl(Identifier="24816da9-267a-b09b-c7db-0f8f541909ea")
public static String es_PE_TABLE_C_CashBook_Acct_Name="C_CashBook_Acct";

@XendraTable(Name="C_CashBook_Acct",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="C_CashBook_Acct",AccessLevel="3",AD_Window_ID="9f80de58-8dfb-e022-030e-4507c96bb137",
AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="24816da9-267a-b09b-c7db-0f8f541909ea",Synchronized="2020-03-03 21:36:41.0")
/** TableName=C_CashBook_Acct */
public static final String Table_Name="C_CashBook_Acct";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_CashBook_Acct");

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
    Table_ID = MTable.getTable_ID("C_CashBook_Acct");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_CashBook_Acct[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="af3b39a8-14df-b221-cadb-c72cdc1eacb1")
public static String es_PE_FIELD_Accounting_AccountingSchema_Name="Esquema Contable";

@XendraTrl(Identifier="af3b39a8-14df-b221-cadb-c72cdc1eacb1")
public static String es_PE_FIELD_Accounting_AccountingSchema_Description="Reglas para contabilizar";

@XendraTrl(Identifier="af3b39a8-14df-b221-cadb-c72cdc1eacb1")
public static String es_PE_FIELD_Accounting_AccountingSchema_Help="Un esquema contable define las reglas contables usadas tales como método de costeo; moneda y calendario";

@XendraField(AD_Column_ID="C_AcctSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bad58c94-72c2-3c3f-10b7-b1afa5f3d9ee",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="af3b39a8-14df-b221-cadb-c72cdc1eacb1")
public static final String FIELDNAME_Accounting_AccountingSchema="af3b39a8-14df-b221-cadb-c72cdc1eacb1";

@XendraTrl(Identifier="b7576221-5ad8-1f93-9a5b-75949be01410")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b7576221-5ad8-1f93-9a5b-75949be01410",
Synchronized="2019-08-30 22:21:19.0")
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

@XendraTrl(Identifier="cb7cf0e8-faf1-24d5-5f9e-1ce3024c0ff5")
public static String es_PE_FIELD_Accounting_CashBookAsset_Name="Cuenta de Activo del Libro de Efectivo";

@XendraTrl(Identifier="cb7cf0e8-faf1-24d5-5f9e-1ce3024c0ff5")
public static String es_PE_FIELD_Accounting_CashBookAsset_Description="Cuenta de Activo del Libro de Efectivo";

@XendraTrl(Identifier="cb7cf0e8-faf1-24d5-5f9e-1ce3024c0ff5")
public static String es_PE_FIELD_Accounting_CashBookAsset_Help="La cuenta de activo del libro de efectivo identifica la cuenta a ser usada para registrar cobros y pagos desde este libro de efectivo";

@XendraField(AD_Column_ID="CB_Asset_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="bad58c94-72c2-3c3f-10b7-b1afa5f3d9ee",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cb7cf0e8-faf1-24d5-5f9e-1ce3024c0ff5")
public static final String FIELDNAME_Accounting_CashBookAsset="cb7cf0e8-faf1-24d5-5f9e-1ce3024c0ff5";

@XendraTrl(Identifier="63baaeee-826d-c058-c524-44890d95f806")
public static String es_PE_COLUMN_CB_Asset_Acct_Name="Cuenta de Activo del Libro de Efectivo";

@XendraColumn(AD_Element_ID="7b341ac3-e99f-5886-03e2-11e1af745bda",ColumnName="CB_Asset_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="63baaeee-826d-c058-c524-44890d95f806",
Synchronized="2019-08-30 22:21:19.0")
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

@XendraTrl(Identifier="3f57af5a-0f63-0bf6-8acd-bbaad426f7c9")
public static String es_PE_FIELD_Accounting_CashTransfer_Name="Transferencia de Efectivo";

@XendraTrl(Identifier="3f57af5a-0f63-0bf6-8acd-bbaad426f7c9")
public static String es_PE_FIELD_Accounting_CashTransfer_Description="Cuenta de limpieza de transferencia de efectivo";

@XendraTrl(Identifier="3f57af5a-0f63-0bf6-8acd-bbaad426f7c9")
public static String es_PE_FIELD_Accounting_CashTransfer_Help="Cuenta para facturas pagadas en efectivo";

@XendraField(AD_Column_ID="CB_CashTransfer_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="bad58c94-72c2-3c3f-10b7-b1afa5f3d9ee",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3f57af5a-0f63-0bf6-8acd-bbaad426f7c9")
public static final String FIELDNAME_Accounting_CashTransfer="3f57af5a-0f63-0bf6-8acd-bbaad426f7c9";

@XendraTrl(Identifier="3736ac71-1787-cef5-4c04-aee344994f6b")
public static String es_PE_COLUMN_CB_CashTransfer_Acct_Name="Transferencia de Efectivo";

@XendraColumn(AD_Element_ID="cc342719-1636-2ccc-b84b-1726e559aa8b",
ColumnName="CB_CashTransfer_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3736ac71-1787-cef5-4c04-aee344994f6b",Synchronized="2019-08-30 22:21:19.0")
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

@XendraTrl(Identifier="045d1b12-1fbf-46ba-2443-353284ea8563")
public static String es_PE_FIELD_Accounting_CashBookDifferences_Name="Cuenta de Diferencias del Libro de Efectivo";

@XendraTrl(Identifier="045d1b12-1fbf-46ba-2443-353284ea8563")
public static String es_PE_FIELD_Accounting_CashBookDifferences_Description="Cuenta de Diferencias del Libro de Efectivo";

@XendraTrl(Identifier="045d1b12-1fbf-46ba-2443-353284ea8563")
public static String es_PE_FIELD_Accounting_CashBookDifferences_Help="La cuenta de diferencias en el libro de efectivo identifica la cuenta a ser usada para registrar cualquier diferencia que afecte este libro de efectivo";

@XendraField(AD_Column_ID="CB_Differences_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="bad58c94-72c2-3c3f-10b7-b1afa5f3d9ee",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="045d1b12-1fbf-46ba-2443-353284ea8563")
public static final String FIELDNAME_Accounting_CashBookDifferences="045d1b12-1fbf-46ba-2443-353284ea8563";

@XendraTrl(Identifier="612762af-6cca-8270-136e-19123ae03b97")
public static String es_PE_COLUMN_CB_Differences_Acct_Name="Cuenta de Diferencias del Libro de Efectivo";

@XendraColumn(AD_Element_ID="67449829-1714-b645-815c-524e4e927b13",
ColumnName="CB_Differences_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="612762af-6cca-8270-136e-19123ae03b97",Synchronized="2019-08-30 22:21:19.0")
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

@XendraTrl(Identifier="25e8ff9e-0a51-22b5-f9da-4b09a00cb928")
public static String es_PE_FIELD_Accounting_CashBookExpense_Name="Cuenta de Gastos del Libro de Efectivo";

@XendraTrl(Identifier="25e8ff9e-0a51-22b5-f9da-4b09a00cb928")
public static String es_PE_FIELD_Accounting_CashBookExpense_Description="Cuenta de gastos del libro de efectivo";

@XendraTrl(Identifier="25e8ff9e-0a51-22b5-f9da-4b09a00cb928")
public static String es_PE_FIELD_Accounting_CashBookExpense_Help="La cuenta de gastos del libro de efectivo identifica la cuenta a ser usada para registrar gastos generales sin partidas";

@XendraField(AD_Column_ID="CB_Expense_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="bad58c94-72c2-3c3f-10b7-b1afa5f3d9ee",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="25e8ff9e-0a51-22b5-f9da-4b09a00cb928")
public static final String FIELDNAME_Accounting_CashBookExpense="25e8ff9e-0a51-22b5-f9da-4b09a00cb928";

@XendraTrl(Identifier="a053f6f5-8703-908f-d372-6a2b2c29f6db")
public static String es_PE_COLUMN_CB_Expense_Acct_Name="Cuenta de Gastos del Libro de Efectivo";

@XendraColumn(AD_Element_ID="be4ae1a2-6f4b-44c1-91ff-0e308db88cc4",ColumnName="CB_Expense_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a053f6f5-8703-908f-d372-6a2b2c29f6db",
Synchronized="2019-08-30 22:21:19.0")
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

@XendraTrl(Identifier="3b439592-5514-eede-de41-2a0fa247e58b")
public static String es_PE_FIELD_Accounting_CashBookReceipt_Name="Cuenta de Ingresos del Libro de Efectivo";

@XendraTrl(Identifier="3b439592-5514-eede-de41-2a0fa247e58b")
public static String es_PE_FIELD_Accounting_CashBookReceipt_Description="Cuenta de Ingresos del libro de efectivo";

@XendraTrl(Identifier="3b439592-5514-eede-de41-2a0fa247e58b")
public static String es_PE_FIELD_Accounting_CashBookReceipt_Help="La cuenta de Ingresos del libro de efectivo identifica la cuenta a ser usada para ingresos generales sin partidas en el libro de ingresos";

@XendraField(AD_Column_ID="CB_Receipt_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="bad58c94-72c2-3c3f-10b7-b1afa5f3d9ee",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3b439592-5514-eede-de41-2a0fa247e58b")
public static final String FIELDNAME_Accounting_CashBookReceipt="3b439592-5514-eede-de41-2a0fa247e58b";

@XendraTrl(Identifier="2a226ac5-5d1b-22ea-707a-0adf53005669")
public static String es_PE_COLUMN_CB_Receipt_Acct_Name="Cuenta de Ingresos del Libro de Efectivo";

@XendraColumn(AD_Element_ID="8595fb4a-ac4f-ec51-e6a0-0be94935e1b7",ColumnName="CB_Receipt_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2a226ac5-5d1b-22ea-707a-0adf53005669",
Synchronized="2019-08-30 22:21:19.0")
/** Column name CB_Receipt_Acct */
public static final String COLUMNNAME_CB_Receipt_Acct = "CB_Receipt_Acct";
/** Set Cash Book.
@param C_CashBook_ID Cash Book for recording petty cash transactions */
public void setC_CashBook_ID (int C_CashBook_ID)
{
if (C_CashBook_ID < 1) throw new IllegalArgumentException ("C_CashBook_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_CashBook_ID, Integer.valueOf(C_CashBook_ID));
}
/** Get Cash Book.
@return Cash Book for recording petty cash transactions */
public int getC_CashBook_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_CashBook_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ee938832-a6c0-8fe6-5624-e4c00cf5037d")
public static String es_PE_FIELD_Accounting_CashBook_Name="Libro de Efectivo";

@XendraTrl(Identifier="ee938832-a6c0-8fe6-5624-e4c00cf5037d")
public static String es_PE_FIELD_Accounting_CashBook_Description="Libro de efectivo para registrar transacciones de caja chica.";

@XendraTrl(Identifier="ee938832-a6c0-8fe6-5624-e4c00cf5037d")
public static String es_PE_FIELD_Accounting_CashBook_Help="El libro de efectivo identifica un libro de efectivo único. El libro de efectivo se usa para registrar transacciones de efectivo.";

@XendraField(AD_Column_ID="C_CashBook_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bad58c94-72c2-3c3f-10b7-b1afa5f3d9ee",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ee938832-a6c0-8fe6-5624-e4c00cf5037d")
public static final String FIELDNAME_Accounting_CashBook="ee938832-a6c0-8fe6-5624-e4c00cf5037d";

@XendraTrl(Identifier="ddc3b5d0-cecd-3abb-4adf-b866ab454f7a")
public static String es_PE_COLUMN_C_CashBook_ID_Name="Libro de Efectivo";

@XendraColumn(AD_Element_ID="30688c51-d454-8026-32c4-990b9ea9ddf2",ColumnName="C_CashBook_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ddc3b5d0-cecd-3abb-4adf-b866ab454f7a",
Synchronized="2019-08-30 22:21:19.0")
/** Column name C_CashBook_ID */
public static final String COLUMNNAME_C_CashBook_ID = "C_CashBook_ID";
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
@XendraTrl(Identifier="2ed15310-673c-488c-8673-98a072021c37")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2ed15310-673c-488c-8673-98a072021c37",
Synchronized="2019-08-30 22:21:19.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
}
