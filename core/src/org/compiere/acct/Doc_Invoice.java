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
package org.compiere.acct;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Level;

import org.compiere.model.MAccount;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MConversionRate;
import org.compiere.model.MCurrency;
import org.compiere.model.MGLBookPeriod;
import org.compiere.model.MInvoice;
import org.compiere.model.MInvoiceAdvance;
import org.compiere.model.MInvoiceAdvanceLine;
import org.compiere.model.MInvoiceLine;
import org.compiere.model.MPeriod;
import org.compiere.model.MTax;
import org.compiere.model.MYear;
import org.compiere.model.ProductCost;
import org.compiere.model.reference.REF_C_DocTypeDocBaseType;
import org.compiere.util.DB;
import org.compiere.util.Env;

/**
 * Post Invoice Documents.
 * 
 * <pre>
 *  Table:              C_Invoice (318)
 *  Document Types:     ARI, ARC, ARF, API, APC
 * </pre>
 * 
 * @author Jorg Janke
 * 
 */
public class Doc_Invoice extends Doc {
	/**
	 * Constructor
	 * 
	 * @param ass
	 *            accounting schemata
	 * @param rs
	 *            record
	 * @param trxName
	 *            trx
	 */
	protected Doc_Invoice(MAcctSchema[] ass, ResultSet rs, String trxName) {
		super(ass, MInvoice.class, rs, null, trxName);
	} // Doc_Invoice

	/** Contained Optional Tax Lines */
	private DocTax[] m_taxes = null;
	/** Currency Precision */
	private int m_precision = -1;
	/** All lines are Service */
	private boolean m_allLinesService = true;
	/** All lines are product item */
	private boolean m_allLinesItem = true;
	private String m_serial;
	private int m_C_DocType_ID = 0;
	private boolean m_IsUseAdvance = false;

	/**
	 * Load Specific Document Details
	 * 
	 * @return error message or null
	 */
	protected String loadDocumentDetails() {
		MInvoice invoice = (MInvoice) getPO();
		setSerial(invoice.getSerial());
		setDateDoc(invoice.getDateInvoiced());		
		setIsTaxIncluded(invoice.isTaxIncluded());
		// Amounts
		setAmount(Doc.AMTTYPE_Gross, invoice.getGrandTotal());
		setAmount(Doc.AMTTYPE_Net, invoice.getTotalLines());
		setAmount(Doc.AMTTYPE_Charge, invoice.getChargeAmt());

		// Contained Objects
		m_taxes = loadTaxes();
		p_lines = loadLines(invoice);
		if (m_taxes != null && p_lines != null)
			log.fine("Lines=" + p_lines.length + ", Taxes=" + m_taxes.length);
		return null;
	} // loadDocumentDetails

	private String getSerial() {
		return m_serial;
	}
	private void setSerial(String serial) {
		m_serial = serial;
	}

	/**
	 * Load Invoice Taxes
	 * 
	 * @return DocTax Array
	 */
	private DocTax[] loadTaxes() {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<DocTax> list = new ArrayList<DocTax>();

		String sql = "SELECT it.C_Tax_ID, t.Name, t.Rate, it.TaxBaseAmt, it.TaxAmt, t.IsSalesTax "
			+ "FROM C_Tax t, C_InvoiceTax it "
			+ "WHERE t.C_Tax_ID=it.C_Tax_ID AND it.C_Invoice_ID=?";
		try {
			pstmt = DB.prepareStatement(sql, getTrxName());
			pstmt.setInt(1, get_ID());
			rs = pstmt.executeQuery();
			//
			while (rs.next()) {
				int C_Tax_ID = rs.getInt(1);
				String name = rs.getString(2);
				BigDecimal rate = rs.getBigDecimal(3);
				BigDecimal taxBaseAmt = rs.getBigDecimal(4);
				BigDecimal amount = rs.getBigDecimal(5);
				boolean salesTax = "Y".equals(rs.getString(6));
				//
				DocTax taxLine = new DocTax(C_Tax_ID, name, rate, taxBaseAmt,
						amount, salesTax);
				log.fine(taxLine.toString());
				list.add(taxLine);
			}
			//
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			log.log(Level.SEVERE, sql, e);
			return null;
		} 
		finally {
			DB.close(rs, pstmt);
		}
		// Return Array
		DocTax[] tl = new DocTax[list.size()];
		list.toArray(tl);
		return tl;
	} // loadTaxes

	/**
	 * Load Invoice Line
	 * 
	 * @param invoice
	 *            invoice
	 * @return DocLine Array
	 */
	private DocLine[] loadLines(MInvoice invoice) {
		ArrayList<DocLine> list = new ArrayList<DocLine>();
		//
		MInvoiceLine[] lines = invoice.getLines(false);
		for (int i = 0; i < lines.length; i++) {
			MInvoiceLine line = lines[i];
			if (line.isDescription())
				continue;
			DocLine docLine = new DocLine(line, this);
			// Qty
			if (line.getA_Asset_ID() > 0)
				docLine.setAD_Asset_ID(line.getA_Asset_ID());

			if (line.getC_InvoiceAdvance_ID() > 0)
				docLine.setC_InvoiceAdvance_ID(line.getC_InvoiceAdvance_ID());

			BigDecimal Qty = line.getQtyInvoiced();
			boolean cm = getDocumentType().equals(REF_C_DocTypeDocBaseType.ARCreditMemo)
			|| getDocumentType().equals(REF_C_DocTypeDocBaseType.APCreditMemo);
			docLine.setQty(cm ? Qty.negate() : Qty, invoice.isSOTrx());
			//
			BigDecimal LineNetAmt = line.getLineNetAmt();
			BigDecimal PriceList = line.getPriceList();
			int C_Tax_ID = docLine.getC_Tax_ID();
			// Correct included Tax
			if (isTaxIncluded() && C_Tax_ID != 0) {
				MTax tax = MTax.get(getCtx(), C_Tax_ID);
				if (!tax.isZeroTax()) {
					BigDecimal LineNetAmtTax = tax.calculateTax(LineNetAmt,
							true, getStdPercision());
					log.fine("LineNetAmt=" + LineNetAmt + " - Tax="
							+ LineNetAmtTax);
					LineNetAmt = LineNetAmt.subtract(LineNetAmtTax);
					for (int t = 0; t < m_taxes.length; t++) {
						if (m_taxes[t].getC_Tax_ID() == C_Tax_ID) {
							m_taxes[t].addIncludedTax(LineNetAmtTax);
							break;
						}
					}
					BigDecimal PriceListTax = tax.calculateTax(PriceList, true,
							getStdPercision());
					PriceList = PriceList.subtract(PriceListTax);
				}
			} // correct included Tax
			docLine.setAmount(LineNetAmt, PriceList, Qty); // qty for discount
			// calc
			if (docLine.isItem())
				m_allLinesService = false;
			else
				m_allLinesItem = false;
			//
			log.fine(docLine.toString());
			list.add(docLine);
		}

		// Convert to Array
		DocLine[] dls = new DocLine[list.size()];
		list.toArray(dls);

		// Included Tax - make sure that no difference
		if (isTaxIncluded()) {
			for (int i = 0; i < m_taxes.length; i++) {
				if (m_taxes[i].isIncludedTaxDifference()) {
					BigDecimal diff = m_taxes[i].getIncludedTaxDifference();
					for (int j = 0; j < dls.length; j++) {
						if (dls[j].getC_Tax_ID() == m_taxes[i].getC_Tax_ID()) {
							dls[j].setLineNetAmtDifference(diff);
							break;
						}
					} // for all lines
				} // tax difference
			} // for all taxes
		} // Included Tax difference

		// Return Array
		return dls;
	} // loadLines

