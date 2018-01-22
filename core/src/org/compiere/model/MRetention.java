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

import java.io.File;
import java.math.*;
import java.sql.*;
import java.util.*;
import java.util.logging.*;

import org.compiere.model.persistence.X_C_Retention;
import org.compiere.model.reference.REF_C_DocTypeDocBaseType;
import org.compiere.process.DocAction;
import org.compiere.process.DocumentEngine;
import org.compiere.util.*;
import org.xendra.exceptions.ConversionRateException;
import org.xendra.exceptions.XendraException;

/**
 *	SPOT - Sistema Pago Obligatorio de Tributos
 *	Retention
 * 
 *  @author xapiens
 *  @version $Id
 */
public class MRetention extends X_C_Retention implements DocAction
{
	/**
	 * 	Set Target Document Type
	 * 	@param DocBaseType doc type REF_C_DocTypeDocBaseType.
	 */
	public void setC_DocTypeID (String DocBaseType)
	{
		String sql = "SELECT C_DocType_ID FROM C_DocType "
			+ "WHERE AD_Client_ID=? AND DocBaseType=?"
			+ " AND IsActive='Y' "
			+ "ORDER BY IsDefault DESC";
		int C_DocType_ID = DB.getSQLValue(null, sql, getAD_Client_ID(), DocBaseType);
		if (C_DocType_ID <= 0)
			log.log(Level.SEVERE, "Not found for AC_Client_ID=" 
				+ getAD_Client_ID() + " - " + DocBaseType);
		else
		{
			sql = "SELECT C_ConversionType_ID FROM C_DocType "
				+ "WHERE C_DocType_ID = ?";
			int C_ConversionType_ID = DB.getSQLValue(null, sql, C_DocType_ID);
			if (C_ConversionType_ID <= 0)
				log.log(Level.SEVERE, "Not found for AC_Client_ID=" 
					+ getAD_Client_ID() + " - " + C_ConversionType_ID);
			else
			{
				log.fine(DocBaseType);
				setC_DocType_ID (C_DocType_ID);
				setC_ConversionType_ID(C_ConversionType_ID);				
			}
		}
	}	//	setC_DocTypeTarget_ID
	
	/**************************************************************************
	 * 	Before Save
	 *	@param newRecord new
	 *	@return true
	 */
	protected boolean beforeSave (boolean newRecord)
	{
		if (getC_DocType_ID() == 0)
			setC_DocTypeID(REF_C_DocTypeDocBaseType.Retention);
		if (getC_DocType_ID() == 0 || this.getC_ConversionType_ID() == 0)
			return false;
		return true;		
	}	
	/**
	 * 	Get SPOT (cached)
	 *	@param ctx context
	 *	@param C_SPOT_ID id
	 *	@param trxName transaction
	 *	@return SPOT
	 */
	public static MRetention get (Properties ctx, int C_Retention_ID, String trxName)
	{
		Integer key = new Integer (C_Retention_ID);
		MRetention retValue = (MRetention)s_cache.get(key);
		if (retValue == null)
		{
			retValue = new MRetention (ctx, C_Retention_ID, trxName);
			s_cache.put(key, retValue);
		}
		return retValue;		
	}	//	get
		


	/** Static Logger					*/
	private static CLogger 	s_log = CLogger.getCLogger(MRetention.class);
	private static CCache<Integer,MRetention> s_cache = new CCache<Integer,MRetention>("C_Retention", 5);
	private static BigDecimal ONEHUNDRED = new BigDecimal(100);
	private Object m_processMsg;
	private String m_status;
	private String m_action;
	private int C_SPOT_ID = Env.getContextAsInt(Env.getCtx(), "$C_SPOT_ID");
	private Integer schema = Env.getContextAsInt(Env.getCtx(), "$C_AcctSchema_ID");
	//private MSPOT spot = null;
	private MAcctSchema s_AcctSchema = null;
	private String m_TextMsg;
	private static MSPOT spot = MSPOT.get(Env.getCtx(), Env.getContextAsInt(Env.getCtx(), "$C_SPOT_ID"), null);

