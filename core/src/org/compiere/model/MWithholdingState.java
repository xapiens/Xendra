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
import org.compiere.model.persistence.X_C_WithholdingState;
import org.compiere.process.DocAction;
import org.compiere.process.DocumentEngine;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.xendra.exceptions.ConversionRateException;
import org.xendra.exceptions.XendraException;


public class MWithholdingState extends X_C_WithholdingState implements DocAction {

	private String 	m_processMsg = "";
	private boolean	m_justPrepared = false;	
	private String m_status;
	private String m_action;
	

	public MWithholdingState(Properties ctx, int C_WithholdingState_ID,	String trxName) {
		super(ctx, C_WithholdingState_ID, trxName);
		if (C_WithholdingState_ID == 0)
		{
		}
	}

	public MWithholdingState(Properties ctx, ResultSet rs,	String trxName) {
		super(ctx, rs, trxName);
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

	@Override
	public void setDocStatus(String newStatus) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getDocStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean processIt(String action) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

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

	@Override
	public String prepareIt() {
		// TODO Auto-generated method stub
		return null;
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

	@Override
	public String completeIt() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDocumentNo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDocAction() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setProcessMsg(String msg)
	{
		m_processMsg = msg;
	}
}