	/**
	 * Get Currency Percision
	 * 
	 * @return precision
	 */
	private int getStdPercision() {
		if (m_precision == -1)
			m_precision = MCurrency.getStdPrecision(getCtx(),
					getC_Currency_ID());
		return m_precision;
	} // getPrecision

	/**************************************************************************
	 * Get Source Currency Balance - subtracts line and tax amounts from total -
	 * no rounding
	 * 
	 * @return positive amount, if total invoice is bigger than lines
	 */
	public BigDecimal getBalance() {
		BigDecimal retValue = Env.ZERO;
		StringBuffer sb = new StringBuffer(" [");
		// Total
		retValue = retValue.add(getAmount(Doc.AMTTYPE_Gross));
		sb.append(getAmount(Doc.AMTTYPE_Gross));
		// - Header Charge
		retValue = retValue.subtract(getAmount(Doc.AMTTYPE_Charge));
		sb.append("-").append(getAmount(Doc.AMTTYPE_Charge));
		// - Tax
		for (int i = 0; i < m_taxes.length; i++) {
			retValue = retValue.subtract(m_taxes[i].getAmount());
			sb.append("-").append(m_taxes[i].getAmount());
		}
		// - Lines
		for (int i = 0; i < p_lines.length; i++) {
			retValue = retValue.subtract(p_lines[i].getAmtSource());
			sb.append("-").append(p_lines[i].getAmtSource());
		}
		sb.append("]");
		//
		log.fine(toString() + " Balance=" + retValue + sb.toString());
		return retValue;
	} // getBalance

