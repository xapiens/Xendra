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
/** Generated Model for C_POS
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: X_C_POS.java 7177 2020-04-01 22:57:17Z xapiens $ */
public class X_C_POS extends PO
{
/** Standard Constructor
@param ctx context
@param C_POS_ID id
@param trxName transaction
*/
public X_C_POS (Properties ctx, int C_POS_ID, String trxName)
{
super (ctx, C_POS_ID, trxName);
/** if (C_POS_ID == 0)
{
setCash_C_PaymentTerm_ID (0);
setC_CashBook_ID (0);
setC_POS_ID (0);
setCredit_C_PaymentTerm_ID (0);
setM_Warehouse_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_POS (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=748 */
public static int Table_ID=MTable.getTable_ID("C_POS");

@XendraTrl(Identifier="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e")
public static String es_PE_TAB_POSTerminal_Description="Terminal de Punto de Venta";

@XendraTrl(Identifier="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e")
public static String es_PE_TAB_POSTerminal_Help="La Terminal de PV define los defaults y las funciones disponibles para las formas de PV";

@XendraTrl(Identifier="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e")
public static String es_PE_TAB_POSTerminal_Name="Terminal PV";
@XendraTab(Name="POS Terminal",
Description="Point of Sales Terminal",
Help="The POS Terminal defines the defaults and functions available for the POS Form",
AD_Window_ID="8c97af02-7083-d71f-40f0-ef227a57d420",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_POSTerminal="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e";

@XendraTrl(Identifier="1002a4e2-215f-c476-1fce-6c14634938fd")
public static String es_PE_TABLE_C_POS_Name="Terminal PDV";

@XendraTable(Name="POS Terminal",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Point of Sales Terminal",Help="",
TableName="C_POS",AccessLevel="2",AD_Window_ID="8c97af02-7083-d71f-40f0-ef227a57d420",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="1002a4e2-215f-c476-1fce-6c14634938fd",Synchronized="2020-03-28 17:24:42.0")
/** TableName=C_POS */
public static final String Table_Name="C_POS";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_POS");

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
    Table_ID = MTable.getTable_ID("C_POS");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_POS[").append(get_ID()).append("]");
return sb.toString();
}
/** Set AD_LP.
@param AD_LP_ID AD_LP */
public void setAD_LP_ID (int AD_LP_ID)
{
if (AD_LP_ID <= 0) set_Value (COLUMNNAME_AD_LP_ID, null);
 else 
set_Value (COLUMNNAME_AD_LP_ID, Integer.valueOf(AD_LP_ID));
}
/** Get AD_LP.
@return AD_LP */
public int getAD_LP_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_LP_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="414aad26-93a8-49f6-b22f-821a75fb691b")
public static String es_PE_COLUMN_AD_LP_ID_Name="AD_LP";

@XendraColumn(AD_Element_ID="39947037-5348-b16e-b241-319fa2519dbf",ColumnName="AD_LP_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="414aad26-93a8-49f6-b22f-821a75fb691b",
Synchronized="2020-03-27 23:42:35.0")
/** Column name AD_LP_ID */
public static final String COLUMNNAME_AD_LP_ID = "AD_LP_ID";
/** Set AD_Rule_ID.
@param AD_Rule_ID AD_Rule_ID */
public void setAD_Rule_ID (int AD_Rule_ID)
{
if (AD_Rule_ID <= 0) set_Value (COLUMNNAME_AD_Rule_ID, null);
 else 
set_Value (COLUMNNAME_AD_Rule_ID, Integer.valueOf(AD_Rule_ID));
}
/** Get AD_Rule_ID.
@return AD_Rule_ID */
public int getAD_Rule_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Rule_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ec4cd2ee-af72-4a42-b33a-9615496a1870")
public static String es_PE_FIELD_POSTerminal_AD_Rule_ID_Name="Rule";

@XendraField(AD_Column_ID="AD_Rule_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=290,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-01-10 15:10:01.0",
Identifier="ec4cd2ee-af72-4a42-b33a-9615496a1870")
public static final String FIELDNAME_POSTerminal_AD_Rule_ID="ec4cd2ee-af72-4a42-b33a-9615496a1870";

@XendraTrl(Identifier="695d0d76-c85d-4c06-9462-3c9b1c063615")
public static String es_PE_COLUMN_AD_Rule_ID_Name="AD_Rule_ID";

@XendraColumn(AD_Element_ID="4b4afdeb-6aca-d182-6e3a-83f0f6d29f7d",ColumnName="AD_Rule_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="695d0d76-c85d-4c06-9462-3c9b1c063615",
Synchronized="2020-03-27 23:42:36.0")
/** Column name AD_Rule_ID */
public static final String COLUMNNAME_AD_Rule_ID = "AD_Rule_ID";
/** Set Machine .
@param A_Machine_ID Machine  */
public void setA_Machine_ID (int A_Machine_ID)
{
if (A_Machine_ID <= 0) set_Value (COLUMNNAME_A_Machine_ID, null);
 else 
set_Value (COLUMNNAME_A_Machine_ID, Integer.valueOf(A_Machine_ID));
}
/** Get Machine .
@return Machine  */
public int getA_Machine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_A_Machine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a13b4e12-4d25-4815-b290-a0234a8f8627")
public static String es_PE_FIELD_POSTerminal_Machine_Name="Machine ";

@XendraField(AD_Column_ID="A_Machine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=370,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2020-03-27 23:42:36.0",
Identifier="a13b4e12-4d25-4815-b290-a0234a8f8627")
public static final String FIELDNAME_POSTerminal_Machine="a13b4e12-4d25-4815-b290-a0234a8f8627";

@XendraTrl(Identifier="29d46b72-115d-457d-a49e-8cdf08a1ec98")
public static String es_PE_COLUMN_A_Machine_ID_Name="Machine ";

@XendraColumn(AD_Element_ID="5ca659c9-c8cc-4dd1-8e7c-ddc2fe399392",ColumnName="A_Machine_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="29d46b72-115d-457d-a49e-8cdf08a1ec98",
Synchronized="2020-03-27 23:42:36.0")
/** Column name A_Machine_ID */
public static final String COLUMNNAME_A_Machine_ID = "A_Machine_ID";
/** Set Cash_C_DocType_ID.
@param Cash_C_DocType_ID Cash_C_DocType_ID */
public void setCash_C_DocType_ID (int Cash_C_DocType_ID)
{
if (Cash_C_DocType_ID <= 0) set_Value (COLUMNNAME_Cash_C_DocType_ID, null);
 else 
set_Value (COLUMNNAME_Cash_C_DocType_ID, Integer.valueOf(Cash_C_DocType_ID));
}
/** Get Cash_C_DocType_ID.
@return Cash_C_DocType_ID */
public int getCash_C_DocType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Cash_C_DocType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a2ea8385-baff-4ca7-8484-b18fe08cb994")
public static String es_PE_FIELD_POSTerminal_Cash_C_DocType_ID_Name="cash_c_doctype_id";

@XendraField(AD_Column_ID="Cash_C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=300,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2020-03-27 23:42:36.0",
Identifier="a2ea8385-baff-4ca7-8484-b18fe08cb994")
public static final String FIELDNAME_POSTerminal_Cash_C_DocType_ID="a2ea8385-baff-4ca7-8484-b18fe08cb994";

@XendraTrl(Identifier="49790464-59a4-4296-b7e4-c31f0b3f3717")
public static String es_PE_COLUMN_Cash_C_DocType_ID_Name="cash_c_doctype_id";

@XendraColumn(AD_Element_ID="17cac859-cb87-4e0a-982c-9e96f6114a68",ColumnName="Cash_C_DocType_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="f7d19288-4a1e-407f-8a64-1d3b8c4127a6",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="49790464-59a4-4296-b7e4-c31f0b3f3717",Synchronized="2020-03-27 23:42:36.0")
/** Column name Cash_C_DocType_ID */
public static final String COLUMNNAME_Cash_C_DocType_ID = "Cash_C_DocType_ID";
/** Set CashCountPassword.
@param CashCountPassword CashCountPassword */
public void setCashCountPassword (String CashCountPassword)
{
if (CashCountPassword != null && CashCountPassword.length() > 40)
{
log.warning("Length > 40 - truncated");
CashCountPassword = CashCountPassword.substring(0,39);
}
set_Value (COLUMNNAME_CashCountPassword, CashCountPassword);
}
/** Get CashCountPassword.
@return CashCountPassword */
public String getCashCountPassword() 
{
String value = (String)get_Value(COLUMNNAME_CashCountPassword);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="e80b95ef-c8c9-47c3-8c78-4abad651d35f")
public static String es_PE_FIELD_POSTerminal_CashCountPassword_Name="Password Cierre de Caja";

@XendraField(AD_Column_ID="CashCountPassword",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="Access",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=330,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2020-03-27 23:42:36.0",
Identifier="e80b95ef-c8c9-47c3-8c78-4abad651d35f")
public static final String FIELDNAME_POSTerminal_CashCountPassword="e80b95ef-c8c9-47c3-8c78-4abad651d35f";

@XendraTrl(Identifier="8ddd6067-f158-4a4d-995e-ce2bce9880ec")
public static String es_PE_COLUMN_CashCountPassword_Name="Password Cierre de Caja";

@XendraColumn(AD_Element_ID="1f31a645-ae73-4123-8a5c-7209924a0e91",ColumnName="CashCountPassword",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8ddd6067-f158-4a4d-995e-ce2bce9880ec",
Synchronized="2020-03-27 23:42:36.0")
/** Column name CashCountPassword */
public static final String COLUMNNAME_CashCountPassword = "CashCountPassword";
/** Set Cash_C_PaymentTerm_ID.
@param Cash_C_PaymentTerm_ID Cash_C_PaymentTerm_ID */
public void setCash_C_PaymentTerm_ID (int Cash_C_PaymentTerm_ID)
{
if (Cash_C_PaymentTerm_ID < 1) throw new IllegalArgumentException ("Cash_C_PaymentTerm_ID is mandatory.");
set_Value (COLUMNNAME_Cash_C_PaymentTerm_ID, Integer.valueOf(Cash_C_PaymentTerm_ID));
}
/** Get Cash_C_PaymentTerm_ID.
@return Cash_C_PaymentTerm_ID */
public int getCash_C_PaymentTerm_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Cash_C_PaymentTerm_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4c963a94-bc58-368e-3ef7-b02344d37b87")
public static String es_PE_FIELD_POSTerminal_Cash_C_PaymentTerm_ID_Name="Término de Pago - Contado";

@XendraField(AD_Column_ID="Cash_C_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="Bank",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4c963a94-bc58-368e-3ef7-b02344d37b87")
public static final String FIELDNAME_POSTerminal_Cash_C_PaymentTerm_ID="4c963a94-bc58-368e-3ef7-b02344d37b87";

@XendraTrl(Identifier="ac79a374-c212-4698-d85d-0201fa331f48")
public static String es_PE_COLUMN_Cash_C_PaymentTerm_ID_Name="cash_c_paymentterm_id";

@XendraColumn(AD_Element_ID="ae9db08d-5878-cf01-861b-b132a9f9f1c8",
ColumnName="Cash_C_PaymentTerm_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="270bb22c-6cc2-0c4d-3be6-25fe6410f4c2",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="ac79a374-c212-4698-d85d-0201fa331f48",
Synchronized="2020-03-27 23:42:36.0")
/** Column name Cash_C_PaymentTerm_ID */
public static final String COLUMNNAME_Cash_C_PaymentTerm_ID = "Cash_C_PaymentTerm_ID";
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

@XendraTrl(Identifier="286edf21-061a-a278-ad8e-b3575eba2167")
public static String es_PE_FIELD_POSTerminal_BankAccount_Name="Cuenta Bancaria";

@XendraTrl(Identifier="286edf21-061a-a278-ad8e-b3575eba2167")
public static String es_PE_FIELD_POSTerminal_BankAccount_Description="Cuenta bancaria";

@XendraTrl(Identifier="286edf21-061a-a278-ad8e-b3575eba2167")
public static String es_PE_FIELD_POSTerminal_BankAccount_Help="La cuenta bancaria identifica una cuenta en este banco";

@XendraField(AD_Column_ID="C_BankAccount_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="Bank",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="286edf21-061a-a278-ad8e-b3575eba2167")
public static final String FIELDNAME_POSTerminal_BankAccount="286edf21-061a-a278-ad8e-b3575eba2167";

@XendraTrl(Identifier="0253122c-ebec-c856-4e9a-9bdb4fdde05a")
public static String es_PE_COLUMN_C_BankAccount_ID_Name="Cuenta Bancaria";

@XendraColumn(AD_Element_ID="5a03bc67-316f-bd8c-9e68-b009ad1b290b",ColumnName="C_BankAccount_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="97425762-0a99-5f8b-5219-df2cd66343cd",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0253122c-ebec-c856-4e9a-9bdb4fdde05a",Synchronized="2020-03-28 17:05:44.0")
/** Column name C_BankAccount_ID */
public static final String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
/** Set Cash Book.
@param C_CashBook_ID Cash Book for recording petty cash transactions */
public void setC_CashBook_ID (int C_CashBook_ID)
{
if (C_CashBook_ID < 1) throw new IllegalArgumentException ("C_CashBook_ID is mandatory.");
set_Value (COLUMNNAME_C_CashBook_ID, Integer.valueOf(C_CashBook_ID));
}
/** Get Cash Book.
@return Cash Book for recording petty cash transactions */
public int getC_CashBook_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_CashBook_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="63b03fb5-d1ad-699a-dced-90c3515e3d20")
public static String es_PE_FIELD_POSTerminal_CashBook_Name="Libro de Efectivo";

@XendraTrl(Identifier="63b03fb5-d1ad-699a-dced-90c3515e3d20")
public static String es_PE_FIELD_POSTerminal_CashBook_Description="Libro de efectivo para registrar transacciones de caja chica.";

@XendraTrl(Identifier="63b03fb5-d1ad-699a-dced-90c3515e3d20")
public static String es_PE_FIELD_POSTerminal_CashBook_Help="El libro de efectivo identifica un libro de efectivo único. El libro de efectivo se usa para registrar transacciones de efectivo.";

@XendraField(AD_Column_ID="C_CashBook_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="Bank",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="63b03fb5-d1ad-699a-dced-90c3515e3d20")
public static final String FIELDNAME_POSTerminal_CashBook="63b03fb5-d1ad-699a-dced-90c3515e3d20";

@XendraTrl(Identifier="5ac2282a-22c1-eec1-b133-04f1b592a763")
public static String es_PE_COLUMN_C_CashBook_ID_Name="Libro de Efectivo";

@XendraColumn(AD_Element_ID="30688c51-d454-8026-32c4-990b9ea9ddf2",ColumnName="C_CashBook_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="2254195b-0e6b-fd71-d72f-9016f5594470",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5ac2282a-22c1-eec1-b133-04f1b592a763",Synchronized="2020-03-27 23:42:36.0")
/** Column name C_CashBook_ID */
public static final String COLUMNNAME_C_CashBook_ID = "C_CashBook_ID";
/** Set C_CollectiontFormat_ID.
@param C_CollectiontFormat_ID C_CollectiontFormat_ID */
public void setC_CollectiontFormat_ID (int C_CollectiontFormat_ID)
{
if (C_CollectiontFormat_ID <= 0) set_Value (COLUMNNAME_C_CollectiontFormat_ID, null);
 else 
set_Value (COLUMNNAME_C_CollectiontFormat_ID, Integer.valueOf(C_CollectiontFormat_ID));
}
/** Get C_CollectiontFormat_ID.
@return C_CollectiontFormat_ID */
public int getC_CollectiontFormat_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_CollectiontFormat_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5e7aac21-0292-a7b0-a08c-f14e2c1068e7")
public static String es_PE_FIELD_POSTerminal_C_CollectiontFormat_ID_Name="c_collectiontformat_id";

@XendraField(AD_Column_ID="C_CollectiontFormat_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5e7aac21-0292-a7b0-a08c-f14e2c1068e7")
public static final String FIELDNAME_POSTerminal_C_CollectiontFormat_ID="5e7aac21-0292-a7b0-a08c-f14e2c1068e7";

@XendraTrl(Identifier="1372bc5e-84e8-87b5-c5e1-7fe90da0fe95")
public static String es_PE_COLUMN_C_CollectiontFormat_ID_Name="c_collectiontformat_id";

@XendraColumn(AD_Element_ID="fb53359f-d171-a2b4-9de7-991109f9c2f5",
ColumnName="C_CollectiontFormat_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="e88a1d0d-c373-b418-2359-964837000a60",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="1372bc5e-84e8-87b5-c5e1-7fe90da0fe95",
Synchronized="2020-03-27 23:42:36.0")
/** Column name C_CollectiontFormat_ID */
public static final String COLUMNNAME_C_CollectiontFormat_ID = "C_CollectiontFormat_ID";
/** Set C_CreditFormat_ID.
@param C_CreditFormat_ID C_CreditFormat_ID */
public void setC_CreditFormat_ID (int C_CreditFormat_ID)
{
if (C_CreditFormat_ID <= 0) set_Value (COLUMNNAME_C_CreditFormat_ID, null);
 else 
set_Value (COLUMNNAME_C_CreditFormat_ID, Integer.valueOf(C_CreditFormat_ID));
}
/** Get C_CreditFormat_ID.
@return C_CreditFormat_ID */
public int getC_CreditFormat_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_CreditFormat_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0e7119fb-18e4-4d77-9fa6-4d2298c8a25f")
public static String es_PE_FIELD_POSTerminal_C_CreditFormat_ID_Name="C_CreditFormat_ID";

@XendraField(AD_Column_ID="C_CreditFormat_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-09-19 17:19:25.0",
Identifier="0e7119fb-18e4-4d77-9fa6-4d2298c8a25f")
public static final String FIELDNAME_POSTerminal_C_CreditFormat_ID="0e7119fb-18e4-4d77-9fa6-4d2298c8a25f";

@XendraTrl(Identifier="c36b0fdd-5ae1-8916-cd64-c40fcdb38434")
public static String es_PE_COLUMN_C_CreditFormat_ID_Name="C_CreditFormat_ID";

@XendraColumn(AD_Element_ID="7f934300-fff3-3020-abc2-a9c654aea703",ColumnName="C_CreditFormat_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="e88a1d0d-c373-b418-2359-964837000a60",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c36b0fdd-5ae1-8916-cd64-c40fcdb38434",Synchronized="2020-03-27 23:42:36.0")
/** Column name C_CreditFormat_ID */
public static final String COLUMNNAME_C_CreditFormat_ID = "C_CreditFormat_ID";
/** Set ChangePricePassword.
@param ChangePricePassword ChangePricePassword */
public void setChangePricePassword (String ChangePricePassword)
{
if (ChangePricePassword != null && ChangePricePassword.length() > 40)
{
log.warning("Length > 40 - truncated");
ChangePricePassword = ChangePricePassword.substring(0,39);
}
set_Value (COLUMNNAME_ChangePricePassword, ChangePricePassword);
}
/** Get ChangePricePassword.
@return ChangePricePassword */
public String getChangePricePassword() 
{
String value = (String)get_Value(COLUMNNAME_ChangePricePassword);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="345f9ed5-ec46-4a86-ac87-c77865ddefc8")
public static String es_PE_FIELD_POSTerminal_ChangePricePassword_Name="Password Cambio de Precio";

@XendraField(AD_Column_ID="ChangePricePassword",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="Access",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=340,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2020-03-27 23:42:36.0",
Identifier="345f9ed5-ec46-4a86-ac87-c77865ddefc8")
public static final String FIELDNAME_POSTerminal_ChangePricePassword="345f9ed5-ec46-4a86-ac87-c77865ddefc8";

@XendraTrl(Identifier="b67456b4-f866-4479-bd43-c9d76b8834ff")
public static String es_PE_COLUMN_ChangePricePassword_Name="changepricepassword";

@XendraColumn(AD_Element_ID="d7ac1073-b136-4296-94bb-c4c709233b09",
ColumnName="ChangePricePassword",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=40,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b67456b4-f866-4479-bd43-c9d76b8834ff",Synchronized="2020-03-27 23:42:36.0")
/** Column name ChangePricePassword */
public static final String COLUMNNAME_ChangePricePassword = "ChangePricePassword";
/** Set ClosePassword.
@param ClosePassword ClosePassword */
public void setClosePassword (String ClosePassword)
{
if (ClosePassword != null && ClosePassword.length() > 40)
{
log.warning("Length > 40 - truncated");
ClosePassword = ClosePassword.substring(0,39);
}
set_Value (COLUMNNAME_ClosePassword, ClosePassword);
}
/** Get ClosePassword.
@return ClosePassword */
public String getClosePassword() 
{
String value = (String)get_Value(COLUMNNAME_ClosePassword);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="b482fb01-9d07-4ec3-95a3-e75d551f2d8c")
public static String es_PE_FIELD_POSTerminal_ClosePassword_Name="Password Cerrar ventana";

@XendraField(AD_Column_ID="ClosePassword",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="Access",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=320,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2020-03-27 23:42:36.0",
Identifier="b482fb01-9d07-4ec3-95a3-e75d551f2d8c")
public static final String FIELDNAME_POSTerminal_ClosePassword="b482fb01-9d07-4ec3-95a3-e75d551f2d8c";

@XendraTrl(Identifier="a065f913-5a12-45d7-8822-b570b30e2552")
public static String es_PE_COLUMN_ClosePassword_Name="closepassword";

@XendraColumn(AD_Element_ID="96a8483b-e198-458f-a081-e7f834bd9f16",ColumnName="ClosePassword",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a065f913-5a12-45d7-8822-b570b30e2552",
Synchronized="2020-03-27 23:42:36.0")
/** Column name ClosePassword */
public static final String COLUMNNAME_ClosePassword = "ClosePassword";
/** Set CopyColumnsFromTemplate.
@param CopyColumnsFromTemplate CopyColumnsFromTemplate */
public void setCopyColumnsFromTemplate (boolean CopyColumnsFromTemplate)
{
set_Value (COLUMNNAME_CopyColumnsFromTemplate, Boolean.valueOf(CopyColumnsFromTemplate));
}
/** Get CopyColumnsFromTemplate.
@return CopyColumnsFromTemplate */
public boolean isCopyColumnsFromTemplate() 
{
Object oo = get_Value(COLUMNNAME_CopyColumnsFromTemplate);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="c639c765-df4b-49f5-97a4-506d305d5cfa")
public static String es_PE_COLUMN_CopyColumnsFromTemplate_Name="CopyColumnsFromTemplate";

@XendraColumn(AD_Element_ID="c397f52e-3459-c0a8-1d8f-01c9625ec531",
ColumnName="CopyColumnsFromTemplate",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c639c765-df4b-49f5-97a4-506d305d5cfa",Synchronized="2020-03-27 23:42:36.0")
/** Column name CopyColumnsFromTemplate */
public static final String COLUMNNAME_CopyColumnsFromTemplate = "CopyColumnsFromTemplate";
/** Set POS Terminal.
@param C_POS_ID Point of Sales Terminal */
public void setC_POS_ID (int C_POS_ID)
{
if (C_POS_ID < 1) throw new IllegalArgumentException ("C_POS_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_POS_ID, Integer.valueOf(C_POS_ID));
}
/** Get POS Terminal.
@return Point of Sales Terminal */
public int getC_POS_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_POS_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="525004ad-d27d-6240-08c4-11e56c5caec5")
public static String es_PE_FIELD_POSTerminal_POSTerminal_Name="Terminal PDV";

@XendraTrl(Identifier="525004ad-d27d-6240-08c4-11e56c5caec5")
public static String es_PE_FIELD_POSTerminal_POSTerminal_Description="Punto de las ventas terminales";

@XendraTrl(Identifier="525004ad-d27d-6240-08c4-11e56c5caec5")
public static String es_PE_FIELD_POSTerminal_POSTerminal_Help="La Terminal de PDV define el default y las funciones de la forma de PV.";

@XendraField(AD_Column_ID="C_POS_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="525004ad-d27d-6240-08c4-11e56c5caec5")
public static final String FIELDNAME_POSTerminal_POSTerminal="525004ad-d27d-6240-08c4-11e56c5caec5";
/** Column name C_POS_ID */
public static final String COLUMNNAME_C_POS_ID = "C_POS_ID";
/** Set POS Key Layout.
@param C_POSKeyLayout_ID POS Function Key Layout */
public void setC_POSKeyLayout_ID (int C_POSKeyLayout_ID)
{
if (C_POSKeyLayout_ID <= 0) set_Value (COLUMNNAME_C_POSKeyLayout_ID, null);
 else 
set_Value (COLUMNNAME_C_POSKeyLayout_ID, Integer.valueOf(C_POSKeyLayout_ID));
}
/** Get POS Key Layout.
@return POS Function Key Layout */
public int getC_POSKeyLayout_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_POSKeyLayout_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d1fc0552-93d2-986f-c45b-970208493103")
public static String es_PE_FIELD_POSTerminal_POSKeyLayout_Name="PDV Disposición de la llave";

@XendraTrl(Identifier="d1fc0552-93d2-986f-c45b-970208493103")
public static String es_PE_FIELD_POSTerminal_POSKeyLayout_Description="Disposición de la llave de funcionamiento PDV";

@XendraTrl(Identifier="d1fc0552-93d2-986f-c45b-970208493103")
public static String es_PE_FIELD_POSTerminal_POSKeyLayout_Help="Disposición de la llave de funcionamiento PDV";

@XendraField(AD_Column_ID="C_POSKeyLayout_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d1fc0552-93d2-986f-c45b-970208493103")
public static final String FIELDNAME_POSTerminal_POSKeyLayout="d1fc0552-93d2-986f-c45b-970208493103";

@XendraTrl(Identifier="ee4ac8a6-74cd-0fc3-aa3e-4348dd73dc5e")
public static String es_PE_COLUMN_C_POSKeyLayout_ID_Name="PDV Disposición de la llave";

@XendraColumn(AD_Element_ID="4665a4ce-9921-ee8e-32d7-b2602f5804bf",ColumnName="C_POSKeyLayout_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ee4ac8a6-74cd-0fc3-aa3e-4348dd73dc5e",
Synchronized="2020-03-27 23:42:36.0")
/** Column name C_POSKeyLayout_ID */
public static final String COLUMNNAME_C_POSKeyLayout_ID = "C_POSKeyLayout_ID";
/** Set Credit_C_PaymentTerm_ID.
@param Credit_C_PaymentTerm_ID The terms of Payment (timing, discount) */
public void setCredit_C_PaymentTerm_ID (int Credit_C_PaymentTerm_ID)
{
if (Credit_C_PaymentTerm_ID < 1) throw new IllegalArgumentException ("Credit_C_PaymentTerm_ID is mandatory.");
set_Value (COLUMNNAME_Credit_C_PaymentTerm_ID, Integer.valueOf(Credit_C_PaymentTerm_ID));
}
/** Get Credit_C_PaymentTerm_ID.
@return The terms of Payment (timing, discount) */
public int getCredit_C_PaymentTerm_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Credit_C_PaymentTerm_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="73c34461-082c-5833-f8c4-da29435270fb")
public static String es_PE_FIELD_POSTerminal_Credit_C_PaymentTerm_ID_Name="Término de Pago - Banco";

@XendraTrl(Identifier="73c34461-082c-5833-f8c4-da29435270fb")
public static String es_PE_FIELD_POSTerminal_Credit_C_PaymentTerm_ID_Description="The terms of Payment (timing, discount)";

@XendraTrl(Identifier="73c34461-082c-5833-f8c4-da29435270fb")
public static String es_PE_FIELD_POSTerminal_Credit_C_PaymentTerm_ID_Help="Payment Terms identify the method and timing of payment.";

@XendraField(AD_Column_ID="Credit_C_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="73c34461-082c-5833-f8c4-da29435270fb")
public static final String FIELDNAME_POSTerminal_Credit_C_PaymentTerm_ID="73c34461-082c-5833-f8c4-da29435270fb";

@XendraTrl(Identifier="555fc451-3bb1-a42b-3fa4-e393601b57ee")
public static String es_PE_COLUMN_Credit_C_PaymentTerm_ID_Name="Credit_C_PaymentTerm_ID";

@XendraColumn(AD_Element_ID="7957b103-3c57-ae35-df11-b8a4cb6e6751",
ColumnName="Credit_C_PaymentTerm_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="270bb22c-6cc2-0c4d-3be6-25fe6410f4c2",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="555fc451-3bb1-a42b-3fa4-e393601b57ee",
Synchronized="2020-03-27 23:42:36.0")
/** Column name Credit_C_PaymentTerm_ID */
public static final String COLUMNNAME_Credit_C_PaymentTerm_ID = "Credit_C_PaymentTerm_ID";
/** Set DeletePassword.
@param DeletePassword DeletePassword */
public void setDeletePassword (String DeletePassword)
{
if (DeletePassword != null && DeletePassword.length() > 40)
{
log.warning("Length > 40 - truncated");
DeletePassword = DeletePassword.substring(0,39);
}
set_Value (COLUMNNAME_DeletePassword, DeletePassword);
}
/** Get DeletePassword.
@return DeletePassword */
public String getDeletePassword() 
{
String value = (String)get_Value(COLUMNNAME_DeletePassword);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="88a912ee-6b25-4925-81c7-522ad535a3cc")
public static String es_PE_FIELD_POSTerminal_DeletePassword_Name="Password para Borrar";

@XendraField(AD_Column_ID="DeletePassword",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="Access",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=360,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2020-03-27 23:42:36.0",
Identifier="88a912ee-6b25-4925-81c7-522ad535a3cc")
public static final String FIELDNAME_POSTerminal_DeletePassword="88a912ee-6b25-4925-81c7-522ad535a3cc";

@XendraTrl(Identifier="793c853b-5abe-4196-ac80-ce65c3288573")
public static String es_PE_COLUMN_DeletePassword_Name="deletepassword";

@XendraColumn(AD_Element_ID="1d38049e-0113-40b8-81b2-8cbac57e8a6d",ColumnName="DeletePassword",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="793c853b-5abe-4196-ac80-ce65c3288573",
Synchronized="2020-03-27 23:42:36.0")
/** Column name DeletePassword */
public static final String COLUMNNAME_DeletePassword = "DeletePassword";
/** Set Delivery Rule.
@param DeliveryRule Defines the timing of Delivery */
public void setDeliveryRule (String DeliveryRule)
{
if (DeliveryRule != null && DeliveryRule.length() > 1)
{
log.warning("Length > 1 - truncated");
DeliveryRule = DeliveryRule.substring(0,0);
}
set_Value (COLUMNNAME_DeliveryRule, DeliveryRule);
}
/** Get Delivery Rule.
@return Defines the timing of Delivery */
public String getDeliveryRule() 
{
return (String)get_Value(COLUMNNAME_DeliveryRule);
}

@XendraTrl(Identifier="44f86a5d-75fd-8cbf-a0f9-292563b46513")
public static String es_PE_FIELD_POSTerminal_DeliveryRule_Name="Regla de Entrega";

@XendraTrl(Identifier="44f86a5d-75fd-8cbf-a0f9-292563b46513")
public static String es_PE_FIELD_POSTerminal_DeliveryRule_Description="Define los tiempos de entrega";

@XendraTrl(Identifier="44f86a5d-75fd-8cbf-a0f9-292563b46513")
public static String es_PE_FIELD_POSTerminal_DeliveryRule_Help="La Regla de Entrega indica cuando una orden debe ser entregada. Por Ej. Si la orden debiera entregarse cuando  esta completa; cuando una partida esta completa ó cuando el producto llega a estar disponible.";

@XendraField(AD_Column_ID="DeliveryRule",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="44f86a5d-75fd-8cbf-a0f9-292563b46513")
public static final String FIELDNAME_POSTerminal_DeliveryRule="44f86a5d-75fd-8cbf-a0f9-292563b46513";

@XendraTrl(Identifier="f29ba141-2f14-cc14-c8c8-28e86d5e43f3")
public static String es_PE_COLUMN_DeliveryRule_Name="Delivery Rule";

@XendraColumn(AD_Element_ID="bfc0b304-42d5-bfa2-4997-a3024ea284f9",ColumnName="DeliveryRule",
AD_Reference_ID=17,AD_Reference_Value_ID="dd6ca989-f822-5b38-ea47-5420e7ccb16b",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f29ba141-2f14-cc14-c8c8-28e86d5e43f3",Synchronized="2020-03-27 23:42:36.0")
/** Column name DeliveryRule */
public static final String COLUMNNAME_DeliveryRule = "DeliveryRule";
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

@XendraTrl(Identifier="32adb122-747d-c78f-567a-222239ff0c75")
public static String es_PE_FIELD_POSTerminal_Description_Name="Observación";

@XendraTrl(Identifier="32adb122-747d-c78f-567a-222239ff0c75")
public static String es_PE_FIELD_POSTerminal_Description_Description="Observación";

@XendraTrl(Identifier="32adb122-747d-c78f-567a-222239ff0c75")
public static String es_PE_FIELD_POSTerminal_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="32adb122-747d-c78f-567a-222239ff0c75")
public static final String FIELDNAME_POSTerminal_Description="32adb122-747d-c78f-567a-222239ff0c75";

@XendraTrl(Identifier="12dc2b81-897d-e1bc-a31a-5da119000bdc")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="12dc2b81-897d-e1bc-a31a-5da119000bdc",
Synchronized="2020-03-27 23:42:36.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Employee_C_PaymentTerm_ID.
@param Employee_C_PaymentTerm_ID Employee_C_PaymentTerm_ID */
public void setEmployee_C_PaymentTerm_ID (int Employee_C_PaymentTerm_ID)
{
if (Employee_C_PaymentTerm_ID <= 0) set_Value (COLUMNNAME_Employee_C_PaymentTerm_ID, null);
 else 
set_Value (COLUMNNAME_Employee_C_PaymentTerm_ID, Integer.valueOf(Employee_C_PaymentTerm_ID));
}
/** Get Employee_C_PaymentTerm_ID.
@return Employee_C_PaymentTerm_ID */
public int getEmployee_C_PaymentTerm_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Employee_C_PaymentTerm_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="011e51a6-4bcf-49ee-8776-8128ccddf2d9")
public static String es_PE_FIELD_POSTerminal_Employee_C_PaymentTerm_ID_Name="employee_c_paymentterm_id";

@XendraField(AD_Column_ID="Employee_C_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=280,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-01-10 15:10:02.0",
Identifier="011e51a6-4bcf-49ee-8776-8128ccddf2d9")
public static final String FIELDNAME_POSTerminal_Employee_C_PaymentTerm_ID="011e51a6-4bcf-49ee-8776-8128ccddf2d9";

@XendraTrl(Identifier="cb116563-02e2-4de2-be41-8bb649b09450")
public static String es_PE_COLUMN_Employee_C_PaymentTerm_ID_Name="employee_c_paymentterm_id";

@XendraColumn(AD_Element_ID="883ff185-23bf-424b-9a0e-dc2628991762",
ColumnName="Employee_C_PaymentTerm_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="270bb22c-6cc2-0c4d-3be6-25fe6410f4c2",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="cb116563-02e2-4de2-be41-8bb649b09450",
Synchronized="2020-03-27 23:42:36.0")
/** Column name Employee_C_PaymentTerm_ID */
public static final String COLUMNNAME_Employee_C_PaymentTerm_ID = "Employee_C_PaymentTerm_ID";
/** Set Comment/Help.
@param Help Comment or Hint */
public void setHelp (String Help)
{
set_Value (COLUMNNAME_Help, Help);
}
/** Get Comment/Help.
@return Comment or Hint */
public String getHelp() 
{
String value = (String)get_Value(COLUMNNAME_Help);
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

@XendraTrl(Identifier="0107c671-d9d8-8f2e-3eca-8ee345281fce")
public static String es_PE_FIELD_POSTerminal_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="0107c671-d9d8-8f2e-3eca-8ee345281fce")
public static String es_PE_FIELD_POSTerminal_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="0107c671-d9d8-8f2e-3eca-8ee345281fce")
public static String es_PE_FIELD_POSTerminal_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0107c671-d9d8-8f2e-3eca-8ee345281fce")
public static final String FIELDNAME_POSTerminal_CommentHelp="0107c671-d9d8-8f2e-3eca-8ee345281fce";

@XendraTrl(Identifier="a66cca4b-96f2-9bb6-f277-06949fb1ba60")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a66cca4b-96f2-9bb6-f277-06949fb1ba60",
Synchronized="2020-03-27 23:42:37.0")
/** Column name Help */
public static final String COLUMNNAME_Help = "Help";
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
@XendraTrl(Identifier="c6fa8b13-bb07-4181-a9e1-3c96b6b8f6fe")
public static String es_PE_FIELD_POSTerminal_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-01-10 15:10:02.0",
Identifier="c6fa8b13-bb07-4181-a9e1-3c96b6b8f6fe")
public static final String FIELDNAME_POSTerminal_Identifier="c6fa8b13-bb07-4181-a9e1-3c96b6b8f6fe";

@XendraTrl(Identifier="6713255c-1467-4a7f-b5f6-29520a235d6c")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6713255c-1467-4a7f-b5f6-29520a235d6c",
Synchronized="2020-03-27 23:42:37.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set MachineSerial.
@param MachineSerial MachineSerial */
public void setMachineSerial (String MachineSerial)
{
if (MachineSerial != null && MachineSerial.length() > 60)
{
log.warning("Length > 60 - truncated");
MachineSerial = MachineSerial.substring(0,59);
}
set_Value (COLUMNNAME_MachineSerial, MachineSerial);
}
/** Get MachineSerial.
@return MachineSerial */
public String getMachineSerial() 
{
String value = (String)get_Value(COLUMNNAME_MachineSerial);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="02b6394a-4808-4c4f-b6ef-be11f642b48e")
public static String es_PE_FIELD_POSTerminal_MachineSerial_Name="machineserial";

@XendraField(AD_Column_ID="MachineSerial",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=380,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2020-03-27 23:42:37.0",
Identifier="02b6394a-4808-4c4f-b6ef-be11f642b48e")
public static final String FIELDNAME_POSTerminal_MachineSerial="02b6394a-4808-4c4f-b6ef-be11f642b48e";

@XendraTrl(Identifier="3a45aaa8-25bd-44db-a803-6b1fb8f8a538")
public static String es_PE_COLUMN_MachineSerial_Name="MachineSerial";

@XendraColumn(AD_Element_ID="8435e473-af0f-eb91-9746-88d639a40879",ColumnName="MachineSerial",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3a45aaa8-25bd-44db-a803-6b1fb8f8a538",
Synchronized="2020-03-27 23:42:37.0")
/** Column name MachineSerial */
public static final String COLUMNNAME_MachineSerial = "MachineSerial";
/** Set M_BonusPriceList_ID.
@param M_BonusPriceList_ID M_BonusPriceList_ID */
public void setM_BonusPriceList_ID (int M_BonusPriceList_ID)
{
if (M_BonusPriceList_ID <= 0) set_Value (COLUMNNAME_M_BonusPriceList_ID, null);
 else 
set_Value (COLUMNNAME_M_BonusPriceList_ID, Integer.valueOf(M_BonusPriceList_ID));
}
/** Get M_BonusPriceList_ID.
@return M_BonusPriceList_ID */
public int getM_BonusPriceList_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_BonusPriceList_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f63dd52e-13d8-0b20-c8d8-11391bed93ab")
public static String es_PE_FIELD_POSTerminal_M_BonusPriceList_ID_Name="m_bonuspricelist_id";

@XendraField(AD_Column_ID="M_BonusPriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f63dd52e-13d8-0b20-c8d8-11391bed93ab")
public static final String FIELDNAME_POSTerminal_M_BonusPriceList_ID="f63dd52e-13d8-0b20-c8d8-11391bed93ab";

@XendraTrl(Identifier="402e88d7-4655-192a-7dd4-ee1d43c90172")
public static String es_PE_COLUMN_M_BonusPriceList_ID_Name="m_bonuspricelist_id";

@XendraColumn(AD_Element_ID="87702bb5-efe2-7e41-0226-a0b4ec39cf59",
ColumnName="M_BonusPriceList_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="a20c07c8-1fb7-74c6-ec9d-66afd2d29682",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="402e88d7-4655-192a-7dd4-ee1d43c90172",
Synchronized="2020-03-27 23:42:37.0")
/** Column name M_BonusPriceList_ID */
public static final String COLUMNNAME_M_BonusPriceList_ID = "M_BonusPriceList_ID";
/** Set M_BonusWarehouse_ID.
@param M_BonusWarehouse_ID M_BonusWarehouse_ID */
public void setM_BonusWarehouse_ID (int M_BonusWarehouse_ID)
{
if (M_BonusWarehouse_ID <= 0) set_Value (COLUMNNAME_M_BonusWarehouse_ID, null);
 else 
set_Value (COLUMNNAME_M_BonusWarehouse_ID, Integer.valueOf(M_BonusWarehouse_ID));
}
/** Get M_BonusWarehouse_ID.
@return M_BonusWarehouse_ID */
public int getM_BonusWarehouse_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_BonusWarehouse_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="771c6861-8035-b597-d8eb-25492db1824b")
public static String es_PE_FIELD_POSTerminal_M_BonusWarehouse_ID_Name="m_bonuswarehouse_id";

@XendraField(AD_Column_ID="M_BonusWarehouse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="771c6861-8035-b597-d8eb-25492db1824b")
public static final String FIELDNAME_POSTerminal_M_BonusWarehouse_ID="771c6861-8035-b597-d8eb-25492db1824b";

@XendraTrl(Identifier="3c8d63c2-cacb-51a3-a06b-8df36d992a90")
public static String es_PE_COLUMN_M_BonusWarehouse_ID_Name="m_bonuswarehouse_id";

@XendraColumn(AD_Element_ID="64c401e8-686f-161b-b999-5a8e94c7d170",
ColumnName="M_BonusWarehouse_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="e3999c76-66f0-38b0-a95e-fb0d580cde7a",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="3c8d63c2-cacb-51a3-a06b-8df36d992a90",
Synchronized="2020-03-27 23:42:37.0")
/** Column name M_BonusWarehouse_ID */
public static final String COLUMNNAME_M_BonusWarehouse_ID = "M_BonusWarehouse_ID";
/** Set M_PriceList_ID.
@param M_PriceList_ID Unique identifier of a Price List */
public void setM_PriceList_ID (int M_PriceList_ID)
{
if (M_PriceList_ID <= 0) set_Value (COLUMNNAME_M_PriceList_ID, null);
 else 
set_Value (COLUMNNAME_M_PriceList_ID, Integer.valueOf(M_PriceList_ID));
}
/** Get M_PriceList_ID.
@return Unique identifier of a Price List */
public int getM_PriceList_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_PriceList_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="073bae98-a019-d516-89db-3ea07703a1bb")
public static String es_PE_FIELD_POSTerminal_M_PriceList_ID_Name="Lista de Precios";

@XendraTrl(Identifier="073bae98-a019-d516-89db-3ea07703a1bb")
public static String es_PE_FIELD_POSTerminal_M_PriceList_ID_Description="Identificador único de mi lista de precios";

@XendraTrl(Identifier="073bae98-a019-d516-89db-3ea07703a1bb")
public static String es_PE_FIELD_POSTerminal_M_PriceList_ID_Help="Listas de precios son usadas para determinar el precio; margen y costo de artículos comprados ó vendidos.";

@XendraField(AD_Column_ID="M_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="073bae98-a019-d516-89db-3ea07703a1bb")
public static final String FIELDNAME_POSTerminal_M_PriceList_ID="073bae98-a019-d516-89db-3ea07703a1bb";

@XendraTrl(Identifier="bba4d271-cf39-30fb-835e-a841ba54d4f4")
public static String es_PE_COLUMN_M_PriceList_ID_Name="Price List";

@XendraColumn(AD_Element_ID="652afdd3-9ff1-082d-5831-6aad828e0e09",ColumnName="M_PriceList_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bba4d271-cf39-30fb-835e-a841ba54d4f4",
Synchronized="2020-03-27 23:42:37.0")
/** Column name M_PriceList_ID */
public static final String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";
/** Set Price List Version.
@param M_PriceList_Version_ID Identifies a unique instance of a Price List */
public void setM_PriceList_Version_ID (int M_PriceList_Version_ID)
{
if (M_PriceList_Version_ID <= 0) set_Value (COLUMNNAME_M_PriceList_Version_ID, null);
 else 
set_Value (COLUMNNAME_M_PriceList_Version_ID, Integer.valueOf(M_PriceList_Version_ID));
}
/** Get Price List Version.
@return Identifies a unique instance of a Price List */
public int getM_PriceList_Version_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_PriceList_Version_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d233862d-a12a-4c97-87be-12bac997a772")
public static String es_PE_FIELD_POSTerminal_PriceListVersion_Name="Versión de Lista de Precios";

@XendraTrl(Identifier="d233862d-a12a-4c97-87be-12bac997a772")
public static String es_PE_FIELD_POSTerminal_PriceListVersion_Description="Identifica una instancia única de una lista de precios";

@XendraTrl(Identifier="d233862d-a12a-4c97-87be-12bac997a772")
public static String es_PE_FIELD_POSTerminal_PriceListVersion_Help="Cada lista de precios puede tener múltiples versiones. El uso más común es indicar las fechas en que es válida una lista de precios.";

@XendraField(AD_Column_ID="M_PriceList_Version_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=270,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-09-19 17:19:25.0",
Identifier="d233862d-a12a-4c97-87be-12bac997a772")
public static final String FIELDNAME_POSTerminal_PriceListVersion="d233862d-a12a-4c97-87be-12bac997a772";

@XendraTrl(Identifier="839fda2a-e60b-383b-1d21-c56c3315adb1")
public static String es_PE_COLUMN_M_PriceList_Version_ID_Name="Price List Version";

@XendraColumn(AD_Element_ID="6c31f4d5-58fe-0b61-33f1-e2549c3f35f6",
ColumnName="M_PriceList_Version_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="839fda2a-e60b-383b-1d21-c56c3315adb1",Synchronized="2020-03-27 23:42:37.0")
/** Column name M_PriceList_Version_ID */
public static final String COLUMNNAME_M_PriceList_Version_ID = "M_PriceList_Version_ID";
/** Set Warehouse.
@param M_Warehouse_ID Storage Warehouse and Service Point */
public void setM_Warehouse_ID (int M_Warehouse_ID)
{
if (M_Warehouse_ID < 1) throw new IllegalArgumentException ("M_Warehouse_ID is mandatory.");
set_Value (COLUMNNAME_M_Warehouse_ID, Integer.valueOf(M_Warehouse_ID));
}
/** Get Warehouse.
@return Storage Warehouse and Service Point */
public int getM_Warehouse_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Warehouse_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e4fa0eb5-348b-8241-3064-a40336208073")
public static String es_PE_FIELD_POSTerminal_Warehouse_Name="Almacén";

@XendraTrl(Identifier="e4fa0eb5-348b-8241-3064-a40336208073")
public static String es_PE_FIELD_POSTerminal_Warehouse_Description="Almacén";

@XendraTrl(Identifier="e4fa0eb5-348b-8241-3064-a40336208073")
public static String es_PE_FIELD_POSTerminal_Warehouse_Help="El Almacén indica un Almacén único donde los productos son almacenados";

@XendraField(AD_Column_ID="M_Warehouse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="Invoicing",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e4fa0eb5-348b-8241-3064-a40336208073")
public static final String FIELDNAME_POSTerminal_Warehouse="e4fa0eb5-348b-8241-3064-a40336208073";

@XendraTrl(Identifier="cfeb3447-194f-e5ec-7cf6-36ffad00973f")
public static String es_PE_COLUMN_M_Warehouse_ID_Name="Almacén";

@XendraColumn(AD_Element_ID="402045cd-baa5-aeaf-b148-a921dffb7821",ColumnName="M_Warehouse_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="04acc0b0-f57d-0e15-af5b-80249f6e7906",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="cfeb3447-194f-e5ec-7cf6-36ffad00973f",Synchronized="2020-03-27 23:42:37.0")
/** Column name M_Warehouse_ID */
public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name == null) throw new IllegalArgumentException ("Name is mandatory.");
if (Name.length() > 60)
{
log.warning("Length > 60 - truncated");
Name = Name.substring(0,59);
}
set_Value (COLUMNNAME_Name, Name);
}
/** Get Name.
@return Alphanumeric identifier of the entity */
public String getName() 
{
String value = (String)get_Value(COLUMNNAME_Name);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="f178212d-ea28-4c91-c0a4-9cfc9badcee2")
public static String es_PE_FIELD_POSTerminal_Name_Name="Nombre";

@XendraTrl(Identifier="f178212d-ea28-4c91-c0a4-9cfc9badcee2")
public static String es_PE_FIELD_POSTerminal_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="f178212d-ea28-4c91-c0a4-9cfc9badcee2")
public static String es_PE_FIELD_POSTerminal_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f178212d-ea28-4c91-c0a4-9cfc9badcee2")
public static final String FIELDNAME_POSTerminal_Name="f178212d-ea28-4c91-c0a4-9cfc9badcee2";

@XendraTrl(Identifier="575e3541-92d2-c660-8de6-37c98c5ee6cc")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="575e3541-92d2-c660-8de6-37c98c5ee6cc",
Synchronized="2020-03-27 23:42:37.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Notify_Role_ID.
@param Notify_Role_ID Notify_Role_ID */
public void setNotify_Role_ID (int Notify_Role_ID)
{
if (Notify_Role_ID <= 0) set_Value (COLUMNNAME_Notify_Role_ID, null);
 else 
set_Value (COLUMNNAME_Notify_Role_ID, Integer.valueOf(Notify_Role_ID));
}
/** Get Notify_Role_ID.
@return Notify_Role_ID */
public int getNotify_Role_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Notify_Role_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="de21f709-8901-f41a-be4d-01b7af74a68f")
public static String es_PE_FIELD_POSTerminal_Notify_Role_ID_Name="Notifica a Rol";

