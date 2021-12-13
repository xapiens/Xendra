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

import org.compiere.model.persistence.X_C_POSLine;
import org.compiere.util.*;

/**
 *	POS Line Configuration
 *	
 *  @author xapiens
 */
public class MPOSLine extends X_C_POSLine
{
	/**
	 * 	Get POSLine (cached)
	 *	@param ctx context
	 *	@param C_POSLine_ID id
	 *	@param trxName transaction
	 *	@return POS Line Configuration
	 */
	public static MPOSLine get (Properties ctx, int C_POSLine_ID, String trxName)
	{
		Integer key = new Integer (C_POSLine_ID);
		MPOSLine retValue = (MPOSLine)s_cache.get(key);
		if (retValue == null)
		{
			retValue = new MPOSLine (ctx, C_POSLine_ID, trxName);
			s_cache.put(key, retValue);
		}
		return retValue;		
	}	//	get
		


	/** Static Logger					*/
	private static CLogger 	s_log = CLogger.getCLogger(MPOSLine.class);
	/** Cache of Price Lists			*/
	private static CCache<Integer,MPOSLine> s_cache = new CCache<Integer,MPOSLine>("C_POSLine", 5);
	private MPOS m_parent = null;
	
	
	/**************************************************************************
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param C_POSLine_ID id
	 *	@param trxName transaction
	 */
	public MPOSLine(Properties ctx, int C_POSLine_ID, String trxName)
	{
		super(ctx, C_POSLine_ID, trxName);
		if (C_POSLine_ID == 0)
		{
			
		}
	}	//	MPOSLine

	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MPOSLine (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MPOSLine


	/**
	 * 	Overwrite Client/Org if required
	 * 	@param AD_Client_ID client
	 * 	@param AD_Org_ID org
	 */
	public void setClientOrg (int AD_Client_ID, int AD_Org_ID)
	{
		super.setClientOrg(AD_Client_ID, AD_Org_ID);
	}	//	setClientOrg

	public void setHeaderInfo(MPOS mpos) {
		m_parent = mpos;
		
	}
	
}	//	MPOSLine
