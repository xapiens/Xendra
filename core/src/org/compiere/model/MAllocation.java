package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Properties;

import org.compiere.model.persistence.X_C_BOE;
import org.compiere.model.persistence.X_C_DocType;
import org.compiere.model.persistence.X_C_Invoice;
import org.compiere.model.persistence.X_C_Payment;
import org.compiere.model.persistence.X_C_Retention;
import org.compiere.process.DocAction;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Util;


/**
 *	MAllocation
 *	
 *  @author xapiens
 *  @version $Id: MCash.java 4083 2012-03-30 01:16:17Z xapiens $
 *  
 *  
 * no es necesario convertir pues al jalar una factura en moneda diferente automaticamente xendra 
 * lo convierte a la moneda de la caja. 
 *  
 */

public class MAllocation {

	private MAllocationHdr hdr = null;
	private static String AD_User_Name = Env.getContext(Env.getCtx(), "#AD_User_Name");
	private static Properties ctx = Env.getCtx();
	private MBOE m_boe;
	private MPayment m_pay;
	private MCash m_cash;
	private String m_processMsg = "";

	public boolean addHeader(MCash cash, Timestamp dateTrx,
			Timestamp dateAcct, int C_Currency_ID, String trxName) {
		m_cash = cash;
		return addHeader(cash.getAD_Org_ID(), dateTrx, dateAcct, C_Currency_ID, trxName);
	}

	public Boolean addHeader(Integer AD_Org_ID, Timestamp dateTrx, 
			Timestamp dateAcct, int C_Currency_ID,
			String trxName) {
		hdr = new MAllocationHdr (Env.getCtx(), true /* is manual */ ,dateTrx, C_Currency_ID, AD_User_Name, trxName);
		hdr.setDateAcct(dateAcct);
		hdr.setAD_Org_ID(AD_Org_ID);
		return hdr.save();
	}
	
	public Boolean addHeader(MBOE boe, Timestamp dateTrx, 
			Timestamp dateAcct, int C_Currency_ID, String trxName) {
		m_boe = boe;
		return addHeader(boe.getAD_Org_ID(), dateTrx, dateAcct, C_Currency_ID, trxName);
	}

	public Boolean addHeader(MPayment pay, Timestamp dateTrx, 
			Timestamp dateAcct, int C_Currency_ID, String trxName) {
		m_pay = pay;
		return addHeader(pay.getAD_Org_ID(), dateTrx, dateAcct, C_Currency_ID, trxName);
	}
	
	public Boolean addLine(MPayment pay, BigDecimal invAmt, MBOE boe) {

		return createLine(pay.isReceipt() ? invAmt : invAmt.negate() , 
				  pay.getDiscountAmt(), 
				  pay.getWriteOffAmt(), 
				  pay.getOverUnderAmt(),
				  pay.getC_Payment_ID(),
				  0, // C_PaymentLine
				  0,
				  0,
				  boe.getC_BOE_ID(),
				  0,
				  pay.getC_BPartner_ID(),
				  pay.getC_Currency_ID(),
				  pay.getC_Project_ID(),
				  pay.getC_ConversionType_ID(),
				  "",
				  boe.getDocumentNo(),
				  X_C_BOE.Table_ID,
				  boe.getC_BOE_ID());								
	}

	public Boolean addLine(MBOE boe, BigDecimal invAmt, BigDecimal DiscountAmt, BigDecimal WriteOffAmt, BigDecimal OverUnderAmt, int TableID, int RecordID) {
		Boolean ok = false;
		if (m_pay == null)
		{
			ok = createLine( invAmt  , 
					DiscountAmt, 
					WriteOffAmt, 
					OverUnderAmt,
					0, // C_Payment_ID
					0, // C_PaymentLine_ID
					0,
					0,
					boe.getC_BOE_ID(),
					0,
					boe.getC_BPartner_ID(),
					boe.getC_Currency_ID(),
					boe.getC_Project_ID(),
					boe.getC_ConversionType_ID(),
					"",
					boe.getDocumentNo(),
					TableID,
					RecordID);
		}
		else
		{
			ok = createLine(m_pay.isReceipt() ? invAmt : invAmt.negate() , 
					DiscountAmt, 
					WriteOffAmt, 
					OverUnderAmt,
					m_pay.getC_Payment_ID(),
					0, // C_PaymentLine_ID
					0,
					0,
					boe.getC_BOE_ID(),
					0,
					m_pay.getC_BPartner_ID(),
					m_pay.getC_Currency_ID(),
					m_pay.getC_Project_ID(),
					m_pay.getC_ConversionType_ID(),
					"",
					boe.getDocumentNo(),
					TableID,
					RecordID);
		}
		return ok;		
	}
	