@XendraField(AD_Column_ID="Notify_Role_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="de21f709-8901-f41a-be4d-01b7af74a68f")
public static final String FIELDNAME_POSTerminal_Notify_Role_ID="de21f709-8901-f41a-be4d-01b7af74a68f";

@XendraTrl(Identifier="0fd8a77a-2990-0244-098d-5f49e108e7db")
public static String es_PE_COLUMN_Notify_Role_ID_Name="notify_role_id";

@XendraColumn(AD_Element_ID="6a1b7025-6074-73a1-94fe-97a292ceb8f8",ColumnName="Notify_Role_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="392cc08e-eea6-2c85-9f18-1c61d58c46cf",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0fd8a77a-2990-0244-098d-5f49e108e7db",Synchronized="2020-03-27 23:42:37.0")
/** Column name Notify_Role_ID */
public static final String COLUMNNAME_Notify_Role_ID = "Notify_Role_ID";
/** Set Order_C_DocType_ID.
@param Order_C_DocType_ID Document type or rules */
public void setOrder_C_DocType_ID (int Order_C_DocType_ID)
{
if (Order_C_DocType_ID <= 0) set_Value (COLUMNNAME_Order_C_DocType_ID, null);
 else 
set_Value (COLUMNNAME_Order_C_DocType_ID, Integer.valueOf(Order_C_DocType_ID));
}
/** Get Order_C_DocType_ID.
@return Document type or rules */
public int getOrder_C_DocType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Order_C_DocType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="25369f7d-9682-c452-f1bc-616c1c816ce8")
public static String es_PE_FIELD_POSTerminal_Order_C_DocType_ID_Name="Order_C_DocType_ID";

