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
import org.compiere.model.reference.REF_C_BankAccountType;
/** Generated Model for C_BankAccount
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_BankAccount extends PO
{
/** Standard Constructor
@param ctx context
@param C_BankAccount_ID id
@param trxName transaction
*/
public X_C_BankAccount (Properties ctx, int C_BankAccount_ID, String trxName)
{
super (ctx, C_BankAccount_ID, trxName);
/** if (C_BankAccount_ID == 0)
{
setAccountNo (null);
setBankAccountType (null);
setC_BankAccount_ID (0);
setC_Bank_ID (0);
setC_Currency_ID (0);
setCreditLimit (Env.ZERO);
setCurrentBalance (Env.ZERO);
setIsDefault (false);	
// N
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_BankAccount (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=297 */
public static int Table_ID=MTable.getTable_ID("C_BankAccount");

@XendraTrl(Identifier="39c8492e-0050-d63f-e4f9-75a787f86dc2")
public static String es_PE_TAB_Account_Description="Mantener Cuenta";

@XendraTrl(Identifier="39c8492e-0050-d63f-e4f9-75a787f86dc2")
public static String es_PE_TAB_Account_Name="Cuenta";

@XendraTrl(Identifier="39c8492e-0050-d63f-e4f9-75a787f86dc2")
public static String es_PE_TAB_Account_Help="La pestaña Cuenta es usada para definir una ó mas cuentas de un banco. Cada cuenta tiene un número de cuenta y una moneda.";

@XendraTab(Name="Account",Description="Maintain Bank Account",
Help="The Account Tab is used to define one or more accounts for a Bank.  Each account has a unique Account No and Currency.  The bank account organization is used for accounting.",
AD_Window_ID="da35b881-e51f-c76d-0c58-a14a86f4a839",SeqNo=20,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="39c8492e-0050-d63f-e4f9-75a787f86dc2",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Account="39c8492e-0050-d63f-e4f9-75a787f86dc2";

@XendraTrl(Identifier="e4c77184-cb88-1bf5-ed45-9c3c97f674b2")
public static String es_PE_TABLE_C_BankAccount_Name="Cuenta Bancaria";

@XendraTable(Name="Bank Account",Description="Account at the Bank",Help="",
TableName="C_BankAccount",AccessLevel="3",AD_Window_ID="da35b881-e51f-c76d-0c58-a14a86f4a839",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=90,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="e4c77184-cb88-1bf5-ed45-9c3c97f674b2",Synchronized="2017-08-16 11:41:22.0")
/** TableName=C_BankAccount */
public static final String Table_Name="C_BankAccount";


@XendraIndex(Name="c_bankacct_bank",Identifier="aee12833-f6de-a139-0938-7a3368596a19",
Column_Names="c_bank_id",IsUnique="false",TableIdentifier="aee12833-f6de-a139-0938-7a3368596a19",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_bankacct_bank = "aee12833-f6de-a139-0938-7a3368596a19";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_BankAccount");

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
    Table_ID = MTable.getTable_ID("C_BankAccount");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_BankAccount[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Account No.
@param AccountNo Account Number */
public void setAccountNo (String AccountNo)
{
if (AccountNo == null) throw new IllegalArgumentException ("AccountNo is mandatory.");
if (AccountNo.length() > 20)
{
log.warning("Length > 20 - truncated");
AccountNo = AccountNo.substring(0,19);
}
set_Value (COLUMNNAME_AccountNo, AccountNo);
}
/** Get Account No.
@return Account Number */
public String getAccountNo() 
{
String value = (String)get_Value(COLUMNNAME_AccountNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d99d48df-b9bd-f4f8-861b-1caf84369454")
public static String es_PE_FIELD_Account_AccountNo_Description="Número de cuenta";

@XendraTrl(Identifier="d99d48df-b9bd-f4f8-861b-1caf84369454")
public static String es_PE_FIELD_Account_AccountNo_Help="El número de cuenta indica el número asignado a esta cuenta.";

@XendraTrl(Identifier="d99d48df-b9bd-f4f8-861b-1caf84369454")
public static String es_PE_FIELD_Account_AccountNo_Name="No. De Cuenta";

@XendraField(AD_Column_ID="AccountNo",IsCentrallyMaintained=true,
AD_Tab_ID="39c8492e-0050-d63f-e4f9-75a787f86dc2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d99d48df-b9bd-f4f8-861b-1caf84369454")
public static final String FIELDNAME_Account_AccountNo="d99d48df-b9bd-f4f8-861b-1caf84369454";

@XendraTrl(Identifier="aafc72d6-75e2-8a90-7e15-24899da19dbf")
public static String es_PE_COLUMN_AccountNo_Name="No. De Cuenta";

@XendraColumn(AD_Element_ID="f476cad1-331f-9d18-a8b7-c03b172f9997",ColumnName="AccountNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aafc72d6-75e2-8a90-7e15-24899da19dbf",
Synchronized="2017-08-05 16:53:13.0")
/** Column name AccountNo */
public static final String COLUMNNAME_AccountNo = "AccountNo";

/** BankAccountType AD_Reference=acb85a97-8387-31f1-319a-5aec11c0aca3 */
public static final int BANKACCOUNTTYPE_AD_Reference_ID=216;
/** Set Bank Account Type.
@param BankAccountType Bank Account Type */
public void setBankAccountType (String BankAccountType)
{
if (BankAccountType == null) throw new IllegalArgumentException ("BankAccountType is mandatory");
if (BankAccountType.equals(REF_C_BankAccountType.Checking) || BankAccountType.equals(REF_C_BankAccountType.Savings) || BankAccountType.equals(REF_C_BankAccountType.Detraccion) || BankAccountType.equals(REF_C_BankAccountType.Card));
 else throw new IllegalArgumentException ("BankAccountType Invalid value - " + BankAccountType + " - Reference_ID=216 - C - S - D - K");
if (BankAccountType.length() > 1)
{
log.warning("Length > 1 - truncated");
BankAccountType = BankAccountType.substring(0,0);
}
set_Value (COLUMNNAME_BankAccountType, BankAccountType);
}
/** Get Bank Account Type.
@return Bank Account Type */
public String getBankAccountType() 
{
return (String)get_Value(COLUMNNAME_BankAccountType);
}

@XendraTrl(Identifier="8fb607f0-63ec-6931-261f-1b014ee10e3c")
public static String es_PE_FIELD_Account_BankAccountType_Description="Tipo de cuenta Bancaria";

@XendraTrl(Identifier="8fb607f0-63ec-6931-261f-1b014ee10e3c")
public static String es_PE_FIELD_Account_BankAccountType_Help="El Tipo de Cuenta Bancario indica el tipo de cuenta (ahorros; cheques; etc.) como está definida esta cuenta";

@XendraTrl(Identifier="8fb607f0-63ec-6931-261f-1b014ee10e3c")
public static String es_PE_FIELD_Account_BankAccountType_Name="Tipo de Cuenta Bancaria";

@XendraField(AD_Column_ID="BankAccountType",IsCentrallyMaintained=true,
AD_Tab_ID="39c8492e-0050-d63f-e4f9-75a787f86dc2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8fb607f0-63ec-6931-261f-1b014ee10e3c")
public static final String FIELDNAME_Account_BankAccountType="8fb607f0-63ec-6931-261f-1b014ee10e3c";

@XendraTrl(Identifier="539226a1-19da-0359-2ba9-0b55c06e3c7c")
public static String es_PE_COLUMN_BankAccountType_Name="Tipo de Cuenta Bancaria";

@XendraColumn(AD_Element_ID="2c7e9444-f63a-32ab-6164-9eac9c7fd1fe",ColumnName="BankAccountType",
AD_Reference_ID=17,AD_Reference_Value_ID="acb85a97-8387-31f1-319a-5aec11c0aca3",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="539226a1-19da-0359-2ba9-0b55c06e3c7c",Synchronized="2017-08-05 16:53:13.0")
/** Column name BankAccountType */
public static final String COLUMNNAME_BankAccountType = "BankAccountType";
/** Set BBAN.
@param BBAN Basic Bank Account Number */
public void setBBAN (String BBAN)
{
if (BBAN != null && BBAN.length() > 40)
{
log.warning("Length > 40 - truncated");
BBAN = BBAN.substring(0,39);
}
set_Value (COLUMNNAME_BBAN, BBAN);
}
/** Get BBAN.
@return Basic Bank Account Number */
public String getBBAN() 
{
String value = (String)get_Value(COLUMNNAME_BBAN);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="cc7413f2-e387-fda8-6d60-2d3cfd31d292")
public static String es_PE_FIELD_Account_BBAN_Description="Numero de Cuenta Bancaria Básica";

@XendraTrl(Identifier="cc7413f2-e387-fda8-6d60-2d3cfd31d292")
public static String es_PE_FIELD_Account_BBAN_Help="El Numero de Cuenta Básica (ó Domestica) usada para transferencias (Ver también NCBB) para mayores detalles 13616 y http://www.ecbs.org/.";

@XendraTrl(Identifier="cc7413f2-e387-fda8-6d60-2d3cfd31d292")
public static String es_PE_FIELD_Account_BBAN_Name="NCBB";
@XendraField(AD_Column_ID="BBAN",
IsCentrallyMaintained=true,AD_Tab_ID="39c8492e-0050-d63f-e4f9-75a787f86dc2",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=50,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="cc7413f2-e387-fda8-6d60-2d3cfd31d292")
public static final String FIELDNAME_Account_BBAN="cc7413f2-e387-fda8-6d60-2d3cfd31d292";

@XendraTrl(Identifier="ef72b9d0-a164-7532-aba1-bcb69c3df607")
public static String es_PE_COLUMN_BBAN_Name="NCBB";

@XendraColumn(AD_Element_ID="2b21cbd6-b170-6b4d-a0e3-590ea2ecc013",ColumnName="BBAN",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ef72b9d0-a164-7532-aba1-bcb69c3df607",
Synchronized="2017-08-05 16:53:13.0")
/** Column name BBAN */
public static final String COLUMNNAME_BBAN = "BBAN";
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

@XendraTrl(Identifier="cf01befa-53a7-b9e4-3f7b-68bf836faa94")
public static String es_PE_FIELD_Account_BankAccount_Description="Cuenta bancaria";

@XendraTrl(Identifier="cf01befa-53a7-b9e4-3f7b-68bf836faa94")
public static String es_PE_FIELD_Account_BankAccount_Help="La cuenta bancaria identifica una cuenta en este banco";

@XendraTrl(Identifier="cf01befa-53a7-b9e4-3f7b-68bf836faa94")
public static String es_PE_FIELD_Account_BankAccount_Name="Cuenta Bancaria";

@XendraField(AD_Column_ID="C_BankAccount_ID",IsCentrallyMaintained=true,
AD_Tab_ID="39c8492e-0050-d63f-e4f9-75a787f86dc2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cf01befa-53a7-b9e4-3f7b-68bf836faa94")
public static final String FIELDNAME_Account_BankAccount="cf01befa-53a7-b9e4-3f7b-68bf836faa94";
/** Column name C_BankAccount_ID */
public static final String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
/** Set Bank.
@param C_Bank_ID Bank */
public void setC_Bank_ID (int C_Bank_ID)
{
if (C_Bank_ID < 1) throw new IllegalArgumentException ("C_Bank_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Bank_ID, Integer.valueOf(C_Bank_ID));
}
/** Get Bank.
@return Bank */
public int getC_Bank_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Bank_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getC_Bank_ID()));
}

@XendraTrl(Identifier="946ca8a8-1f10-d2cb-3886-32038a3cb13e")
public static String es_PE_FIELD_Account_Bank_Description="Banco";

@XendraTrl(Identifier="946ca8a8-1f10-d2cb-3886-32038a3cb13e")
public static String es_PE_FIELD_Account_Bank_Help="El Banco es un identificador único de un Banco para esta Organización o para un Socio del Negocio con quien esta organización efectúa transacciones";

@XendraTrl(Identifier="946ca8a8-1f10-d2cb-3886-32038a3cb13e")
public static String es_PE_FIELD_Account_Bank_Name="Banco";
@XendraField(AD_Column_ID="C_Bank_ID",
IsCentrallyMaintained=true,AD_Tab_ID="39c8492e-0050-d63f-e4f9-75a787f86dc2",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="946ca8a8-1f10-d2cb-3886-32038a3cb13e")
public static final String FIELDNAME_Account_Bank="946ca8a8-1f10-d2cb-3886-32038a3cb13e";

@XendraTrl(Identifier="861e278a-53b9-2a7c-f405-352bbabe21cd")
public static String es_PE_COLUMN_C_Bank_ID_Name="Banco";

@XendraColumn(AD_Element_ID="89f0477f-4fb3-0740-081a-46ed80def564",ColumnName="C_Bank_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="861e278a-53b9-2a7c-f405-352bbabe21cd",
Synchronized="2017-08-05 16:53:13.0")
/** Column name C_Bank_ID */
public static final String COLUMNNAME_C_Bank_ID = "C_Bank_ID";
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

@XendraTrl(Identifier="66858b13-5321-4603-d181-00510db352b9")
public static String es_PE_FIELD_Account_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="66858b13-5321-4603-d181-00510db352b9")
public static String es_PE_FIELD_Account_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="66858b13-5321-4603-d181-00510db352b9")
public static String es_PE_FIELD_Account_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="39c8492e-0050-d63f-e4f9-75a787f86dc2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="66858b13-5321-4603-d181-00510db352b9")
public static final String FIELDNAME_Account_Currency="66858b13-5321-4603-d181-00510db352b9";

@XendraTrl(Identifier="56f552ef-b38b-10de-6838-b3a0c80a05dc")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="56f552ef-b38b-10de-6838-b3a0c80a05dc",
Synchronized="2017-08-05 16:53:13.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Credit limit.
@param CreditLimit Amount of Credit allowed */
public void setCreditLimit (BigDecimal CreditLimit)
{
if (CreditLimit == null) throw new IllegalArgumentException ("CreditLimit is mandatory.");
set_Value (COLUMNNAME_CreditLimit, CreditLimit);
}
/** Get Credit limit.
@return Amount of Credit allowed */
public BigDecimal getCreditLimit() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CreditLimit);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="daa3733a-55e3-d346-5c4f-61473f46ee4e")
public static String es_PE_FIELD_Account_CreditLimit_Description="Total de crédito permitido";

