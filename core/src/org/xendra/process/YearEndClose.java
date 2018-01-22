package org.xendra.process;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.logging.Level;

import org.compiere.model.MAccount;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MAcctSchemaGL;
import org.compiere.model.MConversionType;
import org.compiere.model.MDocType;
import org.compiere.model.MJournalBatch;
import org.compiere.model.MJournal;
import org.compiere.model.MJournalLine;
import org.compiere.model.MPeriod;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.xendra.annotations.*;

@XendraProcess(value="YearEndClose",
name="Year End Accounting close",
description="",
help="",
Identifier="d7e5fb02-61b4-2513-d2cb-c6ff44c1678e",
classname="org.xendra.process.YearEndClose",
updated="2015-06-20 10:10:12")
public class YearEndClose extends SvrProcess {
	@XendraProcessParameter(Name="Client",
			                ColumnName="AD_Client_ID",
			                Description="Client/Tenant for this installation.",
			                Help="A Client is a company or a legal entity. You cannot share data between Clients. Tenant is a synonym for Client.",
			                AD_Reference_ID=DisplayType.TableDir,
			                SeqNo=10,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=10,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="d6f34e6a-213d-a1c7-e27c-cb4194e2f68b")	
	private int m_AD_Client_ID;
	@XendraProcessParameter(Name="Accounting Schema",
			                ColumnName="C_AcctSchema_ID",
			                Description="Rules for accounting",
			                Help="An Accounting Schema defines the rules used in accounting such as costing method, currency and calendar",
			                AD_Reference_ID=DisplayType.TableDir,
			                SeqNo=20,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=10,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="2287a6a1-c947-0e6e-ac77-b52f013a6738")	
	private int m_C_AcctSchema_ID;
	@XendraProcessParameter(Name="PostingType",
			                ColumnName="PostingType",
			                Description="The type of posted amount for the transaction",
			                Help="The Posting Type indicates the type of amount (Actual, Budget, Reservation, Commitment, Statistical) the transaction.",
			                AD_Reference_ID=DisplayType.List,
			                SeqNo=30,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=1,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="A",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="95c79b67-794f-7616-af1f-da9ad4113432")	
	private String m_PostingType = null;
	@XendraProcessParameter(Name="Year",
			                ColumnName="Year",
			                Description="",
			                Help="",
			                AD_Reference_ID=DisplayType.Integer,
			                SeqNo=40,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=14,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="d6acaf24-3edf-1ed5-5292-9b343d573fcf")	
	private int m_Year;
	@XendraProcessParameter(Name="Account Key",
			                ColumnName="AccountValue",
			                Description="Key of Account Element",
			                Help="",
			                AD_Reference_ID=DisplayType.String,
			                SeqNo=50,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=20,
			                IsMandatory=true,
			                IsRange=true,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="d8d78749-972d-a806-ee78-482a06c325c6")	
	private int m_AccountValue_From;
	private int m_AccountValue_To;
	@XendraProcessParameter(Name="DateAcctClose",
			                ColumnName="DateAcctClose",
			                Description="Accounting Date",
			                Help="The Accounting Date indicates the date to be used on the General Ledger account entries generated from this document. It is also used for any currency conversion.",
			                AD_Reference_ID=DisplayType.Date,
			                SeqNo=60,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=7,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",

			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="cec18789-a852-c604-152c-3e773e8443b4")	
	private Timestamp m_DateAcctClose = null;
	@XendraProcessParameter(Name="DateAcctOpen",
			                ColumnName="DateAcctOpen",
			                Description="Accounting Date",
			                Help="The Accounting Date indicates the date to be used on the General Ledger account entries generated from this document. It is also used for any currency conversion.",
			                AD_Reference_ID=DisplayType.Date,
			                SeqNo=70,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=7,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="12b061a7-55f6-d0e5-32a7-68503cf5563a")	
	private Timestamp m_DateAcctOpen = null;
	@XendraProcessParameter(Name="Document Type",
			                ColumnName="C_DocType_ID",
			                Description="Document type or rules",
			                Help="The Document Type determines document sequence and processing rules",
			                AD_Reference_ID=DisplayType.TableDir,
			                SeqNo=80,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=10,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="c8ebedda-239f-58e9-16b9-175f4d487319")	
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
			else if (name.equals("PostingType")) {
				m_PostingType = (String)para[i].getParameter();
			}
			else if (name.equals("Year")) {
				m_Year = para[i].getParameterAsInt();
			}
			else if (name.equals("AccountValue")) {
				m_AccountValue_From = para[i].getParameterAsInt();
				m_AccountValue_To = para[i].getParameter_ToAsInt();
			}
			else if (name.equals("DateAcctClose")) {
				m_DateAcctClose = (Timestamp)para[i].getParameter();
			}
			else if (name.equals("DateAcctOpen")) {
				m_DateAcctOpen = (Timestamp)para[i].getParameter();
			}
			else if (name.equals("C_DocType_ID")) {
				m_C_DocType_ID = para[i].getParameterAsInt();
			}
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}
	protected String doIt() throws Exception {
		MAccount acctFrom = MAccount.get(getCtx(), m_AccountValue_From);		
		MAccount acctTo = MAccount.get(getCtx(), m_AccountValue_To);
		String range = null;
		if (!acctFrom.equals(acctTo))
			range = " Desde la Cuenta " +      acctFrom.getAccount().getValue()+" ("+acctFrom.getAccount().getDescription()+")"+" Hasta la Cuenta "+ acctTo.getAccount().getValue()+" ("+acctTo.getAccount().getDescription()+")";
		else
			range = " Cuenta " + acctFrom.getAccount().getValue()+" ("+acctFrom.getAccount().getDescription()+")";

		String sqlcount = "SELECT COUNT(*) as count ";
		
		String sqlfields = 
			
			"SELECT " +
			"AD_Org_ID," +
			"Account_ID," +
			"CASE WHEN (AmtAcctDr>AmtAcctCr) THEN (AmtAcctDr-AmtAcctCr) ELSE 0 END AS AmtAcctDr," +
			"CASE WHEN (AmtAcctDr<AMtAcctCr) THEN (AmtAcctCr-AmtAcctDr) ELSE 0 END AS AmtAcctCr," +
			"AmtAcctDr-AmtAcctCr as diff," +
			"serial," +
			"invoicedocumentno, " +						
			"M_Product_ID," +
			"C_BPartner_ID " ;
			
		
		String sqlfrom = 
		
                     " FROM " +
                     	"(" +
                     	
                     "	SELECT f.AD_Org_ID, " +
                	 "	f.Account_ID," +
                	 " SUM(f.AmtAcctDr) AS AmtAcctDr," +
                	 " 	SUM(f.AmtAcctCr) AS AmtAcctCr,	" +	
                	 " 	f.Serial," +
                	 " 	f.InvoiceDocumentNo," + 
                	 " 	f.C_BPartner_ID, " +
                	 " 	0 AS M_Product_ID," +
                	 " 	typegroupingclose " +
                	 " 	FROM Fact_Acct f INNER JOIN C_ElementValue ev " + 
                	 " 	ON (f.Account_ID=ev.C_ElementValue_ID) " +
                	 " 	WHERE f.AD_Client_ID=" + m_AD_Client_ID +
                	 " 	AND f.C_AcctSchema_ID=" + m_C_AcctSchema_ID +
                	 " 	AND f.DateAcct>='"+m_Year+"-01-01' " +
                	 " 	AND f.DateAcct<'"+(m_Year+1)+"-01-01' " +
                	 " 	AND f.PostingType='" + m_PostingType +"'"+
                	 " 	AND ev.Value >= '" + acctFrom.getAccount().getValue() + "'" + 
                	 " 	AND ev.Value <= '" + acctTo.getAccount().getValue() + "'" +
                	 " 	AND typegroupingclose = 'D' " +
                	 " 	GROUP BY " +
                	 " 	f.Account_ID, " +
                	 " 	f.C_BPartner_ID, " +
                	 " 	f.Serial, " +
                	 " 	f.InvoiceDocumentNo, " +
                	 " 	typegroupingclose, " +
                	 " 	f.AD_Org_ID " +
                	 "" +
                	 "  UNION " +
                	 "" +
                	 " 	SELECT f.AD_Org_ID, " +
                	 " 	f.Account_ID, " +
                	 " 	SUM(f.AmtAcctDr) AS AmtAcctDr, " +
                	 " 	SUM(f.AmtAcctCr) AS AmtAcctCr, " +		
                	 " 	'' AS Serial, " +
                	 " 	'' AS InvoiceDocumentNo, " +
                	 " 	f.C_BPartner_ID, " +
                	 " 	0 AS M_Product_ID, " +
                	 " 	typegroupingclose " +
                	 " 	FROM Fact_Acct f INNER JOIN C_ElementValue ev " + 
                	 " 	ON (f.Account_ID=ev.C_ElementValue_ID) " +
                	 " 	WHERE f.AD_Client_ID=" + m_AD_Client_ID +
                	 " 	AND f.C_AcctSchema_ID="+m_C_AcctSchema_ID+
                	 " 	AND f.DateAcct>='"+m_Year+"-01-01' " +
                	 " 	AND f.DateAcct<'"+(m_Year+1)+"-01-01' " +
                	 " 	AND f.PostingType='" + m_PostingType +"'"+
                	 " 	AND ev.Value >= '" + acctFrom.getAccount().getValue() + "'" + 
                	 " 	AND ev.Value <= '" + acctTo.getAccount().getValue() + "'" +
                	 " 	AND typegroupingclose = 'B' " +
                	 " 	GROUP BY f.Account_ID, " +
                	 " 	f.C_BPartner_ID, " +
                	 " 	typegroupingclose, " +
                	 " 	f.AD_Org_ID  " +
                	 "" +
                	 " 	UNION ALL " +
                	 "" +
                	 " 	SELECT f.AD_Org_ID, " +
                	 " 	f.Account_ID, " +
                	 " 	SUM(f.AmtAcctDr) AS AmtAcctDr, " +
                	 " 	SUM(f.AmtAcctCr) AS AmtAcctCr, " +		
                	 " 	'' AS Serial, " +
                	 " 	'' AS InvoiceDocumentNo, " + 
                	 " 	0 AS C_BPartner_ID, " +
                	 " 	f.M_Product_ID, " +
                	 " 	typegroupingclose  " +
                	 " 	FROM Fact_Acct f INNER JOIN C_ElementValue ev " + 
                	 " 	ON (f.Account_ID=ev.C_ElementValue_ID) " +
                	 " 	WHERE f.AD_Client_ID=" + m_AD_Client_ID +
                	 " 	AND f.C_AcctSchema_ID="+m_C_AcctSchema_ID+
                	 " 	AND f.DateAcct>='"+m_Year+"-01-01' " +
                	 " 	AND f.DateAcct<'"+(m_Year+1)+"-01-01' " +
                	 " 	AND f.PostingType='" + m_PostingType +"'"+
                	 " 	AND ev.Value >= '" + acctFrom.getAccount().getValue() + "'" + 
                	 " 	AND ev.Value <= '" + acctTo.getAccount().getValue() + "'" +
                	 " 	AND typegroupingclose = 'P' " +
                	 " 	GROUP BY f.Account_ID, " +
                	 " 	f.M_Product_ID, " +
                	 " 	typegroupingclose, " +
                	 " 	f.AD_Org_ID " +
                	 "" +
                	 " UNION ALL " +
                	 "" +
                	 " 	SELECT f.AD_Org_ID, " +
                	 " 	f.Account_ID, " +
                	 " 	SUM(f.AmtAcctDr) AS AmtAcctDr, " +
                	 " 	SUM(f.AmtAcctCr) AS AmtAcctCr, " +
                	 " 	'' AS Serial, " +
                	 " 	'' AS InvoiceDocumentNo, " + 
                	 " 	0 AS C_BPartner_ID,  " +
                	 " 	0 AS M_Product_ID, " +
                	 " 	typegroupingclose " +
                	 " 	FROM Fact_Acct f INNER JOIN C_ElementValue ev " + 
                	 " 	ON (f.Account_ID=ev.C_ElementValue_ID) " +
                	 " 	WHERE f.AD_Client_ID=" + m_AD_Client_ID +
                	 " 	AND f.C_AcctSchema_ID="+m_C_AcctSchema_ID +
                	 " 	AND f.DateAcct>='"+m_Year+"-01-01' " +
                	 " 	AND f.DateAcct<'"+(m_Year+1)+"-01-01' " +
                	 " 	AND f.PostingType='" + m_PostingType +"'"+
                	 " 	AND ev.Value >= '" + acctFrom.getAccount().getValue() + "'" + 
                	 " 	AND ev.Value <= '" + acctTo.getAccount().getValue() + "'" +
                	 " 	AND typegroupingclose = 'N' " +
                	 " 	GROUP BY f.Account_ID, " +
                	 " 	typegroupingclose, " +
                	 " 	f.AD_Org_ID  " +
                	 "  ) " +
                	 " AS foo WHERE AmtAcctDr!=AmtAcctCr ";                      			
		
		PreparedStatement pstmt = DB.prepareStatement(sqlcount.concat(sqlfrom), get_TrxName());
		//pstmt.setInt(1, m_AD_Client_ID);
		//pstmt.setInt(2, m_C_AcctSchema_ID);
		//pstmt.setString(3, m_PostingType);
		//pstmt.setString(4, acctFrom.getAccount().getValue());
		//pstmt.setString(5, acctTo.getAccount().getValue());
		
		ResultSet rs = pstmt.executeQuery();
		
		int count = 0;
		if (rs.next())
			count = rs.getInt("count");
		
		rs.close();
		pstmt.close();

		if (count == 0)
			return "En el rango seleccionado no se encontraron saldos a trasladar";
		
		pstmt = DB.prepareStatement(sqlfields.concat(sqlfrom), get_TrxName());
//		pstmt.setInt(1, m_AD_Client_ID);
//		pstmt.setInt(2, m_C_AcctSchema_ID);
//		pstmt.setString(3, m_PostingType);
//		pstmt.setString(4, acctFrom.getAccount().getValue());
//		pstmt.setString(5, acctTo.getAccount().getValue());
		
		rs = pstmt.executeQuery();
		
		MPeriod periodClose = MPeriod.get(getCtx(), m_DateAcctClose);
		MPeriod periodOpen = MPeriod.get(getCtx(), m_DateAcctOpen);
		MDocType docType = new MDocType(getCtx(), m_C_DocType_ID, get_TrxName());
		MAcctSchema schema = new MAcctSchema(getCtx(), m_C_AcctSchema_ID, get_TrxName());

		MJournalBatch batchClose = new MJournalBatch(getCtx(), 0, get_TrxName());
		batchClose.setDescription("Cierre año " + m_Year + range);
		batchClose.setDateDoc(m_DateAcctClose);
		batchClose.setDateAcct(m_DateAcctClose);
		batchClose.setC_Period_ID(periodClose.get_ID());
		batchClose.setC_DocType_ID(m_C_DocType_ID);
		batchClose.setC_Currency_ID(schema.getC_Currency_ID());
		batchClose.setGL_Category_ID(docType.getGL_Category_ID());
		if (!batchClose.save()) return "@Error@ "+CLogger.retrieveErrorString(null); 

		MJournalBatch batchOpen = new MJournalBatch(getCtx(), 0, get_TrxName());
		batchOpen.setDescription("Apertura año " + (m_Year+1) + range);
		batchOpen.setDateDoc(m_DateAcctOpen);
		batchOpen.setDateAcct(m_DateAcctOpen);
		batchOpen.setC_Period_ID(periodOpen.get_ID());
		batchOpen.setC_DocType_ID(m_C_DocType_ID);
		batchOpen.setC_Currency_ID(schema.getC_Currency_ID());
		batchOpen.setGL_Category_ID(docType.getGL_Category_ID());
		if (!batchOpen.save()) return "@Error@ "+CLogger.retrieveErrorString(null);
 
		MJournal journalClose = new MJournal(batchClose);
		journalClose.setDescription("Cierre año " + m_Year + range);
		journalClose.setC_AcctSchema_ID(m_C_AcctSchema_ID);
		journalClose.setGL_Category_ID(docType.getGL_Category_ID());
		journalClose.setC_ConversionType_ID(MConversionType.getDefault(m_AD_Client_ID));
		journalClose.setIsCloseDocument(true);
		if (!journalClose.save()) return "@Error@ "+CLogger.retrieveErrorString(null);

		MJournal journalOpen = new MJournal(batchOpen);
		journalOpen.setDescription("Apertura año " + (m_Year+1) + range);
		journalOpen.setC_AcctSchema_ID(m_C_AcctSchema_ID);
		journalOpen.setGL_Category_ID(docType.getGL_Category_ID());
		journalOpen.setC_ConversionType_ID(MConversionType.getDefault(m_AD_Client_ID));
		if (!journalOpen.save()) return "@Error@ "+CLogger.retrieveErrorString(null);

		BigDecimal diff = Env.ZERO;
		int AD_Org_ID = 0;
		MAccount acct = null;
		while (rs.next()) {
			
			AD_Org_ID = rs.getInt("AD_Org_ID");
			int C_ElementValue_ID = rs.getInt("Account_ID");
			BigDecimal AmtAcctDr = rs.getBigDecimal("AmtAcctDr");
			BigDecimal AmtAcctCr = rs.getBigDecimal("AmtAcctCr");
			int C_BPartner_ID   = rs.getInt("C_BPartner_ID");
			String Serial = rs.getString("serial");
			String DocumentNo = rs.getString("invoicedocumentno");
			int M_Product_ID = rs.getInt("M_Product_ID");
			
			acct = MAccount.get(getCtx(), m_AD_Client_ID, AD_Org_ID, m_C_AcctSchema_ID, C_ElementValue_ID, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
			
			MJournalLine lineClose = new MJournalLine(journalClose);
			lineClose.setAD_Org_ID(AD_Org_ID);
			lineClose.setAmtAcct(AmtAcctCr, AmtAcctDr);
			lineClose.setAmtSourceDr(AmtAcctCr);
			lineClose.setAmtSourceCr(AmtAcctDr);
			lineClose.setC_ValidCombination_ID(acct);
			lineClose.setSerial(Serial);
			lineClose.setReferenceNo(DocumentNo);
			lineClose.setC_BPartner_ID(C_BPartner_ID);
			if (M_Product_ID > 0)
				lineClose.setM_Product_ID(M_Product_ID);
			if (!lineClose.save()) return "@Error@ "+CLogger.retrieveErrorString(null);

			
			MJournalLine lineOpen = new MJournalLine(journalOpen);
			lineOpen.setAD_Org_ID(AD_Org_ID);
			lineOpen.setAmtAcct(AmtAcctDr, AmtAcctCr);
			lineOpen.setAmtSourceDr(AmtAcctDr);
			lineOpen.setAmtSourceCr(AmtAcctCr);
			lineOpen.setC_ValidCombination_ID(acct);
			lineOpen.setSerial(Serial);
			lineOpen.setReferenceNo(DocumentNo);		
			lineOpen.setC_BPartner_ID(C_BPartner_ID);
			if (M_Product_ID > 0)
				lineOpen.setM_Product_ID(M_Product_ID);
			if (!lineOpen.save()) return "@Error@ "+CLogger.retrieveErrorString(null);

			diff = diff.add(rs.getBigDecimal("diff"));
		}
		boolean isDR = diff.signum() == -1;
		BigDecimal difference = diff.abs();		
		MAcctSchemaGL sgl = MAcctSchemaGL.get(Env.getCtx(), schema.getC_AcctSchema_ID());
		if (!isDR) {
			MJournalLine lineClose = new MJournalLine(journalClose);
			lineClose.setAD_Org_ID(AD_Org_ID);
			lineClose.setAmtAcct(difference, Env.ZERO);
			lineClose.setAmtSourceDr(difference);
			lineClose.setAmtSourceCr(Env.ZERO);
			lineClose.setC_ValidCombination_ID(sgl.getRetainedEarning_Acct());
			if (!lineClose.save()) return "@Error@ "+CLogger.retrieveErrorString(null);

			MJournalLine lineOpen = new MJournalLine(journalOpen);
			lineOpen.setAD_Org_ID(AD_Org_ID);
			lineOpen.setAmtAcct(Env.ZERO, difference);
			lineOpen.setAmtSourceDr(Env.ZERO);
			lineOpen.setAmtSourceCr(difference);				
			lineOpen.setC_ValidCombination_ID(sgl.getSuspenseBalancing_Acct());
			if (!lineOpen.save()) return "@Error@ "+CLogger.retrieveErrorString(null);				
		}
		else {
			MJournalLine lineClose = new MJournalLine(journalClose);
			lineClose.setAD_Org_ID(AD_Org_ID);
			lineClose.setAmtAcct(Env.ZERO, difference);
			lineClose.setAmtSourceDr(Env.ZERO);
			lineClose.setAmtSourceCr(difference);				
			lineClose.setC_ValidCombination_ID(sgl.getSuspenseBalancing_Acct());
			if (!lineClose.save()) return "@Error@ "+CLogger.retrieveErrorString(null);

			MJournalLine lineOpen = new MJournalLine(journalOpen);
			lineOpen.setAD_Org_ID(AD_Org_ID);
			lineOpen.setAmtAcct(difference, Env.ZERO);
			lineOpen.setAmtSourceDr(difference);
			lineOpen.setAmtSourceCr(Env.ZERO);								
			lineOpen.setC_ValidCombination_ID(sgl.getRetainedEarning_Acct());
			if (!lineOpen.save()) return "@Error@ "+CLogger.retrieveErrorString(null);				
		}			
		return "@Ok@";
	}

}
