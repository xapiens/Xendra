package org.xendra.report;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.logging.Level;

import org.compiere.model.MAccount;
import org.compiere.model.MAllocationHdr;
import org.compiere.model.MCash;
import org.compiere.model.MDistribution;
import org.compiere.model.MDistributionLine;
import org.compiere.model.MFactAcct;
import org.compiere.model.MInOut;
import org.compiere.model.MInvoice;
import org.compiere.model.MJournal;
import org.compiere.model.MMovement;
import org.compiere.model.MPayment;
import org.compiere.model.reference.REF_C_ElementValueAccountSign;
import org.compiere.util.DB;
import org.compiere.util.CPreparedStatement;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;


public class MatchAccounts extends SvrProcess {
	int m_AD_Client_ID;
	int m_AD_Org_ID;
	int m_C_AcctSchema_ID;
	String m_PostingType;
	Timestamp m_DateAcct_From;
	Timestamp m_DateAcct_To;

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
			else if (name.equals("PostingType")) {
				m_PostingType = (String)para[i].getParameter();
			}
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}

	}

	@Override
	protected String doIt() throws Exception {
		String sql = "SELECT " +
					 		"Fact_Acct_ID " +
					 	"FROM " +
					 		"Fact_Acct " +
					 	"WHERE " +
					 		"AD_Client_ID=? " +
					 		"AND C_AcctSchema_ID=? " +
					 		"AND TRUNC(DateAcct)>=? " +
					 		"AND TRUNC(DateAcct)<=? " +
					 		"AND PostingType=? ";
		if (m_AD_Org_ID != 0) {
			sql = sql +		"AND AD_Org_ID=? ";
		}
		sql = sql + 	"ORDER BY " +
							"AD_Table_ID," +
							"Record_ID ";
		PreparedStatement pstmt = DB.prepareStatement(sql, get_TrxName());
		pstmt.setInt(1, m_AD_Client_ID);
		pstmt.setInt(2, m_C_AcctSchema_ID);
		pstmt.setTimestamp(3, m_DateAcct_From);
		pstmt.setTimestamp(4, m_DateAcct_To);
		pstmt.setString(5, m_PostingType);
		if (m_AD_Org_ID != 0) pstmt.setInt(6, m_AD_Org_ID);
		
		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {
			int Fact_Acct_ID = rs.getInt(1);
			
			MFactAcct fact = new MFactAcct(getCtx(), Fact_Acct_ID, get_TrxName());
			MAccount acct = MAccount.get(fact);
			MDistribution distributions[] = MDistribution.get(getCtx(), fact.getC_AcctSchema_ID(), fact.getPostingType(), 0,false, fact.getAD_Org_ID(),
					fact.getAccount_ID(), fact.getM_Product_ID(), fact.getC_BPartner_ID(), fact.getC_Project_ID(), fact.getC_Campaign_ID(), fact.getC_Activity_ID(), fact.getAD_OrgTrx_ID(),
					fact.getC_SalesRegion_ID(), fact.getC_LocTo_ID(), fact.getC_LocFrom_ID(), fact.getUser1_ID(), fact.getUser2_ID());
			if (distributions != null) {
				if (distributions.length > 1) System.out.println("WARNING!!! More than one distribution found for account " + acct);
				for (int i = 0; i < distributions.length; i++) {
					MDistribution distribution = distributions[i];
					distribution.distribute(acct, fact.getAmtAcctDr().subtract(fact.getAmtAcctCr()), fact.getC_Currency_ID());
					MDistributionLine lines[] = distribution.getLines(false);
					for (int j = 0; j < lines.length; j++)
					{
						BigDecimal AmtAcctCr = BigDecimal.ZERO;
						BigDecimal AmtAcctDr = BigDecimal.ZERO;
						MDistributionLine dl = lines[j];
						
						if (!dl.isActive() || dl.getAmt().signum() == 0)
							continue;
						
						if (REF_C_ElementValueAccountSign.Credit.equals(dl.getAccountSign())) {
							if (dl.getAmt().signum()>=0)
								AmtAcctCr = dl.getAmt();
							else
								AmtAcctDr = dl.getAmt().abs();
						}
						else if(REF_C_ElementValueAccountSign.Debit.equals(dl.getAccountSign())) {
							if (dl.getAmt().signum()>=0)
								AmtAcctDr = dl.getAmt();
							else
								AmtAcctCr = dl.getAmt().abs();
						}
						else {
							if (dl.getAmt().signum() < 0) {
								AmtAcctCr = dl.getAmt().abs();
							}
							else {
								AmtAcctDr = dl.getAmt();
							}
						}
						
						sql = "SELECT " +
								"Fact_Acct_ID " +
						      "FROM " +
						      	"Fact_Acct " +
						      "WHERE " +
						      	"AD_Table_ID=? " +
						      	"AND Record_ID=? " +
						      	"AND C_AcctSchema_ID=? " +
						      	"AND PostingType=? " +
						      	"AND AD_Client_ID=? " +
						      	"AND DateAcct=? " +
						      	"AND Account_ID=? " +
						      	"AND AmtAcctCr=? " +
						      	"AND AmtAcctDr=? ";
						pstmt = DB.prepareStatement(sql, get_TrxName());
						pstmt.setInt(1, fact.getAD_Table_ID());
						pstmt.setInt(2, fact.getRecord_ID());
						pstmt.setInt(3, fact.getC_AcctSchema_ID());
						pstmt.setString(4, fact.getPostingType());
						pstmt.setInt(5, fact.getAD_Client_ID());
						pstmt.setTimestamp(6, fact.getDateAcct());
						pstmt.setInt(7, dl.getAccount_ID());
						pstmt.setBigDecimal(8, AmtAcctCr);
						pstmt.setBigDecimal(9, AmtAcctDr);
						ResultSet rs2 = pstmt.executeQuery();
						if (rs2.next()) {
							continue;
						}
						// Not found						
						sql = "INSERT INTO " +
								"T_MatchAccounts " +
							  "SELECT " +
							    "? AS AD_PInstance_ID, " +
							    "f.ad_client_id," +
							    "f.ad_org_id," +
							    "f.isactive," +
							    "f.created," +
							    "f.createdby," +
							    "f.updated," +
							    "f.updatedby," +
							    "f.c_acctschema_id," +
							    "f.account_id," +
							    "f.datetrx," +
							    "f.dateacct," +
							    "f.c_period_id," +
							    "f.ad_table_id," +
							    "f.record_id," +
							    "f.line_id," +
							    "f.gl_category_id," +
							    "f.gl_budget_id," +
							    "f.c_tax_id," +
							    "f.m_locator_id," +
							    "f.postingtype," +
							    "f.c_currency_id," +
							    "f.amtsourcedr," +
							    "f.amtsourcecr," +
							    "f.amtacctdr," +
							    "f.amtacctcr," +
							    "f.c_uom_id," +
							    "f.qty," +
							    "f.m_product_id," +
							    "f.c_bpartner_id," +
							    "f.ad_orgtrx_id," +
							    "f.c_locfrom_id," +
							    "f.c_locto_id," +
							    "f.c_salesregion_id," +
							    "f.c_project_id," +
							    "f.c_campaign_id," +
							    "f.c_activity_id," +
							    "f.user1_id," +
							    "f.user2_id," +
							    "f.description," +
							    "f.a_asset_id," +
							    "f.c_subacct_id," +
							    "f.userelement1_id," +
							    "f.userelement2_id," +
							    "f.c_projectphase_id," +
							    "f.c_projecttask_id," +
							    "f.c_doctype_id," +
							    "? AS DocumentNo," +
							    "? AS Serial," +
							    "f.Fact_ID " +
							  "FROM " +
							  	"Fact_Acct f " +
							  "WHERE " +
							  	"f.Fact_Acct_ID=?";
						CPreparedStatement stmt = DB.prepareStatement(sql, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE, get_TrxName());
						stmt.setInt(1, getAD_PInstance_ID());
						stmt.setString(2, getDocumentNo(fact.getAD_Table_ID(), fact.getRecord_ID()));
						stmt.setString(3, getSerial(fact.getAD_Table_ID(), fact.getRecord_ID()));
						stmt.setInt(4, fact.get_ID());
						int no = stmt.executeUpdate();
						if (no == -1) return "@Error@";
						break;
					}
					
				}
			}
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
