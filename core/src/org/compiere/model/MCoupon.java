/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
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
import java.util.logging.*;

import org.compiere.model.persistence.X_C_Coupon;
import org.compiere.util.*;

/**
 *	Coupon
 *	
 *  @author xapiens
 *  @version $Id: MBOEGroup.java 795 2010-02-23 20:16:13Z xapiens $
 */
public class MCoupon extends X_C_Coupon
{
	/**
	 * 	Get Bill Of Exchange (cached)
	 *	@param ctx context
	 *	@param M_BoE_ID id
	 *	@param trxName transaction
	 *	@return Bill Of Exchange
	 */
	public static MCoupon get (Properties ctx, int C_Coupon_ID, String trxName)
	{
		Integer key = new Integer (C_Coupon_ID);
		MCoupon retValue = (MCoupon)s_cache.get(key);
		if (retValue == null)
		{
			retValue = new MCoupon (ctx, C_Coupon_ID, trxName);
			s_cache.put(key, retValue);
		}
		return retValue;		
	}	//	get
		


	/** Static Logger					*/
	private static CLogger 	s_log = CLogger.getCLogger(MCoupon.class);
	/** Cache of Price Lists			*/
	private static CCache<Integer,MCoupon> s_cache = new CCache<Integer,MCoupon>("MCoupon", 5);
	
	
	/**************************************************************************
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param C_Coupon_ID id
	 *	@param trxName transaction
	 */
	public MCoupon(Properties ctx, int C_Coupon_ID, String trxName)
	{
		super(ctx, C_Coupon_ID, trxName);
		if (C_Coupon_ID == 0)
		{
			
		}
	}	//	MCoupon

	/**
	 * 	Load Cosntructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MCoupon (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MCoupon


	/**
	 * 	Overwrite Client/Org if required
	 * 	@param AD_Client_ID client
	 * 	@param AD_Org_ID org
	 */
	public void setClientOrg (int AD_Client_ID, int AD_Org_ID)
	{
		super.setClientOrg(AD_Client_ID, AD_Org_ID);
	}	//	setClientOrg

	public static MCoupon[] getByOrder(int C_Order_ID, String trxName) 
	{
		ArrayList<MCoupon> list = new ArrayList<MCoupon> ();
		StringBuffer sql = new StringBuffer("SELECT * FROM C_Coupon WHERE C_Order_ID=? ");
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement(sql.toString(), trxName);
			pstmt.setInt(1, C_Order_ID);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				MCoupon ol = new MCoupon(Env.getCtx(), rs, trxName);
				list.add(ol);
			}
			rs.close();
			pstmt.close();
			pstmt = null;
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if (pstmt != null)
					pstmt.close ();
			}
			catch (Exception e)
			{}
			pstmt = null;
		}
		//
		MCoupon[] lines = new MCoupon[list.size ()];
		list.toArray (lines);
		return lines;
	}	//	getLines
	

	
}	//	MCoupon
