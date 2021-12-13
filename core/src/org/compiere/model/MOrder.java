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

import org.compiere.model.persistence.X_C_BPartner_Location;
import org.compiere.model.persistence.X_C_DocType;
import org.compiere.model.persistence.X_C_Invoice;
import org.compiere.model.persistence.X_C_Order;
import org.compiere.model.persistence.X_M_InOut;
import org.compiere.model.reference.REF_C_DocTypeSubType;
import org.compiere.model.reference.REF_C_OrderDeliveryRule;
import org.compiere.model.reference.REF_C_OrderFreightCostRule;
import org.compiere.model.reference.REF_C_OrderInvoiceRule;
import org.compiere.model.reference.REF_C_OrderDeliveryViaRule;
import org.compiere.model.reference.REF__DocumentAction;
import org.compiere.model.reference.REF_C_DocTypeDocBaseType;
import org.compiere.model.reference.REF__DocumentStatus;
import org.compiere.model.reference.REF__PaymentRule;
import org.compiere.model.reference.REF__PriorityRule;
import org.compiere.print.*;
import org.compiere.process.*;
import org.compiere.util.*;
import org.drools.core.io.impl.ClassPathResource;
import org.kie.api.KieBase;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieSession;
import org.kie.internal.KnowledgeBase;
import org.kie.internal.KnowledgeBaseFactory;
import org.kie.internal.builder.KnowledgeBuilder;
import org.kie.internal.builder.KnowledgeBuilderFactory;
import org.kie.internal.runtime.StatefulKnowledgeSession;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xendra.Constants;
import org.xendra.rules.CustomAgendaEventListener;
import org.xendra.rules.CustomWorkingMemoryEventListener;


/**
 *  Order Model.
 * 	Please do not set DocStatus and C_DocType_ID directly. 
 * 	They are set in the process() method. 
 * 	Use DocAction and C_DocTypeTarget_ID instead.
 *
 *  @author Jorg Janke
 *  @version $Id: MOrder.java 5822 2016-06-15 22:56:06Z xapiens $
 */
public class MOrder extends X_C_Order implements DocAction
{
	/**
	 * 	Create new Order by copying
	 * 	@param from order
	 * 	@param dateDoc date of the document date
	 * 	@param C_DocTypeTarget_ID target document type
	 * 	@param isSOTrx sales order 
	 * 	@param counter create counter links
	 *	@param copyASI copy line attributes Attribute Set Instance, Resaouce Assignment
	 * 	@param trxName trx
	 *	@return Order
	 */
	public static MOrder copyFrom (MOrder from, Timestamp dateDoc, 
		int C_DocTypeTarget_ID, boolean isSOTrx, boolean counter, boolean copyASI, 
		String trxName)
	{
		MOrder to = new MOrder (from.getCtx(), 0, trxName);
		to.set_TrxName(trxName);
		PO.copyValues(from, to, from.getAD_Client_ID(), from.getAD_Org_ID());
		to.set_ValueNoCheck ("C_Order_ID", I_ZERO);
		to.set_ValueNoCheck ("DocumentNo", null);
		//
		to.setDocStatus (REF__DocumentStatus.Drafted);		//	Draft
		to.setDocAction(REF__DocumentAction.Complete);
		//
		to.setC_DocType_ID(0);
		to.setC_DocTypeTarget_ID (C_DocTypeTarget_ID);
		to.setIsSOTrx(isSOTrx);
		//
		to.setIsSelected (false);
		to.setDateOrdered (dateDoc);
		to.setDateAcct (dateDoc);
		to.setDatePromised (dateDoc);	//	assumption
		to.setDatePrinted(null);
		to.setIsPrinted (false);
		//
		to.setIsApproved (false);
		to.setIsCreditApproved(false);
		to.setC_Payment_ID(0);
		to.setC_CashLine_ID(0);
		//	Amounts are updated  when adding lines
		to.setGrandTotal(Env.ZERO);
		to.setTotalLines(Env.ZERO);
		//
		to.setIsDelivered(false);
		to.setIsInvoiced(false);
		to.setIsSelfService(false);
		to.setIsTransferred (false);
		to.setPosted (false);
		to.setProcessed (false);
		if (counter)
			to.setRef_Order_ID(from.getC_Order_ID());
		else
			to.setRef_Order_ID(0);
		//
		if (!to.save(trxName))
			throw new IllegalStateException("Could not create Order");
		if (counter)
			from.setRef_Order_ID(to.getC_Order_ID());

		if (to.copyLinesFrom(from, counter, copyASI) == 0)
			throw new IllegalStateException("Could not create Order Lines");
		
		return to;
	}	//	copyFrom

	/**
	 * 	Create new Order by copying
	 * 	@param from order
	 * 	@param dateDoc date of the document date
	 * 	@param C_DocTypeTarget_ID target document type
	 * 	@param isSOTrx sales order 
	 * 	@param counter create counter links
	 *	@param copyASI copy line attributes Attribute Set Instance, Resaouce Assignment
	 * 	@param trxName trx
	 *	@return Order
	 */
	public static MOrder copyFrom (MOrder from, Timestamp dateDoc, 
		int C_DocTypeTarget_ID, boolean isSOTrx, boolean counter, boolean copyASI, 
		boolean includeLines, String trxName )
	{
		return copyFrom (from, dateDoc, 
				C_DocTypeTarget_ID, isSOTrx, counter, copyASI,includeLines, null, trxName );
	}
	
	public static MOrder copyFrom(MOrder order, Timestamp dateOrdered,
			int c_DocTypeTarget_ID, boolean soTrx, boolean counter,
			boolean copyASI, MOrderLine[] lines, String trxName) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 	Create new Order by copying
	 * 	@param from order
	 * 	@param dateDoc date of the document date
	 * 	@param C_DocTypeTarget_ID target document type
	 * 	@param isSOTrx sales order 
	 * 	@param counter create counter links
	 *	@param copyASI copy line attributes Attribute Set Instance, Resaouce Assignment
	 * 	@param trxName trx
	 *	@return Order
	 */
	public static MOrder copyFrom (MOrder from, Timestamp dateDoc, 
		int C_DocTypeTarget_ID, boolean isSOTrx, boolean counter, boolean copyASI, 
		boolean includeLines, MOrderLine[] lines,String trxName )
	{
		MOrder to = new MOrder (from.getCtx(), 0, trxName);
		to.set_TrxName(trxName);
		PO.copyValues(from, to, from.getAD_Client_ID(), from.getAD_Org_ID());
		to.set_ValueNoCheck ("C_Order_ID", I_ZERO);
		to.set_ValueNoCheck ("DocumentNo", null);
		//
		to.setDocStatus (REF__DocumentStatus.Drafted);		//	Draft
		to.setDocAction(REF__DocumentAction.Complete);
		//
		to.setC_DocType_ID(0);
		to.setC_DocTypeTarget_ID (C_DocTypeTarget_ID);
		to.setIsSOTrx(isSOTrx);
		//
		to.setIsSelected (false);
		to.setDateOrdered (dateDoc);
		to.setDateAcct (dateDoc);
		to.setDatePromised (dateDoc);	//	assumption
		to.setDatePrinted(null);
		to.setIsPrinted (false);
		//
		to.setIsApproved (false);
		to.setIsCreditApproved(false);
		to.setC_Payment_ID(0);
		to.setC_CashLine_ID(0);
		//	Amounts are updated  when adding lines
		to.setGrandTotal(Env.ZERO);
		to.setTotalLines(Env.ZERO);
		//
		to.setIsDelivered(false);
		to.setIsInvoiced(false);
		to.setIsSelfService(false);
		to.setIsTransferred (false);
		to.setPosted (false);
		to.setProcessed (false);
		if (counter)
			to.setRef_Order_ID(from.getC_Order_ID());
		else
			to.setRef_Order_ID(0);
		//
		if (!to.save(trxName))
			throw new IllegalStateException("Could not create Order");
		if (counter)
			from.setRef_Order_ID(to.getC_Order_ID());

		if (includeLines)
		{		
			if (to.copyLinesFrom(from, counter, copyASI, lines) == 0)
				throw new IllegalStateException("Could not create Order Lines");
		}
		return to;
	}	//	copyFrom
	
	
	/**************************************************************************
	 *  Default Constructor
	 *  @param ctx context
	 *  @param  C_Order_ID    order to load, (0 create new order)
	 *  @param trxName trx name
	 */
	public MOrder(Properties ctx, int C_Order_ID, String trxName)
	{
		super (ctx, C_Order_ID, trxName);
		//  New
		if (C_Order_ID == 0)
		{
			setDocStatus(REF__DocumentStatus.Drafted);
			setDocAction (REF__DocumentAction.Complete);
			//
			setDeliveryRule (REF_C_OrderDeliveryRule.Availability);
			setFreightCostRule (REF_C_OrderFreightCostRule.FreightIncluded);
			setInvoiceRule (REF_C_OrderInvoiceRule.Immediate);
			setPaymentRule(REF__PaymentRule.OnCredit);
			setPriorityRule (REF__PriorityRule.Medium);
			setDeliveryViaRule (REF_C_OrderDeliveryViaRule.Delivery);
			//
			setIsDiscountPrinted (false);
			setIsSelected (false);
			setIsTaxIncluded (false);
			setIsSOTrx (true);
			setIsDropShip(false);
			setSendEMail (false);
			//
			setIsApproved(false);
			setIsPrinted(false);
			setIsCreditApproved(false);
			setIsDelivered(false);
			setIsInvoiced(false);
			setIsTransferred(false);
			setIsSelfService(false);
			//
			super.setProcessed(false);
			setProcessing(false);
			setPosted(false);

			setDateAcct (new Timestamp(System.currentTimeMillis()));
			setDatePromised (new Timestamp(System.currentTimeMillis()));
			setDateOrdered (new Timestamp(System.currentTimeMillis()));

			setFreightAmt (Env.ZERO);
			setChargeAmt (Env.ZERO);
			setTotalLines (Env.ZERO);
			setGrandTotal (Env.ZERO);
		}
	}	//	MOrder

	/**************************************************************************
	 *  Project Constructor
	 *  @param  project Project to create Order from
	 *  @param IsSOTrx sales order
	 * 	@param	DocSubType if SO DocType Target (default DocSubType_OnCredit)
	 */
	public MOrder (MProject project, boolean IsSOTrx, String DocSubType)
	{
		this (project.getCtx(), 0, project.get_TrxName());
		setAD_Client_ID(project.getAD_Client_ID());
		setAD_Org_ID(project.getAD_Org_ID());
		setC_Campaign_ID(project.getC_Campaign_ID());
		setSalesRep_ID(project.getSalesRep_ID());
		//
		setC_Project_ID(project.getC_Project_ID());
		setDescription(project.getName());
		Timestamp ts = project.getDateContract();
		if (ts != null)
			setDateOrdered (ts);
		ts = project.getDateFinish();
		if (ts != null)
			setDatePromised (ts);
		//
		setC_BPartner_ID(project.getC_BPartner_ID());
		setC_BPartner_Location_ID(project.getC_BPartner_Location_ID());
		setAD_User_ID(project.getAD_User_ID());
		//
		setM_Warehouse_ID(project.getM_Warehouse_ID());
		setM_PriceList_ID(project.getM_PriceList_ID());
		setC_PaymentTerm_ID(project.getC_PaymentTerm_ID());
		//
		setIsSOTrx(IsSOTrx);
		if (IsSOTrx)
		{
			if (DocSubType == null || DocSubType.length() == 0)
				setC_DocTypeTarget_ID(REF_C_DocTypeSubType.OnCreditOrder);
			else
				setC_DocTypeTarget_ID(DocSubType);
		}
		else
			setC_DocTypeTarget_ID();
	}	//	MOrder

