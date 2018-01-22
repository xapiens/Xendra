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

import org.compiere.model.persistence.X_S_ResourceUnAvailable;
import org.compiere.util.*;


/**
 *	Resource Unavailable
 *	
 *  @author Jorg Janke
 *  @version $Id: MResourceUnAvailable.java 3654 2011-11-04 01:49:49Z xapiens $
 */
public class MResourceUnAvailable extends X_S_ResourceUnAvailable
{

	/**
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param S_ResourceUnAvailable_ID id
	 *	@param trxName trx 
	 */
	public MResourceUnAvailable (Properties ctx, int S_ResourceUnAvailable_ID, String trxName)
	{
		super (ctx, S_ResourceUnAvailable_ID, trxName);
	}	//	MResourceUnAvailable

	/**
	 * 	MResourceUnAvailable
	 *	@param ctx context
	 *	@param rs result set
	 */
	public MResourceUnAvailable (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MResourceUnAvailable
	
	
	/**
	 * 	Before Save
	 *	@param newRecord new
	 *	@return true
	 */
	protected boolean beforeSave (boolean newRecord)
	{
		if (getDateTo() == null)
			setDateTo(getDateFrom());
		if (getDateFrom().after(getDateTo()))
		{
			log.saveError("Error", Msg.parseTranslation(getCtx(), "@DateTo@ > @DateFrom@"));
			return false;
		}
		return true;
	}	//	beforeSave
	
}	//	MResourceUnAvailable
