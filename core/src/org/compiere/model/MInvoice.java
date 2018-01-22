/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
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

import java.io.*;
import java.math.*;
import java.sql.*;
import java.util.*;
import java.util.logging.*;

import org.compiere.model.persistence.X_C_ConversionType;
import org.compiere.model.persistence.X_C_Invoice;
import org.compiere.model.persistence.X_C_InvoiceStatus;
import org.compiere.model.persistence.X_C_PaymentTerm;
import org.compiere.model.persistence.X_C_Withholding;
import org.compiere.model.reference.REF_WriteOffType;
import org.compiere.model.reference.REF_WithholdingType;
import org.compiere.model.reference.REF__DocumentAction;
import org.compiere.model.reference.REF_C_DocTypeDocBaseType;
import org.compiere.model.reference.REF__DocumentStatus;
import org.compiere.model.reference.REF__PaymentRule;
import org.compiere.print.*;
import org.compiere.process.*;
import org.compiere.util.*;
import org.kie.api.KieBase;
import org.kie.api.event.rule.DebugAgendaEventListener;
import org.kie.api.event.rule.DebugRuleRuntimeEventListener;
import org.kie.api.runtime.KieSession;


/**
 *	Invoice Model.
 * 	Please do not set DocStatus and C_DocType_ID directly. 
 * 	They are set in the process() method. 
 * 	Use DocAction and C_DocTypeTarget_ID instead.
 *
 *  @author Jorg Janke
 *  @version $Id: MInvoice.java 5822 2016-06-15 22:56:06Z xapiens $
 */
public class MInvoice extends X_C_Invoice implements DocAction
{
	/**	Open Amount				*/
	private BigDecimal 		m_openAmt = null;
	/**	Invoice Lines			*/
	private MInvoiceLine[]	m_lines;
	/**	Invoice Taxes			*/
	private MInvoiceTax[]	m_taxes;
	/**	Logger			*/
	private static CLogger s_log = CLogger.getCLogger(MInvoice.class);
	/**	Cache						*/
	private static CCache<Integer,MInvoice>	s_cache	= new CCache<Integer,MInvoice>("C_Invoice", 20, 2);	//	2 minutes
	private String rulestatus;	
	private KieSession ksession;

	/** Reversal Flag		*/
	private boolean m_reversal = false;
	/**	Process Message 			*/
	private String		m_processMsg = null;
	/**	Just Prepared Flag			*/
	private boolean		m_justPrepared = false;	
	/**
	 * 	Get Payments Of BPartner
	 *	@param ctx context
	 *	@param C_BPartner_ID id
	 *	@param trxName transaction
	 *	@return array
	 */
	public static MInvoice[] getOfBPartner (Properties ctx, int C_BPartner_ID, String trxName)
	{
		ArrayList<MInvoice> list = new ArrayList<MInvoice>();
		String sql = "SELECT * FROM C_Invoice WHERE C_BPartner_ID=?";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement(sql, trxName);
			pstmt.setInt(1, C_BPartner_ID);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
				list.add(new MInvoice(ctx,rs, trxName));
			rs.close();
			pstmt.close();
			pstmt = null;
		}
		catch (Exception e)
		{
			s_log.log(Level.SEVERE, sql, e);
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

		//
		MInvoice[] retValue = new MInvoice[list.size()];
		list.toArray(retValue);
		return retValue;
	}	//	getOfBPartner

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
	public static MInvoice copyFrom (MInvoice from, Timestamp dateDoc, 
		int C_DocTypeTarget_ID, boolean isSOTrx, boolean counter, 
		String trxName, boolean setOrder)
	{
		MInvoice to = new MInvoice (from.getCtx(), 0, null);
		to.set_TrxName(trxName);
		PO.copyValues (from, to, from.getAD_Client_ID(), from.getAD_Org_ID());
		to.set_ValueNoCheck ("C_Invoice_ID", I_ZERO);
		to.set_ValueNoCheck ("DocumentNo", null);
		//
		to.setDocStatus (REF__DocumentStatus.Drafted);		//	Draft
		to.setDocAction(REF__DocumentAction.Complete);
		//
		to.setC_DocType_ID(0);
		to.setC_DocTypeTarget_ID (C_DocTypeTarget_ID);
		to.setIsSOTrx(isSOTrx);
		//
		to.setDateInvoiced (dateDoc);
		to.setDateAcct (dateDoc);
		to.setDatePrinted(null);
		to.setIsPrinted (false);
		//
		to.setIsApproved (false);
		to.setC_Payment_ID(0);
		to.setC_CashLine_ID(0);
		to.setIsPaid (false);
		to.setIsInDispute(false);
		//
		//	Amounts are updated by trigger when adding lines
		to.setGrandTotal(Env.ZERO);
		to.setTotalLines(Env.ZERO);
		//
		to.setFact_ID("");
		to.setIsTransferred (false);
		to.setPosted (false);
		to.setProcessed (false);
		//[ 1633721 ] Reverse Documents- Processing=Y
		to.setProcessing(false);
		//	delete references
		to.setIsSelfService(false);
		if (!setOrder)
			to.setC_Order_ID(0);
		if (counter)
		{
			to.setRef_Invoice_ID(from.getC_Invoice_ID());
			//	Try to find Order link
			if (from.getC_Order_ID() != 0)
			{
				MOrder peer = new MOrder (from.getCtx(), from.getC_Order_ID(), from.get_TrxName());
				if (peer.getRef_Order_ID() != 0)
					to.setC_Order_ID(peer.getRef_Order_ID());
			}
		}
		else
			to.setRef_Invoice_ID(0);

		if (!to.save(trxName))
			throw new IllegalStateException("Could not create Invoice");
		if (counter)
			from.setRef_Invoice_ID(to.getC_Invoice_ID());

		//	Lines
		if (to.copyLinesFrom(from, counter, setOrder) == 0)
			throw new IllegalStateException("Could not create Invoice Lines");

		return to;
	}	//	copyFrom

	/**
	 * 	Get PDF File Name
	 *	@param documentDir directory
	 * 	@param C_Invoice_ID invoice
	 *	@return file name
	 */
	public static String getPDFFileName (String documentDir, int C_Invoice_ID)
	{
		StringBuffer sb = new StringBuffer (documentDir);
		if (sb.length() == 0)
			sb.append(".");
		if (!sb.toString().endsWith(File.separator))
			sb.append(File.separator);
		sb.append("C_Invoice_ID_")
			.append(C_Invoice_ID)
			.append(".pdf");
		return sb.toString();
	}	//	getPDFFileName
	
	
	/**
	 * 	Get MInvoice from Cache
	 *	@param ctx context
	 *	@param C_Invoice_ID id
	 *	@return MInvoice
	 */
	public static MInvoice get (Properties ctx, int C_Invoice_ID)
	{
		Integer key = new Integer (C_Invoice_ID);
		MInvoice retValue = (MInvoice) s_cache.get (key);
		if (retValue != null)
			return retValue;
		retValue = new MInvoice (ctx, C_Invoice_ID, null);
		if (retValue.get_ID () != 0)
			s_cache.put (key, retValue);
		return retValue;
	} //	get

	/**
	 * 	Get MInvoice from Cache
	 *	@param ctx context
	 *	@param C_Invoice_ID id
	 *	@return MInvoice
	 */
	public static MInvoice get (Properties ctx, int C_Invoice_ID, String trxName)
	{
		if (trxName == null) return get(ctx, C_Invoice_ID);
		MInvoice retValue = new MInvoice (ctx, C_Invoice_ID, trxName);
		return retValue;
	} //	get


	
	
	/**************************************************************************
	 * 	Invoice Constructor
	 * 	@param ctx context
	 * 	@param C_Invoice_ID invoice or 0 for new
	 * 	@param trxName trx name
	 */
	public MInvoice (Properties ctx, int C_Invoice_ID, String trxName)
	{
		super (ctx, C_Invoice_ID, trxName);
		if (C_Invoice_ID == 0)
		{
			setDocStatus (REF__DocumentStatus.Drafted);		//	Draft
			setDocAction (REF__DocumentAction.Complete);
			//
			setPaymentRule(REF__PaymentRule.OnCredit);	//	Payment Terms

			setDateInvoiced (new Timestamp (System.currentTimeMillis ()));
			setDateAcct (new Timestamp (System.currentTimeMillis ()));
			//
			setChargeAmt (Env.ZERO);
			setTotalLines (Env.ZERO);
			setGrandTotal (Env.ZERO);
			//
			setIsSOTrx (true);
			setIsTaxIncluded (false);
			setIsApproved (false);
			setIsDiscountPrinted (false);
			setIsPaid (false);
			setSendEMail (false);
			setIsPrinted (false);
			setIsTransferred (false);
			setIsSelfService(false);
			setIsPayScheduleValid(false);
			setIsInDispute(false);
			setPosted(false);
			super.setProcessed (false);
			setProcessing(false);
		}
	}	//	MInvoice

