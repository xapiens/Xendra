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
import java.util.logging.Level;

import org.compiere.model.MAccount;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MCostCalc;
import org.compiere.model.MCostElement;
import org.compiere.model.MInOut;
import org.compiere.model.MInventory;
import org.compiere.model.MInventoryLine;
import org.compiere.model.ProductCost;
import org.compiere.model.reference.REF_C_DocTypeDocBaseType;
import org.compiere.util.Env;

/**
 * Post Inventory Documents.
 * 
 * <pre>
 *  Table:              M_Inventory (321)
 *  Document Types:     MMI
 * </pre>
 * 
 * @author Jorg Janke
 * @version $Id: Doc_Inventory.java,v 1.1 2007/06/15 00:03:24 sergioaguayo Exp $
 */
public class Doc_Inventory extends Doc {
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
	public Doc_Inventory(MAcctSchema[] ass, ResultSet rs, String trxName) {
		super(ass, MInventory.class, rs, REF_C_DocTypeDocBaseType.MaterialPhysicalInventory, trxName);
	} // Doc_Inventory

	/**
	 * Load Document Details
	 * 
	 * @return error message or null
	 */
	protected String loadDocumentDetails() {
		setC_Currency_ID(NO_CURRENCY);
		MInventory inventory = (MInventory) getPO();
		setDateDoc(inventory.getMovementDate());
		setDateAcct(inventory.getMovementDate());
		// Contained Objects
		p_lines = loadLines(inventory);
		log.fine("Lines=" + p_lines.length);
		return null;
	} // loadDocumentDetails

	/**
	 * Load Invoice Line
	 * 
	 * @param inventory
	 *            inventory
	 * @return DocLine Array
	 */
	private DocLine[] loadLines(MInventory inventory) {
		ArrayList<DocLine> list = new ArrayList<DocLine>();
		MInventoryLine[] lines = inventory.getLines(false);
		for (int i = 0; i < lines.length; i++) {
			MInventoryLine line = lines[i];
			// nothing to post
			if (line.getQtyBook().compareTo(line.getQtyCount()) == 0
					&& line.getQtyInternalUse().signum() == 0)
				continue;
			//
			DocLine docLine = new DocLine(line, this);
			BigDecimal Qty = line.getQtyInternalUse();
			if (Qty.signum() != 0)
				Qty = Qty.negate(); // Internal Use entered positive
			else {
				BigDecimal QtyBook = line.getQtyBook();
				BigDecimal QtyCount = line.getQtyCount();
				Qty = QtyCount.subtract(QtyBook);
			}
			docLine.setQty(Qty, false); // -5 => -5
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
		BigDecimal retValue = Env.ZERO;
		return retValue;
	} // getBalance

	/**
	 * Create Facts (the accounting logic) for MMI.
	 * 
	 * <pre>
	 *  Inventory
	 *      Inventory       DR      CR
	 *      InventoryDiff   DR      CR   (or Charge)
	 * </pre>
	 * 
	 * @param as
	 *            account schema
	 * @return Fact
	 */
	public ArrayList<Fact> createFacts(MAcctSchema as) {
		MInventory inventory = (MInventory) getPO();
		 //(M_Inventory - M_Inventory_ID=1000016)
		if (inventory.getM_Inventory_ID() == 1000016) {
			System.out.println("X");
		}
		if (!inventory.isCosted())
			return null;		
		int processed = 0;
		// create Fact Header
		Fact fact = new Fact(this, as, Fact.POST_Actual);
		setC_Currency_ID(as.getC_Currency_ID());

		MCostElement ce = new MCostElement(Env.getCtx(), as.getM_CostElement_ID(), getTrxName());
		
		// Line pointers
		FactLine dr = null;
		FactLine cr = null;

		for (int i = 0; i < p_lines.length; i++) {
			DocLine line = p_lines[i];

			//if (!line.getIsCosted())
			//	MCostElement.cost(this.getCtx(), line.getM_Product_ID(), 2, getTrxName());
			
			BigDecimal costs = ce.getCostForProduct(getAD_Client_ID(),
					0, line.getProduct().get_ID(), 
					getDateAcct(), false,false,false, 
					line.getLine(), getTrxName());
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

			if (costs == null || costs.signum() == 0) {
				p_Error = "No Costs for " + line.getProduct().getName();
				return null;
			}
			// Inventory DR CR
			dr = fact.createLine(line, line.getAccount(
					ProductCost.ACCTTYPE_P_Asset, as), as.getC_Currency_ID(),
					costs);
			// may be zero difference - no line created.
			if (dr == null)
				continue;
			dr.setM_Locator_ID(line.getM_Locator_ID());

			// InventoryDiff DR CR
			// or Charge
			MAccount invDiff = line.getChargeAccount(as, costs.negate());
			if (invDiff == null)
				invDiff = getAccount(Doc.ACCTTYPE_InvDifferences, as);
			cr = fact.createLine(line, invDiff, as.getC_Currency_ID(), costs
					.negate());
			if (cr == null)
				continue;
			cr.setM_Locator_ID(line.getM_Locator_ID());
			cr.setQty(line.getQty().negate());
			if (line.getC_Charge_ID() != 0) // explicit overwrite for charge
				cr.setAD_Org_ID(line.getAD_Org_ID());
			processed++;
		}
		//
		// Patch CARANA
		// , never return an array list if there are not processed facts
		ArrayList<Fact> facts = null;
		if (processed > 0) {
			facts = new ArrayList<Fact>();
			facts.add(fact);
		}
		return facts;
	} // createFact

	public void createFact_ID() {

	}

} // Doc_Inventory
