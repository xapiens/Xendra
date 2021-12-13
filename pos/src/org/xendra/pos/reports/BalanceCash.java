package org.xendra.pos.reports;

import java.math.BigDecimal;

import org.compiere.model.MPrinterDocumentFormat;
import org.compiere.model.MUser;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachinePrinter;
import org.compiere.model.persistence.X_C_PrinterFormat;
import org.compiere.util.Env;
import org.xendra.pos.cash.CashCountItem;
import org.xendra.printdocument.MVELParseFormat;
import org.xendra.printdocument.PrintDocument;
import org.xendra.printdocument.PrintWorker;

public class BalanceCash {
	BigDecimal TotalComputer;
	BigDecimal TotalHuman;
	BigDecimal TotalDiff;
	String CashDate;
	String Created;
	String MachineSerial;
	CashCountItem[] lines;	
	X_C_PrinterFormat pf;
	public BalanceCash(X_C_PrinterFormat pf) {
		this.pf = pf;
	}
	public String print() {
		String error = "";
		try{
			X_A_MachinePrinter mp = new X_A_MachinePrinter(Env.getCtx(), pf.getA_MachinePrinter_ID(), null);
			X_A_Machine machine = new X_A_Machine(Env.getCtx(), mp.getA_Machine_ID(), null);					
			PrintWorker obj = new PrintWorker(machine);
			obj.setQueueName(mp.getQueueName());
			//obj.setPrinterDocumentFormat_ID(getPOSPanel().getConfig().getC_CashCountFormat_ID());
			MPrinterDocumentFormat pdf = new MPrinterDocumentFormat(Env.getCtx(), pf.getC_PrinterDocumentFormat_ID(), null);
			PrintDocument pd = MVELParseFormat.getInstance().parse(pdf);
			error = pd.getError();
			obj.setPrintDocument(pd);
			//error = obj.AssignPrinterDocumentFormat(pf.getC_PrinterDocumentFormat_ID());
			if (error.length() > 0)
				throw new Exception(error);
			pd.setProperty("TotalCountSystem", getTotalComputer());			
			pd.setProperty("TotalCountHuman", getTotalHuman());
			pd.setProperty("TotalCountDiff", getTotalDiff());
			pd.setProperty("MachineSerial", getMachineSerial());
			MUser user = MUser.get(Env.getCtx(), Env.getAD_User_ID(Env.getCtx()));				
			pd.setProperty("UserName", user.getName());			
			pd.setProperty("Created",  getCreated());										
			pd.setProperty("CashDate", getCashDate());					
			//for (CashCountItem item:m_cashcount.getLines())
			for (CashCountItem item:getLines())
			{					
				pd.setPropertyEach("CountSystem", item.getAmountInSystem().setScale(2, BigDecimal.ROUND_HALF_UP));
				pd.setPropertyEach("CountHuman", item.getAmount().setScale(2, BigDecimal.ROUND_HALF_UP));
				pd.setPropertyEach("CountDiff", item.getDiff().setScale(2, BigDecimal.ROUND_HALF_UP));
				pd.setPropertyEach("Name", item.getDescription());									
				//obj.AddPropertyLine("CountHuman", item.getAmount().setScale(2, BigDecimal.ROUND_HALF_UP));
				//obj.AddPropertyLine("CountDiff", item.getDiff().setScale(2, BigDecimal.ROUND_HALF_UP));
				//obj.AddPropertyLine("Name", item.getDescription());					
			}				
			error = obj.Print(PrintWorker.ReceiveJob);
			if (error.length() > 0)
				throw new Exception(error);					
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}		
		return error;
	}
	public BigDecimal getTotalComputer() {
		return TotalComputer;
	}
	public void setTotalComputer(BigDecimal totalComputer) {
		TotalComputer = totalComputer;
	}
	public BigDecimal getTotalHuman() {
		return TotalHuman;
	}
	public void setTotalHuman(BigDecimal totalHuman) {
		TotalHuman = totalHuman;
	}
	public BigDecimal getTotalDiff() {
		return TotalDiff;
	}
	public void setTotalDiff(BigDecimal totalDiff) {
		TotalDiff = totalDiff;
	}
	public CashCountItem[] getLines() {
		return lines;
	}
	public void setLines(CashCountItem[] cashCountItems) {
		this.lines = cashCountItems;
	}
	public String getCreated() {
		return Created;
	}
	public void setCreated(String created) {
		Created = created;
	}
	public String getCashDate() {
		return CashDate;
	}
	public void setCashDate(String cashDate) {
		CashDate = cashDate;
	}
	public String getMachineSerial() {
		return MachineSerial;
	}
	public void setMachineSerial(String machineSerial) {
		MachineSerial = machineSerial;
	}	
}
