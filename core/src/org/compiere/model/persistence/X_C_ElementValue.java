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
/** Generated Model for C_ElementValue
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_ElementValue extends PO
{
/** Standard Constructor
@param ctx context
@param C_ElementValue_ID id
@param trxName transaction
*/
public X_C_ElementValue (Properties ctx, int C_ElementValue_ID, String trxName)
{
super (ctx, C_ElementValue_ID, trxName);
/** if (C_ElementValue_ID == 0)
{
setAccountSign (null);	
// N
setAccountType (null);	
// E
setC_Element_ID (0);
setC_ElementValue_ID (0);
setIsSummary (false);	
// N
setName (null);
setPostActual (true);	
// Y
setPostBudget (true);	
// Y
setPostEncumbrance (true);	
// Y
setPostStatistical (true);	
// Y
setValue (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_ElementValue (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=188 */
public static int Table_ID=MTable.getTable_ID("C_ElementValue");

@XendraTrl(Identifier="b8bbd28a-250b-d1a1-e18d-914cad2c3314")
public static String es_PE_TAB_ElementValue_Description="Definir valores de elementos";

@XendraTrl(Identifier="b8bbd28a-250b-d1a1-e18d-914cad2c3314")
public static String es_PE_TAB_ElementValue_Help="La pestaña de valor de elemento define los valores individuales válidos para un elemento. Los valores deben estar en conformidad con el formato establecido. Si el elemento es un tipo de cuenta; entonces la clasificación de cuenta y los valores de registro también son definidos.";

@XendraTrl(Identifier="b8bbd28a-250b-d1a1-e18d-914cad2c3314")
public static String es_PE_TAB_ElementValue_Name="Cuentas";
@XendraTab(Name="Element Value",
Description="Define Element Values",
Help="The Element Value Tab defines the individual valid values for the Element.  The values must conform to the format defined.  If the Element is an Account Type then the Account Classification (Asset, Liability etc) and posting controls are also defined",
AD_Window_ID="ed28a38f-7f48-c102-93c3-c8952924b221",SeqNo=20,TabLevel=1,IsSingleRow=true,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=true,WhereClause="",
OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="b8bbd28a-250b-d1a1-e18d-914cad2c3314",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ElementValue="b8bbd28a-250b-d1a1-e18d-914cad2c3314";

@XendraTrl(Identifier="0aabf758-2446-17ab-def8-90df2ca2a8f3")
public static String es_PE_TABLE_C_ElementValue_Name="Valor del Elemento";

@XendraTable(Name="Account Element",AD_Package_ID="2ac04657-d663-47c2-4ec1-927ad71f1e96",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Account Element",Help="",
TableName="C_ElementValue",AccessLevel="2",AD_Window_ID="ed28a38f-7f48-c102-93c3-c8952924b221",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=100,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.accounting",
Identifier="0aabf758-2446-17ab-def8-90df2ca2a8f3",Synchronized="2020-03-03 21:36:54.0")
/** TableName=C_ElementValue */
public static final String Table_Name="C_ElementValue";


@XendraIndex(Name="c_elementvalue_name",Identifier="0ba69934-f359-c044-fe6b-56663039807b",
Column_Names="name",IsUnique="false",TableIdentifier="0ba69934-f359-c044-fe6b-56663039807b",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_elementvalue_name = "0ba69934-f359-c044-fe6b-56663039807b";


@XendraIndex(Name="c_elementvalue_value",Identifier="49ff948b-45c3-64f5-bf42-bc552b3007b9",
Column_Names="c_element_id, value",IsUnique="true",
TableIdentifier="49ff948b-45c3-64f5-bf42-bc552b3007b9",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_elementvalue_value = "49ff948b-45c3-64f5-bf42-bc552b3007b9";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_ElementValue");

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
    Table_ID = MTable.getTable_ID("C_ElementValue");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_ElementValue[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Account Sign.
@param AccountSign Indicates the Natural Sign of the Account as a Debit or Credit */
public void setAccountSign (String AccountSign)
{
if (AccountSign.length() > 1)
{
log.warning("Length > 1 - truncated");
AccountSign = AccountSign.substring(0,0);
}
set_Value (COLUMNNAME_AccountSign, AccountSign);
}
/** Get Account Sign.
@return Indicates the Natural Sign of the Account as a Debit or Credit */
public String getAccountSign() 
{
return (String)get_Value(COLUMNNAME_AccountSign);
}

@XendraTrl(Identifier="2bc287df-e121-a29c-bb07-aa0ac550f8ba")
public static String es_PE_FIELD_ElementValue_AccountSign_Name="Naturaleza de Cuenta";

@XendraTrl(Identifier="2bc287df-e121-a29c-bb07-aa0ac550f8ba")
public static String es_PE_FIELD_ElementValue_AccountSign_Description="Indica el signo natural de la cuenta ya sea débito ó crédito";

@XendraTrl(Identifier="2bc287df-e121-a29c-bb07-aa0ac550f8ba")
public static String es_PE_FIELD_ElementValue_AccountSign_Help="Indica si el saldo esperado para esta cuenta debería ser deudor ó acreedor";

@XendraField(AD_Column_ID="AccountSign",IsCentrallyMaintained=true,
AD_Tab_ID="b8bbd28a-250b-d1a1-e18d-914cad2c3314",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@=A",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="2bc287df-e121-a29c-bb07-aa0ac550f8ba")
public static final String FIELDNAME_ElementValue_AccountSign="2bc287df-e121-a29c-bb07-aa0ac550f8ba";

@XendraTrl(Identifier="71d00221-ba7d-a8d6-feea-30b0fe9b7a91")
public static String es_PE_COLUMN_AccountSign_Name="Naturaleza de Cuenta";

@XendraColumn(AD_Element_ID="bec935a6-86d9-7793-51fb-4ce378612a32",ColumnName="AccountSign",
AD_Reference_ID=17,AD_Reference_Value_ID="f63281b9-9b5a-42c0-e4ec-3240ca6a08f1",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="71d00221-ba7d-a8d6-feea-30b0fe9b7a91",Synchronized="2019-08-30 22:21:34.0")
/** Column name AccountSign */
public static final String COLUMNNAME_AccountSign = "AccountSign";
/** Set Account Type.
@param AccountType Indicates the type of account */
public void setAccountType (String AccountType)
{
if (AccountType.length() > 1)
{
log.warning("Length > 1 - truncated");
AccountType = AccountType.substring(0,0);
}
set_Value (COLUMNNAME_AccountType, AccountType);
}
/** Get Account Type.
@return Indicates the type of account */
public String getAccountType() 
{
return (String)get_Value(COLUMNNAME_AccountType);
}

@XendraTrl(Identifier="d9d860e9-127b-8339-cfdb-fccab0430c61")
public static String es_PE_FIELD_ElementValue_AccountType_Name="Tipo de Cuenta";

@XendraTrl(Identifier="d9d860e9-127b-8339-cfdb-fccab0430c61")
public static String es_PE_FIELD_ElementValue_AccountType_Description="Indica el tipo de cuenta";

@XendraTrl(Identifier="d9d860e9-127b-8339-cfdb-fccab0430c61")
public static String es_PE_FIELD_ElementValue_AccountType_Help="Tipos de cuenta válidos son A - Activo; E - Gastos; L - Pasivo; O - Propietario";

@XendraField(AD_Column_ID="AccountType",IsCentrallyMaintained=true,
AD_Tab_ID="b8bbd28a-250b-d1a1-e18d-914cad2c3314",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@=A",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d9d860e9-127b-8339-cfdb-fccab0430c61")
public static final String FIELDNAME_ElementValue_AccountType="d9d860e9-127b-8339-cfdb-fccab0430c61";

@XendraTrl(Identifier="f4573337-d393-dc3a-c1dc-09d3afba7ab8")
public static String es_PE_COLUMN_AccountType_Name="Tipo de Cuenta";

@XendraColumn(AD_Element_ID="ec156e95-2067-29e9-eb38-6c9e67f8a90d",ColumnName="AccountType",
AD_Reference_ID=17,AD_Reference_Value_ID="c9364c64-6481-06c6-6a91-931ae4cfdb71",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="E",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f4573337-d393-dc3a-c1dc-09d3afba7ab8",Synchronized="2019-08-30 22:21:34.0")
/** Column name AccountType */
public static final String COLUMNNAME_AccountType = "AccountType";
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

@XendraTrl(Identifier="bfd013ef-b21f-0db0-67e7-3b3ad5103f80")
public static String es_PE_FIELD_ElementValue_BankAccount_Name="Cuenta Bancaria";

@XendraTrl(Identifier="bfd013ef-b21f-0db0-67e7-3b3ad5103f80")
public static String es_PE_FIELD_ElementValue_BankAccount_Description="Cuenta bancaria";

@XendraTrl(Identifier="bfd013ef-b21f-0db0-67e7-3b3ad5103f80")
public static String es_PE_FIELD_ElementValue_BankAccount_Help="La cuenta bancaria identifica una cuenta en este banco";

@XendraField(AD_Column_ID="C_BankAccount_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b8bbd28a-250b-d1a1-e18d-914cad2c3314",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@=A & @IsSummary@=N & @IsBankAccount@=Y",DisplayLength=14,
IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,
Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bfd013ef-b21f-0db0-67e7-3b3ad5103f80")
public static final String FIELDNAME_ElementValue_BankAccount="bfd013ef-b21f-0db0-67e7-3b3ad5103f80";

@XendraTrl(Identifier="21a3ddb0-0982-edf9-2242-0368868f828c")
public static String es_PE_COLUMN_C_BankAccount_ID_Name="Cuenta Bancaria";

@XendraColumn(AD_Element_ID="5a03bc67-316f-bd8c-9e68-b009ad1b290b",ColumnName="C_BankAccount_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="21a3ddb0-0982-edf9-2242-0368868f828c",
Synchronized="2019-08-30 22:21:34.0")
/** Column name C_BankAccount_ID */
public static final String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID <= 0) set_Value (COLUMNNAME_C_Currency_ID, null);
 else 
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

@XendraTrl(Identifier="19488fe6-14b9-0b79-81d0-91574ef8e759")
public static String es_PE_FIELD_ElementValue_Currency_Name="Moneda";

@XendraTrl(Identifier="19488fe6-14b9-0b79-81d0-91574ef8e759")
public static String es_PE_FIELD_ElementValue_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="19488fe6-14b9-0b79-81d0-91574ef8e759")
public static String es_PE_FIELD_ElementValue_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b8bbd28a-250b-d1a1-e18d-914cad2c3314",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@=A & @IsSummary@=N & @IsBankAccount@=Y & @IsForeignCurrency@=Y",
DisplayLength=14,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="19488fe6-14b9-0b79-81d0-91574ef8e759")
public static final String FIELDNAME_ElementValue_Currency="19488fe6-14b9-0b79-81d0-91574ef8e759";

@XendraTrl(Identifier="8d67419a-3e57-281d-e38f-ae4d3ec29256")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8d67419a-3e57-281d-e38f-ae4d3ec29256",
Synchronized="2019-08-30 22:21:34.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Element.
@param C_Element_ID Accounting Element */
public void setC_Element_ID (int C_Element_ID)
{
if (C_Element_ID < 1) throw new IllegalArgumentException ("C_Element_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Element_ID, Integer.valueOf(C_Element_ID));
}
/** Get Element.
@return Accounting Element */
public int getC_Element_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Element_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3b837e15-4683-e634-7d20-f35a619edeb6")
public static String es_PE_FIELD_ElementValue_Element_Name="Elemento";

@XendraTrl(Identifier="3b837e15-4683-e634-7d20-f35a619edeb6")
public static String es_PE_FIELD_ElementValue_Element_Description="Elemento de Cuenta";

@XendraTrl(Identifier="3b837e15-4683-e634-7d20-f35a619edeb6")
public static String es_PE_FIELD_ElementValue_Element_Help="El elemento cuenta identifica únicamente una cuenta. El conjunto es conocido comúnmente como catálogo de cuentas";

@XendraField(AD_Column_ID="C_Element_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b8bbd28a-250b-d1a1-e18d-914cad2c3314",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3b837e15-4683-e634-7d20-f35a619edeb6")
public static final String FIELDNAME_ElementValue_Element="3b837e15-4683-e634-7d20-f35a619edeb6";

@XendraTrl(Identifier="6cbe9c01-588f-45c5-455c-66e4c8aae2c2")
public static String es_PE_COLUMN_C_Element_ID_Name="Elemento";

@XendraColumn(AD_Element_ID="39b73755-e186-38a7-a23f-0283cb7c1155",ColumnName="C_Element_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6cbe9c01-588f-45c5-455c-66e4c8aae2c2",
Synchronized="2019-08-30 22:21:34.0")
/** Column name C_Element_ID */
public static final String COLUMNNAME_C_Element_ID = "C_Element_ID";
/** Set Account Element.
@param C_ElementValue_ID Account Element */
public void setC_ElementValue_ID (int C_ElementValue_ID)
{
if (C_ElementValue_ID < 1) throw new IllegalArgumentException ("C_ElementValue_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_ElementValue_ID, Integer.valueOf(C_ElementValue_ID));
}
/** Get Account Element.
@return Account Element */
public int getC_ElementValue_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ElementValue_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ab0bae35-cb96-58dd-5533-a6d23c961e6f")
public static String es_PE_FIELD_ElementValue_AccountElement_Name="Valor del Elemento";

@XendraTrl(Identifier="ab0bae35-cb96-58dd-5533-a6d23c961e6f")
public static String es_PE_FIELD_ElementValue_AccountElement_Description="Valor del Elemento";

@XendraTrl(Identifier="ab0bae35-cb96-58dd-5533-a6d23c961e6f")
public static String es_PE_FIELD_ElementValue_AccountElement_Help="El valor de elemento es un identificador único de una instancia de un elemento.";

@XendraField(AD_Column_ID="C_ElementValue_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b8bbd28a-250b-d1a1-e18d-914cad2c3314",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ab0bae35-cb96-58dd-5533-a6d23c961e6f")
public static final String FIELDNAME_ElementValue_AccountElement="ab0bae35-cb96-58dd-5533-a6d23c961e6f";
/** Column name C_ElementValue_ID */
public static final String COLUMNNAME_C_ElementValue_ID = "C_ElementValue_ID";
/** Set General BalanceSubject.
@param C_Subject_ID General BalanceSubject */
public void setC_Subject_ID (int C_Subject_ID)
{
if (C_Subject_ID <= 0) set_Value (COLUMNNAME_C_Subject_ID, null);
 else 
set_Value (COLUMNNAME_C_Subject_ID, Integer.valueOf(C_Subject_ID));
}
/** Get General BalanceSubject.
@return General BalanceSubject */
public int getC_Subject_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Subject_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="702c56e5-c72d-8099-f95e-9e416f1e16cf")
public static String es_PE_FIELD_ElementValue_GeneralBalanceSubject_Name="Rubros del Balance General";

@XendraTrl(Identifier="702c56e5-c72d-8099-f95e-9e416f1e16cf")
public static String es_PE_FIELD_ElementValue_GeneralBalanceSubject_Description="Agrupa los rubros para el Balance General";

@XendraTrl(Identifier="702c56e5-c72d-8099-f95e-9e416f1e16cf")
public static String es_PE_FIELD_ElementValue_GeneralBalanceSubject_Help="Los rubros del Balance nos serviran para agrupar las cuentas, de tal forma que aparezcan los saldos correctos en este estado financierol";

@XendraField(AD_Column_ID="C_Subject_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b8bbd28a-250b-d1a1-e18d-914cad2c3314",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="702c56e5-c72d-8099-f95e-9e416f1e16cf")
public static final String FIELDNAME_ElementValue_GeneralBalanceSubject="702c56e5-c72d-8099-f95e-9e416f1e16cf";

@XendraTrl(Identifier="e1e12d1f-5f70-eeb9-7927-4d14b48af36a")
public static String es_PE_COLUMN_C_Subject_ID_Name="General BalanceSubject";

@XendraColumn(AD_Element_ID="cf4ce89d-7b61-08a5-bea4-75a61a221932",ColumnName="C_Subject_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="2b999daa-5363-8c8f-d398-3b46c7c257ba",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e1e12d1f-5f70-eeb9-7927-4d14b48af36a",Synchronized="2019-08-30 22:21:34.0")
/** Column name C_Subject_ID */
public static final String COLUMNNAME_C_Subject_ID = "C_Subject_ID";
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

@XendraTrl(Identifier="1b6395e6-e470-6298-178b-1a7d8c24feed")
public static String es_PE_FIELD_ElementValue_Description_Name="Observación";

@XendraTrl(Identifier="1b6395e6-e470-6298-178b-1a7d8c24feed")
public static String es_PE_FIELD_ElementValue_Description_Description="Observación";

@XendraTrl(Identifier="1b6395e6-e470-6298-178b-1a7d8c24feed")
public static String es_PE_FIELD_ElementValue_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="b8bbd28a-250b-d1a1-e18d-914cad2c3314",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1b6395e6-e470-6298-178b-1a7d8c24feed")
public static final String FIELDNAME_ElementValue_Description="1b6395e6-e470-6298-178b-1a7d8c24feed";

@XendraTrl(Identifier="33695b76-7355-a8ac-3d01-4f81b2ee8597")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="33695b76-7355-a8ac-3d01-4f81b2ee8597",
Synchronized="2019-08-30 22:21:34.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set EGPF_C_Subject_ID.
@param EGPF_C_Subject_ID EGPF_C_Subject_ID */
public void setEGPF_C_Subject_ID (int EGPF_C_Subject_ID)
{
if (EGPF_C_Subject_ID <= 0) set_Value (COLUMNNAME_EGPF_C_Subject_ID, null);
 else 
set_Value (COLUMNNAME_EGPF_C_Subject_ID, Integer.valueOf(EGPF_C_Subject_ID));
}
/** Get EGPF_C_Subject_ID.
@return EGPF_C_Subject_ID */
public int getEGPF_C_Subject_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_EGPF_C_Subject_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1b2b4143-2452-10ad-2420-856feb4c766a")
public static String es_PE_FIELD_ElementValue_EGPF_C_Subject_ID_Name="Rubros del EGPF";

@XendraTrl(Identifier="1b2b4143-2452-10ad-2420-856feb4c766a")
public static String es_PE_FIELD_ElementValue_EGPF_C_Subject_ID_Description="Rubros del Estado de Ganancias y Perdidas por Funcion";

@XendraTrl(Identifier="1b2b4143-2452-10ad-2420-856feb4c766a")
public static String es_PE_FIELD_ElementValue_EGPF_C_Subject_ID_Help="Estos rubros nos permitiran agrupar las cuentas de tal forma que se muetren los saldos correctos en este estado financiero";

@XendraField(AD_Column_ID="EGPF_C_Subject_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b8bbd28a-250b-d1a1-e18d-914cad2c3314",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1b2b4143-2452-10ad-2420-856feb4c766a")
public static final String FIELDNAME_ElementValue_EGPF_C_Subject_ID="1b2b4143-2452-10ad-2420-856feb4c766a";

@XendraTrl(Identifier="b46ae897-9645-46cd-1ff3-8e4d1add8d51")
public static String es_PE_COLUMN_EGPF_C_Subject_ID_Name="General BalanceSubject";

@XendraColumn(AD_Element_ID="e2ca4ec0-aa30-6e72-7e30-f5072ccdc27b",ColumnName="EGPF_C_Subject_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="04727e19-8cf0-0f0d-977e-b1393f5e6d19",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b46ae897-9645-46cd-1ff3-8e4d1add8d51",Synchronized="2019-08-30 22:21:34.0")
/** Column name EGPF_C_Subject_ID */
public static final String COLUMNNAME_EGPF_C_Subject_ID = "EGPF_C_Subject_ID";
/** Set EGPN_C_Subject_ID.
@param EGPN_C_Subject_ID EGPN_C_Subject_ID */
public void setEGPN_C_Subject_ID (int EGPN_C_Subject_ID)
{
if (EGPN_C_Subject_ID <= 0) set_Value (COLUMNNAME_EGPN_C_Subject_ID, null);
 else 
set_Value (COLUMNNAME_EGPN_C_Subject_ID, Integer.valueOf(EGPN_C_Subject_ID));
}
/** Get EGPN_C_Subject_ID.
@return EGPN_C_Subject_ID */
public int getEGPN_C_Subject_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_EGPN_C_Subject_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d5baf676-d701-77e7-9899-002b5f12389b")
public static String es_PE_FIELD_ElementValue_EGPN_C_Subject_ID_Name="Rubros del EGPN";

@XendraTrl(Identifier="d5baf676-d701-77e7-9899-002b5f12389b")
public static String es_PE_FIELD_ElementValue_EGPN_C_Subject_ID_Description="Son los rubros del Estado de Ganancias y Perdidas por Naturaleza";

@XendraTrl(Identifier="d5baf676-d701-77e7-9899-002b5f12389b")
public static String es_PE_FIELD_ElementValue_EGPN_C_Subject_ID_Help="Estos rubros nos ayudaran  a agrupar las cuentas de tal forma que se muestren los saldos correctos en este Esatdo Financiero";

@XendraField(AD_Column_ID="EGPN_C_Subject_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b8bbd28a-250b-d1a1-e18d-914cad2c3314",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d5baf676-d701-77e7-9899-002b5f12389b")
public static final String FIELDNAME_ElementValue_EGPN_C_Subject_ID="d5baf676-d701-77e7-9899-002b5f12389b";

@XendraTrl(Identifier="4b8041fa-241e-034a-8097-860139edb5f3")
public static String es_PE_COLUMN_EGPN_C_Subject_ID_Name="General BalanceSubject";

@XendraColumn(AD_Element_ID="cd9cd72c-dc1d-e59a-3b7c-7e5e3da3f5f4",ColumnName="EGPN_C_Subject_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="e04d59ff-05e3-57f6-56da-18fcb87ee4fa",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4b8041fa-241e-034a-8097-860139edb5f3",Synchronized="2019-08-30 22:21:34.0")
/** Column name EGPN_C_Subject_ID */
public static final String COLUMNNAME_EGPN_C_Subject_ID = "EGPN_C_Subject_ID";
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
@XendraTrl(Identifier="647a4b76-b1e6-4484-9eba-e26af7d4c63f")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="647a4b76-b1e6-4484-9eba-e26af7d4c63f",
Synchronized="2019-08-30 22:21:34.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Bank Account.
@param IsBankAccount Indicates if this is the Bank Account */
public void setIsBankAccount (boolean IsBankAccount)
{
set_Value (COLUMNNAME_IsBankAccount, Boolean.valueOf(IsBankAccount));
}
/** Get Bank Account.
@return Indicates if this is the Bank Account */
public boolean isBankAccount() 
{
Object oo = get_Value(COLUMNNAME_IsBankAccount);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="7f79a9d0-e30f-80b0-e5d9-6e36156c56c9")
public static String es_PE_FIELD_ElementValue_BankAccount2_Name="Cuenta de Banco";

@XendraTrl(Identifier="7f79a9d0-e30f-80b0-e5d9-6e36156c56c9")
public static String es_PE_FIELD_ElementValue_BankAccount2_Description="Indica si ésta es la cuenta bancaria";

@XendraTrl(Identifier="7f79a9d0-e30f-80b0-e5d9-6e36156c56c9")
public static String es_PE_FIELD_ElementValue_BankAccount2_Help="El cuadro de verificación Cuenta Bancaria indica si la cuenta es la cuenta bancaria";

@XendraField(AD_Column_ID="IsBankAccount",IsCentrallyMaintained=true,
AD_Tab_ID="b8bbd28a-250b-d1a1-e18d-914cad2c3314",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@=A & @IsSummary@=N",DisplayLength=1,IsReadOnly=false,SeqNo=180,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="7f79a9d0-e30f-80b0-e5d9-6e36156c56c9")
public static final String FIELDNAME_ElementValue_BankAccount2="7f79a9d0-e30f-80b0-e5d9-6e36156c56c9";

@XendraTrl(Identifier="bd85d908-0a0d-16fa-65f9-6f6d98756f6f")
public static String es_PE_COLUMN_IsBankAccount_Name="Cuenta de Banco";

@XendraColumn(AD_Element_ID="3b57d4e8-6d81-de4f-7335-ce3949d3020e",ColumnName="IsBankAccount",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bd85d908-0a0d-16fa-65f9-6f6d98756f6f",
Synchronized="2019-08-30 22:21:34.0")
/** Column name IsBankAccount */
public static final String COLUMNNAME_IsBankAccount = "IsBankAccount";
/** Set Document Controlled.
@param IsDocControlled Control account - If an account is controlled by a document, you cannot post manually to it */
public void setIsDocControlled (boolean IsDocControlled)
{
set_Value (COLUMNNAME_IsDocControlled, Boolean.valueOf(IsDocControlled));
}
/** Get Document Controlled.
@return Control account - If an account is controlled by a document, you cannot post manually to it */
public boolean isDocControlled() 
{
Object oo = get_Value(COLUMNNAME_IsDocControlled);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="ce1eceb6-1c61-d523-ec5b-6538b00a1175")
public static String es_PE_FIELD_ElementValue_DocumentControlled_Name="Cuenta Controlada";

@XendraTrl(Identifier="ce1eceb6-1c61-d523-ec5b-6538b00a1175")
public static String es_PE_FIELD_ElementValue_DocumentControlled_Description="Control de cuenta - Si una cuenta es controlada por un documento";

@XendraField(AD_Column_ID="IsDocControlled",IsCentrallyMaintained=true,
AD_Tab_ID="b8bbd28a-250b-d1a1-e18d-914cad2c3314",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@=A & @IsSummary@=N",DisplayLength=1,IsReadOnly=false,SeqNo=160,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="ce1eceb6-1c61-d523-ec5b-6538b00a1175")
public static final String FIELDNAME_ElementValue_DocumentControlled="ce1eceb6-1c61-d523-ec5b-6538b00a1175";

@XendraTrl(Identifier="c9c91055-fa73-4b1a-7ae0-cf1bc74fe55c")
public static String es_PE_COLUMN_IsDocControlled_Name="Cuenta Controlada";

@XendraColumn(AD_Element_ID="06ca55f5-5c24-e757-3a01-bb392d837253",ColumnName="IsDocControlled",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c9c91055-fa73-4b1a-7ae0-cf1bc74fe55c",
Synchronized="2019-08-30 22:21:34.0")
/** Column name IsDocControlled */
public static final String COLUMNNAME_IsDocControlled = "IsDocControlled";
/** Set isDocTypeAccount.
@param isDocTypeAccount isDocTypeAccount */
public void setisDocTypeAccount (boolean isDocTypeAccount)
{
set_Value (COLUMNNAME_isDocTypeAccount, Boolean.valueOf(isDocTypeAccount));
}
/** Get isDocTypeAccount.
@return isDocTypeAccount */
public boolean isDocTypeAccount() 
{
Object oo = get_Value(COLUMNNAME_isDocTypeAccount);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="6b222b6b-b5b4-4928-2045-d47252b5a736")
public static String es_PE_COLUMN_isDocTypeAccount_Name="isdoctypeaccount";

@XendraColumn(AD_Element_ID="c5270666-d78d-6c13-04bd-4ce86c588f0e",ColumnName="isDocTypeAccount",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6b222b6b-b5b4-4928-2045-d47252b5a736",
Synchronized="2019-08-30 22:21:34.0")
/** Column name isDocTypeAccount */
public static final String COLUMNNAME_isDocTypeAccount = "isDocTypeAccount";
/** Set Foreign Currency Account.
@param IsForeignCurrency Balances in foreign currency accounts are held in the nominated currency */
public void setIsForeignCurrency (boolean IsForeignCurrency)
{
set_Value (COLUMNNAME_IsForeignCurrency, Boolean.valueOf(IsForeignCurrency));
}
/** Get Foreign Currency Account.
@return Balances in foreign currency accounts are held in the nominated currency */
public boolean isForeignCurrency() 
{
Object oo = get_Value(COLUMNNAME_IsForeignCurrency);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="7e49a70a-251f-ee5a-65ba-2963220bb7d1")
public static String es_PE_FIELD_ElementValue_ForeignCurrencyAccount_Name="Cuenta en Moneda Extranjera";

@XendraTrl(Identifier="7e49a70a-251f-ee5a-65ba-2963220bb7d1")
public static String es_PE_FIELD_ElementValue_ForeignCurrencyAccount_Description="Saldos en cuentas en moneda extranjera son retenidos en la moneda nominada";

@XendraTrl(Identifier="7e49a70a-251f-ee5a-65ba-2963220bb7d1")
public static String es_PE_FIELD_ElementValue_ForeignCurrencyAccount_Help="Cuentas de Saldos en moneda extranjera son mantenidas en la moneda nominal y convertidas a la moneda funcional";

@XendraField(AD_Column_ID="IsForeignCurrency",IsCentrallyMaintained=true,
AD_Tab_ID="b8bbd28a-250b-d1a1-e18d-914cad2c3314",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@=A & @IsSummary@=N & @IsBankAccount@=Y",DisplayLength=1,
IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,
Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7e49a70a-251f-ee5a-65ba-2963220bb7d1")
public static final String FIELDNAME_ElementValue_ForeignCurrencyAccount="7e49a70a-251f-ee5a-65ba-2963220bb7d1";

@XendraTrl(Identifier="5b43fa23-755a-045f-7031-5de7603c2b90")
public static String es_PE_COLUMN_IsForeignCurrency_Name="Cuenta en Moneda Extranjera";

@XendraColumn(AD_Element_ID="523a960b-2cc5-35a0-2fdb-126b3d0151c8",ColumnName="IsForeignCurrency",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5b43fa23-755a-045f-7031-5de7603c2b90",
Synchronized="2019-08-30 22:21:34.0")
/** Column name IsForeignCurrency */
public static final String COLUMNNAME_IsForeignCurrency = "IsForeignCurrency";
/** Set Group by.
@param IsGroupBy After a group change, totals, etc. are printed */
public void setIsGroupBy (boolean IsGroupBy)
{
set_Value (COLUMNNAME_IsGroupBy, Boolean.valueOf(IsGroupBy));
}
/** Get Group by.
@return After a group change, totals, etc. are printed */
public boolean isGroupBy() 
{
Object oo = get_Value(COLUMNNAME_IsGroupBy);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f6adadb5-380f-4726-a5af-163d1e8b485a")
public static String es_PE_COLUMN_IsGroupBy_Name="Group by";

@XendraColumn(AD_Element_ID="f8a6ffa1-c1b3-8dd9-03fa-aac88ed27cf1",ColumnName="IsGroupBy",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f6adadb5-380f-4726-a5af-163d1e8b485a",
Synchronized="2019-08-30 22:21:34.0")
/** Column name IsGroupBy */
public static final String COLUMNNAME_IsGroupBy = "IsGroupBy";
/** Set Summary Level.
@param IsSummary This is a summary entity */
public void setIsSummary (boolean IsSummary)
{
set_Value (COLUMNNAME_IsSummary, Boolean.valueOf(IsSummary));
}
/** Get Summary Level.
@return This is a summary entity */
public boolean isSummary() 
{
Object oo = get_Value(COLUMNNAME_IsSummary);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="a7ca74a7-d850-99af-51ba-d508ef992bc7")
public static String es_PE_FIELD_ElementValue_SummaryLevel_Name="Entidad Acumulada";

@XendraTrl(Identifier="a7ca74a7-d850-99af-51ba-d508ef992bc7")
public static String es_PE_FIELD_ElementValue_SummaryLevel_Description="Esta es una entidad sumaria";

@XendraTrl(Identifier="a7ca74a7-d850-99af-51ba-d508ef992bc7")
public static String es_PE_FIELD_ElementValue_SummaryLevel_Help="Una entidad sumaria representa una rama en un árbol mas bien que un nodo final. Las entidades sumarias son usadas para reportar y no tienen valores propios";

@XendraField(AD_Column_ID="IsSummary",IsCentrallyMaintained=true,
AD_Tab_ID="b8bbd28a-250b-d1a1-e18d-914cad2c3314",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a7ca74a7-d850-99af-51ba-d508ef992bc7")
public static final String FIELDNAME_ElementValue_SummaryLevel="a7ca74a7-d850-99af-51ba-d508ef992bc7";

@XendraTrl(Identifier="78604cc8-260c-3468-7175-230a49e8edf6")
public static String es_PE_COLUMN_IsSummary_Name="Entidad Acumulada";

@XendraColumn(AD_Element_ID="0ecd1d56-9e2b-8778-7b05-92730d811ad4",ColumnName="IsSummary",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="78604cc8-260c-3468-7175-230a49e8edf6",
Synchronized="2019-08-30 22:21:34.0")
/** Column name IsSummary */
public static final String COLUMNNAME_IsSummary = "IsSummary";
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
@XendraTrl(Identifier="faa21f6d-1a78-e930-ef42-ad14a01bbf99")
public static String es_PE_FIELD_ElementValue_Name_Name="Nombre";

@XendraTrl(Identifier="faa21f6d-1a78-e930-ef42-ad14a01bbf99")
public static String es_PE_FIELD_ElementValue_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="faa21f6d-1a78-e930-ef42-ad14a01bbf99")
public static String es_PE_FIELD_ElementValue_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="b8bbd28a-250b-d1a1-e18d-914cad2c3314",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="faa21f6d-1a78-e930-ef42-ad14a01bbf99")
public static final String FIELDNAME_ElementValue_Name="faa21f6d-1a78-e930-ef42-ad14a01bbf99";

@XendraTrl(Identifier="2751e54e-a4f4-eb82-aa6f-fd430fb7b335")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2751e54e-a4f4-eb82-aa6f-fd430fb7b335",
Synchronized="2019-08-30 22:21:34.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Post Actual.
@param PostActual Actual Values can be posted */
public void setPostActual (boolean PostActual)
{
set_Value (COLUMNNAME_PostActual, Boolean.valueOf(PostActual));
}
/** Get Post Actual.
@return Actual Values can be posted */
public boolean isPostActual() 
{
Object oo = get_Value(COLUMNNAME_PostActual);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="1c584278-deff-9f59-be8f-b64c61e0647d")
public static String es_PE_FIELD_ElementValue_PostActual_Name="Aplicar Reales";

@XendraTrl(Identifier="1c584278-deff-9f59-be8f-b64c61e0647d")
public static String es_PE_FIELD_ElementValue_PostActual_Description="Valores reales pueden ser aplicados";

@XendraTrl(Identifier="1c584278-deff-9f59-be8f-b64c61e0647d")
public static String es_PE_FIELD_ElementValue_PostActual_Help="El campo Aplicar Reales indica si valores reales pueden ser aplicados a este elemento contable";

@XendraField(AD_Column_ID="PostActual",IsCentrallyMaintained=true,
AD_Tab_ID="b8bbd28a-250b-d1a1-e18d-914cad2c3314",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@=A & @IsSummary@='N'",DisplayLength=1,IsReadOnly=false,SeqNo=130,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="1c584278-deff-9f59-be8f-b64c61e0647d")
public static final String FIELDNAME_ElementValue_PostActual="1c584278-deff-9f59-be8f-b64c61e0647d";

@XendraTrl(Identifier="0bd504f7-c1bc-7109-387a-e84da0d44f9c")
public static String es_PE_COLUMN_PostActual_Name="Aplicar Reales";

@XendraColumn(AD_Element_ID="cda96ec7-2ae3-713e-0f2c-74729858394d",ColumnName="PostActual",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0bd504f7-c1bc-7109-387a-e84da0d44f9c",
Synchronized="2019-08-30 22:21:35.0")
/** Column name PostActual */
public static final String COLUMNNAME_PostActual = "PostActual";
/** Set Post Budget.
@param PostBudget Budget values can be posted */
public void setPostBudget (boolean PostBudget)
{
set_Value (COLUMNNAME_PostBudget, Boolean.valueOf(PostBudget));
}
/** Get Post Budget.
@return Budget values can be posted */
public boolean isPostBudget() 
{
Object oo = get_Value(COLUMNNAME_PostBudget);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="42bdf034-9d0d-26b3-4c32-c9b0c82bf613")
public static String es_PE_FIELD_ElementValue_PostBudget_Name="Aplicar Presupuesto";

@XendraTrl(Identifier="42bdf034-9d0d-26b3-4c32-c9b0c82bf613")
public static String es_PE_FIELD_ElementValue_PostBudget_Description="Valores del presupuesto pueden ser aplicados";

@XendraTrl(Identifier="42bdf034-9d0d-26b3-4c32-c9b0c82bf613")
public static String es_PE_FIELD_ElementValue_PostBudget_Help="Presupuesto Aplicado indica si los valores del presupuesto pueden ser aplicados a este valor de elemento";

@XendraField(AD_Column_ID="PostBudget",IsCentrallyMaintained=true,
AD_Tab_ID="b8bbd28a-250b-d1a1-e18d-914cad2c3314",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@=A & @IsSummary@=N",DisplayLength=1,IsReadOnly=false,SeqNo=150,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="42bdf034-9d0d-26b3-4c32-c9b0c82bf613")
public static final String FIELDNAME_ElementValue_PostBudget="42bdf034-9d0d-26b3-4c32-c9b0c82bf613";

@XendraTrl(Identifier="c5ce3d7e-e73c-ae97-d7a5-6e1f108a5d1a")
public static String es_PE_COLUMN_PostBudget_Name="Aplicar Presupuesto";

@XendraColumn(AD_Element_ID="1b7d2215-dff9-14b7-c2f9-d622b2191b03",ColumnName="PostBudget",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c5ce3d7e-e73c-ae97-d7a5-6e1f108a5d1a",
Synchronized="2019-08-30 22:21:35.0")
/** Column name PostBudget */
public static final String COLUMNNAME_PostBudget = "PostBudget";
/** Set Post Encumbrance.
@param PostEncumbrance Post commitments to this account */
public void setPostEncumbrance (boolean PostEncumbrance)
{
set_Value (COLUMNNAME_PostEncumbrance, Boolean.valueOf(PostEncumbrance));
}
/** Get Post Encumbrance.
@return Post commitments to this account */
public boolean isPostEncumbrance() 
{
Object oo = get_Value(COLUMNNAME_PostEncumbrance);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="b148f03f-736c-e3dd-bd50-76fa44561a64")
public static String es_PE_FIELD_ElementValue_PostEncumbrance_Name="Aplicar Gravámenes";

@XendraTrl(Identifier="b148f03f-736c-e3dd-bd50-76fa44561a64")
public static String es_PE_FIELD_ElementValue_PostEncumbrance_Description="Registro de gravámenes a esta cuenta";

@XendraField(AD_Column_ID="PostEncumbrance",IsCentrallyMaintained=true,
AD_Tab_ID="b8bbd28a-250b-d1a1-e18d-914cad2c3314",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@ElementType@=A & @IsSummary@='N'",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b148f03f-736c-e3dd-bd50-76fa44561a64")
public static final String FIELDNAME_ElementValue_PostEncumbrance="b148f03f-736c-e3dd-bd50-76fa44561a64";

@XendraTrl(Identifier="f028302f-92d2-fd74-3960-df39a14086e9")
public static String es_PE_COLUMN_PostEncumbrance_Name="Aplicar Gravámenes";

@XendraColumn(AD_Element_ID="f67d6dbb-7034-6df3-63e0-0f0003ffb2a7",ColumnName="PostEncumbrance",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f028302f-92d2-fd74-3960-df39a14086e9",
Synchronized="2019-08-30 22:21:35.0")
/** Column name PostEncumbrance */
public static final String COLUMNNAME_PostEncumbrance = "PostEncumbrance";
/** Set Post Statistical.
@param PostStatistical Post statistical quantities to this account? */
public void setPostStatistical (boolean PostStatistical)
{
set_Value (COLUMNNAME_PostStatistical, Boolean.valueOf(PostStatistical));
}
/** Get Post Statistical.
@return Post statistical quantities to this account? */
public boolean isPostStatistical() 
{
Object oo = get_Value(COLUMNNAME_PostStatistical);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="d8e7c98c-e4ce-02fc-fc6d-a3142cdae695")
public static String es_PE_FIELD_ElementValue_PostStatistical_Name="Aplicar Estadísticas";

@XendraTrl(Identifier="d8e7c98c-e4ce-02fc-fc6d-a3142cdae695")
public static String es_PE_FIELD_ElementValue_PostStatistical_Description="Registro de cantidades estadísticas a esta cuenta";

@XendraField(AD_Column_ID="PostStatistical",IsCentrallyMaintained=true,
AD_Tab_ID="b8bbd28a-250b-d1a1-e18d-914cad2c3314",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@=A & @IsSummary@=N",DisplayLength=1,IsReadOnly=false,SeqNo=170,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d8e7c98c-e4ce-02fc-fc6d-a3142cdae695")
public static final String FIELDNAME_ElementValue_PostStatistical="d8e7c98c-e4ce-02fc-fc6d-a3142cdae695";

@XendraTrl(Identifier="60c6c034-4ebd-553c-0a18-f0fb6d4e89de")
public static String es_PE_COLUMN_PostStatistical_Name="Aplicar Estadísticas";

@XendraColumn(AD_Element_ID="bd510cfd-555b-caae-2da4-894be696a886",ColumnName="PostStatistical",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="60c6c034-4ebd-553c-0a18-f0fb6d4e89de",
Synchronized="2019-08-30 22:21:35.0")
/** Column name PostStatistical */
public static final String COLUMNNAME_PostStatistical = "PostStatistical";
/** Set TypeGroupingClose.
@param TypeGroupingClose TypeGroupingClose */
public void setTypeGroupingClose (String TypeGroupingClose)
{
if (TypeGroupingClose != null && TypeGroupingClose.length() > 1)
{
log.warning("Length > 1 - truncated");
TypeGroupingClose = TypeGroupingClose.substring(0,0);
}
set_Value (COLUMNNAME_TypeGroupingClose, TypeGroupingClose);
}
/** Get TypeGroupingClose.
@return TypeGroupingClose */
public String getTypeGroupingClose() 
{
return (String)get_Value(COLUMNNAME_TypeGroupingClose);
}

@XendraTrl(Identifier="bbabeefe-aa78-4919-8f72-dc1833f4ab53")
public static String es_PE_COLUMN_TypeGroupingClose_Name="typegroupingclose";

@XendraColumn(AD_Element_ID="45d5c981-80ec-4281-bad9-354a1ee93e01",ColumnName="TypeGroupingClose",
AD_Reference_ID=17,AD_Reference_Value_ID="6d8e78d8-245d-5cd6-3082-2b2ad6173949",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="bbabeefe-aa78-4919-8f72-dc1833f4ab53",Synchronized="2019-08-30 22:21:35.0")
/** Column name TypeGroupingClose */
public static final String COLUMNNAME_TypeGroupingClose = "TypeGroupingClose";
/** Set Valid from.
@param ValidFrom Valid from including this date (first day) */
public void setValidFrom (Timestamp ValidFrom)
{
set_Value (COLUMNNAME_ValidFrom, ValidFrom);
}
/** Get Valid from.
@return Valid from including this date (first day) */
public Timestamp getValidFrom() 
{
return (Timestamp)get_Value(COLUMNNAME_ValidFrom);
}

@XendraTrl(Identifier="b404a39d-50a0-48a2-4672-e28b4bd75c71")
public static String es_PE_FIELD_ElementValue_ValidFrom_Name="Válido Desde";

@XendraTrl(Identifier="b404a39d-50a0-48a2-4672-e28b4bd75c71")
public static String es_PE_FIELD_ElementValue_ValidFrom_Description="Válido desde; incluyendo esta fecha (primer día)";

@XendraTrl(Identifier="b404a39d-50a0-48a2-4672-e28b4bd75c71")
public static String es_PE_FIELD_ElementValue_ValidFrom_Help="La fecha válida desde indica el primer día de un rango de fechas";

@XendraField(AD_Column_ID="ValidFrom",IsCentrallyMaintained=true,
AD_Tab_ID="b8bbd28a-250b-d1a1-e18d-914cad2c3314",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b404a39d-50a0-48a2-4672-e28b4bd75c71")
public static final String FIELDNAME_ElementValue_ValidFrom="b404a39d-50a0-48a2-4672-e28b4bd75c71";

@XendraTrl(Identifier="9ed128aa-7087-c17e-7884-4ac48bbec233")
public static String es_PE_COLUMN_ValidFrom_Name="Válido Desde";

@XendraColumn(AD_Element_ID="86b1171a-a6c6-0da5-1aea-3f3106450d07",ColumnName="ValidFrom",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9ed128aa-7087-c17e-7884-4ac48bbec233",
Synchronized="2019-08-30 22:21:35.0")
/** Column name ValidFrom */
public static final String COLUMNNAME_ValidFrom = "ValidFrom";
/** Set Valid to.
@param ValidTo Valid to including this date (last day) */
public void setValidTo (Timestamp ValidTo)
{
set_Value (COLUMNNAME_ValidTo, ValidTo);
}
/** Get Valid to.
@return Valid to including this date (last day) */
public Timestamp getValidTo() 
{
return (Timestamp)get_Value(COLUMNNAME_ValidTo);
}

@XendraTrl(Identifier="d31a4820-4df7-16c8-df28-8751ae3a090c")
public static String es_PE_FIELD_ElementValue_ValidTo_Name="Válido Hasta";

@XendraTrl(Identifier="d31a4820-4df7-16c8-df28-8751ae3a090c")
public static String es_PE_FIELD_ElementValue_ValidTo_Description="Válido hasta; incluyendo esta fecha (ultimo día)";

@XendraTrl(Identifier="d31a4820-4df7-16c8-df28-8751ae3a090c")
public static String es_PE_FIELD_ElementValue_ValidTo_Help="La fecha válida hasta indica el último día de un rango de fechas";

@XendraField(AD_Column_ID="ValidTo",IsCentrallyMaintained=true,
AD_Tab_ID="b8bbd28a-250b-d1a1-e18d-914cad2c3314",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d31a4820-4df7-16c8-df28-8751ae3a090c")
public static final String FIELDNAME_ElementValue_ValidTo="d31a4820-4df7-16c8-df28-8751ae3a090c";

@XendraTrl(Identifier="ca9423b2-2bb3-5c7d-fe7d-6f24b6e69522")
public static String es_PE_COLUMN_ValidTo_Name="Válido Hasta";

@XendraColumn(AD_Element_ID="0fbe43c3-c76d-0505-0043-63adb568a68f",ColumnName="ValidTo",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ca9423b2-2bb3-5c7d-fe7d-6f24b6e69522",
Synchronized="2019-08-30 22:21:35.0")
/** Column name ValidTo */
public static final String COLUMNNAME_ValidTo = "ValidTo";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value == null) throw new IllegalArgumentException ("Value is mandatory.");
if (Value.length() > 40)
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getValue());
}

@XendraTrl(Identifier="918a4960-583e-fc9a-9ef9-3250398e4bc6")
public static String es_PE_FIELD_ElementValue_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="918a4960-583e-fc9a-9ef9-3250398e4bc6")
public static String es_PE_FIELD_ElementValue_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="918a4960-583e-fc9a-9ef9-3250398e4bc6")
public static String es_PE_FIELD_ElementValue_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="b8bbd28a-250b-d1a1-e18d-914cad2c3314",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=70,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="918a4960-583e-fc9a-9ef9-3250398e4bc6")
public static final String FIELDNAME_ElementValue_SearchKey="918a4960-583e-fc9a-9ef9-3250398e4bc6";

@XendraTrl(Identifier="991611da-345a-aff5-fd47-c596e526f25e")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="991611da-345a-aff5-fd47-c596e526f25e",
Synchronized="2019-08-30 22:21:35.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
