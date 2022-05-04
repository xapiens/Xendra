package org.xendra.standard.rules;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Map.Entry;
import java.util.logging.Level;

import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MAttributeSet;
import org.compiere.model.MBPartner;
import org.compiere.model.MClient;
import org.compiere.model.MClientInfo;
import org.compiere.model.MColumn;
import org.compiere.model.MDocType;
import org.compiere.model.MInOut;
import org.compiere.model.MInOutLine;
import org.compiere.model.MInvoice;
import org.compiere.model.MInvoiceLine;
import org.compiere.model.MOrder;
import org.compiere.model.MOrderLine;
import org.compiere.model.MProduct;
import org.compiere.model.MProductPricing;
import org.compiere.model.MStorage;
import org.compiere.model.MTable;
import org.compiere.model.MWarehouse;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_User;
import org.compiere.model.persistence.X_C_DocTypeGroup;
import org.compiere.model.persistence.X_C_OrderLine;
import org.compiere.model.persistence.X_M_InOutLine;
import org.compiere.model.persistence.X_M_Stock_Picker;
import org.compiere.model.reference.REF_C_BPartnerSOCreditStatus;
import org.compiere.model.reference.REF_C_DocTypeSubType;
import org.compiere.model.reference.REF_C_OrderInvoiceRule;
import org.compiere.model.reference.REF_M_TransactionMovementType;
import org.compiere.model.reference.REF__DocumentStatus;
import org.compiere.process.DocAction;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.optaplanner.core.api.solver.Solver;
import org.optaplanner.core.api.solver.SolverFactory;
import org.xendra.planner.pickup.Picker;
import org.xendra.planner.pickup.PickupDesignation;
import org.xendra.planner.pickup.PickupList;
import java.sql.Timestamp;
import org.compiere.model.Tax;

public class Policy {

	private static Policy m_Policy;
	protected transient CLogger	log = CLogger.getCLogger (getClass());
	private Solver m_pickupsolver;
	private MClientInfo m_info;

	public static Policy getInstance() {
		if (m_Policy == null)
			m_Policy = new Policy();
		return m_Policy;
	}	

	Policy() {
		MClient client = MClient.get(Env.getCtx());
		m_info = client.getInfo();		
		
	}

	public static void main(String[] args) {
		org.compiere.Xendra.startup(true);
		Policy pol = new Policy();
		pol.optimizePickup(2741415);
	}

	public boolean checkattributes(MInOut inout)
	{
		boolean attrib = true;
		BigDecimal Volume = Env.ZERO;
		BigDecimal Weight = Env.ZERO;

		try {
			MInOutLine[] lines = inout.getLines(true);
			StringBuilder products = new StringBuilder("@M_AttributeSet_ID@ @IsMandatory@ \n");
			int hash = 0;
			for (MInOutLine line:lines)
			{
				MProduct product = line.getProduct();
				if (product != null) {
					Volume = Volume.add(product.getVolume().multiply(line.getMovementQty()));
					Weight = Weight.add(product.getWeight().multiply(line.getMovementQty()));
				}
				//
				if (line.getM_AttributeSetInstance_ID() != 0)
					continue;
				if (product != null) {
					int M_AttributeSet_ID = product.getM_AttributeSet_ID();
					if (M_AttributeSet_ID != 0) {
						MAttributeSet mas = MAttributeSet.get(inout.getCtx(),	M_AttributeSet_ID, inout.get_TrxName());
						if (mas != null	&& ((inout.isSOTrx() && mas.isMandatory()) || (!inout.isSOTrx() && mas.isMandatoryAlways()))) {
							products.append("@Line@ #"+ line.getLine()+ ", (@M_Product_ID@="+ product.getValue() + ")\n");
							hash = products.hashCode();
						}
					}
				}			
			}
			if (hash > 0)
			{
				throw new Exception(products.toString());									
			}
		}
		catch (Exception e)
		{
			inout.setProcessMsg(e.getMessage());			
			e.printStackTrace();
			attrib = false;
		}
		return attrib;
	}

