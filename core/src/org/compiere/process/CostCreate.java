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

import java.util.logging.*;

import org.compiere.util.*;
import org.compiere.model.MCost;
import org.compiere.model.MCostDetail;
import org.compiere.model.MProduct;

import org.xendra.annotations.XendraProcess;
/**
 * 	Create/Update Costing for Product
 *	
 *  @author Jorg Janke
 *  @version $Id: CostCreate.java 5583 2015-08-05 14:11:58Z xapiens $
 */
public class CostCreate extends SvrProcess
{
	/**	Product				*/
	private int 	p_M_Product_ID = 0; 

	/**
	 *  Prepare - e.g., get Parameters.
	 */
	protected void prepare()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
		//	log.fine("prepare - " + para[i]);
			if (para[i].getParameter() == null)
				;
			else if (name.equals("M_Product_ID"))
				p_M_Product_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);		
		}
	}	//	prepare

	/**
	 *  Perform process.
	 *  @return Message (text with variables)
	 *  @throws Exception if not successful
	 */
//	@XendraProcess(value="M_Cost Create",
//	name="Create Costing Records",
//	description="Create Costing Records",
//	help="The costing records are created when needed or by batch processes. You can force the creation of the costing information here.",
//	id="62b62ccd-d5a3-56da-dfa3-d65a3ff999fb",
//	ParametersName={"M_Product_ID"},
//	ParametersType={DisplayType.Search},
//	ParametersSeqNo={10},
//	ParametersReference={"6f4a17ad-b890-92c3-09cf-6811e3fb48c7"},
//	ParametersReferenceValue={""},
//	ParametersIsMandatory={"Y"},
//	ParametersIsRange={"N"},
//	ParametersDefaultValue={""},
//	ParametersDefaultValue2={""},
//	ParametersvFormat={""},
//	ParametersvalueMin={""},
//	ParametersvalueMax={""},
//	ParametersDisplayLogic={""},
//	ParametersReadOnlyLogic={""})	
	protected String doIt() throws Exception
	{
		log.info("M_Product_ID=" + p_M_Product_ID);
		if (p_M_Product_ID == 0)
			throw new XendraUserError("@NotFound@: @M_Product_ID@ = " + p_M_Product_ID);
		MProduct product = MProduct.get(getCtx(), p_M_Product_ID, get_TrxName());
		if (product.get_ID() != p_M_Product_ID)
			throw new XendraUserError("@NotFound@: @M_Product_ID@ = " + p_M_Product_ID);
		//
		
		String sql = "DELETE FROM M_Cost WHERE M_Product_ID=?";
		DB.executeUpdate(sql, p_M_Product_ID, get_TrxName());
		
		sql = "UPDATE M_CostDetail SET Processed='N' WHERE M_Product_ID=?";
		DB.executeUpdate(sql, p_M_Product_ID, get_TrxName());


		MCost.create(product);
		if (!MCostDetail.processProduct(product, get_TrxName()))
			return "@Error@";

		sql = "UPDATE " +
				"M_InOut " +
			  "SET " +
			  	"Processing='N', " +
			  	"Posted='N' " +
			  "WHERE " +
			  	"M_InOut_ID IN (" +
			  		"SELECT " +
			  			"M_InOut_ID " +
			  		"FROM " +
			  			"M_InOutLine " +
			  		"WHERE " +
			  			"M_Product_ID=?" +
			  	") " +
			  	"AND Processed='Y'";
		DB.executeUpdate(sql, p_M_Product_ID, get_TrxName());

		sql = "DELETE FROM " +
				"Fact_Acct " +
			  "WHERE " +
			  	"AD_Table_ID=319 " +
			  	"AND Record_ID IN (" +
		  			"SELECT " +
		  				"M_InOut_ID " +
	  		        "FROM " +
	  		        	"M_InOutLine " +
	  		        "WHERE " +
	  		        	"M_Product_ID=?" +
	  	        ") ";
		DB.executeUpdate(sql, p_M_Product_ID, get_TrxName());
		return "@Ok@";
	}	//	doIt
	
}	//	CostCreate
