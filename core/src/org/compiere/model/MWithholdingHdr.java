package org.compiere.model;

import java.io.File;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;

import org.compiere.model.persistence.X_C_DocType;
import org.compiere.model.persistence.X_C_WithholdingHdr;
import org.compiere.model.persistence.X_C_WithholdingLine;
import org.compiere.model.reference.REF_C_DocTypeDocBaseType;
import org.compiere.process.DocAction;
import org.compiere.process.DocumentEngine;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.xendra.exceptions.ConversionRateException;
import org.xendra.exceptions.XendraException;


public class MWithholdingHdr extends X_C_WithholdingHdr implements DocAction {

	private String m_processMsg = "";
	private boolean		m_justPrepared = false;	
	private String m_status;
	private String m_action;
	private String m_TextMsg;
	

	public MWithholdingHdr(Properties ctx, int C_WithholdingHdr_ID,	String trxName) {
		super(ctx, C_WithholdingHdr_ID, trxName);
		if (C_WithholdingHdr_ID == 0)
		{
			setDocStatus(DocAction.STATUS_Drafted);
			setDocAction(DocAction.ACTION_Complete);			
		}
	}

	public MWithholdingHdr(Properties ctx, ResultSet rs,	String trxName) {
		super(ctx, rs, trxName);
	}
	
	/**
	 * 	Before Save
	 *	@param newRecord new
	 *	@return true
	 */
	protected boolean beforeSave (boolean newRecord)
	{
		if (getC_DocType_ID() == 0)
		{
			MDocType types[] = MDocType.getOfDocBaseType(getCtx(), REF_C_DocTypeDocBaseType.Withholding);
			if (types.length > 0)	//	get first
				setC_DocType_ID(types[0].getC_DocType_ID());
		}
		return true;
	}	//	beforeSave
	public static void addInvoice(MInvoice invoice, BigDecimal TaxBaseAmt, Timestamp dateDoc,  BigDecimal WithholdingAmt, int AD_Table_ID, int Record_ID, String trxName) {
		addInvoice(invoice, TaxBaseAmt, 0, dateDoc, WithholdingAmt, AD_Table_ID, Record_ID, trxName);	
	}
	
	public static void addInvoice(MInvoice invoice, BigDecimal TaxBaseAmt, int C_BOE_ID, Timestamp dateDoc,  BigDecimal WithholdingAmt, int AD_Table_ID, int Record_ID, String trxName) {	

		System.out.println("addInvoice - AD_Table_ID : "+AD_Table_ID+" Record_ID"+Record_ID);
		MWithholdingHdr hdr = get(invoice.getC_BPartner_ID(), dateDoc, trxName);		
		if (hdr == null) 
		{
			hdr = new MWithholdingHdr(Env.getCtx(), 0, trxName);
			hdr.setDateDoc(dateDoc);
			hdr.setC_BPartner_ID(invoice.getC_BPartner_ID());
			hdr.setIsSOTrx(invoice.isSOTrx());
			hdr.save();
		}				
		MWithholdingLine line = null;
		if (C_BOE_ID > 0)
			line = MWithholdingLine.get(Env.getCtx(), AD_Table_ID, Record_ID , C_BOE_ID, trxName);
		else
			line = MWithholdingLine.get(Env.getCtx(), AD_Table_ID, Record_ID , trxName);
		if (line == null)
		{
			line = new MWithholdingLine(Env.getCtx(), 0, trxName);
			line.setAD_Table_ID(AD_Table_ID);
			line.setRecord_ID(Record_ID);
			if (C_BOE_ID > 0)
				line.setC_BOE_ID(C_BOE_ID);
			line.setHeader(hdr);
		}						
		line.setC_Invoice_ID(invoice.getC_Invoice_ID());
		line.setTaxBaseAmt(TaxBaseAmt);
		line.setWithholdingAmt(WithholdingAmt);
		line.save();	
	}

	private static MWithholdingHdr get(int C_BPartner_ID, Timestamp dateDoc, String trxName) {
		String where = " C_BPartner_ID = ? AND date_trunc('day', datedoc) = date_trunc('day',?::timestamp) ";
		MWithholdingHdr hdr = new Query (Env.getCtx(), X_C_WithholdingHdr.Table_Name, where , trxName)
								.setParameters(C_BPartner_ID, dateDoc)
								.firstOnly();
		return hdr;
	}

	public boolean processIt(String processAction) throws Exception {
		boolean processit;
		m_processMsg = null;
		m_status = getDocStatus();

		if (isValidAction(getDocAction()))	//	User Selection second
			m_action = getDocAction();
		else 
			return true;	
		if (DocAction.ACTION_Complete.equals(m_action))
		{
			return completeIt().equals(DocAction.STATUS_Completed);	
		}
		else if (DocAction.ACTION_ToCollect.equals(m_action))
			return ToCollectIt();			
		else if (DocAction.ACTION_Collect.equals(m_action))
			return CollectIt();
		else if (DocAction.ACTION_Apply.equals(m_action))
			return ApplyIt();
		return false;
	}

