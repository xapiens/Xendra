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
/** Generated Model for C_BP_Employee_Acct
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_BP_Employee_Acct extends PO
{
/** Standard Constructor
@param ctx context
@param C_BP_Employee_Acct_ID id
@param trxName transaction
*/
public X_C_BP_Employee_Acct (Properties ctx, int C_BP_Employee_Acct_ID, String trxName)
{
super (ctx, C_BP_Employee_Acct_ID, trxName);
/** if (C_BP_Employee_Acct_ID == 0)
{
setC_AcctSchema_ID (0);
setC_BPartner_ID (0);
setE_Expense_Acct (0);
setE_Prepayment_Acct (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_BP_Employee_Acct (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=184 */
public static int Table_ID=MTable.getTable_ID("C_BP_Employee_Acct");

@XendraTrl(Identifier="ffd6162a-abc2-87c8-c476-ea11aec77117")
public static String es_PE_TAB_EmployeeAccounting_Description="Definir Contabilidad del Empleado";

@XendraTrl(Identifier="ffd6162a-abc2-87c8-c476-ea11aec77117")
public static String es_PE_TAB_EmployeeAccounting_Help="La pestaña de Contabilidad del Empleado define los valores predeterminados usados cuando este socio de negocio es seleccionado para transacciones de reembolso de gastos.";

@XendraTrl(Identifier="ffd6162a-abc2-87c8-c476-ea11aec77117")
public static String es_PE_TAB_EmployeeAccounting_Name="Contabilidad del Empleado";

@XendraTab(Name="Employee Accounting",Description="Define Employee Accounting",
Help="The Employee Accounting Tab defines the default accounts to use when this business partner is referenced on a expense reimbursement.",
AD_Window_ID="273719a2-ec2e-9b44-d30b-014c7ec70d0e",SeqNo=70,TabLevel=2,IsSingleRow=true,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="dc36f0ab-ac48-7e6f-967d-9957745d386c",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="ffd6162a-abc2-87c8-c476-ea11aec77117",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_EmployeeAccounting="ffd6162a-abc2-87c8-c476-ea11aec77117";

@XendraTrl(Identifier="863b4a66-919a-d847-c44e-a28c3f244675")
public static String es_PE_TABLE_C_BP_Employee_Acct_Name="C_BP_Employee_Acct";

@XendraTable(Name="C_BP_Employee_Acct",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="C_BP_Employee_Acct",AccessLevel="3",AD_Window_ID="273719a2-ec2e-9b44-d30b-014c7ec70d0e",
AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="863b4a66-919a-d847-c44e-a28c3f244675",Synchronized="2020-03-03 21:36:38.0")
/** TableName=C_BP_Employee_Acct */
public static final String Table_Name="C_BP_Employee_Acct";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_BP_Employee_Acct");

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
    Table_ID = MTable.getTable_ID("C_BP_Employee_Acct");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_BP_Employee_Acct[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="b9ea28cd-7b24-282e-0388-20f80598d509")
public static String es_PE_FIELD_EmployeeAccounting_AccountingSchema_Name="Esquema Contable";

@XendraTrl(Identifier="b9ea28cd-7b24-282e-0388-20f80598d509")
public static String es_PE_FIELD_EmployeeAccounting_AccountingSchema_Description="Reglas para contabilizar";

@XendraTrl(Identifier="b9ea28cd-7b24-282e-0388-20f80598d509")
public static String es_PE_FIELD_EmployeeAccounting_AccountingSchema_Help="Un esquema contable define las reglas contables usadas tales como método de costeo; moneda y calendario";

@XendraField(AD_Column_ID="C_AcctSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ffd6162a-abc2-87c8-c476-ea11aec77117",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b9ea28cd-7b24-282e-0388-20f80598d509")
public static final String FIELDNAME_EmployeeAccounting_AccountingSchema="b9ea28cd-7b24-282e-0388-20f80598d509";

@XendraTrl(Identifier="0a4c6a4c-0297-c525-8465-0d3395ed7e10")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0a4c6a4c-0297-c525-8465-0d3395ed7e10",
Synchronized="2019-08-30 22:21:15.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID < 1) throw new IllegalArgumentException ("C_BPartner_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
}
/** Get Business Partner .
@return Identifies a Business Partner */
public int getC_BPartner_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="305d5da6-aebe-7634-878a-af212be87296")
public static String es_PE_FIELD_EmployeeAccounting_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="305d5da6-aebe-7634-878a-af212be87296")
public static String es_PE_FIELD_EmployeeAccounting_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="305d5da6-aebe-7634-878a-af212be87296")
public static String es_PE_FIELD_EmployeeAccounting_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ffd6162a-abc2-87c8-c476-ea11aec77117",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="305d5da6-aebe-7634-878a-af212be87296")
public static final String FIELDNAME_EmployeeAccounting_BusinessPartner="305d5da6-aebe-7634-878a-af212be87296";

