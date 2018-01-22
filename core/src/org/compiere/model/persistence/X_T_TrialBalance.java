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
/** Generated Model for T_TrialBalance
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_T_TrialBalance extends PO
{
/** Standard Constructor
@param ctx context
@param T_TrialBalance_ID id
@param trxName transaction
*/
public X_T_TrialBalance (Properties ctx, int T_TrialBalance_ID, String trxName)
{
super (ctx, T_TrialBalance_ID, trxName);
/** if (T_TrialBalance_ID == 0)
{
setAD_PInstance_ID (0);
setAmtAcctBalance (Env.ZERO);	
// 0
setAmtAcctCr (Env.ZERO);	
// 0
setAmtAcctDr (Env.ZERO);	
// 0
setC_AcctSchema_ID (0);
setDateAcct (new Timestamp(System.currentTimeMillis()));
setFact_Acct_ID (0);
setPostingType (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_T_TrialBalance (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=753 */
public static int Table_ID=MTable.getTable_ID("T_TrialBalance");

@XendraTrl(Identifier="50d0f0a8-5295-a624-3da1-2f105cfc0c6c")
public static String es_PE_TABLE_T_TrialBalance_Name="Trial Balance";

@XendraTable(Name="Trial Balance",Description="",Help="",TableName="T_TrialBalance",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=150,IsSecurityEnabled=false,
IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.standard",Identifier="50d0f0a8-5295-a624-3da1-2f105cfc0c6c",
Synchronized="2017-08-16 11:44:27.0")
/** TableName=T_TrialBalance */
public static final String Table_Name="T_TrialBalance";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"T_TrialBalance");

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
    Table_ID = MTable.getTable_ID("T_TrialBalance");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_T_TrialBalance[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Asset.
@param A_Asset_ID Asset used internally or by customers */
public void setA_Asset_ID (int A_Asset_ID)
{
if (A_Asset_ID <= 0) set_ValueNoCheck (COLUMNNAME_A_Asset_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_A_Asset_ID, Integer.valueOf(A_Asset_ID));
}
/** Get Asset.
@return Asset used internally or by customers */
public int getA_Asset_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1f5d60ff-f288-20be-c724-a91ebb6c4c00")
public static String es_PE_COLUMN_A_Asset_ID_Name="Activo";

@XendraColumn(AD_Element_ID="3cd84c49-e25b-9ecc-5637-ed9a07d76bee",ColumnName="A_Asset_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1f5d60ff-f288-20be-c724-a91ebb6c4c00",
Synchronized="2017-08-05 16:56:30.0")
/** Column name A_Asset_ID */
public static final String COLUMNNAME_A_Asset_ID = "A_Asset_ID";

/** Account_ID AD_Reference=fca59846-3472-6195-37e9-9b8f95376f02 */
public static final int ACCOUNT_ID_AD_Reference_ID=132;
/** Set Account.
@param Account_ID Account used */
public void setAccount_ID (int Account_ID)
{
if (Account_ID <= 0) set_ValueNoCheck (COLUMNNAME_Account_ID, null);
 else 
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

@XendraTrl(Identifier="d19c0f55-0127-64d7-372d-cf99de533c28")
public static String es_PE_COLUMN_Account_ID_Name="Cuenta";

@XendraColumn(AD_Element_ID="80f1c2b7-bd3e-7c80-0596-67c2f7ca3812",ColumnName="Account_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="fca59846-3472-6195-37e9-9b8f95376f02",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d19c0f55-0127-64d7-372d-cf99de533c28",Synchronized="2017-08-05 16:56:30.0")
/** Column name Account_ID */
public static final String COLUMNNAME_Account_ID = "Account_ID";
/** Set Account Key.
@param AccountValue Key of Account Element */
public void setAccountValue (String AccountValue)
{
if (AccountValue != null && AccountValue.length() > 40)
{
log.warning("Length > 40 - truncated");
AccountValue = AccountValue.substring(0,39);
}
set_ValueNoCheck (COLUMNNAME_AccountValue, AccountValue);
}
/** Get Account Key.
@return Key of Account Element */
public String getAccountValue() 
{
String value = (String)get_Value(COLUMNNAME_AccountValue);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="25e2c70b-df6f-9b4c-6b13-98e7ebeeb6cf")
public static String es_PE_COLUMN_AccountValue_Name="Clave de Cuenta";

@XendraColumn(AD_Element_ID="8aef172c-9686-33af-fb2b-dfa839316024",ColumnName="AccountValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="25e2c70b-df6f-9b4c-6b13-98e7ebeeb6cf",
Synchronized="2017-08-05 16:56:30.0")
/** Column name AccountValue */
public static final String COLUMNNAME_AccountValue = "AccountValue";

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

@XendraTrl(Identifier="fe5bba63-f7d8-62a2-9a4f-1ef36739e340")
public static String es_PE_COLUMN_AD_OrgTrx_ID_Name="Organización de la Trans.";

@XendraColumn(AD_Element_ID="b4180358-67aa-fe55-0409-6367a60e0a2e",ColumnName="AD_OrgTrx_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="54e78591-f7f4-c613-ea27-e64b3dac5198",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="fe5bba63-f7d8-62a2-9a4f-1ef36739e340",Synchronized="2017-08-05 16:56:30.0")
/** Column name AD_OrgTrx_ID */
public static final String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
/** Set Process Instance.
@param AD_PInstance_ID Instance of the process */
public void setAD_PInstance_ID (int AD_PInstance_ID)
{
if (AD_PInstance_ID < 1) throw new IllegalArgumentException ("AD_PInstance_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_PInstance_ID, Integer.valueOf(AD_PInstance_ID));
}
/** Get Process Instance.
@return Instance of the process */
public int getAD_PInstance_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PInstance_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0784bad6-36ca-8b4f-87ff-bf1bcc1be371")
public static String es_PE_COLUMN_AD_PInstance_ID_Name="Instancia del Proceso";

@XendraColumn(AD_Element_ID="a293ee40-db79-24cc-fb47-781657ecb499",ColumnName="AD_PInstance_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0784bad6-36ca-8b4f-87ff-bf1bcc1be371",
Synchronized="2017-08-05 16:56:30.0")
/** Column name AD_PInstance_ID */
public static final String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
/** Set Table.
@param AD_Table_ID Database Table information */
public void setAD_Table_ID (int AD_Table_ID)
{
if (AD_Table_ID <= 0) set_ValueNoCheck (COLUMNNAME_AD_Table_ID, null);
 else 
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

@XendraTrl(Identifier="dd4e99b0-0b46-5e05-0d54-46401be12a97")
public static String es_PE_COLUMN_AD_Table_ID_Name="Tabla";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dd4e99b0-0b46-5e05-0d54-46401be12a97",
Synchronized="2017-08-05 16:56:30.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
/** Set Accounted Balance.
@param AmtAcctBalance Accounted Balance Amount */
public void setAmtAcctBalance (BigDecimal AmtAcctBalance)
{
if (AmtAcctBalance == null) throw new IllegalArgumentException ("AmtAcctBalance is mandatory.");
set_ValueNoCheck (COLUMNNAME_AmtAcctBalance, AmtAcctBalance);
}
/** Get Accounted Balance.
@return Accounted Balance Amount */
public BigDecimal getAmtAcctBalance() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtAcctBalance);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="5dd87e2d-2668-f684-5e13-1349389e1697")
public static String es_PE_COLUMN_AmtAcctBalance_Name="Balance Contable";

@XendraColumn(AD_Element_ID="37a156c9-083d-471f-c206-06304dffb44b",ColumnName="AmtAcctBalance",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5dd87e2d-2668-f684-5e13-1349389e1697",
Synchronized="2017-08-05 16:56:30.0")
/** Column name AmtAcctBalance */
public static final String COLUMNNAME_AmtAcctBalance = "AmtAcctBalance";
/** Set Accounted Credit.
@param AmtAcctCr Accounted Credit Amount */
public void setAmtAcctCr (BigDecimal AmtAcctCr)
{
if (AmtAcctCr == null) throw new IllegalArgumentException ("AmtAcctCr is mandatory.");
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

@XendraTrl(Identifier="a4a1050a-42cc-4fae-20b1-12db974271fd")
public static String es_PE_COLUMN_AmtAcctCr_Name="Crédito Contabilizado";

@XendraColumn(AD_Element_ID="945e7d70-99b5-5eaf-31ef-c5f460f7626c",ColumnName="AmtAcctCr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a4a1050a-42cc-4fae-20b1-12db974271fd",
Synchronized="2017-08-05 16:56:30.0")
/** Column name AmtAcctCr */
public static final String COLUMNNAME_AmtAcctCr = "AmtAcctCr";
/** Set Accounted Debit.
@param AmtAcctDr Accounted Debit Amount */
public void setAmtAcctDr (BigDecimal AmtAcctDr)
{
if (AmtAcctDr == null) throw new IllegalArgumentException ("AmtAcctDr is mandatory.");
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

@XendraTrl(Identifier="f13568f8-7d16-d202-3732-0ea4be818407")
public static String es_PE_COLUMN_AmtAcctDr_Name="Débito Contabilizado";

@XendraColumn(AD_Element_ID="67410612-76a4-c113-8594-305f58926372",ColumnName="AmtAcctDr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f13568f8-7d16-d202-3732-0ea4be818407",
Synchronized="2017-08-05 16:56:30.0")
/** Column name AmtAcctDr */
public static final String COLUMNNAME_AmtAcctDr = "AmtAcctDr";
/** Set Source Balance.
@param AmtSourceBalance Source Balance Amount */
public void setAmtSourceBalance (BigDecimal AmtSourceBalance)
{
set_ValueNoCheck (COLUMNNAME_AmtSourceBalance, AmtSourceBalance);
}
/** Get Source Balance.
@return Source Balance Amount */
public BigDecimal getAmtSourceBalance() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtSourceBalance);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="d6d4d4ae-02e3-5e5d-bd42-88dd6201f18d")
public static String es_PE_COLUMN_AmtSourceBalance_Name="Monto Fuente del Balance";

@XendraColumn(AD_Element_ID="7eefe83d-05f1-c92d-30cf-e7ecd0e6f5e0",ColumnName="AmtSourceBalance",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d6d4d4ae-02e3-5e5d-bd42-88dd6201f18d",
Synchronized="2017-08-05 16:56:30.0")
/** Column name AmtSourceBalance */
public static final String COLUMNNAME_AmtSourceBalance = "AmtSourceBalance";
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

@XendraTrl(Identifier="7ac352be-70af-8752-6110-b2d8ea7fe62e")
public static String es_PE_COLUMN_AmtSourceCr_Name="Abono";

@XendraColumn(AD_Element_ID="37fc9554-00eb-5046-f770-46b9f63a1166",ColumnName="AmtSourceCr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7ac352be-70af-8752-6110-b2d8ea7fe62e",
Synchronized="2017-08-05 16:56:30.0")
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

@XendraTrl(Identifier="cb88d7d2-3da2-2d50-33a1-90cbda2e040f")
public static String es_PE_COLUMN_AmtSourceDr_Name="Cargo";

@XendraColumn(AD_Element_ID="83234cfc-e73c-2419-af3c-afb9356f1f68",ColumnName="AmtSourceDr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cb88d7d2-3da2-2d50-33a1-90cbda2e040f",
Synchronized="2017-08-05 16:56:30.0")
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

@XendraTrl(Identifier="45ada197-d81c-dcdb-b9ed-27afe02d1c00")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="45ada197-d81c-dcdb-b9ed-27afe02d1c00",
Synchronized="2017-08-05 16:56:30.0")
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

@XendraTrl(Identifier="93c48ad6-0838-86c0-c402-d1da4bf3176c")
public static String es_PE_COLUMN_C_Activity_ID_Name="Tipo de Gasto";

@XendraColumn(AD_Element_ID="bfeadbb3-d866-26e3-8eee-3e2fdf0ff753",ColumnName="C_Activity_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="93c48ad6-0838-86c0-c402-d1da4bf3176c",
Synchronized="2017-08-05 16:56:30.0")
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

@XendraTrl(Identifier="9c46268a-c922-c5d4-1d2e-be9a22dbf28e")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9c46268a-c922-c5d4-1d2e-be9a22dbf28e",
Synchronized="2017-08-05 16:56:30.0")
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

@XendraTrl(Identifier="3eda42bf-e180-a59b-626b-51ad52113e36")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaña";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3eda42bf-e180-a59b-626b-51ad52113e36",
Synchronized="2017-08-05 16:56:30.0")
/** Column name C_Campaign_ID */
public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
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