	/**
	 *  Load Constructor
	 *  @param ctx context
	 *  @param rs result set record
	 *	@param trxName transaction
	 */
	public MInvoice (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MInvoice

	public int testx(int orderid)
	{
		int x = DB.getSQLValue(null, "SELECT C_Invoice_ID FROM C_Invoice WHERE C_Order_ID=?",orderid);
		return x;
	}
	/**
	 * 	Create Invoice from Order
	 *	@param order order
	 *	@param C_DocTypeTarget_ID target document type
	 *	@param invoiceDate date or null
	 */
	public MInvoice (MOrder order, int C_DocTypeTarget_ID, Timestamp invoiceDate)
	{		
		this (order.getCtx(), 0 , order.get_TrxName());
		setClientOrg(order);
		setOrder(order);	//	set base settings
		//
		if (C_DocTypeTarget_ID == 0)
			C_DocTypeTarget_ID =  DB.getSQLValue(null,
				"SELECT C_DocTypeInvoice_ID FROM C_DocType WHERE C_DocType_ID=?", 
				order.getC_DocType_ID());

		if (getSerial().length() == 0)
		{
			String Serial = DB.getSQLValueString(null, "SELECT s.Serial FROM C_DocType t, AD_Sequence s WHERE t.C_DocType_ID=? AND s.AD_Sequence_ID=t.DocNoSequence_ID", C_DocTypeTarget_ID);
			if ( Serial != null )
				setSerial(Serial);
		}
		
		setC_DocTypeTarget_ID(C_DocTypeTarget_ID);
			
		String DocumentNo = order.getDocumentNoToInvoice();
		if (DocumentNo != null)
		{
			setDocumentNo(DocumentNo);
		}	
		
		if (invoiceDate != null)
			setDateInvoiced(invoiceDate);
		setDateAcct(getDateInvoiced());
		setDescription(order.getDescription());
		//
		setSalesRep_ID(order.getSalesRep_ID());
		//
		setC_BPartner_ID(order.getBill_BPartner_ID());
		setC_BPartner_Location_ID(order.getBill_Location_ID());
		setC_Contact_ID(order.getC_Contact_ID());
		setAD_User_ID(order.getBill_User_ID());
	}	//	MInvoice

	/**
	 * 	Create Invoice from Shipment
	 *	@param ship shipment
	 *	@param invoiceDate date or null
	 */
	public MInvoice (MInOut ship, Timestamp invoiceDate)
	{
		this (ship.getCtx(), 0, ship.get_TrxName());
		setClientOrg(ship);
		setShipment(ship);	//	set base settings
		//
		setC_DocTypeTarget_ID();
		if (invoiceDate != null)
			setDateInvoiced(invoiceDate);
		setDateAcct(getDateInvoiced());
		//
		setSalesRep_ID(ship.getSalesRep_ID());
		setAD_User_ID(ship.getAD_User_ID());
	}	//	MInvoice
	
	/**
	 * 	Create Invoice from Batch Line
	 *	@param batch batch
	 *	@param line batch line
	 */
	public MInvoice (MInvoiceBatch batch, MInvoiceBatchLine line)
	{
		this (line.getCtx(), 0, line.get_TrxName());
		setClientOrg(line);
		setDocumentNo(line.getDocumentNo());
		//
		setIsSOTrx(batch.isSOTrx());
		MBPartner bp = new MBPartner (line.getCtx(), line.getC_BPartner_ID(), line.get_TrxName());
		setBPartner(bp);	//	defaults
		//
		setIsTaxIncluded(line.isTaxIncluded());
		//	May conflict with default price list
		setC_Currency_ID(batch.getC_Currency_ID());
		setC_ConversionType_ID(batch.getC_ConversionType_ID());
		//
	//	setPaymentRule(order.getPaymentRule());
	//	setC_PaymentTerm_ID(order.getC_PaymentTerm_ID());
	//	setPOReference("");
		setDescription(batch.getDescription());
	//	setDateOrdered(order.getDateOrdered());
		//
		setAD_OrgTrx_ID(line.getAD_OrgTrx_ID());
		setC_Project_ID(line.getC_Project_ID());
	//	setC_Campaign_ID(line.getC_Campaign_ID());
		setC_Activity_ID(line.getC_Activity_ID());
		setUser1_ID(line.getUser1_ID());
		setUser2_ID(line.getUser2_ID());
		//
		setC_DocTypeTarget_ID(line.getC_DocType_ID());
		setDateInvoiced(line.getDateInvoiced());
		setDateAcct(line.getDateAcct());
		//
		setSalesRep_ID(batch.getSalesRep_ID());
		//
		setC_BPartner_ID(line.getC_BPartner_ID());
		setC_BPartner_Location_ID(line.getC_BPartner_Location_ID());
		setAD_User_ID(line.getAD_User_ID());
	}	//	MInvoice


	public String getSerial()
	{
		if (super.getSerial() != null)
			return super.getSerial();
		else
			return "";
	}
	
	public String getSerialWithLine()
	{
		if (super.getSerial() != null)
			return super.getSerial().concat("-");
		else
			return "";
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

	/**
	 * 	Set Business Partner Defaults & Details
	 * 	@param bp business partner
	 */
	public void setBPartner (MBPartner bp)
	{
		if (bp == null)
			return;

		setC_BPartner_ID(bp.getC_BPartner_ID());
		//	Set Defaults
		int ii = 0;
		if (isSOTrx())
			ii = bp.getC_PaymentTerm_ID();
		else
			ii = bp.getPO_PaymentTerm_ID();
		if (ii != 0)
			setC_PaymentTerm_ID(ii);
		//
		if (isSOTrx())
			ii = bp.getM_PriceList_ID();
		else
			ii = bp.getPO_PriceList_ID();
		if (ii != 0)
			setM_PriceList_ID(ii);
		//
		String ss = bp.getPaymentRule();
		if (ss != null)
			setPaymentRule(ss);


		//	Set Locations
		MBPartnerLocation[] locs = bp.getLocations(false);
		if (locs != null)
		{
			for (int i = 0; i < locs.length; i++)
			{
				if ((locs[i].isBillTo() && isSOTrx()) 
				|| (locs[i].isPayFrom() && !isSOTrx()))
					setC_BPartner_Location_ID(locs[i].getC_BPartner_Location_ID());
			}
			//	set to first
			if (getC_BPartner_Location_ID() == 0 && locs.length > 0)
				setC_BPartner_Location_ID(locs[0].getC_BPartner_Location_ID());
		}
		if (getC_BPartner_Location_ID() == 0)
			log.log(Level.SEVERE, "Has no To Address: " + bp);

		//	Set Contact
		MUser[] contacts = bp.getContacts(false);
		if (contacts != null && contacts.length > 0)	//	get first User
			setAD_User_ID(contacts[0].getAD_User_ID());
	}	//	setBPartner

	/**
	 * 	Set Order References
	 * 	@param order order
	 */
	public void setOrder (MOrder order)
	{
		if (order == null)
			return;

		setC_Order_ID(order.getC_Order_ID());
		setIsSOTrx(order.isSOTrx());
		setIsDiscountPrinted(order.isDiscountPrinted());
		setIsSelfService(order.isSelfService());
		setSendEMail(order.isSendEMail());
		//
		setM_PriceList_ID(order.getM_PriceList_ID());
		setIsTaxIncluded(order.isTaxIncluded());
		setC_Currency_ID(order.getC_Currency_ID());
		setC_ConversionType_ID(order.getC_ConversionType_ID());
		//
		setPaymentRule(order.getPaymentRule());
		setC_PaymentTerm_ID(order.getC_PaymentTerm_ID());
		setPOReference(order.getPOReference());
		setDescription(order.getDescription());
		setDateOrdered(order.getDateOrdered());
		//
		setAD_OrgTrx_ID(order.getAD_OrgTrx_ID());
		setC_Project_ID(order.getC_Project_ID());
		setC_Campaign_ID(order.getC_Campaign_ID());
		setC_Activity_ID(order.getC_Activity_ID());
		
		setDifferenceAmt(order.getDifferenceAmt());
		setDebtAmt(order.getDebtAmt());
		setPrinterSerial(order.getPrinterSerial());
		setMachineSerial(order.getMachineSerial());		
		setUser1_ID(order.getUser1_ID());
		setUser2_ID(order.getUser2_ID());
		setIdentifier(order.getIdentifier());
		setWriteOffType(order.getWriteOffType());		
		setC_POS_ID(order.getC_POS_ID());
		setPrinterSerial(order.getPrinterSerial());
		setMachineSerial(order.getMachineSerial());
		if (order.getDocumentNoToInvoice().length() > 0)
			setDocumentNo(order.getDocumentNoToInvoice());
		if (order.getSerialToInvoice().length() > 0)
			setSerial(order.getSerialToInvoice());
	}	//	setOrder

	/**
	 * 	Set Shipment References
	 * 	@param ship shipment
	 */
	public void setShipment (MInOut ship)
	{
		if (ship == null)
			return;

		setIsSOTrx(ship.isSOTrx());
		//
		MBPartner bp = new MBPartner (getCtx(), ship.getC_BPartner_ID(), null);
		setBPartner (bp);
		//
		setSendEMail(ship.isSendEMail());
		//
		setPOReference(ship.getPOReference());
		setDescription(ship.getDescription());
		setDateOrdered(ship.getDateOrdered());
		//
		setAD_OrgTrx_ID(ship.getAD_OrgTrx_ID());
		setC_Project_ID(ship.getC_Project_ID());
		setC_Campaign_ID(ship.getC_Campaign_ID());
		setC_Activity_ID(ship.getC_Activity_ID());
		setUser1_ID(ship.getUser1_ID());
		setUser2_ID(ship.getUser2_ID());
		//
		if (ship.getC_Order_ID() != 0)
		{
			setC_Order_ID(ship.getC_Order_ID());
			MOrder order = new MOrder (getCtx(), ship.getC_Order_ID(), get_TrxName());
			setIsDiscountPrinted(order.isDiscountPrinted());
			setM_PriceList_ID(order.getM_PriceList_ID());
			setIsTaxIncluded(order.isTaxIncluded());
			setC_Currency_ID(order.getC_Currency_ID());
			setC_ConversionType_ID(order.getC_ConversionType_ID());
			setPaymentRule(order.getPaymentRule());
			setC_PaymentTerm_ID(order.getC_PaymentTerm_ID());
			//
			MDocType dt = MDocType.get(getCtx(), order.getC_DocType_ID());
			if (dt.getC_DocTypeInvoice_ID() != 0)
				setC_DocTypeTarget_ID(dt.getC_DocTypeInvoice_ID());
			//	Overwrite Invoice Address
			setC_BPartner_Location_ID(order.getBill_Location_ID());
		}
	}	//	setShipment

	/**
	 * 	Set Target Document Type
	 * 	@param DocBaseType doc type REF_C_DocTypeDocBaseType.
	 */
	public void setC_DocTypeTarget_ID (String DocBaseType)
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
			log.fine(DocBaseType);
			setC_DocTypeTarget_ID (C_DocType_ID);
			boolean isSOTrx = REF_C_DocTypeDocBaseType.ARInvoice.equals(DocBaseType)
				|| REF_C_DocTypeDocBaseType.ARCreditMemo.equals(DocBaseType);
			setIsSOTrx (isSOTrx);
		}
	}	//	setC_DocTypeTarget_ID

	/**
	 * 	Set Target Document Type.
	 * 	Based on SO flag AP/AP Invoice
	 */
	public void setC_DocTypeTarget_ID ()
	{
		if (getC_DocTypeTarget_ID() > 0)
			return;
		if (isSOTrx())
			setC_DocTypeTarget_ID(REF_C_DocTypeDocBaseType.ARInvoice);
		else
			setC_DocTypeTarget_ID(REF_C_DocTypeDocBaseType.APInvoice);
	}	//	setC_DocTypeTarget_ID

	
	/**
	 * 	Get Grand Total
	 * 	@param creditMemoAdjusted adjusted for CM (negative)
	 *	@return grand total
	 */
	public BigDecimal getGrandTotal (boolean creditMemoAdjusted)
	{
		if (!creditMemoAdjusted)
			return super.getGrandTotal();
		//
		BigDecimal amt = getGrandTotal();
		if (isCreditMemo())
			return amt.negate();
		return amt;
	}	//	getGrandTotal
	
	
	/**
	 * 	Get Invoice Lines of Invoice
	 * 	@param whereClause starting with AND
	 * 	@return lines
	 */
	private MInvoiceLine[] getLines (String whereClause)
	{
		ArrayList<MInvoiceLine> list = new ArrayList<MInvoiceLine>();
		String sql = "SELECT * FROM C_InvoiceLine WHERE C_Invoice_ID=? ";
		if (whereClause != null)
			sql += whereClause;
		sql += " ORDER BY Line";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement(sql, get_TrxName());
			pstmt.setInt(1, getC_Invoice_ID());
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				MInvoiceLine il = new MInvoiceLine(getCtx(), rs, get_TrxName());
				il.setInvoice(this);
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
		MInvoiceLine[] lines = new MInvoiceLine[list.size()];
		list.toArray(lines);
		return lines;
	}	//	getLines

	/**
	 * 	Get Invoice Lines
	 * 	@param requery
	 * 	@return lines
	 */
	public MInvoiceLine[] getLines (boolean requery)
	{
		if (m_lines == null || m_lines.length == 0 || requery)
			m_lines = getLines(null);
		return m_lines;
	}	//	getLines

	/**
	 * 	Get Lines of Invoice
	 * 	@return lines
	 */
	public MInvoiceLine[] getLines()
	{
		return getLines(false);
	}	//	getLines
	
	
	/**
	 * 	Renumber Lines
	 *	@param step start and step
	 */
	public void renumberLines (int step)
	{
		int number = step;
		MInvoiceLine[] lines = getLines(false);
		for (int i = 0; i < lines.length; i++)
		{
			MInvoiceLine line = lines[i];
			line.setLine(number);
			line.save();
			number += step;
		}
		m_lines = null;
	}	//	renumberLines
	
	/**
	 * 	Copy Lines From other Invoice.
	 *	@param otherInvoice invoice
	 * 	@param counter create counter links
	 * 	@param setOrder set order links
	 *	@return number of lines copied
	 */
	public int copyLinesFrom (MInvoice otherInvoice, boolean counter, boolean setOrder)
	{
		if (isProcessed() || isPosted() || otherInvoice == null)
			return 0;
		MInvoiceLine[] fromLines = otherInvoice.getLines(false);
		int count = 0;
		for (int i = 0; i < fromLines.length; i++)
		{
			MInvoiceLine line = new MInvoiceLine (getCtx(), 0, get_TrxName());
			MInvoiceLine fromLine = fromLines[i];
			if (counter)	//	header
				PO.copyValues (fromLine, line, getAD_Client_ID(), getAD_Org_ID());
			else
				PO.copyValues (fromLine, line, fromLine.getAD_Client_ID(), fromLine.getAD_Org_ID());
			line.setC_Invoice_ID(getC_Invoice_ID());
			line.setInvoice(this);
			line.set_ValueNoCheck ("C_InvoiceLine_ID", I_ZERO);	// new
			//	Reset
			if (!setOrder)
				line.setC_OrderLine_ID(0);
			line.setRef_InvoiceLine_ID(0);
			line.setM_InOutLine_ID(0);
			line.setA_Asset_ID(0);
			line.setM_AttributeSetInstance_ID(0);
			line.setS_ResourceAssignment_ID(0);
			//	New Tax
			if (getC_BPartner_ID() != otherInvoice.getC_BPartner_ID())
				line.setTax();	//	recalculate
			//
			if (counter)
			{
				line.setRef_InvoiceLine_ID(fromLine.getC_InvoiceLine_ID());
				if (fromLine.getC_OrderLine_ID() != 0)
				{
					MOrderLine peer = new MOrderLine (getCtx(), fromLine.getC_OrderLine_ID(), get_TrxName());
					if (peer.getRef_OrderLine_ID() != 0)
						line.setC_OrderLine_ID(peer.getRef_OrderLine_ID());
				}
				line.setM_InOutLine_ID(0);
				if (fromLine.getM_InOutLine_ID() != 0)
				{
					MInOutLine peer = new MInOutLine (getCtx(), fromLine.getM_InOutLine_ID(), get_TrxName());
					if (peer.getRef_InOutLine_ID() != 0)
						line.setM_InOutLine_ID(peer.getRef_InOutLine_ID());
				}
			}
			//
			line.setProcessed(false);
			if (line.save(get_TrxName()))
				count++;
			//	Cross Link
			if (counter)
			{
				fromLine.setRef_InvoiceLine_ID(line.getC_InvoiceLine_ID());
				fromLine.save(get_TrxName());
			}
			
			// MZ Goodwill
			// copy the landed cost
			line.copyLandedCostFrom(fromLine);
			line.allocateLandedCosts();
			// end MZ
		}
		if (fromLines.length != count)
			log.log(Level.SEVERE, "Line difference - From=" + fromLines.length + " <> Saved=" + count);
		return count;
	}	//	copyLinesFrom
	
	/**
	 * 	Set Reversal
	 *	@param reversal reversal
	 */
	private void setReversal(boolean reversal)
	{
		m_reversal = reversal;
	}	//	setReversal
	/**
	 * 	Is Reversal
	 *	@return reversal
	 */
	public boolean isReversal()
	{
		return m_reversal;
	}	//	isReversal
	
