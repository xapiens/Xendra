package org.xendra.rules.messages;

import java.io.StringWriter;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;
import java.util.Properties;
import java.util.Vector;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.compiere.model.MBPartner;
import org.compiere.model.MCurrency;
import org.compiere.model.MOrder;
import org.compiere.model.MPaymentTerm;
import org.compiere.model.MPriceList;
import org.compiere.model.MProductBOM;
import org.compiere.model.MUOM;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Client;
import org.compiere.model.persistence.X_AD_Org;
import org.compiere.model.persistence.X_AD_User;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_C_BPartner;
import org.compiere.model.persistence.X_C_BPartner_Location;
import org.compiere.model.persistence.X_C_CampaignBonus;
import org.compiere.model.persistence.X_C_CampaignDiscount;
import org.compiere.model.persistence.X_C_CashBook;
import org.compiere.model.persistence.X_C_Coupon;
import org.compiere.model.persistence.X_C_Currency;
import org.compiere.model.persistence.X_C_DocType;
import org.compiere.model.persistence.X_C_Location;
import org.compiere.model.persistence.X_C_Order;
import org.compiere.model.persistence.X_C_OrderLine;
//import org.compiere.model.persistence.X_C_POS;
//import org.compiere.model.persistence.X_C_POSLog;
import org.compiere.model.persistence.X_C_Payment;
import org.compiere.model.persistence.X_C_Tax;
import org.compiere.model.persistence.X_C_UOM;
import org.compiere.model.persistence.X_M_AttributeSet;
import org.compiere.model.persistence.X_M_AttributeSetInstance;
import org.compiere.model.persistence.X_M_Product;
import org.compiere.model.persistence.X_M_Warehouse;
import org.compiere.model.reference.REF_C_POSLogPaymentType;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.compiere.util.Util;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xendra.Constants;
import org.xendra.transfer.Row;
import org.xendra.xendrian.FormatMessage;

public class message {
	private static final String VERSION = "version";
	private TransformerFactory tFactory = TransformerFactory.newInstance();
	private FormatMessage s = new FormatMessage(Constants.TRANSFERMESSAGE);
	private MOrder m_order;

	public FormatMessage getFormatMessage() {
		return s;
	}

