package org.xendra.report;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.logging.Level;

import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.*;

public class CheckingBalance5 extends SvrProcess {
	private int m_AD_Client_ID = 0;
	private int m_AD_Org_ID = 0;
	private int m_C_AcctSchema_ID = 0;
	private Timestamp m_DateAcct_From = null;
	private Timestamp m_DateAcct_To = null;
	private String m_AccountValue_From = null;
	private String m_AccountValue_To = null;
	private String m_PostingType;
	private int m_Level = 0;
	private String m_IsOnlyMovementAccount = null;

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
			else if (name.equals("Account_Level"))
				m_Level = para[i].getParameterAsInt();
			else if (name.equals("AccountValue")) {
				m_AccountValue_From = (String)para[i].getParameter();
				m_AccountValue_To = (String)para[i].getParameter_To();
			}
			else if (name.equals("IsOnlyMovementAccount")) {
				m_IsOnlyMovementAccount = (String)para[i].getParameter();
			}
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}
	
	protected String doIt() throws Exception {
		BigDecimal DiferenciaBalance, DiferenciaNaturaleza, DiferenciaFuncion;
		
		String sql = "INSERT INTO " +
						"T_HOJADETRABAJOFUNCTO5" +
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
							"account_level," +
							"isonlymovementaccount," +
							"accountvalue," +
							"AmtAcctDr," +
							"AmtAcctCr," +
							"saldodeudor," +
							"saldoacreedor," +
							"balanceactivo," +
							"balancepasivo," +
							"naturalezaperdida," +
							"naturalezaganancia," +
							"funcionperdida," +
							"funcionganancia," +
							"accountparent," +
							"accountlevel," +
							"c_elementvalue_id," +
							"value2" +
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
							DB.TO_DATE(m_DateAcct_From) + "," +
							m_Level + "," +
							"'" + m_IsOnlyMovementAccount + "'," +
							"EV.VALUE as accountvalue," +
							"CASE WHEN SUM(FA.AMTACCTDR)=0 THEN null ELSE sum(fa.AmtAcctDr) END as amtacctdr," +
							"CASE WHEN SUM(FA.AMTACCTCR)=0 THEN null ELSE sum(fa.AmtAcctCr) END as amtacctcr," +
							"case when SUM(FA.AMTACCTDR-FA.AMTACCTCR)>=0 then SUM(FA.AMTACCTDR-FA.AMTACCTCR) else null end as saldodeudor," +
							"case when SUM(FA.AMTACCTDR-FA.AMTACCTCR)<0 then SUM(FA.AMTACCTDR-FA.AMTACCTCR)*-1 else null end as saldoacreedor," +
							"case when MAX(EV.C_Subject_ID) IN (SELECT s.C_Subject_ID FROM C_Subject s WHERE s.Type='BAGN') and " + 
								"SUM(FA.AMTACCTDR-FA.AMTACCTCR)>=0 then SUM(FA.AMTACCTDR-FA.AMTACCTCR) else null end as balanceactivo," +
							"case when MAX(EV.C_Subject_ID) IN (SELECT s.C_Subject_ID FROM C_Subject s WHERE s.Type='BAGN') and " + 
								"SUM(FA.AMTACCTDR-FA.AMTACCTCR)<0 then SUM(FA.AMTACCTDR-FA.AMTACCTCR)*-1 else null end as balancepasivo," +
							"case when MAX(EV.EGPN_C_Subject_ID) IN (SELECT s.C_Subject_ID FROM C_Subject s WHERE s.Type='EGPN') and " + 
								"SUM(FA.AMTACCTDR-FA.AMTACCTCR)>=0 then SUM(FA.AMTACCTDR-FA.AMTACCTCR) else null end as naturalezaperdida," +
							"case when MAX(EV.EGPN_C_Subject_ID) IN (SELECT s.C_Subject_ID FROM C_Subject s WHERE s.Type='EGPN') and " + 
								"SUM(FA.AMTACCTDR-FA.AMTACCTCR)<0 then SUM(FA.AMTACCTDR-FA.AMTACCTCR)*-1 else null end as naturalezaganancia," +
							"case when MAX(EV.EGPF_C_Subject_ID) IN (SELECT s.C_Subject_ID FROM C_Subject s WHERE s.Type='EGPF') and " +
								"sum(fa.amtacctdr-fa.amtacctcr)>=0 then sum(fa.amtacctdr-fa.amtacctcr) else null end as funcionperdida," +
							"case when MAX(EV.EGPF_C_Subject_ID) IN (SELECT s.C_Subject_ID FROM C_Subject s WHERE s.Type='EGPF') and " +
								"sum(fa.amtacctdr-fa.amtacctcr)<0 then sum(fa.amtacctdr-fa.amtacctcr)*-1 else null end as funcionganancia," +
							"getParentAccount(ev.C_ElementValue_ID)," +
							"getAccountLevel(ev.C_ElementValue_ID)," +
							"ev.c_elementvalue_id," +
							"ev.value " +
                        "FROM " +
                        	"FACT_ACCT FA, " +
                        	"C_ELEMENTVALUE EV " +
                        "WHERE " +
                      		"FA.C_AcctSchema_ID=" + m_C_AcctSchema_ID + " " +
                      		"AND FA.AD_Client_ID=" + m_AD_Client_ID + " ";
		if (m_AD_Org_ID != 0) {
			sql = sql + "AND FA.AD_Org_ID IN (" + m_AD_Org_ID + ", 0) ";
		}
		sql = sql +
                      		"AND FA.PostingType='" + m_PostingType + "' " +
                      		"AND FA.DateAcct >=" + DB.TO_DATE(m_DateAcct_From) + " " +
                      		"AND FA.DateAcct <=" + DB.TO_DATE(m_DateAcct_To) + " " +
                      		"AND EV.C_ELEMENTVALUE_ID=FA.ACCOUNT_ID ";
		if (m_AccountValue_From != null) {
			sql = sql + "AND ev.Value>='" + m_AccountValue_From + "' ";
		}
		if (m_AccountValue_To != null) {
			sql = sql + "AND ev.Value<='" + m_AccountValue_To + "' ";
		}
		sql = sql +
                        "GROUP BY " +
                        	"EV.VALUE," +
                        	"EV.C_ElementValue_ID," +
							"EV.C_Subject_ID," +
							"EV.EGPN_C_Subject_ID," +
							"EV.EGPF_C_Subject_ID ";

		DB.executeUpdate(sql, this.get_TrxName());

		if (!m_IsOnlyMovementAccount.equals("Y")) {
			int maxlevel = DB.getSQLValue(this.get_TrxName(), "SELECT max(AccountLevel) FROM T_HojaDeTrabajoFuncTo5 WHERE AD_PInstance_ID="+this.getAD_PInstance_ID());
			
			if (maxlevel > 0) {
				for (int i = maxlevel; i > 0; i--) {
					sql = "INSERT INTO " +
							"T_HOJADETRABAJOFUNCTO5" +
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
								"account_Level," +
								"isonlymovementaccount," +
								"accountvalue," +
								"AmtAcctDr," +
								"AmtAcctCr," +
								"saldodeudor," +
								"saldoacreedor," +
								"balanceactivo," +
								"balancepasivo," +
								"naturalezaperdida," +
								"naturalezaganancia," +
								"funcionperdida," +
								"funcionganancia," +
								"accountparent," +
								"accountlevel," +
								"c_elementvalue_id," +
								"value2," +
								"issubtotal" +
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
					        	DB.TO_DATE(m_DateAcct_From) + "," +
					        	m_Level + "," +
					        	"'" + m_IsOnlyMovementAccount + "'," +
					        	"ev.value," +
					        	"CASE WHEN sum(getValueNullToZero(t.AmtAcctDr)-getValueNullToZero(t.AmtAcctCr))>0 THEN sum(getValueNullToZero(t.AmtAcctDr)-getValueNullToZero(t.AmtAcctCr)) ELSE null END," +
					        	"CASE WHEN sum(getValueNullToZero(t.AmtAcctCr)-getValueNullToZero(t.AmtAcctDr))>0 THEN sum(getValueNullToZero(t.AmtAcctCr)-getValueNullToZero(t.AmtAcctDr)) ELSE null END," +
					        	"CASE WHEN sum(getValueNullToZero(t.SaldoDeudor)-getValueNullToZero(t.SaldoAcreedor))>0 THEN sum(getValueNullToZero(t.SaldoDeudor)-getValueNullToZero(t.SaldoAcreedor)) ELSE null END," +
					        	"CASE WHEN sum(getValueNullToZero(t.SaldoAcreedor)-getValueNullToZero(t.SaldoDeudor))>0 THEN sum(getValueNullToZero(t.SaldoAcreedor)-getValueNullToZero(t.SaldoDeudor)) ELSE null END," +
					        	"CASE WHEN sum(getValueNullToZero(t.BalanceActivo)-getValueNullToZero(t.BalancePasivo))>0 THEN sum(getValueNullToZero(t.BalanceActivo)-getValueNullToZero(t.BalancePasivo)) ELSE null END," +
					        	"CASE WHEN sum(getValueNullToZero(t.BalancePasivo)-getValueNullToZero(t.BalanceActivo))>0 THEN sum(getValueNullToZero(t.BalancePasivo)-getValueNullToZero(t.BalanceActivo)) ELSE null END," +
					        	"CASE WHEN sum(getValueNullToZero(t.NaturalezaPerdida)-getValueNullToZero(t.NaturalezaGanancia))>0 THEN sum(getValueNullToZero(t.NaturalezaPerdida)-getValueNullToZero(t.NaturalezaGanancia)) ELSE null END," +
					        	"CASE WHEN sum(getValueNullToZero(t.NaturalezaGanancia)-getValueNullToZero(t.NaturalezaPerdida))>0 THEN sum(getValueNullToZero(t.NaturalezaGanancia)-getValueNullToZero(t.NaturalezaPerdida)) ELSE null END," +
					        	"CASE WHEN sum(getValueNullToZero(t.FuncionPerdida)-getValueNullToZero(t.FuncionGanancia))>0 THEN sum(getValueNullToZero(t.FuncionPerdida)-getValueNullToZero(t.FuncionGanancia)) ELSE null END," +
					        	"CASE WHEN sum(getValueNullToZero(t.FuncioNGanancia)-getValueNullToZero(t.FuncionPerdida))>0 THEN sum(getValueNullToZero(t.FuncioNGanancia)-getValueNullToZero(t.FuncionPerdida)) ELSE null END," +
					        	"getParentAccount(t.accountparent)," +
					        	"getAccountLevel(t.accountparent)," +
					        	"t.accountparent," +
					        	"rpad(ev.value,40,'Z')," +
					        	"'Y'" +
					        "FROM " +
					        	"T_HojaDeTrabajoFuncTo5 t " +
					        	"RIGHT JOIN C_ElementValue ev ON (t.accountparent=ev.c_elementvalue_id) " +
					        "WHERE " +
					        	"t.AD_PInstance_ID=" + this.getAD_PInstance_ID() + " " +
					        	"AND t.accountlevel=" + i + " " +
					        "GROUP BY " +
					        	"t.AccountParent," +
					        	"ev.Value ";
					DB.executeUpdate(sql, this.get_TrxName());
					
				}
			}
		}
		sql = "SELECT " +
				"SUM(getValueNullToZero(BalanceActivo)-getValueNullToZero(BalancePasivo)) AS DiferenciaBalance, " +
				"SUM(getValueNullToZero(NaturalezaGanancia)-getValueNullToZero(NaturalezaPerdida)) AS DiferenciaNaturaleza, " +
				"SUM(getValueNullToZero(FuncionGanancia)-getValueNullToZero(FuncionPerdida)) AS DiferenciaFuncion " +
	          "FROM " +
	          	"T_HOJADETRABAJOFUNCTO5 " +
	          "WHERE " +
	          	"AD_PInstance_ID=? " +
	          	"AND issubtotal='N'";

		PreparedStatement pstmt = DB.prepareStatement(sql, get_TrxName());

		pstmt.setInt(1, this.getAD_PInstance_ID());

		ResultSet rs = pstmt.executeQuery();

		if (rs.next()) {
			DiferenciaBalance = rs.getBigDecimal(1);
			if (DiferenciaBalance == null) DiferenciaBalance = Env.ZERO;
			DiferenciaNaturaleza = rs.getBigDecimal(2);
			if (DiferenciaNaturaleza == null) DiferenciaNaturaleza = Env.ZERO;
			DiferenciaFuncion = rs.getBigDecimal(3);
			if (DiferenciaFuncion == null) DiferenciaFuncion = Env.ZERO;
		}
		else {
			return "@Error@";
		}
		rs.close();

		sql = "INSERT INTO " +
				"T_HOJADETRABAJOFUNCTO5" +
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
					"account_level," +
					"isonlymovementaccount," +
					"accountvalue," +
					"amtacctdr," +
					"amtacctcr," +
					"saldodeudor," +
					"saldoacreedor," +
					"balanceactivo," +
					"balancepasivo," +
					"naturalezaganancia," +
					"naturalezaperdida," +
					"funcionganancia," +
					"funcionperdida," +
					"value2," +
					"isvisible" +
				") " +
				"select " +
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
					DB.TO_DATE(m_DateAcct_From) + "," +
					m_Level + "," +
					"'" + m_IsOnlyMovementAccount + "'," +
					"'NNN0'," +
					"sum(getValueNullToZero(AmtAcctDr))," +
		        	"sum(getValueNullToZero(AmtAcctCr))," +
		        	"sum(getValueNullToZero(SaldoDeudor))," +
		        	"sum(getValueNullToZero(SaldoAcreedor))," +
		        	"sum(getValueNullToZero(BalanceActivo))," +
		        	"sum(getValueNullToZero(BalancePasivo))," +
		        	"sum(getValueNullToZero(NaturalezaGanancia))," +
		        	"sum(getValueNullToZero(NaturalezaPerdida))," +
		        	"sum(getValueNullToZero(FuncionGanancia))," +
		        	"sum(getValueNullToZero(FuncionPerdida))," +
/*		        	"CASE WHEN sum(getValueNullToZero(AmtAcctDr)-getValueNullToZero(AmtAcctCr))>0 THEN sum(getValueNullToZero(AmtAcctDr)-getValueNullToZero(AmtAcctCr)) ELSE null END," +
		        	"CASE WHEN sum(getValueNullToZero(AmtAcctCr)-getValueNullToZero(AmtAcctDr))>0 THEN sum(getValueNullToZero(AmtAcctCr)-getValueNullToZero(AmtAcctDr)) ELSE null END," +
		        	"CASE WHEN sum(getValueNullToZero(SaldoDeudor)-getValueNullToZero(SaldoAcreedor))>0 THEN sum(getValueNullToZero(SaldoDeudor)-getValueNullToZero(SaldoAcreedor)) ELSE null END," +
		        	"CASE WHEN sum(getValueNullToZero(SaldoAcreedor)-getValueNullToZero(SaldoDeudor))>0 THEN sum(getValueNullToZero(SaldoAcreedor)-getValueNullToZero(SaldoDeudor)) ELSE null END," +
		        	"CASE WHEN sum(getValueNullToZero(BalanceActivo)-getValueNullToZero(BalancePasivo))>0 THEN sum(getValueNullToZero(BalanceActivo)-getValueNullToZero(BalancePasivo)) ELSE null END," +
		        	"CASE WHEN sum(getValueNullToZero(BalancePasivo)-getValueNullToZero(BalanceActivo))>0 THEN sum(getValueNullToZero(BalancePasivo)-getValueNullToZero(BalanceActivo)) ELSE null END," +
		        	"CASE WHEN sum(getValueNullToZero(NaturalezaPerdida)-getValueNullToZero(NaturalezaGanancia))>0 THEN sum(getValueNullToZero(NaturalezaPerdida)-getValueNullToZero(NaturalezaGanancia)) ELSE null END," +
		        	"CASE WHEN sum(getValueNullToZero(NaturalezaGanancia)-getValueNullToZero(NaturalezaPerdida))>0 THEN sum(getValueNullToZero(NaturalezaGanancia)-getValueNullToZero(NaturalezaPerdida)) ELSE null END," +
		        	"CASE WHEN sum(getValueNullToZero(FuncionPerdida)-getValueNullToZero(FuncionGanancia))>0 THEN sum(getValueNullToZero(FuncionPerdida)-getValueNullToZero(FuncionGanancia)) ELSE null END," +
		        	"CASE WHEN sum(getValueNullToZero(FuncioNGanancia)-getValueNullToZero(FuncionPerdida))>0 THEN sum(getValueNullToZero(FuncioNGanancia)-getValueNullToZero(FuncionPerdida)) ELSE null END," +*/
					"rpad('X', 40, 'X')," +
					"'Y' " +
                "from " +
                	"T_HOJADETRABAJOFUNCTO5 " +
 				"WHERE " +
			   		"AD_PInstance_ID=" + this.getAD_PInstance_ID() + " " +
			   		"AND issubtotal='N' " +
                "UNION " +
                	"select " +
                		this.getAD_PInstance_ID() + "," +
                		m_AD_Client_ID + "," +
                		m_AD_Org_ID + "," +
                		"'Y'," +
                		"CURRENT_TIMESTAMP," +
                		this.getAD_User_ID() + "," +
                		"CURRENT_TIMESTAMP," +
                		this.getAD_User_ID() + ","  +
                		m_C_AcctSchema_ID + "," +
                		"'" + m_PostingType + "'," +
                		DB.TO_DATE(m_DateAcct_From) + "," +
    					m_Level + "," +
    					"'" + m_IsOnlyMovementAccount + "'," +
                		"'NNN1'," +
                		"null," +
                		"null," +
                		"null," +
                		"null," +
		   				"case when " + DiferenciaBalance.toString() + "<0 then " + DiferenciaBalance.toString() + "*-1 else null end," +
		   				"case when " + DiferenciaBalance.toString() + ">0 then " + DiferenciaBalance.toString() + " else null end," +
		   				"case when " + DiferenciaNaturaleza.toString() + "<0 then " + DiferenciaNaturaleza.toString() + "*-1 else null end," +
		   				"case when " + DiferenciaNaturaleza.toString() + ">0 then " + DiferenciaNaturaleza.toString() + " else null end," +
		   				"case when " + DiferenciaFuncion.toString() + "<0 then " + DiferenciaFuncion.toString() + "*-1 else null end," +
		   				"case when " + DiferenciaFuncion.toString() + ">0 then " + DiferenciaFuncion.toString() + " else null end," +
		   				"rpad('Y', 40, 'Y')," +
		   				"'Y' " +
                " UNION " + 
                	"select " +
            			this.getAD_PInstance_ID() + "," +
            			m_AD_Client_ID + "," +
            			m_AD_Org_ID + "," +
            			"'Y'," +
            			"CURRENT_TIMESTAMP," +
            			this.getAD_User_ID() + "," +
            			"CURRENT_TIMESTAMP," +
            			this.getAD_User_ID() + ","  +
            			m_C_AcctSchema_ID + "," +
            			"'" + m_PostingType + "'," +
            			DB.TO_DATE(m_DateAcct_From) + "," +
    					m_Level + "," +
    					"'" + m_IsOnlyMovementAccount + "'," +
                		"'NNN2'," +
                		"null," +
                		"null," +
                		"null," +
                		"null," +
		   				"case when " + DiferenciaBalance.toString() + "<0 then (" + DiferenciaBalance.toString() + "*-1)+sum(case when balanceactivo is null then 0 else balanceactivo end) else sum(balanceactivo) end," +
		   				"case when " + DiferenciaBalance.toString() + ">=0 then " + DiferenciaBalance.toString() + "+sum(case when balancepasivo is null then 0 else balancepasivo end) else sum(balancepasivo) end," +
		   				"case when " + DiferenciaNaturaleza.toString() + "<0 then (" + DiferenciaNaturaleza.toString() + "*-1)+sum(case when naturalezaganancia is null then 0 else naturalezaganancia end) else sum(naturalezaganancia) end," +
		   				"case when " + DiferenciaNaturaleza.toString() + ">=0 then " + DiferenciaNaturaleza.toString() + "+sum(case when naturalezaperdida is null then 0 else naturalezaperdida end) else sum(naturalezaperdida) end, " +
		   				"case when " + DiferenciaFuncion.toString() + "<0 then (" + DiferenciaFuncion.toString() + "*-1)+sum(case when funcionganancia is null then 0 else funcionganancia end) else sum(funcionganancia) end," +
		   				"case when " + DiferenciaFuncion.toString() + ">=0 then " + DiferenciaFuncion.toString() + "+sum(case when funcionperdida is null then 0 else funcionperdida end) else sum(funcionperdida) end," +
		   				"rpad('Z', 40, 'Z')," +
		   				"'Y' " +
				   "from " +
				   		"T_HOJADETRABAJOFUNCTO5 " +
				   "WHERE " +
				   		"AD_PInstance_ID=" + this.getAD_PInstance_ID() + " " +
				   		"AND issubtotal='N'";
		
		DB.executeUpdate(sql, this.get_TrxName());

		sql = "UPDATE " +
				"T_HojaDeTrabajoFuncTo5 " +
			  "SET " +
			  	"IsVisible='Y' " +
			  "WHERE " +
			  	"AD_PInstance_ID=" + this.getAD_PInstance_ID() + " ";
		if (m_Level > 0) {
			sql = sql + "AND AccountLevel<=" + m_Level + " ";
		}
		DB.executeUpdate(sql, this.get_TrxName());
		return null;
	}
}
