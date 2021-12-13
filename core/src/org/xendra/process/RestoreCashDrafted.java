package org.xendra.process;

import java.util.logging.Level;

import org.compiere.model.MBankStatement;
import org.compiere.model.MCash;
import org.compiere.model.MCashLine;
import org.compiere.model.MDocType;
import org.compiere.model.MPeriod;
import org.compiere.model.reference.REF__DocumentAction;
import org.compiere.model.reference.REF_C_DocTypeDocBaseType;
import org.compiere.model.reference.REF__DocumentStatus;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;

public class RestoreCashDrafted extends SvrProcess {
	private int m_C_Cash_ID;
	@Override
	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("C_Cash_ID"))
				m_C_Cash_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}

	@Override
	protected String doIt() throws Exception {
		MCash cash = new MCash(getCtx(), m_C_Cash_ID, get_TrxName());
		if (!MPeriod.isOpen(getCtx(), cash.getDateAcct(), REF_C_DocTypeDocBaseType.CashJournal, cash.getAD_Org_ID(), cash.getAD_Client_ID()))
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
					 	"C_CashLine_ID IN (" +
					 		"SELECT " +
					 			"C_CashLine_ID " +
					 		"FROM " +
					 			"C_CashLine " +
					 		"WHERE " +
					 			"C_Cash_ID=? " +
					 	")";
		boolean isPaid = DB.getSQLValueString(get_TrxName(), sql, m_C_Cash_ID).equals("Y")?true:false;
		
		if (isPaid) {
			return "@Error@: @CashAlreadyAllocated@";
		}
		
		MCashLine lines[] = cash.getLines(false);
		
		for (int i = 0; i < lines.length; i++) {
			lines[i].setProcessed(false);
			lines[i].save(get_TrxName());
		}
		
		cash.setDocStatus(REF__DocumentStatus.Drafted);
		cash.setDocAction(REF__DocumentAction.Complete);
		cash.setProcessing(false);
		cash.setProcessed(false);
		cash.setPosted(false);
		cash.setIsApproved(false);
		cash.save(get_TrxName());
		
		sql = "DELETE FROM Fact_Acct WHERE AD_Table_ID=" + MCash.Table_ID + " AND Record_ID=?";
		int no = DB.executeUpdate(sql, cash.get_ID(), get_TrxName());
		if (no == -1) return "@Error@";
		
		return null;
	}

}
