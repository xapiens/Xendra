package org.xendra.cost;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.compiere.model.MClient;
import org.compiere.model.MPeriod;
import org.compiere.model.MProduction;
import org.compiere.model.MWarehouse;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_M_ProductionLine;
import org.compiere.model.persistence.X_M_ProductionPlan;
import org.compiere.model.persistence.X_M_Transaction;
import org.compiere.model.reference.REF_M_TransactionMovementType;
import org.compiere.util.Env;

public class Cost_Production extends Cost {

	public Cost_Production(int AD_Client_ID, MPeriod period, ResultSet rs, String trxName) {
		super(AD_Client_ID, period, MProduction.class, rs, null, trxName);
	}

	@Override
	public X_M_Transaction[] createFacts() {
		ArrayList<X_M_Transaction> list = new ArrayList<X_M_Transaction>();
		for (X_M_Transaction line:p_lines)
		{
			if (line.save())
				list.add(line);
		}		
		X_M_Transaction[] dls = new X_M_Transaction[list.size()];
		list.toArray(dls);
		return dls;		
	}

	@Override
	protected String loadDocumentDetails() {		
		MProduction inout = (MProduction) getPO();
		p_lines = loadLines(inout);
		log.fine("Lines=" + p_lines.length);
		return null;
	}

	private X_M_Transaction[] loadLines(MProduction production) {
		ArrayList<X_M_Transaction> list = new ArrayList<X_M_Transaction>();
		X_M_ProductionPlan[] plans = production.getLines(false);
		for (X_M_ProductionPlan plan:plans)
		{
			List<X_M_ProductionLine> lines = new Query(getCtx(), X_M_ProductionLine.Table_Name, "M_ProductionPlan_ID = ? ", null)
				.setParameters(plan.getM_ProductionPlan_ID())
				.list();
			int input = 0;
			int output = 0;
			for (X_M_ProductionLine line:lines)
			{							
				if (line.getMovementQty().compareTo(BigDecimal.ZERO) > 0)
					input ++;
				else if (line.getMovementQty().compareTo(BigDecimal.ZERO) < 0)
					output ++;
			}
			if (input > 0 && output > 0)
			{
				for (X_M_ProductionLine line:lines)
				{
					X_M_Transaction transaction = new Query(getCtx(), X_M_Transaction.Table_Name, "M_ProductionLine_ID = ?", null)
						.setParameters(line.getM_ProductionLine_ID()).first();
					if (transaction == null)
					{
						transaction = new X_M_Transaction(getCtx(), 0, null);
						//X_M_Transaction transaction = new X_M_Transaction(Env.getCtx(), 0, null);
						
						MWarehouse wh = MWarehouse.getByLocator(line.getM_Locator_ID());
						if (wh != null)
							transaction.setM_Warehouse_ID(wh.getM_Warehouse_ID());					
						//transaction.setC_BPartner_ID(production.getC_BPartner_ID());
						transaction.setDocumentNo(production.getDocumentNo());
						transaction.setC_DocType_ID(production.getC_DocType_ID());						
					}
					
					
					if (line.getMovementQty().compareTo(BigDecimal.ZERO) > 0)
					{
						transaction.setMovementType(REF_M_TransactionMovementType.ProductionPlus);
						transaction.setQtyInput(line.getMovementQty());
						
					}
					else if (line.getMovementQty().compareTo(BigDecimal.ZERO) < 0)
					{
						transaction.setMovementType(REF_M_TransactionMovementType.Production_);
						transaction.setQtyOutput(line.getMovementQty().negate());
					}
					else
						continue;
					transaction.setTransactionType(getTransactionType());
					transaction.setM_Locator_ID(line.getM_Locator_ID());
					transaction.setM_Product_ID(line.getM_Product_ID());
					transaction.setLine(line.getLine());
					transaction.setM_AttributeSetInstance_ID(line.getM_AttributeSetInstance_ID());
					transaction.setMovementDate(production.getMovementDate());
					transaction.setMovementQty(line.getMovementQty());														
					transaction.setM_ProductionPlan_ID(line.getM_ProductionPlan_ID());
					transaction.setM_ProductionLine_ID(line.getM_ProductionLine_ID());				
					transaction.setAD_Org_ID(line.getAD_Org_ID());
					//transaction.set_CustomColumn(Constants.AD_Client_ID, production.getAD_Client_ID());		
					transaction.setAD_Table_ID(get_Table_ID()); 
					transaction.setRecord_ID(production.getM_Production_ID());
					transaction.setDocStatus(production.getDocStatus());
					transaction.setC_Period_ID(getPeriod().getC_Period_ID());
					list.add(transaction);
				}
			}
			else
			{
				System.out.println("XX");
			}
		}
		
		// Return Array
		X_M_Transaction[] dls = new X_M_Transaction[list.size()];
		list.toArray(dls);
		return dls;
	} // loadLines

}
