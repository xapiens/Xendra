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
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;

import org.compiere.model.MAcctSchema;
import org.compiere.model.MCostCalc;
import org.compiere.model.MCostElement;
import org.compiere.model.MGLBookPeriod;
import org.compiere.model.MMovement;
import org.compiere.model.MMovementLine;
import org.compiere.model.MPeriod;
import org.compiere.model.MYear;
import org.compiere.model.ProductCost;
import org.compiere.model.reference.REF_C_DocTypeDocBaseType;
import org.compiere.util.Env;

/**
 * Post Invoice Documents.
 * 
 * <pre>
 *  Table:              M_Movement (323)
 *  Document Types:     MMM
 * </pre>
 * 
 * @author Jorg Janke
 * @version $Id: Doc_Movement.java,v 1.1 2007/06/15 00:03:24 sergioaguayo Exp $
 */
public class Doc_Movement extends Doc {
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
	public Doc_Movement(MAcctSchema[] ass, ResultSet rs, String trxName) {
		super(ass, MMovement.class, rs, REF_C_DocTypeDocBaseType.MaterialMovement, trxName);
	} // Doc_Movement

	/**
	 * Load Document Details
	 * 
	 * @return error message or null
	 */
	protected String loadDocumentDetails() {
		setC_Currency_ID(NO_CURRENCY);
		MMovement move = (MMovement) getPO();
		setDateDoc(move.getMovementDate());
		setDateAcct(move.getMovementDate());
		// Contained Objects
		p_lines = loadLines(move);
		log.fine("Lines=" + p_lines.length);
		return null;
	} // loadDocumentDetails

