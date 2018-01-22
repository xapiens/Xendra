package org.xendra.process;

import java.math.BigDecimal;
import java.util.logging.Level;

import org.compiere.model.MDocType;
import org.compiere.model.MFactAcct;
import org.compiere.model.MInOut;
import org.compiere.model.MInOutLine;
import org.compiere.model.MOrderLine;
import org.compiere.model.MPeriod;
import org.compiere.model.MProduct;
import org.compiere.model.MStorage;
import org.compiere.model.MTable;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;

public class RestoreShipment extends SvrProcess {
	private int m_AD_Org_ID;
	private int m_AD_Client_ID;
	private int m_M_InOut_ID;

	protected void prepare ()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("AD_Org_ID"))
				m_AD_Org_ID = para[i].getParameterAsInt();
			else if (name.equals("AD_Client_ID"))
				m_AD_Client_ID = para[i].getParameterAsInt();
			else if (name.equals("M_InOut_ID"))
				m_M_InOut_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}

	}
	
	protected String doIt () throws Exception
	{
		// el_man 10/09/07 
		MInOut inout = new MInOut(this.getCtx(), m_M_InOut_ID, this.get_TrxName());
		
		MDocType dt = MDocType.get(getCtx(), inout.getC_DocType_ID());
		
		if (!MPeriod.isOpen(getCtx(), inout.getDateAcct(), dt.getDocBaseType(), Env.getAD_Org_ID(Env.getCtx())))
		{
			//m_processMsg = "@PeriodClosed@";
			return "@Error@: @PeriodClosed@";
		}				
		inout.setDocStatus("DR");
		inout.setDocAction("CO");
		inout.setProcessing(false);
		inout.setProcessed(false);
		inout.setPosted(false);
		inout.setIsApproved(false);
		
		Integer C_Period_ID = MPeriod.get(Env.getCtx(), inout.getMovementDate()).getC_Period_ID();
		
		MInOutLine lines[] = inout.getLines();
		
		for (int i = 0; i < lines.length; i++) {
			lines[i].setProcessed(false);
			lines[i].save(this.get_TrxName());			

			if (lines[i].getM_Product_ID() != 0) {
				MProduct product = lines[i].getProduct();

				// TODO: Arana , removed , MCost not in use.
			/*	String sql = "DELETE FROM M_CostDetail WHERE M_InOutLine_ID=" + lines[i].get_ID();
				DB.executeUpdate(sql, get_TrxName());

				sql = "DELETE FROM M_Cost WHERE M_Product_ID=" + product.get_ID();
				DB.executeUpdate(sql, get_TrxName());

				MAcctSchema schemas[] = MAcctSchema.getClientAcctSchema(getCtx(), Env.getAD_Client_ID(getCtx()), get_TrxName());
				for (int y = 0; y < schemas.length; y++) {
					MCost.getCurrentCost(product, 
							lines[i].getM_AttributeSetInstance_ID(), schemas[y], lines[i].getAD_Org_ID(), 
							null, lines[i].getQtyEntered(), lines[i].getC_OrderLine_ID(), 
							false, null, get_TrxName()
							);
				}*/

				if (product.isStocked()) {

					BigDecimal QtyMA = lines[i].getMovementQty().negate();
					if (inout.getMovementType().charAt(1) == '-')	//	C- Customer Shipment - V- Vendor Return
						QtyMA = QtyMA.negate();
					BigDecimal QtySOMA = Env.ZERO;
					BigDecimal QtyPOMA = Env.ZERO;
					int reservationAttributeSetInstance_ID = 0;
					
					if (lines[i].getC_OrderLine_ID() != 0)
					{
						/* Update delivered number */
						MOrderLine oLine = new MOrderLine (getCtx(), lines[i].getC_OrderLine_ID(), get_TrxName());
						oLine.setDateDelivered(null);
						reservationAttributeSetInstance_ID = oLine.getM_AttributeSetInstance_ID();
						oLine.setQtyReserved(oLine.getQtyReserved().add(lines[i].getMovementQty())); //ok
						oLine.setQtyDelivered(oLine.getQtyDelivered().subtract(lines[i].getMovementQty()));

						if (inout.isSOTrx()) {
							QtySOMA = lines[i].getMovementQty();
						}
						else {
							QtyPOMA = lines[i].getMovementQty();
						}

						oLine.save();
					}
					//	Update Storage - see also VMatch.createMatchRecord
					//  SO = Sales Order, PO = Purchase Order.
					//  QtyMA   - diffQtyOnHand add on hand
					//	QtySOMA - diffQtyReserved add reserved   
					//	QtyPOMA - diffQtyOrdered add order
					String error = MStorage.add(getCtx(), lines[i].getM_Warehouse_ID(),
						lines[i].getM_Locator_ID(),
						lines[i].getM_Product_ID(), 
						lines[i].getM_AttributeSetInstance_ID(), reservationAttributeSetInstance_ID, 
						QtyMA, QtySOMA, QtyPOMA, false,					
						C_Period_ID,
						"RestoreShipment.doIt",
						get_TrxName());
					if (error.length() > 0)
					{
						return error;
					}
				}
			}
		}

//		String sql = "DELETE FROM M_Transaction WHERE M_InOutLine_ID IN (SELECT M_InOutLine_ID FROM M_InOutLine WHERE M_InOut_ID=?)";
//		DB.executeUpdate(sql, inout.get_ID(), get_TrxName());

		String sql = "DELETE FROM M_MatchPO WHERE M_InOutLine_ID IN (SELECT M_InOutLine_ID FROM M_InOutLine WHERE M_InOut_ID=?)";
		DB.executeUpdate(sql, inout.get_ID(), get_TrxName());

		sql = "DELETE FROM M_MatchInv WHERE M_InOutLine_ID IN (SELECT M_InOutLine_ID FROM M_InOutLine WHERE M_InOut_ID=?)";
		DB.executeUpdate(sql, inout.get_ID(), get_TrxName());

		MFactAcct.delete(MTable.getTable_ID("M_InOut"), inout.get_ID(), this.get_TrxName());
		
		inout.save(this.get_TrxName());

		return "Shipment/Receipt " + inout.get_ID() + " successfully drafted.";
	}
}