	public boolean checkcredit(MInOut inout) 
	{
		if (inout.isSOTrx() && !inout.isReversal() && m_info.getC_BPartnerCashTrx_ID() != inout.getC_BPartner_ID())	
		{
			MBPartner bp = new MBPartner (inout.getCtx(), inout.getC_BPartner_ID(), inout.get_TrxName());
			if (REF_C_BPartnerSOCreditStatus.NoCreditCheck.equals(bp.getSOCreditStatus()))
			{
				return true;
			}
			if (REF_C_BPartnerSOCreditStatus.CreditStop.equals(bp.getSOCreditStatus()))		
			{
				inout.setProcessMsg("@BPartnerCreditStop@ - @TotalOpenBalance@=" 
						+ bp.getTotalOpenBalance()
						+ ", @SO_CreditLimit@=" + bp.getSO_CreditLimit());
				inout.setRulestatus(DocAction.STATUS_Invalid);
				return false;
			}
			if (REF_C_BPartnerSOCreditStatus.CreditHold.equals(bp.getSOCreditStatus()))		
			{
				inout.setProcessMsg("@BPartnerCreditHold@ - @TotalOpenBalance@=" 
						+ bp.getTotalOpenBalance() 
						+ ", @SO_CreditLimit@=" + bp.getSO_CreditLimit());
				inout.setRulestatus(DocAction.STATUS_Invalid);
				return false;
			}
			BigDecimal notInvoicedAmt = MBPartner.getNotInvoicedAmt(inout.getC_BPartner_ID());
			if (REF_C_BPartnerSOCreditStatus.CreditHold.equals(bp.getSOCreditStatus(notInvoicedAmt))) 
			{
				inout.setProcessMsg("@BPartnerOverSCreditHold@ - @TotalOpenBalance@="
						+ bp.getTotalOpenBalance()
						+ ", @NotInvoicedAmt@="
						+ notInvoicedAmt
						+ ", @SO_CreditLimit@="
						+ bp.getSO_CreditLimit());

				inout.setRulestatus(DocAction.STATUS_Invalid);
				return false;
			}	
		}
		return true;
	}

//	public boolean createShipmentFromInvoice(MOrder order)
//	{
//		boolean createdshipment = true;
//		try {
//			List<MInvoice> invoices = new ArrayList<MInvoice>();
//			MDocType dt = MDocType.get(order.getCtx(), order.getC_DocType_ID());
//			//MDocType dtship = MDocType.get(order.getCtx(),dt.getC_DocTypeShipment_ID());
//			MOrderLine[] lines = order.getLines();
//			for (MOrderLine line:lines)
//			{
//				MInvoiceLine iline = new Query(Env.getCtx(), X_C_InvoiceLine.Table_Name, "C_OrderLine_ID = ?", order.get_TrxName())
//				.setParameters(line.getC_OrderLine_ID()).first();
//				if (iline != null)
//				{
//					MInvoice invoice = new MInvoice(Env.getCtx(), iline.getC_Invoice_ID(), order.get_TrxName());
//					if (!invoices.contains(invoice))
//						invoices.add(invoice);
//				}
//			}
//			if (invoices.size() > 0)
//			{
//				for (MInvoice invoice:invoices)
//				{
//					String DocSubType = dt.getDocSubType();
//					MInOut shipment = new MInOut (order, dt.getC_DocTypeShipment_ID(), order.getDateOrdered());
//					if (REF_C_DocTypeSubType.ReturnMaterial.equals(DocSubType))
//					{
//						shipment.setMovementType(REF_M_TransactionMovementType.VendorReceipts);			
//					}
//					if (!shipment.save(order.get_TrxName()))
//					{				
//						throw new Exception("Could not create Shipment");
//					}
//					MInvoiceLine[] ilines = invoice.getLines();
//					for (MInvoiceLine iline:ilines)
//					{
//						MOrderLine oLine = new Query(Env.getCtx(), X_C_OrderLine.Table_Name, "C_OrderLine_ID = ?", order.get_TrxName())
//						.setParameters(iline.getC_OrderLine_ID()).first(); 
//						MInOutLine ioLine = new MInOutLine(shipment);
//						//	Qty = Ordered - Delivered
//						BigDecimal MovementQty = oLine.getQtyOrdered().subtract(oLine.getQtyDelivered()); 
//						//	Location
//						int M_Locator_ID = MStorage.getM_Locator_ID (oLine.getM_Warehouse_ID(), 
//								oLine.getM_Product_ID(), oLine.getM_AttributeSetInstance_ID(), 
//								MovementQty, order.get_TrxName());
//						if (M_Locator_ID == 0)		//	Get default Location
//						{
//							MWarehouse wh = MWarehouse.get(order.getCtx(), oLine.getM_Warehouse_ID());
//							M_Locator_ID = wh.getDefaultLocator().getM_Locator_ID();
//						}
//						//
//						ioLine.setOrderLine(oLine, M_Locator_ID, MovementQty);
//						ioLine.setQty(MovementQty);
//						if (oLine.getQtyEntered().compareTo(oLine.getQtyOrdered()) != 0)
//							ioLine.setQtyEntered(MovementQty
//									.multiply(oLine.getQtyEntered())
//									.divide(oLine.getQtyOrdered(), 6, BigDecimal.ROUND_HALF_UP));				
//						if (!ioLine.save(order.get_TrxName()))
//						{					
//							throw new Exception("Could not create Shipment Line");
//						}
//					}					
//					//	Manually Process Shipment
//					String status = shipment.completeIt();
//					shipment.setDocStatus(status);
//					shipment.save(order.get_TrxName());
//					if (!REF__DocumentStatus.Completed.equals(status))
//					{				
//						throw new Exception("@M_InOut_ID@: " + shipment.getProcessMsg());
//					}
//					else
//					{
//
//					}					
//				}
//			}			
//		}
//		catch (Exception e)
//		{
//			order.setProcessMsg(e.getMessage());
//			createdshipment = false;
//		}
//		return createdshipment;		
//	}

	public boolean createShipment(MOrder order)
	{
		boolean createdshipment = true;
		try {		
			MDocType dt = MDocType.get(order.getCtx(), order.getC_DocType_ID());
			MDocType dtship = MDocType.get(order.getCtx(),dt.getC_DocTypeShipment_ID());
			MOrderLine[] oLines = order.getLines(true, null);
			//		if (order.getDeliveryViaRule().equals(REF_C_OrderDeliveryViaRule.Delivery)  
			//				|| order.getDeliveryViaRule().equals(REF_C_OrderDeliveryViaRule.Shipper))
			//		{
			//			optimizePickup(order.getC_Order_ID());
			//		}		
			BigDecimal maxamt = dtship.getMaxAmt();
			int linecount = dtship.getLineCount().intValue();		
			HashMap<Integer, List> map = new HashMap<Integer, List>();		
			for (MOrderLine oLine:oLines)
			{
				MProduct product = MProduct.get(Env.getCtx(), oLine.getM_Product_ID(), null);
				int TaxCategory = product.getC_TaxCategory_ID();
				if (!dtship.isSplitByTax())
					TaxCategory = 0;
				if (!map.containsKey(TaxCategory))
				{
					List<MOrderLine> lines = new ArrayList<MOrderLine>();
					lines.add(oLine);
					map.put(TaxCategory, lines);
				}
				else
				{
					List<MOrderLine> lines = map.get(TaxCategory);
					lines.add(oLine);
					map.put(TaxCategory, lines);
				}
			}
			List<MOrderLine> shiplines = new ArrayList<MOrderLine>();
			Iterator iter = map.entrySet().iterator(); 
			while (iter.hasNext())
			{
				Map.Entry entry = (Map.Entry) iter.next();
				Integer key = (Integer) entry.getKey();			
				BigDecimal amt = BigDecimal.ZERO;
				int linecurrent = 1;	
				List<MOrderLine> lines = map.get(key);
				for (MOrderLine oLine:lines)
				{
					amt = amt.add(oLine.getLineNetAmt());							
					if ( (maxamt.compareTo(BigDecimal.ZERO) == 1 && amt.compareTo(maxamt) == 1) || 
							(linecount > 0 && linecurrent == linecount) )
					{
						String errormsg = createShipment(order, shiplines);
						if (errormsg.length() == 0)
						{
							shiplines.clear();					
							linecurrent = 0;
						}
						else
						{
							throw new Exception(errormsg);
						}
					}
					shiplines.add(oLine);
					linecurrent ++;
				}			
			}
			if (shiplines.size() > 0)
			{
				String errormsg = createShipment(order, shiplines);
				if (errormsg.length() == 0)
				{
					shiplines.clear();
				}
				else
				{
					throw new Exception(errormsg);
				}
			}
		}
		catch (Exception e)
		{
			order.setProcessMsg(e.getMessage());
			createdshipment = false;
		}
		return createdshipment;
	}	//	createShipment


