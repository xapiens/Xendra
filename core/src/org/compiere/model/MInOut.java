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
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;

import org.compiere.acct.Doc;
import org.compiere.acct.Doc_InOut;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.persistence.X_C_Order;
import org.compiere.model.persistence.X_C_Period;
import org.compiere.model.persistence.X_M_CostCalc;
import org.compiere.model.persistence.X_M_InOut;
import org.compiere.model.persistence.X_M_InOutLine;
import org.compiere.model.persistence.X_M_Product_Costing;
import org.compiere.model.persistence.X_M_Transaction;
import org.compiere.model.reference.REF_C_BPartnerSOCreditStatus;
import org.compiere.model.reference.REF_C_OrderDeliveryRule;
import org.compiere.model.reference.REF_C_OrderDeliveryViaRule;
import org.compiere.model.reference.REF_C_OrderFreightCostRule;
import org.compiere.model.reference.REF_M_InOutConfirmType;
import org.compiere.model.reference.REF_M_TransactionMovementType;
import org.compiere.model.reference.REF__DocumentAction;
import org.compiere.model.reference.REF_C_DocTypeDocBaseType;
import org.compiere.model.reference.REF__DocumentStatus;
import org.compiere.model.reference.REF__MMPolicy;
import org.compiere.model.reference.REF__PriorityRule;
import org.compiere.print.ReportEngine;
import org.compiere.process.DocAction;
import org.compiere.process.DocumentEngine;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.kie.api.KieBase;
import org.kie.api.event.rule.DebugAgendaEventListener;
import org.kie.api.event.rule.DebugRuleRuntimeEventListener;
import org.kie.api.runtime.KieSession;
import org.xendra.Constants;
import org.xendra.exceptions.XendraException;
import org.xendra.rules.CustomAgendaEventListener;
import org.xendra.rules.CustomWorkingMemoryEventListener;

/**
 * Shipment Model
 * 
 * @author Jorg Janke
 * @version $Id: MInOut.java 5822 2016-06-15 22:56:06Z xapiens $
 */
public class MInOut extends X_M_InOut implements DocAction {
	/** Lines */
	private MInOutLine[] m_lines = null;
	/** Confirmations */
	private MInOutConfirm[] m_confirms = null;
	/** BPartner */
	private MBPartner m_partner = null;
	private String rulestatus = DocAction.STATUS_Invalid;
	private KieSession ksession;
	/**
	 * Create Shipment From Order
	 * 
	 * @param order
	 *            order
	 * @param movementDate
	 *            optional movement date
	 * @param forceDelivery
	 *            ignore order delivery rule
	 * @param allAttributeInstances
	 *            if true, all attribute set instances
	 * @param minGuaranteeDate
	 *            optional minimum guarantee date if all attribute instances
	 * @param complete
	 *            complete document (Process if false, Complete if true)
	 * @param trxName
	 *            transaction
	 * @return Shipment or null
	 */
	public static MInOut createFrom(MOrder order, Timestamp movementDate,
			boolean forceDelivery, boolean allAttributeInstances,
			Timestamp minGuaranteeDate, boolean complete, String trxName) {
		if (order == null)
			throw new IllegalArgumentException("No Order");
		//
		if (!forceDelivery
				&& REF_C_OrderDeliveryRule.CompleteLine.equals(order.getDeliveryRule())) {
			return null;
		}

		// Create Meader
		MInOut retValue = new MInOut(order, 0, movementDate);
		retValue
				.setDocAction(complete ? REF__DocumentAction.Complete : REF__DocumentAction.Prepare);

		// Check if we can create the lines
		MOrderLine[] oLines = order.getLines(true, "M_Product_ID");
		for (int i = 0; i < oLines.length; i++) {
			BigDecimal qty = oLines[i].getQtyOrdered().subtract(
					oLines[i].getQtyDelivered());
			// Nothing to deliver
			if (qty.signum() == 0)
				continue;
			// Stock Info
			MStorage[] storages = null;
			MProduct product = oLines[i].getProduct();
			if (product != null && product.get_ID() != 0 && product.isStocked()) {
				MProductCategory pc = MProductCategory.get(order.getCtx(),
						product.getM_Product_Category_ID());
				String MMPolicy = pc.getMMPolicy();
				if (MMPolicy == null || MMPolicy.length() == 0) {
					MClient client = MClient.get(order.getCtx());
					MMPolicy = client.getMMPolicy();
				}
				storages = MStorage.getWarehouse(order.getCtx(), order
						.getM_Warehouse_ID(), oLines[i].getM_Product_ID(),
						oLines[i].getM_AttributeSetInstance_ID(), product
								.getM_AttributeSet_ID(), allAttributeInstances,
						minGuaranteeDate, REF__MMPolicy.FiFo.equals(MMPolicy), trxName);
			}
			if (!forceDelivery) {
				BigDecimal maxQty = Env.ZERO;
				for (int ll = 0; ll < storages.length; ll++)
					maxQty = maxQty.add(storages[ll].getQtyOnHand());
				if (REF_C_OrderDeliveryRule.Availability.equals(order.getDeliveryRule())) {
					if (maxQty.compareTo(qty) < 0)
						qty = maxQty;
				} else if (REF_C_OrderDeliveryRule.CompleteLine.equals(order
						.getDeliveryRule())) {
					if (maxQty.compareTo(qty) < 0)
						continue;
				}
			}
			// Create Line
			if (retValue.get_ID() == 0) // not saved yet
				retValue.save(trxName);
			// Create a line until qty is reached
			for (int ll = 0; ll < storages.length; ll++) {
				BigDecimal lineQty = storages[ll].getQtyOnHand();
				if (lineQty.compareTo(qty) > 0)
					lineQty = qty;
				MInOutLine line = new MInOutLine(retValue);
				line.setOrderLine(oLines[i], storages[ll].getM_Locator_ID(),
						order.isSOTrx() ? lineQty : Env.ZERO);
				line.setQty(lineQty); // Correct UOM for QtyEntered
				if (oLines[i].getQtyEntered().compareTo(
						oLines[i].getQtyOrdered()) != 0)
					line.setQtyEntered(lineQty.multiply(
							oLines[i].getQtyEntered()).divide(
							oLines[i].getQtyOrdered(), 12,
							BigDecimal.ROUND_HALF_UP));
				line.setC_Project_ID(oLines[i].getC_Project_ID());
				line.save(trxName);
				// Delivered everything ?
				qty = qty.subtract(lineQty);
				// storage[ll].changeQtyOnHand(lineQty, !order.isSOTrx()); //
				// Credit Memo not considered
				// storage[ll].save(get_TrxName());
				if (qty.signum() == 0)
					break;
			}
		} // for all order lines

		// No Lines saved
		if (retValue.get_ID() == 0)
			return null;

		return retValue;
	} // createFrom

	/**
	 * Create new Shipment by copying
	 * 
	 * @param from
	 *            shipment
	 * @param dateDoc
	 *            date of the document date
	 * @param C_DocType_ID
	 *            doc type
	 * @param isSOTrx
	 *            sales order
	 * @param counter
	 *            create counter links
	 * @param trxName
	 *            trx
	 * @param setOrder
	 *            set the order link
	 * @return Shipment
	 */
	public static MInOut copyFrom(MInOut from, Timestamp dateDoc,
			int C_DocType_ID, boolean isSOTrx, boolean counter, String trxName,
			boolean setOrder) {
		MInOut to = new MInOut(from.getCtx(), 0, null);
		to.set_TrxName(trxName);
		copyValues(from, to, from.getAD_Client_ID(), from.getAD_Org_ID());
		to.set_ValueNoCheck("M_InOut_ID", I_ZERO);
		to.set_ValueNoCheck("DocumentNo", null);
		//
		to.setDocStatus(REF__DocumentStatus.Drafted); // Draft
		to.setDocAction(REF__DocumentAction.Complete);
		//
		to.setC_DocType_ID(C_DocType_ID);
		
		
		// Asi no debe ser , este campo debe depender del doctype, lo dejo
		// alli pero parcho mas abajo.
		to.setIsSOTrx(isSOTrx);
		
		if (counter) {
			//to.setMovementType(isSOTrx ? REF_M_TransactionMovementType.CustomerShipment
			//		: REF_M_TransactionMovementType.VendorReceipts);
			MDocType.get(from.getCtx(), C_DocType_ID).getDocBaseType();
			if (MDocType.get(from.getCtx(), C_DocType_ID).getDocBaseType().equals(REF_C_DocTypeDocBaseType.MaterialReturnOfVendor)) {
				to.setMovementType(REF_M_TransactionMovementType.VendorReturns);
				to.setIsSOTrx(false);
			} else if (MDocType.get(from.getCtx(), C_DocType_ID).getDocBaseType().equals(REF_C_DocTypeDocBaseType.MaterialReturnOfCustomer)) {
				to.setMovementType(REF_M_TransactionMovementType.CustomerReturns);
				to.setIsSOTrx(true);
			} else if (MDocType.get(from.getCtx(), C_DocType_ID).getDocBaseType().equals(REF_C_DocTypeDocBaseType.MaterialDelivery)) {
				to.setMovementType(REF_M_TransactionMovementType.CustomerShipment);
				to.setIsSOTrx(true);
			}else if (MDocType.get(from.getCtx(), C_DocType_ID).getDocBaseType().equals(REF_C_DocTypeDocBaseType.MaterialReceipt)) {
				to.setMovementType(REF_M_TransactionMovementType.VendorReceipts);
				to.setIsSOTrx(false);
			}			
		}
		//
		to.setDateOrdered(dateDoc);
		to.setDateAcct(dateDoc);
		to.setMovementDate(dateDoc);
		to.setDatePrinted(null);
		to.setIsPrinted(false);
		to.setDateReceived(null);
		to.setNoPackages(0);
		to.setShipDate(null);
		to.setPickDate(null);
		to.setIsInTransit(false);
		//
		to.setIsApproved(false);
		to.setC_Invoice_ID(0);
		to.setTrackingNo(null);
		to.setIsInDispute(false);
		//
		to.setPosted(false);
		to.setProcessed(false);
		to.setFact_ID("");
		// [ 1633721 ] Reverse Documents- Processing=Y
		to.setProcessing(false);
		to.setC_Order_ID(0); // Overwritten by setOrder
		if (counter) {
			to.setC_Order_ID(0);
			to.setRef_InOut_ID(from.getM_InOut_ID());
			// Try to find Order/Invoice link
			if (from.getC_Order_ID() != 0) {
				MOrder peer = new MOrder(from.getCtx(), from.getC_Order_ID(),
						from.get_TrxName());
				if (peer.getRef_Order_ID() != 0)
					to.setC_Order_ID(peer.getRef_Order_ID());
			}
			if (from.getC_Invoice_ID() != 0) {
				MInvoice peer = new MInvoice(from.getCtx(), from
						.getC_Invoice_ID(), from.get_TrxName());
				if (peer.getRef_Invoice_ID() != 0)
					to.setC_Invoice_ID(peer.getRef_Invoice_ID());
			}
		} else {
			to.setRef_InOut_ID(0);
			if (setOrder)
				to.setC_Order_ID(from.getC_Order_ID());
		}
		//
		if (!to.save(trxName))
			throw new IllegalStateException("Could not create Shipment");
		if (counter)
			from.setRef_InOut_ID(to.getM_InOut_ID());

		if (to.copyLinesFrom(from, counter, setOrder) == 0)
			throw new IllegalStateException("Could not create Shipment Lines");

		return to;
	} // copyFrom

	/**************************************************************************
	 * Standard Constructor
	 * 
	 * @param ctx
	 *            context
	 * @param M_InOut_ID
	 * @param trxName
	 *            rx name
	 */
	public MInOut(Properties ctx, int M_InOut_ID, String trxName) {
		super(ctx, M_InOut_ID, trxName);
		if (M_InOut_ID == 0) {
			// setDocumentNo (null);
			// setC_BPartner_ID (0);
			// setC_BPartner_Location_ID (0);
			// setM_Warehouse_ID (0);
			// setC_DocType_ID (0);
			setIsSOTrx(false);
			setMovementDate(new Timestamp(System.currentTimeMillis()));
			setDateAcct(getMovementDate());
			// setMovementType (REF_M_TransactionMovementType.CustomerShipment);
			setDeliveryRule(REF_C_OrderDeliveryRule.Availability);
			setDeliveryViaRule(REF_C_OrderDeliveryViaRule.Shipper);
			setFreightCostRule(REF_C_OrderFreightCostRule.FreightIncluded);
			setDocStatus(REF__DocumentStatus.Drafted);
			setDocAction(REF__DocumentAction.Complete);
			setPriorityRule(REF__PriorityRule.Medium);
			setNoPackages(0);
			setIsInTransit(false);
			setIsPrinted(false);
			setSendEMail(false);
			setIsInDispute(false);
			//
			setIsApproved(false);
			super.setProcessed(false);
			setProcessing(false);
			setPosted(false);
		}
	} // MInOut

	/**
	 * Load Constructor
	 * 
	 * @param ctx
	 *            context
	 * @param rs
	 *            result set record
	 * @param trxName
	 *            transaction
	 */
	public MInOut(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	} // MInOut