	/**************************************************************************
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param C_Retention_ID id
	 *	@param trxName transaction
	 */
	public MRetention(Properties ctx, int C_Retention_ID, String trxName)
	{
		super(ctx, C_Retention_ID, trxName);
		if (C_Retention_ID == 0)
		{
			setDocStatus (DocAction.STATUS_Drafted);		//	Draft
			setDocAction(DocAction.ACTION_Complete);			
		}
		spot = new MSPOT(Env.getCtx(), C_SPOT_ID, get_TrxName());
		s_AcctSchema = new MAcctSchema (Env.getCtx(), schema, null);
	}	//	MRetention

	/**
	 * 	Load Cosntructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MRetention (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MRetention


	/**
	 * 	Overwrite Client/Org if required
	 * 	@param AD_Client_ID client
	 * 	@param AD_Org_ID org
	 */
	public void setClientOrg (int AD_Client_ID, int AD_Org_ID)
	{
		super.setClientOrg(AD_Client_ID, AD_Org_ID);
	}	//	setClientOrg

	public static BigDecimal calculateRetention(BigDecimal totaldocConverted, Integer C_Currency_ID) {									
		BigDecimal retention = Env.ZERO;
		if ( spot != null )
		{
			BigDecimal multiplier = spot.getC_RetentionRate().divide(ONEHUNDRED, 12, BigDecimal.ROUND_HALF_UP);
			int precision = MCurrency.getStdPrecision(Env.getCtx(), C_Currency_ID);
			retention = totaldocConverted.multiply (multiplier).setScale(precision, BigDecimal.ROUND_HALF_UP);
		}
		return retention;
	}

	public static MRetention[] getGroup(int mCGroupDoc_ID, String trxName) {
		String where = "C_GroupDoc_ID = ?";
		List<MRetention> listretentions = new Query(Env.getCtx(), MRetention.Table_Name, where, trxName).setParameters(mCGroupDoc_ID).list();
		MRetention[] retentions = new MRetention[listretentions.size ()];
		listretentions.toArray(retentions);
		return retentions;		
	}
	
	/**************************************************************************
	 * 	Process document
	 *	@param processAction document action
	 *	@return true if performed
	 */
	public boolean processIt(String processAction) throws Exception {
		boolean processit;
		m_processMsg = null;
		m_status = getDocStatus();

		if (isValidAction(getDocAction()))	//	User Selection second
			m_action = getDocAction();
		else 
			return true;	
		if (DocAction.ACTION_ToCollect.equals(m_action))
			return ToCollectIt();			
		else if (DocAction.ACTION_Collect.equals(m_action))
			return CollectIt();
		else if (DocAction.ACTION_Apply.equals(m_action))
			return ApplyIt();
		return false;
	}

