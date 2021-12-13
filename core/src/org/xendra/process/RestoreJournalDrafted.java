package org.xendra.process;

import java.util.logging.Level;

import org.compiere.model.MDocType;
import org.compiere.model.MInvoice;
import org.compiere.model.MJournal;
import org.compiere.model.MJournalBatch;
import org.compiere.model.MJournalLine;
import org.compiere.model.MPeriod;
import org.compiere.model.reference.REF__DocumentAction;
import org.compiere.model.reference.REF_C_DocTypeDocBaseType;
import org.compiere.model.reference.REF__DocumentStatus;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;

public class RestoreJournalDrafted extends SvrProcess {
	private int m_GL_JournalBatch_ID;

	@Override
	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("GL_JournalBatch_ID"))
				m_GL_JournalBatch_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}

	@Override
	protected String doIt() throws Exception {
		MJournalBatch batch = new MJournalBatch(getCtx(), m_GL_JournalBatch_ID, get_TrxName());
		if (!MPeriod.isOpen(getCtx(), batch.getDateAcct(), REF_C_DocTypeDocBaseType.GLJournal, batch.getAD_Org_ID(), batch.getAD_Client_ID()))
		{
			return "@Error@: @PeriodClosed@";
		}				

		MJournal journals[] = batch.getJournals(false);
		for (int i = 0; i < journals.length; i++) {
			MJournalLine lines[] = journals[i].getLines(false);
			for (int a = 0; a < lines.length; a++) {
				lines[a].setProcessed(false);
				lines[a].save(get_TrxName());
			}
			journals[i].setIsApproved(false);
			journals[i].setDocStatus(REF__DocumentStatus.Drafted);
			journals[i].setDocAction(REF__DocumentAction.Complete);
			journals[i].setProcessed(false);
			journals[i].setPosted(false);
			journals[i].save(get_TrxName());
			
			String sql = "DELETE FROM Fact_Acct WHERE AD_Table_ID=" + MJournal.Table_ID + " AND Record_ID=?";
			DB.executeUpdate(sql, journals[i].get_ID(), get_TrxName());
		}
		
		batch.setIsApproved(false);
		batch.setDocStatus(REF__DocumentStatus.Drafted);
		batch.setDocAction(REF__DocumentAction.Complete);
		batch.setProcessed(false);
		batch.save();

		return null;
	}

}
