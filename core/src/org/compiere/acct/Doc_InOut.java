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
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;

import org.apache.commons.net.io.Util;
import org.compiere.model.MAccount;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MCostCalc;
import org.compiere.model.MCostElement;
import org.compiere.model.MDocType;
import org.compiere.model.MGLBookPeriod;
import org.compiere.model.MInOut;
import org.compiere.model.MInOutLine;
import org.compiere.model.MOrderLine;
import org.compiere.model.MPeriod;
import org.compiere.model.MProduct;
import org.compiere.model.MYear;
import org.compiere.model.ProductCost;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_OrderLine;
import org.compiere.model.persistence.X_M_CostElement;
import org.compiere.model.reference.REF_C_DocTypeDocBaseType;
import org.compiere.model.reference.REF_M_TransactionMovementType;
import org.compiere.util.Env;
import org.xendra.cost.CostAverageCalc;

/**
 * Post Shipment/Receipt Documents.
 * 
 * <pre>
 *  Table:              M_InOut (319)
 *  Document Types:     MMS, MMR
 * </pre>
 * 
 * @author Jorg Janke / carana / xapiens
 * 
 *          Modified 12/08/2010 To support new costing method.
 */
public class Doc_InOut extends Doc {
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
	public Doc_InOut(MAcctSchema[] ass, ResultSet rs, String trxName) {
		super(ass, MInOut.class, rs, null, trxName);
	} // DocInOut

	/**
	 * Load Document Details
	 * 
	 * @return error message or null
	 */
	protected String loadDocumentDetails() {
		setC_Currency_ID(NO_CURRENCY);
		MInOut inout = (MInOut) getPO();
		setDateDoc(inout.getMovementDate());
		// Contained Objects
		p_lines = loadLines(inout);
		log.fine("Lines=" + p_lines.length);
		return null;
	} // loadDocumentDetails

	/**
	 * Load Invoice Line
	 * 
	 * @param inout
	 *            shipment/receipt
	 * @return DocLine Array
	 */
	private DocLine[] loadLines(MInOut inout) {
		ArrayList<DocLine> list = new ArrayList<DocLine>();
		MInOutLine[] lines = inout.getLines(false);
		for (int i = 0; i < lines.length; i++) {
			MInOutLine line = lines[i];
			if (line.isDescription() || line.getM_Product_ID() == 0
					|| line.getMovementQty().signum() == 0) {
				log.finer("Ignored: " + line);
				continue;
			}

			DocLine docLine = new DocLine(line, this);
			BigDecimal Qty = line.getMovementQty();
			docLine.setQty(Qty, getDocumentType().equals(REF_C_DocTypeDocBaseType.MaterialDelivery)); // sets
			docLine.setRecord_ID(line.getM_InOutLine_ID());
			// Trx
			// and
			// Storage
			// Qty
			//
			log.fine(docLine.toString());
			list.add(docLine);
		}

		// Return Array
		DocLine[] dls = new DocLine[list.size()];
		list.toArray(dls);
		return dls;
	} // loadLines

	/**
	 * Get Balance
	 * 
	 * @return Zero (always balanced)
	 */
	public BigDecimal getBalance() {
		return Env.ZERO;
	} // getBalance

