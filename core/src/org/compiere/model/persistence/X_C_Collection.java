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
/** Generated Model for C_Collection
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Collection extends PO
{
/** Standard Constructor
@param ctx context
@param C_Collection_ID id
@param trxName transaction
*/
public X_C_Collection (Properties ctx, int C_Collection_ID, String trxName)
{
super (ctx, C_Collection_ID, trxName);
/** if (C_Collection_ID == 0)
{
setC_Collection_ID (0);
setC_Order_ID (0);
setC_POS_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_Collection (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000374 */
public static int Table_ID=MTable.getTable_ID("C_Collection");

@XendraTrl(Identifier="6f65a95a-2b25-4e36-821c-7e2f3d13b959")
public static String es_PE_TABLE_C_Collection_Name="Collection";

@XendraTable(Name="Collection",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="C_Collection",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="6f65a95a-2b25-4e36-821c-7e2f3d13b959",
Synchronized="2020-03-03 21:36:44.0")
/** TableName=C_Collection */
public static final String Table_Name="C_Collection";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Collection");

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
    Table_ID = MTable.getTable_ID("C_Collection");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Collection[").append(get_ID()).append("]");
return sb.toString();
}
/** Set CashAmt.
@param CashAmt CashAmt */
public void setCashAmt (BigDecimal CashAmt)
{
set_Value (COLUMNNAME_CashAmt, CashAmt);
}
/** Get CashAmt.
@return CashAmt */
public BigDecimal getCashAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CashAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="4a79092f-98b2-4454-8f4d-e8ba7bda9e86")
public static String es_PE_COLUMN_CashAmt_Name="CashAmt";

@XendraColumn(AD_Element_ID="63c68745-15be-0a1b-899a-91c5200eb3f8",ColumnName="CashAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4a79092f-98b2-4454-8f4d-e8ba7bda9e86",
Synchronized="2019-08-30 22:21:22.0")
/** Column name CashAmt */
public static final String COLUMNNAME_CashAmt = "CashAmt";
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID <= 0) set_Value (COLUMNNAME_C_BPartner_ID, null);
 else 
set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
}
/** Get Business Partner .
@return Identifies a Business Partner */
public int getC_BPartner_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="dedec994-8bf5-4b56-8076-5dcc29dddb11")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Business Partner ";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dedec994-8bf5-4b56-8076-5dcc29dddb11",
Synchronized="2019-08-30 22:21:22.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Cash Book.
@param C_CashBook_ID Cash Book for recording petty cash transactions */
public void setC_CashBook_ID (int C_CashBook_ID)
{
if (C_CashBook_ID <= 0) set_Value (COLUMNNAME_C_CashBook_ID, null);
 else 
set_Value (COLUMNNAME_C_CashBook_ID, Integer.valueOf(C_CashBook_ID));
}
/** Get Cash Book.
@return Cash Book for recording petty cash transactions */
public int getC_CashBook_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_CashBook_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f9da5f6f-9b0f-45da-96b3-c3b1ba556930")
public static String es_PE_COLUMN_C_CashBook_ID_Name="Cash Book";

@XendraColumn(AD_Element_ID="30688c51-d454-8026-32c4-990b9ea9ddf2",ColumnName="C_CashBook_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f9da5f6f-9b0f-45da-96b3-c3b1ba556930",
Synchronized="2019-08-30 22:21:22.0")
/** Column name C_CashBook_ID */
public static final String COLUMNNAME_C_CashBook_ID = "C_CashBook_ID";
/** Set Cash Journal.
@param C_Cash_ID Cash Journal */
public void setC_Cash_ID (int C_Cash_ID)
{
if (C_Cash_ID <= 0) set_Value (COLUMNNAME_C_Cash_ID, null);
 else 
set_Value (COLUMNNAME_C_Cash_ID, Integer.valueOf(C_Cash_ID));
}
/** Get Cash Journal.
@return Cash Journal */
public int getC_Cash_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Cash_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2ab25e82-47ff-4cc9-9880-a20f721bbfbc")
public static String es_PE_COLUMN_C_Cash_ID_Name="Cash Journal";