	/**
	 * 	Get Taxes
	 *	@param requery requery
	 *	@return array of taxes
	 */
	public MInvoiceTax[] getTaxes (boolean requery)
	{
		if (m_taxes != null && !requery)
			return m_taxes;
		String sql = "SELECT * FROM C_InvoiceTax WHERE C_Invoice_ID=?";
		ArrayList<MInvoiceTax> list = new ArrayList<MInvoiceTax>();
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, get_TrxName());
			pstmt.setInt (1, getC_Invoice_ID());
			ResultSet rs = pstmt.executeQuery ();
			while (rs.next ())
				list.add(new MInvoiceTax(getCtx(), rs, get_TrxName()));
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, "getTaxes", e);
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
		
		m_taxes = new MInvoiceTax[list.size ()];
		list.toArray (m_taxes);
		return m_taxes;
	}	//	getTaxes
	
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
			+ "' WHERE C_Invoice_ID=" + getC_Invoice_ID();
		int noLine = DB.executeUpdate("UPDATE C_InvoiceLine " + set, get_TrxName());
		int noTax = DB.executeUpdate("UPDATE C_InvoiceTax " + set, get_TrxName());
		m_lines = null;
		m_taxes = null;
		log.fine(processed + " - Lines=" + noLine + ", Tax=" + noTax);
	}	//	setProcessed

	/**
	 * 	Validate Invoice Pay Schedule
	 *	@return pay schedule is valid
	 */
	public boolean validatePaySchedule()
	{
		MInvoicePaySchedule[] schedule = MInvoicePaySchedule.getInvoicePaySchedule
			(getCtx(), getC_Invoice_ID(), 0, get_TrxName());
		log.fine("#" + schedule.length);
		if (schedule.length == 0)
		{
			setIsPayScheduleValid(false);
			return false;
		}
		//	Add up due amounts
		BigDecimal total = Env.ZERO;
		for (int i = 0; i < schedule.length; i++)
		{
			schedule[i].setParent(this);
			BigDecimal due = schedule[i].getDueAmt();
			if (due != null)
				total = total.add(due);
		}
		boolean valid = getGrandTotal().compareTo(total) == 0;
		setIsPayScheduleValid(valid);
		
		//	Update Schedule Lines
		for (int i = 0; i < schedule.length; i++)
		{
			if (schedule[i].isValid() != valid)
			{
				schedule[i].setIsValid(valid);
				schedule[i].save(get_TrxName());				
			}
		}
		return valid;
	}	//	validatePaySchedule

	
	/**************************************************************************
	 * 	Before Save
	 *	@param newRecord new
	 *	@return true
	 */
	protected boolean beforeSave (boolean newRecord)
	{
		log.fine("");
		//	No Partner Info - set Template
		if (getC_BPartner_ID() == 0)
			setBPartner(MBPartner.getTemplate(getCtx(), getAD_Client_ID()));
		if (getC_BPartner_Location_ID() == 0)
			setBPartner(new MBPartner(getCtx(), getC_BPartner_ID(), null));

		//	Price List
		if (getM_PriceList_ID() == 0)
		{
			int ii = Env.getContextAsInt(getCtx(), "#M_PriceList_ID");
			if (ii != 0)
				setM_PriceList_ID(ii);
			else
			{
				String sql = "SELECT M_PriceList_ID FROM M_PriceList WHERE AD_Client_ID=? AND IsDefault='Y'";
				ii = DB.getSQLValue (null, sql, getAD_Client_ID());
				if (ii != 0)
					setM_PriceList_ID (ii);
			}
		}

		//	Currency
		if (getC_Currency_ID() == 0)
		{
			String sql = "SELECT C_Currency_ID FROM M_PriceList WHERE M_PriceList_ID=?";
			int ii = DB.getSQLValue (null, sql, getM_PriceList_ID());
			if (ii != 0)
				setC_Currency_ID (ii);
			else
				setC_Currency_ID(Env.getContextAsInt(getCtx(), "#C_Currency_ID"));
		}

		//	Sales Rep
		if (getSalesRep_ID() == 0)
		{
			int ii = Env.getContextAsInt(getCtx(), "#SalesRep_ID");
			if (ii != 0)
				setSalesRep_ID (ii);
		}

		//	Document Type
		if (getC_DocType_ID() == 0)
			setC_DocType_ID (0);	//	make sure it's set to 0
		if (getC_DocTypeTarget_ID() == 0)
			setC_DocTypeTarget_ID(isSOTrx() ? REF_C_DocTypeDocBaseType.ARInvoice : REF_C_DocTypeDocBaseType.APInvoice);

		//	Payment Term
		if (getC_PaymentTerm_ID() == 0)
		{
			int ii = Env.getContextAsInt(getCtx(), "#C_PaymentTerm_ID");
			if (ii != 0)
				setC_PaymentTerm_ID (ii);
			else
			{
				String sql = "SELECT C_PaymentTerm_ID FROM C_PaymentTerm WHERE AD_Client_ID=? AND IsDefault='Y'";
				ii = DB.getSQLValue(null, sql, getAD_Client_ID());
				if (ii != 0)
					setC_PaymentTerm_ID (ii);
			}
		}
		return true;
	}	//	beforeSave

	/**
	 * 	Before Delete
	 *	@return true if it can be deleted
	 */
	protected boolean beforeDelete ()
	{
		if (getC_Order_ID() != 0)
		{
			log.saveError("Error", Msg.getMsg(getCtx(), "CannotDelete"));
			return false;
		}
		return true;
	}	//	beforeDelete

	/**
	 * 	String Representation
	 *	@return info
	 */
	public String toString ()
	{
		StringBuffer sb = new StringBuffer ("MInvoice[")
			.append(get_ID()).append("-");
		if (getSerial() != null)
			sb.append(getSerial()).append("-");
		sb.append(getDocumentNo()).append(",GrandTotal=").append(getGrandTotal());
		sb.append("C_Currency_ID=").append(this.getC_Currency_ID());
		if (m_lines != null)
			sb.append(" (#").append(m_lines.length).append(")");
		sb.append ("]");
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
	 * 	After Save
	 *	@param newRecord new
	 *	@param success success
	 *	@return success
	 */
	protected boolean afterSave (boolean newRecord, boolean success)
	{
		if (!success || newRecord)
			return success;
		
		if (is_ValueChanged("AD_Org_ID"))
		{
			String sql = "UPDATE C_InvoiceLine ol"
				+ " SET AD_Org_ID ="
					+ "(SELECT AD_Org_ID"
					+ " FROM C_Invoice o WHERE ol.C_Invoice_ID=o.C_Invoice_ID) "
				+ "WHERE C_Invoice_ID=" + getC_Invoice_ID();
			int no = DB.executeUpdate(sql, get_TrxName());
			log.fine("Lines -> #" + no);
		}		
		return true;
	}	//	afterSave
	
	
	/**
	 * 	Set Price List (and Currency) when valid
	 * 	@param M_PriceList_ID price list
	 */
	public void setM_PriceList_ID (int M_PriceList_ID)
	{
		String sql = "SELECT M_PriceList_ID, C_Currency_ID "
			+ "FROM M_PriceList WHERE M_PriceList_ID=?";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement(sql, null);
			pstmt.setInt(1, M_PriceList_ID);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next())
			{
				super.setM_PriceList_ID (rs.getInt(1));
				setC_Currency_ID (rs.getInt(2));
			}
			rs.close();
			pstmt.close();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, "setM_PriceList_ID", e);
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
	}	//	setM_PriceList_ID

	
	/**
	 * 	Get Allocated Amt in Invoice Currency
	 *	@return pos/neg amount or null
	 */
	public BigDecimal getAllocatedAmt ()
	{
		BigDecimal retValue = null;
		String sql = "SELECT SUM(currencyConvert(al.Amount+al.DiscountAmt+al.WriteOffAmt,"
				+ "COALESCE(al.C_BOE_ID,0),ah.C_Currency_ID, i.C_Currency_ID,ah.DateTrx,COALESCE(i.C_ConversionType_ID,0), al.AD_Client_ID,al.AD_Org_ID)) " 
			+ "FROM C_AllocationLine al"
			+ " INNER JOIN C_AllocationHdr ah ON (al.C_AllocationHdr_ID=ah.C_AllocationHdr_ID)"
			+ " INNER JOIN C_Invoice i ON (al.C_Invoice_ID=i.C_Invoice_ID) "
			+ "WHERE al.C_Invoice_ID=?"
			+ " AND ah.IsActive='Y' AND al.IsActive='Y'";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement(sql, get_TrxName());
			pstmt.setInt(1, getC_Invoice_ID());
			ResultSet rs = pstmt.executeQuery();
			if (rs.next())
				retValue = rs.getBigDecimal(1);
			rs.close();
			pstmt.close();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, sql, e);
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
	//	log.fine("getAllocatedAmt - " + retValue);
		//	? ROUND(COALESCE(v_AllocatedAmt,0), 2);
		return retValue;
	}	//	getAllocatedAmt

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
			total = total.negate();
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
	 * 	Set Paid Flag for invoices
	 * 	@param ctx context
	 *	@param C_BPartner_ID if 0 all
	 *	@param trxName transaction
	 */
	public static void setIsPaid (Properties ctx, int C_BPartner_ID, String trxName)
	{
		int counter = 0;
		String sql = "SELECT * FROM C_Invoice "
			+ "WHERE IsPaid='N' AND DocStatus IN ('CO','CL')";
		if (C_BPartner_ID > 1)
			sql += " AND C_BPartner_ID=?";
		else
			sql += " AND AD_Client_ID=" + Env.getAD_Client_ID(ctx);
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, trxName);
			if (C_BPartner_ID > 1)
				pstmt.setInt (1, C_BPartner_ID);
			ResultSet rs = pstmt.executeQuery ();
			while (rs.next ())
			{
				MInvoice invoice = new MInvoice(ctx, rs, trxName);
				if (invoice.testAllocation())
					if (invoice.save())
						counter++;
			}
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			s_log.log(Level.SEVERE, sql, e);
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
		s_log.config("#" + counter);
		/**/
	}	//	setIsPaid

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
		if (isPaid())
			return Env.ZERO;
		//
		if (m_openAmt == null)
		{
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
		}
		//
		if (!creditMemoAdjusted)
			return m_openAmt;
		if (isCreditMemo())
			return m_openAmt.negate();
		return m_openAmt;
	}	//	getOpenAmt


	/**
	 * 	Get Document Status
	 *	@return Document Status Clear Text
	 */
	public String getDocStatusName()
	{
		return MRefList.getListName(getCtx(), REF__DocumentStatus.Identifier, getDocStatus());
	}	//	getDocStatusName

	
	/**************************************************************************
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
		ReportEngine re = ReportEngine.get (getCtx(), ReportEngine.INVOICE, getC_Invoice_ID());
		if (re == null)
			return null;
		return re.getPDF(file);
	}	//	createPDF

	/**
	 * 	Get PDF File Name
	 *	@param documentDir directory
	 *	@return file name
	 */
	public String getPDFFileName (String documentDir)
	{
		return getPDFFileName (documentDir, getC_Invoice_ID());
	}	//	getPDFFileName

	/**
	 *	Get ISO Code of Currency
	 *	@return Currency ISO
	 */
	public String getCurrencyISO()
	{
		return MCurrency.getISO_Code (getCtx(), getC_Currency_ID());
	}	//	getCurrencyISO

	/**
	 * 	Get Currency Precision
	 *	@return precision
	 */
	public int getPrecision()
	{
		return MCurrency.getStdPrecision(getCtx(), getC_Currency_ID());
	}	//	getPrecision
	
	
	/**************************************************************************
	 * 	Process document
	 *	@param processAction document action
	 *	@return true if performed
	 */
	public boolean processIt (String processAction)
	{
		boolean processit;
		m_processMsg = null;
		DocumentEngine engine = new DocumentEngine (this, getDocStatus());
		processit = engine.processIt (processAction, getDocAction());
		if (processit)
			createLog();		
//		if (processAction.equals(engine.ACTION_None) 
//				&& getDocStatus().equals(engine.ACTION_Complete) 
//				&& getDocAction().equals(ACTION_Restore))
//			{
//				return RestoreIt();
//			}
//			else
//			{
//				processit = engine.processIt (processAction, getDocAction());
//				if (processit)
//					createLog();
//			}
		return processit;
	}	//	process


	/**
	 * 	Unlock Document.
	 * 	@return true if success 
	 */
	public boolean unlockIt()
	{
		log.info("unlockIt - " + toString());
		setProcessing(false);
		return true;
	}	//	unlockIt
	
	/**
	 * 	Invalidate Document
	 * 	@return true if success 
	 */
	public boolean invalidateIt()
	{
		log.info("invalidateIt - " + toString());		
		setDocAction(REF__DocumentAction.Prepare);		
		return true;
	}	//	invalidateIt
	
	public int getLength()
	{
		MInvoiceLine[] lines = getLines(true);
		return lines.length;
	}	
			
	public MCashBook getCashBook()
	{
		return MCashBook.get(getCtx(), getAD_Org_ID(), getC_Currency_ID());
	}
	/**
	 *	Prepare Document
	 * 	@return new status (In Progress or Invalid) 
	 */
	public String prepareIt()
	{
		log.info(toString());
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_BEFORE_PREPARE);
		if (m_processMsg != null)
			return DocAction.STATUS_Invalid;
		
		MDocType dt = MDocType.get(getCtx(), getC_DocTypeTarget_ID());
		int AD_Rule_ID = dt.getAD_Rule_ID();
		KieBase kb = Env.startRule(AD_Rule_ID);
		if (kb != null)
		{
			ksession = kb.newKieSession();
			ksession.addEventListener(new DebugAgendaEventListener());
			ksession.addEventListener(new DebugRuleRuntimeEventListener());					
			ksession.setGlobal("ctx", Env.getCtx());								
			ksession.insert(this);			
		}		
		else
		{
			String error = String.format("%s en %s", Env.getKieError(AD_Rule_ID), dt.getName()); 						
			setProcessMsg(error);
			if (getProcessMsg() != null)
				return DocAction.STATUS_Invalid;
		}		
		ksession.getAgenda().getAgendaGroup( "prepare" ).setFocus();
		ksession.fireAllRules();		
		ksession.dispose();
		if (rulestatus.equals(DocAction.STATUS_InProgress))
			m_justPrepared = true;		
		return rulestatus;
		
