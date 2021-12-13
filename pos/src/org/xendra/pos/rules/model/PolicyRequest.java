package org.xendra.pos.rules.model;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


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
import org.xendra.pos.Row;

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
		// the Bill Partner is used to generate the invoice
		order.setBill_BPartner_ID(partner.getC_BPartner_ID());
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
			order.setShip_Location_ID(partner.getShipLocation().getC_Location_ID());
			order.setC_BPartner_Location_ID(partner.getShipLocation().getC_BPartner_Location_ID());
		}
		partner.getSOCreditStatus();
		order.notifyObservers();		
		partner.notifyObservers();
		return "";
	} // bPartner

	public void CalculateTotalLines()  {
		if (this.Withholding != null) {
//			if (PerceptionAmt.signum() == 1 && !m_BP_IsTaxWithHolding) {
//				if (m_BP_PaidTo3party.compareTo(Env.ZERO) > 0)
//					PerceptionAmt = Util.percent(PerceptionAmt,	m_BP_PaidTo3party);
//				else
//					PerceptionAmt = Util.percent(PerceptionAmt,	Withholding.getPercent());			
//				setAmt(Constants.A_TOTALGROSS, getAmt(Constants.A_TOTALGROSS).add(PerceptionAmt));
//			}
		}		
	}
	public void UserToOrder(MOrder order, MUser user) {
		if (order == null)
			return;
		if (user == null)
			return;
		order.setAD_User_ID(user.getAD_User_ID());
		order.setSalesRep_ID(order.getAD_User_ID());
		return;
	}

	public void Cash(MOrder order,String writeOffType, BigDecimal net) {
		MPaymentTerm pt = getPaymentTerm(order); 
		if (pt != null)
		{
			if (pt.getNickelRoundAmt().compareTo(BigDecimal.ZERO) > 0)
			{								
				BigDecimal nickelround = Util.round(net, pt.getNickelRoundAmt(), writeOffType);
				BigDecimal discount = BigDecimal.ZERO;
				if (nickelround.signum()  > 0)
				{
					if (net.compareTo(nickelround) > 0)
					{
						discount = net.subtract(nickelround);
						order.setWriteOffAmt(discount.negate());
						order.setWriteOffType(writeOffType);
					}
					else
					{
						discount = nickelround.subtract(net);
						order.setWriteOffAmt(discount);		
						order.setWriteOffType(writeOffType);
					}
				}
			}	else	{
				order.setWriteOffType(REF_WriteOffType.None);
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
	
	public void Total(MOrder order, ObjectView view, HashMap<String, BigDecimal> amounts,HashMap<Integer, BigDecimal> baseamounts, HashMap<Integer, BigDecimal> taxamounts) {
		Iterator iter = baseamounts.keySet().iterator();		
		while (iter.hasNext())
		{
			Integer key = (Integer) iter.next();
			baseamounts.put(key, BigDecimal.ZERO);
		}
		Iterator iter2 = taxamounts.keySet().iterator();
		while (iter2.hasNext())
		{
			Integer key = (Integer) iter2.next();
			taxamounts.put(key, BigDecimal.ZERO);
		}
		//System.out.println("x");
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
					discount = discount.multiply(BigDecimal.ONE.subtract(row.getDiscount()));
					//discount = discount.multiply(row.getDiscount().divide(Env.ONEHUNDRED));
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
			BigDecimal taxcatAmt = (BigDecimal) baseamounts.get(row.getC_Tax_ID());
			if (taxcatAmt == null)
				taxcatAmt = baseAmt;
			else
				taxcatAmt = taxcatAmt.add(baseAmt);
			//MTaxCategory tc = new MTaxCategory(Env.getCtx(), row.getC_TaxCategory_ID(), null);
			baseamounts.put(row.getC_Tax_ID(), taxcatAmt);			
		}
		Iterator iter3 = baseamounts.entrySet().iterator();
		while (iter3.hasNext())
		{			
			Map.Entry map = (Entry) iter3.next();
			Integer taxid = (Integer) map.getKey();
			BigDecimal Amt = (BigDecimal) map.getValue();
			MTax tax = MTax.get(Env.getCtx(), taxid);
			BigDecimal TaxAmt = tax.calculateTax(Amt, order.isTaxIncluded(), precision);
			//baseamounts.put(taxid, Amt);
			BigDecimal taxcatAmt = baseamounts.get(taxid);
			if (order.isTaxIncluded())
			{
				taxcatAmt = taxcatAmt.subtract(TaxAmt);
				baseamounts.put(taxid, taxcatAmt);
			}
			taxamounts.put(taxid, TaxAmt);
		}
		order.setTaxAmt(taxAmt);
		if (order.isTaxIncluded())
			order.setTaxBaseAmt(taxBaseAmt.subtract(taxAmt));
		else
			order.setTaxBaseAmt(taxBaseAmt);
		amounts.put(Constants.A_TOTALTAX, order.getTaxBaseAmt());		
	}

}
