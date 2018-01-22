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

import org.compiere.model.persistence.X_C_BOE;
import org.compiere.model.reference.REF_C_DocTypeDocBaseType;
import org.compiere.process.DocAction;
import org.compiere.process.DocumentEngine;
import org.compiere.util.*;
import org.xendra.exceptions.XendraException;

/**
 *	Bill Of Exchange
 *	
 *  @author xapiens
 *  @version $Id: MBoE.java 795 2008-02-23 20:16:13Z el_man $
 */
public class MBOE extends X_C_BOE implements DocAction
{ 
	/**
	 * 	Get Bill Of Exchange (cached)
	 *	@param ctx context
	 *	@param M_BoE_ID id
	 *	@param trxName transaction
	 *	@return Bill Of Exchange
	 */
	public static MBOE get (Properties ctx, int M_BoE_ID, String trxName)
	{
		Integer key = new Integer (M_BoE_ID);
		MBOE retValue = (MBOE)s_cache.get(key);
		if (retValue == null)
		{
			retValue = new MBOE (ctx, M_BoE_ID, trxName);
			s_cache.put(key, retValue);
		}
		return retValue;		
	}	//	get
		


	/** Static Logger					*/
	private static CLogger 	s_log = CLogger.getCLogger(MBOE.class);
	/** Cache of Price Lists			*/
	private static CCache<Integer,MBOE> s_cache = new CCache<Integer,MBOE>("M_BOE", 5);
	private MBOELine[] m_lines;
	private String 		m_processMsg;
	private String 		m_status;
	private String		m_action = null;
	/**	Open Amount				*/
	private BigDecimal 		m_openAmt = null;

	
	
	
	
