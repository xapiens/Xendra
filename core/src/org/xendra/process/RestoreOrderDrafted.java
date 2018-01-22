package org.xendra.process;

import java.math.BigDecimal;
import java.util.logging.Level;

import org.compiere.model.MAllocationHdr;
import org.compiere.model.MDocType;
import org.compiere.model.MOrder;
import org.compiere.model.MOrderLine;
import org.compiere.model.MPeriod;
import org.compiere.model.MProduct;
import org.compiere.model.MStorage;
import org.compiere.model.MWarehouse;
import org.compiere.model.reference.REF_C_DocTypeSubType;
import org.compiere.model.reference.REF__DocumentAction;
import org.compiere.model.reference.REF__DocumentStatus;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;

public class RestoreOrderDrafted extends SvrProcess {
	private int m_C_Order_ID;
	private boolean bIgnoreInvoices = false;

	@Override
	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("C_Order_ID"))
				m_C_Order_ID = para[i].getParameterAsInt();
			else if (name.equals("IgnoreInvoices"))
				bIgnoreInvoices = ((String)para[i].getParameter()).equals("Y")?true:false;
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}

	@Override
	protected String doIt() throws Exception {
		MOrder order = new MOrder(getCtx(), m_C_Order_ID, get_TrxName());
		MDocType dt = MDocType.get(getCtx(), order.getC_DocType_ID());
		
		if (!MPeriod.isOpen(getCtx(), order.getDateAcct(), dt.getDocBaseType(), Env.getAD_Org_ID(Env.getCtx())))
		{
			return "@Error@: @PeriodClosed@";
		}				

		if (!bIgnoreInvoices) {
			if (order.getInvoices().length > 0) {
				return "@Error@: Order has invoice(s). Delete them first.";
			}
			if (order.getShipments().length > 0) {
				return "@Error@: Order has shipment(s)/receipt(s). Delete them first.";
			}
		}		
		String sql = "DELETE FROM Fact_Acct WHERE AD_Table_ID=" + MOrder.Table_ID + " AND Record_ID=?";					 	
		int no = DB.executeUpdate(sql, order.get_ID(), get_TrxName());
		if (no == -1) return "@Error@";

		MOrderLine lines[] = order.getLines();
		if (!dereserveStock(dt, order, lines))
			return "@Error@";
		
		for (int i = 0; i < lines.length; i++) {
	/*		sql = "DELETE FROM M_CostDetail WHERE C_OrderLine_ID=" + lines[i].get_ID();
			DB.executeUpdate(sql, get_TrxName());*/

			lines[i].setProcessed(false);
			lines[i].save();

		}

		order.setDocStatus(REF__DocumentStatus.Drafted);
		order.setDocAction(REF__DocumentAction.Complete);
		order.setProcessing(false);
		order.setProcessed(false);
		order.setPosted(false);
		order.save(get_TrxName());

		return null;
	}

	private boolean dereserveStock(MDocType dt, MOrder order, MOrderLine lines[]) {
		if (dt == null)
			dt = MDocType.get(getCtx(), order.getC_DocType_ID());

		//	Binding
		boolean binding = !dt.isProposal();
		//	Not binding - i.e. Target=0
		if (REF__DocumentAction.Void.equals(order.getDocAction())
			//	Closing Binding Quotation
			|| (REF_C_DocTypeSubType.Quotation.equals(dt.getDocSubType()) 
				&& REF__DocumentAction.Close.equals(order.getDocAction())) 
			|| order.isDropShip() )
			binding = false;
		boolean isSOTrx = order.isSOTrx();
		log.fine("Binding=" + binding + " - IsSOTrx=" + isSOTrx);
		
		Integer C_Period_ID = MPeriod.get(Env.getCtx(), order.getDateOrdered()).getC_Period_ID();
		
		//	Always check and (un) Reserve Inventory		
		for (int i = 0; i < lines.length; i++)
		{
			MOrderLine line = lines[i];
			//	Binding
			BigDecimal target = binding ? line.getQtyOrdered() : Env.ZERO; 
			BigDecimal difference = line.getQtyOrdered(); 
			
			log.fine("Line=" + line.getLine() 
				+ " - Target=" + target + ",Difference=" + difference
				+ " - Ordered=" + line.getQtyOrdered() 
				+ ",Reserved=" + line.getQtyReserved() + ",Delivered=" + line.getQtyDelivered());

			//	Check Product - Stocked and Item
			MProduct product = line.getProduct();
			if (product != null) 
			{
				if (product.isStocked())
				{
					BigDecimal ordered = isSOTrx ? Env.ZERO : difference;
					BigDecimal reserved = isSOTrx ? difference : Env.ZERO;
					int M_Locator_ID = 0; 
					//	Get Locator to reserve
					if (line.getM_AttributeSetInstance_ID() != 0)	//	Get existing Location
						M_Locator_ID = MStorage.getM_Locator_ID (line.getM_Warehouse_ID(), 
							line.getM_Product_ID(), line.getM_AttributeSetInstance_ID(), 
							ordered, get_TrxName());
					//	Get default Location
					if (M_Locator_ID == 0)
					{
						MWarehouse wh = MWarehouse.get(getCtx(), line.getM_Warehouse_ID());
						M_Locator_ID = wh.getDefaultLocator().getM_Locator_ID();
					}
					//	Update Storage
					if (MStorage.add(getCtx(), line.getM_Warehouse_ID(), M_Locator_ID, 
						line.getM_Product_ID(), 
						line.getM_AttributeSetInstance_ID(), line.getM_AttributeSetInstance_ID(),
						Env.ZERO, reserved.negate(), ordered.negate(), false,	
						C_Period_ID,
						"RestoreOrderDrafted.dereserveStock",
						get_TrxName()).length() > 0)
						return false;
				}	//	stockec
				//	update line
				line.setQtyReserved(line.getQtyReserved().subtract(difference));
				if (!line.save(get_TrxName()))
					return false;
			}	//	product
		}	//	reverse inventory
		
		return true;
	}
}