	/**
	 *  Load Constructor
	 *  @param ctx context
	 *  @param rs result set record
	 *  @param trxName transaction
	 */
	public MOrder (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MOrder

	/**	Order Lines					*/
	private MOrderLine[] 	m_lines = null;
	/**	Tax Lines					*/
	private MOrderTax[] 	m_taxes = null;
	/** Force Creation of order		*/
	private boolean			m_forceCreation = false;
	
	private int PriceListVersion_ID = 0;
	/**	Process Message 			*/
	private String		m_processMsg = null;
	/**	Just Prepared Flag			*/
	private boolean		m_justPrepared = false;
	private Timestamp dateInOut;
	private Integer InOut_C_DocType_ID;
	private Integer Invoice_C_DocType_ID;
	//private String InvoiceSerial;
	//private String InvoiceDocNumber;
	private String InOutDocNumber = "";
	private BigDecimal taxAmt = BigDecimal.ZERO;
	private BigDecimal taxBaseAmt = BigDecimal.ZERO;
	private String rulestatus;	
	private KieSession ksession;

	public String getRulestatus() {
		return rulestatus;
	}

	public void setRulestatus(String rulestatus) {		
		if (rulestatus.compareTo(DocAction.STATUS_Completed) == 0 || 
			rulestatus.compareTo(DocAction.STATUS_WaitingPayment) == 0 && 
			getProcessMsg() == null)
			setProcessed(true);
		this.rulestatus = rulestatus;
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
	 * 	Set Business Partner (Ship+Bill)
	 *	@param C_BPartner_ID bpartner
	 */
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		super.setC_BPartner_ID (C_BPartner_ID);
		super.setBill_BPartner_ID (C_BPartner_ID);
		super.setPay_BPartner_ID(C_BPartner_ID);
	}	//	setC_BPartner_ID
	
	/**
	 * 	Set Business Partner Location (Ship+Bill)
	 *	@param C_BPartner_Location_ID bp location
	 */
	public void setC_BPartner_Location_ID (int C_BPartner_Location_ID)
	{
		super.setC_BPartner_Location_ID (C_BPartner_Location_ID);
		X_C_BPartner_Location pl = new Query(Env.getCtx(), X_C_BPartner_Location.Table_Name, "C_BPartner_Location_ID = ?", get_TrxName())
			.setParameters(C_BPartner_Location_ID).first();
		if (pl != null) {
			super.setBill_Location_ID(pl.getC_BPartner_Location_ID());
		}
	}	//	setC_BPartner_Location_ID

	/**
	 * 	Set Business Partner Contact (Ship+Bill)
	 *	@param AD_User_ID user
	 */
	public void setAD_User_ID (int AD_User_ID)
	{
		super.setAD_User_ID (AD_User_ID);
		super.setBill_User_ID (AD_User_ID);
	}	//	setAD_User_ID

	/**
	 * 	Set Ship Business Partner
	 *	@param C_BPartner_ID bpartner
	 */
	public void setShip_BPartner_ID (int C_BPartner_ID)
	{
		super.setC_BPartner_ID (C_BPartner_ID);
	}	//	setShip_BPartner_ID
	
	/**
	 * 	Set Ship Business Partner Location
	 *	@param C_BPartner_Location_ID bp location
	 */
	public void setShip_Location_ID (int C_BPartner_Location_ID)
	{
		super.setC_BPartner_Location_ID (C_BPartner_Location_ID);
	}	//	setShip_Location_ID

	/**
	 * 	Set Ship Business Partner Contact
	 *	@param AD_User_ID user
	 */
	public void setShip_User_ID (int AD_User_ID)
	{
		super.setAD_User_ID (AD_User_ID);
	}	//	setShip_User_ID
	
	
	/**
	 * 	Set Warehouse
	 *	@param M_Warehouse_ID warehouse
	 */
	public void setM_Warehouse_ID (int M_Warehouse_ID)
	{
		super.setM_Warehouse_ID (M_Warehouse_ID);
	}	//	setM_Warehouse_ID
	
	/**
	 * 	Set Drop Ship
	 *	@param IsDropShip drop ship
	 */
	public void setIsDropShip (boolean IsDropShip)
	{
		super.setIsDropShip (IsDropShip);
	}	//	setIsDropShip
	
	/**
	 * 	Set Target Sales Document Type
	 * 	@param DocSubType_x sub type - see DocSubType_*
	 */
	public void setC_DocTypeTarget_ID (String DocSubType_x)
	{
		String where = "AD_Client_ID=? AND AD_Org_ID IN (0, ?) AND DocSubType = ?";
		X_C_DocType doctype = new Query(Env.getCtx(), X_C_DocType.Table_Name, where, null)
			.setParameters(getAD_Client_ID(), getAD_Org_ID(), DocSubType_x).setOrderBy("AD_Org_ID DESC, IsDefault DESC").first();
		if (doctype == null) {
			log.severe ("Not found for AD_Client_ID=" + getAD_Client_ID () + ", SubType=" + DocSubType_x);
		}
		else
		{
			log.fine("(SO) - " + DocSubType_x);
			setC_DocTypeTarget_ID(doctype.getC_DocType_ID());
			setIsSOTrx(doctype.isSOTrx());
		}
	}	//	setC_DocTypeTarget_ID

	/**
	 * 	Set Target Document Type.
	 * 	Standard Order or PO
	 */
	public void setC_DocTypeTarget_ID ()
	{
		if (isSOTrx())		//	SO = Std Order
		{
			setC_DocTypeTarget_ID(REF_C_DocTypeSubType.StandardOrder);
			return;
		}
		//	PO
		String sql = "SELECT C_DocType_ID FROM C_DocType "
			+ "WHERE AD_Client_ID=? AND AD_Org_ID IN (0," + getAD_Org_ID()
			+ ") AND DocBaseType='POO' "
			+ "ORDER BY AD_Org_ID DESC, IsDefault DESC";
		int C_DocType_ID = DB.getSQLValue(null, sql, getAD_Client_ID());
		if (C_DocType_ID <= 0)
			log.severe ("No POO found for AD_Client_ID=" + getAD_Client_ID ());
		else
		{
			log.fine("(PO) - " + C_DocType_ID);
			setC_DocTypeTarget_ID (C_DocType_ID);
		}
	}	//	setC_DocTypeTarget_ID


	/**
	 * 	Set Business Partner Defaults & Details.
	 * 	SOTrx should be set.
	 * 	@param bp business partner
	 */
	public void setBPartner (MBPartner bp)
	{
		if (bp == null)
			return;

		setC_BPartner_ID(bp.getC_BPartner_ID());
		//	Defaults Payment Term
		int ii = 0;
		if (isSOTrx())
			ii = bp.getC_PaymentTerm_ID();
		else
			ii = bp.getPO_PaymentTerm_ID();
		if (ii != 0)
			setC_PaymentTerm_ID(ii);
		//	Default Price List
		if (isSOTrx())
			ii = bp.getM_PriceList_ID();
		else
			ii = bp.getPO_PriceList_ID();
		if (ii != 0)
			setM_PriceList_ID(ii);
		//	Default Delivery/Via Rule
		String ss = bp.getDeliveryRule();
		if (ss != null)
			setDeliveryRule(ss);
		ss = bp.getDeliveryViaRule();
		if (ss != null)
			setDeliveryViaRule(ss);
		//	Default Invoice/Payment Rule
		ss = bp.getInvoiceRule();
		if (ss != null)
			setInvoiceRule(ss);
		ss = bp.getPaymentRule();
		if (ss != null)
			setPaymentRule(ss);
		//	Sales Rep
		ii = bp.getSalesRep_ID();
		if (ii != 0)
			setSalesRep_ID(ii);


		//	Set Locations
		MBPartnerLocation[] locs = bp.getLocations(false);
		if (locs != null)
		{
			for (int i = 0; i < locs.length; i++)
			{
				if (locs[i].isShipTo())
					super.setC_BPartner_Location_ID(locs[i].getC_BPartner_Location_ID());
				if (locs[i].isBillTo())
					setBill_Location_ID(locs[i].getC_BPartner_Location_ID());
			}
			//	set to first
			if (getC_BPartner_Location_ID() == 0 && locs.length > 0)
				super.setC_BPartner_Location_ID(locs[0].getC_BPartner_Location_ID());
			if (getBill_Location_ID() == 0 && locs.length > 0)
				setBill_Location_ID(locs[0].getC_BPartner_Location_ID());
		}
		if (getC_BPartner_Location_ID() == 0)
			log.log(Level.SEVERE, "MOrder.setBPartner - Has no Ship To Address: " + bp);
		if (getBill_Location_ID() == 0)
			log.log(Level.SEVERE, "MOrder.setBPartner - Has no Bill To Address: " + bp);

		//	Set Contact
		MUser[] contacts = bp.getContacts(false);
		if (contacts != null && contacts.length == 1)
			setAD_User_ID(contacts[0].getAD_User_ID());
	}	//	setBPartner

	/**
	 * 	Copy Lines From other Order
	 *	@param otherOrder order
	 *	@param counter set counter info
	 *	@param copyASI copy line attributes Attribute Set Instance, Resaouce Assignment
	 *	@return number of lines copied
	 */
	public int copyLinesFrom (MOrder otherOrder, boolean counter, boolean copyASI)
	{
		return copyLinesFrom(otherOrder, counter, copyASI, null);
	}
	/**
	 * 	Copy Lines From other Order
	 *	@param otherOrder order
	 *	@param counter set counter info
	 *	@param copyASI copy line attributes Attribute Set Instance, Resaouce Assignment
	 *	@return number of lines copied
	 */
	public int copyLinesFrom (MOrder otherOrder, boolean counter, boolean copyASI, MOrderLine[] lines)
	{
		if (isProcessed() || isPosted() || otherOrder == null)
			return 0;
		MOrderLine[] fromLines = otherOrder.getLines(false, null);
		int count = 0;
		for (int i = 0; i < fromLines.length; i++)
		{
			if (lines != null)
			{
				boolean goahead = false;
				for (MOrderLine lin:lines)
				{
					if (lin.getC_OrderLine_ID() == fromLines[i].getC_OrderLine_ID())
					{
						goahead = true;
						break;
					}
				}
				if (!goahead)
					continue;
			}
			
			MOrderLine line = new MOrderLine (this);
			
			PO.copyValues(fromLines[i], line, getAD_Client_ID(), getAD_Org_ID());
			line.setC_Order_ID(getC_Order_ID());
			line.setOrder(this);
			line.set_ValueNoCheck ("C_OrderLine_ID", I_ZERO);	//	new
			//	References
			if (!copyASI)
			{
				line.setM_AttributeSetInstance_ID(0);
				line.setS_ResourceAssignment_ID(0);
			}
			if (counter)
				line.setRef_OrderLine_ID(fromLines[i].getC_OrderLine_ID());
			else
				line.setRef_OrderLine_ID(0);
			//
			line.setQtyDelivered(Env.ZERO);
			line.setQtyInvoiced(Env.ZERO);
			line.setQtyReserved(Env.ZERO);
			line.setDateDelivered(null);
			line.setDateInvoiced(null);
			//	Tax
			if (getC_BPartner_ID() != otherOrder.getC_BPartner_ID())
				line.setTax();		//	recalculate
			//
			//
			line.setProcessed(false);
			if (line.save(get_TrxName()))
				count++;
			//	Cross Link
			if (counter)
			{
				fromLines[i].setRef_OrderLine_ID(line.getC_OrderLine_ID());
				fromLines[i].save(get_TrxName());
			}
		}
		if (fromLines.length != count && lines == null)
			log.log(Level.SEVERE, "Line difference - From=" + fromLines.length + " <> Saved=" + count);
		return count;
	}	//	copyLinesFrom

	
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
		ReportEngine re = ReportEngine.get (getCtx(), ReportEngine.ORDER, getC_Order_ID());
		if (re == null)
			return null;
		return re.getPDF(file);
	}	//	createPDF
	
	/**
	 * 	Set Price List (and Currency, TaxIncluded) when valid
	 * 	@param M_PriceList_ID price list
	 */
	public void setM_PriceList_ID (int M_PriceList_ID)
	{	
		MPriceList pl = MPriceList.get(getCtx(), M_PriceList_ID, null);
		if (pl.get_ID() == M_PriceList_ID)
		{
			super.setM_PriceList_ID(M_PriceList_ID);
			setC_Currency_ID(pl.getC_Currency_ID());
			setIsTaxIncluded(pl.isTaxIncluded());
		}
	}	//	setM_PriceList_ID

	public void setM_PriceList_Version_ID ( int M_PriceListVersion_ID)
	{
		PriceListVersion_ID = M_PriceListVersion_ID; 
	}
	
	public int getM_PriceList_Version_ID()
	{
		return PriceListVersion_ID;
	}
	
