package org.xendra.process;

import java.math.BigDecimal;
import java.util.logging.Level;

import org.compiere.model.MBPartner;
import org.compiere.model.MCash;
import org.compiere.model.MClient;
import org.compiere.model.MConversionRate;
import org.compiere.model.MDocType;
import org.compiere.model.MInOutLine;
import org.compiere.model.MInvoice;
import org.compiere.model.MInvoiceLine;
import org.compiere.model.MInvoiceTax;
import org.compiere.model.MOrderLine;
import org.compiere.model.MPeriod;
import org.compiere.model.reference.REF__DocumentAction;
import org.compiere.model.reference.REF__DocumentStatus;
import org.compiere.process.DocAction;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;

public class RestoreInvoiceDrafted extends SvrProcess {
	private int m_C_Invoice_ID;

	@Override
	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("C_Invoice_ID"))
				m_C_Invoice_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}

	}

	@Override
	protected String doIt() throws Exception {
		MInvoice invoice = new MInvoice(getCtx(), m_C_Invoice_ID, get_TrxName());
		MDocType dt = MDocType.get(getCtx(), invoice.getC_DocType_ID());
		
		if (!MPeriod.isOpen(getCtx(), invoice.getDateAcct(), dt.getDocBaseType(), Env.getAD_Org_ID(Env.getCtx())))
		{
			return "@PeriodClosed@";
		}				

		String sql = "SELECT " +
						"CASE WHEN " +
							"(IsPaid='Y' AND C_Payment_ID=0) OR (C_CashLine_ID>0) THEN 'Y' ELSE 'N' " +
						"END " +
					 "FROM " +
					 	"C_Invoice " +
					 "WHERE " +
					 	"C_Invoice_ID=?";
		boolean isPaid = DB.getSQLValueString(get_TrxName(), sql, m_C_Invoice_ID).equals("Y")?true:false;
		
		sql = "SELECT " +
				"CASE WHEN " +
					"COUNT(*)>0 THEN 'Y' ELSE 'N' " +
				"END " +
			  "FROM " +
				"C_CashLine " +
			  "WHERE " +
				"C_Invoice_ID=?";
		boolean isCashLine = DB.getSQLValueString(get_TrxName(), sql, m_C_Invoice_ID).equals("Y")?true:false;
		
		sql = "SELECT " +
				"CASE WHEN " +
					"COUNT(*)>0 THEN 'Y' ELSE 'N' " +
		        "END " +
	          "FROM " +
	          	"C_Payment " +
	          "WHERE " +
	          	"C_Invoice_ID=?";
		boolean isPayment = DB.getSQLValueString(get_TrxName(), sql, m_C_Invoice_ID).equals("Y")?true:false;
		
		sql = "SELECT " +
				"CASE WHEN " +
					"COUNT(*)>0 THEN 'Y' ELSE 'N' " +
		        "END " +
	          "FROM " +
	          	"C_AllocationLine " +
	          "WHERE " +
	          	"C_Invoice_ID=?";
		boolean isAllocationLine = DB.getSQLValueString(get_TrxName(), sql, m_C_Invoice_ID).equals("Y")?true:false;

		sql = "SELECT " +
				"CASE WHEN " +
					"COUNT(*)>0 THEN 'Y' ELSE 'N' " +
		        "END " +
	          "FROM " +
	          	"C_BankStatementLine " +
	          "WHERE " +
	          	"C_Invoice_ID=?";
		boolean isBankStatementLine = DB.getSQLValueString(get_TrxName(), sql, m_C_Invoice_ID).equals("Y")?true:false;

		if (isPaid || isCashLine || isPayment || isAllocationLine || isBankStatementLine) {
			return "@Error@: @AlreadyPaid@";
		}
		
		sql = new StringBuffer ("DELETE FROM T_Sales WHERE C_Invoice_ID=").append(m_C_Invoice_ID).toString();
		int	no = DB.executeUpdate(sql.toString(), get_TrxName());
		
		MInvoiceLine lines[] = invoice.getLines(false);
		for (int i = 0; i < lines.length; i++) {
	/*		sql = "DELETE FROM M_CostDetail WHERE C_InvoiceLine_ID=" + lines[i].get_ID();
			DB.executeUpdate(sql, get_TrxName());*/

			int C_OrderLine_ID = lines[i].getC_OrderLine_ID();
			if (C_OrderLine_ID != 0) {
				MOrderLine oline = new MOrderLine(getCtx(), C_OrderLine_ID, get_TrxName());
				oline.setQtyInvoiced(oline.getQtyInvoiced().subtract(lines[i].getQtyInvoiced()));
				if (!oline.save())
					return "@Error@: Could not save order line";
			}
			int C_MInOutLine_ID = lines[i].getM_InOutLine_ID();
			if (C_MInOutLine_ID != 0) {
				MInOutLine ioline = new MInOutLine(getCtx(), C_MInOutLine_ID, get_TrxName());
				ioline.setIsInvoiced(false);
				if (!ioline.save())
					return "@Error@: Could not save In Out Line";
			}
			lines[i].setProcessed(false);
			lines[i].save();
		}
		
		MInvoiceTax taxes[] = invoice.getTaxes(false);
		for (int i = 0; i < taxes.length; i++) {
			taxes[i].setProcessed(false);
			taxes[i].save();
		}
		
		invoice.setDocStatus(REF__DocumentStatus.Drafted);
		invoice.setDocAction(REF__DocumentAction.Complete);
		invoice.setProcessing(false);
		invoice.setProcessed(false);
		invoice.setPosted(false);
		invoice.save(get_TrxName());
		
		sql = "DELETE FROM Fact_Acct WHERE AD_Table_ID=" + MInvoice.Table_ID + " AND Record_ID=?";

		if (DB.executeUpdate(sql, invoice.get_ID(), get_TrxName()) == -1) {
			return "@Error@";
		}

		sql = "DELETE FROM " +
				"M_MatchPO " +
			  "WHERE " +
			  	"C_InvoiceLine_ID IN (SELECT C_InvoiceLine_ID FROM C_InvoiceLine WHERE C_Invoice_ID=?)";
		if (DB.executeUpdate(sql, invoice.get_ID(), get_TrxName()) == -1) {
			return "@Error@";
		}
	
		sql = "DELETE FROM " +
				"M_MatchInv " +	
	          "WHERE " +
	          	"C_InvoiceLine_ID IN (SELECT C_InvoiceLine_ID FROM C_InvoiceLine WHERE C_Invoice_ID=?)";
		if (DB.executeUpdate(sql, invoice.get_ID(), get_TrxName()) == -1) {
			return "@Error@";
		}
		//
		//	Update BP Statistics
		MBPartner bp = new MBPartner (getCtx(), invoice.getC_BPartner_ID(), get_TrxName());
		//	Update total revenue and balance / credit limit (reversed on AllocationLine.processIt)
		BigDecimal invAmt = MConversionRate.convertBase(getCtx(), 0, invoice.getGrandTotal(true),	//	CM adjusted 
				invoice.getC_Currency_ID(), invoice.getDateAcct(), 0, invoice.getAD_Client_ID(), invoice.getAD_Org_ID());
//		if (invAmt == null)
//		{
//			//String m_processMsg = "Could not convert C_Currency_ID=" + invoice.getC_Currency_ID()
//			//	+ " to base C_Currency_ID=" + MClient.get(Env.getCtx()).getC_Currency_ID();
//			//return DocAction.STATUS_Invalid;
//		}
		if (invAmt != null)
		{
			BigDecimal newBalance = bp.getTotalOpenBalance(false);
			if (newBalance == null)
				newBalance = Env.ZERO;
			if (invoice.isSOTrx())
			{
				newBalance = newBalance.subtract(invAmt);
				log.fine("GrandTotal=" + invoice.getGrandTotal(true) + "(" + invAmt 
					+ ") Balance=" + bp.getTotalOpenBalance(false) + " -> " + newBalance);				
			}	//	SO
			else
			{
				newBalance = newBalance.add(invAmt);
				//
				if (bp.getFirstSale() == null)
					bp.setFirstSale(invoice.getDateInvoiced());
				BigDecimal newLifeAmt = bp.getActualLifeTimeValue();
				if (newLifeAmt == null)
					newLifeAmt = invAmt;
				else
					newLifeAmt = newLifeAmt.add(invAmt);
				BigDecimal newCreditAmt = bp.getSO_CreditUsed();
				if (newCreditAmt == null)
					newCreditAmt = invAmt;
				else
					newCreditAmt = newCreditAmt.add(invAmt);
				//
				log.fine("GrandTotal=" + invoice.getGrandTotal(true) + "(" + invAmt 
					+ ") BP Life=" + bp.getActualLifeTimeValue() + "->" + newLifeAmt
					+ ", Credit=" + bp.getSO_CreditUsed() + "->" + newCreditAmt
					+ ", Balance=" + bp.getTotalOpenBalance(false) + " -> " + newBalance);
				bp.setActualLifeTimeValue(newLifeAmt);
				bp.setSO_CreditUsed(newCreditAmt);				
			}
			bp.setTotalOpenBalance(newBalance);
			bp.setSOCreditStatus();
			if (!bp.save(get_TrxName()))
			{
				//m_processMsg = "Could not update Business Partner";
				//return DocAction.STATUS_Invalid;
				return "@Error@";
			}			
		}
		
return "Invoice " + invoice.getDocumentNo() + " successfully drafted";
	}

}