	private String createShipment(MOrder order, List<MOrderLine> shiplines) {
		String errormsg = "";
		try {
			MDocType dt = MDocType.get(order.getCtx(), order.getC_DocType_ID());
			String DocSubType = dt.getDocSubType();
			MInOut shipment = new MInOut (order, dt.getC_DocTypeShipment_ID(), order.getDateOrdered());
			if (!shipment.save(order.get_TrxName()))
			{				
				throw new Exception("Could not create Shipment");
			}
			//
			//MOrderLine[] oLines = order.getLines(true, null);
			for (MOrderLine oLine:shiplines)
			{		
				MInOutLine ioLine = new MInOutLine(shipment);
				//	Qty = Ordered - Delivered
				BigDecimal MovementQty = oLine.getQtyOrdered().subtract(oLine.getQtyDelivered()); 
				//	Location
				int M_Locator_ID = MStorage.getM_Locator_ID (oLine.getM_Warehouse_ID(), 
						oLine.getM_Product_ID(), oLine.getM_AttributeSetInstance_ID(), 
						MovementQty, order.get_TrxName());
				if (M_Locator_ID == 0)		//	Get default Location
				{
					MWarehouse wh = MWarehouse.get(order.getCtx(), oLine.getM_Warehouse_ID());
					M_Locator_ID = wh.getDefaultLocator().getM_Locator_ID();
				}
				//
				ioLine.setOrderLine(oLine, M_Locator_ID, MovementQty);
				ioLine.setQty(MovementQty);
				if (oLine.getQtyEntered().compareTo(oLine.getQtyOrdered()) != 0)
					ioLine.setQtyEntered(MovementQty
							.multiply(oLine.getQtyEntered())
							.divide(oLine.getQtyOrdered(), 6, BigDecimal.ROUND_HALF_UP));				
				if (!ioLine.save(order.get_TrxName()))
				{					
					throw new Exception("Could not create Shipment Line");
				}
			}
			//	Manually Process Shipment
			String status = shipment.completeIt();
			shipment.setDocStatus(status);
			shipment.save(order.get_TrxName());
			if (!REF__DocumentStatus.Completed.equals(status))
			{				
				throw new Exception("@M_InOut_ID@: " + shipment.getProcessMsg());
			}
			else
			{

			}
		}
		catch (Exception e)
		{			
			e.printStackTrace();
			errormsg = e.getMessage();
		}
		return errormsg;			
	}
	public List<String> getGroupColumns(MDocType dt)
	{
		String query = "C_DocType_ID = ?";
		List<X_C_DocTypeGroup> listdoctypegroup = new Query(Env.getCtx(), X_C_DocTypeGroup.Table_Name, query, null)
		.setParameters(dt.getC_DocType_ID())
		.setOrderBy("Line")
		.list(); 
		List<String> columnorder = new ArrayList<String>();
		for (X_C_DocTypeGroup dtg:listdoctypegroup)
		{
			MTable table = MTable.get(Env.getCtx(), dtg.getAD_Table_ID());
			MColumn column = MColumn.get(Env.getCtx(), dtg.getAD_Column_ID());

			if (column.getAD_Table_ID() == table.getAD_Table_ID())
			{
				String sql = String.format("SELECT %s from %s zz join c_orderline ol on zz.%s_ID = ol.%s_ID where ol.c_orderline_id = ?", 
						getColumnName(column), table.getTableName(), table.getTableName(), table.getTableName(), table.getTableName());			
				columnorder.add(sql);
			}
		}				
		return columnorder;
	}

