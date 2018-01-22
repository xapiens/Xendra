/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
 * Copyright (C) 1999-2006 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *                                                                            *
 *                                                                            *
 *  @author xapiens 28-08-2012                                                *
 *  se obtiene el saldo convertido a la fecha del documento, menos el saldo   *
 *  convertido a la fecha de cierre, si existen diferencias se considera para *
 *  el asiento de cierre.													  *
 *  se esta agregando que la conversion si el año del documento es menor al   *
 *  año de cierre, debe convertir a la fecha indicada de cierre del año del   *
 *  documento, es decir, si una factura del 2007, esta pendiente, y el año de *
 *  cierre es 2011, no se convertira a la fecha del documento, sino a la fecha*
 *  indicada en el cierre del 2007 para el proceso.							  *  
 *****************************************************************************/
package org.xendra.process;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import org.compiere.model.MAcctSchema;
import org.compiere.model.MBOE;
import org.compiere.model.MConversionType;
import org.compiere.model.MCurrency;
import org.compiere.model.MDocType;
import org.compiere.model.MJournalBatch;
import org.compiere.model.MJournal;
import org.compiere.model.MJournalLine;
import org.compiere.model.persistence.X_GL_Exchange;
import org.compiere.process.DocAction;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.xendra.exceptions.XendraException;