	/**
	 * Create Facts (the accounting logic) for ARI, ARC, ARF, API, APC.
	 * 
	 * <pre>
	 *  ARI, ARF
	 *      Receivables     DR
	 *      Charge                  CR
	 *      TaxDue                  CR
	 *      Revenue                 CR
	 * 
	 *  ARC
	 *      Receivables             CR
	 *      Charge          DR
	 *      TaxDue          DR
	 *      Revenue         RR
	 * 
	 *  API
	 *      Payables                CR
	 *      Charge          DR
	 *      TaxCredit       DR
	 *      Expense         DR
	 * 
	 *  APC
	 *      Payables        DR
	 *      Charge                  CR
	 *      TaxCredit               CR
	 *      Expense                 CR
	 * </pre>
	 * 
	 * @param as
	 *            accounting schema
	 * @return Fact
	 */
	public ArrayList<Fact> createFacts(MAcctSchema as) {
		//
		ArrayList<Fact> facts = new ArrayList<Fact>();
		// create Fact Header
		Fact fact = new Fact(this, as, Fact.POST_Actual);

		// Cash based accounting
		if (!as.isAccrual())
			return facts;

		// ** ARI, ARF
		if (getDocumentType().equals(REF_C_DocTypeDocBaseType.ARInvoice)
				|| getDocumentType().equals(REF_C_DocTypeDocBaseType.ARProFormaInvoice)) {
			BigDecimal grossAmt = getAmount(Doc.AMTTYPE_Gross);
			BigDecimal serviceAmt = Env.ZERO;

			// Header Charge CR
			BigDecimal amt = getAmount(Doc.AMTTYPE_Charge);
			if (amt != null && amt.signum() != 0) {
				fact.createLine(null, getAccount(Doc.ACCTTYPE_Charge, as),
						getC_Currency_ID(), null, amt);
			}
			// TaxDue CR
			for (int i = 0; i < m_taxes.length; i++) {
				amt = m_taxes[i].getAmount();
				if (amt != null && amt.signum() != 0) {
					FactLine tl = fact.createLine(null, m_taxes[i].getAccount(
							DocTax.ACCTTYPE_TaxDue, as), getC_Currency_ID(),
							null, amt);
					if (tl != null)
						tl.setC_Tax_ID(m_taxes[i].getC_Tax_ID());
				}
			}
			// Revenue CR
			for (int i = 0; i < p_lines.length; i++) {
				amt = p_lines[i].getAmtSource();
				BigDecimal dAmt = null;
				if (as.isTradeDiscountPosted()) {
					BigDecimal discount = p_lines[i].getDiscount();
					if (discount != null && discount.signum() != 0) {
						amt = amt.add(discount);
						dAmt = discount;
					}
				}
				if (amt.signum() < 0)
				{
					if (dAmt == null)
						dAmt = Env.ZERO;
					dAmt = dAmt.add(amt.abs());
					amt = Env.ZERO;
				}								
				if (p_lines[i].getC_InvoiceAdvance_ID() > 0)
				{	
					MInvoice ai = MInvoice.get(Env.getCtx(), p_lines[i].getC_InvoiceAdvance_ID());						

					FactLine fl = fact.Search(p_lines[i].getAccount(ProductCost.ACCTTYPE_P_Revenue, as));

					fl = createFact(as, 
							fl, 
							fact, 
							p_lines[i].getAccount(ProductCost.ACCTTYPE_P_Revenue, as) , 
							ai.getC_BPartner_ID() , 
							getC_Currency_ID() , 
							ai.getC_ConversionType_ID(),
							getDateAcct(), // ai.getdateAcct() respetar la fecha contable para el periodo   
							ai.getDateInvoiced(),  //  usae la fecha del doc para el TC correcto
							null ,
							dAmt, amt,
							getAD_Client_ID(),
							getAD_Org_ID(), 
							"",
							0);								
				}
				else
				{
					FactLine fl = fact.createLine(p_lines[i], p_lines[i]
					                                                  .getAccount(ProductCost.ACCTTYPE_P_Revenue, as),
					                                                  getC_Currency_ID(), dAmt, amt);
					fl.setA_Asset_ID(p_lines[i].getAD_Asset_ID());				
					if (!p_lines[i].isItem()) {
						grossAmt = grossAmt.subtract(amt);
						serviceAmt = serviceAmt.add(amt);
					}					
				}
			}
			// Set Locations
			FactLine[] fLines = fact.getLines();
			for (int i = 0; i < fLines.length; i++) {
				if (fLines[i] != null) {
					fLines[i]
					       .setLocationFromOrg(fLines[i].getAD_Org_ID(), true); // from
					// Loc
					fLines[i].setLocationFromBPartner(
							getC_BPartner_Location_ID(), false); // to Loc
					fLines[i].setSerial(getSerial());
					fLines[i].setC_DocType_ID(getC_DocType_ID());
					fLines[i].setInvoiceDocumentNo(getDocumentNo());
				}
			}

			// Receivables DR
			int receivables_ID = getValidCombination_ID(
					Doc.ACCTTYPE_C_Receivable, as);
			int receivablesServices_ID = getValidCombination_ID(
					Doc.ACCTTYPE_C_Receivable_Services, as);
			if (m_allLinesItem || !as.isPostServices()
					|| receivables_ID == receivablesServices_ID) {
				grossAmt = getAmount(Doc.AMTTYPE_Gross);
				serviceAmt = Env.ZERO;
			} else if (m_allLinesService) {
				serviceAmt = getAmount(Doc.AMTTYPE_Gross);
				grossAmt = Env.ZERO;
			}
			if (grossAmt.signum() != 0) {
				FactLine fl = fact.createLine(null, MAccount.get(getCtx(),
						receivables_ID), getC_Currency_ID(), grossAmt, null);
				fl.setSerial(getSerial());
				fl.setC_DocType_ID(getC_DocType_ID());
				fl.setInvoiceDocumentNo(getDocumentNo());

			}
			if (serviceAmt.signum() != 0)
				fact.createLine(null, MAccount.get(getCtx(),
						receivablesServices_ID), getC_Currency_ID(),
						serviceAmt, null);
		}
		// ARC
		else if (getDocumentType().equals(REF_C_DocTypeDocBaseType.ARCreditMemo)) {
			BigDecimal grossAmt = getAmount(Doc.AMTTYPE_Gross);
			BigDecimal serviceAmt = Env.ZERO;

			MInvoice invoice = (MInvoice) getPO();

			if (invoice.getRef_Invoice_ID() > 0)
			{
				MInvoice invoiceref = MInvoice.get(Env.getCtx(), invoice.getRef_Invoice_ID());
				setDateDoc(invoiceref.getDateInvoiced());
			}
			else
			{
				p_Error = "Error: la nota de credito requiere una referencia de forma obligatoria";
				log.log(Level.SEVERE, p_Error);
				return null;				
			}
			// Header Charge DR
			BigDecimal amt = getAmount(Doc.AMTTYPE_Charge);
			if (amt != null && amt.signum() != 0)
				fact.createLine(null, getAccount(Doc.ACCTTYPE_Charge, as),
						getC_Currency_ID(), amt, null);
			// TaxDue DR
			for (int i = 0; i < m_taxes.length; i++) {
				amt = m_taxes[i].getAmount();
				if (amt != null && amt.signum() != 0) {
					FactLine tl = fact.createLine(null, m_taxes[i].getAccount(
							DocTax.ACCTTYPE_TaxDue, as), getC_Currency_ID(),
							amt, null);
					if (tl != null)
					{
						tl.setC_Tax_ID(m_taxes[i].getC_Tax_ID());
						tl.setSerial(getSerial());
						tl.setC_DocType_ID(getC_DocType_ID());
						tl.setInvoiceDocumentNo(getDocumentNo());
					}
				}
			}
			// Revenue CR
			for (int i = 0; i < p_lines.length; i++) {
				amt = p_lines[i].getAmtSource();
				BigDecimal dAmt = null;
				if (as.isTradeDiscountPosted()) {
					BigDecimal discount = p_lines[i].getDiscount();
					if (discount != null && discount.signum() != 0) {
						amt = amt.add(discount);
						dAmt = discount;
					}
				}
				FactLine fl = fact.createLine(p_lines[i], p_lines[i].getAccount(
						ProductCost.ACCTTYPE_P_Revenue, as),
						getC_Currency_ID(), amt, dAmt);
				if (!p_lines[i].isItem()) {
					grossAmt = grossAmt.subtract(amt);
					serviceAmt = serviceAmt.add(amt);
				}
				if (p_lines[i].getC_InvoiceAdvance_ID() > 0)
				{
					BigDecimal diff = AdjustInvoiceAdvance(p_lines[i].getC_InvoiceAdvance_ID(), fl.getAcctBalance(), as);
					if ( diff.compareTo(Env.ZERO) != 0 )
					{
						Timestamp datedoc = null;

						if (fl.getDocLine() != null)	
							datedoc = fl.getDocLine().getDateDoc(); 
						if ( datedoc == null && fl.getDoc() != null )
							datedoc = fl.getDoc().getDateDoc();

						fl = fact.Search(p_lines[i].getAccount(ProductCost.ACCTTYPE_P_Revenue, as));
						fl = createFact(as, 
								fl, 
								fact, 
								p_lines[i].getAccount(ProductCost.ACCTTYPE_P_Revenue, as) , 
								getC_BPartner_ID() , 
								as.getC_Currency_ID() , 
								getC_ConversionType_ID(),
								getDateAcct(),
								datedoc,
								fl.getDocLine(),
								diff.compareTo(Env.ZERO) > 0 ? null : diff.abs() ,
										diff.compareTo(Env.ZERO) > 0 ? diff.abs() : null,											
												getAD_Client_ID(),
												getAD_Org_ID(), 
												"",
												0);								
					}					
				}				
			}
			// Set Locations
			FactLine[] fLines = fact.getLines();
			for (int i = 0; i < fLines.length; i++) {
				if (fLines[i] != null) {
					fLines[i]
					       .setLocationFromOrg(fLines[i].getAD_Org_ID(), true); // from
					// Loc
					fLines[i].setLocationFromBPartner(
							getC_BPartner_Location_ID(), false); // to Loc
					fLines[i].setSerial(getSerial());
					fLines[i].setC_DocType_ID(getC_DocType_ID());
					fLines[i].setInvoiceDocumentNo(getDocumentNo());					
				}
			}
			// Receivables CR
			int receivables_ID = getValidCombination_ID(
					Doc.ACCTTYPE_C_Receivable, as);
			int receivablesServices_ID = getValidCombination_ID(
					Doc.ACCTTYPE_C_Receivable_Services, as);
			if (m_allLinesItem || !as.isPostServices()
					|| receivables_ID == receivablesServices_ID) {
				grossAmt = getAmount(Doc.AMTTYPE_Gross);
				serviceAmt = Env.ZERO;
			} else if (m_allLinesService) {
				serviceAmt = getAmount(Doc.AMTTYPE_Gross);
				grossAmt = Env.ZERO;
			}
			if (grossAmt.signum() != 0)
			{
				FactLine fl = fact.createLine(null, MAccount.get(getCtx(), receivables_ID),
						getC_Currency_ID(), null, grossAmt);
				if (fl != null)
				{
					fl.setSerial(getSerial());
					fl.setC_DocType_ID(getC_DocType_ID());
					fl.setInvoiceDocumentNo(getDocumentNo());
				}
			}
			if (serviceAmt.signum() != 0)
			{
				FactLine fl = fact.createLine(null, MAccount.get(getCtx(),
						receivablesServices_ID), getC_Currency_ID(), null,
						serviceAmt);
				if (fl != null)
					fl.setInvoiceDocumentNo(getDocumentNo());					
			}
		}
		// nota de debito
		else if (getDocumentType().equals(REF_C_DocTypeDocBaseType.APDebit)) {
			BigDecimal grossAmt = getAmount(Doc.AMTTYPE_Gross);
			BigDecimal serviceAmt = Env.ZERO;

			MInvoice invoice = (MInvoice) getPO();

			if (invoice.getRef_Invoice_ID() > 0)
			{
				MInvoice invoiceref = MInvoice.get(Env.getCtx(), invoice.getRef_Invoice_ID());
				setDateDoc(invoiceref.getDateInvoiced());
			}
			else
			{
				p_Error = "Error: la nota de debito requiere una referencia de forma obligatoria";
				log.log(Level.SEVERE, p_Error);
				return null;				
			}
			
			// Charge DR
			fact.createLine(null, getAccount(Doc.ACCTTYPE_Charge, as), getC_Currency_ID(), getAmount(Doc.AMTTYPE_Charge), null);
			// TaxCredit DR
			for (int i = 0; i < m_taxes.length; i++) {
				FactLine tl = fact.createLine(null, m_taxes[i].getAccount(m_taxes[i].getAPTaxType(), as), getC_Currency_ID(),
						m_taxes[i].getAmount(), null);
				if (tl != null)
					tl.setC_Tax_ID(m_taxes[i].getC_Tax_ID());
			}
			// Expense DR
			for (int i = 0; i < p_lines.length; i++) {
				DocLine line = p_lines[i];
				// TODO: This area nevver will work beacuse landeCost method
				// allways
				// return false.
				boolean landedCost = landedCost(as, fact, line, true);
				if (landedCost && as.isExplicitCostAdjustment()) {
					fact.createLine(line, line.getAccount(
							ProductCost.ACCTTYPE_P_Expense, as),
							getC_Currency_ID(), line.getAmtSource(), null);
					//
					FactLine fl = fact.createLine(line, line.getAccount(
							ProductCost.ACCTTYPE_P_Expense, as),
							getC_Currency_ID(), null, line.getAmtSource());
					String desc = line.getDescription();
					if (desc == null)
						desc = "100%";
					else
						desc += " 100%";
					fl.setDescription(desc);
				}
				if (!landedCost) {
					BigDecimal amt = line.getAmtSource();
					BigDecimal dAmt = null;					
					MAccount expense = line.getAccount(ProductCost.ACCTTYPE_P_Expense, as);
					if (line.isItem())
						expense = line.getAccount(ProductCost.ACCTTYPE_P_InventoryClearing, as);
					else
					{
						if (amt.compareTo(Env.ZERO) < 0)
						{
							expense = line.getAccount(ProductCost.ACCTTYPE_P_Revenue, as);
						}
					}
					if (as.isTradeDiscountPosted() && !line.isItem()) {
						BigDecimal discount = line.getDiscount();
						if (discount != null && discount.signum() != 0) {
							amt = amt.add(discount);
							dAmt = discount;
						}
					}
					FactLine fl = null;
					if (amt.compareTo(Env.ZERO) < 0)
					{
						amt = amt.negate();
						if (dAmt != null)
							amt = amt.subtract(dAmt);
						fl = fact.createLine(line, expense, getC_Currency_ID(), null,amt);
					}
					else
					{
						fl = fact.createLine(line, expense, getC_Currency_ID(), amt,	dAmt);
					}
					if (!line.isItem()) {
						grossAmt = grossAmt.subtract(amt);
						serviceAmt = serviceAmt.add(amt);
					}					
				}
			}
			// Set Locations
			FactLine[] fLines = fact.getLines();
			for (int i = 0; i < fLines.length; i++) {
				if (fLines[i] != null) {
					fLines[i].setLocationFromBPartner(
							getC_BPartner_Location_ID(), true); // from Loc
					fLines[i].setLocationFromOrg(fLines[i].getAD_Org_ID(),
							false); // to Loc
					fLines[i].setSerial(getSerial());
					fLines[i].setC_DocType_ID(getC_DocType_ID());
					fLines[i].setInvoiceDocumentNo(getDocumentNo());

				}
			}

			// Liability CR
			int payables_ID = getValidCombination_ID(Doc.ACCTTYPE_V_Liability, as);
			int payablesServices_ID = getValidCombination_ID(Doc.ACCTTYPE_V_Liability_Services, as);
			if (m_allLinesItem || !as.isPostServices() || payables_ID == payablesServices_ID) {
				grossAmt = getAmount(Doc.AMTTYPE_Gross);
				serviceAmt = Env.ZERO;
			} else if (m_allLinesService) {
				serviceAmt = getAmount(Doc.AMTTYPE_Gross);
				grossAmt = Env.ZERO;
			}
			if (grossAmt.signum() != 0) {
				FactLine fl = fact.createLine(null, MAccount.get(getCtx(), payables_ID), getC_Currency_ID(), null, grossAmt);
				fl.setSerial(getSerial());
				fl.setC_DocType_ID(getC_DocType_ID());
				fl.setInvoiceDocumentNo(getDocumentNo());				
			}
			if (serviceAmt.signum() != 0) {
				FactLine fl = fact.createLine(null, MAccount.get(getCtx(), payablesServices_ID), getC_Currency_ID(), null, serviceAmt);
				fl.setSerial(getSerial());
				fl.setC_DocType_ID(getC_DocType_ID());
				fl.setInvoiceDocumentNo(getDocumentNo());
			}
		}
		// ** API
		else if (getDocumentType().equals(REF_C_DocTypeDocBaseType.APInvoice)) {
			BigDecimal grossAmt = getAmount(Doc.AMTTYPE_Gross);
			BigDecimal serviceAmt = Env.ZERO;

			// Charge DR
			fact.createLine(null, getAccount(Doc.ACCTTYPE_Charge, as), getC_Currency_ID(), getAmount(Doc.AMTTYPE_Charge), null);
			// TaxCredit DR
			for (int i = 0; i < m_taxes.length; i++) {
				FactLine tl = fact.createLine(null, m_taxes[i].getAccount(m_taxes[i].getAPTaxType(), as), getC_Currency_ID(),
						m_taxes[i].getAmount(), null);
				if (tl != null)
					tl.setC_Tax_ID(m_taxes[i].getC_Tax_ID());
			}
			// Expense DR
			for (int i = 0; i < p_lines.length; i++) {
				DocLine line = p_lines[i];
				// TODO: This area nevver will work beacuse landeCost method
				// allways
				// return false.
				boolean landedCost = landedCost(as, fact, line, true);
				if (landedCost && as.isExplicitCostAdjustment()) {
					fact.createLine(line, line.getAccount(
							ProductCost.ACCTTYPE_P_Expense, as),
							getC_Currency_ID(), line.getAmtSource(), null);
					//
					FactLine fl = fact.createLine(line, line.getAccount(
							ProductCost.ACCTTYPE_P_Expense, as),
							getC_Currency_ID(), null, line.getAmtSource());
					String desc = line.getDescription();
					if (desc == null)
						desc = "100%";
					else
						desc += " 100%";
					fl.setDescription(desc);
				}
				if (!landedCost) {
					BigDecimal amt = line.getAmtSource();
					BigDecimal dAmt = null;					
					MAccount expense = line.getAccount(ProductCost.ACCTTYPE_P_Expense, as);
					if (line.isItem())
						expense = line.getAccount(ProductCost.ACCTTYPE_P_InventoryClearing, as);
					else
					{
						if (amt.compareTo(Env.ZERO) < 0)
						{
							expense = line.getAccount(ProductCost.ACCTTYPE_P_Revenue, as);
						}
					}
					if (as.isTradeDiscountPosted() && !line.isItem()) {
						BigDecimal discount = line.getDiscount();
						if (discount != null && discount.signum() != 0) {
							amt = amt.add(discount);
							dAmt = discount;
						}
					}
					FactLine fl = null;
					if (amt.compareTo(Env.ZERO) < 0)
					{
						amt = amt.negate();
						if (dAmt != null)
							amt = amt.subtract(dAmt);
						fl = fact.createLine(line, expense, getC_Currency_ID(), null,amt);
					}
					else
					{
						fl = fact.createLine(line, expense, getC_Currency_ID(), amt,	dAmt);
					}
					if (!line.isItem()) {
						grossAmt = grossAmt.subtract(amt);
						serviceAmt = serviceAmt.add(amt);
					}					
					if (p_lines[i].getC_InvoiceAdvance_ID() > 0)
					{
						//AdjustInvoiceAdvance(i, amt, fact, as);
						BigDecimal diff = AdjustInvoiceAdvance(p_lines[i].getC_InvoiceAdvance_ID(), fl.getAcctBalance(), as);
						if ( diff.compareTo(Env.ZERO) != 0 )
						{
							Timestamp datedoc = null;

							if (fl.getDocLine() != null)	
								datedoc = fl.getDocLine().getDateDoc(); 
							if ( datedoc == null && fl.getDoc() != null )
								datedoc = fl.getDoc().getDateDoc();

							fl = fact.Search(expense);
							fl = createFact(as, 
									fl, 
									fact, 
									expense, 
									getC_BPartner_ID() , 
									as.getC_Currency_ID() , 
									getC_ConversionType_ID(),
									getDateAcct(),
									datedoc,
									fl.getDocLine(),
									diff.compareTo(Env.ZERO) > 0 ? null : diff.abs() ,
											diff.compareTo(Env.ZERO) > 0 ? diff.abs() : null,											
													getAD_Client_ID(),
													getAD_Org_ID(), 
													"",
													0);								
						}						
					}
					//
					// TODO: Arana , No costear aqui carajo!!! <--- :) isi cun,  xapiens
					/*
					 * if (line.getM_Product_ID() != 0 &&
					 * line.getProduct().isService()) // otherwise Inv Matching
					 * MCostDetail.createInvoice(as, line.getAD_Org_ID(),
					 * line.getM_Product_ID(),
					 * line.getM_AttributeSetInstance_ID(), line.get_ID(), 0, //
					 * No Cost Element line.getAmtSource(), line.getQty(),
					 * line.getDescription(), getTrxName());
					 */
				}
			}
			// Set Locations
			FactLine[] fLines = fact.getLines();
			for (int i = 0; i < fLines.length; i++) {
				if (fLines[i] != null) {
					fLines[i].setLocationFromBPartner(
							getC_BPartner_Location_ID(), true); // from Loc
					fLines[i].setLocationFromOrg(fLines[i].getAD_Org_ID(),
							false); // to Loc
					fLines[i].setSerial(getSerial());
					fLines[i].setC_DocType_ID(getC_DocType_ID());
					fLines[i].setInvoiceDocumentNo(getDocumentNo());

				}
			}

			// Liability CR
			int payables_ID = getValidCombination_ID(Doc.ACCTTYPE_V_Liability, as);
			int payablesServices_ID = getValidCombination_ID(Doc.ACCTTYPE_V_Liability_Services, as);
			if (m_allLinesItem || !as.isPostServices()
					|| payables_ID == payablesServices_ID) {
				grossAmt = getAmount(Doc.AMTTYPE_Gross);
				serviceAmt = Env.ZERO;
			} else if (m_allLinesService) {
				serviceAmt = getAmount(Doc.AMTTYPE_Gross);
				grossAmt = Env.ZERO;
			}
			if (grossAmt.signum() != 0) {
				FactLine fl = fact.createLine(null, MAccount.get(getCtx(), payables_ID), getC_Currency_ID(), null, grossAmt);
				fl.setSerial(getSerial());
				fl.setC_DocType_ID(getC_DocType_ID());
				fl.setInvoiceDocumentNo(getDocumentNo());				
			}
			if (serviceAmt.signum() != 0) {
				FactLine fl = fact.createLine(null, MAccount.get(getCtx(), payablesServices_ID), getC_Currency_ID(), null, serviceAmt);
				fl.setSerial(getSerial());
				fl.setC_DocType_ID(getC_DocType_ID());
				fl.setInvoiceDocumentNo(getDocumentNo());
			}
			//
			// TODO: Arana , no es necesario ya
			// updateProductPO(as); // Only API
			// TODO: Arana , no es necesario ya
			// updateProductInfo (as.getC_AcctSchema_ID()); // only API
		}
		// APC
		else if (getDocumentType().equals(REF_C_DocTypeDocBaseType.APCreditMemo)) {
			BigDecimal grossAmt = getAmount(Doc.AMTTYPE_Gross);
			BigDecimal serviceAmt = Env.ZERO;
			// Charge CR
			MInvoice invoice = (MInvoice) getPO();			
			if (invoice.getRef_Invoice_ID() > 0)
			{
				MInvoice invoiceref = MInvoice.get(Env.getCtx(), invoice.getRef_Invoice_ID());
				setDateDoc(invoiceref.getDateInvoiced());
			}
			else
			{
				p_Error = "Error: la nota de credito requiere una referencia de forma obligatoria";
				log.log(Level.SEVERE, p_Error);
				return null;				
			}			
			fact.createLine(null, getAccount(Doc.ACCTTYPE_Charge, as),
					getC_Currency_ID(), null, getAmount(Doc.AMTTYPE_Charge));
			// TaxCredit CR
			for (int i = 0; i < m_taxes.length; i++) {
				FactLine tl = fact.createLine(null, m_taxes[i].getAccount(
						m_taxes[i].getAPTaxType(), as), getC_Currency_ID(),
						null, m_taxes[i].getAmount());
				if (tl != null)
					tl.setC_Tax_ID(m_taxes[i].getC_Tax_ID());
			}
			// Expense CR
			for (int i = 0; i < p_lines.length; i++) {
				DocLine line = p_lines[i];
				// TODO: This area nevver will work beacuse landeCost method
				// allways
				// return false.
				boolean landedCost = landedCost(as, fact, line, false);
				if (landedCost && as.isExplicitCostAdjustment()) {
					fact.createLine(line, line.getAccount(
							ProductCost.ACCTTYPE_P_Expense, as),
							getC_Currency_ID(), null, line.getAmtSource());
					//
					FactLine fl = fact.createLine(line, line.getAccount(
							ProductCost.ACCTTYPE_P_Expense, as),
							getC_Currency_ID(), line.getAmtSource(), null);
					String desc = line.getDescription();
					if (desc == null)
						desc = "100%";
					else
						desc += " 100%";
					fl.setDescription(desc);
				}
				if (!landedCost) {
					MAccount expense = line.getAccount(
							ProductCost.ACCTTYPE_P_Expense, as);
					if (line.isItem())
						expense = line.getAccount(
								ProductCost.ACCTTYPE_P_InventoryClearing, as);
					BigDecimal amt = line.getAmtSource();
					BigDecimal dAmt = null;
					if (as.isTradeDiscountPosted() && !line.isItem()) {
						BigDecimal discount = line.getDiscount();
						if (discount != null && discount.signum() != 0) {
							amt = amt.add(discount);
							dAmt = discount;
						}
					}
					FactLine fl = fact.createLine(line, expense, getC_Currency_ID(), dAmt,
							amt);
					if (!line.isItem()) {
						grossAmt = grossAmt.subtract(amt);
						serviceAmt = serviceAmt.add(amt);
					}
					if (p_lines[i].getC_InvoiceAdvance_ID() > 0)
					{
						//AdjustInvoiceAdvance(i, amt, fact, as);
						BigDecimal diff = AdjustInvoiceAdvance(p_lines[i].getC_InvoiceAdvance_ID(), fl.getAcctBalance(), as);
						Timestamp datedoc = null;

						if (fl.getDocLine() != null)	
							datedoc = fl.getDocLine().getDateDoc(); 
						if ( datedoc == null && fl.getDoc() != null )
							datedoc = fl.getDoc().getDateDoc();

						fl = fact.Search(expense);
						fl = createFact(as, 
								fl, 
								fact, 
								expense , 
								getC_BPartner_ID() , 
								as.getC_Currency_ID() , 
								getC_ConversionType_ID(),
								getDateAcct(),
								datedoc,
								fl.getDocLine(),
								diff.compareTo(Env.ZERO) > 0 ? null : diff.abs() ,
										diff.compareTo(Env.ZERO) > 0 ? diff.abs() : null,											
												getAD_Client_ID(),
												getAD_Org_ID(), 
												"",
												0);														
					}					
					//
					// TODO: Arana , No costear aqui carajo!!!
					/*
					 * if (line.getM_Product_ID() != 0 &&
					 * line.getProduct().isService()) // otherwise Inv Matching
					 * MCostDetail.createInvoice(as, line.getAD_Org_ID(),
					 * line.getM_Product_ID(),
					 * line.getM_AttributeSetInstance_ID(), line.get_ID(), 0, //
					 * No Cost Element line.getAmtSource().negate(),
					 * line.getQty(), line.getDescription(), getTrxName());
					 */
				}
			}
			// Set Locations
			FactLine[] fLines = fact.getLines();
			for (int i = 0; i < fLines.length; i++) {
				if (fLines[i] != null) {
					fLines[i].setLocationFromBPartner(
							getC_BPartner_Location_ID(), true); // from Loc
					fLines[i].setLocationFromOrg(fLines[i].getAD_Org_ID(),
							false); // to Loc
				}
			}
			// Liability DR
			int payables_ID = getValidCombination_ID(Doc.ACCTTYPE_V_Liability,
					as);
			int payablesServices_ID = getValidCombination_ID(
					Doc.ACCTTYPE_V_Liability_Services, as);
			if (m_allLinesItem || !as.isPostServices()
					|| payables_ID == payablesServices_ID) {
				grossAmt = getAmount(Doc.AMTTYPE_Gross);
				serviceAmt = Env.ZERO;
			} else if (m_allLinesService) {
				serviceAmt = getAmount(Doc.AMTTYPE_Gross);
				grossAmt = Env.ZERO;
			}
			if (grossAmt.signum() != 0)
			{
				FactLine fl = fact.createLine(null, MAccount.get(getCtx(), payables_ID),
						getC_Currency_ID(), grossAmt, null);
				fl.setSerial(getSerial());
				fl.setC_DocType_ID(getC_DocType_ID());
				fl.setInvoiceDocumentNo(getDocumentNo());
			}
			if (serviceAmt.signum() != 0)
			{
				FactLine fl = fact.createLine(null, MAccount.get(getCtx(),
						payablesServices_ID), getC_Currency_ID(), serviceAmt,
						null);
				fl.setSerial(getSerial());
				fl.setC_DocType_ID(getC_DocType_ID());
				fl.setInvoiceDocumentNo(getDocumentNo());				
			}
		} else if (getDocumentType().equals(REF_C_DocTypeDocBaseType.PersonalFeeShip)) {
			BigDecimal grossAmt = getAmount(Doc.AMTTYPE_Gross);
			BigDecimal serviceAmt = Env.ZERO;
			// int payables_ID = getValidCombination_ID
			// (Doc.ACCTTYPE_V_Liability, as);
			int payablesServices_ID = getValidCombination_ID(
					Doc.ACCTTYPE_V_Liability_Services, as);
			if (m_allLinesService) {
				serviceAmt = getAmount(Doc.AMTTYPE_Net);
				grossAmt = getAmount(Doc.AMTTYPE_Gross);
			}

			// Charge DR
			for (int i = 0; i < p_lines.length; i++) {
				FactLine fl = fact.createLine(null, p_lines[i].getChargeAccount(as,
						p_lines[i].getAmtSource()), getC_Currency_ID(),
						p_lines[i].getAmtSource(), null);
				if (fl != null)
				{
					fl.setSerial(getSerial());
					fl.setC_DocType_ID(getC_DocType_ID());
					fl.setInvoiceDocumentNo(getDocumentNo());
				}

			}
			// TaxCredit CR
			for (int i = 0; i < m_taxes.length; i++) {
				FactLine tl = fact.createLine(null, m_taxes[i].getAccount(
						m_taxes[i].getAPTaxType(), as), getC_Currency_ID(),
						null, m_taxes[i].getAmount().abs());
				if (tl != null)
				{
					tl.setC_Tax_ID(m_taxes[i].getC_Tax_ID());
					tl.setSerial(getSerial());
					tl.setC_DocType_ID(getC_DocType_ID());
					tl.setInvoiceDocumentNo(getDocumentNo());					
				}
			}
			// Liability DR
			if (serviceAmt.signum() != 0)
			{
				FactLine fl = fact.createLine(null, MAccount.get(getCtx(),
						payablesServices_ID), getC_Currency_ID(), null,
						grossAmt);
				fl.setSerial(getSerial());
				fl.setC_DocType_ID(getC_DocType_ID());
				fl.setInvoiceDocumentNo(getDocumentNo());				
			}
		}
		//
		else if (getDocumentType().equals(REF_C_DocTypeDocBaseType.DeclarationCustomsValue)) {
			for (int i = 0; i < m_taxes.length; i++) {
				int receivables_ID = getValidCombination_ID(
						Doc.ACCTTYPE_V_Liability, as);
				FactLine tl = fact.createLine(null,  MAccount.get(getCtx(),
						receivables_ID), getC_Currency_ID(),
						null, m_taxes[i].getAmount().abs());

				if (tl != null)
				{
					tl.setC_Tax_ID(m_taxes[i].getC_Tax_ID());
					tl.setSerial(getSerial());
					tl.setC_DocType_ID(getC_DocType_ID());
					tl.setInvoiceDocumentNo(getDocumentNo());					
				}

				tl = fact.createLine(null, m_taxes[i].getAccount(
						m_taxes[i].getAPTaxType(), as), getC_Currency_ID(),
						m_taxes[i].getAmount().abs(), null);

				if (tl != null)
				{
					tl.setC_Tax_ID(m_taxes[i].getC_Tax_ID());
					tl.setSerial(getSerial());
					tl.setC_DocType_ID(getC_DocType_ID());
					tl.setInvoiceDocumentNo(getDocumentNo());					
				}
			}
		}		
		//
		else {
			p_Error = "DocumentType unknown: " + getDocumentType();
			log.log(Level.SEVERE, p_Error);
			fact = null;
		}	
		//
		facts.add(fact);
		return facts;
	} // createFact

