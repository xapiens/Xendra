/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
 * Copyright (C)  dravios       All Rights Reserved.                          *
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
/** Generated Model for T_HojaDeTrabajoFuncTo5
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_T_HojaDeTrabajoFuncTo5 extends PO
{
/** Standard Constructor
@param ctx context
@param T_HojaDeTrabajoFuncTo5_ID id
@param trxName transaction
*/
public X_T_HojaDeTrabajoFuncTo5 (Properties ctx, int T_HojaDeTrabajoFuncTo5_ID, String trxName)
{
super (ctx, T_HojaDeTrabajoFuncTo5_ID, trxName);
/** if (T_HojaDeTrabajoFuncTo5_ID == 0)
{
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_T_HojaDeTrabajoFuncTo5 (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000011 */
public static int Table_ID=MTable.getTable_ID("T_HojaDeTrabajoFuncTo5");

@XendraTrl(Identifier="6027d02f-5116-e77c-883f-5eb83cda4ca5")
public static String es_PE_TABLE_T_HojaDeTrabajoFuncTo5_Name="Result of the checking balance";


@XendraTable(Name="Result of the checking balance",
AD_Package_ID="1b3656e5-71c7-1296-994e-9b2c4549c7fd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="T_HojaDeTrabajoFuncTo5",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="6027d02f-5116-e77c-883f-5eb83cda4ca5",Synchronized="2023-03-15 08:38:29.0")
/** TableName=T_HojaDeTrabajoFuncTo5 */
public static final String Table_Name="T_HojaDeTrabajoFuncTo5";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"T_HojaDeTrabajoFuncTo5");

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
    Table_ID = MTable.getTable_ID("T_HojaDeTrabajoFuncTo5");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_T_HojaDeTrabajoFuncTo5[").append(get_ID()).append("]");
return sb.toString();
}
/** Set accountlevel.
@param accountlevel accountlevel */
public void setaccountlevel (BigDecimal accountlevel)
{
set_Value (COLUMNNAME_accountlevel, accountlevel);
}
/** Get accountlevel.
@return accountlevel */
public BigDecimal getaccountlevel() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_accountlevel);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="9c914f05-2e34-8a9f-6d27-671a348dfe60")
public static String es_PE_COLUMN_accountlevel_Name="accountlevel";

@XendraColumn(AD_Element_ID="9a1d8306-84ba-bc0c-c619-9932843bae56",ColumnName="accountlevel",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9c914f05-2e34-8a9f-6d27-671a348dfe60",
Synchronized="2017-08-28 09:58:24.0")
/** Column name accountlevel */
public static final String COLUMNNAME_accountlevel = "accountlevel";
/** Set account_level.
@param account_level account_level */
public void setaccount_level (BigDecimal account_level)
{
set_Value (COLUMNNAME_account_level, account_level);
}
/** Get account_level.
@return account_level */
public BigDecimal getaccount_level() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_account_level);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="ea47cd0d-26a3-07bc-f4e9-0cf4e387f227")
public static String es_PE_COLUMN_account_level_Name="account_level";

@XendraColumn(AD_Element_ID="1cc07b61-927d-3d53-4a43-8af5ae2a4070",ColumnName="account_level",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ea47cd0d-26a3-07bc-f4e9-0cf4e387f227",
Synchronized="2017-08-28 09:58:24.0")
/** Column name account_level */
public static final String COLUMNNAME_account_level = "account_level";
/** Set AccountParent.
@param AccountParent AccountParent */
public void setAccountParent (int AccountParent)
{
set_Value (COLUMNNAME_AccountParent, Integer.valueOf(AccountParent));
}
/** Get AccountParent.
@return AccountParent */
public int getAccountParent() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AccountParent);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3b07b9a6-98ad-9132-7954-c3cb4e789de6")
public static String es_PE_COLUMN_AccountParent_Name="accountparent";