	/**
	 * Order Constructor - create header only
	 * 
	 * @param order
	 *            order
	 * @param movementDate
	 *            optional movement date (default today)
	 * @param C_DocTypeShipment_ID
	 *            document type or 0
	 */
	public MInOut(MOrder order, int C_DocTypeShipment_ID, Timestamp movementDate) {
		this(order.getCtx(), 0, order.get_TrxName());
		setClientOrg(order);
		setC_BPartner_ID(order.getC_BPartner_ID());
		setC_BPartner_Location_ID(order.getC_BPartner_Location_ID()); // shipment
		// address
		setAD_User_ID(order.getAD_User_ID());
		//
		setM_Warehouse_ID(order.getM_Warehouse_ID());
		setIsSOTrx(order.isSOTrx());
//		setMovementType(order.isSOTrx() ? REF_M_TransactionMovementType.CustomerShipment
//				: REF_M_TransactionMovementType.VendorReceipts);
		if (C_DocTypeShipment_ID == 0)
			C_DocTypeShipment_ID = DB
					.getSQLValue(
							null,
							"SELECT C_DocTypeShipment_ID FROM C_DocType WHERE C_DocType_ID=?",
							order.getC_DocType_ID());
		setC_DocType_ID(C_DocTypeShipment_ID);
		
		// Movement Type
		MDocType.get(getCtx(), getC_DocType_ID()).getDocBaseType();
		if (MDocType.get(getCtx(), getC_DocType_ID()).getDocBaseType().equals(REF_C_DocTypeDocBaseType.MaterialReturnOfVendor))
			setMovementType(REF_M_TransactionMovementType.VendorReturns);
		else if (MDocType.get(getCtx(), getC_DocType_ID()).getDocBaseType().equals(REF_C_DocTypeDocBaseType.MaterialReturnOfCustomer)) {
			setMovementType(REF_M_TransactionMovementType.CustomerReturns);
		} else if (MDocType.get(getCtx(), getC_DocType_ID()).getDocBaseType().equals(REF_C_DocTypeDocBaseType.MaterialDelivery)) {
			setMovementType(REF_M_TransactionMovementType.CustomerShipment);
		}else if (MDocType.get(getCtx(), getC_DocType_ID()).getDocBaseType().equals(REF_C_DocTypeDocBaseType.MaterialReceipt)) {
			setMovementType(REF_M_TransactionMovementType.VendorReceipts);
		}			
		
		// Default - Today
		if (movementDate != null)
			setMovementDate(movementDate);
		setDateAcct(getMovementDate());

		// Copy from Order
		setC_Order_ID(order.getC_Order_ID());
		setDeliveryRule(order.getDeliveryRule());
		setDeliveryViaRule(order.getDeliveryViaRule());
		setM_Shipper_ID(order.getM_Shipper_ID());
		setFreightCostRule(order.getFreightCostRule());
		setFreightAmt(order.getFreightAmt());
		setSalesRep_ID(order.getSalesRep_ID());
		//
		setC_Activity_ID(order.getC_Activity_ID());
		setC_Campaign_ID(order.getC_Campaign_ID());
		setC_Charge_ID(order.getC_Charge_ID());
		setChargeAmt(order.getChargeAmt());
		//
		setC_Project_ID(order.getC_Project_ID());
		setDateOrdered(order.getDateOrdered());
		setDescription(order.getDescription());
		setPOReference(order.getPOReference());
		setSalesRep_ID(order.getSalesRep_ID());
		setAD_OrgTrx_ID(order.getAD_OrgTrx_ID());
		setUser1_ID(order.getUser1_ID());
		setUser2_ID(order.getUser2_ID());
	} // MInOut

	/**
	 * Invoice Constructor - create header only
	 * 
	 * @param invoice
	 *            invoice
	 * @param C_DocTypeShipment_ID
	 *            document type or 0
	 * @param movementDate
	 *            optional movement date (default today)
	 * @param M_Warehouse_ID
	 *            warehouse
	 */
	public MInOut(MInvoice invoice, int C_DocTypeShipment_ID,
			Timestamp movementDate, int M_Warehouse_ID) {
		this(invoice.getCtx(), 0, invoice.get_TrxName());
		setClientOrg(invoice);
		setC_BPartner_ID(invoice.getC_BPartner_ID());
		setC_BPartner_Location_ID(invoice.getC_BPartner_Location_ID()); // shipment
		// address
		setAD_User_ID(invoice.getAD_User_ID());
		//
		setM_Warehouse_ID(M_Warehouse_ID);
		setIsSOTrx(invoice.isSOTrx());
		//setMovementType(invoice.isSOTrx() ? REF_M_TransactionMovementType.CustomerShipment
		//		: REF_M_TransactionMovementType.VendorReceipts);
		//
		MOrder order = null;
		if (invoice.getC_Order_ID() != 0)
			order = new MOrder(invoice.getCtx(), invoice.getC_Order_ID(),
					invoice.get_TrxName());
		if (C_DocTypeShipment_ID == 0 && order != null)
			C_DocTypeShipment_ID = DB
					.getSQLValue(
							null,
							"SELECT C_DocTypeShipment_ID FROM C_DocType WHERE C_DocType_ID=?",
							order.getC_DocType_ID());
		if (C_DocTypeShipment_ID != 0)
			setC_DocType_ID(C_DocTypeShipment_ID);
		else
			setC_DocType_ID();

		// TODO: Aqui me parece innecesario , ya que es desde una factura y no existen facturas
		// por devolucion , FRANCISCO a ver una chequeadita , por exceso no hay problema
		// pero si no sirve hay que sacarlo.
		MDocType.get(getCtx(), getC_DocType_ID()).getDocBaseType();
		if (MDocType.get(getCtx(), getC_DocType_ID()).getDocBaseType().equals(REF_C_DocTypeDocBaseType.MaterialReturnOfVendor))
			setMovementType(REF_M_TransactionMovementType.VendorReturns);
		else if (MDocType.get(getCtx(), getC_DocType_ID()).getDocBaseType().equals(REF_C_DocTypeDocBaseType.MaterialReturnOfCustomer)) {
			setMovementType(REF_M_TransactionMovementType.CustomerReturns);
		} else if (MDocType.get(getCtx(), getC_DocType_ID()).getDocBaseType().equals(REF_C_DocTypeDocBaseType.MaterialDelivery)) {
			setMovementType(REF_M_TransactionMovementType.CustomerShipment);
		}else if (MDocType.get(getCtx(), getC_DocType_ID()).getDocBaseType().equals(REF_C_DocTypeDocBaseType.MaterialReceipt)) {
			setMovementType(REF_M_TransactionMovementType.VendorReceipts);
		}	
		
		// Default - Today
		if (movementDate != null)
			setMovementDate(movementDate);
		setDateAcct(getMovementDate());

		// Copy from Invoice
		setC_Order_ID(invoice.getC_Order_ID());
		setSalesRep_ID(invoice.getSalesRep_ID());
		//
		setC_Activity_ID(invoice.getC_Activity_ID());
		setC_Campaign_ID(invoice.getC_Campaign_ID());
		setC_Charge_ID(invoice.getC_Charge_ID());
		setChargeAmt(invoice.getChargeAmt());
		//
		setC_Project_ID(invoice.getC_Project_ID());
		setDateOrdered(invoice.getDateOrdered());
		setDescription(invoice.getDescription());
		setPOReference(invoice.getPOReference());
		setAD_OrgTrx_ID(invoice.getAD_OrgTrx_ID());
		setUser1_ID(invoice.getUser1_ID());
		setUser2_ID(invoice.getUser2_ID());

		if (order != null) {
			setDeliveryRule(order.getDeliveryRule());
			setDeliveryViaRule(order.getDeliveryViaRule());
			setM_Shipper_ID(order.getM_Shipper_ID());
			setFreightCostRule(order.getFreightCostRule());
			setFreightAmt(order.getFreightAmt());
		}
	} // MInOut

	/**
	 * Copy Constructor - create header only
	 * 
	 * @param original
	 *            original
	 * @param movementDate
	 *            optional movement date (default today)
	 * @param C_DocTypeShipment_ID
	 *            document type or 0
	 */
	public MInOut(MInOut original, int C_DocTypeShipment_ID,
			Timestamp movementDate) {
		this(original.getCtx(), 0, original.get_TrxName());
		setClientOrg(original);
		setC_BPartner_ID(original.getC_BPartner_ID());
		setC_BPartner_Location_ID(original.getC_BPartner_Location_ID()); // shipment
		// address
		setAD_User_ID(original.getAD_User_ID());
		//
		setM_Warehouse_ID(original.getM_Warehouse_ID());
		setIsSOTrx(original.isSOTrx());
		setMovementType(original.getMovementType());
		if (C_DocTypeShipment_ID == 0)
			setC_DocType_ID(original.getC_DocType_ID());
		else
			setC_DocType_ID(C_DocTypeShipment_ID);

		// Default - Today
		if (movementDate != null)
			setMovementDate(movementDate);
		setDateAcct(getMovementDate());

		// Copy from Order
		setC_Order_ID(original.getC_Order_ID());
		setDeliveryRule(original.getDeliveryRule());
		setDeliveryViaRule(original.getDeliveryViaRule());
		setM_Shipper_ID(original.getM_Shipper_ID());
		setFreightCostRule(original.getFreightCostRule());
		setFreightAmt(original.getFreightAmt());
		setSalesRep_ID(original.getSalesRep_ID());
		//
		setC_Activity_ID(original.getC_Activity_ID());
		setC_Campaign_ID(original.getC_Campaign_ID());
		setC_Charge_ID(original.getC_Charge_ID());
		setChargeAmt(original.getChargeAmt());
		//
		setC_Project_ID(original.getC_Project_ID());
		setDateOrdered(original.getDateOrdered());
		setDescription(original.getDescription());
		setPOReference(original.getPOReference());
		setSalesRep_ID(original.getSalesRep_ID());
		setAD_OrgTrx_ID(original.getAD_OrgTrx_ID());
		setUser1_ID(original.getUser1_ID());
		setUser2_ID(original.getUser2_ID());
	} // MInOut

	/**
	 * Get Document Status
	 * 
	 * @return Document Status Clear Text
	 */
	public String getDocStatusName() {
		return MRefList.getListName(getCtx(), REF__DocumentStatus.Identifier, getDocStatus());
	} // getDocStatusName

	/**
	 * Add to Description
	 * 
	 * @param description
	 *            text
	 */
	public void addDescription(String description) {
		String desc = getDescription();
		if (desc == null)
			setDescription(description);
		else
			setDescription(desc + " | " + description);
	} // addDescription

	/**
	 * String representation
	 * 
	 * @return info
	 */
	public String toString() {
		StringBuffer sb = new StringBuffer("MInOut[").append(get_ID()).append(
				"-").append(getDocumentNo()).append(",DocStatus=").append(
				getDocStatus()).append("]");
		return sb.toString();
	} // toString

	/**
	 * Get Document Info
	 * 
	 * @return document info (untranslated)
	 */
	public String getDocumentInfo() {
		MDocType dt = MDocType.get(getCtx(), getC_DocType_ID());
		return dt.getName() + " " + getDocumentNo();
	} // getDocumentInfo

	/**
	 * Create PDF
	 * 
	 * @return File or null
	 */
	public File createPDF() {
		try {
			File temp = File.createTempFile(get_TableName() + get_ID() + "_",
					".pdf");
			return createPDF(temp);
		} catch (Exception e) {
			log.severe("Could not create PDF - " + e.getMessage());
		}
		return null;
	} // getPDF

	/**
	 * Create PDF file
	 * 
	 * @param file
	 *            output file
	 * @return file if success
	 */
	public File createPDF(File file) {
		ReportEngine re = ReportEngine.get(getCtx(), ReportEngine.SHIPMENT,
				getC_Invoice_ID());
		if (re == null)
			return null;
		return re.getPDF(file);
	} // createPDF

