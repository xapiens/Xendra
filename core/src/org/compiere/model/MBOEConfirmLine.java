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

import org.compiere.model.persistence.X_C_BOEConfirmLine;
import org.compiere.util.*;

/**
 *	Bill Of Exchange
 *	
 *  @author xapiens
 *  @version $Id: MBOELine.java 795 2008-02-23 20:16:13Z el_man $
 */
public class MBOEConfirmLine extends X_C_BOEConfirmLine
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -674817729876871506L;


	/**
	 * 	Get Bill Of Exchange (cached)
	 *	@param ctx context
	 *	@param M_BOEConfirmLine_ID id
	 *	@param trxName transaction
	 *	@return Bill Of Exchange
	 */
	public static MBOEConfirmLine get (Properties ctx, int M_BOEConfirmLine_ID, String trxName)
	{
		Integer key = new Integer (M_BOEConfirmLine_ID);
		MBOEConfirmLine retValue = (MBOEConfirmLine)s_cache.get(key);
		if (retValue == null)
		{
			retValue = new MBOEConfirmLine (ctx, M_BOEConfirmLine_ID, trxName);
			s_cache.put(key, retValue);
		}
		return retValue;		
	}	//	get
		


	/** Static Logger					*/
	private static CLogger 	s_log = CLogger.getCLogger(MBOEConfirmLine.class);
	/** Cache of Price Lists			*/
	private static CCache<Integer,MBOEConfirmLine> s_cache = new CCache<Integer,MBOEConfirmLine>("M_BOEConfirmLine", 5);
	private MBOEConfirm m_parent = null;	
	
	
	/**************************************************************************
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param M_BoE_ID id
	 *	@param trxName transaction
	 */
	public MBOEConfirmLine(Properties ctx, int M_BOEConfirmLine_ID, String trxName)
	{
		super(ctx, M_BOEConfirmLine_ID, trxName);
		if (M_BOEConfirmLine_ID == 0)
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
	}	//	MBOELine

	/**
	 * 	Load Cosntructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MBOEConfirmLine (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MBOEConfirmLine

	public MBOEConfirmLine(MBOEConfirm boeconfirm) {
		this (boeconfirm.getCtx(), 0, boeconfirm.get_TrxName());
		if (boeconfirm.get_ID() == 0)
			throw new IllegalArgumentException("Header not saved");
		setC_BOEConfirm_ID (boeconfirm.getC_BOEConfirm_ID());	//	parent
		setBOEConfirm(boeconfirm);		
	}

	private void setBOEConfirm(MBOEConfirm boeconfirm) {
		setClientOrg(boeconfirm);
		//
		setHeaderInfo(boeconfirm);	//	sets m_order
		//	Don't set Activity, etc as they are overwrites		
	}
	
	/**
	 * 	Set Header Info
	 *	@param boe boe
	 */
	public void setHeaderInfo (MBOEConfirm boeconfirm)
	{
		m_parent = boeconfirm;
	}	//	setHeaderInfo
	

	/**
	 * 	Overwrite Client/Org if required
	 * 	@param AD_Client_ID client
	 * 	@param AD_Org_ID org
	 */
	public void setClientOrg (int AD_Client_ID, int AD_Org_ID)
	{
		super.setClientOrg(AD_Client_ID, AD_Org_ID);
	}	//	setClientOrg
	

	
}	//	MBOELine
