package org.xendra.transfer.process;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.compiere.model.MDocType;
import org.compiere.model.MInvoice;
import org.compiere.model.MInvoiceLine;
import org.compiere.model.MMovement;
import org.compiere.model.MOrder;
import org.compiere.model.MOrderLine;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_DocType;
import org.compiere.model.persistence.X_C_InvoiceLine;
import org.compiere.model.reference.REF__DocumentStatus;
import org.compiere.process.DocAction;
import org.compiere.process.ProcessInfo;
import org.compiere.util.Env;
import org.compiere.util.Trx;
import org.compiere.util.Util;
import org.xendra.exceptions.XendraException;
import org.xendra.wf.WorkflowUtils;
import org.xendrian.rules.messages.IMessageProcessor;
import org.xendrian.rules.model.Policy;

public class TransferPolicyRequest implements Policy {
	
	//private GeneralMessageProcessor transfer;
	private TransferMessageProcessor transfer;

	public void simple() {
		Trx m_trx = Trx.get(Util.getUUID(), true);
		String error = "";
		try {									
			//MOrder order = m_sales.getOrder();	
			MMovement m = transfer.getMovement();
			if (!m.getDocStatus().equals(DocAction.STATUS_Completed))
			{	
				ProcessInfo pi = WorkflowUtils.Process(m, m_trx.getTrxName());			
				if (!pi.isError())
				{
					m_trx.commit();
					m = new MMovement(Env.getCtx(), m.getM_Movement_ID(), m_trx.getTrxName());
					if (m.getDocStatus().compareTo(DocAction.STATUS_Completed) == 0)
					{
					}
				}
				else
				{				
					throw new Exception(pi.getSummary());				
				}
			}
		}		
		catch (Exception e)
		{
			e.printStackTrace();
			error = e.getMessage();
			m_trx.rollback();			
		}
		finally
		{					
			transfer.getXendrianMessage().setProcessed(true);
			if (error.length() > 0)
				transfer.getXendrianMessage().setErrorMsg(error);
			transfer.getXendrianMessage().save();
			m_trx.commit();
			m_trx.close();
		}				
	}
	public void simple2() {
		String error = "";
		Trx m_trx = Trx.get(Util.getUUID(), true);
		try {
			MMovement m = transfer.getMovement();
			//X_M_Movement mov = (X_M_Movement) transfer.getTable(X_M_Movement.Table_Name);
			Env.setContext(Env.getCtx(), "#AD_Client_ID", m.getAD_Client_ID());
			//Env.setContext(Env.getCtx(), "#AD_Org_ID", mov.getAD_Org_ID());
			//MMovement movement = MMovement.getbyIdentifier(mov.getIdentifier(), m_trx.getTrxName());
			String status = m.completeIt();
			if (!status.equals(REF__DocumentStatus.Completed))
				throw new XendraException(m.getProcessMsg());
			m.setDocStatus(status);
			if (!m.save())
				throw new XendraException("no se pudo grabar");
			if (!m_trx.commit())
				throw new XendraException("no se pudo comitear");						
		}
		catch (Exception e)
		{
			e.printStackTrace();
			error = e.getMessage();			
			m_trx.rollback();	
		}
		finally
		{
			m_trx.close();
			transfer.getXendrianMessage().setProcessed(true);
			if (error.length() > 0)
				transfer.getXendrianMessage().setErrorMsg(error);
			transfer.getXendrianMessage().save();
		}		
	}

	public void setMessage(IMessageProcessor bmp) {
		transfer = (TransferMessageProcessor) bmp;
	}

}
