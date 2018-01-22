package org.xendra.cost;

import java.sql.ResultSet;
import java.util.ArrayList;
import org.compiere.model.MAttributeSetInstance;
import org.compiere.model.MClient;
import org.compiere.model.MInOut;
import org.compiere.model.MInOutLine;
import org.compiere.model.MPeriod;
import org.compiere.model.MProduct;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_M_AttributeSetInstance;
import org.compiere.model.persistence.X_M_Transaction;
import org.compiere.util.DB;
import org.compiere.util.Env;

public class Cost_InOut extends Cost {

	public Cost_InOut(int AD_Client_ID, MPeriod period, ResultSet rs,  String trxName) {
		super(AD_Client_ID, period, MInOut.class, rs, null, trxName);
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
		MInOut inout = (MInOut) getPO();
		p_lines = loadLines(inout);
		log.fine("Lines=" + p_lines.length);
		return null;
	}

	private X_M_Transaction[] loadLines(MInOut inout) {
		ArrayList<X_M_Transaction> list = new ArrayList<X_M_Transaction>();
		MInOutLine[] lines = inout.getLines(false);
		for (int i = 0; i < lines.length; i++) {
			MInOutLine line = lines[i];
			if (line.isDescription() || line.getM_Product_ID() == 0	|| line.getMovementQty().signum() == 0) {
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
			.setParameters(line.getM_InOutLine_ID()).first();
			if (transaction == null)
			{
				transaction = new X_M_Transaction(getCtx(), 0, null);
				transaction.setC_BPartner_ID(inout.getC_BPartner_ID());
				transaction.setDocumentNo(inout.getDocumentNo());
				transaction.setC_DocType_ID(inout.getC_DocType_ID());
				transaction.setM_Warehouse_ID(inout.getM_Warehouse_ID());
				transaction.setIdentifier(line.getIdentifier());
			}
			String sql = String.format("SELECT max(c_invoice_id) FROM c_invoiceline il WHERE il.m_inoutline_id = %s", line.getM_InOutLine_ID());
			int invoiceid = DB.getSQLValue(null, sql);            
			if (invoiceid > 0)
				transaction.setC_Invoice_ID(invoiceid);
			transaction.setMovementType(inout.getMovementType());
			transaction.setTransactionType(getTransactionType());
			transaction.setM_Locator_ID(line.getM_Locator_ID());
			transaction.setM_Product_ID(line.getM_Product_ID());
			transaction.setLine(line.getLine());
			transaction.setMovementDate(inout.getMovementDate());
			if (inout.getMovementType().endsWith("+"))
			{
				transaction.setMovementQty(line.getMovementQty());
				transaction.setQtyInput(line.getMovementQty());
			}
			else
			{
				transaction.setMovementQty(line.getMovementQty().negate());
				transaction.setQtyOutput(line.getMovementQty());
			}
			transaction.setM_InOutLine_ID(line.getM_InOutLine_ID());
			transaction.setC_OrderLine_ID(line.getC_OrderLine_ID());
			if (line.getM_AttributeSetInstance_ID() > 0)
			{
				MAttributeSetInstance mas = new Query(getCtx(), X_M_AttributeSetInstance.Table_Name, "M_AttributeSetInstance_ID = ?", null)
				.setParameters(line.getM_AttributeSetInstance_ID()).first();
				if (mas != null)
					transaction.setM_AttributeSetInstance_ID(line.getM_AttributeSetInstance_ID());
				else
					transaction.setErrorMsg("AttributeSetInstance bad reference ");
			}
			transaction.setAD_Org_ID(line.getAD_Org_ID());
			transaction.setAD_Table_ID(get_Table_ID());
			transaction.setRecord_ID(inout.getM_InOut_ID());
			transaction.setDocStatus(inout.getDocStatus());
			transaction.setC_Period_ID(getPeriod().getC_Period_ID());
			list.add(transaction);
		}

		// Return Array
		X_M_Transaction[] dls = new X_M_Transaction[list.size()];
		list.toArray(dls);
		return dls;
	} // loadLines
}
