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

import org.compiere.model.persistence.X_C_BOEConfirm;
import org.compiere.model.persistence.X_C_DocType;
import org.compiere.model.reference.REF_C_BOEConfirmType;
import org.compiere.model.reference.REF__DocumentAction;
import org.compiere.model.reference.REF_C_DocTypeDocBaseType;
import org.compiere.model.reference.REF__DocumentStatus;
import org.compiere.process.DocAction;
import org.compiere.util.*;
import org.xendra.exceptions.XendraException;

/**
 *	Bill Of Exchange Confirm
 *	
 *  @author xapiens
 *  @version $Id: MBOE.java 795 2008-02-23 20:16:13Z el_man $
 */
public class MBOEConfirm extends X_C_BOEConfirm implements DocAction
{ 
	/**
	 * 
	 */
	private static final long serialVersionUID = -7374837308249020631L;

	/**
	 * 	Get Bill Of Exchange (cached)
	 *	@param ctx context
	 *	@param M_BOEConfirm_ID id
	 *	@param trxName transaction
	 *	@return Bill Of Exchange
	 */
	public static MBOEConfirm get (Properties ctx, int M_BOEConfirm_ID, String trxName)
	{
		Integer key = new Integer (M_BOEConfirm_ID);
		MBOEConfirm retValue = (MBOEConfirm)s_cache.get(key);
		if (retValue == null)
		{
			retValue = new MBOEConfirm (ctx, M_BOEConfirm_ID, trxName);
			s_cache.put(key, retValue);
		}
		return retValue;		
	}	//	get
		


	/** Static Logger					*/
	private static CLogger 	s_log = CLogger.getCLogger(MBOEConfirm.class);
	/** Cache of Price Lists			*/
	private static CCache<Integer,MBOEConfirm> s_cache = new CCache<Integer,MBOEConfirm>("M_BOEConfirm", 5);
	private MBOEConfirmLine[] m_lines;
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
	public MBOEConfirm(Properties ctx, int M_BOEConfirm_ID, String trxName)
	{
		super(ctx, M_BOEConfirm_ID, trxName);
		if (M_BOEConfirm_ID == 0)
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
	public MBOEConfirm (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MBOE

	public String prepare()
	{
		MBOEConfirmLine[] lines = getLines(false,"");
		if (lines.length == 0)
		{
			//m_processMsg = "@NoLines@";
			return REF__DocumentStatus.Invalid;
		}		
		return REF__DocumentStatus.Drafted;
	}

	public MBOEConfirmLine[] getLines(boolean requery, String where) {
		if (m_lines != null && !requery)
			return m_lines;
		ArrayList<MBOEConfirmLine> list = new ArrayList<MBOEConfirmLine>();
		String sql = "SELECT * FROM C_BOEConfirmLine WHERE C_BOEConfirm_ID=? ";
		if (where != null && where.length()  > 0 )
			sql = sql.concat(" AND ").concat(where);
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, get_TrxName());
			pstmt.setInt (1, getC_BOEConfirm_ID());
			ResultSet rs = pstmt.executeQuery ();
			while (rs.next ())
				list.add (new MBOEConfirmLine (getCtx(), rs, get_TrxName()));
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, sql, e);
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
		
		m_lines = new MBOEConfirmLine[list.size ()];
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
		return m_processMsg;
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
	{		return DocAction.STATUS_Invalid.equals(m_status); 	}	
	
	public boolean isDrafted()
	{		return DocAction.STATUS_Drafted.equals(m_status);		}	

	public boolean isPortfolio()
	{		return DocAction.STATUS_Portfolio.equals(m_status);	}	

	public boolean isDiscount()
	{		return DocAction.STATUS_Discount.equals(m_status);	}	

	public boolean isWarranty()
	{		return DocAction.STATUS_Warranty.equals(m_status);	}	
	
	public boolean isReceivables()
	{		return DocAction.STATUS_Receivables.equals(m_status);	}	
	
	public boolean isClosed()
	{		return DocAction.STATUS_Closed.equals(m_status);		}		

	public boolean isCompleted()
	{		return DocAction.STATUS_Completed.equals(m_status);		}		
	
	
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
			return new String[] {ACTION_Warranty, ACTION_Receivables, ACTION_Protested};
		
		if (isWarranty())
			return new String[] {ACTION_Discount, ACTION_Receivables, ACTION_Protested};

		if (isReceivables())
			return new String[] {ACTION_Receivables, ACTION_Warranty, ACTION_Protested};		
		
		if (isClosed())
			return new String[] {ACTION_Post, ACTION_ReOpen};
		
		if (isCompleted())
			return new String[] {ACTION_Restore};
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
		System.out.println("X");
		if (isValidAction(getDocAction()))	//	User Selection second
			m_action = getDocAction();
		else 
			return true;	
		
		if (ACTION_Complete.equals(m_action))
		{
			return CompleteIt();
		}

		if (DocAction.ACTION_Restore.equals(m_action))
		{
			return RestoreIt();
		}
		return false;
	}
	