@XendraTrl(Identifier="25369f7d-9682-c452-f1bc-616c1c816ce8")
public static String es_PE_FIELD_POSTerminal_Order_C_DocType_ID_Description="Document type or rules";

@XendraTrl(Identifier="25369f7d-9682-c452-f1bc-616c1c816ce8")
public static String es_PE_FIELD_POSTerminal_Order_C_DocType_ID_Help="The Document Type determines document sequence and processing rules";

@XendraField(AD_Column_ID="Order_C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="25369f7d-9682-c452-f1bc-616c1c816ce8")
public static final String FIELDNAME_POSTerminal_Order_C_DocType_ID="25369f7d-9682-c452-f1bc-616c1c816ce8";

@XendraTrl(Identifier="31bec3e4-66c9-6df8-078d-04edca9bad38")
public static String es_PE_COLUMN_Order_C_DocType_ID_Name="Order_C_DocType_ID";

@XendraColumn(AD_Element_ID="2c8dfc82-26a0-1613-7979-a31976af6af7",ColumnName="Order_C_DocType_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="f06eaf85-a231-e1cf-ebf8-59d002c13ab4",
AD_Val_Rule_ID="0785f4b6-808a-aff3-1298-78656b038446",FieldLength=10,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="31bec3e4-66c9-6df8-078d-04edca9bad38",
Synchronized="2020-03-27 23:42:37.0")
/** Column name Order_C_DocType_ID */
public static final String COLUMNNAME_Order_C_DocType_ID = "Order_C_DocType_ID";
/** Set Password.
@param Password Password of any length (case sensitive) */
public void setPassword (String Password)
{
if (Password != null && Password.length() > 40)
{
log.warning("Length > 40 - truncated");
Password = Password.substring(0,39);
}
set_Value (COLUMNNAME_Password, Password);
}
/** Get Password.
@return Password of any length (case sensitive) */
public String getPassword() 
{
String value = (String)get_Value(COLUMNNAME_Password);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="53df78be-1778-06a6-1d48-b9281af44fc1")
public static String es_PE_FIELD_POSTerminal_Password_Name="Contraseña";

@XendraTrl(Identifier="53df78be-1778-06a6-1d48-b9281af44fc1")
public static String es_PE_FIELD_POSTerminal_Password_Description="Contraseña de cualquier longitud (Sensible a mayúsculas y minúsculas)";

@XendraTrl(Identifier="53df78be-1778-06a6-1d48-b9281af44fc1")
public static String es_PE_FIELD_POSTerminal_Password_Help="La contraseña indica la contraseña para esta ID de usuario. Las contraseñas se requieren para identificar usuarios autorizados";

@XendraField(AD_Column_ID="Password",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="53df78be-1778-06a6-1d48-b9281af44fc1")
public static final String FIELDNAME_POSTerminal_Password="53df78be-1778-06a6-1d48-b9281af44fc1";

@XendraTrl(Identifier="55adee18-2d22-db92-d7c5-2becdcf89805")
public static String es_PE_COLUMN_Password_Name="Contraseña";

@XendraColumn(AD_Element_ID="cd8ab187-f65c-a732-8e67-8675630874c3",ColumnName="Password",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="55adee18-2d22-db92-d7c5-2becdcf89805",
Synchronized="2020-03-27 23:42:37.0")
/** Column name Password */
public static final String COLUMNNAME_Password = "Password";
/** Set Payment_C_DocType_ID.
@param Payment_C_DocType_ID Payment_C_DocType_ID */
public void setPayment_C_DocType_ID (int Payment_C_DocType_ID)
{
if (Payment_C_DocType_ID <= 0) set_Value (COLUMNNAME_Payment_C_DocType_ID, null);
 else 
set_Value (COLUMNNAME_Payment_C_DocType_ID, Integer.valueOf(Payment_C_DocType_ID));
}
/** Get Payment_C_DocType_ID.
@return Payment_C_DocType_ID */
public int getPayment_C_DocType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Payment_C_DocType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5e37197c-6a00-41ed-93fe-3bcf64099b8e")
public static String es_PE_FIELD_POSTerminal_Payment_C_DocType_ID_Name="payment_c_doctype_id";

@XendraField(AD_Column_ID="Payment_C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=390,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2020-03-27 23:42:37.0",
Identifier="5e37197c-6a00-41ed-93fe-3bcf64099b8e")
public static final String FIELDNAME_POSTerminal_Payment_C_DocType_ID="5e37197c-6a00-41ed-93fe-3bcf64099b8e";

@XendraTrl(Identifier="dbae9735-e9e0-49b8-9294-687be6692b95")
public static String es_PE_COLUMN_Payment_C_DocType_ID_Name="payment_c_doctype_id";

@XendraColumn(AD_Element_ID="820ead3c-8c9c-4b05-82d4-9b30e4fa356a",
ColumnName="Payment_C_DocType_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="673fb4cb-023a-7fa1-b83c-5a97d7f5caea",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="dbae9735-e9e0-49b8-9294-687be6692b95",
Synchronized="2020-03-27 23:42:37.0")
/** Column name Payment_C_DocType_ID */
public static final String COLUMNNAME_Payment_C_DocType_ID = "Payment_C_DocType_ID";
/** Set PrinterSerial.
@param PrinterSerial PrinterSerial */
public void setPrinterSerial (String PrinterSerial)
{
if (PrinterSerial != null && PrinterSerial.length() > 60)
{
log.warning("Length > 60 - truncated");
PrinterSerial = PrinterSerial.substring(0,59);
}
set_Value (COLUMNNAME_PrinterSerial, PrinterSerial);
}
/** Get PrinterSerial.
@return PrinterSerial */
public String getPrinterSerial() 
{
String value = (String)get_Value(COLUMNNAME_PrinterSerial);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="8e1811a4-712d-f768-58a1-42369ee41596")
public static String es_PE_FIELD_POSTerminal_PrinterSerial_Name="printerserial";

@XendraField(AD_Column_ID="PrinterSerial",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8e1811a4-712d-f768-58a1-42369ee41596")
public static final String FIELDNAME_POSTerminal_PrinterSerial="8e1811a4-712d-f768-58a1-42369ee41596";

@XendraTrl(Identifier="d3fdcc8c-f1e0-9ac3-cc61-574eb2b1d2fc")
public static String es_PE_COLUMN_PrinterSerial_Name="PrinterSerial";

@XendraColumn(AD_Element_ID="04f9081d-8d9d-fc64-9b26-6f16718cae86",ColumnName="PrinterSerial",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d3fdcc8c-f1e0-9ac3-cc61-574eb2b1d2fc",
Synchronized="2020-03-27 23:42:37.0")
/** Column name PrinterSerial */
public static final String COLUMNNAME_PrinterSerial = "PrinterSerial";
/** Set Properties.
@param Properties Properties */
public void setProperties (HashMap Properties)
{
set_Value (COLUMNNAME_Properties, Properties);
}
/** Get Properties.
@return Properties */
public HashMap getProperties() 
{
HashMap propsrc = (HashMap)get_Value(COLUMNNAME_Properties);
if (propsrc == null) return new HashMap();
 HashMap propdst = (HashMap) propsrc.clone();
return propdst;
}

@XendraTrl(Identifier="22831fe5-8d9c-49a4-b606-3ef065203506")
public static String es_PE_FIELD_POSTerminal_Properties_Name="Properties";

@XendraField(AD_Column_ID="Properties",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-01-10 15:10:02.0",
Identifier="22831fe5-8d9c-49a4-b606-3ef065203506")
public static final String FIELDNAME_POSTerminal_Properties="22831fe5-8d9c-49a4-b606-3ef065203506";

@XendraTrl(Identifier="99f5011d-3877-44ac-b2f0-2a806dc2b2ee")
public static String es_PE_COLUMN_Properties_Name="Properties";

@XendraColumn(AD_Element_ID="acc3987b-292c-475a-86b5-5104970a96f3",ColumnName="Properties",
AD_Reference_ID=46,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="99f5011d-3877-44ac-b2f0-2a806dc2b2ee",
Synchronized="2020-03-27 23:42:37.0")
/** Column name Properties */
public static final String COLUMNNAME_Properties = "Properties";
/** Set Quantity.
@param QtyEntered The Quantity Entered is based on the selected UoM */
public void setQtyEntered (BigDecimal QtyEntered)
{
set_Value (COLUMNNAME_QtyEntered, QtyEntered);
}
/** Get Quantity.
@return The Quantity Entered is based on the selected UoM */
public BigDecimal getQtyEntered() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyEntered);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="dbb35365-61df-563c-9d74-dbe089b96af6")
public static String es_PE_FIELD_POSTerminal_Quantity_Name="Cantidad";

