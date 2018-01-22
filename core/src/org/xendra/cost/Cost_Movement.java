package org.xendra.cost;

import java.sql.ResultSet;
import java.util.ArrayList;

import org.compiere.model.MClient;
import org.compiere.model.MMovement;
import org.compiere.model.MMovementLine;
import org.compiere.model.MPeriod;
import org.compiere.model.MProduct;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_M_Transaction;
import org.compiere.model.reference.REF_M_TransactionMovementType;
import org.compiere.util.Env;

public class Cost_Movement extends Cost {

	public Cost_Movement(int AD_Client_ID, MPeriod period, ResultSet rs, String trxName) {
		super(AD_Client_ID, period, MMovement.class, rs, null, trxName);
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
		MMovement movement = (MMovement) getPO();
		p_lines = loadLines(movement);
		log.fine("Lines=" + p_lines.length);
		return null;
	}

	private X_M_Transaction[] loadLines(MMovement movement) {
		ArrayList<X_M_Transaction> list = new ArrayList<X_M_Transaction>();
		MMovementLine[] lines = movement.getLines(false);
		for (int i = 0; i < lines.length; i++) {
			MMovementLine line = lines[i];
			MProduct product = MProduct.get(getCtx(), line.getM_Product_ID(), null);
			if (product != null)
			{
				if (!product.isCostable())
					continue;
			}			
			X_M_Transaction transactionFrom = new Query(getCtx(), X_M_Transaction.Table_Name, "M_MovementLine_ID = ? AND QtyOutput = ?", null)
			.setParameters(line.getM_MovementLine_ID(), line.getMovementQty()).first();			
			if (transactionFrom == null)
			{
				transactionFrom = new X_M_Transaction(getCtx(), 0, null);
				transactionFrom.setIdentifier(line.getIdentifier());
			}
			//transactionFrom.setC_BPartner_ID(movement.getC_BPartner_ID());
			transactionFrom.setDocumentNo(movement.getDocumentNo());
			transactionFrom.setC_DocType_ID(movement.getC_DocType_ID());
			//transactionFrom.setM_Warehouse_ID(movement.getM_Warehouse_ID());
			
			transactionFrom.setMovementType(REF_M_TransactionMovementType.MovementTo);	
			transactionFrom.setTransactionType(getTransactionType());
			transactionFrom.setM_Locator_ID(line.getM_LocatorTo_ID());
			transactionFrom.setM_Product_ID(line.getM_Product_ID());
			transactionFrom.setLine(line.getLine());
			transactionFrom.setMovementDate(movement.getMovementDate());
			transactionFrom.setMovementQty(line.getMovementQty());
			transactionFrom.setQtyOutput(line.getMovementQty());
			transactionFrom.setM_MovementLine_ID(line.getM_MovementLine_ID());
			transactionFrom.setM_AttributeSetInstance_ID(line.getM_AttributeSetInstance_ID());
			transactionFrom.setAD_Org_ID(line.getAD_Org_ID());
			//transactionFrom.set_CustomColumn(Constants.AD_Client_ID, movement.getAD_Client_ID());		
			transactionFrom.setAD_Table_ID(get_Table_ID());
			transactionFrom.setRecord_ID(movement.getM_Movement_ID());
			transactionFrom.setC_Period_ID(getPeriod().getC_Period_ID());
			transactionFrom.setDocStatus(movement.getDocStatus());
			list.add(transactionFrom);
			//
			X_M_Transaction transactionTo = new Query(getCtx(), X_M_Transaction.Table_Name, "M_MovementLine_ID = ? AND QtyInput = ?", null)
			.setParameters(line.getM_MovementLine_ID(), line.getMovementQty()).first();			
			if (transactionTo == null)
			{
				transactionTo = new X_M_Transaction(getCtx(), 0, null);
				transactionTo.setIdentifier(line.getIdentifier());
			}			
			//transactionTo.setC_BPartner_ID(inout.getC_BPartner_ID());
			transactionTo.setDocumentNo(movement.getDocumentNo());
			transactionTo.setC_DocType_ID(movement.getC_DocType_ID());
			//transaction.setM_Warehouse_ID(inout.getM_Warehouse_ID());

			transactionTo.setMovementType(REF_M_TransactionMovementType.MovementFrom);
			transactionTo.setTransactionType(getTransactionType());
			transactionTo.setM_Locator_ID(line.getM_Locator_ID());
			transactionTo.setM_Product_ID(line.getM_Product_ID());
			transactionTo.setLine(line.getLine());
			transactionTo.setMovementDate(movement.getMovementDate());
			transactionTo.setMovementQty(line.getMovementQty().negate());
			transactionTo.setQtyInput(line.getMovementQty());
			transactionTo.setM_MovementLine_ID(line.getM_MovementLine_ID());
			transactionTo.setM_AttributeSetInstance_ID(line.getM_AttributeSetInstance_ID());
			transactionTo.setAD_Org_ID(line.getAD_Org_ID());
			//transactionTo.set_CustomColumn(Constants.AD_Client_ID, movement.getAD_Client_ID());
			transactionTo.setC_Period_ID(getPeriod().getC_Period_ID());
			transactionTo.setAD_Table_ID(get_Table_ID());
			transactionTo.setRecord_ID(movement.getM_Movement_ID());
			transactionTo.setDocStatus(movement.getDocStatus());
			list.add(transactionTo);			
		}
		// Return Array
		X_M_Transaction[] dls = new X_M_Transaction[list.size()];
		list.toArray(dls);
		return dls;
	} // loadLines
}
