package org.xendra.pos.reports;

import java.text.SimpleDateFormat;

import org.compiere.model.MPrinterDocumentFormat;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachinePrinter;
import org.compiere.model.persistence.X_C_Order;
import org.compiere.model.persistence.X_C_PrinterFormat;
import org.compiere.util.Env;
import org.xendra.printdocument.MVELParseFormat;
import org.xendra.printdocument.PrintDocument;
import org.xendra.printdocument.PrintWorker;

public class WorkerCredit {
	X_C_PrinterFormat pf;
	String SalesRep_ID;
	String C_BPartner_ID;
	String GrandTotal;
	String DifferenceAmt;
	String PrinterSerial;
	String MachineSerial;
	String C_PaymentTerm_ID;
	String SerialToInvoice;
	String DocumentNoToInvoice;
	public WorkerCredit(X_C_PrinterFormat pf) {
		this.pf = pf;
	}
	public String print() {
		String error = "";
		try {
			X_A_MachinePrinter mp = new X_A_MachinePrinter(Env.getCtx(), pf.getA_MachinePrinter_ID(), null);
			X_A_Machine machine = new X_A_Machine(Env.getCtx(), mp.getA_Machine_ID(), null);
			PrintWorker pw = new PrintWorker(machine);
			MPrinterDocumentFormat pdf = new MPrinterDocumentFormat(Env.getCtx(), pf.getC_PrinterDocumentFormat_ID(), null);
			PrintDocument pd = MVELParseFormat.getInstance().parse(pdf);
			error = pw.setPrintDocument(pd);						
			//error = pw.AssignPrinterDocumentFormat(pf.getC_PrinterDocumentFormat_ID());
			if (error.length() > 0)
				throw new Exception(error);
			pw.setNumberCopy(2);			
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			pw.AddProperty("Created", formatter.format(Env.getContextAsDate(Env.getCtx(), "#Date")));
			pw.setVariable(X_C_Order.COLUMNNAME_SalesRep_ID, getSalesRep_ID());		
			pw.setVariable(X_C_Order.COLUMNNAME_C_BPartner_ID, getC_BPartner_ID());
			pw.setVariable(X_C_Order.COLUMNNAME_GrandTotal, getGrandTotal());
			pw.setVariable(X_C_Order.COLUMNNAME_DifferenceAmt, getDifferenceAmt());
			pw.setVariable(X_C_Order.COLUMNNAME_PrinterSerial, getPrinterSerial());
			pw.setVariable(X_C_Order.COLUMNNAME_MachineSerial, getMachineSerial());
			pw.setVariable(X_C_Order.COLUMNNAME_C_PaymentTerm_ID, getC_PaymentTerm_ID());
			pw.setVariable(X_C_Order.COLUMNNAME_SerialToInvoice, getSerialToInvoice());
			pw.setVariable(X_C_Order.COLUMNNAME_DocumentNoToInvoice, getDocumentNoToInvoice());
			error = pw.Print(PrintWorker.ReceiveJob);
		} catch (Exception e) {
			error = e.getMessage();
		}
		return error;
	}
	public String getSalesRep_ID() {
		return SalesRep_ID;
	}
	public void setSalesRep_ID(String salesRep_ID) {
		SalesRep_ID = salesRep_ID;
	}
	public String getC_BPartner_ID() {
		return C_BPartner_ID;
	}
	public void setC_BPartner_ID(String c_BPartner_ID) {
		C_BPartner_ID = c_BPartner_ID;
	}
	public String getGrandTotal() {
		return GrandTotal;
	}
	public void setGrandTotal(String grandTotal) {
		GrandTotal = grandTotal;
	}
	public String getDifferenceAmt() {
		return DifferenceAmt;
	}
	public void setDifferenceAmt(String differenceAmt) {
		DifferenceAmt = differenceAmt;
	}
	public String getPrinterSerial() {
		return PrinterSerial;
	}
	public void setPrinterSerial(String printerSerial) {
		PrinterSerial = printerSerial;
	}
	public String getMachineSerial() {
		return MachineSerial;
	}
	public void setMachineSerial(String machineSerial) {
		MachineSerial = machineSerial;
	}
	public String getC_PaymentTerm_ID() {
		return C_PaymentTerm_ID;
	}
	public void setC_PaymentTerm_ID(String c_PaymentTerm_ID) {
		C_PaymentTerm_ID = c_PaymentTerm_ID;
	}
	public String getSerialToInvoice() {
		return SerialToInvoice;
	}
	public void setSerialToInvoice(String serialToInvoice) {
		SerialToInvoice = serialToInvoice;
	}
	public String getDocumentNoToInvoice() {
		return DocumentNoToInvoice;
	}
	public void setDocumentNoToInvoice(String documentNoToInvoice) {
		DocumentNoToInvoice = documentNoToInvoice;
	}		
}