	/**
	 * Get Lines of Shipment
	 * 
	 * @param requery
	 *            refresh from db
	 * @return lines
	 */
	public MInOutLine[] getLines(boolean requery) {
		if (m_lines != null && !requery)
			return m_lines;
		List<MInOutLine> list = new Query(Env.getCtx(), X_M_InOutLine.Table_Name, "M_InOut_ID = ?", get_TrxName())
			.setParameters(getM_InOut_ID()).setOrderBy(X_M_InOutLine.COLUMNNAME_Line).list();
//		ArrayList<MInOutLine> list = new ArrayList<MInOutLine>();
//		String sql = "SELECT * FROM M_InOutLine WHERE M_InOut_ID=? ORDER BY Line";
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		try {
//			pstmt = DB.prepareStatement(sql, get_TrxName());
//			pstmt.setInt(1, getM_InOut_ID());
//			rs = pstmt.executeQuery();
//			while (rs.next())
//				list.add(new MInOutLine(getCtx(), rs, get_TrxName()));
//			rs.close();
//			rs = null;
//			pstmt.close();
//			pstmt = null;
//		} catch (SQLException ex) {
//			log.log(Level.SEVERE, sql, ex);
//			list = null;
//			// throw new DBException(ex);
//		} finally {
//			try {
//				if (rs != null)
//					rs.close();
//				if (pstmt != null)
//					pstmt.close();
//			} catch (SQLException e) {
//			}
//		}
//		pstmt = null;
//		rs = null;
		//
		if (list == null)
			return null;
		//
		m_lines = new MInOutLine[list.size()];
		list.toArray(m_lines);
		return m_lines;
	} // getMInOutLines

	/**
	 * Get Lines of Shipment
	 * 
	 * @return lines
	 */
	public MInOutLine[] getLines() {
		return getLines(false);
	} // getLines

	/**
	 * Get Confirmations
	 * 
	 * @param requery
	 *            requery
	 * @return array of Confirmations
	 */
	public MInOutConfirm[] getConfirmations(boolean requery) {
		if (m_confirms != null && !requery)
			return m_confirms;

		ArrayList<MInOutConfirm> list = new ArrayList<MInOutConfirm>();
		String sql = "SELECT * FROM M_InOutConfirm WHERE M_InOut_ID=?";
		PreparedStatement pstmt = null;
		try {
			pstmt = DB.prepareStatement(sql, get_TrxName());
			pstmt.setInt(1, getM_InOut_ID());
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
				list.add(new MInOutConfirm(getCtx(), rs, get_TrxName()));
			rs.close();
			pstmt.close();
			pstmt = null;
		} catch (Exception e) {
			log.log(Level.SEVERE, sql, e);
		}
		try {
			if (pstmt != null)
				pstmt.close();
			pstmt = null;
		} catch (Exception e) {
			pstmt = null;
		}

		m_confirms = new MInOutConfirm[list.size()];
		list.toArray(m_confirms);
		return m_confirms;
	} // getConfirmations

	/**
	 * Copy Lines From other Shipment
	 * 
	 * @param otherShipment
	 *            shipment
	 * @param counter
	 *            set counter info
	 * @param setOrder
	 *            set order link
	 * @return number of lines copied
	 */
	public int copyLinesFrom(MInOut otherShipment, boolean counter,
			boolean setOrder) {
		if (isProcessed() || isPosted() || otherShipment == null)
			return 0;
		MInOutLine[] fromLines = otherShipment.getLines(false);
		int count = 0;
		for (int i = 0; i < fromLines.length; i++) {
			MInOutLine line = new MInOutLine(this);
			MInOutLine fromLine = fromLines[i];
			line.set_TrxName(get_TrxName());
			if (counter) // header
				PO
						.copyValues(fromLine, line, getAD_Client_ID(),
								getAD_Org_ID());
			else
				PO.copyValues(fromLine, line, fromLine.getAD_Client_ID(),
						fromLine.getAD_Org_ID());
			line.setM_InOut_ID(getM_InOut_ID());
			line.set_ValueNoCheck("M_InOutLine_ID", I_ZERO); // new
			// Reset
			if (!setOrder)
				line.setC_OrderLine_ID(0);
			if (!counter)
				line.setM_AttributeSetInstance_ID(0);
			// line.setS_ResourceAssignment_ID(0);
			line.setRef_InOutLine_ID(0);
			line.setIsInvoiced(false);
			//
			line.setConfirmedQty(Env.ZERO);
			line.setPickedQty(Env.ZERO);
			line.setScrappedQty(Env.ZERO);
			line.setTargetQty(Env.ZERO);
			// Set Locator based on header Warehouse
			if (getM_Warehouse_ID() != otherShipment.getM_Warehouse_ID()) {
				line.setM_Locator_ID(0);
				line.setM_Locator_ID(Env.ZERO);
			}
			//
			if (counter) {
				line.setRef_InOutLine_ID(fromLine.getM_InOutLine_ID());
				if (fromLine.getC_OrderLine_ID() != 0) {
					MOrderLine peer = new MOrderLine(getCtx(), fromLine
							.getC_OrderLine_ID(), get_TrxName());
					if (peer.getRef_OrderLine_ID() != 0)
						line.setC_OrderLine_ID(peer.getRef_OrderLine_ID());
				}
			}
			//
			line.setProcessed(false);
			if (line.save(get_TrxName()))
				count++;
			// Cross Link
			if (counter) {
				fromLine.setRef_InOutLine_ID(line.getM_InOutLine_ID());
				fromLine.save(get_TrxName());
			}
		}
		if (fromLines.length != count)
			log.log(Level.SEVERE, "Line difference - From=" + fromLines.length
					+ " <> Saved=" + count);
		return count;
	} // copyLinesFrom

	/** Reversal Flag */
	private boolean m_reversal = false;

	/**
	 * Set Reversal
	 * 
	 * @param reversal
	 *            reversal
	 */
	private void setReversal(boolean reversal) {
		m_reversal = reversal;
	} // setReversal

	/**
	 * Is Reversal
	 * 
	 * @return reversal
	 */
	public boolean isReversal() {
		return m_reversal;
	} // isReversal

	/**
	 * Set Processed. Propergate to Lines/Taxes
	 * 
	 * @param processed
	 *            processed
	 */
	public void setProcessed(boolean processed) {
		super.setProcessed(processed);
		if (get_ID() == 0)
			return;
		String sql = "UPDATE M_InOutLine SET Processed='"
				+ (processed ? "Y" : "N") + "' WHERE M_InOut_ID="
				+ getM_InOut_ID();
		int noLine = DB.executeUpdate(sql, get_TrxName());
		m_lines = null;
		log.fine(processed + " - Lines=" + noLine);
	} // setProcessed

	/**
	 * Get BPartner
	 * 
	 * @return partner
	 */
	public MBPartner getBPartner() {
		if (m_partner == null)
			m_partner = new MBPartner(getCtx(), getC_BPartner_ID(),
					get_TrxName());
		return m_partner;
	} // getPartner

	/**
	 * Set Document Type
	 * 
	 * @param DocBaseType
	 *            doc type REF_C_DocTypeDocBaseType.
	 */
	public void setC_DocType_ID(String DocBaseType) {
		// PATCH ARANA , tomar en cuenta las devoluciones.
		boolean isSOTrx = false;
		if (REF_C_DocTypeDocBaseType.MaterialDelivery.equals(DocBaseType) || 
				REF_C_DocTypeDocBaseType.MaterialReturnOfVendor.equals(DocBaseType)) {
			isSOTrx = true;
		}
		
		String sql = "SELECT C_DocType_ID FROM C_DocType "
				+ "WHERE AD_Client_ID=? AND DocBaseType=?"
				+ " AND IsActive='Y'" + " AND IsSOTrx='"
				+ (isSOTrx ? "Y" : "N") + "' " + "ORDER BY IsDefault DESC";
		int C_DocType_ID = DB.getSQLValue(null, sql, getAD_Client_ID(),
				DocBaseType);
		if (C_DocType_ID <= 0)
			log.log(Level.SEVERE, "Not found for AC_Client_ID="
					+ getAD_Client_ID() + " - " + DocBaseType);
		else {
			log.fine("DocBaseType=" + DocBaseType + " - C_DocType_ID="
					+ C_DocType_ID);
			setC_DocType_ID(C_DocType_ID);
			setIsSOTrx(isSOTrx);
		}
	} // setC_DocType_ID

	/**
	 * Set Default C_DocType_ID. Based on SO flag
	 */
	public void setC_DocType_ID() {
		// ARANA : COMO RESOLVER ESTO , SE ASUME SEGUN SI ES VENTA O COMPRA 
		// EL TIPO DE DOCUMENTO , PERO EL PROBLEMA ES QUE ESO NO BASTA PARA
		// SABER SI ES DEVOLUCION.
		// ESTE CONSTRUCTOR NO DEBERIA SER USADO JAMAS-
		// PERO EN EL CONSTRUCTOR CON INVOICE COMO PARAMETRO
		// EXISTE EL SIGUIENTE CODIGO :
		/*		
		 * 		if (C_DocTypeShipment_ID == 0 && order != null)
			C_DocTypeShipment_ID = DB
					.getSQLValue(
							null,
							"SELECT C_DocTypeShipment_ID FROM C_DocType WHERE C_DocType_ID=?",
							order.getC_DocType_ID());
		if (C_DocTypeShipment_ID != 0)
			setC_DocType_ID(C_DocTypeShipment_ID);
		else
			setC_DocType_ID();
			
			OSEA SI NO EXISTE DESDE LA ORDEN UIN DOCTYPE DE SHIPMENT SE USA EL CONSTRUCTOR
			DEFAULT.
			CUIDADO ESE CASO FALLARA.
			FRANCISCO QUE SE PUEDE HACER , ES EL HUEVO Y LA GALLINA
		 */
		if (isSOTrx())
			setC_DocType_ID(REF_C_DocTypeDocBaseType.MaterialDelivery);
		else
			setC_DocType_ID(REF_C_DocTypeDocBaseType.MaterialReceipt);
	} // setC_DocType_ID

	/**
	 * Set Business Partner Defaults & Details
	 * 
	 * @param bp
	 *            business partner
	 */
	public void setBPartner(MBPartner bp) {
		if (bp == null)
			return;

		setC_BPartner_ID(bp.getC_BPartner_ID());

		// Set Locations
		MBPartnerLocation[] locs = bp.getLocations(false);
		if (locs != null) {
			for (int i = 0; i < locs.length; i++) {
				if (locs[i].isShipTo())
					setC_BPartner_Location_ID(locs[i]
							.getC_BPartner_Location_ID());
			}
			// set to first if not set
			if (getC_BPartner_Location_ID() == 0 && locs.length > 0)
				setC_BPartner_Location_ID(locs[0].getC_BPartner_Location_ID());
		}
		if (getC_BPartner_Location_ID() == 0)
			log.log(Level.SEVERE, "Has no To Address: " + bp);

		// Set Contact
		MUser[] contacts = bp.getContacts(false);
		if (contacts != null && contacts.length > 0) // get first User
			setAD_User_ID(contacts[0].getAD_User_ID());
	} // setBPartner

	
	public boolean IsPickQAConfirm()
	{
		MDocType dt = MDocType.get(Env.getCtx(), getC_DocType_ID());		
		return dt.isPickQAConfirm();
	}

	public boolean IsShipConfirm()
	{
		MDocType dt = MDocType.get(Env.getCtx(), getC_DocType_ID());		
		return dt.isShipConfirm();
	}

	public void createPickQAConfirm() {
		boolean havePick = false;	
		MInOutConfirm[] confirmations = getConfirmations(false);
		for (MInOutConfirm confirm:confirmations)
		{
			if (REF_M_InOutConfirmType.PickQAConfirm.equals(confirm.getConfirmType())) {
				if (!confirm.isProcessed()) // wait intil done
				{
					log.fine("Unprocessed: " + confirm);
					return;
				}
				havePick = true;
			}
		}		
		if (!havePick) {
			MInOutConfirm.create(this, REF_M_InOutConfirmType.PickQAConfirm, false);
			return;
		}		
	}
	public void createShipConfirm() {
		boolean haveShip = false;
		MInOutConfirm[] confirmations = getConfirmations(false);
		for (MInOutConfirm confirm:confirmations)
		{
			if (REF_M_InOutConfirmType.ShipReceiptConfirm.equals(confirm.getConfirmType())) {
				if (!confirm.isProcessed()) // wait intil done
				{
					log.fine("Unprocessed: " + confirm);
					return;
				}
				haveShip = true;
			}			
		}
		if (!haveShip) {
			MInOutConfirm.create(this, REF_M_InOutConfirmType.ShipReceiptConfirm, false);
			return;
		}				
	}
	/**
	 * Create the missing next Confirmation
	 */
	public void createConfirmation() {
		MDocType dt = MDocType.get(getCtx(), getC_DocType_ID());
		boolean pick = dt.isPickQAConfirm();
		boolean ship = dt.isShipConfirm();
		// Nothing to do
		if (!pick && !ship) {
			log.fine("No need");
			return;
		}

		// Create Both .. after each other
		if (pick && ship) {
			boolean havePick = false;
			boolean haveShip = false;
			MInOutConfirm[] confirmations = getConfirmations(false);
			for (int i = 0; i < confirmations.length; i++) {
				MInOutConfirm confirm = confirmations[i];
				if (REF_M_InOutConfirmType.PickQAConfirm.equals(confirm
						.getConfirmType())) {
					if (!confirm.isProcessed()) // wait intil done
					{
						log.fine("Unprocessed: " + confirm);
						return;
					}
					havePick = true;
				} else if (REF_M_InOutConfirmType.ShipReceiptConfirm
						.equals(confirm.getConfirmType()))
					haveShip = true;
			}
			// Create Pick
			if (!havePick) {
				MInOutConfirm.create(this, REF_M_InOutConfirmType.PickQAConfirm, false);
				return;
			}
			// Create Ship
			if (!haveShip) {
				MInOutConfirm.create(this, REF_M_InOutConfirmType.ShipReceiptConfirm, false);
				return;
			}
			return;
		}
		// Create just one
		if (pick)
			MInOutConfirm.create(this, REF_M_InOutConfirmType.PickQAConfirm,
					true);
		else if (ship)
			MInOutConfirm.create(this,
					REF_M_InOutConfirmType.ShipReceiptConfirm, true);
	} // createConfirmation

	/**
	 * Set Warehouse and check/set Organization
	 * 
	 * @param M_Warehouse_ID
	 *            id
	 */
	public void setM_Warehouse_ID(int M_Warehouse_ID) {
		if (M_Warehouse_ID == 0) {
			log.severe("Ignored - Cannot set AD_Warehouse_ID to 0");
			return;
		}
		super.setM_Warehouse_ID(M_Warehouse_ID);
		//
		MWarehouse wh = MWarehouse.get(getCtx(), getM_Warehouse_ID());
		if (wh.getAD_Org_ID() != getAD_Org_ID()) {
			log.warning("M_Warehouse_ID=" + M_Warehouse_ID
					+ ", Overwritten AD_Org_ID=" + getAD_Org_ID() + "->"
					+ wh.getAD_Org_ID());
			setAD_Org_ID(wh.getAD_Org_ID());
		}
	} // setM_Warehouse_ID

	/**
	 * Before Save
	 * 
	 * @param newRecord
	 *            new
	 * @return true or false
	 */
	protected boolean beforeSave(boolean newRecord) {
		// Warehouse Org
		if (newRecord) {
			MWarehouse wh = MWarehouse.get(getCtx(), getM_Warehouse_ID());
			if (wh.getAD_Org_ID() != getAD_Org_ID()) {
				log.saveError("WarehouseOrgConflict", "");
				return false;
			}
		}
		// Shipment - Needs Order
		if (isSOTrx() && getC_Order_ID() == 0) {
			log.saveError("FillMandatory", Msg
					.translate(getCtx(), "C_Order_ID"));
			return false;
		}
		return true;
	} // beforeSave

	/**
	 * After Save
	 * 
	 * @param newRecord
	 *            new
	 * @param success
	 *            success
	 * @return success
	 */
	protected boolean afterSave(boolean newRecord, boolean success) {
		if (!success || newRecord)
			return success;

		if (is_ValueChanged("AD_Org_ID")) {
			String sql = "UPDATE M_InOutLine ol" + " SET AD_Org_ID ="
					+ "(SELECT AD_Org_ID"
					+ " FROM M_InOut o WHERE ol.M_InOut_ID=o.M_InOut_ID) "
					+ "WHERE M_InOut_ID=" + getC_Order_ID();
			int no = DB.executeUpdate(sql, get_TrxName());
			log.fine("Lines -> #" + no);
		}
		return true;
	} // afterSave

	/**************************************************************************
	 * Process document
	 * 
	 * @param processAction
	 *            document action
	 * @return true if performed
	 */
	public boolean processIt(String processAction) {
		setProcessMsg(null);
		DocumentEngine engine = new DocumentEngine(this, getDocStatus());
		if (processAction.equals(engine.ACTION_None)
				&& getDocStatus().equals(engine.ACTION_Complete)
				&& getDocAction().equals(ACTION_Restore)) {
			return RestoreIt();
		} else {
			return engine.processIt(processAction, getDocAction());
		}
	} // process

	/** Process Message */
	private String m_processMsg = null;
	/** Just Prepared Flag */
	private boolean m_justPrepared = false;

	/**
	 * Unlock Document.
	 * 
	 * @return true if success
	 */
	public boolean unlockIt() {
		log.info(toString());
		setProcessing(false);
		return true;
	} // unlockIt

	/**
	 * Invalidate Document
	 * 
	 * @return true if success
	 */
	public boolean invalidateIt() {
		log.info(toString());
		setDocAction(REF__DocumentAction.Prepare);
		return true;
	} // invalidateIt
	
	public int getLength()
	{
		MInOutLine[] lines = getLines(true);
		return lines.length;
	}	

	/**
	 * Prepare Document
	 * 
	 * @return new status (In Progress or Invalid)
	 */
	public String prepareIt() {
		log.info(toString());
		setProcessMsg(ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_PREPARE));
		//m_processMsg = 
		if (getProcessMsg() != null)
			return DocAction.STATUS_Invalid;

		MDocType dt = MDocType.get(getCtx(), getC_DocType_ID());
		int AD_Rule_ID = dt.getAD_Rule_ID();								
		KieBase kb = Env.startRule(AD_Rule_ID);
		if (kb != null)
		{
			ksession = kb.newKieSession();
			ksession.addEventListener(new CustomAgendaEventListener());
			ksession.addEventListener(new CustomWorkingMemoryEventListener());			
			ksession.setGlobal("ctx", Env.getCtx());								
			ksession.insert(this);			
		}		
		else
		{
			setProcessMsg(Env.getKieError(AD_Rule_ID));
			if (getProcessMsg() != null)
				return DocAction.STATUS_Invalid;
		}		
		ksession.getAgenda().getAgendaGroup( "prepare" ).setFocus();
		setRulestatus(DocAction.STATUS_Invalid);
		ksession.fireAllRules();		
		ksession.dispose();
		if (rulestatus.equals(DocAction.STATUS_InProgress))
			m_justPrepared = true;
		return rulestatus;				
//		MDocType dt = MDocType.get(getCtx(), getC_DocType_ID());
//
//		// Std Period open?
//		if (!MPeriod.isOpen(getCtx(), getDateAcct(), dt.getDocBaseType(), Env.getAD_Org_ID(getCtx()))) {
//			m_processMsg = "@PeriodClosed@";
//			return DocAction.STATUS_Invalid;
//		}
//
//		// Credit Check
//		if (isSOTrx() && !isReversal()) {
//			MBPartner bp = new MBPartner(getCtx(), getC_BPartner_ID(),
//					get_TrxName());
//			if (REF_C_BPartnerSOCreditStatus.CreditStop.equals(bp
//					.getSOCreditStatus())) {
//				m_processMsg = "@BPartnerCreditStop@ - @TotalOpenBalance@="
//						+ bp.getTotalOpenBalance() + ", @SO_CreditLimit@="
//						+ bp.getSO_CreditLimit();
//				return DocAction.STATUS_Invalid;
//			}
//			if (REF_C_BPartnerSOCreditStatus.CreditHold.equals(bp
//					.getSOCreditStatus())) {
//				m_processMsg = "@BPartnerCreditHold@ - @TotalOpenBalance@="
//						+ bp.getTotalOpenBalance() + ", @SO_CreditLimit@="
//						+ bp.getSO_CreditLimit();
//				return DocAction.STATUS_Invalid;
//			}
//			// xapiens TODO: esto se comenta pues es muy pesado y no sense por ahora
////			BigDecimal notInvoicedAmt = MBPartner
////					.getNotInvoicedAmt(getC_BPartner_ID());
////			if (REF_C_BPartnerSOCreditStatus.CreditHold.equals(bp
////					.getSOCreditStatus(notInvoicedAmt))) {
////				m_processMsg = "@BPartnerOverSCreditHold@ - @TotalOpenBalance@="
////						+ bp.getTotalOpenBalance()
////						+ ", @NotInvoicedAmt@="
////						+ notInvoicedAmt
////						+ ", @SO_CreditLimit@="
////						+ bp.getSO_CreditLimit();
////				return DocAction.STATUS_Invalid;
////			}
//		}
//
//		// Lines
//		MInOutLine[] lines = getLines(true);
//		if (lines == null || lines.length == 0) {
//			m_processMsg = "@NoLines@";
//			return DocAction.STATUS_Invalid;
//		}
//		BigDecimal Volume = Env.ZERO;
//		BigDecimal Weight = Env.ZERO;
//
//		// Mandatory Attributes
//		for (int i = 0; i < lines.length; i++) {
//			MInOutLine line = lines[i];
//			MProduct product = line.getProduct();
//			if (product != null) {
//				Volume = Volume.add(product.getVolume().multiply(
//						line.getMovementQty()));
//				Weight = Weight.add(product.getWeight().multiply(
//						line.getMovementQty()));
//			}
//			//
//			if (line.getM_AttributeSetInstance_ID() != 0)
//				continue;
//			if (product != null) {
//				int M_AttributeSet_ID = product.getM_AttributeSet_ID();
//				if (M_AttributeSet_ID != 0) {
//					MAttributeSet mas = MAttributeSet.get(getCtx(),
//							M_AttributeSet_ID);
//					if (mas != null
//							&& ((isSOTrx() && mas.isMandatory()) || (!isSOTrx() && mas
//									.isMandatoryAlways()))) {
//						m_processMsg = "@M_AttributeSet_ID@ @IsMandatory@ (@Line@ #"
//								+ lines[i].getLine()
//								+ ", @M_Product_ID@="
//								+ product.getValue() + ")";
//						return DocAction.STATUS_Invalid;
//					}
//				}
//			}
//		}
//		setVolume(Volume);
//		setWeight(Weight);
//
//		if (!isReversal()) // don't change reversal
//		{
//			checkMaterialPolicy(); // set MASI
//			createConfirmation();
//		}
//
//		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,
//				ModelValidator.TIMING_AFTER_PREPARE);
//		if (m_processMsg != null)
//			return DocAction.STATUS_Invalid;
//
//		m_justPrepared = true;
//		if (!REF__DocumentAction.Complete.equals(getDocAction()))
//			setDocAction(REF__DocumentAction.Complete);
//		return DocAction.STATUS_InProgress;
	} // prepareIt
	