//		log.info(toString());
//		m_processMsg = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_BEFORE_PREPARE);
//		if (m_processMsg != null)
//			return DocAction.STATUS_Invalid;
//		MDocType dt = MDocType.get(getCtx(), getC_DocTypeTarget_ID());
//
//		//	Std Period open?
//		if (!MPeriod.isOpen(getCtx(), getDateAcct(), dt.getDocBaseType(), getAD_Org_ID()))
//		{
//			m_processMsg = "@PeriodClosed@";
//			return DocAction.STATUS_Invalid;
//		}
//		//	Lines
//		MInvoiceLine[] lines = getLines(true);
//		if (lines.length == 0)
//		{
//			m_processMsg = "@NoLines@";
//			return DocAction.STATUS_Invalid;
//		}
//		//	No Cash Book
//		if (REF__PaymentRule.Cash.equals(getPaymentRule())
//			&& MCashBook.get(getCtx(), getAD_Org_ID(), getC_Currency_ID()) == null)
//		{
//			m_processMsg = "@NoCashBook@";
//			return DocAction.STATUS_Invalid;
//		}
//		//	Convert/Check DocType
//		if (getC_DocType_ID() != getC_DocTypeTarget_ID() )
//			setC_DocType_ID(getC_DocTypeTarget_ID());
//		if (getC_DocType_ID() == 0)
//		{
//			m_processMsg = "No Document Type";
//			return DocAction.STATUS_Invalid;
//		}
//
//		explodeBOM();
//		if (!calculateTaxTotal())	//	setTotals
//		{
//			m_processMsg = "Error calculating Tax";
//			return DocAction.STATUS_Invalid;
//		}
//			
//		createPaySchedule();
//		
//		//	Credit Status
//		if (isSOTrx() && !isReversal())
//		{
//			MBPartner bp = new MBPartner (getCtx(), getC_BPartner_ID(), null);
//			if (REF_C_BPartnerSOCreditStatus.CreditStop.equals(bp.getSOCreditStatus()))
//			{
//				m_processMsg = "@BPartnerCreditStop@ - @TotalOpenBalance@=" 
//					+ bp.getTotalOpenBalance()
//					+ ", @SO_CreditLimit@=" + bp.getSO_CreditLimit();
//				return DocAction.STATUS_Invalid;
//			}
//		}
//		
//		//	Landed Costs
//		if (!isSOTrx())
//		{
//			for (int i = 0; i < lines.length; i++)
//			{
//				MInvoiceLine line = lines[i];
//				String error = line.allocateLandedCosts();
//				if (error != null && error.length() > 0)
//				{
//					m_processMsg = error;
//					return DocAction.STATUS_Invalid;
//				}
//			}
//		}
//		if (getIdentifier() == null)
//		{
//			setIdentifier(Util.getUUID());
//		}
//		m_processMsg = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_AFTER_PREPARE);
//		if (m_processMsg != null)
//			return DocAction.STATUS_Invalid;
//
//		//	Add up Amounts
//		m_justPrepared = true;
//		if (!REF__DocumentAction.Complete.equals(getDocAction()))
//		{			
//			setDocAction(REF__DocumentAction.Complete);			
//		}		
//		return DocAction.STATUS_InProgress;
	}	//	prepareIt
	
	/**
	 * 	Explode non stocked BOM.
	 */
	public void explodeBOM ()
	{
		String where = "AND IsActive='Y' AND EXISTS "
			+ "(SELECT * FROM M_Product p WHERE C_InvoiceLine.M_Product_ID=p.M_Product_ID"
			+ " AND	p.IsBOM='Y' AND p.IsVerified='Y' AND p.IsStocked='N')";
		//
		String sql = "SELECT COUNT(*) FROM C_InvoiceLine "
			+ "WHERE C_Invoice_ID=? " + where; 
		int count = DB.getSQLValue(get_TrxName(), sql, getC_Invoice_ID());
		while (count != 0)
		{
			renumberLines (100);

			//	Order Lines with non-stocked BOMs
			MInvoiceLine[] lines = getLines (where);
			for (int i = 0; i < lines.length; i++)
			{
				MInvoiceLine line = lines[i];
				MProduct product = MProduct.get (getCtx(), line.getM_Product_ID(), get_TrxName());
				log.fine(product.getName());
				//	New Lines
				int lineNo = line.getLine ();
				MProductBOM[] boms = MProductBOM.getBOMLines (product);
				for (int j = 0; j < boms.length; j++)
				{
					MProductBOM bom = boms[j];
					MInvoiceLine newLine = new MInvoiceLine (this);
					newLine.setLine (++lineNo);
					newLine.setM_Product_ID (bom.getProduct().getM_Product_ID(),
						bom.getProduct().getC_UOM_ID());
					newLine.setQty (line.getQtyInvoiced().multiply(
						bom.getBOMQty ()));		//	Invoiced/Entered
					if (bom.getDescription () != null)
						newLine.setDescription (bom.getDescription ());
					//
					newLine.setPrice ();
					newLine.save (get_TrxName());
				}
				//	Convert into Comment Line
				line.setM_Product_ID (0);
				line.setM_AttributeSetInstance_ID (0);
				line.setPriceEntered (Env.ZERO);
				line.setPriceActual (Env.ZERO);
				line.setPriceLimit (Env.ZERO);
				line.setPriceList (Env.ZERO);
				line.setLineNetAmt (Env.ZERO);
				//
				String description = product.getName ();
				if (product.getDescription () != null)
					description += " " + product.getDescription ();
				if (line.getDescription () != null)
					description += " " + line.getDescription ();
				line.setDescription (description);
				line.save (get_TrxName());
			} //	for all lines with BOM

			m_lines = null;
			count = DB.getSQLValue (get_TrxName(), sql, getC_Invoice_ID ());
			renumberLines (10);
		}	//	while count != 0
	}	//	explodeBOM
	
	/**
	 * 	Calculate Tax and Total
	 * 	@return true if calculated
	 */
	public boolean calculateTaxTotal()
	{				
		log.fine("");
		
		Integer m_BP_Percentfrom3party = 0;
		Boolean m_BP_IsTaxWithHolding = false;			
		Boolean IsTaxWithHolding = false; 
		
		MOrgInfo orginfo = MOrgInfo.get(Env.getCtx(), getAD_Org_ID());
		Integer C_BPartner_ID = orginfo.getC_BPartner_ID();		
		if (C_BPartner_ID == 0)
		{
			MOrg org = MOrg.get(Env.getCtx(), orginfo.getAD_Org_ID());
			this.setProcessMsg(String.format("en info organizacion %s se debe especificar el socio de negocio vinculado para el calculo de impuestos", org.getName()));
			return false;
		}
		MBPartner partner = MBPartner.get(Env.getCtx(), C_BPartner_ID);		
		MWithholding[] withholdings = partner.getWithholdings(isSOTrx());
		MWithholding withholding = null;
		for (MWithholding holding:withholdings)
		{
			if (holding.isPaidTo3Party() && getC_DocType_ID() == holding.getC_DocType_ID())
			{		
				withholding = holding;
				//break;
			}
			if (holding.isTaxWithholding())
			{
				IsTaxWithHolding = true;
			}
		}				

		String sql = " SELECT CASE WHEN (SELECT withholdingtype = '"+REF_WithholdingType.Perception+"' from c_withholding wh " 
		+ " WHERE c_withholding_id in (select c_withholding_id from  c_bp_withholding WHERE C_BPartner_ID=? AND isActive='Y' AND IsSOTrx='";
		if (isSOTrx())
		{
			sql = sql + "Y";
		}
		else
		{
			sql = sql + "N";
		}
		sql += "') "+ " AND wh.withholdingtype = '"+REF_WithholdingType.Perception+"' AND wh.IsActive='Y' ) "
		+ " THEN 'Y' ELSE 'N' END as istaxwithholding, "
		+ " (SELECT Min(C_Withholding_ID)  from c_withholding wh " 
		+ " where "
		+ "  c_withholding_id in (select c_withholding_id from  c_bp_withholding WHERE C_BPartner_ID=? AND isActive='Y') "
		+ "  AND wh.withholdingtype = '"+REF_WithholdingType.Perception+"'  AND wh.IsActive='Y' ) as IsPaidTo3Party, "			
		+ " Name from C_BPartner WHERE C_BPartner_ID = ? ";			
		
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql, null);
			pstmt.setInt(1, getC_BPartner_ID());
			pstmt.setInt(2, getC_BPartner_ID());
			pstmt.setInt(3, getC_BPartner_ID());
			ResultSet rs = pstmt.executeQuery();
			if (rs.next())
			{
				m_BP_Percentfrom3party 	= rs.getInt(X_C_Withholding.COLUMNNAME_IsPaidTo3Party);
				if (m_BP_Percentfrom3party == null)
					m_BP_Percentfrom3party = 0;
				m_BP_IsTaxWithHolding 	= rs.getString(X_C_Withholding.COLUMNNAME_IsTaxWithholding).equals("Y");
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		if (m_BP_Percentfrom3party.intValue()  > 0)
		{
			withholding = new MWithholding(Env.getCtx(), m_BP_Percentfrom3party, get_TrxName());
		}
		
		//	Delete Taxes
		DB.executeUpdate("DELETE FROM C_InvoiceTax WHERE C_Invoice_ID=" + getC_Invoice_ID(), get_TrxName());
		m_taxes = null;
		
		//	Lines
		BigDecimal totalLines = Env.ZERO;
		BigDecimal advanceTax = Env.ZERO;
		BigDecimal WithholdingBase = Env.ZERO;
		ArrayList<Integer> taxList = new ArrayList<Integer>();
		ArrayList<Integer> advtaxList = new ArrayList<Integer>();
		MInvoiceLine[] lines = getLines(false);
		for (int i = 0; i < lines.length; i++)
		{
			MInvoiceLine line = lines[i];
			/**	Sync ownership for SO
			if (isSOTrx() && line.getAD_Org_ID() != getAD_Org_ID())
			{
				line.setAD_Org_ID(getAD_Org_ID());
				line.save();
			}	**/
			Integer taxID = new Integer(line.getC_Tax_ID());
			if (!taxList.contains(taxID))
			{
				MInvoiceTax iTax = MInvoiceTax.get (line, getPrecision(), 
					false, get_TrxName());	//	current Tax
				if (iTax != null)
				{
					iTax.setIsTaxIncluded(isTaxIncluded());
					if (!iTax.calculateTaxFromLines())
						return false;
					if (!iTax.save())
						return false;
					taxList.add(taxID);
				}
			}
			if (withholding != null)
			{
				if ( line.getM_Product_ID() > 0)								
				{
					MProduct product = MProduct.get(Env.getCtx(), line.getM_Product_ID(), get_TrxName());
					if (product.getWithholdingType().equals(REF_WithholdingType.Perception))
					{
						WithholdingBase = WithholdingBase.add(line.getLineNetAmt());
					}
				}
			}
			totalLines = totalLines.add(line.getLineNetAmt());
		}
		
		if (WithholdingBase.signum() > 0 && !m_BP_IsTaxWithHolding && isSOTrx())
		{
			advanceTax = withholding.calculate(WithholdingBase);
		}
		else if (WithholdingBase.signum() > 0 && !IsTaxWithHolding)
		{
			advanceTax = withholding.calculate(WithholdingBase);
		}
		
		//	Taxes
		BigDecimal grandTotal = totalLines;
		MInvoiceTax[] taxes = getTaxes(true);
		for (int i = 0; i < taxes.length; i++)
		{
			MInvoiceTax iTax = taxes[i];
			MTax tax = iTax.getTax();
			if (tax.isSummary())
			{
				MTax[] cTaxes = tax.getChildTaxes(false);	//	Multiple taxes
				for (int j = 0; j < cTaxes.length; j++)
				{
					MTax cTax = cTaxes[j];
					BigDecimal taxAmt = cTax.calculateTax(iTax.getTaxBaseAmt(), isTaxIncluded(), getPrecision());
					//
					MInvoiceTax newITax = new MInvoiceTax(getCtx(), 0, get_TrxName());
					newITax.setClientOrg(this);
					newITax.setC_Invoice_ID(getC_Invoice_ID());
					newITax.setC_Tax_ID(cTax.getC_Tax_ID());
					newITax.setPrecision(getPrecision());
					newITax.setIsTaxIncluded(isTaxIncluded());
					newITax.setTaxBaseAmt(iTax.getTaxBaseAmt());
					newITax.setTaxAmt(taxAmt);
					if (!newITax.save(get_TrxName()))
						return false;
					//
					if (!isTaxIncluded())
						grandTotal = grandTotal.add(taxAmt);
				}
				if (!iTax.delete(true, get_TrxName()))
					return false;
			}
			else
			{
				if (!isTaxIncluded())
					grandTotal = grandTotal.add(iTax.getTaxAmt());
			}
		}		
		//
		if (withholding != null)
		{
			setC_Withholding_ID(withholding.getC_Withholding_ID());
		}
		setWithholdingAmt(advanceTax);
		setTotalLines(totalLines);
		setGrandTotal(grandTotal);
		return true;
	}	//	calculateTaxTotal

	
	/**
	 * 	(Re) Create Pay Schedule
	 *	@return true if valid schedule
	 */
	public boolean createPaySchedule()
	{
		if (getC_PaymentTerm_ID() == 0)
			return false;
		MPaymentTerm pt = new MPaymentTerm(getCtx(), getC_PaymentTerm_ID(), null);
		log.fine(pt.toString());
		return pt.apply(this);		//	calls validate pay schedule
	}	//	createPaySchedule
		
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

	/**
	 * 	Placed Document
	 * 	@return true if success 
	 */
	public String placedIt()
	{
		log.info(toString());
		setProcessed(true);
		setDocAction(REF__DocumentAction.Close);			
		return DocAction.ACTION_Placed;
	}	//	placedIt	
	
	/**
	 * 	Returned Document
	 * 	@return true if success 
	 */
	public String returnedIt()
	{
		log.info(toString());
		return DocAction.STATUS_Returned;
	}	//	returnedIt

	public boolean IsPaymentCash()
	{
		return REF__PaymentRule.Cash.equals(getPaymentRule());
	}
	
	public boolean IsCashBookAssigned()
	{
		Boolean ret = true;
		MCash cash = MCash.get (getCtx(), getAD_Org_ID(), getDateInvoiced(), getC_Currency_ID(), get_TrxName());
		if (cash == null || cash.get_ID() == 0)
		{
			//m_processMsg = "@NoCashBook@";
			//return DocAction.STATUS_Invalid;
			ret = false;
		}
		else
		{
			MCashLine cl = new MCashLine (cash);
			cl.setInvoice(this);
			if (!cl.save(get_TrxName()))
			{
				//m_processMsg = "Could not save Cash Journal Line";
				//return DocAction.STATUS_Invalid;
				ret = false;
			}
			//info.append("@C_Cash_ID@: " + cash.getName() +  " #" + cl.getLine());
			if (ret)
				setC_CashLine_ID(cl.getC_CashLine_ID());
		}
		return ret;		
	}
	
	public boolean IsFreeTransfer() {
		MDocType doctype = MDocType.get(getCtx(),this.getC_DocType_ID());
		return REF_C_DocTypeDocBaseType.ARInvoiceFreeTransfer.equals(doctype.getDocBaseType());
	}
	public boolean UpdateInOut() {
		Boolean ret = true;	
		MInvoiceLine[] lines = getLines(false);
		for (MInvoiceLine line:lines)
		{
			//	Matching - Inv-Shipment
			if (!isSOTrx() 
					&& line.getM_InOutLine_ID() != 0
					&& line.getM_Product_ID() != 0
					&& !isReversal() 
					&& ret)
			{
				BigDecimal matchQty = line.getQtyInvoiced();
				MMatchInv inv = new MMatchInv(line, getDateInvoiced(), matchQty);
				if (!inv.save(get_TrxName()))
				{
					//m_processMsg = "Could not create Invoice Matching";
					//return DocAction.STATUS_Invalid;
					ret = false;
				}
				//else
				//	matchInv++;
			}
			if (line.getM_InOutLine_ID() != 0 && ret)
			{
				MInOutLine ioline = new MInOutLine(getCtx(), line.getM_InOutLine_ID() , get_TrxName());
				if (!ioline.isInvoiced())
				{
					ioline.setIsInvoiced(true);
					ioline.save();
				}				
			}
		}
		return ret;
	}
	public boolean UpdateOrder() {
	//	Update Order & Match
	Boolean ret = true;	
	//int matchInv = 0;
	//int matchPO = 0;
	MInvoiceLine[] lines = getLines(false);
	for (MInvoiceLine line:lines)
	{
		//	Update Order Line
		MOrderLine ol = null;
		if (line.getC_OrderLine_ID() != 0)
		{
			if (isSOTrx() || line.getM_Product_ID() == 0)
			{
				ol = new MOrderLine (getCtx(), line.getC_OrderLine_ID(), get_TrxName());
				if (line.getQtyInvoiced() != null)
					ol.setQtyInvoiced(ol.getQtyInvoiced().add(line.getQtyInvoiced()));
				if (!ol.save(get_TrxName()))
				{
					//m_processMsg = "Could not update Order Line";
					//return DocAction.STATUS_Invalid;
					ret = false;
				}
			}
			//	Order Invoiced Qty updated via Matching Inv-PO
			else if (!isSOTrx() && line.getM_Product_ID() != 0	&& !isReversal())
			{
				//	MatchPO is created also from MInOut when Invoice exists before Shipment
				BigDecimal matchQty = line.getQtyInvoiced();
				MMatchPO po = MMatchPO.create (line, null, getDateInvoiced(), matchQty);
				if (!po.save(get_TrxName()))
				{
					//m_processMsg = "Could not create PO Matching";
					//return DocAction.STATUS_Invalid;
					ret = false;
				}
				//else
				//	matchPO++;
			}
		}
	}	//	for all lines
//	if (matchInv > 0)
//		info.append(" @M_MatchInv_ID@#").append(matchInv).append(" ");
//	if (matchPO > 0)
//		info.append(" @M_MatchPO_ID@#").append(matchPO).append(" ");
//	}
	return ret;
	}
	
	public boolean UpdateBPStats() {
		Boolean ret = true;
		//	Update BP Statistics
		MBPartner bp = new MBPartner (getCtx(), getC_BPartner_ID(), get_TrxName());
		if (!bp.isOneTime())
		{
			try {
				//	Update total revenue and balance / credit limit (reversed on AllocationLine.processIt)
				BigDecimal invAmt = MConversionRate.convertBase(getCtx(), getC_DocType_ID(), getGrandTotal(true),	//	CM adjusted 
						getC_Currency_ID(), getDateInvoiced(), getC_ConversionType_ID(), getAD_Client_ID(), getAD_Org_ID());
				if (invAmt == null)
				{
					//m_processMsg = "Could not convert C_Currency_ID=" + getC_Currency_ID()
					//		+ " to base C_Currency_ID=" + MClient.get(Env.getCtx()).getC_Currency_ID();
					//return DocAction.STATUS_Invalid;
					X_C_ConversionType ct = new Query(Env.getCtx(), X_C_ConversionType.Table_Name, "C_ConversionType_ID = ?", null)
						.setParameters(getC_ConversionType_ID()).first();
					if (ct == null)
					{
						throw new Exception("Conversion Type don't exists");
					}
					throw new Exception("Could not convert "+getDateInvoiced().toString()+" "+ct.getName()+" C_Currency_ID=" + getC_Currency_ID()
							+ " to base C_Currency_ID=" + MClient.get(Env.getCtx()).getC_Currency_ID());
					//ret = false;
				}
				//	Total Balance
				BigDecimal newBalance = bp.getTotalOpenBalance(false);
				if (newBalance == null)
					newBalance = Env.ZERO;
				if (isSOTrx())
				{
					newBalance = newBalance.add(invAmt);
					//
					if (bp.getFirstSale() == null)
						bp.setFirstSale(getDateInvoiced());
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
					log.fine("GrandTotal=" + getGrandTotal(true) + "(" + invAmt 
							+ ") BP Life=" + bp.getActualLifeTimeValue() + "->" + newLifeAmt
							+ ", Credit=" + bp.getSO_CreditUsed() + "->" + newCreditAmt
							+ ", Balance=" + bp.getTotalOpenBalance(false) + " -> " + newBalance);
					bp.setActualLifeTimeValue(newLifeAmt);
					bp.setSO_CreditUsed(newCreditAmt);
				}	//	SO
				else
				{
					newBalance = newBalance.subtract(invAmt);
					log.fine("GrandTotal=" + getGrandTotal(true) + "(" + invAmt 
							+ ") Balance=" + bp.getTotalOpenBalance(false) + " -> " + newBalance);
				}
				bp.setTotalOpenBalance(newBalance);
				bp.setSOCreditStatus();
				if (!bp.save(get_TrxName()))
				{
					throw new Exception("Could not update Business Partner");
					//m_processMsg = ;
					//return DocAction.STATUS_Invalid;
					//ret = false;
				}
			}
			catch (Exception e)
			{
				m_processMsg = e.getMessage();
				//return DocAction.STATUS_Invalid;
				ret = false;
			}
		}	
		return ret;
	}
	
	public void Rounding()
	{
		MPaymentTerm pt = new Query(Env.getCtx(), X_C_PaymentTerm.Table_Name, "C_PaymentTerm_ID = ?", null)
			.setParameters(getC_PaymentTerm_ID()).first();		
		if (pt != null && pt.getNickelRoundAmt().compareTo(BigDecimal.ZERO) > 0)
		{				
			if (getWriteOffType() == null)				
			{
				MOrder order = new MOrder(Env.getCtx(), this.getC_Order_ID(), null);
				order.getWriteOffType();
			}			
			BigDecimal nickelround = Util.round(getGrandTotal(), pt.getNickelRoundAmt(), getWriteOffType());
			BigDecimal discount = BigDecimal.ZERO;
			if (nickelround.signum()  > 0)
			{
				discount = getGrandTotal().subtract(nickelround);
				setWriteOffAmt(discount);
			}
		}		
	}

	public boolean UpdateUser()
	{
		boolean ret = true;
		MBPartner bp = new MBPartner (getCtx(), getC_BPartner_ID(), get_TrxName());		
		//	User - Last Result/Contact
		if (getAD_User_ID() != 0 && !bp.isOneTime())
		{
			MUser user = new MUser (getCtx(), getAD_User_ID(), get_TrxName());
			user.setLastContact(new Timestamp(System.currentTimeMillis()));
			user.setLastResult(Msg.translate(getCtx(), "C_Invoice_ID") + ": " + getDocumentNo());
			if (!user.save(get_TrxName()))
			{
				m_processMsg = "Could not update Business Partner User";
				//return DocAction.STATUS_Invalid;
				ret = false;
			}
		}	//	user
		return ret;
	}
	
	public boolean UpdateProject()
	{
		boolean ret = true;
		//	Update Project
		if (isSOTrx() && getC_Project_ID() != 0)
		{
			MProject project = new MProject (getCtx(), getC_Project_ID(), get_TrxName());
			BigDecimal amt = getGrandTotal(true);
			int C_CurrencyTo_ID = project.getC_Currency_ID();
			if (C_CurrencyTo_ID != getC_Currency_ID())
				amt = MConversionRate.convert(getCtx(), amt, getC_Currency_ID(), C_CurrencyTo_ID, 
						getDateInvoiced(), 0, getAD_Client_ID(), getAD_Org_ID());
			if (amt == null)
			{
				m_processMsg = "Could not convert C_Currency_ID=" + getC_Currency_ID()
						+ " to Project C_Currency_ID=" + C_CurrencyTo_ID;
				//return DocAction.STATUS_Invalid;
				ret = false;
			}
			BigDecimal newAmt = project.getInvoicedAmt();
			if (newAmt == null)
				newAmt = amt;
			else
				newAmt = newAmt.add(amt);
			log.fine("GrandTotal=" + getGrandTotal(true) + "(" + amt
					+ ") Project " + project.getName() 
					+ " - Invoiced=" + project.getInvoicedAmt() + "->" + newAmt);
			project.setInvoicedAmt(newAmt);
			if (!project.save(get_TrxName()))
			{
				m_processMsg = "Could not update Project";
				//return DocAction.STATUS_Invalid;
				ret = false;
			}
		}	//	project
		return ret;
	}
	
	public void setRulestatus(String rulestatus) {		
		if (rulestatus.compareTo(DocAction.STATUS_Completed) == 0 || 
			rulestatus.compareTo(DocAction.STATUS_WaitingPayment) == 0 && 
			getProcessMsg() == null)
			setProcessed(true);
		this.rulestatus = rulestatus;
	}	
	/**
	 * 	Complete Document
	 * 	@return new status (Complete, In Progress, Invalid, Waiting ..)
	 */
	public String completeIt()
	{
		if (!m_justPrepared) {
			String status = prepareIt();
			if (!DocAction.STATUS_InProgress.equals(status))
				return status;
		}
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_BEFORE_COMPLETE);
		if (m_processMsg != null)
		{
			System.out.println("status invalid");
			return DocAction.STATUS_Invalid;
		}
		MDocType dt = MDocType.get(getCtx(), getC_DocType_ID());
		int AD_Rule_ID = dt.getAD_Rule_ID();	
		log.log(Level.WARNING, String.format("ruling invoice <%s-%s>", getSerial(), getDocumentNo()));
		KieBase kb = Env.startRule(AD_Rule_ID);
		if (kb != null)
		{
			ksession = kb.newKieSession();
			ksession.addEventListener(new DebugAgendaEventListener());
			ksession.addEventListener(new DebugRuleRuntimeEventListener());					
			ksession.setGlobal("ctx", Env.getCtx());								
			ksession.insert(this);			
		}		
		else
		{
			String error = String.format("%s en %s", Env.getKieError(AD_Rule_ID), dt.getName()); 						
			setProcessMsg(error);
			if (getProcessMsg() != null)
				return DocAction.STATUS_Invalid;
		}		
		ksession.getAgenda().getAgendaGroup( "complete" ).setFocus();		
		ksession.fireAllRules();		
		ksession.dispose();
		if (getProcessMsg() != null)
			return DocAction.STATUS_Invalid;
		return rulestatus;
