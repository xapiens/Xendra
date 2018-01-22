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

import org.compiere.model.persistence.X_M_ProductBonus;
import org.compiere.util.*;

/**
 *	Product Bonus 
 *	
 *  @author xapiens
 *  @version $Id: MProductBonus.java 508 2007-11-24 23:06:53Z xapiens $
 */
public class MProductBonus  extends X_M_ProductBonus
{
	public MProductBonus(Properties ctx, int M_ProductBonus_ID, String trxName) {
		super(ctx, M_ProductBonus_ID, trxName);
		if (M_ProductBonus_ID == 0)
		{
			//
		}
	}

	public MProductBonus(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

	/**	Logger						*/
	private static CLogger s_log = CLogger.getCLogger (MProductBonus.class);

	public static X_M_ProductBonus[] getByCampaignBonus(MCampaignBonus campaignbonus,	String trxName) {
		String whereClause = "C_CampaignBonus_ID= ? ";
		List<X_M_ProductBonus> list = new Query(Env.getCtx(), X_M_ProductBonus.Table_Name , whereClause, trxName)
		  .setParameters(campaignbonus.getC_CampaignBonus_ID())
		  .list();
		X_M_ProductBonus[] lines = new X_M_ProductBonus[list.size()];
		list.toArray(lines);				
		return lines;			
	}

	
}	//	Product Bonus
