package org.xendra.model;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.HashMap;

import org.compiere.model.MBPartner;
import org.compiere.model.MCurrency;
import org.compiere.model.MOrder;
import org.compiere.model.MPaymentTerm;
import org.compiere.model.MTax;
import org.compiere.model.MUser;
import org.compiere.model.MWithholding;
import org.compiere.model.Query;
import org.compiere.model.reference.REF_WriteOffType;
import org.compiere.model.reference.REF_WithholdingType;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.xendra.Constants;
import org.xendra.objectview.ObjectView;
import org.xendra.objectview.ObjectViewModel;
import org.xendra.pop.Row;

public class PolicyRequest {
	private static PolicyRequest m_PolicyRequest = null;
	private int m_WindowNo;
	private MPaymentTerm m_PaymentTerm = null;
	private String PaymentRule = "";
	
	public String getPaymentRule() {
		return PaymentRule;
	}
	public void setPaymentRule(String paymentRule) {
		PaymentRule = paymentRule;
	}
	private MWithholding Withholding = null;
	
	public static PolicyRequest getInstance() {
		if (m_PolicyRequest == null)
			m_PolicyRequest = new PolicyRequest();
		return m_PolicyRequest;
	}
	
	public void setWindowNo(int WindowNo) {
		m_WindowNo = WindowNo;			
	}
	
	public int getWindowNo() {
		return m_WindowNo;
	}
	
	private MPaymentTerm getPaymentTerm(MOrder order) {
		if (m_PaymentTerm == null && order.getC_PaymentTerm_ID() > 0)
		{
			MPaymentTerm pt = new Query(Env.getCtx(), MPaymentTerm.Table_Name, "C_PaymentTerm_ID = ?", null)
			.setParameters(order.getC_PaymentTerm_ID()).first();
			if (pt != null)
			{
				m_PaymentTerm = pt;
			}
		}
		if (order.getC_PaymentTerm_ID() > 0 && m_PaymentTerm != null)
		{
			if (order.getC_PaymentTerm_ID() != m_PaymentTerm.getC_PaymentTerm_ID())
			{
				MPaymentTerm pt = new Query(Env.getCtx(), MPaymentTerm.Table_Name, "C_PaymentTerm_ID = ?", null)
				.setParameters(order.getC_PaymentTerm_ID()).first();
				m_PaymentTerm = pt;
			}
		}		
		return m_PaymentTerm;
	}
	private void setPaymentTerm(MPaymentTerm paymentTerm) 
	{
		m_PaymentTerm = paymentTerm;
	}	

	public String PartnerToOrder(MOrder order, MBPartner partner) {		 
		if (order == null)
			return "order is null";
		if (partner == null)
			return "partner is null";
		order.setC_BPartner_ID(partner.getC_BPartner_ID());
		MWithholding[] withholdings = partner.getWithholdings(true);
		for (MWithholding holding : withholdings) {
			if (holding.isPaidTo3Party()) {
				Withholding = holding;
			}
		}		
		if (partner.getBillLocation() != null)
			order.setBill_Location_ID(partner.getBillLocation().getC_BPartner_Location_ID());
		if (partner.getShipLocation() != null)
		{
			order.setShip_Location_ID(partner.getShipLocation().getC_BPartner_Location_ID());
			order.setC_BPartner_Location_ID(partner.getShipLocation().getC_BPartner_Location_ID());
		}
		partner.getSOCreditStatus();
		order.notifyObservers();		
		partner.notifyObservers();
		return "";
	} // bPartner

	public void CalculateTotalLines()  {
		if (this.Withholding != null) {
		}		
	}
	public static void UserToOrder(MOrder order, MUser user) {
		if (order == null)
			return;
		if (user == null)
			return;
		order.setAD_User_ID(user.getAD_User_ID());
		order.setSalesRep_ID(order.getAD_User_ID());
		return;
	}