@XendraColumn(AD_Element_ID="b43be1cd-0c26-1fad-b5d8-421dd3b1146e",ColumnName="C_Cash_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2ab25e82-47ff-4cc9-9880-a20f721bbfbc",
Synchronized="2019-08-30 22:21:22.0")
/** Column name C_Cash_ID */
public static final String COLUMNNAME_C_Cash_ID = "C_Cash_ID";
/** Set Cash Journal Line.
@param C_CashLine_ID Cash Journal Line */
public void setC_CashLine_ID (int C_CashLine_ID)
{
if (C_CashLine_ID <= 0) set_Value (COLUMNNAME_C_CashLine_ID, null);
 else 
set_Value (COLUMNNAME_C_CashLine_ID, Integer.valueOf(C_CashLine_ID));
}
/** Get Cash Journal Line.
@return Cash Journal Line */
public int getC_CashLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_CashLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="88a7a0ff-85d4-46ad-a264-ea4e7f57da35")
public static String es_PE_COLUMN_C_CashLine_ID_Name="Cash Journal Line";

@XendraColumn(AD_Element_ID="51d71f75-4ff8-51c4-df6f-191def6be399",ColumnName="C_CashLine_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="88a7a0ff-85d4-46ad-a264-ea4e7f57da35",
Synchronized="2019-08-30 22:21:22.0")
/** Column name C_CashLine_ID */
public static final String COLUMNNAME_C_CashLine_ID = "C_CashLine_ID";
/** Set Collection.
@param C_Collection_ID Collection */
public void setC_Collection_ID (int C_Collection_ID)
{
if (C_Collection_ID < 1) throw new IllegalArgumentException ("C_Collection_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Collection_ID, Integer.valueOf(C_Collection_ID));
}
/** Get Collection.
@return Collection */
public int getC_Collection_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Collection_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_Collection_ID */
public static final String COLUMNNAME_C_Collection_ID = "C_Collection_ID";
/** Set Invoice.
@param C_Invoice_ID Invoice Identifier */
public void setC_Invoice_ID (int C_Invoice_ID)
{
if (C_Invoice_ID <= 0) set_Value (COLUMNNAME_C_Invoice_ID, null);
 else 
set_Value (COLUMNNAME_C_Invoice_ID, Integer.valueOf(C_Invoice_ID));
}
/** Get Invoice.
@return Invoice Identifier */
public int getC_Invoice_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Invoice_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3e06c9bc-2af0-47d5-9d2a-a25fbbd2b6a2")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Invoice";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3e06c9bc-2af0-47d5-9d2a-a25fbbd2b6a2",
Synchronized="2019-08-30 22:21:22.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
/** Set Order.
@param C_Order_ID Order */
public void setC_Order_ID (int C_Order_ID)
{
if (C_Order_ID < 1) throw new IllegalArgumentException ("C_Order_ID is mandatory.");
set_Value (COLUMNNAME_C_Order_ID, Integer.valueOf(C_Order_ID));
}
/** Get Order.
@return Order */
public int getC_Order_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Order_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5412747d-7274-4810-ba84-ee0b66e5f2a7")
public static String es_PE_COLUMN_C_Order_ID_Name="Order";

@XendraColumn(AD_Element_ID="cc846c60-90b8-6aad-9d07-b5d0c0328787",ColumnName="C_Order_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5412747d-7274-4810-ba84-ee0b66e5f2a7",
Synchronized="2019-08-30 22:21:22.0")
/** Column name C_Order_ID */
public static final String COLUMNNAME_C_Order_ID = "C_Order_ID";
/** Set CouponAmt.
@param CouponAmt CouponAmt */
public void setCouponAmt (BigDecimal CouponAmt)
{
set_Value (COLUMNNAME_CouponAmt, CouponAmt);
}
/** Get CouponAmt.
@return CouponAmt */
public BigDecimal getCouponAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CouponAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="50e5b74c-a974-4233-a3f1-7f3693bab95f")
public static String es_PE_COLUMN_CouponAmt_Name="CouponAmt";