	private Boolean changestate(String action, String status) {
		if ( getStatusDate() != null)
		{
			String PreStatus = getDocStatus();
			MWithholdingState statement = new MWithholdingState(this.getCtx(), 0, get_TrxName());
			statement.setC_WithholdingHdr_ID(getC_WithholdingHdr_ID());
			statement.setStatus(status);
			statement.setDocStatus(DocAction.STATUS_Completed);		
			statement.setStatusDate(getStatusDate());				
			statement.setProcessed(true);
			if (statement.save())
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
			return new String[] {DocAction.ACTION_Complete};
		if (isCompleted())
			return new String[] {DocAction.ACTION_ToCollect};
		if (isToCollect())
			return new String[] {DocAction.ACTION_Collect};
		if (isCollect())
			return new String[] {DocAction.ACTION_Apply};
		if (isApply())
			return new String[] {DocAction.ACTION_Close};
		return new String[] {};
	}	//	getActionOptions
	
	private boolean ToCollectIt() {
		try {
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
	

	public boolean isDrafted()
	{		return DocAction.STATUS_Drafted.equals(m_status);		}	

	public boolean isCompleted()
	{		return DocAction.STATUS_Completed.equals(m_status);		}	
	
	public boolean isToCollect()
	{		return DocAction.STATUS_ToCollect.equals(m_status);		}	

	public boolean isCollect()
	{		return DocAction.STATUS_Collect.equals(m_status);		}	

	public boolean isApply()
	{		return DocAction.STATUS_Apply.equals(m_status);		}	
	
	@Override
	public boolean unlockIt() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean invalidateIt() {
		// TODO Auto-generated method stub
		return false;
	}

	
	public String prepareIt() {
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_BEFORE_PREPARE);
		if (m_processMsg != null)
			return DocAction.STATUS_Invalid;
		
		if (getC_DocType_ID() > 0)
		{
			MDocType dt = MDocType.get(getCtx(), getC_DocType_ID());
			
			//	Std Period open?
			if (!MPeriod.isOpen(getCtx(), getDateAcct(), dt.getDocBaseType(), getAD_Org_ID(), getAD_Client_ID()))
			{
				m_processMsg = "@PeriodClosed@";
				return DocAction.STATUS_Invalid;
			}
		}
		return DocAction.STATUS_InProgress;
	}

	@Override
	public boolean approveIt() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean rejectIt() {
		// TODO Auto-generated method stub
		return false;
	}

	public String completeIt() {	
		if (!m_justPrepared)
		{
			String status = prepareIt();
			if (!DocAction.STATUS_InProgress.equals(status))
				return status;
		}
		setDocAction(DocAction.STATUS_Closed);
		setDocStatus(DocAction.STATUS_Completed);				
		setProcessed(true);
		return DocAction.STATUS_Completed;
	}

	/**
	 * 	Set Processed.
	 * 	Propergate to Lines/Taxes
	 *	@param processed processed
	 */
	public void setProcessed (boolean processed)
	{
		super.setProcessed (processed);
		if (get_ID() == 0)
			return;
		String set = "SET Processed='"
			+ (processed ? "Y" : "N")
			+ "' WHERE C_WithholdingHdr_ID=" + getC_WithholdingHdr_ID();
		int noLine = DB.executeUpdate("UPDATE C_WithholdingLine " + set, get_TrxName());
		log.fine(processed + " - Lines=" + noLine );
	}	//	setProcessed

	
	public MWithholdingLine[] getLines() {
		String query = "C_Withholdinghdr_ID = ?";
		List<MWithholdingLine> lines = new Query(Env.getCtx(), X_C_WithholdingLine.Table_Name, query, get_TrxName())
			.setParameters(getC_WithholdingHdr_ID())
			.list();
		
		MWithholdingLine[] hlines = new MWithholdingLine[lines.size()];
		lines.toArray(hlines);
		return hlines;
	}

	@Override
	public boolean voidIt() {
		return true;
	}

	@Override
	public String placedIt() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String returnedIt() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean closeIt() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean reverseCorrectIt() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean reverseAccrualIt() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean reActivateIt() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean RestoreIt() {
		return false;
	}

	@Override
	public String getSummary() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDocumentInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public File createPDF() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getProcessMsg() {
		return m_processMsg;
	}

	@Override
	public int getDoc_User_ID() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getC_Currency_ID() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BigDecimal getApprovalAmt() {
		// TODO Auto-generated method stub
		return null;
	}

	public static MWithholdingHdr get(Properties ctx, int C_WithholdingHdr_ID, String trxName) {
		String query = "C_WithholdingHdr_ID = ?";
		MWithholdingHdr whHdr = new Query(ctx, X_C_WithholdingHdr.Table_Name, query, trxName).setParameters(C_WithholdingHdr_ID).firstOnly();
		return whHdr;
	}

	/**
	 *  Get Retention Account
	 *  @param C_Charge_ID charge
	 *  @param as account schema
	 *  @param amount amount for expense(+)/revenue(-)
	 *  @return BOE Account or null
	 */
	public static MAccount getAccount (MAcctSchema as, String status, int withholding_id)
	{
		if (as == null)
			return null;

		String accountcolumn = "";
		if (status.equals(DocAction.STATUS_ToCollect) )
			accountcolumn = "tocollect_acct";
		else if (status.equals(DocAction.STATUS_Collect))
			accountcolumn = "collect_acct";
		else if(status.equals(DocAction.STATUS_Apply))
			accountcolumn = "apply_acct";
		else
			return null;
		String sql = "SELECT "+ accountcolumn +" FROM C_Withholding_acct WHERE C_AcctSchema_ID=? AND C_Withholding_ID = ?";
		int Account_ID = 0;
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql, null);
			pstmt.setInt (1, as.getC_AcctSchema_ID());
			pstmt.setInt (2, withholding_id);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next())
				Account_ID = rs.getInt(1);
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			return null;
		}
		//	No account
		if (Account_ID == 0)
		{
			return null;
		}

		//	Return Account
		MAccount acct = MAccount.get (as.getCtx(), Account_ID);
		return acct;
	}   //  getAccount

	public void setProcessMsg(String msg)
	{
		m_processMsg = msg;
	}
}
