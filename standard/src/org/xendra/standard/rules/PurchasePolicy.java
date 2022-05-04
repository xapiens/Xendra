package org.xendra.standard.rules;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;

import org.compiere.model.MColumn;
import org.compiere.model.MDocType;
import org.compiere.model.MInOut;
import org.compiere.model.MInOutLine;
import org.compiere.model.MInvoice;
import org.compiere.model.MInvoiceLine;
import org.compiere.model.MLocator;
import org.compiere.model.MOrder;
import org.compiere.model.MOrderLine;
import org.compiere.model.MProduct;
import org.compiere.model.MStorage;
import org.compiere.model.MTable;
import org.compiere.model.MWarehouse;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_User;
import org.compiere.model.persistence.X_C_DocTypeGroup;
import org.compiere.model.persistence.X_M_InOutLine;
import org.compiere.model.persistence.X_M_Stock_Picker;
import org.compiere.model.reference.REF_C_DocTypeSubType;
import org.compiere.model.reference.REF_C_OrderInvoiceRule;
import org.compiere.model.reference.REF_M_TransactionMovementType;
import org.compiere.model.reference.REF__DocumentStatus;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.optaplanner.core.api.solver.Solver;
import org.optaplanner.core.api.solver.SolverFactory;
import org.xendra.planner.locator.InOutLocatorDesignation;
import org.xendra.planner.pickup.Picker;
import org.xendra.planner.pickup.PickupDesignation;
import org.xendra.planner.pickup.PickupList;

public class PurchasePolicy {
	private static PurchasePolicy m_Policy;
	private Solver m_locatorsolver;
	protected transient CLogger	log = CLogger.getCLogger (getClass());
	private boolean optimizelocators = false;
	public static PurchasePolicy getInstance() {
		if (m_Policy == null)
			m_Policy = new PurchasePolicy();
		return m_Policy;
	}	
	public void setOptimizeLocatorOn() {
		optimizelocators = true;
		//File locatorsolverfile = new File(Env.getResource("org.xendra.standard",  "locatorSolver.xml"));
		//if (locatorsolverfile.exists()) {
		//	SolverFactory solverFactory = SolverFactory.createFromXmlFile(locatorsolverfile);
		//	m_locatorsolver = solverFactory.buildSolver();
		//	if (m_locatorsolver == null) {										
		//		optimizelocators = false;
		//	} 
		//} else {
		//	log.log(Level.WARNING, String.format("%s not found - pickup solver not activated", locatorsolverfile.getAbsoluteFile()));
		//	//return;					
		//	optimizelocators = false;			
		//}		
	}
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
				MProduct product = MProduct.get(Env.getCtx(), oLine.getM_Product_ID(), order.get_TrxName());
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

	//public void optimizeLocator(int M_InOut_ID) {
	//public void optimizeLocator(int M_Warehouse_ID, int M_Product_ID, BigDecimal MovementQty) {
	public void optimizeLocator(int M_Warehouse_ID, List<MOrderLine> lines) {
		InOutLocatorDesignation unsolvedLocator = getLocatorDesignation(M_Warehouse_ID, lines);
		m_locatorsolver.solve(unsolvedLocator);
		InOutLocatorDesignation solvedPickupList =  (InOutLocatorDesignation) m_locatorsolver.getBestSolution();
		System.out.println("\nSolved:\n" + toDisplayString(solvedPickupList));		
	}

	//private LocatorDesignation getLocatorDesignation(int M_Warehouse_ID, int M_Product_ID, BigDecimal MovementQty) {
	private InOutLocatorDesignation getLocatorDesignation(int M_Warehouse_ID, List<MOrderLine> lines) {
		InOutLocatorDesignation pl = new InOutLocatorDesignation();
		//List<MLocator> locators = new Query(Env.getCtx(), MLocator.Table_Name, "M_Warehouse_ID = ?", null)
		//	.setParameters(M_Warehouse_ID).list();
		//pl.addLocators(locators);
		pl.addOrderLines(lines);		
		return pl;		
	}

	public static String toDisplayString(InOutLocatorDesignation cloudBalance) {
		StringBuilder displayString = 	new StringBuilder();
		//for (PickupList process : cloudBalance.getPickupList()) {
		//	Picker computer = process.getPicker();
		//	displayString.append(" ").append(process.getOrderLine()).append(" -> ")
		//	.append(computer == null ? null :  computer.getName()).append("\n");
		//}
		//return displayString.toString();
		return "";
	}