	public boolean setVolume() {		
		Boolean ret = true;
		BigDecimal Volume = Env.ZERO;
		BigDecimal Weight = Env.ZERO;				
		List<MInOutLine> lines = new Query(Env.getCtx(), MInOutLine.Table_Name, "M_InOut_ID = ?", get_TrxName())
			.setParameters(this.getM_InOut_ID()).list();
		for (MInOutLine line:lines)		
		{
			if (line.getM_Product_ID() > 0)
			{
				MProduct product = line.getProduct();
				Volume = Volume.add(product.getVolume().multiply(line.getMovementQty()));
				Weight = Weight.add(product.getWeight().multiply(line.getMovementQty()));
			}
		}
		setVolume(Volume);
		setWeight(Weight);		
		return ret;
	}
	/**
	 * @deprecated use Policy.checkattributes(order) instead
	 * 
	 */
	public boolean isMandatoryAttributes() {
		Boolean ret = false;
		List<MInOutLine> lines = new Query(Env.getCtx(), MInOutLine.Table_Name, "M_InOut_ID = ?", get_TrxName())
			.setParameters(this.getM_InOut_ID()).list();
		for (MInOutLine line:lines)		
		{
			if (line.getM_AttributeSetInstance_ID() != 0)
				continue;
			else if (line.getM_Product_ID() > 0)
			{
				MProduct product = line.getProduct();
				int M_AttributeSet_ID = product.getM_AttributeSet_ID();
				if (M_AttributeSet_ID != 0) {
					MAttributeSet mas = MAttributeSet.get(getCtx(),	M_AttributeSet_ID, get_TrxName());
					if (mas != null	&& ((isSOTrx() && mas.isMandatory()) || (!isSOTrx() && mas.isMandatoryAlways()))) {
						ret = true;
						break;
					}
				}				
			}
		}
		return ret;
	}

	/**
	 * Approve Document
	 * 
	 * @return true if success
	 */
	public boolean approveIt() {
		log.info(toString());
		setIsApproved(true);
		return true;
	} // approveIt

	/**
	 * Reject Approval
	 * 
	 * @return true if success
	 */
	public boolean rejectIt() {
		log.info(toString());
		setIsApproved(false);
		return true;
	} // rejectIt

	/**
	 * Placed Document
	 * 
	 * @return true if success
	 */
	public String placedIt() {
		log.info(toString());
		return DocAction.STATUS_Placed;
	} // placedIt

	/**
	 * Returned Document
	 * 
	 * @return true if success
	 */
	public String returnedIt() {
		log.info(toString());
		return DocAction.STATUS_Returned;
	} // returnedIt

	public boolean confirmsPending() {
		boolean ret = false;
		MInOutConfirm[] confirmations = getConfirmations(true);
		for (MInOutConfirm confirm:confirmations) {
			if (!confirm.isProcessed()) {
				if (REF_M_InOutConfirmType.CustomerConfirmation.equals(confirm.getConfirmType()))
					continue;
				//
				setProcessMsg("Open @M_InOutConfirm_ID@: "
						+ confirm.getConfirmTypeName() + " - "
						+ confirm.getDocumentNo());
				//DocAction.STATUS_InProgress;
				ret = true;
				break;
			}
		}		
		return ret;
	}
	
	public String getRulestatus() {
		return rulestatus;
	}

	public void setRulestatus(String rulestatus) {		
		if (rulestatus.compareTo(DocAction.STATUS_Completed) == 0 || 
			rulestatus.compareTo(DocAction.STATUS_WaitingPayment) == 0 && getProcessMsg() == null)
			setProcessed(true);
		this.rulestatus = rulestatus;
	}
	
	public boolean pick() {
		StringBuffer info = new StringBuffer();
		MPeriod p = MPeriod.get(Env.getCtx(), getMovementDate(), getAD_Org_ID(), getAD_Client_ID());
		Integer C_Period_ID = p.getC_Period_ID();
		MInOutLine[] lines = getLines(false);
		for (MInOutLine sLine:lines)
		{
			MProduct product = sLine.getProduct();

			// Qty & Type
			String MovementType = getMovementType();
			BigDecimal Qty = sLine.getMovementQty();
			if (MovementType.charAt(1) == '-') // C- Customer Shipment - V-
				// Vendor Return
				Qty = Qty.negate();
			BigDecimal QtySO = Env.ZERO;
			BigDecimal QtyPO = Env.ZERO;

			// Update Order Line
			MOrderLine oLine = null;
			if (sLine.getC_OrderLine_ID() != 0) {
				oLine = new MOrderLine(getCtx(), sLine.getC_OrderLine_ID(),	get_TrxName());			
				if (oLine.getM_Product_ID() != product.getM_Product_ID())
				{
					continue; 
				}
				if (oLine != null)
				{
					log.fine("OrderLine - Reserved=" + oLine.getQtyReserved() + ", Delivered=" + oLine.getQtyDelivered());
				}
				if (isSOTrx())
					QtySO = sLine.getMovementQty();
				else
					QtyPO = sLine.getMovementQty();
			}
			log.info("Line=" + sLine.getLine() + " - Qty="	+ sLine.getMovementQty());
			// Stock Movement - Counterpart MOrder.reserveStock
			if (product != null && product.isStocked()) {
				log.fine("Material Transaction");
				// Reservation ASI - assume none
				int reservationAttributeSetInstance_ID = 0; // sLine.getM_AttributeSetInstance_ID();
				//if (oLine != null)
				//	reservationAttributeSetInstance_ID = oLine.getM_	AttributeSetInstance_ID();
				//
				if (sLine.getM_AttributeSetInstance_ID() == 0) {					
					MInOutLineMA mas[] = MInOutLineMA.get(getCtx(), sLine.getM_InOutLine_ID(), get_TrxName());
					for (MInOutLineMA ma:mas) {
					//for (int j = 0; j < mas.length; j++) {
						//MInOutLineMA ma = mas[j];
						BigDecimal QtyMA = ma.getMovementQty();
						if (MovementType.charAt(1) == '-') // C- Customer
							// Shipment - V-
							// Vendor Return
							QtyMA = QtyMA.negate();
						BigDecimal QtySOMA = Env.ZERO;
						BigDecimal QtyPOMA = Env.ZERO;
						if (sLine.getC_OrderLine_ID() != 0) {
							if (isSOTrx())
								QtySOMA = ma.getMovementQty();
							else
								QtyPOMA = ma.getMovementQty();
						}
						// Update Storage - see also VMatch.createMatchRecord
						// 09/09/07 el_man
						// SO = Sales Order, PO = Purchase Order.
						// QtyMA - diffQtyOnHand add on hand
						// QtySOMA - diffQtyReserved add reserved
						// QtyPOMA - diffQtyOrdered add order
						String error = MStorage.add(getCtx(), getM_Warehouse_ID(), 
								sLine.getM_Locator_ID(), 
								sLine.getM_Product_ID(), 
								ma.getM_AttributeSetInstance_ID(), 
								reservationAttributeSetInstance_ID, 
								QtyMA,	QtySOMA.negate(), QtyPOMA.negate(), 
								isRealtimePOS(), 
								8,
								"MInOut.completeIt()", get_TrxName());
						if (error.length() > 0 && getDeliveryRule().equals(REF_C_OrderDeliveryRule.Availability)) {
							setProcessMsg("Cannot correct Inventory (MA)" +  error);
							setRulestatus(DocAction.STATUS_Invalid);
							return false;
						}
					}
				}
				// sLine.getM_AttributeSetInstance_ID() != 0
				//if (mtrx == null) {
				else
				{
					// Fallback: Update Storage - see also
					// VMatch.createMatchRecord
					String error = MStorage.add(getCtx(), getM_Warehouse_ID(), sLine
							.getM_Locator_ID(), sLine.getM_Product_ID(), 
							sLine.getM_AttributeSetInstance_ID(),
							reservationAttributeSetInstance_ID, Qty, QtySO.negate(), QtyPO.negate(), isRealtimePOS(),  
									C_Period_ID,
									"MInOut.completeIt()",
									get_TrxName());
					if (error.length() > 0 && getDeliveryRule().equals(REF_C_OrderDeliveryRule.Availability) )
					{
						setProcessMsg("Cannot correct Inventory" +  error);
						this.setRulestatus(DocAction.STATUS_Invalid);
						return false;
					}
				}
//				StockWorker sw = new StockWorker();
//				sw.setCommand(StockWorker.CheckSignature);
//				sw.addProperty(X_M_Transaction.COLUMNNAME_C_Period_ID, C_Period_ID );
//				sw.addProperty(X_M_Transaction.COLUMNNAME_M_Product_ID, product.getM_Product_ID());
//				MStorage.addStockWorker(sw);				
			} // stock movement

			// Correct Order Line
			if (product != null && oLine != null && !isRealtimePOS()) // other in
				// VMatch.createMatchRecord
				oLine.setQtyReserved(oLine.getQtyReserved().subtract(sLine.getMovementQty()));

			// Update Sales Order Line
			if (oLine != null) {
				if (isSOTrx() // PO is done by Matching
						|| sLine.getM_Product_ID() == 0) // PO Charges, empty
				// lines
				{
					if (isSOTrx())
						oLine.setQtyDelivered(oLine.getQtyDelivered().subtract(Qty));
					else
						oLine.setQtyDelivered(oLine.getQtyDelivered().add(Qty));
					oLine.setDateDelivered(getMovementDate()); // overwrite=last
				}
				if (!oLine.save()) {
					setProcessMsg("Could not update Order Line");
					this.setRulestatus(DocAction.STATUS_Invalid);
					return false;
				} else
					log.fine("OrderLine -> Reserved=" + oLine.getQtyReserved()
							+ ", Delivered=" + oLine.getQtyDelivered());
			}

			// Create Asset for SO
			if (product != null && isSOTrx() && product.isCreateAsset()
					&& sLine.getMovementQty().signum() > 0 && !isReversal()) {
				log.fine("Asset");
				info.append("@A_Asset_ID@: ");
				int noAssets = sLine.getMovementQty().intValue();
				if (!product.isOneAssetPerUOM())
					noAssets = 1;
				for (int i = 0; i < noAssets; i++) {
					if (i > 0)
						info.append(" - ");
					int deliveryCount = i + 1;
					if (!product.isOneAssetPerUOM())
						deliveryCount = 0;
					MAsset asset = new MAsset(this, sLine, deliveryCount);
					if (!asset.save(get_TrxName())) {
						setProcessMsg("Could not create Asset");
						this.setRulestatus(DocAction.STATUS_Invalid);
						return false;
					}
					info.append(asset.getValue());
				}
			} // Asset

			// Matching
			if (!isSOTrx() && sLine.getM_Product_ID() != 0 && !isReversal()) {
				BigDecimal matchQty = sLine.getMovementQty();
				// Invoice - Receipt Match (requires Product)
				MInvoiceLine iLine = MInvoiceLine.getOfInOutLine(sLine);
				if (iLine != null && iLine.getM_Product_ID() != 0) {
					MMatchInv[] matches = MMatchInv.get(getCtx(), sLine
							.getM_InOutLine_ID(), iLine.getC_InvoiceLine_ID(),
							get_TrxName());
					if (matches == null || matches.length == 0) {
						MMatchInv inv = new MMatchInv(iLine, getMovementDate(),
								matchQty);
						if (sLine.getM_AttributeSetInstance_ID() != iLine
								.getM_AttributeSetInstance_ID()) {
							iLine.setM_AttributeSetInstance_ID(sLine
									.getM_AttributeSetInstance_ID());
							iLine.save(); // update matched invoice with ASI
							inv.setM_AttributeSetInstance_ID(sLine
									.getM_AttributeSetInstance_ID());
						}
						if (!inv.save(get_TrxName())) {
							setProcessMsg("Could not create Inv Matching");
							this.setRulestatus(DocAction.STATUS_Invalid);
							return false;
						}
					}
				}

				// Link to Order
				if (sLine.getC_OrderLine_ID() != 0) {
					log.fine("PO Matching");
					// Ship - PO
					MMatchPO po = MMatchPO.create(null, sLine,
							getMovementDate(), matchQty);
					if (!po.save(get_TrxName())) {
						setProcessMsg("Could not create PO Matching");
						this.setRulestatus(DocAction.STATUS_Invalid);
						return false;
					}
					// Update PO with ASI
					if (oLine != null
							&& oLine.getM_AttributeSetInstance_ID() == 0) {
						oLine.setM_AttributeSetInstance_ID(sLine
								.getM_AttributeSetInstance_ID());
						oLine.save(get_TrxName());
					}
				} else // No Order - Try finding links via Invoice
				{
					// Invoice has an Order Link
					if (iLine != null && iLine.getC_OrderLine_ID() != 0) {
						// Invoice is created before Shipment
						log.fine("PO(Inv) Matching");
						// Ship - Invoice
						MMatchPO po = MMatchPO.create(iLine, sLine,
								getMovementDate(), matchQty);
						if (!po.save(get_TrxName())) {
							setProcessMsg("Could not create PO(Inv) Matching");
							this.setRulestatus(DocAction.STATUS_Invalid);
							return false;
						}
						// Update PO with ASI
						oLine = new MOrderLine(getCtx(),
								po.getC_OrderLine_ID(), get_TrxName());
						if (oLine != null
								&& oLine.getM_AttributeSetInstance_ID() == 0) {
							oLine.setM_AttributeSetInstance_ID(sLine
									.getM_AttributeSetInstance_ID());
							oLine.save(get_TrxName());
						}
					}
				} // No Order
			} // PO Matching
			
//			// Finally invalidate stocks for each involved product.and each costing method.
//			if (product.isCostable()) {
//					// This method take care if a costing methos exist or no , or is supported
//					// invalidating only valid costing methods.
//					ce.invalidateCostForProduct(Env.getAD_Client_ID(getCtx()), 
//							lines[lineIndex].getAD_Org_ID(), 							
//							lines[lineIndex].getM_Product_ID(), 
//							getMovementDate(), get_TrxName());
//			}			

		} // for all lines		
		//MStorage.CheckPeriod(C_Period_ID);
//		MPeriod period = MPeriod.get(Env.getCtx(), getMovementDate());
//		StockWorker sw = new StockWorker();
//		sw.setCommand(StockWorker.Document);
//		sw.addProperty(Constants.COLUMNNAME_AD_Client_ID, getAD_Client_ID());
//		sw.addProperty(X_C_Period.COLUMNNAME_C_Period_ID, period.ToEnd());
//		sw.addProperty(X_M_InOut.COLUMNNAME_M_InOut_ID, get_ID());
//		sw.addProperty(X_AD_Table.COLUMNNAME_AD_Table_ID, X_M_InOut.Table_ID);
//		sw.addProperty(X_C_Order.COLUMNNAME_DocStatus, DocAction.STATUS_Completed);							
//		sw.setMachine(Env.getServerMaterial());
//		sw.Pull();		
		return true;
	}
	/**
	 * Complete Document
	 * 
	 * @return new status (Complete, In Progress, Invalid, Waiting ..)
	 */
	public String completeIt() {
		// Re-Check		
		if (!m_justPrepared) {
			String status = prepareIt();
			if (!DocAction.STATUS_InProgress.equals(status))
				return status;
		}
		setProcessMsg(ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_BEFORE_COMPLETE));
		if (getProcessMsg() != null)
			return DocAction.STATUS_Invalid;

