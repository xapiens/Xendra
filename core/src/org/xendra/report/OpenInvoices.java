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

public class OpenInvoices extends SvrProcess {
	private int m_AD_Client_ID = 0;
	private int m_AD_Org_ID = 0;
	private int m_C_AcctSchema_ID = 0;
	private Timestamp m_DateAcct_From = null;
	private Timestamp m_DateAcct_To = null;
	private String m_AccountValue_From = null;
	private String m_AccountValue_To = null;
	private String m_PostingType = null;
	private boolean m_IsSummary = false;

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
			else if (name.equals("AccountValue")) {
				m_AccountValue_From = (String)para[i].getParameter();
				m_AccountValue_To = (String)para[i].getParameter_To();
			}
			else if (name.equals("IsSummary")) {
				m_IsSummary = ((String)para[i].getParameter()).equals("Y")?true:false;
			}
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}		
	}


	@Override
	protected String doIt() throws Exception {
		
		/* Generacion de saldos de las cuentas */
		String sql = "SELECT " +
						"max(ev.Value)," +
						//"sum(fact.amtacctdr)," +
						//"sum(fact.amtacctcr)," +
						"case when sum(fact.amtacctdr)>sum(fact.amtacctcr) then sum(fact.amtacctdr)-sum(fact.amtacctcr) else 0 end as debe," +
						"case when sum(fact.amtacctdr)<sum(fact.amtacctcr) then sum(fact.amtacctcr)-sum(fact.amtacctdr) else 0 end as haber " +
					 "FROM " +
					 	"fact_acct fact " +
					 	"RIGHT JOIN C_ElementValue ev ON (ev.C_ElementValue_ID=fact.Account_ID) " +
					 "WHERE " +
					 	"ev.Value>=? " +
					 	"AND ev.Value<? " +
					 	"AND fact.DateAcct<? " +
					 	"AND fact.AD_Client_ID=? " +
					 	"AND fact.PostingType=? " +
					 	"AND fact.C_AcctSchema_ID=? ";
		if (m_AD_Org_ID != 0)
			sql = sql + "AND fact.AD_Org_ID=? ";
		sql = sql +
					 "GROUP BY " +
					 	"fact.Account_ID";

		PreparedStatement pstmt = DB.prepareStatement(sql, get_TrxName());
		pstmt.setString(1, m_AccountValue_From);
		pstmt.setString(2, m_AccountValue_To);
		pstmt.setTimestamp(3, m_DateAcct_From);
		pstmt.setInt(4, m_AD_Client_ID);
		pstmt.setString(5, m_PostingType);
		pstmt.setInt(6, m_C_AcctSchema_ID);
		if (m_AD_Org_ID != 0) pstmt.setInt(7, m_AD_Org_ID);
		
		ResultSet rs = pstmt.executeQuery();

		while(rs.next()) {
			String AccountValue = rs.getString(1);
			BigDecimal AmtAcctDr = rs.getBigDecimal(2);
			BigDecimal AmtAcctCr = rs.getBigDecimal(3);
			if ((AmtAcctDr == null && AmtAcctCr == null) || (AmtAcctDr.signum() == 0 && AmtAcctCr.signum() == 0)) continue;

			/* Insercion de saldos */
			sql = "INSERT INTO " +
					"T_OpenInvoices (" +
						"AD_PInstance_ID," +
						"AD_Client_ID," +
						"AD_Org_ID," +
						"IsActive," +
						"Created," +
						"CreatedBy," +
						"Updated," +
						"UpdatedBy," +
						"DateAcct," +
						"C_AcctSchema_ID," +
						"AccountValue," +
						"PostingType," +
						"IsSummary," +
						"Description," +
						"AmtAcctDr," +
						"AmtAcctCr," +
						"OpenAmt" +
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
						"?" +
					")";
			CPreparedStatement stmt = DB.prepareStatement(sql, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE, get_TrxName());
			stmt.setInt(1, getAD_PInstance_ID());
			stmt.setInt(2, m_AD_Client_ID);
			stmt.setInt(3, m_AD_Org_ID);
			stmt.setInt(4, Env.getAD_User_ID(getCtx()));
			stmt.setInt(5, Env.getAD_User_ID(getCtx()));
			stmt.setTimestamp(6, m_DateAcct_From);
			stmt.setInt(7, m_C_AcctSchema_ID);
			stmt.setString(8, AccountValue);
			stmt.setString(9, m_PostingType);
			stmt.setString(10, m_IsSummary?"Y":"N");
			stmt.setString(11, "Saldos Iniciales Cuenta " + AccountValue);
			stmt.setBigDecimal(12, AmtAcctDr);
			stmt.setBigDecimal(13, AmtAcctCr);
			stmt.setBigDecimal(14, AmtAcctDr.subtract(AmtAcctCr));
			if (stmt.executeUpdate() == -1) return "@Error@";
		}

		/* Facturas */
		sql = "SELECT " +
				"ev.Value," +
				"fact.AmtAcctDr," +
				"fact.AmtAcctCr," +
				"fact.Record_ID," +
				"inv.C_BPartner_ID," +
				"inv.DateAcct," +
				"inv.Serial," +
				"inv.DocumentNo " +
	          "FROM " +
	          	"Fact_Acct fact " +
	          	"RIGHT JOIN C_ElementValue ev ON (ev.C_ElementValue_ID=fact.Account_ID) " +
	          	"RIGHT JOIN C_Invoice inv ON (inv.C_Invoice_ID=fact.Record_ID) " +
	          "WHERE " +
	          	"fact.AD_Client_ID=? " +
	          	"AND fact.AD_Table_ID=318 " +
	          	"AND ev.Value>=? " +
	          	"AND ev.Value<? " +
	          	"AND fact.DateAcct>=? " +
	          	"AND fact.DateAcct<=? " +
	 			"AND fact.PostingType=? " +
	 			"AND fact.C_AcctSchema_ID=? ";
		if (m_AD_Org_ID != 0)
				sql = sql + "AND fact.AD_Org_ID=? ";
		sql = sql + "ORDER BY " +
					"fact.DateAcct";
		pstmt = DB.prepareStatement(sql, get_TrxName());
		pstmt.setInt(1, m_AD_Client_ID);
		pstmt.setString(2, m_AccountValue_From);
		pstmt.setString(3, m_AccountValue_To);
		pstmt.setTimestamp(4, m_DateAcct_From);
		pstmt.setTimestamp(5, m_DateAcct_To);
		pstmt.setString(6, m_PostingType);
		pstmt.setInt(7, m_C_AcctSchema_ID);
		if (m_AD_Org_ID != 0) pstmt.setInt(8, m_AD_Org_ID);
		
		rs = pstmt.executeQuery();
		
		while (rs.next()) {
			String AccountValue = rs.getString(1);
			BigDecimal AmtAcctDr = rs.getBigDecimal(2);
			BigDecimal AmtAcctCr = rs.getBigDecimal(3);
			int Record_ID = rs.getInt(4);
			int C_BPartner_ID = rs.getInt(5);
			Timestamp DateAcct = rs.getTimestamp(6);
			String Serial = rs.getString(7);
			String DocumentNo = rs.getString(8);

			/* Asignaciones de la factura */
			sql = "SELECT " +
					"sum(coalesce(fact.AmtAcctDr, 0))," +
					"sum(coalesce(fact.AmtAcctCr, 0)) " +
                  "FROM " +
                  	"Fact_Acct fact " +
                  	"RIGHT JOIN C_ElementValue ev ON (ev.C_ElementValue_ID=fact.Account_ID) " +
                  	"RIGHT JOIN C_AllocationHdr ah ON (ah.C_AllocationHdr_ID=fact.Record_ID) " +
                  	"RIGHT JOIN C_AllocationLine al ON (al.C_AllocationHdr_ID=fact.Record_ID AND al.C_AllocationLine_ID=fact.Line_ID) " +
                  "WHERE " +
                  	"fact.AD_Table_ID=735 " +
                  	"AND fact.AD_Client_ID=? " +
                  	"AND fact.DateAcct>=? " +
                  	"AND fact.DateAcct<=? " +
                  	"AND ev.Value>=? " +
                  	"AND ev.Value<=? " +
                  	"AND al.C_Invoice_ID=? " +
                  	"AND fact.C_AcctSchema_ID=? " +
                  	"AND fact.PostingType=? ";
			if (m_AD_Org_ID != 0)
				sql = sql + "AND fact.AD_Org_ID=? ";
			pstmt = DB.prepareStatement(sql, get_TrxName());
			pstmt.setInt(1, m_AD_Client_ID);
			pstmt.setTimestamp(2, m_DateAcct_From);
			pstmt.setTimestamp(3, m_DateAcct_To);
			pstmt.setString(4, m_AccountValue_From);
			pstmt.setString(5, m_AccountValue_To);
			pstmt.setInt(6, Record_ID);
			pstmt.setInt(7, m_C_AcctSchema_ID);
			pstmt.setString(8, m_PostingType);
			if (m_AD_Org_ID != 0) pstmt.setInt(9, m_AD_Org_ID);
			ResultSet rs2 = pstmt.executeQuery();
			
			BigDecimal AmtPaidDr = BigDecimal.ZERO;
			BigDecimal AmtPaidCr = BigDecimal.ZERO;
			BigDecimal OpenAmt = BigDecimal.ZERO;
	
			if (rs2.next()) {
				AmtPaidCr = rs2.getBigDecimal(2) == null ? BigDecimal.ZERO : rs2.getBigDecimal(2);
				AmtPaidDr = rs2.getBigDecimal(1) == null ? BigDecimal.ZERO : rs2.getBigDecimal(1);
			}

			if (m_IsSummary) {
				AmtAcctDr = AmtAcctDr.add(AmtPaidDr);
				AmtAcctCr = AmtAcctCr.add(AmtPaidCr);
				OpenAmt = AmtAcctDr.subtract(AmtAcctCr);
			}
			else {
				BigDecimal total = AmtAcctDr.subtract(AmtAcctCr);
				BigDecimal AmtPaid = AmtPaidDr.subtract(AmtPaidCr);
				OpenAmt = total.subtract(AmtPaid.abs());				
			}

			/* Insercion de factura */
			sql = "INSERT INTO " +
					"T_OpenInvoices (" +
						"AD_PInstance_ID," +
						"AD_Client_ID," +
						"AD_Org_ID," +
						"IsActive," +
						"Created," +
						"CreatedBy," +
						"Updated," +
						"UpdatedBy," +
						"DateAcct," +
						"C_AcctSchema_ID," +
						"AccountValue," +
						"PostingType," +
						"IsSummary," +
						"Description," +
						"AmtAcctDr," +
						"AmtAcctCr," +
						"OpenAmtSource," +
						"Record_ID," +
						"AD_Table_ID," +
						"C_BPartner_ID," +
						"OpenAmt" +
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
			        	"invoiceOpen(?, 0)," +
			        	"?," +
			        	"318," +
			        	"?," +
			        	"?" +
			        ")";

			CPreparedStatement stmt = DB.prepareStatement(sql, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE, get_TrxName());
			stmt.setInt(1, getAD_PInstance_ID());
			stmt.setInt(2, m_AD_Client_ID);
			stmt.setInt(3, m_AD_Org_ID);
			stmt.setInt(4, Env.getAD_User_ID(getCtx()));
			stmt.setInt(5, Env.getAD_User_ID(getCtx()));
			stmt.setTimestamp(6, DateAcct);
			stmt.setInt(7, m_C_AcctSchema_ID);
			stmt.setString(8, AccountValue);
			stmt.setString(9, m_PostingType);
			stmt.setString(10, m_IsSummary?"Y":"N");
			stmt.setString(11, "Factura: " + Serial + "-" + DocumentNo);
			stmt.setBigDecimal(12, AmtAcctDr);
			stmt.setBigDecimal(13, AmtAcctCr);
			stmt.setInt(14, Record_ID);
			stmt.setInt(15, Record_ID);
			stmt.setInt(16, C_BPartner_ID);
			stmt.setBigDecimal(17, OpenAmt);
			if (stmt.executeUpdate() == -1) return "@Error@";

			if (!m_IsSummary) {
				/* Pagos de factura en detalle */
				sql = "SELECT " +
						"ev.Value," +
						"fact.DateAcct," +
						"fact.AmtAcctDr," +
						"fact.AmtAcctCr," +
						"ah.DocumentNo," +
						"al.amount," +
						"fact.Record_ID," +
						"al.c_payment_id," +
						"al.c_cashline_id " +
				      "FROM " +
				      	"Fact_Acct fact " +
				      	"RIGHT JOIN C_ElementValue ev ON (ev.C_ElementValue_ID=fact.Account_ID) " +
				      	"RIGHT JOIN C_AllocationHdr ah ON (ah.C_AllocationHdr_ID=fact.Record_ID) " +
				      	"RIGHT JOIN C_AllocationLine al ON (al.C_AllocationHdr_ID=fact.Record_ID AND al.C_AllocationLine_ID=fact.Line_ID) " +
				      "WHERE " +
				      	"fact.AD_Table_ID=735 " +
				      	"AND fact.AD_Client_ID=? " +
				      	"AND fact.DateAcct>=? " +
				      	"AND fact.DateAcct<=? " +
				      	"AND ev.Value>=? " +
				      	"AND ev.Value<=? " +
				      	"AND al.C_Invoice_ID=? " +
				      	"AND fact.C_AcctSchema_ID=? " +
				      	"AND fact.PostingType=? ";
				if (m_AD_Org_ID != 0)
					sql = sql + "AND fact.AD_Org_ID=? ";
				pstmt = DB.prepareStatement(sql, get_TrxName());
				pstmt.setInt(1, m_AD_Client_ID);
				pstmt.setTimestamp(2, m_DateAcct_From);
				pstmt.setTimestamp(3, m_DateAcct_To);
				pstmt.setString(4, m_AccountValue_From);
				pstmt.setString(5, m_AccountValue_To);
				pstmt.setInt(6, Record_ID);
				pstmt.setInt(7, m_C_AcctSchema_ID);
				pstmt.setString(8, m_PostingType);
				if (m_AD_Org_ID != 0) pstmt.setInt(9, m_AD_Org_ID);
				
				rs2 = pstmt.executeQuery();
				
				while (rs2.next()) {
					AccountValue = rs2.getString(1);
					DateAcct = rs2.getTimestamp(2);
					AmtAcctDr = rs2.getBigDecimal(3);
					AmtAcctCr = rs2.getBigDecimal(4);
					DocumentNo = rs2.getString(5);
					BigDecimal OpenAmtSource = rs2.getBigDecimal(6);
					Record_ID = rs2.getInt(7);
					int C_Payment_ID = rs2.getInt(8);
					int C_CashLine_ID = rs2.getInt(9);
					
					/* Insercion de detalle de pagos */
					sql = "INSERT INTO " +
							"T_OpenInvoices (" +
								"AD_PInstance_ID," +
								"AD_Client_ID," +
								"AD_Org_ID," +
								"IsActive," +
								"Created," +
								"CreatedBy," +
								"Updated," +
								"UpdatedBy," +
								"DateAcct," +
								"C_AcctSchema_ID," +
								"AccountValue," +
								"PostingType," +
								"IsSummary," +
								"Description," +
								"AmtAcctDr," +
								"AmtAcctCr," +
								"OpenAmtSource," +
								"Record_ID," +
								"AD_Table_ID," +
								"C_BPartner_ID" +
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
					        	"?," +
					        	"735," +
					        	"?" +
					        ")";
					
					stmt = DB.prepareStatement(sql, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE, get_TrxName());
					stmt.setInt(1, getAD_PInstance_ID());
					stmt.setInt(2, m_AD_Client_ID);
					stmt.setInt(3, m_AD_Org_ID);
					stmt.setInt(4, Env.getAD_User_ID(getCtx()));
					stmt.setInt(5, Env.getAD_User_ID(getCtx()));
					stmt.setTimestamp(6, DateAcct);
					stmt.setInt(7, m_C_AcctSchema_ID);
					stmt.setString(8, AccountValue);
					stmt.setString(9, m_PostingType);
					stmt.setString(10, m_IsSummary?"Y":"N");
					stmt.setString(11, "Asignacion: " + DocumentNo);
					stmt.setBigDecimal(12, AmtAcctDr);
					stmt.setBigDecimal(13, AmtAcctCr);
					stmt.setBigDecimal(14, OpenAmtSource);
					stmt.setInt(15, Record_ID);
					stmt.setInt(16, C_BPartner_ID);
					if (stmt.executeUpdate() == -1) return "@Error@";
				}
			}
			
			
		}

		sql = "SELECT " +
				"max(ev.Value)," +
				"sum(fact.AmtAcctDr)," +
				"sum(fact.AmtAcctCr)," +
				"max(fact.DateAcct)," +
				"fact.AD_Table_ID," +
				"fact.Record_ID," +
				"max(inv.C_BPartner_ID) " +
			  "FROM " +
			  	"Fact_Acct fact " +
			  	"RIGHT JOIN C_ElementValue ev ON (ev.C_ElementValue_ID=fact.Account_ID) " +
			  	"LEFT JOIN C_AllocationHdr ah ON (ah.C_AllocationHdr_ID=fact.Record_ID AND fact.AD_Table_ID=735) " +
			  	"LEFT JOIN C_AllocationLine al ON (al.C_AllocationHdr_ID=ah.C_AllocationHdr_ID AND al.C_AllocationLine_ID=fact.Line_ID) " +
			  	"LEFT JOIN C_Invoice inv ON (inv.C_Invoice_ID=al.C_Invoice_ID) " +
			  "WHERE " +
			  	"(fact.AD_Table_ID!=318 AND (fact.Record_ID NOT IN (SELECT t.Record_ID FROM T_OpenInvoices t WHERE t.AD_PInstance_ID=? AND t.AD_Table_ID=fact.AD_Table_ID) AND fact.AD_Table_ID=735) AND al.C_Invoice_ID NOT IN (SELECT t2.Record_ID FROM T_OpenInvoices t2 WHERE t2.AD_PInstance_ID=? AND t2.AD_Table_ID=318))" +
              	"AND fact.AD_Client_ID=? " +
              	"AND fact.DateAcct>=? " +
              	"AND fact.DateAcct<=? " +
              	"AND ev.Value>=? " +
              	"AND ev.Value<=? " +
              	"AND fact.C_AcctSchema_ID=? " +
              	"AND fact.PostingType=? ";
		if (m_AD_Org_ID != 0)
			sql = sql + "AND fact.AD_Org_ID=? ";
		sql = sql +
			  "GROUP BY " +
			  	"fact.AD_Table_ID," +
			  	"fact.Record_ID," +
			  	"fact.Account_ID";
		pstmt = DB.prepareStatement(sql, get_TrxName());
		pstmt.setInt(1, getAD_PInstance_ID());
		pstmt.setInt(2, getAD_PInstance_ID());
		pstmt.setInt(3, m_AD_Client_ID);
		pstmt.setTimestamp(4, m_DateAcct_From);
		pstmt.setTimestamp(5, m_DateAcct_To);
		pstmt.setString(6, m_AccountValue_From);
		pstmt.setString(7, m_AccountValue_To);
		pstmt.setInt(8, m_C_AcctSchema_ID);
		pstmt.setString(9, m_PostingType);
		if (m_AD_Org_ID != 0) pstmt.setInt(10, m_AD_Org_ID);

		rs = pstmt.executeQuery();
		
		while (rs.next()) {
			String AccountValue = rs.getString(1);
			BigDecimal AmtAcctDr = rs.getBigDecimal(2);
			BigDecimal AmtAcctCr = rs.getBigDecimal(3);
			Timestamp DateAcct = rs.getTimestamp(4);
			int AD_Table_ID = rs.getInt(5);
			int Record_ID = rs.getInt(6);
			int C_BPartner_ID = rs.getInt(7);
			BigDecimal OpenAmt = AmtAcctDr.subtract(AmtAcctCr);

			/* Insercion de otros documentos */
			sql = "INSERT INTO " +
					"T_OpenInvoices (" +
						"AD_PInstance_ID," +
						"AD_Client_ID," +
						"AD_Org_ID," +
						"IsActive," +
						"Created," +
						"CreatedBy," +
						"Updated," +
						"UpdatedBy," +
						"DateAcct," +
						"C_AcctSchema_ID," +
						"AccountValue," +
						"PostingType," +
						"IsSummary," +
						"Description," +
						"AmtAcctDr," +
						"AmtAcctCr," +
						"Record_ID," +
						"AD_Table_ID," +
						"OpenAmt," +
						"C_BPartner_ID " +
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
			        	"null," +
			        	"?," +
			        	"?," +
			        	"?," +
			        	"?," +
			        	"?," +
			        	"?" +
			        ")";

			CPreparedStatement stmt = DB.prepareStatement(sql, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE, get_TrxName());
			stmt.setInt(1, getAD_PInstance_ID());
			stmt.setInt(2, m_AD_Client_ID);
			stmt.setInt(3, m_AD_Org_ID);
			stmt.setInt(4, Env.getAD_User_ID(getCtx()));
			stmt.setInt(5, Env.getAD_User_ID(getCtx()));
			stmt.setTimestamp(6, DateAcct);
			stmt.setInt(7, m_C_AcctSchema_ID);
			stmt.setString(8, AccountValue);
			stmt.setString(9, m_PostingType);
			stmt.setString(10, m_IsSummary?"Y":"N");
			stmt.setBigDecimal(11, AmtAcctDr);
			stmt.setBigDecimal(12, AmtAcctCr);
			stmt.setInt(13, Record_ID);
			stmt.setInt(14, AD_Table_ID);
			stmt.setBigDecimal(15, OpenAmt);
			stmt.setInt(16, C_BPartner_ID);
			if (stmt.executeUpdate() == -1) return "@Error@";
		}
		return null;
	}


}
