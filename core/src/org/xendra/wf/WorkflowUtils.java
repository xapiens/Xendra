package org.xendra.wf;

import org.adempiere.util.ProcessUtil;
import org.compiere.model.MColumn;
import org.compiere.model.MProcess;
import org.compiere.model.MTable;
import org.compiere.model.PO;
import org.compiere.model.persistence.X_C_Order;
import org.compiere.process.ProcessInfo;
import org.compiere.util.Env;
import org.compiere.wf.MWFProcess;

public class WorkflowUtils {
	public static ProcessInfo Process(PO po, String trxName)
	{		
		ProcessInfo pi = null;
		MTable table = new MTable(Env.getCtx(), po.get_Table_ID(), trxName);
		MColumn column = table.getColumn(X_C_Order.COLUMNNAME_DocAction);
		if (column != null)
		{
			int pid = column.getAD_Process_ID();
			MProcess process = new MProcess(Env.getCtx(), pid, trxName);
			pi = new ProcessInfo (process.getName(), process.getAD_Process_ID(), po.get_Table_ID(), po.get_ID());
			pi.setAD_User_ID (Env.getAD_User_ID(Env.getCtx()));
			pi.setAD_Client_ID(Env.getAD_Client_ID(Env.getCtx()));
			pi.setTransactionName(trxName);
			MWFProcess wfProcess = ProcessUtil.startWorkFlow(Env.getCtx(), pi, process.getAD_Workflow_ID());						
		}
		else
		{
			pi.setError(true);
			pi.setSummary("is not a Document Action (DocAction) valid");
		}
		return pi;		
	}
}
