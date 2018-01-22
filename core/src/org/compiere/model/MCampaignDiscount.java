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

import java.sql.*;
import java.util.*;

import org.compiere.model.persistence.X_C_CampaignDiscount;
import org.compiere.model.persistence.X_M_ProductBonus;
import org.compiere.util.*;

/**
 *	Campaign Discount
 *	
 *  @author xapiens
 *  @version $Id: MCampaignDiscount.java 508 2007-11-24 23:06:53Z xapiens $
 */
public class MCampaignDiscount  extends X_C_CampaignDiscount
{
	public MCampaignDiscount(Properties ctx, int C_CampaignDiscount_ID, String trxName) {
		super(ctx, C_CampaignDiscount_ID, trxName);
		if (C_CampaignDiscount_ID == 0)
		{
			//
		}
	}
	public MCampaignDiscount(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}
	/**	Logger						*/
	private static CLogger s_log = CLogger.getCLogger (MCampaignDiscount.class);
	
	public static MCampaignDiscount[] getbyProduct(MProduct mProduct, String trxName) {
		if (mProduct == null)
			return null;		
		String whereClause = "(M_Product_ID=? OR M_Product_Brand_ID=?) AND IsActive='Y' AND M_DiscountSchema_ID in (SELECT M_DiscountSchema_ID from M_DiscountSchema where IsActive = 'Y') AND C_Campaign_ID in (SELECT C_Campaign_ID FROM C_Campaign WHERE IsActive='Y' AND CURRENT_TIMESTAMP BETWEEN StartDate AND EndDate)";
		List<MCampaignDiscount> list = new Query(Env.getCtx(), X_C_CampaignDiscount.Table_Name , whereClause, trxName)
		  .setParameters(mProduct.getM_Product_ID(), mProduct.getM_Product_Brand_ID())
			  .list();
		MCampaignDiscount[] lines = new MCampaignDiscount[list.size()];
		list.toArray(lines);				
		return lines;
	}
	public static X_C_CampaignDiscount[] getbyCampaign(MCampaign campaign, String trxName) {
		String whereClause = "C_Campaign_ID= ? ";
		List<X_C_CampaignDiscount> list = new Query(Env.getCtx(), X_C_CampaignDiscount.Table_Name , whereClause, trxName)
		  .setParameters(campaign.getC_Campaign_ID())
		  .list();
		X_C_CampaignDiscount[] lines = new X_C_CampaignDiscount[list.size()];
		list.toArray(lines);				
		return lines;					
	}	
	
}	//	Campaign Discount