@XendraColumn(AD_Element_ID="345020f4-0cb5-e294-5e83-7a4c398d132a",ColumnName="AccountParent",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3b07b9a6-98ad-9132-7954-c3cb4e789de6",
Synchronized="2017-08-28 09:58:24.0")
/** Column name AccountParent */
public static final String COLUMNNAME_AccountParent = "AccountParent";
/** Set Account Key.
@param AccountValue Key of Account Element */
public void setAccountValue (String AccountValue)
{
if (AccountValue != null && AccountValue.length() > 40)
{
log.warning("Length > 40 - truncated");
AccountValue = AccountValue.substring(0,39);
}
set_Value (COLUMNNAME_AccountValue, AccountValue);
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
@XendraTrl(Identifier="4cb65961-3278-0e70-2b22-1c8b6b350630")
public static String es_PE_COLUMN_AccountValue_Name="Clave de Cuenta";

@XendraColumn(AD_Element_ID="8aef172c-9686-33af-fb2b-dfa839316024",ColumnName="AccountValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4cb65961-3278-0e70-2b22-1c8b6b350630",
Synchronized="2017-08-28 09:58:24.0")
/** Column name AccountValue */
public static final String COLUMNNAME_AccountValue = "AccountValue";
/** Set AcountLevel.
@param AcountLevel AcountLevel */
public void setAcountLevel (BigDecimal AcountLevel)
{
set_Value (COLUMNNAME_AcountLevel, AcountLevel);
}
/** Get AcountLevel.
@return AcountLevel */
public BigDecimal getAcountLevel() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AcountLevel);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="a9cba8ab-5a38-9586-1fe8-e1c681590793")
public static String es_PE_COLUMN_AcountLevel_Name="accountlevel";

@XendraColumn(AD_Element_ID="00022f59-1777-0ac3-f4f8-31c45c0303b2",ColumnName="AcountLevel",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a9cba8ab-5a38-9586-1fe8-e1c681590793",
Synchronized="2017-08-28 09:58:24.0")
/** Column name AcountLevel */
public static final String COLUMNNAME_AcountLevel = "AcountLevel";
/** Set Process Instance.
@param AD_PInstance_ID Instance of the process */
public void setAD_PInstance_ID (int AD_PInstance_ID)
{
if (AD_PInstance_ID <= 0) set_Value (COLUMNNAME_AD_PInstance_ID, null);
 else 
set_Value (COLUMNNAME_AD_PInstance_ID, Integer.valueOf(AD_PInstance_ID));
}
/** Get Process Instance.
@return Instance of the process */
public int getAD_PInstance_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PInstance_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7bd30eb4-0101-8f70-a0d9-5a0ac5c46943")
public static String es_PE_COLUMN_AD_PInstance_ID_Name="Instancia del Proceso";

@XendraColumn(AD_Element_ID="a293ee40-db79-24cc-fb47-781657ecb499",ColumnName="AD_PInstance_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7bd30eb4-0101-8f70-a0d9-5a0ac5c46943",
Synchronized="2017-08-28 09:58:24.0")
/** Column name AD_PInstance_ID */
public static final String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
/** Set Accounted Credit.
@param AmtAcctCr Accounted Credit Amount */
public void setAmtAcctCr (BigDecimal AmtAcctCr)
{
set_Value (COLUMNNAME_AmtAcctCr, AmtAcctCr);
}
/** Get Accounted Credit.
@return Accounted Credit Amount */
public BigDecimal getAmtAcctCr() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtAcctCr);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="8f0ddf47-54f2-0e99-ca0f-90b7e97a4aca")
public static String es_PE_COLUMN_AmtAcctCr_Name="Crédito Contabilizado";

