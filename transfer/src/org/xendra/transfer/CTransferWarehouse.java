package org.xendra.transfer;
/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
 * Copyright (C) 2009 Dravio SAC. All Rights Reserved.                		  *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 *****************************************************************************/


import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.*;
import java.sql.*;
import java.util.*;
import java.util.List;
import java.util.logging.*;

import javax.imageio.ImageIO;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.swing.*;
import javax.swing.event.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import net.miginfocom.swing.MigLayout;
import org.xendra.Constants;
import org.xendra.common.ButtonPanel;
import org.xendra.common.DialogInputQty;
import org.xendra.common.ErrorPanel;
import org.xendra.common.ICardPanel;
import org.xendra.common.PushButton;
import org.xendra.exceptions.XendraException;
import org.xendra.line.LineKeyAdapter;
import org.xendra.message.EmbeddedMessageServer;
import org.xendra.messages.MessageFactory;
import org.xendra.objectview.DefaultObjectViewModel;
import org.xendra.objectview.DefaultTableViewColumn;
import org.xendra.objectview.ObjectView;
import org.xendra.objectview.ObjectViewAdapter;
import org.xendra.objectview.IObjetViewColumn;
import org.xendra.objectview.ObjectViewModel;
import org.xendra.objectview.RowBase;
import org.xendra.rules.messages.message;
//import org.xendra.pos.model.message;
import org.xendra.rules.model.SimpleRule;
import org.xendra.transfer.cardcomponent.CardComponentPanel;
import org.xendra.transfer.cardcomponent.ShippingPanel;
import org.xendra.transfer.util.DialogInputID;

import org.compiere.apps.*;
import org.compiere.apps.form.FormFrame;
import org.compiere.apps.form.FormPanel;
import org.compiere.apps.form.VAllocation;
import org.compiere.apps.search.Info;
import org.compiere.apps.search.InfoProduct;
import org.compiere.db.CConnection;
import org.compiere.grid.ed.*;
import org.compiere.model.GridField;
import org.compiere.model.GridFieldVO;
import org.compiere.model.MBPartner;
import org.compiere.model.MClient;
import org.compiere.model.MDocType;
import org.compiere.model.MLookup;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MMaterialPolicy;
import org.compiere.model.MMovement;
import org.compiere.model.MMovementLine;
import org.compiere.model.MProduct;
import org.compiere.model.MStorage;
import org.compiere.model.MUser;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_MessageFormat;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_Xendrian_Message;
import org.compiere.model.persistence.X_C_DocType;
import org.compiere.model.persistence.X_M_AttributeSetInstance;
import org.compiere.model.persistence.X_M_Movement;
import org.compiere.model.persistence.X_M_Warehouse;
import org.compiere.plaf.*;
import org.compiere.swing.*;
import org.compiere.util.*;
import org.hornetq.api.core.Message;
import org.hornetq.api.core.client.ClientSession;
import org.hornetq.api.core.client.SendAcknowledgementHandler;
import org.hornetq.jms.client.HornetQSession;
import org.kie.api.KieBase;
import org.kie.api.event.rule.DebugRuleRuntimeEventListener;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;
import org.mvel2.compiler.ExpressionCompiler;

import org.xendra.common.Point;

import org.xendra.transfer.model.transaction;
import org.xendra.xendrian.FormatMessage;

/**
 *	Simplifing inventory move for quick use
 *	
 *  @author xapiens
 *  @version $Id: CTransferWarehouse.java 508 2009-05-14 07:27:53Z xapiens $
 */

public class CTransferWarehouse extends CFrame implements Point, FormPanel, ActionListener, Observer, VetoableChangeListener, SendAcknowledgementHandler 
{
	public CTransferWarehouse() {
	}

	private Queue queue;
	private ClientSession coreSession;

	private static final String buttonpanel = "buttonpanel";
	private static final String panelerror = "errorpanel";

	private LineKeyAdapter lkaPointOfSales;
	private FormFrame m_frame;
	private boolean m_showdialoginfo = true;
	private BigDecimal m_QtyByDefault = Env.ZERO;
	private BigDecimal m_QtyBySelection = Env.ZERO;

	private double currentwidth;
	private double buttonspanelwidth;
	private double cardpanelwidth;

	private JPanel cardPanel;
	private ButtonPanel buttonPanel = new ButtonPanel();
	private ErrorPanel errorpanel;
	private ShippingPanel shippingpanel;
	private BorderLayout GridLayout = new BorderLayout();
	private CPanel GridPanel = new CPanel();

	private HashMap<String, CardComponentPanel> CardPanels = new HashMap();	

	private HashMap<String, AppsAction> AppsActions = new HashMap();	
	private HashMap<String, PushButton> PushButtons = new HashMap();
	private Map<String, PO> businessobjects = new HashMap();
	private HashMap<String, BufferedImage> BufferedImages = new HashMap();
	private HashMap<String, List> observers = new HashMap();
	private HashMap<String, String> boagenda = new HashMap();
	private HashMap<String, FactHandle> FactHandlers = new HashMap();
	private HashMap<String, JButton> toolbarbuttons = new HashMap();

	private KieSession ksession;


	/**
	 *	Initialize Panel
	 *  @param WindowNo window
	 *  @param frame frame
	 */
	public void init (int WindowNo, FormFrame frame)
	{
		try
		{		
			m_WindowNo = WindowNo;
			m_frame = frame;
			File resource = new File(Env.getResource("org.xendra.transfer", "transfer.uitheme"));
			if (resource.exists())		
				error = initialize();
			else
				error = ("no se encuentra xenpos.uitheme");
			if (error.length() == 0) {
				init();
			} else {
				JLabel message = new JLabel(String.format("<html><body style='width: %spx'>%s</html>","400", error));
				message.setIcon(Env.getImageIcon("BPartner10.gif"));
				frame.getContentPane().add(message, JLabel.CENTER);
			}		
		}
		catch(Exception e)
		{
			log.log(Level.SEVERE, "", e);
		}		
	}	//	init

	/**	Window No			*/
	private int         m_WindowNo = 0;

	/**	Logger			*/
	private static CLogger log = CLogger.getCLogger(VAllocation.class);

	private CPanel HeaderPanel = new CPanel();
	private CPanel LinePanel = new CPanel();
	private JPanel infoPanel = new JPanel();
	private JSplitPane splitPanel = new JSplitPane();
	private VDate movdateField = null; // new VDate();
	private StatusBar statusBar = new StatusBar();
	private CLabel infosearch = new CLabel();

	private JScrollPane LineScrollPane = new JScrollPane();

	private VLookup pickDocType = null;
	private VLookup pickWarehouse = null;
	private VLookup pickToWarehouse = null;

	ListSelectionModel tableSelection = null;

	private ObjectView view = null;

	Thread threadProduct = null;

	private GridFieldVO vo = null;
	private GridField field = null;		

	private DefaultObjectViewModel m_model;

	private int SelectedRow = 0;
	private String error = "";	
	private JScrollPane scrollPane = null;	
	private CLabel lconexion = new CLabel("");
	//private message s;
	//private MDocType doctype;

	public void dispose() {
		if (m_frame != null)
			m_frame.dispose();
		m_frame = null;	
	}

