package org.xendra.report;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.logging.Level;

import org.compiere.util.Env;
import org.compiere.model.MAllocationHdr;
import org.compiere.model.MCash;
import org.compiere.model.MInOut;
import org.compiere.model.MInvoice;
import org.compiere.model.MJournal;
import org.compiere.model.MMovement;
import org.compiere.model.MPayment;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.CPreparedStatement;


public class DailyBook extends SvrProcess {
	private int m_AD_Client_ID;
	private int m_AD_Org_ID;
	private Timestamp m_DateAcct_From;
	private Timestamp m_DateAcct_To;

	@Override
	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("AD_Client_ID"))
				m_AD_Client_ID = para[i].getParameterAsInt();
			else if (name.equals("AD_Org_ID"))
				m_AD_Org_ID = para[i].getParameterAsInt();
			else if (name.equals("DateAcct")) {
				m_DateAcct_From = (Timestamp)para[i].getParameter();
				m_DateAcct_To = (Timestamp)para[i].getParameter_To();
			}
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}

	}

	@Override
	protected String doIt() throws Exception {
		String sql = "SELECT " +
						"fact.AD_Client_ID," +
						"fact.AD_Org_ID," +
						"fact.Fact_Acct_ID," +
						"fact.AD_Table_ID," +
						"fact.Record_ID," +
						"fact.Description," +
						"ev.Value," +
						"ev.Description," +
						"fact.AmtAcctCr," +
						"fact.AmtAcctDr," +
						"fact.DateAcct," +
						"fact.Fact_ID," +
						"fact.GL_Category_Id " +
                     "FROM " +
                     	"Fact_Acct fact " +
                     	"RIGHT JOIN C_ElementValue ev ON (ev.C_ElementValue_ID=fact.Account_ID) " +
                     "WHERE " +
                     	"fact.AD_Client_ID=? ";
		if (m_AD_Org_ID != 0)
			sql = sql + " AND fact.AD_Org_ID=? ";
		sql = sql +
						" AND fact.DateAcct>=? " +
						" AND fact.DateAcct<=? " +
                     	" AND fact.PostingType='A' " +
                     "ORDER BY " +
                     	"fact.DateAcct," +
                     	"fact.Fact_ID," +
                     	"fact.AD_Table_ID," +
                     	"fact.Record_ID," +
                     	"fact.Account_ID";
		
		PreparedStatement pstmt = DB.prepareStatement(sql, get_TrxName());
		pstmt.setInt(1, m_AD_Client_ID);
		if (m_AD_Org_ID != 0) {
			pstmt.setInt(2, m_AD_Org_ID);
			pstmt.setTimestamp(3, m_DateAcct_From);
			pstmt.setTimestamp(4, m_DateAcct_To);
		}
		else {
			pstmt.setTimestamp(2, m_DateAcct_From);
			pstmt.setTimestamp(3, m_DateAcct_To);
		}
		ResultSet rs = pstmt.executeQuery();
		
		while (rs.next()) {
			int AD_Client_ID = rs.getInt(1);
			int AD_Org_ID = rs.getInt(2);
			int Fact_Acct_ID = rs.getInt(3);
			int AD_Table_ID = rs.getInt(4);
			int Record_ID = rs.getInt(5);
			String Description = rs.getString(6);
			String Value = rs.getString(7);
			String AcctDescription = rs.getString(8);
			BigDecimal AmtAcctCr = rs.getBigDecimal(9);
			BigDecimal AmtAcctDr = rs.getBigDecimal(10);
			Timestamp DateAcct = rs.getTimestamp(11);
			int Fact_ID = rs.getInt(12);
			int GL_Category_ID = rs.getInt(13);
			String DocumentNo = getDocumentNo(AD_Table_ID, Record_ID);
			String Serial = getSerial(AD_Table_ID, Record_ID);
			
			sql = "INSERT INTO " +
					"T_DailyBook (" +
						"AD_Client_ID," +
						"AD_Org_ID," +
						"IsActive," +
						"Created," +
						"CreatedBy," +
						"Updated," +
						"UpdatedBy," +
						"AD_PInstance_ID," +
						"Fact_Acct_ID," +
						"AD_Table_ID," +
						"Record_ID," +
						"Description," + 
						"Value," +
						"AcctDescription," +
						"AmtAcctCr," +
						"AmtAcctDr," +
						"DateAcct," +
						"Serial," +
						"DocumentNo," +
						"Fact_ID," +
						"GL_Category_Id " +
					")" +
				  "VALUES (" +
				  	"?," +			// 1
				  	"?," +			// 2
				  	"'Y'," +
				  	"CURRENT_TIMESTAMP," +
				  	"?," +			// 3
				  	"CURRENT_TIMESTAMP," +
				  	"?," +			// 4
				  	"?," +			// 5
				  	"?," +			// 6
				  	"?," +			// 7
				  	"?," +			// 8
				  	"?," +			// 9
				  	"?," +			// 10
				  	"?," +			// 11
				  	"?," +			// 12
				  	"?," +			// 13
				  	"?," +			// 14
				  	"?," +			// 15
				  	"?," +			// 16
				  	"?," +			// 17
				  	"? " +			// 18
				  ")";
			CPreparedStatement stmt = DB.prepareStatement(sql, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE, get_TrxName());
			stmt.setInt(1, AD_Client_ID);
			stmt.setInt(2, AD_Org_ID);
			stmt.setInt(3, Env.getAD_User_ID(getCtx()));
			stmt.setInt(4, Env.getAD_User_ID(getCtx()));
			stmt.setInt(5, getAD_PInstance_ID());
			stmt.setInt(6, Fact_Acct_ID);
			stmt.setInt(7, AD_Table_ID);
			stmt.setInt(8, Record_ID);
			stmt.setString(9, Description);
			stmt.setString(10, Value);
			stmt.setString(11, AcctDescription);
			stmt.setBigDecimal(12, AmtAcctCr);
			stmt.setBigDecimal(13, AmtAcctDr);
			stmt.setTimestamp(14, DateAcct);
			stmt.setString(15, Serial);
			stmt.setString(16, DocumentNo);
			stmt.setInt(17, Fact_ID);
			stmt.setInt(18, GL_Category_ID);
			int no = stmt.executeUpdate();
			if (no == -1) return "@Error@";
			stmt.close();
		}
		return null;
	}

	private String getDocumentNo(int AD_Table_ID, int Record_ID) {
		String sql;
		// C_Invoice, M_InOut, C_AllocationHdr, C_Cash, GL_Journal, C_Payment
		if (AD_Table_ID==MInvoice.Table_ID) {
			sql = "SELECT DocumentNo FROM C_Invoice WHERE C_Invoice_ID=?";
			return DB.getSQLValueString(get_TrxName(), sql, Record_ID);
		}
		else if (AD_Table_ID==MInOut.Table_ID) {
			sql = "SELECT DocumentNo FROM M_InOut WHERE M_InOut_ID=?";
			return DB.getSQLValueString(get_TrxName(), sql, Record_ID);
		}
		else if (AD_Table_ID==MAllocationHdr.Table_ID) {
			sql = "SELECT DocumentNo FROM C_AllocationHdr WHERE C_AllocationHdr_ID=?";
			return DB.getSQLValueString(get_TrxName(), sql, Record_ID);
		}
		else if (AD_Table_ID==MCash.Table_ID) {
			return ((Integer)Record_ID).toString();
		}
		else if (AD_Table_ID==MJournal.Table_ID) {
			sql = "SELECT DocumentNo FROM GL_Journal WHERE GL_Journal_ID=?";
			return DB.getSQLValueString(get_TrxName(), sql, Record_ID);
		}
		else if (AD_Table_ID==MMovement.Table_ID) {
			sql = "SELECT DocumentNo FROM M_Movement WHERE M_Movement_ID=?";
			return DB.getSQLValueString(get_TrxName(), sql, Record_ID);
		}
		else if (AD_Table_ID==MPayment.Table_ID) {
			sql = "SELECT DocumentNo FROM C_Payment WHERE C_Payment_ID=?";
			return DB.getSQLValueString(get_TrxName(), sql, Record_ID);			
		}
		else {
			System.out.println("WARNING: Unknown AD_Table_ID " + AD_Table_ID);
			return null;
		}
	}
	
	private String getSerial(int AD_Table_ID, int Record_ID) {
		String sql;
		// C_Invoice, M_InOut, C_AllocationHdr, C_Cash, GL_Journal, C_Payment
		if (AD_Table_ID==MInvoice.Table_ID) {
			sql = "SELECT Serial FROM C_Invoice WHERE C_Invoice_ID=?";
			return DB.getSQLValueString(get_TrxName(), sql, Record_ID);
		}
		else if (AD_Table_ID==MInOut.Table_ID) {
			return "";
		}
		else if (AD_Table_ID==MAllocationHdr.Table_ID) {
			return "";
		}
		else if (AD_Table_ID==MCash.Table_ID) {
			return "";
		}
		else if (AD_Table_ID==MJournal.Table_ID) {
			return "";
		}
		else if (AD_Table_ID==MMovement.Table_ID) {
			return "";
		}
		else if (AD_Table_ID==MPayment.Table_ID) {
			return "";
		}
		else {
			System.out.println("WARNING: Unknown AD_Table_ID " + AD_Table_ID);
			return null;
		}
	}
}