@XendraColumn(AD_Element_ID="945e7d70-99b5-5eaf-31ef-c5f460f7626c",ColumnName="AmtAcctCr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8f0ddf47-54f2-0e99-ca0f-90b7e97a4aca",
Synchronized="2017-08-28 09:58:24.0")
/** Column name AmtAcctCr */
public static final String COLUMNNAME_AmtAcctCr = "AmtAcctCr";
/** Set Accounted Debit.
@param AmtAcctDr Accounted Debit Amount */
public void setAmtAcctDr (BigDecimal AmtAcctDr)
{
set_Value (COLUMNNAME_AmtAcctDr, AmtAcctDr);
}
/** Get Accounted Debit.
@return Accounted Debit Amount */
public BigDecimal getAmtAcctDr() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtAcctDr);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="54002af8-dcc8-d857-a822-10693496565d")
public static String es_PE_COLUMN_AmtAcctDr_Name="Débito Contabilizado";

@XendraColumn(AD_Element_ID="67410612-76a4-c113-8594-305f58926372",ColumnName="AmtAcctDr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="54002af8-dcc8-d857-a822-10693496565d",
Synchronized="2017-08-28 09:58:24.0")
/** Column name AmtAcctDr */
public static final String COLUMNNAME_AmtAcctDr = "AmtAcctDr";
/** Set Amount.
@param BalanceActivo Amount */
public void setBalanceActivo (BigDecimal BalanceActivo)
{
set_Value (COLUMNNAME_BalanceActivo, BalanceActivo);
}
/** Get Amount.
@return Amount */
public BigDecimal getBalanceActivo() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_BalanceActivo);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="0aab8450-d7e3-09eb-38f0-3a80e7b707f1")
public static String es_PE_COLUMN_BalanceActivo_Name="Total";

@XendraColumn(AD_Element_ID="42827f15-aceb-2f14-cc38-b4a7c6022136",ColumnName="BalanceActivo",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0aab8450-d7e3-09eb-38f0-3a80e7b707f1",
Synchronized="2017-08-28 09:58:24.0")
/** Column name BalanceActivo */
public static final String COLUMNNAME_BalanceActivo = "BalanceActivo";
/** Set Amount.
@param BalancePasivo Amount */
public void setBalancePasivo (BigDecimal BalancePasivo)
{
set_Value (COLUMNNAME_BalancePasivo, BalancePasivo);
}
/** Get Amount.
@return Amount */
public BigDecimal getBalancePasivo() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_BalancePasivo);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="8fb20b6a-d62c-bf2d-2e02-7c388f78676d")
public static String es_PE_COLUMN_BalancePasivo_Name="Total";

@XendraColumn(AD_Element_ID="42827f15-aceb-2f14-cc38-b4a7c6022136",ColumnName="BalancePasivo",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8fb20b6a-d62c-bf2d-2e02-7c388f78676d",
Synchronized="2017-08-28 09:58:25.0")
/** Column name BalancePasivo */
public static final String COLUMNNAME_BalancePasivo = "BalancePasivo";
/** Set Accounting Schema.
@param C_AcctSchema_ID Rules for accounting */
public void setC_AcctSchema_ID (int C_AcctSchema_ID)
{
if (C_AcctSchema_ID <= 0) set_Value (COLUMNNAME_C_AcctSchema_ID, null);
 else 
set_Value (COLUMNNAME_C_AcctSchema_ID, Integer.valueOf(C_AcctSchema_ID));
}
/** Get Accounting Schema.
@return Rules for accounting */
public int getC_AcctSchema_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_AcctSchema_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a61b5ec2-4f3d-b59f-4893-bc879a8b82f5")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a61b5ec2-4f3d-b59f-4893-bc879a8b82f5",
Synchronized="2017-08-28 09:58:25.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
/** Set Account Element.
@param C_ElementValue_ID Account Element */
public void setC_ElementValue_ID (int C_ElementValue_ID)
{
if (C_ElementValue_ID <= 0) set_Value (COLUMNNAME_C_ElementValue_ID, null);
 else 
set_Value (COLUMNNAME_C_ElementValue_ID, Integer.valueOf(C_ElementValue_ID));
}
/** Get Account Element.
@return Account Element */
public int getC_ElementValue_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ElementValue_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f2dfb474-519b-bfd2-0376-a9b544dc8072")
public static String es_PE_COLUMN_C_ElementValue_ID_Name="Valor del Elemento";

