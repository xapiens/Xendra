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

import java.math.*;
import java.sql.*;
import java.util.*;

import org.compiere.model.MAcctSchema;
import org.compiere.model.MCostElement;
import org.compiere.model.MGLBookPeriod;
import org.compiere.model.MPeriod;
import org.compiere.model.MYear;
import org.compiere.model.ProductCost;
import org.compiere.model.persistence.X_M_Production;
import org.compiere.model.persistence.X_M_ProductionLine;
import org.compiere.model.reference.REF_C_DocTypeDocBaseType;

import java.util.logging.*;

import org.compiere.util.*;

/**
 * Post Invoice Documents.
 * 
 * <pre>
 *  Table:              M_Production (325)
 *  Document Types:     MMP
 * </pre>
 * 
 * @author Jorg Janke
 * @version $Id: Doc_Production.java,v 1.1 2007/06/15 00:03:24 sergioaguayo Exp
 *          $
 */
public class Doc_Production extends Doc {
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
	public Doc_Production(MAcctSchema[] ass, ResultSet rs, String trxName) {
		super(ass, X_M_Production.class, rs, REF_C_DocTypeDocBaseType.MaterialProduction, trxName);
	} // Doc_Production

	/**
	 * Load Document Details
	 * 
	 * @return error message or null
	 */
	protected String loadDocumentDetails() {
		setC_Currency_ID(NO_CURRENCY);
		X_M_Production prod = (X_M_Production) getPO();
		setDateDoc(prod.getMovementDate());
		setDateAcct(prod.getMovementDate());
		// Contained Objects
		p_lines = loadLines(prod);
		log.fine("Lines=" + p_lines.length);
		return null;
	} // loadDocumentDetails

