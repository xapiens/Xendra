/******************************************************************************
c * Product: Xendra ERP & CRM Smart Business Solution                          *
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
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;

import org.compiere.acct.Doc;
import org.compiere.model.persistence.X_C_AllocationHdr;
import org.compiere.model.persistence.X_C_BOE;
import org.compiere.model.persistence.X_C_BPartner;
import org.compiere.model.persistence.X_C_CashLine;
import org.compiere.model.persistence.X_C_DocType;
import org.compiere.model.persistence.X_C_Order;
import org.compiere.model.persistence.X_C_Payment;
import org.compiere.model.persistence.X_C_PaymentLine;
import org.compiere.model.reference.REF_C_BPartnerSOCreditStatus;
import org.compiere.model.reference.REF_C_CashTrxType;
import org.compiere.model.reference.REF_C_PaymentAVS;
import org.compiere.model.reference.REF_C_PaymentCreditCardType;
import org.compiere.model.reference.REF_C_PaymentTenderType;
import org.compiere.model.reference.REF_C_PaymentTrxType;
import org.compiere.model.reference.REF__DocumentAction;
import org.compiere.model.reference.REF_C_DocTypeDocBaseType;
import org.compiere.model.reference.REF__DocumentStatus;
import org.compiere.model.reference.REF__PaymentRule;
import org.compiere.process.DocAction;
import org.compiere.process.DocumentEngine;
import org.compiere.process.ProcessCall;
import org.compiere.process.ProcessInfo;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.compiere.util.Trx;
import org.compiere.util.ValueNamePair;
import org.xendra.exceptions.XendraException;

/**
 *  Payment Model.
 *  - retrieve and create payments for invoice
 *  <pre>
 *  Event chain
 *  - Payment inserted
 *      C_Payment_Trg fires
 *          update DocumentNo with payment summary
 *  - Payment posted (C_Payment_Post)
 *      create allocation line
 *          C_Allocation_Trg fires
 *              Update C_BPartner Open Item Amount
 *      update invoice (IsPaid)
 *      link invoice-payment if batch
 *
 *  Lifeline:
 *  -   Created by VPayment or directly
 *  -   When changed in VPayment
 *      - old payment is reversed
 *      - new payment created
 *
 *  When Payment is posed, the Allocation is made
 *  </pre>
 *  @author 	Jorg Janke
 *  @author victor.perez@e-evolution.com, e-Evolution http://www.e-evolution.com
 * 			<li>FR [ 1948157  ]  Is necessary the reference for document reverse
 *  		@see http://sourceforge.net/tracker/?func=detail&atid=879335&aid=1948157&group_id=176962 
 *			<li> FR [ 1866214 ]  
 *			@sse http://sourceforge.net/tracker/index.php?func=detail&aid=1866214&group_id=176962&atid=879335 
 * 			<li> FR [ 2520591 ] Support multiples calendar for Org 
 *			@see http://sourceforge.net/tracker2/?func=detail&atid=879335&aid=2520591&group_id=176962 
 *
 *  @author Carlos Ruiz - globalqss [ 2141475 ] Payment <> allocations must not be completed - implement lots of validations on prepareIt
 *  @version 	$Id: MPayment.java 5822 2016-06-15 22:56:06Z xapiens $
 */
