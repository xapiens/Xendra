package org.xendra.process;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.logging.Level;

import org.compiere.model.MBOE;
import org.compiere.model.MInvoice;
import org.compiere.process.DocAction;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.Env;

public class BOERenovation extends SvrProcess {

	private int C_BOE_ID;
	private Timestamp p_DateBOE;
	private BigDecimal p_GrandTotal;
	private String p_DocumentNo;
	private BigDecimal p_DueDays;

	protected void prepare ()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("DateBOE"))
				p_DateBOE = (Timestamp) para[i].getParameter();
			else if (name.equals("Amount"))
				p_GrandTotal = (BigDecimal) para[i].getParameter();
			else if (name.equals("DocumentNo"))
				p_DocumentNo = (String) para[i].getParameter();
			else if (name.equals("DueDays"))
				p_DueDays = (BigDecimal) para[i].getParameter();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}

		C_BOE_ID = getRecord_ID();

	}
	
	protected String doIt () throws Exception
	{
		if ( p_GrandTotal.compareTo(Env.ZERO) <= 0 )
			return "@Error@: no es posible renovar con un monto igual a 0";
		
		MBOE from    = new MBOE (getCtx(), C_BOE_ID, get_TrxName());

		if (!DocAction.STATUS_Drafted.equals(from.getDocStatus()))
		{
				from.setIsRenewed(true);
				from.save(get_TrxName());
				
				MBOE renewed = MBOE.copyFrom(from, from.getDateBOE(), 
					from.getC_DocTypeTarget_ID(), from.isSOTrx(), true, get_TrxName());
				
				renewed.setDateBOE(p_DateBOE);
				renewed.setGrandTotal(p_GrandTotal);
				renewed.setDocumentNo(p_DocumentNo);
		        Calendar c1 = Calendar.getInstance();
		        c1.setTime(p_DateBOE);
		        c1.add(Calendar.DATE, p_DueDays.intValue());			     
		        renewed.setDueDate(new Timestamp(c1.getTime().getTime()));
		        renewed.setRef_BOE_ID(from.getC_BOE_ID());
				renewed.save(get_TrxName());
				
//				from.setDateBOE(p_DateBOE);
//				from.setGrandTotal(p_GrandTotal);
//				from.setDocumentNo(p_DocumentNo);
//		        Calendar c1 = Calendar.getInstance();
//		        c1.setTime(p_DateBOE);
//		        c1.add(Calendar.DATE, p_DueDays.intValue());			     
//				from.setDueDate(new Timestamp(c1.getTime().getTime()));
//				renewed.setRef_BOE_ID(from.getC_BOE_ID());
//				renewed.setIsRenewed(true);
//				renewed.save(get_TrxName());
//				// cleaning the data for renovation
//				from.setR_Amount(0);
//				from.setR_DateBOE(null);
//				from.setR_DocumentNo(null);
//				from.setR_DueDate(null);
//				//
//				from.save(get_TrxName());
		}
		else
			return "@Error@: no es posible renovar un documento en estado @DOCSTATUS_Drafted@";
		return null;
	}
	
}
