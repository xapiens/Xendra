package org.xendra.pos.reports;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.DecimalFormat;

import org.compiere.model.Lookup;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MPayment;
import org.compiere.model.MPrinterDocumentFormat;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachinePrinter;
import org.compiere.model.persistence.X_C_BPartner;
import org.compiere.model.persistence.X_C_Collection;
import org.compiere.model.persistence.X_C_Invoice;
import org.compiere.model.persistence.X_C_POS;
import org.compiere.model.persistence.X_C_PrinterFormat;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.xendra.pos.PosPanel;
import org.xendra.pos.wizard.MachineCreator;
import org.xendra.printdocument.DataSource;
import org.xendra.printdocument.MVELParseFormat;
import org.xendra.printdocument.PrintDocument;
import org.xendra.printdocument.PrintWorker;

public class PrintLineCanceledList {

	private int m_C_POS_ID;
	private Timestamp m_CashDate;
	private PosPanel pospanel;
	private static DecimalFormat s_format = DisplayType.getNumberFormat(DisplayType.Amount);;

	public PrintLineCanceledList(PosPanel pp, Timestamp value) {
		pospanel = pp;
		m_C_POS_ID = getPOSPanel().getConfig().getC_POS_ID();;
		m_CashDate = value;
	}

	public String print(X_C_PrinterFormat pf) {
		String error = "";
		try {
			DataSource.clear("canceledlist");
			getPOSPanel().getFrame().setBusy(true);
			String select = "SELECT * FROM v_collectionvoid WHERE C_POS_ID = ? AND date_trunc('day',datetrx) = date_trunc('day',?::date) ";
			PreparedStatement pstmt = DB.prepareStatement(select.toString(), null);
			pstmt.setInt(1, m_C_POS_ID);
			pstmt.setTimestamp(2, (Timestamp) m_CashDate);
			ResultSet rs = pstmt.executeQuery();
			Boolean paycreated = false;
			Boolean creditcreated = false;
			Boolean cashcreated = false;
			while (rs.next())
			{				
				String type = rs.getString("type");
				if (type.equals("C")) {
					String documentno 	= rs.getString("documentno");
					BigDecimal pay 		= rs.getBigDecimal("payamt");
					DataSource.setLine("paydocumentno", documentno);
					DataSource.setLine("pay", pay);
					paycreated = true;
				} else if (type.equals("D")) {
					String documentno 	 = rs.getString("documentno");
					String C_BPartner_ID = rs.getString("c_bpartner_id");
					BigDecimal credit	 = rs.getBigDecimal("payamt");
					DataSource.setLine("creditdocumentno", documentno);
					DataSource.setLine("C_BPartner_ID", C_BPartner_ID);
					DataSource.setLine("credit", credit);
					creditcreated = true;
				} else if (type.equals("E")) {
					String documentno 	= rs.getString("documentno");
					BigDecimal cash 	= rs.getBigDecimal("cashamt");
					DataSource.setLine("cashdocumentno", documentno);
					DataSource.setLine("cash", cash);
					cashcreated = true;
				}
			}
			if (!paycreated) {
				DataSource.setLine("paydocumentno", "");
				DataSource.setLine("pay", BigDecimal.ZERO);				
			}
			if (!creditcreated) {
				DataSource.setLine("creditdocumentno", "");
				DataSource.setLine("C_BPartner_ID", "");
				DataSource.setLine("credit", BigDecimal.ZERO);				
			}
			if (!cashcreated) {
				DataSource.setLine("cashdocumentno", "");
				DataSource.setLine("cash", BigDecimal.ZERO);				
			}
			//X_C_PrinterFormat pf = new Query(Env.getCtx(), X_C_PrinterFormat.Table_Name, "AD_Table_ID = ? AND Record_ID = ? AND Value = ?", null)
			//.setParameters(X_C_POS.Table_ID, pospanel.getConfig().getC_POS_ID(), MachineCreator.CreditCardList).first();
			X_A_MachinePrinter mp = new X_A_MachinePrinter(Env.getCtx(), pf.getA_MachinePrinter_ID(), null);
			X_A_Machine machine = new X_A_Machine(Env.getCtx(), mp.getA_Machine_ID(), null);
			MPrinterDocumentFormat pdf = new MPrinterDocumentFormat(Env.getCtx(), pf.getC_PrinterDocumentFormat_ID(), null);
			PrintDocument pd = MVELParseFormat.getInstance().parse(pdf);
			pd.setData(DataSource.getInstance());
			PrintWorker pw = new PrintWorker(machine);
			error = pw.setPrintDocument(pd);			
			error = pw.Print(PrintWorker.ReceiveJob);						
		}
		catch (Exception e )
		{
			e.printStackTrace();
		}
		finally {
			getPOSPanel().getFrame().setBusy(false);	
		}		
		return error;
	}