public final class MPayment extends X_C_Payment 
	implements DocAction, ProcessCall
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5273805787122033169L;

	/**
	 * 	Get Payments Of BPartner
	 *	@param ctx context
	 *	@param C_BPartner_ID id
	 *	@param trxName transaction
	 *	@return array
	 */
	public static MPayment[] getOfBPartner (Properties ctx, int C_BPartner_ID, String trxName)
	{
		ArrayList<MPayment> list = new ArrayList<MPayment>();
		String sql = "SELECT * FROM C_Payment WHERE C_BPartner_ID=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			pstmt = DB.prepareStatement(sql, trxName);
			pstmt.setInt(1, C_BPartner_ID);
			rs = pstmt.executeQuery();
			while (rs.next())
				list.add(new MPayment(ctx,rs, trxName));
		}
		catch (Exception e)
		{
			s_log.log(Level.SEVERE, sql, e);
		}
		finally
		{
			DB.close(rs, pstmt);
			rs = null;
			pstmt = null;
		}

		//
		MPayment[] retValue = new MPayment[list.size()];
		list.toArray(retValue);
		return retValue;
	}	//	getOfBPartner
	
	
	/**************************************************************************
	 *  Default Constructor
	 *  @param ctx context
	 *  @param  C_Payment_ID    payment to load, (0 create new payment)
	 *  @param trxName trx name
	 */
	public MPayment (Properties ctx, int C_Payment_ID, String trxName)
	{
		super (ctx, C_Payment_ID, trxName);
		//  New
		if (C_Payment_ID == 0)
		{
			setDocAction(REF__DocumentAction.Complete);
			setDocStatus(REF__DocumentStatus.Drafted);
			setTrxType(REF_C_PaymentTrxType.Sales);
			//
			setR_AvsAddr (REF_C_PaymentAVS.Unavailable);
			setR_AvsZip (REF_C_PaymentAVS.Unavailable);
			//
			setIsReceipt (true);
			setIsApproved (false);
			setIsReconciled (false);
			setIsAllocated(false);
			setIsOnline (false);
			setIsSelfService(false);
			setIsDelayedCapture (false);
			setIsPrepayment(false);
			setProcessed(false);
			setProcessing(false);
			setPosted (false);
			//
			setPayAmt(Env.ZERO);
			setDiscountAmt(Env.ZERO);
			setTaxAmt(Env.ZERO);
			setWriteOffAmt(Env.ZERO);
			setIsOverUnderPayment (false);
			setOverUnderAmt(Env.ZERO);
			//
			setDateTrx (new Timestamp(System.currentTimeMillis()));
			//setDateAcct (getDateTrx());
			setTenderType(REF_C_PaymentTenderType.Check);
		}
	}   //  MPayment
	
	/**
	 *  Load Constructor
	 *  @param ctx context
	 *  @param rs result set record
	 *	@param trxName transaction
	 */
	public MPayment (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MPayment

	/**	Temporary	Payment Processors		*/
	private MPaymentProcessor[]	m_mPaymentProcessors = null;
	/**	Temporary	Payment Processor		*/
	private MPaymentProcessor	m_mPaymentProcessor = null;
	/** Logger								*/
	private static CLogger		s_log = CLogger.getCLogger (MPayment.class);
	/** Error Message						*/
	private String				m_errorMessage = null;
	
	/** Reversal Indicator			*/
	public static String	REVERSE_INDICATOR = "^";
	

	/**
	 *  Reset Payment to new status
	 */
	public void resetNew()
	{
		setC_Payment_ID(0);		//	forces new Record
		set_ValueNoCheck ("DocumentNo", null);
		setDocAction(REF__DocumentAction.Prepare);
		setDocStatus(REF__DocumentStatus.Drafted);
		setProcessed(false);
		setPosted (false);
		setIsReconciled (false);
		setIsAllocated(false);
		setIsOnline(false);
		setIsDelayedCapture (false);
	//	setC_BPartner_ID(0);
		setC_Invoice_ID(0);
		setC_Order_ID(0);
		setC_Charge_ID(0);
		setC_Project_ID(0);
		setIsPrepayment(false);
	}	//	resetNew

	/**
	 * 	Is Cashbook Transfer Trx
	 *	@return true if Cash Trx
	 */
	public boolean isCashTrx()
	{
		return "X".equals(getTenderType());
	}	//	isCashTrx
	
	/**************************************************************************
	 *  Set Credit Card.
	 *  Need to set PatmentProcessor after Amount/Currency Set
	 *
	 *  @param TrxType Transaction Type see TRX_
	 *  @param creditCardType CC type
	 *  @param creditCardNumber CC number
	 *  @param creditCardVV CC verification
	 *  @param creditCardExpMM CC Exp MM
	 *  @param creditCardExpYY CC Exp YY
	 *  @return true if valid
	 */
	public boolean setCreditCard (String TrxType, String creditCardType, String creditCardNumber,
		String creditCardVV, int creditCardExpMM, int creditCardExpYY)
	{
		setTenderType(REF_C_PaymentTenderType.CreditCard);
		setTrxType(TrxType);
		//
		setCreditCardType (creditCardType);
		setCreditCardNumber (creditCardNumber);
		setCreditCardVV (creditCardVV);
		setCreditCardExpMM (creditCardExpMM);
		setCreditCardExpYY (creditCardExpYY);
		//
		int check = MPaymentValidate.validateCreditCardNumber(creditCardNumber, creditCardType).length()
			+ MPaymentValidate.validateCreditCardExp(creditCardExpMM, creditCardExpYY).length();
		if (creditCardVV.length() > 0)
			check += MPaymentValidate.validateCreditCardVV(creditCardVV, creditCardType).length();
		return check == 0;
	}   //  setCreditCard

	/**
	 *  Set Credit Card - Exp.
	 *  Need to set PatmentProcessor after Amount/Currency Set
	 *
	 *  @param TrxType Transaction Type see TRX_
	 *  @param creditCardType CC type
	 *  @param creditCardNumber CC number
	 *  @param creditCardVV CC verification
	 *  @param creditCardExp CC Exp
	 *  @return true if valid
	 */
	public boolean setCreditCard (String TrxType, String creditCardType, String creditCardNumber,
		String creditCardVV, String creditCardExp)
	{
		return setCreditCard(TrxType, creditCardType, creditCardNumber,
			creditCardVV, MPaymentValidate.getCreditCardExpMM(creditCardExp), 
			MPaymentValidate.getCreditCardExpYY(creditCardExp));
	}   //  setCreditCard

	/**
	 *  Set ACH BankAccount Info
	 *
	 *  @param C_BankAccount_ID bank account
	 *  @param isReceipt true if receipt
	 *  @return true if valid
	 */
	public boolean setBankACH (MPaySelectionCheck preparedPayment)
	{
		//	Our Bank
		setC_BankAccount_ID(preparedPayment.getParent().getC_BankAccount_ID());
		//	Target Bank
		int C_BP_BankAccount_ID = preparedPayment.getC_BP_BankAccount_ID();
		MBPBankAccount ba = new MBPBankAccount (preparedPayment.getCtx(), C_BP_BankAccount_ID, null);
		setRoutingNo(ba.getRoutingNo());
		setAccountNo(ba.getAccountNo());
		setIsReceipt (REF__PaymentRule.DirectDebit.equals	//	AR only
				(preparedPayment.getPaymentRule()));
		//
		int check = MPaymentValidate.validateRoutingNo(getRoutingNo()).length()
			+ MPaymentValidate.validateAccountNo(getAccountNo()).length();
		return check == 0;
	}	//	setBankACH

	/**
	 *  Set ACH BankAccount Info
	 *
	 *  @param C_BankAccount_ID bank account
	 *  @param isReceipt true if receipt
	 * 	@param tenderType - Direct Debit or Direct Deposit
	 *  @param routingNo routing
	 *  @param accountNo account
	 *  @return true if valid
	 */
	public boolean setBankACH (int C_BankAccount_ID, boolean isReceipt, String tenderType, 
		String routingNo, String accountNo)
	{
		setTenderType (tenderType);
		setIsReceipt (isReceipt);
		//
		if (C_BankAccount_ID > 0
			&& (routingNo == null || routingNo.length() == 0 || accountNo == null || accountNo.length() == 0))
			setBankAccountDetails(C_BankAccount_ID);
		else
		{
			setC_BankAccount_ID(C_BankAccount_ID);
			setRoutingNo (routingNo);
			setAccountNo (accountNo);
		}
		setCheckNo ("");
		//
		int check = MPaymentValidate.validateRoutingNo(routingNo).length()
			+ MPaymentValidate.validateAccountNo(accountNo).length();
		return check == 0;
	}   //  setBankACH
	/**
	 *  Set Cash BankAccount Info
	 *
	 *  @param C_BankAccount_ID bank account
	 *  @param isReceipt true if receipt
	 * 	@param tenderType - Cash (Payment)
	 *  @return true if valid
	 */
	public boolean setBankCash (int C_BankAccount_ID, boolean isReceipt, String tenderType)
	{
		setTenderType (tenderType);
		setIsReceipt (isReceipt);
		//
		if (C_BankAccount_ID > 0)
			setBankAccountDetails(C_BankAccount_ID);
		else
		{
			setC_BankAccount_ID(C_BankAccount_ID);
		}
		//
		return true;
	}   //  setBankCash

	/**
	 *  Set Check BankAccount Info
	 *
	 *  @param C_BankAccount_ID bank account
	 *  @param isReceipt true if receipt
	 *  @param checkNo check no
	 *  @return true if valid
	 */
	public boolean setBankCheck (int C_BankAccount_ID, boolean isReceipt, String checkNo)
	{
		return setBankCheck (C_BankAccount_ID, isReceipt, null, null, checkNo);
	}	//	setBankCheck

	/**
	 *  Set Check BankAccount Info
	 *
	 *  @param C_BankAccount_ID bank account
	 *  @param isReceipt true if receipt
	 *  @param routingNo routing no
	 *  @param accountNo account no
	 *  @param checkNo chack no
	 *  @return true if valid
	 */
	public boolean setBankCheck (int C_BankAccount_ID, boolean isReceipt, 
		String routingNo, String accountNo, String checkNo)
	{
		setTenderType (REF_C_PaymentTenderType.Check);
		setIsReceipt (isReceipt);
		//
		if (C_BankAccount_ID > 0
			&& (routingNo == null || routingNo.length() == 0 
				|| accountNo == null || accountNo.length() == 0))
			setBankAccountDetails(C_BankAccount_ID);
		else
		{
			setC_BankAccount_ID(C_BankAccount_ID);
			setRoutingNo (routingNo);
			setAccountNo (accountNo);
		}
		setCheckNo (checkNo);
		//
		int check = MPaymentValidate.validateRoutingNo(routingNo).length()
			+ MPaymentValidate.validateAccountNo(accountNo).length()
			+ MPaymentValidate.validateCheckNo(checkNo).length();
		return check == 0;       //  no error message
	}   //  setBankCheck

	/**
	 * 	Set Bank Account Details.
	 * 	Look up Routing No & Bank Acct No
	 * 	@param C_BankAccount_ID bank account
	 */
	public void setBankAccountDetails (int C_BankAccount_ID)
	{
		if (C_BankAccount_ID == 0)
			return;
		setC_BankAccount_ID(C_BankAccount_ID);
		//
		String sql = "SELECT b.RoutingNo, ba.AccountNo "
			+ "FROM C_BankAccount ba"
			+ " INNER JOIN C_Bank b ON (ba.C_Bank_ID=b.C_Bank_ID) "
			+ "WHERE C_BankAccount_ID=?";
		PreparedStatement pstmt = null; 
		ResultSet rs = null;
		try
		{
			pstmt = DB.prepareStatement(sql, get_TrxName());
			pstmt.setInt(1, C_BankAccount_ID);
			rs = pstmt.executeQuery();
			if (rs.next())
			{
				setRoutingNo (rs.getString(1));
				setAccountNo (rs.getString(2));
			}
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql, e);
		}
		finally
		{
			DB.close(rs, pstmt);
			rs = null;
			pstmt = null;
		}
	}	//	setBankAccountDetails

	/**
	 *  Set Account Address
	 *
	 *  @param name name
	 *  @param street street
	 *  @param city city
	 *  @param state state
	 *  @param zip zip
	 * 	@param country country
	 */
	public void setAccountAddress (String name, String street,
		String city, String state, String zip, String country)
	{
		setA_Name (name);
		setA_Street (street);
		setA_City (city);
		setA_State (state);
		setA_Zip (zip);
		setA_Country(country);
	}   //  setAccountAddress

	
	/**************************************************************************
	 *  Process Payment
	 *  @return true if approved
	 */
	public boolean processOnline()
	{
		log.info ("Amt=" + getPayAmt());
		//
		setIsOnline(true);
		setErrorMessage(null);
		//	prevent charging twice
		if (isApproved())
		{
			log.info("Already processed - " + getR_Result() + " - " + getR_RespMsg());
			setErrorMessage("Payment already Processed");
			return true;
		}

		if (m_mPaymentProcessor == null)
			setPaymentProcessor();
		if (m_mPaymentProcessor == null)
		{
			log.log(Level.WARNING, "No Payment Processor Model");
			setErrorMessage("No Payment Processor Model");
			return false;
		}

		boolean approved = false;

		try
		{
			PaymentProcessor pp = PaymentProcessor.create(m_mPaymentProcessor, this);
			if (pp == null)
				setErrorMessage("No Payment Processor");
			else
			{
				approved = pp.processCC ();
				if (approved)
					setErrorMessage(null);
				else
					setErrorMessage("From " +  getCreditCardName() + ": " + getR_RespMsg());
			}
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, "processOnline", e);
			setErrorMessage("Payment Processor Error");
		}
		setIsApproved(approved);
		return approved;
	}   //  processOnline

	/**
	 *  Process Online Payment.
	 *  implements ProcessCall after standard constructor
	 *  Called when pressing the Process_Online button in C_Payment
	 *
	 *  @param ctx Context
	 *  @param pi Process Info
	 *  @param trx transaction
	 *  @return true if the next process should be performed
	 */
	public boolean startProcess (Properties ctx, ProcessInfo pi, Trx trx)
	{
		log.info("startProcess - " + pi.getRecord_ID());
		boolean retValue = false;
		//
		if (pi.getRecord_ID() != get_ID())
		{
			log.log(Level.SEVERE, "startProcess - Not same Payment - " + pi.getRecord_ID());
			return false;
		}
		//  Process it
		retValue = processOnline();
		save();
		return retValue;    //  Payment processed
	}   //  startProcess

	
	/**
	 * 	Before Save
	 *	@param newRecord new
	 *	@return save
	 */
	protected boolean beforeSave (boolean newRecord)
	{
		// @Trifon - CashPayments
		//if ( getTenderType().equals("X") ) {
		if ( isCashTrx() && !MSysConfig.getBooleanValue("CASH_AS_PAYMENT", true , getAD_Client_ID())) {
			// Cash Book Is mandatory
			if ( getC_CashBook_ID() <= 0 ) {
				log.saveError("Error", Msg.parseTranslation(getCtx(), "@Mandatory@: @C_CashBook_ID@"));
				return false;
			}
		} else {
			// Bank Account Is mandatory
			if ( getC_BankAccount_ID() <= 0 ) {
				log.saveError("Error", Msg.parseTranslation(getCtx(), "@Mandatory@: @C_BankAccount_ID@"));
				return false;
			}
		}
		// end @Trifon - CashPayments
		
		//	We have a charge
		if (getC_Charge_ID() != 0) 
		{
			if (newRecord || is_ValueChanged("C_Charge_ID"))
			{
				setC_Order_ID(0);
				setC_Invoice_ID(0);
				setWriteOffAmt(Env.ZERO);
				setDiscountAmt(Env.ZERO);
				setIsOverUnderPayment(false);
				setOverUnderAmt(Env.ZERO);
				setIsPrepayment(false);
			}
		}
		//	We need a BPartner
		else if (getC_BPartner_ID() == 0 && !isCashTrx())
		{
			if (getC_Invoice_ID() != 0)
				;
			else if (getC_Order_ID() != 0)
				;
			else
			{
				log.saveError("Error", Msg.parseTranslation(getCtx(), "@NotFound@: @C_BPartner_ID@"));
				return false;
			}
		}
		//	Prepayment: No charge and order or project (not as acct dimension)
		if (newRecord 
			|| is_ValueChanged("C_Charge_ID") || is_ValueChanged("C_Invoice_ID")
			|| is_ValueChanged("C_Order_ID") || is_ValueChanged("C_Project_ID"))
			setIsPrepayment (getC_Charge_ID() == 0 
				&& getC_BPartner_ID() != 0
				&& (getC_Order_ID() != 0 
					|| (getC_Project_ID() != 0 && getC_Invoice_ID() == 0)));
		if (isPrepayment())
		{
			if (newRecord 
				|| is_ValueChanged("C_Order_ID") || is_ValueChanged("C_Project_ID"))
			{
				setWriteOffAmt(Env.ZERO);
				setDiscountAmt(Env.ZERO);
				setIsOverUnderPayment(false);
				setOverUnderAmt(Env.ZERO);
			}
		}
		
		//	Document Type/Receipt
		if (getC_DocType_ID() == 0)
			setC_DocType_ID();
		else
		{
			MDocType dt = MDocType.get(getCtx(), getC_DocType_ID());
			setIsReceipt(dt.isSOTrx());
		}
		setDocumentNo();
		//
		if (getDateAcct() == null)
			setDateAcct(getDateTrx());
		//
		if (!isOverUnderPayment())
			setOverUnderAmt(Env.ZERO);
		
		//	Organization
		if ((newRecord || is_ValueChanged("C_BankAccount_ID"))
			&& getC_Charge_ID() == 0)	//	allow different org for charge
		{
			MBankAccount ba = MBankAccount.get(getCtx(), getC_BankAccount_ID());
			if (ba.getAD_Org_ID() != 0)
				setAD_Org_ID(ba.getAD_Org_ID());
		}
		
		// xendra : added transfer 
		
		MDocType dt = MDocType.get(getCtx(), getC_DocType_ID());
		if (dt.getDocBaseType().equals(REF_C_DocTypeDocBaseType.BankAccountTransfer)) {
			// Obtenemos los datos de la cuenta bancaria destino
			MBankAccount bankaccount = MBankAccount.get(getCtx(), getDest_BankAccount_ID());
			// Si es null , nos cagamos
			if (bankaccount == null) {
				log.saveError("FillMandatory", "bankaccount with id = "+getDest_BankAccount_ID()+" doesnt exist");
				m_processMsg = "bankaccount with id = "+getDest_BankAccount_ID()+" doesnt exist";
				return false;
			}
			
			setTenderType(REF_C_PaymentTenderType.Transfer);
			setIsReceipt(false);

			if (isTransferSource()) {
				if (newRecord) {
					MPayment destPayment = new MPayment(getCtx(), 0, get_TrxName());
					destPayment.setC_BPartner_ID(getC_BPartner_ID());
					destPayment.setTenderType(REF_C_PaymentTenderType.Transfer);
					destPayment.setC_DocType_ID(getC_DocType_ID());
					destPayment.setC_BankAccount_ID(getDest_BankAccount_ID());
					destPayment.setDateTrx(getDateTrx());
					destPayment.setDateAcct(getDateAcct());
					destPayment.setDescription(getDescription());
					// Tomo la moneda del banco destino
					destPayment.setC_Currency_ID(bankaccount.getC_Currency_ID());
					
					// Preparamos el cambio de moneda.
					if (getC_Currency_ID() != destPayment.getC_Currency_ID()) {
						// Convertimos y seteamos
						BigDecimal payAmountOnDestBank = MConversionRate.convert(getCtx(), getPayAmt(), getC_Currency_ID(), 
									destPayment.getC_Currency_ID(), getDateTrx(), getC_ConversionType_ID(), getAD_Client_ID(), getAD_Org_ID());						
						if (payAmountOnDestBank != null) {
							destPayment.setPayAmt(payAmountOnDestBank );							
						} else {
							log.saveError("FillMandatory", "Currency rate from   "+getC_Currency_ID()+" to "+destPayment.getC_Currency_ID()+ " for date "+getDateTrx()+" doesnt exist");
							m_processMsg = "Currency rate from   "+getC_Currency_ID()+" to "+destPayment.getC_Currency_ID()+ " for date "+getDateTrx()+" doesnt exist";
							return false;
						}
						
					} else {
						// Mismo currency no hay problema.
						destPayment.setPayAmt(getPayAmt());
					}
					destPayment.setC_ConversionType_ID(getC_ConversionType_ID());
					destPayment.setDiscountAmt(getDiscountAmt());
					destPayment.setWriteOffAmt(getWriteOffAmt());
					destPayment.setIsOverUnderPayment(isOverUnderPayment());
					destPayment.setOverUnderAmt(getOverUnderAmt());
					destPayment.setIsTransfer(true);
					destPayment.setIsTransferSource(false);
					destPayment.setDocStatus(REF__DocumentStatus.Completed);
					destPayment.setDocAction(REF__DocumentAction.Close);
					destPayment.setIsReceipt(true);
					destPayment.setPosted(true);
					destPayment.setProcessed(true);
					if (!destPayment.save()) return false;
					setDest_Payment_ID(destPayment.get_ID());
				}
				else {
					MPayment destPayment = new MPayment(getCtx(), getDest_Payment_ID(), get_TrxName());
					/*if (destPayment.getDocStatus().equals(REF__DocumentStatus.Drafted)) {
						log.saveError("Error", Msg.parseTranslation(getCtx(), "@Error@: Destination Payment is completed. Open it before updating the source payment."));
						return false;
					}*/
					destPayment.setC_BPartner_ID(getC_BPartner_ID());
					destPayment.setTenderType(REF_C_PaymentTenderType.Transfer);
					destPayment.setC_DocType_ID(getC_DocType_ID());
					destPayment.setC_BankAccount_ID(getDest_BankAccount_ID());
					destPayment.setDateTrx(getDateTrx());
					destPayment.setDateAcct(getDateAcct());
					destPayment.setDescription(getDescription());
					// Tomo la moneda del banco destino
					destPayment.setC_Currency_ID(bankaccount.getC_Currency_ID());
					
					// Preparamos el cambio de moneda.
					if (getC_Currency_ID() != destPayment.getC_Currency_ID()) {
						// Convertimos y seteamos
						BigDecimal payAmountOnDestBank = MConversionRate.convert(getCtx(), getPayAmt(), getC_Currency_ID(), 
									destPayment.getC_Currency_ID(), getDateTrx(), getC_ConversionType_ID(), getAD_Client_ID(), getAD_Org_ID());						
						if (payAmountOnDestBank != null) {
							destPayment.setPayAmt(payAmountOnDestBank );							
						} else {
							log.saveError("FillMandatory", "Currency rate from   "+getC_Currency_ID()+" to "+destPayment.getC_Currency_ID()+ " for date "+getDateTrx()+" doesnt exist");
							m_processMsg = "Currency rate from   "+getC_Currency_ID()+" to "+destPayment.getC_Currency_ID()+ " for date "+getDateTrx()+" doesnt exist";
							return false;
						}
						
					} else {
						// Mismo currency no hay problema.
						destPayment.setPayAmt(getPayAmt());
					}

					
					destPayment.setC_ConversionType_ID(getC_ConversionType_ID());

					destPayment.setDiscountAmt(getDiscountAmt());
					destPayment.setWriteOffAmt(getWriteOffAmt());
					destPayment.setIsOverUnderPayment(isOverUnderPayment());
					destPayment.setOverUnderAmt(getOverUnderAmt());
					destPayment.setDocStatus(REF__DocumentStatus.Completed);
					destPayment.setDocAction(REF__DocumentAction.Close);
					destPayment.setIsTransfer(true);
					destPayment.setIsTransferSource(false);
					destPayment.setIsReceipt(true);
					destPayment.setPosted(true);
					destPayment.setProcessed(true);
					if (!destPayment.save()) return false;					
				}
			}
		}		
		// [ adempiere-Bugs-1885417 ] Validate BP on Payment Prepare or BeforeSave
		// there is bp and (invoice or order)
		if (getC_BPartner_ID() != 0 && (getC_Invoice_ID() != 0 || getC_Order_ID() != 0)) {
			if (getC_Invoice_ID() != 0) {
				MInvoice inv = new MInvoice(getCtx(), getC_Invoice_ID(), get_TrxName());
				if (inv.getC_BPartner_ID() != getC_BPartner_ID()) {
					log.saveError("Error", Msg.parseTranslation(getCtx(), "BP different from BP Invoice"));
					return false;
				}
			}
			if (getC_Order_ID() != 0) {
				MOrder ord = new MOrder(getCtx(), getC_Order_ID(), get_TrxName());
				if (ord.getC_BPartner_ID() != getC_BPartner_ID()) {
					log.saveError("Error", Msg.parseTranslation(getCtx(), "BP different from BP Order"));
					return false;
				}
			}
		}
		String CheckNo = getCheckNo(); 
		if (CheckNo==null || getTenderType().equals(REF_C_PaymentTenderType.Transfer))
			CheckNo = "";
		
		if (getC_BankAccountDoc_ID() != 0 && CheckNo.length() > 0)
		{
			Integer lastDocumentNo = new Integer(CheckNo); 
			if ( lastDocumentNo > 0 )
			{
				StringBuffer sb = new StringBuffer();
				sb.append("UPDATE C_BankAccountDoc SET CurrentNext=").append(lastDocumentNo)
					.append(" WHERE C_BankAccount_ID=").append(getC_BankAccount_ID())
					.append(" AND C_BankAccountDoc_ID=").append(getC_BankAccountDoc_ID());
				DB.executeUpdate(sb.toString(), null);
			}
		}

		return true;
	}	//	beforeSave
	
	/**
	 * 	Get Allocated Amt in Payment Currency
	 *	@return amount or null
	 */
	public BigDecimal getAllocatedAmt ()
	{
		BigDecimal retValue = null;
		if (getC_Charge_ID() != 0)
			return getPayAmt();
		//
		String sql = "SELECT SUM(currencyConvert(al.Amount,"
				+ "0,ah.C_Currency_ID, p.C_Currency_ID,ah.DateTrx,p.C_ConversionType_ID, al.AD_Client_ID,al.AD_Org_ID)) "
			+ "FROM C_AllocationLine al"
			+ " INNER JOIN C_AllocationHdr ah ON (al.C_AllocationHdr_ID=ah.C_AllocationHdr_ID) "
			+ " INNER JOIN C_Payment p ON (al.C_Payment_ID=p.C_Payment_ID) "
			+ "WHERE al.C_Payment_ID=?"
			+ " AND ah.IsActive='Y' AND al.IsActive='Y'";
		//	+ " AND al.C_Invoice_ID IS NOT NULL";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			pstmt = DB.prepareStatement(sql, get_TrxName());
			pstmt.setInt(1, getC_Payment_ID());
			rs = pstmt.executeQuery();
			if (rs.next())
				retValue = rs.getBigDecimal(1);
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, "getAllocatedAmt", e);
		}
		finally
		{
			DB.close(rs, pstmt);
			rs = null;
			pstmt = null;
		}
	//	log.fine("getAllocatedAmt - " + retValue);
		//	? ROUND(COALESCE(v_AllocatedAmt,0), 2);
		return retValue;
	}	//	getAllocatedAmt

	/**
	 * 	Test Allocation (and set allocated flag)
	 *	@return true if updated
	 */
	public boolean testAllocation()
	{
		//	Cash Trx always allocated!!! WHY???
/* @Trifon - CashPayments
		if (isCashTrx())
		{
			if (!isAllocated())
			{
				setIsAllocated(true);
				return true;
			}
			return false;
		}
*/
		//
		BigDecimal alloc = getAllocatedAmt();
		if (alloc == null)
			alloc = Env.ZERO;
		BigDecimal total = getPayAmt();
		if (!isReceipt())
			total = total.negate();
		boolean test = total.compareTo(alloc) == 0;
		boolean change = test != isAllocated();
		if (change)
			setIsAllocated(test);
		log.fine("Allocated=" + test 
			+ " (" + alloc + "=" + total + ")");
		return change;
	}	//	testAllocation
	
	/**
	 * 	Set Allocated Flag for payments
	 * 	@param ctx context
	 *	@param C_BPartner_ID if 0 all
	 *	@param trxName trx
	 */
	public static void setIsAllocated (Properties ctx, int C_BPartner_ID, String trxName)
	{
		int counter = 0;
		String sql = "SELECT * FROM C_Payment "
			+ "WHERE IsAllocated='N' AND DocStatus IN ('CO','CL')";
		if (C_BPartner_ID > 1)
			sql += " AND C_BPartner_ID=?";
		else
			sql += " AND AD_Client_ID=" + Env.getAD_Client_ID(ctx);
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			pstmt = DB.prepareStatement (sql, trxName);
			if (C_BPartner_ID > 1)
				pstmt.setInt (1, C_BPartner_ID);
			rs = pstmt.executeQuery ();
			while (rs.next ())
			{
				MPayment pay = new MPayment (ctx, rs, trxName);
				if (pay.testAllocation())
					if (pay.save())
						counter++;
			}
		}
		catch (Exception e)
		{
			s_log.log(Level.SEVERE, sql, e);
		}
		finally
		{
			DB.close(rs, pstmt);
			rs = null;
			pstmt = null;
		}
		s_log.config("#" + counter);
	}	//	setIsAllocated

	/**************************************************************************
	 * 	Set Error Message
	 *	@param errorMessage error message
	 */
	public void setErrorMessage(String errorMessage)
	{
		m_errorMessage = errorMessage;
	}	//	setErrorMessage

	/**
	 * 	Get Error Message
	 *	@return error message
	 */
	public String getErrorMessage()
	{
		return m_errorMessage;
	}	//	getErrorMessage


	/**
	 *  Set Bank Account for Payment.
	 *  @param C_BankAccount_ID C_BankAccount_ID
	 */
	public void setC_BankAccount_ID (int C_BankAccount_ID)
	{
		if (C_BankAccount_ID == 0)
		{
			setPaymentProcessor();
			if (getC_BankAccount_ID() == 0)
				throw new IllegalArgumentException("Can't find Bank Account");
		}
		else
			super.setC_BankAccount_ID(C_BankAccount_ID);
	}	//	setC_BankAccount_ID

	/**
	 *  Set BankAccount and PaymentProcessor
	 *  @return true if found
	 */
	public boolean setPaymentProcessor ()
	{
		return setPaymentProcessor (getTenderType(), getCreditCardType());
	}	//	setPaymentProcessor

	/**
	 *  Set BankAccount and PaymentProcessor
	 *  @param tender TenderType see TENDER_
	 *  @param CCType CC Type see CC_
	 *  @return true if found
	 */
	public boolean setPaymentProcessor (String tender, String CCType)
	{
		m_mPaymentProcessor = null;
		//	Get Processor List
		if (m_mPaymentProcessors == null || m_mPaymentProcessors.length == 0)
			m_mPaymentProcessors = MPaymentProcessor.find (getCtx(), tender, CCType, getAD_Client_ID(),
				getC_Currency_ID(), getPayAmt(), get_TrxName());
		//	Relax Amount
		if (m_mPaymentProcessors == null || m_mPaymentProcessors.length == 0)
			m_mPaymentProcessors = MPaymentProcessor.find (getCtx(), tender, CCType, getAD_Client_ID(),
				getC_Currency_ID(), Env.ZERO, get_TrxName());
		if (m_mPaymentProcessors == null || m_mPaymentProcessors.length == 0)
			return false;

		//	Find the first right one
		for (int i = 0; i < m_mPaymentProcessors.length; i++)
		{
			if (m_mPaymentProcessors[i].accepts (tender, CCType))
			{
				m_mPaymentProcessor = m_mPaymentProcessors[i];
			}
		}
		if (m_mPaymentProcessor != null)
			setC_BankAccount_ID (m_mPaymentProcessor.getC_BankAccount_ID());
		//
		return m_mPaymentProcessor != null;
	}   //  setPaymentProcessor


	/**
	 * 	Get Accepted Credit Cards for PayAmt (default 0)
	 *	@return credit cards
	 */
	public ValueNamePair[] getCreditCards ()
	{
		return getCreditCards(getPayAmt());
	}	//	getCreditCards


	/**
	 * 	Get Accepted Credit Cards for amount
	 *	@param amt trx amount
	 *	@return credit cards
	 */
	public ValueNamePair[] getCreditCards (BigDecimal amt)
	{
		try
		{
			if (m_mPaymentProcessors == null || m_mPaymentProcessors.length == 0)
				m_mPaymentProcessors = MPaymentProcessor.find (getCtx (), null, null, 
					getAD_Client_ID (), getC_Currency_ID (), amt, get_TrxName());
			//
			HashMap<String,ValueNamePair> map = new HashMap<String,ValueNamePair>(); //	to eliminate duplicates
			for (int i = 0; i < m_mPaymentProcessors.length; i++)
			{
				if (m_mPaymentProcessors[i].isAcceptAMEX ())
					map.put (REF_C_PaymentCreditCardType.Amex, getCreditCardPair (REF_C_PaymentCreditCardType.Amex));
				if (m_mPaymentProcessors[i].isAcceptDiners ())
					map.put (REF_C_PaymentCreditCardType.Diners, getCreditCardPair (REF_C_PaymentCreditCardType.Diners));
				if (m_mPaymentProcessors[i].isAcceptDiscover ())
					map.put (REF_C_PaymentCreditCardType.Discover, getCreditCardPair (REF_C_PaymentCreditCardType.Discover));
				if (m_mPaymentProcessors[i].isAcceptMC ())
					map.put (REF_C_PaymentCreditCardType.MasterCard, getCreditCardPair (REF_C_PaymentCreditCardType.MasterCard));
				if (m_mPaymentProcessors[i].isAcceptCorporate ())
					map.put (REF_C_PaymentCreditCardType.PurchaseCard, getCreditCardPair (REF_C_PaymentCreditCardType.PurchaseCard));
				if (m_mPaymentProcessors[i].isAcceptVisa ())
					map.put (REF_C_PaymentCreditCardType.Visa, getCreditCardPair (REF_C_PaymentCreditCardType.Visa));
			} //	for all payment processors
			//
			ValueNamePair[] retValue = new ValueNamePair[map.size ()];
			map.values ().toArray (retValue);
			log.fine("getCreditCards - #" + retValue.length + " - Processors=" + m_mPaymentProcessors.length);
			return retValue;
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}	//	getCreditCards

	/**
	 * 	Get Type and name pair
	 *	@param CreditCardType credit card Type
	 *	@return pair
	 */
	private ValueNamePair getCreditCardPair (String CreditCardType)
	{
		return new ValueNamePair (CreditCardType, getCreditCardName(CreditCardType));
	}	//	getCreditCardPair

	
	/**************************************************************************
	 *  Credit Card Number
	 *  @param CreditCardNumber CreditCard Number
	 */
	public void setCreditCardNumber (String CreditCardNumber)
	{
		super.setCreditCardNumber (MPaymentValidate.checkNumeric(CreditCardNumber));
	}	//	setCreditCardNumber
	
	/**
	 *  Verification Code
	 *  @param newCreditCardVV CC verification
	 */
	public void setCreditCardVV(String newCreditCardVV)
	{
		super.setCreditCardVV (MPaymentValidate.checkNumeric(newCreditCardVV));
	}	//	setCreditCardVV

	/**
	 *  Two Digit CreditCard MM
	 *  @param CreditCardExpMM Exp month
	 */
	public void setCreditCardExpMM (int CreditCardExpMM)
	{
		if (CreditCardExpMM < 1 || CreditCardExpMM > 12)
			;
		else
			super.setCreditCardExpMM (CreditCardExpMM);
	}	//	setCreditCardExpMM

	/**
	 *  Two digit CreditCard YY (til 2020)
	 *  @param newCreditCardExpYY 2 or 4 digit year
	 */
	public void setCreditCardExpYY (int newCreditCardExpYY)
	{
		int CreditCardExpYY = newCreditCardExpYY;
		if (newCreditCardExpYY > 1999)
			CreditCardExpYY = newCreditCardExpYY-2000;
		super.setCreditCardExpYY(CreditCardExpYY);
	}	//	setCreditCardExpYY

	/**
	 *  CreditCard Exp  MMYY
	 *  @param mmyy Exp in form of mmyy
	 *  @return true if valid
	 */
	public boolean setCreditCardExp (String mmyy)
	{
		if (MPaymentValidate.validateCreditCardExp(mmyy).length() != 0)
			return false;
		//
		String exp = MPaymentValidate.checkNumeric(mmyy);
		String mmStr = exp.substring(0,2);
		String yyStr = exp.substring(2,4);
		setCreditCardExpMM (Integer.parseInt(mmStr));
		setCreditCardExpYY (Integer.parseInt(yyStr));
		return true;
	}   //  setCreditCardExp


	/**
	 *  CreditCard Exp  MMYY
	 *  @param delimiter / - or null
	 *  @return Exp
	 */
	public String getCreditCardExp(String delimiter)
	{
		String mm = String.valueOf(getCreditCardExpMM());
		String yy = String.valueOf(getCreditCardExpYY());

		StringBuffer retValue = new StringBuffer();
		if (mm.length() == 1)
			retValue.append("0");
		retValue.append(mm);
		//
		if (delimiter != null)
			retValue.append(delimiter);
		//
		if (yy.length() == 1)
			retValue.append("0");
		retValue.append(yy);
		//
		return (retValue.toString());
	}   //  getCreditCardExp

	/**
	 *  MICR
	 *  @param MICR MICR
	 */
	public void setMicr (String MICR)
	{
		super.setMicr (MPaymentValidate.checkNumeric(MICR));
	}	//	setBankMICR

	/**
	 *  Routing No
	 *  @param RoutingNo Routing No
	 */
	public void setRoutingNo(String RoutingNo)
	{
		super.setRoutingNo (MPaymentValidate.checkNumeric(RoutingNo));
	}	//	setBankRoutingNo


	/**
	 *  Bank Account No
	 *  @param AccountNo AccountNo
	 */
	public void setAccountNo (String AccountNo)
	{
		super.setAccountNo (MPaymentValidate.checkNumeric(AccountNo));
	}	//	setBankAccountNo


	/**
	 *  Check No
	 *  @param CheckNo Check No
	 */
	public void setCheckNo(String CheckNo)
	{
		super.setCheckNo(MPaymentValidate.checkNumeric(CheckNo));
	}	//	setBankCheckNo


	/**
	 *  Set DocumentNo to Payment info.
	 * 	If there is a R_PnRef that is set automatically 
	 */
	private void setDocumentNo()
	{
		//	Cash Transfer
		if ("X".equals(getTenderType()))
			return;
		//	Current Document No
		String documentNo = getDocumentNo();
		//	Existing reversal
		if (documentNo != null 
			&& documentNo.indexOf(REVERSE_INDICATOR) >= 0)
			return;
		
		//	If external number exists - enforce it 
		if (getR_PnRef() != null && getR_PnRef().length() > 0)
		{
			if (!getR_PnRef().equals(documentNo))
				setDocumentNo(getR_PnRef());
			return;
		}
		
		documentNo = "";
		// globalqss - read configuration to assign credit card or check number number for Payments
		//	Credit Card
		if (REF_C_PaymentTenderType.CreditCard.equals(getTenderType()))
		{
			if (MSysConfig.getBooleanValue("PAYMENT_OVERWRITE_DOCUMENTNO_WITH_CREDIT_CARD", true, getAD_Client_ID())) {
				documentNo = getCreditCardType()
					+ " " + Obscure.obscure(getCreditCardNumber())
					+ " " + getCreditCardExpMM() 
					+ "/" + getCreditCardExpYY();
			}
		}
		//	Own Check No
		else if (REF_C_PaymentTenderType.Check.equals(getTenderType())
			&& !isReceipt()
			&& getCheckNo() != null && getCheckNo().length() > 0)
		{
			if (MSysConfig.getBooleanValue("PAYMENT_OVERWRITE_DOCUMENTNO_WITH_CHECK_ON_PAYMENT", true, getAD_Client_ID())) {
				documentNo = getCheckNo();
			}
		}
		//	Customer Check: Routing: Account #Check 
		else if (REF_C_PaymentTenderType.Check.equals(getTenderType())
			&& isReceipt())
		{
			if (MSysConfig.getBooleanValue("PAYMENT_OVERWRITE_DOCUMENTNO_WITH_CHECK_ON_RECEIPT", true, getAD_Client_ID())) {
				if (getRoutingNo() != null)
					documentNo = getRoutingNo() + ": ";
				if (getAccountNo() != null)
					documentNo += getAccountNo();
				if (getCheckNo() != null)
				{
					if (documentNo.length() > 0)
						documentNo += " ";
					documentNo += "#" + getCheckNo();
				}
			}
		}

		//	Set Document No
		documentNo = documentNo.trim();
		if (documentNo.length() > 0)
			setDocumentNo(documentNo);
	}	//	setDocumentNo

	/**
	 * 	Set Refernce No (and Document No)
	 *	@param R_PnRef reference
	 */
	public void setR_PnRef (String R_PnRef)
	{
		super.setR_PnRef (R_PnRef);
		if (R_PnRef != null)
			setDocumentNo (R_PnRef);
	}	//	setR_PnRef
	
	//	---------------

	/**
	 *  Set Payment Amount
	 *  @param PayAmt Pay Amt
	 */
	public void setPayAmt (BigDecimal PayAmt)
	{
		super.setPayAmt(PayAmt == null ? Env.ZERO : PayAmt);
	}	//	setPayAmt

	/**
	 *  Set Payment Amount
	 *
	 * @param C_Currency_ID currency
	 * @param payAmt amount
	 */
	public void setAmount (int C_Currency_ID, BigDecimal payAmt)
	{
		if (C_Currency_ID == 0)
			C_Currency_ID = MClient.get(getCtx()).getC_Currency_ID();
		setC_Currency_ID(C_Currency_ID);
		setPayAmt(payAmt);
	}   //  setAmount

	/**
	 *  Discount Amt
	 *  @param DiscountAmt Discount
	 */
	public void setDiscountAmt (BigDecimal DiscountAmt)
	{
		super.setDiscountAmt (DiscountAmt == null ? Env.ZERO : DiscountAmt);
	}	//	setDiscountAmt

	/**
	 *  WriteOff Amt
	 *  @param WriteOffAmt WriteOff
	 */
	public void setWriteOffAmt (BigDecimal WriteOffAmt)
	{
		super.setWriteOffAmt (WriteOffAmt == null ? Env.ZERO : WriteOffAmt);
	}	//	setWriteOffAmt

	/**
	 *  OverUnder Amt
	 *  @param OverUnderAmt OverUnder
	 */
	public void setOverUnderAmt (BigDecimal OverUnderAmt)
	{
		super.setOverUnderAmt (OverUnderAmt == null ? Env.ZERO : OverUnderAmt);
		setIsOverUnderPayment(getOverUnderAmt().compareTo(Env.ZERO) != 0);
	}	//	setOverUnderAmt

	/**
	 *  Tax Amt
	 *  @param TaxAmt Tax
	 */
	public void setTaxAmt (BigDecimal TaxAmt)
	{
		super.setTaxAmt (TaxAmt == null ? Env.ZERO : TaxAmt);
	}	//	setTaxAmt

	/**
	 * 	Set Info from BP Bank Account
	 *	@param ba BP bank account
	 */
	public void setBP_BankAccount (MBPBankAccount ba)
	{
		log.fine("" + ba);
		if (ba == null)
			return;
		setC_BPartner_ID(ba.getC_BPartner_ID());
		setAccountAddress(ba.getA_Name(), ba.getA_Street(), ba.getA_City(),
			ba.getA_State(), ba.getA_Zip(), ba.getA_Country());
		setA_EMail(ba.getA_EMail());
		setA_Ident_DL(ba.getA_Ident_DL());
		setA_Ident_SSN(ba.getA_Ident_SSN());
		//	CC
		if (ba.getCreditCardType() != null)
			setCreditCardType(ba.getCreditCardType());
		if (ba.getCreditCardNumber() != null)
			setCreditCardNumber(ba.getCreditCardNumber());
		if (ba.getCreditCardExpMM() != 0)
			setCreditCardExpMM(ba.getCreditCardExpMM());
		if (ba.getCreditCardExpYY() != 0)
			setCreditCardExpYY(ba.getCreditCardExpYY());
		if (ba.getCreditCardVV() != null)
			setCreditCardVV(ba.getCreditCardVV());
		//	Bank
		if (ba.getAccountNo() != null)
			setAccountNo(ba.getAccountNo());
		if (ba.getRoutingNo() != null)
			setRoutingNo(ba.getRoutingNo());
	}	//	setBP_BankAccount

	/**
	 * 	Save Info from BP Bank Account
	 *	@param ba BP bank account
	 * 	@return true if saved
	 */
	public boolean saveToBP_BankAccount (MBPBankAccount ba)
	{
		if (ba == null)
			return false;
		ba.setA_Name(getA_Name());
		ba.setA_Street(getA_Street());
		ba.setA_City(getA_City());
		ba.setA_State(getA_State());
		ba.setA_Zip(getA_Zip());
		ba.setA_Country(getA_Country());
		ba.setA_EMail(getA_EMail());
		ba.setA_Ident_DL(getA_Ident_DL());
		ba.setA_Ident_SSN(getA_Ident_SSN());
		//	CC
		ba.setCreditCardType(getCreditCardType());
		ba.setCreditCardNumber(getCreditCardNumber());
		ba.setCreditCardExpMM(getCreditCardExpMM());
		ba.setCreditCardExpYY(getCreditCardExpYY());
		ba.setCreditCardVV(getCreditCardVV());
		//	Bank
		if (getAccountNo() != null)
			ba.setAccountNo(getAccountNo());
		if (getRoutingNo() != null)
			ba.setRoutingNo(getRoutingNo());
		//	Trx
		ba.setR_AvsAddr(getR_AvsAddr());
		ba.setR_AvsZip(getR_AvsZip());
		//
		boolean ok = ba.save(get_TrxName());
		log.fine("saveToBP_BankAccount - " + ba);
		return ok;
	}	//	setBP_BankAccount

	/**
	 * 	Set Doc Type bases on IsReceipt
	 */
	private void setC_DocType_ID ()
	{
		setC_DocType_ID(isReceipt());
	}	//	setC_DocType_ID

	/**
	 * 	Set Doc Type
	 * 	@param isReceipt is receipt
	 */
	public void setC_DocType_ID (boolean isReceipt)
	{
		setIsReceipt(isReceipt);
		String sql = "SELECT C_DocType_ID FROM C_DocType WHERE AD_Client_ID=? AND DocBaseType=? ORDER BY IsDefault DESC";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			pstmt = DB.prepareStatement(sql, get_TrxName());
			pstmt.setInt(1, getAD_Client_ID());
			if (isReceipt)
				pstmt.setString(2, REF_C_DocTypeDocBaseType.ARReceipt);
			else
				pstmt.setString(2, REF_C_DocTypeDocBaseType.APPayment);
			rs = pstmt.executeQuery();
			if (rs.next())
				setC_DocType_ID(rs.getInt(1));
			else
				log.warning ("setDocType - NOT found - isReceipt=" + isReceipt);
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql, e);
		}
		finally
		{
			DB.close(rs, pstmt);
			rs = null;
			pstmt = null;
		}
	}	//	setC_DocType_ID

	
	/**
	 * 	Set Document Type
	 *	@param C_DocType_ID doc type
	 */
	public void setC_DocType_ID (int C_DocType_ID)
	{
	//	if (getDocumentNo() != null && getC_DocType_ID() != C_DocType_ID)
	//		setDocumentNo(null);
		super.setC_DocType_ID(C_DocType_ID);
	}	//	setC_DocType_ID
	
	/**
	 * 	Verify Document Type with Invoice
	 * @param pAllocs 
	 *	@return true if ok
	 */
	private boolean verifyDocType(MPaymentAllocate[] pAllocs)
	{
		if (getC_DocType_ID() == 0)
			return false;
		//
		Boolean documentSO = null;
		//	Check Invoice First
		if (getC_Invoice_ID() > 0)
		{
			String sql = "SELECT idt.IsSOTrx "
				+ "FROM C_Invoice i"
				+ " INNER JOIN C_DocType idt ON (i.C_DocType_ID=idt.C_DocType_ID) "
				+ "WHERE i.C_Invoice_ID=?";
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try
			{
				pstmt = DB.prepareStatement(sql, get_TrxName());
				pstmt.setInt(1, getC_Invoice_ID());
				rs = pstmt.executeQuery();
				if (rs.next())
					documentSO = new Boolean ("Y".equals(rs.getString(1)));
			}
			catch (Exception e)
			{
				log.log(Level.SEVERE, sql, e);
			}
			finally
			{
				DB.close(rs, pstmt);
				rs = null;
				pstmt = null;
			}
		}	//	now Order - in Xendra is allowed to pay PO or receive SO
		else if (getC_Order_ID() > 0)
		{
			String sql = "SELECT odt.IsSOTrx "
				+ "FROM C_Order o"
				+ " INNER JOIN C_DocType odt ON (o.C_DocType_ID=odt.C_DocType_ID) "
				+ "WHERE o.C_Order_ID=?";
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try
			{
				pstmt = DB.prepareStatement(sql, get_TrxName());
				pstmt.setInt(1, getC_Order_ID());
				rs = pstmt.executeQuery();
				if (rs.next())
					documentSO = new Boolean ("Y".equals(rs.getString(1)));
			}
			catch (Exception e)
			{
				log.log(Level.SEVERE, sql, e);
			}
			finally
			{
				DB.close(rs, pstmt);
				rs = null;
				pstmt = null;
			}
		}	//	now Charge
		else if (getC_Charge_ID() > 0) 
		{
			// do nothing about charge
		} // now payment allocate
		else
		{
			if (pAllocs.length > 0) {
				for (MPaymentAllocate pAlloc : pAllocs) {
					String sql = "SELECT idt.IsSOTrx "
						+ "FROM C_Invoice i"
						+ " INNER JOIN C_DocType idt ON (i.C_DocType_ID=idt.C_DocType_ID) "
						+ "WHERE i.C_Invoice_ID=?";
					PreparedStatement pstmt = null;
					ResultSet rs = null;
					try
					{
						pstmt = DB.prepareStatement(sql, get_TrxName());
						pstmt.setInt(1, pAlloc.getC_Invoice_ID());
						rs = pstmt.executeQuery();
						if (rs.next()) {
							if (documentSO != null) { // already set, compare with current
								if (documentSO.booleanValue() != ("Y".equals(rs.getString(1)))) {
									return false;
								}
							} else {
								documentSO = new Boolean ("Y".equals(rs.getString(1)));
							}
						}
					}
					catch (Exception e)
					{
						log.log(Level.SEVERE, sql, e);
					}
					finally
					{
						DB.close(rs, pstmt);
						rs = null;
						pstmt = null;
					}
				}
			}
		}
		
		//	DocumentType
		Boolean paymentSO = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT IsSOTrx "
			+ "FROM C_DocType "
			+ "WHERE C_DocType_ID=?";
		try
		{
			pstmt = DB.prepareStatement(sql, get_TrxName());
			pstmt.setInt(1, getC_DocType_ID());
			rs = pstmt.executeQuery();
			if (rs.next())
				paymentSO = new Boolean ("Y".equals(rs.getString(1)));
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, sql, e);
		}
		finally
		{
			DB.close(rs, pstmt);
			rs = null;
			pstmt = null;
		}
		//	No Payment info
		if (paymentSO == null)
			return false;
		setIsReceipt(paymentSO.booleanValue());
			
		//	We have an Invoice .. and it does not match
		if (documentSO != null 
				&& documentSO.booleanValue() != paymentSO.booleanValue())
			return false;
		//	OK
		return true;
	}	//	verifyDocType

	/**
	 * 	Verify Payment Allocate is ignored (must not exists) if the payment header has charge/invoice/order
	 * @param pAllocs 
	 *	@return true if ok
	 */
	private boolean verifyPaymentAllocateVsHeader(MPaymentAllocate[] pAllocs) {
		if (pAllocs.length > 0) {
			if (getC_Charge_ID() > 0 || getC_Invoice_ID() > 0 || getC_Order_ID() > 0)
				return false;
		}
		return true;
	}

	/**
	 * 	Verify Payment Allocate Sum must be equal to the Payment Amount
	 * @param pAllocs 
	 *	@return true if ok
	 */
	private boolean verifyPaymentAllocateSum(MPaymentAllocate[] pAllocs) {
		BigDecimal sumPaymentAllocates = Env.ZERO;
		if (pAllocs.length > 0) {
			for (MPaymentAllocate pAlloc : pAllocs)
				sumPaymentAllocates = sumPaymentAllocates.add(pAlloc.getAmount());
			if (getPayAmt().compareTo(sumPaymentAllocates) != 0)
				return false;
		}
		return true;
	}

	/**
	 * 	Verify Payment Line Sum must be equal to the Payment Amount
	 * @param paymentline 
	 *	@return true if ok
	 */
	private boolean verifyPaymentLineSum(MPaymentLine[] plines) {
		BigDecimal sumPaymentLines = Env.ZERO;
		String conversion = "";
		if (plines.length > 0) {
			MAcctSchema[] ass = MAcctSchema.getClientAcctSchema(Env.getCtx(), getAD_Client_ID());
			BigDecimal TotPayAmt = Env.ZERO;
			DecimalFormat format = DisplayType.getNumberFormat(DisplayType.Amount);
			for (MAcctSchema as:ass)
			{				
				for (MPaymentLine line : plines)
				{
					MCurrency currency = MCurrency.get(Env.getCtx(), line.getC_Currency_ID());
					BigDecimal amount = MConversionRate.convert(getCtx(), line.getPayAmt().add(line.getWithholdingAmt()).setScale(currency.getStdPrecision(), BigDecimal.ROUND_HALF_UP), line.getC_Currency_ID(), 
							getC_Currency_ID(), getDateTrx(), line.getC_ConversionType_ID(), getAD_Client_ID(), getAD_Org_ID(), true);

					
					conversion = conversion + "linea "+format.format(line.getPayAmt())+" convertido a "+format.format(amount)+" "+MConversionType.get(Env.getCtx(), line.getC_ConversionType_ID()).getName()+" ";
					
					if (getC_Currency_ID() != as.getC_Currency_ID())
					{
						amount = MConversionRate.convert(getCtx(),
								amount, getC_Currency_ID(), 
								as.getC_Currency_ID(), 
								getDateTrx(), 
								line.getC_ConversionType_ID(), 
								getAD_Client_ID(), getAD_Org_ID(), true);
						conversion = conversion + " convertido a " + format.format(amount);
					}
					conversion = conversion + "\n";
					sumPaymentLines = sumPaymentLines.add(amount);
				}
				conversion = conversion + "\n Total Lineas : " + format.format(sumPaymentLines);
				
				TotPayAmt = MConversionRate.convert(getCtx(), 
						getPayAmt().abs(), getC_Currency_ID(), 
						as.getC_Currency_ID(), 
						getDateTrx(), 
						getC_ConversionType_ID(), 
						getAD_Client_ID(), getAD_Org_ID(), true);
				conversion = conversion  + "\n Total : "+format.format(getPayAmt())+" convertido a "+format.format(TotPayAmt);
			}
			BigDecimal diff = TotPayAmt.abs().subtract(sumPaymentLines.abs());
			double open = diff.doubleValue();
			if (open >= -0.02 && open <= 0.02)
				diff = Env.ZERO;
			if (diff.compareTo(Env.ZERO) != 0)
			{				
				conversion = "La suma de las lineas no coincide con el total de la cabecera revise el detalle a continuacion:\n" + conversion;
				m_processMsg = conversion;
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 	Verify Payment Charge Sum must be equal to the Payment Amount
	 * @param pAllocsCharge 
	 *	@return true if ok
	 */	
	private boolean verifyPaymentChargeSum(MPaymentCharge[] pAllocsCharge) {
		BigDecimal sumPaymentCharges = Env.ZERO;
		if (pAllocsCharge.length > 0) {
			for (MPaymentCharge pAlloc : pAllocsCharge)
				sumPaymentCharges = sumPaymentCharges.add(pAlloc.getChargeAmt());
			if (getPayAmt().compareTo(sumPaymentCharges) != 0)
				return false;
		}
		return true;
	}

	/**
	 *	Get ISO Code of Currency
	 *	@return Currency ISO
	 */
	public String getCurrencyISO()
	{
		return MCurrency.getISO_Code (getCtx(), getC_Currency_ID());
	}	//	getCurrencyISO

	/**
	 * 	Get Document Status
	 *	@return Document Status Clear Text
	 */
	public String getDocStatusName()
	{
		return MRefList.getListName(getCtx(), REF__DocumentStatus.Identifier, getDocStatus());
	}	//	getDocStatusName

	/**
	 *	Get Name of Credit Card
	 *	@return Name
	 */
	public String getCreditCardName()
	{
		return getCreditCardName(getCreditCardType());
	}	//	getCreditCardName

	/**
	 *	Get Name of Credit Card
	 * 	@param CreditCardType credit card type
	 *	@return Name
	 */
	public String getCreditCardName(String CreditCardType)
	{
		if (CreditCardType == null)
			return "--";
		else if (REF_C_PaymentCreditCardType.MasterCard.equals(CreditCardType))
			return "MasterCard";
		else if (REF_C_PaymentCreditCardType.Visa.equals(CreditCardType))
			return "Visa";
		else if (REF_C_PaymentCreditCardType.Amex.equals(CreditCardType))
			return "Amex";
		else if (REF_C_PaymentCreditCardType.ATM.equals(CreditCardType))
			return "ATM";
		else if (REF_C_PaymentCreditCardType.Diners.equals(CreditCardType))
			return "Diners";
		else if (REF_C_PaymentCreditCardType.Discover.equals(CreditCardType))
			return "Discover";
		else if (REF_C_PaymentCreditCardType.PurchaseCard.equals(CreditCardType))
			return "PurchaseCard";
		return "?" + CreditCardType + "?";
	}	//	getCreditCardName

	/**
	 * 	Add to Description
	 *	@param description text
	 */
	public void addDescription (String description)
	{
		String desc = getDescription();
		if (desc == null)
			setDescription(description);
		else
			setDescription(desc + " | " + description);
	}	//	addDescription
	
	
	/**
	 * 	Get Pay Amt
	 * 	@param absolute if true the absolute amount (i.e. negative if payment)
	 *	@return amount
	 */
	public BigDecimal getPayAmt (boolean absolute)
	{
		if (isReceipt())
			return super.getPayAmt();
		return super.getPayAmt().negate();
	}	//	getPayAmt
	
	/**
	 * 	Get Pay Amt in cents
	 *	@return amount in cents
	 */
	public int getPayAmtInCents ()
	{
		BigDecimal bd = super.getPayAmt().multiply(Env.ONEHUNDRED);
		return bd.intValue();
	}	//	getPayAmtInCents
	
	/**************************************************************************
	 * 	Process document
	 *	@param processAction document action
	 *	@return true if performed
	 */
	public boolean processIt (String processAction)
	{
		m_processMsg = null;
		DocumentEngine engine = new DocumentEngine (this, getDocStatus());
		if (processAction.equals(engine.ACTION_None) 
				&& getDocStatus().equals(engine.ACTION_Complete) 
				&& getDocAction().equals(ACTION_Restore))
		{
			return RestoreIt();
		}
		else
		{
			return engine.processIt (processAction, getDocAction());
		}		
	}	//	process
	
	/**	Process Message 			*/
	private String		m_processMsg = null;
	/**	Just Prepared Flag			*/
	private boolean		m_justPrepared = false;
	private MPaymentLine[] m_lines;

	/**
	 * 	Unlock Document.
	 * 	@return true if success 
	 */
	public boolean unlockIt()
	{
		log.info(toString());
		setProcessing(false);
		return true;
	}	//	unlockIt
	
	/**
	 * 	Invalidate Document
	 * 	@return true if success 
	 */
	public boolean invalidateIt()
	{
		log.info(toString());
		setDocAction(REF__DocumentAction.Prepare);
		return true;
	}	//	invalidateIt

	
	/**************************************************************************
	 *	Prepare Document
	 * 	@return new status (In Progress or Invalid) 
	 */
	public String prepareIt()
	{
		log.info(toString());
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_BEFORE_PREPARE);
		if (m_processMsg != null)
			return DocAction.STATUS_Invalid;

		if (! MPaySelectionCheck.deleteGeneratedDraft(getCtx(), getC_Payment_ID(), get_TrxName())) {
			m_processMsg = "Could not delete draft generated payment selection lines";
			return DocAction.STATUS_Invalid;
		}

		//	Std Period open?
		if (!MPeriod.isOpen(getCtx(), getDateAcct(), 
			isReceipt() ? REF_C_DocTypeDocBaseType.ARReceipt : REF_C_DocTypeDocBaseType.APPayment, getAD_Org_ID()))
		{
			m_processMsg = "@PeriodClosed@";
			return DocAction.STATUS_Invalid;
		}

		//	Unsuccessful Online Payment
		if (isOnline() && !isApproved())
		{
			if (getR_Result() != null)
				m_processMsg = "@OnlinePaymentFailed@";
			else
				m_processMsg = "@PaymentNotProcessed@";
			return DocAction.STATUS_Invalid;
		}
		
		//	Waiting Payment - Need to create Invoice & Shipment
		if (getC_Order_ID() != 0 && getC_Invoice_ID() == 0)
		{	//	see WebOrder.process
			MOrder order = new MOrder (getCtx(), getC_Order_ID(), get_TrxName());
			if (REF__DocumentStatus.WaitingPayment.equals(order.getDocStatus()))
			{
				order.setC_Payment_ID(getC_Payment_ID());
				order.setDocAction(REF__DocumentAction.WaitComplete);
				order.set_TrxName(get_TrxName());
			//	boolean ok = 
				order.processIt (REF__DocumentAction.WaitComplete);
				m_processMsg = order.getProcessMsg();
				order.saveEx(get_TrxName());
				//	Set Invoice
				MInvoice[] invoices = order.getInvoices();
				int length = invoices.length;
				if (length > 0)		//	get last invoice
					setC_Invoice_ID (invoices[length-1].getC_Invoice_ID());
				//
				if (getC_Invoice_ID() == 0)
				{
					m_processMsg = "@NotFound@ @C_Invoice_ID@";
					return DocAction.STATUS_Invalid;
				}
			}	//	WaitingPayment
		}
		
		MPaymentAllocate[] pAllocs = MPaymentAllocate.get(this);		
		MPaymentCharge[] pAllocsCharge = MPaymentCharge.get(this);
		MPaymentLine[] paymentlines = MPaymentLine.get(this);
		
		//	Consistency of Invoice / Document Type and IsReceipt
		if (!verifyDocType(pAllocs))
		{
			m_processMsg = "@PaymentDocTypeInvoiceInconsistent@";
			return DocAction.STATUS_Invalid;
		}
		
		//	Payment Allocate is ignored if charge/invoice/order exists in header
		if (!verifyPaymentAllocateVsHeader(pAllocs))
		{
			m_processMsg = "@PaymentAllocateIgnored@";
			return DocAction.STATUS_Invalid;
		}

		//	Payment Amount must be equal to sum of Allocate amounts
		if (!verifyPaymentAllocateSum(pAllocs))
		{
			m_processMsg = "@PaymentAllocateSumInconsistent@";
			return DocAction.STATUS_Invalid;
		}

		//	Payment Amount must be equal to sum of line amounts
		if (!verifyPaymentLineSum(paymentlines))
		{
			//m_processMsg = "@PaymentLineSumInconsistent@";
			return DocAction.STATUS_Invalid;
		}
		
		//	Payment Amount must be equal to sum of Allocate amounts
		if (!verifyPaymentChargeSum(pAllocsCharge))
		{
			m_processMsg = "@PaymentChargeSumInconsistent@";
			return DocAction.STATUS_Invalid;
		}
		
		//	Do not pay when Credit Stop/Hold
		if (!isReceipt())
		{
			MBPartner bp = new MBPartner (getCtx(), getC_BPartner_ID(), get_TrxName());
			if (REF_C_BPartnerSOCreditStatus.CreditStop.equals(bp.getSOCreditStatus()))
			{
				m_processMsg = "@BPartnerCreditStop@ - @TotalOpenBalance@=" 
					+ bp.getTotalOpenBalance()
					+ ", @SO_CreditLimit@=" + bp.getSO_CreditLimit();
				return DocAction.STATUS_Invalid;
			}
			if (REF_C_BPartnerSOCreditStatus.CreditHold.equals(bp.getSOCreditStatus()))
			{
				m_processMsg = "@BPartnerCreditHold@ - @TotalOpenBalance@=" 
					+ bp.getTotalOpenBalance()
					+ ", @SO_CreditLimit@=" + bp.getSO_CreditLimit();
				return DocAction.STATUS_Invalid;
			}
		}
		
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_AFTER_PREPARE);
		if (m_processMsg != null)
			return DocAction.STATUS_Invalid;

		m_justPrepared = true;
		if (!REF__DocumentAction.Complete.equals(getDocAction()))
			setDocAction(REF__DocumentAction.Complete);
		return DocAction.STATUS_InProgress;
	}	//	prepareIt
	
	/**
	 * 	Approve Document
	 * 	@return true if success 
	 */
	public boolean  approveIt()
	{
		log.info(toString());
		setIsApproved(true);
		return true;
	}	//	approveIt
	
	/**
	 * 	Reject Approval
	 * 	@return true if success 
	 */
	public boolean rejectIt()
	{
		log.info(toString());
		setIsApproved(false);
		return true;
	}	//	rejectIt

	
	/**************************************************************************
	 * 	Complete Document
	 * 	@return new status (Complete, In Progress, Invalid, Waiting ..)
	 */
	public String completeIt()
	{
		//	Re-Check
		if (!m_justPrepared)
		{
			String status = prepareIt();
			if (!DocAction.STATUS_InProgress.equals(status))
				return status;
		}
		
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_BEFORE_COMPLETE);
		if (m_processMsg != null)
			return DocAction.STATUS_Invalid;

		//	Implicit Approval
		if (!isApproved())
			approveIt();
		log.info(toString());

		//	Charge Handling
		if (getC_Charge_ID() != 0)
		{
			setIsAllocated(true);
		}
		else
		{
			if (!allocateIt())	//	Create Allocation Records
			{
				if (m_processMsg != null && m_processMsg.length() > 0)
				{
					return DocAction.STATUS_Invalid;
				}
				// se quita lo demas porque ya no aplica, sin embargo se agrega la condicional que no tengan lineas para dar error
				// porque los pagos adelantados no tienen lineas.
				MPaymentLine[] lines = MPaymentLine.get(this);
				if (lines.length > 0)
					return DocAction.STATUS_Invalid;
//				if 	(getC_BOEConfirm_ID() == 0 && getC_Charge_ID() == 0 && getC_BOE_ID() == 0 && getC_Charge_ID() == 0 )
//				{
//					// do nothing
//					if (getC_Invoice_ID() != 0)
//						return DocAction.STATUS_Invalid;
//				}
//				else
//				{
//					//	Create invoice Allocation -	See also MCash.completeIt		
//					if (getC_Invoice_ID() != 0)												
//						m_processMsg = "Documento ya cancelado";
//					return DocAction.STATUS_Invalid;
//				}
			}
			else
				testAllocation();
		}

		//	Project update
		if (getC_Project_ID() != 0)
		{
		//	MProject project = new MProject(getCtx(), getC_Project_ID());
		}
		//	Update BP for Prepayments
		if (getC_BPartner_ID() != 0 && getC_Invoice_ID() == 0 && getC_Charge_ID() == 0)
		{
			MBPartner bp = new MBPartner (getCtx(), getC_BPartner_ID(), get_TrxName());
			//	Update total balance to include this payment 
			BigDecimal payAmt = MConversionRate.convertBase(getCtx(), getC_DocType_ID(), getPayAmt(), 
				getC_Currency_ID(), getDateTrx(), getC_ConversionType_ID(), getAD_Client_ID(), getAD_Org_ID());
			if (payAmt == null)
			{
				m_processMsg = "no existe tipo de cambio  "
				.concat(MConversionType.get(getCtx(), getC_ConversionType_ID()).getName())
				.concat(" para la moneda ")
				.concat(MCurrency.get(getCtx(), getC_Currency_ID()).getCurSymbol() )
				.concat(" en la fecha ")
				.concat(getDateTrx().toString());
				//m_processMsg = "Could not convert C_Currency_ID=" + getC_Currency_ID()
				//	+ " to base C_Currency_ID=" + MClient.get(Env.getCtx()).getC_Currency_ID();
				return DocAction.STATUS_Invalid;
			}
			//	Total Balance
			BigDecimal newBalance = bp.getTotalOpenBalance(false);
			if (newBalance == null)
				newBalance = Env.ZERO;
			if (isReceipt())
				newBalance = newBalance.subtract(payAmt);
			else
				newBalance = newBalance.add(payAmt);
				
			bp.setTotalOpenBalance(newBalance);
			bp.setSOCreditStatus();
			bp.saveEx();
		}		

		//	Counter Doc
		MPayment counter = createCounterDoc();
		if (counter != null)
			m_processMsg += " @CounterDoc@: @C_Payment_ID@=" + counter.getDocumentNo();

		// @xapiens 
		if (getC_Cash_ID() > 0 )
		{
			MCash cash = new MCash (getCtx(), getC_Cash_ID(), get_TrxName());
			cash.setC_Payment_ID(getC_Payment_ID());
			cash.save();
		}
		// @Trifon - CashPayments
		//if ( getTenderType().equals("X") ) {
		if ( isCashTrx() && !MSysConfig.getBooleanValue("CASH_AS_PAYMENT", true , getAD_Client_ID())) {
			// Create Cash Book entry
			if ( getC_CashBook_ID() <= 0 ) {
				log.saveError("Error", Msg.parseTranslation(getCtx(), "@Mandatory@: @C_CashBook_ID@"));
				m_processMsg = "@NoCashBook@";
				return DocAction.STATUS_Invalid;
			}
			MCash cash = MCash.get (getCtx(), getAD_Org_ID(), getDateAcct(), getC_Currency_ID(), get_TrxName());
			if (cash == null || cash.get_ID() == 0)
			{
				m_processMsg = "@NoCashBook@";
				return DocAction.STATUS_Invalid;
			}
			MCashLine cl = new MCashLine( cash );
			cl.setCashType(REF_C_CashTrxType.GeneralReceipts );
			cl.setDescription("Generated From Payment #" + getDocumentNo());
			cl.setC_Currency_ID( this.getC_Currency_ID() );
			cl.setC_Payment_ID( getC_Payment_ID() ); // Set Reference to payment.
			StringBuffer info=new StringBuffer();
			info.append("Cash journal ( ")
				.append(cash.getDocumentNo()).append(" )");				
			m_processMsg = info.toString();
			//	Amount
			BigDecimal amt = this.getPayAmt();
/*
			MDocType dt = MDocType.get(getCtx(), invoice.getC_DocType_ID());			
			if (REF_C_DocTypeDocBaseType.APInvoice.equals( dt.getDocBaseType() )
				|| REF_C_DocTypeDocBaseType.ARCreditMemo.equals( dt.getDocBaseType() ) 
			) {
				amt = amt.negate();
			}
*/
			cl.setAmount( amt );
			//
			cl.setDiscountAmt( Env.ZERO );
			cl.setWriteOffAmt( Env.ZERO );
			cl.setIsGenerated( true );
			
			if (!cl.save(get_TrxName()))
			{
				m_processMsg = "Could not save Cash Journal Line";
				return DocAction.STATUS_Invalid;
			}
		}
		// End Trifon - CashPayments
		
		//	User Validation
		String valid = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_AFTER_COMPLETE);
		if (valid != null)
		{
			m_processMsg = valid;
			return DocAction.STATUS_Invalid;
		}
		
		// Set the definite document number after completed (if needed)
		setDefiniteDocumentNo();

		//
		setProcessed(true);
		setDocAction(REF__DocumentAction.Close);
		return DocAction.STATUS_Completed;
	}	//	completeIt
	
	/**
	 * 	Set the definite document number after completed
	 */
	private void setDefiniteDocumentNo() {
		MDocType dt = MDocType.get(getCtx(), getC_DocType_ID());
		if (dt.isOverwriteDateOnComplete()) {
			setDateTrx(new Timestamp (System.currentTimeMillis()));
		}
		if (dt.isOverwriteSeqOnComplete()) {
			String value = DB.getDocumentNo(getC_DocType_ID(), get_TrxName(), true, this);
			if (value != null)
				setDocumentNo(value);
		}
	}

	/**
	 * 	Create Counter Document
	 * 	@return payment
	 */
	private MPayment createCounterDoc()
	{
		//	Is this a counter doc ?
		if (getRef_Payment_ID() != 0)
			return null;

		//	Org Must be linked to BPartner
		MOrg org = MOrg.get(getCtx(), getAD_Org_ID());
		int counterC_BPartner_ID = org.getLinkedC_BPartner_ID(get_TrxName()); 
		if (counterC_BPartner_ID == 0)
			return null;
		//	Business Partner needs to be linked to Org
		MBPartner bp = new MBPartner (getCtx(), getC_BPartner_ID(), get_TrxName());
		int counterAD_Org_ID = bp.getAD_OrgBP_ID_Int(); 
		if (counterAD_Org_ID == 0)
			return null;
		
		MBPartner counterBP = new MBPartner (getCtx(), counterC_BPartner_ID, get_TrxName());
	//	MOrgInfo counterOrgInfo = MOrgInfo.get(getCtx(), counterAD_Org_ID);
		log.info("Counter BP=" + counterBP.getName());

		//	Document Type
		int C_DocTypeTarget_ID = 0;
		MDocTypeCounter counterDT = MDocTypeCounter.getCounterDocType(getCtx(), getC_DocType_ID());
		if (counterDT != null)
		{
			log.fine(counterDT.toString());
			if (!counterDT.isCreateCounter() || !counterDT.isValid())
				return null;
			C_DocTypeTarget_ID = counterDT.getCounter_C_DocType_ID();
		}
		else	//	indirect
		{
			C_DocTypeTarget_ID = MDocTypeCounter.getCounterDocType_ID(getCtx(), getC_DocType_ID());
			log.fine("Indirect C_DocTypeTarget_ID=" + C_DocTypeTarget_ID);
			if (C_DocTypeTarget_ID <= 0)
				return null;
		}

		//	Deep Copy
		MPayment counter = new MPayment (getCtx(), 0, get_TrxName());
		counter.setAD_Org_ID(counterAD_Org_ID);
		counter.setC_BPartner_ID(counterBP.getC_BPartner_ID());
		counter.setIsReceipt(!isReceipt());
		counter.setC_DocType_ID(C_DocTypeTarget_ID);
		counter.setTrxType(getTrxType());
		counter.setTenderType(getTenderType());
		//
		counter.setPayAmt(getPayAmt());
		counter.setDiscountAmt(getDiscountAmt());
		counter.setTaxAmt(getTaxAmt());
		counter.setWriteOffAmt(getWriteOffAmt());
		counter.setIsOverUnderPayment (isOverUnderPayment());
		counter.setOverUnderAmt(getOverUnderAmt());
		counter.setC_Currency_ID(getC_Currency_ID());
		counter.setC_ConversionType_ID(getC_ConversionType_ID());
		//
		counter.setDateTrx (getDateTrx());
		counter.setDateAcct (getDateAcct());
		counter.setRef_Payment_ID(getC_Payment_ID());
		//
		String sql = "SELECT C_BankAccount_ID FROM C_BankAccount "
			+ "WHERE C_Currency_ID=? AND AD_Org_ID IN (0,?) AND IsActive='Y' "
			+ "ORDER BY IsDefault DESC";
		int C_BankAccount_ID = DB.getSQLValue(get_TrxName(), sql, getC_Currency_ID(), counterAD_Org_ID);
		counter.setC_BankAccount_ID(C_BankAccount_ID);

		//	References
		counter.setC_Activity_ID(getC_Activity_ID());
		counter.setC_Campaign_ID(getC_Campaign_ID());
		counter.setC_Project_ID(getC_Project_ID());
		counter.setUser1_ID(getUser1_ID());
		counter.setUser2_ID(getUser2_ID());
		counter.saveEx(get_TrxName());
		log.fine(counter.toString());
		setRef_Payment_ID(counter.getC_Payment_ID());
		
		//	Document Action
		if (counterDT != null)
		{
			if (counterDT.getDocAction() != null)
			{
				counter.setDocAction(counterDT.getDocAction());
				counter.processIt(counterDT.getDocAction());
				counter.saveEx(get_TrxName());
			}
		}
		return counter;
	}	//	createCounterDoc
	
	/**
	 * 	Allocate It.
	 * 	Only call when there is NO allocation as it will create duplicates.
	 * 	If an invoice exists, it allocates that 
	 * 	otherwise it allocates Payment Selection.
	 *	@return true if allocated
	 */
	public boolean allocateIt()
	{
		if (getC_BOEConfirm_ID() != 0 ) // && getC_Charge_ID() == 0)
		{
			setIsAllocated(true);
			return true;
		}
//		Create BOE Allocation -	See also MCash.completeIt
		if (getC_BOE_ID() != 0 && getC_Charge_ID() == 0)
			return allocateBOE();				
		
		// Allocation PaymentLine
		MPaymentLine[] lines = MPaymentLine.get(this);
		if (lines.length > 0)
		{
			MAllocation alloc = new MAllocation();
			if (!alloc.addHeader(this,  getDateTrx(), getDateTrx(), getC_Currency_ID(), get_TrxName()))
				return false;
//			MAllocationHdr alloc = new MAllocationHdr(getCtx(), false, 
//					getDateTrx(), getC_Currency_ID(), 
//						Msg.translate(getCtx(), "C_Payment_ID")	+ ": " + getDocumentNo(), 
//						get_TrxName());
//			alloc.setAD_Org_ID(getAD_Org_ID());
//			if (!alloc.save())
//			{
//				log.severe("Line Allocations not created");
//				return false;
//			}
			//	Lines
			for (int i = 0; i < lines.length; i++)
			{
				MPaymentLine paymentline = lines[i];
				if (paymentline.getWithholdingAmt().signum() > 0)
				{
					MWithholdingLine wline = MWithholdingLine.get(Env.getCtx(), X_C_PaymentLine.Table_ID, paymentline.getC_PaymentLine_ID(), get_TrxName());						
					if (wline != null)
					{
						if (wline.getWithholdingAmt().compareTo(paymentline.getWithholdingAmt()) != 0 
								&& wline.getParent().getDocStatus().equals(DocAction.STATUS_Completed))
						{
							MInvoice invoice = MInvoice.get(Env.getCtx(),paymentline.getC_Invoice_ID());
							m_processMsg = "no se puede alterar una percepcion ya completada Factura : "+invoice.getDocumentNo();
							return false;
						}
						else if (!wline.getParent().getDocStatus().equals(DocAction.STATUS_Completed))
						{
							wline.delete(true);
						}
					}
				}
				if (!alloc.addLine(paymentline))
				{
					m_processMsg = "no se pudo crear allocationline";
					return false;
				}
				//MAllocationLine aLine = null;
			}	
			if (alloc.completeIt())
			{
				if (alloc.save())
				{
					if (!MFactAcct.alreadyPosted(X_C_AllocationHdr.Table_ID, alloc.getC_AllocationHdr_ID(), get_TrxName()))
					{				
						String error = DocumentEngine.postImmediate(getCtx(),
						getAD_Client_ID(), X_C_AllocationHdr.Table_ID, alloc.getC_AllocationHdr_ID(), true,
						get_TrxName());
					if (error != null)
						m_processMsg = error;				
					}
				}
			}
			else		
				m_processMsg = "no se pudo completar";
				//m_processMsg = "@C_AllocationHdr_ID@: " + alloc.getDocumentNo();
 			return true;			
		}

		//	Create invoice Allocation -	See also MCash.completeIt		
		if (getC_Invoice_ID() != 0)
			return allocateInvoice();
		//	Invoices of a AP Payment Selection
		if (allocatePaySelection())
			return true;
		
		if (getC_Order_ID() != 0)
			return false;
			
		//	Allocate to multiple Payments based on entry
		MPaymentAllocate[] pAllocs = MPaymentAllocate.get(this);
		if (pAllocs.length == 0)
			return false;
		
		MAllocationHdr alloc = new MAllocationHdr(getCtx(), false, 
			getDateTrx(), getC_Currency_ID(), 
				Msg.translate(getCtx(), "C_Payment_ID")	+ ": " + getDocumentNo(), 
				get_TrxName());
		alloc.setAD_Org_ID(getAD_Org_ID());
		if (!alloc.save())
		{
			log.severe("P.Allocations not created");
			return false;
		}
		//	Lines
		for (int i = 0; i < pAllocs.length; i++)
		{
			MPaymentAllocate pa = pAllocs[i];
			MAllocationLine aLine = null;
			if (isReceipt())
				aLine = new MAllocationLine (alloc, pa.getAmount().abs(), 
					pa.getDiscountAmt().abs(), pa.getWriteOffAmt().abs(), pa.getOverUnderAmt().abs());
			else
				aLine = new MAllocationLine (alloc, pa.getAmount().abs().negate(), 
					pa.getDiscountAmt().abs().negate(), pa.getWriteOffAmt().abs().negate(), pa.getOverUnderAmt().abs().negate());
			aLine.setDocInfo(pa.getC_BPartner_ID(), 0, pa.getC_Invoice_ID());
			aLine.setPaymentInfo(getC_Payment_ID(), 0);
			aLine.setC_Currency_ID(getC_Currency_ID());
			if (!aLine.save(get_TrxName()))
				log.warning("P.Allocations - line not saved");
			else
			{
				pa.setC_AllocationLine_ID(aLine.getC_AllocationLine_ID());
				pa.saveEx();
			}
		}
		//	Should start WF
		alloc.processIt(DocAction.ACTION_Complete);
		m_processMsg = "@C_AllocationHdr_ID@: " + alloc.getDocumentNo();
		return alloc.save(get_TrxName());
	}	//	allocateIt


	/**
	 * 	Allocate single AP/AR BOE
	 * 	@return true if allocated
	 */
	private boolean allocateBOE()
	{
		MBOE boe = new MBOE(getCtx(), getC_BOE_ID(), get_TrxName());
		if (boe.getOpenAmt().signum() == 0) {
			log.log(Level.SEVERE, boe.getDocumentNo() + " already completely paid.");
			return false;
		}
		//	calculate actual allocation
		BigDecimal allocationAmt = getPayAmt();			//	underpayment
		if (getOverUnderAmt().signum() < 0 && getPayAmt().signum() > 0)
			allocationAmt = allocationAmt.add(getOverUnderAmt());	//	overpayment (negative)
		MAllocation alloc = new MAllocation();
		
		if (!alloc.addHeader(getAD_Org_ID(), getDateTrx(), getDateAcct(), getC_Currency_ID(), get_TrxName()))
		{
			return false;
		}
//		MAllocationHdr alloc = new MAllocationHdr(getCtx(), false, 
//			getDateTrx(), getC_Currency_ID(),
//			Msg.translate(getCtx(), "C_BOE_ID") + ": " + getDocumentNo() + " [1]", get_TrxName());
//		alloc.setAD_Org_ID(getAD_Org_ID());
//		alloc.saveEx();
		alloc.addLine(this, allocationAmt, boe);
//		MAllocationLine aLine = null;
		
//		if (isReceipt())
//			aLine = new MAllocationLine (alloc, allocationAmt.abs(), 
//				getDiscountAmt().abs(), getWriteOffAmt().abs(), getOverUnderAmt().abs());
//		else
//			aLine = new MAllocationLine (alloc, allocationAmt.abs().negate(), 
//				getDiscountAmt().abs().negate(), getWriteOffAmt().abs().negate(), getOverUnderAmt().abs().negate());
//		aLine.setDocInfo(getC_BPartner_ID(), 0, 0);
//		aLine.setC_BOE_ID(getC_BOE_ID());
//		aLine.setC_Payment_ID(getC_Payment_ID());
//		aLine.setC_Currency_ID(getC_Currency_ID());
//		aLine.saveEx(get_TrxName());
//
//		m_processMsg = "@C_AllocationHdr_ID@: " + alloc.getDocumentNo();
			
		//
		BigDecimal RenewedAmt = this.getRenewedAmt();
		if (RenewedAmt == null)
			RenewedAmt = Env.ZERO;			
		if (RenewedAmt.compareTo(Env.ZERO) != 0)
		{
			// verificamos que los datos para la renovacion esten completos, caso contrario 
			// da un mensaje de error
			String msg = "";
			Timestamp duedate = boe.getR_DueDate();
			Timestamp dateboe = boe.getR_DateBOE();
			String DocumentNo = boe.getR_DocumentNo();
			if  ( duedate == null )
				msg = Msg.translate(Env.getCtx(), "DueDate");
			if (dateboe == null)
				msg += " "+Msg.translate(Env.getCtx(), "DateBOE");
			if ( DocumentNo == null )
				msg += " "+Msg.translate(Env.getCtx(), "DocumentNo");
			if (msg.length() > 0)
			{
				msg += " requieren info ";
				m_processMsg = msg;
				return false;
			}
			MAcctSchema[] schemas = MAcctSchema.getClientAcctSchema(Env.getCtx(), Env.getAD_Client_ID(Env.getCtx()));
			for (MAcctSchema schema:schemas)
			{
				BigDecimal retValue = MConversionRate.getRate (boe.getC_DocType_ID(), getC_Currency_ID(), schema.getC_Currency_ID(), 
						dateboe, dateboe, boe.getC_ConversionType_ID(),
						boe.getAD_Client_ID(), boe.getAD_Org_ID());
				if (retValue == null)
				{
					msg += " requiere tipo de cambio para la fecha de renovacion ";
					m_processMsg = msg;
					return false;					
				}											
			}
			boe.setIsRenewed(true);
			if (boe.save(get_TrxName()))
			{
				MBOE boerenew = new MBOE(getCtx(), 0, get_TrxName());
				boerenew.setC_Currency_ID(getC_Currency_ID());
				boerenew.setC_ConversionType_ID(boe.getC_ConversionType_ID());
				boerenew.setC_BankAccount_ID(boe.getC_BankAccount_ID());
				boerenew.setDateBOE(dateboe);
				boerenew.setIsSOTrx(boe.isSOTrx());
				boerenew.setGrandTotal(RenewedAmt.abs());
				boerenew.setC_DocType_ID(boe.getC_DocType_ID());
				boerenew.setC_DocTypeTarget_ID(boe.getC_DocTypeTarget_ID());
				boerenew.setDocumentNo(DocumentNo);
		        boerenew.setDueDate(duedate);
		        boerenew.setC_BPartner_ID(boe.getC_BPartner_ID());
		        boerenew.setC_BPartner_Location_ID(boe.getC_BPartner_Location_ID());
		        boerenew.setDocStatus(DocAction.STATUS_Portfolio);	        
		        boerenew.setRef_BOE_ID(boe.getC_BOE_ID());
		        boerenew.setStatusDate(dateboe);
		        if (boerenew.save(get_TrxName()))
		        {
					//
		        	if (boerenew.discountIt())
		        	{
		        		boerenew.save(get_TrxName());
		        		MBOEStatement statement = MBOEStatement.get(boerenew.getC_BOE_ID(), boerenew.getDocStatus(), get_TrxName());
		        		if ( statement != null )
		        		{
		        			statement.setStatusDate(boerenew.getStatusDate());
		        			statement.save(get_TrxName());
		        		}		        		
		        	}
		        }
		        //
		        alloc.setIsExchange(true);
				alloc.addLine(boe, RenewedAmt, Env.ZERO, Env.ZERO, Env.ZERO, X_C_BOE.Table_ID, boerenew.getC_BOE_ID());		        
////		        MAllocationLine renew = null;
////				if (boe.isSOTrx())
////					renew = new MAllocationLine (alloc, RenewedAmt.abs(), 
////						Env.ZERO, Env.ZERO, Env.ZERO);
////				else
////					renew = new MAllocationLine (alloc, RenewedAmt.abs().negate(), 
////						Env.ZERO, Env.ZERO, Env.ZERO);
//				renew.setDocInfo(getC_BPartner_ID(), 0, 0);
//				renew.setC_BOE_ID(boe.getC_BOE_ID());   // <-- letra que paga
//				renew.setAD_Table_ID(MBOE.Table_ID);    // <-- indica que es un pago con letra
//				renew.setRecord_ID(boerenew.getC_BOE_ID());  // <-- indica con que letra esta pagando.
//				renew.setC_Currency_ID(getC_Currency_ID());
//				renew.saveEx(get_TrxName());
			}
		}		
		if (!alloc.completeIt())
			return false;
		//	Should start WF
		//alloc.processIt(DocAction.ACTION_Complete);
		//alloc.save(get_TrxName());
		//alloc.saveEx(get_TrxName());
		
		//alloc.completeIt();
		m_processMsg = "@C_AllocationHdr_ID@: " + alloc.getDocumentNo();
		//	Get Project from Invoice
		int C_Project_ID = DB.getSQLValue(get_TrxName(), 
			"SELECT MAX(C_Project_ID) FROM C_BOE WHERE C_BOE_ID=?", getC_BOE_ID());
		if (C_Project_ID > 0 && getC_Project_ID() == 0)
			setC_Project_ID(C_Project_ID);
		else if (C_Project_ID > 0 && getC_Project_ID() > 0 && C_Project_ID != getC_Project_ID())
			log.warning("BOE C_Project_ID=" + C_Project_ID	+ " <> Payment C_Project_ID=" + getC_Project_ID());
		return alloc.save();			
	}	//	allocateBOE
	
	/**
	 * 	Allocate single AP/AR Invoice
	 * 	@return true if allocated
	 */
	private boolean allocateInvoice()
	{
		//	calculate actual allocation
		BigDecimal allocationAmt = getPayAmt();			//	underpayment
		MInvoice invoice = MInvoice.get(Env.getCtx(), getC_Invoice_ID());
		if (getOverUnderAmt().signum() < 0 && getPayAmt().signum() > 0)
			allocationAmt = allocationAmt.add(getOverUnderAmt());	//	overpayment (negative)

		// validando que el pago sea menor a la deuda. caso contrario no procede
		// 28 / 2 / 2011 xapiens
		//
		BigDecimal source = MConversionRate.convert(getCtx(), invoice.getOpenAmt(), 
				invoice.getC_Currency_ID(), getC_Currency_ID(), getDateTrx(), getC_ConversionType_ID() , getAD_Client_ID(), getAD_Org_ID());
		if ( source.compareTo(allocationAmt) < 0 )
		{
			m_processMsg = "Pago excede al monto pendiente ".concat(source.toString()).concat("<").concat(allocationAmt.toString());
			return false;
		}
		
		MAllocation alloc = new MAllocation();
		if (!alloc.addHeader(getAD_Org_ID(), getDateTrx(), getDateAcct(), getC_Currency_ID(), get_TrxName()))
			return false;
		if (!alloc.addline(this, allocationAmt, invoice))
			return false;
		if (!alloc.completeIt())
			return false;
		if (!alloc.save())
			return false;
//		MAllocationHdr alloc = new MAllocationHdr(getCtx(), false, 
//			getDateTrx(), getC_Currency_ID(),
//			Msg.translate(getCtx(), "C_Payment_ID") + ": " + getDocumentNo() + " [1]", get_TrxName());
//		alloc.setAD_Org_ID(getAD_Org_ID());
//		alloc.setDateAcct(getDateAcct());
//		alloc.saveEx();
//		MAllocationLine aLine = null;
//		if (isReceipt())
//			aLine = new MAllocationLine (alloc, allocationAmt, 
//				getDiscountAmt(), getWriteOffAmt(), getOverUnderAmt());
//		else
//			aLine = new MAllocationLine (alloc, allocationAmt.negate(), 
//				getDiscountAmt().negate(), getWriteOffAmt().negate(), getOverUnderAmt().negate());
//		aLine.setDocInfo(getC_BPartner_ID(), 0, getC_Invoice_ID());
//		aLine.setC_Payment_ID(getC_Payment_ID());
//		aLine.setC_Currency_ID(getC_Currency_ID());
//		aLine.saveEx(get_TrxName());
//		//	Should start WF
//		alloc.processIt(DocAction.ACTION_Complete);
//		alloc.saveEx(get_TrxName());
		m_processMsg = "@C_AllocationHdr_ID@: " + alloc.getDocumentNo();			
		//	Get Project from Invoice
//		int C_Project_ID = DB.getSQLValue(get_TrxName(), 
//			"SELECT MAX(C_Project_ID) FROM C_Invoice WHERE C_Invoice_ID=?", getC_Invoice_ID());
//		if (C_Project_ID > 0 && getC_Project_ID() == 0)
//			setC_Project_ID(C_Project_ID);
//		else if (C_Project_ID > 0 && getC_Project_ID() > 0 && C_Project_ID != getC_Project_ID())
//			log.warning("Invoice C_Project_ID=" + C_Project_ID 
//				+ " <> Payment C_Project_ID=" + getC_Project_ID());
		return true;
	}	//	allocateInvoice
	
	/**
	 * 	Allocate Payment Selection
	 * 	@return true if allocated
	 */
	private boolean allocatePaySelection()
	{
		MAllocation alloc = null; 
//		MAllocationHdr alloc = new MAllocationHdr(getCtx(), false, 
//			getDateTrx(), getC_Currency_ID(),
//			Msg.translate(getCtx(), "C_Payment_ID")	+ ": " + getDocumentNo() + " [n]", get_TrxName());
//		alloc.setAD_Org_ID(getAD_Org_ID());

		String sql = "SELECT psc.C_BPartner_ID, psl.C_Invoice_ID, psl.IsSOTrx, "	//	1..3
			+ " psl.PayAmt, psl.DiscountAmt, psl.DifferenceAmt, psl.OpenAmt "
			+ "FROM C_PaySelectionLine psl"
			+ " INNER JOIN C_PaySelectionCheck psc ON (psl.C_PaySelectionCheck_ID=psc.C_PaySelectionCheck_ID) "
			+ "WHERE psc.C_Payment_ID=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			pstmt = DB.prepareStatement(sql, get_TrxName());
			pstmt.setInt(1, getC_Payment_ID());
			rs = pstmt.executeQuery();
			while (rs.next())
			{
				if (alloc == null)
				{
					alloc = new MAllocation();
					if (!alloc.addHeader(this, getDateTrx(), getDateTrx(), getC_Currency_ID(), get_TrxName()))
						return false;		
				}
				int C_BPartner_ID = rs.getInt(1);
				int C_Invoice_ID = rs.getInt(2);
				if (C_BPartner_ID == 0 && C_Invoice_ID == 0)
					continue;
				boolean isSOTrx = "Y".equals(rs.getString(3));
				BigDecimal PayAmt = rs.getBigDecimal(4);
				BigDecimal DiscountAmt = rs.getBigDecimal(5);
				BigDecimal WriteOffAmt = Env.ZERO;
				BigDecimal OpenAmt = rs.getBigDecimal(7);
				BigDecimal OverUnderAmt = OpenAmt.subtract(PayAmt)
					.subtract(DiscountAmt).subtract(WriteOffAmt);
				//
//				if (alloc.get_ID() == 0 && !alloc.save(get_TrxName()))
//				{
//					log.log(Level.SEVERE, "Could not create Allocation Hdr");
//					rs.close();
//					pstmt.close();
//					return false;
//				}
				MInvoice invoice = MInvoice.get(Env.getCtx(), C_Invoice_ID, get_TrxName());
				if (!alloc.addLine(invoice, PayAmt, DiscountAmt, WriteOffAmt, OverUnderAmt))
					return false;
//				MAllocationLine aLine = null;
//				if (isSOTrx)
//					aLine = new MAllocationLine (alloc, PayAmt.abs(), 
//						DiscountAmt.abs(), WriteOffAmt.abs(), OverUnderAmt);
//				else
//					aLine = new MAllocationLine (alloc, PayAmt.abs().negate(), 
//						DiscountAmt.abs().negate(), WriteOffAmt.abs().negate(), OverUnderAmt.abs().negate());
//				aLine.setDocInfo(C_BPartner_ID, 0, C_Invoice_ID);
//				aLine.setC_Payment_ID(getC_Payment_ID());
//				if (!aLine.save(get_TrxName()))
//					log.log(Level.SEVERE, "Could not create Allocation Line");
			}
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, "allocatePaySelection", e);
		}
		finally
		{
			DB.close(rs, pstmt);
			rs = null;
			pstmt = null;
		}
		
		//	Should start WF
		boolean ok = false;
		if (alloc != null)
		{
			if (alloc.completeIt())
				ok = true;
		}