	/**************************************************************************
	 * 	Get Lines of Order
	 * 	@param whereClause where clause or null (starting with AND)
	 * 	@param orderClause order clause
	 * 	@return lines
	 */
	public MOrderLine[] getLines (String whereClause, String orderClause)
	{
		ArrayList<MOrderLine> list = new ArrayList<MOrderLine> ();
		StringBuffer sql = new StringBuffer("SELECT * FROM C_OrderLine WHERE C_Order_ID=? ");
		if (whereClause != null)
			sql.append(whereClause);
		if (orderClause != null)
			sql.append(" ").append(orderClause);
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement(sql.toString(), get_TrxName());
			pstmt.setInt(1, getC_Order_ID());
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				MOrderLine ol = new MOrderLine(getCtx(), rs, get_TrxName());
				ol.setHeaderInfo (this);
				list.add(ol);
			}
			rs.close();
			pstmt.close();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, sql.toString(), e);
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
		MOrderLine[] lines = new MOrderLine[list.size ()];
		list.toArray (lines);
		return lines;
	}	//	getLines

	/**
	 * 	Get Lines of Order
	 * 	@param requery requery
	 * 	@param orderBy optional order by column
	 * 	@return lines
	 */
	public MOrderLine[] getLines (boolean requery, String orderBy)
	{
		if (m_lines != null && !requery)
			return m_lines;
		//
		String orderClause = "ORDER BY ";
		if (orderBy != null && orderBy.length() > 0)
			orderClause += orderBy;
		else
			orderClause += "Line";
		m_lines = getLines(null, orderClause);
		return m_lines;
	}	//	getLines

	/**
	 * 	Get Lines of Order.
	 * 	(useb by web store)
	 * 	@return lines
	 */
	public MOrderLine[] getLines()
	{
		return getLines(true, null);
	}	//	getLines
	
	/**
	 * 	Renumber Lines
	 *	@param step start and step
	 */
	public void renumberLines (int step)
	{
		int number = step;
		MOrderLine[] lines = getLines(true, null);	//	Line is default
		for (int i = 0; i < lines.length; i++)
		{
			MOrderLine line = lines[i];
			line.setLine(number);
			line.save(get_TrxName());
			number += step;
		}
		m_lines = null;
	}	//	renumberLines
	
	/**
	 * 	Does the Order Line belong to this Order
	 *	@param C_OrderLine_ID line
	 *	@return true if part of the order
	 */
	public boolean isOrderLine(int C_OrderLine_ID)
	{
		if (m_lines == null)
			getLines();
		for (int i = 0; i < m_lines.length; i++)
			if (m_lines[i].getC_OrderLine_ID() == C_OrderLine_ID)
				return true;
		return false;
	}	//	isOrderLine

	/**
	 * 	Get Taxes of Order
	 *	@param requery requery
	 *	@return array of taxes
	 */
	public MOrderTax[] getTaxes(boolean requery)
	{
		if (m_taxes != null && !requery)
			return m_taxes;
		//
		ArrayList<MOrderTax> list = new ArrayList<MOrderTax>();
		String sql = "SELECT * FROM C_OrderTax WHERE C_Order_ID=?";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement(sql, get_TrxName());
			pstmt.setInt(1, getC_Order_ID());
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
				list.add(new MOrderTax(getCtx(), rs, get_TrxName()));
			rs.close();
			pstmt.close();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, "getTaxes", e);
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
		m_taxes = new MOrderTax[list.size ()];
		list.toArray (m_taxes);
		return m_taxes;
	}	//	getTaxes
	
	
	/**
	 * 	Get Invoices of Order
	 * 	@return invoices
	 */
	public MInvoice[] getInvoices()
	{
		ArrayList<MInvoice> list = new ArrayList<MInvoice>();
		String sql = " SELECT DISTINCT i.* FROM C_InvoiceLine il " + 
						"INNER JOIN C_OrderLine ol ON (ol.C_OrderLine_ID = il.C_OrderLine_ID) " +
						"INNER JOIN C_Order o ON (o.C_Order_ID = ol.C_Order_ID) " +
						"INNER JOIN C_Invoice i ON (i.C_Invoice_ID = il.C_Invoice_ID) " +
						"WHERE o.C_Order_ID=? " +  
						"ORDER BY i.Created DESC";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement(sql, get_TrxName());
			pstmt.setInt(1, getC_Order_ID());
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
				list.add(new MInvoice(getCtx(), rs, get_TrxName()));
			rs.close();
			pstmt.close();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, sql, e);
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
		MInvoice[] retValue = new MInvoice[list.size()];
		list.toArray(retValue);
		return retValue;
	}	//	getInvoices

	/**
	 * 	Get latest Invoice of Order
	 * 	@return invoice id or 0
	 */
	public int getDraftC_Invoice_ID()
	{
		int C_Invoice_ID = 0;
		ArrayList list = new ArrayList();
		String sql = "SELECT C_Invoice_ID FROM C_Invoice "
			+ "WHERE C_Order_ID=?  "
			+ "ORDER BY Created DESC";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement(sql, get_TrxName());
			pstmt.setInt(1, getC_Order_ID());
			ResultSet rs = pstmt.executeQuery();
			if (rs.next())
				C_Invoice_ID = rs.getInt(1);
			rs.close();
			pstmt.close();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, "getC_Invoice_ID", e);
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
		return C_Invoice_ID;
	}	//	getC_Invoice_ID
	

	
	/**
	 * 	Get latest Invoice of Order
	 * 	@return invoice id or 0
	 */
	public int getC_Invoice_ID()
	{
			int C_Invoice_ID = 0;
	//		ArrayList list = new ArrayList();
			String sql = "SELECT C_Invoice_ID FROM C_Invoice "
				+ "WHERE C_Order_ID=? AND DocStatus IN ('CO','CL') "
				+ "ORDER BY Created DESC";
			PreparedStatement pstmt = null;
			try
			{
				pstmt = DB.prepareStatement(sql, get_TrxName());
				pstmt.setInt(1, getC_Order_ID());
				ResultSet rs = pstmt.executeQuery();
				if (rs.next())
					C_Invoice_ID = rs.getInt(1);
				rs.close();
				pstmt.close();
				pstmt = null;			
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, "getC_Invoice_ID", e);
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
		return C_Invoice_ID;
	}	//	getC_Invoice_ID


	/**
	 * 	Get Shipments of Order
	 * 	@return shipments
	 */
	public MInOut[] getShipments()
	{
		ArrayList<MInOut> list = new ArrayList<MInOut>();
		String sql = "SELECT DISTINCT io.* FROM M_InOutLine iol " + 
						"INNER JOIN M_InOut io ON (io.M_InOut_ID = iol.M_InOut_ID) " +
						"INNER JOIN C_ORDERLINE ol ON (ol.C_ORDERLINE_ID=iol.C_ORDERLINE_ID) " + 
						"INNER JOIN C_ORDER o ON (o.C_ORDER_ID=ol.C_ORDER_ID) " +
						"WHERE	o.C_ORDER_ID=? " +
						"ORDER BY io.Created DESC";

		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement(sql, get_TrxName());
			pstmt.setInt(1, getC_Order_ID());
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
				list.add(new MInOut(getCtx(), rs, get_TrxName()));
			rs.close();
			pstmt.close();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, sql, e);
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
		MInOut[] retValue = new MInOut[list.size()];
		list.toArray(retValue);
		return retValue;
	}	//	getShipments

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

	/**
	 * 	Get Document Status
	 *	@return Document Status Clear Text
	 */
	public String getDocStatusName()
	{
		return MRefList.getListName(getCtx(), REF__DocumentStatus.Identifier, getDocStatus());
	}	//	getDocStatusName

	/**
	 * 	Set DocAction
	 *	@param DocAction doc action
	 */
	public void setDocAction (String DocAction)
	{
		setDocAction (DocAction, false);
	}	//	setDocAction

	/**
	 * 	Set DocAction
	 *	@param DocAction doc oction
	 *	@param forceCreation force creation
	 */
	public void setDocAction (String DocAction, boolean forceCreation)
	{
		super.setDocAction (DocAction);
		m_forceCreation = forceCreation;
	}	//	setDocAction
	
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
			+ "' WHERE C_Order_ID=" + getC_Order_ID();
		int noLine = DB.executeUpdate("UPDATE C_OrderLine " + set, get_TrxName());
		int noTax = DB.executeUpdate("UPDATE C_OrderTax " + set, get_TrxName());
		m_lines = null;
		m_taxes = null;
		log.fine("setProcessed - " + processed + " - Lines=" + noLine + ", Tax=" + noTax);
	}	//	setProcessed
	
	
	
	/**************************************************************************
	 * 	Before Save
	 *	@param newRecord new
	 *	@return save
	 */
	protected boolean beforeSave (boolean newRecord)
	{
		//	Client/Org Check
		if (getAD_Org_ID() == 0)
		{
			int context_AD_Org_ID = Env.getAD_Org_ID(getCtx());
			if (context_AD_Org_ID != 0)
			{
				setAD_Org_ID(context_AD_Org_ID);
				log.warning("Changed Org to Context=" + context_AD_Org_ID);
			}
		}
		if (getAD_Client_ID() == 0)
		{
			setProcessMsg("AD_Client_ID = 0");
			return false;
		}
		
		//	New Record Doc Type - make sure DocType set to 0
		if (newRecord && getC_DocType_ID() == 0)
			setC_DocType_ID (0);

		//	Default Warehouse
		if (getM_Warehouse_ID() == 0)
		{
			int ii = Env.getContextAsInt(getCtx(), "#M_Warehouse_ID");
			if (ii != 0)
				setM_Warehouse_ID(ii);
			else
			{
				log.saveError("FillMandatory", Msg.getElement(getCtx(), "M_Warehouse_ID"));
				return false;
			}
		}
		//	Warehouse Org
		if (newRecord 
			|| is_ValueChanged("AD_Org_ID") || is_ValueChanged("M_Warehouse_ID"))
		{
			MWarehouse wh = MWarehouse.get(getCtx(), getM_Warehouse_ID());
			if (wh.getAD_Org_ID() != getAD_Org_ID())
				log.saveWarning("WarehouseOrgConflict", "");
		}
		//	Reservations in Warehouse
//		if (!newRecord && is_ValueChanged("M_Warehouse_ID"))
//		{
//			MOrderLine[] lines = getLines(false,null);
//			for (int i = 0; i < lines.length; i++)
//			{
//				if (!lines[i].canChangeWarehouse())
//					return false;
//			}
//		}
		
		//	No Partner Info - set Template
		if (getC_BPartner_ID() == 0)
			setBPartner(MBPartner.getTemplate(getCtx(), getAD_Client_ID()));
		if (getC_BPartner_Location_ID() == 0)
			setBPartner(new MBPartner(getCtx(), getC_BPartner_ID(), null));
		//	No Bill - get from Ship
		if (getBill_BPartner_ID() == 0)
		{
			setBill_BPartner_ID(getC_BPartner_ID());
			setBill_Location_ID(getC_BPartner_Location_ID());
		}
		if (getBill_Location_ID() == 0)
			setBill_Location_ID(getC_BPartner_Location_ID());

		//	Default Price List
		if (getM_PriceList_ID() == 0)
		{
			int ii = DB.getSQLValue(null,
				"SELECT M_PriceList_ID FROM M_PriceList "
				+ "WHERE AD_Client_ID=? AND IsSOPriceList=? "
				+ "ORDER BY IsDefault DESC", getAD_Client_ID(), isSOTrx() ? "Y" : "N");
			if (ii != 0)
				setM_PriceList_ID (ii);
		}
		//	Default Currency
		if (getC_Currency_ID() == 0)
		{
			String sql = "SELECT C_Currency_ID FROM M_PriceList WHERE M_PriceList_ID=?";
			int ii = DB.getSQLValue (null, sql, getM_PriceList_ID());
			if (ii != 0)
				setC_Currency_ID (ii);
			else
				setC_Currency_ID(Env.getContextAsInt(getCtx(), "#C_Currency_ID"));
		}

		//	Default Sales Rep
		if (getSalesRep_ID() == 0)
		{
			int ii = Env.getContextAsInt(getCtx(), "#SalesRep_ID");
			if (ii != 0)
				setSalesRep_ID (ii);
		}

		//	Default Document Type
		if (getC_DocTypeTarget_ID() == 0)
			setC_DocTypeTarget_ID(REF_C_DocTypeSubType.StandardOrder);

		//	Default Payment Term
		if (getC_PaymentTerm_ID() == 0)
		{
			int ii = Env.getContextAsInt(getCtx(), "#C_PaymentTerm_ID");
			if (ii != 0)
				setC_PaymentTerm_ID(ii);
			else
			{
				String sql = "SELECT C_PaymentTerm_ID FROM C_PaymentTerm WHERE AD_Client_ID=? AND IsDefault='Y'";
				ii = DB.getSQLValue(null, sql, getAD_Client_ID());
				if (ii != 0)
					setC_PaymentTerm_ID (ii);
			}
		}
		if (isReturn() && this.getRef_Invoice_ID() == 0)
		{
			return false;
		}		
		return true;
	}	//	beforeSave
	
	
	private Boolean isReturn() {
		MDocType dt = MDocType.get(getCtx(), getC_DocType_ID()==0 ? getC_DocTypeTarget_ID() : getC_DocType_ID());
			return dt.isReturn();
	}

	/**
	 * 	After Save
	 *	@param newRecord new
	 *	@param success success
	 *	@return true if can be saved
	 */
	protected boolean afterSave (boolean newRecord, boolean success)
	{
		if (!success || newRecord)
			return success;
		
		//	Propagate Description changes
		if (is_ValueChanged("Description") || is_ValueChanged("POReference"))
		{
			String sql = "UPDATE C_Invoice SET "
				+ " Description = o.Description,"
				+ " POReference = o.POReference FROM C_Order o "
				+ " WHERE C_Invoice.C_Order_ID = o.C_Order_ID AND C_Invoice.DocStatus NOT IN ('RE','CL') AND C_Invoice.C_Order_ID =" + getC_Order_ID();
			int no = DB.executeUpdate(sql, get_TrxName());
			log.fine("Description -> #" + no);
		}

		//	Propagate Changes of Payment Info to existing (not reversed/closed) invoices
		if (is_ValueChanged("PaymentRule") || is_ValueChanged("C_PaymentTerm_ID")
			|| is_ValueChanged("DateAcct") || is_ValueChanged("C_Payment_ID")
			|| is_ValueChanged("C_CashLine_ID"))
		{			
			String sql = "UPDATE C_Invoice SET " 
			+ "PaymentRule=o.PaymentRule,"
			+ "C_PaymentTerm_ID=o.C_PaymentTerm_ID,"
			+ "DateAcct=o.DateAcct,"
			+ "C_Payment_ID=o.C_Payment_ID,"
			+ "C_CashLine_ID=o.C_CashLine_ID FROM C_Order o " 
			+ "WHERE C_Invoice.C_Order_ID=o.C_Order_ID AND C_Invoice.DocStatus NOT IN ('RE','CL') AND C_Invoice.C_Order_ID="+ getC_Order_ID();
			//	Don't touch Closed/Reversed entries
			int no = DB.executeUpdate(sql, get_TrxName());
			log.fine("Payment -> #" + no);
		}
	      
		//	Sync Lines
		afterSaveSync("AD_Org_ID");
		afterSaveSync("C_BPartner_ID");
		afterSaveSync("C_BPartner_Location_ID");
		afterSaveSync("DateOrdered");
		afterSaveSync("DatePromised");
		afterSaveSync("M_Warehouse_ID");
		afterSaveSync("M_Shipper_ID");
		afterSaveSync("C_Currency_ID");
		//
		return true;
	}	//	afterSave

	private void afterSaveSync (String columnName)
	{
		if (is_ValueChanged(columnName))
		{
			String sql = "UPDATE C_OrderLine ol"
				+ " SET " + columnName + " ="
					+ "(SELECT " + columnName
					+ " FROM C_Order o WHERE ol.C_Order_ID=o.C_Order_ID) "
				+ "WHERE C_Order_ID=" + getC_Order_ID();
			int no = DB.executeUpdate(sql, get_TrxName());
			log.fine(columnName + " Lines -> #" + no);
		}		
	}	//	afterSaveSync
	
	/**
	 * 	Before Delete
	 *	@return true of it can be deleted
	 */
	protected boolean beforeDelete ()
	{
		if (isProcessed())
			return false;
		
		getLines();
		for (int i = 0; i < m_lines.length; i++)
		{
			if (!m_lines[i].beforeDelete())
				return false;
		}
		return true;
	}	//	beforeDelete
	
	/**************************************************************************
	 * 	Process document
	 *	@param processAction document action
	 *	@return true if performed
	 */
	public boolean processIt (String processAction)
	{
		setProcessMsg(null);
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
	}	//	processIt
	
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
		log.info(toString());
		setDocAction(REF__DocumentAction.Prepare);
		return true;
	}	//	invalidateIt
	
	
	public int getLength()
	{
		MOrderLine[] lines = getLines(true, "M_Product_ID");
		return lines.length;
	}
	/**************************************************************************
	 *	Prepare Document
	 * 	@return new status (In Progress or Invalid) 
	 */
	public String prepareIt()
	{						
		log.info(toString());
		setProcessMsg(ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_BEFORE_PREPARE));
		if (getProcessMsg() != null)
			return DocAction.STATUS_Invalid;

		MDocType dt = MDocType.get(getCtx(), getC_DocTypeTarget_ID());
		int AD_Rule_ID = dt.getAD_Rule_ID();		
		KieBase kb = Env.startRule(AD_Rule_ID);
		if (kb != null)
		{
			ksession = kb.newKieSession();
			//ksession.addEventListener(new DebugAgendaEventListener());
			//ksession.addEventListener(new DebugRuleRuntimeEventListener());
			ksession.addEventListener(new CustomAgendaEventListener());
			ksession.addEventListener(new CustomWorkingMemoryEventListener());
			ksession.setGlobal("ctx", Env.getCtx());								
			ksession.insert(this);			
		}		
		else
		{
			setProcessMsg(String.format("%s %s %s", Env.getKieError(AD_Rule_ID), dt.getC_DocType_ID(), dt.getName()));
			if (getProcessMsg() != null)
				return DocAction.STATUS_Invalid;
		}		
		ksession.getAgenda().getAgendaGroup( "prepare" ).setFocus();
		ksession.fireAllRules();		
		ksession.dispose();
		return rulestatus;
