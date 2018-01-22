package org.xendra.report;

import java.util.logging.Level;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.sql.SQLException;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;

public class AcquisitionSummaryReport extends SvrProcess {
	private int m_AD_Client_ID;
	private int m_AD_Org_ID;
	private int m_C_AcctSchema_ID;
	private Timestamp m_DateAcct_From;
	private Timestamp m_DateAcct_To;
	private int m_C_DocGroup_ID;
	
	
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
			else if (name.equals("C_DocGroup_ID"))
				m_C_DocGroup_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
		
	}
	
	protected String doIt() throws Exception
	{
		String m_IsSOTrx;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int m_AD_Table_ID;
		StringBuffer sb = new StringBuffer();
		String SOPOTrx;
		
		String sql = "SELECT IsSOTrx FROM C_DocGroup WHERE C_DocGroup_ID=?";
		pstmt = DB.prepareStatement(sql, null);
		pstmt.setInt(1, m_C_DocGroup_ID);

		rs = pstmt.executeQuery();
		if (rs.next())
			m_IsSOTrx = rs.getString(1);
		else
			return "@NO@ @C_DocGroup@";
		
		rs.close();

		//table_id:=table_name2id('C_Invoice');
		sql = "SELECT table_name2id('C_Invoice')";
		m_AD_Table_ID = DB.getSQLValue(null, sql);

		try {
			sql = "DROP VIEW rv_registrogroupfinal_PO";
			int no = DB.executeUpdate(sql, null);
		} catch (Exception e) {}
		try {
			sql = "DROP VIEW rv_registrogroupfinal_SO";
			int no = DB.executeUpdate(sql, null);
		} catch (Exception e) {}
		try {
			sql = "DROP VIEW rv_registrofinal_PO";
			int no = DB.executeUpdate(sql, null);
		} catch (Exception e) {}
		try {
			sql = "DROP VIEW rv_registrofinal_SO";
			int no = DB.executeUpdate(sql, null);
		} catch (Exception e) {}
		try {
			sql = "DROP VIEW rv_registrohorizontal";
			int no = DB.executeUpdate(sql, null);
		} catch (Exception e) {}
		try {
			sql = "DROP VIEW rv_registrovertical";
			int no = DB.executeUpdate(sql, null);
		} catch (Exception e) {}


		sql = "CREATE VIEW rv_registrovertical AS " + 
				"SELECT " +
					"f.C_AcctSchema_ID," +
					"f.ad_client_id," +
					"f.ad_table_id,"+
					"f.record_id,"+
					"f.account_id,"+
					"f.c_tax_id," +
					(m_IsSOTrx.equals('Y')?
							"sum(CASE WHEN d.issotrx='Y' THEN f.amtsourcecr ELSE -1*f.amtsourcedr END) as amtsource, " +
							"sum(CASE WHEN d.issotrx='Y' THEN f.amtacctcr ELSE -1*f.amtacctdr END) AS amtacct "
							:
							"sum(CASE WHEN d.issotrx='N' THEN f.amtsourcedr ELSE -1*f.amtsourcecr END) as amtsource, " +
							"sum(CASE WHEN d.issotrx='N' THEN f.amtacctdr ELSE -1*f.amtacctcr END) AS amtacct "
					) +
				"FROM " +
					"fact_acct f, " +
					"c_invoice i " +
					"INNER JOIN " +
						"c_doctype d ON (d.c_doctype_id=i.c_doctype_id) " +
				"WHERE " +
					"f.ad_table_id=" + m_AD_Table_ID + " " +
					"AND i.c_invoice_id=f.record_id " +
					"AND i.c_doctype_id in (" +
						"SELECT " +
							"l.c_doctype_id " +
						"FROM " +
							"c_docgroupline l " +
						"WHERE " + 
							"l.c_docgroup_id=" + m_C_DocGroup_ID + " " +
					") " +
					"AND f.C_AcctSchema_ID=" + m_C_AcctSchema_ID + " " +
				"GROUP BY " + 
					"f.C_AcctSchema_ID," +
					"f.ad_client_id," +
					"f.ad_table_id," +
					"f.record_id," +
					"f.account_id," +
					"f.c_tax_id " +
				"ORDER BY " +
					"f.ad_client_id," +
					"f.ad_table_id," +
					"f.record_id," +
					"f.account_id";
		int no = DB.executeUpdate(sql, null);

		rs = getTaxes(m_AD_Client_ID);

		while (rs.next()) {
			int m_C_ElementValue_ID = rs.getInt(1);
			int m_C_Tax_ID = rs.getInt(2);
			String m_TaxAlias = rs.getString(3);
			
			if (m_TaxAlias != null) {
				if (m_TaxAlias.charAt(0) == 'N' || m_TaxAlias.equals("SIM")) {
					sb.append(" ,sum(case when r.c_tax_id=" + m_C_Tax_ID + " then r.amtsource else 0.0 end) amtsource_" + m_TaxAlias);
					sb.append(",sum(case when r.c_tax_id=" + m_C_Tax_ID + " then r.amtacct else 0.0 end) amtacct_'" + m_TaxAlias);
				}
				else {
					sb.append(" ,sum(case when r.c_tax_id=" + m_C_Tax_ID + " and r.account_id!=" + m_C_ElementValue_ID + " then r.amtsource else 0.0 end) amtsource_" + m_TaxAlias);
					sb.append(",sum(case when r.c_tax_id=" + m_C_Tax_ID + " and r.account_id=" + m_C_ElementValue_ID + " then r.amtsource else 0.0 end) amtsource_apl_" + m_TaxAlias);
					sb.append(",sum(case when r.c_tax_id=" + m_C_Tax_ID + " and r.account_id!=" + m_C_ElementValue_ID + " then r.amtacct else 0.0 end) amtacct_" + m_TaxAlias);
					sb.append(",sum(case when r.c_tax_id=" + m_C_Tax_ID + " and r.account_id=" + m_C_ElementValue_ID + " then r.amtacct else 0.0 end) amtacct_apl_" + m_TaxAlias);
				}
			}
		}
		sql = "CREATE VIEW " +
					"rv_registrohorizontal " +
			  " AS " +
					"SELECT " +
						"r.C_AcctSchema_ID," +
						"r.ad_table_id," +
						"r.record_id," +
						sb.toString() + (sb.toString().length() > 0 ? "," : " ")  +
						"sum(r.amtsource) as grandamtsource, " +
						"sum(r.amtacct) as grandamtacct," +
						"case when sum(r.amtsource)=sum(r.amtacct) then null else sum(r.amtacct)/sum(r.amtsource) end as rate " +
					"FROM " +
						"rv_registrovertical r " +
					"GROUP BY " +
						"r.C_AcctSchema_ID," +
						"r.ad_table_id," +
						"r.record_id";
		no = DB.executeUpdate(sql, null);
		
		sb = new StringBuffer();
		
		rs = getTaxes(m_AD_Client_ID);
		
		while (rs.next()) {
			int m_C_ElementValue_ID = rs.getInt(1);
			int m_C_Tax_ID = rs.getInt(2);
			String m_TaxAlias = rs.getString(3);

			if (m_TaxAlias != null) {
				if (m_TaxAlias.charAt(0) == 'N' || m_TaxAlias.equals("SIM")) {
					sb.append(" ,sum(t.amtsource_" + m_TaxAlias + ") AS amtsource_" + m_TaxAlias);
					sb.append(",sum(t.amtacct_" + m_TaxAlias + ") AS amtacct_" + m_TaxAlias);
				}
				else {
					sb.append(" ,sum(t.amtsource_" + m_TaxAlias + ") AS amtsource_" + m_TaxAlias);
					sb.append(",sum(t.amtsource_apl_" + m_TaxAlias + ") AS amtsource_apl_" + m_TaxAlias);
					sb.append(",sum(t.amtacct_" + m_TaxAlias + ") AS amtacct_" + m_TaxAlias);
					sb.append(",sum(t.amtacct_apl_" + m_TaxAlias + ") AS amtacct_apl_" + m_TaxAlias);
				}
			}
		}
		
		if (m_IsSOTrx.equals('Y')) {
			SOPOTrx="SO";
		}
		else {
			SOPOTrx="PO";
		}
		
		sql = "CREATE VIEW " +
					"rv_registrogroupfinal_" + SOPOTrx + " " +
			  "AS " +
			  		"SELECT " +
			  			"max(i.AD_Client_ID) AS AD_Client_ID," +
			  			"max(i.AD_Org_ID) AS AD_Org_ID," +
			  			"'Y' AS ISACTIVE," +
			  			"max(I.Created) AS Created, " +
			  			"max(I.CreatedBy) AS CreatedBy," +
			  			"max(I.Updated) AS Updated," +
			  			"max(I.UpdatedBy) AS UpdatedBy," +
			  			m_C_AcctSchema_ID + " AS C_AcctSchema_ID," +
			  			"bp.c_bpartner_id,bp.value,bp.name " +
			  			sb.toString() +
			  			" ,sum(t.grandamtsource) AS amtsource," +
			  			"sum(t.grandamtacct) AS amtacct," +
			  			m_C_DocGroup_ID + " AS c_docgroup_id," +
			  			"to_date('" + m_DateAcct_From.toString() + "','yyyy/MM/dd') as DateAcct " + 
                    "FROM " +
                        "rv_registrohorizontal t " +
                        "INNER JOIN C_Invoice i ON (t.record_id=i.C_Invoice_ID) " +
                        "INNER JOIN C_DocType d ON (i.C_DocType_ID=d.C_DocType_ID) " +
                        "INNER JOIN C_BPartner bp ON (i.C_BPartner_ID=bp.C_BPartner_ID) " +
                        "INNER JOIN C_CURRENCY cu ON(cu.c_currency_id=i.c_currency_id) " +
                        "LEFT OUTER JOIN c_project prj ON (prj.c_project_id=i.c_project_id) " +
                        "INNER JOIN ad_user sr ON (sr.ad_user_id=i.salesrep_id) " +
                    "WHERE " +
                        "i.DATEACCT >=to_date('" + m_DateAcct_From.toString() + "','yyyy/MM/dd') " +
                        "AND i.DATEACCT<=to_date('" + m_DateAcct_To.toString() + "','yyyy/MM/dd') " +
                    "GROUP BY " +
                    	"bp.c_bpartner_id," +
                    	"bp.value," +
                    	"bp.name";
		no = DB.executeUpdate(sql, null);
		return null;
	}
	
	private ResultSet getTaxes(int m_AD_Client_ID) throws SQLException
	{
		PreparedStatement pstmt = null;
		String sql = "SELECT " +
					"distinct E.C_ELEMENTVALUE_ID," +
					"T.C_TAX_ID, " +
					"T.TaxAlias " +
		      "FROM " +
	  				"C_TAX_ACCT A " +
	  				"INNER JOIN C_TAX T ON (T.C_TAX_ID=A.C_TAX_ID) " +
	  				"INNER JOIN C_VALIDCOMBINATION V ON (V.C_VALIDCOMBINATION_ID=A.T_DUE_ACCT) " +
	  				"INNER JOIN C_ELEMENTVALUE E ON (E.C_ELEMENTVALUE_ID=V.ACCOUNT_ID) " +
	  		  "WHERE " +
	  		  		"T.AD_CLIENT_ID=? " +
	  		  		"AND t.isactive='Y'";
		pstmt = DB.prepareStatement(sql, null);
		pstmt.setInt(1, m_AD_Client_ID);

		return pstmt.executeQuery();
		
	}

}