	public Boolean addLine(MBOE boe, BigDecimal invAmt, BigDecimal DiscountAmt, BigDecimal WriteOffAmt, BigDecimal OverUnderAmt) {
		return addLine(boe, invAmt, DiscountAmt, WriteOffAmt, OverUnderAmt,0,0);
	}
	
	public Boolean addLine(	MInvoice invoice, 
							BigDecimal invAmt,							
							BigDecimal DiscountAmt, 
							BigDecimal WriteOffAmt, 
							BigDecimal OverUnderAmt)
	{
		BigDecimal WithholdingAmt = Env.ZERO;
		if (invoice.getWithholdingAmt().signum() > 0)
		{
			BigDecimal whAmt = invoice.getWithholdingAmt();
			BigDecimal GrandTotal = invoice.getGrandTotal();
			BigDecimal whPct = whAmt.divide(GrandTotal, BigDecimal.ROUND_HALF_UP);
			whPct = whPct.multiply(Env.ONEHUNDRED);
			if (whPct.signum() > 0)
			{
				WithholdingAmt = invAmt; 
				invAmt = invAmt.multiply(Env.ONEHUNDRED);
				invAmt = invAmt.divide(Env.ONEHUNDRED.add(whPct), BigDecimal.ROUND_HALF_UP);
				WithholdingAmt = WithholdingAmt.subtract(invAmt); 
			}								
		}																						
		Boolean ok = false;
		if (m_pay == null)
		{
			ok = createLine(invAmt , 
					WithholdingAmt,
					DiscountAmt, 
					WriteOffAmt, 
					OverUnderAmt,
					0, // C_Payment_ID
					0, // C_PaymentLine_ID
					0,
					invoice.getC_Invoice_ID(),
					0,
					0,
					invoice.getC_BPartner_ID(),
					invoice.getC_Currency_ID(),
					invoice.getC_Project_ID(),
					invoice.getC_ConversionType_ID(),
					invoice.getSerial(),
					invoice.getDocumentNo(),
					0,
					0);			
		}
		else
		{
			ok = createLine(invAmt,
					WithholdingAmt,
					DiscountAmt, 
					WriteOffAmt, 
					OverUnderAmt,
					m_pay.getC_Payment_ID(),
					0, // C_PaymentLine_ID
					0,
					invoice.getC_Invoice_ID(),
					0,
					0,
					m_pay.getC_BPartner_ID(),
					invoice.getC_Currency_ID(),
					invoice.getC_Project_ID(),
					invoice.getC_ConversionType_ID(),
					invoice.getSerial(),
					invoice.getDocumentNo(),
					0,
					0);
		}
		return ok;
	}
	
	public Boolean addline(MPayment pay, BigDecimal invAmt, MInvoice invoice) 
	{
		return createLine(pay.isReceipt() ? invAmt : invAmt.negate() , 
				  pay.getDiscountAmt(), 
				  pay.getWriteOffAmt(), 
				  pay.getOverUnderAmt(),
				  pay.getC_Payment_ID(),
				  0, // C_PaymentLine_ID
				  0,
				  invoice.getC_Invoice_ID(),
				  0,
				  0,
				  pay.getC_BPartner_ID(),
				  pay.getC_Currency_ID(),
				  invoice.getC_Project_ID(),
				  pay.getC_ConversionType_ID(),
				  invoice.getSerial(),
				  invoice.getDocumentNo(),
				  X_C_Invoice.Table_ID,
				  invoice.getC_Invoice_ID());								
	}

