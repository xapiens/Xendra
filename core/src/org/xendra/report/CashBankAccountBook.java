package org.xendra.report;

import java.sql.Timestamp;
import java.util.logging.Level;

import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;

import org.compiere.util.DB;

public class CashBankAccountBook  extends SvrProcess {
	private int m_AD_Client_ID;
	private int m_AD_Org_ID;
	private int m_C_AcctSchema_ID;
	private String m_PostingType;
	private Timestamp m_DateAcct_From;
	private Timestamp m_DateAcct_To;

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
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
		
	}

	protected String doIt() throws Exception
	{		  
		String sql = "INSERT INTO " +
						"t_cashbankaccount (" +
							"AD_PInstance_ID," +
							"AD_Client_ID," +
							"AD_Org_ID," +
							"IsActive," +
							"Created," +
							"CreatedBy," +
							"Updated," +
							"UpdatedBy," +
							"c_acctschema_id," +
							"postingtype," +
							"value," +
							"c_elementvalue_id," +
							"dateacct," +
							"description," +
							"amtacctcr," +
							"amtacctdr," +
							"ad_table_id," +
							"c_bankaccount_id," +
							"c_bpartner_id," +
							"DocumentNo," +
							"tendertype," +
							"c_cashbook_id," +
							"Fact_ID," +
							"GL_Category_ID" +
						") " +
						" SELECT " + 
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
						  "ev.value," +
						  "ev.c_elementvalue_id," +
						  "fa.dateacct," +
						  "fa.description," +
						  "fa.amtacctcr," +
						  "fa.amtacctdr," +
						  "fa.ad_table_id," +
						  "CASE WHEN fa.ad_table_id=407 then 0 ELSE p.c_bankaccount_id END," +
						  "p.c_bpartner_id," +
						  "p.DocumentNo," +
						  "p.tendertype," +
						  "CASE WHEN fa.ad_table_id=407 then ca.c_cashbook_id ELSE 0 END," +
						  "fa.Fact_ID," +
						  "fa.GL_Category_ID " +
						" FROM " +
						  "fact_acct fa " +
						  "INNER JOIN c_elementvalue ev ON (fa.account_id = ev.c_elementvalue_id) " +
						  "LEFT OUTER JOIN c_payment p ON (fa.record_id = p.c_payment_id and fa.ad_table_id=335) " +
						  "LEFT OUTER JOIN c_cash ca ON (fa.record_id = ca.c_cash_id and fa.ad_table_id=407) " +
						" WHERE " +
						  " fa.dateacct >= to_date('" + m_DateAcct_From + "', 'yyyy-MM-dd') AND " + 
						  " fa.dateacct <= to_date('" + m_DateAcct_To + "', 'yyyy-MM-dd') AND " + 
						  " fa.ad_table_id IN (335, 407) AND " +
						  " fa.ad_client_id = " + m_AD_Client_ID +  " ";
		if (m_AD_Org_ID != 0) {
			sql = sql + "AND fa.AD_Org_ID=" + m_AD_Org_ID + " ";
		}						  
		int no = DB.executeUpdate(sql, this.get_TrxName());
		if (no == -1) {
			return "@error@";
		}
		
		sql = "INSERT INTO " +
				"t_cashbankaccount " +
				"(" +
					"AD_PInstance_ID," +
					"AD_Client_ID," +
					"AD_Org_ID," +
					"IsActive," +
					"Created," +
					"CreatedBy," +
					"Updated," +
					"UpdatedBy," +
					"c_acctschema_id," +
					"postingtype," +
					"value," +
					"c_elementvalue_id," +
					"dateacct," +
					"description," +
					"amtacctcr," +
					"amtacctdr," +
					"ad_table_id," +
					"c_bankaccount_id," +
					"c_bpartner_id," +
					"DocumentNo," +
					"tendertype," +
					"c_cashbook_id," +
					"fact_id," +
					"gl_category_id" +
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
		  			"ev.value," +
		  			"ev.c_elementvalue_id," +
		  			"f.dateacct," +
		  			"f.description," +
		  			"f.amtacctcr," +
		  			"f.amtacctdr," +
		  			"f.ad_table_id," +
		  			"py.c_bankaccount_id," +
		  			"py.c_bpartner_id," +
		  			"py.documentno," +
		  			"py.tendertype," +
		  			"cl.c_cash_id," +
		  			"f.fact_id," +
		  			"f.gl_category_id " +
		  		"FROM " +
              		"fact_acct f " +
              		"LEFT JOIN C_elementvalue ev on (f.account_id=ev.c_elementvalue_id) " +
              		"RIGHT JOIN C_AllocationLine al ON (f.record_id=al.c_allocationhdr_id AND f.line_id=al.c_allocationline_id) " +
              		"LEFT JOIN C_Payment py ON (al.c_payment_id=py.c_payment_id) " +
              		"LEFT JOIN C_CashLine cl ON (al.c_cashline_id=cl.c_cashline_id) " +
                "WHERE " +
				  	"f.dateacct >= to_date('" + m_DateAcct_From + "', 'yyyy-MM-dd') " + 
				  	"and f.dateacct <= to_date('" + m_DateAcct_To + "', 'yyyy-MM-dd') " + 
					"and f.ad_client_id = " + m_AD_Client_ID +  " ";
		if (m_AD_Org_ID != 0) {
			sql = sql + "AND f.AD_Org_ID=" + m_AD_Org_ID + " ";
		}
		sql = sql +
              		"and f.ad_table_id=735 " +
              		"and f.line_id is not null " +
              		"and (al.c_payment_id is not null or al.c_cashline_id is not null) " +
                "ORDER BY " +
              		"py.c_bankaccount_id, " +
              		"cl.c_cash_id, " +
              		"f.dateacct";

		no = DB.executeUpdate(sql, this.get_TrxName());
		if (no == -1) {
			return "@error@";
		}

		return null;
	}
}
