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
/** Generated Model for T_Acquisitions
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: X_T_Acquisitions.java 1767 2010-10-07 18:29:12Z xapiens $ */
public class X_T_Acquisitions extends PO
{
/** Standard Constructor
@param ctx context
@param T_Acquisitions_ID id
@param trxName transaction
*/
public X_T_Acquisitions (Properties ctx, int T_Acquisitions_ID, String trxName)
{
super (ctx, T_Acquisitions_ID, trxName);
/** if (T_Acquisitions_ID == 0)
{
setAD_PInstance_ID (0);
setBPartner_Name (null);
setBPartner_Type (null);
setBPartner_Value (null);
setC_BPartner_ID (0);
setC_DocType_ID (0);
setC_Invoice_ID (Env.ZERO);
setDateInvoiced (new Timestamp(System.currentTimeMillis()));
setDocumentNo (null);
setGrandTotal (Env.ZERO);
setPayDate (new Timestamp(System.currentTimeMillis()));
setSerial (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_T_Acquisitions (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000003 */
public static final int Table_ID=MTable.getTable_ID("T_Acquisitions");

/** TableName=T_Acquisitions */
public static final String Table_Name="T_Acquisitions";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"T_Acquisitions");

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
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_T_Acquisitions[").append(get_ID()).append("]");
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
/** Set Accounted Amount.
@param Amt_Base_Boleta Amount Balance in Currency of Accounting Schema */
public void setAmt_Base_Boleta (BigDecimal Amt_Base_Boleta)
{
set_ValueNoCheck ("Amt_Base_Boleta", Amt_Base_Boleta);
}
/** Get Accounted Amount.
@return Amount Balance in Currency of Accounting Schema */
public BigDecimal getAmt_Base_Boleta() 
{
BigDecimal bd = (BigDecimal)get_Value("Amt_Base_Boleta");
if (bd == null) return Env.ZERO;
return bd;
}
/** Column name Amt_Base_Boleta */
public static final String COLUMNNAME_Amt_Base_Boleta = "Amt_Base_Boleta";
/** Set Accounted Amount.
@param Amt_Base_Excempt Amount Balance in Currency of Accounting Schema */
public void setAmt_Base_Excempt (BigDecimal Amt_Base_Excempt)
{
set_ValueNoCheck ("Amt_Base_Excempt", Amt_Base_Excempt);
}
/** Get Accounted Amount.
@return Amount Balance in Currency of Accounting Schema */
public BigDecimal getAmt_Base_Excempt() 
{
BigDecimal bd = (BigDecimal)get_Value("Amt_Base_Excempt");
if (bd == null) return Env.ZERO;
return bd;
}
/** Column name Amt_Base_Excempt */
public static final String COLUMNNAME_Amt_Base_Excempt = "Amt_Base_Excempt";
/** Set Accounted Amount.
@param Amt_Base_Export_Excempt Amount Balance in Currency of Accounting Schema */
public void setAmt_Base_Export_Excempt (BigDecimal Amt_Base_Export_Excempt)
{
set_ValueNoCheck ("Amt_Base_Export_Excempt", Amt_Base_Export_Excempt);
}
/** Get Accounted Amount.
@return Amount Balance in Currency of Accounting Schema */
public BigDecimal getAmt_Base_Export_Excempt() 
{
BigDecimal bd = (BigDecimal)get_Value("Amt_Base_Export_Excempt");
if (bd == null) return Env.ZERO;
return bd;
}
/** Column name Amt_Base_Export_Excempt */
public static final String COLUMNNAME_Amt_Base_Export_Excempt = "Amt_Base_Export_Excempt";
/** Set Accounted Amount.
@param Amt_Base_Taxed Amount Balance in Currency of Accounting Schema */
public void setAmt_Base_Taxed (BigDecimal Amt_Base_Taxed)
{
set_ValueNoCheck ("Amt_Base_Taxed", Amt_Base_Taxed);
}
/** Get Accounted Amount.
@return Amount Balance in Currency of Accounting Schema */
public BigDecimal getAmt_Base_Taxed() 
{
BigDecimal bd = (BigDecimal)get_Value("Amt_Base_Taxed");
if (bd == null) return Env.ZERO;
return bd;
}
/** Column name Amt_Base_Taxed */
public static final String COLUMNNAME_Amt_Base_Taxed = "Amt_Base_Taxed";
/** Set Accounted Amount.
@param Amt_Base_Untaxed Amount Balance in Currency of Accounting Schema */
public void setAmt_Base_Untaxed (BigDecimal Amt_Base_Untaxed)
{
set_ValueNoCheck ("Amt_Base_Untaxed", Amt_Base_Untaxed);
}
/** Get Accounted Amount.
@return Amount Balance in Currency of Accounting Schema */
public BigDecimal getAmt_Base_Untaxed() 
{
BigDecimal bd = (BigDecimal)get_Value("Amt_Base_Untaxed");
if (bd == null) return Env.ZERO;
return bd;
}
/** Column name Amt_Base_Untaxed */
public static final String COLUMNNAME_Amt_Base_Untaxed = "Amt_Base_Untaxed";
/** Set Accounted Amount.
@param Amt_IGV_Export_Excempt Amount Balance in Currency of Accounting Schema */
public void setAmt_IGV_Export_Excempt (BigDecimal Amt_IGV_Export_Excempt)
{
set_ValueNoCheck ("Amt_IGV_Export_Excempt", Amt_IGV_Export_Excempt);
}
/** Get Accounted Amount.
@return Amount Balance in Currency of Accounting Schema */
public BigDecimal getAmt_IGV_Export_Excempt() 
{
BigDecimal bd = (BigDecimal)get_Value("Amt_IGV_Export_Excempt");
if (bd == null) return Env.ZERO;
return bd;
}
/** Column name Amt_IGV_Export_Excempt */
public static final String COLUMNNAME_Amt_IGV_Export_Excempt = "Amt_IGV_Export_Excempt";
/** Set Accounted Amount.
@param Amt_IGV_Taxed Amount Balance in Currency of Accounting Schema */
public void setAmt_IGV_Taxed (BigDecimal Amt_IGV_Taxed)
{
set_ValueNoCheck ("Amt_IGV_Taxed", Amt_IGV_Taxed);
}
/** Get Accounted Amount.
@return Amount Balance in Currency of Accounting Schema */
public BigDecimal getAmt_IGV_Taxed() 
{
BigDecimal bd = (BigDecimal)get_Value("Amt_IGV_Taxed");
if (bd == null) return Env.ZERO;
return bd;
}
/** Column name Amt_IGV_Taxed */
public static final String COLUMNNAME_Amt_IGV_Taxed = "Amt_IGV_Taxed";
/** Set Accounted Amount.
@param AmtTax_ISC Amount Balance in Currency of Accounting Schema */
public void setAmtTax_ISC (BigDecimal AmtTax_ISC)
{
set_ValueNoCheck ("AmtTax_ISC", AmtTax_ISC);
}
/** Get Accounted Amount.
@return Amount Balance in Currency of Accounting Schema */
public BigDecimal getAmtTax_ISC() 
{
BigDecimal bd = (BigDecimal)get_Value("AmtTax_ISC");
if (bd == null) return Env.ZERO;
return bd;
}
/** Column name AmtTax_ISC */
public static final String COLUMNNAME_AmtTax_ISC = "AmtTax_ISC";
/** Set Accounted Amount.
@param AmtTax_Other Amount Balance in Currency of Accounting Schema */
public void setAmtTax_Other (BigDecimal AmtTax_Other)
{
set_ValueNoCheck ("AmtTax_Other", AmtTax_Other);
}
/** Get Accounted Amount.
@return Amount Balance in Currency of Accounting Schema */
public BigDecimal getAmtTax_Other() 
{
BigDecimal bd = (BigDecimal)get_Value("AmtTax_Other");
if (bd == null) return Env.ZERO;
return bd;
}
/** Column name AmtTax_Other */
public static final String COLUMNNAME_AmtTax_Other = "AmtTax_Other";
/** Set Accounted Amount.
@param AmtTax_Perception Amount Balance in Currency of Accounting Schema */
public void setAmtTax_Perception (BigDecimal AmtTax_Perception)
{
set_ValueNoCheck ("AmtTax_Perception", AmtTax_Perception);
}
/** Get Accounted Amount.
@return Amount Balance in Currency of Accounting Schema */
public BigDecimal getAmtTax_Perception() 
{
BigDecimal bd = (BigDecimal)get_Value("AmtTax_Perception");
if (bd == null) return Env.ZERO;
return bd;
}
/** Column name AmtTax_Perception */
public static final String COLUMNNAME_AmtTax_Perception = "AmtTax_Perception";
/** Set Name.
@param BPartner_Name Alphanumeric identifier of the entity */
public void setBPartner_Name (String BPartner_Name)
{
if (BPartner_Name == null) throw new IllegalArgumentException ("BPartner_Name is mandatory.");
if (BPartner_Name.length() > 60)
{
log.warning("Length > 60 - truncated");
BPartner_Name = BPartner_Name.substring(0,59);
}
set_ValueNoCheck ("BPartner_Name", BPartner_Name);
}
/** Get Name.
@return Alphanumeric identifier of the entity */
public String getBPartner_Name() 
{
return (String)get_Value("BPartner_Name");
}
/** Column name BPartner_Name */
public static final String COLUMNNAME_BPartner_Name = "BPartner_Name";
/** Set Type.
@param BPartner_Type Type of Validation (SQL, Java Script, Java Language) */
public void setBPartner_Type (String BPartner_Type)
{
if (BPartner_Type == null) throw new IllegalArgumentException ("BPartner_Type is mandatory.");
if (BPartner_Type.length() > 5)
{
log.warning("Length > 5 - truncated");
BPartner_Type = BPartner_Type.substring(0,4);
}
set_ValueNoCheck ("BPartner_Type", BPartner_Type);
}
/** Get Type.
@return Type of Validation (SQL, Java Script, Java Language) */
public String getBPartner_Type() 
{
return (String)get_Value("BPartner_Type");
}
/** Column name BPartner_Type */
public static final String COLUMNNAME_BPartner_Type = "BPartner_Type";
/** Set Business Partner Key.
@param BPartner_Value The Key of the Business Partner */
public void setBPartner_Value (String BPartner_Value)
{
if (BPartner_Value == null) throw new IllegalArgumentException ("BPartner_Value is mandatory.");
if (BPartner_Value.length() > 40)
{
log.warning("Length > 40 - truncated");
BPartner_Value = BPartner_Value.substring(0,39);
}
set_ValueNoCheck ("BPartner_Value", BPartner_Value);
}
/** Get Business Partner Key.
@return The Key of the Business Partner */
public String getBPartner_Value() 
{
return (String)get_Value("BPartner_Value");
}
/** Column name BPartner_Value */
public static final String COLUMNNAME_BPartner_Value = "BPartner_Value";
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID < 1) throw new IllegalArgumentException ("C_BPartner_ID is mandatory.");
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
/** Set Currency Type.
@param C_ConversionType_ID Currency Conversion Rate Type */
public void setC_ConversionType_ID (int C_ConversionType_ID)
{
if (C_ConversionType_ID <= 0) set_ValueNoCheck ("C_ConversionType_ID", null);
 else 
set_ValueNoCheck ("C_ConversionType_ID", Integer.valueOf(C_ConversionType_ID));
}
/** Get Currency Type.
@return Currency Conversion Rate Type */
public int getC_ConversionType_ID() 
{
Integer ii = (Integer)get_Value("C_ConversionType_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_ConversionType_ID */
public static final String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";
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
/** Set Document Type.
@param C_DocType_ID Document type or rules */
public void setC_DocType_ID (int C_DocType_ID)
{
if (C_DocType_ID < 0) throw new IllegalArgumentException ("C_DocType_ID is mandatory.");
set_ValueNoCheck ("C_DocType_ID", Integer.valueOf(C_DocType_ID));
}
/** Get Document Type.
@return Document type or rules */
public int getC_DocType_ID() 
{
Integer ii = (Integer)get_Value("C_DocType_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
/** Set Invoice.
@param C_Invoice_ID Invoice Identifier */
public void setC_Invoice_ID (BigDecimal C_Invoice_ID)
{
if (C_Invoice_ID == null) throw new IllegalArgumentException ("C_Invoice_ID is mandatory.");
set_ValueNoCheck ("C_Invoice_ID", C_Invoice_ID);
}
/** Get Invoice.
@return Invoice Identifier */
public BigDecimal getC_Invoice_ID() 
{
BigDecimal bd = (BigDecimal)get_Value("C_Invoice_ID");
if (bd == null) return Env.ZERO;
return bd;
}
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
/** Set Sunat Document Code.
@param CodSunat Sunat Document Code */
public void setCodSunat (String CodSunat)
{
if (CodSunat != null && CodSunat.length() > 2)
{
log.warning("Length > 2 - truncated");
CodSunat = CodSunat.substring(0,1);
}
set_ValueNoCheck ("CodSunat", CodSunat);
}
/** Get Sunat Document Code.
@return Sunat Document Code */
public String getCodSunat() 
{
return (String)get_Value("CodSunat");
}
/** Column name CodSunat */
public static final String COLUMNNAME_CodSunat = "CodSunat";
/** Set Date Invoiced.
@param C_Reference_DateInvoiced Date printed on Invoice */
public void setC_Reference_DateInvoiced (Timestamp C_Reference_DateInvoiced)
{
set_ValueNoCheck ("C_Reference_DateInvoiced", C_Reference_DateInvoiced);
}
/** Get Date Invoiced.
@return Date printed on Invoice */
public Timestamp getC_Reference_DateInvoiced() 
{
return (Timestamp)get_Value("C_Reference_DateInvoiced");
}
/** Column name C_Reference_DateInvoiced */
public static final String COLUMNNAME_C_Reference_DateInvoiced = "C_Reference_DateInvoiced";
/** Set Document No.
@param C_Reference_DocumentNo Document sequence number of the document */
public void setC_Reference_DocumentNo (String C_Reference_DocumentNo)
{
if (C_Reference_DocumentNo != null && C_Reference_DocumentNo.length() > 30)
{
log.warning("Length > 30 - truncated");
C_Reference_DocumentNo = C_Reference_DocumentNo.substring(0,29);
}
set_ValueNoCheck ("C_Reference_DocumentNo", C_Reference_DocumentNo);
}
/** Get Document No.
@return Document sequence number of the document */
public String getC_Reference_DocumentNo() 
{
return (String)get_Value("C_Reference_DocumentNo");
}
/** Column name C_Reference_DocumentNo */
public static final String COLUMNNAME_C_Reference_DocumentNo = "C_Reference_DocumentNo";
/** Set Document Serial.
@param C_Reference_Serial Serial Number for the Document */
public void setC_Reference_Serial (String C_Reference_Serial)
{
if (C_Reference_Serial != null && C_Reference_Serial.length() > 10)
{
log.warning("Length > 10 - truncated");
C_Reference_Serial = C_Reference_Serial.substring(0,9);
}
set_ValueNoCheck ("C_Reference_Serial", C_Reference_Serial);
}
/** Get Document Serial.
@return Serial Number for the Document */
public String getC_Reference_Serial() 
{
return (String)get_Value("C_Reference_Serial");
}
/** Column name C_Reference_Serial */
public static final String COLUMNNAME_C_Reference_Serial = "C_Reference_Serial";
/** Set Date Invoiced.
@param DateInvoiced Date printed on Invoice */
public void setDateInvoiced (Timestamp DateInvoiced)
{
if (DateInvoiced == null) throw new IllegalArgumentException ("DateInvoiced is mandatory.");
set_ValueNoCheck ("DateInvoiced", DateInvoiced);
}
/** Get Date Invoiced.
@return Date printed on Invoice */
public Timestamp getDateInvoiced() 
{
return (Timestamp)get_Value("DateInvoiced");
}
/** Column name DateInvoiced */
public static final String COLUMNNAME_DateInvoiced = "DateInvoiced";
/** Set Date Invoiced.
@param Detraction_Date Date printed on Invoice */
public void setDetraction_Date (Timestamp Detraction_Date)
{
set_ValueNoCheck ("Detraction_Date", Detraction_Date);
}
/** Get Date Invoiced.
@return Date printed on Invoice */
public Timestamp getDetraction_Date() 
{
return (Timestamp)get_Value("Detraction_Date");
}
/** Column name Detraction_Date */
public static final String COLUMNNAME_Detraction_Date = "Detraction_Date";
/** Set Document No.
@param Detraction_Number Document sequence number of the document */
public void setDetraction_Number (String Detraction_Number)
{
if (Detraction_Number != null && Detraction_Number.length() > 30)
{
log.warning("Length > 30 - truncated");
Detraction_Number = Detraction_Number.substring(0,29);
}
set_ValueNoCheck ("Detraction_Number", Detraction_Number);
}
/** Get Document No.
@return Document sequence number of the document */
public String getDetraction_Number() 
{
return (String)get_Value("Detraction_Number");
}
/** Column name Detraction_Number */
public static final String COLUMNNAME_Detraction_Number = "Detraction_Number";
/** Set Document No.
@param DocumentNo Document sequence number of the document */
public void setDocumentNo (String DocumentNo)
{
if (DocumentNo == null) throw new IllegalArgumentException ("DocumentNo is mandatory.");
if (DocumentNo.length() > 30)
{
log.warning("Length > 30 - truncated");
DocumentNo = DocumentNo.substring(0,29);
}
set_ValueNoCheck ("DocumentNo", DocumentNo);
}
/** Get Document No.
@return Document sequence number of the document */
public String getDocumentNo() 
{
return (String)get_Value("DocumentNo");
}
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";
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
/** Set Grand Total.
@param GrandTotal Total amount of document */
public void setGrandTotal (BigDecimal GrandTotal)
{
if (GrandTotal == null) throw new IllegalArgumentException ("GrandTotal is mandatory.");
set_ValueNoCheck ("GrandTotal", GrandTotal);
}
/** Get Grand Total.
@return Total amount of document */
public BigDecimal getGrandTotal() 
{
BigDecimal bd = (BigDecimal)get_Value("GrandTotal");
if (bd == null) return Env.ZERO;
return bd;
}
/** Column name GrandTotal */
public static final String COLUMNNAME_GrandTotal = "GrandTotal";
/** Set Multiply Rate.
@param MultiplyRate Rate to multiple the source by to calculate the target. */
public void setMultiplyRate (BigDecimal MultiplyRate)
{
set_ValueNoCheck ("MultiplyRate", MultiplyRate);
}
/** Get Multiply Rate.
@return Rate to multiple the source by to calculate the target. */
public BigDecimal getMultiplyRate() 
{
BigDecimal bd = (BigDecimal)get_Value("MultiplyRate");
if (bd == null) return Env.ZERO;
return bd;
}
/** Column name MultiplyRate */
public static final String COLUMNNAME_MultiplyRate = "MultiplyRate";
/** Set Payment date.
@param PayDate Date Payment made */
public void setPayDate (Timestamp PayDate)
{
if (PayDate == null) throw new IllegalArgumentException ("PayDate is mandatory.");
set_ValueNoCheck ("PayDate", PayDate);
}
/** Get Payment date.
@return Date Payment made */
public Timestamp getPayDate() 
{
return (Timestamp)get_Value("PayDate");
}
/** Column name PayDate */
public static final String COLUMNNAME_PayDate = "PayDate";
/** Set Document Serial.
@param Serial Serial Number for the Document */
public void setSerial (String Serial)
{
if (Serial == null) throw new IllegalArgumentException ("Serial is mandatory.");
if (Serial.length() > 10)
{
log.warning("Length > 10 - truncated");
Serial = Serial.substring(0,9);
}
set_ValueNoCheck ("Serial", Serial);
}
/** Get Document Serial.
@return Serial Number for the Document */
public String getSerial() 
{
return (String)get_Value("Serial");
}
/** Column name Serial */
public static final String COLUMNNAME_Serial = "Serial";
}
