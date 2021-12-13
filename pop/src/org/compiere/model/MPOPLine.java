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

import org.compiere.model.persistence.X_C_POPLine;
import org.compiere.util.*;

/**
 *	POP Line Configuration
 *	
 *  @author xapiens
 */
public class MPOPLine extends X_C_POPLine
{
	/**
	 * 	Get POSLine (cached)
	 *	@param ctx context
	 *	@param C_POPLine_ID id
	 *	@param trxName transaction
	 *	@return POS Line Configuration
	 */
	public static MPOPLine get (Properties ctx, int C_POPLine_ID, String trxName)
	{
		Integer key = new Integer (C_POPLine_ID);
		MPOPLine retValue = (MPOPLine)s_cache.get(key);
		if (retValue == null)
		{
			retValue = new MPOPLine (ctx, C_POPLine_ID, trxName);
			s_cache.put(key, retValue);
		}
		return retValue;		
	}	//	get
		


	/** Static Logger					*/
	private static CLogger 	s_log = CLogger.getCLogger(MPOPLine.class);
	/** Cache of Price Lists			*/
	private static CCache<Integer,MPOPLine> s_cache = new CCache<Integer,MPOPLine>("C_POPLine", 5);
	private MPOP m_parent = null;
	
	
	/**************************************************************************
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param C_POPLine_ID id
	 *	@param trxName transaction
	 */
	public MPOPLine(Properties ctx, int C_POPLine_ID, String trxName)
	{
		super(ctx, C_POPLine_ID, trxName);
		if (C_POPLine_ID == 0)
		{
			
		}
	}	//	MPOPLine

	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MPOPLine (Properties ctx, ResultSet rs, String trxName)
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

	public void setHeaderInfo(MPOP mpop) {
		m_parent = mpop;
		
	}

	public String toString()
	{
	StringBuffer sb = new StringBuffer ("MPOPLine[").append(get_ID()).append("]").append(this.getName());
	return sb.toString();
	}
}	//	MPOSLine