		MDocType dt = MDocType.get(getCtx(), getC_DocType_ID());
		int AD_Rule_ID = dt.getAD_Rule_ID();	
		log.log(Level.WARNING, String.format("ruling inout <%s>", getDocumentNo()));
		KieBase kb = Env.startRule(AD_Rule_ID);
		if (kb != null)
		{
			ksession = kb.newKieSession();
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
//		// si no hay orden la guia no procede
//		// para mantener la integridad de los costos
//		if (getC_Order_ID() == 0)
//		{
//			m_processMsg = "El Documento no consigna Orden";
//			return DocAction.STATUS_Invalid;
//		}
//		// Outstanding (not processed) Incoming Confirmations ?
//		MInOutConfirm[] confirmations = getConfirmations(true);
//		for (int i = 0; i < confirmations.length; i++) {
//			MInOutConfirm confirm = confirmations[i];
//			if (!confirm.isProcessed()) {
//				if (REF_M_InOutConfirmType.CustomerConfirmation.equals(confirm.getConfirmType()))
//					continue;
//				//
//				m_processMsg = "Open @M_InOutConfirm_ID@: "
//						+ confirm.getConfirmTypeName() + " - "
//						+ confirm.getDocumentNo();
//				return DocAction.STATUS_InProgress;
//			}
//		}
//
//		// Implicit Approval
//		if (!isApproved())
//			approveIt();
//		log.info(toString());
//		StringBuffer info = new StringBuffer();
//
//		MAcctSchema as = MClient.get(getCtx(), getAD_Client_ID()).getAcctSchema();
//		//MCostElement ce = new MCostElement ( getCtx(), as.getM_CostElement_ID(), null);
//		if (as.getM_CostElement_ID() == 0)
//		{
//			m_processMsg = "NeedDefineCostElmentInAcctSchema";
//			return DocAction.STATUS_Invalid;
//		}
//		// For all lines
//		//MCostElement[] costMethods = MCostElement.getCostingMethods(MClient.get(getCtx()));		
//		MInOutLine[] lines = getLines(false);
//		for (int lineIndex = 0; lineIndex < lines.length; lineIndex++) {
//			MInOutLine sLine = lines[lineIndex];
//			MProduct product = sLine.getProduct();
//
//			// Qty & Type
//			String MovementType = getMovementType();
//			BigDecimal Qty = sLine.getMovementQty();
//			if (MovementType.charAt(1) == '-') // C- Customer Shipment - V-
//				// Vendor Return
//				Qty = Qty.negate();
//			BigDecimal QtySO = Env.ZERO;
//			BigDecimal QtyPO = Env.ZERO;
//
//			// Update Order Line
//			MOrderLine oLine = null;
//			if (sLine.getC_OrderLine_ID() != 0) {
//				oLine = new MOrderLine(getCtx(), sLine.getC_OrderLine_ID(),
//						get_TrxName());
//				
//				if (oLine.getM_Product_ID() != product.getM_Product_ID())
//				{
//					//continue; 
//					// inicialmente se puso continue pues vinculaba al producto de la orden 
//					// los reservados y entregados, lo cual es incorrecto. simplemente
//					// pondremos a null el oLine para que no lo considere en adelante.
//					oLine = null;
//				}
//				if (oLine != null)
//				{
//					log.fine("OrderLine - Reserved=" + oLine.getQtyReserved()
//							+ ", Delivered=" + oLine.getQtyDelivered());
//				}
//				if (isSOTrx())
//					QtySO = sLine.getMovementQty();
//				else
//					QtyPO = sLine.getMovementQty();
//			}
//
//			log.info("Line=" + sLine.getLine() + " - Qty="
//					+ sLine.getMovementQty());
//
//			// Stock Movement - Counterpart MOrder.reserveStock
//			if (product != null && product.isStocked()) {
//				log.fine("Material Transaction");
//				// Reservation ASI - assume none
//				int reservationAttributeSetInstance_ID = 0; // sLine.getM_AttributeSetInstance_ID();
//				if (oLine != null)
//					reservationAttributeSetInstance_ID = oLine
//							.getM_AttributeSetInstance_ID();
//				//
//				if (sLine.getM_AttributeSetInstance_ID() == 0) {
//					MInOutLineMA mas[] = MInOutLineMA.get(getCtx(), sLine
//							.getM_InOutLine_ID(), get_TrxName());
//					for (int j = 0; j < mas.length; j++) {
//						MInOutLineMA ma = mas[j];
//						BigDecimal QtyMA = ma.getMovementQty();
//						if (MovementType.charAt(1) == '-') // C- Customer
//							// Shipment - V-
//							// Vendor Return
//							QtyMA = QtyMA.negate();
//						BigDecimal QtySOMA = Env.ZERO;
//						BigDecimal QtyPOMA = Env.ZERO;
//						if (sLine.getC_OrderLine_ID() != 0) {
//							if (isSOTrx())
//								QtySOMA = ma.getMovementQty();
//							else
//								QtyPOMA = ma.getMovementQty();
//						}
//						// Update Storage - see also VMatch.createMatchRecord
//						// 09/09/07 el_man
//						// SO = Sales Order, PO = Purchase Order.
//						// QtyMA - diffQtyOnHand add on hand
//						// QtySOMA - diffQtyReserved add reserved
//						// QtyPOMA - diffQtyOrdered add order
//						String error = MStorage.add(getCtx(), getM_Warehouse_ID(), sLine
//								.getM_Locator_ID(), sLine.getM_Product_ID(), ma
//								.getM_AttributeSetInstance_ID(),
//								reservationAttributeSetInstance_ID, QtyMA,
//								QtySOMA.negate(), QtyPOMA.negate(), isRealtimePOS(),
//								X_M_InOutLine.Table_ID, sLine.getM_InOutLine_ID(),
//								"MInOut.completeIt()",
//								get_TrxName());
//						if (error.length() > 0 && getDeliveryRule().equals(REF_C_OrderDeliveryRule.Availability)) {
//							m_processMsg = "Cannot correct Inventory (MA)" +  error;
//							return DocAction.STATUS_Invalid;
//						}
//					}
//				}
//				// sLine.getM_AttributeSetInstance_ID() != 0
//				//if (mtrx == null) {
//				else
//				{
//					// Fallback: Update Storage - see also
//					// VMatch.createMatchRecord
//					String error = MStorage.add(getCtx(), getM_Warehouse_ID(), sLine
//							.getM_Locator_ID(), sLine.getM_Product_ID(), sLine
//							.getM_AttributeSetInstance_ID(),
//							reservationAttributeSetInstance_ID, Qty, QtySO
//									.negate(), QtyPO.negate(), isRealtimePOS(), 
//									X_M_InOutLine.Table_ID, sLine.getM_InOutLine_ID(),
//									"MInOut.completeIt()",
//									get_TrxName());
//					if (error.length() > 0 && getDeliveryRule().equals(REF_C_OrderDeliveryRule.Availability) )
//					{
//						m_processMsg = "Cannot correct Inventory" +  error;
//						return DocAction.STATUS_Invalid;
//					}
//				}
//			} // stock movement
//
//			// Correct Order Line
//			if (product != null && oLine != null && !isRealtimePOS()) // other in
//				// VMatch.createMatchRecord
//				oLine.setQtyReserved(oLine.getQtyReserved().subtract(sLine.getMovementQty()));
//
//			// Update Sales Order Line
//			if (oLine != null) {
//				if (isSOTrx() // PO is done by Matching
//						|| sLine.getM_Product_ID() == 0) // PO Charges, empty
//				// lines
//				{
//					if (isSOTrx())
//						oLine.setQtyDelivered(oLine.getQtyDelivered().subtract(Qty));
//					else
//						oLine.setQtyDelivered(oLine.getQtyDelivered().add(Qty));
//					oLine.setDateDelivered(getMovementDate()); // overwrite=last
//				}
//				if (!oLine.save()) {
//					m_processMsg = "Could not update Order Line";
//					return DocAction.STATUS_Invalid;
//				} else
//					log.fine("OrderLine -> Reserved=" + oLine.getQtyReserved()
//							+ ", Delivered=" + oLine.getQtyDelivered());
//			}
//
//			// Create Asset for SO
//			if (product != null && isSOTrx() && product.isCreateAsset()
//					&& sLine.getMovementQty().signum() > 0 && !isReversal()) {
//				log.fine("Asset");
//				info.append("@A_Asset_ID@: ");
//				int noAssets = sLine.getMovementQty().intValue();
//				if (!product.isOneAssetPerUOM())
//					noAssets = 1;
//				for (int i = 0; i < noAssets; i++) {
//					if (i > 0)
//						info.append(" - ");
//					int deliveryCount = i + 1;
//					if (!product.isOneAssetPerUOM())
//						deliveryCount = 0;
//					MAsset asset = new MAsset(this, sLine, deliveryCount);
//					if (!asset.save(get_TrxName())) {
//						m_processMsg = "Could not create Asset";
//						return DocAction.STATUS_Invalid;
//					}
//					info.append(asset.getValue());
//				}
//			} // Asset
//
//			// Matching
//			if (!isSOTrx() && sLine.getM_Product_ID() != 0 && !isReversal()) {
//				BigDecimal matchQty = sLine.getMovementQty();
//				// Invoice - Receipt Match (requires Product)
//				MInvoiceLine iLine = MInvoiceLine.getOfInOutLine(sLine);
//				if (iLine != null && iLine.getM_Product_ID() != 0) {
//					MMatchInv[] matches = MMatchInv.get(getCtx(), sLine
//							.getM_InOutLine_ID(), iLine.getC_InvoiceLine_ID(),
//							get_TrxName());
//					if (matches == null || matches.length == 0) {
//						MMatchInv inv = new MMatchInv(iLine, getMovementDate(),
//								matchQty);
//						if (sLine.getM_AttributeSetInstance_ID() != iLine
//								.getM_AttributeSetInstance_ID()) {
//							iLine.setM_AttributeSetInstance_ID(sLine
//									.getM_AttributeSetInstance_ID());
//							iLine.save(); // update matched invoice with ASI
//							inv.setM_AttributeSetInstance_ID(sLine
//									.getM_AttributeSetInstance_ID());
//						}
//						if (!inv.save(get_TrxName())) {
//							m_processMsg = "Could not create Inv Matching";
//							return DocAction.STATUS_Invalid;
//						}
//					}
//				}
//
//				// Link to Order
//				if (sLine.getC_OrderLine_ID() != 0) {
//					log.fine("PO Matching");
//					// Ship - PO
//					MMatchPO po = MMatchPO.create(null, sLine,
//							getMovementDate(), matchQty);
//					if (!po.save(get_TrxName())) {
//						m_processMsg = "Could not create PO Matching";
//						return DocAction.STATUS_Invalid;
//					}
//					// Update PO with ASI
//					if (oLine != null
//							&& oLine.getM_AttributeSetInstance_ID() == 0) {
//						oLine.setM_AttributeSetInstance_ID(sLine
//								.getM_AttributeSetInstance_ID());
//						oLine.save(get_TrxName());
//					}
//				} else // No Order - Try finding links via Invoice
//				{
//					// Invoice has an Order Link
//					if (iLine != null && iLine.getC_OrderLine_ID() != 0) {
//						// Invoice is created before Shipment
//						log.fine("PO(Inv) Matching");
//						// Ship - Invoice
//						MMatchPO po = MMatchPO.create(iLine, sLine,
//								getMovementDate(), matchQty);
//						if (!po.save(get_TrxName())) {
//							m_processMsg = "Could not create PO(Inv) Matching";
//							return DocAction.STATUS_Invalid;
//						}
//						// Update PO with ASI
//						oLine = new MOrderLine(getCtx(),
//								po.getC_OrderLine_ID(), get_TrxName());
//						if (oLine != null
//								&& oLine.getM_AttributeSetInstance_ID() == 0) {
//							oLine.setM_AttributeSetInstance_ID(sLine
//									.getM_AttributeSetInstance_ID());
//							oLine.save(get_TrxName());
//						}
//					}
//				} // No Order
//			} // PO Matching
//			
////			// Finally invalidate stocks for each involved product.and each costing method.
////			if (product.isCostable()) {
////					// This method take care if a costing methos exist or no , or is supported
////					// invalidating only valid costing methods.
////					ce.invalidateCostForProduct(Env.getAD_Client_ID(getCtx()), 
////							lines[lineIndex].getAD_Org_ID(), 							
////							lines[lineIndex].getM_Product_ID(), 
////							getMovementDate(), get_TrxName());
////			}			
//
//		} // for all lines
//
//		// Counter Documents
//		MInOut counter = createCounterDoc();
//		if (counter != null)
//			info.append(" - @CounterDoc@: @M_InOut_ID@=").append(
//					counter.getDocumentNo());
//		// User Validation
//		String valid = ModelValidationEngine.get().fireDocValidate(this,
//				ModelValidator.TIMING_AFTER_COMPLETE);
//		if (valid != null) {
//			m_processMsg = valid;
//			return DocAction.STATUS_Invalid;
//		}
//
//		m_processMsg = info.toString();
//		setProcessed(true);
//		setDocAction(REF__DocumentAction.Close);
//		return DocAction.STATUS_Completed;
	} // completeIt