//		if (alloc.get_ID() == 0)
//		{
//			log.fine("No Allocation created - C_Payment_ID=" 
//				+ getC_Payment_ID());
//			ok = false;
//		}
//		else
//		{
//			alloc.processIt(DocAction.ACTION_Complete);
//			ok = alloc.save(get_TrxName());
//			m_processMsg = "@C_AllocationHdr_ID@: " + alloc.getDocumentNo();
//		}
		return ok;
	}	//	allocatePaySelection
	
	/**
	 * 	De-allocate Payment.
	 * 	Unkink Invoices and Orders and delete Allocations
	 */
	private void deAllocate()
	{
		if (getC_Order_ID() != 0)
			setC_Order_ID(0);
	//	if (getC_Invoice_ID() == 0)
	//		return;
		//	De-Allocate all 
		MAllocationHdr[] allocations = MAllocationHdr.getOfPayment(getCtx(), 
			getC_Payment_ID(), get_TrxName());
		log.fine("#" + allocations.length);
		for (int i = 0; i < allocations.length; i++)
		{
			allocations[i].set_TrxName(get_TrxName());
			allocations[i].setDocAction(DocAction.ACTION_Reverse_Correct);
			if (!allocations[i].processIt(DocAction.ACTION_Reverse_Correct))
				throw new XendraException(allocations[i].getProcessMsg());
			allocations[i].saveEx();
		}
		
		// 	Unlink (in case allocation did not get it)
		if (getC_Invoice_ID() != 0)
		{
			//	Invoice					
			String sql = "UPDATE C_Invoice "
				+ "SET C_Payment_ID = NULL, IsPaid='N' "
				+ "WHERE C_Invoice_ID=" + getC_Invoice_ID()
				+ " AND C_Payment_ID=" + getC_Payment_ID();
			int no = DB.executeUpdate(sql, get_TrxName());
			if (no != 0)
				log.fine("Unlink Invoice #" + no);
			//	Order
			sql = "UPDATE C_Order o "
				+ "SET C_Payment_ID = NULL "
				+ "WHERE EXISTS (SELECT * FROM C_Invoice i "
					+ "WHERE o.C_Order_ID=i.C_Order_ID AND i.C_Invoice_ID=" + getC_Invoice_ID() + ")"
				+ " AND C_Payment_ID=" + getC_Payment_ID();
			no = DB.executeUpdate(sql, get_TrxName());
			if (no != 0)
				log.fine("Unlink Order #" + no);
		}
		//
		setC_Invoice_ID(0);
		setIsAllocated(false);
	}	//	deallocate

	/**
	 * 	Void Document.
	 * 	@return true if success 
	 */
	public boolean voidIt()
	{
		log.info(toString());
		// Before Void
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_VOID);
		if (m_processMsg != null)
			return false;
		
		if (REF__DocumentStatus.Closed.equals(getDocStatus())
			|| REF__DocumentStatus.Reversed.equals(getDocStatus())
			|| REF__DocumentStatus.Voided.equals(getDocStatus()))
		{
			m_processMsg = "Document Closed: " + getDocStatus();
			setDocAction(REF__DocumentAction.None);
			return false;
		}
		//	If on Bank Statement, don't void it - reverse it