	public Boolean addLine(MPayment pay, 
			BigDecimal invAppliedAmt, BigDecimal invDiscountAmt,
			BigDecimal invWriteOffAmt, BigDecimal invOverUnderAmt,
			Boolean IsInvoice, Integer C_Invoice_ID) {

		return createLine(invAppliedAmt, 
				  invDiscountAmt, 
				  invWriteOffAmt, 
				  invOverUnderAmt,
				  0,
				  0, // C_PaymentLine_ID
				  0,
				  IsInvoice ? C_Invoice_ID : 0,
				  IsInvoice ? 0 : C_Invoice_ID,
				  0,
				  pay.getC_BPartner_ID(),
				  pay.getC_Currency_ID(),
				  pay.getC_Project_ID(),
				  pay.getC_ConversionType_ID(),
				  "",
				  pay.getDocumentNo(),
				  X_C_Payment.Table_ID,
				  pay.getC_Payment_ID());								
	}

	public Boolean addLine(BigDecimal invAppliedAmt, BigDecimal invDiscountAmt,
			BigDecimal invWriteOffAmt, BigDecimal invOverUnderAmt) {

		return createLine(invAppliedAmt, 
				  invDiscountAmt, 
				  invWriteOffAmt, 
				  invOverUnderAmt,
				  0,
				  0, // C_PaymentLine_ID
				  0,
				  0,
				  0,
				  0,
				  m_pay.getC_BPartner_ID(),
				  m_pay.getC_Currency_ID(),
				  m_pay.getC_Project_ID(),
				  m_pay.getC_ConversionType_ID(),
				  "",
				  m_pay.getDocumentNo(),
				  X_C_Payment.Table_ID,
				  m_pay.getC_Payment_ID());								
	}
		
	public Boolean addLine(MCashLine line, BigDecimal overUnderAmt, MInvoice invoice) {

		if (invoice == null)
			return false;
				
		return createLine(line.getAmount(), 
				  line.getWithholdingAmt(),
				  line.getDiscountAmt(), 
				  line.getWriteOffAmt(), 
				  overUnderAmt,
				  0 /*�C_Payment_ID */,
				  0, // C_PaymentLine_ID
				  0 /* C_Charge_ID */,
				  line.getC_Invoice_ID(),
				  0 /* BOE */,
				  line.getC_CashLine_ID(),
				  line.getC_BPartner_ID(),
				  line.getC_Currency_ID(),
				  line.getC_Project_ID(),
				  line.getC_ConversionType_ID(),
				  invoice.getSerial(),
				  invoice.getDocumentNo(),
				  X_C_Invoice.Table_ID,
				  invoice.getC_Invoice_ID());						
	}

	public Boolean addLine(MCashLine line) {
		return createLine(line.getAmount(), 
				  line.getDiscountAmt(), 
				  line.getWriteOffAmt(), 
				  Env.ZERO,
				  0 /* C_Payment_ID */,
				  0, // C_PaymentLine_ID
				  line.getC_Charge_ID(),
				  0,
				  0,
				  line.getC_CashLine_ID(),
				  line.getC_BPartner_ID(),
				  line.getC_Currency_ID(),
				  line.getC_Project_ID(),
				  line.getC_ConversionType_ID(),
				  "",
				  "",
				  0,
				  0);						
	}
	