@XendraTrl(Identifier="dbb35365-61df-563c-9d74-dbe089b96af6")
public static String es_PE_FIELD_POSTerminal_Quantity_Description="La cantidad incorporada se basa en la UM seleccionada.";

@XendraTrl(Identifier="dbb35365-61df-563c-9d74-dbe089b96af6")
public static String es_PE_FIELD_POSTerminal_Quantity_Help="La cantidad incorporada se convierte a la cantidad baja de UM del producto";

@XendraField(AD_Column_ID="QtyEntered",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dbb35365-61df-563c-9d74-dbe089b96af6")
public static final String FIELDNAME_POSTerminal_Quantity="dbb35365-61df-563c-9d74-dbe089b96af6";

@XendraTrl(Identifier="a298320b-6d2c-06cf-70ef-f6cfce2f8141")
public static String es_PE_COLUMN_QtyEntered_Name="Quantity";

@XendraColumn(AD_Element_ID="70a37b06-986d-bf01-1ef9-23e214211841",ColumnName="QtyEntered",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a298320b-6d2c-06cf-70ef-f6cfce2f8141",
Synchronized="2020-03-27 23:42:37.0")
/** Column name QtyEntered */
public static final String COLUMNNAME_QtyEntered = "QtyEntered";
/** Set Request Type.
@param R_RequestType_ID Type of request (e.g. Inquiry, Complaint, ..) */
public void setR_RequestType_ID (int R_RequestType_ID)
{
if (R_RequestType_ID <= 0) set_Value (COLUMNNAME_R_RequestType_ID, null);
 else 
set_Value (COLUMNNAME_R_RequestType_ID, Integer.valueOf(R_RequestType_ID));
}
/** Get Request Type.
@return Type of request (e.g. Inquiry, Complaint, ..) */
public int getR_RequestType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_RequestType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="97dea670-4065-e524-13ea-7340964cc4bc")
public static String es_PE_FIELD_POSTerminal_RequestType_Name="Tipo de Solicitud";