	/**************************************************************************
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param M_BoE_ID id
	 *	@param trxName transaction
	 */
	public MBOE(Properties ctx, int M_BOE_ID, String trxName)
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
	public MBOE (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MBOE

	public String prepare()
	{
		MBOELine[] lines = getLines(false);
		if (lines.length == 0)
		{
			m_processMsg = "@NoLines@";
			return DocAction.STATUS_Invalid;
		}		
		BigDecimal total = Env.ZERO;
		for (int i = 0; i < lines.length; i++)
		{
			MBOELine line = lines[i];
			if (!line.isActive())
				continue;
			total = total.add(line.getAmount());
		}
		if ( total.compareTo(getGrandTotal()) != 0 )
		{
			BigDecimal diff = getGrandTotal().subtract(total);
			BigDecimal adjust = lines[lines.length-1].getAmount();
			lines[lines.length-1].setAmount(adjust.subtract(diff));
			lines[lines.length-1].save();
		}
		return DocAction.STATUS_Drafted;
	}
	
	public MBOELine[] getLines(boolean requery) {
		if (m_lines != null && !requery)
			return m_lines;
		String where = "C_BOE_ID = ?";
		List<MBOELine> list = new Query(Env.getCtx(), MBOELine.Table_Name, where, null)
			.setParameters(getC_BOE_ID()).list();		
		m_lines = new MBOELine[list.size ()];
		list.toArray (m_lines);
		return m_lines;
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

	public static MBOE[] getGroup(int m_C_GroupDoc_ID, String trxName) {
		MBOE[] boes = null;
		String where = "C_GroupDoc_ID = ?";
		List<MBOE> listboes = new Query(Env.getCtx(), MBOE.Table_Name, where, trxName).setParameters(m_C_GroupDoc_ID).list();
		if (listboes != null)
		{
			boes = new MBOE[listboes.size ()];
			listboes.toArray (boes);
		}
		return boes;		
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
	
	public boolean restoreIt() {
		// eliminar 
		Boolean sucessfully = false;
		if (!isPaid())
		{
			// obtener el estado ultimo que es el estado actual
			String prestatus = "";
			// the newaction es el estado actual, porque estamos restaurando al estado previo.
			String newaction = getDocStatus();
			ArrayList<MBOEStatement> list = new ArrayList<MBOEStatement>();
			String sql = "SELECT * FROM C_BOEStatement WHERE C_BOE_ID=? AND DocStatus=?";
			PreparedStatement pstmt = null;
			try
			{
				pstmt = DB.prepareStatement (sql, get_TrxName());
				pstmt.setInt    (1, getC_BOE_ID());
				pstmt.setString (2, newaction);
				ResultSet rs = pstmt.executeQuery();
				if (rs.next ())
				{
					prestatus = rs.getString("prestatus");					
					sucessfully = true;
				}
				else
				{
					m_processMsg = "el estado actual no tiene registro historico";
					sucessfully = false;					
				}
				rs.close ();
			}
			catch (SQLException e)
			{
				s_log.log(Level.SEVERE, sql, e);
			}	
			if (sucessfully)
			{
				this.setDocStatus(prestatus);
				this.setDocAction(newaction);
				//DB.executeUpdate("DELETE FROM C_BOEStatement WHERE C_BOE_ID=? AND DocStatus=?",null);
				sql = "DELETE FROM C_BOEStatement WHERE C_BOE_ID=".concat(String.valueOf(getC_BOE_ID())).concat(" AND DocStatus=").concat(newaction);
				int no = DB.executeUpdate(sql, get_TrxName());		
			}
		}
		else
		{
			m_processMsg = "El Documento esta cancelado, no puede ser restaurado";
			sucessfully = false;
		}
		return sucessfully;
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
		return null;
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
	
	/**
	 * 	Document is Invalid
	 *	@return true if Invalid
	 */
	public boolean isInvalid()
	{		return STATUS_Invalid.equals(m_status); 	}	
	
	public boolean isDrafted()
	{		return STATUS_Drafted.equals(m_status);		}	

	public boolean isPortfolio()
	{		return STATUS_Portfolio.equals(m_status);	}	

	public boolean isDiscount()
	{		return STATUS_Discount.equals(m_status);	}	

	public boolean isWarranty()
	{		return STATUS_Warranty.equals(m_status);	}	
	
	public boolean isReceivables()
	{		return STATUS_Receivables.equals(m_status);	}	
	
	public boolean isClosed()
	{		return STATUS_Closed.equals(m_status);		}		
	
	
	public String[] getActionOptions()
	{
		if (isInvalid())
			return new String[] {ACTION_Prepare, ACTION_Invalidate, 
				ACTION_Unlock, ACTION_Void};

		if (isDrafted())
			return new String[] {ACTION_Prepare, ACTION_Portfolio, ACTION_Complete};
		
		if (isPortfolio())
			return new String[] {ACTION_Discount, ACTION_Warranty, ACTION_Receivables, ACTION_Protested};
		
		if (isDiscount())
			//return new String[] {ACTION_Portfolio, ACTION_Warranty, ACTION_Receivables};
			return new String[] {ACTION_Warranty, ACTION_Receivables, ACTION_Protested, DocAction.ACTION_Restore};
		
		if (isWarranty())
			return new String[] {ACTION_Discount, ACTION_Receivables, ACTION_Protested, DocAction.ACTION_Restore};

		if (isReceivables())
			return new String[] {ACTION_Receivables, ACTION_Warranty, ACTION_Protested, DocAction.ACTION_Restore};		
		
		if (isClosed())
			return new String[] {ACTION_Post, ACTION_ReOpen};
		
		//if (isReversed() || isVoided())
		//	return new String[] {ACTION_Post};
		
		return new String[] {};
	}	//	getActionOptions
	
	/**
	 * 	Is The Action Valid based on current state
	 *	@param action action
	 *	@return true if valid
	 */
	public boolean isValidAction (String action)
	{
		String[] options = getActionOptions();
		for (int i = 0; i < options.length; i++)
		{
			if (options[i].equals(action))
				return true;
		}
		return false;
	}	//	isValidAction
	
	public boolean processIt(String processAction) throws Exception {
		boolean processit;
		m_processMsg = null;
		m_status = getDocStatus();

		if (isValidAction(getDocAction()))	//	User Selection second
			m_action = getDocAction();
		else 
			return true;	
		
		if (ACTION_Portfolio.equals(m_action))
		{
			return PortfolioIt();			
		}		
		if (ACTION_Warranty.equals(m_action))
		{
			return warrantyIt();
		}
		else if (ACTION_Receivables.equals(m_action))
		{
			return receivablesIt();
		}
		else if (ACTION_Discount.equals(m_action))
		{
			return discountIt();
		}
		else if (ACTION_Protested.equals(m_action))
		{
			return protestedIt();
		}		
		else if (DocAction.ACTION_Restore.equals(m_action))
		{
			return restoreIt();
		}
		return false;
	}
	
	public boolean PortfolioIt()
	{	
		StringBuffer info = new StringBuffer();
		
		if ( prepare().equals(DocAction.STATUS_Invalid) )
			return false;
		MBOELine[] lines = getLines(false);
		MGroupDoc group = new MGroupDoc(Env.getCtx(), getC_GroupDoc_ID(), get_TrxName() );
		//MAllocationHdr alloc = null;
		MAllocation alloc = new MAllocation();
		if ( group.getC_AllocationHdr_ID() == 0)
		{
			if (!alloc.addHeader(this, getDateAcct(), getDateAcct(), getC_Currency_ID(), get_TrxName()))						
				throw new XendraException("cantsaveAllocHeader");			
//			alloc = new MAllocationHdr(getCtx(),
//					false /* is manual */, 
//					getDateAcct(), 
//					getC_Currency_ID(),
//					Msg.translate(getCtx(), "C_BOE_ID") + ": " + getC_BOE_ID(), 
//					get_TrxName());
//			alloc.setAD_Org_ID(getAD_Org_ID());	
//			if (!alloc.save())
//			{
//				m_processMsg = "Could not create Allocation Hdr";
//				return false;
//			}		
			group.setC_AllocationHdr_ID(alloc.getC_AllocationHdr_ID());
			group.save(get_TrxName());
		}
		else
		{	
			alloc = MAllocation.get(group.getC_AllocationHdr_ID(), get_TrxName());
			if (alloc == null)						
				throw new XendraException("cantsaveAllocHeader");		
			else
				alloc.setHeaderBOE(this);
			//alloc = new MAllocationHdr(Env.getCtx(), group.getC_AllocationHdr_ID(), get_TrxName());
		}
		
		for (int i = 0; i < lines.length; i++)
		{
			MBOELine boeline = lines[i];
			Boolean IsInvoice = false;
			//MAllocationLine aLine = null;
//			public MAllocationLine (MAllocationHdr parent, BigDecimal Amount, 
//					BigDecimal DiscountAmt, BigDecimal WriteOffAmt, BigDecimal OverUnderAmt)						
//			if (isSOTrx())
//				aLine = new MAllocationLine (alloc, boeline.getAmount(), Env.ZERO, Env.ZERO, Env.ZERO);
//			else
//				aLine = new MAllocationLine (alloc, boeline.getAmount().negate(), Env.ZERO, Env.ZERO, Env.ZERO);

			IsInvoice = boeline.getC_Invoice_ID() > 0;
//			if (boeline.getC_Invoice_ID() > 0) { 
//				//aLine.setAD_Table_ID(MInvoice.Table_ID);
//				//aLine.setRecord_ID(boeline.getC_Invoice_ID());
//				aLine.setC_Invoice_ID(boeline.getC_Invoice_ID());
//				IsInvoice = true;
//				}
//			else if (boeline.getRef_BOE_ID() > 0) {
//				aLine.setC_BOE_ID(boeline.getRef_BOE_ID());
//			}
//			Timestamp today = TimeUtil.getDay(System.currentTimeMillis());
//			aLine.setDateTrx(today);
//			aLine.setAD_Table_ID(MBOE.Table_ID);
//			aLine.setC_Currency_ID(getC_Currency_ID());
//			aLine.setRecord_ID(getC_BOE_ID());
//
//			//aLine.setC_BOE_ID(boe.getC_BOE_ID());
//			aLine.setC_BPartner_ID(getC_BPartner_ID());
//			if (!aLine.save(get_TrxName()))
//			{
//				m_processMsg = "Could not create Allocation Line";
//				return false;
//			}			
			BigDecimal WriteOffAmt = Env.ZERO;
			
			if ( IsInvoice )
			{
				BigDecimal retAmt = Env.ZERO;				
				MRetention retention = null;				
				MInvoice invoice = new MInvoice(getCtx(), boeline.getC_Invoice_ID(), get_TrxName());
				BigDecimal allocation = invoice.getAllocatedAmt();	//	absolute
				BigDecimal total = invoice.getGrandTotal();
				
				if (invoice.getC_Retention_ID() > 0)
				{
					retention = new MRetention(getCtx(),invoice.getC_Retention_ID(), get_TrxName());
					retAmt = retention.getTaxAmt();
				}
				total = total.subtract(retAmt);
				// analizando factura para rendondeo
				// MInvoice invoice = new MInvoice(getCtx(), boeline.getC_Invoice_ID(), get_TrxName());
				// MRetention retention = new MRetention(getCtx(),invoice.getC_Retention_ID(), get_TrxName());
				// BigDecimal allocation = invoice.getAllocatedAmt();	//	absolute
				if (allocation != null && allocation.compareTo(Env.ZERO) == 1)
				{
					//BigDecimal total = invoice.getGrandTotal();
					//if (retention.get_ID() != 0)
					//	total = total.subtract(retention.getTaxAmt());
					BigDecimal diff = allocation.divide(total, 10, BigDecimal.ROUND_HALF_UP);
					//BigDecimal diff = total.divide(allocation, 10, BigDecimal.ROUND_HALF_UP);
					diff = diff.multiply(Env.ONEHUNDRED);
					if ( diff.compareTo(Env.ONEHUNDRED) != 0 )
					{
						diff = Env.ONEHUNDRED.subtract(diff).abs();
						if (diff.compareTo(Env.ONE) <= 0)
						{
							//aLine.setWriteOffAmt(total.subtract(allocation));
							WriteOffAmt = total.subtract(allocation);
							//aLine.save();
						}
					}
				}
			}
			else
			{
				MBOE boe = new MBOE(getCtx(), boeline.getRef_BOE_ID(), get_TrxName());
				BigDecimal allocation = boe.getAllocatedAmt();	//	absolute
				if (allocation != null && allocation.compareTo(Env.ZERO) == 1)
				{
					BigDecimal total = boe.getGrandTotal();
					BigDecimal diff = allocation.divide(total, 10, BigDecimal.ROUND_HALF_UP);
					diff = diff.multiply(Env.ONEHUNDRED);
					if (diff.compareTo(Env.ONEHUNDRED) != 0 )
					{
						diff = Env.ONEHUNDRED.subtract(diff).abs();
						if (diff.compareTo(Env.ONE) <= 0)
						{
							//aLine.setWriteOffAmt(total.subtract(allocation));
							//aLine.save();
							WriteOffAmt = total.subtract(allocation);
						}
					}
				}
				
			}

			
			if (!alloc.addLine(boeline, getC_Currency_ID(), Env.ZERO, WriteOffAmt, Env.ZERO, getC_Invoice_ID()))
			{
				return false;
			}
			else
			{
				boeline.setProcessed(true);
				boeline.save(get_TrxName());				
			}
		}		
		m_processMsg = info.toString().trim();		
		setDocAction(DocAction.ACTION_Portfolio); 
		setDocStatus(DocAction.STATUS_Portfolio);				
		return true;
	}


	private boolean protestedIt() {
		changestate(DocAction.ACTION_None, DocAction.STATUS_Protested);
		return true;
	}

	public boolean discountIt() {
		changestate(DocAction.ACTION_Protested, DocAction.STATUS_Discount);
		return true;
	}

	private boolean receivablesIt() {
		changestate(DocAction.ACTION_Protested, DocAction.STATUS_Receivables);
		return true;
	}

	private void changestate(String action, String status) {
		String prestate = getDocStatus();
		setDocAction(action);
		setDocStatus(status);
		setR_Amount(Env.ZERO);
//		setR_DateBOE(null);
//		setR_DocumentNo(null);
//		setR_DueDate(null);		
		MBOEStatement statement = new MBOEStatement(this.getCtx(), 0, get_TrxName());
		statement.setBOE(this);
		statement.setDocStatus(DocAction.STATUS_Completed);
		statement.setDocumentNo(getDocumentNo());
		statement.setC_DocType_ID(this.getC_DocType_ID());
		statement.setStatus(status);
		statement.setIsSOTrx(this.isSOTrx());	
		statement.setPreStatus(prestate);
		statement.setProcessed(true);
		statement.save();				
	}	
	public boolean warrantyIt() {
		changestate(DocAction.ACTION_Protested, DocAction.STATUS_Warranty);
		return true;
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
	
	/**
	 * 	Get Open Amount.
	 * 	Used by web interface
	 * 	@return Open Amt
	 */
	public BigDecimal getOpenAmt ()
	{
		return getOpenAmt (true, null);
	}	//	getOpenAmt

	/**
	 * 	Get Open Amount
	 * 	@param creditMemoAdjusted adjusted for CM (negative)
	 * 	@param paymentDate ignored Payment Date
	 * 	@return Open Amt
	 */
	public BigDecimal getOpenAmt (boolean creditMemoAdjusted, Timestamp paymentDate)
	{
//		if (isPaid())
//			return Env.ZERO;
		//
		//if (m_openAmt == null)
		//{
			m_openAmt = getGrandTotal();
			if (paymentDate != null)
			{
				//	Payment Discount
				//	Payment Schedule
			}
			BigDecimal allocated = getAllocatedAmt();
			if (allocated != null)
			{
				allocated = allocated.abs();	//	is absolute
				m_openAmt = m_openAmt.subtract(allocated);
			}
		//}
		//
		if (!creditMemoAdjusted)
			return m_openAmt;
		if (isCreditMemo())
			return m_openAmt.negate();
		return m_openAmt;
	}	//	getOpenAmt

	/**
	 * 	Get Allocated Amt in BOE Currency
	 *	@return pos/neg amount or null
	 */
	public BigDecimal getAllocatedAmt ()
	{
		BigDecimal retValue = Env.ZERO;
		PreparedStatement pstmt = null;
		ResultSet rs = null;		
		try
		{
			pstmt = DB.prepareStatement("SELECT xendra.BOEALLOCATION(?)", get_TrxName());
			pstmt.setInt(1, getC_BOE_ID());			
			rs = pstmt.executeQuery();
			if (rs.next())
				retValue = rs.getBigDecimal(1);
		}
		catch (Exception e)
		{
			e.printStackTrace();
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
		finally
		{
			DB.close(rs, pstmt);
			rs = null;
			pstmt = null;
		}		
		return retValue;
	}	//	getAllocatedAmt
	
	/**
	 * 	Is it a Credit Memo?
	 *	@return true if CM
	 */
	public boolean isCreditMemo()
	{
		MDocType dt = MDocType.get(getCtx(), 
			getC_DocType_ID()==0 ? getC_DocTypeTarget_ID() : getC_DocType_ID());
		return REF_C_DocTypeDocBaseType.APCreditMemo.equals(dt.getDocBaseType())
			|| REF_C_DocTypeDocBaseType.ARCreditMemo.equals(dt.getDocBaseType());
	}	//	isCreditMemo
		
	/**
	 * 	Test Allocation (and set paid flag)
	 *	@return true if updated
	 */
	public boolean testAllocation()
	{
		BigDecimal alloc = getAllocatedAmt();	//	absolute
		if (alloc == null)
			alloc = Env.ZERO;
		BigDecimal total = getGrandTotal();
		if (!isSOTrx())
		{
			total = total.negate();
			alloc = alloc.negate();
		}
		if (isCreditMemo())
			total = total.negate();
		boolean test = total.compareTo(alloc) == 0;
		boolean change = test != isPaid();
		if (change)
			setIsPaid(test);
		log.fine("Paid=" + test
			+ " (" + alloc + "=" + total + ")");
		return change;
	}	//	testAllocation
	
	/**
	 *  Get BOE Account
	 *  @param C_Charge_ID charge
	 *  @param as account schema
	 *  @param amount amount for expense(+)/revenue(-)
	 *  @return BOE Account or null
	 */
	public static MAccount getAccount (MAcctSchema as, String status, boolean isSOTrx)
	{
		if (as == null)
			return null;
		MAccount acct = null;
		int Account_ID = getAccountID(as, status, isSOTrx);
		if (Account_ID > 0)
			acct = MAccount.get (as.getCtx(), Account_ID);
		return acct;
	}   //  getAccount

	public static int getAccountID (MAcctSchema as, String status, boolean isSOTrx)
	{
		if (as == null)
			return 0;

		String accountcolumn = "";
		if (status.equals(DocAction.STATUS_Portfolio) && isSOTrx)
			accountcolumn = "boe_portfolio_acct";
		else if (status.equals(DocAction.STATUS_Portfolio))
			accountcolumn = "boe_vendor_acct";
		else if(status.equals(DocAction.STATUS_Discount))
			accountcolumn = "boe_discount_acct";
		else if(status.equals(DocAction.STATUS_Receivables))
			accountcolumn = "boe_receivables_acct";
		else if(status.equals(DocAction.STATUS_Warranty))
			accountcolumn = "boe_warranty_acct";
		else if(status.equals(DocAction.STATUS_Protested))
			accountcolumn = "boe_protested_acct";
		else
			return 0;
		String sql = "SELECT "+ accountcolumn +" FROM C_BOE_Acct WHERE C_AcctSchema_ID=?";
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
			return 0;
		}
		//	No account
		if (Account_ID == 0)
		{
			s_log.severe ("NO account id for status=" + status);
			return 0;
		}

		return Account_ID;
	}   //  getAccount ID
	
	/**
	 * 	Create new Invoice by copying
	 * 	@param from invoice
	 * 	@param dateDoc date of the document date
	 * 	@param C_DocTypeTarget_ID target doc type
	 * 	@param isSOTrx sales order
	 * 	@param counter create counter links
	 * 	@param trxName trx
	 * 	@param setOrder set Order links
	 *	@return Invoice
	 */
	public static MBOE copyFrom (MBOE from, Timestamp dateDoc, 
		int C_DocTypeTarget_ID, boolean isSOTrx, boolean counter, 
		String trxName)
	{
		MBOE to = new MBOE (from.getCtx(), 0, null);
		to.set_TrxName(trxName);
		PO.copyValues (from, to, from.getAD_Client_ID(), from.getAD_Org_ID());
		to.set_ValueNoCheck ("C_BOE_ID", I_ZERO);
		//to.set_ValueNoCheck ("DocumentNo", null);
		to.setDocumentNo(from.getDocumentNo());
		//
		to.setDocStatus (from.getDocStatus());		//	Draft
		to.setDocAction(from.getDocAction());
		//
		to.setC_DocType_ID(from.getC_DocType_ID());
		to.setC_DocTypeTarget_ID (from.getC_DocTypeTarget_ID());
		to.setIsSOTrx(from.isSOTrx());
		to.setDateAcct (from.getDateAcct());
		to.setC_Payment_ID(from.getC_Payment_ID());
		to.setIsPaid (false);
		to.setIsRefinanced(false);
		to.setDueDate(from.getDueDate());
		to.setGrandTotal(from.getGrandTotal());
		to.setProcessed (from.isProcessed());
		to.setProcessing(from.isProcessing());
		if (counter)
		{
			to.setRef_BOE_ID(from.getC_BOE_ID());
		}
		else
			to.setRef_BOE_ID(0);

		if (!to.save(trxName))
			throw new IllegalStateException("Could not create BOE");

		return to;
	}	//	copyFrom

	protected boolean beforeDelete ()
	{
		if (isPaid() || getDocStatus().compareTo(DocAction.STATUS_Protested) == 0 ||  isRenewed()  )
		{
			log.saveError("Error", Msg.getMsg(getCtx(), "CannotDelete"));
			return false;
		}
		return true;
	}	//	beforeDelete
	
	protected boolean afterDelete (boolean success)
	{
	
		ArrayList<MBOEStatement> list = new ArrayList<MBOEStatement>();
		String sql = "SELECT * FROM C_BOEStatement WHERE C_BOE_ID=? ";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, get_TrxName());
			pstmt.setInt (1, getC_BOE_ID());
			ResultSet rs = pstmt.executeQuery ();
			while (rs.next ())
				list.add (new MBOEStatement (getCtx(), rs, get_TrxName()));
			rs.close ();
		}
		catch (SQLException e)
		{
			s_log.log(Level.SEVERE, sql, e);
		}		
		for (int i = 0; i < list.size(); i++)
		{
			MBOEStatement st = list.get(i);
			st.delete(true);
		}
		
		MBOELine[] lines = getLines(false);
		for (int i = 0; i < lines.length; i++)
		{
			MBOELine line = lines[i];
			if (!line.isActive())
				continue;
			line.delete(true);
		}
		return success;
	}	//	afterDelete	

	public Timestamp getDate() {
		// Busca la fecha del ultimo estado de la letra
		Timestamp lastdate;
		MBOEStatement statement = MBOEStatement.get(getC_BOE_ID(), getDocStatus(), get_TrxName());		
		if ( statement != null )
			//lastdate = statement.getDateAcct();
			lastdate = statement.getStatusDate();
		else
			lastdate = getDateBOE();
		return lastdate;
	}

	/**
	 * 	Get MBOE from Cache
	 *	@param ctx context
	 *	@param C_BOE_ID id
	 *	@return MBOE
	 */
	public static MBOE get (Properties ctx, int C_BOE_ID)
	{
		Integer key = new Integer (C_BOE_ID);
		MBOE retValue = (MBOE) s_cache.get (key);
		if (retValue != null)
			return retValue;
		retValue = new MBOE (ctx, C_BOE_ID, null);
		if (retValue.get_ID () != 0)
			s_cache.put (key, retValue);
		return retValue;
	} //	get

	public MAccount getAccount(MAcctSchema as) {
		String sql = null;
		int C_ValidCombination_ID = 0;
		MAccount acct = null;
		if (this.getDocStatus().equals(DocAction.STATUS_Warranty) )		
			sql = "SELECT boe_wr_acct FROM C_BankAccount_Acct WHERE C_BankAccount_ID=? AND C_AcctSchema_ID=?";
		else if (this.getDocStatus().equals(DocAction.STATUS_Receivables) )
			sql = "SELECT boe_rv_acct FROM C_BankAccount_Acct WHERE C_BankAccount_ID=? AND C_AcctSchema_ID=?";
		else if (this.getDocStatus().equals(DocAction.STATUS_Discount) )
			sql = "SELECT boe_ds_acct FROM C_BankAccount_Acct WHERE C_BankAccount_ID=? AND C_AcctSchema_ID=?";
		else if (this.getDocStatus().equals(DocAction.STATUS_Protested) )
			sql = "SELECT boe_pd_acct FROM C_BankAccount_Acct WHERE C_BankAccount_ID=? AND C_AcctSchema_ID=?";
		else
			return null;
		C_ValidCombination_ID = DB.getSQLValue(null, sql, getC_BankAccount_ID(), as.getC_AcctSchema_ID());
		if (C_ValidCombination_ID == 0)
		{
			
		}
		acct = MAccount.get (as.getCtx(), C_ValidCombination_ID);
		return acct;		
	}

	/**
	 * 	String Representation
	 *	@return info
	 */
	public String toString ()
	{
		StringBuffer sb = new StringBuffer ("MBOE[")
			.append(get_ID()).append("-");
		sb.append(getDocumentNo()).append(",GrandTotal=").append(getGrandTotal());
		if (m_lines != null)
			sb.append(" (#").append(m_lines.length).append(")");
		sb.append ("]");
		return sb.toString ();
	}	//	toString

	@Override
	public boolean RestoreIt() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setProcessMsg(String msg)
	{
		m_processMsg = msg;
	}
	
}	//	MBOE