	public String create(Properties p) {
		String error = "";
		try {
//			setOrder((MOrder) p.get(X_C_Order.COLUMNNAME_C_Order_ID));
//			MPriceList pl = MPriceList.get(Env.getCtx(), getOrder().getM_PriceList_ID(), null);			
//			if (pl.getIdentifier().length() == 0)
//			{
//				throw new Exception("PriceList no tiene identifier");
//			}			
//			Timestamp actual = new Timestamp(System.currentTimeMillis());
//			m_order = (MOrder) p.get(X_C_Order.COLUMNNAME_C_Order_ID);
//			List<Row> rows = (List<Row>) p.get("rows");
//			int linesprocessed = 0;
//			for (Row row:rows)
//			{
//				if (row.getM_Product_ID() > 0 && row.getQtyOrdered().compareTo(Env.ZERO) != 0) {
//					String lineno = String.format("Line%d", linesprocessed);
//					s.AddProperty(lineno, X_C_OrderLine.COLUMNNAME_M_Product_ID, row.getProduct().getValue(), row.getProduct().getShortName());
//					s.AddProperty(lineno, X_M_Product.COLUMNNAME_M_AttributeSet_ID,	getid(X_M_AttributeSet.Table_Name,row.getM_AttributeSet_ID()));
//					if (row.getBOMLines() != null) {
//						for (MProductBOM bom : row.getBOMLines()) {
//							if (row.isInvoicePrintDetails()) {
//								s.AddProperty(lineno,X_C_OrderLine.COLUMNNAME_M_Product_ID,bom.getProduct().getValue(), bom.getProduct().getShortName());
//								s.AddProperty(lineno,X_C_OrderLine.COLUMNNAME_QtyEntered,row.getQtyOrdered().multiply(bom.getBOMQty()).toString());
//								s.AddProperty(lineno,X_C_OrderLine.COLUMNNAME_C_UOM_ID, getid(X_C_UOM.Table_Name, bom.getProduct().getC_UOM_ID()) , MUOM.get(Env.getCtx(),bom.getProduct().getC_UOM_ID()).getUOMSymbol());
//								s.AddProperty(lineno,X_C_OrderLine.COLUMNNAME_PriceEntered,Env.ZERO.toString());
//								s.AddProperty(lineno,X_C_OrderLine.COLUMNNAME_LineNetAmt,BigDecimal.ZERO.toString());
//							}
//						}
//					}
//					s.AddProperty(lineno,	X_C_OrderLine.COLUMNNAME_PriceActual, row.getPriceActual().toString());
//					s.AddProperty(lineno,	X_C_OrderLine.COLUMNNAME_PriceList, row.getPriceList().toString());
//					s.AddProperty(lineno,	X_C_OrderLine.COLUMNNAME_PriceLimit, row.getPriceLimit().toString());
//					s.AddProperty(lineno,	X_C_OrderLine.COLUMNNAME_PriceEntered, row.getPriceEntered().toString());
//					s.AddProperty(lineno,	X_C_OrderLine.COLUMNNAME_QtyOrdered, row.getQtyOrdered().toString());
//					s.AddProperty(lineno,	X_C_OrderLine.COLUMNNAME_QtyEntered, row.getQtyEntered().toString());
//					s.AddProperty(lineno,	X_C_OrderLine.COLUMNNAME_PriceBase, row.getPriceBase().toString());
//					s.AddProperty(lineno,	X_C_OrderLine.COLUMNNAME_Discount, row.getDiscount().toString());
//					s.AddProperty(lineno,	X_C_OrderLine.COLUMNNAME_Discount1, row.getDiscount1().toString());
//					s.AddProperty(lineno,   X_C_OrderLine.COLUMNNAME_Discount2, row.getDiscount2().toString());
//					s.AddProperty(lineno,   X_C_OrderLine.COLUMNNAME_Discount3, row.getDiscount3().toString());
//					s.AddProperty(lineno,   X_C_OrderLine.COLUMNNAME_Discount4, row.getDiscount4().toString());
//					s.AddProperty(lineno,   X_C_OrderLine.COLUMNNAME_M_AttributeSetInstance_ID,getid(X_M_AttributeSetInstance.Table_Name, row.getM_AttributeSetInstance_ID()));
//					s.AddProperty(lineno, X_C_OrderLine.COLUMNNAME_Ref_AttributeSetInstance_ID,getid(X_M_AttributeSetInstance.Table_Name, row.getRef_AttributeSetInstance_ID()));					
//					s.AddProperty(lineno, X_C_OrderLine.COLUMNNAME_IsBonus,row.IsBonus() ? "Y" : "N");
//					s.AddProperty(lineno,X_C_OrderLine.COLUMNNAME_C_Tax_ID,getid(X_C_Tax.Table_Name, row.getC_Tax_ID()));
//					MUOM uom = MUOM.get(Env.getCtx(), row.getC_UOM_ID());
//					s.AddProperty(lineno,X_C_OrderLine.COLUMNNAME_C_UOM_ID, uom.getIdentifier(), uom.getUOMSymbol());
//					s.AddProperty(lineno,X_C_OrderLine.COLUMNNAME_C_CampaignBonus_ID,getid(X_C_CampaignBonus.Table_Name, row.getC_CampaignBonus_ID()));
//					s.AddProperty(lineno,X_C_OrderLine.COLUMNNAME_C_CampaignDiscount_ID,getid(X_C_CampaignDiscount.Table_Name, row.getC_CampaignDiscount_ID()));
//					s.AddProperty(lineno,X_C_OrderLine.COLUMNNAME_LineNetAmt, row.getTotal().toString());
//					s.AddProperty(lineno,X_M_Product.COLUMNNAME_ShortName,row.getProduct().getShortName());
//					s.AddProperty(lineno,X_C_OrderLine.COLUMNNAME_PriceEntered, row.getPriceEntered().toString());
//					s.AddProperty(lineno,X_C_OrderLine.COLUMNNAME_Identifier, Util.getUUID());
//					linesprocessed++;
//				} 
//			}
//			if (linesprocessed == 0) {
//				throw new Exception("ninguna linea pudo ser completada");
//			} else {
//				s.AddProperty(Constants.HEADER,VERSION,"2.0");
//				s.AddProperty(Constants.HEADER, Constants.ID, Util.getUUID());
//				s.AddProperty(Constants.HEADER, Constants.COLUMNNAME_AD_Client_ID, getid(X_AD_Client.Table_Name,Env.getAD_Client_ID(Env.getCtx())));
//				s.AddProperty(Constants.HEADER, Constants.COLUMNNAME_AD_Org_ID, getid(X_AD_Org.Table_Name, Env.getAD_Org_ID(Env.getCtx())));				
//				MCurrency currency = MCurrency.get(Env.getCtx(), getOrder().getC_Currency_ID());
//				s.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_C_Currency_ID, currency.getIdentifier());
//				s.AddProperty(Constants.HEADER, Constants.AD_User_ID,getid(X_AD_User.Table_Name, Env.getAD_User_ID(Env.getCtx())));
//				s.AddProperty(Constants.HEADER, Constants.COLUMNNAME_Created, actual.toString().substring(0, 16));
//				s.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_SalesRep_ID, getid(X_AD_User.Table_Name,getOrder().getSalesRep_ID()), getname(X_AD_User.Table_Name, getOrder().getSalesRep_ID()));
//				s.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_C_BPartner_ID, getid(X_C_BPartner.Table_Name, getOrder().getC_BPartner_ID()),	getname(X_C_BPartner.Table_Name, getOrder().getC_BPartner_ID()));
//				s.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_C_BPartner_Location_ID, getid(X_C_BPartner_Location.Table_Name, getOrder().getC_BPartner_Location_ID()), 
//						(String) p.get(X_C_Order.COLUMNNAME_C_BPartner_Location_ID) );
//				String TaxID = MBPartner.get(Env.getCtx(), getOrder().getC_BPartner_ID()).getTaxID();
//				if (TaxID == null)
//					TaxID = "";
//				s.AddProperty(Constants.HEADER, X_C_BPartner.COLUMNNAME_TaxID, TaxID);
//				s.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_GrandTotal, p.get(Constants.A_TOTALNET).toString());
//				s.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_DifferenceAmt, getOrder().getDifferenceAmt().toString());
//				s.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_DebtAmt, getOrder().getDebtAmt().toString());
//				s.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_PrinterSerial, p.get(X_C_Order.COLUMNNAME_PrinterSerial));
//				s.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_MachineSerial, p.get(X_C_Order.COLUMNNAME_MachineSerial));
//				MPaymentTerm pt = new MPaymentTerm(Env.getCtx(), getOrder().getC_PaymentTerm_ID(), null);
//				s.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_C_PaymentTerm_ID,	pt.getValue(), pt.getName());
//				String AmountInText = Msg.getAmtInWords(Env.getLanguage(Env.getCtx()), p.get(Constants.A_TOTALNET).toString()).concat(" ").concat(currency.getDescription());
//				s.AddProperty(Constants.HEADER, "AmountInText", AmountInText);
//				s.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_M_PriceList_ID, pl.getIdentifier());
//				s.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_C_DocType_ID, getid(X_C_DocType.Table_Name, getOrder().getC_DocType_ID()));
//				s.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_C_DocTypeTarget_ID, getid(X_C_DocType.Table_Name, getOrder().getC_DocTypeTarget_ID()));
//				s.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_M_Warehouse_ID, getid(X_M_Warehouse.Table_Name, getOrder().getM_Warehouse_ID()));
//				s.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_Pay_BPartner_ID,	getid(X_C_BPartner.Table_Name, getOrder().getPay_BPartner_ID()));
//				s.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_Bill_BPartner_ID,  getid(X_C_BPartner.Table_Name, getOrder().getBill_BPartner_ID()), 
//						getname(X_C_BPartner.Table_Name, getOrder().getBill_BPartner_ID()));
//				s.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_Bill_Location_ID, getid(X_C_Location.Table_Name, getOrder().getBill_Location_ID()),
//						(String) p.get(X_C_Order.COLUMNNAME_Bill_Location_ID));
//				s.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_Bill_User_ID, getid(X_AD_User.Table_Name, getOrder().getBill_User_ID()));
//				s.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_POReference,	getOrder().getPOReference());
//				s.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_Description,	getOrder().getDescription());
//				s.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_IsDiscountPrinted,	getOrder().isDiscountPrinted() ? "Y" : "N");
//				s.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_InvoiceRule,	getOrder().getInvoiceRule());
//				s.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_DeliveryRule,	getOrder().getDeliveryRule());
//				s.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_PaymentRule,	getOrder().getPaymentRule());
//				s.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_FreightCostRule, getOrder().getFreightCostRule());
//				s.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_PriorityRule, getOrder().getPriorityRule());
//				s.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_DeliveryViaRule, getOrder().getDeliveryViaRule());
//				s.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_C_BPartner_Points_ID,	String.valueOf(getOrder().getC_BPartner_Points_ID()));
//				// each document created must be a new identifier because the identifier is called in the server
//				// in case the process was interrupted by hangout or something.
//				s.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_Identifier, Util.getUUID());
//				s.AddProperty(Constants.HEADER, X_C_POSLog.COLUMNNAME_C_POS_ID,	getid(X_C_POS.Table_Name, (Integer) p.get(X_C_POSLog.COLUMNNAME_C_POS_ID)));
//				s.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_WriteOffAmt, getOrder().getWriteOffAmt());
//				s.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_WriteOffType, getOrder().getWriteOffType());
//				s.AddProperty(Constants.HEADER, Constants.WriteOffName, p.get(Constants.WriteOffName));
//				Boolean initialized = false;
//				s.AddProperty(Constants.LINES, Constants.Count, linesprocessed);
//			}			
//			s.AddProperty(Constants.HEADER, Constants.SubTotal, getOrder().getGrandTotal().subtract(getOrder().getTaxAmt()).toString());
//			s.AddProperty(Constants.HEADER, X_C_OrderLine.COLUMNNAME_C_Tax_ID,	getOrder().getTaxAmt().toString());
//			s.AddProperty(Constants.XML_ATTRIBUTE_PAYCASH, 	X_C_Order.COLUMNNAME_GrandTotal, p.get(Constants.A_CASH));
//			s.AddProperty(Constants.XML_ATTRIBUTE_PAYCREDIT,X_C_Order.COLUMNNAME_GrandTotal, p.get(Constants.A_CREDIT));
//			s.AddProperty(Constants.XML_ATTRIBUTE_PAYMENT, X_C_Order.COLUMNNAME_GrandTotal, p.get(Constants.A_PAY));
//			s.AddProperty(Constants.XML_ATTRIBUTE_PAYCOUPON,X_C_Order.COLUMNNAME_GrandTotal, p.get(Constants.A_COUPON));									
//			//s.AddProperty(Constants.HEADER,	X_C_POSLog.COLUMNNAME_C_DocTypeOrder_ID, p.get(X_C_POSLog.COLUMNNAME_C_DocTypeOrder_ID));
//			s.AddProperty(Constants.HEADER,	"C_DocTypeOrder_ID", p.get("C_DocTypeOrder_ID"));
//			s.AddProperty(Constants.HEADER, X_C_DocType.COLUMNNAME_LineCount,	String.valueOf(rows.size()));
//			s.AddProperty(Constants.HEADER, X_A_Machine.COLUMNNAME_A_Machine_ID, p.get(X_A_Machine.COLUMNNAME_A_Machine_ID));
//			s.AddProperty(Constants.HEADER,	X_C_CashBook.COLUMNNAME_C_CashBook_ID, p.get(X_C_CashBook.COLUMNNAME_C_CashBook_ID));
//			if (((BigDecimal) p.get(Constants.A_PAY)).compareTo(Env.ZERO) != 0) {
//				s.AddProperty(Constants.XML_ATTRIBUTE_PAY, Constants.XML_ATTRIBUTE_PAYMENT,	p.get(Constants.A_PAY));
//				s.AddProperty(Constants.PAYMENT, X_C_Payment.COLUMNNAME_C_BPartner_ID, getid(X_C_BPartner.Table_Name, getOrder().getC_BPartner_ID()));
//				s.AddProperty(Constants.PAYMENT, X_C_Payment.COLUMNNAME_C_DocType_ID, "Y");
//				s.AddProperty(Constants.PAYMENT, X_C_Payment.COLUMNNAME_PayAmt, p.get(Constants.A_PAY).toString());
//				s.AddProperty(Constants.PAYMENT, X_C_Payment.COLUMNNAME_C_BankAccount_ID, p.get(X_C_Payment.COLUMNNAME_C_BankAccount_ID));
//				s.AddProperty(Constants.PAYMENT, X_C_Payment.COLUMNNAME_TrxType, p.get(X_C_Payment.COLUMNNAME_TrxType));
//				s.AddProperty(Constants.PAYMENT, X_C_Payment.COLUMNNAME_CreditCardNumber, p.get(X_C_Payment.COLUMNNAME_CreditCardNumber));
//				s.AddProperty(Constants.HEADER, X_C_Payment.COLUMNNAME_CreditCardNumber, p.get(X_C_Payment.COLUMNNAME_CreditCardNumber));
//				s.AddProperty(Constants.PAYMENT, X_C_Payment.COLUMNNAME_CreditCardType, p.get(X_C_Payment.COLUMNNAME_CreditCardType));
//				s.AddProperty(Constants.PAYMENT, X_C_Payment.COLUMNNAME_TenderType, p.get(X_C_Payment.COLUMNNAME_TenderType));
//				s.AddProperty(Constants.PAYMENT, X_C_Payment.COLUMNNAME_CheckNo, p.get(X_C_Payment.COLUMNNAME_CheckNo));
//				//s.AddProperty(Constants.PAYMENT, X_C_POSLog.COLUMNNAME_PaymentType,		REF_C_POSLogPaymentType.Credit);
//				s.AddProperty(Constants.PAYMENT, "PaymentType",	REF_C_POSLogPaymentType.Credit);
//				s.AddProperty(Constants.PAYMENT, X_C_Payment.COLUMNNAME_Identifier, p.get(X_C_Payment.COLUMNNAME_Identifier));
//			}
//			if (((BigDecimal) p.get(Constants.A_COUPON)).compareTo(BigDecimal.ZERO) != 0) {
//				s.AddProperty(Constants.XML_ATTRIBUTE_PAY, Constants.XML_ATTRIBUTE_PAYCOUPON, p.get(Constants.A_COUPON));
//				List<X_C_Coupon> m_Coupons = (List<X_C_Coupon>) p.get(X_C_Coupon.COLUMNNAME_C_Coupon_ID);
//				if (m_Coupons.size() > 0) {
//					s.AddProperty(Constants.COUPON, Constants.Count, m_Coupons.size());
//					int count = 0;
//					for (X_C_Coupon coupon:m_Coupons)
//					{
//						String couponno = String.format("Coupon%d", count);
//						s.AddProperty(couponno, X_C_Coupon.COLUMNNAME_C_BPartner_ID, getid(X_C_BPartner.Table_Name, coupon.getC_BPartner_ID()));
//						s.AddProperty(couponno, X_C_Coupon.COLUMNNAME_Identifier, coupon.getIdentifier());
//						s.AddProperty(couponno, X_C_Coupon.COLUMNNAME_C_Currency_ID, getid(X_C_Currency.Table_Name, coupon.getC_Currency_ID()));
//						s.AddProperty(couponno, X_C_Coupon.COLUMNNAME_DocumentNo, coupon.getDocumentNo());
//						s.AddProperty(couponno, X_C_Coupon.COLUMNNAME_GrandTotal, coupon.getGrandTotal());
//						count++;
//					}
//				} else {
//					s.AddProperty(Constants.COUPON, Constants.Count, 0);
//				}				
//			}
//			if (((BigDecimal) p.get(Constants.A_CREDIT)).compareTo(BigDecimal.ZERO) != 0) {
//				s.AddProperty(Constants.XML_ATTRIBUTE_PAY, Constants.XML_ATTRIBUTE_PAYCREDIT, p.get(Constants.A_CREDIT));
//			}
//			Timestamp today = new Timestamp(System.currentTimeMillis());
//			s.AddProperty(Constants.HEADER, X_C_POSLog.COLUMNNAME_DateTrx,	today.toString());
//
//			List<Vector> m_lostSales = (List<Vector>) p.get(X_C_OrderLine.COLUMNNAME_QtyLostSales);
//			if (m_lostSales.size() > 0) {
//				s.AddProperty(Constants.LOSTSALES, Constants.Count, m_lostSales.size());
//				int count = 0;
//				for (Vector lostsale:m_lostSales)
//				{
//					String slno = String.format("SalesLost%d", count);
//					s.AddProperty(slno, X_C_OrderLine.COLUMNNAME_M_Product_ID, lostsale.elementAt(0));
//					s.AddProperty(slno, X_C_OrderLine.COLUMNNAME_C_UOM_ID, lostsale.elementAt(1));
//					s.AddProperty(slno, X_C_OrderLine.COLUMNNAME_QtyLostSales, lostsale.elementAt(2));
//					count++;					
//				}
//			}
//			s.AddProperty(Constants.HEADER,	X_C_DocType.COLUMNNAME_C_PrinterDocumentFormat_ID, p.get(X_C_DocType.COLUMNNAME_C_PrinterDocumentFormat_ID));
//			s.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_SerialToInvoice, p.get(X_C_Order.COLUMNNAME_SerialToInvoice));
//			s.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_DocumentNoToInvoice, p.get(X_C_Order.COLUMNNAME_DocumentNoToInvoice));
		} //
		catch (Exception e) {
			e.printStackTrace();
			error = e.getMessage();
		} finally {

		}
		return error;
	}
	
