package org.xendra.process;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import org.compiere.model.MDocType;
import org.compiere.model.MInvoice;
import org.compiere.model.MInvoiceLine;
import org.compiere.model.MOrder;
import org.compiere.model.MOrderLine;
import org.compiere.model.MPrinterDocumentFormat;
import org.compiere.model.MQuery;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachinePrinter;
import org.compiere.model.persistence.X_C_Invoice;
import org.compiere.model.persistence.X_C_InvoiceLine;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.Env;
import org.xendra.printdocument.PrintWorker;
import org.xendra.printdocument.PrinterDocumentCtrl;

@Deprecated
public class InvoicesFromOrderPrint extends SvrProcess {

	/** The Column				*/
	private int			p_AD_Column_ID = 0;

	@Override
	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;			
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
		p_AD_Column_ID = getRecord_ID();
	}

	@Override
	protected String doIt() throws Exception {
		MOrder order = new MOrder(Env.getCtx(), p_AD_Column_ID, get_TrxName());
		List<MInvoice> invoices = new ArrayList<MInvoice>();
		MOrderLine[] lines = order.getLines();
		for (MOrderLine line:lines)
		{
			MInvoiceLine iline = new Query(Env.getCtx(), X_C_InvoiceLine.Table_Name, "C_OrderLine_ID = ?", get_TrxName())
				.setParameters(line.getC_OrderLine_ID()).first();
			MInvoice invoice = new MInvoice(Env.getCtx(), iline.getC_Invoice_ID(), get_TrxName());
			if (!invoices.contains(invoice))
				invoices.add(invoice);
		}
		for (MInvoice invoice:invoices)
		{					
			if (!invoice.isPrinted())
			{
				String error = print(invoice);
				if (error.length() == 0)
				{
					invoice.setIsPrinted(true);
					invoice.save();
				}
			}
		}								
		return null;
	}

	private String print(MInvoice invoice) {
		String error = "";
		
		MDocType dt = MDocType.get(Env.getCtx(), invoice.getC_DocType_ID());
		
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
		pw.setQueueName(mp.getQueueName());
		//pw.setQueueName(dt.getQueueName());
		error = pdfc.printdirect(pw);	
		return error;
	}
}