//		
//		//	Re-Check
//		if (!m_justPrepared)
//		{
//			String status = prepareIt();
//			if (!DocAction.STATUS_InProgress.equals(status))
//				return status;
//		}
//		
//		m_processMsg = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_BEFORE_COMPLETE);
//		if (m_processMsg != null)
//			return DocAction.STATUS_Invalid;
//		
//		//	Implicit Approval
//		if (!isApproved())
//			approveIt();
//		log.info(toString());
//		StringBuffer info = new StringBuffer();
//
//		// si es transferencia gratuita no alterna ningun proceso interno de la factura completa y cancela y 
//		// retorna gracilmente.
//		MDocType doctype = MDocType.get(getCtx(),this.getC_DocType_ID());
//		if (REF_C_DocTypeDocBaseType.ARInvoiceFreeTransfer.equals(doctype.getDocBaseType()))
//		{
//			setIsPaid(true);
//			setProcessed(true);
//			setDocAction(REF__DocumentAction.Close);		
//			return DocAction.STATUS_Completed;
//		}		
//		
//		// sergioaguayo: don't create cash lines for POS orders, as the POS is in charge of creating them in a specific cashbook
//		MDocType type = MDocType.get(getCtx(),new MOrder(getCtx(), getC_Order_ID(), get_TrxName()).getC_DocTypeTarget_ID());
//		
//		//	Create Cash
//		if (REF__PaymentRule.Cash.equals(getPaymentRule()) && !REF_C_DocTypeSubTypeSO.POSOrder.equals(type.getDocSubType()))
//		{
//			MCash cash = MCash.get (getCtx(), getAD_Org_ID(), 
//				getDateInvoiced(), getC_Currency_ID(), get_TrxName());
//			if (cash == null || cash.get_ID() == 0)
//			{
//				m_processMsg = "@NoCashBook@";
//				return DocAction.STATUS_Invalid;
//			}
//			MCashLine cl = new MCashLine (cash);
//			cl.setInvoice(this);
//			if (!cl.save(get_TrxName()))
//			{
//				m_processMsg = "Could not save Cash Journal Line";
//				return DocAction.STATUS_Invalid;
//			}
//			info.append("@C_Cash_ID@: " + cash.getName() +  " #" + cl.getLine());
//			setC_CashLine_ID(cl.getC_CashLine_ID());
//		}	//	CashBook
//		
//		//	Update Order & Match
//		int matchInv = 0;
//		int matchPO = 0;
//		MInvoiceLine[] lines = getLines(false);
//		for (int i = 0; i < lines.length; i++)
//		{
//			MInvoiceLine line = lines[i];
//
//			//	Update Order Line
//			MOrderLine ol = null;
//			if (line.getC_OrderLine_ID() != 0)
//			{
//				if (isSOTrx() 
//					|| line.getM_Product_ID() == 0)
//				{
//					ol = new MOrderLine (getCtx(), line.getC_OrderLine_ID(), get_TrxName());
//					if (line.getQtyInvoiced() != null)
//						ol.setQtyInvoiced(ol.getQtyInvoiced().add(line.getQtyInvoiced()));
//					if (!ol.save(get_TrxName()))
//					{
//						m_processMsg = "Could not update Order Line";
//						return DocAction.STATUS_Invalid;
//					}
//				}
//				//	Order Invoiced Qty updated via Matching Inv-PO
//				else if (!isSOTrx() 
//					&& line.getM_Product_ID() != 0 
//					&& !isReversal())
//				{
//					//	MatchPO is created also from MInOut when Invoice exists before Shipment
//					BigDecimal matchQty = line.getQtyInvoiced();
//					MMatchPO po = MMatchPO.create (line, null,
//						getDateInvoiced(), matchQty);
//					if (!po.save(get_TrxName()))
//					{
//						m_processMsg = "Could not create PO Matching";
//						return DocAction.STATUS_Invalid;
//					}
//					else
//						matchPO++;
//				}
//			}
//
//			//	Matching - Inv-Shipment
//			if (!isSOTrx() 
//				&& line.getM_InOutLine_ID() != 0
//				&& line.getM_Product_ID() != 0
//				&& !isReversal())
//			{
//				BigDecimal matchQty = line.getQtyInvoiced();
//				MMatchInv inv = new MMatchInv(line, getDateInvoiced(), matchQty);
//				if (!inv.save(get_TrxName()))
//				{
//					m_processMsg = "Could not create Invoice Matching";
//					return DocAction.STATUS_Invalid;
//				}
//				else
//					matchInv++;
//			}
//			if (line.getM_InOutLine_ID() != 0)
//			{
//				MInOutLine ioline = new MInOutLine(getCtx(), line.getM_InOutLine_ID() , get_TrxName());
//				if (!ioline.isInvoiced())
//				{
//					ioline.setIsInvoiced(true);
//					ioline.save();
//				}				
//			}
//		}	//	for all lines
//		if (matchInv > 0)
//			info.append(" @M_MatchInv_ID@#").append(matchInv).append(" ");
//		if (matchPO > 0)
//			info.append(" @M_MatchPO_ID@#").append(matchPO).append(" ");
//		
//		
//		//	Update BP Statistics
//		MBPartner bp = new MBPartner (getCtx(), getC_BPartner_ID(), get_TrxName());
//		if (!bp.isOneTime())
//		{
//			//	Update total revenue and balance / credit limit (reversed on AllocationLine.processIt)
//			BigDecimal invAmt = MConversionRate.convertBase(getCtx(), getC_DocType_ID(), getGrandTotal(true),	//	CM adjusted 
//					getC_Currency_ID(), getDateInvoiced(), getC_ConversionType_ID(), getAD_Client_ID(), getAD_Org_ID());
//			if (invAmt == null)
//			{
//				m_processMsg = "Could not convert C_Currency_ID=" + getC_Currency_ID()
//						+ " to base C_Currency_ID=" + MClient.get(Env.getCtx()).getC_Currency_ID();
//				return DocAction.STATUS_Invalid;
//			}
//			//	Total Balance
//			BigDecimal newBalance = bp.getTotalOpenBalance(false);
//			if (newBalance == null)
//				newBalance = Env.ZERO;
//			if (isSOTrx())
//			{
//				newBalance = newBalance.add(invAmt);
//				//
//				if (bp.getFirstSale() == null)
//					bp.setFirstSale(getDateInvoiced());
//				BigDecimal newLifeAmt = bp.getActualLifeTimeValue();
//				if (newLifeAmt == null)
//					newLifeAmt = invAmt;
//				else
//					newLifeAmt = newLifeAmt.add(invAmt);
//				BigDecimal newCreditAmt = bp.getSO_CreditUsed();
//				if (newCreditAmt == null)
//					newCreditAmt = invAmt;
//				else
//					newCreditAmt = newCreditAmt.add(invAmt);
//				//
//				log.fine("GrandTotal=" + getGrandTotal(true) + "(" + invAmt 
//						+ ") BP Life=" + bp.getActualLifeTimeValue() + "->" + newLifeAmt
//						+ ", Credit=" + bp.getSO_CreditUsed() + "->" + newCreditAmt
//						+ ", Balance=" + bp.getTotalOpenBalance(false) + " -> " + newBalance);
//				bp.setActualLifeTimeValue(newLifeAmt);
//				bp.setSO_CreditUsed(newCreditAmt);
//			}	//	SO
//			else
//			{
//				newBalance = newBalance.subtract(invAmt);
//				log.fine("GrandTotal=" + getGrandTotal(true) + "(" + invAmt 
//						+ ") Balance=" + bp.getTotalOpenBalance(false) + " -> " + newBalance);
//			}
//			bp.setTotalOpenBalance(newBalance);
//			bp.setSOCreditStatus();
//			if (!bp.save(get_TrxName()))
//			{
//				m_processMsg = "Could not update Business Partner";
//				return DocAction.STATUS_Invalid;
//			}
//		}
//		//	User - Last Result/Contact
//		if (getAD_User_ID() != 0)
//		{
//			MUser user = new MUser (getCtx(), getAD_User_ID(), get_TrxName());
//			user.setLastContact(new Timestamp(System.currentTimeMillis()));
//			user.setLastResult(Msg.translate(getCtx(), "C_Invoice_ID") + ": " + getDocumentNo());
//			if (!user.save(get_TrxName()))
//			{
//				m_processMsg = "Could not update Business Partner User";
//				return DocAction.STATUS_Invalid;
//			}
//		}	//	user
//	
//		//	Update Project
//		if (isSOTrx() && getC_Project_ID() != 0)
//		{
//			MProject project = new MProject (getCtx(), getC_Project_ID(), get_TrxName());
//			BigDecimal amt = getGrandTotal(true);
//			int C_CurrencyTo_ID = project.getC_Currency_ID();
//			if (C_CurrencyTo_ID != getC_Currency_ID())
//				amt = MConversionRate.convert(getCtx(), amt, getC_Currency_ID(), C_CurrencyTo_ID, 
//					getDateInvoiced(), 0, getAD_Client_ID(), getAD_Org_ID());
//			if (amt == null)
//			{
//				m_processMsg = "Could not convert C_Currency_ID=" + getC_Currency_ID()
//					+ " to Project C_Currency_ID=" + C_CurrencyTo_ID;
//				return DocAction.STATUS_Invalid;
//			}
//			BigDecimal newAmt = project.getInvoicedAmt();
//			if (newAmt == null)
//				newAmt = amt;
//			else
//				newAmt = newAmt.add(amt);
//			log.fine("GrandTotal=" + getGrandTotal(true) + "(" + amt
//				+ ") Project " + project.getName() 
//				+ " - Invoiced=" + project.getInvoicedAmt() + "->" + newAmt);
//			project.setInvoicedAmt(newAmt);
//			if (!project.save(get_TrxName()))
//			{
//				m_processMsg = "Could not update Project";
//				return DocAction.STATUS_Invalid;
//			}
//		}	//	project
//		
//		//	User Validation
//		String valid = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_AFTER_COMPLETE);
//		if (valid != null)
//		{
//			m_processMsg = valid;
//			return DocAction.STATUS_Invalid;
//		}
//
//		//	Counter Documents
//		MInvoice counter = createCounterDoc();
//		if (counter != null)
//			info.append(" - @CounterDoc@: @C_Invoice_ID@=").append(counter.getDocumentNo());
//
//		m_processMsg = info.toString().trim();
//		setProcessed(true);
//		setDocAction(REF__DocumentAction.Close);
//		return DocAction.STATUS_Completed;		
	}	//	completeIt
	
	public void createLog()
	{
		// Invoice Status Log
		Trx trx = Trx.get(Trx.createTrxName("invoicestatus"), true);				
		X_C_InvoiceStatus invoicestatus = new X_C_InvoiceStatus(Env.getCtx(), 0, trx.getTrxName());
		//invoicestatus.setAD_Org_ID(Env.getAD_Org_ID(Env.getCtx()));
		invoicestatus.setAD_Org_ID(getAD_Org_ID());
		invoicestatus.setAD_Client_ID(getAD_Client_ID());
		invoicestatus.setC_Invoice_ID(getC_Invoice_ID());
		invoicestatus.setStatusDate(getStatusDate());		
		invoicestatus.setDocStatus(getDocStatus());
		if (!invoicestatus.save())
			trx.rollback();
		trx.close();		
		// 
	}
	
	/**
	 * 	Create Counter Document
	 * 	@return counter invoice
	 */
	private MInvoice createCounterDoc()
	{
		//	Is this a counter doc ?
		if (getRef_Invoice_ID() != 0)
			return null;

		//	Org Must be linked to BPartner
		MOrg org = MOrg.get(getCtx(), getAD_Org_ID());
		int counterC_BPartner_ID = org.getLinkedC_BPartner_ID(get_TrxName()); 
		if (counterC_BPartner_ID == 0)
			return null;
		//	Business Partner needs to be linked to Org
		MBPartner bp = new MBPartner (getCtx(), getC_BPartner_ID(), null);
		int counterAD_Org_ID = bp.getAD_OrgBP_ID_Int(); 
		if (counterAD_Org_ID == 0)
			return null;
		
		MBPartner counterBP = new MBPartner (getCtx(), counterC_BPartner_ID, null);
		MOrgInfo counterOrgInfo = MOrgInfo.get(getCtx(), counterAD_Org_ID);
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
		MInvoice counter = copyFrom(this, getDateInvoiced(), 
			C_DocTypeTarget_ID, !isSOTrx(), true, get_TrxName(), true);
		//
		counter.setAD_Org_ID(counterAD_Org_ID);
	//	counter.setM_Warehouse_ID(counterOrgInfo.getM_Warehouse_ID());
		//
		counter.setBPartner(counterBP);
		//	Refernces (Should not be required
		counter.setSalesRep_ID(getSalesRep_ID());
		counter.save(get_TrxName());
		
		//	Update copied lines
		MInvoiceLine[] counterLines = counter.getLines(true);
		for (int i = 0; i < counterLines.length; i++)
		{
			MInvoiceLine counterLine = counterLines[i];
			counterLine.setClientOrg(counter);
			counterLine.setInvoice(counter);	//	copies header values (BP, etc.)
			counterLine.setPrice();
			counterLine.setTax();
			//
			counterLine.save(get_TrxName());
		}
		
		log.fine(counter.toString());
		
		//	Document Action
		if (counterDT != null)
		{
			if (counterDT.getDocAction() != null)
			{
				counter.setDocAction(counterDT.getDocAction());
				counter.processIt(counterDT.getDocAction());
				counter.save(get_TrxName());
			}
		}
		return counter;
	}	//	createCounterDoc
	
	public boolean IsPeriodOpen()
	{
		MDocType dt = MDocType.get(getCtx(), getC_DocType_ID());
		boolean AlreadyPaid = false;
		if (!MPeriod.isOpen(getCtx(), getDateAcct(), dt.getDocBaseType(), getAD_Org_ID()))
		{
			m_processMsg = "No se pudo restaurar @PeriodClosed@";
			return false;
		}		
		return true;
	}
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

		if (!IsPeriodOpen())
			return false;
		// Eliminamos el payment
		if (getC_Payment_ID() != 0)
		{
			MPayment payment = new MPayment(Env.getCtx(), getC_Payment_ID(), get_TrxName());
			payment.RestoreIt();
			payment.delete(false, get_TrxName());
			setIsPaid(false);
			setC_Payment_ID(0);
		}
		if (IsReferenced())
			return false;
		String sql = new StringBuffer ("DELETE FROM T_Sales WHERE C_Invoice_ID=").append(getC_Invoice_ID()).toString();
		int	no = DB.executeUpdate(sql.toString(), get_TrxName());						
		
		MInvoiceLine lines[] = getLines(false);
		for (MInvoiceLine line:lines)
		{
			if (line.getC_OrderLine_ID() != 0) {
				MOrderLine oline = new MOrderLine(getCtx(), line.getC_OrderLine_ID(), get_TrxName());
				oline.setQtyInvoiced(oline.getQtyInvoiced().subtract(line.getQtyInvoiced()));				
				line.setC_OrderLine_ID(0);
				if (!oline.save())
					return false;
			}
			if (line.getM_InOutLine_ID() != 0) {
				MInOutLine ioline = new MInOutLine(getCtx(), line.getM_InOutLine_ID(), get_TrxName());
				ioline.setIsInvoiced(false);				
				line.setM_InOutLine_ID(0);
				if (!ioline.save())
					return false;
			}
			//line.setProcessed(false);
			line.save();			
		}

		MInvoiceTax taxes[] = getTaxes(false);
		for (MInvoiceTax tax:taxes) {
			tax.setProcessed(false);
			tax.save();
		}
		
		addDescription(Msg.getMsg(getCtx(), "Voided"));
		setIsPaid(false);
		setC_Payment_ID(0);
		setC_Order_ID(0);