	public void AddProduct(Boolean isKey, 
			MProduct product, 
			BigDecimal Qty, 
			Integer C_OrderLine_ID, 
			Integer C_UOM_ID, 
			BigDecimal Price, 
			Integer M_AttributeSetInstance_ID, 
			Boolean isVoidTransaction) 
	{
		//
		Integer warehouseid = (Integer) pickWarehouse.getValue();
		Env.setContext(Env.getCtx(), m_WindowNo, X_M_Warehouse.COLUMNNAME_M_Warehouse_ID, warehouseid);		
		Integer Towarehouseid = (Integer) pickToWarehouse.getValue();
		//
		if (m_QtyBySelection.compareTo(Env.ZERO) > 0)
			Qty = m_QtyBySelection;
		//
		Info m_info = null;
		int nPos = view.getSelectedRow();
		String mTextToFind = lkaPointOfSales.getTextToFind();
		if (product == null)
			product = MProduct.getByValue(Env.getCtx(), mTextToFind, null);

		if (product == null)
		{
			//
			String searchKey = "";
			if (isKey)
				searchKey = mTextToFind.trim();
			else
				searchKey = "@"+ mTextToFind.trim() +"%";

			Env.setContext(Env.getCtx(), Env.WINDOW_INFO, Env.TAB_INFO, "M_Product_ID",  "0");
			//MLocator locator = MLocator.get(Env.getCtx(), (Integer) pickLocator.getValue());			
			//m_info = new InfoProduct (m_frame, true, Env.WINDOW_INFO, locator.getM_Warehouse_ID(),

			m_info = new InfoProduct(m_frame, true, Env.WINDOW_INFO, warehouseid,
					0, /*m_order.getM_PriceList_ID() */
					0,					
					searchKey,		//	value
					false, 
					"", 
					true, true);
			AEnv.showCenterWindow(m_frame, m_info);			
			if (m_info.isCancelled())
				mTextToFind = "";
			Integer new_Product_ID = Env.getContextAsInt(Env.getCtx(), Env.WINDOW_INFO, Env.TAB_INFO, "M_Product_ID");
			M_AttributeSetInstance_ID = Env.getContextAsInt(Env.getCtx(), Env.WINDOW_INFO, Env.TAB_INFO, X_M_AttributeSetInstance.COLUMNNAME_M_AttributeSetInstance_ID);
			product = MProduct.get(Env.getCtx(), new_Product_ID, null);
		}
		if (product != null && product.getM_Product_ID() > 0 )
		{
			mTextToFind = "";
			ObjectViewAdapter adapter = (ObjectViewAdapter) view.getModel();
			int found = 0;
			for (int j=0; j < view.getRowCount() ; j++)
			{					
				Row data = (Row) adapter.getNewRow(j);
				if (data.getM_Product_ID() == product.getM_Product_ID())
				{
					found = j+1;
					break;
				}
			}
			if ( found > 0)
			{			
				ADialog.error(m_WindowNo, null, "PosError", "AlreadyExists");
				Object SelectedRow = this.view.getSelectedRowObject(); 
				DefaultObjectViewModel mModel= (DefaultObjectViewModel) this.view.getDataModel();
				mModel.removeRow(SelectedRow);
				int mDefault = ((DefaultObjectViewModel) view.getDataModel()).getPosition("Default");
				view.setRowSelectionInterval(found-1, found-1);
				view.setColumnSelectionInterval(mDefault, mDefault);
			}
			else
			{				
				Row row = new Row();				
				row.setTransferPanel(this);
				row.setWindowNo(m_WindowNo);
				int M_Locator_ID = MStorage.getM_Locator_ID(warehouseid, product.getM_Product_ID(), 0, Qty, null);
				if (M_Locator_ID == 0) 
					M_Locator_ID = DB.getSQLValue(null, String.format("select * from  m_locator where M_Warehouse_ID=%s order by priorityno", warehouseid));
				int M_LocatorTo_ID = MStorage.getM_Locator_ID(Towarehouseid, product.getM_Product_ID(), 0, BigDecimal.ZERO, null);
				if (M_LocatorTo_ID == 0)
					M_LocatorTo_ID = DB.getSQLValue(null, String.format("select * from  m_locator where M_Warehouse_ID=%s order by priorityno", Towarehouseid));
				row.setM_Warehouse_ID(warehouseid);
				row.setM_WarehouseTo_ID(Towarehouseid);
				row.setM_Locator_ID(M_Locator_ID);
				row.setM_LocatorTo_ID(M_LocatorTo_ID);				
				//row.setM_Warehouse_ID(warehouseid);
				row.setM_AttributeSetInstance_ID(M_AttributeSetInstance_ID);				
				row.product(product);
				row.setQtyEntered(Qty);
				//if (!row.IsAttributeOK() )
				//	row.createAttribute();
				if (C_UOM_ID > 0)
					row.setC_UOM_ID(C_UOM_ID);
				if (row.getM_processMsg() != null )
				{
					ADialog.info(m_WindowNo,m_frame, row.getM_processMsg() );
				}
				else
				{
					if (row.getM_processMsg() != null && isVoidTransaction)
					{
						ADialog.info(m_WindowNo,m_frame, row.getM_processMsg() );
					}
					DefaultObjectViewModel mModel= (DefaultObjectViewModel) this.view.getDataModel();
					Object SelectedRow = view.getSelectedRowObject(); 
					mModel.updateRow(SelectedRow,row);

					view.setRowSelectionInterval(nPos, nPos);
					int mDefault = ((DefaultObjectViewModel) view.getDataModel()).getPosition("Default");
					if (mDefault > 0)
						view.setColumnSelectionInterval(mDefault, mDefault);
				}
			}
		}
	}


