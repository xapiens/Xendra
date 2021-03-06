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
package org.compiere.wf;

import java.sql.*;
import java.util.*;
import org.compiere.model.persistence.X_AD_WF_Block;
import org.compiere.util.*;



/**
 *	Work Flow Commitment Block
 *	
 *  @author Jorg Janke
 *  @version $Id: MWFBlock.java 3659 2011-11-04 02:32:55Z xapiens $
 */
public class MWFBlock extends X_AD_WF_Block
{
	/**
	 * 	Get MWFBlock from Cache
	 *	@param ctx context
	 *	@param AD_WF_Block_ID id
	 *	@return MWFBlock
	 */
	public static MWFBlock get (Properties ctx, int AD_WF_Block_ID)
	{
		Integer key = new Integer (AD_WF_Block_ID);
		MWFBlock retValue = (MWFBlock) s_cache.get (key);
		if (retValue != null)
			return retValue;
		retValue = new MWFBlock (ctx, AD_WF_Block_ID, null);
		if (retValue.get_ID () != 0)
			s_cache.put (key, retValue);
		return retValue;
	} //	get

	/**	Cache						*/
	private static CCache<Integer,MWFBlock>	s_cache	= new CCache<Integer,MWFBlock>("AD_WF_Block", 20);
	
	
	/**
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param AD_WF_Block_ID id
	 * 	@param trxName transaction
	 */
	public MWFBlock (Properties ctx, int AD_WF_Block_ID, String trxName)
	{
		super (ctx, AD_WF_Block_ID, trxName);
	}	//	MWFBlock

	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 * 	@param trxName transaction
	 */
	public MWFBlock (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MWFBlock
	
}	//	MWFBlock