@XendraTrl(Identifier="dc36f0ab-ac48-7e6f-967d-9957745d386c")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dc36f0ab-ac48-7e6f-967d-9957745d386c",
Synchronized="2019-08-30 22:21:15.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
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

@XendraTrl(Identifier="2db6a84f-f55b-6209-5044-0a971034a76e")
public static String es_PE_FIELD_EmployeeAccounting_EmployeeExpense_Name="Gastos de Empleados";

@XendraTrl(Identifier="2db6a84f-f55b-6209-5044-0a971034a76e")
public static String es_PE_FIELD_EmployeeAccounting_EmployeeExpense_Description="Cuenta para gastos de empleados";

@XendraTrl(Identifier="2db6a84f-f55b-6209-5044-0a971034a76e")
public static String es_PE_FIELD_EmployeeAccounting_EmployeeExpense_Help="La Cuenta de Gastos de empleados identifica la cuenta a usar para registrar gastos para este empleado";

@XendraField(AD_Column_ID="E_Expense_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="ffd6162a-abc2-87c8-c476-ea11aec77117",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2db6a84f-f55b-6209-5044-0a971034a76e")
public static final String FIELDNAME_EmployeeAccounting_EmployeeExpense="2db6a84f-f55b-6209-5044-0a971034a76e";

@XendraTrl(Identifier="a9fbbd61-e8d7-a537-dfc4-a91f832ccfc2")
public static String es_PE_COLUMN_E_Expense_Acct_Name="Gastos de Empleados";

@XendraColumn(AD_Element_ID="c3b9a2f6-e4f8-d6fe-d356-df5e7508c46d",ColumnName="E_Expense_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a9fbbd61-e8d7-a537-dfc4-a91f832ccfc2",
Synchronized="2019-08-30 22:21:15.0")
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

@XendraTrl(Identifier="7b504d28-b058-f0ea-be7a-fa5d5a966129")
public static String es_PE_FIELD_EmployeeAccounting_EmployeePrepayment_Name="Pago Anticipado a Empleados";

@XendraTrl(Identifier="7b504d28-b058-f0ea-be7a-fa5d5a966129")
public static String es_PE_FIELD_EmployeeAccounting_EmployeePrepayment_Description="Cuenta para pagos anticipados a empleados";

@XendraTrl(Identifier="7b504d28-b058-f0ea-be7a-fa5d5a966129")
public static String es_PE_FIELD_EmployeeAccounting_EmployeePrepayment_Help="La cuenta de anticipos a empleados identifica la cuenta a usar para registrar anticipos de gastos hechos a este empleado.";

@XendraField(AD_Column_ID="E_Prepayment_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="ffd6162a-abc2-87c8-c476-ea11aec77117",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7b504d28-b058-f0ea-be7a-fa5d5a966129")
public static final String FIELDNAME_EmployeeAccounting_EmployeePrepayment="7b504d28-b058-f0ea-be7a-fa5d5a966129";

@XendraTrl(Identifier="c216c249-1b24-cc17-e6b8-8aee84b153a2")
public static String es_PE_COLUMN_E_Prepayment_Acct_Name="Pago Anticipado a Empleados";

@XendraColumn(AD_Element_ID="6564c32b-763e-332c-1529-86be89fc3a9d",ColumnName="E_Prepayment_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c216c249-1b24-cc17-e6b8-8aee84b153a2",
Synchronized="2019-08-30 22:21:15.0")
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
@XendraTrl(Identifier="8e5261fe-9ce4-42ee-88bd-1553191d5e7b")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8e5261fe-9ce4-42ee-88bd-1553191d5e7b",
Synchronized="2019-08-30 22:21:15.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
}