	public boolean RestoreIt() {
		MBOEConfirmLine[] lines = getLines(true,String.format(" boeconfirmtype = '%s' ",REF_C_BOEConfirmType.Payment));
		Boolean lContinue = true;
		for (int i=0; i < lines.length; i ++)
		{
			MBOEConfirmLine line = lines[i];
			if ( line.getC_Payment_ID() > 0)
			{				
				MPayment payment = new MPayment(Env.getCtx(), line.getC_Payment_ID(), get_TrxName());
				if (!payment.delete(true))
					lContinue =false;
			}
		}
		if (lContinue)
		{
			lines = getLines(true,"");
			for (int i=0; i < lines.length; i ++)
			{
				MBOEConfirmLine line = lines[i];
				line.setProcessed(false);
				line.save();				
			}
			setDocAction(DocAction.ACTION_Complete);
			setDocStatus(DocAction.STATUS_Drafted);
			setProcessed(false);		
			return true;
		}
		else
			return false;
	}

	private boolean CompleteIt() {
		try {
			BigDecimal BOEAmtLine = Env.ZERO;
			BigDecimal PayAmtLine = Env.ZERO;
			MPayment payment = null;
			for (MBOEConfirmLine line:getLines(true,""))
			{
				if (line.getBOEConfirmType().equals(REF_C_BOEConfirmType.Payment))
				{
					MDocType doctype = new MDocType(Env.getCtx(), line.getC_DocType_ID() , get_TrxName());
					if (doctype.getDocBaseType().equals(REF_C_DocTypeDocBaseType.ARReceipt))
					{
						payment = new MPayment(Env.getCtx(), 0, get_TrxName());
						payment.setAD_Org_ID(line.getAD_Org_ID());
						payment.setAD_Client_ID(line.getAD_Client_ID());
						payment.setDateAcct(getDateBOE());
						payment.setDateTrx(getDateBOE());					
						payment.setTenderType(line.getTenderType());
						payment.setC_DocType_ID(line.getC_DocType_ID());
						payment.setC_BankAccount_ID(getC_BankAccount_ID());
						payment.setC_BOEConfirm_ID(getC_BOEConfirm_ID());
						payment.setC_BPartner_ID(line.getC_BPartner_ID());
						payment.setC_Charge_ID(line.getC_Charge_ID());
						payment.setAmount(getC_Currency_ID(), line.getAmount()); // solo referencial 										
						payment.setC_ConversionType_ID(doctype.getC_ConversionType_ID());
						payment.setIsAllocated(true);
						if (!payment.save())
						{
							throw new XendraException("no se pudo guardar Pago "+payment.toString());
						}
					}	
					PayAmtLine = PayAmtLine.add(line.getAmount().setScale(2, BigDecimal.ROUND_HALF_UP));
				}
				if (line.getBOEConfirmType().equals(REF_C_BOEConfirmType.BOE))
					BOEAmtLine = BOEAmtLine.add(line.getAmount().setScale(2, BigDecimal.ROUND_HALF_UP));				
			}
			if (BOEAmtLine.compareTo(getBOEAmt()) != 0)
				throw new XendraException("Total Control de Letras: "+getBOEAmt().toString()+" Total Letras por linea:"+BOEAmtLine.toString()+" Diferencia: "+getBOEAmt().subtract(BOEAmtLine));
			if (payment == null)
				throw new XendraException("no se esta considerando el Ingreso");			
			if (PayAmtLine.abs().compareTo(BOEAmtLine.abs()) != 0)
			{
				throw new XendraException("Total de pago no coincide con total de Letra");
			}
			for (MBOEConfirmLine line:getLines(true,""))
			{
				if (line.getBOEConfirmType().equals(REF_C_BOEConfirmType.BOE))
				{
					if (line.getC_BOE_ID() > 0 )
					{
						MBOE boe = new MBOE(Env.getCtx(), line.getC_BOE_ID(), get_TrxName());
						boe.setC_BOEConfirm_ID(getC_BOEConfirm_ID());
						boe.setC_BankAccount_ID(getC_BankAccount_ID());
						boe.setBOENo(line.getBOENo());
						if (getStatus() != null)
						{
							boe.setStatusDate(this.getDateBOE());
							boe.setDocAction(getStatus());
							boe.processIt(getStatus());
							if (!boe.getDocStatus().equals(getStatus()))
								throw new XendraException("no se pudo cambiar el estado a Letra "+boe.toString());
							if (!boe.save())
								throw new XendraException("no se pudo guardar Letra "+boe.toString());								
						}
					}
				}
				else if (line.getBOEConfirmType().equals(REF_C_BOEConfirmType.Payment))
				{
					line.setC_Payment_ID(payment.getC_Payment_ID());
				}
				line.setProcessed(true);
				line.save();
			}
			if (payment != null)
			{				
				if (payment.completeIt().equals(REF__DocumentStatus.Completed))
				{
					payment.setDocStatus(REF__DocumentStatus.Completed);
					if (!payment.save())
						throw new XendraException("no se pudo guardar Pago "+payment.toString());
				}
				else
					throw new XendraException(payment.getProcessMsg());					
			}
			setDocAction(REF__DocumentAction.None);
			setDocStatus(REF__DocumentStatus.Completed);
			setProcessed(true);
		}
		catch (Exception e)
		{
			m_processMsg = e.getMessage();
			return false;
		}
		return true;
	}

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

	public void setProcessMsg(String msg)
	{
		m_processMsg = msg;
	}
}	//	MBOEConfirm
