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

import org.compiere.model.persistence.X_C_GroupDoc;
import org.compiere.util.*;

/**
 *	Document Group
 *	
 *  @author xapiens
 *  @version $Id: MGroupDoc.java 795 2008-02-23 20:16:13Z el_man $
 */
public class MGroupDoc extends X_C_GroupDoc
{
	/**
	 * 	Get GroupDoc (cached)
	 *	@param ctx context
	 *	@param M_BoE_ID id
	 *	@param trxName transaction
	 *	@return Bill Of Exchange
	 */
	public static MGroupDoc get (Properties ctx, int M_GroupDoc_ID, String trxName)
	{
		Integer key = new Integer (M_GroupDoc_ID);
		MGroupDoc retValue = (MGroupDoc)s_cache.get(key);
		if (retValue == null)
		{
			retValue = new MGroupDoc (ctx, M_GroupDoc_ID, trxName);
			s_cache.put(key, retValue);
		}
		return retValue;		
	}	//	get
		


	/** Static Logger					*/
	private static CLogger 	s_log = CLogger.getCLogger(MGroup.class);
	/** Cache of Price Lists			*/
	private static CCache<Integer,MGroupDoc> s_cache = new CCache<Integer,MGroupDoc>("C_GroupDoc", 5);
	
	
	/**************************************************************************
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param M_BoE_ID id
	 *	@param trxName transaction
	 */
	public MGroupDoc(Properties ctx, int M_GroupDoc_ID, String trxName)
	{
		super(ctx, M_GroupDoc_ID, trxName);
		if (M_GroupDoc_ID == 0)
		{
			
		}
	}	//	MGroupDoc

	/**
	 * 	Load Cosntructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MGroupDoc (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MGroupDoc

	/**
	 * 	Overwrite Client/Org if required
	 * 	@param AD_Client_ID client
	 * 	@param AD_Org_ID org
	 */
	public void setClientOrg (int AD_Client_ID, int AD_Org_ID)
	{
		super.setClientOrg(AD_Client_ID, AD_Org_ID);
	}	//	setClientOrg

}	//	MGroupDoc