//		MDocType dt = MDocType.get(getCtx(), getC_DocTypeTarget_ID());
//
//		//	Std Period open?
//		if (!MPeriod.isOpen(getCtx(), getDateAcct(), dt.getDocBaseType(), getAD_Org_ID()))
//		{
//			m_processMsg = "@PeriodClosed@";
//			return DocAction.STATUS_Invalid;
//		}
//		
//		//	Lines
//		MOrderLine[] lines = getLines(true, "M_Product_ID");
//		if (lines.length == 0)
//		{
//			m_processMsg = "@NoLines@";
//			return DocAction.STATUS_Invalid;
//		}
//		
//		if (!isSOTrx() )
//		{
//			if (REF_C_DocTypeSubType.Request.equals(dt.getDocSubType()))
//			{
//				if (!calculateTaxTotal())
//				{
//					m_processMsg = "Error calculating tax";
//					return DocAction.STATUS_Invalid;
//				}
//				return DocAction.STATUS_InProgress;
//			}
//		}
//		// Bug 1564431
//		if (getDeliveryRule() != null && getDeliveryRule().equals(REF_C_OrderDeliveryRule.CompleteOrder)) 
//		{
//			for (int i = 0; i < lines.length; i++) 
//			{
//				MOrderLine line = lines[i];
//				MProduct product = line.getProduct();
//				if (product != null && product.isExcludeAutoDelivery())
//				{
//					m_processMsg = "@M_Product_ID@ "+product.getValue()+" @IsExcludeAutoDelivery@";
//					return DocAction.STATUS_Invalid;
//				}
//			}
//		}
//		
//		//	Convert DocType to Target
//		if (getC_DocType_ID() != getC_DocTypeTarget_ID() )
//		{
//			//	Cannot change Std to anything else if different warehouses
//			if (getC_DocType_ID() != 0)
//			{
//				MDocType dtOld = MDocType.get(getCtx(), getC_DocType_ID());
//				if (REF_C_DocTypeSubType.StandardOrder.equals(dtOld.getDocSubType())		//	From SO
//					&& !REF_C_DocTypeSubType.StandardOrder.equals(dt.getDocSubType()))	//	To !SO
//				{
//					for (int i = 0; i < lines.length; i++)
//					{
//						if (lines[i].getM_Warehouse_ID() != getM_Warehouse_ID())
//						{
//							log.warning("different Warehouse " + lines[i]);
//							m_processMsg = "@CannotChangeDocType@";
//							return DocAction.STATUS_Invalid;
//						}
//					}
//				}
//			}
//			
//			//	New or in Progress/Invalid
//			if (REF__DocumentStatus.Drafted.equals(getDocStatus()) 
//				|| REF__DocumentStatus.InProgress.equals(getDocStatus())
//				|| REF__DocumentStatus.Invalid.equals(getDocStatus())
//				|| getC_DocType_ID() == 0)
//			{
//				setC_DocType_ID(getC_DocTypeTarget_ID());
//			}
//			else	//	convert only if offer
//			{
//				if (dt.isOffer())
//					setC_DocType_ID(getC_DocTypeTarget_ID());
//				else
//				{
//					m_processMsg = "@CannotChangeDocType@";
//					return DocAction.STATUS_Invalid;
//				}
//			}
//		}	//	convert DocType
//
//		if (isMandatoryAttributes())
//		{
//			m_processMsg = "@LinesWithoutProductAttribute@ ";
//			return DocAction.STATUS_Invalid;
//		}
//
//		//	Lines
//		if (explodeBOM())
//			lines = getLines(true, "M_Product_ID");
//		if (!reserveStock(dt, lines))
//		{
//			m_processMsg = "Cannot reserve Stock";
//			return DocAction.STATUS_Invalid;
//		}
//		if (!calculateTaxTotal())
//		{
//			m_processMsg = "Error calculating tax";
//			return DocAction.STATUS_Invalid;
//		}
//		//	Credit Check
//		if (isSOTrx())
//		{
//			MBPartner bp = new MBPartner (getCtx(), getC_BPartner_ID(), get_TrxName());
//			if (REF_C_BPartnerSOCreditStatus.CreditStop.equals(bp.getSOCreditStatus()))
//			{
//				m_processMsg = "@BPartnerCreditStop@ - @TotalOpenBalance@=" 
//					+ bp.getTotalOpenBalance()
//					+ ", @SO_CreditLimit@=" + bp.getSO_CreditLimit();
//				return DocAction.STATUS_Invalid;
//			}
//			if (REF_C_BPartnerSOCreditStatus.CreditHold.equals(bp.getSOCreditStatus()))
//			{
//				m_processMsg = "@BPartnerCreditHold@ - @TotalOpenBalance@=" 
//					+ bp.getTotalOpenBalance() 
//					+ ", @SO_CreditLimit@=" + bp.getSO_CreditLimit();
//				return DocAction.STATUS_Invalid;
//			}
//			BigDecimal grandTotal = MConversionRate.convertBase(getCtx(), getC_DocType_ID(),  
//				getGrandTotal(), getC_Currency_ID(), getDateOrdered(), 
//				getC_ConversionType_ID(), getAD_Client_ID(), getAD_Org_ID());
//			if (REF_C_BPartnerSOCreditStatus.CreditHold.equals(bp.getSOCreditStatus(grandTotal)))
//			{
//				m_processMsg = "@BPartnerOverOCreditHold@ - @TotalOpenBalance@=" 
//					+ bp.getTotalOpenBalance() + ", @GrandTotal@=" + grandTotal
//					+ ", @SO_CreditLimit@=" + bp.getSO_CreditLimit();
//				return DocAction.STATUS_Invalid;
//			}
//		}
//		
//		m_processMsg = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_AFTER_PREPARE);
//		if (m_processMsg != null)
//			return DocAction.STATUS_Invalid;
//		
//		m_justPrepared = true;
//		return DocAction.STATUS_InProgress;
	}	//	prepareIt
	
	public boolean isMandatoryAttributes() {
		//	Mandatory Product Attribute Set Instance
		String mandatoryType = "='Y'";	//	IN ('Y','S')
		String sql = "SELECT COUNT(*) "
			+ "FROM C_OrderLine ol"
			+ " INNER JOIN M_Product p ON (ol.M_Product_ID=p.M_Product_ID)" 
			+ " INNER JOIN M_AttributeSet pas ON (p.M_AttributeSet_ID=pas.M_AttributeSet_ID) "
			+ "WHERE pas.MandatoryType" + mandatoryType		
			+ " AND ol.M_AttributeSetInstance_ID IS NULL"
			+ " AND ol.C_Order_ID=?";
		int no = DB.getSQLValue(get_TrxName(), sql, getC_Order_ID());
		return no != 0;
	}

	/**
	 * 	Explode non stocked BOM.
	 * 	@return true if bom exploded
	 */
	public boolean explodeBOM()
	{
		boolean retValue = false;
		String where = "AND IsActive='Y' AND EXISTS "
			+ "(SELECT * FROM M_Product p WHERE C_OrderLine.M_Product_ID=p.M_Product_ID"
			+ " AND	p.IsBOM='Y' AND p.IsVerified='Y' AND p.IsStocked='N')";
		//
		String sql = "SELECT COUNT(*) FROM C_OrderLine "
			+ "WHERE C_Order_ID=? " + where; 
		int count = DB.getSQLValue(get_TrxName(), sql, getC_Order_ID());
		while (count != 0)
		{
			retValue = true;
			renumberLines (1000);		//	max 999 bom items	

			//	Order Lines with non-stocked BOMs
			MOrderLine[] lines = getLines (where, "ORDER BY Line");
			for (int i = 0; i < lines.length; i++)
			{
				MOrderLine line = lines[i];
				MProduct product = MProduct.get (getCtx(), line.getM_Product_ID(), get_TrxName());
				log.fine(product.getName());
				//	New Lines
				int lineNo = line.getLine ();
				MProductBOM[] boms = MProductBOM.getBOMLines (product);
				for (int j = 0; j < boms.length; j++)
				{
					MProductBOM bom = boms[j];
					MOrderLine newLine = new MOrderLine (this);
					newLine.setLine (++lineNo);
					newLine.setM_Product_ID (bom.getProduct ()
						.getM_Product_ID ());
					newLine.setC_UOM_ID (bom.getProduct ().getC_UOM_ID ());
					newLine.setQty (line.getQtyOrdered ().multiply (
						bom.getBOMQty ()));
					if (bom.getDescription () != null)
						newLine.setDescription (bom.getDescription ());
					//
					newLine.setPrice ();
					newLine.save (get_TrxName());
				}
				//	Convert into Comment Line
				line.setM_Product_ID (0);
				line.setM_AttributeSetInstance_ID (0);
				line.setPrice (Env.ZERO);
				line.setPriceLimit (Env.ZERO);
				line.setPriceList (Env.ZERO);
				line.setLineNetAmt (Env.ZERO);
				line.setFreightAmt (Env.ZERO);
				//
				String description = product.getName ();
				if (product.getDescription () != null)
					description += " " + product.getDescription ();
				if (line.getDescription () != null)
					description += " " + line.getDescription ();
				line.setDescription (description);
				line.save (get_TrxName());
			}	//	for all lines with BOM

			m_lines = null;		//	force requery
			count = DB.getSQLValue (get_TrxName(), sql, getC_Invoice_ID ());
			renumberLines (10);
		}	//	while count != 0
		return retValue;
	}	//	explodeBOM


	/**
	 * 	Reserve Inventory.
	 * 	Counterpart: MInOut.completeIt()
	 * 	@param dt document type or null
	 * 	@param lines order lines (ordered by M_Product_ID for deadlock prevention)
	 * 	@return true if (un) reserved
	 */
	public boolean reserveStock ()
	{		//MDocType dt, MOrderLine[] lines)
		MPeriod period = MPeriod.get(Env.getCtx(), this.getDateOrdered(), getAD_Org_ID(), getAD_Client_ID());
		if (period == null) {
			setProcessMsg("@PeriodClosed@");
			return false;
		}
		Integer C_Period_ID = period.getC_Period_ID();
		//if (dt == null)
		MDocType dt = MDocType.get(getCtx(), getC_DocType_ID());
		MOrderLine[] lines = getLines(true, "M_Product_ID");
		//	Binding
		boolean binding = !dt.isProposal();
		//	Not binding - i.e. Target=0
		if (REF__DocumentAction.Void.equals(getDocAction())
			//	Closing Binding Quotation
			|| (REF_C_DocTypeSubType.Quotation.equals(dt.getDocSubType()) 
				&& REF__DocumentAction.Close.equals(getDocAction())) 
			|| isDropShip() )
			binding = false;
		boolean isSOTrx = isSOTrx();
		log.fine("Binding=" + binding + " - IsSOTrx=" + isSOTrx);
		//	Force same WH for all but SO/PO
		int header_M_Warehouse_ID = getM_Warehouse_ID();
		if (REF_C_DocTypeSubType.StandardOrder.equals(dt.getDocSubType())
			|| REF_C_DocTypeDocBaseType.PurchaseOrder.equals(dt.getDocBaseType()))
			header_M_Warehouse_ID = 0;		//	don't enforce
		
		BigDecimal Volume = Env.ZERO;
		BigDecimal Weight = Env.ZERO;
		
		//	Always check and (un) Reserve Inventory		
		for (int i = 0; i < lines.length; i++)
		{
			MOrderLine line = lines[i];
			//	Check/set WH/Org
			if (header_M_Warehouse_ID != 0)	//	enforce WH
			{
				if (header_M_Warehouse_ID != line.getM_Warehouse_ID())
					line.setM_Warehouse_ID(header_M_Warehouse_ID);
				if (getAD_Org_ID() != line.getAD_Org_ID())
					line.setAD_Org_ID(getAD_Org_ID());
			}
			//	Binding
			BigDecimal target = binding ? line.getQtyOrdered() : Env.ZERO; 
			BigDecimal difference = target
				.subtract(line.getQtyReserved())
				.subtract(line.getQtyDelivered()); 
			if (difference.signum() == 0)
			{
				MProduct product = line.getProduct();
				if (product != null)
				{
					Volume = Volume.add(product.getVolume().multiply(line.getQtyOrdered()));
					Weight = Weight.add(product.getWeight().multiply(line.getQtyOrdered()));
				}
				continue;
			}
			
			log.fine("Line=" + line.getLine() 
				+ " - Target=" + target + ",Difference=" + difference
				+ " - Ordered=" + line.getQtyOrdered() 
				+ ",Reserved=" + line.getQtyReserved() + ",Delivered=" + line.getQtyDelivered());

			//	Check Product - Stocked and Item
			MProduct product = line.getProduct();
			if (product != null) 
			{
				if (product.isStocked())
				{
					BigDecimal ordered = isSOTrx ? Env.ZERO : difference;
					BigDecimal reserved = isSOTrx ? difference : Env.ZERO;
					int M_Locator_ID = 0; 
					//	Get Locator to reserve
					if (line.getM_AttributeSetInstance_ID() != 0)	//	Get existing Location
						M_Locator_ID = MStorage.getM_Locator_ID (line.getM_Warehouse_ID(), 
							line.getM_Product_ID(), line.getM_AttributeSetInstance_ID(), 
							ordered, get_TrxName());
					//	Get default Location
					if (M_Locator_ID == 0)
					{
						MWarehouse wh = MWarehouse.get(getCtx(), line.getM_Warehouse_ID());
						M_Locator_ID = wh.getDefaultLocator().getM_Locator_ID();
					}
					//	Update Storage
					if (MStorage.add(getCtx(), line.getM_Warehouse_ID(), M_Locator_ID, 
						line.getM_Product_ID(), 
						line.getM_AttributeSetInstance_ID(), line.getM_AttributeSetInstance_ID(),
						Env.ZERO, reserved, ordered, isRealtimePOS(), 						
						//line.get_Table_ID(),
						//line.getC_OrderLine_ID(),
						C_Period_ID,
						"MOrder.reserveStock",						
						get_TrxName()).length() > 0 && getDeliveryRule().equals(REF_C_OrderDeliveryRule.Availability))
						return false;
				}	//	stockec
				//	update line
				line.setQtyReserved(line.getQtyReserved().add(difference));
				if (!line.save(get_TrxName()))
					return false;
				//
				Volume = Volume.add(product.getVolume().multiply(line.getQtyOrdered()));
				Weight = Weight.add(product.getWeight().multiply(line.getQtyOrdered()));
			}	//	product
		}	//	reverse inventory
		
		setVolume(Volume);
		setWeight(Weight);
		return true;
	}	//	reserveStock

	/**
	 * 	Calculate Tax and Total
	 * 	@return true if tax total calculated
	 */
	public boolean calculateTaxTotal()
	{
		log.fine("");
		//	Delete Taxes
		DB.executeUpdate("DELETE FROM C_OrderTax WHERE C_Order_ID=" + getC_Order_ID(), get_TrxName());
		m_taxes = null;
		
		//	Lines
		BigDecimal totalLines = Env.ZERO;
		ArrayList<Integer> taxList = new ArrayList<Integer>();
		MOrderLine[] lines = getLines();
		for (int i = 0; i < lines.length; i++)
		{
			MOrderLine line = lines[i];
			Integer taxID = new Integer(line.getC_Tax_ID());
			if (!taxList.contains(taxID))
			{
				MOrderTax oTax = MOrderTax.get (line, getPrecision(), 
					false, get_TrxName());	//	current Tax
				oTax.setIsTaxIncluded(isTaxIncluded());
				if (!oTax.calculateTaxFromLines())
					return false;
				if (!oTax.save(get_TrxName()))
					return false;
				taxList.add(taxID);
			}
			totalLines = totalLines.add(line.getLineNetAmt());
		}
		
		//	Taxes
		BigDecimal grandTotal = totalLines;
		MOrderTax[] taxes = getTaxes(true);
		for (int i = 0; i < taxes.length; i++)
		{
			MOrderTax oTax = taxes[i];
			MTax tax = oTax.getTax();
			if (tax.isSummary())
			{
				MTax[] cTaxes = tax.getChildTaxes(false);
				for (int j = 0; j < cTaxes.length; j++)
				{
					MTax cTax = cTaxes[j];
					BigDecimal taxAmt = cTax.calculateTax(oTax.getTaxBaseAmt(), isTaxIncluded(), getPrecision());
					//
					MOrderTax newOTax = new MOrderTax(getCtx(), 0, get_TrxName());
					newOTax.setClientOrg(this);
					newOTax.setC_Order_ID(getC_Order_ID());
					newOTax.setC_Tax_ID(cTax.getC_Tax_ID());
					newOTax.setPrecision(getPrecision());
					newOTax.setIsTaxIncluded(isTaxIncluded());
					newOTax.setTaxBaseAmt(oTax.getTaxBaseAmt());
					newOTax.setTaxAmt(taxAmt);
					if (!newOTax.save(get_TrxName()))
						return false;
					//
					if (!isTaxIncluded())
						grandTotal = grandTotal.add(taxAmt);
				}
				if (!oTax.delete(true, get_TrxName()))
					return false;
			}
			else
			{
				if (!isTaxIncluded())
				{
					grandTotal = grandTotal.add(oTax.getTaxAmt());
				}
			}
		}		
		//
		setTotalLines(totalLines);
		setGrandTotal(grandTotal);
		return true;
	}	//	calculateTaxTotal
	
	
	/**
	 * 	Approve Document
	 * 	@return true if success 
	 */
	public boolean  approveIt()
	{
		log.info("approveIt - " + toString());
		setIsApproved(true);
		return true;
	}	//	approveIt
	
	/**
	 * 	Reject Approval
	 * 	@return true if success 
	 */
	public boolean rejectIt()
	{
		log.info("rejectIt - " + toString());
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
		return DocAction.STATUS_Placed;
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
	
	private static StatefulKnowledgeSession getSession( String drl ) {
		//Env.RulesBootstrap();
		KnowledgeBuilder kBuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
		kBuilder.add(new ClassPathResource("org/compiere/model/"+drl), ResourceType.DRL);
		if ( kBuilder.hasErrors() )
		{
			//return DocAction.STATUS_Invalid;
			System.out.println("error");
		}
		KnowledgeBase kBase = KnowledgeBaseFactory.newKnowledgeBase();
		kBase.addKnowledgePackages(kBuilder.getKnowledgePackages());
		return kBase.newStatefulKnowledgeSession();
	}
	
	public boolean IsCreditOrder()
	{
		MDocType dt = MDocType.get(Env.getCtx(), getC_DocTypeTarget_ID());
		String DocSubType = dt.getDocSubType();
		return (REF_C_DocTypeSubType.OnCreditOrder.equals(DocSubType));
	}
	
	public boolean IsWarehouseOrder()
	{
		MDocType dt = MDocType.get(Env.getCtx(), getC_DocTypeTarget_ID());
		String DocSubType = dt.getDocSubType();
		return (REF_C_DocTypeSubType.WarehouseOrder.equals(DocSubType));
	}

	public boolean IsPrePayment() {		
		MDocType dt = MDocType.get(Env.getCtx(), getC_DocTypeTarget_ID());
		String DocSubType = dt.getDocSubType();
		return (REF_C_DocTypeSubType.PrepayOrder.equals(DocSubType));
	}

	public boolean IsQuotation() {		
		MDocType dt = MDocType.get(Env.getCtx(), getC_DocTypeTarget_ID());
		String DocSubType = dt.getDocSubType();
		return (REF_C_DocTypeSubType.Quotation.equals(DocSubType));
	}

	public boolean IsStandard() {
		MDocType dt = MDocType.get(Env.getCtx(), getC_DocTypeTarget_ID());
		String DocSubType = dt.getDocSubType();
		if (DocSubType == null)
			DocSubType = "";
		return (REF_C_DocTypeSubType.StandardOrder.equals(DocSubType));
	}
		
	public boolean IsProposal() {	  
		MDocType dt = MDocType.get(Env.getCtx(), getC_DocTypeTarget_ID());
		String DocSubType = dt.getDocSubType();
		if (DocSubType == null)
			DocSubType = "";
		return (REF_C_DocTypeSubType.Proposal.equals(DocSubType));
	}		
	
	public boolean IsPOSOrder() {
		MDocType dt = MDocType.get(Env.getCtx(), getC_DocTypeTarget_ID());
		String DocSubType = dt.getDocSubType();
		if (DocSubType == null)
			DocSubType = "";
		return (REF_C_DocTypeSubType.POSOrder.equals(DocSubType));		
	}

	public boolean IsReturnMaterial() {
		MDocType dt = MDocType.get(Env.getCtx(), getC_DocTypeTarget_ID());
		String DocSubType = dt.getDocSubType();
		if (DocSubType == null)
			DocSubType = "";		
		return (REF_C_DocTypeSubType.ReturnMaterial.equals(DocSubType));		
	}
	public boolean IsRequest() {
		MDocType dt = MDocType.get(Env.getCtx(), getC_DocTypeTarget_ID());
		String DocSubType = dt.getDocSubType();
		if (DocSubType == null)
			DocSubType = "";		
		return (REF_C_DocTypeSubType.Request.equals(DocSubType));
	}
	public boolean IsPOStandard() {
		MDocType dt = MDocType.get(Env.getCtx(), getC_DocTypeTarget_ID());
		String DocSubType = dt.getDocSubType();
		if (DocSubType == null)
			DocSubType = "";		
		return (REF_C_DocTypeSubType.StandardOrder.equals(DocSubType));
	}
	/**************************************************************************
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
		setProcessMsg(ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_BEFORE_COMPLETE));
		if (getProcessMsg() != null)
		{
			System.out.println("status invalid");
			return DocAction.STATUS_Invalid;
		}		
		MDocType dt = MDocType.get(getCtx(), getC_DocTypeTarget_ID());
		int AD_Rule_ID = dt.getAD_Rule_ID();	
		log.log(Level.WARNING, String.format("ruling order <%s>", getDocumentNo()));
		//System.out.println(String.format("ruling order <%s>", getDocumentNo()));
		KieBase kb = Env.startRule(AD_Rule_ID);
		if (kb != null)
		{
			ksession = kb.newKieSession();
			//ksession.addEventListener(new DebugRuleRuntimeEventListener());
			ksession.addEventListener(new CustomAgendaEventListener());
			ksession.addEventListener(new CustomWorkingMemoryEventListener());			
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
		setRulestatus(DocAction.STATUS_Invalid);		
		ksession.fireAllRules();		
		ksession.dispose();
		return rulestatus;
//		
//		MDocType dt = MDocType.get(getCtx(), getC_DocType_ID());
//		String DocSubType = dt.getDocSubType();
////		
////		//	Just prepare
////		if (REF__DocumentAction.Prepare.equals(getDocAction()))
////		{
////			setProcessed(false);
////			System.out.println("status in progress...");
////			return DocAction.STATUS_InProgress;
////		}
//		//	Offers
//		if (REF_C_DocTypeSubType.Proposal.equals(DocSubType)
//			|| REF_C_DocTypeSubType.Quotation.equals(DocSubType)) 
//		{
//			//	Binding
//			if (REF_C_DocTypeSubTypeSO.Quotation.equals(DocSubTypeSO))
//				//reserveStock(dt, getLines(true, "M_Product_ID"));
//				reserveStock();
//			setProcessed(true);
//			return DocAction.STATUS_Completed;
//		}
//		//	Waiting Payment - until we have a payment
//		if (!m_forceCreation 
//			&& REF_C_DocTypeSubTypeSO.PrepayOrder.equals(DocSubTypeSO) 
//			&& getC_Payment_ID() == 0 && getC_CashLine_ID() == 0)
//		{
//			setProcessed(true);
//			return DocAction.STATUS_WaitingPayment;
//		}
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
//		getLines(true,null);
//		log.info(toString());
//		StringBuffer info = new StringBuffer();
//
//		boolean realTimePOS = false;
//
//		//	Create SO Shipment - Force Shipment
//		// xapiens - agregado returnmaterial.
//		MInOut shipment = null;
//		if (REF_C_DocTypeSubTypeSO.OnCreditOrder.equals(DocSubTypeSO)		//	(W)illCall(I)nvoice
//			|| REF_C_DocTypeSubTypeSO.WarehouseOrder.equals(DocSubTypeSO)	//	(W)illCall(P)ickup	
//			|| REF_C_DocTypeSubTypeSO.POSOrder.equals(DocSubTypeSO)			//	(W)alkIn(R)eceipt
//			|| REF_C_DocTypeSubTypeSO.PrepayOrder.equals(DocSubTypeSO)
//			|| REF_C_DocTypeSubTypeSO.ReturnMaterial.equals(DocSubTypeSO)) 
//		{
//			if (!REF_C_OrderDeliveryRule.Force.equals(getDeliveryRule()))
//				setDeliveryRule(REF_C_OrderDeliveryRule.Force);
//			//
//			//if (MovementType.charAt(1) == '-')	//	C- Customer Shipment - V- Vendor Return
//			//	Qty = Qty.negate();
//			
//			//shipment = createShipment (dt, realTimePOS ? null : getDateOrdered());
//			shipment = createShipment();
//			if (shipment == null)
//				return DocAction.STATUS_Invalid;
//			info.append("@M_InOut_ID@: ").append(shipment.getDocumentNo());
//			setM_InOut_ID(shipment.get_ID());
//			String msg = shipment.getProcessMsg();
//			if (msg != null && msg.length() > 0)
//				info.append(" (").append(msg).append(")");
//		}	//	Shipment
//		
//
//		//	Create SO Invoice - Always invoice complete Order
//		if ( REF_C_DocTypeSubTypeSO.POSOrder.equals(DocSubTypeSO)
//			|| REF_C_DocTypeSubTypeSO.OnCreditOrder.equals(DocSubTypeSO) 	
//			|| REF_C_DocTypeSubTypeSO.PrepayOrder.equals(DocSubTypeSO)
//			|| REF_C_DocTypeSubTypeSO.ReturnMaterial.equals(DocSubTypeSO)) 
//		{
//			//MInvoice invoice = createInvoice (dt, shipment, realTimePOS ? null : getDateOrdered());
//			MInvoice invoice = createInvoice();
//			if (invoice == null)
//				return DocAction.STATUS_Invalid;
//			info.append(" - @C_Invoice_ID@: ").append(invoice.getDocumentNo());
//			String msg = invoice.getProcessMsg();
//			if (msg != null && msg.length() > 0)
//				info.append(" (").append(msg).append(")");
//			if (shipment != null)
//			{
//				shipment.setC_Invoice_ID(invoice.getC_Invoice_ID());
//				shipment.save(get_TrxName());
//			}
//		}	//	Invoice
//		
//		//	Counter Documents
//		MOrder counter = createCounterDoc();
//		if (counter != null)
//			info.append(" - @CounterDoc@: @Order@=").append(counter.getDocumentNo());
//		//	User Validation
//		String valid = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_AFTER_COMPLETE);
//		if (valid != null)
//		{
//			if (info.length() > 0)
//				info.append(" - ");
//			info.append(valid);
//			m_processMsg = info.toString();
//			return DocAction.STATUS_Invalid;
//		}
//
//		setProcessed(true);	
//		m_processMsg = info.toString();
//		//
//		setDocAction(REF__DocumentAction.Close);
//		return DocAction.STATUS_Completed;
	}	//	completeIt
		
	/**
	 * 	Create Shipment
	 *	@param dt order document type
	 *	@param movementDate optional movement date (default today)
	 *	@return shipment or null
	 */
	//private MInOut createShipment(MDocType dt, Timestamp movementDate)

	/**
	 * 	Create Invoice
	 *	@param dt order document type
	 *	@param shipment optional shipment
	 *	@param invoiceDate invoice date
	 *	@return invoice or null
	 */
	//private MInvoice createInvoice (MDocType dt, MInOut shipment, Timestamp invoiceDate)
//	public MInvoice createInvoice ()
//	{
//		MDocType dt = MDocType.get(getCtx(), getC_DocType_ID());	
//		log.info(dt.toString());
//		MInvoice invoice = new MInvoice (this, dt.getC_DocTypeInvoice_ID(), getDateOrdered());
//		if (!invoice.save(get_TrxName()))
//		{
//			m_processMsg = "Could not create Invoice";
//			return null;
//		}
//		MInOut shipment = null;
//		if (this.getM_In_Out() > 0)
//		{
//			shipment = new MInOut(Env.getCtx(), this.getM_In_Out(), get_TrxName());
//		}
//		//	If we have a Shipment - use that as a base
//		if (shipment != null)
//		{
//			if (!REF_C_OrderInvoiceRule.AfterDelivery.equals(getInvoiceRule()))
//				setInvoiceRule(REF_C_OrderInvoiceRule.AfterDelivery);
//			//
//			MInOutLine[] sLines = shipment.getLines(false);
//			for (int i = 0; i < sLines.length; i++)
//			{
//				MInOutLine sLine = sLines[i];
//				//
//				MInvoiceLine iLine = new MInvoiceLine(invoice);
//				iLine.setShipLine(sLine);
//				//	Qty = Delivered	
//				iLine.setQtyEntered(sLine.getQtyEntered());
//				iLine.setQtyInvoiced(sLine.getMovementQty());
//				if (!iLine.save(get_TrxName()))
//				{
//					m_processMsg = "Could not create Invoice Line from Shipment Line";
//					return null;
//				}
//				//
//				sLine.setIsInvoiced(true);
//				if (!sLine.save(get_TrxName()))
//				{
//					log.warning("Could not update Shipment line: " + sLine);
//				}
//			}
//		}
//		else	//	Create Invoice from Order
//		{
//			if (!REF_C_OrderInvoiceRule.Immediate.equals(getInvoiceRule()))
//				setInvoiceRule(REF_C_OrderInvoiceRule.Immediate);
//			//
//			MOrderLine[] oLines = getLines();
//			for (int i = 0; i < oLines.length; i++)
//			{
//				MOrderLine oLine = oLines[i];
//				//
//				MInvoiceLine iLine = new MInvoiceLine(invoice);
//				iLine.setOrderLine(oLine);
//				//	Qty = Ordered - Invoiced	
//				iLine.setQtyInvoiced(oLine.getQtyOrdered().subtract(oLine.getQtyInvoiced()));
//				if (oLine.getQtyOrdered().compareTo(oLine.getQtyEntered()) == 0)
//					iLine.setQtyEntered(iLine.getQtyInvoiced());
//				else
//					iLine.setQtyEntered(iLine.getQtyInvoiced().multiply(oLine.getQtyEntered())
//						.divide(oLine.getQtyOrdered(), 12, BigDecimal.ROUND_HALF_UP));
//				if (!iLine.save(get_TrxName()))
//				{
//					m_processMsg = "Could not create Invoice Line from Order Line";
//					return null;
//				}
//			}
//		}
//		//	Manually Process Invoice
//		String status = invoice.completeIt();
//		invoice.setDocStatus(status);
//		invoice.save(get_TrxName());
//		//setC_CashLine_ID(invoice.getC_CashLine_ID());
//		if (!REF__DocumentStatus.Completed.equals(status))
//		{
//			m_processMsg = "@C_Invoice_ID@: " + invoice.getProcessMsg();
//			return null;
//		}
//		return invoice;
//	}	//	createInvoice
	
	/**
	 * 	Create Counter Document
	 * 	@return counter order
	 */
	private MOrder createCounterDoc()
	{
		//	Is this itself a counter doc ?
		if (getRef_Order_ID() != 0)
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
		MOrder counter = copyFrom (this, getDateOrdered(), 
			C_DocTypeTarget_ID, !isSOTrx(), true, false, get_TrxName());
		//
		counter.setAD_Org_ID(counterAD_Org_ID);
		counter.setM_Warehouse_ID(counterOrgInfo.getM_Warehouse_ID());
		//
		counter.setBPartner(counterBP);
		counter.setDatePromised(getDatePromised());		// default is date ordered 
		//	Refernces (Should not be required
		counter.setSalesRep_ID(getSalesRep_ID());
		counter.save(get_TrxName());
		
		//	Update copied lines
		MOrderLine[] counterLines = counter.getLines(true, null);
		for (int i = 0; i < counterLines.length; i++)
		{
			MOrderLine counterLine = counterLines[i];
			counterLine.setOrder(counter);	//	copies header values (BP, etc.)
			counterLine.setPrice();
			counterLine.setTax();
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
	
	/**
	 * 	Void Document.
	 * 	Set Qtys to 0 - Sales: reverse all documents
	 * 	@return true if success 
	 */
	public boolean voidIt()
	{
		log.info(toString());
		
		// Before Void
		setProcessMsg(ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_VOID));
		if (getProcessMsg() != null)
			return false;

		if (REF__DocumentStatus.Completed.equals(getDocStatus()))
				RestoreIt();
		
		MOrderLine[] lines = getLines(true, "M_Product_ID");
		for (int i = 0; i < lines.length; i++)
		{
			MOrderLine line = lines[i];
			BigDecimal old = line.getQtyOrdered();
			if (old.signum() != 0)
			{
				line.addDescription(Msg.getMsg(getCtx(), "Voided") + " (" + old + ")");
				line.setQty(Env.ZERO);
				line.setLineNetAmt(Env.ZERO);
				line.setPrice(Env.ZERO);
				line.save(get_TrxName());
			}
		}
		addDescription(Msg.getMsg(getCtx(), "Voided"));
		//	Clear Reservations
		//if (!reserveStock(null, lines))
		if (!reserveStock())
		{
			setProcessMsg("Cannot unreserve Stock (void)");
			return false;
		}
		
		if (!createReversals())
			return false;
		
		// After Void
		setProcessMsg(ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_VOID));
		if (getProcessMsg() != null)
			return false;
		
		setProcessed(true);
		setDocAction(REF__DocumentAction.None);
		return true;
	}	//	voidIt
	
	/**
	 * 	Create Shipment/Invoice Reversals
	 * 	@return true if success
	 */
	private boolean createReversals()
	{
		//	Cancel only Sales 
		if (!isSOTrx())
			return true;
		
		log.info("createReversals");
		StringBuffer info = new StringBuffer();
		
		//	Reverse All *Shipments*
		info.append("@M_InOut_ID@:");
		MInOut[] shipments = getShipments();
		for (int i = 0; i < shipments.length; i++)
		{
			MInOut ship = shipments[i];
			//	if closed - ignore
			if (REF__DocumentStatus.Closed.equals(ship.getDocStatus())
				|| REF__DocumentStatus.Reversed.equals(ship.getDocStatus())
				|| REF__DocumentStatus.Voided.equals(ship.getDocStatus()) )
				continue;
			ship.set_TrxName(get_TrxName());
		
			//	If not completed - void - otherwise reverse it
			if (!REF__DocumentStatus.Completed.equals(ship.getDocStatus()))
			{
				if (ship.voidIt())
					ship.setDocStatus(REF__DocumentStatus.Voided);
			}
			else if (ship.reverseCorrectIt())	//	completed shipment
			{
				ship.setDocStatus(REF__DocumentStatus.Reversed);
				info.append(" ").append(ship.getDocumentNo());
			}
			else
			{
				setProcessMsg("Could not reverse Shipment " + ship);
				return false;
			}
			ship.setDocAction(REF__DocumentAction.None);
			ship.save(get_TrxName());
		}	//	for all shipments
			
		//	Reverse All *Invoices*
		info.append(" - @C_Invoice_ID@:");
		MInvoice[] invoices = getInvoices();
		for (int i = 0; i < invoices.length; i++)
		{
			MInvoice invoice = invoices[i];
			//	if closed - ignore
			if (REF__DocumentStatus.Closed.equals(invoice.getDocStatus())
				|| REF__DocumentStatus.Reversed.equals(invoice.getDocStatus())
				|| REF__DocumentStatus.Voided.equals(invoice.getDocStatus()) )
				continue;			
			invoice.set_TrxName(get_TrxName());
			
			//	If not compleded - void - otherwise reverse it
			if (!REF__DocumentStatus.Completed.equals(invoice.getDocStatus()))
			{
				if (invoice.voidIt())
					invoice.setDocStatus(REF__DocumentStatus.Voided);
			}
			else if (invoice.reverseCorrectIt())	//	completed invoice
			{
				invoice.setDocStatus(REF__DocumentStatus.Reversed);
				info.append(" ").append(invoice.getDocumentNo());
			}
			else
			{
				setProcessMsg("Could not reverse Invoice " + invoice);
				return false;
			}
			invoice.setDocAction(REF__DocumentAction.None);
			invoice.save(get_TrxName());
		}	//	for all shipments
		
		setProcessMsg(info.toString());
		return true;
	}	//	createReversals
	
	
	/**
	 * 	Close Document.
	 * 	Cancel not delivered Qunatities
	 * 	@return true if success 
	 */
	public boolean closeIt()
	{
		log.info(toString());
		// Before Close
		setProcessMsg(ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_CLOSE));
		if (getProcessMsg() != null)
			return false;
		
		//	Close Not delivered Qty - SO/PO
		MOrderLine[] lines = getLines(true, "M_Product_ID");
		for (int i = 0; i < lines.length; i++)
		{
			MOrderLine line = lines[i];
			BigDecimal old = line.getQtyOrdered();
			if (old.compareTo(line.getQtyDelivered()) != 0)
			{
				line.setQtyLostSales(line.getQtyOrdered().subtract(line.getQtyDelivered()));
				line.setQtyOrdered(line.getQtyDelivered());
				//	QtyEntered unchanged
				line.addDescription("Close (" + old + ")");
				line.save(get_TrxName());
			}
		}
		//	Clear Reservations
		//if (!reserveStock(null, lines))
		if (!reserveStock())
		{
			setProcessMsg("Cannot unreserve Stock (close)");
			return false;
		}
		// After Close
		setProcessMsg(ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_CLOSE));
		if (getProcessMsg() != null)
			return false;
		
		setProcessed(true);
		setDocAction(REF__DocumentAction.None);
		return true;
	}	//	closeIt
	
	/**
	 * 	Reverse Correction - same void
	 * 	@return true if success 
	 */
	public boolean reverseCorrectIt()
	{
		log.info(toString());
		// Before reverseCorrect
		setProcessMsg(ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_REVERSECORRECT));
		if (getProcessMsg() != null)
			return false;
		
		// After reverseCorrect
		setProcessMsg(ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_REVERSECORRECT));
		if (getProcessMsg() != null)
			return false;
		
		return voidIt();
	}	//	reverseCorrectionIt
	
	/**
	 * 	Reverse Accrual - none
	 * 	@return false 
	 */
	public boolean reverseAccrualIt()
	{
		log.info(toString());
		// Before reverseAccrual
		setProcessMsg(ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_REVERSEACCRUAL));
		if (getProcessMsg() != null)
			return false;
		
		// After reverseAccrual
		setProcessMsg(ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_REVERSEACCRUAL));
		if (getProcessMsg() != null)
			return false;
		
		return false;
	}	//	reverseAccrualIt
	
	/**
	 * 	Re-activate.
	 * 	@return true if success 
	 */
	public boolean reActivateIt()
	{
		log.info(toString());
		// Before reActivate
		setProcessMsg(ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_REACTIVATE));
		if (getProcessMsg() != null)
			return false;	
				
		
		
		MDocType dt = MDocType.get(getCtx(), getC_DocType_ID());
		String DocSubType = dt.getDocSubType();
		
		//	Replace Prepay with POS to revert all doc
		if (REF_C_DocTypeSubType.PrepayOrder.equals (DocSubType))
		{
			MDocType newDT = null;
			MDocType[] dts = MDocType.getOfClient (getCtx());
			for (int i = 0; i < dts.length; i++)
			{
				MDocType type = dts[i];
				if (REF_C_DocTypeSubType.PrepayOrder.equals(type.getDocSubType()))
				{
					if (type.isDefault() || newDT == null)
						newDT = type;
				}
			}
			if (newDT == null)
				return false;
			else
				setC_DocType_ID (newDT.getC_DocType_ID());
		}

		//	PO - just re-open
		if (!isSOTrx())
			log.info("Existing documents not modified - " + dt);
		//	Reverse Direct Documents
		else if (REF_C_DocTypeSubType.OnCreditOrder.equals(DocSubType)	//	(W)illCall(I)nvoice
			|| REF_C_DocTypeSubType.WarehouseOrder.equals(DocSubType)	//	(W)illCall(P)ickup	
			|| REF_C_DocTypeSubType.POSOrder.equals(DocSubType))			//	(W)alkIn(R)eceipt
		{
			if (!createReversals())
				return false;
		}
		else
		{
			log.info("Existing documents not modified - SubType=" + DocSubType);
		}
		// After reActivate
		setProcessMsg(ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_REACTIVATE));
		if (getProcessMsg() != null)
			return false;
		
		setDocAction(REF__DocumentAction.Complete);
		setProcessed(false);
		return true;
	}	//	reActivateIt
	
	
	/*************************************************************************
	 * 	Get Summary
	 *	@return Summary of Document
	 */
	public String getSummary()
	{
		StringBuffer sb = new StringBuffer();
		sb.append(getDocumentNo());
		//	: Grand Total = 123.00 (#1)
		sb.append(": ").
			append(Msg.translate(getCtx(),"GrandTotal")).append("=").append(getGrandTotal());
		if (m_lines != null)
			sb.append(" (#").append(m_lines.length).append(")");
		//	 - Description
		if (getDescription() != null && getDescription().length() > 0)
			sb.append(" - ").append(getDescription());
		return sb.toString();
	}	//	getSummary
	
	public void setProcessMsg(String msg)
	{
		if (m_processMsg == null)
			m_processMsg = msg;
		else
			m_processMsg += msg;
	}
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
	
	public boolean RestoreIt() {
		MDocType dt = MDocType.get(getCtx(), getC_DocType_ID());
		
		if (!MPeriod.isOpen(getCtx(), getDateAcct(), dt.getDocBaseType(), getAD_Org_ID(), getAD_Client_ID()))
		{
			setProcessMsg("@PeriodClosed@");
			return false;
		}
		if (!isRealtimePOS())
		{
			// si tiene facturas, no procede.
			MInvoice[] invoices = getInvoices(); 
			if (invoices.length > 0) {
				setProcessMsg("no es posible restaurar, la orden a sido utilizada en la(s) factura(s) ");
				for (MInvoice invoice:invoices)
				{
					setProcessMsg(invoice.toString() + " ");
				}
				return false;
			}
		}
		
		MOrderLine lines[] = getLines();
		
		String MsgError = "No es posible restaurar debido a  que ";
		String DelivInvoiced = "";
		for (int i = 0; i < lines.length; i++)
		{
			MOrderLine line = lines[i];			
			if ( line.getQtyDelivered().compareTo(Env.ZERO) > 0 ||
				 line.getQtyInvoiced().compareTo(Env.ZERO) > 0 )
			{
				MProduct p = MProduct.get(Env.getCtx(), line.getM_Product_ID(), get_TrxName());
				if (line.getQtyDelivered().compareTo(Env.ZERO) > 0)
					DelivInvoiced += " se entrego "+line.getQtyDelivered().setScale(2, BigDecimal.ROUND_HALF_UP)+" de "+p.getName();
				if (line.getQtyInvoiced().compareTo(Env.ZERO) > 0)
					DelivInvoiced += " se facturo "+line.getQtyDelivered().setScale(2, BigDecimal.ROUND_HALF_UP)+" de "+p.getName();
			}
		}
		if (DelivInvoiced.length()  >  0)
		{
			setProcessMsg(MsgError + DelivInvoiced);
			return false;			
		}
//		if (getShipments().length > 0) {
//			return false;
//		}
		if (!dereserveStock(dt, lines))
			return false;
		
		String sql;
		for (int i = 0; i < lines.length; i++) {
//			sql = "DELETE FROM M_CostDetail WHERE C_OrderLine_ID=" + lines[i].get_ID();
//			DB.executeUpdate(sql, get_TrxName());

			lines[i].setProcessed(false);
			lines[i].save();

		}
		setDocStatus(REF__DocumentStatus.Drafted);
		setDocAction(REF__DocumentAction.Complete);
		setProcessing(false);
		setProcessed(false);
		setPosted(false);
		save(get_TrxName());
		return true;
	}
	
	private boolean dereserveStock(MDocType dt, MOrderLine lines[]) {
		if (dt == null)
			dt = MDocType.get(getCtx(), getC_DocType_ID());
		Integer C_Period_ID = MPeriod.get(Env.getCtx(), getDateOrdered(), getAD_Org_ID(), getAD_Client_ID()).getC_Period_ID();
		//	Binding
		boolean binding = !dt.isProposal();
		//	Not binding - i.e. Target=0
		if (REF__DocumentAction.Void.equals(getDocAction())
			//	Closing Binding Quotation
			|| (REF_C_DocTypeSubType.Quotation.equals(dt.getDocSubType()) 
				&& REF__DocumentAction.Close.equals(getDocAction())) 
			|| isDropShip() )
			binding = false;
		boolean isSOTrx = isSOTrx();
		log.fine("Binding=" + binding + " - IsSOTrx=" + isSOTrx);
		
		//	Always check and (un) Reserve Inventory		
		for (int i = 0; i < lines.length; i++)
		{
			MOrderLine line = lines[i];
			
			if ( line.getQtyDelivered().compareTo(Env.ZERO) > 0 ||
				 line.getQtyInvoiced().compareTo(Env.ZERO) > 0 )
			{
				
			}
			//	Binding
			BigDecimal target = binding ? line.getQtyOrdered() : Env.ZERO; 
			BigDecimal difference = line.getQtyOrdered(); 
			
			log.fine("Line=" + line.getLine() 
				+ " - Target=" + target + ",Difference=" + difference
				+ " - Ordered=" + line.getQtyOrdered() 
				+ ",Reserved=" + line.getQtyReserved() + ",Delivered=" + line.getQtyDelivered());

			//	Check Product - Stocked and Item
			MProduct product = line.getProduct();
			if (product != null) 
			{
				if (product.isStocked())
				{
					BigDecimal ordered = isSOTrx ? Env.ZERO : difference;
					BigDecimal reserved = isSOTrx ? difference : Env.ZERO;
					int M_Locator_ID = 0; 
					//	Get Locator to reserve
					if (line.getM_AttributeSetInstance_ID() != 0)	//	Get existing Location
						M_Locator_ID = MStorage.getM_Locator_ID (line.getM_Warehouse_ID(), 
							line.getM_Product_ID(), line.getM_AttributeSetInstance_ID(), 
							ordered, get_TrxName());
					//	Get default Location
					if (M_Locator_ID == 0)
					{
						MWarehouse wh = MWarehouse.get(getCtx(), line.getM_Warehouse_ID());
						M_Locator_ID = wh.getDefaultLocator().getM_Locator_ID();
					}
					//	Update Storage
					if (MStorage.add(getCtx(), line.getM_Warehouse_ID(), M_Locator_ID, 
						line.getM_Product_ID(), 
						line.getM_AttributeSetInstance_ID(), line.getM_AttributeSetInstance_ID(),
						Env.ZERO, reserved.negate(), ordered.negate(), isRealtimePOS(),						
						//line.get_Table_ID(), line.getC_OrderLine_ID(),
						C_Period_ID,
						"Morder.dereserveStock",
						get_TrxName()).length() > 0 && getDeliveryRule().equals(REF_C_OrderDeliveryRule.Availability))
						return false;
				}	//	stockec
				//	update line
				line.setQtyReserved(line.getQtyReserved().subtract(difference));
				if (!line.save(get_TrxName()))
					return false;
			}	//	product
		}	//	reverse inventory
		
		return true;
	}
	public void setDateInOut(Timestamp dateInOut)
	{
		this.dateInOut = dateInOut;
	}	
	public Timestamp getDateInOut()
	{
		return dateInOut;
	}