	public boolean checkMaterialPolicy() {
		standardcheckMaterialPolicy();
		return true;
	}
	/**
	 * Check Material Policy Sets line ASI
	 */
	private void standardcheckMaterialPolicy() {
		int no = MInOutLineMA.deleteInOutMA(getM_InOut_ID(), get_TrxName());
		if (no > 0)
			log.config("Delete old #" + no);
		MInOutLine[] lines = getLines(false);

		// Incoming Trx
		String MovementType = getMovementType();
		boolean inTrx = MovementType.charAt(1) == '+'; // V+ Vendor Receipt
		MClient client = MClient.get(getCtx());

		// Check Lines
		for (int i = 0; i < lines.length; i++) {
			MInOutLine line = lines[i];
			boolean needSave = false;
			MProduct product = line.getProduct();

			// Need to have Location
			if (product != null && line.getM_Locator_ID() == 0) {
				line.setM_Warehouse_ID(getM_Warehouse_ID());
				line.setM_Locator_ID(inTrx ? Env.ZERO : line.getMovementQty()); // default
				// Locator
				needSave = true;
			}

			// Attribute Set Instance
			if (product != null && line.getM_AttributeSetInstance_ID() == 0) {
				if (inTrx) {
					MAttributeSetInstance asi = new MAttributeSetInstance(
							getCtx(), 0, get_TrxName());
					asi.setClientOrg(getAD_Client_ID(), 0);
					asi.setM_AttributeSet_ID(product.getM_AttributeSet_ID());
					if (asi.save()) {
						line.setM_AttributeSetInstance_ID(asi
								.getM_AttributeSetInstance_ID());
						log.config("New ASI=" + line);
						needSave = true;
					}
				} 
				else // Outgoing Trx
				{
					MProductCategory pc = MProductCategory.get(getCtx(),
							product.getM_Product_Category_ID());
					String MMPolicy = pc.getMMPolicy();
					if (MMPolicy == null || MMPolicy.length() == 0)
						MMPolicy = client.getMMPolicy();
					//
					// me da los lotes con stock disponible
					// si el FiFo es positivo esta ordenado desde el mas antiguo
					// 
					MStorage[] storages = MStorage.getAllWithASI(getCtx(), line
							.getM_Product_ID(), line.getM_Locator_ID(),
							REF__MMPolicy.FiFo.equals(MMPolicy),
							get_TrxName());
					BigDecimal qtyToDeliver = line.getMovementQty();
					for (int ii = 0; ii < storages.length; ii++) {
						MStorage storage = storages[ii];
						if (ii == 0) {
							if (storage.getQtyOnHand().compareTo(qtyToDeliver) >= 0) {
								line.setM_AttributeSetInstance_ID(storage.getM_AttributeSetInstance_ID());
								needSave = true;
								log.config("Direct - " + line);
								qtyToDeliver = Env.ZERO;
							} else {
								log.config("Split - " + line);
								MInOutLineMA ma = new MInOutLineMA(line, storage.getM_AttributeSetInstance_ID(), storage.getQtyOnHand());
								if (!ma.save())
									;
								qtyToDeliver = qtyToDeliver.subtract(storage.getQtyOnHand());
								log.fine("#" + ii + ": " + ma
										+ ", QtyToDeliver=" + qtyToDeliver);
							}
						} else // create addl material allocation
						{
							MInOutLineMA ma = new MInOutLineMA(line, storage
									.getM_AttributeSetInstance_ID(),
									qtyToDeliver);
							if (storage.getQtyOnHand().compareTo(qtyToDeliver) >= 0)
								qtyToDeliver = Env.ZERO;
							else {
								ma.setMovementQty(storage.getQtyOnHand());
								qtyToDeliver = qtyToDeliver.subtract(storage
										.getQtyOnHand());
							}
							if (!ma.save())
								;
							log.fine("#" + ii + ": " + ma + ", QtyToDeliver="
									+ qtyToDeliver);
						}
						if (qtyToDeliver.signum() == 0)
							break;
					} // for all storages

					// No AttributeSetInstance found for remainder
					if (qtyToDeliver.signum() != 0) {
						MInOutLineMA ma = new MInOutLineMA(line, 0,
								qtyToDeliver);
						if (!ma.save())
							;
						log.fine("##: " + ma);
					}
				} // outgoing Trx
			} // attributeSetInstance

			if (needSave && !line.save())
				log.severe("NOT saved " + line);
		} // for all lines
	} // checkMaterialPolicy

