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

import org.compiere.model.persistence.X_C_PreOrder;
import org.compiere.util.*;

/**
 *	Pre Order
 *	
 *  @author xapiens
 *  @version $Id: MPreOrder.java 795 2008-02-23 20:16:13Z el_man $
 */
public class MPreOrder extends X_C_PreOrder
{
	/**
	 * 	Get Bill Of Exchange (cached)
	 *	@param ctx context
	 *	@param M_BoE_ID id
	 *	@param trxName transaction
	 *	@return Bill Of Exchange
	 */
	public static MPreOrder get (Properties ctx, int M_PreOrder_ID, String trxName)
	{
		Integer key = new Integer (M_PreOrder_ID);
		MPreOrder retValue = (MPreOrder)s_cache.get(key);
		if (retValue == null)
		{
			retValue = new MPreOrder (ctx, M_PreOrder_ID, trxName);
			s_cache.put(key, retValue);
		}
		return retValue;		
	}	//	get
		


	/** Static Logger					*/
	private static CLogger 	s_log = CLogger.getCLogger(MPreOrder.class);
	/** Cache of Price Lists			*/
	private static CCache<Integer,MPreOrder> s_cache = new CCache<Integer,MPreOrder>("MPreOrder", 5);
	
	
	/**************************************************************************
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param M_BoE_ID id
	 *	@param trxName transaction
	 */
	public MPreOrder(Properties ctx, int M_PreOrder_ID, String trxName)
	{
		super(ctx, M_PreOrder_ID, trxName);
		if (M_PreOrder_ID == 0)
		{
		}
	}	//	MPreOrder

	/**
	 * 	Load Cosntructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MPreOrder (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MPreOrder

	/**
	 * 	Overwrite Client/Org if required
	 * 	@param AD_Client_ID client
	 * 	@param AD_Org_ID org
	 */
	public void setClientOrg (int AD_Client_ID, int AD_Org_ID)
	{
		super.setClientOrg(AD_Client_ID, AD_Org_ID);
	}	//	setClientOrg
	
	
	
	/**************************************************************************
	 * 	Before Save
	 *	@param newRecord new
	 *	@return true
	 */
	protected boolean beforeSave (boolean newRecord)
	{
		log.fine("");

		//	Currency
		if (getC_Currency_ID() == 0)
		{
			//String sql = "SELECT C_Currency_ID FROM M_PriceList WHERE M_PriceList_ID=(SELECT M_PriceList_ID FROM M_PriceList_Version where M_PriceList_Version_ID=?)";
			String sql = "SELECT C_Currency_ID FROM M_PriceList WHERE M_PriceList_ID=?";
			int ii = DB.getSQLValue (null, sql, getM_PriceList_ID());
			if (ii != 0)
				setC_Currency_ID (ii);
			else
				setC_Currency_ID(Env.getContextAsInt(getCtx(), "#C_Currency_ID"));
		}
		return true;
	}
	
//	public boolean save()
//	{
//		if (!beforeSave(false))
//			return false;
//		return saveUpdate();
//	}	//	save
	
	
}	//	MPreOrder
