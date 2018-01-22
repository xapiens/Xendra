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
package org.compiere.print;

import org.compiere.model.persistence.X_AD_ReportView;
import org.compiere.util.CCache;
import org.compiere.util.DB;
import org.compiere.util.Env;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

/**
 *	Table Print Format
 *
 * 	@author 	Sergio Aguayo
 * 	@version 	$Id: MReportView.java 4599 2013-01-07 05:40:19Z xapiens $
 */
public class MReportView extends X_AD_ReportView {
	/** Cached Views						*/
	static private CCache<Integer,MReportView> s_formats = new CCache<Integer,MReportView>("AD_ReportView", 30);

	/**
	 *	Standard Constructor
	 *  @param ctx context
	 *  @param AD_ReportView_ID table format
	 *  @param trxName transaction
	 */
	public MReportView(Properties ctx, int AD_ReportView_ID, String trxName) {
		super(ctx, AD_ReportView_ID, trxName);
	}
	
	/** Load Constructor 
	@param ctx context
	@param rs result set 
	@param trxName transaction
	*/
	public MReportView (Properties ctx, ResultSet rs, String trxName)
	{
		super (ctx, rs, trxName);
	}
	
	/**
	 * Obtains the specified object, identified by the primary key.
	 * @param ctx	context
	 * @param AD_ReportView_ID table format
	 * @param readFromDisk use cache or not
	 * @return the newly created object
	 */
	public static MReportView get(Properties ctx, int AD_ReportView_ID, boolean readFromDisk) {
		Integer key = new Integer(AD_ReportView_ID);
		MReportView pf = null;
		if (!readFromDisk)
			pf = (MReportView)s_formats.get(key);
		if (pf == null)
		{
			pf = new MReportView (ctx, AD_ReportView_ID, null);
			s_formats.put(key, pf);
		}
		return pf;
	}

	public static MReportView getbyIdentifier(String identifier) {
		if (identifier == null || identifier.length() == 0)
			return null;
		MReportView retValue = null;
		String sql = "SELECT AD_ReportView_ID FROM AD_ReportView WHERE Identifier=?";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, null);
			pstmt.setString (1, identifier);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next ())
			{
				retValue = new MReportView (Env.getCtx(), rs.getInt(1), null);
			}
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			e.printStackTrace();
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
		return retValue;		
	}
}