	private String createShipment(MOrder order, List<MOrderLine> shiplines) {
		String errormsg = "";
		try {
			MDocType dt = MDocType.get(order.getCtx(), order.getC_DocType_ID());
			String DocSubType = dt.getDocSubType();
			MInOut shipment = new MInOut (order, dt.getC_DocTypeShipment_ID(), order.getDateOrdered());
			if (REF_C_DocTypeSubType.ReturnMaterial.equals(DocSubType))
			{
				shipment.setMovementType(REF_M_TransactionMovementType.VendorReceipts);			
			}
			if (!shipment.save(order.get_TrxName()))
			{				
				throw new Exception("Could not create Shipment");
			}
			Boolean goahead = true;			
			createShipmentfromOrder(shipment, shiplines, optimizelocators);
			//optimizeLocator(shipment.getM_Warehouse_ID(),shiplines);									
			//for (MOrderLine oLine:shiplines) {
			//	MInOutLine ioLine = new MInOutLine(shipment);
			//	Qty = Ordered - Delivered
			//	BigDecimal MovementQty = oLine.getQtyOrdered().subtract(oLine.getQtyDelivered()); 
			//}
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
	private void createShipmentfromOrder(MInOut shipment, List<MOrderLine> shiplines, Boolean optimizelocators) throws Exception {
		//				
		List<MLocator> locators = null;
		BigDecimal actualsize = BigDecimal.ZERO;
		MLocator optlocator = null;
		for (MOrderLine oLine:shiplines)
		{		
			MInOutLine ioLine = new MInOutLine(shipment);
			//	Qty = Ordered - Delivered
			BigDecimal MovementQty = oLine.getQtyOrdered().subtract(oLine.getQtyDelivered()); 
			//	Location
			int M_Locator_ID = 0;
			if (optimizelocators) {
				if (locators == null) {
					locators = new Query(Env.getCtx(), MLocator.Table_Name, "M_Warehouse_ID = ?", shipment.get_TrxName()).setParameters(shipment.getM_Warehouse_ID()).list();
				}
				for (MLocator locator:locators) {
					if (optlocator == null)
						optlocator = locator;
					else {
						if (optlocator.getAvailable().compareTo(locator.getAvailable()) < 0) {
							optlocator = locator;
						}
					}					
				}
				if (optlocator != null) {
					M_Locator_ID = optlocator.getM_Locator_ID();
				}
			} else {
				M_Locator_ID = MStorage.getM_Locator_ID (oLine.getM_Warehouse_ID(), 
						oLine.getM_Product_ID(), oLine.getM_AttributeSetInstance_ID(), 
						MovementQty, shipment.get_TrxName());
			}
			if (M_Locator_ID == 0)		//	Get default Location
			{
				MWarehouse wh = MWarehouse.get(shipment.getCtx(), oLine.getM_Warehouse_ID());
				M_Locator_ID = wh.getDefaultLocator().getM_Locator_ID();
			}
			//
			ioLine.setOrderLine(oLine, M_Locator_ID, MovementQty);
			ioLine.setQty(MovementQty);
			if (oLine.getQtyEntered().compareTo(oLine.getQtyOrdered()) != 0)
				ioLine.setQtyEntered(MovementQty
						.multiply(oLine.getQtyEntered())
						.divide(oLine.getQtyOrdered(), 6, BigDecimal.ROUND_HALF_UP));				
			if (!ioLine.save(shipment.get_TrxName()))
			{					
				throw new Exception("Could not create Shipment Line");
			}
		}		
	}
	public boolean createInvoice(MOrder order)
	{
		boolean createdinvoice = true;
		try {
			MDocType dt = MDocType.get(order.getCtx(), order.getC_DocType_ID());	
			MDocType dtinv = MDocType.get(order.getCtx(),dt.getC_DocTypeInvoice_ID());
			MOrderLine[] oLines = order.getLines(true, null);
			BigDecimal maxamt = dtinv.getMaxAmt();
			int linecount = dtinv.getLineCount().intValue();
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
						HashMap <Integer, List> mapx = maplevels.get(level);
						for (MOrderLine oLine:oLines)
						{							
							int category = DB.getSQLValue(null, sql, oLine.getC_OrderLine_ID());
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
					if ( (maxamt.compareTo(BigDecimal.ZERO) == 1 && amt.compareTo(maxamt) == 1) || 
							(linecount > 0 && linecurrent == linecount) )
					{
						if (createInvoice(order, invlines))
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
					invlines.add(oLine);
					linecurrent ++;
				}	
				if (createInvoice(order, invlines))
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
		} catch (Exception e)
		{
			order.setProcessMsg(e.getMessage());
			createdinvoice = false;
		}
		return createdinvoice;		
	}

	public static void main(String[] args) {
		org.compiere.Xendra.startup(true);
		PurchasePolicy pol = new PurchasePolicy();
		MOrder o = new Query(Env.getCtx(), MOrder.Table_Name, "C_Order_ID = ?" , null).setParameters(1605250).first();
		List<MOrderLine> lines = new Query(Env.getCtx(), MOrderLine.Table_Name, "C_Order_ID = ?", null).setParameters(1605250).list();
		pol.setOptimizeLocatorOn();
		pol.optimizeLocator(o.getM_Warehouse_ID(),lines);
		//pol.optimizePickup(2741415);
	}

}
