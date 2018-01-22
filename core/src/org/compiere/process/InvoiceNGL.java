/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                        *
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
 *****************************************************************************/
package org.compiere.process;

import java.sql.*;
import java.util.*;
import java.util.logging.*;
import java.math.*;

import org.compiere.model.MAccount;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MAcctSchemaDefault;
import org.compiere.model.MDocType;
import org.compiere.model.MFactAcct;
import org.compiere.model.MGLCategory;
import org.compiere.model.MInvoice;
import org.compiere.model.MJournal;
import org.compiere.model.MJournalBatch;
import org.compiere.model.MJournalLine;
import org.compiere.model.MOrg;
import org.compiere.model.X_T_InvoiceGL;
import org.compiere.util.*;

import org.xendra.annotations.*;

/**
 * 	Invoice Not realized Gain & Loss.
 * 	The actual data shown is T_InvoiceGL_v
 *  @author Jorg Janke
 *  @version $Id: InvoiceNGL.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="T_InvoiceNGL",
name="Invoice Not Realized Gain/Loss",
description="Invoice Not Realized Gain & Loss Report",
help="The Report lists not fully paid invoices with open amount, the GL amounts and the revalued amounts.  If an invoice is partially paid, the percentage of the open amount is used to calculate the revaluation amount.<br>			If you select a currency, only invoices of that currency are included; if you select Include All Currencies, all invoices are included and you can use the report to reconcile your AP/AR accounts.<br>			If you select a GL Document Type, a GL Journal is created.			Note that the report only includes posted invoices.",
Identifier="be670ca3-07f9-90d4-f8d1-8a5426ae8864",
classname="org.compiere.process.InvoiceNGL",
updated="2015-06-20 10:10:12")	
public class InvoiceNGL extends SvrProcess
{
	/**	Mandatory Acct Schema			*/
	@XendraProcessParameter(Name="Accounting Schema",
			                ColumnName="C_AcctSchema_ID",
			                Description="Rules for accounting",
			                Help="An Accounting Schema defines the rules used in accounting such as costing method, currency and calendar",
			                AD_Reference_ID=DisplayType.TableDir,
			                SeqNo=10,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="9183ef77-f1ea-7332-5d8b-781fd361db7f")	
	private int				p_C_AcctSchema_ID = 0;
	/** Mandatory Conversion Type		*/
	@XendraProcessParameter(Name="Revaluation Conversion Type",
			                ColumnName="C_ConversionTypeReval_ID",
			                Description="Revaluation Currency Conversion Type",
			                Help="",
			                AD_Reference_ID=DisplayType.Table,
			                SeqNo=20,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="bbe918ab-bab4-e84a-b416-0a5516566358")	
	private int				p_C_ConversionTypeReval_ID = 0;
	/** Revaluation Date				*/
	@XendraProcessParameter(Name="Revaluation Date",
			                ColumnName="DateReval",
			                Description="Date of Revaluation",
			                Help="",
			                AD_Reference_ID=DisplayType.Date,
			                SeqNo=30,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="@#Date@",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="4b1170c9-4e09-f871-31f3-5409707708c7")	
	private Timestamp		p_DateReval = null;
	/** Only AP/AR Transactions			*/
	@XendraProcessParameter(Name="AP - AR",
			                ColumnName="APAR",
			                Description="Include Receivables and/or Payables transactions",
			                Help="",
			                AD_Reference_ID=DisplayType.List,
			                SeqNo=40,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="A",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="55861fa1-1530-ae37-c4ff-430382e9ed23")	
	private String			p_APAR = "A";
	private static String	ONLY_AP = "P";
	private static String	ONLY_AR = "R";
	/** Report all Currencies			*/
	private boolean			p_IsAllCurrencies = false;
	/** Optional Invoice Currency		*/
	@XendraProcessParameter(Name="Currency",
			                ColumnName="C_Currency_ID",
			                Description="The Currency for this record",
			                Help="Indicates the Currency to be used when processing or reporting on this record",
			                AD_Reference_ID=DisplayType.TableDir,
			                SeqNo=50,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=false,
			                IsRange=false,
			                DefaultValue="0",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="13fa8f5b-f3de-2029-60cc-17cfa62efd82")	
	private int				p_C_Currency_ID = 0;
	/** GL Document Type				*/
	@XendraProcessParameter(Name="Revaluation Document Type",
			                ColumnName="C_DocTypeReval_ID",
			                Description="Document Type for Revaluation Journal",
			                Help="",
			                AD_Reference_ID=DisplayType.Table,
			                SeqNo=60,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=false,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="c671ebf8-86c5-a1c8-9fc0-64983b1c2fd7")	
	private int				p_C_DocTypeReval_ID = 0;
	
	/**
	 *  Prepare - e.g., get Parameters.
	 */
	protected void prepare()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("C_AcctSchema_ID"))
				p_C_AcctSchema_ID = para[i].getParameterAsInt();
			else if (name.equals("C_ConversionTypeReval_ID"))
				p_C_ConversionTypeReval_ID = para[i].getParameterAsInt();
			else if (name.equals("DateReval"))
				p_DateReval = (Timestamp)para[i].getParameter();
			else if (name.equals("APAR"))
				p_APAR = (String)para[i].getParameter();
			else if (name.equals("IsAllCurrencies"))
				p_IsAllCurrencies = "Y".equals((String)para[i].getParameter());
			else if (name.equals("C_Currency_ID"))
				p_C_Currency_ID = para[i].getParameterAsInt();
			else if (name.equals("C_DocTypeReval_ID"))
				p_C_DocTypeReval_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}	//	prepare

	/**
	 * 	Process
	 *	@return info
	 *	@throws Exception
	 */
	public String doIt () throws Exception
	{
		if (p_IsAllCurrencies)
			p_C_Currency_ID = 0;
		log.info("C_AcctSchema_ID=" + p_C_AcctSchema_ID 
			+ ",C_ConversionTypeReval_ID=" + p_C_ConversionTypeReval_ID
			+ ",DateReval=" + p_DateReval 
			+ ", APAR=" + p_APAR
			+ ", IsAllCurrencies=" + p_IsAllCurrencies
			+ ",C_Currency_ID=" + p_C_Currency_ID
			+ ", C_DocType_ID=" + p_C_DocTypeReval_ID);
		
		//	Parameter
		if (p_DateReval == null)
			p_DateReval = new Timestamp(System.currentTimeMillis());
		
		//	Delete - just to be sure
		String sql = "DELETE FROM T_InvoiceGL WHERE AD_PInstance_ID=" + getAD_PInstance_ID();
		int no = DB.executeUpdate(sql, get_TrxName());
		if (no > 0)
			log.info("Deleted #" + no);
		
		//	Insert Trx
		String dateStr = DB.TO_DATE(p_DateReval, true);
		sql = "INSERT INTO T_InvoiceGL (AD_Client_ID, AD_Org_ID, IsActive, Created,CreatedBy, Updated,UpdatedBy,"
			+ " AD_PInstance_ID, C_Invoice_ID, GrandTotal, OpenAmt, "
			+ " Fact_Acct_ID, AmtSourceBalance, AmtAcctBalance, "
			+ " AmtRevalDr, AmtRevalCr, C_DocTypeReval_ID, IsAllCurrencies, "
			+ " DateReval, C_ConversionTypeReval_ID, AmtRevalDrDiff, AmtRevalCrDiff, APAR) "
			//	--
			+ "SELECT i.AD_Client_ID, i.AD_Org_ID, i.IsActive, i.Created,i.CreatedBy, i.Updated,i.UpdatedBy,"
			+  getAD_PInstance_ID() + ", i.C_Invoice_ID, i.GrandTotal, invoiceOpen(i.C_Invoice_ID, 0), "
			+ " fa.Fact_Acct_ID, fa.AmtSourceDr-fa.AmtSourceCr, fa.AmtAcctDr-fa.AmtAcctCr, " 
			//	AmtRevalDr, AmtRevalCr,
			+ " currencyConvert(fa.AmtSourceDr,0, i.C_Currency_ID, a.C_Currency_ID, " + dateStr + ", " + p_C_ConversionTypeReval_ID + ", i.AD_Client_ID, i.AD_Org_ID),"
		    + " currencyConvert(fa.AmtSourceCr,0, i.C_Currency_ID, a.C_Currency_ID, " + dateStr + ", " + p_C_ConversionTypeReval_ID + ", i.AD_Client_ID, i.AD_Org_ID),"
		    + (p_C_DocTypeReval_ID==0 ? "NULL" : String.valueOf(p_C_DocTypeReval_ID)) + ", "
		    + (p_IsAllCurrencies ? "'Y'," : "'N',")
		    + dateStr + ", " + p_C_ConversionTypeReval_ID + ", 0, 0, '" + p_APAR + "' "
		    //
		    + "FROM C_Invoice_v i"
		    + " INNER JOIN Fact_Acct fa ON (fa.AD_Table_ID=318 AND fa.Record_ID=i.C_Invoice_ID"
		    	+ " AND (i.GrandTotal=fa.AmtSourceDr OR i.GrandTotal=fa.AmtSourceCr))"
		    + " INNER JOIN C_AcctSchema a ON (fa.C_AcctSchema_ID=a.C_AcctSchema_ID) "
		    + "WHERE i.IsPaid='N'"
		    + " AND EXISTS (SELECT * FROM C_ElementValue ev "
		    	+ "WHERE ev.C_ElementValue_ID=fa.Account_ID AND (ev.AccountType='A' OR ev.AccountType='L'))"
		    + " AND fa.C_AcctSchema_ID=" + p_C_AcctSchema_ID;
		if (!p_IsAllCurrencies)
			sql += " AND i.C_Currency_ID<>a.C_Currency_ID";
		if (ONLY_AR.equals(p_APAR))
			sql += " AND i.IsSOTrx='Y'";
		else if (ONLY_AP.equals(p_APAR))
			sql += " AND i.IsSOTrx='N'";
		if (!p_IsAllCurrencies && p_C_Currency_ID != 0)
			sql += " AND i.C_Currency_ID=" + p_C_Currency_ID;
		
		no = DB.executeUpdate(sql, get_TrxName());
		if (no != 0)
			log.info("Inserted #" + no);
		else if (CLogMgt.isLevelFiner())
			log.warning("Inserted #" + no + " - " + sql);
		else 
			log.warning("Inserted #" + no);

		//	Calculate Difference
		sql = "UPDATE T_InvoiceGL gl "
			+ "SET (AmtRevalDrDiff,AmtRevalCrDiff)="
				+ "(SELECT gl.AmtRevalDr-fa.AmtAcctDr, gl.AmtRevalCr-fa.AmtAcctCr "
				+ "FROM Fact_Acct fa "
				+ "WHERE gl.Fact_Acct_ID=fa.Fact_Acct_ID) "
			+ "WHERE AD_PInstance_ID=" + getAD_PInstance_ID();
		int noT = DB.executeUpdate(sql, get_TrxName());
		if (noT > 0)
			log.config("Difference #" + noT);
		
		//	Percentage
		sql = "UPDATE T_InvoiceGL SET Percent = 100 "
			+ "WHERE GrandTotal=OpenAmt AND AD_PInstance_ID=" + getAD_PInstance_ID();
		no = DB.executeUpdate(sql, get_TrxName());
		if (no > 0)
			log.info("Not Paid #" + no);

		sql = "UPDATE T_InvoiceGL SET Percent = ROUND(OpenAmt*100/GrandTotal,6) "
			+ "WHERE GrandTotal<>OpenAmt AND GrandTotal <> 0 AND AD_PInstance_ID=" + getAD_PInstance_ID();
		no = DB.executeUpdate(sql, get_TrxName());
		if (no > 0)
			log.info("Partial Paid #" + no);

		sql = "UPDATE T_InvoiceGL SET AmtRevalDr = AmtRevalDr * Percent/100,"
			+ " AmtRevalCr = AmtRevalCr * Percent/100,"
			+ " AmtRevalDrDiff = AmtRevalDrDiff * Percent/100,"
			+ " AmtRevalCrDiff = AmtRevalCrDiff * Percent/100 "
			+ "WHERE Percent <> 100 AND AD_PInstance_ID=" + getAD_PInstance_ID();
		no = DB.executeUpdate(sql, get_TrxName());
		if (no > 0)
			log.config("Partial Calc #" + no);
		
		//	Create Document
		String info = "";
		if (p_C_DocTypeReval_ID != 0)
		{
			if (p_C_Currency_ID != 0)
				log.warning("Can't create Journal only for all currencies");
			else
				info = createGLJournal();
		}
		return "#" + noT + info;
	}	//	doIt

	/**
	 * 	Create GL Journal
	 * 	@return document info
	 */
	private String createGLJournal()
	{
		ArrayList<X_T_InvoiceGL> list = new ArrayList<X_T_InvoiceGL>();
		String sql = "SELECT * FROM T_InvoiceGL "
			+ "WHERE AD_PInstance_ID=" + getAD_PInstance_ID()
			+ " ORDER BY AD_Org_ID";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, get_TrxName());
			ResultSet rs = pstmt.executeQuery ();
			while (rs.next ())
			{
				list.add (new X_T_InvoiceGL (getCtx(), rs, get_TrxName()));
			}
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log (Level.SEVERE, sql, e);
		}
		try
		{
			if (pstmt != null)
				pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			pstmt = null;
		}
		if (list.size() == 0)
			return " - No Records found";
		
		//
		MAcctSchema as = MAcctSchema.get(getCtx(), p_C_AcctSchema_ID);
		MAcctSchemaDefault asDefaultAccts = MAcctSchemaDefault.get(getCtx(), p_C_AcctSchema_ID);
		MGLCategory cat = MGLCategory.getDefaultSystem(getCtx());
		if (cat == null)
		{
			MDocType docType = MDocType.get(getCtx(), p_C_DocTypeReval_ID);
			cat = MGLCategory.get(getCtx(), docType.getGL_Category_ID());
		}
		//
		MJournalBatch batch = new MJournalBatch(getCtx(), 0, get_TrxName());
		batch.setDescription (getName());
		batch.setC_DocType_ID(p_C_DocTypeReval_ID);
		batch.setDateDoc(new Timestamp(System.currentTimeMillis()));
		batch.setDateAcct(p_DateReval);
		batch.setC_Currency_ID(as.getC_Currency_ID());
		if (!batch.save())
			return " - Could not create Batch";
		//
		MJournal journal = null;
		BigDecimal drTotal = Env.ZERO;
		BigDecimal crTotal = Env.ZERO;
		int AD_Org_ID = 0;
		for (int i = 0; i < list.size(); i++)
		{
			X_T_InvoiceGL gl = list.get(i);
			if (gl.getAmtRevalDrDiff().signum() == 0 && gl.getAmtRevalCrDiff().signum() == 0)
				continue;
			MInvoice invoice = new MInvoice(getCtx(), gl.getC_Invoice_ID(), null);
			if (invoice.getC_Currency_ID() == as.getC_Currency_ID())
				continue;
			//
			if (journal == null)
			{
				journal = new MJournal (batch);
				journal.setC_AcctSchema_ID (as.getC_AcctSchema_ID());
				journal.setC_Currency_ID(as.getC_Currency_ID());
				journal.setC_ConversionType_ID(p_C_ConversionTypeReval_ID);
				MOrg org = MOrg.get(getCtx(), gl.getAD_Org_ID());
				journal.setDescription (getName() + " - " + org.getName());
				journal.setGL_Category_ID (cat.getGL_Category_ID());
				if (!journal.save())
					return " - Could not create Journal";
			}
			//
			MJournalLine line = new MJournalLine(journal);
			line.setLine((i+1) * 10);
			line.setDescription(invoice.getSummary());
			//
			MFactAcct fa = new MFactAcct (getCtx(), gl.getFact_Acct_ID(), null);
			line.setC_ValidCombination_ID(MAccount.get(fa));
			BigDecimal dr = gl.getAmtRevalDrDiff();
			BigDecimal cr = gl.getAmtRevalCrDiff();
			drTotal = drTotal.add(dr);
			crTotal = crTotal.add(cr);
			line.setAmtSourceDr (dr);
			line.setAmtAcctDr (dr);
			line.setAmtSourceCr (cr);
			line.setAmtAcctCr (cr);
			line.save();
			//
			if (AD_Org_ID == 0)		//	invoice org id
				AD_Org_ID = gl.getAD_Org_ID();
			//	Change in Org
			if (AD_Org_ID != gl.getAD_Org_ID())
			{
				createBalancing (asDefaultAccts, journal, drTotal, crTotal, AD_Org_ID, (i+1) * 10);
				//
				AD_Org_ID = gl.getAD_Org_ID();
				drTotal = Env.ZERO;
				crTotal = Env.ZERO;
				journal = null;
			}
		}
		createBalancing (asDefaultAccts, journal, drTotal, crTotal, AD_Org_ID, (list.size()+1) * 10);
		
		return " - " + batch.getDocumentNo() + " #" + list.size();
	}	//	createGLJournal

	/**
	 * 	Create Balancing Entry
	 *	@param asDefaultAccts acct schema default accounts
	 *	@param journal journal
	 *	@param drTotal dr
	 *	@param crTotal cr
	 *	@param AD_Org_ID org
	 *	@param lineNo base line no
	 */
	private void createBalancing (MAcctSchemaDefault asDefaultAccts, MJournal journal, 
		BigDecimal drTotal, BigDecimal crTotal, int AD_Org_ID, int lineNo)
	{
		if (journal == null)
			throw new IllegalArgumentException("Jornal is null");
		//		CR Entry = Gain
		if (drTotal.signum() != 0)
		{
			MJournalLine line = new MJournalLine(journal);
			line.setLine(lineNo+1);
			MAccount base = MAccount.get(getCtx(), asDefaultAccts.getUnrealizedGain_Acct());
			MAccount acct = MAccount.get(getCtx(), asDefaultAccts.getAD_Client_ID(), AD_Org_ID, 
				asDefaultAccts.getC_AcctSchema_ID(), base.getAccount_ID(), base.getC_SubAcct_ID(),
				base.getM_Product_ID(), base.getC_BPartner_ID(), base.getAD_OrgTrx_ID(), 
				base.getC_LocFrom_ID(), base.getC_LocTo_ID(), base.getC_SalesRegion_ID(), 
				base.getC_Project_ID(), base.getC_Campaign_ID(), base.getC_Activity_ID(),
				base.getUser1_ID(), base.getUser2_ID(), base.getUserElement1_ID(), base.getUserElement2_ID());
			line.setDescription(Msg.getElement(getCtx(), "UnrealizedGain_Acct"));
			line.setC_ValidCombination_ID(acct.getC_ValidCombination_ID());
			line.setAmtSourceCr (drTotal);
			line.setAmtAcctCr (drTotal);
			line.save();
		}
		//	DR Entry = Loss
		if (crTotal.signum() != 0)
		{
			MJournalLine line = new MJournalLine(journal);
			line.setLine(lineNo+2);
			MAccount base = MAccount.get(getCtx(), asDefaultAccts.getUnrealizedLoss_Acct());
			MAccount acct = MAccount.get(getCtx(), asDefaultAccts.getAD_Client_ID(), AD_Org_ID, 
				asDefaultAccts.getC_AcctSchema_ID(), base.getAccount_ID(), base.getC_SubAcct_ID(),
				base.getM_Product_ID(), base.getC_BPartner_ID(), base.getAD_OrgTrx_ID(), 
				base.getC_LocFrom_ID(), base.getC_LocTo_ID(), base.getC_SalesRegion_ID(), 
				base.getC_Project_ID(), base.getC_Campaign_ID(), base.getC_Activity_ID(),
				base.getUser1_ID(), base.getUser2_ID(), base.getUserElement1_ID(), base.getUserElement2_ID());
			line.setDescription(Msg.getElement(getCtx(), "UnrealizedLoss_Acct"));
			line.setC_ValidCombination_ID(acct.getC_ValidCombination_ID());
			line.setAmtSourceDr (crTotal);
			line.setAmtAcctDr (crTotal);
			line.save();
		}
	}	//	createBalancing

}	//	InvoiceNGL
