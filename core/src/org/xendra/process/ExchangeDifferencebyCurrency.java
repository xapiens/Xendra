package org.xendra.process;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;

import org.compiere.model.MAccount;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MConversionType;
import org.compiere.model.MCurrency;
import org.compiere.model.MDocType;
import org.compiere.model.MJournalBatch;
import org.compiere.model.MJournal;
import org.compiere.model.MJournalLine;
import org.compiere.model.MPeriod;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.report.core.RModel;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.xendra.exceptions.XendraException;

public class ExchangeDifferencebyCurrency extends SvrProcess {
	private int m_AD_Client_ID;
	private int m_C_AcctSchema_ID;
	private int m_Year;
	private String m_AccountValue_From = null;
	private String m_AccountValue_To = null;
	private Timestamp m_DateAcctClose = null;
	private static String Ok = "@Ok@";
	private int m_C_DocType_ID;
	
	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("AD_Client_ID"))
				m_AD_Client_ID = para[i].getParameterAsInt();
			else if (name.equals("C_AcctSchema_ID"))
				m_C_AcctSchema_ID = para[i].getParameterAsInt();
			else if (name.equals("AccountValue")) {
				m_AccountValue_From = (String)para[i].getParameter();
				m_AccountValue_To = (String)para[i].getParameter_To();
			}
			else if (name.equals("DateAcctClose")) {
				m_DateAcctClose = (Timestamp)para[i].getParameter();
				GregorianCalendar cal = new GregorianCalendar();
				cal.setTimeInMillis(m_DateAcctClose.getTime());
				m_Year = cal.get(Calendar.YEAR);				
			}
			else if (name.equals("C_DocType_ID")) {
				m_C_DocType_ID = para[i].getParameterAsInt();
			}
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}

	protected String generateJournal(Integer C_Currency)
	{
		String sql = "SELECT " +
		"AD_Org_ID," +
		"Account_ID," +
		"CASE WHEN (AmtAcctDr>AmtAcctCr) THEN (AmtAcctDr-AmtAcctCr) ELSE 0 END AS AmtAcctDr," +
		"CASE WHEN (AmtAcctDr<AMtAcctCr) THEN (AmtAcctCr-AmtAcctDr) ELSE 0 END AS AmtAcctCr," +
		"serial," +
		"invoicedocumentno, " +						
		"C_BPartner_ID " +
		"FROM " +
		"(" +
		"SELECT " +
		"f.AD_Org_ID," +
		"f.Account_ID," +
		"SUM(f.AmtAcctDr) AS AmtAcctDr," +
		"SUM(f.AmtAcctCr) AS AmtAcctCr," +
		"f.Serial," +
		"f.InvoiceDocumentNo, " +        
		"f.C_BPartner_ID " + 
		" FROM " +
		"Fact_Acct f " +
		"INNER JOIN C_ElementValue ev ON (f.Account_ID=ev.C_ElementValue_ID) " +
		"WHERE " +
		"f.AD_Client_ID=? " +
		"AND f.C_AcctSchema_ID=? " +
		"AND f.DateAcct>='" + m_Year + "-01-01' " +
		"AND f.DateAcct<'" + (m_Year+1) + "-01-01' " +
		"AND ev.Value >= ? " +
		"AND ev.Value <= ? " +
		"AND CASE WHEN COALESCE(InvoiceDocumentNo,'EMPTY') = 'EMPTY' THEN false ELSE getCurrencySourcebyDocumentNo(Serial,InvoiceDocumentNo)="+String.valueOf(C_Currency)+" END " +
		"GROUP BY " +
		"f.Account_ID," +
		"f.serial," +
		"f.invoicedocumentno," +
		"f.C_BPartner_ID," +
		"f.AD_Org_ID " +
		"ORDER BY " +
		"MAX(ev.Value) " +
		") AS foo " +
		"WHERE " +
		"AmtAcctDr!=AmtAcctCr " ; 
	
		try {

			PreparedStatement pstmt = DB.prepareStatement(sql, get_TrxName());
			pstmt.setInt(1, m_AD_Client_ID);
			pstmt.setInt(2, m_C_AcctSchema_ID);
			pstmt.setString(3, m_AccountValue_From);
			pstmt.setString(4, m_AccountValue_To);

			ResultSet rs = pstmt.executeQuery();

			MPeriod periodClose = MPeriod.get(getCtx(), m_DateAcctClose);
			MDocType docType = new MDocType(getCtx(), m_C_DocType_ID, get_TrxName());
			MAcctSchema schema = new MAcctSchema(getCtx(), m_C_AcctSchema_ID, get_TrxName());

			MJournalBatch batchClose = new MJournalBatch(getCtx(), 0, get_TrxName());
			batchClose.setDescription(m_Year + " ajuste por moneda " + MCurrency.get(Env.getCtx(), C_Currency).getDescription());
			batchClose.setDateDoc(m_DateAcctClose);
			batchClose.setDateAcct(m_DateAcctClose);
			batchClose.setC_Period_ID(periodClose.get_ID());
			batchClose.setC_DocType_ID(m_C_DocType_ID);
			batchClose.setC_Currency_ID(schema.getC_Currency_ID());
			batchClose.setGL_Category_ID(docType.getGL_Category_ID());
			if (!batchClose.save()) return "@Error@ saving Closing Journal Batch";

			MJournal journalClose = new MJournal(batchClose);
			journalClose.setDescription(m_Year + " ajuste por moneda " + MCurrency.get(Env.getCtx(), C_Currency).getDescription());
			journalClose.setC_AcctSchema_ID(m_C_AcctSchema_ID);
			journalClose.setGL_Category_ID(docType.getGL_Category_ID());
			journalClose.setC_ConversionType_ID(MConversionType.getDefault(m_AD_Client_ID));
			if (!journalClose.save()) return "@Error@ saving Closing Journal";

			while (rs.next()) {
				int AD_Org_ID = rs.getInt(1);
				int C_ElementValue_ID = rs.getInt(2);
				BigDecimal AmtAcctDr = rs.getBigDecimal(3);
				BigDecimal AmtAcctCr = rs.getBigDecimal(4);
				int C_BPartner_ID   = rs.getInt("C_BPartner_ID");
				String Serial = rs.getString(5);
				String DocumentNo = rs.getString(6);
				MAccount acct = MAccount.get(getCtx(), m_AD_Client_ID, AD_Org_ID, m_C_AcctSchema_ID, C_ElementValue_ID, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

				MJournalLine lineClose = new MJournalLine(journalClose);
				lineClose.setAD_Org_ID(AD_Org_ID);
				lineClose.setAmtAcct(AmtAcctCr, AmtAcctDr);
				lineClose.setAmtSourceDr(AmtAcctCr);
				lineClose.setAmtSourceCr(AmtAcctDr);
				lineClose.setC_ValidCombination_ID(acct);
				lineClose.setSerial(Serial);
				lineClose.setReferenceNo(DocumentNo);
				lineClose.setC_BPartner_ID(C_BPartner_ID);
				if (!lineClose.save()) return "@Error@ saving Closing Journal line";
			}
		}
		catch (Exception e) {}
		finally {}
		return "@Ok@";
	}
	protected String doIt() throws Exception {
		String sql = "SELECT distinct f.c_currency_id  FROM fact_acct f WHERE " +
	                    	"f.AD_Client_ID=? " +
	                    	"AND f.C_AcctSchema_ID=? " +
	                    	"AND f.DateAcct>='" + m_Year + "-01-01' " +
	                    	"AND f.DateAcct<'" + (m_Year+1) + "-01-01' " +
	                    	"AND C_Currency_ID != ?";

		try {
			MAcctSchema ass = MAcctSchema.get(Env.getCtx(), m_C_AcctSchema_ID);
			String error = "";
			PreparedStatement pstmt = null;
			ResultSet rs = null;			
			pstmt = DB.prepareStatement(sql, null);
			pstmt.setInt(1, m_AD_Client_ID);
			pstmt.setInt(2, m_C_AcctSchema_ID);
			pstmt.setInt(3, ass.getC_Currency_ID());
			rs = pstmt.executeQuery();
			
			while (rs.next())
			{
				Integer currency = rs.getInt("C_Currency_ID");
				error = generateJournal(currency);
				if (error.compareTo(Ok) != 0)
					throw new XendraException(error);
			}
			rs.close();
			pstmt.close();			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
		}
		return null;
	}

}