	public Boolean addLine(MRetention line) {
		return createLine(line.getTaxAmt(), 
				  Env.ZERO, 
				  Env.ZERO, 
				  Env.ZERO,
				  0 /* C_Payment_ID */,
				  0, // C_PaymentLine_ID
				  0 /* C_Charge_ID */,
				  line.getC_Invoice_ID(),
				  0,
				  0 /* CashLine_ID */,
				  line.getC_BPartner_ID(),
				  line.getC_Currency_ID(),
				  0 /* C_Project_ID */,
				  line.getC_ConversionType_ID(),
				  "",
				  "",
				  X_C_Retention.Table_ID,
				  line.getC_Retention_ID());						
	}	
	public Boolean addLine(MCashLine line, BigDecimal overUnderAmt, MBOE boe) {

		if (boe == null)
			return false;
		
		return createLine(line.getAmount(), 
						  line.getDiscountAmt(), 
						  line.getWriteOffAmt(), 
						  overUnderAmt,
						  0, /* C_Payment_ID */
						  0, // C_PaymentLine_ID
						  0,
						  line.getC_Invoice_ID(),
						  line.getC_BOE_ID(),
						  line.getC_CashLine_ID(),
						  line.getC_BPartner_ID(),
						  line.getC_Currency_ID(),
						  line.getC_Project_ID(),
						  line.getC_ConversionType_ID(),
						  "",
						  boe.getDocumentNo(),
						  0, //X_C_BOE.Table_ID,
						  0 ); // boe.getC_BOE_ID()				
	}
	public boolean addLine(MBOE boe, int c_Currency_ID,
			BigDecimal Amount, BigDecimal DiscountAmt, BigDecimal writeOffAmt, BigDecimal overUnderAmt, int TableID, int RecordID) {

		if (m_boe == null || m_cash == null)
			return false;
		
		return createLine(boe.isSOTrx() ? Amount : Amount.negate(),
				  DiscountAmt,
				  writeOffAmt,
				  overUnderAmt,
				  0, /* C_Payment_ID */
				  0, // C_PaymentLine_ID
				  0,
				  0,
				  boe.getC_BOE_ID(),
				  0,
				  m_boe.getC_BPartner_ID(),
				  m_cash.getC_Currency_ID(),
				  m_boe.getC_Project_ID(),
				  m_boe.getC_ConversionType_ID(),
				  "",
				  m_boe.getDocumentNo(),
				  X_C_BOE.Table_ID,
				  m_boe.getC_BOE_ID());	
	
	}	
	public boolean addLine(MBOE boe, int c_Currency_ID,
			BigDecimal Amount, BigDecimal DiscountAmt, BigDecimal writeOffAmt, BigDecimal overUnderAmt) {
		return addLine(boe, c_Currency_ID, Amount, DiscountAmt, writeOffAmt, overUnderAmt,0 , 0);
	}
	
	public boolean addLine(MBOELine boeline, int c_Currency_ID,
			BigDecimal DiscountAmt, BigDecimal writeOffAmt, BigDecimal overUnderAmt,
			 int C_Invoice_ID) {
		
		if (m_boe == null)
			return false;
		
		return createLine(m_boe.isSOTrx() ? boeline.getAmount() : boeline.getAmount().negate(),
						  DiscountAmt,
						  writeOffAmt,
						  overUnderAmt,
						  0, /* C_Payment_ID */
						  0, // C_PaymentLine_ID
						  0,
						  boeline.getC_Invoice_ID(),
						  boeline.getRef_BOE_ID(),
						  0,
						  m_boe.getC_BPartner_ID(),
						  boeline.getC_Currency_ID(),
						  m_boe.getC_Project_ID(),
						  m_boe.getC_ConversionType_ID(),
						  "",
						  m_boe.getDocumentNo(),
						  X_C_BOE.Table_ID,
						  m_boe.getC_BOE_ID());		
	}

	
	public Boolean addline(MInvoice inv, int C_Currency_ID,
			BigDecimal invAppliedAmt, BigDecimal invDiscountAmt,
			BigDecimal invWriteOffAmt, BigDecimal invOverUnderAmt,
			Boolean IsInvoice, Integer C_Invoice_ID) {

		return createLine(invAppliedAmt, 
				  invDiscountAmt, 
				  invWriteOffAmt, 
				  invOverUnderAmt,
				  0, /* C_Payment_ID */
				  0, // C_PaymentLine_ID
				  0,
				  IsInvoice ? C_Invoice_ID : 0,
				  IsInvoice ? 0 : C_Invoice_ID,
				  0,
				  inv.getC_BPartner_ID(),
				  C_Currency_ID,
				  inv.getC_Project_ID(),
				  inv.getC_ConversionType_ID(),
				  inv.getSerial(),
				  inv.getDocumentNo(),
				  X_C_Invoice.Table_ID,
				  inv.getC_Invoice_ID());						
	}