	private BigDecimal AdjustInvoiceAdvance(int C_InvoiceAdvance_ID, BigDecimal sourcebalanced, MAcctSchema as)
	{
		BigDecimal diff = Env.ZERO;
		MInvoice invoice = (MInvoice) getPO();
		MInvoiceLine[] lines = invoice.getLines(false);
		BigDecimal PriceEntered = Env.ZERO; 
		for (MInvoiceLine line:lines)
		{
			if (line.getC_InvoiceAdvance_ID() == C_InvoiceAdvance_ID)
			{
				PriceEntered = line.getPriceEntered().abs();
				break;
			}
		}

		MInvoice invoicesrc = MInvoice.get(Env.getCtx(), C_InvoiceAdvance_ID);

		if (invoicesrc.getC_Invoice_ID() == 0)
			return diff;

		if ( invoicesrc.getC_Currency_ID() != as.getC_Currency_ID() )
		{
			BigDecimal destAmount = MConversionRate.convert(getCtx(), PriceEntered, invoicesrc.getC_Currency_ID(), 
					as.getC_Currency_ID(), invoicesrc.getDateAcct(), invoicesrc.getC_ConversionType_ID(), getAD_Client_ID(), getAD_Org_ID(), true);

			diff = destAmount.subtract(sourcebalanced);			
		}		
		return diff;
	}
	/**
	 * Create Fact Cash Based (i.e. only revenue/expense)
	 * 
	 * @param as
	 *            accounting schema
	 * @param fact
	 *            fact to add lines to
	 * @param multiplier
	 *            source amount multiplier
	 * @return accounted amount
	 */
	public BigDecimal createFactCash(MAcctSchema as, Fact fact,
			BigDecimal multiplier) {
		boolean creditMemo = getDocumentType().equals(REF_C_DocTypeDocBaseType.ARCreditMemo)
		|| getDocumentType().equals(REF_C_DocTypeDocBaseType.APCreditMemo);
		boolean payables = getDocumentType().equals(REF_C_DocTypeDocBaseType.APInvoice)
		|| getDocumentType().equals(REF_C_DocTypeDocBaseType.APCreditMemo);
		BigDecimal acctAmt = Env.ZERO;
		FactLine fl = null;
		// Revenue/Cost
		for (int i = 0; i < p_lines.length; i++) {
			DocLine line = p_lines[i];
			// TODO: Arana,This area nevver will work beacuse landeCost method
			// allways
			// return false.
			boolean landedCost = false;
			if (payables)
				landedCost = landedCost(as, fact, line, false);
			if (landedCost && as.isExplicitCostAdjustment()) {
				fact.createLine(line, line.getAccount(
						ProductCost.ACCTTYPE_P_Expense, as),
						getC_Currency_ID(), null, line.getAmtSource());
				//
				fl = fact.createLine(line, line.getAccount(
						ProductCost.ACCTTYPE_P_Expense, as),
						getC_Currency_ID(), line.getAmtSource(), null);
				String desc = line.getDescription();
				if (desc == null)
					desc = "100%";
				else
					desc += " 100%";
				fl.setDescription(desc);
			}
			// Standard
			if (!landedCost) {
				MAccount acct = line.getAccount(
						payables ? ProductCost.ACCTTYPE_P_Expense
								: ProductCost.ACCTTYPE_P_Revenue, as);
				if (payables) {
					// if Fixed Asset
					if (line.isItem())
						acct = line.getAccount(
								ProductCost.ACCTTYPE_P_InventoryClearing, as);
				}
				BigDecimal amt = line.getAmtSource().multiply(multiplier);
				BigDecimal amt2 = null;
				if (creditMemo) {
					amt2 = amt;
					amt = null;
				}
				if (payables) // Vendor = DR
					fl = fact.createLine(line, acct, getC_Currency_ID(), amt,
							amt2);
				else
					// Customer = CR
					fl = fact.createLine(line, acct, getC_Currency_ID(), amt2,
							amt);
				if (fl != null)
					acctAmt = acctAmt.add(fl.getAcctBalance());
			}
		}
		// Tax
		for (int i = 0; i < m_taxes.length; i++) {
			BigDecimal amt = m_taxes[i].getAmount();
			BigDecimal amt2 = null;
			if (creditMemo) {
				amt2 = amt;
				amt = null;
			}
			FactLine tl = null;
			if (payables)
				tl = fact.createLine(null, m_taxes[i].getAccount(m_taxes[i]
				                                                         .getAPTaxType(), as), getC_Currency_ID(), amt, amt2);
			else
				tl = fact.createLine(null, m_taxes[i].getAccount(
						DocTax.ACCTTYPE_TaxDue, as), getC_Currency_ID(), amt2,
						amt);
			if (tl != null)
				tl.setC_Tax_ID(m_taxes[i].getC_Tax_ID());
		}
		// Set Locations
		FactLine[] fLines = fact.getLines();
		for (int i = 0; i < fLines.length; i++) {
			if (fLines[i] != null) {
				if (payables) {
					fLines[i].setLocationFromBPartner(
							getC_BPartner_Location_ID(), true); // from Loc
					fLines[i].setLocationFromOrg(fLines[i].getAD_Org_ID(),
							false); // to Loc
				} else {
					fLines[i]
					       .setLocationFromOrg(fLines[i].getAD_Org_ID(), true); // from
					// Loc
					fLines[i].setLocationFromBPartner(
							getC_BPartner_Location_ID(), false); // to Loc
				}
			}
		}
		return acctAmt;
	} // createFactCash