//		if (getC_POSLog_ID() > 0)
//		{
//			PO po = new Query(Env.getCtx(),"C_POSLog", "C_POSLog_ID = ?", get_TrxName()).setParameters(getC_POSLog_ID()).first();
//			if (po != null)
//			{
//				po.set_Value(X_C_Invoice.COLUMNNAME_DocStatus, DocAction.STATUS_Voided);
//				po.save(get_TrxName());
//			}
//			//				X_C_POSLog poslog = new X_C_POSLog(Env.getCtx(), getC_POSLog_ID(), get_TrxName());
//			//				poslog.setDocStatus(DocAction.STATUS_Voided);
//			//				poslog.save(get_TrxName());
//		}
				
		sql = "DELETE FROM Fact_Acct WHERE AD_Table_ID=" + MInvoice.Table_ID + " AND Record_ID=?";

		if (DB.executeUpdate(sql, get_ID(), get_TrxName()) == -1) {
			return false;
		}

		sql = "DELETE FROM M_MatchPO WHERE C_InvoiceLine_ID IN (SELECT C_InvoiceLine_ID FROM C_InvoiceLine WHERE C_Invoice_ID=?)";
		if (DB.executeUpdate(sql, get_ID(), get_TrxName()) == -1) {
			return false;
		}
	
		sql = "DELETE FROM M_MatchInv WHERE C_InvoiceLine_ID IN (SELECT C_InvoiceLine_ID FROM C_InvoiceLine WHERE C_Invoice_ID=?)";
		if (DB.executeUpdate(sql, get_ID(), get_TrxName()) == -1) {
			return false;
		}
		
		sql = "UPDATE C_Invoice set C_Order_ID = null WHERE C_Invoice_ID = ? ";
		if (DB.executeUpdate(sql, get_ID(), get_TrxName()) == -1) {
			return false;
		}		
		//
		//	Update BP Statistics
		MBPartner bp = new MBPartner (getCtx(), getC_BPartner_ID(), get_TrxName());
		BigDecimal invAmt = MConversionRate.convertBase(getCtx(), getC_DocType_ID(), getGrandTotal(true),	//	CM adjusted 
				getC_Currency_ID(), getDateAcct(), 0, getAD_Client_ID(), getAD_Org_ID());
		if (invAmt != null)
		{
			BigDecimal newCreditUsed = bp.getSO_CreditUsed();
			BigDecimal newBalance = bp.getTotalOpenBalance(false);
			if (newBalance == null)
				newBalance = Env.ZERO;
			if (isSOTrx())
			{
				if (this.getPaymentRule().equals(REF__PaymentRule.OnCredit))
					newCreditUsed = newCreditUsed.subtract(invAmt);
				newBalance = newBalance.subtract(invAmt);
				log.fine("GrandTotal=" + getGrandTotal(true) + "(" + invAmt 
					+ ") Balance=" + bp.getTotalOpenBalance(false) + " -> " + newBalance);				
			}	//	SO
			else
			{
				newBalance = newBalance.add(invAmt);
				//
				if (bp.getFirstSale() == null)
					bp.setFirstSale(getDateInvoiced());
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
				log.fine("GrandTotal=" + getGrandTotal(true) + "(" + invAmt 
					+ ") BP Life=" + bp.getActualLifeTimeValue() + "->" + newLifeAmt
					+ ", Credit=" + bp.getSO_CreditUsed() + "->" + newCreditAmt
					+ ", Balance=" + bp.getTotalOpenBalance(false) + " -> " + newBalance);
				bp.setActualLifeTimeValue(newLifeAmt);
				bp.setSO_CreditUsed(newCreditAmt);				
			}
			bp.setTotalOpenBalance(newBalance);
			bp.setSO_CreditUsed(newCreditUsed);
			bp.setSOCreditStatus();
			if (!bp.save(get_TrxName()))
			{
				return false;
			}			
		}
		//	Set lines to 0
		
