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
/** Generated Model for T_AcctOrg
 *  @author Adempiere (generated) 
 *  @version Release 1.20 - $Id: X_T_AcctOrg.java 523 2007-11-27 23:51:18Z el_man $ */
public class X_T_AcctOrg extends PO
{
/** Standard Constructor
@param ctx context
@param T_AcctOrg_ID id
@param trxName transaction
*/
public X_T_AcctOrg (Properties ctx, int T_AcctOrg_ID, String trxName)
{
super (ctx, T_AcctOrg_ID, trxName);
/** if (T_AcctOrg_ID == 0)
{
setissubtotal (false);
setisvisible (false);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_T_AcctOrg (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000019 */
public static final int Table_ID=MTable.getTable_ID("T_AcctOrg");

/** TableName=T_AcctOrg */
public static final String Table_Name="T_AcctOrg";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"T_AcctOrg");

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
StringBuffer sb = new StringBuffer ("X_T_AcctOrg[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Process Instance.
@param AD_PInstance_ID Instance of the process */
public void setAD_PInstance_ID (int AD_PInstance_ID)
{
if (AD_PInstance_ID <= 0) set_Value ("AD_PInstance_ID", null);
 else 
set_Value ("AD_PInstance_ID", Integer.valueOf(AD_PInstance_ID));
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
/** Set Account Key.
@param AccountValue Key of Account Element */
public void setAccountValue (String AccountValue)
{
if (AccountValue != null && AccountValue.length() > 40)
{
log.warning("Length > 40 - truncated");
AccountValue = AccountValue.substring(0,39);
}
set_Value ("AccountValue", AccountValue);
}
/** Get Account Key.
@return Key of Account Element */
public String getAccountValue() 
{
return (String)get_Value("AccountValue");
}
/** Column name AccountValue */
public static final String COLUMNNAME_AccountValue = "AccountValue";
/** Set Accounted Amount.
@param AmtAcct Amount Balance in Currency of Accounting Schema */
public void setAmtAcct (BigDecimal AmtAcct)
{
set_Value ("AmtAcct", AmtAcct);
}
/** Get Accounted Amount.
@return Amount Balance in Currency of Accounting Schema */
public BigDecimal getAmtAcct() 
{
BigDecimal bd = (BigDecimal)get_Value("AmtAcct");
if (bd == null) return Env.ZERO;
return bd;
}
/** Column name AmtAcct */
public static final String COLUMNNAME_AmtAcct = "AmtAcct";
/** Set Accounting Schema.
@param C_AcctSchema_ID Rules for accounting */
public void setC_AcctSchema_ID (int C_AcctSchema_ID)
{
if (C_AcctSchema_ID <= 0) set_Value ("C_AcctSchema_ID", null);
 else 
set_Value ("C_AcctSchema_ID", Integer.valueOf(C_AcctSchema_ID));
}
/** Get Accounting Schema.
@return Rules for accounting */
public int getC_AcctSchema_ID() 
{
Integer ii = (Integer)get_Value("C_AcctSchema_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
/** Set Account Element.
@param C_ElementValue_ID Account Element */
public void setC_ElementValue_ID (int C_ElementValue_ID)
{
if (C_ElementValue_ID <= 0) set_Value ("C_ElementValue_ID", null);
 else 
set_Value ("C_ElementValue_ID", Integer.valueOf(C_ElementValue_ID));
}
/** Get Account Element.
@return Account Element */
public int getC_ElementValue_ID() 
{
Integer ii = (Integer)get_Value("C_ElementValue_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_ElementValue_ID */
public static final String COLUMNNAME_C_ElementValue_ID = "C_ElementValue_ID";
/** Set Account Date.
@param DateAcct Accounting Date */
public void setDateAcct (Timestamp DateAcct)
{
set_Value ("DateAcct", DateAcct);
}
/** Get Account Date.
@return Accounting Date */
public Timestamp getDateAcct() 
{
return (Timestamp)get_Value("DateAcct");
}
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";
/** Set Is Only movement account.
@param IsOnlyMovementAccount Is Only movement account */
public void setIsOnlyMovementAccount (boolean IsOnlyMovementAccount)
{
set_Value ("IsOnlyMovementAccount", Boolean.valueOf(IsOnlyMovementAccount));
}
/** Get Is Only movement account.
@return Is Only movement account */
public boolean isOnlyMovementAccount() 
{
Object oo = get_Value("IsOnlyMovementAccount");
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}
/** Column name IsOnlyMovementAccount */
public static final String COLUMNNAME_IsOnlyMovementAccount = "IsOnlyMovementAccount";

/** PostingType AD_Reference_ID=125 */
public static final int POSTINGTYPE_AD_Reference_ID=125;
/** Actual = A */
public static final String POSTINGTYPE_Actual = "A";
/** Budget = B */
public static final String POSTINGTYPE_Budget = "B";
/** Commitment = E */
public static final String POSTINGTYPE_Commitment = "E";
/** Statistical = S */
public static final String POSTINGTYPE_Statistical = "S";
/** Reservation = R */
public static final String POSTINGTYPE_Reservation = "R";
/** Set PostingType.
@param PostingType The type of posted amount for the transaction */
public void setPostingType (String PostingType)
{
if (PostingType == null || PostingType.equals("A") || PostingType.equals("B") || PostingType.equals("E") || PostingType.equals("S") || PostingType.equals("R"));
 else throw new IllegalArgumentException ("PostingType Invalid value - " + PostingType + " - Reference_ID=125 - A - B - E - S - R");
if (PostingType != null && PostingType.length() > 1)
{
log.warning("Length > 1 - truncated");
PostingType = PostingType.substring(0,0);
}
set_Value ("PostingType", PostingType);
}
/** Get PostingType.
@return The type of posted amount for the transaction */
public String getPostingType() 
{
return (String)get_Value("PostingType");
}
/** Column name PostingType */
public static final String COLUMNNAME_PostingType = "PostingType";
/** Set Value To.
@param Value2 Value To */
public void setValue2 (String Value2)
{
if (Value2 != null && Value2.length() > 40)
{
log.warning("Length > 40 - truncated");
Value2 = Value2.substring(0,39);
}
set_Value ("Value2", Value2);
}
/** Get Value To.
@return Value To */
public String getValue2() 
{
return (String)get_Value("Value2");
}
/** Column name Value2 */
public static final String COLUMNNAME_Value2 = "Value2";
/** Set account_level.
@param account_level account_level */
public void setaccount_level (BigDecimal account_level)
{
set_Value ("account_level", account_level);
}
/** Get account_level.
@return account_level */
public BigDecimal getaccount_level() 
{
BigDecimal bd = (BigDecimal)get_Value("account_level");
if (bd == null) return Env.ZERO;
return bd;
}
/** Column name account_level */
public static final String COLUMNNAME_account_level = "account_level";
/** Set accountlevel.
@param accountlevel accountlevel */
public void setaccountlevel (BigDecimal accountlevel)
{
set_Value ("accountlevel", accountlevel);
}
/** Get accountlevel.
@return accountlevel */
public BigDecimal getaccountlevel() 
{
BigDecimal bd = (BigDecimal)get_Value("accountlevel");
if (bd == null) return Env.ZERO;
return bd;
}
/** Column name accountlevel */
public static final String COLUMNNAME_accountlevel = "accountlevel";
/** Set accountparent.
@param accountparent accountparent */
public void setaccountparent (int accountparent)
{
set_Value ("accountparent", Integer.valueOf(accountparent));
}
/** Get accountparent.
@return accountparent */
public int getaccountparent() 
{
Integer ii = (Integer)get_Value("accountparent");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name accountparent */
public static final String COLUMNNAME_accountparent = "accountparent";
/** Set issubtotal.
@param issubtotal issubtotal */
public void setissubtotal (boolean issubtotal)
{
set_Value ("issubtotal", Boolean.valueOf(issubtotal));
}
/** Get issubtotal.
@return issubtotal */
public boolean issubtotal() 
{
Object oo = get_Value("issubtotal");
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}
/** Column name issubtotal */
public static final String COLUMNNAME_issubtotal = "issubtotal";
/** Set isvisible.
@param isvisible isvisible */
public void setisvisible (boolean isvisible)
{
set_Value ("isvisible", Boolean.valueOf(isvisible));
}
/** Get isvisible.
@return isvisible */
public boolean isvisible() 
{
Object oo = get_Value("isvisible");
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}
/** Column name isvisible */
public static final String COLUMNNAME_isvisible = "isvisible";
}
