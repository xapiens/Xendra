package org.xendra.rules.model;

import org.compiere.model.MMovement;
import org.compiere.process.DocAction;
import org.compiere.process.ProcessInfo;
import org.compiere.util.Env;
import org.compiere.util.Trx;
import org.xendra.messages.MessageProcessor;
import org.xendra.wf.WorkflowUtils;

public class MovementPolicyRequest {
	private boolean processed;
	private MessageProcessor m_messageprocessor;
	public boolean processMovement() {
		Trx m_trx = Trx.get(getMP().get_TrxName(), true);
		String error = "";
		try {									
			MMovement movement = getMP().getFirstRecord(MMovement.Table_Name);			
			if (!movement.getDocStatus().equals(DocAction.STATUS_Completed))
			{	
				ProcessInfo pi = WorkflowUtils.Process(movement, m_trx.getTrxName());
				if (!pi.isError()) {
					m_trx.commit();
					movement = new MMovement(Env.getCtx(), movement.getM_Movement_ID(), m_trx.getTrxName());
					if (movement.getDocStatus().compareTo(DocAction.STATUS_Completed) == 0) {
						
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