	public void Cash(MOrder order, BigDecimal net) {
		if (getPaymentTerm(order) != null)
		{
			if (getPaymentTerm(order).getNickelRoundAmt().compareTo(BigDecimal.ZERO) > 0)
			{				
				MathContext mc = new MathContext(10);
				BigDecimal nickelround = Util.round(net, getPaymentTerm(order).getNickelRoundAmt(), REF_WriteOffType.WriteOffAmt);
				BigDecimal discount = BigDecimal.ZERO;
				if (nickelround.signum()  > 0)
				{
					discount = net.subtract(nickelround);
					order.setWriteOffAmt(discount);
				}
			}
		}		
	}
	
	public boolean IsOverMaxAmount(ObjectView view, BigDecimal maxamount) {
		boolean isover = false;
		ObjectViewModel adapter = view.getDataModel();
		for (int j = 0; j < view.getRowCount(); j++) {
			Row row = (Row) adapter.getRowObject(j);
			if (row.getTotal().compareTo(maxamount) > 0)
			{
				isover = true;
				break;
			}
		}
		return isover;
	}	
	
	public void Total(MOrder order, ObjectView view, HashMap<String, BigDecimal> amounts) {
		amounts.put(Constants.A_TOTALGROSS, BigDecimal.ZERO);
		amounts.put(Constants.A_TOTALNET, BigDecimal.ZERO);
		amounts.put(Constants.A_TOTALDISCOUNT, BigDecimal.ZERO);		
		amounts.put(Constants.PERCEPTIONBASEAMT, BigDecimal.ZERO);
		amounts.put(Constants.A_TOTALTAX, BigDecimal.ZERO);
		int m_rowcount = 0;
		int sequence = 1;
		BigDecimal taxBaseAmt = Env.ZERO;
		BigDecimal taxAmt = Env.ZERO;		
		int precision = MCurrency.getStdPrecision(Env.getCtx(),	order.getC_Currency_ID());
		ObjectViewModel adapter = view.getDataModel();
		for (int j = 0; j < view.getRowCount(); j++) {
			Row row = (Row) adapter.getRowObject(j);
			row.setRowID(sequence);
			sequence++;
			if (row.getM_Product_ID() > 0	&& row.getQtyOrdered().compareTo(Env.ZERO) != 0) {						
				amounts.put(Constants.A_TOTALGROSS, amounts.get(Constants.A_TOTALGROSS).add(row.getGross()));
				amounts.put(Constants.A_TOTALNET, amounts.get(Constants.A_TOTALNET).add(row.getTotal()));
				if (row.getDiscount().compareTo(Env.ZERO) != 0) {
					BigDecimal discount = row.getPriceList().multiply(row.getQtyEntered());
					discount = discount.multiply(row.getDiscount().divide(Env.ONEHUNDRED));
					discount = discount.setScale(2, BigDecimal.ROUND_HALF_UP);					
					amounts.put(Constants.A_TOTALDISCOUNT, amounts.get(Constants.A_TOTALDISCOUNT).add(discount));
				}
				if (row.getWithholdingType().equals(REF_WithholdingType.Perception)) {
					amounts.put(Constants.PERCEPTIONBASEAMT, amounts.get(Constants.PERCEPTIONBASEAMT).add(amounts.get(Constants.A_TOTALNET)));				
				}
				m_rowcount++;
			}
			MTax tax = MTax.get(Env.getCtx(), row.getC_Tax_ID());
			BigDecimal baseAmt = row.getTotal();
			taxBaseAmt = taxBaseAmt.add(baseAmt);
			//
			if (!tax.isDocumentLevel()) // calculate line tax
				if (tax.isSubstract())
					taxAmt = taxAmt.subtract(tax.calculateTax(baseAmt,	order.isTaxIncluded(), precision));
				else
					taxAmt = taxAmt.add(tax.calculateTax(baseAmt,	order.isTaxIncluded(), precision));			
		}
		order.setTaxAmt(taxAmt);
		if (order.isTaxIncluded())
			order.setTaxBaseAmt(taxBaseAmt.subtract(taxAmt));
		else
			order.setTaxBaseAmt(taxBaseAmt);
		amounts.put(Constants.A_TOTALTAX, order.getTaxBaseAmt());
	}
}