	/**************************************************************************
	 * Create Counter Document
	 * 
	 * @return InOut
	 */
	private MInOut createCounterDoc() {
		// Is this a counter doc ?
		if (getRef_InOut_ID() != 0)
			return null;

		// Org Must be linked to BPartner
		MOrg org = MOrg.get(getCtx(), getAD_Org_ID());
		int counterC_BPartner_ID = org.getLinkedC_BPartner_ID(get_TrxName());
		if (counterC_BPartner_ID == 0)
			return null;
		// Business Partner needs to be linked to Org
		MBPartner bp = new MBPartner(getCtx(), getC_BPartner_ID(),
				get_TrxName());
		int counterAD_Org_ID = bp.getAD_OrgBP_ID_Int();
		if (counterAD_Org_ID == 0)
			return null;

		MBPartner counterBP = new MBPartner(getCtx(), counterC_BPartner_ID,
				null);
		MOrgInfo counterOrgInfo = MOrgInfo.get(getCtx(), counterAD_Org_ID);
		log.info("Counter BP=" + counterBP.getName());

		// Document Type
		int C_DocTypeTarget_ID = 0;
		MDocTypeCounter counterDT = MDocTypeCounter.getCounterDocType(getCtx(),
				getC_DocType_ID());
		if (counterDT != null) {
			log.fine(counterDT.toString());
			if (!counterDT.isCreateCounter() || !counterDT.isValid())
				return null;
			C_DocTypeTarget_ID = counterDT.getCounter_C_DocType_ID();
		} else // indirect
		{
			C_DocTypeTarget_ID = MDocTypeCounter.getCounterDocType_ID(getCtx(),
					getC_DocType_ID());
			log.fine("Indirect C_DocTypeTarget_ID=" + C_DocTypeTarget_ID);
			if (C_DocTypeTarget_ID <= 0)
				return null;
		}

		// Deep Copy
		MInOut counter = copyFrom(this, getMovementDate(), C_DocTypeTarget_ID,
				!isSOTrx(), true, get_TrxName(), true);

		//
		counter.setAD_Org_ID(counterAD_Org_ID);
		counter.setM_Warehouse_ID(counterOrgInfo.getM_Warehouse_ID());
		//
		counter.setBPartner(counterBP);
		// Refernces (Should not be required
		counter.setSalesRep_ID(getSalesRep_ID());
		counter.save(get_TrxName());

		String MovementType = counter.getMovementType();
		boolean inTrx = MovementType.charAt(1) == '+'; // V+ Vendor Receipt

		// Update copied lines
		MInOutLine[] counterLines = counter.getLines(true);
		for (int i = 0; i < counterLines.length; i++) {
			MInOutLine counterLine = counterLines[i];
			counterLine.setClientOrg(counter);
			counterLine.setM_Warehouse_ID(counter.getM_Warehouse_ID());
			counterLine.setM_Locator_ID(0);
			counterLine.setM_Locator_ID(inTrx ? Env.ZERO : counterLine
					.getMovementQty());
			//
			counterLine.save(get_TrxName());
		}

		log.fine(counter.toString());

		// Document Action
		if (counterDT != null) {
			if (counterDT.getDocAction() != null) {
				counter.setDocAction(counterDT.getDocAction());
				counter.processIt(counterDT.getDocAction());
				counter.save(get_TrxName());
			}
		}
		return counter;
	} // createCounterDoc

	
	public boolean voidIt() {
		boolean ok = true;		
		try {
			MDocType dt = MDocType.get(getCtx(), getC_DocType_ID());
			Integer C_Period_ID = MPeriod.get(Env.getCtx(), getMovementDate(), getAD_Org_ID(), getAD_Client_ID()).getC_Period_ID();			
			if (!MPeriod.isOpen(getCtx(), getDateAcct(), dt.getDocBaseType(), getAD_Org_ID(), getAD_Client_ID())) {
				throw new Exception ("@PeriodClosed@");
			}

			MAcctSchema as = MClient.get(getCtx(), getAD_Client_ID()).getAcctSchema();
			MCostElement ce = new MCostElement (Env.getCtx(), as.getM_CostElement_ID(), get_TrxName());

			MInOutLine lines[] = getLines();

			//for (int i = 0; i < lines.length; i++) {
			for (MInOutLine line:lines)
			{
				if (line.getM_Product_ID() != 0) 
				{
					MProduct product = line.getProduct();
					if (product.isStocked()) {

						BigDecimal QtyMA = line.getMovementQty().negate();
						if (getMovementType().charAt(1) == '-') // C- Customer
							// Shipment - V-
							// Vendor Return
							QtyMA = QtyMA.negate();
						BigDecimal QtySOMA = Env.ZERO;
						BigDecimal QtyPOMA = Env.ZERO;
						int reservationAttributeSetInstance_ID = 0;

						if (line.getC_OrderLine_ID() != 0 ) {
							/* Update delivered number */
							MOrderLine oLine = new MOrderLine(getCtx(), line.getC_OrderLine_ID(), get_TrxName());
							oLine.setDateDelivered(null);
							reservationAttributeSetInstance_ID = oLine.getM_AttributeSetInstance_ID();
							//oLine.setQtyReserved(oLine.getQtyReserved()
							//		.add(lines[i].getMovementQty())); // ok
							oLine.setQtyDelivered(oLine.getQtyDelivered().subtract(line.getMovementQty()));

							if (!oLine.save())
								throw new Exception ("oLine failed");
						}	
						//
//						String qry = String.format("%s=?", X_M_Transaction.COLUMNNAME_M_InOutLine_ID);
//						X_M_Transaction t = new Query(Env.getCtx(), X_M_Transaction.Table_Name, qry, get_TrxName())
//							.setParameters(line.getM_InOutLine_ID()).first();																	
//						if ( t != null)
//						{
//							t.setDocStatus(DocAction.STATUS_Voided);
//							t.save();
//							StockWorker sw = new StockWorker();
//							sw.setCommand(StockWorker.Product);
//							sw.addProperty(X_M_Transaction.COLUMNNAME_C_Period_ID, C_Period_ID );
//							sw.addProperty(X_M_Transaction.COLUMNNAME_M_Product_ID, product.getM_Product_ID());
//							MStorage.addStockWorker(sw);
//						}
						// Update Storage - see also VMatch.createMatchRecord
						// SO = Sales Order, PO = Purchase Order.
						// QtyMA - diffQtyOnHand add on hand
						// QtySOMA - diffQtyReserved add reserved
						// QtyPOMA - diffQtyOrdered add order
						String error = MStorage.add(getCtx(), line.getM_Warehouse_ID(),
								line.getM_Locator_ID(), 
								line.getM_Product_ID(), 
								line.getM_AttributeSetInstance_ID(),
								reservationAttributeSetInstance_ID, 
								QtyMA, 
								QtySOMA,
								QtyPOMA, 
								isRealtimePOS(), 
								//X_M_InOutLine.Table_ID, 
								//line.getM_InOutLine_ID(),
								C_Period_ID,
								"MInOut.RestoreIt()",
								get_TrxName());						
						// si hay un error buscamos un lote que si tenga stock y hacemos una transferencia
						if (error.length() > 0)
						{
							// si hay stock, transferimos al lote 
							MStorage[] storages = MStorage.getWarehouse(getCtx(), 
									getM_Warehouse_ID(), line.getM_Product_ID(), /*ASI*/ 0, 
									null, false, true, line.getM_Locator_ID(), get_TrxName());

							BigDecimal qty = Env.ZERO;
							BigDecimal TotalQty = Env.ZERO;
							for (int j = 0; j < storages.length; j++)
							{
								TotalQty = TotalQty.add(storages[j].getQtyOnHand());
								if (TotalQty.compareTo(QtyMA.abs()) >= 0)
								{
									break;
								}
							}
							if (TotalQty.compareTo(QtyMA.abs()) >= 0)
							{		
								MMovement movement = new MMovement(Env.getCtx(), 0, get_TrxName());
								movement.setClientOrg(getAD_Client_ID(), getAD_Org_ID());
								movement.setDocAction(DocAction.ACTION_Close);
								movement.setDocStatus(DocAction.STATUS_Completed);
								movement.setDeliveryViaRule(getDeliveryViaRule());
								movement.setDeliveryRule(getDeliveryRule());
								movement.setDateAcct(getDateAcct());
								movement.setIsApproved(true);
								movement.setProcessed(true);
								if (!movement.save())
									throw new XendraException("MovementcantSave");

								TotalQty = Env.ZERO;
								for (int j = 0; j < storages.length; j++)
								{									
									qty = Env.ZERO;
									if (TotalQty.compareTo(QtyMA.abs()) < 0)
									{
										if (TotalQty.add(storages[j].getQtyOnHand()).compareTo(QtyMA.abs()) <= 0)
										{
											qty = storages[j].getQtyOnHand();
											TotalQty = TotalQty.add(qty);
										}
										else if (TotalQty.add(storages[j].getQtyOnHand()).compareTo(QtyMA.abs()) > 0)
										{
											qty = QtyMA.abs().subtract(TotalQty);
											TotalQty = TotalQty.add(qty);
										}
										if (storages[j].getM_AttributeSetInstance_ID() != line.getM_AttributeSetInstance_ID())
										{										
											MMovementLine movline = new MMovementLine(movement);
											movline.setM_Locator_ID(line.getM_Locator_ID());
											movline.setM_LocatorTo_ID(line.getM_Locator_ID());
											movline.setM_Product_ID(line.getM_Product_ID());
											movline.setMovementQty(qty);
											movline.setM_AttributeSetInstance_ID(storages[j].getM_AttributeSetInstance_ID());
											movline.setProcessed(true);
											movline.setM_AttributeSetInstanceTo_ID(line.getM_AttributeSetInstance_ID());
											movline.setC_UOM_ID(line.getC_UOM_ID());
											movline.setQtyEntered(qty);																								
											if (movline.save())
											{
												MStorage storageFrom = MStorage.get(Env.getCtx(), movline.getM_Locator_ID(), 
														movline.getM_Product_ID(), movline.getM_AttributeSetInstance_ID(), get_TrxName());
												if (storageFrom == null)
													storageFrom = MStorage.getCreate(Env.getCtx(), movline.getM_Locator_ID(), 
															movline.getM_Product_ID(), movline.getM_AttributeSetInstance_ID(), get_TrxName());
												//
												MStorage storageTo = MStorage.get(Env.getCtx(), movline.getM_LocatorTo_ID(), 
														movline.getM_Product_ID(), movline.getM_AttributeSetInstanceTo_ID(), get_TrxName());
												if (storageTo == null)
													storageTo = MStorage.getCreate(Env.getCtx(), movline.getM_LocatorTo_ID(), 
															movline.getM_Product_ID(), movline.getM_AttributeSetInstanceTo_ID(), get_TrxName());
												//
												storageFrom.setQtyOnHand(storageFrom.getQtyOnHand().subtract(movline.getMovementQty()));
												if (!storageFrom.save(get_TrxName()))
													throw new XendraException("NotSaveStorageFrom");									
												//								
												storageTo.setQtyOnHand(storageTo.getQtyOnHand().add(movline.getMovementQty()));
												if (!storageTo.save(get_TrxName()))
													throw new XendraException("NotSaveStorageTo");			
											}
										}
									}
								}								
							}
							else
							{
								// no hay stock, igual anulamos,
								// forzando la salida, genera negativos, pero si hizo lo posible
								// por evitarlos.
								error = MStorage.add(getCtx(), line.getM_Warehouse_ID(),
										line.getM_Locator_ID(), 
										line.getM_Product_ID(), 
										line.getM_AttributeSetInstance_ID(),
										reservationAttributeSetInstance_ID, 
										QtyMA, 
										QtySOMA,
										QtyPOMA, 
										/* isRealtimePOS() */ true,  
										C_Period_ID,
										"MInOut.ForceRestoreIt()",
										get_TrxName());						
							}
						}
						// Finally invalidate stocks for each involved product.and each costing method.
//						if (product.isCostable() ) {
//							ce.invalidateCostForProduct(X_M_InOutLine.Table_ID, 
//									line.getM_InOutLine_ID(),
//									line.getM_Product_ID(), 
//									get_TrxName());
//						}
					} // if (product.isStocked()) 
				}
				line.setProcessed(false);
				line.save();
			}
			
			//MStorage.CheckPeriod(C_Period_ID);

			String sql = "DELETE FROM M_MatchPO WHERE M_InOutLine_ID IN (SELECT M_InOutLine_ID FROM M_InOutLine WHERE M_InOut_ID=?)";
			DB.executeUpdate(sql, get_ID(), get_TrxName());

			sql = "DELETE FROM M_MatchInv WHERE M_InOutLine_ID IN (SELECT M_InOutLine_ID FROM M_InOutLine WHERE M_InOut_ID=?)";
			DB.executeUpdate(sql, get_ID(), get_TrxName());

			Doc doc = Doc.get(MAcctSchema.getClientAcctSchema(Env.getCtx(),getAD_Client_ID()),
					MInOut.Table_ID, get_ID(), get_TrxName());
			if (doc != null)
				doc.deleteAcct();

			setDocStatus(DocAction.STATUS_Voided);
			setDocAction(DocAction.ACTION_None);
			setIsCosted(false);
			setProcessing(false);
			setProcessed(true);
			setPosted(true);
			//setIsApproved(false);			
		}
		catch (Exception e)
		{
			setProcessMsg(e.getMessage());
			ok  = false;
		}
		finally 
		{

		}
		return ok;
	}
	
	/**
	 * Void Document.
	 * 
	 * @return true if success
	 */
	public boolean voidIt2() {
		log.info(toString());
		// Before Void
		setProcessMsg(ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_VOID));
		if (getProcessMsg() != null)
			return false;

		if (REF__DocumentStatus.Reversed.equals(getDocStatus())
				|| REF__DocumentStatus.Voided.equals(getDocStatus())
				|| REF__DocumentStatus.Closed.equals(getDocStatus())) {
			setProcessMsg("Document Closed: " + getDocStatus());
			return false;
		}

		// Not Processed
		if (REF__DocumentStatus.Drafted.equals(getDocStatus())
				|| REF__DocumentStatus.Invalid.equals(getDocStatus())
				|| REF__DocumentStatus.InProgress.equals(getDocStatus())
				|| REF__DocumentStatus.Approved.equals(getDocStatus())
				|| REF__DocumentStatus.NotApproved.equals(getDocStatus())
				|| REF__DocumentStatus.Completed.equals(getDocStatus())) {
			if (REF__DocumentStatus.Completed.equals(getDocStatus())) {
				// 
				if (!RestoreIt())
					return false;
			}
			// Set lines to 0
			MInOutLine[] lines = getLines(false);
			for (int i = 0; i < lines.length; i++) {
				MInOutLine line = lines[i];
				BigDecimal old = line.getMovementQty();
				if (old.signum() != 0) {
					line.setQty(Env.ZERO);
					// line.setC_OrderLine_ID(0);
					line.addDescription("Void (" + old + ")");
					line.save(get_TrxName());
				}
			}
		} else {
			// return reverseCorrectIt();
			MDocType dt = MDocType.get(getCtx(), getC_DocType_ID());
			if (!MPeriod.isOpen(getCtx(), getDateAcct(), dt.getDocBaseType(), getAD_Org_ID(), getAD_Client_ID())) {
				setProcessMsg("@PeriodClosed@");
				return false;
			}

			MInOutLine[] sLines = getLines(false);
			for (int i = 0; i < sLines.length; i++) {
				MInOutLine rLine = sLines[i];
				rLine.setQtyEntered(Env.ZERO);
				rLine.setMovementQty(Env.ZERO);
				// rLine.setC_OrderLine_ID(0);
				// rLine.setM_AttributeSetInstance_ID(rLine.getM_AttributeSetInstance_ID());
				if (!rLine.save(get_TrxName())) {
					setProcessMsg("Could not correct Ship Line");
					return false;
				}
				// We need to copy MA
				if (rLine.getM_AttributeSetInstance_ID() != 0) {
					MInOutLineMA mas[] = MInOutLineMA.get(getCtx(), sLines[i]
							.getM_InOutLine_ID(), get_TrxName());
					for (int j = 0; j < mas.length; j++) {
						MInOutLineMA ma = new MInOutLineMA(rLine, mas[j]
								.getM_AttributeSetInstance_ID(), Env.ZERO);
						if (!ma.save())
							;
					}
					rLine.setM_AttributeSetInstance_ID(0);
				}
				// De-Activate Asset
				MAsset asset = MAsset.getFromShipment(getCtx(), sLines[i]
						.getM_InOutLine_ID(), get_TrxName());
				if (asset != null) {
					asset.setIsActive(false);
					asset.addDescription("(" + getDocumentNo() + " #"
							+ rLine.getLine() + "<-)");
					asset.save();
				}
			}

			// After reverseCorrect
			setProcessMsg(ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_AFTER_REVERSECORRECT));
			if (getProcessMsg() != null)
				return false;