	private String getColumnName(MColumn column) {
		String columnname = "";
		if (DisplayType.isNumeric(column.getAD_Reference_ID()) || DisplayType.isID(column.getAD_Reference_ID()))
		{
			columnname = column.getColumnName();
		}
		else if (DisplayType.isText(column.getAD_Reference_ID()) || DisplayType.isLookup(column.getAD_Reference_ID()))
		{
			columnname = String.format("stringtonumeric(%s)", column.getColumnName());
		}
		return columnname;
	}
	/*
	 * Simple create Invoice, from Order to Invoice.
	 */
	public boolean createSimpleInvoice(MOrder order)
	{
		boolean createdinvoice = true;
		try {
			MOrderLine[] lines = order.getLines(true, null);
			List<MOrderLine> invlines = new ArrayList<MOrderLine>();
			for (MOrderLine line:lines)
			{
				invlines.add(line);
			}			
			if (createInvoice(order, invlines))
			{
				invlines.clear();					
			}
			else
			{
				throw new Exception(order.getProcessMsg());
			}				
		}
		catch (Exception e)
		{
			order.setProcessMsg(e.getMessage());
			createdinvoice = false;
		}
		return createdinvoice;				
	}
	/**
	 * 
	 * @param Order considering the various constraints
	 * 	- Amounts 
	 *  - type of product
	 * @return
	 */
	public boolean createInvoicebyContraints(MOrder order)
	{
		boolean createdinvoice = true;
		try {
			MDocType dt = MDocType.get(order.getCtx(), order.getC_DocType_ID());	
			MDocType dtinv = MDocType.get(order.getCtx(),dt.getC_DocTypeInvoice_ID());
			MOrderLine[] oLines = order.getLines(true, null);
			BigDecimal maxamt = dtinv.getMaxAmt();
			int maxlinecount = dtinv.getLineCount().intValue();
			List<HashMap<Integer, List>> maplevels = new ArrayList<HashMap<Integer, List>>();
			HashMap<Integer, List> map = new HashMap<Integer, List>();			
			List<String> columngroup = getGroupColumns(dtinv);
			List<Integer> groups = new ArrayList<Integer>(columngroup.size());
			if (columngroup.size() > 0)
			{							
				int level = 0;
				for (String sql:columngroup)
				{
					maplevels.add(new HashMap<Integer, List>());										
					if (level == 0)
					{						
						HashMap <Integer, List> categoryhash = maplevels.get(level);
						for (MOrderLine oLine:oLines)
						{							
							int category = DB.getSQLValue(null, sql, oLine.getC_OrderLine_ID());
							if (!categoryhash.containsKey(category))
							{
								List<MOrderLine> lines = new ArrayList<MOrderLine>();
								lines.add(oLine);
								categoryhash.put(category, lines);
							}
							else
							{
								List<MOrderLine> lines = categoryhash.get(category);
								lines.add(oLine);
								categoryhash.put(category, lines);
							}					
						}
					}
					else
					{
						HashMap <Integer, List> prevmap = maplevels.get(level-1);
						HashMap <Integer, List> mapx = maplevels.get(level);
						Iterator it = prevmap.entrySet().iterator();
						while (it.hasNext())
						{							
							Map.Entry mapentry = (Entry) it.next();
							List<MOrderLine> oLines2 = prevmap.get(mapentry.getKey());
							int prevcategory = (int) mapentry.getKey();
							for (MOrderLine oLine:oLines2)
							{
								int category = DB.getSQLValue(null, sql, oLine.getC_OrderLine_ID());
								category = prevcategory + category;
								if (!mapx.containsKey(category))
								{
									List<MOrderLine> lines = new ArrayList<MOrderLine>();
									lines.add(oLine);
									mapx.put(category, lines);
								}
								else
								{
									List<MOrderLine> lines = mapx.get(category);
									lines.add(oLine);
									mapx.put(category, lines);
								}					
							}
						}
					}
					level++;
				}
				map = maplevels.get(maplevels.size()-1);
			}
			else
			{
				int category = 0;
				for (MOrderLine oLine:oLines)
				{
					if (!map.containsKey(category))
					{
						List<MOrderLine> lines = new ArrayList<MOrderLine>();
						lines.add(oLine);
						map.put(category, lines);
					}
					else
					{
						List<MOrderLine> lines = map.get(category);
						lines.add(oLine);
						map.put(category, lines);
					}										
				}				
			}
			List<MOrderLine> invlines = new ArrayList<MOrderLine>();
			Iterator iter = map.entrySet().iterator(); 
			while (iter.hasNext())
			{
				Map.Entry entry = (Map.Entry) iter.next();
				Integer key = (Integer) entry.getKey();			
				BigDecimal amt = BigDecimal.ZERO;
				int linecurrent = 0;	
				List<MOrderLine> lines = map.get(key);
				for (MOrderLine oLine:lines)
				{
					amt = amt.add(oLine.getLineNetAmt());
					invlines.add(oLine);
					linecurrent ++;					
					if ( (maxamt.compareTo(BigDecimal.ZERO) == 1 && amt.compareTo(maxamt) == 1) || 
							(maxlinecount > 0 && linecurrent == maxlinecount) )
					{
						if (createInvoiceAndInOut(order, invlines))
						{
							invlines.clear();					
							linecurrent = 0;
							amt = BigDecimal.ZERO;
						}
						else
						{
							throw new Exception("Could not create Shipment");
						}
					}
				}	
				if (createInvoiceAndInOut(order, invlines))
				{
					invlines.clear();					
					linecurrent = 0;
					amt = BigDecimal.ZERO;
				}
				else
				{
					throw new Exception(order.getProcessMsg());
				}				
			}			
		}
		catch (Exception e)
		{
			order.setProcessMsg(e.getMessage());
			createdinvoice = false;
		}
		return createdinvoice;		
	}

	//	public boolean createInvoice2 (MOrder order)
	//	{
	//		boolean createdinvoice = true;
	//		try {
	//			MDocType dt = MDocType.get(order.getCtx(), order.getC_DocType_ID());	
	//			MDocType dtinv = MDocType.get(order.getCtx(),dt.getC_DocTypeInvoice_ID());
	//			MOrderLine[] oLines = order.getLines(true, null);
	//			BigDecimal maxamt = dtinv.getMaxAmt();
	//			int linecount = dtinv.getLineCount().intValue();		
	//			HashMap<Integer, List> map = new HashMap<Integer, List>();		
	//			for (MOrderLine oLine:oLines)
	//			{
	//				MProduct product = MProduct.get(Env.getCtx(), oLine.getM_Product_ID());
	//				int TaxCategory = product.getC_TaxCategory_ID();
	//				if (!dtinv.isSplitByTax())
	//					TaxCategory = 0;
	//				if (!map.containsKey(TaxCategory))
	//				{
	//					List<MOrderLine> lines = new ArrayList<MOrderLine>();
	//					lines.add(oLine);
	//					map.put(TaxCategory, lines);
	//				}
	//				else
	//				{
	//					List<MOrderLine> lines = map.get(TaxCategory);
	//					lines.add(oLine);
	//					map.put(TaxCategory, lines);
	//				}
	//			}
	//			List<MOrderLine> invlines = new ArrayList<MOrderLine>();
	//			Iterator iter = map.entrySet().iterator(); 
	//			while (iter.hasNext())
	//			{
	//				Map.Entry entry = (Map.Entry) iter.next();
	//				Integer key = (Integer) entry.getKey();			
	//				BigDecimal amt = BigDecimal.ZERO;
	//				int linecurrent = 0;	
	//				List<MOrderLine> lines = map.get(key);
	//				for (MOrderLine oLine:lines)
	//				{
	//					amt = amt.add(oLine.getLineNetAmt());							
	//					if ( (maxamt.compareTo(BigDecimal.ZERO) == 1 && amt.compareTo(maxamt) == 1) || 
	//							(linecount > 0 && linecurrent == linecount) )
	//					{
	//						if (createInvoice(order, invlines))
	//						{
	//							invlines.clear();					
	//							linecurrent = 0;
	//							amt = BigDecimal.ZERO;
	//						}
	//						else
	//						{
	//							throw new Exception("Could not create Shipment");
	//						}
	//					}
	//					invlines.add(oLine);
	//					linecurrent ++;
	//				}	
	//				if (createInvoice(order, invlines))
	//				{
	//					invlines.clear();					
	//					linecurrent = 0;
	//					amt = BigDecimal.ZERO;
	//				}
	//				else
	//				{
	//					throw new Exception("Could not create Shipment");
	//				}				
	//			}
	//		}
	//		catch (Exception e)
	//		{
	//			order.setProcessMsg(e.getMessage());
	//			createdinvoice = false;
	//		}
	//		return createdinvoice;		
	//	}	//	createInvoice
	public boolean createInvoiceAndInOut(MOrder order) {
		List<MOrderLine> lines = new Query(Env.getCtx(), MOrderLine.Table_Name, "C_Order_ID = ?", order.get_TrxName())
			.setParameters(order.getC_Order_ID()).list();
		return createInvoiceAndInOut(order, lines);
	}
	