	/**
	 * Create Landed Cost accounting & Cost lines
	 * 
	 * @param as
	 *            accounting schema
	 * @param fact
	 *            fact
	 * @param line
	 *            document line
	 * @param dr
	 *            DR entry (normal api)
	 * @return true if landed costs were created
	 */
	private boolean landedCost(MAcctSchema as, Fact fact, DocLine line,
			boolean dr) {
		// TODO: Arana , allways return false , no need to process landecosts
		/*
		 * int C_InvoiceLine_ID = line.get_ID(); MLandedCostAllocation[] lcas =
		 * MLandedCostAllocation.getOfInvoiceLine( getCtx(), C_InvoiceLine_ID,
		 * getTrxName()); if (lcas.length == 0) return false;
		 * 
		 * // Delete Old String sql =
		 * "DELETE FROM M_CostDetail WHERE C_InvoiceLine_ID=" + C_InvoiceLine_ID; int
		 * no = DB.executeUpdate(sql, getTrxName()); if (no != 0)
		 * log.config("CostDetail Deleted #" + no);
		 * 
		 * // Calculate Total Base double totalBase = 0; for (int i = 0; i <
		 * lcas.length; i++) totalBase += lcas[i].getBase().doubleValue();
		 * 
		 * // Create New MInvoiceLine il = new MInvoiceLine (getCtx(),
		 * C_InvoiceLine_ID, getTrxName()); for (int i = 0; i < lcas.length;
		 * i++) { MLandedCostAllocation lca = lcas[i]; if
		 * (lca.getBase().signum() == 0) continue; double percent = totalBase /
		 * lca.getBase().doubleValue(); String desc = il.getDescription(); if
		 * (desc == null) desc = percent + "%"; else desc += " - " + percent +
		 * "%"; if (line.getDescription() != null) desc += " - " +
		 * line.getDescription();
		 * 
		 * // Accounting ProductCost pc = new ProductCost (Env.getCtx(),
		 * lca.getM_Product_ID(), lca.getM_AttributeSetInstance_ID(),
		 * getTrxName()); BigDecimal drAmt = null; BigDecimal crAmt = null; if
		 * (dr) drAmt = lca.getAmt(); else crAmt = lca.getAmt(); FactLine fl =
		 * fact.createLine (line,
		 * pc.getAccount(ProductCost.ACCTTYPE_P_CostAdjustment, as),
		 * getC_Currency_ID(), drAmt, crAmt); fl.setDescription(desc);
		 * 
		 * // Cost Detail - Convert to AcctCurrency BigDecimal allocationAmt =
		 * lca.getAmt(); if (getC_Currency_ID() != as.getC_Currency_ID())
		 * allocationAmt = MConversionRate.convert(getCtx(), allocationAmt,
		 * getC_Currency_ID(), as.getC_Currency_ID(), getDateDoc()getDateAcct(),
		 * getC_ConversionType_ID(), getAD_Client_ID(), getAD_Org_ID()); if
		 * (allocationAmt.scale() > as.getCostingPrecision()) allocationAmt =
		 * allocationAmt.setScale(as.getCostingPrecision(),
		 * BigDecimal.ROUND_HALF_UP); if (!dr) allocationAmt =
		 * allocationAmt.negate(); MCostDetail cd = new MCostDetail (as,
		 * lca.getAD_Org_ID(), lca.getM_Product_ID(),
		 * lca.getM_AttributeSetInstance_ID(), lca.getM_CostElement_ID(), 0,
		 * allocationAmt, Env.ZERO, // Qty desc, getTrxName());
		 * cd.setC_InvoiceLine_ID(C_InvoiceLine_ID); boolean ok = cd.save(); if
		 * (ok && !cd.isProcessed()) { MClient client = MClient.get(as.getCtx(),
		 * as.getAD_Client_ID()); if (client.isCostImmediate()) cd.process(); }
		 * }
		 * 
		 * log.config("Created #" + lcas.length); return true;
		 */
		return false;
	} // landedCosts