	public Boolean createLine( BigDecimal Amt, 
			   BigDecimal discountAmt, 
			   BigDecimal writeoffAmt, 
			   BigDecimal overUnderAmt,
			   int C_Payment_ID,
			   int C_PaymentLine_ID,
			   int C_Charge_ID,
			   int C_Invoice_ID, int C_BOE_ID, int C_CashLine_ID, int C_BPartner_ID, int C_Currency_ID, int C_Project_ID, 
			   int C_ConversionType_ID, String Serial, String DocumentNo, int Table_ID, int Record_ID)
	{
		return createLine(Amt, Env.ZERO, discountAmt, writeoffAmt, overUnderAmt, 
				C_Payment_ID, C_PaymentLine_ID, C_Charge_ID, C_Invoice_ID ,  C_BOE_ID, C_CashLine_ID, C_BPartner_ID, C_Currency_ID,
				C_Project_ID, C_ConversionType_ID, Serial, DocumentNo, Table_ID, Record_ID);
	}
	
	public Boolean createLine( BigDecimal Amt, 
						       BigDecimal WithholdingAmt, 
							   BigDecimal discountAmt, 
							   BigDecimal writeoffAmt, 
							   BigDecimal overUnderAmt,
							   int C_Payment_ID,
							   int C_PaymentLine_ID,
							   int C_Charge_ID,
							   int C_Invoice_ID, int C_BOE_ID, int C_CashLine_ID, int C_BPartner_ID, int C_Currency_ID, int C_Project_ID, 
							   int C_ConversionType_ID, String Serial, String DocumentNo, int Table_ID, int Record_ID)
	{							
		MAllocationLine aLine = new MAllocationLine (hdr, Amt, discountAmt, writeoffAmt, overUnderAmt);		
		aLine.setWithholdingAmt(WithholdingAmt);
		if (C_Payment_ID > 0)
			aLine.setC_Payment_ID(C_Payment_ID);
		if (C_PaymentLine_ID > 0)
			aLine.setC_PaymentLine_ID(C_PaymentLine_ID);
		if (C_Charge_ID > 0)
			aLine.setC_Charge_ID(C_Charge_ID);
		if (C_Invoice_ID > 0)
			aLine.setC_Invoice_ID(C_Invoice_ID);
		if (C_BOE_ID > 0)
		{			
			MBOE boe = MBOE.get(Env.getCtx(), C_BOE_ID);
			if (boe.getC_BOE_ID() > 0)
			{
				MBOELine[] lines = boe.getLines(true);
				for (MBOELine line:lines)
				{
					if (line.getC_Invoice_ID() > 0)
					{						
						BigDecimal WithholdingAmtInvoice = DB.getSQLValueBD(hdr.get_TrxName(), "SELECT withHoldingAmt from C_Invoice where C_Invoice_ID = ?", line.getC_Invoice_ID());
						if (WithholdingAmtInvoice == null)
							WithholdingAmtInvoice = Env.ZERO;
						if (WithholdingAmtInvoice.signum() > 0)
						{						
							BigDecimal GrandTotal = DB.getSQLValueBD(hdr.get_TrxName(), "SELECT GrandTotal from C_Invoice where C_Invoice_ID = ?", line.getC_Invoice_ID());
							if (GrandTotal == null)
								GrandTotal = Env.ZERO;
							
							BigDecimal WithholdingPercent = Env.ZERO;
							if (WithholdingAmtInvoice.signum() > 0 && GrandTotal.signum() > 0)		
							{
								WithholdingPercent = WithholdingAmtInvoice.divide(GrandTotal, BigDecimal.ROUND_HALF_UP);
								WithholdingPercent = WithholdingPercent.multiply(Env.ONEHUNDRED);
								if (WithholdingPercent.signum() > 0)
								{
									MInvoice invoice = MInvoice.get(Env.getCtx(), line.getC_Invoice_ID());
									Amt = line.getAmount();
									
									WithholdingAmt = Amt; 
									Amt = Amt.multiply(Env.ONEHUNDRED);
									Amt = Amt.divide(Env.ONEHUNDRED.add(WithholdingPercent), BigDecimal.ROUND_HALF_UP);
									WithholdingAmt = WithholdingAmt.subtract(Amt); 									
																											
									MWithholdingHdr.addInvoice(invoice, Amt, boe.getC_BOE_ID(), hdr.getDateTrx(), WithholdingAmt,X_C_Invoice.Table_ID,line.getC_Invoice_ID(), hdr.get_TrxName());
								}
							}														
						}
					}
				}
				aLine.setC_BOE_ID(C_BOE_ID);
			}
		}
		if (C_CashLine_ID >  0)
			aLine.setC_CashLine_ID(C_CashLine_ID);
		if (C_BPartner_ID > 0)
			aLine.setC_BPartner_ID(C_BPartner_ID);
		if (C_Currency_ID > 0)
			aLine.setC_Currency_ID(C_Currency_ID);
		if (C_Project_ID > 0)
			aLine.setC_Project_ID(C_Project_ID);
		if (C_ConversionType_ID > 0)
			aLine.setC_ConversionType_ID(C_ConversionType_ID);
		if (Serial != null && Serial.length() > 0)
			aLine.setSerial(Serial);
		if (DocumentNo != null && DocumentNo.length() > 0)
			aLine.setRefDocumentNo(DocumentNo);
		if (Table_ID > 0)
			aLine.setAD_Table_ID(Table_ID);
		if (Record_ID > 0)
			aLine.setRecord_ID(Record_ID);
		return aLine.save();
	}