	/**
	 * Load Invoice Line
	 * 
	 * @param prod
	 *            production
	 * @return DoaLine Array
	 */
	private DocLine[] loadLines(X_M_Production prod) {
		ArrayList<DocLine> list = new ArrayList<DocLine>();
		// Production
		// -- ProductionPlan
		// -- -- ProductionLine - the real level
		String sqlPP = "SELECT * FROM M_ProductionPlan pp "
				+ "WHERE pp.M_Production_ID=? " + "ORDER BY pp.Line";
		String sqlPL = "SELECT * FROM M_ProductionLine pl "
				+ "WHERE pl.M_ProductionPlan_ID=? " + "ORDER BY pl.Line";
		PreparedStatement pstmtPP = null;
		ResultSet rsPP = null;
		try {
			pstmtPP = DB.prepareStatement(sqlPP, getTrxName());
			pstmtPP.setInt(1, get_ID());
			rsPP = pstmtPP.executeQuery();
			//
			while (rsPP.next()) {
				int M_Product_ID = rsPP.getInt("M_Product_ID");
				int M_ProductionPlan_ID = rsPP.getInt("M_ProductionPlan_ID");
				PreparedStatement pstmtPL = null;
				ResultSet rsPL = null;
				//
				try {
					pstmtPL = DB.prepareStatement(sqlPL,
							getTrxName());
					pstmtPL.setInt(1, M_ProductionPlan_ID);
					rsPL = pstmtPL.executeQuery();
					while (rsPL.next()) {
						X_M_ProductionLine line = new X_M_ProductionLine(
								getCtx(), rsPL, getTrxName());
						if (line.getMovementQty().signum() == 0) {
							log.info("LineQty=0 - " + line);
							continue;
						}
						DocLine docLine = new DocLine(line, this);
						docLine.setQty(line.getMovementQty(), false);
						// Identify finished BOM Product
						docLine.setProductionBOM(line.getM_Product_ID() == M_Product_ID);
						//
						log.fine(docLine.toString());
						list.add(docLine);
					}
				} catch (Exception ee) {
					log.log(Level.SEVERE, sqlPL, ee);
				}
				finally {
					DB.close(rsPL, pstmtPL);
				}					
			}
		} catch (SQLException e) {
			log.log(Level.SEVERE, sqlPP, e);
		}
		finally {
			DB.close(rsPP, pstmtPP);
		}		
		// Return Array
		DocLine[] dl = new DocLine[list.size()];
		list.toArray(dl);
		return dl;
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
	 * Create Facts (the accounting logic) for MMP.
	 * 
	 * <pre>
	 *  Production
	 *      Inventory       DR      CR
	 * </pre>
	 * 
	 * @param as
	 *            account schema
	 * @return Fact
	 */
	public ArrayList<Fact> createFacts(MAcctSchema as) {
		X_M_Production prod = (X_M_Production) getPO();		
		if (!prod.isCosted())
			return null;						
		int processed = 0;
		// create Fact Header
		Fact fact = new Fact(this, as, Fact.POST_Actual);
		setC_Currency_ID(as.getC_Currency_ID());
		
		MCostElement ce = new MCostElement(Env.getCtx(), as.getM_CostElement_ID(), getTrxName());
		ce.setAD_Table_ID(X_M_Production.Table_ID);
		ce.setRecord_ID(prod.getM_Production_ID());
		// Line pointer
		FactLine fl = null;
		BigDecimal bomCost = Env.ZERO;
		BigDecimal costs = Env.ZERO;
		ArrayList<Integer> ProductionPlanID = new ArrayList<Integer>();
		for (int i = 0; i < p_lines.length; i++) {
			DocLine line = p_lines[i];
			if (!ProductionPlanID.contains(line.getM_ProductionPlan_ID()))
			{
				ProductionPlanID.add(line.getM_ProductionPlan_ID());
				for (int ii = 0; ii < p_lines.length; ii++) {
					DocLine line0 = p_lines[ii];
					if (line0.getM_ProductionPlan_ID() != line.getM_ProductionPlan_ID())
						continue;
					if (!line0.isProductionBOM())
					{
						costs = ce.getCostForProduct(getAD_Client_ID(),
								getAD_Org_ID(), line0.getProduct().get_ID(), 
								line0.getDateAcct(), false, 
								line0.getQty().signum() > 0 ? true: false , false,
								line.getLine() ,getTrxName());
						if (costs.signum() <= 0) {
							p_Error = ce.getLastCostError();
							if (!as.isAutoCosted() && p_Error.length() == 0)
							{ 
								p_Error = "no se encontro costo, y el costeo automatico esta desactivado";
							}
							return null;
						}						
						costs = costs.multiply(line0.getQty().abs()).negate();
						fl = fact.createLine(line0, line.getAccount(
								ProductCost.ACCTTYPE_P_Asset, as), as.getC_Currency_ID(),
								costs);
						if (fl == null) {
							p_Error = "No Costs for Line " + line.getLine() + " - " + line;
							return null;
						}
						fl.setM_Locator_ID(line0.getM_Locator_ID());
						fl.setQty(line0.getQty());					
					}
				}			
				for (int ii = 0; ii < p_lines.length; ii++) {
					DocLine line0 = p_lines[ii];
					if (line0.getM_ProductionPlan_ID() != line.getM_ProductionPlan_ID())
						continue;
					if (line0.isProductionBOM())
					{
//						if (line0.getQty().signum() > 0)  
//							ce.setRecord_ID(line0.get_ID());				
						costs = ce.getCostForProduct(getAD_Client_ID(),
								getAD_Org_ID(), 
								line0.getProduct().get_ID(), 
								line0.getDateAcct(), false,	
								line0.getQty().signum() > 0 ? true : false, false, 
								line0.getLine(), getTrxName());
						if (costs.signum() <= 0) {
							p_Error = ce.getLastCostError();
							return null;
						}
						costs = costs.multiply(line0.getQty().abs());
						fl = fact.createLine(line0, line0.getAccount(
								ProductCost.ACCTTYPE_P_Asset, as), as.getC_Currency_ID(),
								costs);
						if (fl == null) {
							p_Error = "No Costs for Line " + line.getLine() + " - " + line;
							return null;
						}
						fl.setM_Locator_ID(line0.getM_Locator_ID());
						fl.setQty(line0.getQty().abs());					
					}
				}										
			}
//			// Calculate Costs			
//			if (line.isProductionBOM()) {
//				// Get BOM Cost - Sum of individual lines
//				
//				for (int ii = 0; ii < p_lines.length; ii++) {
//					DocLine line0 = p_lines[ii];
//					if (line0.getM_ProductionPlan_ID() != line
//							.getM_ProductionPlan_ID())
//						continue;
//					if (!line0.isProductionBOM())
//					{
////						bomCost = bomCost.add(line0.getProductCosts(as, line
////						.getAD_Org_ID(), false, line0.getDateAcct()));						
//						bomCost = ce.getCostForProduct(getAD_Client_ID(),
//								getAD_Org_ID(), line0.getProduct().get_ID(), line0.getDateAcct(), false,
//								false, getTrxName());											
//					}
//				}
//				costs = bomCost.negate();
//			} else
//			{
//				costs = ce.getCostForProduct(getAD_Client_ID(),
//						getAD_Org_ID(), /*as.getCostingMethod(),*/ line
//								.getProduct().get_ID(), getDateAcct(), false,
//						false, null);
////				costs = line.getProductCosts(as, line.getAD_Org_ID(), false,
////				line.getDateAcct());				
//			}
//			// Inventory DR CR
//			fl = fact.createLine(line, line.getAccount(
//					ProductCost.ACCTTYPE_P_Asset, as), as.getC_Currency_ID(),
//					costs);
//			if (fl == null) {
//				p_Error = "No Costs for Line " + line.getLine() + " - " + line;
//				return null;
//			}
//			fl.setM_Locator_ID(line.getM_Locator_ID());
//			fl.setQty(line.getQty());

			processed++;
			// Cost Detail
			/*
			 * String description = line.getDescription(); if (description ==
			 * null) description = ""; if (line.isProductionBOM()) description
			 * += "(*)";
			 */
			/*
			 * MCostDetail.createProduction(as, line.getAD_Org_ID(),
			 * line.getM_Product_ID(), line.getM_AttributeSetInstance_ID(),
			 * line.get_ID(), 0, costs, line.getQty(), description,
			 * getTrxName());
			 */
		}
		
//		BigDecimal costs = MCostCalc.getCostForProduct(getAD_Client_ID(),
//				getAD_Org_ID(), as.getCostingMethod(), line
//						.getProduct().get_ID(), getDateAcct(), false,
//				false, null);
//		
//		fl = fact.createLine(null, getAccount(
//				ProductCost.ACCTTYPE_P_Asset, as), as.getC_Currency_ID(),
//				costs);
//		if (fl == null) {
//			p_Error = "No Costs for Line " + line.getLine() + " - " + line;
//			return null;
//		}
//		fl.setM_Locator_ID(line.getM_Locator_ID());		
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
		X_M_Production prod = (X_M_Production) getPO();
		/* Fact ID */
		if (getFact_ID().length() == 0 || getFact_ID().compareTo("NSD") == 0)
		{
			setFact_ID(MGLBookPeriod.getID(prod.getAD_Org_ID(), prod
					.getAD_Client_ID(), X_M_Production.Table_ID, prod
					.getC_DocType_ID(), "Y", prod
					.getDateAcct()));
		}
		else
		{		
			MPeriod period = MPeriod.get (Env.getCtx(), prod.getDateAcct(), prod.getAD_Org_ID() , prod.getAD_Client_ID());
			if (period == null)
			{
				p_Error = "Error: se debe seleccionar un periodo o un calendario en cliente u organizacion";
				log.log(Level.SEVERE, p_Error);				
			}
			MYear year = new MYear(Env.getCtx(), period.getC_Year_ID(),getTrxName());
			Calendar cal = Calendar.getInstance();
			cal.setTime(prod.getDateAcct());		
			int pos = -1;
			if (getFact_ID().indexOf(year.getFiscalYear()) != -1 && getFact_ID().length() > 4 )
			{
				pos = getFact_ID().indexOf(year.getFiscalYear()) + 4;
				if ( getFact_ID().substring(pos, pos + 1).equals("-"))
				{
					pos = pos+1;
				}
			}
			//int month = pos != -1 && getFact_ID().length() > (pos + 2) ? Integer.parseInt(getFact_ID().substring(pos, pos + 2)) : 0;
			int month = pos != -1 ? Integer.parseInt(getFact_ID().substring(pos, pos + 2)) : 0;
			if (pos == -1) // año fiscal no encontrado, otro año, regenerar.
			{
				setFact_ID(MGLBookPeriod.getID(prod.getAD_Org_ID(), prod
						.getAD_Client_ID(), X_M_Production.Table_ID, prod
						.getC_DocType_ID(), "Y", prod
						.getDateAcct()));
			}
			else if (month != cal.get(Calendar.MONTH) + 1) // mismo año , diferente mes, regenerar.
			{
				setFact_ID(MGLBookPeriod.getID(prod.getAD_Org_ID(), prod
						.getAD_Client_ID(), X_M_Production.Table_ID, prod
						.getC_DocType_ID(),  "Y", prod
						.getDateAcct()));
			}				
		}		
	}
} // Doc_Production