//	public void setInOut_C_DocType_ID(Integer InOutC_DocType_ID)
//	{
//		this.InOut_C_DocType_ID = InOutC_DocType_ID;
//	}
//	public Integer getInOut_C_DocType_ID()
//	{
//		return InOut_C_DocType_ID;
//	}
//	public void setInvoice_C_DocType_ID(Integer InvoiceC_DocType_ID)
//	{
//		this.Invoice_C_DocType_ID = InvoiceC_DocType_ID;
//	}
//	public Integer getInvoice_C_DocType_ID()
//	{
//		return Invoice_C_DocType_ID;
//	}
//	public void setInvoiceSerial(String serial)
//	{
//		InvoiceSerial = serial;
//	}
//	public String getInvoiceSerial()
//	{
//		return InvoiceSerial;
//	}	
//	public void setInvoiceDocNumber(String docnumber)
//	{
//		InvoiceDocNumber = docnumber;
//	}	
//	public String getInvoiceDocNumber()
//	{
//		return InvoiceDocNumber;
//	}	
	public void setInOutDocNumber(String docnumber)
	{
		InOutDocNumber = docnumber;
	}
	public String getInOutDocNumber()
	{
		return InOutDocNumber;
	}

	public void setTaxBaseAmt(BigDecimal taxBaseAmt) {
		this.taxBaseAmt = taxBaseAmt;
	}
	
	public BigDecimal getTaxBaseAmt()
	{
		return taxBaseAmt;
	}
	
	public void setTaxAmt(BigDecimal taxAmt) {
		this.taxAmt = taxAmt;
	}	
	
	public BigDecimal getTaxAmt()
	{
		return taxAmt;
	}
	
	public Element getXMLElement(Document document) {		
		try 
		{
			Element order = document.createElement(Constants.XML_ATTRIBUTE_POP);
			//order.setAttribute("InOut_C_DocType_ID", String.valueOf(getInOut_C_DocType_ID()));
			//order.setAttribute("Invoice_C_DocType_ID", String.valueOf(getInvoice_C_DocType_ID()));		
			//order.setAttribute("InvoiceSerial", getInvoiceSerial());
			//order.setAttribute("InvoiceDocNumber", getInvoiceDocNumber());
			order.setAttribute(X_C_Order.COLUMNNAME_SerialToInvoice, getSerialToInvoice());
			order.setAttribute(X_C_Order.COLUMNNAME_DocumentNoToInvoice, getDocumentNoToInvoice());
			order.setAttribute("InOutDocNumber", getInOutDocNumber());
			order.setAttribute(X_C_Order.COLUMNNAME_M_Warehouse_ID, String.valueOf(getM_Warehouse_ID()));
			order.setAttribute(X_C_Order.COLUMNNAME_M_PriceList_ID, String.valueOf(getM_PriceList_ID()));
			order.setAttribute(X_C_Order.COLUMNNAME_SalesRep_ID, String.valueOf(getSalesRep_ID()));
			order.setAttribute(X_C_Order.COLUMNNAME_C_Contact_ID, String.valueOf(getC_Contact_ID()));
			order.setAttribute(X_C_Order.COLUMNNAME_DateOrdered, getDateOrdered().toString());			
			order.setAttribute(X_C_Order.COLUMNNAME_DatePromised, getDatePromised().toString());
			order.setAttribute(X_C_Order.COLUMNNAME_DateAcct, getDateAcct().toString());
			order.setAttribute(X_M_InOut.COLUMNNAME_DateReceived, getDateInOut().toString());
			order.setAttribute(X_C_Invoice.COLUMNNAME_DateInvoiced, getDateInvoiced().toString());
			if (getC_DocTypeTarget_ID() <= 0)
				order.setAttribute(X_C_Order.COLUMNNAME_C_DocTypeTarget_ID, String.valueOf(REF_C_DocTypeSubType.Proposal));
			else
				order.setAttribute(X_C_Order.COLUMNNAME_C_DocTypeTarget_ID, String.valueOf(getC_DocTypeTarget_ID()));
			order.setAttribute(X_C_Order.COLUMNNAME_C_DocType_ID,String.valueOf(getC_DocType_ID()));
			if (getC_PaymentTerm_ID() != 0)
				order.setAttribute(X_C_Order.COLUMNNAME_C_PaymentTerm_ID, String.valueOf(getC_PaymentTerm_ID()));
			else
			{
				int ii = Env.getContextAsInt(Env.getCtx(), "#C_PaymentTerm_ID");
				if (ii != 0)
					order.setAttribute(X_C_Order.COLUMNNAME_C_PaymentTerm_ID,String.valueOf(ii));
				else
				{
					String sql = "SELECT C_PaymentTerm_ID FROM C_PaymentTerm WHERE AD_Client_ID=? AND IsDefault='Y'";
					ii = DB.getSQLValue(null, sql, getAD_Client_ID());
					if (ii != 0)
						order.setAttribute(X_C_Order.COLUMNNAME_C_PaymentTerm_ID,String.valueOf(ii));
				}
			}
			order.setAttribute(X_C_Order.COLUMNNAME_PaymentRule,			getPaymentRule());
			order.setAttribute(X_C_Order.COLUMNNAME_InvoiceRule,			getInvoiceRule());
			order.setAttribute(X_C_Order.COLUMNNAME_DeliveryRule,			getDeliveryRule());
			order.setAttribute(X_C_Order.COLUMNNAME_FreightCostRule,		getFreightCostRule());
			order.setAttribute(X_C_Order.COLUMNNAME_DeliveryViaRule,		getDeliveryViaRule());
			order.setAttribute(X_C_Order.COLUMNNAME_IsDiscountPrinted,		isDiscountPrinted() ? "Y" : "N");
			order.setAttribute(X_C_Order.COLUMNNAME_IsTaxIncluded,			isTaxIncluded() ? "Y" : "N");
			order.setAttribute(X_C_Order.COLUMNNAME_Bill_Location_ID, 		String.valueOf(getBill_Location_ID()));
			order.setAttribute(X_C_Order.COLUMNNAME_C_BPartner_ID, 			String.valueOf(getC_BPartner_ID()));
			order.setAttribute(X_C_Order.COLUMNNAME_C_BPartner_Location_ID,	String.valueOf(getC_BPartner_Location_ID()));
			order.setAttribute(X_C_Order.COLUMNNAME_AD_User_ID,				String.valueOf(getAD_User_ID()));
			order.setAttribute(X_C_Order.COLUMNNAME_Bill_User_ID,			String.valueOf(getBill_User_ID()));
			order.setAttribute(X_C_Order.COLUMNNAME_C_Currency_ID,			String.valueOf(getC_Currency_ID()));
			order.setAttribute(X_C_Order.COLUMNNAME_Bill_BPartner_ID,		String.valueOf(getBill_BPartner_ID()));
			order.setAttribute(X_C_Order.COLUMNNAME_Description,			getDescription());
			order.setAttribute(X_C_Order.COLUMNNAME_C_BPartner_Points_ID,	String.valueOf(getC_BPartner_Points_ID()));
			order.setAttribute(X_C_Order.COLUMNNAME_POReference,			getPOReference());		
			return order;
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	/**************************************************************************
	 * 	String Representation
	 *	@return info
	 */
	public String toString ()
	{
		StringBuffer sb = new StringBuffer ("MOrder[")
			.append(get_ID()).append("-").append(getDocumentNo())
			.append(",DeliveryRule=").append(getDeliveryRule())
			.append(",C_BPartner_ID=").append(getC_BPartner_ID())
			.append(",Warehouse=").append(getM_Warehouse_ID())
			.append(",IsSOTrx=").append(isSOTrx())
			.append(",C_DocType_ID=").append(getC_DocType_ID())
			.append(",Identifier=").append(getIdentifier())
			.append(", GrandTotal=").append(getGrandTotal())
			.append ("]");
		return sb.toString ();
	}	//	toString

	private BigDecimal grossTotal = BigDecimal.ZERO;

	public BigDecimal getGrossTotal() {
		return grossTotal;
	}

	public void setGrossTotal(BigDecimal grossTotal) {
		this.grossTotal = grossTotal;
	}	
}	//	MOrder