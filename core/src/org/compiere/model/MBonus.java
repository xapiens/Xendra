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

import java.math.*;
import java.sql.*;
import java.util.*;

import org.compiere.model.persistence.X_C_Bonus;
import org.compiere.util.*;

/**
 *	Bonus Points
 *	
 *  @author xapiens
 *  @version $Id: MBPartnerPoints.java 795 2008-02-23 20:16:13Z el_man $
 */
public class MBonus extends X_C_Bonus
{
	/**
	 * 	Get Bonus (cached)
	 *	@param ctx context
	 *	@param M_BoE_ID id
	 *	@param trxName transaction
	 *	@return Bill Of Exchange
	 */
	public static MBonus get (Properties ctx, int C_Bonus, String trxName)
	{
		Integer key = new Integer (C_Bonus);
		MBonus retValue = (MBonus)s_cache.get(key);
		if (retValue == null)
		{
			retValue = new MBonus (ctx, C_Bonus, trxName);
			s_cache.put(key, retValue);
		}
		return retValue;		
	}	//	get
		


	/** Static Logger					*/
	private static CLogger 	s_log = CLogger.getCLogger(MBonus.class);
	/** Cache of Price Lists			*/
	private static CCache<Integer,MBonus> s_cache = new CCache<Integer,MBonus>("C_Bonus", 5);
	
	
	/**************************************************************************
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param M_BoE_ID id
	 *	@param trxName transaction
	 */
	public MBonus(Properties ctx, int C_Bonus, String trxName)
	{
		super(ctx, C_Bonus, trxName);
		if (C_Bonus == 0)
		{
			
		}
	}	//	MBonus

	/**
	 * 	Load Cosntructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MBonus (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MBonus


	/**
	 * 	Overwrite Client/Org if required
	 * 	@param AD_Client_ID client
	 * 	@param AD_Org_ID org
	 */
	public void setClientOrg (int AD_Client_ID, int AD_Org_ID)
	{
		super.setClientOrg(AD_Client_ID, AD_Org_ID);
	}	//	setClientOrg

	public static BigDecimal getPointsByBPartner(Integer C_BPartner_ID) {
		BigDecimal PointsInput = null;
		BigDecimal PointsOutput = null;
		BigDecimal PointsAvailable = Env.ZERO;
		String sql = " SELECT SUM(Points) from C_Bonus WHERE C_BPartner_ID  = ? ";
		try {			
			PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
			pstmt.setInt(1, C_BPartner_ID);
			ResultSet rs = pstmt.executeQuery();
			
			if (rs.next())
				PointsInput = rs.getBigDecimal(1);
			pstmt.close();
			rs.close();
			if (PointsInput == null)
				return PointsAvailable;
			else
				PointsAvailable = PointsInput;
			//
			sql = " SELECT SUM(Points) from C_BonusMA Where C_BPartner_ID = ? ";
			pstmt = DB.prepareStatement(sql.toString(), null);
			pstmt.setInt(1, C_BPartner_ID);
			rs = pstmt.executeQuery();		
			if (rs.next())
				PointsOutput = rs.getBigDecimal(1);
			pstmt.close();
			rs.close();			
			if (PointsOutput != null)
				PointsAvailable = PointsAvailable.subtract(PointsOutput);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return PointsAvailable;
	}
	
}	//	MBonus
