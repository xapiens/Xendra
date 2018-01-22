package org.xendra.process;

import java.util.logging.Level;

import org.compiere.model.MCash;
import org.compiere.model.MDocType;
import org.compiere.model.MJournal;
import org.compiere.model.MPayment;
import org.compiere.model.MPeriod;
import org.compiere.model.reference.REF__DocumentAction;
import org.compiere.model.reference.REF_C_DocTypeDocBaseType;
import org.compiere.model.reference.REF__DocumentStatus;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;

public class RestorePaymentDrafted extends SvrProcess {
	private int m_C_Payment_ID;

	@Override
	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("C_Payment_ID"))
				m_C_Payment_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}

	@Override
	protected String doIt() throws Exception {
		MPayment payment = new MPayment(getCtx(), m_C_Payment_ID, get_TrxName());
		if (!MPeriod.isOpen(getCtx(), payment.getDateAcct(), REF_C_DocTypeDocBaseType.APPayment, Env.getAD_Org_ID(Env.getCtx())) && 
            !MPeriod.isOpen(getCtx(), payment.getDateAcct(), REF_C_DocTypeDocBaseType.ARReceipt, Env.getAD_Org_ID(Env.getCtx())))
		{
			return "@Error@: @PeriodClosed@";
		}
		String sql = "SELECT " +
						"CASE WHEN " +
							"count(*) > 0 THEN 'Y' ELSE 'N' " +
		                "END " +
	                 "FROM " +
	                 	"C_AllocationLine " +
	                 "WHERE " +
	                 	"C_Payment_ID=?";
		boolean isPaid = DB.getSQLValueString(get_TrxName(), sql, m_C_Payment_ID).equals("Y")?true:false;

		if (isPaid) {
			return "@Error@: @PaymentAlreadyAllocated@";
		}

		sql = "DELETE FROM Fact_Acct WHERE AD_Table_ID=" + MPayment.Table_ID + " AND Record_ID=?";
		int no = DB.executeUpdate(sql, payment.get_ID(), get_TrxName());
		if (no == -1) return "@Error@";

		payment.setDocStatus(REF__DocumentStatus.Drafted);
		payment.setDocAction(REF__DocumentAction.Complete);
		payment.setProcessing(false);
		payment.setProcessed(false);
		payment.setPosted(false);
		payment.setIsApproved(false);
		payment.save(get_TrxName());

		return null;
	}

}
