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

import org.compiere.model.persistence.X_C_BOEStatement;
import org.compiere.process.DocAction;
import org.compiere.util.*;

/**
 *	Bill Of Exchange
 *	
 *  @author xapiens
 *  @version $Id: MBoE.java 795 2008-02-23 20:16:13Z el_man $
 */
public class MBOEStatement extends X_C_BOEStatement
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public static MBOEStatement get(Integer C_BOE_ID, String status, String trxName) {
		String sql = "SELECT * FROM C_BOEStatement WHERE C_BOE_ID=?  AND status=?";
		PreparedStatement pstmt = null;
		MBOEStatement boestatement = null;
		try
		{
			pstmt = DB.prepareStatement(sql, trxName);
			pstmt.setInt(1, C_BOE_ID);
			pstmt.setString(2, status);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				boestatement = new MBOEStatement(Env.getCtx(), rs, trxName);
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
		return boestatement;
	}
	
	/**
	 * 	Get Bill Of Exchange (cached)
	 *	@param ctx context
	 *	@param M_BoE_ID id
	 *	@param trxName transaction
	 *	@return Bill Of Exchange
	 */
	public static MBOEStatement get (Properties ctx, int M_BoE_ID, String trxName)
	{
		Integer key = new Integer (M_BoE_ID);
		MBOEStatement retValue = (MBOEStatement)s_cache.get(key);
		if (retValue == null)
		{
			retValue = new MBOEStatement (ctx, M_BoE_ID, trxName);
			s_cache.put(key, retValue);
		}
		return retValue;		
	}	//	get
		


	/** Static Logger					*/
	private static CLogger 	s_log = CLogger.getCLogger(MBOEStatement.class);
	/** Cache of Price Lists			*/
	private static CCache<Integer,MBOEStatement> s_cache = new CCache<Integer,MBOEStatement>("M_BOE", 5);
	

	/**************************************************************************
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param M_BoE_ID id
	 *	@param trxName transaction
	 */
	public MBOEStatement(Properties ctx, int M_BOE_ID, String trxName)
	{
		super(ctx, M_BOE_ID, trxName);
		if (M_BOE_ID == 0)
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
	}	//	MBoE

	
	/**
	 * 	Load Cosntructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MBOEStatement (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MBOE


	/**
	 * 	Overwrite Client/Org if required
	 * 	@param AD_Client_ID client
	 * 	@param AD_Org_ID org
	 */
	public void setClientOrg (int AD_Client_ID, int AD_Org_ID)
	{
		super.setClientOrg(AD_Client_ID, AD_Org_ID);
	}	//	setClientOrg

	public void setBOE(MBOE boe) {
		setAD_Client_ID(boe.getAD_Client_ID());
		setAD_Org_ID(boe.getAD_Org_ID());
		setC_BOE_ID(boe.getC_BOE_ID());		
		setC_Currency_ID(boe.getC_Currency_ID());
		setBOEAmt(boe.getGrandTotal());
		setC_BankAccount_ID(boe.getC_BankAccount_ID());
		setStatusDate(boe.getStatusDate());
		setDateAcct(boe.getStatusDate());		
	}

	public MAccount getAccount(MAcctSchema as) {
		String sql = null;
		int C_ValidCombination_ID = 0;
		MAccount acct = null;
		if (this.getStatus().equals(DocAction.STATUS_Warranty) )		
			sql = "SELECT boe_wr_acct FROM C_BankAccount_Acct WHERE C_BankAccount_ID=? AND C_AcctSchema_ID=?";
		else if (this.getStatus().equals(DocAction.STATUS_Receivables) )
			sql = "SELECT boe_rv_acct FROM C_BankAccount_Acct WHERE C_BankAccount_ID=? AND C_AcctSchema_ID=?";
		else if (this.getStatus().equals(DocAction.STATUS_Discount) )
			sql = "SELECT boe_ds_acct FROM C_BankAccount_Acct WHERE C_BankAccount_ID=? AND C_AcctSchema_ID=?";
		else if (this.getStatus().equals(DocAction.STATUS_Protested) )
			sql = "SELECT boe_pd_acct FROM C_BankAccount_Acct WHERE C_BankAccount_ID=? AND C_AcctSchema_ID=?";
		C_ValidCombination_ID = DB.getSQLValue(null, sql, getC_BankAccount_ID(), as.getC_AcctSchema_ID());
		if (C_ValidCombination_ID > 0)			
			acct = MAccount.get (as.getCtx(), C_ValidCombination_ID);
		return acct;		
	}
}	//	MBoE