//		if (getC_BankStatementLine_ID() > 0)
//		{
//			return reverseCorrectIt();
//		}
		
		//	Not Processed
		if (REF__DocumentStatus.Drafted.equals(getDocStatus())
			|| REF__DocumentStatus.Invalid.equals(getDocStatus())
			|| REF__DocumentStatus.InProgress.equals(getDocStatus())
			|| REF__DocumentStatus.Approved.equals(getDocStatus())
			|| REF__DocumentStatus.NotApproved.equals(getDocStatus()) )
		{
			addDescription(Msg.getMsg(getCtx(), "Voided") + " (" + getPayAmt() + ")");
			setPayAmt(Env.ZERO);
			setDiscountAmt(Env.ZERO);
			setWriteOffAmt(Env.ZERO);
			setOverUnderAmt(Env.ZERO);
			setIsAllocated(false);
			//	Unlink & De-Allocate
			deAllocate();
		}
		else
		{
			//return reverseCorrectIt();
			RestoreIt();
			addDescription(Msg.getMsg(getCtx(), "Voided") + " (" + getPayAmt() + ")");
			setPayAmt(Env.ZERO);
			setDiscountAmt(Env.ZERO);
			setWriteOffAmt(Env.ZERO);
			setOverUnderAmt(Env.ZERO);
			setIsAllocated(false);
			setProcessed(true);
			setDocStatus(REF__DocumentStatus.Voided);
		}					
		//
		// After Void
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_VOID);
		if (m_processMsg != null)
			return false;
		
		setProcessed(true);
		setDocAction(REF__DocumentAction.None);
		return true;
	}	//	voidIt
	
	/**
	 * 	Close Document.
	 * 	@return true if success 
	 */
	public boolean closeIt()
	{
		log.info(toString());
		// Before Close
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_CLOSE);
		if (m_processMsg != null)
			return false;
		// After Close
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_CLOSE);
		if (m_processMsg != null)
			return false;		
		setDocAction(REF__DocumentAction.None);
		return true;
	}	//	closeIt
	
	/**
	 * 	Reverse Correction
	 * 	@return true if success 
	 */
	public boolean reverseCorrectIt()
	{
		return false;
	}	//	reverseCorrectionIt

	/**
	 * 	Get Bank Statement Line of payment or 0
	 *	@return id or 0
	 */
	private int getC_BankStatementLine_ID()
	{
		String sql = "SELECT C_BankStatementLine_ID FROM C_BankStatementLine WHERE C_Payment_ID=?";
		int id = DB.getSQLValue(get_TrxName(), sql, getC_Payment_ID());
		if (id < 0)
			return 0;
		return id;
	}	//	getC_BankStatementLine_ID
	
	/**
	 * 	Reverse Accrual - none
	 * 	@return true if success 
	 */
	public boolean reverseAccrualIt()
	{
		log.info(toString());
		
		// Before reverseAccrual
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_REVERSEACCRUAL);
		if (m_processMsg != null)
			return false;
		
		// After reverseAccrual
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_REVERSEACCRUAL);
		if (m_processMsg != null)
			return false;
				
		return false;
	}	//	reverseAccrualIt
	
	/** 
	 * 	Re-activate
	 * 	@return true if success 
	 */
	public boolean reActivateIt()
	{
		log.info(toString());
		// Before reActivate
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_REACTIVATE);
		if (m_processMsg != null)
			return false;	
		
		if (! reverseCorrectIt())
			return false;

		// After reActivate
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_REACTIVATE);
		if (m_processMsg != null)
			return false;				
		
		return true;
	}	//	reActivateIt
	
	/**
	 * 	String Representation
	 *	@return info
	 */
	public String toString ()
	{
		StringBuffer sb = new StringBuffer ("MPayment[");
		sb.append(get_ID()).append("-").append(getDocumentNo())
			.append(",Receipt=").append(isReceipt())
			.append(",PayAmt=").append(getPayAmt())
			.append(",C_Currency_ID=").append(getC_Currency_ID())
			.append(",Discount=").append(getDiscountAmt())
			.append(",WriteOff=").append(getWriteOffAmt())
			.append(",OverUnder=").append(getOverUnderAmt());
		return sb.toString ();
	}	//	toString
	
	/**
	 * 	Get Document Info
	 *	@return document info (untranslated)
	 */
	public String getDocumentInfo()
	{
		MDocType dt = MDocType.get(getCtx(), getC_DocType_ID());
		return dt.getName() + " " + getDocumentNo();
	}	//	getDocumentInfo

	/**
	 * 	Create PDF
	 *	@return File or null
	 */
	public File createPDF ()
	{
		try
		{
			File temp = File.createTempFile(get_TableName()+get_ID()+"_", ".pdf");
			return createPDF (temp);
		}
		catch (Exception e)
		{
			log.severe("Could not create PDF - " + e.getMessage());
		}
		return null;
	}	//	getPDF

	/**
	 * 	Create PDF file
	 *	@param file output file
	 *	@return file if success
	 */
	public File createPDF (File file)
	{
	//	ReportEngine re = ReportEngine.get (getCtx(), ReportEngine.PAYMENT, getC_Payment_ID());
	//	if (re == null)
			return null;
	//	return re.getPDF(file);
	}	//	createPDF

	
	/*************************************************************************
	 * 	Get Summary
	 *	@return Summary of Document
	 */
	public String getSummary()
	{
		StringBuffer sb = new StringBuffer();
		sb.append(getDocumentNo());
		//	: Total Lines = 123.00 (#1)
		sb.append(": ")
			.append(Msg.translate(getCtx(),"PayAmt")).append("=").append(getPayAmt())
			.append(",").append(Msg.translate(getCtx(),"WriteOffAmt")).append("=").append(getWriteOffAmt());
		//	 - Description
		if (getDescription() != null && getDescription().length() > 0)
			sb.append(" - ").append(getDescription());
		return sb.toString();
	}	//	getSummary
	
	/**
	 * 	Get Process Message
	 *	@return clear text error message
	 */
	public String getProcessMsg()
	{
		return m_processMsg;
	}	//	getProcessMsg
	
	/**
	 * 	Get Document Owner (Responsible)
	 *	@return AD_User_ID
	 */
	public int getDoc_User_ID()
	{
		return getCreatedBy();
	}	//	getDoc_User_ID

	/**
	 * 	Get Document Approval Amount
	 *	@return amount payment(AP) or write-off(AR)
	 */
	public BigDecimal getApprovalAmt()
	{
		if (isReceipt())
			return getWriteOffAmt();
		return getPayAmt();
	}	//	getApprovalAmt


	public String placedIt() {
		// TODO Auto-generated method stub
		return null;
	}


	public String returnedIt() {
		// TODO Auto-generated method stub
		return null;
	}
		
	public boolean RestoreIt() {
		Boolean IsOk = false;
		try {
			if (getRenewedAmt().compareTo(Env.ZERO) != 0)
				throw new XendraException ( "Existe letra renovada");

			String whereClause = " C_Payment_ID=?";
			List<MAllocationLine> linesPayment = new Query(getCtx(), MAllocationLine.Table_Name , whereClause, get_TrxName())
			.setParameters(getC_Payment_ID())
			.setOrderBy(" C_AllocationHdr_ID ")
			.list();
			MPaymentLine[] paylines = getLines();
			if (!MPeriod.isOpen(getCtx(), getDateAcct(), REF_C_DocTypeDocBaseType.APPayment, getAD_Org_ID()) && 
					!MPeriod.isOpen(getCtx(), getDateAcct(), REF_C_DocTypeDocBaseType.ARReceipt, getAD_Org_ID()) && 
					(linesPayment != null || paylines != null) 
					)
				throw new XendraException ( "@PeriodClosed@");

			int C_AllocationHdr_ID = 0;
			//Boolean deleteAlloc = false;
			MAllocationHdr alloc = null;
			for (MAllocationLine allocline:linesPayment)
			{
				if (C_AllocationHdr_ID == 0)
				{
					C_AllocationHdr_ID = allocline.getC_AllocationHdr_ID();
					alloc = new MAllocationHdr(Env.getCtx(), C_AllocationHdr_ID , get_TrxName());
				}
				if (C_AllocationHdr_ID != allocline.getC_AllocationHdr_ID())
				{
					MAcctSchema[] ass = MAcctSchema.getClientAcctSchema(Env.getCtx(), getAD_Client_ID());
					Doc doc = Doc.get (ass, MAllocationHdr.Table_ID, alloc.getC_AllocationHdr_ID(), get_TrxName());
					if (doc != null)
						doc.deleteAcct();				
					if (!alloc.delete(true, get_TrxName()))
						throw new XendraException(CLogger.retrieveErrorString(null));
					//deleteAlloc = false;
					C_AllocationHdr_ID = allocline.getC_AllocationHdr_ID();
					alloc = new MAllocationHdr(Env.getCtx(), C_AllocationHdr_ID , get_TrxName());
				}				
				if (alloc != null && alloc.get_ID() == 0)
					throw new XendraException(" no se encontro info en el allocation "+allocline.getC_AllocationHdr_ID());					
				MBPartner bp = new MBPartner (getCtx(), allocline.getC_BPartner_ID(), get_TrxName());
				//	Update total revenue and balance / credit limit (reversed on AllocationLine.processIt)			
				BigDecimal invAmt = MConversionRate.convertBase(getCtx(), getC_DocType_ID(), allocline.getAmount(),	//	CM adjusted 
						allocline.getC_Currency_ID(), alloc.getDateAcct(), 0, alloc.getAD_Client_ID(), alloc.getAD_Org_ID());
				if (invAmt != null)
				{
					BigDecimal newBalance = bp.getTotalOpenBalance(false);
					if (newBalance == null)
						newBalance = Env.ZERO;				
					newBalance = newBalance.add(invAmt);
					//
					BigDecimal newLifeAmt = bp.getActualLifeTimeValue();
					if (newLifeAmt == null)
						newLifeAmt = invAmt;
					else
						newLifeAmt = newLifeAmt.add(invAmt);
					BigDecimal newCreditAmt = bp.getSO_CreditUsed();
					if (newCreditAmt == null)
						newCreditAmt = invAmt;
					else
						newCreditAmt = newCreditAmt.add(invAmt);
					//
					log.fine("GrandTotal=" + allocline.getAmount() + "(" + invAmt 
							+ ") BP Life=" + bp.getActualLifeTimeValue() + "->" + newLifeAmt
							+ ", Credit=" + bp.getSO_CreditUsed() + "->" + newCreditAmt
							+ ", Balance=" + bp.getTotalOpenBalance(false) + " -> " + newBalance);
					bp.setActualLifeTimeValue(newLifeAmt);
					bp.setSO_CreditUsed(newCreditAmt);				
					bp.setTotalOpenBalance(newBalance);
					bp.setSOCreditStatus();
					bp.save(get_TrxName());
				}			

				if (allocline.getC_Invoice_ID() != 0)
				{
					MInvoice invoice = new MInvoice(Env.getCtx(), allocline.getC_Invoice_ID(), get_TrxName());						
					invoice.setIsPaid(false);
					invoice.save();
				}
				else if (allocline.getC_BOE_ID() != 0)
				{
					MBOE boe = new MBOE(Env.getCtx(), allocline.getC_BOE_ID(), get_TrxName());
					boe.setIsPaid(false);
					boe.save();
				}
			}
			if (alloc != null && C_AllocationHdr_ID == alloc.getC_AllocationHdr_ID())
			{
				MAcctSchema[] ass = MAcctSchema.getClientAcctSchema(Env.getCtx(), getAD_Client_ID());
				Doc doc = Doc.get (ass, MAllocationHdr.Table_ID, alloc.getC_AllocationHdr_ID(), get_TrxName());
				if (doc != null)
					doc.deleteAcct();				
				if (!alloc.delete(true, get_TrxName()))
					throw new XendraException(CLogger.retrieveErrorString(null));
			}							
			// 			
			for (MPaymentLine pl:paylines)
			{
				pl.setProcessed(false);
				pl.setProcessing(false);
				if (!pl.save())
				{
					throw new XendraException(CLogger.retrieveErrorString(null));
				}
			}	
			IsOk = true;
		}
		catch (Exception e)
		{
			m_processMsg = e.getMessage();
			IsOk = false;
		}

		if (IsOk)
		{
			Doc doc = null;
			MAcctSchema[] ass = MAcctSchema.getClientAcctSchema(Env.getCtx(), getAD_Client_ID());
			doc = Doc.get (ass, MPayment.Table_ID, get_ID(), get_TrxName());
			if (doc != null)
				doc.deleteAcct();

			setDocStatus(REF__DocumentStatus.Drafted);
			setDocAction(REF__DocumentAction.Complete);
			setProcessing(false);
			setIsAllocated(false);
			setProcessed(false);
			setPosted(false);
			setIsApproved(false);
		}
		return IsOk;
	}
	/**
	 * 	Get Payment Lines of Payment
	 * 	@param whereClause starting with AND
	 * 	@return lines
	 */
	private MPaymentLine[] getLines (String whereClause)
	{
		ArrayList<MPaymentLine> list = new ArrayList<MPaymentLine>();
		String sql = "SELECT * FROM C_PaymentLine WHERE C_Payment_ID=? ";
		if (whereClause != null)
			sql += whereClause;
		sql += " ORDER BY Line";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement(sql, get_TrxName());
			pstmt.setInt(1, getC_Payment_ID());
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				MPaymentLine il = new MPaymentLine(getCtx(), rs, get_TrxName());
				il.setPayment(this);
				list.add(il);
			}
			rs.close();
			pstmt.close();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, "getLines", e);
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

		//
		MPaymentLine[] lines = new MPaymentLine[list.size()];
		list.toArray(lines);
		return lines;
	}	//	getLines

	/**
	 * 	Get Payment Lines
	 * 	@param requery
	 * 	@return lines
	 */
	public MPaymentLine[] getLines (boolean requery)
	{
		if (m_lines == null || m_lines.length == 0 || requery)
			m_lines = getLines(null);
		return m_lines;
	}	//	getLines

	/**
	 * 	Get Lines of Invoice
	 * 	@return lines
	 */
	public MPaymentLine[] getLines()
	{
		return getLines(false);
	}	//	getLines


	public String getRefDocumentNo() {
		String DocumentNo = getDocumentNo();
		if (getC_Invoice_ID() != 0)
		{
				MInvoice InvoicerefInPayment = MInvoice.get(Env.getCtx(), getC_Invoice_ID());
				if (InvoicerefInPayment.get_ID() > 0)
					DocumentNo = InvoicerefInPayment.getDocumentNo();
		}
		else if (getC_BOE_ID() != 0)
		{
				MBOE BOErefInPayment = MBOE.get(Env.getCtx(), getC_BOE_ID());
				if (BOErefInPayment.get_ID() > 0)
					DocumentNo = BOErefInPayment.getDocumentNo();
		}
		return DocumentNo;
	}
	public Integer geReftC_DocType_ID() {

		Integer C_DocType_ID = getC_DocType_ID();
		if (getC_Invoice_ID() != 0)
		{
				MInvoice InvoicerefInPayment = MInvoice.get(Env.getCtx(), getC_Invoice_ID());
				if (InvoicerefInPayment.get_ID() > 0)
				 	C_DocType_ID = InvoicerefInPayment.getC_DocType_ID();
		}
		else if (getC_BOE_ID() != 0)
		{
				MBOE BOErefInPayment = MBOE.get(Env.getCtx(), getC_BOE_ID());
				if (BOErefInPayment.get_ID() > 0)
					C_DocType_ID = BOErefInPayment.getC_DocType_ID();
		}
		return C_DocType_ID;
	}

	protected boolean beforeDelete()
	{
		if (getDocStatus().equals(DocAction.STATUS_Completed))
			return false;
		
		try {
			MPaymentLine[] lines = getLines();
			for (MPaymentLine line:lines)
			{
				if (!line.delete(true))
					throw new XendraException("no se pudo eliminar linea " + line);
			}
			MPaySelectionCheck pscheck = MPaySelectionCheck.getOfPayment(Env.getCtx(), getC_Payment_ID(), null); 
			if (pscheck!= null && !pscheck.delete(true))
				throw new XendraException("no se pudo eliminar el payselectionCheck");		
		}
		catch (Exception e)
		{
			return false;
		}
		return true;
	}	//	beforeDelete

	public void setProcessed (boolean processed)
	{
		super.setProcessed (processed);
		if (get_ID() == 0)
			return;
		String sql = "UPDATE C_PaymentLine SET Processed='"
			+ (processed ? "Y" : "N")
			+ "' WHERE C_Payment_ID=" + getC_Payment_ID();
		int noLine = DB.executeUpdate(sql, get_TrxName());
		m_lines = null;
		log.fine("Processed=" + processed + " - Lines=" + noLine);
	}	//	setProcessed

	public void setProcessMsg(String msg)
	{
		m_processMsg = msg;
	}	
}   //  MPayment
