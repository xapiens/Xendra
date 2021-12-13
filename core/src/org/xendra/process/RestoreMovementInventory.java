package org.xendra.process;

import java.util.logging.Level;

import org.compiere.process.DocAction;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.model.MDocType;
import org.compiere.model.MMovement;
import org.compiere.model.MMovementLine;
import org.compiere.model.MMovementLineMA;
import org.compiere.model.MPeriod;
import org.compiere.model.MStorage;
import org.compiere.util.*;


import java.math.BigDecimal;

public class RestoreMovementInventory extends SvrProcess {
	private int m_AD_Org_ID;
	private int m_AD_Client_ID;
	private int m_M_Movement_ID;

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
			else if (name.equals("M_Movement_ID"))
				m_M_Movement_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}

	}
	
	protected String doIt () throws Exception
	{
		// xapiens 17/05/09 
		MMovement movement = new MMovement(this.getCtx(), m_M_Movement_ID, this.get_TrxName());
		
		MDocType dt = MDocType.get(getCtx(), movement.getC_DocType_ID());
		
		if (!MPeriod.isOpen(getCtx(), movement.getMovementDate(), dt.getDocBaseType(), movement.getAD_Org_ID(), movement.getAD_Client_ID()))
		{
			return "@Error@: @PeriodClosed@";
		}				
		Integer C_Period_ID = MPeriod.get(Env.getCtx(), movement.getMovementDate(), movement.getAD_Org_ID(), movement.getAD_Client_ID()).getC_Period_ID();
		movement.setDocStatus("DR");
		movement.setDocAction("CO");
		movement.setProcessing(false);
		movement.setProcessed(false);
		movement.setPosted(false);
		movement.setIsApproved(false);
		
		MMovementLine lines[] = movement.getLines(true);
		
		for (int i = 0; i < lines.length; i++) 
		{
			lines[i].setProcessed(false);
			lines[i].save(this.get_TrxName());
			
			//MTransaction trxFrom = null;
			
			if (lines[i].getM_AttributeSetInstance_ID() == 0) {
				MMovementLineMA mas[] = MMovementLineMA.get(getCtx(),
						lines[i].getM_MovementLine_ID(), get_TrxName());
				
					for (int j = 0; j < mas.length; j++)
					{
						MMovementLineMA ma = mas[j];
						//
						MStorage storageFrom = MStorage.get(getCtx(), lines[i].getM_Locator_ID(), 
							lines[i].getM_Product_ID(), ma.getM_AttributeSetInstance_ID(), get_TrxName());
						if (storageFrom == null)
							storageFrom = MStorage.getCreate(getCtx(), lines[i].getM_Locator_ID(), 
							lines[i].getM_Product_ID(), ma.getM_AttributeSetInstance_ID(), get_TrxName());
						//
						MStorage storageTo = MStorage.get(getCtx(), lines[i].getM_LocatorTo_ID(), 
							lines[i].getM_Product_ID(), ma.getM_AttributeSetInstance_ID(), get_TrxName());
						if (storageTo == null)
							storageTo = MStorage.getCreate(getCtx(), lines[i].getM_LocatorTo_ID(), 
							lines[i].getM_Product_ID(), ma.getM_AttributeSetInstance_ID(), get_TrxName());
						// we change from substract to add for inverse
						storageFrom.setQtyOnHand(storageFrom.getQtyOnHand().add(ma.getMovementQty()));
						if (!storageFrom.save(get_TrxName()))
						{
							return "Storage From not updated (MA)";							
						}
						// we change from add to substract for inverse
						storageTo.setQtyOnHand(storageTo.getQtyOnHand().subtract(ma.getMovementQty()));
						if (!storageTo.save(get_TrxName()))
						{
							return "Storage To not updated (MA)";							
						}
					
						//						
//						BigDecimal BalanceQtyFrom = MStorage.getQtyAvailable(storageFrom.getM_Warehouse_ID(),lines[i].getM_Product_ID(), 0 ,get_TrxName() );
//						trxFrom = new MTransaction (getCtx(), lines[i].getAD_Org_ID(), 
//							REF_M_TransactionMovementType.MovementFrom,
//							lines[i].getM_Locator_ID(), lines[i].getM_Product_ID(), ma.getM_AttributeSetInstance_ID(),
//							ma.getMovementQty(), movement.getMovementDate(), get_TrxName());
//						trxFrom.setM_MovementLine_ID(lines[i].getM_MovementLine_ID());
//						trxFrom.setMovementQtyBalance(BalanceQtyFrom);
//						if (!trxFrom.save())
//						{
//							return "Transaction From not inserted (MA)";							
//						}
//						BigDecimal BalanceQtyTo = MStorage.getQtyAvailable(storageTo.getM_Warehouse_ID(),lines[i].getM_Product_ID(), 0 ,get_TrxName() );
//						MTransaction trxTo = new MTransaction (getCtx(), lines[i].getAD_Org_ID(), 
//							REF_M_TransactionMovementType.MovementTo,
//							lines[i].getM_LocatorTo_ID(), lines[i].getM_Product_ID(), ma.getM_AttributeSetInstance_ID(),
//							ma.getMovementQty().negate(), movement.getMovementDate(), get_TrxName());
//						trxTo.setM_MovementLine_ID(lines[i].getM_MovementLine_ID());
//						trxTo.setMovementQtyBalance(BalanceQtyTo);
//						if (!trxTo.save())
//						{
//							return "Transaction To not inserted (MA)";							
//						}
					}				
			}
			else
			//if (trxFrom == null)
			{
				MStorage storageFrom = MStorage.get(getCtx(),  lines[i].getM_Locator_ID(), 
					lines[i].getM_Product_ID(), lines[i].getM_AttributeSetInstance_ID(), get_TrxName());
				if (storageFrom == null)
					storageFrom = MStorage.getCreate(getCtx(), lines[i].getM_Locator_ID(), 
						lines[i].getM_Product_ID(), lines[i].getM_AttributeSetInstance_ID(), get_TrxName());
				//
				MStorage storageTo = MStorage.get(getCtx(), lines[i].getM_LocatorTo_ID(), 
					lines[i].getM_Product_ID(), lines[i].getM_AttributeSetInstanceTo_ID(), get_TrxName());
				if (storageTo == null)
					storageTo = MStorage.getCreate(getCtx(), lines[i].getM_LocatorTo_ID(), 
						lines[i].getM_Product_ID(), lines[i].getM_AttributeSetInstanceTo_ID(), get_TrxName());
				//
				storageFrom.setQtyOnHand(storageFrom.getQtyOnHand().add(lines[i].getMovementQty()));
				if (!storageFrom.save(get_TrxName()))
				{
					return "Storage From not updated";					
				}
				//
				storageTo.setQtyOnHand(storageTo.getQtyOnHand().subtract(lines[i].getMovementQty()));
				if (!storageTo.save(get_TrxName()))
				{
					return "Storage To not updated";					
				}
			
//				BigDecimal BalanceQtyFrom = MStorage.getQtyAvailable(storageFrom.getM_Warehouse_ID(),lines[i].getM_Product_ID(), 0 ,get_TrxName() );
//				trxFrom = new MTransaction (getCtx(), lines[i].getAD_Org_ID(), 
//					REF_M_TransactionMovementType.MovementFrom,
//					lines[i].getM_Locator_ID(), lines[i].getM_Product_ID(), lines[i].getM_AttributeSetInstance_ID(),
//					lines[i].getMovementQty(), movement.getMovementDate(), get_TrxName());
//				trxFrom.setM_MovementLine_ID(lines[i].getM_MovementLine_ID());
//				trxFrom.setMovementQtyBalance(BalanceQtyFrom);
//				if (!trxFrom.save())
//				{
//					return "Transaction From not inserted";					
//				}				
//				BigDecimal BalanceQtyTo = MStorage.getQtyAvailable(storageTo.getM_Warehouse_ID(),lines[i].getM_Product_ID(), 0 ,get_TrxName() );
//				MTransaction trxTo = new MTransaction (getCtx(), lines[i].getAD_Org_ID(), 
//					REF_M_TransactionMovementType.MovementTo,
//					lines[i].getM_LocatorTo_ID(), lines[i].getM_Product_ID(), lines[i].getM_AttributeSetInstanceTo_ID(),
//					lines[i].getMovementQty().negate(), movement.getMovementDate(), get_TrxName());
//				trxTo.setM_MovementLine_ID(lines[i].getM_MovementLine_ID());
//				trxTo.setMovementQtyBalance(BalanceQtyTo);
//				if (!trxTo.save())
//				{
//					return "Transaction To not inserted";					
//				}
			}	//	Fallback			
		}		
		return "Movement " + movement.get_ID() + " successfully drafted.";
	}
}