//		MInvoiceLine[] lines = getLines(false);
//		for (int i = 0; i < lines.length; i++)
//		{
//			MInvoiceLine line = lines[i];
//			BigDecimal old = line.getQtyInvoiced();
//			if (old.compareTo(Env.ZERO) != 0)
//			{
//				line.setQty(Env.ZERO);
//				line.setTaxAmt(Env.ZERO);
//				line.setLineNetAmt(Env.ZERO);
//				line.setLineTotalAmt(Env.ZERO);					
//				line.setPrice(Env.ZERO);
//				line.addDescription(Msg.getMsg(getCtx(), "Voided") + " (" + old + ")");
//				//	Unlink Shipment
//				if (line.getM_InOutLine_ID() != 0)
//				{
//					MInOutLine ioLine = new MInOutLine(getCtx(), line.getM_InOutLine_ID(), get_TrxName());
//					ioLine.setIsInvoiced(false);
//					ioLine.save(get_TrxName());
//					line.setM_InOutLine_ID(0);
//				}
//				if (line.getC_OrderLine_ID() != 0)
//				{
//					MOrderLine oLine = new MOrderLine(getCtx(), line.getC_OrderLine_ID(), get_TrxName());
//					oLine.setQtyInvoiced(Env.ZERO);
//				}
//				line.save(get_TrxName());
//			}
//		}
//		addDescription(Msg.getMsg(getCtx(), "Voided"));
//		setIsPaid(false);
//		setC_Payment_ID(0);
//		setC_Order_ID(0);
//		if (getC_POSLog_ID() > 0)
//		{
//			PO po = new Query(Env.getCtx(),"C_POSLog", "C_POSLog_ID = ?", get_TrxName()).setParameters(getC_POSLog_ID()).first();
//			if (po != null)
//			{
//				po.set_Value(X_C_Invoice.COLUMNNAME_DocStatus, DocAction.STATUS_Voided);
//				po.save(get_TrxName());
//			}
//			//				X_C_POSLog poslog = new X_C_POSLog(Env.getCtx(), getC_POSLog_ID(), get_TrxName());
//			//				poslog.setDocStatus(DocAction.STATUS_Voided);
//			//				poslog.save(get_TrxName());
//		}
		//		}
		//		else
		//		{
		//			return reverseCorrectIt();
		//		}

		// After Void
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_VOID);
		if (m_processMsg != null)
			return false;
		
		setDocStatus(REF__DocumentStatus.Voided);
		setDocAction(REF__DocumentAction.None);
		setProcessing(false);
		setProcessed(true);
		//setPosted(true);
