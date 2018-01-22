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
import org.compiere.model.reference.REF__PostingType;
/** Generated Model for Fact_Acct
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_Fact_Acct extends PO
{
/** Standard Constructor
@param ctx context
@param Fact_Acct_ID id
@param trxName transaction
*/
public X_Fact_Acct (Properties ctx, int Fact_Acct_ID, String trxName)
{
super (ctx, Fact_Acct_ID, trxName);
/** if (Fact_Acct_ID == 0)
{
setAccount_ID (0);
setAD_Table_ID (0);
setC_AcctSchema_ID (0);
setC_Currency_ID (0);
setC_Period_ID (0);
setDateAcct (new Timestamp(System.currentTimeMillis()));
setDateTrx (new Timestamp(System.currentTimeMillis()));
setFact_Acct_ID (0);
setFact_ID (null);
setGL_Category_ID (0);
setIsDistribution (false);	
// N
setPostingType (null);
setRecord_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_Fact_Acct (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=270 */
public static int Table_ID=MTable.getTable_ID("Fact_Acct");

@XendraTrl(Identifier="17174a03-85dd-aa1a-940c-125c6645b4f7")
public static String es_PE_TAB_Accounting_Name="Contabilidad";
@XendraTab(Name="Accounting",
Description="View Accounting Fact Details",Help="",
AD_Window_ID="cd0eec53-c775-6175-db5a-1f2c023ee94b",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,WhereClause="",
OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="17174a03-85dd-aa1a-940c-125c6645b4f7",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Accounting="17174a03-85dd-aa1a-940c-125c6645b4f7";

@XendraTrl(Identifier="44f06c1a-0957-bbf4-4dce-136c929b7aeb")
public static String es_PE_TABLE_Fact_Acct_Name="Hecho Contable";

@XendraTable(Name="Accounting Fact",Description="",Help="",TableName="Fact_Acct",AccessLevel="3",
AD_Window_ID="cd0eec53-c775-6175-db5a-1f2c023ee94b",AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,
IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.accounting",Identifier="44f06c1a-0957-bbf4-4dce-136c929b7aeb",
Synchronized="2017-08-16 11:42:38.0")
/** TableName=Fact_Acct */
public static final String Table_Name="Fact_Acct";


@XendraIndex(Name="fact_acct_table_id",Identifier="f2d10c3d-0072-bf0e-6c4c-2d37f20f9785",
Column_Names="ad_table_id",IsUnique="false",TableIdentifier="f2d10c3d-0072-bf0e-6c4c-2d37f20f9785",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_fact_acct_table_id = "f2d10c3d-0072-bf0e-6c4c-2d37f20f9785";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"Fact_Acct");

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
    Table_ID = MTable.getTable_ID("Fact_Acct");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_Fact_Acct[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Asset.
@param A_Asset_ID Asset used internally or by customers */
public void setA_Asset_ID (int A_Asset_ID)
{
if (A_Asset_ID <= 0) set_Value (COLUMNNAME_A_Asset_ID, null);
 else 
set_Value (COLUMNNAME_A_Asset_ID, Integer.valueOf(A_Asset_ID));
}
/** Get Asset.
@return Asset used internally or by customers */
public int getA_Asset_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ad1ecdde-3585-e8db-6992-4ea5ae2f3b9e")
public static String es_PE_FIELD_Accounting_Asset_Description="Activo usado por la compañía o sus clientes";

@XendraTrl(Identifier="ad1ecdde-3585-e8db-6992-4ea5ae2f3b9e")
public static String es_PE_FIELD_Accounting_Asset_Help="Indica si es usado por la compañia o sus clientes";

@XendraTrl(Identifier="ad1ecdde-3585-e8db-6992-4ea5ae2f3b9e")
public static String es_PE_FIELD_Accounting_Asset_Name="Activo";

@XendraField(AD_Column_ID="A_Asset_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ad1ecdde-3585-e8db-6992-4ea5ae2f3b9e")
public static final String FIELDNAME_Accounting_Asset="ad1ecdde-3585-e8db-6992-4ea5ae2f3b9e";

@XendraTrl(Identifier="acf72755-a678-09f5-45ae-58e8fcaa0bf6")
public static String es_PE_COLUMN_A_Asset_ID_Name="Activo";

@XendraColumn(AD_Element_ID="3cd84c49-e25b-9ecc-5637-ed9a07d76bee",ColumnName="A_Asset_ID",
AD_Reference_ID=13,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="acf72755-a678-09f5-45ae-58e8fcaa0bf6",
Synchronized="2017-08-05 16:54:35.0")
/** Column name A_Asset_ID */
public static final String COLUMNNAME_A_Asset_ID = "A_Asset_ID";

/** Account_ID AD_Reference=fca59846-3472-6195-37e9-9b8f95376f02 */
public static final int ACCOUNT_ID_AD_Reference_ID=132;
/** Set Account.
@param Account_ID Account used */
public void setAccount_ID (int Account_ID)
{
if (Account_ID < 1) throw new IllegalArgumentException ("Account_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_Account_ID, Integer.valueOf(Account_ID));
}
/** Get Account.
@return Account used */
public int getAccount_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Account_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="602b6d6d-9632-b6fd-736d-41f1d7f3ea31")
public static String es_PE_FIELD_Accounting_Account_Description="Cuenta usada";

@XendraTrl(Identifier="602b6d6d-9632-b6fd-736d-41f1d7f3ea31")
public static String es_PE_FIELD_Accounting_Account_Help="La cuenta (natural) usada";

@XendraTrl(Identifier="602b6d6d-9632-b6fd-736d-41f1d7f3ea31")
public static String es_PE_FIELD_Accounting_Account_Name="Cuenta";

@XendraField(AD_Column_ID="Account_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=110,SortNo=3,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="602b6d6d-9632-b6fd-736d-41f1d7f3ea31")
public static final String FIELDNAME_Accounting_Account="602b6d6d-9632-b6fd-736d-41f1d7f3ea31";

@XendraTrl(Identifier="726f0583-6693-8a97-b913-bf9189dced12")
public static String es_PE_COLUMN_Account_ID_Name="Cuenta";

@XendraColumn(AD_Element_ID="80f1c2b7-bd3e-7c80-0596-67c2f7ca3812",ColumnName="Account_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="fca59846-3472-6195-37e9-9b8f95376f02",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="726f0583-6693-8a97-b913-bf9189dced12",Synchronized="2017-08-05 16:54:35.0")
/** Column name Account_ID */
public static final String COLUMNNAME_Account_ID = "Account_ID";

/** AD_OrgTrx_ID AD_Reference=54e78591-f7f4-c613-ea27-e64b3dac5198 */
public static final int AD_ORGTRX_ID_AD_Reference_ID=130;
/** Set Trx Organization.
@param AD_OrgTrx_ID Performing or initiating organization */
public void setAD_OrgTrx_ID (int AD_OrgTrx_ID)
{
if (AD_OrgTrx_ID <= 0) set_ValueNoCheck (COLUMNNAME_AD_OrgTrx_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_AD_OrgTrx_ID, Integer.valueOf(AD_OrgTrx_ID));
}
/** Get Trx Organization.
@return Performing or initiating organization */
public int getAD_OrgTrx_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_OrgTrx_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="34c97dff-4732-748c-8905-94e8f1310358")
public static String es_PE_FIELD_Accounting_TrxOrganization_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="34c97dff-4732-748c-8905-94e8f1310358")
public static String es_PE_FIELD_Accounting_TrxOrganization_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraTrl(Identifier="34c97dff-4732-748c-8905-94e8f1310358")
public static String es_PE_FIELD_Accounting_TrxOrganization_Name="Organización de la Trans.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_TO@=Y",DisplayLength=14,IsReadOnly=true,SeqNo=180,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="34c97dff-4732-748c-8905-94e8f1310358")
public static final String FIELDNAME_Accounting_TrxOrganization="34c97dff-4732-748c-8905-94e8f1310358";

@XendraTrl(Identifier="41bb6dca-9362-ce28-905b-f00cb6c2cd85")
public static String es_PE_COLUMN_AD_OrgTrx_ID_Name="Organización de la Trans.";

@XendraColumn(AD_Element_ID="b4180358-67aa-fe55-0409-6367a60e0a2e",ColumnName="AD_OrgTrx_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="54e78591-f7f4-c613-ea27-e64b3dac5198",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="41bb6dca-9362-ce28-905b-f00cb6c2cd85",Synchronized="2017-08-05 16:54:35.0")
/** Column name AD_OrgTrx_ID */
public static final String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
/** Set Table.
@param AD_Table_ID Database Table information */
public void setAD_Table_ID (int AD_Table_ID)
{
if (AD_Table_ID < 1) throw new IllegalArgumentException ("AD_Table_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Table_ID, Integer.valueOf(AD_Table_ID));
}
/** Get Table.
@return Database Table information */
public int getAD_Table_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Table_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="235ae52b-c28f-f824-1c50-525170ce239d")
public static String es_PE_FIELD_Accounting_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="235ae52b-c28f-f824-1c50-525170ce239d")
public static String es_PE_FIELD_Accounting_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraTrl(Identifier="235ae52b-c28f-f824-1c50-525170ce239d")
public static String es_PE_FIELD_Accounting_Table_Name="Tabla";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="235ae52b-c28f-f824-1c50-525170ce239d")
public static final String FIELDNAME_Accounting_Table="235ae52b-c28f-f824-1c50-525170ce239d";

@XendraTrl(Identifier="370bf275-f869-f107-12c1-3a6b7e81e525")
public static String es_PE_COLUMN_AD_Table_ID_Name="Tabla";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="7dcee7da-621b-b7a7-784d-91a75526fe52",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="370bf275-f869-f107-12c1-3a6b7e81e525",Synchronized="2017-08-05 16:54:35.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
/** Set Accounted Credit.
@param AmtAcctCr Accounted Credit Amount */
public void setAmtAcctCr (BigDecimal AmtAcctCr)
{
set_ValueNoCheck (COLUMNNAME_AmtAcctCr, AmtAcctCr);
}
/** Get Accounted Credit.
@return Accounted Credit Amount */
public BigDecimal getAmtAcctCr() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtAcctCr);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="f2870b1e-c70f-40f9-7bb6-700cb10141c4")
public static String es_PE_FIELD_Accounting_AccountedCredit_Description="Total del crédito contabilizado";

