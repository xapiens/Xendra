package org.xendra.report;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.logging.Level;

import org.compiere.model.MBankStatement;
import org.compiere.model.MBankStatementLine;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.report.ReportStarter;
import org.compiere.util.CPreparedStatement;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Trx;

public class BankReconciliationReport extends SvrProcess {
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
		Timestamp previousStatementDate = new Timestamp(0);
		
		String sql = "SELECT " +
						"C_BankStatement_ID " +
					 "FROM " +
					 	"C_BankStatement " +
					 "WHERE " +
					 	"C_BankAccount_ID=? " +
					 	"AND C_BankStatement_ID!=? " +
					 	"AND StatementDate<?" +
					 "ORDER BY " +
					 	"StatementDate DESC ";
		PreparedStatement pstmt = DB.prepareStatement(sql, get_TrxName());
		pstmt.setInt(1, statement.getC_BankAccount_ID());
		pstmt.setInt(2, m_C_BankStatement_ID);
		pstmt.setTimestamp(3, statement.getStatementDate());
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			MBankStatement previous = new MBankStatement(getCtx(), rs.getInt(1), get_TrxName());
			previousStatementDate = previous.getStatementDate();
			rs.close();
		}
		pstmt.close();

		/* Payments of this statement, noting which should have been in the previous statement or earlier */
		sql = "SELECT " +
				"sl.C_Payment_ID," +
				"p.PayAmt," +
				"p.DateTrx," +
				"CASE WHEN TRUNC(p.DateTrx)<=? THEN 'Y' ELSE 'N' END AS IsPrevious," +
				"p.IsReconciled " +
			  "FROM " +
				"C_BankStatementLine sl " +
				"INNER JOIN C_Payment p ON (sl.C_Payment_ID=p.C_Payment_ID) " +
			  "WHERE " +
			 	"sl.C_BankStatement_ID=? " +
			  "ORDER BY " +
			 	"p.DateTrx ";
		pstmt = DB.prepareStatement(sql, get_TrxName());
		pstmt.setTimestamp(1, previousStatementDate);
		pstmt.setInt(2, m_C_BankStatement_ID);
		rs = pstmt.executeQuery();
		
		while (rs.next()) {
			int C_Payment_ID = rs.getInt(1);
			BigDecimal PayAmt = rs.getBigDecimal(2);
			Timestamp DateTrx = rs.getTimestamp(3);
			String isPrevious = rs.getString(4);
			String isReconciled = rs.getString(5);
			
			sql = "INSERT INTO " +
					"T_BankAccountReconciliation " +
					"( " +
						"AD_PInstance_ID," +
						"AD_Client_ID," +
						"AD_Org_ID," +
						"Created," +
						"CreatedBy," +
						"Updated," +
						"UpdatedBy," +
						"IsActive," +
						"C_BankStatement_ID," +
						"C_Payment_ID," +
						"PayAmt," +
						"DateTrx," +
						"IsPrevious," +
						"IsPending," +
						"IsReconciled" +
					") " +
					"VALUES (" +
						"?," +
						"?," +
						"?," +
						"CURRENT_TIMESTAMP," +
						"?," +
						"CURRENT_TIMESTAMP," +
						"?," +
						"'Y'," +
						"?," +
						"?," +
						"?," +
						"?," +
						"?," +
						"'N'," +
						"? " +
					")";
			CPreparedStatement stmt = DB.prepareStatement(sql, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE, get_TrxName());
			stmt.setInt(1, getAD_PInstance_ID());
			stmt.setInt(2, statement.getAD_Client_ID());
			stmt.setInt(3, statement.getAD_Org_ID());
			stmt.setInt(4, Env.getAD_User_ID(getCtx()));
			stmt.setInt(5, Env.getAD_User_ID(getCtx()));
			stmt.setInt(6, m_C_BankStatement_ID);
			stmt.setInt(7, C_Payment_ID);
			stmt.setBigDecimal(8, PayAmt);
			stmt.setTimestamp(9, DateTrx);
			stmt.setString(10, isPrevious);
			stmt.setString(11, isReconciled);
			int no = stmt.executeUpdate();
			if (no < 1) return "@Error@";
		}
		
		rs.close();
		pstmt.close();

		/* Payments not reconcilied, at or before our statement date */
		sql = "SELECT " +
				"p.C_Payment_ID," +
				"p.PayAmt," +
				"p.DateTrx," +
				"'Y'," +
				"p.IsReconciled, " +
				"CASE WHEN TRUNC(p.DateTrx)<=? THEN 'Y' ELSE 'N' END AS IsPrevious " +
			  "FROM " +
			  	"C_Payment p " +
			  "WHERE " +
			  	"p.DateTrx BETWEEN ? AND ? " +
			  	"AND p.DocStatus IN ('CO', 'CL')" +
				"AND p.C_Payment_ID NOT IN (SELECT C_Payment_ID FROM C_BankStatementLine WHERE C_BankStatement_ID=?)";
		pstmt = DB.prepareStatement(sql, get_TrxName());
		pstmt.setTimestamp(1, previousStatementDate);
		pstmt.setTimestamp(2, previousStatementDate);
		pstmt.setTimestamp(3, statement.getStatementDate());
		pstmt.setInt(4, m_C_BankStatement_ID);
		rs = pstmt.executeQuery();
		
		while (rs.next()) {
			int C_Payment_ID = rs.getInt(1);
			BigDecimal PayAmt = rs.getBigDecimal(2);
			Timestamp DateTrx = rs.getTimestamp(3);
			String isPending = rs.getString(4);
			String isReconciled = rs.getString(5);
			String isPrevious = rs.getString(6);
			sql = "INSERT INTO " +
					"T_BankAccountReconciliation " +
					"( " +
						"AD_PInstance_ID," +
						"AD_Client_ID," +
						"AD_Org_ID," +
						"Created," +
						"CreatedBy," +
						"Updated," +
						"UpdatedBy," +
						"IsActive," +
						"C_BankStatement_ID," +
						"C_Payment_ID," +
						"PayAmt," +
						"DateTrx," +
						"IsPrevious," +
						"IsPending," +
						"IsReconciled " +
			        ") " +
			        "VALUES (" +
			        	"?," +
			        	"?," +
			        	"?," +
			        	"CURRENT_TIMESTAMP," +
			        	"?," +
			        	"CURRENT_TIMESTAMP," +
			        	"?," +
			        	"'Y'," +
			        	"?," +
			        	"?," +
			        	"?," +
			        	"?," +
			        	"?," +
			        	"?," +
			        	"? " +
			        ")";
			CPreparedStatement stmt = DB.prepareStatement(sql, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE, get_TrxName());
			stmt.setInt(1, getAD_PInstance_ID());
			stmt.setInt(2, statement.getAD_Client_ID());
			stmt.setInt(3, statement.getAD_Org_ID());
			stmt.setInt(4, Env.getAD_User_ID(getCtx()));
			stmt.setInt(5, Env.getAD_User_ID(getCtx()));
			stmt.setInt(6, m_C_BankStatement_ID);
			stmt.setInt(7, C_Payment_ID);
			stmt.setBigDecimal(8, PayAmt);
			stmt.setTimestamp(9, DateTrx);
			stmt.setString(10, isPrevious);
			stmt.setString(11, isPending);
			stmt.setString(12, isReconciled);
			int no = stmt.executeUpdate();
			if (no < 1) return "@Error@";
		}
		
		ReportStarter rep = new ReportStarter();
		
		if (!rep.startProcess(getCtx(), this.getProcessInfo(), Trx.get(get_TrxName(), false))) {
			return "@Error@";
		}

		return "@Ok@";
	}

}