//		save(get_TrxName());		
//
//		setProcessed(true);
//		setWithholdingAmt(Env.ZERO);
//		setDocStatus(REF__DocumentStatus.Voided);		//	 may come from void
//		setDocAction(REF__DocumentAction.None);		
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
		
		setProcessed(true);
		setDocAction(REF__DocumentAction.None);		
		return true;
	}	//	closeIt
	
	/**
	 * 	Reverse Correction - same date
	 * 	@return true if success 
	 */
	public boolean reverseCorrectIt()
	{
		log.info(toString());
		// Before reverseCorrect
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_REVERSECORRECT);
		if (m_processMsg != null)
			return false;
				
		MDocType dt = MDocType.get(getCtx(), getC_DocType_ID());
		if (!MPeriod.isOpen(getCtx(), getDateAcct(), dt.getDocBaseType(), Env.getAD_Org_ID(getCtx())))
		{
			m_processMsg = "@PeriodClosed@";
			return false;
		}
		//
		MAllocationHdr[] allocations = MAllocationHdr.getOfInvoice(getCtx(), 
			getC_Invoice_ID(), get_TrxName());
		for (int i = 0; i < allocations.length; i++)
		{
			allocations[i].setDocAction(DocAction.ACTION_Reverse_Correct);
			allocations[i].reverseCorrectIt();
			allocations[i].save();
		}
		//	Reverse/Delete Matching
		if (!isSOTrx())
		{
			MMatchInv[] mInv = MMatchInv.getInvoice(getCtx(), getC_Invoice_ID(), get_TrxName());
			for (int i = 0; i < mInv.length; i++)
				mInv[i].delete(true);
			MMatchPO[] mPO = MMatchPO.getInvoice(getCtx(), getC_Invoice_ID(), get_TrxName());
			for (int i = 0; i < mPO.length; i++)
			{
				if (mPO[i].getM_InOutLine_ID() == 0)
					mPO[i].delete(true);
				else
				{
					mPO[i].setC_InvoiceLine_ID(null);
					mPO[i].save(get_TrxName());
				}
			}
		}
		//
		load(get_TrxName());	//	reload allocation reversal info

		//	Deep Copy
		MInvoice reversal = copyFrom (this, getDateInvoiced(), 
			getC_DocType_ID(), isSOTrx(), false, get_TrxName(), true);
		if (reversal == null)
		{
			m_processMsg = "Could not create Invoice Reversal";
			return false;
		}
		reversal.setReversal(true);
		
		//	Reverse Line Qty
		MInvoiceLine[] rLines = reversal.getLines(false);
		for (int i = 0; i < rLines.length; i++)
		{
			MInvoiceLine rLine = rLines[i];
			rLine.setQtyEntered(rLine.getQtyEntered().negate());
			rLine.setQtyInvoiced(rLine.getQtyInvoiced().negate());
			rLine.setLineNetAmt(rLine.getLineNetAmt().negate());
			if (rLine.getTaxAmt() != null && rLine.getTaxAmt().compareTo(Env.ZERO) != 0)
				rLine.setTaxAmt(rLine.getTaxAmt().negate());
			if (rLine.getLineTotalAmt() != null && rLine.getLineTotalAmt().compareTo(Env.ZERO) != 0)
				rLine.setLineTotalAmt(rLine.getLineTotalAmt().negate());
			if (!rLine.save(get_TrxName()))
			{
				m_processMsg = "Could not correct Invoice Reversal Line";
				return false;
			}
		}
		reversal.setC_Order_ID(getC_Order_ID());
		reversal.addDescription("{->" + getDocumentNo() + ")");
		//
		if (!reversal.processIt(DocAction.ACTION_Complete))
		{
			m_processMsg = "Reversal ERROR: " + reversal.getProcessMsg();
			return false;
		}
		reversal.setC_Payment_ID(0);
		reversal.setIsPaid(true);
		reversal.closeIt();
		reversal.setProcessing (false);
		reversal.setDocStatus(REF__DocumentStatus.Reversed);
		reversal.setDocAction(REF__DocumentAction.None);
		reversal.save(get_TrxName());
		m_processMsg = reversal.getDocumentNo();
		//
		addDescription("(" + reversal.getDocumentNo() + "<-)");
		
		//	Clean up Reversed (this)
		MInvoiceLine[] iLines = getLines(false);
		for (int i = 0; i < iLines.length; i++)
		{
			MInvoiceLine iLine = iLines[i];
			if (iLine.getM_InOutLine_ID() != 0)
			{
				MInOutLine ioLine = new MInOutLine(getCtx(), iLine.getM_InOutLine_ID(), get_TrxName());
				ioLine.setIsInvoiced(false);
				ioLine.save(get_TrxName());
				//	Reconsiliation
				iLine.setM_InOutLine_ID(0);
				iLine.save(get_TrxName());
			}
        }
		setProcessed(true);
		setDocStatus(REF__DocumentStatus.Reversed);	//	may come from void		
		setDocAction(REF__DocumentAction.None);
		setC_Payment_ID(0);
		setIsPaid(true);
		
		//	Create Allocation
		MAllocationHdr alloc = new MAllocationHdr(getCtx(), false, getDateAcct(), 
			getC_Currency_ID(), 
			Msg.translate(getCtx(), "C_Invoice_ID")	+ ": " + getDocumentNo() + "/" + reversal.getDocumentNo(), 
			get_TrxName());
		alloc.setAD_Org_ID(getAD_Org_ID());
		if (alloc.save())
		{
			//	Amount
			BigDecimal gt = getGrandTotal(true);
			if (!isSOTrx())
				gt = gt.negate();
			//	Orig Line
			MAllocationLine aLine = new MAllocationLine (alloc, gt, 
				Env.ZERO, Env.ZERO, Env.ZERO);
			aLine.setC_Invoice_ID(getC_Invoice_ID());
			aLine.save();
			//	Reversal Line
			MAllocationLine rLine = new MAllocationLine (alloc, gt.negate(), 
				Env.ZERO, Env.ZERO, Env.ZERO);
			rLine.setC_Invoice_ID(reversal.getC_Invoice_ID());
			rLine.save();
			//	Process It
			if (alloc.processIt(DocAction.ACTION_Complete))
				alloc.save();
		}
		// After reverseCorrect
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_REVERSECORRECT);
		if (m_processMsg != null)
			return false;

		return true;
	}	//	reverseCorrectIt
	
	/**
	 * 	Reverse Accrual - none
	 * 	@return false 
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
	 * 	@return false 
	 */
	public boolean reActivateIt()
	{
		log.info(toString());
		// Before reActivate
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_REACTIVATE);
		if (m_processMsg != null)
			return false;	
		
		// After reActivate
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_REACTIVATE);
		if (m_processMsg != null)
			return false;
		
		
		return false;
	}	//	reActivateIt
	
	
	/*************************************************************************
	 * 	Get Summary
	 *	@return Summary of Document
	 */
	public String getSummary()
	{
		StringBuffer sb = new StringBuffer();
		if (getSerial() != null) {
			sb.append(getSerial());
			sb.append("-");
		}
		sb.append(getDocumentNo());
		//	: Grand Total = 123.00 (#1)
		sb.append(": ").
			append(Msg.translate(getCtx(),"GrandTotal")).append("=").append(getGrandTotal())
			.append(" (#").append(getLines(false).length).append(")");
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
		return getSalesRep_ID();
	}	//	getDoc_User_ID

	/**
	 * 	Get Document Approval Amount
	 *	@return amount
	 */
	public BigDecimal getApprovalAmt()
	{
		return getGrandTotal();
	}	//	getApprovalAmt

	public boolean IsReferenced() {
		if ( isPaid() && getC_Payment_ID() != 0 )			
		{
 			m_processMsg = "No se pudo restaurar  : referenciado en Payment "+Util.getDocumentNo(MPayment.Table_ID,getC_Payment_ID());
			return true;
		}
		else if (getC_CashLine_ID() > 0) 
		{
			Integer C_Cash_ID = DB.getSQLValue(get_TrxName(), "select c_cash_id from c_cashline where c_cashline_id = ?",getC_CashLine_ID());
			if (C_Cash_ID > 0)
			{
				String status = DB.getSQLValueString(get_TrxName(), "select docstatus from c_cash where c_cash_id = ?",C_Cash_ID);
				if (status.compareTo(DocAction.STATUS_Completed) == 0)
				{
					m_processMsg = "No se pudo restaurar  : referenciado en caja efectivo "+Util.getParentDescription(getC_CashLine_ID(), MCashLine.Table_Name, MCash.Table_Name);
					return true;								
				}
			}
		}
		StringBuilder sql = new StringBuilder(" with pay as  (SELECT CASE WHEN COUNT(*)>0 THEN 'Pago' END as paymsg FROM C_Payment WHERE C_Invoice_ID=?),")
	     .append("payalloc as (SELECT CASE WHEN COUNT(*)>0 THEN 'Pago (Allocation)' END as payallocmsg FROM C_AllocationLine WHERE C_Invoice_ID=?),")
	     .append("bank as (SELECT CASE WHEN COUNT(*)>0 THEN 'Bancos' END as bankmsg FROM C_BankStatementLine WHERE C_Invoice_ID=?),")
	     .append("boe as (SELECT CASE WHEN COUNT(*)>0 THEN 'Letras' END as boemsg FROM C_BOELine WHERE C_Invoice_ID=?),")
	     .append("ret as (SELECT CASE WHEN COUNT(*)>0 THEN 'Retenciones' END as retmsg FROM C_Retention WHERE C_Invoice_ID=?),")
	     .append("wh as (SELECT CASE WHEN COUNT(*)>0 THEN 'Retencion/Percepcion' END as whmsg FROM C_WithholdingLine WHERE C_Invoice_ID=?)")
	     .append("select paymsg || payallocmsg || bankmsg || boemsg || retmsg || whmsg as msg from pay,payalloc,bank,boe,ret,wh");
		
		 String error =  DB.getSQLValueString(get_TrxName(), sql.toString(),getC_Invoice_ID(),getC_Invoice_ID(),getC_Invoice_ID(),getC_Invoice_ID(),getC_Invoice_ID(),getC_Invoice_ID());
		 if (error == null)
		 {
			 error = "";
		 }
		 if (error.trim().length() > 0)
		 {
			 m_processMsg = "Factura referenciada en "+ error;
			 return true;
		 }
		 
		 sql = new StringBuilder("SELECT C_CashLine_ID FROM C_CashLine cl JOIN C_Cash c on cl.c_cash_id = c.c_cash_id WHERE C_Invoice_ID = ? AND c.DocStatus != 'CO'");
		Integer C_CashLine_ID = DB.getSQLValueEx(get_TrxName(), sql.toString(), getC_Invoice_ID());
		//if (DB.getSQLValueString(get_TrxName(), sql, getC_Invoice_ID()).equals("Y"))
		if (C_CashLine_ID > 0)
		{
				MCashLine cashline = new MCashLine(Env.getCtx(), C_CashLine_ID, get_TrxName());
				cashline.delete(true);
		}
		 
//		sql = "SELECT CASE WHEN COUNT(*)>0 THEN 'Y' ELSE 'N' END FROM C_Payment WHERE C_Invoice_ID=?";		
//		if (DB.getSQLValueString(get_TrxName(), sql, getC_Invoice_ID()).equals("Y"))
//		{
//			m_processMsg = "Factura referenciada en Pago";
//			return true;
//		}
//		sql = "SELECT CASE WHEN COUNT(*)>0 THEN 'Y' ELSE 'N' END FROM C_AllocationLine WHERE C_Invoice_ID=?";		
//		if (DB.getSQLValueString(get_TrxName(), sql, getC_Invoice_ID()).equals("Y"))
//		{
//			m_processMsg = "Factura referenciada en Pago (Allocation)";
//			return true;
//		}
//		sql = "SELECT CASE WHEN COUNT(*)>0 THEN 'Y' ELSE 'N' END FROM C_BankStatementLine WHERE C_Invoice_ID=?";		
//		if (DB.getSQLValueString(get_TrxName(), sql, getC_Invoice_ID()).equals("Y"))
//		{
//			m_processMsg = "Factura referenciada en Bancos";
//			return true;
//		}
//		sql = "SELECT CASE WHEN COUNT(*)>0 THEN 'Y' ELSE 'N' END FROM C_BOELine WHERE C_Invoice_ID=?";		
//		if (DB.getSQLValueString(get_TrxName(), sql, getC_Invoice_ID()).equals("Y"))
//		{
//			m_processMsg = "Factura referenciada en Letras";
//			return true;
//		}
//		sql = "SELECT CASE WHEN COUNT(*)>0 THEN 'Y' ELSE 'N' END FROM C_Retention WHERE C_Invoice_ID=?";		
//		if (DB.getSQLValueString(get_TrxName(), sql, getC_Invoice_ID()).equals("Y"))
//		{
//			m_processMsg = "Factura referenciada en Retenciones";
//			return true;
//		}
//		sql = "SELECT CASE WHEN COUNT(*)>0 THEN 'Y' ELSE 'N' END FROM C_WithholdingLine WHERE C_Invoice_ID=?";
//		if (DB.getSQLValueString(get_TrxName(), sql, getC_Invoice_ID()).equals("Y"))
//		{
//			m_processMsg = "Factura referenciada en (Retencion / Percepcion )";
//			return true;
//		}
		return false;
	}
	
	/**
	 * 	Get latest Retention
	 * 	@return invoice id or 0
	 */
	public int getC_Retention_ID()
	{
		int C_Retention_ID = 0;
		ArrayList list = new ArrayList();
		String sql = "SELECT C_Retention_ID FROM C_Retention "
			+ "WHERE C_Invoice_ID=? AND DocStatus IN ('TC','CT','AY') "
			+ "ORDER BY Created DESC";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement(sql, get_TrxName());
			pstmt.setInt(1, getC_Invoice_ID());
			ResultSet rs = pstmt.executeQuery();
			if (rs.next())
				C_Retention_ID = rs.getInt(1);
			rs.close();
			pstmt.close();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, "getC_Retention_ID", e);
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
		return C_Retention_ID;
	}	//	getC_Retention_ID
	
	public boolean RestoreIt() {
		MDocType dt = MDocType.get(getCtx(), getC_DocType_ID());
		boolean AlreadyPaid = false;
		if (!MPeriod.isOpen(getCtx(), getDateAcct(), dt.getDocBaseType(), getAD_Org_ID()))
		{
			m_processMsg = "No se pudo restaurar @PeriodClosed@";
			return false;
		}		
		// Eliminamos el payment
		if (getC_Payment_ID() != 0 && isPaid())
		{
			MPayment payment = new MPayment(Env.getCtx(), getC_Payment_ID(), get_TrxName());
			payment.RestoreIt();
			payment.delete(false, get_TrxName());
			setIsPaid(false);
			setC_Payment_ID(0);
		}
		if (IsReferenced())
			return false;
		String sql = new StringBuffer ("DELETE FROM T_Sales WHERE C_Invoice_ID=").append(getC_Invoice_ID()).toString();
		int	no = DB.executeUpdate(sql.toString(), get_TrxName());						
		
		MInvoiceLine lines[] = getLines(false);
		for (MInvoiceLine line:lines)
		{
			if (line.getC_OrderLine_ID() != 0) {
				MOrderLine oline = new MOrderLine(getCtx(), line.getC_OrderLine_ID(), get_TrxName());
				oline.setQtyInvoiced(oline.getQtyInvoiced().subtract(line.getQtyInvoiced()));				
				line.setC_OrderLine_ID(0);
				if (!oline.save())
					return false;
			}
			if (line.getM_InOutLine_ID() != 0) {
				MInOutLine ioline = new MInOutLine(getCtx(), line.getM_InOutLine_ID(), get_TrxName());
				ioline.setIsInvoiced(false);				
				line.setM_InOutLine_ID(0);
				if (!ioline.save())
					return false;
			}
			line.setProcessed(false);
			line.save();			
		}

		MInvoiceTax taxes[] = getTaxes(false);
		for (int i = 0; i < taxes.length; i++) {
			taxes[i].setProcessed(false);
			taxes[i].save();
		}
		
		setDocStatus(REF__DocumentStatus.Drafted);
		setDocAction(REF__DocumentAction.Complete);
		setProcessing(false);
		setProcessed(false);
		setPosted(false);
		save(get_TrxName());
		
		sql = "DELETE FROM Fact_Acct WHERE AD_Table_ID=" + MInvoice.Table_ID + " AND Record_ID=?";

		if (DB.executeUpdate(sql, get_ID(), get_TrxName()) == -1) {
			return false;
		}

		sql = "DELETE FROM M_MatchPO WHERE C_InvoiceLine_ID IN (SELECT C_InvoiceLine_ID FROM C_InvoiceLine WHERE C_Invoice_ID=?)";
		if (DB.executeUpdate(sql, get_ID(), get_TrxName()) == -1) {
			return false;
		}
	
		sql = "DELETE FROM M_MatchInv WHERE C_InvoiceLine_ID IN (SELECT C_InvoiceLine_ID FROM C_InvoiceLine WHERE C_Invoice_ID=?)";
		if (DB.executeUpdate(sql, get_ID(), get_TrxName()) == -1) {
			return false;
		}
		
		sql = "UPDATE C_Invoice set C_Order_ID = null WHERE C_Invoice_ID = ? ";
		if (DB.executeUpdate(sql, get_ID(), get_TrxName()) == -1) {
			return false;
		}		
		//
		//	Update BP Statistics
		MBPartner bp = new MBPartner (getCtx(), getC_BPartner_ID(), get_TrxName());
		BigDecimal invAmt = MConversionRate.convertBase(getCtx(), getC_DocType_ID(), getGrandTotal(true),	//	CM adjusted 
				getC_Currency_ID(), getDateAcct(), 0, getAD_Client_ID(), getAD_Org_ID());
		if (invAmt != null)
		{
			BigDecimal newCreditUsed = bp.getSO_CreditUsed();
			BigDecimal newBalance = bp.getTotalOpenBalance(false);
			if (newBalance == null)
				newBalance = Env.ZERO;
			if (isSOTrx())
			{
				if (this.getPaymentRule().equals(REF__PaymentRule.OnCredit))
					newCreditUsed = newCreditUsed.subtract(invAmt);
				newBalance = newBalance.subtract(invAmt);
				log.fine("GrandTotal=" + getGrandTotal(true) + "(" + invAmt 
					+ ") Balance=" + bp.getTotalOpenBalance(false) + " -> " + newBalance);				
			}	//	SO
			else
			{
				newBalance = newBalance.add(invAmt);
				//
				if (bp.getFirstSale() == null)
					bp.setFirstSale(getDateInvoiced());
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
				log.fine("GrandTotal=" + getGrandTotal(true) + "(" + invAmt 
					+ ") BP Life=" + bp.getActualLifeTimeValue() + "->" + newLifeAmt
					+ ", Credit=" + bp.getSO_CreditUsed() + "->" + newCreditAmt
					+ ", Balance=" + bp.getTotalOpenBalance(false) + " -> " + newBalance);
				bp.setActualLifeTimeValue(newLifeAmt);
				bp.setSO_CreditUsed(newCreditAmt);				
			}
			bp.setTotalOpenBalance(newBalance);
			bp.setSO_CreditUsed(newCreditUsed);
			bp.setSOCreditStatus();
			if (!bp.save(get_TrxName()))
			{
				return false;
			}			
		}
		return true;
	}

	public BigDecimal getWithholdingPercent()
	{
		BigDecimal percent = Env.ZERO;
		if (this.getWithholdingAmt().signum() > 0)
		{
			percent = getWithholdingAmt().divide(getGrandTotal(), BigDecimal.ROUND_HALF_UP);
			percent = percent.multiply(Env.ONEHUNDRED);
		}
		return percent;
	}
	
	public boolean IsChangebyBOE() {
		Boolean ChangebyBOE = false;
		String sql = "SELECT CASE WHEN COUNT(*)>0 THEN 'Y' ELSE 'N' END FROM C_BOELine WHERE C_Invoice_ID=?";		
		if (DB.getSQLValueString(get_TrxName(), sql, getC_Invoice_ID()).equals("Y"))
		{			
			ChangebyBOE = true;
		}
		return ChangebyBOE;
	}

	
	public static MInvoice getByIdentifier(String identifier, String trxName) {
		MInvoice invoice = new Query(Env.getCtx(), X_C_Invoice.Table_Name, "Identifier=?", trxName)
		.setParameters(identifier)
		.first();
		return invoice;
	}

	public void setProcessMsg(String msg)
	{
		m_processMsg = msg;
	}	
}	//	MInvoice