@XendraTrl(Identifier="f2870b1e-c70f-40f9-7bb6-700cb10141c4")
public static String es_PE_FIELD_Accounting_AccountedCredit_Help="El total del crédito de la cuenta indica el total de la transacción convertido a esta transacción";

@XendraTrl(Identifier="f2870b1e-c70f-40f9-7bb6-700cb10141c4")
public static String es_PE_FIELD_Accounting_AccountedCredit_Name="Crédito Contabilizado";

@XendraField(AD_Column_ID="AmtAcctCr",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="Amounts",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=360,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f2870b1e-c70f-40f9-7bb6-700cb10141c4")
public static final String FIELDNAME_Accounting_AccountedCredit="f2870b1e-c70f-40f9-7bb6-700cb10141c4";

@XendraTrl(Identifier="825fe3f0-e3aa-e800-157d-2593362d83da")
public static String es_PE_COLUMN_AmtAcctCr_Name="Crédito Contabilizado";

@XendraColumn(AD_Element_ID="945e7d70-99b5-5eaf-31ef-c5f460f7626c",ColumnName="AmtAcctCr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="825fe3f0-e3aa-e800-157d-2593362d83da",
Synchronized="2017-08-05 16:54:35.0")
/** Column name AmtAcctCr */
public static final String COLUMNNAME_AmtAcctCr = "AmtAcctCr";
/** Set Accounted Debit.
@param AmtAcctDr Accounted Debit Amount */
public void setAmtAcctDr (BigDecimal AmtAcctDr)
{
set_ValueNoCheck (COLUMNNAME_AmtAcctDr, AmtAcctDr);
}
/** Get Accounted Debit.
@return Accounted Debit Amount */
public BigDecimal getAmtAcctDr() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtAcctDr);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="ac927722-619e-f5df-9fda-5e534b4eb0de")
public static String es_PE_FIELD_Accounting_AccountedDebit_Description="Débito";

@XendraTrl(Identifier="ac927722-619e-f5df-9fda-5e534b4eb0de")
public static String es_PE_FIELD_Accounting_AccountedDebit_Help="El total del debito de la cuenta indica el total de la transacción convertido a esta transacción";

@XendraTrl(Identifier="ac927722-619e-f5df-9fda-5e534b4eb0de")
public static String es_PE_FIELD_Accounting_AccountedDebit_Name="Débito Contabilizado";

@XendraField(AD_Column_ID="AmtAcctDr",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="Amounts",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=350,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ac927722-619e-f5df-9fda-5e534b4eb0de")
public static final String FIELDNAME_Accounting_AccountedDebit="ac927722-619e-f5df-9fda-5e534b4eb0de";

@XendraTrl(Identifier="f142b45c-1092-8e73-4101-25c6ff279862")
public static String es_PE_COLUMN_AmtAcctDr_Name="Débito Contabilizado";

@XendraColumn(AD_Element_ID="67410612-76a4-c113-8594-305f58926372",ColumnName="AmtAcctDr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f142b45c-1092-8e73-4101-25c6ff279862",
Synchronized="2017-08-05 16:54:35.0")
/** Column name AmtAcctDr */
public static final String COLUMNNAME_AmtAcctDr = "AmtAcctDr";
/** Set Source Credit.
@param AmtSourceCr Source Credit Amount */
public void setAmtSourceCr (BigDecimal AmtSourceCr)
{
set_ValueNoCheck (COLUMNNAME_AmtSourceCr, AmtSourceCr);
}
/** Get Source Credit.
@return Source Credit Amount */
public BigDecimal getAmtSourceCr() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtSourceCr);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="da5214e2-c82f-be79-37aa-41c10ea1ac7c")
public static String es_PE_FIELD_Accounting_SourceCredit_Description="Total del Crédito en moneda fuente.";

@XendraTrl(Identifier="da5214e2-c82f-be79-37aa-41c10ea1ac7c")
public static String es_PE_FIELD_Accounting_SourceCredit_Help="El Total crédito fuente indica el Total crédito para esta línea en la moneda fuente.";

@XendraTrl(Identifier="da5214e2-c82f-be79-37aa-41c10ea1ac7c")
public static String es_PE_FIELD_Accounting_SourceCredit_Name="Abono";

@XendraField(AD_Column_ID="AmtSourceCr",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="Amounts",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=340,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="da5214e2-c82f-be79-37aa-41c10ea1ac7c")
public static final String FIELDNAME_Accounting_SourceCredit="da5214e2-c82f-be79-37aa-41c10ea1ac7c";

@XendraTrl(Identifier="5bba8360-72bc-a9bb-72ed-44b26041b4ad")
public static String es_PE_COLUMN_AmtSourceCr_Name="Abono";

@XendraColumn(AD_Element_ID="37fc9554-00eb-5046-f770-46b9f63a1166",ColumnName="AmtSourceCr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5bba8360-72bc-a9bb-72ed-44b26041b4ad",
Synchronized="2017-08-05 16:54:35.0")
/** Column name AmtSourceCr */
public static final String COLUMNNAME_AmtSourceCr = "AmtSourceCr";
/** Set Source Debit.
@param AmtSourceDr Source Debit Amount */
public void setAmtSourceDr (BigDecimal AmtSourceDr)
{
set_ValueNoCheck (COLUMNNAME_AmtSourceDr, AmtSourceDr);
}
/** Get Source Debit.
@return Source Debit Amount */
public BigDecimal getAmtSourceDr() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtSourceDr);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="9ef95f1d-9196-f3e3-2378-8077f44c66a3")
public static String es_PE_FIELD_Accounting_SourceDebit_Description="Total del débito en moneda fuente";

@XendraTrl(Identifier="9ef95f1d-9196-f3e3-2378-8077f44c66a3")
public static String es_PE_FIELD_Accounting_SourceDebit_Help="El total débito fuente indica el total debito para esta línea en la moneda fuente";

@XendraTrl(Identifier="9ef95f1d-9196-f3e3-2378-8077f44c66a3")
public static String es_PE_FIELD_Accounting_SourceDebit_Name="Cargo";

@XendraField(AD_Column_ID="AmtSourceDr",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="Amounts",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=330,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9ef95f1d-9196-f3e3-2378-8077f44c66a3")
public static final String FIELDNAME_Accounting_SourceDebit="9ef95f1d-9196-f3e3-2378-8077f44c66a3";

@XendraTrl(Identifier="a4691997-e610-326a-6e5a-ae1e70a44182")
public static String es_PE_COLUMN_AmtSourceDr_Name="Cargo";

@XendraColumn(AD_Element_ID="83234cfc-e73c-2419-af3c-afb9356f1f68",ColumnName="AmtSourceDr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a4691997-e610-326a-6e5a-ae1e70a44182",
Synchronized="2017-08-05 16:54:35.0")
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

@XendraTrl(Identifier="e53b98ac-3746-8141-323d-a3458150dd74")
public static String es_PE_FIELD_Accounting_AccountingSchema_Description="Reglas para contabilizar";

@XendraTrl(Identifier="e53b98ac-3746-8141-323d-a3458150dd74")
public static String es_PE_FIELD_Accounting_AccountingSchema_Help="Un esquema contable define las reglas contables usadas tales como método de costeo; moneda y calendario";

@XendraTrl(Identifier="e53b98ac-3746-8141-323d-a3458150dd74")
public static String es_PE_FIELD_Accounting_AccountingSchema_Name="Esquema Contable";

@XendraField(AD_Column_ID="C_AcctSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e53b98ac-3746-8141-323d-a3458150dd74")
public static final String FIELDNAME_Accounting_AccountingSchema="e53b98ac-3746-8141-323d-a3458150dd74";

@XendraTrl(Identifier="3e9d3621-4511-4ada-f6a6-b48d81e5fc16")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3e9d3621-4511-4ada-f6a6-b48d81e5fc16",
Synchronized="2017-08-05 16:54:35.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
/** Set Activity.
@param C_Activity_ID Business Activity */
public void setC_Activity_ID (int C_Activity_ID)
{
if (C_Activity_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_Activity_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_Activity_ID, Integer.valueOf(C_Activity_ID));
}
/** Get Activity.
@return Business Activity */
public int getC_Activity_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Activity_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6dcaf17e-32e3-7ac6-6cf5-33a28f5985c8")
public static String es_PE_FIELD_Accounting_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="6dcaf17e-32e3-7ac6-6cf5-33a28f5985c8")
public static String es_PE_FIELD_Accounting_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraTrl(Identifier="6dcaf17e-32e3-7ac6-6cf5-33a28f5985c8")
public static String es_PE_FIELD_Accounting_Activity_Name="Tipo de Gasto";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_AC@=Y ",DisplayLength=14,IsReadOnly=true,SeqNo=210,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="6dcaf17e-32e3-7ac6-6cf5-33a28f5985c8")
public static final String FIELDNAME_Accounting_Activity="6dcaf17e-32e3-7ac6-6cf5-33a28f5985c8";

@XendraTrl(Identifier="dded4dd2-1d18-60dd-b6ce-75cf79fe474e")
public static String es_PE_COLUMN_C_Activity_ID_Name="Tipo de Gasto";

@XendraColumn(AD_Element_ID="bfeadbb3-d866-26e3-8eee-3e2fdf0ff753",ColumnName="C_Activity_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dded4dd2-1d18-60dd-b6ce-75cf79fe474e",
Synchronized="2017-08-05 16:54:35.0")
/** Column name C_Activity_ID */
public static final String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, null);
 else 
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

@XendraTrl(Identifier="02e56fbe-a278-3069-121b-d19cfc97eb63")
public static String es_PE_FIELD_Accounting_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="02e56fbe-a278-3069-121b-d19cfc97eb63")
public static String es_PE_FIELD_Accounting_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="02e56fbe-a278-3069-121b-d19cfc97eb63")
public static String es_PE_FIELD_Accounting_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_BP@=Y",DisplayLength=26,IsReadOnly=true,SeqNo=130,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="02e56fbe-a278-3069-121b-d19cfc97eb63")
public static final String FIELDNAME_Accounting_BusinessPartner="02e56fbe-a278-3069-121b-d19cfc97eb63";