@XendraTrl(Identifier="97dea670-4065-e524-13ea-7340964cc4bc")
public static String es_PE_FIELD_POSTerminal_RequestType_Description="Tipo de Solicitud (pregunta; queja).";

@XendraTrl(Identifier="97dea670-4065-e524-13ea-7340964cc4bc")
public static String es_PE_FIELD_POSTerminal_RequestType_Help="Tipos de solicitud son usados para procesar y categorizar solicitudes. Ejemplos: consultas de cuentas; garantías; etc.";

@XendraField(AD_Column_ID="R_RequestType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="97dea670-4065-e524-13ea-7340964cc4bc")
public static final String FIELDNAME_POSTerminal_RequestType="97dea670-4065-e524-13ea-7340964cc4bc";

@XendraTrl(Identifier="34f92876-c1df-3100-965b-be4643311fa9")
public static String es_PE_COLUMN_R_RequestType_ID_Name="Request Type";

@XendraColumn(AD_Element_ID="5d38239d-4d14-9ae8-35a8-4f92ae90ab59",ColumnName="R_RequestType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="34f92876-c1df-3100-965b-be4643311fa9",
Synchronized="2020-03-27 23:42:37.0")
/** Column name R_RequestType_ID */
public static final String COLUMNNAME_R_RequestType_ID = "R_RequestType_ID";
/** Set Sales Representative.
@param SalesRep_ID Sales Representative or Company Agent */
public void setSalesRep_ID (int SalesRep_ID)
{
if (SalesRep_ID <= 0) set_Value (COLUMNNAME_SalesRep_ID, null);
 else 
set_Value (COLUMNNAME_SalesRep_ID, Integer.valueOf(SalesRep_ID));
}
/** Get Sales Representative.
@return Sales Representative or Company Agent */
public int getSalesRep_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SalesRep_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="25dd70a4-c1bb-eccb-3401-efca7187cab7")
public static String es_PE_FIELD_POSTerminal_SalesRepresentative_Name="Agente Cía";

