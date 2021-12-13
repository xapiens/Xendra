package org.xendra.rules.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Collections;

import org.compiere.model.MCash;
import org.compiere.model.MCashBook;
import org.compiere.model.MCashLine;
import org.compiere.model.MColumn;
import org.compiere.model.MCoupon;
import org.compiere.model.MCurrency;
import org.compiere.model.MDocType;
import org.compiere.model.MInvoice;
import org.compiere.model.MInvoiceLine;
import org.compiere.model.MOrder;
import org.compiere.model.MOrderLine;
import org.compiere.model.MPayment;
import org.compiere.model.MPrinterDocumentFormat;
import org.compiere.model.MQuery;
import org.compiere.model.MTable;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_User;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachinePrinter;
import org.compiere.model.persistence.X_C_BPartner;
import org.compiere.model.persistence.X_C_Collection;
import org.compiere.model.persistence.X_C_DocType;
import org.compiere.model.persistence.X_C_DocTypeGroup;
import org.compiere.model.persistence.X_C_Invoice;
import org.compiere.model.persistence.X_C_InvoiceLine;
import org.compiere.model.persistence.X_C_Order;
import org.compiere.model.persistence.X_C_OrderLine;
import org.compiere.model.persistence.X_HR_WorkShift;
import org.compiere.model.reference.REF_C_CashTrxType;
import org.compiere.model.reference.REF_C_DocTypeDocBaseType;
import org.compiere.model.reference.REF_C_DocTypeSubType;
import org.compiere.model.reference.REF_C_OrderDeliveryViaRule;
import org.compiere.process.DocAction;
import org.compiere.process.ProcessInfo;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.compiere.util.Trx;
import org.xendra.Constants;
import org.xendra.messages.MessageProcessor;
import org.xendra.printdocument.PrintWorker;
import org.xendra.printdocument.PrinterDocumentCtrl;
import org.xendra.wf.WorkflowUtils;
import org.xendrian.rules.model.Policy;

public class SalesPolicyRequest implements Policy {
	String m_key = null;
	private enum CashType { SIMPLE, WORKSHIFT };
	CashType cashtype = CashType.SIMPLE;
	private List<X_C_DocTypeGroup> ldtg;
	private MDocType dt;

	protected CLogger	log = CLogger.getCLogger(getClass());
	private HashMap<String, List<PO>> m_tables;
	private MessageProcessor m_messageprocessor;
	private MOrder m_order;
	List<MInvoice> m_invoices = new ArrayList<MInvoice>();
	private boolean processed;

	public int getGroupCount()
	{
		int GroupCount = 0;
		if (dt == null)
			dt = MDocType.get(Env.getCtx(), getMP().getFieldInt(X_C_Order.Table_Name, X_C_Order.COLUMNNAME_C_DocTypeTarget_ID));
		String query = "C_DocType_ID = ?";
		ldtg = new Query(Env.getCtx(), X_C_DocTypeGroup.Table_Name, query, null)
		.setParameters(dt.getC_DocType_ID())
		.setOrderBy("Line")
		.list();
		if (ldtg != null)
		{
			GroupCount = ldtg.size();
		}
		return GroupCount;
	}

	private MessageProcessor getMP() {
		return m_messageprocessor;
	}