@XendraTrl(Identifier="3d7e56bf-3470-20c1-59c3-15c672c3d766")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3d7e56bf-3470-20c1-59c3-15c672c3d766",
Synchronized="2017-08-05 16:54:35.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Campaign.
@param C_Campaign_ID Marketing Campaign */
public void setC_Campaign_ID (int C_Campaign_ID)
{
if (C_Campaign_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_Campaign_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_Campaign_ID, Integer.valueOf(C_Campaign_ID));
}
/** Get Campaign.
@return Marketing Campaign */
public int getC_Campaign_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Campaign_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4acecee8-ce36-8584-5a90-da4e302b259e")
public static String es_PE_FIELD_Accounting_Campaign_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="4acecee8-ce36-8584-5a90-da4e302b259e")
public static String es_PE_FIELD_Accounting_Campaign_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraTrl(Identifier="4acecee8-ce36-8584-5a90-da4e302b259e")
public static String es_PE_FIELD_Accounting_Campaign_Name="Campaña";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_MC@=Y",DisplayLength=14,IsReadOnly=true,SeqNo=170,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4acecee8-ce36-8584-5a90-da4e302b259e")
public static final String FIELDNAME_Accounting_Campaign="4acecee8-ce36-8584-5a90-da4e302b259e";

@XendraTrl(Identifier="8e90d8fd-5f52-0ca5-5519-82aff222d824")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaña";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8e90d8fd-5f52-0ca5-5519-82aff222d824",
Synchronized="2017-08-05 16:54:35.0")
/** Column name C_Campaign_ID */
public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID < 1) throw new IllegalArgumentException ("C_Currency_ID is mandatory.");
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

@XendraTrl(Identifier="0f92ab8e-24a0-06e4-79d2-4ff3da1fe48f")
public static String es_PE_FIELD_Accounting_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="0f92ab8e-24a0-06e4-79d2-4ff3da1fe48f")
public static String es_PE_FIELD_Accounting_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="0f92ab8e-24a0-06e4-79d2-4ff3da1fe48f")
public static String es_PE_FIELD_Accounting_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="Amounts",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=320,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0f92ab8e-24a0-06e4-79d2-4ff3da1fe48f")
public static final String FIELDNAME_Accounting_Currency="0f92ab8e-24a0-06e4-79d2-4ff3da1fe48f";

@XendraTrl(Identifier="785de94b-dc20-95f4-dde1-7bff36a97354")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="785de94b-dc20-95f4-dde1-7bff36a97354",
Synchronized="2017-08-05 16:54:35.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Document Type.
@param C_DocType_ID Document type or rules */
public void setC_DocType_ID (int C_DocType_ID)
{
if (C_DocType_ID <= 0) set_Value (COLUMNNAME_C_DocType_ID, null);
 else 
set_Value (COLUMNNAME_C_DocType_ID, Integer.valueOf(C_DocType_ID));
}
/** Get Document Type.
@return Document type or rules */
public int getC_DocType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DocType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ad1119df-ed41-c347-07e7-3580f7c15e12")
public static String es_PE_FIELD_Accounting_DocumentType_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="ad1119df-ed41-c347-07e7-3580f7c15e12")
public static String es_PE_FIELD_Accounting_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraTrl(Identifier="ad1119df-ed41-c347-07e7-3580f7c15e12")
public static String es_PE_FIELD_Accounting_DocumentType_Name="Tipo de Documento";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=420,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ad1119df-ed41-c347-07e7-3580f7c15e12")
public static final String FIELDNAME_Accounting_DocumentType="ad1119df-ed41-c347-07e7-3580f7c15e12";

@XendraTrl(Identifier="f06a1c80-50e2-e6ed-48d5-8215fc9e60b1")
public static String es_PE_COLUMN_C_DocType_ID_Name="Document Type";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f06a1c80-50e2-e6ed-48d5-8215fc9e60b1",
Synchronized="2017-08-05 16:54:35.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";

/** C_LocFrom_ID AD_Reference=69189951-7109-d2c7-f034-b4660d43b572 */
public static final int C_LOCFROM_ID_AD_Reference_ID=133;
/** Set Location From.
@param C_LocFrom_ID Location that inventory was moved from */
public void setC_LocFrom_ID (int C_LocFrom_ID)
{
if (C_LocFrom_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_LocFrom_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_LocFrom_ID, Integer.valueOf(C_LocFrom_ID));
}
/** Get Location From.
@return Location that inventory was moved from */
public int getC_LocFrom_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_LocFrom_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c2d00451-4300-ac3e-691b-ac989bc9d8a2")
public static String es_PE_FIELD_Accounting_LocationFrom_Description="Ubicación desde la que el inventario fue movido";

@XendraTrl(Identifier="c2d00451-4300-ac3e-691b-ac989bc9d8a2")
public static String es_PE_FIELD_Accounting_LocationFrom_Help="La ubicación desde indica la ubicación desde la que un producto fue movido";

@XendraTrl(Identifier="c2d00451-4300-ac3e-691b-ac989bc9d8a2")
public static String es_PE_FIELD_Accounting_LocationFrom_Name="Desde Localización";

@XendraField(AD_Column_ID="C_LocFrom_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_LF@=Y",DisplayLength=14,IsReadOnly=true,SeqNo=190,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c2d00451-4300-ac3e-691b-ac989bc9d8a2")
public static final String FIELDNAME_Accounting_LocationFrom="c2d00451-4300-ac3e-691b-ac989bc9d8a2";

@XendraTrl(Identifier="8735c601-9a34-6649-4b87-85693741475c")
public static String es_PE_COLUMN_C_LocFrom_ID_Name="Desde Localización";

@XendraColumn(AD_Element_ID="5c54374e-b27b-3cd4-f5a8-8705436152bc",ColumnName="C_LocFrom_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="69189951-7109-d2c7-f034-b4660d43b572",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8735c601-9a34-6649-4b87-85693741475c",Synchronized="2017-08-05 16:54:35.0")
/** Column name C_LocFrom_ID */
public static final String COLUMNNAME_C_LocFrom_ID = "C_LocFrom_ID";

/** C_LocTo_ID AD_Reference=69189951-7109-d2c7-f034-b4660d43b572 */
public static final int C_LOCTO_ID_AD_Reference_ID=133;
/** Set Location To.
@param C_LocTo_ID Location that inventory was moved to */
public void setC_LocTo_ID (int C_LocTo_ID)
{
if (C_LocTo_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_LocTo_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_LocTo_ID, Integer.valueOf(C_LocTo_ID));
}
/** Get Location To.
@return Location that inventory was moved to */
public int getC_LocTo_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_LocTo_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="23a54f05-b6c2-2476-cf2a-c614a7f28e4f")
public static String es_PE_FIELD_Accounting_LocationTo_Description="Ubicación a la que el inventario fue movido.";

@XendraTrl(Identifier="23a54f05-b6c2-2476-cf2a-c614a7f28e4f")
public static String es_PE_FIELD_Accounting_LocationTo_Help="La Ubicación A indica la ubicación a la que un producto fue movido.";

@XendraTrl(Identifier="23a54f05-b6c2-2476-cf2a-c614a7f28e4f")
public static String es_PE_FIELD_Accounting_LocationTo_Name="A Localización";

@XendraField(AD_Column_ID="C_LocTo_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_LT@=Y",DisplayLength=14,IsReadOnly=true,SeqNo=200,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="23a54f05-b6c2-2476-cf2a-c614a7f28e4f")
public static final String FIELDNAME_Accounting_LocationTo="23a54f05-b6c2-2476-cf2a-c614a7f28e4f";

@XendraTrl(Identifier="cde8839e-b81b-4654-29b5-6f0befda650b")
public static String es_PE_COLUMN_C_LocTo_ID_Name="A Localización";

@XendraColumn(AD_Element_ID="531e981d-5722-db37-a6eb-54ec21b60a90",ColumnName="C_LocTo_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="69189951-7109-d2c7-f034-b4660d43b572",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="cde8839e-b81b-4654-29b5-6f0befda650b",Synchronized="2017-08-05 16:54:35.0")
/** Column name C_LocTo_ID */
public static final String COLUMNNAME_C_LocTo_ID = "C_LocTo_ID";
/** Set Period.
@param C_Period_ID Period of the Calendar */
public void setC_Period_ID (int C_Period_ID)
{
if (C_Period_ID < 1) throw new IllegalArgumentException ("C_Period_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Period_ID, Integer.valueOf(C_Period_ID));
}
/** Get Period.
@return Period of the Calendar */
public int getC_Period_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Period_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4805effe-ff78-75d5-28b6-1f65e7378f6f")
public static String es_PE_FIELD_Accounting_Period_Description="Período de Calendario";

@XendraTrl(Identifier="4805effe-ff78-75d5-28b6-1f65e7378f6f")
public static String es_PE_FIELD_Accounting_Period_Help="El Período indica un rango de fechas exclusivo para un calendario";

@XendraTrl(Identifier="4805effe-ff78-75d5-28b6-1f65e7378f6f")
public static String es_PE_FIELD_Accounting_Period_Name="Período";

@XendraField(AD_Column_ID="C_Period_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4805effe-ff78-75d5-28b6-1f65e7378f6f")
public static final String FIELDNAME_Accounting_Period="4805effe-ff78-75d5-28b6-1f65e7378f6f";

@XendraTrl(Identifier="387462b0-7cc0-f754-9f87-2ad76ee8fc85")
public static String es_PE_COLUMN_C_Period_ID_Name="Período";

@XendraColumn(AD_Element_ID="8f295c04-0eb4-a8f3-829f-cc6a6bd1df1e",ColumnName="C_Period_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="387462b0-7cc0-f754-9f87-2ad76ee8fc85",
Synchronized="2017-08-05 16:54:35.0")
/** Column name C_Period_ID */
public static final String COLUMNNAME_C_Period_ID = "C_Period_ID";
/** Set Project.
@param C_Project_ID Financial Project */
public void setC_Project_ID (int C_Project_ID)
{
if (C_Project_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_Project_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_Project_ID, Integer.valueOf(C_Project_ID));
}
/** Get Project.
@return Financial Project */
public int getC_Project_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Project_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="15d79b31-a89d-d9a0-3cf7-78788995209e")
public static String es_PE_FIELD_Accounting_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="15d79b31-a89d-d9a0-3cf7-78788995209e")
public static String es_PE_FIELD_Accounting_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraTrl(Identifier="15d79b31-a89d-d9a0-3cf7-78788995209e")
public static String es_PE_FIELD_Accounting_Project_Name="Proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_PJ@=Y",DisplayLength=14,IsReadOnly=true,SeqNo=150,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="15d79b31-a89d-d9a0-3cf7-78788995209e")
public static final String FIELDNAME_Accounting_Project="15d79b31-a89d-d9a0-3cf7-78788995209e";

