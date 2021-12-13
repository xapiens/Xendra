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
/** Generated Model for t_bankaccountreconciliation
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_t_bankaccountreconciliation extends PO
{
/** Standard Constructor
@param ctx context
@param t_bankaccountreconciliation_ID id
@param trxName transaction
*/
public X_t_bankaccountreconciliation (Properties ctx, int t_bankaccountreconciliation_ID, String trxName)
{
super (ctx, t_bankaccountreconciliation_ID, trxName);
/** if (t_bankaccountreconciliation_ID == 0)
{
setAD_PInstance_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_t_bankaccountreconciliation (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000239 */
public static int Table_ID=MTable.getTable_ID("t_bankaccountreconciliation");

@XendraTrl(Identifier="af9d900a-a0fe-223c-3533-fab9a8c92f1f")
public static String es_PE_TABLE_t_bankaccountreconciliation_Name="t_bankaccountreconciliation";


@XendraTable(Name="t_bankaccountreconciliation",
AD_Package_ID="1b3656e5-71c7-1296-994e-9b2c4549c7fd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="t_bankaccountreconciliation",AccessLevel="4",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=false,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="af9d900a-a0fe-223c-3533-fab9a8c92f1f",Synchronized="2020-03-03 21:40:20.0")
/** TableName=t_bankaccountreconciliation */
public static final String Table_Name="t_bankaccountreconciliation";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"t_bankaccountreconciliation");

protected BigDecimal accessLevel = BigDecimal.valueOf(4);
/** AccessLevel
@return 4 - System 
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
    Table_ID = MTable.getTable_ID("t_bankaccountreconciliation");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_t_bankaccountreconciliation[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Process Instance.
@param AD_PInstance_ID Instance of the process */
public void setAD_PInstance_ID (int AD_PInstance_ID)
{
if (AD_PInstance_ID < 1) throw new IllegalArgumentException ("AD_PInstance_ID is mandatory.");
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

@XendraTrl(Identifier="2466927c-8397-6004-5051-8e181146bd0e")
public static String es_PE_COLUMN_AD_PInstance_ID_Name="Process Instance";

@XendraColumn(AD_Element_ID="a293ee40-db79-24cc-fb47-781657ecb499",ColumnName="AD_PInstance_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2466927c-8397-6004-5051-8e181146bd0e",
Synchronized="2019-08-30 22:24:21.0")
/** Column name AD_PInstance_ID */
public static final String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
/** Set Bank Statement.
@param C_BankStatement_ID Bank Statement of account */
public void setC_BankStatement_ID (int C_BankStatement_ID)
{
if (C_BankStatement_ID <= 0) set_Value (COLUMNNAME_C_BankStatement_ID, null);
 else 
set_Value (COLUMNNAME_C_BankStatement_ID, Integer.valueOf(C_BankStatement_ID));
}
/** Get Bank Statement.
@return Bank Statement of account */
public int getC_BankStatement_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BankStatement_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4daa98b3-1e48-6023-4a12-ad8d71751d05")
public static String es_PE_COLUMN_C_BankStatement_ID_Name="Bank Statement";

@XendraColumn(AD_Element_ID="8105d871-aa63-d678-57d6-1450c5b5d3d4",ColumnName="C_BankStatement_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4daa98b3-1e48-6023-4a12-ad8d71751d05",
Synchronized="2019-08-30 22:24:21.0")
/** Column name C_BankStatement_ID */
public static final String COLUMNNAME_C_BankStatement_ID = "C_BankStatement_ID";
/** Set Payment.
@param C_Payment_ID Payment identifier */
public void setC_Payment_ID (int C_Payment_ID)
{
if (C_Payment_ID <= 0) set_Value (COLUMNNAME_C_Payment_ID, null);
 else 
set_Value (COLUMNNAME_C_Payment_ID, Integer.valueOf(C_Payment_ID));
}
/** Get Payment.
@return Payment identifier */
public int getC_Payment_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Payment_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7557d070-335b-f604-d529-2e0beee22c5a")
public static String es_PE_COLUMN_C_Payment_ID_Name="Payment";

@XendraColumn(AD_Element_ID="3ded5658-968e-94c5-207b-eed6f6a7bb43",ColumnName="C_Payment_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7557d070-335b-f604-d529-2e0beee22c5a",
Synchronized="2019-08-30 22:24:21.0")
/** Column name C_Payment_ID */
public static final String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
/** Set Transaction Date.
@param DateTrx Transaction Date */
public void setDateTrx (Timestamp DateTrx)
{
set_Value (COLUMNNAME_DateTrx, DateTrx);
}
/** Get Transaction Date.
@return Transaction Date */
public Timestamp getDateTrx() 
{
return (Timestamp)get_Value(COLUMNNAME_DateTrx);
}

@XendraTrl(Identifier="edab637e-63dc-7df0-9f1d-5cd09ff467d6")
public static String es_PE_COLUMN_DateTrx_Name="Transaction Date";

@XendraColumn(AD_Element_ID="3700288f-61dd-2021-b833-cf804ceed1e9",ColumnName="DateTrx",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="edab637e-63dc-7df0-9f1d-5cd09ff467d6",
Synchronized="2019-08-30 22:24:21.0")
/** Column name DateTrx */
public static final String COLUMNNAME_DateTrx = "DateTrx";
/** Set Is Pending.
@param IsPending Indicates if the payment has not been paid by the bank, as indicated by the bank statement. */
public void setIsPending (boolean IsPending)
{
set_Value (COLUMNNAME_IsPending, Boolean.valueOf(IsPending));
}
/** Get Is Pending.
@return Indicates if the payment has not been paid by the bank, as indicated by the bank statement. */
public boolean isPending() 
{
Object oo = get_Value(COLUMNNAME_IsPending);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="38ff8738-6f70-b5c0-3308-e67f670fa6d7")
public static String es_PE_COLUMN_IsPending_Name="Is Pending";

@XendraColumn(AD_Element_ID="b2466c07-fd3d-4808-a657-12a0a7de7070",ColumnName="IsPending",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="38ff8738-6f70-b5c0-3308-e67f670fa6d7",
Synchronized="2019-08-30 22:24:21.0")
/** Column name IsPending */
public static final String COLUMNNAME_IsPending = "IsPending";
/** Set Is Previous.
@param IsPrevious Is Previous */
public void setIsPrevious (boolean IsPrevious)
{
set_Value (COLUMNNAME_IsPrevious, Boolean.valueOf(IsPrevious));
}
/** Get Is Previous.
@return Is Previous */
public boolean isPrevious() 
{
Object oo = get_Value(COLUMNNAME_IsPrevious);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="ca382a1a-d315-02d3-b6e4-1ebf17f41821")
public static String es_PE_COLUMN_IsPrevious_Name="Is Previous";

@XendraColumn(AD_Element_ID="c5634e4a-f62b-35ff-8a2d-5b0c2b75a79f",ColumnName="IsPrevious",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ca382a1a-d315-02d3-b6e4-1ebf17f41821",
Synchronized="2019-08-30 22:24:21.0")
/** Column name IsPrevious */
public static final String COLUMNNAME_IsPrevious = "IsPrevious";
/** Set Reconciled.
@param IsReconciled Payment is reconciled with bank statement */
public void setIsReconciled (boolean IsReconciled)
{
set_Value (COLUMNNAME_IsReconciled, Boolean.valueOf(IsReconciled));
}
/** Get Reconciled.
@return Payment is reconciled with bank statement */
public boolean isReconciled() 
{
Object oo = get_Value(COLUMNNAME_IsReconciled);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="ae0e1f12-aa0d-2670-fbfc-2266ab0d7a5e")
public static String es_PE_COLUMN_IsReconciled_Name="Reconciled";

@XendraColumn(AD_Element_ID="86d77140-27dd-ed64-2c3f-5dd26190df54",ColumnName="IsReconciled",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ae0e1f12-aa0d-2670-fbfc-2266ab0d7a5e",
Synchronized="2019-08-30 22:24:21.0")
/** Column name IsReconciled */
public static final String COLUMNNAME_IsReconciled = "IsReconciled";
/** Set Payment amount.
@param PayAmt Amount being paid */
public void setPayAmt (BigDecimal PayAmt)
{
set_Value (COLUMNNAME_PayAmt, PayAmt);
}
/** Get Payment amount.
@return Amount being paid */
public BigDecimal getPayAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PayAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="deb27ea3-4bd6-9bbb-4515-f99a80f44256")
public static String es_PE_COLUMN_PayAmt_Name="Payment amount";

@XendraColumn(AD_Element_ID="9e9a0ba1-2d71-67e7-e0f1-0309fd537c8b",ColumnName="PayAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="deb27ea3-4bd6-9bbb-4515-f99a80f44256",
Synchronized="2019-08-30 22:24:21.0")
/** Column name PayAmt */
public static final String COLUMNNAME_PayAmt = "PayAmt";
}