@XendraTrl(Identifier="daa3733a-55e3-d346-5c4f-61473f46ee4e")
public static String es_PE_FIELD_Account_CreditLimit_Help="Indica el límite de crédito para esta cuenta.";

@XendraTrl(Identifier="daa3733a-55e3-d346-5c4f-61473f46ee4e")
public static String es_PE_FIELD_Account_CreditLimit_Name="Límite de Crédito";

@XendraField(AD_Column_ID="CreditLimit",IsCentrallyMaintained=true,
AD_Tab_ID="39c8492e-0050-d63f-e4f9-75a787f86dc2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="daa3733a-55e3-d346-5c4f-61473f46ee4e")
public static final String FIELDNAME_Account_CreditLimit="daa3733a-55e3-d346-5c4f-61473f46ee4e";

@XendraTrl(Identifier="a49e05d1-bc2d-7183-fbce-d06d8b310126")
public static String es_PE_COLUMN_CreditLimit_Name="Límite de Crédito";

@XendraColumn(AD_Element_ID="fa82b401-4ffb-6c18-36f9-d3b343e1ac5e",ColumnName="CreditLimit",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a49e05d1-bc2d-7183-fbce-d06d8b310126",
Synchronized="2017-08-05 16:53:13.0")
/** Column name CreditLimit */
public static final String COLUMNNAME_CreditLimit = "CreditLimit";
/** Set Current balance.
@param CurrentBalance Current Balance */
public void setCurrentBalance (BigDecimal CurrentBalance)
{
if (CurrentBalance == null) throw new IllegalArgumentException ("CurrentBalance is mandatory.");
set_Value (COLUMNNAME_CurrentBalance, CurrentBalance);
}
/** Get Current balance.
@return Current Balance */
public BigDecimal getCurrentBalance() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CurrentBalance);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="c351d727-0471-411a-b8ae-7232bf98ab56")
public static String es_PE_FIELD_Account_CurrentBalance_Description="Saldo Actual";