@XendraTrl(Identifier="d976fd2c-bce7-3ccb-aab1-82ae25192d38")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d976fd2c-bce7-3ccb-aab1-82ae25192d38",
Synchronized="2017-08-05 16:54:35.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
/** Set Project Phase.
@param C_ProjectPhase_ID Phase of a Project */
public void setC_ProjectPhase_ID (int C_ProjectPhase_ID)
{
if (C_ProjectPhase_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_ProjectPhase_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_ProjectPhase_ID, Integer.valueOf(C_ProjectPhase_ID));
}
/** Get Project Phase.
@return Phase of a Project */
public int getC_ProjectPhase_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ProjectPhase_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ff94da75-8278-4d55-340b-673faaba4f47")
public static String es_PE_FIELD_Accounting_ProjectPhase_Description="Fase del Proyecto";

@XendraTrl(Identifier="ff94da75-8278-4d55-340b-673faaba4f47")
public static String es_PE_FIELD_Accounting_ProjectPhase_Name="Fase del Proyecto";

@XendraField(AD_Column_ID="C_ProjectPhase_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=400,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ff94da75-8278-4d55-340b-673faaba4f47")
public static final String FIELDNAME_Accounting_ProjectPhase="ff94da75-8278-4d55-340b-673faaba4f47";

@XendraTrl(Identifier="20f6c554-70d5-8697-d5c5-16e220dbffd8")
public static String es_PE_COLUMN_C_ProjectPhase_ID_Name="Fase del Proyecto";

@XendraColumn(AD_Element_ID="ba6e5aab-8337-208a-03da-5712e50d4da9",ColumnName="C_ProjectPhase_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="20f6c554-70d5-8697-d5c5-16e220dbffd8",
Synchronized="2017-08-05 16:54:35.0")
/** Column name C_ProjectPhase_ID */
public static final String COLUMNNAME_C_ProjectPhase_ID = "C_ProjectPhase_ID";
/** Set Project Task.
@param C_ProjectTask_ID Actual Project Task in a Phase */
public void setC_ProjectTask_ID (int C_ProjectTask_ID)
{
if (C_ProjectTask_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_ProjectTask_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_ProjectTask_ID, Integer.valueOf(C_ProjectTask_ID));
}
/** Get Project Task.
@return Actual Project Task in a Phase */
public int getC_ProjectTask_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ProjectTask_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="db21092d-9743-2076-de9b-d997da03da47")
public static String es_PE_FIELD_Accounting_ProjectTask_Description="Actual tarea en la fase del proyecto.";

@XendraTrl(Identifier="db21092d-9743-2076-de9b-d997da03da47")
public static String es_PE_FIELD_Accounting_ProjectTask_Help="Una tarea de proyecto en una fase de proyecto representa el trabajo real.";

@XendraTrl(Identifier="db21092d-9743-2076-de9b-d997da03da47")
public static String es_PE_FIELD_Accounting_ProjectTask_Name="Tarea del Proyecto";

@XendraField(AD_Column_ID="C_ProjectTask_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=410,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="db21092d-9743-2076-de9b-d997da03da47")
public static final String FIELDNAME_Accounting_ProjectTask="db21092d-9743-2076-de9b-d997da03da47";

@XendraTrl(Identifier="f53797e5-6df4-579d-b84d-14e8c3a8fa19")
public static String es_PE_COLUMN_C_ProjectTask_ID_Name="Tarea del Proyecto";

@XendraColumn(AD_Element_ID="1b2d7a20-215c-4f56-6077-83adcead0920",ColumnName="C_ProjectTask_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f53797e5-6df4-579d-b84d-14e8c3a8fa19",
Synchronized="2017-08-05 16:54:35.0")
/** Column name C_ProjectTask_ID */
public static final String COLUMNNAME_C_ProjectTask_ID = "C_ProjectTask_ID";
/** Set Sales Region.
@param C_SalesRegion_ID Sales coverage region */
public void setC_SalesRegion_ID (int C_SalesRegion_ID)
{
if (C_SalesRegion_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_SalesRegion_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_SalesRegion_ID, Integer.valueOf(C_SalesRegion_ID));
}
/** Get Sales Region.
@return Sales coverage region */
public int getC_SalesRegion_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_SalesRegion_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="474c0a12-4b97-b992-bb29-ae5b18fa698b")
public static String es_PE_FIELD_Accounting_SalesRegion_Description="Región de cobertura de ventas.";

@XendraTrl(Identifier="474c0a12-4b97-b992-bb29-ae5b18fa698b")
public static String es_PE_FIELD_Accounting_SalesRegion_Help="La región de ventas indica una área de cobertura de ventas específica.";

@XendraTrl(Identifier="474c0a12-4b97-b992-bb29-ae5b18fa698b")
public static String es_PE_FIELD_Accounting_SalesRegion_Name="Región de Ventas";

@XendraField(AD_Column_ID="C_SalesRegion_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_SR@=Y",DisplayLength=14,IsReadOnly=true,SeqNo=160,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="474c0a12-4b97-b992-bb29-ae5b18fa698b")
public static final String FIELDNAME_Accounting_SalesRegion="474c0a12-4b97-b992-bb29-ae5b18fa698b";

@XendraTrl(Identifier="6177ad98-474d-d9ff-a43c-84e385a74b5d")
public static String es_PE_COLUMN_C_SalesRegion_ID_Name="Región de Ventas";

@XendraColumn(AD_Element_ID="26b40f06-df79-27f7-adb4-8ae6c5a1c9b8",ColumnName="C_SalesRegion_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6177ad98-474d-d9ff-a43c-84e385a74b5d",
Synchronized="2017-08-05 16:54:35.0")
/** Column name C_SalesRegion_ID */
public static final String COLUMNNAME_C_SalesRegion_ID = "C_SalesRegion_ID";
/** Set Sub Account.
@param C_SubAcct_ID Sub account for Element Value */
public void setC_SubAcct_ID (int C_SubAcct_ID)
{
if (C_SubAcct_ID <= 0) set_Value (COLUMNNAME_C_SubAcct_ID, null);
 else 
set_Value (COLUMNNAME_C_SubAcct_ID, Integer.valueOf(C_SubAcct_ID));
}
/** Get Sub Account.
@return Sub account for Element Value */
public int getC_SubAcct_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_SubAcct_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a7ddee94-e66d-f085-bb05-5ed09bb02600")
public static String es_PE_FIELD_Accounting_SubAccount_Description="Sub Cuenta para Valor del Elemento";

@XendraTrl(Identifier="a7ddee94-e66d-f085-bb05-5ed09bb02600")
public static String es_PE_FIELD_Accounting_SubAccount_Help="El Valor del Elemento (ej. Cuenta) opcionalmente puede tener subcuentas para detalles adicionales. La subcuenta es dependientedel valor de la cuenta, así también las especificaciónes. Si las cuentas son mas o menos lo mismo, considere el empleo de otra dimensión contable.";

@XendraTrl(Identifier="a7ddee94-e66d-f085-bb05-5ed09bb02600")
public static String es_PE_FIELD_Accounting_SubAccount_Name="Sub Cuenta";

@XendraField(AD_Column_ID="C_SubAcct_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a7ddee94-e66d-f085-bb05-5ed09bb02600")
public static final String FIELDNAME_Accounting_SubAccount="a7ddee94-e66d-f085-bb05-5ed09bb02600";

@XendraTrl(Identifier="603f3229-10ed-1278-d2a2-147f0055335c")
public static String es_PE_COLUMN_C_SubAcct_ID_Name="Sub Cuenta";