	public Boolean completeIt() {
		//	Should start WF
		if (hdr != null && hdr.get_ID() != 0)
		{
			if (hdr.processIt(DocAction.ACTION_Complete))
				return hdr.save();
			else
				m_processMsg += hdr.getProcessMsg();
		}		
		return false;
	}
	
	/**
	 * 	Get Process Message
	 *	@return clear text error message
	 */
	public String getProcessMsg()
	{
		return m_processMsg;
	}	//	getProcessMsg

	
	public int getC_AllocationHdr_ID() {
		if (hdr != null)
			return hdr.getC_AllocationHdr_ID();
		else
			return 0;
	}
	public static MAllocation get(int c_AllocationHdr_ID, String TrxName) {
		MAllocation alloc = null;
		MAllocationHdr allochdr = new MAllocationHdr(Env.getCtx(), c_AllocationHdr_ID, TrxName);
		if (allochdr.getC_AllocationHdr_ID() > 0)
		{
			alloc = new MAllocation();
			alloc.setHeader(allochdr);
		}
		return alloc;
	}
	private void setHeader(MAllocationHdr allochdr) {
		hdr = allochdr;		
	}

	public int getC_Currency_ID() {
		if (hdr != null)
			return hdr.getC_Currency_ID();		
		return 0;
	}

	public void setC_GroupDoc_ID(int C_GroupDoc_ID) {
		if (hdr != null)
			hdr.setC_GroupDoc_ID(C_GroupDoc_ID);
	}

