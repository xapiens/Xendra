package org.xendra.process;

import java.util.logging.Level;

import org.compiere.model.MBankAccount;
import org.compiere.model.MBankStatement;
import org.compiere.model.MBankStatementLine;
import org.compiere.model.MCash;
import org.compiere.model.MDocType;
import org.compiere.model.MOrder;
import org.compiere.model.MPayment;
import org.compiere.model.MPeriod;
import org.compiere.model.reference.REF__DocumentAction;
import org.compiere.model.reference.REF_C_DocTypeDocBaseType;
import org.compiere.model.reference.REF__DocumentStatus;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;

public class RestoreBankStatementDrafted extends SvrProcess {
	private int m_C_BankStatement_ID;

	@Override
	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("C_BankStatement_ID"))
				m_C_BankStatement_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}

	@Override
	protected String doIt() throws Exception {
		MBankStatement statement = new MBankStatement(getCtx(), m_C_BankStatement_ID, get_TrxName());
		if (!MPeriod.isOpen(getCtx(), statement.getStatementDate(), REF_C_DocTypeDocBaseType.BankStatement, Env.getAD_Org_ID(Env.getCtx()))) {
			return "@Error@: @PeriodClosed@";
		}
		
		MBankAccount account = statement.getBankAccount();
		account.setCurrentBalance(account.getCurrentBalance().subtract(statement.getStatementDifference()));
		account.save(get_TrxName());
		
		MBankStatementLine []lines = statement.getLines(false);
		for (int i = 0; i < lines.length; i++) {
			MPayment payment = new MPayment(getCtx(), lines[i].getC_Payment_ID(), get_TrxName());
			payment.setIsReconciled(false);
			payment.save(get_TrxName());
			lines[i].setProcessed(false);
			lines[i].save(get_TrxName());
		}
		
		statement.setDocStatus(REF__DocumentStatus.Drafted);
		statement.setDocAction(REF__DocumentAction.Complete);
		statement.setProcessing(false);
		statement.setProcessed(false);
		statement.setPosted(false);
		statement.setIsApproved(false);
		statement.save(get_TrxName());

		String sql = "DELETE FROM Fact_Acct WHERE AD_Table_ID=" + MBankStatement.Table_ID + " AND Record_ID=?";
		int no = DB.executeUpdate(sql, statement.get_ID(), get_TrxName());
		if (no == -1) return "@Error@";

		return null;
	}

}
