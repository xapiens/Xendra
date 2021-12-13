package org.xendra.messages;

import java.math.BigDecimal;
import java.util.List;

import org.compiere.model.MDocType;
import org.compiere.model.MOrder;
import org.compiere.model.MOrderLine;
import org.compiere.model.MPriceList;
import org.compiere.model.MPriceListVersion;
import org.compiere.model.MProductPrice;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_Order;
import org.compiere.process.DocAction;
import org.compiere.process.ProcessInfo;
import org.compiere.util.Env;
import org.compiere.util.Trx;
import org.compiere.util.Util;
import org.xendra.Constants;
import org.xendra.wf.WorkflowUtils;
import org.xendrian.rules.messages.IMessageProcessor;
import org.xendrian.rules.model.Policy;

public class BuyPolicyRequest implements Policy  {
	String m_key = null;
	private MDocType dt;
	private MessageProcessor m_messageprocessor;
	private MessageProcessor getMP() {
		return m_messageprocessor;
	}
	public void simple()  {
		Trx m_trx = Trx.get(getMP().get_TrxName(), true);
		String error = "";
		try {
			MOrder order = getMP().getFirstRecord(X_C_Order.Table_Name);
			if (!order.getDocStatus().equals(DocAction.STATUS_Completed)) {
				ProcessInfo pi = WorkflowUtils.Process(order, m_trx.getTrxName());
				if (!pi.isError())
				{
					m_trx.commit();
				} else {
					throw new Exception(pi.getSummary());
				}

			} 		
			order = new MOrder(Env.getCtx(), order.getC_Order_ID(), m_trx.getTrxName());
			if (order.getDocStatus().equals(DocAction.STATUS_Completed)) {				
				if (order.getDocStatus().compareTo(DocAction.STATUS_Completed) == 0) {						
					MOrderLine[] lines = order.getLines();
					MPriceList buylist = MPriceList.get(Env.getCtx(), order.getM_PriceList_ID(), m_trx.getTrxName());
					MPriceListVersion buylistversion = buylist.getPriceListVersion(null);													
					for (MOrderLine line:lines) {
						BigDecimal price = line.getAmount();
						if (price.compareTo(BigDecimal.ZERO) > 0)
						{
							price = price.setScale(buylist.getPricePrecisionInt(), BigDecimal.ROUND_HALF_UP);
							MProductPrice pp = MProductPrice.get(Env.getCtx(), buylistversion.getM_PriceList_Version_ID(), line.getM_Product_ID(), m_trx.getTrxName());
							if (pp == null)
							{
								pp.setM_Product_ID(pp.getM_Product_ID());
								pp.setM_PriceList_Version_ID(buylistversion.getM_PriceList_Version_ID());								
								pp.save();						
							}								
							pp.setPriceList(price);
							pp.setPriceStd(price);										
							pp.setPriceLimit(price.subtract(price.multiply(Env.ONE.divide(Env.ONEHUNDRED,10, BigDecimal.ROUND_HALF_UP))));
							pp.save();
							boolean b = getMP().getVarBoolean(line.getIdentifier(), Constants.ChangePrice);
							if (b) {
								String SalesPriceListID = getMP().getVar(order.getIdentifier(), Constants.M_PriceSalesList_ID);
								if (SalesPriceListID.length() == 0) {
									continue;
								}
								MPriceList saleslist = new Query(Env.getCtx(), MPriceList.Table_Name, "Identifier = ?", m_trx.getTrxName())
								.setParameters(SalesPriceListID).first();
								MPriceListVersion saleslistversion = saleslist.getPriceListVersion(null);
								MProductPrice salesproductprice = MProductPrice.get(Env.getCtx(), saleslistversion.getM_PriceList_Version_ID(), pp.getM_Product_ID(), m_trx.getTrxName());
								if (salesproductprice == null)
								{
									salesproductprice = new MProductPrice(Env.getCtx(), 0, m_trx.getTrxName());
									salesproductprice.setM_Product_ID(pp.getM_Product_ID());
									salesproductprice.setM_PriceList_Version_ID(saleslistversion.getM_PriceList_Version_ID());
									salesproductprice.save();
								}
								BigDecimal margin = line.getMargin().divide(Env.ONEHUNDRED, 10, BigDecimal.ROUND_HALF_UP);
								margin = BigDecimal.ONE.subtract(margin);
								BigDecimal pricelist = 	pp.getPriceList().divide(margin, Env.divideprecision, BigDecimal.ROUND_HALF_UP).setScale(saleslist.getPricePrecisionInt(), BigDecimal.ROUND_HALF_UP);
								BigDecimal pricelimit = pp.getPriceLimit().divide(margin, Env.divideprecision, BigDecimal.ROUND_HALF_UP).setScale(saleslist.getPricePrecisionInt(), BigDecimal.ROUND_HALF_UP);
								BigDecimal pricestd = 	pp.getPriceStd().divide(margin, Env.divideprecision, BigDecimal.ROUND_HALF_UP).setScale(saleslist.getPricePrecisionInt(), BigDecimal.ROUND_HALF_UP);
								salesproductprice.setPriceList(pricelist);
								salesproductprice.setPriceLimit(pricelimit);
								salesproductprice.setPriceStd(pricestd);
								if (salesproductprice.save())
								{
									MPriceList[] childs = saleslist.getChilds();
									for (MPriceList child:childs)
									{
										MPriceListVersion childversion = child.getPriceListVersion(order.getDateOrdered());
										MProductPrice ppchild = MProductPrice.get(Env.getCtx(), 
												childversion.getM_PriceList_Version_ID(), pp.getM_Product_ID(), m_trx.getTrxName());
										if (ppchild == null)
										{
											ppchild.setM_Product_ID(pp.getM_Product_ID());
											ppchild.setM_PriceList_Version_ID(saleslistversion.getM_PriceList_Version_ID());
											ppchild.save();
										}
										BigDecimal marginchild = child.getRate().divide(Env.ONEHUNDRED,Env.divideprecision, BigDecimal.ROUND_HALF_UP);
										marginchild = Env.ONE.subtract(marginchild);
										ppchild.setPriceList(salesproductprice.getPriceList().divide(marginchild, Env.divideprecision, BigDecimal.ROUND_HALF_UP));
										ppchild.setPriceStd(salesproductprice.getPriceStd().divide(marginchild, Env.divideprecision, BigDecimal.ROUND_HALF_UP));
										ppchild.setPriceLimit(salesproductprice.getPriceLimit().divide(marginchild, Env.divideprecision, BigDecimal.ROUND_HALF_UP));
										ppchild.save();
									}
								}									
							}
						}

					}
				}					
			}									
		} catch (Exception e) {
			e.printStackTrace();
			error = e.getMessage();
		}
		finally {
			getMP().setProcessed(true);
			if (error.length() > 0) 
				getMP().setErrorMsg(error);
			getMP().saveMessage();
		}
	}
	private MProductPrice createPrice(int mPriceListVersionID, Integer mProductID,
			BigDecimal newSPL, String trxName) {

		if (mProductID == 0)
			return null;
		MProductPrice pp = null;
		pp = new MProductPrice(Env.getCtx(),(Integer) mPriceListVersionID, mProductID, trxName);
		pp.setPriceList(newSPL);
		pp.setPriceStd(newSPL);										
		pp.setPriceLimit(
				newSPL.subtract(
						newSPL.multiply(Env.ONE.divide(Env.ONEHUNDRED,10, BigDecimal.ROUND_HALF_UP)
								)));								
		pp.save();
		return pp;
	}	
	public String getM_key() {
		return m_key;
	}
	public void setM_key(String m_key) {
		this.m_key = m_key;
	}
	public void setMessageProcessor(MessageProcessor p) {
		m_messageprocessor = p;
	}
}