	/**
	 * Create Facts (the accounting logic) for MMS, MMR.
	 * 
	 * <pre>
	 *  Shipment
	 *      CoGS (RevOrg)   DR
	 *      Inventory               CR
	 *  Shipment of Project Issue
	 *      CoGS            DR
	 *      Project                 CR
	 *  Receipt
	 *      Inventory       DR
	 *      NotInvoicedReceipt      CR
	 * </pre>
	 * 
	 * @param as
	 *            accounting schema
	 * @return Fact
	 */
	public ArrayList<Fact> createFacts(MAcctSchema as) {
		MInOut inout = (MInOut) getPO();				
		if (!inout.isCosted())
		{
			p_Error = "Document not costed";
			return null;
		}
		MCostElement ce = new Query(Env.getCtx(),X_M_CostElement.Table_Name, "M_CostElement_ID = ?", getTrxName())
		.setParameters(as.getM_CostElement_ID()).first();
		if (ce == null)
			return null;
		
		MDocType doctype = MDocType.get(Env.getCtx(), inout.getC_DocType_ID());
		int processed = 0;
		// create Fact Header
		Fact fact = new Fact(this, as, Fact.POST_Actual);
		setC_Currency_ID(as.getC_Currency_ID());
		BigDecimal movCost = null;
		ce.setAD_Table_ID(MInOut.Table_ID);		
		// Line pointers
		FactLine dr = null;
		FactLine cr = null;
		// *** Sales - Shipment
		if (getDocumentType().equals(REF_C_DocTypeDocBaseType.MaterialDelivery) || 
				getDocumentType().equals(REF_C_DocTypeDocBaseType.MaterialReturnOfVendor)) {
				for (int i = 0; i < p_lines.length; i++) {
					DocLine line = p_lines[i];
					movCost = ce.getCostForProduct(getAD_Client_ID(), getAD_Org_ID(), /*as.getM_CostElement_ID(),*/ line
							.getProduct().get_ID(), getDateAcct(), false, false, false, line.getLine(), getTrxName());
					// If the cost is negative means an error
					// see the MCostCalc methods documentation.
					if (movCost.signum() > 0) {
						if (line.getQty() != null)
							movCost = movCost.multiply(line.getQty().abs());
						else
							movCost = Env.ZERO;
					}
					else if (movCost.signum() < 0)
					{
						movCost = Env.ZERO;
					}
//					/**
//					 * We should allow products (of any type) with zero cost. We
//					 * must also allow services without cost. However, we must throw
//					 * an error when we get a stocked product without cost. Stocked
//					 * products must have at least a zero cost. In any case that
//					 * passes this check, we don't create a fact because it's not
//					 * needed (zero amount). sergioaguayo 4/Jan/2008
//					 */
//					if (movCost.signum() == 0) {
//						MProduct product = line.getProduct();
//						// Parche Marzo 2010
//						// Nunca sera null en este punto por lo tanto si el producto es costeable
//						// y hay error no lo indica y continuaba con el siguiente item
//						// permitiendo que la guia quede contabilizada parcialmente.
//
//						//if (product.isStocked() && movCost == null) {
//
//						if (product.isCostable()) {
//							if (p_Error != null)
//								p_Error = p_Error.concat("No Costs for " + line.getProduct().getName());
//							else
//								p_Error = "No Costs for " + line.getProduct().getName();
//							log.log(Level.WARNING, p_Error);
//							return null;
//						} else
//							continue;
//					}				
					// CoGS DR
					if (getDocumentType().equals(REF_C_DocTypeDocBaseType.MaterialDelivery)) {
						dr = fact.createLine(line, line.getAccount(ProductCost.ACCTTYPE_P_Cogs, as),
								as.getC_Currency_ID(), movCost, null);
					} else {
						dr = fact.createLine(line, getAccount(Doc.ACCTTYPE_NotInvoicedReceipts, as),
								as.getC_Currency_ID(), movCost, null);
					}

					if (dr == null) {
						if (p_Error != null)
							p_Error.concat("FactLine DR not created: " + line);
						else
							p_Error = "FactLine DR not created: " + line;
						log.log(Level.WARNING, p_Error);
						return null;
					}
					dr.setM_Locator_ID(line.getM_Locator_ID());
					dr.setLocationFromLocator(line.getM_Locator_ID(), true); // from
					// Loc
					dr.setLocationFromBPartner(getC_BPartner_Location_ID(), false); // to
					// Loc
					dr.setAD_Org_ID(line.getOrder_Org_ID()); // Revenue X-Org
					dr.setQty(line.getQty().negate());

					// Inventory CR
					cr = fact.createLine(line, line.getAccount(ProductCost.ACCTTYPE_P_Asset , as),	as.getC_Currency_ID(), null, movCost);

					if (cr == null) {
						if (p_Error != null)
							p_Error = p_Error.concat("FactLine CR not created: " + line);
						else
							p_Error = "FactLine CR not created: " + line;
						log.log(Level.WARNING, p_Error);
						return null;
					}
					cr.setM_Locator_ID(line.getM_Locator_ID());
					cr.setLocationFromLocator(line.getM_Locator_ID(), true); // from
					// Loc
					cr.setLocationFromBPartner(getC_BPartner_Location_ID(), false); // to

					// Loc
					processed++;
					movCost = null;
				} // for all lines
			
		} // Shipment

		// *** Purchasing - Receipt
		else if (getDocumentType().equals(REF_C_DocTypeDocBaseType.MaterialReceipt)  || 
				getDocumentType().equals(REF_C_DocTypeDocBaseType.MaterialReturnOfCustomer)) {
			
			if (!doctype.isReturn() && getDocumentType().equals(REF_C_DocTypeDocBaseType.MaterialReturnOfCustomer))
			{
				p_Error = "DocType inconsistent with DocBaseType ";
				log.log(Level.WARNING, p_Error);
				return null;				
			}
									
			for (int i = 0; i < p_lines.length; i++) {
				// Purchase Order Line
				DocLine line = p_lines[i];

				MProduct product = line.getProduct();
								
				if (getDocumentType().equals(REF_C_DocTypeDocBaseType.MaterialReturnOfCustomer)) {
					
					// PARCHE MARZO-2010
					// si es devolucion, busco la fecha de costeo de la referencia
					MOrderLine oline = new Query(Env.getCtx(), X_C_OrderLine.Table_Name, "C_OrderLine_ID = ?", null)
						.setParameters(line.getC_OrderLine_ID()).first();
					if (oline != null) {
						Timestamp costdate = ce.getCostDate(inout.getM_InOut_ID(), oline.get_ID(), REF_M_TransactionMovementType.CustomerReturns, getTrxName());
						if (costdate == null)
						{
							p_Error = "no existe factura de referencia en la orden de devolucion";
							return null;
						}
//						Timestamp costdate = ce.getCostDate(getAD_Client_ID(),
//								getAD_Org_ID(),
//								oline.get_ID(),
//								REF_M_TransactionMovementType.CustomerReturns,
//								line.getDateDoc(),
//								doctype.isReturn(),
//								null);						
						// se cambio false a true para que devuelva el ultimo costo porque 
						// la devolucion es de una guia de salida que no afecta costo de ingreso
						movCost = ce.getCostForProduct(getAD_Client_ID(),
								getAD_Org_ID(), 
								product.getM_Product_ID(), 
								costdate, 
								false,	false,	true, oline.getLine(), getTrxName());
						
						if (movCost == null || movCost.signum() == 0) {
							// Si no hay factura de referencia se usa el de el movimiento
							// se considrea como retorno por muestra y/o similares.
							movCost = ce.getCostForProduct(getAD_Client_ID(),
									getAD_Org_ID(), 
									product.getM_Product_ID(), 
									getDateAcct(), false, false, true, 
									oline.getLine(), getTrxName());							
						}
					}
					
				} else {
					ce.setRecord_ID(inout.getM_InOut_ID());
					movCost = ce.getCostForProduct(getAD_Client_ID(),
							getAD_Org_ID(), product.getM_Product_ID(), 
							getDateDoc(), false,	true,false, line.getLine(), getTrxName());		
				}
				
				movCost = movCost.multiply(line.getQty().abs());

				// Not price and not cost , nothing to do
				if ((movCost != null && movCost.signum() == 0)
						|| (movCost != null && movCost.signum() == 0))
					continue;

				// Inventory/Asset DR
				MAccount assets= line.getAccount(ProductCost.ACCTTYPE_P_Asset ,as);					
				
				if (product.isService())
					assets = line
							.getAccount(ProductCost.ACCTTYPE_P_Expense, as);

				// If not proce take the cost.
				dr = fact.createLine(line, assets, as.getC_Currency_ID(),
						movCost, null);

				if (dr == null) {
					if (p_Error != null)
						p_Error = p_Error.concat("DR not created: " + line);
					else
						p_Error = "DR not created: " + line;
					log.log(Level.WARNING, p_Error);
					return null;
				}
				dr.setM_Locator_ID(line.getM_Locator_ID());
				dr.setLocationFromBPartner(getC_BPartner_Location_ID(), true); // from
				// Loc
				dr.setLocationFromLocator(line.getM_Locator_ID(), false); // to
				// Loc
				// NotInvoicedReceipt CR
				if (getDocumentType().equals(REF_C_DocTypeDocBaseType.MaterialReceipt)) {
					cr = fact.createLine(line, getAccount(Doc.ACCTTYPE_NotInvoicedReceipts, as), as
							.getC_Currency_ID(), null, movCost);
					
				} else {
					cr = fact.createLine(line, line.getAccount(ProductCost.ACCTTYPE_P_Cogs , as), as
							.getC_Currency_ID(), null, movCost);
					
				}

				if (cr == null) {
					if (p_Error != null)
						p_Error = p_Error.concat("CR not created: " + line);
					else
					p_Error = "CR not created: " + line;
					log.log(Level.WARNING, p_Error);
					return null;
				}
				cr.setM_Locator_ID(line.getM_Locator_ID());
				cr.setLocationFromBPartner(getC_BPartner_Location_ID(), true); // from
				// Loc
				cr.setLocationFromLocator(line.getM_Locator_ID(), false); // to
				// Loc
				cr.setQty(line.getQty().negate());
				processed++;
				movCost = null;

			}
			if (p_Error != null && p_Error.length() > 0)
				return null;
		} // Receipt
		else {
			p_Error = "DocumentType unknown: " + getDocumentType();
			log.log(Level.SEVERE, p_Error);
			return null;
		}
		// siempre devolver un arraylist asi este vacio xq sino dara que el asiento tiene un error
		// y cuando un doc es anulado, figura como error en asiento.
		ArrayList<Fact> facts = null;
		facts = new ArrayList<Fact>();
		facts.add(fact);
		return facts;
	} // createFact