			// m_processMsg = reversal.getDocumentNo();
			setProcessed(true);
			setDocStatus(REF__DocumentStatus.Voided); // may come from void
			setDocAction(REF__DocumentAction.None);
			return true;

		}

		// After Void
		setProcessMsg(ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_VOID));
		if (getProcessMsg() != null)
			return false;

		setProcessed(true);
		setDocAction(REF__DocumentAction.None);
		setDocStatus(REF__DocumentAction.Void);
		return true;
	} // voidIt

	/**
	 * Close Document.
	 * 
	 * @return true if success
	 */
	public boolean closeIt() {
		log.info(toString());
		// Before Close
		setProcessMsg(ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_BEFORE_CLOSE));
		if (getProcessMsg() != null)
			return false;

		// After Close
		setProcessMsg(ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_AFTER_CLOSE));
		if (getProcessMsg() != null)
			return false;

		setProcessed(true);
		setDocAction(REF__DocumentAction.None);
		return true;
	} // closeIt

	/**
	 * Reverse Correction - same date
	 * 
	 * @return true if success
	 */
	public boolean reverseCorrectIt() {
		log.info(toString());
		// Before reverseCorrect
		setProcessMsg(ModelValidationEngine.get().fireDocValidate(this,	ModelValidator.TIMING_BEFORE_REVERSECORRECT));
		if (getProcessMsg() != null)
			return false;

		MDocType dt = MDocType.get(getCtx(), getC_DocType_ID());
		if (!MPeriod.isOpen(getCtx(), getDateAcct(), dt.getDocBaseType(), getAD_Org_ID(), getAD_Client_ID())) {
			setProcessMsg("@PeriodClosed@");
			return false;
		}

		// Reverse/Delete Matching
		if (!isSOTrx()) {
			MMatchInv[] mInv = MMatchInv.getInOut(getCtx(), getM_InOut_ID(),
					get_TrxName());
			for (int i = 0; i < mInv.length; i++)
				mInv[i].delete(true);
			MMatchPO[] mPO = MMatchPO.getInOut(getCtx(), getM_InOut_ID(),
					get_TrxName());
			for (int i = 0; i < mPO.length; i++) {
				if (mPO[i].getC_InvoiceLine_ID() == 0)
					mPO[i].delete(true);
				else {
					mPO[i].setM_InOutLine_ID(0);
					mPO[i].save();

				}
			}
		}

		// Deep Copy
		MInOut reversal = copyFrom(this, getMovementDate(), getC_DocType_ID(),
				isSOTrx(), false, get_TrxName(), true);
		if (reversal == null) {
			setProcessMsg("Could not create Ship Reversal");
			return false;
		}
		reversal.setReversal(true);

		// Reverse Line Qty
		MInOutLine[] sLines = getLines(false);
		MInOutLine[] rLines = reversal.getLines(false);
		for (int i = 0; i < rLines.length; i++) {
			MInOutLine rLine = rLines[i];
			rLine.setQtyEntered(rLine.getQtyEntered().negate());
			rLine.setMovementQty(rLine.getMovementQty().negate());
			rLine.setM_AttributeSetInstance_ID(sLines[i]
					.getM_AttributeSetInstance_ID());
			if (!rLine.save(get_TrxName())) {
				setProcessMsg("Could not correct Ship Reversal Line");
				return false;
			}
			// We need to copy MA
			if (rLine.getM_AttributeSetInstance_ID() == 0) {
				MInOutLineMA mas[] = MInOutLineMA.get(getCtx(), sLines[i]
						.getM_InOutLine_ID(), get_TrxName());
				for (int j = 0; j < mas.length; j++) {
					MInOutLineMA ma = new MInOutLineMA(rLine, mas[j]
							.getM_AttributeSetInstance_ID(), mas[j]
							.getMovementQty().negate());
					if (!ma.save())
						;
				}
			}
			// De-Activate Asset
			MAsset asset = MAsset.getFromShipment(getCtx(), sLines[i]
					.getM_InOutLine_ID(), get_TrxName());
			if (asset != null) {
				asset.setIsActive(false);
				asset.addDescription("(" + reversal.getDocumentNo() + " #"
						+ rLine.getLine() + "<-)");
				asset.save();
			}
		}
		reversal.setC_Order_ID(getC_Order_ID());
		reversal.addDescription("{->" + getDocumentNo() + ")");
		//
		if (!reversal.processIt(DocAction.ACTION_Complete)
				|| !reversal.getDocStatus().equals(DocAction.STATUS_Completed)) {
			setProcessMsg("Reversal ERROR: " + reversal.getProcessMsg());
			return false;
		}
		reversal.closeIt();
		reversal.setProcessing(false);
		reversal.setDocStatus(REF__DocumentStatus.Reversed);
		reversal.setDocAction(REF__DocumentAction.None);
		reversal.save(get_TrxName());
		//
		addDescription("(" + reversal.getDocumentNo() + "<-)");

		// After reverseCorrect
		setProcessMsg(ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_AFTER_REVERSECORRECT));
		if (getProcessMsg() != null)
			return false;

		setProcessMsg(reversal.getDocumentNo());
		setProcessed(true);
		setDocStatus(REF__DocumentStatus.Reversed); // may come from void
		setDocAction(REF__DocumentAction.None);
		return true;
	} // reverseCorrectionIt

	/**
	 * Reverse Accrual - none
	 * 
	 * @return false
	 */
	public boolean reverseAccrualIt() {
		log.info(toString());
		// Before reverseAccrual
		setProcessMsg(ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_BEFORE_REVERSEACCRUAL));
		if (getProcessMsg() != null)
			return false;

		// After reverseAccrual
		setProcessMsg(ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_AFTER_REVERSEACCRUAL));
		if (getProcessMsg() != null)
			return false;

		return false;
	} // reverseAccrualIt

	/**
	 * Re-activate
	 * 
	 * @return false
	 */
	public boolean reActivateIt() {
		log.info(toString());
		// Before reActivate
		setProcessMsg(ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_BEFORE_REACTIVATE));
		if (getProcessMsg() != null)
			return false;

		// After reActivate
		setProcessMsg(ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_AFTER_REACTIVATE));
		if (getProcessMsg() != null)
			return false;

		return false;
	} // reActivateIt

	/**
	 * Executed before Delete operation.
	 * 
	 * @return true if record can be deleted
	 */
	protected boolean beforeDelete() {
		
		if (!getDocStatus().equals(REF__DocumentStatus.Drafted))
			return false;		
		
		String sql = "DELETE FROM M_MatchPO WHERE M_InOutLine_ID IN (SELECT M_InOutLine_ID FROM M_InOutLine WHERE M_InOut_ID=?)";
		int no = DB.executeUpdate(sql, get_ID(), get_TrxName());
		if (no == 1)
			return false;

		sql = "DELETE FROM M_MatchInv WHERE M_InOutLine_ID IN (SELECT M_InOutLine_ID FROM M_InOutLine WHERE M_InOut_ID=?)";
		no = DB.executeUpdate(sql, get_ID(), get_TrxName());
		if (no == 1)
			return false;
		
		return true;
	} // beforeDelete

	/*************************************************************************
	 * Get Summary
	 * 
	 * @return Summary of Document
	 */
	public String getSummary() {
		StringBuffer sb = new StringBuffer();
		sb.append(getDocumentNo());
		// : Total Lines = 123.00 (#1)
		sb.append(":")
		// .append(Msg.translate(getCtx(),"TotalLines")).append("=").append(getTotalLines())
				.append(" (#").append(getLines(false).length).append(")");
		// - Description
		if (getDescription() != null && getDescription().length() > 0)
			sb.append(" - ").append(getDescription());
		return sb.toString();
	} // getSummary

	/**
	 * Get Process Message
	 * 
	 * @return clear text error message
	 */
	public String getProcessMsg() {
		return m_processMsg;
	} // getProcessMsg

	/**
	 * Get Document Owner (Responsible)
	 * 
	 * @return AD_User_ID
	 */
	public int getDoc_User_ID() {
		return getSalesRep_ID();
	} // getDoc_User_ID

	/**
	 * Get Document Approval Amount
	 * 
	 * @return amount
	 */
	public BigDecimal getApprovalAmt() {
		return Env.ZERO;
	} // getApprovalAmt

	/**
	 * Get C_Currency_ID
	 * 
	 * @return Accounting Currency
	 */
	public int getC_Currency_ID() {
		return Env.getContextAsInt(getCtx(), "$C_Currency_ID ");
	} // getC_Currency_ID

	/**
	 * Document Status is Complete or Closed
	 * 
	 * @return true if CO, CL or RE
	 */
	public boolean isComplete() {
		String ds = getDocStatus();
		return REF__DocumentStatus.Completed.equals(ds) || REF__DocumentStatus.Closed.equals(ds)
				|| REF__DocumentStatus.Reversed.equals(ds);
	} // isComplete

	public boolean RestoreIt() {
		boolean IsOK = true;		
		try {
			MDocType dt = MDocType.get(getCtx(), getC_DocType_ID());
			Integer C_Period_ID = MPeriod.get(Env.getCtx(), getMovementDate(), getAD_Org_ID(), getAD_Client_ID()).getC_Period_ID();
			if (!MPeriod.isOpen(getCtx(), getDateAcct(), dt.getDocBaseType(), getAD_Org_ID(), getAD_Client_ID())) {
				throw new Exception ("@PeriodClosed@");
			}
			setIsCosted(false);
			MInOutLine lines[] = getLines();

			for (int i = 0; i < lines.length; i++) {

				if (lines[i].getM_Product_ID() != 0) {
					MProduct product = lines[i].getProduct();

					if (product.isStocked()) {

						BigDecimal QtyMA = lines[i].getMovementQty().negate();
						if (getMovementType().charAt(1) == '-') // C- Customer
							// Shipment - V-
							// Vendor Return
							QtyMA = QtyMA.negate();
						BigDecimal QtySOMA = Env.ZERO;
						BigDecimal QtyPOMA = Env.ZERO;
						int reservationAttributeSetInstance_ID = 0;
						//
						if (lines[i].getC_OrderLine_ID() != 0 ) {
							/* Update delivered number */
							MOrderLine oLine = new MOrderLine(getCtx(), lines[i].getC_OrderLine_ID(), get_TrxName());
							oLine.setDateDelivered(null);
							reservationAttributeSetInstance_ID = oLine.getM_AttributeSetInstance_ID();
							//oLine.setQtyReserved(oLine.getQtyReserved()
							//		.add(lines[i].getMovementQty())); // ok
							oLine.setQtyDelivered(oLine.getQtyDelivered().subtract(lines[i].getMovementQty()));
							
							if (!oLine.save())
								throw new Exception ("oLine failed");
							
						}
						
						// Update Storage - see also VMatch.createMatchRecord
						// SO = Sales Order, PO = Purchase Order.
						// QtyMA - diffQtyOnHand add on hand
						// QtySOMA - diffQtyReserved add reserved
						// QtyPOMA - diffQtyOrdered add order
						String error = MStorage.add(getCtx(), lines[i].getM_Warehouse_ID(),
								lines[i].getM_Locator_ID(), 
								lines[i].getM_Product_ID(), 
								lines[i].getM_AttributeSetInstance_ID(),
								reservationAttributeSetInstance_ID, 
								QtyMA, 
								QtySOMA,
								QtyPOMA, 
								isRealtimePOS(), 
								C_Period_ID,
								"MInOut.RestoreIt()",
								get_TrxName());						
						// si hay un error buscamos un lote que si tenga stock y hacemos una transferencia
						if (error.length() > 0)
						{
							// si hay stock, transferimos al lote 
							MStorage[] storages = MStorage.getWarehouse(getCtx(), 
									getM_Warehouse_ID(), lines[i].getM_Product_ID(), /*ASI*/ 0, 
									null, false, true, lines[i].getM_Locator_ID(), get_TrxName());
																					
							BigDecimal qty = Env.ZERO;
							BigDecimal TotalQty = Env.ZERO;
							for (int j = 0; j < storages.length; j++)
							{
								TotalQty = TotalQty.add(storages[j].getQtyOnHand());
								if (TotalQty.compareTo(QtyMA.abs()) >= 0)
								{
									break;
								}
							}
							if (TotalQty.compareTo(QtyMA.abs()) >= 0)
							{		
								MMovement movement = new MMovement(Env.getCtx(), 0, get_TrxName());
								movement.setClientOrg(getAD_Client_ID(), getAD_Org_ID());
								movement.setDocAction(DocAction.ACTION_Close);
								movement.setDocStatus(DocAction.STATUS_Completed);
								movement.setDeliveryViaRule(getDeliveryViaRule());
								movement.setDeliveryRule(getDeliveryRule());
								movement.setDateAcct(getDateAcct());
								movement.setIsApproved(true);
								movement.setProcessed(true);
								if (!movement.save())
									throw new XendraException("MovementcantSave");
								
								TotalQty = Env.ZERO;
								for (int j = 0; j < storages.length; j++)
								{									
									qty = Env.ZERO;
									if (TotalQty.compareTo(QtyMA.abs()) < 0)
									{
										if (TotalQty.add(storages[j].getQtyOnHand()).compareTo(QtyMA.abs()) <= 0)
										{
											qty = storages[j].getQtyOnHand();
											TotalQty = TotalQty.add(qty);
										}
										else if (TotalQty.add(storages[j].getQtyOnHand()).compareTo(QtyMA.abs()) > 0)
										{
											qty = QtyMA.abs().subtract(TotalQty);
											TotalQty = TotalQty.add(qty);
										}
										if (storages[j].getM_AttributeSetInstance_ID() != lines[i].getM_AttributeSetInstance_ID())
										{										
											MMovementLine line = new MMovementLine(movement);
											line.setM_Locator_ID(lines[i].getM_Locator_ID());
											line.setM_LocatorTo_ID(lines[i].getM_Locator_ID());
											line.setM_Product_ID(lines[i].getM_Product_ID());
											line.setMovementQty(qty);
											line.setM_AttributeSetInstance_ID(storages[j].getM_AttributeSetInstance_ID());
											line.setProcessed(true);
											line.setM_AttributeSetInstanceTo_ID(lines[i].getM_AttributeSetInstance_ID());
											line.setC_UOM_ID(lines[i].getC_UOM_ID());
											line.setQtyEntered(qty);																								
											if (line.save())
											{
												MStorage storageFrom = MStorage.get(Env.getCtx(), line.getM_Locator_ID(), 
														line.getM_Product_ID(), line.getM_AttributeSetInstance_ID(), get_TrxName());
												if (storageFrom == null)
													storageFrom = MStorage.getCreate(Env.getCtx(), line.getM_Locator_ID(), 
															line.getM_Product_ID(), line.getM_AttributeSetInstance_ID(), get_TrxName());
												//
												MStorage storageTo = MStorage.get(Env.getCtx(), line.getM_LocatorTo_ID(), 
														line.getM_Product_ID(), line.getM_AttributeSetInstanceTo_ID(), get_TrxName());
												if (storageTo == null)
													storageTo = MStorage.getCreate(Env.getCtx(), line.getM_LocatorTo_ID(), 
															line.getM_Product_ID(), line.getM_AttributeSetInstanceTo_ID(), get_TrxName());
												//
												storageFrom.setQtyOnHand(storageFrom.getQtyOnHand().subtract(line.getMovementQty()));
												if (!storageFrom.save(get_TrxName()))
													throw new XendraException("NotSaveStorageFrom");									
												//								
												storageTo.setQtyOnHand(storageTo.getQtyOnHand().add(line.getMovementQty()));
												if (!storageTo.save(get_TrxName()))
													throw new XendraException("NotSaveStorageTo");			
											}
										}
									}
								}								
							}
							else
							{
								// no hay stock, igual anulamos,
								// forzando la salida, genera negativos, pero si hizo lo posible
								// por evitarlos.
								error = MStorage.add(getCtx(), lines[i].getM_Warehouse_ID(),
										lines[i].getM_Locator_ID(), 
										lines[i].getM_Product_ID(), 
										lines[i].getM_AttributeSetInstance_ID(),
										reservationAttributeSetInstance_ID, 
										QtyMA, 
										QtySOMA,
										QtyPOMA, 
										/* isRealtimePOS() */ true,										
										C_Period_ID,
										"MInOut.ForceRestoreIt()",
										get_TrxName());						
							}
						}
					} // if (product.isStocked()) 
				}
				X_M_Transaction t = new Query(Env.getCtx(), X_M_Transaction.Table_Name, "M_InOutLine_ID = ?", null)
				.setParameters(lines[i].getM_InOutLine_ID()).first();
				if (t != null)
				{
					if (t.isProcessed())
					{
						t.setProcessed(false);
						t.save();
					}
				}
				//
				//
				lines[i].setProcessed(false);
				lines[i].save();
			}
			String sql = "DELETE FROM M_MatchPO WHERE M_InOutLine_ID IN (SELECT M_InOutLine_ID FROM M_InOutLine WHERE M_InOut_ID=?)";
			DB.executeUpdate(sql, get_ID(), get_TrxName());

			sql = "DELETE FROM M_MatchInv WHERE M_InOutLine_ID IN (SELECT M_InOutLine_ID FROM M_InOutLine WHERE M_InOut_ID=?)";
			DB.executeUpdate(sql, get_ID(), get_TrxName());

			Doc doc = Doc.get(MAcctSchema.getClientAcctSchema(Env.getCtx(),getAD_Client_ID()),
					MInOut.Table_ID, get_ID(), get_TrxName());
			if (doc != null)
				doc.deleteAcct();

			setDocStatus("DR");
			setDocAction("CO");
			setProcessing(false);
			setProcessed(false);
			setPosted(false);
			setIsApproved(false);			
			setIsCosted(false);
			MPeriod period = MPeriod.get(Env.getCtx(), getMovementDate(), getAD_Org_ID(), getAD_Client_ID());
		}
		catch (Exception e)
		{
			setProcessMsg(e.getMessage());
			IsOK  = false;
		}
		finally 
		{
			
		}
		return IsOK;
	}

	public static MInOut getbyC_Invoice_ID(int C_Invoice_ID,String trxName) {
		String where = "C_Invoice_ID = "+C_Invoice_ID;
		MInOut io = new Query(Env.getCtx(), X_M_InOut.Table_Name, where, trxName).first();
		return io;
	}

	public MOrderLine[] getOrderLines() {
		MOrderLine[] lines = null;
		ArrayList<MOrderLine> list = new ArrayList<MOrderLine>();
		MInOutLine[] fromLines = getLines(false);
		for (MInOutLine oline:fromLines)
		{
			list.add(new MOrderLine(Env.getCtx(), oline.getC_OrderLine_ID(), this.get_TrxName())); 
		}
		lines = new MOrderLine[list.size()];
		list.toArray(lines);
		return lines;		
	}

	public void setProcessMsg(String msg)
	{
		m_processMsg = msg;
	}	
} // MInOut