@XendraColumn(AD_Element_ID="d5c99cee-4522-d843-bb4e-8d3a68ffba50",ColumnName="CouponAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="50e5b74c-a974-4233-a3f1-7f3693bab95f",
Synchronized="2019-08-30 22:21:22.0")
/** Column name CouponAmt */
public static final String COLUMNNAME_CouponAmt = "CouponAmt";
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

@XendraTrl(Identifier="3fe114c4-e2b9-453a-b017-eb5f0a064f30")
public static String es_PE_COLUMN_C_Payment_ID_Name="Payment";

@XendraColumn(AD_Element_ID="3ded5658-968e-94c5-207b-eed6f6a7bb43",ColumnName="C_Payment_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3fe114c4-e2b9-453a-b017-eb5f0a064f30",
Synchronized="2019-08-30 22:21:22.0")
/** Column name C_Payment_ID */
public static final String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
/** Set POS Terminal.
@param C_POS_ID Point of Sales Terminal */
public void setC_POS_ID (int C_POS_ID)
{
if (C_POS_ID < 1) throw new IllegalArgumentException ("C_POS_ID is mandatory.");
set_Value (COLUMNNAME_C_POS_ID, Integer.valueOf(C_POS_ID));
}
/** Get POS Terminal.
@return Point of Sales Terminal */
public int getC_POS_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_POS_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5d7f0fa4-a3c6-420d-88c2-4f706255e3cf")
public static String es_PE_COLUMN_C_POS_ID_Name="POS Terminal";

@XendraColumn(AD_Element_ID="c2adeeab-8099-b658-0016-5d97a32be4a2",ColumnName="C_POS_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5d7f0fa4-a3c6-420d-88c2-4f706255e3cf",
Synchronized="2019-08-30 22:21:22.0")
/** Column name C_POS_ID */
public static final String COLUMNNAME_C_POS_ID = "C_POS_ID";
/** Set CreditAmt.
@param CreditAmt CreditAmt */
public void setCreditAmt (BigDecimal CreditAmt)
{
set_Value (COLUMNNAME_CreditAmt, CreditAmt);
}
/** Get CreditAmt.
@return CreditAmt */
public BigDecimal getCreditAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CreditAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="68281840-5b5c-4eeb-b91b-585f24a87d20")
public static String es_PE_COLUMN_CreditAmt_Name="CreditAmt";

@XendraColumn(AD_Element_ID="d21493c2-b7fd-2280-9ba2-bc6afb8a48f8",ColumnName="CreditAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="68281840-5b5c-4eeb-b91b-585f24a87d20",
Synchronized="2019-08-30 22:21:22.0")
/** Column name CreditAmt */
public static final String COLUMNNAME_CreditAmt = "CreditAmt";
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

@XendraTrl(Identifier="768a5da2-77eb-476a-86dc-d373293e0eb3")
public static String es_PE_COLUMN_DateTrx_Name="Transaction Date";

@XendraColumn(AD_Element_ID="3700288f-61dd-2021-b833-cf804ceed1e9",ColumnName="DateTrx",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="768a5da2-77eb-476a-86dc-d373293e0eb3",
Synchronized="2019-08-30 22:21:22.0")
/** Column name DateTrx */
public static final String COLUMNNAME_DateTrx = "DateTrx";
/** Set Difference.
@param DifferenceAmt Difference Amount */
public void setDifferenceAmt (BigDecimal DifferenceAmt)
{
set_Value (COLUMNNAME_DifferenceAmt, DifferenceAmt);
}
/** Get Difference.
@return Difference Amount */
public BigDecimal getDifferenceAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_DifferenceAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="20df8572-c551-4260-9892-467c60a86887")
public static String es_PE_COLUMN_DifferenceAmt_Name="Difference";

