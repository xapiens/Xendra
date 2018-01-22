package org.xendra.report;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.logging.Level;

import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;

import org.compiere.util.CPreparedStatement;
import org.compiere.util.DB;
import org.compiere.util.Env;

import org.nfunk.jep.*;

//import org.xendra.utils.*;

public class GeneralBalance extends SvrProcess {
	private int m_AD_Client_ID = 0;
	private int m_AD_Org_ID = 0;
	private int m_C_AcctSchema_ID = 0;
	private Timestamp m_DateAcct_From = null;
	private Timestamp m_DateAcct_To = null;
	private String m_PostingType = null;
	private String m_Type = null;

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
			else if (name.equals("C_AcctSchema_ID"))
				m_C_AcctSchema_ID = para[i].getParameterAsInt();
			else if (name.equals("DateAcct")) {
				m_DateAcct_From = (Timestamp)para[i].getParameter();
				m_DateAcct_To = (Timestamp)para[i].getParameter_To();
			}
			else if (name.equals("PostingType"))
				m_PostingType = (String)para[i].getParameter();
			else if (name.equals("Type"))
				m_Type = (String)para[i].getParameter();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}

	@Override
	protected String doIt() throws Exception {
		JEP parser = new JEP();
		parser.addStandardFunctions();
		parser.addStandardConstants();
		//parser.setAllowUndeclared(true);
		parser.setImplicitMul(true);
		parser.setAllowAssignment(true);
		
		String sql = "SELECT " +
						"Value " +
					 "FROM " +
					 	"C_Subject " +
					 "WHERE " +
					 	"Type=?";
		PreparedStatement pstmt = DB.prepareStatement(sql, get_TrxName());
		pstmt.setString(1, m_Type);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			parser.addVariable(rs.getString(1), new Double(0));
		}
		rs.close();
		pstmt.close();

		sql = "SELECT " +
						"CASE WHEN s.accounttype='A' THEN sum(f.amtacctdr-f.amtacctcr) ELSE sum(f.amtacctcr-f.amtacctdr) END," +
						"max(s.Value) " +
					 "FROM " +
					 	"Fact_Acct f " +
					 	"RIGHT JOIN C_ElementValue ev ON (ev.C_ElementValue_ID=f.Account_ID) ";
		if (m_Type.equals("BAGN"))
			sql = sql + "RIGHT JOIN C_Subject s ON (s.C_Subject_ID=ev.C_Subject_ID) ";
		else if (m_Type.equals("EGPN"))
			sql = sql + "RIGHT JOIN C_Subject s ON (s.C_Subject_ID=ev.EGPN_C_Subject_ID) ";
		else if (m_Type.equals("EGPF"))
			sql = sql + "RIGHT JOIN C_Subject s ON (s.C_Subject_ID=ev.EGPF_C_Subject_ID) ";
		sql = sql +
					 "WHERE " +
                  		"f.AD_Client_ID=? ";
		if (m_AD_Org_ID != 0) {
			sql = sql + "AND f.AD_Org_ID=? ";
		}
		sql = sql +
						"AND f.DateAcct>=? " +
						"AND f.DateAcct<=? " +
						"AND f.C_AcctSchema_ID=? " +
						"AND f.PostingType=? " +
                     "GROUP BY " +
                  		"s.c_subject_id," +
                  		"s.accounttype";
		pstmt = DB.prepareStatement(sql, get_TrxName());
		pstmt.setInt(1, m_AD_Client_ID);
		if (m_AD_Org_ID != 0) {
			pstmt.setInt(2, m_AD_Org_ID);
			pstmt.setTimestamp(3, m_DateAcct_From);
			pstmt.setTimestamp(4, m_DateAcct_To);
			pstmt.setInt(5, m_C_AcctSchema_ID);
			pstmt.setString(6, m_PostingType);
		}
		else {
			pstmt.setTimestamp(2, m_DateAcct_From);
			pstmt.setTimestamp(3, m_DateAcct_To);
			pstmt.setInt(4, m_C_AcctSchema_ID);
			pstmt.setString(5, m_PostingType);			
		}
		rs = pstmt.executeQuery();

		while (rs.next()) {
			BigDecimal AmtAcct = rs.getBigDecimal(1);
			String Value = rs.getString(2);
			String formula = Value + "=" + AmtAcct;
			parser.parseExpression(formula);
			Object jj = parser.getValueAsObject();
			if (jj != null) System.out.println("Assignment " + formula + " is " + jj);
		}
		
		rs.close();
		pstmt.close();

		sql = "SELECT " +
				"s.Value," +
				"s.Formula " +
			  "FROM " +
			  	"C_Subject s " +
			  	"LEFT JOIN AD_TreeNode tn ON (tn.AD_Tree_ID=getTree(s.AD_Client_ID, 'AS') AND tn.Node_ID=s.c_subject_id) " +
			  "WHERE " +
			  	"IsCalculated='Y' " +
			  	"AND Type=? " +
			  "ORDER BY " +
			  	"tn.seqno ASC";
		pstmt = DB.prepareStatement(sql, get_TrxName());
		pstmt.setString(1, m_Type);
		rs = pstmt.executeQuery();
		
		while (rs.next()) {
			String Value = rs.getString(1);
			String Formula = rs.getString(2);
			String formula = Value + "=" + Formula;
			parser.parseExpression(formula);
			Object jj = parser.getValueAsObject();
			if (jj != null) System.out.println("Result of formula " + formula + "is " + jj);
		}

		rs.close();
		pstmt.close();
		
		sql = "SELECT " +
				"s.C_Subject_ID," +
				"s.Name," +
				"s.Value," +
				"s.AccountType," +
				"tn.seqno " +
	          "FROM " +
	          	"C_Subject s " +
	          	"LEFT JOIN AD_TreeNode tn ON (tn.AD_Tree_ID=getTree(s.AD_Client_ID, 'AS') AND tn.Node_ID=s.c_subject_id) " +
	          "WHERE " +
	          	"s.Type=? " +
	          "ORDER BY " +
	          	"tn.seqno ASC";
		pstmt = DB.prepareStatement(sql, get_TrxName());
		pstmt.setString(1, m_Type);
		rs = pstmt.executeQuery();
		while (rs.next()) {
			int C_Subject_ID = rs.getInt(1);
			String Name = rs.getString(2);
			String Value = rs.getString(3);
			String AccountType = rs.getString(4);
			int seqno = rs.getInt(5);

			Double var = (Double)parser.getVarValue(Value);
			if (var != null && var.compareTo(0.0) != 0) {
				sql = "INSERT INTO " +
						"T_GeneralBalance (" +
							"AD_PInstance_ID," +
							"AD_Client_ID," +
							"AD_Org_ID," +
							"IsActive," +
							"Created," +
							"CreatedBy," +
							"Updated," +
							"UpdatedBy," +
							"C_AcctSchema_ID," +
							"DateAcct," +
							"Name," +
							"AmtAcct," +
							"PostingType," +
							"AccountType," +
							"C_Subject_ID," +
							"Value," +
							"seqno," +
							"Type" +
					    ")" +
				      "VALUES (" +
				  		"?," +
				  		"?," +
				  		"?," +
				  		"'Y'," +
				  		"CURRENT_TIMESTAMP," +
				  		"?," +
				  		"CURRENT_TIMESTAMP," +
				  		"?," +
				  		"?," +
				  		"?," +
				  		"?," +
				  		"?," +
				  		"?," +
				  		"?," +
				  		"?," +
				  		"?," +
				  		"?," +
				  		"?" +
				      ")";
				CPreparedStatement cstmt = DB.prepareStatement(sql, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE, get_TrxName());
				cstmt.setInt(1, getAD_PInstance_ID());
				cstmt.setInt(2, m_AD_Client_ID);
				cstmt.setInt(3, m_AD_Org_ID);
				cstmt.setInt(4, Env.getAD_User_ID(getCtx()));
				cstmt.setInt(5, Env.getAD_User_ID(getCtx()));
				cstmt.setInt(6, m_C_AcctSchema_ID);
				cstmt.setTimestamp(7, m_DateAcct_From);
				cstmt.setString(8, Name);
				cstmt.setDouble(9, var);
				cstmt.setString(10, m_PostingType);
				cstmt.setString(11, AccountType);
				cstmt.setInt(12, C_Subject_ID);
				cstmt.setString(13, Value);
				cstmt.setInt(14, seqno);
				cstmt.setString(15, m_Type);
				int no = cstmt.executeUpdate();
				if (no == -1) return "@Error@";
			}
		}
		rs.close();
		pstmt.close();
		return null;
	}

}