	private boolean ToCollectIt() {
		try {
			MInvoice invoice = MInvoice.get(Env.getCtx(), getC_Invoice_ID());
			BigDecimal rate = MConversionRate.getRate( getC_Currency_ID(), invoice.getC_Currency_ID(),
					getStatusDate(), invoice.getC_ConversionType_ID(),
					getAD_Client_ID(), getAD_Org_ID());
				if (rate == null)
					throw new ConversionRateException(Env.ZERO,getC_Currency_ID(), invoice.getC_Currency_ID(),invoice.getC_ConversionType_ID(),getStatusDate() );			

			MGroupDoc group = new MGroupDoc(Env.getCtx(), getC_GroupDoc_ID(), get_TrxName() );
			MAllocation alloc = new MAllocation();
			//MAllocationHdr alloc = null;
			if ( group.getC_AllocationHdr_ID() == 0)
			{
				if (!alloc.addHeader(getAD_Org_ID(),getStatusDate(), getStatusDate(), getC_Currency_ID(), get_TrxName()))
					throw new XendraException("Could not create Allocation Hdr");
				
//				alloc = new MAllocationHdr(getCtx(),
//						false /* is manual */, 
//						getStatusDate(), 
//						getC_Currency_ID(),
//						Msg.translate(getCtx(), "C_Retention_ID") + ": " + getC_Retention_ID(), 
//						get_TrxName());
//				alloc.setAD_Org_ID(getAD_Org_ID());	
				//if (!alloc.save())
//					throw new XendraException("Could not create Allocation Hdr");
				group.setC_AllocationHdr_ID(alloc.getC_AllocationHdr_ID());
				group.setC_BPartner_ID(getC_BPartner_ID());
				group.save(get_TrxName());
			}
			else
			{
				//alloc = new MAllocationHdr(Env.getCtx(), group.getC_AllocationHdr_ID(), get_TrxName());
				alloc = MAllocation.get(group.getC_AllocationHdr_ID(), get_TrxName());
				//if (!alloc.addHeader(getAD_Org_ID(), getStatusDate(), getStatusDate(), getC_Currency_ID(), get_TrxName()))
				//	throw new XendraException("Could not create Allocation Hdr");
			}
			if (!alloc.addLine(this))
				throw new XendraException("");
			if (!alloc.completeIt())
				throw new XendraException("");
			if (!alloc.save())
				throw new XendraException("");
//			MAllocationLine aLine = null;
//			aLine = new MAllocationLine (alloc, getTaxAmt(), Env.ZERO, Env.ZERO, Env.ZERO);
//			aLine.setDateTrx(getStatusDate());
//			aLine.setC_Invoice_ID(getC_Invoice_ID());
//			aLine.setAD_Table_ID(MRetention.Table_ID);
//			aLine.setRecord_ID(getC_Retention_ID());
//			aLine.setC_Currency_ID(getC_Currency_ID());
//			aLine.setC_BPartner_ID(getC_BPartner_ID());
//			if (!aLine.save(get_TrxName()))
//				throw new XendraException("Could not create Allocation Line");
//			alloc.setDocStatus(alloc.completeIt());
//			alloc.save();
			setC_GroupDoc_ID(0);
			if (changestate(DocAction.ACTION_None, DocAction.STATUS_ToCollect))
			{
				setDocAction(DocAction.ACTION_Collect);
				setDocStatus(DocAction.STATUS_ToCollect);
			}
		} catch (Exception e )
		{
			m_processMsg = e.getMessage();
			return false;
		}
		return true;
	}
	
	private boolean CollectIt() {
		if ( changestate(DocAction.ACTION_None, DocAction.STATUS_Collect) )
		{
			setDocAction(DocAction.ACTION_Apply);
			setDocStatus(DocAction.STATUS_Collect);
			return true;
		}
		return false;
	}

	private boolean ApplyIt() {
		if ( changestate(DocAction.ACTION_None, DocAction.STATUS_Apply) )
		{
			setDocAction(DocAction.ACTION_None);
			setDocStatus(DocAction.STATUS_Apply);
			return true;
		}
		return false;
	}
	
	private Boolean changestate(String action, String status) {
		if ( getStatusDate() != null)
		{
			String PreStatus = getDocStatus();
			MRetentionStatement statement = new MRetentionStatement(this.getCtx(), 0, get_TrxName());
			statement.setRetention(this);
			statement.setDocumentNo(getDocumentNo());
			statement.setPreStatus(PreStatus);			
			statement.setStatus(status);
			statement.setC_ConversionType_ID(getC_ConversionType_ID());
			statement.setC_Currency_ID(getC_Currency_ID());
			statement.setDocStatus(DocAction.STATUS_Completed);		
			statement.setDateDoc(getDateRetention());
			statement.setDateAcct(getStatusDate());				
			statement.setProcessed(true);
			statement.save();
			return true;
		}
		else
		{
			m_TextMsg = "la fecha de la retencion "+this.getDocumentNo()+" es nula";
		}
		return false;
	}

	private boolean isValidAction(String action) {
		String[] options = getActionOptions();
		for (int i = 0; i < options.length; i++)
		{
			if (options[i].equals(action))
				return true;
		}
		return false;
	}
	
