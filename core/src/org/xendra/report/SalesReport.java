package org.xendra.report;

import java.util.logging.Level;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;

public class SalesReport extends SvrProcess {
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
		
		/* Fills the data which has nothing to do with numerics */
		String sql = "INSERT INTO " + 
						"T_Sales (" +
							"C_Invoice_ID," +
							"AD_PInstance_ID," +
							"AD_Client_ID," +
							"AD_Org_ID," +
							"IsActive," +
							"Created," +
							"CreatedBy," +
							"Updated," +
							"UpdatedBy," +
							"DateInvoiced," +
							"C_DocType_ID," +
							"Serial," +
							"DocumentNo," +
							"C_BPartner_ID," +
							"BPartner_Type," +
							"BPartner_Value," +
							"BPartner_Name," +
							"C_ConversionType_ID," +
							"C_DocGroup_ID," +
							"C_AcctSchema_ID," +
							"DateAcct," +
							"C_Currency_ID," +
							"C_Reference_ID," +
							"MultiplyRate," +
							"CodSunat," +
							"C_Reference_DateInvoiced," +
							"C_Reference_DocType_ID," +
							"C_Reference_Serial," +
							"C_Reference_DocumentNo," +
							"Fact_ID " +
						") " + 
					  "SELECT " +
					  	"i.C_Invoice_ID," +
					  	this.getAD_PInstance_ID() + "," +
					  	m_AD_Client_ID + "," +
					  	m_AD_Org_ID + "," +
					  	"'Y'," +
					  	"CURRENT_TIMESTAMP," +
					  	this.getAD_User_ID() + "," +
					  	"CURRENT_TIMESTAMP," +
					  	this.getAD_User_ID() + "," +
						"CASE WHEN i.DocStatus != 'VO' THEN i.DateInvoiced ELSE NULL END," +
						"i.C_DocType_ID," +
						"i.Serial," +
						"i.DocumentNo," +
						"CASE WHEN i.DocStatus != 'VO' THEN i.C_BPartner_ID ELSE NULL END," +
						"CASE WHEN i.DocStatus != 'VO' THEN 'RUC' ELSE NULL END," +
						"CASE WHEN i.DocStatus != 'VO' THEN p.Value ELSE NULL END," +
						"CASE WHEN i.DocStatus != 'VO' THEN p.Name ELSE '** ANULADO **' END," +
						"CASE WHEN i.DocStatus != 'VO' THEN i.C_ConversionType_ID ELSE NULL END," +
						m_C_DocGroup_ID + "," +
						m_C_AcctSchema_ID + "," +
						"i.DateAcct," +
						"CASE WHEN i.DocStatus != 'VO' THEN i.C_Currency_ID ELSE NULL END," +
						"CASE WHEN i.DocStatus != 'VO' THEN i.Ref_Invoice_ID ELSE NULL END," +
						"CASE WHEN i.DocStatus != 'VO' THEN currencyRate(i.C_Currency_ID, 308, i.DateInvoiced, i.C_ConversionType_ID, i.AD_Client_ID, i.AD_Org_ID) ELSE NULL END," +
						"t.CodSunat," +
						"CASE WHEN i.DocStatus != 'VO' THEN r.DateInvoiced ELSE NULL END," +
						"CASE WHEN i.DocStatus != 'VO' THEN r.C_DocType_ID ELSE NULL END," +
						"CASE WHEN i.DocStatus != 'VO' THEN r.Serial ELSE NULL END," +
						"CASE WHEN i.DocStatus != 'VO' THEN r.DocumentNo ELSE NULL END," +
						"i.Fact_ID " +
					  "FROM " +
					  	"C_Invoice i " +
					  	"LEFT JOIN C_Invoice r ON (r.C_Invoice_ID=i.Ref_Invoice_ID), " +
					  	"C_BPartner p," +
					  	"C_DocType t " +
					  "WHERE " +
					  	"i.AD_Client_ID=" + m_AD_Client_ID + " ";
		if (m_AD_Org_ID != 0) {
			sql = sql + "AND i.AD_Org_ID IN (0, " + m_AD_Org_ID + ") ";
		}
		sql = sql +
					  	"AND i.DateAcct>=to_date('" + m_DateAcct_From + "', 'yyyy/MM/dd') " +
					  	"AND i.DateAcct<=to_date('" + m_DateAcct_To + "', 'yyyy/MM/dd') " +
						"AND ( " +
								"i.C_DocType_ID IN (SELECT C_DocType_ID FROM C_DocGroupLine WHERE C_DocGroup_ID=" + m_C_DocGroup_ID + ") " +
								"OR i.C_DocTypeTarget_ID IN (SELECT C_DocType_ID FROM C_DocGroupLine WHERE C_DocGroup_ID=" + m_C_DocGroup_ID + ") " +
						") " +
					  	"AND p.C_BPartner_ID=i.C_BPartner_ID " +
					  	"AND ( " +
					  			"t.C_DocType_ID=(CASE WHEN i.C_DocType_ID=0 THEN i.C_DocTypeTarget_ID ELSE i.C_DocType_ID END) " +
					  	") " +
					  	"AND i.DocStatus IN ('CO', 'VO') ";
		if (DB.executeUpdate(sql, get_TrxName()) == -1) {
			return "@Error@: Error executing initial query";
		}
		
		sql = "SELECT " +
				"C_Invoice_ID " +
			  "FROM " +
			  	"T_Sales " +
			  "WHERE " +
			  	"AD_PInstance_ID=? " +
			  	"AND BPartner_Type IS NOT NULL";
		PreparedStatement pstmt = DB.prepareStatement(sql, get_TrxName());
		pstmt.setInt(1, this.getAD_PInstance_ID());
		ResultSet rs = pstmt.executeQuery();
		