	public void GroupByBrand() {
		System.out.println("group by brand");
	}
	public void Grouping() {
		System.out.println("Grouping");
		if (ldtg == null)
			return;
		if (ldtg.size() == 0)
			return;
		// analizando agrupamiento
		List<String[]> columnorder = null;
		for (X_C_DocTypeGroup dtg:ldtg)
		{
			if (columnorder == null)
			{
				columnorder = new ArrayList<String[]>();
			}
			int AD_Table_ID = dtg.getAD_Table_ID();
			int AD_Column_ID = dtg.getAD_Column_ID();
			MTable table = MTable.get(Env.getCtx(), AD_Table_ID);
			MColumn column = MColumn.get(Env.getCtx(), AD_Column_ID);
			if (column.getAD_Table_ID() == table.getAD_Table_ID())
			{
				String[] orderfields = new String[2];
				orderfields[0] = column.getColumnName();
				orderfields[1] = dtg.isCut() ? "Y":"N";
				columnorder.add(orderfields);
			}
		}
		if (columnorder == null)
			return;
		// se procesan las lineas y luego se genera lo siguiente:
		//for (MOrderLine line:m_sales.getOrderlines())
		List<MOrderLine> lines = getMP().getRecords(X_C_OrderLine.Table_Name);
		for (MOrderLine line:lines)
			//for (MOrderLine line:getMP().getRecords(X_C_OrderLine.Table_Name))
		{
			String Hash = "";						
			for (String[] column:columnorder)
			{
				Boolean IsCut = column[column.length-1].equals("Y");
				for (String col:column)
				{
					if (col.length() > 1)
					{
						if (!IsCut)
							Hash = Hash + "[";											
						Hash = Hash + line.get_Value(col);
						if (!IsCut)
							Hash = Hash + "]";																						
					}						
				}
			}						
			line.setHash(Hash);
		}			
	}
	public void delivery()
	{
		MOrder o = getMP().getFirstRecord(X_C_Order.Table_Name);
		if (o.getDeliveryViaRule().equals(REF_C_OrderDeliveryViaRule.Delivery))
		{
			simple();		
		}
		if (o.getDeliveryViaRule().equals(REF_C_OrderDeliveryViaRule.Pickup))
		{
			o.completeIt();
		}		
		if (o.getDeliveryRule().equals(REF_C_OrderDeliveryViaRule.Shipper))
		{

		}			
	}