	public String[] getActionOptions()
	{
		if (isDrafted())
			return new String[] {DocAction.ACTION_ToCollect};
		if (isToCollect())
			return new String[] {DocAction.ACTION_Collect};
		if (isCollect())
			return new String[] {DocAction.ACTION_Apply};
		if (isApply())
			return new String[] {DocAction.ACTION_Close};
		return new String[] {};
	}	//	getActionOptions
	
	public boolean isDrafted()
	{		return DocAction.STATUS_Drafted.equals(m_status);		}	

	public boolean isToCollect()
	{		return DocAction.STATUS_ToCollect.equals(m_status);		}	

	public boolean isCollect()
	{		return DocAction.STATUS_Collect.equals(m_status);		}	

	public boolean isApply()
	{		return DocAction.STATUS_Apply.equals(m_status);		}	
	
	/**
	 *  Get Retention Account
	 *  @param C_Charge_ID charge
	 *  @param as account schema
	 *  @param amount amount for expense(+)/revenue(-)
	 *  @return BOE Account or null
	 */
	public static MAccount getAccount (MAcctSchema as, String status)
	{
		if (as == null)
			return null;

		String accountcolumn = "";
		if (status.equals(DocAction.STATUS_ToCollect) )
			accountcolumn = "retention_tocollect_acct";
		else if (status.equals(DocAction.STATUS_Collect))
			accountcolumn = "retention_collect_acct";
		else if(status.equals(DocAction.STATUS_Apply))
			accountcolumn = "retention_apply_acct";
		else
			return null;
		String sql = "SELECT "+ accountcolumn +" FROM c_retention_acct WHERE C_AcctSchema_ID=?";
		int Account_ID = 0;
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql, null);
			pstmt.setInt (1, as.getC_AcctSchema_ID());
			ResultSet rs = pstmt.executeQuery();
			if (rs.next())
				Account_ID = rs.getInt(1);
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			s_log.log(Level.SEVERE, sql, e);
			return null;
		}
		//	No account
		if (Account_ID == 0)
		{
			s_log.severe ("NO account for status=" + status);
			return null;
		}

		//	Return Account
		MAccount acct = MAccount.get (as.getCtx(), Account_ID);
		return acct;
	}   //  getAccount

	public boolean isactive(BigDecimal totalgroupConverted) {
		if (totalgroupConverted == null)
			return false;
		return ( totalgroupConverted.compareTo(spot.getC_RetentionMinAmt()) > 0 ); 
	}

	public boolean approveIt() {
		return false;
	}

	public boolean closeIt() {
		return false;
	}

	public String completeIt() {
		return null;
	}

	public File createPDF() {
		return null;
	}

	public BigDecimal getApprovalAmt() {
		return null;
	}

	public int getDoc_User_ID() {
		return 0;
	}

	public String getDocumentInfo() {
		return null;
	}

	public String getProcessMsg() {
		return m_TextMsg;
	}

	public String getSummary() {
		return null;
	}

	public boolean invalidateIt() {
		return false;
	}

	public String placedIt() {
		return null;
	}

	public String prepareIt() {
		return null;
	}

	public boolean reActivateIt() {
		return false;
	}

	public boolean rejectIt() {
		return false;
	}

	public String returnedIt() {
		return null;
	}

	public boolean reverseAccrualIt() {
		return false;
	}

	public boolean reverseCorrectIt() {
		return false;
	}

	public boolean unlockIt() {
		return false;
	}

	public boolean voidIt() {
		return false;
	}

	public Timestamp getDate() {
		Timestamp lastdate;
		MRetentionStatement statement = MRetentionStatement.get(this.getC_Retention_ID(), getDocStatus());
		if ( statement != null )
			lastdate = statement.getDateAcct();
		else
			lastdate = getDateRetention();
		return lastdate;
	}

	@Override
	public boolean RestoreIt() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setProcessMsg(String msg)
	{
		m_processMsg = msg;
	}
}	//	MRetention