public class ExchangeDifferenceProcess extends SvrProcess {
	private int m_AD_Org_ID;
	private int m_AD_Client_ID;
	private int m_GL_Exchange_ID;
	private int m_C_DocType_ID = 0;
	private X_GL_Exchange exchange;
	private Timestamp conversionDate;
	private int C_Currency_ID;
	private static String Ok = "@Ok@";
	private MAcctSchema ass;

	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("AD_Org_ID"))
				m_AD_Org_ID = para[i].getParameterAsInt();
			else if (name.equals("AD_Client_ID"))
				m_AD_Client_ID = para[i].getParameterAsInt();
			else if (name.equals("GL_Exchange_ID")) 
				m_GL_Exchange_ID = para[i].getParameterAsInt();
			else if (name.equals("C_DocType_ID"))
				m_C_DocType_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}

	protected String doIt() throws Exception {
		String error = null;
		exchange = new X_GL_Exchange(Env.getCtx(), m_GL_Exchange_ID, null);
		conversionDate = exchange.getConversionDate();
		ass = MAcctSchema.get(Env.getCtx(), exchange.getC_AcctSchema_ID());
		C_Currency_ID = ass.getC_Currency_ID();
		String sql = "SELECT distinct i.c_currency_id  FROM C_INVOICE i WHERE i.DateInvoiced <= ? AND grandTotal > 0 AND Docstatus = 'CO' AND C_Currency_ID != ?";
		try {
			if (conversionDate == null)
			{
				throw new Exception("fecha de conversion es obligatorio");
			}			
			PreparedStatement pstmt = null;
			ResultSet rs = null;			
			pstmt = DB.prepareStatement(sql, null);
			pstmt.setDate(1, new Date(conversionDate.getTime()));
			pstmt.setInt(2, C_Currency_ID);
			rs = pstmt.executeQuery();

			// por cada moneda diferente a la del esquema contable , elabora un asiento
			//
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
			error = e.getMessage();
		}
		finally 
		{
		}
		exchange = null;
		ass = null;
		conversionDate = null;		
		return error;
	}

	protected String generateJournal(Integer C_Currency)
	{				
		String sAssCurrency = String.valueOf(C_Currency_ID);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String sql = "";
		String error = "";
		// first stage - check all data is consistent
		StringBuilder checksql = new StringBuilder()
		.append(" SELECT DISTINCT ct.name  ")
		.append("  FROM C_Invoice_v i join c_doctype d ON i.c_doctype_id = d.c_doctype_id 	")
		.append("  JOIN c_conversiontype ct on d.c_conversiontypeclose_id = ct.c_conversiontype_id ")
		.append(" WHERE i.C_Currency_ID = ? AND grandTotal != 0  AND Docstatus = 'CO' ")
		.append("  AND i.DateInvoiced <= ? ")
		.append(" AND COALESCE(d.C_ConversionTypeClose_ID,0) != 0 AND i.AD_Org_ID  = ? ") 
		.append(" AND currencyrate(i.c_doctype_id, i.c_currency_id, ?, ?,d.C_ConversionTypeClose_ID,i.AD_Client_ID,i.AD_Org_ID) ISNULL "); 
		try {		
			int no = 1;
			PreparedStatement localstmt = DB.prepareStatement(checksql.toString(), get_TrxName());
			localstmt.setInt(no++, C_Currency);
			localstmt.setDate(no++, new Date(conversionDate.getTime()));
			localstmt.setInt(no++, m_AD_Org_ID);			
			localstmt.setInt(no++, C_Currency_ID);
			localstmt.setDate(no++, new Date(conversionDate.getTime()));			
			ResultSet localrs = localstmt.executeQuery();
			List<String> tc = new ArrayList<String>();
			while (localrs.next()) {		
				tc.add(localrs.getString("name"));				
			}
			if (tc.size() > 0) {
				for (String t:tc) {
					if (error.length() > 0)
						error += ",";					
					error += t;
				}
				MCurrency c = MCurrency.get(Env.getCtx(), C_Currency);
				error += String.format(" %s ",c.getDescription());
				error += df.format(conversionDate);
				error += " not found";
				return error;
			}
		} catch (Exception e) {

		}		
		error = Ok;
		//
		sql += "SELECT foo.serial, foo.C_DocType_ID,";
		sql += "foo.DocumentNo,";
		sql += "foo.C_BPartner_ID,";
		sql += "foo.C_Invoice_ID,";
		sql += "foo.DateInvoiced,";
		sql += "foo.GrandTotal,";
		sql += "foo.issotrx,";
		sql += "'' as DocStatus,";
		sql += "true as isinvoice,";
		sql += "foo.ConvertedOpenAtDateCreated,";
		sql += "foo.ConvertedOpenAtDateLast,";
		sql += "ABS(ConvertedOpenAtDateLast)-ABS(ConvertedOpenAtDateCreated) as diff,";
		sql += "0 as C_BankAccount_ID FROM "; 
		sql += "(";		
		sql += "SELECT i.Serial, i.C_DocType_ID ,i.DocumentNo, i.C_BPartner_ID,  i.C_Invoice_ID,i.DateInvoiced,i.grandtotal,i.issotrx,";
		sql += "currencyRound( invoiceOpenToDate(";
		sql += "C_Invoice_ID,C_InvoicePaySchedule_ID, ?)"; // fecha
		sql += "* currencyrate(i.c_doctype_id, i.c_Currency_id, "+sAssCurrency+", i.DateInvoiced,?, i.c_ConversionType_ID,"; // fecha
		sql += "i.AD_Client_ID,i.AD_Org_ID), "+sAssCurrency+", 'N')";
		sql += "* i.MultiplierAP AS ConvertedOpenAtDateCreated,";
		sql += "currencyRound( "; 
		sql += "invoiceOpenToDate(C_Invoice_ID, C_InvoicePaySchedule_ID, ?)"; // fecha 		
		sql += "* currencyrate(i.c_doctype_id, i.c_currency_id, "+sAssCurrency+", ?,"; // fecha		
		sql += "d.C_ConversionTypeClose_ID,";
		sql += "i.AD_Client_ID,i.AD_Org_ID), "+sAssCurrency+", 'N')";
		sql += "* i.MultiplierAP AS ConvertedOpenAtDateLast ";
		sql += " FROM C_Invoice_v i join c_doctype d ON i.c_doctype_id = d.c_doctype_id "; 
		sql += "WHERE i.C_Currency_ID = ?"; // moneda  
		sql += "AND grandTotal != 0  AND Docstatus = 'CO'  AND i.DateInvoiced <= ? "; // fecha
		sql += "AND COALESCE(d.C_ConversionTypeClose_ID,0) != 0 ";
		sql += "AND i.AD_Org_ID  = ? ) as foo ";
		sql += "WHERE (ABS(ConvertedOpenAtDateCreated) - ABS(ConvertedOpenAtDateLast)) != 0";

		sql = sql.concat(" UNION  ALL ");

		sql += "SELECT '',foo.C_DocType_ID,";
		sql += "foo.DocumentNo,";
		sql += "foo.C_BPartner_ID,";
		sql += "foo.C_BOE_ID,";
		sql += "foo.DateBOE,";
		sql += "foo.grandtotal,";
		sql += "foo.issotrx,";
		sql += "foo.docstatus,";
		sql += "false as isinvoice,"; 
		sql += "foo.ConvertedOpenAtDateCreated,";
		sql += "foo.ConvertedOpenAtDateLast,";
		sql += "ABS(ConvertedOpenAtDateLast) - ABS(ConvertedOpenAtDateCreated) as diff, ";
		sql += "foo.C_BankAccount_ID";
		sql += " FROM (";
		sql += "SELECT '',b.C_DocType_ID,";
		sql += "b.DocumentNo,";
		sql += "b.C_BPartner_ID,";
		sql += "b.C_BOE_ID,";
		sql += "COALESCE(b.StatusDate, b.DateBOE) AS DateBOE,";
		sql += "b.grandtotal,b.issotrx,docstatus,";
		sql += "currencyRound(BoeOpenAtDate(C_BOE_ID, ? )";
		sql += " * currencyrate(b.c_doctype_id, b.C_Currency_ID,"+sAssCurrency+", COALESCE(b.StatusDate, b.DateBOE),?,";
		sql += "b.C_ConversionType_ID,b.AD_Client_ID,b.AD_Org_ID), "+sAssCurrency+", 'N') * CASE WHEN b.IsSOTrx='Y' THEN 1 ELSE -1 END as ConvertedOpenAtDateCreated,";
		sql += "currencyRound(BoeOpenAtDate(C_BOE_ID, ?) * currencyrate(b.c_doctype_id, b.C_Currency_ID,308, ?, "; // fecha fecha
		//sql += "b.C_ConversionType_ID,";
		sql += "d.C_ConversionTypeClose_ID,";
		sql += "b.AD_Client_ID,b.AD_Org_ID), "+sAssCurrency+", 'N') * CASE WHEN b.IsSOTrx='Y' THEN 1 ELSE -1 END as ConvertedOpenAtDateLast,";
		sql += "b.C_BankAccount_ID ";
		sql += " FROM C_BOE b ";
		sql += " JOIN c_doctype d ON b.c_doctype_id = d.c_doctype_id ";
		sql += "WHERE b.C_Currency_ID = ? AND grandTotal != 0 AND Docstatus != 'DR'"; // moneda
		sql += "AND b.DateBOE <= ? "; // fecha
		sql += "AND COALESCE(d.C_ConversionTypeClose_ID,0) != 0 ";
		sql += "AND b.AD_Org_ID  = ?"; // organizacion
		sql += ") as foo where (ABS(ConvertedOpenAtDateCreated) - ABS(ConvertedOpenAtDateLast)) != 0";
		try {		
			int no = 1;
			// Invoice
			PreparedStatement localstmt = DB.prepareStatement(sql, get_TrxName());
			localstmt.setDate(no++, new Date(conversionDate.getTime()));			
			localstmt.setDate(no++, new Date(conversionDate.getTime()));
			localstmt.setDate(no++, new Date(conversionDate.getTime()));
			localstmt.setDate(no++, new Date(conversionDate.getTime()));
			localstmt.setInt(no++, C_Currency); 
			localstmt.setDate(no++, new Date(conversionDate.getTime()));
			localstmt.setInt(no++, m_AD_Org_ID);
			// BOE
			localstmt.setDate(no++, new Date(conversionDate.getTime()));
			localstmt.setDate(no++, new Date(conversionDate.getTime()));
			localstmt.setDate(no++, new Date(conversionDate.getTime()));
			localstmt.setDate(no++, new Date(conversionDate.getTime()));
			localstmt.setInt(no++, C_Currency);			
			localstmt.setDate(no++, new Date(conversionDate.getTime()));
			localstmt.setInt(no++, m_AD_Org_ID);			
			//
			ResultSet localrs = localstmt.executeQuery();

			if (localrs.isBeforeFirst())
			{
				MDocType docType = new MDocType(getCtx(), m_C_DocType_ID, get_TrxName());

				MJournalBatch jbatch = new MJournalBatch(getCtx(), 0, get_TrxName());
				jbatch.setDescription(exchange.getName().concat(" "+MCurrency.get(Env.getCtx(), C_Currency).getDescription()));
				jbatch.setDateDoc(new Timestamp(System.currentTimeMillis()));
				jbatch.setDateAcct(exchange.getConversionDate());
				jbatch.setC_Period_ID(exchange.getC_Period_ID());
				jbatch.setC_DocType_ID(m_C_DocType_ID);
				jbatch.setC_Currency_ID(C_Currency_ID);
				jbatch.setGL_Category_ID(docType.getGL_Category_ID());
				if (!jbatch.save()) return "@Error@ saving Closing Journal Batch";

				MJournal journal = new MJournal(jbatch);
				journal.setDescription("Ajuste " + exchange.getName());
				journal.setC_AcctSchema_ID(ass.getC_AcctSchema_ID());
				journal.setGL_Category_ID(docType.getGL_Category_ID());
				journal.setC_ConversionType_ID(MConversionType.getDefault(m_AD_Client_ID));
				if (!journal.save()) return "@Error@ saving Closing Journal";

				while (localrs.next()) {
					Boolean IsSOTrx = "Y".equals(localrs.getString("IsSOTrx"));
					BigDecimal difference = localrs.getBigDecimal("Diff");
					Boolean IsInvoice = localrs.getBoolean("isinvoice");
					String Serial = localrs.getString("Serial");
					String docstatus = localrs.getString("DocStatus");
					Integer C_DocType_ID = localrs.getInt("C_DocType_ID");
					Integer C_BPartner_ID = localrs.getInt("C_BPartner_ID");
					Integer C_BankAccount_ID = localrs.getInt("C_BankAccount_ID");
					int receivables_ID = 0;
					int payables_ID = 0;
					int Account_ID = 0;
					if (IsInvoice)
					{
						receivables_ID = DB.getSQLValue(null,"SELECT C_Receivable_Acct FROM C_BP_Customer_Acct WHERE C_BPartner_ID=? AND C_AcctSchema_ID=?",C_BPartner_ID, ass.getC_AcctSchema_ID());
						payables_ID = DB.getSQLValue(null,"SELECT V_Liability_Acct FROM C_BP_Vendor_Acct WHERE C_BPartner_ID=? AND C_AcctSchema_ID=?",C_BPartner_ID, ass.getC_AcctSchema_ID());						
					}
					else
					{
						if (IsSOTrx)
						{
							if (C_BankAccount_ID > 0 && !docstatus.toUpperCase().equals(DocAction.STATUS_Portfolio))
							{							
								Account_ID = DB.getSQLValue(null,"SELECT "+"boe_"+docstatus.trim()+"_acct FROM C_BankAccount_Acct WHERE C_BankAccount_ID=? AND C_AcctSchema_ID=?",C_BankAccount_ID, ass.getC_AcctSchema_ID());
							}
							if (Account_ID == 0)
							{
								Account_ID = MBOE.getAccountID(ass, docstatus, IsSOTrx);								
							}
						}
						else
						{
							Account_ID = DB.getSQLValue(null,"SELECT boe_vendor_acct FROM C_boe_Acct WHERE C_AcctSchema_ID=?", ass.getC_AcctSchema_ID());							
						}
					}

					String DocumentNo = localrs.getString("DocumentNo");

					BigDecimal AmtAcctCr = Env.ZERO;
					BigDecimal AmtAcctDr = Env.ZERO;
					int acct = 0;
					if (IsSOTrx) // ventas
					{
						if ( difference.compareTo(Env.ZERO) > 0) // ganancia
						{
							AmtAcctDr = difference;
							acct = exchange.getRealizedGain_Acct();
						}								
						else
						{
							AmtAcctCr = difference.abs();
							acct = exchange.getRealizedLoss_Acct();
						}
					}
					else // compras 
					{
						if ( difference.compareTo(Env.ZERO) > 0) // perdida
						{
							AmtAcctCr = difference;
							acct = exchange.getRealizedLoss_Acct();
						}								
						else
						{
							AmtAcctDr = difference.abs();
							acct = exchange.getRealizedGain_Acct();
						}						
					}
					MJournalLine jline = new MJournalLine(journal);
					jline.setAD_Org_ID(m_AD_Org_ID);
					jline.setAmtAcct(AmtAcctCr, AmtAcctDr);
					jline.setAmtSourceDr(AmtAcctCr);
					jline.setAmtSourceCr(AmtAcctDr);
					jline.setC_ValidCombination_ID(acct);
					jline.setSerial(Serial);
					jline.setReferenceNo(DocumentNo);
					jline.setC_BPartner_ID(C_BPartner_ID);
					if (!jline.save()) return "@Error@ saving Closing Journal line";
					//					
					if (AmtAcctCr.compareTo(Env.ZERO) != 0)
					{
						AmtAcctDr = AmtAcctCr;
						AmtAcctCr = Env.ZERO;
					}
					else
					{
						AmtAcctCr = AmtAcctDr;
						AmtAcctDr = Env.ZERO;	
					}
					if (IsInvoice)
						if (IsSOTrx) // ventas
							acct = receivables_ID; 
						else
							acct = payables_ID;
					else
						acct = Account_ID;

					MJournalLine jlinedoc = new MJournalLine(journal);
					jlinedoc.setAD_Org_ID(m_AD_Org_ID);
					jlinedoc.setAmtAcct(AmtAcctCr, AmtAcctDr);
					jlinedoc.setAmtSourceDr(AmtAcctCr);
					jlinedoc.setAmtSourceCr(AmtAcctDr);
					jlinedoc.setC_ValidCombination_ID(acct);
					jlinedoc.setSerial(Serial);
					jlinedoc.setReferenceNo(DocumentNo);
					jlinedoc.setC_BPartner_ID(C_BPartner_ID);
					if (!jlinedoc.save()) return "@Error@ saving Closing Journal line";					
				}					
			}		
			localrs.close();
			localstmt.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			error = e.getMessage();
		}		
		return error;
	}
}