	public String oldprint(X_C_PrinterFormat pf) {
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
			getPOSPanel().getFrame().setBusy(true);

			StringBuilder sql = new StringBuilder("SELECT i.documentno, c.payamt ")
			.append(" FROM ")
			.append(X_C_Collection.Table_Name).append(" c join ")
			.append(X_C_Invoice.Table_Name).append(" i ON c.c_invoice_id = i.c_invoice_id ")
			.append(" WHERE c.C_POS_ID = ?  AND date_trunc('day',c.updated) = date_trunc('day',?::date) ")
			.append(" AND i.docstatus = 'VO' and c.payamt > 0 ORDER BY 1 ");

			Integer AD_Column_ID = Util.getColumnID(MPayment.Table_ID,"CreditCardType");	//	C_Order.C_PaymentTerm_ID
			Lookup lookup = MLookupFactory.get (Env.getCtx(), 0, 0, AD_Column_ID, DisplayType.List);

			PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
			pstmt.setInt(1, m_C_POS_ID);
			pstmt.setTimestamp(2, (Timestamp) m_CashDate);
			ResultSet rs = pstmt.executeQuery();
			String cardname = "";						
			pd.setPropertyEach("line", "Anulaciones:");
			pd.setPropertyEach("line", m_CashDate.toString());			
			pd.setPropertyEach("line","Anulacion de Tarjetas:");			
			BigDecimal total = Env.ZERO;
			while (rs.next())
			{
				String cardnumber = rs.getString("documentno");
				BigDecimal amount = rs.getBigDecimal("payamt");
				total = total.add(amount);
				StringBuilder sb = new StringBuilder();
				sb.append(cardnumber);
				sb.append("  ");
				sb.append(s_format.format(amount));
				pw.AddPropertyLine("line", sb.toString());	  	  		
			}
			StringBuilder sb = new StringBuilder();
			sb.append("Total Anulacion de Tarjetas:");	  
			sb.append(cardname);
			sb.append(" : ");			
			sb.append(s_format.format(total));			
			pd.setPropertyEach("line", sb.toString());


			sb = new StringBuilder();
			sb.append("Credito Anulado:");
			pstmt.close();
			rs.close();
			//
			sql = new StringBuilder("SELECT bp.name , c.creditamt AS credit, i.documentno ")
			.append(" FROM ")
			.append(X_C_Collection.Table_Name).append(" c JOIN ")
			.append(X_C_Invoice.Table_Name).append(" i")
			.append(" ON c.c_invoice_id = i.c_invoice_id JOIN ")
			.append(X_C_BPartner.Table_Name).append(" bp ON i.c_bpartner_id = bp.c_bpartner_id ")
			.append(" WHERE c.C_POS_ID = ? AND date_trunc('day',c.updated) = date_trunc('day',?::date) ")
			.append(" AND i.docstatus = 'VO' AND creditamt > 0 ");

			pstmt = DB.prepareStatement(sql.toString(), null);
			pstmt.setInt(1, m_C_POS_ID);
			pstmt.setTimestamp(2, (Timestamp) m_CashDate);
			rs = pstmt.executeQuery();
			BigDecimal totalCredit = Env.ZERO;
			while (rs.next())
			{
				String bpartner = rs.getString("name");
				String documentno = rs.getString("documentno");
				BigDecimal credit = rs.getBigDecimal("credit");
				totalCredit = totalCredit.add(credit);

				sb = new StringBuilder();
				sb.append(bpartner)
				.append(" : ")
				.append(s_format.format(credit))
				.append(" ")
				.append(documentno);
				pw.AddPropertyLine("line", sb.toString());
			}
			sb = new StringBuilder();
			sb.append("Total Credito Anulado: ");
			sb.append(s_format.format(totalCredit));
			pd.setPropertyEach("line", sb.toString());
			sb = new StringBuilder();
			sb.append("Efectivo Anulado:");
			pd.setPropertyEach("line", sb.toString());				 
			pstmt.close();
			rs.close();			

			//
			sql = new StringBuilder("SELECT i.documentno,c.cashamt")
			.append(" FROM ")
			.append(X_C_Collection.Table_Name).append(" c JOIN ")
			.append(X_C_Invoice.Table_Name).append(" i ON c.c_invoice_id = i.c_invoice_id ")
			.append(" WHERE c.C_POS_ID = ? AND date_trunc('day',c.updated) = date_trunc('day',?::date) ")
			.append(" AND i.docstatus = 'VO' AND cashamt > 0 ORDER BY 1");
			pstmt = DB.prepareStatement(sql.toString(), null);
			pstmt.setInt(1, m_C_POS_ID);
			pstmt.setTimestamp(2, (Timestamp) m_CashDate);
			rs = pstmt.executeQuery();			
			BigDecimal totalCanceled = Env.ZERO;
			while (rs.next())
			{
				String documentno = rs.getString("documentno");
				BigDecimal canceled = rs.getBigDecimal("cashamt");
				totalCanceled = totalCanceled.add(canceled);
				sb = new StringBuilder();
				sb.append(documentno);
				sb.append(" ; ");
				sb.append(s_format.format(canceled));		
				pd.setPropertyEach("line", sb.toString());
			}
			sb = new StringBuilder();
			sb.append("Total Anulaciones Efectivo: ");
			sb.append(s_format.format(totalCanceled));		
			pd.setPropertyEach("line", sb.toString());
			pstmt.close();
			rs.close();							
			error = pw.Print(PrintWorker.ReceiveJob);
		}
		catch (Exception e )
		{
			e.printStackTrace();
		}
		finally {
			getPOSPanel().getFrame().setBusy(false);	
		}		
		return error;
	}
	public PosPanel getPOSPanel()
	{
		return pospanel;
	}	
}
