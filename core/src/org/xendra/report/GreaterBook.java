package org.xendra.report;

import java.sql.Timestamp;
import java.util.logging.Level;

import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;

import org.compiere.util.DB;



public class GreaterBook  extends SvrProcess {
	private int m_AD_Client_ID;
	private int m_AD_Org_ID;
	private int m_C_AcctSchema_ID;
	private String m_PostingType;
	private Timestamp m_DateAcct_From;
	private Timestamp m_DateAcct_To;
	private String m_AccountValue_From;
	private String m_AccountValue_To;

	protected void prepare()
	{
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
			else if (name.equals("C_AcctSchema_ID"))
				m_C_AcctSchema_ID = para[i].getParameterAsInt();
			else if (name.equals("DateAcct")) {
				m_DateAcct_From = (Timestamp)para[i].getParameter();
				m_DateAcct_To = (Timestamp)para[i].getParameter_To();
			}
			else if (name.equals("PostingType")) {
				m_PostingType = (String)para[i].getParameter();
			}
			else if (name.equals("AccountValue")) {
				m_AccountValue_From = (String)para[i].getParameter();
				m_AccountValue_To = (String)para[i].getParameter_To();
			}
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
		
	}

	protected String doIt() throws Exception
	{
		String sql = "INSERT INTO " +
						"T_Greater (" +
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
							"AccountValue," +
							"C_ElementValue_ID," +
							"DateAcct," +
							"Fact_Order," +
							"Description," +
							"AmtAcctCr," +
							"AmtAcctDr," +
							"AccountParent," +
							"AccountLevel," +
							"Value2," +
							"Fact_ID," +
							"GL_Category_ID" +
						") " +
						"SELECT " +
							this.getAD_PInstance_ID() + "," +
							m_AD_Client_ID + "," +
							m_AD_Org_ID + "," +
							"'Y'," +
							"CURRENT_TIMESTAMP," +
							this.getAD_User_ID() + "," +
							"CURRENT_TIMESTAMP," +
							this.getAD_User_ID() + "," +
							m_C_AcctSchema_ID + "," +
							"'" + m_PostingType + "'," +
							"ev.Value," +
							"ev.C_ElementValue_ID," +
							"fa.DateAcct," +
							"0," +
							"fa.Description," +
							"fa.AmtAcctCr," +
							"fa.AmtAcctDr," +
							"getParentAccount(ev.C_ElementValue_ID)," +
							"getAccountLevel(ev.C_ElementValue_ID)," +
							"rpad(ev.Value, 40, '0')," +
							"fa.Fact_ID," +
							"fa.GL_Category_ID " +
						"FROM " +
                      		"fact_acct fa " +
                      		"INNER JOIN C_ElementValue ev ON (fa.Account_ID=ev.C_ElementValue_ID) " +
                        "WHERE " +
                      		"fa.AD_Client_ID=" + m_AD_Client_ID + " ";
		if (m_AD_Org_ID != 0) {
			sql = sql + "AND fa.AD_Org_ID=" + m_AD_Org_ID + " ";
		}
		sql = sql +
                      		"AND fa.DateAcct>=to_date('" + m_DateAcct_From + "', 'yyyy-MM-dd') " +
                      		"AND fa.DateAcct<=to_date('" + m_DateAcct_To + "', 'yyyy-MM-dd') ";
		if (m_AccountValue_From != null) {
			sql = sql +		"AND ev.Value >= '" + m_AccountValue_From + "' ";
		}
		if (m_AccountValue_To != null) {
			sql = sql +		"AND ev.Value <= '" + m_AccountValue_To + "' ";
		}

		int no = DB.executeUpdate(sql, this.get_TrxName());
		if (no == -1) {
			return "@error@";
		}
		
		sql = "INSERT INTO " +
						"T_Greater (" +
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
							"AccountValue," +
							"C_ElementValue_ID," +
							"DateAcct," +
							"Fact_Order," +
							"Description," +
							"AmtAcctCr," +
							"AmtAcctDr," +
							"AccountParent," +
							"AccountLevel," +
							"Value2," +
							"IsSubtotal" +
		                ") " +
						"SELECT " +
							this.getAD_PInstance_ID() + "," +
							m_AD_Client_ID + "," +
							m_AD_Org_ID + "," +
							"'Y'," +
							"CURRENT_TIMESTAMP," +
							this.getAD_User_ID() + "," +
							"CURRENT_TIMESTAMP," +
							this.getAD_User_ID() + "," +
							m_C_AcctSchema_ID + "," +
							"'" + m_PostingType + "'," +
							"max(ev.Value)," +
							"t.C_ElementValue_ID," +
							"max(t.DateAcct)," +
							"0," +
							"'Subtotal'," +
							"sum(t.AmtAcctCr)," +
							"sum(t.AmtAcctDr)," +
							"getParentAccount(t.C_ElementValue_ID)," +
							"getAccountLevel(t.C_ElementValue_ID)," +
							"rpad(max(ev.Value), 40, '9')," +
							"'Y' " +
					    "FROM " +
              				"T_Greater t, " +
              				"C_ElementValue ev " +
              		    "WHERE " +
              				"t.AD_PInstance_ID=" + this.getAD_PInstance_ID() + " " +
              				"AND ev.C_ElementValue_ID=t.C_ElementValue_ID " +
              		    "GROUP BY " +
              				"t.C_ElementValue_ID";
		no = DB.executeUpdate(sql, this.get_TrxName());
		
		int maxlevel = DB.getSQLValue(this.get_TrxName(), "SELECT max(AccountLevel) FROM T_Greater");
		
		if (maxlevel > 0) {
			for (int i = maxlevel; i > 0; i--) {
				sql = "INSERT INTO " +
						"T_Greater (" +
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
							"AccountValue," +
							"C_ElementValue_ID," +
							"DateAcct," +
							"Fact_Order," +
							"Description," +
							"AmtAcctCr," +
							"AmtAcctDr," +
							"AccountParent," +
							"AccountLevel," +
							"Value2," +
							"IsSubtotal" +
						") " +
						"SELECT " +
							this.getAD_PInstance_ID() + "," +
							m_AD_Client_ID + "," +
							m_AD_Org_ID + "," +
							"'Y'," +
							"CURRENT_TIMESTAMP," +
							this.getAD_User_ID() + "," +
							"CURRENT_TIMESTAMP," +
							this.getAD_User_ID() + "," +
							m_C_AcctSchema_ID + "," +
							"'" + m_PostingType + "'," +
							"ev.Value," +
							"t.AccountParent," +
							"max(t.DateAcct)," +
							"0," +
							"'Subtotal'," +
							"sum(t.AmtAcctCr)," +
							"sum(t.AmtAcctDr)," +
							"getParentAccount(t.AccountParent)," +
							"getAccountLevel(t.AccountParent)," +
							"rpad(ev.Value, 40, 'Z')," +
							"'Y' " +
						"FROM " +
                  			"T_Greater t, " +
                  			"C_ElementValue ev " +
                  		"WHERE " +
                  			"t.AD_PInstance_ID=" + this.getAD_PInstance_ID() + " "+
                  			"AND t.IsSubtotal='Y' " +
                  			"AND t.AccountLevel=" + i + " " +
                  			"AND ev.C_ElementValue_ID=t.AccountParent " +
                  		"GROUP BY " +
                  			"t.AccountParent," +
                  			"ev.Value ";
				no = DB.executeUpdate(sql, this.get_TrxName());
			}
		}
		
		sql = "INSERT INTO " +
				"T_Greater (" +
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
					"AccountValue," +
					"C_ElementValue_ID," +
					"DateAcct," +
					"Fact_Order," +
					"Description," +
					"AmtAcctCr," +
					"AmtAcctDr," +
					"AccountParent," +
					"AccountLevel," +
					"Value2," +
					"IsSubtotal" +
				") " +
				"SELECT " +
					this.getAD_PInstance_ID() + "," +
					m_AD_Client_ID + "," +
					m_AD_Org_ID + "," +
					"'Y'," +
					"CURRENT_TIMESTAMP," +
					this.getAD_User_ID() + "," +
					"CURRENT_TIMESTAMP," +
					this.getAD_User_ID() + "," +
					m_C_AcctSchema_ID + "," +
					"'" + m_PostingType + "'," +
					"null," +
					"null," +
					"max(t.DateAcct)," +
					"0," +
					"'Total'," +
					"sum(t.AmtAcctCr)," +
					"sum(t.AmtAcctDr)," +
					"0," +
					"0," +
					"rpad('9', 40, '9')," +
					"'Y' " +
				"FROM " +
					"T_Greater t " +
				"WHERE " +
					"t.AD_PInstance_ID=" + this.getAD_PInstance_ID() + " " +
					"AND t.IsSubtotal='N'";
		no = DB.executeUpdate(sql, this.get_TrxName());

		return null;
	}
}