@XendraTrl(Identifier="25dd70a4-c1bb-eccb-3401-efca7187cab7")
public static String es_PE_FIELD_POSTerminal_SalesRepresentative_Description="Representante de Ventas";

@XendraTrl(Identifier="25dd70a4-c1bb-eccb-3401-efca7187cab7")
public static String es_PE_FIELD_POSTerminal_SalesRepresentative_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="25dd70a4-c1bb-eccb-3401-efca7187cab7")
public static final String FIELDNAME_POSTerminal_SalesRepresentative="25dd70a4-c1bb-eccb-3401-efca7187cab7";

@XendraTrl(Identifier="8725a3e5-9433-0ce2-3527-3ce15965dfc7")
public static String es_PE_COLUMN_SalesRep_ID_Name="Agente Cía";

@XendraColumn(AD_Element_ID="197a9c3a-ff10-c291-d65f-5e05a36d3710",ColumnName="SalesRep_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="15251147-a1b6-4a83-a3a5-2d3ae7db69d9",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8725a3e5-9433-0ce2-3527-3ce15965dfc7",Synchronized="2020-03-27 23:42:37.0")
/** Column name SalesRep_ID */
public static final String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value != null && Value.length() > 40)
{
log.warning("Length > 40 - truncated");
Value = Value.substring(0,39);
}
set_Value (COLUMNNAME_Value, Value);
}
/** Get Search Key.
@return Search key for the record in the format required - must be unique */
public String getValue() 
{
String value = (String)get_Value(COLUMNNAME_Value);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="31c230bd-36b2-2146-0a89-7f20f433e0c1")
public static String es_PE_FIELD_POSTerminal_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="31c230bd-36b2-2146-0a89-7f20f433e0c1")
public static String es_PE_FIELD_POSTerminal_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="31c230bd-36b2-2146-0a89-7f20f433e0c1")
public static String es_PE_FIELD_POSTerminal_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="31c230bd-36b2-2146-0a89-7f20f433e0c1")
public static final String FIELDNAME_POSTerminal_SearchKey="31c230bd-36b2-2146-0a89-7f20f433e0c1";

