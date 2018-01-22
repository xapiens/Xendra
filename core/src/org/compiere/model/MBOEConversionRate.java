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
import java.util.logging.*;

import org.compiere.model.persistence.X_C_BOE_Conversion_Rate;
import org.compiere.util.*;

/**
 *	Bill Of Exchange Conversion Rate
 *	
 *  @author xapiens
 *  @version $Id: MBOEConversionRate.java 795 2008-02-23 20:16:13Z xapiens $
 */
public class MBOEConversionRate extends X_C_BOE_Conversion_Rate
{
	/**
	 * 	Get Bill Of Exchange (cached)
	 *	@param ctx context
	 *	@param M_BoE_ID id
	 *	@param trxName transaction
	 *	@return Bill Of Exchange
	 */
	public static MBOEConversionRate get (Properties ctx, int C_BOE_Conversion_Rate_ID, String trxName)
	{
		Integer key = new Integer (C_BOE_Conversion_Rate_ID);
		MBOEConversionRate retValue = (MBOEConversionRate)s_cache.get(key);
		if (retValue == null)
		{
			retValue = new MBOEConversionRate (ctx, C_BOE_Conversion_Rate_ID, trxName);
			s_cache.put(key, retValue);
		}
		return retValue;		
	}	//	get
		
	public static MBOEConversionRate getConversionRateFromGroup (int C_GroupDoc_ID)
	{
		MBOEConversionRate conversionrate = null;
		String sql = "SELECT * FROM c_boe_conversion_rate WHERE C_GroupDoc_ID = ?";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, null);
			pstmt.setInt (1, C_GroupDoc_ID);
			ResultSet rs = pstmt.executeQuery ();
			if (rs.next())
			{
				conversionrate = new MBOEConversionRate(Env.getCtx(), rs, null);
			}
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			s_log.log(Level.SEVERE, sql, e);
		}
		try
		{
			if (pstmt != null)
				pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			pstmt = null;
		}
		return conversionrate;		
	}	//	get		

	/** Static Logger					*/
	private static CLogger 	s_log = CLogger.getCLogger(MBOEConversionRate.class);
	/** Cache of Price Lists			*/
	private static CCache<Integer,MBOEConversionRate> s_cache = new CCache<Integer,MBOEConversionRate>("C_BOE_Conversion_Rate_ID", 5);
	private MBOE m_parent = null;	
	
	
	/**************************************************************************
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param C_BOE_Conversion_Rate_ID id
	 *	@param trxName transaction
	 */
	public MBOEConversionRate(Properties ctx, int C_BOE_Conversion_Rate_ID, String trxName)
	{
		super(ctx, C_BOE_Conversion_Rate_ID, trxName);
		if (C_BOE_Conversion_Rate_ID == 0)
		{
			
		}
	}	//	MBOEConversionRate

	/**
	 * 	Load Cosntructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MBOEConversionRate (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MBOEGroup


	/**
	 * 	Overwrite Client/Org if required
	 * 	@param AD_Client_ID client
	 * 	@param AD_Org_ID org
	 */
	public void setClientOrg (int AD_Client_ID, int AD_Org_ID)
	{
		super.setClientOrg(AD_Client_ID, AD_Org_ID);
	}	//	setClientOrg
	

	
}	//	MBOEConversionRate