	public String getMessage() {
		StringBuffer txtxml = new StringBuffer();
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.newDocument();

			Element pos = document
					.createElement(Constants.XML_ATTRIBUTE_POS);
			document.appendChild(pos);
			s.setAttribute(pos, Constants.HEADER, Constants.ID);			
			s.setAttribute(pos, Constants.HEADER, VERSION);
			s.setAttribute(pos, Constants.HEADER, Constants.COLUMNNAME_AD_Client_ID);
			s.setAttribute(pos, Constants.HEADER, Constants.COLUMNNAME_AD_Org_ID);
			s.setAttribute(pos, Constants.HEADER, Constants.AD_User_ID);
			s.setAttribute(pos, Constants.HEADER, X_C_Currency.COLUMNNAME_C_Currency_ID);
			//
			s.setAttribute(pos, Constants.HEADER, X_C_Order.COLUMNNAME_SerialToInvoice);
			s.setAttribute(pos, Constants.HEADER, X_C_Order.COLUMNNAME_DocumentNoToInvoice);
			s.setAttribute(pos, Constants.HEADER, X_C_Order.COLUMNNAME_M_PriceList_ID);
			//s.setAttribute(pos, Constants.HEADER, X_C_POSLog.COLUMNNAME_DateTrx);
			s.setAttribute(pos, Constants.HEADER, X_C_Order.COLUMNNAME_C_DocType_ID);
			s.setAttribute(pos, Constants.HEADER, X_C_Order.COLUMNNAME_C_DocTypeTarget_ID);
			s.setAttribute(pos, Constants.HEADER, X_C_Order.COLUMNNAME_M_Warehouse_ID);
			s.setAttribute(pos, Constants.HEADER, X_C_Order.COLUMNNAME_C_BPartner_ID);
			s.setAttribute(pos, Constants.HEADER, X_C_Order.COLUMNNAME_SalesRep_ID);
			s.setAttribute(pos, Constants.HEADER, X_C_Order.COLUMNNAME_Pay_BPartner_ID);
			s.setAttribute(pos, Constants.HEADER, X_C_Order.COLUMNNAME_Bill_BPartner_ID);
			s.setAttribute(pos, Constants.HEADER, X_C_Order.COLUMNNAME_Bill_Location_ID);
			s.setAttribute(pos, Constants.HEADER, X_C_Order.COLUMNNAME_C_BPartner_Location_ID);
			//s.setAttribute(pos, Constants.HEADER, X_C_POSLog.COLUMNNAME_C_DocTypeOrder_ID);
			s.setAttribute(pos, Constants.HEADER, "C_DocTypeOrder_ID");
			s.setAttribute(pos, Constants.HEADER, X_C_DocType.COLUMNNAME_LineCount);
			s.setAttribute(pos, Constants.HEADER, X_A_Machine.COLUMNNAME_A_Machine_ID);
			s.setAttribute(pos, Constants.HEADER, X_C_Order.COLUMNNAME_MachineSerial);
			s.setAttribute(pos, Constants.HEADER, X_C_Order.COLUMNNAME_PrinterSerial);
			s.setAttribute(pos, Constants.HEADER, X_C_Order.COLUMNNAME_AD_User_ID);
			s.setAttribute(pos, Constants.HEADER, X_C_Order.COLUMNNAME_Bill_User_ID);
			s.setAttribute(pos, Constants.HEADER, X_C_Order.COLUMNNAME_POReference);
			s.setAttribute(pos, Constants.HEADER, X_C_Order.COLUMNNAME_Description);
			s.setAttribute(pos, Constants.HEADER, X_C_Order.COLUMNNAME_IsDiscountPrinted);
			s.setAttribute(pos, Constants.HEADER, X_C_Order.COLUMNNAME_InvoiceRule);
			s.setAttribute(pos, Constants.HEADER, X_C_Order.COLUMNNAME_DeliveryRule);
			s.setAttribute(pos, Constants.HEADER, X_C_Order.COLUMNNAME_PaymentRule);
			s.setAttribute(pos, Constants.HEADER, X_C_Order.COLUMNNAME_C_PaymentTerm_ID);
			s.setAttribute(pos, Constants.HEADER, X_C_Order.COLUMNNAME_FreightCostRule);
			s.setAttribute(pos, Constants.HEADER, X_C_Order.COLUMNNAME_DeliveryViaRule);
			s.setAttribute(pos, Constants.HEADER, X_C_Order.COLUMNNAME_FreightCostRule);
			s.setAttribute(pos, Constants.HEADER, X_C_Order.COLUMNNAME_PriorityRule);
			s.setAttribute(pos, Constants.HEADER, X_C_Order.COLUMNNAME_DifferenceAmt);
			s.setAttribute(pos, Constants.HEADER, X_C_Order.COLUMNNAME_DebtAmt);
			s.setAttribute(pos, Constants.HEADER, X_C_Order.COLUMNNAME_C_BPartner_Points_ID);
//			s.setAttribute(pos, Constants.HEADER, X_C_POS.COLUMNNAME_C_POS_ID);
			//
			s.setAttribute(pos, Constants.HEADER, X_C_Order.COLUMNNAME_Bill_BPartner_ID);
			s.setAttribute(pos, Constants.HEADER, X_C_Order.COLUMNNAME_WriteOffType);
			s.setAttribute(pos, Constants.HEADER, X_C_Order.COLUMNNAME_WriteOffAmt);
			//
			s.setAttribute(pos, Constants.HEADER, X_C_Order.COLUMNNAME_Identifier);
			int lines = (Integer) s.getProperty(Constants.LINES, Constants.Count);
			for (int i = 0; i < lines; i++) {
				String lineno = String.format("Line%d", i);
				Element item = document.createElement(Constants.XML_ATTRIBUTE_POSITEM);
				pos.appendChild(item);
				s.setAttribute(item, lineno, X_C_OrderLine.COLUMNNAME_C_BPartner_ID);
				s.setAttribute(item, lineno, X_C_OrderLine.COLUMNNAME_C_BPartner_Location_ID);
				s.setAttribute(item, lineno, X_C_OrderLine.COLUMNNAME_M_Warehouse_ID);
				s.setAttribute(item, lineno, X_C_OrderLine.COLUMNNAME_M_Product_ID);
				s.setAttribute(item, lineno, X_M_Product.COLUMNNAME_Value);
				s.setAttribute(item, lineno, X_C_OrderLine.COLUMNNAME_PriceActual);
				s.setAttribute(item, lineno, X_C_OrderLine.COLUMNNAME_PriceList);
				s.setAttribute(item, lineno, X_C_OrderLine.COLUMNNAME_PriceLimit);
				s.setAttribute(item, lineno, X_C_OrderLine.COLUMNNAME_PriceEntered);
				s.setAttribute(item, lineno, X_C_OrderLine.COLUMNNAME_QtyOrdered);
				s.setAttribute(item, lineno, X_C_OrderLine.COLUMNNAME_QtyEntered);
				s.setAttribute(item, lineno, X_C_OrderLine.COLUMNNAME_PriceBase);
				s.setAttribute(item, lineno, X_C_OrderLine.COLUMNNAME_Discount);
				s.setAttribute(item, lineno, X_C_OrderLine.COLUMNNAME_Discount1);
				s.setAttribute(item, lineno, X_C_OrderLine.COLUMNNAME_Discount2);
				s.setAttribute(item, lineno, X_C_OrderLine.COLUMNNAME_Discount3);
				s.setAttribute(item, lineno, X_C_OrderLine.COLUMNNAME_Discount4);
				s.setAttribute(item, lineno, X_C_OrderLine.COLUMNNAME_M_AttributeSetInstance_ID);
				s.setAttribute(item, lineno, X_C_OrderLine.COLUMNNAME_Ref_AttributeSetInstance_ID);
				s.setAttribute(item, lineno, X_C_OrderLine.COLUMNNAME_IsBonus);
				s.setAttribute(item, lineno, X_C_OrderLine.COLUMNNAME_C_Tax_ID);
				s.setAttribute(item, lineno, X_C_OrderLine.COLUMNNAME_C_UOM_ID);
				s.setAttribute(item, lineno, X_C_OrderLine.COLUMNNAME_C_CampaignBonus_ID);
				s.setAttribute(item, lineno, X_C_OrderLine.COLUMNNAME_C_CampaignDiscount_ID);
				s.setAttribute(item, lineno, X_C_OrderLine.COLUMNNAME_Identifier);
				s.setAttribute(item, lineno, X_C_OrderLine.COLUMNNAME_LineNetAmt);				
			}
			Element pay = document.createElement(Constants.XML_ATTRIBUTE_PAY);
			pos.appendChild(pay);			

			BigDecimal cashAmount = (BigDecimal) s.getProperty(Constants.XML_ATTRIBUTE_PAYCASH, X_C_Order.COLUMNNAME_GrandTotal);
			if (cashAmount.compareTo(BigDecimal.ZERO) > 0) {
				Element cash = document.createElement(Constants.XML_ATTRIBUTE_PAYCASH);
				pay.appendChild(cash);
				s.setAttribute(cash, Constants.HEADER, X_C_CashBook.COLUMNNAME_C_CashBook_ID);
				s.setAttribute(cash, Constants.XML_ATTRIBUTE_PAYCASH, X_C_Order.COLUMNNAME_GrandTotal);
				s.setAttribute(cash, Constants.HEADER, Constants.WriteOffName);
				s.setAttribute(cash, Constants.HEADER, X_C_Order.COLUMNNAME_WriteOffType);
				s.setAttribute(cash, Constants.HEADER, X_C_Order.COLUMNNAME_WriteOffAmt);
			}

			BigDecimal creditAmount = (BigDecimal) s.getProperty(Constants.XML_ATTRIBUTE_PAYCREDIT, X_C_Order.COLUMNNAME_GrandTotal);
			if (creditAmount.compareTo(BigDecimal.ZERO) > 0) {
				Element credit = document.createElement(Constants.XML_ATTRIBUTE_PAYCREDIT);
				pay.appendChild(credit);
				s.setAttribute(credit, Constants.XML_ATTRIBUTE_PAYCREDIT, X_C_Order.COLUMNNAME_GrandTotal);
			}			

			BigDecimal payAmount = (BigDecimal) s.getProperty(Constants.XML_ATTRIBUTE_PAYMENT, X_C_Order.COLUMNNAME_GrandTotal);
			if (payAmount.compareTo(BigDecimal.ZERO) > 0) {
				Element payment = document.createElement(Constants.XML_ATTRIBUTE_PAYMENT);
				pay.appendChild(payment);
				s.setAttribute(payment, Constants.PAYMENT, X_C_Payment.COLUMNNAME_C_BPartner_ID);
				s.setAttribute(payment, Constants.PAYMENT, X_C_Payment.COLUMNNAME_C_DocType_ID);
				s.setAttribute(payment, Constants.PAYMENT, X_C_Payment.COLUMNNAME_PayAmt);
				s.setAttribute(payment, Constants.PAYMENT, X_C_Payment.COLUMNNAME_C_BankAccount_ID);
				s.setAttribute(payment, Constants.PAYMENT, X_C_Payment.COLUMNNAME_TrxType);
				s.setAttribute(payment, Constants.PAYMENT, X_C_Payment.COLUMNNAME_CreditCardNumber);
				s.setAttribute(payment, Constants.PAYMENT, X_C_Payment.COLUMNNAME_CreditCardType);
				s.setAttribute(payment, Constants.PAYMENT, X_C_Payment.COLUMNNAME_TenderType);
				s.setAttribute(payment, Constants.PAYMENT, X_C_Payment.COLUMNNAME_CheckNo); 
				s.setAttribute(payment, Constants.PAYMENT, X_C_Payment.COLUMNNAME_C_Currency_ID);
				//s.setAttribute(payment, Constants.PAYMENT, X_C_POSLog.COLUMNNAME_PaymentType);
				s.setAttribute(payment, Constants.PAYMENT, "PaymentType");
			}
			BigDecimal payCoupon = (BigDecimal) s.getProperty(Constants.XML_ATTRIBUTE_PAYCOUPON, X_C_Order.COLUMNNAME_GrandTotal);
			if (payCoupon.compareTo(BigDecimal.ZERO) > 0) {
				lines = (Integer) s.getProperty(Constants.COUPON, Constants.Count);
				if (lines > 0) {
					Element paycoupon = document.createElement(Constants.XML_ATTRIBUTE_PAYCOUPON);
					pay.appendChild(paycoupon);
					for (int i = 0; i < lines; i++) {
						Element coupon = document.createElement(Constants.XML_ATTRIBUTE_COUPON);
						paycoupon.appendChild(coupon);
						String lineno = String.format("Coupon%d", i);
						s.setAttribute(coupon, lineno, X_C_Coupon.COLUMNNAME_C_BPartner_ID);
						s.setAttribute(coupon, lineno, X_C_Coupon.COLUMNNAME_Identifier);
						s.setAttribute(coupon, lineno, X_C_Coupon.COLUMNNAME_C_Currency_ID);
						s.setAttribute(coupon, lineno, X_C_Coupon.COLUMNNAME_DocumentNo);
						s.setAttribute(coupon, lineno, X_C_Coupon.COLUMNNAME_GrandTotal);					
					}
				}				
			}			
			DOMSource source = new DOMSource(document);
			StringWriter writer = new StringWriter();
			StreamResult result = new StreamResult(writer);
			writer = new StringWriter();
			result = new StreamResult(writer);
			Transformer transformer = tFactory.newTransformer();
			transformer.setOutputProperty(
					javax.xml.transform.OutputKeys.INDENT, "yes");
			transformer.transform(source, result);
			txtxml = writer.getBuffer();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return txtxml.toString();
	}

