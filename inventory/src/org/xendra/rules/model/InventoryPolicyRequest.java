package org.xendra.rules.model;

import org.compiere.model.MInventory;
import org.compiere.process.DocAction;
import org.compiere.process.ProcessInfo;
import org.compiere.util.Env;
import org.compiere.util.Trx;
import org.xendra.messages.MessageProcessor;
import org.xendra.wf.WorkflowUtils;

public class InventoryPolicyRequest {
	private boolean processed;
	private MessageProcessor m_messageprocessor;
	public boolean processInventory() {
		Trx m_trx = Trx.get(getMP().get_TrxName(), true);
		String error = "";
		try {									
			MInventory inventory = getMP().getFirstRecord(MInventory.Table_Name);			
			if (!inventory.getDocStatus().equals(DocAction.STATUS_Completed))
			{	
				ProcessInfo pi = WorkflowUtils.Process(inventory, m_trx.getTrxName());
				if (!pi.isError()) {
					m_trx.commit();
					inventory = new MInventory(Env.getCtx(), inventory.getM_Inventory_ID(), m_trx.getTrxName());
					if (inventory.getDocStatus().compareTo(DocAction.STATUS_Completed) == 0) {
						
					} else {
						m_trx.rollback();			
						throw new Exception(pi.getSummary());										
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			error = e.getMessage();					
		} finally {	
			getMP().setProcessed(true);
			if (error.length() > 0)
				getMP().setErrorMsg(error);
			getMP().saveMessage();
			m_trx.commit();
		}
		return true;
	}
	public void setMessageProcessor(MessageProcessor p) {
		m_messageprocessor = p;
	}
	private MessageProcessor getMP() {
		return m_messageprocessor;
	}	
	public void setProcessed(boolean var) {
		processed = var;
	}
	public boolean getProcessed() {
		return processed; 
	}
}