	/**
	 * Load Invoice Line
	 * 
	 * @param move
	 *            move
	 * @return document lines (DocLine_Material)
	 */
	private DocLine[] loadLines(MMovement move) {
		ArrayList<DocLine> list = new ArrayList<DocLine>();
		MMovementLine[] lines = move.getLines(false);
		for (int i = 0; i < lines.length; i++) {
			MMovementLine line = lines[i];
			DocLine docLine = new DocLine(line, this);
			docLine.setQty(line.getMovementQty(), false);
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
	 * @return balance (ZERO) - always balanced
	 */
	public BigDecimal getBalance() {
		BigDecimal retValue = Env.ZERO;
		return retValue;
	} // getBalance

	/**
	 * Create Facts (the accounting logic) for MMM.
	 * 
	 * <pre>
	 *  Movement
	 *      Inventory       DR      CR
	 *      InventoryTo     DR      CR
	 * </pre>
	 * 
	 * @param as
	 *            account schema
	 * @return Fact
	 */
	public ArrayList<Fact> createFacts(MAcctSchema as) {
		int processed = 0;
		// create Fact Header
		Fact fact = new Fact(this, as, Fact.POST_Actual);
		setC_Currency_ID(as.getC_Currency_ID());
		ArrayList<Fact> facts = null;
		if (!isCosted())
			return facts;
		MCostElement ce = new MCostElement(Env.getCtx(), as.getM_CostElement_ID(), null);
		// Line pointers
		FactLine dr = null;
		FactLine cr = null;

		for (int i = 0; i < p_lines.length; i++) {
			DocLine line = p_lines[i];
			BigDecimal costs = ce.getCostForProduct(getAD_Client_ID(),
					0, line.getProduct().get_ID(), 
					getDateAcct(), false,false,false, 
					line.getLine(), null);

			// If the cost is negative means an error
			// see the MCostCalc methods documentation.
			if (costs.signum() < 0) {
				// If the product is not costable the cost is zero.
				if (costs.intValue() != MCostCalc.ERROR_PRODUCT_NOT_COSTABLE) {
					p_Error = MCostCalc.getTextError(costs.intValue(), " "
							+ line);
					log.log(Level.WARNING, p_Error);
					return null;
				} else {
					costs = Env.ZERO;
				}
			}
			
			if (line != null) {
				costs = costs.multiply(line.getQty().abs());
			} else {
				costs = Env.ZERO;
			}
			// ** Inventory DR CR
			dr = fact.createLine(line, line.getAccount(
					ProductCost.ACCTTYPE_P_Asset, as), as.getC_Currency_ID(),
					costs.negate()); // from (-) CR
			if (dr == null)
				continue;
			dr.setM_Locator_ID(line.getM_Locator_ID());
			dr.setQty(line.getQty().negate()); // outgoing

			// ** InventoryTo DR CR
			cr = fact.createLine(line, line.getAccount(
					ProductCost.ACCTTYPE_P_Asset, as), as.getC_Currency_ID(),
					costs); // to (+) DR
			if (cr == null)
				continue;
			cr.setM_Locator_ID(line.getM_LocatorTo_ID());
			cr.setQty(line.getQty());

			processed++;
			// Only for between-org movements
			/*
			 * if (dr.getAD_Org_ID() != cr.getAD_Org_ID()) { String costingLevel
			 * = as.getCostingLevel(); MProductCategoryAcct pca =
			 * MProductCategoryAcct.get(getCtx(),
			 * line.getProduct().getM_Product_Category_ID(),
			 * as.getC_AcctSchema_ID(), getTrxName()); if (pca.getCostingLevel()
			 * != null) costingLevel = pca.getCostingLevel(); if
			 * (!MAcctSchema.COSTINGLEVEL_Organization.equals(costingLevel))
			 * continue; // String description = line.getDescription(); if
			 * (description == null) description = ""; // Cost Detail From
			 * MCostDetail.createMovement(as, dr.getAD_Org_ID(), // locator org
			 * line.getM_Product_ID(), line.getM_AttributeSetInstance_ID(),
			 * line.get_ID(), 0, costs.negate(), line.getQty().negate(), true,
			 * description + "(|->)", getTrxName()); // Cost Detail To
			 * MCostDetail.createMovement(as, cr.getAD_Org_ID(), // locator org
			 * line.getM_Product_ID(), line.getM_AttributeSetInstance_ID(),
			 * line.get_ID(), 0, costs, line.getQty(), false, description +
			 * "(|<-)", getTrxName()); }
			 */
		}

		//
		// Patch CARANA
		// , never return an array list if there are not processed facts
		//ArrayList<Fact> facts = null;
		if (processed > 0) {
			facts = new ArrayList<Fact>();
			facts.add(fact);
		}
		return facts;
	} // createFact

	public void createFact_ID() {
		MMovement move = (MMovement) getPO(); 
		/* Fact ID */
		if (getFact_ID().length() == 0 || getFact_ID().compareTo("NSD") == 0)
			setFact_ID(MGLBookPeriod.getID(move.getAD_Org_ID(), move
					.getAD_Client_ID(), move.Table_ID, move.getC_DocType_ID(),
					"", move.getMovementDate()));
		else
		{
			MPeriod period = MPeriod.get (Env.getCtx(), move.getMovementDate(), move.getAD_Org_ID() , move.getAD_Client_ID());
			if (period == null)
			{
				p_Error = "Error: se debe seleccionar un periodo o un calendario en cliente u organizacion";
				log.log(Level.SEVERE, p_Error);				
			}			
			Calendar cal = Calendar.getInstance();
			cal.setTime(move.getDateAcct());		
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
					setFact_ID(MGLBookPeriod.getID(move.getAD_Org_ID(), 
							move.getAD_Client_ID(), 
							move.Table_ID, 
							move.getC_DocType_ID(), 
							"", 
							move.getDateAcct()));
				}
			}
			else // change the oldformat to new format
			{
				setFact_ID(MGLBookPeriod.getID(move.getAD_Org_ID(), 
						move.getAD_Client_ID(), 
						move.Table_ID, 
						move.getC_DocType_ID(), 
						"", 
						move.getDateAcct()));
			}
		}
		
	}

} // Doc_Movement