@XendraColumn(AD_Element_ID="24ec01a7-d6fe-2833-9fa3-5bc5aa2648b5",ColumnName="C_SubAcct_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="603f3229-10ed-1278-d2a2-147f0055335c",
Synchronized="2017-08-05 16:54:35.0")
/** Column name C_SubAcct_ID */
public static final String COLUMNNAME_C_SubAcct_ID = "C_SubAcct_ID";
/** Set Tax.
@param C_Tax_ID Tax identifier */
public void setC_Tax_ID (int C_Tax_ID)
{
if (C_Tax_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_Tax_ID, null);
 else 
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

@XendraTrl(Identifier="9b52afcd-71d3-fdde-88f4-9e3f06c08052")
public static String es_PE_FIELD_Accounting_Tax_Description="Identificador del Impuesto";

@XendraTrl(Identifier="9b52afcd-71d3-fdde-88f4-9e3f06c08052")
public static String es_PE_FIELD_Accounting_Tax_Help="El Impuesto indica el tipo de impuesto para esta línea del documento";

@XendraTrl(Identifier="9b52afcd-71d3-fdde-88f4-9e3f06c08052")
public static String es_PE_FIELD_Accounting_Tax_Name="Impuesto";

@XendraField(AD_Column_ID="C_Tax_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=300,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9b52afcd-71d3-fdde-88f4-9e3f06c08052")
public static final String FIELDNAME_Accounting_Tax="9b52afcd-71d3-fdde-88f4-9e3f06c08052";

@XendraTrl(Identifier="f6f29ff9-5cac-4291-6bde-754c8040c4c1")
public static String es_PE_COLUMN_C_Tax_ID_Name="Impuesto";

@XendraColumn(AD_Element_ID="38ff24fc-b68c-51a9-60f8-ef2a1f060de2",ColumnName="C_Tax_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f6f29ff9-5cac-4291-6bde-754c8040c4c1",
Synchronized="2017-08-05 16:54:35.0")
/** Column name C_Tax_ID */
public static final String COLUMNNAME_C_Tax_ID = "C_Tax_ID";
/** Set UOM.
@param C_UOM_ID Unit of Measure */
public void setC_UOM_ID (int C_UOM_ID)
{
if (C_UOM_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_UOM_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_UOM_ID, Integer.valueOf(C_UOM_ID));
}
/** Get UOM.
@return Unit of Measure */
public int getC_UOM_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_UOM_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6c892667-e61e-b65a-ec7c-80b5ac3a354c")
public static String es_PE_FIELD_Accounting_UOM_Description="Unidad de Medida";

@XendraTrl(Identifier="6c892667-e61e-b65a-ec7c-80b5ac3a354c")
public static String es_PE_FIELD_Accounting_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraTrl(Identifier="6c892667-e61e-b65a-ec7c-80b5ac3a354c")
public static String es_PE_FIELD_Accounting_UOM_Name="UM";
@XendraField(AD_Column_ID="C_UOM_ID",
IsCentrallyMaintained=true,AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",
AD_FieldGroup_ID="Quantities",IsDisplayed=true,DisplayLogic="",DisplayLength=14,IsReadOnly=true,
SeqNo=370,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="6c892667-e61e-b65a-ec7c-80b5ac3a354c")
public static final String FIELDNAME_Accounting_UOM="6c892667-e61e-b65a-ec7c-80b5ac3a354c";

@XendraTrl(Identifier="8201a9be-fc1c-e5ee-c3e1-b8bfdb8b68a0")
public static String es_PE_COLUMN_C_UOM_ID_Name="UM";

@XendraColumn(AD_Element_ID="d0345019-4fcc-44c8-4fd1-e38e3b4adeed",ColumnName="C_UOM_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8201a9be-fc1c-e5ee-c3e1-b8bfdb8b68a0",
Synchronized="2017-08-05 16:54:35.0")
/** Column name C_UOM_ID */
public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
/** Set Account Date.
@param DateAcct Accounting Date */
public void setDateAcct (Timestamp DateAcct)
{
if (DateAcct == null) throw new IllegalArgumentException ("DateAcct is mandatory.");
set_ValueNoCheck (COLUMNNAME_DateAcct, DateAcct);
}
/** Get Account Date.
@return Accounting Date */
public Timestamp getDateAcct() 
{
return (Timestamp)get_Value(COLUMNNAME_DateAcct);
}

@XendraTrl(Identifier="5c47daec-810f-7a88-b280-8cba8940f535")
public static String es_PE_FIELD_Accounting_AccountDate_Description="Fecha contable";

@XendraTrl(Identifier="5c47daec-810f-7a88-b280-8cba8940f535")
public static String es_PE_FIELD_Accounting_AccountDate_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraTrl(Identifier="5c47daec-810f-7a88-b280-8cba8940f535")
public static String es_PE_FIELD_Accounting_AccountDate_Name="Fecha de Aplicación CG";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=80,SortNo=2,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5c47daec-810f-7a88-b280-8cba8940f535")
public static final String FIELDNAME_Accounting_AccountDate="5c47daec-810f-7a88-b280-8cba8940f535";

@XendraTrl(Identifier="7c59d9ff-0591-4081-8892-e2b44456f1ee")
public static String es_PE_COLUMN_DateAcct_Name="Fecha de Aplicación CG";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7c59d9ff-0591-4081-8892-e2b44456f1ee",
Synchronized="2017-08-05 16:54:35.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";
/** Set Transaction Date.
@param DateTrx Transaction Date */
public void setDateTrx (Timestamp DateTrx)
{
if (DateTrx == null) throw new IllegalArgumentException ("DateTrx is mandatory.");
set_ValueNoCheck (COLUMNNAME_DateTrx, DateTrx);
}
/** Get Transaction Date.
@return Transaction Date */
public Timestamp getDateTrx() 
{
return (Timestamp)get_Value(COLUMNNAME_DateTrx);
}

@XendraTrl(Identifier="fff17864-2339-dc2e-2af0-34c9ad071e15")
public static String es_PE_FIELD_Accounting_TransactionDate_Description="Fecha de la transacción";

@XendraTrl(Identifier="fff17864-2339-dc2e-2af0-34c9ad071e15")
public static String es_PE_FIELD_Accounting_TransactionDate_Help="La fecha de transacción indica la fecha en que se ejecutó la transacción";

@XendraTrl(Identifier="fff17864-2339-dc2e-2af0-34c9ad071e15")
public static String es_PE_FIELD_Accounting_TransactionDate_Name="Fecha de la Transacción";

@XendraField(AD_Column_ID="DateTrx",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fff17864-2339-dc2e-2af0-34c9ad071e15")
public static final String FIELDNAME_Accounting_TransactionDate="fff17864-2339-dc2e-2af0-34c9ad071e15";

@XendraTrl(Identifier="b55a51e9-97f8-2a05-5a02-4036631eb34a")
public static String es_PE_COLUMN_DateTrx_Name="Fecha de la Transacción";

@XendraColumn(AD_Element_ID="3700288f-61dd-2021-b833-cf804ceed1e9",ColumnName="DateTrx",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b55a51e9-97f8-2a05-5a02-4036631eb34a",
Synchronized="2017-08-05 16:54:35.0")
/** Column name DateTrx */
public static final String COLUMNNAME_DateTrx = "DateTrx";
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

@XendraTrl(Identifier="f29b08dc-8d71-8695-24ed-3b57d2be76eb")
public static String es_PE_FIELD_Accounting_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="f29b08dc-8d71-8695-24ed-3b57d2be76eb")
public static String es_PE_FIELD_Accounting_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="f29b08dc-8d71-8695-24ed-3b57d2be76eb")
public static String es_PE_FIELD_Accounting_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f29b08dc-8d71-8695-24ed-3b57d2be76eb")
public static final String FIELDNAME_Accounting_Description="f29b08dc-8d71-8695-24ed-3b57d2be76eb";

@XendraTrl(Identifier="659e761d-49e0-2c70-d3e9-e60a96db6cb7")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="659e761d-49e0-2c70-d3e9-e60a96db6cb7",
Synchronized="2017-08-05 16:54:35.0")
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

@XendraTrl(Identifier="8d44fdcd-d346-f04b-f3ee-c483e3bbf273")
public static String es_PE_FIELD_Accounting_AccountingFact_Name="Hecho Contable";