@XendraColumn(AD_Element_ID="5323d042-54f8-4ac3-d8b8-7146736d3d38",ColumnName="C_ElementValue_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f2dfb474-519b-bfd2-0376-a9b544dc8072",
Synchronized="2017-08-28 09:58:25.0")
/** Column name C_ElementValue_ID */
public static final String COLUMNNAME_C_ElementValue_ID = "C_ElementValue_ID";
/** Set Account Date.
@param DateAcct Accounting Date */
public void setDateAcct (Timestamp DateAcct)
{
set_Value (COLUMNNAME_DateAcct, DateAcct);
}
/** Get Account Date.
@return Accounting Date */
public Timestamp getDateAcct() 
{
return (Timestamp)get_Value(COLUMNNAME_DateAcct);
}

@XendraTrl(Identifier="681940b8-a057-6483-5250-207eebdc1c77")
public static String es_PE_COLUMN_DateAcct_Name="Fecha de Aplicación CG";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="681940b8-a057-6483-5250-207eebdc1c77",
Synchronized="2017-08-28 09:58:25.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";
/** Set Amount.
@param FuncionGanancia Amount */
public void setFuncionGanancia (BigDecimal FuncionGanancia)
{
set_Value (COLUMNNAME_FuncionGanancia, FuncionGanancia);
}
/** Get Amount.
@return Amount */
public BigDecimal getFuncionGanancia() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FuncionGanancia);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="48a2a5bc-afd2-3896-6f12-32b2b3dc29e4")
public static String es_PE_COLUMN_FuncionGanancia_Name="Total";

@XendraColumn(AD_Element_ID="42827f15-aceb-2f14-cc38-b4a7c6022136",ColumnName="FuncionGanancia",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="48a2a5bc-afd2-3896-6f12-32b2b3dc29e4",
Synchronized="2017-08-28 09:58:25.0")
/** Column name FuncionGanancia */
public static final String COLUMNNAME_FuncionGanancia = "FuncionGanancia";
/** Set Amount.
@param FuncionPerdida Amount */
public void setFuncionPerdida (BigDecimal FuncionPerdida)
{
set_Value (COLUMNNAME_FuncionPerdida, FuncionPerdida);
}
/** Get Amount.
@return Amount */
public BigDecimal getFuncionPerdida() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FuncionPerdida);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="a5e427b6-6bef-2d02-c7dc-d0999ad25b8c")
public static String es_PE_COLUMN_FuncionPerdida_Name="Total";

@XendraColumn(AD_Element_ID="42827f15-aceb-2f14-cc38-b4a7c6022136",ColumnName="FuncionPerdida",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a5e427b6-6bef-2d02-c7dc-d0999ad25b8c",
Synchronized="2017-08-28 09:58:25.0")
/** Column name FuncionPerdida */
public static final String COLUMNNAME_FuncionPerdida = "FuncionPerdida";
/** Set Is Only movement account.
@param IsOnlyMovementAccount Is Only movement account */
public void setIsOnlyMovementAccount (boolean IsOnlyMovementAccount)
{
set_Value (COLUMNNAME_IsOnlyMovementAccount, Boolean.valueOf(IsOnlyMovementAccount));
}
/** Get Is Only movement account.
@return Is Only movement account */
public boolean isOnlyMovementAccount() 
{
Object oo = get_Value(COLUMNNAME_IsOnlyMovementAccount);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="44084304-f916-0232-fa54-b6ce9779e700")
public static String es_PE_COLUMN_IsOnlyMovementAccount_Name="Is Only movement account";

