package org.xendra.report;

import java.util.logging.Level;

import java.util.Vector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;

import org.compiere.util.DB;


public class AccountsByOrganization extends SvrProcess {
	private int m_AD_Client_ID;
	private int m_C_AcctSchema_ID;
	private String m_AccountValue_From;
	private String m_AccountValue_To;
	private Timestamp m_DateAcct_From;
	private Timestamp m_DateAcct_To;
	private String m_PostingType;
	private int m_Level;


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
			else if (name.equals("C_AcctSchema_ID"))
				m_C_AcctSchema_ID = para[i].getParameterAsInt();
			else if (name.equals("PostingType")) {
				m_PostingType = (String)para[i].getParameter();
			}
			else if (name.equals("DateAcct")) {
				m_DateAcct_From = (Timestamp)para[i].getParameter();
				m_DateAcct_To = (Timestamp)para[i].getParameter_To();
			}
			else if (name.equals("Level")) {
				m_Level = para[i].getParameterAsInt();
			}
			else if (name.equals("AccountValue")) {
				m_AccountValue_From = (String)para[i].getParameter();
				m_AccountValue_To = (String)para[i].getParameter_To();
			}
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
		
	}

	@Override
	protected String doIt() throws Exception {
		String sql = "SELECT " +
						"AD_Org_ID " +
					 "FROM " +
					 	"AD_Org " +
					 "WHERE " +
					 	"AD_Client_ID=? ";
		PreparedStatement pstmt = DB.prepareStatement(sql, this.get_TrxName());
		pstmt.setInt(1, m_AD_Client_ID);
		ResultSet rsOrgs = pstmt.executeQuery();
		Vector <Integer>vOrgs = getVectorFromResultSet(rsOrgs);
		
		sql = "SELECT " +
				"DISTINCT Account_ID " +
	          "FROM " +
	           	"Fact_Acct " +
	          "WHERE " +
	           	"AD_Client_ID=? " +
	 			"AND C_AcctSchema_ID=? " +
	 			"AND PostingType=? " +
	 			"AND DateAcct>=? " +
	 			"AND DateAcct<? ";
		pstmt = DB.prepareStatement(sql, this.get_TrxName());
		pstmt.setInt(1, m_AD_Client_ID);
		pstmt.setInt(2, m_C_AcctSchema_ID);
		pstmt.setString(3, m_PostingType);
		pstmt.setTimestamp(4, m_DateAcct_From);
		pstmt.setTimestamp(5, m_DateAcct_To);
		ResultSet rsAccounts = pstmt.executeQuery();
		Vector<Integer>vAccounts = getVectorFromResultSet(rsAccounts);
		
/*		sql = "CREATE TEMPORARY TABLE " +
				"tmp_acct_org " +
			  "AS " +
			  	"SELECT " +
			  		"Account_ID AS C_ElementValue_ID," +
			  		"sum(AmtAcctDr-AmtAcctCr) AS AmtAcct," +
			  		"AD_Org_ID " +
			  	"FROM " +
			  		"Fact_Acct " +
			  	"WHERE " +
			  		"AD_Client_ID=" + m_AD_Client_ID + " " +
			  		"AND C_AcctSchema_ID=" + m_C_AcctSchema_ID + " " +
			  		"AND PostingType='" + m_PostingType + "' " +
			  		"AND DateAcct>=to_date('" + m_DateAcct_From + "', 'yyyy-MM-dd') " + 
			  		"AND DateAcct<=to_date('" + m_DateAcct_To + "', 'yyyy-MM-dd') " +
			  	"GROUP BY " +
			  		"Account_ID," +
			  		"AD_Org_ID";
		int no = DB.executeUpdate(sql, this.get_TrxName());*/
		
		for (int org = 0; org < vOrgs.size(); org++) {
			int AD_Org_ID=vOrgs.get(org);
			for (int acct = 0; acct < vAccounts.size(); acct++) {
				int C_ElementValue_ID = vAccounts.get(acct);
				sql = "INSERT INTO " +
						"T_AcctOrg" +
						"(" +
							"AD_PInstance_ID," +
							"AD_Client_ID," +
							"AD_Org_ID," +
							"IsActive," +
							"Created," +
							"CreatedBy," +
							"Updated," +
							"UpdatedBy," +
							"C_AcctSchema_ID," +
							"PostingType," +
							"C_ElementValue_ID," +
							"DateAcct," +
							"account_Level," +
							"AccountValue," +
							"AmtAcct," +
							"AccountParent," +
							"AccountLevel," +
							"Value2" +
				        ") " +
				        "SELECT " +
				        	this.getAD_PInstance_ID() + "," +
				        	m_AD_Client_ID + "," +
				        	AD_Org_ID + "," +
				        	"'Y'," +
				        	"CURRENT_TIMESTAMP," +
				        	this.getAD_User_ID() + "," +
				        	"CURRENT_TIMESTAMP," +
				        	this.getAD_User_ID() + "," +
				        	m_C_AcctSchema_ID + "," +
				        	"'" + m_PostingType + "'," +
				        	"fa.Account_ID," +
				        	"max(fa.DateAcct)," +
				        	m_Level + "," +
				        	"max(ev.Value)," +
				        	"sum(fa.AmtAcctDr-fa.AmtAcctCr)," +
				        	"getParentAccount(fa.Account_ID)," +
				        	"getAccountLevel(fa.Account_ID)," +
				        	"max(ev.Value) " +
				        "FROM " +
				        	"Fact_Acct fa " +
				        	"RIGHT JOIN C_ElementValue ev ON (fa.Account_ID=ev.C_ElementValue_ID) " +
				        "WHERE " +
				        	"fa.AD_Client_ID=" + m_AD_Client_ID + " " +
				        	"AND fa.AD_Org_ID=" + AD_Org_ID + " " +
				        	"AND fa.C_AcctSchema_ID=" + m_C_AcctSchema_ID + " " +
				        	"AND fa.PostingType='" + m_PostingType + "' " +
				        	"AND fa.DateAcct>=to_date('" + m_DateAcct_From + "', 'yyyy/MM/dd') " +
				        	"AND fa.DateAcct<=to_date('" + m_DateAcct_To + "', 'yyyy/MM/dd') " +
				        	"AND fa.Account_ID=" + C_ElementValue_ID  + " ";
				if (m_AccountValue_From != null) {
					sql = sql +		"AND ev.Value >= '" + m_AccountValue_From + "' ";
				}
				if (m_AccountValue_To != null) {
					sql = sql +		"AND ev.Value <= '" + m_AccountValue_To + "' ";
				}
				sql = sql + "GROUP BY " +
							"fa.Account_ID";

				int no = DB.executeUpdate(sql, this.get_TrxName());
				if (no == -1) return "@Error@";
				else if (no == 0) {
					sql = "INSERT INTO " +
							"T_AcctOrg" +
							"(" +
								"AD_PInstance_ID," +
								"AD_Client_ID," +
								"AD_Org_ID," +
								"IsActive," +
								"Created," +
								"CreatedBy," +
								"Updated," +
								"UpdatedBy," +
								"C_AcctSchema_ID," +
								"PostingType," +
								"C_ElementValue_ID," +
								"DateAcct," +
								"Account_Level," +
								"AccountValue," +
								"AmtAcct," +
								"AccountParent," +
								"AccountLevel," +
								"Value2" +
					        ") " +
					        "SELECT " +
					        	this.getAD_PInstance_ID() + "," +
					        	m_AD_Client_ID + "," +
					        	AD_Org_ID + "," +
					        	"'Y'," +
					        	"CURRENT_TIMESTAMP," +
					        	this.getAD_User_ID() + "," +
					        	"CURRENT_TIMESTAMP," +
					        	this.getAD_User_ID() + "," +
					        	m_C_AcctSchema_ID + "," +
					        	"'" + m_PostingType + "'," +
					        	"ev.C_ElementValue_ID," +
					        	"'" + m_DateAcct_From + "'," +
					        	m_Level + "," +
					        	"ev.Value," +
					        	"0," +
					        	"getParentAccount(ev.C_ElementValue_ID)," +
					        	"getAccountLevel(ev.C_ElementValue_ID)," +
					        	"ev.Value " +
					        "FROM " +
					        	"C_ElementValue ev " +
					        "WHERE " +
					        	"C_ElementValue_ID=" + C_ElementValue_ID;
					no = DB.executeUpdate(sql, this.get_TrxName());
					if (no == -1) return "@Error@";

				}
			}
		}
		
		
		sql = "SELECT max(AccountLevel) FROM T_AcctOrg WHERE AD_PInstance_ID=" + this.getAD_PInstance_ID();
		int maxLevel = DB.getSQLValue(this.get_TrxName(), sql);

		for (int level = maxLevel; level > 0; level--) {
			sql = "INSERT INTO " +
					"T_AcctOrg" +
					"(" +
						"AD_PInstance_ID," +
						"AD_Client_ID," +
						"AD_Org_ID," +
						"IsActive," +
						"Created," +
						"CreatedBy," +
						"Updated," +
						"UpdatedBy," +
						"C_AcctSchema_ID," +
						"PostingType," +
						"C_ElementValue_ID," +
						"DateAcct," +
						"Account_Level," +
						"AccountValue," +
						"AmtAcct," +
						"AccountParent," +
						"AccountLevel," +
						"Value2," +
						"IsSubtotal " +
			        ") " +
			        "SELECT " +
			        	"max(t.AD_PInstance_ID)," +
			        	"max(t.AD_Client_ID)," +
			        	"t.AD_Org_ID," +
			        	"'Y'," +
			        	"CURRENT_TIMESTAMP," +
			        	"max(t.CreatedBy)," +
			        	"CURRENT_TIMESTAMP," +
			        	"max(t.UpdatedBy)," +
			        	"max(t.C_AcctSchema_ID)," +
			        	"max(PostingType)," +
			        	"t.AccountParent," +
			        	"max(t.DateAcct)," +
			        	"max(t.Account_Level)," +
			        	"ev.Value," +
			        	"sum(amtacct)," +
			        	"getParentAccount(t.AccountParent)," +
			        	"getAccountLevel(t.AccountParent)," +
			        	"rpad(ev.Value, 40, 'Z')," +
			        	"'Y' " +
			        "FROM " +
			        	"T_AcctOrg t, " +
			        	"C_ElementValue ev " +
			        "WHERE " +
			        	"t.AD_PInstance_ID=" + this.getAD_PInstance_ID() + " " +
						"AND t.AccountParent=ev.C_ElementValue_ID " +
						"AND t.AccountLevel=" + level + " " +
			        "GROUP BY " +
			        	"t.AD_Org_ID," +
			        	"t.AccountParent," +
			        	"ev.Value";
			if (DB.executeUpdate(sql, this.get_TrxName()) == -1)  return "@Error@";
		}

		if (m_Level > 0) {
			sql = "UPDATE " +
					"T_AcctOrg " +
				  "SET " +
			  		"IsVisible='Y' " +
			      "WHERE " +
			  		"AccountLevel<=" + m_Level + " " +
			  		"AND AD_PInstance_ID=" + this.getAD_PInstance_ID();
			int no = DB.executeUpdate(sql, this.get_TrxName());
			if (no == -1) return "@Error@";
		}
		else {
			sql = "UPDATE " +
					"T_AcctOrg " +
				  "SET " +
				  	"IsVisible='Y' " +
				  "WHERE " +
				  	"AD_PInstance_ID=" + this.getAD_PInstance_ID();
			int no = DB.executeUpdate(sql, this.get_TrxName());
			if (no == -1) return "@Error@";
		}

		return null;
	}

	private Vector<Integer> getVectorFromResultSet(ResultSet rs) throws SQLException {
		Vector<Integer> result = new Vector<Integer>();
		
		while (rs.next()) {
			result.addElement(rs.getInt(1));
		}

		return result;

	}
}
