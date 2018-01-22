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

public class AcquisitionReport extends SvrProcess {
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
						"T_Acquisitions (" +
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
					  	"distinct f.Record_ID," +
					  	this.getAD_PInstance_ID() + "," +
					  	m_AD_Client_ID + "," +
					  	m_AD_Org_ID + "," +
					  	"'Y'," +
					  	"CURRENT_TIMESTAMP," +
					  	this.getAD_User_ID() + "," +
					  	"CURRENT_TIMESTAMP," +
					  	this.getAD_User_ID() + "," +
						"i.DateInvoiced," +
						"i.C_DocType_ID," +
						"i.Serial," +
						"i.DocumentNo," +
						"i.C_BPartner_ID," +
						"'RUC'," +
						"p.Value," +
						"p.Name," +
						"i.C_ConversionType_ID," +
						m_C_DocGroup_ID + "," +
						m_C_AcctSchema_ID + "," +
						"f.DateAcct," +
						"0," +
						"i.Ref_Invoice_ID," +
						"currencyRate(i.C_Currency_ID, 0, i.DateInvoiced, i.C_ConversionType_ID, i.AD_Client_ID, i.AD_Org_ID)," +
						"t.CodSunat," +
						"r.DateInvoiced," +
						"r.C_DocType_ID," +
						"r.Serial," +
						"r.DocumentNo," +
						"i.Fact_ID " +
					  "FROM " +
					  	"fact_acct f," +
					  	"C_Invoice i " +
					  	"LEFT JOIN C_Invoice r ON (r.C_Invoice_ID=i.Ref_Invoice_ID), " +
					  	"C_BPartner p," +
					  	"C_DocType t " +
					  "WHERE " +
					  	"f.C_AcctSchema_ID= " + m_C_AcctSchema_ID + " " +
					  	"AND f.AD_Client_ID=" + m_AD_Client_ID + " ";
		if (m_AD_Org_ID != 0) {
			sql = sql + "AND f.AD_Org_ID IN (0, " + m_AD_Org_ID + ") ";
		}
		sql = sql +
					  	"AND f.AD_Table_ID=318 " +
					  	"AND f.DateAcct>=to_date('" + m_DateAcct_From + "', 'yyyy/MM/dd') " +
					  	"AND f.DateAcct<=to_date('" + m_DateAcct_To + "', 'yyyy/MM/dd') " +
					  	"AND i.C_Invoice_ID=f.Record_ID " +
					  	"AND i.C_DocType_ID IN (SELECT C_DocType_ID FROM C_DocGroupLine WHERE C_DocGroup_ID=" + m_C_DocGroup_ID + ") " +
					  	"AND p.C_BPartner_ID=i.C_BPartner_ID " +
					  	"AND t.C_DocType_ID=i.C_DocType_ID ";
		DB.executeUpdate(sql, get_TrxName());
		sql = "UPDATE " +
			"T_Acquisitions t " +
			"SET " +
			"C_Currency_ID= i.C_Currency_ID , " +
			"multiplyrate= currencyRate(i.C_Currency_ID, 308, i.DateInvoiced, i.C_ConversionType_ID, i.AD_Client_ID, i.AD_Org_ID) " +
			" FROM C_Invoice i WHERE  t.c_invoice_id = i.c_invoice_id AND t.AD_PInstance_ID=" + this.getAD_PInstance_ID();
		DB.executeUpdate(sql, get_TrxName());
		sql = "SELECT " +
				"C_Invoice_ID " +
			  "FROM " +
			  	"T_Acquisitions " +
			  "WHERE " +
			  	"AD_PInstance_ID=?";
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
					"sum(fa.AmtAcctDr)-sum(fa.AmtAcctCr), " +
					"fa.Line_ID," +
					"t.TaxAlias," +
					"fa.C_Tax_ID " +
				  "FROM " +
				  	"Fact_Acct fa " +
				  	"LEFT JOIN C_Tax T ON (t.C_Tax_ID=fa.C_Tax_ID) " +
				  "WHERE " +
				  	"AD_Table_ID=table_name2id('C_Invoice') " +
				  	"AND Record_ID=? " +
				  	"AND ((fa.line_id is null and fa.qty=0) or (fa.line_id is not null and fa.qty != 0)) " +
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
					"T_Acquisitions " +
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
			DB.executeUpdate(sql, get_TrxName());
			
		}
		return null;
	}
}