@XendraColumn(AD_Element_ID="1c5874ee-1754-a310-012d-a2fb189988c4",
ColumnName="IsOnlyMovementAccount",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="44084304-f916-0232-fa54-b6ce9779e700",Synchronized="2017-08-28 09:58:25.0")
/** Column name IsOnlyMovementAccount */
public static final String COLUMNNAME_IsOnlyMovementAccount = "IsOnlyMovementAccount";
/** Set IsSubTotal.
@param IsSubTotal IsSubTotal */
public void setIsSubTotal (boolean IsSubTotal)
{
set_Value (COLUMNNAME_IsSubTotal, Boolean.valueOf(IsSubTotal));
}
/** Get IsSubTotal.
@return IsSubTotal */
public boolean isSubTotal() 
{
Object oo = get_Value(COLUMNNAME_IsSubTotal);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="aa58798f-dcfb-151a-e5f1-62c46ef60524")
public static String es_PE_COLUMN_IsSubTotal_Name="issubtotal";

@XendraColumn(AD_Element_ID="d6829b53-7fed-bde8-bf2c-61b5d1d2abc9",ColumnName="IsSubTotal",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aa58798f-dcfb-151a-e5f1-62c46ef60524",
Synchronized="2017-08-28 09:58:25.0")
/** Column name IsSubTotal */
public static final String COLUMNNAME_IsSubTotal = "IsSubTotal";
/** Set IsVisible.
@param IsVisible IsVisible */
public void setIsVisible (boolean IsVisible)
{
set_Value (COLUMNNAME_IsVisible, Boolean.valueOf(IsVisible));
}
/** Get IsVisible.
@return IsVisible */
public boolean isVisible() 
{
Object oo = get_Value(COLUMNNAME_IsVisible);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="23b8264b-06bd-381d-2ca9-cc9d73428fb9")
public static String es_PE_COLUMN_IsVisible_Name="isvisible";

@XendraColumn(AD_Element_ID="d5755b76-7c48-2932-e64a-ac8e7bfa27c9",ColumnName="IsVisible",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="23b8264b-06bd-381d-2ca9-cc9d73428fb9",
Synchronized="2017-08-28 09:58:25.0")
/** Column name IsVisible */
public static final String COLUMNNAME_IsVisible = "IsVisible";
/** Set Amount.
@param NaturalezaGanancia Amount */
public void setNaturalezaGanancia (BigDecimal NaturalezaGanancia)
{
set_Value (COLUMNNAME_NaturalezaGanancia, NaturalezaGanancia);
}
/** Get Amount.
@return Amount */
public BigDecimal getNaturalezaGanancia() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_NaturalezaGanancia);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="7d619c46-90b5-be81-efe7-6f2c5f505dea")
public static String es_PE_COLUMN_NaturalezaGanancia_Name="Total";

@XendraColumn(AD_Element_ID="42827f15-aceb-2f14-cc38-b4a7c6022136",ColumnName="NaturalezaGanancia",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7d619c46-90b5-be81-efe7-6f2c5f505dea",
Synchronized="2017-08-28 09:58:25.0")
/** Column name NaturalezaGanancia */
public static final String COLUMNNAME_NaturalezaGanancia = "NaturalezaGanancia";
/** Set Amount.
@param NaturalezaPerdida Amount */
public void setNaturalezaPerdida (BigDecimal NaturalezaPerdida)
{
set_Value (COLUMNNAME_NaturalezaPerdida, NaturalezaPerdida);
}
/** Get Amount.
@return Amount */
public BigDecimal getNaturalezaPerdida() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_NaturalezaPerdida);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="9b50065f-6530-5dd9-8a85-8e844d2226fe")
public static String es_PE_COLUMN_NaturalezaPerdida_Name="Total";