	public boolean saveMovement()
	{
		Boolean lok = true;
		Trx m_trx = Trx.get(Util.getUUID(), true);
		String trxName = m_trx.getTrxName();

		try 
		{
			Integer C_DocType_ID = (Integer) pickDocType.getValue();
			Integer no = DB.getNextID(Env.getAD_Client_ID(Env.getCtx()), "TransferSequence" , trxName);			
			MMovement movement = new MMovement(Env.getCtx(),0,trxName);
			movement.setMovementDate((Timestamp) movdateField.getValue());				
			movement.setC_DocType_ID(C_DocType_ID);
			if (movement.save(trxName))
			{					
				ObjectViewModel adapter =  view.getDataModel();
				for (int i = 0; i < adapter.getRowCount(); i++) {				
					Row row = (Row) adapter.getRowObject(i);
					if (row.getM_Product_ID() > 0 && row.getQtyEntered().compareTo(Env.ZERO) > 0 )
					{
						// trasladamos en caso haya lotes modificados.
						//						if (row.getM_AttributeSetInstance_ID() > 0)
						//						{
						//							MAttributeSetInstance asi = new MAttributeSetInstance(Env.getCtx(), row.getM_AttributeSetInstance_ID(), m_trx.getTrxName());
						//							if (asi.getRef_AttributeSetInstance_ID() > 0)
						//							{
						//								if (movementalloc == null)
						//								{
						//									movementalloc = new MMovement(Env.getCtx(), 0, m_trx.getTrxName());
						//									movementalloc.setDocAction(DocAction.ACTION_Close);
						//									movementalloc.setDocStatus(DocAction.STATUS_Completed);
						//									movementalloc.setDeliveryViaRule(X_C_Order.DELIVERYVIARULE_Shipper);
						//									movementalloc.setDeliveryRule(REF_C_OrderDeliveryRule.Availability);
						//									movementalloc.setIsApproved(true);
						//									movementalloc.setProcessed(true);
						//									movementalloc.save();
						//								}
						//								if (movementalloc != null)
						//								{
						//									MMovementLine line = new MMovementLine(movementalloc);
						//									line.setM_Locator_ID(row.getM_Locator_ID());
						//									line.setM_LocatorTo_ID(row.getM_Locator_ID());
						//									line.setM_Product_ID(row.getM_Product_ID());
						//									line.setMovementQty(row.getMovementQty());
						//									line.setM_AttributeSetInstance_ID(asi.getRef_AttributeSetInstance_ID());
						//									line.setProcessed(true);
						//									line.setM_AttributeSetInstanceTo_ID(asi.getM_AttributeSetInstance_ID());
						//									line.setC_UOM_ID(row.getC_UOM_ID());
						//									line.setQtyEntered(row.getQtyEntered());																								
						//									if (line.save())
						//									{
						//										MStorage storageFrom = MStorage.get(Env.getCtx(), line.getM_Locator_ID(), 
						//												line.getM_Product_ID(), line.getM_AttributeSetInstance_ID(), m_trx.getTrxName());
						//										if (storageFrom == null)
						//											storageFrom = MStorage.getCreate(Env.getCtx(), line.getM_Locator_ID(), 
						//													line.getM_Product_ID(), line.getM_AttributeSetInstance_ID(), m_trx.getTrxName());
						//										//
						//										MStorage storageTo = MStorage.get(Env.getCtx(), line.getM_LocatorTo_ID(), 
						//												line.getM_Product_ID(), line.getM_AttributeSetInstanceTo_ID(), m_trx.getTrxName());
						//										if (storageTo == null)
						//											storageTo = MStorage.getCreate(Env.getCtx(), line.getM_LocatorTo_ID(), 
						//													line.getM_Product_ID(), line.getM_AttributeSetInstanceTo_ID(), m_trx.getTrxName());
						//										//
						//										storageFrom.setQtyOnHand(storageFrom.getQtyOnHand().subtract(line.getMovementQty()));
						//										if (!storageFrom.save(trxName))
						//											throw new XendraException("NotSaveStorageFrom");									
						//										//								
						//										storageTo.setQtyOnHand(storageTo.getQtyOnHand().add(line.getMovementQty()));
						//										if (!storageTo.save(trxName))
						//											throw new XendraException("NotSaveStorageTo");
						//										asi.setRef_AttributeSetInstance_ID(0);
						//										asi.save(trxName);
						//									}
						//								}
						//							}
						//						}						
						MMovementLine movementline = new MMovementLine(movement);
						movementline.setM_Locator_ID(row.getM_Locator_ID());
						movementline.setM_LocatorTo_ID(row.getM_LocatorTo_ID());
						movementline.setM_Product_ID(row.getM_Product_ID());
						movementline.setC_UOM_ID(row.getC_UOM_ID());
						movementline.setQtyEntered(row.getQtyEntered());
						movementline.setMovementQty(row.getMovementQty());
						movementline.setM_AttributeSetInstance_ID(row.getM_AttributeSetInstance_ID());
						if (!movementline.save(trxName))
							throw new XendraException("No se pudo crear la guia");
					}
				}
				//				X_C_PDDControl pddcontrol = new X_C_PDDControl(Env.getCtx(), 0, trxName);
				//				pddcontrol.setM_Movement_ID(movement.getM_Movement_ID());
				//				//pddcontrol.setAD_LinePrinterFormat_ID(AD_LinePrinterFormat_ID);
				//				pddcontrol.setC_DocType_ID(C_DocType_ID);
				//				pddcontrol.save(trxName);
				while ( adapter.getRowCount() > 0 )
				{
					Row row = (Row) adapter.getRowObject(0);
					((DefaultObjectViewModel) view.getDataModel()).removeRow(row);								
				}
			}
			else
				throw new XendraException("No se pudo crear la guia");

			if (!m_trx.commit()) 
				throw new XendraException("No se pudo grabar la guia");
		}
		catch (Exception f) {
			m_trx.rollback();
			lok = false;
			log.log(Level.SEVERE, "Exception while in process: " + f.toString());
		}
		finally {
			m_trx.close();					
		}
		return lok;
	}
	public void actionPerformed(ActionEvent e) {
		Component c = (Component)e.getSource();
		if (c == PushButtons.get(Constants.A_SHIPPING)) {
			disableEnvironment();
			CardLayout cl = (CardLayout) (cardPanel.getLayout());
			shippingpanel.selection();
			cl.show(cardPanel, Constants.A_SHIPPING);			
		}		
	}

