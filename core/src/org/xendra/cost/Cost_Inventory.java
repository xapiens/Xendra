package org.xendra.cost;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;

import org.compiere.model.MClient;
import org.compiere.model.MInventory;
import org.compiere.model.MInventoryLine;
import org.compiere.model.MPeriod;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_M_Transaction;
import org.compiere.model.reference.REF_M_InventoryType;
import org.compiere.model.reference.REF_M_TransactionMovementType;
import org.compiere.util.Env;

public class Cost_Inventory extends Cost {

	public Cost_Inventory(int AD_Client_ID, MPeriod period, ResultSet rs, String trxName) {
		super(AD_Client_ID, period, MInventory.class, rs, null, trxName);
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
		MInventory inout = (MInventory) getPO();
		p_lines = loadLines(inout);
		log.fine("Lines=" + p_lines.length);
		return null;
	}

	private X_M_Transaction[] loadLines(MInventory inventory) {		
		ArrayList<X_M_Transaction> list = new ArrayList<X_M_Transaction>();
		MInventoryLine[] lines = inventory.getLines(false);
		for (int i = 0; i < lines.length; i++) {
			MInventoryLine line = lines[i];
			X_M_Transaction transaction = new Query(getCtx(), X_M_Transaction.Table_Name, "M_InOutLine_ID = ?", null)
			.setParameters(line.getM_InventoryLine_ID()).first();
			if (transaction == null)			
			{
				transaction = new X_M_Transaction(getCtx(), 0, null);
				transaction.setIdentifier(line.getIdentifier());
			}
			BigDecimal Qty = null;
			if (line.getInventoryType().equals(REF_M_InventoryType.InventoryDifference))
				Qty = line.getQtyCount().subtract(line.getQtyBook());
			else if (line.getInventoryType().equals(REF_M_InventoryType.InitialCharge))
			{
				Qty = line.getQtyCount();
			}
			else
				Qty = line.getQtyInternalUse();
			//
			if (Qty.signum() > 0)
			{
			  transaction.setMovementType(REF_M_TransactionMovementType.InventoryIn);
			  transaction.setQtyInput(Qty);
			}
			else
			{
			  transaction.setMovementType(REF_M_TransactionMovementType.InventoryOut);
			  transaction.setQtyOutput(Qty.negate());
			}
			//transaction.setC_BPartner_ID(inventory.getC_BPartner_ID());
			transaction.setDocumentNo(inventory.getDocumentNo());
			transaction.setC_DocType_ID(inventory.getC_DocType_ID());
			transaction.setM_Warehouse_ID(inventory.getM_Warehouse_ID());
			transaction.setTransactionType(getTransactionType());
			transaction.setM_Locator_ID(line.getM_Locator_ID());
			transaction.setM_Product_ID(line.getM_Product_ID());
			transaction.setLine(line.getLine());
			transaction.setMovementDate(inventory.getMovementDate());
			transaction.setMovementQty(Qty);			
			transaction.setM_InventoryLine_ID(line.getM_InventoryLine_ID());
			transaction.setInventoryType(line.getInventoryType());
			transaction.setM_AttributeSetInstance_ID(line.getM_AttributeSetInstance_ID());
			transaction.setAD_Org_ID(line.getAD_Org_ID());
			//transaction.set_CustomColumn(Constants.AD_Client_ID, inout.getAD_Client_ID());		
			transaction.setAD_Table_ID(get_Table_ID());
			transaction.setC_Period_ID(getPeriod().getC_Period_ID());
			transaction.setRecord_ID(inventory.getM_Inventory_ID());
			transaction.setDocStatus(inventory.getDocStatus());
			list.add(transaction);
			if (line.getInventoryType().equals(REF_M_InventoryType.InitialCharge))
			{				
				boolean containLocator = false;
				for (Vector point:startpoints)
				{
					Integer locator = (Integer)point.get(0);
					if (locator.equals(line.getM_Locator_ID()))
					{
						containLocator = true;
					}
				}
				if (!containLocator)
				{
					Vector vector = new Vector();
					vector.add(line.getM_Locator_ID());
					vector.add(inventory.getMovementDate());
					startpoints.add(vector);
				}
			}												
		}
		// Return Array
		X_M_Transaction[] dls = new X_M_Transaction[list.size()];
		list.toArray(dls);
		return dls;
	} // loadLines
}