@XendraTrl(Identifier="5278712a-7e6e-66bb-475b-7ac73703cb70")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5278712a-7e6e-66bb-475b-7ac73703cb70",
Synchronized="2020-03-27 23:42:37.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
/** Set VoidPassword.
@param VoidPassword VoidPassword */
public void setVoidPassword (String VoidPassword)
{
if (VoidPassword != null && VoidPassword.length() > 40)
{
log.warning("Length > 40 - truncated");
VoidPassword = VoidPassword.substring(0,39);
}
set_Value (COLUMNNAME_VoidPassword, VoidPassword);
}
/** Get VoidPassword.
@return VoidPassword */
public String getVoidPassword() 
{
String value = (String)get_Value(COLUMNNAME_VoidPassword);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="350bd60e-dfa2-4b70-bca2-fe7fe1193bbb")
public static String es_PE_FIELD_POSTerminal_VoidPassword_Name="Password Anular";

@XendraField(AD_Column_ID="VoidPassword",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="Access",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=350,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2020-03-27 23:42:37.0",
Identifier="350bd60e-dfa2-4b70-bca2-fe7fe1193bbb")
public static final String FIELDNAME_POSTerminal_VoidPassword="350bd60e-dfa2-4b70-bca2-fe7fe1193bbb";

@XendraTrl(Identifier="1fa558c9-1ff3-42fa-828f-a240c4a1d5b7")
public static String es_PE_COLUMN_VoidPassword_Name="voidpassword";