	public void createFact_ID() {
		MInOut inout = (MInOut) getPO();
		/* Fact ID */
		if (getFact_ID().length() == 0 || getFact_ID().compareTo("NSD") == 0)
			setFact_ID(MGLBookPeriod.getID(inout.getAD_Org_ID(), 
					inout.getAD_Client_ID(), 
					inout.Table_ID,
					inout.getC_DocType_ID(), 
					inout.isSOTrx() ? "Y" : "N", 
					inout.getDateAcct()));
		else
		{
			MPeriod period = MPeriod.get (Env.getCtx(), inout.getDateAcct(), inout.getAD_Org_ID() , inout.getAD_Client_ID());
			if (period == null)
			{
				p_Error = "Error: se debe seleccionar un periodo o un calendario en cliente u organizacion";
				log.log(Level.SEVERE, p_Error);				
			}
			Calendar cal = Calendar.getInstance();
			cal.setTime(inout.getDateAcct());		
			if (getFact_ID().contains("-")) // new format
			{
				boolean rebuild = false;
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
					setFact_ID(MGLBookPeriod.getID(inout.getAD_Org_ID(), 
							inout.getAD_Client_ID(), 
							inout.Table_ID, 
							inout.getC_DocType_ID(), 
							inout.isSOTrx() ? "Y" : "N", 
							inout.getDateAcct()));
				}
			}
			else // change the oldformat to new format
			{
				setFact_ID(MGLBookPeriod.getID(inout.getAD_Org_ID(), 
						inout.getAD_Client_ID(), 
						inout.Table_ID, 
						inout.getC_DocType_ID(), 
						inout.isSOTrx() ? "Y" : "N", 
						inout.getDateAcct()));
			}
		}
	}
} // Doc_InOut
