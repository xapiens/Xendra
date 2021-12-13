package org.xendra.process;

import java.util.logging.Level;

import org.compiere.model.MDocType;
import org.compiere.model.MPayment;
import org.compiere.model.MPeriod;
import org.compiere.model.MRequisition;
import org.compiere.model.reference.REF__DocumentAction;
import org.compiere.model.reference.REF_C_DocTypeDocBaseType;
import org.compiere.model.reference.REF__DocumentStatus;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;

public class RestoreRequisitionDrafted extends SvrProcess {
	private int m_M_Requisition_ID;

	@Override
	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("M_Requisition_ID"))
				m_M_Requisition_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}

	@Override
	protected String doIt() throws Exception {
		MRequisition requisition = new MRequisition(getCtx(), m_M_Requisition_ID, get_TrxName());
		if (!MPeriod.isOpen(getCtx(), requisition.getDateDoc(), REF_C_DocTypeDocBaseType.PurchaseRequisition, requisition.getAD_Org_ID(), requisition.getAD_Client_ID())) {
			return "@Error@: @PeriodClosed@";
		}

		requisition.setDocStatus(REF__DocumentStatus.Drafted);
		requisition.setDocAction(REF__DocumentAction.Complete);
		requisition.setProcessing(false);
		requisition.setProcessed(false);
		requisition.setPosted(false);
		requisition.setIsApproved(false);
		requisition.save(get_TrxName());

		String sql = "DELETE FROM Fact_Acct WHERE AD_Table_ID=" + MRequisition.Table_ID + " AND Record_ID=?";
		int no = DB.executeUpdate(sql, requisition.get_ID(), get_TrxName());
		if (no == -1) return "@Error@";

		return null;
	}

}
