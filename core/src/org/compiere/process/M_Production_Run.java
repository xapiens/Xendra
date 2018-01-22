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
 * Portions created by Layda Salas are Copyright (C) 2005 QSS Ltda.
 * Contributor(s): Layda Salas (globalqss)
 *****************************************************************************/

package org.compiere.process;

import java.math.BigDecimal;
import java.util.List;
import java.util.logging.*;

import org.compiere.model.MLocator;
import org.compiere.model.MProduct;
import org.compiere.model.MProductBOM;
import org.compiere.model.MStorage;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_M_Production;
import org.compiere.model.persistence.X_M_ProductionLine;
import org.compiere.model.persistence.X_M_ProductionPlan;
import org.compiere.util.*;
import org.xendra.annotations.*;
/**
 * Copy and overwrite Accounts to products of this category
 * 
 * @author Layda Salas (globalqss)
 * @version $Id: M_Production_Run.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="M_Production",
name="Create/Post Production",
description="Create production lines, if not created - otherwise process the production",
help="Create/Post Production will generate the production lines and process the production.  If the production lines already exists, the production will be processed",
Identifier="e18514af-4692-648b-a9d5-830986fbec57",
classname="org.compiere.process.M_Production_Run",
updated="2015-06-20 10:10:12")
public class M_Production_Run extends SvrProcess {

	/** The Record */
	private int p_Record_ID = 0;
	
	@XendraProcessParameter(Name="Product quantity must be in stock",
			                ColumnName="MustBeStocked",
			                Description="If not sufficient in stock in the warehouse, the BOM is not produced",
			                Help="",
			                AD_Reference_ID=DisplayType.YesNo,
			                SeqNo=10,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=1,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="N",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="6e756d7e-22d8-0475-c155-d1fd8d04fbb4")	
	private boolean mustBeStocked = false;

	/**
	 * Prepare - e.g., get Parameters.
	 */
	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++) {
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("MustBeStocked"))
				mustBeStocked = ((String) para[i].getParameter()).equals("Y");
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
		p_Record_ID = getRecord_ID();
	} //prepare

	/**
	 * Process
	 * 
	 * @return message
	 * @throws Exception
	 */
	protected String doIt() throws Exception {

		log.info("Search fields in M_Production");

		X_M_Production production = new X_M_Production(getCtx(), p_Record_ID, get_TrxName());

		/**
		 * No Action
		 */
		if (production.isProcessed()) {
			log.info("Already Posted");
			return "@AlreadyPosted@";
		}
		
		String whereClause = "M_Production_ID=? ";
		List<X_M_ProductionPlan> lines = new Query(getCtx(), X_M_ProductionPlan.Table_Name , whereClause, get_TrxName())
															  .setParameters(p_Record_ID)
															  .setOrderBy("Line, M_Product_ID")
		   													  .list();
		for (X_M_ProductionPlan pp:lines)
		{
			int line = 100;
			int no = DB.executeUpdateEx("DELETE FROM M_ProductionLine WHERE M_ProductionPlan_ID = ?", new Object[]{pp.getM_ProductionPlan_ID()},get_TrxName());
			if (no == -1) raiseError("ERROR", "DELETE FROM M_ProductionLine WHERE M_ProductionPlan_ID = "+ pp.getM_ProductionPlan_ID());
			
			MProduct product = MProduct.get(Env.getCtx(),pp.getM_Product_ID(), get_TrxName());
			X_M_ProductionLine pl = new X_M_ProductionLine(getCtx(), 0, get_TrxName());
			pl.setLine(line);
			pl.setDescription(pp.getDescription());
			pl.setM_Product_ID(pp.getM_Product_ID());
			pl.setM_Locator_ID(pp.getM_Locator_ID());
			pl.setM_ProductionPlan_ID(pp.getM_ProductionPlan_ID());
			pl.setMovementQty(pp.getProductionQty());
			pl.saveEx();
			if ( explosion(pp, product, pp.getProductionQty(), line) == 0)
				raiseError("no BOM lines", "");
			pp.setProcessed(true);
			pp.saveEx();
			
			production.setIsCreated(true);
			production.saveEx();
		}
		return "@OK@";
	} // del doIt
	
	private int explosion( X_M_ProductionPlan pp, MProduct product, BigDecimal qty, int line) throws Exception
	{
		int components = 0;
		MProductBOM[] boms = MProductBOM.getBOMLines (product);
		for (MProductBOM bomline:boms)
		{
			MProduct component = MProduct.get(getCtx(), bomline.getM_Product_ID(), get_TrxName());
			if (component.isBOM() && !component.isStocked())
				explosion( pp, component, bomline.getBOMQty(), line );
			else
			{
				line += 1;
				X_M_ProductionLine pl = new X_M_ProductionLine(getCtx(), 0 , get_TrxName());
				pl.setLine(line);
				pl.setDescription(bomline.getDescription());
				pl.setM_Product_ID(bomline.getM_ProductBOM_ID());
				pl.setM_Locator_ID(pp.getM_Locator_ID());
				pl.setM_ProductionPlan_ID(pp.getM_ProductionPlan_ID());
				pl.setMovementQty(bomline.getBOMQty().multiply(qty).negate());
				pl.saveEx();
				components += 1;
			}
		}
		return components;
	}

	private void raiseError(String string, String sql) throws Exception {
		String msg = string;
		ValueNamePair pp = CLogger.retrieveError();
		if (pp != null)
			msg = pp.getName() + " - ";
		msg += sql;
		throw new XendraUserError(msg);
	}

} // M_Production_Run
