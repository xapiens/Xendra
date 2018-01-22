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
import java.util.logging.Level;

import org.compiere.model.persistence.X_C_InvoiceAdvance;
import org.compiere.util.*;

/**
 *	Invoice Advance
 *	
 *  @author xapiens
 *  @version $Id
 */
public class MInvoiceAdvance extends X_C_InvoiceAdvance
{
	
	/**
	 * 	Get MInvoiceAdvance (cached)
	 *	@param ctx context
	 *	@param C_InvoiceAdvance_ID id
	 *	@param trxName transaction
	 *	@return Invoice Advance
	 */
	public static MInvoiceAdvance get (Properties ctx, int C_InvoiceAdvance_ID, String trxName)
	{
		Integer key = new Integer (C_InvoiceAdvance_ID);
		MInvoiceAdvance retValue = (MInvoiceAdvance)s_cache.get(key);
		if (retValue == null)
		{
			retValue = new MInvoiceAdvance (ctx, C_InvoiceAdvance_ID, trxName);
			s_cache.put(key, retValue);
		}
		return retValue;		
	}	//	get
		
	/** Static Logger					*/
	private static CLogger 	s_log = CLogger.getCLogger(MInvoiceAdvance.class);
	/** Cache of Price Lists			*/
	private static CCache<Integer,MInvoiceAdvance> s_cache = new CCache<Integer,MInvoiceAdvance>("C_InvoiceAdvance", 5);
	
	
	/**************************************************************************
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param C_InvoiceAdvance_ID id
	 *	@param trxName transaction
	 */
	public MInvoiceAdvance(Properties ctx, int C_InvoiceAdvance_ID, String trxName)
	{
		super(ctx, C_InvoiceAdvance_ID, trxName);
		if (C_InvoiceAdvance_ID == 0)
		{
			
		}
	}	//	MInvoiceAdvance

	/**
	 * 	Load Cosntructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MInvoiceAdvance (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MInvoiceAdvance


	public static MInvoiceAdvance getByInvoice(Properties ctx, int C_Invoice_ID, String trxName)
	{
		MInvoiceAdvance ia = null;
		String sql = "SELECT * FROM C_InvoiceAdvance WHERE C_Invoice_ID=?";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement(sql, trxName);
			pstmt.setInt(1, C_Invoice_ID);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next())
				ia =  new MInvoiceAdvance(ctx, rs, trxName);
			rs.close();
			pstmt.close();
			pstmt = null;
		}
		catch (Exception e)
		{
			s_log.log(Level.SEVERE, sql, e);
		}
		try
		{
			if (pstmt != null)
				pstmt.close();
			pstmt = null;
		}
		catch (Exception e)
		{
			pstmt = null;
		}
		return ia;
	}

	public static MInvoiceAdvance getByInvoiceLine(Properties ctx,
			int cInvoiceLineID, String trxName) {		
		MInvoiceAdvance ia = null;
		String whereClause = " C_InvoiceLine_ID=?";
		MInvoiceAdvanceLine ial = new Query(Env.getCtx(), MInvoiceAdvanceLine.Table_Name , whereClause, null)
		  .setParameters(cInvoiceLineID)
		  .firstOnly();
		ia = ial.getParent();
		return ia;
	}
	
	/**
	 * 	Overwrite Client/Org if required
	 * 	@param AD_Client_ID client
	 * 	@param AD_Org_ID org
	 */
	public void setClientOrg (int AD_Client_ID, int AD_Org_ID)
	{
		super.setClientOrg(AD_Client_ID, AD_Org_ID);
	}	//	setClientOrg

	public static MInvoiceAdvance getByInvoiceAdvanceLine(Properties ctx,
			int C_InvoiceAdvanceLine_ID, Object object) {
		MInvoiceAdvance ia = null;
		String whereClause = " C_InvoiceAdvanceLine_ID=?";
		MInvoiceAdvanceLine ial = new Query(Env.getCtx(), MInvoiceAdvanceLine.Table_Name , whereClause, null)
		  .setParameters(C_InvoiceAdvanceLine_ID)
		  .firstOnly();
		ia = ial.getParent();
		return ia;
	}
		
}	//	MInvoiceAdvance