@XendraTrl(Identifier="0ed2eeb2-0045-fdf9-c7ab-73c369d31fc2")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0ed2eeb2-0045-fdf9-c7ab-73c369d31fc2",
Synchronized="2017-08-05 16:56:30.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";

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

@XendraTrl(Identifier="3a0e2a8f-f434-5b4a-c61a-f5d047885998")
public static String es_PE_COLUMN_C_LocFrom_ID_Name="Desde Localización";

@XendraColumn(AD_Element_ID="5c54374e-b27b-3cd4-f5a8-8705436152bc",ColumnName="C_LocFrom_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="69189951-7109-d2c7-f034-b4660d43b572",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3a0e2a8f-f434-5b4a-c61a-f5d047885998",Synchronized="2017-08-05 16:56:30.0")
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

@XendraTrl(Identifier="bdeee52e-20fb-c48f-e9d3-9c002fe6899c")
public static String es_PE_COLUMN_C_LocTo_ID_Name="A Localización";

@XendraColumn(AD_Element_ID="531e981d-5722-db37-a6eb-54ec21b60a90",ColumnName="C_LocTo_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="69189951-7109-d2c7-f034-b4660d43b572",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="bdeee52e-20fb-c48f-e9d3-9c002fe6899c",Synchronized="2017-08-05 16:56:30.0")
/** Column name C_LocTo_ID */
public static final String COLUMNNAME_C_LocTo_ID = "C_LocTo_ID";
/** Set Period.
@param C_Period_ID Period of the Calendar */
public void setC_Period_ID (int C_Period_ID)
{
if (C_Period_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_Period_ID, null);
 else 
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

@XendraTrl(Identifier="ccf7f33e-2d08-b1bb-33a6-8376088236f4")
public static String es_PE_COLUMN_C_Period_ID_Name="Período";

@XendraColumn(AD_Element_ID="8f295c04-0eb4-a8f3-829f-cc6a6bd1df1e",ColumnName="C_Period_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ccf7f33e-2d08-b1bb-33a6-8376088236f4",
Synchronized="2017-08-05 16:56:30.0")
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

@XendraTrl(Identifier="57a6642b-55bc-92aa-efd6-96e41ace5d1e")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="57a6642b-55bc-92aa-efd6-96e41ace5d1e",
Synchronized="2017-08-05 16:56:30.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
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

@XendraTrl(Identifier="298f65a4-2057-358a-2f4d-1efa1d94b0fd")
public static String es_PE_COLUMN_C_SalesRegion_ID_Name="Región de Ventas";

@XendraColumn(AD_Element_ID="26b40f06-df79-27f7-adb4-8ae6c5a1c9b8",ColumnName="C_SalesRegion_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="298f65a4-2057-358a-2f4d-1efa1d94b0fd",
Synchronized="2017-08-05 16:56:30.0")
/** Column name C_SalesRegion_ID */
public static final String COLUMNNAME_C_SalesRegion_ID = "C_SalesRegion_ID";
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

@XendraTrl(Identifier="aaba9802-5804-4b3b-da29-a718f5ebb8da")
public static String es_PE_COLUMN_C_Tax_ID_Name="Impuesto";

@XendraColumn(AD_Element_ID="38ff24fc-b68c-51a9-60f8-ef2a1f060de2",ColumnName="C_Tax_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aaba9802-5804-4b3b-da29-a718f5ebb8da",
Synchronized="2017-08-05 16:56:31.0")
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

@XendraTrl(Identifier="3df719af-a094-b135-1f9f-598fb4b3e44f")
public static String es_PE_COLUMN_C_UOM_ID_Name="UM";

@XendraColumn(AD_Element_ID="d0345019-4fcc-44c8-4fd1-e38e3b4adeed",ColumnName="C_UOM_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3df719af-a094-b135-1f9f-598fb4b3e44f",
Synchronized="2017-08-05 16:56:31.0")
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

@XendraTrl(Identifier="a7057b86-ea43-a3cc-be90-f7c44bf242a7")
public static String es_PE_COLUMN_DateAcct_Name="Fecha de Aplicación CG";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a7057b86-ea43-a3cc-be90-f7c44bf242a7",
Synchronized="2017-08-05 16:56:31.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";
/** Set Transaction Date.
@param DateTrx Transaction Date */
public void setDateTrx (Timestamp DateTrx)
{
set_ValueNoCheck (COLUMNNAME_DateTrx, DateTrx);
}
/** Get Transaction Date.
@return Transaction Date */
public Timestamp getDateTrx() 
{
return (Timestamp)get_Value(COLUMNNAME_DateTrx);
}

@XendraTrl(Identifier="d4255aad-f496-23ad-0664-22474cd852f3")
public static String es_PE_COLUMN_DateTrx_Name="Fecha de la Transacción";

@XendraColumn(AD_Element_ID="3700288f-61dd-2021-b833-cf804ceed1e9",ColumnName="DateTrx",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d4255aad-f496-23ad-0664-22474cd852f3",
Synchronized="2017-08-05 16:56:31.0")
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
set_ValueNoCheck (COLUMNNAME_Description, Description);
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

@XendraTrl(Identifier="fb902e2f-d49e-bf9b-3d18-0e14104fa576")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fb902e2f-d49e-bf9b-3d18-0e14104fa576",
Synchronized="2017-08-05 16:56:31.0")
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

@XendraTrl(Identifier="a8e4b14c-451b-f035-8cb4-a9dd2d9583d9")
public static String es_PE_COLUMN_Fact_Acct_ID_Name="Hecho Contable";

@XendraColumn(AD_Element_ID="c1839793-0346-4c78-96ff-8f7942ce0082",ColumnName="Fact_Acct_ID",
AD_Reference_ID=13,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a8e4b14c-451b-f035-8cb4-a9dd2d9583d9",
Synchronized="2017-08-05 16:56:31.0")
/** Column name Fact_Acct_ID */
public static final String COLUMNNAME_Fact_Acct_ID = "Fact_Acct_ID";
/** Set Accounting Fact ID (per document).
@param Fact_ID This ID is guaranteed to be unique per client per year per document (in the fact table). */
public void setFact_ID (String Fact_ID)
{
if (Fact_ID != null && Fact_ID.length() > 20)
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
@XendraTrl(Identifier="707fb210-7a19-565c-a1f3-d7f1bb14d1f6")
public static String es_PE_COLUMN_Fact_ID_Name="ID Asiento Contable (por documento)";

@XendraColumn(AD_Element_ID="20f6c8ee-0151-735b-7a03-2006e09d8eb0",ColumnName="Fact_ID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="707fb210-7a19-565c-a1f3-d7f1bb14d1f6",
Synchronized="2017-08-05 16:56:31.0")
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

@XendraTrl(Identifier="97b2a43c-6d3e-09fc-f8fb-ec6b4df81f3f")
public static String es_PE_COLUMN_GL_Budget_ID_Name="Presupuesto";

@XendraColumn(AD_Element_ID="202442f1-5c47-451c-a68b-6c32567592ad",ColumnName="GL_Budget_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="97b2a43c-6d3e-09fc-f8fb-ec6b4df81f3f",
Synchronized="2017-08-05 16:56:31.0")
/** Column name GL_Budget_ID */
public static final String COLUMNNAME_GL_Budget_ID = "GL_Budget_ID";
/** Set GL Category.
@param GL_Category_ID General Ledger Category */
public void setGL_Category_ID (int GL_Category_ID)
{
if (GL_Category_ID <= 0) set_ValueNoCheck (COLUMNNAME_GL_Category_ID, null);
 else 
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

@XendraTrl(Identifier="e85565de-4221-0181-947d-c5c0f3a6fee6")
public static String es_PE_COLUMN_GL_Category_ID_Name="Categoría CG";

@XendraColumn(AD_Element_ID="b3063a1c-d28b-42fc-2d1b-27037b4d6514",ColumnName="GL_Category_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e85565de-4221-0181-947d-c5c0f3a6fee6",
Synchronized="2017-08-05 16:56:31.0")
/** Column name GL_Category_ID */
public static final String COLUMNNAME_GL_Category_ID = "GL_Category_ID";
/** Set Only Open Invoices.
@param IsOnlyOpen Only Open Invoices */
public void setIsOnlyOpen (boolean IsOnlyOpen)
{
set_Value (COLUMNNAME_IsOnlyOpen, Boolean.valueOf(IsOnlyOpen));
}
/** Get Only Open Invoices.
@return Only Open Invoices */
public boolean isOnlyOpen() 
{
Object oo = get_Value(COLUMNNAME_IsOnlyOpen);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="69be7456-5f7e-57c3-f632-7ddb0ed7ed71")
public static String es_PE_COLUMN_IsOnlyOpen_Name="Only Open Invoices";

@XendraColumn(AD_Element_ID="2ce4f235-734b-5cbe-fdff-ec1ebf9f96dc",ColumnName="IsOnlyOpen",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="69be7456-5f7e-57c3-f632-7ddb0ed7ed71",
Synchronized="2017-08-05 16:56:31.0")
/** Column name IsOnlyOpen */
public static final String COLUMNNAME_IsOnlyOpen = "IsOnlyOpen";
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

@XendraTrl(Identifier="60dafe34-a5d7-72c3-efd1-108eae76fa5f")
public static String es_PE_COLUMN_Line_ID_Name="ID Línea";

@XendraColumn(AD_Element_ID="adc709ee-597a-b2ad-0110-9a9b225f70fa",ColumnName="Line_ID",
AD_Reference_ID=13,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="60dafe34-a5d7-72c3-efd1-108eae76fa5f",
Synchronized="2017-08-05 16:56:31.0")
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

@XendraTrl(Identifier="5169ad56-11ca-6265-842e-d1a7e766b062")
public static String es_PE_COLUMN_M_Locator_ID_Name="Ubicación";

@XendraColumn(AD_Element_ID="67f044ce-2864-93f9-fd0d-320945150933",ColumnName="M_Locator_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5169ad56-11ca-6265-842e-d1a7e766b062",
Synchronized="2017-08-05 16:56:31.0")
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

@XendraTrl(Identifier="227d1c61-46fa-3d78-0f16-4d93a21aea15")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="227d1c61-46fa-3d78-0f16-4d93a21aea15",
Synchronized="2017-08-05 16:56:31.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Open Amount.
@param OpenAmt Open item amount */
public void setOpenAmt (BigDecimal OpenAmt)
{
set_ValueNoCheck (COLUMNNAME_OpenAmt, OpenAmt);
}
/** Get Open Amount.
@return Open item amount */
public BigDecimal getOpenAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_OpenAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="2e22a135-76ba-010f-0889-86d414a3a6cc")
public static String es_PE_COLUMN_OpenAmt_Name="Total Abierto";

@XendraColumn(AD_Element_ID="89a287e4-b72d-e4d4-2a42-90bcfde3d1ae",ColumnName="OpenAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2e22a135-76ba-010f-0889-86d414a3a6cc",
Synchronized="2017-08-05 16:56:31.0")
/** Column name OpenAmt */
public static final String COLUMNNAME_OpenAmt = "OpenAmt";
/** Set Open Source Open.
@param OpenSourceAmt Open Source Open */
public void setOpenSourceAmt (BigDecimal OpenSourceAmt)
{
set_ValueNoCheck (COLUMNNAME_OpenSourceAmt, OpenSourceAmt);
}
/** Get Open Source Open.
@return Open Source Open */
public BigDecimal getOpenSourceAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_OpenSourceAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="95528c19-8dbb-a4d7-bc43-c3346c4097ed")
public static String es_PE_COLUMN_OpenSourceAmt_Name="Monto Abierto Origen";

@XendraColumn(AD_Element_ID="c5a71687-95cd-ff16-f587-a52dc14e058d",ColumnName="OpenSourceAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="95528c19-8dbb-a4d7-bc43-c3346c4097ed",
Synchronized="2017-08-05 16:56:31.0")
/** Column name OpenSourceAmt */
public static final String COLUMNNAME_OpenSourceAmt = "OpenSourceAmt";

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

@XendraTrl(Identifier="8e331903-7d77-9530-21c9-f7047cf5a9f6")
public static String es_PE_COLUMN_PostingType_Name="Tipo de Aplicación";

@XendraColumn(AD_Element_ID="465cd8dd-d2b8-aa76-fc18-7f8df439b182",ColumnName="PostingType",
AD_Reference_ID=17,AD_Reference_Value_ID="1ad48d23-2ec9-09d0-cb68-38688c5e6ce0",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8e331903-7d77-9530-21c9-f7047cf5a9f6",Synchronized="2017-08-05 16:56:31.0")
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

@XendraTrl(Identifier="0f3e3f53-9859-fe55-f35a-8aae8860e8cb")
public static String es_PE_COLUMN_Qty_Name="Cantidad";

@XendraColumn(AD_Element_ID="c9d74a25-87c5-9592-5660-4f397607dad3",ColumnName="Qty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0f3e3f53-9859-fe55-f35a-8aae8860e8cb",
Synchronized="2017-08-05 16:56:31.0")
/** Column name Qty */
public static final String COLUMNNAME_Qty = "Qty";
/** Set Record ID.
@param Record_ID Direct internal record ID */
public void setRecord_ID (int Record_ID)
{
if (Record_ID <= 0) set_ValueNoCheck (COLUMNNAME_Record_ID, null);
 else 
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

@XendraTrl(Identifier="c13a01bc-2cd3-7458-709e-c9c137f1bd35")
public static String es_PE_COLUMN_Record_ID_Name="ID de Registro";

@XendraColumn(AD_Element_ID="86e36e4b-d1dc-2deb-449d-c1f6769e1603",ColumnName="Record_ID",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c13a01bc-2cd3-7458-709e-c9c137f1bd35",
Synchronized="2017-08-05 16:56:31.0")
/** Column name Record_ID */
public static final String COLUMNNAME_Record_ID = "Record_ID";

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

@XendraTrl(Identifier="c583def4-0007-f5a0-ae1f-7f4f6fb70bca")
public static String es_PE_COLUMN_User1_ID_Name="Usuario 1";

@XendraColumn(AD_Element_ID="07453e74-aadd-d9c9-e543-837a6fdb3094",ColumnName="User1_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="5a2fe161-044f-67cb-3791-6d615980cabb",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c583def4-0007-f5a0-ae1f-7f4f6fb70bca",Synchronized="2017-08-05 16:56:31.0")
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

@XendraTrl(Identifier="3b9db9c8-6898-56b5-1b44-50a5b5f43d0f")
public static String es_PE_COLUMN_User2_ID_Name="Usuario 2";

@XendraColumn(AD_Element_ID="1b668c90-6743-20a2-df62-576857d72c06",ColumnName="User2_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="6a357ab2-7bb6-fce4-ffee-8bdd855a77fc",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3b9db9c8-6898-56b5-1b44-50a5b5f43d0f",Synchronized="2017-08-05 16:56:31.0")
/** Column name User2_ID */
public static final String COLUMNNAME_User2_ID = "User2_ID";
}