@XendraColumn(AD_Element_ID="42827f15-aceb-2f14-cc38-b4a7c6022136",ColumnName="NaturalezaPerdida",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9b50065f-6530-5dd9-8a85-8e844d2226fe",
Synchronized="2017-08-28 09:58:25.0")
/** Column name NaturalezaPerdida */
public static final String COLUMNNAME_NaturalezaPerdida = "NaturalezaPerdida";
/** Set PostingType.
@param PostingType The type of posted amount for the transaction */
public void setPostingType (String PostingType)
{
if (PostingType != null && PostingType.length() > 1)
{
log.warning("Length > 1 - truncated");
PostingType = PostingType.substring(0,0);
}
set_Value (COLUMNNAME_PostingType, PostingType);
}
/** Get PostingType.
@return The type of posted amount for the transaction */
public String getPostingType() 
{
return (String)get_Value(COLUMNNAME_PostingType);
}

@XendraTrl(Identifier="e2097b8d-829f-156e-425a-7d1ad4e50adb")
public static String es_PE_COLUMN_PostingType_Name="Tipo de Aplicación";

@XendraColumn(AD_Element_ID="465cd8dd-d2b8-aa76-fc18-7f8df439b182",ColumnName="PostingType",
AD_Reference_ID=17,AD_Reference_Value_ID="1ad48d23-2ec9-09d0-cb68-38688c5e6ce0",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e2097b8d-829f-156e-425a-7d1ad4e50adb",Synchronized="2017-08-28 09:58:25.0")
/** Column name PostingType */
public static final String COLUMNNAME_PostingType = "PostingType";
/** Set Amount.
@param SaldoAcreedor Amount */
public void setSaldoAcreedor (BigDecimal SaldoAcreedor)
{
set_Value (COLUMNNAME_SaldoAcreedor, SaldoAcreedor);
}
/** Get Amount.
@return Amount */
public BigDecimal getSaldoAcreedor() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_SaldoAcreedor);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="804f3458-6857-a7e8-831e-ce444d5185ee")
public static String es_PE_COLUMN_SaldoAcreedor_Name="Total";

@XendraColumn(AD_Element_ID="42827f15-aceb-2f14-cc38-b4a7c6022136",ColumnName="SaldoAcreedor",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="804f3458-6857-a7e8-831e-ce444d5185ee",
Synchronized="2017-08-28 09:58:25.0")
/** Column name SaldoAcreedor */
public static final String COLUMNNAME_SaldoAcreedor = "SaldoAcreedor";
/** Set Amount.
@param SaldoDeudor Amount */
public void setSaldoDeudor (BigDecimal SaldoDeudor)
{
set_Value (COLUMNNAME_SaldoDeudor, SaldoDeudor);
}
/** Get Amount.
@return Amount */
public BigDecimal getSaldoDeudor() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_SaldoDeudor);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="793b87a4-961b-0bd6-1b12-b34464800d58")
public static String es_PE_COLUMN_SaldoDeudor_Name="Total";

@XendraColumn(AD_Element_ID="42827f15-aceb-2f14-cc38-b4a7c6022136",ColumnName="SaldoDeudor",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="793b87a4-961b-0bd6-1b12-b34464800d58",
Synchronized="2017-08-28 09:58:25.0")
/** Column name SaldoDeudor */
public static final String COLUMNNAME_SaldoDeudor = "SaldoDeudor";
/** Set Value To.
@param Value2 Value To */
public void setValue2 (String Value2)
{
if (Value2 != null && Value2.length() > 40)
{
log.warning("Length > 40 - truncated");
Value2 = Value2.substring(0,39);
}
set_ValueNoCheck (COLUMNNAME_Value2, Value2);
}
/** Get Value To.
@return Value To */
public String getValue2() 
{
String value = (String)get_Value(COLUMNNAME_Value2);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="e3c53059-32a0-cf83-f70e-3afac8e84852")
public static String es_PE_COLUMN_Value2_Name="Valor 2";

@XendraColumn(AD_Element_ID="c379d4ac-5a2f-a060-da28-03c993b2743e",ColumnName="Value2",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e3c53059-32a0-cf83-f70e-3afac8e84852",
Synchronized="2017-08-28 09:58:25.0")
/** Column name Value2 */
public static final String COLUMNNAME_Value2 = "Value2";
}
