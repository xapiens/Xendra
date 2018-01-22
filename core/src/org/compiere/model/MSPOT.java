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

import org.compiere.model.persistence.X_C_SPOT;
import org.compiere.process.DocAction;
import org.compiere.util.*;

/**
 *	SPOT - Sistema Pago Obligatorio de Tributos
 *	
 *  @author xapiens
 *  @version $Id
 */
public class MSPOT extends X_C_SPOT
{
	/**
	 * 	Get SPOT (cached)
	 *	@param ctx context
	 *	@param C_SPOT_ID id
	 *	@param trxName transaction
	 *	@return SPOT
	 */
	public static MSPOT get (Properties ctx, int C_SPOT_ID, String trxName)
	{
		Integer key = new Integer (C_SPOT_ID);
		MSPOT retValue = (MSPOT)s_cache.get(key);
		if (retValue == null)
		{
			retValue = new MSPOT (ctx, C_SPOT_ID, trxName);
			s_cache.put(key, retValue);
		}
		return retValue;		
	}	//	get
		


	/** Static Logger					*/
	private static CLogger 	s_log = CLogger.getCLogger(MSPOT.class);
	private static CCache<Integer,MSPOT> s_cache = new CCache<Integer,MSPOT>("C_SPOT", 5);
	
	
	/**************************************************************************
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param C_SPOT_ID id
	 *	@param trxName transaction
	 */
	public MSPOT(Properties ctx, int C_SPOT_ID, String trxName)
	{
		super(ctx, C_SPOT_ID, trxName);
		if (C_SPOT_ID == 0)
		{
			
		}
	}	//	MSPOT

	/**
	 * 	Load Cosntructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MSPOT (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MSPOT

	/**
	 * 	Overwrite Client/Org if required
	 * 	@param AD_Client_ID client
	 * 	@param AD_Org_ID org
	 */
	public void setClientOrg (int AD_Client_ID, int AD_Org_ID)
	{
		super.setClientOrg(AD_Client_ID, AD_Org_ID);
	}	//	setClientOrg
}	//	MSPOT