@XendraField(AD_Column_ID="Fact_Acct_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8d44fdcd-d346-f04b-f3ee-c483e3bbf273")
public static final String FIELDNAME_Accounting_AccountingFact="8d44fdcd-d346-f04b-f3ee-c483e3bbf273";
/** Column name Fact_Acct_ID */
public static final String COLUMNNAME_Fact_Acct_ID = "Fact_Acct_ID";
/** Set Accounting Fact ID (per document).
@param Fact_ID This ID is guaranteed to be unique per client per year per document (in the fact table). */
public void setFact_ID (String Fact_ID)
{
if (Fact_ID == null) throw new IllegalArgumentException ("Fact_ID is mandatory.");
if (Fact_ID.length() > 20)
{
log.warning("Length > 20 - truncated");
Fact_ID = Fact_ID.substring(0,19);
}
set_ValueNoCheck (COLUMNNAME_Fact_ID, Fact_ID);
}
/** Get Accounting Fact ID (per document).
@return This ID is guaranteed to be unique per client per year per document (in the fact table). */
public String getFact_ID() 
{
String value = (String)get_Value(COLUMNNAME_Fact_ID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c05aaea9-2f16-6301-a5f9-9b553b25b5a2")
public static String es_PE_FIELD_Accounting_AccountingFactIDPerDocument_Description="Se garantiza que este ID sea unico por cada cliente/ano/documento (en la tabla de asientos).";

@XendraTrl(Identifier="c05aaea9-2f16-6301-a5f9-9b553b25b5a2")
public static String es_PE_FIELD_Accounting_AccountingFactIDPerDocument_Name="ID Asiento Contable";

@XendraField(AD_Column_ID="Fact_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c05aaea9-2f16-6301-a5f9-9b553b25b5a2")
public static final String FIELDNAME_Accounting_AccountingFactIDPerDocument="c05aaea9-2f16-6301-a5f9-9b553b25b5a2";

@XendraTrl(Identifier="0eedc8f0-b007-698d-ff29-db65a9ad28f8")
public static String es_PE_COLUMN_Fact_ID_Name="ID Asiento Contable (por documento)";

@XendraColumn(AD_Element_ID="20f6c8ee-0151-735b-7a03-2006e09d8eb0",ColumnName="Fact_ID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0eedc8f0-b007-698d-ff29-db65a9ad28f8",
Synchronized="2017-08-05 16:54:35.0")
/** Column name Fact_ID */
public static final String COLUMNNAME_Fact_ID = "Fact_ID";
/** Set Budget.
@param GL_Budget_ID General Ledger Budget */
public void setGL_Budget_ID (int GL_Budget_ID)
{
if (GL_Budget_ID <= 0) set_ValueNoCheck (COLUMNNAME_GL_Budget_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_GL_Budget_ID, Integer.valueOf(GL_Budget_ID));
}
/** Get Budget.
@return General Ledger Budget */
public int getGL_Budget_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_GL_Budget_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7657abb7-9712-5260-fd69-1f09e24e7fe7")
public static String es_PE_FIELD_Accounting_Budget_Description="Presupuesto de la Contabilidad General";

@XendraTrl(Identifier="7657abb7-9712-5260-fd69-1f09e24e7fe7")
public static String es_PE_FIELD_Accounting_Budget_Help="El Presupuesto de Contabilidad General identifica un presupuesto definido por el usuario. Puede ser usado para reportar en comparación con los meses reales.";

@XendraTrl(Identifier="7657abb7-9712-5260-fd69-1f09e24e7fe7")
public static String es_PE_FIELD_Accounting_Budget_Name="Presupuesto";

@XendraField(AD_Column_ID="GL_Budget_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=290,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7657abb7-9712-5260-fd69-1f09e24e7fe7")
public static final String FIELDNAME_Accounting_Budget="7657abb7-9712-5260-fd69-1f09e24e7fe7";

@XendraTrl(Identifier="6ea57b85-2d05-a6a1-b980-79e66f180bf8")
public static String es_PE_COLUMN_GL_Budget_ID_Name="Presupuesto";

@XendraColumn(AD_Element_ID="202442f1-5c47-451c-a68b-6c32567592ad",ColumnName="GL_Budget_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6ea57b85-2d05-a6a1-b980-79e66f180bf8",
Synchronized="2017-08-05 16:54:35.0")
/** Column name GL_Budget_ID */
public static final String COLUMNNAME_GL_Budget_ID = "GL_Budget_ID";
/** Set GL Category.
@param GL_Category_ID General Ledger Category */
public void setGL_Category_ID (int GL_Category_ID)
{
if (GL_Category_ID < 1) throw new IllegalArgumentException ("GL_Category_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_GL_Category_ID, Integer.valueOf(GL_Category_ID));
}
/** Get GL Category.
@return General Ledger Category */
public int getGL_Category_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_GL_Category_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f29c2fb7-f2a8-358b-4c36-ee317f6a5fdb")
public static String es_PE_FIELD_Accounting_GLCategory_Description="Categoría de Contabilidad General";

@XendraTrl(Identifier="f29c2fb7-f2a8-358b-4c36-ee317f6a5fdb")
public static String es_PE_FIELD_Accounting_GLCategory_Help="La Categoría de Contabilidad General es un método opcional; definido por el usuario; de agrupación de líneas de las pólizas";

@XendraTrl(Identifier="f29c2fb7-f2a8-358b-4c36-ee317f6a5fdb")
public static String es_PE_FIELD_Accounting_GLCategory_Name="Categoría CG";

@XendraField(AD_Column_ID="GL_Category_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=260,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f29c2fb7-f2a8-358b-4c36-ee317f6a5fdb")
public static final String FIELDNAME_Accounting_GLCategory="f29c2fb7-f2a8-358b-4c36-ee317f6a5fdb";

@XendraTrl(Identifier="1ce111aa-0e7c-4571-04ad-dbf40c1a93a4")
public static String es_PE_COLUMN_GL_Category_ID_Name="Categoría CG";

@XendraColumn(AD_Element_ID="b3063a1c-d28b-42fc-2d1b-27037b4d6514",ColumnName="GL_Category_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1ce111aa-0e7c-4571-04ad-dbf40c1a93a4",
Synchronized="2017-08-05 16:54:35.0")
/** Column name GL_Category_ID */
public static final String COLUMNNAME_GL_Category_ID = "GL_Category_ID";
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
@XendraTrl(Identifier="48dbae05-b2b7-495f-bfd4-4144f26887f4")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="48dbae05-b2b7-495f-bfd4-4144f26887f4",
Synchronized="2017-08-05 16:54:35.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Invoice Document No.
@param InvoiceDocumentNo Document Number of the Invoice */
public void setInvoiceDocumentNo (String InvoiceDocumentNo)
{
if (InvoiceDocumentNo != null && InvoiceDocumentNo.length() > 30)
{
log.warning("Length > 30 - truncated");
InvoiceDocumentNo = InvoiceDocumentNo.substring(0,29);
}
set_Value (COLUMNNAME_InvoiceDocumentNo, InvoiceDocumentNo);
}
/** Get Invoice Document No.
@return Document Number of the Invoice */
public String getInvoiceDocumentNo() 
{
String value = (String)get_Value(COLUMNNAME_InvoiceDocumentNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d603bf90-6983-ddb1-5bcd-77e10223e6ce")
public static String es_PE_FIELD_Accounting_InvoiceDocumentNo_Description="Número de documento en la factura";

@XendraTrl(Identifier="d603bf90-6983-ddb1-5bcd-77e10223e6ce")
public static String es_PE_FIELD_Accounting_InvoiceDocumentNo_Name="No. de Documento Factura";

@XendraField(AD_Column_ID="InvoiceDocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=30,IsReadOnly=true,SeqNo=280,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d603bf90-6983-ddb1-5bcd-77e10223e6ce")
public static final String FIELDNAME_Accounting_InvoiceDocumentNo="d603bf90-6983-ddb1-5bcd-77e10223e6ce";

@XendraTrl(Identifier="082648cd-247c-04c4-3acd-04c7da0c2b53")
public static String es_PE_COLUMN_InvoiceDocumentNo_Name="Invoice Document No";

@XendraColumn(AD_Element_ID="8fe4a47f-1637-81de-48d3-f43e7643d57d",ColumnName="InvoiceDocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="082648cd-247c-04c4-3acd-04c7da0c2b53",
Synchronized="2017-08-05 16:54:35.0")
/** Column name InvoiceDocumentNo */
public static final String COLUMNNAME_InvoiceDocumentNo = "InvoiceDocumentNo";
/** Set Close Document.
@param IsCloseDocument Close Document (process) */
public void setIsCloseDocument (boolean IsCloseDocument)
{
set_Value (COLUMNNAME_IsCloseDocument, Boolean.valueOf(IsCloseDocument));
}
/** Get Close Document.
@return Close Document (process) */
public boolean isCloseDocument() 
{
Object oo = get_Value(COLUMNNAME_IsCloseDocument);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="6d1ef2a7-66a6-4396-b245-f0dc878e8d78")
public static String es_PE_COLUMN_IsCloseDocument_Name="Close Document";

@XendraColumn(AD_Element_ID="ba1e3b22-a9f1-84d5-6c2b-f96847f7f25c",ColumnName="IsCloseDocument",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6d1ef2a7-66a6-4396-b245-f0dc878e8d78",
Synchronized="2017-08-05 16:54:35.0")
/** Column name IsCloseDocument */
public static final String COLUMNNAME_IsCloseDocument = "IsCloseDocument";
/** Set IsDistribution.
@param IsDistribution IsDistribution */
public void setIsDistribution (boolean IsDistribution)
{
set_Value (COLUMNNAME_IsDistribution, Boolean.valueOf(IsDistribution));
}
/** Get IsDistribution.
@return IsDistribution */
public boolean isDistribution() 
{
Object oo = get_Value(COLUMNNAME_IsDistribution);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="7d9cd3a9-5bd4-315a-c19d-40d4366ed483")
public static String es_PE_FIELD_Accounting_IsDistribution_Name="IsDistribution";

@XendraField(AD_Column_ID="IsDistribution",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7d9cd3a9-5bd4-315a-c19d-40d4366ed483")
public static final String FIELDNAME_Accounting_IsDistribution="7d9cd3a9-5bd4-315a-c19d-40d4366ed483";

@XendraTrl(Identifier="e0d92ccd-af7f-ab7a-c1a2-5d76a4e8ccf3")
public static String es_PE_COLUMN_IsDistribution_Name="isdistribution";

@XendraColumn(AD_Element_ID="bed8dfcb-6786-8cd3-0db3-77fd18706a1e",ColumnName="IsDistribution",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e0d92ccd-af7f-ab7a-c1a2-5d76a4e8ccf3",
Synchronized="2017-08-05 16:54:36.0")
/** Column name IsDistribution */
public static final String COLUMNNAME_IsDistribution = "IsDistribution";
/** Set IsOpenDocument.
@param IsOpenDocument IsOpenDocument */
public void setIsOpenDocument (boolean IsOpenDocument)
{
set_Value (COLUMNNAME_IsOpenDocument, Boolean.valueOf(IsOpenDocument));
}
/** Get IsOpenDocument.
@return IsOpenDocument */
public boolean isOpenDocument() 
{
Object oo = get_Value(COLUMNNAME_IsOpenDocument);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="88604534-7640-4520-8c7c-4ffaee751876")
public static String es_PE_COLUMN_IsOpenDocument_Name="IsOpenDocument";

@XendraColumn(AD_Element_ID="2888b8d7-7c19-4542-a943-a77ea885f1cf",ColumnName="IsOpenDocument",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="88604534-7640-4520-8c7c-4ffaee751876",
Synchronized="2017-08-05 16:54:36.0")
/** Column name IsOpenDocument */
public static final String COLUMNNAME_IsOpenDocument = "IsOpenDocument";
/** Set Line ID.
@param Line_ID Transaction line ID (internal) */
public void setLine_ID (int Line_ID)
{
if (Line_ID <= 0) set_ValueNoCheck (COLUMNNAME_Line_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_Line_ID, Integer.valueOf(Line_ID));
}
/** Get Line ID.
@return Transaction line ID (internal) */
public int getLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Line_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d580f79f-5137-e1f5-2e2f-46bfad2166dd")
public static String es_PE_FIELD_Accounting_LineID_Description="Id de la línea de la transacción (interna)";

@XendraTrl(Identifier="d580f79f-5137-e1f5-2e2f-46bfad2166dd")
public static String es_PE_FIELD_Accounting_LineID_Help="Enlace Interno";

@XendraTrl(Identifier="d580f79f-5137-e1f5-2e2f-46bfad2166dd")
public static String es_PE_FIELD_Accounting_LineID_Name="ID Línea";

@XendraField(AD_Column_ID="Line_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d580f79f-5137-e1f5-2e2f-46bfad2166dd")
public static final String FIELDNAME_Accounting_LineID="d580f79f-5137-e1f5-2e2f-46bfad2166dd";

@XendraTrl(Identifier="9848f6fe-1d5b-d0a9-f14a-0b6dedd9802a")
public static String es_PE_COLUMN_Line_ID_Name="ID Línea";

@XendraColumn(AD_Element_ID="adc709ee-597a-b2ad-0110-9a9b225f70fa",ColumnName="Line_ID",
AD_Reference_ID=13,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9848f6fe-1d5b-d0a9-f14a-0b6dedd9802a",
Synchronized="2017-08-05 16:54:36.0")
/** Column name Line_ID */
public static final String COLUMNNAME_Line_ID = "Line_ID";
/** Set Locator.
@param M_Locator_ID Warehouse Locator */
public void setM_Locator_ID (int M_Locator_ID)
{
if (M_Locator_ID <= 0) set_ValueNoCheck (COLUMNNAME_M_Locator_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_M_Locator_ID, Integer.valueOf(M_Locator_ID));
}
/** Get Locator.
@return Warehouse Locator */
public int getM_Locator_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Locator_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="93320ddc-573d-9c6c-e04c-fda8cf6b3eb5")
public static String es_PE_FIELD_Accounting_Locator_Description="Ubicación de Almacén";

@XendraTrl(Identifier="93320ddc-573d-9c6c-e04c-fda8cf6b3eb5")
public static String es_PE_FIELD_Accounting_Locator_Help="El ID de la ubicación indica en que parte del almacén se localiza el producto";

@XendraTrl(Identifier="93320ddc-573d-9c6c-e04c-fda8cf6b3eb5")
public static String es_PE_FIELD_Accounting_Locator_Name="Ubicación";

@XendraField(AD_Column_ID="M_Locator_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=310,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="93320ddc-573d-9c6c-e04c-fda8cf6b3eb5")
public static final String FIELDNAME_Accounting_Locator="93320ddc-573d-9c6c-e04c-fda8cf6b3eb5";

@XendraTrl(Identifier="b22d02c9-6b81-e2ad-c661-c1605fe2c2e3")
public static String es_PE_COLUMN_M_Locator_ID_Name="Ubicación";

@XendraColumn(AD_Element_ID="67f044ce-2864-93f9-fd0d-320945150933",ColumnName="M_Locator_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b22d02c9-6b81-e2ad-c661-c1605fe2c2e3",
Synchronized="2017-08-05 16:54:36.0")
/** Column name M_Locator_ID */
public static final String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID <= 0) set_ValueNoCheck (COLUMNNAME_M_Product_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
}
/** Get Product.
@return Product, Service, Item */
public int getM_Product_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7b05286f-dbc9-c19a-a5a4-6e2fa1f8ef11")
public static String es_PE_FIELD_Accounting_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="7b05286f-dbc9-c19a-a5a4-6e2fa1f8ef11")
public static String es_PE_FIELD_Accounting_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="7b05286f-dbc9-c19a-a5a4-6e2fa1f8ef11")
public static String es_PE_FIELD_Accounting_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_PR@=Y",DisplayLength=26,IsReadOnly=true,SeqNo=140,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="7b05286f-dbc9-c19a-a5a4-6e2fa1f8ef11")
public static final String FIELDNAME_Accounting_Product="7b05286f-dbc9-c19a-a5a4-6e2fa1f8ef11";

@XendraTrl(Identifier="8c8471d0-76eb-8ab1-ea1d-dba5a833cc88")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8c8471d0-76eb-8ab1-ea1d-dba5a833cc88",
Synchronized="2017-08-05 16:54:36.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";

/** PostingType AD_Reference=1ad48d23-2ec9-09d0-cb68-38688c5e6ce0 */
public static final int POSTINGTYPE_AD_Reference_ID=125;
/** Set PostingType.
@param PostingType The type of posted amount for the transaction */
public void setPostingType (String PostingType)
{
if (PostingType == null) throw new IllegalArgumentException ("PostingType is mandatory");
if (PostingType.equals(REF__PostingType.Actual) || PostingType.equals(REF__PostingType.Budget) || PostingType.equals(REF__PostingType.Commitment) || PostingType.equals(REF__PostingType.Statistical) || PostingType.equals(REF__PostingType.Reservation));
 else throw new IllegalArgumentException ("PostingType Invalid value - " + PostingType + " - Reference_ID=125 - A - B - E - S - R");
if (PostingType.length() > 1)
{
log.warning("Length > 1 - truncated");
PostingType = PostingType.substring(0,0);
}
set_ValueNoCheck (COLUMNNAME_PostingType, PostingType);
}
/** Get PostingType.
@return The type of posted amount for the transaction */
public String getPostingType() 
{
return (String)get_Value(COLUMNNAME_PostingType);
}

@XendraTrl(Identifier="aaabc0e2-88d0-e76f-afd5-c440b5ccfba1")
public static String es_PE_FIELD_Accounting_PostingType_Description="El tipo de total que esta póliza actualizó";

@XendraTrl(Identifier="aaabc0e2-88d0-e76f-afd5-c440b5ccfba1")
public static String es_PE_FIELD_Accounting_PostingType_Help="El tipo de aplicación indica el tipo de total (actual; gravamen; presupuesto) que esta póliza actualizó";

@XendraTrl(Identifier="aaabc0e2-88d0-e76f-afd5-c440b5ccfba1")
public static String es_PE_FIELD_Accounting_PostingType_Name="Tipo de Aplicación";

@XendraField(AD_Column_ID="PostingType",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aaabc0e2-88d0-e76f-afd5-c440b5ccfba1")
public static final String FIELDNAME_Accounting_PostingType="aaabc0e2-88d0-e76f-afd5-c440b5ccfba1";

@XendraTrl(Identifier="c695cca6-2527-c616-8ba3-7da65210895c")
public static String es_PE_COLUMN_PostingType_Name="Tipo de Aplicación";

@XendraColumn(AD_Element_ID="465cd8dd-d2b8-aa76-fc18-7f8df439b182",ColumnName="PostingType",
AD_Reference_ID=17,AD_Reference_Value_ID="1ad48d23-2ec9-09d0-cb68-38688c5e6ce0",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c695cca6-2527-c616-8ba3-7da65210895c",Synchronized="2017-08-05 16:54:36.0")
/** Column name PostingType */
public static final String COLUMNNAME_PostingType = "PostingType";
/** Set Quantity.
@param Qty Quantity */
public void setQty (BigDecimal Qty)
{
set_ValueNoCheck (COLUMNNAME_Qty, Qty);
}
/** Get Quantity.
@return Quantity */
public BigDecimal getQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Qty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="abd79236-7c7e-6397-acee-882a6ef414c8")
public static String es_PE_FIELD_Accounting_Quantity_Description="Cantidad";

@XendraTrl(Identifier="abd79236-7c7e-6397-acee-882a6ef414c8")
public static String es_PE_FIELD_Accounting_Quantity_Help="La Cantidad indica el número de un producto específico o artículo para este documento";

@XendraTrl(Identifier="abd79236-7c7e-6397-acee-882a6ef414c8")
public static String es_PE_FIELD_Accounting_Quantity_Name="Cantidad";

@XendraField(AD_Column_ID="Qty",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="Quantities",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=380,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="abd79236-7c7e-6397-acee-882a6ef414c8")
public static final String FIELDNAME_Accounting_Quantity="abd79236-7c7e-6397-acee-882a6ef414c8";

@XendraTrl(Identifier="f2625785-e221-d66f-03cc-a71a0cbb86cf")
public static String es_PE_COLUMN_Qty_Name="Cantidad";

@XendraColumn(AD_Element_ID="c9d74a25-87c5-9592-5660-4f397607dad3",ColumnName="Qty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f2625785-e221-d66f-03cc-a71a0cbb86cf",
Synchronized="2017-08-05 16:54:36.0")
/** Column name Qty */
public static final String COLUMNNAME_Qty = "Qty";
/** Set Record ID.
@param Record_ID Direct internal record ID */
public void setRecord_ID (int Record_ID)
{
if (Record_ID < 0) throw new IllegalArgumentException ("Record_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_Record_ID, Integer.valueOf(Record_ID));
}
/** Get Record ID.
@return Direct internal record ID */
public int getRecord_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Record_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="bc86f822-b6e1-8d9d-7749-bc80c9f14ce3")
public static String es_PE_FIELD_Accounting_RecordID_Description="Identificador de registro interno";

@XendraTrl(Identifier="bc86f822-b6e1-8d9d-7749-bc80c9f14ce3")
public static String es_PE_FIELD_Accounting_RecordID_Help="La ID de registro es el identificador único interno de un registro.";

@XendraTrl(Identifier="bc86f822-b6e1-8d9d-7749-bc80c9f14ce3")
public static String es_PE_FIELD_Accounting_RecordID_Name="ID de Registro";

@XendraField(AD_Column_ID="Record_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bc86f822-b6e1-8d9d-7749-bc80c9f14ce3")
public static final String FIELDNAME_Accounting_RecordID="bc86f822-b6e1-8d9d-7749-bc80c9f14ce3";

@XendraTrl(Identifier="32122bdd-3ec5-58ce-28d8-f0d1c8d30b38")
public static String es_PE_COLUMN_Record_ID_Name="ID de Registro";

@XendraColumn(AD_Element_ID="86e36e4b-d1dc-2deb-449d-c1f6769e1603",ColumnName="Record_ID",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="32122bdd-3ec5-58ce-28d8-f0d1c8d30b38",
Synchronized="2017-08-05 16:54:36.0")
/** Column name Record_ID */
public static final String COLUMNNAME_Record_ID = "Record_ID";

/** Ref_Acct_ID AD_Reference=b263a96f-dfa5-81c7-3182-c952471719d0 */
public static final int REF_ACCT_ID_AD_Reference_ID=1000035;
/** Set Ref_Acct_ID.
@param Ref_Acct_ID Ref_Acct_ID */
public void setRef_Acct_ID (int Ref_Acct_ID)
{
if (Ref_Acct_ID <= 0) set_Value (COLUMNNAME_Ref_Acct_ID, null);
 else 
set_Value (COLUMNNAME_Ref_Acct_ID, Integer.valueOf(Ref_Acct_ID));
}
/** Get Ref_Acct_ID.
@return Ref_Acct_ID */
public int getRef_Acct_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Ref_Acct_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d6fe798d-0ed4-1e7c-96d0-126455fab316")
public static String es_PE_FIELD_Accounting_Ref_Acct_ID_Name="Asiento Referencia";

@XendraField(AD_Column_ID="Ref_Acct_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=390,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d6fe798d-0ed4-1e7c-96d0-126455fab316")
public static final String FIELDNAME_Accounting_Ref_Acct_ID="d6fe798d-0ed4-1e7c-96d0-126455fab316";

@XendraTrl(Identifier="0538e7cb-e614-2938-a26c-489289ab051b")
public static String es_PE_COLUMN_Ref_Acct_ID_Name="ref_acct_id";

@XendraColumn(AD_Element_ID="337264b1-5692-05a9-bd9c-e2fd226a34c0",ColumnName="Ref_Acct_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="b263a96f-dfa5-81c7-3182-c952471719d0",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0538e7cb-e614-2938-a26c-489289ab051b",Synchronized="2017-08-05 16:54:36.0")
/** Column name Ref_Acct_ID */
public static final String COLUMNNAME_Ref_Acct_ID = "Ref_Acct_ID";
/** Set Document Serial.
@param Serial Serial Number for the Document */
public void setSerial (String Serial)
{
if (Serial != null && Serial.length() > 10)
{
log.warning("Length > 10 - truncated");
Serial = Serial.substring(0,9);
}
set_Value (COLUMNNAME_Serial, Serial);
}
/** Get Document Serial.
@return Serial Number for the Document */
public String getSerial() 
{
String value = (String)get_Value(COLUMNNAME_Serial);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="2c617e6b-242b-6110-4a22-2a695240ca74")
public static String en_GB_FIELD_Accounting_DocumentSerial_Description="Serial Number for the Document";

@XendraTrl(Identifier="2c617e6b-242b-6110-4a22-2a695240ca74")
public static String es_PE_FIELD_Accounting_DocumentSerial_Description="Serie del Documento";

@XendraTrl(Identifier="2c617e6b-242b-6110-4a22-2a695240ca74")
public static String en_GB_FIELD_Accounting_DocumentSerial_Help="In some countries, documents have a serial in adition to it's number. Also, every serial has an independent sequence.";

@XendraTrl(Identifier="2c617e6b-242b-6110-4a22-2a695240ca74")
public static String es_PE_FIELD_Accounting_DocumentSerial_Help="En algunos paises, los documentos tienen una serie ademas de su numero. Ademas, cada serie tiene una numeracion independiente.";

@XendraTrl(Identifier="2c617e6b-242b-6110-4a22-2a695240ca74")
public static String en_GB_FIELD_Accounting_DocumentSerial_Name="Document Serial";

@XendraTrl(Identifier="2c617e6b-242b-6110-4a22-2a695240ca74")
public static String es_PE_FIELD_Accounting_DocumentSerial_Name="Serie del Documento";

@XendraField(AD_Column_ID="Serial",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=270,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2c617e6b-242b-6110-4a22-2a695240ca74")
public static final String FIELDNAME_Accounting_DocumentSerial="2c617e6b-242b-6110-4a22-2a695240ca74";

@XendraTrl(Identifier="dc90e16e-27df-051c-2205-ab533b9018df")
public static String es_PE_COLUMN_Serial_Name="Document Serial";

@XendraColumn(AD_Element_ID="56277733-3963-25db-320e-99e754ca1e9c",ColumnName="Serial",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dc90e16e-27df-051c-2205-ab533b9018df",
Synchronized="2017-08-05 16:54:36.0")
/** Column name Serial */
public static final String COLUMNNAME_Serial = "Serial";

/** User1_ID AD_Reference=5a2fe161-044f-67cb-3791-6d615980cabb */
public static final int USER1_ID_AD_Reference_ID=134;
/** Set User List 1.
@param User1_ID User defined list element #1 */
public void setUser1_ID (int User1_ID)
{
if (User1_ID <= 0) set_ValueNoCheck (COLUMNNAME_User1_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_User1_ID, Integer.valueOf(User1_ID));
}
/** Get User List 1.
@return User defined list element #1 */
public int getUser1_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_User1_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8b897e98-faf6-f02d-5d30-32788f557a65")
public static String es_PE_FIELD_Accounting_UserList_Description="El usuario definió el elemento # 1";

@XendraTrl(Identifier="8b897e98-faf6-f02d-5d30-32788f557a65")
public static String es_PE_FIELD_Accounting_UserList_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraTrl(Identifier="8b897e98-faf6-f02d-5d30-32788f557a65")
public static String es_PE_FIELD_Accounting_UserList_Name="Usuario 1";

@XendraField(AD_Column_ID="User1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_U1@=Y",DisplayLength=14,IsReadOnly=true,SeqNo=220,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="8b897e98-faf6-f02d-5d30-32788f557a65")
public static final String FIELDNAME_Accounting_UserList="8b897e98-faf6-f02d-5d30-32788f557a65";

@XendraTrl(Identifier="1cc3e1e3-d958-384f-7239-77a1e4566b82")
public static String es_PE_COLUMN_User1_ID_Name="Usuario 1";

@XendraColumn(AD_Element_ID="07453e74-aadd-d9c9-e543-837a6fdb3094",ColumnName="User1_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="5a2fe161-044f-67cb-3791-6d615980cabb",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="1cc3e1e3-d958-384f-7239-77a1e4566b82",Synchronized="2017-08-05 16:54:36.0")
/** Column name User1_ID */
public static final String COLUMNNAME_User1_ID = "User1_ID";

/** User2_ID AD_Reference=6a357ab2-7bb6-fce4-ffee-8bdd855a77fc */
public static final int USER2_ID_AD_Reference_ID=137;
/** Set User List 2.
@param User2_ID User defined list element #2 */
public void setUser2_ID (int User2_ID)
{
if (User2_ID <= 0) set_ValueNoCheck (COLUMNNAME_User2_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_User2_ID, Integer.valueOf(User2_ID));
}
/** Get User List 2.
@return User defined list element #2 */
public int getUser2_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_User2_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ee0582d7-830e-0c12-4e19-ed59aafac8c5")
public static String es_PE_FIELD_Accounting_UserList22_Description="El usuario definió el elemento # 2";

@XendraTrl(Identifier="ee0582d7-830e-0c12-4e19-ed59aafac8c5")
public static String es_PE_FIELD_Accounting_UserList22_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraTrl(Identifier="ee0582d7-830e-0c12-4e19-ed59aafac8c5")
public static String es_PE_FIELD_Accounting_UserList22_Name="Usuario 2";

@XendraField(AD_Column_ID="User2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_U2@=Y",DisplayLength=14,IsReadOnly=true,SeqNo=230,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ee0582d7-830e-0c12-4e19-ed59aafac8c5")
public static final String FIELDNAME_Accounting_UserList22="ee0582d7-830e-0c12-4e19-ed59aafac8c5";

@XendraTrl(Identifier="dcafa37e-7f86-d462-0dda-3ebf45ad33d2")
public static String es_PE_COLUMN_User2_ID_Name="Usuario 2";

@XendraColumn(AD_Element_ID="1b668c90-6743-20a2-df62-576857d72c06",ColumnName="User2_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="6a357ab2-7bb6-fce4-ffee-8bdd855a77fc",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="dcafa37e-7f86-d462-0dda-3ebf45ad33d2",Synchronized="2017-08-05 16:54:36.0")
/** Column name User2_ID */
public static final String COLUMNNAME_User2_ID = "User2_ID";
/** Set User Element 1.
@param UserElement1_ID User defined accounting Element */
public void setUserElement1_ID (int UserElement1_ID)
{
if (UserElement1_ID <= 0) set_ValueNoCheck (COLUMNNAME_UserElement1_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_UserElement1_ID, Integer.valueOf(UserElement1_ID));
}
/** Get User Element 1.
@return User defined accounting Element */
public int getUserElement1_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_UserElement1_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2e708796-2ccd-c0ed-52eb-dac26c57abde")
public static String es_PE_FIELD_Accounting_UserElement_Description="Elemento Contable definido por Usuario";

@XendraTrl(Identifier="2e708796-2ccd-c0ed-52eb-dac26c57abde")
public static String es_PE_FIELD_Accounting_UserElement_Help="el elemento contable definido por el usuario refiere a una tabla de Adempiere. Esto le permite emplear el contenido de cualquier tabla como una dimensión contable (ej  Actividad de Proyecto). Note que los Elementos de Usuario son opcionales y son llenados desde el contexto del Documento (ej. No Solicitado).";

@XendraTrl(Identifier="2e708796-2ccd-c0ed-52eb-dac26c57abde")
public static String es_PE_FIELD_Accounting_UserElement_Name="Elemento 1 de Usuario";

@XendraField(AD_Column_ID="UserElement1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_X1@=Y",DisplayLength=10,IsReadOnly=true,SeqNo=240,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="2e708796-2ccd-c0ed-52eb-dac26c57abde")
public static final String FIELDNAME_Accounting_UserElement="2e708796-2ccd-c0ed-52eb-dac26c57abde";

@XendraTrl(Identifier="3a8077d9-306a-a5ae-7c38-7b6abe1a4946")
public static String es_PE_COLUMN_UserElement1_ID_Name="Elemento 1 de Usuario";

@XendraColumn(AD_Element_ID="ff0e32d9-4f26-c956-dcff-4c22340ac351",ColumnName="UserElement1_ID",
AD_Reference_ID=13,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3a8077d9-306a-a5ae-7c38-7b6abe1a4946",
Synchronized="2017-08-05 16:54:36.0")
/** Column name UserElement1_ID */
public static final String COLUMNNAME_UserElement1_ID = "UserElement1_ID";
/** Set User Element 2.
@param UserElement2_ID User defined accounting Element */
public void setUserElement2_ID (int UserElement2_ID)
{
if (UserElement2_ID <= 0) set_ValueNoCheck (COLUMNNAME_UserElement2_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_UserElement2_ID, Integer.valueOf(UserElement2_ID));
}
/** Get User Element 2.
@return User defined accounting Element */
public int getUserElement2_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_UserElement2_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3c1af9c0-d940-0e0c-0b39-5c41de2986a2")
public static String es_PE_FIELD_Accounting_UserElement22_Description="Elemento Contable definido por Usuario";

@XendraTrl(Identifier="3c1af9c0-d940-0e0c-0b39-5c41de2986a2")
public static String es_PE_FIELD_Accounting_UserElement22_Help="Un Elemento Contable definido por el Usuario refiere a una Tabla de Adempiere. Esto le permite emplear el contenido de cualquier Tabla como una Dimensión Contable (Ej. Actividad de  Proyecto). Note que los Elementos de Usuario son opcionales y son llenados desde el contexto del Documento (ej. No Solicitado).";

@XendraTrl(Identifier="3c1af9c0-d940-0e0c-0b39-5c41de2986a2")
public static String es_PE_FIELD_Accounting_UserElement22_Name="Elemento 2 de Usuario";

@XendraField(AD_Column_ID="UserElement2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17174a03-85dd-aa1a-940c-125c6645b4f7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_X2@=Y",DisplayLength=10,IsReadOnly=true,SeqNo=250,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3c1af9c0-d940-0e0c-0b39-5c41de2986a2")
public static final String FIELDNAME_Accounting_UserElement22="3c1af9c0-d940-0e0c-0b39-5c41de2986a2";

@XendraTrl(Identifier="623908c5-759b-b94a-b500-088037223714")
public static String es_PE_COLUMN_UserElement2_ID_Name="Elemento 2 de Usuario";

@XendraColumn(AD_Element_ID="e99c9066-c80c-ab02-0bfb-e485dfbadc2d",ColumnName="UserElement2_ID",
AD_Reference_ID=13,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="623908c5-759b-b94a-b500-088037223714",
Synchronized="2017-08-05 16:54:36.0")
/** Column name UserElement2_ID */
public static final String COLUMNNAME_UserElement2_ID = "UserElement2_ID";
}