@XendraColumn(AD_Element_ID="e276e9a7-fbad-4169-a049-bd78c4db2443",ColumnName="VoidPassword",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1fa558c9-1ff3-42fa-828f-a240c4a1d5b7",
Synchronized="2020-03-27 23:42:37.0")
/** Column name VoidPassword */
public static final String COLUMNNAME_VoidPassword = "VoidPassword";
/** Set WizardPassword.
@param WizardPassword WizardPassword */
public void setWizardPassword (String WizardPassword)
{
if (WizardPassword != null && WizardPassword.length() > 40)
{
log.warning("Length > 40 - truncated");
WizardPassword = WizardPassword.substring(0,39);
}
set_Value (COLUMNNAME_WizardPassword, WizardPassword);
}
/** Get WizardPassword.
@return WizardPassword */
public String getWizardPassword() 
{
String value = (String)get_Value(COLUMNNAME_WizardPassword);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="14174a36-f345-4b63-be08-e10e3d0d1a3a")
public static String es_PE_FIELD_POSTerminal_WizardPassword_Name="Password Configurar POS";

@XendraField(AD_Column_ID="WizardPassword",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="Access",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=310,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2020-03-27 23:42:37.0",
Identifier="14174a36-f345-4b63-be08-e10e3d0d1a3a")
public static final String FIELDNAME_POSTerminal_WizardPassword="14174a36-f345-4b63-be08-e10e3d0d1a3a";

@XendraTrl(Identifier="34c0da20-f3e6-42bf-b37b-84a0316e616e")
public static String es_PE_COLUMN_WizardPassword_Name="wizardpassword";

@XendraColumn(AD_Element_ID="1a8da6d5-68bb-4cf1-8607-632f8c0a42ac",ColumnName="WizardPassword",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="34c0da20-f3e6-42bf-b37b-84a0316e616e",
Synchronized="2020-03-27 23:42:37.0")
/** Column name WizardPassword */
public static final String COLUMNNAME_WizardPassword = "WizardPassword";
/** Set WriteOffType.
@param WriteOffType WriteOffType */
public void setWriteOffType (String WriteOffType)
{
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

@XendraTrl(Identifier="5c096c7e-e533-4789-985b-bdec6b1f5ef9")
public static String es_PE_FIELD_POSTerminal_WriteOffType_Name="writeofftype";

@XendraField(AD_Column_ID="WriteOffType",IsCentrallyMaintained=true,
AD_Tab_ID="1ee3f7d5-c739-b2e9-a97f-2b5386a8936e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-05 22:14:42.0",
Identifier="5c096c7e-e533-4789-985b-bdec6b1f5ef9")
public static final String FIELDNAME_POSTerminal_WriteOffType="5c096c7e-e533-4789-985b-bdec6b1f5ef9";

@XendraTrl(Identifier="35c8c5ef-8df7-4fc2-bb7c-43855ec58f82")
public static String es_PE_COLUMN_WriteOffType_Name="WriteOffType";

@XendraColumn(AD_Element_ID="a3610896-3017-4b8c-9f1f-e21361226f89",ColumnName="WriteOffType",
AD_Reference_ID=17,AD_Reference_Value_ID="c41b3d42-db96-44ab-af5b-5fac4c7465e6",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="35c8c5ef-8df7-4fc2-bb7c-43855ec58f82",Synchronized="2020-03-27 23:42:37.0")
/** Column name WriteOffType */
public static final String COLUMNNAME_WriteOffType = "WriteOffType";
}
