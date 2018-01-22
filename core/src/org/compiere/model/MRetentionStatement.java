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

import org.compiere.model.persistence.X_C_RetentionStatement;
import org.compiere.process.DocAction;
import org.compiere.util.*;

/**
 *	SPOT - retention statement
 *	
 *  @author xapiens
 *  @version $Id: MBoE.java 795 2008-02-23 20:16:13Z el_man $
 */
public class MRetentionStatement extends X_C_RetentionStatement
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * 	Get Retention Statement (cached)
	 *	@param ctx context
	 *	@param M_RetentionStatement_ID id
	 *	@param trxName transaction
	 *	@return Retention Statement
	 */
	public static MRetentionStatement get (Properties ctx, int M_RetentionStatement_ID, String trxName)
	{
		Integer key = new Integer (M_RetentionStatement_ID);
		MRetentionStatement retValue = (MRetentionStatement)s_cache.get(key);
		if (retValue == null)
		{
			retValue = new MRetentionStatement (ctx, M_RetentionStatement_ID, trxName);
			s_cache.put(key, retValue);
		}
		return retValue;		
	}	//	get
		


	/** Static Logger					*/
	private static CLogger 	s_log = CLogger.getCLogger(MRetentionStatement.class);
	/** Cache of Price Lists			*/
	private static CCache<Integer,MRetentionStatement> s_cache = new CCache<Integer,MRetentionStatement>("MRetentionStatement", 5);
	

	/**************************************************************************
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param M_RetentionStatement_ID id
	 *	@param trxName transaction
	 */
	public MRetentionStatement(Properties ctx, int M_RetentionStatement_ID, String trxName)
	{
		super(ctx, M_RetentionStatement_ID, trxName);
		if (M_RetentionStatement_ID == 0)
		{
			setDocStatus(DocAction.STATUS_Completed);
		}
	}	//	RetentionStatement

	
	/**
	 * 	Load Cosntructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MRetentionStatement (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	RetentionStatement


	/**
	 * 	Overwrite Client/Org if required
	 * 	@param AD_Client_ID client
	 * 	@param AD_Org_ID org
	 */
	public void setClientOrg (int AD_Client_ID, int AD_Org_ID)
	{
		super.setClientOrg(AD_Client_ID, AD_Org_ID);
	}	//	setClientOrg

	public void setRetention(MRetention retention) {
		setAD_Client_ID(retention.getAD_Client_ID());
		setAD_Org_ID(retention.getAD_Org_ID());
		setC_Retention_ID(retention.getC_Retention_ID());		
		setDateDoc(retention.getStatusDate());
		setDateAcct(retention.getStatusDate());
		setTaxAmt(retention.getTaxAmt());
		setTaxBaseAmt(retention.getTaxBaseAmt());
	}


	public static MRetentionStatement get(int C_Retention_ID, String status) {
		String sql = "SELECT * FROM C_RetentionStatement WHERE C_Retention_ID=?  AND status=?";
		PreparedStatement pstmt = null;
		MRetentionStatement retstatement = null;
		try
		{
			pstmt = DB.prepareStatement(sql, null);
			pstmt.setInt(1, C_Retention_ID);
			pstmt.setString(2, status);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				retstatement = new MRetentionStatement(Env.getCtx(), rs, null);
			}
			rs.close();
			pstmt.close();
			pstmt = null;
		}
		catch (Exception e)
		{
			
		}
		finally
		{
			try
			{
				if (pstmt != null)
					pstmt.close ();
			}
			catch (Exception e)
			{}
			pstmt = null;
		}
		return retstatement;
		
	}


	public MRetention getMRetention() {
		MRetention ret = MRetention.get(Env.getCtx(), getC_Retention_ID(), null);
		return ret;
	}

}	//	MRetentionstamt
