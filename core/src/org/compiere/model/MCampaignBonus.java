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
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.*;
import java.util.*;

import org.compiere.model.persistence.X_C_CampaignBonus;
import org.compiere.model.persistence.X_M_ProductBonus;
import org.compiere.util.*;
import org.xendra.exceptions.XendraException;

/**
 *	Campaign Bonus
 *	
 *  @author xapiens
 *  @version $Id: MCampaignBonus.java 508 2007-11-24 23:06:53Z xapiens $
 */
public class MCampaignBonus  extends X_C_CampaignBonus
{	
	public MCampaignBonus(Properties ctx, int C_CampaignBonus_ID, String trxName) {
		super(ctx, C_CampaignBonus_ID, trxName);
		if (C_CampaignBonus_ID == 0)
		{
			//
		}
		else
		{
			 
		}
	}

	public MCampaignBonus(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}


	/**	Logger						*/
	private static CLogger s_log = CLogger.getCLogger (MCampaignBonus.class);

	public static MCampaignBonus[] getbyProduct(MProduct mProduct, String trxName) {
		if (mProduct == null)
			return null;		
		String whereClause = "M_Product_ID=? AND IsActive='Y' AND C_Campaign_ID in (SELECT C_Campaign_ID FROM C_Campaign WHERE IsActive='Y' AND CURRENT_TIMESTAMP BETWEEN StartDate AND EndDate) ";
		List<MCampaignBonus> list = new Query(Env.getCtx(), X_C_CampaignBonus.Table_Name , whereClause, trxName)
		  .setParameters(mProduct.getM_Product_ID())
		  .list();
		MCampaignBonus[] lines = new MCampaignBonus[list.size()];
		list.toArray(lines);				
		return lines;
	}
	
	public MProductBonus[] calculateBonus(Integer M_Product_ID, 
			BigDecimal Qty,	
			/*Integer C_UOM_ID, */
			BigDecimal Amt) {

		MProductBonus[] m_productbonus = null;		

		try {

			ArrayList<MProductBonus> ProductBonusList = new ArrayList<MProductBonus>();

			if (isQuantityBased())
			{
				if (!applies(Qty, M_Product_ID))
				{
					throw new XendraException("no apply");
				}
				
				String whereClause ="C_CampaignBonus_ID=?";
				List<MProductBonus> list = new Query(Env.getCtx(), X_M_ProductBonus.Table_Name , whereClause, get_TrxName())
				.setParameters(getC_CampaignBonus_ID())
				.list();	

				for (MProductBonus pbl:list)
				{					
					BigDecimal factor = new BigDecimal(Qty.divide(getBreakValue(),Env.divideprecision,BigDecimal.ROUND_CEILING).intValue());
					pbl.setQtyEntered(pbl.getQtyEntered().multiply(factor));
				}
				
				ProductBonusList.addAll(list);

				m_productbonus = new MProductBonus[ProductBonusList.size()];
				ProductBonusList.toArray(m_productbonus);				

			}
			else
			{
				if (!applies(Amt, M_Product_ID))
				{
					throw new XendraException("no apply");
				}
				String whereClause ="C_CampaignBonus_ID=?";
				List<MProductBonus> list = new Query(Env.getCtx(), X_M_ProductBonus.Table_Name , whereClause, get_TrxName())
				.setParameters(getC_CampaignBonus_ID())
				.list();	

				ProductBonusList.addAll(list);			

				m_productbonus = new MProductBonus[ProductBonusList.size()];
				ProductBonusList.toArray(m_productbonus);								
			}
			//

			
		}
		catch (Exception e) {
			
		}
		return m_productbonus;
	}	

	/**
	 * 	Criteria apply
	 *	@param Value amt or qty
	 *	@param M_Product_ID product
	 *	@param M_Product_Category_ID category
	 *	@return true if criteria met
	 */
	public boolean applies (BigDecimal Value, int M_Product_ID)
	{
		if (!isActive())
			return false;
		
		//	below break value
		if (Value.compareTo(getBreakValue()) < 0)
			return false;
		
		return true;
		
	}	//	applies

	
	public static MCampaignBonus[] getByCampaign(MCampaign campaign, String trxName) {
		String whereClause = "C_Campaign_ID= ? ";
		List<MCampaignBonus> list = new Query(Env.getCtx(), X_C_CampaignBonus.Table_Name , whereClause, trxName)
		  .setParameters(campaign.getC_Campaign_ID())
		  .list();
		MCampaignBonus[] lines = new MCampaignBonus[list.size()];
		list.toArray(lines);				
		return lines;		
	}
	
}	//	Campaign Bonus