		while (rs.next()) {
			int C_Invoice_ID = rs.getInt(1);
			BigDecimal AmtBaseTaxed = Env.ZERO;
			BigDecimal AmtIGVTaxed = Env.ZERO;
			BigDecimal AmtBaseExportExcempt = Env.ZERO;
			BigDecimal AmtIGVExportExcempt = Env.ZERO;
			BigDecimal AmtBaseBoleta = Env.ZERO;
			BigDecimal AmtBaseExcempt = Env.ZERO;
			BigDecimal AmtBaseUntaxed = Env.ZERO;
			BigDecimal GrandTotal = Env.ZERO;
			BigDecimal AmtTaxOther = Env.ZERO;
			BigDecimal AmtTaxPerception = Env.ZERO;

			sql = "SELECT " +
					"sum(fa.AmtAcctCr)-sum(fa.AmtAcctDr), " +
					"fa.Line_ID," +
					"t.TaxAlias," +
					"fa.C_Tax_ID " +
				  "FROM " +
				  	"Fact_Acct fa " +
				  	"LEFT JOIN C_Tax T ON (t.C_Tax_ID=fa.C_Tax_ID) " +
				  "WHERE " +
				  	"AD_Table_ID=table_name2id('C_Invoice') " +
				  	"AND Record_ID=? " +
				  "GROUP BY " +
				  	"t.TaxAlias," +
				  	"fa.C_Tax_ID," +
				  	"fa.Line_ID ";
			PreparedStatement pstmt2 = DB.prepareStatement(sql, get_TrxName());
			pstmt2.setInt(1, rs.getInt(1));
			ResultSet rs2 = pstmt2.executeQuery();
			
			while (rs2.next()) {
				BigDecimal AmtAcct = rs2.getBigDecimal(1);
				int Line_ID = rs2.getInt(2);
				String TaxAlias = rs2.getString(3);
				int C_Tax_ID = rs2.getInt(4);
				
				/* IGV -> AmtBaseTaxed, AmtIGVTaxed */
				/* BVC -> AmtBaseBoleta */
				/* NGR -> AmtBaseExcempt */
				/* NIG -> AmtBaseUntaxed */
				/* PCR -> AmtTaxPerception */
				if (Line_ID != 0) {
					/* Base Amount */
					if (TaxAlias != null) {
						if (TaxAlias.equals("IGV")) {
							AmtBaseTaxed = AmtBaseTaxed.add(AmtAcct);
						}
						else if (TaxAlias.equals("BVC")) {
							AmtBaseBoleta = AmtBaseBoleta.add(AmtAcct);
						}
						else if (TaxAlias.equals("NGR")) {
							AmtBaseExcempt = AmtBaseExcempt.add(AmtAcct);
						}
						else if (TaxAlias.equals("NIG")) {
							AmtBaseUntaxed = AmtBaseUntaxed.add(AmtAcct);
						}
						else if (TaxAlias.equals("PRC")) {
							AmtTaxPerception = AmtTaxPerception.add(AmtAcct);
						}
						else {
							System.out.println("Warning: Unknown TaxAlias for Invoice ID + " + C_Invoice_ID);
						}
					}
					else {
						System.out.println("Warning: NULL TaxAlias for Invoice ID = " + C_Invoice_ID);
						AmtBaseTaxed = AmtBaseTaxed.add(AmtAcct);
					}
				}
				else {
					if (C_Tax_ID == 0) {
						GrandTotal = AmtAcct.negate();
					}
					else {
						if (TaxAlias == null || !TaxAlias.equals("IGV")) {
							System.out.println("Warning: Unknown TaxAlias for Invoice ID=" + C_Invoice_ID);
							AmtTaxOther = AmtTaxOther.add(AmtAcct);
						}
						else {
							AmtIGVTaxed = AmtIGVTaxed.add(AmtAcct);
						}
					}
				}
			}
			
			sql = "SELECT" +
					"";
			if (AmtBaseTaxed.compareTo(Env.ZERO) == 0) System.out.println("Warning: Zero Base Amount for Invoice ID " + C_Invoice_ID);
			sql = "UPDATE " +
					"T_Sales " +
	              "SET " +
	              	"Amt_Base_Taxed=" + AmtBaseTaxed.toString() + ", " +
	              	"Amt_IGV_Taxed=" + AmtIGVTaxed.toString() + ", " +
	              	"Amt_Base_Export_Excempt=" + AmtBaseExportExcempt.toString() + ", " +
	              	"Amt_IGV_Export_Excempt=" + AmtIGVExportExcempt.toString() + ", " + 
	              	"Amt_Base_Boleta=" + AmtBaseBoleta.toString() + ", " +
	              	"Amt_Base_Excempt=" + AmtBaseExcempt.toString() + ", " +
	              	"Amt_Base_Untaxed=" + AmtBaseUntaxed.toString() + ", " +
	              	"AmtTax_Perception=" + AmtTaxPerception.toString() + ", " +
	              	"AmtTax_Other=" + AmtTaxOther.toString() + ", " +
	              	"GrandTotal=" + GrandTotal.toString() + " " +
	              "WHERE " +
	              	"AD_PInstance_ID=" + this.getAD_PInstance_ID() + " " +
	              	"AND C_Invoice_ID=" + C_Invoice_ID + " ";
			if (DB.executeUpdate(sql, get_TrxName()) == -1) {
				return "@Error@ executing update query";
			}
			
		}
		return null;
	}

}