	public void createFact_ID() {
		MInvoice invoice = (MInvoice) getPO();
		/* Fact ID */
		if (getFact_ID().length() == 0 || getFact_ID().compareTo("NSD") == 0)
		{
			setFact_ID(MGLBookPeriod.getID(invoice.getAD_Org_ID(), invoice
					.getAD_Client_ID(), invoice.Table_ID, invoice
					.getC_DocType_ID(), invoice.isSOTrx() ? "Y" : "N", invoice
							.getDateAcct()));
			setGL_Book_ID(MGLBookPeriod.getGLBookID(invoice.getAD_Org_ID(), invoice
					.getAD_Client_ID(), invoice.Table_ID, invoice
					.getC_DocType_ID(), invoice.isSOTrx() ? "Y" : "N", invoice
							.getDateAcct()));			
		}
		else
		{
			MPeriod period = MPeriod.get (Env.getCtx(), invoice.getDateAcct(), invoice.getAD_Org_ID() , invoice.getAD_Client_ID());
			if (period == null)
			{
				p_Error = "Error: se debe seleccionar un periodo o un calendario en cliente u organizacion";
				log.log(Level.SEVERE, p_Error);				
			}
			//MYear year = new MYear(Env.getCtx(), period.getC_Year_ID(),getTrxName());
			Calendar cal = Calendar.getInstance();
			cal.setTime(invoice.getDateAcct());					
			//int pos = -1;
			if (getFact_ID().contains("-")) // new format
			{
				boolean rebuild = false;
//				int start = getFact_ID().indexOf("-");				
//				int endyear = getFact_ID().indexOf("-", start+1);
//				int endmonth = getFact_ID().indexOf("-", endyear+1);
//				int cyear = Integer.valueOf(getFact_ID().substring(start+1, endyear));
//				if (cyear < 100)
//					cyear = cyear + 2000;
//				int cmonth = Integer.valueOf(getFact_ID().substring(endyear+1, endmonth));
//				if (cmonth != cal.get(Calendar.MONTH) + 1) // mismo año , diferente mes, regenerar.
//					rebuild = true;
//				if (!rebuild && cyear != cal.get(Calendar.YEAR))
//					rebuild = true;
				List<String> def = new ArrayList<String>();
				String var = getFact_ID();
				StringTokenizer st = new StringTokenizer(var, "-", false);
				while (st.hasMoreTokens())
				{
					String token = st.nextToken().trim();
					def.add(token);
				}					
				int cyear = Integer.valueOf(def.get(1));
				if (cyear < 100)
					cyear = cyear + 2000;
				int cmonth = Integer.valueOf(def.get(2));
				if (cmonth != cal.get(Calendar.MONTH) + 1) // mismo año , diferente mes, regenerar.
					rebuild = true;
				if (!rebuild && cyear != cal.get(Calendar.YEAR))
					rebuild = true;
				if (rebuild)
				{
					setFact_ID(MGLBookPeriod.getID(invoice.getAD_Org_ID(), 
							invoice.getAD_Client_ID(), 
							invoice.Table_ID, 
							invoice.getC_DocType_ID(), 
							invoice.isSOTrx() ? "Y" : "N", 
							invoice.getDateAcct()));
					setGL_Book_ID(MGLBookPeriod.getGLBookID(invoice.getAD_Org_ID(), 
							invoice.getAD_Client_ID(), 
							invoice.Table_ID, 
							invoice.getC_DocType_ID(), 
							invoice.isSOTrx() ? "Y" : "N", 
							invoice.getDateAcct()));					
				}
			}
			else // change the oldformat to new format
			{
				setFact_ID(MGLBookPeriod.getID(invoice.getAD_Org_ID(), 
						invoice.getAD_Client_ID(), 
						invoice.Table_ID, 
						invoice.getC_DocType_ID(), 
						invoice.isSOTrx() ? "Y" : "N", 
						invoice.getDateAcct()));
				setGL_Book_ID(MGLBookPeriod.getGLBookID(invoice.getAD_Org_ID(), 
						invoice.getAD_Client_ID(), 
						invoice.Table_ID, 
						invoice.getC_DocType_ID(), 
						invoice.isSOTrx() ? "Y" : "N", 
						invoice.getDateAcct()));				
			}
		}		
	}
} // Doc_Invoice
