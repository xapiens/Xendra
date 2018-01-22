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

import org.compiere.model.persistence.X_C_BPartner_Points;
import org.compiere.process.DocAction;
import org.compiere.util.*;

/**
 *	Partner Points
 *	
 *  @author xapiens
 *  @version $Id: MBPartnerPoints.java 795 2008-02-23 20:16:13Z el_man $
 */
public class MBPartner_Points extends X_C_BPartner_Points
{
	/**
	 * 	Get Bill Of Exchange (cached)
	 *	@param ctx context
	 *	@param M_BoE_ID id
	 *	@param trxName transaction
	 *	@return Bill Of Exchange
	 */
	public static MBPartner_Points get (Properties ctx, int C_BPartner_Points, String trxName)
	{
		Integer key = new Integer (C_BPartner_Points);
		MBPartner_Points retValue = (MBPartner_Points)s_cache.get(key);
		if (retValue == null)
		{
			retValue = new MBPartner_Points (ctx, C_BPartner_Points, trxName);
			s_cache.put(key, retValue);
		}
		return retValue;		
	}	//	get
		


	/** Static Logger					*/
	private static CLogger 	s_log = CLogger.getCLogger(MBPartner_Points.class);
	/** Cache of Price Lists			*/
	private static CCache<Integer,MBPartner_Points> s_cache = new CCache<Integer,MBPartner_Points>("M_BOEGroup", 5);
	private MBOE m_parent = null;
	private MInvoice[] m_invoices;	
	
	
	/**************************************************************************
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param M_BoE_ID id
	 *	@param trxName transaction
	 */
	public MBPartner_Points(Properties ctx, int C_BPartner_Points, String trxName)
	{
		super(ctx, C_BPartner_Points, trxName);
		if (C_BPartner_Points == 0)
		{
//			setboeno(String)
//			setC_BankAccount_ID(int)
//			setC_BoE_ID(int)
//			setC_BPartner_ID(int)
//			setC_BPartner_Location_ID(int)
//			setC_Currency_ID(int)
//			setC_DocType_ID(int)
//			setC_DocTypeTarget_ID(int)
//			setDateAcct(Timestamp)
//			setdateboe(Timestamp)
//			setdatestatusboe(Timestamp)
//			setDescription(String)
//			setDocAction(String)
//			setDocStatus(String)
//			setDocumentNo(String)
//			setDueDate(Timestamp)
//			setGrandTotal(BigDecimal)
//			setguarantor_id(int)
//			setIsPaid(boolean)
//			setIsSOTrx(boolean)
//			setProcessed(boolean)
//			setstatusboe(String)			
		}
	}	//	MBPartnerPoints

	/**
	 * 	Load Cosntructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MBPartner_Points (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MBPartnerPoints


	/**
	 * 	Overwrite Client/Org if required
	 * 	@param AD_Client_ID client
	 * 	@param AD_Org_ID org
	 */
	public void setClientOrg (int AD_Client_ID, int AD_Org_ID)
	{
		super.setClientOrg(AD_Client_ID, AD_Org_ID);
	}	//	setClientOrg

	public static MBPartner_Points getbyBPartner(Properties ctx,Integer C_BPartner_ID) {
		MBPartner_Points retValue = null;
		String sql = "SELECT * FROM C_BPartner_Points WHERE C_BPartner_ID = ?";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement(sql, null);
			pstmt.setInt(1, C_BPartner_ID);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next())
				retValue = new MBPartner_Points (ctx, rs, null);
			else
			{
				MBPartner_Points points = new MBPartner_Points(ctx, 0, null);
				points.setC_BPartner_ID(C_BPartner_ID);
				points.setPoints(Env.ZERO);
				points.save();
				int C_BPartner_Points = points.getC_BPartner_Points_ID();
				retValue = new MBPartner_Points(ctx, C_BPartner_Points, null);
			}
			rs.close();
			pstmt.close();
			pstmt = null;
		}
		catch (Exception e)
		{
			s_log.log(Level.SEVERE, sql, e);
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
		return retValue;		
	}
	
}	//	MBPartnerPoints