	/**
	 *  Dynamic Init (prepare dynamic fields)
	 *  @throws Exception if Lookups cannot be initialized
	 */
	private void init() throws Exception
	{
		int AD_Column_ID = Util.getColumnID(MMovement.Table_ID, "C_DocType_ID");        //  M_Movement.C_DocType_ID
		MLookup lookupDT = MLookupFactory.get ( Env.getCtx(), m_WindowNo, 0, AD_Column_ID, DisplayType.TableDir);
		pickDocType = new VLookup("C_DocType_ID", true, false, true, lookupDT);
		pickDocType.addVetoableChangeListener(this);
		pickWarehouse = VLookup.createWarehouse(m_WindowNo);		
		pickToWarehouse = VLookup.createWarehouse(m_WindowNo);
		//  Date set to Login Date
		movdateField = new VDate(X_M_Movement.COLUMNNAME_MovementDate, false, false, true, DisplayType.Date, "Date");
		movdateField.setValue(Env.getContextAsDate(Env.getCtx(), "#Date"));
		movdateField.addVetoableChangeListener(this);

		statusBar.setStatusLine(Msg.getMsg(Env.getCtx(), "AllocateStatus"));
		statusBar.setStatusDB(CTransferWarehouse.class.getName());
		//
		m_frame.addComponentListener(new resizeListener());

		CompiereColor.setBackground(this);

		infosearch.setHorizontalAlignment(JLabel.LEFT);
		infosearch.setForeground(Color.BLACK);
		infosearch.setFont(new java.awt.Font("Monospaced", 0, 20));

		//
		IObjetViewColumn[] columns = getColumns();

		Row[] rows = { newrow() };

		m_model = new DefaultObjectViewModel(columns, Arrays.asList(rows));
		view = new ObjectView(m_model);
		//view.setPreferredScrollableViewportSize(null);
		view.setColumnSelectionAllowed(false);
		view.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		view.configcontrols(m_WindowNo);

		//
		lkaPointOfSales = new LineKeyAdapter();
		lkaPointOfSales.setRowClass("org.xendra.transfer.Row");
		lkaPointOfSales.setContext(getFrame(), this, view, m_showdialoginfo, m_WindowNo, infosearch, m_QtyByDefault, "");
		lkaPointOfSales.funcKeyHome("HomeKey");
		lkaPointOfSales.funcKeyInsert("InsertKey");
		lkaPointOfSales.funcCalculateTotalLines("calculateTotalLines");
		lkaPointOfSales.funcShowException("ShowException");
		lkaPointOfSales.funcNewLine("NewLine");
		lkaPointOfSales.funcNextColumn("nextcolumn");
		lkaPointOfSales.funcValidationForAddLine("IsPickLocatorOk");
		lkaPointOfSales.funcAddLine("AddProduct");
		lkaPointOfSales.funcValidationForDelLine("DeleteRow");
		lkaPointOfSales.setKeys(m_model.getPosition("Key"),
				m_model.getPosition("Description"),
				m_model.getPosition("NextLine"),
				m_model.getPosition("Default"));
		//
		view.addKeyListener(lkaPointOfSales);
		view.setContext(this);
		view.funcCalculateTotalLines("calculateTotalLines");

		Action actions = new AbstractAction() {

			public void actionPerformed(ActionEvent ae) {
			}
		};

		view.getActionMap().put("KEYENTER", actions);
		view.setMakeIndex(true);

		view.getSelectionModel().addListSelectionListener(
				new ListSelectionListener() {
					public void valueChanged(ListSelectionEvent event) {
						List selection = view.getSelectedRowObjects();
						Row row = null;
						if (selection.size() > 0) {
							row = (Row) selection.get(0);
							if (row != null) {
								Env.setContext(Env.getCtx(), m_WindowNo, "M_Product_ID", row.getM_Product_ID());
							}

						}

					}
				});

		view.addMouseListener(new MouseAdapter() {

		});	    


		cardPanel = new JPanel(new CardLayout());
		AppsActions.put(Constants.T_VOID, new AppsAction(Constants.T_VOID, KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0), false));
		AppsActions.put(Constants.T_LOAD, new AppsAction(Constants.T_LOAD, KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0), false));
		AppsActions.put(Constants.T_SAVE, new AppsAction(Constants.T_SAVE, KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0), false));
		splitPanel.setContinuousLayout(true);				
		BufferedImages.put(Constants.A_SHIPPING, ImageIO.read(new File(Env.getResource("org.xendra.transfer", "shipper.png"))));
		createToolBar();
		PushButtons.put(Constants.A_SHIPPING, new PushButton(BufferedImages.get(Constants.A_SHIPPING), Constants.Complete, 
				KeyStroke.getKeyStroke(KeyEvent.VK_F10, 0),	Msg.translate(Env.getCtx(), "Shipping"), false));
		PushButtons.get(Constants.A_SHIPPING).setDelegate(this);
		buttonPanel.add(PushButtons.get(Constants.A_SHIPPING));

		HeaderPanel.setLayout(new MigLayout("","[fill]"));
		HeaderPanel.add(new CLabel(Msg.getMsg(Env.getCtx(), "Date")));
		HeaderPanel.add(movdateField);
		HeaderPanel.add(new CLabel(Msg.translate(Env.getCtx(), "C_DocType_ID")));
		HeaderPanel.add(pickDocType);
		HeaderPanel.add(new CLabel(Msg.translate(Env.getCtx(), "M_Locator_ID")));
		HeaderPanel.add(this.pickWarehouse);
		HeaderPanel.add(new CLabel(Msg.translate(Env.getCtx(), "M_LocatorTo_ID")));
		HeaderPanel.add(pickToWarehouse);
		scrollPane = new JScrollPane(cardPanel);		
		splitPanel.setRightComponent(scrollPane);
		LinePanel.setLayout(new BorderLayout());
		LineScrollPane.setViewportView(view);
		LinePanel.add(infosearch, BorderLayout.NORTH);
		LinePanel.add(LineScrollPane, BorderLayout.CENTER);				
		infoPanel.setLayout(new MigLayout("","[grow]"));
		infoPanel.add(HeaderPanel,"wrap");
		infoPanel.add(LinePanel,"growx");		
		splitPanel.setLeftComponent(infoPanel);
		String layout = "wrap 1";
		buttonPanel.setLayout(new MigLayout(layout));
		buttonPanel.setName(buttonpanel);

		shippingpanel = new ShippingPanel(this);
		shippingpanel.setName(Constants.A_SHIPPING);

		errorpanel = new ErrorPanel(this);
		errorpanel.setName(panelerror);

		cardPanel.add(buttonPanel, buttonpanel);
		cardPanel.add(shippingpanel, Constants.A_SHIPPING);		
		cardPanel.add(errorpanel, panelerror);

		JPanel ss = new JPanel(new MigLayout());		
		ss.add(this.splitPanel, "push, grow");

		m_frame.getContentPane().add(ss, BorderLayout.CENTER);
		m_frame.getContentPane().add(statusBar, BorderLayout.SOUTH);			
		m_frame.pack();
		Dimension dim = new Dimension(10,10);
		Component childs[] = buttonPanel.getComponents();
		for (Component c : childs) {
			if (c instanceof PushButton)
			{
				if ( dim.getHeight() < c.getHeight() || dim.getWidth() < c.getWidth())
				{							
					dim = c.getSize();
				}
			}
		}		
		for (Component c : childs) {
			if (c instanceof PushButton)
			{
				c.setPreferredSize(dim);
				c.setSize(dim);						
				c.validate();
			}
		}	
		double buttonsize = dim.getWidth();
		buttonspanelwidth = buttonsize + 40;			
		Dimension d = new Dimension(10,10);        		
		for (int i=0; i < cardPanel.getComponentCount(); i++)
		{
			Component c = cardPanel.getComponent(i);
			if ( d.getHeight() < c.getHeight() || d.getWidth() < c.getWidth())
				d = c.getSize();
		}
		cardpanelwidth = d.getWidth();		

	}

	public void resizetobuttonpanel()
	{
		int margin = (int) (currentwidth - buttonspanelwidth);
		splitPanel.setDividerLocation(margin);

	}
	public void resizetocardpanel()
	{
		int margin = (int) (currentwidth - cardpanelwidth);
		splitPanel.setDividerLocation(margin);		
	}

	private void showFrameError(FormFrame frame)
	{
		JPanel panel = new JPanel(new MigLayout());
		JButton launchwiz = new JButton("Launch Wizard");
		panel.add(new CLabel(error, Env.getImageIcon("BPartner10.gif"), JLabel.CENTER), "wrap");
		panel.add(launchwiz);
		frame.getContentPane().add(panel);		
	}

	private IObjetViewColumn[] getColumns() {
		ArrayList<DefaultTableViewColumn> newcolumns = new ArrayList<DefaultTableViewColumn>();
		Method getter;
		Method setter;
		try {
			getter = Row.class.getDeclaredMethod("getName", null);
			setter = null;
			newcolumns.add(new DefaultTableViewColumn
					(
							Util.cleanAmp(Msg.translate(Env.getCtx(), "Name")), null,
							(Method)   getter,(Method)   setter,true /* visible */,
							null, /* format */ 
							true, /* sortable */
							false, /* searchable */
							false, /* iskey */
							true, /* isdescription */
							false, /* nextline */
							false, /* default */ 
							false, /* is color */  
							0 /* column */, 
							0 /* reference */,
							null /* display */, null /* display */, 
							false /* overwrite */
							));
			//		 		    
			getter = Row.class.getDeclaredMethod("getQtyEntered", null);
			setter = Row.class.getDeclaredMethod("setQtyEntered", new Class[] {BigDecimal.class});
			newcolumns.add(new DefaultTableViewColumn
					(
							Msg.translate(Env.getCtx(), "QtyEntered"), null,
							(Method)   getter,(Method)   setter,true, /* visible */ 
							null, /* format */ 
							false, /* sortable */	 
							false, /* searchable */
							false, /* iskey */
							false, /* isdescription */
							false, /* nextline */
							true, /* default */ 
							false, /* is color */  
							0 /* column */, 
							0 /* reference */,
							null /* display */, null /* display */, 
							false /* overwrite */
							));
			//		 		    
			getter = Row.class.getDeclaredMethod("getMovementQty", null);
			setter = null;
			newcolumns.add(new DefaultTableViewColumn
					(
							Msg.translate(Env.getCtx(), "MovementQty"), null,
							(Method)   getter,(Method)   setter,true, /* visible */ 
							null, /* format */ 
							false, /* sortable */	 
							false, /* searchable */ 
							false, /* iskey */
							false, /* isdescription */
							false, /* nextline */
							false, /* default */ 
							false, /* is color */  
							0, /* column */ 
							0, /* reference */
							null /* display */, null /* display */, 
							false /* overwrite */
							));		    
			//
			getter = Row.class.getDeclaredMethod("getQtyAvailable", null);
			setter = null;
			newcolumns.add(new DefaultTableViewColumn
					(
							Msg.translate(Env.getCtx(), "QtyAvailable"), null,
							(Method)   getter,(Method)   setter,true, /* visible */ 
							null, /* format */ 
							false, /* sortable */	 
							false, /* searchable */ 
							false, /* iskey */
							false, /* isdescription */
							false, /* nextline */
							false, /* default */ 
							false, /* is color */  
							0, /* column */ 
							0, /* reference */
							null /* display */, null /* display */, 
							false /* overwrite */
							));		    
			//
			getter = Row.class.getDeclaredMethod("getC_UOM_ID", null);
			setter = Row.class.getDeclaredMethod("setC_UOM_ID", new Class[] {Integer.class});
			newcolumns.add(new DefaultTableViewColumn
					(
							Msg.translate(Env.getCtx(), "C_UOM_ID"), null,
							(Method)   getter, (Method)   setter,  true, /* visible */ 
							null, /* format */  
							false, /* sortable */	 
							false, /* searchable */ 
							false, /* iskey */
							false, /* isdescription */
							false, /* nextline */
							false, /* default */ 
							false, /* is color */  
							2222, /* column */ 
							0, /* reference */
							null, /* display */ null, /* display */ 
							false /* overwrite */
							));
			//		 		    
			getter = Row.class.getDeclaredMethod("getM_AttributeSetInstance_ID", null);
			setter = Row.class.getDeclaredMethod("setM_AttributeSetInstance_ID", new Class[] {Integer.class});
			newcolumns.add(new DefaultTableViewColumn
					(
							Msg.translate(Env.getCtx(), "M_AttributeSetInstance_ID"), null,
							(Method)   getter, (Method)   setter, true /* visible */, 
							null /* format */ , 
							false /* sortable */	, 
							false /* searchable */, 
							false, /* iskey */
							false, /* isdescription */
							true, /* nextline */
							false, /* default */ 
							false, /* is color */  
							8767, /* column */ 
							35, /* reference */
							null, /* display */ null, /* display */
							false /* overwrite */
							));		    		    
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		IObjetViewColumn[] columns = new IObjetViewColumn[newcolumns.size ()];
		newcolumns.toArray(columns);
		return columns;		  
	}

	private Row newrow() {
		return new Row();
	}

	/**
	 *  Static Init
	 *  @throws Exception
	 */

	public FormFrame getFrame() {
		return m_frame;
	}


	//	private void refreshView() {
	//
	//	}            
	//
	//	private void saveData()
	//	{
	//	}

	//	private void checkChanged(List selection, Row row) {
	//		if ( row.IsChanged() )
	//		{
	//			calculateTotalLines();
	//			row.setIsChanged(false);
	//		}
	//		else
	//		{
	//			if (row.getM_processMsg() != null )
	//			{
	//				ADialog.error(m_WindowNo, null, "PosError", Msg.getMsg(Env.getCtx(),row.getM_processMsg()));
	//				row.setM_processMsg(null);
	//			}
	//		}			        		
	//		//
	//		if (selection.size() > 0)
	//		{
	//			row = (Row) selection.get(0);			        		
	//			if ( row.IsChanged() )
	//			{
	//				calculateTotalLines();
	//				row.setIsChanged(false);
	//			}
	//			else
	//			{
	//				if (row.getM_processMsg() != null )
	//				{
	//					ADialog.error(m_WindowNo, null, "PosError", Msg.getMsg(Env.getCtx(),row.getM_processMsg()));
	//					row.setM_processMsg(null);
	//				}
	//			}			        		
	//		}			        				        							
	//	}

	//	/**************************************************************************
	//	 *  Tab Changed
	//	 *  @param e ChangeEvent
	//	 */	
	//	public void stateChanged(ChangeEvent e)
	//	{
	//		if (tabbedPane.getSelectedIndex() == 1)   //  allow access to help
	//		{
	//			//setHistory();								
	//		}
	//	}   //  stateChanged

	//	public void setHistory()
	//	{
	//	}

	private void AddLine()
	{
		Row newrow = new Row();
		((DefaultObjectViewModel) view.getDataModel()).addRow(newrow);
		int LastRow = view.getRowCount() - 1;
		Rectangle rect = view.getVisibleRect();
		Rectangle cRect = view.getCellRect(LastRow, 0, true);
		rect.y = cRect.y;
		rect.height = cRect.height;
		view.scrollRectToVisible(rect);
		view.changeSelection(LastRow, 0, false, false);
		view.getTableHeader().repaint();
		view.repaint();		
	}


	public VCellRenderer getRender(int AD_Column_ID) {		
		String sql = "select * from ad_field_v where ad_column_id =?;";
		VCellRenderer render;
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql, null);
			pstmt.setInt(1, AD_Column_ID);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				vo = GridFieldVO.create (Env.getCtx(), m_WindowNo, 0, 0, 0, false, rs);
				vo.IsAlwaysUpdateable = true;
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql, e);
		}		
		field = new GridField (vo);
		render = new VCellRenderer (field);
		return render;
	}
	public boolean candispose() {
		return true;
	}	

	public void HomeKey() {
		DialogInputID dialog = new DialogInputID(getFrame(), view);
		dialog.pack();
		dialog.setLocationRelativeTo(getFrame());
		dialog.setVisible(true);
		if (dialog.getFoundRow() > 0) {
			int found = dialog.getFoundRow();
			view.setRowSelectionInterval(found - 1, found - 1);
			int mDefault = ((DefaultObjectViewModel) view.getDataModel())
					.getPosition("Default");
			view.setColumnSelectionInterval(mDefault, mDefault);
		}
		view.requestFocus();
	}

	public void InsertKey() {
		DialogInputQty dialog = new DialogInputQty(getFrame());
		dialog.pack();
		dialog.setLocationRelativeTo(getFrame());
		dialog.setVisible(true);
		m_QtyBySelection = dialog.getQtyEntered();
		view.requestFocus();
	}

	public synchronized void calculateTotalLines() {
		view.revalidate();
	}

	public void ShowException(Row row) {
		if (m_showdialoginfo)
			//ADialog.error(m_WindowNo, null, "PosError", Msg.getMsg(Env.getCtx(), row.getM_processMsg()));
			showErrorPanel(Msg.getMsg(Env.getCtx(), row.getM_processMsg()));
		row.setM_processMsg(null);
	}
	public void showErrorPanel(String m_processMsg) {
		//disableEnvironment();			
		String prevcard = "";
		for (Component comp : cardPanel.getComponents()) {
			if (comp.isVisible() == true) {
				prevcard = comp.getName();		        
				break;
			}
		}		
		if (!prevcard.equals(panelerror))
		{
			CardLayout cl = (CardLayout) (cardPanel.getLayout());		
			cl.show(cardPanel, "errorpanel");
		}		
		errorpanel.setMessage(m_processMsg, prevcard);		
		errorpanel.selection();					
	}

	public void NewLine(Row row) {
		Boolean lContinue = false;
		if (row != null)
		{
			if (row.getQtyEntered().compareTo(Env.ZERO) > 0)
				lContinue = true;
		}
		else
			lContinue = true;
		if (lContinue)
		{
			if ( view.getCellEditor() != null )
				view.getCellEditor().stopCellEditing();					
			AddLine();
		}
	}

	public void nextcolumn() {
		int nextColumn = lkaPointOfSales.getSelectedColumn() + 1;
		if (nextColumn > view.getColumnCount())
			nextColumn = 0;
		nextcolumn(nextColumn);
	}

	public void nextcolumn(int i) {
		int nextColumn = i;
		Rectangle rect = view.getVisibleRect();
		Rectangle cRect = view.getCellRect(lkaPointOfSales.getSelectedRow(), nextColumn, true);
		rect.y = cRect.y;
		rect.height = cRect.height;
		view.scrollRectToVisible(rect);
		view.changeSelection(lkaPointOfSales.getSelectedRow(), nextColumn,	false, false);
	}

	public boolean DeleteRow() {
		Boolean lok = false;
		Row SelectedRow = (Row) view.getSelectedRowObject();
		((DefaultObjectViewModel) view.getDataModel()).removeRow(SelectedRow);
		lok = true;
		return lok;
	}

	public boolean IsPickLocatorOk() {
		if ( this.pickWarehouse.getValue() != null && 
				pickToWarehouse.getValue() != null && 
				pickDocType.getValue() != null )
			return true;
		else if ( pickWarehouse.getValue() == null || pickToWarehouse.getValue() == null )
			ADialog.info(m_WindowNo, m_frame , "Debe seleccionar un origen y destino para el traslado");
		else if (pickDocType.getValue() == null)
			ADialog.info(m_WindowNo, m_frame, "Debe seleccionar un tipo de documento");
		return false;
	}

	@Override
	public void AddProductEvent(RowBase row) {
		// TODO Auto-generated method stub

	}

	@Override
	public void activecard(String m_prevcard) {
		CardLayout cl = (CardLayout) (cardPanel.getLayout());		
		cl.show(cardPanel, m_prevcard);			
		for (Component comp : cardPanel.getComponents()) {
			if (comp.isVisible() == true) {
				if (comp.getName().equals(buttonpanel))
				{

				}
				else		    			
					((ICardPanel) comp).selection();		        
				break;
			}
		}				
	}

	@Override
	public void enableEnvironment() {
		resizetobuttonpanel();		
		getView().setEnabled(true);
		getView().requestFocusInWindow();		
	}

	@Override
	public void disableEnvironment() {
		resizetocardpanel();
		getView().setEnabled(false);
	}

	@Override
	public void setStatusLine(String msg, boolean error) {
		// TODO Auto-generated method stub

	}

	public ObjectView getView() {
		return view;
	}

	private class resizeListener extends ComponentAdapter {
		public void componentResized(ComponentEvent e) {
			currentwidth = e.getComponent().getWidth();
			if (getView().isEnabled())
			{
				resizetobuttonpanel();
			}
			else
			{
				resizetocardpanel();
			}
		}
	}	

	private void reset() {
		InitializePO();
		CardLayout cl = (CardLayout) (cardPanel.getLayout());
		cl.show(cardPanel, buttonpanel);
		enableEnvironment();
		cleanlines();
		NewLine(null);		
	}	

	private void cleanlines() {
		view.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		view.selectAll();			
		List selection = view.getSelectedRowObjects();
		view.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		m_model.removeRows(selection);		
	}

	private void InitializePO() {
		MMaterialPolicy mm = new Query(Env.getCtx(), MMaterialPolicy.Table_Name, "AD_Client_ID = ?", null)
		.setParameters(MClient.get(Env.getCtx()).getAD_Client_ID()).first();
		if (mm != null) {
			String entrypoint = Env.getSessionEntrypoints(mm.getTransferenceRule_ID());
			String agenda = Env.getAgenda(mm.getTransferenceRule_ID());
			executerules(entrypoint, agenda);			
			MMovement mov = new MMovement(Env.getCtx(), 0, null);
			updatePO(mov, "movement");
			updatePO(new MBPartner(Env.getCtx(), 0, null), "partner");
			executerules(entrypoint, "partner");
			updatePO(MUser.get(Env.getCtx(), Env.getAD_User_ID(Env.getCtx())), "user");
			executerules(entrypoint, "user");
			updateView();
		}
	}

	public MMovement getMovement()
	{
		MMovement movement = (MMovement) getPO(MMovement.Table_Name);
		return movement;
	}

	public String getDeliveryViaRule() {
		MMovement m = getMovement();
		return m.getDeliveryViaRule();		
	}

	public String getPriorityRule() {
		MMovement m = getMovement();
		return m.getPriorityRule();
	}

	public String getDeliveryRule() {
		MMovement m = getMovement();
		return m.getDeliveryRule();
	}

	public PO getPO(String poname) {
		PO retval = null;
		if (businessobjects.containsKey(poname))
			retval = businessobjects.get(poname);
		return retval;
	}

	public void updatePO(PO po) {
		if (po == null)
			return;
		businessobjects.put(po.get_TableName(), po);
		List<String> panels = this.getObservers(po.get_TableName());
		for (String panel:panels)
		{
			po.addObserver(CardPanels.get(panel));
		}
		po.addObserver(this);
		if (FactHandlers.containsKey(po.get_TableName()))
		{
			FactHandle fh = FactHandlers.get(po.get_TableName());
			ksession.update(fh, po);
		}
		else
		{
			FactHandle fh = ksession.insert(po);
			FactHandlers.put(po.get_TableName(), fh);
		}		
	}


	private void updateView() {
		if (view == null)
			return;
		if (!boagenda.containsKey("view"))			
			boagenda.put("view","view");				
		if (FactHandlers.containsKey("view")) 
		{
			FactHandle fh = FactHandlers.get("view");
			ksession.update(fh, view);
		}
		else
		{
			FactHandle fh = ksession.insert(view);
			FactHandlers.put("view", fh);
		}				
	}
	private void executeView() {
		String agenda = (String) boagenda.get("view");
		if (agenda != null)
		{
			ksession.getAgenda().getAgendaGroup(agenda).setFocus();
			ksession.fireAllRules();
		}
	}	
	private void updatePO(PO po, String agenda) {
		businessobjects.put(po.get_TableName(), po);
		List<String> panels = this.getObservers(po.get_TableName());
		for (String panel:panels)
		{
			po.addObserver(CardPanels.get(panel));
		}		
		po.addObserver(this);
		if (!boagenda.containsKey(po.get_TableName()))			
			boagenda.put(po.get_TableName(),agenda);				
		if (FactHandlers.containsKey(po.get_TableName()))
		{
			FactHandle fh = FactHandlers.get(po.get_TableName());
			ksession.update(fh, po);
		}
		else
		{
			FactHandle fh = ksession.insert(po);
			FactHandlers.put(po.get_TableName(), fh);
		}		
	}

	private void registerObserver(String tableName, String CardName) {
		List<String> panels = observers.get(tableName);
		if (panels == null)
		{
			panels = new ArrayList<String>();
		}
		if (!panels.contains(CardName))
			panels.add(CardName);			
		observers.put(tableName, panels);
	}	
	private List<String> getObservers(String tableName)
	{
		List<String> panels = observers.get(tableName);
		if (panels == null)
			panels = new ArrayList<String>();
		return panels;
	}	
	public void execute(PO po) {
		updatePO(po);
		String agenda = (String) boagenda.get(po.get_TableName());
		if (agenda != null)
		{
			ksession.getAgenda().getAgendaGroup(agenda).setFocus();
			ksession.fireAllRules();
		}
	}

	public void executerules(String entrypoint, String agenda) {
		if (agenda != null)
		{
			ksession.getAgenda().getAgendaGroup( agenda ).setFocus();
		}
		if (entrypoint != null)
		{

		}
		ksession.fireAllRules();
	}
	public void updateRule(SimpleRule rule, String agenda) {
		if (!boagenda.containsKey(agenda))
			boagenda.put(rule.getName(), agenda);
		if (FactHandlers.containsKey(rule.getName()))
		{
			FactHandle fh = FactHandlers.get(rule.getName());
			ksession.update(fh, rule);
		}
		else
		{
			FactHandle fh = ksession.insert(rule);
			FactHandlers.put(rule.getName(), fh);
		}		
	}

	public void updateRow(Row row) {
		if (FactHandlers.containsKey(row.getIdentifier()))
		{
			FactHandle fh = FactHandlers.get(row.getIdentifier());
			ksession.update(fh, row);
		}
		else
		{
			FactHandle fh = ksession.insert(row);
			FactHandlers.put(row.getIdentifier(), fh);
		}
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub

	}

	public String initialize() {
		System.out.println("inicializando transfer");		
		try {
			error = startknowledge();
			if (error.length() > 0)
				throw new Exception(error);
			error = TestQueue();			
		} catch (Exception e) {
			e.printStackTrace();
			error = e.getMessage();
		}
		return error;
	}

	private String TestQueue() {
		X_A_Machine transference = Env.getMessageHost();
		if (transference != null)
		{
			String host = transference.getName();
			error = EmbeddedMessageServer.getInstance().Test(host, Constants.QTRANSFERQUEUE);
		}				
		else
		{
			error  = "no transference server found";
		}
		return error;
	}

	private String startknowledge() {
		MMaterialPolicy mm = new Query(Env.getCtx(), MMaterialPolicy.Table_Name, "AD_Client_ID = ?", null)
			.setParameters(MClient.get(Env.getCtx()).getAD_Client_ID()).first();
		if (mm.getTransferenceRule_ID() > 0)
		{
			X_AD_Rule startrule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ?", null).setParameters(mm.getTransferenceRule_ID()).first();
			if (startrule == null)
			{
				error = "Main Rule not found";
			}
			else
			{
				KieBase kb = Env.startRule(mm.getTransferenceRule_ID(), true);
				if (kb != null)
				{
					ksession = kb.newKieSession();
					ksession.addEventListener(new DebugRuleRuntimeEventListener());					
					ksession.setGlobal("ctx", Env.getCtx());					
					ksession.insert(this);
					InitializePO();
				}
				else
				{
					error = Env.getKieError(mm.getTransferenceRule_ID());
				}
			}
		}
		else
		{
			error = "no se definio que regla usar";
		}
		return error;
	}

	protected void createToolBar() {
		final JToolBar bar = new JToolBar();
		toolbarbuttons.put(Constants.T_VOID, AEnv.createActionButton(AppsActions.get(Constants.T_VOID), null, "New24",	"Nuevo documento"));		
		toolbarbuttons.get(Constants.T_VOID).addActionListener(this);
		bar.add(toolbarbuttons.get(Constants.T_VOID));

		toolbarbuttons.put(Constants.T_LOAD, AEnv.createActionButton(AppsActions.get(Constants.T_LOAD), null, "Open24",	"Cargar documento"));
		toolbarbuttons.get(Constants.T_LOAD).addActionListener(this);
		bar.add(toolbarbuttons.get(Constants.T_LOAD));

		toolbarbuttons.put(Constants.T_SAVE, AEnv.createActionButton(AppsActions.get(Constants.T_SAVE), null, "document-save","Grabar documento"));
		toolbarbuttons.get(Constants.T_SAVE).addActionListener(this);
		bar.add(toolbarbuttons.get(Constants.T_SAVE));
		X_A_Machine machine = Env.getMessageHost();
		if (machine != null)
		{
			String host = machine.getName(); 
			lconexion.setText(String.format("jnp://%s:%s", host, Util.getAppsPort()));
		}

		bar.addSeparator(new Dimension(5, 0));
		bar.add(lconexion);
		//
		Component box = Box.createHorizontalGlue();
		bar.add(box);
		getFrame().getContentPane().add(BorderLayout.NORTH, bar);
	}

	@Override
	public void vetoableChange(PropertyChangeEvent e)
			throws PropertyVetoException {
		if (e.getPropertyName().equals(X_C_DocType.COLUMNNAME_C_DocType_ID))
		{			
			MMovement mov = getMovement();			
			mov.setC_DocType_ID((int) e.getNewValue());
			//execute(mov);						
			updatePO(mov);
		}
		else if (e.getPropertyName().equals(X_M_Movement.COLUMNNAME_MovementDate))
		{
			MMovement mov = getMovement();
			mov.setMovementDate((Timestamp) e.getNewValue());
			//execute(mov);
			updatePO(mov);
		}
	}

	public String process() throws IOException {		
		beforetransaction();
		if (getError().length() == 0) {
			transaction();
			if (getError().length() > 0) {
				if (m_showdialoginfo)
					showErrorPanel(getError());
			} else {
				Void();				
			}
		}
		else
		{
			showErrorPanel(getError());
		}
		return getError();
	}

	private void beforetransaction() {
		ksession.insert(this);
		//		MMovement movement = getMovement();
		//		execute(movement);
		updateView();
		executeView();				
		//		updatePO(view, "user");
		//		String error = "";
		//		ObjectViewModel adapter = view.getDataModel();
		//		for (int j=0; j <  view.getRowCount() ; j++)
		//		{
		//			Row row = (Row) adapter.getRowObject(j);
		//			if (row.getQtyAvailable().compareTo(row.getMovementQty()) < 0)
		//			{				
		//				if (error.length() == 0)
		//					error += "No stock ";
		//				error += String.format(" %s ", row.getName());								
		//			}			
		//			if (!row.IsAttributeOK())
		//			{
		//				checkintegrity = false;
		//				ADialog.info(m_WindowNo, m_frame, "falta lote ".concat(row.getName()));
		//				break;
		//			}
		//		}	
		//		MDocType dt = MDocType.get(Env.getCtx(), (Integer) pickDocType.getValue());
		//		if (dt.getAD_PosPrintFormat_ID() == 0)
		//		{
		//		//	ADialog.info(m_WindowNo, m_frame, "el tipo de documento no contiene formato de impresion");
		//		//	checkintegrity = false;
		//		}
		return;
	}

	//	private void createXml(transaction transaction) throws UnsupportedOperationException {
	//        JAXBContext jContext;
	//        try {
	//            jContext = JAXBContext.newInstance(transaction.class);
	//        } catch (JAXBException e) {
	//            throw new UnsupportedOperationException("Can't create JAXB", e);
	//        }
	//        Marshaller marshaller;
	//        try {
	//            marshaller = jContext.createMarshaller();
	//            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	//            marshaller.marshal(transaction, System.out);
	//        } catch (Exception e) {
	//            Logger.getLogger(CTransferWarehouse.class.getName()).warning("Can't create JAXB Marshaller " + e.getMessage());
	//        }
	//    }

	private void compile() {
		MDocType doctype = MDocType.get(Env.getCtx(), (Integer) pickDocType.getValue());		
		X_AD_MessageFormat format = new Query(Env.getCtx(), X_AD_MessageFormat.Table_Name, "AD_MessageFormat_ID = ?", null)
		.setParameters(doctype.getAD_MessageFormat_ID()).first();
		if (format == null) {
			String error = String.format("format not defined for %s", doctype.getName());
			setError(error);
		}
		MMovement m = getMovement();
		m.setC_DocType_ID(doctype.getC_DocType_ID());		
		this.updatePO(m);
	}

	private void transaction() throws IOException
	{		
		try {
			//s = new message();
			Properties props = new Properties();
			List<Row> rows = new ArrayList<Row>();
			ObjectViewModel adapter = view.getDataModel();
			for (int line=0;line < adapter.getRowCount(); line++)				
			{
				Row row = (Row) adapter.getRowObject(line);
				rows.add(row);			
			}
			//		transaction trx = new transaction();
			//		trx.setMovemen(this.getMovement());
			//		trx.setMovementLine(rows);
			//		createXml(trx);		
			//		props.put("rows", rows);		
			//		error = s.create(props);
			compile();
			if (error.length() != 0)
				throw new Exception(error);
			error = SendMessage();
			if (error.length() > 0)
				throw new Exception(error);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	private String processMessage()  throws IOException {
		MDocType doctype = MDocType.get(Env.getCtx(), (Integer) pickDocType.getValue());
		X_AD_MessageFormat format = new Query(Env.getCtx(), X_AD_MessageFormat.Table_Name, "AD_MessageFormat_ID = ?", null)
		.setParameters(doctype.getAD_MessageFormat_ID()).first();

		Map<String, Object> valueMap = new HashMap<String, Object>();
		//FormatMessage s = new FormatMessage(Constants.TRANSFERMESSAGE);		
		List<Row> rows = new ArrayList<Row>();
		ObjectViewModel adapter = view.getDataModel();
		for (int line=0;line < adapter.getRowCount(); line++)				
		{
			Row row = (Row) adapter.getRowObject(line);
			rows.add(row);			
		}
		List<MMovementLine> mlines = new ArrayList<MMovementLine>();
		for (Row row:rows)
		{
			MMovementLine ml = new MMovementLine(Env.getCtx(), 0, null);
			ml.setM_Product_ID(row.getM_Product_ID());    
			ml.setC_UOM_ID(row.getC_UOM_ID());
			ml.setMovementQty(row.getMovementQty());
			ml.setM_Locator_ID(row.getM_Locator_ID());
			ml.setM_LocatorTo_ID(row.getM_LocatorTo_ID());
			ml.setQtyEntered(row.getQtyEntered());
			mlines.add(ml);    		
		}
		MMovementLine[] lines = new MMovementLine[mlines.size()];
		mlines.toArray(lines);    			
		valueMap.put("header", getMovement());
		valueMap.put("lines", lines);
		valueMap.put("doc", new MessageFactory());
		String sOut = MessageFactory.readTemplate(format, valueMap);
		return sOut;		
	}

	private String getMessage() {
		return "test";
	}

	private String SendMessage() 
	{
		try {			
			//String message = s.getMessage();
			QueueConnectionFactory cf = null;			
			X_A_Machine machine = Env.getMessageHost();
			String host = machine.getName();
			//String host = Env.getContext(Env.getCtx(), "#HostMessenger");
			queue = (Queue) CConnection.get().lookup(host , Constants.QTRANSFERQUEUE);
			cf = (QueueConnectionFactory) CConnection.get().lookup(	host, Constants.QConnectionFactory);
			QueueConnection connection = cf.createQueueConnection();
			connection.start();
			QueueSession session = connection.createQueueSession(false,	Session.AUTO_ACKNOWLEDGE);
			coreSession = ((HornetQSession) session).getCoreSession();
			coreSession.setSendAcknowledgementHandler(this);
			//ledJMSServer.setState(LED.GREEN);
			//			String id = (String) s.getProperty(Constants.HEADER, Constants.ID);
			String error = processMessage();
			if (error.length() > 0)
				throw new Exception (error);
			TextMessage request = session.createTextMessage(getMessage());
			//request.setStringProperty(org.hornetq.core.message.impl.MessageImpl.HDR_DUPLICATE_DETECTION_ID.toString(), id);
			//request.setStringProperty("type", "pos");
			MMovement m = getMovement();
			m.setIdentifier(Util.getUUID());
			updatePO(m);
			request.setStringProperty(X_A_Xendrian_Message.COLUMNNAME_Identifier, getMovement().getIdentifier());
			//request.setStringProperty("replicationtype", "L");
			MessageProducer sender = null;
			sender = session.createProducer(queue);
			sender.send(request);
			connection.close();
		} catch (Exception e) {
			error = e.getMessage();
		}
		return error;
	}

	public void Void() {
		reset();
		if (view.getRowCount() == 0)
			AddLine();

		int mDefault = ((DefaultObjectViewModel) view.getDataModel())
				.getPosition("Default");
		view.setRowSelectionInterval(0, 0);
		view.setColumnSelectionInterval(mDefault, mDefault);
		view.requestFocus();
	}	

	public String getError() {
		return error;
	}

	public void setError(String merror) {
		error = merror;
	}

	@Override
	public void sendAcknowledged(Message arg0) {
		// TODO Auto-generated method stub

	}

}
