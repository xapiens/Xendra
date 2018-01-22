/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software;
 you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY;
 without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program;
 if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.compiere.model;

/** Generated Model - DO NOT CHANGE */
import java.util.*;
import java.sql.*;
import java.math.*;
import org.compiere.util.*;
/** Generated Model for T_BankAccountReconciliation
 *  @author Adempiere (generated) 
 *  @version Release 1.20 - $Id: X_T_BankAccountReconciliation.java 508 2007-11-24 23:06:53Z el_man $ */
public class X_T_BankAccountReconciliation extends PO
{
/** Standard Constructor
@param ctx context
@param T_BankAccountReconciliation_ID id
@param trxName transaction
*/
public X_T_BankAccountReconciliation (Properties ctx, int T_BankAccountReconciliation_ID, String trxName)
{
super (ctx, T_BankAccountReconciliation_ID, trxName);
/** if (T_BankAccountReconciliation_ID == 0)
{
setAD_PInstance_ID (0);
setC_BankStatement_ID (0);
setIsPending (false);
setIsPrevious (false);
setIsReconciled (true);	// Y
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_T_BankAccountReconciliation (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000039 */
public static final int Table_ID=MTable.getTable_ID("T_BankAccountReconciliation");

/** TableName=T_BankAccountReconciliation */
public static final String Table_Name="T_BankAccountReconciliation";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"T_BankAccountReconciliation");

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
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_T_BankAccountReconciliation[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Process Instance.
@param AD_PInstance_ID Instance of the process */
public void setAD_PInstance_ID (int AD_PInstance_ID)
{
if (AD_PInstance_ID < 1) throw new IllegalArgumentException ("AD_PInstance_ID is mandatory.");
set_ValueNoCheck ("AD_PInstance_ID", Integer.valueOf(AD_PInstance_ID));
}
/** Get Process Instance.
@return Instance of the process */
public int getAD_PInstance_ID() 
{
Integer ii = (Integer)get_Value("AD_PInstance_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_PInstance_ID */
public static final String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
/** Set Bank Statement.
@param C_BankStatement_ID Bank Statement of account */
public void setC_BankStatement_ID (int C_BankStatement_ID)
{
if (C_BankStatement_ID < 1) throw new IllegalArgumentException ("C_BankStatement_ID is mandatory.");
set_ValueNoCheck ("C_BankStatement_ID", Integer.valueOf(C_BankStatement_ID));
}
/** Get Bank Statement.
@return Bank Statement of account */
public int getC_BankStatement_ID() 
{
Integer ii = (Integer)get_Value("C_BankStatement_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_BankStatement_ID */
public static final String COLUMNNAME_C_BankStatement_ID = "C_BankStatement_ID";
/** Set Payment.
@param C_Payment_ID Payment identifier */
public void setC_Payment_ID (int C_Payment_ID)
{
if (C_Payment_ID <= 0) set_ValueNoCheck ("C_Payment_ID", null);
 else 
set_ValueNoCheck ("C_Payment_ID", Integer.valueOf(C_Payment_ID));
}
/** Get Payment.
@return Payment identifier */
public int getC_Payment_ID() 
{
Integer ii = (Integer)get_Value("C_Payment_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_Payment_ID */
public static final String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
/** Set Transaction Date.
@param DateTrx Transaction Date */
public void setDateTrx (Timestamp DateTrx)
{
set_ValueNoCheck ("DateTrx", DateTrx);
}
/** Get Transaction Date.
@return Transaction Date */
public Timestamp getDateTrx() 
{
return (Timestamp)get_Value("DateTrx");
}
/** Column name DateTrx */
public static final String COLUMNNAME_DateTrx = "DateTrx";
/** Set Is Pending.
@param IsPending Indicates if the payment has not been paid by the bank, as indicated by the bank statement. */
public void setIsPending (boolean IsPending)
{
set_ValueNoCheck ("IsPending", Boolean.valueOf(IsPending));
}
/** Get Is Pending.
@return Indicates if the payment has not been paid by the bank, as indicated by the bank statement. */
public boolean isPending() 
{
Object oo = get_Value("IsPending");
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}
/** Column name IsPending */
public static final String COLUMNNAME_IsPending = "IsPending";
/** Set Is Previous.
@param IsPrevious Is Previous */
public void setIsPrevious (boolean IsPrevious)
{
set_ValueNoCheck ("IsPrevious", Boolean.valueOf(IsPrevious));
}
/** Get Is Previous.
@return Is Previous */
public boolean isPrevious() 
{
Object oo = get_Value("IsPrevious");
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}
/** Column name IsPrevious */
public static final String COLUMNNAME_IsPrevious = "IsPrevious";
/** Set Reconciled.
@param IsReconciled Payment is reconciled with bank statement */
public void setIsReconciled (boolean IsReconciled)
{
set_ValueNoCheck ("IsReconciled", Boolean.valueOf(IsReconciled));
}
/** Get Reconciled.
@return Payment is reconciled with bank statement */
public boolean isReconciled() 
{
Object oo = get_Value("IsReconciled");
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}
/** Column name IsReconciled */
public static final String COLUMNNAME_IsReconciled = "IsReconciled";
/** Set Payment amount.
@param PayAmt Amount being paid */
public void setPayAmt (BigDecimal PayAmt)
{
set_ValueNoCheck ("PayAmt", PayAmt);
}
/** Get Payment amount.
@return Amount being paid */
public BigDecimal getPayAmt() 
{
BigDecimal bd = (BigDecimal)get_Value("PayAmt");
if (bd == null) return Env.ZERO;
return bd;
}
/** Column name PayAmt */
public static final String COLUMNNAME_PayAmt = "PayAmt";
}