@XendraTrl(Identifier="c351d727-0471-411a-b8ae-7232bf98ab56")
public static String es_PE_FIELD_Account_CurrentBalance_Help="El campo Saldo Actual indica el saldo actual en esta cuenta";

@XendraTrl(Identifier="c351d727-0471-411a-b8ae-7232bf98ab56")
public static String es_PE_FIELD_Account_CurrentBalance_Name="Saldo Actual ";

@XendraField(AD_Column_ID="CurrentBalance",IsCentrallyMaintained=true,
AD_Tab_ID="39c8492e-0050-d63f-e4f9-75a787f86dc2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c351d727-0471-411a-b8ae-7232bf98ab56")
public static final String FIELDNAME_Account_CurrentBalance="c351d727-0471-411a-b8ae-7232bf98ab56";

@XendraTrl(Identifier="e81698f4-3501-d51d-3e06-a01bd718dd10")
public static String es_PE_COLUMN_CurrentBalance_Name="Saldo Actual ";

@XendraColumn(AD_Element_ID="1d3f7a38-caf3-f9c9-412a-6c2059fce306",ColumnName="CurrentBalance",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e81698f4-3501-d51d-3e06-a01bd718dd10",
Synchronized="2017-08-05 16:53:13.0")
/** Column name CurrentBalance */
public static final String COLUMNNAME_CurrentBalance = "CurrentBalance";
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

