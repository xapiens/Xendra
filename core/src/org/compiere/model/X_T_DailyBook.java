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
/** Generated Model for T_DailyBook
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: X_T_DailyBook.java 1767 2010-10-07 18:29:12Z xapiens $ */
public class X_T_DailyBook extends PO
{
/** Standard Constructor
@param ctx context
@param T_DailyBook_ID id
@param trxName transaction
*/
public X_T_DailyBook (Properties ctx, int T_DailyBook_ID, String trxName)
{
super (ctx, T_DailyBook_ID, trxName);
/** if (T_DailyBook_ID == 0)
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
public X_T_DailyBook (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000028 */
public static final int Table_ID=MTable.getTable_ID("T_DailyBook");

/** TableName=T_DailyBook */
public static final String Table_Name="T_DailyBook";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"T_DailyBook");

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
StringBuffer sb = new StringBuffer ("X_T_DailyBook[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Description.
@param AcctDescription Optional short DESCRIPTION of the record */
public void setAcctDescription (String AcctDescription)
{
if (AcctDescription != null && AcctDescription.length() > 255)
{
log.warning("Length > 255 - truncated");
AcctDescription = AcctDescription.substring(0,254);
}
set_Value ("AcctDescription", AcctDescription);
}
/** Get Description.
@return Optional short DESCRIPTION of the record */
public String getAcctDescription() 
{
return (String)get_Value("AcctDescription");
}
/** Column name AcctDescription */
public static final String COLUMNNAME_AcctDescription = "AcctDescription";
/** Set Process Instance.
@param AD_PInstance_ID Instance of the process */
public void setAD_PInstance_ID (int AD_PInstance_ID)
{
if (AD_PInstance_ID < 1) throw new IllegalArgumentException ("AD_PInstance_ID is mandatory.");
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
/** Set Table.
@param AD_Table_ID Database Table information */
public void setAD_Table_ID (BigDecimal AD_Table_ID)
{
set_Value ("AD_Table_ID", AD_Table_ID);
}
/** Get Table.
@return Database Table information */
public BigDecimal getAD_Table_ID() 
{
BigDecimal bd = (BigDecimal)get_Value("AD_Table_ID");
if (bd == null) return Env.ZERO;
return bd;
}
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
/** Set Accounted Credit.
@param AmtAcctCr Accounted Credit Amount */
public void setAmtAcctCr (BigDecimal AmtAcctCr)
{
set_Value ("AmtAcctCr", AmtAcctCr);
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
set_Value ("AmtAcctDr", AmtAcctDr);
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
/** Set Description.
@param Description Optional short DESCRIPTION of the record */
public void setDescription (String Description)
{
if (Description != null && Description.length() > 255)
{
log.warning("Length > 255 - truncated");
Description = Description.substring(0,254);
}
set_Value ("Description", Description);
}
/** Get Description.
@return Optional short DESCRIPTION of the record */
public String getDescription() 
{
return (String)get_Value("Description");
}
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Document No.
@param DocumentNo Document sequence number of the document */
public void setDocumentNo (String DocumentNo)
{
if (DocumentNo != null && DocumentNo.length() > 30)
{
log.warning("Length > 30 - truncated");
DocumentNo = DocumentNo.substring(0,29);
}
set_Value ("DocumentNo", DocumentNo);
}
/** Get Document No.
@return Document sequence number of the document */
public String getDocumentNo() 
{
return (String)get_Value("DocumentNo");
}
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";
/** Set Accounting Fact.
@param Fact_Acct_ID Accounting Fact */
public void setFact_Acct_ID (BigDecimal Fact_Acct_ID)
{
set_Value ("Fact_Acct_ID", Fact_Acct_ID);
}
/** Get Accounting Fact.
@return Accounting Fact */
public BigDecimal getFact_Acct_ID() 
{
BigDecimal bd = (BigDecimal)get_Value("Fact_Acct_ID");
if (bd == null) return Env.ZERO;
return bd;
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
/** Set Record ID.
@param Record_ID Direct internal record ID */
public void setRecord_ID (int Record_ID)
{
if (Record_ID <= 0) set_Value ("Record_ID", null);
 else 
set_Value ("Record_ID", Integer.valueOf(Record_ID));
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
/** Set Document Serial.
@param Serial Serial Number for the Document */
public void setSerial (BigDecimal Serial)
{
set_Value ("Serial", Serial);
}
/** Get Document Serial.
@return Serial Number for the Document */
public BigDecimal getSerial() 
{
BigDecimal bd = (BigDecimal)get_Value("Serial");
if (bd == null) return Env.ZERO;
return bd;
}
/** Column name Serial */
public static final String COLUMNNAME_Serial = "Serial";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value != null && Value.length() > 40)
{
log.warning("Length > 40 - truncated");
Value = Value.substring(0,39);
}
set_Value ("Value", Value);
}
/** Get Search Key.
@return Search key for the record in the format required - must be unique */
public String getValue() 
{
return (String)get_Value("Value");
}
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
