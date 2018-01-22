package org.xendra.report;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.logging.Level;

import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.CPreparedStatement;
import org.compiere.util.DB;
import org.compiere.util.Env;

public class ThidPartyOperations extends SvrProcess {
	private int m_AD_Client_ID;
	private int m_AD_Org_ID;
	private int m_C_BPartner_ID;
	private Timestamp m_DateAcct_From = null;
	private Timestamp m_DateAcct_To = null;
	private BigDecimal m_MinAmt = null;
	private String m_IsSOTrx = "Y";

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
			else if (name.equals("C_BPartner_ID"))
				m_C_BPartner_ID = para[i].getParameterAsInt();
			else if (name.equals("DateAcct")) {
				m_DateAcct_From = (Timestamp)para[i].getParameter();
				m_DateAcct_To = (Timestamp)para[i].getParameter_To();
			}
			else if (name.equals("MinAmt"))
				m_MinAmt = (BigDecimal)para[i].getParameter();
			else if (name.equals("IsSOTrx"))
				m_IsSOTrx = (String)para[i].getParameter();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}

	@Override
	protected String doIt() throws Exception {
		if (m_C_BPartner_ID != 0) {
			if (!addPartner(m_C_BPartner_ID))
				return "@Error@";

			return null;
		}
		
		
		String sql = "SELECT " +
						"C_BPartner_ID," +
						"SUM(GrandTotal) " +
					 "FROM " +
					 	"C_Invoice " +
					 "WHERE " +
					 	"AD_Client_ID=? " +
					 	"AND AD_Org_ID=? " +
					 	"AND IsActive='Y' " +
					 	"AND DateAcct BETWEEN ? AND ?" +
					 	"AND IsSOTrx=? " +
					 "GROUP BY " +
					 	"C_BPartner_ID ";
		try {
			PreparedStatement pstmt = DB.prepareStatement(sql, get_TrxName());
			pstmt.setInt(1, m_AD_Client_ID);
			pstmt.setInt(2, m_AD_Org_ID);
			pstmt.setTimestamp(3, m_DateAcct_From);
			pstmt.setTimestamp(4, m_DateAcct_To);
			pstmt.setString(5, m_IsSOTrx);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int C_BPartner_ID = rs.getInt(1);
				BigDecimal GrandTotal = rs.getBigDecimal(2);
				
				if (GrandTotal.compareTo(m_MinAmt) >= 0) 
					if (!addPartner(C_BPartner_ID)) {
						return "@Error@";
					}
			}
		}
		catch (SQLException e) {
			return "@Error@";
		}
		return null;
	}

	private boolean addPartner(int C_BPartner_ID) {
		String sql = "INSERT INTO " +
						"T_ThirdPartyOperations " +
						"(" +
							"AD_PInstance_ID," +
							"AD_Client_ID," +
							"AD_Org_ID," +
							"Created," +
							"CreatedBy," +
							"Updated," +
							"UpdatedBy," +
							"IsActive," +
							"Value," +
							"Name," +
							"DateAcct," +
							"Serial," +
							"DocumentNo," +
							"GrandTotal," +
							"IsSOTrx," +
							"MinAmt," +
							"C_BPartner_ID" +
						") " +
						"SELECT " +
							"?," +				// #1
							"?," +				// #2
							"?," +				// #3
							"CURRENT_TIMESTAMP," +
							"?," +				// #4
							"CURRENT_TIMESTAMP," +
							"?," +				// #5
							"'Y'," +
							"bp.Value," +
							"bp.Name," +
							"i.DateAcct," +
							"i.Serial," +
							"i.DocumentNo," +
							"i.GrandTotal," +
							"i.IsSOTrx," +
							"?," +				// #6
							"i.C_BPartner_ID " +
						"FROM " +
							"C_Invoice i " +
							"RIGHT JOIN C_BPartner bp ON (i.C_BPartner_ID=bp.C_BPartner_ID) " +
						"WHERE " +
							"i.C_BPartner_ID=?" +
							"AND i.IsActive='Y' " +			// #7
							"AND i.DateAcct BETWEEN ? AND ? " +	// #8-9
							"AND i.IsSOTrx=? ";			// #10		
		if (m_AD_Org_ID != 0) {
			sql = sql + 	"AND i.AD_Org_ID=? ";	// #11
		}

		try {
			CPreparedStatement cstmt = DB.prepareStatement(sql, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE, get_TrxName());
			cstmt.setInt(1, getAD_PInstance_ID());
			cstmt.setInt(2, m_AD_Client_ID);
			cstmt.setInt(3, m_AD_Org_ID);
			cstmt.setInt(4, Env.getAD_User_ID(Env.getCtx()));
			cstmt.setInt(5, Env.getAD_User_ID(Env.getCtx()));
			cstmt.setBigDecimal(6, m_MinAmt);
			cstmt.setInt(7, C_BPartner_ID);
			cstmt.setTimestamp(8, m_DateAcct_From);
			cstmt.setTimestamp(9, m_DateAcct_To);
			cstmt.setString(10, m_IsSOTrx);
			if (m_AD_Org_ID != 0) cstmt.setInt(11, m_AD_Org_ID);
			
			if (cstmt.executeUpdate() == -1) return false;
			else return true;
		}
		catch (SQLException e) {
			return false;
		}
	}
}