@XendraTrl(Identifier="69dced48-1abe-ec1d-07e0-97b4520e224b")
public static String es_PE_FIELD_Account_Description_Description="Observación";

@XendraTrl(Identifier="69dced48-1abe-ec1d-07e0-97b4520e224b")
public static String es_PE_FIELD_Account_Description_Help="Observación";

@XendraTrl(Identifier="69dced48-1abe-ec1d-07e0-97b4520e224b")
public static String es_PE_FIELD_Account_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="39c8492e-0050-d63f-e4f9-75a787f86dc2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="69dced48-1abe-ec1d-07e0-97b4520e224b")
public static final String FIELDNAME_Account_Description="69dced48-1abe-ec1d-07e0-97b4520e224b";

@XendraTrl(Identifier="7289d58d-9a90-1ff7-0d4e-67f1391a35ac")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7289d58d-9a90-1ff7-0d4e-67f1391a35ac",
Synchronized="2017-08-05 16:53:13.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set IBAN.
@param IBAN International Bank Account Number */
public void setIBAN (String IBAN)
{
if (IBAN != null && IBAN.length() > 40)
{
log.warning("Length > 40 - truncated");
IBAN = IBAN.substring(0,39);
}
set_Value (COLUMNNAME_IBAN, IBAN);
}
/** Get IBAN.
@return International Bank Account Number */
public String getIBAN() 
{
String value = (String)get_Value(COLUMNNAME_IBAN);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="391af4cf-94a4-dd27-43eb-6f7d91dc60a6")
public static String es_PE_FIELD_Account_IBAN_Description="Numero Internacional de la Cuenta Bancaria";

