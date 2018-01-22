/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
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
/** Generated Model for T_TrialBalance
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: X_T_TrialBalance.java 1767 2010-10-07 18:29:12Z xapiens $ */
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
setAmtAcctCr (Env.ZERO);
setAmtAcctDr (Env.ZERO);
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
public static final int Table_ID=MTable.getTable_ID("T_TrialBalance");

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
if (A_Asset_ID <= 0) set_ValueNoCheck ("A_Asset_ID", null);
 else 
set_ValueNoCheck ("A_Asset_ID", Integer.valueOf(A_Asset_ID));
}
/** Get Asset.
@return Asset used internally or by customers */
public int getA_Asset_ID() 
{
Integer ii = (Integer)get_Value("A_Asset_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name A_Asset_ID */
public static final String COLUMNNAME_A_Asset_ID = "A_Asset_ID";

/** Account_ID AD_Reference_ID=132 */
public static final int ACCOUNT_ID_AD_Reference_ID=132;
/** Set Account.
@param Account_ID Account used */
public void setAccount_ID (int Account_ID)
{
if (Account_ID <= 0) set_ValueNoCheck ("Account_ID", null);
 else 
set_ValueNoCheck ("Account_ID", Integer.valueOf(Account_ID));
}
/** Get Account.
@return Account used */
public int getAccount_ID() 
{
Integer ii = (Integer)get_Value("Account_ID");
if (ii == null) return 0;
return ii.intValue();
}
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
set_ValueNoCheck ("AccountValue", AccountValue);
}
/** Get Account Key.
@return Key of Account Element */
public String getAccountValue() 
{
return (String)get_Value("AccountValue");
}
/** Column name AccountValue */
public static final String COLUMNNAME_AccountValue = "AccountValue";

/** AD_OrgTrx_ID AD_Reference_ID=130 */
public static final int AD_ORGTRX_ID_AD_Reference_ID=130;
/** Set Trx Organization.
@param AD_OrgTrx_ID Performing or initiating organization */
public void setAD_OrgTrx_ID (int AD_OrgTrx_ID)
{
if (AD_OrgTrx_ID <= 0) set_ValueNoCheck ("AD_OrgTrx_ID", null);
 else 
set_ValueNoCheck ("AD_OrgTrx_ID", Integer.valueOf(AD_OrgTrx_ID));
}
/** Get Trx Organization.
@return Performing or initiating organization */
public int getAD_OrgTrx_ID() 
{
Integer ii = (Integer)get_Value("AD_OrgTrx_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_OrgTrx_ID */
public static final String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
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
/** Set Table.
@param AD_Table_ID Database Table information */
public void setAD_Table_ID (int AD_Table_ID)
{
if (AD_Table_ID <= 0) set_ValueNoCheck ("AD_Table_ID", null);
 else 
set_ValueNoCheck ("AD_Table_ID", Integer.valueOf(AD_Table_ID));
}
/** Get Table.
@return Database Table information */
public int getAD_Table_ID() 
{
Integer ii = (Integer)get_Value("AD_Table_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
/** Set Accounted Balance.
@param AmtAcctBalance Accounted Balance Amount */
public void setAmtAcctBalance (BigDecimal AmtAcctBalance)
{
if (AmtAcctBalance == null) throw new IllegalArgumentException ("AmtAcctBalance is mandatory.");
set_ValueNoCheck ("AmtAcctBalance", AmtAcctBalance);
}
/** Get Accounted Balance.
@return Accounted Balance Amount */
public BigDecimal getAmtAcctBalance() 
{
BigDecimal bd = (BigDecimal)get_Value("AmtAcctBalance");
if (bd == null) return Env.ZERO;
return bd;
}
/** Column name AmtAcctBalance */
public static final String COLUMNNAME_AmtAcctBalance = "AmtAcctBalance";
/** Set Accounted Credit.
@param AmtAcctCr Accounted Credit Amount */
public void setAmtAcctCr (BigDecimal AmtAcctCr)
{
if (AmtAcctCr == null) throw new IllegalArgumentException ("AmtAcctCr is mandatory.");
set_ValueNoCheck ("AmtAcctCr", AmtAcctCr);
}
/** Get Accounted Credit.
@return Accounted Credit Amount */
public BigDecimal getAmtAcctCr() 
{
BigDecimal bd = (BigDecimal)get_Value("AmtAcctCr");
if (bd == null) return Env.ZERO;
return bd;
}
/** Column name AmtAcctCr */
public static final String COLUMNNAME_AmtAcctCr = "AmtAcctCr";
/** Set Accounted Debit.
@param AmtAcctDr Accounted Debit Amount */
public void setAmtAcctDr (BigDecimal AmtAcctDr)
{
if (AmtAcctDr == null) throw new IllegalArgumentException ("AmtAcctDr is mandatory.");
set_ValueNoCheck ("AmtAcctDr", AmtAcctDr);
}
/** Get Accounted Debit.
@return Accounted Debit Amount */
public BigDecimal getAmtAcctDr() 
{
BigDecimal bd = (BigDecimal)get_Value("AmtAcctDr");
if (bd == null) return Env.ZERO;
return bd;
}
/** Column name AmtAcctDr */
public static final String COLUMNNAME_AmtAcctDr = "AmtAcctDr";
/** Set Source Balance.
@param AmtSourceBalance Source Balance Amount */
public void setAmtSourceBalance (BigDecimal AmtSourceBalance)
{
set_ValueNoCheck ("AmtSourceBalance", AmtSourceBalance);
}
/** Get Source Balance.
@return Source Balance Amount */
public BigDecimal getAmtSourceBalance() 
{
BigDecimal bd = (BigDecimal)get_Value("AmtSourceBalance");
if (bd == null) return Env.ZERO;
return bd;
}
/** Column name AmtSourceBalance */
public static final String COLUMNNAME_AmtSourceBalance = "AmtSourceBalance";
/** Set Source Credit.
@param AmtSourceCr Source Credit Amount */
public void setAmtSourceCr (BigDecimal AmtSourceCr)
{
set_ValueNoCheck ("AmtSourceCr", AmtSourceCr);
}
/** Get Source Credit.
@return Source Credit Amount */
public BigDecimal getAmtSourceCr() 
{
BigDecimal bd = (BigDecimal)get_Value("AmtSourceCr");
if (bd == null) return Env.ZERO;
return bd;
}
/** Column name AmtSourceCr */
public static final String COLUMNNAME_AmtSourceCr = "AmtSourceCr";
/** Set Source Debit.
@param AmtSourceDr Source Debit Amount */
public void setAmtSourceDr (BigDecimal AmtSourceDr)
{
set_ValueNoCheck ("AmtSourceDr", AmtSourceDr);
}
/** Get Source Debit.
@return Source Debit Amount */
public BigDecimal getAmtSourceDr() 
{
BigDecimal bd = (BigDecimal)get_Value("AmtSourceDr");
if (bd == null) return Env.ZERO;
return bd;
}
/** Column name AmtSourceDr */
public static final String COLUMNNAME_AmtSourceDr = "AmtSourceDr";
/** Set Accounting Schema.
@param C_AcctSchema_ID Rules for accounting */
public void setC_AcctSchema_ID (int C_AcctSchema_ID)
{
if (C_AcctSchema_ID < 1) throw new IllegalArgumentException ("C_AcctSchema_ID is mandatory.");
set_ValueNoCheck ("C_AcctSchema_ID", Integer.valueOf(C_AcctSchema_ID));
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
/** Set Activity.
@param C_Activity_ID Business Activity */
public void setC_Activity_ID (int C_Activity_ID)
{
if (C_Activity_ID <= 0) set_ValueNoCheck ("C_Activity_ID", null);
 else 
set_ValueNoCheck ("C_Activity_ID", Integer.valueOf(C_Activity_ID));
}
/** Get Activity.
@return Business Activity */
public int getC_Activity_ID() 
{
Integer ii = (Integer)get_Value("C_Activity_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_Activity_ID */
public static final String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID <= 0) set_ValueNoCheck ("C_BPartner_ID", null);
 else 
set_ValueNoCheck ("C_BPartner_ID", Integer.valueOf(C_BPartner_ID));
}
/** Get Business Partner .
@return Identifies a Business Partner */
public int getC_BPartner_ID() 
{
Integer ii = (Integer)get_Value("C_BPartner_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Campaign.
@param C_Campaign_ID Marketing Campaign */
public void setC_Campaign_ID (int C_Campaign_ID)
{
if (C_Campaign_ID <= 0) set_ValueNoCheck ("C_Campaign_ID", null);
 else 
set_ValueNoCheck ("C_Campaign_ID", Integer.valueOf(C_Campaign_ID));
}
/** Get Campaign.
@return Marketing Campaign */
public int getC_Campaign_ID() 
{
Integer ii = (Integer)get_Value("C_Campaign_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_Campaign_ID */
public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID <= 0) set_ValueNoCheck ("C_Currency_ID", null);
 else 
set_ValueNoCheck ("C_Currency_ID", Integer.valueOf(C_Currency_ID));
}
/** Get Currency.
@return The Currency for this record */
public int getC_Currency_ID() 
{
Integer ii = (Integer)get_Value("C_Currency_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";

/** C_LocFrom_ID AD_Reference_ID=133 */
public static final int C_LOCFROM_ID_AD_Reference_ID=133;
/** Set Location From.
@param C_LocFrom_ID Location that inventory was moved from */
public void setC_LocFrom_ID (int C_LocFrom_ID)
{
if (C_LocFrom_ID <= 0) set_ValueNoCheck ("C_LocFrom_ID", null);
 else 
set_ValueNoCheck ("C_LocFrom_ID", Integer.valueOf(C_LocFrom_ID));
}
/** Get Location From.
@return Location that inventory was moved from */
public int getC_LocFrom_ID() 
{
Integer ii = (Integer)get_Value("C_LocFrom_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_LocFrom_ID */
public static final String COLUMNNAME_C_LocFrom_ID = "C_LocFrom_ID";

/** C_LocTo_ID AD_Reference_ID=133 */
public static final int C_LOCTO_ID_AD_Reference_ID=133;
/** Set Location To.
@param C_LocTo_ID Location that inventory was moved to */
public void setC_LocTo_ID (int C_LocTo_ID)
{
if (C_LocTo_ID <= 0) set_ValueNoCheck ("C_LocTo_ID", null);
 else 
set_ValueNoCheck ("C_LocTo_ID", Integer.valueOf(C_LocTo_ID));
}
/** Get Location To.
@return Location that inventory was moved to */
public int getC_LocTo_ID() 
{
Integer ii = (Integer)get_Value("C_LocTo_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_LocTo_ID */
public static final String COLUMNNAME_C_LocTo_ID = "C_LocTo_ID";
/** Set Period.
@param C_Period_ID Period of the Calendar */
public void setC_Period_ID (int C_Period_ID)
{
if (C_Period_ID <= 0) set_ValueNoCheck ("C_Period_ID", null);
 else 
set_ValueNoCheck ("C_Period_ID", Integer.valueOf(C_Period_ID));
}
/** Get Period.
@return Period of the Calendar */
public int getC_Period_ID() 
{
Integer ii = (Integer)get_Value("C_Period_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_Period_ID */
public static final String COLUMNNAME_C_Period_ID = "C_Period_ID";
/** Set Project.
@param C_Project_ID Financial Project */
public void setC_Project_ID (int C_Project_ID)
{
if (C_Project_ID <= 0) set_ValueNoCheck ("C_Project_ID", null);
 else 
set_ValueNoCheck ("C_Project_ID", Integer.valueOf(C_Project_ID));
}
/** Get Project.
@return Financial Project */
public int getC_Project_ID() 
{
Integer ii = (Integer)get_Value("C_Project_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
/** Set Sales Region.
@param C_SalesRegion_ID Sales coverage region */
public void setC_SalesRegion_ID (int C_SalesRegion_ID)
{
if (C_SalesRegion_ID <= 0) set_ValueNoCheck ("C_SalesRegion_ID", null);
 else 
set_ValueNoCheck ("C_SalesRegion_ID", Integer.valueOf(C_SalesRegion_ID));
}
/** Get Sales Region.
@return Sales coverage region */
public int getC_SalesRegion_ID() 
{
Integer ii = (Integer)get_Value("C_SalesRegion_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_SalesRegion_ID */
public static final String COLUMNNAME_C_SalesRegion_ID = "C_SalesRegion_ID";
/** Set Tax.
@param C_Tax_ID Tax identifier */
public void setC_Tax_ID (int C_Tax_ID)
{
if (C_Tax_ID <= 0) set_ValueNoCheck ("C_Tax_ID", null);
 else 
set_ValueNoCheck ("C_Tax_ID", Integer.valueOf(C_Tax_ID));
}
/** Get Tax.
@return Tax identifier */
public int getC_Tax_ID() 
{
Integer ii = (Integer)get_Value("C_Tax_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_Tax_ID */
public static final String COLUMNNAME_C_Tax_ID = "C_Tax_ID";
/** Set UOM.
@param C_UOM_ID Unit of Measure */
public void setC_UOM_ID (int C_UOM_ID)
{
if (C_UOM_ID <= 0) set_ValueNoCheck ("C_UOM_ID", null);
 else 
set_ValueNoCheck ("C_UOM_ID", Integer.valueOf(C_UOM_ID));
}
/** Get UOM.
@return Unit of Measure */
public int getC_UOM_ID() 
{
Integer ii = (Integer)get_Value("C_UOM_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_UOM_ID */
public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
/** Set Account Date.
@param DateAcct Accounting Date */
public void setDateAcct (Timestamp DateAcct)
{
if (DateAcct == null) throw new IllegalArgumentException ("DateAcct is mandatory.");
set_ValueNoCheck ("DateAcct", DateAcct);
}
/** Get Account Date.
@return Accounting Date */
public Timestamp getDateAcct() 
{
return (Timestamp)get_Value("DateAcct");
}
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";
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
/** Set Description.
@param Description Optional short DESCRIPTION of the record */
public void setDescription (String Description)
{
if (Description != null && Description.length() > 255)
{
log.warning("Length > 255 - truncated");
Description = Description.substring(0,254);
}
set_ValueNoCheck ("Description", Description);
}
/** Get Description.
@return Optional short DESCRIPTION of the record */
public String getDescription() 
{
return (String)get_Value("Description");
}
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Accounting Fact.
@param Fact_Acct_ID Accounting Fact */
public void setFact_Acct_ID (int Fact_Acct_ID)
{
if (Fact_Acct_ID < 1) throw new IllegalArgumentException ("Fact_Acct_ID is mandatory.");
set_ValueNoCheck ("Fact_Acct_ID", Integer.valueOf(Fact_Acct_ID));
}
/** Get Accounting Fact.
@return Accounting Fact */
public int getFact_Acct_ID() 
{
Integer ii = (Integer)get_Value("Fact_Acct_ID");
if (ii == null) return 0;
return ii.intValue();
}
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
set_ValueNoCheck ("Fact_ID", Fact_ID);
}
/** Get Accounting Fact ID (per document).
@return This ID is guaranteed to be unique per client per year per document (in the fact table). */
public String getFact_ID() 
{
return (String)get_Value("Fact_ID");
}
/** Column name Fact_ID */
public static final String COLUMNNAME_Fact_ID = "Fact_ID";
/** Set Budget.
@param GL_Budget_ID General Ledger Budget */
public void setGL_Budget_ID (int GL_Budget_ID)
{
if (GL_Budget_ID <= 0) set_ValueNoCheck ("GL_Budget_ID", null);
 else 
set_ValueNoCheck ("GL_Budget_ID", Integer.valueOf(GL_Budget_ID));
}
/** Get Budget.
@return General Ledger Budget */
public int getGL_Budget_ID() 
{
Integer ii = (Integer)get_Value("GL_Budget_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name GL_Budget_ID */
public static final String COLUMNNAME_GL_Budget_ID = "GL_Budget_ID";
/** Set GL Category.
@param GL_Category_ID General Ledger Category */
public void setGL_Category_ID (int GL_Category_ID)
{
if (GL_Category_ID <= 0) set_ValueNoCheck ("GL_Category_ID", null);
 else 
set_ValueNoCheck ("GL_Category_ID", Integer.valueOf(GL_Category_ID));
}
/** Get GL Category.
@return General Ledger Category */
public int getGL_Category_ID() 
{
Integer ii = (Integer)get_Value("GL_Category_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name GL_Category_ID */
public static final String COLUMNNAME_GL_Category_ID = "GL_Category_ID";
/** Set Line ID.
@param Line_ID Transaction line ID (internal) */
public void setLine_ID (int Line_ID)
{
if (Line_ID <= 0) set_ValueNoCheck ("Line_ID", null);
 else 
set_ValueNoCheck ("Line_ID", Integer.valueOf(Line_ID));
}
/** Get Line ID.
@return Transaction line ID (internal) */
public int getLine_ID() 
{
Integer ii = (Integer)get_Value("Line_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name Line_ID */
public static final String COLUMNNAME_Line_ID = "Line_ID";
/** Set Locator.
@param M_Locator_ID Warehouse Locator */
public void setM_Locator_ID (int M_Locator_ID)
{
if (M_Locator_ID <= 0) set_ValueNoCheck ("M_Locator_ID", null);
 else 
set_ValueNoCheck ("M_Locator_ID", Integer.valueOf(M_Locator_ID));
}
/** Get Locator.
@return Warehouse Locator */
public int getM_Locator_ID() 
{
Integer ii = (Integer)get_Value("M_Locator_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name M_Locator_ID */
public static final String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID <= 0) set_ValueNoCheck ("M_Product_ID", null);
 else 
set_ValueNoCheck ("M_Product_ID", Integer.valueOf(M_Product_ID));
}
/** Get Product.
@return Product, Service, Item */
public int getM_Product_ID() 
{
Integer ii = (Integer)get_Value("M_Product_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Open Amount.
@param OpenAmt Open item amount */
public void setOpenAmt (BigDecimal OpenAmt)
{
set_ValueNoCheck ("OpenAmt", OpenAmt);
}
/** Get Open Amount.
@return Open item amount */
public BigDecimal getOpenAmt() 
{
BigDecimal bd = (BigDecimal)get_Value("OpenAmt");
if (bd == null) return Env.ZERO;
return bd;
}
/** Column name OpenAmt */
public static final String COLUMNNAME_OpenAmt = "OpenAmt";
/** Set Open Source Open.
@param OpenSourceAmt Open Source Open */
public void setOpenSourceAmt (BigDecimal OpenSourceAmt)
{
set_ValueNoCheck ("OpenSourceAmt", OpenSourceAmt);
}
/** Get Open Source Open.
@return Open Source Open */
public BigDecimal getOpenSourceAmt() 
{
BigDecimal bd = (BigDecimal)get_Value("OpenSourceAmt");
if (bd == null) return Env.ZERO;
return bd;
}
/** Column name OpenSourceAmt */
public static final String COLUMNNAME_OpenSourceAmt = "OpenSourceAmt";

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
if (PostingType == null) throw new IllegalArgumentException ("PostingType is mandatory");
if (PostingType.equals("A") || PostingType.equals("B") || PostingType.equals("E") || PostingType.equals("S") || PostingType.equals("R"));
 else throw new IllegalArgumentException ("PostingType Invalid value - " + PostingType + " - Reference_ID=125 - A - B - E - S - R");
if (PostingType.length() > 1)
{
log.warning("Length > 1 - truncated");
PostingType = PostingType.substring(0,0);
}
set_ValueNoCheck ("PostingType", PostingType);
}
/** Get PostingType.
@return The type of posted amount for the transaction */
public String getPostingType() 
{
return (String)get_Value("PostingType");
}
/** Column name PostingType */
public static final String COLUMNNAME_PostingType = "PostingType";
/** Set Quantity.
@param Qty Quantity */
public void setQty (BigDecimal Qty)
{
set_ValueNoCheck ("Qty", Qty);
}
/** Get Quantity.
@return Quantity */
public BigDecimal getQty() 
{
BigDecimal bd = (BigDecimal)get_Value("Qty");
if (bd == null) return Env.ZERO;
return bd;
}
/** Column name Qty */
public static final String COLUMNNAME_Qty = "Qty";
/** Set Record ID.
@param Record_ID Direct internal record ID */
public void setRecord_ID (int Record_ID)
{
if (Record_ID <= 0) set_ValueNoCheck ("Record_ID", null);
 else 
set_ValueNoCheck ("Record_ID", Integer.valueOf(Record_ID));
}
/** Get Record ID.
@return Direct internal record ID */
public int getRecord_ID() 
{
Integer ii = (Integer)get_Value("Record_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name Record_ID */
public static final String COLUMNNAME_Record_ID = "Record_ID";

/** User1_ID AD_Reference_ID=134 */
public static final int USER1_ID_AD_Reference_ID=134;
/** Set User List 1.
@param User1_ID User defined list element #1 */
public void setUser1_ID (int User1_ID)
{
if (User1_ID <= 0) set_ValueNoCheck ("User1_ID", null);
 else 
set_ValueNoCheck ("User1_ID", Integer.valueOf(User1_ID));
}
/** Get User List 1.
@return User defined list element #1 */
public int getUser1_ID() 
{
Integer ii = (Integer)get_Value("User1_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name User1_ID */
public static final String COLUMNNAME_User1_ID = "User1_ID";

/** User2_ID AD_Reference_ID=137 */
public static final int USER2_ID_AD_Reference_ID=137;
/** Set User List 2.
@param User2_ID User defined list element #2 */
public void setUser2_ID (int User2_ID)
{
if (User2_ID <= 0) set_ValueNoCheck ("User2_ID", null);
 else 
set_ValueNoCheck ("User2_ID", Integer.valueOf(User2_ID));
}
/** Get User List 2.
@return User defined list element #2 */
public int getUser2_ID() 
{
Integer ii = (Integer)get_Value("User2_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name User2_ID */
public static final String COLUMNNAME_User2_ID = "User2_ID";
}