	public boolean save() {
		if (hdr != null)
			return hdr.save();
		return false;
	}
	public String getDocumentNo() {
		if (hdr != null)
			return hdr.getDocumentNo();
		return null;
	}
	public Boolean addLine(MPaymentLine paymentline) {
		//Boolean IsCreditMemo = false;
		Integer C_Invoice_ID = 0;
		Integer C_BOE_ID = 0;
		Integer C_BPartner_ID = 0;
		Integer Table_ID = 0;
		Integer Record_ID = 0;
		String Serial = "";
		String DocumentNo = "";
		
		BigDecimal WithholdingAmt = Env.ZERO;
		
		if (paymentline.getGL_JournalLine_ID() ==  0)
		{
			C_BPartner_ID = paymentline.getC_BPartner_ID();
		}
		else
		{
			C_BPartner_ID = m_pay.getC_BPartner_ID();
		}
		if (paymentline.getC_Charge_ID() == 0)
		{
			C_Invoice_ID = paymentline.getC_Invoice_ID();
			C_BOE_ID = paymentline.getC_BOE_ID();
		}
		if (C_Invoice_ID > 0)
		{
			MInvoice invmemo = MInvoice.get(Env.getCtx(), C_Invoice_ID, paymentline.get_TrxName());
			if ( (invmemo.isSOTrx() && m_pay.isReceipt()) ||
				 (!invmemo.isSOTrx() && !m_pay.isReceipt())	)
			{			
				//IsCreditMemo = invmemo.isCreditMemo();
				Serial = invmemo.getSerial();
				DocumentNo = invmemo.getDocumentNo();
				Table_ID = X_C_Invoice.Table_ID;
				Record_ID = invmemo.getC_Invoice_ID();
				if (invmemo.isSOTrx() && m_pay.isReceipt())
				{
					WithholdingAmt = paymentline.getWithholdingAmt();
				}
			}
			else 
			{
				// return
			}
		}
		
		return createLine(
				  //IsCreditMemo ? paymentline.getPayAmt().negate() : paymentline.getPayAmt(),
				  paymentline.getPayAmt(),			
				  WithholdingAmt, // no jalamos directamente paymentline.WithholdingAmt porque no se contempla todas las interacciones aun
				  paymentline.getDiscountAmt(), 
				  paymentline.getWriteOffAmt(), 
				  paymentline.getOverUnderAmt(),
				  m_pay.getC_Payment_ID(), /* C_Payment_ID */
				  paymentline.getC_PaymentLine_ID(),
				  paymentline.getC_Charge_ID(),
				  C_Invoice_ID,
				  C_BOE_ID,
				  0 /* C_CashLine_ID */,
				  C_BPartner_ID,
				  paymentline.getC_Currency_ID(),
				  m_pay.getC_Project_ID(),
				  paymentline.getC_ConversionType_ID(),
				  Serial,
				  DocumentNo, 
				  Table_ID,
				  Record_ID);						
// viene del MPayment.allocateIt() 		
//		if (paymentline.getC_Charge_ID() != 0)
//		{
//			aLine = new MAllocationLine (alloc, paymentline.getPayAmt(), 
//					paymentline.getDiscountAmt(), paymentline.getWriteOffAmt(), paymentline.getOverUnderAmt());				
//		}
//		else if (isReceipt())
//			if (paymentline.getC_Invoice_ID() != 0)
//			{
//				MInvoice invoice = MInvoice.get(Env.getCtx(), paymentline.getC_Invoice_ID());
//				MDocType docType = MDocType.get(Env.getCtx(), invoice.getC_DocType_ID());
//				if (docType.getDocBaseType().compareTo(REF_C_DocTypeDocBaseType.ARCreditMemo) == 0)
//				{
//					aLine = new MAllocationLine (alloc, paymentline.getPayAmt().abs().negate(), 
//							paymentline.getDiscountAmt().abs().negate(), paymentline.getWriteOffAmt().abs().negate(), paymentline.getOverUnderAmt().abs().negate());							
//				}
//				else
//				{
//					aLine = new MAllocationLine (alloc, paymentline.getPayAmt().abs(), 
//							paymentline.getDiscountAmt().abs(), paymentline.getWriteOffAmt().abs(), paymentline.getOverUnderAmt().abs());
//				}
//			}
//			else
//			{
//				aLine = new MAllocationLine (alloc, paymentline.getPayAmt().abs(), 
//						paymentline.getDiscountAmt().abs(), paymentline.getWriteOffAmt().abs(), paymentline.getOverUnderAmt().abs());						
//			}
//		else
//		{
//			if (paymentline.getC_Invoice_ID() != 0)
//			{
//				MInvoice invoice = MInvoice.get(Env.getCtx(), paymentline.getC_Invoice_ID());
//				if (!invoice.getDocStatus().equals(DocAction.STATUS_Completed))
//				{
//					m_processMsg = "La factura "+(invoice.getSerial() != null ? invoice.getSerial()+"-"+invoice.getDocumentNo() : invoice.getDocumentNo()) +" no esta completada";
//					return false;
//				}
//				MDocType docType = MDocType.get(Env.getCtx(), invoice.getC_DocType_ID());
//				if (docType.getDocBaseType().compareTo(REF_C_DocTypeDocBaseType.APCreditMemo) == 0)
//				{
//					aLine = new MAllocationLine (alloc, paymentline.getPayAmt().abs(), 
//							paymentline.getDiscountAmt().abs(), paymentline.getWriteOffAmt().abs(), paymentline.getOverUnderAmt().abs());					
//				}
//				else
//				{
//					aLine = new MAllocationLine (alloc, paymentline.getPayAmt().abs().negate(), 
//							paymentline.getDiscountAmt().abs().negate(), paymentline.getWriteOffAmt().abs().negate(), paymentline.getOverUnderAmt().abs().negate());												
//				}
//			}
//			else
//			{
//				aLine = new MAllocationLine (alloc, paymentline.getPayAmt().abs().negate(), 
//					paymentline.getDiscountAmt().abs().negate(), paymentline.getWriteOffAmt().abs().negate(), paymentline.getOverUnderAmt().abs().negate());					
//			}				
//		}
//		//aLine.setDocInfo(paymentline.getC_BPartner_ID(), 0, paymentline.getC_Invoice_ID());
//		//aLine.setPaymentInfo(getC_Payment_ID(), 0);
//		
//		if (paymentline.getC_BOE_ID() != 0 && paymentline.getC_Charge_ID() == 0 )
//		{
//			aLine.setC_BOE_ID(paymentline.getC_BOE_ID());
//			aLine.setC_BPartner_ID(paymentline.getC_BPartner_ID());
//		}
//		else if (paymentline.getC_Invoice_ID() != 0 && paymentline.getC_Charge_ID() == 0)
//		{
//			aLine.setC_Invoice_ID(paymentline.getC_Invoice_ID());
//			aLine.setC_BPartner_ID(paymentline.getC_BPartner_ID());
//		}
//		else if (paymentline.getC_Charge_ID() != 0)
//		{
//			aLine.setC_Charge_ID(paymentline.getC_Charge_ID());
//			aLine.setC_BPartner_ID(paymentline.getC_BPartner_ID());					
//		}
//		else if (paymentline.getGL_JournalLine_ID() != 0)
//		{
//			aLine.setGL_JournalLine_ID(paymentline.getGL_JournalLine_ID());
//			aLine.setC_BPartner_ID(getC_BPartner_ID());
//		}
//		// no deberia grabarse el payment_id xq asume que es un payment y eso genera que instancie un payment.
//		// cuando deberia instanciar un payment line.
//		// -- 
//		// bueno se debe grabar para referencia, no hay de otra.
//		// considerar primero el paymentline en el allocation al contabilizar
//                        //aLine.setC_Project_ID(paymentline.getC_Project_ID());
//		aLine.setC_Payment_ID(getC_Payment_ID());
//		aLine.setC_Currency_ID(paymentline.getC_Currency_ID());
//		aLine.setC_PaymentLine_ID(paymentline.getC_PaymentLine_ID());
//		if (!aLine.save(get_TrxName()))
//			log.warning("Payment Line - line not saved");
//		else
//		{
//			paymentline.setProcessed(true);
//			paymentline.setC_AllocationLine_ID(aLine.getC_AllocationLine_ID());
//			paymentline.saveEx();
//		}
		
	}
	public MPayment getPayment() {
		return m_pay;
	}
	public Boolean setIsExchange(boolean exchange) {
		if (hdr != null)
		{
			hdr.setIsExchange(exchange);
			return hdr.isExchange() == exchange;
		}
		return false;
	}
	public void setHeaderBOE(MBOE mboe) {
		m_boe = mboe;
	}
}