@XendraColumn(AD_Element_ID="62840044-943e-7971-69a5-7954e25dfe29",ColumnName="DifferenceAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="20df8572-c551-4260-9892-467c60a86887",
Synchronized="2019-08-30 22:21:22.0")
/** Column name DifferenceAmt */
public static final String COLUMNNAME_DifferenceAmt = "DifferenceAmt";
/** Set Grand Total.
@param GrandTotal Total amount of document */
public void setGrandTotal (BigDecimal GrandTotal)
{
set_Value (COLUMNNAME_GrandTotal, GrandTotal);
}
/** Get Grand Total.
@return Total amount of document */
public BigDecimal getGrandTotal() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_GrandTotal);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="4d077ad3-f098-46cc-aaf4-576e32c0f98c")
public static String es_PE_COLUMN_GrandTotal_Name="Grand Total";

@XendraColumn(AD_Element_ID="ffd614c2-6ff8-c9c6-71bf-44f369675711",ColumnName="GrandTotal",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4d077ad3-f098-46cc-aaf4-576e32c0f98c",
Synchronized="2019-08-30 22:21:22.0")
/** Column name GrandTotal */
public static final String COLUMNNAME_GrandTotal = "GrandTotal";
/** Set HR_WorkShift_ID.
@param HR_WorkShift_ID HR_WorkShift_ID */
public void setHR_WorkShift_ID (int HR_WorkShift_ID)
{
if (HR_WorkShift_ID <= 0) set_Value (COLUMNNAME_HR_WorkShift_ID, null);
 else 
set_Value (COLUMNNAME_HR_WorkShift_ID, Integer.valueOf(HR_WorkShift_ID));
}
/** Get HR_WorkShift_ID.
@return HR_WorkShift_ID */
public int getHR_WorkShift_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_WorkShift_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ddd8d10e-2d69-45b4-8d4d-25253b2226f3")
public static String es_PE_COLUMN_HR_WorkShift_ID_Name="HR_WorkShift_ID";

@XendraColumn(AD_Element_ID="742243ba-9ede-4990-8e52-6da7e53a866b",ColumnName="HR_WorkShift_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ddd8d10e-2d69-45b4-8d4d-25253b2226f3",
Synchronized="2019-08-30 22:21:22.0")
/** Column name HR_WorkShift_ID */
public static final String COLUMNNAME_HR_WorkShift_ID = "HR_WorkShift_ID";
/** Set Printed.
@param IsPrinted Indicates if this document / line is printed */
public void setIsPrinted (boolean IsPrinted)
{
set_Value (COLUMNNAME_IsPrinted, Boolean.valueOf(IsPrinted));
}
/** Get Printed.
@return Indicates if this document / line is printed */
public boolean isPrinted() 
{
Object oo = get_Value(COLUMNNAME_IsPrinted);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="3cd49e61-ca23-4b43-89ee-c69c5b707218")
public static String es_PE_COLUMN_IsPrinted_Name="Printed";

@XendraColumn(AD_Element_ID="66795cb3-a608-19bb-8cde-40abe30a0130",ColumnName="IsPrinted",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3cd49e61-ca23-4b43-89ee-c69c5b707218",
Synchronized="2019-08-30 22:21:22.0")
/** Column name IsPrinted */
public static final String COLUMNNAME_IsPrinted = "IsPrinted";
/** Set Shipment/Receipt.
@param M_InOut_ID Material Shipment Document */
public void setM_InOut_ID (int M_InOut_ID)
{
if (M_InOut_ID <= 0) set_Value (COLUMNNAME_M_InOut_ID, null);
 else 
set_Value (COLUMNNAME_M_InOut_ID, Integer.valueOf(M_InOut_ID));
}
/** Get Shipment/Receipt.
@return Material Shipment Document */
public int getM_InOut_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_InOut_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0574962e-9b1a-479d-99e6-ef317c37c0fe")
public static String es_PE_COLUMN_M_InOut_ID_Name="Shipment/Receipt";

