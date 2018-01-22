package org.xendra.process;

import java.util.logging.Level;

import org.compiere.model.MBOE;
import org.compiere.model.MInvoice;
import org.compiere.process.DocAction;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;

public class BOERefinance extends SvrProcess {

	private int m_C_BOE_ID;

	protected void prepare ()
	{
		m_C_BOE_ID = getRecord_ID();
	}
	
	protected String doIt () throws Exception
	{
		MBOE from    = new MBOE (getCtx(), m_C_BOE_ID, get_TrxName());

		if (!DocAction.STATUS_Drafted.equals(from.getDocStatus()))
		{
			//	Deep Copy
			MBOE renovation = MBOE.copyFrom(from, from.getDateBOE(), 
				from.getC_DocTypeTarget_ID(), from.isSOTrx(), true, get_TrxName());

			log.info("doIt - " + renovation);
			// dias fecha
			//refinance.setIsRefinanced(true);
			//refinance.save();			
		}
		return null;
	}
	
}