@XendraTrl(Identifier="391af4cf-94a4-dd27-43eb-6f7d91dc60a6")
public static String es_PE_FIELD_Account_IBAN_Help="Si su banco proporciona un número internacional de la cuenta bancaria, incorpórelo aquí detallamente ISO 13616 y http://www.ecbs.org. El número de cuenta tiene la longitud máxima de 22 caracteres (sin espacios). El IBAN se imprime a menudo con un espacio después de 4 caracteres. No incorpore los espacios a Adempiere.";

@XendraTrl(Identifier="391af4cf-94a4-dd27-43eb-6f7d91dc60a6")
public static String es_PE_FIELD_Account_IBAN_Name="IBAN";
@XendraField(AD_Column_ID="IBAN",
IsCentrallyMaintained=true,AD_Tab_ID="39c8492e-0050-d63f-e4f9-75a787f86dc2",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=60,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="391af4cf-94a4-dd27-43eb-6f7d91dc60a6")
public static final String FIELDNAME_Account_IBAN="391af4cf-94a4-dd27-43eb-6f7d91dc60a6";

@XendraTrl(Identifier="33b04976-e732-a142-f2dc-3cd8e21935ac")
public static String es_PE_COLUMN_IBAN_Name="IBAN";

@XendraColumn(AD_Element_ID="8bf6bd41-3396-ab2d-1a3b-e674377bba5e",ColumnName="IBAN",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="33b04976-e732-a142-f2dc-3cd8e21935ac",
Synchronized="2017-08-05 16:53:13.0")
/** Column name IBAN */
public static final String COLUMNNAME_IBAN = "IBAN";
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
@XendraTrl(Identifier="2322b817-156a-4e7b-931f-64a825372056")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2322b817-156a-4e7b-931f-64a825372056",
Synchronized="2017-08-05 16:53:13.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Default.
@param IsDefault Default value */
public void setIsDefault (boolean IsDefault)
{
set_Value (COLUMNNAME_IsDefault, Boolean.valueOf(IsDefault));
}
/** Get Default.
@return Default value */
public boolean isDefault() 
{
Object oo = get_Value(COLUMNNAME_IsDefault);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="b7110de7-9fdb-8c1d-8b49-c5e66721d1a3")
public static String es_PE_FIELD_Account_Default_Description="Valor Predeterminado";

@XendraTrl(Identifier="b7110de7-9fdb-8c1d-8b49-c5e66721d1a3")
public static String es_PE_FIELD_Account_Default_Help="El cuadro de verificación indica si este registro será usado como un valor predeterminado";

@XendraTrl(Identifier="b7110de7-9fdb-8c1d-8b49-c5e66721d1a3")
public static String es_PE_FIELD_Account_Default_Name="Predeterminado";

@XendraField(AD_Column_ID="IsDefault",IsCentrallyMaintained=true,
AD_Tab_ID="39c8492e-0050-d63f-e4f9-75a787f86dc2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b7110de7-9fdb-8c1d-8b49-c5e66721d1a3")
public static final String FIELDNAME_Account_Default="b7110de7-9fdb-8c1d-8b49-c5e66721d1a3";

@XendraTrl(Identifier="de10a578-5894-84d6-eabc-85075bb1f668")
public static String es_PE_COLUMN_IsDefault_Name="Predeterminado";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="de10a578-5894-84d6-eabc-85075bb1f668",
Synchronized="2017-08-05 16:53:13.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
}