	private String getname(String tableName, int uid) {
		String name = "";
		PO po = new Query(Env.getCtx(), tableName, String.format("%s_ID = ?", tableName), null).setParameters(uid).first();
		if (po != null) {
			if (po.get_ColumnIndex(X_AD_Client.COLUMNNAME_Name) > 0) {
				name = (String) po.get_Value(X_AD_Client.COLUMNNAME_Name);
			}			
		}
		return name;
	}
	private String getid(String tableName, int uid) {
		String id = "";
		PO po = new Query(Env.getCtx(), tableName, String.format("%s_ID = ?", tableName), null).setParameters(uid).first();
		if (po != null) {
			if (po.get_ColumnIndex(X_AD_Client.COLUMNNAME_Value) > 0) {
				id = (String) po.get_Value(X_AD_Client.COLUMNNAME_Value);
				if (id == null)
					id = "NSD";
			}
			else if (po.get_ColumnIndex(X_AD_Client.COLUMNNAME_Identifier) > 0) {
				id = (String) po.get_Value(X_AD_Client.COLUMNNAME_Identifier);				
				if (id == null)
					id = "NSD";
			}			
		}
		return id;
	}
	private MOrder getOrder() {
		return m_order;
	}
	private void setOrder(MOrder order) {
		m_order = order;
	}
	public Object getProperty(String area, String property) {
		return s.getProperty(area, property);
	}
}