package org.xendra.cost;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.compiere.model.MClient;
import org.compiere.model.MInvoice;
import org.compiere.model.MInvoiceLine;
import org.compiere.model.MPeriod;
import org.compiere.model.MProduct;
import org.compiere.model.Query;

import org.compiere.model.persistence.X_M_Transaction;
import org.compiere.model.reference.REF_M_TransactionMovementType;
import org.compiere.util.Env;

public class Cost_Invoice extends Cost {

	public Cost_Invoice(int AD_Client_ID, MPeriod period, ResultSet rs, String trxName) {
		super(AD_Client_ID, period, MInvoice.class, rs, null, trxName);
	}

	@Override
	public X_M_Transaction[] createFacts() {
		ArrayList<X_M_Transaction> list = new ArrayList<X_M_Transaction>();
		for (X_M_Transaction line:p_lines)
		{
			//line.setM_CostElement_ID(getModel().getM_CostElement_ID());
			if (line.save())
				list.add(line);
		}		
		X_M_Transaction[] dls = new X_M_Transaction[list.size()];
		list.toArray(dls);
		return dls;		
	}

	@Override
	protected String loadDocumentDetails() {		
		MInvoice inout = (MInvoice) getPO();
		p_lines = loadLines(inout);
		log.fine("Lines=" + p_lines.length);
		return null;
	}

	private X_M_Transaction[] loadLines(MInvoice invoice) {
		ArrayList<X_M_Transaction> list = new ArrayList<X_M_Transaction>();
		MInvoiceLine[] lines = invoice.getLines(false);
		for (MInvoiceLine line:lines)
		{			
			if (line.isDescription() || line.getM_Product_ID() == 0	|| line.getQtyInvoiced().signum() == 0) {
				log.finer("Ignored: " + line);
				continue;
			}
			MProduct product = MProduct.get(getCtx(), line.getM_Product_ID(), null);
			if (product != null)
			{
				if (!product.isCostable())
					continue;
			}
			X_M_Transaction transaction = new Query(getCtx(), X_M_Transaction.Table_Name, "M_InOutLine_ID = ?", null)
			.setParameters(line.getC_InvoiceLine_ID()).first();
			if (transaction == null)
			{
				transaction = new X_M_Transaction(getCtx(), 0, null);
				transaction.setIdentifier(line.getIdentifier());
			}

			transaction.setC_BPartner_ID(invoice.getC_BPartner_ID());
			transaction.setDocumentNo(invoice.getDocumentNo());
			transaction.setC_DocType_ID(invoice.getC_DocType_ID());
			//transaction.setM_Warehouse_ID(invoice.getM_Warehouse_ID());
			
			transaction.setTransactionType(getTransactionType());
			transaction.setMovementType(REF_M_TransactionMovementType.NotApply);
			//transaction.setM_Locator_ID(invoice.getC_Order_ID().getM_Locator_ID());
			transaction.setM_Product_ID(line.getM_Product_ID());
			transaction.setLine(line.getLine());
			transaction.setMovementDate(invoice.getDateInvoiced());
			transaction.setMovementQty(BigDecimal.ONE);
			transaction.setC_OrderLine_ID(line.getC_OrderLine_ID());
			transaction.setC_InvoiceLine_ID(line.getC_InvoiceLine_ID());
			//transaction.setM_AttributeSetInstance_ID(line.getM_AttributeSetInstance_ID());
			transaction.setAD_Org_ID(line.getAD_Org_ID());
			//transaction.set_CustomColumn(Constants.AD_Client_ID, inout.getAD_Client_ID());		
			transaction.setAD_Table_ID(get_Table_ID());
			transaction.setRecord_ID(invoice.getC_Invoice_ID());
			transaction.setDocStatus(invoice.getDocStatus());
			transaction.setC_Period_ID(getPeriod().getC_Period_ID());
			list.add(transaction);			
		}
		// Return Array
		X_M_Transaction[] dls = new X_M_Transaction[list.size()];
		list.toArray(dls);
		return dls;
	} // loadLines

}