	private boolean createInvoiceAndInOut(MOrder order, List<MOrderLine> invlines) {
		boolean createdinvoice = true;
		try {
			String error = createShipment(order, invlines);
			MDocType dt = MDocType.get(order.getCtx(), order.getC_DocType_ID());
			//List<MInOut> shipments = new ArrayList<MInOut>();
			HashMap shipments = new HashMap();
			List<MOrderLine> orderwithoutshipments = new ArrayList<MOrderLine>();			 
			for (MOrderLine line:invlines)
			{
				MInOutLine shipmentline = new Query(Env.getCtx(), X_M_InOutLine.Table_Name, "C_OrderLine_ID = ?", order.get_TrxName())
				.setParameters(line.getC_OrderLine_ID()).first();
				if (shipmentline != null)
				{
					if (shipmentline.getQtyEntered().compareTo(line.getQtyEntered()) != 0)
					{

					}
					if (shipmentline.getMovementQty().compareTo(line.getQtyOrdered()) != 0)
					{

					}
					if (!shipments.containsKey(shipmentline.getM_InOut_ID()))
					{
						List<MInOutLine> lines = new ArrayList<MInOutLine>();
						lines.add(shipmentline);
						shipments.put(shipmentline.getM_InOut_ID(), lines);
					}
					else
					{
						List<MInOutLine> lines = (List<MInOutLine>) shipments.get(shipmentline.getM_InOut_ID());
						lines.add(shipmentline);
						shipments.put(shipmentline.getM_InOut_ID(), lines);
					}
				}
				else
				{
					orderwithoutshipments.add(line);
				}
			}
			Iterator iter = shipments.entrySet().iterator(); 
			while (iter.hasNext())
			{
				Map.Entry entry = (Map.Entry) iter.next();
				Integer key = (Integer) entry.getKey();			
				MInvoice invoice = new MInvoice (order, dt.getC_DocTypeInvoice_ID(), order.getDateOrdered());
				if (!invoice.save(order.get_TrxName()))
				{
					throw new Exception("Could not create Invoice");			
				}				
				List<MInOutLine> lines = (List<MInOutLine>) shipments.get(key);
				MInOut shipment = new MInOut(Env.getCtx(), key, order.get_TrxName());
				if (!REF_C_OrderInvoiceRule.AfterDelivery.equals(order.getInvoiceRule()))
					order.setInvoiceRule(REF_C_OrderInvoiceRule.AfterDelivery);
				for (MInOutLine sLine:lines)
				{
					MInvoiceLine iLine = new MInvoiceLine(invoice);
					iLine.setShipLine(sLine);
					//	Qty = Delivered	
					iLine.setQtyEntered(sLine.getQtyEntered());
					iLine.setQtyInvoiced(sLine.getMovementQty());
					if (!iLine.save(order.get_TrxName()))
					{
						throw new Exception("Could not create Invoice Line from Shipment Line");					
					}
					//
					sLine.setIsInvoiced(true);
					if (!sLine.save(order.get_TrxName()))
					{
						log.warning("Could not update Shipment line: " + sLine);
					}					
				}
				String status = invoice.completeIt();
				invoice.setDocStatus(status);
				invoice.save(order.get_TrxName());
				if (!REF__DocumentStatus.Completed.equals(status))
				{
					throw new Exception("@C_Invoice_ID@: " + invoice.getProcessMsg());			
				}				
				if (lines.size() == invoice.getLength())
				{
					shipment.setC_Invoice_ID(invoice.getC_Invoice_ID());
					shipment.save(order.get_TrxName());
				}				
			}	
			// no tienen guia 
			if (orderwithoutshipments.size() > 0)
			{
				if (!REF_C_OrderInvoiceRule.Immediate.equals(order.getInvoiceRule()))
					order.setInvoiceRule(REF_C_OrderInvoiceRule.Immediate);

				MInvoice invoice = new MInvoice (order, dt.getC_DocTypeInvoice_ID(), order.getDateOrdered());
				if (!invoice.save(order.get_TrxName()))
				{
					throw new Exception("Could not create Invoice");			
				}								
				//
				//MOrderLine[] oLines = order.getLines();
				//for (int i = 0; i < oLines.length; i++)
				for (MOrderLine oLine:orderwithoutshipments)
				{
					//MOrderLine oLine = oLines[i];
					//
					MInvoiceLine iLine = new MInvoiceLine(invoice);
					iLine.setOrderLine(oLine);
					//	Qty = Ordered - Invoiced	
					iLine.setQtyInvoiced(oLine.getQtyOrdered().subtract(oLine.getQtyInvoiced()));
					if (oLine.getQtyOrdered().compareTo(oLine.getQtyEntered()) == 0)
						iLine.setQtyEntered(iLine.getQtyInvoiced());
					else
						iLine.setQtyEntered(iLine.getQtyInvoiced().multiply(oLine.getQtyEntered())
								.divide(oLine.getQtyOrdered(), 12, BigDecimal.ROUND_HALF_UP));
					if (!iLine.save(order.get_TrxName()))
					{
						throw new Exception("Could not create Invoice Line from Order Line");					
					}
				}				
				String status = invoice.completeIt();
				invoice.setDocStatus(status);
				invoice.save(order.get_TrxName());
				if (!REF__DocumentStatus.Completed.equals(status))
				{
					throw new Exception("@C_Invoice_ID@: " + invoice.getProcessMsg());			
				}								
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			order.setProcessMsg(e.getMessage());
			createdinvoice = false;
		}
		return createdinvoice;		
	}

	private boolean createInvoice(MOrder order, List<MOrderLine> invlines) {
		boolean createdinvoice = true;
		try {
			MDocType dt = MDocType.get(order.getCtx(), order.getC_DocType_ID());
			//List<MInOut> shipments = new ArrayList<MInOut>();
			HashMap shipments = new HashMap();
			List<MOrderLine> orderwithoutshipments = new ArrayList<MOrderLine>();			 
			for (MOrderLine line:invlines)
			{
				MInOutLine shipmentline = new Query(Env.getCtx(), X_M_InOutLine.Table_Name, "C_OrderLine_ID = ?", order.get_TrxName())
				.setParameters(line.getC_OrderLine_ID()).first();
				if (shipmentline != null)
				{
					if (shipmentline.getQtyEntered().compareTo(line.getQtyEntered()) != 0)
					{

					}
					if (shipmentline.getMovementQty().compareTo(line.getQtyOrdered()) != 0)
					{

					}
					if (!shipments.containsKey(shipmentline.getM_InOut_ID()))
					{
						List<MInOutLine> lines = new ArrayList<MInOutLine>();
						lines.add(shipmentline);
						shipments.put(shipmentline.getM_InOut_ID(), lines);
					}
					else
					{
						List<MInOutLine> lines = (List<MInOutLine>) shipments.get(shipmentline.getM_InOut_ID());
						lines.add(shipmentline);
						shipments.put(shipmentline.getM_InOut_ID(), lines);
					}
				}
				else
				{
					orderwithoutshipments.add(line);
				}
			}
			Iterator iter = shipments.entrySet().iterator(); 
			while (iter.hasNext())
			{
				Map.Entry entry = (Map.Entry) iter.next();
				Integer key = (Integer) entry.getKey();			
				MInvoice invoice = new MInvoice (order, dt.getC_DocTypeInvoice_ID(), order.getDateOrdered());
				if (!invoice.save(order.get_TrxName()))
				{
					throw new Exception("Could not create Invoice");			
				}				
				List<MInOutLine> lines = (List<MInOutLine>) shipments.get(key);
				MInOut shipment = new MInOut(Env.getCtx(), key, order.get_TrxName());
				if (!REF_C_OrderInvoiceRule.AfterDelivery.equals(order.getInvoiceRule()))
					order.setInvoiceRule(REF_C_OrderInvoiceRule.AfterDelivery);
				for (MInOutLine sLine:lines)
				{
					MInvoiceLine iLine = new MInvoiceLine(invoice);
					iLine.setShipLine(sLine);
					//	Qty = Delivered	
					iLine.setQtyEntered(sLine.getQtyEntered());
					iLine.setQtyInvoiced(sLine.getMovementQty());
					if (!iLine.save(order.get_TrxName()))
					{
						throw new Exception("Could not create Invoice Line from Shipment Line");					
					}
					//
					sLine.setIsInvoiced(true);
					if (!sLine.save(order.get_TrxName()))
					{
						log.warning("Could not update Shipment line: " + sLine);
					}					
				}
				String status = invoice.completeIt();
				invoice.setDocStatus(status);
				invoice.save(order.get_TrxName());
				if (!REF__DocumentStatus.Completed.equals(status))
				{
					throw new Exception("@C_Invoice_ID@: " + invoice.getProcessMsg());			
				}				
				if (lines.size() == invoice.getLength())
				{
					shipment.setC_Invoice_ID(invoice.getC_Invoice_ID());
					shipment.save(order.get_TrxName());
				}				
			}	
			// no tienen guia 
			if (orderwithoutshipments.size() > 0)
			{
				if (!REF_C_OrderInvoiceRule.Immediate.equals(order.getInvoiceRule()))
					order.setInvoiceRule(REF_C_OrderInvoiceRule.Immediate);

				MInvoice invoice = new MInvoice (order, dt.getC_DocTypeInvoice_ID(), order.getDateOrdered());
				if (!invoice.save(order.get_TrxName()))
				{
					throw new Exception("Could not create Invoice");			
				}								
				//
				//MOrderLine[] oLines = order.getLines();
				//for (int i = 0; i < oLines.length; i++)
				for (MOrderLine oLine:orderwithoutshipments)
				{
					//MOrderLine oLine = oLines[i];
					//
					MInvoiceLine iLine = new MInvoiceLine(invoice);
					iLine.setOrderLine(oLine);
					//	Qty = Ordered - Invoiced	
					iLine.setQtyInvoiced(oLine.getQtyOrdered().subtract(oLine.getQtyInvoiced()));
					if (oLine.getQtyOrdered().compareTo(oLine.getQtyEntered()) == 0)
						iLine.setQtyEntered(iLine.getQtyInvoiced());
					else
						iLine.setQtyEntered(iLine.getQtyInvoiced().multiply(oLine.getQtyEntered())
								.divide(oLine.getQtyOrdered(), 12, BigDecimal.ROUND_HALF_UP));
					if (!iLine.save(order.get_TrxName()))
					{
						throw new Exception("Could not create Invoice Line from Order Line");					
					}
				}				
				String status = invoice.completeIt();
				invoice.setDocStatus(status);
				invoice.save(order.get_TrxName());
				if (!REF__DocumentStatus.Completed.equals(status))
				{
					throw new Exception("@C_Invoice_ID@: " + invoice.getProcessMsg());			
				}								
			}
			//	Manually Process Invoice
		} catch (Exception e)
		{
			e.printStackTrace();
			order.setProcessMsg(e.getMessage());
			createdinvoice = false;
		}
		return createdinvoice;		
	}

	

	public void optimizePickup(int C_Order_ID)
	{
		File pickupsolverfile = new File(Env.getResource("org.xendra.standard", "pickupSolver.xml"));
		if (pickupsolverfile.exists())
		{
			SolverFactory solverFactory = SolverFactory.createFromXmlFile(pickupsolverfile);
			m_pickupsolver = solverFactory.buildSolver();
			if (m_pickupsolver == null) {
				return;
			}
		}
		else
		{
			log.log(Level.WARNING, String.format("%s not found - pickup solver not activated", pickupsolverfile.getAbsoluteFile()));
			return;
		}			

		PickupDesignation unsolvedPickupList = getPickupDesignation(C_Order_ID);
		m_pickupsolver.solve(unsolvedPickupList);
		PickupDesignation solvedPickupList =  (PickupDesignation) m_pickupsolver.getBestSolution();
		System.out.println("\nSolved:\n" + toDisplayString(solvedPickupList));
	}

	public PickupDesignation getPickupDesignation(int C_Order_ID)
	{
		List<MOrderLine> lines = new Query(Env.getCtx(), X_C_OrderLine.Table_Name, "C_Order_ID = ?", null)
		.setParameters(C_Order_ID)
		.list();
		if (lines == null)
		{
			return null;
		}
		PickupDesignation pl = new PickupDesignation();

		HashMap<Integer, Picker> pickers = new HashMap();
		List<X_M_Stock_Picker> stockpickers = new Query(Env.getCtx(), X_M_Stock_Picker.Table_Name, "IsActive='Y'", null)
		.list();
		for (X_M_Stock_Picker stockpicker:stockpickers)
		{
			Picker pick = null;
			if (!pickers.containsKey(stockpicker.getAD_User_ID()))
			{				
				X_AD_User user = new X_AD_User(Env.getCtx(), stockpicker.getAD_User_ID(), null);
				pick = new Picker();
				pick.setUser(user);
				pickers.put(stockpicker.getAD_User_ID(), pick);	
			}
			else
			{
				pick = pickers.get(stockpicker.getAD_User_ID());
			}
			pick.addLocator(stockpicker.getM_Locator_ID());
			pick.addProductBrand(stockpicker.getM_Product_Brand_ID());
			pick.addWarehouse(stockpicker.getM_Warehouse_ID());			
		}
		//
		List<PickupList> pickuplist = new ArrayList<PickupList>();

		for (MOrderLine line:lines)
		{
			pickuplist.add(new PickupList(line));
		}
		//
		Iterator<Integer> it = pickers.keySet().iterator();
		while (it.hasNext()) {
			final Integer pickid = it.next();
			Picker picker = (Picker) pickers.get(pickid);
			pl.addPicker(picker);
		}							
		pl.setPickupList(pickuplist);
		return pl;
	}

	public static String toDisplayString(PickupDesignation cloudBalance) {
		StringBuilder displayString = 	new StringBuilder();
		for (PickupList process : cloudBalance.getPickupList()) {
			Picker computer = process.getPicker();
			displayString.append(" ").append(process.getOrderLine()).append(" -> ")
			.append(computer == null ? null :  computer.getName()).append("\n");
		}
		return displayString.toString();
	}

	/**
	 * 	Get Order Unreserved Qty
	 *	@param ctx context
	 *	@param M_Warehouse_ID wh
	 *	@param M_Product_ID product
	 *	@param M_AttributeSetInstance_ID asi
	 *	@param excludeC_OrderLine_ID exclude C_OrderLine_ID
	 *	@return Unreserved Qty
	 */
	public static BigDecimal getNotReserved (Properties ctx, int M_Warehouse_ID, 
			int M_Product_ID, int M_AttributeSetInstance_ID, int excludeC_OrderLine_ID)
	{

		return BigDecimal.ZERO;
		//
		//		X_A_Machine machine = Env.getServerMaterial();
		//		if (machine == null)
		//		{}
		//		StorageWorker sw = new StorageWorker();
		//		sw.setM_Product_ID(M_Product_ID);
		//		sw.setM_AttributeSetInstance_ID(M_AttributeSetInstance_ID);
		//		sw.setM_Warehouse_ID(M_Warehouse_ID);
		//		sw.setMachine(machine);
		//		String error = sw.Pull(StockWorker.NotReserved);						
		//		return BigDecimal.ZERO;
	}	//	getNotReserved

	public static void setProduct(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value)
	{
		Integer M_Product_ID = (Integer)value;
		if (M_Product_ID == null || M_Product_ID.intValue() == 0)
			return;
		Env.setActive(Env.getContextAsInt(ctx, "AD_Rule_ID"),true);
		mTab.setValue("C_Charge_ID", null);    	    		    	
		if (Env.getContextAsInt(ctx, Env.WINDOW_INFO, Env.TAB_INFO, "M_Product_ID") == M_Product_ID.intValue()	
				&& Env.getContextAsInt(ctx, Env.WINDOW_INFO, Env.TAB_INFO, "M_AttributeSetInstance_ID") != 0)
			mTab.setValue("M_AttributeSetInstance_ID", new Integer(Env.getContextAsInt(ctx, Env.WINDOW_INFO, Env.TAB_INFO, "M_AttributeSetInstance_ID")));
		else
			mTab.setValue("M_AttributeSetInstance_ID", null);					

		int C_BPartner_ID = Env.getContextAsInt(ctx, WindowNo, "C_BPartner_ID");
		BigDecimal Qty = (BigDecimal)mTab.getValue("QtyOrdered");
		boolean IsSOTrx = Env.getContext(ctx, WindowNo, "IsSOTrx").equals("Y");
		MProductPricing pp = new MProductPricing (M_Product_ID, C_BPartner_ID, Qty, IsSOTrx);
		//
		int M_PriceList_ID = Env.getContextAsInt(ctx, WindowNo, "M_PriceList_ID");
		pp.setM_PriceList_ID(M_PriceList_ID);
		/** PLV is only accurate if PL selected in header */
		// globalqss - fix reported bug [ 1643489 ] PriceListVersion misfunctionality
		int M_PriceList_Version_ID;
		// try to get the price list version from info product tab
		M_PriceList_Version_ID = Env.getContextAsInt(ctx, Env.WINDOW_INFO, Env.TAB_INFO, "M_PriceList_Version_ID");
		// if not found try to get from the context of window
		if (M_PriceList_Version_ID == 0)
			M_PriceList_Version_ID = Env.getContextAsInt(ctx, WindowNo, "M_PriceList_Version_ID");
		// end globalqss 
		pp.setM_PriceList_Version_ID(M_PriceList_Version_ID); 
		Timestamp orderDate = (Timestamp)mTab.getValue("DateOrdered");
		pp.setPriceDate(orderDate);
		//		
		mTab.setValue("PriceList", pp.getPriceList());
		mTab.setValue("PriceLimit", pp.getPriceLimit());
		mTab.setValue("PriceActual", pp.getPriceStd());
		mTab.setValue("PriceEntered", pp.getPriceStd());
		mTab.setValue("C_Currency_ID", new Integer(pp.getC_Currency_ID()));
		mTab.setValue("Discount", pp.getDiscount());
		if (Env.isSOTrx(ctx, WindowNo))
			mTab.setValue("C_UOM_ID", new Integer(pp.getC_UOM_ID()));
		else
		{			
			mTab.setValue("C_UOM_ID", new Integer(pp.getC_UOM_Order_ID()));
		}		
		if (pp.getC_UOM_ID() != pp.getC_UOM_Order_ID())
		{
			mTab.setValue("QtyEntered", mTab.getValue("QtyEntered"));
		}
		else
			mTab.setValue("QtyOrdered", mTab.getValue("QtyEntered"));
		mTab.setValue(X_C_OrderLine.COLUMNNAME_QtyReserved, BigDecimal.ZERO);
		Env.setContext(ctx, WindowNo, "EnforcePriceLimit", pp.isEnforcePriceLimit() ? "Y" : "N");
		Env.setContext(ctx, WindowNo, "DiscountSchema", pp.isDiscountSchema() ? "Y" : "N");	

		if (Env.isSOTrx(ctx, WindowNo))
		{
			MProduct product = MProduct.get (ctx, M_Product_ID.intValue(), null);
			if (product.isStocked())
			{
				BigDecimal QtyOrdered = (BigDecimal)mTab.getValue(X_C_OrderLine.COLUMNNAME_QtyOrdered);
				int M_Warehouse_ID = Env.getContextAsInt(ctx, WindowNo, "M_Warehouse_ID");
				int M_AttributeSetInstance_ID = Env.getContextAsInt(ctx, WindowNo, "M_AttributeSetInstance_ID");
				BigDecimal available = MStorage.getQtyAvailable(M_Warehouse_ID, M_Product_ID.intValue(), M_AttributeSetInstance_ID, null);
				if (available == null)
					available = Env.ZERO;
				if (available.signum() == 0)
					mTab.fireDataStatusEEvent ("NoQtyAvailable", "0", false);
				else if (available.compareTo(QtyOrdered) < 0)
					mTab.fireDataStatusEEvent ("InsufficientQtyAvailable", available.toString(), false);
				else
				{
					Integer C_OrderLine_ID = (Integer)mTab.getValue("C_OrderLine_ID");
					if (C_OrderLine_ID == null)
						C_OrderLine_ID = new Integer(0);
					BigDecimal notReserved = Policy.getNotReserved(ctx, M_Warehouse_ID, M_Product_ID, M_AttributeSetInstance_ID, C_OrderLine_ID.intValue());
					if (notReserved == null)
						notReserved = Env.ZERO;
					BigDecimal total = available.subtract(notReserved);
					if (total.compareTo(QtyOrdered) < 0)
					{
						String info = Msg.parseTranslation(ctx, "@QtyAvailable@=" + available + " - @QtyNotReserved@=" + notReserved + " = " + total);
						mTab.fireDataStatusEEvent ("InsufficientQtyAvailable", info, false);
					}
				}
			}		
		}
		Env.setActive(Env.getContextAsInt(ctx, "AD_Rule_ID"),false);		
	}
	public static void calculatetax(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value)
	{
		if (value == null)
			return;		
		String column = mField.getColumnName();
		int M_Product_ID = 0;
		if (column.equals("M_Product_ID"))
			M_Product_ID = ((Integer)value).intValue();
		else
			M_Product_ID = Env.getContextAsInt(ctx, WindowNo, "M_Product_ID");
		int C_Charge_ID = 0;
		if (column.equals("C_Charge_ID"))
			C_Charge_ID = ((Integer)value).intValue();
		else
			C_Charge_ID = Env.getContextAsInt(ctx, WindowNo, "C_Charge_ID");

		if (M_Product_ID == 0 && C_Charge_ID == 0)
			return;

		//	Check Partner Location
		int shipC_BPartner_Location_ID = 0;
		if (column.equals("C_BPartner_Location_ID"))
			shipC_BPartner_Location_ID = ((Integer)value).intValue();
		else
			shipC_BPartner_Location_ID = Env.getContextAsInt(ctx, WindowNo, "C_BPartner_Location_ID");

		if (shipC_BPartner_Location_ID == 0)
			return;

		Timestamp billDate = Env.getContextAsDate(ctx, WindowNo, "DateOrdered");
		Timestamp shipDate = Env.getContextAsDate(ctx, WindowNo, "DatePromised");

		int AD_Org_ID = Env.getContextAsInt(ctx, WindowNo, "AD_Org_ID");

		int M_Warehouse_ID = Env.getContextAsInt(ctx, WindowNo, "M_Warehouse_ID");

		int billC_BPartner_Location_ID = Env.getContextAsInt(ctx, WindowNo, "Bill_Location_ID");
		if (billC_BPartner_Location_ID == 0)
			billC_BPartner_Location_ID = shipC_BPartner_Location_ID;
		//
		int C_Tax_ID = Tax.get (ctx, M_Product_ID, C_Charge_ID, billDate, shipDate,
				AD_Org_ID, M_Warehouse_ID, billC_BPartner_Location_ID, shipC_BPartner_Location_ID, "Y".equals(Env.getContext(ctx, WindowNo, "IsSOTrx")));
		//
		if (C_Tax_ID == 0)
			mTab.fireDataStatusEEvent(CLogger.retrieveError());
		else
			mTab.setValue("C_Tax_ID", new Integer(C_Tax_ID));				
	}
}
