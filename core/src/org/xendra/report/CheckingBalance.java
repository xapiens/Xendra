package org.xendra.report;

import java.util.logging.Level;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.math.BigDecimal;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;

public class CheckingBalance extends SvrProcess {
	private int m_AD_PInstance_ID = 0;
	private int m_AD_Client_ID = 0;
	private int m_AD_Org_ID = 0;
	private int m_C_AcctSchema_ID = 0;
	private Timestamp m_DateAcct_From = null;
	private Timestamp m_DateAcct_To = null;
	private String m_PostingType;

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
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
		
		m_AD_PInstance_ID = getAD_PInstance_ID();
	}
	
	protected String doIt() throws Exception {
		BigDecimal DiferenciaBalance, DiferenciaGanPer;

		String sql = "INSERT INTO " +
						"T_HOJADETRABAJOFUNC" +
						"(" +
						"ad_pinstance_id," +
						"ad_client_id," +
						"ad_org_id," +
						"isactive," +
						"created," +
						"createdby," +
						"updated," +
						"updatedby," +
						"c_acctschema_id," +
						"postingtype," +
						"dateacct," +
						"account," +
						"AmtAcctDr," +
						"AmtAcctCr," +
						"saldodeudor," +
						"saldoacreedor," +
						"balanceactivo," +
						"balancepasivo," +
						"resultadoperdida," +
						"resultadoganancia" +
					  ") " +
					  "SELECT " +
					  	m_AD_PInstance_ID + "," +
					  	m_AD_Client_ID + "," +
					  	m_AD_Org_ID + "," +
					  	"'Y'," +
					  	"CURRENT_TIMESTAMP," +
					  	this.getAD_User_ID() + "," +
					  	"CURRENT_TIMESTAMP," +
					  	this.getAD_User_ID() + "," +
					  	m_C_AcctSchema_ID + "," +
					  	"'" + m_PostingType + "'," +
						"to_date('" + m_DateAcct_From + "', 'YYYY-MM-DD')," +
					  	"substr(EV.VALUE,0,2) as account," +
					  	"SUM(FA.AMTACCTDR) as AmtAcctDr," +
					  	"SUM(FA.AMTACCTCR) as AmtAcctCr," +
						"case when SUM(FA.AMTACCTDR-FA.AMTACCTCR)>=0 then SUM(FA.AMTACCTDR-FA.AMTACCTCR) else null end as saldodeudor," +
						"case when SUM(FA.AMTACCTDR-FA.AMTACCTCR)<0 then SUM(FA.AMTACCTDR-FA.AMTACCTCR)*-1 else null end as saldoacreedor," +
						"case when substr(EV.VALUE,0,2)>='10' and substr(EV.VALUE,0,2)<'60' and " + 
							"SUM(FA.AMTACCTDR-FA.AMTACCTCR)>=0 then SUM(FA.AMTACCTDR-FA.AMTACCTCR) else null end as balanceactivo," +
						"case when substr(EV.VALUE,0,2)>='10' and substr(EV.VALUE,0,2)<'60' and " + 
							"SUM(FA.AMTACCTDR-FA.AMTACCTCR)<0 then SUM(FA.AMTACCTDR-FA.AMTACCTCR)*-1 else null end as balancepasivo," +
						"case when substr(EV.VALUE,0,2)>='60' and substr(EV.VALUE,0,2)<'80' and " + 
							"SUM(FA.AMTACCTDR-FA.AMTACCTCR)>=0 then SUM(FA.AMTACCTDR-FA.AMTACCTCR) else null end as resultadoperdida," +
						"case when substr(EV.VALUE,0,2)>='60' and substr(EV.VALUE,0,2)<'80' and " + 
							"SUM(FA.AMTACCTDR-FA.AMTACCTCR)<0 then SUM(FA.AMTACCTDR-FA.AMTACCTCR)*-1 else null end as resultadoganancia " +
                      "FROM " +
                      	"FACT_ACCT FA " +
                      	"INNER JOIN C_ELEMENTVALUE EV ON (EV.C_ELEMENTVALUE_ID=FA.ACCOUNT_ID) " +
                      "WHERE " +
                      	"FA.C_AcctSchema_ID=" + m_C_AcctSchema_ID + " " + 
                      	"AND FA.AD_Org_ID=" + m_AD_Org_ID + " " +
                      	"AND FA.PostingType='" + m_PostingType + "' " +
                      	"AND FA.DateAcct >=to_date('" + m_DateAcct_From + "', 'YYYY-MM-DD')" +
                      	"AND FA.DateAcct <=to_date('" + m_DateAcct_To + "', 'YYYY-MM-DD') " +
                      "GROUP BY " +
                      	"substr(EV.VALUE,0,2) " +
                      "ORDER BY " +
                      	"account"; 

		DB.executeUpdate(sql, this.get_TrxName());
		
		sql = "SELECT " +
				"SUM(BalanceActivo)-SUM(BalancePasivo) AS DiferenciaBalance, " +
				"SUM(ResultadoGanancia)-SUM(ResultadoPerdida) AS DiferenciaGanPer " +
			  "FROM " +
			  	"T_HOJADETRABAJOFUNC " +
			  "WHERE " +
			  	"AD_PInstance_ID=?";

		PreparedStatement pstmt = DB.prepareStatement(sql, get_TrxName());

		pstmt.setInt(1, this.getAD_PInstance_ID());

		ResultSet rs = pstmt.executeQuery();

		if (rs.next()) {
			DiferenciaBalance = rs.getBigDecimal(1);
			if (DiferenciaBalance == null) DiferenciaBalance = Env.ZERO;
			DiferenciaGanPer = rs.getBigDecimal(2);
			if (DiferenciaGanPer == null) DiferenciaGanPer = Env.ZERO;
		}
		else {
			return "@Error@";
		}
		rs.close();
		
		sql = "INSERT INTO " +
						"T_HOJADETRABAJOFUNC(" +
							"ad_pinstance_id," +
							"ad_client_id," +
							"ad_org_id," +
							"isactive," +
							"created," +
							"createdby," +
							"updated," +
							"updatedby," +
							"c_acctschema_id," +
							"postingtype," +
							"dateacct," +
							"account," +
							"AmtAcctDr," +
							"AmtAcctCr," +
							"saldodeudor," +
							"saldoacreedor," +
							"balanceactivo," +
							"balancepasivo," +
							"resultadoganancia," +
							"resultadoperdida" +
						")" +
						"SELECT " +
							m_AD_PInstance_ID+"," +
							m_AD_Client_ID + "," +
							m_AD_Org_ID + "," +
							"'Y'," +
							"CURRENT_TIMESTAMP," +
							this.getAD_User_ID() + "," +
							"CURRENT_TIMESTAMP," +
							this.getAD_User_ID() + "," +
							m_C_AcctSchema_ID + "," +
							"'" + m_PostingType + "'," +
							"to_date('" + m_DateAcct_From + "', 'YYYY-MM-DD')," +
							"'NNN0'," +
							"sum(AmtAcctDr)," +
							"sum(AmtAcctDr)," +
							"sum(saldodeudor)," +
							"sum(saldoacreedor)," +
							"sum(balanceactivo)," +
							"sum(balancepasivo)," +
							"sum(resultadoganancia)," +
							"sum(resultadoperdida) " +
						"from " +
							"T_HOJADETRABAJOFUNC " +
						"WHERE " +
							"AD_PInstance_ID=" + this.getAD_PInstance_ID() + " " +
						"UNION " +
							"select " +
								m_AD_PInstance_ID + "," +
								m_AD_Client_ID + "," +
								m_AD_Org_ID + "," +
								"'Y'," +
								"CURRENT_TIMESTAMP," +
								this.getAD_User_ID() + "," +
								"CURRENT_TIMESTAMP," +
								this.getAD_User_ID() + "," +
								m_C_AcctSchema_ID + "," +
								"'" + m_PostingType + "'," +
								"to_date('" + m_DateAcct_From + "', 'YYYY-MM-DD')," +
								"'NNN1'," +
								"null," +
								"null," +
								"null," +
								"null," +
				   				"case when " + DiferenciaBalance.toString() + "<0 then " + DiferenciaBalance.toString() + "*-1 else null end," +
				   				"case when " + DiferenciaBalance.toString() + ">=0 then " + DiferenciaBalance.toString() + " else null end," +
				   				"case when " + DiferenciaGanPer.toString() + "<0 then " + DiferenciaGanPer.toString() + "*-1 else null end," +
				   				"case when " + DiferenciaGanPer.toString() + ">=0 then " + DiferenciaGanPer.toString() + " else null end " +
//				             "from " +
//				             	"DUAL " +
				         "UNION " + 
				         	 "select " +
				         	 	m_AD_PInstance_ID + "," +
				         	 	m_AD_Client_ID + "," +
				         	 	m_AD_Org_ID + "," +
				         	 	"'Y'," +
				         	 	"CURRENT_TIMESTAMP," +
				         	 	this.getAD_User_ID() + "," +
				         	 	"CURRENT_TIMESTAMP," +
				         	 	this.getAD_User_ID() + "," +
				         	 	m_C_AcctSchema_ID + "," +
				         	 	"'" + m_PostingType + "'," +
								"to_date('" + m_DateAcct_From + "', 'YYYY-MM-DD')," +
				         	 	"'NNN2'," +
				         	 	"null," +
				         	 	"null," +
				         	 	"null," +
				         	 	"null," +
				   				"case when " + DiferenciaBalance.toString() + "<0 then (" + DiferenciaBalance.toString() + "*-1)+sum(balanceactivo) else sum(balanceactivo) end," +
				   				"case when " + DiferenciaBalance.toString() + ">=0 then " + DiferenciaBalance.toString() + "+sum(balancepasivo) else sum(balancepasivo) end," +
				   				"case when " + DiferenciaGanPer.toString() + "<0 then (" + DiferenciaGanPer.toString() + "*-1)+sum(resultadoganancia) else sum(resultadoganancia) end," +
				   				"case when " + DiferenciaGanPer.toString() + ">=0 then " + DiferenciaGanPer.toString() + "+sum(resultadoperdida) else sum(resultadoperdida) end " +
				            "from " +
				            	"T_HOJADETRABAJOFUNC " +
							"WHERE " +
								"AD_PInstance_ID=" + this.getAD_PInstance_ID() + " ";
		DB.executeUpdate(sql, this.get_TrxName());

		sql = "INSERT INTO " +
				"T_HOJADETRABAJOFUNC(" +
					"ad_pinstance_id," +
					"ad_client_id," +
					"ad_org_id," +
					"isactive," +
					"created," +
					"createdby," +
					"updated," +
					"updatedby," +
					"c_acctschema_id," +
					"postingtype," +
					"dateacct," +
					"account," +
					"AmtAcctDr," +
					"AmtAcctCr," +
					"saldodeudor," +
					"saldoacreedor," +
					"balanceactivo," +
					"balancepasivo," +
					"resultadoperdida," +
					"resultadoganancia" +
				")" +
				"SELECT " +
					m_AD_PInstance_ID + "," +
					m_AD_Client_ID + "," +
					m_AD_Org_ID + "," +
					"'Y'," +
					"CURRENT_TIMESTAMP," +
					this.getAD_User_ID() + "," +
					"CURRENT_TIMESTAMP," +
					this.getAD_User_ID() + "," +
					m_C_AcctSchema_ID + "," +
					"'" + m_PostingType + "'," +
					"to_date('" + m_DateAcct_From + "', 'YYYY-MM-DD')," +
					"substr(EV.VALUE,0,3) as account," +
					"SUM(FA.AMTACCTDR) as AmtAcctDr," +
					"SUM(FA.AMTACCTCR) as AmtAcctCr," +
					"case when SUM(FA.AMTACCTDR-FA.AMTACCTCR)>=0 then SUM(FA.AMTACCTDR-FA.AMTACCTCR) else null end as saldodeudor," +
					"case when SUM(FA.AMTACCTDR-FA.AMTACCTCR)<0 then SUM(FA.AMTACCTDR-FA.AMTACCTCR)*-1 else null end as saldoacreedor," +
					"case when substr(EV.VALUE,0,3)>='10' and substr(EV.VALUE,0,3)<'60' and " + 
						"SUM(FA.AMTACCTDR-FA.AMTACCTCR)>=0 then SUM(FA.AMTACCTDR-FA.AMTACCTCR) else null end as balanceactivo," +
					"case when substr(EV.VALUE,0,3)>='10' and substr(EV.VALUE,0,3)<'60' and " + 
						"SUM(FA.AMTACCTDR-FA.AMTACCTCR)<0 then SUM(FA.AMTACCTDR-FA.AMTACCTCR)*-1 else null end as balancepasivo," +
					"case when substr(EV.VALUE,0,3)>='60' and substr(EV.VALUE,0,3)<'80' and " + 
						"SUM(FA.AMTACCTDR-FA.AMTACCTCR)>=0 then SUM(FA.AMTACCTDR-FA.AMTACCTCR) else null end as resultadoperdida," +
					"case when substr(EV.VALUE,0,3)>='60' and substr(EV.VALUE,0,3)<'80' and " + 
						"SUM(FA.AMTACCTDR-FA.AMTACCTCR)<0 then SUM(FA.AMTACCTDR-FA.AMTACCTCR)*-1 else null end as resultadoganancia " +
                "FROM " +
                	"FACT_ACCT FA " +
                	"INNER JOIN C_ELEMENTVALUE EV ON (EV.C_ELEMENTVALUE_ID=FA.ACCOUNT_ID) " +
                "WHERE " +
                	"FA.C_AcctSchema_ID=" + m_C_AcctSchema_ID + " " + 
                	"AND FA.AD_Org_ID=" + m_AD_Org_ID + " " +
                	"AND FA.PostingType='" + m_PostingType + "' " +
                  	"AND FA.DateAcct >=to_date('" + m_DateAcct_From + "', 'YYYY-MM-DD')" +
                  	"AND FA.DateAcct <=to_date('" + m_DateAcct_To + "', 'YYYY-MM-DD') " +
                "GROUP BY " +
                	"substr(EV.VALUE,0,3) " +
                "ORDER BY " +
                	"account";
		DB.executeUpdate(sql, this.get_TrxName());

		sql = "INSERT INTO " +
				"T_HOJADETRABAJOFUNC" +
				"(" +
					"ad_pinstance_id," +
					"ad_client_id," +
					"ad_org_id," +
					"isactive," +
					"created," +
					"createdby," +
					"updated," +
					"updatedby," +
					"c_acctschema_id," +
					"postingtype," +
					"dateacct," +
					"account," +
					"AmtAcctDr," +
					"AmtAcctCr," +
					"saldodeudor," +
					"saldoacreedor," +
					"balanceactivo," +
					"balancepasivo," +
					"resultadoperdida," +
					"resultadoganancia" +
				") " +  
				"SELECT " +
					m_AD_PInstance_ID + "," +
					m_AD_Client_ID + "," +
					m_AD_Org_ID + "," +
					"'Y'," +
					"CURRENT_TIMESTAMP," +
					this.getAD_User_ID() + "," +
					"CURRENT_TIMESTAMP," +
					this.getAD_User_ID() + "," +
					m_C_AcctSchema_ID + "," +
					"'" + m_PostingType + "'," +
					"to_date('" + m_DateAcct_From + "', 'YYYY-MM-DD')," +
					"substr(EV.VALUE,0,4) as account," +
					"SUM(FA.AMTACCTDR) as AmtAcctDr," +
					"SUM(FA.AMTACCTCR) as AmtAcctCr," +
					"case when SUM(FA.AMTACCTDR-FA.AMTACCTCR)>=0 then SUM(FA.AMTACCTDR-FA.AMTACCTCR) else null end as saldodeudor," +
					"case when SUM(FA.AMTACCTDR-FA.AMTACCTCR)<0 then SUM(FA.AMTACCTDR-FA.AMTACCTCR)*-1 else null end as saldoacreedor," +
					"case when substr(EV.VALUE,0,4)>='10' and substr(EV.VALUE,0,4)<'60' and " + 
						"SUM(FA.AMTACCTDR-FA.AMTACCTCR)>=0 then SUM(FA.AMTACCTDR-FA.AMTACCTCR) else null end as balanceactivo," +
					"case when substr(EV.VALUE,0,4)>='10' and substr(EV.VALUE,0,4)<'60' and " + 
						"SUM(FA.AMTACCTDR-FA.AMTACCTCR)<0 then SUM(FA.AMTACCTDR-FA.AMTACCTCR)*-1 else null end as balancepasivo," +
					"case when substr(EV.VALUE,0,4)>='60' and substr(EV.VALUE,0,4)<'80' and " + 
						"SUM(FA.AMTACCTDR-FA.AMTACCTCR)>=0 then SUM(FA.AMTACCTDR-FA.AMTACCTCR) else null end as resultadoperdida," +
					"case when substr(EV.VALUE,0,4)>='60' and substr(EV.VALUE,0,4)<'80' and " + 
						"SUM(FA.AMTACCTDR-FA.AMTACCTCR)<0 then SUM(FA.AMTACCTDR-FA.AMTACCTCR)*-1 else null end as resultadoganancia " +
                "FROM " +
                	"FACT_ACCT FA " +
                	"INNER JOIN C_ELEMENTVALUE EV ON (EV.C_ELEMENTVALUE_ID=FA.ACCOUNT_ID) " +
                "WHERE " +
                	"FA.C_AcctSchema_ID=" + m_C_AcctSchema_ID + " " + 
                	"AND FA.AD_Org_ID=" + m_AD_Org_ID + " " +
                	"AND FA.PostingType='" + m_PostingType + "' " +
                  	"AND FA.DateAcct >=to_date('" + m_DateAcct_From + "', 'YYYY-MM-DD')" +
                  	"AND FA.DateAcct <=to_date('" + m_DateAcct_To + "', 'YYYY-MM-DD') " +
                "GROUP BY " +
                	"substr(EV.VALUE,0,4) " +
                "ORDER BY " +
                	"account";
		DB.executeUpdate(sql, this.get_TrxName());

		sql = "INSERT INTO " +
				"T_HOJADETRABAJOFUNC" +
				"(" +
					"ad_pinstance_id," +
					"ad_client_id," +
					"ad_org_id," +
					"isactive," +
					"created," +
					"createdby," +
					"updated," +
					"updatedby," +
					"c_acctschema_id," +
					"postingtype," +
					"dateacct," +
					"account," +
					"AmtAcctDr," +
					"AmtAcctCr," +
					"saldodeudor," +
					"saldoacreedor," +
					"balanceactivo," +
					"balancepasivo," +
					"resultadoperdida," +
					"resultadoganancia" +
				")" +  
				"SELECT " +
					m_AD_PInstance_ID + "," +
					m_AD_Client_ID + "," +
					m_AD_Org_ID + "," +
					"'Y'," +
					"CURRENT_TIMESTAMP," +
					this.getAD_User_ID() + "," +
					"CURRENT_TIMESTAMP," +
					this.getAD_User_ID() + "," +
					m_C_AcctSchema_ID + "," +
					"'" + m_PostingType + "'," +
					"to_date('" + m_DateAcct_From + "', 'YYYY-MM-DD')," +
					"substr(EV.VALUE,0,5) as account," +
					"SUM(FA.AMTACCTDR) as AmtAcctDr," +
					"SUM(FA.AMTACCTCR) as AmtAcctCr," +
					"case when SUM(FA.AMTACCTDR-FA.AMTACCTCR)>=0 then SUM(FA.AMTACCTDR-FA.AMTACCTCR) else null end as saldodeudor," +
					"case when SUM(FA.AMTACCTDR-FA.AMTACCTCR)<0 then SUM(FA.AMTACCTDR-FA.AMTACCTCR)*-1 else null end as saldoacreedor," +
					"case when substr(EV.VALUE,0,5)>='10' and substr(EV.VALUE,0,5)<'60' and " + 
						"SUM(FA.AMTACCTDR-FA.AMTACCTCR)>=0 then SUM(FA.AMTACCTDR-FA.AMTACCTCR) else null end as balanceactivo," +
					"case when substr(EV.VALUE,0,5)>='10' and substr(EV.VALUE,0,5)<'60' and " + 
						"SUM(FA.AMTACCTDR-FA.AMTACCTCR)<0 then SUM(FA.AMTACCTDR-FA.AMTACCTCR)*-1 else null end as balancepasivo," +
					"case when substr(EV.VALUE,0,5)>='60' and substr(EV.VALUE,0,5)<'80' and " + 
						"SUM(FA.AMTACCTDR-FA.AMTACCTCR)>=0 then SUM(FA.AMTACCTDR-FA.AMTACCTCR) else null end as resultadoperdida," +
					"case when substr(EV.VALUE,0,5)>='60' and substr(EV.VALUE,0,5)<'80' and " + 
						"SUM(FA.AMTACCTDR-FA.AMTACCTCR)<0 then SUM(FA.AMTACCTDR-FA.AMTACCTCR)*-1 else null end as resultadoganancia " +
                "FROM " +
                	"FACT_ACCT FA " +
                	"INNER JOIN C_ELEMENTVALUE EV ON (EV.C_ELEMENTVALUE_ID=FA.ACCOUNT_ID) " +
                "WHERE " +
                	"FA.C_AcctSchema_ID=" + m_C_AcctSchema_ID + " " + 
                	"AND FA.AD_Org_ID=" + m_AD_Org_ID + " " +
                	"AND FA.PostingType='" + m_PostingType + "' " +
                  	"AND FA.DateAcct >=to_date('" + m_DateAcct_From + "', 'YYYY-MM-DD')" +
                  	"AND FA.DateAcct <=to_date('" + m_DateAcct_To + "', 'YYYY-MM-DD') " +
                "GROUP BY " +
                	"substr(EV.VALUE,0,5) " +
                "ORDER BY " +
                	"account";
		DB.executeUpdate(sql, this.get_TrxName());


		return null;
	}
}