@XendraColumn(AD_Element_ID="5c1a0edf-01a0-832e-098b-d49510db71db",ColumnName="M_InOut_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0574962e-9b1a-479d-99e6-ef317c37c0fe",
Synchronized="2019-08-30 22:21:22.0")
/** Column name M_InOut_ID */
public static final String COLUMNNAME_M_InOut_ID = "M_InOut_ID";
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

@XendraTrl(Identifier="7cc0daea-cea4-4fa2-a4e4-0d9ac10d2c2b")
public static String es_PE_COLUMN_PayAmt_Name="Payment amount";

@XendraColumn(AD_Element_ID="9e9a0ba1-2d71-67e7-e0f1-0309fd537c8b",ColumnName="PayAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7cc0daea-cea4-4fa2-a4e4-0d9ac10d2c2b",
Synchronized="2019-08-30 22:21:22.0")
/** Column name PayAmt */
public static final String COLUMNNAME_PayAmt = "PayAmt";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value != null && Value.length() > 40)
{
log.warning("Length > 40 - truncated");
Value = Value.substring(0,39);
}
set_Value (COLUMNNAME_Value, Value);
}
/** Get Search Key.
@return Search key for the record in the format required - must be unique */
public String getValue() 
{
String value = (String)get_Value(COLUMNNAME_Value);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="902b80f8-3168-4278-b855-79ab432c1cb9")
public static String es_PE_COLUMN_Value_Name="Search Key";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="902b80f8-3168-4278-b855-79ab432c1cb9",
Synchronized="2019-08-30 22:21:22.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
/** Set Write-off Amount.
@param WriteOffAmt Amount to write-off */
public void setWriteOffAmt (BigDecimal WriteOffAmt)
{
set_Value (COLUMNNAME_WriteOffAmt, WriteOffAmt);
}
/** Get Write-off Amount.
@return Amount to write-off */
public BigDecimal getWriteOffAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_WriteOffAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="6193ebe2-3752-44d8-a3a0-d47a663a841f")
public static String es_PE_COLUMN_WriteOffAmt_Name="Write-off Amount";

@XendraColumn(AD_Element_ID="5f70c6d6-fd9f-549c-363e-80eaef7df1c7",ColumnName="WriteOffAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6193ebe2-3752-44d8-a3a0-d47a663a841f",
Synchronized="2019-08-30 22:21:22.0")
/** Column name WriteOffAmt */
public static final String COLUMNNAME_WriteOffAmt = "WriteOffAmt";
/** Set WriteOffType.
@param WriteOffType WriteOffType */
public void setWriteOffType (String WriteOffType)
{
if (WriteOffType != null && WriteOffType.length() > 1)
{
log.warning("Length > 1 - truncated");
WriteOffType = WriteOffType.substring(0,0);
}
set_Value (COLUMNNAME_WriteOffType, WriteOffType);
}
/** Get WriteOffType.
@return WriteOffType */
public String getWriteOffType() 
{
return (String)get_Value(COLUMNNAME_WriteOffType);
}

@XendraTrl(Identifier="5430bc09-53a7-4402-a5eb-c8a7764bb0dc")
public static String es_PE_COLUMN_WriteOffType_Name="WriteOffType";

@XendraColumn(AD_Element_ID="a3610896-3017-4b8c-9f1f-e21361226f89",ColumnName="WriteOffType",
AD_Reference_ID=17,AD_Reference_Value_ID="c41b3d42-db96-44ab-af5b-5fac4c7465e6",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5430bc09-53a7-4402-a5eb-c8a7764bb0dc",Synchronized="2019-08-30 22:21:22.0")
/** Column name WriteOffType */
public static final String COLUMNNAME_WriteOffType = "WriteOffType";
}