	public boolean processOrder() {		
		String error = "";
		Trx m_trx = Trx.get(getMP().get_TrxName(), true);		
		try {
			MOrder order = getMP().getFirstRecord(X_C_Order.Table_Name);			
			if (!order.getDocStatus().equals(DocAction.STATUS_Completed)) {
				ProcessInfo pi = WorkflowUtils.Process(order,  m_trx.getTrxName());
				if (pi.isError()) {
					m_trx.rollback();			
					throw new Exception(pi.getSummary());									
				} else {
					m_trx.commit();	
					order.load(m_trx.getTrxName());					
					setOrder(order);
				}
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
			error = e.getMessage();				
		}
		finally
		{	
			getMP().setProcessed(true);
			if (error.length() > 0)
				getMP().setErrorMsg(error);
			else {
				MOrderLine[] lines = getOrder().getLines();
				for (MOrderLine line:lines)
				{
					MInvoiceLine iline = new Query(Env.getCtx(), X_C_InvoiceLine.Table_Name, "C_OrderLine_ID = ?", m_trx.getTrxName())
					.setParameters(line.getC_OrderLine_ID()).first();
					if (iline != null)
					{
						MInvoice invoice = new MInvoice(Env.getCtx(), iline.getC_Invoice_ID(), m_trx.getTrxName());
						if (!getInvoices().contains(invoice))
							getInvoices().add(invoice);
					}
				}				
			}
			getMP().saveMessage();
			m_trx.commit();
		}				
		return error.length() == 0;
	}

	private void setOrder(MOrder order) {
		m_order = order;
	}
	private MOrder getOrder() {
		return m_order;
	}

	private List<MInvoice> getInvoices() 
	{ 
		return m_invoices;
	}

	public void setCashSimple() {		
		cashtype = CashType.SIMPLE;
	}

	public void setCashByWorkShift() {
		cashtype = CashType.WORKSHIFT;
	}
	public void payment() {
		Trx m_trx = Trx.get(getMP().get_TrxName(), true);		
		if (getInvoices().size() > 0)
		{
			PayInvoices();
			Collections.sort(getInvoices(), new Comparator<MInvoice>() {
				public int compare(MInvoice o1, MInvoice o2) {
					return o1.getDocumentNo().compareTo(o2.getDocumentNo());								            
				}
			});								
			//			for (MInvoice invoice:getInvoices())
			//			{
			//				String doc = invoice.getDocumentNo();
			//			}
		}							
	}

	public void print() {
		MOrder order = getOrder();
		MDocType dt = MDocType.get(Env.getCtx(), order.getC_DocType_ID());
		if (dt.getDocBaseType().equals(REF_C_DocTypeDocBaseType.SalesOrder)) {
			if (dt.getDocSubType().equals(REF_C_DocTypeSubType.Proposal)) {
				print(order);
			} else if (dt.getDocSubType().equals(REF_C_DocTypeSubType.Quotation)) {
				print(order);
			} else if (dt.getDocSubType().equals(REF_C_DocTypeSubType.POSOrder)) {
				printInvoices();
			}
		}		
	}

	public void printInvoices() {
		Trx m_trx = Trx.get(getMP().get_TrxName(), true);
		for (MInvoice invoice:getInvoices())
		{					
			MDocType dt = new Query(Env.getCtx(), X_C_DocType.Table_Name, "C_DocType_ID = ?", m_trx.getTrxName())
			.setParameters(invoice.getC_DocType_ID()).first();
			if (!invoice.isPrinted() && dt.isPrintOnComplete())
			{
				System.out.println(String.format("Invoice %s %s",invoice.getSerial(),invoice.getDocumentNo()));
				String error = print(invoice);
				if (error == null) {
					error = "exception en impresion";
				}
				if (error.length() == 0)
				{
					invoice.setIsPrinted(true);
					invoice.save();
				}
			}
		}		
	}

	public void simple()
	{
		Trx m_trx = Trx.get(getMP().get_TrxName(), true);
		String error = "";
		try {									
			MOrder order = getMP().getFirstRecord(X_C_Order.Table_Name);			
			if (!order.getDocStatus().equals(DocAction.STATUS_Completed))
			{	
				ProcessInfo pi = WorkflowUtils.Process(order, m_trx.getTrxName());
				if (!pi.isError())
				{
					m_trx.commit();					
					order = new MOrder(Env.getCtx(), order.getC_Order_ID(), m_trx.getTrxName());
					if (order.getDocStatus().compareTo(DocAction.STATUS_Completed) == 0)
					{
						if (order.IsPOSOrder())
						{
							List<MInvoice> invoices = new ArrayList<MInvoice>();
							MOrderLine[] lines = order.getLines();
							for (MOrderLine line:lines)
							{
								MInvoiceLine iline = new Query(Env.getCtx(), X_C_InvoiceLine.Table_Name, "C_OrderLine_ID = ?", m_trx.getTrxName())
								.setParameters(line.getC_OrderLine_ID()).first();
								if (iline != null)
								{
									MInvoice invoice = new MInvoice(Env.getCtx(), iline.getC_Invoice_ID(), m_trx.getTrxName());
									if (!invoices.contains(invoice))
										invoices.add(invoice);
								}
							}
							if (invoices.size() > 0)
							{
								//PayInvoices(invoices);
								Collections.sort(invoices, new Comparator<MInvoice>() {
									public int compare(MInvoice o1, MInvoice o2) {
										return o1.getDocumentNo().compareTo(o2.getDocumentNo());								            
									}
								});								
								for (MInvoice invoice:invoices)
								{
									String doc = invoice.getDocumentNo();
								}
								for (MInvoice invoice:invoices)
								{					
									MDocType dt = new Query(Env.getCtx(), X_C_DocType.Table_Name, "C_DocType_ID = ?", m_trx.getTrxName())
									.setParameters(invoice.getC_DocType_ID()).first();
									if (!invoice.isPrinted() && dt.isPrintOnComplete())
									{
										System.out.println(String.format("Invoice %s %s",invoice.getSerial(),invoice.getDocumentNo()));
										error = print(invoice);
										if (error == null) {
											error = "exception en impresion";
										}
										if (error.length() == 0)
										{
											invoice.setIsPrinted(true);
											invoice.save();
										}
									}
								}
							}					
						}
						else 
						{
							print(order);
						}
					}
				}
				else
				{	
					m_trx.rollback();			
					throw new Exception(pi.getSummary());				
				}
			}
		}		
		catch (Exception e)
		{
			e.printStackTrace();
			error = e.getMessage();
			//m_trx.rollback();			
		}
		finally
		{	
			getMP().setProcessed(true);
			if (error.length() > 0)
				getMP().setErrorMsg(error);
			getMP().saveMessage();
			m_trx.commit();
		}		
	}
	private void PayInvoices() {
		BigDecimal TotalInvoice = BigDecimal.ZERO;
		for (MInvoice invoice:getInvoices())
		{
			TotalInvoice = TotalInvoice.add(invoice.getGrandTotal());
		}
		for (MInvoice invoice:getInvoices())
		{			
			if (invoice.getGrandTotal().compareTo(BigDecimal.ZERO) <= 0)
				continue;			
			X_C_Collection collection = new X_C_Collection(Env.getCtx(), 0, invoice.get_TrxName());
			collection.setC_BPartner_ID(invoice.getC_BPartner_ID());
			collection.setC_Order_ID(invoice.getC_Order_ID());
			collection.setC_Invoice_ID(invoice.getC_Invoice_ID());
			collection.setC_POS_ID(invoice.getC_POS_ID());
			collection.setDateTrx(invoice.getDateInvoiced());
			if (getMP().getVarBD("cash").compareTo(BigDecimal.ZERO) > 0)
			{
				BigDecimal percent = getMP().getVarBD("cash");
				MCurrency currency = getMP().getFirstRecord(MCurrency.Table_Name);
				BigDecimal PayAmt = invoice.getGrandTotal().multiply(percent).setScale(currency.getStdPrecision(),BigDecimal.ROUND_HALF_UP);

				BigDecimal writeOff = invoice.getWriteOffAmt();
				if (writeOff  == null)
					writeOff = BigDecimal.ZERO;
				//
				//
				MCashBook cb = getMP().getFirstRecord(MCashBook.Table_Name);
				MCash cash = null;
				X_C_DocType dtcash = null;
				String cashdoctype = getMP().getVar("C_DocType_ID");
				dtcash = new Query(Env.getCtx(), X_C_DocType.Table_Name, "Identifier = ?", invoice.get_TrxName())
				.setParameters(cashdoctype).first();											
				switch (cashtype) {
				case SIMPLE:
					cash = MCash.get(Env.getCtx(), cb.getC_CashBook_ID(), invoice.getDateInvoiced(), invoice.get_TrxName());
					break;
				case WORKSHIFT:
					String workshift = getMP().getVar(X_HR_WorkShift.COLUMNNAME_HR_WorkShift_ID);
					X_HR_WorkShift ws = new Query(Env.getCtx(), X_HR_WorkShift.Table_Name, "Identifier = ?", invoice.get_TrxName())
					.setParameters(workshift).first();						
					collection.setHR_WorkShift_ID(ws.getHR_WorkShift_ID());						
					cash = MCash.get(Env.getCtx(), cb.getC_CashBook_ID(), dtcash.getC_DocType_ID(), ws.getHR_WorkShift_ID(), invoice.getDateInvoiced(), invoice.get_TrxName());
					break;					
				}
				if (cash.getC_Cash_ID() == 0) {
					cash = new MCash(cb,invoice.getDateInvoiced());					
				}								
				X_AD_User u = new Query(Env.getCtx(), X_AD_User.Table_Name, "AD_User_ID = ?", invoice.get_TrxName())
				.setParameters(invoice.getAD_User_ID()).first();
				X_C_BPartner p = new Query(Env.getCtx(), X_C_BPartner.Table_Name, "C_BPartner_ID = ?", invoice.get_TrxName())
				.setParameters(u.getC_BPartner_ID()).first();
				if (p != null) {
					cash.setC_BPartner_ID(p.getC_BPartner_ID());
				}
				if (cash.save()) {
					MCashLine cashline = new MCashLine(cash);
					cashline.setC_Currency_ID(invoice.getC_Currency_ID());
					cashline.setC_BPartner_ID(invoice.getC_BPartner_ID());
					cashline.setC_Invoice_ID(invoice.getC_Invoice_ID());						
					cashline.setWriteOffAmt(writeOff);
					if (writeOff.compareTo(BigDecimal.ZERO) != 0)
						cashline.setWriteOffType(invoice.getWriteOffType());
					if (invoice.getDescription() != null)
						cashline.setDescription(invoice.getDescription());
					cashline
					.setCashType(REF_C_CashTrxType.Invoice);
					cashline.setAmount(PayAmt);
					if (PayAmt.compareTo(invoice.getGrandTotal()) != 0)
						cashline.setIsPartialPayment(true);
					if (cashline.save())
					{
						collection.setC_Cash_ID(cash.getC_Cash_ID());
						collection.setC_CashBook_ID(cb.getC_CashBook_ID());
						collection.setC_CashLine_ID(cashline.getC_CashLine_ID());
						collection.setCashAmt(PayAmt);
						collection.setWriteOffAmt(cashline.getWriteOffAmt());
						collection.setWriteOffType(cashline.getWriteOffType());
					}
				}
			}
			else if (getMP().getVarBD("payment").compareTo(BigDecimal.ZERO) > 0)
			{
				BigDecimal percent = getMP().getVarBD("payment");
				MCurrency currency = getMP().getFirstRecord(MCurrency.Table_Name);
				BigDecimal PayAmt = invoice.getGrandTotal().multiply(percent).setScale(currency.getStdPrecision(), BigDecimal.ROUND_HALF_UP);
				MPayment payment = getMP().getFirstRecord(MPayment.Table_Name);
				payment.setInvoice(invoice);
				payment.setPayAmt(PayAmt);
				String status =  payment.completeIt();
				payment.setDocStatus(status);				
				if (payment.save())
				{					
					invoice.setC_Payment_ID(payment.getC_Payment_ID());
					invoice.save();
					collection.setPayAmt(PayAmt);
					collection.setC_Payment_ID(payment.getC_Payment_ID());
				}						
			}
			else if (getMP().getVarBD("coupon").compareTo(BigDecimal.ZERO) > 0)
			{						
				BigDecimal percent = getMP().getVarBD("coupon");
				MCurrency currency = getMP().getFirstRecord(MCurrency.Table_Name);
				BigDecimal PayAmt = invoice.getGrandTotal().multiply(percent).setScale(currency.getStdPrecision(),BigDecimal.ROUND_HALF_UP);
				BigDecimal CouponUsed = BigDecimal.ZERO;
				List<MCoupon> coupons = getMP().getRecords(MCoupon.Table_Name);
				for (MCoupon coupon:coupons)
				{
					if (coupon.getRef_Invoice_ID() == 0)
					{								
						if (coupon.getGrandTotal().compareTo(PayAmt) <= 0)
						{
							coupon.setRef_Invoice_ID(invoice.getC_Invoice_ID());
							coupon.save();
							CouponUsed = CouponUsed.add(coupon.getGrandTotal());
						}
					}
					if (CouponUsed.compareTo(PayAmt) >= 0)
						break;
				}				
				collection.setCouponAmt(CouponUsed);
			}
			else if (getMP().getVarBD(Constants.A_CREDIT).compareTo(BigDecimal.ZERO) > 0)
			{
				BigDecimal percent = getMP().getVarBD("credit");
				collection.setCreditAmt(getMP().getVarBD(Constants.A_CREDIT));
			}
			collection.save();
		}
	}

	private String print(MOrder order) {
		String error = "";
		MDocType dt = MDocType.get(Env.getCtx(), order.getC_DocType_ID());

		X_A_MachinePrinter mp = new Query(Env.getCtx(), X_A_MachinePrinter.Table_Name, "A_MachinePrinter_ID = ?", null)
		.setParameters(dt.getA_MachinePrinter_ID()).first();				

		if (mp != null) {		
			X_A_Machine machine = new Query(Env.getCtx(), X_A_Machine.Table_Name, "A_Machine_ID = ?", null)
			.setParameters(mp.getA_Machine_ID()).first();

			MQuery m_query = new MQuery();
			m_query.addRestriction(X_C_Order.COLUMNNAME_C_Order_ID, MQuery.EQUAL, order.getC_Order_ID());

			MPrinterDocumentFormat pf = new MPrinterDocumentFormat(Env.getCtx(), dt.getC_PrinterDocumentFormat_ID(), null);

			PrinterDocumentCtrl pdfc = new PrinterDocumentCtrl(Env.getCtx(), pf, m_query);
			PrintWorker pw = pdfc.getPrintWorker();
			if (pw != null) {
				pw.setPrintServer(machine);
				//pw.setQueueName(dt.getQueueName());
				pw.setQueueName(mp.getQueueName());
				error = pdfc.printdirect(pw);
			} else {
				error = pdfc.getProcessMsg();
			}
		}
		return error;
	}

	private String print(MInvoice invoice) {
		String error = "";
		try {
			MDocType dt = MDocType.get(Env.getCtx(), invoice.getC_DocType_ID());		
			if (dt.getC_PrinterDocumentFormat_ID() == 0) {
				throw new Exception(String.format("no existe formato de impresion definido para %s ", dt.getName()));
			}
			X_A_MachinePrinter mp = new Query(Env.getCtx(), X_A_MachinePrinter.Table_Name, "A_MachinePrinter_ID = ?", null)
			.setParameters(dt.getA_MachinePrinter_ID()).first();		

			X_A_Machine machine = new Query(Env.getCtx(), X_A_Machine.Table_Name, "A_Machine_ID = ?", null)
			.setParameters(mp.getA_Machine_ID()).first();

			MQuery m_query = new MQuery();
			m_query.addRestriction(X_C_Invoice.COLUMNNAME_C_Invoice_ID, MQuery.EQUAL, invoice.getC_Invoice_ID());
			MPrinterDocumentFormat pf = new MPrinterDocumentFormat(Env.getCtx(), dt.getC_PrinterDocumentFormat_ID(), null);		
			PrinterDocumentCtrl pdfc = new PrinterDocumentCtrl(Env.getCtx(), pf, m_query);
			PrintWorker pw = pdfc.getPrintWorker();
			pw.setPrintServer(machine);
			//pw.setQueueName(dt.getQueueName());
			pw.setQueueName(mp.getQueueName());
			//System.out.println(String.format("%s %s",machine.toString(),dt.getQueueName()));
			System.out.println(String.format("%s %s",machine.toString(),mp.getQueueName()));
			error = pdfc.printdirect(pw);	
			System.out.println(error);
		} catch (Exception e) {
			error = e.getMessage();
		}
		return error;
	}
	public String getM_key() {
		return m_key;
	}
	public void setM_key(String m_key) {
		this.m_key = m_key;
	}
	public static void main(String[] args) {
		org.compiere.Xendra.startup(false);
		SalesPolicyRequest spr = new SalesPolicyRequest();
		MInvoice invoice = new MInvoice(Env.getCtx(), 2316020, null);
		spr.print(invoice);
	}
	public void addTables(HashMap<String, List<PO>> tables) {
		m_tables = tables; 		
	}
	public void setMessageProcessor(MessageProcessor p) {		
		m_messageprocessor = p;
	}
	public void setProcessed(boolean var) {
		processed = var;
	}
	public boolean getProcessed() {
		return processed; 
	}
}