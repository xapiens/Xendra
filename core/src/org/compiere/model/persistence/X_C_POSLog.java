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
import org.compiere.model.reference.REF_C_POSLogDocumentType;
/** Generated Model for C_POSLog
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_POSLog extends PO
{
/** Standard Constructor
@param ctx context
@param C_POSLog_ID id
@param trxName transaction
*/
public X_C_POSLog (Properties ctx, int C_POSLog_ID, String trxName)
{
super (ctx, C_POSLog_ID, trxName);
/** if (C_POSLog_ID == 0)
{
setC_Order_ID (0);
setC_POS_ID (0);
setC_POSLog_ID (0);
setDocumentType (null);	
// BM
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_POSLog (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000044 */
public static int Table_ID=MTable.getTable_ID("C_POSLog");

@XendraTrl(Identifier="a64865ff-3780-9900-afef-6cc15ae38a69")
public static String es_PE_TABLE_C_POSLog_Name="Registro del PDV";

@XendraTable(Name="POS Log",Description="",Help="",TableName="C_POSLog",AccessLevel="3",
AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,
IsHighVolume=true,IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="a64865ff-3780-9900-afef-6cc15ae38a69",Synchronized="2017-08-16 11:42:16.0")
/** TableName=C_POSLog */
public static final String Table_Name="C_POSLog";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_POSLog");

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
    Table_ID = MTable.getTable_ID("C_POSLog");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_POSLog[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Cash Journal Line.
@param C_CashLine_ID Cash Journal Line */
public void setC_CashLine_ID (int C_CashLine_ID)
{
if (C_CashLine_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_CashLine_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_CashLine_ID, Integer.valueOf(C_CashLine_ID));
}
/** Get Cash Journal Line.
@return Cash Journal Line */
public int getC_CashLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_CashLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2e55bd32-4b61-7eba-0bf5-c483ab4a0b43")
public static String es_PE_COLUMN_C_CashLine_ID_Name="Línea del Diario de Efectivo";

@XendraColumn(AD_Element_ID="51d71f75-4ff8-51c4-df6f-191def6be399",ColumnName="C_CashLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2e55bd32-4b61-7eba-0bf5-c483ab4a0b43",
Synchronized="2017-08-05 16:54:12.0")
/** Column name C_CashLine_ID */
public static final String COLUMNNAME_C_CashLine_ID = "C_CashLine_ID";
/** Set Invoice.
@param C_Invoice_ID Invoice Identifier */
public void setC_Invoice_ID (int C_Invoice_ID)
{
if (C_Invoice_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_Invoice_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_Invoice_ID, Integer.valueOf(C_Invoice_ID));
}
/** Get Invoice.
@return Invoice Identifier */
public int getC_Invoice_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Invoice_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4ec32876-98c8-8c58-ddff-ec6d7dfccfc6")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Factura";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4ec32876-98c8-8c58-ddff-ec6d7dfccfc6",
Synchronized="2017-08-05 16:54:12.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
/** Set Order.
@param C_Order_ID Order */
public void setC_Order_ID (int C_Order_ID)
{
if (C_Order_ID < 1) throw new IllegalArgumentException ("C_Order_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Order_ID, Integer.valueOf(C_Order_ID));
}
/** Get Order.
@return Order */
public int getC_Order_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Order_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="593e36fd-a4f3-0a18-341b-f32fcfb96d78")
public static String es_PE_COLUMN_C_Order_ID_Name="Orden de Venta";

@XendraColumn(AD_Element_ID="cc846c60-90b8-6aad-9d07-b5d0c0328787",ColumnName="C_Order_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="593e36fd-a4f3-0a18-341b-f32fcfb96d78",
Synchronized="2017-08-05 16:54:12.0")
/** Column name C_Order_ID */
public static final String COLUMNNAME_C_Order_ID = "C_Order_ID";
/** Set Payment.
@param C_Payment_ID Payment identifier */
public void setC_Payment_ID (int C_Payment_ID)
{
if (C_Payment_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_Payment_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_Payment_ID, Integer.valueOf(C_Payment_ID));
}
/** Get Payment.
@return Payment identifier */
public int getC_Payment_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Payment_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fa14ace1-9f52-6eec-47eb-b2e893cc1fc3")
public static String es_PE_COLUMN_C_Payment_ID_Name="Pago";

@XendraColumn(AD_Element_ID="3ded5658-968e-94c5-207b-eed6f6a7bb43",ColumnName="C_Payment_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fa14ace1-9f52-6eec-47eb-b2e893cc1fc3",
Synchronized="2017-08-05 16:54:12.0")
/** Column name C_Payment_ID */
public static final String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
/** Set POS Terminal.
@param C_POS_ID Point of Sales Terminal */
public void setC_POS_ID (int C_POS_ID)
{
if (C_POS_ID < 1) throw new IllegalArgumentException ("C_POS_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_POS_ID, Integer.valueOf(C_POS_ID));
}
/** Get POS Terminal.
@return Point of Sales Terminal */
public int getC_POS_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_POS_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="35b87ddc-18a1-8d94-36f0-1caf29ab4f35")
public static String es_PE_COLUMN_C_POS_ID_Name="Terminal PDV";

@XendraColumn(AD_Element_ID="c2adeeab-8099-b658-0016-5d97a32be4a2",ColumnName="C_POS_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="35b87ddc-18a1-8d94-36f0-1caf29ab4f35",
Synchronized="2017-08-05 16:54:12.0")
/** Column name C_POS_ID */
public static final String COLUMNNAME_C_POS_ID = "C_POS_ID";
/** Set POS Log.
@param C_POSLog_ID POS Log */
public void setC_POSLog_ID (int C_POSLog_ID)
{
if (C_POSLog_ID < 1) throw new IllegalArgumentException ("C_POSLog_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_POSLog_ID, Integer.valueOf(C_POSLog_ID));
}
/** Get POS Log.
@return POS Log */
public int getC_POSLog_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_POSLog_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_POSLog_ID */
public static final String COLUMNNAME_C_POSLog_ID = "C_POSLog_ID";
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

@XendraTrl(Identifier="bae9f016-b103-db52-b8d3-79f9543cc721")
public static String es_PE_COLUMN_DateTrx_Name="Fecha de la Transacción";

@XendraColumn(AD_Element_ID="3700288f-61dd-2021-b833-cf804ceed1e9",ColumnName="DateTrx",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bae9f016-b103-db52-b8d3-79f9543cc721",
Synchronized="2017-08-05 16:54:12.0")
/** Column name DateTrx */
public static final String COLUMNNAME_DateTrx = "DateTrx";

/** DocumentType AD_Reference=e8ea1223-028c-8d66-c1dd-6add02d66e6d */
public static final int DOCUMENTTYPE_AD_Reference_ID=1000015;
/** Set Document Type.
@param DocumentType Document Type */
public void setDocumentType (String DocumentType)
{
if (DocumentType == null) throw new IllegalArgumentException ("DocumentType is mandatory");
if (DocumentType.equals(REF_C_POSLogDocumentType.CashBoleta) || DocumentType.equals(REF_C_POSLogDocumentType.BoletaCredit) || DocumentType.equals(REF_C_POSLogDocumentType.InvoiceCredit) || DocumentType.equals(REF_C_POSLogDocumentType.CreditGuide) || DocumentType.equals(REF_C_POSLogDocumentType.InvoiceCash));
 else throw new IllegalArgumentException ("DocumentType Invalid value - " + DocumentType + " - Reference_ID=1000015 - BM - BC - IC - CG - IM");
if (DocumentType.length() > 2)
{
log.warning("Length > 2 - truncated");
DocumentType = DocumentType.substring(0,1);
}
set_ValueNoCheck (COLUMNNAME_DocumentType, DocumentType);
}
/** Get Document Type.
@return Document Type */
public String getDocumentType() 
{
return (String)get_Value(COLUMNNAME_DocumentType);
}

@XendraTrl(Identifier="8b9c3974-47a1-efb1-6ef3-57047269bd68")
public static String es_PE_COLUMN_DocumentType_Name="Tipo de Documento";

@XendraColumn(AD_Element_ID="c2cb07e3-e836-9e40-b0a6-af292c74b93f",ColumnName="DocumentType",
AD_Reference_ID=17,AD_Reference_Value_ID="e8ea1223-028c-8d66-c1dd-6add02d66e6d",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="BM",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8b9c3974-47a1-efb1-6ef3-57047269bd68",Synchronized="2017-08-05 16:54:12.0")
/** Column name DocumentType */
public static final String COLUMNNAME_DocumentType = "DocumentType";
/** Set Grand Total.
@param GrandTotal Total amount of document */
public void setGrandTotal (BigDecimal GrandTotal)
{
set_ValueNoCheck (COLUMNNAME_GrandTotal, GrandTotal);
}
/** Get Grand Total.
@return Total amount of document */
public BigDecimal getGrandTotal() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_GrandTotal);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="649d6be1-0be5-1646-0f76-60de4b4ab129")
public static String es_PE_COLUMN_GrandTotal_Name="Gran Total";

@XendraColumn(AD_Element_ID="ffd614c2-6ff8-c9c6-71bf-44f369675711",ColumnName="GrandTotal",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="649d6be1-0be5-1646-0f76-60de4b4ab129",
Synchronized="2017-08-05 16:54:12.0")
/** Column name GrandTotal */
public static final String COLUMNNAME_GrandTotal = "GrandTotal";
/** Set Shipment/Receipt.
@param M_InOut_ID Material Shipment Document */
public void setM_InOut_ID (int M_InOut_ID)
{
if (M_InOut_ID <= 0) set_ValueNoCheck (COLUMNNAME_M_InOut_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_M_InOut_ID, Integer.valueOf(M_InOut_ID));
}
/** Get Shipment/Receipt.
@return Material Shipment Document */
public int getM_InOut_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_InOut_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="00eef76a-ef0c-df00-56e5-ee3431d95c79")
public static String es_PE_COLUMN_M_InOut_ID_Name="Entrega / Recibo";

@XendraColumn(AD_Element_ID="5c1a0edf-01a0-832e-098b-d49510db71db",ColumnName="M_InOut_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="00eef76a-ef0c-df00-56e5-ee3431d95c79",
Synchronized="2017-08-05 16:54:12.0")
/** Column name M_InOut_ID */
public static final String COLUMNNAME_M_InOut_ID = "M_InOut_ID";
}
